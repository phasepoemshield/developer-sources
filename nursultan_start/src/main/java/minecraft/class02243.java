/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Either
 *  io.netty.buffer.ByteBuf
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00392
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class03748
 */
package minecraft;

import com.mojang.datafixers.util.Either;
import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Optional;
import minecraft.class00392;
import minecraft.class02213;
import minecraft.class02222;
import minecraft.class02231;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class03748;

public final class class02243
extends Record {
    private final List<class02213> entries;
    public static final class02243 N = new class02243(List.of());
    public static final class02362<ByteBuf, Either<class02222, class00392>> y = class02389.N(class02222.field_51982, (class02362)class03748.R);
    public static final class02362<ByteBuf, List<class02231>> L = class02231.N.N_33(class02389.N());

    public List<class02213> L() {
        return this.entries;
    }

    public class02243(List<class02213> list) {
        this.entries = list;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02243.class, "entries", "entries"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02243.class, "entries", "entries"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02243.class, "entries", "entries"}, this);
    }

    public List<class02231> y() {
        return this.entries.stream().map(class022132 -> new class02231(class022132.y(), class022132.L().toString())).toList();
    }

    public Optional<class02213> N(class02222 class022222) {
        return this.entries.stream().filter(class022132 -> (Boolean)class022132.y().map(class022223 -> class022223 == class022222, class003922 -> false)).findFirst();
    }

    public boolean N() {
        return this.entries.isEmpty();
    }
}

