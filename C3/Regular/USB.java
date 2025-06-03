package C3.Regular;
// interface test
// @version 1.0
// interface defined the standard of methods
// users don't need to know how the implementations of different methods
// users only need to know the name and standard
public interface USB{
    //only for interface 
    int portID();
    void setConnection(int id);//even 'void' need to be writen in the interface
    void getConnection();
    void insertUSB(USB u1, int id); // method to insert USB
    void checkUSB(USB u1);
    //interface can be extended
        //like: public interface USB2 extends USB 
        //more: pulic interface USB2 extends USB, USB3, USB4 
}
