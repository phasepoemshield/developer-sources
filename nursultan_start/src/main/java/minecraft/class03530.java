/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Interner
 *  com.google.common.collect.Interners
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  io.netty.buffer.ByteBuf
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00751
 *  minecraft.class01894
 *  minecraft.class02362
 *  minecraft.class05946
 *  net.fabricmc.fabric.api.tag.FabricTagKey
 *  net.fabricmc.fabric.mixin.tag.convention.TagKeyMixin
 */
package minecraft;

import com.google.common.collect.Interner;
import com.google.common.collect.Interners;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class00751;
import minecraft.class01894;
import minecraft.class02362;
import minecraft.class05946;
import net.fabricmc.fabric.api.tag.FabricTagKey;
import net.fabricmc.fabric.mixin.tag.convention.TagKeyMixin;

public final class class03530<T>
extends Record
implements FabricTagKey,
TagKeyMixin {
    private final class05946<? extends class00751<T>> registry;
    private final class01894 location;
    private static final Interner<class03530<?>> L = Interners.newWeakInterner();

    public static <T> class02362<ByteBuf, class03530<T>> L(class05946<? extends class00751<T>> class059462) {
        return class01894.y.N_10(class018942 -> class03530.N(class059462, class018942), class03530::y);
    }

    @Deprecated
    public class03530(class05946<? extends class00751<T>> class059462, class01894 class018942) {
        this.registry = class059462;
        this.location = class018942;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03530.class, "registry;location", "registry", "location"}, this, object);
    }

    public String toString() {
        return "TagKey[" + String.valueOf(this.registry.N()) + " / " + String.valueOf(this.location) + "]";
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03530.class, "registry;location", "registry", "location"}, this);
    }

    public <E> Optional<class03530<E>> i(class05946<? extends class00751<E>> class059462) {
        return this.u(class059462) ? Optional.of(this) : Optional.empty();
    }

    public boolean u(class05946<? extends class00751<?>> class059462) {
        return this.registry == class059462;
    }

    public static <T> Codec<class03530<T>> y(class05946<? extends class00751<T>> class059462) {
        return Codec.STRING.comapFlatMap(string -> string.startsWith("#") ? class01894.u((String)string.substring(1)).map(class018942 -> class03530.N(class059462, class018942)) : DataResult.error(() -> "Not a tag id"), class035302 -> "#" + String.valueOf(class035302.location));
    }

    public class01894 y() {
        return this.location;
    }

    public static <T> Codec<class03530<T>> N(class05946<? extends class00751<T>> class059462) {
        return class01894.N.xmap(class018942 -> class03530.N(class059462, class018942), class03530::y);
    }

    public static <T> class03530<T> N(class05946<? extends class00751<T>> class059462, class01894 class018942) {
        return (class03530)((Object)L.intern(new class03530<T>(class059462, class018942)));
    }

    public class05946<? extends class00751<T>> N() {
        return this.registry;
    }
}

