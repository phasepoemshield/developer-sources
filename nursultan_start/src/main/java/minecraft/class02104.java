/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import java.util.Map;
import minecraft.class02108;
import minecraft.class02117;
import org.jspecify.annotations.Nullable;

public class class02104 {
    private final Map<class02117<?>, Object> N = new Reference2ObjectOpenHashMap();

    class02104() {
    }

    public <T> class02104 y(class02117<T> class021172, @Nullable T t) {
        if (t != null) {
            this.N.put(class021172, t);
        }
        return this;
    }

    public <T> class02104 N(class02117<T> class021172, T t) {
        this.N.put(class021172, t);
        return this;
    }

    public class02104 N(class02108 class021082) {
        this.N.putAll(class021082.N);
        return this;
    }

    public class02108 N() {
        return new class02108(this.N);
    }
}

