/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.util.render.font;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import kotakbaz.rain.client.util.render.font.C;
import kotakbaz.rain.client.util.render.font.E;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010 \n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\b\f\u0010\u000bR\u001b\u0010\u0011\u001a\u00020\u00078FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0014\u001a\u00020\u00078FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010R\u001b\u0010\u0017\u001a\u00020\u00078FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0016\u0010\u0010R\u001b\u0010\u001a\u001a\u00020\u00078FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0018\u0010\u000e\u001a\u0004\b\u0019\u0010\u0010R\u001b\u0010\u001d\u001a\u00020\u00078FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001b\u0010\u000e\u001a\u0004\b\u001c\u0010\u0010R!\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00070\u001e8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001f\u0010\u000e\u001a\u0004\b \u0010!\u00a8\u0006#"}, d2={"Lkotakbaz/rain/client/util/render/font/Fonts;", "", "<init>", "()V", "", "folder", "name", "Lkotakbaz/rain/client/util/render/font/Font;", "get", "(Ljava/lang/String;Ljava/lang/String;)Lkotakbaz/rain/client/util/render/font/Font;", "GS", "Ljava/lang/String;", "RAIN", "GS_BOLD$delegate", "Lkotlin/Lazy;", "getGS_BOLD", "()Lkotakbaz/rain/client/util/render/font/Font;", "GS_BOLD", "GS_SEMI$delegate", "getGS_SEMI", "GS_SEMI", "GS_MEDIUM$delegate", "getGS_MEDIUM", "GS_MEDIUM", "GS_REGULAR$delegate", "getGS_REGULAR", "GS_REGULAR", "ICON$delegate", "getICON", "ICON", "", "all$delegate", "getAll", "()Ljava/util/List;", "all", "rain-visuals"})
public final class D {
    @NotNull
    public static final D INSTANCE;
    @NotNull
    public static final String a = "google_sans";
    @NotNull
    public static final String A = "rain";
    @NotNull
    private static final Lazy b;
    @NotNull
    private static final Lazy B;
    @NotNull
    private static final Lazy c;
    @NotNull
    private static final Lazy C;
    @NotNull
    private static final Lazy d;
    @NotNull
    private static final Lazy D;
    private static Object[] e;
    private static Object f;
    private static Object[] F;
    private static Object[] E;
    private static Object[] g;
    public static int[] G;

    private D() {
        super();
    }

    @NotNull
    public final E getGS_BOLD() {
        Lazy lazy = b;
        return (E)lazy.getValue();
    }

    @NotNull
    public final E getGS_SEMI() {
        Lazy lazy = B;
        return (E)lazy.getValue();
    }

    @NotNull
    public final E getGS_MEDIUM() {
        Lazy lazy = c;
        return (E)lazy.getValue();
    }

    @NotNull
    public final E getGS_REGULAR() {
        Lazy lazy = C;
        return (E)lazy.getValue();
    }

    @NotNull
    public final E getICON() {
        Lazy lazy = d;
        return (E)lazy.getValue();
    }

    @NotNull
    public final List<E> getAll() {
        Lazy lazy = D;
        return (List)lazy.getValue();
    }

    private final E get(String string, String string2) {
        String string3 = string2;
        String string4 = string;
        int n = G[0];
        n ^= G[1];
        return new C().find(string4 + (String)e[n -= G[2]] + string3).build();
    }

    private static final E GS_BOLD_delegate$lambda$0() {
        int n = G[3];
        n ^= G[4];
        int n2 = G[6];
        n2 ^= G[7];
        int n3 = G[9];
        n3 -= G[10];
        return INSTANCE.get((String)e[n -= G[5]], (String)e[n2 += G[8]] + (String)e[n3 -= G[11]]);
    }

    private static final E GS_SEMI_delegate$lambda$0() {
        int n = G[12];
        n -= G[13];
        int n2 = G[15];
        n2 ^= G[16];
        int n3 = G[18];
        n3 += G[19];
        return INSTANCE.get((String)e[n -= G[14]], (String)e[n2 += G[17]] + (String)e[n3 += G[20]]);
    }

    private static final E GS_MEDIUM_delegate$lambda$0() {
        int n = G[21];
        n -= G[22];
        int n2 = G[24];
        n2 += G[25];
        int n3 = G[27];
        n3 += G[28];
        return INSTANCE.get((String)e[n += G[23]], (String)e[n2 -= G[26]] + (String)e[n3 ^= G[29]]);
    }

    private static final E GS_REGULAR_delegate$lambda$0() {
        int n = G[30];
        n -= G[31];
        int n2 = G[33];
        n2 -= G[34];
        int n3 = G[36];
        n3 ^= G[37];
        return INSTANCE.get((String)e[n += G[32]], (String)e[n2 ^= G[35]] + (String)e[n3 ^= G[38]]);
    }

    private static final E ICON_delegate$lambda$0() {
        int n = G[39];
        n += G[40];
        int n2 = G[42];
        n2 -= G[43];
        return INSTANCE.get((String)e[n += G[41]], (String)e[n2 -= G[44]]);
    }

    private static final List all_delegate$lambda$0() {
        int n = G[45];
        n += G[46];
        E[] eArray = new E[n -= G[47]];
        int n2 = G[48];
        n2 += G[49];
        eArray[n2 ^= kotakbaz.rain.client.util.render.font.D.G[50]] = INSTANCE.getGS_BOLD();
        int n3 = G[51];
        n3 ^= G[52];
        eArray[n3 -= kotakbaz.rain.client.util.render.font.D.G[53]] = INSTANCE.getGS_SEMI();
        int n4 = G[54];
        n4 ^= G[55];
        eArray[n4 ^= kotakbaz.rain.client.util.render.font.D.G[56]] = INSTANCE.getGS_MEDIUM();
        int n5 = G[57];
        n5 ^= G[58];
        eArray[n5 ^= kotakbaz.rain.client.util.render.font.D.G[59]] = INSTANCE.getGS_REGULAR();
        int n6 = G[60];
        n6 -= G[61];
        eArray[n6 -= kotakbaz.rain.client.util.render.font.D.G[62]] = INSTANCE.getICON();
        return CollectionsKt.listOf(eArray);
    }

    static {
        kotakbaz.rain.client.util.render.font.D.b();
        long l = 1002073559141887065L;
        long l2 = 5178272923026802633L;
        long l3 = 423771551838715791L;
        long l4 = -1457033442929243932L;
        long l5 = -3351571145320747714L;
        long l6 = 5370337672945948568L;
        long l7 = -3859038318404066641L;
        long l8 = 4862633095935401407L;
        long l9 = -3576253843112883071L;
        long l10 = -7639291057446967172L;
        long l11 = -8541616931896955679L;
        long l12 = -6653314808575292529L;
        long l13 = 5364362410641514743L;
        long l14 = -6966586093100440086L;
        int n = G[63];
        n -= G[64];
        e = new Object[n += G[65]];
        long l15 = l14;
        int n2 = G[66];
        n2 += G[67];
        l14 = l15 ^ (0L ^ l15) & -1L << (n2 += G[68]);
        Object[] objectArray = new Object[G[69]];
        objectArray[kotakbaz.rain.client.util.render.font.D.G[70]] = E;
        objectArray[kotakbaz.rain.client.util.render.font.D.G[71]] = G[72];
        int n3 = G[73];
        Object object = kotakbaz.rain.client.util.render.font.D.A()[G[74]];
        if (object == null) {
            char[] cArray = "\u1e1b\u1de4\u1ea5\u1df7\u1e0f\u1e07\u1df0\u1e0e\u1df5\u1e07\u1e12\u1e0a\u1e05\u1f5d\u1f4e\u1dfd\u1f56\u1deb\u1f50\u1e13\u1e1a\u1df4\u1f57\u1de7\u1de9\u1e0f\u1e1d\u1df0\u1e10\u1dec\u1e12\u1e16\u1f54\u1f5d\u1ea5\u1e08\u1deb\u1de9\u1f4e\u1f4f\u1e14\u1dec\u1de6\u1e13\u1de6\u1e0e\u1f57\u1e16\u1df7\u1f50\u1de0\u1df5\u1dfa\u1e10\u1e17\u1f57\u1f5c\u1dfd\u1e1a\u1de4\u1dea\u1dea\u1e0b\u1e11\u1e05\u1f5d\u1f59\u1e06\u1f56\u1f5b\u1e14\u1f5d\u1f57\u1dea\u1df2\u1e08\u1ea5\u1e00\u1de0\u1f4f\u1f5c\u1ea5\u1f50\u1df1\u1f4f\u1e00\u1de7\u1e05\u1df4\u1f54\u1dfc\u1e0c\u1f5a\u1f4e\u1dec\u1e12\u1df3\u1df6\u1df6\u1f5b\u1ded\u1e0b\u1f57\u1dee\u1dfb\u1df1\u1e00\u1e08\u1de0\u1df2\u1e0a\u1f52\u1de7\u1e0a\u1f59\u1e00\u1f57\u1e0e\u1f52\u1df3\u1f5d\u1e0a\u1e0d\u1f59\u1df5\u1e0a\u1de4\u1de4\u1e1d\u1e0f\u1df7\u1f4f\u1e14\u1ded\u1f54\u1dfc\u1f4f\u1e11\u1de0\u1f5a\u1df5\u1e15\u1dfc\u1f52\u1e1d\u1f5b\u1dee\u1f52\u1e17\u1f56\u1f5a\u1e04\u1e07\u1dec\u1e17\u1f5b\u1dec\u1e11\u1dfa\u1e0e\u1f52\u1df2\u1e05\u1e0c\u1e15\u1e0d\u1dfa\u1e1a\u1e11\u1e14\u1f56\u1df0\u1e0f\u1de6\u1f57\u1dea\u1e0e\u1df5\u1dfa\u1f52\u1e12\u1dec\u1de0\u1df5\u1e10\u1f57\u1ea5\u1de0\u1de0\u1df5\u1def\u1dfd\u1df1\u1f50\u1e19\u1dec\u1e19\u1f4e\u1dfc\u1df3\u1f5c\u1f4f\u1e0d\u1f59\u1f5b\u1e07\u1df5\u1e1a\u1df5\u1ded\u1f5c\u1de8\u1f56\u1dfa\u1def\u1dfd\u1de9\u1f52\u1df9\u1f5b\u1e0e\u1df1\u1e14\u1df9\u1e09\u1dfb\u1df0\u1e06\u1def\u1de6\u1e0b\u1df2\u1dfc\u1dfa\u1f57\u1f58".toCharArray();
            for (int i = G[75]; i < G[76]; ++i) {
                int n4 = cArray[i];
                n4 += G[77];
                n4 ^= G[78];
                n4 += G[79];
                n4 ^= G[80];
                n4 -= G[81];
                n4 -= G[82];
                n4 += G[83];
                n4 -= G[84];
                n4 -= G[85];
                n4 += G[86];
                n4 += G[87];
                n4 ^= G[88];
                n4 -= G[89];
                cArray[i] = (char)(n4 ^= G[90]);
            }
            object = kotakbaz.rain.client.util.render.font.D.A()[kotakbaz.rain.client.util.render.font.D.G[91]] = new String(cArray);
        }
        objectArray[n3] = (String)object;
        char[] cArray = ((String)kotakbaz.rain.client.util.render.font.D.a(objectArray)).toCharArray();
        long l16 = l5;
        int n5 = G[92];
        n5 += G[93];
        l5 = l16 ^ (0x9800000000L ^ l16) & -1L << (n5 ^= G[94]);
        long l17 = l12;
        int n6 = G[95];
        n6 -= G[96];
        l12 = l17 ^ (0L ^ l17) & -1L >>> (n6 -= G[97]);
        while (true) {
            int n7 = G[98];
            n7 += G[99];
            if ((int)l12 >= (int)(l5 >>> (n7 -= G[100]))) break;
            int n8 = (int)l12;
            long l18 = l12;
            int n9 = G[101];
            n9 += G[102];
            int n10 = G[104];
            n10 += G[105];
            l12 = l18 ^ (l18 ^ l18 + (long)(n9 += G[103])) & -1L >>> (n10 -= G[106]);
            long l19 = l8;
            int n11 = G[107];
            n11 += G[108];
            l8 = l19 ^ ((long)cArray[n8] ^ l19) & -1L >>> (n11 += G[109]);
            int n12 = (int)l12;
            long l20 = l12;
            int n13 = G[110];
            n13 ^= G[111];
            int n14 = G[113];
            n14 -= G[114];
            l12 = l20 ^ (l20 ^ l20 + (long)(n13 += G[112])) & -1L >>> (n14 ^= G[115]);
            int n15 = G[116];
            n15 ^= G[117];
            long l21 = l9;
            int n16 = G[119];
            n16 += G[120];
            l9 = l21 ^ ((long)cArray[n12] << (n15 ^= G[118]) ^ l21) & -1L << (n16 ^= G[121]);
            int n17 = G[122];
            n17 -= G[123];
            n17 ^= G[124];
            int n18 = G[125];
            n18 += G[126];
            long l22 = l11;
            int n19 = G[128];
            n19 += G[129];
            l11 = l22 ^ ((long)((int)l8 << n17 | (int)(l9 >>> (n18 ^= G[127]))) ^ l22) & -1L >>> (n19 -= G[130]);
            char[] cArray2 = new char[(int)l11];
            long l23 = l13;
            int n20 = G[131];
            n20 ^= G[132];
            l13 = l23 ^ (0L ^ l23) & -1L << (n20 += G[133]);
            while (true) {
                int n21 = G[134];
                n21 ^= G[135];
                if ((int)(l13 >>> (n21 -= G[136])) >= (int)l11) break;
                int n22 = G[137];
                n22 -= G[138];
                int n23 = G[140];
                n23 ^= G[141];
                cArray2[(int)(l13 >>> (n22 -= kotakbaz.rain.client.util.render.font.D.G[139]))] = cArray[(int)l12 + (int)(l13 >>> (n23 ^= G[142]))];
                l13 += 0x100000000L;
            }
            int n24 = G[143];
            n24 -= G[144];
            int n25 = (int)(l14 >>> (n24 += G[145]));
            l14 += 0x100000000L;
            kotakbaz.rain.client.util.render.font.D.e[n25] = new String(cArray2);
            long l24 = l12;
            int n26 = G[146];
            n26 += G[147];
            l12 = l24 ^ ((long)((int)l12 + (int)l11) ^ l24) & -1L >>> (n26 -= G[148]);
        }
        INSTANCE = new D();
        b = LazyKt.lazy(D::GS_BOLD_delegate$lambda$0);
        B = LazyKt.lazy(D::GS_SEMI_delegate$lambda$0);
        c = LazyKt.lazy(D::GS_MEDIUM_delegate$lambda$0);
        C = LazyKt.lazy(D::GS_REGULAR_delegate$lambda$0);
        d = LazyKt.lazy(D::ICON_delegate$lambda$0);
        D = LazyKt.lazy(D::all_delegate$lambda$0);
    }

