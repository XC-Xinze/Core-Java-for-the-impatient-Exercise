package C3.Regular;

public class Keyboard implements USB {
    private int id;

    @Override
    public int portID() {
        return id;
    }

    @Override
    public void setConnection(int id) {
        this.id = id;
        System.out.println(id  + "PORT (keyboard) is connecting");
    }

    @Override
    public void getConnection() {
        System.out.println("Keyboard is connected with ID: " + id);
    }
    public void insertUSB(USB u1,int id){
        u1.setConnection(id);
    }
    public void checkUSB(USB u1){
        u1.getConnection();
    }

    
}
