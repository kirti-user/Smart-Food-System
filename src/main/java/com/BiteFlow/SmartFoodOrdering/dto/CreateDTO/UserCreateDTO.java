package com.BiteFlow.SmartFoodOrdering.dto.CreateDTO;

import com.BiteFlow.SmartFoodOrdering.enums.UserRole;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class UserCreateDTO {

    @NotBlank
    private String fullName;

    @Email
    @NotBlank
    private String email;

    @NotBlank
    private String password;
    private String phoneNumber;
    private String address;

    private UserRole role;

}
