/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.util.render;

import java.io.Closeable;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import kotakbaz.rain.client.extensions.A;
import kotakbaz.rain.client.render.texture.B;
import kotakbaz.rain.client.render.texture.loader.C;
import kotakbaz.rain.client.render.texture.texture.a;
import kotakbaz.rain.client.render.texture.texture.a_0;
import kotakbaz.rain.client.render.texture.texture.b_0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004\u00a2\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0007\u00a2\u0006\u0004\b\n\u0010\u0003J\u001f\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u000b\u0010\tJ\u0017\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\r\u0010\u000eR \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0015"}, d2={"Lkotakbaz/rain/client/util/render/TextureLoader;", "", "<init>", "()V", "", "name", "path", "", "register", "(Ljava/lang/String;Ljava/lang/String;)V", "load", "loadSingle", "Lkotakbaz/rain/client/render/texture/texture/GLTexture;", "get", "(Ljava/lang/String;)Lkotakbaz/rain/client/render/texture/texture/GLTexture;", "", "loadQueue", "Ljava/util/Map;", "", "bootstrapped", "Z", "rain-visuals"})
@SourceDebugExtension(value={"SMAP\nTextureLoader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextureLoader.kt\nkotakbaz/rain/client/util/render/TextureLoader\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,75:1\n221#2,2:76\n*S KotlinDebug\n*F\n+ 1 TextureLoader.kt\nkotakbaz/rain/client/util/render/TextureLoader\n*L\n31#1:76,2\n*E\n"})
public final class TextureLoader {
    @NotNull
    public static final TextureLoader INSTANCE;
    @NotNull
    private static final Map<String, String> a;
    private static boolean A;
    private static Object[] b;
    private static Object c;
    private static Object[] C;
    private static Object[] B;
    private static Object[] d;
    public static int[] D;

    private TextureLoader() {
    }

    public final void register(@NotNull String name, @NotNull String path) {
        int n2 = D[0];
        n2 -= D[1];
        Intrinsics.checkNotNullParameter(name, (String)b[n2 += D[2]]);
        int n3 = D[3];
        n3 ^= D[4];
        Intrinsics.checkNotNullParameter(path, (String)b[n3 += D[5]]);
        if (A) {
            this.loadSingle(name, path);
        } else {
            a.put(name, path);
        }
    }

