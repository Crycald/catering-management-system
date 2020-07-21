package com.cateringmanagementsystem.domain;

import com.cateringmanagementsystem.domain.enums.TypeOfRestaurant;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CompanyDto {
    private Long id;
    private String name;
    private String phoneNumber;
    private String address;
    private TypeOfRestaurant typeOfRestaurant;
}
