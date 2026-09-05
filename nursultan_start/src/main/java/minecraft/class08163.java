/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  minecraft.class01128
 *  minecraft.class01289
 *  minecraft.class01328
 *  minecraft.class04782
 *  minecraft.class04891
 *  minecraft.class04995
 *  minecraft.class05298
 *  minecraft.class05367
 *  minecraft.class05378
 *  minecraft.class05765
 *  minecraft.class06889
 *  minecraft.class07047
 *  minecraft.class07049
 *  minecraft.class07072
 *  minecraft.class07323
 *  minecraft.class07438
 *  minecraft.class07453
 *  minecraft.class07633
 */
package minecraft;

import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.Optional;
import minecraft.class01128;
import minecraft.class01289;
import minecraft.class01328;
import minecraft.class04782;
import minecraft.class04891;
import minecraft.class04995;
import minecraft.class05298;
import minecraft.class05367;
import minecraft.class05378;
import minecraft.class05765;
import minecraft.class06889;
import minecraft.class07047;
import minecraft.class07049;
import minecraft.class07072;
import minecraft.class07323;
import minecraft.class07438;
import minecraft.class07453;
import minecraft.class07633;

public class class08163
extends class05765<class07633> {
    private final int N;
    private final class01328 y;
    private final float L;
    private final float u;
    private final double i;
    private final double R;
    private final class04891 Z;
    private class06889 z;
    private class06889 U;

    protected void L(class04782 class047822, class07633 class076332, long l) {
        class07438 class074383 = (class07438)class076332.method_18868().L(class05378.s).orElseThrow();
        class076332.N((class07049)class074383, 360.0f, 360.0f);
        class076332.method_18799(this.z);
        ArrayList arrayList = new ArrayList(1);
        class047822.method_47575(class01128.N(class07438.class), class076332.method_5829(), class074382 -> this.y.N(class047822, (class07438)class076332, class074382), arrayList, 1);
        if (!arrayList.isEmpty()) {
            class07438 class074384 = (class07438)arrayList.get(0);
            if (class076332.method_5626((class07049)class074384)) {
                return;
            }
            this.N(class047822, class076332, class074384);
            this.N(class076332, class074384);
            this.u(class047822, class076332, l);
        }
    }

    public class08163(int n, class01328 class013282, float f, float f2, double d, double d2, class04891 class048912) {
        super((Map)ImmutableMap.of((Object)class05378.NR, (Object)class05367.field_18457, (Object)class05378.s, (Object)class05367.field_18456));
        this.N = n;
        this.y = class013282;
        this.L = f;
        this.u = f2;
        this.R = d;
        this.i = d2;
        this.Z = class048912;
        this.z = class06889.L;
        this.U = class06889.L;
    }

    protected void u(class04782 class047822, class07633 class076332, long l) {
        class076332.method_18868().N(class05378.NR, (Object)this.N);
        class076332.method_18868().y(class05378.s);
    }

    protected void y(class04782 class047822, class07633 class076332, long l) {
        class01289 var5 = class076332.method_18868();
        this.U = class076332.method_73189();
        class06889 class068892 = ((class07438)var5.L(class05378.s).get()).method_73189().u(class076332.method_73189()).u();
        this.z = class068892.L((double)this.L);
        if (this.N(class047822, class076332, l)) {
            class076332.method_43077(this.Z);
        }
    }

    protected boolean N(class04782 class047822, class07633 class076332) {
        return class076332.method_18868().N(class05378.s);
    }

    protected boolean N(class04782 class047822, class07633 class076332, long l) {
        class01289 var5 = class076332.method_18868();
        Optional var6 = var5.L(class05378.s);
        if (var6.isEmpty()) {
            return false;
        }
        class07438 class074382 = (class07438)var6.get();
        if (class076332 instanceof class07453 && ((class07453)class076332).NQ()) {
            return false;
        }
        if (class076332.method_73189().u(this.U).B() >= this.R * this.R) {
            return false;
        }
        if (class074382.method_73189().u(class076332.method_73189()).B() >= this.i * this.i) {
            return false;
        }
        if (!class076332.method_6057((class07049)class074382)) {
            return false;
        }
        return !var5.N(class05378.NR);
    }

    private void N(class04782 class047822, class07633 class076332, class07438 class074382) {
        float f;
        class07072 class070722 = class047822.method_48963().y((class07438)class076332);
        if (class074382.method_64397(class047822, class070722, f = (float)class076332.method_45325(class05298.u))) {
            class07323.N((class04782)class047822, (class07049)class074382, (class07072)class070722);
        }
    }

    private void N(class07633 class076332, class07438 class074382) {
        int n = class076332.method_6059(class07047.N) ? class076332.method_6112(class07047.N).i() + 1 : 0;
        int n2 = class076332.method_6059(class07047.y) ? class076332.method_6112(class07047.y).i() + 1 : 0;
        float f = 0.25f * (float)(n - n2);
        float f2 = class04995.N((float)(this.L * (float)class076332.method_45325(class05298.l)), (float)0.2f, (float)2.0f) + f;
        class076332.method_75122((class07049)class074382, f2 * this.u, class076332.method_18798());
    }
}

