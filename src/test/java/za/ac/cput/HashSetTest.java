package za.ac.cput;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class HashSetTest {
    Set<String> carSet = new HashSet<>();

    @Test
    void add(){
        carSet.add("Madza7");
        carSet.add("BMW");
        assertEquals(2,carSet.size());

    }
    @Test
    void remove(){
        carSet.add("Mazda7");
        carSet.add("BMW");
        carSet.remove("BMW");
        System.out.println(carSet);
        assertEquals(1, carSet.size());

    }
    @Test
    void find(){
        carSet.add("Mazda7");
        carSet.add("BMW");
      if (carSet.contains("Mazda7")){
          System.out.println("Mazda7");
      }
        assertEquals(2,carSet.size());

    }

}