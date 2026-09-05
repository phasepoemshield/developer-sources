/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.MoreObjects
 *  com.google.common.collect.Lists
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime
 *  com.mojang.authlib.GameProfile
 *  com.mojang.logging.LogUtils
 *  de.maxhenkel.voicechat.events.PublishServerEvents
 *  javax.annotation.Nullable
 *  minecraft.class00074
 *  minecraft.class00737
 *  minecraft.class01062
 *  minecraft.class01235
 *  minecraft.class01623
 *  minecraft.class01929
 *  minecraft.class02270
 *  minecraft.class02277
 *  minecraft.class02796
 *  minecraft.class03463
 *  minecraft.class03531
 *  minecraft.class03930
 *  minecraft.class04032
 *  minecraft.class04453
 *  minecraft.class04490
 *  minecraft.class04495
 *  minecraft.class04643
 *  minecraft.class04770
 *  minecraft.class04773
 *  minecraft.class04785
 *  minecraft.class04995
 *  minecraft.class05630
 *  minecraft.class05946
 *  minecraft.class06132
 *  minecraft.class06202
 *  minecraft.class06289
 *  minecraft.class06724
 *  minecraft.class06728
 *  minecraft.class06734
 *  minecraft.class06739
 *  minecraft.class06748
 *  minecraft.class06984
 *  minecraft.class07001
 *  minecraft.class07080
 *  minecraft.class07209
 *  minecraft.class07282
 *  minecraft.class07321
 *  minecraft.class07529
 *  minecraft.class08152
 *  minecraft.class08299
 *  minecraft.class08700
 *  minecraft.class08773
 *  minecraft.class08774
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 *  page.langeweile.ok_zoomer.utils.ZoomUtils
 *  page.langeweile.ok_zoomer.zoom.Zoom
 */
package minecraft;

import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import de.maxhenkel.voicechat.events.PublishServerEvents;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import minecraft.class00074;
import minecraft.class00737;
import minecraft.class01062;
import minecraft.class01235;
import minecraft.class01623;
import minecraft.class01929;
import minecraft.class02270;
import minecraft.class02277;
import minecraft.class02796;
import minecraft.class03463;
import minecraft.class03531;
import minecraft.class03930;
import minecraft.class04032;
import minecraft.class04453;
import minecraft.class04490;
import minecraft.class04495;
import minecraft.class04643;
import minecraft.class04770;
import minecraft.class04773;
import minecraft.class04785;
import minecraft.class04995;
import minecraft.class05630;
import minecraft.class05946;
import minecraft.class06132;
import minecraft.class06202;
import minecraft.class06289;
import minecraft.class06724;
import minecraft.class06728;
import minecraft.class06734;
import minecraft.class06739;
import minecraft.class06748;
import minecraft.class06984;
import minecraft.class07001;
import minecraft.class07080;
import minecraft.class07209;
import minecraft.class07282;
import minecraft.class07321;
import minecraft.class07529;
import minecraft.class08152;
import minecraft.class08299;
import minecraft.class08308;
import minecraft.class08338;
import minecraft.class08700;
import minecraft.class08773;
import minecraft.class08774;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import page.langeweile.ok_zoomer.utils.ZoomUtils;
import page.langeweile.ok_zoomer.zoom.Zoom;

