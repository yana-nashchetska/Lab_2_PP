package Java_Lab_2.Task3;

import java.util.ArrayList;

public class Airport {
    private String cityName;
    private ArrayList<FlightSchedule> flightSchedules = new ArrayList<>();

    private ArrayList<Plane> planes = new ArrayList<>();

    public Airport(String cityName, ArrayList<FlightSchedule> flightSchedules, ArrayList<Plane> planes) {
        this.cityName = cityName;
        this.flightSchedules = flightSchedules;
        this.planes = planes;
    }

    public void addFlightSchedule(FlightSchedule flightSchedule) {
        this.flightSchedules.add(flightSchedule);
    }
    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public ArrayList<FlightSchedule> getFlightSchedules() {
        return flightSchedules;
    }

    public void setFlightSchedules(ArrayList<FlightSchedule> flightSchedules) {
        this.flightSchedules = flightSchedules;
    }

    public ArrayList<Plane> getPlanes() {
        return planes;
    }

    public void setPlanes(ArrayList<Plane> planes) {
        this.planes = planes;
    }

    public void addPlane(Plane plane) {
        this.planes.add(plane);
    }

    public void deletePlane(Plane plane) {
        this.planes.remove(plane);
    }

    public void editPlane(Plane plane, String status) {
        plane.setStatus(status);
        if (status == "good") {
            System.out.println("Safe fly");
        } else {
            System.out.println("Danger to fly on this plane");
        }
    }

}
