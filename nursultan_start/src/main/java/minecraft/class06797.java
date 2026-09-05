/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.ImmutableStringReader
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.Decoder
 *  com.mojang.serialization.Dynamic
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01894
 *  minecraft.class02477
 *  minecraft.class06584
 */
package minecraft;

import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Decoder;
import com.mojang.serialization.Dynamic;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Objects;
import java.util.function.Predicate;
import minecraft.class01894;
import minecraft.class02477;
import minecraft.class06584;
import minecraft.class06793;

final class class06797
extends Record {
    private final class01894 id;
    final Predicate<class06584> presenceChecker;
    private final Decoder<? extends Predicate<class06584>> valueChecker;

    public Decoder<? extends Predicate<class06584>> L() {
        return this.valueChecker;
    }

    class06797(class01894 class018942, Predicate<class06584> predicate, Decoder<? extends Predicate<class06584>> decoder) {
        this.id = class018942;
        this.presenceChecker = predicate;
        this.valueChecker = decoder;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class06797.class, "id;presenceChecker;valueChecker", "id", "presenceChecker", "valueChecker"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class06797.class, "id;presenceChecker;valueChecker", "id", "presenceChecker", "valueChecker"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class06797.class, "id;presenceChecker;valueChecker", "id", "presenceChecker", "valueChecker"}, this);
    }

    public Predicate<class06584> y() {
        return this.presenceChecker;
    }

    public class01894 N() {
        return this.id;
    }

    public Predicate<class06584> N(ImmutableStringReader immutableStringReader, Dynamic<?> dynamic) throws CommandSyntaxException {
        return (Predicate)this.valueChecker.parse(dynamic).getOrThrow(string -> class06793.u.createWithContext(immutableStringReader, (Object)this.id.toString(), string));
    }

    public static <T> class06797 N(ImmutableStringReader immutableStringReader, class01894 class018942, class02477<T> class024772) throws CommandSyntaxException {
        Codec codec = class024772.y();
        if (codec == null) {
            throw class06793.L.createWithContext(immutableStringReader, (Object)class018942);
        }
        return new class06797(class018942, class065842 -> class065842.L(class024772), (Decoder<? extends Predicate<class06584>>)codec.map(object -> class065842 -> {
            Object object2 = class065842.method_58694(class024772);
            return Objects.equals(object, object2);
        }));
    }
}

