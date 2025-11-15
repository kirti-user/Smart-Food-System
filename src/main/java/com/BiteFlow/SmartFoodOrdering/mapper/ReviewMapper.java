package com.BiteFlow.SmartFoodOrdering.mapper;

import com.BiteFlow.SmartFoodOrdering.dto.CreateDTO.ReviewCreateDTO;
import com.BiteFlow.SmartFoodOrdering.dto.ResponseDTO.ReviewDTO;
import com.BiteFlow.SmartFoodOrdering.dto.SummaryDTO.OrderSummaryDTO;
import com.BiteFlow.SmartFoodOrdering.dto.SummaryDTO.RestaurantSummaryDTO;
import com.BiteFlow.SmartFoodOrdering.dto.SummaryDTO.ReviewSummaryDTO;
import com.BiteFlow.SmartFoodOrdering.dto.SummaryDTO.UserSummaryDTO;
import com.BiteFlow.SmartFoodOrdering.dto.UpdateDTO.ReviewUpdateDTO;
import com.BiteFlow.SmartFoodOrdering.model.Review;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class ReviewMapper {

    public Review toEntity(ReviewCreateDTO dto) {
        Review r = new Review();
        r.setRating(dto.getRating());
        r.setComment(dto.getComment());
        r.setCreatedAt(LocalDateTime.now());
        return r;
    }

    public void updateEntity(Review r, ReviewUpdateDTO dto) {
        if (dto.getRating() != null) r.setRating(dto.getRating());
        if (dto.getComment() != null) r.setComment(dto.getComment());
    }

    public ReviewDTO toResponse(
            Review r,
            UserSummaryDTO user,
            RestaurantSummaryDTO restaurant,
            OrderSummaryDTO order) {

        ReviewDTO dto = new ReviewDTO();
        dto.setId(r.getId());
        dto.setRating(r.getRating());
        dto.setComment(r.getComment());
        dto.setCreatedAt(r.getCreatedAt());
        dto.setUser(user);
        dto.setRestaurant(restaurant);
        dto.setOrder(order);

        return dto;
    }

    public ReviewSummaryDTO toSummary(Review r) {
        return new ReviewSummaryDTO(
                r.getId(),
                r.getRating(),
                r.getComment()
        );
    }
}

