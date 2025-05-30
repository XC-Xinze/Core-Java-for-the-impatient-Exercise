package ExtraPractice;

public class Main {
    public static void main(String[] args){
    System.out.println("Hero\n");
    Hero tom = new Hero();
    tom.name = "tom";
    tom.hp = 100;

    for ( int i = 0; i<10; i++){
        tom.cure();
        tom.move();
    }
}
}    

