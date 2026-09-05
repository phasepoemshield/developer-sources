/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10549
 *  com.google.common.collect.MapMaker
 *  com.mojang.serialization.Codec
 *  io.netty.buffer.ByteBuf
 *  minecraft.class00751
 *  minecraft.class01894
 *  minecraft.class02362
 *  minecraft.class04227
 */
package minecraft;

import Nursultan.class10549;
import com.google.common.collect.MapMaker;
import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.concurrent.ConcurrentMap;
import minecraft.class00751;
import minecraft.class01894;
import minecraft.class02362;
import minecraft.class04227;

public class class05946<T> {
    private static final ConcurrentMap<class10549, class05946<?>> N = new MapMaker().weakValues().makeMap();
    private final class01894 y;
    private final class01894 L;

    public boolean L(class05946<? extends class00751<?>> class059462) {
        return this.y.equals((Object)class059462.N());
    }

    public class05946<class00751<T>> L() {
        return class05946.N(this.y);
    }

    private class05946(class01894 class018942, class01894 class018943) {
        this.y = class018942;
        this.L = class018943;
    }

    public String toString() {
        return "ResourceKey[" + String.valueOf(this.y) + " / " + String.valueOf(this.L) + "]";
    }

    public <E> Optional<class05946<E>> u(class05946<? extends class00751<E>> class059462) {
        return this.L(class059462) ? Optional.of(this) : Optional.empty();
    }

    public class01894 y() {
        return this.y;
    }

    public static <T> class02362<ByteBuf, class05946<T>> y(class05946<? extends class00751<T>> class059462) {
        return class01894.y.N_10(class018942 -> class05946.N(class059462, class018942), class05946::N);
    }

    public static <T> Codec<class05946<T>> N(class05946<? extends class00751<T>> class059462) {
        return class01894.N.xmap(class018942 -> class05946.N(class059462, class018942), class05946::N);
    }

    private static <T> class05946<T> N(class01894 class018942, class01894 class018943) {
        return (class05946)N.computeIfAbsent(new class10549(class018942, class018943), class105492 -> new class05946(class105492.N(), class105492.y()));
    }

    public static <T> class05946<class00751<T>> N(class01894 class018942) {
        return class05946.N(class04227.N, class018942);
    }

    public class01894 N() {
        return this.L;
    }

    public static <T> class05946<T> N(class05946<? extends class00751<T>> class059462, class01894 class018942) {
        return class05946.N(class059462.L, class018942);
    }
}

