package models;

import org.junit.*;
import static org.junit.Assert.*;

public class CipherTest {
    @Test
    public void newCipher_instantiatesCorrectly() {
        Cipher testCipher = new Cipher("a",2);
        assertEquals("a",testCipher instanceof Cipher);
    }

    @Test
    public void newCipher_readsAString_a() {
        Cipher testCipher = new Cipher("a",2);
        assertEquals("a",testCipher.getStatement());
    }

    @Test
    public void newCipher_readKey_2() {
        Cipher testCipher = new Cipher("a",2);
        assertEquals(2, testCipher.getKey());
    }
}