    public static Object a(Object[] object) {
        Object object2;
        int n = (Integer)object[G[149]];
        String string = (String)object[G[150]];
        object = object[G[151]];
        Object[] objectArray = F;
        if (F == null) {
            objectArray = F = new Object[G[152]];
        }
        if ((object2 = objectArray[n]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[G[153]];
                E = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[G[155] ^ G[156]];
                byArray[kotakbaz.rain.client.util.render.font.D.G[157] ^ kotakbaz.rain.client.util.render.font.D.G[158]] = G[159] ^ G[160];
                byArray[kotakbaz.rain.client.util.render.font.D.G[161] ^ kotakbaz.rain.client.util.render.font.D.G[162]] = G[163] ^ G[164];
                byArray[kotakbaz.rain.client.util.render.font.D.G[165] ^ kotakbaz.rain.client.util.render.font.D.G[166]] = G[167] ^ G[168];
                byArray[kotakbaz.rain.client.util.render.font.D.G[169] ^ kotakbaz.rain.client.util.render.font.D.G[170]] = G[171] ^ G[172];
                byArray[kotakbaz.rain.client.util.render.font.D.G[173] ^ kotakbaz.rain.client.util.render.font.D.G[174]] = G[175] ^ G[176];
                byArray[kotakbaz.rain.client.util.render.font.D.G[177] ^ kotakbaz.rain.client.util.render.font.D.G[178]] = G[179] ^ G[180];
                byArray[kotakbaz.rain.client.util.render.font.D.G[181] ^ kotakbaz.rain.client.util.render.font.D.G[182]] = G[183] ^ G[184];
                byArray[kotakbaz.rain.client.util.render.font.D.G[185] ^ kotakbaz.rain.client.util.render.font.D.G[186]] = G[187] ^ G[188];
                byArray[kotakbaz.rain.client.util.render.font.D.G[189] ^ kotakbaz.rain.client.util.render.font.D.G[190]] = G[191] ^ G[192];
                byArray[kotakbaz.rain.client.util.render.font.D.G[193] ^ kotakbaz.rain.client.util.render.font.D.G[194]] = G[195] ^ G[196];
                byArray[kotakbaz.rain.client.util.render.font.D.G[197] ^ kotakbaz.rain.client.util.render.font.D.G[198]] = G[199] ^ G[200];
                byArray[kotakbaz.rain.client.util.render.font.D.G[201] ^ kotakbaz.rain.client.util.render.font.D.G[202]] = G[203] ^ G[204];
                byArray[kotakbaz.rain.client.util.render.font.D.G[205] ^ kotakbaz.rain.client.util.render.font.D.G[206]] = G[207] ^ G[208];
                byArray[kotakbaz.rain.client.util.render.font.D.G[209] ^ kotakbaz.rain.client.util.render.font.D.G[210]] = G[211] ^ G[212];
                byArray[kotakbaz.rain.client.util.render.font.D.G[213] ^ kotakbaz.rain.client.util.render.font.D.G[214]] = G[215] ^ G[216];
                byArray[kotakbaz.rain.client.util.render.font.D.G[217] ^ kotakbaz.rain.client.util.render.font.D.G[218]] = G[219] ^ G[220];
                objectArray2[kotakbaz.rain.client.util.render.font.D.G[154]] = byArray;
            }
            byte[] byArray = (byte[])object3[G[221]];
            if (f == null) {
                byte[] byArray2 = new byte[G[222] ^ G[223]];
                byArray2[kotakbaz.rain.client.util.render.font.D.G[224] ^ kotakbaz.rain.client.util.render.font.D.G[225]] = G[226] ^ G[227];
                byArray2[kotakbaz.rain.client.util.render.font.D.G[228] ^ kotakbaz.rain.client.util.render.font.D.G[229]] = G[230] ^ G[231];
                byArray2[kotakbaz.rain.client.util.render.font.D.G[232] ^ kotakbaz.rain.client.util.render.font.D.G[233]] = G[234] ^ G[235];
                byArray2[kotakbaz.rain.client.util.render.font.D.G[236] ^ kotakbaz.rain.client.util.render.font.D.G[237]] = G[238] ^ G[239];
                byArray2[kotakbaz.rain.client.util.render.font.D.G[240] ^ kotakbaz.rain.client.util.render.font.D.G[241]] = G[242] ^ G[243];
                byArray2[kotakbaz.rain.client.util.render.font.D.G[244] ^ kotakbaz.rain.client.util.render.font.D.G[245]] = G[246] ^ G[247];
                byArray2[kotakbaz.rain.client.util.render.font.D.G[248] ^ kotakbaz.rain.client.util.render.font.D.G[249]] = G[250] ^ G[251];
                byArray2[kotakbaz.rain.client.util.render.font.D.G[252] ^ kotakbaz.rain.client.util.render.font.D.G[253]] = G[254] ^ G[255];
                byArray2[kotakbaz.rain.client.util.render.font.D.G[256] ^ kotakbaz.rain.client.util.render.font.D.G[257]] = G[258] ^ G[259];
                byArray2[kotakbaz.rain.client.util.render.font.D.G[260] ^ kotakbaz.rain.client.util.render.font.D.G[261]] = G[262] ^ G[263];
                byArray2[kotakbaz.rain.client.util.render.font.D.G[264] ^ kotakbaz.rain.client.util.render.font.D.G[265]] = G[266] ^ G[267];
                byArray2[kotakbaz.rain.client.util.render.font.D.G[268] ^ kotakbaz.rain.client.util.render.font.D.G[269]] = G[270] ^ G[271];
                byArray2[kotakbaz.rain.client.util.render.font.D.G[272] ^ kotakbaz.rain.client.util.render.font.D.G[273]] = G[274] ^ G[275];
                byArray2[kotakbaz.rain.client.util.render.font.D.G[276] ^ kotakbaz.rain.client.util.render.font.D.G[277]] = G[278] ^ G[279];
                byArray2[kotakbaz.rain.client.util.render.font.D.G[280] ^ kotakbaz.rain.client.util.render.font.D.G[281]] = G[282] ^ G[283];
                byArray2[kotakbaz.rain.client.util.render.font.D.G[284] ^ kotakbaz.rain.client.util.render.font.D.G[285]] = G[286] ^ G[287];
                byArray2[kotakbaz.rain.client.util.render.font.D.G[288] ^ kotakbaz.rain.client.util.render.font.D.G[289]] = G[290] ^ G[291];
                byArray2[kotakbaz.rain.client.util.render.font.D.G[292] ^ kotakbaz.rain.client.util.render.font.D.G[293]] = G[294] ^ G[295];
                byArray2[kotakbaz.rain.client.util.render.font.D.G[296] ^ kotakbaz.rain.client.util.render.font.D.G[297]] = G[298] ^ G[299];
                byArray2[kotakbaz.rain.client.util.render.font.D.G[300] ^ kotakbaz.rain.client.util.render.font.D.G[301]] = G[302] ^ G[303];
                byArray2[kotakbaz.rain.client.util.render.font.D.G[304] ^ kotakbaz.rain.client.util.render.font.D.G[305]] = G[306] ^ G[307];
                byArray2[kotakbaz.rain.client.util.render.font.D.G[308] ^ kotakbaz.rain.client.util.render.font.D.G[309]] = G[310] ^ G[311];
                byArray2[kotakbaz.rain.client.util.render.font.D.G[312] ^ kotakbaz.rain.client.util.render.font.D.G[313]] = G[314] ^ G[315];
                byArray2[kotakbaz.rain.client.util.render.font.D.G[316] ^ kotakbaz.rain.client.util.render.font.D.G[317]] = G[318] ^ G[319];
                byArray2[kotakbaz.rain.client.util.render.font.D.G[320] ^ kotakbaz.rain.client.util.render.font.D.G[321]] = G[322] ^ G[323];
                byArray2[kotakbaz.rain.client.util.render.font.D.G[324] ^ kotakbaz.rain.client.util.render.font.D.G[325]] = G[326] ^ G[327];
                byArray2[kotakbaz.rain.client.util.render.font.D.G[328] ^ kotakbaz.rain.client.util.render.font.D.G[329]] = G[330] ^ G[331];
                byArray2[kotakbaz.rain.client.util.render.font.D.G[332] ^ kotakbaz.rain.client.util.render.font.D.G[333]] = G[334] ^ G[335];
                byArray2[kotakbaz.rain.client.util.render.font.D.G[336] ^ kotakbaz.rain.client.util.render.font.D.G[337]] = G[338] ^ G[339];
                byArray2[kotakbaz.rain.client.util.render.font.D.G[340] ^ kotakbaz.rain.client.util.render.font.D.G[341]] = G[342] ^ G[343];
                byArray2[kotakbaz.rain.client.util.render.font.D.G[344] ^ kotakbaz.rain.client.util.render.font.D.G[345]] = G[346] ^ G[347];
                byArray2[kotakbaz.rain.client.util.render.font.D.G[348] ^ kotakbaz.rain.client.util.render.font.D.G[349]] = G[350] ^ G[351];
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, G[352], byArray3, G[353], byArray.length);
                System.arraycopy(byArray2, G[354], byArray3, byArray.length, byArray2.length);
                Object object4 = kotakbaz.rain.client.util.render.font.D.A()[G[355]];
                if (object4 == null) {
                    char[] cArray = "\uc415\uc427\uc40a\uc421\uc423\uc3b7\uc3fe\uc3f0\uc3f1\uc3ed\uc40d\uc3ec\uc408\uc402\uc412\uc40d\uc428\uc3b8".toCharArray();
                    for (int i = G[356]; i < G[357]; ++i) {
                        int n2 = cArray[i];
                        n2 += G[358];
                        n2 -= G[359];
                        n2 -= G[360];
                        n2 += G[361];
                        n2 += G[362];
                        n2 ^= G[363];
                        n2 += G[364];
                        n2 -= G[365];
                        n2 -= G[366];
                        n2 += G[367];
                        n2 -= G[368];
                        cArray[i] = (char)(n2 -= G[369]);
                    }
                    object4 = kotakbaz.rain.client.util.render.font.D.A()[kotakbaz.rain.client.util.render.font.D.G[370]] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[G[371]];
                byArray4[kotakbaz.rain.client.util.render.font.D.G[372]] = G[373];
                byArray4[kotakbaz.rain.client.util.render.font.D.G[374]] = G[375];
                byArray4[kotakbaz.rain.client.util.render.font.D.G[376]] = G[377];
                byArray4[kotakbaz.rain.client.util.render.font.D.G[378]] = G[379];
                byArray4[kotakbaz.rain.client.util.render.font.D.G[380]] = G[381];
                byArray4[kotakbaz.rain.client.util.render.font.D.G[382]] = G[383];
                byArray4[kotakbaz.rain.client.util.render.font.D.G[384]] = G[385];
                byArray4[kotakbaz.rain.client.util.render.font.D.G[386]] = G[387];
                byArray4[kotakbaz.rain.client.util.render.font.D.G[388]] = G[389];
                byArray4[kotakbaz.rain.client.util.render.font.D.G[390]] = G[391];
                byArray4[kotakbaz.rain.client.util.render.font.D.G[392]] = G[393];
                byArray4[kotakbaz.rain.client.util.render.font.D.G[394]] = G[395];
                byArray4[kotakbaz.rain.client.util.render.font.D.G[396]] = G[397];
                byArray4[kotakbaz.rain.client.util.render.font.D.G[398]] = G[399];
                byArray4[6] = -42;
                byArray4[14] = -72;
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, 16, 256);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = kotakbaz.rain.client.util.render.font.D.A()[2];
                if (object5 == null) {
                    char[] cArray = "\ue845\ue851\ue853".toCharArray();
                    for (int i = 0; i < 3; ++i) {
                        int n3 = cArray[i];
                        n3 ^= 0xC800;
                        n3 ^= 0xD441;
                        n3 += 20774;
                        n3 ^= 0xFB67;
                        n3 += 15946;
                        n3 += 16109;
                        n3 += 32653;
                        n3 += 50765;
                        n3 += 53391;
                        n3 -= 29937;
                        n3 -= 19121;
                        n3 += 43381;
                        n3 += 63671;
                        n3 -= 15449;
                        n3 -= 30041;
                        n3 += 893;
                        cArray[i] = (char)(n3 += 31231);
                    }
                    object5 = kotakbaz.rain.client.util.render.font.D.A()[2] = new String(cArray);
                }
                f = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, 0, 16);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, 16, byArray6.length);
            Object object6 = kotakbaz.rain.client.util.render.font.D.A()[3];
            if (object6 == null) {
                char[] cArray = "\ue415\ue409\ue4e3\ue44f\ue413\ue4e4\ue413\ue44f\ue4de\ue57b\ue413\ue4e3\ue439\ue4de\ue435\ue412\ue412\ue4dd\ue4e0\ue407".toCharArray();
                for (int i = 0; i < 20; ++i) {
                    int n4 = cArray[i];
                    n4 ^= 0xED82;
                    n4 += 51493;
                    n4 ^= 0x7E65;
                    n4 += 57317;
                    n4 ^= 0xA07;
                    n4 += 19880;
                    n4 ^= 0x814A;
                    n4 -= 4234;
                    n4 ^= 0x2093;
                    n4 ^= 0x8713;
                    n4 ^= 0xA234;
                    n4 -= 50038;
                    n4 += 42200;
                    n4 -= 43483;
                    cArray[i] = (char)(n4 ^= 0x78DD);
                }
                object6 = kotakbaz.rain.client.util.render.font.D.A()[3] = new String(cArray);
            }
            Cipher cipher = Cipher.getInstance((String)object6);
            cipher.init(2, (Key)((SecretKey)f), new IvParameterSpec(byArray7));
            byte[] byArray9 = cipher.doFinal(byArray8);
            object2 = new String(byArray9, StandardCharsets.UTF_8);
        }
        return object2;
    }

    private static Object[] A() {
        Object[] objectArray = g;
        if (g == null) {
            g = new Object[4];
            objectArray = g;
        }
        return objectArray;
    }

    public static void b() {
        G = new int[0x2C04 ^ 0x2D94];
        kotakbaz.rain.client.util.render.font.D.G[0xA32A ^ 0xA307] = 0xA337 ^ 0xA307;
        kotakbaz.rain.client.util.render.font.D.G[0x96 ^ 0x193] = 0x6478 ^ 0x193;
        kotakbaz.rain.client.util.render.font.D.G[0x8EB9 ^ 0x8E51] = 0x64AD ^ 0x8E51;
        kotakbaz.rain.client.util.render.font.D.G[0xDB62 ^ 0xDA48] = 0xFFFF413D ^ 0xDA48;
        kotakbaz.rain.client.util.render.font.D.G[0xC9B8 ^ 0xC8CB] = 0xC8DB ^ 0xC8CB;
        kotakbaz.rain.client.util.render.font.D.G[0x8DAF ^ 0x8DF7] = 0x7BAA ^ 0x8DF7;
        kotakbaz.rain.client.util.render.font.D.G[0x7CC6 ^ 0x7CA6] = 0x7C8F ^ 0x7CA6;
        kotakbaz.rain.client.util.render.font.D.G[0xD6C6 ^ 0xD650] = 0xD652 ^ 0xD650;
        kotakbaz.rain.client.util.render.font.D.G[0x10CAB ^ 0x10C1F] = 0x1B62C ^ 0x10C1F;
        kotakbaz.rain.client.util.render.font.D.G[0xC615 ^ 0xC661] = 0xFFFF399D ^ 0xC661;
        kotakbaz.rain.client.util.render.font.D.G[0x260D ^ 0x26C1] = 0xE7A2 ^ 0x26C1;
        kotakbaz.rain.client.util.render.font.D.G[0xD7FF ^ 0xD7C8] = 0xD7EC ^ 0xD7C8;
        kotakbaz.rain.client.util.render.font.D.G[0x196C ^ 0x19AB] = 0xFFFF19F5 ^ 0x19AB;
        kotakbaz.rain.client.util.render.font.D.G[0x7A75 ^ 0x7AB3] = 0x8556 ^ 0x7AB3;
        kotakbaz.rain.client.util.render.font.D.G[0xC681 ^ 0xC6B5] = 0xC6DC ^ 0xC6B5;
        kotakbaz.rain.client.util.render.font.D.G[0x9C07 ^ 0x9C02] = 0xFFFF63F3 ^ 0x9C02;
        kotakbaz.rain.client.util.render.font.D.G[0xC59B ^ 0xC5D7] = 0xC53B ^ 0xC5D7;
        kotakbaz.rain.client.util.render.font.D.G[0x3817 ^ 0x3905] = 0xFFFF4957 ^ 0x3905;
        kotakbaz.rain.client.util.render.font.D.G[0xC3C2 ^ 0xC2C8] = 0xFFFFC75C ^ 0xC2C8;
        kotakbaz.rain.client.util.render.font.D.G[0x1A87 ^ 0x1A27] = 0xDC81 ^ 0x1A27;
        kotakbaz.rain.client.util.render.font.D.G[0xBB34 ^ 0xBB71] = 0xBB72 ^ 0xBB71;
        kotakbaz.rain.client.util.render.font.D.G[0x6AB5 ^ 0x6ADC] = 0xFFFF951B ^ 0x6ADC;
        kotakbaz.rain.client.util.render.font.D.G[0xD10A ^ 0xD143] = 0xD141 ^ 0xD143;
        kotakbaz.rain.client.util.render.font.D.G[0xF33C ^ 0xF3CF] = 0xBBDF ^ 0xF3CF;
        kotakbaz.rain.client.util.render.font.D.G[0x2F47 ^ 0x2EC3] = 0x2ECA ^ 0x2EC3;
        kotakbaz.rain.client.util.render.font.D.G[0xD070 ^ 0xD0D1] = 0xB081 ^ 0xD0D1;
        kotakbaz.rain.client.util.render.font.D.G[0x979C ^ 0x97AD] = 0x978A ^ 0x97AD;
        kotakbaz.rain.client.util.render.font.D.G[0x5586 ^ 0x54F0] = 0x54FB ^ 0x54F0;
        kotakbaz.rain.client.util.render.font.D.G[0x7D55 ^ 0x7C60] = 0xA202 ^ 0x7C60;
        kotakbaz.rain.client.util.render.font.D.G[0x795F ^ 0x796D] = 0x7932 ^ 0x796D;
        kotakbaz.rain.client.util.render.font.D.G[0x94DF ^ 0x9476] = 0x190F6 ^ 0x9476;
        kotakbaz.rain.client.util.render.font.D.G[0x6C ^ 0x62] = 0x3E ^ 0x62;
        kotakbaz.rain.client.util.render.font.D.G[0x3E0D ^ 0x3E8E] = 0x3EB5 ^ 0x3E8E;
        kotakbaz.rain.client.util.render.font.D.G[0x5BE0 ^ 0x5B97] = 0x5B1A ^ 0x5B97;
        kotakbaz.rain.client.util.render.font.D.G[0x739B ^ 0x7338] = 0x135E ^ 0x7338;
        kotakbaz.rain.client.util.render.font.D.G[0x65A9 ^ 0x65C4] = 0x65EB ^ 0x65C4;
        kotakbaz.rain.client.util.render.font.D.G[0x549 ^ 0x425] = 0x6113 ^ 0x425;
        kotakbaz.rain.client.util.render.font.D.G[0x3FBF ^ 0x3F95] = 0xFFFFC0F9 ^ 0x3F95;
        kotakbaz.rain.client.util.render.font.D.G[0x7FA5 ^ 0x7FDA] = 0x7FD6 ^ 0x7FDA;
        kotakbaz.rain.client.util.render.font.D.G[0x104A9 ^ 0x1046C] = 0x1FB88 ^ 0x1046C;
        kotakbaz.rain.client.util.render.font.D.G[0xAB8A ^ 0xAB5A] = 0xBB58 ^ 0xAB5A;
        kotakbaz.rain.client.util.render.font.D.G[0x3713 ^ 0x360F] = 0x6309 ^ 0x360F;
        kotakbaz.rain.client.util.render.font.D.G[0xF600 ^ 0xF623] = 0xFFFF09D1 ^ 0xF623;
        kotakbaz.rain.client.util.render.font.D.G[0x8DFB ^ 0x8C81] = 0x8C83 ^ 0x8C81;
        kotakbaz.rain.client.util.render.font.D.G[0xD763 ^ 0xD622] = 0x585F ^ 0xD622;
        kotakbaz.rain.client.util.render.font.D.G[0x193A ^ 0x191B] = 0x1975 ^ 0x191B;
        kotakbaz.rain.client.util.render.font.D.G[0x884B ^ 0x8873] = 0x8824 ^ 0x8873;
        kotakbaz.rain.client.util.render.font.D.G[0xAD9F ^ 0xAD78] = 0xDB18 ^ 0xAD78;
        kotakbaz.rain.client.util.render.font.D.G[0xAAD3 ^ 0xABD8] = 0x518B ^ 0xABD8;
        kotakbaz.rain.client.util.render.font.D.G[0x2669 ^ 0x26B6] = 0xCFBC ^ 0x26B6;
        kotakbaz.rain.client.util.render.font.D.G[0xFE54 ^ 0xFF1D] = 0xD6E8 ^ 0xFF1D;
        kotakbaz.rain.client.util.render.font.D.G[0x49C ^ 0x409] = 0x408 ^ 0x409;
        kotakbaz.rain.client.util.render.font.D.G[0xF3AC ^ 0xF2C7] = 0xCF2 ^ 0xF2C7;
        kotakbaz.rain.client.util.render.font.D.G[0xB192 ^ 0xB092] = 0x682F ^ 0xB092;
        kotakbaz.rain.client.util.render.font.D.G[0xEB52 ^ 0xEAD0] = 0xEAD7 ^ 0xEAD0;
        kotakbaz.rain.client.util.render.font.D.G[0xC6AA ^ 0xC628] = 0xC64F ^ 0xC628;
        kotakbaz.rain.client.util.render.font.D.G[0x3217 ^ 0x3353] = 0x81FB ^ 0x3353;
        kotakbaz.rain.client.util.render.font.D.G[0x4134 ^ 0x41D0] = 0x37AB ^ 0x41D0;
        kotakbaz.rain.client.util.render.font.D.G[0x6B87 ^ 0x6AAE] = 0xE29 ^ 0x6AAE;
        kotakbaz.rain.client.util.render.font.D.G[0xDC64 ^ 0xDC94] = 0x9487 ^ 0xDC94;
        kotakbaz.rain.client.util.render.font.D.G[0x2261 ^ 0x232C] = 0x3B7B ^ 0x232C;
        kotakbaz.rain.client.util.render.font.D.G[0xF8B6 ^ 0xF8FB] = 0x2ABB ^ 0xF8FB;
        kotakbaz.rain.client.util.render.font.D.G[0x3CB4 ^ 0x3DD3] = 0x7B03 ^ 0x3DD3;
        kotakbaz.rain.client.util.render.font.D.G[0x76C6 ^ 0x7663] = 0xD102 ^ 0x7663;
        kotakbaz.rain.client.util.render.font.D.G[0x57D0 ^ 0x5725] = 0xC609 ^ 0x5725;
        kotakbaz.rain.client.util.render.font.D.G[0x46C9 ^ 0x47DF] = 0xEDA8 ^ 0x47DF;
        kotakbaz.rain.client.util.render.font.D.G[0xB380 ^ 0xB358] = 0x3B16 ^ 0xB358;
        kotakbaz.rain.client.util.render.font.D.G[0x728E ^ 0x7383] = 0x2CF ^ 0x7383;
        kotakbaz.rain.client.util.render.font.D.G[0xF99C ^ 0xF9DE] = 0xF9E7 ^ 0xF9DE;
        kotakbaz.rain.client.util.render.font.D.G[0xA383 ^ 0xA363] = 0x79E8 ^ 0xA363;
        kotakbaz.rain.client.util.render.font.D.G[0xCAEE ^ 0xCAA9] = 0xCAA8 ^ 0xCAA9;
        kotakbaz.rain.client.util.render.font.D.G[0xD538 ^ 0xD42F] = 0x7E15 ^ 0xD42F;
        kotakbaz.rain.client.util.render.font.D.G[0xB09A ^ 0xB1F7] = 0x7DD0 ^ 0xB1F7;
        kotakbaz.rain.client.util.render.font.D.G[0x221E ^ 0x236C] = 0x236D ^ 0x236C;
        kotakbaz.rain.client.util.render.font.D.G[0xEFF8 ^ 0xEED9] = 0xC89 ^ 0xEED9;
        kotakbaz.rain.client.util.render.font.D.G[0x400 ^ 0x4FC] = 0x58CE ^ 0x4FC;
        kotakbaz.rain.client.util.render.font.D.G[0xE9AC ^ 0xE9AF] = 0xFFFF162E ^ 0xE9AF;
        kotakbaz.rain.client.util.render.font.D.G[0x163C ^ 0x171C] = 0xF542 ^ 0x171C;
        kotakbaz.rain.client.util.render.font.D.G[0x3224 ^ 0x32DE] = 0x6CF4 ^ 0x32DE;
        kotakbaz.rain.client.util.render.font.D.G[0xB6F2 ^ 0xB7CF] = 0xB518 ^ 0xB7CF;
        kotakbaz.rain.client.util.render.font.D.G[0xE1C0 ^ 0xE104] = 0x694D ^ 0xE104;
        kotakbaz.rain.client.util.render.font.D.G[0x1EAE ^ 0x1ED7] = 0x1E91 ^ 0x1ED7;
        kotakbaz.rain.client.util.render.font.D.G[0x23F0 ^ 0x231D] = 0x53E0 ^ 0x231D;
        kotakbaz.rain.client.util.render.font.D.G[0xEA22 ^ 0xEA0C] = 0xFFFF1597 ^ 0xEA0C;
        kotakbaz.rain.client.util.render.font.D.G[0xFD38 ^ 0xFDD4] = 0x8D2E ^ 0xFDD4;
        kotakbaz.rain.client.util.render.font.D.G[0x15F1 ^ 0x15C8] = 0xFFFFEA63 ^ 0x15C8;
        kotakbaz.rain.client.util.render.font.D.G[0xD1BD ^ 0xD145] = 0x8F48 ^ 0xD145;
        kotakbaz.rain.client.util.render.font.D.G[0x376E ^ 0x367F] = 0xB9FF ^ 0x367F;
        kotakbaz.rain.client.util.render.font.D.G[0x3285 ^ 0x329F] = 0x32E2 ^ 0x329F;
        kotakbaz.rain.client.util.render.font.D.G[0xB594 ^ 0xB5C6] = 0x446B ^ 0xB5C6;
        kotakbaz.rain.client.util.render.font.D.G[0x9762 ^ 0x97D5] = 0x1B77 ^ 0x97D5;
        kotakbaz.rain.client.util.render.font.D.G[0x36E5 ^ 0x37B0] = 0x1537 ^ 0x37B0;
        kotakbaz.rain.client.util.render.font.D.G[0x670 ^ 0x64B] = 0x626 ^ 0x64B;
        kotakbaz.rain.client.util.render.font.D.G[0xA344 ^ 0xA320] = 0xA31C ^ 0xA320;
        kotakbaz.rain.client.util.render.font.D.G[0x3BC ^ 0x3FF] = 0x3CB ^ 0x3FF;
        kotakbaz.rain.client.util.render.font.D.G[0x2DEF ^ 0x2D83] = 0xFFFFD260 ^ 0x2D83;
        kotakbaz.rain.client.util.render.font.D.G[0xA000 ^ 0xA178] = 0xA179 ^ 0xA178;
        kotakbaz.rain.client.util.render.font.D.G[0x7899 ^ 0x7866] = 0x2446 ^ 0x7866;
        kotakbaz.rain.client.util.render.font.D.G[0x10021 ^ 0x101AC] = 0xFFFEFE47 ^ 0x101AC;
        kotakbaz.rain.client.util.render.font.D.G[0x3638 ^ 0x375A] = 0x375A ^ 0x375A;
        kotakbaz.rain.client.util.render.font.D.G[0x5093 ^ 0x50CE] = 0x509B ^ 0x50CE;
        kotakbaz.rain.client.util.render.font.D.G[0x10404 ^ 0x1058D] = 0xFFFEFA30 ^ 0x1058D;
        kotakbaz.rain.client.util.render.font.D.G[0xA482 ^ 0xA4F2] = 0xA4EE ^ 0xA4F2;
        kotakbaz.rain.client.util.render.font.D.G[0x9665 ^ 0x96F9] = 0x7B83 ^ 0x96F9;
        kotakbaz.rain.client.util.render.font.D.G[0x7E76 ^ 0x7E95] = 0xA412 ^ 0x7E95;
        kotakbaz.rain.client.util.render.font.D.G[0x575E ^ 0x57E1] = 0xD5BD ^ 0x57E1;
        kotakbaz.rain.client.util.render.font.D.G[0x9DDF ^ 0x9DF6] = 0x9DEA ^ 0x9DF6;
        kotakbaz.rain.client.util.render.font.D.G[0x338 ^ 0x337] = 0x322 ^ 0x337;
        kotakbaz.rain.client.util.render.font.D.G[0xB642 ^ 0xB6D8] = 0xB6D8 ^ 0xB6D8;
        kotakbaz.rain.client.util.render.font.D.G[0xE505 ^ 0xE454] = 0x5634 ^ 0xE454;
        kotakbaz.rain.client.util.render.font.D.G[0x1034D ^ 0x10356] = 0xFFFEFC6B ^ 0x10356;
        kotakbaz.rain.client.util.render.font.D.G[0x19DF ^ 0x19D8] = 0xFFFFE643 ^ 0x19D8;
        kotakbaz.rain.client.util.render.font.D.G[0x2B17 ^ 0x2BAE] = 0x4A7E ^ 0x2BAE;
        kotakbaz.rain.client.util.render.font.D.G[0x4F93 ^ 0x4F9F] = 0x4F98 ^ 0x4F9F;
        kotakbaz.rain.client.util.render.font.D.G[0x5C22 ^ 0x5C85] = 0xFBD9 ^ 0x5C85;
        kotakbaz.rain.client.util.render.font.D.G[0x504F ^ 0x506A] = 0x502F ^ 0x506A;
        kotakbaz.rain.client.util.render.font.D.G[0xA14A ^ 0xA153] = 0xFFFF5E89 ^ 0xA153;
        kotakbaz.rain.client.util.render.font.D.G[0x1FF6 ^ 0x1EB3] = 0xAC16 ^ 0x1EB3;
        kotakbaz.rain.client.util.render.font.D.G[0xE2D6 ^ 0xE3B8] = 0xAE52 ^ 0xE3B8;
        kotakbaz.rain.client.util.render.font.D.G[0xADF4 ^ 0xADC8] = 0xADE3 ^ 0xADC8;
        kotakbaz.rain.client.util.render.font.D.G[0x3F7B ^ 0x3FFD] = 0x3F83 ^ 0x3FFD;
        kotakbaz.rain.client.util.render.font.D.G[0xB421 ^ 0xB4F2] = 0xFFFFB83B ^ 0xB4F2;
        kotakbaz.rain.client.util.render.font.D.G[0x7B8B ^ 0x7AFA] = 0x2BF4 ^ 0x7AFA;
        kotakbaz.rain.client.util.render.font.D.G[0xB00E ^ 0xB012] = 0xB069 ^ 0xB012;
        kotakbaz.rain.client.util.render.font.D.G[0x43EA ^ 0x43CE] = 0x43A0 ^ 0x43CE;
        kotakbaz.rain.client.util.render.font.D.G[0x45DD ^ 0x4480] = 0xBDC3 ^ 0x4480;
        kotakbaz.rain.client.util.render.font.D.G[0x5FBD ^ 0x5EE4] = 0x46AD ^ 0x5EE4;
        kotakbaz.rain.client.util.render.font.D.G[0x626F ^ 0x630C] = 0x630D ^ 0x630C;
        kotakbaz.rain.client.util.render.font.D.G[0xEF62 ^ 0xEF64] = 0xFFFF10E0 ^ 0xEF64;
        kotakbaz.rain.client.util.render.font.D.G[0x23C8 ^ 0x22DB] = 0xAD5B ^ 0x22DB;
        kotakbaz.rain.client.util.render.font.D.G[0xB0BC ^ 0xB09C] = 0xB097 ^ 0xB09C;
        kotakbaz.rain.client.util.render.font.D.G[0xF4C3 ^ 0xF487] = 0xFFFF0B34 ^ 0xF487;
        kotakbaz.rain.client.util.render.font.D.G[0x10001 ^ 0x10047] = 0x10047 ^ 0x10047;
        kotakbaz.rain.client.util.render.font.D.G[0xD501 ^ 0xD5EB] = 0x3F3A ^ 0xD5EB;
        kotakbaz.rain.client.util.render.font.D.G[0x67B6 ^ 0x674F] = 0x3946 ^ 0x674F;
        kotakbaz.rain.client.util.render.font.D.G[0xC155 ^ 0xC007] = 0xFFFF8DB5 ^ 0xC007;
        kotakbaz.rain.client.util.render.font.D.G[0x8C3F ^ 0x8C2A] = 0x8C01 ^ 0x8C2A;
        kotakbaz.rain.client.util.render.font.D.G[0x22E0 ^ 0x23D3] = 0x140 ^ 0x23D3;
        kotakbaz.rain.client.util.render.font.D.G[0x809E ^ 0x8055] = 0x411A ^ 0x8055;
        kotakbaz.rain.client.util.render.font.D.G[0x105A0 ^ 0x10552] = 0xFFFEB2B6 ^ 0x10552;
        kotakbaz.rain.client.util.render.font.D.G[0x8BF5 ^ 0x8BE7] = 0xFFFF7410 ^ 0x8BE7;
        kotakbaz.rain.client.util.render.font.D.G[0xE067 ^ 0xE0EE] = 0xE0CF ^ 0xE0EE;
        kotakbaz.rain.client.util.render.font.D.G[0xA509 ^ 0xA51F] = 0xA55F ^ 0xA51F;
        kotakbaz.rain.client.util.render.font.D.G[0xF9B ^ 0xE1C] = 0xFFFFF1BE ^ 0xE1C;
        kotakbaz.rain.client.util.render.font.D.G[0x144B ^ 0x1476] = 0xFFFFEB9A ^ 0x1476;
        kotakbaz.rain.client.util.render.font.D.G[0x2BEB ^ 0x2B0D] = 0xFFFFA28A ^ 0x2B0D;
        kotakbaz.rain.client.util.render.font.D.G[0x409B ^ 0x4096] = 0xFFFFBF35 ^ 0x4096;
        kotakbaz.rain.client.util.render.font.D.G[0xE4F1 ^ 0xE44C] = 0x6645 ^ 0xE44C;
        kotakbaz.rain.client.util.render.font.D.G[0x1815 ^ 0x1990] = 0xFFFFE641 ^ 0x1990;
        kotakbaz.rain.client.util.render.font.D.G[0xD486 ^ 0xD507] = 0xD521 ^ 0xD507;
        kotakbaz.rain.client.util.render.font.D.G[0x571E ^ 0x5646] = 0x4E1A ^ 0x5646;
        kotakbaz.rain.client.util.render.font.D.G[0x10EE5 ^ 0x10EBA] = 0x10E86 ^ 0x10EBA;
        kotakbaz.rain.client.util.render.font.D.G[0x2833 ^ 0x2964] = 0xBE3 ^ 0x2964;
        kotakbaz.rain.client.util.render.font.D.G[0x8D02 ^ 0x8C05] = 0xE9EE ^ 0x8C05;
        kotakbaz.rain.client.util.render.font.D.G[0x8649 ^ 0x86E3] = 0x18269 ^ 0x86E3;
        kotakbaz.rain.client.util.render.font.D.G[0x6B1E ^ 0x6B24] = 0xFFFF94E1 ^ 0x6B24;
        kotakbaz.rain.client.util.render.font.D.G[0x1792 ^ 0x17EF] = 0x179F ^ 0x17EF;
        kotakbaz.rain.client.util.render.font.D.G[0x1B3D ^ 0x1A13] = 0xFFFFD31B ^ 0x1A13;
        kotakbaz.rain.client.util.render.font.D.G[0xC9EB ^ 0xC937] = 0x489F ^ 0xC937;
        kotakbaz.rain.client.util.render.font.D.G[0x1C29 ^ 0x1CB2] = 0xF1D8 ^ 0x1CB2;
        kotakbaz.rain.client.util.render.font.D.G[0xF090 ^ 0xF045] = 0x7809 ^ 0xF045;
        kotakbaz.rain.client.util.render.font.D.G[0xDA7F ^ 0xDA77] = 0xFFFF259D ^ 0xDA77;
        kotakbaz.rain.client.util.render.font.D.G[0x108F ^ 0x1072] = 0x4C52 ^ 0x1072;
        kotakbaz.rain.client.util.render.font.D.G[0xCABE ^ 0xCA49] = 0x5B65 ^ 0xCA49;
        kotakbaz.rain.client.util.render.font.D.G[0x25CB ^ 0x25A1] = 0x25BD ^ 0x25A1;
        kotakbaz.rain.client.util.render.font.D.G[0x1BE1 ^ 0x1B45] = 0x7B1D ^ 0x1B45;
        kotakbaz.rain.client.util.render.font.D.G[0x5A9C ^ 0x5A1D] = 0x5A4C ^ 0x5A1D;
        kotakbaz.rain.client.util.render.font.D.G[0x71F5 ^ 0x71BD] = 0x71BD ^ 0x71BD;
        kotakbaz.rain.client.util.render.font.D.G[0xEA46 ^ 0xEAFE] = 0x6619 ^ 0xEAFE;
        kotakbaz.rain.client.util.render.font.D.G[0xB8BE ^ 0xB9B2] = 0xC8E6 ^ 0xB9B2;
        kotakbaz.rain.client.util.render.font.D.G[0x5694 ^ 0x571B] = 0xFFFFA8E1 ^ 0x571B;
        kotakbaz.rain.client.util.render.font.D.G[0x9EFB ^ 0x9E74] = 0xFFFF61D6 ^ 0x9E74;
        kotakbaz.rain.client.util.render.font.D.G[0x5EDD ^ 0x5E88] = 0x8D7F ^ 0x5E88;
        kotakbaz.rain.client.util.render.font.D.G[0xE4E3 ^ 0xE499] = 0xE459 ^ 0xE499;
        kotakbaz.rain.client.util.render.font.D.G[0xB216 ^ 0xB202] = 0xFFFF4D97 ^ 0xB202;
        kotakbaz.rain.client.util.render.font.D.G[0xB4D3 ^ 0xB489] = 0x79D7 ^ 0xB489;
        kotakbaz.rain.client.util.render.font.D.G[0x9F13 ^ 0x9F81] = 0xFFFF604D ^ 0x9F81;
        kotakbaz.rain.client.util.render.font.D.G[0x3262 ^ 0x3321] = 0xBD5C ^ 0x3321;
        kotakbaz.rain.client.util.render.font.D.G[0x3319 ^ 0x3260] = 0x3239 ^ 0x3260;
        kotakbaz.rain.client.util.render.font.D.G[0x960B ^ 0x96D1] = 0x1779 ^ 0x96D1;
        kotakbaz.rain.client.util.render.font.D.G[0x103B2 ^ 0x10339] = 0x1035F ^ 0x10339;
        kotakbaz.rain.client.util.render.font.D.G[0xFA55 ^ 0xFA9D] = 0x578 ^ 0xFA9D;
        kotakbaz.rain.client.util.render.font.D.G[0xB628 ^ 0xB60F] = 0xFFFF49E5 ^ 0xB60F;
        kotakbaz.rain.client.util.render.font.D.G[0xC069 ^ 0xC1E1] = 0xC1E5 ^ 0xC1E1;
        kotakbaz.rain.client.util.render.font.D.G[0x158 ^ 0x1EA] = 0xBBD9 ^ 0x1EA;
        kotakbaz.rain.client.util.render.font.D.G[0x60FA ^ 0x600B] = 0x281B ^ 0x600B;
        kotakbaz.rain.client.util.render.font.D.G[Short.MAX_VALUE ^ 0x7F4E] = 0xC57B ^ 0x7F4E;
        kotakbaz.rain.client.util.render.font.D.G[0xC5B3 ^ 0xC503] = 0x1C207 ^ 0xC503;
        kotakbaz.rain.client.util.render.font.D.G[0x5AF9 ^ 0x5A36] = 0xFFFFB597 ^ 0x5A36;
        kotakbaz.rain.client.util.render.font.D.G[0x10ECA ^ 0x10EFA] = 0x10EC2 ^ 0x10EFA;
        kotakbaz.rain.client.util.render.font.D.G[0x1A7 ^ 0x175] = 0xF236 ^ 0x175;
        kotakbaz.rain.client.util.render.font.D.G[0xD2BF ^ 0xD3EB] = 0xF173 ^ 0xD3EB;
        kotakbaz.rain.client.util.render.font.D.G[0x5539 ^ 0x558C] = 0xD96E ^ 0x558C;
        kotakbaz.rain.client.util.render.font.D.G[0x28E9 ^ 0x284F] = 0x8F2A ^ 0x284F;
        kotakbaz.rain.client.util.render.font.D.G[0xBFE2 ^ 0xBED5] = 0x60B7 ^ 0xBED5;
        kotakbaz.rain.client.util.render.font.D.G[0x4C6A ^ 0x4CEE] = 0x4CE5 ^ 0x4CEE;
        kotakbaz.rain.client.util.render.font.D.G[0x5A73 ^ 0x5A0B] = 0xFFFFA5D2 ^ 0x5A0B;
        kotakbaz.rain.client.util.render.font.D.G[0x57E0 ^ 0x576E] = 0x5730 ^ 0x576E;
        kotakbaz.rain.client.util.render.font.D.G[0x5434 ^ 0x54B9] = 0x54BC ^ 0x54B9;
        kotakbaz.rain.client.util.render.font.D.G[0x3988 ^ 0x38E2] = 0x58B7 ^ 0x38E2;
        kotakbaz.rain.client.util.render.font.D.G[0x950E ^ 0x957B] = 0x952A ^ 0x957B;
        kotakbaz.rain.client.util.render.font.D.G[0x2876 ^ 0x2882] = 0xB9AC ^ 0x2882;
        kotakbaz.rain.client.util.render.font.D.G[0xEBF1 ^ 0xEA8A] = 0xFFFF1506 ^ 0xEA8A;
        kotakbaz.rain.client.util.render.font.D.G[0xC786 ^ 0xC7E5] = 0xC795 ^ 0xC7E5;
        kotakbaz.rain.client.util.render.font.D.G[0xDFEF ^ 0xDF80] = 0xDFA3 ^ 0xDF80;
        kotakbaz.rain.client.util.render.font.D.G[0x3356 ^ 0x330A] = 0xFFFFCCAB ^ 0x330A;
        kotakbaz.rain.client.util.render.font.D.G[0x47FE ^ 0x46D6] = 0x225B ^ 0x46D6;
        kotakbaz.rain.client.util.render.font.D.G[0x14EB ^ 0x14C4] = 0xFFFFEB02 ^ 0x14C4;
        kotakbaz.rain.client.util.render.font.D.G[0xC65A ^ 0xC74E] = 0x6D75 ^ 0xC74E;
        kotakbaz.rain.client.util.render.font.D.G[0xC782 ^ 0xC6EB] = 0xEEBF ^ 0xC6EB;
        kotakbaz.rain.client.util.render.font.D.G[0xA734 ^ 0xA751] = 0xA71D ^ 0xA751;
        kotakbaz.rain.client.util.render.font.D.G[0xA6A9 ^ 0xA62C] = 0xFFFF59DC ^ 0xA62C;
        kotakbaz.rain.client.util.render.font.D.G[0x9770 ^ 0x97CA] = 0xF611 ^ 0x97CA;
        kotakbaz.rain.client.util.render.font.D.G[0x4AC9 ^ 0x4A9E] = 0x3FE4 ^ 0x4A9E;
        kotakbaz.rain.client.util.render.font.D.G[0xA286 ^ 0xA2E4] = 0xFFFF5D08 ^ 0xA2E4;
        kotakbaz.rain.client.util.render.font.D.G[0xF72 ^ 0xE32] = 0x8046 ^ 0xE32;
        kotakbaz.rain.client.util.render.font.D.G[0x776E ^ 0x7712] = 0x7762 ^ 0x7712;
        kotakbaz.rain.client.util.render.font.D.G[0xF4BE ^ 0xF436] = 0xFFFF0BD8 ^ 0xF436;
        kotakbaz.rain.client.util.render.font.D.G[0x68A0 ^ 0x69FE] = 0x90D8 ^ 0x69FE;
        kotakbaz.rain.client.util.render.font.D.G[0xB364 ^ 0xB254] = 0x90DE ^ 0xB254;
        kotakbaz.rain.client.util.render.font.D.G[0x6E77 ^ 0x6F58] = 0x59FA ^ 0x6F58;
        kotakbaz.rain.client.util.render.font.D.G[0x8270 ^ 0x8379] = 0x792A ^ 0x8379;
        kotakbaz.rain.client.util.render.font.D.G[0x9BE8 ^ 0x9B5E] = 0x17B9 ^ 0x9B5E;
        kotakbaz.rain.client.util.render.font.D.G[0x390C ^ 0x3977] = 0x3917 ^ 0x3977;
        kotakbaz.rain.client.util.render.font.D.G[0xB778 ^ 0xB769] = 0xFFFF48CA ^ 0xB769;
        kotakbaz.rain.client.util.render.font.D.G[0x3768 ^ 0x373E] = 0x9BA9 ^ 0x373E;
        kotakbaz.rain.client.util.render.font.D.G[0x7D23 ^ 0x7C73] = 0xCE09 ^ 0x7C73;
        kotakbaz.rain.client.util.render.font.D.G[0xD794 ^ 0xD6B6] = 0x3491 ^ 0xD6B6;
        kotakbaz.rain.client.util.render.font.D.G[0x64D4 ^ 0x65E8] = 0x672E ^ 0x65E8;
        kotakbaz.rain.client.util.render.font.D.G[0xD48C ^ 0xD4CD] = 0xD4C5 ^ 0xD4CD;
        kotakbaz.rain.client.util.render.font.D.G[0xFE8C ^ 0xFE77] = 0xA07E ^ 0xFE77;
        kotakbaz.rain.client.util.render.font.D.G[0xD366 ^ 0xD259] = 0xD08E ^ 0xD259;
        kotakbaz.rain.client.util.render.font.D.G[0x8D27 ^ 0x8D3A] = 0xFFFF7289 ^ 0x8D3A;
        kotakbaz.rain.client.util.render.font.D.G[0x866B ^ 0x86F4] = 0xFFFFBFE3 ^ 0x86F4;
        kotakbaz.rain.client.util.render.font.D.G[0x1CAF ^ 0x1D91] = 0xFFFFE0DA ^ 0x1D91;
        kotakbaz.rain.client.util.render.font.D.G[0x10106 ^ 0x101B8] = 0x183BE ^ 0x101B8;
        kotakbaz.rain.client.util.render.font.D.G[0x195F ^ 0x19CB] = 0xFFFFE61F ^ 0x19CB;
        kotakbaz.rain.client.util.render.font.D.G[0xEF84 ^ 0xEF52] = 0x671C ^ 0xEF52;
        kotakbaz.rain.client.util.render.font.D.G[0xDB1 ^ 0xD97] = 0xDBA ^ 0xD97;
        kotakbaz.rain.client.util.render.font.D.G[0xF516 ^ 0xF461] = 0xFFFF0B98 ^ 0xF461;
        kotakbaz.rain.client.util.render.font.D.G[0x969F ^ 0x97FA] = 0x97E8 ^ 0x97FA;
        kotakbaz.rain.client.util.render.font.D.G[0x7A3F ^ 0x7B3B] = 0x1ED5 ^ 0x7B3B;
        kotakbaz.rain.client.util.render.font.D.G[0x62F0 ^ 0x6277] = 0x6207 ^ 0x6277;
        kotakbaz.rain.client.util.render.font.D.G[0x8A44 ^ 0x8A6F] = 0xFFFF75C5 ^ 0x8A6F;
        kotakbaz.rain.client.util.render.font.D.G[0x89C2 ^ 0x8891] = 0x3AF1 ^ 0x8891;
        kotakbaz.rain.client.util.render.font.D.G[0x10CEB ^ 0x10DDF] = 0x1D3BB ^ 0x10DDF;
        kotakbaz.rain.client.util.render.font.D.G[0x8C90 ^ 0x8CE2] = 0xFFFF737A ^ 0x8CE2;
        kotakbaz.rain.client.util.render.font.D.G[0x5365 ^ 0x5303] = 0xFFFFACC0 ^ 0x5303;
        kotakbaz.rain.client.util.render.font.D.G[0x6305 ^ 0x6228] = 0x548A ^ 0x6228;
        kotakbaz.rain.client.util.render.font.D.G[0x9064 ^ 0x913E] = 0x890A ^ 0x913E;
        kotakbaz.rain.client.util.render.font.D.G[0xD7E0 ^ 0xD73E] = 0x3E14 ^ 0xD73E;
        kotakbaz.rain.client.util.render.font.D.G[0xAB8E ^ 0xAB96] = 0xAB3B ^ 0xAB96;
        kotakbaz.rain.client.util.render.font.D.G[0xF636 ^ 0xF74B] = 0xFFFF08C8 ^ 0xF74B;
        kotakbaz.rain.client.util.render.font.D.G[0x9550 ^ 0x9584] = 0x66C7 ^ 0x9584;
        kotakbaz.rain.client.util.render.font.D.G[0x10CED ^ 0x10C9B] = 0xFFFEF316 ^ 0x10C9B;
        kotakbaz.rain.client.util.render.font.D.G[0x3638 ^ 0x36AB] = 0x3683 ^ 0x36AB;
        kotakbaz.rain.client.util.render.font.D.G[0x6FC7 ^ 0x6EEC] = 0xA6B ^ 0x6EEC;
        kotakbaz.rain.client.util.render.font.D.G[0x73C9 ^ 0x72AD] = 0x72AD ^ 0x72AD;
        kotakbaz.rain.client.util.render.font.D.G[0xF3E3 ^ 0xF2CF] = 0xC473 ^ 0xF2CF;
        kotakbaz.rain.client.util.render.font.D.G[0x3C6E ^ 0x3CB9] = 0xFFFF4B39 ^ 0x3CB9;
        kotakbaz.rain.client.util.render.font.D.G[0x2C49 ^ 0x2D03] = 0x4FB ^ 0x2D03;
        kotakbaz.rain.client.util.render.font.D.G[0xAEED ^ 0xAE83] = 0xFFFF5145 ^ 0xAE83;
        kotakbaz.rain.client.util.render.font.D.G[0x3846 ^ 0x38A8] = 0x4864 ^ 0x38A8;
        kotakbaz.rain.client.util.render.font.D.G[0x6C05 ^ 0x6C98] = 0xAA37 ^ 0x6C98;
        kotakbaz.rain.client.util.render.font.D.G[0x7613 ^ 0x775C] = 0x6F0B ^ 0x775C;
        kotakbaz.rain.client.util.render.font.D.G[0x72F0 ^ 0x739F] = 0xFFA4 ^ 0x739F;
        kotakbaz.rain.client.util.render.font.D.G[0x568F ^ 0x5645] = 0x9726 ^ 0x5645;
        kotakbaz.rain.client.util.render.font.D.G[0x2C19 ^ 0x2C57] = 0x4F37 ^ 0x2C57;
        kotakbaz.rain.client.util.render.font.D.G[0x10991 ^ 0x10908] = 0x10909 ^ 0x10908;
        kotakbaz.rain.client.util.render.font.D.G[0xE07F ^ 0xE07B] = 0xE00E ^ 0xE07B;
        kotakbaz.rain.client.util.render.font.D.G[0xD1A0 ^ 0xD091] = 0xF202 ^ 0xD091;
        kotakbaz.rain.client.util.render.font.D.G[0xE1BE ^ 0xE030] = 0xE038 ^ 0xE030;
        kotakbaz.rain.client.util.render.font.D.G[0xB419 ^ 0xB50C] = 0x1F36 ^ 0xB50C;
        kotakbaz.rain.client.util.render.font.D.G[0x2BFF ^ 0x2B3D] = 0xA374 ^ 0x2B3D;
        kotakbaz.rain.client.util.render.font.D.G[0x4EB5 ^ 0x4E06] = 0xF426 ^ 0x4E06;
        kotakbaz.rain.client.util.render.font.D.G[0x83A3 ^ 0x83E3] = 0x8385 ^ 0x83E3;
        kotakbaz.rain.client.util.render.font.D.G[0x98CA ^ 0x99EC] = 0xB439 ^ 0x99EC;
        kotakbaz.rain.client.util.render.font.D.G[0xC841 ^ 0xC8B7] = 0x598F ^ 0xC8B7;
        kotakbaz.rain.client.util.render.font.D.G[0x107F4 ^ 0x1067E] = 0x10671 ^ 0x1067E;
        kotakbaz.rain.client.util.render.font.D.G[0x902D ^ 0x9163] = 0xFFFF7698 ^ 0x9163;
        kotakbaz.rain.client.util.render.font.D.G[0xE73B ^ 0xE601] = 0x2E11 ^ 0xE601;
        kotakbaz.rain.client.util.render.font.D.G[0x48F6 ^ 0x49A0] = 0xFFFF94F2 ^ 0x49A0;
        kotakbaz.rain.client.util.render.font.D.G[0x78DF ^ 0x787D] = 0x1825 ^ 0x787D;
        kotakbaz.rain.client.util.render.font.D.G[0x7797 ^ 0x76DF] = 0x5F3C ^ 0x76DF;
        kotakbaz.rain.client.util.render.font.D.G[0xE645 ^ 0xE616] = 0x6FC4 ^ 0xE616;
        kotakbaz.rain.client.util.render.font.D.G[0x2FC2 ^ 0x2F1F] = 0x2F1F ^ 0x2F1F;
        kotakbaz.rain.client.util.render.font.D.G[0xFD2B ^ 0xFDA1] = 0xFFFF023A ^ 0xFDA1;
        kotakbaz.rain.client.util.render.font.D.G[0x9884 ^ 0x986F] = 0x728F ^ 0x986F;
        kotakbaz.rain.client.util.render.font.D.G[0xC16D ^ 0xC106] = 0xC108 ^ 0xC106;
        kotakbaz.rain.client.util.render.font.D.G[0x10514 ^ 0x105B8] = 0x132 ^ 0x105B8;
        kotakbaz.rain.client.util.render.font.D.G[0x5E63 ^ 0x5F3C] = 0xA67F ^ 0x5F3C;
        kotakbaz.rain.client.util.render.font.D.G[0x49A1 ^ 0x4970] = 0xBA34 ^ 0x4970;
        kotakbaz.rain.client.util.render.font.D.G[0x1104 ^ 0x1070] = 0x1073 ^ 0x1070;
        kotakbaz.rain.client.util.render.font.D.G[0x42F3 ^ 0x4386] = 0xFFFFBC26 ^ 0x4386;
        kotakbaz.rain.client.util.render.font.D.G[0xFAD ^ 0xFAC] = 0xFFFFF011 ^ 0xFAC;
        kotakbaz.rain.client.util.render.font.D.G[0x55D4 ^ 0x55FC] = 0x55F4 ^ 0x55FC;
        kotakbaz.rain.client.util.render.font.D.G[0x9BD3 ^ 0x9AD5] = 0xFF56 ^ 0x9AD5;
        kotakbaz.rain.client.util.render.font.D.G[0xBF9A ^ 0xBF26] = 0xDEFD ^ 0xBF26;
        kotakbaz.rain.client.util.render.font.D.G[0x1797 ^ 0x1611] = 0x161D ^ 0x1611;
        kotakbaz.rain.client.util.render.font.D.G[0x8BFC ^ 0x8B9D] = 0xFFFF746E ^ 0x8B9D;
        kotakbaz.rain.client.util.render.font.D.G[0xE81C ^ 0xE940] = 0x1010 ^ 0xE940;
        kotakbaz.rain.client.util.render.font.D.G[0xD4FB ^ 0xD4A0] = 0xD4A0 ^ 0xD4A0;
        kotakbaz.rain.client.util.render.font.D.G[0x418D ^ 0x40F2] = 0x40AF ^ 0x40F2;
        kotakbaz.rain.client.util.render.font.D.G[0xB3AA ^ 0xB39F] = 0xFFFF4C4E ^ 0xB39F;
        kotakbaz.rain.client.util.render.font.D.G[0x8A49 ^ 0x8A77] = 0x8A4C ^ 0x8A77;
        kotakbaz.rain.client.util.render.font.D.G[0x2D09 ^ 0x2D0B] = 0x2D7E ^ 0x2D0B;
        kotakbaz.rain.client.util.render.font.D.G[0x3F06 ^ 0x3F91] = 0x3F91 ^ 0x3F91;
        kotakbaz.rain.client.util.render.font.D.G[0x3262 ^ 0x331C] = 0x331C ^ 0x331C;
        kotakbaz.rain.client.util.render.font.D.G[0x408 ^ 0x490] = 0x491 ^ 0x490;
        kotakbaz.rain.client.util.render.font.D.G[0x4D28 ^ 0x4DA8] = 0x4D9E ^ 0x4DA8;
        kotakbaz.rain.client.util.render.font.D.G[0x2A95 ^ 0x2B85] = 0xA411 ^ 0x2B85;
        kotakbaz.rain.client.util.render.font.D.G[0x11D6 ^ 0x11E9] = 0x1184 ^ 0x11E9;
        kotakbaz.rain.client.util.render.font.D.G[0x7B6B ^ 0x7BA2] = 0xBACF ^ 0x7BA2;
        kotakbaz.rain.client.util.render.font.D.G[0x8C92 ^ 0x8DD0] = 0xFFFFFC29 ^ 0x8DD0;
        kotakbaz.rain.client.util.render.font.D.G[0xBA5A ^ 0xBA6C] = 0xBA1D ^ 0xBA6C;
        kotakbaz.rain.client.util.render.font.D.G[0x5301 ^ 0x53E3] = 0xFFFF76A9 ^ 0x53E3;
        kotakbaz.rain.client.util.render.font.D.G[0x3D1C ^ 0x3C74] = 0xDA16 ^ 0x3C74;
        kotakbaz.rain.client.util.render.font.D.G[0x4DC0 ^ 0x4DD7] = 0x4DCD ^ 0x4DD7;
        kotakbaz.rain.client.util.render.font.D.G[0x9595 ^ 0x9496] = 0x4C24 ^ 0x9496;
        kotakbaz.rain.client.util.render.font.D.G[0x84B ^ 0x937] = 0x93D ^ 0x937;
        kotakbaz.rain.client.util.render.font.D.G[0x104D5 ^ 0x104C5] = 0x104B4 ^ 0x104C5;
        kotakbaz.rain.client.util.render.font.D.G[0x37CC ^ 0x379C] = 0x7F39 ^ 0x379C;
        kotakbaz.rain.client.util.render.font.D.G[0x3DE7 ^ 0x3D08] = 0x4DF5 ^ 0x3D08;
        kotakbaz.rain.client.util.render.font.D.G[0xA9AD ^ 0xA895] = 0x60BD ^ 0xA895;
        kotakbaz.rain.client.util.render.font.D.G[0x61FB ^ 0x61B4] = 0xDBD6 ^ 0x61B4;
        kotakbaz.rain.client.util.render.font.D.G[0x1060D ^ 0x10646] = 0x10646 ^ 0x10646;
        kotakbaz.rain.client.util.render.font.D.G[0x39E7 ^ 0x39D4] = 0xFFFFC66F ^ 0x39D4;
        kotakbaz.rain.client.util.render.font.D.G[0x104B7 ^ 0x104BC] = 0x10480 ^ 0x104BC;
        kotakbaz.rain.client.util.render.font.D.G[0x4327 ^ 0x4339] = 0xFFFFBCF6 ^ 0x4339;
        kotakbaz.rain.client.util.render.font.D.G[0x406E ^ 0x410E] = 0x410E ^ 0x410E;
        kotakbaz.rain.client.util.render.font.D.G[0xEB15 ^ 0xEA52] = 0x58F7 ^ 0xEA52;
        kotakbaz.rain.client.util.render.font.D.G[0x9E61 ^ 0x9E6B] = 0x9E10 ^ 0x9E6B;
        kotakbaz.rain.client.util.render.font.D.G[0x63F9 ^ 0x63E6] = 0xFFFF9C28 ^ 0x63E6;
        kotakbaz.rain.client.util.render.font.D.G[0x8351 ^ 0x8253] = 0xFFFFA56E ^ 0x8253;
        kotakbaz.rain.client.util.render.font.D.G[0x5AF6 ^ 0x5BF7] = 0x8345 ^ 0x5BF7;
        kotakbaz.rain.client.util.render.font.D.G[0x3A80 ^ 0x3BA7] = 0x1620 ^ 0x3BA7;
        kotakbaz.rain.client.util.render.font.D.G[0x7A44 ^ 0x7B0F] = 0x52FA ^ 0x7B0F;
        kotakbaz.rain.client.util.render.font.D.G[0xD96C ^ 0xD9A1] = 0xC9A0 ^ 0xD9A1;
        kotakbaz.rain.client.util.render.font.D.G[0x10C9B ^ 0x10CB9] = 0x10CC1 ^ 0x10CB9;
        kotakbaz.rain.client.util.render.font.D.G[0xE515 ^ 0xE40B] = 0xFFFF4EE6 ^ 0xE40B;
        kotakbaz.rain.client.util.render.font.D.G[0x2577 ^ 0x2452] = 0x9D5 ^ 0x2452;
        kotakbaz.rain.client.util.render.font.D.G[0xC61B ^ 0xC61B] = 0xFFFF3924 ^ 0xC61B;
        kotakbaz.rain.client.util.render.font.D.G[0x22C2 ^ 0x2227] = 0x5447 ^ 0x2227;
        kotakbaz.rain.client.util.render.font.D.G[0x4BB8 ^ 0x4AA1] = 0x8149 ^ 0x4AA1;
        kotakbaz.rain.client.util.render.font.D.G[0x8C3A ^ 0x8D76] = 0x9531 ^ 0x8D76;
        kotakbaz.rain.client.util.render.font.D.G[0x50D3 ^ 0x5068] = 0x31CE ^ 0x5068;
        kotakbaz.rain.client.util.render.font.D.G[0x685F ^ 0x680E] = 0xE2C2 ^ 0x680E;
        kotakbaz.rain.client.util.render.font.D.G[0x19DC ^ 0x19F0] = 0xFFFFE632 ^ 0x19F0;
        kotakbaz.rain.client.util.render.font.D.G[0x77EB ^ 0x7783] = 0x77F6 ^ 0x7783;
        kotakbaz.rain.client.util.render.font.D.G[0x29BB ^ 0x2975] = 0x3977 ^ 0x2975;
        kotakbaz.rain.client.util.render.font.D.G[0x926D ^ 0x921E] = 0x9257 ^ 0x921E;
        kotakbaz.rain.client.util.render.font.D.G[0xAF67 ^ 0xAF3E] = 0xA480 ^ 0xAF3E;
        kotakbaz.rain.client.util.render.font.D.G[0x1288 ^ 0x12D6] = 0xFFFFED00 ^ 0x12D6;
        kotakbaz.rain.client.util.render.font.D.G[0xF2FA ^ 0xF257] = 0x1F553 ^ 0xF257;
        kotakbaz.rain.client.util.render.font.D.G[0x5523 ^ 0x55B3] = 0xFFFFAA09 ^ 0x55B3;
        kotakbaz.rain.client.util.render.font.D.G[0x4137 ^ 0x4014] = 0xA244 ^ 0x4014;
        kotakbaz.rain.client.util.render.font.D.G[0x35D8 ^ 0x34E3] = 0xFCDC ^ 0x34E3;
        kotakbaz.rain.client.util.render.font.D.G[0xDC26 ^ 0xDCAA] = 0xDCD1 ^ 0xDCAA;
        kotakbaz.rain.client.util.render.font.D.G[0x1A0D ^ 0x1B86] = 0xFFFFE41E ^ 0x1B86;
        kotakbaz.rain.client.util.render.font.D.G[0x9680 ^ 0x9641] = 0x1E05 ^ 0x9641;
        kotakbaz.rain.client.util.render.font.D.G[0x8C86 ^ 0x8D99] = 0xD897 ^ 0x8D99;
        kotakbaz.rain.client.util.render.font.D.G[0xF51B ^ 0xF565] = 0xFFFF0AD9 ^ 0xF565;
        kotakbaz.rain.client.util.render.font.D.G[0x974F ^ 0x96CC] = 0xFFFF6919 ^ 0x96CC;
        kotakbaz.rain.client.util.render.font.D.G[0x10AB6 ^ 0x10BF0] = 0xFFFE46CB ^ 0x10BF0;
        kotakbaz.rain.client.util.render.font.D.G[0x31DF ^ 0x3136] = 0xDBD6 ^ 0x3136;
        kotakbaz.rain.client.util.render.font.D.G[0x10209 ^ 0x10368] = 0x10368 ^ 0x10368;
        kotakbaz.rain.client.util.render.font.D.G[0x9B13 ^ 0x9A21] = 0xB8E5 ^ 0x9A21;
        kotakbaz.rain.client.util.render.font.D.G[0xA7A2 ^ 0xA6B8] = 0x6D6F ^ 0xA6B8;
        kotakbaz.rain.client.util.render.font.D.G[0x573 ^ 0x539] = 0x539 ^ 0x539;
        kotakbaz.rain.client.util.render.font.D.G[0xE30 ^ 0xF28] = 0xC4DD ^ 0xF28;
        kotakbaz.rain.client.util.render.font.D.G[0x95D5 ^ 0x9515] = 0x1713 ^ 0x9515;
        kotakbaz.rain.client.util.render.font.D.G[0x10438 ^ 0x10493] = 0x7E ^ 0x10493;
        kotakbaz.rain.client.util.render.font.D.G[0xEB5B ^ 0xEA7F] = 0xC7F8 ^ 0xEA7F;
        kotakbaz.rain.client.util.render.font.D.G[0x24BD ^ 0x2531] = 0x2534 ^ 0x2531;
        kotakbaz.rain.client.util.render.font.D.G[0xB1F0 ^ 0xB0C6] = 0xFFFF913F ^ 0xB0C6;
        kotakbaz.rain.client.util.render.font.D.G[0x81E ^ 0x945] = 0x110C ^ 0x945;
        kotakbaz.rain.client.util.render.font.D.G[0x8FD7 ^ 0x8F29] = 0xD339 ^ 0x8F29;
        kotakbaz.rain.client.util.render.font.D.G[0xBA75 ^ 0xBB05] = 0xFB5E ^ 0xBB05;
        kotakbaz.rain.client.util.render.font.D.G[0xD527 ^ 0xD573] = 0xE485 ^ 0xD573;
        kotakbaz.rain.client.util.render.font.D.G[0xEEE5 ^ 0xEE26] = 0x6659 ^ 0xEE26;
        kotakbaz.rain.client.util.render.font.D.G[0xD72D ^ 0xD623] = 0xFFFF58B6 ^ 0xD623;
        kotakbaz.rain.client.util.render.font.D.G[0x4DFB ^ 0x4D8A] = 0x4D8B ^ 0x4D8A;
        kotakbaz.rain.client.util.render.font.D.G[0xE26B ^ 0xE376] = 0xB678 ^ 0xE376;
        kotakbaz.rain.client.util.render.font.D.G[0xC811 ^ 0xC8F0] = 0x1277 ^ 0xC8F0;
        kotakbaz.rain.client.util.render.font.D.G[0xF2DD ^ 0xF204] = 0x73A0 ^ 0xF204;
        kotakbaz.rain.client.util.render.font.D.G[0x10639 ^ 0x106E2] = 0x18757 ^ 0x106E2;
        kotakbaz.rain.client.util.render.font.D.G[0x616B ^ 0x6064] = 0x1128 ^ 0x6064;
        kotakbaz.rain.client.util.render.font.D.G[0x486 ^ 0x59D] = 0xCE75 ^ 0x59D;
        kotakbaz.rain.client.util.render.font.D.G[0x705F ^ 0x70F0] = 0x177B3 ^ 0x70F0;
        kotakbaz.rain.client.util.render.font.D.G[0xE2F ^ 0xEB1] = 0xC817 ^ 0xEB1;
        kotakbaz.rain.client.util.render.font.D.G[0xA390 ^ 0xA338] = 0x45D ^ 0xA338;
        kotakbaz.rain.client.util.render.font.D.G[0x4409 ^ 0x441A] = 0x446C ^ 0x441A;
        kotakbaz.rain.client.util.render.font.D.G[0xF414 ^ 0xF572] = 0xD192 ^ 0xF572;
        kotakbaz.rain.client.util.render.font.D.G[0x8028 ^ 0x81A8] = 0x81A5 ^ 0x81A8;
        kotakbaz.rain.client.util.render.font.D.G[0x91E0 ^ 0x91E9] = 0x9151 ^ 0x91E9;
        kotakbaz.rain.client.util.render.font.D.G[0xB71 ^ 0xA48] = 0xC277 ^ 0xA48;
        kotakbaz.rain.client.util.render.font.D.G[0x6E38 ^ 0x6EA9] = 0x6E91 ^ 0x6EA9;
        kotakbaz.rain.client.util.render.font.D.G[0xA65F ^ 0xA757] = 0x5D0F ^ 0xA757;
        kotakbaz.rain.client.util.render.font.D.G[0xEA1F ^ 0xEA78] = 0xFFFF158A ^ 0xEA78;
        kotakbaz.rain.client.util.render.font.D.G[0x620E ^ 0x62A0] = 0x165A4 ^ 0x62A0;
    }
}

