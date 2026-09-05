/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00392
 *  minecraft.class02826
 *  minecraft.class03748
 */
package minecraft;

import com.mojang.serialization.Codec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.function.Predicate;
import minecraft.class00392;
import minecraft.class02826;
import minecraft.class03748;

public final class class02920
extends Record
implements Predicate<class02826<class00392>> {
    private final class00392 contents;
    public static final Codec<class02920> N = class03748.N.xmap(class02920::new, class02920::N);

    public class02920(class00392 class003922) {
        this.contents = class003922;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02920.class, "contents", "contents"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02920.class, "contents", "contents"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02920.class, "contents", "contents"}, this);
    }

    public class00392 N() {
        return this.contents;
    }

    @Override
    public boolean test(class02826<class00392> class028262) {
        return ((class00392)class028262.N()).equals((Object)this.contents);
    }
}

