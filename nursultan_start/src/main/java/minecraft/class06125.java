/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04995
 *  minecraft.class05228
 *  minecraft.class06197
 *  minecraft.class06202
 *  minecraft.class06541
 *  minecraft.class06601
 *  minecraft.class06626
 *  minecraft.class07536
 */
package minecraft;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import minecraft.class04995;
import minecraft.class05228;
import minecraft.class06094;
import minecraft.class06197;
import minecraft.class06202;
import minecraft.class06541;
import minecraft.class06601;
import minecraft.class06626;
import minecraft.class07536;

public class class06125 {
    private final Supplier<String> N;
    private final Consumer<String> y;
    private final Supplier<String> L;
    private final Consumer<String> u;
    private final Predicate<String> i;
    private int R;
    private int M;

    private String L(String string) {
        if (this.M == this.R) {
            return string;
        }
        int n = Math.min(this.R, this.M);
        int n2 = Math.max(this.R, this.M);
        String string2 = string.substring(0, n) + string.substring(n2);
        this.M = this.R = n;
        return string2;
    }

    public void L(int n, boolean bl) {
        this.R = this.M(n);
        this.L(bl);
    }

    public static Consumer<String> L(class06202 class062022) {
        return string -> class06125.N(class062022, string);
    }

    public void L(int n) {
        int n2 = class05228.N((String)this.N.get(), (int)n, (int)this.R, (boolean)true);
        this.u(n2 - this.R);
    }

    public void L() {
        this.u.accept(this.y(this.N.get()));
    }

    private void L(boolean bl) {
        if (!bl) {
            this.M = this.R;
        }
    }

    private int M(int n) {
        return class04995.N((int)n, (int)0, (int)this.N.get().length());
    }

    public int M() {
        return this.R;
    }

    public class06125(Supplier<String> supplier, Consumer<String> consumer, Supplier<String> supplier2, Consumer<String> consumer2, Predicate<String> predicate) {
        this.N = supplier;
        this.y = consumer;
        this.L = supplier2;
        this.u = consumer2;
        this.i = predicate;
        this.R();
    }

    public int B() {
        return this.M;
    }

    public boolean Z() {
        return this.R != this.M;
    }

    public void i(int n) {
        this.L(n, true);
    }

    public void i() {
        this.N(false);
    }

    public void u(int n) {
        String string = this.N.get();
        if (!string.isEmpty()) {
            String string2;
            if (this.M != this.R) {
                string2 = this.L(string);
            } else {
                int n2 = class07536.N((String)string, (int)this.R, (int)n);
                int n3 = Math.min(n2, this.R);
                int n4 = Math.max(n2, this.R);
                string2 = new StringBuilder(string).delete(n3, n4).toString();
                if (n < 0) {
                    this.M = this.R = n3;
                }
            }
            this.y.accept(string2);
        }
    }

    public void u() {
        this.M = 0;
        this.R = this.N.get().length();
    }

    public void y() {
        this.N(this.N.get(), this.L.get());
        this.M = this.R;
    }

    public static String y(class06202 class062022) {
        return class06541.N((String)((class06197)class062022.L_3).N().replaceAll("\\r", ""));
    }

    private String y(String string) {
        int n = Math.min(this.R, this.M);
        int n2 = Math.max(this.R, this.M);
        return string.substring(n, n2);
    }

    public void y(boolean bl) {
        this.R = this.N.get().length();
        this.L(bl);
    }

    public void y(int n, boolean bl) {
        this.R = class05228.N((String)this.N.get(), (int)n, (int)this.R, (boolean)true);
        this.L(bl);
    }

    public void y(int n) {
        this.y(n, false);
    }

    public boolean N(class06626 class066262) {
        if (class066262.y()) {
            this.N(this.N.get(), class066262.N());
        }
        return true;
    }

    public boolean N(class06601 class066012) {
        class06094 class060942;
        if (class066012.s()) {
            this.u();
            return true;
        }
        if (class066012.T()) {
            this.L();
            return true;
        }
        if (class066012.b()) {
            this.y();
            return true;
        }
        if (class066012.j()) {
            this.N();
            return true;
        }
        class06094 class060943 = class060942 = class066012.P() ? class06094.field_38309 : class06094.field_38308;
        if (class066012.v() == 259) {
            this.N(-1, class060942);
            return true;
        }
        if (class066012.v() == 261) {
            this.N(1, class060942);
        } else {
            if (class066012.R()) {
                this.N(-1, class066012.W(), class060942);
                return true;
            }
            if (class066012.M()) {
                this.N(1, class066012.W(), class060942);
                return true;
            }
            if (class066012.v() == 268) {
                this.N(class066012.W());
                return true;
            }
            if (class066012.v() == 269) {
                this.y(class066012.W());
                return true;
            }
        }
        return false;
    }

    public static Supplier<String> N(class06202 class062022) {
        return () -> class06125.y(class062022);
    }

    public static void N(class06202 class062022, String string) {
        ((class06197)class062022.L_3).N(string);
    }

    public void N(int n, int n2) {
        int n3 = this.N.get().length();
        this.R = class04995.N((int)n, (int)0, (int)n3);
        this.M = class04995.N((int)n2, (int)0, (int)n3);
    }

    public void N(int n, boolean bl, class06094 class060942) {
        switch (class060942.ordinal()) {
            case 0: {
                this.N(n, bl);
                break;
            }
            case 1: {
                this.y(n, bl);
            }
        }
    }

    public void N(int n) {
        this.N(n, false);
    }

    public void N(int n, boolean bl) {
        this.R = class07536.N((String)this.N.get(), (int)this.R, (int)n);
        this.L(bl);
    }

    public void N(int n, class06094 class060942) {
        switch (class060942.ordinal()) {
            case 0: {
                this.u(n);
                break;
            }
            case 1: {
                this.L(n);
            }
        }
    }

    public void N() {
        String string = this.N.get();
        this.u.accept(this.y(string));
        this.y.accept(this.L(string));
    }

    public void N(boolean bl) {
        this.R = 0;
        this.L(bl);
    }

    private void N(String string, String string2) {
        if (this.M != this.R) {
            string = this.L(string);
        }
        this.R = class04995.N((int)this.R, (int)0, (int)string.length());
        String string3 = new StringBuilder(string).insert(this.R, string2).toString();
        if (this.i.test(string3)) {
            this.y.accept(string3);
            this.M = this.R = Math.min(string3.length(), this.R + string2.length());
        }
    }

    public void N(String string) {
        this.N(this.N.get(), string);
    }

    public void R() {
        this.y(false);
    }

    public void R(int n) {
        this.M = this.M(n);
    }
}

