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
import kotakbaz.rain.module.a_0;
import kotakbaz.rain.module.setting.settings.c;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from kotakbaz.rain.module.modules.render.s
 */
@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\f\n\u0004\b\t\u0010\u0006\u0012\u0004\b\n\u0010\u0003R\u0017\u0010\u000b\u001a\u00020\u00048\u0006\u00a2\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u0017\u0010\r\u001a\u00020\u00048\u0006\u00a2\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u0017\u0010\u0011\u001a\u00020\u00048\u0006\u00a2\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\bR\u0017\u0010\u0013\u001a\u00020\u00048\u0006\u00a2\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u0017\u0010\u0015\u001a\u00020\u00048\u0006\u00a2\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\bR\u0017\u0010\u0017\u001a\u00020\u00048\u0006\u00a2\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0018\u0010\bR\u0017\u0010\u0019\u001a\u00020\u00048\u0006\u00a2\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\b\u00a8\u0006\u001b"}, d2={"Lkotakbaz/rain/module/modules/render/RenderTweaksModule;", "Lkotakbaz/rain/module/Module;", "<init>", "()V", "Lkotakbaz/rain/module/setting/settings/BooleanSetting;", "noHurtCam", "Lkotakbaz/rain/module/setting/settings/BooleanSetting;", "getNoHurtCam", "()Lkotakbaz/rain/module/setting/settings/BooleanSetting;", "legacyNoHandBob", "getLegacyNoHandBob$annotations", "noFire", "getNoFire", "noStatusEffects", "getNoStatusEffects", "removeVignette", "getRemoveVignette", "noGlow", "getNoGlow", "hideMobs", "getHideMobs", "noBlackHearts", "getNoBlackHearts", "noTotemAnimation", "getNoTotemAnimation", "noBossBar", "getNoBossBar", "rain-visuals"})
public final class s_0
extends a_0 {
    @NotNull
    public static final s_0 INSTANCE;
    @NotNull
    private static final c a;
    @NotNull
    private static final c A;
    @NotNull
    private static final c b;
    @NotNull
    private static final c B;
    @NotNull
    private static final c c;
    @NotNull
    private static final c C;
    @NotNull
    private static final c d;
    @NotNull
    private static final c D;
    @NotNull
    private static final c e;
    @NotNull
    private static final c E;
    private static Object[] f;
    private static Object g;
    private static Object[] G;
    private static Object[] F;
    private static Object[] h;
    public static int[] H;

    private s_0() {
        int n = H[0];
        n += H[1];
        int n2 = H[3];
        n2 -= H[4];
        int n3 = H[6];
        n3 += H[7];
        super((String)f[n += H[2]], kotakbaz.rain.client.extensions.a_0.getRENDER(), (String)f[n2 += H[5]] + (String)f[n3 -= H[8]]);
    }

    @NotNull
    public final c getNoHurtCam() {
        return a;
    }

    private static /* synthetic */ void getLegacyNoHandBob$annotations() {
    }

    @NotNull
    public final c getNoFire() {
        return b;
    }

    @NotNull
    public final c getNoStatusEffects() {
        return B;
    }

    @NotNull
    public final c getRemoveVignette() {
        return c;
    }

    @NotNull
    public final c getNoGlow() {
        return C;
    }

    @NotNull
    public final c getHideMobs() {
        return d;
    }

    @NotNull
    public final c getNoBlackHearts() {
        return D;
    }

    @NotNull
    public final c getNoTotemAnimation() {
        return e;
    }

    @NotNull
    public final c getNoBossBar() {
        return E;
    }

    private static final boolean legacyNoHandBob$lambda$0() {
        boolean bl = H[9];
        bl += H[10];
        return bl -= H[11];
    }

    static {
        s_0.b();
        long l = 2085232090498979179L;
        long l2 = 8258253986965509347L;
        long l3 = -4630346387444755904L;
        long l4 = -572281420224117068L;
        long l5 = -4974522302408917477L;
        long l6 = 2138536668893375537L;
        long l7 = -8357793706482480907L;
        long l8 = 1265286482718471117L;
        long l9 = 3646635426729049134L;
        long l10 = -3145367054534901805L;
        long l11 = 7558162526400029124L;
        long l12 = 6326507221376238270L;
        long l13 = 7062824591051713216L;
        long l14 = 6306484083052776647L;
        int n = H[12];
        n += H[13];
        f = new Object[n -= H[14]];
        long l15 = l14;
        int n2 = H[15];
        n2 ^= H[16];
        l14 = l15 ^ (0L ^ l15) & -1L << (n2 -= H[17]);
        Object[] objectArray = new Object[H[18]];
        objectArray[s_0.H[19]] = F;
        objectArray[s_0.H[20]] = H[21];
        int n3 = H[22];
        Object object = s_0.A()[H[23]];
        if (object == null) {
            char[] cArray = "\ubba9\ubbd7\ubbc1\ubc3c\ubbec\ubb9c\ubbb6\ubb9d\ubbed\ubb82\ubbb9\ubbb6\ubb85\ubbf6\ubbd7\ubbd7\ubbb8\ubbdf\ubbbb\ubbdc\ubb9d\ubbea\ubba7\ubbdc\ubbfb\ubba2\ubbc1\ubbd4\ubbed\ubb87\ubbed\ubb9f\ubbf7\ubbc1\ubb84\ubba6\ubb8c\ubbc3\ubba7\ubba6\ubbda\ubbc1\ubbde\ubb9a\ubb8b\ubbd4\ubbd8\ubb86\ubb89\ubb87\ubbde\ubbb6\ubc3d\ubb8b\ubbb8\ubbf7\ubbc3\ubbd5\ubb8a\ubbf5\ubbd4\ubbda\ubbd9\ubb9a\ubbc1\ubba2\ubbe3\ubba4\ubc3f\ubbec\ubbf7\ubbe0\ubbde\ubbd4\ubb88\ubbbe\ubb8a\ubb9c\ubba9\ubbec\ubbfe\ubba7\ubc3c\ubbc3\ubbed\ubb9d\ubbec\ubbf4\ubbc1\ubb84\ubb89\ubb9c\ubb9a\ubb8b\ubbea\ubb86\ubb84\ubbbb\ubbd5\ubbb4\ubbc0\ubbf5\ubbb7\ubb8b\ubba5\ubbf6\ubc3d\ubbd8\ubb9c\ubbe1\ubbb8\ubbd5\ubbdd\ubb86\ubbd9\ubb8d\ubbdb\ubba2\ubc3c\ubb62\ubbe1\ubbd6\ubbf7\ubbbb\ubbd7\ubb62\ubbdb\ubb84\ubba9\ubba5\ubbd6\ubbab\ubbb8\ubba4\ubb8b\ubbd6\ubbb7\ubb9c\ubb9c\ubba2\ubbfb\ubb8d\ubbea\ubbd5\ubbbe\ubb8d\ubc3c\ubb8b\ubc3a\ubb9a\ubb8d\ubb9c\ubbdf\ubbf7\ubc3d\ubb9f\ubbda\ubc3a\ubbde\ubba9\ubbdf\ubbdf\ubbdd\ubbd9\ubbfe\ubba6\ubbb4\ubbc0\ubb8c\ubbf4\ubbf4\ubbb9\ubbbb\ubbf4\ubb89\ubb85\ubb8c\ubb89\ubb9d\ubbd8\ubb8d\ubbc3\ubbdc\ubb62\ubb89\ubbb8\ubbfe\ubbf8\ubbc1\ubba7\ubbd6\ubb9a\ubbe0\ubbb9\ubbbe\ubb8d\ubbdf\ubc3f\ubbb7\ubbab\ubbec\ubbf5\ubb9a\ubbd9\ubbe1\ubba5\ubbc1\ubb9d\ubbed\ubbdf\ubba2\ubc3a\ubbf7\ubc3f\ubb89\ubbd8\ubb9c\ubb87\ubb9c\ubc3f\ubbe3\ubbb8\ubb8c\ubb8a\ubb62\ubba6\ubbdf\ubbdb\ubbbe\ubbfe\ubbb8\ubbd9\ubb86\ubbd7\ubba4\ubbf8\ubbed\ubb62\ubbd7\ubbc0\ubbb9\ubbea\ubc3c\ubb62\ubbf4\ubb9d\ubbe3\ubbbb\ubbe3\ubb87\ubbf8\ubbe1\ubbb9\ubbe1\ubbbb\ubbec\ubc3d\ubbdf\ubbf8\ubba7\ubb9d\ubb9d\ubb62\ubbec\ubbbb\ubbab\ubb9d\ubba9\ubc3a\ubbf5\ubb9c\ubbbe\ubba6\ubb82\ubb8b\ubbfe\ubb9a\ubb9a\ubbd4\ubc3a\ubb85\ubb82\ubbb6\ubba7\ubbb4\ubb8d\ubbb7\ubb8c\ubbfb\ubba5\ubb88\ubb87\ubba5\ubb85\ubc3a\ubbde\ubb88\ubbf4\ubbd5\ubb82\ubb82\ubbc3\ubbab\ubbfb\ubbfb\ubbf6\ubb8a\ubba4\ubbd6\ubba5\ubbe0\ubbe0\ubb85\ubc3c\ubbd7\ubbd5\ubb8c\ubbd4\ubbc0\ubba4\ubbd8\ubb8c\ubbf8\ubba6\ubbc0\ubbdb\ubbb8\ubb9d\ubbc3\ubbda\ubbb7\ubbdc\ubbfb\ubbdf\ubba8\ubbd4\ubbbe\ubc3f\ubbf6\ubc3c\ubbb9\ubbfb\ubb9d\ubb8a\ubb82\ubbb6\ubbbe\ubbc0\ubbfb\ubbd7\ubbfe\ubbdc\ubbd8\ubbdb\ubbab\ubc3f\ubbf8\ubbe0\ubbf8\ubb86\ubc3f\ubbb8\ubb89\ubbfb\ubbda\ubbe3\ubb87\ubbda\ubc3c\ubbd4\ubbf5\ubb82\ubb9d\ubbea\ubbf8\ubba8\ubb87\ubbe1\ubb86\ubbde\ubbec\ubbfb\ubbd7\ubb82\ubc3c\ubb8a\ubbb9\ubbd5\ubba4\ubbbe\ubbec\ubba2\ubba8\ubbdd\ubba6\ubba7\ubba6\ubb82\ubb62\ubbbe\ubb8a\ubc3a\ubb89\ubc3d\ubb82\ubbf6\ubb9f\ubba5\ubbec\ubb8a\ubbd9\ubb88\ubb87\ubbdd\ubba5\ubb8d\ubbe3\ubbf7\ubc3d\ubba4\ubbdc\ubbd9\ubbf6\ubbfe\ubbdd\ubb89\ubbb9\ubba5\ubb82\ubba2\ubbb4\ubba5\ubbf9\ubba6\ubbda\ubb8c\ubbb6\ubbb6\ubbd5\ubbd4\ubb82\ubbec\ubb84\ubbdf\ubbbb\ubb8b\ubbf9\ubbf4\ubb82\ubb84\ubbc0\ubbde\ubbd7\ubbbe\ubbd4\ubbdb\ubbf7\ubba2\ubbed\ubbbe\ubbd9\ubc3a\ubbdc\ubbb4\ubbf4\ubbf7\ubbbb\ubbd5\ubbdc\ubbf4\ubb9c\ubbab\ubb89\ubb8b\ubbb4\ubbed\ubbd7\ubbb6\ubbd9\ubb9c\ubbd7\ubc3d\ubbe1\ubbf5\ubbd5\ubb9d\ubbab\ubbc1\ubb9c\ubbf6\ubbd9\ubba8\ubb9f\ubb87\ubbf6\ubbf6\ubbea\ubbdb\ubbe0\ubbbe\ubbde\ubb9c\ubbf6\ubbea\ubba4\ubbc3\ubb8c\ubbab\ubbf8\ubb8a\ubb9c\ubbea\ubba9\ubbde\ubb88\ubbd8\ubb87\ubbf8\ubb87\ubbfb\ubbfb\ubbc1\ubb86\ubbe3\ubbdf\ubbe3\ubbb4\ubbf4\ubb9f\ubba7\ubbea\ubbf8\ubbdf\ubc3d\ubbde\ubba9\ubbc3\ubbd6\ubbc3\ubbdb\ubbe3\ubba5\ubbc1\ubbd5\ubbec\ubbfb\ubb86\ubbe1\ubbbe\ubb84\ubbf6\ubb82\ubc3c\ubbdb\ubbe3\ubbed\ubba4\ubb84\ubb8d\ubb9a\ubb84\ubbd7\ubb8b\ubbbe\ubc3d\ubbdb\ubbec\ubbb8\ubb62\ubba7\ubbf8\ubba2\ubbd5\ubb9f\ubbf4\ubba9\ubbea\ubbd4\ubb9a\ubbc1\ubbbe\ubbde\ubba8\ubba2\ubb9c\ubbbe\ubba8\ubb85\ubb85\ubbb7\ubb8a\ubbd4\ubbdb\ubbd9\ubbd9\ubba4\ubbe3\ubbf9\ubba2\ubc3c\ubbab\ubb8c\ubbd6\ubc3d\ubbc3\ubbe0\ubbdc\ubbdc\ubb82\ubbc0\ubba2\ubba8\ubbf7\ubbc1\ubb89\ubbd6\ubbe3\ubbf6\ubb9d\ubbab\ubbdd\ubb86\ubbbb\ubba2\ubb8c\ubb62\ubbb4\ubc3a\ubb85\ubbf6\ubbf8\ubba8\ubbe0\ubbd6\ubb8a\ubbe0\ubb89\ubbd5\ubbec\ubbda\ubbd4\ubbd4\ubc3a\ubb8b\ubb82\ubbdf\ubbe0\ubc3d\ubbf4\ubb84\ubc3a\ubb9a\ubbd8\ubba7\ubbc3\ubbb8\ubba6\ubbd4\ubbf6\ubbf7\ubbea\ubbf6\ubbb0\ubbb0".toCharArray();
            for (int i2 = H[24]; i2 < H[25]; ++i2) {
                int n4 = cArray[i2];
                n4 ^= H[26];
                n4 -= H[27];
                n4 ^= H[28];
                n4 -= H[29];
                n4 -= H[30];
                n4 -= H[31];
                n4 ^= H[32];
                n4 ^= H[33];
                n4 += H[34];
                cArray[i2] = (char)(n4 ^= H[35]);
            }
            object = s_0.A()[s_0.H[36]] = new String(cArray);
        }
        objectArray[n3] = (String)object;
        char[] cArray = ((String)s_0.a(objectArray)).toCharArray();
        long l16 = l5;
        int n5 = H[37];
        n5 += H[38];
        l5 = l16 ^ (0x11300000000L ^ l16) & -1L << (n5 ^= H[39]);
        long l17 = l12;
        int n6 = H[40];
        n6 ^= H[41];
        l12 = l17 ^ (0L ^ l17) & -1L >>> (n6 += H[42]);
        while (true) {
            int n7 = H[43];
            n7 ^= H[44];
            if ((int)l12 >= (int)(l5 >>> (n7 += H[45]))) break;
            int n8 = (int)l12;
            long l18 = l12;
            int n9 = H[46];
            n9 ^= H[47];
            int n10 = H[49];
            n10 ^= H[50];
            l12 = l18 ^ (l18 ^ l18 + (long)(n9 ^= H[48])) & -1L >>> (n10 ^= H[51]);
            long l19 = l8;
            int n11 = H[52];
            n11 += H[53];
            l8 = l19 ^ ((long)cArray[n8] ^ l19) & -1L >>> (n11 -= H[54]);
            int n12 = (int)l12;
            long l20 = l12;
            int n13 = H[55];
            n13 -= H[56];
            int n14 = H[58];
            n14 -= H[59];
            l12 = l20 ^ (l20 ^ l20 + (long)(n13 += H[57])) & -1L >>> (n14 += H[60]);
            int n15 = H[61];
            n15 += H[62];
            long l21 = l9;
            int n16 = H[64];
            n16 += H[65];
            l9 = l21 ^ ((long)cArray[n12] << (n15 -= H[63]) ^ l21) & -1L << (n16 -= H[66]);
            int n17 = H[67];
            n17 -= H[68];
            n17 ^= H[69];
            int n18 = H[70];
            n18 ^= H[71];
            long l22 = l11;
            int n19 = H[73];
            n19 += H[74];
            l11 = l22 ^ ((long)((int)l8 << n17 | (int)(l9 >>> (n18 ^= H[72]))) ^ l22) & -1L >>> (n19 ^= H[75]);
            char[] cArray2 = new char[(int)l11];
            long l23 = l13;
            int n20 = H[76];
            n20 ^= H[77];
            l13 = l23 ^ (0L ^ l23) & -1L << (n20 ^= H[78]);
            while (true) {
                int n21 = H[79];
                n21 -= H[80];
                if ((int)(l13 >>> (n21 ^= H[81])) >= (int)l11) break;
                int n22 = H[82];
                n22 ^= H[83];
                int n23 = H[85];
                n23 -= H[86];
                cArray2[(int)(l13 >>> (n22 += s_0.H[84]))] = cArray[(int)l12 + (int)(l13 >>> (n23 ^= H[87]))];
                l13 += 0x100000000L;
            }
            int n24 = H[88];
            n24 -= H[89];
            int n25 = (int)(l14 >>> (n24 += H[90]));
            l14 += 0x100000000L;
            s_0.f[n25] = new String(cArray2);
            long l24 = l12;
            int n26 = H[91];
            n26 -= H[92];
            l12 = l24 ^ ((long)((int)l12 + (int)l11) ^ l24) & -1L >>> (n26 += H[93]);
        }
        INSTANCE = new s_0();
        int n27 = H[94];
        n27 ^= H[95];
        int n28 = H[97];
        n28 += H[98];
        boolean bl = H[100];
        bl ^= H[101];
        a = INSTANCE.boolean((String)f[n27 ^= H[96]] + (String)f[n28 -= H[99]], bl -= H[102]);
        int n29 = H[103];
        n29 ^= H[104];
        int n30 = H[106];
        n30 ^= H[107];
        boolean bl2 = H[109];
        bl2 -= H[110];
        A = INSTANCE.boolean((String)f[n29 -= H[105]] + (String)f[n30 -= H[108]], bl2 += H[111]).setVisible(s_0::legacyNoHandBob$lambda$0);
        int n31 = H[112];
        n31 ^= H[113];
        int n32 = H[115];
        n32 -= H[116];
        boolean bl3 = H[118];
        bl3 ^= H[119];
        b = INSTANCE.boolean((String)f[n31 += H[114]] + (String)f[n32 -= H[117]], bl3 += H[120]);
        int n33 = H[121];
        n33 -= H[122];
        int n34 = H[124];
        n34 += H[125];
        boolean bl4 = H[127];
        bl4 -= H[128];
        B = INSTANCE.boolean((String)f[n33 += H[123]] + (String)f[n34 ^= H[126]], bl4 -= H[129]);
        int n35 = H[130];
        n35 -= H[131];
        boolean bl5 = H[133];
        bl5 ^= H[134];
        c = INSTANCE.boolean((String)f[n35 -= H[132]], bl5 ^= H[135]);
        int n36 = H[136];
        n36 ^= H[137];
        int n37 = H[139];
        n37 -= H[140];
        boolean bl6 = H[142];
        bl6 -= H[143];
        C = INSTANCE.boolean((String)f[n36 ^= H[138]] + (String)f[n37 += H[141]], bl6 ^= H[144]);
        int n38 = H[145];
        n38 -= H[146];
        boolean bl7 = H[148];
        bl7 ^= H[149];
        d = INSTANCE.boolean((String)f[n38 ^= H[147]], bl7 ^= H[150]);
        int n39 = H[151];
        n39 ^= H[152];
        int n40 = H[154];
        n40 += H[155];
        boolean bl8 = H[157];
        bl8 ^= H[158];
        D = INSTANCE.boolean((String)f[n39 -= H[153]] + (String)f[n40 += H[156]], bl8 += H[159]);
        int n41 = H[160];
        n41 ^= H[161];
        int n42 = H[163];
        n42 -= H[164];
        boolean bl9 = H[166];
        bl9 += H[167];
        e = INSTANCE.boolean((String)f[n41 ^= H[162]] + (String)f[n42 ^= H[165]], bl9 -= H[168]);
        int n43 = H[169];
        n43 -= H[170];
        boolean bl10 = H[172];
        bl10 -= H[173];
        E = INSTANCE.boolean((String)f[n43 += H[171]], bl10 -= H[174]);
    }

    public static Object a(Object[] object) {
        Object object2;
        int n = (Integer)object[H[175]];
        String string = (String)object[H[176]];
        object = object[H[177]];
        Object[] objectArray = G;
        if (G == null) {
            objectArray = G = new Object[H[178]];
        }
        if ((object2 = objectArray[n]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[H[179]];
                F = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[H[181] ^ H[182]];
                byArray[s_0.H[183] ^ s_0.H[184]] = H[185] ^ H[186];
                byArray[s_0.H[187] ^ s_0.H[188]] = H[189] ^ H[190];
                byArray[s_0.H[191] ^ s_0.H[192]] = H[193] ^ H[194];
                byArray[s_0.H[195] ^ s_0.H[196]] = H[197] ^ H[198];
                byArray[s_0.H[199] ^ s_0.H[200]] = H[201] ^ H[202];
                byArray[s_0.H[203] ^ s_0.H[204]] = H[205] ^ H[206];
                byArray[s_0.H[207] ^ s_0.H[208]] = H[209] ^ H[210];
                byArray[s_0.H[211] ^ s_0.H[212]] = H[213] ^ H[214];
                byArray[s_0.H[215] ^ s_0.H[216]] = H[217] ^ H[218];
                byArray[s_0.H[219] ^ s_0.H[220]] = H[221] ^ H[222];
                byArray[s_0.H[223] ^ s_0.H[224]] = H[225] ^ H[226];
                byArray[s_0.H[227] ^ s_0.H[228]] = H[229] ^ H[230];
                byArray[s_0.H[231] ^ s_0.H[232]] = H[233] ^ H[234];
                byArray[s_0.H[235] ^ s_0.H[236]] = H[237] ^ H[238];
                byArray[s_0.H[239] ^ s_0.H[240]] = H[241] ^ H[242];
                byArray[s_0.H[243] ^ s_0.H[244]] = H[245] ^ H[246];
                objectArray2[s_0.H[180]] = byArray;
            }
            byte[] byArray = (byte[])object3[H[247]];
            if (g == null) {
                byte[] byArray2 = new byte[H[248] ^ H[249]];
                byArray2[s_0.H[250] ^ s_0.H[251]] = H[252] ^ H[253];
                byArray2[s_0.H[254] ^ s_0.H[255]] = H[256] ^ H[257];
                byArray2[s_0.H[258] ^ s_0.H[259]] = H[260] ^ H[261];
                byArray2[s_0.H[262] ^ s_0.H[263]] = H[264] ^ H[265];
                byArray2[s_0.H[266] ^ s_0.H[267]] = H[268] ^ H[269];
                byArray2[s_0.H[270] ^ s_0.H[271]] = H[272] ^ H[273];
                byArray2[s_0.H[274] ^ s_0.H[275]] = H[276] ^ H[277];
                byArray2[s_0.H[278] ^ s_0.H[279]] = H[280] ^ H[281];
                byArray2[s_0.H[282] ^ s_0.H[283]] = H[284] ^ H[285];
                byArray2[s_0.H[286] ^ s_0.H[287]] = H[288] ^ H[289];
                byArray2[s_0.H[290] ^ s_0.H[291]] = H[292] ^ H[293];
                byArray2[s_0.H[294] ^ s_0.H[295]] = H[296] ^ H[297];
                byArray2[s_0.H[298] ^ s_0.H[299]] = H[300] ^ H[301];
                byArray2[s_0.H[302] ^ s_0.H[303]] = H[304] ^ H[305];
                byArray2[s_0.H[306] ^ s_0.H[307]] = H[308] ^ H[309];
                byArray2[s_0.H[310] ^ s_0.H[311]] = H[312] ^ H[313];
                byArray2[s_0.H[314] ^ s_0.H[315]] = H[316] ^ H[317];
                byArray2[s_0.H[318] ^ s_0.H[319]] = H[320] ^ H[321];
                byArray2[s_0.H[322] ^ s_0.H[323]] = H[324] ^ H[325];
                byArray2[s_0.H[326] ^ s_0.H[327]] = H[328] ^ H[329];
                byArray2[s_0.H[330] ^ s_0.H[331]] = H[332] ^ H[333];
                byArray2[s_0.H[334] ^ s_0.H[335]] = H[336] ^ H[337];
                byArray2[s_0.H[338] ^ s_0.H[339]] = H[340] ^ H[341];
                byArray2[s_0.H[342] ^ s_0.H[343]] = H[344] ^ H[345];
                byArray2[s_0.H[346] ^ s_0.H[347]] = H[348] ^ H[349];
                byArray2[s_0.H[350] ^ s_0.H[351]] = H[352] ^ H[353];
                byArray2[s_0.H[354] ^ s_0.H[355]] = H[356] ^ H[357];
                byArray2[s_0.H[358] ^ s_0.H[359]] = H[360] ^ H[361];
                byArray2[s_0.H[362] ^ s_0.H[363]] = H[364] ^ H[365];
                byArray2[s_0.H[366] ^ s_0.H[367]] = H[368] ^ H[369];
                byArray2[s_0.H[370] ^ s_0.H[371]] = H[372] ^ H[373];
                byArray2[s_0.H[374] ^ s_0.H[375]] = H[376] ^ H[377];
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, H[378], byArray3, H[379], byArray.length);
                System.arraycopy(byArray2, H[380], byArray3, byArray.length, byArray2.length);
                Object object4 = s_0.A()[H[381]];
                if (object4 == null) {
                    char[] cArray = "\u2d53\u1309\u1338\u1337\u130d\u1339\u2d44\u2d52\u3a67\u2d5b\u133b\u3a76\u2d5a\u2d60\u2d50\u133b\u133a\u132a".toCharArray();
                    for (int i2 = H[382]; i2 < H[383]; ++i2) {
                        int n2 = cArray[i2];
                        n2 += H[384];
                        n2 ^= H[385];
                        n2 -= H[386];
                        n2 ^= H[387];
                        n2 += H[388];
                        n2 += H[389];
                        n2 ^= H[390];
                        n2 ^= H[391];
                        n2 ^= H[392];
                        n2 -= H[393];
                        n2 ^= H[394];
                        n2 ^= H[395];
                        n2 -= H[396];
                        n2 -= H[397];
                        cArray[i2] = (char)(n2 += H[398]);
                    }
                    object4 = s_0.A()[s_0.H[399]] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[16];
                byArray4[10] = 68;
                byArray4[14] = 47;
                byArray4[13] = -16;
                byArray4[8] = 99;
                byArray4[11] = 67;
                byArray4[5] = 40;
                byArray4[0] = 97;
                byArray4[9] = 69;
                byArray4[7] = 47;
                byArray4[2] = 14;
                byArray4[15] = -80;
                byArray4[6] = -79;
                byArray4[1] = 100;
                byArray4[4] = -118;
                byArray4[12] = -55;
                byArray4[3] = -59;
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, 29, 256);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = s_0.A()[2];
                if (object5 == null) {
                    char[] cArray = "\u976a\u975e\u9758".toCharArray();
                    for (int i3 = 0; i3 < 3; ++i3) {
                        int n3 = cArray[i3];
                        n3 -= 65156;
                        n3 ^= 0x5706;
                        n3 += 55881;
                        n3 += 36201;
                        n3 += 63052;
                        n3 -= 46892;
                        n3 -= 56333;
                        n3 ^= 0x88EF;
                        n3 ^= 0x9752;
                        n3 += 58740;
                        n3 += 7061;
                        n3 += 51803;
                        n3 -= 41436;
                        cArray[i3] = (char)(n3 -= 44639);
                    }
                    object5 = s_0.A()[2] = new String(cArray);
                }
                g = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, 0, 16);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, 16, byArray6.length);
            Object object6 = s_0.A()[3];
            if (object6 == null) {
                char[] cArray = "\u4874\u4888\u489e\u492a\u488e\u4879\u488e\u492a\u4887\u4886\u488e\u489e\u4838\u4887\u4854\u486b\u486b\u486c\u4865\u4852".toCharArray();
                for (int i4 = 0; i4 < 20; ++i4) {
                    int n4 = cArray[i4];
                    n4 += 16512;
                    n4 += 28753;
                    n4 ^= 0xD151;
                    n4 ^= 0x4F23;
                    n4 += 56852;
                    n4 -= 4343;
                    n4 ^= 0x1C9A;
                    n4 ^= 0x910B;
                    n4 ^= 0x316B;
                    n4 -= 36301;
                    n4 ^= 0xD30E;
                    cArray[i4] = (char)(n4 ^= 0x29AE);
                }
                object6 = s_0.A()[3] = new String(cArray);
            }
            Cipher cipher = Cipher.getInstance((String)object6);
            cipher.init(2, (Key)((SecretKey)g), new IvParameterSpec(byArray7));
            byte[] byArray9 = cipher.doFinal(byArray8);
            object2 = new String(byArray9, StandardCharsets.UTF_8);
        }
        return object2;
    }

    private static Object[] A() {
        Object[] objectArray = h;
        if (h == null) {
            h = new Object[4];
            objectArray = h;
        }
        return objectArray;
    }

    public static void b() {
        H = new int[0x2211 ^ 0x2381];
        s_0.H[0x4AD6 ^ 0x4BCC] = 0x65D1 ^ 0x4BCC;
        s_0.H[0x4A4F ^ 0x4ACC] = 0x4A85 ^ 0x4ACC;
        s_0.H[0x3D39 ^ 0x3D4E] = 0x3D59 ^ 0x3D4E;
        s_0.H[0x137F ^ 0x13CB] = 0x13CB ^ 0x13CB;
        s_0.H[0x9DFC ^ 0x9DBB] = 0xFFFF6275 ^ 0x9DBB;
        s_0.H[0x5F7C ^ 0x5E29] = 0x6AC2 ^ 0x5E29;
        s_0.H[0x3B94 ^ 0x3B97] = 0xFFFFC460 ^ 0x3B97;
        s_0.H[0xD290 ^ 0xD223] = 0xD222 ^ 0xD223;
        s_0.H[0x10C37 ^ 0x10CB3] = 0x10C8F ^ 0x10CB3;
        s_0.H[0x8656 ^ 0x8723] = 0xA1EF ^ 0x8723;
        s_0.H[0x10B34 ^ 0x10A16] = 0x7D9 ^ 0x10A16;
        s_0.H[0x94E3 ^ 0x9478] = 0x9428 ^ 0x9478;
        s_0.H[0x568C ^ 0x562D] = 0xFFFFA9B5 ^ 0x562D;
        s_0.H[0x9CF4 ^ 0x9D8D] = 0x4D7E ^ 0x9D8D;
        s_0.H[0x8BC4 ^ 0x8AD3] = 0xE58D ^ 0x8AD3;
        s_0.H[0x6A61 ^ 0x6B6F] = 0x4FBF ^ 0x6B6F;
        s_0.H[0x3EF1 ^ 0x3EAA] = 0xFFFFC1FA ^ 0x3EAA;
        s_0.H[0x9A7 ^ 0x8BE] = 0x67E0 ^ 0x8BE;
        s_0.H[0xF6B9 ^ 0xF7D4] = 0x376A ^ 0xF7D4;
        s_0.H[0xF002 ^ 0xF14C] = 0x9494 ^ 0xF14C;
        s_0.H[0xED66 ^ 0xED89] = 0x597B ^ 0xED89;
        s_0.H[0x24F ^ 0x2C6] = 0x2FC ^ 0x2C6;
        s_0.H[0xD01 ^ 0xC8F] = 0x8450 ^ 0xC8F;
        s_0.H[0x6EBA ^ 0x6EEC] = 0x6E8D ^ 0x6EEC;
        s_0.H[0xD6AF ^ 0xD7C8] = 0x4AE1 ^ 0xD7C8;
        s_0.H[0x7A5 ^ 0x6B0] = 0x833C ^ 0x6B0;
        s_0.H[0xBE96 ^ 0xBF89] = 0x51B4 ^ 0xBF89;
        s_0.H[0x6AEB ^ 0x6B90] = 0x6B90 ^ 0x6B90;
        s_0.H[0x85BA ^ 0x8572] = 0xC07B ^ 0x8572;
        s_0.H[0xE567 ^ 0xE570] = 0xE570 ^ 0xE570;
        s_0.H[0x82FB ^ 0x8276] = 0xFFFF7DB7 ^ 0x8276;
        s_0.H[0x9750 ^ 0x9652] = 0x2CF4 ^ 0x9652;
        s_0.H[0xACA0 ^ 0xAC84] = 0xAC84 ^ 0xAC84;
        s_0.H[0x83FE ^ 0x82E5] = 0xACE5 ^ 0x82E5;
        s_0.H[0xEFF6 ^ 0xEEFA] = 0xFFFFB18A ^ 0xEEFA;
        s_0.H[0x2B73 ^ 0x2B97] = 0x94AA ^ 0x2B97;
        s_0.H[0x2B62 ^ 0x2A7A] = 0x452B ^ 0x2A7A;
        s_0.H[0x9832 ^ 0x98FF] = 0xFFFF5E04 ^ 0x98FF;
        s_0.H[0x10807 ^ 0x10976] = 0x10B79 ^ 0x10976;
        s_0.H[0x5AD2 ^ 0x5B82] = 0xFFFFC1B3 ^ 0x5B82;
        s_0.H[0x9CC7 ^ 0x9C2C] = 0xADE7 ^ 0x9C2C;
        s_0.H[0xC745 ^ 0xC7E7] = 0xFFFF3826 ^ 0xC7E7;
        s_0.H[0xE542 ^ 0xE47F] = 0x6A41 ^ 0xE47F;
        s_0.H[0x890F ^ 0x8941] = 0x893F ^ 0x8941;
        s_0.H[0xC9E1 ^ 0xC911] = 0x7DEA ^ 0xC911;
        s_0.H[0x1344 ^ 0x1311] = 0x139A ^ 0x1311;
        s_0.H[0xBBCD ^ 0xBB67] = 0xBB6D ^ 0xBB67;
        s_0.H[0x1615 ^ 0x1705] = 0xFFFFCC56 ^ 0x1705;
        s_0.H[0xEA13 ^ 0xEB21] = 0xB222 ^ 0xEB21;
        s_0.H[0x26E4 ^ 0x26D8] = 0x26C5 ^ 0x26D8;
        s_0.H[0xA2C0 ^ 0xA2A5] = 0xFFFF5D18 ^ 0xA2A5;
        s_0.H[0x6483 ^ 0x64B4] = 0x64D0 ^ 0x64B4;
        s_0.H[0xD267 ^ 0xD30C] = 0x13B2 ^ 0xD30C;
        s_0.H[0x263A ^ 0x2608] = 0x261B ^ 0x2608;
        s_0.H[0x499C ^ 0x49B7] = 0xFFFFB67C ^ 0x49B7;
        s_0.H[0xAFD5 ^ 0xAF62] = 0xBA84 ^ 0xAF62;
        s_0.H[0xEBE2 ^ 0xEBA3] = 0xFFFF146B ^ 0xEBA3;
        s_0.H[0xAE8E ^ 0xAF81] = 0x8B5F ^ 0xAF81;
        s_0.H[0xFFBC ^ 0xFFC7] = 0xFFFF0036 ^ 0xFFC7;
        s_0.H[0xC7F3 ^ 0xC676] = 0x8D3E ^ 0xC676;
        s_0.H[0xE856 ^ 0xE830] = 0xFFFF17BB ^ 0xE830;
        s_0.H[0xFC3 ^ 0xFA1] = 0xF9B ^ 0xFA1;
        s_0.H[0x89D2 ^ 0x8913] = 0x3884 ^ 0x8913;
        s_0.H[0x107A8 ^ 0x10690] = 0xFFFEF38A ^ 0x10690;
        s_0.H[0xAC8C ^ 0xACC5] = 0xFFFF5330 ^ 0xACC5;
        s_0.H[0xD21B ^ 0xD2E2] = 0xDEE9 ^ 0xD2E2;
        s_0.H[0xFC8F ^ 0xFD9C] = 0x7810 ^ 0xFD9C;
        s_0.H[0xE97E ^ 0xE85B] = 0x1E590 ^ 0xE85B;
        s_0.H[0xD017 ^ 0xD081] = 0xD0B6 ^ 0xD081;
        s_0.H[0x7571 ^ 0x75DA] = 0x75A4 ^ 0x75DA;
        s_0.H[0x8487 ^ 0x84C4] = 0x84F6 ^ 0x84C4;
        s_0.H[0x9675 ^ 0x961D] = 0xFFFF6996 ^ 0x961D;
        s_0.H[0xE5EA ^ 0xE580] = 0xE5EF ^ 0xE580;
        s_0.H[0x6CB9 ^ 0x6DE1] = 0x765E ^ 0x6DE1;
        s_0.H[0x69C8 ^ 0x69AC] = 0x699A ^ 0x69AC;
        s_0.H[0x8384 ^ 0x828D] = 0xAA91 ^ 0x828D;
        s_0.H[0x7F4C ^ 0x7FEC] = 0x7FB1 ^ 0x7FEC;
        s_0.H[0x615F ^ 0x61AE] = 0xD522 ^ 0x61AE;
        s_0.H[0xD513 ^ 0xD574] = 0xD50C ^ 0xD574;
        s_0.H[0x1D33 ^ 0x1D71] = 0x1D1F ^ 0x1D71;
        s_0.H[0xF86C ^ 0xF86A] = 0xFFFF0796 ^ 0xF86A;
        s_0.H[0xE661 ^ 0xE6E6] = 0xE6CE ^ 0xE6E6;
        s_0.H[0x9800 ^ 0x9930] = 0xFFFF8DC3 ^ 0x9930;
        s_0.H[0x201C ^ 0x2084] = 0x20C7 ^ 0x2084;
        s_0.H[0x3739 ^ 0x3676] = 0x53AE ^ 0x3676;
        s_0.H[0x6DBF ^ 0x6D74] = 0x5456 ^ 0x6D74;
        s_0.H[0x2C8A ^ 0x2DC0] = 0x9EA2 ^ 0x2DC0;
        s_0.H[0x80E ^ 0x8FB] = 0x4F9 ^ 0x8FB;
        s_0.H[0xCF66 ^ 0xCF35] = 0xFFFF30ED ^ 0xCF35;
        s_0.H[0xC409 ^ 0xC41B] = 0xC418 ^ 0xC41B;
        s_0.H[0x9F5 ^ 0x97E] = 0x972 ^ 0x97E;
        s_0.H[0x3E1B ^ 0x3F2F] = 0x663E ^ 0x3F2F;
        s_0.H[0x412F ^ 0x404B] = 0xFFFF4B78 ^ 0x404B;
        s_0.H[0xB98C ^ 0xB949] = 0xFFFF0D77 ^ 0xB949;
        s_0.H[0xAA54 ^ 0xAB79] = 0xE955 ^ 0xAB79;
        s_0.H[0x3415 ^ 0x3434] = 0xB4F8 ^ 0x3434;
        s_0.H[0x4B7B ^ 0x4BA3] = 0x8369 ^ 0x4BA3;
        s_0.H[0xEFD9 ^ 0xEE95] = 0xFFFFA25B ^ 0xEE95;
        s_0.H[0x53C7 ^ 0x532F] = 0x84F3 ^ 0x532F;
        s_0.H[0x7C43 ^ 0x7D4B] = 0xFFFFAAB2 ^ 0x7D4B;
        s_0.H[0xA608 ^ 0xA696] = 0xFFFF5940 ^ 0xA696;
        s_0.H[0x10DCD ^ 0x10C42] = 0x10C43 ^ 0x10C42;
        s_0.H[0x661B ^ 0x6669] = 0x6667 ^ 0x6669;
        s_0.H[0x99DD ^ 0x98AE] = 0xBE62 ^ 0x98AE;
        s_0.H[0x1AB9 ^ 0x1A9E] = 0x1AB6 ^ 0x1A9E;
        s_0.H[0xED5D ^ 0xEC67] = 0x6252 ^ 0xEC67;
        s_0.H[0xBA96 ^ 0xBA3E] = 0xFFFF459A ^ 0xBA3E;
        s_0.H[0x7CD3 ^ 0x7D57] = 0x32F1 ^ 0x7D57;
        s_0.H[0x88A7 ^ 0x89B1] = 0xE6F0 ^ 0x89B1;
        s_0.H[0xCFE7 ^ 0xCEAF] = 0xFFFF5308 ^ 0xCEAF;
        s_0.H[0xB6B2 ^ 0xB78D] = 0x96D4 ^ 0xB78D;
        s_0.H[0xBDEC ^ 0xBD1A] = 0xB161 ^ 0xBD1A;
        s_0.H[0x1589 ^ 0x1536] = 0xA4C8 ^ 0x1536;
        s_0.H[0x1783 ^ 0x16AA] = 0x1F03 ^ 0x16AA;
        s_0.H[0x45FD ^ 0x4572] = 0x4503 ^ 0x4572;
        s_0.H[0xC638 ^ 0xC64E] = 0xC646 ^ 0xC64E;
        s_0.H[0x5FE2 ^ 0x5F76] = 0x5F22 ^ 0x5F76;
        s_0.H[0x2013 ^ 0x2086] = 0x20E5 ^ 0x2086;
        s_0.H[0x8789 ^ 0x8775] = 0xACB7 ^ 0x8775;
        s_0.H[0xD30E ^ 0xD271] = 0xD263 ^ 0xD271;
        s_0.H[0x72E ^ 0x70D] = 0xA4A3 ^ 0x70D;
        s_0.H[0xF2FF ^ 0xF3D4] = 0xB1F8 ^ 0xF3D4;
        s_0.H[0x401 ^ 0x58D] = 0x9E7A ^ 0x58D;
        s_0.H[0x47EB ^ 0x46DA] = 0xADF4 ^ 0x46DA;
        s_0.H[0xA7BD ^ 0xA7AB] = 0xA7A9 ^ 0xA7AB;
        s_0.H[0xB865 ^ 0xB84D] = 0xB8B2 ^ 0xB84D;
        s_0.H[0xD799 ^ 0xD7D2] = 0xD7BE ^ 0xD7D2;
        s_0.H[0xFE02 ^ 0xFF7E] = 0xFF7E ^ 0xFF7E;
        s_0.H[0xF616 ^ 0xF62E] = 0xF677 ^ 0xF62E;
        s_0.H[0x6DEE ^ 0x6CAC] = 0xF0C4 ^ 0x6CAC;
        s_0.H[0x10B5B ^ 0x10BD1] = 0x10BDC ^ 0x10BD1;
        s_0.H[0x3159 ^ 0x3176] = 0xFFFFCEE9 ^ 0x3176;
        s_0.H[0x321A ^ 0x3329] = 0x6A23 ^ 0x3329;
        s_0.H[0x13D7 ^ 0x128A] = 0x7469 ^ 0x128A;
        s_0.H[0x3316 ^ 0x321C] = 0x92F2 ^ 0x321C;
        s_0.H[0x101B2 ^ 0x100C8] = 0x100C8 ^ 0x100C8;
        s_0.H[0x2DD8 ^ 0x2D89] = 0xFFFFD237 ^ 0x2D89;
        s_0.H[0x9931 ^ 0x999D] = 0xFFFF6612 ^ 0x999D;
        s_0.H[0xEEA1 ^ 0xEE87] = 0xEEB2 ^ 0xEE87;
        s_0.H[0xBFD ^ 0xB2D] = 0x1D1F ^ 0xB2D;
        s_0.H[0x565F ^ 0x568B] = 0xA91A ^ 0x568B;
        s_0.H[0x92D4 ^ 0x93BA] = 0x91A5 ^ 0x93BA;
        s_0.H[0xF94A ^ 0xF98C] = 0xB203 ^ 0xF98C;
        s_0.H[0x9EA2 ^ 0x9FDC] = 0x9FDC ^ 0x9FDC;
        s_0.H[0xEDDE ^ 0xEDB1] = 0xFFFF1261 ^ 0xEDB1;
        s_0.H[0x25B0 ^ 0x25F5] = 0xFFFFDA05 ^ 0x25F5;
        s_0.H[0x70F7 ^ 0x7052] = 0xFFFF8FE5 ^ 0x7052;
        s_0.H[0x10E3 ^ 0x10EA] = 0xFFFFEF46 ^ 0x10EA;
        s_0.H[0x625E ^ 0x630D] = 0x57E6 ^ 0x630D;
        s_0.H[0xB2BB ^ 0xB3C3] = 0x6326 ^ 0xB3C3;
        s_0.H[0x8272 ^ 0x82CC] = 0xAF70 ^ 0x82CC;
        s_0.H[0xF23F ^ 0xF227] = 0xF227 ^ 0xF227;
        s_0.H[0xBFC1 ^ 0xBE49] = 0xFC2 ^ 0xBE49;
        s_0.H[0x14F4 ^ 0x1498] = 0xFFFFEB31 ^ 0x1498;
        s_0.H[0x852F ^ 0x853F] = 0x8548 ^ 0x853F;
        s_0.H[0xE983 ^ 0xE959] = 0x2193 ^ 0xE959;
        s_0.H[0x3367 ^ 0x3372] = 0x3372 ^ 0x3372;
        s_0.H[0x56E6 ^ 0x57CA] = 0xFFFFEA70 ^ 0x57CA;
        s_0.H[0x836F ^ 0x83D2] = 0xFFFF5193 ^ 0x83D2;
        s_0.H[0x7DEC ^ 0x7D6C] = 0x7D7A ^ 0x7D6C;
        s_0.H[0x98EC ^ 0x99AB] = 0xFBD7 ^ 0x99AB;
        s_0.H[0x16E5 ^ 0x17E0] = 0xAD4B ^ 0x17E0;
        s_0.H[0x3CC8 ^ 0x3CDB] = 0x3CDB ^ 0x3CDB;
        s_0.H[0x1BD4 ^ 0x1B51] = 0xFFFFE4B5 ^ 0x1B51;
        s_0.H[0x391F ^ 0x39C6] = 0xF14C ^ 0x39C6;
        s_0.H[0x4AE7 ^ 0x4A4E] = 0xFFFFB5C3 ^ 0x4A4E;
        s_0.H[0x3F7D ^ 0x3FCB] = 0x134B0 ^ 0x3FCB;
        s_0.H[0x7885 ^ 0x7812] = 0xFFFF87C7 ^ 0x7812;
        s_0.H[0x7F6C ^ 0x7FE2] = 0x7F78 ^ 0x7FE2;
        s_0.H[0xC5D9 ^ 0xC5D4] = 0xFFFF3A05 ^ 0xC5D4;
        s_0.H[0xC01D ^ 0xC026] = 0xC005 ^ 0xC026;
        s_0.H[0xB08E ^ 0xB0AC] = 0xE9B0 ^ 0xB0AC;
        s_0.H[0xEE88 ^ 0xEF9A] = 0x6A17 ^ 0xEF9A;
        s_0.H[0xE4E8 ^ 0xE49D] = 0xFFFF1B44 ^ 0xE49D;
        s_0.H[0x6C89 ^ 0x6DFE] = 0xBD0D ^ 0x6DFE;
        s_0.H[0x18D4 ^ 0x1995] = 0x38CC ^ 0x1995;
        s_0.H[0x642F ^ 0x6402] = 0xFFFF9BC8 ^ 0x6402;
        s_0.H[0x93C5 ^ 0x933E] = 0xB893 ^ 0x933E;
        s_0.H[0x3001 ^ 0x30FE] = 0x5A49 ^ 0x30FE;
        s_0.H[0xFED6 ^ 0xFED2] = 0xFED9 ^ 0xFED2;
        s_0.H[0x143D ^ 0x1517] = 0x572D ^ 0x1517;
        s_0.H[0xE82D ^ 0xE803] = 0xFFFF17D2 ^ 0xE803;
        s_0.H[0x52AA ^ 0x5252] = 0x5E79 ^ 0x5252;
        s_0.H[0xB8E1 ^ 0xB815] = 0xB46E ^ 0xB815;
        s_0.H[0x64EF ^ 0x64E3] = 0xFFFF9B10 ^ 0x64E3;
        s_0.H[0xE1F1 ^ 0xE179] = 0xE143 ^ 0xE179;
        s_0.H[0x7BF9 ^ 0x7B42] = 0x56FE ^ 0x7B42;
        s_0.H[0x7353 ^ 0x73E6] = 0x1788D ^ 0x73E6;
        s_0.H[0xE51D ^ 0xE51C] = 0xE517 ^ 0xE51C;
        s_0.H[0x4819 ^ 0x4931] = 0x40A3 ^ 0x4931;
        s_0.H[0xB6B2 ^ 0xB683] = 0xB69E ^ 0xB683;
        s_0.H[0x4E76 ^ 0x4EB8] = 0x7794 ^ 0x4EB8;
        s_0.H[0xD7B6 ^ 0xD7E6] = 0xFFFF2808 ^ 0xD7E6;
        s_0.H[0xD74D ^ 0xD7F7] = 0xC214 ^ 0xD7F7;
        s_0.H[0xF575 ^ 0xF52D] = 0xF52B ^ 0xF52D;
        s_0.H[0xBCE3 ^ 0xBCFD] = 0xE14A ^ 0xBCFD;
        s_0.H[0xE2B9 ^ 0xE299] = 0xFEA2 ^ 0xE299;
        s_0.H[0x312A ^ 0x3174] = 0x311B ^ 0x3174;
        s_0.H[0xFCC4 ^ 0xFC75] = 0xFC75 ^ 0xFC75;
        s_0.H[0xFAAA ^ 0xFBEA] = 0xFFFF2564 ^ 0xFBEA;
        s_0.H[0x5C42 ^ 0x5C0F] = 0x5C5C ^ 0x5C0F;
        s_0.H[0xBDB9 ^ 0xBDEB] = 0xFFFF4219 ^ 0xBDEB;
        s_0.H[0x7343 ^ 0x7392] = 0xFFFF9A56 ^ 0x7392;
        s_0.H[0x18CD ^ 0x1940] = 0x59DC ^ 0x1940;
        s_0.H[0xB77 ^ 0xA34] = 0x964B ^ 0xA34;
        s_0.H[0x10602 ^ 0x10648] = 0x1061F ^ 0x10648;
        s_0.H[0x1008 ^ 0x107B] = 0xFFFFEF9B ^ 0x107B;
        s_0.H[0x8759 ^ 0x8607] = 0xAE87 ^ 0x8607;
        s_0.H[0xC62 ^ 0xD5C] = 0x2C17 ^ 0xD5C;
        s_0.H[0x96A9 ^ 0x96B8] = 0x9683 ^ 0x96B8;
        s_0.H[0x101B1 ^ 0x10108] = 0xFFFEEB2F ^ 0x10108;
        s_0.H[0xC36 ^ 0xD19] = 0xE637 ^ 0xD19;
        s_0.H[0xC32 ^ 0xCE5] = 0xC420 ^ 0xCE5;
        s_0.H[0x6061 ^ 0x612A] = 0xD242 ^ 0x612A;
        s_0.H[0x5157 ^ 0x506B] = 0xFFFF21E0 ^ 0x506B;
        s_0.H[0x78B9 ^ 0x7843] = 0x53E9 ^ 0x7843;
        s_0.H[0xCA26 ^ 0xCBA1] = 0x8308 ^ 0xCBA1;
        s_0.H[0xA19F ^ 0xA0C3] = 0xFFFF39F2 ^ 0xA0C3;
        s_0.H[0x7A3B ^ 0x7A89] = 0x7A88 ^ 0x7A89;
        s_0.H[0x16E7 ^ 0x1797] = 0xFFFFEA7F ^ 0x1797;
        s_0.H[0xD712 ^ 0xD60F] = 0xF80F ^ 0xD60F;
        s_0.H[0x7E9F ^ 0x7E95] = 0xFFFF8178 ^ 0x7E95;
        s_0.H[0xB802 ^ 0xB926] = 0xFFFE4B7A ^ 0xB926;
        s_0.H[0x2E9A ^ 0x2FB4] = 0xC48E ^ 0x2FB4;
        s_0.H[0x1833 ^ 0x18F0] = 0x537C ^ 0x18F0;
        s_0.H[0xF101 ^ 0xF156] = 0xF15C ^ 0xF156;
        s_0.H[0x9311 ^ 0x9278] = 0xF51 ^ 0x9278;
        s_0.H[0x6203 ^ 0x6218] = 0xCF4B ^ 0x6218;
        s_0.H[0x7AD6 ^ 0x7BBC] = 0xBB11 ^ 0x7BBC;
        s_0.H[0x1B33 ^ 0x1A77] = 0xFFFF79A7 ^ 0x1A77;
        s_0.H[0xA1E8 ^ 0xA1AC] = 0xA1FE ^ 0xA1AC;
        s_0.H[0x1A53 ^ 0x1A4F] = 0x40A9 ^ 0x1A4F;
        s_0.H[0x8AEA ^ 0x8ADF] = 0x8AB1 ^ 0x8ADF;
        s_0.H[0x10912 ^ 0x1091C] = 0xFFFEF6AC ^ 0x1091C;
        s_0.H[0x9B4A ^ 0x9B45] = 0x9B69 ^ 0x9B45;
        s_0.H[0x14AB ^ 0x15BA] = 0x3164 ^ 0x15BA;
        s_0.H[0x4CAD ^ 0x4C6A] = 0x96E ^ 0x4C6A;
        s_0.H[0xBFA8 ^ 0xBF31] = 0xFFFF40A2 ^ 0xBF31;
        s_0.H[0x76CA ^ 0x7690] = 0xFFFF8949 ^ 0x7690;
        s_0.H[0xFC93 ^ 0xFDA5] = 0xF773 ^ 0xFDA5;
        s_0.H[0xE69E ^ 0xE640] = 0x1E670 ^ 0xE640;
        s_0.H[0x103AA ^ 0x102F3] = 0x1195F ^ 0x102F3;
        s_0.H[0x1095F ^ 0x1083D] = 0x1FCF0 ^ 0x1083D;
        s_0.H[0x3E43 ^ 0x3E1A] = 0xFFFFC1A5 ^ 0x3E1A;
        s_0.H[0xBF31 ^ 0xBF25] = 0xBF24 ^ 0xBF25;
        s_0.H[0x10DEB ^ 0x10D5B] = 0x10D59 ^ 0x10D5B;
        s_0.H[0x8478 ^ 0x84A7] = 0x232D ^ 0x84A7;
        s_0.H[0x10E36 ^ 0x10ED3] = 0xFFFE4E06 ^ 0x10ED3;
        s_0.H[0x4299 ^ 0x4318] = 0xBA19 ^ 0x4318;
        s_0.H[0x6976 ^ 0x6877] = 0x2C0 ^ 0x6877;
        s_0.H[0x3021 ^ 0x305E] = 0x306E ^ 0x305E;
        s_0.H[0xE9A7 ^ 0xE9DD] = 0xFFFF1658 ^ 0xE9DD;
        s_0.H[0x66AB ^ 0x6692] = 0xFFFF9964 ^ 0x6692;
        s_0.H[0xFE14 ^ 0xFE54] = 0xFE92 ^ 0xFE54;
        s_0.H[0xFE6D ^ 0xFEFF] = 0xFEF7 ^ 0xFEFF;
        s_0.H[0x5DA5 ^ 0x5C2F] = 0x815C ^ 0x5C2F;
        s_0.H[0xA7E8 ^ 0xA70A] = 0x8A ^ 0xA70A;
        s_0.H[0x358A ^ 0x34DB] = 0x5103 ^ 0x34DB;
        s_0.H[0x9703 ^ 0x97CA] = 0xFFFF2D1E ^ 0x97CA;
        s_0.H[0x583E ^ 0x5973] = 0xEA1B ^ 0x5973;
        s_0.H[0x9047 ^ 0x900B] = 0x9006 ^ 0x900B;
        s_0.H[0x50CA ^ 0x5017] = 0x1501D ^ 0x5017;
        s_0.H[0x1DED ^ 0x1D8D] = 0xFFFFE229 ^ 0x1D8D;
        s_0.H[0x6BC1 ^ 0x6BEB] = 0xFFFF9479 ^ 0x6BEB;
        s_0.H[0x1C97 ^ 0x1CB2] = 0xFFFFE361 ^ 0x1CB2;
        s_0.H[0x66A7 ^ 0x67EE] = 0x592 ^ 0x67EE;
        s_0.H[0x2C5C ^ 0x2D19] = 0xB166 ^ 0x2D19;
        s_0.H[0x6405 ^ 0x647B] = 0xFFFF9BCD ^ 0x647B;
        s_0.H[0x5AB0 ^ 0x5AA9] = 0x5831 ^ 0x5AA9;
        s_0.H[0x37D7 ^ 0x3755] = 0x37C6 ^ 0x3755;
        s_0.H[0x10C33 ^ 0x10CDA] = 0x1DB38 ^ 0x10CDA;
        s_0.H[0xC5C0 ^ 0xC442] = 0x28A1 ^ 0xC442;
        s_0.H[0xA0C8 ^ 0xA0D7] = 0x161D ^ 0xA0D7;
        s_0.H[0x5D92 ^ 0x5D78] = 0x8AA4 ^ 0x5D78;
        s_0.H[0x6957 ^ 0x69B6] = 0xFFFF31CF ^ 0x69B6;
        s_0.H[0x81C2 ^ 0x8084] = 0xE2FD ^ 0x8084;
        s_0.H[0x5A6D ^ 0x5A8D] = 0xFD0D ^ 0x5A8D;
        s_0.H[0xAC1C ^ 0xAC5A] = 0xAC52 ^ 0xAC5A;
        s_0.H[0x6725 ^ 0x67E7] = 0xD615 ^ 0x67E7;
        s_0.H[0x1785 ^ 0x17CD] = 0xFFFFE82B ^ 0x17CD;
        s_0.H[0x24A4 ^ 0x241C] = 0x31FF ^ 0x241C;
        s_0.H[0xFA95 ^ 0xFBB2] = 0xF21B ^ 0xFBB2;
        s_0.H[0xDBE2 ^ 0xDB7E] = 0xDB26 ^ 0xDB7E;
        s_0.H[0xC99B ^ 0xC8E6] = 0xC8E7 ^ 0xC8E6;
        s_0.H[0x9190 ^ 0x91CC] = 0xFFFF6E62 ^ 0x91CC;
        s_0.H[0xA98D ^ 0xA94D] = 0x18BF ^ 0xA94D;
        s_0.H[0x3E79 ^ 0x3F0B] = 0x19D9 ^ 0x3F0B;
        s_0.H[0xCCF6 ^ 0xCDD7] = 0x23EA ^ 0xCDD7;
        s_0.H[0x621D ^ 0x62FE] = 0xDDC5 ^ 0x62FE;
        s_0.H[0x8341 ^ 0x8242] = 0x38E9 ^ 0x8242;
        s_0.H[0x600F ^ 0x6062] = 0x6002 ^ 0x6062;
        s_0.H[0xF18E ^ 0xF1A2] = 0xFFFF0E3F ^ 0xF1A2;
        s_0.H[0xF41F ^ 0xF471] = 0xF441 ^ 0xF471;
        s_0.H[0x8798 ^ 0x87AE] = 0xFFFF786F ^ 0x87AE;
        s_0.H[0x349C ^ 0x3453] = 0x226A ^ 0x3453;
        s_0.H[0xB798 ^ 0xB6B8] = 0xFFFFA70D ^ 0xB6B8;
        s_0.H[0x547D ^ 0x551C] = 0x7D93 ^ 0x551C;
        s_0.H[0xFC7C ^ 0xFC15] = 0xFFFF03F7 ^ 0xFC15;
        s_0.H[0x2A07 ^ 0x2B1B] = 0xFFFFFAA4 ^ 0x2B1B;
        s_0.H[0x8424 ^ 0x84D3] = 0x84D3 ^ 0x84D3;
        s_0.H[0x35C9 ^ 0x34C2] = 0x9424 ^ 0x34C2;
        s_0.H[0xC635 ^ 0xC756] = 0x339D ^ 0xC756;
        s_0.H[0x5A34 ^ 0x5B34] = 0xFFFFCE6D ^ 0x5B34;
        s_0.H[0x7B94 ^ 0x7A93] = 0x528F ^ 0x7A93;
        s_0.H[0x950B ^ 0x9587] = 0xFFFF6A3D ^ 0x9587;
        s_0.H[0x68BD ^ 0x6813] = 0xFFFF97E4 ^ 0x6813;
        s_0.H[0xF53E ^ 0xF591] = 0xF590 ^ 0xF591;
        s_0.H[0xFEC0 ^ 0xFE94] = 0xFFFF0162 ^ 0xFE94;
        s_0.H[0xF67 ^ 0xF04] = 0xFFFFF0B1 ^ 0xF04;
        s_0.H[0x10516 ^ 0x105C5] = 0x1FA53 ^ 0x105C5;
        s_0.H[0xAE93 ^ 0xAF18] = 0x688E ^ 0xAF18;
        s_0.H[0x52D0 ^ 0x528D] = 0x52F3 ^ 0x528D;
        s_0.H[0xC589 ^ 0xC564] = 0xF486 ^ 0xC564;
        s_0.H[0xD966 ^ 0xD964] = 0xFFFF26F0 ^ 0xD964;
        s_0.H[0x3DEB ^ 0x3DDB] = 0x3D94 ^ 0x3DDB;
        s_0.H[0xF678 ^ 0xF72F] = 0xEC83 ^ 0xF72F;
        s_0.H[0x102EA ^ 0x1039E] = 0xFFFEDAD7 ^ 0x1039E;
        s_0.H[0x6ABB ^ 0x6AC2] = 0xFFFF955D ^ 0x6AC2;
        s_0.H[0x7856 ^ 0x7869] = 0x7840 ^ 0x7869;
        s_0.H[0x15B9 ^ 0x153F] = 0xFFFFEAF3 ^ 0x153F;
        s_0.H[0x37BA ^ 0x378E] = 0xFFFFC8FD ^ 0x378E;
        s_0.H[0xB2F7 ^ 0xB2F7] = 0xB29A ^ 0xB2F7;
        s_0.H[0x92F9 ^ 0x92D0] = 0x92A1 ^ 0x92D0;
        s_0.H[0x9A51 ^ 0x9A21] = 0xFFFF65BA ^ 0x9A21;
        s_0.H[0x90AA ^ 0x9071] = 0x19043 ^ 0x9071;
        s_0.H[0x2109 ^ 0x2196] = 0xFFFFDE23 ^ 0x2196;
        s_0.H[0xFA96 ^ 0xFA4A] = 0x1FA7A ^ 0xFA4A;
        s_0.H[0xAC0B ^ 0xAD54] = 0x85DB ^ 0xAD54;
        s_0.H[0xCDBD ^ 0xCDC0] = 0xFFFF3239 ^ 0xCDC0;
        s_0.H[0x4861 ^ 0x489F] = 0x2231 ^ 0x489F;
        s_0.H[0xBE7D ^ 0xBE43] = 0xFFFF4194 ^ 0xBE43;
        s_0.H[0xF258 ^ 0xF26B] = 0xF245 ^ 0xF26B;
        s_0.H[0x3C94 ^ 0x3C69] = 0x17C4 ^ 0x3C69;
        s_0.H[0xBEA3 ^ 0xBE51] = 0xAAA ^ 0xBE51;
        s_0.H[0xCED8 ^ 0xCFEF] = 0xC53B ^ 0xCFEF;
        s_0.H[0xAB6A ^ 0xABA0] = 0xEEA9 ^ 0xABA0;
        s_0.H[0x492F ^ 0x492A] = 0x4937 ^ 0x492A;
        s_0.H[0x1C ^ 0x19A] = 0x7B32 ^ 0x19A;
        s_0.H[0x2787 ^ 0x271D] = 0xFFFFD87A ^ 0x271D;
        s_0.H[0xB90F ^ 0xB907] = 0xB938 ^ 0xB907;
        s_0.H[0x7B5D ^ 0x7B40] = 0x6A87 ^ 0x7B40;
        s_0.H[0xE151 ^ 0xE16C] = 0xE11E ^ 0xE16C;
        s_0.H[0x784A ^ 0x78A4] = 0x4967 ^ 0x78A4;
        s_0.H[0x7C2F ^ 0x7D7D] = 0x498D ^ 0x7D7D;
        s_0.H[0x2567 ^ 0x251B] = 0xFFFFDAB6 ^ 0x251B;
        s_0.H[0x3BFD ^ 0x3AA6] = 0x5C45 ^ 0x3AA6;
        s_0.H[0x8EC4 ^ 0x8E08] = 0xB724 ^ 0x8E08;
        s_0.H[0xB337 ^ 0xB26D] = 0xD482 ^ 0xB26D;
        s_0.H[0x10017 ^ 0x100B4] = 0xFFFEFF07 ^ 0x100B4;
        s_0.H[0x1033E ^ 0x103AD] = 0xFFFEFC1B ^ 0x103AD;
        s_0.H[0xB000 ^ 0xB0F3] = 0xBC8C ^ 0xB0F3;
        s_0.H[0xC522 ^ 0xC454] = 0x14BB ^ 0xC454;
        s_0.H[0x3708 ^ 0x3763] = 0xFFFFC8BF ^ 0x3763;
        s_0.H[0xB5C9 ^ 0xB596] = 0xFFFF4A5A ^ 0xB596;
        s_0.H[0x10A35 ^ 0x10B0C] = 0x101D8 ^ 0x10B0C;
        s_0.H[0xE83 ^ 0xF0A] = 0xD13B ^ 0xF0A;
        s_0.H[0x14A9 ^ 0x158A] = 0x11841 ^ 0x158A;
        s_0.H[0xE032 ^ 0xE107] = 0xB80D ^ 0xE107;
        s_0.H[0xD13D ^ 0xD1BC] = 0xD1A6 ^ 0xD1BC;
        s_0.H[0x4092 ^ 0x41FE] = 0xFFFF7E89 ^ 0x41FE;
        s_0.H[0x5A8 ^ 0x57D] = 0xFFFF0515 ^ 0x57D;
        s_0.H[0x5258 ^ 0x5346] = 0xBD78 ^ 0x5346;
        s_0.H[0x1064E ^ 0x1063F] = 0x1065E ^ 0x1063F;
        s_0.H[0x1AF ^ 0xAB] = 0xBA40 ^ 0xAB;
        s_0.H[0x1BB2 ^ 0x1A94] = 0x1328 ^ 0x1A94;
        s_0.H[0x103C5 ^ 0x102A3] = 0x19F92 ^ 0x102A3;
        s_0.H[0x56F6 ^ 0x57A2] = 0x6313 ^ 0x57A2;
        s_0.H[0xF1BD ^ 0xF0EB] = 0xEB56 ^ 0xF0EB;
        s_0.H[0xF16F ^ 0xF164] = 0xFFFF0EFD ^ 0xF164;
        s_0.H[0x58AA ^ 0x59CF] = 0xAD04 ^ 0x59CF;
        s_0.H[0x605E ^ 0x603F] = 0xFFFF9F44 ^ 0x603F;
        s_0.H[0x684E ^ 0x6943] = 0xC9A5 ^ 0x6943;
        s_0.H[0xBBEB ^ 0xBB76] = 0xFFFF44EB ^ 0xBB76;
        s_0.H[0x13D3 ^ 0x12B3] = 0x3A35 ^ 0x12B3;
        s_0.H[0x88A9 ^ 0x886D] = 0xC3E2 ^ 0x886D;
        s_0.H[0xE109 ^ 0xE1DF] = 0x1E4E ^ 0xE1DF;
        s_0.H[0x9F3F ^ 0x9E50] = 0x9C5F ^ 0x9E50;
        s_0.H[0xFB7E ^ 0xFB31] = 0xFFFF04BD ^ 0xFB31;
        s_0.H[0x1806 ^ 0x183C] = 0x181A ^ 0x183C;
        s_0.H[0xFDEA ^ 0xFD7A] = 0xFD53 ^ 0xFD7A;
        s_0.H[0x4037 ^ 0x4131] = 0x6937 ^ 0x4131;
        s_0.H[0xEF40 ^ 0xEFA6] = 0x509B ^ 0xEFA6;
        s_0.H[0x2031 ^ 0x2097] = 0xFFFFDFFC ^ 0x2097;
        s_0.H[0xB223 ^ 0xB3A0] = 0xC6C5 ^ 0xB3A0;
        s_0.H[0x10558 ^ 0x105FF] = 0x105C6 ^ 0x105FF;
        s_0.H[0xD0AC ^ 0xD197] = 0x5FA9 ^ 0xD197;
        s_0.H[0xD7B7 ^ 0xD726] = 0xFFFF288A ^ 0xD726;
        s_0.H[0x2583 ^ 0x25FB] = 0xFFFFDA1A ^ 0x25FB;
        s_0.H[0xE6B6 ^ 0xE6C2] = 0xE6C3 ^ 0xE6C2;
        s_0.H[0x3D79 ^ 0x3C11] = 0xA14E ^ 0x3C11;
        s_0.H[0xD62A ^ 0xD73E] = 0xFFFFAD55 ^ 0xD73E;
        s_0.H[0x2BE2 ^ 0x2B0E] = 0x1ACD ^ 0x2B0E;
        s_0.H[0x80BC ^ 0x813C] = 0xFC5C ^ 0x813C;
        s_0.H[0xFA75 ^ 0xFAA7] = 0xEC95 ^ 0xFAA7;
        s_0.H[0xDB2B ^ 0xDBCC] = 0xC11 ^ 0xDBCC;
        s_0.H[0x7C ^ 0x7B] = 0x3E ^ 0x7B;
        s_0.H[0xAEBA ^ 0xAE1E] = 0xAE1F ^ 0xAE1E;
        s_0.H[0xF9C9 ^ 0xF964] = 0xFFFF06FC ^ 0xF964;
        s_0.H[0x5BA4 ^ 0x5B18] = 0x76A4 ^ 0x5B18;
        s_0.H[0xAF88 ^ 0xAF92] = 0x47A3 ^ 0xAF92;
    }
}

