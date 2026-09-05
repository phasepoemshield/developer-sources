/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10291
 *  Nursultan.class10292
 *  Nursultan.class10295
 *  Nursultan.class10302
 *  com.google.common.base.Suppliers
 *  minecraft.class00751
 *  minecraft.class00780
 *  minecraft.class01837
 *  minecraft.class03019
 *  minecraft.class03556
 *  minecraft.class04995
 *  minecraft.class06057
 *  minecraft.class07209
 *  minecraft.class07218
 *  minecraft.class07321
 *  minecraft.class08050
 */
package minecraft;

import Nursultan.class10291;
import Nursultan.class10292;
import Nursultan.class10295;
import Nursultan.class10302;
import com.google.common.base.Suppliers;
import java.util.function.Function;
import java.util.function.Supplier;
import minecraft.class00751;
import minecraft.class00780;
import minecraft.class01837;
import minecraft.class03019;
import minecraft.class03556;
import minecraft.class04018;
import minecraft.class04084;
import minecraft.class04995;
import minecraft.class06057;
import minecraft.class07209;
import minecraft.class07218;
import minecraft.class07321;
import minecraft.class08050;

public final class class04039 {
    private static final int v = 8;
    private static final int n = 4;
    private static final int t = 16;
    private static final int G = 15;
    final class03019 N;
    final class04018 y = new class10292(this);
    final class04018 L = new class10295(this);
    final class04018 u = new class10291(this);
    final class04018 i = new class10302(this);
    final class04084 R;
    public final class08050 M;
    private final class01837 l;
    private final Function<class07209, class03556<class00780>> d;
    public final class06057 B;
    private long w = Long.MAX_VALUE;
    private final int[] k = new int[4];
    public long Z = -9223372036854775807L;
    public int z;
    public int U;
    public int E;
    private long Y = this.Z - 1L;
    private double Q;
    private long O = this.Z - 1L;
    private int g;
    public long W = -9223372036854775807L;
    public final class07218 m = new class07218();
    public Supplier<class03556<class00780>> P;
    public int s;
    public int T;
    public int b;
    public int j;

    public int L() {
        if (this.O != this.Z) {
            int n;
            this.O = this.Z;
            int n2 = class04039.N(this.z);
            long l = class07321.u((int)n2, (int)(n = class04039.N(this.U)));
            if (this.w != l) {
                this.w = l;
                this.k[0] = this.l.N(class04039.y(n2), class04039.y(n));
                this.k[1] = this.l.N(class04039.y(n2 + 1), class04039.y(n));
                this.k[2] = this.l.N(class04039.y(n2), class04039.y(n + 1));
                this.k[3] = this.l.N(class04039.y(n2 + 1), class04039.y(n + 1));
            }
            int n3 = class04995.N((double)class04995.N((double)((float)(this.z & 0xF) / 16.0f), (double)((float)(this.U & 0xF) / 16.0f), (double)this.k[0], (double)this.k[1], (double)this.k[2], (double)this.k[3]));
            this.g = n3 + this.E - 8;
        }
        return this.g;
    }

    protected class04039(class03019 class030192, class04084 class040842, class08050 class080502, class01837 class018372, Function<class07209, class03556<class00780>> function, class00751<class00780> class007512, class06057 class060572) {
        this.N = class030192;
        this.R = class040842;
        this.M = class080502;
        this.l = class018372;
        this.d = function;
        this.B = class060572;
    }

    public int y() {
        return this.N.N();
    }

    private static int y(int n) {
        return n << 4;
    }

    protected void N(int n, int n2) {
        ++this.Z;
        ++this.W;
        this.z = n;
        this.U = n2;
        this.E = this.N.N(n, n2);
    }

    protected void N(int n, int n2, int n3, int n4, int n5, int n6) {
        ++this.W;
        this.P = Suppliers.memoize(() -> this.d.apply((class07209)this.m.N(n4, n5, n6)));
        this.s = n5;
        this.T = n3;
        this.b = n2;
        this.j = n;
    }

    private static int N(int n) {
        return n >> 4;
    }

    public double N() {
        if (this.Y != this.Z) {
            this.Y = this.Z;
            this.Q = this.N.y(this.z, this.U);
        }
        return this.Q;
    }
}

