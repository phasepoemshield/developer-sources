/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10748
 *  com.google.common.collect.Maps
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  minecraft.class00143
 *  minecraft.class00250
 *  minecraft.class00429
 *  minecraft.class00432
 *  minecraft.class00434
 *  minecraft.class00450
 *  minecraft.class00452
 *  minecraft.class00608
 *  minecraft.class00717
 *  minecraft.class00734
 *  minecraft.class00737
 *  minecraft.class00753
 *  minecraft.class01001
 *  minecraft.class01042
 *  minecraft.class01194
 *  minecraft.class01217
 *  minecraft.class01894
 *  minecraft.class01956
 *  minecraft.class02131
 *  minecraft.class02154
 *  minecraft.class02251
 *  minecraft.class02477
 *  minecraft.class02484
 *  minecraft.class02523
 *  minecraft.class02592
 *  minecraft.class02607
 *  minecraft.class02665
 *  minecraft.class02710
 *  minecraft.class02833
 *  minecraft.class02947
 *  minecraft.class03289
 *  minecraft.class03530
 *  minecraft.class03556
 *  minecraft.class04160
 *  minecraft.class04162
 *  minecraft.class04293
 *  minecraft.class04383
 *  minecraft.class04425
 *  minecraft.class04643
 *  minecraft.class04651
 *  minecraft.class04782
 *  minecraft.class04891
 *  minecraft.class04995
 *  minecraft.class05074
 *  minecraft.class05298
 *  minecraft.class05300
 *  minecraft.class05378
 *  minecraft.class05487
 *  minecraft.class05946
 *  minecraft.class06069
 *  minecraft.class06113
 *  minecraft.class06530
 *  minecraft.class06543
 *  minecraft.class06551
 *  minecraft.class06570
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class06695
 *  minecraft.class06889
 *  minecraft.class06925
 *  minecraft.class07209
 *  minecraft.class07284
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07305
 *  minecraft.class07310
 *  minecraft.class07323
 *  minecraft.class07430
 *  minecraft.class07438
 *  minecraft.class07440
 *  minecraft.class07442
 *  minecraft.class07446
 *  minecraft.class07458
 *  minecraft.class07463
 *  minecraft.class07467
 *  minecraft.class07468
 *  minecraft.class07469
 *  minecraft.class07471
 *  minecraft.class07472
 *  minecraft.class07473
 *  minecraft.class07474
 *  minecraft.class07542
 *  minecraft.class07623
 *  minecraft.class07626
 *  minecraft.class07655
 *  minecraft.class08036
 *  minecraft.class08197
 *  minecraft.class08234
 *  minecraft.class08299
 *  minecraft.class08329
 *  minecraft.class08342
 *  minecraft.class08698
 *  minecraft.class08700
 *  net.caffeinemc.mods.lithium.common.entity.NavigatingEntity
 *  net.caffeinemc.mods.lithium.common.world.ServerWorldExtended
 *  net.fabricmc.fabric.api.entity.event.v1.ServerLivingEntityEvents
 *  net.fabricmc.fabric.api.entity.event.v1.ServerLivingEntityEvents$MobConversion
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import Nursultan.class10748;
import com.google.common.collect.Maps;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import minecraft.class00143;
import minecraft.class00250;
import minecraft.class00429;
import minecraft.class00432;
import minecraft.class00434;
import minecraft.class00450;
import minecraft.class00452;
import minecraft.class00608;
import minecraft.class00717;
import minecraft.class00734;
import minecraft.class00737;
import minecraft.class00753;
import minecraft.class01001;
import minecraft.class01042;
import minecraft.class01194;
import minecraft.class01217;
import minecraft.class01894;
import minecraft.class01956;
import minecraft.class02131;
import minecraft.class02154;
import minecraft.class02251;
import minecraft.class02477;
import minecraft.class02484;
import minecraft.class02523;
import minecraft.class02592;
import minecraft.class02607;
import minecraft.class02665;
import minecraft.class02710;
import minecraft.class02833;
import minecraft.class02947;
import minecraft.class03289;
import minecraft.class03530;
import minecraft.class03556;
import minecraft.class04160;
import minecraft.class04162;
import minecraft.class04293;
import minecraft.class04383;
import minecraft.class04425;
import minecraft.class04643;
import minecraft.class04651;
import minecraft.class04782;
import minecraft.class04891;
import minecraft.class04995;
import minecraft.class05074;
import minecraft.class05298;
import minecraft.class05300;
import minecraft.class05378;
import minecraft.class05487;
import minecraft.class05946;
import minecraft.class06069;
import minecraft.class06113;
import minecraft.class06530;
import minecraft.class06543;
import minecraft.class06551;
import minecraft.class06570;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06695;
import minecraft.class06889;
import minecraft.class06925;
import minecraft.class06990;
import minecraft.class07043;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class07052;
import minecraft.class07070;
import minecraft.class07072;
import minecraft.class07078;
import minecraft.class07082;
import minecraft.class07085;
import minecraft.class07086;
import minecraft.class07209;
import minecraft.class07284;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07305;
import minecraft.class07310;
import minecraft.class07323;
import minecraft.class07430;
import minecraft.class07438;
import minecraft.class07440;
import minecraft.class07442;
import minecraft.class07446;
import minecraft.class07458;
import minecraft.class07463;
import minecraft.class07467;
import minecraft.class07468;
import minecraft.class07469;
import minecraft.class07471;
import minecraft.class07472;
import minecraft.class07473;
import minecraft.class07474;
import minecraft.class07542;
import minecraft.class07623;
import minecraft.class07626;
import minecraft.class07655;
import minecraft.class08036;
import minecraft.class08197;
import minecraft.class08234;
import minecraft.class08299;
import minecraft.class08329;
import minecraft.class08342;
import minecraft.class08698;
import minecraft.class08700;
import net.caffeinemc.mods.lithium.common.entity.NavigatingEntity;
import net.caffeinemc.mods.lithium.common.world.ServerWorldExtended;
import net.fabricmc.fabric.api.entity.event.v1.ServerLivingEntityEvents;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public abstract class class07079
extends class07438
implements class01956,
class02607,
class02665,
NavigatingEntity {
    private static final class02131<Byte> N = class03289.N(class07079.class, (class04383)class02154.N);
    private static final int y = 1;
    private static final int L = 2;
    private static final int u = 4;
    protected static final int j = 1;
    private static final class00753 i = new class00753(1, 0, 1);
    private static final List<class07085> R = List.of(class07085.field_6169, class07085.field_6174, class07085.field_6172, class07085.field_6166);
    public static final float v = 0.15f;
    public static final float n = 0.1087f;
    public static final float t = 3.0f;
    public static final float G = 0.55f;
    public static final float l = 0.5f;
    public static final float d = 0.25f;
    public static final int w = 2;
    private static final double B = Math.sqrt(2.04f) - (double)0.6f;
    private static final boolean Z = false;
    private static final boolean W = false;
    private static final boolean T = false;
    private static final boolean b = false;
    protected static final class01894 k = class01894.y((String)"random_spawn_bonus");
    public static final String Y = "drop_chances";
    public static final String Q = "LeftHanded";
    public static final String O = "CanPickUpLoot";
    public static final String g = "NoAI";
    public int I;
    protected int J;
    protected class07442 o;
    protected class07458 q;
    protected class07440 K;
    private final class07472 c;
    protected class07623 V;
    protected final class07467 e;
    protected final class07467 H;
    private @Nullable class07438 X;
    private final class07626 a;
    private class08342 p = class08342.u;
    private boolean F = false;
    private boolean A = false;
    private final Map<class04425, Float> f = Maps.newEnumMap(class04425.class);
    private Optional<class05946<class05074>> C = Optional.empty();
    private long S;
    private @Nullable class02592 x;
    private class07209 D = class07209.field_10980;
    private int h = -1;
    private class07623 r;

    private class04162 L(class04782 class047822) {
        return new class04160(class047822).N(class06551.B, (Object)this.method_73189()).N(class06551.N, (Object)this).N(class06925.Z);
    }

    public boolean L(class07438 class074382) {
        double d;
        double d2;
        class06543 class065432 = (class06543)this.method_76694().method_58694(class02484.I);
        if (class065432 == null) {
            d2 = B;
            d = 0.0;
        } else {
            d2 = class065432.y((class07049)((Object)this));
            d = class065432.N((class07049)((Object)this));
        }
        class00734 class007342 = class074382.method_53510();
        return this.y(d2).L(class007342) && (d <= 0.0 || !this.y(d).L(class007342));
    }

    public boolean L(class06584 class065842) {
        return true;
    }

    public void L(boolean bl) {
        this.F = bl;
    }

    public boolean L(class07209 class072092) {
        if (this.h == -1) {
            return true;
        }
        return this.D.method_10262((class00753)class072092) < (double)(this.h * this.h);
    }

    public boolean L(class08036 class080362) {
        return !this.method_5782();
    }

    private boolean L(class06584 class065842, class06584 class065843, class07085 class070852) {
        double d;
        double d2;
        class03530<class06581> var4 = this.NL();
        if (var4 != null) {
            if (class065843.N(var4) && !class065842.N(var4)) {
                return false;
            }
            if (!class065843.N(var4) && class065842.N(var4)) {
                return true;
            }
        }
        if ((d2 = this.N(class065842, (class03556<class07468>)class05298.u, class070852)) != (d = this.N(class065843, (class03556<class07468>)class05298.u, class070852))) {
            return d2 > d;
        }
        return this.N_68(class065842, class065843);
    }

    public void L(float f) {
        this.fields_7212a028292fd3c078969e3ee4c71d9e8_0 = Float.valueOf(f);
    }

    private boolean L(class07085 class070852) {
        return this.method_6084(class070852) && this.method_63623(this.method_6118(class070852), class070852);
    }

    public void Nd() {
        this.N((class07473 class074732) -> true);
        this.method_18868().M();
    }

    public boolean Nl() {
        return ((Byte)this.field_6011.N(N) & 4) != 0;
    }

    public boolean NP() {
        return this.L(this.method_24515());
    }

    public void X() {
    }

    public @Nullable class07438 T() {
        return this.X;
    }

    public int method_5850() {
        if (this.T() == null) {
            return this.method_56993(0.0f);
        }
        int n = (int)(this.method_6032() - this.method_6063() * 0.33f);
        if ((n -= (3 - this.method_73183().y().N()) * 4) < 0) {
            n = 0;
        }
        return this.method_56993(n);
    }

    public boolean method_6034() {
        return super.method_6034() && !this.Nt();
    }

    public @Nullable class06584 method_31480() {
        class06530 class065302 = class06530.N((class07078)this.method_5864());
        if (class065302 == null) {
            return null;
        }
        return new class06584((class07310)class065302);
    }

    public final Optional<class05946<class05074>> method_5991() {
        if (this.C.isPresent()) {
            return this.C;
        }
        return super.method_5991();
    }

    public void method_5982() {
        if (this.method_73183().y() == class07086.field_5801 && !this.method_5864().b()) {
            this.method_31472();
            return;
        }
        if (this.Nm() || this.Nu()) {
            this.fields_6212a028292fd3c078969e3ee4c71d9e8_2 = 0;
            return;
        }
        class08036 class080362 = this.method_73183().N((class07049)((Object)this), -1.0);
        if (class080362 != null) {
            int n;
            int n2;
            double d = class080362.method_5858((class07049)((Object)this));
            if (d > (double)(n2 = (n = this.method_5864().i().i()) * n) && this.N(d)) {
                this.method_31472();
            }
            int n3 = this.method_5864().i().R();
            int n4 = n3 * n3;
            if (this.fields_6212a028292fd3c078969e3ee4c71d9e8_2 > 600 && this.field_5974.y(800) == 0 && d > (double)n4 && this.N(d)) {
                this.method_31472();
            } else if (d < (double)n4) {
                this.fields_6212a028292fd3c078969e3ee4c71d9e8_2 = 0;
            }
        }
    }

    public void method_5693(class04293 class042932) {
        super.method_5693(class042932);
        class042932.N(N, (Object)0);
    }

    public void method_5670() {
        super.method_5670();
        class04643 class046432 = class08700.N();
        class046432.N("mobBaseTick");
        if (this.method_5805() && this.field_5974.y(1000) < this.I++) {
            this.W();
            this.D();
        }
        class046432.L();
    }

    public void method_5773() {
        super.method_5773();
        if (!this.method_73183().method_8608() && this.field_6012 % 5 == 0) {
            this.r();
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public @Nullable class07438 method_5642() {
        class07049 class070492 = this.method_31483();
        if (this.Nt()) return null;
        if (!(class070492 instanceof class07079)) return null;
        class07079 class070792 = (class07079)((Object)class070492);
        if (!class070492.method_52534()) return null;
        class07079 class070793 = class070792;
        return class070793;
    }

    public void method_5652(class08329 class083292) {
        super.method_5652(class083292);
        class083292.N(O, this.method_5936());
        class083292.N("PersistenceRequired", this.A);
        if (!this.p.equals((Object)class08342.u)) {
            class083292.N(Y, class08342.i, (Object)this.p);
        }
        this.N(class083292, this.x);
        if (this.Nj()) {
            class083292.N("home_radius", this.h);
            class083292.N("home_pos", class07209.field_25064, (Object)this.D);
        }
        class083292.N(Q, this.NG());
        this.C.ifPresent(class059462 -> class083292.N("DeathLootTable", class05074.N, class059462));
        if (this.S != 0L) {
            class083292.N("DeathLootTableSeed", this.S);
        }
        if (this.Nt()) {
            class083292.N(g, this.Nt());
        }
    }

    public class07082 method_5688(class08036 class080362, class07050 class070502) {
        if (!this.method_5805()) {
            return class07082.i;
        }
        class07079 class070792 = this;
        class08036 class080363 = class080362;
        class07050 class070503 = class070502;
        class07082 class070822 = this.N(class070792, class080363, class070503);
        if (class070822.N()) {
            this.method_32875((class03556)class01194.b, (class07049)class080362);
            return class070822;
        }
        class07082 class070823 = super.method_5688(class080362, class070502);
        if (class070823 != class07082.i) {
            return class070823;
        }
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N(class080362, class070502, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return (class07082)callbackInfoReturnable.getReturnValue();
        }
        class070822 = this.N(class080362, class070502);
        if (class070822.N()) {
            this.method_32875((class03556)class01194.b, (class07049)class080362);
            return class070822;
        }
        return class07082.i;
    }

    public void method_5749(class08299 class082992) {
        super.method_5749(class082992);
        this.L(class082992.N(O, false));
        this.A = class082992.N("PersistenceRequired", false);
        this.p = class082992.N(Y, class08342.i).orElse(class08342.u);
        this.N(class082992);
        this.h = class082992.N("home_radius", -1);
        if (this.h >= 0) {
            this.D = class082992.N("home_pos", class07209.field_25064).orElse(class07209.field_10980);
        }
        this.i(class082992.N(Q, false));
        this.C = class082992.N("DeathLootTable", class05074.N);
        this.S = class082992.N("DeathLootTableSeed", 0L);
        this.u(class082992.N(g, false));
    }

    public class07070 method_6068() {
        return this.NG() ? class07070.field_6182 : class07070.field_6183;
    }

    public boolean method_5873(class07049 class070492, boolean bl, boolean bl2) {
        boolean bl3 = super.method_5873(class070492, bl, bl2);
        if (bl3 && this.g_()) {
            this.yU();
        }
        this.N(class070492, bl, bl2, null);
        return bl3;
    }

    public void method_5711(byte by) {
        if (by == 20) {
            this.h();
        } else {
            super.method_5711(by);
        }
    }

    protected void method_30076() {
        super.method_30076();
        for (class07085 class070852 : class07085.field_54086) {
            class06584 class065842 = this.method_6118(class070852);
            if (class065842.R()) continue;
            class065842.i(0);
        }
    }

    public class07079(class07078<? extends class07079> class070782, class07299 class072992) {
        super(class070782, class072992);
        this.e = new class07467();
        this.H = new class07467();
        this.o = new class07442(this);
        this.q = new class07458(this);
        this.K = new class07440(this);
        this.c = this.Z_();
        this.V = this.N(class072992);
        this.a = new class07626(this);
        if (class072992 instanceof class04782) {
            this.l_();
        }
    }

    public class07626 C() {
        return this.a;
    }

    public void D() {
        this.method_56078(this.s());
    }

    public class07458 F() {
        class07049 class070492 = this.method_49694();
        if (class070492 instanceof class07079) {
            return ((class07079)((Object)class070492)).F();
        }
        return this.q;
    }

    protected class07085 J() {
        return class07085.field_6169;
    }

    protected final @Nullable class07438 S() {
        return this.method_18868().L(class05378.s).orElse(null);
    }

    public void i(boolean bl) {
        byte by = (Byte)this.field_6011.N(N);
        this.field_6011.N(N, (Object)(bl ? (byte)(by | 2) : (byte)(by & 0xFFFFFFFD)));
    }

    public void x() {
        this.method_32876((class03556)class01194.W);
    }

    protected @Nullable class04891 s() {
        return null;
    }

    protected boolean c() {
        return false;
    }

    public void h() {
        if (this.method_73183().method_8608()) {
            this.method_36549();
        } else {
            this.method_73183().method_8421((class07049)((Object)this), (byte)20);
        }
    }

    public class07623 f() {
        class07049 class070492 = this.method_49694();
        if (class070492 instanceof class07079) {
            return ((class07079)((Object)class070492)).f();
        }
        return this.V;
    }

    private void l() {
        if (this.x != null) {
            this.x.i = 0.0;
        }
    }

    public void a() {
    }

    public class07442 p() {
        return this.o;
    }

    public boolean g() {
        return !(this instanceof class07542);
    }

    private void v() {
        if (!this.method_5805() || !this.G()) {
            return;
        }
        class07085 class070852 = this.J();
        class06584 class065842 = this.method_6118(class070852);
        if (!class065842.R()) {
            if (class065842.W()) {
                class06581 class065812 = class065842.B();
                class065842.y(class065842.P() + this.field_5974.y(2));
                if (class065842.P() >= class065842.s()) {
                    this.method_20235(class065812, class070852);
                    this.method_5673(class070852, class06584.E);
                }
            }
            return;
        }
        this.method_5639(8.0f);
    }

    public void u(boolean bl) {
        byte by = (Byte)this.field_6011.N(N);
        this.field_6011.N(N, (Object)(bl ? (byte)(by | 1) : (byte)(by & 0xFFFFFFFE)));
    }

    public void u(class06584 class065842) {
        this.N(class07085.field_48824, class065842);
    }

    protected void r() {
        boolean bl = !(this.method_5642() instanceof class07079);
        boolean bl2 = !(this.method_5854() instanceof class00250);
        this.e.N(class07430.field_18405, bl);
        this.e.N(class07430.field_18407, bl && bl2);
        this.e.N(class07430.field_18406, bl);
    }

    public boolean y(class06584 class065842) {
        return false;
    }

    private class07082 y(class08036 class080362, class07050 class070502) {
        class07082 class070822;
        class06584 class065842 = class080362.method_5998(class070502);
        if (class065842.N(class06570.lN) && (class070822 = class065842.N(class080362, (class07438)this, class070502)).N()) {
            return class070822;
        }
        class06581 class065812 = class065842.B();
        if (class065812 instanceof class06530) {
            class070822 = (class06530)class065812;
            if (this.method_73183() instanceof class04782) {
                Optional var5 = class070822.N(class080362, this, this.method_5864(), (class04782)this.method_73183(), this.method_73189(), class065842);
                var5.ifPresent(class070792 -> this.N(class080362, (class07079)((Object)class070792)));
                if (var5.isEmpty()) {
                    return class07082.i;
                }
            }
            return class07082.y;
        }
        return class07082.i;
    }

    public static boolean y(class07078<? extends class07079> class070782, class07284 class072842, class06113 class061132, class07209 class072092, class06069 class060692) {
        class07209 class072093 = class072092.method_10074();
        return class06113.N((class06113)class061132) || class072842.method_8320(class072093).N((class07290)class072842, class072093, class070782);
    }

    public boolean y(class04782 class047822, class06584 class065842) {
        return this.L(class065842);
    }

    public void y_3(class04782 class047822) {
        this.N(class047822, (class06584 class065842) -> true);
    }

    public void y(@Nullable class07438 class074382) {
        this.X = class074382;
    }

    public void y(float f) {
        this.fields_7212a028292fd3c078969e3ee4c71d9e8_1 = Float.valueOf(f);
    }

    protected void y(class01001 class010012, class06069 class060692, class07052 class070522) {
        this.N(class010012, class07085.field_6173, class060692, 0.25f, class070522);
    }

    public void y(boolean bl) {
    }

    public class06695 y_6(class07085 class070852) {
        return new class10748(this, class070852);
    }

    protected class00734 y(double d) {
        class00734 class007342;
        class07049 class070492 = this.method_5854();
        if (class070492 != null) {
            class00734 class007343 = class070492.method_5829();
            class00734 class007344 = this.method_5829();
            class007342 = new class00734(Math.min(class007344.N, class007343.N), class007344.y, Math.min(class007344.L, class007343.L), Math.max(class007344.u, class007343.u), class007344.i, Math.max(class007344.R, class007343.R));
        } else {
            class007342 = this.method_5829();
        }
        return class007342.L(d, 0.0, d);
    }

    private boolean y(class06584 class065842, class06584 class065843, class07085 class070852) {
        if (class07323.N((class06584)class065843, (class02477)class02523.I)) {
            return false;
        }
        double d = this.N(class065842, (class03556<class07468>)class05298.y, class070852);
        double d2 = this.N(class065843, (class03556<class07468>)class05298.y, class070852);
        double d3 = this.N(class065842, (class03556<class07468>)class05298.L, class070852);
        double d4 = this.N(class065843, (class03556<class07468>)class05298.L, class070852);
        if (d != d2) {
            return d > d2;
        }
        if (d3 != d4) {
            return d3 > d4;
        }
        return this.N_68(class065842, class065843);
    }

    public class07440 A() {
        return this.K;
    }

    public static @Nullable class06581 N(class07085 class070852, int n) {
        switch (class07474.N[class070852.ordinal()]) {
            case 1: {
                if (n == 0) {
                    return class06570.bi;
                }
                if (n == 1) {
                    return class06570.bZ;
                }
                if (n == 2) {
                    return class06570.bd;
                }
                if (n == 3) {
                    return class06570.bW;
                }
                if (n == 4) {
                    return class06570.bT;
                }
                if (n == 5) {
                    return class06570.bn;
                }
            }
            case 2: {
                if (n == 0) {
                    return class06570.bR;
                }
                if (n == 1) {
                    return class06570.bz;
                }
                if (n == 2) {
                    return class06570.bw;
                }
                if (n == 3) {
                    return class06570.bm;
                }
                if (n == 4) {
                    return class06570.bb;
                }
                if (n == 5) {
                    return class06570.bt;
                }
            }
            case 3: {
                if (n == 0) {
                    return class06570.bM;
                }
                if (n == 1) {
                    return class06570.bU;
                }
                if (n == 2) {
                    return class06570.bk;
                }
                if (n == 3) {
                    return class06570.bP;
                }
                if (n == 4) {
                    return class06570.bj;
                }
                if (n == 5) {
                    return class06570.bG;
                }
            }
            case 4: {
                if (n == 0) {
                    return class06570.bB;
                }
                if (n == 1) {
                    return class06570.bE;
                }
                if (n == 2) {
                    return class06570.bY;
                }
                if (n == 3) {
                    return class06570.bs;
                }
                if (n == 4) {
                    return class06570.bv;
                }
                if (n != 5) break;
                return class06570.bl;
            }
        }
        return null;
    }

    protected void N(class01001 class010012, class06069 class060692, class07052 class070522) {
        this.y(class010012, class060692, class070522);
        for (class07085 class070852 : class07085.field_54086) {
            if (class070852.N() != class07043.field_6178) continue;
            this.N(class010012, class060692, class070852, class070522);
        }
    }

    protected class07082 N(class08036 class080362, class07050 class070502) {
        return class07082.i;
    }

    protected void N(class08036 class080362, class07079 class070792) {
    }

    private void N(class08036 class080362, class07050 class070502, CallbackInfoReturnable callbackInfoReturnable) {
        class07082 class070822;
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_20_5) && (class070822 = this.y(class080362, class070502)).N()) {
            callbackInfoReturnable.setReturnValue((Object)class070822);
        }
    }

    public void N(class07085 class070852, float f) {
        this.p = this.p.N(class070852, f);
    }

    protected void N(class01001 class010012, class06069 class060692, class07085 class070852, class07052 class070522) {
        this.N(class010012, class070852, class060692, 0.5f, class070522);
    }

    private void N(class01001 class010012, class07085 class070852, class06069 class060692, float f, class07052 class070522) {
        class06584 class065842 = this.method_6118(class070852);
        if (!class065842.R() && class060692.z() < f * class070522.u()) {
            class07323.N((class06584)class065842, (class01042)class010012.method_30349(), (class05946)class02251.N, (class07052)class070522, (class06069)class060692);
            this.method_5673(class070852, class065842);
        }
    }

    protected class07623 N(class07299 class072992) {
        return new class07655(this, class072992);
    }

    public void N(Predicate<class07473> predicate) {
        this.e.N(predicate);
    }

    public float N(class04425 class044252) {
        Object object;
        class07049 class070492 = this.method_49694();
        Object object2 = class070492 instanceof class07079 && ((class07079)((Object)(object = (class07079)((Object)class070492)))).c() ? object : this;
        object = object2.f.get(class044252);
        return object == null ? class044252.N() : ((Float)object).floatValue();
    }

    private void N(class07049 class070492, boolean bl, boolean bl2, CallbackInfoReturnable callbackInfoReturnable) {
        this.lithium$updateNavigationRegistration();
    }

    private class07049 N(class07049 class070492, class08234 class082342) {
        ((ServerLivingEntityEvents.MobConversion)ServerLivingEntityEvents.MOB_CONVERSION.invoker()).onConversion(this, (class07079)((Object)class070492), class082342);
        return class070492;
    }

    public <T extends class07079> @Nullable T N(class07078<T> class070782, class08234 class082342, class06113 class061132, class08698<T> class086982) {
        if (this.method_31481()) {
            return null;
        }
        class07079 class070792 = (class07079)((Object)class070782.N(this.method_73183(), class061132));
        if (class070792 == null) {
            return null;
        }
        class082342.N().N(this, class070792, class082342);
        class086982.finalizeConversion(class070792);
        class07299 class072992 = this.method_73183();
        if (class072992 instanceof class04782) {
            class07079 class070793 = class070792;
            ((class04782)class072992).method_8649(this.N((class07049)((Object)class070793), class082342));
        }
        if (class082342.N().N()) {
            this.method_31472();
        }
        return (T)((Object)class070792);
    }

    public void N(class07209 class072092, int n) {
        this.D = class072092;
        this.h = n;
    }

    public boolean N(class06889 class068892) {
        if (this.h == -1) {
            return true;
        }
        return this.D.method_19770((class00737)class068892) < (double)(this.h * this.h);
    }

    protected void N(class08036 class080362, class07050 class070502, class06584 class065842) {
        int n = class065842.c();
        class08197 class081972 = (class08197)class065842.method_58694(class02484.k);
        class065842.N(1, (class07438)class080362);
        if (class081972 != null) {
            class06584 class065843 = class081972.N(class065842, n, class080362.method_56992(), arg_0 -> ((class08036)class080362).method_64399(arg_0));
            class080362.method_6122(class070502, class065843);
        }
    }

    public void N(class04425 class044252, float f) {
        this.f.put(class044252, Float.valueOf(f));
    }

    private class07082 N(class07079 class070792, class08036 class080362, class07050 class070502) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_20_5)) {
            return class07082.u;
        }
        return this.y(class080362, class070502);
    }

    public void N(@Nullable class02592 class025922) {
        this.x = class025922;
    }

    public <T extends class07079> @Nullable T N(class07078<T> class070782, class08234 class082342, class08698<T> class086982) {
        return this.N(class070782, class082342, class06113.field_16468, class086982);
    }

    public void N(class07085 class070852, class06584 class065842) {
        this.method_5673(class070852, class065842);
        this.N(class070852);
        this.A = true;
    }

    public void N(class07049 class070492, float f, float f2) {
        double d;
        double d2 = class070492.method_23317() - this.method_23317();
        double d3 = class070492.method_23321() - this.method_23321();
        if (class070492 instanceof class07438) {
            class07438 class074382 = (class07438)class070492;
            d = class074382.method_23320() - this.method_23320();
        } else {
            d = (class070492.method_5829().y + class070492.method_5829().i) / 2.0 - this.method_23320();
        }
        double d4 = Math.sqrt(d2 * d2 + d3 * d3);
        float f3 = (float)(class04995.u((double)d3, (double)d2) * 57.2957763671875) - 90.0f;
        float f4 = (float)(-(class04995.u((double)d, (double)d4) * 57.2957763671875));
        this.method_36457(this.N(this.method_36455(), f4, f2));
        this.method_36456(this.N(this.method_36454(), f3, f));
    }

    private float N(float f, float f2, float f3) {
        float f4 = class04995.R((float)(f2 - f));
        if (f4 > f3) {
            f4 = f3;
        }
        if (f4 < -f3) {
            f4 = -f3;
        }
        return f + f4;
    }

    public boolean N(class07284 class072842, class06113 class061132) {
        return true;
    }

    public boolean N(class05487 class054872) {
        return !class054872.u(this.method_5829()) && class054872.method_8606((class07049)((Object)this));
    }

    public class06584 N_16(class04782 class047822, class06584 class065842) {
        class07085 class070852 = this.method_32326(class065842);
        if (!this.method_63623(class065842, class070852)) {
            return class06584.E;
        }
        class06584 class065843 = this.method_6118(class070852);
        boolean bl = this.N(class065842, class065843, class070852);
        if (class070852.i() && !bl) {
            class070852 = class07085.field_6173;
            class065843 = this.method_6118(class070852);
            bl = class065843.R();
        }
        if (bl && this.L(class065842)) {
            double d = this.p.y(class070852);
            if (!class065843.R() && (double)Math.max(this.field_5974.z() - 0.1f, 0.0f) < d) {
                this.method_5775(class047822, class065843);
            }
            class06584 class065844 = class070852.N(class065842);
            this.N(class070852, class065844);
            return class065844;
        }
        return class06584.E;
    }

    public boolean N(double d) {
        return true;
    }

    protected void N(class04782 class047822) {
    }

    public boolean N_68(class06584 class065842, class06584 class065843) {
        int n;
        Set var3 = ((class02710)class065843.a_(class02484.P, (Object)class02710.N)).y();
        Set var4 = ((class02710)class065842.a_(class02484.P, (Object)class02710.N)).y();
        if (var4.size() != var3.size()) {
            return var4.size() > var3.size();
        }
        int n2 = class065842.P();
        if (n2 != (n = class065843.P())) {
            return n2 < n;
        }
        return class065842.L(class02484.B) && !class065843.L(class02484.B);
    }

    private double N(class06584 class065842, class03556<class07468> class035562, class07085 class070852) {
        double d = this.method_6127().y(class035562) ? this.method_45326(class035562) : 0.0;
        return ((class02833)class065842.a_(class02484.b, (Object)class02833.N)).N(class035562, d, class070852);
    }

    protected boolean N(class06584 class065842, class06584 class065843, class07085 class070852) {
        if (class065843.R()) {
            return true;
        }
        if (class070852.i()) {
            return this.y(class065842, class065843, class070852);
        }
        if (class070852 == class07085.field_6173) {
            return this.L(class065842, class065843, class070852);
        }
        return false;
    }

    public void N(class07085 class070852) {
        this.p = this.p.N(class070852);
    }

    protected void N(class04782 class047822, class00717 class007172) {
        class06584 class065842 = class007172.N();
        class06584 class065843 = this.N_16(class047822, class065842.t());
        if (!class065843.R()) {
            this.method_29499(class007172);
            this.method_6103((class07049)class007172, class065843.c());
            class065842.B(class065843.c());
            if (class065842.R()) {
                class007172.method_31472();
            }
        }
    }

    public void N(class05946<class05074> class059462, Map<class07085, Float> map) {
        class07299 class072992 = this.method_73183();
        if (class072992 instanceof class04782) {
            class04782 class047822 = (class04782)class072992;
            this.N(class059462, this.L(class047822), map);
        }
    }

    public @Nullable class07446 N(class01001 class010012, class07052 class070522, class06113 class061132, @Nullable class07446 class074462) {
        class06069 class060692 = class010012.method_8409();
        class07469 class074692 = Objects.requireNonNull(this.method_5996(class05298.P));
        if (!class074692.y(k)) {
            class074692.u(new class07471(k, class060692.N(0.0, 0.11485000000000001), class07463.field_6330));
        }
        this.i(class060692.z() < 0.05f);
        return class074462;
    }

    public void N(class02947 class029472) {
        this.N((class05946<class05074>)class029472.N(), class029472.y());
    }

    public Set<class07085> N(class04782 class047822, Predicate<class06584> predicate) {
        HashSet<class07085> hashSet = new HashSet<class07085>();
        for (class07085 class070852 : class07085.field_54086) {
            class06584 class065842 = this.method_6118(class070852);
            if (class065842.R()) continue;
            if (!predicate.test(class065842)) {
                hashSet.add(class070852);
                continue;
            }
            if (!this.p.L(class070852)) continue;
            this.method_5673(class070852, class06584.E);
            this.method_5775(class047822, class065842);
        }
        return hashSet;
    }

    protected void N(class06069 class060692, class07052 class070522) {
        if (class060692.z() < 0.15f * class070522.u()) {
            int n = class060692.y(3);
            int n2 = 1;
            while ((float)n2 <= 3.0f) {
                if (class060692.z() < 0.1087f) {
                    ++n;
                }
                ++n2;
            }
            float f = this.method_73183().y() == class07086.field_5807 ? 0.1f : 0.25f;
            boolean bl = true;
            for (class07085 class070852 : R) {
                class06581 class065812;
                class06584 class065842 = this.method_6118(class070852);
                if (!bl && class060692.z() < f) break;
                bl = false;
                if (!class065842.R() || (class065812 = class07079.N(class070852, n)) == null) continue;
                this.method_5673(class070852, new class06584((class07310)class065812));
            }
        }
    }

    public void N(float f) {
        this.fields_7212a028292fd3c078969e3ee4c71d9e8_2 = Float.valueOf(f);
    }

    private void W() {
        this.I = -this.m_();
    }

    public void R(boolean bl) {
        byte by = (Byte)this.field_6011.N(N);
        this.field_6011.N(N, (Object)(bl ? (byte)(by | 4) : (byte)(by & 0xFFFFFFFB)));
    }

    public boolean R(int n) {
        return false;
    }

    public int NT() {
        return this.h;
    }

    public int Ni() {
        return 40;
    }

    public boolean Nu() {
        return this.method_5765();
    }

    public static class05300 H() {
        return class07438.method_26827().N(class05298.P, 16.0);
    }

    public boolean Nz() {
        return this.L(class07085.field_55946);
    }

    private boolean G() {
        if (!this.method_73183().method_8608() && ((Boolean)this.method_73183().method_75728().N(class00608.a, this.method_73189())).booleanValue()) {
            boolean bl;
            float f = this.method_5718();
            class07209 class072092 = class07209.method_49637((double)this.method_23317(), (double)this.method_23320(), (double)this.method_23321());
            boolean bl2 = bl = this.method_5721() || this.field_27857 || this.field_28628;
            if (f > 0.5f && this.field_5974.z() * 30.0f < (f - 0.4f) * 2.0f && !bl && this.method_73183().N_17(class072092)) {
                return true;
            }
        }
        return false;
    }

    public boolean Nm() {
        return this.A;
    }

    public class06584 NZ() {
        return this.method_6118(class07085.field_48824);
    }

    public int NR() {
        return 75;
    }

    public int NB() {
        return 10;
    }

    public void method_74589(class04782 class047822, class06990 class069902) {
        class069902.N(class00429.R, () -> {
            class00143 class001432 = this.f().Z();
            if (class001432 != null && class001432.U() != null) {
                return new class00450(class001432.m(), this.f().T());
            }
            return null;
        });
        class069902.N(class00429.i, () -> {
            Set var1 = this.e.y();
            ArrayList arrayList = new ArrayList(var1.size());
            var1.forEach(class057642 -> arrayList.add(new class00452(class057642.Z(), class057642.M(), class057642.U().getClass().getSimpleName())));
            return new class00432(arrayList);
        });
        if (!this.fields_12212a028292fd3c078969e3ee4c71d9e8_1.Z()) {
            class069902.N(class00429.L, () -> class00434.N((class04782)class047822, (class07438)this));
        }
    }

    public int m_() {
        return 80;
    }

    protected class07472 Z_() {
        return new class07472(this);
    }

    protected void l_() {
    }

    public int n_() {
        return 4;
    }

    public float K_() {
        return 1.0f;
    }

    public @Nullable class03530<class06581> NL() {
        return null;
    }

    public void NN() {
        this.f().W();
        this.L(0.0f);
        this.y(0.0f);
        this.method_6125(0.0f);
        this.method_18800(0.0, 0.0, 0.0);
        this.l();
    }

    protected void NM() {
        float f = this.NR();
        float f2 = this.method_5791();
        float f3 = class04995.R((float)(this.fields_4212a028292fd3c078969e3ee4c71d9e8_0.floatValue() - f2));
        float f4 = class04995.N((float)class04995.R((float)(this.fields_4212a028292fd3c078969e3ee4c71d9e8_0.floatValue() - f2)), (float)(-f), (float)f);
        float f5 = f2 + f3 - f4;
        this.method_5847(f5);
    }

    public void Nb() {
        this.h = -1;
    }

    public boolean NG() {
        return ((Byte)this.field_6011.N(N) & 2) != 0;
    }

    public boolean Nt() {
        return ((Byte)this.field_6011.N(N) & 1) != 0;
    }

    public class08342 NE() {
        return this.p;
    }

    public void Nv() {
        if (this.S_() == null) {
            this.Nb();
        }
    }

    public class07209 Ns() {
        return this.D;
    }

    public boolean NU() {
        return this.L(class07085.field_48824);
    }

    public @Nullable class02592 S_() {
        return this.x;
    }

    public void NW() {
        this.A = true;
    }

    public void Nn() {
        super.Nn();
        this.e.N(class07430.field_18405);
    }

    protected class00753 Ny() {
        return i;
    }

    public boolean Nj() {
        return this.h != -1;
    }

    public class07623 lithium$getRegisteredNavigation() {
        return this.r;
    }

    public boolean lithium$isRegisteredToWorld() {
        return this.r != null;
    }

    public long method_51851() {
        return this.S;
    }

    public int method_6110(class04782 class047822) {
        if (this.J > 0) {
            int n = this.J;
            for (class07085 class070852 : class07085.field_54086) {
                if (!class070852.R() || this.method_6118(class070852).R() || !(this.p.y(class070852) <= 1.0f)) continue;
                n += 1 + this.field_5974.y(3);
            }
            return n;
        }
        return this.J;
    }

    public void method_6031(float f) {
        this.c.N();
    }

    public void method_6007() {
        super.method_6007();
        if (this.method_5864().N(class01217.i)) {
            this.v();
        }
        class04643 class046432 = class08700.N();
        class046432.N("looting");
        class07299 class072992 = this.method_73183();
        if (class072992 instanceof class04782) {
            class04782 class047822 = (class04782)class072992;
            if (this.method_5936() && this.method_5805() && !this.fields_6212a028292fd3c078969e3ee4c71d9e8_1.booleanValue() && ((Boolean)class047822.method_64395().N(class07305.I)).booleanValue()) {
                class072992 = this.Ny();
                for (class00717 class007172 : this.method_73183().N(class00717.class, this.method_5829().L((double)class072992.method_10263(), (double)class072992.method_10264(), (double)class072992.method_10260()))) {
                    if (class007172.method_31481() || class007172.N().R() || class007172.R() || !this.y(class047822, class007172.N())) continue;
                    this.N(class047822, class007172);
                }
            }
        }
        class046432.L();
    }

    public void method_6125(float f) {
        super.method_6125(f);
        this.N(f);
    }

    public boolean method_6121(class04782 class047822, class07049 class070492) {
        float f = (float)this.method_45325(class05298.u);
        class06584 class065842 = this.method_59958();
        class07072 class070722 = class065842.N((class07438)this, () -> this.method_48923().y((class07438)this));
        f = class07323.N((class04782)class047822, (class06584)class065842, (class07049)class070492, (class07072)class070722, (float)f);
        f += class065842.B().N(class070492, f, class070722);
        class06889 class068892 = class070492.method_18798();
        boolean bl = class070492.method_64397(class047822, class070722, f);
        if (bl) {
            this.method_75122(class070492, this.method_59924(class070492, class070722), class068892);
            if (class070492 instanceof class07438) {
                class07438 class074382 = (class07438)class070492;
                class065842.N(class074382, (class07438)this);
            }
            class07323.N((class04782)class047822, (class07049)class070492, (class07072)class070722);
            this.method_6114(class070492);
            this.method_59928();
        }
        this.method_75125();
        return bl;
    }

    public final void method_6023() {
        this.fields_6212a028292fd3c078969e3ee4c71d9e8_2 = this.fields_6212a028292fd3c078969e3ee4c71d9e8_2 + 1;
        class04643 class046432 = class08700.N();
        class046432.N("sensing");
        this.a.N();
        class046432.L();
        if ((this.field_6012 + this.method_5628()) % 2 == 0 || this.field_6012 <= 1) {
            class046432.N("targetSelector");
            this.H.N();
            class046432.L();
            class046432.N("goalSelector");
            this.e.N();
            class046432.L();
        } else {
            class046432.N("targetSelector");
            this.H.N(false);
            class046432.L();
            class046432.N("goalSelector");
            this.e.N(false);
            class046432.L();
        }
        class046432.N("navigation");
        this.V.N();
        class046432.L();
        class046432.N("mob tick");
        this.N((class04782)this.method_73183());
        class046432.L();
        class046432.N("controls");
        class046432.N("move");
        this.q.N();
        class046432.y("look");
        this.o.N();
        class046432.y("jump");
        this.K.N();
        class046432.L();
        class046432.L();
    }

    public void method_16077(class04782 class047822, class07072 class070722, boolean bl) {
        super.method_16077(class047822, class070722, bl);
        this.C = Optional.empty();
    }

    public void method_6013(class07072 class070722) {
        this.W();
        super.method_6013(class070722);
    }

    public void method_52540(class03556<class07468> class035562) {
        super.method_52540(class035562);
        if (class035562.N(class05298.P) || class035562.N(class05298.J)) {
            this.f().i();
        }
    }

    public boolean method_63626(class07085 class070852) {
        return this.method_5936();
    }

    public boolean method_5973(class07078<?> class070782) {
        return class070782 != class07078.NB;
    }

    public void method_6010(class03530<class04651> class035302) {
        if (this.f().s()) {
            super.method_6010(class035302);
        } else {
            this.method_18799(this.method_18798().y(0.0, 0.3, 0.0));
        }
    }

    public void method_6099(class04782 class047822, class07072 class070722, boolean bl) {
        super.method_6099(class047822, class070722, bl);
        for (class07085 class070852 : class07085.field_54086) {
            class06584 class065842 = this.method_6118(class070852);
            float f = this.p.y(class070852);
            if (f == 0.0f) continue;
            boolean bl2 = this.p.L(class070852);
            class07049 class070492 = class070722.u();
            if (class070492 instanceof class07438) {
                class07438 class074382 = (class07438)class070492;
                class070492 = this.method_73183();
                if (class070492 instanceof class04782) {
                    f = class07323.N((class04782)((class04782)class070492), (class07438)class074382, (class07072)class070722, (float)f);
                }
            }
            if (class065842.R() || class07323.N((class06584)class065842, (class02477)class02523.g) || !bl && !bl2 || !(this.field_5974.z() < f)) continue;
            if (!bl2 && class065842.W()) {
                class065842.y(class065842.s() - this.field_5974.y(1 + this.field_5974.y(Math.max(class065842.s() - 3, 1))));
            }
            this.method_5775(class047822, class065842);
            this.method_5673(class070852, class06584.E);
        }
    }

    public boolean method_5936() {
        return this.F;
    }

    public void lithium$updateNavigationRegistration() {
        class07623 class076232;
        if (this.lithium$isRegisteredToWorld() && this.r != (class076232 = this.f())) {
            ((ServerWorldExtended)this.method_73183()).lithium$setNavigationInactive(this);
            this.r = class076232;
            if (class076232.Z() != null) {
                ((ServerWorldExtended)this.method_73183()).lithium$setNavigationActive(this);
            }
        }
    }

    public void lithium$setRegisteredToWorld(class07623 class076232) {
        this.r = class076232;
    }
}

