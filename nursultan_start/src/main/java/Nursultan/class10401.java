/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11814
 *  Nursultan.class11824
 *  com.mojang.authlib.GameProfile
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  minecraft.class03448
 *  minecraft.class04477
 *  minecraft.class06889
 *  minecraft.class07072
 *  minecraft.class07276
 *  minecraft.class07438
 *  minecraft.class08694
 *  minecraft.class08700
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package Nursultan;

import Nursultan.class11814;
import Nursultan.class11824;
import com.mojang.authlib.GameProfile;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import minecraft.class03448;
import minecraft.class04477;
import minecraft.class06889;
import minecraft.class07072;
import minecraft.class07276;
import minecraft.class07438;
import minecraft.class08694;
import minecraft.class08700;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class10401
extends class04477
implements class11814 {
    private static double[] M;
    private static String[] W;
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public boolean N_init;

    private static void M() {
        W = new String[1];
        class10401.W[0] = "push";
    }

    public void method_31471(class07276 class072762) {
        super.method_31471(class072762);
        this.method_22862();
    }

    public void method_5773() {
        super.method_5773();
        this.method_29242(false);
    }

    public boolean method_5640(double d) {
        double d2 = this.method_5829().N() * M[0];
        if (Double.isNaN(d2)) {
            d2 = M[1];
        }
        return d < (d2 *= M[2] * class10401.method_5824()) * d2;
    }

    public boolean method_5643(class07072 class070722) {
        return true;
    }

    public void method_5750(class06889 class068892) {
        this.R();
        this.N_0 = class068892;
        this.N_1 = this.method_5864().m() + 1;
    }

    public class10401(class03448 class034482, GameProfile gameProfile) {
        super(class034482, gameProfile);
        this.R();
        this.N_2 = new class11824();
        this.N_0 = class06889.L;
        this.field_5960 = true;
    }

    static {
        class10401.i();
        class10401.M();
    }

    private static void i() {
        M = new double[3];
        class10401.M[0] = Double.longBitsToDouble(0x4024000000000000L);
        class10401.M[1] = Double.longBitsToDouble(0x3FF0000000000000L);
        class10401.M[2] = Double.longBitsToDouble(0x4050000000000000L);
    }

    private void N(CallbackInfo callbackInfo) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_13_2)) {
            super.method_7318();
        }
    }

    public class11824 dataManager() {
        this.R();
        return (class11824)this.N_2;
    }

    private void R() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_1 = 0;
        }
    }

    public void method_6007() {
        this.R();
        if (this.method_66245()) {
            this.method_66233().method_66271();
        }
        if (((class07438)this).fields_7212a028292fd3c078969e3ee4c71d9e8_5 > 0) {
            this.method_52539(((class07438)this).fields_7212a028292fd3c078969e3ee4c71d9e8_5, ((class07438)this).fields_7212a028292fd3c078969e3ee4c71d9e8_4);
            ((class07438)this).fields_7212a028292fd3c078969e3ee4c71d9e8_5 = ((class07438)this).fields_7212a028292fd3c078969e3ee4c71d9e8_5 - 1;
        }
        if ((Integer)this.N_1 > 0) {
            this.method_45319(new class06889((((class06889)this.N_0).M - this.method_18798().M) / (double)((Integer)this.N_1).intValue(), (((class06889)this.N_0).B - this.method_18798().B) / (double)((Integer)this.N_1).intValue(), (((class06889)this.N_0).Z - this.method_18798().Z) / (double)((Integer)this.N_1).intValue()));
            this.N_1 = (Integer)this.N_1 - 1;
        }
        this.method_6119();
        this.W();
        try (class08694 class086942 = class08700.N().i(W[0]);){
            this.method_6070();
        }
    }

    public void method_7318() {
        this.N(null);
    }
}

