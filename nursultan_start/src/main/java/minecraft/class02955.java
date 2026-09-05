/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

import java.util.Map;
import minecraft.class02968;

public class class02955 {
    private static final class02955 N = new class02955(Map.of());
    private final Map<class02968<?>, ?> y;

    private class02955(Map<class02968<?>, ?> map) {
        this.y = map;
    }

    public static <T> class02955 N(class02968<T> class029682, T t) {
        return new class02955(Map.of(class029682, t));
    }

    public static <T1, T2> class02955 N(class02968<T1> class029682, T1 T1, class02968<T2> class029683, T2 T2) {
        return new class02955(Map.of(class029682, T1, class029683, T2));
    }

    public <T> T N(class02968<T> class029682) {
        return (T)this.y.get(class029682);
    }

    public static class02955 N() {
        return N;
    }
}

