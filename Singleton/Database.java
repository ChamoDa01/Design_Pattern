package Singleton;

public class Database {
    private static volatile Database instance;
    private int data;

    private Database(int data){
        this.data = data;
    }

    public static Database getInstance(int data){
        if (instance == null){
            synchronized (Database.class){
                if(instance == null){
                    instance = new Database(data);
                }
            }
        }
        return instance;
    }
}
