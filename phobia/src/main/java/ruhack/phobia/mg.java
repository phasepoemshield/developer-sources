/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2561
 *  net.minecraft.class_310
 *  net.minecraft.class_332
 *  net.minecraft.class_364
 *  net.minecraft.class_4185
 *  net.minecraft.class_4185$class_4241
 *  net.minecraft.class_437
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.List;
import net.minecraft.class_2561;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_364;
import net.minecraft.class_4185;
import net.minecraft.class_437;
import ruhack.phobia.eb;
import ruhack.phobia.ke;
import ruhack.phobia.ki;
import ruhack.phobia.kq;
import ruhack.phobia.kv;
import ruhack.phobia.nd;

public final class mg
extends class_437 {
    private static final float PANEL_WIDTH = 320.0f;
    private static final int PANEL_BG;
    private float animationProgress;
    private static final float PANEL_HEIGHT = 380.0f;
    private static int[] jkij;
    private long openedAt;
    private static final float PANEL_RADIUS = 12.0f;
    private final eb module;
    private static final int PANEL_BORDER;
    private static final int TEXT_COLOR;
    private static final int ACCENT_COLOR;
    public static final boolean c;
    private final class_437 parent;
    protected static final long rq = 7121416088352660256L;
    private static final int SUBTEXT_COLOR;
    public static final boolean a;
    private static long[] jklg;
    private static int[] jkik;
    public static final int b;
    private static long[] jklf;

    private static /* synthetic */ void jlcp() {
        mg.jkik[200] = 1016801129;
        mg.jkik[201] = -1995982256;
        mg.jkik[202] = -293819553;
        mg.jkik[203] = 307008131;
        mg.jkik[204] = 1031236659;
        mg.jkik[205] = -1154659162;
        mg.jkik[206] = -1188743812;
        mg.jkik[207] = -2079537287;
        mg.jkik[208] = -847266893;
        mg.jkik[209] = -370079469;
        mg.jkik[210] = -1823532751;
        mg.jkik[211] = -15236223;
        mg.jkik[212] = -732298498;
        mg.jkik[213] = -2061095625;
        mg.jkik[214] = 1695599056;
        mg.jkik[215] = -929066428;
        mg.jkik[216] = 1999647955;
        mg.jkik[217] = 900660926;
        mg.jkik[218] = -143480516;
        mg.jkik[219] = 975904651;
        mg.jkik[220] = -1211629654;
        mg.jkik[221] = -2104561900;
        mg.jkik[222] = -1716284752;
        mg.jkik[223] = -871456983;
        mg.jkik[224] = 1966935591;
        mg.jkik[225] = 307277725;
        mg.jkik[226] = 518032977;
        mg.jkik[227] = -118345258;
        mg.jkik[228] = -432799577;
        mg.jkik[229] = -1878052560;
        mg.jkik[230] = -1284525674;
        mg.jkik[231] = 287532042;
        mg.jkik[232] = -1603896456;
        mg.jkik[233] = -461266527;
        mg.jkik[234] = -1533543296;
        mg.jkik[235] = -34979456;
        mg.jkik[236] = 655935518;
        mg.jkik[237] = -63676637;
        mg.jkik[238] = -809940884;
        mg.jkik[239] = 299067301;
        mg.jkik[240] = -661568255;
        mg.jkik[241] = -813554338;
        mg.jkik[242] = 1876630249;
        mg.jkik[243] = 952095479;
        mg.jkik[244] = 1880530864;
        mg.jkik[245] = 85102872;
        mg.jkik[246] = 1658388014;
        mg.jkik[247] = 123606874;
        mg.jkik[248] = 1730828241;
        mg.jkik[249] = -999366771;
        mg.jkik[250] = 40013177;
        mg.jkik[251] = -1882561270;
        mg.jkik[252] = 405787497;
        mg.jkik[253] = 814354735;
        mg.jkik[254] = -1575995175;
        mg.jkik[255] = 1728529427;
        mg.jkik[256] = 728493313;
        mg.jkik[257] = -597151186;
        mg.jkik[258] = 300459535;
        mg.jkik[259] = -733769739;
        mg.jkik[260] = 1123130782;
        mg.jkik[261] = -99497360;
        mg.jkik[262] = 1321644031;
        mg.jkik[263] = -724602222;
        mg.jkik[264] = -1422584095;
        mg.jkik[265] = -953656036;
        mg.jkik[266] = -908951779;
        mg.jkik[267] = 1478676298;
        mg.jkik[268] = 941552302;
        mg.jkik[269] = -1255182172;
        mg.jkik[270] = 142445344;
        mg.jkik[271] = 1906422945;
        mg.jkik[272] = -285610501;
        mg.jkik[273] = 1829737221;
        mg.jkik[274] = -1076853771;
        mg.jkik[275] = 1359201311;
        mg.jkik[276] = 805371114;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private /* synthetic */ void lambda$init$2(String string, class_4185 class_41852) {
        boolean bl2;
        block36: {
            Object object = rq;
            boolean bl3 = true;
            block17: while (true) {
                CallSite callSite;
                if (!bl3 || (bl3 = false) || !true) {
                    object = callSite - mg.jkil("jksk", jkpm(int ), (int)41);
                }
                switch ((int)object) {
                    case -1811735776: {
                        break block17;
                    }
                    case -380563631: {
                        callSite = mg.jkil("jksl", jkpm(int ), (int)42);
                        continue block17;
                    }
                    case 829019629: {
                        callSite = mg.jkil("jksm", jkpm(int ), (int)43);
                        continue block17;
                    }
                    case 858860060: {
                        callSite = mg.jkil("jksn", jkpm(int ), (int)44);
                        continue block17;
                    }
                }
                break;
            }
            boolean bl4 = c;
            while (true) {
                long l2;
                Object object2;
                if ((object2 = (l2 = rq - mg.jkil("jkso", jkpm(int ), (int)45)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
                if (object2 == mg.jkil("jksp", jkii(int ), (int)212)) break;
                object2 = mg.jkil("jksq", jkii(int ), (int)213);
            }
            int n2 = b;
            while (true) {
                long l3;
                Object object3;
                if ((object3 = (l3 = rq - mg.jkil("jksr", jkpm(int ), (int)46)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
                if (object3 == mg.jkil("jkss", jkii(int ), (int)214)) {
                    bl2 = a;
                    if (bl4) {
                        throw null;
                    }
                    break;
                }
                object3 = mg.jkil("jkst", jkii(int ), (int)215);
            }
            if (bl2 || bl2) return;
            while (true) {
                long l4;
                Object object4;
                if ((object4 = (l4 = rq - mg.jkil("jksu", jkpm(int ), (int)47)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
                if (object4 == mg.jkil("jksv", jkii(int ), (int)216)) {
                    if (this.module != null) {
                        break;
                    }
                    break block36;
                }
                object4 = mg.jkil("jksw", jkii(int ), (int)217);
            }
            if (bl2 || bl2) return;
            Object object5 = rq;
            boolean bl5 = true;
            block21: while (true) {
                CallSite callSite;
                if (!bl5 || (bl5 = false) || !true) {
                    object5 = callSite - mg.jkil("jksx", jkpm(int ), (int)48);
                }
                switch ((int)object5) {
                    case -1811735776: {
                        break block21;
                    }
                    case -1716737771: {
                        callSite = mg.jkil("jksy", jkpm(int ), (int)49);
                        continue block21;
                    }
                    case -1566584500: {
                        callSite = mg.jkil("jksz", jkpm(int ), (int)50);
                        continue block21;
                    }
                }
                break;
            }
            Object object6 = rq;
            boolean bl6 = true;
            block22: while (true) {
                CallSite callSite;
                if (!bl6 || (bl6 = false) || !true) {
                    object6 = callSite - mg.jkil("jkta", jkpm(int ), (int)51);
                }
                switch ((int)object6) {
                    case -1811735776: {
                        break block22;
                    }
                    case -598865383: {
                        callSite = mg.jkil("jktb", jkpm(int ), (int)52);
                        continue block22;
                    }
                    case -567978747: {
                        callSite = mg.jkil("jktc", jkpm(int ), (int)53);
                        continue block22;
                    }
                    case -11237102: {
                        callSite = mg.jkil("jktd", jkpm(int ), (int)54);
                        continue block22;
                    }
                }
                break;
            }
            ke ke2 = this.module.interfaceSettings;
            if (bl2 || bl2) return;
            while (true) {
                long l5;
                Object object7;
                if ((object7 = (l5 = rq - mg.jkil("jkte", jkpm(int ), (int)55)) == 0L ? 0 : (l5 < 0L ? -1 : 1)) == false) continue;
                if (object7 == mg.jkil("jktf", jkii(int ), (int)218)) {
                    ke2.toggle(string);
                    if (bl2) return;
                    break;
                }
                object7 = mg.jkil("jktg", jkii(int ), (int)219);
            }
        }
        if (!bl2 && !bl2) return;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private /* synthetic */ void lambda$init$1(class_4185 var1_1) {
        v0 /* !! */  = mg.rq;
        if (true) ** GOTO lbl5
        block39: while (true) {
            v0 /* !! */  = (long)(v1 - mg.jkil("jkts", jkpm(int ), (int)56));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1811735776: {
                    break block39;
                }
                case -645416815: {
                    v1 = mg.jkil("jktt", jkpm(int ), (int)57);
                    continue block39;
                }
                case -305058440: {
                    v1 = mg.jkil("jktu", jkpm(int ), (int)58);
                    continue block39;
                }
            }
            break;
        }
        var4_2 = mg.c;
        v2 /* !! */  = mg.rq;
        if (true) ** GOTO lbl19
        block40: while (true) {
            v2 /* !! */  = (long)(v3 - mg.jkil("jktv", jkpm(int ), (int)59));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1811735776: {
                    break block40;
                }
                case -1333866896: {
                    v3 = mg.jkil("jktw", jkpm(int ), (int)60);
                    continue block40;
                }
                case -1049893187: {
                    v3 = mg.jkil("jktx", jkpm(int ), (int)61);
                    continue block40;
                }
            }
            break;
        }
        var3_3 /* !! */  = mg.b;
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_0 = mg.rq - mg.jkil("jkty", jkpm(int ), (int)62)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == mg.jkil("jktz", jkii(int ), (int)231)) break;
                    v4 /* !! */  = (long)mg.jkil("jkua", jkii(int ), (int)232);
                }
                var2_4 = mg.a;
                if (var4_2) {
                    throw null;
lbl41:
                    // 4 sources

                    return;
                }
                if (var2_4 || var2_4) ** GOTO lbl41
                v5 /* !! */  = mg.rq;
                if (true) ** GOTO lbl48
                block43: while (true) {
                    v5 /* !! */  = (long)(v6 - mg.jkil("jkub", jkpm(int ), (int)63));
lbl48:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1811735776: {
                            break block43;
                        }
                        case -645167749: {
                            v6 = mg.jkil("jkuc", jkpm(int ), (int)64);
                            continue block43;
                        }
                        case 405449074: {
                            v6 = mg.jkil("jkud", jkpm(int ), (int)65);
                            continue block43;
                        }
                        case 1539295215: {
                            v6 = mg.jkil("jkue", jkpm(int ), (int)66);
                            continue block43;
                        }
                    }
                    break;
                }
                if (this.module == null) ** GOTO lbl96
                if (var2_4) ** GOTO lbl41
                v7 /* !! */  = mg.rq;
                if (true) ** GOTO lbl66
                block44: while (true) {
                    v7 /* !! */  = (long)(v8 - mg.jkil("jkuf", jkpm(int ), (int)67));
lbl66:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -1811735776: {
                            break block44;
                        }
                        case -1590615648: {
                            v8 = mg.jkil("jkug", jkpm(int ), (int)68);
                            continue block44;
                        }
                        case 661207564: {
                            v8 = mg.jkil("jkuh", jkpm(int ), (int)69);
                            continue block44;
                        }
                    }
                    break;
                }
                v9 /* !! */  = mg.rq;
                if (true) ** GOTO lbl79
                block45: while (true) {
                    v9 /* !! */  = (long)(mg.jkil("jkuj", jkpm(int ), (int)71) - mg.jkil("jkui", jkpm(int ), (int)70));
lbl79:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -1811735776: {
                            break block45;
                        }
                        case 132232446: {
                            continue block45;
                        }
                    }
                    break;
                }
                v10 = this.module.backgroundStyle;
                v11 /* !! */  = mg.rq;
                if (true) ** GOTO lbl89
                block46: while (true) {
                    v11 /* !! */  = (long)(mg.jkil("jkul", jkpm(int ), (int)73) - mg.jkil("jkuk", jkpm(int ), (int)72));
lbl89:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -1811735776: {
                            break block46;
                        }
                        case 1733970754: {
                            continue block46;
                        }
                    }
                    break;
                }
                v10.setValue("\u0421\u0442\u0430\u0440\u044b\u0439");
                if (var2_4) ** GOTO lbl41
lbl96:
                // 2 sources

                if (!var2_4 && !var2_4) ** break;
                ** continue;
                return;
            }
            case 0: {
                var3_3 /* !! */  = (int)mg.jkil("jkum", jkii(int ), (int)233);
                if (var4_2) {
                    throw null;
                }
            }
            case 1: {
                var3_3 /* !! */  = (int)mg.jkil("jkun", jkii(int ), (int)234);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl117
            }
lbl108:
            // 2 sources

            case 2: {
                var3_3 /* !! */  = (int)mg.jkil("jkuo", jkii(int ), (int)235);
                if (!var4_2) break;
                throw null;
            }
lbl112:
            // 3 sources

            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)mg.jkil("jkup", jkii(int ), (int)236);
                    if (!var4_2) ** GOTO lbl108
                    throw null;
                }
            }
lbl117:
            // 3 sources

            case 4: {
                var3_3 /* !! */  = (int)mg.jkil("jkuq", jkii(int ), (int)237);
                if (!var4_2) ** GOTO lbl112
                throw null;
            }
            case 5: {
                var3_3 /* !! */  = (int)mg.jkil("jkur", jkii(int ), (int)238);
                if (!var4_2) ** GOTO lbl112
                throw null;
            }
            case 6: {
                var3_3 /* !! */  = (int)mg.jkil("jkus", jkii(int ), (int)239);
                if (!var4_2) ** GOTO lbl117
                throw null;
            }
            case 7: 
        }
        var3_3 /* !! */  = (int)mg.jkil("jkut", jkii(int ), (int)240);
        ** while (!var4_2)
