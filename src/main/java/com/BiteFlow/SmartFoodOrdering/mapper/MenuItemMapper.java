package com.BiteFlow.SmartFoodOrdering.mapper;

import com.BiteFlow.SmartFoodOrdering.dto.CreateDTO.MenuItemCreateDTO;
import com.BiteFlow.SmartFoodOrdering.dto.ResponseDTO.MenuItemDTO;
import com.BiteFlow.SmartFoodOrdering.dto.SummaryDTO.MenuItemSummaryDTO;
import com.BiteFlow.SmartFoodOrdering.dto.SummaryDTO.RestaurantSummaryDTO;
import com.BiteFlow.SmartFoodOrdering.dto.UpdateDTO.MenuItemUpdateDTO;
import com.BiteFlow.SmartFoodOrdering.enums.MenuItemsStatus;
import com.BiteFlow.SmartFoodOrdering.model.MenuItem;
import org.springframework.stereotype.Component;

@Component
public class MenuItemMapper {

    public MenuItem toEntity(MenuItemCreateDTO dto) {
        MenuItem item = new MenuItem();
        item.setName(dto.getName());
        item.setDescription(dto.getDescription());
        item.setPrice(dto.getPrice());
        item.setDiscountedPrice(dto.getDiscountedPrice());
        item.setCategory(dto.getCategory());
        item.setVeg(dto.isVeg());
        item.setCalories(dto.getCalories());
        item.setImageURL(dto.getImageURL());
        item.setAvailable(true);
        item.setStatus(MenuItemsStatus.AVAILABLE);
        return item;
    }

    public void updateEntity(MenuItem item, MenuItemUpdateDTO dto) {
        if (dto.getName() != null) item.setName(dto.getName());
        if (dto.getDescription() != null) item.setDescription(dto.getDescription());
        if (dto.getPrice() != null) item.setPrice(dto.getPrice());
        if (dto.getDiscountedPrice() != null) item.setDiscountedPrice(dto.getDiscountedPrice());
        if (dto.getCategory() != null) item.setCategory(dto.getCategory());
        item.setVeg(dto.isVeg());
        if (dto.getCalories() != null) item.setCalories(dto.getCalories());
        if (dto.getImageURL() != null) item.setImageURL(dto.getImageURL());
        item.setAvailable(dto.isAvailable());
        if (dto.getStatus() != null) item.setStatus(dto.getStatus());
    }

    public MenuItemDTO toResponse(MenuItem item, RestaurantSummaryDTO restaurant) {

        MenuItemDTO dto = new MenuItemDTO();
        dto.setId(item.getId());
        dto.setName(item.getName());
        dto.setDescription(item.getDescription());
        dto.setPrice(item.getPrice());
        dto.setDiscountedPrice(item.getDiscountedPrice());
        dto.setCategory(item.getCategory());
        dto.setVeg(item.isVeg());
        dto.setCalories(item.getCalories());
        dto.setImageURL(item.getImageURL());
        dto.setAvailable(item.isAvailable());
        dto.setStatus(item.getStatus());
        dto.setRating(item.getRating());
        dto.setRestaurant(restaurant);

        return dto;
    }

    public MenuItemSummaryDTO toSummary(MenuItem item) {
        return new MenuItemSummaryDTO(
                item.getId(),
                item.getName(),
                item.getPrice(),
                item.isAvailable()
        );
    }
}

