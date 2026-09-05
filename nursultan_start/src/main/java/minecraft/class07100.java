/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime
 *  com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalIntRefImpl
 *  com.llamalad7.mixinextras.sugar.ref.LocalIntRef
 *  com.mojang.serialization.MapCodec
 *  com.viaversion.viafabricplus.injection.access.block.shape.ICrossCollisionBlock
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viafabricplus.settings.impl.DebugSettings
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  minecraft.class00389
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00891
 *  minecraft.class01210
 *  minecraft.class01362
 *  minecraft.class04651
 *  minecraft.class04684
 *  minecraft.class04688
 *  minecraft.class05487
 *  minecraft.class06069
 *  minecraft.class06092
 *  minecraft.class06788
 *  minecraft.class06942
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class08092
 *  minecraft.class08713
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalIntRefImpl;
import com.llamalad7.mixinextras.sugar.ref.LocalIntRef;
import com.mojang.serialization.MapCodec;
import com.viaversion.viafabricplus.injection.access.block.shape.ICrossCollisionBlock;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viafabricplus.settings.impl.DebugSettings;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import minecraft.class00389;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00891;
import minecraft.class01210;
import minecraft.class01362;
import minecraft.class04651;
import minecraft.class04684;
import minecraft.class04688;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class06092;
import minecraft.class06788;
import minecraft.class06942;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class08092;
import minecraft.class08713;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class07100
extends class06788
implements ICrossCollisionBlock {
    public static final MapCodec<class07100> B = class07100.y(class07100::new);
    private class00494[] N;
    private class00494[] Z;

    protected class00494 L(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N(class005002, class072902, class072092, class060922, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return (class00494)callbackInfoReturnable.getReturnValue();
        }
        return class00389.N();
    }

    public class07100(class01362 class013622) {
        super(2.0f, 16.0f, 2.0f, 16.0f, 16.0f, class013622);
        this.P((class00500)((class00500)((class00500)((class00500)((class00500)((class00500)this.Q.y()).y((class08092)y, (Comparable)Boolean.valueOf(false))).y((class08092)L, (Comparable)Boolean.valueOf(false))).y((class08092)u, (Comparable)Boolean.valueOf(false))).y((class08092)i, (Comparable)Boolean.valueOf(false))).y((class08092)R, (Comparable)Boolean.valueOf(false)));
        this.N(class013622, null);
    }

    public class00494 y_4(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_8)) {
            return this.Z[this.viaFabricPlus$getShapeIndex(class005002)];
        }
        return super.y_4(class005002, class072902, class072092, class060922);
    }

    protected boolean y(class00500 class005002, class00500 class005003, class07211 class072112) {
        if (class005003.N((class00891)this) || class005003.N(class01210.NP) && class005002.N(class01210.NP) && class005003.y((class08092)M.get(class072112.b()))) {
            if (!class072112.z().L()) {
                return true;
            }
            if (((Boolean)class005002.L((class08092)M.get(class072112))).booleanValue() && ((Boolean)class005003.L((class08092)M.get(class072112.b()))).booleanValue()) {
                return true;
            }
        }
        return super.y(class005002, class005003, class072112);
    }

    private void N(class01362 class013622, CallbackInfo callbackInfo) {
        float f = 7.0f;
        float f2 = 9.0f;
        float f3 = 7.0f;
        float f4 = 9.0f;
        class00494 class004942 = class00891.N((double)7.0, (double)0.0, (double)7.0, (double)9.0, (double)16.0, (double)9.0);
        this.N = new class00494[]{class004942, class00891.N((double)7.0, (double)0.0, (double)7.0, (double)9.0, (double)16.0, (double)16.0), class00891.N((double)0.0, (double)0.0, (double)7.0, (double)9.0, (double)16.0, (double)9.0), class00891.N((double)0.0, (double)0.0, (double)7.0, (double)9.0, (double)16.0, (double)16.0), class00891.N((double)7.0, (double)0.0, (double)0.0, (double)9.0, (double)16.0, (double)9.0), class00891.N((double)7.0, (double)0.0, (double)0.0, (double)9.0, (double)16.0, (double)16.0), class00891.N((double)0.0, (double)0.0, (double)0.0, (double)9.0, (double)16.0, (double)9.0), class00891.N((double)0.0, (double)0.0, (double)0.0, (double)9.0, (double)16.0, (double)16.0), class00891.N((double)7.0, (double)0.0, (double)7.0, (double)16.0, (double)16.0, (double)9.0), class00891.N((double)7.0, (double)0.0, (double)7.0, (double)16.0, (double)16.0, (double)16.0), class00891.N((double)0.0, (double)0.0, (double)7.0, (double)16.0, (double)16.0, (double)9.0), class00891.N((double)0.0, (double)0.0, (double)7.0, (double)16.0, (double)16.0, (double)16.0), class00891.N((double)7.0, (double)0.0, (double)0.0, (double)16.0, (double)16.0, (double)9.0), class00891.N((double)7.0, (double)0.0, (double)0.0, (double)16.0, (double)16.0, (double)16.0), class00891.N((double)0.0, (double)0.0, (double)0.0, (double)16.0, (double)16.0, (double)9.0), class00389.y()};
        class00494 class004943 = class00891.N((double)7.0, (double)0.0, (double)0.0, (double)9.0, (double)16.0, (double)8.0);
        class00494 class004944 = class00891.N((double)7.0, (double)0.0, (double)8.0, (double)9.0, (double)16.0, (double)16.0);
        class00494 class004945 = class00891.N((double)0.0, (double)0.0, (double)7.0, (double)8.0, (double)16.0, (double)9.0);
        class00494 class004946 = class00891.N((double)8.0, (double)0.0, (double)7.0, (double)16.0, (double)16.0, (double)9.0);
        class00494 class004947 = class00389.N((class00494)class004943, (class00494)class004946);
        class00494 class004948 = class00389.N((class00494)class004944, (class00494)class004945);
        this.Z = new class00494[]{class004942, class004944, class004945, class004948, class004943, class00389.N((class00494)class004944, (class00494)class004943), class00389.N((class00494)class004945, (class00494)class004943), class00389.N((class00494)class004948, (class00494)class004943), class004946, class00389.N((class00494)class004944, (class00494)class004946), class00389.N((class00494)class004945, (class00494)class004946), class00389.N((class00494)class004948, (class00494)class004946), class004947, class00389.N((class00494)class004944, (class00494)class004947), class00389.N((class00494)class004945, (class00494)class004947), class00389.N((class00494)class004948, (class00494)class004947)};
    }

    public class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        if (DebugSettings.INSTANCE.legacyPaneOutlines.isEnabled()) {
            return this.N[this.viaFabricPlus$getShapeIndex(class005002)];
        }
        return super.N(class005002, class072902, class072092, class060922);
    }

    public MapCodec<? extends class07100> N() {
        return B;
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{y, L, i, u, R});
    }

    public final boolean N(class00500 class005002, boolean bl) {
        return !class07100.m((class00500)class005002) && bl || class005002.i() instanceof class07100 || class005002.N(class01210.q);
    }

    protected class00500 N(class00500 class005002, class05487 class054872, class08713 class087132, class07209 class072092, class07211 class072112, class07209 class072093, class00500 class005003, class06069 class060692) {
        if (((Boolean)class005002.L((class08092)R)).booleanValue()) {
            class087132.N(class072092, (class04651)class04684.L, class04684.L.N(class054872));
        }
        if (class072112.z().L()) {
            return (class00500)class005002.y((class08092)M.get(class072112), (Comparable)Boolean.valueOf(this.N(class005003, class005003.L((class07290)class054872, class072093, class072112.b()))));
        }
        return super.N(class005002, class054872, class087132, class072092, class072112, class072093, class005003, class060692);
    }

    public class00500 N(class06942 class069422) {
        LocalIntRefImpl localIntRefImpl = new LocalIntRefImpl();
        localIntRefImpl.init(0);
        class07299 class072992 = class069422.method_8045();
        class07209 class072092 = class069422.method_8037();
        class04688 class046882 = class069422.method_8045().method_8316(class069422.method_8037());
        class07209 class072093 = class072092.method_10095();
        class07209 class072094 = class072092.method_10072();
        class07209 class072095 = class072092.method_10067();
        class07209 class072096 = class072092.method_10078();
        class00500 class005002 = class072992.method_8320(class072093);
        class00500 class005003 = class072992.method_8320(class072094);
        class00500 class005004 = class072992.method_8320(class072095);
        class00500 class005005 = class072992.method_8320(class072096);
        boolean bl = class005002.L((class07290)class072992, class072093, class07211.field_11035);
        class00500 class005006 = class005002;
        class07100 class071002 = this;
        class00500 class005007 = (class00500)this.W().y((class08092)y, (Comparable)Boolean.valueOf(this.N(class071002, class005006, bl, objectArray -> {
            WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)3, (String)"[net.minecraft.class_2389, net.minecraft.class_2680, boolean]");
            Object[] objectArray2 = objectArray;
            return ((class07100)((Object)((Object)objectArray[0]))).N((class00500)objectArray2[1], (Boolean)objectArray2[2]);
        }, (LocalIntRef)localIntRefImpl)));
        bl = class005003.L((class07290)class072992, class072094, class07211.field_11043);
        class005006 = class005003;
        class071002 = this;
        class00500 class005008 = (class00500)class005007.y((class08092)u, (Comparable)Boolean.valueOf(this.N(class071002, class005006, bl, objectArray -> {
            WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)3, (String)"[net.minecraft.class_2389, net.minecraft.class_2680, boolean]");
            Object[] objectArray2 = objectArray;
            return ((class07100)((Object)((Object)objectArray[0]))).N((class00500)objectArray2[1], (Boolean)objectArray2[2]);
        }, (LocalIntRef)localIntRefImpl)));
        bl = class005004.L((class07290)class072992, class072095, class07211.field_11034);
        class005006 = class005004;
        class071002 = this;
        class00500 class005009 = (class00500)class005008.y((class08092)i, (Comparable)Boolean.valueOf(this.N(class071002, class005006, bl, objectArray -> {
            WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)3, (String)"[net.minecraft.class_2389, net.minecraft.class_2680, boolean]");
            Object[] objectArray2 = objectArray;
            return ((class07100)((Object)((Object)objectArray[0]))).N((class00500)objectArray2[1], (Boolean)objectArray2[2]);
        }, (LocalIntRef)localIntRefImpl)));
        bl = class005005.L((class07290)class072992, class072096, class07211.field_11039);
        class005006 = class005005;
        class071002 = this;
        class00500 class0050010 = (class00500)((class00500)class005009.y((class08092)L, (Comparable)Boolean.valueOf(this.N(class071002, class005006, bl, objectArray -> {
            WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)3, (String)"[net.minecraft.class_2389, net.minecraft.class_2680, boolean]");
            Object[] objectArray2 = objectArray;
            return ((class07100)((Object)((Object)objectArray[0]))).N((class00500)objectArray2[1], (Boolean)objectArray2[2]);
        }, (LocalIntRef)localIntRefImpl)))).y((class08092)R, (Comparable)Boolean.valueOf(class046882.N() == class04684.L));
        class00500 class0050011 = class0050010;
        class0050011 = new CallbackInfoReturnable("", true, (Object)class0050011);
        this.N(class069422, (CallbackInfoReturnable)class0050011, (LocalIntRef)localIntRefImpl);
        if (class0050011.isCancelled()) {
            return (class00500)class0050011.getReturnValue();
        }
        return class0050010;
    }

    private boolean N(class07100 class071002, class00500 class005002, boolean bl, Operation operation, LocalIntRef localIntRef) {
        boolean bl2 = (Boolean)operation.call(new Object[]{class071002, class005002, bl});
        if (bl2) {
            localIntRef.set(localIntRef.get() + 1);
        }
        return bl2;
    }

    private void N(class06942 class069422, CallbackInfoReturnable callbackInfoReturnable, LocalIntRef localIntRef) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_8) && localIntRef.get() == 0) {
            callbackInfoReturnable.setReturnValue((Object)((class00500)((class00500)((class00500)((class00500)((class00500)callbackInfoReturnable.getReturnValue()).y((class08092)y, (Comparable)Boolean.valueOf(true))).y((class08092)u, (Comparable)Boolean.valueOf(true))).y((class08092)i, (Comparable)Boolean.valueOf(true))).y((class08092)L, (Comparable)Boolean.valueOf(true))));
        }
    }

    private void N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922, CallbackInfoReturnable callbackInfoReturnable) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_15_2)) {
            callbackInfoReturnable.setReturnValue((Object)this.y_4(class005002, class072902, class072092, class060922));
        }
    }
}

