/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_11909
 *  net.minecraft.class_310
 *  net.minecraft.class_332
 *  net.minecraft.class_408
 *  net.minecraft.class_437
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.minecraft.class_11909;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_408;
import net.minecraft.class_437;
import ruhack.phobia.aj;
import ruhack.phobia.ar;
import ruhack.phobia.au;
import ruhack.phobia.av;
import ruhack.phobia.d;
import ruhack.phobia.dy;
import ruhack.phobia.eb;
import ruhack.phobia.mg;

public class as {
    private static long[] dgpv;
    private static int[] dglv;
    private static int[] dglu;
    public static final boolean a;
    private static int startX;
    public static final boolean c;
    private static long[] dgpw;
    public static final int b;
    private static int startY;
    private static au draggingElement;
    private static final long hi = -1897272337674845150L;

    private static /* synthetic */ void dgvv() {
        as.dglu[0] = -1702997869;
        as.dglu[1] = 1018915810;
        as.dglu[2] = 440211367;
        as.dglu[3] = 1784997958;
        as.dglu[4] = -2142752421;
        as.dglu[5] = 304292692;
        as.dglu[6] = -1911487263;
        as.dglu[7] = 1397018809;
        as.dglu[8] = -504008678;
        as.dglu[9] = 655357161;
        as.dglu[10] = 798628992;
        as.dglu[11] = 2042107939;
        as.dglu[12] = -1420692750;
        as.dglu[13] = -1922487409;
        as.dglu[14] = 1040128572;
        as.dglu[15] = -231084243;
        as.dglu[16] = 1109441501;
        as.dglu[17] = 509969288;
        as.dglu[18] = 114259756;
        as.dglu[19] = -991954766;
        as.dglu[20] = -2109159136;
        as.dglu[21] = 359172773;
        as.dglu[22] = 749477060;
        as.dglu[23] = 426510467;
        as.dglu[24] = -211328598;
        as.dglu[25] = 1916208464;
        as.dglu[26] = 1724801699;
        as.dglu[27] = 607723542;
        as.dglu[28] = -123116488;
        as.dglu[29] = 1569086377;
        as.dglu[30] = 633016759;
        as.dglu[31] = -1328460708;
        as.dglu[32] = -271422533;
        as.dglu[33] = -1465429376;
        as.dglu[34] = 337010185;
        as.dglu[35] = 1940933475;
        as.dglu[36] = -1687037074;
        as.dglu[37] = 374117768;
        as.dglu[38] = -1335292773;
        as.dglu[39] = 110173080;
        as.dglu[40] = 1806903739;
        as.dglu[41] = -613297210;
        as.dglu[42] = 1022768881;
        as.dglu[43] = -941434943;
        as.dglu[44] = 1916271516;
        as.dglu[45] = 745568039;
        as.dglu[46] = -1329306759;
        as.dglu[47] = -1729918814;
        as.dglu[48] = 222291410;
        as.dglu[49] = 1872442786;
        as.dglu[50] = -671882271;
        as.dglu[51] = 1554368858;
        as.dglu[52] = -1236605402;
        as.dglu[53] = 344589417;
        as.dglu[54] = 1151840226;
        as.dglu[55] = -13604847;
        as.dglu[56] = 1302391702;
        as.dglu[57] = 433335705;
        as.dglu[58] = 1684352674;
        as.dglu[59] = -315267841;
        as.dglu[60] = -1208353178;
        as.dglu[61] = 42897670;
        as.dglu[62] = 52601572;
        as.dglu[63] = 617607563;
        as.dglu[64] = -2094539254;
        as.dglu[65] = -1379906009;
        as.dglu[66] = -1266471095;
        as.dglu[67] = 747591867;
        as.dglu[68] = 1935354111;
        as.dglu[69] = -60792976;
        as.dglu[70] = 809149959;
        as.dglu[71] = 839839488;
        as.dglu[72] = -1851039983;
        as.dglu[73] = 177400707;
        as.dglu[74] = 1199740532;
        as.dglu[75] = -1564904539;
        as.dglu[76] = 1730828744;
        as.dglu[77] = -1895478391;
        as.dglu[78] = 170741477;
        as.dglu[79] = -1302823144;
        as.dglu[80] = 591463692;
        as.dglu[81] = -1816915750;
        as.dglu[82] = 1098565314;
        as.dglu[83] = 1240919700;
        as.dglu[84] = 966554583;
        as.dglu[85] = -1906931656;
        as.dglu[86] = 278831369;
        as.dglu[87] = -1062771777;
        as.dglu[88] = -1731223077;
        as.dglu[89] = 140477222;
        as.dglu[90] = 1042661802;
        as.dglu[91] = -449952386;
        as.dglu[92] = -1740671494;
        as.dglu[93] = -1355060681;
        as.dglu[94] = 157098320;
        as.dglu[95] = 1168171967;
        as.dglu[96] = -1758209737;
        as.dglu[97] = 963631016;
        as.dglu[98] = 314761049;
        as.dglu[99] = 788635255;
    }

    private static /* synthetic */ void dgvy() {
        as.dglv[100] = -1992164995;
        as.dglv[101] = -1110983680;
        as.dglv[102] = 1171318082;
        as.dglv[103] = -1843463115;
        as.dglv[104] = -1100455341;
        as.dglv[105] = 1339592464;
        as.dglv[106] = 748306776;
        as.dglv[107] = -1483903483;
        as.dglv[108] = -28259005;
        as.dglv[109] = 385107983;
        as.dglv[110] = -292264486;
        as.dglv[111] = -1611664668;
        as.dglv[112] = -562161123;
        as.dglv[113] = -1026613841;
        as.dglv[114] = 208117158;
        as.dglv[115] = 647450899;
        as.dglv[116] = 125883104;
        as.dglv[117] = -1654303171;
        as.dglv[118] = -805148205;
        as.dglv[119] = -111514664;
        as.dglv[120] = 911284825;
        as.dglv[121] = -605098350;
        as.dglv[122] = -1922887897;
        as.dglv[123] = 201444860;
        as.dglv[124] = 703131057;
        as.dglv[125] = -378562687;
        as.dglv[126] = -2102471525;
        as.dglv[127] = 746864112;
        as.dglv[128] = 1973377166;
        as.dglv[129] = -2116648583;
        as.dglv[130] = 2015147886;
        as.dglv[131] = 1067429804;
        as.dglv[132] = -921081296;
        as.dglv[133] = -555473800;
        as.dglv[134] = 120046246;
        as.dglv[135] = 1178230459;
        as.dglv[136] = -2065811864;
        as.dglv[137] = -291763346;
        as.dglv[138] = -1905160139;
        as.dglv[139] = -1359130871;
        as.dglv[140] = 1291842669;
        as.dglv[141] = 1074417710;
        as.dglv[142] = 248657514;
        as.dglv[143] = 69089443;
        as.dglv[144] = 782276349;
        as.dglv[145] = 1640336362;
        as.dglv[146] = 1894367311;
        as.dglv[147] = -177033229;
        as.dglv[148] = 532666026;
        as.dglv[149] = -1768957668;
        as.dglv[150] = -1856057067;
        as.dglv[151] = -120062535;
        as.dglv[152] = 1659558501;
        as.dglv[153] = 1151475394;
        as.dglv[154] = 1418580629;
        as.dglv[155] = 769173673;
        as.dglv[156] = 1563532440;
        as.dglv[157] = 1234699846;
        as.dglv[158] = 570691286;
        as.dglv[159] = 1733670725;
        as.dglv[160] = -538663058;
        as.dglv[161] = -268340618;
        as.dglv[162] = 2030774596;
        as.dglv[163] = -1783536675;
        as.dglv[164] = -803989323;
        as.dglv[165] = -528828319;
        as.dglv[166] = -195582272;
        as.dglv[167] = 2037663887;
        as.dglv[168] = -1097670316;
        as.dglv[169] = 1109317226;
        as.dglv[170] = 254808035;
        as.dglv[171] = 1437594761;
        as.dglv[172] = 1328759675;
        as.dglv[173] = -1142963212;
        as.dglv[174] = 1748982753;
        as.dglv[175] = -12139770;
        as.dglv[176] = -869765576;
        as.dglv[177] = -1159537808;
        as.dglv[178] = -404834961;
        as.dglv[179] = -1627773017;
        as.dglv[180] = 200329199;
        as.dglv[181] = 1155250286;
        as.dglv[182] = -846421144;
        as.dglv[183] = -1388609390;
        as.dglv[184] = 1821239752;
    }

