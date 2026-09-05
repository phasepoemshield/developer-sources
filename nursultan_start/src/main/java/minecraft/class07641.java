/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  minecraft.class00436
 *  minecraft.class00672
 *  minecraft.class00717
 *  minecraft.class00869
 *  minecraft.class01194
 *  minecraft.class01210
 *  minecraft.class01226
 *  minecraft.class02131
 *  minecraft.class02154
 *  minecraft.class02477
 *  minecraft.class02484
 *  minecraft.class02666
 *  minecraft.class02692
 *  minecraft.class03289
 *  minecraft.class03556
 *  minecraft.class04107
 *  minecraft.class04293
 *  minecraft.class04383
 *  minecraft.class04782
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class05310
 *  minecraft.class05487
 *  minecraft.class05970
 *  minecraft.class06069
 *  minecraft.class06113
 *  minecraft.class06273
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class07049
 *  minecraft.class07050
 *  minecraft.class07077
 *  minecraft.class07078
 *  minecraft.class07079
 *  minecraft.class07082
 *  minecraft.class07103
 *  minecraft.class07107
 *  minecraft.class07126
 *  minecraft.class07209
 *  minecraft.class07284
 *  minecraft.class07295
 *  minecraft.class07299
 *  minecraft.class07310
 *  minecraft.class07438
 *  minecraft.class08036
 *  minecraft.class08234
 *  minecraft.class08299
 *  minecraft.class08329
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.Optional;
import java.util.UUID;
import minecraft.class00436;
import minecraft.class00672;
import minecraft.class00717;
import minecraft.class00869;
import minecraft.class01194;
import minecraft.class01210;
import minecraft.class01226;
import minecraft.class02131;
import minecraft.class02154;
import minecraft.class02477;
import minecraft.class02484;
import minecraft.class02666;
import minecraft.class02692;
import minecraft.class03289;
import minecraft.class03556;
import minecraft.class04107;
import minecraft.class04293;
import minecraft.class04383;
import minecraft.class04782;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class05310;
import minecraft.class05487;
import minecraft.class05970;
import minecraft.class06069;
import minecraft.class06113;
import minecraft.class06273;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class07077;
import minecraft.class07078;
import minecraft.class07079;
import minecraft.class07082;
import minecraft.class07103;
import minecraft.class07107;
import minecraft.class07126;
import minecraft.class07209;
import minecraft.class07284;
import minecraft.class07295;
import minecraft.class07299;
import minecraft.class07310;
import minecraft.class07438;
import minecraft.class07631;
import minecraft.class07652;
import minecraft.class08036;
import minecraft.class08234;
import minecraft.class08299;
import minecraft.class08329;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class07641
extends class07652
implements class05310 {
    private static final class02131<Integer> N = class03289.N(class07641.class, (class04383)class02154.y);
    private static final int y = 1024;
    private static final String L = "stew_effects";
    private @Nullable class02692 u;
    private @Nullable UUID i;

    protected void method_66649(class02666 class026662) {
        this.method_66650(class026662, class02484.NH);
        super.method_66649(class026662);
    }

    public void method_5693(class04293 class042932) {
        super.method_5693(class042932);
        class042932.N(N, (Object)class07631.field_57612.field_55964);
    }

    @Override
    public void method_5652(class08329 class083292) {
        super.method_5652(class083292);
        class083292.N("Type", class07631.field_41549, (Object)this.W());
        class083292.y(L, class02692.L, (Object)this.u);
    }

    public <T> @Nullable T method_58694(class02477<? extends T> class024772) {
        if (class024772 == class02484.NH) {
            return (T)class07641.method_66651(class024772, (Object)((Object)this.W()));
        }
        return (T)super.method_58694(class024772);
    }

    @Override
    public void method_5749(class08299 class082992) {
        super.method_5749(class082992);
        this.N(class082992.N("Type", class07631.field_41549).orElse(class07631.field_57612));
        this.u = class082992.N(L, class02692.L).orElse(null);
    }

    public void method_5800(class04782 class047822, class00672 class006722) {
        UUID uUID = class006722.method_5667();
        if (!uUID.equals(this.i)) {
            this.N(this.W() == class07631.field_18109 ? class07631.field_18110 : class07631.field_18109);
            this.i = uUID;
            this.method_5783(class04909.bL, 2.0f, 1.0f);
        }
    }

    public class07641(class07078<? extends class07641> class070782, class07299 class072992) {
        super((class07078<? extends class07652>)class070782, class072992);
    }

    private Optional<class02692> i(class06584 class065842) {
        class04107 class041072 = class04107.N((class07310)class065842.B());
        if (class041072 != null) {
            return Optional.of(class041072.L());
        }
        return Optional.empty();
    }

    public boolean d() {
        return this.method_5805() && !this.method_6109();
    }

    private void N(class08036 class080362, class07050 class070502, CallbackInfoReturnable callbackInfoReturnable) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21_2) && !class080362.method_5998(class070502).N(class01226.a)) {
            callbackInfoReturnable.setReturnValue((Object)super.N(class080362, class070502));
        }
    }

    public @Nullable class07641 y(class04782 class047822, class07077 class070772) {
        class07641 class076412 = (class07641)class07078.NV.N((class07299)class047822, class06113.field_16466);
        if (class076412 != null) {
            class076412.N(this.N((class07641)class070772));
        }
        return class076412;
    }

    private class07631 N(class07641 class076412) {
        class07631 class076312;
        class07631 class076313 = this.W();
        class07631 class076314 = class076313 == (class076312 = class076412.W()) && this.field_5974.y(1024) == 0 ? (class076313 == class07631.field_18110 ? class07631.field_18109 : class07631.field_18110) : (this.field_5974.Z() ? class076313 : class076312);
        return class076314;
    }

    public static boolean N(class07078<class07641> class070782, class07284 class072842, class06113 class061132, class07209 class072092, class06069 class060692) {
        return class072842.method_8320(class072092.method_10074()).N(class01210.Ls) && class07641.N((class07295)class072842, class072092);
    }

    @Override
    public float N(class07209 class072092, class05487 class054872) {
        if (class054872.method_8320(class072092.method_10074()).N(class00869.RC)) {
            return 10.0f;
        }
        return class054872.B(class072092);
    }

    public void N(class04782 class047822, class04911 class049112, class06584 class065842) {
        class047822.method_43129(null, (class07049)this, class04909.bM, class049112, 1.0f, 1.0f);
        this.N(class07078.J, class08234.N((class07079)this, (boolean)false, (boolean)false), class085832 -> {
            class047822.method_65096((class07126)class07107.l, this.method_23317(), this.method_23323(0.5), this.method_23321(), 1, 0.0, 0.0, 0.0, 0.0);
            this.method_61419(class047822, class06273.ND, class065842, (class047822, class065842) -> {
                for (int i = 0; i < class065842.c(); ++i) {
                    class047822.method_8649((class07049)new class00717(this.method_73183(), this.method_23317(), this.method_23323(1.0), this.method_23321(), class065842.L(1)));
                }
            });
        });
    }

    private void N(class07631 class076312) {
        this.field_6011.N(N, (Object)class076312.field_55964);
    }

    private class07082 N(class07652 class076522, class08036 class080362, class07050 class070502) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21_2)) {
            return class07082.i;
        }
        return super.N(class080362, class070502);
    }

    @Override
    public class07082 N(class08036 class080362, class07050 class070502) {
        class06584 class065842 = class080362.method_5998(class070502);
        if (class065842.N(class06570.sC) && !this.method_6109()) {
            class06584 class065843;
            boolean bl = false;
            if (this.u != null) {
                bl = true;
                class065843 = new class06584((class07310)class06570.dk);
                class065843.N(class02484.NN, (Object)this.u);
                this.u = null;
            } else {
                class065843 = new class06584((class07310)class06570.TD);
            }
            class06584 class065844 = class05970.N((class06584)class065842, (class08036)class080362, (class06584)class065843, (boolean)false);
            class080362.method_6122(class070502, class065844);
            class04891 class048912 = bl ? class04909.bR : class04909.bi;
            this.method_5783(class048912, 1.0f, 1.0f);
            return class07082.N;
        }
        if (class065842.N(class06570.vr) && this.d()) {
            class07299 class072992 = this.method_73183();
            if (class072992 instanceof class04782) {
                class04782 class047822 = (class04782)class072992;
                this.N(class047822, class04911.field_15248, class065842);
                this.method_32875((class03556)class01194.H, (class07049)class080362);
                class065842.N(1, (class07438)class080362, class070502.N());
            }
            return class07082.N;
        }
        if (this.W() == class07631.field_18110) {
            CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
            this.N(class080362, class070502, callbackInfoReturnable);
            if (callbackInfoReturnable.isCancelled()) {
                return (class07082)callbackInfoReturnable.getReturnValue();
            }
            Optional<class02692> var4 = this.i(class065842);
            if (var4.isEmpty()) {
                class07050 class070503 = class070502;
                class08036 class080363 = class080362;
                class07641 class076412 = this;
                return this.N(class076412, class080363, class070503);
            }
            if (this.u != null) {
                for (int i = 0; i < 2; ++i) {
                    this.method_73183().method_8406((class07126)class07107.NZ, this.method_23317() + this.field_5974.U() / 2.0, this.method_23323(0.5), this.method_23321() + this.field_5974.U() / 2.0, 0.0, this.field_5974.U() / 5.0, 0.0);
                }
            } else {
                class065842.N(1, (class07438)class080362);
                class00436 class004362 = class00436.N((class07103)class07107.T, (int)-1, (float)1.0f);
                for (int i = 0; i < 4; ++i) {
                    this.method_73183().method_8406((class07126)class004362, this.method_23317() + this.field_5974.U() / 2.0, this.method_23323(0.5), this.method_23321() + this.field_5974.U() / 2.0, 0.0, this.field_5974.U() / 5.0, 0.0);
                }
                this.u = var4.get();
                this.method_5783(class04909.bu, 2.0f, 1.0f);
            }
            return class07082.N;
        }
        return super.N(class080362, class070502);
    }

    public class07631 W() {
        return class07631.N((Integer)this.field_6011.N(N));
    }

    protected <T> boolean method_66654(class02477<T> class024772, T t) {
        if (class024772 == class02484.NH) {
            this.N((class07631)((Object)class07641.method_66651((class02477)class02484.NH, t)));
            return true;
        }
        return super.method_66654(class024772, t);
    }
}

