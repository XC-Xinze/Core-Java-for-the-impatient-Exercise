package C4.Objects;

public class Main {
    public static void main(String[] args) {
        ObjectMethods objectMethods = new ObjectMethods();
        String str1 = "Hello";
        String str2 = "HellO";
        String str3 = "Hello";
        System.out.println(objectMethods.hashCodeEqual(str1, str2));
        System.out.println(objectMethods.hashCodeEqual(str1, str3));
        Dog dog1 = new Dog("Buddy", 5);
        Dog dog2 = dog1.clone();
        Dog dog3 = new Dog("Buddy", 5,1);
        Dog copyDog3 = dog3.clone();
        
    }
}
