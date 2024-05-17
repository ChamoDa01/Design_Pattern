package TemplateMethod;

public class Main {
    public static void main(String[] args) {

        BaseGameLoader dmcLoader = new DMCLoader();
        dmcLoader.load();

        BaseGameLoader ww2Loader = new WW2Loader();
        ww2Loader.load();
    }
}
