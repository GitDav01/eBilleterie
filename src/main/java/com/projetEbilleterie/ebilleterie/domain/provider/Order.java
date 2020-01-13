package com.projetEbilleterie.ebilleterie.domain.provider;

import com.projetEbilleterie.ebilleterie.domain.relative.Relative;

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
	// update
	public void update(Order orderNew) {
		this.name = orderNew.getName();
		this.quantity = orderNew.getQuantity();
		this.timestamp = orderNew.getTimestamp();
	}
	@Override public int hashCode() {
		return this.orderId.hashCode();
	}
	@Override public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		if(!this.getClass().isAssignableFrom(obj.getClass())) {
			return false;
		}
		Order that = this.getClass().cast(obj);
		return that.orderId.equals(this.orderId);
	}

}
