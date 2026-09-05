/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00198
 *  org.jspecify.annotations.Nullable
 */
package Nursultan;

import java.io.File;
import java.nio.file.Path;
import minecraft.class00198;
import org.jspecify.annotations.Nullable;

public class class09428 {
    public final File N;
    public final File y;
    public final File L;
    public final @Nullable String u;

    public class09428(File file, File file2, File file3, @Nullable String string) {
        this.N = file;
        this.y = file2;
        this.L = file3;
        this.u = string;
    }

    public Path N() {
        return this.u == null ? this.L.toPath() : class00198.N((Path)this.L.toPath(), (String)this.u);
    }
}

