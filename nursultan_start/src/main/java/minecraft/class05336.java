/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01321
 *  minecraft.class01395
 *  minecraft.class01885
 *  minecraft.class02102
 *  minecraft.class03263
 *  minecraft.class03448
 *  minecraft.class03597
 *  minecraft.class03794
 *  minecraft.class04141
 *  minecraft.class04370
 *  minecraft.class05096
 *  minecraft.class05220
 *  minecraft.class05630
 *  minecraft.class05716
 *  minecraft.class05914
 *  minecraft.class06478
 */
package minecraft;

import java.net.URI;
import java.util.Arrays;
import minecraft.class00392;
import minecraft.class01321;
import minecraft.class01395;
import minecraft.class01885;
import minecraft.class02102;
import minecraft.class03263;
import minecraft.class03448;
import minecraft.class03597;
import minecraft.class03794;
import minecraft.class04141;
import minecraft.class04370;
import minecraft.class05096;
import minecraft.class05220;
import minecraft.class05362;
import minecraft.class05630;
import minecraft.class05716;
import minecraft.class05914;
import minecraft.class06478;

public class class05336
extends class05914 {
    public static final class00392 N = class00392.L((String)"options.accessibility.title");

    public class05336(class05096 class050962, class05630 class056302) {
        super(class050962, class056302, N);
    }

    private static class04370<?>[] N(class05630 class056302) {
        return new class04370[]{class056302.NV(), class056302.NU(), class056302.k(), class056302.G(), class056302.d(), class056302.NW(), class056302.n(), class056302.t(), class056302.q(), class056302.K(), class056302.Ns(), class056302.NY(), class056302.NQ(), class056302.NO(), class056302.NJ(), class056302.Ng(), class056302.NI(), class056302.y(), class056302.N(), class056302.w(), class056302.L(), class056302.Q(), class056302.C(), class056302.Y()};
    }

    private boolean N() {
        return (class03448)this.field_22787.T_3 != null && ((class03448)this.field_22787.T_3).method_45162().y(class03794.u);
    }

    public void method_25426() {
        class06478 class064782;
        super.method_25426();
        class06478 class064783 = this.field_51824.y(this.field_21336.k());
        if (class064783 != null && !this.field_22787.t().L().contains("high_contrast")) {
            class064783.field_22763 = false;
            class064783.method_47400(class04141.N((class00392)class00392.L((String)"options.accessibility.high_contrast.error.tooltip")));
        }
        if ((class064782 = this.field_51824.y(this.field_21336.C())) != null) {
            class064782.field_22763 = this.N();
        }
    }

    protected boolean method_72798() {
        return !(this.field_21335 instanceof class03263);
    }

    protected void method_60325() {
        class04370<?>[] var1 = class05336.N(this.field_21336);
        class05362 class053623 = class05362.method_46430(class05716.N, class053622 -> this.field_22787.N((class05096)new class01395((class05096)this, this.field_21336))).N();
        class04370<?> var3 = var1[0];
        this.field_51824.N(var3.method_57701(this.field_21336), this.field_21336.NV(), (class06478)class053623);
        this.field_51824.N((class04370[])Arrays.stream(var1).filter(class043703 -> class043703 != var3).toArray(class04370[]::new));
    }

    protected void method_31387() {
        class01885 class018852 = (class01885)this.field_49503.y((class02102)class01885.i().N(8));
        class018852.N((class02102)class05362.method_46430((class00392)class00392.L((String)"options.accessibility.link"), class01321.y((class05096)this, (URI)class03597.E)).N());
        class018852.N((class02102)class05362.method_46430(class05220.u, class053622 -> this.field_22787.N(this.field_21335)).N());
    }
}

