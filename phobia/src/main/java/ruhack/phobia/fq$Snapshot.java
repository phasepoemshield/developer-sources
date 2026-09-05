/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_315
 *  net.minecraft.class_4063
 *  net.minecraft.class_4066
 *  net.minecraft.class_5365
 *  net.minecraft.class_6597
 *  net.minecraft.class_9927
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.minecraft.class_315;
import net.minecraft.class_4063;
import net.minecraft.class_4066;
import net.minecraft.class_5365;
import net.minecraft.class_6597;
import net.minecraft.class_9927;

final class fq$Snapshot {
    private boolean cutoutLeaves;
    private boolean entityShadows;
    private boolean vsync;
    private double chunkFade;
    private double glintStrength;
    public static final boolean a;
    private String graphicsMode;
    private String chunkBuilderMode;
    private double glintSpeed;
    private boolean ambientOcclusion;
    private static int[] emew;
    private int biomeBlendRadius;
    private int menuBackgroundBlurriness;
    private int renderDistance;
    private boolean bobView;
    public static final boolean c;
    private boolean improvedTransparency;
    public static final int b;
    private String cloudMode;
    private boolean vignette;
    static final long kv = -6984665911939924625L;
    private int framerateLimit;
    private int simulationDistance;
    private String inactivityFpsLimit;
    private String particlesMode;
    private static int[] emev;
    private double entityDistanceScaling;

    static {
        emev = new int[94];
        emew = new int[94];
        fq$Snapshot.emio();
        fq$Snapshot.emip();
    }

    private static /* synthetic */ void emio() {
        fq$Snapshot.emev[0] = -2083385371;
        fq$Snapshot.emev[1] = 938193091;
        fq$Snapshot.emev[2] = -947541973;
        fq$Snapshot.emev[3] = -1774876530;
        fq$Snapshot.emev[4] = -851608369;
        fq$Snapshot.emev[5] = -1328628472;
        fq$Snapshot.emev[6] = -1619585665;
        fq$Snapshot.emev[7] = -703700471;
        fq$Snapshot.emev[8] = -1685900468;
        fq$Snapshot.emev[9] = -449174372;
        fq$Snapshot.emev[10] = 1030436108;
        fq$Snapshot.emev[11] = -1801321492;
        fq$Snapshot.emev[12] = 1124400605;
        fq$Snapshot.emev[13] = 405584605;
        fq$Snapshot.emev[14] = 1704607890;
        fq$Snapshot.emev[15] = 1825326771;
        fq$Snapshot.emev[16] = -1168197081;
        fq$Snapshot.emev[17] = 994537771;
        fq$Snapshot.emev[18] = 1818541035;
        fq$Snapshot.emev[19] = -322413689;
        fq$Snapshot.emev[20] = 49550763;
        fq$Snapshot.emev[21] = 204813039;
        fq$Snapshot.emev[22] = 592637822;
        fq$Snapshot.emev[23] = -672913960;
        fq$Snapshot.emev[24] = 1979649437;
        fq$Snapshot.emev[25] = -1741172631;
        fq$Snapshot.emev[26] = 512713009;
        fq$Snapshot.emev[27] = 2013222182;
        fq$Snapshot.emev[28] = -2113980141;
        fq$Snapshot.emev[29] = -1479299520;
        fq$Snapshot.emev[30] = -236589443;
        fq$Snapshot.emev[31] = -1891035702;
        fq$Snapshot.emev[32] = -203022897;
        fq$Snapshot.emev[33] = 1308306301;
        fq$Snapshot.emev[34] = -1194889889;
        fq$Snapshot.emev[35] = -1903662759;
        fq$Snapshot.emev[36] = -1973611173;
        fq$Snapshot.emev[37] = 1991635330;
        fq$Snapshot.emev[38] = 443283318;
        fq$Snapshot.emev[39] = -1536656030;
        fq$Snapshot.emev[40] = 2084931422;
        fq$Snapshot.emev[41] = -1739610534;
        fq$Snapshot.emev[42] = -265534553;
        fq$Snapshot.emev[43] = -133983505;
        fq$Snapshot.emev[44] = 106724148;
        fq$Snapshot.emev[45] = 182234856;
        fq$Snapshot.emev[46] = 1389146563;
        fq$Snapshot.emev[47] = -1317254577;
        fq$Snapshot.emev[48] = 2062992969;
        fq$Snapshot.emev[49] = 1805318735;
        fq$Snapshot.emev[50] = -1845826592;
        fq$Snapshot.emev[51] = 807299959;
        fq$Snapshot.emev[52] = -1302635587;
        fq$Snapshot.emev[53] = 1872758887;
        fq$Snapshot.emev[54] = 300499715;
        fq$Snapshot.emev[55] = 595425084;
        fq$Snapshot.emev[56] = -560628571;
        fq$Snapshot.emev[57] = -1297834139;
        fq$Snapshot.emev[58] = 1006709180;
        fq$Snapshot.emev[59] = -308765570;
        fq$Snapshot.emev[60] = 1928385911;
        fq$Snapshot.emev[61] = 651289443;
        fq$Snapshot.emev[62] = 995651438;
        fq$Snapshot.emev[63] = 1416684178;
        fq$Snapshot.emev[64] = 300794931;
        fq$Snapshot.emev[65] = -2005219456;
        fq$Snapshot.emev[66] = -1440012988;
        fq$Snapshot.emev[67] = -1023960120;
        fq$Snapshot.emev[68] = -593735669;
        fq$Snapshot.emev[69] = -2014836356;
        fq$Snapshot.emev[70] = 1297500676;
        fq$Snapshot.emev[71] = 688420293;
        fq$Snapshot.emev[72] = 1613796726;
        fq$Snapshot.emev[73] = -1693701583;
        fq$Snapshot.emev[74] = -1947359898;
        fq$Snapshot.emev[75] = -2122073303;
        fq$Snapshot.emev[76] = 311142789;
        fq$Snapshot.emev[77] = -1403511509;
        fq$Snapshot.emev[78] = 768177720;
        fq$Snapshot.emev[79] = -1982686542;
        fq$Snapshot.emev[80] = 1889549107;
        fq$Snapshot.emev[81] = 708877414;
        fq$Snapshot.emev[82] = -1433479755;
        fq$Snapshot.emev[83] = -1066891707;
        fq$Snapshot.emev[84] = -2109050303;
        fq$Snapshot.emev[85] = -1886430727;
        fq$Snapshot.emev[86] = -1384122720;
        fq$Snapshot.emev[87] = 494010937;
        fq$Snapshot.emev[88] = -1431906752;
        fq$Snapshot.emev[89] = 110788047;
        fq$Snapshot.emev[90] = -2020630449;
        fq$Snapshot.emev[91] = -1961725602;
        fq$Snapshot.emev[92] = 711735713;
        fq$Snapshot.emev[93] = -1406129898;
    }

