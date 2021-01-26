package Calle;

import lombok.experimental.Accessors;

import java.util.HashSet;
import java.util.Set;

@Accessors(chain = true)
public class copyMap {

    public static void main(String[] args) {

        Set<String> set  =new HashSet<>();
        set.add("q");
        set.add("w");
        set.add("rr");
        System.out.println(set);
    }
}

