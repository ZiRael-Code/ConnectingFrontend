package com.example.ConnectingFrontEnd.ConnectingFrontEnd.dtos.request;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EmailRequest {
    private String email;
    private String username;
}
