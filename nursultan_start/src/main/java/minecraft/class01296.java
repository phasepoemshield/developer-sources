/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09460
 *  io.netty.buffer.ByteBuf
 *  it.unimi.dsi.fastutil.longs.LongConsumer
 *  minecraft.class00737
 *  minecraft.class00753
 *  minecraft.class01135
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class04995
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07321
 *  minecraft.class08050
 */
package minecraft;

import Nursultan.class09460;
import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.longs.LongConsumer;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import minecraft.class00737;
import minecraft.class00753;
import minecraft.class01135;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class04995;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07321;
import minecraft.class08050;

public class class01296
extends class00753 {
    public static final int N = 4;
    public static final int y = 16;
    public static final int L = 15;
    public static final int u = 8;
    public static final int i = 15;
    private static final int M = 22;
    private static final int B = 20;
    private static final int Z = 22;
    private static final long z = 0x3FFFFFL;
    private static final long U = 1048575L;
    private static final long E = 0x3FFFFFL;
    private static final int W = 0;
    private static final int m = 20;
    private static final int P = 42;
    private static final int s = 8;
    private static final int T = 0;
    private static final int b = 4;
    public static final class02362<ByteBuf, class01296> R = class02389.z.N_10(class01296::N, class01296::W);

    public static int L(int n) {
        return n << 4;
    }

    public static int L(long l) {
        return (int)(l << 44 >> 44);
    }

    public static int L(short s) {
        return s >>> 4 & 0xF;
    }

    public int L() {
        return this.method_10260();
    }

    public static long L(class07209 class072092) {
        return class01296.y(class01296.N(class072092.method_10263()), class01296.N(class072092.method_10264()), class01296.N(class072092.method_10260()));
    }

    public class01296 method_34592(int n, int n2, int n3) {
        if (n == 0 && n2 == 0 && n3 == 0) {
            return this;
        }
        return new class01296(this.N() + n, this.y() + n2, this.L() + n3);
    }

    public class07209 M(short s) {
        return new class07209(this.u(s), this.i(s), this.R(s));
    }

    public static long M(long l) {
        return class07321.u((int)class01296.y(l), (int)class01296.u(l));
    }

    public int M() {
        return class01296.N(this.N(), 15);
    }

    public class01296(int n, int n2, int n3) {
        super(n, n2, n3);
    }

    public int B() {
        return class01296.N(this.y(), 15);
    }

    public int Z() {
        return class01296.N(this.L(), 15);
    }

    public int i() {
        return class01296.L(this.y());
    }

    public static long i(long l) {
        return class01296.y(class01296.N(class07209.method_10061((long)l)), class01296.N(class07209.method_10071((long)l)), class01296.N(class07209.method_10083((long)l)));
    }

    public int i(short s) {
        return this.i() + class01296.y(s);
    }

    public Stream<class07209> m() {
        return class07209.method_17962((int)this.u(), (int)this.i(), (int)this.R(), (int)this.M(), (int)this.B(), (int)this.Z());
    }

    public class07209 U() {
        int n = 8;
        return this.z().method_10069(8, 8, 8);
    }

    public class07209 z() {
        return new class07209(class01296.L(this.N()), class01296.L(this.y()), class01296.L(this.L()));
    }

    public static int u(long l) {
        return (int)(l << 22 >> 42);
    }

    public int u() {
        return class01296.L(this.N());
    }

    public int u(short s) {
        return this.u() + class01296.N(s);
    }

    public int y() {
        return this.method_10264();
    }

    public static long y(int n, int n2) {
        return class01296.R(class01296.y(n, 0, n2));
    }

    public static long y(int n, int n2, int n3) {
        long l = 0L;
        l |= ((long)n & 0x3FFFFFL) << 42;
        l |= ((long)n2 & 0xFFFFFL) << 0;
        return l |= ((long)n3 & 0x3FFFFFL) << 20;
    }

    public static int y(short s) {
        return s >>> 0 & 0xF;
    }

    public static short y(class07209 class072092) {
        int n = class01296.y(class072092.method_10263());
        int n2 = class01296.y(class072092.method_10264());
        int n3 = class01296.y(class072092.method_10260());
        return (short)(n << 8 | n3 << 4 | n2 << 0);
    }

    public static int y(int n) {
        return n & 0xF;
    }

    public static int y(double d) {
        return class04995.N((double)d) >> 4;
    }

    public static int y(long l) {
        return (int)(l << 0 >> 42);
    }

    public class07321 E() {
        return new class07321(this.N(), this.L());
    }

    public static Stream<class01296> N(class01296 class012962, int n) {
        int n2 = class012962.N();
        int n3 = class012962.y();
        int n4 = class012962.L();
        return class01296.N(n2 - n, n3 - n, n4 - n, n2 + n, n3 + n, n4 + n);
    }

    public static int N(int n) {
        return n >> 4;
    }

    public static void N(class07209 class072092, LongConsumer longConsumer) {
        class01296.N(class072092.method_10263(), class072092.method_10264(), class072092.method_10260(), longConsumer);
    }

    public static class01296 N(int n, int n2, int n3) {
        return new class01296(n, n2, n3);
    }

    public static Stream<class01296> N(int n, int n2, int n3, int n4, int n5, int n6) {
        return StreamSupport.stream(new class09460((long)((n4 - n + 1) * (n5 - n2 + 1) * (n6 - n3 + 1)), 64, n, n2, n3, n4, n5, n6), false);
    }

    public static Stream<class01296> N(class07321 class073212, int n, int n2, int n3) {
        int n4 = class073212.B;
        int n5 = class073212.Z;
        return class01296.N(n4 - n, n2, n5 - n, n4 + n, n3, n5 + n);
    }

    public static void N(long l, LongConsumer longConsumer) {
        class01296.N(class07209.method_10061((long)l), class07209.method_10071((long)l), class07209.method_10083((long)l), longConsumer);
    }

    public static void N(int n, int n2, int n3, LongConsumer longConsumer) {
        int n4 = class01296.N(n - 1);
        int n5 = class01296.N(n + 1);
        int n6 = class01296.N(n2 - 1);
        int n7 = class01296.N(n2 + 1);
        int n8 = class01296.N(n3 - 1);
        int n9 = class01296.N(n3 + 1);
        if (n4 == n5 && n6 == n7 && n8 == n9) {
            longConsumer.accept(class01296.y(n4, n6, n8));
        } else {
            for (int i = n4; i <= n5; ++i) {
                for (int j = n6; j <= n7; ++j) {
                    for (int k = n8; k <= n9; ++k) {
                        longConsumer.accept(class01296.y(i, j, k));
                    }
                }
            }
        }
    }

    public static class01296 N(class07209 class072092) {
        return new class01296(class01296.N(class072092.method_10263()), class01296.N(class072092.method_10264()), class01296.N(class072092.method_10260()));
    }

    public static long N(long l, class07211 class072112) {
        return class01296.N(l, class072112.P(), class072112.s(), class072112.T());
    }

    public static int N(int n, int n2) {
        return class01296.L(n) + n2;
    }

    public static class01296 N(class08050 class080502) {
        return class01296.N(class080502.R(), class080502.method_32891());
    }

    public int N() {
        return this.method_10263();
    }

    public static long N(long l, int n, int n2, int n3) {
        return class01296.y(class01296.y(l) + n, class01296.L(l) + n2, class01296.u(l) + n3);
    }

    public static int N(double d) {
        return class01296.N(class04995.N((double)d));
    }

    public static int N(short s) {
        return s >>> 8 & 0xF;
    }

    public static class01296 N(class07321 class073212, int n) {
        return new class01296(class073212.B, n, class073212.Z);
    }

    public static class01296 N(class01135 class011352) {
        return class01296.N(class011352.method_24515());
    }

    public static class01296 N(class00737 class007372) {
        return new class01296(class01296.y(class007372.N()), class01296.y(class007372.y()), class01296.y(class007372.L()));
    }

    public static class01296 N(long l) {
        return new class01296(class01296.y(l), class01296.L(l), class01296.u(l));
    }

    public long W() {
        return class01296.y(this.N(), this.y(), this.L());
    }

    public static long R(long l) {
        return l & 0xFFFFFFFFFFF00000L;
    }

    public int R() {
        return class01296.L(this.L());
    }

    public int R(short s) {
        return this.R() + class01296.L(s);
    }
}

