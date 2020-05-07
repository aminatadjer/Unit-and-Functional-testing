package test;

import com.example.model.City;
import com.example.service.DatabaseConnection;
import com.example.service.DatabaseService;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.sql.Connection;

import static org.junit.Assert.*;

public class DatabaseServiceTest {
    Connection connexion;
    DatabaseConnection dbConnexion;
    City ville = new City(1,"Tizi-Ouzou",1000,"Grande Kabylie");
    @Before
    public void setUp() throws Exception {
         dbConnexion= new DatabaseConnection("sa","","org.h2.Driver","jdbc:h2:mem:test");
        connexion = dbConnexion.connect();
        dbConnexion.createDb(connexion);
    }


@Test
    public void testAdd(){

    DatabaseService dbService = new DatabaseService();
    Assert.assertEquals(dbService.addCity(connexion,ville),1,0);

}
    @Test
    public void testGet(){
        DatabaseService dbService = new DatabaseService();
        dbService.addCity(connexion,ville);
        Assert.assertTrue(ville.equals(dbService.getCity(connexion,1)));

    }
    @After
    public void deconnexion (){
        dbConnexion.disconnect(connexion);
    }
}