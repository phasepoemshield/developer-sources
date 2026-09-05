/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01885
 *  minecraft.class01894
 *  minecraft.class02077
 *  minecraft.class02102
 *  minecraft.class03255
 *  minecraft.class03608
 *  minecraft.class04230
 *  minecraft.class04654
 *  minecraft.class05096
 *  minecraft.class05220
 *  minecraft.class05362
 *  minecraft.class06478
 *  minecraft.class06541
 *  minecraft.class08394
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.List;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01885;
import minecraft.class01894;
import minecraft.class02077;
import minecraft.class02102;
import minecraft.class03255;
import minecraft.class03608;
import minecraft.class03708;
import minecraft.class04230;
import minecraft.class04654;
import minecraft.class05096;
import minecraft.class05220;
import minecraft.class05362;
import minecraft.class06478;
import minecraft.class06541;
import minecraft.class08394;
import org.jspecify.annotations.Nullable;

public class class03723
extends class05096 {
    private static final class01894 N = class01894.y((String)"popup/background");
    private static final int y = 12;
    private static final int L = 18;
    private static final int u = 6;
    private static final int i = 130;
    private static final int R = 64;
    private static final int M = 250;
    private final class05096 B;
    private final @Nullable class01894 Z;
    private final class00392 z;
    private final List<class03708> U;
    private final @Nullable Runnable E;
    private final int W;
    private final class01885 m = class01885.u();

    class03723(class05096 class050962, int n, @Nullable class01894 class018942, class00392 class003922, class00392 class003923, List<class03708> list, @Nullable Runnable runnable) {
        super(class003922);
        this.B = class050962;
        this.Z = class018942;
        this.z = class003923;
        this.U = list;
        this.E = runnable;
        this.W = n - 36;
    }

    private class01885 N() {
        int n = 6 * (this.U.size() - 1);
        int n2 = Math.min((this.W - n) / this.U.size(), 150);
        class01885 class018852 = class01885.i();
        class018852.N(6);
        for (class03708 class037082 : this.U) {
            class018852.N((class02102)class05362.method_46430((class00392)class037082.N(), class053622 -> class037082.y().accept(this)).N(n2).N());
        }
        return class018852;
    }

    public void method_25426() {
        this.B.method_25423(this.field_22789, this.field_22790);
        this.m.N(12).L().y();
        this.m.N((class02102)new class04230((class00392)this.field_22785.L().N(class06541.field_1067), this.field_22793).N(this.W).N(true));
        if (this.Z != null) {
            this.m.N((class02102)class03608.N((int)130, (int)64, (class01894)this.Z, (int)130, (int)64));
        }
        this.m.N((class02102)new class04230(this.z, this.field_22793).N(this.W).N(true));
        this.m.N((class02102)this.N());
        this.m.method_48206(class046542 -> {
            class06478 cfr_ignored_0 = (class06478)this.method_37063((class04654)class046542);
        });
        this.method_48640();
    }

    public void method_49589() {
        super.method_49589();
        this.B.method_48267();
    }

    public void method_48640() {
        this.B.method_25410(this.field_22789, this.field_22790);
        this.m.N();
        class02077.N((class02102)this.m, (class03255)this.method_48202());
    }

    public void method_25420(class01054 class010542, int n, int n2, float f) {
        this.B.method_25420(class010542, n, n2, f);
        class010542.L();
        this.B.method_25394(class010542, -1, -1, f);
        class010542.L();
        this.method_52752(class010542);
        class010542.N(class08394.Na, N, this.m.method_46426() - 18, this.m.method_46427() - 18, this.m.method_25368() + 36, this.m.method_25364() + 36);
    }

    public void method_25419() {
        if (this.E != null) {
            this.E.run();
        }
        this.field_22787.N(this.B);
    }

    public class00392 method_25435() {
        return class05220.N((class00392[])new class00392[]{this.field_22785, this.z});
    }
}

