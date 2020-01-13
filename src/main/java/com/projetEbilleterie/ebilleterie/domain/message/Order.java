package com.projetEbilleterie.ebilleterie.domain.message;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Order implements Serializable
{
	private Long orderId;
	private String name;
	private Long quantity;
	private LocalDateTime timestamp;

	public Order() {
	}

	public Order(Long orderId, String name, Long quantity, LocalDateTime timestamp) {
		this.orderId = orderId;
		this.name = name;
		this.quantity = quantity;
		this.timestamp = timestamp;
	}
	public Long getOrderId()
	{
		return orderId;
	}

	public void setOrderId(Long orderId)
	{
		this.orderId = orderId;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public Long getQuantity()
	{
		return quantity;
	}

	public void setQuantity(Long quantity)
	{
		this.quantity = quantity;
	}

	@Override
	public String toString()
	{
		return "Order [orderId=" + orderId + ", name=" + name + ", quantity=" + quantity + ", timestamp=" + timestamp
				+ "]";
	}
	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}

}
