/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class01001
 *  minecraft.class01329
 *  minecraft.class01487
 *  minecraft.class02063
 *  minecraft.class02131
 *  minecraft.class02154
 *  minecraft.class02477
 *  minecraft.class02484
 *  minecraft.class02523
 *  minecraft.class02666
 *  minecraft.class03289
 *  minecraft.class03556
 *  minecraft.class04206
 *  minecraft.class04293
 *  minecraft.class04383
 *  minecraft.class04770
 *  minecraft.class04782
 *  minecraft.class04803
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class05354
 *  minecraft.class05645
 *  minecraft.class05660
 *  minecraft.class05666
 *  minecraft.class05774
 *  minecraft.class06113
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class06912
 *  minecraft.class07041
 *  minecraft.class07047
 *  minecraft.class07049
 *  minecraft.class07050
 *  minecraft.class07052
 *  minecraft.class07055
 *  minecraft.class07072
 *  minecraft.class07078
 *  minecraft.class07079
 *  minecraft.class07082
 *  minecraft.class07085
 *  minecraft.class07209
 *  minecraft.class07218
 *  minecraft.class07299
 *  minecraft.class07316
 *  minecraft.class07323
 *  minecraft.class07438
 *  minecraft.class07446
 *  minecraft.class07789
 *  minecraft.class08234
 *  minecraft.class08299
 *  minecraft.class08329
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.EnumSet;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import minecraft.class00500;
import minecraft.class00869;
import minecraft.class01001;
import minecraft.class01329;
import minecraft.class01487;
import minecraft.class02063;
import minecraft.class02131;
import minecraft.class02154;
import minecraft.class02477;
import minecraft.class02484;
import minecraft.class02523;
import minecraft.class02666;
import minecraft.class03289;
import minecraft.class03556;
import minecraft.class04206;
import minecraft.class04293;
import minecraft.class04383;
import minecraft.class04770;
import minecraft.class04782;
import minecraft.class04803;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class05354;
import minecraft.class05645;
import minecraft.class05660;
import minecraft.class05666;
import minecraft.class05774;
import minecraft.class06113;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class06912;
import minecraft.class07041;
import minecraft.class07047;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class07052;
import minecraft.class07055;
import minecraft.class07072;
import minecraft.class07078;
import minecraft.class07079;
import minecraft.class07082;
import minecraft.class07085;
import minecraft.class07209;
import minecraft.class07218;
import minecraft.class07299;
import minecraft.class07316;
import minecraft.class07323;
import minecraft.class07438;
import minecraft.class07446;
import minecraft.class07789;
import minecraft.class08004;
import minecraft.class08036;
import minecraft.class08041;
import minecraft.class08234;
import minecraft.class08299;
import minecraft.class08329;
import org.jspecify.annotations.Nullable;

