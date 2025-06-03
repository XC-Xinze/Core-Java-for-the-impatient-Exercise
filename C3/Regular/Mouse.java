package C3.Regular;

// this is the implementation class of interface
//
public class Mouse implements USB{
    private int IDofPort = 0;// 0 means no connections
    public int portID(){
        return this.IDofPort;
    }
    public void setConnection(int Id){

        this.IDofPort = Id;
        System.out.println(Id  + "PORT (mouse) is connecting");
    }
    public void getConnection(){
        System.out.println("Keyboard is connected with ID: " + IDofPort);
    }
    public void insertUSB(USB u1,int id){
        u1.setConnection(id);
    }
    public void checkUSB(USB u1){
        u1.getConnection();
    }
}