lbl132:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void jlcj() {
        mg.jkik[0] = -1940003201;
        mg.jkik[1] = -167156510;
        mg.jkik[2] = -1967770166;
        mg.jkik[3] = -473029246;
        mg.jkik[4] = -840468391;
        mg.jkik[5] = 71703060;
        mg.jkik[6] = 1887427298;
        mg.jkik[7] = 478535194;
        mg.jkik[8] = -290360106;
        mg.jkik[9] = -1963372653;
        mg.jkik[10] = -1324578820;
        mg.jkik[11] = -640626822;
        mg.jkik[12] = 149653271;
        mg.jkik[13] = 955379929;
        mg.jkik[14] = -1989131557;
        mg.jkik[15] = -696133623;
        mg.jkik[16] = 661201355;
        mg.jkik[17] = 196790278;
        mg.jkik[18] = 1974431407;
        mg.jkik[19] = 1774490126;
        mg.jkik[20] = -873307453;
        mg.jkik[21] = 1358060512;
        mg.jkik[22] = -665850930;
        mg.jkik[23] = -1806464174;
        mg.jkik[24] = -930669627;
        mg.jkik[25] = 1563699738;
        mg.jkik[26] = 347078307;
        mg.jkik[27] = -873999613;
        mg.jkik[28] = -1651960673;
        mg.jkik[29] = -572210727;
        mg.jkik[30] = -1401933338;
        mg.jkik[31] = 1115226586;
        mg.jkik[32] = 276814463;
        mg.jkik[33] = -263814541;
        mg.jkik[34] = -1956861939;
        mg.jkik[35] = -2035081088;
        mg.jkik[36] = -2022068095;
        mg.jkik[37] = 1112867449;
        mg.jkik[38] = -1827303422;
        mg.jkik[39] = 24776749;
        mg.jkik[40] = 959608202;
        mg.jkik[41] = 1027695351;
        mg.jkik[42] = 528331029;
        mg.jkik[43] = 1202215314;
        mg.jkik[44] = -614296749;
        mg.jkik[45] = -431353094;
        mg.jkik[46] = 1374765619;
        mg.jkik[47] = -508459528;
        mg.jkik[48] = -467318072;
        mg.jkik[49] = -716388527;
        mg.jkik[50] = -1833533352;
        mg.jkik[51] = -626104663;
        mg.jkik[52] = 42398098;
        mg.jkik[53] = 1897507480;
        mg.jkik[54] = -1187203006;
        mg.jkik[55] = -1881411954;
        mg.jkik[56] = 1245770994;
        mg.jkik[57] = -327480974;
        mg.jkik[58] = 1943385958;
        mg.jkik[59] = 788234777;
        mg.jkik[60] = -390941232;
        mg.jkik[61] = 609550101;
        mg.jkik[62] = -773793753;
        mg.jkik[63] = -1886527131;
        mg.jkik[64] = -1568435693;
        mg.jkik[65] = 594863626;
        mg.jkik[66] = -1356980923;
        mg.jkik[67] = 1993347226;
        mg.jkik[68] = -213143757;
        mg.jkik[69] = 1660150422;
        mg.jkik[70] = 1751538187;
        mg.jkik[71] = -2081320685;
        mg.jkik[72] = -707634964;
        mg.jkik[73] = 360974793;
        mg.jkik[74] = -1091956749;
        mg.jkik[75] = -410449597;
        mg.jkik[76] = -1206764697;
        mg.jkik[77] = -914500768;
        mg.jkik[78] = -940604146;
        mg.jkik[79] = 393009735;
        mg.jkik[80] = -1802667063;
        mg.jkik[81] = 1034481829;
        mg.jkik[82] = 252853216;
        mg.jkik[83] = 1789338507;
        mg.jkik[84] = 1793937467;
        mg.jkik[85] = 290976421;
        mg.jkik[86] = 2057994786;
        mg.jkik[87] = 1003315621;
        mg.jkik[88] = 1999789116;
        mg.jkik[89] = -683516910;
        mg.jkik[90] = 1961486041;
        mg.jkik[91] = 782544093;
        mg.jkik[92] = -2105678120;
        mg.jkik[93] = 1372810603;
        mg.jkik[94] = -838828636;
        mg.jkik[95] = -571679760;
        mg.jkik[96] = 1752940570;
        mg.jkik[97] = -2074669223;
        mg.jkik[98] = 855802710;
        mg.jkik[99] = -579563759;
    }

    private static /* synthetic */ void jlby() {
        mg.jkij[0] = -1940003201;
        mg.jkij[1] = -167156505;
        mg.jkij[2] = -1967770162;
        mg.jkij[3] = -473029241;
        mg.jkij[4] = -840468389;
        mg.jkij[5] = 71703056;
        mg.jkij[6] = 1887427296;
        mg.jkij[7] = 478535192;
        mg.jkij[8] = -290360202;
        mg.jkij[9] = -1963372755;
        mg.jkij[10] = -1324578840;
        mg.jkij[11] = -640626942;
        mg.jkij[12] = 149653359;
        mg.jkij[13] = 955379905;
        mg.jkij[14] = -1989131653;
        mg.jkij[15] = -696133519;
        mg.jkij[16] = 661201331;
        mg.jkij[17] = 196790302;
        mg.jkij[18] = 1974431254;
        mg.jkij[19] = 1774490138;
        mg.jkij[20] = -873307193;
        mg.jkij[21] = 1358060534;
        mg.jkij[22] = -665850918;
        mg.jkij[23] = -1806464466;
        mg.jkij[24] = -930669577;
        mg.jkij[25] = 1563699998;
        mg.jkij[26] = 347078335;
        mg.jkij[27] = -873999602;
        mg.jkij[28] = -1651960701;
        mg.jkij[29] = -572210725;
        mg.jkij[30] = -1401933318;
        mg.jkij[31] = 1115226588;
        mg.jkij[32] = 276814430;
        mg.jkij[33] = -263814549;
        mg.jkij[34] = -1956861923;
        mg.jkij[35] = -2035081074;
        mg.jkij[36] = -2022068062;
        mg.jkij[37] = 1112867454;
        mg.jkij[38] = -1827303399;
        mg.jkij[39] = 24776745;
        mg.jkij[40] = 959608200;
        mg.jkij[41] = 1027695349;
        mg.jkij[42] = 528331036;
        mg.jkij[43] = 1202215296;
        mg.jkij[44] = -614296749;
        mg.jkij[45] = -431353097;
        mg.jkij[46] = 1374765613;
        mg.jkij[47] = -508459535;
        mg.jkij[48] = -467318048;
        mg.jkij[49] = -716388526;
        mg.jkij[50] = -1833533346;
        mg.jkij[51] = -626104653;
        mg.jkij[52] = 42398091;
        mg.jkij[53] = 1897507461;
        mg.jkij[54] = -1187202993;
        mg.jkij[55] = -1881411959;
        mg.jkij[56] = 1245770993;
        mg.jkij[57] = -327480991;
        mg.jkij[58] = 1943385923;
        mg.jkij[59] = 788234775;
        mg.jkij[60] = -390941246;
        mg.jkij[61] = 609550081;
        mg.jkij[62] = -773793756;
        mg.jkij[63] = -1886527105;
        mg.jkij[64] = -1568435699;
        mg.jkij[65] = 594863660;
        mg.jkij[66] = -1356980921;
        mg.jkij[67] = 1993347200;
        mg.jkij[68] = -1099623661;
        mg.jkij[69] = 566747798;
        mg.jkij[70] = 1751538187;
        mg.jkij[71] = -2081320685;
        mg.jkij[72] = -707634964;
        mg.jkij[73] = 360974793;
        mg.jkij[74] = -1091956749;
        mg.jkij[75] = -410449599;
        mg.jkij[76] = -1206764699;
        mg.jkij[77] = -914500672;
        mg.jkij[78] = -940603984;
        mg.jkij[79] = 673191562;
        mg.jkij[80] = -1430145276;
        mg.jkij[81] = 2114515109;
        mg.jkij[82] = 1286355936;
        mg.jkij[83] = 1789338505;
        mg.jkij[84] = 1793937465;
        mg.jkij[85] = 762586543;
        mg.jkij[86] = 1005224482;
        mg.jkij[87] = 1003315621;
        mg.jkij[88] = 913464380;
        mg.jkij[89] = -683516910;
        mg.jkij[90] = 1273620185;
        mg.jkij[91] = 782544073;
        mg.jkij[92] = -2105678132;
        mg.jkij[93] = 272854379;
        mg.jkij[94] = -838828636;
        mg.jkij[95] = -571679772;
        mg.jkij[96] = 1752940584;
        mg.jkij[97] = -986247335;
        mg.jkij[98] = 855802710;
        mg.jkij[99] = -579563771;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public boolean method_25421() {
        Object object = rq;
        boolean bl2 = true;
        block17: while (true) {
            CallSite callSite;
            if (!bl2 || (bl2 = false) || !true) {
                object = callSite - mg.jkil("jkqz", jkpm(int ), (int)18);
            }
            switch ((int)object) {
                case -1811735776: {
                    break block17;
                }
                case -1264376470: {
                    callSite = mg.jkil("jkra", jkpm(int ), (int)19);
                    continue block17;
                }
                case 1392977629: {
                    callSite = mg.jkil("jkrb", jkpm(int ), (int)20);
                    continue block17;
                }
                case 2076505293: {
                    callSite = mg.jkil("jkrc", jkpm(int ), (int)21);
                    continue block17;
                }
            }
            break;
        }
        boolean bl3 = c;
        Object object2 = rq;
        boolean bl4 = true;
        block18: while (true) {
            CallSite callSite;
            if (!bl4 || (bl4 = false) || !true) {
                object2 = callSite - mg.jkil("jkrd", jkpm(int ), (int)22);
            }
            switch ((int)object2) {
                case -2077163858: {
                    callSite = mg.jkil("jkre", jkpm(int ), (int)23);
                    continue block18;
                }
                case -1811735776: {
                    break block18;
                }
                case 1863777945: {
                    callSite = mg.jkil("jkrf", jkpm(int ), (int)24);
                    continue block18;
                }
            }
            break;
        }
        int n2 = b;
        Object object3 = rq;
        boolean bl5 = true;
        block19: while (true) {
            CallSite callSite;
            if (!bl5 || (bl5 = false) || !true) {
                object3 = callSite - mg.jkil("jkrg", jkpm(int ), (int)25);
            }
            switch ((int)object3) {
                case -1811735776: {
                    break block19;
                }
                case -468935292: {
                    callSite = mg.jkil("jkrh", jkpm(int ), (int)26);
                    continue block19;
                }
                case -171212799: {
                    callSite = mg.jkil("jkri", jkpm(int ), (int)27);
                    continue block19;
                }
                case 1248223019: {
                    callSite = mg.jkil("jkrj", jkpm(int ), (int)28);
                    continue block19;
                }
            }
            break;
        }
        boolean bl6 = a;
        if (bl3) {
            throw null;
        }
        if (bl6 || bl6) {
            return (boolean)mg.jkil("jkrk", jkii(int ), (int)198);
        }
        return (boolean)mg.jkil("jkrl", jkii(int ), (int)199);
    }

    private static /* synthetic */ void jlcc() {
        mg.jkij[100] = -1686074891;
        mg.jkij[101] = 108035932;
        mg.jkij[102] = 1621833668;
        mg.jkij[103] = 238315300;
        mg.jkij[104] = 1383552955;
        mg.jkij[105] = 557621926;
        mg.jkij[106] = -846004001;
        mg.jkij[107] = 1766845822;
        mg.jkij[108] = -1376462628;
        mg.jkij[109] = 1912349550;
        mg.jkij[110] = 1648110364;
        mg.jkij[111] = -138481891;
        mg.jkij[112] = -462060112;
        mg.jkij[113] = 1698675641;
        mg.jkij[114] = -2017797422;
        mg.jkij[115] = -11906687;
        mg.jkij[116] = 2083486414;
        mg.jkij[117] = 271799257;
        mg.jkij[118] = -990772558;
        mg.jkij[119] = 515088847;
        mg.jkij[120] = -902299966;
        mg.jkij[121] = 923456881;
        mg.jkij[122] = -945261181;
        mg.jkij[123] = 1116661448;
        mg.jkij[124] = -1773673940;
        mg.jkij[125] = 2099108555;
        mg.jkij[126] = -547986984;
        mg.jkij[127] = -288721852;
        mg.jkij[128] = -1888932048;
        mg.jkij[129] = 1970117126;
        mg.jkij[130] = -54734889;
        mg.jkij[131] = 911788247;
        mg.jkij[132] = -1819550540;
        mg.jkij[133] = -1955416926;
        mg.jkij[134] = 1885206532;
        mg.jkij[135] = 254588598;
        mg.jkij[136] = 27686764;
        mg.jkij[137] = -1733899608;
        mg.jkij[138] = 738622927;
        mg.jkij[139] = 754474317;
        mg.jkij[140] = -287115213;
        mg.jkij[141] = 1947729041;
        mg.jkij[142] = -704320757;
        mg.jkij[143] = -1524385675;
        mg.jkij[144] = 581383853;
        mg.jkij[145] = -846022952;
        mg.jkij[146] = -1196557633;
        mg.jkij[147] = -898120859;
        mg.jkij[148] = -431246470;
        mg.jkij[149] = 131100996;
        mg.jkij[150] = -1952347544;
        mg.jkij[151] = -1421378084;
        mg.jkij[152] = -1555389230;
        mg.jkij[153] = 987776716;
        mg.jkij[154] = 1462584370;
        mg.jkij[155] = -1448063731;
        mg.jkij[156] = -656637390;
        mg.jkij[157] = -337083635;
        mg.jkij[158] = -1301850516;
        mg.jkij[159] = -954235943;
        mg.jkij[160] = 1872133404;
        mg.jkij[161] = -1750166793;
        mg.jkij[162] = 1533856687;
        mg.jkij[163] = 2061700983;
        mg.jkij[164] = -504193398;
        mg.jkij[165] = -867896263;
        mg.jkij[166] = 2077513838;
        mg.jkij[167] = -1821928257;
        mg.jkij[168] = 183531898;
        mg.jkij[169] = 34933869;
        mg.jkij[170] = -1155550350;
        mg.jkij[171] = -2094630171;
        mg.jkij[172] = -612848715;
        mg.jkij[173] = -1753937165;
        mg.jkij[174] = -889010296;
        mg.jkij[175] = 694856630;
        mg.jkij[176] = 1528601470;
        mg.jkij[177] = 1036840092;
        mg.jkij[178] = 1162438013;
        mg.jkij[179] = 364372659;
        mg.jkij[180] = 214953618;
        mg.jkij[181] = -1914769160;
        mg.jkij[182] = 449447238;
        mg.jkij[183] = 1804167138;
        mg.jkij[184] = -1071942113;
        mg.jkij[185] = 786346287;
        mg.jkij[186] = -672492259;
        mg.jkij[187] = -1636066561;
        mg.jkij[188] = 1982494694;
        mg.jkij[189] = -1972360138;
        mg.jkij[190] = 500909216;
        mg.jkij[191] = -1821227157;
        mg.jkij[192] = 548704357;
        mg.jkij[193] = 1450383700;
        mg.jkij[194] = 353585035;
        mg.jkij[195] = -1406824772;
        mg.jkij[196] = 807080672;
        mg.jkij[197] = 2123932998;
        mg.jkij[198] = -1229555335;
        mg.jkij[199] = -1172422185;
    }

    private static /* synthetic */ long jkpm(int n2) {
        return jklf[n2] ^ jklg[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    protected void method_25426() {
        var12_1 = mg.c;
        var11_2 /* !! */  = mg.b;
        var10_3 = mg.a;
        if (var12_1) {
            throw null;
lbl6:
            // 21 sources

            return;
        }
        if (var10_3 || var10_3) ** GOTO lbl6
        this.openedAt = System.nanoTime();
        if (var10_3 || var10_3) ** GOTO lbl6
        this.animationProgress = 0.0f;
        if (var10_3 || var10_3) ** GOTO lbl6
        var1_4 = ki.getFixedScaledWidth() / mg.jkil("jkis", jkii(int ), (int)6);
        if (var10_3 || var10_3) ** GOTO lbl6
        var2_5 = ki.getFixedScaledHeight() / mg.jkil("jkit", jkii(int ), (int)7);
        if (var10_3 || var10_3) ** GOTO lbl6
        var3_6 = var1_4 - mg.jkil("jkiu", jkii(int ), (int)8);
        if (var10_3 || var10_3) ** GOTO lbl6
        var4_7 = var2_5 - mg.jkil("jkiv", jkii(int ), (int)9);
        if (var10_3 || var10_3) ** GOTO lbl6
        this.method_37063((class_364)class_4185.method_46430((class_2561)class_2561.method_43470((String)"\u0424\u043e\u043d: \u041d\u043e\u0432\u044b\u0439"), (class_4185.class_4241)(class_4185.class_4241)LambdaMetafactory.metafactory(null, null, null, (Lnet/minecraft/class_4185;)V, lambda$init$0(net.minecraft.class_4185 ), (Lnet/minecraft/class_4185;)V)((mg)this)).method_46434(var3_6 + mg.jkil("jkiw", jkii(int ), (int)10), var4_7 + mg.jkil("jkix", jkii(int ), (int)11), (int)mg.jkil("jkiy", jkii(int ), (int)12), (int)mg.jkil("jkiz", jkii(int ), (int)13)).method_46431());
        if (var10_3 || var10_3) ** GOTO lbl6
        this.method_37063((class_364)class_4185.method_46430((class_2561)class_2561.method_43470((String)"\u0424\u043e\u043d: \u0421\u0442\u0430\u0440\u044b\u0439"), (class_4185.class_4241)(class_4185.class_4241)LambdaMetafactory.metafactory(null, null, null, (Lnet/minecraft/class_4185;)V, lambda$init$1(net.minecraft.class_4185 ), (Lnet/minecraft/class_4185;)V)((mg)this)).method_46434(var3_6 + mg.jkil("jkja", jkii(int ), (int)14), var4_7 + mg.jkil("jkjb", jkii(int ), (int)15), (int)mg.jkil("jkjc", jkii(int ), (int)16), (int)mg.jkil("jkjd", jkii(int ), (int)17)).method_46431());
        if (var10_3 || var10_3) ** GOTO lbl6
        var5_8 = List.of("Watermark", "Info", "Notifications", "Keybinds", "Effects", "ArmorHud", "Cooldowns", "Music Player", "TargetHUD");
        if (var10_3 || var10_3) ** GOTO lbl6
        var6_9 = mg.jkil("jkje", jkii(int ), (int)18);
        if (var10_3 || var10_3) ** GOTO lbl6
        var7_10 = var5_8.iterator();
        if (var10_3) ** GOTO lbl6
        block44: while (true) {
            if (var10_3) ** GOTO lbl6
            if (var11_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var11_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var10_3) ** GOTO lbl6
                    if (!var7_10.hasNext()) ** GOTO lbl52
                    if (var10_3) ** GOTO lbl6
                    var8_11 = var7_10.next();
                    if (var10_3 || var10_3) ** GOTO lbl6
                    var9_12 = var8_11;
                    if (var10_3 || var10_3) ** GOTO lbl6
                    this.method_37063((class_364)class_4185.method_46430((class_2561)class_2561.method_43470((String)var8_11), (class_4185.class_4241)(class_4185.class_4241)LambdaMetafactory.metafactory(null, null, null, (Lnet/minecraft/class_4185;)V, lambda$init$2(java.lang.String net.minecraft.class_4185 ), (Lnet/minecraft/class_4185;)V)((mg)this, (String)var9_12)).method_46434(var3_6 + mg.jkil("jkjf", jkii(int ), (int)19), var4_7 + var6_9, (int)mg.jkil("jkjg", jkii(int ), (int)20), (int)mg.jkil("jkjh", jkii(int ), (int)21)).method_46431());
                    if (var10_3 || var10_3) ** GOTO lbl6
                    var6_9 += 26;
                    if (var10_3 || var10_3) ** GOTO lbl6
                    if (!var12_1) continue block44;
                    throw null;
lbl52:
                    // 1 sources

                    if (var10_3 || var10_3) ** GOTO lbl6
                    this.method_37063((class_364)class_4185.method_46430((class_2561)class_2561.method_43470((String)"\u0417\u0430\u043a\u0440\u044b\u0442\u044c"), (class_4185.class_4241)(class_4185.class_4241)LambdaMetafactory.metafactory(null, null, null, (Lnet/minecraft/class_4185;)V, lambda$init$3(net.minecraft.class_4185 ), (Lnet/minecraft/class_4185;)V)((mg)this)).method_46434(var3_6 + mg.jkil("jkji", jkii(int ), (int)22), var4_7 + mg.jkil("jkjj", jkii(int ), (int)23) - mg.jkil("jkjk", jkii(int ), (int)24), (int)mg.jkil("jkjl", jkii(int ), (int)25), (int)mg.jkil("jkjm", jkii(int ), (int)26)).method_46431());
                    if (!var10_3 && !var10_3) ** break;
                    ** continue;
                    return;
                }
lbl58:
                // 2 sources

                case 0: {
                    var11_2 /* !! */  = (int)mg.jkil("jkjn", jkii(int ), (int)27);
                    if (var12_1) {
                        throw null;
                    }
                    ** GOTO lbl147
                }
lbl63:
                // 3 sources

                case 1: {
                    var11_2 /* !! */  = (int)mg.jkil("jkjo", jkii(int ), (int)28);
                    if (var12_1) {
                        throw null;
                    }
                    ** GOTO lbl120
                }
                case 2: {
                    var11_2 /* !! */  = (int)mg.jkil("jkjp", jkii(int ), (int)29);
                    if (var12_1) {
                        throw null;
                    }
                    ** GOTO lbl129
                }
lbl73:
                // 3 sources

                case 3: {
                    var11_2 /* !! */  = (int)mg.jkil("jkjq", jkii(int ), (int)30);
                    if (var12_1) {
                        throw null;
                    }
                    ** GOTO lbl196
                }
                case 4: {
                    var11_2 /* !! */  = (int)mg.jkil("jkjr", jkii(int ), (int)31);
                    if (!var12_1) ** GOTO lbl58
                    throw null;
                }
                case 5: {
                    var11_2 /* !! */  = (int)mg.jkil("jkjs", jkii(int ), (int)32);
                    if (var12_1) {
                        throw null;
                    }
                    ** GOTO lbl100
                }
lbl87:
                // 2 sources

                case 6: {
                    var11_2 /* !! */  = (int)mg.jkil("jkjt", jkii(int ), (int)33);
                    if (var12_1) {
                        throw null;
                    }
                    ** GOTO lbl124
                }
lbl92:
                // 2 sources

                case 7: {
                    var11_2 /* !! */  = (int)mg.jkil("jkju", jkii(int ), (int)34);
                    if (!var12_1) break block44;
                    throw null;
                }
                case 8: {
                    var11_2 /* !! */  = (int)mg.jkil("jkjv", jkii(int ), (int)35);
                    if (!var12_1) ** GOTO lbl87
                    throw null;
                }
lbl100:
                // 3 sources

                case 9: {
                    var11_2 /* !! */  = (int)mg.jkil("jkjw", jkii(int ), (int)36);
                    if (var12_1) {
                        throw null;
                    }
                    ** GOTO lbl187
                }
lbl105:
                // 3 sources

                case 10: {
                    var11_2 /* !! */  = (int)mg.jkil("jkjx", jkii(int ), (int)37);
                    if (var12_1) {
                        throw null;
                    }
                    ** GOTO lbl166
                }
lbl110:
                // 2 sources

                case 11: {
                    var11_2 /* !! */  = (int)mg.jkil("jkjy", jkii(int ), (int)38);
                    if (var12_1) {
                        throw null;
                    }
                    ** GOTO lbl229
                }
lbl115:
                // 4 sources

                case 12: {
                    var11_2 /* !! */  = (int)mg.jkil("jkjz", jkii(int ), (int)39);
                    if (var12_1) {
                        throw null;
                    }
                    ** GOTO lbl156
                }
lbl120:
                // 2 sources

                case 13: {
                    var11_2 /* !! */  = (int)mg.jkil("jkka", jkii(int ), (int)40);
                    if (!var12_1) ** GOTO lbl73
                    throw null;
                }
lbl124:
                // 3 sources

                case 14: {
                    var11_2 /* !! */  = (int)mg.jkil("jkkb", jkii(int ), (int)41);
                    if (var12_1) {
                        throw null;
                    }
                    ** GOTO lbl161
                }
lbl129:
                // 2 sources

                case 15: {
                    var11_2 /* !! */  = (int)mg.jkil("jkkc", jkii(int ), (int)42);
                    if (var12_1) {
                        throw null;
                    }
                    ** GOTO lbl138
                }
                case 16: {
                    var11_2 /* !! */  = (int)mg.jkil("jkkd", jkii(int ), (int)43);
                    if (!var12_1) ** GOTO lbl115
                    throw null;
                }
lbl138:
                // 2 sources

                case 17: {
                    var11_2 /* !! */  = (int)mg.jkil("jkke", jkii(int ), (int)44);
                    if (!var12_1) break block44;
                    throw null;
                }
                case 18: {
                    var11_2 /* !! */  = (int)mg.jkil("jkkf", jkii(int ), (int)45);
                    if (var12_1) {
                        throw null;
                    }
                    ** GOTO lbl152
                }
lbl147:
                // 2 sources

                case 19: {
                    var11_2 /* !! */  = (int)mg.jkil("jkkg", jkii(int ), (int)46);
                    if (var12_1) {
                        throw null;
                    }
                    ** GOTO lbl179
                }
lbl152:
                // 2 sources

                case 20: {
                    var11_2 /* !! */  = (int)mg.jkil("jkkh", jkii(int ), (int)47);
                    if (!var12_1) ** GOTO lbl115
                    throw null;
                }
lbl156:
                // 2 sources

                case 21: {
                    var11_2 /* !! */  = (int)mg.jkil("jkki", jkii(int ), (int)48);
                    if (var12_1) {
                        throw null;
                    }
                    ** GOTO lbl212
                }
lbl161:
                // 2 sources

                case 22: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var11_2 /* !! */  = (int)mg.jkil("jkkj", jkii(int ), (int)49);
                        if (!var12_1) ** GOTO lbl63
                        throw null;
                    }
                }
lbl166:
                // 2 sources

                case 23: {
                    var11_2 /* !! */  = (int)mg.jkil("jkkk", jkii(int ), (int)50);
                    if (!var12_1) ** GOTO lbl63
                    throw null;
                }
                case 24: {
                    var11_2 /* !! */  = (int)mg.jkil("jkkl", jkii(int ), (int)51);
                    if (var12_1) {
                        throw null;
                    }
                    ** GOTO lbl183
                }
                case 25: {
                    var11_2 /* !! */  = (int)mg.jkil("jkkm", jkii(int ), (int)52);
                    if (!var12_1) ** GOTO lbl105
                    throw null;
                }
lbl179:
                // 2 sources

                case 26: {
                    var11_2 /* !! */  = (int)mg.jkil("jkkn", jkii(int ), (int)53);
                    if (!var12_1) ** GOTO lbl100
                    throw null;
                }
lbl183:
                // 2 sources

                case 27: {
                    var11_2 /* !! */  = (int)mg.jkil("jkko", jkii(int ), (int)54);
                    if (!var12_1) break block44;
                    throw null;
                }
lbl187:
                // 2 sources

                case 28: {
                    var11_2 /* !! */  = (int)mg.jkil("jkkp", jkii(int ), (int)55);
                    if (!var12_1) break block44;
                    throw null;
                }
                case 29: {
                    var11_2 /* !! */  = (int)mg.jkil("jkkq", jkii(int ), (int)56);
                    if (var12_1) {
                        throw null;
                    }
                    ** GOTO lbl229
                }
lbl196:
                // 2 sources

                case 30: {
                    var11_2 /* !! */  = (int)mg.jkil("jkkr", jkii(int ), (int)57);
                    if (!var12_1) ** GOTO lbl110
                    throw null;
                }
                case 31: {
                    var11_2 /* !! */  = (int)mg.jkil("jkks", jkii(int ), (int)58);
                    if (!var12_1) ** GOTO lbl105
                    throw null;
                }
                case 32: {
                    var11_2 /* !! */  = (int)mg.jkil("jkkt", jkii(int ), (int)59);
                    if (var12_1) {
                        throw null;
                    }
                }
                case 33: {
                    var11_2 /* !! */  = (int)mg.jkil("jkku", jkii(int ), (int)60);
                    if (!var12_1) ** GOTO lbl73
                    throw null;
                }
lbl212:
                // 2 sources

                case 34: {
                    do {
                        var11_2 /* !! */  = (int)mg.jkil("jkkv", jkii(int ), (int)61);
                    } while (!var12_1);
                    throw null;
                }
lbl217:
                // 2 sources

                case 35: {
                    var11_2 /* !! */  = (int)mg.jkil("jkkw", jkii(int ), (int)62);
                    if (!var12_1) break block44;
                    throw null;
                }
                case 36: {
                    var11_2 /* !! */  = (int)mg.jkil("jkkx", jkii(int ), (int)63);
                    if (!var12_1) ** GOTO lbl217
                    throw null;
                }
                case 37: {
                    var11_2 /* !! */  = (int)mg.jkil("jkky", jkii(int ), (int)64);
                    if (!var12_1) ** GOTO lbl124
                    throw null;
                }
lbl229:
                // 3 sources

                case 38: {
                    var11_2 /* !! */  = (int)mg.jkil("jkkz", jkii(int ), (int)65);
                    if (!var12_1) ** GOTO lbl92
                    throw null;
                }
                case 39: {
                    var11_2 /* !! */  = (int)mg.jkil("jkla", jkii(int ), (int)66);
                    if (!var12_1) ** GOTO lbl115
                    throw null;
                }
                case 40: 
            }
            break;
        }
        var11_2 /* !! */  = (int)mg.jkil("jklb", jkii(int ), (int)67);
        ** while (!var12_1)
