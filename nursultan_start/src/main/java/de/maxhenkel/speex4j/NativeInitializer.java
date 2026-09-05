/*
 * Decompiled with CFR 0.152.
 */
package de.maxhenkel.speex4j;

import de.maxhenkel.speex4j.LibraryLoader;
import de.maxhenkel.speex4j.UnknownPlatformException;
import java.io.IOException;

public class NativeInitializer {
    private static boolean loaded;
    private static Exception error;

    public static void load(String string) throws UnknownPlatformException, IOException {
        if (loaded) {
            if (error != null) {
                if (error instanceof IOException) {
                    throw new IOException(error.getMessage());
                }
                if (error instanceof UnknownPlatformException) {
                    throw new UnknownPlatformException(error.getMessage());
                }
                throw new RuntimeException(error.getMessage());
            }
            return;
        }
        try {
            LibraryLoader.load(string);
            loaded = true;
        }
        catch (UnknownPlatformException | IOException exception) {
            error = exception;
            throw exception;
        }
    }

    public static boolean isLoaded() {
        return loaded && error == null;
    }
}

