/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10714
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  minecraft.class01001
 *  minecraft.class02735
 *  minecraft.class04782
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class04995
 *  minecraft.class05298
 *  minecraft.class05300
 *  minecraft.class06113
 *  minecraft.class06889
 *  minecraft.class07047
 *  minecraft.class07049
 *  minecraft.class07052
 *  minecraft.class07065
 *  minecraft.class07072
 *  minecraft.class07077
 *  minecraft.class07078
 *  minecraft.class07079
 *  minecraft.class07107
 *  minecraft.class07126
 *  minecraft.class07299
 *  minecraft.class07438
 *  minecraft.class07446
 *  minecraft.class07451
 *  minecraft.class07473
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import Nursultan.class10714;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.Objects;
import minecraft.class01001;
import minecraft.class02735;
import minecraft.class04782;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class04995;
import minecraft.class05298;
import minecraft.class05300;
import minecraft.class06113;
import minecraft.class06889;
import minecraft.class07047;
import minecraft.class07049;
import minecraft.class07052;
import minecraft.class07065;
import minecraft.class07072;
import minecraft.class07077;
import minecraft.class07078;
import minecraft.class07079;
import minecraft.class07107;
import minecraft.class07126;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class07446;
import minecraft.class07451;
import minecraft.class07473;
import minecraft.class07889;
import minecraft.class07900;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class07883
extends class02735 {
    public float N;
    public float y;
    public float L;
    public float u;
    public float i;
    public float R;
    public float M;
    public float B;
    private float X;
    private float a;
    private float p;
    class06889 Z = class06889.L;

    public boolean method_64397(class04782 class047822, class07072 class070722, float f) {
        if (super.method_64397(class047822, class070722, f) && this.method_6065() != null) {
            this.v();
            return true;
        }
        return false;
    }

    protected class07065 method_33570() {
        return class07065.field_28632;
    }

    public double method_7490() {
        return 0.08;
    }

    public void method_5711(byte by) {
        if (by == 19) {
            this.i = 0.0f;
        } else {
            super.method_5711(by);
        }
    }

    public class07883(class07078<? extends class07883> class070782, class07299 class072992) {
        super(class070782, class072992);
        this.field_5974.N((long)this.method_5628());
        this.a = 1.0f / (this.field_5974.z() + 1.0f) * 0.2f;
    }

    public static class05300 B() {
        return class07079.H().N(class05298.n, 10.0);
    }

    protected class04891 s() {
        return class04909.Qb;
    }

    public boolean m() {
        return this.Z.B() > (double)1.0E-5f;
    }

    public boolean g() {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N(callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return callbackInfoReturnable.getReturnValueZ();
        }
        return true;
    }

    private void v() {
        this.method_56078(this.E());
        class06889 class068892 = this.y(new class06889(0.0, -1.0, 0.0)).y(this.method_23317(), this.method_23318(), this.method_23321());
        for (int i = 0; i < 30; ++i) {
            class06889 class068893 = this.y(new class06889((double)this.field_5974.z() * 0.6 - 0.3, -1.0, (double)this.field_5974.z() * 0.6 - 0.3));
            float f = this.method_6109() ? 0.1f : 0.3f;
            class06889 class068894 = class068893.L((double)(f + this.field_5974.z() * 2.0f));
            ((class04782)this.method_73183()).method_65096(this.W(), class068892.M, class068892.B + 0.5, class068892.Z, 0, class068894.M, class068894.B, class068894.Z, (double)0.1f);
        }
    }

    private class06889 y(class06889 class068892) {
        class06889 class068893 = class068892.N(this.y * ((float)Math.PI / 180));
        class068893 = class068893.y(-((class07438)this).fields_4212a028292fd3c078969e3ee4c71d9e8_1.floatValue() * ((float)Math.PI / 180));
        return class068893;
    }

    public @Nullable class07077 y(class04782 class047822, class07077 class070772) {
        return (class07077)class07078.yw.N((class07299)class047822, class06113.field_16466);
    }

    protected class04891 E() {
        return class04909.Qn;
    }

    public @Nullable class07446 N(class01001 class010012, class07052 class070522, class06113 class061132, @Nullable class07446 class074462) {
        class07446 class074463 = Objects.requireNonNullElseGet(class074462, () -> new class10714(0.05f));
        return super.N(class010012, class070522, class061132, class074463);
    }

    static /* synthetic */ boolean N(class07883 class078832) {
        return class078832.field_5957;
    }

    private void N(CallbackInfoReturnable callbackInfoReturnable) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_16_4)) {
            callbackInfoReturnable.setReturnValue((Object)false);
        }
    }

    protected class07126 W() {
        return class07107.NW;
    }

    protected void l_() {
        this.e.N(0, (class07473)new class07889(this));
        this.e.N(1, (class07473)new class07900(this));
    }

    public class04891 method_6002() {
        return class04909.Qj;
    }

    public float method_6107() {
        return 0.4f;
    }

    public void method_6007() {
        super.method_6007();
        this.y = this.N;
        this.u = this.L;
        this.R = this.i;
        this.B = this.M;
        this.i += this.a;
        if ((double)this.i > Math.PI * 2) {
            if (this.method_73183().method_8608()) {
                this.i = (float)Math.PI * 2;
            } else {
                this.i -= (float)Math.PI * 2;
                if (this.field_5974.y(10) == 0) {
                    this.a = 1.0f / (this.field_5974.z() + 1.0f) * 0.2f;
                }
                this.method_73183().method_8421((class07049)this, (byte)19);
            }
        }
        if (this.method_5799()) {
            if (this.i < (float)Math.PI) {
                float f = this.i / (float)Math.PI;
                this.M = class04995.m((double)(f * f * (float)Math.PI)) * (float)Math.PI * 0.25f;
                if ((double)f > 0.75) {
                    if (this.method_66247()) {
                        this.method_18799(this.Z);
                    }
                    this.p = 1.0f;
                } else {
                    this.p *= 0.8f;
                }
            } else {
                this.M = 0.0f;
                if (this.method_66247()) {
                    this.method_18799(this.method_18798().L(0.9));
                }
                this.p *= 0.99f;
            }
            class06889 class068892 = this.method_18798();
            double d = class068892.Z();
            ((class07438)this).fields_4212a028292fd3c078969e3ee4c71d9e8_0 = Float.valueOf(((class07438)this).fields_4212a028292fd3c078969e3ee4c71d9e8_0.floatValue() + (-((float)class04995.u((double)class068892.M, (double)class068892.Z)) * 57.295776f - ((class07438)this).fields_4212a028292fd3c078969e3ee4c71d9e8_0.floatValue()) * 0.1f);
            this.method_36456(((class07438)this).fields_4212a028292fd3c078969e3ee4c71d9e8_0.floatValue());
            this.L += (float)Math.PI * this.p * 1.5f;
            this.N += (-((float)class04995.u((double)d, (double)class068892.B)) * 57.295776f - this.N) * 0.1f;
        } else {
            this.M = class04995.L((float)class04995.m((double)this.i)) * (float)Math.PI * 0.25f;
            if (!this.method_73183().method_8608()) {
                double d = this.method_18798().B;
                d = this.method_6059(class07047.d) ? 0.05 * (double)(this.method_6112(class07047.d).i() + 1) : (d -= this.method_56989());
                this.method_18800(0.0, d * (double)0.98f, 0.0);
            }
            this.N += (-90.0f - this.N) * 0.02f;
        }
    }

    public void method_6091(class06889 class068892) {
        this.method_5784(class07451.field_6308, this.method_18798());
    }

    public class04891 method_6011(class07072 class070722) {
        return class04909.Qv;
    }
}

