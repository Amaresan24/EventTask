package com.example.Test.Enity.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Test.Enity.EventsDetails;
import com.example.Test.Enity.Controller.Dao.EventsDao;

@Service
public class EventsService {

	@Autowired
	EventsDao ed;

	public String postEvent(EventsDetails e) {
		// TODO Auto-generated method stub

		return ed.postEvent(e);
	}

	public String postall_events(List<EventsDetails> a) {
		// TODO Auto-generated method stub
		return ed.postall_events(a);
	}

	public EventsDetails getEvent_id(int a) {
		// TODO Auto-generated method stub
		return ed.getEvent_id(a);
	}

	public List<EventsDetails> gettotal_event() {
		// TODO Auto-generated method stub
		return ed.gettotal_event();
	}

	public String updateEvents(EventsDetails e, int a) {
		// TODO Auto-generated method stub

		EventsDetails val = ed.getEvent_id(a);

		val.setEventname(e.getEventname());
		val.setUsername(e.getUsername());
		val.setDesc(e.getDesc());
		val.setDate(e.getDate());

		ed.updateEvents(val);

		return "Update SuccesFully";

	}

	public String deleteEvent(int a) {
		// TODO Auto-generated method stub
		return ed.deleteEvent(a);
	}

	public List<EventsDetails> date_event(String a) {
		// TODO Auto-generated method stub
		List<EventsDetails> li = ed.gettotal_event();

		List<EventsDetails> events = li.stream().filter(X -> X.getDate().equals(a)).collect(Collectors.toList());

		return events;
	}

	public List<EventsDetails> create_Event(String a) {
		// TODO Auto-generated method stub

		List<EventsDetails> cr = ed.gettotal_event();

		List<EventsDetails> userDetails = cr.stream().filter(X -> X.getEventname().equals(a))
				.collect(Collectors.toList());
		return userDetails;

	}

}