    private static /* synthetic */ void dgvx() {
        as.dglv[0] = -1702997879;
        as.dglv[1] = 1018915835;
        as.dglv[2] = 440211379;
        as.dglv[3] = 1784997959;
        as.dglv[4] = -2142752432;
        as.dglv[5] = 304292688;
        as.dglv[6] = -1911487296;
        as.dglv[7] = 1397018785;
        as.dglv[8] = -504008690;
        as.dglv[9] = 655357170;
        as.dglv[10] = 798629018;
        as.dglv[11] = 2042107951;
        as.dglv[12] = -1420692750;
        as.dglv[13] = -1922487379;
        as.dglv[14] = 1040128546;
        as.dglv[15] = -231084242;
        as.dglv[16] = 1109441535;
        as.dglv[17] = 509969308;
        as.dglv[18] = 114259765;
        as.dglv[19] = -991954779;
        as.dglv[20] = -2109159132;
        as.dglv[21] = 359172774;
        as.dglv[22] = 749477077;
        as.dglv[23] = 426510465;
        as.dglv[24] = -211328631;
        as.dglv[25] = 1916208459;
        as.dglv[26] = 1724801705;
        as.dglv[27] = 607723521;
        as.dglv[28] = -123116501;
        as.dglv[29] = 1569086368;
        as.dglv[30] = 633016743;
        as.dglv[31] = -1328460716;
        as.dglv[32] = -271422550;
        as.dglv[33] = -1465429353;
        as.dglv[34] = 337010191;
        as.dglv[35] = 1940933503;
        as.dglv[36] = -1687037087;
        as.dglv[37] = 374117764;
        as.dglv[38] = -1335292774;
        as.dglv[39] = 110173060;
        as.dglv[40] = 1806903735;
        as.dglv[41] = -613297188;
        as.dglv[42] = 1022768883;
        as.dglv[43] = -941434944;
        as.dglv[44] = 1916271540;
        as.dglv[45] = 745568063;
        as.dglv[46] = -1329306778;
        as.dglv[47] = -1729918828;
        as.dglv[48] = 222291415;
        as.dglv[49] = 1872442807;
        as.dglv[50] = -671882282;
        as.dglv[51] = 1554368839;
        as.dglv[52] = -1236605403;
        as.dglv[53] = 344589378;
        as.dglv[54] = 1151840244;
        as.dglv[55] = -13604821;
        as.dglv[56] = 1302391685;
        as.dglv[57] = 433335693;
        as.dglv[58] = 1684352686;
        as.dglv[59] = -315267843;
        as.dglv[60] = -1208353205;
        as.dglv[61] = 42897666;
        as.dglv[62] = 52601572;
        as.dglv[63] = 617607569;
        as.dglv[64] = -2094539247;
        as.dglv[65] = -1379906044;
        as.dglv[66] = -1266471071;
        as.dglv[67] = 747591854;
        as.dglv[68] = 1935354061;
        as.dglv[69] = -60792967;
        as.dglv[70] = 809149960;
        as.dglv[71] = 839839542;
        as.dglv[72] = -1851039968;
        as.dglv[73] = 177400712;
        as.dglv[74] = 1199740493;
        as.dglv[75] = -1564904566;
        as.dglv[76] = 1730828780;
        as.dglv[77] = -1895478365;
        as.dglv[78] = 170741479;
        as.dglv[79] = -1302823124;
        as.dglv[80] = 591463720;
        as.dglv[81] = -1816915769;
        as.dglv[82] = 1098565315;
        as.dglv[83] = 1240919717;
        as.dglv[84] = 966554614;
        as.dglv[85] = -1906931710;
        as.dglv[86] = 278831419;
        as.dglv[87] = -1062771800;
        as.dglv[88] = -1731223051;
        as.dglv[89] = 140477238;
        as.dglv[90] = 1042661767;
        as.dglv[91] = -449952393;
        as.dglv[92] = -1740671532;
        as.dglv[93] = -1355060709;
        as.dglv[94] = 157098355;
        as.dglv[95] = 1168171909;
        as.dglv[96] = -1758209753;
        as.dglv[97] = 963630985;
        as.dglv[98] = 314761042;
        as.dglv[99] = 788635228;
    }

    static {
        dglu = new int[185];
        dglv = new int[185];
        as.dgvv();
        as.dgvw();
        as.dgvx();
        as.dgvy();
        dgpv = new long[70];
        dgpw = new long[70];
        as.dgvz();
        as.dgwa();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void onMouseRelease(class_11909 var0) {
        v0 /* !! */  = as.hi;
        if (true) ** GOTO lbl5
        block35: while (true) {
            v0 /* !! */  = (long)(v1 - as.dglw("dgpx", dgpu(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1565426990: {
                    v1 = as.dglw("dgpy", dgpu(int ), (int)1);
                    continue block35;
                }
                case 859317279: {
                    v1 = as.dglw("dgpz", dgpu(int ), (int)2);
                    continue block35;
                }
                case 935662805: {
                    v1 = as.dglw("dgqa", dgpu(int ), (int)3);
                    continue block35;
                }
                case 1857504290: {
                    break block35;
                }
            }
            break;
        }
        var3_1 = as.c;
        v2 /* !! */  = as.hi;
        if (true) ** GOTO lbl22
        block36: while (true) {
            v2 /* !! */  = (long)(v3 - as.dglw("dgqb", dgpu(int ), (int)4));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1471072475: {
                    v3 = as.dglw("dgqc", dgpu(int ), (int)5);
                    continue block36;
                }
                case -812690509: {
                    v3 = as.dglw("dgqd", dgpu(int ), (int)6);
                    continue block36;
                }
                case 704955042: {
                    v3 = as.dglw("dgqe", dgpu(int ), (int)7);
                    continue block36;
                }
                case 1857504290: {
                    break block36;
                }
            }
            break;
        }
        var2_2 /* !! */  = as.b;
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_0 = as.hi - as.dglw("dgqf", dgpu(int ), (int)8)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == as.dglw("dgqg", dglt(int ), (int)101)) break;
            v4 /* !! */  = (long)as.dglw("dgqh", dglt(int ), (int)102);
        }
        var1_3 = as.a;
        if (var3_1) {
            throw null;
lbl43:
            // 7 sources

            return;
        }
        if (var1_3) ** GOTO lbl43
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl43
                v5 /* !! */  = as.hi;
                if (true) ** GOTO lbl54
                block39: while (true) {
                    v5 /* !! */  = (long)(as.dglw("dgqj", dgpu(int ), (int)10) - as.dglw("dgqi", dgpu(int ), (int)9));
lbl54:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1960985692: {
                            continue block39;
                        }
                        case 1857504290: {
                            break block39;
                        }
                    }
                    break;
                }
                if (var0.method_74245() != 0) ** GOTO lbl96
                if (var1_3) ** GOTO lbl43
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_1 = as.hi - as.dglw("dgqk", dgpu(int ), (int)11)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == as.dglw("dgql", dglt(int ), (int)103)) break;
                    v6 /* !! */  = (long)as.dglw("dgqm", dglt(int ), (int)104);
                }
                if (as.draggingElement == null) ** GOTO lbl96
                if (var1_3 || var1_3) ** GOTO lbl43
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_2 = as.hi - as.dglw("dgqn", dgpu(int ), (int)12)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == as.dglw("dgqo", dglt(int ), (int)105)) break;
                    v7 /* !! */  = (long)as.dglw("dgqp", dglt(int ), (int)106);
                }
                v8 = aj.getInstance();
                v9 /* !! */  = as.hi;
                if (true) ** GOTO lbl78
                block42: while (true) {
                    v9 /* !! */  = (long)(v10 - as.dglw("dgqq", dgpu(int ), (int)13));
lbl78:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -416122175: {
                            v10 = as.dglw("dgqr", dgpu(int ), (int)14);
                            continue block42;
                        }
                        case 864541635: {
                            v10 = as.dglw("dgqs", dgpu(int ), (int)15);
                            continue block42;
                        }
                        case 1857504290: {
                            break block42;
                        }
                    }
                    break;
                }
                v8.save();
                if (var1_3 || var1_3) ** GOTO lbl43
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_3 = as.hi - as.dglw("dgqt", dgpu(int ), (int)16)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v11 /* !! */  == as.dglw("dgqu", dglt(int ), (int)107)) break;
                    v11 /* !! */  = (long)as.dglw("dgqv", dglt(int ), (int)108);
                }
                as.draggingElement = null;
                if (var1_3) ** GOTO lbl43
lbl96:
                // 3 sources

                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
lbl99:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)as.dglw("dgqw", dglt(int ), (int)109);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl133
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)as.dglw("dgqx", dglt(int ), (int)110);
                    if (!var3_1) ** GOTO lbl99
                    throw null;
                }
            }
lbl109:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)as.dglw("dgqy", dglt(int ), (int)111);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl124
            }
            case 3: {
                var2_2 /* !! */  = (int)as.dglw("dgqz", dglt(int ), (int)112);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl141
            }
            case 4: {
                var2_2 /* !! */  = (int)as.dglw("dgra", dglt(int ), (int)113);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl141
            }
lbl124:
            // 4 sources

            case 5: {
                do {
                    var2_2 /* !! */  = (int)as.dglw("dgrb", dglt(int ), (int)114);
                } while (!var3_1);
                throw null;
            }
            case 6: {
                var2_2 /* !! */  = (int)as.dglw("dgrc", dglt(int ), (int)115);
                if (!var3_1) break;
                throw null;
            }
lbl133:
            // 2 sources

            case 7: {
                var2_2 /* !! */  = (int)as.dglw("dgrd", dglt(int ), (int)116);
                if (!var3_1) ** GOTO lbl109
                throw null;
            }
            case 8: {
                var2_2 /* !! */  = (int)as.dglw("dgre", dglt(int ), (int)117);
                if (!var3_1) ** GOTO lbl124
                throw null;
            }
lbl141:
            // 3 sources

            case 9: {
                var2_2 /* !! */  = (int)as.dglw("dgrf", dglt(int ), (int)118);
                if (!var3_1) ** GOTO lbl124
                throw null;
            }
            case 10: {
                do {
                    var2_2 /* !! */  = (int)as.dglw("dgrg", dglt(int ), (int)119);
                } while (!var3_1);
                throw null;
            }
            case 11: 
        }
        var2_2 /* !! */  = (int)as.dglw("dgrh", dglt(int ), (int)120);
        ** while (!var3_1)