public class class08018
extends class08004
implements class05645 {
    private static final class02131<Boolean> N = class03289.N(class08018.class, (class04383)class02154.U);
    private static final class02131<class05666> y = class03289.N(class08018.class, (class04383)class02154.v);
    private static final int M = 3600;
    private static final int B = 6000;
    private static final int Z = 14;
    private static final int W = 4;
    private static final int T = -1;
    private static final int b = 0;
    private static final Set<class06113> X = EnumSet.of(class06113.field_52444, new class06113[]{class06113.field_52445, class06113.field_16468, class06113.field_16465, class06113.field_16469, class06113.field_47245});
    private int a;
    private @Nullable UUID p;
    private @Nullable class05774 F;
    private @Nullable class07316 A;
    private int f = 0;

    protected void method_66649(class02666 class026662) {
        this.method_66650(class026662, class02484.NQ);
        super.method_66649(class026662);
    }

    @Override
    public void method_5693(class04293 class042932) {
        super.method_5693(class042932);
        class042932.N(N, (Object)false);
        class042932.N(y, (Object)this.O());
    }

    @Override
    public void method_5773() {
        if (!this.method_73183().method_8608() && this.method_5805() && this.v()) {
            int n = this.I();
            this.a -= n;
            if (this.a <= 0) {
                this.u((class04782)this.method_73183());
            }
        }
        super.method_5773();
    }

    @Override
    public void method_5652(class08329 class083292) {
        super.method_5652(class083292);
        class083292.N("VillagerData", class05666.L, (Object)this.t());
        class083292.y("Offers", class07316.N, (Object)this.A);
        class083292.y("Gossips", class05774.N, (Object)this.F);
        class083292.N("ConversionTime", this.v() ? this.a : -1);
        class083292.y("ConversionPlayer", class01487.N, (Object)this.p);
        class083292.N("Xp", this.f);
    }

    public <T> @Nullable T method_58694(class02477<? extends T> class024772) {
        if (class024772 == class02484.NQ) {
            return (T)class08018.method_66651(class024772, (Object)this.t().N());
        }
        return (T)super.method_58694(class024772);
    }

    @Override
    public void method_5749(class08299 class082992) {
        super.method_5749(class082992);
        this.field_6011.N(y, (Object)class082992.N("VillagerData", class05666.L).orElseGet(this::O));
        this.A = class082992.N("Offers", class07316.N).orElse(null);
        this.F = class082992.N("Gossips", class05774.N).orElse(null);
        int n = class082992.N("ConversionTime", -1);
        if (n != -1) {
            UUID uUID = class082992.N("ConversionPlayer", class01487.N).orElse(null);
            this.N(uUID, n);
        } else {
            this.method_5841().N(N, (Object)false);
            this.a = -1;
        }
        this.f = class082992.N("Xp", 0);
    }

    public void method_5711(byte by) {
        if (by == 16) {
            if (!this.method_5701()) {
                this.method_73183().method_8486(this.method_23317(), this.method_23320(), this.method_23321(), class04909.oP, this.method_5634(), 1.0f + this.field_5974.z(), this.field_5974.z() * 0.7f + 0.3f, false);
            }
            return;
        }
        super.method_5711(by);
    }

    public class08018(class07078<? extends class08018> class070782, class07299 class072992) {
        super(class070782, class072992);
    }

    private int I() {
        int n = 1;
        if (this.field_5974.z() < 0.01f) {
            int n2 = 0;
            class07218 class072182 = new class07218();
            for (int i = (int)this.method_23317() - 4; i < (int)this.method_23317() + 4 && n2 < 14; ++i) {
                for (int j = (int)this.method_23318() - 4; j < (int)this.method_23318() + 4 && n2 < 14; ++j) {
                    for (int k = (int)this.method_23321() - 4; k < (int)this.method_23321() + 4 && n2 < 14; ++k) {
                        class00500 class005002 = this.method_73183().method_8320((class07209)class072182.N(i, j, k));
                        if (!class005002.N(class00869.RQ) && !(class005002.i() instanceof class07789)) continue;
                        if (this.field_5974.z() < 0.3f) {
                            ++n;
                        }
                        ++n2;
                    }
                }
            }
        }
        return n;
    }

    @Override
    public class04891 s() {
        return class04909.oW;
    }

    @Override
    protected boolean m() {
        return false;
    }

    private class07041 o() {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21)) {
            return class07082.N;
        }
        return class07082.y;
    }

    public class05666 t() {
        return (class05666)this.field_6011.N(y);
    }

    public boolean v() {
        return (Boolean)this.method_5841().N(N);
    }

    private void u(class04782 class047822) {
        this.N(class07078.ye, class08234.N((class07079)this, (boolean)false, (boolean)false), class080412 -> {
            class08036 class080362;
            for (class07085 class070852 : this.N(class047822, class065842 -> !class07323.N((class06584)class065842, (class02477)class02523.I))) {
                class04803 class048032 = class080412.method_32318(class070852.y() + 300);
                if (class048032 == null) continue;
                class048032.N(this.method_6118(class070852));
            }
            class080412.N(this.t());
            if (this.F != null) {
                class080412.N(this.F);
            }
            if (this.A != null) {
                class080412.y(this.A.N());
            }
            class080412.y(this.f);
            class080412.N((class01001)class047822, class047822.method_8404(class080412.method_24515()), class06113.field_16468, null);
            class080412.L(class047822);
            if (this.p != null && (class080362 = class047822.N(this.p)) instanceof class04770) {
                class06912.j.N((class04770)class080362, (class08004)this, class080412);
                class047822.method_19496(class05354.N, (class07049)class080362, (class01329)class080412);
            }
            class080412.method_6092(new class07055(class07047.Z, 200, 0));
            if (!this.method_5701()) {
                class047822.method_8444(null, 1027, this.method_24515(), 0);
            }
        });
    }

    public void y(int n) {
        this.f = n;
    }

    public void N(class05666 class056662) {
        if (!this.t().y().equals((Object)class056662.y())) {
            this.A = null;
        }
        this.field_6011.N(y, (Object)class056662);
    }

    private void N(@Nullable UUID uUID, int n) {
        this.p = uUID;
        this.a = n;
        this.method_5841().N(N, (Object)true);
        this.method_6016(class07047.b);
        this.method_6092(new class07055(class07047.i, n, Math.min(this.method_73183().y().N() - 1, 0)));
        this.method_73183().method_8421((class07049)this, (byte)16);
    }

    @Override
    public @Nullable class07446 N(class01001 class010012, class07052 class070522, class06113 class061132, @Nullable class07446 class074462) {
        if (!X.contains(class061132)) {
            this.N(this.t().N((class02063)class010012.method_30349(), class05660.N((class03556)class010012.i(this.method_24515()))));
        }
        return super.N(class010012, class070522, class061132, class074462);
    }

    public class07082 N(class08036 class080362, class07050 class070502) {
        class06584 class065842 = class080362.method_5998(class070502);
        if (class065842.N(class06570.bV)) {
            if (this.method_6059(class07047.b)) {
                class065842.N(1, (class07438)class080362);
                if (!this.method_73183().method_8608()) {
                    this.N(class080362.method_5667(), this.field_5974.y(2401) + 3600);
                }
                return this.o();
            }
            return class07082.L;
        }
        return super.N(class080362, class070502);
    }

    public boolean N(double d) {
        return !this.v() && this.f == 0;
    }

    public void N(int n) {
        this.a = n;
    }

    public void N(class07316 class073162) {
        this.A = class073162;
    }

    public void N(class05774 class057742) {
        this.F = class057742;
    }

    private class05666 O() {
        Optional var1 = class04206.d.N(this.field_5974);
        class05666 class056662 = class08041.G();
        if (var1.isPresent()) {
            class056662 = class056662.y((class03556)var1.get());
        }
        return class056662;
    }

    public int G() {
        return this.f;
    }

    protected <T> boolean method_66654(class02477<T> class024772, T t) {
        if (class024772 == class02484.NQ) {
            class03556 var3 = (class03556)class08018.method_66651((class02477)class02484.NQ, t);
            this.N(this.t().N(var3));
            return true;
        }
        return super.method_66654(class024772, t);
    }

    @Override
    public class04891 method_6002() {
        return class04909.os;
    }

    @Override
    public class04891 method_6011(class07072 class070722) {
        return class04909.oT;
    }

    public float method_6017() {
        if (this.method_6109()) {
            return (this.field_5974.z() - this.field_5974.z()) * 0.2f + 2.0f;
        }
        return (this.field_5974.z() - this.field_5974.z()) * 0.2f + 1.0f;
    }

    @Override
    public class04891 X_() {
        return class04909.ob;
    }
}

