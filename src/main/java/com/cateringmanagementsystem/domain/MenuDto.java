package com.cateringmanagementsystem.domain;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class MenuDto {
    private Long id;
    private Long companyId;
    private String food;
    private String ingredients;
    private BigDecimal cost;
}
