import org.junit.*;
import static org.junit.Assert.*;

public class EncryptTest {

    @Test
    public void Encrypt_acceptsaString() {
        Encrypt testEncrypt = new Encrypt("a", 2);
        assertEquals("a", testEncrypt.getmName());
    }

    @Test
    public void Encrypt_acceptsaKey() {
        Encrypt testEncrypt = new Encrypt("a", 2);
        assertEquals(2, testEncrypt.getmKey());
    }

    @Test
    public void Encrypt_encryptsbyKey() {
        Encrypt testEncrypt = new Encrypt("cat", 2);
        assertEquals("ecv", testEncrypt.Encrypt());
    }
}