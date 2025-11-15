package com.BiteFlow.SmartFoodOrdering.dto.SummaryDTO;

import com.BiteFlow.SmartFoodOrdering.enums.UserRole;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserSummaryDTO {
    private Long id;
    private String fullName;
    private String email;
    private UserRole role;
}