    private static /* synthetic */ void emip() {
        fq$Snapshot.emew[0] = -2083385403;
        fq$Snapshot.emew[1] = 938193126;
        fq$Snapshot.emew[2] = -947542002;
        fq$Snapshot.emew[3] = -1774876512;
        fq$Snapshot.emew[4] = -851608358;
        fq$Snapshot.emew[5] = -1328628459;
        fq$Snapshot.emew[6] = -1619585667;
        fq$Snapshot.emew[7] = -703700454;
        fq$Snapshot.emew[8] = -1685900459;
        fq$Snapshot.emew[9] = -449174393;
        fq$Snapshot.emew[10] = 1030436143;
        fq$Snapshot.emew[11] = -1801321489;
        fq$Snapshot.emew[12] = 1124400607;
        fq$Snapshot.emew[13] = 405584588;
        fq$Snapshot.emew[14] = 1704607903;
        fq$Snapshot.emew[15] = 1825326766;
        fq$Snapshot.emew[16] = -1168197074;
        fq$Snapshot.emew[17] = 994537768;
        fq$Snapshot.emew[18] = 1818541005;
        fq$Snapshot.emew[19] = -322413680;
        fq$Snapshot.emew[20] = 49550727;
        fq$Snapshot.emew[21] = 204813006;
        fq$Snapshot.emew[22] = 592637798;
        fq$Snapshot.emew[23] = -672913971;
        fq$Snapshot.emew[24] = 1979649412;
        fq$Snapshot.emew[25] = -1741172658;
        fq$Snapshot.emew[26] = 512712993;
        fq$Snapshot.emew[27] = 2013222186;
        fq$Snapshot.emew[28] = -2113980137;
        fq$Snapshot.emew[29] = -1479299510;
        fq$Snapshot.emew[30] = -236589461;
        fq$Snapshot.emew[31] = -1891035690;
        fq$Snapshot.emew[32] = -203022898;
        fq$Snapshot.emew[33] = 1308306288;
        fq$Snapshot.emew[34] = -1194889915;
        fq$Snapshot.emew[35] = -1903662730;
        fq$Snapshot.emew[36] = -1973611176;
        fq$Snapshot.emew[37] = 1991635363;
        fq$Snapshot.emew[38] = 443283309;
        fq$Snapshot.emew[39] = -1536656002;
        fq$Snapshot.emew[40] = 2084931399;
        fq$Snapshot.emew[41] = -1739610501;
        fq$Snapshot.emew[42] = -265534533;
        fq$Snapshot.emew[43] = -133983550;
        fq$Snapshot.emew[44] = 106724118;
        fq$Snapshot.emew[45] = 182234864;
        fq$Snapshot.emew[46] = 1389146574;
        fq$Snapshot.emew[47] = -1317254580;
        fq$Snapshot.emew[48] = 2062993006;
        fq$Snapshot.emew[49] = 1805318737;
        fq$Snapshot.emew[50] = -1845826585;
        fq$Snapshot.emew[51] = 807299951;
        fq$Snapshot.emew[52] = -1302635612;
        fq$Snapshot.emew[53] = 1872758906;
        fq$Snapshot.emew[54] = 300499732;
        fq$Snapshot.emew[55] = 595425052;
        fq$Snapshot.emew[56] = -560628602;
        fq$Snapshot.emew[57] = -1297834171;
        fq$Snapshot.emew[58] = 1006709136;
        fq$Snapshot.emew[59] = -308765580;
        fq$Snapshot.emew[60] = 1928385879;
        fq$Snapshot.emew[61] = 651289408;
        fq$Snapshot.emew[62] = 995651433;
        fq$Snapshot.emew[63] = 1416684189;
        fq$Snapshot.emew[64] = 300794903;
        fq$Snapshot.emew[65] = -2005219424;
        fq$Snapshot.emew[66] = -1440012957;
        fq$Snapshot.emew[67] = -1023960104;
        fq$Snapshot.emew[68] = -593735673;
        fq$Snapshot.emew[69] = -2014836362;
        fq$Snapshot.emew[70] = 1297500700;
        fq$Snapshot.emew[71] = 688420307;
        fq$Snapshot.emew[72] = 1613796715;
        fq$Snapshot.emew[73] = -1693701600;
        fq$Snapshot.emew[74] = -1947359888;
        fq$Snapshot.emew[75] = -2122073285;
        fq$Snapshot.emew[76] = 311142801;
        fq$Snapshot.emew[77] = -1403511551;
        fq$Snapshot.emew[78] = 768177694;
        fq$Snapshot.emew[79] = -1982686571;
        fq$Snapshot.emew[80] = 1889549074;
        fq$Snapshot.emew[81] = 708877428;
        fq$Snapshot.emew[82] = -1433479765;
        fq$Snapshot.emew[83] = -1066891698;
        fq$Snapshot.emew[84] = -2109050281;
        fq$Snapshot.emew[85] = -1886430723;
        fq$Snapshot.emew[86] = -1384122746;
        fq$Snapshot.emew[87] = 494010896;
        fq$Snapshot.emew[88] = -1431906722;
        fq$Snapshot.emew[89] = 110788033;
        fq$Snapshot.emew[90] = -2020630420;
        fq$Snapshot.emew[91] = -1961725610;
        fq$Snapshot.emew[92] = 711735742;
        fq$Snapshot.emew[93] = -1406129865;
    }

