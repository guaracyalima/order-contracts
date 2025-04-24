package com.github.guaracyalima.contracts;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrderRequest {
    private String orderId;
    private String customerId;
    private List<OrderItem> items;
    private Double totalAmount;
}
