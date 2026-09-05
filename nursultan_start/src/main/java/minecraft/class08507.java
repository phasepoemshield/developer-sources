/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02968
 */
package minecraft;

import com.mojang.serialization.Codec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Map;
import minecraft.class02968;
import minecraft.class08430;

public final class class08507
extends Record {
    private final Map<String, class08430> languages;
    public static final Codec<String> N = Codec.string((int)1, (int)16);
    public static final Codec<class08507> y = Codec.unboundedMap(N, class08430.N).xmap(class08507::new, class08507::N);
    public static final class02968<class08507> L = new class02968("language", y);

    public class08507(Map<String, class08430> map) {
        this.languages = map;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08507.class, "languages", "languages"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08507.class, "languages", "languages"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08507.class, "languages", "languages"}, this);
    }

    public Map<String, class08430> N() {
        return this.languages;
    }
}

