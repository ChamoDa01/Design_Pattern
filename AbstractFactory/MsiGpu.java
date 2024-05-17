package AbstractFactory;

public class MsiGpu implements GPU{
    @Override
    public void assemble() {
        System.out.println("Msi Gpu");
    }
}