    public static /* synthetic */ CallSite emex(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void restore(class_315 var1_1) {
        var4_2 = fq$Snapshot.c;
        var3_3 /* !! */  = fq$Snapshot.b;
        var2_4 = fq$Snapshot.a;
        if (var4_2) {
            throw null;
lbl6:
            // 23 sources

            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl6
        var1_1.method_75329().method_41748((Object)class_5365.valueOf((String)this.graphicsMode));
        if (var2_4 || var2_4) ** GOTO lbl6
        var1_1.method_42528().method_41748((Object)class_4063.valueOf((String)this.cloudMode));
        if (var2_4 || var2_4) ** GOTO lbl6
        var1_1.method_42475().method_41748((Object)class_4066.valueOf((String)this.particlesMode));
        if (var2_4 || var2_4) ** GOTO lbl6
        var1_1.method_41798().method_41748((Object)class_6597.valueOf((String)this.chunkBuilderMode));
        if (var2_4 || var2_4) ** GOTO lbl6
        var1_1.method_61970().method_41748((Object)class_9927.valueOf((String)this.inactivityFpsLimit));
        if (var2_4 || var2_4) ** GOTO lbl6
        var1_1.method_42435().method_41748((Object)this.entityShadows);
        if (var2_4 || var2_4) ** GOTO lbl6
        var1_1.method_41792().method_41748((Object)this.ambientOcclusion);
        if (var2_4 || var2_4) ** GOTO lbl6
        var1_1.method_75335().method_41748((Object)this.vignette);
        if (var2_4 || var2_4) ** GOTO lbl6
        var1_1.method_75337().method_41748((Object)this.improvedTransparency);
        if (var2_4 || var2_4) ** GOTO lbl6
        var1_1.method_75334().method_41748((Object)this.cutoutLeaves);
        if (var2_4 || var2_4) ** GOTO lbl6
        var1_1.method_42448().method_41748((Object)this.bobView);
        if (var2_4 || var2_4) ** GOTO lbl6
        var1_1.method_42433().method_41748((Object)this.vsync);
        if (var2_4 || var2_4) ** GOTO lbl6
        var1_1.method_42524().method_41748((Object)this.framerateLimit);
        if (var2_4 || var2_4) ** GOTO lbl6
        var1_1.method_41805().method_41748((Object)this.biomeBlendRadius);
        if (var2_4 || var2_4) ** GOTO lbl6
        var1_1.method_42517().method_41748((Object)this.entityDistanceScaling);
        if (var2_4 || var2_4) ** GOTO lbl6
        var1_1.method_76253().method_41748((Object)this.chunkFade);
        if (var2_4) ** GOTO lbl6
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** GOTO lbl6
                var1_1.method_57702().method_41748((Object)this.menuBackgroundBlurriness);
                if (var2_4 || var2_4) ** GOTO lbl6
                var1_1.method_48580().method_41748((Object)this.glintSpeed);
                if (var2_4 || var2_4) ** GOTO lbl6
                var1_1.method_48581().method_41748((Object)this.glintStrength);
                if (var2_4 || var2_4) ** GOTO lbl6
                var1_1.method_42503().method_41748((Object)this.renderDistance);
                if (var2_4 || var2_4) ** GOTO lbl6
                var1_1.method_42510().method_41748((Object)this.simulationDistance);
                if (!var2_4 && !var2_4) ** break;
                ** continue;
                return;
            }
            case 0: {
                var3_3 /* !! */  = (int)fq$Snapshot.emex("emgu", emeu(int ), (int)48);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl181
            }
lbl62:
            // 2 sources

            case 1: {
                var3_3 /* !! */  = (int)fq$Snapshot.emex("emgv", emeu(int ), (int)49);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl255
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)fq$Snapshot.emex("emgw", emeu(int ), (int)50);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl231
                    break;
                }
            }
lbl73:
            // 2 sources

