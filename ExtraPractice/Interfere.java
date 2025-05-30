package ExtraPractice;

public interface Iusb {
    void service_();
}//定义接口
public class Usbdisk implements Iusb{
    public void service_(){
        System.out.println("使用U盘");
    }
}//接口的实现1
public class Usbfan implements Iusb{
    public void  service_(){
        System.out.println("使用USB风扇");
    }
}//接口的实现2
public class Computer {
    Iusb usb;
}//包含接口标准的类
public class Test {
    public static void main(String[] args){
        Computer com1 = new Computer();
        Usbdisk ud=new Usbdisk();
        Usbfan uf=new Usbfan();
        com1.usb=ud;
        com1.usb.service_();
    }