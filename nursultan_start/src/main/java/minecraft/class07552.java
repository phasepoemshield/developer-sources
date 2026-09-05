/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.function.BooleanSupplier;
import minecraft.class07536;

class class07552
implements BooleanSupplier {
    final /* synthetic */ Path N;

    @Override
    public boolean getAsBoolean() {
        try {
            Files.deleteIfExists(this.N);
            return true;
        }
        catch (IOException iOException) {
            class07536.N.warn("Failed to delete", (Throwable)iOException);
            return false;
        }
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    class07552(Path path) {
        this.N = path;
    }

    public String toString() {
        return "delete old " + String.valueOf(this.N);
    }
}