            case 3: {
                var3_3 /* !! */  = (int)fq$Snapshot.emex("emgx", emeu(int ), (int)51);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl193
            }
            case 4: {
                var3_3 /* !! */  = (int)fq$Snapshot.emex("emgy", emeu(int ), (int)52);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl172
            }
lbl83:
            // 4 sources

            case 5: {
                var3_3 /* !! */  = (int)fq$Snapshot.emex("emgz", emeu(int ), (int)53);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl145
            }
            case 6: {
                var3_3 /* !! */  = (int)fq$Snapshot.emex("emha", emeu(int ), (int)54);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl108
            }
lbl93:
            // 2 sources

            case 7: {
                var3_3 /* !! */  = (int)fq$Snapshot.emex("emhb", emeu(int ), (int)55);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl251
            }
lbl98:
            // 2 sources

            case 8: {
                var3_3 /* !! */  = (int)fq$Snapshot.emex("emhc", emeu(int ), (int)56);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl223
            }
lbl103:
            // 2 sources

            case 9: {
                var3_3 /* !! */  = (int)fq$Snapshot.emex("emhd", emeu(int ), (int)57);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl239
            }
lbl108:
            // 2 sources

            case 10: {
                var3_3 /* !! */  = (int)fq$Snapshot.emex("emhe", emeu(int ), (int)58);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl198
            }
lbl113:
            // 2 sources

            case 11: {
                var3_3 /* !! */  = (int)fq$Snapshot.emex("emhf", emeu(int ), (int)59);
                if (!var4_2) ** GOTO lbl83
                throw null;
            }
            case 12: {
                var3_3 /* !! */  = (int)fq$Snapshot.emex("emhg", emeu(int ), (int)60);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl159
            }
            case 13: {
                var3_3 /* !! */  = (int)fq$Snapshot.emex("emhh", emeu(int ), (int)61);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl198
            }
            case 14: {
                var3_3 /* !! */  = (int)fq$Snapshot.emex("emhi", emeu(int ), (int)62);
                if (!var4_2) ** GOTO lbl93
                throw null;
            }
            case 15: {
                var3_3 /* !! */  = (int)fq$Snapshot.emex("emhj", emeu(int ), (int)63);
                if (!var4_2) ** GOTO lbl73
                throw null;
            }
lbl135:
            // 3 sources

            case 16: {
                var3_3 /* !! */  = (int)fq$Snapshot.emex("emhk", emeu(int ), (int)64);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl154
            }
            case 17: {
                var3_3 /* !! */  = (int)fq$Snapshot.emex("emhl", emeu(int ), (int)65);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl154
            }
lbl145:
            // 3 sources

            case 18: {
                var3_3 /* !! */  = (int)fq$Snapshot.emex("emhm", emeu(int ), (int)66);
                if (!var4_2) ** GOTO lbl113
                throw null;
            }
            case 19: {
                var3_3 /* !! */  = (int)fq$Snapshot.emex("emhn", emeu(int ), (int)67);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl251
            }
lbl154:
            // 3 sources

