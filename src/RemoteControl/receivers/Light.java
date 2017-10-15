package RemoteControl.receivers;

public class Light {

    String location;
    int level;

    public Light(String location) {
        this.location = location;
    }

    public void on() {
        level = 100;
        System.out.println("Light is on");
    }

    public void off() {
        level = 0;
        System.out.println("Light is off");
    }

    public void change(int level) {
        this.level = level;
        if (level == 0) {
            off();
        }
        else {
            System.out.println("Light was changed to " + level + "%");
        }
    }

    public int getLevel() {
        return level;
    }

    public String getLocation() {
        return location;
    }
}
