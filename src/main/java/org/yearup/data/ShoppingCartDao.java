package org.yearup.data;

import org.yearup.models.ShoppingCart;
import org.yearup.models.ShoppingCartItem;

public interface ShoppingCartDao
{
    ShoppingCart getByUserId(int userId);

    void addToCart(int userId, int productId, int quantity);

    void updateQuantity(int userId, int productId, int quantity);

    void clearCart(int userId);
}