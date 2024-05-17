package AbstractFactory;
public class Main {
    public static void main(String[] args) {
        Company msi = new MsiManufacturer();
        GPU msiGpu = msi.createGpu();
        Monitor msiMonitor = msi.createMonitor();

        Company asus = new AsusManufacturer();
        GPU asusGpu = asus.createGpu();
        Monitor asusMonitor = asus.createMonitor();
    }
}