lbl153:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ long dgpu(int n2) {
        return dgpv[n2] ^ dgpw[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void tick() {
        block19: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = as.hi - as.dglw("dguw", dgpu(int ), (int)62)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v0 /* !! */  == as.dglw("dgux", dglt(int ), (int)168)) break;
                v0 /* !! */  = (long)as.dglw("dguy", dglt(int ), (int)169);
            }
            var3 = as.c;
            v1 /* !! */  = as.hi;
            if (true) ** GOTO lbl12
            block10: while (true) {
                v1 /* !! */  = (long)(v2 - as.dglw("dguz", dgpu(int ), (int)63));
lbl12:
                // 2 sources

                switch ((int)v1 /* !! */ ) {
                    case -1835808488: {
                        v2 = as.dglw("dgva", dgpu(int ), (int)64);
                        continue block10;
                    }
                    case 1229772223: {
                        v2 = as.dglw("dgvb", dgpu(int ), (int)65);
                        continue block10;
                    }
                    case 1857504290: {
                        break block10;
                    }
                }
                break;
            }
            var2_1 = as.b;
            while (true) {
                if ((v3 /* !! */  = (cfr_temp_1 = as.hi - as.dglw("dgvc", dgpu(int ), (int)66)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v3 /* !! */  == as.dglw("dgvd", dglt(int ), (int)170)) break;
                v3 /* !! */  = (long)as.dglw("dgve", dglt(int ), (int)171);
            }
            var1_2 = as.a;
            if (var3) {
                throw null;
lbl31:
                // 5 sources

                return;
            }
            if (var1_2 || var1_2) ** GOTO lbl31
            while (true) {
                if ((v4 /* !! */  = (cfr_temp_2 = as.hi - as.dglw("dgvf", dgpu(int ), (int)67)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v4 /* !! */  == as.dglw("dgvg", dglt(int ), (int)172)) break;
                v4 /* !! */  = (long)as.dglw("dgvh", dglt(int ), (int)173);
            }
            var0_3 = as.getHudManager();
            if (var1_2 || var1_2) ** GOTO lbl31
            if (var0_3 == null) break block19;
            if (var1_2 || var1_2) ** GOTO lbl31
            v5 /* !! */  = as.hi;
            if (true) ** GOTO lbl48
            block14: while (true) {
                v5 /* !! */  = (long)(as.dglw("dgvj", dgpu(int ), (int)69) - as.dglw("dgvi", dgpu(int ), (int)68));
lbl48:
                // 2 sources

                switch ((int)v5 /* !! */ ) {
                    case -910455480: {
                        continue block14;
                    }
                    case 1857504290: {
                        break block14;
                    }
                }
                break;
            }
            var0_3.tick();
            if (var1_2) ** GOTO lbl31
        }
        if (!var1_2 && !var1_2) ** break;
        ** while (true)
    }

    public static /* synthetic */ CallSite dglw(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void onDraw(class_332 var0, int var1_1, int var2_2, float var3_3, boolean var4_4) {
        var10_5 = as.c;
        var9_6 /* !! */  = as.b;
        var8_7 = as.a;
        if (var10_5) {
            throw null;
lbl6:
            // 20 sources

            return;
        }
        if (var8_7 || var8_7) ** GOTO lbl6
        if (var9_6 /* !! */  == 0) ** GOTO lbl-1000
        block0 : switch (var9_6 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                var5_8 = as.getHudManager();
                if (var8_7 || var8_7) ** GOTO lbl6
                if (var5_8 != null) ** GOTO lbl17
                if (var8_7) ** GOTO lbl6
                return;
lbl17:
                // 1 sources

                if (var8_7 || var8_7) ** GOTO lbl6
                if (dy.getInstance() != null) ** GOTO lbl21
                if (var8_7) ** GOTO lbl6
                return;
lbl21:
                // 1 sources

                if (var8_7 || var8_7) ** GOTO lbl6
                if (var4_4) ** GOTO lbl30
                if (var8_7 || var8_7) ** GOTO lbl6
                if (as.draggingElement == null) ** GOTO lbl30
                if (var8_7 || var8_7) ** GOTO lbl6
                aj.getInstance().save();
                if (var8_7 || var8_7) ** GOTO lbl6
                as.draggingElement = null;
                if (var8_7) ** GOTO lbl6
lbl30:
                // 3 sources

                if (var8_7 || var8_7) ** GOTO lbl6
                var6_9 = (int)Math.round(var5_8.toHudCoordinate(var1_1));
                if (var8_7 || var8_7) ** GOTO lbl6
                var7_10 = (int)Math.round(var5_8.toHudCoordinate(var2_2));
                if (var8_7 || var8_7) ** GOTO lbl6
                if (!var4_4) ** GOTO lbl45
                if (var8_7) ** GOTO lbl6
                if (as.draggingElement == null) ** GOTO lbl45
                if (var8_7 || var8_7) ** GOTO lbl6
                as.draggingElement.setX(var6_9 - as.startX);
                if (var8_7 || var8_7) ** GOTO lbl6
                as.draggingElement.setY(var7_10 - as.startY);
                if (var8_7 || var8_7) ** GOTO lbl6
                var5_8.constrainToViewport(as.draggingElement);
                if (var8_7) ** GOTO lbl6
lbl45:
                // 3 sources

                if (var8_7 || var8_7) ** GOTO lbl6
                var5_8.render(var0, var3_3, var1_1, var2_2);
                if (!var8_7 && !var8_7) ** break;
                ** continue;
                return;
            }
lbl50:
            // 2 sources

            case 0: {
                var9_6 /* !! */  = (int)as.dglw("dglx", dglt(int ), (int)0);
                if (var10_5) {
                    throw null;
                }
                ** GOTO lbl176
            }
lbl55:
            // 2 sources

            case 1: {
                var9_6 /* !! */  = (int)as.dglw("dgly", dglt(int ), (int)1);
                if (var10_5) {
                    throw null;
                }
                ** GOTO lbl196
            }
            case 2: {
                var9_6 /* !! */  = (int)as.dglw("dglz", dglt(int ), (int)2);
                if (var10_5) {
                    throw null;
                }
                ** GOTO lbl204
            }
lbl65:
            // 2 sources

            case 3: {
                var9_6 /* !! */  = (int)as.dglw("dgma", dglt(int ), (int)3);
                if (var10_5) {
                    throw null;
                }
                ** GOTO lbl95
            }
lbl70:
            // 2 sources

            case 4: {
                var9_6 /* !! */  = (int)as.dglw("dgmb", dglt(int ), (int)4);
                if (var10_5) {
                    throw null;
                }
                ** GOTO lbl154
            }
            case 5: {
                var9_6 /* !! */  = (int)as.dglw("dgmc", dglt(int ), (int)5);
                if (var10_5) {
                    throw null;
                }
                ** GOTO lbl204
            }
            case 6: {
                var9_6 /* !! */  = (int)as.dglw("dgmd", dglt(int ), (int)6);
                if (var10_5) {
                    throw null;
                }
                ** GOTO lbl191
            }
            case 7: {
                var9_6 /* !! */  = (int)as.dglw("dgme", dglt(int ), (int)7);
                if (var10_5) {
                    throw null;
                }
                ** GOTO lbl123
            }
lbl90:
            // 3 sources

            case 8: {
                var9_6 /* !! */  = (int)as.dglw("dgmf", dglt(int ), (int)8);
                if (var10_5) {
                    throw null;
                }
                ** GOTO lbl110
            }
lbl95:
            // 3 sources

            case 9: {
                var9_6 /* !! */  = (int)as.dglw("dgmg", dglt(int ), (int)9);
                if (var10_5) {
                    throw null;
                }
                ** GOTO lbl216
            }
lbl100:
            // 2 sources

            case 10: {
                var9_6 /* !! */  = (int)as.dglw("dgmh", dglt(int ), (int)10);
                if (var10_5) {
                    throw null;
                }
                ** GOTO lbl191
            }
            case 11: {
                var9_6 /* !! */  = (int)as.dglw("dgmi", dglt(int ), (int)11);
                if (var10_5) {
                    throw null;
                }
                ** GOTO lbl216
            }
lbl110:
            // 2 sources

            case 12: {
                var9_6 /* !! */  = (int)as.dglw("dgmj", dglt(int ), (int)12);
                if (var10_5) {
                    throw null;
                }
                ** GOTO lbl204
            }
            case 13: {
                var9_6 /* !! */  = (int)as.dglw("dgmk", dglt(int ), (int)13);
                if (!var10_5) ** GOTO lbl55
                throw null;
            }
lbl119:
            // 2 sources

            case 14: {
                var9_6 /* !! */  = (int)as.dglw("dgml", dglt(int ), (int)14);
                if (!var10_5) ** GOTO lbl100
                throw null;
            }
lbl123:
            // 2 sources

            case 15: {
                var9_6 /* !! */  = (int)as.dglw("dgmm", dglt(int ), (int)15);
                if (!var10_5) ** GOTO lbl95
                throw null;
            }
            case 16: {
                var9_6 /* !! */  = (int)as.dglw("dgmn", dglt(int ), (int)16);
                if (var10_5) {
                    throw null;
                }
                ** GOTO lbl181
            }
            case 17: {
                var9_6 /* !! */  = (int)as.dglw("dgmo", dglt(int ), (int)17);
                if (!var10_5) ** GOTO lbl70
                throw null;
            }
            case 18: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var9_6 /* !! */  = (int)as.dglw("dgmp", dglt(int ), (int)18);
                    if (!var10_5) break block0;
                    throw null;
                }
            }
            case 19: {
                var9_6 /* !! */  = (int)as.dglw("dgmq", dglt(int ), (int)19);
                if (!var10_5) ** GOTO lbl90
                throw null;
            }
lbl145:
            // 2 sources

            case 20: {
                var9_6 /* !! */  = (int)as.dglw("dgmr", dglt(int ), (int)20);
                if (var10_5) {
                    throw null;
                }
                ** GOTO lbl172
            }
lbl150:
            // 3 sources

            case 21: {
                var9_6 /* !! */  = (int)as.dglw("dgms", dglt(int ), (int)21);
                if (!var10_5) ** GOTO lbl90
                throw null;
            }
lbl154:
            // 2 sources

            case 22: {
                var9_6 /* !! */  = (int)as.dglw("dgmt", dglt(int ), (int)22);
                if (var10_5) {
                    throw null;
                }
                ** GOTO lbl168
            }
            case 23: {
                var9_6 /* !! */  = (int)as.dglw("dgmu", dglt(int ), (int)23);
                if (var10_5) {
                    throw null;
                }
                ** GOTO lbl216
            }
            case 24: {
                var9_6 /* !! */  = (int)as.dglw("dgmv", dglt(int ), (int)24);
                if (!var10_5) ** GOTO lbl50
                throw null;
            }
lbl168:
            // 2 sources

            case 25: {
                var9_6 /* !! */  = (int)as.dglw("dgmw", dglt(int ), (int)25);
                if (!var10_5) break;
                throw null;
            }
lbl172:
            // 2 sources

            case 26: {
                var9_6 /* !! */  = (int)as.dglw("dgmx", dglt(int ), (int)26);
                if (!var10_5) ** GOTO lbl150
                throw null;
            }
lbl176:
            // 3 sources

            case 27: {
                var9_6 /* !! */  = (int)as.dglw("dgmy", dglt(int ), (int)27);
                if (var10_5) {
                    throw null;
                }
                ** GOTO lbl212
            }
lbl181:
            // 2 sources

            case 28: {
                var9_6 /* !! */  = (int)as.dglw("dgmz", dglt(int ), (int)28);
                if (var10_5) {
                    throw null;
                }
                ** GOTO lbl204
            }
            case 29: {
                var9_6 /* !! */  = (int)as.dglw("dgna", dglt(int ), (int)29);
                if (var10_5) {
                    throw null;
                }
                ** GOTO lbl204
            }
lbl191:
            // 3 sources

            case 30: {
                var9_6 /* !! */  = (int)as.dglw("dgnb", dglt(int ), (int)30);
                if (var10_5) {
                    throw null;
                }
                ** GOTO lbl204
            }
lbl196:
            // 2 sources

            case 31: {
                var9_6 /* !! */  = (int)as.dglw("dgnc", dglt(int ), (int)31);
                if (!var10_5) ** GOTO lbl150
                throw null;
            }
            case 32: {
                var9_6 /* !! */  = (int)as.dglw("dgnd", dglt(int ), (int)32);
                if (!var10_5) ** GOTO lbl176
                throw null;
            }
lbl204:
            // 7 sources

            case 33: {
                var9_6 /* !! */  = (int)as.dglw("dgne", dglt(int ), (int)33);
                if (!var10_5) ** GOTO lbl145
                throw null;
            }
            case 34: {
                var9_6 /* !! */  = (int)as.dglw("dgnf", dglt(int ), (int)34);
                if (!var10_5) ** GOTO lbl119
                throw null;
            }
lbl212:
            // 3 sources

            case 35: {
                var9_6 /* !! */  = (int)as.dglw("dgng", dglt(int ), (int)35);
                if (!var10_5) ** GOTO lbl65
                throw null;
            }
lbl216:
            // 4 sources

            case 36: {
                var9_6 /* !! */  = (int)as.dglw("dgnh", dglt(int ), (int)36);
                if (!var10_5) ** GOTO lbl212
                throw null;
            }
            case 37: 
        }
        var9_6 /* !! */  = (int)as.dglw("dgni", dglt(int ), (int)37);
        ** while (!var10_5)
lbl223:
        // 1 sources

        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static boolean isDragging() {
        block44: {
            v0 /* !! */  = as.hi;
            block25: while (true) {
                switch ((int)v0 /* !! */ ) {
                    case -794024776: {
                        v0 /* !! */  = (long)(as.dglw("dgsp", dgpu(int ), (int)33) - as.dglw("dgso", dgpu(int ), (int)32));
                        continue block25;
                    }
                    case 1857504290: {
                        break block25;
                    }
                }
                break;
            }
            var2 = as.c;
            v1 /* !! */  = as.hi;
            if (true) ** GOTO lbl14
            block26: while (true) {
                v1 /* !! */  = (long)(v2 - as.dglw("dgsq", dgpu(int ), (int)34));
lbl14:
                // 2 sources

                switch ((int)v1 /* !! */ ) {
                    case 1203810493: {
                        v2 = as.dglw("dgsr", dgpu(int ), (int)35);
                        continue block26;
                    }
                    case 1663436973: {
                        v2 = as.dglw("dgss", dgpu(int ), (int)36);
                        continue block26;
                    }
                    case 1857504290: {
                        break block26;
                    }
                }
                break;
            }
            var1_1 /* !! */  = as.b;
            if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
            cfr_temp_0 = -2147483648;
            block27: do {
                switch (cfr_temp_0 == -2147483648 ? var1_1 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        v3 /* !! */  = as.hi;
                        block28: while (true) {
                            switch ((int)v3 /* !! */ ) {
                                case -1599546258: {
                                    v4 = as.dglw("dgsu", dgpu(int ), (int)38);
                                    ** GOTO lbl42
                                }
                                case 1013111040: {
                                    v4 = as.dglw("dgsv", dgpu(int ), (int)39);
                                    ** GOTO lbl42
                                }
                                case 1857504290: {
                                    break block28;
                                }
                                case 2076335961: {
                                    v4 = as.dglw("dgsw", dgpu(int ), (int)40);
lbl42:
                                    // 3 sources

                                    v3 /* !! */  = (long)(v4 - as.dglw("dgst", dgpu(int ), (int)37));
                                    continue block28;
                                }
                            }
                            break;
                        }
                        var0_2 = as.a;
                        if (var2) {
                            throw null;
                        }
                        if (var0_2 || var0_2) return (boolean)as.dglw("dgsx", dglt(int ), (int)138);
                        while (true) {
                            if ((v5 /* !! */  = (cfr_temp_1 = as.hi - as.dglw("dgsy", dgpu(int ), (int)41)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                                continue;
                            }
                            if (v5 /* !! */  != as.dglw("dgsz", dglt(int ), (int)139)) ** GOTO lbl55
                            if (as.draggingElement != null) {
                                break;
                            }
                            ** GOTO lbl61
lbl55:
                            // 1 sources

                            v5 /* !! */  = (long)as.dglw("dgta", dglt(int ), (int)140);
                        }
                        if (var0_2) return (boolean)as.dglw("dgsx", dglt(int ), (int)138);
                        v6 = as.dglw("dgtb", dglt(int ), (int)141);
                        if (!var2) return (boolean)v6;
                        throw null;
lbl61:
                        // 1 sources

                        if (var0_2 || var0_2) {
                            return (boolean)as.dglw("dgsx", dglt(int ), (int)138);
                        }
                        v6 = as.dglw("dgtc", dglt(int ), (int)142);
                        return (boolean)v6;
                    }
                    case 0: {
                        ** break;
                    }
                    case 3: {
                        var1_1 /* !! */  = (int)as.dglw("dgtg", dglt(int ), (int)146);
                        cfr_temp_0 = 6;
                        if (!var2) continue block27;
                        throw null;
                    }
                    case 4: {
                        var1_1 /* !! */  = (int)as.dglw("dgth", dglt(int ), (int)147);
                        if (var2) {
                            throw null;
                        }
                    }
                    case 6: {
                        var1_1 /* !! */  = (int)as.dglw("dgtj", dglt(int ), (int)149);
                        if (var2) {
                            throw null;
                        }
                    }
                    case 2: {
                        var1_1 /* !! */  = (int)as.dglw("dgtf", dglt(int ), (int)145);
                        if (var2) {
                            throw null;
                        }
                    }
                    case 5: {
                        do {
                            var1_1 /* !! */  = (int)as.dglw("dgti", dglt(int ), (int)148);
                        } while (!var2);
                        throw null;
                    }
                    case 7: {
                        break block44;
                    }
lbl91:
                    // 2 sources

                    while (true) {
                        var1_1 /* !! */  = (int)as.dglw("dgtd", dglt(int ), (int)143);
                        cfr_temp_0 = 1;
                        if (!var2) continue block27;
                        throw null;
                    }
                    case 1: 
                }
                break;
            } while (true);
            var1_1 /* !! */  = (int)as.dglw("dgte", dglt(int ), (int)144);
            if (var2) {
                throw null;
            }
        }
        var1_1 /* !! */  = (int)as.dglw("dgtk", dglt(int ), (int)150);
        ** while (!var2)
lbl105:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void resetDragging() {
        block29: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = as.hi - as.dglw("dgri", dgpu(int ), (int)17)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  == as.dglw("dgrj", dglt(int ), (int)121)) break;
                v0 /* !! */  = (long)as.dglw("dgrk", dglt(int ), (int)122);
            }
            var2 = as.c;
            while (true) {
                if ((v1 /* !! */  = (cfr_temp_1 = as.hi - as.dglw("dgrl", dgpu(int ), (int)18)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v1 /* !! */  == as.dglw("dgrm", dglt(int ), (int)123)) break;
                v1 /* !! */  = (long)as.dglw("dgrn", dglt(int ), (int)124);
            }
            var1_1 = as.b;
            v2 /* !! */  = as.hi;
            if (true) ** GOTO lbl17
            block22: while (true) {
                v2 /* !! */  = (long)(v3 - as.dglw("dgro", dgpu(int ), (int)19));
lbl17:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case -2018393361: {
                        v3 = as.dglw("dgrp", dgpu(int ), (int)20);
                        continue block22;
                    }
                    case -1365115180: {
                        v3 = as.dglw("dgrq", dgpu(int ), (int)21);
                        continue block22;
                    }
                    case 380296816: {
                        v3 = as.dglw("dgrr", dgpu(int ), (int)22);
                        continue block22;
                    }
                    case 1857504290: {
                        break block22;
                    }
                }
                break;
            }
            var0_2 = as.a;
            if (var2) {
                throw null;
lbl32:
                // 5 sources

                return;
            }
            if (var0_2 || var0_2) ** GOTO lbl32
            v4 /* !! */  = as.hi;
            if (true) ** GOTO lbl39
            block24: while (true) {
                v4 /* !! */  = (long)(as.dglw("dgrt", dgpu(int ), (int)24) - as.dglw("dgrs", dgpu(int ), (int)23));
lbl39:
                // 2 sources

                switch ((int)v4 /* !! */ ) {
                    case -2142245419: {
                        continue block24;
                    }
                    case 1857504290: {
                        break block24;
                    }
                }
                break;
            }
            if (as.draggingElement == null) break block29;
            if (var0_2 || var0_2) ** GOTO lbl32
            v5 /* !! */  = as.hi;
            if (true) ** GOTO lbl50
            block25: while (true) {
                v5 /* !! */  = (long)(as.dglw("dgrv", dgpu(int ), (int)26) - as.dglw("dgru", dgpu(int ), (int)25));
lbl50:
                // 2 sources

                switch ((int)v5 /* !! */ ) {
                    case -1770543386: {
                        continue block25;
                    }
                    case 1857504290: {
                        break block25;
                    }
                }
                break;
            }
            v6 = aj.getInstance();
            v7 /* !! */  = as.hi;
            if (true) ** GOTO lbl60
            block26: while (true) {
                v7 /* !! */  = (long)(v8 - as.dglw("dgrw", dgpu(int ), (int)27));
lbl60:
                // 2 sources

                switch ((int)v7 /* !! */ ) {
                    case -2136246342: {
                        v8 = as.dglw("dgrx", dgpu(int ), (int)28);
                        continue block26;
                    }
                    case 73591890: {
                        v8 = as.dglw("dgry", dgpu(int ), (int)29);
                        continue block26;
                    }
                    case 1362017319: {
                        v8 = as.dglw("dgrz", dgpu(int ), (int)30);
                        continue block26;
                    }
                    case 1857504290: {
                        break block26;
                    }
                }
                break;
            }
            v6.save();
            if (var0_2 || var0_2) ** GOTO lbl32
            while (true) {
                if ((v9 /* !! */  = (cfr_temp_2 = as.hi - as.dglw("dgsa", dgpu(int ), (int)31)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v9 /* !! */  == as.dglw("dgsb", dglt(int ), (int)125)) break;
                v9 /* !! */  = (long)as.dglw("dgsc", dglt(int ), (int)126);
            }
            as.draggingElement = null;
            if (var0_2) ** GOTO lbl32
        }
        if (!var0_2 && !var0_2) ** break;
        ** while (true)
    }

    private static /* synthetic */ int dglt(int n2) {
        return dglu[n2] ^ dglv[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void onMouseClick(class_11909 var0) {
        block124: {
            block121: {
                block123: {
                    block122: {
                        block120: {
                            var11_1 = as.c;
                            var10_2 /* !! */  = as.b;
                            var9_3 = as.a;
                            if (var11_1) {
                                throw null;
lbl6:
                                // 33 sources

                                return;
                            }
                            if (var9_3 || var9_3) ** GOTO lbl6
                            var1_4 = class_310.method_1551();
                            if (var9_3 || var9_3) ** GOTO lbl6
                            if (var1_4.field_1755 instanceof class_408) break block120;
                            if (var9_3) ** GOTO lbl6
                            return;
                        }
                        if (var9_3 || var9_3) ** GOTO lbl6
                        if (var0.method_74245() != 0) break block121;
                        if (var9_3 || var9_3) ** GOTO lbl6
                        var2_5 = as.getHudManager();
                        if (var9_3 || var9_3) ** GOTO lbl6
                        if (var2_5 != null) break block122;
                        if (var9_3) ** GOTO lbl6
                        return;
                    }
                    if (var9_3 || var9_3) ** GOTO lbl6
                    var3_7 = var2_5.toHudCoordinate(var0.comp_4798());
                    if (var9_3 || var9_3) ** GOTO lbl6
                    var5_9 = var2_5.toHudCoordinate(var0.comp_4799());
                    if (var9_3 || var9_3) ** GOTO lbl6
                    var7_11 = var2_5.getElementAt(var0.comp_4798(), var0.comp_4799());
                    if (var9_3 || var9_3) ** GOTO lbl6
                    if (var7_11 == null) break block123;
                    if (var9_3 || var9_3) ** GOTO lbl6
                    if (!(var7_11 instanceof ar)) break block123;
                    if (var9_3) ** GOTO lbl6
                    var8_13 = (ar)var7_11;
                    if (var9_3 || var9_3) ** GOTO lbl6
                    if (!var8_13.isDraggable()) break block123;
                    if (var9_3 || var9_3) ** GOTO lbl6
                    as.draggingElement = var7_11;
                    if (var9_3 || var9_3) ** GOTO lbl6
                    as.startX = (int)var3_7 - var7_11.getX();
                    if (var9_3 || var9_3) ** GOTO lbl6
                    as.startY = (int)var5_9 - var7_11.getY();
                    if (var9_3) ** GOTO lbl6
                }
                if (var9_3 || var9_3) ** GOTO lbl6
                if (var11_1) {
                    throw null;
                }
                ** GOTO lbl79
            }
            if (var9_3 || var9_3) ** GOTO lbl6
            if (var0.method_74245() != as.dglw("dgnj", dglt(int ), (int)38)) ** GOTO lbl79
            if (var9_3 || var9_3) ** GOTO lbl6
            var2_6 = as.getHudManager();
            if (var9_3 || var9_3) ** GOTO lbl6
            if (var2_6 != null) break block124;
            if (var9_3) ** GOTO lbl6
            return;
        }
        if (var9_3 || var9_3) ** GOTO lbl6
        var3_8 = var2_6.toHudCoordinate(var0.comp_4798());
        if (var9_3 || var9_3) ** GOTO lbl6
        var5_10 = var2_6.toHudCoordinate(var0.comp_4799());
        if (var9_3 || var9_3) ** GOTO lbl6
        var7_12 = var2_6.getElementAt(var0.comp_4798(), var0.comp_4799());
        if (var9_3) ** GOTO lbl6
        if (var10_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var10_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var9_3) ** GOTO lbl6
                if (var7_12 != null) ** GOTO lbl79
                if (var9_3 || var9_3) ** GOTO lbl6
                var8_14 = eb.getInstance();
                if (var9_3 || var9_3) ** GOTO lbl6
                if (var8_14 == null) ** GOTO lbl79
                if (var9_3 || var9_3) ** GOTO lbl6
                var1_4.method_1507((class_437)new mg(var1_4.field_1755));
                if (var9_3) ** GOTO lbl6
lbl79:
                // 5 sources

                if (!var9_3 && !var9_3) ** break;
                ** continue;
                return;
            }
lbl82:
            // 2 sources

            case 0: {
                var10_2 /* !! */  = (int)as.dglw("dgnk", dglt(int ), (int)39);
                if (var11_1) {
                    throw null;
                }
                ** GOTO lbl107
            }
            case 1: {
                var10_2 /* !! */  = (int)as.dglw("dgnl", dglt(int ), (int)40);
                if (var11_1) {
                    throw null;
                }
                ** GOTO lbl284
            }
lbl92:
            // 3 sources

            case 2: {
                var10_2 /* !! */  = (int)as.dglw("dgnm", dglt(int ), (int)41);
                if (var11_1) {
                    throw null;
                }
                ** GOTO lbl341
            }
            case 3: {
                var10_2 /* !! */  = (int)as.dglw("dgnn", dglt(int ), (int)42);
                if (var11_1) {
                    throw null;
                }
                ** GOTO lbl234
            }
lbl102:
            // 2 sources

            case 4: {
                var10_2 /* !! */  = (int)as.dglw("dgno", dglt(int ), (int)43);
                if (var11_1) {
                    throw null;
                }
                ** GOTO lbl212
            }
lbl107:
            // 3 sources

            case 5: {
                var10_2 /* !! */  = (int)as.dglw("dgnp", dglt(int ), (int)44);
                if (var11_1) {
                    throw null;
                }
                ** GOTO lbl317
            }
            case 6: {
                var10_2 /* !! */  = (int)as.dglw("dgnq", dglt(int ), (int)45);
                if (var11_1) {
                    throw null;
                }
                ** GOTO lbl170
            }
            case 7: {
                var10_2 /* !! */  = (int)as.dglw("dgnr", dglt(int ), (int)46);
                if (!var11_1) ** GOTO lbl92
                throw null;
            }
lbl121:
            // 4 sources

            case 8: {
                var10_2 /* !! */  = (int)as.dglw("dgns", dglt(int ), (int)47);
                if (var11_1) {
                    throw null;
                }
                ** GOTO lbl170
            }
            case 9: {
                var10_2 /* !! */  = (int)as.dglw("dgnt", dglt(int ), (int)48);
                if (var11_1) {
                    throw null;
                }
                ** GOTO lbl155
            }
lbl131:
            // 2 sources

            case 10: {
                var10_2 /* !! */  = (int)as.dglw("dgnu", dglt(int ), (int)49);
                if (var11_1) {
                    throw null;
                }
                ** GOTO lbl202
            }
lbl136:
            // 5 sources

            case 11: {
                var10_2 /* !! */  = (int)as.dglw("dgnv", dglt(int ), (int)50);
                if (var11_1) {
                    throw null;
                }
                ** GOTO lbl212
            }
lbl141:
            // 2 sources

            case 12: {
                var10_2 /* !! */  = (int)as.dglw("dgnw", dglt(int ), (int)51);
                if (!var11_1) ** GOTO lbl102
                throw null;
            }
lbl145:
            // 4 sources

            case 13: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var10_2 /* !! */  = (int)as.dglw("dgnx", dglt(int ), (int)52);
                    if (var11_1) {
                        throw null;
                    }
                    ** GOTO lbl329
                    break;
                }
            }
            case 14: {
                var10_2 /* !! */  = (int)as.dglw("dgny", dglt(int ), (int)53);
                if (!var11_1) ** GOTO lbl145
                throw null;
            }
lbl155:
            // 3 sources

            case 15: {
                var10_2 /* !! */  = (int)as.dglw("dgnz", dglt(int ), (int)54);
                if (var11_1) {
                    throw null;
                }
                ** GOTO lbl321
            }
lbl160:
            // 2 sources

            case 16: {
                var10_2 /* !! */  = (int)as.dglw("dgoa", dglt(int ), (int)55);
                if (var11_1) {
                    throw null;
                }
                ** GOTO lbl266
            }
            case 17: {
                var10_2 /* !! */  = (int)as.dglw("dgob", dglt(int ), (int)56);
                if (var11_1) {
                    throw null;
                }
                ** GOTO lbl202
            }
lbl170:
            // 3 sources

            case 18: {
                var10_2 /* !! */  = (int)as.dglw("dgoc", dglt(int ), (int)57);
                if (var11_1) {
                    throw null;
                }
                ** GOTO lbl266
            }
            case 19: {
                var10_2 /* !! */  = (int)as.dglw("dgod", dglt(int ), (int)58);
                if (!var11_1) ** GOTO lbl145
                throw null;
            }
lbl179:
            // 2 sources

            case 20: {
                var10_2 /* !! */  = (int)as.dglw("dgoe", dglt(int ), (int)59);
                if (var11_1) {
                    throw null;
                }
                ** GOTO lbl288
            }
            case 21: {
                var10_2 /* !! */  = (int)as.dglw("dgof", dglt(int ), (int)60);
                if (!var11_1) ** GOTO lbl136
                throw null;
            }
            case 22: {
                var10_2 /* !! */  = (int)as.dglw("dgog", dglt(int ), (int)61);
                if (!var11_1) ** GOTO lbl155
                throw null;
            }
            case 23: {
                var10_2 /* !! */  = (int)as.dglw("dgoh", dglt(int ), (int)62);
                if (var11_1) {
                    throw null;
                }
                ** GOTO lbl284
            }
lbl197:
            // 2 sources

            case 24: {
                var10_2 /* !! */  = (int)as.dglw("dgoi", dglt(int ), (int)63);
                if (var11_1) {
                    throw null;
                }
                ** GOTO lbl301
            }
lbl202:
            // 3 sources

            case 25: {
                var10_2 /* !! */  = (int)as.dglw("dgoj", dglt(int ), (int)64);
                if (var11_1) {
                    throw null;
                }
                ** GOTO lbl261
            }
            case 26: {
                var10_2 /* !! */  = (int)as.dglw("dgok", dglt(int ), (int)65);
                if (var11_1) {
                    throw null;
                }
                ** GOTO lbl337
            }
lbl212:
            // 3 sources

            case 27: {
                var10_2 /* !! */  = (int)as.dglw("dgol", dglt(int ), (int)66);
                if (var11_1) {
                    throw null;
                }
                ** GOTO lbl333
            }
            case 28: {
                var10_2 /* !! */  = (int)as.dglw("dgom", dglt(int ), (int)67);
                if (var11_1) {
                    throw null;
                }
                ** GOTO lbl253
            }
lbl222:
            // 2 sources

            case 29: {
                var10_2 /* !! */  = (int)as.dglw("dgon", dglt(int ), (int)68);
                if (!var11_1) ** GOTO lbl136
                throw null;
            }
lbl226:
            // 2 sources

            case 30: {
                var10_2 /* !! */  = (int)as.dglw("dgoo", dglt(int ), (int)69);
                if (!var11_1) ** GOTO lbl197
                throw null;
            }
            case 31: {
                var10_2 /* !! */  = (int)as.dglw("dgop", dglt(int ), (int)70);
                if (!var11_1) ** GOTO lbl121
                throw null;
            }
lbl234:
            // 2 sources

            case 32: {
                var10_2 /* !! */  = (int)as.dglw("dgoq", dglt(int ), (int)71);
                if (var11_1) {
                    throw null;
                }
                ** GOTO lbl261
            }
lbl239:
            // 2 sources

            case 33: {
                do {
                    var10_2 /* !! */  = (int)as.dglw("dgor", dglt(int ), (int)72);
                } while (!var11_1);
                throw null;
            }
lbl244:
            // 2 sources

            case 34: {
                var10_2 /* !! */  = (int)as.dglw("dgos", dglt(int ), (int)73);
                if (var11_1) {
                    throw null;
                }
                ** GOTO lbl270
            }
            case 35: {
                var10_2 /* !! */  = (int)as.dglw("dgot", dglt(int ), (int)74);
                if (!var11_1) ** GOTO lbl141
                throw null;
            }
lbl253:
            // 2 sources

            case 36: {
                var10_2 /* !! */  = (int)as.dglw("dgou", dglt(int ), (int)75);
                if (!var11_1) ** GOTO lbl160
                throw null;
            }
            case 37: {
                var10_2 /* !! */  = (int)as.dglw("dgov", dglt(int ), (int)76);
                if (!var11_1) ** GOTO lbl107
                throw null;
            }
lbl261:
            // 3 sources

            case 38: {
                var10_2 /* !! */  = (int)as.dglw("dgow", dglt(int ), (int)77);
                if (var11_1) {
                    throw null;
                }
                ** GOTO lbl321
            }
lbl266:
            // 4 sources

            case 39: {
                var10_2 /* !! */  = (int)as.dglw("dgox", dglt(int ), (int)78);
                if (!var11_1) ** GOTO lbl121
                throw null;
            }
lbl270:
            // 2 sources

            case 40: {
                var10_2 /* !! */  = (int)as.dglw("dgoy", dglt(int ), (int)79);
                if (!var11_1) ** GOTO lbl82
                throw null;
            }
            case 41: {
                var10_2 /* !! */  = (int)as.dglw("dgoz", dglt(int ), (int)80);
                if (var11_1) {
                    throw null;
                }
                ** GOTO lbl329
            }
            case 42: {
                var10_2 /* !! */  = (int)as.dglw("dgpa", dglt(int ), (int)81);
                if (var11_1) {
                    throw null;
                }
                ** GOTO lbl345
            }
lbl284:
            // 3 sources

            case 43: {
                var10_2 /* !! */  = (int)as.dglw("dgpb", dglt(int ), (int)82);
                if (!var11_1) ** GOTO lbl136
                throw null;
            }
lbl288:
            // 2 sources

            case 44: {
                var10_2 /* !! */  = (int)as.dglw("dgpc", dglt(int ), (int)83);
                if (!var11_1) ** GOTO lbl121
                throw null;
            }
            case 45: {
                var10_2 /* !! */  = (int)as.dglw("dgpd", dglt(int ), (int)84);
                if (var11_1) {
                    throw null;
                }
                ** GOTO lbl349
            }
            case 46: {
                var10_2 /* !! */  = (int)as.dglw("dgpe", dglt(int ), (int)85);
                if (!var11_1) ** GOTO lbl222
                throw null;
            }
lbl301:
            // 2 sources

            case 47: {
                var10_2 /* !! */  = (int)as.dglw("dgpf", dglt(int ), (int)86);
                if (!var11_1) ** GOTO lbl136
                throw null;
            }
lbl305:
            // 2 sources

            case 48: {
                var10_2 /* !! */  = (int)as.dglw("dgpg", dglt(int ), (int)87);
                if (!var11_1) ** GOTO lbl239
                throw null;
            }
            case 49: {
                var10_2 /* !! */  = (int)as.dglw("dgph", dglt(int ), (int)88);
                if (!var11_1) ** GOTO lbl145
                throw null;
            }
            case 50: {
                var10_2 /* !! */  = (int)as.dglw("dgpi", dglt(int ), (int)89);
                if (var11_1) {
                    throw null;
                }
            }
lbl317:
            // 4 sources

            case 51: {
                var10_2 /* !! */  = (int)as.dglw("dgpj", dglt(int ), (int)90);
                if (!var11_1) ** GOTO lbl226
                throw null;
            }
lbl321:
            // 3 sources

            case 52: {
                var10_2 /* !! */  = (int)as.dglw("dgpk", dglt(int ), (int)91);
                if (!var11_1) ** GOTO lbl305
                throw null;
            }
            case 53: {
                var10_2 /* !! */  = (int)as.dglw("dgpl", dglt(int ), (int)92);
                if (!var11_1) ** GOTO lbl131
                throw null;
            }
lbl329:
            // 4 sources

            case 54: {
                var10_2 /* !! */  = (int)as.dglw("dgpm", dglt(int ), (int)93);
                if (!var11_1) ** GOTO lbl244
                throw null;
            }
lbl333:
            // 2 sources

            case 55: {
                var10_2 /* !! */  = (int)as.dglw("dgpn", dglt(int ), (int)94);
                if (!var11_1) ** GOTO lbl179
                throw null;
            }
lbl337:
            // 2 sources

            case 56: {
                var10_2 /* !! */  = (int)as.dglw("dgpo", dglt(int ), (int)95);
                if (!var11_1) ** GOTO lbl266
                throw null;
            }
lbl341:
            // 2 sources

            case 57: {
                var10_2 /* !! */  = (int)as.dglw("dgpp", dglt(int ), (int)96);
                if (!var11_1) ** GOTO lbl92
                throw null;
            }
lbl345:
            // 2 sources

            case 58: {
                var10_2 /* !! */  = (int)as.dglw("dgpq", dglt(int ), (int)97);
                if (!var11_1) ** GOTO lbl329
                throw null;
            }
lbl349:
            // 3 sources

            case 59: {
                var10_2 /* !! */  = (int)as.dglw("dgpr", dglt(int ), (int)98);
                if (!var11_1) break;
                throw null;
            }
            case 60: {
                var10_2 /* !! */  = (int)as.dglw("dgps", dglt(int ), (int)99);
                if (!var11_1) ** GOTO lbl349
                throw null;
            }
            case 61: 
        }
        var10_2 /* !! */  = (int)as.dglw("dgpt", dglt(int ), (int)100);
        ** while (!var11_1)
lbl360:
        // 1 sources

        throw null;
    }

    public as() {
    }

    private static /* synthetic */ void dgvw() {
        as.dglu[100] = -1992165030;
        as.dglu[101] = 1110983679;
        as.dglu[102] = 1369972128;
        as.dglu[103] = 1843463114;
        as.dglu[104] = -2065801733;
        as.dglu[105] = 1339592465;
        as.dglu[106] = -1906656397;
        as.dglu[107] = -1483903484;
        as.dglu[108] = -1910310714;
        as.dglu[109] = 385107975;
        as.dglu[110] = -292264487;
        as.dglu[111] = -1611664666;
        as.dglu[112] = -562161122;
        as.dglu[113] = -1026613844;
        as.dglu[114] = 208117166;
        as.dglu[115] = 647450903;
        as.dglu[116] = 125883104;
        as.dglu[117] = -1654303171;
        as.dglu[118] = -805148200;
        as.dglu[119] = -111514670;
        as.dglu[120] = 911284824;
        as.dglu[121] = 605098349;
        as.dglu[122] = 483369931;
        as.dglu[123] = 201444861;
        as.dglu[124] = -596939734;
        as.dglu[125] = -378562688;
        as.dglu[126] = -800974566;
        as.dglu[127] = 746864118;
        as.dglu[128] = 1973377164;
        as.dglu[129] = -2116648581;
        as.dglu[130] = 2015147881;
        as.dglu[131] = 1067429805;
        as.dglu[132] = -921081286;
        as.dglu[133] = -555473807;
        as.dglu[134] = 120046244;
        as.dglu[135] = 1178230461;
        as.dglu[136] = -2065811862;
        as.dglu[137] = -291763345;
        as.dglu[138] = -1905160140;
        as.dglu[139] = 1359130870;
        as.dglu[140] = -1232270564;
        as.dglu[141] = 1074417711;
        as.dglu[142] = 248657514;
        as.dglu[143] = 69089440;
        as.dglu[144] = 782276346;
        as.dglu[145] = 1640336367;
        as.dglu[146] = 1894367309;
        as.dglu[147] = -177033226;
        as.dglu[148] = 532666031;
        as.dglu[149] = -1768957667;
        as.dglu[150] = -1856057071;
        as.dglu[151] = -120062536;
        as.dglu[152] = -1199626351;
        as.dglu[153] = 1151475395;
        as.dglu[154] = 148848762;
        as.dglu[155] = -769173674;
        as.dglu[156] = -117443706;
        as.dglu[157] = 1234699842;
        as.dglu[158] = 570691294;
        as.dglu[159] = 1733670727;
        as.dglu[160] = -538663061;
        as.dglu[161] = -268340624;
        as.dglu[162] = 2030774595;
        as.dglu[163] = -1783536680;
        as.dglu[164] = -803989322;
        as.dglu[165] = -528828314;
        as.dglu[166] = -195582263;
        as.dglu[167] = 2037663880;
        as.dglu[168] = 1097670315;
        as.dglu[169] = -153305337;
        as.dglu[170] = -254808036;
        as.dglu[171] = -204717841;
        as.dglu[172] = -1328759676;
        as.dglu[173] = 1373557327;
        as.dglu[174] = 1748982756;
        as.dglu[175] = -12139772;
        as.dglu[176] = -869765572;
        as.dglu[177] = -1159537805;
        as.dglu[178] = -404834970;
        as.dglu[179] = -1627773024;
        as.dglu[180] = 200329193;
        as.dglu[181] = 1155250284;
        as.dglu[182] = -846421142;
        as.dglu[183] = -1388609386;
        as.dglu[184] = 1821239756;
    }

    private static /* synthetic */ void dgvz() {
        as.dgpv[0] = -2247316306945224163L;
        as.dgpv[1] = 5218898500568981057L;
        as.dgpv[2] = -1380064093490909056L;
        as.dgpv[3] = 6670667243560179160L;
        as.dgpv[4] = 4601492028541993579L;
        as.dgpv[5] = 8743201893721659984L;
        as.dgpv[6] = -8272164943282665269L;
        as.dgpv[7] = -4369532342170940099L;
        as.dgpv[8] = 5145445902395679934L;
        as.dgpv[9] = -7066882456543850047L;
        as.dgpv[10] = 2204539203233045066L;
        as.dgpv[11] = 9112375213177365222L;
        as.dgpv[12] = -2628695396029705564L;
        as.dgpv[13] = 304727583081699093L;
        as.dgpv[14] = 4821625987636937546L;
        as.dgpv[15] = 345375395474858636L;
        as.dgpv[16] = -3714625821874833918L;
        as.dgpv[17] = 6625738374929867483L;
        as.dgpv[18] = -4753439941736440572L;
        as.dgpv[19] = 3156793166996605759L;
        as.dgpv[20] = 3770492172116523242L;
        as.dgpv[21] = -130043548130759576L;
        as.dgpv[22] = -9060361442984414606L;
        as.dgpv[23] = -8726955244503883119L;
        as.dgpv[24] = -8280835459778174900L;
        as.dgpv[25] = 2907730301637030382L;
        as.dgpv[26] = -7918970792394858573L;
        as.dgpv[27] = -4605701631754968045L;
        as.dgpv[28] = -3066414161064917460L;
        as.dgpv[29] = -3429445021433084397L;
        as.dgpv[30] = 4153191500223587959L;
        as.dgpv[31] = -8210414051896280200L;
        as.dgpv[32] = 7188115671020121008L;
        as.dgpv[33] = 6293070786382435578L;
        as.dgpv[34] = -8489905177754302752L;
        as.dgpv[35] = -4051805205742170137L;
        as.dgpv[36] = 2940163887986824159L;
        as.dgpv[37] = -1068371007423000055L;
        as.dgpv[38] = 1892394119331001776L;
        as.dgpv[39] = -2916208837381832913L;
        as.dgpv[40] = 8781797050737360006L;
        as.dgpv[41] = -829009564971509673L;
        as.dgpv[42] = -8611959610411818229L;
        as.dgpv[43] = 8829448947589686724L;
        as.dgpv[44] = 6738179037981139891L;
        as.dgpv[45] = -3664961163353825214L;
        as.dgpv[46] = -6564255842545262391L;
        as.dgpv[47] = -7921866632758070L;
        as.dgpv[48] = -3640656683352749250L;
        as.dgpv[49] = 5602814517455448959L;
        as.dgpv[50] = -8816729090798483616L;
        as.dgpv[51] = 6231136939438965482L;
        as.dgpv[52] = 334651733113009900L;
        as.dgpv[53] = -4141337825243321112L;
        as.dgpv[54] = -7131715002707014481L;
        as.dgpv[55] = 4508730850907335236L;
        as.dgpv[56] = -3266469873663347277L;
        as.dgpv[57] = -9000721343080713952L;
        as.dgpv[58] = -7128204449008980474L;
        as.dgpv[59] = -1715512948094840528L;
        as.dgpv[60] = 3060188320380025532L;
        as.dgpv[61] = 6250423396609598679L;
        as.dgpv[62] = 7377586038120282936L;
        as.dgpv[63] = 168751858322787462L;
        as.dgpv[64] = 6341450825296888882L;
        as.dgpv[65] = 7928001022090665772L;
        as.dgpv[66] = -4228548364304721172L;
        as.dgpv[67] = 1613257372722773816L;
        as.dgpv[68] = 2263175955232171923L;
        as.dgpv[69] = -5779081869230237023L;
    }

    private static /* synthetic */ void dgwa() {
        as.dgpw[0] = -233827680827099342L;
        as.dgpw[1] = -7135044587475630415L;
        as.dgpw[2] = 1209100218317298512L;
        as.dgpw[3] = -5810836403160087936L;
        as.dgpw[4] = 2351547110166454222L;
        as.dgpw[5] = 5337217445929710940L;
        as.dgpw[6] = -7346936617052951133L;
        as.dgpw[7] = 4283953779240541311L;
        as.dgpw[8] = 4039128187305111762L;
        as.dgpw[9] = 4654613753426392542L;
        as.dgpw[10] = -2123294443043567186L;
        as.dgpw[11] = 8485590608873335420L;
        as.dgpw[12] = 4827203967728465290L;
        as.dgpw[13] = 2508669668097546815L;
        as.dgpw[14] = 729320538381118163L;
        as.dgpw[15] = 8090420167096277668L;
        as.dgpw[16] = 8688571673171230298L;
        as.dgpw[17] = -5713833181031789374L;
        as.dgpw[18] = 4108049957392372477L;
        as.dgpw[19] = -9117113780044036025L;
        as.dgpw[20] = -2125670789645542055L;
        as.dgpw[21] = 4949923810850318829L;
        as.dgpw[22] = -1306921401531900687L;
        as.dgpw[23] = 2871272956961090146L;
        as.dgpw[24] = 4226968631029695085L;
        as.dgpw[25] = -9046440360641373686L;
        as.dgpw[26] = 1269870509623575002L;
        as.dgpw[27] = 7787098051819063637L;
        as.dgpw[28] = -1399579405824348274L;
        as.dgpw[29] = 6238395212876232720L;
        as.dgpw[30] = 5390319896018448801L;
        as.dgpw[31] = 986111422064944631L;
        as.dgpw[32] = 7643486930995195783L;
        as.dgpw[33] = 3885189751384799508L;
        as.dgpw[34] = 2668979220934769177L;
        as.dgpw[35] = -4805436093565553616L;
        as.dgpw[36] = 8967034651677374979L;
        as.dgpw[37] = -1326163356302748649L;
        as.dgpw[38] = -4935062264114472832L;
        as.dgpw[39] = -4374494553871429261L;
        as.dgpw[40] = -3634771734314978087L;
        as.dgpw[41] = -4094652470139931647L;
        as.dgpw[42] = 7839792114947386009L;
        as.dgpw[43] = -1298444825088363388L;
        as.dgpw[44] = -7947855943786135774L;
        as.dgpw[45] = 2342581247166307773L;
        as.dgpw[46] = -4422922973770429463L;
        as.dgpw[47] = 681186251978521962L;
        as.dgpw[48] = -1552687892086098129L;
        as.dgpw[49] = -7700976891271821512L;
        as.dgpw[50] = 8041404364881828482L;
        as.dgpw[51] = -2843083083765679102L;
        as.dgpw[52] = -5489316875968740786L;
        as.dgpw[53] = 302772298997940348L;
        as.dgpw[54] = -132785636149582563L;
        as.dgpw[55] = 2913399309804197948L;
        as.dgpw[56] = -2204068850276430912L;
        as.dgpw[57] = -2065598029120611623L;
        as.dgpw[58] = -5243281863293042382L;
        as.dgpw[59] = 4248081790869088926L;
        as.dgpw[60] = 3952822712703468264L;
        as.dgpw[61] = 8573202984596970721L;
        as.dgpw[62] = 7379557974275415018L;
        as.dgpw[63] = 3477500368693943831L;
        as.dgpw[64] = 8742204839509867743L;
        as.dgpw[65] = -5752932474072202471L;
        as.dgpw[66] = -3666740083276396196L;
        as.dgpw[67] = 1954701372012731705L;
        as.dgpw[68] = -7840718958172021289L;
        as.dgpw[69] = -6827327428292570727L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static av getHudManager() {
        block62: {
            v0 /* !! */  = as.hi;
            if (true) ** GOTO lbl5
            block42: while (true) {
                v0 /* !! */  = (long)(v1 - as.dglw("dgtl", dgpu(int ), (int)42));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case 1458504056: {
                        v1 = as.dglw("dgtm", dgpu(int ), (int)43);
                        continue block42;
                    }
                    case 1511062283: {
                        v1 = as.dglw("dgtn", dgpu(int ), (int)44);
                        continue block42;
                    }
                    case 1857504290: {
                        break block42;
                    }
                    case 1960149380: {
                        v1 = as.dglw("dgto", dgpu(int ), (int)45);
                        continue block42;
                    }
                }
                break;
            }
            var2 = as.c;
            v2 /* !! */  = as.hi;
            if (true) ** GOTO lbl22
            block43: while (true) {
                v2 /* !! */  = (long)(v3 - as.dglw("dgtp", dgpu(int ), (int)46));
lbl22:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case -60743486: {
                        v3 = as.dglw("dgtq", dgpu(int ), (int)47);
                        continue block43;
                    }
                    case 1118885767: {
                        v3 = as.dglw("dgtr", dgpu(int ), (int)48);
                        continue block43;
                    }
                    case 1857504290: {
                        break block43;
                    }
                }
                break;
            }
            var1_1 /* !! */  = as.b;
            while (true) {
                if ((v4 /* !! */  = (cfr_temp_0 = as.hi - as.dglw("dgts", dgpu(int ), (int)49)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v4 /* !! */  == as.dglw("dgtt", dglt(int ), (int)151)) break;
                v4 /* !! */  = (long)as.dglw("dgtu", dglt(int ), (int)152);
            }
            var0_2 = as.a;
            if (var2) {
                throw null;
lbl40:
                // 5 sources

                return null;
            }
            if (var0_2 || var0_2) ** GOTO lbl40
            v5 /* !! */  = as.hi;
            if (true) ** GOTO lbl47
            block46: while (true) {
                v5 /* !! */  = (long)(as.dglw("dgtw", dgpu(int ), (int)51) - as.dglw("dgtv", dgpu(int ), (int)50));
lbl47:
                // 2 sources

                switch ((int)v5 /* !! */ ) {
                    case 981245597: {
                        continue block46;
                    }
                    case 1857504290: {
                        break block46;
                    }
                }
                break;
            }
            if (d.getInstance() != null) break block62;
            if (var0_2) ** GOTO lbl40
            return null;
        }
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var0_2 || var0_2) ** GOTO lbl40
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_1 = as.hi - as.dglw("dgtx", dgpu(int ), (int)52)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == as.dglw("dgty", dglt(int ), (int)153)) break;
                    v6 /* !! */  = (long)as.dglw("dgtz", dglt(int ), (int)154);
                }
                v7 = d.getInstance();
                v8 /* !! */  = as.hi;
                if (true) ** GOTO lbl70
                block48: while (true) {
                    v8 /* !! */  = (long)(as.dglw("dgub", dgpu(int ), (int)54) - as.dglw("dgua", dgpu(int ), (int)53));
lbl70:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -378857037: {
                            continue block48;
                        }
                        case 1857504290: {
                            break block48;
                        }
                    }
                    break;
                }
                if (v7.getManager() != null) ** GOTO lbl78
                if (var0_2) ** GOTO lbl40
                return null;
