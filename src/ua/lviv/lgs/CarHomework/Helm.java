package ua.lviv.lgs.CarHomework;

public class Helm {
    private int WheelDiameter;
    private String materials;

    public int getWheelDiameter() {
        return WheelDiameter;
    }

    public String getMaterials() {
        return materials;
    }

    public Helm(int wheelDiameter, String materials) {
        WheelDiameter = wheelDiameter;
        this.materials = materials;
    }

    @Override
    public String toString() {
        return "Helm{" +
                "WheelDiameter=" + WheelDiameter +
                ", materials='" + materials + '\'' +
                '}';
    }
}

