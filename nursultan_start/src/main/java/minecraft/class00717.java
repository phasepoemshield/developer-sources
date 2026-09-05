/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  minecraft.class00392
 *  minecraft.class01032
 *  minecraft.class01194
 *  minecraft.class01226
 *  minecraft.class01231
 *  minecraft.class01235
 *  minecraft.class01487
 *  minecraft.class02131
 *  minecraft.class02154
 *  minecraft.class03244
 *  minecraft.class03289
 *  minecraft.class03556
 *  minecraft.class04293
 *  minecraft.class04383
 *  minecraft.class04782
 *  minecraft.class04803
 *  minecraft.class04911
 *  minecraft.class04995
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07065
 *  minecraft.class07072
 *  minecraft.class07078
 *  minecraft.class07079
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07305
 *  minecraft.class07307
 *  minecraft.class07451
 *  minecraft.class08036
 *  minecraft.class08299
 *  minecraft.class08329
 *  minecraft.class08372
 *  minecraft.class08636
 *  net.caffeinemc.mods.lithium.common.util.change_tracking.ChangePublisher
 *  net.caffeinemc.mods.lithium.common.util.change_tracking.ChangeSubscriber
 *  net.caffeinemc.mods.lithium.common.util.change_tracking.ChangeSubscriber$CountChangeSubscriber
 *  net.caffeinemc.mods.lithium.common.util.change_tracking.ChangeSubscriber$Multi
 *  net.caffeinemc.mods.lithium.mixin.util.accessors.ItemEntityAccessor
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.Objects;
import java.util.UUID;
import minecraft.class00392;
import minecraft.class01032;
import minecraft.class01194;
import minecraft.class01226;
import minecraft.class01231;
import minecraft.class01235;
import minecraft.class01487;
import minecraft.class02131;
import minecraft.class02154;
import minecraft.class03244;
import minecraft.class03289;
import minecraft.class03556;
import minecraft.class04293;
import minecraft.class04383;
import minecraft.class04782;
import minecraft.class04803;
import minecraft.class04911;
import minecraft.class04995;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07065;
import minecraft.class07072;
import minecraft.class07078;
import minecraft.class07079;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07305;
import minecraft.class07307;
import minecraft.class07451;
import minecraft.class08036;
import minecraft.class08299;
import minecraft.class08329;
import minecraft.class08372;
import minecraft.class08636;
import net.caffeinemc.mods.lithium.common.util.change_tracking.ChangePublisher;
import net.caffeinemc.mods.lithium.common.util.change_tracking.ChangeSubscriber;
import net.caffeinemc.mods.lithium.mixin.util.accessors.ItemEntityAccessor;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class00717
extends class07049
implements class03244,
ChangePublisher,
ChangeSubscriber.CountChangeSubscriber,
ItemEntityAccessor {
    private static final class02131<class06584> L = class03289.N(class00717.class, (class04383)class02154.B);
    private static final float u = 0.1f;
    public static final float N = 0.2125f;
    private static final int i = 6000;
    private static final int R = Short.MAX_VALUE;
    private static final int M = Short.MIN_VALUE;
    private static final int B = 5;
    private static final short Z = 0;
    private static final short z = 0;
    private int U = 0;
    private int E = 0;
    private int W = 5;
    private @Nullable class08372<class07049> m;
    private @Nullable UUID P;
    public final float y = this.field_5974.z() * (float)Math.PI * 2.0f;
    private ChangeSubscriber s;
    private int T;

    public void L() {
        this.E = 10;
    }

    public void M() {
        this.U = Short.MIN_VALUE;
    }

    private void P() {
        class06584 class065842 = this.N();
        if (!class065842.R()) {
            ((ChangePublisher)class065842).lithium$subscribe((ChangeSubscriber)this, 0);
        }
    }

    public boolean method_5659(class07307 class073072) {
        if (class073072.B()) {
            return super.method_5659(class073072);
        }
        return true;
    }

    public @Nullable class04803 method_32318(int n) {
        if (n == 0) {
            return class04803.N(this::N, this::N);
        }
        return super.method_32318(n);
    }

    public void method_5674(class02131<?> class021312) {
        super.method_5674(class021312);
        if (L.equals(class021312)) {
            this.N().N((class07049)this);
        }
    }

    public float method_73188() {
        return 180.0f - class00717.N((float)this.y() + 0.5f, this.y) / ((float)Math.PI * 2) * 360.0f;
    }

    protected void method_5693(class04293 class042932) {
        class042932.N(L, (Object)class06584.E);
    }

    public boolean method_5753() {
        return !this.N().N(this.method_48923().N()) || super.method_5753();
    }

    public void method_5773() {
        int n;
        if (this.N().R()) {
            this.method_31472();
            return;
        }
        super.method_5773();
        if (this.E > 0 && this.E != Short.MAX_VALUE) {
            --this.E;
        }
        this.field_6014 = this.method_23317();
        this.field_6036 = this.method_23318();
        this.field_5969 = this.method_23321();
        class06889 class068892 = this.method_18798();
        if (this.method_5799() && this.method_5861(class01231.N) > (double)0.1f) {
            this.U();
        } else if (this.method_5771() && this.method_5861(class01231.y) > (double)0.1f) {
            this.E();
        } else {
            this.method_56990();
        }
        if (this.method_73183().method_8608()) {
            this.field_5960 = false;
        } else {
            boolean bl = this.field_5960 = !this.method_73183().method_8587((class07049)this, this.method_5829().B(1.0E-7));
            if (this.field_5960) {
                this.method_5632(this.method_23317(), (this.method_5829().y + this.method_5829().i) / 2.0, this.method_23321());
            }
        }
        if (!this.method_24828() || this.method_18798().z() > (double)1.0E-5f || (this.field_6012 + this.method_5628()) % 4 == 0) {
            this.method_5784(class07451.field_6308, this.method_18798());
            this.method_61409();
            float f = 0.98f;
            if (this.method_24828()) {
                f = this.method_73183().method_8320(this.method_23314()).i().Z() * 0.98f;
            }
            this.method_18799(this.method_18798().u((double)f, 0.98, (double)f));
            if (this.method_24828()) {
                class06889 class068893 = this.method_18798();
                if (class068893.B < 0.0) {
                    this.method_18799(class068893.u(1.0, -0.5, 1.0));
                }
            }
        }
        boolean bl = class04995.N((double)this.field_6014) != class04995.N((double)this.method_23317()) || class04995.N((double)this.field_6036) != class04995.N((double)this.method_23318()) || class04995.N((double)this.field_5969) != class04995.N((double)this.method_23321());
        int n2 = n = bl ? 2 : 40;
        if (this.field_6012 % n == 0 && !this.method_73183().method_8608() && this.m()) {
            this.W();
        }
        if (this.U != Short.MIN_VALUE) {
            ++this.U;
        }
        this.field_64356 |= this.method_5876();
        if (!this.method_73183().method_8608() && this.method_18798().u(class068892).B() > 0.01) {
            this.field_64356 = true;
        }
        if (!this.method_73183().method_8608() && this.U >= 6000) {
            this.method_31472();
        }
    }

    public class04911 method_5634() {
        return class04911.field_15256;
    }

    public final boolean method_64397(class04782 class047822, class07072 class070722, float f) {
        if (this.method_64421(class070722)) {
            return false;
        }
        if (!((Boolean)class047822.method_64395().N(class07305.I)).booleanValue() && class070722.u() instanceof class07079) {
            return false;
        }
        if (!this.N().N(class070722)) {
            return false;
        }
        this.method_5785();
        this.W = (int)((float)this.W - f);
        this.method_32875((class03556)class01194.P, class070722.u());
        if (this.W <= 0) {
            this.N().N(this);
            this.method_31472();
        }
        return true;
    }

    protected boolean method_64270() {
        if (this.W <= 0) {
            return true;
        }
        return this.field_6012 % 10 == 0;
    }

    protected class07065 method_33570() {
        return class07065.field_28630;
    }

    public class07209 method_23314() {
        return this.method_43258(0.999999f);
    }

    protected double method_7490() {
        return 0.04;
    }

    public boolean method_33189() {
        return this.N().N(class01226.S);
    }

    public void method_5694(class08036 class080362) {
        if (this.method_73183().method_8608()) {
            return;
        }
        class06584 class065842 = this.N();
        class06581 class065812 = class065842.B();
        int n = class065842.c();
        if (this.E == 0 && (this.P == null || this.P.equals(class080362.method_5667())) && class080362.method_31548().M(class065842)) {
            class080362.method_6103((class07049)this, n);
            if (class065842.R()) {
                this.method_31472();
                class065842.i(n);
            }
            class080362.method_7342(class01235.i.y((Object)class065812), n);
            class080362.method_29499(this);
        }
    }

    protected void method_5652(class08329 class083292) {
        class083292.N("Health", (short)this.W);
        class083292.N("Age", (short)this.U);
        class083292.N("PickupDelay", (short)this.E);
        class08372.N(this.m, (class08329)class083292, (String)"Thrower");
        class083292.y("Owner", class01487.N, (Object)this.P);
        if (!this.N().R()) {
            class083292.N("Item", class06584.y, (Object)this.N());
        }
    }

    public final boolean method_5643(class07072 class070722) {
        if (this.method_64421(class070722)) {
            return false;
        }
        return this.N().N(class070722);
    }

    protected void method_5749(class08299 class082992) {
        this.W = class082992.N("Health", (short)5);
        this.U = class082992.N("Age", (short)0);
        this.E = class082992.N("PickupDelay", (short)0);
        this.P = class082992.N("Owner", class01487.N).orElse(null);
        this.m = class08372.N((class08299)class082992, (String)"Thrower");
        this.N(class082992.N("Item", class06584.y).orElse(class06584.E));
        if (this.N().R()) {
            this.method_31472();
        }
    }

    public @Nullable class07049 method_5731(class01032 class010322) {
        class07049 class070492 = super.method_5731(class010322);
        if (!this.method_73183().method_8608() && class070492 instanceof class00717) {
            ((class00717)class070492).W();
        }
        return class070492;
    }

    public class00392 method_5477() {
        class00392 class003922 = this.method_5797();
        if (class003922 != null) {
            return class003922;
        }
        return this.N().k();
    }

    public void method_5878(class07049 class070492) {
        super.method_5878(class070492);
        if (class070492 instanceof class00717) {
            class00717 class007172 = (class00717)class070492;
            this.m = class007172.m;
        }
    }

    public boolean method_5732() {
        return false;
    }

    public class00717(class07299 class072992, double d, double d2, double d3, class06584 class065842, double d4, double d5, double d6) {
        this((class07078<? extends class00717>)class07078.Nt, class072992);
        this.method_5814(d, d2, d3);
        this.method_18800(d4, d5, d6);
        this.N(class065842);
    }

    public class00717(class07299 class072992, double d, double d2, double d3, class06584 class065842) {
        this(class072992, d, d2, d3, class065842, class072992.field_9229.U() * 0.2 - 0.1, 0.2, class072992.field_9229.U() * 0.2 - 0.1);
    }

    public class00717(class07078<? extends class00717> class070782, class07299 class072992) {
        super(class070782, class072992);
        this.method_36456(this.field_5974.z() * 360.0f);
    }

    public void B() {
        this.U = -6000;
    }

    public void Z() {
        this.i();
        this.U = 5999;
    }

    public void i() {
        this.E = Short.MAX_VALUE;
    }

    private boolean m() {
        class06584 class065842 = this.N();
        return this.method_5805() && this.E != Short.MAX_VALUE && this.U != Short.MIN_VALUE && this.U < 6000 && class065842.c() < class065842.U();
    }

    private void U() {
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        this.N(callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        this.N(0.99f);
    }

    public @Nullable class07049 z() {
        return class08372.N(this.m, (class07299)this.method_73183());
    }

    public void u() {
        this.E = 0;
    }

    public int y() {
        return this.U;
    }

    public void lithium$forceUnsubscribe(class06584 class065842, int n) {
        if (this.s != null) {
            this.s.lithium$forceUnsubscribe((Object)this, this.T);
            this.s = null;
            this.T = 0;
        }
    }

    private void E() {
        this.N(0.95f);
    }

    private void N(class06584 class065842, CallbackInfo callbackInfo) {
        class06584 class065843;
        if (this.s != null && (class065843 = this.N()) != class065842) {
            if (!class065843.R()) {
                ((ChangePublisher)class065843).lithium$unsubscribe((ChangeSubscriber)this);
            }
            if (!class065842.R()) {
                ((ChangePublisher)class065842).lithium$subscribe((ChangeSubscriber)this, this.T);
                this.s.lithium$notify((Object)this, this.T);
            } else {
                this.s.lithium$forceUnsubscribe((Object)this, this.T);
                this.s = null;
                this.T = 0;
            }
        }
    }

    public void lithium$notify(class06584 class065842, int n) {
        if (class065842 != this.N()) {
            throw new IllegalStateException("Received notification from an unexpected publisher");
        }
        if (this.s != null) {
            this.s.lithium$notify((Object)this, this.T);
        }
    }

    private void N(CallbackInfo callbackInfo) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_12_2)) {
            callbackInfo.cancel();
        }
    }

    public static float N(float f, float f2) {
        return f / 20.0f + f2;
    }

    public void lithium$notifyCount(class06584 class065842, int n, int n2) {
        if (class065842 != this.N()) {
            throw new IllegalStateException("Received notification from an unexpected publisher");
        }
        ChangeSubscriber changeSubscriber = this.s;
        if (changeSubscriber instanceof ChangeSubscriber.CountChangeSubscriber) {
            ((ChangeSubscriber.CountChangeSubscriber)changeSubscriber).lithium$notifyCount((Object)this, this.T, n2);
        }
    }

    public class06584 N() {
        return (class06584)this.method_5841().N(L);
    }

    private void N(class00717 class007172) {
        class06584 class065842 = this.N();
        class06584 class065843 = class007172.N();
        if (!Objects.equals(this.P, class007172.P) || !class00717.N(class065842, class065843)) {
            return;
        }
        if (class065843.c() < class065842.c()) {
            class00717.N(this, class065842, class007172, class065843);
        } else {
            class00717.N(class007172, class065843, this, class065842);
        }
    }

    private static void N(class00717 class007172, class06584 class065842, class06584 class065843) {
        class06584 class065844 = class00717.N(class065842, class065843, 64);
        class007172.N(class065844);
    }

    private void N(double d) {
        class06889 class068892 = this.method_18798();
        this.method_18800(class068892.M * d, class068892.B + (double)(class068892.B < (double)0.06f ? 5.0E-4f : 0.0f), class068892.Z * d);
    }

    public static class06584 N(class06584 class065842, class06584 class065843, int n) {
        int n2 = Math.min(Math.min(class065842.U(), n) - class065842.c(), class065843.c());
        class06584 class065844 = class065842.L(class065842.c() + n2);
        class065843.B(n2);
        return class065844;
    }

    public static boolean N(class06584 class065842, class06584 class065843) {
        if (class065843.c() + class065842.c() > class065843.U()) {
            return false;
        }
        return class06584.L((class06584)class065842, (class06584)class065843);
    }

    public void N(int n) {
        this.E = n;
    }

    private static void N(class00717 class007172, class06584 class065842, class00717 class007173, class06584 class065843) {
        class00717.N(class007172, class065842, class065843);
        class007172.E = Math.max(class007172.E, class007173.E);
        class007172.U = Math.min(class007172.U, class007173.U);
        if (class065843.R()) {
            class007173.method_31472();
        }
    }

    public void N(class07049 class070492) {
        this.m = class08372.N((class08636)class070492);
    }

    public void N(@Nullable UUID uUID) {
        this.P = uUID;
    }

    public void N(class06584 class065842) {
        this.N(class065842, null);
        this.method_5841().N(L, (Object)class065842);
    }

    private void W() {
        if (!this.m()) {
            return;
        }
        for (class00717 class007173 : this.method_73183().N(class00717.class, this.method_5829().L(0.5, 0.0, 0.5), (T class007172) -> class007172 != this && class007172.m())) {
            if (!class007173.m()) continue;
            this.N(class007173);
            if (!this.method_31481()) continue;
            break;
        }
    }

    public boolean R() {
        return this.E > 0;
    }

    public int lithium$unsubscribe(ChangeSubscriber changeSubscriber) {
        class06584 class065842;
        int n = ChangeSubscriber.dataOf((ChangeSubscriber)this.s, (ChangeSubscriber)changeSubscriber, (int)this.T);
        this.T = ChangeSubscriber.dataWithout((ChangeSubscriber)this.s, (ChangeSubscriber)changeSubscriber, (int)this.T);
        this.s = ChangeSubscriber.without((ChangeSubscriber)this.s, (ChangeSubscriber)changeSubscriber);
        if (this.s == null && !(class065842 = this.N()).R()) {
            ((ChangePublisher)class065842).lithium$unsubscribe((ChangeSubscriber)this);
        }
        return n;
    }

    public void lithium$subscribe(ChangeSubscriber changeSubscriber, int n) {
        if (this.s == null) {
            this.P();
        }
        this.s = ChangeSubscriber.combine((ChangeSubscriber)this.s, (int)this.T, (ChangeSubscriber)changeSubscriber, (int)n);
        this.T = this.s instanceof ChangeSubscriber.Multi ? 0 : n;
    }

    public /* synthetic */ UUID lithium$getOwner() {
        return this.P;
    }
}

