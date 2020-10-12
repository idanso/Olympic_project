package sample;

public class Stadium {
    private String name;
    private String location;
    private int numberOfSeats;

    public Stadium (String name, String location, int numberOfSeats){
        this.name = name;
        this.location = location;
        this.numberOfSeats = numberOfSeats;
    }
    public String getName() {
        return name;
    }
    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "Stadium{" +
                "Name='" + name + '\'' +
                ", Location='" + location + '\'' +
                ", Number of seats=" + numberOfSeats +
                '}';
    }
}
