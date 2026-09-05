/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10986
 *  Nursultan.class10988
 *  Nursultan.class11796
 *  Nursultan.class11806
 *  Nursultan.class11816
 *  Nursultan.class11822
 *  Nursultan.class11938
 *  Nursultan.class12041
 *  com.google.common.collect.Lists
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime
 *  com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl
 *  com.llamalad7.mixinextras.sugar.ref.LocalRef
 *  me.flashyreese.mods.sodiumextra.client.SodiumExtraClientMod
 *  minecraft.class00392
 *  minecraft.class00502
 *  minecraft.class00734
 *  minecraft.class01237
 *  minecraft.class01312
 *  minecraft.class01384
 *  minecraft.class01421
 *  minecraft.class01894
 *  minecraft.class02058
 *  minecraft.class02484
 *  minecraft.class02562
 *  minecraft.class02566
 *  minecraft.class02689
 *  minecraft.class02777
 *  minecraft.class03662
 *  minecraft.class04453
 *  minecraft.class04477
 *  minecraft.class04507
 *  minecraft.class04832
 *  minecraft.class04995
 *  minecraft.class06078
 *  minecraft.class06202
 *  minecraft.class06249
 *  minecraft.class06252
 *  minecraft.class06570
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class06639
 *  minecraft.class06672
 *  minecraft.class06851
 *  minecraft.class06918
 *  minecraft.class06959
 *  minecraft.class07049
 *  minecraft.class07085
 *  minecraft.class07211
 *  minecraft.class07311
 *  minecraft.class07438
 *  minecraft.class07688
 *  minecraft.class08036
 *  minecraft.class08476
 *  minecraft.class08800
 *  minecraft.class08943
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.rendering.v1.ArmorRenderer
 *  net.fabricmc.fabric.impl.client.rendering.ArmorRendererRegistryImpl
 *  net.fabricmc.fabric.mixin.client.rendering.LivingEntityRendererAccessor
 *  org.joml.Quaternionfc
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import Nursultan.class10986;
import Nursultan.class10988;
import Nursultan.class11796;
import Nursultan.class11806;
import Nursultan.class11816;
import Nursultan.class11822;
import Nursultan.class11938;
import Nursultan.class12041;
import com.google.common.collect.Lists;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl;
import com.llamalad7.mixinextras.sugar.ref.LocalRef;
import java.util.List;
import me.flashyreese.mods.sodiumextra.client.SodiumExtraClientMod;
import minecraft.class00392;
import minecraft.class00502;
import minecraft.class00734;
import minecraft.class01237;
import minecraft.class01312;
import minecraft.class01384;
import minecraft.class01421;
import minecraft.class01894;
import minecraft.class02058;
import minecraft.class02484;
import minecraft.class02562;
import minecraft.class02566;
import minecraft.class02689;
import minecraft.class02777;
import minecraft.class03662;
import minecraft.class04453;
import minecraft.class04477;
import minecraft.class04507;
import minecraft.class04832;
import minecraft.class04995;
import minecraft.class06078;
import minecraft.class06202;
import minecraft.class06249;
import minecraft.class06252;
import minecraft.class06570;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06639;
import minecraft.class06672;
import minecraft.class06851;
import minecraft.class06918;
import minecraft.class06959;
import minecraft.class07049;
import minecraft.class07085;
import minecraft.class07211;
import minecraft.class07311;
import minecraft.class07438;
import minecraft.class07688;
import minecraft.class08036;
import minecraft.class08476;
import minecraft.class08800;
import minecraft.class08943;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.ArmorRenderer;
import net.fabricmc.fabric.impl.client.rendering.ArmorRendererRegistryImpl;
import net.fabricmc.fabric.mixin.client.rendering.LivingEntityRendererAccessor;
import org.joml.Quaternionfc;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public abstract class class02294<T extends class07438, S extends class08476, M extends class06078<? super S>>
extends class04507<T, S>
implements class06252<S, M>,
class12041,
LivingEntityRendererAccessor {
    private static final float N = 0.1f;
    protected M y;
    protected final class08943 L;
    protected final List<class06249<S, M>> u = Lists.newArrayList();

    public M L() {
        return this.y;
    }

    protected boolean L(S s) {
        return ((class08476)s).NM;
    }

    protected int M(S s) {
        return -1;
    }

    public class02294(class04832 class048322, M m, float f) {
        super(class048322);
        this.L = class048322.y();
        this.y = m;
        this.field_4673 = f;
    }

    private boolean B(class08476 class084762) {
        class10988 class109882 = class10988.N((boolean)class084762.NE, (class07049)((class07049)((class11816)((class11806)class084762).dataManager()).N().N()));
        class11938.L().L((Object)class109882);
        return class109882.y();
    }

    protected float i(S s) {
        return 0.0f;
    }

    protected float method_55831(S s) {
        return super.method_55831(s) * ((class08476)s).NL;
    }

    protected void y(S s, class01421 class014212, float f, float f2) {
        if (this.L(s)) {
            f += (float)(Math.cos((float)class04995.y((float)((class08476)s).P) * 3.25f) * Math.PI * (double)0.4f);
        }
        if (!s.N(class01312.field_18078)) {
            class014212.N((Quaternionfc)class02058.u.N(180.0f - f));
        }
        if (((class08476)s).r > 0.0f) {
            float f3 = (((class08476)s).r - 1.0f) / 20.0f * 1.6f;
            if ((f3 = class04995.N((float)f3)) > 1.0f) {
                f3 = 1.0f;
            }
            class014212.N((Quaternionfc)class02058.R.N(f3 * this.f_()));
        } else if (((class08476)s).Nz) {
            class014212.N((Quaternionfc)class02058.y.N(-90.0f - ((class08476)s).h));
            class014212.N((Quaternionfc)class02058.u.N(((class08476)s).P * -75.0f));
        } else if (s.N(class01312.field_18078)) {
            class07211 class072112 = ((class08476)s).NW;
            float f4 = class072112 != null ? class02294.N(class072112) : f;
            class014212.N((Quaternionfc)class02058.u.N(f4));
            class014212.N((Quaternionfc)class02058.R.N(this.f_()));
            class014212.N((Quaternionfc)class02058.u.N(270.0f));
        } else if (((class08476)s).NR) {
            class014212.N(0.0f, (((class08476)s).T + 0.1f) / f2, 0.0f);
            class014212.N((Quaternionfc)class02058.R.N(180.0f));
        }
    }

    protected boolean y(S s) {
        return true;
    }

    protected class00734 method_62358(T t) {
        class00734 class007342 = super.method_62358(t);
        if (t.method_6118(class07085.field_6169).N(class06570.GQ)) {
            float f = 0.5f;
            return class007342.L(0.5, 0.5, 0.5);
        }
        return class007342;
    }

    protected void y(S s, class01421 class014212) {
    }

    private boolean N(class07438 class074382, class08036 class080362) {
        class10988 class109882 = class10988.N((boolean)class074382.method_5756(class080362), (class07049)class074382);
        class11938.L().L((Object)class109882);
        return class109882.y();
    }

    private int N(int n) {
        class10986 class109862 = class10986.N((int)n);
        class11938.L().L((Object)class109862);
        return class109862.N();
    }

    protected final boolean N(class06249<S, M> class062492) {
        return this.u.add(class062492);
    }

    private boolean N(class06584 class065842, class07085 class070852, Operation operation, class07438 class074382) {
        if (((Boolean)operation.call(new Object[]{class065842, class070852})).booleanValue()) {
            return true;
        }
        ArmorRenderer armorRenderer = ArmorRendererRegistryImpl.get((class06581)class065842.B());
        return armorRenderer != null && !armorRenderer.shouldRenderDefaultHeadItem(class074382, class065842);
    }

    private boolean N(class06584 class065842, class07085 class070852, Operation operation, LocalRef localRef) {
        return this.N(class065842, class070852, operation, (class07438)localRef.get());
    }

    public /* synthetic */ void N(class08476 class084762, class01421 class014212, float f, float f2) {
        this.y(class084762, class014212, f, f2);
    }

    public /* synthetic */ class06078 N() {
        return this.y;
    }

    public /* synthetic */ void N(class08476 class084762, class01421 class014212) {
        this.y(class084762, class014212);
    }

    private void N(class07438 class074382, double d, CallbackInfoReturnable callbackInfoReturnable) {
        if (class074382 instanceof class04477 && !SodiumExtraClientMod.options().renderSettings.playerNameTag) {
            callbackInfoReturnable.setReturnValue((Object)false);
        }
    }

    private void N(class08476 class084762, class01421 class014212, class01237 class012372, class06959 class069592, CallbackInfo callbackInfo) {
        if (class084762 instanceof class02777 && !SodiumExtraClientMod.options().renderSettings.armorStand) {
            callbackInfo.cancel();
            if (class084762.w != null) {
                this.method_3926((class08800)class084762, class014212, class012372, class069592);
            }
        }
    }

    private float N(class07438 class074382, float f) {
        if (class074382 instanceof class04453) {
            return class04995.B((float)f, (float)((Float)((class11796)((class11822)class074382).dataManager()).u().N()).floatValue(), (float)class074382.method_36455());
        }
        return class074382.method_61414(f);
    }

    public void method_62354(T object, S s, float f) {
        class07438 class074382;
        super.method_62354(object, s, f);
        float f2 = class04995.Z((float)f, (float)((class07438)object).fields_5212a028292fd3c078969e3ee4c71d9e8_0.floatValue(), (float)((class07438)object).fields_4212a028292fd3c078969e3ee4c71d9e8_2.floatValue());
        ((class08476)s).x = class02294.N(object, f2, f);
        ((class08476)s).D = class04995.R((float)(f2 - ((class08476)s).x));
        float f3 = f;
        Object object2 = object;
        ((class08476)s).h = this.N((class07438)object2, f3);
        ((class08476)s).NR = this.N((T)object);
        if (((class08476)s).NR) {
            ((class08476)s).h *= -1.0f;
            ((class08476)s).D *= -1.0f;
        }
        if (!object.method_5765() && object.method_5805()) {
            ((class08476)s).NN = ((class07438)object).fields_3212a028292fd3c078969e3ee4c71d9e8_3.L(f);
            ((class08476)s).Ny = ((class07438)object).fields_3212a028292fd3c078969e3ee4c71d9e8_3.y(f);
        } else {
            ((class08476)s).NN = 0.0f;
            ((class08476)s).Ny = 0.0f;
        }
        class07049 class070492 = object.method_5854();
        if (class070492 instanceof class07438) {
            class074382 = (class07438)class070492;
            ((class08476)s).Ns = class074382.fields_3212a028292fd3c078969e3ee4c71d9e8_3.L(f);
        } else {
            ((class08476)s).Ns = ((class08476)s).NN;
        }
        ((class08476)s).NL = object.method_55693();
        ((class08476)s).Nu = object.method_17825();
        ((class08476)s).Nm = object.method_18376();
        ((class08476)s).NW = object.method_18401();
        if (((class08476)s).NW != null) {
            ((class08476)s).b = object.method_18381(class01312.field_18076);
        }
        ((class08476)s).NM = object.method_32314();
        ((class08476)s).NB = object.method_6109();
        ((class08476)s).NZ = object.method_5799();
        ((class08476)s).Nz = object.method_6123();
        ((class08476)s).Ni = object.method_75879(f);
        ((class08476)s).NU = ((class07438)object).fields_2212a028292fd3c078969e3ee4c71d9e8_0 > 0 || ((class07438)object).fields_2212a028292fd3c078969e3ee4c71d9e8_2 > 0;
        class074382 = object.method_6118(class07085.field_6169);
        class06581 class065812 = class074382.B();
        if (class065812 instanceof class06918 && (class065812 = (class070492 = (class06918)class065812).L()) instanceof class07688) {
            class07688 class076882 = (class07688)class065812;
            ((class08476)s).NT = class076882.y();
            ((class08476)s).Nb = (class02689)class074382.method_58694(class02484.Nb);
            ((class08476)s).NP.y();
        } else {
            ((class08476)s).NT = null;
            ((class08476)s).Nb = null;
            class07085 class070852 = class07085.field_6169;
            object2 = class074382;
            Operation operation = objectArray -> {
                WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)2, (String)"[net.minecraft.class_1799, net.minecraft.class_1304]");
                return class02562.N((class06584)((class06584)objectArray[0]), (class07085)((class07085)objectArray[1]));
            };
            LocalRefImpl localRefImpl = new LocalRefImpl();
            localRefImpl.init(object);
            object = (class07438)localRefImpl.dispose();
            if (!this.N((class06584)object2, class070852, operation, (LocalRef)localRefImpl)) {
                this.L.N(((class08476)s).NP, (class06584)class074382, class03662.field_4316, object);
            } else {
                ((class08476)s).NP.y();
            }
        }
        ((class08476)s).r = ((class07438)object).fields_2212a028292fd3c078969e3ee4c71d9e8_2 > 0 ? (float)((class07438)object).fields_2212a028292fd3c078969e3ee4c71d9e8_2.intValue() + f : 0.0f;
        class070492 = class06202.Nq();
        ((class08476)s).NE = ((class08476)s).v && object.method_5756((class08036)((class04453)class070492.T_4));
    }

    protected static boolean N(String string) {
        return "Dinnerbone".equals(string) || "Grumm".equals(string);
    }

    public boolean N(T t) {
        class00392 class003922 = t.method_5797();
        return class003922 != null && class02294.N(class003922.getString());
    }

    protected boolean method_3921(T t, double d) {
        boolean bl;
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N((class07438)t, d, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return callbackInfoReturnable.getReturnValueZ();
        }
        if (t.method_21751()) {
            float f = 32.0f;
            if (d >= 1024.0) {
                return false;
            }
        }
        class06202 class062022 = class06202.Nq();
        T t2 = t;
        class04453 class044532 = (class04453)class062022.T_4;
        class04453 class044533 = class044532;
        boolean bl2 = bl = !this.N((class07438)t2, (class08036)class044533);
        if (t != class044532) {
            class00502 class005022 = t.method_5781();
            class00502 class005023 = class044532.method_5781();
            if (class005022 != null) {
                class06672 class066722 = class005022.U();
                switch (class066722) {
                    case field_1442: {
                        return bl;
                    }
                    case field_1443: {
                        return false;
                    }
                    case field_1444: {
                        return class005023 == null ? bl : class005022.N((class06639)class005023) && (class005022.z() || bl);
                    }
                    case field_1446: {
                        return class005023 == null ? bl : !class005022.N((class06639)class005023) && bl;
                    }
                }
                return true;
            }
        }
        return class06202.NB() && t != class062022.F() && bl && !t.method_5782();
    }

    private static float N(class07211 class072112) {
        switch (class072112) {
            case field_11035: {
                return 90.0f;
            }
            case field_11039: {
                return 0.0f;
            }
            case field_11043: {
                return 270.0f;
            }
            case field_11034: {
                return 180.0f;
            }
        }
        return 0.0f;
    }

    public void method_3936(S s, class01421 class014212, class01237 class012372, class06959 class069592) {
        class07211 class072112;
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        this.N((class08476)s, class014212, class012372, class069592, callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        class014212.N();
        if (s.N(class01312.field_18078) && (class072112 = ((class08476)s).NW) != null) {
            float f = ((class08476)s).b - 0.1f;
            class014212.N((float)(-class072112.P()) * f, 0.0f, (float)(-class072112.T()) * f);
        }
        float f = ((class08476)s).NL;
        class014212.y(f, f, f);
        this.y(s, class014212, ((class08476)s).x, f);
        class014212.y(-1.0f, -1.0f, 1.0f);
        this.y(s, class014212);
        class014212.N(0.0f, -1.501f, 0.0f);
        boolean bl = this.R(s);
        boolean bl2 = !bl && !this.B((class08476)s);
        class07311 class073112 = this.N(s, bl, bl2, s.y());
        if (class073112 != null) {
            int n = class02294.N(s, this.i(s));
            int n2 = bl2 ? this.N(0x26FFFFFF) : -1;
            int n3 = class02566.N((int)n2, (int)this.M(s));
            class012372.N(this.y, s, class014212, class073112, ((class08476)s).G, n, n3, null, ((class08476)s).l, null);
        }
        if (this.y(s) && !this.u.isEmpty()) {
            this.y.method_2819(s);
            for (class06249<S, M> class062492 : this.u) {
                class062492.N(class014212, class012372, ((class08476)s).G, s, ((class08476)s).D, ((class08476)s).h);
            }
        }
        class014212.y();
        super.method_3936(s, class014212, class012372, class069592);
    }

    private static float N(class07438 class074382, float f, float f2) {
        class07049 class070492 = class074382.method_5854();
        if (class070492 instanceof class07438) {
            class07438 class074383 = (class07438)class070492;
            float f3 = class04995.Z((float)f2, (float)class074383.fields_4212a028292fd3c078969e3ee4c71d9e8_1.floatValue(), (float)class074383.fields_4212a028292fd3c078969e3ee4c71d9e8_0.floatValue());
            float f4 = 85.0f;
            float f5 = class04995.N((float)class04995.R((float)(f - f3)), (float)-85.0f, (float)85.0f);
            f3 = f - f5;
            if (Math.abs(f5) > 50.0f) {
                f3 += f5 * 0.2f;
            }
            return f3;
        }
        return class04995.Z((float)f2, (float)class074382.fields_4212a028292fd3c078969e3ee4c71d9e8_1.floatValue(), (float)class074382.fields_4212a028292fd3c078969e3ee4c71d9e8_0.floatValue());
    }

    public abstract class01894 N(S var1);

    public static int N(class08476 class084762, float f) {
        return class01384.N((int)class01384.N((float)f), (int)class01384.N((boolean)class084762.NU));
    }

    public @Nullable class07311 N(S s, boolean bl, boolean bl2, boolean bl3) {
        class01894 class018942 = this.N(s);
        if (bl2) {
            return class06851.Z((class01894)class018942);
        }
        if (bl) {
            return this.y.method_23500(class018942);
        }
        if (bl3) {
            return class06851.j((class01894)class018942);
        }
        return null;
    }

    protected boolean R(S s) {
        return !((class08476)s).v;
    }

    protected float f_() {
        return 90.0f;
    }

    public /* synthetic */ boolean callAddFeature(class06249 class062492) {
        return this.N((T)class062492);
    }
}

