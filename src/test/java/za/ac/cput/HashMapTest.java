package za.ac.cput;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class HashMapTest {

    Map<Integer,String> map = new HashMap<>();


    @Test
    void add() {
        map.put( 5, "Phindiwe");
        assertEquals(1, map.size());
        map.put( 6, "Bambata");
        assertEquals(2, map.size());

    }

    @Test
    void remove() {
       map.put( 5,"Phindiwe");
       map.put( 6,"Bambata");

        map.remove(5);
        System.out.println(map);
        assertEquals(1, map.size());

    }
    @Test
    void find(){
        map.put( 5,"Phindiwe");
        map.put( 6,"Bambata");
        //map.get(5);
        System.out.println(map.get(5));


    }
}