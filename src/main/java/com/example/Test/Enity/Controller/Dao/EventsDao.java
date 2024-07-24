package com.example.Test.Enity.Controller.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.Test.Enity.EventsDetails;
import com.example.Test.Repo.EventsRepo;

@Repository
public class EventsDao {
	@Autowired
	EventsRepo er;

	public String postEvent(EventsDetails e) {
		// TODO Auto-generated method stub
		er.save(e);
		return "data  saved Succesfully";
	}

	public String postall_events(List<EventsDetails> a) {
		// TODO Auto-generated method stub
		er.saveAll(a);
		return "List of Data saved SuccesFully";
	}

	public EventsDetails getEvent_id(int a) {
		// TODO Auto-generated method stub
		return er.findById(a).get();
	}

	public List<EventsDetails> gettotal_event() {
		// TODO Auto-generated method stub
		return er.findAll();
	}

	public String updateEvents(EventsDetails e) {
		// TODO Auto-generated method stub
		er.save(e);
		return "your data saved SuccesFully";
	}

	public String deleteEvent(int a) {
		// TODO Auto-generated method stub
		er.deleteById(a);
		return "Items Deleted Succesfully";
	}
}
