/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00965
 *  minecraft.class03448
 *  minecraft.class04995
 *  minecraft.class05363
 *  minecraft.class05846
 *  minecraft.class05848
 *  minecraft.class06889
 *  minecraft.class07299
 *  minecraft.class08388
 *  org.joml.Quaternionf
 */
package minecraft;

import java.util.Optional;
import minecraft.class00965;
import minecraft.class01190;
import minecraft.class03448;
import minecraft.class04995;
import minecraft.class05363;
import minecraft.class05846;
import minecraft.class05848;
import minecraft.class06889;
import minecraft.class07299;
import minecraft.class08388;
import org.joml.Quaternionf;

public class class01170
extends class05848 {
    private final class01190 N;
    private float y;
    private float L;
    private float u;
    private float i;

    class01170(class03448 class034482, double d, double d2, double d3, class01190 class011902, int n, class08388 class083882) {
        super(class034482, d, d2, d3, 0.0, 0.0, 0.0, class083882);
        this.field_17867 = 0.3f;
        this.N = class011902;
        this.field_3847 = n;
        Optional<class06889> var11 = class011902.N((class07299)class034482);
        if (var11.isPresent()) {
            class06889 class068892 = var11.get();
            double d4 = d - class068892.N();
            double d5 = d2 - class068892.y();
            double d6 = d3 - class068892.L();
            this.L = this.y = (float)class04995.u((double)d4, (double)d6);
            this.i = this.u = (float)class04995.u((double)d5, (double)Math.sqrt(d4 * d4 + d6 * d6));
        }
    }

    public class05846 method_74255() {
        return class05846.u;
    }

    public void method_3074(class00965 class009652, class05363 class053632, float f) {
        float f2 = class04995.m((double)(((float)this.field_3866 + f - (float)Math.PI * 2) * 0.05f)) * 2.0f;
        float f3 = class04995.B((float)f, (float)this.L, (float)this.y);
        float f4 = class04995.B((float)f, (float)this.i, (float)this.u) + 1.5707964f;
        Quaternionf quaternionf = new Quaternionf();
        quaternionf.rotationY(f3).rotateX(-f4).rotateY(f2);
        this.method_60373(class009652, class053632, quaternionf, f);
        quaternionf.rotationY((float)(-Math.PI) + f3).rotateX(f4).rotateY(f2);
        this.method_60373(class009652, class053632, quaternionf, f);
    }

    public int method_3068(float f) {
        return 240;
    }

    public void method_3070() {
        this.field_3858 = this.field_3874;
        this.field_3838 = this.field_3854;
        this.field_3856 = this.field_3871;
        if (this.field_3866++ >= this.field_3847) {
            this.method_3085();
            return;
        }
        Optional<class06889> var1 = this.N.N((class07299)this.field_3851);
        if (var1.isEmpty()) {
            this.method_3085();
            return;
        }
        int n = this.field_3847 - this.field_3866;
        double d = 1.0 / (double)n;
        class06889 class068892 = var1.get();
        this.field_3874 = class04995.u((double)d, (double)this.field_3874, (double)class068892.N());
        this.field_3854 = class04995.u((double)d, (double)this.field_3854, (double)class068892.y());
        this.field_3871 = class04995.u((double)d, (double)this.field_3871, (double)class068892.L());
        double d2 = this.field_3874 - class068892.N();
        double d3 = this.field_3854 - class068892.y();
        double d4 = this.field_3871 - class068892.L();
        this.L = this.y;
        this.y = (float)class04995.u((double)d2, (double)d4);
        this.i = this.u;
        this.u = (float)class04995.u((double)d3, (double)Math.sqrt(d2 * d2 + d4 * d4));
    }
}

