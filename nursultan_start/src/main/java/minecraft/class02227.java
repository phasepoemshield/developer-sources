/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class07282
 */
package minecraft;

import com.mojang.serialization.Codec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Arrays;
import java.util.List;
import minecraft.class07282;

public final class class02227
extends Record {
    private final List<class07282> types;
    public static final class02227 N = class02227.N(class07282.values());
    public static final class02227 y = class02227.N(class07282.field_9215, class07282.field_9216);
    public static final Codec<class02227> L = class07282.field_41676.listOf().xmap(class02227::new, class02227::N);

    public class02227(List<class07282> list) {
        this.types = list;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02227.class, "types", "types"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02227.class, "types", "types"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02227.class, "types", "types"}, this);
    }

    public static class02227 N(class07282 ... class07282Array) {
        return new class02227(Arrays.stream(class07282Array).toList());
    }

    public List<class07282> N() {
        return this.types;
    }

    public boolean N(class07282 class072822) {
        return this.types.contains(class072822);
    }
}

