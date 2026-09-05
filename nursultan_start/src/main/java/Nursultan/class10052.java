/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09937
 *  Nursultan.class09980
 */
package Nursultan;

import Nursultan.class09937;
import Nursultan.class09980;
import Nursultan.class10021;
import Nursultan.class10026;
import Nursultan.class10030;
import Nursultan.class10032;
import Nursultan.class10036;
import Nursultan.class10045;
import Nursultan.class10048;
import Nursultan.class10054;
import Nursultan.class10055;
import Nursultan.class10056;
import Nursultan.class10061;
import java.util.Objects;

final class class10052 {
    private final class10054 N;
    private final class10021 y;
    private final float L;
    private final float u;
    private final float i;
    private final int R;
    private final class10030 M = new class10030();
    private int B;
    private final class10055 Z;
    private final class10032 z;
    private final class10045 U;

    float L() {
        return this.u;
    }

    int M() {
        return this.B++;
    }

    class10052(class10054 class100542, class10021 class100212, float f, float f2, float f3, int n) {
        this.N = Objects.requireNonNull(class100542, "engine");
        this.y = Objects.requireNonNull(class100212, "root");
        this.L = f;
        this.u = f2;
        this.i = f3;
        this.R = n;
        this.Z = new class10055(this);
        this.z = new class10032(this);
        this.U = new class10045(this);
    }

    void B() {
        this.Z.N();
        this.z.N();
        this.U.N();
        this.y.L(14);
    }

    class10030 i() {
        return this.M;
    }

    int u() {
        return this.R;
    }

    float y() {
        return this.L;
    }

    float N(class10021 class100212, class10036 class100362, float f) {
        float f2 = this.N.y().N(class100212, class100362, f);
        this.N(class100212).N(class100362, !class10048.N(f2, f));
        return f2;
    }

    class10026 N(class10021 class100212, class09980 class099802, float f) {
        return this.N.N(class100212, class099802, f);
    }

    class10021 N() {
        return this.y;
    }

    class10061 N(class10021 class100212) {
        class10061 class100612 = class10052.N(class100212.c());
        if (class100612.z != this.R) {
            class100612.N();
            class100612.z = this.R;
        }
        return class100612;
    }

    class10056 N(class10021 class100212, class09980 class099802) {
        return this.N.N(class100212, class099802);
    }

    private static class10061 N(class09937 class099372) {
        Object object = class099372.N();
        if (object instanceof class10061) {
            class10061 class100612 = (class10061)object;
            return class100612;
        }
        class10061 class100613 = new class10061();
        class099372.N((Object)class100613);
        return class100613;
    }

    float R() {
        return this.i;
    }
}

