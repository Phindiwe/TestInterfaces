package za.ac.cput;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CollectionListTest {
    ArrayList<String> list=new ArrayList<String>();
    @Test
    void add(){
        list.add("Bambata");
        list.add("Phindidwe");
       // System.out.println(list);
        assertEquals(2,list.size());


    }
    @Test
    void remove(){
        list.add("Bambata");
        list.add("Phindiwe");
        list.remove("Bambata");
        System.out.println(list);
        assertEquals(1, list.size());
    }
    @Test
    void find(){
        list.add("Bambata");
        list.add("Phindiwe");
        System.out.println(list.get(1));
        assertEquals(2,list.size());

    }

}