            case 20: {
                var3_3 /* !! */  = (int)fq$Snapshot.emex("emho", emeu(int ), (int)68);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl193
            }
lbl159:
            // 2 sources

            case 21: {
                var3_3 /* !! */  = (int)fq$Snapshot.emex("emhp", emeu(int ), (int)69);
                if (!var4_2) ** GOTO lbl145
                throw null;
            }
lbl163:
            // 2 sources

            case 22: {
                var3_3 /* !! */  = (int)fq$Snapshot.emex("emhq", emeu(int ), (int)70);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl215
            }
lbl168:
            // 2 sources

            case 23: {
                var3_3 /* !! */  = (int)fq$Snapshot.emex("emhr", emeu(int ), (int)71);
                if (!var4_2) ** GOTO lbl62
                throw null;
            }
lbl172:
            // 3 sources

            case 24: {
                var3_3 /* !! */  = (int)fq$Snapshot.emex("emhs", emeu(int ), (int)72);
                if (var4_2) {
                    throw null;
                }
            }
lbl176:
            // 4 sources

            case 25: {
                var3_3 /* !! */  = (int)fq$Snapshot.emex("emht", emeu(int ), (int)73);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl231
            }
lbl181:
            // 3 sources

            case 26: {
                var3_3 /* !! */  = (int)fq$Snapshot.emex("emhu", emeu(int ), (int)74);
                if (!var4_2) ** GOTO lbl103
                throw null;
            }
            case 27: {
                var3_3 /* !! */  = (int)fq$Snapshot.emex("emhv", emeu(int ), (int)75);
                if (!var4_2) ** GOTO lbl168
                throw null;
            }
            case 28: {
                var3_3 /* !! */  = (int)fq$Snapshot.emex("emhw", emeu(int ), (int)76);
                if (var4_2) {
                    throw null;
                }
            }
lbl193:
            // 5 sources

            case 29: {
                var3_3 /* !! */  = (int)fq$Snapshot.emex("emhx", emeu(int ), (int)77);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl235
            }
lbl198:
            // 4 sources

            case 30: {
                var3_3 /* !! */  = (int)fq$Snapshot.emex("emhy", emeu(int ), (int)78);
                if (!var4_2) ** GOTO lbl135
                throw null;
            }
            case 31: {
                var3_3 /* !! */  = (int)fq$Snapshot.emex("emhz", emeu(int ), (int)79);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl215
            }
            case 32: {
                var3_3 /* !! */  = (int)fq$Snapshot.emex("emia", emeu(int ), (int)80);
                if (!var4_2) ** GOTO lbl98
                throw null;
            }
lbl211:
            // 2 sources

            case 33: {
                var3_3 /* !! */  = (int)fq$Snapshot.emex("emib", emeu(int ), (int)81);
                if (!var4_2) ** GOTO lbl163
                throw null;
            }
lbl215:
            // 4 sources

            case 34: {
                var3_3 /* !! */  = (int)fq$Snapshot.emex("emic", emeu(int ), (int)82);
                if (!var4_2) ** GOTO lbl198
                throw null;
            }
lbl219:
            // 2 sources

            case 35: {
                var3_3 /* !! */  = (int)fq$Snapshot.emex("emid", emeu(int ), (int)83);
                if (!var4_2) ** GOTO lbl176
                throw null;
            }
lbl223:
            // 2 sources

            case 36: {
                var3_3 /* !! */  = (int)fq$Snapshot.emex("emie", emeu(int ), (int)84);
                if (!var4_2) ** GOTO lbl83
                throw null;
            }
            case 37: {
                var3_3 /* !! */  = (int)fq$Snapshot.emex("emif", emeu(int ), (int)85);
                if (!var4_2) ** GOTO lbl135
                throw null;
            }
lbl231:
            // 4 sources

            case 38: {
                var3_3 /* !! */  = (int)fq$Snapshot.emex("emig", emeu(int ), (int)86);
                if (!var4_2) ** GOTO lbl219
                throw null;
            }
lbl235:
            // 2 sources

            case 39: {
                var3_3 /* !! */  = (int)fq$Snapshot.emex("emih", emeu(int ), (int)87);
                if (!var4_2) ** GOTO lbl172
                throw null;
            }
lbl239:
            // 2 sources

            case 40: {
                var3_3 /* !! */  = (int)fq$Snapshot.emex("emii", emeu(int ), (int)88);
                if (!var4_2) ** GOTO lbl215
                throw null;
            }
            case 41: {
                var3_3 /* !! */  = (int)fq$Snapshot.emex("emij", emeu(int ), (int)89);
                if (!var4_2) ** GOTO lbl181
                throw null;
            }
            case 42: {
                var3_3 /* !! */  = (int)fq$Snapshot.emex("emik", emeu(int ), (int)90);
                if (!var4_2) ** GOTO lbl83
                throw null;
            }
lbl251:
            // 3 sources

