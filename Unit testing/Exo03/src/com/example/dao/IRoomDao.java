package com.example.dao;

import java.util.Date;

import com.example.model.Reservation;
import com.example.model.Room;
import org.mockito.Mockito;

public interface IRoomDao {

	boolean isAvailable(Room room, Date date_in, Date date_out);

	
}
