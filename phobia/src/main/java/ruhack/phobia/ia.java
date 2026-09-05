/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_243
 *  net.minecraft.class_3532
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.security.SecureRandom;
import net.minecraft.class_1297;
import net.minecraft.class_243;
import net.minecraft.class_3532;
import ruhack.phobia.hx;
import ruhack.phobia.ov;

public final class ia
extends hx {
    private boolean initialized;
    public static final boolean c;
    private int lockedHorizontal;
    static final long nf = 8317923689879386856L;
    private float lerpPitch;
    private int pointLockTicks;
    private int trackedEntityId;
    private float lerpYaw;
    private int noiseTicks;
    private static int[] gcyl;
    private static int[] gcym;
    private float lastYawStep;
    private float noiseYaw;
    private static long[] gdds;
    private float noisePitch;
    private int lockedVertical;
    private float wantedNoisePitch;
    public static final int b;
    private static final double[] VERTICAL_MULTIPOINTS;
    private float lastPitchStep;
    private float wantedNoiseYaw;
    public static final boolean a;
    private final SecureRandom random;
    private static long[] gddr;
    private static final double[][] HORIZONTAL_MULTIPOINTS;

    private static /* synthetic */ void gdqu() {
        ia.gddr[100] = 7948152234956141613L;
        ia.gddr[101] = -5604248631363323208L;
        ia.gddr[102] = 630649106399211972L;
        ia.gddr[103] = -4888443428884605195L;
        ia.gddr[104] = -1479002031739952214L;
        ia.gddr[105] = -1045531910434420077L;
        ia.gddr[106] = 2494470498647163782L;
        ia.gddr[107] = 5674917114056549234L;
        ia.gddr[108] = 8141477156875836321L;
        ia.gddr[109] = 4412727641091200523L;
        ia.gddr[110] = -3340418120243551585L;
        ia.gddr[111] = 5299689104685959956L;
        ia.gddr[112] = -7290757733085738793L;
        ia.gddr[113] = -3786598284647030961L;
        ia.gddr[114] = 1463376448496925974L;
        ia.gddr[115] = 1002293997537473177L;
        ia.gddr[116] = 2261649892913195794L;
        ia.gddr[117] = 4791544961433864902L;
        ia.gddr[118] = 1467521791588835866L;
        ia.gddr[119] = 2059919800913193855L;
        ia.gddr[120] = -1605224610735064389L;
        ia.gddr[121] = -7420073131602707119L;
        ia.gddr[122] = 2118203717040657333L;
        ia.gddr[123] = 2913712020559228452L;
        ia.gddr[124] = 57601740954716342L;
        ia.gddr[125] = -8773739782047568521L;
        ia.gddr[126] = 6666260238464021178L;
        ia.gddr[127] = 6584039842633759875L;
        ia.gddr[128] = -3417630241662147328L;
    }

    private static /* synthetic */ void gdqn() {
        ia.gcyl[200] = -2054479852;
        ia.gcyl[201] = 1380327680;
        ia.gcyl[202] = -1708940659;
        ia.gcyl[203] = -532472567;
        ia.gcyl[204] = 1324407607;
        ia.gcyl[205] = 1438865138;
        ia.gcyl[206] = -197828581;
        ia.gcyl[207] = -924267960;
        ia.gcyl[208] = 1507422475;
        ia.gcyl[209] = 1401212354;
        ia.gcyl[210] = -730414097;
        ia.gcyl[211] = 591931834;
        ia.gcyl[212] = -184924884;
        ia.gcyl[213] = -756388057;
        ia.gcyl[214] = 616247441;
        ia.gcyl[215] = -240438919;
        ia.gcyl[216] = 461641750;
        ia.gcyl[217] = -1209528790;
        ia.gcyl[218] = -561335873;
        ia.gcyl[219] = 995403772;
        ia.gcyl[220] = -268990717;
        ia.gcyl[221] = 55012749;
        ia.gcyl[222] = -740199831;
        ia.gcyl[223] = -1237629386;
        ia.gcyl[224] = 78407770;
        ia.gcyl[225] = 873144565;
        ia.gcyl[226] = -839213905;
        ia.gcyl[227] = 1155613069;
        ia.gcyl[228] = 1978508212;
        ia.gcyl[229] = -641916159;
        ia.gcyl[230] = -1067387234;
        ia.gcyl[231] = 2065193356;
        ia.gcyl[232] = -1245373518;
        ia.gcyl[233] = 800475564;
        ia.gcyl[234] = 1632652072;
        ia.gcyl[235] = 796908617;
        ia.gcyl[236] = 190982174;
        ia.gcyl[237] = 80900712;
        ia.gcyl[238] = -362641785;
        ia.gcyl[239] = 995383363;
        ia.gcyl[240] = 111915228;
        ia.gcyl[241] = -1774932833;
        ia.gcyl[242] = -1308758065;
        ia.gcyl[243] = -997694190;
        ia.gcyl[244] = -1910655062;
        ia.gcyl[245] = -1642510189;
        ia.gcyl[246] = 1418903912;
        ia.gcyl[247] = -1808386032;
        ia.gcyl[248] = 994111216;
        ia.gcyl[249] = -1447710925;
        ia.gcyl[250] = -1484244363;
        ia.gcyl[251] = 1264606771;
        ia.gcyl[252] = 182052113;
        ia.gcyl[253] = -274105475;
        ia.gcyl[254] = -1539316450;
        ia.gcyl[255] = 622339382;
        ia.gcyl[256] = -1282498865;
        ia.gcyl[257] = 674244997;
        ia.gcyl[258] = -1971493629;
        ia.gcyl[259] = 1694869012;
        ia.gcyl[260] = -1592440725;
        ia.gcyl[261] = -1490383571;
        ia.gcyl[262] = -1552851003;
        ia.gcyl[263] = -1301475456;
        ia.gcyl[264] = -457822676;
        ia.gcyl[265] = -967837517;
        ia.gcyl[266] = -1678968285;
        ia.gcyl[267] = -1670917494;
        ia.gcyl[268] = -18702534;
        ia.gcyl[269] = 621249893;
        ia.gcyl[270] = 222025490;
        ia.gcyl[271] = 307000774;
        ia.gcyl[272] = -699650756;
        ia.gcyl[273] = -937270061;
        ia.gcyl[274] = 1329950361;
        ia.gcyl[275] = -1034123599;
        ia.gcyl[276] = -493517937;
        ia.gcyl[277] = -309072225;
        ia.gcyl[278] = 1195577435;
        ia.gcyl[279] = -973813379;
        ia.gcyl[280] = -501878762;
        ia.gcyl[281] = 491340069;
        ia.gcyl[282] = 577832064;
        ia.gcyl[283] = -676077094;
        ia.gcyl[284] = 624225454;
        ia.gcyl[285] = -600384686;
        ia.gcyl[286] = 1324033765;
        ia.gcyl[287] = -1156228956;
        ia.gcyl[288] = 2069802595;
        ia.gcyl[289] = -1379554762;
        ia.gcyl[290] = -943421217;
        ia.gcyl[291] = 1927829750;
        ia.gcyl[292] = 1966501414;
        ia.gcyl[293] = 1337562105;
        ia.gcyl[294] = -331719110;
        ia.gcyl[295] = -1502898503;
        ia.gcyl[296] = -1179103995;
        ia.gcyl[297] = -673643276;
        ia.gcyl[298] = -1647386187;
        ia.gcyl[299] = -787874366;
    }

    private static /* synthetic */ double gddq(int n2) {
        return Double.longBitsToDouble(gddr[n2] ^ gdds[n2]);
    }

    private static /* synthetic */ void gdqt() {
        ia.gddr[0] = 4923126614671715811L;
        ia.gddr[1] = 3341062805741140230L;
        ia.gddr[2] = 1935032330704320357L;
        ia.gddr[3] = -7338170168400814344L;
        ia.gddr[4] = 6662942688639327040L;
        ia.gddr[5] = -7630882774828870629L;
        ia.gddr[6] = 4953319632452842267L;
        ia.gddr[7] = -7354474687683643545L;
        ia.gddr[8] = 6973555983250494309L;
        ia.gddr[9] = -939903142642495566L;
        ia.gddr[10] = -430192029292904989L;
        ia.gddr[11] = 5689348594665935578L;
        ia.gddr[12] = -7005686887763302512L;
        ia.gddr[13] = 5024788031121014851L;
        ia.gddr[14] = 6292269839335622756L;
        ia.gddr[15] = -1744887400017445573L;
        ia.gddr[16] = 5717480162315066283L;
        ia.gddr[17] = -720209389349497913L;
        ia.gddr[18] = 856793966444922020L;
        ia.gddr[19] = -1011876433708736535L;
        ia.gddr[20] = 7012675020045816490L;
        ia.gddr[21] = 1132027954743244216L;
        ia.gddr[22] = -7529354060310538466L;
        ia.gddr[23] = -5988780187609638553L;
        ia.gddr[24] = -5757340709242232011L;
        ia.gddr[25] = 4771819873137923380L;
        ia.gddr[26] = 6138849424483643066L;
        ia.gddr[27] = 901537293952997772L;
        ia.gddr[28] = 633801669515137023L;
        ia.gddr[29] = -1457640268593064080L;
        ia.gddr[30] = -2015666062901674806L;
        ia.gddr[31] = -9196158567011595466L;
        ia.gddr[32] = -4409589491492007621L;
        ia.gddr[33] = -4508967612596954457L;
        ia.gddr[34] = 4812782190680732552L;
        ia.gddr[35] = 7578150917514856356L;
        ia.gddr[36] = 6990866157637673146L;
        ia.gddr[37] = 7832848868142062259L;
        ia.gddr[38] = -5993533610716549041L;
        ia.gddr[39] = -8032900316688067433L;
        ia.gddr[40] = 1953692734032643306L;
        ia.gddr[41] = -2021983227054738581L;
        ia.gddr[42] = -4779701770284361134L;
        ia.gddr[43] = 5382941968924770547L;
        ia.gddr[44] = 7732936410488494326L;
        ia.gddr[45] = 4782332010081822897L;
        ia.gddr[46] = -5089085303410515065L;
        ia.gddr[47] = -49783446092704518L;
        ia.gddr[48] = 9057247698473638310L;
        ia.gddr[49] = 8827441740820365469L;
        ia.gddr[50] = 6098866855511894205L;
        ia.gddr[51] = 7880624657711878458L;
        ia.gddr[52] = -4351431156860427985L;
        ia.gddr[53] = 791058357163549431L;
        ia.gddr[54] = -7110715629065315963L;
        ia.gddr[55] = -5614843862200585275L;
        ia.gddr[56] = 4215612956447633760L;
        ia.gddr[57] = -8931141520916889732L;
        ia.gddr[58] = 7416034060617350446L;
        ia.gddr[59] = -3404436553319097402L;
        ia.gddr[60] = 8514250820229027079L;
        ia.gddr[61] = 2246379387691764997L;
        ia.gddr[62] = -7341653771193408986L;
        ia.gddr[63] = 3946788232091512450L;
        ia.gddr[64] = -5242248281529914357L;
        ia.gddr[65] = 8824366594276045726L;
        ia.gddr[66] = 2468571060344868303L;
        ia.gddr[67] = -3977295204700181906L;
        ia.gddr[68] = 788025228512392593L;
        ia.gddr[69] = -1375482555899171454L;
        ia.gddr[70] = -8202704351229005027L;
        ia.gddr[71] = 7644840338508118203L;
        ia.gddr[72] = 1568053895358982495L;
        ia.gddr[73] = -4224711789706634370L;
        ia.gddr[74] = 3085238903530645764L;
        ia.gddr[75] = 7947195658539613855L;
        ia.gddr[76] = -7789130987040189712L;
        ia.gddr[77] = 8600443366017361226L;
        ia.gddr[78] = -4923309927758695828L;
        ia.gddr[79] = 5721165200838733837L;
        ia.gddr[80] = -3420043249781509412L;
        ia.gddr[81] = 8579355570538792612L;
        ia.gddr[82] = -5526794875443865294L;
        ia.gddr[83] = 1836217423303175853L;
        ia.gddr[84] = 7151173939982519871L;
        ia.gddr[85] = 8217949875085124515L;
        ia.gddr[86] = -3063270786127341095L;
        ia.gddr[87] = 4205103443540957776L;
        ia.gddr[88] = 5311368999798976398L;
        ia.gddr[89] = -6069266120483428600L;
        ia.gddr[90] = 6339135159339846754L;
        ia.gddr[91] = -8642170229638138505L;
        ia.gddr[92] = -8828279662951077672L;
        ia.gddr[93] = -3904439042370451979L;
        ia.gddr[94] = 4098798440692588801L;
        ia.gddr[95] = -5343110034310275991L;
        ia.gddr[96] = -1322952756291561752L;
        ia.gddr[97] = 573764260696909510L;
        ia.gddr[98] = 5454245814178430568L;
        ia.gddr[99] = -4158076060995450828L;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private float approachStep(float f2, float f3, float f4) {
        boolean bl2;
        Object object = nf;
        block10: while (true) {
            switch ((int)object) {
                case -1810810136: {
                    break block10;
                }
                case 1622225527: {
                    object = ia.gcyn("gdnp", gdhe(int ), (int)92) - ia.gcyn("gdno", gdhe(int ), (int)91);
                    continue block10;
                }
            }
            break;
        }
        boolean bl3 = c;
        Object object2 = nf;
        boolean bl4 = true;
        block11: while (true) {
            CallSite callSite;
            if (!bl4 || (bl4 = false) || !true) {
                object2 = callSite - ia.gcyn("gdnq", gdhe(int ), (int)93);
            }
            switch ((int)object2) {
                case -1810810136: {
                    break block11;
                }
                case -861411049: {
                    callSite = ia.gcyn("gdnr", gdhe(int ), (int)94);
                    continue block11;
                }
                case -239632413: {
                    callSite = ia.gcyn("gdns", gdhe(int ), (int)95);
                    continue block11;
                }
                case 1172419134: {
                    callSite = ia.gcyn("gdnt", gdhe(int ), (int)96);
                    continue block11;
                }
            }
            break;
        }
        int n2 = b;
        while (true) {
            long l2;
            Object object3;
            if ((object3 = (l2 = nf - ia.gcyn("gdnu", gdhe(int ), (int)97)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (object3 == ia.gcyn("gdnv", gcyk(int ), (int)294)) {
                bl2 = a;
                if (bl3) {
                    throw null;
                }
                break;
            }
            object3 = ia.gcyn("gdnw", gcyk(int ), (int)295);
        }
        if (bl2) return (float)ia.gcyn("gdnx", gcyz(int ), (int)296);
        if (bl2) return (float)ia.gcyn("gdnx", gcyz(int ), (int)296);
        float f5 = -f4;
        while (true) {
            long l3;
            Object object4;
            if ((object4 = (l3 = nf - ia.gcyn("gdny", gdhe(int ), (int)98)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (object4 == ia.gcyn("gdnz", gcyk(int ), (int)297)) {
                return f2 + class_3532.method_15363((float)(f3 - f2), (float)f5, (float)f4);
            }
            object4 = ia.gcyn("gdoa", gcyk(int ), (int)298);
        }
    }

    private static /* synthetic */ void gdqs() {
        ia.gcym[300] = 1862773168;
        ia.gcym[301] = 1219531219;
        ia.gcym[302] = 1865159413;
        ia.gcym[303] = 2087935802;
        ia.gcym[304] = -412676016;
        ia.gcym[305] = -1791996770;
        ia.gcym[306] = 1135199102;
        ia.gcym[307] = -386669572;
        ia.gcym[308] = 1477431069;
        ia.gcym[309] = 1934947259;
        ia.gcym[310] = 266628911;
        ia.gcym[311] = -1531024963;
        ia.gcym[312] = -521580150;
        ia.gcym[313] = 1644478527;
        ia.gcym[314] = -234340549;
        ia.gcym[315] = 1305324220;
        ia.gcym[316] = 1295997552;
        ia.gcym[317] = -398260281;
        ia.gcym[318] = 314970016;
        ia.gcym[319] = -1949640895;
        ia.gcym[320] = 1830134023;
        ia.gcym[321] = 1700479279;
        ia.gcym[322] = 912083512;
        ia.gcym[323] = -997076885;
        ia.gcym[324] = 1454664979;
        ia.gcym[325] = 198002349;
        ia.gcym[326] = 628713592;
        ia.gcym[327] = 259916126;
        ia.gcym[328] = 1209625301;
        ia.gcym[329] = 1552531770;
        ia.gcym[330] = 1662864160;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public ov limitAngleChange(ov var1_1, ov var2_2, class_243 var3_3, class_1297 var4_4) {
        block187: {
            block186: {
                block185: {
                    block184: {
                        var23_5 = ia.c;
                        var22_6 /* !! */  = ia.b;
                        var21_7 = ia.a;
                        if (var23_5) {
                            throw null;
lbl6:
                            // 52 sources

                            return null;
                        }
                        if (var21_7 || var21_7) ** GOTO lbl6
                        if (ia.mc.field_1724 == null) break block184;
                        if (var21_7) ** GOTO lbl6
                        if (var4_4 != null) break block185;
                        if (var21_7) ** GOTO lbl6
                    }
                    if (var21_7 || var21_7) ** GOTO lbl6
                    this.reset();
                    if (var21_7 || var21_7) ** GOTO lbl6
                    return var2_2;
                }
                if (var21_7 || var21_7) ** GOTO lbl6
                if (!this.initialized) break block186;
                if (var21_7) ** GOTO lbl6
                if (this.trackedEntityId == var4_4.method_5628()) break block187;
                if (var21_7) ** GOTO lbl6
            }
            if (var21_7 || var21_7) ** GOTO lbl6
            this.lerpYaw = var1_1.getYaw();
            if (var21_7 || var21_7) ** GOTO lbl6
            this.lerpPitch = var1_1.getPitch();
            if (var21_7 || var21_7) ** GOTO lbl6
            this.lastYawStep = 0.0f;
            if (var21_7 || var21_7) ** GOTO lbl6
            this.lastPitchStep = 0.0f;
            if (var21_7 || var21_7) ** GOTO lbl6
            this.noiseYaw = 0.0f;
            if (var21_7 || var21_7) ** GOTO lbl6
            this.noisePitch = 0.0f;
            if (var21_7 || var21_7) ** GOTO lbl6
            this.wantedNoiseYaw = 0.0f;
            if (var21_7 || var21_7) ** GOTO lbl6
            this.wantedNoisePitch = 0.0f;
            if (var21_7 || var21_7) ** GOTO lbl6
            this.noiseTicks = (int)ia.gcyn("gcyu", gcyk(int ), (int)6);
            if (var21_7 || var21_7) ** GOTO lbl6
            this.trackedEntityId = var4_4.method_5628();
            if (var21_7 || var21_7) ** GOTO lbl6
            this.lockedVertical = (int)ia.gcyn("gcyv", gcyk(int ), (int)7);
            if (var21_7 || var21_7) ** GOTO lbl6
            this.lockedHorizontal = (int)ia.gcyn("gcyw", gcyk(int ), (int)8);
            if (var21_7 || var21_7) ** GOTO lbl6
            this.pointLockTicks = (int)ia.gcyn("gcyx", gcyk(int ), (int)9);
            if (var21_7 || var21_7) ** GOTO lbl6
            this.initialized = ia.gcyn("gcyy", gcyk(int ), (int)10);
            if (var21_7) ** GOTO lbl6
        }
        if (var21_7 || var21_7) ** GOTO lbl6
        var5_8 = this.rotationToMultipoint(var4_4, var2_2);
        if (var21_7 || var21_7) ** GOTO lbl6
        this.updateCoherentNoise();
        if (var21_7 || var21_7) ** GOTO lbl6
        var6_9 = var5_8.getYaw() + this.noiseYaw;
        if (var21_7 || var21_7) ** GOTO lbl6
        var7_10 = class_3532.method_15363((float)(var5_8.getPitch() + this.noisePitch), (float)ia.gcyn("gcza", gcyz(int ), (int)11), (float)ia.gcyn("gczb", gcyz(int ), (int)12));
        if (var21_7 || var21_7) ** GOTO lbl6
        var8_11 = class_3532.method_15393((float)(var6_9 - var1_1.getYaw()));
        if (var21_7 || var21_7) ** GOTO lbl6
        var9_12 = class_3532.method_15393((float)(var7_10 - var1_1.getPitch()));
        if (var21_7 || var21_7) ** GOTO lbl6
        var10_13 = Math.abs(var8_11);
        if (var21_7 || var21_7) ** GOTO lbl6
        var11_14 = Math.abs(var9_12);
        if (var21_7) ** GOTO lbl6
        if (var22_6 /* !! */  == 0) ** GOTO lbl-1000
        switch (var22_6 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var21_7) ** GOTO lbl6
                var12_15 = (float)Math.hypot(var10_13, var11_14);
                if (var21_7 || var21_7) ** GOTO lbl6
                var13_16 = class_3532.method_15363((float)(ia.gcyn("gczc", gcyz(int ), (int)13) + var12_15 / ia.gcyn("gczd", gcyz(int ), (int)14) * ia.gcyn("gcze", gcyz(int ), (int)15)), (float)ia.gcyn("gczf", gcyz(int ), (int)16), (float)ia.gcyn("gczg", gcyz(int ), (int)17));
                if (var21_7 || var21_7) ** GOTO lbl6
                var14_17 = class_3532.method_15363((float)(var13_16 * ia.gcyn("gczh", gcyz(int ), (int)18)), (float)ia.gcyn("gczi", gcyz(int ), (int)19), (float)ia.gcyn("gczj", gcyz(int ), (int)20));
                if (var21_7 || var21_7) ** GOTO lbl6
                var15_18 = class_3532.method_15363((float)(ia.gcyn("gczk", gcyz(int ), (int)21) + var10_13 * ia.gcyn("gczl", gcyz(int ), (int)22)), (float)ia.gcyn("gczm", gcyz(int ), (int)23), (float)ia.gcyn("gczn", gcyz(int ), (int)24));
                if (var21_7 || var21_7) ** GOTO lbl6
                var16_19 = class_3532.method_15363((float)(ia.gcyn("gczo", gcyz(int ), (int)25) + var11_14 * ia.gcyn("gczp", gcyz(int ), (int)26)), (float)ia.gcyn("gczq", gcyz(int ), (int)27), (float)ia.gcyn("gczr", gcyz(int ), (int)28));
                if (var21_7 || var21_7) ** GOTO lbl6
                var17_20 = class_3532.method_15363((float)(var8_11 * var13_16), (float)(-var15_18), (float)var15_18);
                if (var21_7 || var21_7) ** GOTO lbl6
                var18_21 = class_3532.method_15363((float)(var9_12 * var14_17), (float)(-var16_19), (float)var16_19);
                if (var21_7 || var21_7) ** GOTO lbl6
                var19_22 = this.approachStep(this.lastYawStep, var17_20, (float)ia.gcyn("gczs", gcyz(int ), (int)29));
                if (var21_7 || var21_7) ** GOTO lbl6
                var20_23 = this.approachStep(this.lastPitchStep, var18_21, (float)ia.gcyn("gczt", gcyz(int ), (int)30));
                if (var21_7 || var21_7) ** GOTO lbl6
                if (!(var10_13 < ia.gcyn("gczu", gcyz(int ), (int)31))) ** GOTO lbl98
                if (var21_7) ** GOTO lbl6
                var19_22 = var8_11;
                if (var21_7) ** GOTO lbl6
lbl98:
                // 2 sources

                if (var21_7 || var21_7) ** GOTO lbl6
                if (!(var11_14 < ia.gcyn("gczv", gcyz(int ), (int)32))) ** GOTO lbl103
                if (var21_7) ** GOTO lbl6
                var20_23 = var9_12;
                if (var21_7) ** GOTO lbl6
lbl103:
                // 2 sources

                if (var21_7 || var21_7) ** GOTO lbl6
                this.lerpYaw = var1_1.getYaw() + var19_22;
                if (var21_7 || var21_7) ** GOTO lbl6
                this.lerpPitch = class_3532.method_15363((float)(var1_1.getPitch() + var20_23), (float)ia.gcyn("gczw", gcyz(int ), (int)33), (float)ia.gcyn("gczx", gcyz(int ), (int)34));
                if (var21_7 || var21_7) ** GOTO lbl6
                this.lastYawStep = var19_22;
                if (var21_7 || var21_7) ** GOTO lbl6
                this.lastPitchStep = var20_23;
                if (!var21_7 && !var21_7) ** break;
                ** continue;
                return new ov(this.lerpYaw, this.lerpPitch);
            }
lbl114:
            // 3 sources

            case 0: {
                var22_6 /* !! */  = (int)ia.gcyn("gczy", gcyk(int ), (int)35);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl367
            }
            case 1: {
                var22_6 /* !! */  = (int)ia.gcyn("gczz", gcyk(int ), (int)36);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl394
            }
            case 2: {
                var22_6 /* !! */  = (int)ia.gcyn("gdaa", gcyk(int ), (int)37);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl134
            }
lbl129:
            // 2 sources

            case 3: {
                var22_6 /* !! */  = (int)ia.gcyn("gdab", gcyk(int ), (int)38);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl327
            }
lbl134:
            // 3 sources

            case 4: {
                var22_6 /* !! */  = (int)ia.gcyn("gdac", gcyk(int ), (int)39);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl495
            }
lbl139:
            // 2 sources

            case 5: {
                var22_6 /* !! */  = (int)ia.gcyn("gdad", gcyk(int ), (int)40);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl523
            }
lbl144:
            // 3 sources

            case 6: {
                var22_6 /* !! */  = (int)ia.gcyn("gdae", gcyk(int ), (int)41);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl420
            }
            case 7: {
                var22_6 /* !! */  = (int)ia.gcyn("gdaf", gcyk(int ), (int)42);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl433
            }
            case 8: {
                var22_6 /* !! */  = (int)ia.gcyn("gdag", gcyk(int ), (int)43);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl483
            }
            case 9: {
                var22_6 /* !! */  = (int)ia.gcyn("gdah", gcyk(int ), (int)44);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl495
            }
            case 10: {
                var22_6 /* !! */  = (int)ia.gcyn("gdai", gcyk(int ), (int)45);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl398
            }
            case 11: {
                var22_6 /* !! */  = (int)ia.gcyn("gdaj", gcyk(int ), (int)46);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl539
            }
            case 12: {
                var22_6 /* !! */  = (int)ia.gcyn("gdak", gcyk(int ), (int)47);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl371
            }
            case 13: {
                var22_6 /* !! */  = (int)ia.gcyn("gdal", gcyk(int ), (int)48);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl454
            }
lbl184:
            // 2 sources

            case 14: {
                var22_6 /* !! */  = (int)ia.gcyn("gdam", gcyk(int ), (int)49);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl380
            }
            case 15: {
                var22_6 /* !! */  = (int)ia.gcyn("gdan", gcyk(int ), (int)50);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl371
            }
            case 16: {
                var22_6 /* !! */  = (int)ia.gcyn("gdao", gcyk(int ), (int)51);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl271
            }
            case 17: {
                var22_6 /* !! */  = (int)ia.gcyn("gdap", gcyk(int ), (int)52);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl416
            }
lbl204:
            // 5 sources

            case 18: {
                var22_6 /* !! */  = (int)ia.gcyn("gdaq", gcyk(int ), (int)53);
                if (var23_5) {
                    throw null;
                }
            }
lbl208:
            // 4 sources

            case 19: {
                var22_6 /* !! */  = (int)ia.gcyn("gdar", gcyk(int ), (int)54);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl407
            }
lbl213:
            // 2 sources

            case 20: {
                var22_6 /* !! */  = (int)ia.gcyn("gdas", gcyk(int ), (int)55);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl463
            }
lbl218:
            // 2 sources

            case 21: {
                var22_6 /* !! */  = (int)ia.gcyn("gdat", gcyk(int ), (int)56);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl257
            }
            case 22: {
                var22_6 /* !! */  = (int)ia.gcyn("gdau", gcyk(int ), (int)57);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl233
            }
lbl228:
            // 2 sources

            case 23: {
                var22_6 /* !! */  = (int)ia.gcyn("gdav", gcyk(int ), (int)58);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl437
            }
lbl233:
            // 3 sources

            case 24: {
                var22_6 /* !! */  = (int)ia.gcyn("gdaw", gcyk(int ), (int)59);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl416
            }
lbl238:
            // 2 sources

            case 25: {
                var22_6 /* !! */  = (int)ia.gcyn("gdax", gcyk(int ), (int)60);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl515
            }
            case 26: {
                var22_6 /* !! */  = (int)ia.gcyn("gday", gcyk(int ), (int)61);
                if (!var23_5) ** GOTO lbl238
                throw null;
            }
            case 27: {
                var22_6 /* !! */  = (int)ia.gcyn("gdaz", gcyk(int ), (int)62);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl380
            }
lbl252:
            // 2 sources

            case 28: {
                var22_6 /* !! */  = (int)ia.gcyn("gdba", gcyk(int ), (int)63);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl495
            }
lbl257:
            // 3 sources

            case 29: {
                var22_6 /* !! */  = (int)ia.gcyn("gdbb", gcyk(int ), (int)64);
                if (var23_5) {
                    throw null;
                }
            }
            case 30: {
                var22_6 /* !! */  = (int)ia.gcyn("gdbc", gcyk(int ), (int)65);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl276
            }
            case 31: {
                var22_6 /* !! */  = (int)ia.gcyn("gdbd", gcyk(int ), (int)66);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl467
            }
lbl271:
            // 2 sources

            case 32: {
                var22_6 /* !! */  = (int)ia.gcyn("gdbe", gcyk(int ), (int)67);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl398
            }
lbl276:
            // 2 sources

            case 33: {
                var22_6 /* !! */  = (int)ia.gcyn("gdbf", gcyk(int ), (int)68);
                if (!var23_5) ** GOTO lbl213
                throw null;
            }
            case 34: {
                var22_6 /* !! */  = (int)ia.gcyn("gdbg", gcyk(int ), (int)69);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl403
            }
            case 35: {
                var22_6 /* !! */  = (int)ia.gcyn("gdbh", gcyk(int ), (int)70);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl371
            }
lbl290:
            // 4 sources

            case 36: {
                var22_6 /* !! */  = (int)ia.gcyn("gdbi", gcyk(int ), (int)71);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl318
            }
lbl295:
            // 2 sources

            case 37: {
                var22_6 /* !! */  = (int)ia.gcyn("gdbj", gcyk(int ), (int)72);
                if (!var23_5) ** GOTO lbl290
                throw null;
            }
            case 38: {
                var22_6 /* !! */  = (int)ia.gcyn("gdbk", gcyk(int ), (int)73);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl389
            }
            case 39: {
                var22_6 /* !! */  = (int)ia.gcyn("gdbl", gcyk(int ), (int)74);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl467
            }
lbl309:
            // 3 sources

            case 40: {
                var22_6 /* !! */  = (int)ia.gcyn("gdbm", gcyk(int ), (int)75);
                if (!var23_5) ** GOTO lbl233
                throw null;
            }
lbl313:
            // 3 sources

            case 41: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var22_6 /* !! */  = (int)ia.gcyn("gdbn", gcyk(int ), (int)76);
                    if (!var23_5) ** GOTO lbl204
                    throw null;
                }
            }
lbl318:
            // 3 sources

            case 42: {
                var22_6 /* !! */  = (int)ia.gcyn("gdbo", gcyk(int ), (int)77);
                if (!var23_5) ** GOTO lbl114
                throw null;
            }
            case 43: {
                var22_6 /* !! */  = (int)ia.gcyn("gdbp", gcyk(int ), (int)78);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl441
            }
lbl327:
            // 2 sources

            case 44: {
                var22_6 /* !! */  = (int)ia.gcyn("gdbq", gcyk(int ), (int)79);
                if (!var23_5) ** GOTO lbl290
                throw null;
            }
            case 45: {
                var22_6 /* !! */  = (int)ia.gcyn("gdbr", gcyk(int ), (int)80);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl487
            }
            case 46: {
                var22_6 /* !! */  = (int)ia.gcyn("gdbs", gcyk(int ), (int)81);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl398
            }
lbl341:
            // 2 sources

            case 47: {
                var22_6 /* !! */  = (int)ia.gcyn("gdbt", gcyk(int ), (int)82);
                if (!var23_5) ** GOTO lbl313
                throw null;
            }
            case 48: {
                var22_6 /* !! */  = (int)ia.gcyn("gdbu", gcyk(int ), (int)83);
                if (!var23_5) ** GOTO lbl309
                throw null;
            }
lbl349:
            // 3 sources

            case 49: {
                var22_6 /* !! */  = (int)ia.gcyn("gdbv", gcyk(int ), (int)84);
                if (!var23_5) ** GOTO lbl204
                throw null;
            }
lbl353:
            // 2 sources

            case 50: {
                var22_6 /* !! */  = (int)ia.gcyn("gdbw", gcyk(int ), (int)85);
                if (!var23_5) ** GOTO lbl144
                throw null;
            }
            case 51: {
                var22_6 /* !! */  = (int)ia.gcyn("gdbx", gcyk(int ), (int)86);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl483
            }
            case 52: {
                var22_6 /* !! */  = (int)ia.gcyn("gdby", gcyk(int ), (int)87);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl471
            }
lbl367:
            // 3 sources

            case 53: {
                var22_6 /* !! */  = (int)ia.gcyn("gdbz", gcyk(int ), (int)88);
                if (!var23_5) ** GOTO lbl204
                throw null;
            }
lbl371:
            // 4 sources

            case 54: {
                var22_6 /* !! */  = (int)ia.gcyn("gdca", gcyk(int ), (int)89);
                if (!var23_5) ** GOTO lbl252
                throw null;
            }
lbl375:
            // 2 sources

            case 55: {
                var22_6 /* !! */  = (int)ia.gcyn("gdcb", gcyk(int ), (int)90);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl463
            }
lbl380:
            // 3 sources

            case 56: {
                var22_6 /* !! */  = (int)ia.gcyn("gdcc", gcyk(int ), (int)91);
                if (!var23_5) ** GOTO lbl218
                throw null;
            }
            case 57: {
                var22_6 /* !! */  = (int)ia.gcyn("gdcd", gcyk(int ), (int)92);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl535
            }
lbl389:
            // 3 sources

            case 58: {
                var22_6 /* !! */  = (int)ia.gcyn("gdce", gcyk(int ), (int)93);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl446
            }
lbl394:
            // 4 sources

            case 59: {
                var22_6 /* !! */  = (int)ia.gcyn("gdcf", gcyk(int ), (int)94);
                if (!var23_5) ** GOTO lbl184
                throw null;
            }
lbl398:
            // 4 sources

            case 60: {
                var22_6 /* !! */  = (int)ia.gcyn("gdcg", gcyk(int ), (int)95);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl491
            }
lbl403:
            // 2 sources

            case 61: {
                var22_6 /* !! */  = (int)ia.gcyn("gdch", gcyk(int ), (int)96);
                if (!var23_5) ** GOTO lbl313
                throw null;
            }
lbl407:
            // 2 sources

            case 62: {
                var22_6 /* !! */  = (int)ia.gcyn("gdci", gcyk(int ), (int)97);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl437
            }
            case 63: {
                var22_6 /* !! */  = (int)ia.gcyn("gdcj", gcyk(int ), (int)98);
                if (!var23_5) ** GOTO lbl375
                throw null;
            }
lbl416:
            // 3 sources

            case 64: {
                var22_6 /* !! */  = (int)ia.gcyn("gdck", gcyk(int ), (int)99);
                if (!var23_5) ** GOTO lbl114
                throw null;
            }
lbl420:
            // 3 sources

            case 65: {
                var22_6 /* !! */  = (int)ia.gcyn("gdcl", gcyk(int ), (int)100);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl499
            }
            case 66: {
                var22_6 /* !! */  = (int)ia.gcyn("gdcm", gcyk(int ), (int)101);
                if (!var23_5) ** GOTO lbl309
                throw null;
            }
            case 67: {
                var22_6 /* !! */  = (int)ia.gcyn("gdcn", gcyk(int ), (int)102);
                if (!var23_5) ** GOTO lbl139
                throw null;
            }
lbl433:
            // 3 sources

            case 68: {
                var22_6 /* !! */  = (int)ia.gcyn("gdco", gcyk(int ), (int)103);
                if (!var23_5) ** GOTO lbl295
                throw null;
            }
lbl437:
            // 4 sources

            case 69: {
                var22_6 /* !! */  = (int)ia.gcyn("gdcp", gcyk(int ), (int)104);
                if (!var23_5) ** GOTO lbl318
                throw null;
            }
lbl441:
            // 2 sources

            case 70: {
                var22_6 /* !! */  = (int)ia.gcyn("gdcq", gcyk(int ), (int)105);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl491
            }
lbl446:
            // 3 sources

            case 71: {
                var22_6 /* !! */  = (int)ia.gcyn("gdcr", gcyk(int ), (int)106);
                if (!var23_5) ** GOTO lbl349
                throw null;
            }
            case 72: {
                var22_6 /* !! */  = (int)ia.gcyn("gdcs", gcyk(int ), (int)107);
                if (!var23_5) ** GOTO lbl394
                throw null;
            }
lbl454:
            // 2 sources

            case 73: {
                var22_6 /* !! */  = (int)ia.gcyn("gdct", gcyk(int ), (int)108);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl471
            }
            case 74: {
                var22_6 /* !! */  = (int)ia.gcyn("gdcu", gcyk(int ), (int)109);
                if (!var23_5) ** GOTO lbl353
                throw null;
            }
lbl463:
            // 3 sources

            case 75: {
                var22_6 /* !! */  = (int)ia.gcyn("gdcv", gcyk(int ), (int)110);
                if (!var23_5) ** GOTO lbl257
                throw null;
            }
lbl467:
            // 3 sources

            case 76: {
                var22_6 /* !! */  = (int)ia.gcyn("gdcw", gcyk(int ), (int)111);
                if (!var23_5) ** GOTO lbl437
                throw null;
            }
lbl471:
            // 3 sources

            case 77: {
                var22_6 /* !! */  = (int)ia.gcyn("gdcx", gcyk(int ), (int)112);
                if (!var23_5) ** GOTO lbl389
                throw null;
            }
            case 78: {
                var22_6 /* !! */  = (int)ia.gcyn("gdcy", gcyk(int ), (int)113);
                if (!var23_5) ** GOTO lbl290
                throw null;
            }
            case 79: {
                var22_6 /* !! */  = (int)ia.gcyn("gdcz", gcyk(int ), (int)114);
                if (!var23_5) ** GOTO lbl446
                throw null;
            }
lbl483:
            // 3 sources

            case 80: {
                var22_6 /* !! */  = (int)ia.gcyn("gdda", gcyk(int ), (int)115);
                if (!var23_5) ** GOTO lbl134
                throw null;
            }
lbl487:
            // 2 sources

            case 81: {
                var22_6 /* !! */  = (int)ia.gcyn("gddb", gcyk(int ), (int)116);
                if (!var23_5) ** GOTO lbl349
                throw null;
            }
lbl491:
            // 5 sources

            case 82: {
                var22_6 /* !! */  = (int)ia.gcyn("gddc", gcyk(int ), (int)117);
                if (!var23_5) ** GOTO lbl394
                throw null;
            }
lbl495:
            // 5 sources

            case 83: {
                var22_6 /* !! */  = (int)ia.gcyn("gddd", gcyk(int ), (int)118);
                if (!var23_5) ** GOTO lbl208
                throw null;
            }
lbl499:
            // 2 sources

            case 84: {
                var22_6 /* !! */  = (int)ia.gcyn("gdde", gcyk(int ), (int)119);
                if (!var23_5) ** GOTO lbl341
                throw null;
            }
            case 85: {
                var22_6 /* !! */  = (int)ia.gcyn("gddf", gcyk(int ), (int)120);
                if (!var23_5) ** GOTO lbl495
                throw null;
            }
            case 86: {
                var22_6 /* !! */  = (int)ia.gcyn("gddg", gcyk(int ), (int)121);
                if (!var23_5) ** GOTO lbl420
                throw null;
            }
            case 87: {
                var22_6 /* !! */  = (int)ia.gcyn("gddh", gcyk(int ), (int)122);
                if (!var23_5) ** GOTO lbl491
                throw null;
            }
lbl515:
            // 2 sources

            case 88: {
                var22_6 /* !! */  = (int)ia.gcyn("gddi", gcyk(int ), (int)123);
                if (!var23_5) ** GOTO lbl144
                throw null;
            }
            case 89: {
                var22_6 /* !! */  = (int)ia.gcyn("gddj", gcyk(int ), (int)124);
                if (!var23_5) ** GOTO lbl228
                throw null;
            }
lbl523:
            // 2 sources

            case 90: {
                var22_6 /* !! */  = (int)ia.gcyn("gddk", gcyk(int ), (int)125);
                if (!var23_5) ** GOTO lbl433
                throw null;
            }
            case 91: {
                var22_6 /* !! */  = (int)ia.gcyn("gddl", gcyk(int ), (int)126);
                if (!var23_5) ** GOTO lbl367
                throw null;
            }
            case 92: {
                var22_6 /* !! */  = (int)ia.gcyn("gddm", gcyk(int ), (int)127);
                if (!var23_5) ** GOTO lbl204
                throw null;
            }
lbl535:
            // 2 sources

            case 93: {
                var22_6 /* !! */  = (int)ia.gcyn("gddn", gcyk(int ), (int)128);
                if (!var23_5) ** GOTO lbl491
                throw null;
            }
lbl539:
            // 2 sources

            case 94: {
                var22_6 /* !! */  = (int)ia.gcyn("gddo", gcyk(int ), (int)129);
                if (!var23_5) ** GOTO lbl129
                throw null;
            }
            case 95: 
        }
        var22_6 /* !! */  = (int)ia.gcyn("gddp", gcyk(int ), (int)130);
        ** while (!var23_5)
lbl546:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void gdqp() {
        ia.gcym[0] = -1990020558;
        ia.gcym[1] = -278016996;
        ia.gcym[2] = -1792657838;
        ia.gcym[3] = 138125562;
        ia.gcym[4] = -244907642;
        ia.gcym[5] = -1929640276;
        ia.gcym[6] = 583496736;
        ia.gcym[7] = -1918563073;
        ia.gcym[8] = 256737234;
        ia.gcym[9] = 1458212544;
        ia.gcym[10] = 723442728;
        ia.gcym[11] = -662945120;
        ia.gcym[12] = 1038845424;
        ia.gcym[13] = 1172270484;
        ia.gcym[14] = -1331566454;
        ia.gcym[15] = 432856352;
        ia.gcym[16] = -19072146;
        ia.gcym[17] = 2013231668;
        ia.gcym[18] = -352216209;
        ia.gcym[19] = -611903105;
        ia.gcym[20] = -1351563647;
        ia.gcym[21] = 1931426917;
        ia.gcym[22] = 1141109269;
        ia.gcym[23] = 1961479677;
        ia.gcym[24] = -203962566;
        ia.gcym[25] = -1453024828;
        ia.gcym[26] = -417794774;
        ia.gcym[27] = -15346207;
        ia.gcym[28] = -1653878281;
        ia.gcym[29] = -982273744;
        ia.gcym[30] = 1975515742;
        ia.gcym[31] = -377096842;
        ia.gcym[32] = 1145527579;
        ia.gcym[33] = -1878816667;
        ia.gcym[34] = -1492718797;
        ia.gcym[35] = 1616018006;
        ia.gcym[36] = 1253955073;
        ia.gcym[37] = 1868394473;
        ia.gcym[38] = -759782121;
        ia.gcym[39] = 1457003498;
        ia.gcym[40] = -976236243;
        ia.gcym[41] = 1276395818;
        ia.gcym[42] = 1985791667;
        ia.gcym[43] = 483254320;
        ia.gcym[44] = 2142603716;
        ia.gcym[45] = 728685288;
        ia.gcym[46] = 76840581;
        ia.gcym[47] = -766637889;
        ia.gcym[48] = 1548575806;
        ia.gcym[49] = -774668336;
        ia.gcym[50] = -84595028;
        ia.gcym[51] = 85085192;
        ia.gcym[52] = 702769241;
        ia.gcym[53] = -466093207;
        ia.gcym[54] = -1708721662;
        ia.gcym[55] = -295444771;
        ia.gcym[56] = -425597360;
        ia.gcym[57] = 292860211;
        ia.gcym[58] = 1258983023;
        ia.gcym[59] = -1572597193;
        ia.gcym[60] = -1152730292;
        ia.gcym[61] = -107546099;
        ia.gcym[62] = -320683908;
        ia.gcym[63] = 2103085363;
        ia.gcym[64] = 299624731;
        ia.gcym[65] = -1540262953;
        ia.gcym[66] = 4443174;
        ia.gcym[67] = -58569890;
        ia.gcym[68] = -373721825;
        ia.gcym[69] = 359606103;
        ia.gcym[70] = -92975372;
        ia.gcym[71] = 647968561;
        ia.gcym[72] = -1239301496;
        ia.gcym[73] = -828856224;
        ia.gcym[74] = 1915834187;
        ia.gcym[75] = -738617122;
        ia.gcym[76] = -28255291;
        ia.gcym[77] = 562224;
        ia.gcym[78] = 1249633537;
        ia.gcym[79] = 1844832589;
        ia.gcym[80] = -1542824137;
        ia.gcym[81] = -897641958;
        ia.gcym[82] = 1475630895;
        ia.gcym[83] = -1965360799;
        ia.gcym[84] = 478741287;
        ia.gcym[85] = -358991260;
        ia.gcym[86] = 565822282;
        ia.gcym[87] = -608629378;
        ia.gcym[88] = 877520122;
        ia.gcym[89] = 1966311282;
        ia.gcym[90] = -1911905932;
        ia.gcym[91] = -760697521;
        ia.gcym[92] = -952559710;
        ia.gcym[93] = 885044515;
        ia.gcym[94] = 1432861199;
        ia.gcym[95] = -843043900;
        ia.gcym[96] = 2130191704;
        ia.gcym[97] = -1327975814;
        ia.gcym[98] = -1569169261;
        ia.gcym[99] = 1267411802;
    }

    private static /* synthetic */ void gdql() {
        ia.gcyl[0] = 157463090;
        ia.gcyl[1] = -278016996;
        ia.gcyl[2] = -1792657840;
        ia.gcyl[3] = 138125563;
        ia.gcyl[4] = -244907646;
        ia.gcyl[5] = -1929640275;
        ia.gcyl[6] = 583496736;
        ia.gcyl[7] = -1918563073;
        ia.gcyl[8] = 256737234;
        ia.gcyl[9] = 1458212544;
        ia.gcyl[10] = 723442729;
        ia.gcyl[11] = 449331872;
        ia.gcyl[12] = 2136966640;
        ia.gcyl[13] = 2059858958;
        ia.gcyl[14] = -204347254;
        ia.gcyl[15] = 607723439;
        ia.gcyl[16] = -1044028684;
        ia.gcyl[17] = 1221012440;
        ia.gcyl[18] = -731849535;
        ia.gcyl[19] = -460512242;
        ia.gcyl[20] = -1873604213;
        ia.gcyl[21] = 855587941;
        ia.gcyl[22] = 2050728953;
        ia.gcyl[23] = 890883581;
        ia.gcyl[24] = -1316501702;
        ia.gcyl[25] = -387671612;
        ia.gcyl[26] = -650436064;
        ia.gcyl[27] = -1096952351;
        ia.gcyl[28] = -594816521;
        ia.gcyl[29] = -2068598480;
        ia.gcyl[30] = 888142430;
        ia.gcyl[31] = -684276155;
        ia.gcyl[32] = 2059885851;
        ia.gcyl[33] = 1387759717;
        ia.gcyl[34] = -441259213;
        ia.gcyl[35] = 1616017937;
        ia.gcyl[36] = 1253955117;
        ia.gcyl[37] = 1868394410;
        ia.gcyl[38] = -759782095;
        ia.gcyl[39] = 1457003427;
        ia.gcyl[40] = -976236191;
        ia.gcyl[41] = 1276395886;
        ia.gcyl[42] = 1985791622;
        ia.gcyl[43] = 483254331;
        ia.gcyl[44] = 2142603656;
        ia.gcyl[45] = 728685243;
        ia.gcyl[46] = 76840648;
        ia.gcyl[47] = -766637890;
        ia.gcyl[48] = 1548575769;
        ia.gcyl[49] = -774668312;
        ia.gcyl[50] = -84595027;
        ia.gcyl[51] = 85085240;
        ia.gcyl[52] = 702769263;
        ia.gcyl[53] = -466093210;
        ia.gcyl[54] = -1708721597;
        ia.gcyl[55] = -295444761;
        ia.gcyl[56] = -425597357;
        ia.gcyl[57] = 292860204;
        ia.gcyl[58] = 1258982984;
        ia.gcyl[59] = -1572597189;
        ia.gcyl[60] = -1152730368;
        ia.gcyl[61] = -107546066;
        ia.gcyl[62] = -320683915;
        ia.gcyl[63] = 2103085418;
        ia.gcyl[64] = 299624797;
        ia.gcyl[65] = -1540262930;
        ia.gcyl[66] = 4443248;
        ia.gcyl[67] = -58569970;
        ia.gcyl[68] = -373721779;
        ia.gcyl[69] = 359606016;
        ia.gcyl[70] = -92975453;
        ia.gcyl[71] = 647968620;
        ia.gcyl[72] = -1239301489;
        ia.gcyl[73] = -828856228;
        ia.gcyl[74] = 1915834125;
        ia.gcyl[75] = -738617132;
        ia.gcyl[76] = -28255251;
        ia.gcyl[77] = 562231;
        ia.gcyl[78] = 1249633609;
        ia.gcyl[79] = 1844832517;
        ia.gcyl[80] = -1542824095;
        ia.gcyl[81] = -897641892;
        ia.gcyl[82] = 1475630906;
        ia.gcyl[83] = -1965360787;
        ia.gcyl[84] = 478741251;
        ia.gcyl[85] = -358991313;
        ia.gcyl[86] = 565822312;
        ia.gcyl[87] = -608629421;
        ia.gcyl[88] = 877520105;
        ia.gcyl[89] = 1966311278;
        ia.gcyl[90] = -1911905928;
        ia.gcyl[91] = -760697593;
        ia.gcyl[92] = -952559639;
        ia.gcyl[93] = 885044543;
        ia.gcyl[94] = 1432861278;
        ia.gcyl[95] = -843043941;
        ia.gcyl[96] = 2130191721;
        ia.gcyl[97] = -1327975891;
        ia.gcyl[98] = -1569169225;
        ia.gcyl[99] = 1267411834;
    }

    private static /* synthetic */ void gdqq() {
        ia.gcym[100] = 1903065223;
        ia.gcym[101] = -941389440;
        ia.gcym[102] = 175572897;
        ia.gcym[103] = 415212190;
        ia.gcym[104] = -628695029;
        ia.gcym[105] = 33972585;
        ia.gcym[106] = 382370392;
        ia.gcym[107] = -1465899789;
        ia.gcym[108] = 404529818;
        ia.gcym[109] = -1043661067;
        ia.gcym[110] = -1914599706;
        ia.gcym[111] = 171144082;
        ia.gcym[112] = 647878018;
        ia.gcym[113] = 890529561;
        ia.gcym[114] = -55884191;
        ia.gcym[115] = -1737123118;
        ia.gcym[116] = -1192236396;
        ia.gcym[117] = 1307084766;
        ia.gcym[118] = 1013001686;
        ia.gcym[119] = -1960370263;
        ia.gcym[120] = 1899669856;
        ia.gcym[121] = 548473736;
        ia.gcym[122] = -1358748510;
        ia.gcym[123] = -1524432526;
        ia.gcym[124] = -104003678;
        ia.gcym[125] = 991148537;
        ia.gcym[126] = 556325888;
        ia.gcym[127] = 476877807;
        ia.gcym[128] = -1198353157;
        ia.gcym[129] = -307950505;
        ia.gcym[130] = -287308829;
        ia.gcym[131] = -1899233099;
        ia.gcym[132] = 1680237340;
        ia.gcym[133] = -1808293802;
        ia.gcym[134] = 417424968;
        ia.gcym[135] = -1642637730;
        ia.gcym[136] = 1501048205;
        ia.gcym[137] = 661282596;
        ia.gcym[138] = 1849511337;
        ia.gcym[139] = 1091129469;
        ia.gcym[140] = -1755225504;
        ia.gcym[141] = 1979002086;
        ia.gcym[142] = 1556226033;
        ia.gcym[143] = 1943880728;
        ia.gcym[144] = -2132496586;
        ia.gcym[145] = -1084195714;
        ia.gcym[146] = -1523945685;
        ia.gcym[147] = 1395584374;
        ia.gcym[148] = 919594365;
        ia.gcym[149] = -1699428018;
        ia.gcym[150] = -1618028839;
        ia.gcym[151] = 1318335523;
        ia.gcym[152] = 26829065;
        ia.gcym[153] = 211750150;
        ia.gcym[154] = 1711854632;
        ia.gcym[155] = 102887702;
        ia.gcym[156] = -836977299;
        ia.gcym[157] = 807627885;
        ia.gcym[158] = 1823370596;
        ia.gcym[159] = 267678485;
        ia.gcym[160] = -1277358964;
        ia.gcym[161] = -2042139551;
        ia.gcym[162] = -1336124243;
        ia.gcym[163] = -57580200;
        ia.gcym[164] = -1625595281;
        ia.gcym[165] = 1656484636;
        ia.gcym[166] = -622087701;
        ia.gcym[167] = -701563796;
        ia.gcym[168] = -1901475241;
        ia.gcym[169] = 223320504;
        ia.gcym[170] = -741662721;
        ia.gcym[171] = -1320776358;
        ia.gcym[172] = 1666185494;
        ia.gcym[173] = -982117900;
        ia.gcym[174] = -1362925254;
        ia.gcym[175] = 1654059784;
        ia.gcym[176] = -1239920486;
        ia.gcym[177] = -692476872;
        ia.gcym[178] = -80634094;
        ia.gcym[179] = 1646093790;
        ia.gcym[180] = 288426186;
        ia.gcym[181] = -1766323754;
        ia.gcym[182] = 1132013842;
        ia.gcym[183] = -2116965972;
        ia.gcym[184] = -713649772;
        ia.gcym[185] = 932980626;
        ia.gcym[186] = 1914357522;
        ia.gcym[187] = -1000557110;
        ia.gcym[188] = -92700090;
        ia.gcym[189] = 1494903908;
        ia.gcym[190] = -1627585880;
        ia.gcym[191] = 164576128;
        ia.gcym[192] = 824420893;
        ia.gcym[193] = -1240606597;
        ia.gcym[194] = -12205090;
        ia.gcym[195] = -657477976;
        ia.gcym[196] = 390403611;
        ia.gcym[197] = 36696197;
        ia.gcym[198] = -873726684;
        ia.gcym[199] = -2012367726;
    }

    static {
        gcyl = new int[331];
        gcym = new int[331];
        ia.gdql();
        ia.gdqm();
        ia.gdqn();
        ia.gdqo();
        ia.gdqp();
        ia.gdqq();
        ia.gdqr();
        ia.gdqs();
        gddr = new long[129];
        gdds = new long[129];
        ia.gdqt();
        ia.gdqu();
        ia.gdqv();
        ia.gdqw();
        VERTICAL_MULTIPOINTS = new double[]{0.88, 0.7, 0.56};
        HORIZONTAL_MULTIPOINTS = new double[][]{{0.0, 0.0}, {-1.0, 0.0}, {1.0, 0.0}, {0.0, -1.0}, {0.0, 1.0}};
    }

    private static /* synthetic */ void gdqm() {
        ia.gcyl[100] = 1903065311;
        ia.gcyl[101] = -941389394;
        ia.gcyl[102] = 175572982;
        ia.gcyl[103] = 415212163;
        ia.gcyl[104] = -628694989;
        ia.gcyl[105] = 33972577;
        ia.gcyl[106] = 382370311;
        ia.gcyl[107] = -1465899869;
        ia.gcyl[108] = 404529833;
        ia.gcyl[109] = -1043661122;
        ia.gcyl[110] = -1914599773;
        ia.gcyl[111] = 171144152;
        ia.gcyl[112] = 647878052;
        ia.gcyl[113] = 890529559;
        ia.gcyl[114] = -55884255;
        ia.gcyl[115] = -1737123092;
        ia.gcyl[116] = -1192236326;
        ia.gcyl[117] = 1307084771;
        ia.gcyl[118] = 1013001628;
        ia.gcyl[119] = -1960370198;
        ia.gcyl[120] = 1899669800;
        ia.gcyl[121] = 548473779;
        ia.gcyl[122] = -1358748419;
        ia.gcyl[123] = -1524432548;
        ia.gcyl[124] = -104003705;
        ia.gcyl[125] = 991148493;
        ia.gcyl[126] = 556325906;
        ia.gcyl[127] = 476877756;
        ia.gcyl[128] = -1198353178;
        ia.gcyl[129] = -307950526;
        ia.gcyl[130] = -287308874;
        ia.gcyl[131] = -1899233100;
        ia.gcyl[132] = 1680237340;
        ia.gcyl[133] = -1808293802;
        ia.gcyl[134] = 417424973;
        ia.gcyl[135] = -1642637737;
        ia.gcyl[136] = 1501048224;
        ia.gcyl[137] = 661282575;
        ia.gcyl[138] = 1849511406;
        ia.gcyl[139] = 1091129416;
        ia.gcyl[140] = -1755225567;
        ia.gcyl[141] = 1979002108;
        ia.gcyl[142] = 1556226042;
        ia.gcyl[143] = 1943880734;
        ia.gcyl[144] = -2132496621;
        ia.gcyl[145] = -1084195729;
        ia.gcyl[146] = -1523945685;
        ia.gcyl[147] = 1395584355;
        ia.gcyl[148] = 919594328;
        ia.gcyl[149] = -1699428020;
        ia.gcyl[150] = -1618028827;
        ia.gcyl[151] = 1318335542;
        ia.gcyl[152] = 26829097;
        ia.gcyl[153] = 211750184;
        ia.gcyl[154] = 1711854595;
        ia.gcyl[155] = 102887690;
        ia.gcyl[156] = -836977362;
        ia.gcyl[157] = 807627856;
        ia.gcyl[158] = 1823370580;
        ia.gcyl[159] = 267678465;
        ia.gcyl[160] = -1277358929;
        ia.gcyl[161] = -2042139567;
        ia.gcyl[162] = -1336124276;
        ia.gcyl[163] = -57580214;
        ia.gcyl[164] = -1625595269;
        ia.gcyl[165] = 1656484664;
        ia.gcyl[166] = -622087723;
        ia.gcyl[167] = -701563796;
        ia.gcyl[168] = -1901475235;
        ia.gcyl[169] = 223320570;
        ia.gcyl[170] = -741662757;
        ia.gcyl[171] = -1320776379;
        ia.gcyl[172] = 1666185531;
        ia.gcyl[173] = -982117923;
        ia.gcyl[174] = -1362925271;
        ia.gcyl[175] = 1654059785;
        ia.gcyl[176] = -1239920500;
        ia.gcyl[177] = -692476922;
        ia.gcyl[178] = -80634073;
        ia.gcyl[179] = 1646093801;
        ia.gcyl[180] = 288426207;
        ia.gcyl[181] = -1766323767;
        ia.gcyl[182] = 1132013865;
        ia.gcyl[183] = -2116965979;
        ia.gcyl[184] = -713649782;
        ia.gcyl[185] = 932980624;
        ia.gcyl[186] = 1914357525;
        ia.gcyl[187] = -1000557182;
        ia.gcyl[188] = -92700157;
        ia.gcyl[189] = 1494903915;
        ia.gcyl[190] = -1627585903;
        ia.gcyl[191] = 164576185;
        ia.gcyl[192] = 824420922;
        ia.gcyl[193] = -1240606622;
        ia.gcyl[194] = -12205094;
        ia.gcyl[195] = -657477962;
        ia.gcyl[196] = 390403603;
        ia.gcyl[197] = 36696205;
        ia.gcyl[198] = -873726700;
        ia.gcyl[199] = -2012367738;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private ov angleTo(class_243 var1_1, class_243 var2_2, ov var3_3) {
        block94: {
            v0 /* !! */  = ia.nf;
            if (true) ** GOTO lbl5
            block62: while (true) {
                v0 /* !! */  = (long)(v1 - ia.gcyn("gdhf", gdhe(int ), (int)7));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -1810810136: {
                        break block62;
                    }
                    case -664690783: {
                        v1 = ia.gcyn("gdhg", gdhe(int ), (int)8);
                        continue block62;
                    }
                    case 1650105754: {
                        v1 = ia.gcyn("gdhh", gdhe(int ), (int)9);
                        continue block62;
                    }
                }
                break;
            }
            var9_4 = ia.c;
            v2 /* !! */  = ia.nf;
            if (true) ** GOTO lbl19
            block63: while (true) {
                v2 /* !! */  = (long)(v3 - ia.gcyn("gdhi", gdhe(int ), (int)10));
lbl19:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case -1810810136: {
                        break block63;
                    }
                    case -685959277: {
                        v3 = ia.gcyn("gdhj", gdhe(int ), (int)11);
                        continue block63;
                    }
                    case 27209972: {
                        v3 = ia.gcyn("gdhk", gdhe(int ), (int)12);
                        continue block63;
                    }
                    case 1045428063: {
                        v3 = ia.gcyn("gdhl", gdhe(int ), (int)13);
                        continue block63;
                    }
                }
                break;
            }
            var8_5 /* !! */  = ia.b;
            while (true) {
                if ((v4 /* !! */  = (cfr_temp_0 = ia.nf - ia.gcyn("gdhm", gdhe(int ), (int)14)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v4 /* !! */  == ia.gcyn("gdhn", gcyk(int ), (int)213)) break;
                v4 /* !! */  = (long)ia.gcyn("gdho", gcyk(int ), (int)214);
            }
            var7_6 = ia.a;
            if (var9_4) {
                throw null;
lbl40:
                // 6 sources

                return null;
            }
            if (var7_6 || var7_6) ** GOTO lbl40
            v5 /* !! */  = ia.nf;
            if (true) ** GOTO lbl47
            block66: while (true) {
                v5 /* !! */  = (long)(v6 - ia.gcyn("gdhp", gdhe(int ), (int)15));
lbl47:
                // 2 sources

                switch ((int)v5 /* !! */ ) {
                    case -1810810136: {
                        break block66;
                    }
                    case -1734694886: {
                        v6 = ia.gcyn("gdhq", gdhe(int ), (int)16);
                        continue block66;
                    }
                    case -1374570004: {
                        v6 = ia.gcyn("gdhr", gdhe(int ), (int)17);
                        continue block66;
                    }
                }
                break;
            }
            var4_7 = var2_2.method_1020(var1_1);
            if (var7_6 || var7_6) ** GOTO lbl40
            while (true) {
                if ((v7 /* !! */  = (cfr_temp_1 = ia.nf - ia.gcyn("gdhs", gdhe(int ), (int)18)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v7 /* !! */  == ia.gcyn("gdht", gcyk(int ), (int)215)) break;
                v7 /* !! */  = (long)ia.gcyn("gdhu", gcyk(int ), (int)216);
            }
            if (!(var4_7.method_1027() < ia.gcyn("gdhv", gddq(int ), (int)19))) break block94;
            if (var7_6 || var7_6) ** GOTO lbl40
            return var3_3;
        }
        if (var7_6 || var7_6) ** GOTO lbl40
        v8 /* !! */  = ia.nf;
        if (true) ** GOTO lbl72
        block68: while (true) {
            v8 /* !! */  = (long)(v9 - ia.gcyn("gdhw", gdhe(int ), (int)20));
lbl72:
            // 2 sources

            switch ((int)v8 /* !! */ ) {
                case -1810810136: {
                    break block68;
                }
                case 24834076: {
                    v9 = ia.gcyn("gdhx", gdhe(int ), (int)21);
                    continue block68;
                }
                case 372418586: {
                    v9 = ia.gcyn("gdhy", gdhe(int ), (int)22);
                    continue block68;
                }
                case 1405678067: {
                    v9 = ia.gcyn("gdhz", gdhe(int ), (int)23);
                    continue block68;
                }
            }
            break;
        }
        v10 = -var4_7.field_1352;
        while (true) {
            if ((v11 /* !! */  = (cfr_temp_2 = ia.nf - ia.gcyn("gdia", gdhe(int ), (int)24)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v11 /* !! */  == ia.gcyn("gdib", gcyk(int ), (int)217)) break;
            v11 /* !! */  = (long)ia.gcyn("gdic", gcyk(int ), (int)218);
        }
        v12 = var4_7.field_1350;
        while (true) {
            if ((v13 /* !! */  = (cfr_temp_3 = ia.nf - ia.gcyn("gdid", gdhe(int ), (int)25)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v13 /* !! */  == ia.gcyn("gdie", gcyk(int ), (int)219)) break;
            v13 /* !! */  = (long)ia.gcyn("gdif", gcyk(int ), (int)220);
        }
        v14 = Math.atan2(v10, v12);
        v15 /* !! */  = ia.nf;
        if (true) ** GOTO lbl101
        block71: while (true) {
            v15 /* !! */  = (long)(v16 - ia.gcyn("gdig", gdhe(int ), (int)26));
lbl101:
            // 2 sources

            switch ((int)v15 /* !! */ ) {
                case -1810810136: {
                    break block71;
                }
                case -1420924423: {
                    v16 = ia.gcyn("gdih", gdhe(int ), (int)27);
                    continue block71;
                }
                case -1344743525: {
                    v16 = ia.gcyn("gdii", gdhe(int ), (int)28);
                    continue block71;
                }
                case 1620609372: {
                    v16 = ia.gcyn("gdij", gdhe(int ), (int)29);
                    continue block71;
                }
            }
            break;
        }
        var5_8 = (float)Math.toDegrees(v14);
        if (var7_6 || var7_6) ** GOTO lbl40
        if (var8_5 /* !! */  == 0) ** GOTO lbl-1000
        switch (var8_5 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v17 /* !! */  = (cfr_temp_4 = ia.nf - ia.gcyn("gdik", gdhe(int ), (int)30)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v17 /* !! */  == ia.gcyn("gdil", gcyk(int ), (int)221)) break;
                    v17 /* !! */  = (long)ia.gcyn("gdim", gcyk(int ), (int)222);
                }
                v18 = var4_7.field_1351;
                while (true) {
                    if ((v19 /* !! */  = (cfr_temp_5 = ia.nf - ia.gcyn("gdin", gdhe(int ), (int)31)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v19 /* !! */  == ia.gcyn("gdio", gcyk(int ), (int)223)) break;
                    v19 /* !! */  = (long)ia.gcyn("gdip", gcyk(int ), (int)224);
                }
                v20 = var4_7.field_1352;
                v21 /* !! */  = ia.nf;
                if (true) ** GOTO lbl134
                block74: while (true) {
                    v21 /* !! */  = (long)(ia.gcyn("gdir", gdhe(int ), (int)33) - ia.gcyn("gdiq", gdhe(int ), (int)32));
lbl134:
                    // 2 sources

                    switch ((int)v21 /* !! */ ) {
                        case -1810810136: {
                            break block74;
                        }
                        case 1485907082: {
                            continue block74;
                        }
                    }
                    break;
                }
                v22 = var4_7.field_1350;
                v23 /* !! */  = ia.nf;
                if (true) ** GOTO lbl144
                block75: while (true) {
                    v23 /* !! */  = (long)(ia.gcyn("gdit", gdhe(int ), (int)35) - ia.gcyn("gdis", gdhe(int ), (int)34));
lbl144:
                    // 2 sources

                    switch ((int)v23 /* !! */ ) {
                        case -1810810136: {
                            break block75;
                        }
                        case 757876504: {
                            continue block75;
                        }
                    }
                    break;
                }
                v24 = Math.hypot(v20, v22);
                v25 /* !! */  = ia.nf;
                if (true) ** GOTO lbl154
                block76: while (true) {
                    v25 /* !! */  = (long)(ia.gcyn("gdiv", gdhe(int ), (int)37) - ia.gcyn("gdiu", gdhe(int ), (int)36));
lbl154:
                    // 2 sources

                    switch ((int)v25 /* !! */ ) {
                        case -1810810136: {
                            break block76;
                        }
                        case 1169046934: {
                            continue block76;
                        }
                    }
                    break;
                }
                v26 = Math.atan2(v18, v24);
                while (true) {
                    if ((v27 /* !! */  = (cfr_temp_6 = ia.nf - ia.gcyn("gdiw", gdhe(int ), (int)38)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v27 /* !! */  == ia.gcyn("gdix", gcyk(int ), (int)225)) break;
                    v27 /* !! */  = (long)ia.gcyn("gdiy", gcyk(int ), (int)226);
                }
                v28 = -Math.toDegrees(v26);
                v29 = ia.gcyn("gdiz", gddq(int ), (int)39);
                v30 = ia.gcyn("gdja", gddq(int ), (int)40);
                v31 /* !! */  = ia.nf;
                if (true) ** GOTO lbl172
                block78: while (true) {
                    v31 /* !! */  = (long)(v32 - ia.gcyn("gdjb", gdhe(int ), (int)41));
lbl172:
                    // 2 sources

                    switch ((int)v31 /* !! */ ) {
                        case -1810810136: {
                            break block78;
                        }
                        case 424453768: {
                            v32 = ia.gcyn("gdjc", gdhe(int ), (int)42);
                            continue block78;
                        }
                        case 1871769369: {
                            v32 = ia.gcyn("gdjd", gdhe(int ), (int)43);
                            continue block78;
                        }
                    }
                    break;
                }
                var6_9 = (float)class_3532.method_15350((double)v28, (double)v29, (double)v30);
                if (var7_6 || var7_6) ** continue;
                while (true) {
                    if ((v33 /* !! */  = (cfr_temp_7 = ia.nf - ia.gcyn("gdje", gdhe(int ), (int)44)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v33 /* !! */  == ia.gcyn("gdjf", gcyk(int ), (int)227)) break;
                    v33 /* !! */  = (long)ia.gcyn("gdjg", gcyk(int ), (int)228);
                }
                while (true) {
                    if ((v34 /* !! */  = (cfr_temp_8 = ia.nf - ia.gcyn("gdjh", gdhe(int ), (int)45)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v34 /* !! */  == ia.gcyn("gdji", gcyk(int ), (int)229)) break;
                    v34 /* !! */  = (long)ia.gcyn("gdjj", gcyk(int ), (int)230);
                }
                return new ov(var5_8, var6_9);
            }
lbl194:
            // 2 sources

            case 0: {
                var8_5 /* !! */  = (int)ia.gcyn("gdjk", gcyk(int ), (int)231);
                if (var9_4) {
                    throw null;
                }
                ** GOTO lbl208
            }
            case 1: {
                var8_5 /* !! */  = (int)ia.gcyn("gdjl", gcyk(int ), (int)232);
                if (var9_4) {
                    throw null;
                }
                ** GOTO lbl255
            }
lbl204:
            // 2 sources

            case 2: {
                var8_5 /* !! */  = (int)ia.gcyn("gdjm", gcyk(int ), (int)233);
                if (!var9_4) ** GOTO lbl194
                throw null;
            }
lbl208:
            // 4 sources

            case 3: {
                do {
                    var8_5 /* !! */  = (int)ia.gcyn("gdjn", gcyk(int ), (int)234);
                } while (!var9_4);
                throw null;
            }
            case 4: {
                var8_5 /* !! */  = (int)ia.gcyn("gdjo", gcyk(int ), (int)235);
                if (var9_4) {
                    throw null;
                }
                ** GOTO lbl232
            }
            case 5: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var8_5 /* !! */  = (int)ia.gcyn("gdjp", gcyk(int ), (int)236);
                    if (!var9_4) ** GOTO lbl208
                    throw null;
                }
            }
            case 6: {
                var8_5 /* !! */  = (int)ia.gcyn("gdjq", gcyk(int ), (int)237);
                if (var9_4) {
                    throw null;
                }
                ** GOTO lbl232
            }
            case 7: {
                var8_5 /* !! */  = (int)ia.gcyn("gdjr", gcyk(int ), (int)238);
                if (!var9_4) break;
                throw null;
            }
lbl232:
            // 3 sources

            case 8: {
                var8_5 /* !! */  = (int)ia.gcyn("gdjs", gcyk(int ), (int)239);
                if (!var9_4) ** GOTO lbl204
                throw null;
            }
            case 9: {
                var8_5 /* !! */  = (int)ia.gcyn("gdjt", gcyk(int ), (int)240);
                if (var9_4) {
                    throw null;
                }
                ** GOTO lbl251
            }
            case 10: {
                var8_5 /* !! */  = (int)ia.gcyn("gdju", gcyk(int ), (int)241);
                if (var9_4) {
                    throw null;
                }
                ** GOTO lbl255
            }
            case 11: {
                var8_5 /* !! */  = (int)ia.gcyn("gdjv", gcyk(int ), (int)242);
                if (var9_4) {
                    throw null;
                }
                ** GOTO lbl255
            }
lbl251:
            // 2 sources

            case 12: {
                var8_5 /* !! */  = (int)ia.gcyn("gdjw", gcyk(int ), (int)243);
                if (!var9_4) break;
                throw null;
            }
lbl255:
            // 4 sources

            case 13: {
                var8_5 /* !! */  = (int)ia.gcyn("gdjx", gcyk(int ), (int)244);
                if (!var9_4) ** GOTO lbl208
                throw null;
            }
            case 14: 
        }
        var8_5 /* !! */  = (int)ia.gcyn("gdjy", gcyk(int ), (int)245);
        ** while (!var9_4)
lbl262:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void gdqr() {
        ia.gcym[200] = -2054479843;
        ia.gcym[201] = 1380327725;
        ia.gcym[202] = -1708940664;
        ia.gcym[203] = -532472537;
        ia.gcym[204] = 1324407596;
        ia.gcym[205] = 1438865125;
        ia.gcym[206] = -197828572;
        ia.gcym[207] = -924267952;
        ia.gcym[208] = 1507422482;
        ia.gcym[209] = 1401212389;
        ia.gcym[210] = -730414122;
        ia.gcym[211] = 591931800;
        ia.gcym[212] = -184924880;
        ia.gcym[213] = -756388058;
        ia.gcym[214] = 496528285;
        ia.gcym[215] = -240438920;
        ia.gcym[216] = 414209417;
        ia.gcym[217] = -1209528789;
        ia.gcym[218] = -989831625;
        ia.gcym[219] = 995403773;
        ia.gcym[220] = -1673627844;
        ia.gcym[221] = 55012748;
        ia.gcym[222] = -413627015;
        ia.gcym[223] = -1237629385;
        ia.gcym[224] = 1212214425;
        ia.gcym[225] = 873144564;
        ia.gcym[226] = -1066118726;
        ia.gcym[227] = 1155613068;
        ia.gcym[228] = -1793498611;
        ia.gcym[229] = 641916158;
        ia.gcym[230] = -683907310;
        ia.gcym[231] = 2065193359;
        ia.gcym[232] = -1245373517;
        ia.gcym[233] = 800475561;
        ia.gcym[234] = 1632652073;
        ia.gcym[235] = 796908611;
        ia.gcym[236] = 190982169;
        ia.gcym[237] = 80900717;
        ia.gcym[238] = -362641786;
        ia.gcym[239] = 995383370;
        ia.gcym[240] = 111915225;
        ia.gcym[241] = -1774932839;
        ia.gcym[242] = -1308758066;
        ia.gcym[243] = -997694181;
        ia.gcym[244] = -1910655070;
        ia.gcym[245] = -1642510192;
        ia.gcym[246] = 1418903913;
        ia.gcym[247] = 442626843;
        ia.gcym[248] = 994111217;
        ia.gcym[249] = -1447710926;
        ia.gcym[250] = -618255403;
        ia.gcym[251] = -180123335;
        ia.gcym[252] = 888812059;
        ia.gcym[253] = -274105476;
        ia.gcym[254] = 152546066;
        ia.gcym[255] = -1734314790;
        ia.gcym[256] = -1909010653;
        ia.gcym[257] = 674244996;
        ia.gcym[258] = 508300708;
        ia.gcym[259] = 1694869013;
        ia.gcym[260] = 1162673743;
        ia.gcym[261] = -1490383579;
        ia.gcym[262] = -1552850997;
        ia.gcym[263] = -1301475455;
        ia.gcym[264] = -874533103;
        ia.gcym[265] = -967837518;
        ia.gcym[266] = -706268651;
        ia.gcym[267] = -1670917493;
        ia.gcym[268] = -1863666421;
        ia.gcym[269] = 453564748;
        ia.gcym[270] = 222025491;
        ia.gcym[271] = -1068006253;
        ia.gcym[272] = -699650755;
        ia.gcym[273] = -1835710568;
        ia.gcym[274] = 1329950360;
        ia.gcym[275] = -2112529608;
        ia.gcym[276] = -547340032;
        ia.gcym[277] = -309072239;
        ia.gcym[278] = 1195577430;
        ia.gcym[279] = -973813381;
        ia.gcym[280] = -501878763;
        ia.gcym[281] = 491340076;
        ia.gcym[282] = 577832067;
        ia.gcym[283] = -676077104;
        ia.gcym[284] = 624225443;
        ia.gcym[285] = -600384687;
        ia.gcym[286] = 1324033766;
        ia.gcym[287] = -1156228952;
        ia.gcym[288] = 2069802594;
        ia.gcym[289] = -1379554754;
        ia.gcym[290] = -943421222;
        ia.gcym[291] = 1927829756;
        ia.gcym[292] = 1966501418;
        ia.gcym[293] = 1337562099;
        ia.gcym[294] = -331719109;
        ia.gcym[295] = -455526050;
        ia.gcym[296] = -2033121195;
        ia.gcym[297] = -673643275;
        ia.gcym[298] = 1385512148;
        ia.gcym[299] = -787874366;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private ov rotationToMultipoint(class_1297 var1_1, ov var2_2) {
        var34_3 = ia.c;
        var33_4 /* !! */  = ia.b;
        var32_5 = ia.a;
        if (var34_3) {
            throw null;
lbl6:
            // 41 sources

            return null;
        }
        if (var32_5 || var32_5) ** GOTO lbl6
        var3_6 = ia.mc.field_1724.method_33571();
        if (var32_5 || var32_5) ** GOTO lbl6
        var4_7 = var1_1.method_5829();
        if (var32_5 || var32_5) ** GOTO lbl6
        var5_8 = (var4_7.field_1323 + var4_7.field_1320) * ia.gcyn("gddt", gddq(int ), (int)0);
        if (var32_5 || var32_5) ** GOTO lbl6
        var7_9 = (var4_7.field_1321 + var4_7.field_1324) * ia.gcyn("gddu", gddq(int ), (int)1);
        if (var32_5 || var32_5) ** GOTO lbl6
        var9_10 = (var4_7.field_1320 - var4_7.field_1323) * ia.gcyn("gddv", gddq(int ), (int)2);
        if (var32_5 || var32_5) ** GOTO lbl6
        var11_11 = (var4_7.field_1324 - var4_7.field_1321) * ia.gcyn("gddw", gddq(int ), (int)3);
        if (var32_5 || var32_5) ** GOTO lbl6
        var13_12 = var4_7.field_1325 - var4_7.field_1322;
        if (var32_5 || var32_5) ** GOTO lbl6
        v0 = this.pointLockTicks;
        this.pointLockTicks = v0 - ia.gcyn("gddx", gcyk(int ), (int)131);
        if (v0 > 0) ** GOTO lbl95
        if (var32_5 || var32_5) ** GOTO lbl6
        var15_13 /* !! */  = ia.gcyn("gddy", gddq(int ), (int)4);
        if (var32_5 || var32_5) ** GOTO lbl6
        var17_15 /* !! */  = this.lockedVertical;
        if (var32_5 || var32_5) ** GOTO lbl6
        var18_16 /* !! */  = this.lockedHorizontal;
        if (var32_5 || var32_5) ** GOTO lbl6
        var19_17 = ia.gcyn("gddz", gcyk(int ), (int)132);
        if (var32_5) ** GOTO lbl6
        block80: while (true) {
            if (var32_5 || var32_5) ** GOTO lbl6
            if (var19_17 >= ia.VERTICAL_MULTIPOINTS.length) ** GOTO lbl88
            if (var32_5 || var32_5) ** GOTO lbl6
            var20_18 = var4_7.field_1322 + var13_12 * ia.VERTICAL_MULTIPOINTS[var19_17];
            if (var32_5 || var32_5) ** GOTO lbl6
            var22_19 = ia.gcyn("gdea", gcyk(int ), (int)133);
            if (var32_5) ** GOTO lbl6
            block81: while (true) {
                if (var32_5 || var32_5) ** GOTO lbl6
                if (var22_19 >= ia.HORIZONTAL_MULTIPOINTS.length) ** GOTO lbl83
                if (var32_5 || var32_5) ** GOTO lbl6
                var23_20 = ia.HORIZONTAL_MULTIPOINTS[var22_19];
                if (var32_5 || var32_5) ** GOTO lbl6
                var24_21 = new class_243(var5_8 + var23_20[0] * var9_10, var20_18, var7_9 + var23_20[1] * var11_11);
                if (var32_5 || var32_5) ** GOTO lbl6
                var25_22 = this.angleTo(var3_6, var24_21, var2_2);
                if (var32_5 || var32_5) ** GOTO lbl6
                var26_23 = Math.abs(class_3532.method_15393((float)(var25_22.getYaw() - this.lerpYaw)));
                if (var32_5 || var32_5) ** GOTO lbl6
                var28_24 = Math.abs(class_3532.method_15393((float)(var25_22.getPitch() - this.lerpPitch)));
                if (var32_5 || var32_5) ** GOTO lbl6
                v1 = Math.hypot(var26_23, var28_24) + (double)var19_17 * ia.gcyn("gdeb", gddq(int ), (int)5);
                if (var22_19 == false) {
                    v2 /* !! */  = 0.0;
                    if (var34_3) {
                        throw null;
                    }
                } else {
                    v2 /* !! */  = (double)ia.gcyn("gdec", gddq(int ), (int)6);
                }
                var30_25 = v1 + v2 /* !! */ ;
                if (var32_5 || var32_5) ** GOTO lbl6
                if (!(var30_25 < var15_13 /* !! */ )) ** GOTO lbl78
                if (var32_5 || var32_5) ** GOTO lbl6
                var15_13 /* !! */  = (CallSite)var30_25;
                if (var32_5 || var32_5) ** GOTO lbl6
                var17_15 /* !! */  = (int)var19_17;
                if (var32_5) ** GOTO lbl6
                if (var33_4 /* !! */  == 0) ** GOTO lbl-1000
                switch (var33_4 /* !! */ ) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var32_5) ** GOTO lbl6
                        var18_16 /* !! */  = (int)var22_19;
                        if (var32_5) ** GOTO lbl6
lbl78:
                        // 2 sources

                        if (var32_5 || var32_5) ** GOTO lbl6
                        ++var22_19;
                        if (var32_5) ** GOTO lbl6
                        if (!var34_3) continue block81;
                        throw null;
                    }
lbl83:
                    // 1 sources

                    if (var32_5 || var32_5) ** GOTO lbl6
                    ++var19_17;
                    if (var32_5) ** GOTO lbl6
                    if (!var34_3) continue block80;
                    throw null;
lbl88:
                    // 1 sources

                    if (var32_5 || var32_5) ** GOTO lbl6
                    this.lockedVertical = var17_15 /* !! */ ;
                    if (var32_5 || var32_5) ** GOTO lbl6
                    this.lockedHorizontal = var18_16 /* !! */ ;
                    if (var32_5 || var32_5) ** GOTO lbl6
                    this.pointLockTicks = this.random.nextInt((int)ia.gcyn("gded", gcyk(int ), (int)134), (int)ia.gcyn("gdee", gcyk(int ), (int)135));
                    if (var32_5) ** GOTO lbl6
lbl95:
                    // 2 sources

                    if (var32_5 || var32_5) ** GOTO lbl6
                    var15_14 = ia.HORIZONTAL_MULTIPOINTS[this.lockedHorizontal];
                    if (var32_5 || var32_5) ** GOTO lbl6
                    var16_26 = new class_243(var5_8 + var15_14[0] * var9_10, var4_7.field_1322 + var13_12 * ia.VERTICAL_MULTIPOINTS[this.lockedVertical], var7_9 + var15_14[1] * var11_11);
                    if (!var32_5 && !var32_5) ** break;
                    ** continue;
                    return this.angleTo(var3_6, var16_26, var2_2);
                    case 0: {
                        var33_4 /* !! */  = (int)ia.gcyn("gdef", gcyk(int ), (int)136);
                        if (var34_3) {
                            throw null;
                        }
                        ** GOTO lbl141
                    }
                    case 1: {
                        var33_4 /* !! */  = (int)ia.gcyn("gdeg", gcyk(int ), (int)137);
                        if (var34_3) {
                            throw null;
                        }
                        ** GOTO lbl344
                    }
lbl112:
                    // 4 sources

                    case 2: {
                        var33_4 /* !! */  = (int)ia.gcyn("gdeh", gcyk(int ), (int)138);
                        if (var34_3) {
                            throw null;
                        }
                        ** GOTO lbl131
                    }
lbl117:
                    // 2 sources

                    case 3: {
                        var33_4 /* !! */  = (int)ia.gcyn("gdei", gcyk(int ), (int)139);
                        if (var34_3) {
                            throw null;
                        }
                        ** GOTO lbl320
                    }
                    case 4: {
                        var33_4 /* !! */  = (int)ia.gcyn("gdej", gcyk(int ), (int)140);
                        if (!var34_3) break block80;
                        throw null;
                    }
                    case 5: {
                        var33_4 /* !! */  = (int)ia.gcyn("gdek", gcyk(int ), (int)141);
                        if (var34_3) {
                            throw null;
                        }
                        ** GOTO lbl357
                    }
lbl131:
                    // 3 sources

                    case 6: {
                        var33_4 /* !! */  = (int)ia.gcyn("gdel", gcyk(int ), (int)142);
                        if (var34_3) {
                            throw null;
                        }
                        ** GOTO lbl344
                    }
                    case 7: {
                        var33_4 /* !! */  = (int)ia.gcyn("gdem", gcyk(int ), (int)143);
                        if (var34_3) {
                            throw null;
                        }
                        ** GOTO lbl405
                    }
lbl141:
                    // 3 sources

                    case 8: {
                        var33_4 /* !! */  = (int)ia.gcyn("gden", gcyk(int ), (int)144);
                        if (var34_3) {
                            throw null;
                        }
                        ** GOTO lbl237
                    }
lbl146:
                    // 3 sources

                    case 9: {
                        var33_4 /* !! */  = (int)ia.gcyn("gdeo", gcyk(int ), (int)145);
                        if (var34_3) {
                            throw null;
                        }
                        ** GOTO lbl376
                    }
                    case 10: {
                        var33_4 /* !! */  = (int)ia.gcyn("gdep", gcyk(int ), (int)146);
                        if (var34_3) {
                            throw null;
                        }
                        ** GOTO lbl198
                    }
                    case 11: {
                        var33_4 /* !! */  = (int)ia.gcyn("gdeq", gcyk(int ), (int)147);
                        if (var34_3) {
                            throw null;
                        }
                        ** GOTO lbl218
                    }
lbl161:
                    // 3 sources

                    case 12: {
                        var33_4 /* !! */  = (int)ia.gcyn("gder", gcyk(int ), (int)148);
                        if (var34_3) {
                            throw null;
                        }
                        ** GOTO lbl344
                    }
lbl166:
                    // 2 sources

                    case 13: {
                        var33_4 /* !! */  = (int)ia.gcyn("gdes", gcyk(int ), (int)149);
                        if (!var34_3) ** GOTO lbl146
                        throw null;
                    }
lbl170:
                    // 2 sources

                    case 14: {
                        var33_4 /* !! */  = (int)ia.gcyn("gdet", gcyk(int ), (int)150);
                        if (var34_3) {
                            throw null;
                        }
                        ** GOTO lbl320
                    }
lbl175:
                    // 2 sources

                    case 15: {
                        var33_4 /* !! */  = (int)ia.gcyn("gdeu", gcyk(int ), (int)151);
                        if (var34_3) {
                            throw null;
                        }
                        ** GOTO lbl208
                    }
                    case 16: {
                        var33_4 /* !! */  = (int)ia.gcyn("gdev", gcyk(int ), (int)152);
                        if (var34_3) {
                            throw null;
                        }
                        ** GOTO lbl381
                    }
lbl185:
                    // 3 sources

                    case 17: {
                        var33_4 /* !! */  = (int)ia.gcyn("gdew", gcyk(int ), (int)153);
                        if (!var34_3) ** GOTO lbl117
                        throw null;
                    }
                    case 18: {
                        var33_4 /* !! */  = (int)ia.gcyn("gdex", gcyk(int ), (int)154);
                        if (!var34_3) ** GOTO lbl166
                        throw null;
                    }
                    case 19: {
                        var33_4 /* !! */  = (int)ia.gcyn("gdey", gcyk(int ), (int)155);
                        if (var34_3) {
                            throw null;
                        }
                        ** GOTO lbl269
                    }
lbl198:
                    // 2 sources

                    case 20: {
                        var33_4 /* !! */  = (int)ia.gcyn("gdez", gcyk(int ), (int)156);
                        if (var34_3) {
                            throw null;
                        }
                        ** GOTO lbl335
                    }
lbl203:
                    // 2 sources

                    case 21: {
                        var33_4 /* !! */  = (int)ia.gcyn("gdfa", gcyk(int ), (int)157);
                        if (var34_3) {
                            throw null;
                        }
                        ** GOTO lbl233
                    }
lbl208:
                    // 4 sources

                    case 22: {
                        var33_4 /* !! */  = (int)ia.gcyn("gdfb", gcyk(int ), (int)158);
                        if (var34_3) {
                            throw null;
                        }
                        ** GOTO lbl330
                    }
lbl213:
                    // 2 sources

                    case 23: {
                        do {
                            var33_4 /* !! */  = (int)ia.gcyn("gdfc", gcyk(int ), (int)159);
                        } while (!var34_3);
                        throw null;
                    }
lbl218:
                    // 4 sources

                    case 24: {
                        var33_4 /* !! */  = (int)ia.gcyn("gdfd", gcyk(int ), (int)160);
                        if (var34_3) {
                            throw null;
                        }
                        ** GOTO lbl325
                    }
                    case 25: {
                        var33_4 /* !! */  = (int)ia.gcyn("gdfe", gcyk(int ), (int)161);
                        if (var34_3) {
                            throw null;
                        }
                        ** GOTO lbl259
                    }
                    case 26: {
                        var33_4 /* !! */  = (int)ia.gcyn("gdff", gcyk(int ), (int)162);
                        if (var34_3) {
                            throw null;
                        }
                        ** GOTO lbl430
                    }
lbl233:
                    // 4 sources

                    case 27: {
                        var33_4 /* !! */  = (int)ia.gcyn("gdfg", gcyk(int ), (int)163);
                        if (!var34_3) ** GOTO lbl185
                        throw null;
                    }
lbl237:
                    // 2 sources

                    case 28: {
                        var33_4 /* !! */  = (int)ia.gcyn("gdfh", gcyk(int ), (int)164);
                        if (!var34_3) ** GOTO lbl233
                        throw null;
                    }
                    case 29: {
                        var33_4 /* !! */  = (int)ia.gcyn("gdfi", gcyk(int ), (int)165);
                        if (var34_3) {
                            throw null;
                        }
                        ** GOTO lbl294
                    }
lbl246:
                    // 2 sources

                    case 30: {
                        var33_4 /* !! */  = (int)ia.gcyn("gdfj", gcyk(int ), (int)166);
                        if (!var34_3) ** GOTO lbl208
                        throw null;
                    }
                    case 31: {
                        var33_4 /* !! */  = (int)ia.gcyn("gdfk", gcyk(int ), (int)167);
                        if (var34_3) {
                            throw null;
                        }
                        ** GOTO lbl278
                    }
                    case 32: {
                        var33_4 /* !! */  = (int)ia.gcyn("gdfl", gcyk(int ), (int)168);
                        if (!var34_3) ** GOTO lbl112
                        throw null;
                    }
lbl259:
                    // 3 sources

                    case 33: {
                        var33_4 /* !! */  = (int)ia.gcyn("gdfm", gcyk(int ), (int)169);
                        if (var34_3) {
                            throw null;
                        }
                        ** GOTO lbl290
                    }
                    case 34: {
                        var33_4 /* !! */  = (int)ia.gcyn("gdfn", gcyk(int ), (int)170);
                        if (var34_3) {
                            throw null;
                        }
                        ** GOTO lbl299
                    }
lbl269:
                    // 3 sources

                    case 35: {
                        var33_4 /* !! */  = (int)ia.gcyn("gdfo", gcyk(int ), (int)171);
                        if (var34_3) {
                            throw null;
                        }
                        ** GOTO lbl330
                    }
lbl274:
                    // 2 sources

                    case 36: {
                        var33_4 /* !! */  = (int)ia.gcyn("gdfp", gcyk(int ), (int)172);
                        if (!var34_3) ** GOTO lbl161
                        throw null;
                    }
lbl278:
                    // 2 sources

                    case 37: {
                        var33_4 /* !! */  = (int)ia.gcyn("gdfq", gcyk(int ), (int)173);
                        if (!var34_3) ** GOTO lbl246
                        throw null;
                    }
                    case 38: {
                        var33_4 /* !! */  = (int)ia.gcyn("gdfr", gcyk(int ), (int)174);
                        if (!var34_3) ** GOTO lbl233
                        throw null;
                    }
                    case 39: {
                        var33_4 /* !! */  = (int)ia.gcyn("gdfs", gcyk(int ), (int)175);
                        if (!var34_3) ** GOTO lbl112
                        throw null;
                    }
lbl290:
                    // 2 sources

                    case 40: {
                        var33_4 /* !! */  = (int)ia.gcyn("gdft", gcyk(int ), (int)176);
                        if (!var34_3) ** GOTO lbl218
                        throw null;
                    }
lbl294:
                    // 2 sources

                    case 41: {
                        var33_4 /* !! */  = (int)ia.gcyn("gdfu", gcyk(int ), (int)177);
                        if (var34_3) {
                            throw null;
                        }
                        ** GOTO lbl385
                    }
lbl299:
                    // 3 sources

                    case 42: {
                        var33_4 /* !! */  = (int)ia.gcyn("gdfv", gcyk(int ), (int)178);
                        if (!var34_3) ** GOTO lbl146
                        throw null;
                    }
                    case 43: {
                        var33_4 /* !! */  = (int)ia.gcyn("gdfw", gcyk(int ), (int)179);
                        if (var34_3) {
                            throw null;
                        }
                        ** GOTO lbl344
                    }
                    case 44: {
                        var33_4 /* !! */  = (int)ia.gcyn("gdfx", gcyk(int ), (int)180);
                        if (var34_3) {
                            throw null;
                        }
                    }
                    case 45: {
                        var33_4 /* !! */  = (int)ia.gcyn("gdfy", gcyk(int ), (int)181);
                        if (!var34_3) ** GOTO lbl218
                        throw null;
                    }
lbl316:
                    // 2 sources

                    case 46: {
                        var33_4 /* !! */  = (int)ia.gcyn("gdfz", gcyk(int ), (int)182);
                        if (!var34_3) ** GOTO lbl269
                        throw null;
                    }
lbl320:
                    // 3 sources

                    case 47: {
                        var33_4 /* !! */  = (int)ia.gcyn("gdga", gcyk(int ), (int)183);
                        if (var34_3) {
                            throw null;
                        }
                        ** GOTO lbl335
                    }
lbl325:
                    // 2 sources

                    case 48: {
                        var33_4 /* !! */  = (int)ia.gcyn("gdgb", gcyk(int ), (int)184);
                        if (var34_3) {
                            throw null;
                        }
                        ** GOTO lbl352
                    }
lbl330:
                    // 3 sources

                    case 49: {
                        var33_4 /* !! */  = (int)ia.gcyn("gdgc", gcyk(int ), (int)185);
                        if (var34_3) {
                            throw null;
                        }
                        ** GOTO lbl397
                    }
lbl335:
                    // 3 sources

                    case 50: {
                        var33_4 /* !! */  = (int)ia.gcyn("gdgd", gcyk(int ), (int)186);
                        if (!var34_3) ** GOTO lbl203
                        throw null;
                    }
lbl339:
                    // 2 sources

                    case 51: {
                        var33_4 /* !! */  = (int)ia.gcyn("gdge", gcyk(int ), (int)187);
                        if (var34_3) {
                            throw null;
                        }
                        ** GOTO lbl426
                    }
lbl344:
                    // 6 sources

                    case 52: {
                        var33_4 /* !! */  = (int)ia.gcyn("gdgf", gcyk(int ), (int)188);
                        if (!var34_3) ** GOTO lbl274
                        throw null;
                    }
                    case 53: {
                        var33_4 /* !! */  = (int)ia.gcyn("gdgg", gcyk(int ), (int)189);
                        if (!var34_3) ** GOTO lbl344
                        throw null;
                    }
lbl352:
                    // 2 sources

                    case 54: {
                        var33_4 /* !! */  = (int)ia.gcyn("gdgh", gcyk(int ), (int)190);
                        if (var34_3) {
                            throw null;
                        }
                        ** GOTO lbl430
                    }
lbl357:
                    // 2 sources

                    case 55: {
                        var33_4 /* !! */  = (int)ia.gcyn("gdgi", gcyk(int ), (int)191);
                        if (var34_3) {
                            throw null;
                        }
                        ** GOTO lbl426
                    }
                    case 56: {
                        var33_4 /* !! */  = (int)ia.gcyn("gdgj", gcyk(int ), (int)192);
                        if (!var34_3) ** GOTO lbl208
                        throw null;
                    }
lbl366:
                    // 2 sources

                    case 57: {
                        var33_4 /* !! */  = (int)ia.gcyn("gdgk", gcyk(int ), (int)193);
                        if (!var34_3) ** GOTO lbl141
                        throw null;
                    }
                    case 58: lbl-1000:
                    // 2 sources

                    {
                        while (true) {
                            var33_4 /* !! */  = (int)ia.gcyn("gdgl", gcyk(int ), (int)194);
                            if (var34_3) {
                                throw null;
                            }
                            ** GOTO lbl438
                            break;
                        }
                    }
lbl376:
                    // 3 sources

                    case 59: {
                        var33_4 /* !! */  = (int)ia.gcyn("gdgm", gcyk(int ), (int)195);
                        if (var34_3) {
                            throw null;
                        }
                        ** GOTO lbl438
                    }
lbl381:
                    // 3 sources

                    case 60: {
                        var33_4 /* !! */  = (int)ia.gcyn("gdgn", gcyk(int ), (int)196);
                        if (!var34_3) ** GOTO lbl131
                        throw null;
                    }
lbl385:
                    // 2 sources

                    case 61: {
                        var33_4 /* !! */  = (int)ia.gcyn("gdgo", gcyk(int ), (int)197);
                        if (!var34_3) ** GOTO lbl161
                        throw null;
                    }
lbl389:
                    // 2 sources

                    case 62: {
                        var33_4 /* !! */  = (int)ia.gcyn("gdgp", gcyk(int ), (int)198);
                        if (!var34_3) ** GOTO lbl339
                        throw null;
                    }
                    case 63: {
                        var33_4 /* !! */  = (int)ia.gcyn("gdgq", gcyk(int ), (int)199);
                        if (!var34_3) ** GOTO lbl185
                        throw null;
                    }
lbl397:
                    // 2 sources

                    case 64: {
                        var33_4 /* !! */  = (int)ia.gcyn("gdgr", gcyk(int ), (int)200);
                        if (!var34_3) ** GOTO lbl299
                        throw null;
                    }
                    case 65: {
                        var33_4 /* !! */  = (int)ia.gcyn("gdgs", gcyk(int ), (int)201);
                        if (!var34_3) ** GOTO lbl316
                        throw null;
                    }
lbl405:
                    // 2 sources

                    case 66: {
                        var33_4 /* !! */  = (int)ia.gcyn("gdgt", gcyk(int ), (int)202);
                        if (!var34_3) ** GOTO lbl175
                        throw null;
                    }
                    case 67: {
                        var33_4 /* !! */  = (int)ia.gcyn("gdgu", gcyk(int ), (int)203);
                        if (var34_3) {
                            throw null;
                        }
                        ** GOTO lbl434
                    }
                    case 68: {
                        var33_4 /* !! */  = (int)ia.gcyn("gdgv", gcyk(int ), (int)204);
                        if (!var34_3) ** GOTO lbl366
                        throw null;
                    }
                    case 69: {
                        var33_4 /* !! */  = (int)ia.gcyn("gdgw", gcyk(int ), (int)205);
                        if (!var34_3) ** GOTO lbl170
                        throw null;
                    }
                    case 70: {
                        var33_4 /* !! */  = (int)ia.gcyn("gdgx", gcyk(int ), (int)206);
                        if (!var34_3) ** GOTO lbl259
                        throw null;
                    }
lbl426:
                    // 3 sources

                    case 71: {
                        var33_4 /* !! */  = (int)ia.gcyn("gdgy", gcyk(int ), (int)207);
                        if (!var34_3) ** GOTO lbl381
                        throw null;
                    }
lbl430:
                    // 3 sources

                    case 72: {
                        var33_4 /* !! */  = (int)ia.gcyn("gdgz", gcyk(int ), (int)208);
                        if (!var34_3) ** GOTO lbl376
                        throw null;
                    }
lbl434:
                    // 2 sources

                    case 73: {
                        var33_4 /* !! */  = (int)ia.gcyn("gdha", gcyk(int ), (int)209);
                        if (!var34_3) ** GOTO lbl213
                        throw null;
                    }
lbl438:
                    // 3 sources

                    case 74: {
                        var33_4 /* !! */  = (int)ia.gcyn("gdhb", gcyk(int ), (int)210);
                        if (!var34_3) ** GOTO lbl389
                        throw null;
                    }
                    case 75: {
                        var33_4 /* !! */  = (int)ia.gcyn("gdhc", gcyk(int ), (int)211);
                        if (!var34_3) ** GOTO lbl112
                        throw null;
                    }
                    case 76: 
                }
                break;
            }
            break;
        }
        var33_4 /* !! */  = (int)ia.gcyn("gdhd", gcyk(int ), (int)212);
        ** while (!var34_3)
lbl449:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void updateCoherentNoise() {
        v0 /* !! */  = ia.nf;
        if (true) ** GOTO lbl5
        block75: while (true) {
            v0 /* !! */  = (long)(v1 - ia.gcyn("gdjz", gdhe(int ), (int)46));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -2011106723: {
                    v1 = ia.gcyn("gdka", gdhe(int ), (int)47);
                    continue block75;
                }
                case -1810810136: {
                    break block75;
                }
                case -1360076736: {
                    v1 = ia.gcyn("gdkb", gdhe(int ), (int)48);
                    continue block75;
                }
            }
            break;
        }
        var3_1 = ia.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = ia.nf - ia.gcyn("gdkc", gdhe(int ), (int)49)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == ia.gcyn("gdkd", gcyk(int ), (int)246)) break;
            v2 /* !! */  = (long)ia.gcyn("gdke", gcyk(int ), (int)247);
        }
        var2_2 /* !! */  = ia.b;
        v3 /* !! */  = ia.nf;
        if (true) ** GOTO lbl25
        block77: while (true) {
            v3 /* !! */  = (long)(v4 - ia.gcyn("gdkf", gdhe(int ), (int)50));
lbl25:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1810810136: {
                    break block77;
                }
                case -1694460016: {
                    v4 = ia.gcyn("gdkg", gdhe(int ), (int)51);
                    continue block77;
                }
                case 1118919203: {
                    v4 = ia.gcyn("gdkh", gdhe(int ), (int)52);
                    continue block77;
                }
            }
            break;
        }
        var1_3 = ia.a;
        if (var3_1) {
            throw null;
lbl37:
            // 9 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl37
        v5 /* !! */  = ia.nf;
        if (true) ** GOTO lbl44
        block79: while (true) {
            v5 /* !! */  = (long)(ia.gcyn("gdkj", gdhe(int ), (int)54) - ia.gcyn("gdki", gdhe(int ), (int)53));
lbl44:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -1810810136: {
                    break block79;
                }
                case 836935864: {
                    continue block79;
                }
            }
            break;
        }
        v6 = this.noiseTicks;
        v7 = v6 - ia.gcyn("gdkk", gcyk(int ), (int)248);
        while (true) {
            if ((v8 /* !! */  = (cfr_temp_1 = ia.nf - ia.gcyn("gdkl", gdhe(int ), (int)55)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v8 /* !! */  == ia.gcyn("gdkm", gcyk(int ), (int)249)) break;
            v8 /* !! */  = (long)ia.gcyn("gdkn", gcyk(int ), (int)250);
        }
        this.noiseTicks = v7;
        if (v6 > 0) ** GOTO lbl169
        if (var1_3 || var1_3) ** GOTO lbl37
        v9 /* !! */  = ia.nf;
        if (true) ** GOTO lbl63
        block81: while (true) {
            v9 /* !! */  = (long)(ia.gcyn("gdkp", gdhe(int ), (int)57) - ia.gcyn("gdko", gdhe(int ), (int)56));
lbl63:
            // 2 sources

            switch ((int)v9 /* !! */ ) {
                case -1810810136: {
                    break block81;
                }
                case -111342576: {
                    continue block81;
                }
            }
            break;
        }
        v10 = ia.gcyn("gdkq", gcyz(int ), (int)251);
        v11 = ia.gcyn("gdkr", gcyz(int ), (int)252);
        while (true) {
            if ((v12 /* !! */  = (cfr_temp_2 = ia.nf - ia.gcyn("gdks", gdhe(int ), (int)58)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v12 /* !! */  == ia.gcyn("gdkt", gcyk(int ), (int)253)) break;
            v12 /* !! */  = (long)ia.gcyn("gdku", gcyk(int ), (int)254);
        }
        v13 = this.random.nextFloat((float)v10, (float)v11);
        v14 /* !! */  = ia.nf;
        if (true) ** GOTO lbl80
        block83: while (true) {
            v14 /* !! */  = (long)(v15 - ia.gcyn("gdkv", gdhe(int ), (int)59));
lbl80:
            // 2 sources

            switch ((int)v14 /* !! */ ) {
                case -1861399205: {
                    v15 = ia.gcyn("gdkw", gdhe(int ), (int)60);
                    continue block83;
                }
                case -1810810136: {
                    break block83;
                }
                case -1034327146: {
                    v15 = ia.gcyn("gdkx", gdhe(int ), (int)61);
                    continue block83;
                }
            }
            break;
        }
        this.wantedNoiseYaw = v13;
        if (var1_3 || var1_3) ** GOTO lbl37
        v16 /* !! */  = ia.nf;
        if (true) ** GOTO lbl95
        block84: while (true) {
            v16 /* !! */  = (long)(ia.gcyn("gdkz", gdhe(int ), (int)63) - ia.gcyn("gdky", gdhe(int ), (int)62));
lbl95:
            // 2 sources

            switch ((int)v16 /* !! */ ) {
                case -1810810136: {
                    break block84;
                }
                case 1560696805: {
                    continue block84;
                }
            }
            break;
        }
        v17 = ia.gcyn("gdla", gcyz(int ), (int)255);
        v18 = ia.gcyn("gdlb", gcyz(int ), (int)256);
        while (true) {
            if ((v19 /* !! */  = (cfr_temp_3 = ia.nf - ia.gcyn("gdlc", gdhe(int ), (int)64)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v19 /* !! */  == ia.gcyn("gdld", gcyk(int ), (int)257)) break;
            v19 /* !! */  = (long)ia.gcyn("gdle", gcyk(int ), (int)258);
        }
        v20 = this.random.nextFloat((float)v17, (float)v18);
        v21 /* !! */  = ia.nf;
        if (true) ** GOTO lbl112
        block86: while (true) {
            v21 /* !! */  = (long)(v22 - ia.gcyn("gdlf", gdhe(int ), (int)65));
lbl112:
            // 2 sources

            switch ((int)v21 /* !! */ ) {
                case -1810810136: {
                    break block86;
                }
                case 797518740: {
                    v22 = ia.gcyn("gdlg", gdhe(int ), (int)66);
                    continue block86;
                }
                case 1552229017: {
                    v22 = ia.gcyn("gdlh", gdhe(int ), (int)67);
                    continue block86;
                }
                case 2015894610: {
                    v22 = ia.gcyn("gdli", gdhe(int ), (int)68);
                    continue block86;
                }
            }
            break;
        }
        this.wantedNoisePitch = v20;
        if (var1_3) ** GOTO lbl37
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl37
                while (true) {
                    if ((v23 /* !! */  = (cfr_temp_4 = ia.nf - ia.gcyn("gdlj", gdhe(int ), (int)69)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v23 /* !! */  == ia.gcyn("gdlk", gcyk(int ), (int)259)) break;
                    v23 /* !! */  = (long)ia.gcyn("gdll", gcyk(int ), (int)260);
                }
                v24 = ia.gcyn("gdlm", gcyk(int ), (int)261);
                v25 = ia.gcyn("gdln", gcyk(int ), (int)262);
                v26 /* !! */  = ia.nf;
                if (true) ** GOTO lbl141
                block88: while (true) {
                    v26 /* !! */  = (long)(v27 - ia.gcyn("gdlo", gdhe(int ), (int)70));
lbl141:
                    // 2 sources

                    switch ((int)v26 /* !! */ ) {
                        case -1810810136: {
                            break block88;
                        }
                        case -299653149: {
                            v27 = ia.gcyn("gdlp", gdhe(int ), (int)71);
                            continue block88;
                        }
                        case 1307931328: {
                            v27 = ia.gcyn("gdlq", gdhe(int ), (int)72);
                            continue block88;
                        }
                    }
                    break;
                }
                v28 = this.random.nextInt((int)v24, (int)v25);
                v29 /* !! */  = ia.nf;
                if (true) ** GOTO lbl155
                block89: while (true) {
                    v29 /* !! */  = (long)(v30 - ia.gcyn("gdlr", gdhe(int ), (int)73));
lbl155:
                    // 2 sources

                    switch ((int)v29 /* !! */ ) {
                        case -1810810136: {
                            break block89;
                        }
                        case -702738530: {
                            v30 = ia.gcyn("gdls", gdhe(int ), (int)74);
                            continue block89;
                        }
                        case 431847524: {
                            v30 = ia.gcyn("gdlt", gdhe(int ), (int)75);
                            continue block89;
                        }
                        case 609823092: {
                            v30 = ia.gcyn("gdlu", gdhe(int ), (int)76);
                            continue block89;
                        }
                    }
                    break;
                }
                this.noiseTicks = v28;
                if (var1_3) ** GOTO lbl37
lbl169:
                // 2 sources

                if (var1_3 || var1_3) ** GOTO lbl37
                while (true) {
                    if ((v31 /* !! */  = (cfr_temp_5 = ia.nf - ia.gcyn("gdlv", gdhe(int ), (int)77)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v31 /* !! */  == ia.gcyn("gdlw", gcyk(int ), (int)263)) break;
                    v31 /* !! */  = (long)ia.gcyn("gdlx", gcyk(int ), (int)264);
                }
                while (true) {
                    if ((v32 /* !! */  = (cfr_temp_6 = ia.nf - ia.gcyn("gdly", gdhe(int ), (int)78)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v32 /* !! */  == ia.gcyn("gdlz", gcyk(int ), (int)265)) break;
                    v32 /* !! */  = (long)ia.gcyn("gdma", gcyk(int ), (int)266);
                }
                while (true) {
                    if ((v33 /* !! */  = (cfr_temp_7 = ia.nf - ia.gcyn("gdmb", gdhe(int ), (int)79)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v33 /* !! */  == ia.gcyn("gdmc", gcyk(int ), (int)267)) break;
                    v33 /* !! */  = (long)ia.gcyn("gdmd", gcyk(int ), (int)268);
                }
                v34 = this.noiseYaw + (this.wantedNoiseYaw - this.noiseYaw) * ia.gcyn("gdme", gcyz(int ), (int)269);
                v35 /* !! */  = ia.nf;
                if (true) ** GOTO lbl190
                block93: while (true) {
                    v35 /* !! */  = (long)(v36 - ia.gcyn("gdmf", gdhe(int ), (int)80));
lbl190:
                    // 2 sources

                    switch ((int)v35 /* !! */ ) {
                        case -1810810136: {
                            break block93;
                        }
                        case -1089575104: {
                            v36 = ia.gcyn("gdmg", gdhe(int ), (int)81);
                            continue block93;
                        }
                        case -395148742: {
                            v36 = ia.gcyn("gdmh", gdhe(int ), (int)82);
                            continue block93;
                        }
                        case 1942451126: {
                            v36 = ia.gcyn("gdmi", gdhe(int ), (int)83);
                            continue block93;
                        }
                    }
                    break;
                }
                this.noiseYaw = v34;
                if (var1_3 || var1_3) ** GOTO lbl37
                while (true) {
                    if ((v37 /* !! */  = (cfr_temp_8 = ia.nf - ia.gcyn("gdmj", gdhe(int ), (int)84)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v37 /* !! */  == ia.gcyn("gdmk", gcyk(int ), (int)270)) break;
                    v37 /* !! */  = (long)ia.gcyn("gdml", gcyk(int ), (int)271);
                }
                while (true) {
                    if ((v38 /* !! */  = (cfr_temp_9 = ia.nf - ia.gcyn("gdmm", gdhe(int ), (int)85)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                    if (v38 /* !! */  == ia.gcyn("gdmn", gcyk(int ), (int)272)) break;
                    v38 /* !! */  = (long)ia.gcyn("gdmo", gcyk(int ), (int)273);
                }
                while (true) {
                    if ((v39 /* !! */  = (cfr_temp_10 = ia.nf - ia.gcyn("gdmp", gdhe(int ), (int)86)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
                    if (v39 /* !! */  == ia.gcyn("gdmq", gcyk(int ), (int)274)) break;
                    v39 /* !! */  = (long)ia.gcyn("gdmr", gcyk(int ), (int)275);
                }
                v40 = this.noisePitch + (this.wantedNoisePitch - this.noisePitch) * ia.gcyn("gdms", gcyz(int ), (int)276);
                v41 /* !! */  = ia.nf;
                if (true) ** GOTO lbl224
                block97: while (true) {
                    v41 /* !! */  = (long)(v42 - ia.gcyn("gdmt", gdhe(int ), (int)87));
lbl224:
                    // 2 sources

                    switch ((int)v41 /* !! */ ) {
                        case -1810810136: {
                            break block97;
                        }
                        case -559679827: {
                            v42 = ia.gcyn("gdmu", gdhe(int ), (int)88);
                            continue block97;
                        }
                        case 1231868066: {
                            v42 = ia.gcyn("gdmv", gdhe(int ), (int)89);
                            continue block97;
                        }
                        case 1231898696: {
                            v42 = ia.gcyn("gdmw", gdhe(int ), (int)90);
                            continue block97;
                        }
                    }
                    break;
                }
                this.noisePitch = v40;
                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
            case 0: {
                var2_2 /* !! */  = (int)ia.gcyn("gdmx", gcyk(int ), (int)277);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl260
            }
            case 1: {
                var2_2 /* !! */  = (int)ia.gcyn("gdmy", gcyk(int ), (int)278);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl279
            }
            case 2: {
                var2_2 /* !! */  = (int)ia.gcyn("gdmz", gcyk(int ), (int)279);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl279
            }
lbl255:
            // 2 sources

            case 3: {
                var2_2 /* !! */  = (int)ia.gcyn("gdna", gcyk(int ), (int)280);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl293
            }
lbl260:
            // 2 sources

            case 4: {
                var2_2 /* !! */  = (int)ia.gcyn("gdnb", gcyk(int ), (int)281);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl310
            }
lbl265:
            // 2 sources

            case 5: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ia.gcyn("gdnc", gcyk(int ), (int)282);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl306
                    break;
                }
            }
            case 6: {
                var2_2 /* !! */  = (int)ia.gcyn("gdnd", gcyk(int ), (int)283);
                if (!var3_1) ** GOTO lbl255
                throw null;
            }
            case 7: {
                var2_2 /* !! */  = (int)ia.gcyn("gdne", gcyk(int ), (int)284);
                if (!var3_1) ** GOTO lbl265
                throw null;
            }
lbl279:
            // 4 sources

            case 8: {
                do {
                    var2_2 /* !! */  = (int)ia.gcyn("gdnf", gcyk(int ), (int)285);
                } while (!var3_1);
                throw null;
            }
lbl284:
            // 2 sources

            case 9: {
                var2_2 /* !! */  = (int)ia.gcyn("gdng", gcyk(int ), (int)286);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl310
            }
lbl289:
            // 3 sources

            case 10: {
                var2_2 /* !! */  = (int)ia.gcyn("gdnh", gcyk(int ), (int)287);
                if (!var3_1) ** GOTO lbl284
                throw null;
            }
lbl293:
            // 3 sources

            case 11: {
                var2_2 /* !! */  = (int)ia.gcyn("gdni", gcyk(int ), (int)288);
                if (!var3_1) ** GOTO lbl289
                throw null;
            }
            case 12: {
                var2_2 /* !! */  = (int)ia.gcyn("gdnj", gcyk(int ), (int)289);
                if (!var3_1) ** GOTO lbl293
                throw null;
            }
            case 13: {
                do {
                    var2_2 /* !! */  = (int)ia.gcyn("gdnk", gcyk(int ), (int)290);
                } while (!var3_1);
                throw null;
            }
lbl306:
            // 2 sources

            case 14: {
                var2_2 /* !! */  = (int)ia.gcyn("gdnl", gcyk(int ), (int)291);
                if (!var3_1) ** GOTO lbl279
                throw null;
            }
lbl310:
            // 3 sources

            case 15: {
                var2_2 /* !! */  = (int)ia.gcyn("gdnm", gcyk(int ), (int)292);
                if (!var3_1) ** GOTO lbl289
                throw null;
            }
            case 16: 
        }
        var2_2 /* !! */  = (int)ia.gcyn("gdnn", gcyk(int ), (int)293);
        ** while (!var3_1)
lbl317:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ long gdhe(int n2) {
        return gddr[n2] ^ gdds[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void reset() {
        v0 /* !! */  = ia.nf;
        if (true) ** GOTO lbl5
        block36: while (true) {
            v0 /* !! */  = (long)(v1 - ia.gcyn("gdof", gdhe(int ), (int)99));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1810810136: {
                    break block36;
                }
                case -591085641: {
                    v1 = ia.gcyn("gdog", gdhe(int ), (int)100);
                    continue block36;
                }
                case 285955833: {
                    v1 = ia.gcyn("gdoh", gdhe(int ), (int)101);
                    continue block36;
                }
                case 1261580416: {
                    v1 = ia.gcyn("gdoi", gdhe(int ), (int)102);
                    continue block36;
                }
            }
            break;
        }
        var3_1 = ia.c;
        v2 /* !! */  = ia.nf;
        if (true) ** GOTO lbl22
        block37: while (true) {
            v2 /* !! */  = (long)(v3 - ia.gcyn("gdoj", gdhe(int ), (int)103));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1878095532: {
                    v3 = ia.gcyn("gdok", gdhe(int ), (int)104);
                    continue block37;
                }
                case -1810810136: {
                    break block37;
                }
                case -1442583718: {
                    v3 = ia.gcyn("gdol", gdhe(int ), (int)105);
                    continue block37;
                }
                case -18604436: {
                    v3 = ia.gcyn("gdom", gdhe(int ), (int)106);
                    continue block37;
                }
            }
            break;
        }
        var2_2 /* !! */  = ia.b;
        v4 /* !! */  = ia.nf;
        if (true) ** GOTO lbl39
        block38: while (true) {
            v4 /* !! */  = (long)(v5 - ia.gcyn("gdon", gdhe(int ), (int)107));
lbl39:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1810810136: {
                    break block38;
                }
                case -918066597: {
                    v5 = ia.gcyn("gdoo", gdhe(int ), (int)108);
                    continue block38;
                }
                case 1975280313: {
                    v5 = ia.gcyn("gdop", gdhe(int ), (int)109);
                    continue block38;
                }
            }
            break;
        }
        var1_3 = ia.a;
        if (!var3_1) ** GOTO lbl55
        throw null;
lbl-1000:
        // 5 sources

        {
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var2_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return;
                }
lbl55:
                // 1 sources

                if (var1_3 || var1_3) ** GOTO lbl-1000
                v6 = ia.gcyn("gdoq", gcyk(int ), (int)303);
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_0 = ia.nf - ia.gcyn("gdor", gdhe(int ), (int)110)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == ia.gcyn("gdos", gcyk(int ), (int)304)) break;
                    v7 /* !! */  = (long)ia.gcyn("gdot", gcyk(int ), (int)305);
                }
                this.initialized = v6;
                if (var1_3 || var1_3) ** GOTO lbl-1000
                v8 = ia.gcyn("gdou", gcyk(int ), (int)306);
                v9 /* !! */  = ia.nf;
                if (true) ** GOTO lbl69
                block41: while (true) {
                    v9 /* !! */  = (long)(v10 - ia.gcyn("gdov", gdhe(int ), (int)111));
lbl69:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -1810810136: {
                            break block41;
                        }
                        case -292876571: {
                            v10 = ia.gcyn("gdow", gdhe(int ), (int)112);
                            continue block41;
                        }
                        case 1300141041: {
                            v10 = ia.gcyn("gdox", gdhe(int ), (int)113);
                            continue block41;
                        }
                    }
                    break;
                }
                this.trackedEntityId = (int)v8;
                if (var1_3 || var1_3) ** GOTO lbl-1000
                v11 = ia.gcyn("gdoy", gcyk(int ), (int)307);
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_1 = ia.nf - ia.gcyn("gdoz", gdhe(int ), (int)114)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == ia.gcyn("gdpa", gcyk(int ), (int)308)) break;
                    v12 /* !! */  = (long)ia.gcyn("gdpb", gcyk(int ), (int)309);
                }
                this.pointLockTicks = (int)v11;
                if (var1_3 || var1_3) ** GOTO lbl-1000
                v13 = ia.gcyn("gdpc", gcyk(int ), (int)310);
                while (true) {
                    if ((v14 /* !! */  = (cfr_temp_2 = ia.nf - ia.gcyn("gdpd", gdhe(int ), (int)115)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v14 /* !! */  == ia.gcyn("gdpe", gcyk(int ), (int)311)) break;
                    v14 /* !! */  = (long)ia.gcyn("gdpf", gcyk(int ), (int)312);
                }
                this.noiseTicks = (int)v13;
                if (var1_3 || var1_3) continue block39;
                return;
lbl97:
                // 2 sources

                case 0: {
                    var2_2 /* !! */  = (int)ia.gcyn("gdpg", gcyk(int ), (int)313);
                    if (var3_1) {
                        throw null;
                    }
                }
lbl101:
                // 5 sources

                case 1: {
                    var2_2 /* !! */  = (int)ia.gcyn("gdph", gcyk(int ), (int)314);
                    if (var3_1) {
                        throw null;
                    }
                }
lbl105:
                // 4 sources

                case 2: {
                    var2_2 /* !! */  = (int)ia.gcyn("gdpi", gcyk(int ), (int)315);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl139
                }
                case 3: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var2_2 /* !! */  = (int)ia.gcyn("gdpj", gcyk(int ), (int)316);
                        if (!var3_1) ** GOTO lbl97
                        throw null;
                    }
                }
                case 4: {
                    var2_2 /* !! */  = (int)ia.gcyn("gdpk", gcyk(int ), (int)317);
                    if (!var3_1) ** GOTO lbl101
                    throw null;
                }
                case 5: {
                    var2_2 /* !! */  = (int)ia.gcyn("gdpl", gcyk(int ), (int)318);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 6: {
                    var2_2 /* !! */  = (int)ia.gcyn("gdpm", gcyk(int ), (int)319);
                    if (var3_1) {
                        throw null;
                    }
                }
lbl127:
                // 5 sources

                case 7: {
                    var2_2 /* !! */  = (int)ia.gcyn("gdpn", gcyk(int ), (int)320);
                    if (!var3_1) ** GOTO lbl101
                    throw null;
                }
                case 8: {
                    var2_2 /* !! */  = (int)ia.gcyn("gdpo", gcyk(int ), (int)321);
                    if (!var3_1) ** GOTO lbl127
                    throw null;
                }
                case 9: {
                    var2_2 /* !! */  = (int)ia.gcyn("gdpp", gcyk(int ), (int)322);
                    if (!var3_1) ** GOTO lbl127
                    throw null;
                }
lbl139:
                // 2 sources

                case 10: {
                    var2_2 /* !! */  = (int)ia.gcyn("gdpq", gcyk(int ), (int)323);
                    if (!var3_1) ** GOTO lbl105
                    throw null;
                }
                case 11: 
            }
        }
        var2_2 /* !! */  = (int)ia.gcyn("gdpr", gcyk(int ), (int)324);
        ** while (!var3_1)
lbl146:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public class_243 randomValue() {
        v0 /* !! */  = ia.nf;
        if (true) ** GOTO lbl5
        block24: while (true) {
            v0 /* !! */  = (long)(v1 - ia.gcyn("gdps", gdhe(int ), (int)116));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1810810136: {
                    break block24;
                }
                case -1426150243: {
                    v1 = ia.gcyn("gdpt", gdhe(int ), (int)117);
                    continue block24;
                }
                case 634013860: {
                    v1 = ia.gcyn("gdpu", gdhe(int ), (int)118);
                    continue block24;
                }
                case 850731221: {
                    v1 = ia.gcyn("gdpv", gdhe(int ), (int)119);
                    continue block24;
                }
            }
            break;
        }
        var3_1 = ia.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = ia.nf - ia.gcyn("gdpw", gdhe(int ), (int)120)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == ia.gcyn("gdpx", gcyk(int ), (int)325)) break;
            v2 /* !! */  = (long)ia.gcyn("gdpy", gcyk(int ), (int)326);
        }
        var2_2 /* !! */  = ia.b;
        v3 /* !! */  = ia.nf;
        if (true) ** GOTO lbl29
        block26: while (true) {
            v3 /* !! */  = (long)(v4 - ia.gcyn("gdpz", gdhe(int ), (int)121));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1810810136: {
                    break block26;
                }
                case -1446971812: {
                    v4 = ia.gcyn("gdqa", gdhe(int ), (int)122);
                    continue block26;
                }
                case -1375822607: {
                    v4 = ia.gcyn("gdqb", gdhe(int ), (int)123);
                    continue block26;
                }
                case -1232561451: {
                    v4 = ia.gcyn("gdqc", gdhe(int ), (int)124);
                    continue block26;
                }
            }
            break;
        }
        var1_3 = ia.a;
        if (!var3_1) ** GOTO lbl48
        throw null;
        {
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var2_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return null;
                }
lbl48:
                // 1 sources

                if (var1_3 || var1_3) continue block27;
                v5 /* !! */  = ia.nf;
                if (true) ** GOTO lbl53
                block28: while (true) {
                    v5 /* !! */  = (long)(v6 - ia.gcyn("gdqd", gdhe(int ), (int)125));
lbl53:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1810810136: {
                            break block28;
                        }
                        case -1166901038: {
                            v6 = ia.gcyn("gdqe", gdhe(int ), (int)126);
                            continue block28;
                        }
                        case -829657692: {
                            v6 = ia.gcyn("gdqf", gdhe(int ), (int)127);
                            continue block28;
                        }
                        case 1298109394: {
                            v6 = ia.gcyn("gdqg", gdhe(int ), (int)128);
                            continue block28;
                        }
                    }
                    break;
                }
                return class_243.field_1353;
lbl66:
                // 2 sources

                case 0: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var2_2 /* !! */  = (int)ia.gcyn("gdqh", gcyk(int ), (int)327);
                        if (!var3_1) break block27;
                        throw null;
                    }
                }
lbl71:
                // 2 sources

                case 1: {
                    var2_2 /* !! */  = (int)ia.gcyn("gdqi", gcyk(int ), (int)328);
                    if (!var3_1) ** GOTO lbl66
                    throw null;
                }
                case 2: {
                    var2_2 /* !! */  = (int)ia.gcyn("gdqj", gcyk(int ), (int)329);
                    if (!var3_1) ** GOTO lbl71
                    throw null;
                }
                case 3: 
            }
        }
        var2_2 /* !! */  = (int)ia.gcyn("gdqk", gcyk(int ), (int)330);
        ** while (!var3_1)
lbl82:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void gdqv() {
        ia.gdds[0] = 8913315884521975267L;
        ia.gdds[1] = 1278414176405453062L;
        ia.gdds[2] = 2671802221305522653L;
        ia.gdds[3] = -6492170526535139264L;
        ia.gdds[4] = 2564932947842819263L;
        ia.gdds[5] = -6213449853987366698L;
        ia.gdds[6] = 8863930311937158563L;
        ia.gdds[7] = -6900255211446677962L;
        ia.gdds[8] = -650730499743682417L;
        ia.gdds[9] = 329547147852521156L;
        ia.gdds[10] = -405701711029179596L;
        ia.gdds[11] = -1791085886899671199L;
        ia.gdds[12] = 3440243824817731255L;
        ia.gdds[13] = -5481468517627309312L;
        ia.gdds[14] = 5037551944289984022L;
        ia.gdds[15] = 1236692562131377862L;
        ia.gdds[16] = -292228974086812819L;
        ia.gdds[17] = 5731814497611894539L;
        ia.gdds[18] = 681000115443332438L;
        ia.gdds[19] = -3490359752489226079L;
        ia.gdds[20] = -2244603876887345639L;
        ia.gdds[21] = 7859681206669288429L;
        ia.gdds[22] = 3090159653563561952L;
        ia.gdds[23] = 605675055709449062L;
        ia.gdds[24] = 3851169304146159774L;
        ia.gdds[25] = 2099439063201169731L;
        ia.gdds[26] = 5831514803731910599L;
        ia.gdds[27] = 4020373370851431676L;
        ia.gdds[28] = 6364352908609178170L;
        ia.gdds[29] = 7547172996673291478L;
        ia.gdds[30] = 3116585152919236378L;
        ia.gdds[31] = -6563728131437242652L;
        ia.gdds[32] = 1761073616230910701L;
        ia.gdds[33] = -2574030357341045794L;
        ia.gdds[34] = 9081030935353111921L;
        ia.gdds[35] = -4652352612299804384L;
        ia.gdds[36] = -3835237591712547092L;
        ia.gdds[37] = 1832275150445374929L;
        ia.gdds[38] = -1445237065509475160L;
        ia.gdds[39] = 5824253524265882775L;
        ia.gdds[40] = 6578185863900366058L;
        ia.gdds[41] = -7749306442880271774L;
        ia.gdds[42] = 7596009764185926890L;
        ia.gdds[43] = 8860947138076780993L;
        ia.gdds[44] = -8728715149247250123L;
        ia.gdds[45] = 4489295449444627174L;
        ia.gdds[46] = 3333694983833799466L;
        ia.gdds[47] = 1570695303984187560L;
        ia.gdds[48] = 5207457650411286381L;
        ia.gdds[49] = -7621262840373796267L;
        ia.gdds[50] = -2537605553760653946L;
        ia.gdds[51] = 982620256147229622L;
        ia.gdds[52] = 3960901244305712718L;
        ia.gdds[53] = 4471232145736128332L;
        ia.gdds[54] = -1825861025826347833L;
        ia.gdds[55] = -359671173629035397L;
        ia.gdds[56] = 2378826042560671221L;
        ia.gdds[57] = 4651596515914667422L;
        ia.gdds[58] = -4367035495075077839L;
        ia.gdds[59] = 4569945490404011115L;
        ia.gdds[60] = 1557838648922310071L;
        ia.gdds[61] = 3632173194944236665L;
        ia.gdds[62] = 7584802492935315991L;
        ia.gdds[63] = -6624742821806658202L;
        ia.gdds[64] = -6904903232027011339L;
        ia.gdds[65] = -1665910307973928272L;
        ia.gdds[66] = 7279342961551249004L;
        ia.gdds[67] = 6528837460810116928L;
        ia.gdds[68] = -7720580426497040434L;
        ia.gdds[69] = -1317373871824978689L;
        ia.gdds[70] = 1257867060188429469L;
        ia.gdds[71] = 2843327222707208733L;
        ia.gdds[72] = 3641010914995025599L;
        ia.gdds[73] = 616407489836397913L;
        ia.gdds[74] = 7484887827557762189L;
        ia.gdds[75] = 7916522219007322982L;
        ia.gdds[76] = 560843984647626595L;
        ia.gdds[77] = 4599027766059414913L;
        ia.gdds[78] = -7159494075470177202L;
        ia.gdds[79] = 5483888013171516720L;
        ia.gdds[80] = 477619985112094841L;
        ia.gdds[81] = -2321872358961706764L;
        ia.gdds[82] = -9079011504080453561L;
        ia.gdds[83] = -7045376572833467218L;
        ia.gdds[84] = 561336011284241312L;
        ia.gdds[85] = -2987651882345951790L;
        ia.gdds[86] = 3120623817316653524L;
        ia.gdds[87] = -7703534119253166336L;
        ia.gdds[88] = -214297773975505484L;
        ia.gdds[89] = -904722948337733730L;
        ia.gdds[90] = -2910556499072256501L;
        ia.gdds[91] = -2254200267591663419L;
        ia.gdds[92] = 2815322165412157241L;
        ia.gdds[93] = 3864365468866882206L;
        ia.gdds[94] = 7557023515918133222L;
        ia.gdds[95] = -374450662034281049L;
        ia.gdds[96] = -5622466198515594401L;
        ia.gdds[97] = -1189157910048524371L;
        ia.gdds[98] = 6525334909391035802L;
        ia.gdds[99] = 7781641261718982853L;
    }

    private static /* synthetic */ int gcyk(int n2) {
        return gcyl[n2] ^ gcym[n2];
    }

    private static /* synthetic */ void gdqw() {
        ia.gdds[100] = 1942838987235303998L;
        ia.gdds[101] = -4096578442829318421L;
        ia.gdds[102] = 6752802934094247909L;
        ia.gdds[103] = 6887153997769743768L;
        ia.gdds[104] = -2606489512156874109L;
        ia.gdds[105] = 1829707874134495349L;
        ia.gdds[106] = -6188037287245900536L;
        ia.gdds[107] = -5109725609014244492L;
        ia.gdds[108] = 7626420208218266863L;
        ia.gdds[109] = 3573015094217403944L;
        ia.gdds[110] = -5033432625385380105L;
        ia.gdds[111] = 306780038289165236L;
        ia.gdds[112] = -495236445207443670L;
        ia.gdds[113] = -1222760565209362636L;
        ia.gdds[114] = -4113003184000445571L;
        ia.gdds[115] = -7321670985895614786L;
        ia.gdds[116] = 1171335386052201247L;
        ia.gdds[117] = -4071178272082601557L;
        ia.gdds[118] = -7041717736586355690L;
        ia.gdds[119] = 7838808023680970543L;
        ia.gdds[120] = 2830002106388373910L;
        ia.gdds[121] = -8262658754224044761L;
        ia.gdds[122] = -1432094162636794031L;
        ia.gdds[123] = -705262842412732175L;
        ia.gdds[124] = -2025959666866447322L;
        ia.gdds[125] = 7038108661015310483L;
        ia.gdds[126] = 7308766897015710971L;
        ia.gdds[127] = -6300418647211308237L;
        ia.gdds[128] = -8206303329334188129L;
    }

    private static /* synthetic */ float gcyz(int n2) {
        return Float.intBitsToFloat(gcyl[n2] ^ gcym[n2]);
    }

    private static /* synthetic */ void gdqo() {
        ia.gcyl[300] = 1862773168;
        ia.gcyl[301] = 1219531219;
        ia.gcyl[302] = 1865159415;
        ia.gcyl[303] = 2087935802;
        ia.gcyl[304] = -412676015;
        ia.gcyl[305] = 1170710833;
        ia.gcyl[306] = -1012284546;
        ia.gcyl[307] = -386669572;
        ia.gcyl[308] = 1477431068;
        ia.gcyl[309] = 172371867;
        ia.gcyl[310] = 266628911;
        ia.gcyl[311] = -1531024964;
        ia.gcyl[312] = 2007167275;
        ia.gcyl[313] = 1644478522;
        ia.gcyl[314] = -234340546;
        ia.gcyl[315] = 1305324223;
        ia.gcyl[316] = 1295997557;
        ia.gcyl[317] = -398260288;
        ia.gcyl[318] = 314970019;
        ia.gcyl[319] = -1949640890;
        ia.gcyl[320] = 1830134022;
        ia.gcyl[321] = 1700479268;
        ia.gcyl[322] = 912083507;
        ia.gcyl[323] = -997076886;
        ia.gcyl[324] = 1454664983;
        ia.gcyl[325] = 198002348;
        ia.gcyl[326] = 1912940790;
        ia.gcyl[327] = 259916125;
        ia.gcyl[328] = 1209625301;
        ia.gcyl[329] = 1552531771;
        ia.gcyl[330] = 1662864160;
    }

    public static /* synthetic */ CallSite gcyn(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public ia() {
        var2_1 /* !! */  = ia.b;
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block7: while (true) {
            block9: {
                switch (cfr_temp_0 == -2147483648 ? var2_1 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        super("ReallyWorld");
                        this.random = new SecureRandom();
                        this.trackedEntityId = (int)ia.gcyn("gcyo", gcyk(int ), (int)0);
                        return;
                    }
                    case 0: {
                        var2_1 /* !! */  = (int)ia.gcyn("gcyp", gcyk(int ), (int)1);
                    }
                    case 2: {
                        ** GOTO lbl17
                    }
                    case 4: {
                        var2_1 /* !! */  = (int)ia.gcyn("gcyt", gcyk(int ), (int)5);
lbl17:
                        // 2 sources

                        var2_1 /* !! */  = (int)ia.gcyn("gcyr", gcyk(int ), (int)3);
                        cfr_temp_0 = 3;
                        break block9;
                    }
                    case 1: {
                        var2_1 /* !! */  = (int)ia.gcyn("gcyq", gcyk(int ), (int)2);
                    }
                    case 3: 
                }
                ** GOTO lbl27
            }
            while (true) {
                if (true) continue block7;
lbl27:
                // 2 sources

                var2_1 /* !! */  = (int)ia.gcyn("gcys", gcyk(int ), (int)4);
                cfr_temp_0 = 1;
            }
            break;
        }
    }
}

