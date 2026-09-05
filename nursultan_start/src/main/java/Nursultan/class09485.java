/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class00565
 *  minecraft.class00717
 *  minecraft.class01615
 *  minecraft.class04770
 *  minecraft.class04782
 *  minecraft.class06145
 *  minecraft.class06584
 *  minecraft.class06889
 *  minecraft.class06912
 *  minecraft.class07041
 *  minecraft.class07049
 *  minecraft.class07050
 *  minecraft.class07057
 *  minecraft.class07064
 *  minecraft.class07082
 *  minecraft.class07299
 *  minecraft.class08007
 *  minecraft.class08036
 *  net.fabricmc.fabric.api.event.player.UseEntityCallback
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package Nursultan;

import Nursultan.class09484;
import minecraft.class00392;
import minecraft.class00565;
import minecraft.class00717;
import minecraft.class01615;
import minecraft.class04770;
import minecraft.class04782;
import minecraft.class06145;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class06912;
import minecraft.class07041;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class07057;
import minecraft.class07064;
import minecraft.class07082;
import minecraft.class07299;
import minecraft.class08007;
import minecraft.class08036;
import net.fabricmc.fabric.api.event.player.UseEntityCallback;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class09485
implements class00565 {
    final /* synthetic */ class04782 N;
    final /* synthetic */ class07049 y;
    final /* synthetic */ class01615 L;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public class09485(class01615 class016152, class04782 class047822, class07049 class070492) {
        this.L = class016152;
        this.N = class047822;
        this.y = class070492;
    }

    public void N() {
        class08007 class080072;
        if (this.y instanceof class00717 || this.y instanceof class07057 || this.y == this.L.field_14140 || this.y instanceof class08007 && !(class080072 = (class08007)this.y).method_5732()) {
            this.L.method_52396((class00392)class00392.L((String)"multiplayer.disconnect.invalid_entity_attacked"));
            class01615.field_14121.warn("Player {} tried to attack an invalid entity", (Object)this.L.field_14140.method_74861());
            return;
        }
        class080072 = this.L.field_14140.method_5998(class07050.field_5808);
        if (!class080072.N(this.N.method_45162())) {
            return;
        }
        if (this.L.field_14140.method_75202((class06584)class080072, 5)) {
            return;
        }
        this.L.field_14140.method_5997(this.y);
    }

    public void N(class07050 class070502, class06889 class068892, CallbackInfo callbackInfo) {
        class04770 class047702 = this.L.field_14140;
        class07299 class072992 = class047702.method_73183();
        class06145 class061452 = new class06145(this.y, class068892.y(this.y.method_23317(), this.y.method_23318(), this.y.method_23321()));
        if (((UseEntityCallback)UseEntityCallback.EVENT.invoker()).interact((class08036)class047702, class072992, class070502, this.y, class061452) != class07082.i) {
            callbackInfo.cancel();
        }
    }

    public void N(class07050 class070502, CallbackInfo callbackInfo) {
        class04770 class047702 = this.L.field_14140;
        class07299 class072992 = class047702.method_73183();
        if (((UseEntityCallback)UseEntityCallback.EVENT.invoker()).interact((class08036)class047702, class072992, class070502, this.y, null) != class07082.i) {
            callbackInfo.cancel();
        }
    }

    public void N(class07050 class070503, class06889 class068892) {
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        this.N(class070503, class068892, callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        this.N(class070503, (class04770 class047702, class07049 class070492, class07050 class070502) -> class070492.method_5664((class08036)class047702, class068892, class070502));
    }

    public void N(class07050 class070502) {
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        this.N(class070502, callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        this.N(class070502, class08036::method_7287);
    }

    private void N(class07050 class070502, class09484 class094842) {
        class06584 class065842 = this.L.field_14140.method_5998(class070502);
        if (!class065842.N(this.N.method_45162())) {
            return;
        }
        class06584 class065843 = class065842.t();
        class07082 class070822 = class094842.run(this.L.field_14140, this.y, class070502);
        if (class070822 instanceof class07041) {
            class07041 class070412 = (class07041)class070822;
            class06584 class065844 = class070412.L() ? class065843 : class06584.E;
            class06912.C.N(this.L.field_14140, class065844, this.y);
            if (class070412.i() == class07064.field_52428) {
                this.L.field_14140.method_23667(class070502, true);
            }
        }
    }
}