lbl240:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void jlct() {
        mg.jklf[0] = 2011016891771064467L;
        mg.jklf[1] = 838797183761357039L;
        mg.jklf[2] = 1488536257021542723L;
        mg.jklf[3] = 2912933078900691491L;
        mg.jklf[4] = -7162533263510046032L;
        mg.jklf[5] = 2984591711113725185L;
        mg.jklf[6] = -4224734364398816599L;
        mg.jklf[7] = 3131970547648258969L;
        mg.jklf[8] = -1976419055271494373L;
        mg.jklf[9] = -1507904649890654546L;
        mg.jklf[10] = -8868700479742169805L;
        mg.jklf[11] = -1996760439126459412L;
        mg.jklf[12] = -5499675688610725850L;
        mg.jklf[13] = -6704764463941319829L;
        mg.jklf[14] = -6646548691996336211L;
        mg.jklf[15] = 1688201951830515597L;
        mg.jklf[16] = 2316244432180422437L;
        mg.jklf[17] = -5514399253250489777L;
        mg.jklf[18] = 7217762056278247295L;
        mg.jklf[19] = -7945804488535890801L;
        mg.jklf[20] = 2358884299994220987L;
        mg.jklf[21] = -1781320157879020310L;
        mg.jklf[22] = 8445444087539470618L;
        mg.jklf[23] = -6390916159183974632L;
        mg.jklf[24] = -6771857596322818406L;
        mg.jklf[25] = 6912356969581472126L;
        mg.jklf[26] = 195331617930694046L;
        mg.jklf[27] = 594888298941556610L;
        mg.jklf[28] = -4648062669693136863L;
        mg.jklf[29] = -6455261291796942940L;
        mg.jklf[30] = -3917809944674738946L;
        mg.jklf[31] = -1106661695053020473L;
        mg.jklf[32] = 6713807473810849304L;
        mg.jklf[33] = 5249076371980426116L;
        mg.jklf[34] = 4943230049183153437L;
        mg.jklf[35] = 7485439556752518251L;
        mg.jklf[36] = -1816994282388840878L;
        mg.jklf[37] = -6641564216620737933L;
        mg.jklf[38] = 9126837139337811547L;
        mg.jklf[39] = -8990150100388009550L;
        mg.jklf[40] = -2439141107962883901L;
        mg.jklf[41] = -515571304903089078L;
        mg.jklf[42] = 1992511989534828497L;
        mg.jklf[43] = 3923369563436876366L;
        mg.jklf[44] = 594918794113216136L;
        mg.jklf[45] = 2725007780765802728L;
        mg.jklf[46] = -5089168417652851025L;
        mg.jklf[47] = 5169362080970515674L;
        mg.jklf[48] = -3575945213473726728L;
        mg.jklf[49] = 1527150413448426137L;
        mg.jklf[50] = 4659814625148657059L;
        mg.jklf[51] = 2356432063595050006L;
        mg.jklf[52] = 8433123540671575308L;
        mg.jklf[53] = 2432365940814163484L;
        mg.jklf[54] = 2007488163017547296L;
        mg.jklf[55] = 7380695937763935337L;
        mg.jklf[56] = 8842497097219458812L;
        mg.jklf[57] = -7836307403115410474L;
        mg.jklf[58] = -8067184063714358787L;
        mg.jklf[59] = 3228419218452567115L;
        mg.jklf[60] = -2914699499195067716L;
        mg.jklf[61] = -4462568828815369412L;
        mg.jklf[62] = -6661454690372047060L;
        mg.jklf[63] = 9153601835122277123L;
        mg.jklf[64] = 4782232633770871405L;
        mg.jklf[65] = 2614320041646556722L;
        mg.jklf[66] = -7109668662946943633L;
        mg.jklf[67] = -8078627748940043456L;
        mg.jklf[68] = -7604232431293613834L;
        mg.jklf[69] = -1276149469268796933L;
        mg.jklf[70] = 4926203737612048972L;
        mg.jklf[71] = 1421520769466241741L;
        mg.jklf[72] = 6448163031423352764L;
        mg.jklf[73] = 7375209927348704090L;
        mg.jklf[74] = -3272160101141553931L;
        mg.jklf[75] = -3363645234583329225L;
        mg.jklf[76] = -160354949826281787L;
        mg.jklf[77] = 4742480203622803004L;
        mg.jklf[78] = -7875928507895235036L;
        mg.jklf[79] = -8343395267699071847L;
        mg.jklf[80] = -2993331333717143650L;
        mg.jklf[81] = -1234808503903135513L;
        mg.jklf[82] = 8099052588284198938L;
        mg.jklf[83] = 69805559495682187L;
    }

    public static /* synthetic */ CallSite jkil(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ int jkii(int n2) {
        return jkij[n2] ^ jkik[n2];
    }

    private static /* synthetic */ void jlcg() {
        mg.jkij[200] = 1016801130;
        mg.jkij[201] = -1995982255;
        mg.jkij[202] = -293819554;
        mg.jkij[203] = 307008131;
        mg.jkij[204] = -1031236660;
        mg.jkij[205] = -64199975;
        mg.jkij[206] = -1188743810;
        mg.jkij[207] = -2079537287;
        mg.jkij[208] = -847266895;
        mg.jkij[209] = -370079469;
        mg.jkij[210] = -1823532752;
        mg.jkij[211] = -15236224;
        mg.jkij[212] = -732298497;
        mg.jkij[213] = -1817354141;
        mg.jkij[214] = 1695599057;
        mg.jkij[215] = -1002522787;
        mg.jkij[216] = -1999647956;
        mg.jkij[217] = 766415663;
        mg.jkij[218] = -143480515;
        mg.jkij[219] = 1331387305;
        mg.jkij[220] = -1211629651;
        mg.jkij[221] = -2104561899;
        mg.jkij[222] = -1716284750;
        mg.jkij[223] = -871456992;
        mg.jkij[224] = 1966935599;
        mg.jkij[225] = 307277723;
        mg.jkij[226] = 518032977;
        mg.jkij[227] = -118345264;
        mg.jkij[228] = -432799580;
        mg.jkij[229] = -1878052554;
        mg.jkij[230] = -1284525666;
        mg.jkij[231] = -287532043;
        mg.jkij[232] = 1873078939;
        mg.jkij[233] = -461266523;
        mg.jkij[234] = -1533543295;
        mg.jkij[235] = -34979453;
        mg.jkij[236] = 655935514;
        mg.jkij[237] = -63676638;
        mg.jkij[238] = -809940888;
        mg.jkij[239] = 299067301;
        mg.jkij[240] = -661568254;
        mg.jkij[241] = -813554337;
        mg.jkij[242] = 96965605;
        mg.jkij[243] = 952095478;
        mg.jkij[244] = -2072171865;
        mg.jkij[245] = 85102873;
        mg.jkij[246] = 1030293755;
        mg.jkij[247] = 123606875;
        mg.jkij[248] = 1010248853;
        mg.jkij[249] = -999366774;
        mg.jkij[250] = 40013183;
        mg.jkij[251] = -1882561270;
        mg.jkij[252] = 405787496;
        mg.jkij[253] = 814354731;
        mg.jkij[254] = -1575995170;
        mg.jkij[255] = 1728529426;
        mg.jkij[256] = 728493318;
        mg.jkij[257] = -597151186;
        mg.jkij[258] = 300459535;
        mg.jkij[259] = -733769739;
        mg.jkij[260] = 1123130666;
        mg.jkij[261] = -99497329;
        mg.jkij[262] = 1321643776;
        mg.jkij[263] = -724602259;
        mg.jkij[264] = -1422584065;
        mg.jkij[265] = -953655837;
        mg.jkij[266] = -908951582;
        mg.jkij[267] = 1478676405;
        mg.jkij[268] = 941552209;
        mg.jkij[269] = -1255182228;
        mg.jkij[270] = 142445544;
        mg.jkij[271] = 1906422889;
        mg.jkij[272] = -285610748;
        mg.jkij[273] = 1829737337;
        mg.jkij[274] = -1076853842;
        mg.jkij[275] = 1359201517;
        mg.jkij[276] = 805370901;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private /* synthetic */ void lambda$init$3(class_4185 class_41852) {
        boolean bl2;
        Object object = rq;
        boolean bl3 = true;
        block17: while (true) {
            CallSite callSite;
            if (!bl3 || (bl3 = false) || !true) {
                object = callSite - mg.jkil("jkrq", jkpm(int ), (int)29);
            }
            switch ((int)object) {
                case -2036486488: {
                    callSite = mg.jkil("jkrr", jkpm(int ), (int)30);
                    continue block17;
                }
                case -1811735776: {
                    break block17;
                }
                case 17133253: {
                    callSite = mg.jkil("jkrs", jkpm(int ), (int)31);
                    continue block17;
                }
                case 1498726836: {
                    callSite = mg.jkil("jkrt", jkpm(int ), (int)32);
                    continue block17;
                }
            }
            break;
        }
        boolean bl4 = c;
        Object object2 = rq;
        boolean bl5 = true;
        block18: while (true) {
            CallSite callSite;
            if (!bl5 || (bl5 = false) || !true) {
                object2 = callSite - mg.jkil("jkru", jkpm(int ), (int)33);
            }
            switch ((int)object2) {
                case -1811735776: {
                    break block18;
                }
                case -898473476: {
                    callSite = mg.jkil("jkrv", jkpm(int ), (int)34);
                    continue block18;
                }
                case 473240102: {
                    callSite = mg.jkil("jkrw", jkpm(int ), (int)35);
                    continue block18;
                }
                case 1789138346: {
                    callSite = mg.jkil("jkrx", jkpm(int ), (int)36);
                    continue block18;
                }
            }
            break;
        }
        int n2 = b;
        while (true) {
            long l2;
            Object object3;
            if ((object3 = (l2 = rq - mg.jkil("jkry", jkpm(int ), (int)37)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (object3 == mg.jkil("jkrz", jkii(int ), (int)204)) {
                bl2 = a;
                if (bl4) {
                    throw null;
                }
                break;
            }
            object3 = mg.jkil("jksa", jkii(int ), (int)205);
        }
        if (bl2 || bl2) return;
        Object object4 = rq;
        boolean bl6 = true;
        block20: while (true) {
            CallSite callSite;
            if (!bl6 || (bl6 = false) || !true) {
                object4 = callSite - mg.jkil("jksb", jkpm(int ), (int)38);
            }
            switch ((int)object4) {
                case -1811735776: {
                    break block20;
                }
                case -1035246365: {
                    callSite = mg.jkil("jksc", jkpm(int ), (int)39);
                    continue block20;
                }
                case 189281229: {
                    callSite = mg.jkil("jksd", jkpm(int ), (int)40);
                    continue block20;
                }
            }
            break;
        }
        this.method_25419();
        if (!bl2 && !bl2) return;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private /* synthetic */ void lambda$init$0(class_4185 var1_1) {
        v0 /* !! */  = mg.rq;
        if (true) ** GOTO lbl5
        block22: while (true) {
            v0 /* !! */  = (long)(mg.jkil("jkuv", jkpm(int ), (int)75) - mg.jkil("jkuu", jkpm(int ), (int)74));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1811735776: {
                    break block22;
                }
                case 1161078492: {
                    continue block22;
                }
            }
            break;
        }
        var4_2 = mg.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = mg.rq - mg.jkil("jkuw", jkpm(int ), (int)76)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == mg.jkil("jkux", jkii(int ), (int)241)) break;
            v1 /* !! */  = (long)mg.jkil("jkuy", jkii(int ), (int)242);
        }
        var3_3 /* !! */  = mg.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = mg.rq - mg.jkil("jkuz", jkpm(int ), (int)77)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == mg.jkil("jkva", jkii(int ), (int)243)) break;
            v2 /* !! */  = (long)mg.jkil("jkvb", jkii(int ), (int)244);
        }
        var2_4 = mg.a;
        if (!var4_2) ** GOTO lbl29
        throw null;
        {
            if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
            switch (var3_3 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return;
                }
lbl29:
                // 1 sources

                if (var2_4 || var2_4) continue block25;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = mg.rq - mg.jkil("jkvc", jkpm(int ), (int)78)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == mg.jkil("jkvd", jkii(int ), (int)245)) break;
                    v3 /* !! */  = (long)mg.jkil("jkve", jkii(int ), (int)246);
                }
                if (this.module == null) ** GOTO lbl63
                if (var2_4) continue block25;
                v4 /* !! */  = mg.rq;
                if (true) ** GOTO lbl41
                block27: while (true) {
                    v4 /* !! */  = (long)(mg.jkil("jkvg", jkpm(int ), (int)80) - mg.jkil("jkvf", jkpm(int ), (int)79));
lbl41:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1811735776: {
                            break block27;
                        }
                        case 2013212179: {
                            continue block27;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_3 = mg.rq - mg.jkil("jkvh", jkpm(int ), (int)81)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == mg.jkil("jkvi", jkii(int ), (int)247)) break;
                    v5 /* !! */  = (long)mg.jkil("jkvj", jkii(int ), (int)248);
                }
                v6 = this.module.backgroundStyle;
                v7 /* !! */  = mg.rq;
                if (true) ** GOTO lbl56
                block29: while (true) {
                    v7 /* !! */  = (long)(mg.jkil("jkvl", jkpm(int ), (int)83) - mg.jkil("jkvk", jkpm(int ), (int)82));
lbl56:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -1811735776: {
                            break block29;
                        }
                        case -1676508376: {
                            continue block29;
                        }
                    }
                    break;
                }
                v6.setValue("\u041d\u043e\u0432\u044b\u0439");
                if (var2_4) continue block25;