            case 43: {
                var3_3 /* !! */  = (int)fq$Snapshot.emex("emil", emeu(int ), (int)91);
                if (!var4_2) ** GOTO lbl231
                throw null;
            }
lbl255:
            // 2 sources

            case 44: {
                var3_3 /* !! */  = (int)fq$Snapshot.emex("emim", emeu(int ), (int)92);
                if (!var4_2) ** GOTO lbl211
                throw null;
            }
            case 45: 
        }
        var3_3 /* !! */  = (int)fq$Snapshot.emex("emin", emeu(int ), (int)93);
        ** while (!var4_2)
lbl262:
        // 1 sources

        throw null;
    }

    private fq$Snapshot() {
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static fq$Snapshot capture(class_315 var0) {
        var4_1 = fq$Snapshot.c;
        var3_2 /* !! */  = fq$Snapshot.b;
        var2_3 = fq$Snapshot.a;
        if (var4_1) {
            throw null;
lbl6:
            // 24 sources

            return null;
        }
        if (var2_3) ** GOTO lbl6
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_3) ** GOTO lbl6
                var1_4 = new fq$Snapshot();
                if (var2_3 || var2_3) ** GOTO lbl6
                var1_4.graphicsMode = ((class_5365)var0.method_75329().method_41753()).name();
                if (var2_3 || var2_3) ** GOTO lbl6
                var1_4.cloudMode = ((class_4063)var0.method_42528().method_41753()).name();
                if (var2_3 || var2_3) ** GOTO lbl6
                var1_4.particlesMode = ((class_4066)var0.method_42475().method_41753()).name();
                if (var2_3 || var2_3) ** GOTO lbl6
                var1_4.chunkBuilderMode = ((class_6597)var0.method_41798().method_41753()).name();
                if (var2_3 || var2_3) ** GOTO lbl6
                var1_4.inactivityFpsLimit = ((class_9927)var0.method_61970().method_41753()).name();
                if (var2_3 || var2_3) ** GOTO lbl6
                var1_4.entityShadows = (Boolean)var0.method_42435().method_41753();
                if (var2_3 || var2_3) ** GOTO lbl6
                var1_4.ambientOcclusion = (Boolean)var0.method_41792().method_41753();
                if (var2_3 || var2_3) ** GOTO lbl6
                var1_4.vignette = (Boolean)var0.method_75335().method_41753();
                if (var2_3 || var2_3) ** GOTO lbl6
                var1_4.improvedTransparency = (Boolean)var0.method_75337().method_41753();
                if (var2_3 || var2_3) ** GOTO lbl6
                var1_4.cutoutLeaves = (Boolean)var0.method_75334().method_41753();
                if (var2_3 || var2_3) ** GOTO lbl6
                var1_4.bobView = (Boolean)var0.method_42448().method_41753();
                if (var2_3 || var2_3) ** GOTO lbl6
                var1_4.vsync = (Boolean)var0.method_42433().method_41753();
                if (var2_3 || var2_3) ** GOTO lbl6
                var1_4.framerateLimit = (Integer)var0.method_42524().method_41753();
                if (var2_3 || var2_3) ** GOTO lbl6
                var1_4.biomeBlendRadius = (Integer)var0.method_41805().method_41753();
                if (var2_3 || var2_3) ** GOTO lbl6
                var1_4.entityDistanceScaling = (Double)var0.method_42517().method_41753();
                if (var2_3 || var2_3) ** GOTO lbl6
                var1_4.chunkFade = (Double)var0.method_76253().method_41753();
                if (var2_3 || var2_3) ** GOTO lbl6
                var1_4.menuBackgroundBlurriness = (Integer)var0.method_57702().method_41753();
                if (var2_3 || var2_3) ** GOTO lbl6
                var1_4.glintSpeed = (Double)var0.method_48580().method_41753();
                if (var2_3 || var2_3) ** GOTO lbl6
                var1_4.glintStrength = (Double)var0.method_48581().method_41753();
                if (var2_3 || var2_3) ** GOTO lbl6
                var1_4.renderDistance = (Integer)var0.method_42503().method_41753();
                if (var2_3 || var2_3) ** GOTO lbl6
                var1_4.simulationDistance = (Integer)var0.method_42510().method_41753();
                if (!var2_3 && !var2_3) ** break;
                ** continue;
                return var1_4;
            }
lbl59:
            // 2 sources

            case 0: {
                var3_2 /* !! */  = (int)fq$Snapshot.emex("emey", emeu(int ), (int)0);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl218
            }
