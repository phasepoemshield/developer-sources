/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00381
 *  minecraft.class00392
 *  minecraft.class01232
 *  minecraft.class01270
 *  minecraft.class01310
 *  minecraft.class01395
 *  minecraft.class01623
 *  minecraft.class01885
 *  minecraft.class02041
 *  minecraft.class02060
 *  minecraft.class02062
 *  minecraft.class02071
 *  minecraft.class02072
 *  minecraft.class02080
 *  minecraft.class02102
 *  minecraft.class03448
 *  minecraft.class03577
 *  minecraft.class03686
 *  minecraft.class04141
 *  minecraft.class04210
 *  minecraft.class04328
 *  minecraft.class04631
 *  minecraft.class04654
 *  minecraft.class04695
 *  minecraft.class04698
 *  minecraft.class05096
 *  minecraft.class05220
 *  minecraft.class05336
 *  minecraft.class05362
 *  minecraft.class05630
 *  minecraft.class06202
 *  minecraft.class06279
 *  minecraft.class06287
 *  minecraft.class06321
 *  minecraft.class06366
 *  minecraft.class06478
 *  minecraft.class07086
 *  net.caffeinemc.mods.sodium.client.gui.VideoSettingsScreen
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import java.util.function.Supplier;
import minecraft.class00381;
import minecraft.class00392;
import minecraft.class01232;
import minecraft.class01270;
import minecraft.class01310;
import minecraft.class01395;
import minecraft.class01623;
import minecraft.class01885;
import minecraft.class02041;
import minecraft.class02060;
import minecraft.class02062;
import minecraft.class02071;
import minecraft.class02072;
import minecraft.class02080;
import minecraft.class02102;
import minecraft.class03448;
import minecraft.class03577;
import minecraft.class03686;
import minecraft.class04141;
import minecraft.class04210;
import minecraft.class04328;
import minecraft.class04631;
import minecraft.class04654;
import minecraft.class04695;
import minecraft.class04698;
import minecraft.class05096;
import minecraft.class05220;
import minecraft.class05336;
import minecraft.class05362;
import minecraft.class05630;
import minecraft.class05733;
import minecraft.class06202;
import minecraft.class06279;
import minecraft.class06287;
import minecraft.class06321;
import minecraft.class06366;
import minecraft.class06478;
import minecraft.class07086;
import net.caffeinemc.mods.sodium.client.gui.VideoSettingsScreen;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class05716
extends class05096 {
    private static final class00392 y = class00392.L((String)"options.title");
    private static final class00392 L = class00392.L((String)"options.skinCustomisation");
    private static final class00392 u = class00392.L((String)"options.sounds");
    private static final class00392 i = class00392.L((String)"options.video");
    public static final class00392 N = class00392.L((String)"options.controls");
    private static final class00392 R = class00392.L((String)"options.language");
    private static final class00392 M = class00392.L((String)"options.chat");
    private static final class00392 B = class00392.L((String)"options.resourcepack");
    private static final class00392 Z = class00392.L((String)"options.accessibility");
    private static final class00392 z = class00392.L((String)"options.telemetry");
    private static final class04141 U = class04141.N((class00392)class00392.L((String)"options.telemetry.disabled"));
    private static final class00392 E = class00392.L((String)"options.credits_and_attribution");
    private static final int W = 2;
    private final class03686 m = new class03686((class05096)this, 61, 33);
    private final class05096 P;
    private final class05630 s;
    private @Nullable class06366<class07086> T;
    private @Nullable class01232 b;

    public class05716(class05096 class050962, class05630 class056302) {
        super(y);
        this.P = class050962;
        this.s = class056302;
    }

    private void N(CallbackInfoReturnable callbackInfoReturnable) {
        callbackInfoReturnable.setReturnValue((Object)VideoSettingsScreen.createScreen((class05096)this));
    }

    private void N(boolean bl) {
        this.field_22787.N((class05096)this);
        if (bl && (class03448)this.field_22787.T_3 != null && this.b != null && this.T != null) {
            this.field_22787.NE().N((class00381)new class06321(true));
            this.b.N(true);
            this.b.field_22763 = false;
            this.T.field_22763 = false;
        }
    }

    public static class06366<class07086> N(int n, int n2, String string, class06202 class062022) {
        return class06366.N(class07086::y, (Object)((class03448)class062022.T_3).y()).N((Object[])class07086.values()).N(n, n2, 150, 20, (class00392)class00392.L((String)string), (class063662, class070862) -> class062022.NE().N((class00381)new class06287(class070862)));
    }

    private class02102 N() {
        if ((class03448)this.field_22787.T_3 != null && this.field_22787.v()) {
            this.T = class05716.N(0, 0, "options.difficulty", this.field_22787);
            if (!((class03448)this.field_22787.T_3).method_8401().U()) {
                this.b = new class01232(0, 0, class053622 -> this.field_22787.N((class05096)new class05733(this::N, (class00392)class00392.L((String)"difficulty.lock.title"), (class00392)class00392.N((String)"difficulty.lock.question", (Object[])new Object[]{((class03448)this.field_22787.T_3).method_8401().s().y()}))));
                this.T.method_25358(this.T.method_25368() - this.b.method_25368());
                this.b.N(((class03448)this.field_22787.T_3).method_8401().T());
                this.b.field_22763 = !this.b.y();
                this.T.field_22763 = !this.b.y();
                class02041 class020412 = new class02041(150, 0, class02062.field_40789);
                class020412.N(this.T);
                class020412.N((class02102)this.b);
                return class020412;
            }
            this.T.field_22763 = false;
            return this.T;
        }
        return class05362.method_46430((class00392)class00392.L((String)"options.online"), class053622 -> this.field_22787.N((class05096)new class04328((class05096)this, this.s))).N(this.field_22789 / 2 + 5, this.field_22790 / 6 - 12 + 24, 150, 20).N();
    }

    private void N(class01623 class016232) {
        this.s.N(class016232);
        this.field_22787.N((class05096)this);
    }

    private class05362 N(class00392 class003922, Supplier<class05096> supplier) {
        return class05362.method_46430((class00392)class003922, class053622 -> this.field_22787.N((class05096)supplier.get())).N();
    }

    public void method_25426() {
        class01885 class018852 = (class01885)this.m.N((class02102)class01885.u().N(8));
        class018852.N((class02102)new class02071(y, this.field_22793), class02072::y);
        class01885 class018853 = ((class01885)class018852.N((class02102)class01885.i())).N(8);
        class018853.N((class02102)this.s.Nw().method_57701((class05630)this.field_22787.i_7));
        class018853.N(this.N());
        class02060 class020602 = new class02060();
        class020602.L().R(4).i(4).y();
        class02080 class020802 = class020602.u(2);
        class020802.N((class02102)this.N(L, () -> new class04695((class05096)this, this.s)));
        class020802.N((class02102)this.N(u, () -> new class04698((class05096)this, this.s)));
        class020802.N((class02102)this.N(i, () -> {
            CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
            this.N(callbackInfoReturnable);
            if (callbackInfoReturnable.isCancelled()) {
                return (class05096)callbackInfoReturnable.getReturnValue();
            }
            return new class04631((class05096)this, this.field_22787, this.s);
        }));
        class020802.N((class02102)this.N(N, () -> new class01395((class05096)this, this.s)));
        class020802.N((class02102)this.N(R, () -> new class06279((class05096)this, this.s, this.field_22787.X())));
        class020802.N((class02102)this.N(M, () -> new class01310((class05096)this, this.s)));
        class020802.N((class02102)this.N(B, () -> new class01270(this.field_22787.t(), this::N, this.field_22787.M(), (class00392)class00392.L((String)"resourcePack.title"))));
        class020802.N((class02102)this.N(Z, () -> new class05336((class05096)this, this.s)));
        class05362 class053623 = (class05362)class020802.N((class02102)this.N(z, () -> new class04210((class05096)this, this.s)));
        if (!this.field_22787.NC()) {
            class053623.field_22763 = false;
            class053623.method_47400(U);
        }
        class020802.N((class02102)this.N(E, () -> new class03577((class05096)this)));
        this.m.L((class02102)class020602);
        this.m.y((class02102)class05362.method_46430((class00392)class05220.u, class053622 -> this.method_25419()).N(200).N());
        this.m.method_48206(class046542 -> {
            class06478 cfr_ignored_0 = (class06478)this.method_37063((class04654)class046542);
        });
        this.method_48640();
    }

    public void method_48640() {
        this.m.N();
    }

    public void method_25432() {
        this.s.Np();
    }

    public void method_25419() {
        this.field_22787.N(this.P);
    }
}

