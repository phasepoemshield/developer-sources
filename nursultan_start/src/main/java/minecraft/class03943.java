/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class02566
 *  minecraft.class03428
 *  minecraft.class03457
 *  minecraft.class05216
 *  minecraft.class05936
 *  minecraft.class06601
 *  minecraft.class06608
 *  minecraft.class06613
 *  minecraft.class06626
 *  minecraft.class07536
 *  minecraft.class08813
 */
package minecraft;

import java.util.Objects;
import java.util.function.Consumer;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class02566;
import minecraft.class03428;
import minecraft.class03457;
import minecraft.class03915;
import minecraft.class03917;
import minecraft.class03938;
import minecraft.class05216;
import minecraft.class05936;
import minecraft.class06601;
import minecraft.class06608;
import minecraft.class06613;
import minecraft.class06626;
import minecraft.class07536;
import minecraft.class08813;

public class class03943
extends class08813 {
    private static final int N = 1;
    private static final int y = -3092272;
    private static final String L = "_";
    private static final int u = class02566.R((int)204, (int)-2039584);
    private static final int i = 300;
    private final class01590 R;
    private final class00392 M;
    private final class03915 B;
    private final int Z;
    private final boolean z;
    private final int U;
    private long E = class07536.L();

    public static class03938 L() {
        return new class03938();
    }

    class03943(class01590 class015902, int n, int n2, int n3, int n4, class00392 class003922, class00392 class003923, int n5, boolean bl, int n6, boolean bl2, boolean bl3) {
        super(n, n2, n3, n4, class003923, bl2, bl3);
        this.R = class015902;
        this.z = bl;
        this.Z = n5;
        this.U = n6;
        this.M = class003922;
        this.B = new class03915(class015902, n3 - this.method_65512());
        this.B.N(this::u);
    }

    private void u() {
        double d = this.method_44387();
        Objects.requireNonNull(this.R);
        class03917 class039172 = this.B.u((int)(d / 9.0));
        if (this.B.i() <= class039172.N()) {
            int n = this.B.B();
            Objects.requireNonNull(this.R);
            d = n * 9;
        } else {
            double d2 = d + (double)this.field_22759;
            Objects.requireNonNull(this.R);
            class03917 class039173 = this.B.u((int)(d2 / 9.0) - 1);
            if (this.B.i() > class039173.y()) {
                int n = this.B.B();
                Objects.requireNonNull(this.R);
                int n2 = n * 9 - this.field_22759;
                Objects.requireNonNull(this.R);
                d = n2 + 9 + this.method_65512();
            }
        }
        this.method_44382(d);
    }

    public String y() {
        return this.B.u();
    }

    public void y(int n) {
        this.B.y(n);
    }

    public void N(int n) {
        this.B.N(n);
    }

    private void N(double d, double d2) {
        double d3 = d - (double)this.method_46426() - (double)this.method_65509();
        double d4 = d2 - (double)this.method_46427() - (double)this.method_65509() + this.method_44387();
        this.B.N(d3, d4);
    }

    public void N(Consumer<String> consumer) {
        this.B.N(consumer);
    }

    public void N(String string) {
        this.N(string, false);
    }

    public void N(String string, boolean bl) {
        this.B.N(string, bl);
    }

    public boolean method_25404(class06601 class066012) {
        return this.B.N(class066012);
    }

    public boolean method_25400(class06626 class066262) {
        if (!(this.field_22764 && this.method_25370() && class066262.y())) {
            return false;
        }
        this.B.y(class066262.N());
        return true;
    }

    public void method_25365(boolean bl) {
        super.method_25365(bl);
        if (bl) {
            this.E = class07536.L();
        }
    }

    protected void method_44389(class01054 class010542, int n, int n2, float f) {
        String string = this.B.u();
        if (string.isEmpty() && !this.method_25370()) {
            class010542.N(this.R, (class05936)this.M, this.method_65513(), this.method_65514(), this.field_22758 - this.method_65512(), u);
            return;
        }
        int n3 = this.B.i();
        boolean bl = this.method_25370() && (class07536.L() - this.E) / 300L % 2L == 0L;
        boolean bl2 = n3 < string.length();
        int n4 = 0;
        int n5 = 0;
        int n6 = this.method_65514();
        boolean bl3 = false;
        for (class03917 class039172 : this.B.z()) {
            Objects.requireNonNull(this.R);
            boolean bl4 = this.method_65510(n6, n6 + 9);
            int n7 = this.method_65513();
            if (bl && bl2 && n3 >= class039172.N() && n3 <= class039172.y()) {
                if (bl4) {
                    var17_20 = string.substring(class039172.N(), n3);
                    class010542.N(this.R, var17_20, n7, n6, this.Z, this.z);
                    n4 = n7 + this.R.y(var17_20);
                    if (!bl3) {
                        Objects.requireNonNull(this.R);
                        class010542.N(n4, n6 - 1, n4 + 1, n6 + 1 + 9, this.U);
                        bl3 = true;
                    }
                    class010542.N(this.R, string.substring(n3, class039172.y()), n4, n6, this.Z, this.z);
                }
            } else {
                if (bl4) {
                    var17_20 = string.substring(class039172.N(), class039172.y());
                    class010542.N(this.R, var17_20, n7, n6, this.Z, this.z);
                    n4 = n7 + this.R.y(var17_20) - 1;
                }
                n5 = n6;
            }
            Objects.requireNonNull(this.R);
            n6 += 9;
        }
        if (bl && !bl2) {
            Objects.requireNonNull(this.R);
            if (this.method_65510(n5, n5 + 9)) {
                class010542.N(this.R, L, n4 + 1, n5, this.U, this.z);
            }
        }
        if (this.B.U()) {
            class03917 class039173 = this.B.R();
            int n8 = this.method_65513();
            n6 = this.method_65514();
            for (class03917 class039174 : this.B.z()) {
                if (class039173.N() > class039174.y()) {
                    Objects.requireNonNull(this.R);
                    n6 += 9;
                    continue;
                }
                if (class039174.N() > class039173.y()) break;
                Objects.requireNonNull(this.R);
                if (this.method_65510(n6, n6 + 9)) {
                    int n9 = this.R.y(string.substring(class039174.N(), Math.max(class039173.N(), class039174.N())));
                    int n10 = class039173.y() > class039174.y() ? this.field_22758 - this.method_65509() : this.R.y(string.substring(class039174.N(), class039173.y()));
                    Objects.requireNonNull(this.R);
                    class010542.N(n8 + n9, n6, n8 + n10, n6 + 9, true);
                }
                Objects.requireNonNull(this.R);
                n6 += 9;
            }
        }
        if (this.method_49606()) {
            class010542.N(class06608.y);
        }
    }

    public int method_44391() {
        Objects.requireNonNull(this.R);
        return 9 * this.B.M();
    }

    protected void method_44384(class01054 class010542) {
        super.method_44384(class010542);
        if (this.B.y()) {
            int n = this.B.N();
            class05216 class052162 = class00392.N((String)"gui.multiLineEditBox.character_limit", (Object[])new Object[]{this.B.u().length(), n});
            class010542.y(this.R, (class00392)class052162, this.method_46426() + this.field_22758 - this.R.N((class05936)class052162), this.method_46427() + this.field_22759 + 4, -6250336);
        }
    }

    public void method_25348(class06613 class066132, boolean bl) {
        if (bl) {
            this.B.Z();
        } else {
            this.B.N(class066132.W());
            this.N(class066132.n(), class066132.t());
        }
    }

    public void method_47399(class03428 class034282) {
        class034282.N(class03457.field_33788, (class00392)class00392.N((String)"gui.narrate.editBox", (Object[])new Object[]{this.method_25369(), this.y()}));
    }

    protected void method_25349(class06613 class066132, double d, double d2) {
        this.B.N(true);
        this.N(class066132.n(), class066132.t());
        this.B.N(class066132.W());
    }

    protected double method_44393() {
        Objects.requireNonNull(this.R);
        return 9.0 / 2.0;
    }
}

