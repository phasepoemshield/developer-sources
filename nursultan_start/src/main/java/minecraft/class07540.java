/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.function.BooleanSupplier;

class class07540
implements BooleanSupplier {
    final /* synthetic */ Path N;

    @Override
    public boolean getAsBoolean() {
        return !Files.exists(this.N, new LinkOption[0]);
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    class07540(Path path) {
        this.N = path;
    }

    public String toString() {
        return "verify that " + String.valueOf(this.N) + " is deleted";
    }
}

