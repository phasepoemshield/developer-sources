/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10949
 *  Nursultan.class10977
 *  Nursultan.class11394
 *  Nursultan.class11938
 *  com.google.common.base.MoreObjects
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime
 *  com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalFloatRefImpl
 *  com.llamalad7.mixinextras.sugar.ref.LocalFloatRef
 *  com.viaversion.viafabricplus.visuals.settings.VisualSettings
 *  minecraft.class01083
 *  minecraft.class01237
 *  minecraft.class01384
 *  minecraft.class01421
 *  minecraft.class01422
 *  minecraft.class01781
 *  minecraft.class01894
 *  minecraft.class02058
 *  minecraft.class02265
 *  minecraft.class02477
 *  minecraft.class02484
 *  minecraft.class03386
 *  minecraft.class03448
 *  minecraft.class03662
 *  minecraft.class04453
 *  minecraft.class04477
 *  minecraft.class04790
 *  minecraft.class04995
 *  minecraft.class06202
 *  minecraft.class06493
 *  minecraft.class06509
 *  minecraft.class06548
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class06593
 *  minecraft.class06733
 *  minecraft.class06851
 *  minecraft.class06918
 *  minecraft.class07050
 *  minecraft.class07070
 *  minecraft.class07299
 *  minecraft.class07311
 *  minecraft.class07438
 *  minecraft.class07769
 *  minecraft.class08030
 *  minecraft.class08036
 *  minecraft.class08133
 *  minecraft.class08270
 *  minecraft.class08287
 *  minecraft.class08898
 *  minecraft.class08943
 *  minecraft.class08961
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.irisshaders.iris.Iris
 *  net.irisshaders.iris.mixinterface.ItemInHandInterface
 *  net.irisshaders.iris.pathways.HandRenderer
 *  org.joml.Quaternionfc
 *  org.joml.Vector4f
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import Nursultan.class10949;
import Nursultan.class10977;
import Nursultan.class11394;
import Nursultan.class11938;
import com.google.common.base.MoreObjects;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalFloatRefImpl;
import com.llamalad7.mixinextras.sugar.ref.LocalFloatRef;
import com.viaversion.viafabricplus.visuals.settings.VisualSettings;
import minecraft.class01083;
import minecraft.class01237;
import minecraft.class01384;
import minecraft.class01421;
import minecraft.class01422;
import minecraft.class01781;
import minecraft.class01894;
import minecraft.class02058;
import minecraft.class02265;
import minecraft.class02477;
import minecraft.class02484;
import minecraft.class03070;
import minecraft.class03386;
import minecraft.class03448;
import minecraft.class03662;
import minecraft.class04453;
import minecraft.class04477;
import minecraft.class04790;
import minecraft.class04995;
import minecraft.class06202;
import minecraft.class06493;
import minecraft.class06509;
import minecraft.class06548;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class06593;
import minecraft.class06733;
import minecraft.class06851;
import minecraft.class06918;
import minecraft.class07050;
import minecraft.class07070;
import minecraft.class07299;
import minecraft.class07311;
import minecraft.class07438;
import minecraft.class07769;
import minecraft.class08030;
import minecraft.class08036;
import minecraft.class08133;
import minecraft.class08270;
import minecraft.class08287;
import minecraft.class08898;
import minecraft.class08943;
import minecraft.class08961;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.mixinterface.ItemInHandInterface;
import net.irisshaders.iris.pathways.HandRenderer;
import org.joml.Quaternionfc;
import org.joml.Vector4f;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(value=EnvType.CLIENT)
public class class03049
implements ItemInHandInterface {
    private static final class07311 N = class06851.n((class01894)class01894.y((String)"textures/map/map_background.png"));
    private static final class07311 y = class06851.n((class01894)class01894.y((String)"textures/map/map_background_checkerboard.png"));
    private static final float L = -0.4f;
    private static final float u = 0.2f;
    private static final float i = -0.2f;
    private static final float R = -0.6f;
    private static final float M = 0.56f;
    private static final float B = -0.52f;
    private static final float Z = -0.72f;
    private static final float z = 45.0f;
    private static final float U = -80.0f;
    private static final float E = -20.0f;
    private static final float W = -20.0f;
    private static final float m = 10.0f;
    private static final float P = 90.0f;
    private static final float s = 30.0f;
    private static final float T = 0.6f;
    private static final float b = -0.5f;
    private static final float j = 0.0f;
    private static final double v = 27.0;
    private static final float n = 0.8f;
    private static final float t = 0.1f;
    private static final float G = -0.3f;
    private static final float l = 0.4f;
    private static final float d = -0.4f;
    private static final float w = 70.0f;
    private static final float k = -20.0f;
    private static final float Y = -0.6f;
    private static final float Q = 0.8f;
    private static final float O = 0.8f;
    private static final float g = -0.75f;
    private static final float I = -0.9f;
    private static final float J = 45.0f;
    private static final float o = -1.0f;
    private static final float q = 3.6f;
    private static final float K = 3.5f;
    private static final float V = 5.6f;
    private static final int e = 200;
    private static final int H = -135;
    private static final int c = 120;
    private static final float X = -0.4f;
    private static final float a = -0.2f;
    private static final float p = 0.0f;
    private static final float F = 0.04f;
    private static final float A = -0.72f;
    private static final float f = -1.2f;
    private static final float C = -0.5f;
    private static final float S = 45.0f;
    private static final float x = -85.0f;
    private static final float D = 45.0f;
    private static final float h = 92.0f;
    private static final float r = -41.0f;
    private static final float NN = 0.3f;
    private static final float Ny = -1.1f;
    private static final float NL = 0.45f;
    private static final float Nu = 20.0f;
    private static final float Ni = 0.38f;
    private static final float NR = -0.5f;
    private static final float NM = -0.5f;
    private static final float NB = 0.0f;
    private static final float NZ = 0.0078125f;
    private static final int Nz = 7;
    private static final int NU = 128;
    private static final int NE = 128;
    private static final float NW = 0.0f;
    private static final float Nm = 0.0f;
    private static final float NP = 0.04f;
    private static final float Ns = 0.0f;
    private static final float NT = 0.004f;
    private static final float Nb = 0.0f;
    private static final float Nj = 0.2f;
    private static final float Nv = 0.1f;
    private final class06202 Nn;
    private final class08270 Nt = new class08270();
    private class06584 NG = class06584.E;
    private class06584 Nl = class06584.E;
    private float Nd;
    private float Nw;
    private float Nk;
    private float NY;
    private final class01781 NQ;
    private final class08943 NO;
    private HandRenderer Ng;
    private class11394 NI;
    private class10949 NJ;

    private void L(class04477 class044772, float f, float f2, class07050 class070502, float f3, class06584 class065842, float f4, class01421 class014212, class01237 class012372, int n, CallbackInfo callbackInfo) {
        this.NJ = class10949.N((Vector4f)new Vector4f(0.0f, 0.0f, 0.0f, 1.0f), (Vector4f)new Vector4f(0.0f, 0.0f, 0.0f, 1.0f));
        class11938.L().L((Object)this.NJ);
        Vector4f vector4f = this.N(class044772, class070502) == class07070.field_6183 ? this.NJ.y() : this.NJ.N();
        class014212.N(vector4f.x(), vector4f.y(), vector4f.z());
    }

    public class03049(class06202 class062022, class01781 class017812, class08943 class089432) {
        this.Nn = class062022;
        this.NQ = class017812;
        this.NO = class089432;
    }

    private void i(class04477 class044772, float f, float f2, class07050 class070502, float f3, class06584 class065842, float f4, class01421 class014212, class01237 class012372, int n, CallbackInfo callbackInfo) {
        this.N(class044772, class070502, f3, class014212);
    }

    private void u(class04477 class044772, float f, float f2, class07050 class070502, float f3, class06584 class065842, float f4, class01421 class014212, class01237 class012372, int n, CallbackInfo callbackInfo) {
        if (this.NJ != null) {
            Vector4f vector4f = this.N(class044772, class070502) == class07070.field_6183 ? this.NJ.y() : this.NJ.N();
            class014212.y(vector4f.w(), vector4f.w(), vector4f.w());
        }
    }

    private static class03070 y(class04453 class044532) {
        class06584 class065842 = class044532.method_6030();
        class07050 class070502 = class044532.method_6058();
        if (class065842.N(class06570.sx) || class065842.N(class06570.dw)) {
            return class03070.N(class070502);
        }
        return class070502 == class07050.field_5808 && class03049.N(class044532.method_6079()) ? class03070.field_28385 : class03070.field_28384;
    }

    private void y(class01421 class014212, class07070 class070702, float f) {
        int n = class070702 == class07070.field_6183 ? 1 : -1;
        class014212.N((float)n * 0.56f, -0.52f + f * -0.6f, -0.72f);
    }

    private void y(class04477 class044772, float f, float f2, class07050 class070502, float f3, class06584 class065842, float f4, class01421 class014212, class01237 class012372, int n, CallbackInfo callbackInfo) {
        if (!class11938.u().S().N(class070502)) {
            callbackInfo.cancel();
        }
    }

    private float y(class04453 class044532, float f) {
        return this.NI.N();
    }

    private void N(class04477 class044772, float f, float f2, class07050 class070502, float f3, class06584 class065842, float f4, class01421 class014212, class01237 class012372, int n, CallbackInfo callbackInfo) {
        if (Iris.isPackInUseQuick()) {
            if (HandRenderer.INSTANCE.isRenderingSolid() && HandRenderer.INSTANCE.isHandTranslucent(class070502)) {
                callbackInfo.cancel();
            } else if (!HandRenderer.INSTANCE.isRenderingSolid() && !HandRenderer.INSTANCE.isHandTranslucent(class070502)) {
                callbackInfo.cancel();
            }
        }
    }

    private boolean N(class08133 class081332) {
        return this.Ng == null;
    }

    private void N(class01422 class014222, Operation operation) {
        if (this.Ng == null) {
            operation.call(new Object[]{class014222});
        } else {
            this.Ng.endRender();
        }
    }

    private void N(class03049 class030492, float f, class01421 class014212, int n, class07070 class070702, LocalFloatRef localFloatRef) {
        this.N(class030492, f, class014212, n, class070702, localFloatRef.get());
    }

    private void N(CallbackInfo callbackInfo) {
        class06584 class065842 = ((class04453)this.Nn.T_4).method_6047();
        if (this.NG.B() == class065842.B() && !this.NG.B().allowComponentsUpdateAnimation((class08036)((class04453)this.Nn.T_4), class07050.field_5808, this.NG, class065842)) {
            this.NG = class065842;
        }
        class06584 class065843 = ((class04453)this.Nn.T_4).method_6079();
        if (this.Nl.B() == class065843.B() && !this.Nl.B().allowComponentsUpdateAnimation((class08036)((class04453)this.Nn.T_4), class07050.field_5810, this.Nl, class065843)) {
            this.Nl = class065843;
        }
    }

    private void N(float f, class01421 class014212, class01237 class012372, class04453 class044532, int n, CallbackInfo callbackInfo) {
        this.NI = class11394.N((float)class044532.method_36454(), (float)class044532.method_36455());
        class11938.L().L((Object)this.NI);
    }

    private class07070 N(class04477 class044772, class07050 class070502) {
        return class070502 == class07050.field_5808 ? class044772.method_6068() : class044772.method_6068().N();
    }

    private float N(class04453 class044532, float f) {
        return this.NI.y();
    }

    private void N(class04477 class044772, float f, float f2, class07050 class070502, float f3, class06584 class065842, float f4, class01421 class014212, class01237 class012372, int n, CallbackInfo callbackInfo, class06509 class065092) {
        if (class065092 == class06509.field_8953 || class065092 == class06509.field_8949) {
            this.N(class044772, class070502, f3, class014212);
        }
    }

    private void N(class03049 class030492, float f, class01421 class014212, int n, class07070 class070702, float f2) {
        class014212.N((float)(-n) * 0.56f, 0.52f + f2 * 0.6f, 0.72f);
        class10977 class109772 = class10977.N((class07070)class070702, (class01421)class014212, (float)f, (float)0.0f);
        class11938.L().L((Object)class109772);
        if (!class109772.y()) {
            class014212.N((float)n * 0.56f, -0.52f + f2 * -0.6f, -0.72f);
            this.N(f, class014212, n, class070702);
        }
    }

    private void N(class04477 class044772, class07050 class070502, float f, class01421 class014212) {
        if (VisualSettings.INSTANCE.swingHandOnItemUse.isEnabled()) {
            class07070 class070702 = class070502 == class07050.field_5808 ? class044772.method_6068() : class044772.method_6068().N();
            this.N(class014212, class070702, f);
        }
    }

    private void N(class01421 class014212, class01237 class012372, int n, class06584 class065842) {
        class014212.N((Quaternionfc)class02058.u.N(180.0f));
        class014212.N((Quaternionfc)class02058.R.N(180.0f));
        class014212.y(0.38f, 0.38f, 0.38f);
        class014212.N(-0.5f, -0.5f, 0.0f);
        class014212.y(0.0078125f, 0.0078125f, 0.0078125f);
        class02265 class022652 = (class02265)class065842.method_58694(class02484.f);
        class07769 class077692 = class06548.N((class02265)class022652, (class07299)((class03448)this.Nn.T_3));
        class07311 class073112 = class077692 == null ? N : y;
        class012372.N(class014212, class073112, (class014232, class013912) -> {
            class013912.N(class014232, -7.0f, 135.0f, 0.0f).method_39415(-1).method_22913(0.0f, 1.0f).method_60803(n);
            class013912.N(class014232, 135.0f, 135.0f, 0.0f).method_39415(-1).method_22913(1.0f, 1.0f).method_60803(n);
            class013912.N(class014232, 135.0f, -7.0f, 0.0f).method_39415(-1).method_22913(1.0f, 0.0f).method_60803(n);
            class013912.N(class014232, -7.0f, -7.0f, 0.0f).method_39415(-1).method_22913(0.0f, 0.0f).method_60803(n);
        });
        if (class077692 != null) {
            class01083 class010832 = this.Nn.yR();
            class010832.N(class022652, class077692, this.Nt);
            class010832.N(this.Nt, class014212, class012372, false, n);
        }
    }

    private void N(class01421 class014212, class01237 class012372, int n, float f, float f2, class07070 class070702) {
        boolean bl = class070702 != class07070.field_6182;
        float f3 = bl ? 1.0f : -1.0f;
        float f4 = class04995.N((float)f2);
        float f5 = -0.3f * class04995.m((double)(f4 * (float)Math.PI));
        float f6 = 0.4f * class04995.m((double)(f4 * ((float)Math.PI * 2)));
        float f7 = -0.4f * class04995.m((double)(f2 * (float)Math.PI));
        class014212.N(f3 * (f5 + 0.64000005f), f6 + -0.6f + f * -0.6f, f7 + -0.71999997f);
        class014212.N((Quaternionfc)class02058.u.N(f3 * 45.0f));
        float f8 = class04995.m((double)(f2 * f2 * (float)Math.PI));
        float f9 = class04995.m((double)(f4 * (float)Math.PI));
        class014212.N((Quaternionfc)class02058.u.N(f3 * f9 * 70.0f));
        class014212.N((Quaternionfc)class02058.R.N(f3 * f8 * -20.0f));
        class04453 class044532 = (class04453)this.Nn.T_4;
        class014212.N(f3 * -1.0f, 3.6f, 3.5f);
        class014212.N((Quaternionfc)class02058.R.N(f3 * 120.0f));
        class014212.N((Quaternionfc)class02058.y.N(200.0f));
        class014212.N((Quaternionfc)class02058.u.N(f3 * -135.0f));
        class014212.N(f3 * 5.6f, 0.0f, 0.0f);
        class08287 var16 = this.NQ.N((class04477)class044532);
        class01894 class018942 = class044532.Z().N().y();
        if (bl) {
            var16.N(class014212, class012372, n, class018942, class044532.method_74091(class08030.field_7570));
        } else {
            var16.y(class014212, class012372, n, class018942, class044532.method_74091(class08030.field_7568));
        }
    }

    private void N(class01421 class014212, float f, class07070 class070702, class06584 class065842, class08036 class080362) {
        float f2;
        float f3 = (float)class080362.method_6014() - f + 1.0f;
        float f4 = f3 / (float)class065842.N((class07438)class080362);
        if (f4 < 0.8f) {
            f2 = class04995.L((float)(class04995.P((double)(f3 / 4.0f * (float)Math.PI)) * 0.1f));
            class014212.N(0.0f, f2, 0.0f);
        }
        f2 = 1.0f - (float)Math.pow(f4, 27.0);
        int n = class070702 == class07070.field_6183 ? 1 : -1;
        class014212.N(f2 * 0.6f * (float)n, f2 * -0.5f, f2 * 0.0f);
        class014212.N((Quaternionfc)class02058.u.N((float)n * f2 * 90.0f));
        class014212.N((Quaternionfc)class02058.y.N(f2 * 10.0f));
        class014212.N((Quaternionfc)class02058.R.N((float)n * f2 * 30.0f));
    }

    private void N(class01421 class014212, float f, class07070 class070702, class08036 class080362) {
        float f2 = (float)(class080362.method_6014() % 10) - f + 1.0f;
        float f3 = 1.0f - f2 / 10.0f;
        float f4 = -90.0f;
        float f5 = 60.0f;
        float f6 = 150.0f;
        float f7 = -15.0f;
        int n = 2;
        float f8 = -15.0f + 75.0f * class04995.P((double)(f3 * 2.0f * (float)Math.PI));
        if (class070702 != class07070.field_6183) {
            class014212.N(0.1, 0.83, 0.35);
            class014212.N((Quaternionfc)class02058.y.N(-80.0f));
            class014212.N((Quaternionfc)class02058.u.N(-90.0f));
            class014212.N((Quaternionfc)class02058.y.N(f8));
            class014212.N(-0.3, 0.22, 0.35);
        } else {
            class014212.N(-0.25, 0.22, 0.35);
            class014212.N((Quaternionfc)class02058.y.N(-80.0f));
            class014212.N((Quaternionfc)class02058.u.N(90.0f));
            class014212.N((Quaternionfc)class02058.R.N(0.0f));
            class014212.N((Quaternionfc)class02058.y.N(f8));
        }
    }

    private void N(class01421 class014212, class07070 class070702, float f) {
        int n = class070702 == class07070.field_6183 ? 1 : -1;
        float f2 = class04995.m((double)(f * f * (float)Math.PI));
        class014212.N((Quaternionfc)class02058.u.N((float)n * (45.0f + f2 * -20.0f)));
        float f3 = class04995.m((double)(class04995.N((float)f) * (float)Math.PI));
        class014212.N((Quaternionfc)class02058.R.N((float)n * f3 * -20.0f));
        class014212.N((Quaternionfc)class02058.y.N(f3 * -80.0f));
        class014212.N((Quaternionfc)class02058.u.N((float)n * -45.0f));
    }

    public void N(class07438 class074382, class06584 class065842, class03662 class036622, class01421 class014212, class01237 class012372, int n) {
        if (class065842.R()) {
            return;
        }
        class08898 class088982 = new class08898();
        this.NO.N(class088982, class065842, class036622, class074382.method_73183(), (class08961)class074382, class074382.method_5628() + class036622.ordinal());
        class088982.N(class014212, class012372, n, class01384.u, 0);
    }

    private float N(float f) {
        float f2 = 1.0f - f / 45.0f + 0.1f;
        f2 = class04995.N((float)f2, (float)0.0f, (float)1.0f);
        f2 = -class04995.P((double)(f2 * (float)Math.PI)) * 0.5f + 0.5f;
        return f2;
    }

    private void N(class01421 class014212, class01237 class012372, int n, class07070 class070702) {
        class08287 var5 = this.NQ.N((class04477)((class04453)this.Nn.T_4));
        class014212.N();
        float f = class070702 == class07070.field_6183 ? 1.0f : -1.0f;
        class014212.N((Quaternionfc)class02058.u.N(92.0f));
        class014212.N((Quaternionfc)class02058.y.N(45.0f));
        class014212.N((Quaternionfc)class02058.R.N(f * -41.0f));
        class014212.N(f * 0.3f, -1.1f, 0.45f);
        class01894 class018942 = ((class04453)this.Nn.T_4).Z().N().y();
        if (class070702 == class07070.field_6183) {
            var5.N(class014212, class012372, n, class018942, ((class04453)this.Nn.T_4).method_74091(class08030.field_7570));
        } else {
            var5.y(class014212, class012372, n, class018942, ((class04453)this.Nn.T_4).method_74091(class08030.field_7568));
        }
        class014212.y();
    }

    private void N(class01421 class014212, class01237 class012372, int n, float f, class07070 class070702, float f2, class06584 class065842) {
        float f3 = class070702 == class07070.field_6183 ? 1.0f : -1.0f;
        class014212.N(f3 * 0.125f, -0.125f, 0.0f);
        if (!((class04453)this.Nn.T_4).method_5767()) {
            class014212.N();
            class014212.N((Quaternionfc)class02058.R.N(f3 * 10.0f));
            this.N(class014212, class012372, n, f, f2, class070702);
            class014212.y();
        }
        class014212.N();
        class014212.N(f3 * 0.51f, -0.08f + f * -1.2f, -0.75f);
        float f4 = class04995.N((float)f2);
        float f5 = class04995.m((double)(f4 * (float)Math.PI));
        float f6 = -0.5f * f5;
        float f7 = 0.4f * class04995.m((double)(f4 * ((float)Math.PI * 2)));
        float f8 = -0.3f * class04995.m((double)(f2 * (float)Math.PI));
        class014212.N(f3 * f6, f7 - 0.3f * f5, f8);
        class014212.N((Quaternionfc)class02058.y.N(f5 * -45.0f));
        class014212.N((Quaternionfc)class02058.u.N(f3 * f5 * -30.0f));
        this.N(class014212, class012372, n, class065842);
        class014212.y();
    }

    private void N(class01421 class014212, class01237 class012372, int n, float f, float f2, float f3) {
        float f4 = class04995.N((float)f3);
        float f5 = -0.2f * class04995.m((double)(f3 * (float)Math.PI));
        float f6 = -0.4f * class04995.m((double)(f4 * (float)Math.PI));
        class014212.N(0.0f, -f5 / 2.0f, f6);
        float f7 = this.N(f);
        class014212.N(0.0f, 0.04f + f2 * -1.2f + f7 * -0.5f, -0.72f);
        class014212.N((Quaternionfc)class02058.y.N(f7 * -85.0f));
        if (!((class04453)this.Nn.T_4).method_5767()) {
            class014212.N();
            class014212.N((Quaternionfc)class02058.u.N(90.0f));
            this.N(class014212, class012372, n, class07070.field_6183);
            this.N(class014212, class012372, n, class07070.field_6182);
            class014212.y();
        }
        float f8 = class04995.m((double)(f4 * (float)Math.PI));
        class014212.N((Quaternionfc)class02058.y.N(f8 * 20.0f));
        class014212.y(2.0f, 2.0f, 2.0f);
        this.N(class014212, class012372, n, this.NG);
    }

    private void N(float f, class01421 class014212, int n, class07070 class070702) {
        float f2 = -0.4f * class04995.m((double)(class04995.N((float)f) * (float)Math.PI));
        float f3 = 0.2f * class04995.m((double)(class04995.N((float)f) * ((float)Math.PI * 2)));
        float f4 = -0.2f * class04995.m((double)(f * (float)Math.PI));
        class014212.N((float)n * f2, f3, f4);
        this.N(class014212, class070702, f);
    }

    public void N(class07050 class070502) {
        if (class070502 == class07050.field_5808) {
            this.Nd = 0.0f;
        } else {
            this.Nk = 0.0f;
        }
    }

    private boolean N(class06584 class065842, class06584 class065843) {
        if (class06584.N((class06584)class065842, (class06584)class065843, class02477::i)) {
            return true;
        }
        return !this.NO.N(class065843);
    }

    public void N() {
        this.N((CallbackInfo)null);
        this.Nw = this.Nd;
        this.NY = this.Nk;
        class04453 class044532 = (class04453)this.Nn.T_4;
        class06584 class065842 = class044532.method_6047();
        class06584 class065843 = class044532.method_6079();
        if (this.N(this.NG, class065842)) {
            this.NG = class065842;
        }
        if (this.N(this.Nl, class065843)) {
            this.Nl = class065843;
        }
        if (class044532.n()) {
            this.Nd = class04995.N((float)(this.Nd - 0.4f), (float)0.0f, (float)1.0f);
            this.Nk = class04995.N((float)(this.Nk - 0.4f), (float)0.0f, (float)1.0f);
        } else {
            float f = class044532.method_75194(1.0f);
            float f2 = this.NG != class065842 ? 0.0f : f * f * f;
            float f3 = this.Nl != class065843 ? 0.0f : 1.0f;
            this.Nd += class04995.N((float)(f2 - this.Nd), (float)-0.4f, (float)0.4f);
            this.Nk += class04995.N((float)(f3 - this.Nk), (float)-0.4f, (float)0.4f);
        }
        if (this.Nd < 0.1f) {
            this.NG = class065842;
        }
        if (this.Nk < 0.1f) {
            this.Nl = class065843;
        }
    }

    public void N(float f, class01421 class014212, class01237 class012372, class04453 class044532, int n) {
        float f2;
        float f3;
        this.N(f, class014212, class012372, class044532, n, null);
        float f4 = class044532.method_6055(f);
        class07050 class070502 = (class07050)MoreObjects.firstNonNull((Object)class044532.fields_0212a028292fd3c078969e3ee4c71d9e8_6, (Object)class07050.field_5808);
        float f5 = class044532.method_61414(f);
        class03070 class030702 = class03049.N(class044532);
        float f6 = class04995.B((float)f, (float)((Float)class044532.B_0).floatValue(), (float)((Float)class044532.u_1).floatValue());
        float f7 = class04995.B((float)f, (float)((Float)class044532.u_2).floatValue(), (float)((Float)class044532.u_0).floatValue());
        float f8 = f;
        class04453 class044533 = class044532;
        class014212.N((Quaternionfc)class02058.y.N((this.y(class044533, f8) - f6) * 0.1f));
        f8 = f;
        class044533 = class044532;
        class014212.N((Quaternionfc)class02058.u.N((this.N(class044533, f8) - f7) * 0.1f));
        if (class030702.field_28387) {
            f3 = class070502 == class07050.field_5808 ? f4 : 0.0f;
            f2 = this.NO.y(this.NG) * (1.0f - class04995.B((float)f, (float)this.Nw, (float)this.Nd));
            this.N((class04477)class044532, f, f5, class07050.field_5808, f3, this.NG, f2, class014212, class012372, n);
        }
        if (class030702.field_28388) {
            f3 = class070502 == class07050.field_5810 ? f4 : 0.0f;
            f2 = this.NO.y(this.Nl) * (1.0f - class04995.B((float)f, (float)this.NY, (float)this.Nk));
            this.N((class04477)class044532, f, f5, class07050.field_5810, f3, this.Nl, f2, class014212, class012372, n);
        }
        if (this.N((class08133)(class044533 = ((class03386)this.Nn.i_5).L()))) {
            class044533.N();
        }
        class044533 = this.Nn.Ne().L();
        this.N((class01422)class044533, objectArray -> {
            WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)1, (String)"[net.minecraft.class_4597$class_4598]");
            ((class01422)objectArray[0]).u();
            return null;
        });
    }

    static class03070 N(class04453 class044532) {
        boolean bl;
        class06584 class065842 = class044532.method_6047();
        class06584 class065843 = class044532.method_6079();
        boolean bl2 = class065842.N(class06570.sx) || class065843.N(class06570.sx);
        boolean bl3 = bl = class065842.N(class06570.dw) || class065843.N(class06570.dw);
        if (!bl2 && !bl) {
            return class03070.field_28384;
        }
        if (class044532.method_6115()) {
            return class03049.y(class044532);
        }
        if (class03049.N(class065842)) {
            return class03070.field_28385;
        }
        return class03070.field_28384;
    }

    private void N(class04477 class044772, float f, float f2, class07050 class070502, float f3, class06584 class065842, float f4, class01421 class014212, class01237 class012372, int n) {
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        this.N(class044772, f, f2, class070502, f3, class065842, f4, class014212, class012372, n, callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        CallbackInfo callbackInfo2 = new CallbackInfo("", true);
        this.y(class044772, f, f2, class070502, f3, class065842, f4, class014212, class012372, n, callbackInfo2);
        if (callbackInfo2.isCancelled()) {
            return;
        }
        if (class044772.method_31550()) {
            return;
        }
        boolean bl = class070502 == class07050.field_5808;
        class07070 class070702 = bl ? class044772.method_6068() : class044772.method_6068().N();
        class014212.N();
        if (class065842.R()) {
            if (bl && !class044772.method_5767()) {
                this.N(class014212, class012372, n, f4, f3, class070702);
            }
        } else if (class065842.L(class02484.f)) {
            if (bl && this.Nl.R()) {
                this.N(class014212, class012372, n, f2, f4, f3);
            } else {
                this.N(class014212, class012372, n, f4, class070702, f3, class065842);
            }
        } else if (class065842.N(class06570.dw)) {
            int n2;
            this.y(class014212, class070702, f4);
            boolean bl2 = class06593.u((class06584)class065842);
            boolean bl3 = class070702 == class07070.field_6183;
            int n3 = n2 = bl3 ? 1 : -1;
            if (class044772.method_6115() && class044772.method_6014() > 0 && class044772.method_6058() == class070502 && !bl2) {
                class014212.N((float)n2 * -0.4785682f, -0.094387f, 0.05731531f);
                class014212.N((Quaternionfc)class02058.y.N(-11.935f));
                class014212.N((Quaternionfc)class02058.u.N((float)n2 * 65.3f));
                class014212.N((Quaternionfc)class02058.R.N((float)n2 * -9.785f));
                float f5 = (float)class065842.N((class07438)class044772) - ((float)class044772.method_6014() - f + 1.0f);
                float f6 = f5 / (float)class06593.y((class06584)class065842, (class07438)class044772);
                if (f6 > 1.0f) {
                    f6 = 1.0f;
                }
                if (f6 > 0.1f) {
                    float f7 = class04995.m((double)((f5 - 0.1f) * 1.3f));
                    float f8 = f6 - 0.1f;
                    float f9 = f7 * f8;
                    class014212.N(f9 * 0.0f, f9 * 0.004f, f9 * 0.0f);
                }
                class014212.N(f6 * 0.0f, f6 * 0.0f, f6 * 0.04f);
                class014212.y(1.0f, 1.0f, 1.0f + f6 * 0.2f);
                class014212.N((Quaternionfc)class02058.L.N((float)n2 * 45.0f));
            } else {
                this.N(f3, class014212, n2, class070702);
                if (bl2 && f3 < 0.001f && bl) {
                    class014212.N((float)n2 * -0.641864f, 0.0f, 0.0f);
                    class014212.N((Quaternionfc)class02058.u.N((float)n2 * 10.0f));
                }
            }
            this.N((class07438)class044772, class065842, bl3 ? class03662.field_4322 : class03662.field_4321, class014212, class012372, n);
        } else {
            boolean bl4 = class070702 == class07070.field_6183;
            int n4 = bl4 ? 1 : -1;
            this.L(class044772, f, f2, class070502, f3, class065842, f4, class014212, class012372, n, null);
            if (class044772.method_6115() && class044772.method_6014() > 0 && class044772.method_6058() == class070502) {
                class06509 class065092 = class065842.G();
                if (!class065092.y()) {
                    this.y(class014212, class070702, f4);
                    this.N(class044772, f, f2, class070502, f3, class065842, f4, class014212, class012372, n, null, class065092);
                }
                switch (class065092) {
                    case field_8952: {
                        break;
                    }
                    case field_8950: 
                    case field_8946: {
                        this.N(class014212, f, class070702, class065842, (class08036)class044772);
                        this.y(class014212, class070702, f4);
                        this.i(class044772, f, f2, class070502, f3, class065842, f4, class014212, class012372, n, null);
                        break;
                    }
                    case field_8949: {
                        if (class065842.B() instanceof class06493) break;
                        class014212.N((float)n4 * -0.14142136f, 0.08f, 0.14142136f);
                        class014212.N((Quaternionfc)class02058.y.N(-102.25f));
                        class014212.N((Quaternionfc)class02058.u.N((float)n4 * 13.365f));
                        class014212.N((Quaternionfc)class02058.R.N((float)n4 * 78.05f));
                        break;
                    }
                    case field_8953: {
                        class014212.N((float)n4 * -0.2785682f, 0.18344387f, 0.15731531f);
                        class014212.N((Quaternionfc)class02058.y.N(-13.935f));
                        class014212.N((Quaternionfc)class02058.u.N((float)n4 * 35.3f));
                        class014212.N((Quaternionfc)class02058.R.N((float)n4 * -9.785f));
                        float f10 = (float)class065842.N((class07438)class044772) - ((float)class044772.method_6014() - f + 1.0f);
                        float f11 = f10 / 20.0f;
                        f11 = (f11 * f11 + f11 * 2.0f) / 3.0f;
                        if (f11 > 1.0f) {
                            f11 = 1.0f;
                        }
                        if (f11 > 0.1f) {
                            float f12 = class04995.m((double)((f10 - 0.1f) * 1.3f));
                            float f13 = f11 - 0.1f;
                            float f14 = f12 * f13;
                            class014212.N(f14 * 0.0f, f14 * 0.004f, f14 * 0.0f);
                        }
                        class014212.N(f11 * 0.0f, f11 * 0.0f, f11 * 0.04f);
                        class014212.y(1.0f, 1.0f, 1.0f + f11 * 0.2f);
                        class014212.N((Quaternionfc)class02058.L.N((float)n4 * 45.0f));
                        break;
                    }
                    case field_63380: {
                        class014212.N((float)n4 * -0.5f, 0.7f, 0.1f);
                        class014212.N((Quaternionfc)class02058.y.N(-55.0f));
                        class014212.N((Quaternionfc)class02058.u.N((float)n4 * 35.3f));
                        class014212.N((Quaternionfc)class02058.R.N((float)n4 * -9.785f));
                        float f15 = (float)class065842.N((class07438)class044772) - ((float)class044772.method_6014() - f + 1.0f);
                        float f16 = f15 / 10.0f;
                        if (f16 > 1.0f) {
                            f16 = 1.0f;
                        }
                        if (f16 > 0.1f) {
                            float f17 = class04995.m((double)((f15 - 0.1f) * 1.3f));
                            float f18 = f16 - 0.1f;
                            float f19 = f17 * f18;
                            class014212.N(f19 * 0.0f, f19 * 0.004f, f19 * 0.0f);
                        }
                        class014212.N(0.0f, 0.0f, f16 * 0.2f);
                        class014212.y(1.0f, 1.0f, 1.0f + f16 * 0.2f);
                        class014212.N((Quaternionfc)class02058.L.N((float)n4 * 45.0f));
                        break;
                    }
                    case field_42717: {
                        this.N(class014212, f, class070702, (class08036)class044772);
                        break;
                    }
                    case field_55494: {
                        this.N(f3, class014212, n4, class070702);
                        break;
                    }
                    case field_8951: {
                        class014212.N((float)n4 * 0.56f, -0.52f, -0.72f);
                        float f20 = (float)class065842.N((class07438)class044772) - ((float)class044772.method_6014() - f + 1.0f);
                        class06733.N((float)class044772.method_75879(f), (class01421)class014212, (float)f20, (class07070)class070702, (class06584)class065842);
                        break;
                    }
                }
            } else if (class044772.method_6123()) {
                this.y(class014212, class070702, f4);
                class014212.N((float)n4 * -0.4f, 0.8f, 0.3f);
                class014212.N((Quaternionfc)class02058.u.N((float)n4 * 65.0f));
                class014212.N((Quaternionfc)class02058.R.N((float)n4 * -85.0f));
            } else {
                this.y(class014212, class070702, f4);
                switch (class065842.e().N()) {
                    case field_63398: {
                        break;
                    }
                    case field_63399: {
                        class07070 class070703 = class070702;
                        int n5 = n4;
                        class01421 class014213 = class014212;
                        float f21 = f3;
                        class03049 class030492 = this;
                        LocalFloatRefImpl localFloatRefImpl = new LocalFloatRefImpl();
                        localFloatRefImpl.init(f4);
                        this.N(class030492, f21, class014213, n5, class070703, (LocalFloatRef)localFloatRefImpl);
                        f4 = localFloatRefImpl.dispose();
                        break;
                    }
                    case field_63400: {
                        class06733.N((float)f3, (class01421)class014212, (int)n4, (class07070)class070702);
                    }
                }
            }
            class03662 class036622 = bl4 ? class03662.field_4322 : class03662.field_4321;
            this.u(class044772, f, f2, class070502, f3, class065842, f4, class014212, class012372, n, null);
            this.R(class044772, f, f2, class070502, f3, class065842, f4, class014212, class012372, n, null);
            this.N((class07438)class044772, class065842, class036622, class014212, class012372, n);
        }
        class014212.y();
    }

    private static boolean N(class06584 class065842) {
        return class065842.N(class06570.dw) && class06593.u((class06584)class065842);
    }

    public void iris$renderHandsWithCustomRenderer(HandRenderer handRenderer, float f, class01421 class014212, class04790 class047902, @Nullable class04453 class044532, int n) {
        this.Ng = handRenderer;
        this.N(f, class014212, (class01237)class047902, class044532, n);
        this.Ng = null;
    }

    private void R(class04477 class044772, float f, float f2, class07050 class070502, float f3, class06584 class065842, float f4, class01421 class014212, class01237 class012372, int n, CallbackInfo callbackInfo) {
        if (VisualSettings.INSTANCE.tiltItemPositions.isEnabled() && !(class065842.B() instanceof class06918)) {
            int n2 = (class070502 == class07050.field_5808 ? class044772.method_6068() : class044772.method_6068().N()) == class07070.field_6183 ? 1 : -1;
            float f5 = 0.8819767f;
            class014212.y(0.8819767f, 0.8819767f, 0.8819767f);
            class014212.N((float)n2 * -0.084f, 0.059f, 0.08f);
            class014212.N((Quaternionfc)class02058.u.N((float)n2 * 5.0f));
        }
    }
}