lbl78:
                // 1 sources

                if (!var0_2 && !var0_2) ** break;
                ** continue;
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_2 = as.hi - as.dglw("dguc", dgpu(int ), (int)55)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == as.dglw("dgud", dglt(int ), (int)155)) break;
                    v9 /* !! */  = (long)as.dglw("dgue", dglt(int ), (int)156);
                }
                v10 = d.getInstance();
                v11 /* !! */  = as.hi;
                if (true) ** GOTO lbl90
                block50: while (true) {
                    v11 /* !! */  = (long)(v12 - as.dglw("dguf", dgpu(int ), (int)56));
lbl90:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -1655329871: {
                            v12 = as.dglw("dgug", dgpu(int ), (int)57);
                            continue block50;
                        }
                        case -807998873: {
                            v12 = as.dglw("dguh", dgpu(int ), (int)58);
                            continue block50;
                        }
                        case 1857504290: {
                            break block50;
                        }
                    }
                    break;
                }
                v13 = v10.getManager();
                v14 /* !! */  = as.hi;
                if (true) ** GOTO lbl104
                block51: while (true) {
                    v14 /* !! */  = (long)(v15 - as.dglw("dgui", dgpu(int ), (int)59));
lbl104:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case -313110215: {
                            v15 = as.dglw("dguj", dgpu(int ), (int)60);
                            continue block51;
                        }
                        case -244818914: {
                            v15 = as.dglw("dguk", dgpu(int ), (int)61);
                            continue block51;
                        }
                        case 1857504290: {
                            break block51;
                        }
                    }
                    break;
                }
                return v13.getHudManager();
            }
