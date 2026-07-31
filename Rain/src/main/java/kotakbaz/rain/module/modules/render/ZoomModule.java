/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.module.modules.render;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import kotakbaz.rain.Rain;
import kotakbaz.rain.client.extensions.a_0;
import kotakbaz.rain.client.extensions.b;
import kotakbaz.rain.module.Module;
import kotakbaz.rain.module.setting.settings.BindSetting;
import kotakbaz.rain.module.setting.settings.BooleanSetting;
import kotakbaz.rain.module.setting.settings.SliderSetting;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joml.Matrix3x2f;
import org.joml.Matrix3x2fc;
import org.lwjgl.glfw.GLFW;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0006\u0010\u0003J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007\u00a2\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007\u00a2\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000e\u00a2\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0010\u00a2\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u0018\u0010\u0003J\u0017\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0019H\u0002\u00a2\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0019H\u0002\u00a2\u0006\u0004\b\u001d\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\b \u0010\u001fJ\u000f\u0010!\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\b!\u0010\u001fJ\u000f\u0010\"\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\b\"\u0010\u001fJ\u000f\u0010#\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b#\u0010\u0003J\u000f\u0010$\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b$\u0010\u0003J\u001f\u0010'\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020\u00198\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020\u00108\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020\u00198\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b-\u0010*R\u0014\u0010.\u001a\u00020\u00198\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b.\u0010*R\u0014\u0010/\u001a\u00020\u00108\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b/\u0010,R\u0014\u00100\u001a\u00020\u00108\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b0\u0010,R\u0014\u00101\u001a\u00020\u000e8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b1\u00102R\u0014\u00103\u001a\u00020\u00108\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b3\u0010,R\u0014\u00104\u001a\u00020\u00108\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b4\u0010,R\u0014\u00105\u001a\u00020\u000e8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b5\u00102R\u0014\u00106\u001a\u00020\u000e8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b6\u00102R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010>\u001a\u00020=8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010@\u001a\u00020=8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b@\u0010?R\u0016\u0010A\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bA\u0010,R\u0016\u0010B\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bB\u0010,R\u0016\u0010C\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bC\u0010,R\u0016\u0010D\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bD\u0010,R\u0016\u0010E\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bE\u00102R\u0016\u0010F\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bF\u00102R\u0016\u0010G\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bG\u00102R\u0016\u0010H\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bH\u00102R\u0016\u0010I\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bI\u0010JR\u0016\u0010K\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bK\u0010JR\u0016\u0010L\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bL\u0010JR\u0016\u0010M\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bM\u0010JR\u0016\u0010N\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bN\u0010JR$\u0010P\u001a\u00020O2\u0006\u0010%\u001a\u00020O8\u0006@BX\u0086\u000e\u00a2\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR$\u0010T\u001a\u00020O2\u0006\u0010%\u001a\u00020O8\u0006@BX\u0086\u000e\u00a2\u0006\f\n\u0004\bT\u0010Q\u001a\u0004\bU\u0010S\u00a8\u0006V"}, d2={"Lkotakbaz/rain/module/modules/render/ZoomModule;", "Lkotakbaz/rain/module/Module;", "<init>", "()V", "", "onEnable", "onDisable", "", "dynamicDeltaTicks", "onRenderFrame", "(F)V", "fov", "modifyFov", "(F)F", "", "vertical", "", "handleMouseScroll", "(D)Z", "delta", "adjustMouseSensitivity", "(D)D", "shouldTransformScreenMouse", "()Z", "updateState", "", "key", "isBindPressedNow", "(I)Z", "isKeyPressed", "minZoom", "()D", "maxZoomValue", "maxScreenZoomValue", "interpolator", "restoreSmoothCameraIfNeeded", "resetTransforms", "value", "target", "nudge", "(FF)F", "INPUT_MOUSE_OFFSET", "I", "ENABLE_SCREEN_ZOOM", "Z", "SCREEN_ZOOM_KEY", "ROTATE_KEY", "ZOOM_TRANSITION", "RESUME_ZOOM", "TRANSITION_SPEED", "D", "ENABLE_LIMITS", "ALLOW_ZOOM_OUT", "MAX_ZOOM", "MAX_SCREEN_ZOOM", "Lkotakbaz/rain/module/setting/settings/BindSetting;", "zoomKey", "Lkotakbaz/rain/module/setting/settings/BindSetting;", "Lkotakbaz/rain/module/setting/settings/BooleanSetting;", "useCinematicCamera", "Lkotakbaz/rain/module/setting/settings/BooleanSetting;", "Lkotakbaz/rain/module/setting/settings/SliderSetting;", "defaultZoom", "Lkotakbaz/rain/module/setting/settings/SliderSetting;", "scrollSensitivity", "smoothCameraRestoreValue", "booming", "screenZooming", "rotating", "prevBoomDivisor", "boomDivisor", "lastBoomDivisor", "screenBoom", "screenRotation", "F", "lastScreenBoom", "lastMouseX", "lastMouseY", "lastDynamicDeltaTicks", "Lorg/joml/Matrix3x2fc;", "renderTransform", "Lorg/joml/Matrix3x2fc;", "getRenderTransform", "()Lorg/joml/Matrix3x2fc;", "mouseTransform", "getMouseTransform", "rain-visuals"})
public final class ZoomModule
extends Module {
    @NotNull
    public static final ZoomModule INSTANCE;
    private static final int a = 400;
    private static final boolean A = true;
    private static final int b = -1;
    private static final int B = -1;
    private static final boolean c = true;
    private static final boolean C = false;
    private static final double d = 1.0;
    private static final boolean D = true;
    private static final boolean e = false;
    private static final double E = 100.0;
    private static final double f = 5.0;
    @NotNull
    private static final BindSetting F;
    @NotNull
    private static final BooleanSetting g;
    @NotNull
    private static final SliderSetting G;
    @NotNull
    private static final SliderSetting h;
    private static boolean H;
    private static boolean i;
    private static boolean I;
    private static boolean j;
    private static double J;
    private static double k;
    private static double K;
    private static double l;
    private static float L;
    private static float m;
    private static float M;
    private static float n;
    private static float N;
    @NotNull
    private static Matrix3x2fc o;
    @NotNull
    private static Matrix3x2fc O;
    private static Object[] p;
    private static Object q;
    private static Object[] Q;
    private static Object[] P;
    private static Object[] r;
    public static int[] R;

    private ZoomModule() {
        int n2 = R[0];
        n2 -= R[1];
        int n3 = R[3];
        n3 ^= R[4];
        int n4 = R[6];
        n4 += R[7];
        super((String)p[n2 += R[2]], a_0.getRENDER(), (String)p[n3 += R[5]] + (String)p[n4 += R[8]]);
    }

    @NotNull
    public final Matrix3x2fc getRenderTransform() {
        return o;
    }

    @NotNull
    public final Matrix3x2fc getMouseTransform() {
        return O;
    }

    @Override
    public void onEnable() {
        J = ((Number)G.getValue()).floatValue();
        K = 1.0;
        this.resetTransforms();
    }

    @Override
    public void onDisable() {
        this.restoreSmoothCameraIfNeeded();
        int n2 = R[9];
        n2 ^= R[10];
        i = n2 += R[11];
        int n3 = R[12];
        n3 ^= R[13];
        I = n3 -= R[14];
        int n4 = R[15];
        n4 += R[16];
        j = n4 -= R[17];
        k = 1.0;
        J = ((Number)G.getValue()).floatValue();
        K = 1.0;
        l = 1.0;
        L = 0.0f;
        m = 1.0f;
        M = 0.0f;
        n = 0.0f;
        N = 1.0f;
        this.resetTransforms();
    }

    public final void onRenderFrame(float dynamicDeltaTicks) {
        N = dynamicDeltaTicks;
        this.updateState();
        if (!this.isEnabled()) {
            this.resetTransforms();
            return;
        }
        float f2 = (float)(kotakbaz.rain.client.extensions.b.getMc().mouse.getX() / (double)kotakbaz.rain.client.extensions.b.getMc().getWindow().getScaleFactor());
        float f3 = (float)(kotakbaz.rain.client.extensions.b.getMc().mouse.getY() / (double)kotakbaz.rain.client.extensions.b.getMc().getWindow().getScaleFactor());
        Matrix3x2f matrix3x2f = new Matrix3x2f().identity();
        matrix3x2f.translate(M, n);
        matrix3x2f.scale(m, m);
        matrix3x2f.translate(-M, -n);
        Matrix3x2f matrix3x2f2 = new Matrix3x2f().identity();
        matrix3x2f2.translate((float)kotakbaz.rain.client.extensions.b.getMc().getWindow().getScaledWidth() / 2.0f, (float)kotakbaz.rain.client.extensions.b.getMc().getWindow().getScaledHeight() / 2.0f);
        matrix3x2f2.rotate((float)Math.toRadians(L));
        matrix3x2f2.translate((float)kotakbaz.rain.client.extensions.b.getMc().getWindow().getScaledWidth() / -2.0f, (float)kotakbaz.rain.client.extensions.b.getMc().getWindow().getScaledHeight() / -2.0f);
        matrix3x2f.mul((Matrix3x2fc)matrix3x2f2);
        o = (Matrix3x2fc)new Matrix3x2f((Matrix3x2fc)matrix3x2f);
        Matrix3x2f matrix3x2f3 = new Matrix3x2f((Matrix3x2fc)matrix3x2f2).invert();
        int n2 = R[18];
        n2 ^= R[19];
        Intrinsics.checkNotNullExpressionValue(matrix3x2f3, (String)p[n2 ^= R[20]]);
        O = (Matrix3x2fc)matrix3x2f3;
        float f4 = (float)this.interpolator();
        m += 0.45f * (((float)l - m) * f4);
        M += 0.65f * ((f2 - M) * dynamicDeltaTicks);
        n += 0.65f * ((f3 - n) * dynamicDeltaTicks);
        m = this.nudge(m, 1.0f);
        M = this.nudge(M, f2);
        n = this.nudge(n, f3);
    }

    public final float modifyFov(float fov) {
        if (!this.isEnabled()) {
            return fov;
        }
        this.updateState();
        K += Double.longBitsToDouble(0x4F6F175AF9D69E14L ^ 0x70B3DB96351A52D9L) * (k - K) * this.interpolator();
        return (float)((double)fov / Math.max(K, Double.longBitsToDouble(0x4E94809C56085BF3L ^ 0x7110FA7D11A64F88L)));
    }

    public final boolean handleMouseScroll(double vertical) {
        int n2;
        if (!this.isEnabled() || Rain.INSTANCE.getCustomScreen() != null) {
            boolean bl = R[21];
            bl -= R[22];
            return bl -= R[23];
        }
        this.updateState();
        if (kotakbaz.rain.client.extensions.b.getMc().currentScreen != null) {
            if (j) {
                L += (float)vertical;
                int n3 = R[24];
                n3 ^= R[25];
                n2 = n3 ^= R[26];
            } else if (I) {
                l = Math.min(Math.max(this.minZoom(), l + vertical * Double.longBitsToDouble(0x337EECAD585CFB4BL ^ 0xCB77534C1C562D1L) * l), this.maxScreenZoomValue());
                int n4 = R[27];
                n4 -= R[28];
                n2 = n4 -= R[29];
            } else {
                int n5 = R[30];
                n5 += R[31];
                n2 = n5 -= R[32];
            }
        } else if (i) {
            k = Math.min(Math.max(this.minZoom(), k + vertical * (k / Double.longBitsToDouble(0xEF5B2EA49446CCE7L ^ 0xAF7F2EA49446CCE7L)) * (double)((Number)h.getValue()).floatValue()), this.maxZoomValue());
            int n6 = R[33];
            n6 ^= R[34];
            n2 = n6 ^= R[35];
        } else {
            int n7 = R[36];
            n7 ^= R[37];
            n2 = n7 -= R[38];
        }
        return n2 != 0;
    }

    public final double adjustMouseSensitivity(double delta) {
        if (!this.isEnabled()) {
            return delta;
        }
        this.updateState();
        return i ? delta / Math.max(k, Double.longBitsToDouble(0xFBCEBF117AF675F4L ^ 0xC44AC5F03D58618FL)) : delta;
    }

    public final boolean shouldTransformScreenMouse() {
        int n2;
        if (this.isEnabled() && Rain.INSTANCE.getCustomScreen() == null && kotakbaz.rain.client.extensions.b.getMc().currentScreen != null) {
            int n3 = R[39];
            n3 -= R[40];
            n2 = n3 += R[41];
        } else {
            int n4 = R[42];
            n4 -= R[43];
            n2 = n4 ^= R[44];
        }
        return n2 != 0;
    }

    /*
     * Unable to fully structure code
     */
    private final void updateState() {
        var16_1 = -1838378278365120273L;
        var6_2 = 5957959829173947355L;
        var8_3 = -2002559251251695310L;
        var10_4 = -5941933743969431138L;
        var12_5 = -3556638845852949305L;
        var14_6 = 2852196052849397263L;
        if (!this.isEnabled()) {
            return;
        }
        var19_7 = ZoomModule.R[45];
        var19_7 ^= ZoomModule.R[46];
        if (this.isKeyPressed(var19_7 ^= ZoomModule.R[47])) ** GOTO lbl-1000
        var21_8 = ZoomModule.R[48];
        var21_8 += ZoomModule.R[49];
        if (this.isKeyPressed(var21_8 += ZoomModule.R[50])) lbl-1000:
        // 2 sources

        {
            var23_9 = ZoomModule.R[51];
            var23_9 -= ZoomModule.R[52];
            v0 = var23_9 ^= ZoomModule.R[53];
        } else {
            var25_10 = ZoomModule.R[54];
            var25_10 -= ZoomModule.R[55];
            v0 = var25_10 += ZoomModule.R[56];
        }
        var27_11 = ZoomModule.R[57];
        var27_11 ^= ZoomModule.R[58];
        v1 = var8_3;
        var29_12 = ZoomModule.R[60];
        var29_12 ^= ZoomModule.R[61];
        var8_3 = v1 ^ ((long)v0 << (var27_11 ^= ZoomModule.R[59]) ^ v1) & -1L << (var29_12 -= ZoomModule.R[62]);
        var31_13 = ZoomModule.R[63];
        var31_13 -= ZoomModule.R[64];
        if (this.isKeyPressed(var31_13 ^= ZoomModule.R[65])) ** GOTO lbl-1000
        var33_14 = ZoomModule.R[66];
        var33_14 += ZoomModule.R[67];
        if (this.isKeyPressed(var33_14 += ZoomModule.R[68])) lbl-1000:
        // 2 sources

        {
            var35_15 = ZoomModule.R[69];
            var35_15 ^= ZoomModule.R[70];
            v2 = var35_15 += ZoomModule.R[71];
        } else {
            var37_16 = ZoomModule.R[72];
            var37_16 += ZoomModule.R[73];
            v2 = var37_16 ^= ZoomModule.R[74];
        }
        v3 = var8_3;
        var39_17 = ZoomModule.R[75];
        var39_17 -= ZoomModule.R[76];
        var8_3 = v3 ^ ((long)v2 ^ v3) & -1L >>> (var39_17 -= ZoomModule.R[77]);
        if (!this.isBindPressedNow(((Number)ZoomModule.F.getValue()).intValue())) ** GOTO lbl-1000
        var41_18 = ZoomModule.R[78];
        var41_18 -= ZoomModule.R[79];
        if ((int)(var8_3 >>> (var41_18 += ZoomModule.R[80])) != 0 && (int)var8_3 != 0 || ZoomModule.I) {
            var43_19 = ZoomModule.R[81];
            var43_19 += ZoomModule.R[82];
            v4 = var43_19 -= ZoomModule.R[83];
        } else lbl-1000:
        // 2 sources

        {
            var45_20 = ZoomModule.R[84];
            var45_20 += ZoomModule.R[85];
            v4 = var45_20 ^= ZoomModule.R[86];
        }
        var47_21 = ZoomModule.R[87];
        var47_21 -= ZoomModule.R[88];
        v5 = var12_5;
        var49_22 = ZoomModule.R[90];
        var49_22 += ZoomModule.R[91];
        var12_5 = v5 ^ ((long)v4 << (var47_21 ^= ZoomModule.R[89]) ^ v5) & -1L << (var49_22 ^= ZoomModule.R[92]);
        var51_23 = ZoomModule.R[93];
        var51_23 += ZoomModule.R[94];
        var51_23 += ZoomModule.R[95];
        var53_24 = ZoomModule.R[96];
        var53_24 += ZoomModule.R[97];
        v6 = var14_6;
        var55_25 = ZoomModule.R[99];
        var55_25 ^= ZoomModule.R[100];
        var14_6 = v6 ^ ((long)var51_23 << (var53_24 ^= ZoomModule.R[98]) ^ v6) & -1L << (var55_25 ^= ZoomModule.R[101]);
        var57_26 = ZoomModule.R[102];
        var57_26 ^= ZoomModule.R[103];
        if (ZoomModule.I != (int)(var12_5 >>> (var57_26 += ZoomModule.R[104]))) {
            ZoomModule.l = ZoomModule.I != false ? 1.0 : Double.longBitsToDouble(-98458492079402150L ^ -4710144510506790054L);
            var59_27 = ZoomModule.R[105];
            var59_27 -= ZoomModule.R[106];
            ZoomModule.I = (int)(var12_5 >>> (var59_27 += ZoomModule.R[107]));
        }
        var61_28 = ZoomModule.R[108];
        var61_28 ^= ZoomModule.R[109];
        ZoomModule.j = (int)(var14_6 >>> (var61_28 -= ZoomModule.R[110]));
        if (this.isBindPressedNow(((Number)ZoomModule.F.getValue()).intValue()) && kotakbaz.rain.client.extensions.b.getMc().currentScreen == null && kotakbaz.rain.client.extensions.b.getMc().player != null && kotakbaz.rain.client.extensions.b.getMc().world != null) {
            var63_29 = ZoomModule.R[111];
            var63_29 ^= ZoomModule.R[112];
            v7 = var63_29 += ZoomModule.R[113];
        } else {
            var65_30 = ZoomModule.R[114];
            var65_30 -= ZoomModule.R[115];
            v7 = var65_30 ^= ZoomModule.R[116];
        }
        v8 = var14_6;
        var67_31 = ZoomModule.R[117];
        var67_31 += ZoomModule.R[118];
        var14_6 = v8 ^ ((long)v7 ^ v8) & -1L >>> (var67_31 ^= ZoomModule.R[119]);
        if (ZoomModule.i == (int)var14_6) {
            return;
        }
        if (ZoomModule.i) {
            ZoomModule.J = ZoomModule.k;
            ZoomModule.k = 1.0;
            this.restoreSmoothCameraIfNeeded();
        } else {
            ZoomModule.k = ((Number)ZoomModule.G.getValue()).floatValue();
            ZoomModule.H = kotakbaz.rain.client.extensions.b.getMc().options.smoothCameraEnabled;
            if (((Boolean)ZoomModule.g.getValue()).booleanValue()) {
                var69_32 = ZoomModule.R[120];
                var69_32 += ZoomModule.R[121];
                kotakbaz.rain.client.extensions.b.getMc().options.smoothCameraEnabled = var69_32 += ZoomModule.R[122];
            }
        }
        ZoomModule.i = (int)var14_6;
    }

    /*
     * Enabled aggressive block sorting
     */
    private final boolean isBindPressedNow(int key) {
        int n2;
        long l2 = 4491146628849470187L;
        long l3 = -6960898544242585621L;
        if (key <= 0) {
            boolean bl = R[123];
            bl += R[124];
            return bl ^= R[125];
        }
        int n3 = R[126];
        n3 -= R[127];
        if (key >= (n3 -= R[128])) {
            int n4;
            int n5 = R[129];
            n5 += R[130];
            n5 += R[131];
            int n6 = R[132];
            n6 -= R[133];
            long l4 = l3;
            int n7 = R[135];
            n7 -= R[136];
            l3 = l4 ^ ((long)(key - n5) << (n6 ^= R[134]) ^ l4) & -1L << (n7 ^= R[137]);
            int n8 = R[138];
            n8 ^= R[139];
            int n9 = R[141];
            n9 += R[142];
            if ((n8 ^= R[140]) <= (int)(l3 >>> (n9 ^= R[143]))) {
                int n10 = R[144];
                n10 += R[145];
                int n11 = R[147];
                n11 += R[148];
                if ((int)(l3 >>> (n10 += R[146])) < (n11 -= R[149])) {
                    int n12 = R[150];
                    n12 += R[151];
                    n4 = n12 ^= R[152];
                } else {
                    int n13 = R[153];
                    n13 += R[154];
                    n4 = n13 -= R[155];
                }
            } else {
                int n14 = R[156];
                n14 += R[157];
                n4 = n14 ^= R[158];
            }
            if (n4 != 0) {
                int n15 = R[159];
                n15 -= R[160];
                int n16 = R[162];
                n16 -= R[163];
                if (GLFW.glfwGetMouseButton((long)kotakbaz.rain.client.extensions.b.getMc().getWindow().getHandle(), (int)((int)(l3 >>> (n15 += R[161])))) == (n16 ^= R[164])) {
                    int n17 = R[165];
                    n17 += R[166];
                    n2 = n17 -= R[167];
                    return n2 != 0;
                }
            }
            int n18 = R[168];
            n18 ^= R[169];
            n2 = n18 -= R[170];
            return n2 != 0;
        }
        int n19 = R[171];
        n19 -= R[172];
        if (GLFW.glfwGetKey((long)kotakbaz.rain.client.extensions.b.getMc().getWindow().getHandle(), (int)key) == (n19 ^= R[173])) {
            int n20 = R[174];
            n20 ^= R[175];
            n2 = n20 += R[176];
            return n2 != 0;
        }
        int n21 = R[177];
        n21 += R[178];
        n2 = n21 += R[179];
        return n2 != 0;
    }

    private final boolean isKeyPressed(int key) {
        boolean bl;
        int n2 = R[180];
        n2 += R[181];
        if (GLFW.glfwGetKey((long)kotakbaz.rain.client.extensions.b.getMc().getWindow().getHandle(), (int)key) == (n2 += R[182])) {
            boolean bl2 = R[183];
            bl2 += R[184];
            bl = bl2 += R[185];
        } else {
            boolean bl3 = R[186];
            bl3 ^= R[187];
            bl = bl3 -= R[188];
        }
        return bl;
    }

    private final double minZoom() {
        return 1.0;
    }

    private final double maxZoomValue() {
        return Double.longBitsToDouble(0xDFE3D8CC313F1C1BL ^ 0x9FBAD8CC313F1C1BL);
    }

    private final double maxScreenZoomValue() {
        return Double.longBitsToDouble(0x51C7E439553BD448L ^ 0x11D3E439553BD448L);
    }

    private final double interpolator() {
        return (double)N * 1.0;
    }

    private final void restoreSmoothCameraIfNeeded() {
        kotakbaz.rain.client.extensions.b.getMc().options.smoothCameraEnabled = H;
    }

    private final void resetTransforms() {
        o = (Matrix3x2fc)new Matrix3x2f();
        O = (Matrix3x2fc)new Matrix3x2f();
    }

    private final float nudge(float value2, float target) {
        return Math.abs(target - value2) < 0.005f ? target : value2;
    }

    static {
        ZoomModule.b();
        long l2 = 5559919127556656317L;
        long l3 = 8984679892050689188L;
        long l4 = -8787351327058315209L;
        long l5 = -3509102034402853260L;
        long l6 = 59679067623140955L;
        long l7 = -822666316169166924L;
        long l8 = 8826076570120994988L;
        long l9 = -971299035166062739L;
        long l10 = 8343086335352320479L;
        long l11 = -1988027669870982353L;
        long l12 = 8593447419201310162L;
        long l13 = 7625612016699509281L;
        long l14 = -6025185015318410051L;
        long l15 = 3523757077926643033L;
        int n2 = R[189];
        n2 -= R[190];
        p = new Object[n2 ^= R[191]];
        long l16 = l15;
        int n3 = R[192];
        n3 ^= R[193];
        l15 = l16 ^ (0L ^ l16) & -1L << (n3 -= R[194]);
        Object[] objectArray = new Object[R[195]];
        objectArray[ZoomModule.R[196]] = P;
        objectArray[ZoomModule.R[197]] = R[198];
        int n4 = R[199];
        Object object = ZoomModule.A()[R[200]];
        if (object == null) {
            char[] cArray = "\u5b0c\u5caf\u5cdf\u5ca4\u5b02\u5ce0\u5caa\u5b0d\u5b10\u5cb5\u5cb4\u5cd4\u5ca2\u5cd4\u5cd6\u5ce0\u5ae6\u5ae8\u5c78\u5b0f\u5ce0\u5ca9\u5cc3\u5cdd\u5b01\u5ca3\u5cd5\u5cc0\u5b10\u5cb3\u5b10\u5cb6\u5cd4\u5c71\u5cbb\u5c77\u5cac\u5cd5\u5b01\u5b04\u5ca4\u5cd8\u5b02\u5cd7\u5cb3\u5ca4\u5b0d\u5c72\u5b02\u5b0c\u5cd3\u5cd5\u5c77\u5cd4\u5cae\u5c74\u5ca2\u5ae8\u5b02\u5cd4\u5cac\u5c71\u5ca2\u5b0c\u5cbd\u5c78\u5c71\u5ca3\u5c78\u5cb3\u5cc8\u5cc0\u5cd6\u5cdd\u5c76\u5cdf\u5cb3\u5b02\u5cb8\u5cca\u5b10\u5b0e\u5cc5\u5b09\u5cc6\u5ae8\u5c80\u5c7f\u5c7f\u5cdd\u5cc5\u5cd1\u5cbb\u5cbd\u5b02\u5cd2\u5b09\u5c74\u5cd7\u5b09\u5b10\u5cd3\u5ca9\u5b0e\u5c72\u5b02\u5cd4\u5ca1\u5cc5\u5c78\u5cca\u5c80\u5c77\u5c71\u5cb6\u5cd3\u5cd3\u5cad\u5cc5\u5cb1\u5ae6\u5cc3\u5c71\u5cd1\u5ca4\u5b09\u5cdf\u5b0d\u5cdf\u5cd3\u5c75\u5ae8\u5cc8\u5cc0\u5ae5\u5b0d\u5cbd\u5b0f\u5ae8\u5cd3\u5c74\u5c80\u5b0a\u5cd1\u5cb4\u5ca4\u5cd5\u5cb1\u5cad\u5ca3\u5ca1\u5caf\u5c80\u5cdd\u5cb8\u5cd7\u5cdf\u5ae5\u5cd5\u5c63\u5cae\u5ae6\u5cd2\u5cbd\u5cb5\u5cb6\u5ca9\u5ce0\u5cca\u5caa\u5cb4\u5c76\u5cb0\u5cb4\u5ca4\u5cb7\u5cb4\u5b02\u5cdf\u5b09\u5cd2\u5cce\u5b0f\u5cbd\u5ae8\u5c74\u5ce0\u5b01\u5cd8\u5cca\u5c7f\u5cca\u5cc5\u5b0a\u5c77\u5cc0\u5cd3\u5cca\u5cd3\u5cd2\u5b0a\u5cb0\u5ca3\u5caa\u5b0e\u5cb2\u5ca1\u5cc6\u5cb0\u5cdb\u5b09\u5b0d\u5caa\u5b04\u5c77\u5b0a\u5b0f\u5ae8\u5b0f\u5cac\u5cb7\u5cd7\u5c80\u5b10\u5cd6\u5c78\u5c80\u5cd1\u5b09\u5c76\u5cdf\u5cd1\u5cdd\u5b02\u5ca9\u5caf\u5cd5\u5c71\u5b04\u5b10\u5c7f\u5cd4\u5c63\u5b0e\u5cd3\u5cb5\u5cc3\u5c72\u5ca9\u5cdb\u5cad\u5cac\u5c75\u5cc3\u5cb8\u5cb4\u5b0d\u5cca\u5cb1\u5ce0\u5ca4\u5ae6\u5c74\u5cad\u5ca2\u5b0e\u5cca\u5cd5\u5cb5\u5ae5\u5cd5\u5cc3\u5b01\u5cd8\u5cd5\u5cbf\u5cbb\u5cca\u5c76\u5cc3\u5cb8\u5cc8\u5cb0\u5ca2\u5cbb\u5cb6\u5ca1\u5cb4\u5cbf\u5b09\u5c7f\u5c74\u5ae6\u5cdd\u5cd7\u5cbb\u5cae\u5cc8\u5b0a\u5cd4\u5cb4\u5b0a\u5b02\u5caa\u5cb2\u5cd8\u5c7f\u5cd3\u5c74\u5ca3\u5b0d\u5cb3\u5cb7\u5b0c\u5b04\u5cbb\u5b0c\u5b01\u5ca2\u5cdf\u5cbd\u5cd4\u5b09\u5cd5\u5c76\u5b0d\u5caf\u5c80\u5cdf\u5ca2\u5c7f\u5ca4\u5cb7\u5cb6\u5c77\u5cc8\u5b0d\u5cb3\u5cac\u5cc5\u5cd5\u5ae8\u5c7c\u5c7c".toCharArray();
            for (int i2 = R[201]; i2 < R[202]; ++i2) {
                int n5 = cArray[i2];
                n5 -= R[203];
                n5 += R[204];
                n5 -= R[205];
                n5 -= R[206];
                n5 -= R[207];
                n5 += R[208];
                n5 += R[209];
                n5 ^= R[210];
                n5 += R[211];
                n5 += R[212];
                n5 -= R[213];
                n5 ^= R[214];
                n5 -= R[215];
                n5 ^= R[216];
                n5 -= R[217];
                cArray[i2] = (char)(n5 -= R[218]);
            }
            object = ZoomModule.A()[ZoomModule.R[219]] = new String(cArray);
        }
        objectArray[n4] = (String)object;
        char[] cArray = ((String)ZoomModule.a(objectArray)).toCharArray();
        long l17 = l6;
        int n6 = R[220];
        n6 += R[221];
        l6 = l17 ^ (0x8A00000000L ^ l17) & -1L << (n6 -= R[222]);
        long l18 = l13;
        int n7 = R[223];
        n7 += R[224];
        l13 = l18 ^ (0L ^ l18) & -1L >>> (n7 ^= R[225]);
        while (true) {
            int n8 = R[226];
            n8 += R[227];
            if ((int)l13 >= (int)(l6 >>> (n8 += R[228]))) break;
            int n9 = (int)l13;
            long l19 = l13;
            int n10 = R[229];
            n10 += R[230];
            int n11 = R[232];
            n11 += R[233];
            l13 = l19 ^ (l19 ^ l19 + (long)(n10 += R[231])) & -1L >>> (n11 += R[234]);
            long l20 = l9;
            int n12 = R[235];
            n12 -= R[236];
            l9 = l20 ^ ((long)cArray[n9] ^ l20) & -1L >>> (n12 ^= R[237]);
            int n13 = (int)l13;
            long l21 = l13;
            int n14 = R[238];
            n14 ^= R[239];
            int n15 = R[241];
            n15 -= R[242];
            l13 = l21 ^ (l21 ^ l21 + (long)(n14 ^= R[240])) & -1L >>> (n15 += R[243]);
            int n16 = R[244];
            n16 ^= R[245];
            long l22 = l10;
            int n17 = R[247];
            n17 ^= R[248];
            l10 = l22 ^ ((long)cArray[n13] << (n16 += R[246]) ^ l22) & -1L << (n17 -= R[249]);
            int n18 = R[250];
            n18 += R[251];
            n18 ^= R[252];
            int n19 = R[253];
            n19 -= R[254];
            long l23 = l12;
            int n20 = R[256];
            n20 ^= R[257];
            l12 = l23 ^ ((long)((int)l9 << n18 | (int)(l10 >>> (n19 += R[255]))) ^ l23) & -1L >>> (n20 += R[258]);
            char[] cArray2 = new char[(int)l12];
            long l24 = l14;
            int n21 = R[259];
            n21 += R[260];
            l14 = l24 ^ (0L ^ l24) & -1L << (n21 ^= R[261]);
            while (true) {
                int n22 = R[262];
                n22 += R[263];
                if ((int)(l14 >>> (n22 += R[264])) >= (int)l12) break;
                int n23 = R[265];
                n23 -= R[266];
                int n24 = R[268];
                n24 -= R[269];
                cArray2[(int)(l14 >>> (n23 += ZoomModule.R[267]))] = cArray[(int)l13 + (int)(l14 >>> (n24 -= R[270]))];
                l14 += 0x100000000L;
            }
            int n25 = R[271];
            n25 -= R[272];
            int n26 = (int)(l15 >>> (n25 += R[273]));
            l15 += 0x100000000L;
            ZoomModule.p[n26] = new String(cArray2);
            long l25 = l13;
            int n27 = R[274];
            n27 -= R[275];
            l13 = l25 ^ ((long)((int)l13 + (int)l12) ^ l25) & -1L >>> (n27 += R[276]);
        }
        INSTANCE = new ZoomModule();
        int n28 = R[277];
        n28 ^= R[278];
        int n29 = R[280];
        n29 += R[281];
        F = INSTANCE.bind((String)p[n28 ^= R[279]], n29 += R[282]);
        int n30 = R[283];
        n30 ^= R[284];
        int n31 = R[286];
        n31 ^= R[287];
        boolean bl = R[289];
        bl -= R[290];
        g = INSTANCE.cfr_renamed_0((String)p[n30 ^= R[285]] + (String)p[n31 ^= R[288]], bl += R[291]);
        int n32 = R[292];
        n32 ^= R[293];
        int n33 = R[295];
        n33 ^= R[296];
        G = INSTANCE.slider((String)p[n32 -= R[294]] + (String)p[n33 ^= R[297]], 5.0f, 2.0f, 15.0f, 0.1f);
        int n34 = R[298];
        n34 -= R[299];
        int n35 = R[301];
        n35 -= R[302];
        h = INSTANCE.slider((String)p[n34 += R[300]] + (String)p[n35 -= R[303]], 1.0f, 0.1f, 5.0f, 0.1f);
        J = ((Number)G.getValue()).floatValue();
        k = 1.0;
        K = 1.0;
        l = 1.0;
        m = 1.0f;
        N = 1.0f;
        o = (Matrix3x2fc)new Matrix3x2f();
        O = (Matrix3x2fc)new Matrix3x2f();
    }

    public static Object a(Object[] object) {
        Object object2;
        int n2 = (Integer)object[R[304]];
        String string = (String)object[R[305]];
        object = object[R[306]];
        Object[] objectArray = Q;
        if (Q == null) {
            objectArray = Q = new Object[R[307]];
        }
        if ((object2 = objectArray[n2]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[R[308]];
                P = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[R[310] ^ R[311]];
                byArray[ZoomModule.R[312] ^ ZoomModule.R[313]] = R[314] ^ R[315];
                byArray[ZoomModule.R[316] ^ ZoomModule.R[317]] = R[318] ^ R[319];
                byArray[ZoomModule.R[320] ^ ZoomModule.R[321]] = R[322] ^ R[323];
                byArray[ZoomModule.R[324] ^ ZoomModule.R[325]] = R[326] ^ R[327];
                byArray[ZoomModule.R[328] ^ ZoomModule.R[329]] = R[330] ^ R[331];
                byArray[ZoomModule.R[332] ^ ZoomModule.R[333]] = R[334] ^ R[335];
                byArray[ZoomModule.R[336] ^ ZoomModule.R[337]] = R[338] ^ R[339];
                byArray[ZoomModule.R[340] ^ ZoomModule.R[341]] = R[342] ^ R[343];
                byArray[ZoomModule.R[344] ^ ZoomModule.R[345]] = R[346] ^ R[347];
                byArray[ZoomModule.R[348] ^ ZoomModule.R[349]] = R[350] ^ R[351];
                byArray[ZoomModule.R[352] ^ ZoomModule.R[353]] = R[354] ^ R[355];
                byArray[ZoomModule.R[356] ^ ZoomModule.R[357]] = R[358] ^ R[359];
                byArray[ZoomModule.R[360] ^ ZoomModule.R[361]] = R[362] ^ R[363];
                byArray[ZoomModule.R[364] ^ ZoomModule.R[365]] = R[366] ^ R[367];
                byArray[ZoomModule.R[368] ^ ZoomModule.R[369]] = R[370] ^ R[371];
                byArray[ZoomModule.R[372] ^ ZoomModule.R[373]] = R[374] ^ R[375];
                objectArray2[ZoomModule.R[309]] = byArray;
            }
            byte[] byArray = (byte[])object3[R[376]];
            if (q == null) {
                byte[] byArray2 = new byte[R[377] ^ R[378]];
                byArray2[ZoomModule.R[379] ^ ZoomModule.R[380]] = R[381] ^ R[382];
                byArray2[ZoomModule.R[383] ^ ZoomModule.R[384]] = R[385] ^ R[386];
                byArray2[ZoomModule.R[387] ^ ZoomModule.R[388]] = R[389] ^ R[390];
                byArray2[ZoomModule.R[391] ^ ZoomModule.R[392]] = R[393] ^ R[394];
                byArray2[ZoomModule.R[395] ^ ZoomModule.R[396]] = R[397] ^ R[398];
                byArray2[ZoomModule.R[399] ^ 0x1F9B] = 0xFFFFE010 ^ 0x1F9B;
                byArray2[0xEEB4 ^ 0xEEAF] = 0xFFFF1169 ^ 0xEEAF;
                byArray2[0x3C6F ^ 0x3C6D] = 0x3C1D ^ 0x3C6D;
                byArray2[0x6695 ^ 0x669D] = 0xFFFF9931 ^ 0x669D;
                byArray2[0xDF40 ^ 0xDF5F] = 0xFFFF20A8 ^ 0xDF5F;
                byArray2[0xF20E ^ 0xF203] = 0xFFFF0DA7 ^ 0xF203;
                byArray2[0x47C3 ^ 0x47DB] = 0x47B0 ^ 0x47DB;
                byArray2[0x4AD3 ^ 0x4ACF] = 0x4ACC ^ 0x4ACF;
                byArray2[0x6EBE ^ 0x6EB1] = 0x6EAE ^ 0x6EB1;
                byArray2[0x42D8 ^ 0x42C6] = 0xFFFFBD0E ^ 0x42C6;
                byArray2[0x7C13 ^ 0x7C02] = 0xFFFF838B ^ 0x7C02;
                byArray2[0x3492 ^ 0x3494] = 0xFFFFCB18 ^ 0x3494;
                byArray2[0x442F ^ 0x442B] = 0x4437 ^ 0x442B;
                byArray2[0xC825 ^ 0xC837] = 0xFFFF378D ^ 0xC837;
                byArray2[0xD9C6 ^ 0xD9C7] = 0xD9C5 ^ 0xD9C7;
                byArray2[0xE1F1 ^ 0xE1EB] = 0xE1B3 ^ 0xE1EB;
                byArray2[0xFE59 ^ 0xFE57] = 0xFFFF0191 ^ 0xFE57;
                byArray2[0x1262 ^ 0x1276] = 0x1249 ^ 0x1276;
                byArray2[0xCED0 ^ 0xCEC6] = 0xFFFF3161 ^ 0xCEC6;
                byArray2[0xD449 ^ 0xD45A] = 0xFFFF2BD6 ^ 0xD45A;
                byArray2[0x7876 ^ 0x787D] = 0x7853 ^ 0x787D;
                byArray2[0x3977 ^ 0x396E] = 0x3930 ^ 0x396E;
                byArray2[0xEE85 ^ 0xEE80] = 0xEE9D ^ 0xEE80;
                byArray2[0x86CD ^ 0x86DA] = 0x86D9 ^ 0x86DA;
                byArray2[0xBDCF ^ 0xBDC3] = 0xFFFF4234 ^ 0xBDC3;
                byArray2[0x395E ^ 0x3943] = 0x394E ^ 0x3943;
                byArray2[0x7129 ^ 0x7139] = 0xFFFF8EA6 ^ 0x7139;
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, 0, byArray3, 0, byArray.length);
                System.arraycopy(byArray2, 0, byArray3, byArray.length, byArray2.length);
                Object object4 = ZoomModule.A()[1];
                if (object4 == null) {
                    char[] cArray = "\u8d13\u8d1d\u8d14\u8d1f\u8d19\u8d2d\u8d08\u8cfa\u8cef\u8cfb\u8d1b\u8cf6\u8d02\u8cfc\u8d0c\u8d1b\u8d22\u8d32".toCharArray();
                    for (int i2 = 0; i2 < 18; ++i2) {
                        int n3 = cArray[i2];
                        n3 += 17856;
                        n3 ^= 0x9731;
                        n3 -= 45921;
                        n3 -= 50434;
                        n3 += 46883;
                        n3 ^= 0xCB34;
                        n3 += 44616;
                        n3 ^= 0xB278;
                        n3 += 57081;
                        n3 += 55081;
                        n3 -= 8747;
                        cArray[i2] = (char)(n3 -= 58189);
                    }
                    object4 = ZoomModule.A()[1] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[16];
                byArray4[9] = 69;
                byArray4[11] = -68;
                byArray4[10] = -24;
                byArray4[1] = 4;
                byArray4[0] = -8;
                byArray4[4] = 81;
                byArray4[2] = 4;
                byArray4[5] = 12;
                byArray4[6] = 93;
                byArray4[3] = 47;
                byArray4[14] = -81;
                byArray4[13] = -16;
                byArray4[8] = -4;
                byArray4[12] = -7;
                byArray4[7] = 96;
                byArray4[15] = 95;
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, 10, 256);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = ZoomModule.A()[2];
                if (object5 == null) {
                    char[] cArray = "\u771e\u771a\u7714".toCharArray();
                    for (int i3 = 0; i3 < 3; ++i3) {
                        int n4 = cArray[i3];
                        n4 ^= 0x52E0;
                        n4 -= 31040;
                        n4 += 32004;
                        n4 -= 42887;
                        n4 -= 62538;
                        n4 += 780;
                        n4 ^= 0x9410;
                        n4 ^= 0xCB73;
                        n4 -= 23348;
                        n4 += 20315;
                        n4 += 35676;
                        n4 += 11740;
                        cArray[i3] = (char)(n4 ^= 0x7CBC);
                    }
                    object5 = ZoomModule.A()[2] = new String(cArray);
                }
                q = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, 0, 16);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, 16, byArray6.length);
            Object object6 = ZoomModule.A()[3];
            if (object6 == null) {
                char[] cArray = "\u2652\u2656\u27a4\u2740\u2654\u2653\u2654\u2740\u27a1\u264c\u2654\u27a4\u2746\u27a1\u27b2\u27b5\u27b5\u27aa\u278f\u27a8".toCharArray();
                for (int i4 = 0; i4 < 20; ++i4) {
                    int n5 = cArray[i4];
                    n5 ^= 0x84A7;
                    n5 -= 30953;
                    n5 ^= 0xFA8F;
                    n5 -= 20593;
                    n5 -= 10324;
                    n5 += 11062;
                    n5 -= 33910;
                    n5 -= 18840;
                    n5 -= 34745;
                    n5 += 54748;
                    n5 += 2653;
                    n5 += 32893;
                    cArray[i4] = (char)(n5 += 29278);
                }
                object6 = ZoomModule.A()[3] = new String(cArray);
            }
            Cipher cipher = Cipher.getInstance((String)object6);
            cipher.init(2, (Key)((SecretKey)q), new IvParameterSpec(byArray7));
            byte[] byArray9 = cipher.doFinal(byArray8);
            object2 = new String(byArray9, StandardCharsets.UTF_8);
        }
        return object2;
    }

    private static Object[] A() {
        Object[] objectArray = r;
        if (r == null) {
            r = new Object[4];
            objectArray = r;
        }
        return objectArray;
    }

    public static void b() {
        R = new int[0x3BE9 ^ 0x3A79];
        ZoomModule.R[0x3579 ^ 0x359D] = 0xFFFFCA34 ^ 0x359D;
        ZoomModule.R[0xD59B ^ 0xD4EC] = 0x64E0 ^ 0xD4EC;
        ZoomModule.R[0xD234 ^ 0xD2F7] = 0xD2F4 ^ 0xD2F7;
        ZoomModule.R[0xF469 ^ 0xF574] = 0xFFFF0A8D ^ 0xF574;
        ZoomModule.R[0x46F5 ^ 0x46CA] = 0x476B ^ 0x46CA;
        ZoomModule.R[0x53B ^ 0x56F] = 0x54B ^ 0x56F;
        ZoomModule.R[0x5487 ^ 0x54CA] = 0x54D5 ^ 0x54CA;
        ZoomModule.R[0xAAF6 ^ 0xABDD] = 0xABAA ^ 0xABDD;
        ZoomModule.R[0xD79 ^ 0xD67] = 0xFFFFF2C7 ^ 0xD67;
        ZoomModule.R[0x3329 ^ 0x33D7] = 0x33D2 ^ 0x33D7;
        ZoomModule.R[0x4B30 ^ 0x4A76] = 0xCCB6 ^ 0x4A76;
        ZoomModule.R[0x220 ^ 0x229] = 0xFFFFFD9A ^ 0x229;
        ZoomModule.R[0xAF10 ^ 0xAE08] = 0xFFFF51DC ^ 0xAE08;
        ZoomModule.R[0x19FE ^ 0x18E4] = 0x18BA ^ 0x18E4;
        ZoomModule.R[0xE51C ^ 0xE5E4] = 0xFFFF1A06 ^ 0xE5E4;
        ZoomModule.R[0x75C5 ^ 0x7510] = 0x2348 ^ 0x7510;
        ZoomModule.R[0x8332 ^ 0x8315] = 0x833F ^ 0x8315;
        ZoomModule.R[0x73CE ^ 0x7375] = 0xFFFF8CC0 ^ 0x7375;
        ZoomModule.R[0xBBBA ^ 0xBBBE] = 0xFFFF4434 ^ 0xBBBE;
        ZoomModule.R[0xE341 ^ 0xE23F] = 0x1973 ^ 0xE23F;
        ZoomModule.R[0x170F ^ 0x1774] = 0x17F7 ^ 0x1774;
        ZoomModule.R[0x3BB6 ^ 0x3B6B] = 0xFFFFC4D4 ^ 0x3B6B;
        ZoomModule.R[0xF9FD ^ 0xF994] = 0xF914 ^ 0xF994;
        ZoomModule.R[0x3F2D ^ 0x3F37] = 0x3F20 ^ 0x3F37;
        ZoomModule.R[0x8DB0 ^ 0x8DC9] = 0xFFFF7203 ^ 0x8DC9;
        ZoomModule.R[0xF247 ^ 0xF20B] = 0xFFFF0DBC ^ 0xF20B;
        ZoomModule.R[0x3834 ^ 0x38EC] = 0x7C30 ^ 0x38EC;
        ZoomModule.R[0xDB3C ^ 0xDBF0] = 0xA159 ^ 0xDBF0;
        ZoomModule.R[0x7AEF ^ 0x7AD9] = 0x7AC2 ^ 0x7AD9;
        ZoomModule.R[0xF527 ^ 0xF5E2] = 0xF5E3 ^ 0xF5E2;
        ZoomModule.R[0x234 ^ 0x326] = 0xFFFFFCBC ^ 0x326;
        ZoomModule.R[0x82B7 ^ 0x8264] = 0xCF37 ^ 0x8264;
        ZoomModule.R[0x166A ^ 0x167D] = 0xFFFFE9EC ^ 0x167D;
        ZoomModule.R[0xA36C ^ 0xA3B3] = 0xFFFF5C55 ^ 0xA3B3;
        ZoomModule.R[0x4CAD ^ 0x4CFF] = 0x4CA7 ^ 0x4CFF;
        ZoomModule.R[0x7940 ^ 0x7999] = 0x4EC4 ^ 0x7999;
        ZoomModule.R[0xAA9F ^ 0xAAF2] = 0xAAF5 ^ 0xAAF2;
        ZoomModule.R[0x11F5 ^ 0x11F0] = 0x119B ^ 0x11F0;
        ZoomModule.R[0xABAE ^ 0xAAD6] = 0xAAD6 ^ 0xAAD6;
        ZoomModule.R[0x7507 ^ 0x7526] = 0x7568 ^ 0x7526;
        ZoomModule.R[0xAE85 ^ 0xAEC5] = 0xAEBC ^ 0xAEC5;
        ZoomModule.R[0x33B1 ^ 0x32EB] = 0xFFFFCAE6 ^ 0x32EB;
        ZoomModule.R[0xFF16 ^ 0xFE69] = 0x7D42 ^ 0xFE69;
        ZoomModule.R[0x39FA ^ 0x39B0] = 0x39DF ^ 0x39B0;
        ZoomModule.R[0x4F06 ^ 0x4E08] = 0x4E0E ^ 0x4E08;
        ZoomModule.R[0xDC3F ^ 0xDC13] = 0xDC19 ^ 0xDC13;
        ZoomModule.R[0x9121 ^ 0x912D] = 0xFFFF6EFB ^ 0x912D;
        ZoomModule.R[0x964B ^ 0x96EE] = 0xFFFF6981 ^ 0x96EE;
        ZoomModule.R[0xE2EE ^ 0xE25D] = 0xE264 ^ 0xE25D;
        ZoomModule.R[0xE6EC ^ 0xE768] = 0x4FC7 ^ 0xE768;
        ZoomModule.R[0xB3A5 ^ 0xB346] = 0xFFFF4CCD ^ 0xB346;
        ZoomModule.R[0x6379 ^ 0x6352] = 0x6336 ^ 0x6352;
        ZoomModule.R[0xE607 ^ 0xE651] = 0xFFFF19E2 ^ 0xE651;
        ZoomModule.R[0xBA75 ^ 0xBB69] = 0xBB18 ^ 0xBB69;
        ZoomModule.R[0x6FD2 ^ 0x6FCE] = 0xFFFF9022 ^ 0x6FCE;
        ZoomModule.R[0xD115 ^ 0xD17D] = 0xFFFF2EDD ^ 0xD17D;
        ZoomModule.R[0x6317 ^ 0x63EE] = 0x63D3 ^ 0x63EE;
        ZoomModule.R[0x3392 ^ 0x333C] = 0x3361 ^ 0x333C;
        ZoomModule.R[0xA167 ^ 0xA123] = 0xA156 ^ 0xA123;
        ZoomModule.R[0x21D7 ^ 0x218D] = 0xFFFFDE76 ^ 0x218D;
        ZoomModule.R[0xDA9 ^ 0xD27] = 0xFFFFF29F ^ 0xD27;
        ZoomModule.R[0xB538 ^ 0xB590] = 0xB5A2 ^ 0xB590;
        ZoomModule.R[0xAE5E ^ 0xAF08] = 0xFFFF4635 ^ 0xAF08;
        ZoomModule.R[0xADC8 ^ 0xACCA] = 0xFFFF531D ^ 0xACCA;
        ZoomModule.R[0x6F08 ^ 0x6FF5] = 0x6FF8 ^ 0x6FF5;
        ZoomModule.R[0x8404 ^ 0x851D] = 0x850C ^ 0x851D;
        ZoomModule.R[0x1E45 ^ 0x1EEE] = 0x1ED9 ^ 0x1EEE;
        ZoomModule.R[0xDCDD ^ 0xDC4E] = 0xFFFF239E ^ 0xDC4E;
        ZoomModule.R[0x3A18 ^ 0x3ACC] = 0x2178 ^ 0x3ACC;
        ZoomModule.R[0x758C ^ 0x75F6] = 0xFFFF8A11 ^ 0x75F6;
        ZoomModule.R[0xF4AD ^ 0xF5BA] = 0xF5E0 ^ 0xF5BA;
        ZoomModule.R[0x228 ^ 0x34C] = 0xB670 ^ 0x34C;
        ZoomModule.R[0xF468 ^ 0xF465] = 0xFFFF0BDC ^ 0xF465;
        ZoomModule.R[0xD0AB ^ 0xD0F8] = 0xFFFF2F48 ^ 0xD0F8;
        ZoomModule.R[0xB7DB ^ 0xB729] = 0xFFFF48F0 ^ 0xB729;
        ZoomModule.R[0xA1ED ^ 0xA0E8] = 0xA0CE ^ 0xA0E8;
        ZoomModule.R[0x43DD ^ 0x425A] = 0x5C55 ^ 0x425A;
        ZoomModule.R[0x183A ^ 0x187F] = 0x1850 ^ 0x187F;
        ZoomModule.R[0xE2AD ^ 0xE219] = 0xFFFF1D86 ^ 0xE219;
        ZoomModule.R[0x7F4D ^ 0x7E75] = 0xB44F ^ 0x7E75;
        ZoomModule.R[0x7DD1 ^ 0x7CFF] = 0xFFFF8331 ^ 0x7CFF;
        ZoomModule.R[0x4EAE ^ 0x4FDD] = 0x74B8 ^ 0x4FDD;
        ZoomModule.R[0x4892 ^ 0x4918] = 0x571E ^ 0x4918;
        ZoomModule.R[0xB472 ^ 0xB49B] = 0xFFFF4B02 ^ 0xB49B;
        ZoomModule.R[0x3888 ^ 0x3898] = 0x388B ^ 0x3898;
        ZoomModule.R[0x103B3 ^ 0x10235] = 0x1AA9A ^ 0x10235;
        ZoomModule.R[0x7A74 ^ 0x7BFA] = 0x477F ^ 0x7BFA;
        ZoomModule.R[0x409B ^ 0x40D3] = 0x4095 ^ 0x40D3;
        ZoomModule.R[0x7672 ^ 0x7645] = 0x7625 ^ 0x7645;
        ZoomModule.R[0x30C2 ^ 0x3003] = 0xFFFFCFC1 ^ 0x3003;
        ZoomModule.R[0x8525 ^ 0x8526] = 0x8535 ^ 0x8526;
        ZoomModule.R[0x10FE8 ^ 0x10F1F] = 0xFFFEF0A0 ^ 0x10F1F;
        ZoomModule.R[0xEDE0 ^ 0xECD9] = 0x26EE ^ 0xECD9;
        ZoomModule.R[0x69FC ^ 0x68B6] = 0xFFFE90EE ^ 0x68B6;
        ZoomModule.R[0x3251 ^ 0x3274] = 0xFFFFCDBD ^ 0x3274;
        ZoomModule.R[0x7AE3 ^ 0x7A63] = 0x7A24 ^ 0x7A63;
        ZoomModule.R[0x53EE ^ 0x539B] = 0x53B7 ^ 0x539B;
        ZoomModule.R[0x1088A ^ 0x10854] = 0x1081D ^ 0x10854;
        ZoomModule.R[0xD65A ^ 0xD72E] = 0x672D ^ 0xD72E;
        ZoomModule.R[0x9E8D ^ 0x9E38] = 0xFFFF61C0 ^ 0x9E38;
        ZoomModule.R[0xF428 ^ 0xF5A1] = 0xFFFF146C ^ 0xF5A1;
        ZoomModule.R[0x84 ^ 0x1A3] = 0x1EA ^ 0x1A3;
        ZoomModule.R[0x109CB ^ 0x108F1] = 0xFFFE3D28 ^ 0x108F1;
        ZoomModule.R[0x4A51 ^ 0x4B0D] = 0xF427 ^ 0x4B0D;
        ZoomModule.R[0x71A ^ 0x783] = 0x704 ^ 0x783;
        ZoomModule.R[0x4C08 ^ 0x4CE8] = 0x4CD8 ^ 0x4CE8;
        ZoomModule.R[0xDD4F ^ 0xDCC7] = 0xC2C1 ^ 0xDCC7;
        ZoomModule.R[0x8E70 ^ 0x8F4B] = 0x457C ^ 0x8F4B;
        ZoomModule.R[0xFBEB ^ 0xFAEF] = 0xFFFF0535 ^ 0xFAEF;
        ZoomModule.R[0x4BB4 ^ 0x4BD8] = 0x4B91 ^ 0x4BD8;
        ZoomModule.R[0xEDB6 ^ 0xECD8] = 0xFFFF70DF ^ 0xECD8;
        ZoomModule.R[0x2D3E ^ 0x2C42] = 0xD70E ^ 0x2C42;
        ZoomModule.R[0xF382 ^ 0xF376] = 0xFFFF0CC6 ^ 0xF376;
        ZoomModule.R[0x6BD3 ^ 0x6A81] = 0xD2A0 ^ 0x6A81;
        ZoomModule.R[0x325D ^ 0x32E7] = 0x32D7 ^ 0x32E7;
        ZoomModule.R[0x309F ^ 0x30CE] = 0xFFFFCF97 ^ 0x30CE;
        ZoomModule.R[0x5929 ^ 0x5962] = 0xFFFFA694 ^ 0x5962;
        ZoomModule.R[0x18F4 ^ 0x1985] = 0x22E0 ^ 0x1985;
        ZoomModule.R[0x8E77 ^ 0x8E35] = 0x8EAA ^ 0x8E35;
        ZoomModule.R[0xE42F ^ 0xE503] = 0xFFFF1AC0 ^ 0xE503;
        ZoomModule.R[0xF12A ^ 0xF04A] = 0x471E ^ 0xF04A;
        ZoomModule.R[0x3AD7 ^ 0x3A4C] = 0x3A10 ^ 0x3A4C;
        ZoomModule.R[0x59E1 ^ 0x58C3] = 0xFFFFA74F ^ 0x58C3;
        ZoomModule.R[0xAE49 ^ 0xAE7C] = 0xAE20 ^ 0xAE7C;
        ZoomModule.R[0x7635 ^ 0x776A] = 0xC846 ^ 0x776A;
        ZoomModule.R[0x8A3A ^ 0x8AFD] = 0x8AFF ^ 0x8AFD;
        ZoomModule.R[0x1019F ^ 0x1018D] = 0xFFFEFE6A ^ 0x1018D;
        ZoomModule.R[0xB19 ^ 0xB36] = 0xB4C ^ 0xB36;
        ZoomModule.R[0xC05 ^ 0xC75] = 0xC10 ^ 0xC75;
        ZoomModule.R[0x65E2 ^ 0x6540] = 0xFFFF9A3D ^ 0x6540;
        ZoomModule.R[0xB134 ^ 0xB073] = 0x36DE ^ 0xB073;
        ZoomModule.R[0xA05B ^ 0xA117] = 0x2F87 ^ 0xA117;
        ZoomModule.R[0x3F1 ^ 0x2EF] = 0x2B3 ^ 0x2EF;
        ZoomModule.R[0xE0C1 ^ 0xE0DE] = 0xE0A0 ^ 0xE0DE;
        ZoomModule.R[0xF8AF ^ 0xF9CE] = 0x4E99 ^ 0xF9CE;
        ZoomModule.R[0x3A1 ^ 0x3E6] = 0xFFFFFC15 ^ 0x3E6;
        ZoomModule.R[0x6362 ^ 0x638F] = 0xFFFF9C6E ^ 0x638F;
        ZoomModule.R[0x6647 ^ 0x66FE] = 0xFFFF9907 ^ 0x66FE;
        ZoomModule.R[0xB554 ^ 0xB4D6] = 0x37FE ^ 0xB4D6;
        ZoomModule.R[0x2413 ^ 0x2526] = 0x2526 ^ 0x2526;
        ZoomModule.R[0x2225 ^ 0x236C] = 0x1248B ^ 0x236C;
        ZoomModule.R[0xA384 ^ 0xA2D9] = 0x1DF5 ^ 0xA2D9;
        ZoomModule.R[0x2550 ^ 0x2422] = 0xFFFFE0FA ^ 0x2422;
        ZoomModule.R[0x901B ^ 0x9068] = 0xFFFF6FA5 ^ 0x9068;
        ZoomModule.R[0x9A3B ^ 0x9AC0] = 0x9AC2 ^ 0x9AC0;
        ZoomModule.R[0x8CCC ^ 0x8C90] = 0xFFFF7307 ^ 0x8C90;
        ZoomModule.R[0x6782 ^ 0x67B9] = 0x6784 ^ 0x67B9;
        ZoomModule.R[0xD834 ^ 0xD8B9] = 0xD8EA ^ 0xD8B9;
        ZoomModule.R[0x866E ^ 0x86AC] = 0x8682 ^ 0x86AC;
        ZoomModule.R[0x85BE ^ 0x85B1] = 0x85DA ^ 0x85B1;
        ZoomModule.R[0xE615 ^ 0xE799] = 0xDB1C ^ 0xE799;
        ZoomModule.R[0xC48B ^ 0xC446] = 0xB64B ^ 0xC446;
        ZoomModule.R[0x6521 ^ 0x6430] = 0x6471 ^ 0x6430;
        ZoomModule.R[0x10140 ^ 0x10189] = 0x10189 ^ 0x10189;
        ZoomModule.R[0x2212 ^ 0x2238] = 0x2256 ^ 0x2238;
        ZoomModule.R[0x4305 ^ 0x427F] = 0x1466D ^ 0x427F;
        ZoomModule.R[0x8075 ^ 0x815A] = 0x813C ^ 0x815A;
        ZoomModule.R[0x7BA9 ^ 0x7BE6] = 0x7BF0 ^ 0x7BE6;
        ZoomModule.R[0xC5EA ^ 0xC574] = 0xFFFF3AE2 ^ 0xC574;
        ZoomModule.R[0x927A ^ 0x934C] = 0x9D22 ^ 0x934C;
        ZoomModule.R[0x30C8 ^ 0x304A] = 0x3019 ^ 0x304A;
        ZoomModule.R[0xF821 ^ 0xF8B0] = 0xF8D4 ^ 0xF8B0;
        ZoomModule.R[0x9E13 ^ 0x9EE9] = 0xFFFF6128 ^ 0x9EE9;
        ZoomModule.R[0x7E32 ^ 0x7E02] = 0x7F76 ^ 0x7E02;
        ZoomModule.R[0x68D4 ^ 0x69D9] = 0x69DC ^ 0x69D9;
        ZoomModule.R[0xF014 ^ 0xF04F] = 0xFFFF0FF3 ^ 0xF04F;
        ZoomModule.R[0xBA38 ^ 0xBAC7] = 0xBADF ^ 0xBAC7;
        ZoomModule.R[0x96F8 ^ 0x9686] = 0x9713 ^ 0x9686;
        ZoomModule.R[0x3326 ^ 0x3390] = 0x33FA ^ 0x3390;
        ZoomModule.R[0x43D0 ^ 0x43BF] = 0x43AD ^ 0x43BF;
        ZoomModule.R[0xAECB ^ 0xAEC3] = 0xAEC9 ^ 0xAEC3;
        ZoomModule.R[0x8571 ^ 0x85AA] = 0x85AA ^ 0x85AA;
        ZoomModule.R[0x93B1 ^ 0x9339] = 0x937E ^ 0x9339;
        ZoomModule.R[0xC99D ^ 0xC97C] = 0xC94A ^ 0xC97C;
        ZoomModule.R[0x5855 ^ 0x5973] = 0x5975 ^ 0x5973;
        ZoomModule.R[0x119D ^ 0x1105] = 0xFFFFEEE4 ^ 0x1105;
        ZoomModule.R[0xB053 ^ 0xB099] = 0xB1C1 ^ 0xB099;
        ZoomModule.R[0xEB70 ^ 0xEA40] = 0xEA41 ^ 0xEA40;
        ZoomModule.R[0xF780 ^ 0xF7B3] = 0xF72D ^ 0xF7B3;
        ZoomModule.R[0xBD0E ^ 0xBD27] = 0xBD68 ^ 0xBD27;
        ZoomModule.R[0xAC6E ^ 0xAD78] = 0xFFFF52AF ^ 0xAD78;
        ZoomModule.R[0xA83E ^ 0xA973] = 0x27EF ^ 0xA973;
        ZoomModule.R[0x519B ^ 0x511D] = 0x5171 ^ 0x511D;
        ZoomModule.R[0x8DDF ^ 0x8D4D] = 0xFFFF72C5 ^ 0x8D4D;
        ZoomModule.R[0xFB26 ^ 0xFB1A] = 0xFB8E ^ 0xFB1A;
        ZoomModule.R[0x7DA9 ^ 0x7D3F] = 0x7D60 ^ 0x7D3F;
        ZoomModule.R[0xE5B2 ^ 0xE5EC] = 0xE5E0 ^ 0xE5EC;
        ZoomModule.R[0xD41A ^ 0xD559] = 0xD5D8 ^ 0xD559;
        ZoomModule.R[0xAEE5 ^ 0xAFE5] = 0xAF8E ^ 0xAFE5;
        ZoomModule.R[0x46CE ^ 0x4786] = 0x14061 ^ 0x4786;
        ZoomModule.R[0x3498 ^ 0x35DD] = 0xB370 ^ 0x35DD;
        ZoomModule.R[0xA412 ^ 0xA423] = 0xFFFF5B95 ^ 0xA423;
        ZoomModule.R[0xBAD1 ^ 0xBAC5] = 0xFFFF4557 ^ 0xBAC5;
        ZoomModule.R[0xF332 ^ 0xF395] = 0xFFFF0C0B ^ 0xF395;
        ZoomModule.R[0x87C ^ 0x956] = 0x9ED ^ 0x956;
        ZoomModule.R[0x55FA ^ 0x5560] = 0xFFFFAAB5 ^ 0x5560;
        ZoomModule.R[0x7C6D ^ 0x7C8B] = 0xFFFF8370 ^ 0x7C8B;
        ZoomModule.R[0xC7D1 ^ 0xC6F8] = 0xC6C1 ^ 0xC6F8;
        ZoomModule.R[0x9AAE ^ 0x9A90] = 0x9AEC ^ 0x9A90;
        ZoomModule.R[0xF61E ^ 0xF6B1] = 0xF6DC ^ 0xF6B1;
        ZoomModule.R[0xE094 ^ 0xE030] = 0xFFFF1F93 ^ 0xE030;
        ZoomModule.R[0xF267 ^ 0xF2E2] = 0xFFFF0D19 ^ 0xF2E2;
        ZoomModule.R[0xE1CD ^ 0xE1E3] = 0xE1EB ^ 0xE1E3;
        ZoomModule.R[0x3190 ^ 0x31F5] = 0xFFFFCE27 ^ 0x31F5;
        ZoomModule.R[0xD8DD ^ 0xD80A] = 0xA8F1 ^ 0xD80A;
        ZoomModule.R[0xD8FB ^ 0xD8E8] = 0xD89C ^ 0xD8E8;
        ZoomModule.R[0xE051 ^ 0xE03B] = 0xE03B ^ 0xE03B;
        ZoomModule.R[0xB12C ^ 0xB17B] = 0xFFFF4EFE ^ 0xB17B;
        ZoomModule.R[0x62B0 ^ 0x62E0] = 0x6298 ^ 0x62E0;
        ZoomModule.R[0x77B9 ^ 0x768E] = 0x78F0 ^ 0x768E;
        ZoomModule.R[0x3A5A ^ 0x3AE8] = 0x3AB0 ^ 0x3AE8;
        ZoomModule.R[0x6107 ^ 0x6026] = 0xFFFF9FEA ^ 0x6026;
        ZoomModule.R[0x99 ^ 0x114] = 0x3DB2 ^ 0x114;
        ZoomModule.R[0x9281 ^ 0x9300] = 0x1009 ^ 0x9300;
        ZoomModule.R[0x10B7B ^ 0x10B03] = 0x10B53 ^ 0x10B03;
        ZoomModule.R[0x1FF ^ 0x1B9] = 0x198 ^ 0x1B9;
        ZoomModule.R[0xE83B ^ 0xE844] = 0xFFFF17FA ^ 0xE844;
        ZoomModule.R[0xC8F4 ^ 0xC83A] = 0x6E57 ^ 0xC83A;
        ZoomModule.R[0x10A54 ^ 0x10A49] = 0x10A14 ^ 0x10A49;
        ZoomModule.R[0xCFBA ^ 0xCEB5] = 0xCE8A ^ 0xCEB5;
        ZoomModule.R[0x68AF ^ 0x683F] = 0x680B ^ 0x683F;
        ZoomModule.R[0xB798 ^ 0xB7E4] = 0xFFFF4863 ^ 0xB7E4;
        ZoomModule.R[0xE79A ^ 0xE7EB] = 0xFFFF1861 ^ 0xE7EB;
        ZoomModule.R[0x1F71 ^ 0x1F05] = 0x1F51 ^ 0x1F05;
        ZoomModule.R[0xC9F9 ^ 0xC908] = 0xFFFF36C4 ^ 0xC908;
        ZoomModule.R[0xDC07 ^ 0xDCA6] = 0xFFFF2327 ^ 0xDCA6;
        ZoomModule.R[0x29A8 ^ 0x29C9] = 0xFFFFD637 ^ 0x29C9;
        ZoomModule.R[0xE019 ^ 0xE0E5] = 0xFFFF1F36 ^ 0xE0E5;
        ZoomModule.R[0xAACE ^ 0xAA3D] = 0xAA10 ^ 0xAA3D;
        ZoomModule.R[0x3A46 ^ 0x3ADB] = 0xFFFFC55D ^ 0x3ADB;
        ZoomModule.R[0x4257 ^ 0x42BF] = 0x42E3 ^ 0x42BF;
        ZoomModule.R[0x4175 ^ 0x4197] = 0x417B ^ 0x4197;
        ZoomModule.R[0x4701 ^ 0x465A] = 0x41DF ^ 0x465A;
        ZoomModule.R[0x1327 ^ 0x13C0] = 0xFFFFEC68 ^ 0x13C0;
        ZoomModule.R[0xF413 ^ 0xF430] = 0xF41A ^ 0xF430;
        ZoomModule.R[0x8151 ^ 0x8126] = 0x8118 ^ 0x8126;
        ZoomModule.R[0x8975 ^ 0x8908] = 0x8902 ^ 0x8908;
        ZoomModule.R[0x848E ^ 0x85E2] = 0xE62C ^ 0x85E2;
        ZoomModule.R[0xDCCE ^ 0xDCD8] = 0xFFFF2337 ^ 0xDCD8;
        ZoomModule.R[0xAB72 ^ 0xAA5F] = 0xAA6B ^ 0xAA5F;
        ZoomModule.R[0x10B06 ^ 0x10A0A] = 0x10A21 ^ 0x10A0A;
        ZoomModule.R[0xAE55 ^ 0xAEBB] = 0xFFFF5112 ^ 0xAEBB;
        ZoomModule.R[0xDCC2 ^ 0xDC7C] = 0xDC5C ^ 0xDC7C;
        ZoomModule.R[0x92A8 ^ 0x9267] = 0x6A49 ^ 0x9267;
        ZoomModule.R[0x68C5 ^ 0x6842] = 0x685F ^ 0x6842;
        ZoomModule.R[0x2B0F ^ 0x2B4E] = 0x2B32 ^ 0x2B4E;
        ZoomModule.R[0x10735 ^ 0x107EF] = 0x10F90 ^ 0x107EF;
        ZoomModule.R[0x6F3C ^ 0x6FEE] = 0xDF3C ^ 0x6FEE;
        ZoomModule.R[0x71F7 ^ 0x7126] = 0xE1C9 ^ 0x7126;
        ZoomModule.R[0xDC82 ^ 0xDD02] = 0x5E2A ^ 0xDD02;
        ZoomModule.R[0xC304 ^ 0xC3CC] = 0xC3CC ^ 0xC3CC;
        ZoomModule.R[0xA608 ^ 0xA6BF] = 0xA6A6 ^ 0xA6BF;
        ZoomModule.R[0xD4CC ^ 0xD485] = 0xD4AC ^ 0xD485;
        ZoomModule.R[0xEC86 ^ 0xEDA3] = 0xEDF1 ^ 0xEDA3;
        ZoomModule.R[0xFAE6 ^ 0xFBA8] = 0xFFFF8A9C ^ 0xFBA8;
        ZoomModule.R[0xD1F9 ^ 0xD0AA] = 0x68CB ^ 0xD0AA;
        ZoomModule.R[0x44FC ^ 0x4581] = 0xBEAE ^ 0x4581;
        ZoomModule.R[0x262C ^ 0x260A] = 0xFFFFD9EA ^ 0x260A;
        ZoomModule.R[0xD0C9 ^ 0xD040] = 0xFFFF2FB6 ^ 0xD040;
        ZoomModule.R[0x3D7A ^ 0x3DBE] = 0x3DBE ^ 0x3DBE;
        ZoomModule.R[0xC3A8 ^ 0xC2AB] = 0xC287 ^ 0xC2AB;
        ZoomModule.R[0x83C1 ^ 0x83D4] = 0xFFFF7C54 ^ 0x83D4;
        ZoomModule.R[0xCF22 ^ 0xCF1F] = 0xCF17 ^ 0xCF1F;
        ZoomModule.R[0x8B8F ^ 0x8ABB] = 0x8ABA ^ 0x8ABB;
        ZoomModule.R[0xF613 ^ 0xF733] = 0xFFFF08C0 ^ 0xF733;
        ZoomModule.R[0xB3E3 ^ 0xB2EB] = 0xB282 ^ 0xB2EB;
        ZoomModule.R[0x5AB3 ^ 0x5BEA] = 0x5C6F ^ 0x5BEA;
        ZoomModule.R[0xCD34 ^ 0xCD10] = 0xCD39 ^ 0xCD10;
        ZoomModule.R[0xE8B6 ^ 0xE9E7] = 0x5186 ^ 0xE9E7;
        ZoomModule.R[0x4D77 ^ 0x4D1C] = 0xFFFFB2BC ^ 0x4D1C;
        ZoomModule.R[0x8A2 ^ 0x84D] = 0xFFFFF7D9 ^ 0x84D;
        ZoomModule.R[0x4A73 ^ 0x4A85] = 0xFFFFB540 ^ 0x4A85;
        ZoomModule.R[0x1B05 ^ 0x1B90] = 0x1B8D ^ 0x1B90;
        ZoomModule.R[0x5D72 ^ 0x5C2C] = 0xFFFF1C92 ^ 0x5C2C;
        ZoomModule.R[0x2D2D ^ 0x2D5B] = 0xFFFFD2A9 ^ 0x2D5B;
        ZoomModule.R[0xB49D ^ 0xB4FF] = 0xFFFF4B47 ^ 0xB4FF;
        ZoomModule.R[0x10DC3 ^ 0x10DC8] = 0x10D97 ^ 0x10DC8;
        ZoomModule.R[0x7101 ^ 0x7077] = 0xFFFF3F90 ^ 0x7077;
        ZoomModule.R[0x6B35 ^ 0x6AB6] = 0xC21E ^ 0x6AB6;
        ZoomModule.R[0xB716 ^ 0xB7AA] = 0xFFFF482F ^ 0xB7AA;
        ZoomModule.R[0xC164 ^ 0xC1E7] = 0xC191 ^ 0xC1E7;
        ZoomModule.R[0x8072 ^ 0x81F7] = 0xFFFFD6D0 ^ 0x81F7;
        ZoomModule.R[0xE33F ^ 0xE22B] = 0xE264 ^ 0xE22B;
        ZoomModule.R[0xE9FE ^ 0xE8F9] = 0xE8C0 ^ 0xE8F9;
        ZoomModule.R[0x4CBF ^ 0x4DC4] = 0xB69D ^ 0x4DC4;
        ZoomModule.R[0x9FD2 ^ 0x9E99] = 0x1997E ^ 0x9E99;
        ZoomModule.R[0xFF14 ^ 0xFF34] = 0xFF2A ^ 0xFF34;
        ZoomModule.R[0x5A8A ^ 0x5A0E] = 0x5A49 ^ 0x5A0E;
        ZoomModule.R[0xA32F ^ 0xA348] = 0xA34B ^ 0xA348;
        ZoomModule.R[0xEC47 ^ 0xED3E] = 0x1E90C ^ 0xED3E;
        ZoomModule.R[0xFC9A ^ 0xFD11] = 0xC19E ^ 0xFD11;
        ZoomModule.R[0x49FB ^ 0x4956] = 0x4943 ^ 0x4956;
        ZoomModule.R[0xC96E ^ 0xC943] = 0xC864 ^ 0xC943;
        ZoomModule.R[0x8C0B ^ 0x8D5F] = 0x9B8C ^ 0x8D5F;
        ZoomModule.R[0xC631 ^ 0xC631] = 0xC675 ^ 0xC631;
        ZoomModule.R[0xA0BE ^ 0xA08A] = 0xA0CB ^ 0xA08A;
        ZoomModule.R[0x9F44 ^ 0x9E45] = 0x9E67 ^ 0x9E45;
        ZoomModule.R[0xBC4D ^ 0xBD73] = 0xFFFF1576 ^ 0xBD73;
        ZoomModule.R[0x10185 ^ 0x1010F] = 0xFFFEFED5 ^ 0x1010F;
        ZoomModule.R[0x2DB6 ^ 0x2D37] = 0x2DF0 ^ 0x2D37;
        ZoomModule.R[0x4D95 ^ 0x4D2D] = 0xFFFFB2C2 ^ 0x4D2D;
        ZoomModule.R[0xE2B ^ 0xF03] = 0xF76 ^ 0xF03;
        ZoomModule.R[0x1F26 ^ 0x1E3D] = 0xFFFFE1B6 ^ 0x1E3D;
        ZoomModule.R[0x9E15 ^ 0x9F31] = 0x9F6C ^ 0x9F31;
        ZoomModule.R[0xEE93 ^ 0xEE79] = 0xEE52 ^ 0xEE79;
        ZoomModule.R[0x7367 ^ 0x73AC] = 0x59AC ^ 0x73AC;
        ZoomModule.R[0x4890 ^ 0x487C] = 0xFFFFB7B2 ^ 0x487C;
        ZoomModule.R[0x62EC ^ 0x623A] = 0xD802 ^ 0x623A;
        ZoomModule.R[0xFCCF ^ 0xFDBF] = 0xC6D0 ^ 0xFDBF;
        ZoomModule.R[0x8CCD ^ 0x8C94] = 0xFFFF7336 ^ 0x8C94;
        ZoomModule.R[0x2EF3 ^ 0x2F96] = 0x9AAE ^ 0x2F96;
        ZoomModule.R[0xF146 ^ 0xF144] = 0xF14A ^ 0xF144;
        ZoomModule.R[0x100A3 ^ 0x100B8] = 0x100F2 ^ 0x100B8;
        ZoomModule.R[0xBBF7 ^ 0xBBE6] = 0xBB98 ^ 0xBBE6;
        ZoomModule.R[0x62C1 ^ 0x62F9] = 0x62BC ^ 0x62F9;
        ZoomModule.R[0x35DB ^ 0x3499] = 0xFFFFCB8B ^ 0x3499;
        ZoomModule.R[0xB35A ^ 0xB265] = 0xE58B ^ 0xB265;
        ZoomModule.R[0x373A ^ 0x373B] = 0x3771 ^ 0x373B;
        ZoomModule.R[0xC94F ^ 0xC82C] = 0x7F7B ^ 0xC82C;
        ZoomModule.R[0xF47 ^ 0xF97] = 0xEFB8 ^ 0xF97;
        ZoomModule.R[0x1048E ^ 0x10411] = 0x104B2 ^ 0x10411;
        ZoomModule.R[0x69CC ^ 0x6927] = 0xFFFF96A8 ^ 0x6927;
        ZoomModule.R[0xEC1E ^ 0xED23] = 0xBACD ^ 0xED23;
        ZoomModule.R[0x10BE4 ^ 0x10B24] = 0xFFFEF4A8 ^ 0x10B24;
        ZoomModule.R[0xFF2E ^ 0xFFBA] = 0xFFEF ^ 0xFFBA;
        ZoomModule.R[0xD874 ^ 0xD919] = 0xBADE ^ 0xD919;
        ZoomModule.R[0xE6EA ^ 0xE7F5] = 0xFFFF1858 ^ 0xE7F5;
        ZoomModule.R[0x6C98 ^ 0x6C7D] = 0x6C23 ^ 0x6C7D;
        ZoomModule.R[0x52C5 ^ 0x5269] = 0x524A ^ 0x5269;
        ZoomModule.R[0xFBD9 ^ 0xFB29] = 0xFB15 ^ 0xFB29;
        ZoomModule.R[0xD6E0 ^ 0xD6A3] = 0xD6E7 ^ 0xD6A3;
        ZoomModule.R[0x761C ^ 0x7774] = 0x2B7B ^ 0x7774;
        ZoomModule.R[0x8821 ^ 0x8913] = 0x8913 ^ 0x8913;
        ZoomModule.R[0x94BC ^ 0x95E9] = 0x833F ^ 0x95E9;
        ZoomModule.R[0x4BF0 ^ 0x4AB0] = 0x4A3F ^ 0x4AB0;
        ZoomModule.R[0x10555 ^ 0x1043A] = 0x167FD ^ 0x1043A;
        ZoomModule.R[0xA3BB ^ 0xA2B2] = 0xFFFF5D6C ^ 0xA2B2;
        ZoomModule.R[0x39E0 ^ 0x39D2] = 0x39FD ^ 0x39D2;
        ZoomModule.R[0xDD6F ^ 0xDC2B] = 0x5A81 ^ 0xDC2B;
        ZoomModule.R[0x6FEC ^ 0x6E8B] = 0xDBB3 ^ 0x6E8B;
        ZoomModule.R[0x64FE ^ 0x6498] = 0x641B ^ 0x6498;
        ZoomModule.R[0x3357 ^ 0x336D] = 0x3336 ^ 0x336D;
        ZoomModule.R[0xDB2E ^ 0xDA28] = 0xFFFF2556 ^ 0xDA28;
        ZoomModule.R[0x96C2 ^ 0x969F] = 0xFFFF6909 ^ 0x969F;
        ZoomModule.R[0xBF7A ^ 0xBFF6] = 0xBFB1 ^ 0xBFF6;
        ZoomModule.R[0x15E1 ^ 0x1547] = 0x1577 ^ 0x1547;
        ZoomModule.R[0xEE06 ^ 0xEE2E] = 0xEE56 ^ 0xEE2E;
        ZoomModule.R[0x9EB1 ^ 0x9ED1] = 0xFFFF614B ^ 0x9ED1;
        ZoomModule.R[0x7A3C ^ 0x7B36] = 0xFFFF84A9 ^ 0x7B36;
        ZoomModule.R[0xD841 ^ 0xD8E1] = 0xD8E5 ^ 0xD8E1;
        ZoomModule.R[0x182C ^ 0x190F] = 0xFFFFE6CF ^ 0x190F;
        ZoomModule.R[0xAA21 ^ 0xAB34] = 0xFFFF54B3 ^ 0xAB34;
        ZoomModule.R[0x7F5 ^ 0x6AD] = 0x123 ^ 0x6AD;
        ZoomModule.R[0xDFA9 ^ 0xDEBA] = 0xFFFF2173 ^ 0xDEBA;
        ZoomModule.R[0x15A7 ^ 0x1494] = 0x1495 ^ 0x1494;
        ZoomModule.R[0x10E47 ^ 0x10E09] = 0xFFFEF1B7 ^ 0x10E09;
        ZoomModule.R[0x2F06 ^ 0x2E49] = 0xA0D5 ^ 0x2E49;
        ZoomModule.R[0x631E ^ 0x6341] = 0x631F ^ 0x6341;
        ZoomModule.R[0xFA1D ^ 0xFB77] = 0xFFFF58DB ^ 0xFB77;
        ZoomModule.R[0xB5E8 ^ 0xB4D9] = 0xB4DB ^ 0xB4D9;
        ZoomModule.R[0x1065 ^ 0x100B] = 0x1025 ^ 0x100B;
        ZoomModule.R[0xBE16 ^ 0xBF46] = 0x725 ^ 0xBF46;
        ZoomModule.R[0x9C59 ^ 0x9D49] = 0x9D29 ^ 0x9D49;
        ZoomModule.R[0x4FE5 ^ 0x4E83] = 0xFB8D ^ 0x4E83;
        ZoomModule.R[0x13B0 ^ 0x12BB] = 0xFFFFED5A ^ 0x12BB;
        ZoomModule.R[0x5321 ^ 0x532F] = 0x5340 ^ 0x532F;
        ZoomModule.R[0x5AE4 ^ 0x5B8D] = 0x783 ^ 0x5B8D;
        ZoomModule.R[0x395D ^ 0x39EC] = 0xFFFFC683 ^ 0x39EC;
        ZoomModule.R[0x2307 ^ 0x2265] = 0x9533 ^ 0x2265;
        ZoomModule.R[0xAF1 ^ 0xA52] = 0xFFFFF589 ^ 0xA52;
        ZoomModule.R[0xB662 ^ 0xB610] = 0xB631 ^ 0xB610;
        ZoomModule.R[0xD845 ^ 0xD8B0] = 0xFFFF275B ^ 0xD8B0;
        ZoomModule.R[0x83FD ^ 0x8376] = 0xFFFF7CEB ^ 0x8376;
        ZoomModule.R[0x51AF ^ 0x50F8] = 0x462E ^ 0x50F8;
        ZoomModule.R[0x9B92 ^ 0x9B2D] = 0xFFFF64D4 ^ 0x9B2D;
        ZoomModule.R[0x2DE ^ 0x218] = 0x218 ^ 0x218;
        ZoomModule.R[0xF7FE ^ 0xF7F4] = 0xF7E6 ^ 0xF7F4;
        ZoomModule.R[0x84B3 ^ 0x841A] = 0xFFFF7BEC ^ 0x841A;
        ZoomModule.R[0xAE54 ^ 0xAE30] = 0xFFFF51B8 ^ 0xAE30;
        ZoomModule.R[0xD2E4 ^ 0xD2E3] = 0xFFFF2D0E ^ 0xD2E3;
        ZoomModule.R[0xEDAE ^ 0xED39] = 0xFFFF12B8 ^ 0xED39;
        ZoomModule.R[0xF2E7 ^ 0xF23B] = 0xF291 ^ 0xF23B;
        ZoomModule.R[0xE0B2 ^ 0xE08B] = 0xE0CD ^ 0xE08B;
        ZoomModule.R[0x8DA6 ^ 0x8DA0] = 0x8DAF ^ 0x8DA0;
        ZoomModule.R[0xDBF ^ 0xD30] = 0xD1B ^ 0xD30;
        ZoomModule.R[0x7392 ^ 0x730E] = 0x731E ^ 0x730E;
        ZoomModule.R[0xAF5D ^ 0xAFED] = 0xFFFF503C ^ 0xAFED;
        ZoomModule.R[0xFDB6 ^ 0xFC8A] = 0xAB6C ^ 0xFC8A;
        ZoomModule.R[0xDE03 ^ 0xDE1A] = 0xFFFF2193 ^ 0xDE1A;
        ZoomModule.R[0x8A7 ^ 0x80D] = 0xFFFFF7C9 ^ 0x80D;
        ZoomModule.R[0x8CEF ^ 0x8D84] = 0xD18A ^ 0x8D84;
        ZoomModule.R[0xB893 ^ 0xB9D2] = 0xB953 ^ 0xB9D2;
        ZoomModule.R[0x8422 ^ 0x8557] = 0x355B ^ 0x8557;
        ZoomModule.R[0x1D38 ^ 0x1D1A] = 0x1D7F ^ 0x1D1A;
        ZoomModule.R[0x8E5D ^ 0x8EE0] = 0x8EF2 ^ 0x8EE0;
        ZoomModule.R[0x2D1F ^ 0x2D4A] = 0xFFFFD2C5 ^ 0x2D4A;
        ZoomModule.R[0x2BAF ^ 0x2A20] = 0x35BB ^ 0x2A20;
        ZoomModule.R[0x6922 ^ 0x693A] = 0xFFFF96A5 ^ 0x693A;
        ZoomModule.R[0xC77E ^ 0xC71D] = 0xC767 ^ 0xC71D;
        ZoomModule.R[0x7DA0 ^ 0x7DF8] = 0x7DFB ^ 0x7DF8;
    }
}

