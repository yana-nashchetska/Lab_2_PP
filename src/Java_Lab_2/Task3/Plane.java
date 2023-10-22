package Java_Lab_2.Task3;

public class Plane {
    private String companyName;
    private String planeType;
    private int seatsAmount; // for check

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getPlaneType() {
        return planeType;
    }

    public void setPlaneType(String planeType) {
        this.planeType = planeType;
    }

    public int getSeatsAmount() {
        return seatsAmount;
    }

    public void setSeatsAmount(int seatsAmount) {
        this.seatsAmount = seatsAmount;
    }

    public Plane(String companyName, String planeType, int seatsAmount) {
        this.companyName = companyName;
        this.planeType = planeType;
        this.seatsAmount = seatsAmount;
    }

    @Override
    public String toString() {
        return "Plane: \n" +
                "companyName = " + companyName + '\n' +
                "planeType = " + planeType + '\n' +
                "seatsAmount = " + seatsAmount;
    }
}
