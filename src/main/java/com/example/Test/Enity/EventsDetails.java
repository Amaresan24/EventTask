package com.example.Test.Enity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "event_list")
@Entity
public class EventsDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int id;
	private String username;
	private String eventname;
	private String desc;
	private String date;

	public int getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	public String getEventname() {
		return eventname;
	}

	public String getDesc() {
		return desc;
	}

	public String getDate() {
		return date;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setEventname(String eventname) {
		this.eventname = eventname;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public void setDate(String date) {
		this.date = date;
	}
}



