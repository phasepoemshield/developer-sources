/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09351
 *  Nursultan.class11938
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00500
 *  minecraft.class00891
 *  minecraft.class01362
 *  minecraft.class04453
 *  minecraft.class06202
 *  minecraft.class06889
 *  minecraft.class07047
 *  minecraft.class07049
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07438
 *  minecraft.class08400
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import Nursultan.class09351;
import Nursultan.class11938;
import com.mojang.serialization.MapCodec;
import minecraft.class00500;
import minecraft.class00891;
import minecraft.class01362;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class07047;
import minecraft.class07049;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class08400;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class00663
extends class00891 {
    public static final MapCodec<class00663> N = class00663.y(class00663::new);

    public class00663(class01362 class013622) {
        super(class013622);
    }

    private void N(class00500 class005002, class07299 class072992, class07209 class072092, class07049 class070492, class08400 class084002, boolean bl, CallbackInfo callbackInfo) {
        if (!class072992.method_8608() || class070492 != (class04453)class06202.Nq().T_4) {
            return;
        }
        class09351 class093512 = class09351.N((class07209)class072092);
        class11938.L().L((Object)class093512);
        if (class093512.y()) {
            callbackInfo.cancel();
        }
    }

    protected void N(class00500 class005002, class07299 class072992, class07209 class072092, class07049 class070492, class08400 class084002, boolean bl) {
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        this.N(class005002, class072992, class072092, class070492, class084002, bl, callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        class06889 class068892 = new class06889(0.25, (double)0.05f, 0.25);
        if (class070492 instanceof class07438 && ((class07438)class070492).method_6059(class07047.V)) {
            class068892 = new class06889(0.5, 0.25, 0.5);
        }
        class070492.method_5844(class005002, class068892);
    }

    public MapCodec<class00663> N() {
        return N;
    }
}

