package com.example.ConnectingFrontEnd.ConnectingFrontEnd;
import com.example.ConnectingFrontEnd.ConnectingFrontEnd.Service.SignUpService;
import com.example.ConnectingFrontEnd.ConnectingFrontEnd.dtos.response.EmailResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/process")
public class BackendController {
    @Autowired
    private SignUpService sign;

    @GetMapping("/login")
    public String processFormData() {
        return "{\"status\": \"success\", \"message\": \"Data received successfully!\"}";
    }

    @PostMapping("/signUp")
    public ResponseEntity<?> postData(@RequestBody FormData formData) {
        try {
            EmailResponse emailResponse = sign.Signup(formData);
            return ResponseEntity.ok().body(emailResponse);
        }catch (Exception e){
            return ResponseEntity.ok().body(e.getMessage());
        }
    }

    @PostMapping("/emailSender")
    public ResponseEntity<String> sendEmail(@RequestBody SendEmail sendEmail){
        try {
//            sign.senderEmail(sendEmail);
            return ResponseEntity.ok().body("Email Sent ");
        }catch (Exception e){
            return ResponseEntity.ok().body(e.getMessage());
        }
    }
}
