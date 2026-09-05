/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  minecraft.class01929
 *  minecraft.class08296
 *  minecraft.class08299
 */
package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import minecraft.class01929;
import minecraft.class08296;
import minecraft.class08299;
import minecraft.class08310;
import minecraft.class08319;

class class08315
implements class08299 {
    final /* synthetic */ class08296 N;

    public Optional<class08319> L(String string) {
        return Optional.empty();
    }

    public <T> class08310<T> L(String string, Codec<T> codec) {
        return this.N.i();
    }

    public Optional<String> M(String string) {
        return Optional.empty();
    }

    class08315(class08296 class082962) {
        this.N = class082962;
    }

    public Optional<int[]> B(String string) {
        return Optional.empty();
    }

    public Optional<Integer> i(String string) {
        return Optional.empty();
    }

    public class08319 u(String string) {
        return this.N.y;
    }

    public class08299 y(String string) {
        return this;
    }

    public <T> Optional<class08310<T>> y(String string, Codec<T> codec) {
        return Optional.empty();
    }

    public <T> Optional<T> N(String string, Codec<T> codec) {
        return Optional.empty();
    }

    public double N(String string, double d) {
        return d;
    }

    public float N(String string, float f) {
        return f;
    }

    public String N(String string, String string2) {
        return string2;
    }

    public class01929 N() {
        return this.N.N;
    }

    public int N(String string, short s) {
        return s;
    }

    public boolean N(String string, boolean bl) {
        return bl;
    }

    public byte N(String string, byte by) {
        return by;
    }

    public Optional<class08299> N(String string) {
        return Optional.empty();
    }

    public <T> Optional<T> N(MapCodec<T> mapCodec) {
        return Optional.empty();
    }

    public long N(String string, long l) {
        return l;
    }

    public int N(String string, int n) {
        return n;
    }

    public Optional<Long> R(String string) {
        return Optional.empty();
    }
}

