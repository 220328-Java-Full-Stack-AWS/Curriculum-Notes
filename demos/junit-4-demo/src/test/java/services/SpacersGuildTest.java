package services;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import things.SpaceShip;
/* - tests for the SUT voyage() method
test success:
    instantiate a spaceship
    conduct a voyage from its departure to a destination
    verify the spaceship is now at the new location and the returned string notes a successful voyage

test failure: (departure location wrong)
    instantiate a ship
    try to conduct a voyage from the wrong departure
    see that our voyage failed, we get an error, and the location remains the same

test failure: (vessel not instantiated)
    create a null reference for a SpaceShip
    try to conduct a voyage
    receive null pointer exception
 */



/*
The Three A's of Testing:
Arrange - set up the test
Act  - preform the test
Assert - check the results
 */

public class SpacersGuildTest {
    private SpacersGuild sut;

    @Before
    public void setUp() {
        sut = new SpacersGuild(10);
    }

    @After
    public void tearDown() {
        sut = null;
    }


    @Test
    public void Test_conductSuccessfulVoyage(){
        //Arrange
        String departure = "Caladan";
        String destination = "Arakis";
        String shipName = "Emperor's Pride";

        SpaceShip emperorsPride = new SpaceShip(new Object(), shipName, departure);


        //Act
        String status = sut.voyage(emperorsPride, destination, departure);

        //Assert
        Assert.assertEquals(destination, emperorsPride.getLocation());
        Assert.assertEquals( "Vessel: " + shipName + " has arrived at " + destination, status);

    }

    @Test
    public void Test_conductUnsuccessfulVoyageDueToBadDepartureLocation() {
        //Arrange
        String goodDeparture = "Caladan";
        String badDeparture = "Geidi Prime";
        String destination = "Arakis";
        String shipName = "Emperor's Pride";

        SpaceShip emperorsPride = new SpaceShip(new Object(), shipName, badDeparture);

        //Act
        String status = sut.voyage(emperorsPride, destination, goodDeparture);

        //Assert
        Assert.assertNotEquals(destination, emperorsPride.getLocation());
        Assert.assertEquals( "Error! Vessel: " + shipName + " is not located at " + goodDeparture, status);
    }

    @Test(expected = NullPointerException.class)
    public void Test_conductUnsuccessfulVoyageDueToNullShipReference() {
        //Arrange
        String departure = "Caladan";
        String destination = "Arakis";
        String shipName = "Emperor's Pride";

        SpaceShip emperorsPride = null;

        //Act
        String status = sut.voyage(emperorsPride, destination, departure);

        //Assert
        //nothing to assert here, see @Test annotation for expected results
    }

    @Test
    public void Test_sabotageSpiceProductionWithMocking() {
        //Arrange
        int amount = 10;
        String plot = "sabotage spice production";
        SpiceMarket mockedSpiceMarket = Mockito.mock(SpiceMarket.class);
        Mockito.when(mockedSpiceMarket.sabotage(amount)).thenReturn(100-amount);
        sut.setSpiceMarket(mockedSpiceMarket);

        //Act
        String result = sut.plotAndScheme(plot);


        //Assert
        verify(mockedSpiceMarket, times(1)).sabotage(amount);
        Assert.assertEquals("10% of strategic spice burned", result);

    }
}