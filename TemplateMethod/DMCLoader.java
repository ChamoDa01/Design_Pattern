package TemplateMethod;

public class DMCLoader extends BaseGameLoader{
    @Override
    byte[] loadLocalData() {
        System.out.println("Loading local dmc files...");
        return new byte[0];
    }

    @Override
    void createObjects(byte[] data) {
        System.out.println("Creating dmc objects..");
    }

    @Override
    void downloadAdditionalFiles() {
        System.out.println("Downloading dmc sounds..");
    }

    @Override
    void initializeProfiles() {
        System.out.println("Loading dmc profiles..");
    }
}
