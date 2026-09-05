/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.ImmutableStringReader
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.serialization.Decoder
 *  com.mojang.serialization.Dynamic
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01894
 *  minecraft.class02487
 *  minecraft.class02500
 *  minecraft.class03529
 *  minecraft.class06584
 */
package minecraft;

import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Decoder;
import com.mojang.serialization.Dynamic;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.function.Predicate;
import minecraft.class01894;
import minecraft.class02487;
import minecraft.class02500;
import minecraft.class03529;
import minecraft.class06584;
import minecraft.class06793;

final class class06764
extends Record {
    private final class01894 id;
    private final Decoder<? extends Predicate<class06584>> type;

    public class06764(class03529<class02487<?>> class035292) {
        this(class035292.B().N(), (Decoder<? extends Predicate<class06584>>)((class02487)class035292.N()).L().map(class025002 -> arg_0 -> ((class02500)class025002).N(arg_0)));
    }

    class06764(class01894 class018942, Decoder<? extends Predicate<class06584>> decoder) {
        this.id = class018942;
        this.type = decoder;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class06764.class, "id;type", "id", "type"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class06764.class, "id;type", "id", "type"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class06764.class, "id;type", "id", "type"}, this);
    }

    public Decoder<? extends Predicate<class06584>> y() {
        return this.type;
    }

    public class01894 N() {
        return this.id;
    }

    public Predicate<class06584> N(ImmutableStringReader immutableStringReader, Dynamic<?> dynamic) throws CommandSyntaxException {
        return (Predicate)this.type.parse(dynamic).getOrThrow(string -> class06793.R.createWithContext(immutableStringReader, (Object)this.id.toString(), string));
    }
}