lbl64:
            // 3 sources

            case 1: {
                var3_2 /* !! */  = (int)fq$Snapshot.emex("emez", emeu(int ), (int)1);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl150
            }
            case 2: {
                var3_2 /* !! */  = (int)fq$Snapshot.emex("emfa", emeu(int ), (int)2);
                if (!var4_1) ** GOTO lbl64
                throw null;
            }
lbl73:
            // 2 sources

            case 3: {
                var3_2 /* !! */  = (int)fq$Snapshot.emex("emfb", emeu(int ), (int)3);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl222
            }
            case 4: {
                var3_2 /* !! */  = (int)fq$Snapshot.emex("emfc", emeu(int ), (int)4);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl113
            }
lbl83:
            // 2 sources

            case 5: {
                var3_2 /* !! */  = (int)fq$Snapshot.emex("emfd", emeu(int ), (int)5);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl135
            }
lbl88:
            // 2 sources

            case 6: {
                var3_2 /* !! */  = (int)fq$Snapshot.emex("emfe", emeu(int ), (int)6);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl165
            }
lbl93:
            // 2 sources

            case 7: {
                var3_2 /* !! */  = (int)fq$Snapshot.emex("emff", emeu(int ), (int)7);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl218
            }
lbl98:
            // 2 sources

            case 8: {
                var3_2 /* !! */  = (int)fq$Snapshot.emex("emfg", emeu(int ), (int)8);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl135
            }
            case 9: {
                var3_2 /* !! */  = (int)fq$Snapshot.emex("emfh", emeu(int ), (int)9);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl131
            }
            case 10: {
                var3_2 /* !! */  = (int)fq$Snapshot.emex("emfi", emeu(int ), (int)10);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl236
            }
lbl113:
            // 2 sources

            case 11: {
                var3_2 /* !! */  = (int)fq$Snapshot.emex("emfj", emeu(int ), (int)11);
                if (!var4_1) ** GOTO lbl64
                throw null;
            }
lbl117:
            // 3 sources

            case 12: {
                var3_2 /* !! */  = (int)fq$Snapshot.emex("emfk", emeu(int ), (int)12);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl236
            }
            case 13: {
                var3_2 /* !! */  = (int)fq$Snapshot.emex("emfl", emeu(int ), (int)13);
                if (!var4_1) ** GOTO lbl117
                throw null;
            }
lbl126:
            // 2 sources

            case 14: {
                do {
                    var3_2 /* !! */  = (int)fq$Snapshot.emex("emfm", emeu(int ), (int)14);
                } while (!var4_1);
                throw null;
            }
lbl131:
            // 2 sources

            case 15: {
                var3_2 /* !! */  = (int)fq$Snapshot.emex("emfn", emeu(int ), (int)15);
                if (!var4_1) ** GOTO lbl117
                throw null;
            }
lbl135:
            // 3 sources

            case 16: {
                var3_2 /* !! */  = (int)fq$Snapshot.emex("emfo", emeu(int ), (int)16);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl196
            }
            case 17: {
                var3_2 /* !! */  = (int)fq$Snapshot.emex("emfp", emeu(int ), (int)17);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl259
            }
            case 18: {
                var3_2 /* !! */  = (int)fq$Snapshot.emex("emfq", emeu(int ), (int)18);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl178
            }
lbl150:
            // 2 sources

            case 19: {
                do {
                    var3_2 /* !! */  = (int)fq$Snapshot.emex("emfr", emeu(int ), (int)19);
                } while (!var4_1);
                throw null;
            }
            case 20: {
                var3_2 /* !! */  = (int)fq$Snapshot.emex("emfs", emeu(int ), (int)20);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl250
            }
lbl160:
            // 2 sources

            case 21: {
                var3_2 /* !! */  = (int)fq$Snapshot.emex("emft", emeu(int ), (int)21);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl178
            }
lbl165:
            // 2 sources

            case 22: {
                var3_2 /* !! */  = (int)fq$Snapshot.emex("emfu", emeu(int ), (int)22);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl267
            }
            case 23: {
                var3_2 /* !! */  = (int)fq$Snapshot.emex("emfv", emeu(int ), (int)23);
                if (!var4_1) ** GOTO lbl59
                throw null;
            }
lbl174:
            // 3 sources

            case 24: {
                var3_2 /* !! */  = (int)fq$Snapshot.emex("emfw", emeu(int ), (int)24);
                if (!var4_1) ** GOTO lbl73
                throw null;
            }
lbl178:
            // 3 sources

            case 25: {
                var3_2 /* !! */  = (int)fq$Snapshot.emex("emfx", emeu(int ), (int)25);
                if (!var4_1) ** GOTO lbl98
                throw null;
            }