    public final void load() {
        long l2 = 5012918596953941360L;
        if (A) {
            return;
        }
        int n2 = D[6];
        n2 ^= D[7];
        int n3 = D[9];
        n3 -= D[10];
        System.out.println((Object)((String)b[n2 ^= D[8]] + (String)b[n3 -= D[11]]));
        long l3 = System.currentTimeMillis();
        Map<String, String> map = a;
        long l4 = l2;
        int n4 = D[12];
        n4 ^= D[13];
        l2 = l4 ^ (0L ^ l4) & -1L << (n4 ^= D[14]);
        Iterator<Map.Entry<String, String>> iterator2 = map.entrySet().iterator();
        while (iterator2.hasNext()) {
            Map.Entry<String, String> entry;
            Map.Entry<String, String> entry2 = entry = iterator2.next();
            long l5 = l2;
            int n5 = D[15];
            n5 ^= D[16];
            l2 = l5 ^ (0L ^ l5) & -1L >>> (n5 -= D[17]);
            String string = entry2.getKey();
            String string2 = entry2.getValue();
            INSTANCE.loadSingle(string, string2);
        }
        a.clear();
        int n6 = D[18];
        n6 ^= D[19];
        A = n6 += D[20];
        long l6 = System.currentTimeMillis() - l3;
        int n7 = D[21];
        n7 -= D[22];
        int n8 = D[24];
        n8 += D[25];
        int n9 = D[27];
        n9 += D[28];
        System.out.println((Object)((String)b[n7 += D[23]] + (String)b[n8 += D[26]] + l6 + (String)b[n9 ^= D[29]]));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private final void loadSingle(String name, String path) {
        long l2 = 3739225088563075271L;
        long l3 = -9086574775078611667L;
        String string = path;
        String string2 = kotakbaz.rain.client.extensions.A.getCLIENT_ID();
        int n2 = D[30];
        n2 ^= D[31];
        int n3 = D[33];
        n3 ^= D[34];
        String string3 = (String)b[n2 ^= D[32]] + string2 + (String)b[n3 += D[35]] + string;
        InputStream inputStream = kotakbaz.rain.client.util.other.a.fromAssets(string3);
        if (inputStream == null) {
            String string4 = path;
            int n4 = D[36];
            n4 ^= D[37];
            int n5 = D[39];
            n5 += D[40];
            System.err.println((String)b[n4 ^= D[38]] + (String)b[n5 ^= D[41]] + string4);
            return;
        }
        try {
            Closeable closeable = inputStream;
            Throwable throwable = null;
            try {
                String string5;
                Object object = (InputStream)closeable;
                long l4 = l2;
                int n6 = D[42];
                n6 -= D[43];
                l2 = l4 ^ (0L ^ l4) & -1L << (n6 += D[44]);
                kotakbaz.rain.client.render.texture.builder.b_0 b_02 = kotakbaz.rain.client.render.texture.loader.C.a.load((InputStream)object, kotakbaz.rain.client.render.texture.texture.B.A, a_0.A, b_0.a);
                a a2 = kotakbaz.rain.client.render.texture.texture.a.of(name, b_02);
                int n7 = D[45];
                n7 -= D[46];
                long l5 = l3;
                int n8 = D[48];
                n8 += D[49];
                l3 = l5 ^ ((long)kotakbaz.rain.client.render.texture.B.addTexture(name, a2) << (n7 -= D[47]) ^ l5) & -1L << (n8 ^= D[50]);
                int n9 = D[51];
                n9 ^= D[52];
                if ((int)(l3 >>> (n9 ^= D[53])) != 0) {
                    int n10 = D[54];
                    n10 ^= D[55];
                    string5 = (String)b[n10 ^= D[56]];
                } else {
                    int n11 = D[57];
                    n11 ^= D[58];
                    string5 = (String)b[n11 ^= D[59]];
                }
                String string6 = name;
                String string7 = string5;
                int n12 = D[60];
                n12 += D[61];
                int n13 = D[63];
                n13 -= D[64];
                System.out.println((Object)(string7 + ((String)b[n12 += D[62]] + (String)b[n13 ^= D[65]]) + string6));
                object = Unit.INSTANCE;
            }
            catch (Throwable throwable2) {
                throwable = throwable2;
                throw throwable2;
            }
            finally {
                CloseableKt.closeFinally(closeable, throwable);
            }
        }
        catch (Exception exception) {
            String string8 = name;
            int n14 = D[66];
            n14 -= D[67];
            int n15 = D[69];
            n15 -= D[70];
            System.err.println((String)b[n14 ^= D[68]] + (String)b[n15 -= D[71]] + string8);
            exception.printStackTrace();
        }
    }

    @Nullable
    public final a get(@NotNull String name) {
        int n2 = D[72];
        n2 -= D[73];
        Intrinsics.checkNotNullParameter(name, (String)b[n2 += D[74]]);
        return kotakbaz.rain.client.render.texture.B.getTexture(name);
    }

    static {
        TextureLoader.b();
        long l2 = 1130382314100501461L;
        long l3 = -1941778100784203490L;
        long l4 = 6053490683318068337L;
        long l5 = -5421164270243115758L;
        long l6 = 6356525948825280518L;
        long l7 = -7249253149053909422L;
        long l8 = -2438836695747878901L;
        long l9 = -5434603481830299624L;
        long l10 = -3008536268226038376L;
        long l11 = 1035615740018764609L;
        long l12 = -3762148205354954180L;
        long l13 = 5766563360981134658L;
        long l14 = -4607094083997887987L;
        long l15 = 5360380997652093528L;
        int n2 = D[75];
        n2 ^= D[76];
        b = new Object[n2 += D[77]];
        long l16 = l15;
        int n3 = D[78];
        n3 -= D[79];
        l15 = l16 ^ (0L ^ l16) & -1L << (n3 -= D[80]);
        Object[] objectArray = new Object[D[81]];
        objectArray[TextureLoader.D[82]] = B;
        objectArray[TextureLoader.D[83]] = D[84];
        int n4 = D[85];
        Object object = TextureLoader.A()[D[86]];
        if (object == null) {
            char[] cArray = "\u02b2\u02a7\uff8b\uff89\u02b1\u027f\uffde\u02aa\uff79\uff8a\u0298\u02a8\u02af\u0298\uff45\u027e\uff49\u0295\u02a9\uff90\u02a2\uff7a\u02b3\uff48\u0298\u027c\uff91\u02aa\u027c\u027c\ufff3\uff8d\u027d\u02ae\u029e\uff75\uff46\uff8b\uff8e\uffdd\uff89\uff45\uff93\uff46\uff87\u029e\u02b3\u02a9\uff49\u027e\uff46\u02af\uff75\uff8a\u02a2\uff91\uffdd\uff44\u02af\uff89\u029a\uff89\u02b2\u02ad\uffdf\u02b3\uff8e\uff46\u02ac\uff44\u02b2\u029f\u02b0\uff8c\u027e\uff8b\uffde\u029a\ufff3\u027d\uff7a\uff8d\u02b3\ufff3\uff88\uff78\uff8c\u0282\uff8e\u029d\u029a\u02a9\uffdc\uff8e\uff91\uff90\u02b3\uff84\uff47\u029a\uff8e\u02a4\uff44\u02b0\uff8e\uff44\u02a2\u02b3\ufff3\u02b3\uffdc\u02b1\uff4b\uff45\uff88\u029d\uff89\uff4b\uff8f\uff91\u02a6\u027f\uff75\u02a5\uff8b\u02ab\uff4b\uff90\uff91\ufff3\uff79\u02b3\uff4a\u02a9\uff47\u02a4\u0295\uff8e\u02b3\uff8e\u02af\uff75\u02af\uff46\uff87\u0282\u02a5\uff4a\u029f\u0299\uff8f\u02b3\u02a4\uff45\u02a2\uff8c\u027c\uff92\u027d\uff8d\u02b0\u027e\u027c\uff91\uff93\u027e\uffdd\uff47\u02a6\uff75\uff92\u029b\u02ad\u029e\u02b1\uff4a\uff8d\uff8f\uff4a\u029a\u02aa\uff47\u02af\u02ac\u02ac\uff8f\u02b2\uff8e\uff46\uffdc\u02a6\uff87\u02aa\uff8e\uffdd\uff49\u029e\uff78\u02aa\u02ab\u027f\uff8c\ufff3\uff79\uff45\ufff3\u02a8\uff85\uff47\u02a5\u0298\u027c\uff84\u029a\u027e\u027d\uff8a\uff91\uff8a\uffde\u02b2\uff49\u027e\uff89\u02ae\u02b2\uff8c\uff88\uff89\u029b\u0299\uff4b\uff88\u02b0\u0298\uff75\u027e\u029d\ufff3\u029c\uff85\u02ac\u027f\u029c\uff93\uff45\uff8a\u027e\uff90\u029e\uff90\u02b1\u029f\u02b1\u02af\uff8c\ufff3\u029f\uff90\uff78\uff46\u027e\uff84\u02a5\u029b\u02ae\u02a6\u02ac\uff89\u027d\u02a6\u027d\u02ab\u02a2\u02a5\u02b2\uff79\u02af\uffe1\uffe1".toCharArray();
            for (int i2 = D[87]; i2 < D[88]; ++i2) {
                int n5 = cArray[i2];
                n5 += D[89];
                n5 += D[90];
                n5 -= D[91];
                n5 -= D[92];
                n5 ^= D[93];
                n5 -= D[94];
                n5 += D[95];
                n5 -= D[96];
                n5 ^= D[97];
                cArray[i2] = (char)(n5 += D[98]);
            }
            object = TextureLoader.A()[TextureLoader.D[99]] = new String(cArray);
        }
        objectArray[n4] = (String)object;
        char[] cArray = ((String)TextureLoader.a(objectArray)).toCharArray();
        long l17 = l6;
        int n6 = D[100];
        n6 -= D[101];
        l6 = l17 ^ (0xBB00000000L ^ l17) & -1L << (n6 -= D[102]);
        long l18 = l13;
        int n7 = D[103];
        n7 -= D[104];
        l13 = l18 ^ (0L ^ l18) & -1L >>> (n7 ^= D[105]);
        while (true) {
            int n8 = D[106];
            n8 ^= D[107];
            if ((int)l13 >= (int)(l6 >>> (n8 -= D[108]))) break;
            int n9 = (int)l13;
            long l19 = l13;
            int n10 = D[109];
            n10 -= D[110];
            int n11 = D[112];
            n11 ^= D[113];
            l13 = l19 ^ (l19 ^ l19 + (long)(n10 += D[111])) & -1L >>> (n11 += D[114]);
            long l20 = l9;
            int n12 = D[115];
            n12 ^= D[116];
            l9 = l20 ^ ((long)cArray[n9] ^ l20) & -1L >>> (n12 ^= D[117]);
            int n13 = (int)l13;
            long l21 = l13;
            int n14 = D[118];
            n14 ^= D[119];
            int n15 = D[121];
            n15 ^= D[122];
            l13 = l21 ^ (l21 ^ l21 + (long)(n14 -= D[120])) & -1L >>> (n15 -= D[123]);
            int n16 = D[124];
            n16 -= D[125];
            long l22 = l10;
            int n17 = D[127];
            n17 ^= D[128];
            l10 = l22 ^ ((long)cArray[n13] << (n16 ^= D[126]) ^ l22) & -1L << (n17 ^= D[129]);
            int n18 = D[130];
            n18 += D[131];
            n18 += D[132];
            int n19 = D[133];
            n19 ^= D[134];
            long l23 = l12;
            int n20 = D[136];
            n20 ^= D[137];
            l12 = l23 ^ ((long)((int)l9 << n18 | (int)(l10 >>> (n19 += D[135]))) ^ l23) & -1L >>> (n20 += D[138]);
            char[] cArray2 = new char[(int)l12];
            long l24 = l14;
            int n21 = D[139];
            n21 ^= D[140];
            l14 = l24 ^ (0L ^ l24) & -1L << (n21 ^= D[141]);
            while (true) {
                int n22 = D[142];
                n22 ^= D[143];
                if ((int)(l14 >>> (n22 -= D[144])) >= (int)l12) break;
                int n23 = D[145];
                n23 += D[146];
                int n24 = D[148];
                n24 ^= D[149];
                cArray2[(int)(l14 >>> (n23 ^= TextureLoader.D[147]))] = cArray[(int)l13 + (int)(l14 >>> (n24 -= D[150]))];
                l14 += 0x100000000L;
            }
            int n25 = D[151];
            n25 -= D[152];
            int n26 = (int)(l15 >>> (n25 -= D[153]));
            l15 += 0x100000000L;
            TextureLoader.b[n26] = new String(cArray2);
            long l25 = l13;
            int n27 = D[154];
            n27 ^= D[155];
            l13 = l25 ^ ((long)((int)l13 + (int)l12) ^ l25) & -1L >>> (n27 ^= D[156]);
        }
        INSTANCE = new TextureLoader();
        a = new HashMap();
    }

    public static Object a(Object[] object) {
        Object object2;
        int n2 = (Integer)object[D[157]];
        String string = (String)object[D[158]];
        object = object[D[159]];
        Object[] objectArray = C;
        if (C == null) {
            objectArray = C = new Object[D[160]];
        }
        if ((object2 = objectArray[n2]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[D[161]];
                B = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[D[163] ^ D[164]];
                byArray[TextureLoader.D[165] ^ TextureLoader.D[166]] = D[167] ^ D[168];
                byArray[TextureLoader.D[169] ^ TextureLoader.D[170]] = D[171] ^ D[172];
                byArray[TextureLoader.D[173] ^ TextureLoader.D[174]] = D[175] ^ D[176];
                byArray[TextureLoader.D[177] ^ TextureLoader.D[178]] = D[179] ^ D[180];
                byArray[TextureLoader.D[181] ^ TextureLoader.D[182]] = D[183] ^ D[184];
                byArray[TextureLoader.D[185] ^ TextureLoader.D[186]] = D[187] ^ D[188];
                byArray[TextureLoader.D[189] ^ TextureLoader.D[190]] = D[191] ^ D[192];
                byArray[TextureLoader.D[193] ^ TextureLoader.D[194]] = D[195] ^ D[196];
                byArray[TextureLoader.D[197] ^ TextureLoader.D[198]] = D[199] ^ D[200];
                byArray[TextureLoader.D[201] ^ TextureLoader.D[202]] = D[203] ^ D[204];
                byArray[TextureLoader.D[205] ^ TextureLoader.D[206]] = D[207] ^ D[208];
                byArray[TextureLoader.D[209] ^ TextureLoader.D[210]] = D[211] ^ D[212];
                byArray[TextureLoader.D[213] ^ TextureLoader.D[214]] = D[215] ^ D[216];
                byArray[TextureLoader.D[217] ^ TextureLoader.D[218]] = D[219] ^ D[220];
                byArray[TextureLoader.D[221] ^ TextureLoader.D[222]] = D[223] ^ D[224];
                byArray[TextureLoader.D[225] ^ TextureLoader.D[226]] = D[227] ^ D[228];
                objectArray2[TextureLoader.D[162]] = byArray;
            }
            byte[] byArray = (byte[])object3[D[229]];
            if (c == null) {
                byte[] byArray2 = new byte[D[230] ^ D[231]];
                byArray2[TextureLoader.D[232] ^ TextureLoader.D[233]] = D[234] ^ D[235];
                byArray2[TextureLoader.D[236] ^ TextureLoader.D[237]] = D[238] ^ D[239];
                byArray2[TextureLoader.D[240] ^ TextureLoader.D[241]] = D[242] ^ D[243];
                byArray2[TextureLoader.D[244] ^ TextureLoader.D[245]] = D[246] ^ D[247];
                byArray2[TextureLoader.D[248] ^ TextureLoader.D[249]] = D[250] ^ D[251];
                byArray2[TextureLoader.D[252] ^ TextureLoader.D[253]] = D[254] ^ D[255];
                byArray2[TextureLoader.D[256] ^ TextureLoader.D[257]] = D[258] ^ D[259];
                byArray2[TextureLoader.D[260] ^ TextureLoader.D[261]] = D[262] ^ D[263];
                byArray2[TextureLoader.D[264] ^ TextureLoader.D[265]] = D[266] ^ D[267];
                byArray2[TextureLoader.D[268] ^ TextureLoader.D[269]] = D[270] ^ D[271];
                byArray2[TextureLoader.D[272] ^ TextureLoader.D[273]] = D[274] ^ D[275];
                byArray2[TextureLoader.D[276] ^ TextureLoader.D[277]] = D[278] ^ D[279];
                byArray2[TextureLoader.D[280] ^ TextureLoader.D[281]] = D[282] ^ D[283];
                byArray2[TextureLoader.D[284] ^ TextureLoader.D[285]] = D[286] ^ D[287];
                byArray2[TextureLoader.D[288] ^ TextureLoader.D[289]] = D[290] ^ D[291];
                byArray2[TextureLoader.D[292] ^ TextureLoader.D[293]] = D[294] ^ D[295];
                byArray2[TextureLoader.D[296] ^ TextureLoader.D[297]] = D[298] ^ D[299];
                byArray2[TextureLoader.D[300] ^ TextureLoader.D[301]] = D[302] ^ D[303];
                byArray2[TextureLoader.D[304] ^ TextureLoader.D[305]] = D[306] ^ D[307];
                byArray2[TextureLoader.D[308] ^ TextureLoader.D[309]] = D[310] ^ D[311];
                byArray2[TextureLoader.D[312] ^ TextureLoader.D[313]] = D[314] ^ D[315];
                byArray2[TextureLoader.D[316] ^ TextureLoader.D[317]] = D[318] ^ D[319];
                byArray2[TextureLoader.D[320] ^ TextureLoader.D[321]] = D[322] ^ D[323];
                byArray2[TextureLoader.D[324] ^ TextureLoader.D[325]] = D[326] ^ D[327];
                byArray2[TextureLoader.D[328] ^ TextureLoader.D[329]] = D[330] ^ D[331];
                byArray2[TextureLoader.D[332] ^ TextureLoader.D[333]] = D[334] ^ D[335];
                byArray2[TextureLoader.D[336] ^ TextureLoader.D[337]] = D[338] ^ D[339];
                byArray2[TextureLoader.D[340] ^ TextureLoader.D[341]] = D[342] ^ D[343];
                byArray2[TextureLoader.D[344] ^ TextureLoader.D[345]] = D[346] ^ D[347];
                byArray2[TextureLoader.D[348] ^ TextureLoader.D[349]] = D[350] ^ D[351];
                byArray2[TextureLoader.D[352] ^ TextureLoader.D[353]] = D[354] ^ D[355];
                byArray2[TextureLoader.D[356] ^ TextureLoader.D[357]] = D[358] ^ D[359];
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, D[360], byArray3, D[361], byArray.length);
                System.arraycopy(byArray2, D[362], byArray3, byArray.length, byArray2.length);
                Object object4 = TextureLoader.A()[D[363]];
                if (object4 == null) {
                    char[] cArray = "\u1b00\ub98a\u1a31\u1a2c\u1a26\ub99a\u1a35\ub95f\uc47c\ub958\u1a38\ub95b\u1a57\ub949\u1b19\u1a38\ubab7\ub987".toCharArray();
                    for (int i2 = D[364]; i2 < D[365]; ++i2) {
                        int n3 = cArray[i2];
                        n3 += D[366];
                        n3 ^= D[367];
                        n3 -= D[368];
                        n3 ^= D[369];
                        n3 += D[370];
                        n3 ^= D[371];
                        n3 -= D[372];
                        n3 += D[373];
                        n3 ^= D[374];
                        n3 -= D[375];
                        n3 -= D[376];
                        n3 ^= D[377];
                        n3 ^= D[378];
                        n3 ^= D[379];
                        cArray[i2] = (char)(n3 -= D[380]);
                    }
                    object4 = TextureLoader.A()[TextureLoader.D[381]] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[D[382]];
                byArray4[TextureLoader.D[383]] = D[384];
                byArray4[TextureLoader.D[385]] = D[386];
                byArray4[TextureLoader.D[387]] = D[388];
                byArray4[TextureLoader.D[389]] = D[390];
                byArray4[TextureLoader.D[391]] = D[392];
                byArray4[TextureLoader.D[393]] = D[394];
                byArray4[TextureLoader.D[395]] = D[396];
                byArray4[TextureLoader.D[397]] = D[398];
                byArray4[TextureLoader.D[399]] = -5;
                byArray4[10] = -12;
                byArray4[5] = -92;
                byArray4[9] = 80;
                byArray4[4] = -79;
                byArray4[14] = -3;
                byArray4[8] = 47;
                byArray4[12] = 61;
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, 12, 256);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = TextureLoader.A()[2];
                if (object5 == null) {
                    char[] cArray = "\u8a0b\u8a17\u89e1".toCharArray();
                    for (int i3 = 0; i3 < 3; ++i3) {
                        int n4 = cArray[i3];
                        n4 += 64800;
                        n4 += 16177;
                        n4 -= 38562;
                        n4 += 64402;
                        n4 ^= 0xC52;
                        n4 ^= 0x5556;
                        n4 ^= 0xE418;
                        n4 += 44888;
                        n4 -= 12169;
                        n4 ^= 0x2D3A;
                        n4 += 26670;
                        cArray[i3] = (char)(n4 += 23790);
                    }
                    object5 = TextureLoader.A()[2] = new String(cArray);
                }
                c = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, 0, 16);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, 16, byArray6.length);
            Object object6 = TextureLoader.A()[3];
            if (object6 == null) {
                char[] cArray = "\u4ce1\u4ce5\u4d13\u4cff\u4ce3\u4ce2\u4ce3\u4cff\u4d20\u4d1b\u4ce3\u4d13\u4cf5\u4d20\u4d01\u4d04\u4d04\u4cb9\u4cbe\u4d07".toCharArray();
                for (int i4 = 0; i4 < 20; ++i4) {
                    int n5 = cArray[i4];
                    n5 -= 20865;
                    n5 += 29410;
                    n5 += 6243;
                    n5 -= 18403;
                    n5 -= 1769;
                    n5 += 42603;
                    n5 -= 7724;
                    n5 -= 23823;
                    n5 -= 48052;
                    n5 += 40597;
                    n5 += 39254;
                    n5 ^= 0xBD58;
                    n5 -= 824;
                    n5 -= 55261;
                    cArray[i4] = (char)(n5 += 31038);
                }
                object6 = TextureLoader.A()[3] = new String(cArray);
            }
            Cipher cipher = Cipher.getInstance((String)object6);
            cipher.init(2, (Key)((SecretKey)c), new IvParameterSpec(byArray7));
            byte[] byArray9 = cipher.doFinal(byArray8);
            object2 = new String(byArray9, StandardCharsets.UTF_8);
        }
        return object2;
    }

    private static Object[] A() {
        Object[] objectArray = d;
        if (d == null) {
            d = new Object[4];
            objectArray = d;
        }
        return objectArray;
    }

    public static void b() {
        D = new int[0x3305 ^ 0x3295];
        TextureLoader.D[0xF0BA ^ 0xF09D] = 0xF08F ^ 0xF09D;
        TextureLoader.D[0xAC21 ^ 0xAC3C] = 0xFFFF53E5 ^ 0xAC3C;
        TextureLoader.D[0x6CC5 ^ 0x6DBD] = 0x862E ^ 0x6DBD;
        TextureLoader.D[0xE3F8 ^ 0xE35F] = 0xFFFF1DCF ^ 0xE35F;
        TextureLoader.D[0xC9B6 ^ 0xC8F5] = 0x84B6 ^ 0xC8F5;
        TextureLoader.D[0xE66D ^ 0xE63A] = 0xE63A ^ 0xE63A;
        TextureLoader.D[0x94EA ^ 0x9436] = 0xE27D ^ 0x9436;
        TextureLoader.D[0xFC45 ^ 0xFCD5] = 0xFCAB ^ 0xFCD5;
        TextureLoader.D[0xD3B0 ^ 0xD3E2] = 0xD3E2 ^ 0xD3E2;
        TextureLoader.D[0xA04B ^ 0xA174] = 0x20C2 ^ 0xA174;
        TextureLoader.D[0xE974 ^ 0xE965] = 0xFFFF169D ^ 0xE965;
        TextureLoader.D[0xF65E ^ 0xF6C1] = 0xF6C1 ^ 0xF6C1;
        TextureLoader.D[0xC3C7 ^ 0xC3F0] = 0xFFFF3C7A ^ 0xC3F0;
        TextureLoader.D[0x1E8D ^ 0x1EC6] = 0xFFFFE106 ^ 0x1EC6;
        TextureLoader.D[0x1028E ^ 0x10393] = 0x1B6A5 ^ 0x10393;
        TextureLoader.D[0xA3DA ^ 0xA301] = 0xD564 ^ 0xA301;
        TextureLoader.D[0x893A ^ 0x88B5] = 0x88B2 ^ 0x88B5;
        TextureLoader.D[0x435 ^ 0x436] = 0xFFFFFBA2 ^ 0x436;
        TextureLoader.D[0xC522 ^ 0xC58D] = 0xFFFFEED2 ^ 0xC58D;
        TextureLoader.D[0xA642 ^ 0xA776] = 0x788E ^ 0xA776;
        TextureLoader.D[0x10520 ^ 0x105F8] = 0x1891F ^ 0x105F8;
        TextureLoader.D[0x8FFA ^ 0x8F46] = 0xB1 ^ 0x8F46;
        TextureLoader.D[0x1809 ^ 0x188F] = 0xFFFFE741 ^ 0x188F;
        TextureLoader.D[0xFE5E ^ 0xFEC2] = 0xFEA9 ^ 0xFEC2;
        TextureLoader.D[0xF447 ^ 0xF4AC] = 0x88D5 ^ 0xF4AC;
        TextureLoader.D[0x10918 ^ 0x109DE] = 0x18ADF ^ 0x109DE;
        TextureLoader.D[0xD4AB ^ 0xD435] = 0xD437 ^ 0xD435;
        TextureLoader.D[0xA53 ^ 0xAD3] = 0xA83 ^ 0xAD3;
        TextureLoader.D[0xD85C ^ 0xD881] = 0x555E ^ 0xD881;
        TextureLoader.D[0x34D5 ^ 0x35AA] = 0x35AB ^ 0x35AA;
        TextureLoader.D[0xBE1A ^ 0xBF5D] = 0x4755 ^ 0xBF5D;
        TextureLoader.D[0x3C3C ^ 0x3D3E] = 0xFFFFD7AE ^ 0x3D3E;
        TextureLoader.D[0xD797 ^ 0xD781] = 0xFFFF280E ^ 0xD781;
        TextureLoader.D[0x1E06 ^ 0x1F85] = 0x1F85 ^ 0x1F85;
        TextureLoader.D[0xD68C ^ 0xD68C] = 0xFFFF2958 ^ 0xD68C;
        TextureLoader.D[0xE11B ^ 0xE092] = 0xE09D ^ 0xE092;
        TextureLoader.D[0x568B ^ 0x56BF] = 0xFFFFA900 ^ 0x56BF;
        TextureLoader.D[0xE079 ^ 0xE025] = 0x9576 ^ 0xE025;
        TextureLoader.D[0xF11C ^ 0xF144] = 0xF05C ^ 0xF144;
        TextureLoader.D[0x195C ^ 0x1942] = 0xFFFFE6AF ^ 0x1942;
        TextureLoader.D[0x4FF4 ^ 0x4F05] = 0xECB7 ^ 0x4F05;
        TextureLoader.D[0x2C39 ^ 0x2D6D] = 0xFD43 ^ 0x2D6D;
        TextureLoader.D[0xCA3F ^ 0xCB2C] = 0x589 ^ 0xCB2C;
        TextureLoader.D[0xF820 ^ 0xF87E] = 0x568B ^ 0xF87E;
        TextureLoader.D[0x93F5 ^ 0x9399] = 0x93C5 ^ 0x9399;
        TextureLoader.D[0x16EC ^ 0x17F6] = 0xFFFFC3EB ^ 0x17F6;
        TextureLoader.D[0x82B2 ^ 0x838A] = 0xDAD6 ^ 0x838A;
        TextureLoader.D[0xBC17 ^ 0xBD5D] = 0xFFFFF8E9 ^ 0xBD5D;
        TextureLoader.D[0xD56A ^ 0xD591] = 0x5A38 ^ 0xD591;
        TextureLoader.D[0xA334 ^ 0xA3E4] = 0x1A884 ^ 0xA3E4;
        TextureLoader.D[0x3E2F ^ 0x3E8B] = 0x78CD ^ 0x3E8B;
        TextureLoader.D[0x629D ^ 0x62D9] = 0x6296 ^ 0x62D9;
        TextureLoader.D[0xECE2 ^ 0xECDF] = 0xECCD ^ 0xECDF;
        TextureLoader.D[0xEABC ^ 0xEB37] = 0xEB31 ^ 0xEB37;
        TextureLoader.D[0x112A ^ 0x11BC] = 0x11E9 ^ 0x11BC;
        TextureLoader.D[0x3494 ^ 0x3488] = 0xFFFFCB75 ^ 0x3488;
        TextureLoader.D[0x4636 ^ 0x46A3] = 0x46A2 ^ 0x46A3;
        TextureLoader.D[0xD196 ^ 0xD0C8] = 0xB64A ^ 0xD0C8;
        TextureLoader.D[0x4A65 ^ 0x4AE4] = 0xFFFFB573 ^ 0x4AE4;
        TextureLoader.D[0x874E ^ 0x876B] = 0xFFFF78A5 ^ 0x876B;
        TextureLoader.D[0xD8AA ^ 0xD831] = 0xD870 ^ 0xD831;
        TextureLoader.D[0xDF11 ^ 0xDE3D] = 0xE107 ^ 0xDE3D;
        TextureLoader.D[0xD6FF ^ 0xD696] = 0xD6F5 ^ 0xD696;
        TextureLoader.D[0xDA7F ^ 0xDB1C] = 0xB924 ^ 0xDB1C;
        TextureLoader.D[0x609E ^ 0x604A] = 0xC09A ^ 0x604A;
        TextureLoader.D[0x7BD2 ^ 0x7B9C] = 0x7B28 ^ 0x7B9C;
        TextureLoader.D[0x2EA8 ^ 0x2F2E] = 0xFFFFD0E8 ^ 0x2F2E;
        TextureLoader.D[0x5CDC ^ 0x5D54] = 0x5D38 ^ 0x5D54;
        TextureLoader.D[0x72E3 ^ 0x725C] = 0x5A03 ^ 0x725C;
        TextureLoader.D[0x4F8 ^ 0x4AC] = 0x4AC ^ 0x4AC;
        TextureLoader.D[0xB30B ^ 0xB3F9] = 0x1010 ^ 0xB3F9;
        TextureLoader.D[0xEC6B ^ 0xEC2B] = 0xFFFF13C7 ^ 0xEC2B;
        TextureLoader.D[0xFEE7 ^ 0xFE6A] = 0xFE03 ^ 0xFE6A;
        TextureLoader.D[0x69F2 ^ 0x68A3] = 0xD9A9 ^ 0x68A3;
        TextureLoader.D[0x2EC3 ^ 0x2FD6] = 0x7A10 ^ 0x2FD6;
        TextureLoader.D[0x619F ^ 0x61EC] = 0x61C6 ^ 0x61EC;
        TextureLoader.D[0xCF1D ^ 0xCFD9] = 0xE02B ^ 0xCFD9;
        TextureLoader.D[0x841A ^ 0x8483] = 0xFFFF7B7F ^ 0x8483;
        TextureLoader.D[0x845A ^ 0x84B7] = 0x7428 ^ 0x84B7;
        TextureLoader.D[0x5B6C ^ 0x5B4F] = 0x5B70 ^ 0x5B4F;
        TextureLoader.D[0xB07 ^ 0xB2B] = 0xB13 ^ 0xB2B;
        TextureLoader.D[0xAF42 ^ 0xAFE1] = 0xE9B7 ^ 0xAFE1;
        TextureLoader.D[0x9488 ^ 0x948E] = 0xFFFF6B51 ^ 0x948E;
        TextureLoader.D[0x1570 ^ 0x1450] = 0x3043 ^ 0x1450;
        TextureLoader.D[0x4C0C ^ 0x4CA6] = 0xCF9D ^ 0x4CA6;
        TextureLoader.D[0x77D6 ^ 0x76DF] = 0x175C4 ^ 0x76DF;
        TextureLoader.D[0x63FA ^ 0x63A0] = 0xF411 ^ 0x63A0;
        TextureLoader.D[0x6D4C ^ 0x6D30] = 0x6D70 ^ 0x6D30;
        TextureLoader.D[0x18CA ^ 0x18B8] = 0xFFFFE76B ^ 0x18B8;
        TextureLoader.D[0x69A0 ^ 0x695A] = 0xE6B6 ^ 0x695A;
        TextureLoader.D[0x8CD1 ^ 0x8CA0] = 0x8CEB ^ 0x8CA0;
        TextureLoader.D[0x69FD ^ 0x69DF] = 0xFFFF9652 ^ 0x69DF;
        TextureLoader.D[0x84BA ^ 0x85F1] = 0x3FCC ^ 0x85F1;
        TextureLoader.D[0xD718 ^ 0xD733] = 0xD771 ^ 0xD733;
        TextureLoader.D[0x5897 ^ 0x5827] = 0x8CD2 ^ 0x5827;
        TextureLoader.D[0x7CD8 ^ 0x7CDC] = 0x7CFC ^ 0x7CDC;
        TextureLoader.D[0x1A69 ^ 0x1AC4] = 0xCE3A ^ 0x1AC4;
        TextureLoader.D[0xD5C1 ^ 0xD4C6] = 0x85A7 ^ 0xD4C6;
        TextureLoader.D[0xA1E3 ^ 0xA099] = 0x6DAE ^ 0xA099;
        TextureLoader.D[0xECE9 ^ 0xEDE2] = 0x1EEF9 ^ 0xEDE2;
        TextureLoader.D[0x7E18 ^ 0x7F58] = 0x331F ^ 0x7F58;
        TextureLoader.D[0xF249 ^ 0xF2F1] = 0xE4C ^ 0xF2F1;
        TextureLoader.D[0x4642 ^ 0x4750] = 0xFFFF7657 ^ 0x4750;
        TextureLoader.D[0x2145 ^ 0x2024] = 0x421C ^ 0x2024;
        TextureLoader.D[0x9186 ^ 0x908E] = 0x19381 ^ 0x908E;
        TextureLoader.D[0x104E ^ 0x1152] = 0xA464 ^ 0x1152;
        TextureLoader.D[0x6FA ^ 0x794] = 0xC775 ^ 0x794;
        TextureLoader.D[0xA678 ^ 0xA75C] = 0xE1C8 ^ 0xA75C;
        TextureLoader.D[0x222A ^ 0x225F] = 0x2211 ^ 0x225F;
        TextureLoader.D[0xB269 ^ 0xB244] = 0xFFFF4DBE ^ 0xB244;
        TextureLoader.D[0x10224 ^ 0x10343] = 0x1B892 ^ 0x10343;
        TextureLoader.D[0x6FEE ^ 0x6F5D] = 0xFFFF679F ^ 0x6F5D;
        TextureLoader.D[0x10E49 ^ 0x10E2D] = 0x10E08 ^ 0x10E2D;
        TextureLoader.D[0xCF57 ^ 0xCFF2] = 0xCEAC ^ 0xCFF2;
        TextureLoader.D[0xAC15 ^ 0xAC8F] = 0xAC85 ^ 0xAC8F;
        TextureLoader.D[0xE5C9 ^ 0xE57E] = 0xFFFFE65F ^ 0xE57E;
        TextureLoader.D[0x300C ^ 0x30F9] = 0xFFE1 ^ 0x30F9;
        TextureLoader.D[0x63A1 ^ 0x63EE] = 0x63DE ^ 0x63EE;
        TextureLoader.D[0x55D4 ^ 0x55B7] = 0x55B7 ^ 0x55B7;
        TextureLoader.D[0xCECE ^ 0xCE2A] = 0xF719 ^ 0xCE2A;
        TextureLoader.D[0x7E33 ^ 0x7F1A] = 0xDECF ^ 0x7F1A;
        TextureLoader.D[0x646B ^ 0x6526] = 0x7862 ^ 0x6526;
        TextureLoader.D[0x6C21 ^ 0x6C38] = 0xFFFF93B2 ^ 0x6C38;
        TextureLoader.D[0xA0B3 ^ 0xA09B] = 0xFFFF5F5C ^ 0xA09B;
        TextureLoader.D[0xA3C ^ 0xB02] = 0x8AC8 ^ 0xB02;
        TextureLoader.D[0x8CE ^ 0x9FC] = 0x7D44 ^ 0x9FC;
        TextureLoader.D[0xC48B ^ 0xC50C] = 0xC50E ^ 0xC50C;
        TextureLoader.D[0xED3D ^ 0xEDD7] = 0xFFFF6E47 ^ 0xEDD7;
        TextureLoader.D[0x71E5 ^ 0x71E9] = 0xFFFF8E46 ^ 0x71E9;
        TextureLoader.D[0xA2D2 ^ 0xA3AF] = 0xA3AE ^ 0xA3AF;
        TextureLoader.D[0xCE77 ^ 0xCEC2] = 0x327C ^ 0xCEC2;
        TextureLoader.D[0xD00A ^ 0xD097] = 0xD096 ^ 0xD097;
        TextureLoader.D[0xB109 ^ 0xB06F] = 0xBBA ^ 0xB06F;
        TextureLoader.D[0x1045D ^ 0x1045A] = 0x10468 ^ 0x1045A;
        TextureLoader.D[0x9B88 ^ 0x9BE7] = 0x9BFB ^ 0x9BE7;
        TextureLoader.D[0x44B1 ^ 0x44B0] = 0x449C ^ 0x44B0;
        TextureLoader.D[0x8085 ^ 0x81F4] = 0x2E71 ^ 0x81F4;
        TextureLoader.D[0xFEB0 ^ 0xFF3C] = 0xFF75 ^ 0xFF3C;
        TextureLoader.D[0x7219 ^ 0x72E4] = 0xD2C3 ^ 0x72E4;
        TextureLoader.D[0x21E6 ^ 0x21EE] = 0xFFFFDE02 ^ 0x21EE;
        TextureLoader.D[0xA9 ^ 0x41] = 0x7C2B ^ 0x41;
        TextureLoader.D[0x2982 ^ 0x29E5] = 0xFFFFD62A ^ 0x29E5;
        TextureLoader.D[0x11EC ^ 0x10FA] = 0xFFFFBAA0 ^ 0x10FA;
        TextureLoader.D[0xC0E3 ^ 0xC03D] = 0x4DEF ^ 0xC03D;
        TextureLoader.D[0x4C30 ^ 0x4D58] = 0x4D58 ^ 0x4D58;
        TextureLoader.D[0xA824 ^ 0xA896] = 0x5FFB ^ 0xA896;
        TextureLoader.D[0x10B9D ^ 0x10ABF] = 0x12EC5 ^ 0x10ABF;
        TextureLoader.D[0xCBE8 ^ 0xCB43] = 0x482F ^ 0xCB43;
        TextureLoader.D[0xA6AD ^ 0xA7E9] = 0x5FF8 ^ 0xA7E9;
        TextureLoader.D[0xB708 ^ 0xB613] = 0x9DF2 ^ 0xB613;
        TextureLoader.D[0xEA0E ^ 0xEAA7] = 0x699B ^ 0xEAA7;
        TextureLoader.D[0x1964 ^ 0x1904] = 0x449 ^ 0x1904;
        TextureLoader.D[0x1C6F ^ 0x1CB5] = 0x6AFE ^ 0x1CB5;
        TextureLoader.D[0xE79D ^ 0xE6DB] = 0x1EC5 ^ 0xE6DB;
        TextureLoader.D[0x9D4F ^ 0x9D46] = 0x9D35 ^ 0x9D46;
        TextureLoader.D[0x9B21 ^ 0x9A31] = 0x5492 ^ 0x9A31;
        TextureLoader.D[0xF84F ^ 0xF90A] = 0x102 ^ 0xF90A;
        TextureLoader.D[0xB152 ^ 0xB197] = 0x3294 ^ 0xB197;
        TextureLoader.D[0x38EC ^ 0x38D6] = 0xFFFFC719 ^ 0x38D6;
        TextureLoader.D[0x2EBC ^ 0x2E34] = 0xFFFFD1F8 ^ 0x2E34;
        TextureLoader.D[0xA1B9 ^ 0xA1EA] = 0xA1EB ^ 0xA1EA;
        TextureLoader.D[0x28B3 ^ 0x28C7] = 0x2883 ^ 0x28C7;
        TextureLoader.D[0x1C1D ^ 0x1C4B] = 0x1C4B ^ 0x1C4B;
        TextureLoader.D[0x5D23 ^ 0x5CA7] = 0x5CFD ^ 0x5CA7;
        TextureLoader.D[0x8547 ^ 0x8464] = 0xA072 ^ 0x8464;
        TextureLoader.D[0xE9CE ^ 0xE8AE] = 0x8A9C ^ 0xE8AE;
        TextureLoader.D[0x9357 ^ 0x939D] = 0x1B56 ^ 0x939D;
        TextureLoader.D[0x10DC1 ^ 0x10D32] = 0x1AE80 ^ 0x10D32;
        TextureLoader.D[0x3F4A ^ 0x3E34] = 0x3E24 ^ 0x3E34;
        TextureLoader.D[0xB529 ^ 0xB443] = 0xB443 ^ 0xB443;
        TextureLoader.D[0xD95A ^ 0xD84E] = 0x8D9E ^ 0xD84E;
        TextureLoader.D[0x720E ^ 0x7279] = 0xFFFF8DA4 ^ 0x7279;
        TextureLoader.D[0x1336 ^ 0x134C] = 0xFFFFECCA ^ 0x134C;
        TextureLoader.D[0x4091 ^ 0x405A] = 0xC8D3 ^ 0x405A;
        TextureLoader.D[0x610B ^ 0x613A] = 0xFFFF9EBC ^ 0x613A;
        TextureLoader.D[0x6AFE ^ 0x6A52] = 0xE969 ^ 0x6A52;
        TextureLoader.D[0x1D32 ^ 0x1C4B] = 0x415E ^ 0x1C4B;
        TextureLoader.D[0x9EA2 ^ 0x9E5D] = 0x3E7A ^ 0x9E5D;
        TextureLoader.D[0x55F ^ 0x59D] = 0x2A6F ^ 0x59D;
        TextureLoader.D[0x2AC5 ^ 0x2B45] = 0xFFFFD4DB ^ 0x2B45;
        TextureLoader.D[0x105B2 ^ 0x104B6] = 0x155D8 ^ 0x104B6;
        TextureLoader.D[0xA97A ^ 0xA838] = 0xFFFF1BA6 ^ 0xA838;
        TextureLoader.D[0x94B0 ^ 0x94CB] = 0xFFFF6B6A ^ 0x94CB;
        TextureLoader.D[0xEE93 ^ 0xEE98] = 0xFFFF116E ^ 0xEE98;
        TextureLoader.D[0xCF2F ^ 0xCE67] = 0x744B ^ 0xCE67;
        TextureLoader.D[0xCD58 ^ 0xCD09] = 0xCD0A ^ 0xCD09;
        TextureLoader.D[0x340E ^ 0x342A] = 0x3475 ^ 0x342A;
        TextureLoader.D[0x105F ^ 0x117E] = 0x3568 ^ 0x117E;
        TextureLoader.D[0x7ACB ^ 0x7A1C] = 0xF6E3 ^ 0x7A1C;
        TextureLoader.D[0x2ECA ^ 0x2FB6] = 0x19CB ^ 0x2FB6;
        TextureLoader.D[0xEC06 ^ 0xED71] = 0xB4C1 ^ 0xED71;
        TextureLoader.D[0xD2FD ^ 0xD2DB] = 0xFFFF2D4D ^ 0xD2DB;
        TextureLoader.D[0xC9D0 ^ 0xC8C7] = 0x9D01 ^ 0xC8C7;
        TextureLoader.D[0x1DA9 ^ 0x1DAB] = 0x1DF6 ^ 0x1DAB;
        TextureLoader.D[0xE1B3 ^ 0xE11B] = 0xE041 ^ 0xE11B;
        TextureLoader.D[0xB8D4 ^ 0xB98F] = 0x35EC ^ 0xB98F;
        TextureLoader.D[0x1462 ^ 0x1481] = 0x2D8E ^ 0x1481;
        TextureLoader.D[0x5A59 ^ 0x5ABB] = 0x6388 ^ 0x5ABB;
        TextureLoader.D[0x750B ^ 0x75AA] = 0x75AB ^ 0x75AA;
        TextureLoader.D[0x7B95 ^ 0x7AA8] = 0xFB1E ^ 0x7AA8;
        TextureLoader.D[0x40AA ^ 0x4066] = 0xC8AD ^ 0x4066;
        TextureLoader.D[0x62EB ^ 0x63EA] = 0x76A1 ^ 0x63EA;
        TextureLoader.D[0x6FD8 ^ 0x6FCA] = 0x6F9A ^ 0x6FCA;
        TextureLoader.D[0xB81F ^ 0xB94F] = 0x844 ^ 0xB94F;
        TextureLoader.D[0x594E ^ 0x59B0] = 0xFFFF0610 ^ 0x59B0;
        TextureLoader.D[0xA961 ^ 0xA86F] = 0xFFFFC9D8 ^ 0xA86F;
        TextureLoader.D[0x9D3C ^ 0x9D42] = 0x9D0C ^ 0x9D42;
        TextureLoader.D[0xD525 ^ 0xD40B] = 0xFFFF14D0 ^ 0xD40B;
        TextureLoader.D[0x715A ^ 0x7185] = 0xFFFF03E7 ^ 0x7185;
        TextureLoader.D[0x5AB7 ^ 0x5BD5] = 0xFFFFC60F ^ 0x5BD5;
        TextureLoader.D[0xB400 ^ 0xB56C] = 0xB56C ^ 0xB56C;
        TextureLoader.D[0x8E5 ^ 0x809] = 0xF895 ^ 0x809;
        TextureLoader.D[0x9718 ^ 0x963F] = 0xD0A0 ^ 0x963F;
        TextureLoader.D[0x6F82 ^ 0x6E03] = 0x6E08 ^ 0x6E03;
        TextureLoader.D[0xCF7D ^ 0xCF3B] = 0xFFFF30EF ^ 0xCF3B;
        TextureLoader.D[0x3F2E ^ 0x3F0E] = 0xFFFFC0E8 ^ 0x3F0E;
        TextureLoader.D[0x827E ^ 0x8373] = 0x1D78 ^ 0x8373;
        TextureLoader.D[0x31C5 ^ 0x31EA] = 0xFFFFCE3C ^ 0x31EA;
        TextureLoader.D[0x3F39 ^ 0x3F9B] = 0x3F9B ^ 0x3F9B;
        TextureLoader.D[0x44AE ^ 0x44E7] = 0x449E ^ 0x44E7;
        TextureLoader.D[0x10C78 ^ 0x10D0C] = 0x18106 ^ 0x10D0C;
        TextureLoader.D[0x1121 ^ 0x115E] = 0xFFFFEEB9 ^ 0x115E;
        TextureLoader.D[0x6AD4 ^ 0x6A35] = 0x5300 ^ 0x6A35;
        TextureLoader.D[0xFBEA ^ 0xFA9F] = 0x9C73 ^ 0xFA9F;
        TextureLoader.D[0x9BBC ^ 0x9B07] = 0x14E1 ^ 0x9B07;
        TextureLoader.D[0x9127 ^ 0x917A] = 0xEF2E ^ 0x917A;
        TextureLoader.D[0xE02C ^ 0xE101] = 0xDE32 ^ 0xE101;
        TextureLoader.D[0xCC70 ^ 0xCD2A] = 0x4138 ^ 0xCD2A;
        TextureLoader.D[0xC545 ^ 0xC5F3] = 0x394E ^ 0xC5F3;
        TextureLoader.D[0xCD86 ^ 0xCD05] = 0xCD49 ^ 0xCD05;
        TextureLoader.D[0x9342 ^ 0x935D] = 0x9359 ^ 0x935D;
        TextureLoader.D[0xFC6E ^ 0xFD0A] = 0x46D6 ^ 0xFD0A;
        TextureLoader.D[0x9AE ^ 0x8F3] = 0x6E22 ^ 0x8F3;
        TextureLoader.D[0xC5BD ^ 0xC5FF] = 0xFFFF3A1D ^ 0xC5FF;
        TextureLoader.D[0x7BB6 ^ 0x7B8D] = 0x7BE6 ^ 0x7B8D;
        TextureLoader.D[0xA6EC ^ 0xA7B9] = 0x778F ^ 0xA7B9;
        TextureLoader.D[0x78A ^ 0x68F] = 0x57EE ^ 0x68F;
        TextureLoader.D[0x7D35 ^ 0x7D95] = 0x7D94 ^ 0x7D95;
        TextureLoader.D[0xAA1E ^ 0xAB93] = 0xAB9E ^ 0xAB93;
        TextureLoader.D[0x6163 ^ 0x60E1] = 0x60BC ^ 0x60E1;
        TextureLoader.D[0x103E4 ^ 0x102D2] = 0x1DD3E ^ 0x102D2;
        TextureLoader.D[0xEA9D ^ 0xEB9D] = 0xFEC1 ^ 0xEB9D;
        TextureLoader.D[0x483D ^ 0x4950] = 0x4942 ^ 0x4950;
        TextureLoader.D[0xFE30 ^ 0xFE84] = 0x9E9 ^ 0xFE84;
        TextureLoader.D[0x1DD0 ^ 0x1D29] = 0x9280 ^ 0x1D29;
        TextureLoader.D[0xAF4C ^ 0xAF2D] = 0xE2A3 ^ 0xAF2D;
        TextureLoader.D[0xD16D ^ 0xD061] = 0x4E75 ^ 0xD061;
        TextureLoader.D[0xF7EF ^ 0xF792] = 0xFFFF0840 ^ 0xF792;
        TextureLoader.D[0x69DA ^ 0x69A2] = 0xFFFF964E ^ 0x69A2;
        TextureLoader.D[0xACC5 ^ 0xADB6] = 0x84D0 ^ 0xADB6;
        TextureLoader.D[0xE099 ^ 0xE07F] = 0x4239 ^ 0xE07F;
        TextureLoader.D[0xB967 ^ 0xB926] = 0xB94B ^ 0xB926;
        TextureLoader.D[0x4241 ^ 0x4294] = 0xCE79 ^ 0x4294;
        TextureLoader.D[0x8C12 ^ 0x8C21] = 0x8C79 ^ 0x8C21;
        TextureLoader.D[0x5BA1 ^ 0x5BCB] = 0xFFFFA471 ^ 0x5BCB;
        TextureLoader.D[0x1BFD ^ 0x1B2C] = 0xBBFD ^ 0x1B2C;
        TextureLoader.D[0x99ED ^ 0x99D1] = 0xFFFF6633 ^ 0x99D1;
        TextureLoader.D[0x10D4E ^ 0x10D64] = 0x10D4E ^ 0x10D64;
        TextureLoader.D[0xAC24 ^ 0xACAF] = 0xAC81 ^ 0xACAF;
        TextureLoader.D[0x1084A ^ 0x108CD] = 0xFFFEF72E ^ 0x108CD;
        TextureLoader.D[0x5700 ^ 0x5649] = 0xEC74 ^ 0x5649;
        TextureLoader.D[0xD4C5 ^ 0xD4EC] = 0xFFFF2B3B ^ 0xD4EC;
        TextureLoader.D[0xCBB ^ 0xC5E] = 0xC5E ^ 0xC5E;
        TextureLoader.D[0x51E0 ^ 0x5151] = 0xA633 ^ 0x5151;
        TextureLoader.D[0x4CEB ^ 0x4C25] = 0x14745 ^ 0x4C25;
        TextureLoader.D[0x31D4 ^ 0x3119] = 0x13A77 ^ 0x3119;
        TextureLoader.D[0x8C83 ^ 0x8D9B] = 0xA668 ^ 0x8D9B;
        TextureLoader.D[0xC2F3 ^ 0xC232] = 0xEDC0 ^ 0xC232;
        TextureLoader.D[0x8C5D ^ 0x8D34] = 0x8D34 ^ 0x8D34;
        TextureLoader.D[0xD380 ^ 0xD343] = 0xFCAD ^ 0xD343;
        TextureLoader.D[0xC336 ^ 0xC36D] = 0xD42F ^ 0xC36D;
        TextureLoader.D[0x3FEB ^ 0x3EC3] = 0x9F1A ^ 0x3EC3;
        TextureLoader.D[0x2E82 ^ 0x2E4B] = 0xA68C ^ 0x2E4B;
        TextureLoader.D[0x1AAB ^ 0x1A6C] = 0x9962 ^ 0x1A6C;
        TextureLoader.D[0x7BE4 ^ 0x7A8B] = 0xFFE8 ^ 0x7A8B;
        TextureLoader.D[0x21FA ^ 0x2178] = 0xFFFFDEAB ^ 0x2178;
        TextureLoader.D[0xFD79 ^ 0xFD14] = 0xFFFF02E2 ^ 0xFD14;
        TextureLoader.D[0xB3A4 ^ 0xB344] = 0x3E96 ^ 0xB344;
        TextureLoader.D[0x6597 ^ 0x65AE] = 0xFFFF9A0E ^ 0x65AE;
        TextureLoader.D[0xBA69 ^ 0xBA36] = 0x2A5C ^ 0xBA36;
        TextureLoader.D[0xEA86 ^ 0xEBB1] = 0x344E ^ 0xEBB1;
        TextureLoader.D[0x94FD ^ 0x95D7] = 0x340F ^ 0x95D7;
        TextureLoader.D[0xA35E ^ 0xA21F] = 0xEE5C ^ 0xA21F;
        TextureLoader.D[0x9B57 ^ 0x9BBE] = 0xE7C7 ^ 0x9BBE;
        TextureLoader.D[0xD16D ^ 0xD1D4] = 0x5E2A ^ 0xD1D4;
        TextureLoader.D[0xA29E ^ 0xA20D] = 0xA250 ^ 0xA20D;
        TextureLoader.D[0x28B4 ^ 0x28DC] = 0xFFFFD750 ^ 0x28DC;
        TextureLoader.D[0x6352 ^ 0x6337] = 0x6336 ^ 0x6337;
        TextureLoader.D[0x136C ^ 0x1259] = 0xCDA6 ^ 0x1259;
        TextureLoader.D[0x4379 ^ 0x4397] = 0xFFFF4CF7 ^ 0x4397;
        TextureLoader.D[0x359B ^ 0x35D1] = 0x35EC ^ 0x35D1;
        TextureLoader.D[0x1060E ^ 0x10699] = 0xFFFEF942 ^ 0x10699;
        TextureLoader.D[0x1741 ^ 0x16CB] = 0x16A9 ^ 0x16CB;
        TextureLoader.D[0xC93F ^ 0xC9D8] = 0x6BBE ^ 0xC9D8;
        TextureLoader.D[0x555A ^ 0x554D] = 0x556F ^ 0x554D;
        TextureLoader.D[0xC2E ^ 0xCD6] = 0x8364 ^ 0xCD6;
        TextureLoader.D[0x24C8 ^ 0x25B3] = 0x848 ^ 0x25B3;
        TextureLoader.D[0x464E ^ 0x4744] = 0xFFFEBBEB ^ 0x4744;
        TextureLoader.D[0xDA54 ^ 0xDB68] = 0x5AD0 ^ 0xDB68;
        TextureLoader.D[0x3F11 ^ 0x3E42] = 0x8F48 ^ 0x3E42;
        TextureLoader.D[0x2B75 ^ 0x2A05] = 0xC4C6 ^ 0x2A05;
        TextureLoader.D[0x48A3 ^ 0x48DA] = 0x489D ^ 0x48DA;
        TextureLoader.D[0x9A23 ^ 0x9A9E] = 0xB280 ^ 0x9A9E;
        TextureLoader.D[0x3FBF ^ 0x3FA4] = 0xFFFFC07A ^ 0x3FA4;
        TextureLoader.D[0x7943 ^ 0x7835] = 0x95B9 ^ 0x7835;
        TextureLoader.D[0x5C9F ^ 0x5DAE] = 0x2940 ^ 0x5DAE;
        TextureLoader.D[0x8A2B ^ 0x8B7C] = 0x5B4A ^ 0x8B7C;
        TextureLoader.D[0xFD8D ^ 0xFD87] = 0xFDF4 ^ 0xFD87;
        TextureLoader.D[0xE398 ^ 0xE300] = 0xFFFF1CBF ^ 0xE300;
        TextureLoader.D[0x8AF0 ^ 0x8B75] = 0x8B76 ^ 0x8B75;
        TextureLoader.D[0xA295 ^ 0xA22F] = 0x2DD8 ^ 0xA22F;
        TextureLoader.D[0xD641 ^ 0xD764] = 0x91FB ^ 0xD764;
        TextureLoader.D[0x14B3 ^ 0x15AC] = 0xA09A ^ 0x15AC;
        TextureLoader.D[0x7870 ^ 0x7943] = 0xDAD ^ 0x7943;
        TextureLoader.D[0xF146 ^ 0xF1D2] = 0xF1A6 ^ 0xF1D2;
        TextureLoader.D[0x9E13 ^ 0x9E16] = 0x9E43 ^ 0x9E16;
        TextureLoader.D[0x7D4D ^ 0x7DE3] = 0xA916 ^ 0x7DE3;
        TextureLoader.D[0x50F7 ^ 0x51D8] = 0x6EEB ^ 0x51D8;
        TextureLoader.D[0xB1C2 ^ 0xB1CD] = 0xB1E4 ^ 0xB1CD;
        TextureLoader.D[0xC5DE ^ 0xC48C] = 0x7598 ^ 0xC48C;
        TextureLoader.D[0xB033 ^ 0xB0C7] = 0x7FCA ^ 0xB0C7;
        TextureLoader.D[0x4286 ^ 0x42E0] = 0x42E4 ^ 0x42E0;
        TextureLoader.D[0x23F2 ^ 0x2390] = 0x3D5E ^ 0x2390;
        TextureLoader.D[0x5E9C ^ 0x5EAE] = 0x5EB3 ^ 0x5EAE;
        TextureLoader.D[0x10291 ^ 0x103C7] = 0xFFFE2C29 ^ 0x103C7;
        TextureLoader.D[0xCC41 ^ 0xCD47] = 0x9C29 ^ 0xCD47;
        TextureLoader.D[0x9CF5 ^ 0x9C7A] = 0x9C41 ^ 0x9C7A;
        TextureLoader.D[0xE2CF ^ 0xE207] = 0x6106 ^ 0xE207;
        TextureLoader.D[0x12D0 ^ 0x139C] = 0xED0 ^ 0x139C;
        TextureLoader.D[0xBDAE ^ 0xBDFB] = 0xBDF9 ^ 0xBDFB;
        TextureLoader.D[0x499C ^ 0x4912] = 0x49B7 ^ 0x4912;
        TextureLoader.D[0xFC1E ^ 0xFD25] = 0xA469 ^ 0xFD25;
        TextureLoader.D[0x6CD0 ^ 0x6C03] = 0xCC9E ^ 0x6C03;
        TextureLoader.D[0x368B ^ 0x36BD] = 0x36A3 ^ 0x36BD;
        TextureLoader.D[0x804C ^ 0x80C6] = 0x809C ^ 0x80C6;
        TextureLoader.D[0xB0FD ^ 0xB00A] = 0x7F12 ^ 0xB00A;
        TextureLoader.D[0xA089 ^ 0xA099] = 0xA0A8 ^ 0xA099;
        TextureLoader.D[0x5740 ^ 0x57B0] = 0xF41F ^ 0x57B0;
        TextureLoader.D[0x50BA ^ 0x5063] = 0x2620 ^ 0x5063;
        TextureLoader.D[0xE27C ^ 0xE2F9] = 0xFFFF1D0A ^ 0xE2F9;
        TextureLoader.D[0x3AC3 ^ 0x3B9F] = 0x5D54 ^ 0x3B9F;
        TextureLoader.D[0xCA53 ^ 0xCA03] = 0xCA67 ^ 0xCA03;
        TextureLoader.D[0x5375 ^ 0x5210] = 0xE9C1 ^ 0x5210;
        TextureLoader.D[0x284F ^ 0x2839] = 0x2809 ^ 0x2839;
        TextureLoader.D[0x2467 ^ 0x246A] = 0xFFFFDB94 ^ 0x246A;
        TextureLoader.D[0x9C56 ^ 0x9C42] = 0x9C6D ^ 0x9C42;
        TextureLoader.D[0xF737 ^ 0xF611] = 0xB0DD ^ 0xF611;
        TextureLoader.D[0xD090 ^ 0xD11E] = 0xD13C ^ 0xD11E;
        TextureLoader.D[0x54D7 ^ 0x549B] = 0xFFFFAB71 ^ 0x549B;
        TextureLoader.D[0xD3C ^ 0xD65] = 0x8695 ^ 0xD65;
        TextureLoader.D[0x97E6 ^ 0x97DE] = 0xFFFF685A ^ 0x97DE;
        TextureLoader.D[0x6496 ^ 0x65E4] = 0xEE81 ^ 0x65E4;
        TextureLoader.D[0x884A ^ 0x897A] = 0xFD88 ^ 0x897A;
        TextureLoader.D[0x9A73 ^ 0x9A18] = 0xFFFF65DE ^ 0x9A18;
        TextureLoader.D[0x8A2E ^ 0x8B05] = 0x2AD0 ^ 0x8B05;
        TextureLoader.D[0xFBB8 ^ 0xFBAB] = 0xFFFF0429 ^ 0xFBAB;
        TextureLoader.D[0x80D1 ^ 0x8003] = 0x20D3 ^ 0x8003;
        TextureLoader.D[0xCCC ^ 0xDD2] = 0xB88B ^ 0xDD2;
        TextureLoader.D[0x10CA9 ^ 0x10C66] = 0xFFFFF8E8 ^ 0x10C66;
        TextureLoader.D[0xB21F ^ 0xB30E] = 0x7DAB ^ 0xB30E;
        TextureLoader.D[0xF752 ^ 0xF75C] = 0xF72D ^ 0xF75C;
        TextureLoader.D[0x2D5F ^ 0x2DF9] = 0x2CA3 ^ 0x2DF9;
        TextureLoader.D[0x33E5 ^ 0x32EA] = 0xACE1 ^ 0x32EA;
        TextureLoader.D[0x10638 ^ 0x1067F] = 0xFFFEF9EB ^ 0x1067F;
        TextureLoader.D[0x90DB ^ 0x909E] = 0xFFFF6FE7 ^ 0x909E;
        TextureLoader.D[0xBF9E ^ 0xBF84] = 0xBFD9 ^ 0xBF84;
        TextureLoader.D[0xD023 ^ 0xD06E] = 0xFFFF2F86 ^ 0xD06E;
        TextureLoader.D[0x7C75 ^ 0x7CE4] = 0x7C87 ^ 0x7CE4;
        TextureLoader.D[0xC4C9 ^ 0xC445] = 0xC422 ^ 0xC445;
        TextureLoader.D[0x7128 ^ 0x7117] = 0x7140 ^ 0x7117;
        TextureLoader.D[0x6EA5 ^ 0x6FFA] = 0x92B ^ 0x6FFA;
        TextureLoader.D[0x688C ^ 0x68CF] = 0xFFFF9751 ^ 0x68CF;
        TextureLoader.D[0x3FA1 ^ 0x3E9B] = 0x67F0 ^ 0x3E9B;
        TextureLoader.D[0x38CB ^ 0x3984] = 0x24C0 ^ 0x3984;
        TextureLoader.D[0x8514 ^ 0x85E8] = 0x25CD ^ 0x85E8;
        TextureLoader.D[0x3DE1 ^ 0x3DF4] = 0xFFFFC281 ^ 0x3DF4;
        TextureLoader.D[0x7EDE ^ 0x7EEB] = 0xFFFF812C ^ 0x7EEB;
        TextureLoader.D[0x38F3 ^ 0x387A] = 0x3870 ^ 0x387A;
        TextureLoader.D[0xA456 ^ 0xA41E] = 0xA422 ^ 0xA41E;
        TextureLoader.D[0x16D2 ^ 0x178A] = 0x9BF7 ^ 0x178A;
        TextureLoader.D[0xD2FD ^ 0xD22B] = 0x5ECC ^ 0xD22B;
        TextureLoader.D[0x9F23 ^ 0x9FCC] = 0x6F53 ^ 0x9FCC;
        TextureLoader.D[0x525 ^ 0x50B] = 0x50F ^ 0x50B;
        TextureLoader.D[0xFB3B ^ 0xFB85] = 0xD39E ^ 0xFB85;
        TextureLoader.D[0x8968 ^ 0x8851] = 0xD11D ^ 0x8851;
        TextureLoader.D[0x86D0 ^ 0x87C9] = 0xAC28 ^ 0x87C9;
        TextureLoader.D[0xF556 ^ 0xF43D] = 0xF43C ^ 0xF43D;
        TextureLoader.D[0x8A62 ^ 0x8A94] = 0x45EC ^ 0x8A94;
        TextureLoader.D[0xE1AA ^ 0xE18B] = 0xE1C2 ^ 0xE18B;
        TextureLoader.D[0x420 ^ 0x438] = 0x41E ^ 0x438;
        TextureLoader.D[0x80A5 ^ 0x8065] = 0xA87E ^ 0x8065;
        TextureLoader.D[0xC321 ^ 0xC3A5] = 0xFFFF3C54 ^ 0xC3A5;
        TextureLoader.D[0xB6BB ^ 0xB68B] = 0xB63C ^ 0xB68B;
        TextureLoader.D[0x56ED ^ 0x57EE] = 0x42A5 ^ 0x57EE;
        TextureLoader.D[0x10BD2 ^ 0x10BEC] = 0x10BF4 ^ 0x10BEC;
        TextureLoader.D[0xD8F5 ^ 0xD9BB] = 0xFFFF3B71 ^ 0xD9BB;
        TextureLoader.D[0x4A0D ^ 0x4A7D] = 0x4A7B ^ 0x4A7D;
        TextureLoader.D[0x7813 ^ 0x787D] = 0x786C ^ 0x787D;
        TextureLoader.D[0x2E94 ^ 0x2FCD] = 0xA3AE ^ 0x2FCD;
        TextureLoader.D[0xA26D ^ 0xA2FF] = 0xA2E5 ^ 0xA2FF;
    }
}

