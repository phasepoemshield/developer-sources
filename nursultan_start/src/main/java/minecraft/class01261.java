/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  io.netty.buffer.ByteBuf
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02362
 *  minecraft.class02389
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class02362;
import minecraft.class02389;

public final class class01261
extends Record {
    final boolean open;
    final boolean filtering;
    public static final class01261 L = new class01261(false, false);
    public static final MapCodec<class01261> u = class01261.N("isGuiOpen", "isFilteringCraftable");
    public static final MapCodec<class01261> i = class01261.N("isFurnaceGuiOpen", "isFurnaceFilteringCraftable");
    public static final MapCodec<class01261> R = class01261.N("isBlastingFurnaceGuiOpen", "isBlastingFurnaceFilteringCraftable");
    public static final MapCodec<class01261> M = class01261.N("isSmokerGuiOpen", "isSmokerFilteringCraftable");
    public static final class02362<ByteBuf, class01261> B = class02362.N((class02362)class02389.y, class01261::N, (class02362)class02389.y, class01261::y, class01261::new);

    public class01261(boolean bl, boolean bl2) {
        this.open = bl;
        this.filtering = bl2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class01261.class, "open;filtering", "open", "filtering"}, this, object);
    }

    public String toString() {
        return "[open=" + this.open + ", filtering=" + this.filtering + "]";
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class01261.class, "open;filtering", "open", "filtering"}, this);
    }

    public boolean y() {
        return this.filtering;
    }

    public class01261 y(boolean bl) {
        return new class01261(this.open, bl);
    }

    public class01261 N(boolean bl) {
        return new class01261(bl, this.filtering);
    }

    private static MapCodec<class01261> N(String string, String string2) {
        return RecordCodecBuilder.mapCodec(instance -> instance.group((App)Codec.BOOL.optionalFieldOf(string, (Object)false).forGetter(class01261::N), (App)Codec.BOOL.optionalFieldOf(string2, (Object)false).forGetter(class01261::y)).apply((Applicative)instance, class01261::new));
    }

    public boolean N() {
        return this.open;
    }
}

