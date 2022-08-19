package com.sensedia.interview.services.impl;

import com.sensedia.interview.domain.Order;
import com.sensedia.interview.domain.enumeration.Side;
import com.sensedia.interview.services.OrderBookService;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class OrderBookServiceImpl implements OrderBookService {

    @Override
    public long calculateTotalBuyOrders(List<Order> orderBook) {
        long totalBuyOrders = 0L;
        for (Order order : orderBook) {
            if (order.getSide().equals(Side.BUY)) {
                totalBuyOrders += 1;
            }
        }
        return totalBuyOrders;
    }

    @Override
    public long calculateTotalSellOrders(List<Order> orderBook) {
        long totalSellOrders = 0L;

        // It's an unnecessary comment.
        // I changed the spelling of "for" and "if" just to demonstrate another way of writing the code.
        for (Order order : orderBook) if (order.getSide().equals(Side.SELL)) totalSellOrders += 1;

        return totalSellOrders;
    }

    @Override
    public double calculateTotalValueOrders(List<Order> orderBook) {
        double totalValueOrders = 0;
        for (Order order : orderBook) {
            totalValueOrders += order.getPrice();
        }
        return totalValueOrders;
    }

    @Override
    public long calculateTotalQuantityOrders(List<Order> orderBook) {
        long totalQuantifyOrders = 0L;

        for (Order order : orderBook) totalQuantifyOrders += order.getQuantity();

        return totalQuantifyOrders;
    }
}
