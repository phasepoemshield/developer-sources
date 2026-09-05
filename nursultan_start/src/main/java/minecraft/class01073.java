/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Objects;
import minecraft.class01089;
import minecraft.class01092;

public final class class01073 {
    private final class01089 N;
    private final Map<class01092<?>, Object> y = new IdentityHashMap();

    public class01073(class01089 class010892) {
        this.N = class010892;
    }

    public <T> T N(class01092<T> class010922) {
        return (T)Objects.requireNonNull(this.y.get(class010922));
    }

    public <T> void N(class01092<T> class010922, T t) {
        this.y.put(class010922, t);
    }

    public class01089 N() {
        return this.N;
    }
}