lbl63:
                // 2 sources

                if (!var2_4 && !var2_4) ** break;
                continue block25;
                return;
lbl66:
                // 4 sources

                case 0: {
                    var3_3 /* !! */  = (int)mg.jkil("jkvm", jkii(int ), (int)249);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl88
                }
                case 1: {
                    var3_3 /* !! */  = (int)mg.jkil("jkvn", jkii(int ), (int)250);
                    if (!var4_2) ** GOTO lbl66
                    throw null;
                }
lbl75:
                // 2 sources

                case 2: {
                    var3_3 /* !! */  = (int)mg.jkil("jkvo", jkii(int ), (int)251);
                    if (!var4_2) ** GOTO lbl66
                    throw null;
                }
                case 3: {
                    var3_3 /* !! */  = (int)mg.jkil("jkvp", jkii(int ), (int)252);
                    if (!var4_2) ** GOTO lbl66
                    throw null;
                }
lbl83:
                // 2 sources

                case 4: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var3_3 /* !! */  = (int)mg.jkil("jkvq", jkii(int ), (int)253);
                        if (!var4_2) break block25;
                        throw null;
                    }
                }
lbl88:
                // 2 sources

                case 5: {
                    var3_3 /* !! */  = (int)mg.jkil("jkvr", jkii(int ), (int)254);
                    if (!var4_2) ** GOTO lbl75
                    throw null;
                }
                case 6: {
                    var3_3 /* !! */  = (int)mg.jkil("jkvs", jkii(int ), (int)255);
                    if (!var4_2) ** GOTO lbl83
                    throw null;
                }
                case 7: 
            }
        }
        var3_3 /* !! */  = (int)mg.jkil("jkvt", jkii(int ), (int)256);
        ** while (!var4_2)
