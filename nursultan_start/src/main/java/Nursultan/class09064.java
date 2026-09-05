/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11175
 *  Nursultan.class11181
 *  Nursultan.class11199
 */
package Nursultan;

import Nursultan.class09057;
import Nursultan.class09073;
import Nursultan.class09083;
import Nursultan.class09085;
import Nursultan.class09086;
import Nursultan.class09095;
import Nursultan.class09096;
import Nursultan.class11175;
import Nursultan.class11181;
import Nursultan.class11199;
import java.util.function.BooleanSupplier;
import java.util.function.IntSupplier;

public class class09064 {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public Object N_3;
    public Object N_4;
    public Object N_5;
    public Object N_6;
    public Object N_7;
    public boolean N_init;
    public Object y_0;
    public Object y_1;
    public Object y_2;
    public Object y_3;
    public Object y_4;
    public Object y_5;
    public boolean y_init;

    public void w() {
        ((class09085)this.N_7).B();
    }

    public void L(int n, int n2) {
        this.y_2 = n;
        this.y_3 = n2;
    }

    public boolean L() {
        return ((class09085)this.N_7).Z();
    }

    public class09083 L(class09083 class090832) {
        return ((class09085)this.N_7).N(class090832);
    }

    public class09064 L(boolean bl) {
        if ((Boolean)this.y_5 != bl) {
            this.w();
            this.y_5 = bl;
        }
        return this;
    }

    public class09086 M(class09083 class090832) {
        return ((class09085)this.N_7).B(class090832);
    }

    public void M() {
        this.N(this.m(), this.B());
    }

    public class09057 P() {
        return ((class09085)this.N_7).M();
    }

    public void T() {
        ((class09085)this.N_7).i();
    }

    class09064(IntSupplier intSupplier, IntSupplier intSupplier2, class11181 class111812, boolean bl, class11199 class111992, class11199 class111993, class11175 class111752, class11175 class111753, boolean bl2, String string, BooleanSupplier booleanSupplier) {
        this.Y();
        this.N_7 = new class09085(this);
        this.y_0 = intSupplier;
        this.y_1 = intSupplier2;
        this.y_2 = this.m();
        this.y_3 = this.B();
        this.y_4 = class111812;
        this.y_5 = bl;
        this.N_0 = class111992;
        this.N_1 = class111993;
        this.N_2 = class111752;
        this.N_3 = class111753;
        this.N_4 = bl2;
        this.N_5 = string;
        this.N_6 = booleanSupplier == null ? () -> false : booleanSupplier;
    }

    public void B(class09083 class090832) {
        ((class09085)this.N_7).M(class090832);
    }

    public int B() {
        return Math.max(1, ((IntSupplier)this.y_1).getAsInt());
    }

    public boolean Z() {
        return ((BooleanSupplier)this.N_6).getAsBoolean();
    }

    public boolean i(class09083 class090832) {
        return ((class09085)this.N_7).L(class090832);
    }

    public class09096 i() {
        return this.s();
    }

    public class09096 i(int n, int n2) {
        class09073 class090732 = new class09073(n, n2, (class11181)this.y_4, (class11199)this.N_0, (class11199)this.N_1, (class11175)this.N_2, (class11175)this.N_3, (Boolean)this.N_4, 3);
        class09073 class090733 = (Boolean)this.y_5 != false ? new class09073(n, n2, class11181.DEPTH32, class11199.NEAREST, class11199.NEAREST, class11175.CLAMP_TO_EDGE, class11175.CLAMP_TO_EDGE, false, 5) : null;
        return new class09096(class090732, class090733, (String)this.N_5);
    }

    public class11199 b() {
        return (class11199)this.N_1;
    }

    public class09096 s() {
        return this.i(this.m(), this.B());
    }

    public class11175 n() {
        return (class11175)this.N_2;
    }

    public class11199 l() {
        return (class11199)this.N_0;
    }

    public String d() {
        return (String)this.N_5;
    }

