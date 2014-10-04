package demibenari.entities;

import com.google.inject.Singleton;

/**
 * Created by Demi Ben-Ari on 9/30/2014.
 */
@Singleton
public class SimpleIDGenerator implements IDGenerator {
    private static int currentId = 1;

    @Override
    public int nextID() {
        return currentId++;
    }
}
