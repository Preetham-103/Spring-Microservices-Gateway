package com.cts.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="cricket")
@Data
public class Cricket {
	@Id
	private long id;
	private String name;
	private String team;
	private double batting_avg;
	private double bowling_avg;
	private int matches_played;
}
