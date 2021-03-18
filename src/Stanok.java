public class Stanok {
    // fields
    int oil = 100;
    boolean isOff = false;
    private String name = "S001";

    // methods
    void makeDetails(int amount) {
        if (oil >= amount) {
            oil -= amount;
            System.out.println("Work is done!");
        } else if (oil < amount) {
            System.out.println("Oil is need!");
            isOff = true;
        }
    }

    void refuel(int refOil) {
        oil += refOil;
        System.out.println("Ready to work!");
        isOff = false;
    }

    public Stanok(int oil, boolean isOff) {
        this.oil = oil;
        this.isOff = isOff;
    }
}
