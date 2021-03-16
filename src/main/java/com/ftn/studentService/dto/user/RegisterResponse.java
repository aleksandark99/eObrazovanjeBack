package com.ftn.studentService.dto.user;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class RegisterResponse {

    private String message;
    private boolean error;
    private int code;
}
