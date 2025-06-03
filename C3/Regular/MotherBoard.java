package C3.Regular;

public class MotherBoard{
    public static void main(String[] args){
        USB mouse = new Mouse();
        USB keyboard = new Keyboard();
        //the idea is different USB devices can be connected to the motherboard
        //and the motherboard can manage them uses the same interface
        //same name of methods,but different implementations and behaviors
        mouse.insertUSB(mouse, 1);
        keyboard.insertUSB(keyboard, 2);
        mouse.getConnection();
        keyboard.getConnection();




    }
   


}