lbl114:
            // 2 sources

            case 0: {
                var1_1 /* !! */  = (int)as.dglw("dgul", dglt(int ), (int)157);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl142
            }
            case 1: {
                var1_1 /* !! */  = (int)as.dglw("dgum", dglt(int ), (int)158);
                if (!var2) ** GOTO lbl114
                throw null;
            }
lbl123:
            // 2 sources

            case 2: {
                var1_1 /* !! */  = (int)as.dglw("dgun", dglt(int ), (int)159);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl138
            }
            case 3: {
                var1_1 /* !! */  = (int)as.dglw("dguo", dglt(int ), (int)160);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl154
            }
            case 4: {
                var1_1 /* !! */  = (int)as.dglw("dgup", dglt(int ), (int)161);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl142
            }
lbl138:
            // 2 sources

            case 5: {
                var1_1 /* !! */  = (int)as.dglw("dguq", dglt(int ), (int)162);
                if (var2) {
                    throw null;
                }
            }
lbl142:
            // 5 sources

            case 6: {
                var1_1 /* !! */  = (int)as.dglw("dgur", dglt(int ), (int)163);
                if (!var2) ** GOTO lbl123
                throw null;
            }
            case 7: {
                var1_1 /* !! */  = (int)as.dglw("dgus", dglt(int ), (int)164);
                if (!var2) break;
                throw null;
            }
lbl150:
            // 2 sources

            case 8: {
                var1_1 /* !! */  = (int)as.dglw("dgut", dglt(int ), (int)165);
                if (!var2) break;
                throw null;
            }
lbl154:
            // 2 sources

            case 9: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)as.dglw("dguu", dglt(int ), (int)166);
                    if (!var2) ** GOTO lbl150
                    throw null;
                }
            }
            case 10: 
        }
        var1_1 /* !! */  = (int)as.dglw("dguv", dglt(int ), (int)167);
        ** while (!var2)
lbl162:
        // 1 sources

        throw null;
    }
}

