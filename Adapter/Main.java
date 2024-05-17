package Adapter;

public class Main {
    public static void main(String[] args) {
        IMultiRestoApp multiRestoApp = new MultiRestoApp();
        multiRestoApp.displayMenus(new XmlData());

        FancyUIService fancyUIService = new FancyUIService();
        FancyUIServiceAdapter adapter = new FancyUIServiceAdapter(fancyUIService);
        adapter.displayMenus(new XmlData());
    }
}
