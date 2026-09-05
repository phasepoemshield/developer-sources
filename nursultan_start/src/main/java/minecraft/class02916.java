/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02826
 */
package minecraft;

import com.mojang.serialization.Codec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.function.Predicate;
import minecraft.class02826;

public final class class02916
extends Record
implements Predicate<class02826<String>> {
    private final String contents;
    public static final Codec<class02916> N = Codec.STRING.xmap(class02916::new, class02916::N);

    public class02916(String string) {
        this.contents = string;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02916.class, "contents", "contents"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02916.class, "contents", "contents"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02916.class, "contents", "contents"}, this);
    }

    public String N() {
        return this.contents;
    }

    @Override
    public boolean test(class02826<String> class028262) {
        return ((String)class028262.N()).equals(this.contents);
    }
}

