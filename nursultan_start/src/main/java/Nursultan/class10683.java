/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

import java.nio.file.Path;

public class class10683
extends RuntimeException {
    public class10683(Path path, Throwable throwable) {
        super(path.toAbsolutePath().toString(), throwable);
    }
}

