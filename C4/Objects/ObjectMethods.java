package C4.Objects;
public class ObjectMethods {
    public boolean hashCodeEqual(Object obj1, Object obj2) {
        return (obj1 == null && obj2 == null) || (obj1 != null && obj1.hashCode() == obj2.hashCode());
    }
}