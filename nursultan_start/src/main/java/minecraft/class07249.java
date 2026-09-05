/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00394
 *  minecraft.class00404
 *  minecraft.class00500
 *  minecraft.class00717
 *  minecraft.class00753
 *  minecraft.class01164
 *  minecraft.class01194
 *  minecraft.class01929
 *  minecraft.class01986
 *  minecraft.class02206
 *  minecraft.class02220
 *  minecraft.class02484
 *  minecraft.class03556
 *  minecraft.class06584
 *  minecraft.class06695
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07122
 *  minecraft.class07209
 *  minecraft.class08092
 *  minecraft.class08299
 *  minecraft.class08329
 *  net.fabricmc.fabric.impl.transfer.item.SpecialLogicInventory
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import java.util.Optional;
import minecraft.class00394;
import minecraft.class00404;
import minecraft.class00500;
import minecraft.class00717;
import minecraft.class00753;
import minecraft.class01164;
import minecraft.class01194;
import minecraft.class01929;
import minecraft.class01986;
import minecraft.class02206;
import minecraft.class02220;
import minecraft.class02484;
import minecraft.class03556;
import minecraft.class06584;
import minecraft.class06695;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07122;
import minecraft.class07209;
import minecraft.class07284;
import minecraft.class07299;
import minecraft.class08092;
import minecraft.class08299;
import minecraft.class08329;
import net.fabricmc.fabric.impl.transfer.item.SpecialLogicInventory;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class07249
extends class00394
implements class01986,
SpecialLogicInventory {
    public static final String N = "RecordItem";
    public static final String y = "ticks_since_song_started";
    private class06584 u = class06584.E;
    private final class02220 i = new class02220(this::u, this.d());
    private boolean R = false;

    public void L(class06584 class065842) {
        this.u = class065842;
        class02206.N((class01929)this.z.method_30349(), (class06584)class065842).ifPresent(class035562 -> this.i.N(class035562, 0L));
        this.z.method_8408(this.d(), this.w().i());
        this.method_5431();
    }

    public class02220 L() {
        return this.i;
    }

    public void M() {
        if (this.z == null || this.z.method_8608()) {
            return;
        }
        class07209 class072092 = this.d();
        class06584 class065842 = this.N();
        if (class065842.R()) {
            return;
        }
        this.U();
        class06889 class068892 = class06889.N((class00753)class072092, (double)0.5, (double)1.01, (double)0.5).y(this.z.field_9229, 0.7f);
        class06584 class065843 = class065842.t();
        class00717 class007172 = new class00717(this.z, class068892.N(), class068892.y(), class068892.L(), class065843);
        class007172.L();
        this.z.method_8649((class07049)class007172);
        this.u();
    }

    public class07249(class07209 class072092, class00500 class005002) {
        super(class00404.field_11907, class072092, class005002);
    }

    public int B() {
        return class02206.N((class01929)this.z.method_30349(), (class06584)this.u).map(class03556::N).map(class02206::i).orElse(0);
    }

    public class00394 Z() {
        return this;
    }

    public void z() {
        class02206.N((class01929)this.z.method_30349(), (class06584)this.N()).ifPresent(class035562 -> this.i.N((class07284)this.z, class035562));
    }

    public void u() {
        this.z.method_8408(this.d(), this.w().i());
        this.method_5431();
    }

    public boolean N(class06695 class066952, int n, class06584 class065842) {
        return class066952.N_60(class06584::R);
    }

    public void N(class07209 class072092, class00500 class005002) {
        this.M();
    }

    public class06584 N() {
        return this.u;
    }

    protected void N(class08329 class083292) {
        super.N(class083292);
        if (!this.N().R()) {
            class083292.N(N, class06584.y, (Object)this.N());
        }
        if (this.i.y() != null) {
            class083292.N(y, this.i.L());
        }
    }

    protected void N(class08299 class082992) {
        super.N(class082992);
        class06584 class065842 = class082992.N(N, class06584.y).orElse(class06584.E);
        if (!this.u.R() && !class06584.L((class06584)class065842, (class06584)this.u)) {
            this.i.N((class07284)this.z, this.w());
        }
        this.u = class065842;
        class082992.R(y).ifPresent(l -> class02206.N((class01929)class082992.N(), (class06584)this.u).ifPresent(class035562 -> this.i.N(class035562, l.longValue())));
    }

    public static void N(class07299 class072992, class07209 class072092, class00500 class005002, class07249 class072492) {
        class072492.i.y((class07284)class072992, class005002);
    }

    private void N(boolean bl) {
        if (this.z == null || this.z.method_8320(this.d()) != this.w()) {
            return;
        }
        this.z.method_8652(this.d(), (class00500)this.w().y((class08092)class07122.y, (Comparable)Boolean.valueOf(bl)), 2);
        this.z.N((class03556)class01194.L, this.d(), class01164.N((class00500)this.w()));
    }

    private void N(class06584 class065842, CallbackInfo callbackInfo) {
        if (this.R) {
            this.u = class065842;
            callbackInfo.cancel();
        }
    }

    public void N(class06584 class065842) {
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        this.N(class065842, callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        this.u = class065842;
        boolean bl = !this.u.R();
        Optional var3 = class02206.N((class01929)this.z.method_30349(), (class06584)this.u);
        this.N(bl);
        if (bl && var3.isPresent()) {
            this.i.N((class07284)this.z, (class03556)var3.get());
        } else {
            this.i.N((class07284)this.z, this.w());
        }
    }

    public class06584 N(int n) {
        class06584 class065842 = this.u;
        this.N(class06584.E);
        return class065842;
    }

    public boolean method_5437(int n, class06584 class065842) {
        return class065842.L(class02484.NE) && this.method_5438(n).R();
    }

    public int method_5444() {
        return 1;
    }

    public void r_() {
        super.r_();
        this.z.N((class03556)class01194.I, this.d(), class01164.N((class00500)this.w()));
        this.z.N(1011, this.d(), 0);
    }

    public void fabric_onFinalCommit(int n, class06584 class065842, class06584 class065843) {
        this.N(class065843);
    }

    public void fabric_setSuppress(boolean bl) {
        this.R = bl;
    }
}

