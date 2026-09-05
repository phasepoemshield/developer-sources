/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10953
 *  Nursultan.class11528
 *  Nursultan.class11938
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime
 *  com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl
 *  com.llamalad7.mixinextras.sugar.ref.LocalRef
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  de.maxhenkel.voicechat.events.RenderEvents
 *  de.maxhenkel.voicechat.intercompatibility.ClientCompatibilityManager$RenderNameplateEvent
 *  minecraft.class00392
 *  minecraft.class01140
 *  minecraft.class01180
 *  minecraft.class01226
 *  minecraft.class01237
 *  minecraft.class01312
 *  minecraft.class01384
 *  minecraft.class01421
 *  minecraft.class01686
 *  minecraft.class01894
 *  minecraft.class02058
 *  minecraft.class02241
 *  minecraft.class02242
 *  minecraft.class02245
 *  minecraft.class02294
 *  minecraft.class02440
 *  minecraft.class02484
 *  minecraft.class02549
 *  minecraft.class02554
 *  minecraft.class02562
 *  minecraft.class02600
 *  minecraft.class02721
 *  minecraft.class03662
 *  minecraft.class04256
 *  minecraft.class04453
 *  minecraft.class04802
 *  minecraft.class04832
 *  minecraft.class04995
 *  minecraft.class05489
 *  minecraft.class06078
 *  minecraft.class06202
 *  minecraft.class06252
 *  minecraft.class06368
 *  minecraft.class06509
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class06593
 *  minecraft.class06600
 *  minecraft.class06602
 *  minecraft.class06618
 *  minecraft.class06851
 *  minecraft.class06889
 *  minecraft.class06959
 *  minecraft.class07050
 *  minecraft.class07070
 *  minecraft.class07211
 *  minecraft.class07438
 *  minecraft.class08030
 *  minecraft.class08036
 *  minecraft.class08118
 *  minecraft.class08155
 *  minecraft.class08467
 *  minecraft.class08468
 *  minecraft.class08476
 *  minecraft.class08800
 *  minecraft.class08943
 *  net.raphimc.vialegacy.api.LegacyProtocolVersion
 *  org.joml.Quaternionfc
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import Nursultan.class10953;
import Nursultan.class11528;
import Nursultan.class11938;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl;
import com.llamalad7.mixinextras.sugar.ref.LocalRef;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import de.maxhenkel.voicechat.events.RenderEvents;
import de.maxhenkel.voicechat.intercompatibility.ClientCompatibilityManager;
import java.util.Objects;
import minecraft.class00392;
import minecraft.class01140;
import minecraft.class01180;
import minecraft.class01226;
import minecraft.class01237;
import minecraft.class01312;
import minecraft.class01384;
import minecraft.class01421;
import minecraft.class01686;
import minecraft.class01894;
import minecraft.class02058;
import minecraft.class02241;
import minecraft.class02242;
import minecraft.class02245;
import minecraft.class02294;
import minecraft.class02440;
import minecraft.class02484;
import minecraft.class02549;
import minecraft.class02554;
import minecraft.class02562;
import minecraft.class02600;
import minecraft.class02721;
import minecraft.class03662;
import minecraft.class04256;
import minecraft.class04453;
import minecraft.class04802;
import minecraft.class04832;
import minecraft.class04995;
import minecraft.class05489;
import minecraft.class06078;
import minecraft.class06202;
import minecraft.class06252;
import minecraft.class06368;
import minecraft.class06509;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class06593;
import minecraft.class06600;
import minecraft.class06602;
import minecraft.class06618;
import minecraft.class06851;
import minecraft.class06889;
import minecraft.class06959;
import minecraft.class07050;
import minecraft.class07070;
import minecraft.class07211;
import minecraft.class07438;
import minecraft.class08030;
import minecraft.class08036;
import minecraft.class08118;
import minecraft.class08155;
import minecraft.class08186;
import minecraft.class08467;
import minecraft.class08468;
import minecraft.class08476;
import minecraft.class08800;
import minecraft.class08943;
import net.raphimc.vialegacy.api.LegacyProtocolVersion;
import org.joml.Quaternionfc;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class08287<AvatarlikeEntity extends class06600>
extends class02294<AvatarlikeEntity, class08468, class02721> {
    public class01894 L(class08468 class084682) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N(class084682, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return (class01894)callbackInfoReturnable.getReturnValue();
        }
        return class084682.N.N().y();
    }

    private void L(AvatarlikeEntity AvatarlikeEntity, class08468 class084682, float f) {
        class06602 class066022 = ((class06618)AvatarlikeEntity).B();
        double d = class066022.y(f) - class04995.u((double)f, (double)((class06600)AvatarlikeEntity).field_6014, (double)AvatarlikeEntity.method_23317());
        double d2 = class066022.L(f) - class04995.u((double)f, (double)((class06600)AvatarlikeEntity).field_6036, (double)AvatarlikeEntity.method_23318());
        double d3 = class066022.u(f) - class04995.u((double)f, (double)((class06600)AvatarlikeEntity).field_5969, (double)AvatarlikeEntity.method_23321());
        float f2 = class04995.Z((float)f, (float)((class07438)AvatarlikeEntity).fields_4212a028292fd3c078969e3ee4c71d9e8_1.floatValue(), (float)((class07438)AvatarlikeEntity).fields_4212a028292fd3c078969e3ee4c71d9e8_0.floatValue());
        double d4 = class04995.m((double)(f2 * ((float)Math.PI / 180)));
        double d5 = -class04995.P((double)(f2 * ((float)Math.PI / 180)));
        class084682.y = (float)d2 * 10.0f;
        class084682.y = class04995.N((float)class084682.y, (float)-6.0f, (float)32.0f);
        class084682.a = (float)(d * d4 + d3 * d5) * 100.0f;
        class084682.a *= 1.0f - class084682.N();
        class084682.a = class04995.N((float)class084682.a, (float)0.0f, (float)150.0f);
        class084682.p = (float)(d * d5 - d3 * d4) * 100.0f;
        class084682.p = class04995.N((float)class084682.p, (float)-20.0f, (float)20.0f);
        float f3 = class066022.R(f);
        float f4 = class066022.B(f);
        class084682.y += class04995.m((double)(f4 * 6.0f)) * 32.0f * f3;
    }

    public class08287(class04832 class048322, boolean bl) {
        super(class048322, (class06078)new class02721(class048322.N(bl ? class04802.LK : class04802.Lg), bl), 0.5f);
        this.N(new class02562((class06252)this, class08118.N((class08118)(bl ? class04802.LV : class04802.Lq), (class01140)class048322.R(), (T class016862) -> new class02721(class016862, bl)), class048322.B()));
        this.N(new class06368((class06252)this));
        this.N(new class02554((class02294)this, class048322));
        this.N(new class02241((class06252)this, class048322.R()));
        this.N(new class02549((class06252)this, class048322.R(), class048322.M()));
        this.N(new class02245((class06252)this, class048322.R(), class048322.U()));
        this.N(new class02242((class06252)this, class048322.R(), class048322.B()));
        this.N(new class02600((class06252)this, class048322.R()));
        this.N(new class02440((class06252)this, class048322.R()));
        this.N(new class05489((class02294)this, class048322));
    }

    private boolean u(class08468 class084682) {
        return ProtocolTranslator.getTargetVersion().newerThan(ProtocolVersion.v1_11_1) && class084682.Z;
    }

    public class08468 method_55269() {
        return new class08468();
    }

    private void y(AvatarlikeEntity AvatarlikeEntity, class08468 class084682, float f) {
        class084682.Nl = (float)AvatarlikeEntity.method_6003() + f;
        class06889 class068892 = AvatarlikeEntity.method_5828(f);
        class06889 class068893 = ((class06618)AvatarlikeEntity).B().N().N(AvatarlikeEntity.method_18798(), (double)f);
        if (class068893.z() > (double)1.0E-5f && class068892.z() > (double)1.0E-5f) {
            class084682.Nd = true;
            double d = class068893.R().u().y(class068892.R().u());
            double d2 = class068893.M * class068892.Z - class068893.Z * class068892.M;
            class084682.Nw = (float)(Math.signum(d2) * Math.acos(Math.min(1.0, Math.abs(d))));
        } else {
            class084682.Nd = false;
            class084682.Nw = 0.0f;
        }
    }

    public void y(class01421 class014212, class01237 class012372, int n, class01894 class018942, boolean bl) {
        this.N(class014212, class012372, n, class018942, ((class02721)this.y).U, bl);
    }

    public class06889 method_23169(class08468 class084682) {
        class06889 class068892 = super.method_23169((class08800)class084682);
        if (this.u(class084682)) {
            class06889 class068893 = class068892.y(0.0, (double)(class084682.NL * -2.0f) / 16.0, 0.0);
            class06889 class068894 = class068893;
            class068894 = new CallbackInfoReturnable("", true, (Object)class068894);
            this.y(class084682, (CallbackInfoReturnable)class068894);
            if (class068894.isCancelled()) {
                return (class06889)class068894.getReturnValue();
            }
            return class068893;
        }
        class06889 class068895 = class068892;
        class06889 class068896 = class068895;
        class068896 = new CallbackInfoReturnable("", true, (Object)class068896);
        this.y(class084682, (CallbackInfoReturnable)class068896);
        if (class068896.isCancelled()) {
            return (class06889)class068896.getReturnValue();
        }
        return class068895;
    }

    private void y(class08468 class084682, CallbackInfoReturnable callbackInfoReturnable) {
        class07211 class072112;
        if (class084682.Nm == class01312.field_18078 && (class072112 = class084682.NW) != null) {
            if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_13_2)) {
                callbackInfoReturnable.setReturnValue((Object)((class06889)callbackInfoReturnable.getReturnValue()).N((double)class072112.P() * 0.4, 0.0, (double)class072112.T() * 0.4));
            }
            if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(LegacyProtocolVersion.b1_5tob1_5_2)) {
                callbackInfoReturnable.setReturnValue((Object)((class06889)callbackInfoReturnable.getReturnValue()).N((double)class072112.P() * 0.1, 0.0, (double)class072112.T() * 0.1));
            }
            if (ProtocolTranslator.getTargetVersion().betweenInclusive(LegacyProtocolVersion.b1_6tob1_6_6, ProtocolVersion.v1_7_6)) {
                callbackInfoReturnable.setReturnValue((Object)((class06889)callbackInfoReturnable.getReturnValue()).N(0.0, (double)0.3f, 0.0));
            }
        }
    }

    private void N(class01237 class012372, class01421 class014212, class06889 class068892, int n, class00392 class003922, boolean bl, int n2, double d, class06959 class069592, Operation operation, LocalRef localRef, LocalRef localRef2) {
        this.N(class012372, class014212, class068892, n, class003922, bl, n2, d, class069592, operation, (class08468)localRef.get(), (class01237)localRef2.get());
    }

    private void N(class01237 class012372, class01421 class014212, class06889 class068892, int n, class00392 class003922, boolean bl, int n2, double d, class06959 class069592, Operation operation, class08468 class084682, class01237 class012373) {
        operation.call(new Object[]{class012372, class014212, class068892, n, class003922, bl, n2, d, class069592});
        ((ClientCompatibilityManager.RenderNameplateEvent)RenderEvents.RENDER_NAMEPLATE.invoker()).render((class08800)class084682, class069592, class014212, class012373);
    }

    private static void N(class06600 class066002, class06584 class065842, class07050 class070502, CallbackInfoReturnable callbackInfoReturnable) {
        class08036 class080362;
        block7: {
            block6: {
                if (class066002 == (class04453)class06202.Nq().T_4 || !(class066002 instanceof class08036)) break block6;
                class080362 = (class08036)class066002;
                if (!class065842.R()) break block7;
            }
            return;
        }
        boolean bl = class11528.N((class08036)class080362, (boolean)false);
        if (class080362.method_6058() == class070502 && class080362.method_6014() > 0 && class065842.G() == class06509.field_8949) {
            callbackInfoReturnable.setReturnValue((Object)(bl ? class01180.field_3406 : class01180.field_3410));
        } else if (bl && !class080362.fields_0212a028292fd3c078969e3ee4c71d9e8_4.booleanValue() && class065842.N(class06570.dw) && class06593.u((class06584)class065842)) {
            callbackInfoReturnable.setReturnValue((Object)class01180.field_3410);
        }
    }

    public void N(class08468 class084682, CallbackInfoReturnable callbackInfoReturnable) {
        class10953 class109532 = class10953.N((class08468)class084682, (class01894)class084682.N.N().y());
        class11938.L().L((Object)class109532);
        callbackInfoReturnable.setReturnValue((Object)class109532.y());
    }

    public void method_62354(AvatarlikeEntity AvatarlikeEntity, class08468 class084682, float f) {
        class06584 class065842;
        super.method_62354(AvatarlikeEntity, (class08476)class084682, f);
        class04256.N(AvatarlikeEntity, (class08467)class084682, (float)f, (class08943)this.L);
        class084682.NV = class08287.N(AvatarlikeEntity, class07070.field_6182);
        class084682.No = class08287.N(AvatarlikeEntity, class07070.field_6183);
        class084682.N = ((class06618)AvatarlikeEntity).Z();
        class084682.F = AvatarlikeEntity.method_6022();
        class084682.A = AvatarlikeEntity.method_21753();
        class084682.f = AvatarlikeEntity.method_7325();
        class084682.C = AvatarlikeEntity.method_74091(class08030.field_7563);
        class084682.S = AvatarlikeEntity.method_74091(class08030.field_7564);
        class084682.Nj = AvatarlikeEntity.method_74091(class08030.field_7566);
        class084682.Nv = AvatarlikeEntity.method_74091(class08030.field_7565);
        class084682.Nn = AvatarlikeEntity.method_74091(class08030.field_7568);
        class084682.Nt = AvatarlikeEntity.method_74091(class08030.field_7570);
        class084682.NG = AvatarlikeEntity.method_74091(class08030.field_7559);
        this.y(AvatarlikeEntity, class084682, f);
        this.L(AvatarlikeEntity, class084682, f);
        class084682.Nk = class084682.j < 100.0 ? ((class06618)AvatarlikeEntity).z() : null;
        class084682.NY = ((class06618)AvatarlikeEntity).y(true);
        class084682.NQ = ((class06618)AvatarlikeEntity).y(false);
        class084682.NO = AvatarlikeEntity.method_5628();
        class084682.Ng = ((class06618)AvatarlikeEntity).U();
        class084682.NI.y();
        if (class084682.o && (class065842 = AvatarlikeEntity.method_5998(class084682.B)).N(class06570.vy)) {
            this.L.N(class084682.NI, class065842, class03662.field_4316, AvatarlikeEntity);
        }
    }

    protected boolean method_3921(AvatarlikeEntity AvatarlikeEntity, double d) {
        return super.method_3921(AvatarlikeEntity, d) && (AvatarlikeEntity.method_5733() || AvatarlikeEntity.method_16914() && AvatarlikeEntity == this.field_4676.L);
    }

    public void N(class01421 class014212, class01237 class012372, int n, class01894 class018942, boolean bl) {
        this.N(class014212, class012372, n, class018942, ((class02721)this.y).z, bl);
    }

    protected boolean N(class08468 class084682) {
        return !class084682.f;
    }

    private static class01180 N(class06600 class066002, class07070 class070702) {
        class06584 class065842 = class066002.method_5998(class07050.field_5808);
        class06584 class065843 = class066002.method_5998(class07050.field_5810);
        class01180 class011802 = class08287.N(class066002, class065842, class07050.field_5808);
        class01180 class011803 = class08287.N(class066002, class065843, class07050.field_5810);
        if (class011802.N()) {
            class01180 class011804 = class011803 = class065843.R() ? class01180.field_3409 : class01180.field_3410;
        }
        if (class066002.method_6068() == class070702) {
            return class011802;
        }
        return class011803;
    }

    private static class01180 N(class06600 class066002, class06584 class065842, class07050 class070502) {
        class08186 class081862;
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        class08287.N(class066002, class065842, class070502, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return (class01180)callbackInfoReturnable.getReturnValue();
        }
        if (class065842.R()) {
            return class01180.field_3409;
        }
        if (!class066002.fields_0212a028292fd3c078969e3ee4c71d9e8_4.booleanValue() && class065842.N(class06570.dw) && class06593.u((class06584)class065842)) {
            return class01180.field_3408;
        }
        if (class066002.method_6058() == class070502 && class066002.method_6014() > 0) {
            class081862 = class065842.G();
            if (class081862 == class06509.field_8949) {
                return class01180.field_3406;
            }
            if (class081862 == class06509.field_8953) {
                return class01180.field_3403;
            }
            if (class081862 == class06509.field_63380) {
                return class01180.field_63542;
            }
            if (class081862 == class06509.field_8947) {
                return class01180.field_3405;
            }
            if (class081862 == class06509.field_27079) {
                return class01180.field_27434;
            }
            if (class081862 == class06509.field_39058) {
                return class01180.field_39071;
            }
            if (class081862 == class06509.field_42717) {
                return class01180.field_42877;
            }
            if (class081862 == class06509.field_8951) {
                return class01180.field_63543;
            }
        }
        if ((class081862 = (class08186)((Object)class065842.method_58694(class02484.a))) != null && class081862.N() == class08155.field_63400 && class066002.fields_0212a028292fd3c078969e3ee4c71d9e8_4.booleanValue()) {
            return class01180.field_63543;
        }
        if (class065842.N(class01226.LR)) {
            return class01180.field_63543;
        }
        return class01180.field_3410;
    }

    protected void y(class08468 class084682, class01421 class014212) {
        float f = 0.9375f;
        class014212.y(0.9375f, 0.9375f, 0.9375f);
    }

    protected void method_3926(class08468 class084682, class01421 class014212, class01237 class012372, class06959 class069592) {
        int n;
        class014212.N();
        int n2 = n = class084682.Ng ? -10 : 0;
        if (class084682.Nk != null) {
            class012372.N(class014212, class084682.k, n, class084682.Nk, !class084682.n, class084682.G, class084682.j, class069592);
            Objects.requireNonNull(this.method_3932());
            class014212.N(0.0f, 9.0f * 1.15f * 0.025f, 0.0f);
        }
        if (class084682.w != null) {
            class06959 class069593 = class069592;
            double d = class084682.j;
            int n3 = class084682.G;
            boolean bl = !class084682.n;
            class00392 class003922 = class084682.w;
            int n4 = n;
            class06889 class068892 = class084682.k;
            class01421 class014213 = class014212;
            class01237 class012373 = class012372;
            Operation operation = objectArray -> {
                WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)9, (String)"[net.minecraft.class_11659, net.minecraft.class_4587, net.minecraft.class_243, int, net.minecraft.class_2561, boolean, int, double, net.minecraft.class_12075]");
                ((class01237)objectArray[0]).N((class01421)objectArray[1], (class06889)objectArray[2], ((Integer)objectArray[3]).intValue(), (class00392)objectArray[4], ((Boolean)objectArray[5]).booleanValue(), ((Integer)objectArray[6]).intValue(), ((Double)objectArray[7]).doubleValue(), (class06959)objectArray[8]);
                return null;
            };
            LocalRefImpl localRefImpl = new LocalRefImpl();
            LocalRefImpl localRefImpl2 = new LocalRefImpl();
            localRefImpl.init((Object)class084682);
            localRefImpl2.init((Object)class012372);
            this.N(class012373, class014213, class068892, n4, class003922, bl, n3, d, class069593, operation, (LocalRef)localRefImpl, (LocalRef)localRefImpl2);
            class012372 = (class01237)localRefImpl2.dispose();
            class084682 = (class08468)localRefImpl.dispose();
        }
        class014212.y();
    }

    public static boolean N(class08036 class080362) {
        return class08287.N(class080362.method_7334().name());
    }

    private void N(class01421 class014212, class01237 class012372, int n, class01894 class018942, class01686 class016862, boolean bl) {
        class02721 class027212 = (class02721)this.L();
        class016862.L();
        class016862.U = true;
        class027212.b.U = bl;
        class027212.j.U = bl;
        class027212.U.M = -0.1f;
        class027212.z.M = 0.1f;
        class012372.N(class016862, class014212, class06851.z((class01894)class018942), n, class01384.u, null);
    }

    public boolean N(AvatarlikeEntity AvatarlikeEntity) {
        if (AvatarlikeEntity.method_74091(class08030.field_7559)) {
            if (AvatarlikeEntity instanceof class08036) {
                return class08287.N((class08036)AvatarlikeEntity);
            }
            return super.N(AvatarlikeEntity);
        }
        return false;
    }

    protected void y(class08468 class084682, class01421 class014212, float f, float f2) {
        float f3 = class084682.L;
        float f4 = class084682.h;
        if (class084682.g) {
            super.y((class08476)class084682, class014212, f, f2);
            float f5 = class084682.N();
            if (!class084682.Nz) {
                class014212.N((Quaternionfc)class02058.y.N(f5 * (-90.0f - f4)));
            }
            if (class084682.Nd) {
                class014212.N((Quaternionfc)class02058.u.rotation(class084682.Nw));
            }
        } else if (f3 > 0.0f) {
            super.y((class08476)class084682, class014212, f, f2);
            float f6 = class084682.NZ ? -90.0f - f4 : -90.0f;
            float f7 = class04995.B((float)f3, (float)0.0f, (float)f6);
            class014212.N((Quaternionfc)class02058.y.N(f7));
            if (class084682.I) {
                class014212.N(0.0f, -1.0f, 0.3f);
            }
        } else {
            super.y((class08476)class084682, class014212, f, f2);
        }
    }
}

