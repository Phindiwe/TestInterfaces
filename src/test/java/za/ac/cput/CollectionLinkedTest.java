package za.ac.cput;

import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.LinkedHashSet;

import static org.junit.jupiter.api.Assertions.*;

class CollectionLinkedTest {
    Collection c = new LinkedHashSet();

    @Test
    void add(){
        c.add("Phindiwe");
        c.add("Bambata");
        assertEquals(2, c.size());

    }
    @Test
    void remove(){
        c.add("Phindiwe");
        c.add("Bambata");

        c.remove("Phindiwe");
        System.out.println(c);
        assertEquals(1, c.size());

    }
    @Test
    void find(){
        c.add("Phindiwe");
        c.add("Bambata");
        if (c.contains("Phindiwe")){
            System.out.println("Phindiwe");
        }
      assertEquals(2,c.size());
    }

}