public class class08337
extends class02796 {
    private static final Logger W = LogUtils.getLogger();
    private static final int m = 2;
    public static final int N = 8;
    private final class06202 P;
    private boolean s = true;
    private int T = -1;
    private @Nullable class07282 b;
    private @Nullable class08338 j;
    private @Nullable UUID v;
    private int n = 0;
    private volatile List<class06748> t = new ArrayList<class06748>();
    private final class06739 G = new class06739();

    protected class02270 l() {
        return this.P.ND().Z();
    }

    public boolean M() {
        return true;
    }

    public boolean P() {
        return this.T > -1;
    }

    private void X() {
        if (this.B.y()) {
            this.P.execute(() -> class06132.N((class06202)this.P));
        }
    }

    public class06984 T() {
        return class06984.L;
    }

    public class08337(Thread thread, class06202 class062022, class04785 class047852, class01623 class016232, class03531 class035312, class03930 class039302, class08773 class087732) {
        super(thread, class047852, class016232, class035312, class062022.NJ(), class062022.Nh(), class039302, class087732);
        this.N(class062022.NH());
        this.U(class062022.E());
        this.N((class01062)new class00074(this, this.yG(), this.Z));
        this.P = class062022;
    }

    public boolean B() {
        return true;
    }

    public Path Z() {
        return ((File)this.P.l_1).toPath();
    }

    private void e() {
        this.c();
        Iterator var1 = this.Nm().v().iterator();
        while (var1.hasNext()) {
            ((class04770)var1.next()).method_7281(class01235.E);
        }
    }

    public class06984 d() {
        return class06984.L;
    }

    public class06289 n() {
        class07001 class070012 = this.E.t();
        if (class070012 == null) {
            return super.n();
        }
        try (class04495 class044952 = new class04495(W);){
            class08299 class082992 = class08308.N((class04490)class044952, (class01929)this.yt(), class070012);
            class04773 class047732 = class082992.N(class04773.N).orElse(class04773.y);
            if (class047732.N().isPresent() && class047732.y().isPresent()) {
                class06289 class062892 = new class06289((class05946)class047732.N().get(), class07209.method_49638((class00737)((class00737)class047732.y().get())));
                return class062892;
            }
        }
        return super.n();
    }

    public void m() {
        super.m();
        if (this.j != null) {
            this.j.interrupt();
            this.j = null;
        }
    }

    public int t() {
        return 8;
    }

    public @Nullable class07282 v() {
        if (this.P() && !this.ao_()) {
            return (class07282)MoreObjects.firstNonNull((Object)this.b, (Object)this.E.z());
        }
        return null;
    }

    public boolean j() {
        return ((class05630)this.P.i_7).NQ;
    }

    public int U() {
        return 0;
    }

    public boolean z() {
        return false;
    }

    public void y(Throwable throwable, class02277 class022772, class07321 class073212) {
        super.y(throwable, class022772, class073212);
        this.X();
        this.P.execute(() -> class06132.y((class06202)this.P, (class07321)class073212));
    }

    public void y(boolean bl) {
        this.i(() -> {
            for (class04770 class047702 : Lists.newArrayList((Iterable)this.Nm().v())) {
                if (class047702.method_5667().equals(this.v)) continue;
                this.Nm().y(class047702);
            }
        });
        super.y(bl);
        if (this.j != null) {
            this.j.interrupt();
            this.j = null;
        }
    }

    private int y(int n) {
        return (int)((Double)((class05630)this.P.i_7).M().method_41753() * (double)n);
    }

    public boolean E() {
        return ((class05630)this.P.i_7).NC();
    }

    public class03463 N(class03463 class034632) {
        class034632.N("Type", "Integrated Server (map_client.txt)");
        class034632.N("Is Modded", () -> this.aq_().y());
        class034632.N("Launched Version", () -> ((class06202)this.P).f());
        return class034632;
    }

    public boolean N(@Nullable class07282 class072822, boolean bl, int n) {
        boolean bl2;
        boolean bl3;
        try {
            this.P.No();
            this.P.NE().v();
            this.Na().N(null, n);
            W.info("Started serving on {}", (Object)n);
            this.T = n;
            this.j = new class08338(this.x(), "" + n);
            this.j.start();
            this.b = class072822;
            this.Nm().N(bl);
            class06984 class069842 = this.y(((class04453)this.P.T_4).method_72498());
            ((class04453)this.P.T_4).N((class08152)class069842);
            for (class04770 class047702 : this.Nm().v()) {
                this.yL().N(class047702);
            }
            bl2 = bl3 = true;
        }
        catch (IOException iOException) {
            boolean bl4 = false;
            CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", false, bl4);
            this.N(class072822, bl, n, callbackInfoReturnable);
            return false;
        }
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", false, bl3);
        this.N(class072822, bl, n, callbackInfoReturnable);
        return bl2;
    }

    public void N(@javax.annotation.Nullable class07282 class072822, boolean bl, int n, CallbackInfoReturnable callbackInfoReturnable) {
        if (!((Boolean)callbackInfoReturnable.getReturnValue()).booleanValue()) {
            return;
        }
        ((Consumer)PublishServerEvents.SERVER_PUBLISHED.invoker()).accept(n);
    }

    private int N(int n, Operation operation) {
        if (!ZoomUtils.canSeeDistantEntities()) {
            return (Integer)operation.call(new Object[]{n});
        }
        return (Integer)operation.call(new Object[]{n * (Zoom.isZooming() ? Math.max(1, class04995.L((double)Zoom.getZoomDivisor())) : 1)});
    }

    public boolean N() {
        W.info("Starting integrated minecraft server version {}", (Object)class07529.y().comp_4025());
        this.E(true);
        this.Nq();
        this.NP();
        GameProfile gameProfile = this.NJ();
        String string = this.yn().u();
        this.y((String)(gameProfile != null ? gameProfile.name() + " - " + string : string));
        return true;
    }

    public void N(class07080 class070802) {
        this.P.L(class070802);
    }

    public boolean N(boolean bl, boolean bl2, boolean bl3) {
        boolean bl4 = super.N(bl, bl2, bl3);
        this.X();
        return bl4;
    }

    public void N(class07282 class072822) {
        super.N(class072822);
        this.b = null;
    }

    public boolean N(class08774 class087742) {
        return this.NJ() != null && class087742.y().equalsIgnoreCase(this.NJ().name());
    }

    public void N(UUID uUID) {
        this.v = uUID;
    }

    public void N(BooleanSupplier booleanSupplier) {
        int n;
        boolean bl = this.s;
        this.s = class06202.Nq().P() || this.Nm().v().isEmpty();
        class04643 class046432 = class08700.N();
        if (!bl && this.s) {
            class046432.N("autoSave");
            W.info("Saving and pausing game...");
            this.N(false, false, false);
            class046432.L();
        }
        if (this.s) {
            this.e();
            return;
        }
        if (bl) {
            this.Nw();
        }
        super.N(booleanSupplier);
        int n2 = Math.max(2, (Integer)((class05630)this.P.i_7).i().method_41753());
        if (n2 != this.Nm().T()) {
            W.info("Changing view distance to {}, from {}", (Object)n2, (Object)this.Nm().T());
            this.Nm().N(n2);
        }
        if ((n = Math.max(2, (Integer)((class05630)this.P.i_7).R().method_41753())) != this.n) {
            W.info("Changing simulation distance to {}, from {}", (Object)n, (Object)this.n);
            this.Nm().y(n);
            this.n = n;
        }
    }

    public int N(int n) {
        return this.N(n, objectArray -> {
            WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)1, (String)"[int]");
            return this.y((Integer)objectArray[0]);
        });
    }

    public void N(boolean bl) {
        try (class06734 class067342 = class06724.N((class06728)this.G);){
            super.N(bl);
        }
        if (this.yW().Z()) {
            this.t = this.G.N();
        }
    }

    public void N(Throwable throwable, class02277 class022772, class07321 class073212) {
        super.N(throwable, class022772, class073212);
        this.X();
        this.P.execute(() -> class06132.N((class06202)this.P, (class07321)class073212));
    }

    public boolean ap_() {
        return this.s;
    }

    public class04032 aq_() {
        return class06202.Z().N(super.aq_());
    }

    public int ar_() {
        return this.T;
    }

    public boolean R() {
        return true;
    }

    public Collection<class06748> G() {
        return this.t;
    }
}

