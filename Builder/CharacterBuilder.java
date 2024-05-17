package Builder;

public class CharacterBuilder {
    private String name;
    private String type;
    private int health;
    private int attackPoint;
    private boolean isArmour;

     public CharacterBuilder name(String name){
         this.name=name;
         return this;
     }
     public CharacterBuilder type(String type){
         this.type=type;
         return this;
     }
     public CharacterBuilder health(int health){
         this.health=health;
         return this;
     }
     public CharacterBuilder attackPoint(int attackPoint){
         this.attackPoint=attackPoint;
         return this;
     }
     public CharacterBuilder isArmour(boolean isArmour){
         this.isArmour=isArmour;
         return this;
     }

     public Character build(){
         return new Character(type,name,health,attackPoint,isArmour);
     }
}
