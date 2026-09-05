/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02055
 *  minecraft.class03530
 *  minecraft.class03541
 *  minecraft.class03543
 *  minecraft.class03556
 *  minecraft.class04227
 *  minecraft.class05946
 *  minecraft.class07078
 */
package minecraft;

import com.mojang.serialization.Codec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class02055;
import minecraft.class03530;
import minecraft.class03541;
import minecraft.class03543;
import minecraft.class03556;
import minecraft.class04227;
import minecraft.class05946;
import minecraft.class07078;

public final class class00829
extends Record {
    private final class03543<class07078<?>> types;
    public static final Codec<class00829> N = class03541.N((class05946)class04227.I).xmap(class00829::new, class00829::N);

    public class00829(class03543<class07078<?>> class035432) {
        this.types = class035432;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00829.class, "types", "types"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00829.class, "types", "types"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00829.class, "types", "types"}, this);
    }

    public static class00829 N(class02055<class07078<?>> class020552, class03530<class07078<?>> class035302) {
        return new class00829((class03543<class07078<?>>)class020552.y(class035302));
    }

    public class03543<class07078<?>> N() {
        return this.types;
    }

    public boolean N(class07078<?> class070782) {
        return class070782.N(this.types);
    }

    public static class00829 N(class02055<class07078<?>> class020552, class07078<?> class070782) {
        return new class00829((class03543<class07078<?>>)class03543.N((class03556[])new class03556[]{class070782.T()}));
    }
}

