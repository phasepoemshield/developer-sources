/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10736
 *  com.mojang.serialization.Codec
 *  io.netty.buffer.ByteBuf
 *  minecraft.class00549
 *  minecraft.class01296
 *  minecraft.class02238
 *  minecraft.class02362
 *  minecraft.class04995
 *  minecraft.class07209
 *  minecraft.class07536
 */
package minecraft;

import Nursultan.class10736;
import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import minecraft.class00549;
import minecraft.class01296;
import minecraft.class02238;
import minecraft.class02362;
import minecraft.class04995;
import minecraft.class07209;
import minecraft.class07291;
import minecraft.class07536;

public class class07321 {
    public static final Codec<class07321> N = Codec.INT_STREAM.comapFlatMap(intStream -> class07536.N((IntStream)intStream, (int)2).map(nArray -> new class07321(nArray[0], nArray[1])), class073212 -> IntStream.of(class073212.B, class073212.Z)).stable();
    public static final class02362<ByteBuf, class07321> y = new class07291();
    private static final int z = 1056;
    public static final long L = class07321.u(1875066, 1875066);
    private static final int U = (32 + class02238.N.N(class00549.m).L().y() + 1) * 2;
    public static final int u = class01296.N((int)class07209.field_54979) - U;
    public static final class07321 i = new class07321(0, 0);
    private static final long E = 32L;
    private static final long W = 0xFFFFFFFFL;
    private static final int m = 5;
    public static final int R = 32;
    private static final int P = 31;
    public static final int M = 31;
    public final int B;
    public final int Z;
    private static final int s = 1664525;
    private static final int T = 1013904223;
    private static final int b = -559038737;

    public int L() {
        return this.N(8);
    }

    public static boolean L(int n, int n2) {
        return class04995.N((int)n, (int)n2) <= u;
    }

    public class07209 L(int n) {
        return new class07209(this.L(), n, this.u());
    }

    public int L(long l) {
        return this.M(class07321.N(l), class07321.y(l));
    }

    public int M() {
        return this.N(15);
    }

    private int M(int n, int n2) {
        int n3 = n - this.B;
        int n4 = n2 - this.Z;
        return n3 * n3 + n4 * n4;
    }

    public class07321(int n, int n2) {
        this.B = n;
        this.Z = n2;
    }

    public class07321(long l) {
        this.B = (int)l;
        this.Z = (int)(l >> 32);
    }

    public class07321(class07209 class072092) {
        this.B = class01296.N((int)class072092.method_10263());
        this.Z = class01296.N((int)class072092.method_10260());
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof class07321) {
            class07321 class073212 = (class07321)object;
            return this.B == class073212.B && this.Z == class073212.Z;
        }
        return false;
    }

    public String toString() {
        return "[" + this.B + ", " + this.Z + "]";
    }

    public int hashCode() {
        return class07321.i(this.B, this.Z);
    }

    public int B() {
        return this.y(15);
    }

    public int Z() {
        return this.B >> 5;
    }

    public static int i(int n, int n2) {
        int n3 = 1664525 * n + 1013904223;
        int n4 = 1664525 * (n2 ^ 0xDEADBEEF) + 1013904223;
        return n3 ^ n4;
    }

    public int i() {
        return class01296.L((int)this.B);
    }

    public int U() {
        return this.B & 0x1F;
    }

    public int z() {
        return this.Z >> 5;
    }

    public static long u(int n, int n2) {
        return (long)n & 0xFFFFFFFFL | ((long)n2 & 0xFFFFFFFFL) << 32;
    }

    public int u() {
        return this.y(8);
    }

    public long y() {
        return class07321.u(this.B, this.Z);
    }

    public int y(int n) {
        return class01296.N((int)this.Z, (int)n);
    }

    public boolean y(class07209 class072092) {
        return class072092.method_10263() >= this.i() && class072092.method_10260() >= this.R() && class072092.method_10263() <= this.M() && class072092.method_10260() <= this.B();
    }

    public int y(class07321 class073212) {
        return this.M(class073212.B, class073212.Z);
    }

    public static class07321 y(int n, int n2) {
        return new class07321((n << 5) + 31, (n2 << 5) + 31);
    }

    public static int y(long l) {
        return (int)(l >>> 32 & 0xFFFFFFFFL);
    }

    public int E() {
        return this.Z & 0x1F;
    }

    public static class07321 N(int n, int n2) {
        return new class07321(n << 5, n2 << 5);
    }

    public static Stream<class07321> N(class07321 class073212, class07321 class073213) {
        int n = Math.abs(class073212.B - class073213.B) + 1;
        int n2 = Math.abs(class073212.Z - class073213.Z) + 1;
        int n3 = class073212.B < class073213.B ? 1 : -1;
        int n4 = class073212.Z < class073213.Z ? 1 : -1;
        return StreamSupport.stream(new class10736((long)(n * n2), 64, class073212, class073213, n4, n3), false);
    }

    public boolean N() {
        return class07321.L(this.B, this.Z);
    }

    public static Stream<class07321> N(class07321 class073212, int n) {
        return class07321.N(new class07321(class073212.B - n, class073212.Z - n), new class07321(class073212.B + n, class073212.Z + n));
    }

    public static int N(long l) {
        return (int)(l & 0xFFFFFFFFL);
    }

    public class07209 N(int n, int n2, int n3) {
        return new class07209(this.N(n), n2, this.y(n3));
    }

    public int N(int n) {
        return class01296.N((int)this.B, (int)n);
    }

    public int N(class07321 class073212) {
        return this.R(class073212.B, class073212.Z);
    }

    public static long N(class07209 class072092) {
        return class07321.u(class01296.N((int)class072092.method_10263()), class01296.N((int)class072092.method_10260()));
    }

    public class07209 W() {
        return new class07209(this.i(), 0, this.R());
    }

    public int R() {
        return class01296.L((int)this.Z);
    }

    public int R(int n, int n2) {
        return class04995.N((int)n, (int)n2, (int)this.B, (int)this.Z);
    }
}

