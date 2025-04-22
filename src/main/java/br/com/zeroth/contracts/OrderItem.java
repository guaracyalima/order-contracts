package br.com.zeroth.contracts;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
class OrderItem {
    private String productId;
    private Integer quantity;
}
