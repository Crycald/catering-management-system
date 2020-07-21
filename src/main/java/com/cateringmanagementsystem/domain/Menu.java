package com.cateringmanagementsystem.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;

    @Column(name = "COMPANY_ID")
    @OneToOne
    private Company companyId;

    @Column(name = "FOOD")
    private String food;

    @Column(name = "INGREDIENTS")
    private String ingredients;

    @Column(name = "COST")
    private BigDecimal cost;
}
