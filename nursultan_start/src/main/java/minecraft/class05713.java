/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01894
 *  minecraft.class02057
 *  minecraft.class02060
 *  minecraft.class02077
 *  minecraft.class02102
 *  minecraft.class03605
 *  minecraft.class03608
 *  minecraft.class04230
 *  minecraft.class05096
 *  minecraft.class05362
 *  minecraft.class06478
 *  minecraft.class06601
 *  minecraft.class06613
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.ArrayList;
import java.util.List;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01894;
import minecraft.class02057;
import minecraft.class02060;
import minecraft.class02077;
import minecraft.class02102;
import minecraft.class03605;
import minecraft.class03608;
import minecraft.class04230;
import minecraft.class05096;
import minecraft.class05362;
import minecraft.class05683;
import minecraft.class05685;
import minecraft.class05728;
import minecraft.class06478;
import minecraft.class06601;
import minecraft.class06613;
import org.jspecify.annotations.Nullable;

class class05713
extends class05728 {
    private static final int B = 40;
    public static final int N = 7;
    public static final int y = 38;
    private final class00392 Z;
    private final List<class06478> z;
    private final @Nullable class05683 U;
    private final class04230 E;
    private final class02060 W;
    private final class02077 m;
    private final class05362 P;
    private int s;
    final /* synthetic */ class05685 M;

    private void L() {
        int n = this.method_25368();
        if (this.s != n) {
            this.R(n);
            this.s = n;
        }
    }

    public class05713(class05685 class056852, class05685 class056853, int n, class00392 class003922, class03605 class036052) {
        this.M = class056852;
        super(class056852);
        this.z = new ArrayList<class06478>();
        this.s = -1;
        this.Z = class003922;
        this.W = new class02060();
        this.W.N((class02102)class03608.N((int)20, (int)20, (class01894)class05685.N), 0, 0, this.W.y().N(7, 7, 0, 0));
        this.W.N((class02102)class02057.N((int)40), 0, 0);
        this.m = (class02077)this.W.N((class02102)new class02077(0, n), 0, 1, this.W.y().L(7));
        this.E = (class04230)this.m.N((class02102)new class04230(class003922, class05685.b(class056852)).N(true), this.m.y().y().u());
        this.W.N((class02102)class02057.N((int)40), 0, 2);
        this.U = class036052.y() ? (class05683)this.W.N((class02102)new class05683(class053622 -> this.M.N(class036052.L()), (class00392)class00392.L((String)"mco.notification.dismiss")), 0, 2, this.W.y().L().N(0, 7, 7, 0)) : null;
        this.P = (class05362)this.W.N((class02102)class036052.N((class05096)class056853), 1, 1, this.W.y().y().N(4));
        this.P.method_76613(() -> this.method_25370());
        this.W.method_48206(this.z::add);
    }

    public static int i(int n) {
        return n - 80;
    }

    public class00392 N() {
        return this.Z;
    }

    public boolean method_25404(class06601 class066012) {
        if (this.P.method_25404(class066012)) {
            return true;
        }
        if (this.U != null && this.U.method_25404(class066012)) {
            return true;
        }
        return super.method_25404(class066012);
    }

    @Override
    public boolean method_25402(class06613 class066132, boolean bl) {
        if (this.U != null && this.U.method_25402(class066132, bl)) {
            return true;
        }
        if (this.P.method_25402(class066132, bl)) {
            return true;
        }
        return super.method_25402(class066132, bl);
    }

    private void R(int n) {
        int n2 = class05713.i(n);
        this.m.y(n2);
        this.E.N(n2);
        this.W.N();
    }

    public void method_25343(class01054 class010542, int n, int n2, boolean bl, float f) {
        this.W.y(this.method_73380(), this.method_73382());
        this.L();
        this.z.forEach(class064782 -> class064782.method_25394(class010542, n, n2, f));
    }

    @Override
    public class00392 method_37006() {
        return this.N();
    }
}

