/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL20
 */
package kotakbaz.rain.client.render.main.compile;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import kotakbaz.rain.client.render.main.compile.A;
import kotakbaz.rain.client.render.main.compile.a_0;
import kotakbaz.rain.client.render.main.exceptions.impl.B;
import kotakbaz.rain.client.render.main.exceptions.impl.c_0;
import kotlin.Pair;
import org.lwjgl.opengl.GL20;

public class b {
    private static final String a = "#include";
    private static final HashMap<String, A> A;
    private static Object[] b;
    private static Object c;
    private static Object[] C;
    private static Object[] B;
    private static Object[] d;
    public static int[] D;

    public b() {
        super();
    }

    public static void registerShaderLibraries(A ... aArray) {
        long l = 500165505041535495L;
        long l2 = 7785786966440462880L;
        long l3 = 3616152479464475420L;
        A[] aArray2 = aArray;
        long l4 = l2;
        int n = D[0];
        n ^= D[1];
        l2 = l4 ^ ((long)aArray2.length ^ l4) & -1L >>> (n ^= D[2]);
        long l5 = l3;
        int n2 = D[3];
        n2 ^= D[4];
        l3 = l5 ^ (0L ^ l5) & -1L << (n2 -= D[5]);
        while (true) {
            int n3 = D[6];
            n3 -= D[7];
            if ((int)(l3 >>> (n3 -= D[8])) >= (int)l2) break;
            int n4 = D[9];
            n4 -= D[10];
            A a2 = aArray2[(int)(l3 >>> (n4 ^= D[11]))];
            A.put(a2.libraryEntry().name(), a2);
            l3 += 0x100000000L;
        }
    }

    public static void unregisterShaderLibraries(A ... aArray) {
        long l = -8219799151154803350L;
        long l2 = -8892420539580383356L;
        long l3 = 6187156365087793846L;
        A[] aArray2 = aArray;
        long l4 = l2;
        int n = D[12];
        n -= D[13];
        l2 = l4 ^ ((long)aArray2.length ^ l4) & -1L >>> (n -= D[14]);
        long l5 = l3;
        int n2 = D[15];
        n2 += D[16];
        l3 = l5 ^ (0L ^ l5) & -1L << (n2 -= D[17]);
        while (true) {
            int n3 = D[18];
            n3 += D[19];
            if ((int)(l3 >>> (n3 -= D[20])) >= (int)l2) break;
            int n4 = D[21];
            n4 += D[22];
            A a2 = aArray2[(int)(l3 >>> (n4 ^= D[23]))];
            A.remove(a2.libraryEntry().name());
            l3 += 0x100000000L;
        }
    }

    public static void unregisterShaderLibraries(String ... stringArray) {
        long l = 7399580779131609096L;
        long l2 = 8297794643562436186L;
        long l3 = 8574312736428137969L;
        String[] stringArray2 = stringArray;
        long l4 = l2;
        int n = D[24];
        n ^= D[25];
        l2 = l4 ^ ((long)stringArray2.length ^ l4) & -1L >>> (n -= D[26]);
        long l5 = l3;
        int n2 = D[27];
        n2 ^= D[28];
        l3 = l5 ^ (0L ^ l5) & -1L << (n2 ^= D[29]);
        while (true) {
            int n3 = D[30];
            n3 -= D[31];
            if ((int)(l3 >>> (n3 ^= D[32])) >= (int)l2) break;
            int n4 = D[33];
            n4 += D[34];
            String string = stringArray2[(int)(l3 >>> (n4 += D[35]))];
            A.remove(string);
            l3 += 0x100000000L;
        }
    }

