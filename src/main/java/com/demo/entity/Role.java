package com.demo.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.*;

@Entity
@Table(name = "Roles")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Role implements Serializable {

	private static final long serialVersionUID = 2250489143877481018L;

	@Id
	@Column(name = "id")
	private String id;
	
	@Column(name = "name")
	private String name;
}
