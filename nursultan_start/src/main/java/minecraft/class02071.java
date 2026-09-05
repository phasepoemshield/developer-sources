/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class00580
 *  minecraft.class01028
 *  minecraft.class01590
 *  minecraft.class02050
 *  minecraft.class03660
 *  minecraft.class05220
 *  minecraft.class05936
 *  minecraft.class07018
 */
package minecraft;

import java.util.Objects;
import minecraft.class00392;
import minecraft.class00580;
import minecraft.class01028;
import minecraft.class01590;
import minecraft.class02050;
import minecraft.class03660;
import minecraft.class05220;
import minecraft.class05936;
import minecraft.class07018;

public class class02071
extends class03660 {
    private static final int N = 2;
    private int y;
    private int L;
    private boolean u;
    private class02050 i;

    public class02071(int n, int n2, int n3, int n4, class00392 class003922, class01590 class015902) {
        super(n, n2, n3, n4, class003922, class015902);
        this.y = 0;
        this.L = 0;
        this.u = true;
        this.i = class02050.field_62126;
        this.field_22763 = false;
    }

    public class02071(int n, int n2, class00392 class003922, class01590 class015902) {
        this(0, 0, n, n2, class003922, class015902);
    }

    public class02071(class00392 class003922, class01590 class015902) {
        int n = class015902.N(class003922.method_30937());
        Objects.requireNonNull(class015902);
        this(0, 0, n, 9, class003922, class015902);
    }

    public class02071 N(int n, class02050 class020502) {
        this.y = n;
        this.i = class020502;
        return this;
    }

    public void N(class00580 class005802) {
        class00392 class003922 = this.method_25369();
        class01590 class015902 = this.Z();
        int n = this.y > 0 ? this.y : this.method_25368();
        int n2 = class015902.N((class05936)class003922);
        int n3 = this.method_46426();
        int n4 = this.method_46427();
        int n5 = this.method_25364();
        Objects.requireNonNull(class015902);
        int n6 = n4 + (n5 - 9) / 2;
        if (n2 > n) {
            switch (this.i.ordinal()) {
                case 0: {
                    class005802.N(n3, n6, class02071.N(class003922, class015902, n));
                    break;
                }
                case 1: {
                    this.method_75799(class005802, class003922, 2);
                }
            }
        } else {
            class005802.N(n3, n6, class003922.method_30937());
        }
    }

    public static class01028 N(class00392 class003922, class01590 class015902, int n) {
        class05936 class059362 = class015902.N((class05936)class003922, n - class015902.N((class05936)class05220.G));
        return class07018.y().N(class05936.N((class05936[])new class05936[]{class059362, class05220.G}));
    }

    public class02071 N(int n) {
        return this.N(n, class02050.field_62126);
    }

    public int method_25368() {
        if (this.y > 0) {
            if (this.u) {
                this.L = Math.min(this.y, this.Z().N(this.method_25369().method_30937()));
                this.u = false;
            }
            return this.L;
        }
        return super.method_25368();
    }

    public void method_25355(class00392 class003922) {
        super.method_25355(class003922);
        this.u = true;
    }
}

