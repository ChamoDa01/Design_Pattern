package TemplateMethod;

public class WW2Loader extends BaseGameLoader{

    @Override
    byte[] loadLocalData() {
        System.out.println("Loading local ww2 files...");
        return new byte[0];
    }

    @Override
    void createObjects(byte[] data) {
        System.out.println("Creating ww2 objects..");
    }

    @Override
    void downloadAdditionalFiles() {
        System.out.println("Downloading ww2 sounds..");
    }

    @Override
    void initializeProfiles() {
        System.out.println("Loading ww2 profiles..");
    }
}
