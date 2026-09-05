/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10415
 *  com.mojang.serialization.Codec
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00751
 *  minecraft.class01381
 *  minecraft.class04227
 *  minecraft.class04489
 *  minecraft.class05074
 *  minecraft.class05561
 *  minecraft.class05946
 *  minecraft.class05957
 *  minecraft.class07439
 *  minecraft.class08122
 */
package minecraft;

import Nursultan.class10415;
import com.mojang.serialization.Codec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.stream.Stream;
import minecraft.class00751;
import minecraft.class01381;
import minecraft.class03350;
import minecraft.class04227;
import minecraft.class04489;
import minecraft.class05074;
import minecraft.class05561;
import minecraft.class05946;
import minecraft.class05957;
import minecraft.class07439;
import minecraft.class08122;

public final class class03347<T>
extends Record {
    private final class05946<class00751<T>> registryKey;
    private final Codec<T> codec;
    private final class03350<T> validator;
    public static final class03347<class05957> N = new class03347(class04227.yq, class05957.L, class03347.i());
    public static final class03347<class08122> y = new class03347(class04227.yo, class07439.L, class03347.i());
    public static final class03347<class05074> L = new class03347<class05074>(class04227.yJ, class05074.u, class03347.R());

    public Codec<T> L() {
        return this.codec;
    }

    public class03347(class05946<class00751<T>> class059462, Codec<T> codec, class03350<T> class033502) {
        this.registryKey = class059462;
        this.codec = codec;
        this.validator = class033502;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03347.class, "registryKey;codec;validator", "registryKey", "codec", "validator"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03347.class, "registryKey;codec;validator", "registryKey", "codec", "validator"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03347.class, "registryKey;codec;validator", "registryKey", "codec", "validator"}, this);
    }

    private static <T extends class01381> class03350<T> i() {
        return (class055612, class059462, class013812) -> class013812.N(class055612.N((class04489)new class10415(class059462), class059462));
    }

    public class03350<T> u() {
        return this.validator;
    }

    public class05946<class00751<T>> y() {
        return this.registryKey;
    }

    public static Stream<class03347<?>> N() {
        return Stream.of(N, y, L);
    }

    public void N(class05561 class055612, class05946<T> class059462, T t) {
        this.validator.run(class055612, class059462, t);
    }

    private static class03350<class05074> R() {
        return (class055612, class059462, class050742) -> class050742.N(class055612.N(class050742.N()).N((class04489)new class10415(class059462), class059462));
    }
}

