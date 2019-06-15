import org.junit.Test;

import static org.junit.Assert.*;

public class DecryptTest {

    @Test
    public void Decrypt_acceptsaString() {
        Decrypt testDecrypt = new Decrypt("a", 2);
        assertEquals("a", testDecrypt.getmName());

    }

    @Test
    public void Decrypt_acceptsaKey() {
        Decrypt testDecrypt = new Decrypt("a", 2);
        assertEquals(2, testDecrypt.getmKey());
    }

    @Test
    public void Decrypt_decryptsbyKey() {
        Decrypt testDecrypt = new Decrypt("ecv", 2);
        assertEquals("cat", testDecrypt.Decrypt());
    }
}