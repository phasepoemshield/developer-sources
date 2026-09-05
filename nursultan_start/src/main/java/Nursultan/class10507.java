/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

import java.io.IOException;
import java.nio.file.Path;

public class class10507
extends IOException {
    private class10507(Path path, String string) {
        super(String.valueOf(path.toAbsolutePath()) + ": " + string);
    }

    public static class10507 N(Path path) {
        return new class10507(path, "already locked (possibly by other Minecraft instance?)");
    }
}

