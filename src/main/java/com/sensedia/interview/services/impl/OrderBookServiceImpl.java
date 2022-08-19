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
    int totalBuyOrders = 0;
    for (Order order : orderBook) {
      if (order.getSide().equals(Side.BUY)){
        totalBuyOrders += 1;
      }
    }
    return totalBuyOrders;
  }

  @Override
  public long calculateTotalSellOrders(List<Order> orderBook) {
    int totalSellOrders = 0;
    for (Order order : orderBook) {
      if (order.getSide().equals(Side.SELL)){
        totalSellOrders += 1;
      }
    }
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
    int totalQuantifyOrders = 0;
    for (Order order : orderBook) {
      totalQuantifyOrders += order.getQuantity();
    }
    return totalQuantifyOrders;
  }
}
