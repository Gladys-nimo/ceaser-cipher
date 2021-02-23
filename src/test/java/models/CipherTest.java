package models;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CipherTest {

    @Test
    public void newCipher_instantiatesCorrectly() {
        Cipher testCipher = new Cipher("a",2);
        assertEquals(true,testCipher instanceof Cipher);
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

    @Test
    public void newCipher_replaceLetter_b() {
        Cipher testCipher = new Cipher("a",2);
        assertEquals("b", testCipher.isEncrypted());
    }

    @Test
    public void newCipher_replaceLetterByUsingAKey_c() {
        Cipher testCipher = new Cipher("a",2);
        assertEquals("c",testCipher.isActuallyEncrypted("a",2));
    }

    @Test
    public void newCipher_replaceMultipleLettersUsingKeys_cde() {
        Cipher testCipher = new Cipher("cde",2);
        assertEquals("abc",testCipher.toDecrypt("cde",2));
    }
    @Test
    public void newCipher_encryptAStringUsingKey_ab(){
        Cipher testCipher = new Cipher("yz",2);
        assertEquals("ab",testCipher.isActuallyEncrypted("yz",2));
    }
    @Test
    public void newCipher_decryptsAStringUsingAKey_yz(){
        Cipher testCipher = new Cipher("ab",2);
        assertEquals("yz",testCipher.toDecrypt("ab",2));
    }
}