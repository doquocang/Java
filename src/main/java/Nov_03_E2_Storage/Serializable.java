package Nov_03_E2_Storage;

import java.io.IOException;
/**
 *
 * @author admin
 */
public interface Serializable {
    public abstract void writeObject() throws IOException;
    public abstract void readObject() throws IOException;
}
