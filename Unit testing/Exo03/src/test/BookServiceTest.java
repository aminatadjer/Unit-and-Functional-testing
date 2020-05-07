package test;

import com.example.dao.IReservationDao;
import com.example.dao.IRoomDao;
import com.example.model.Guest;
import com.example.model.Reservation;
import com.example.model.Room;
import com.example.service.BookService;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.*;

public class BookServiceTest {
    @Test
    public void  testBook() throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date date_in=sdf.parse("22-01-2019");
        Date date_out=sdf.parse("29-01-2019");
        Room chambre = new Room(1,"h128",3);
        Guest personne = new Guest("Amina","Tadjer");
        Reservation reservation=new Reservation(date_in,date_out,chambre,personne);

        IReservationDao resDao = Mockito.mock(IReservationDao.class);
        IRoomDao roomDao = Mockito.mock(IRoomDao.class);
        BookService book = new BookService(roomDao,resDao);
        Mockito.when(roomDao.isAvailable(chambre,date_in,date_out)).thenReturn(true);
        Mockito.when(resDao.createReservation(reservation)).thenReturn(true);
        Assert.assertTrue(book.bookRoom(chambre,date_in,date_out,personne));


    }
    @Test
    public void  testCancel() throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date date_in=sdf.parse("22-01-2019");
        Date date_out=sdf.parse("29-01-2019");
        Room chambre = new Room(1,"h128",3);
        Guest personne = new Guest("Amina","Tadjer");
        Reservation reservation=new Reservation(date_in,date_out,chambre,personne);

        IReservationDao resDao = Mockito.mock(IReservationDao.class);
        IRoomDao roomDao = Mockito.mock(IRoomDao.class);
        BookService book = new BookService(roomDao,resDao);


        Mockito.when(resDao.findReservation(1)).thenReturn(reservation);
        Mockito.when(resDao.cancelReservation(reservation)).thenReturn(true);


        Assert.assertTrue(book.cancelReservation(1));


    }
}