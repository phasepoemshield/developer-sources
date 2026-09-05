/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  minecraft.class00381
 *  minecraft.class00394
 *  minecraft.class00500
 *  minecraft.class00734
 *  minecraft.class00753
 *  minecraft.class00891
 *  minecraft.class01137
 *  minecraft.class06183
 *  minecraft.class06237
 *  minecraft.class06501
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class06661
 *  minecraft.class06680
 *  minecraft.class06889
 *  minecraft.class06912
 *  minecraft.class07041
 *  minecraft.class07049
 *  minecraft.class07050
 *  minecraft.class07071
 *  minecraft.class07082
 *  minecraft.class07085
 *  minecraft.class07087
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07259
 *  minecraft.class07282
 *  minecraft.class07284
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07323
 *  minecraft.class07356
 *  minecraft.class07438
 *  minecraft.class07529
 *  minecraft.class08033
 *  minecraft.class08036
 *  net.fabricmc.fabric.api.event.player.AttackBlockCallback
 *  net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents
 *  net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents$After
 *  net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents$Before
 *  net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents$Canceled
 *  net.fabricmc.fabric.api.event.player.UseBlockCallback
 *  net.fabricmc.fabric.api.event.player.UseItemCallback
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import com.mojang.logging.LogUtils;
import java.util.Objects;
import minecraft.class00381;
import minecraft.class00394;
import minecraft.class00500;
import minecraft.class00734;
import minecraft.class00753;
import minecraft.class00891;
import minecraft.class01137;
import minecraft.class04770;
import minecraft.class04782;
import minecraft.class06183;
import minecraft.class06237;
import minecraft.class06501;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06661;
import minecraft.class06680;
import minecraft.class06889;
import minecraft.class06912;
import minecraft.class07041;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class07071;
import minecraft.class07082;
import minecraft.class07085;
import minecraft.class07087;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07259;
import minecraft.class07282;
import minecraft.class07284;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07323;
import minecraft.class07356;
import minecraft.class07438;
import minecraft.class07529;
import minecraft.class08033;
import minecraft.class08036;
import net.fabricmc.fabric.api.event.player.AttackBlockCallback;
import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;
import net.fabricmc.fabric.api.event.player.UseBlockCallback;
import net.fabricmc.fabric.api.event.player.UseItemCallback;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class04787 {
    private static final double N = 1.0;
    private static final Logger y = LogUtils.getLogger();
    protected class04782 L;
    protected final class04770 u;
    private class07282 i = class07282.field_28045;
    private @Nullable class07282 R;
    private boolean M;
    private int B;
    private class07209 Z = class07209.field_10980;
    private int z;
    private boolean U;
    private class07209 E = class07209.field_10980;
    private int W;
    private int m = -1;

    public @Nullable class07282 L() {
        return this.R;
    }

    public class04787(class04770 class047702) {
        this.u = class047702;
        this.L = class047702.method_51469();
    }

    public boolean i() {
        return this.i.R();
    }

    public boolean u() {
        return this.i.M();
    }

    private void y(class07209 class072092, CallbackInfoReturnable callbackInfoReturnable, class00394 class003942, class00500 class005002) {
        ((PlayerBlockBreakEvents.After)PlayerBlockBreakEvents.AFTER.invoker()).afterBlockBreak((class07299)this.L, (class08036)this.u, class072092, class005002, class003942);
    }

    public class07282 y() {
        return this.i;
    }

    public boolean N(class07282 class072822) {
        if (class072822 == this.i) {
            return false;
        }
        class08033 class080332 = this.u.method_31549();
        this.N(class072822, this.i);
        if (class080332.y && class072822 != class07282.field_9219 && this.R()) {
            class080332.y = false;
        }
        this.u.method_7355();
        this.L.method_8503().Nm().N((class00381)new class06661(class06680.field_29137, this.u));
        this.L.method_8448();
        if (class072822 == class07282.field_9220) {
            this.u.method_58396();
        }
        return true;
    }

    public void N(class07209 class072092, class07356 class073562, class07211 class072112, int n, int n2, CallbackInfo callbackInfo) {
        if (class073562 != class07356.field_12968) {
            return;
        }
        if (((AttackBlockCallback)AttackBlockCallback.EVENT.invoker()).interact((class08036)this.u, (class07299)this.L, class07050.field_5808, class072092, class072112) != class07082.i) {
            class00381 var9;
            class00394 class003942;
            this.u.field_13987.method_14364((class00381)new class07259((class07290)this.L, class072092));
            if (this.L.method_8320(class072092).k() && (class003942 = this.L.method_8321(class072092)) != null && (var9 = class003942.i()) != null) {
                this.u.field_13987.method_14364(var9);
            }
            callbackInfo.cancel();
        }
    }

    public void N(class04782 class047822) {
        this.L = class047822;
    }

    public class07082 N(class04770 class047702, class07299 class072992, class06584 class065842, class07050 class070502, class06183 class061832) {
        class07082 class070822;
        class07082 class070823;
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N(class047702, class072992, class065842, class070502, class061832, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return (class07082)callbackInfoReturnable.getReturnValue();
        }
        class07209 class072092 = class061832.u();
        class00500 class005002 = class072992.method_8320(class072092);
        if (!class005002.i().N(class072992.method_45162())) {
            return class07082.u;
        }
        if (this.i == class07282.field_9219) {
            class06237 class062372 = class005002.N(class072992, class072092);
            if (class062372 != null) {
                class047702.method_17355(class062372);
                return class07082.L;
            }
            return class07082.i;
        }
        boolean bl = !class047702.method_6047().R() || !class047702.method_6079().R();
        boolean bl2 = class047702.method_21823() && bl;
        class06584 class065843 = class065842.t();
        if (!bl2) {
            class070823 = class005002.N(class047702.method_5998(class070502), class072992, (class08036)class047702, class070502, class061832);
            if (class070823.N()) {
                class06912.X.N(class047702, class072092, class065843);
                return class070823;
            }
            if (class070823 instanceof class07087 && class070502 == class07050.field_5808 && (class070822 = class005002.N(class072992, (class08036)class047702, class061832)).N()) {
                class06912.a.N(class047702, class072092);
                return class070822;
            }
        }
        if (class065842.R() || class047702.method_7357().N(class065842)) {
            return class07082.i;
        }
        class070823 = new class06501((class08036)class047702, class070502, class061832);
        if (class047702.method_56992()) {
            int n = class065842.c();
            class070822 = class065842.N((class06501)class070823);
            class065842.i(n);
        } else {
            class070822 = class065842.N((class06501)class070823);
        }
        if (class070822.N()) {
            class06912.X.N(class047702, class072092, class065843);
        }
        return class070822;
    }

    public void N(class07209 class072092, int n, String string) {
        if (this.N(class072092)) {
            this.N(class072092, true, n, string);
        } else {
            this.u.field_13987.method_14364((class00381)new class07259(class072092, this.L.method_8320(class072092)));
            this.N(class072092, false, n, string);
        }
    }

    private void N(class07209 class072092, CallbackInfoReturnable callbackInfoReturnable, class00394 class003942, class00500 class005002) {
        if (!((PlayerBlockBreakEvents.Before)PlayerBlockBreakEvents.BEFORE.invoker()).beforeBlockBreak((class07299)this.L, (class08036)this.u, class072092, class005002, class003942)) {
            ((PlayerBlockBreakEvents.Canceled)PlayerBlockBreakEvents.CANCELED.invoker()).onBlockBreakCanceled((class07299)this.L, (class08036)this.u, class072092, class005002, class003942);
            callbackInfoReturnable.setReturnValue((Object)false);
        }
    }

    public void N(class04770 class047702, class07299 class072992, class06584 class065842, class07050 class070502, CallbackInfoReturnable callbackInfoReturnable) {
        class07082 class070822 = ((UseItemCallback)UseItemCallback.EVENT.invoker()).interact((class08036)class047702, class072992, class070502);
        if (class070822 != class07082.i) {
            callbackInfoReturnable.setReturnValue((Object)class070822);
            callbackInfoReturnable.cancel();
            return;
        }
    }

    public void N(class04770 class047702, class07299 class072992, class06584 class065842, class07050 class070502, class06183 class061832, CallbackInfoReturnable callbackInfoReturnable) {
        class07082 class070822 = ((UseBlockCallback)UseBlockCallback.EVENT.invoker()).interact((class08036)class047702, class072992, class070502, class061832);
        if (class070822 != class07082.i) {
            callbackInfoReturnable.setReturnValue((Object)class070822);
            callbackInfoReturnable.cancel();
            return;
        }
    }

    public void N(class07209 class072092, class07356 class073562, class07211 class072112, int n, int n2) {
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        this.N(class072092, class073562, class072112, n, n2, callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        if (!this.u.method_56093(class072092, 1.0)) {
            this.N(class072092, false, n2, "too far");
            return;
        }
        if (class072092.method_10264() > n) {
            this.u.field_13987.method_14364((class00381)new class07259(class072092, this.L.method_8320(class072092)));
            this.N(class072092, false, n2, "too high");
            return;
        }
        if (class073562 == class07356.field_12968) {
            if (!this.L.method_8505((class07049)this.u, class072092)) {
                this.u.field_13987.method_14364((class00381)new class07259(class072092, this.L.method_8320(class072092)));
                this.N(class072092, false, n2, "may not interact");
                return;
            }
            if (this.u.method_31549().u) {
                this.N(class072092, n2, "creative destroy");
                return;
            }
            if (this.u.method_21701(this.L, class072092, this.i)) {
                this.u.field_13987.method_14364((class00381)new class07259(class072092, this.L.method_8320(class072092)));
                this.N(class072092, false, n2, "block action restricted");
                return;
            }
            this.B = this.z;
            float f = 1.0f;
            class00500 class005002 = this.L.method_8320(class072092);
            if (!class005002.P()) {
                class07323.N((class04782)this.L, (class06584)this.u.method_6047(), (class07438)this.u, (class07049)this.u, (class07085)class07085.field_6173, (class06889)class06889.y((class00753)class072092), (class00500)class005002, class065812 -> this.u.method_20235((class06581)class065812, class07085.field_6173));
                class005002.N((class07299)this.L, class072092, (class08036)this.u);
                f = class005002.N((class08036)this.u, (class07290)this.u.method_51469(), class072092);
            }
            if (!class005002.P() && f >= 1.0f) {
                this.N(class072092, n2, "insta mine");
            } else {
                if (this.M) {
                    this.u.field_13987.method_14364((class00381)new class07259(this.Z, this.L.method_8320(this.Z)));
                    this.N(class072092, false, n2, "abort destroying since another started (client insta mine, server disagreed)");
                }
                this.M = true;
                this.Z = class072092.method_10062();
                int n3 = (int)(f * 10.0f);
                this.L.method_8517(this.u.method_5628(), class072092, n3);
                this.N(class072092, true, n2, "actual start of destroying");
                this.m = n3;
            }
        } else if (class073562 == class07356.field_12973) {
            if (class072092.equals((Object)this.Z)) {
                int n4 = this.z - this.B;
                class00500 class005003 = this.L.method_8320(class072092);
                if (!class005003.P()) {
                    float f = class005003.N((class08036)this.u, (class07290)this.u.method_51469(), class072092) * (float)(n4 + 1);
                    if (f >= 0.7f) {
                        this.M = false;
                        this.L.method_8517(this.u.method_5628(), class072092, -1);
                        this.N(class072092, n2, "destroyed");
                        return;
                    }
                    if (!this.U) {
                        this.M = false;
                        this.U = true;
                        this.E = class072092;
                        this.W = this.B;
                    }
                }
            }
            this.N(class072092, true, n2, "stopped destroying");
        } else if (class073562 == class07356.field_12971) {
            this.M = false;
            if (!Objects.equals(this.Z, class072092)) {
                y.warn("Mismatch in destroy block pos: {} {}", (Object)this.Z, (Object)class072092);
                this.L.method_8517(this.u.method_5628(), this.Z, -1);
                this.N(class072092, true, n2, "aborted mismatched destroying");
            }
            this.L.method_8517(this.u.method_5628(), class072092, -1);
            this.N(class072092, true, n2, "aborted destroying");
        }
    }

    private void N(class07209 class072092, boolean bl, int n, String string) {
        if (class07529.C) {
            y.debug("Server ACK {} {} {} {}", new Object[]{n, class072092, bl, string});
        }
    }

    private float N(class00500 class005002, class07209 class072092, int n) {
        int n2 = this.z - n;
        float f = class005002.N((class08036)this.u, (class07290)this.u.method_51469(), class072092) * (float)(n2 + 1);
        int n3 = (int)(f * 10.0f);
        if (n3 != this.m) {
            this.L.method_8517(this.u.method_5628(), class072092, n3);
            this.m = n3;
        }
        return f;
    }

    public void N() {
        ++this.z;
        if (this.U) {
            class00500 class005002 = this.L.method_8320(this.E);
            if (class005002.P()) {
                this.U = false;
            } else if (this.N(class005002, this.E, this.W) >= 1.0f) {
                this.U = false;
                this.N(this.E);
            }
        } else if (this.M) {
            class00500 class005003 = this.L.method_8320(this.Z);
            if (class005003.P()) {
                this.L.method_8517(this.u.method_5628(), this.Z, -1);
                this.m = -1;
                this.M = false;
            } else {
                this.N(class005003, this.Z, this.B);
            }
        }
    }

    public class07082 N(class04770 class047702, class07299 class072992, class06584 class065842, class07050 class070502) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N(class047702, class072992, class065842, class070502, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return (class07082)callbackInfoReturnable.getReturnValue();
        }
        if (this.i == class07282.field_9219) {
            return class07082.i;
        }
        if (class047702.method_7357().N(class065842)) {
            return class07082.i;
        }
        int n = class065842.c();
        int n2 = class065842.P();
        class07082 class070822 = class065842.N(class072992, (class08036)class047702, class070502);
        class06584 class065843 = class070822 instanceof class07041 ? Objects.requireNonNullElse(((class07041)class070822).u(), class047702.method_5998(class070502)) : class047702.method_5998(class070502);
        if (class065843 == class065842 && class065843.c() == n && class065843.N((class07438)class047702) <= 0 && class065843.P() == n2) {
            return class070822;
        }
        if (class070822 instanceof class07071 && class065843.N((class07438)class047702) > 0 && !class047702.method_6115()) {
            return class070822;
        }
        if (class065842 != class065843) {
            class047702.method_6122(class070502, class065843);
        }
        if (class065843.R()) {
            class047702.method_6122(class070502, class06584.E);
        }
        if (!class047702.method_6115()) {
            class047702.fields_07fa3311b0e9d3e9b883d09222919bf5a_2.y();
        }
        return class070822;
    }

    public boolean N(class07209 class072092) {
        class00500 class005002 = this.L.method_8320(class072092);
        if (!this.u.method_6047().N(class005002, (class07299)this.L, class072092, (class08036)this.u)) {
            return false;
        }
        class00394 class003942 = this.L.method_8321(class072092);
        class00891 class008912 = class005002.i();
        if (class008912 instanceof class01137 && !this.u.method_7338()) {
            this.L.method_8413(class072092, class005002, class005002, 3);
            return false;
        }
        if (this.u.method_21701(this.L, class072092, this.i)) {
            return false;
        }
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N(class072092, callbackInfoReturnable, class003942, class005002);
        if (callbackInfoReturnable.isCancelled()) {
            return callbackInfoReturnable.getReturnValueZ();
        }
        class00500 class005003 = class008912.N((class07299)this.L, class072092, class005002, (class08036)this.u);
        boolean bl = this.L.method_8650(class072092, false);
        if (class07529.C) {
            y.info("server broke {} {} -> {}", new Object[]{class072092, class005003, this.L.method_8320(class072092)});
        }
        if (bl) {
            this.y(class072092, null, class003942, class005003);
            class008912.N_7((class07284)this.L, class072092, class005003);
        }
        if (this.u.method_66324()) {
            return true;
        }
        class06584 class065842 = this.u.method_6047();
        class06584 class065843 = class065842.t();
        boolean bl2 = this.u.method_7305(class005003);
        class065842.N((class07299)this.L, class005003, class072092, (class08036)this.u);
        if (bl && bl2) {
            class008912.N((class07299)this.L, (class08036)this.u, class072092, class005003, class003942, class065843);
        }
        return true;
    }

    protected void N(class07282 class072822, @Nullable class07282 class072823) {
        this.R = class072823;
        this.i = class072822;
        class08033 class080332 = this.u.method_31549();
        class072822.N(class080332);
    }

    private boolean R() {
        return class07049.method_74656((class07049)this.u, (class07299)this.L, (class00734)this.u.method_5829()).isEmpty() && this.u.method_74657(1.0) < 1.0;
    }
}

