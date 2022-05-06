package things;

public class SpaceShip {
    private Object foldDrive;
    private String name;
    private String location;

    public SpaceShip() {
    }

    public SpaceShip(Object foldDrive, String name, String location) {
        this.foldDrive = foldDrive;
        this.name = name;
        this.location = location;
    }

    public Object getFoldDrive() {
        return foldDrive;
    }

    public void setFoldDrive(Object foldDrive) {
        this.foldDrive = foldDrive;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
