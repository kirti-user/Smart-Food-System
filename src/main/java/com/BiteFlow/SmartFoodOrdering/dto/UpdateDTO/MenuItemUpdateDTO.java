package com.BiteFlow.SmartFoodOrdering.dto.UpdateDTO;

import com.BiteFlow.SmartFoodOrdering.enums.MenuItemsStatus;
import lombok.Data;

@Data
public class MenuItemUpdateDTO {

    private String name;
    private String description;
    private Double price;
    private Double discountedPrice;
    private String category;
    private boolean veg;
    private Integer calories;
    private String imageURL;
    private boolean available;
    private MenuItemsStatus status;

}
