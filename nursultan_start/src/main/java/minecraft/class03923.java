/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class04336
 *  minecraft.class07536
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.function.ToIntFunction;
import minecraft.class04336;
import minecraft.class07536;

public final class class03923
extends Record {
    private final List<class04336> features;
    private final ToIntFunction<class04336> indexMapping;

    class03923(List<class04336> list) {
        this(list, class07536.M(list));
    }

    public class03923(List<class04336> list, ToIntFunction<class04336> toIntFunction) {
        this.features = list;
        this.indexMapping = toIntFunction;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03923.class, "features;indexMapping", "features", "indexMapping"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03923.class, "features;indexMapping", "features", "indexMapping"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03923.class, "features;indexMapping", "features", "indexMapping"}, this);
    }

    public ToIntFunction<class04336> y() {
        return this.indexMapping;
    }

    public List<class04336> N() {
        return this.features;
    }
}

