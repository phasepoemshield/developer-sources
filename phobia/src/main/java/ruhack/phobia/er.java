/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1268
 *  net.minecraft.class_1753
 *  net.minecraft.class_2338
 *  net.minecraft.class_2350
 *  net.minecraft.class_2596
 *  net.minecraft.class_2846
 *  net.minecraft.class_2846$class_2847
 *  net.minecraft.class_2886
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.minecraft.class_1268;
import net.minecraft.class_1753;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2596;
import net.minecraft.class_2846;
import net.minecraft.class_2886;
import ruhack.phobia.aw;
import ruhack.phobia.df;
import ruhack.phobia.ds;
import ruhack.phobia.du;
import ruhack.phobia.jx;
import ruhack.phobia.kg;

public class er
extends ds {
    public static final boolean c;
    private static long[] gl;
    private static int[] fy;
    private final kg delay;
    private static long[] gk;
    public static final int b;
    private static int[] fx;
    public static final boolean a;
    static final long f = 6470955458171765859L;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean canShoot() {
        block89: {
            block88: {
                v0 /* !! */  = er.f;
                if (true) ** GOTO lbl5
                block57: while (true) {
                    v0 /* !! */  = (long)(v1 - er.fz("kk", gj(int ), (int)27));
lbl5:
                    // 2 sources

                    switch ((int)v0 /* !! */ ) {
                        case -1237325050: {
                            v1 = er.fz("kl", gj(int ), (int)28);
                            continue block57;
                        }
                        case 1324814250: {
                            v1 = er.fz("km", gj(int ), (int)29);
                            continue block57;
                        }
                        case 1639187555: {
                            break block57;
                        }
                    }
                    break;
                }
                var3_1 = er.c;
                while (true) {
                    if ((v2 /* !! */  = (cfr_temp_0 = er.f - er.fz("kn", gj(int ), (int)30)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v2 /* !! */  == er.fz("ko", gd(int ), (int)46)) break;
                    v2 /* !! */  = (long)er.fz("kp", gd(int ), (int)47);
                }
                var2_2 /* !! */  = er.b;
                v3 /* !! */  = er.f;
                if (true) ** GOTO lbl25
                block59: while (true) {
                    v3 /* !! */  = (long)(v4 - er.fz("kq", gj(int ), (int)31));
lbl25:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1890800994: {
                            v4 = er.fz("kr", gj(int ), (int)32);
                            continue block59;
                        }
                        case 1621819156: {
                            v4 = er.fz("ks", gj(int ), (int)33);
                            continue block59;
                        }
                        case 1639187555: {
                            break block59;
                        }
                        case 2114297840: {
                            v4 = er.fz("kt", gj(int ), (int)34);
                            continue block59;
                        }
                    }
                    break;
                }
                var1_3 = er.a;
                if (var3_1) {
                    throw null;
lbl40:
                    // 8 sources

                    return (boolean)er.fz("ku", gd(int ), (int)48);
                }
                if (var1_3 || var1_3) ** GOTO lbl40
                v5 /* !! */  = er.f;
                if (true) ** GOTO lbl47
                block61: while (true) {
                    v5 /* !! */  = (long)(er.fz("kw", gj(int ), (int)36) - er.fz("kv", gj(int ), (int)35));
lbl47:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case 1232149272: {
                            continue block61;
                        }
                        case 1639187555: {
                            break block61;
                        }
                    }
                    break;
                }
                v6 /* !! */  = er.f;
                if (true) ** GOTO lbl56
                block62: while (true) {
                    v6 /* !! */  = (long)(er.fz("ky", gj(int ), (int)38) - er.fz("kx", gj(int ), (int)37));
lbl56:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1040786375: {
                            continue block62;
                        }
                        case 1639187555: {
                            break block62;
                        }
                    }
                    break;
                }
                v7 = er.mc.field_1724;
                v8 /* !! */  = er.f;
                if (true) ** GOTO lbl66
                block63: while (true) {
                    v8 /* !! */  = (long)(v9 - er.fz("kz", gj(int ), (int)39));
lbl66:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -1417660344: {
                            v9 = er.fz("la", gj(int ), (int)40);
                            continue block63;
                        }
                        case -459970012: {
                            v9 = er.fz("lb", gj(int ), (int)41);
                            continue block63;
                        }
                        case 1639187555: {
                            break block63;
                        }
                    }
                    break;
                }
                v10 = v7.method_6047();
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_1 = er.f - er.fz("lc", gj(int ), (int)42)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v11 /* !! */  == er.fz("ld", gd(int ), (int)49)) break;
                    v11 /* !! */  = (long)er.fz("le", gd(int ), (int)50);
                }
                if (v10.method_7909() instanceof class_1753) break block88;
                if (var1_3) ** GOTO lbl40
                return (boolean)er.fz("lf", gd(int ), (int)51);
            }
            if (var1_3 || var1_3) ** GOTO lbl40
            v12 /* !! */  = er.f;
            if (true) ** GOTO lbl90
            block65: while (true) {
                v12 /* !! */  = (long)(v13 - er.fz("lg", gj(int ), (int)43));
lbl90:
                // 2 sources

                switch ((int)v12 /* !! */ ) {
                    case -29730633: {
                        v13 = er.fz("lh", gj(int ), (int)44);
                        continue block65;
                    }
                    case 646954777: {
                        v13 = er.fz("li", gj(int ), (int)45);
                        continue block65;
                    }
                    case 794002425: {
                        v13 = er.fz("lj", gj(int ), (int)46);
                        continue block65;
                    }
                    case 1639187555: {
                        break block65;
                    }
                }
                break;
            }
            while (true) {
                if ((v14 /* !! */  = (cfr_temp_2 = er.f - er.fz("lk", gj(int ), (int)47)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v14 /* !! */  == er.fz("ll", gd(int ), (int)52)) break;
                v14 /* !! */  = (long)er.fz("lm", gd(int ), (int)53);
            }
            v15 = er.mc.field_1724;
            while (true) {
                if ((v16 /* !! */  = (cfr_temp_3 = er.f - er.fz("ln", gj(int ), (int)48)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v16 /* !! */  == er.fz("lo", gd(int ), (int)54)) break;
                v16 /* !! */  = (long)er.fz("lp", gd(int ), (int)55);
            }
            if (v15.method_6115()) break block89;
            if (var1_3) ** GOTO lbl40
            return (boolean)er.fz("lq", gd(int ), (int)56);
        }
        if (var1_3) ** GOTO lbl40
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl40
                v17 /* !! */  = er.f;
                if (true) ** GOTO lbl126
                block68: while (true) {
                    v17 /* !! */  = (long)(v18 - er.fz("lr", gj(int ), (int)49));
lbl126:
                    // 2 sources

                    switch ((int)v17 /* !! */ ) {
                        case 117816553: {
                            v18 = er.fz("ls", gj(int ), (int)50);
                            continue block68;
                        }
                        case 327940156: {
                            v18 = er.fz("lt", gj(int ), (int)51);
                            continue block68;
                        }
                        case 1639187555: {
                            break block68;
                        }
                    }
                    break;
                }
                v19 /* !! */  = er.f;
                if (true) ** GOTO lbl139
                block69: while (true) {
                    v19 /* !! */  = (long)(v20 - er.fz("lu", gj(int ), (int)52));
lbl139:
                    // 2 sources

                    switch ((int)v19 /* !! */ ) {
                        case -2097235342: {
                            v20 = er.fz("lv", gj(int ), (int)53);
                            continue block69;
                        }
                        case -768441481: {
                            v20 = er.fz("lw", gj(int ), (int)54);
                            continue block69;
                        }
                        case 1639187555: {
                            break block69;
                        }
                    }
                    break;
                }
                v21 = er.mc.field_1724;
                while (true) {
                    if ((v22 /* !! */  = (cfr_temp_4 = er.f - er.fz("lx", gj(int ), (int)55)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v22 /* !! */  == er.fz("ly", gd(int ), (int)57)) break;
                    v22 /* !! */  = (long)er.fz("lz", gd(int ), (int)58);
                }
                v23 = v21.method_6048();
                while (true) {
                    if ((v24 /* !! */  = (cfr_temp_5 = er.f - er.fz("ma", gj(int ), (int)56)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v24 /* !! */  == er.fz("mb", gd(int ), (int)59)) break;
                    v24 /* !! */  = (long)er.fz("mc", gd(int ), (int)60);
                }
                while (true) {
                    if ((v25 /* !! */  = (cfr_temp_6 = er.f - er.fz("md", gj(int ), (int)57)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v25 /* !! */  == er.fz("me", gd(int ), (int)61)) break;
                    v25 /* !! */  = (long)er.fz("mf", gd(int ), (int)62);
                }
                if (!(v23 >= this.delay.getValue())) ** GOTO lbl171
                if (var1_3) ** GOTO lbl40
                v26 = er.fz("mg", gd(int ), (int)63);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl174
lbl171:
                // 1 sources

                if (!var1_3 && !var1_3) ** break;
                ** continue;
                v26 = er.fz("mi", gd(int ), (int)64);
lbl174:
                // 2 sources

                return (boolean)v26;
            }
lbl175:
            // 3 sources

            case 0: {
                var2_2 /* !! */  = (int)er.fz("mj", gd(int ), (int)65);
                if (var3_1) {
                    throw null;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)er.fz("mm", gd(int ), (int)66);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl211
            }
lbl184:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)er.fz("mu", gd(int ), (int)67);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl216
            }
            case 3: {
                var2_2 /* !! */  = (int)er.fz("nb", gd(int ), (int)68);
                if (var3_1) {
                    throw null;
                }
            }
            case 4: {
                var2_2 /* !! */  = (int)er.fz("nh", gd(int ), (int)69);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl207
            }
lbl198:
            // 3 sources

            case 5: {
                var2_2 /* !! */  = (int)er.fz("nj", gd(int ), (int)70);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl234
            }
            case 6: {
                var2_2 /* !! */  = (int)er.fz("nm", gd(int ), (int)71);
                if (!var3_1) ** GOTO lbl198
                throw null;
            }
lbl207:
            // 2 sources

            case 7: {
                var2_2 /* !! */  = (int)er.fz("no", gd(int ), (int)72);
                if (!var3_1) ** GOTO lbl175
                throw null;
            }
lbl211:
            // 2 sources

            case 8: {
                var2_2 /* !! */  = (int)er.fz("np", gd(int ), (int)73);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl221
            }
lbl216:
            // 2 sources

            case 9: {
                var2_2 /* !! */  = (int)er.fz("nq", gd(int ), (int)74);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl234
            }
lbl221:
            // 2 sources

            case 10: {
                var2_2 /* !! */  = (int)er.fz("nr", gd(int ), (int)75);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl230
            }
            case 11: {
                var2_2 /* !! */  = (int)er.fz("ns", gd(int ), (int)76);
                if (!var3_1) ** GOTO lbl198
                throw null;
            }
lbl230:
            // 2 sources

            case 12: {
                var2_2 /* !! */  = (int)er.fz("nt", gd(int ), (int)77);
                if (!var3_1) ** GOTO lbl175
                throw null;
            }
lbl234:
            // 3 sources

            case 13: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)er.fz("nu", gd(int ), (int)78);
                    if (!var3_1) ** GOTO lbl184
                    throw null;
                }
            }
            case 14: 
        }
        var2_2 /* !! */  = (int)er.fz("nv", gd(int ), (int)79);
        ** while (!var3_1)
lbl242:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void uf() {
        er.fx[100] = -105015495;
        er.fx[101] = 952248306;
        er.fx[102] = 1836577367;
        er.fx[103] = -1213903370;
        er.fx[104] = -1828877605;
        er.fx[105] = -360345578;
        er.fx[106] = -1031702951;
        er.fx[107] = -203067600;
        er.fx[108] = -1962316162;
        er.fx[109] = 992563124;
        er.fx[110] = 1705675762;
        er.fx[111] = -1443649555;
        er.fx[112] = 672297406;
        er.fx[113] = -934023913;
        er.fx[114] = 1515283377;
        er.fx[115] = 1279469153;
        er.fx[116] = 636811310;
        er.fx[117] = 857877649;
        er.fx[118] = 1954682466;
    }

    private static /* synthetic */ void uc() {
        er.fx[0] = -588299264;
        er.fx[1] = 1353603346;
        er.fx[2] = -1159746317;
        er.fx[3] = -2125796152;
        er.fx[4] = -424935464;
        er.fx[5] = -1609829541;
        er.fx[6] = -1955656272;
        er.fx[7] = -1729389958;
        er.fx[8] = 958498945;
        er.fx[9] = -564563207;
        er.fx[10] = 707236678;
        er.fx[11] = -785576734;
        er.fx[12] = 248260393;
        er.fx[13] = -411693192;
        er.fx[14] = 1262536938;
        er.fx[15] = 931951202;
        er.fx[16] = 1327167816;
        er.fx[17] = -1495641463;
        er.fx[18] = 1959917936;
        er.fx[19] = -1392489953;
        er.fx[20] = -1739800843;
        er.fx[21] = 1665342991;
        er.fx[22] = 969849938;
        er.fx[23] = -4818490;
        er.fx[24] = -614391842;
        er.fx[25] = -836594298;
        er.fx[26] = -1583714485;
        er.fx[27] = -715064060;
        er.fx[28] = 632987219;
        er.fx[29] = -1681508696;
        er.fx[30] = 923209794;
        er.fx[31] = -72653684;
        er.fx[32] = 1166906041;
        er.fx[33] = -859420432;
        er.fx[34] = -1111428945;
        er.fx[35] = 779908506;
        er.fx[36] = 1603882165;
        er.fx[37] = 634195505;
        er.fx[38] = 2010037311;
        er.fx[39] = 1703934301;
        er.fx[40] = 249211568;
        er.fx[41] = 2096803363;
        er.fx[42] = 329171775;
        er.fx[43] = -827536257;
        er.fx[44] = 748301202;
        er.fx[45] = 372617202;
        er.fx[46] = -78314280;
        er.fx[47] = 947249281;
        er.fx[48] = 917444609;
        er.fx[49] = -213834410;
        er.fx[50] = -1193265803;
        er.fx[51] = 1802190692;
        er.fx[52] = 738240132;
        er.fx[53] = -1983894405;
        er.fx[54] = -1941798605;
        er.fx[55] = -1544270933;
        er.fx[56] = 1099580434;
        er.fx[57] = 579025786;
        er.fx[58] = -165821191;
        er.fx[59] = 206058436;
        er.fx[60] = -821667146;
        er.fx[61] = -606469095;
        er.fx[62] = -303667777;
        er.fx[63] = 1310358708;
        er.fx[64] = 768771887;
        er.fx[65] = 145285415;
        er.fx[66] = -1698081889;
        er.fx[67] = 340778229;
        er.fx[68] = -989622946;
        er.fx[69] = -1712454337;
        er.fx[70] = -772361554;
        er.fx[71] = 1666019173;
        er.fx[72] = -809188774;
        er.fx[73] = -2093089082;
        er.fx[74] = -1407467863;
        er.fx[75] = 907190696;
        er.fx[76] = -264485533;
        er.fx[77] = 770742464;
        er.fx[78] = -382172717;
        er.fx[79] = 495371544;
        er.fx[80] = 1328022103;
        er.fx[81] = -2022693691;
        er.fx[82] = 1446978762;
        er.fx[83] = -1579763924;
        er.fx[84] = -1468463466;
        er.fx[85] = 837853937;
        er.fx[86] = -246196419;
        er.fx[87] = -355545073;
        er.fx[88] = 1442884599;
        er.fx[89] = 962930553;
        er.fx[90] = 951327427;
        er.fx[91] = -1625573621;
        er.fx[92] = 755603219;
        er.fx[93] = 99381926;
        er.fx[94] = -1967968049;
        er.fx[95] = 798054859;
        er.fx[96] = 1975453749;
        er.fx[97] = 1024642261;
        er.fx[98] = -119361048;
        er.fx[99] = -1975549338;
    }

    private static /* synthetic */ void uh() {
        er.fy[0] = -1664138240;
        er.fy[1] = 279090655;
        er.fy[2] = -92295949;
        er.fy[3] = -2125796152;
        er.fy[4] = -424935463;
        er.fy[5] = -1609829537;
        er.fy[6] = -1955656271;
        er.fy[7] = -1729389959;
        er.fy[8] = 958498944;
        er.fy[9] = -1806023015;
        er.fy[10] = 707236679;
        er.fy[11] = 1631698101;
        er.fy[12] = 248260392;
        er.fy[13] = 1716029223;
        er.fy[14] = 1262536939;
        er.fy[15] = -443098011;
        er.fy[16] = 1327167817;
        er.fy[17] = 736339143;
        er.fy[18] = 1959917937;
        er.fy[19] = -2046863460;
        er.fy[20] = -1739800844;
        er.fy[21] = -886693197;
        er.fy[22] = 969849939;
        er.fy[23] = 1914626804;
        er.fy[24] = -614391856;
        er.fy[25] = -836594299;
        er.fy[26] = -1583714469;
        er.fy[27] = -715064054;
        er.fy[28] = 632987207;
        er.fy[29] = -1681508704;
        er.fy[30] = 923209799;
        er.fy[31] = -72653687;
        er.fy[32] = 1166906027;
        er.fy[33] = -859420445;
        er.fy[34] = -1111428932;
        er.fy[35] = 779908504;
        er.fy[36] = 1603882172;
        er.fy[37] = 634195513;
        er.fy[38] = 2010037307;
        er.fy[39] = 1703934296;
        er.fy[40] = 249211557;
        er.fy[41] = 2096803368;
        er.fy[42] = 329171755;
        er.fy[43] = -827536275;
        er.fy[44] = 748301185;
        er.fy[45] = 372617213;
        er.fy[46] = -78314279;
        er.fy[47] = 1574722537;
        er.fy[48] = 917444608;
        er.fy[49] = -213834409;
        er.fy[50] = 850855836;
        er.fy[51] = 1802190692;
        er.fy[52] = 738240133;
        er.fy[53] = 1556265309;
        er.fy[54] = -1941798606;
        er.fy[55] = -1402775585;
        er.fy[56] = 1099580434;
        er.fy[57] = 579025787;
        er.fy[58] = -1819793873;
        er.fy[59] = 206058437;
        er.fy[60] = -1110633534;
        er.fy[61] = -606469096;
        er.fy[62] = 159506260;
        er.fy[63] = 1310358709;
        er.fy[64] = 768771887;
        er.fy[65] = 145285420;
        er.fy[66] = -1698081903;
        er.fy[67] = 340778227;
        er.fy[68] = -989622954;
        er.fy[69] = -1712454346;
        er.fy[70] = -772361554;
        er.fy[71] = 1666019173;
        er.fy[72] = -809188775;
        er.fy[73] = -2093089086;
        er.fy[74] = -1407467860;
        er.fy[75] = 907190701;
        er.fy[76] = -264485530;
        er.fy[77] = 770742469;
        er.fy[78] = -382172707;
        er.fy[79] = 495371544;
        er.fy[80] = 1328022102;
        er.fy[81] = -1324057092;
        er.fy[82] = 1446978763;
        er.fy[83] = 1744119098;
        er.fy[84] = -1468463465;
        er.fy[85] = -1705752129;
        er.fy[86] = -246196420;
        er.fy[87] = -2037808740;
        er.fy[88] = 1442884598;
        er.fy[89] = -78475330;
        er.fy[90] = 951327427;
        er.fy[91] = -1625573622;
        er.fy[92] = 935242081;
        er.fy[93] = 99381927;
        er.fy[94] = 1239743963;
        er.fy[95] = 798054858;
        er.fy[96] = 581947583;
        er.fy[97] = -1024642262;
        er.fy[98] = -658396629;
        er.fy[99] = -1975549337;
    }

    static {
        fx = new int[119];
        fy = new int[119];
        er.uc();
        er.uf();
        er.uh();
        er.uj();
        gk = new long[113];
        gl = new long[113];
        er.uk();
        er.un();
        er.uo();
        er.ur();
    }

    private static /* synthetic */ void uj() {
        er.fy[100] = 1475247515;
        er.fy[101] = 952248310;
        er.fy[102] = 1836577367;
        er.fy[103] = -1213903371;
        er.fy[104] = -1828877607;
        er.fy[105] = -360345578;
        er.fy[106] = -1031702947;
        er.fy[107] = -203067599;
        er.fy[108] = -1962316162;
        er.fy[109] = 992563125;
        er.fy[110] = -1515047239;
        er.fy[111] = -1443649556;
        er.fy[112] = -1445625778;
        er.fy[113] = 934023912;
        er.fy[114] = -1287856158;
        er.fy[115] = 1279469154;
        er.fy[116] = 636811310;
        er.fy[117] = 857877651;
        er.fy[118] = 1954682466;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public er() {
        var2_1 /* !! */  = er.b;
        super("BowSpammer", "Bow Spammer", du.MISC);
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.delay = new kg("\u0417\u0430\u0434\u0435\u0440\u0436\u043a\u0430", "\u0417\u0430\u0434\u0435\u0440\u0436\u043a\u0430 \u043c\u0435\u0436\u0434\u0443 \u0432\u044b\u0441\u0442\u0440\u0435\u043b\u0430\u043c\u0438", (float)er.fz("ga", fw(int ), (int)0)).range((float)er.fz("gb", fw(int ), (int)1), (float)er.fz("gc", fw(int ), (int)2));
                this.settings(new jx[]{this.delay});
                return;
            }
            case 0: {
                while (true) {
                    var2_1 /* !! */  = (int)er.fz("ge", gd(int ), (int)3);
                }
            }
            case 1: {
                while (true) {
                    var2_1 /* !! */  = (int)er.fz("gf", gd(int ), (int)4);
                }
            }
lbl17:
            // 2 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)er.fz("gg", gd(int ), (int)5);
                    continue;
                    break;
                }
            }
            case 3: {
                var2_1 /* !! */  = (int)er.fz("gh", gd(int ), (int)6);
                ** GOTO lbl17
            }
            case 4: 
        }
        var2_1 /* !! */  = (int)er.fz("gi", gd(int ), (int)7);
        ** while (true)
    }

    private static /* synthetic */ void un() {
        er.gk[100] = 7729710702243206681L;
        er.gk[101] = -7235482794060410931L;
        er.gk[102] = 5767874876974725013L;
        er.gk[103] = -5849842963866892119L;
        er.gk[104] = -2058766599452055304L;
        er.gk[105] = -6442663899584077203L;
        er.gk[106] = 6992648109941318974L;
        er.gk[107] = -6276780812589079796L;
        er.gk[108] = -2291808866705770387L;
        er.gk[109] = -8070617772501825637L;
        er.gk[110] = -299504820272304081L;
        er.gk[111] = 7230506505830010057L;
        er.gk[112] = -2206742069663680286L;
    }

    private static /* synthetic */ long gj(int n2) {
        return gk[n2] ^ gl[n2];
    }

    private static /* synthetic */ float fw(int n2) {
        return Float.intBitsToFloat(fx[n2] ^ fy[n2]);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onTick(df var1_1) {
        block93: {
            block92: {
                block91: {
                    while (true) {
                        if ((v0 /* !! */  = (cfr_temp_0 = er.f - er.fz("gm", gj(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                        if (v0 /* !! */  == er.fz("gn", gd(int ), (int)8)) break;
                        v0 /* !! */  = (long)er.fz("go", gd(int ), (int)9);
                    }
                    var4_2 = er.c;
                    v1 /* !! */  = er.f;
                    if (true) ** GOTO lbl11
                    block56: while (true) {
                        v1 /* !! */  = (long)(v2 - er.fz("gp", gj(int ), (int)1));
lbl11:
                        // 2 sources

                        switch ((int)v1 /* !! */ ) {
                            case 852931755: {
                                v2 = er.fz("gq", gj(int ), (int)2);
                                continue block56;
                            }
                            case 1499419967: {
                                v2 = er.fz("gr", gj(int ), (int)3);
                                continue block56;
                            }
                            case 1639187555: {
                                break block56;
                            }
                        }
                        break;
                    }
                    var3_3 /* !! */  = er.b;
                    while (true) {
                        if ((v3 /* !! */  = (cfr_temp_1 = er.f - er.fz("gs", gj(int ), (int)4)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                        if (v3 /* !! */  == er.fz("gt", gd(int ), (int)10)) break;
                        v3 /* !! */  = (long)er.fz("gu", gd(int ), (int)11);
                    }
                    var2_4 = er.a;
                    if (var4_2) {
                        throw null;
lbl29:
                        // 12 sources

                        return;
                    }
                    if (var2_4 || var2_4) ** GOTO lbl29
                    while (true) {
                        if ((v4 /* !! */  = (cfr_temp_2 = er.f - er.fz("gv", gj(int ), (int)5)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                        if (v4 /* !! */  == er.fz("gw", gd(int ), (int)12)) break;
                        v4 /* !! */  = (long)er.fz("gx", gd(int ), (int)13);
                    }
                    v5 /* !! */  = er.f;
                    if (true) ** GOTO lbl41
                    block60: while (true) {
                        v5 /* !! */  = (long)(er.fz("gz", gj(int ), (int)7) - er.fz("gy", gj(int ), (int)6));
lbl41:
                        // 2 sources

                        switch ((int)v5 /* !! */ ) {
                            case -1760895156: {
                                continue block60;
                            }
                            case 1639187555: {
                                break block60;
                            }
                        }
                        break;
                    }
                    if (er.mc.field_1724 == null) break block91;
                    if (var2_4) ** GOTO lbl29
                    v6 /* !! */  = er.f;
                    if (true) ** GOTO lbl52
                    block61: while (true) {
                        v6 /* !! */  = (long)(v7 - er.fz("ha", gj(int ), (int)8));
lbl52:
                        // 2 sources

                        switch ((int)v6 /* !! */ ) {
                            case 118299697: {
                                v7 = er.fz("hb", gj(int ), (int)9);
                                continue block61;
                            }
                            case 868056278: {
                                v7 = er.fz("hc", gj(int ), (int)10);
                                continue block61;
                            }
                            case 1469739747: {
                                v7 = er.fz("hd", gj(int ), (int)11);
                                continue block61;
                            }
                            case 1639187555: {
                                break block61;
                            }
                        }
                        break;
                    }
                    while (true) {
                        if ((v8 /* !! */  = (cfr_temp_3 = er.f - er.fz("he", gj(int ), (int)12)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                        if (v8 /* !! */  == er.fz("hf", gd(int ), (int)14)) break;
                        v8 /* !! */  = (long)er.fz("hg", gd(int ), (int)15);
                    }
                    if (er.mc.field_1687 != null) break block92;
                    if (var2_4) ** GOTO lbl29
                }
                if (var2_4 || var2_4) ** GOTO lbl29
                return;
            }
            if (var2_4 || var2_4) ** GOTO lbl29
            while (true) {
                if ((v9 /* !! */  = (cfr_temp_4 = er.f - er.fz("hh", gj(int ), (int)13)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                if (v9 /* !! */  == er.fz("hi", gd(int ), (int)16)) break;
                v9 /* !! */  = (long)er.fz("hj", gd(int ), (int)17);
            }
            while (true) {
                if ((v10 /* !! */  = (cfr_temp_5 = er.f - er.fz("hk", gj(int ), (int)14)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                if (v10 /* !! */  == er.fz("hl", gd(int ), (int)18)) break;
                v10 /* !! */  = (long)er.fz("hm", gd(int ), (int)19);
            }
            if (er.mc.method_1562() != null) break block93;
            if (var2_4) ** GOTO lbl29
            return;
        }
        if (var2_4) ** GOTO lbl29
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** GOTO lbl29
                v11 /* !! */  = er.f;
                if (true) ** GOTO lbl99
                block65: while (true) {
                    v11 /* !! */  = (long)(v12 - er.fz("hn", gj(int ), (int)15));
lbl99:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -1149357481: {
                            v12 = er.fz("ho", gj(int ), (int)16);
                            continue block65;
                        }
                        case -968922559: {
                            v12 = er.fz("hp", gj(int ), (int)17);
                            continue block65;
                        }
                        case -781221926: {
                            v12 = er.fz("hq", gj(int ), (int)18);
                            continue block65;
                        }
                        case 1639187555: {
                            break block65;
                        }
                    }
                    break;
                }
                if (this.canShoot()) ** GOTO lbl114
                if (var2_4) ** GOTO lbl29
                return;
lbl114:
                // 1 sources

                if (var2_4 || var2_4) ** GOTO lbl29
                while (true) {
                    if ((v13 /* !! */  = (cfr_temp_6 = er.f - er.fz("hr", gj(int ), (int)19)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v13 /* !! */  == er.fz("hs", gd(int ), (int)20)) break;
                    v13 /* !! */  = (long)er.fz("hw", gd(int ), (int)21);
                }
                this.sendShootPackets();
                if (var2_4 || var2_4) ** GOTO lbl29
                v14 /* !! */  = er.f;
                if (true) ** GOTO lbl126
                block67: while (true) {
                    v14 /* !! */  = (long)(er.fz("ic", gj(int ), (int)21) - er.fz("ia", gj(int ), (int)20));
lbl126:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case -391289920: {
                            continue block67;
                        }
                        case 1639187555: {
                            break block67;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v15 /* !! */  = (cfr_temp_7 = er.f - er.fz("ih", gj(int ), (int)22)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v15 /* !! */  == er.fz("ik", gd(int ), (int)22)) break;
                    v15 /* !! */  = (long)er.fz("io", gd(int ), (int)23);
                }
                v16 = er.mc.field_1724;
                v17 /* !! */  = er.f;
                if (true) ** GOTO lbl141
                block69: while (true) {
                    v17 /* !! */  = (long)(v18 - er.fz("ir", gj(int ), (int)23));
lbl141:
                    // 2 sources

                    switch ((int)v17 /* !! */ ) {
                        case -703500763: {
                            v18 = er.fz("iu", gj(int ), (int)24);
                            continue block69;
                        }
                        case 1097557460: {
                            v18 = er.fz("ix", gj(int ), (int)25);
                            continue block69;
                        }
                        case 1428228724: {
                            v18 = er.fz("iz", gj(int ), (int)26);
                            continue block69;
                        }
                        case 1639187555: {
                            break block69;
                        }
                    }
                    break;
                }
                v16.method_6075();
                if (!var2_4 && !var2_4) ** break;
                ** continue;
                return;
            }
            case 0: {
                var3_3 /* !! */  = (int)er.fz("jc", gd(int ), (int)24);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl180
            }
lbl162:
            // 3 sources

            case 1: {
                var3_3 /* !! */  = (int)er.fz("jg", gd(int ), (int)25);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl232
            }
            case 2: {
                var3_3 /* !! */  = (int)er.fz("jj", gd(int ), (int)26);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl185
            }
            case 3: {
                var3_3 /* !! */  = (int)er.fz("jm", gd(int ), (int)27);
                if (!var4_2) ** GOTO lbl162
                throw null;
            }
lbl176:
            // 2 sources

            case 4: {
                var3_3 /* !! */  = (int)er.fz("jp", gd(int ), (int)28);
                if (var4_2) {
                    throw null;
                }
            }
lbl180:
            // 4 sources

            case 5: {
                var3_3 /* !! */  = (int)er.fz("js", gd(int ), (int)29);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl228
            }
lbl185:
            // 2 sources

            case 6: {
                var3_3 /* !! */  = (int)er.fz("ju", gd(int ), (int)30);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl228
            }
lbl190:
            // 2 sources

            case 7: {
                var3_3 /* !! */  = (int)er.fz("jv", gd(int ), (int)31);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl236
            }
lbl195:
            // 2 sources

            case 8: {
                var3_3 /* !! */  = (int)er.fz("jw", gd(int ), (int)32);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl224
            }
            case 9: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)er.fz("jx", gd(int ), (int)33);
                    if (!var4_2) ** GOTO lbl195
                    throw null;
                }
            }
            case 10: {
                var3_3 /* !! */  = (int)er.fz("jy", gd(int ), (int)34);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl249
            }
            case 11: {
                var3_3 /* !! */  = (int)er.fz("jz", gd(int ), (int)35);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl220
            }
lbl215:
            // 2 sources

            case 12: {
                var3_3 /* !! */  = (int)er.fz("ka", gd(int ), (int)36);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl240
            }
lbl220:
            // 2 sources

            case 13: {
                var3_3 /* !! */  = (int)er.fz("kb", gd(int ), (int)37);
                if (!var4_2) break;
                throw null;
            }
lbl224:
            // 3 sources

            case 14: {
                var3_3 /* !! */  = (int)er.fz("kc", gd(int ), (int)38);
                if (!var4_2) ** GOTO lbl162
                throw null;
            }
lbl228:
            // 3 sources

            case 15: {
                var3_3 /* !! */  = (int)er.fz("kd", gd(int ), (int)39);
                if (!var4_2) ** GOTO lbl190
                throw null;
            }
lbl232:
            // 3 sources

            case 16: {
                var3_3 /* !! */  = (int)er.fz("ke", gd(int ), (int)40);
                if (!var4_2) ** GOTO lbl215
                throw null;
            }
lbl236:
            // 2 sources

            case 17: {
                var3_3 /* !! */  = (int)er.fz("kf", gd(int ), (int)41);
                if (!var4_2) ** GOTO lbl176
                throw null;
            }
lbl240:
            // 2 sources

            case 18: {
                var3_3 /* !! */  = (int)er.fz("kg", gd(int ), (int)42);
                if (!var4_2) ** GOTO lbl224
                throw null;
            }
            case 19: {
                do {
                    var3_3 /* !! */  = (int)er.fz("kh", gd(int ), (int)43);
                } while (!var4_2);
                throw null;
            }
lbl249:
            // 2 sources

            case 20: {
                var3_3 /* !! */  = (int)er.fz("ki", gd(int ), (int)44);
                if (!var4_2) ** GOTO lbl232
                throw null;
            }
            case 21: 
        }
        var3_3 /* !! */  = (int)er.fz("kj", gd(int ), (int)45);
        ** while (!var4_2)
lbl256:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void uo() {
        er.gl[0] = 9064331250315670051L;
        er.gl[1] = 4411375054559075959L;
        er.gl[2] = -3970397453887603469L;
        er.gl[3] = 7176890039990369313L;
        er.gl[4] = 8254437475180398222L;
        er.gl[5] = 1730144764666018335L;
        er.gl[6] = -7493217158403088450L;
        er.gl[7] = 8842887510514328738L;
        er.gl[8] = -4861937035457373219L;
        er.gl[9] = -2929340083284171113L;
        er.gl[10] = 7135467030142948725L;
        er.gl[11] = -1859123582847559144L;
        er.gl[12] = -357631103993394303L;
        er.gl[13] = 2225480550131322287L;
        er.gl[14] = -1804030120790143915L;
        er.gl[15] = 4191047479422514081L;
        er.gl[16] = 4688485405693212339L;
        er.gl[17] = 1862817440920503828L;
        er.gl[18] = -8411077749282749735L;
        er.gl[19] = 1571706177880042033L;
        er.gl[20] = 5808859841499062129L;
        er.gl[21] = -6431754241473699122L;
        er.gl[22] = -1752246543925555591L;
        er.gl[23] = 1131455145375459470L;
        er.gl[24] = 7989572121337955521L;
        er.gl[25] = -5871669507648189880L;
        er.gl[26] = -4203756783215087755L;
        er.gl[27] = 578073728125830749L;
        er.gl[28] = -2528166318464801720L;
        er.gl[29] = -313320603265220066L;
        er.gl[30] = -4680603355897204342L;
        er.gl[31] = -7779756397711787987L;
        er.gl[32] = -445086999372875692L;
        er.gl[33] = 738939248056271283L;
        er.gl[34] = -5093213589310445409L;
        er.gl[35] = 8778411991047676119L;
        er.gl[36] = -5815343055985500071L;
        er.gl[37] = 1220434813319158580L;
        er.gl[38] = -9116640285839155330L;
        er.gl[39] = 6435117928018564602L;
        er.gl[40] = 7019837876314373275L;
        er.gl[41] = -8645356399593264644L;
        er.gl[42] = -2962646475797912142L;
        er.gl[43] = 2274107385850244254L;
        er.gl[44] = 2975112907553692556L;
        er.gl[45] = 1827731733570029555L;
        er.gl[46] = 7749196432941918560L;
        er.gl[47] = 4416476986818951938L;
        er.gl[48] = -1792088644323436118L;
        er.gl[49] = 4033206197261657062L;
        er.gl[50] = 4103731398833975571L;
        er.gl[51] = -1629028052174108021L;
        er.gl[52] = -1016103225062768607L;
        er.gl[53] = 4335789017026021974L;
        er.gl[54] = -212757200943909007L;
        er.gl[55] = 3617664157205017643L;
        er.gl[56] = -8930470196153517761L;
        er.gl[57] = 2983296651910968830L;
        er.gl[58] = -7622622661715775502L;
        er.gl[59] = 2558215730590045714L;
        er.gl[60] = -2804388217419757236L;
        er.gl[61] = 6927122846483990236L;
        er.gl[62] = -1281832269098892933L;
        er.gl[63] = 3329335442545512548L;
        er.gl[64] = -3151541358088940301L;
        er.gl[65] = -5399149369627066765L;
        er.gl[66] = -8340232907972230731L;
        er.gl[67] = 6452931438829754709L;
        er.gl[68] = 6347238258559624575L;
        er.gl[69] = -298276526435329263L;
        er.gl[70] = 4633590032654518827L;
        er.gl[71] = 4938995898435557135L;
        er.gl[72] = -1544928812092031915L;
        er.gl[73] = 3367204587193804697L;
        er.gl[74] = 2546996005500901006L;
        er.gl[75] = -7564133691496682966L;
        er.gl[76] = 8371588859515799013L;
        er.gl[77] = 5006813951651120026L;
        er.gl[78] = -2699130027476351849L;
        er.gl[79] = -337054087554357036L;
        er.gl[80] = 5274400906924191906L;
        er.gl[81] = 5795328585063291479L;
        er.gl[82] = -8387779439558869828L;
        er.gl[83] = -8754060771573317556L;
        er.gl[84] = -1853298236626338682L;
        er.gl[85] = -3481922600202914853L;
        er.gl[86] = -7846765253113036799L;
        er.gl[87] = -7172265795584243271L;
        er.gl[88] = -1776079970652704192L;
        er.gl[89] = -7625548038952947195L;
        er.gl[90] = 8379525572261408607L;
        er.gl[91] = 5305015119228059988L;
        er.gl[92] = 8556775188528398268L;
        er.gl[93] = 2505503610183051205L;
        er.gl[94] = 5697920951881746339L;
        er.gl[95] = -6513251294689053554L;
        er.gl[96] = 2893593480357839968L;
        er.gl[97] = 850059979431437575L;
        er.gl[98] = 6307223515563716126L;
        er.gl[99] = -6801653349396399632L;
    }

    private static /* synthetic */ void ur() {
        er.gl[100] = 7666453764964414939L;
        er.gl[101] = 1934643002529964083L;
        er.gl[102] = 116044817728190986L;
        er.gl[103] = 8784576490269793678L;
        er.gl[104] = 6230980324048413556L;
        er.gl[105] = -2707790902571144139L;
        er.gl[106] = -2141783372999309732L;
        er.gl[107] = 7680147768736746636L;
        er.gl[108] = 6988856971735650129L;
        er.gl[109] = -1803964278754359285L;
        er.gl[110] = -184930304814595086L;
        er.gl[111] = -2724805928633033867L;
        er.gl[112] = -4635454699160366283L;
    }

    private static /* synthetic */ int gd(int n2) {
        return fx[n2] ^ fy[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public kg getDelay() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = er.f - er.fz("tg", gj(int ), (int)107)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == er.fz("ti", gd(int ), (int)109)) break;
            v0 /* !! */  = (long)er.fz("tj", gd(int ), (int)110);
        }
        var3_1 = er.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = er.f - er.fz("tk", gj(int ), (int)108)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == er.fz("tl", gd(int ), (int)111)) break;
            v1 /* !! */  = (long)er.fz("tm", gd(int ), (int)112);
        }
        var2_2 /* !! */  = er.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = er.f - er.fz("tn", gj(int ), (int)109)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == er.fz("to", gd(int ), (int)113)) break;
            v2 /* !! */  = (long)er.fz("tq", gd(int ), (int)114);
        }
        var1_3 = er.a;
        if (var3_1) {
            throw null;
lbl24:
            // 2 sources

            return null;
        }
        if (var1_3) ** GOTO lbl24
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                v3 /* !! */  = er.f;
                if (true) ** GOTO lbl35
                block15: while (true) {
                    v3 /* !! */  = (long)(v4 - er.fz("ts", gj(int ), (int)110));
lbl35:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1026367263: {
                            v4 = er.fz("tu", gj(int ), (int)111);
                            continue block15;
                        }
                        case -802098826: {
                            v4 = er.fz("tv", gj(int ), (int)112);
                            continue block15;
                        }
                        case 1639187555: {
                            break block15;
                        }
                    }
                    break;
                }
                return this.delay;
            }
            case 0: {
                do {
                    var2_2 /* !! */  = (int)er.fz("tx", gd(int ), (int)115);
                } while (!var3_1);
                throw null;
            }
lbl50:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)er.fz("ty", gd(int ), (int)116);
                if (!var3_1) break;
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)er.fz("tz", gd(int ), (int)117);
                if (!var3_1) ** GOTO lbl50
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)er.fz("ua", gd(int ), (int)118);
        } while (!var3_1);
        throw null;
    }

    public static /* synthetic */ CallSite fz(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void sendShootPackets() {
        v0 /* !! */  = er.f;
        if (true) ** GOTO lbl5
        block75: while (true) {
            v0 /* !! */  = (long)(v1 - er.fz("nw", gj(int ), (int)58));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -360137297: {
                    v1 = er.fz("nx", gj(int ), (int)59);
                    continue block75;
                }
                case 1639187555: {
                    break block75;
                }
                case 1993161993: {
                    v1 = er.fz("ny", gj(int ), (int)60);
                    continue block75;
                }
            }
            break;
        }
        var3_1 = er.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = er.f - er.fz("nz", gj(int ), (int)61)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == er.fz("oa", gd(int ), (int)80)) break;
            v2 /* !! */  = (long)er.fz("ob", gd(int ), (int)81);
        }
        var2_2 /* !! */  = er.b;
        v3 /* !! */  = er.f;
        if (true) ** GOTO lbl25
        block77: while (true) {
            v3 /* !! */  = (long)(er.fz("od", gj(int ), (int)63) - er.fz("oc", gj(int ), (int)62));
lbl25:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -507015894: {
                    continue block77;
                }
                case 1639187555: {
                    break block77;
                }
            }
            break;
        }
        var1_3 = er.a;
        if (var3_1) {
            throw null;
lbl33:
            // 3 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl33
        v4 /* !! */  = er.f;
        if (true) ** GOTO lbl40
        block79: while (true) {
            v4 /* !! */  = (long)(er.fz("of", gj(int ), (int)65) - er.fz("oe", gj(int ), (int)64));
lbl40:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case 917075453: {
                    continue block79;
                }
                case 1639187555: {
                    break block79;
                }
            }
            break;
        }
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_1 = er.f - er.fz("og", gj(int ), (int)66)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == er.fz("oh", gd(int ), (int)82)) break;
            v5 /* !! */  = (long)er.fz("oi", gd(int ), (int)83);
        }
        v6 = er.mc.method_1562();
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_2 = er.f - er.fz("oj", gj(int ), (int)67)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v7 /* !! */  == er.fz("ok", gd(int ), (int)84)) break;
            v7 /* !! */  = (long)er.fz("ol", gd(int ), (int)85);
        }
        v8 /* !! */  = er.f;
        if (true) ** GOTO lbl60
        block82: while (true) {
            v8 /* !! */  = (long)(er.fz("on", gj(int ), (int)69) - er.fz("om", gj(int ), (int)68));
lbl60:
            // 2 sources

            switch ((int)v8 /* !! */ ) {
                case -1314325716: {
                    continue block82;
                }
                case 1639187555: {
                    break block82;
                }
            }
            break;
        }
        while (true) {
            if ((v9 /* !! */  = (cfr_temp_3 = er.f - er.fz("oo", gj(int ), (int)70)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v9 /* !! */  == er.fz("op", gd(int ), (int)86)) break;
            v9 /* !! */  = (long)er.fz("oq", gd(int ), (int)87);
        }
        while (true) {
            if ((v10 /* !! */  = (cfr_temp_4 = er.f - er.fz("or", gj(int ), (int)71)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v10 /* !! */  == er.fz("os", gd(int ), (int)88)) break;
            v10 /* !! */  = (long)er.fz("ot", gd(int ), (int)89);
        }
        v11 /* !! */  = er.f;
        if (true) ** GOTO lbl79
        block85: while (true) {
            v11 /* !! */  = (long)(v12 - er.fz("ou", gj(int ), (int)72));
lbl79:
            // 2 sources

            switch ((int)v11 /* !! */ ) {
                case 715094308: {
                    v12 = er.fz("ov", gj(int ), (int)73);
                    continue block85;
                }
                case 758779776: {
                    v12 = er.fz("ow", gj(int ), (int)74);
                    continue block85;
                }
                case 1639187555: {
                    break block85;
                }
            }
            break;
        }
        v13 = new class_2846(class_2846.class_2847.field_12974, class_2338.field_10980, class_2350.field_11033);
        v14 /* !! */  = er.f;
        if (true) ** GOTO lbl93
        block86: while (true) {
            v14 /* !! */  = (long)(v15 - er.fz("ox", gj(int ), (int)75));
lbl93:
            // 2 sources

            switch ((int)v14 /* !! */ ) {
                case -1274587474: {
                    v15 = er.fz("oy", gj(int ), (int)76);
                    continue block86;
                }
                case 1639187555: {
                    break block86;
                }
                case 1777674545: {
                    v15 = er.fz("oz", gj(int ), (int)77);
                    continue block86;
                }
                case 1862889489: {
                    v15 = er.fz("pa", gj(int ), (int)78);
                    continue block86;
                }
            }
            break;
        }
        v6.method_52787((class_2596)v13);
        if (var1_3 || var1_3) ** GOTO lbl33
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v16 /* !! */  = er.f;
                if (true) ** GOTO lbl114
                block87: while (true) {
                    v16 /* !! */  = (long)(v17 - er.fz("pb", gj(int ), (int)79));
lbl114:
                    // 2 sources

                    switch ((int)v16 /* !! */ ) {
                        case 175397217: {
                            v17 = er.fz("pc", gj(int ), (int)80);
                            continue block87;
                        }
                        case 936176525: {
                            v17 = er.fz("pd", gj(int ), (int)81);
                            continue block87;
                        }
                        case 1225273346: {
                            v17 = er.fz("pe", gj(int ), (int)82);
                            continue block87;
                        }
                        case 1639187555: {
                            break block87;
                        }
                    }
                    break;
                }
                v18 /* !! */  = er.f;
                if (true) ** GOTO lbl130
                block88: while (true) {
                    v18 /* !! */  = (long)(v19 - er.fz("pf", gj(int ), (int)83));
lbl130:
                    // 2 sources

                    switch ((int)v18 /* !! */ ) {
                        case -2117781997: {
                            v19 = er.fz("pg", gj(int ), (int)84);
                            continue block88;
                        }
                        case -1265081222: {
                            v19 = er.fz("ph", gj(int ), (int)85);
                            continue block88;
                        }
                        case 1639187555: {
                            break block88;
                        }
                    }
                    break;
                }
                v20 = er.mc.method_1562();
                v21 /* !! */  = er.f;
                if (true) ** GOTO lbl144
                block89: while (true) {
                    v21 /* !! */  = (long)(v22 - er.fz("pi", gj(int ), (int)86));
lbl144:
                    // 2 sources

                    switch ((int)v21 /* !! */ ) {
                        case -2029609657: {
                            v22 = er.fz("pj", gj(int ), (int)87);
                            continue block89;
                        }
                        case -1371903360: {
                            v22 = er.fz("pk", gj(int ), (int)88);
                            continue block89;
                        }
                        case 1639187555: {
                            break block89;
                        }
                    }
                    break;
                }
                v23 /* !! */  = er.f;
                if (true) ** GOTO lbl157
                block90: while (true) {
                    v23 /* !! */  = (long)(v24 - er.fz("pl", gj(int ), (int)89));
lbl157:
                    // 2 sources

                    switch ((int)v23 /* !! */ ) {
                        case 978445236: {
                            v24 = er.fz("pm", gj(int ), (int)90);
                            continue block90;
                        }
                        case 1639187555: {
                            break block90;
                        }
                        case 2020873357: {
                            v24 = er.fz("pn", gj(int ), (int)91);
                            continue block90;
                        }
                    }
                    break;
                }
                v25 = er.fz("po", gd(int ), (int)90);
                while (true) {
                    if ((v26 /* !! */  = (cfr_temp_5 = er.f - er.fz("pq", gj(int ), (int)92)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v26 /* !! */  == er.fz("pw", gd(int ), (int)91)) break;
                    v26 /* !! */  = (long)er.fz("qc", gd(int ), (int)92);
                }
                v27 /* !! */  = er.f;
                if (true) ** GOTO lbl176
                block92: while (true) {
                    v27 /* !! */  = (long)(v28 - er.fz("qg", gj(int ), (int)93));
lbl176:
                    // 2 sources

                    switch ((int)v27 /* !! */ ) {
                        case -1774235: {
                            v28 = er.fz("qj", gj(int ), (int)94);
                            continue block92;
                        }
                        case 90800534: {
                            v28 = er.fz("qn", gj(int ), (int)95);
                            continue block92;
                        }
                        case 1084853607: {
                            v28 = er.fz("qs", gj(int ), (int)96);
                            continue block92;
                        }
                        case 1639187555: {
                            break block92;
                        }
                    }
                    break;
                }
                v29 = er.mc.field_1724;
                v30 /* !! */  = er.f;
                if (true) ** GOTO lbl193
                block93: while (true) {
                    v30 /* !! */  = (long)(er.fz("rr", gj(int ), (int)98) - er.fz("rk", gj(int ), (int)97));
lbl193:
                    // 2 sources

                    switch ((int)v30 /* !! */ ) {
                        case -886759738: {
                            continue block93;
                        }
                        case 1639187555: {
                            break block93;
                        }
                    }
                    break;
                }
                v31 = v29.method_36454();
                v32 /* !! */  = er.f;
                if (true) ** GOTO lbl203
                block94: while (true) {
                    v32 /* !! */  = (long)(v33 - er.fz("ry", gj(int ), (int)99));
lbl203:
                    // 2 sources

                    switch ((int)v32 /* !! */ ) {
                        case -1870277502: {
                            v33 = er.fz("sa", gj(int ), (int)100);
                            continue block94;
                        }
                        case -688198225: {
                            v33 = er.fz("sd", gj(int ), (int)101);
                            continue block94;
                        }
                        case 1639187555: {
                            break block94;
                        }
                        case 1923595354: {
                            v33 = er.fz("sg", gj(int ), (int)102);
                            continue block94;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v34 /* !! */  = (cfr_temp_6 = er.f - er.fz("sh", gj(int ), (int)103)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v34 /* !! */  == er.fz("si", gd(int ), (int)93)) break;
                    v34 /* !! */  = (long)er.fz("sj", gd(int ), (int)94);
                }
                v35 = er.mc.field_1724;
                while (true) {
                    if ((v36 /* !! */  = (cfr_temp_7 = er.f - er.fz("sk", gj(int ), (int)104)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v36 /* !! */  == er.fz("sl", gd(int ), (int)95)) break;
                    v36 /* !! */  = (long)er.fz("sm", gd(int ), (int)96);
                }
                v37 = v35.method_36455();
                while (true) {
                    if ((v38 /* !! */  = (cfr_temp_8 = er.f - er.fz("sn", gj(int ), (int)105)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v38 /* !! */  == er.fz("so", gd(int ), (int)97)) break;
                    v38 /* !! */  = (long)er.fz("sp", gd(int ), (int)98);
                }
                v39 = new class_2886(class_1268.field_5808, (int)v25, v31, v37);
                while (true) {
                    if ((v40 /* !! */  = (cfr_temp_9 = er.f - er.fz("sq", gj(int ), (int)106)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                    if (v40 /* !! */  == er.fz("sr", gd(int ), (int)99)) break;
                    v40 /* !! */  = (long)er.fz("ss", gd(int ), (int)100);
                }
                v20.method_52787((class_2596)v39);
                if (var1_3 || var1_3) ** continue;
                return;
            }
lbl241:
            // 3 sources

            case 0: {
                var2_2 /* !! */  = (int)er.fz("st", gd(int ), (int)101);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl257
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)er.fz("su", gd(int ), (int)102);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl257
                    break;
                }
            }
            case 2: {
                do {
                    var2_2 /* !! */  = (int)er.fz("sv", gd(int ), (int)103);
                } while (!var3_1);
                throw null;
            }
lbl257:
            // 3 sources

            case 3: {
                var2_2 /* !! */  = (int)er.fz("sw", gd(int ), (int)104);
                if (!var3_1) ** GOTO lbl241
                throw null;
            }
lbl261:
            // 2 sources

            case 4: {
                var2_2 /* !! */  = (int)er.fz("sx", gd(int ), (int)105);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl270
            }
            case 5: {
                var2_2 /* !! */  = (int)er.fz("sy", gd(int ), (int)106);
                if (!var3_1) ** GOTO lbl241
                throw null;
            }
lbl270:
            // 2 sources

            case 6: {
                var2_2 /* !! */  = (int)er.fz("sz", gd(int ), (int)107);
                if (!var3_1) ** GOTO lbl261
                throw null;
            }
            case 7: 
        }
        var2_2 /* !! */  = (int)er.fz("tc", gd(int ), (int)108);
        ** while (!var3_1)
lbl277:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void uk() {
        er.gk[0] = -2095250429830550507L;
        er.gk[1] = -3508360879431870087L;
        er.gk[2] = 1519420359885057355L;
        er.gk[3] = 7824698710513368772L;
        er.gk[4] = 2763424333282628864L;
        er.gk[5] = 6680107859866500942L;
        er.gk[6] = -5615420231802183400L;
        er.gk[7] = 8426635603510572657L;
        er.gk[8] = 2628503923692268947L;
        er.gk[9] = 362938892382167830L;
        er.gk[10] = 455313920175107952L;
        er.gk[11] = -4069807419771752178L;
        er.gk[12] = -3593189778139998426L;
        er.gk[13] = -1132558496421157563L;
        er.gk[14] = 7052971762126860287L;
        er.gk[15] = 7021831294641512710L;
        er.gk[16] = -4767279244113398259L;
        er.gk[17] = 3877735726020216823L;
        er.gk[18] = -5092666766726678683L;
        er.gk[19] = -5566653293066874606L;
        er.gk[20] = 7129630904194493588L;
        er.gk[21] = 8552450694602246159L;
        er.gk[22] = -308927007766584792L;
        er.gk[23] = -5621331447747994750L;
        er.gk[24] = 6110871412536967066L;
        er.gk[25] = 4541179921421939192L;
        er.gk[26] = -3361237186514890738L;
        er.gk[27] = 7874619182365257823L;
        er.gk[28] = 2511029303637301877L;
        er.gk[29] = 6406175668230941497L;
        er.gk[30] = 7720095316850355862L;
        er.gk[31] = -2320741214713455417L;
        er.gk[32] = -8201097388494045423L;
        er.gk[33] = -6488409190592061866L;
        er.gk[34] = 4152119328867152547L;
        er.gk[35] = -2547517733645676560L;
        er.gk[36] = 6914366223836556975L;
        er.gk[37] = 6997161524654297093L;
        er.gk[38] = 8308710692958787274L;
        er.gk[39] = 1485550655858736254L;
        er.gk[40] = 3040621928709654301L;
        er.gk[41] = -5438610159424534500L;
        er.gk[42] = 8976898478503810042L;
        er.gk[43] = -5561508687086843042L;
        er.gk[44] = -5521254107331531192L;
        er.gk[45] = -3930174770541296701L;
        er.gk[46] = 2941419217339002725L;
        er.gk[47] = -618155980723609366L;
        er.gk[48] = -2666941410758986155L;
        er.gk[49] = -538796251690748343L;
        er.gk[50] = -3905799285788836771L;
        er.gk[51] = -3981644494602338104L;
        er.gk[52] = -9101623507715752825L;
        er.gk[53] = 1861965088544170928L;
        er.gk[54] = -7986589988030326905L;
        er.gk[55] = -3747600333666360492L;
        er.gk[56] = 579092776673017355L;
        er.gk[57] = -7634550071620882829L;
        er.gk[58] = -7808762441397082075L;
        er.gk[59] = -7518311926955444241L;
        er.gk[60] = -8011431276039837748L;
        er.gk[61] = 6745917833463773801L;
        er.gk[62] = -5536407844528875308L;
        er.gk[63] = 6301985347519995169L;
        er.gk[64] = 1581997249443546747L;
        er.gk[65] = 3170675200640195119L;
        er.gk[66] = -9076639648944739076L;
        er.gk[67] = 8058027889346697984L;
        er.gk[68] = -618155338715217319L;
        er.gk[69] = 7659474659236844636L;
        er.gk[70] = -504861033154580948L;
        er.gk[71] = -6703687012538614234L;
        er.gk[72] = -2198175607407405325L;
        er.gk[73] = -139998207173297673L;
        er.gk[74] = 2868514387082121586L;
        er.gk[75] = 2359399811779211964L;
        er.gk[76] = 1477595695941317131L;
        er.gk[77] = 798012789005693032L;
        er.gk[78] = 4589392293568398816L;
        er.gk[79] = -7063176031066787063L;
        er.gk[80] = 8738465227351665727L;
        er.gk[81] = 885419416637824038L;
        er.gk[82] = 3851566925116443316L;
        er.gk[83] = 2950717469548540450L;
        er.gk[84] = 2939249178063379141L;
        er.gk[85] = -96528614746862673L;
        er.gk[86] = -1254259780217636884L;
        er.gk[87] = 8098078339406761492L;
        er.gk[88] = 1447225629784091879L;
        er.gk[89] = -5453439998859867988L;
        er.gk[90] = -5028272178501395083L;
        er.gk[91] = 3243372758964970361L;
        er.gk[92] = 3457526144880843174L;
        er.gk[93] = -7091957538179459837L;
        er.gk[94] = -2411782076240134396L;
        er.gk[95] = -3592151893605083453L;
        er.gk[96] = -1392091784459218651L;
        er.gk[97] = 5313427950810460946L;
        er.gk[98] = 2917751114642086493L;
        er.gk[99] = 4532842141544650127L;
    }
}