    public static A getShaderLibrary(String string) {
        A a2 = A.get(string);
        if (a2 == null) {
            kotakbaz.rain.client.render.main.exceptions.A.printAndExit(new B(string));
        }
        return a2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static kotakbaz.rain.client.render.main.program.A compileProgram(String string2, List<kotakbaz.rain.client.render.main.program.shader.A> list, kotakbaz.rain.client.render.main.program.a_0[] a_0Array, HashMap<String, kotakbaz.rain.client.render.main.program.uniform.a_0<?>> hashMap) {
        long l = 979161007115717378L;
        long l2 = 503013069163505666L;
        long l3 = -7126730702035009085L;
        int n = D[36];
        n -= D[37];
        long l4 = l3;
        int n2 = D[39];
        n2 -= D[40];
        l3 = l4 ^ ((long)GL20.glCreateProgram() << (n += D[38]) ^ l4) & -1L << (n2 ^= D[41]);
        HashMap hashMap2 = new HashMap(hashMap);
        try {
            for (kotakbaz.rain.client.render.main.program.shader.A object2 : list) {
                int n3 = D[42];
                n3 ^= D[43];
                GL20.glAttachShader((int)((int)(l3 >>> (n3 ^= D[44]))), (int)object2.getId());
                object2.getExtraUniforms().forEach((string, a_02) -> {
                    if (hashMap2.containsKey(string)) {
                        kotakbaz.rain.client.render.main.exceptions.A.printAndExit(new c_0((String)string));
                    }
                    hashMap2.put((String)string, (kotakbaz.rain.client.render.main.program.uniform.a_0<?>)a_02);
                });
            }
            int n4 = D[45];
            n4 -= D[46];
            kotakbaz.rain.client.render.main.compile.b.bindKnownAttributeLocations((int)(l3 >>> (n4 += D[47])), string2);
            int n5 = D[48];
            n5 -= D[49];
            GL20.glLinkProgram((int)((int)(l3 >>> (n5 += D[50]))));
            int n6 = D[51];
            n6 -= D[52];
            kotakbaz.rain.client.render.main.program.A a2 = new kotakbaz.rain.client.render.main.program.A(string2, (int)(l3 >>> (n6 -= D[53])), new HashSet<kotakbaz.rain.client.render.main.program.a_0>(Arrays.asList(a_0Array)), hashMap2);
            kotakbaz.rain.client.render.main.program.compile.A a3 = a2.getCompileResult();
            if (a3.isFailure()) {
                a2.close();
                kotakbaz.rain.client.render.main.exceptions.A.printAndExit(new kotakbaz.rain.client.render.main.exceptions.impl.compile.A(string2, a3.message()));
            }
            Object object = a2;
            return object;
        }
        finally {
            list.forEach(kotakbaz.rain.client.render.main.program.shader.A::close);
        }
    }

    private static void bindKnownAttributeLocations(int n, String string) {
        block6: {
            block5: {
                int n2 = D[54];
                n2 += D[55];
                if (((String)b[n2 += D[56]]).equals(string)) {
                    int n3 = D[57];
                    n3 -= D[58];
                    String[] stringArray = new String[n3 -= D[59]];
                    int n4 = D[60];
                    n4 += D[61];
                    int n5 = D[63];
                    n5 += D[64];
                    stringArray[n4 ^= kotakbaz.rain.client.render.main.compile.b.D[62]] = (String)b[n5 += D[65]];
                    int n6 = D[66];
                    n6 -= D[67];
                    int n7 = D[69];
                    n7 -= D[70];
                    stringArray[n6 ^= kotakbaz.rain.client.render.main.compile.b.D[68]] = (String)b[n7 -= D[71]];
                    int n8 = D[72];
                    n8 -= D[73];
                    int n9 = D[75];
                    n9 ^= D[76];
                    stringArray[n8 += kotakbaz.rain.client.render.main.compile.b.D[74]] = (String)b[n9 ^= D[77]];
                    int n10 = D[78];
                    n10 -= D[79];
                    int n11 = D[81];
                    n11 -= D[82];
                    stringArray[n10 -= kotakbaz.rain.client.render.main.compile.b.D[80]] = (String)b[n11 += D[83]];
                    int n12 = D[84];
                    n12 -= D[85];
                    int n13 = D[87];
                    n13 ^= D[88];
                    stringArray[n12 -= kotakbaz.rain.client.render.main.compile.b.D[86]] = (String)b[n13 += D[89]];
                    int n14 = D[90];
                    n14 ^= D[91];
                    int n15 = D[93];
                    n15 += D[94];
                    stringArray[n14 -= kotakbaz.rain.client.render.main.compile.b.D[92]] = (String)b[n15 -= D[95]];
                    int n16 = D[96];
                    n16 += D[97];
                    int n17 = D[99];
                    n17 ^= D[100];
                    stringArray[n16 -= kotakbaz.rain.client.render.main.compile.b.D[98]] = (String)b[n17 ^= D[101]];
                    kotakbaz.rain.client.render.main.compile.b.bindAttributes(n, stringArray);
                    return;
                }
                int n18 = D[102];
                n18 += D[103];
                if (((String)b[n18 ^= D[104]]).equals(string)) {
                    int n19 = D[105];
                    n19 -= D[106];
                    String[] stringArray = new String[n19 += D[107]];
                    int n20 = D[108];
                    n20 += D[109];
                    int n21 = D[111];
                    n21 -= D[112];
                    stringArray[n20 ^= kotakbaz.rain.client.render.main.compile.b.D[110]] = (String)b[n21 ^= D[113]];
                    int n22 = D[114];
                    n22 -= D[115];
                    int n23 = D[117];
                    n23 += D[118];
                    stringArray[n22 += kotakbaz.rain.client.render.main.compile.b.D[116]] = (String)b[n23 ^= D[119]];
                    int n24 = D[120];
                    n24 ^= D[121];
                    int n25 = D[123];
                    n25 -= D[124];
                    stringArray[n24 ^= kotakbaz.rain.client.render.main.compile.b.D[122]] = (String)b[n25 -= D[125]];
                    int n26 = D[126];
                    n26 += D[127];
                    n26 ^= D[128];
                    int n27 = D[129];
                    n27 += D[130];
                    int n28 = D[132];
                    n28 ^= D[133];
                    int n29 = D[135];
                    n29 += D[136];
                    stringArray[n26] = (String)b[n27 ^= D[131]] + (String)b[n28 += D[134]] + (String)b[n29 += D[137]];
                    int n30 = D[138];
                    n30 -= D[139];
                    int n31 = D[141];
                    n31 += D[142];
                    int n32 = D[144];
                    n32 += D[145];
                    stringArray[n30 ^= kotakbaz.rain.client.render.main.compile.b.D[140]] = (String)b[n31 ^= D[143]] + (String)b[n32 += D[146]];
                    int n33 = D[147];
                    n33 -= D[148];
                    int n34 = D[150];
                    n34 -= D[151];
                    stringArray[n33 -= kotakbaz.rain.client.render.main.compile.b.D[149]] = (String)b[n34 ^= D[152]];
                    int n35 = D[153];
                    n35 += D[154];
                    int n36 = D[156];
                    n36 += D[157];
                    stringArray[n35 -= kotakbaz.rain.client.render.main.compile.b.D[155]] = (String)b[n36 += D[158]];
                    int n37 = D[159];
                    n37 ^= D[160];
                    int n38 = D[162];
                    n38 += D[163];
                    stringArray[n37 -= kotakbaz.rain.client.render.main.compile.b.D[161]] = (String)b[n38 ^= D[164]];
                    int n39 = D[165];
                    n39 += D[166];
                    int n40 = D[168];
                    n40 += D[169];
                    stringArray[n39 += kotakbaz.rain.client.render.main.compile.b.D[167]] = (String)b[n40 ^= D[170]];
                    int n41 = D[171];
                    n41 -= D[172];
                    int n42 = D[174];
                    n42 ^= D[175];
                    stringArray[n41 -= kotakbaz.rain.client.render.main.compile.b.D[173]] = (String)b[n42 -= D[176]];
                    int n43 = D[177];
                    n43 += D[178];
                    int n44 = D[180];
                    n44 += D[181];
                    stringArray[n43 -= kotakbaz.rain.client.render.main.compile.b.D[179]] = (String)b[n44 ^= D[182]];
                    int n45 = D[183];
                    n45 += D[184];
                    int n46 = D[186];
                    n46 += D[187];
                    stringArray[n45 ^= kotakbaz.rain.client.render.main.compile.b.D[185]] = (String)b[n46 -= D[188]];
                    int n47 = D[189];
                    n47 ^= D[190];
                    int n48 = D[192];
                    n48 += D[193];
                    stringArray[n47 ^= kotakbaz.rain.client.render.main.compile.b.D[191]] = (String)b[n48 ^= D[194]];
                    int n49 = D[195];
                    n49 += D[196];
                    int n50 = D[198];
                    n50 ^= D[199];
                    stringArray[n49 -= kotakbaz.rain.client.render.main.compile.b.D[197]] = (String)b[n50 ^= D[200]];
                    int n51 = D[201];
                    n51 -= D[202];
                    int n52 = D[204];
                    n52 -= D[205];
                    stringArray[n51 ^= kotakbaz.rain.client.render.main.compile.b.D[203]] = (String)b[n52 -= D[206]];
                    kotakbaz.rain.client.render.main.compile.b.bindAttributes(n, stringArray);
                    return;
                }
                int n53 = D[207];
                n53 -= D[208];
                if (((String)b[n53 -= D[209]]).equals(string)) break block5;
                int n54 = D[210];
                n54 ^= D[211];
                if (!((String)b[n54 ^= D[212]]).equals(string)) break block6;
            }
            int n55 = D[213];
            n55 += D[214];
            String[] stringArray = new String[n55 ^= D[215]];
            int n56 = D[216];
            n56 += D[217];
            int n57 = D[219];
            n57 -= D[220];
            stringArray[n56 += kotakbaz.rain.client.render.main.compile.b.D[218]] = (String)b[n57 -= D[221]];
            kotakbaz.rain.client.render.main.compile.b.bindAttributes(n, stringArray);
        }
    }

    private static void bindAttributes(int n, String[] stringArray) {
        long l;
        long l2 = -2977969396030455128L;
        long l3 = -7148229891010850960L;
        long l4 = l = -8078741170608492689L;
        int n2 = D[222];
        n2 += D[223];
        l = l4 ^ (0L ^ l4) & -1L << (n2 -= D[224]);
        while (true) {
            int n3 = D[225];
            n3 ^= D[226];
            if ((int)(l >>> (n3 ^= D[227])) >= stringArray.length) break;
            int n4 = D[228];
            n4 ^= D[229];
            int n5 = D[231];
            n5 += D[232];
            GL20.glBindAttribLocation((int)n, (int)((int)(l >>> (n4 += D[230]))), (CharSequence)stringArray[(int)(l >>> (n5 -= D[233]))]);
            l += 0x100000000L;
        }
    }

    public static kotakbaz.rain.client.render.main.program.shader.A compileShader(a_0 a_02, kotakbaz.rain.client.render.main.program.shader.a_0 a_03) {
        long l = 5778842428155892524L;
        long l2 = -7405402004968974408L;
        Pair<String, HashMap<String, kotakbaz.rain.client.render.main.program.uniform.a_0<?>>> pair = kotakbaz.rain.client.render.main.compile.b.includeShaderLibraries(a_02.content());
        int n = D[234];
        n -= D[235];
        long l3 = l2;
        int n2 = D[237];
        n2 ^= D[238];
        l2 = l3 ^ ((long)GL20.glCreateShader((int)a_03.d) << (n += D[236]) ^ l3) & -1L << (n2 -= D[239]);
        int n3 = D[240];
        n3 ^= D[241];
        GL20.glShaderSource((int)((int)(l2 >>> (n3 += D[242]))), (CharSequence)pair.getFirst());
        int n4 = D[243];
        n4 ^= D[244];
        GL20.glCompileShader((int)((int)(l2 >>> (n4 += D[245]))));
        int n5 = D[246];
        n5 -= D[247];
        kotakbaz.rain.client.render.main.program.shader.A a2 = new kotakbaz.rain.client.render.main.program.shader.A(a_02.name(), pair.getFirst(), (int)(l2 >>> (n5 -= D[248])), pair.getSecond(), a_03);
        kotakbaz.rain.client.render.main.program.compile.A a3 = a2.getCompileResult();
        if (a3.isFailure()) {
            kotakbaz.rain.client.render.main.exceptions.A.printAndExit(new kotakbaz.rain.client.render.main.exceptions.impl.compile.a_0(a_02.name(), a3.message()));
        }
        return a2;
    }

    public static Pair<String, HashMap<String, kotakbaz.rain.client.render.main.program.uniform.a_0<?>>> includeShaderLibraries(String string2) {
        long l = -1180192672893189568L;
        long l2 = 9159893177371700905L;
        long l3 = 1887563403268152622L;
        long l4 = -7578553596351594908L;
        long l5 = -6196916193072717306L;
        long l6 = -7411972650252381062L;
        long l7 = -6282455413310861321L;
        long l8 = -5210479582078926431L;
        long l9 = 8877068934337204264L;
        long l10 = 6763445749452595365L;
        HashMap hashMap = new HashMap();
        long l11 = l5;
        int n = D[249];
        n ^= D[250];
        long l12 = l5 = l11 ^ (0L ^ l11) & -1L << (n += D[251]);
        int n2 = D[252];
        n2 ^= D[253];
        l5 = l12 ^ (0L ^ l12) & -1L >>> (n2 -= D[254]);
        StringBuilder stringBuilder = new StringBuilder();
        long l13 = l10;
        int n3 = D[255];
        n3 -= D[256];
        l10 = l13 ^ (0L ^ l13) & -1L << (n3 ^= D[257]);
        while (true) {
            int n4 = D[258];
            n4 += D[259];
            if ((int)(l10 >>> (n4 ^= D[260])) >= string2.length()) break;
            int n5 = D[261];
            n5 -= D[262];
            long l14 = l10;
            int n6 = D[264];
            n6 -= D[265];
            l10 = l14 ^ ((long)string2.charAt((int)(l10 >>> (n5 += D[263]))) ^ l14) & -1L >>> (n6 ^= D[266]);
            int n7 = D[267];
            n7 ^= D[268];
            if ((int)(l10 += 0x100000000L) == (n7 += D[269])) {
                int n8 = D[270];
                n8 += D[271];
                stringBuilder = new StringBuilder((String)b[n8 += D[272]]);
                long l15 = l5;
                int n9 = D[273];
                n9 -= D[274];
                l5 = l15 ^ (0x100000000L ^ l15) & -1L << (n9 ^= D[275]);
                continue;
            }
            int n10 = D[276];
            n10 += D[277];
            if ((int)l10 == (n10 -= D[278])) {
                int n11 = D[279];
                n11 += D[280];
                if ((int)(l5 >>> (n11 ^= D[281])) != 0) {
                    long l16 = l5;
                    int n12 = D[282];
                    n12 -= D[283];
                    l5 = l16 ^ (0L ^ l16) & -1L << (n12 ^= D[284]);
                    int n13 = D[285];
                    n13 += D[286];
                    if (stringBuilder.toString().equals((String)b[n13 -= D[287]])) {
                        long l17 = l5;
                        int n14 = D[288];
                        n14 ^= D[289];
                        l5 = l17 ^ (1L ^ l17) & -1L >>> (n14 += D[290]);
                    }
                    stringBuilder = new StringBuilder();
                    continue;
                }
            }
            int n15 = D[291];
            n15 += D[292];
            if ((int)l10 == (n15 -= D[293]) && (int)l5 != 0) {
                long l18 = l5;
                int n16 = D[294];
                n16 -= D[295];
                l5 = l18 ^ (0L ^ l18) & -1L >>> (n16 ^= D[296]);
                A a2 = kotakbaz.rain.client.render.main.compile.b.getShaderLibrary(stringBuilder.toString());
                a2.uniforms().forEach((string, a_02) -> {
                    if (hashMap.containsKey(string)) {
                        kotakbaz.rain.client.render.main.exceptions.A.printAndExit(new c_0((String)string));
                    }
                    hashMap.put(string, a_02);
                });
                int n17 = D[297];
                n17 ^= D[298];
                int n18 = D[300];
                n18 += D[301];
                int n19 = D[303];
                n19 ^= D[304];
                string2 = string2.replace(((String)b[n17 += D[299]]).concat((String)b[n18 -= D[302]]).concat(stringBuilder.toString()).concat((String)b[n19 ^= D[305]]), a2.libraryEntry().content());
                int n20 = D[306];
                n20 -= D[307];
                n20 += D[308];
                int n21 = D[309];
                n21 += D[310];
                n21 ^= D[311];
                int n22 = D[312];
                n22 -= D[313];
                n22 ^= D[314];
                int n23 = D[315];
                n23 ^= D[316];
                n23 ^= D[317];
                int n24 = D[318];
                n24 -= D[319];
                long l19 = l10;
                int n25 = D[321];
                n25 += D[322];
                l10 = l19 ^ ((long)((int)(l10 >>> n20) - ((String)b[n21]).concat((String)b[n22]).concat((String)b[n23]).concat(stringBuilder.toString()).length()) << (n24 ^= D[320]) ^ l19) & -1L << (n25 ^= D[323]);
                stringBuilder = new StringBuilder();
                continue;
            }
            stringBuilder.append((char)l10);
        }
        return new Pair(string2, hashMap);
    }

    static {
        kotakbaz.rain.client.render.main.compile.b.b();
        long l = -7279205846305564728L;
        long l2 = 2624697098217904284L;
        long l3 = -4348490700417427613L;
        long l4 = 159870900606226013L;
        long l5 = 60011754263169911L;
        long l6 = -272710318296860366L;
        long l7 = 262954618820149831L;
        long l8 = 5815789838332907212L;
        long l9 = -4250953086033384722L;
        long l10 = -6612468912745760137L;
        long l11 = 3696590102460072374L;
        long l12 = 2841416940785537934L;
        long l13 = 5186749565554077098L;
        long l14 = 2005086767967012656L;
        int n = D[324];
        n ^= D[325];
        b = new Object[n -= D[326]];
        long l15 = l14;
        int n2 = D[327];
        n2 ^= D[328];
        l14 = l15 ^ (0L ^ l15) & -1L << (n2 ^= D[329]);
        Object[] objectArray = new Object[D[330]];
        objectArray[kotakbaz.rain.client.render.main.compile.b.D[331]] = B;
        objectArray[kotakbaz.rain.client.render.main.compile.b.D[332]] = D[333];
        int n3 = D[334];
        Object object = kotakbaz.rain.client.render.main.compile.b.A()[D[335]];
        if (object == null) {
            char[] cArray = "\ufd41\ufcdf\ufd3c\ufd26\ufd21\ufd4e\ufd3e\ufd1a\ufd51\ufd1b\ufce9\ufcf4\ufce4\ufd3d\ufcea\ufce7\ufd3a\ufcee\ufd41\ufd3b\ufcf0\ufd3c\ufd41\ufd20\ufce9\ufce2\ufd3f\ufcde\ufd4a\ufd47\ufcdd\ufce3\ufcf0\ufd49\ufd51\ufcf0\ufcf4\ufce7\ufd20\ufd4e\ufced\ufce0\ufd47\ufd41\ufd1b\ufd4b\ufd3d\ufd25\ufd1f\ufd50\ufd1d\ufcdf\ufd1f\ufcde\ufd42\ufce7\ufce8\ufce0\ufd47\ufd1a\ufce5\ufcda\ufcee\ufcdb\ufcda\ufd46\ufcee\ufd3a\ufd26\ufd1c\ufd46\ufd3a\ufd4d\ufce7\ufd41\ufd45\ufd49\ufce5\ufcec\ufd1e\ufce5\ufce1\ufd3f\ufd1d\ufce0\ufce3\ufce5\ufcef\ufd40\ufcdd\ufcf1\ufd46\ufcf4\ufd24\ufce3\ufd40\ufceb\ufd4b\ufd1c\ufceb\ufd1d\ufce8\ufce9\ufd3d\ufd25\ufd1d\ufd4b\ufce4\ufd40\ufced\ufd4a\ufd4b\ufce0\ufcdb\ufd4f\ufd49\ufcec\ufce3\ufd47\ufcf4\ufd1b\ufd4a\ufd43\ufd1e\ufd3a\ufd22\ufd45\ufd48\ufcea\ufce6\ufcf0\ufd51\ufcee\ufced\ufce5\ufd21\ufcda\ufd3f\ufd3a\ufce0\ufd1a\ufd49\ufce1\ufce8\ufce4\ufd1b\ufd50\ufd47\ufce1\ufcec\ufce2\ufd3c\ufcf4\ufcda\ufd50\ufd22\ufcef\ufd37\ufd42\ufd50\ufd4b\ufcf0\ufd1e\ufd4f\ufd45\ufce1\ufce6\ufcdb\ufd1a\ufd41\ufd4a\ufd4e\ufd20\ufd37\ufcea\ufd43\ufcf4\ufd1e\ufd44\ufcef\ufd4d\ufd51\ufce0\ufcdd\ufd1e\ufd1d\ufcd4\ufcea\ufce7\ufd4b\ufd22\ufd4b\ufd44\ufd1a\ufd46\ufceb\ufd50\ufce7\ufd4e\ufce1\ufcec\ufd3f\ufce4\ufcdf\ufcd7\ufd1f\ufcdd\ufd51\ufd44\ufd4a\ufd3f\ufd22\ufd4b\ufd46\ufcf1\ufcf1\ufd50\ufd41\ufce2\ufcf1\ufcda\ufce6\ufd40\ufce4\ufd37\ufce0\ufd49\ufd26\ufd51\ufd3e\ufce4\ufce1\ufd4c\ufcda\ufcdb\ufd1f\ufd1c\ufcee\ufce2\ufcdd\ufd21\ufcf4\ufd24\ufd4c\ufcd4\ufd46\ufced\ufd3b\ufce5\ufce0\ufd26\ufd1d\ufd25\ufd4c\ufce1\ufcd4\ufd4f\ufd3a\ufd44\ufd1c\ufd1c\ufd3b\ufcde\ufcef\ufd1e\ufd1c\ufcf1\ufcec\ufcde\ufd1a\ufd4c\ufd50\ufce4\ufcdd\ufd3f\ufd49\ufce9\ufd1f\ufd41\ufce9\ufd26\ufcec\ufd3b\ufce4\ufce4\ufd4d\ufd26\ufcf1\ufd41\ufce6\ufd4b\ufd3f\ufcda\ufd26\ufd3c\ufd4a\ufce1\ufcdf\ufcde\ufd21\ufcd4\ufce3\ufd1e\ufd21\ufce7\ufd3e\ufd21\ufd46\ufce7\ufd1c\ufce9\ufcdb\ufd3c\ufce1\ufd37\ufcf0\ufce3\ufd48\ufd1d\ufcde\ufcdb\ufce9\ufced\ufd48\ufd1d\ufcd7\ufce8\ufd42\ufcdb\ufcde\ufd37\ufcdf\ufcf0\ufd47\ufd37\ufd42\ufcef\ufcee\ufce2\ufd50\ufce9\ufd3f\ufd50\ufd51\ufce7\ufd20\ufd21\ufcde\ufcec\ufcdf\ufcda\ufd50\ufd41\ufcde\ufd3b\ufd3c\ufce3\ufd26\ufd45\ufd43\ufd44\ufce0\ufcd4\ufcd4\ufcef\ufcec\ufcec\ufcdb\ufce7\ufd46\ufd46\ufcf4\ufcd4\ufd1a\ufce9\ufd43\ufce2\ufd22\ufced\ufcda\ufd45\ufcf4\ufd47\ufd3b\ufcdd\ufd1a\ufd4d\ufd1a\ufcf1\ufcf1\ufd4b\ufd26\ufd1b\ufced\ufd1f\ufce5\ufd25\ufd25\ufd1b\ufd42\ufcdd\ufd42\ufce4\ufcd4\ufcec\ufd1b\ufd47\ufcde\ufd1d\ufd26\ufd3b\ufd4e\ufcf0\ufced\ufcee\ufd4c\ufce5\ufce5\ufd41\ufcde\ufd24\ufcef\ufd1e\ufd1b\ufd4c\ufd3a\ufcd7\ufd37\ufd4c\ufce7\ufd44\ufce6\ufd3c\ufd48\ufd3d\ufcdc\ufd21\ufce3\ufd24\ufcdf\ufd3f\ufce0\ufce4\ufce8\ufd3a\ufd25\ufcda\ufce3\ufcf4\ufd42\ufce6\ufd45\ufd43\ufcdf\ufce7\ufd1e\ufd1a\ufd4e\ufd20\ufd26\ufd24\ufd46\ufd1d\ufd49\ufd1e\ufcea\ufd48\ufd3e\ufce7\ufcea\ufd18\ufd18".toCharArray();
            for (int i = D[336]; i < D[337]; ++i) {
                int n4 = cArray[i];
                n4 += D[338];
                n4 -= D[339];
                n4 += D[340];
                n4 -= D[341];
                n4 -= D[342];
                n4 -= D[343];
                n4 -= D[344];
                n4 -= D[345];
                n4 -= D[346];
                n4 ^= D[347];
                n4 ^= D[348];
                n4 -= D[349];
                n4 += D[350];
                n4 += D[351];
                cArray[i] = (char)(n4 ^= D[352]);
            }
            object = kotakbaz.rain.client.render.main.compile.b.A()[kotakbaz.rain.client.render.main.compile.b.D[353]] = new String(cArray);
        }
        objectArray[n3] = (String)object;
        char[] cArray = ((String)kotakbaz.rain.client.render.main.compile.b.a(objectArray)).toCharArray();
        long l16 = l5;
        int n5 = D[354];
        n5 += D[355];
        l5 = l16 ^ (0x14900000000L ^ l16) & -1L << (n5 ^= D[356]);
        long l17 = l12;
        int n6 = D[357];
        n6 -= D[358];
        l12 = l17 ^ (0L ^ l17) & -1L >>> (n6 ^= D[359]);
        while (true) {
            int n7 = D[360];
            n7 -= D[361];
            if ((int)l12 >= (int)(l5 >>> (n7 += D[362]))) break;
            int n8 = (int)l12;
            long l18 = l12;
            int n9 = D[363];
            n9 -= D[364];
            int n10 = D[366];
            n10 ^= D[367];
            l12 = l18 ^ (l18 ^ l18 + (long)(n9 += D[365])) & -1L >>> (n10 -= D[368]);
            long l19 = l8;
            int n11 = D[369];
            n11 -= D[370];
            l8 = l19 ^ ((long)cArray[n8] ^ l19) & -1L >>> (n11 ^= D[371]);
            int n12 = (int)l12;
            long l20 = l12;
            int n13 = D[372];
            n13 -= D[373];
            int n14 = D[375];
            n14 += D[376];
            l12 = l20 ^ (l20 ^ l20 + (long)(n13 += D[374])) & -1L >>> (n14 += D[377]);
            int n15 = D[378];
            n15 += D[379];
            long l21 = l9;
            int n16 = D[381];
            n16 ^= D[382];
            l9 = l21 ^ ((long)cArray[n12] << (n15 ^= D[380]) ^ l21) & -1L << (n16 -= D[383]);
            int n17 = D[384];
            n17 ^= D[385];
            n17 -= D[386];
            int n18 = D[387];
            n18 -= D[388];
            long l22 = l11;
            int n19 = D[390];
            n19 ^= D[391];
            l11 = l22 ^ ((long)((int)l8 << n17 | (int)(l9 >>> (n18 -= D[389]))) ^ l22) & -1L >>> (n19 ^= D[392]);
            char[] cArray2 = new char[(int)l11];
            long l23 = l13;
            int n20 = D[393];
            n20 ^= D[394];
            l13 = l23 ^ (0L ^ l23) & -1L << (n20 += D[395]);
            while (true) {
                int n21 = D[396];
                n21 ^= D[397];
                if ((int)(l13 >>> (n21 ^= D[398])) >= (int)l11) break;
                int n22 = D[399];
                n22 -= -2;
                int n23 = -37;
                n23 -= 21;
                cArray2[(int)(l13 >>> (n22 -= -42))] = cArray[(int)l12 + (int)(l13 >>> (n23 += 90))];
                l13 += 0x100000000L;
            }
            int n24 = -59;
            n24 ^= 0x33;
            int n25 = (int)(l14 >>> (n24 -= -42));
            l14 += 0x100000000L;
            kotakbaz.rain.client.render.main.compile.b.b[n25] = new String(cArray2);
            long l24 = l12;
            int n26 = 13;
            n26 ^= 0x25;
            l12 = l24 ^ ((long)((int)l12 + (int)l11) ^ l24) & -1L >>> (n26 += -8);
        }
        A = new HashMap();
    }

    public static Object a(Object[] object) {
        Object object2;
        int n = (Integer)object[1];
        String string = (String)object[2];
        object = object[0];
        Object[] objectArray = C;
        if (C == null) {
            objectArray = C = new Object[1];
        }
        if ((object2 = objectArray[n]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[1];
                B = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[0x4194 ^ 0x4184];
                byArray[0xDE6E ^ 0xDE63] = 0xDE4B ^ 0xDE63;
                byArray[0x5AEE ^ 0x5AE4] = 0x5AF4 ^ 0x5AE4;
                byArray[0xFB8C ^ 0xFB88] = 0xFFFF047D ^ 0xFB88;
                byArray[0xF5E2 ^ 0xF5E3] = 0xF598 ^ 0xF5E3;
                byArray[0x1D63 ^ 0x1D6B] = 0x1D3B ^ 0x1D6B;
                byArray[0x6C3F ^ 0x6C3D] = 0xFFFF93F8 ^ 0x6C3D;
                byArray[0x58BD ^ 0x58B3] = 0xFFFFA716 ^ 0x58B3;
                byArray[0xC7F8 ^ 0xC7F1] = 0xFFFF3814 ^ 0xC7F1;
                byArray[0xDD65 ^ 0xDD60] = 0xDD08 ^ 0xDD60;
                byArray[0xE0EA ^ 0xE0EA] = 0xFFFF1F5C ^ 0xE0EA;
                byArray[0xEBD3 ^ 0xEBD5] = 0xFFFF1405 ^ 0xEBD5;
                byArray[0x50D6 ^ 0x50D9] = 0x5092 ^ 0x50D9;
                byArray[0x8E42 ^ 0x8E41] = 0xFFFF71A1 ^ 0x8E41;
                byArray[0xE02B ^ 0xE027] = 0xFFFF1FE7 ^ 0xE027;
                byArray[0x8451 ^ 0x8456] = 0xFFFF7BAA ^ 0x8456;
                byArray[0xB7DF ^ 0xB7D4] = 0xB7E9 ^ 0xB7D4;
                objectArray2[0] = byArray;
            }
            byte[] byArray = (byte[])object3[0];
            if (c == null) {
                byte[] byArray2 = new byte[0xE5E6 ^ 0xE5C6];
                byArray2[0x3936 ^ 0x3937] = 0x393A ^ 0x3937;
                byArray2[0xA081 ^ 0xA08F] = 0xA0C1 ^ 0xA08F;
                byArray2[0xB71F ^ 0xB71F] = 0xB72F ^ 0xB71F;
                byArray2[0xF567 ^ 0xF578] = 0xFFFF0A9F ^ 0xF578;
                byArray2[0xD10C ^ 0xD103] = 0xFFFF2EA0 ^ 0xD103;
                byArray2[0xF83F ^ 0xF823] = 0xF834 ^ 0xF823;
                byArray2[0x5BB5 ^ 0x5BA7] = 0xFFFFA403 ^ 0x5BA7;
                byArray2[0x854A ^ 0x854E] = 0xFFFF7A96 ^ 0x854E;
                byArray2[0xD54F ^ 0xD54C] = 0xFFFF2AB4 ^ 0xD54C;
                byArray2[0x5D0 ^ 0x5C7] = 0xFFFFFA08 ^ 0x5C7;
                byArray2[0xA2E6 ^ 0xA2E1] = 0xFFFF5D37 ^ 0xA2E1;
                byArray2[0x3880 ^ 0x389E] = 0x38DB ^ 0x389E;
                byArray2[0x156A ^ 0x1579] = 0xFFFFEADA ^ 0x1579;
                byArray2[0x10205 ^ 0x10215] = 0xFFFEFDA1 ^ 0x10215;
                byArray2[0x805F ^ 0x805D] = 0x8007 ^ 0x805D;
                byArray2[0xD522 ^ 0xD52B] = 0xD53A ^ 0xD52B;
                byArray2[0xA62 ^ 0xA76] = 0xFFFFF5D2 ^ 0xA76;
                byArray2[0x925C ^ 0x9251] = 0xFFFF6DC6 ^ 0x9251;
                byArray2[0x1047B ^ 0x10461] = 0x10417 ^ 0x10461;
                byArray2[0x1C6F ^ 0x1C67] = 0xFFFFE3B0 ^ 0x1C67;
                byArray2[0x6973 ^ 0x696B] = 0xFFFF96E7 ^ 0x696B;
                byArray2[0x106B5 ^ 0x106AE] = 0x106CE ^ 0x106AE;
                byArray2[0x10AED ^ 0x10AFB] = 0xFFFEF539 ^ 0x10AFB;
                byArray2[0xEC91 ^ 0xEC9B] = 0xFFFF133C ^ 0xEC9B;
                byArray2[0x388F ^ 0x3892] = 0xFFFFC71D ^ 0x3892;
                byArray2[0x8F76 ^ 0x8F7A] = 0x8F01 ^ 0x8F7A;
                byArray2[0x21E4 ^ 0x21EF] = 0xFFFFDE03 ^ 0x21EF;
                byArray2[0x386F ^ 0x3876] = 0x3872 ^ 0x3876;
                byArray2[0x47BE ^ 0x47AF] = 0xFFFFB825 ^ 0x47AF;
                byArray2[0x29BC ^ 0x29A9] = 0x29AD ^ 0x29A9;
                byArray2[0x2847 ^ 0x2842] = 0xFFFFD7AE ^ 0x2842;
                byArray2[0x4EC3 ^ 0x4EC5] = 0xFFFFB165 ^ 0x4EC5;
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, 0, byArray3, 0, byArray.length);
                System.arraycopy(byArray2, 0, byArray3, byArray.length, byArray2.length);
                Object object4 = kotakbaz.rain.client.render.main.compile.b.A()[1];
                if (object4 == null) {
                    char[] cArray = "\u420c\u41fa\u420d\u41f8\u41f6\u41ca\u4361\u4397\u4308\u4394\u41f4\u4393\u433f\u4395\u4365\u41f4\u421f\u436f".toCharArray();
                    for (int i = 0; i < 18; ++i) {
                        int n2 = cArray[i];
                        n2 -= 13744;
                        n2 ^= 0xD0D2;
                        n2 += 50402;
                        n2 += 5779;
                        n2 ^= 0x4894;
                        n2 += 35095;
                        n2 -= 48775;
                        n2 ^= 0x3427;
                        n2 -= 28137;
                        n2 -= 16620;
                        n2 -= 60413;
                        cArray[i] = (char)(n2 ^= 0xF47E);
                    }
                    object4 = kotakbaz.rain.client.render.main.compile.b.A()[1] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[16];
                byArray4[11] = -32;
                byArray4[13] = -1;
                byArray4[6] = -57;
                byArray4[15] = 96;
                byArray4[12] = -115;
                byArray4[9] = -53;
                byArray4[0] = 112;
                byArray4[4] = 58;
                byArray4[8] = -33;
                byArray4[7] = 88;
                byArray4[10] = -76;
                byArray4[5] = -73;
                byArray4[14] = 27;
                byArray4[2] = -107;
                byArray4[3] = 61;
                byArray4[1] = 100;
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, 2, 256);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = kotakbaz.rain.client.render.main.compile.b.A()[2];
                if (object5 == null) {
                    char[] cArray = "\u4501\u4505\u440f".toCharArray();
                    for (int i = 0; i < 3; ++i) {
                        int n3 = cArray[i];
                        n3 -= 27173;
                        n3 -= 17989;
                        n3 += 57480;
                        n3 -= 56620;
                        n3 ^= 0x2BEC;
                        n3 += 60173;
                        n3 ^= 0xD7AE;
                        n3 += 14351;
                        n3 ^= 0xA3F0;
                        n3 ^= 0x2E10;
                        n3 += 61814;
                        n3 += 56534;
                        cArray[i] = (char)(n3 -= 62332);
                    }
                    object5 = kotakbaz.rain.client.render.main.compile.b.A()[2] = new String(cArray);
                }
                c = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, 0, 16);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, 16, byArray6.length);
            Object object6 = kotakbaz.rain.client.render.main.compile.b.A()[3];
            if (object6 == null) {
                char[] cArray = "\ucce7\ucceb\ucc05\ucce1\uccf5\uccf6\uccf5\ucce1\ucc00\ucced\uccf5\ucc05\uccdb\ucc00\ucc07\ucc14\ucc14\ucc1f\ucc22\ucc09".toCharArray();
                for (int i = 0; i < 20; ++i) {
                    int n4 = cArray[i];
                    n4 += 32144;
                    n4 -= 42560;
                    n4 -= 15559;
                    n4 ^= 0x4677;
                    n4 += 55080;
                    n4 -= 43899;
                    n4 += 30716;
                    n4 ^= 0xDFC;
                    n4 -= 39837;
                    cArray[i] = (char)(n4 -= 11630);
                }
                object6 = kotakbaz.rain.client.render.main.compile.b.A()[3] = new String(cArray);
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
        D = new int[0x4B8 ^ 0x528];
        kotakbaz.rain.client.render.main.compile.b.D[0xDAC8 ^ 0xDAF5] = 0xFFFF253A ^ 0xDAF5;
        kotakbaz.rain.client.render.main.compile.b.D[0xD25 ^ 0xC68] = 0xC68 ^ 0xC68;
        kotakbaz.rain.client.render.main.compile.b.D[0xA887 ^ 0xA874] = 0xFFFF57E9 ^ 0xA874;
        kotakbaz.rain.client.render.main.compile.b.D[0xE62D ^ 0xE759] = 0xFFFF18B2 ^ 0xE759;
        kotakbaz.rain.client.render.main.compile.b.D[0x7FA1 ^ 0x7F56] = 0x7F4C ^ 0x7F56;
        kotakbaz.rain.client.render.main.compile.b.D[0x4E7A ^ 0x4E19] = 0xFFFFB1C3 ^ 0x4E19;
        kotakbaz.rain.client.render.main.compile.b.D[0xA3E4 ^ 0xA30F] = 0xA33A ^ 0xA30F;
        kotakbaz.rain.client.render.main.compile.b.D[0x6626 ^ 0x66DB] = 0x66C2 ^ 0x66DB;
        kotakbaz.rain.client.render.main.compile.b.D[0xBD0B ^ 0xBD55] = 0xBD76 ^ 0xBD55;
        kotakbaz.rain.client.render.main.compile.b.D[0xB3D1 ^ 0xB385] = 0xFFFF4CB4 ^ 0xB385;
        kotakbaz.rain.client.render.main.compile.b.D[0x10C8 ^ 0x11E8] = 0xFFFFEE55 ^ 0x11E8;
        kotakbaz.rain.client.render.main.compile.b.D[0x922B ^ 0x9371] = 0x71A0 ^ 0x9371;
        kotakbaz.rain.client.render.main.compile.b.D[0x42C9 ^ 0x42DC] = 0xFFFFBD78 ^ 0x42DC;
        kotakbaz.rain.client.render.main.compile.b.D[0xB17D ^ 0xB01A] = 0xFFFF4FC7 ^ 0xB01A;
        kotakbaz.rain.client.render.main.compile.b.D[0xB67 ^ 0xB8F] = 0xBB7 ^ 0xB8F;
        kotakbaz.rain.client.render.main.compile.b.D[0xADDB ^ 0xAD20] = 0xAD26 ^ 0xAD20;
        kotakbaz.rain.client.render.main.compile.b.D[0x4741 ^ 0x4705] = 0x475A ^ 0x4705;
        kotakbaz.rain.client.render.main.compile.b.D[0x1986 ^ 0x1948] = 0x194F ^ 0x1948;
        kotakbaz.rain.client.render.main.compile.b.D[0xE408 ^ 0xE45A] = 0xE46E ^ 0xE45A;
        kotakbaz.rain.client.render.main.compile.b.D[0x5F41 ^ 0x5F09] = 0xFFFFA0E8 ^ 0x5F09;
        kotakbaz.rain.client.render.main.compile.b.D[0x10D7D ^ 0x10D97] = 0xFFFEF26E ^ 0x10D97;
        kotakbaz.rain.client.render.main.compile.b.D[0x5258 ^ 0x5369] = 0x5327 ^ 0x5369;
        kotakbaz.rain.client.render.main.compile.b.D[0xF017 ^ 0xF003] = 0xF03F ^ 0xF003;
        kotakbaz.rain.client.render.main.compile.b.D[0xFDB5 ^ 0xFCA5] = 0xFFFF0358 ^ 0xFCA5;
        kotakbaz.rain.client.render.main.compile.b.D[0xEE0 ^ 0xF6C] = 0xF50 ^ 0xF6C;
        kotakbaz.rain.client.render.main.compile.b.D[0x929 ^ 0x975] = 0xFFFFF692 ^ 0x975;
        kotakbaz.rain.client.render.main.compile.b.D[0x10920 ^ 0x1086B] = 0x1086B ^ 0x1086B;
        kotakbaz.rain.client.render.main.compile.b.D[0xB346 ^ 0xB383] = 0xB3AC ^ 0xB383;
        kotakbaz.rain.client.render.main.compile.b.D[0x6278 ^ 0x6219] = 0xFFFF9DC4 ^ 0x6219;
        kotakbaz.rain.client.render.main.compile.b.D[0x469B ^ 0x4652] = 0x4663 ^ 0x4652;
        kotakbaz.rain.client.render.main.compile.b.D[0x130F ^ 0x13E9] = 0xFFFFEC15 ^ 0x13E9;
        kotakbaz.rain.client.render.main.compile.b.D[0x9A92 ^ 0x9AE5] = 0xFFFF6567 ^ 0x9AE5;
        kotakbaz.rain.client.render.main.compile.b.D[0x791B ^ 0x7890] = 0xFFFF8712 ^ 0x7890;
        kotakbaz.rain.client.render.main.compile.b.D[0xC4B4 ^ 0xC439] = 0xFFFF3BAC ^ 0xC439;
        kotakbaz.rain.client.render.main.compile.b.D[0xD64B ^ 0xD654] = 0xD666 ^ 0xD654;
        kotakbaz.rain.client.render.main.compile.b.D[0x10267 ^ 0x10242] = 0x10223 ^ 0x10242;
        kotakbaz.rain.client.render.main.compile.b.D[0xFA52 ^ 0xFA20] = 0xFFFF0543 ^ 0xFA20;
        kotakbaz.rain.client.render.main.compile.b.D[0x102EE ^ 0x1024A] = 0xFFFEFD92 ^ 0x1024A;
        kotakbaz.rain.client.render.main.compile.b.D[0xEB6B ^ 0xEA4F] = 0xEA36 ^ 0xEA4F;
        kotakbaz.rain.client.render.main.compile.b.D[0x1E9E ^ 0x1E3D] = 0xFFFFE1D2 ^ 0x1E3D;
        kotakbaz.rain.client.render.main.compile.b.D[0xAE2 ^ 0xA69] = 0xFFFFF59C ^ 0xA69;
        kotakbaz.rain.client.render.main.compile.b.D[0xC927 ^ 0xC93A] = 0xC90D ^ 0xC93A;
        kotakbaz.rain.client.render.main.compile.b.D[0x2F7E ^ 0x2E41] = 0xFFFFD19C ^ 0x2E41;
        kotakbaz.rain.client.render.main.compile.b.D[0x860D ^ 0x871E] = 0xFFFF78FF ^ 0x871E;
        kotakbaz.rain.client.render.main.compile.b.D[0x9B67 ^ 0x9B5F] = 0x9B78 ^ 0x9B5F;
        kotakbaz.rain.client.render.main.compile.b.D[0x786D ^ 0x7912] = 0xFFFF86C5 ^ 0x7912;
        kotakbaz.rain.client.render.main.compile.b.D[0x677F ^ 0x67E3] = 0x67D3 ^ 0x67E3;
        kotakbaz.rain.client.render.main.compile.b.D[0x1F4E ^ 0x1F58] = 0x1F09 ^ 0x1F58;
        kotakbaz.rain.client.render.main.compile.b.D[0x11FB ^ 0x1138] = 0x1189 ^ 0x1138;
        kotakbaz.rain.client.render.main.compile.b.D[0xAC67 ^ 0xAD1F] = 0xAD4D ^ 0xAD1F;
        kotakbaz.rain.client.render.main.compile.b.D[0xD869 ^ 0xD8FE] = 0xFFFF2708 ^ 0xD8FE;
        kotakbaz.rain.client.render.main.compile.b.D[0xE33B ^ 0xE364] = 0xFFFF1CFD ^ 0xE364;
        kotakbaz.rain.client.render.main.compile.b.D[0x8752 ^ 0x8661] = 0x8623 ^ 0x8661;
        kotakbaz.rain.client.render.main.compile.b.D[0xE88B ^ 0xE868] = 0xFFFF17D6 ^ 0xE868;
        kotakbaz.rain.client.render.main.compile.b.D[0x383C ^ 0x3936] = 0x3962 ^ 0x3936;
        kotakbaz.rain.client.render.main.compile.b.D[0xE5E8 ^ 0xE4D0] = 0xE4C8 ^ 0xE4D0;
        kotakbaz.rain.client.render.main.compile.b.D[0x95A0 ^ 0x95E3] = 0x959B ^ 0x95E3;
        kotakbaz.rain.client.render.main.compile.b.D[0x5582 ^ 0x5587] = 0x559E ^ 0x5587;
        kotakbaz.rain.client.render.main.compile.b.D[0x1981 ^ 0x19AF] = 0x19EC ^ 0x19AF;
        kotakbaz.rain.client.render.main.compile.b.D[0xFF0B ^ 0xFF64] = 0xFFFF008D ^ 0xFF64;
        kotakbaz.rain.client.render.main.compile.b.D[0x1E2 ^ 0xFF] = 0xCB ^ 0xFF;
        kotakbaz.rain.client.render.main.compile.b.D[0x98F5 ^ 0x99F8] = 0xFFFF6623 ^ 0x99F8;
        kotakbaz.rain.client.render.main.compile.b.D[0xCD44 ^ 0xCD3E] = 0xCD54 ^ 0xCD3E;
        kotakbaz.rain.client.render.main.compile.b.D[0xE1CB ^ 0xE19C] = 0xFFFF1E6A ^ 0xE19C;
        kotakbaz.rain.client.render.main.compile.b.D[0xF897 ^ 0xF9CF] = 0xC2BF ^ 0xF9CF;
        kotakbaz.rain.client.render.main.compile.b.D[0x381E ^ 0x3837] = 0x386A ^ 0x3837;
        kotakbaz.rain.client.render.main.compile.b.D[0x3F57 ^ 0x3E3E] = 0x3E67 ^ 0x3E3E;
        kotakbaz.rain.client.render.main.compile.b.D[0x618F ^ 0x6124] = 0xFFFF9E8F ^ 0x6124;
        kotakbaz.rain.client.render.main.compile.b.D[0x262A ^ 0x274F] = 0xFFFFD8D3 ^ 0x274F;
        kotakbaz.rain.client.render.main.compile.b.D[0x10F31 ^ 0x10F05] = 0x10F76 ^ 0x10F05;
        kotakbaz.rain.client.render.main.compile.b.D[0xED06 ^ 0xED9D] = 0xFFFF122E ^ 0xED9D;
        kotakbaz.rain.client.render.main.compile.b.D[0x2DE7 ^ 0x2C6A] = 0xFFFFD3B1 ^ 0x2C6A;
        kotakbaz.rain.client.render.main.compile.b.D[0x675C ^ 0x6621] = 0xFFFF99D5 ^ 0x6621;
        kotakbaz.rain.client.render.main.compile.b.D[0xE820 ^ 0xE922] = 0xFFFF16D5 ^ 0xE922;
        kotakbaz.rain.client.render.main.compile.b.D[0xB72F ^ 0xB79C] = 0xB7A5 ^ 0xB79C;
        kotakbaz.rain.client.render.main.compile.b.D[0x10B3B ^ 0x10A71] = 0x10A72 ^ 0x10A71;
        kotakbaz.rain.client.render.main.compile.b.D[0x59AB ^ 0x598C] = 0x59ED ^ 0x598C;
        kotakbaz.rain.client.render.main.compile.b.D[0xA602 ^ 0xA659] = 0xFFFF59D4 ^ 0xA659;
        kotakbaz.rain.client.render.main.compile.b.D[0x6852 ^ 0x68DB] = 0x68F3 ^ 0x68DB;
        kotakbaz.rain.client.render.main.compile.b.D[0xD6FF ^ 0xD6F9] = 0xD6DF ^ 0xD6F9;
        kotakbaz.rain.client.render.main.compile.b.D[0x6E6 ^ 0x65B] = 0x614 ^ 0x65B;
        kotakbaz.rain.client.render.main.compile.b.D[0x10907 ^ 0x109B5] = 0xFFFEF63C ^ 0x109B5;
        kotakbaz.rain.client.render.main.compile.b.D[0xB834 ^ 0xB93A] = 0xB943 ^ 0xB93A;
        kotakbaz.rain.client.render.main.compile.b.D[0x10455 ^ 0x105D2] = 0x105C5 ^ 0x105D2;
        kotakbaz.rain.client.render.main.compile.b.D[0x31D ^ 0x241] = 0xED77 ^ 0x241;
        kotakbaz.rain.client.render.main.compile.b.D[0x5821 ^ 0x59A1] = 0x59AA ^ 0x59A1;
        kotakbaz.rain.client.render.main.compile.b.D[0x9996 ^ 0x99B7] = 0x99C0 ^ 0x99B7;
        kotakbaz.rain.client.render.main.compile.b.D[0xAA24 ^ 0xAA92] = 0xAACA ^ 0xAA92;
        kotakbaz.rain.client.render.main.compile.b.D[0x9531 ^ 0x9585] = 0x95FC ^ 0x9585;
        kotakbaz.rain.client.render.main.compile.b.D[0x2F5D ^ 0x2F4C] = 0x2F32 ^ 0x2F4C;
        kotakbaz.rain.client.render.main.compile.b.D[0x526C ^ 0x52BE] = 0xFFFFAD2C ^ 0x52BE;
        kotakbaz.rain.client.render.main.compile.b.D[0x1072F ^ 0x107C1] = 0xFFFEF876 ^ 0x107C1;
        kotakbaz.rain.client.render.main.compile.b.D[0x5117 ^ 0x513F] = 0xFFFFAEDB ^ 0x513F;
        kotakbaz.rain.client.render.main.compile.b.D[0xDCA5 ^ 0xDC10] = 0xFFFF23DD ^ 0xDC10;
        kotakbaz.rain.client.render.main.compile.b.D[0x661C ^ 0x679D] = 0x678F ^ 0x679D;
        kotakbaz.rain.client.render.main.compile.b.D[0x23CB ^ 0x22B7] = 0xFFFFDD0E ^ 0x22B7;
        kotakbaz.rain.client.render.main.compile.b.D[0x6863 ^ 0x6901] = 0x6913 ^ 0x6901;
        kotakbaz.rain.client.render.main.compile.b.D[0x7B0F ^ 0x7B90] = 0x7B85 ^ 0x7B90;
        kotakbaz.rain.client.render.main.compile.b.D[0xDF ^ 0x2B] = 0xFFFFFFA3 ^ 0x2B;
        kotakbaz.rain.client.render.main.compile.b.D[0x10BFF ^ 0x10A75] = 0xFFFEF5AE ^ 0x10A75;
        kotakbaz.rain.client.render.main.compile.b.D[0xA09A ^ 0xA09A] = 0xFFFF5F6C ^ 0xA09A;
        kotakbaz.rain.client.render.main.compile.b.D[0x6F96 ^ 0x6FA0] = 0xFFFF90C9 ^ 0x6FA0;
        kotakbaz.rain.client.render.main.compile.b.D[0xFD92 ^ 0xFD72] = 0xFFFF02FE ^ 0xFD72;
        kotakbaz.rain.client.render.main.compile.b.D[0x64FA ^ 0x6596] = 0xFFFF9A4A ^ 0x6596;
        kotakbaz.rain.client.render.main.compile.b.D[0x1045A ^ 0x10579] = 0xFFFEFA2C ^ 0x10579;
        kotakbaz.rain.client.render.main.compile.b.D[0x5660 ^ 0x5745] = 0xFFFFA8D5 ^ 0x5745;
        kotakbaz.rain.client.render.main.compile.b.D[0x54CF ^ 0x55C0] = 0xFFFFAA5E ^ 0x55C0;
        kotakbaz.rain.client.render.main.compile.b.D[0x7D02 ^ 0x7C03] = 0x7C2C ^ 0x7C03;
        kotakbaz.rain.client.render.main.compile.b.D[0x438A ^ 0x43C3] = 0xFFFFBC29 ^ 0x43C3;
        kotakbaz.rain.client.render.main.compile.b.D[0x7102 ^ 0x71C0] = 0xFFFF8E36 ^ 0x71C0;
        kotakbaz.rain.client.render.main.compile.b.D[0x3928 ^ 0x3823] = 0xFFFFC7F4 ^ 0x3823;
        kotakbaz.rain.client.render.main.compile.b.D[0x9E65 ^ 0x9E0D] = 0xFFFF61BA ^ 0x9E0D;
        kotakbaz.rain.client.render.main.compile.b.D[0xAC55 ^ 0xAC5D] = 0xAC23 ^ 0xAC5D;
        kotakbaz.rain.client.render.main.compile.b.D[0xD126 ^ 0xD03F] = 0xD070 ^ 0xD03F;
        kotakbaz.rain.client.render.main.compile.b.D[0x5FEB ^ 0x5FF1] = 0x5FAF ^ 0x5FF1;
        kotakbaz.rain.client.render.main.compile.b.D[0x7A2B ^ 0x7A17] = 0xFFFF85AC ^ 0x7A17;
        kotakbaz.rain.client.render.main.compile.b.D[0x10609 ^ 0x10649] = 0x10650 ^ 0x10649;
        kotakbaz.rain.client.render.main.compile.b.D[0x5A30 ^ 0x5ADF] = 0xFFFFA569 ^ 0x5ADF;
        kotakbaz.rain.client.render.main.compile.b.D[0xC369 ^ 0xC26D] = 0xC274 ^ 0xC26D;
        kotakbaz.rain.client.render.main.compile.b.D[0x5AFF ^ 0x5BA2] = 0x8675 ^ 0x5BA2;
        kotakbaz.rain.client.render.main.compile.b.D[0xA3BC ^ 0xA3E9] = 0xFFFF5C6E ^ 0xA3E9;
        kotakbaz.rain.client.render.main.compile.b.D[0x24B6 ^ 0x2538] = 0xFFFFDAFF ^ 0x2538;
        kotakbaz.rain.client.render.main.compile.b.D[0xB9B1 ^ 0xB906] = 0xFFFF46A1 ^ 0xB906;
        kotakbaz.rain.client.render.main.compile.b.D[0x3DF ^ 0x289] = 0xABE4 ^ 0x289;
        kotakbaz.rain.client.render.main.compile.b.D[0xDC9C ^ 0xDD13] = 0xFFFF22E7 ^ 0xDD13;
        kotakbaz.rain.client.render.main.compile.b.D[0x73F ^ 0x64D] = 0x67B ^ 0x64D;
        kotakbaz.rain.client.render.main.compile.b.D[0xC651 ^ 0xC76A] = 0xFFFF38AA ^ 0xC76A;
        kotakbaz.rain.client.render.main.compile.b.D[0xA0A3 ^ 0xA1C2] = 0xA1C2 ^ 0xA1C2;
        kotakbaz.rain.client.render.main.compile.b.D[0x7F75 ^ 0x7FE4] = 0x7FC9 ^ 0x7FE4;
        kotakbaz.rain.client.render.main.compile.b.D[0x3B02 ^ 0x3B38] = 0xFFFFC4A6 ^ 0x3B38;
        kotakbaz.rain.client.render.main.compile.b.D[0xDD60 ^ 0xDDE3] = 0xDDC1 ^ 0xDDE3;
        kotakbaz.rain.client.render.main.compile.b.D[0x817E ^ 0x81A9] = 0x81C3 ^ 0x81A9;
        kotakbaz.rain.client.render.main.compile.b.D[0x77C2 ^ 0x7646] = 0xFFFF89F5 ^ 0x7646;
        kotakbaz.rain.client.render.main.compile.b.D[0xFDCB ^ 0xFCB1] = 0xFFFF030B ^ 0xFCB1;
        kotakbaz.rain.client.render.main.compile.b.D[0x271F ^ 0x270F] = 0x2732 ^ 0x270F;
        kotakbaz.rain.client.render.main.compile.b.D[0xE549 ^ 0xE5E3] = 0xE5DF ^ 0xE5E3;
        kotakbaz.rain.client.render.main.compile.b.D[0x794F ^ 0x7985] = 0x79E7 ^ 0x7985;
        kotakbaz.rain.client.render.main.compile.b.D[0x41B4 ^ 0x4170] = 0xFFFFBEFB ^ 0x4170;
        kotakbaz.rain.client.render.main.compile.b.D[0x8AC2 ^ 0x8A7B] = 0x8A61 ^ 0x8A7B;
        kotakbaz.rain.client.render.main.compile.b.D[0x67AA ^ 0x66AF] = 0xFFFF9932 ^ 0x66AF;
        kotakbaz.rain.client.render.main.compile.b.D[0x61F3 ^ 0x6125] = 0xFFFF9EDB ^ 0x6125;
        kotakbaz.rain.client.render.main.compile.b.D[0x9730 ^ 0x9737] = 0xFFFF68BF ^ 0x9737;
        kotakbaz.rain.client.render.main.compile.b.D[0xCE3 ^ 0xC62] = 0xCE1 ^ 0xC62;
        kotakbaz.rain.client.render.main.compile.b.D[0x6C7E ^ 0x6C81] = 0x6CEF ^ 0x6C81;
        kotakbaz.rain.client.render.main.compile.b.D[0x55D4 ^ 0x55E3] = 0x5596 ^ 0x55E3;
        kotakbaz.rain.client.render.main.compile.b.D[0x3F9D ^ 0x3F2C] = 0x3F96 ^ 0x3F2C;
        kotakbaz.rain.client.render.main.compile.b.D[0xF042 ^ 0xF079] = 0xFFFF0F8B ^ 0xF079;
        kotakbaz.rain.client.render.main.compile.b.D[0xC566 ^ 0xC5E6] = 0xFFFF3A3A ^ 0xC5E6;
        kotakbaz.rain.client.render.main.compile.b.D[0xFCA7 ^ 0xFDB0] = 0xFD20 ^ 0xFDB0;
        kotakbaz.rain.client.render.main.compile.b.D[0x6DE6 ^ 0x6D6C] = 0x6D08 ^ 0x6D6C;
        kotakbaz.rain.client.render.main.compile.b.D[0x1A95 ^ 0x1BCB] = 0xFF2 ^ 0x1BCB;
        kotakbaz.rain.client.render.main.compile.b.D[0x6BD2 ^ 0x6B14] = 0xFFFF94D0 ^ 0x6B14;
        kotakbaz.rain.client.render.main.compile.b.D[0xCF5B ^ 0xCE6C] = 0xCE62 ^ 0xCE6C;
        kotakbaz.rain.client.render.main.compile.b.D[0xB65F ^ 0xB638] = 0xFFFF49E0 ^ 0xB638;
        kotakbaz.rain.client.render.main.compile.b.D[0xFFF3 ^ 0xFF85] = 0xFFFF001A ^ 0xFF85;
        kotakbaz.rain.client.render.main.compile.b.D[0x9898 ^ 0x98B2] = 0xFFFF6700 ^ 0x98B2;
        kotakbaz.rain.client.render.main.compile.b.D[0x6CC3 ^ 0x6C6F] = 0xFFFF93DD ^ 0x6C6F;
        kotakbaz.rain.client.render.main.compile.b.D[0x7C4E ^ 0x7D68] = 0xFFFF82C0 ^ 0x7D68;
        kotakbaz.rain.client.render.main.compile.b.D[0xE2C3 ^ 0xE38A] = 0xFFFF1C70 ^ 0xE38A;
        kotakbaz.rain.client.render.main.compile.b.D[0xBAB5 ^ 0xBBAB] = 0xFFFF4443 ^ 0xBBAB;
        kotakbaz.rain.client.render.main.compile.b.D[0xDB06 ^ 0xDA2C] = 0xDA2C ^ 0xDA2C;
        kotakbaz.rain.client.render.main.compile.b.D[0x574D ^ 0x5733] = 0xFFFFA85C ^ 0x5733;
        kotakbaz.rain.client.render.main.compile.b.D[0x1116 ^ 0x1119] = 0x1178 ^ 0x1119;
        kotakbaz.rain.client.render.main.compile.b.D[0x20D8 ^ 0x203F] = 0x201D ^ 0x203F;
        kotakbaz.rain.client.render.main.compile.b.D[0xCB06 ^ 0xCBDE] = 0xCB87 ^ 0xCBDE;
        kotakbaz.rain.client.render.main.compile.b.D[0xE765 ^ 0xE7E1] = 0xE7F0 ^ 0xE7E1;
        kotakbaz.rain.client.render.main.compile.b.D[0xFACD ^ 0xFBC5] = 0xFBF7 ^ 0xFBC5;
        kotakbaz.rain.client.render.main.compile.b.D[0x1660 ^ 0x16E6] = 0xFFFFE93A ^ 0x16E6;
        kotakbaz.rain.client.render.main.compile.b.D[0xD619 ^ 0xD66C] = 0xFFFF2985 ^ 0xD66C;
        kotakbaz.rain.client.render.main.compile.b.D[0x1E59 ^ 0x1F70] = 0xFFFFE0C7 ^ 0x1F70;
        kotakbaz.rain.client.render.main.compile.b.D[0x10631 ^ 0x106AB] = 0xFFFEF972 ^ 0x106AB;
        kotakbaz.rain.client.render.main.compile.b.D[0x2F83 ^ 0x2E96] = 0x2ED1 ^ 0x2E96;
        kotakbaz.rain.client.render.main.compile.b.D[0xEA02 ^ 0xEA9C] = 0xFFFF153C ^ 0xEA9C;
        kotakbaz.rain.client.render.main.compile.b.D[0xF6A2 ^ 0xF620] = 0xFFFF09BF ^ 0xF620;
        kotakbaz.rain.client.render.main.compile.b.D[0xF399 ^ 0xF339] = 0xF379 ^ 0xF339;
        kotakbaz.rain.client.render.main.compile.b.D[0x2D6A ^ 0x2CE3] = 0xFFFFD3A6 ^ 0x2CE3;
        kotakbaz.rain.client.render.main.compile.b.D[0x70DF ^ 0x708C] = 0x70A7 ^ 0x708C;
        kotakbaz.rain.client.render.main.compile.b.D[0x37BD ^ 0x3770] = 0x3736 ^ 0x3770;
        kotakbaz.rain.client.render.main.compile.b.D[0xB90A ^ 0xB9AB] = 0xB9E5 ^ 0xB9AB;
        kotakbaz.rain.client.render.main.compile.b.D[0xA533 ^ 0xA422] = 0xA425 ^ 0xA422;
        kotakbaz.rain.client.render.main.compile.b.D[0x81E4 ^ 0x80D6] = 0x80E0 ^ 0x80D6;
        kotakbaz.rain.client.render.main.compile.b.D[0xD10A ^ 0xD1BA] = 0xFFFF2E32 ^ 0xD1BA;
        kotakbaz.rain.client.render.main.compile.b.D[0x20EB ^ 0x21D7] = 0xFFFFDE5A ^ 0x21D7;
        kotakbaz.rain.client.render.main.compile.b.D[0xE16D ^ 0xE1AC] = 0xFFFF1E72 ^ 0xE1AC;
        kotakbaz.rain.client.render.main.compile.b.D[0xFD5F ^ 0xFD13] = 0xFFFF0299 ^ 0xFD13;
        kotakbaz.rain.client.render.main.compile.b.D[0x58EB ^ 0x58BA] = 0x58AA ^ 0x58BA;
        kotakbaz.rain.client.render.main.compile.b.D[0x202 ^ 0x2A5] = 0x2CC ^ 0x2A5;
        kotakbaz.rain.client.render.main.compile.b.D[0x10366 ^ 0x103DC] = 0x103C4 ^ 0x103DC;
        kotakbaz.rain.client.render.main.compile.b.D[0x5C08 ^ 0x5C01] = 0xFFFFA3E1 ^ 0x5C01;
        kotakbaz.rain.client.render.main.compile.b.D[0xE20D ^ 0xE29F] = 0xE290 ^ 0xE29F;
        kotakbaz.rain.client.render.main.compile.b.D[5 ^ 0x98] = 0xD3 ^ 0x98;
        kotakbaz.rain.client.render.main.compile.b.D[0x1C94 ^ 0x1CDF] = 0xFFFFE309 ^ 0x1CDF;
        kotakbaz.rain.client.render.main.compile.b.D[0x879C ^ 0x87EF] = 0xFFFF7853 ^ 0x87EF;
        kotakbaz.rain.client.render.main.compile.b.D[0xC53B ^ 0xC40F] = 0xC423 ^ 0xC40F;
        kotakbaz.rain.client.render.main.compile.b.D[0x10A15 ^ 0x10B15] = 0x10B4A ^ 0x10B15;
        kotakbaz.rain.client.render.main.compile.b.D[0x511A ^ 0x5171] = 0x515A ^ 0x5171;
        kotakbaz.rain.client.render.main.compile.b.D[0x7047 ^ 0x703E] = 0x704C ^ 0x703E;
        kotakbaz.rain.client.render.main.compile.b.D[0x2D31 ^ 0x2C68] = 0xB958 ^ 0x2C68;
        kotakbaz.rain.client.render.main.compile.b.D[0x691 ^ 0x68A] = 0xFFFFF913 ^ 0x68A;
        kotakbaz.rain.client.render.main.compile.b.D[0x4237 ^ 0x4365] = 0x60A7 ^ 0x4365;
        kotakbaz.rain.client.render.main.compile.b.D[0x39D0 ^ 0x3883] = 0xA6A6 ^ 0x3883;
        kotakbaz.rain.client.render.main.compile.b.D[0x78F ^ 0x716] = 0xFFFFF8F6 ^ 0x716;
        kotakbaz.rain.client.render.main.compile.b.D[0xCDFF ^ 0xCCD2] = 0xFFFF331C ^ 0xCCD2;
        kotakbaz.rain.client.render.main.compile.b.D[0x74D3 ^ 0x74A8] = 0x74B2 ^ 0x74A8;
        kotakbaz.rain.client.render.main.compile.b.D[0x5EDE ^ 0x5F9E] = 0x5FC8 ^ 0x5F9E;
        kotakbaz.rain.client.render.main.compile.b.D[0xE374 ^ 0xE359] = 0xE399 ^ 0xE359;
        kotakbaz.rain.client.render.main.compile.b.D[0xC35 ^ 0xC53] = 0xFFFFF380 ^ 0xC53;
        kotakbaz.rain.client.render.main.compile.b.D[0xF973 ^ 0xF9AF] = 0xFFFF067B ^ 0xF9AF;
        kotakbaz.rain.client.render.main.compile.b.D[0xDE31 ^ 0xDE4E] = 0xDE3E ^ 0xDE4E;
        kotakbaz.rain.client.render.main.compile.b.D[0xD15B ^ 0xD077] = 0xD0D4 ^ 0xD077;
        kotakbaz.rain.client.render.main.compile.b.D[0xBFF2 ^ 0xBF54] = 0xBF54 ^ 0xBF54;
        kotakbaz.rain.client.render.main.compile.b.D[0xD80A ^ 0xD886] = 0xD8ED ^ 0xD886;
        kotakbaz.rain.client.render.main.compile.b.D[0x5436 ^ 0x5407] = 0xFFFFABEA ^ 0x5407;
        kotakbaz.rain.client.render.main.compile.b.D[0x9011 ^ 0x917F] = 0xFFFF6EFD ^ 0x917F;
        kotakbaz.rain.client.render.main.compile.b.D[0xC33B ^ 0xC363] = 0xFFFF3CBF ^ 0xC363;
        kotakbaz.rain.client.render.main.compile.b.D[0xB062 ^ 0xB024] = 0xB060 ^ 0xB024;
        kotakbaz.rain.client.render.main.compile.b.D[0x67C0 ^ 0x67E0] = 0xFFFF9864 ^ 0x67E0;
        kotakbaz.rain.client.render.main.compile.b.D[0xFC31 ^ 0xFCB4] = 0xFC94 ^ 0xFCB4;
        kotakbaz.rain.client.render.main.compile.b.D[0xC31A ^ 0xC275] = 0xFFFF3D99 ^ 0xC275;
        kotakbaz.rain.client.render.main.compile.b.D[0x692 ^ 0x7E9] = 0xFFFFF836 ^ 0x7E9;
        kotakbaz.rain.client.render.main.compile.b.D[0xE319 ^ 0xE30A] = 0xE372 ^ 0xE30A;
        kotakbaz.rain.client.render.main.compile.b.D[0x799B ^ 0x79E7] = 0xFFFF864C ^ 0x79E7;
        kotakbaz.rain.client.render.main.compile.b.D[0x9B79 ^ 0x9A56] = 0xFFFF65E1 ^ 0x9A56;
        kotakbaz.rain.client.render.main.compile.b.D[0xEEE3 ^ 0xEE0E] = 0xEE6F ^ 0xEE0E;
        kotakbaz.rain.client.render.main.compile.b.D[0x8D53 ^ 0x8C72] = 0xFFFF73D8 ^ 0x8C72;
        kotakbaz.rain.client.render.main.compile.b.D[0x563C ^ 0x56C4] = 0xFFFFA940 ^ 0x56C4;
        kotakbaz.rain.client.render.main.compile.b.D[0x5C67 ^ 0x5C3A] = 0xFFFFA3B1 ^ 0x5C3A;
        kotakbaz.rain.client.render.main.compile.b.D[0x8441 ^ 0x844A] = 0x8444 ^ 0x844A;
        kotakbaz.rain.client.render.main.compile.b.D[0x91EA ^ 0x914F] = 0xFFFF6ED0 ^ 0x914F;
        kotakbaz.rain.client.render.main.compile.b.D[0x8427 ^ 0x8524] = 0x8566 ^ 0x8524;
        kotakbaz.rain.client.render.main.compile.b.D[0x6573 ^ 0x656A] = 0xFFFF9AEE ^ 0x656A;
        kotakbaz.rain.client.render.main.compile.b.D[0x6238 ^ 0x637D] = 0xFFFF9C95 ^ 0x637D;
        kotakbaz.rain.client.render.main.compile.b.D[0xD2C3 ^ 0xD2E5] = 0xFFFF2D72 ^ 0xD2E5;
        kotakbaz.rain.client.render.main.compile.b.D[0xCAF1 ^ 0xCAF0] = 0xCAC4 ^ 0xCAF0;
        kotakbaz.rain.client.render.main.compile.b.D[0x8613 ^ 0x86CD] = 0xFFFF7913 ^ 0x86CD;
        kotakbaz.rain.client.render.main.compile.b.D[0xC6DA ^ 0xC75C] = 0xC743 ^ 0xC75C;
        kotakbaz.rain.client.render.main.compile.b.D[0xBD54 ^ 0xBC0F] = 0xA47B ^ 0xBC0F;
        kotakbaz.rain.client.render.main.compile.b.D[0x79F7 ^ 0x7872] = 0xFFFF8780 ^ 0x7872;
        kotakbaz.rain.client.render.main.compile.b.D[0x6726 ^ 0x67F9] = 0xFFFF9837 ^ 0x67F9;
        kotakbaz.rain.client.render.main.compile.b.D[0x9645 ^ 0x96AC] = 0x9696 ^ 0x96AC;
        kotakbaz.rain.client.render.main.compile.b.D[0xA71E ^ 0xA73C] = 0xFFFF58B2 ^ 0xA73C;
        kotakbaz.rain.client.render.main.compile.b.D[0x4B5C ^ 0x4A43] = 0x4A58 ^ 0x4A43;
        kotakbaz.rain.client.render.main.compile.b.D[0xDBF2 ^ 0xDAE8] = 0xDA8B ^ 0xDAE8;
        kotakbaz.rain.client.render.main.compile.b.D[0xD013 ^ 0xD131] = 0xD138 ^ 0xD131;
        kotakbaz.rain.client.render.main.compile.b.D[0xC023 ^ 0xC173] = 0xC173 ^ 0xC173;
        kotakbaz.rain.client.render.main.compile.b.D[0x453B ^ 0x445F] = 0x4401 ^ 0x445F;
        kotakbaz.rain.client.render.main.compile.b.D[0xEDDF ^ 0xECD6] = 0xFFFF1368 ^ 0xECD6;
        kotakbaz.rain.client.render.main.compile.b.D[0xAB82 ^ 0xABE0] = 0xFFFF5407 ^ 0xABE0;
        kotakbaz.rain.client.render.main.compile.b.D[0xD5F9 ^ 0xD493] = 0xD4FE ^ 0xD493;
        kotakbaz.rain.client.render.main.compile.b.D[0x8298 ^ 0x83A5] = 0x83F9 ^ 0x83A5;
        kotakbaz.rain.client.render.main.compile.b.D[0xCC2D ^ 0xCD5B] = 0xCD4D ^ 0xCD5B;
        kotakbaz.rain.client.render.main.compile.b.D[0x8887 ^ 0x887E] = 0xFFFF77F8 ^ 0x887E;
        kotakbaz.rain.client.render.main.compile.b.D[0x8F2D ^ 0x8F2F] = 0xFFFF70CD ^ 0x8F2F;
        kotakbaz.rain.client.render.main.compile.b.D[0x96D6 ^ 0x9795] = 0x97D6 ^ 0x9795;
        kotakbaz.rain.client.render.main.compile.b.D[0xAC1F ^ 0xAC67] = 0xAC7D ^ 0xAC67;
        kotakbaz.rain.client.render.main.compile.b.D[0x6D3 ^ 0x6A3] = 0xFFFFF906 ^ 0x6A3;
        kotakbaz.rain.client.render.main.compile.b.D[0xF616 ^ 0xF6DD] = 0xFFFF091C ^ 0xF6DD;
        kotakbaz.rain.client.render.main.compile.b.D[0x1050A ^ 0x105C2] = 0x105AE ^ 0x105C2;
        kotakbaz.rain.client.render.main.compile.b.D[0x9963 ^ 0x9834] = 0x5E99 ^ 0x9834;
        kotakbaz.rain.client.render.main.compile.b.D[0x76FE ^ 0x77BF] = 0x77ED ^ 0x77BF;
        kotakbaz.rain.client.render.main.compile.b.D[0xBAE7 ^ 0xBAE4] = 0xFFFF4564 ^ 0xBAE4;
        kotakbaz.rain.client.render.main.compile.b.D[0x1B8C ^ 0x1B1F] = 0xFFFFE4E2 ^ 0x1B1F;
        kotakbaz.rain.client.render.main.compile.b.D[0x73B5 ^ 0x72F3] = 0x728F ^ 0x72F3;
        kotakbaz.rain.client.render.main.compile.b.D[0xEB70 ^ 0xEB42] = 0xEB21 ^ 0xEB42;
        kotakbaz.rain.client.render.main.compile.b.D[0x9CCB ^ 0x9DCC] = 0x9DC5 ^ 0x9DCC;
        kotakbaz.rain.client.render.main.compile.b.D[0x6131 ^ 0x61D3] = 0x61F2 ^ 0x61D3;
        kotakbaz.rain.client.render.main.compile.b.D[0x898D ^ 0x8942] = 0x892C ^ 0x8942;
        kotakbaz.rain.client.render.main.compile.b.D[0xA198 ^ 0xA17D] = 0xA17D ^ 0xA17D;
        kotakbaz.rain.client.render.main.compile.b.D[0x4B17 ^ 0x4A71] = 0xFFFFB5EE ^ 0x4A71;
        kotakbaz.rain.client.render.main.compile.b.D[0x2545 ^ 0x257A] = 0x2573 ^ 0x257A;
        kotakbaz.rain.client.render.main.compile.b.D[0xCA6D ^ 0xCB5D] = 0xFFFF3481 ^ 0xCB5D;
        kotakbaz.rain.client.render.main.compile.b.D[0x2A9F ^ 0x2AFA] = 0x2AB5 ^ 0x2AFA;
        kotakbaz.rain.client.render.main.compile.b.D[0x6809 ^ 0x68C9] = 0x68DF ^ 0x68C9;
        kotakbaz.rain.client.render.main.compile.b.D[0x219F ^ 0x20E8] = 0x20E4 ^ 0x20E8;
        kotakbaz.rain.client.render.main.compile.b.D[0x7B14 ^ 0x7B5A] = 0xFFFF84EC ^ 0x7B5A;
        kotakbaz.rain.client.render.main.compile.b.D[0x1E35 ^ 0x1E39] = 0x1E58 ^ 0x1E39;
        kotakbaz.rain.client.render.main.compile.b.D[0x1E49 ^ 0x1E13] = 0x1E72 ^ 0x1E13;
        kotakbaz.rain.client.render.main.compile.b.D[0x612C ^ 0x6163] = 0xFFFF9EBF ^ 0x6163;
        kotakbaz.rain.client.render.main.compile.b.D[0xD5B6 ^ 0xD5A4] = 0xFFFF2A40 ^ 0xD5A4;
        kotakbaz.rain.client.render.main.compile.b.D[0xEABB ^ 0xEA00] = 0xFFFF15AF ^ 0xEA00;
        kotakbaz.rain.client.render.main.compile.b.D[0x308A ^ 0x3196] = 0x31AA ^ 0x3196;
        kotakbaz.rain.client.render.main.compile.b.D[0x32E4 ^ 0x32B2] = 0xFFFFCD14 ^ 0x32B2;
        kotakbaz.rain.client.render.main.compile.b.D[0x870D ^ 0x87A3] = 0x87B0 ^ 0x87A3;
        kotakbaz.rain.client.render.main.compile.b.D[0x9714 ^ 0x973B] = 0xFFFF6898 ^ 0x973B;
        kotakbaz.rain.client.render.main.compile.b.D[0xF668 ^ 0xF615] = 0xF64D ^ 0xF615;
        kotakbaz.rain.client.render.main.compile.b.D[0x4D24 ^ 0x4D3A] = 0xFFFFB2EC ^ 0x4D3A;
        kotakbaz.rain.client.render.main.compile.b.D[0xBA6B ^ 0xBAB0] = 0xFFFF45CD ^ 0xBAB0;
        kotakbaz.rain.client.render.main.compile.b.D[0xA701 ^ 0xA683] = 0xA68A ^ 0xA683;
        kotakbaz.rain.client.render.main.compile.b.D[0x456F ^ 0x442D] = 0x443C ^ 0x442D;
        kotakbaz.rain.client.render.main.compile.b.D[0x5DED ^ 0x5D21] = 0x5D50 ^ 0x5D21;
        kotakbaz.rain.client.render.main.compile.b.D[0x7552 ^ 0x7406] = 0x85E1 ^ 0x7406;
        kotakbaz.rain.client.render.main.compile.b.D[0xC187 ^ 0xC0F6] = 0xC086 ^ 0xC0F6;
        kotakbaz.rain.client.render.main.compile.b.D[0xB4BF ^ 0xB586] = 0xB597 ^ 0xB586;
        kotakbaz.rain.client.render.main.compile.b.D[0xC012 ^ 0xC16B] = 0xFFFF3EA9 ^ 0xC16B;
        kotakbaz.rain.client.render.main.compile.b.D[0x10D97 ^ 0x10D19] = 0x10D1D ^ 0x10D19;
        kotakbaz.rain.client.render.main.compile.b.D[0xABA ^ 0xA4A] = 0xA37 ^ 0xA4A;
        kotakbaz.rain.client.render.main.compile.b.D[0x97F6 ^ 0x9748] = 0x9758 ^ 0x9748;
        kotakbaz.rain.client.render.main.compile.b.D[0x8F06 ^ 0x8E2E] = 0xFFFF71CF ^ 0x8E2E;
        kotakbaz.rain.client.render.main.compile.b.D[0xC163 ^ 0xC1EB] = 0xC1DD ^ 0xC1EB;
        kotakbaz.rain.client.render.main.compile.b.D[0x81F4 ^ 0x8120] = 0xFFFF7EC1 ^ 0x8120;
        kotakbaz.rain.client.render.main.compile.b.D[0x40C3 ^ 0x41F5] = 0xFFFFBE1D ^ 0x41F5;
        kotakbaz.rain.client.render.main.compile.b.D[0x3D14 ^ 0x3D84] = 0xFFFFC265 ^ 0x3D84;
        kotakbaz.rain.client.render.main.compile.b.D[0x4B0C ^ 0x4B68] = 0xFFFFB4F1 ^ 0x4B68;
        kotakbaz.rain.client.render.main.compile.b.D[0x9650 ^ 0x968A] = 0xFFFF6942 ^ 0x968A;
        kotakbaz.rain.client.render.main.compile.b.D[0x8249 ^ 0x832A] = 0x8346 ^ 0x832A;
        kotakbaz.rain.client.render.main.compile.b.D[0x2B40 ^ 0x2BFF] = 0x2BAC ^ 0x2BFF;
        kotakbaz.rain.client.render.main.compile.b.D[0xCE6B ^ 0xCE02] = 0xFFFF31D3 ^ 0xCE02;
        kotakbaz.rain.client.render.main.compile.b.D[0x3AEC ^ 0x3BD6] = 0x3BC9 ^ 0x3BD6;
        kotakbaz.rain.client.render.main.compile.b.D[0x6396 ^ 0x63D7] = 0xFFFF9C36 ^ 0x63D7;
        kotakbaz.rain.client.render.main.compile.b.D[0x6F1F ^ 0x6E4E] = 0x6F96 ^ 0x6E4E;
        kotakbaz.rain.client.render.main.compile.b.D[0x108BE ^ 0x109D3] = 0xFFFEF632 ^ 0x109D3;
        kotakbaz.rain.client.render.main.compile.b.D[0xC908 ^ 0xC9D9] = 0xFFFF363D ^ 0xC9D9;
        kotakbaz.rain.client.render.main.compile.b.D[0x2DD2 ^ 0x2D70] = 0xFFFFD2A2 ^ 0x2D70;
        kotakbaz.rain.client.render.main.compile.b.D[0x85A0 ^ 0x85F9] = 0xFFFF7A0E ^ 0x85F9;
        kotakbaz.rain.client.render.main.compile.b.D[0x4331 ^ 0x431D] = 0xFFFFBCD8 ^ 0x431D;
        kotakbaz.rain.client.render.main.compile.b.D[0xC1D9 ^ 0xC165] = 0xFFFF3ED0 ^ 0xC165;
        kotakbaz.rain.client.render.main.compile.b.D[0x4FDE ^ 0x4F24] = 0xFFFFB0B8 ^ 0x4F24;
        kotakbaz.rain.client.render.main.compile.b.D[0xF196 ^ 0xF01E] = 0xF036 ^ 0xF01E;
        kotakbaz.rain.client.render.main.compile.b.D[0x8FDD ^ 0x8EFA] = 0xFFFF711D ^ 0x8EFA;
        kotakbaz.rain.client.render.main.compile.b.D[0xA1EF ^ 0xA1AA] = 0xA1EE ^ 0xA1AA;
        kotakbaz.rain.client.render.main.compile.b.D[0x91C1 ^ 0x91EA] = 0x91BD ^ 0x91EA;
        kotakbaz.rain.client.render.main.compile.b.D[0x9F50 ^ 0x9E14] = 0xFFFF615E ^ 0x9E14;
        kotakbaz.rain.client.render.main.compile.b.D[0x499D ^ 0x49F7] = 0xFFFFB61A ^ 0x49F7;
        kotakbaz.rain.client.render.main.compile.b.D[0x15F6 ^ 0x1523] = 0x154E ^ 0x1523;
        kotakbaz.rain.client.render.main.compile.b.D[0x4ED4 ^ 0x4F9A] = 0x4F98 ^ 0x4F9A;
        kotakbaz.rain.client.render.main.compile.b.D[0x7637 ^ 0x7723] = 0xFFFF88CB ^ 0x7723;
        kotakbaz.rain.client.render.main.compile.b.D[0x7C77 ^ 0x7CE3] = 0xFFFF836C ^ 0x7CE3;
        kotakbaz.rain.client.render.main.compile.b.D[0xC4ED ^ 0xC401] = 0xC45D ^ 0xC401;
        kotakbaz.rain.client.render.main.compile.b.D[0x2AE7 ^ 0x2AC4] = 0x2ADF ^ 0x2AC4;
        kotakbaz.rain.client.render.main.compile.b.D[0x9F5C ^ 0x9FE4] = 0x9F8E ^ 0x9FE4;
        kotakbaz.rain.client.render.main.compile.b.D[0x8004 ^ 0x80F8] = 0xFFFF7F03 ^ 0x80F8;
        kotakbaz.rain.client.render.main.compile.b.D[0x1CC3 ^ 0x1DC5] = 0xFFFFE243 ^ 0x1DC5;
        kotakbaz.rain.client.render.main.compile.b.D[0xC91 ^ 0xC3E] = 0xFFFFF3B3 ^ 0xC3E;
        kotakbaz.rain.client.render.main.compile.b.D[0x4671 ^ 0x4702] = 0x4718 ^ 0x4702;
        kotakbaz.rain.client.render.main.compile.b.D[0x10E6C ^ 0x10F04] = 0x10F08 ^ 0x10F04;
        kotakbaz.rain.client.render.main.compile.b.D[0xE3A4 ^ 0xE3D5] = 0xE39A ^ 0xE3D5;
        kotakbaz.rain.client.render.main.compile.b.D[0xE002 ^ 0xE0DF] = 0xFFFF1F7F ^ 0xE0DF;
        kotakbaz.rain.client.render.main.compile.b.D[0xBDDC ^ 0xBDD6] = 0xFFFF4264 ^ 0xBDD6;
        kotakbaz.rain.client.render.main.compile.b.D[0xCC09 ^ 0xCD8A] = 0xFFFF324F ^ 0xCD8A;
        kotakbaz.rain.client.render.main.compile.b.D[0x7C9E ^ 0x7C0B] = 0x7C62 ^ 0x7C0B;
        kotakbaz.rain.client.render.main.compile.b.D[0xF834 ^ 0xF944] = 0xF90A ^ 0xF944;
        kotakbaz.rain.client.render.main.compile.b.D[0x98AD ^ 0x98BA] = 0xFFFF676F ^ 0x98BA;
        kotakbaz.rain.client.render.main.compile.b.D[0xB0D3 ^ 0xB05C] = 0xFFFF4FE5 ^ 0xB05C;
        kotakbaz.rain.client.render.main.compile.b.D[0x374 ^ 0x278] = 0xFFFFFDE7 ^ 0x278;
        kotakbaz.rain.client.render.main.compile.b.D[0xEA2F ^ 0xEA87] = 0xEA2B ^ 0xEA87;
        kotakbaz.rain.client.render.main.compile.b.D[0xC02E ^ 0xC0DC] = 0xC097 ^ 0xC0DC;
        kotakbaz.rain.client.render.main.compile.b.D[0xF4B1 ^ 0xF4FC] = 0xF4B3 ^ 0xF4FC;
        kotakbaz.rain.client.render.main.compile.b.D[0x9B5 ^ 0x9A9] = 0xFFFFF627 ^ 0x9A9;
        kotakbaz.rain.client.render.main.compile.b.D[0x6FB7 ^ 0x6F2F] = 0xFFFF90FD ^ 0x6F2F;
        kotakbaz.rain.client.render.main.compile.b.D[0x225A ^ 0x2374] = 0x231D ^ 0x2374;
        kotakbaz.rain.client.render.main.compile.b.D[0xF4EC ^ 0xF5B9] = 0xB8F2 ^ 0xF5B9;
        kotakbaz.rain.client.render.main.compile.b.D[0xF557 ^ 0xF537] = 0xF527 ^ 0xF537;
        kotakbaz.rain.client.render.main.compile.b.D[0x6907 ^ 0x6848] = 0x6848 ^ 0x6848;
        kotakbaz.rain.client.render.main.compile.b.D[0xD51A ^ 0xD517] = 0xD527 ^ 0xD517;
        kotakbaz.rain.client.render.main.compile.b.D[0x10518 ^ 0x1045F] = 0x1041B ^ 0x1045F;
        kotakbaz.rain.client.render.main.compile.b.D[0x3A1D ^ 0x3B0F] = 0x3B49 ^ 0x3B0F;
        kotakbaz.rain.client.render.main.compile.b.D[0x5D9A ^ 0x5D0C] = 0xFFFFA2C6 ^ 0x5D0C;
        kotakbaz.rain.client.render.main.compile.b.D[0xB326 ^ 0xB246] = 0xB359 ^ 0xB246;
        kotakbaz.rain.client.render.main.compile.b.D[0xCE58 ^ 0xCE68] = 0xFFFF31C2 ^ 0xCE68;
        kotakbaz.rain.client.render.main.compile.b.D[0x19B6 ^ 0x18E9] = 0xCED5 ^ 0x18E9;
        kotakbaz.rain.client.render.main.compile.b.D[0x1A65 ^ 0x1A84] = 0xFFFFE53B ^ 0x1A84;
        kotakbaz.rain.client.render.main.compile.b.D[0x12C5 ^ 0x12F0] = 0x12FC ^ 0x12F0;
        kotakbaz.rain.client.render.main.compile.b.D[0x2752 ^ 0x273F] = 0xFFFFD8C0 ^ 0x273F;
        kotakbaz.rain.client.render.main.compile.b.D[0xBB22 ^ 0xBBE5] = 0xFFFF446F ^ 0xBBE5;
        kotakbaz.rain.client.render.main.compile.b.D[0x9B41 ^ 0x9BB7] = 0xFFFF6409 ^ 0x9BB7;
        kotakbaz.rain.client.render.main.compile.b.D[0xB933 ^ 0xB806] = 0xB81F ^ 0xB806;
        kotakbaz.rain.client.render.main.compile.b.D[0x3B9C ^ 0x3BA5] = 0xFFFFC432 ^ 0x3BA5;
        kotakbaz.rain.client.render.main.compile.b.D[0x10773 ^ 0x1078D] = 0xFFFEF84F ^ 0x1078D;
        kotakbaz.rain.client.render.main.compile.b.D[0xEC5B ^ 0xEC19] = 0xECCF ^ 0xEC19;
        kotakbaz.rain.client.render.main.compile.b.D[0x9958 ^ 0x9843] = 0x9804 ^ 0x9843;
        kotakbaz.rain.client.render.main.compile.b.D[0xD7D1 ^ 0xD699] = 0xFFFF2907 ^ 0xD699;
        kotakbaz.rain.client.render.main.compile.b.D[0x9133 ^ 0x919A] = 0xFFFF6E1C ^ 0x919A;
        kotakbaz.rain.client.render.main.compile.b.D[0x9852 ^ 0x9927] = 0x9927 ^ 0x9927;
        kotakbaz.rain.client.render.main.compile.b.D[0x1281 ^ 0x1270] = 0xFFFFEDD8 ^ 0x1270;
        kotakbaz.rain.client.render.main.compile.b.D[0x75D2 ^ 0x757F] = 0xFFFF8A8F ^ 0x757F;
        kotakbaz.rain.client.render.main.compile.b.D[0x2D15 ^ 0x2D5F] = 0x2D54 ^ 0x2D5F;
        kotakbaz.rain.client.render.main.compile.b.D[0x9F75 ^ 0x9FAC] = 0xFFFF6073 ^ 0x9FAC;
        kotakbaz.rain.client.render.main.compile.b.D[0x106A ^ 0x101E] = 0x1044 ^ 0x101E;
        kotakbaz.rain.client.render.main.compile.b.D[0x47BA ^ 0x4769] = 0x470A ^ 0x4769;
        kotakbaz.rain.client.render.main.compile.b.D[0x549D ^ 0x5485] = 0xFFFFAB7F ^ 0x5485;
        kotakbaz.rain.client.render.main.compile.b.D[0xF965 ^ 0xF95B] = 0xFFFF06D1 ^ 0xF95B;
        kotakbaz.rain.client.render.main.compile.b.D[0x3BC ^ 0x3EC] = 0xFFFFFC3B ^ 0x3EC;
        kotakbaz.rain.client.render.main.compile.b.D[0x3DB8 ^ 0x3D9C] = 0x3D76 ^ 0x3D9C;
        kotakbaz.rain.client.render.main.compile.b.D[0x9879 ^ 0x9907] = 0x9904 ^ 0x9907;
        kotakbaz.rain.client.render.main.compile.b.D[0x9D24 ^ 0x9DC0] = 0x9DE4 ^ 0x9DC0;
        kotakbaz.rain.client.render.main.compile.b.D[0x6C9 ^ 0x7DF] = 0xFFFFF82C ^ 0x7DF;
        kotakbaz.rain.client.render.main.compile.b.D[0x38FF ^ 0x382F] = 0x3848 ^ 0x382F;
        kotakbaz.rain.client.render.main.compile.b.D[0x6932 ^ 0x687E] = 0x687F ^ 0x687E;
        kotakbaz.rain.client.render.main.compile.b.D[0x564D ^ 0x560A] = 0xFFFFA9EC ^ 0x560A;
        kotakbaz.rain.client.render.main.compile.b.D[0x96C6 ^ 0x96A8] = 0xFFFF696F ^ 0x96A8;
        kotakbaz.rain.client.render.main.compile.b.D[0xA8E8 ^ 0xA8EC] = 0xFFFF5755 ^ 0xA8EC;
        kotakbaz.rain.client.render.main.compile.b.D[0xBCCE ^ 0xBDD6] = 0xFFFF4209 ^ 0xBDD6;
        kotakbaz.rain.client.render.main.compile.b.D[0x473F ^ 0x47CA] = 0x47C1 ^ 0x47CA;
        kotakbaz.rain.client.render.main.compile.b.D[0xC2A8 ^ 0xC396] = 0xC3C5 ^ 0xC396;
        kotakbaz.rain.client.render.main.compile.b.D[0x9FF7 ^ 0x9F70] = 0xFFFF60B1 ^ 0x9F70;
        kotakbaz.rain.client.render.main.compile.b.D[0xB524 ^ 0xB52A] = 0xB53B ^ 0xB52A;
        kotakbaz.rain.client.render.main.compile.b.D[0x3319 ^ 0x3232] = 0x327F ^ 0x3232;
        kotakbaz.rain.client.render.main.compile.b.D[0x37A0 ^ 0x3793] = 0x370C ^ 0x3793;
        kotakbaz.rain.client.render.main.compile.b.D[0x963 ^ 0x90F] = 0xFFFFF6C7 ^ 0x90F;
        kotakbaz.rain.client.render.main.compile.b.D[0x14C ^ 0x27] = 0xFFFFFFDB ^ 0x27;
    }
}

