/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  com.viaversion.viafabricplus.features.block.interaction.Block1_14
 *  com.viaversion.viafabricplus.injection.access.block.shape.ICrossCollisionBlock
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
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
 *  minecraft.class06183
 *  minecraft.class06553
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class06788
 *  minecraft.class06942
 *  minecraft.class07050
 *  minecraft.class07082
 *  minecraft.class07188
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class08036
 *  minecraft.class08092
 *  minecraft.class08713
 *  minecraft.class08791
 *  net.raphimc.vialegacy.api.LegacyProtocolVersion
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import com.viaversion.viafabricplus.features.block.interaction.Block1_14;
import com.viaversion.viafabricplus.injection.access.block.shape.ICrossCollisionBlock;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.function.Function;
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
import minecraft.class06183;
import minecraft.class06553;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class06788;
import minecraft.class06942;
import minecraft.class07050;
import minecraft.class07082;
import minecraft.class07188;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class08036;
import minecraft.class08092;
import minecraft.class08713;
import minecraft.class08791;
import net.raphimc.vialegacy.api.LegacyProtocolVersion;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class00730
extends class06788
implements ICrossCollisionBlock {
    public static final MapCodec<class00730> N = class00730.y(class00730::new);
    private final Function<class00500, class00494> B;
    private final class00494[] Z = new class00494[]{class00389.N((double)0.375, (double)0.0, (double)0.375, (double)0.625, (double)1.0, (double)0.625), class00389.N((double)0.375, (double)0.0, (double)0.375, (double)0.625, (double)1.0, (double)1.0), class00389.N((double)0.0, (double)0.0, (double)0.375, (double)0.625, (double)1.0, (double)0.625), class00389.N((double)0.0, (double)0.0, (double)0.375, (double)0.625, (double)1.0, (double)1.0), class00389.N((double)0.375, (double)0.0, (double)0.0, (double)0.625, (double)1.0, (double)0.625), class00389.N((double)0.375, (double)0.0, (double)0.0, (double)0.625, (double)1.0, (double)1.0), class00389.N((double)0.0, (double)0.0, (double)0.0, (double)0.625, (double)1.0, (double)0.625), class00389.N((double)0.0, (double)0.0, (double)0.0, (double)0.625, (double)1.0, (double)1.0), class00389.N((double)0.375, (double)0.0, (double)0.375, (double)1.0, (double)1.0, (double)0.625), class00389.N((double)0.375, (double)0.0, (double)0.375, (double)1.0, (double)1.0, (double)1.0), class00389.N((double)0.0, (double)0.0, (double)0.375, (double)1.0, (double)1.0, (double)0.625), class00389.N((double)0.0, (double)0.0, (double)0.375, (double)1.0, (double)1.0, (double)1.0), class00389.N((double)0.375, (double)0.0, (double)0.0, (double)1.0, (double)1.0, (double)0.625), class00389.N((double)0.375, (double)0.0, (double)0.0, (double)1.0, (double)1.0, (double)1.0), class00389.N((double)0.0, (double)0.0, (double)0.0, (double)1.0, (double)1.0, (double)0.625), class00389.N((double)0.0, (double)0.0, (double)0.0, (double)1.0, (double)1.0, (double)1.0)};
    private final class00494 O = class00891.N((double)0.0, (double)0.0, (double)0.0, (double)16.0, (double)24.0, (double)16.0);
    private class00494[] F;
    private class00494[] A;

    protected class00494 L(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        return this.N(class005002, class072902, class072092, class060922);
    }

    public class00730(class01362 class013622) {
        super(4.0f, 16.0f, 4.0f, 16.0f, 24.0f, class013622);
        this.P((class00500)((class00500)((class00500)((class00500)((class00500)((class00500)this.Q.y()).y((class08092)y, (Comparable)Boolean.valueOf(false))).y((class08092)L, (Comparable)Boolean.valueOf(false))).y((class08092)u, (Comparable)Boolean.valueOf(false))).y((class08092)i, (Comparable)Boolean.valueOf(false))).y((class08092)R, (Comparable)Boolean.valueOf(false)));
        this.B = this.N(4.0f, 16.0f, 2.0f, 6.0f, 15.0f);
        this.N(class013622, null);
    }

    private boolean U(class00500 class005002) {
        return class005002.N(class01210.A) && class005002.N(class01210.U) == this.W().N(class01210.U);
    }

    protected class00494 z(class00500 class005002) {
        return this.B.apply(class005002);
    }

    public class00494 y_4(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(LegacyProtocolVersion.b1_8tob1_8_1)) {
            return this.O;
        }
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(LegacyProtocolVersion.r1_4_6tor1_4_7)) {
            return this.F[this.viaFabricPlus$getShapeIndex(class005002)];
        }
        return super.y_4(class005002, class072902, class072092, class060922);
    }

    private void N(class01362 class013622, CallbackInfo callbackInfo) {
        this.F = this.N(24.0f);
        this.A = this.N(16.0f);
    }

    protected class07082 N(class06584 class065842, class00500 class005002, class07299 class072992, class07209 class072092, class08036 class080362, class07050 class070502, class06183 class061832) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21)) {
            return class065842.N(class06570.Gr) ? class07082.N : class07082.i;
        }
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_10)) {
            return class07082.N;
        }
        return super.N(class065842, class005002, class072992, class072092, class080362, class070502, class061832);
    }

    private class00494[] N(float f) {
        float f2 = 6.0f;
        float f3 = 10.0f;
        float f4 = 6.0f;
        float f5 = 10.0f;
        class00494 class004942 = class00891.N((double)6.0, (double)0.0, (double)6.0, (double)10.0, (double)f, (double)10.0);
        class00494 class004943 = class00891.N((double)6.0, (double)0.0, (double)0.0, (double)10.0, (double)f, (double)10.0);
        class00494 class004944 = class00891.N((double)6.0, (double)0.0, (double)6.0, (double)10.0, (double)f, (double)16.0);
        class00494 class004945 = class00891.N((double)0.0, (double)0.0, (double)6.0, (double)10.0, (double)f, (double)10.0);
        class00494 class004946 = class00891.N((double)6.0, (double)0.0, (double)6.0, (double)16.0, (double)f, (double)10.0);
        class00494[] class00494Array = new class00494[]{class00389.N(), class00891.N((double)6.0, (double)0.0, (double)6.0, (double)10.0, (double)f, (double)16.0), class00891.N((double)0.0, (double)0.0, (double)6.0, (double)10.0, (double)f, (double)10.0), class00891.N((double)0.0, (double)0.0, (double)6.0, (double)10.0, (double)f, (double)16.0), class00891.N((double)6.0, (double)0.0, (double)0.0, (double)10.0, (double)f, (double)10.0), class00389.N((class00494)class004944, (class00494)class004943), class00891.N((double)0.0, (double)0.0, (double)0.0, (double)10.0, (double)f, (double)10.0), class00891.N((double)0.0, (double)0.0, (double)1.0, (double)10.0, (double)f, (double)16.0), class00891.N((double)6.0, (double)0.0, (double)6.0, (double)16.0, (double)f, (double)10.0), class00891.N((double)6.0, (double)0.0, (double)6.0, (double)16.0, (double)f, (double)16.0), class00389.N((class00494)class004945, (class00494)class004946), class00891.N((double)1.0, (double)0.0, (double)6.0, (double)16.0, (double)f, (double)16.0), class00891.N((double)6.0, (double)0.0, (double)0.0, (double)16.0, (double)f, (double)10.0), class00891.N((double)6.0, (double)0.0, (double)0.0, (double)16.0, (double)f, (double)15.0), class00891.N((double)1.0, (double)0.0, (double)0.0, (double)16.0, (double)f, (double)10.0), class00891.N((double)0.0, (double)0.0, (double)0.0, (double)16.0, (double)f, (double)16.0)};
        for (int i = 0; i < 16; ++i) {
            class00494Array[i] = class00389.N((class00494)class004942, (class00494)class00494Array[i]);
        }
        return class00494Array;
    }

    private void N(class00500 class005002, boolean bl, class07211 class072112, CallbackInfoReturnable callbackInfoReturnable) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_14) && !Block1_14.isExceptBlockForAttachWithPiston((class00891)class005002.i())) {
            callbackInfoReturnable.setReturnValue((Object)false);
        }
    }

    public class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(LegacyProtocolVersion.b1_8tob1_8_1)) {
            return class00389.y();
        }
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(LegacyProtocolVersion.r1_4_6tor1_4_7)) {
            return this.A[this.viaFabricPlus$getShapeIndex(class005002)];
        }
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_12_2)) {
            return this.Z[this.viaFabricPlus$getShapeIndex(class005002)];
        }
        return super.N(class005002, class072902, class072092, class060922);
    }

    protected class07082 N(class00500 class005002, class07299 class072992, class07209 class072092, class08036 class080362, class06183 class061832) {
        return !class072992.method_8608() ? class06553.N((class08036)class080362, (class07299)class072992, (class07209)class072092) : class07082.i;
    }

    public boolean N(class00500 class005002, boolean bl, class07211 class072112) {
        class00891 class008912 = class005002.i();
        boolean bl2 = this.U(class005002);
        boolean bl3 = class008912 instanceof class07188 && class07188.N((class00500)class005002, (class07211)class072112);
        boolean bl4 = !class00730.m((class00500)class005002) && bl || bl2 || bl3;
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true, bl4);
        this.N(class005002, bl, class072112, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return callbackInfoReturnable.getReturnValueZ();
        }
        return bl4;
    }

    protected boolean N(class00500 class005002, class08791 class087912) {
        return false;
    }

    public MapCodec<class00730> N() {
        return N;
    }

    public class00500 N(class06942 class069422) {
        class07299 class072992 = class069422.method_8045();
        class07209 class072092 = class069422.method_8037();
        class04688 class046882 = class069422.method_8045().method_8316(class069422.method_8037());
        class07209 class072093 = class072092.method_10095();
        class07209 class072094 = class072092.method_10078();
        class07209 class072095 = class072092.method_10072();
        class07209 class072096 = class072092.method_10067();
        class00500 class005002 = class072992.method_8320(class072093);
        class00500 class005003 = class072992.method_8320(class072094);
        class00500 class005004 = class072992.method_8320(class072095);
        class00500 class005005 = class072992.method_8320(class072096);
        return (class00500)((class00500)((class00500)((class00500)((class00500)super.N(class069422).y((class08092)y, (Comparable)Boolean.valueOf(this.N(class005002, class005002.L((class07290)class072992, class072093, class07211.field_11035), class07211.field_11035)))).y((class08092)L, (Comparable)Boolean.valueOf(this.N(class005003, class005003.L((class07290)class072992, class072094, class07211.field_11039), class07211.field_11039)))).y((class08092)u, (Comparable)Boolean.valueOf(this.N(class005004, class005004.L((class07290)class072992, class072095, class07211.field_11043), class07211.field_11043)))).y((class08092)i, (Comparable)Boolean.valueOf(this.N(class005005, class005005.L((class07290)class072992, class072096, class07211.field_11034), class07211.field_11034)))).y((class08092)R, (Comparable)Boolean.valueOf(class046882.N() == class04684.L));
    }

    protected class00500 N(class00500 class005002, class05487 class054872, class08713 class087132, class07209 class072092, class07211 class072112, class07209 class072093, class00500 class005003, class06069 class060692) {
        if (((Boolean)class005002.L((class08092)R)).booleanValue()) {
            class087132.N(class072092, (class04651)class04684.L, class04684.L.N(class054872));
        }
        if (class072112.z().L()) {
            return (class00500)class005002.y((class08092)M.get(class072112), (Comparable)Boolean.valueOf(this.N(class005003, class005003.L((class07290)class054872, class072093, class072112.b()), class072112.b())));
        }
        return super.N(class005002, class054872, class087132, class072092, class072112, class072093, class005003, class060692);
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{y, L, i, u, R});
    }
}

