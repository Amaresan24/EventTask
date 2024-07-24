package com.example.Test.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Test.Enity.EventsDetails;


public interface EventsRepo extends  JpaRepository<EventsDetails, Integer> {

}
