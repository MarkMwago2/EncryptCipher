import org.junit.*;
import static org.junit.Assert.*;

public class EncryptTest {

    @Test
    public void Encrypt_acceptsaString() {
        Encrypt testEncrypt = new Encrypt("a", 2);
        assertEquals("a", testEncrypt.getmName());
    }
}