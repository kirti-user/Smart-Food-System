package com.BiteFlow.SmartFoodOrdering.dto.UpdateDTO;

import com.BiteFlow.SmartFoodOrdering.enums.UserStatus;
import lombok.Data;

@Data
public class UserUpdateDTO {
    private String fullName;
    private String phoneNumber;
    private String address;
    private String profileImage;
    private UserStatus status;  // optional: only admins can update status
}