    public int m() {
        return Math.max(1, ((IntSupplier)this.y_0).getAsInt());
    }

    public static class09095 k() {
        return new class09095();
    }

    public boolean t() {
        return ((class09085)this.N_7).y();
    }

    public boolean v() {
        return (Boolean)this.y_5;
    }

    public class09083 j() {
        return ((class09085)this.N_7).N();
    }

    public class09057 U() {
        return ((class09085)this.N_7).R();
    }

    public class09086 z() {
        return ((class09085)this.N_7).L();
    }

    public static class09064 u(int n, int n2) {
        return class09064.y(n, n2).N();
    }

    public class09057 u(class09083 class090832) {
        return ((class09085)this.N_7).u(class090832);
    }

    public int u() {
        return (Integer)this.y_3;
    }

    public boolean y() {
        return ((Integer)this.y_2).intValue() != this.m() || ((Integer)this.y_3).intValue() != this.B();
    }

    public static class09095 y(int n, int n2) {
        return class09064.N(() -> n, () -> n2);
    }

    public class09083 y(class09083 class090832) {
        return ((class09085)this.N_7).R(class090832);
    }

    public class09064 y(boolean bl) {
        return this.N(() -> !bl);
    }

    public boolean E() {
        return (Boolean)this.N_4;
    }

    public class09064 N(class11175 class111752) {
        return this.N(class111752, class111752);
    }

    public class09064 N(String string) {
        this.N_5 = string;
        return this;
    }

    public static class09095 N(IntSupplier intSupplier, IntSupplier intSupplier2) {
        return class09064.k().N(intSupplier).y(intSupplier2).N(class11181.RGBA8).N(class11199.NEAREST).y(class11199.NEAREST).L(class11175.CLAMP_TO_EDGE).N(class11175.CLAMP_TO_EDGE).N(() -> false);
    }

    public class09064 N(class11181 class111812) {
        if ((class11181)this.y_4 != class111812) {
            this.w();
            this.y_4 = class111812;
        }
        return this;
    }

    public void N(long l, long l2) {
        ((class09085)this.N_7).N(l, l2);
    }

    public class09064 N(class11175 class111752, class11175 class111753) {
        if ((class11175)this.N_2 != class111752 || (class11175)this.N_3 != class111753) {
            this.w();
            this.N_2 = class111752;
            this.N_3 = class111753;
        }
        return this;
    }

    public class09064 N(boolean bl) {
        if ((Boolean)this.N_4 != bl) {
            this.w();
            this.N_4 = bl;
        }
        return this;
    }

    public class09064 N(class11199 class111992, class11199 class111993) {
        if ((class11199)this.N_0 != class111992 || (class11199)this.N_1 != class111993) {
            this.w();
            this.N_0 = class111992;
            this.N_1 = class111993;
        }
        return this;
    }

    public class09057 N(class09083 class090832) {
        return ((class09085)this.N_7).i(class090832);
    }

    public class09064 N(BooleanSupplier booleanSupplier) {
        this.N_6 = booleanSupplier == null ? () -> false : booleanSupplier;
        return this;
    }

    public void N() {
        ((class09085)this.N_7).u();
    }

    public void N(int n, int n2) {
        n = Math.max(1, n);
        n2 = Math.max(1, n2);
        if ((Integer)this.y_2 == n && (Integer)this.y_3 == n2) {
            return;
        }
        this.L(n, n2);
        ((class09085)this.N_7).y(n, n2);
    }

    public class11181 W() {
        return (class11181)this.y_4;
    }

    public class11175 R() {
        return (class11175)this.N_3;
    }

    public void R(class09083 class090832) {
        ((class09085)this.N_7).y(class090832);
    }

    public int G() {
        return (Integer)this.y_2;
    }

    private void Y() {
        if (!this.y_init) {
            this.y_init = true;
            this.y_2 = 0;
            this.y_3 = 0;
            this.y_5 = false;
        }
        if (!this.N_init) {
            this.N_init = true;
            this.N_4 = false;
        }
    }
}

