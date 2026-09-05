/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01328
 *  minecraft.class04782
 *  minecraft.class04995
 *  minecraft.class06889
 *  minecraft.class07438
 *  minecraft.class08036
 */
package minecraft;

import minecraft.class00685;
import minecraft.class00690;
import minecraft.class00702;
import minecraft.class01328;
import minecraft.class04782;
import minecraft.class04995;
import minecraft.class06889;
import minecraft.class07438;
import minecraft.class08036;

public class class00716
extends class00685 {
    private static final int y = 100;
    private static final int L = 10;
    private static final int u = 20;
    private static final int i = 150;
    private static final class01328 R = class01328.N().N(150.0);
    private final class01328 M = class01328.N().N(20.0).N((class074382, class047822) -> Math.abs(class074382.method_23318() - class006902.method_23318()) <= 10.0);
    private int B;

    @Override
    public void L() {
        this.B = 0;
    }

    public class00716(class00690 class006902) {
        super(class006902);
    }

    public class00702<class00716> B() {
        return class00702.M;
    }

    @Override
    public void N(class04782 class047822) {
        ++this.B;
        class08036 class080362 = class047822.N(this.M, (class07438)this.N, this.N.method_23317(), this.N.method_23318(), this.N.method_23321());
        if (class080362 != null) {
            if (this.B > 25) {
                this.N.W().N(class00702.B);
            } else {
                class06889 class068892 = new class06889(class080362.method_23317() - this.N.method_23317(), 0.0, class080362.method_23321() - this.N.method_23321()).u();
                float f = (float)(Math.acos((float)new class06889((double)class04995.m((double)(this.N.method_36454() * ((float)Math.PI / 180))), 0.0, (double)(-class04995.P((double)(this.N.method_36454() * ((float)Math.PI / 180))))).u().y(class068892)) * 57.2957763671875) + 0.5f;
                if (f < 0.0f || f > 10.0f) {
                    float f2;
                    double d = class080362.method_23317() - this.N.L.method_23317();
                    double d2 = class080362.method_23321() - this.N.L.method_23321();
                    double d3 = class04995.N((double)class04995.i((double)(180.0 - class04995.u((double)d, (double)d2) * 57.2957763671875 - (double)this.N.method_36454())), (double)-100.0, (double)100.0);
                    this.N.Z *= 0.8f;
                    float f3 = f2 = (float)Math.sqrt(d * d + d2 * d2) + 1.0f;
                    if (f2 > 40.0f) {
                        f2 = 40.0f;
                    }
                    this.N.Z += (float)d3 * (0.7f / f2 / f3);
                    this.N.method_36456(this.N.method_36454() + this.N.Z);
                }
            }
        } else if (this.B >= 100) {
            class080362 = class047822.N(R, (class07438)this.N, this.N.method_23317(), this.N.method_23318(), this.N.method_23321());
            this.N.W().N(class00702.i);
            if (class080362 != null) {
                this.N.W().N(class00702.Z);
                this.N.W().y(class00702.Z).N(new class06889(class080362.method_23317(), class080362.method_23318(), class080362.method_23321()));
            }
        }
    }
}

