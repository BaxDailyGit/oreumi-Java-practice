public class Car {

    String company;
    String software;
    String color;
    int maxSpeed;
    int price;



    public Car() {

    }

    public Car(String company) {
        this.company = company;
    }
    public Car(String company, int maxSpeed) {
        this.company = company;
        this.maxSpeed = maxSpeed;
    }

    public Car(String company, String software, String color) {
        this.company = company;
        this.software = software;
        this.color = color;
    }

    public Car(String company, String software, String color, int maxSpeed, int price) {
        this.company = company;
        this.software = software;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.price = price;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

    public void setSoftware(String software) {
        this.software = software;
    }

    public String getSoftware() {
        return software;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }




}
