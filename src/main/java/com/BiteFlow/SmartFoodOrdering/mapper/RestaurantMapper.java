package com.BiteFlow.SmartFoodOrdering.mapper;

import com.BiteFlow.SmartFoodOrdering.dto.CreateDTO.RestaurantCreateDTO;
import com.BiteFlow.SmartFoodOrdering.dto.ResponseDTO.RestaurantDTO;
import com.BiteFlow.SmartFoodOrdering.dto.SummaryDTO.MenuItemSummaryDTO;
import com.BiteFlow.SmartFoodOrdering.dto.SummaryDTO.RestaurantSummaryDTO;
import com.BiteFlow.SmartFoodOrdering.dto.SummaryDTO.UserSummaryDTO;
import com.BiteFlow.SmartFoodOrdering.dto.UpdateDTO.RestaurantUpdateDTO;
import com.BiteFlow.SmartFoodOrdering.enums.RestaurantStatus;
import com.BiteFlow.SmartFoodOrdering.model.Restaurant;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RestaurantMapper {

    public Restaurant toEntity(RestaurantCreateDTO dto) {
        Restaurant r = new Restaurant();
        r.setName(dto.getName());
        r.setDescription(dto.getDescription());
        r.setAddress(dto.getAddress());
        r.setContactNumber(dto.getContactNumber());
        r.setOpenTime(dto.getOpenTime());
        r.setCloseTime(dto.getCloseTime());
        r.setCategory(dto.getCategory());
        r.setImageURL(dto.getImageURL());
        r.setStatus(RestaurantStatus.OPEN);
        return r;
    }

    public void updateEntity(Restaurant restaurant, RestaurantUpdateDTO dto) {
        if (dto.getName() != null) restaurant.setName(dto.getName());
        if (dto.getDescription() != null) restaurant.setDescription(dto.getDescription());
        if (dto.getAddress() != null) restaurant.setAddress(dto.getAddress());
        if (dto.getContactNumber() != null) restaurant.setContactNumber(dto.getContactNumber());
        if (dto.getOpenTime() != null) restaurant.setOpenTime(dto.getOpenTime());
        if (dto.getCloseTime() != null) restaurant.setCloseTime(dto.getCloseTime());
        if (dto.getStatus() != null) restaurant.setStatus(dto.getStatus());
        if (dto.getImageURL() != null) restaurant.setImageURL(dto.getImageURL());
    }

    public RestaurantDTO toResponse(Restaurant entity,
                                    UserSummaryDTO owner,
                                    List<MenuItemSummaryDTO> menuItems) {

        RestaurantDTO dto = new RestaurantDTO();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setDescription(entity.getDescription());
        dto.setAddress(entity.getAddress());
        dto.setContactNumber(entity.getContactNumber());
        dto.setOpenTime(entity.getOpenTime());
        dto.setCloseTime(entity.getCloseTime());
        dto.setRating(entity.getRating());
        dto.setStatus(entity.getStatus());
        dto.setCategory(entity.getCategory());
        dto.setImageURL(entity.getImageURL());

        dto.setOwner(owner);
        dto.setMenuItems(menuItems);

        return dto;
    }

    public RestaurantSummaryDTO toSummary(Restaurant r) {
        return new RestaurantSummaryDTO(
                r.getId(),
                r.getName(),
                r.getCategory(),
                r.getRating()
        );
    }
}

