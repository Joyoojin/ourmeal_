package com.kosmo.ourmeal.dto;


import com.kosmo.ourmeal.constant.OrderStatus;
import com.kosmo.ourmeal.entity.Order;
import com.kosmo.ourmeal.entity.OrderItem;
import lombok.Getter;
import lombok.Setter;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@Getter @Setter
public class OrderHistDto {

    private Long orderId; //주문아이디
    private String orderDate; //주문날짜
    private OrderStatus orderStatus; //주문 상태
    private List<OrderItemDto> orderItemDtoList = new ArrayList<>();
    //관리자 전체 주문조회 추가
    private List<Order> orderList = new ArrayList<>();


    public OrderHistDto(Order order){
        this.orderId = order.getId();
        this.orderDate = order.getOrderDate().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
        this.orderStatus = order.getOrderStatus();
    }

    //주문 상품리스트
    public void addOrderItemDto(OrderItemDto orderItemDto){
        orderItemDtoList.add(orderItemDto);
    }

    //관리자 전체 주문조회 추가
    public void addOrder(Order order){
        orderList.add(order);
    }

}