package Command;

public class Light {
    private boolean switchedON = false;

    public void switchLights(){
        switchedON = !switchedON;
        System.out.println(switchedON);
    }
}
