package com.example.SCM.Project.Forms;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class userInfo {
    @NotEmpty(message = "Name cannot be null")
    private String name;
    @Email(message = "Email is not valid")
    @NotEmpty(message = "Email cannot be null")
    private String email;
    @NotEmpty(message = "Password cannot be null")
    private String password;
    @NotEmpty(message = "About cannot be null")
    private String about;
}
