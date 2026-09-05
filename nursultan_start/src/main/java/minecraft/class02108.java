/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Map;
import java.util.Set;
import minecraft.class02104;
import minecraft.class02117;
import minecraft.class02130;
import org.jspecify.annotations.Nullable;

public class class02108 {
    final Map<class02117<?>, Object> N;

    class02108(Map<class02117<?>, Object> map) {
        this.N = map;
    }

    public String toString() {
        return this.N.toString();
    }

    public Set<class02117<?>> y() {
        return this.N.keySet();
    }

    public static MapCodec<class02108> N(List<class02117<?>> list) {
        return new class02130(list);
    }

    public static class02104 N() {
        return new class02104();
    }

    public <T> @Nullable T N(class02117<T> class021172) {
        return (T)this.N.get(class021172);
    }
}

