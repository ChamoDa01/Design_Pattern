package Adapter;

public class FancyUIServiceAdapter implements IMultiRestoApp {
    private final FancyUIService fancyUIService;

    public FancyUIServiceAdapter(FancyUIService fancyUIService) {
        this.fancyUIService = fancyUIService;
    }

    @Override
    public void displayMenus(XmlData xmlData) {
        JasonData jasonData = convertXmlToJason(xmlData);
        fancyUIService.displayMenus(jasonData);
    }

    @Override
    public void displayRecommendations(XmlData xmlData) {
        JasonData jasonData = convertXmlToJason(xmlData);
        fancyUIService.displayRecommendations(jasonData);
    }

    private JasonData convertXmlToJason(XmlData xmlData){
        // Convert xmlData to JsonData and return it..
        return new JasonData();
    }
}
