// const b = document.getElementById('#cl');
window.addEventListener('click', async function (e) {
    e.preventDefault()
    if (e.target.textContent === 'Submit') {
        try {
            const response = await fetch("http://localhost:8080/process", {
                method: "POST",
                headers: {
                    "Content-Type": "application/json",
                },
                body: JSON.stringify({
                    'username': 'userName',
                })
            });

            const result = await response.json();
            console.log("Success:", result);
        } catch (error) {
            console.error("Error:", error);
        }
    }
});


// const options = {method: 'GET', headers: {accept: 'application/json'}};

// fetch('https://api.themoviedb.org/3/authentication', options)
//     .then(response => response.json())
//     .then(response => console.log(response))
//     .catch(err => console.error(err));


// b.addEventListener('click', async function (e) {


// topper
// window.addEventListener('click', function (e) {
//     e.preventDefault()
// if (e.target.textContent === 'Submit') {
//     const name = document.getElementById("name").value;
//     const email = document.getElementById("email").value;

    // from chat ost

//     fetch('http://localhost:8080/process', {
//         method: 'GET',
//         headers: {
//             'Content-Type': 'application/json'
//         }
//     })
//         .then(response => {
//             if (!response.ok) {
//                 alert('Network response was not ok' + response.toString());
//             }
//             return response.json();
//         })
//         .then(data => {
//             alert("Signup Successful " + data);
//         })
//         .catch(error => {
//             console.error('Error:', error.toString());
//         });
// }
// })


//from docs

// submitForm()
// async function postJSON(data) {
// //         try {
// //             const response= await fetch("https://example.com/profile", {
// //                 method: "POST", // or 'PUT'
// //                 headers: {
// //                     "Content-Type": "application/json",
// //                 },
// //                 body: JSON.stringify(data),
// //             });
// //
// //             const result = await response.json();
// //             console.log("Success:", result);
// //         } catch (error) {
// //             console.error("Error:", error);
// //         }
// //     }
// //
// //     const data = {username: "example"};
// //     postJSON(data).then(r => "success");
// // })