lbl99:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void jlcm() {
        mg.jkik[100] = -1686074946;
        mg.jkik[101] = 1193312092;
        mg.jkik[102] = 1621833668;
        mg.jkik[103] = 238315312;
        mg.jkik[104] = 1383552810;
        mg.jkik[105] = 1616683686;
        mg.jkik[106] = -846004001;
        mg.jkik[107] = 1766845821;
        mg.jkik[108] = -1376462689;
        mg.jkik[109] = 1912349510;
        mg.jkik[110] = 1648110340;
        mg.jkik[111] = -138481873;
        mg.jkik[112] = -462060117;
        mg.jkik[113] = 1698675593;
        mg.jkik[114] = -2017797486;
        mg.jkik[115] = -11906687;
        mg.jkik[116] = 2083486434;
        mg.jkik[117] = 271799196;
        mg.jkik[118] = -990772547;
        mg.jkik[119] = 515088892;
        mg.jkik[120] = -902299955;
        mg.jkik[121] = 923456886;
        mg.jkik[122] = -945261151;
        mg.jkik[123] = 1116661499;
        mg.jkik[124] = -1773673951;
        mg.jkik[125] = 2099108596;
        mg.jkik[126] = -547987047;
        mg.jkik[127] = -288721812;
        mg.jkik[128] = -1888932045;
        mg.jkik[129] = 1970117189;
        mg.jkik[130] = -54734894;
        mg.jkik[131] = 911788243;
        mg.jkik[132] = -1819550549;
        mg.jkik[133] = -1955416953;
        mg.jkik[134] = 1885206554;
        mg.jkik[135] = 254588564;
        mg.jkik[136] = 27686775;
        mg.jkik[137] = -1733899598;
        mg.jkik[138] = 738622973;
        mg.jkik[139] = 754474353;
        mg.jkik[140] = -287115261;
        mg.jkik[141] = 1947729077;
        mg.jkik[142] = -704320750;
        mg.jkik[143] = -1524385712;
        mg.jkik[144] = 581383846;
        mg.jkik[145] = -846022946;
        mg.jkik[146] = -1196557678;
        mg.jkik[147] = -898120895;
        mg.jkik[148] = -431246497;
        mg.jkik[149] = 131101054;
        mg.jkik[150] = -1952347607;
        mg.jkik[151] = -1421378112;
        mg.jkik[152] = -1555389248;
        mg.jkik[153] = 987776716;
        mg.jkik[154] = 1462584336;
        mg.jkik[155] = -1448063690;
        mg.jkik[156] = -656637399;
        mg.jkik[157] = -337083639;
        mg.jkik[158] = -1301850533;
        mg.jkik[159] = -954235963;
        mg.jkik[160] = 1872133433;
        mg.jkik[161] = -1750166811;
        mg.jkik[162] = 1533856655;
        mg.jkik[163] = 2061700933;
        mg.jkik[164] = -504193406;
        mg.jkik[165] = -867896287;
        mg.jkik[166] = 2077513847;
        mg.jkik[167] = -1821928312;
        mg.jkik[168] = 183531899;
        mg.jkik[169] = 34933876;
        mg.jkik[170] = -1155550409;
        mg.jkik[171] = -2094630171;
        mg.jkik[172] = -612848710;
        mg.jkik[173] = -1753937229;
        mg.jkik[174] = -889010271;
        mg.jkik[175] = 694856692;
        mg.jkik[176] = 1528601442;
        mg.jkik[177] = 1036840093;
        mg.jkik[178] = -694794225;
        mg.jkik[179] = 364372658;
        mg.jkik[180] = 1716635729;
        mg.jkik[181] = -1914769159;
        mg.jkik[182] = -1201318375;
        mg.jkik[183] = -1804167139;
        mg.jkik[184] = 1762139929;
        mg.jkik[185] = 786346276;
        mg.jkik[186] = -672492262;
        mg.jkik[187] = -1636066570;
        mg.jkik[188] = 1982494691;
        mg.jkik[189] = -1972360141;
        mg.jkik[190] = 500909228;
        mg.jkik[191] = -1821227165;
        mg.jkik[192] = 548704365;
        mg.jkik[193] = 1450383701;
        mg.jkik[194] = 353585037;
        mg.jkik[195] = -1406824772;
        mg.jkik[196] = 807080675;
        mg.jkik[197] = 2123932993;
        mg.jkik[198] = -1229555335;
        mg.jkik[199] = -1172422185;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public mg(class_437 var1_1) {
        var3_2 /* !! */  = mg.b;
        super((class_2561)class_2561.method_43470((String)"Interface Settings"));
        this.animationProgress = 0.0f;
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.parent = var1_1;
                this.module = eb.getInstance();
                return;
            }
lbl10:
            // 2 sources

            case 0: {
                while (true) {
                    var3_2 /* !! */  = (int)mg.jkil("jkim", jkii(int ), (int)0);
                }
            }
            case 1: {
                var3_2 /* !! */  = (int)mg.jkil("jkin", jkii(int ), (int)1);
                break;
            }
            case 2: {
                var3_2 /* !! */  = (int)mg.jkil("jkio", jkii(int ), (int)2);
                ** GOTO lbl10
            }
            case 3: {
                var3_2 /* !! */  = (int)mg.jkil("jkip", jkii(int ), (int)3);
                break;
            }
            case 4: {
                var3_2 /* !! */  = (int)mg.jkil("jkiq", jkii(int ), (int)4);
            }
            case 5: 
        }
        while (true) {
            var3_2 /* !! */  = (int)mg.jkil("jkir", jkii(int ), (int)5);
        }
    }

    static {
        jkij = new int[277];
        jkik = new int[277];
        mg.jlby();
        mg.jlcc();
        mg.jlcg();
        mg.jlcj();
        mg.jlcm();
        mg.jlcp();
        jklf = new long[84];
        jklg = new long[84];
        mg.jlct();
        mg.jlcx();
        PANEL_BG = nd.rgba((int)mg.jkil("jkvu", jkii(int ), (int)257), (int)mg.jkil("jkvv", jkii(int ), (int)258), (int)mg.jkil("jkvw", jkii(int ), (int)259), (int)mg.jkil("jkvx", jkii(int ), (int)260));
        PANEL_BORDER = nd.rgba((int)mg.jkil("jkvy", jkii(int ), (int)261), (int)mg.jkil("jkvz", jkii(int ), (int)262), (int)mg.jkil("jkwa", jkii(int ), (int)263), (int)mg.jkil("jlbh", jkii(int ), (int)264));
        TEXT_COLOR = nd.rgba((int)mg.jkil("jlbj", jkii(int ), (int)265), (int)mg.jkil("jlbk", jkii(int ), (int)266), (int)mg.jkil("jlbl", jkii(int ), (int)267), (int)mg.jkil("jlbn", jkii(int ), (int)268));
        SUBTEXT_COLOR = nd.rgba((int)mg.jkil("jlbo", jkii(int ), (int)269), (int)mg.jkil("jlbp", jkii(int ), (int)270), (int)mg.jkil("jlbq", jkii(int ), (int)271), (int)mg.jkil("jlbs", jkii(int ), (int)272));
        ACCENT_COLOR = nd.rgba((int)mg.jkil("jlbt", jkii(int ), (int)273), (int)mg.jkil("jlbu", jkii(int ), (int)274), (int)mg.jkil("jlbv", jkii(int ), (int)275), (int)mg.jkil("jlbw", jkii(int ), (int)276));
    }

    private static /* synthetic */ float jklc(int n2) {
        return Float.intBitsToFloat(jkij[n2] ^ jkik[n2]);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void method_25394(class_332 var1_1, int var2_2, int var3_3, float var4_4) {
        block139: {
            block138: {
                block137: {
                    block136: {
                        block135: {
                            block134: {
                                var22_5 = mg.c;
                                var21_6 /* !! */  = mg.b;
                                var20_7 = mg.a;
                                if (var22_5) {
                                    throw null;
lbl6:
                                    // 36 sources

                                    return;
                                }
                                if (var20_7 || var20_7) ** GOTO lbl6
                                var5_8 = System.nanoTime();
                                if (var20_7 || var20_7) ** GOTO lbl6
                                var7_9 = Math.min(1.0f, (float)(var5_8 - this.openedAt) / mg.jkil("jkld", jklc(int ), (int)68));
                                if (var20_7 || var20_7) ** GOTO lbl6
                                this.animationProgress = (float)(1.0 - Math.pow(1.0f - var7_9, (double)mg.jkil("jklh", jkle(int ), (int)0)));
                                if (var20_7 || var20_7) ** GOTO lbl6
                                if (this.parent == null) break block134;
                                if (var20_7 || var20_7) ** GOTO lbl6
                                this.parent.method_25394(var1_1, var2_2, var3_3, var4_4);
                                if (var20_7) ** GOTO lbl6
                            }
                            if (var20_7 || var20_7) ** GOTO lbl6
                            var8_10 = (int)(mg.jkil("jkli", jklc(int ), (int)69) * this.animationProgress);
                            if (var20_7 || var20_7) ** GOTO lbl6
                            var1_1.method_25294((int)mg.jkil("jklj", jkii(int ), (int)70), (int)mg.jkil("jklk", jkii(int ), (int)71), ki.getFixedScaledWidth(), ki.getFixedScaledHeight(), nd.rgba((int)mg.jkil("jkll", jkii(int ), (int)72), (int)mg.jkil("jklm", jkii(int ), (int)73), (int)mg.jkil("jkln", jkii(int ), (int)74), var8_10));
                            if (var20_7 || var20_7) ** GOTO lbl6
                            var9_11 = ki.getFixedScaledWidth() / mg.jkil("jklo", jkii(int ), (int)75);
                            if (var20_7 || var20_7) ** GOTO lbl6
                            var10_12 = ki.getFixedScaledHeight() / mg.jkil("jklp", jkii(int ), (int)76);
                            if (var20_7 || var20_7) ** GOTO lbl6
                            var11_13 = var9_11 - mg.jkil("jklq", jkii(int ), (int)77);
                            if (var20_7 || var20_7) ** GOTO lbl6
                            var12_14 = var10_12 - mg.jkil("jklr", jkii(int ), (int)78);
                            if (var20_7 || var20_7) ** GOTO lbl6
                            var13_15 = mg.jkil("jkls", jklc(int ), (int)79) + this.animationProgress * mg.jkil("jklt", jklc(int ), (int)80);
                            if (var20_7 || var20_7) ** GOTO lbl6
                            var14_16 = (int)(mg.jkil("jklu", jklc(int ), (int)81) * var13_15);
                            if (var20_7 || var20_7) ** GOTO lbl6
                            var15_17 = (int)(mg.jkil("jklv", jklc(int ), (int)82) * var13_15);
                            if (var20_7 || var20_7) ** GOTO lbl6
                            var16_18 = var9_11 - var14_16 / mg.jkil("jklw", jkii(int ), (int)83);
                            if (var20_7 || var20_7) ** GOTO lbl6
                            var17_19 = var10_12 - var15_17 / mg.jkil("jklx", jkii(int ), (int)84);
                            if (var20_7 || var20_7) ** GOTO lbl6
                            if (!(var13_15 > mg.jkil("jkly", jklc(int ), (int)85))) break block135;
                            if (var20_7 || var20_7) ** GOTO lbl6
                            ki.rect(var1_1, (float)var16_18, (float)var17_19, (float)var14_16, (float)var15_17, (float)(mg.jkil("jklz", jklc(int ), (int)86) * var13_15), mg.PANEL_BG, (boolean)mg.jkil("jkma", jkii(int ), (int)87));
                            if (var20_7 || var20_7) ** GOTO lbl6
                            ki.outline(var1_1, (float)var16_18, (float)var17_19, (float)var14_16, (float)var15_17, (float)(mg.jkil("jkmb", jklc(int ), (int)88) * var13_15), 1.0f, mg.PANEL_BORDER, (boolean)mg.jkil("jkmc", jkii(int ), (int)89));
                            if (var20_7) ** GOTO lbl6
                        }
                        if (var20_7 || var20_7) ** GOTO lbl6
                        if (!(this.animationProgress > mg.jkil("jkmd", jklc(int ), (int)90))) ** GOTO lbl88
                        if (var20_7 || var20_7) ** GOTO lbl6
                        if (kv.INTER_SEMIBOLD == null) break block136;
                        if (var20_7) ** GOTO lbl6
                        v0 = kv.INTER_SEMIBOLD;
                        if (var22_5) {
                            throw null;
                        }
                        break block137;
                    }
                    if (var20_7 || var20_7) ** GOTO lbl6
                    v0 = var18_20 = kv.getDefault();
                }
                if (var20_7 || var20_7) ** GOTO lbl6
                if (var18_20 == null) ** GOTO lbl88
                if (var20_7 || var20_7) ** GOTO lbl6
                kq.text(var1_1, var18_20, "Interface Settings", (float)(var16_18 + mg.jkil("jkme", jkii(int ), (int)91)), (float)(var17_19 + mg.jkil("jkmf", jkii(int ), (int)92)), (float)mg.jkil("jkmg", jklc(int ), (int)93), mg.TEXT_COLOR, (boolean)mg.jkil("jkmh", jkii(int ), (int)94));
                if (var20_7 || var20_7) ** GOTO lbl6
                kq.text(var1_1, var18_20, "\u0421\u0442\u0438\u043b\u044c \u0444\u043e\u043d\u0430", (float)(var16_18 + mg.jkil("jkmi", jkii(int ), (int)95)), (float)(var17_19 + mg.jkil("jkmj", jkii(int ), (int)96)), (float)mg.jkil("jkmk", jklc(int ), (int)97), mg.SUBTEXT_COLOR, (boolean)mg.jkil("jkml", jkii(int ), (int)98));
                if (var20_7 || var20_7) ** GOTO lbl6
                if (this.module == null) break block138;
                if (var20_7) ** GOTO lbl6
                v1 = this.module.backgroundStyle.getValue();
                if (var22_5) {
                    throw null;
                }
                break block139;
            }
            if (var20_7 || var20_7) ** GOTO lbl6
            v1 = var19_21 = "\u041d\u043e\u0432\u044b\u0439";
        }
        if (var20_7 || var20_7) ** GOTO lbl6
        kq.text(var1_1, var18_20, "\u0422\u0435\u043a\u0443\u0449\u0438\u0439: " + var19_21, (float)(var16_18 + mg.jkil("jkmm", jkii(int ), (int)99)), (float)(var17_19 + mg.jkil("jkmn", jkii(int ), (int)100)), (float)mg.jkil("jkmo", jklc(int ), (int)101), mg.ACCENT_COLOR, (boolean)mg.jkil("jkmp", jkii(int ), (int)102));
        if (var21_6 /* !! */  == 0) ** GOTO lbl-1000
        switch (var21_6 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var20_7 || var20_7) ** GOTO lbl6
                kq.text(var1_1, var18_20, "\u042d\u043b\u0435\u043c\u0435\u043d\u0442\u044b HUD", (float)(var16_18 + mg.jkil("jkmq", jkii(int ), (int)103)), (float)(var17_19 + mg.jkil("jkmr", jkii(int ), (int)104)), (float)mg.jkil("jkms", jklc(int ), (int)105), mg.SUBTEXT_COLOR, (boolean)mg.jkil("jkmt", jkii(int ), (int)106));
                if (var20_7) ** GOTO lbl6
lbl88:
                // 3 sources

                if (var20_7 || var20_7) ** GOTO lbl6
                super.method_25394(var1_1, var2_2, var3_3, var4_4);
                if (!var20_7 && !var20_7) ** break;
                ** continue;
                return;
            }
lbl93:
            // 3 sources

            case 0: {
                var21_6 /* !! */  = (int)mg.jkil("jkmu", jkii(int ), (int)107);
                if (var22_5) {
                    throw null;
                }
                ** GOTO lbl355
            }
lbl98:
            // 2 sources

            case 1: {
                var21_6 /* !! */  = (int)mg.jkil("jkmv", jkii(int ), (int)108);
                if (var22_5) {
                    throw null;
                }
                ** GOTO lbl196
            }
lbl103:
            // 2 sources

            case 2: {
                var21_6 /* !! */  = (int)mg.jkil("jkmw", jkii(int ), (int)109);
                if (var22_5) {
                    throw null;
                }
                ** GOTO lbl256
            }
lbl108:
            // 3 sources

            case 3: {
                var21_6 /* !! */  = (int)mg.jkil("jkmx", jkii(int ), (int)110);
                if (var22_5) {
                    throw null;
                }
                ** GOTO lbl187
            }
lbl113:
            // 2 sources

            case 4: {
                var21_6 /* !! */  = (int)mg.jkil("jkmy", jkii(int ), (int)111);
                if (var22_5) {
                    throw null;
                }
                ** GOTO lbl310
            }
lbl118:
            // 3 sources

            case 5: {
                var21_6 /* !! */  = (int)mg.jkil("jkmz", jkii(int ), (int)112);
                if (var22_5) {
                    throw null;
                }
                ** GOTO lbl371
            }
lbl123:
            // 4 sources

            case 6: {
                var21_6 /* !! */  = (int)mg.jkil("jkna", jkii(int ), (int)113);
                if (!var22_5) ** GOTO lbl108
                throw null;
            }
lbl127:
            // 2 sources

            case 7: {
                var21_6 /* !! */  = (int)mg.jkil("jknb", jkii(int ), (int)114);
                if (!var22_5) ** GOTO lbl103
                throw null;
            }
lbl131:
            // 2 sources

            case 8: {
                var21_6 /* !! */  = (int)mg.jkil("jknc", jkii(int ), (int)115);
                if (var22_5) {
                    throw null;
                }
                ** GOTO lbl229
            }
lbl136:
            // 2 sources

            case 9: {
                var21_6 /* !! */  = (int)mg.jkil("jknd", jkii(int ), (int)116);
                if (var22_5) {
                    throw null;
                }
                ** GOTO lbl251
            }
            case 10: {
                var21_6 /* !! */  = (int)mg.jkil("jkne", jkii(int ), (int)117);
                if (var22_5) {
                    throw null;
                }
                ** GOTO lbl355
            }
            case 11: {
                var21_6 /* !! */  = (int)mg.jkil("jknf", jkii(int ), (int)118);
                if (var22_5) {
                    throw null;
                }
                ** GOTO lbl214
            }
            case 12: {
                var21_6 /* !! */  = (int)mg.jkil("jkng", jkii(int ), (int)119);
                if (!var22_5) ** GOTO lbl108
                throw null;
            }
lbl155:
            // 2 sources

            case 13: {
                var21_6 /* !! */  = (int)mg.jkil("jknh", jkii(int ), (int)120);
                if (var22_5) {
                    throw null;
                }
                ** GOTO lbl169
            }
            case 14: {
                var21_6 /* !! */  = (int)mg.jkil("jkni", jkii(int ), (int)121);
                if (!var22_5) ** GOTO lbl113
                throw null;
            }
            case 15: {
                var21_6 /* !! */  = (int)mg.jkil("jknj", jkii(int ), (int)122);
                if (var22_5) {
                    throw null;
                }
                ** GOTO lbl367
            }
lbl169:
            // 2 sources

            case 16: {
                var21_6 /* !! */  = (int)mg.jkil("jknk", jkii(int ), (int)123);
                if (var22_5) {
                    throw null;
                }
                ** GOTO lbl178
            }
lbl174:
            // 3 sources

            case 17: {
                var21_6 /* !! */  = (int)mg.jkil("jknl", jkii(int ), (int)124);
                if (!var22_5) ** GOTO lbl98
                throw null;
            }
lbl178:
            // 4 sources

            case 18: {
                var21_6 /* !! */  = (int)mg.jkil("jknm", jkii(int ), (int)125);
                if (!var22_5) ** GOTO lbl174
                throw null;
            }
lbl182:
            // 2 sources

            case 19: {
                var21_6 /* !! */  = (int)mg.jkil("jknn", jkii(int ), (int)126);
                if (var22_5) {
                    throw null;
                }
                ** GOTO lbl339
            }
lbl187:
            // 3 sources

            case 20: {
                var21_6 /* !! */  = (int)mg.jkil("jkno", jkii(int ), (int)127);
                if (var22_5) {
                    throw null;
                }
                ** GOTO lbl275
            }
            case 21: {
                var21_6 /* !! */  = (int)mg.jkil("jknp", jkii(int ), (int)128);
                if (!var22_5) ** GOTO lbl123
                throw null;
            }
lbl196:
            // 3 sources

            case 22: {
                var21_6 /* !! */  = (int)mg.jkil("jknq", jkii(int ), (int)129);
                if (var22_5) {
                    throw null;
                }
                ** GOTO lbl243
            }
            case 23: {
                var21_6 /* !! */  = (int)mg.jkil("jknr", jkii(int ), (int)130);
                if (var22_5) {
                    throw null;
                }
                ** GOTO lbl279
            }
            case 24: {
                var21_6 /* !! */  = (int)mg.jkil("jkns", jkii(int ), (int)131);
                if (!var22_5) ** GOTO lbl123
                throw null;
            }
            case 25: {
                var21_6 /* !! */  = (int)mg.jkil("jknt", jkii(int ), (int)132);
                if (!var22_5) ** GOTO lbl196
                throw null;
            }
lbl214:
            // 2 sources

            case 26: {
                var21_6 /* !! */  = (int)mg.jkil("jknu", jkii(int ), (int)133);
                if (var22_5) {
                    throw null;
                }
                ** GOTO lbl331
            }
            case 27: {
                var21_6 /* !! */  = (int)mg.jkil("jknv", jkii(int ), (int)134);
                if (var22_5) {
                    throw null;
                }
                ** GOTO lbl367
            }
lbl224:
            // 2 sources

            case 28: {
                var21_6 /* !! */  = (int)mg.jkil("jknw", jkii(int ), (int)135);
                if (var22_5) {
                    throw null;
                }
                ** GOTO lbl314
            }
lbl229:
            // 3 sources

            case 29: {
                var21_6 /* !! */  = (int)mg.jkil("jknx", jkii(int ), (int)136);
                if (var22_5) {
                    throw null;
                }
                ** GOTO lbl275
            }
lbl234:
            // 3 sources

            case 30: {
                var21_6 /* !! */  = (int)mg.jkil("jkny", jkii(int ), (int)137);
                if (!var22_5) break;
                throw null;
            }
            case 31: {
                var21_6 /* !! */  = (int)mg.jkil("jknz", jkii(int ), (int)138);
                if (var22_5) {
                    throw null;
                }
                ** GOTO lbl371
            }
lbl243:
            // 2 sources

            case 32: {
                var21_6 /* !! */  = (int)mg.jkil("jkoa", jkii(int ), (int)139);
                if (!var22_5) ** GOTO lbl136
                throw null;
            }
lbl247:
            // 2 sources

            case 33: {
                var21_6 /* !! */  = (int)mg.jkil("jkob", jkii(int ), (int)140);
                if (!var22_5) ** GOTO lbl224
                throw null;
            }
lbl251:
            // 4 sources

            case 34: {
                var21_6 /* !! */  = (int)mg.jkil("jkoc", jkii(int ), (int)141);
                if (var22_5) {
                    throw null;
                }
                ** GOTO lbl314
            }
lbl256:
            // 2 sources

            case 35: {
                var21_6 /* !! */  = (int)mg.jkil("jkod", jkii(int ), (int)142);
                if (var22_5) {
                    throw null;
                }
                ** GOTO lbl335
            }
            case 36: {
                var21_6 /* !! */  = (int)mg.jkil("jkoe", jkii(int ), (int)143);
                if (var22_5) {
                    throw null;
                }
                ** GOTO lbl301
            }
lbl266:
            // 2 sources

            case 37: {
                var21_6 /* !! */  = (int)mg.jkil("jkof", jkii(int ), (int)144);
                if (var22_5) {
                    throw null;
                }
                ** GOTO lbl387
            }
lbl271:
            // 3 sources

            case 38: {
                var21_6 /* !! */  = (int)mg.jkil("jkog", jkii(int ), (int)145);
                if (!var22_5) ** GOTO lbl93
                throw null;
            }
lbl275:
            // 3 sources

            case 39: {
                var21_6 /* !! */  = (int)mg.jkil("jkoh", jkii(int ), (int)146);
                if (!var22_5) ** GOTO lbl93
                throw null;
            }
lbl279:
            // 4 sources

            case 40: {
                var21_6 /* !! */  = (int)mg.jkil("jkoi", jkii(int ), (int)147);
                if (!var22_5) ** GOTO lbl234
                throw null;
            }
            case 41: {
                var21_6 /* !! */  = (int)mg.jkil("jkoj", jkii(int ), (int)148);
                if (var22_5) {
                    throw null;
                }
                ** GOTO lbl371
            }
            case 42: {
                var21_6 /* !! */  = (int)mg.jkil("jkok", jkii(int ), (int)149);
                if (!var22_5) ** GOTO lbl155
                throw null;
            }
lbl292:
            // 2 sources

            case 43: {
                var21_6 /* !! */  = (int)mg.jkil("jkol", jkii(int ), (int)150);
                if (var22_5) {
                    throw null;
                }
                ** GOTO lbl301
            }
            case 44: {
                var21_6 /* !! */  = (int)mg.jkil("jkom", jkii(int ), (int)151);
                if (!var22_5) ** GOTO lbl187
                throw null;
            }
lbl301:
            // 3 sources

            case 45: {
                var21_6 /* !! */  = (int)mg.jkil("jkon", jkii(int ), (int)152);
                if (!var22_5) ** GOTO lbl182
                throw null;
            }
            case 46: {
                var21_6 /* !! */  = (int)mg.jkil("jkoo", jkii(int ), (int)153);
                if (var22_5) {
                    throw null;
                }
                ** GOTO lbl375
            }
lbl310:
            // 2 sources

            case 47: {
                var21_6 /* !! */  = (int)mg.jkil("jkop", jkii(int ), (int)154);
                if (!var22_5) ** GOTO lbl279
                throw null;
            }
lbl314:
            // 3 sources

            case 48: {
                var21_6 /* !! */  = (int)mg.jkil("jkoq", jkii(int ), (int)155);
                if (!var22_5) ** GOTO lbl118
                throw null;
            }
            case 49: {
                var21_6 /* !! */  = (int)mg.jkil("jkor", jkii(int ), (int)156);
                if (var22_5) {
                    throw null;
                }
                ** GOTO lbl331
            }
            case 50: {
                var21_6 /* !! */  = (int)mg.jkil("jkos", jkii(int ), (int)157);
                if (!var22_5) ** GOTO lbl247
                throw null;
            }
            case 51: {
                var21_6 /* !! */  = (int)mg.jkil("jkot", jkii(int ), (int)158);
                if (!var22_5) ** GOTO lbl279
                throw null;
            }
lbl331:
            // 3 sources

            case 52: {
                var21_6 /* !! */  = (int)mg.jkil("jkou", jkii(int ), (int)159);
                if (!var22_5) ** GOTO lbl174
                throw null;
            }
lbl335:
            // 3 sources

            case 53: {
                var21_6 /* !! */  = (int)mg.jkil("jkov", jkii(int ), (int)160);
                if (!var22_5) ** GOTO lbl251
                throw null;
            }
lbl339:
            // 2 sources

            case 54: {
                var21_6 /* !! */  = (int)mg.jkil("jkow", jkii(int ), (int)161);
                if (!var22_5) ** GOTO lbl335
                throw null;
            }
            case 55: {
                var21_6 /* !! */  = (int)mg.jkil("jkox", jkii(int ), (int)162);
                if (!var22_5) ** GOTO lbl266
                throw null;
            }
            case 56: {
                var21_6 /* !! */  = (int)mg.jkil("jkoy", jkii(int ), (int)163);
                if (!var22_5) ** GOTO lbl178
                throw null;
            }
            case 57: {
                var21_6 /* !! */  = (int)mg.jkil("jkoz", jkii(int ), (int)164);
                if (!var22_5) ** GOTO lbl131
                throw null;
            }
lbl355:
            // 3 sources

            case 58: {
                var21_6 /* !! */  = (int)mg.jkil("jkpa", jkii(int ), (int)165);
                if (!var22_5) ** GOTO lbl271
                throw null;
            }
lbl359:
            // 2 sources

            case 59: {
                var21_6 /* !! */  = (int)mg.jkil("jkpb", jkii(int ), (int)166);
                if (!var22_5) ** GOTO lbl123
                throw null;
            }
            case 60: {
                var21_6 /* !! */  = (int)mg.jkil("jkpc", jkii(int ), (int)167);
                if (!var22_5) ** GOTO lbl127
                throw null;
            }
lbl367:
            // 3 sources

            case 61: {
                var21_6 /* !! */  = (int)mg.jkil("jkpd", jkii(int ), (int)168);
                if (!var22_5) ** GOTO lbl359
                throw null;
            }
lbl371:
            // 4 sources

            case 62: {
                var21_6 /* !! */  = (int)mg.jkil("jkpe", jkii(int ), (int)169);
                if (!var22_5) ** GOTO lbl178
                throw null;
            }
lbl375:
            // 2 sources

            case 63: {
                var21_6 /* !! */  = (int)mg.jkil("jkpf", jkii(int ), (int)170);
                if (!var22_5) ** GOTO lbl271
                throw null;
            }
            case 64: {
                var21_6 /* !! */  = (int)mg.jkil("jkpg", jkii(int ), (int)171);
                if (!var22_5) ** GOTO lbl118
                throw null;
            }
            case 65: {
                var21_6 /* !! */  = (int)mg.jkil("jkph", jkii(int ), (int)172);
                if (!var22_5) ** GOTO lbl292
                throw null;
            }
lbl387:
            // 2 sources

            case 66: {
                var21_6 /* !! */  = (int)mg.jkil("jkpi", jkii(int ), (int)173);
                if (!var22_5) ** GOTO lbl229
                throw null;
            }
            case 67: {
                var21_6 /* !! */  = (int)mg.jkil("jkpj", jkii(int ), (int)174);
                if (!var22_5) ** GOTO lbl251
                throw null;
            }
            case 68: {
                var21_6 /* !! */  = (int)mg.jkil("jkpk", jkii(int ), (int)175);
                if (!var22_5) ** GOTO lbl234
                throw null;
            }
            case 69: 
        }
        do {
            var21_6 /* !! */  = (int)mg.jkil("jkpl", jkii(int ), (int)176);
        } while (!var22_5);
        throw null;
    }

    private static /* synthetic */ double jkle(int n2) {
        return Double.longBitsToDouble(jklf[n2] ^ jklg[n2]);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void method_25419() {
        v0 /* !! */  = mg.rq;
        if (true) ** GOTO lbl5
        block36: while (true) {
            v0 /* !! */  = (long)(v1 - mg.jkil("jkpn", jkpm(int ), (int)1));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1811735776: {
                    break block36;
                }
                case -109231783: {
                    v1 = mg.jkil("jkpo", jkpm(int ), (int)2);
                    continue block36;
                }
                case 933788747: {
                    v1 = mg.jkil("jkpp", jkpm(int ), (int)3);
                    continue block36;
                }
            }
            break;
        }
        var3_1 = mg.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = mg.rq - mg.jkil("jkpq", jkpm(int ), (int)4)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == mg.jkil("jkpr", jkii(int ), (int)177)) break;
            v2 /* !! */  = (long)mg.jkil("jkps", jkii(int ), (int)178);
        }
        var2_2 /* !! */  = mg.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = mg.rq - mg.jkil("jkpt", jkpm(int ), (int)5)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == mg.jkil("jkpu", jkii(int ), (int)179)) break;
            v3 /* !! */  = (long)mg.jkil("jkpv", jkii(int ), (int)180);
        }
        var1_3 = mg.a;
        if (var3_1) {
            throw null;
lbl29:
            // 6 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl29
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v4 /* !! */  = mg.rq;
                if (true) ** GOTO lbl39
                block40: while (true) {
                    v4 /* !! */  = (long)(v5 - mg.jkil("jkpw", jkpm(int ), (int)6));
lbl39:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1811735776: {
                            break block40;
                        }
                        case -624198855: {
                            v5 = mg.jkil("jkpx", jkpm(int ), (int)7);
                            continue block40;
                        }
                        case -583761339: {
                            v5 = mg.jkil("jkpy", jkpm(int ), (int)8);
                            continue block40;
                        }
                        case -284754841: {
                            v5 = mg.jkil("jkpz", jkpm(int ), (int)9);
                            continue block40;
                        }
                    }
                    break;
                }
                if (this.parent == null) ** GOTO lbl85
                if (var1_3 || var1_3) ** GOTO lbl29
                v6 /* !! */  = mg.rq;
                if (true) ** GOTO lbl57
                block41: while (true) {
                    v6 /* !! */  = (long)(v7 - mg.jkil("jkqa", jkpm(int ), (int)10));
lbl57:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1823928381: {
                            v7 = mg.jkil("jkqb", jkpm(int ), (int)11);
                            continue block41;
                        }
                        case -1811735776: {
                            break block41;
                        }
                        case -321694998: {
                            v7 = mg.jkil("jkqc", jkpm(int ), (int)12);
                            continue block41;
                        }
                        case 1934450242: {
                            v7 = mg.jkil("jkqd", jkpm(int ), (int)13);
                            continue block41;
                        }
                    }
                    break;
                }
                v8 = class_310.method_1551();
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_2 = mg.rq - mg.jkil("jkqe", jkpm(int ), (int)14)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == mg.jkil("jkqf", jkii(int ), (int)181)) break;
                    v9 /* !! */  = (long)mg.jkil("jkqg", jkii(int ), (int)182);
                }
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_3 = mg.rq - mg.jkil("jkqh", jkpm(int ), (int)15)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == mg.jkil("jkqi", jkii(int ), (int)183)) break;
                    v10 /* !! */  = (long)mg.jkil("jkqj", jkii(int ), (int)184);
                }
                v8.method_1507(this.parent);
                if (var1_3) ** GOTO lbl29
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl97
lbl85:
                // 1 sources

                if (var1_3 || var1_3) ** GOTO lbl29
                v11 /* !! */  = mg.rq;
                if (true) ** GOTO lbl90
                block44: while (true) {
                    v11 /* !! */  = (long)(mg.jkil("jkql", jkpm(int ), (int)17) - mg.jkil("jkqk", jkpm(int ), (int)16));
lbl90:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -1811735776: {
                            break block44;
                        }
                        case -1303272317: {
                            continue block44;
                        }
                    }
                    break;
                }
                super.method_25419();
                if (var1_3) ** GOTO lbl29
