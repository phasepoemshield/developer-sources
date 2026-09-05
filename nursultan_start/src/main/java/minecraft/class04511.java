/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00676
 *  minecraft.class00690
 *  minecraft.class00699
 *  minecraft.class00702
 *  minecraft.class00737
 *  minecraft.class01237
 *  minecraft.class01384
 *  minecraft.class01421
 *  minecraft.class01894
 *  minecraft.class02058
 *  minecraft.class02155
 *  minecraft.class02566
 *  minecraft.class03127
 *  minecraft.class04802
 *  minecraft.class04832
 *  minecraft.class04995
 *  minecraft.class06069
 *  minecraft.class06271
 *  minecraft.class06403
 *  minecraft.class06851
 *  minecraft.class06959
 *  minecraft.class07209
 *  minecraft.class07311
 *  minecraft.class07830
 *  minecraft.class08805
 *  net.irisshaders.iris.shaderpack.materialmap.NamespacedId
 *  net.irisshaders.iris.shaderpack.materialmap.WorldRenderingSettings
 *  net.irisshaders.iris.uniforms.CapturedRenderingState
 *  org.joml.Quaternionf
 *  org.joml.Quaternionfc
 *  org.joml.Vector3f
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import minecraft.class00676;
import minecraft.class00690;
import minecraft.class00699;
import minecraft.class00702;
import minecraft.class00737;
import minecraft.class01237;
import minecraft.class01384;
import minecraft.class01421;
import minecraft.class01894;
import minecraft.class02058;
import minecraft.class02155;
import minecraft.class02566;
import minecraft.class03127;
import minecraft.class04507;
import minecraft.class04802;
import minecraft.class04832;
import minecraft.class04995;
import minecraft.class06069;
import minecraft.class06271;
import minecraft.class06403;
import minecraft.class06851;
import minecraft.class06959;
import minecraft.class07209;
import minecraft.class07311;
import minecraft.class07830;
import minecraft.class08805;
import net.irisshaders.iris.shaderpack.materialmap.NamespacedId;
import net.irisshaders.iris.shaderpack.materialmap.WorldRenderingSettings;
import net.irisshaders.iris.uniforms.CapturedRenderingState;
import org.joml.Quaternionf;
import org.joml.Quaternionfc;
import org.joml.Vector3f;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class04511
extends class04507<class00690, class08805> {
    public static final class01894 N;
    private static final class01894 y;
    private static final class01894 L;
    private static final class01894 u;
    private static final class07311 i;
    private static final class07311 R;
    private static final class07311 M;
    private static final class07311 B;
    private static final float Z;
    private final class02155 z;
    private static final NamespacedId U;
    private static int E;

    public class04511(class04832 class048322) {
        super(class048322);
        this.field_4673 = 0.5f;
        this.z = new class02155(class048322.N(class04802.Nh));
    }

    @Override
    protected boolean method_62406(class00690 class006902) {
        return false;
    }

    private static void N(CallbackInfo callbackInfo) {
        if (E != 0) {
            CapturedRenderingState.INSTANCE.setCurrentEntity(E);
            E = 0;
        }
    }

    private static void N(float f, float f2, float f3, float f4, class01421 class014212, class01237 class012372, int n, CallbackInfo callbackInfo) {
        if (WorldRenderingSettings.INSTANCE.getEntityIds() == null) {
            return;
        }
        E = CapturedRenderingState.INSTANCE.getCurrentRenderedEntity();
        CapturedRenderingState.INSTANCE.setCurrentEntity(WorldRenderingSettings.INSTANCE.getEntityIds().applyAsInt((Object)U));
    }

    public static void N(float f, float f2, float f3, float f4, class01421 class014212, class01237 class012372, int n) {
        float f5 = class04995.N((float)(f * f + f3 * f3));
        float f6 = class04995.N((float)(f * f + f2 * f2 + f3 * f3));
        class04511.N(f, f2, f3, f4, class014212, class012372, n, null);
        class014212.N();
        class014212.N(0.0f, 2.0f, 0.0f);
        class014212.N((Quaternionfc)class02058.u.rotation((float)(-Math.atan2(f3, f)) - 1.5707964f));
        class014212.N((Quaternionfc)class02058.y.rotation((float)(-Math.atan2(f5, f2)) - 1.5707964f));
        float f7 = 0.0f - f4 * 0.01f;
        float f8 = f6 / 32.0f - f4 * 0.01f;
        class012372.N(class014212, B, (class014232, class013912) -> {
            int n2 = 8;
            float f4 = 0.0f;
            float f5 = 0.75f;
            float f6 = 0.0f;
            for (int i = 1; i <= 8; ++i) {
                float f7 = class04995.m((double)((float)i * ((float)Math.PI * 2) / 8.0f)) * 0.75f;
                float f8 = class04995.P((double)((float)i * ((float)Math.PI * 2) / 8.0f)) * 0.75f;
                float f9 = (float)i / 8.0f;
                class013912.N(class014232, f4 * 0.2f, f5 * 0.2f, 0.0f).method_39415(-16777216).method_22913(f6, f7).method_22922(class01384.u).method_60803(n).y(class014232, 0.0f, -1.0f, 0.0f);
                class013912.N(class014232, f4, f5, f6).method_39415(-1).method_22913(f6, f8).method_22922(class01384.u).method_60803(n).y(class014232, 0.0f, -1.0f, 0.0f);
                class013912.N(class014232, f7, f8, f6).method_39415(-1).method_22913(f9, f8).method_22922(class01384.u).method_60803(n).y(class014232, 0.0f, -1.0f, 0.0f);
                class013912.N(class014232, f7 * 0.2f, f8 * 0.2f, 0.0f).method_39415(-16777216).method_22913(f9, f7).method_22922(class01384.u).method_60803(n).y(class014232, 0.0f, -1.0f, 0.0f);
                f4 = f7;
                f5 = f8;
                f6 = f9;
            }
        });
        class014212.y();
        class04511.N(null);
    }

    private static void N(class01421 class014212, float f, class01237 class012372, class07311 class073112) {
        class012372.N(class014212, class073112, (class014232, class013912) -> {
            float f2 = Math.min(f > 0.8f ? (f - 0.8f) / 0.2f : 0.0f, 1.0f);
            int n = class02566.N((float)(1.0f - f2), (float)1.0f, (float)1.0f, (float)1.0f);
            int n2 = 0xFF00FF;
            class06069 class060692 = class06069.y((long)432L);
            Vector3f vector3f = new Vector3f();
            Vector3f vector3f2 = new Vector3f();
            Vector3f vector3f3 = new Vector3f();
            Vector3f vector3f4 = new Vector3f();
            Quaternionf quaternionf = new Quaternionf();
            int n3 = class04995.y((float)((f + f * f) / 2.0f * 60.0f));
            for (int i = 0; i < n3; ++i) {
                quaternionf.rotationXYZ(class060692.z() * ((float)Math.PI * 2), class060692.z() * ((float)Math.PI * 2), class060692.z() * ((float)Math.PI * 2)).rotateXYZ(class060692.z() * ((float)Math.PI * 2), class060692.z() * ((float)Math.PI * 2), class060692.z() * ((float)Math.PI * 2) + f * 1.5707964f);
                class014232.N((Quaternionfc)quaternionf);
                float f3 = class060692.z() * 20.0f + 5.0f + f2 * 10.0f;
                float f4 = class060692.z() * 2.0f + 1.0f + f2 * 2.0f;
                vector3f2.set(-Z * f4, f3, -0.5f * f4);
                vector3f3.set(Z * f4, f3, -0.5f * f4);
                vector3f4.set(0.0f, f3, f4);
                class013912.N(class014232, vector3f).method_39415(n);
                class013912.N(class014232, vector3f2).method_39415(0xFF00FF);
                class013912.N(class014232, vector3f3).method_39415(0xFF00FF);
                class013912.N(class014232, vector3f).method_39415(n);
                class013912.N(class014232, vector3f3).method_39415(0xFF00FF);
                class013912.N(class014232, vector3f4).method_39415(0xFF00FF);
                class013912.N(class014232, vector3f).method_39415(n);
                class013912.N(class014232, vector3f4).method_39415(0xFF00FF);
                class013912.N(class014232, vector3f2).method_39415(0xFF00FF);
            }
        });
    }

    @Override
    public void method_3936(class08805 class088052, class01421 class014212, class01237 class012372, class06959 class069592) {
        class014212.N();
        float f = class088052.N(7).y();
        float f2 = (float)(class088052.N(5).N() - class088052.N(10).N());
        class014212.N((Quaternionfc)class02058.u.N(-f));
        class014212.N((Quaternionfc)class02058.y.N(f2 * 10.0f));
        class014212.N(0.0f, 0.0f, 1.0f);
        class014212.y(-1.0f, -1.0f, 1.0f);
        class014212.N(0.0f, -1.501f, 0.0f);
        int n = class01384.N((float)0.0f, (boolean)class088052.L);
        if (class088052.y > 0.0f) {
            int n2 = class02566.y((float)(class088052.y / 200.0f));
            class012372.N(0).N((class06271)this.z, (Object)class088052, class014212, class06851.s((class01894)y), class088052.G, class01384.u, n2, null, class088052.l, null);
            class012372.N(1).N((class06271)this.z, (Object)class088052, class014212, R, class088052.G, n, -1, null, class088052.l, null);
        } else {
            class012372.N(0).N((class06271)this.z, (Object)class088052, class014212, i, class088052.G, n, -1, null, class088052.l, null);
        }
        class012372.N((class06271)this.z, (Object)class088052, class014212, M, class088052.G, class01384.u, class088052.l, null);
        if (class088052.y > 0.0f) {
            float f3 = class088052.y / 200.0f;
            class014212.N();
            class014212.N(0.0f, -1.0f, -2.0f);
            class04511.N(class014212, f3, class012372, class06851.W());
            class04511.N(class014212, f3, class012372, class06851.m());
            class014212.y();
        }
        class014212.y();
        if (class088052.u != null) {
            class04511.N((float)class088052.u.M, (float)class088052.u.B, (float)class088052.u.Z, class088052.P, class014212, class012372, class088052.G);
        }
        super.method_3936(class088052, class014212, class012372, class069592);
    }

    @Override
    public void method_62354(class00690 class006902, class08805 class088052, float f) {
        class00699 class006992;
        super.method_62354(class006902, class088052, f);
        class088052.N = class04995.B((float)f, (float)class006902.i, (float)class006902.R);
        class088052.y = class006902.B > 0 ? (float)class006902.B + f : 0.0f;
        class088052.L = class006902.fields_2212a028292fd3c078969e3ee4c71d9e8_0 > 0;
        class00676 class006762 = class006902.W;
        if (class006762 != null) {
            class006992 = class006762.method_30950(f).y(0.0, (double)class03127.N((float)((float)class006762.N + f)), 0.0);
            class088052.u = class006992.u(class006902.method_30950(f));
        } else {
            class088052.u = null;
        }
        class006992 = class006902.W().N();
        class088052.i = class006992 == class00702.u || class006992 == class00702.i;
        class088052.R = class006992.N();
        class07209 class072092 = class006902.method_73183().N(class07830.field_13203, class06403.N((class07209)class006902.M()));
        class088052.M = class072092.method_19770((class00737)class006902.method_73189());
        class088052.B = class006902.method_29504() ? 0.0f : f;
        class088052.Z.N(class006902.y);
    }

    @Override
    public class08805 method_55269() {
        return new class08805();
    }
}

