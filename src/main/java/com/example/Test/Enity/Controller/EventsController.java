package com.example.Test.Enity.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Test.Enity.EventsDetails;
import com.example.Test.Enity.Service.EventsService;


@RestController
public class EventsController {

	@Autowired
	EventsService es;

// event Same should be unqiue 

	@PostMapping(value = "/post_data")
	public String postEvent(@RequestBody EventsDetails e) {
     return es.postEvent(e);

	}

	@PostMapping(value = "/post_allEvents")
	public String postall_events(@RequestBody List<EventsDetails> a) {

		return es.postall_events(a);

	}

	@GetMapping(value = "/getevent_id/{a}")
	public EventsDetails getEvent_id(@PathVariable int a) {
		return es.getEvent_id(a);

	}

	@GetMapping(value = "/getall_events")
	public List<EventsDetails> gettotal_event() {
		return es.gettotal_event();
	}

	@PutMapping(value = "/update_eventdetails/{a}")
	public String updateEvents(@RequestBody EventsDetails e, @PathVariable int a) {
		return es.updateEvents(e, a);

	}

	@DeleteMapping(value = "/delete_events/{a}")
	public String deleteEvent(@PathVariable int a) {

		return es.deleteEvent(a);
	}

	// one date how many Event

	@GetMapping(value = "/dateBy_event/{a}")
	public List<EventsDetails> date_event(@PathVariable String a) {

		return es.date_event(a);
	}

	// when Create Event

	@GetMapping(value = "/create_event/{a}")
	public List<EventsDetails> create_Event(@PathVariable String a) {
     return es.create_Event(a);
	}
}