lbl97:
                // 2 sources

                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
lbl100:
            // 3 sources

            case 0: {
                var2_2 /* !! */  = (int)mg.jkil("jkqm", jkii(int ), (int)185);
                if (!var3_1) break;
                throw null;
            }
            case 1: {
                var2_2 /* !! */  = (int)mg.jkil("jkqn", jkii(int ), (int)186);
                if (!var3_1) ** GOTO lbl100
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)mg.jkil("jkqo", jkii(int ), (int)187);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl145
                    break;
                }
            }
lbl114:
            // 2 sources

            case 3: {
                var2_2 /* !! */  = (int)mg.jkil("jkqp", jkii(int ), (int)188);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl124
            }
lbl119:
            // 2 sources

            case 4: {
                var2_2 /* !! */  = (int)mg.jkil("jkqq", jkii(int ), (int)189);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl137
            }
lbl124:
            // 2 sources

            case 5: {
                var2_2 /* !! */  = (int)mg.jkil("jkqr", jkii(int ), (int)190);
                if (!var3_1) ** GOTO lbl100
                throw null;
            }
            case 6: {
                var2_2 /* !! */  = (int)mg.jkil("jkqs", jkii(int ), (int)191);
                if (!var3_1) ** GOTO lbl114
                throw null;
            }
            case 7: {
                do {
                    var2_2 /* !! */  = (int)mg.jkil("jkqt", jkii(int ), (int)192);
                } while (!var3_1);
                throw null;
            }
