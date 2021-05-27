package Tests;

import java.util.HashSet;
import java.util.Set;

public class KeyMaster {

    public int i;

    public KeyMaster(int i) {
        this.i = i;
    }

    @Override
    public boolean equals(Object o) {
        return i == ((KeyMaster) o).i;
    }

    @Override
    public int hashCode() {
        return i;
    }

    public static void main(String[] args) {

        Set<KeyMaster> set = new HashSet<KeyMaster>();
        KeyMaster k1 = new KeyMaster(1);
        KeyMaster k2 = new KeyMaster(2);
        KeyMaster k3 = new KeyMaster(3);

        set.add(k1);
        set.add(k1);
        set.add(k2);
        set.add(k3);

        System.out.println(set.size() + ":");

        k2.i = 1;
        System.out.println(set.size() + ":");

        System.out.println(set.remove(k1));
        System.out.println(set.size() + ":");

//        for (KeyMaster k : set)
//            System.out.println(k2.equals(k));

        System.out.println(set.remove(k2));
        System.out.println(set.size());
        System.out.println(set.remove(k3));
        System.out.println(set.size());
    }
}