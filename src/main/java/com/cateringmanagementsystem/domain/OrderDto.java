package com.cateringmanagementsystem.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class OrderDto {
    private Long id;
    private Long menuId;
    private String address;
    private String phoneNumber;
    private String customerFirstName;
}
