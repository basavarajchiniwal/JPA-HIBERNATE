package com.xworkz.krawardeesdto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

@Table(name = "karratnaawardees")
public class KrAwardeesDTO {
	@Id
	@Column
	private int id;
	@Column
	private String name;
	@Column
	private int year;
	@Column
	private String achievement;
	@Column
	private boolean alive;
	@Column
	private int age;
	@Column
	private String place;

}
