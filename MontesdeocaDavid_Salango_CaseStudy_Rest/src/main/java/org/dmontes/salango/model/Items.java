package org.dmontes.salango.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import lombok.Data;


@Data
@Entity
@Table(name="items")
public class Items {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "itemId", nullable = false)
	private Integer itemId;
	
	@Column(name = "name", nullable = false, length = 70)
	private String name;
	
	@Column(name = "type", nullable = false, length = 50)
	private String type;
	
	@Lob
	@Column(name = "description", nullable = false)
	private String description;
	
	@Column(name = "price", nullable = false, precision = 10, scale = 2)
	private BigDecimal price;
	
	@Column(name = "deleted", nullable = false, length = 1)
	private String deleted;

	@Column(name = "image", length = 500)
	private String image;

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getDeleted() {
		return deleted;
	}

	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}


	public Items() {
	
	}
}
