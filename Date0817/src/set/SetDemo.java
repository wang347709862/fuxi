package set;

import java.util.Objects;

public class SetDemo {
    public int s;
    String s2;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;
        SetDemo setDemo = (SetDemo) o;
        return s == setDemo.s;
    }

    @Override
    public int hashCode() {

        return Objects.hash(s);
    }
    //    public static void main(String[] args) {
//
//    }
}