lbl182:
            // 2 sources

            case 26: {
                var3_2 /* !! */  = (int)fq$Snapshot.emex("emfy", emeu(int ), (int)26);
                if (!var4_1) ** GOTO lbl174
                throw null;
            }
            case 27: {
                var3_2 /* !! */  = (int)fq$Snapshot.emex("emfz", emeu(int ), (int)27);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl263
            }
            case 28: {
                var3_2 /* !! */  = (int)fq$Snapshot.emex("emga", emeu(int ), (int)28);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl200
            }
lbl196:
            // 2 sources

            case 29: {
                var3_2 /* !! */  = (int)fq$Snapshot.emex("emgb", emeu(int ), (int)29);
                if (!var4_1) ** GOTO lbl83
                throw null;
            }
lbl200:
            // 2 sources

            case 30: {
                var3_2 /* !! */  = (int)fq$Snapshot.emex("emgc", emeu(int ), (int)30);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl255
            }
lbl205:
            // 2 sources

            case 31: {
                var3_2 /* !! */  = (int)fq$Snapshot.emex("emgd", emeu(int ), (int)31);
                if (!var4_1) ** GOTO lbl160
                throw null;
            }
lbl209:
            // 2 sources

            case 32: {
                var3_2 /* !! */  = (int)fq$Snapshot.emex("emge", emeu(int ), (int)32);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl227
            }
lbl214:
            // 2 sources

            case 33: {
                var3_2 /* !! */  = (int)fq$Snapshot.emex("emgf", emeu(int ), (int)33);
                if (!var4_1) ** GOTO lbl126
                throw null;
            }
lbl218:
            // 3 sources

            case 34: {
                var3_2 /* !! */  = (int)fq$Snapshot.emex("emgg", emeu(int ), (int)34);
                if (!var4_1) ** GOTO lbl88
                throw null;
            }
lbl222:
            // 2 sources

            case 35: {
                do {
                    var3_2 /* !! */  = (int)fq$Snapshot.emex("emgh", emeu(int ), (int)35);
                } while (!var4_1);
                throw null;
            }
lbl227:
            // 2 sources

            case 36: {
                var3_2 /* !! */  = (int)fq$Snapshot.emex("emgi", emeu(int ), (int)36);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl241
            }
            case 37: {
                var3_2 /* !! */  = (int)fq$Snapshot.emex("emgj", emeu(int ), (int)37);
                if (!var4_1) ** GOTO lbl174
                throw null;
            }
lbl236:
            // 3 sources

            case 38: {
                var3_2 /* !! */  = (int)fq$Snapshot.emex("emgk", emeu(int ), (int)38);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl271
            }
lbl241:
            // 4 sources

            case 39: {
                do {
                    var3_2 /* !! */  = (int)fq$Snapshot.emex("emgl", emeu(int ), (int)39);
                } while (!var4_1);
                throw null;
            }
            case 40: {
                var3_2 /* !! */  = (int)fq$Snapshot.emex("emgm", emeu(int ), (int)40);
                if (!var4_1) ** GOTO lbl241
                throw null;
            }
lbl250:
            // 2 sources

            case 41: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_2 /* !! */  = (int)fq$Snapshot.emex("emgn", emeu(int ), (int)41);
                    if (!var4_1) ** GOTO lbl93
                    throw null;
                }
            }
lbl255:
            // 2 sources

            case 42: {
                var3_2 /* !! */  = (int)fq$Snapshot.emex("emgo", emeu(int ), (int)42);
                if (!var4_1) ** GOTO lbl209
                throw null;
            }
lbl259:
            // 2 sources

            case 43: {
                var3_2 /* !! */  = (int)fq$Snapshot.emex("emgp", emeu(int ), (int)43);
                if (!var4_1) ** GOTO lbl214
                throw null;
            }
lbl263:
            // 2 sources

            case 44: {
                var3_2 /* !! */  = (int)fq$Snapshot.emex("emgq", emeu(int ), (int)44);
                if (!var4_1) ** GOTO lbl205
                throw null;
            }
lbl267:
            // 2 sources

            case 45: {
                var3_2 /* !! */  = (int)fq$Snapshot.emex("emgr", emeu(int ), (int)45);
                if (!var4_1) ** GOTO lbl182
                throw null;
            }
lbl271:
            // 2 sources

            case 46: {
                var3_2 /* !! */  = (int)fq$Snapshot.emex("emgs", emeu(int ), (int)46);
                if (!var4_1) ** GOTO lbl241
                throw null;
            }
            case 47: 
        }
        var3_2 /* !! */  = (int)fq$Snapshot.emex("emgt", emeu(int ), (int)47);
        ** while (!var4_1)
lbl278:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ int emeu(int n2) {
        return emev[n2] ^ emew[n2];
    }
}

