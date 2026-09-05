/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package minecraft;

import com.mojang.serialization.Codec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import minecraft.class08556;
import minecraft.class08568;
import minecraft.class08578;
import minecraft.class08579;

public final class class08585
extends Record {
    private final List<class08556<class08579, class08568>> selectors;
    public static final class08585 N = new class08585(List.of());
    public static final Codec<class08585> y = class08556.N(class08568.y).listOf().xmap(class08585::new, class08585::N);

    public class08585(List<class08556<class08579, class08568>> list) {
        this.selectors = list;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08585.class, "selectors", "selectors"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08585.class, "selectors", "selectors"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08585.class, "selectors", "selectors"}, this);
    }

    public static class08585 N(class08568 class085682, int n) {
        return new class08585(class08578.N(class085682, n));
    }

    public List<class08556<class08579, class08568>> N() {
        return this.selectors;
    }

    public static class08585 N(int n) {
        return new class08585(class08578.N(n));
    }
}