lbl137:
            // 2 sources

            case 8: {
                var2_2 /* !! */  = (int)mg.jkil("jkqu", jkii(int ), (int)193);
                if (var3_1) {
                    throw null;
                }
            }
            case 9: {
                var2_2 /* !! */  = (int)mg.jkil("jkqv", jkii(int ), (int)194);
                if (!var3_1) break;
                throw null;
            }
lbl145:
            // 2 sources

            case 10: {
                var2_2 /* !! */  = (int)mg.jkil("jkqw", jkii(int ), (int)195);
                if (var3_1) {
                    throw null;
                }
            }
            case 11: {
                var2_2 /* !! */  = (int)mg.jkil("jkqx", jkii(int ), (int)196);
                if (!var3_1) ** GOTO lbl119
                throw null;
            }
            case 12: 
        }
        var2_2 /* !! */  = (int)mg.jkil("jkqy", jkii(int ), (int)197);
        ** while (!var3_1)
lbl156:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void jlcx() {
        mg.jklg[0] = 6620451110384767123L;
        mg.jklg[1] = -7901505987121947449L;
        mg.jklg[2] = 4340075402701514969L;
        mg.jklg[3] = 840572590473412560L;
        mg.jklg[4] = -3448090218584193090L;
        mg.jklg[5] = 8401750248881435418L;
        mg.jklg[6] = 2028205623425511636L;
        mg.jklg[7] = 4227823147303453045L;
        mg.jklg[8] = -5203567228478547862L;
        mg.jklg[9] = -4216684066632177086L;
        mg.jklg[10] = 8596908058402558174L;
        mg.jklg[11] = 4348742715862016116L;
        mg.jklg[12] = -622926514420303379L;
        mg.jklg[13] = -1922724472429209832L;
        mg.jklg[14] = -287099655557532538L;
        mg.jklg[15] = 7280281297729470074L;
        mg.jklg[16] = -3791704696950041233L;
        mg.jklg[17] = 5087914670505495429L;
        mg.jklg[18] = -6987645677288719555L;
        mg.jklg[19] = 1749184036871657842L;
        mg.jklg[20] = -6295437701702867843L;
        mg.jklg[21] = -7378440046401896478L;
        mg.jklg[22] = -198731520665451825L;
        mg.jklg[23] = 6363251403775835927L;
        mg.jklg[24] = 7670768604581172460L;
        mg.jklg[25] = -8869708156029980062L;
        mg.jklg[26] = 5095875183933864910L;
        mg.jklg[27] = 9044402716795634278L;
        mg.jklg[28] = -8166296806621155106L;
        mg.jklg[29] = 2148460087358849486L;
        mg.jklg[30] = 7006769527618688662L;
        mg.jklg[31] = 1261450306852237651L;
        mg.jklg[32] = 4138393101076263449L;
        mg.jklg[33] = 6377944138923129433L;
        mg.jklg[34] = -2635436603618713413L;
        mg.jklg[35] = -1531423253666403529L;
        mg.jklg[36] = -5656163014423944236L;
        mg.jklg[37] = -2674756871735331133L;
        mg.jklg[38] = -3374274152082058690L;
        mg.jklg[39] = 1047751524494550757L;
        mg.jklg[40] = -1217677338460664463L;
        mg.jklg[41] = 4739262487297961837L;
        mg.jklg[42] = 1853761524773524379L;
        mg.jklg[43] = -6663172621991931072L;
        mg.jklg[44] = -1754746545493088414L;
        mg.jklg[45] = 1583522136547104998L;
        mg.jklg[46] = -89213306142356042L;
        mg.jklg[47] = 3044903724361978284L;
        mg.jklg[48] = -1572720254507976887L;
        mg.jklg[49] = 984988428364075625L;
        mg.jklg[50] = -4982196109780828744L;
        mg.jklg[51] = 1354009341925549409L;
        mg.jklg[52] = 2034879572149930290L;
        mg.jklg[53] = -4141635120450907882L;
        mg.jklg[54] = 8138712464831364514L;
        mg.jklg[55] = 7956022012695594392L;
        mg.jklg[56] = -4484074846438433610L;
        mg.jklg[57] = -6389741515574664113L;
        mg.jklg[58] = 170252190934799909L;
        mg.jklg[59] = -6703259795531520295L;
        mg.jklg[60] = -1593022224827669914L;
        mg.jklg[61] = 2593941268664993676L;
        mg.jklg[62] = -3652432264581944038L;
        mg.jklg[63] = -7856821515466538520L;
        mg.jklg[64] = -2548868251984654767L;
        mg.jklg[65] = 5412544712064008080L;
        mg.jklg[66] = -3639257084707758681L;
        mg.jklg[67] = -1665258548121229249L;
        mg.jklg[68] = -8953096453485718695L;
        mg.jklg[69] = -8629597140678728924L;
        mg.jklg[70] = -3842296856668875957L;
        mg.jklg[71] = -989957576154332350L;
        mg.jklg[72] = -7591912797427888042L;
        mg.jklg[73] = -5194458725725345912L;
        mg.jklg[74] = 4501393065879315987L;
        mg.jklg[75] = -2732620729489913391L;
        mg.jklg[76] = 6016247907425338036L;
        mg.jklg[77] = -756709382492427255L;
        mg.jklg[78] = 2541036553438975163L;
        mg.jklg[79] = -4927237504338416618L;
        mg.jklg[80] = -5245465266941912094L;
        mg.jklg[81] = 1751311798548266240L;
        mg.jklg[82] = 8380285097055881255L;
        mg.jklg[83] = 1782338113497534946L;
    }
}

