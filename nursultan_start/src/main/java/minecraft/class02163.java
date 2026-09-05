/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01286
 *  minecraft.class04782
 *  minecraft.class04909
 *  minecraft.class04995
 *  minecraft.class06069
 *  minecraft.class06113
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07072
 *  minecraft.class07078
 *  minecraft.class07084
 *  minecraft.class07107
 *  minecraft.class07126
 *  minecraft.class07147
 *  minecraft.class07299
 *  minecraft.class07438
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 */
package minecraft;

import java.util.function.ToIntFunction;
import minecraft.class01286;
import minecraft.class04782;
import minecraft.class04909;
import minecraft.class04995;
import minecraft.class06069;
import minecraft.class06113;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07072;
import minecraft.class07078;
import minecraft.class07084;
import minecraft.class07107;
import minecraft.class07126;
import minecraft.class07147;
import minecraft.class07299;
import minecraft.class07438;
import org.joml.Vector3f;
import org.joml.Vector3fc;

public class class02163
extends class07084 {
    private final float L;
    private final ToIntFunction<class06069> u;

    public class02163(class01286 class012862, int n, float f, ToIntFunction<class06069> toIntFunction) {
        super(class012862, n, (class07126)class07107.o);
        this.L = f;
        this.u = toIntFunction;
    }

    public void N(class04782 class047822, class07438 class074382, int n, class07072 class070722, float f) {
        if (class074382.method_59922().z() <= this.L) {
            int n2 = this.u.applyAsInt(class074382.method_59922());
            for (int i = 0; i < n2; ++i) {
                this.N(class047822, class074382, class074382.method_23317(), class074382.method_23318() + (double)class074382.method_17682() / 2.0, class074382.method_23321());
            }
        }
    }

    private void N(class04782 class047822, class07438 class074382, double d, double d2, double d3) {
        class07147 class071472 = (class07147)class07078.yW.N((class07299)class047822, class06113.field_16461);
        if (class071472 == null) {
            return;
        }
        class06069 class060692 = class074382.method_59922();
        float f = 1.5707964f;
        float f2 = class04995.y((class06069)class060692, (float)-1.5707964f, (float)1.5707964f);
        Vector3f vector3f = class074382.method_5720().W().mul(0.3f).mul(1.0f, 1.5f, 1.0f).rotateY(f2);
        class071472.method_5808(d, d2, d3, class047822.method_8409().z() * 360.0f, 0.0f);
        class071472.method_18799(new class06889((Vector3fc)vector3f));
        class047822.method_8649((class07049)class071472);
        class071472.method_43077(class04909.kM);
    }
}

