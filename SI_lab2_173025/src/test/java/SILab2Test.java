import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {
    public List<String> allUsers = new ArrayList<>();

    @Test
    void everyStatemantTest() {
        assertFalse(SILab2.function(null, null));
        //0,1,2,21,22
        assertFalse(SILab2.function(new User(null, null, null), null));
        //0,1,3,20,21,22
        assertFalse(SILab2.function(new User("Biljana", "bile", "b"), null));
        //0,1,3,4,5,6,18,19,20,21,22
        assertFalse(SILab2.function(new User("Biljana", "biljanaa", "b"), null));
        //0,1,3,4,5,6,7,8.1,8.2,8.3,18,19,20,21,22
        assertFalse(SILab2.function(new User("Biljana", "biljana1", "b"), null));
        //0,1,3,4,5,5,7,8.1,8.2,9,10,15,18,19,20,21,22
        assertFalse(SILab2.function(new User("Biljana", "Biljana1", "b"), null));
        //0,1,3,4,5,6,7,8.1,8.1,8.3,9,10,11,12,15,18,19,20,21,22
        assertTrue(SILab2.function(new User("Biljana", "Biljana1!", "b"), null));
        //1,2,3,4,5,6,7,8.1,8.2,8.3,9,10,11,12,13,14,15,16,17,18,19,20,22
    }

    @Test
    void everyBranchTest() {
        assertFalse(SILab2.function(null, null));
        assertFalse(SILab2.function(new User(null, null, null), null));
        assertFalse(SILab2.function(new User("Biljana", "bile", "b"), null));
        assertFalse(SILab2.function(new User("Biljana", "biljanaa", "b"), null));
        assertFalse(SILab2.function(new User("Biljana", "biljana1", "b"), null));
        assertFalse(SILab2.function(new User("Biljana", "Biljana1", "b"), null));
        assertTrue(SILab2.function(new User("Biljana", "Biljana1!", "b"), null));
    }
}
