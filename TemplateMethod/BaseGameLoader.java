package TemplateMethod;

public abstract class BaseGameLoader {

    abstract byte[] loadLocalData();
    abstract void createObjects(byte[] data);
    abstract void downloadAdditionalFiles();
    abstract void initializeProfiles();
    public void load(){
        byte[] data = loadLocalData();
        createObjects(data);
        downloadAdditionalFiles();
        initializeProfiles();
    }
}
