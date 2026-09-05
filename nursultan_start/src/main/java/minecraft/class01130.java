/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07321
 */
package minecraft;

import java.util.List;
import java.util.stream.Stream;
import minecraft.class07321;

public class class01130<T> {
    private final class07321 N;
    private final List<T> y;

    public boolean L() {
        return this.y.isEmpty();
    }

    public class01130(class07321 class073212, List<T> list) {
        this.N = class073212;
        this.y = list;
    }

    public Stream<T> y() {
        return this.y.stream();
    }

    public class07321 N() {
        return this.N;
    }
}

