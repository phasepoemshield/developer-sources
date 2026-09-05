/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class07536
 */
package minecraft;

import com.mojang.serialization.Codec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Map;
import minecraft.class02685;
import minecraft.class07536;

public final class class02719
extends Record {
    private final Map<String, class02685> decorations;
    public static final class02719 N = new class02719(Map.of());
    public static final Codec<class02719> y = Codec.unboundedMap((Codec)Codec.STRING, class02685.N).xmap(class02719::new, class02719::N);

    public class02719(Map<String, class02685> map) {
        this.decorations = map;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02719.class, "decorations", "decorations"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02719.class, "decorations", "decorations"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02719.class, "decorations", "decorations"}, this);
    }

    public Map<String, class02685> N() {
        return this.decorations;
    }

    public class02719 N(String string, class02685 class026852) {
        return new class02719(class07536.N(this.decorations, (Object)string, (Object)((Object)class026852)));
    }
}

