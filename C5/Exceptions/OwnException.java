package C5.Exceptions;

import java.io.IOException;

public class OwnException extends IOException{
    public OwnException(){}
    public OwnException(String message) {
        super(message);
    }
    public void getOwnMessage() {
        System.out.println("An error occurred while generating a random number: " );
    }
}
