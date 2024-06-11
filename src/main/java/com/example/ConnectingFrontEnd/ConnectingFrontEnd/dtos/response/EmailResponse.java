package com.example.ConnectingFrontEnd.ConnectingFrontEnd.dtos.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

@Data
@AllArgsConstructor
public class EmailResponse {
    private String message;
    private boolean isSuccess;
}
