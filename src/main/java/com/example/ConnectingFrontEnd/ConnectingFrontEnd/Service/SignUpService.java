package com.example.ConnectingFrontEnd.ConnectingFrontEnd.Service;

import com.example.ConnectingFrontEnd.ConnectingFrontEnd.FormData;
import com.example.ConnectingFrontEnd.ConnectingFrontEnd.dtos.response.EmailResponse;


public interface SignUpService {
    EmailResponse Signup(FormData formData);

}
