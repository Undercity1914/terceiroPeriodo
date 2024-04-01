/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package roteiro2.roteiro;

import java.util.ArrayList;
import java.util.List;
import roteiro2.roteiro.Classes.Airport;
import roteiro2.roteiro.Classes.Flight;
import roteiro2.roteiro.Classes.Loyalty;
import roteiro2.roteiro.Classes.Passanger;

/**
 *
 * @author marco
 */
public class Roteiro {

    public static void main(String[] args) {
        Loyalty points = new Loyalty();
        List<Passanger> passanger = new ArrayList<>();
        Passanger passanger1 = new Passanger("João Silva", "12345678900", points);
        passanger.add(passanger1);
        Airport airportMiami = new Airport("Miami international airport", "Miami", null);
        Airport airportOrlando = new Airport("Orlando international airport", "Orlando", null);
        List<Airport> scale = new ArrayList<>();
        scale.add(airportMiami);
        scale.add(airportOrlando);
        Flight flight1 = new Flight(3979, "Nova York", 100, passanger, scale, "Not engage");
        List<Flight> flight = new ArrayList<>();
        flight.add(flight1);
        Airport airport = new Airport("Aeroporto Internacional de Brasília", "Brasília", flight);
        
        passanger1.getPoints().addPoints(500);
        
        airport.addFlight(flight1);
        airport.startFlight(3979);
        
        airport.prejudice();
    }
}
