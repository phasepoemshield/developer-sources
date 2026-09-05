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
 *  minecraft.class04230
 *  minecraft.class05936
 *  minecraft.class09033
 */
package minecraft;

import java.util.Objects;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class02086;
import minecraft.class02114;
import minecraft.class02566;
import minecraft.class03428;
import minecraft.class03457;
import minecraft.class04230;
import minecraft.class05936;
import minecraft.class09033;

public class class02091
extends class04230 {
    public static final int N = 4;
    private final int y;
    private final int L;
    private final boolean u;
    private final class02086 i;

    protected int L() {
        return super.L() + this.y;
    }

    class02091(class00392 class003922, class01590 class015902, int n, int n2, class02086 class020862, boolean bl) {
        super(class003922, class015902);
        this.field_22763 = true;
        this.y = n;
        this.L = n2;
        this.u = bl;
        this.i = class020862;
        this.i();
        this.R();
        this.N(true);
    }

    public void i() {
        if (this.L != -1) {
            this.method_25358(this.L);
            this.N(this.L);
        } else {
            this.method_25358(this.Z().N((class05936)this.method_25369()) + this.y * 2);
        }
    }

    public int u() {
        return this.y;
    }

    protected int y() {
        return this.method_46426() + this.y;
    }

    public static class02114 N(class00392 class003922, class01590 class015902) {
        return new class02114(class003922, class015902);
    }

    public static class02114 N(class00392 class003922, class01590 class015902, int n) {
        return new class02114(class003922, class015902, n);
    }

    public class04230 N(int n) {
        return super.N(n - this.y * 2);
    }

    public void R() {
        Objects.requireNonNull(this.Z());
        int n = 9 * this.Z().L((class05936)this.method_25369(), super.method_25368()).size();
        this.method_53533(n + this.y * 2);
    }

    public int method_25364() {
        return this.field_22759;
    }

    public int method_25368() {
        return this.field_22758;
    }

    public void method_25355(class00392 class003922) {
        this.field_22754 = class003922;
        int n = this.L != -1 ? this.L : this.Z().N((class05936)class003922) + this.y * 2;
        this.method_25358(n);
        this.R();
    }

    protected void method_47399(class03428 class034282) {
        class034282.N(class03457.field_33788, this.method_25369());
    }

    public void method_25354(class09033 class090332) {
    }

    public void method_48579(class01054 class010542, int n, int n2, float f) {
        int n3 = this.u && !this.method_25370() ? class02566.N((float)this.field_22765, (int)-6250336) : class02566.y((float)this.field_22765);
        switch (this.i.ordinal()) {
            case 0: {
                class010542.N(this.method_46426() + 1, this.method_46427(), this.method_55442(), this.method_55443(), class02566.L((float)this.field_22765));
                break;
            }
            case 1: {
                if (!this.method_25370()) break;
                class010542.N(this.method_46426() + 1, this.method_46427(), this.method_55442(), this.method_55443(), class02566.L((float)this.field_22765));
                break;
            }
        }
        if (this.method_25370() || this.u) {
            class010542.y(this.method_46426(), this.method_46427(), this.method_25368(), this.method_25364(), n3);
        }
        super.method_48579(class010542, n, n2, f);
    }
}

