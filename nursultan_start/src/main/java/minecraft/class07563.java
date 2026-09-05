/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.function.BooleanSupplier;
import minecraft.class07536;

class class07563
implements BooleanSupplier {
    final /* synthetic */ Path N;
    final /* synthetic */ Path y;

    @Override
    public boolean getAsBoolean() {
        try {
            Files.move(this.N, this.y, new CopyOption[0]);
            return true;
        }
        catch (IOException iOException) {
            class07536.N.error("Failed to rename", (Throwable)iOException);
            return false;
        }
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    class07563(Path path, Path path2) {
        this.N = path;
        this.y = path2;
    }

    public String toString() {
        return "rename " + String.valueOf(this.N) + " to " + String.valueOf(this.y);
    }
}

