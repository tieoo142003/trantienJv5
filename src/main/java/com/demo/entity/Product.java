package com.demo.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "Products")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Product implements Serializable {
	private static final long serialVersionUID = 5388315451119528787L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	@Column(name = "name")
	private String ten;
	@Column(name = "Image")
	private String image;
	@Column(name = "Price")
	private BigDecimal price;
	@Column(name = "quantity")
	private String quantity;
	@Column(name = "hang")
	private Integer hang;
	@Column(name = "Available")
	private Boolean trangThai;

	@ManyToOne
	@JoinColumn(name = "categoryId", referencedColumnName = "id")
	@JsonIgnoreProperties(value = {"applications", "hibernateLazyInitializer"})
	private DanhMuc danhMuc;
}
