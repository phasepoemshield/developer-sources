/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_345
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.text.Normalizer;
import java.util.Locale;
import java.util.regex.Pattern;
import net.minecraft.class_345;
import ruhack.phobia.aw;
import ruhack.phobia.bp;
import ruhack.phobia.ds;
import ruhack.phobia.du;
import ruhack.phobia.ee;

public final class fg
extends ds {
    private static final long pu = 9183591902060872298L;
    public static final boolean c;
    private static final Pattern LEGACY_FORMATTING;
    private long lastWarningAt;
    public static final int b;
    private static int[] ikan;
    private static long[] ikav;
    private static long[] ikaw;
    private static int[] ikao;
    private static final Pattern SEPARATORS;
    public static final boolean a;
    private static fg instance;

    private static /* synthetic */ void ikjn() {
        fg.ikan[0] = -1671833220;
        fg.ikan[1] = 1913945693;
        fg.ikan[2] = 1586554904;
        fg.ikan[3] = -2031772333;
        fg.ikan[4] = 817177924;
        fg.ikan[5] = -431080647;
        fg.ikan[6] = -1369477615;
        fg.ikan[7] = 253194153;
        fg.ikan[8] = -492884233;
        fg.ikan[9] = -1629971873;
        fg.ikan[10] = -1076714334;
        fg.ikan[11] = -1418536820;
        fg.ikan[12] = -1111555807;
        fg.ikan[13] = -1728250212;
        fg.ikan[14] = -1280478468;
        fg.ikan[15] = -544869331;
        fg.ikan[16] = -42619243;
        fg.ikan[17] = 1578373514;
        fg.ikan[18] = 1244871715;
        fg.ikan[19] = 2036312729;
        fg.ikan[20] = 1523600733;
        fg.ikan[21] = -1023991635;
        fg.ikan[22] = 23105241;
        fg.ikan[23] = 1277852118;
        fg.ikan[24] = 1749094958;
        fg.ikan[25] = -181403798;
        fg.ikan[26] = 723778882;
        fg.ikan[27] = 1239829025;
        fg.ikan[28] = -1014883952;
        fg.ikan[29] = -6675037;
        fg.ikan[30] = 1662847132;
        fg.ikan[31] = -1620890664;
        fg.ikan[32] = 1286856886;
        fg.ikan[33] = 528178319;
        fg.ikan[34] = 2070429197;
        fg.ikan[35] = -1907821141;
        fg.ikan[36] = -587893904;
        fg.ikan[37] = 1778030988;
        fg.ikan[38] = 1556064683;
        fg.ikan[39] = 1023757171;
        fg.ikan[40] = 923445799;
        fg.ikan[41] = 2034815861;
        fg.ikan[42] = -1559920036;
        fg.ikan[43] = -281819986;
        fg.ikan[44] = 2013406927;
        fg.ikan[45] = -1679236035;
        fg.ikan[46] = -503402476;
        fg.ikan[47] = -422825827;
        fg.ikan[48] = -334772917;
        fg.ikan[49] = -1481178712;
        fg.ikan[50] = 1922665160;
        fg.ikan[51] = -2055102317;
        fg.ikan[52] = -2016755623;
        fg.ikan[53] = 640328829;
        fg.ikan[54] = 1285506236;
        fg.ikan[55] = 1967862200;
        fg.ikan[56] = -910102893;
        fg.ikan[57] = 1858779716;
        fg.ikan[58] = 832254951;
        fg.ikan[59] = -478061011;
        fg.ikan[60] = 496335763;
        fg.ikan[61] = 1860855128;
        fg.ikan[62] = -2054307336;
        fg.ikan[63] = -1673412923;
        fg.ikan[64] = 340557232;
        fg.ikan[65] = -425599864;
        fg.ikan[66] = 1058603702;
        fg.ikan[67] = 214495217;
        fg.ikan[68] = 368512663;
        fg.ikan[69] = 907821579;
        fg.ikan[70] = 925972284;
        fg.ikan[71] = -1036415655;
        fg.ikan[72] = -4601134;
        fg.ikan[73] = 780960058;
        fg.ikan[74] = 540787138;
        fg.ikan[75] = 1715632490;
        fg.ikan[76] = -696133038;
        fg.ikan[77] = 1957202931;
        fg.ikan[78] = -1574220416;
        fg.ikan[79] = -1551506571;
        fg.ikan[80] = 564062232;
        fg.ikan[81] = 816547825;
        fg.ikan[82] = -1664078336;
        fg.ikan[83] = -1815756384;
        fg.ikan[84] = 318417909;
        fg.ikan[85] = 785695085;
        fg.ikan[86] = -1082114990;
        fg.ikan[87] = 686928438;
        fg.ikan[88] = -1290999407;
        fg.ikan[89] = 1818392317;
        fg.ikan[90] = 1571402433;
        fg.ikan[91] = 1669166723;
        fg.ikan[92] = 1328876601;
        fg.ikan[93] = -446377064;
        fg.ikan[94] = 1327025677;
        fg.ikan[95] = -1960411094;
        fg.ikan[96] = 1209056608;
        fg.ikan[97] = 1891018916;
        fg.ikan[98] = 1760573016;
        fg.ikan[99] = 650264038;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static boolean shouldBlockExit() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_1 = fg.pu - fg.ikap("ikax", ikau(int ), (int)0)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == fg.ikap("ikay", ikam(int ), (int)4)) break;
            v0 /* !! */  = (long)fg.ikap("ikaz", ikam(int ), (int)5);
        }
        var2 = fg.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_2 = fg.pu - fg.ikap("ikba", ikau(int ), (int)1)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == fg.ikap("ikbb", ikam(int ), (int)6)) break;
            v1 /* !! */  = (long)fg.ikap("ikbc", ikam(int ), (int)7);
        }
        var1_1 /* !! */  = fg.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_3 = fg.pu - fg.ikap("ikbd", ikau(int ), (int)2)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == fg.ikap("ikbe", ikam(int ), (int)8)) {
                var0_2 = fg.a;
                if (var2) {
                    throw null;
                }
                break;
            }
            v2 /* !! */  = (long)fg.ikap("ikbf", ikam(int ), (int)9);
        }
        if (var0_2 || var0_2) return (boolean)fg.ikap("ikbg", ikam(int ), (int)10);
        v3 /* !! */  = fg.pu;
        if (true) ** GOTO lbl27
        block35: while (true) {
            v3 /* !! */  = (long)(v4 - fg.ikap("ikbh", ikau(int ), (int)3));
lbl27:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -2013426051: {
                    v4 = fg.ikap("ikbi", ikau(int ), (int)4);
                    continue block35;
                }
                case -1669463446: {
                    break block35;
                }
                case -759505318: {
                    v4 = fg.ikap("ikbj", ikau(int ), (int)5);
                    continue block35;
                }
                case -159613841: {
                    v4 = fg.ikap("ikbk", ikau(int ), (int)6);
                    continue block35;
                }
            }
            break;
        }
        if (fg.instance == null) ** GOTO lbl91
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block36: while (true) {
            block59: {
                switch (cfr_temp_0 == -2147483648 ? var1_1 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var0_2) return (boolean)fg.ikap("ikbg", ikam(int ), (int)10);
                        v5 /* !! */  = fg.pu;
                        block37: while (true) {
                            switch ((int)v5 /* !! */ ) {
                                case -1669463446: {
                                    break block37;
                                }
                                case -1577691592: {
                                    v6 = fg.ikap("ikbm", ikau(int ), (int)8);
                                    ** GOTO lbl59
                                }
                                case -1455867008: {
                                    v6 = fg.ikap("ikbn", ikau(int ), (int)9);
                                    ** GOTO lbl59
                                }
                                case 808529054: {
                                    v6 = fg.ikap("ikbo", ikau(int ), (int)10);
lbl59:
                                    // 3 sources

                                    v5 /* !! */  = (long)(v6 - fg.ikap("ikbl", ikau(int ), (int)7));
                                    continue block37;
                                }
                            }
                            break;
                        }
                        v7 /* !! */  = fg.pu;
                        block38: while (true) {
                            switch ((int)v7 /* !! */ ) {
                                case -1669463446: {
                                    break block38;
                                }
                                case 175111941: {
                                    v7 /* !! */  = (long)(fg.ikap("ikbq", ikau(int ), (int)12) - fg.ikap("ikbp", ikau(int ), (int)11));
                                    continue block38;
                                }
                            }
                            break;
                        }
                        if (!fg.instance.isState()) ** GOTO lbl91
                        if (var0_2) return (boolean)fg.ikap("ikbg", ikam(int ), (int)10);
                        v8 /* !! */  = fg.pu;
                        block39: while (true) {
                            switch ((int)v8 /* !! */ ) {
                                case -1669463446: {
                                    break block39;
                                }
                                case 926151499: {
                                    v8 /* !! */  = (long)(fg.ikap("ikbs", ikau(int ), (int)14) - fg.ikap("ikbr", ikau(int ), (int)13));
                                    continue block39;
                                }
                            }
                            break;
                        }
                        while (true) {
                            if ((v9 /* !! */  = (cfr_temp_4 = fg.pu - fg.ikap("ikbt", ikau(int ), (int)15)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                            if (v9 /* !! */  != fg.ikap("ikbu", ikam(int ), (int)11)) ** GOTO lbl85
                            if (fg.instance.hasPvpBossBar()) {
                                break;
                            }
                            ** GOTO lbl91
lbl85:
                            // 1 sources

                            v9 /* !! */  = (long)fg.ikap("ikbv", ikam(int ), (int)12);
                        }
                        if (var0_2) return (boolean)fg.ikap("ikbg", ikam(int ), (int)10);
                        v10 = fg.ikap("ikbw", ikam(int ), (int)13);
                        if (!var2) return (boolean)v10;
                        throw null;
lbl91:
                        // 3 sources

                        if (var0_2 || var0_2) {
                            return (boolean)fg.ikap("ikbg", ikam(int ), (int)10);
                        }
                        v10 = fg.ikap("ikbx", ikam(int ), (int)14);
                        return (boolean)v10;
                    }
                    case 0: {
                        var1_1 /* !! */  = (int)fg.ikap("ikby", ikam(int ), (int)15);
                        cfr_temp_0 = 3;
                        if (var2) {
                            throw null;
                        }
                        break block59;
                    }
                    case 1: {
                        var1_1 /* !! */  = (int)fg.ikap("ikbz", ikam(int ), (int)16);
                        cfr_temp_0 = 6;
                        if (var2) {
                            throw null;
                        }
                        break block59;
                    }
                    case 4: {
                        var1_1 /* !! */  = (int)fg.ikap("ikcc", ikam(int ), (int)19);
                        if (var2) {
                            throw null;
                        }
                    }
                    case 2: {
                        var1_1 /* !! */  = (int)fg.ikap("ikca", ikam(int ), (int)17);
                        cfr_temp_0 = 8;
                        if (var2) {
                            throw null;
                        }
                        break block59;
                    }
                    case 5: {
                        var1_1 /* !! */  = (int)fg.ikap("ikcd", ikam(int ), (int)20);
                        if (var2) {
                            throw null;
                        }
                    }
                    case 3: {
                        do {
                            var1_1 /* !! */  = (int)fg.ikap("ikcb", ikam(int ), (int)18);
                        } while (!var2);
                        throw null;
                    }
                    case 6: {
                        do {
                            var1_1 /* !! */  = (int)fg.ikap("ikce", ikam(int ), (int)21);
                        } while (!var2);
                        throw null;
                    }
                    case 9: {
                        var1_1 /* !! */  = (int)fg.ikap("ikch", ikam(int ), (int)24);
                        if (var2) {
                            throw null;
                        }
                        ** GOTO lbl-1000
                    }
                    case 7: lbl-1000:
                    // 2 sources

                    {
                        var1_1 /* !! */  = (int)fg.ikap("ikcf", ikam(int ), (int)22);
                        if (var2) {
                            throw null;
                        }
                    }
                    case 8: 
                }
                ** GOTO lbl145
            }
            do {
                if (true) continue block36;
lbl145:
                // 2 sources

                var1_1 /* !! */  = (int)fg.ikap("ikcg", ikam(int ), (int)23);
                cfr_temp_0 = 7;
            } while (!var2);
            break;
        }
        throw null;
    }

    private static /* synthetic */ void ikjp() {
        fg.ikao[0] = -1671833218;
        fg.ikao[1] = 1913945694;
        fg.ikao[2] = 1586554907;
        fg.ikao[3] = -2031772335;
        fg.ikao[4] = 817177925;
        fg.ikao[5] = 1866410888;
        fg.ikao[6] = -1369477616;
        fg.ikao[7] = -1809456599;
        fg.ikao[8] = -492884234;
        fg.ikao[9] = -1397066781;
        fg.ikao[10] = -1076714333;
        fg.ikao[11] = -1418536819;
        fg.ikao[12] = 2081688450;
        fg.ikao[13] = -1728250211;
        fg.ikao[14] = -1280478468;
        fg.ikao[15] = -544869339;
        fg.ikao[16] = -42619241;
        fg.ikao[17] = 1578373512;
        fg.ikao[18] = 1244871716;
        fg.ikao[19] = 2036312732;
        fg.ikao[20] = 1523600735;
        fg.ikao[21] = -1023991636;
        fg.ikao[22] = 23105245;
        fg.ikao[23] = 1277852114;
        fg.ikao[24] = 1749094957;
        fg.ikao[25] = -181403797;
        fg.ikao[26] = 2060852237;
        fg.ikao[27] = 1239829024;
        fg.ikao[28] = -685217400;
        fg.ikao[29] = -6675038;
        fg.ikao[30] = 1662847133;
        fg.ikao[31] = 291939473;
        fg.ikao[32] = 1286856887;
        fg.ikao[33] = 2120257371;
        fg.ikao[34] = 2070429196;
        fg.ikao[35] = -1306630403;
        fg.ikao[36] = -587893889;
        fg.ikao[37] = 1778030987;
        fg.ikao[38] = 1556064703;
        fg.ikao[39] = 1023757168;
        fg.ikao[40] = 923445799;
        fg.ikao[41] = 2034815858;
        fg.ikao[42] = -1559920051;
        fg.ikao[43] = -281819970;
        fg.ikao[44] = 2013406920;
        fg.ikao[45] = -1679236037;
        fg.ikao[46] = -503402492;
        fg.ikao[47] = -422825847;
        fg.ikao[48] = -334772901;
        fg.ikao[49] = -1481178713;
        fg.ikao[50] = 1922665179;
        fg.ikao[51] = -2055102315;
        fg.ikao[52] = -2016755625;
        fg.ikao[53] = 640328812;
        fg.ikao[54] = 1285506230;
        fg.ikao[55] = 1967862206;
        fg.ikao[56] = -910102884;
        fg.ikao[57] = 1858779720;
        fg.ikao[58] = 832254951;
        fg.ikao[59] = -478061011;
        fg.ikao[60] = 496335763;
        fg.ikao[61] = 1860855129;
        fg.ikao[62] = -2054307336;
        fg.ikao[63] = -1673412922;
        fg.ikao[64] = 340557202;
        fg.ikao[65] = -425599829;
        fg.ikao[66] = 1058603687;
        fg.ikao[67] = 214495204;
        fg.ikao[68] = 368512644;
        fg.ikao[69] = 907821586;
        fg.ikao[70] = 0x37313731;
        fg.ikao[71] = -1036415672;
        fg.ikao[72] = -4601144;
        fg.ikao[73] = 780960058;
        fg.ikao[74] = 540787155;
        fg.ikao[75] = 1715632462;
        fg.ikao[76] = -696133030;
        fg.ikao[77] = 1957202940;
        fg.ikao[78] = -1574220403;
        fg.ikao[79] = -1551506591;
        fg.ikao[80] = 564062256;
        fg.ikao[81] = 816547826;
        fg.ikao[82] = -1664078296;
        fg.ikao[83] = -1815756368;
        fg.ikao[84] = 318417894;
        fg.ikao[85] = 785695053;
        fg.ikao[86] = -1082114950;
        fg.ikao[87] = 686928417;
        fg.ikao[88] = -1290999396;
        fg.ikao[89] = 1818392293;
        fg.ikao[90] = 1571402473;
        fg.ikao[91] = 1669166725;
        fg.ikao[92] = 1328876574;
        fg.ikao[93] = -446377071;
        fg.ikao[94] = 1327025709;
        fg.ikao[95] = -1960411123;
        fg.ikao[96] = 1209056582;
        fg.ikao[97] = 1891018936;
        fg.ikao[98] = 1760573017;
        fg.ikao[99] = 650264061;
    }

    static {
        ikan = new int[159];
        ikao = new int[159];
        fg.ikjn();
        fg.ikjo();
        fg.ikjp();
        fg.ikjq();
        ikav = new long[69];
        ikaw = new long[69];
        fg.ikjr();
        fg.ikjs();
        LEGACY_FORMATTING = Pattern.compile("(?i)\u00a7[0-9A-FK-ORX]");
        SEPARATORS = Pattern.compile("[^\\p{L}\\p{N}]+");
    }

    private static /* synthetic */ long ikau(int n2) {
        return ikav[n2] ^ ikaw[n2];
    }

    private static /* synthetic */ void ikjr() {
        fg.ikav[0] = 3268218762678458427L;
        fg.ikav[1] = 3090877359135270650L;
        fg.ikav[2] = -6543644167952322378L;
        fg.ikav[3] = 9040382190891135051L;
        fg.ikav[4] = -8753100082739259190L;
        fg.ikav[5] = 5711741004818797784L;
        fg.ikav[6] = 322814824005555717L;
        fg.ikav[7] = -8324753960023762460L;
        fg.ikav[8] = 5923542225434250678L;
        fg.ikav[9] = 858311352922970142L;
        fg.ikav[10] = -8422837309432504318L;
        fg.ikav[11] = 4640788607914951183L;
        fg.ikav[12] = -156227072695930152L;
        fg.ikav[13] = 2376451786189019359L;
        fg.ikav[14] = -8417019760614176528L;
        fg.ikav[15] = 7636700866393548132L;
        fg.ikav[16] = -8655442547549232091L;
        fg.ikav[17] = 599076472551979599L;
        fg.ikav[18] = -1350131443742529557L;
        fg.ikav[19] = 9004933846500458172L;
        fg.ikav[20] = 2526551136519767291L;
        fg.ikav[21] = 2729517092995239158L;
        fg.ikav[22] = -1993461755353918734L;
        fg.ikav[23] = -8292856057757735233L;
        fg.ikav[24] = 7308049401230776871L;
        fg.ikav[25] = 6396225221829976316L;
        fg.ikav[26] = 3549453508260240795L;
        fg.ikav[27] = 9153394095416881507L;
        fg.ikav[28] = -8930573047724794769L;
        fg.ikav[29] = -4795959521451002471L;
        fg.ikav[30] = 2868419568616471632L;
        fg.ikav[31] = -3532918332788317583L;
        fg.ikav[32] = 8594888431238519443L;
        fg.ikav[33] = 1767799531047463961L;
        fg.ikav[34] = 8634806123119303986L;
        fg.ikav[35] = 6909883067905963731L;
        fg.ikav[36] = 4751361020396935694L;
        fg.ikav[37] = -767980388140016558L;
        fg.ikav[38] = -4659003542621676480L;
        fg.ikav[39] = -6292124675065875875L;
        fg.ikav[40] = 6461576828744421818L;
        fg.ikav[41] = 2119735223408934092L;
        fg.ikav[42] = -2581948347003757840L;
        fg.ikav[43] = -391899453695595328L;
        fg.ikav[44] = -8779834374243272955L;
        fg.ikav[45] = -1717926719091648867L;
        fg.ikav[46] = 7210240359433505997L;
        fg.ikav[47] = 1733238190711481203L;
        fg.ikav[48] = 8978535823620927514L;
        fg.ikav[49] = 8592100534671511961L;
        fg.ikav[50] = 3035578009537564680L;
        fg.ikav[51] = 2395704180108265531L;
        fg.ikav[52] = 1536099869495548912L;
        fg.ikav[53] = -6584657958416094412L;
        fg.ikav[54] = -9072811113897051806L;
        fg.ikav[55] = -8240387517804909810L;
        fg.ikav[56] = -661049657379900476L;
        fg.ikav[57] = 7926882385127851764L;
        fg.ikav[58] = -5910167084338606144L;
        fg.ikav[59] = -7243648709186678262L;
        fg.ikav[60] = 2477149242209474011L;
        fg.ikav[61] = 6067822961171087708L;
        fg.ikav[62] = 771324104301308537L;
        fg.ikav[63] = 6996688710486793494L;
        fg.ikav[64] = 8709742982069445122L;
        fg.ikav[65] = 5394077815650997907L;
        fg.ikav[66] = -2421069836284963408L;
        fg.ikav[67] = 3070179151276849853L;
        fg.ikav[68] = 7227807331033828574L;
    }

    private static /* synthetic */ void ikjq() {
        fg.ikao[100] = -1795612514;
        fg.ikao[101] = -2043757016;
        fg.ikao[102] = -1647283173;
        fg.ikao[103] = 857088927;
        fg.ikao[104] = 1115777920;
        fg.ikao[105] = -957264447;
        fg.ikao[106] = 2009924074;
        fg.ikao[107] = -1944953233;
        fg.ikao[108] = -940487227;
        fg.ikao[109] = -1276787172;
        fg.ikao[110] = 2020274330;
        fg.ikao[111] = 1706846702;
        fg.ikao[112] = 1232872900;
        fg.ikao[113] = 523292605;
        fg.ikao[114] = -1480899695;
        fg.ikao[115] = 1405046244;
        fg.ikao[116] = 55220499;
        fg.ikao[117] = 171947331;
        fg.ikao[118] = 955478090;
        fg.ikao[119] = 960094238;
        fg.ikao[120] = 2118784657;
        fg.ikao[121] = 882055385;
        fg.ikao[122] = -922074484;
        fg.ikao[123] = -616006169;
        fg.ikao[124] = 496249563;
        fg.ikao[125] = -734707378;
        fg.ikao[126] = -1877345977;
        fg.ikao[127] = -1993749949;
        fg.ikao[128] = -1843424704;
        fg.ikao[129] = -1998276944;
        fg.ikao[130] = -93688099;
        fg.ikao[131] = -397433945;
        fg.ikao[132] = -1979574327;
        fg.ikao[133] = 959303426;
        fg.ikao[134] = -1901348419;
        fg.ikao[135] = -153558578;
        fg.ikao[136] = -163389319;
        fg.ikao[137] = 390320684;
        fg.ikao[138] = -777538735;
        fg.ikao[139] = -1886872372;
        fg.ikao[140] = 1131390677;
        fg.ikao[141] = 565438770;
        fg.ikao[142] = 1900710170;
        fg.ikao[143] = 1946308962;
        fg.ikao[144] = 323725989;
        fg.ikao[145] = 1593527465;
        fg.ikao[146] = -62866408;
        fg.ikao[147] = -1766623596;
        fg.ikao[148] = -837330692;
        fg.ikao[149] = 1974298213;
        fg.ikao[150] = 376124014;
        fg.ikao[151] = 860379257;
        fg.ikao[152] = -1671696266;
        fg.ikao[153] = 1684920951;
        fg.ikao[154] = 1263550278;
        fg.ikao[155] = -200061871;
        fg.ikao[156] = 1729537473;
        fg.ikao[157] = 2026744662;
        fg.ikao[158] = 1354417394;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static String normalizeBossBarText(String var0) {
        v0 /* !! */  = fg.pu;
        if (true) ** GOTO lbl5
        block57: while (true) {
            v0 /* !! */  = (long)(fg.ikap("ikgg", ikau(int ), (int)39) - fg.ikap("ikgf", ikau(int ), (int)38));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1669463446: {
                    break block57;
                }
                case -370547358: {
                    continue block57;
                }
            }
            break;
        }
        var4_1 = fg.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = fg.pu - fg.ikap("ikgh", ikau(int ), (int)40)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == fg.ikap("ikgi", ikam(int ), (int)104)) break;
            v1 /* !! */  = (long)fg.ikap("ikgj", ikam(int ), (int)105);
        }
        var3_2 /* !! */  = fg.b;
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v2 /* !! */  = fg.pu;
                if (true) ** GOTO lbl24
                block59: while (true) {
                    v2 /* !! */  = (long)(fg.ikap("ikgl", ikau(int ), (int)42) - fg.ikap("ikgk", ikau(int ), (int)41));
lbl24:
                    // 2 sources

                    switch ((int)v2 /* !! */ ) {
                        case -1669463446: {
                            break block59;
                        }
                        case 190373886: {
                            continue block59;
                        }
                    }
                    break;
                }
                var2_3 = fg.a;
                if (var4_1) {
                    throw null;
lbl32:
                    // 3 sources

                    return null;
                }
                if (var2_3 || var2_3) ** GOTO lbl32
                v3 /* !! */  = fg.pu;
                if (true) ** GOTO lbl39
                block61: while (true) {
                    v3 /* !! */  = (long)(v4 - fg.ikap("ikgm", ikau(int ), (int)43));
lbl39:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1752610390: {
                            v4 = fg.ikap("ikgn", ikau(int ), (int)44);
                            continue block61;
                        }
                        case -1669463446: {
                            break block61;
                        }
                        case 259176517: {
                            v4 = fg.ikap("ikgo", ikau(int ), (int)45);
                            continue block61;
                        }
                        case 1673452700: {
                            v4 = fg.ikap("ikgp", ikau(int ), (int)46);
                            continue block61;
                        }
                    }
                    break;
                }
                v5 /* !! */  = fg.pu;
                if (true) ** GOTO lbl55
                block62: while (true) {
                    v5 /* !! */  = (long)(fg.ikap("ikgr", ikau(int ), (int)48) - fg.ikap("ikgq", ikau(int ), (int)47));
lbl55:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1669463446: {
                            break block62;
                        }
                        case -1459640869: {
                            continue block62;
                        }
                    }
                    break;
                }
                var1_4 = Normalizer.normalize(var0, Normalizer.Form.NFKC);
                if (var2_3 || var2_3) ** GOTO lbl32
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_1 = fg.pu - fg.ikap("ikgs", ikau(int ), (int)49)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == fg.ikap("ikgt", ikam(int ), (int)106)) break;
                    v6 /* !! */  = (long)fg.ikap("ikgu", ikam(int ), (int)107);
                }
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_2 = fg.pu - fg.ikap("ikgv", ikau(int ), (int)50)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == fg.ikap("ikgw", ikam(int ), (int)108)) break;
                    v7 /* !! */  = (long)fg.ikap("ikgx", ikam(int ), (int)109);
                }
                v8 = fg.LEGACY_FORMATTING.matcher(var1_4);
                v9 /* !! */  = fg.pu;
                if (true) ** GOTO lbl77
                block65: while (true) {
                    v9 /* !! */  = (long)(v10 - fg.ikap("ikgy", ikau(int ), (int)51));
lbl77:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -1908780570: {
                            v10 = fg.ikap("ikgz", ikau(int ), (int)52);
                            continue block65;
                        }
                        case -1669463446: {
                            break block65;
                        }
                        case -1279554875: {
                            v10 = fg.ikap("ikha", ikau(int ), (int)53);
                            continue block65;
                        }
                        case -591467788: {
                            v10 = fg.ikap("ikhb", ikau(int ), (int)54);
                            continue block65;
                        }
                    }
                    break;
                }
                var1_4 = v8.replaceAll("");
                if (var2_3 || var2_3) ** continue;
                v11 /* !! */  = fg.pu;
                if (true) ** GOTO lbl95
                block66: while (true) {
                    v11 /* !! */  = (long)(v12 - fg.ikap("ikhc", ikau(int ), (int)55));
lbl95:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -1853089619: {
                            v12 = fg.ikap("ikhd", ikau(int ), (int)56);
                            continue block66;
                        }
                        case -1724049711: {
                            v12 = fg.ikap("ikhe", ikau(int ), (int)57);
                            continue block66;
                        }
                        case -1669463446: {
                            break block66;
                        }
                        case 446995788: {
                            v12 = fg.ikap("ikhf", ikau(int ), (int)58);
                            continue block66;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v13 /* !! */  = (cfr_temp_3 = fg.pu - fg.ikap("ikhg", ikau(int ), (int)59)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v13 /* !! */  == fg.ikap("ikhh", ikam(int ), (int)110)) break;
                    v13 /* !! */  = (long)fg.ikap("ikhi", ikam(int ), (int)111);
                }
                v14 /* !! */  = fg.pu;
                if (true) ** GOTO lbl116
                block68: while (true) {
                    v14 /* !! */  = (long)(fg.ikap("ikhk", ikau(int ), (int)61) - fg.ikap("ikhj", ikau(int ), (int)60));
lbl116:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case -1669463446: {
                            break block68;
                        }
                        case 131115903: {
                            continue block68;
                        }
                    }
                    break;
                }
                v15 = var1_4.toLowerCase(Locale.ROOT);
                v16 /* !! */  = fg.pu;
                if (true) ** GOTO lbl126
                block69: while (true) {
                    v16 /* !! */  = (long)(fg.ikap("ikhm", ikau(int ), (int)63) - fg.ikap("ikhl", ikau(int ), (int)62));
lbl126:
                    // 2 sources

                    switch ((int)v16 /* !! */ ) {
                        case -1669463446: {
                            break block69;
                        }
                        case -1535839302: {
                            continue block69;
                        }
                    }
                    break;
                }
                v17 = fg.SEPARATORS.matcher(v15);
                v18 /* !! */  = fg.pu;
                if (true) ** GOTO lbl136
                block70: while (true) {
                    v18 /* !! */  = (long)(v19 - fg.ikap("ikhn", ikau(int ), (int)64));
lbl136:
                    // 2 sources

                    switch ((int)v18 /* !! */ ) {
                        case -1669463446: {
                            break block70;
                        }
                        case -1453582832: {
                            v19 = fg.ikap("ikho", ikau(int ), (int)65);
                            continue block70;
                        }
                        case 347959390: {
                            v19 = fg.ikap("ikhp", ikau(int ), (int)66);
                            continue block70;
                        }
                    }
                    break;
                }
                v20 = v17.replaceAll(" ");
                v21 /* !! */  = fg.pu;
                if (true) ** GOTO lbl150
                block71: while (true) {
                    v21 /* !! */  = (long)(fg.ikap("ikhr", ikau(int ), (int)68) - fg.ikap("ikhq", ikau(int ), (int)67));
lbl150:
                    // 2 sources

                    switch ((int)v21 /* !! */ ) {
                        case -1669463446: {
                            break block71;
                        }
                        case 114869863: {
                            continue block71;
                        }
                    }
                    break;
                }
                return v20.trim();
            }
            case 0: {
                var3_2 /* !! */  = (int)fg.ikap("ikhs", ikam(int ), (int)112);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl180
            }
            case 1: {
                do {
                    var3_2 /* !! */  = (int)fg.ikap("ikht", ikam(int ), (int)113);
                } while (!var4_1);
                throw null;
            }
lbl166:
            // 2 sources

            case 2: {
                do {
                    var3_2 /* !! */  = (int)fg.ikap("ikhu", ikam(int ), (int)114);
                } while (!var4_1);
                throw null;
            }
            case 3: {
                var3_2 /* !! */  = (int)fg.ikap("ikhv", ikam(int ), (int)115);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl184
            }
            case 4: {
                var3_2 /* !! */  = (int)fg.ikap("ikhw", ikam(int ), (int)116);
                if (var4_1) {
                    throw null;
                }
            }
lbl180:
            // 4 sources

            case 5: {
                var3_2 /* !! */  = (int)fg.ikap("ikhx", ikam(int ), (int)117);
                if (var4_1) {
                    throw null;
                }
            }
lbl184:
            // 4 sources

            case 6: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_2 /* !! */  = (int)fg.ikap("ikhy", ikam(int ), (int)118);
                    if (!var4_1) ** GOTO lbl166
                    throw null;
                }
            }
            case 7: 
        }
        var3_2 /* !! */  = (int)fg.ikap("ikhz", ikam(int ), (int)119);
        ** while (!var4_1)
lbl192:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean hasPvpBossBar() {
        block86: {
            block85: {
                var8_1 = fg.c;
                var7_2 /* !! */  = fg.b;
                var6_3 = fg.a;
                if (var8_1) {
                    throw null;
lbl6:
                    // 24 sources

                    return (boolean)fg.ikap("ikel", ikam(int ), (int)58);
                }
                if (var6_3 || var6_3) ** GOTO lbl6
                if (fg.mc.field_1705 != null) break block85;
                if (var6_3 || var6_3) ** GOTO lbl6
                return (boolean)fg.ikap("ikem", ikam(int ), (int)59);
            }
            if (var6_3 || var6_3) ** GOTO lbl6
            var1_4 = fg.mc.field_1705.method_1740();
            if (var6_3 || var6_3) ** GOTO lbl6
            if (var1_4 == null) break block86;
            if (var6_3) ** GOTO lbl6
            if (var1_4.field_2060 == null) break block86;
            if (var6_3) ** GOTO lbl6
            if (!var1_4.field_2060.isEmpty()) ** GOTO lbl28
            if (var6_3) ** GOTO lbl6
        }
        if (var7_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var7_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var6_3 || var6_3) ** GOTO lbl6
                return (boolean)fg.ikap("iken", ikam(int ), (int)60);
            }
lbl28:
            // 1 sources

            if (var6_3 || var6_3) ** GOTO lbl6
            var2_5 = var1_4.field_2060.values().iterator();
            if (var6_3) ** GOTO lbl6
            do {
                if (var6_3 || var6_3) ** GOTO lbl6
                if (!var2_5.hasNext()) ** GOTO lbl58
                if (var6_3) ** GOTO lbl6
                var3_6 = (class_345)var2_5.next();
                if (var6_3 || var6_3) ** GOTO lbl6
                var4_7 = fg.normalizeBossBarText(var3_6.method_5414().getString());
                if (var6_3 || var6_3) ** GOTO lbl6
                var5_8 = var4_7.replace(" ", "");
                if (var6_3 || var6_3) ** GOTO lbl6
                if (var5_8.contains("pvp\u0440\u0435\u0436\u0438\u043c")) ** GOTO lbl53
                if (var6_3) ** GOTO lbl6
                if (var5_8.contains("\u043f\u0432\u043f\u0440\u0435\u0436\u0438\u043c")) ** GOTO lbl53
                if (var6_3) ** GOTO lbl6
                if (var5_8.contains("\u0440\u0435\u0436\u0438\u043cpvp")) ** GOTO lbl53
                if (var6_3) ** GOTO lbl6
                if (var5_8.contains("\u0440\u0435\u0436\u0438\u043c\u043f\u0432\u043f")) ** GOTO lbl53
                if (var6_3) ** GOTO lbl6
                if (var5_8.contains("\u0434\u043e\u043e\u043a\u043e\u043d\u0447\u0430\u043d\u0438\u044fpvp")) ** GOTO lbl53
                if (var6_3) ** GOTO lbl6
                if (!var5_8.contains("\u0434\u043e\u043e\u043a\u043e\u043d\u0447\u0430\u043d\u0438\u044f\u043f\u0432\u043f")) ** GOTO lbl55
                if (var6_3) ** GOTO lbl6
lbl53:
                // 6 sources

                if (var6_3 || var6_3) ** GOTO lbl6
                return (boolean)fg.ikap("ikeo", ikam(int ), (int)61);
lbl55:
                // 1 sources

                if (var6_3 || var6_3) ** GOTO lbl6
            } while (!var8_1);
            throw null;
lbl58:
            // 1 sources

            if (!var6_3 && !var6_3) ** break;
            ** continue;
            return (boolean)fg.ikap("ikep", ikam(int ), (int)62);
lbl61:
            // 2 sources

            case 0: {
                var7_2 /* !! */  = (int)fg.ikap("ikeq", ikam(int ), (int)63);
                if (var8_1) {
                    throw null;
                }
                ** GOTO lbl149
            }
            case 1: {
                var7_2 /* !! */  = (int)fg.ikap("iker", ikam(int ), (int)64);
                if (var8_1) {
                    throw null;
                }
                ** GOTO lbl114
            }
lbl71:
            // 2 sources

            case 2: {
                var7_2 /* !! */  = (int)fg.ikap("ikes", ikam(int ), (int)65);
                if (var8_1) {
                    throw null;
                }
                ** GOTO lbl217
            }
            case 3: {
                var7_2 /* !! */  = (int)fg.ikap("iket", ikam(int ), (int)66);
                if (var8_1) {
                    throw null;
                }
                ** GOTO lbl114
            }
lbl81:
            // 3 sources

            case 4: {
                var7_2 /* !! */  = (int)fg.ikap("ikeu", ikam(int ), (int)67);
                if (var8_1) {
                    throw null;
                }
                ** GOTO lbl170
            }
lbl86:
            // 2 sources

            case 5: {
                var7_2 /* !! */  = (int)fg.ikap("ikev", ikam(int ), (int)68);
                if (var8_1) {
                    throw null;
                }
                ** GOTO lbl96
            }
lbl91:
            // 2 sources

            case 6: {
                var7_2 /* !! */  = (int)fg.ikap("ikew", ikam(int ), (int)69);
                if (var8_1) {
                    throw null;
                }
                ** GOTO lbl182
            }
lbl96:
            // 2 sources

            case 7: {
                var7_2 /* !! */  = (int)fg.ikap("ikex", ikam(int ), (int)70);
                if (!var8_1) ** GOTO lbl61
                throw null;
            }
lbl100:
            // 2 sources

            case 8: {
                var7_2 /* !! */  = (int)fg.ikap("ikey", ikam(int ), (int)71);
                if (!var8_1) ** GOTO lbl71
                throw null;
            }
            case 9: {
                var7_2 /* !! */  = (int)fg.ikap("ikez", ikam(int ), (int)72);
                if (var8_1) {
                    throw null;
                }
                ** GOTO lbl149
            }
            case 10: {
                var7_2 /* !! */  = (int)fg.ikap("ikfa", ikam(int ), (int)73);
                if (var8_1) {
                    throw null;
                }
                ** GOTO lbl221
            }
lbl114:
            // 4 sources

            case 11: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var7_2 /* !! */  = (int)fg.ikap("ikfb", ikam(int ), (int)74);
                    if (var8_1) {
                        throw null;
                    }
                    ** GOTO lbl149
                    break;
                }
            }
lbl120:
            // 2 sources

            case 12: {
                var7_2 /* !! */  = (int)fg.ikap("ikfc", ikam(int ), (int)75);
                if (var8_1) {
                    throw null;
                }
                ** GOTO lbl235
            }
lbl125:
            // 2 sources

            case 13: {
                var7_2 /* !! */  = (int)fg.ikap("ikfd", ikam(int ), (int)76);
                if (var8_1) {
                    throw null;
                }
                ** GOTO lbl199
            }
            case 14: {
                var7_2 /* !! */  = (int)fg.ikap("ikfe", ikam(int ), (int)77);
                if (var8_1) {
                    throw null;
                }
                ** GOTO lbl182
            }
            case 15: {
                var7_2 /* !! */  = (int)fg.ikap("ikff", ikam(int ), (int)78);
                if (!var8_1) ** GOTO lbl120
                throw null;
            }
            case 16: {
                var7_2 /* !! */  = (int)fg.ikap("ikfg", ikam(int ), (int)79);
                if (var8_1) {
                    throw null;
                }
                ** GOTO lbl186
            }
lbl144:
            // 3 sources

            case 17: {
                var7_2 /* !! */  = (int)fg.ikap("ikfh", ikam(int ), (int)80);
                if (var8_1) {
                    throw null;
                }
                ** GOTO lbl235
            }
lbl149:
            // 5 sources

            case 18: {
                var7_2 /* !! */  = (int)fg.ikap("ikfi", ikam(int ), (int)81);
                if (!var8_1) ** GOTO lbl144
                throw null;
            }
lbl153:
            // 2 sources

            case 19: {
                var7_2 /* !! */  = (int)fg.ikap("ikfj", ikam(int ), (int)82);
                if (!var8_1) ** GOTO lbl91
                throw null;
            }
            case 20: {
                var7_2 /* !! */  = (int)fg.ikap("ikfk", ikam(int ), (int)83);
                if (var8_1) {
                    throw null;
                }
                ** GOTO lbl239
            }
lbl162:
            // 2 sources

            case 21: {
                var7_2 /* !! */  = (int)fg.ikap("ikfl", ikam(int ), (int)84);
                if (!var8_1) ** GOTO lbl81
                throw null;
            }
            case 22: {
                var7_2 /* !! */  = (int)fg.ikap("ikfm", ikam(int ), (int)85);
                if (!var8_1) ** GOTO lbl86
                throw null;
            }
lbl170:
            // 2 sources

            case 23: {
                var7_2 /* !! */  = (int)fg.ikap("ikfn", ikam(int ), (int)86);
                if (!var8_1) ** GOTO lbl81
                throw null;
            }
lbl174:
            // 2 sources

            case 24: {
                var7_2 /* !! */  = (int)fg.ikap("ikfo", ikam(int ), (int)87);
                if (!var8_1) ** GOTO lbl144
                throw null;
            }
            case 25: {
                var7_2 /* !! */  = (int)fg.ikap("ikfp", ikam(int ), (int)88);
                if (!var8_1) ** GOTO lbl174
                throw null;
            }
lbl182:
            // 3 sources

            case 26: {
                var7_2 /* !! */  = (int)fg.ikap("ikfq", ikam(int ), (int)89);
                if (!var8_1) ** GOTO lbl114
                throw null;
            }
lbl186:
            // 2 sources

            case 27: {
                var7_2 /* !! */  = (int)fg.ikap("ikfr", ikam(int ), (int)90);
                if (var8_1) {
                    throw null;
                }
                ** GOTO lbl226
            }
            case 28: {
                var7_2 /* !! */  = (int)fg.ikap("ikfs", ikam(int ), (int)91);
                if (!var8_1) ** GOTO lbl100
                throw null;
            }
lbl195:
            // 2 sources

            case 29: {
                var7_2 /* !! */  = (int)fg.ikap("ikft", ikam(int ), (int)92);
                if (!var8_1) ** GOTO lbl125
                throw null;
            }
lbl199:
            // 2 sources

            case 30: {
                do {
                    var7_2 /* !! */  = (int)fg.ikap("ikfu", ikam(int ), (int)93);
                } while (!var8_1);
                throw null;
            }
            case 31: {
                var7_2 /* !! */  = (int)fg.ikap("ikfv", ikam(int ), (int)94);
                if (var8_1) {
                    throw null;
                }
                ** GOTO lbl221
            }
            case 32: {
                var7_2 /* !! */  = (int)fg.ikap("ikfw", ikam(int ), (int)95);
                if (!var8_1) ** GOTO lbl153
                throw null;
            }
            case 33: {
                var7_2 /* !! */  = (int)fg.ikap("ikfx", ikam(int ), (int)96);
                if (!var8_1) ** GOTO lbl195
                throw null;
            }
lbl217:
            // 3 sources

            case 34: {
                var7_2 /* !! */  = (int)fg.ikap("ikfy", ikam(int ), (int)97);
                if (!var8_1) ** GOTO lbl162
                throw null;
            }
lbl221:
            // 4 sources

            case 35: {
                var7_2 /* !! */  = (int)fg.ikap("ikfz", ikam(int ), (int)98);
                if (var8_1) {
                    throw null;
                }
                ** GOTO lbl235
            }
lbl226:
            // 2 sources

            case 36: {
                var7_2 /* !! */  = (int)fg.ikap("ikga", ikam(int ), (int)99);
                if (var8_1) {
                    throw null;
                }
                ** GOTO lbl235
            }
            case 37: {
                var7_2 /* !! */  = (int)fg.ikap("ikgb", ikam(int ), (int)100);
                if (!var8_1) ** GOTO lbl221
                throw null;
            }
lbl235:
            // 5 sources

            case 38: {
                var7_2 /* !! */  = (int)fg.ikap("ikgc", ikam(int ), (int)101);
                if (!var8_1) ** GOTO lbl149
                throw null;
            }
lbl239:
            // 2 sources

            case 39: {
                var7_2 /* !! */  = (int)fg.ikap("ikgd", ikam(int ), (int)102);
                if (!var8_1) ** GOTO lbl217
                throw null;
            }
            case 40: 
        }
        var7_2 /* !! */  = (int)fg.ikap("ikge", ikam(int ), (int)103);
        ** while (!var8_1)
lbl246:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static boolean isBlockedCommand(String var0) {
        block65: {
            var6_1 = fg.c;
            var5_2 /* !! */  = fg.b;
            var4_3 = fg.a;
            if (var6_1) {
                throw null;
lbl6:
                // 17 sources

                return (boolean)fg.ikap("ikia", ikam(int ), (int)120);
            }
            if (var4_3 || var4_3) ** GOTO lbl6
            if (var0 != null) break block65;
            if (var4_3 || var4_3) ** GOTO lbl6
            return (boolean)fg.ikap("ikib", ikam(int ), (int)121);
        }
        if (var4_3 || var4_3) ** GOTO lbl6
        var1_4 = var0.trim();
        if (var4_3 || var4_3) ** GOTO lbl6
        if (!var1_4.startsWith("/")) ** GOTO lbl23
        if (var4_3 || var4_3) ** GOTO lbl6
        if (var5_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                var1_4 = var1_4.substring((int)fg.ikap("ikic", ikam(int ), (int)122)).trim();
                if (var4_3) ** GOTO lbl6
lbl23:
                // 2 sources

                if (var4_3 || var4_3) ** GOTO lbl6
                var2_5 = var1_4.indexOf((int)fg.ikap("ikid", ikam(int ), (int)123));
                if (var4_3 || var4_3) ** GOTO lbl6
                if (var2_5 >= 0) ** GOTO lbl32
                if (var4_3) ** GOTO lbl6
                v0 = var1_4;
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl34
lbl32:
                // 1 sources

                if (var4_3 || var4_3) ** GOTO lbl6
                v0 = var3_6 = var1_4.substring((int)fg.ikap("ikie", ikam(int ), (int)124), var2_5);
lbl34:
                // 2 sources

                if (var4_3 || var4_3) ** GOTO lbl6
                if (var3_6.equalsIgnoreCase("hub")) ** GOTO lbl43
                if (var4_3) ** GOTO lbl6
                if (var3_6.equalsIgnoreCase("lobby")) ** GOTO lbl43
                if (var4_3) ** GOTO lbl6
                if (var3_6.equalsIgnoreCase("leave")) ** GOTO lbl43
                if (var4_3) ** GOTO lbl6
                if (!var3_6.toLowerCase(Locale.ROOT).matches("an\\d{3}")) ** GOTO lbl48
                if (var4_3) ** GOTO lbl6
lbl43:
                // 4 sources

                if (var4_3 || var4_3) ** GOTO lbl6
                v1 = fg.ikap("ikif", ikam(int ), (int)125);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl51
lbl48:
                // 1 sources

                if (!var4_3 && !var4_3) ** break;
                ** continue;
                v1 = fg.ikap("ikig", ikam(int ), (int)126);
lbl51:
                // 2 sources

                return (boolean)v1;
            }
lbl52:
            // 2 sources

            case 0: {
                var5_2 /* !! */  = (int)fg.ikap("ikih", ikam(int ), (int)127);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl124
            }
            case 1: {
                var5_2 /* !! */  = (int)fg.ikap("ikii", ikam(int ), (int)128);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl105
            }
lbl62:
            // 2 sources

            case 2: {
                var5_2 /* !! */  = (int)fg.ikap("ikij", ikam(int ), (int)129);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl110
            }
lbl67:
            // 2 sources

            case 3: {
                var5_2 /* !! */  = (int)fg.ikap("ikik", ikam(int ), (int)130);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl86
            }
lbl72:
            // 2 sources

            case 4: {
                var5_2 /* !! */  = (int)fg.ikap("ikil", ikam(int ), (int)131);
                if (!var6_1) break;
                throw null;
            }
            case 5: {
                var5_2 /* !! */  = (int)fg.ikap("ikim", ikam(int ), (int)132);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl86
            }
            case 6: {
                var5_2 /* !! */  = (int)fg.ikap("ikin", ikam(int ), (int)133);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl162
            }
lbl86:
            // 4 sources

            case 7: {
                var5_2 /* !! */  = (int)fg.ikap("ikio", ikam(int ), (int)134);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl158
            }
lbl91:
            // 3 sources

            case 8: {
                var5_2 /* !! */  = (int)fg.ikap("ikip", ikam(int ), (int)135);
                if (!var6_1) break;
                throw null;
            }
            case 9: {
                var5_2 /* !! */  = (int)fg.ikap("ikiq", ikam(int ), (int)136);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl137
            }
            case 10: {
                var5_2 /* !! */  = (int)fg.ikap("ikir", ikam(int ), (int)137);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl145
            }
lbl105:
            // 2 sources

            case 11: {
                var5_2 /* !! */  = (int)fg.ikap("ikis", ikam(int ), (int)138);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl115
            }
lbl110:
            // 3 sources

            case 12: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_2 /* !! */  = (int)fg.ikap("ikit", ikam(int ), (int)139);
                    if (!var6_1) ** GOTO lbl52
                    throw null;
                }
            }
lbl115:
            // 2 sources

            case 13: {
                var5_2 /* !! */  = (int)fg.ikap("ikiu", ikam(int ), (int)140);
                if (!var6_1) ** GOTO lbl86
                throw null;
            }
            case 14: {
                var5_2 /* !! */  = (int)fg.ikap("ikiv", ikam(int ), (int)141);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl162
            }
lbl124:
            // 3 sources

            case 15: {
                var5_2 /* !! */  = (int)fg.ikap("ikiw", ikam(int ), (int)142);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl183
            }
lbl129:
            // 3 sources

            case 16: {
                var5_2 /* !! */  = (int)fg.ikap("ikix", ikam(int ), (int)143);
                if (!var6_1) ** GOTO lbl110
                throw null;
            }
lbl133:
            // 3 sources

            case 17: {
                var5_2 /* !! */  = (int)fg.ikap("ikiy", ikam(int ), (int)144);
                if (!var6_1) ** GOTO lbl91
                throw null;
            }
lbl137:
            // 2 sources

            case 18: {
                var5_2 /* !! */  = (int)fg.ikap("ikiz", ikam(int ), (int)145);
                if (!var6_1) ** GOTO lbl129
                throw null;
            }
            case 19: {
                var5_2 /* !! */  = (int)fg.ikap("ikja", ikam(int ), (int)146);
                if (!var6_1) ** GOTO lbl129
                throw null;
            }
lbl145:
            // 3 sources

            case 20: {
                do {
                    var5_2 /* !! */  = (int)fg.ikap("ikjb", ikam(int ), (int)147);
                } while (!var6_1);
                throw null;
            }
            case 21: {
                var5_2 /* !! */  = (int)fg.ikap("ikjc", ikam(int ), (int)148);
                if (!var6_1) ** GOTO lbl91
                throw null;
            }
            case 22: {
                var5_2 /* !! */  = (int)fg.ikap("ikjd", ikam(int ), (int)149);
                if (var6_1) {
                    throw null;
                }
            }
lbl158:
            // 4 sources

            case 23: {
                var5_2 /* !! */  = (int)fg.ikap("ikje", ikam(int ), (int)150);
                if (!var6_1) ** GOTO lbl72
                throw null;
            }
lbl162:
            // 3 sources

            case 24: {
                var5_2 /* !! */  = (int)fg.ikap("ikjf", ikam(int ), (int)151);
                if (!var6_1) ** GOTO lbl67
                throw null;
            }
            case 25: {
                var5_2 /* !! */  = (int)fg.ikap("ikjg", ikam(int ), (int)152);
                if (!var6_1) ** GOTO lbl124
                throw null;
            }
            case 26: {
                var5_2 /* !! */  = (int)fg.ikap("ikjh", ikam(int ), (int)153);
                if (!var6_1) ** GOTO lbl145
                throw null;
            }
            case 27: {
                var5_2 /* !! */  = (int)fg.ikap("ikji", ikam(int ), (int)154);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl183
            }
            case 28: {
                var5_2 /* !! */  = (int)fg.ikap("ikjj", ikam(int ), (int)155);
                if (!var6_1) ** GOTO lbl62
                throw null;
            }
lbl183:
            // 3 sources

            case 29: {
                var5_2 /* !! */  = (int)fg.ikap("ikjk", ikam(int ), (int)156);
                if (!var6_1) ** GOTO lbl133
                throw null;
            }
            case 30: {
                var5_2 /* !! */  = (int)fg.ikap("ikjl", ikam(int ), (int)157);
                if (!var6_1) ** GOTO lbl133
                throw null;
            }
            case 31: 
        }
        var5_2 /* !! */  = (int)fg.ikap("ikjm", ikam(int ), (int)158);
        ** while (!var6_1)
lbl194:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ikjs() {
        fg.ikaw[0] = 5663342872208581022L;
        fg.ikaw[1] = -1926008922518239820L;
        fg.ikaw[2] = -3514960483183539643L;
        fg.ikaw[3] = 3714743174656677227L;
        fg.ikaw[4] = -7948958549211856855L;
        fg.ikaw[5] = 7386949975635753826L;
        fg.ikaw[6] = -21441413014823150L;
        fg.ikaw[7] = -5974896705647524074L;
        fg.ikaw[8] = 4285459431823107665L;
        fg.ikaw[9] = 7978440259002139398L;
        fg.ikaw[10] = 700170477523529462L;
        fg.ikaw[11] = -5235726736182627776L;
        fg.ikaw[12] = -1576340167225950692L;
        fg.ikaw[13] = -4530081441162779422L;
        fg.ikaw[14] = -1514910752666626300L;
        fg.ikaw[15] = 2518181843589976285L;
        fg.ikaw[16] = -224623415788531440L;
        fg.ikaw[17] = -3833932366034815500L;
        fg.ikaw[18] = 8488673039533774354L;
        fg.ikaw[19] = 7301009617494778856L;
        fg.ikaw[20] = -8868629658595253024L;
        fg.ikaw[21] = -2224140698773703836L;
        fg.ikaw[22] = -5328479416415576404L;
        fg.ikaw[23] = 6349792340134054296L;
        fg.ikaw[24] = 336441409334380600L;
        fg.ikaw[25] = 3388000521076392896L;
        fg.ikaw[26] = -1086032527919013250L;
        fg.ikaw[27] = 6404569945605272539L;
        fg.ikaw[28] = -3150564921480166936L;
        fg.ikaw[29] = 4379295883774365466L;
        fg.ikaw[30] = -6063275430187027023L;
        fg.ikaw[31] = 4827475900676522392L;
        fg.ikaw[32] = 6213564900153905125L;
        fg.ikaw[33] = 1018797873289061767L;
        fg.ikaw[34] = 8634806123119304668L;
        fg.ikaw[35] = -4638350026981477771L;
        fg.ikaw[36] = 6009693649676721715L;
        fg.ikaw[37] = 3327911337806220008L;
        fg.ikaw[38] = 5208013060235971366L;
        fg.ikaw[39] = -8598789773515712135L;
        fg.ikaw[40] = -6947615916282975035L;
        fg.ikaw[41] = -6754877014936801925L;
        fg.ikaw[42] = 2313289389354424336L;
        fg.ikaw[43] = -7999449511107235344L;
        fg.ikaw[44] = -3620628175451265962L;
        fg.ikaw[45] = -1599971668074209511L;
        fg.ikaw[46] = 3797505589857900814L;
        fg.ikaw[47] = 2203781828317678981L;
        fg.ikaw[48] = 7799541243949100210L;
        fg.ikaw[49] = 5708970441399836150L;
        fg.ikaw[50] = 440002379207869235L;
        fg.ikaw[51] = -6601668823452576484L;
        fg.ikaw[52] = -1273505624731504792L;
        fg.ikaw[53] = -8849662148681285377L;
        fg.ikaw[54] = 619904815896032339L;
        fg.ikaw[55] = -1016536143932363991L;
        fg.ikaw[56] = 7787647877260102367L;
        fg.ikaw[57] = -9185771113007983170L;
        fg.ikaw[58] = -5752446785140508154L;
        fg.ikaw[59] = -730624324916731700L;
        fg.ikaw[60] = 126421780465498014L;
        fg.ikaw[61] = 3757519455513232219L;
        fg.ikaw[62] = 4840004430715174734L;
        fg.ikaw[63] = 6519684086034272868L;
        fg.ikaw[64] = -5372101444447446371L;
        fg.ikaw[65] = -6840979417583312791L;
        fg.ikaw[66] = -6995902195580741882L;
        fg.ikaw[67] = -351657923218802365L;
        fg.ikaw[68] = 2074886717287372560L;
    }

    private static /* synthetic */ int ikam(int n2) {
        return ikan[n2] ^ ikao[n2];
    }

    public static /* synthetic */ CallSite ikap(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onChat(bp var1_1) {
        block83: {
            v0 /* !! */  = fg.pu;
            if (true) ** GOTO lbl5
            block52: while (true) {
                v0 /* !! */  = (long)(v1 - fg.ikap("ikci", ikau(int ), (int)16));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -1669463446: {
                        break block52;
                    }
                    case -22820207: {
                        v1 = fg.ikap("ikcj", ikau(int ), (int)17);
                        continue block52;
                    }
                    case 567482437: {
                        v1 = fg.ikap("ikck", ikau(int ), (int)18);
                        continue block52;
                    }
                    case 1804917548: {
                        v1 = fg.ikap("ikcl", ikau(int ), (int)19);
                        continue block52;
                    }
                }
                break;
            }
            var6_2 = fg.c;
            v2 /* !! */  = fg.pu;
            if (true) ** GOTO lbl22
            block53: while (true) {
                v2 /* !! */  = (long)(fg.ikap("ikcn", ikau(int ), (int)21) - fg.ikap("ikcm", ikau(int ), (int)20));
lbl22:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case -1669463446: {
                        break block53;
                    }
                    case 192974836: {
                        continue block53;
                    }
                }
                break;
            }
            var5_3 /* !! */  = fg.b;
            while (true) {
                if ((v3 /* !! */  = (cfr_temp_0 = fg.pu - fg.ikap("ikco", ikau(int ), (int)22)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v3 /* !! */  == fg.ikap("ikcp", ikam(int ), (int)25)) break;
                v3 /* !! */  = (long)fg.ikap("ikcq", ikam(int ), (int)26);
            }
            var4_4 = fg.a;
            if (var6_2) {
                throw null;
lbl36:
                // 12 sources

                return;
            }
            if (var4_4 || var4_4) ** GOTO lbl36
            v4 /* !! */  = fg.pu;
            if (true) ** GOTO lbl43
            block56: while (true) {
                v4 /* !! */  = (long)(fg.ikap("ikcs", ikau(int ), (int)24) - fg.ikap("ikcr", ikau(int ), (int)23));
lbl43:
                // 2 sources

                switch ((int)v4 /* !! */ ) {
                    case -1669463446: {
                        break block56;
                    }
                    case -1559516347: {
                        continue block56;
                    }
                }
                break;
            }
            if (!this.hasPvpBossBar()) break block83;
            if (var4_4) ** GOTO lbl36
            while (true) {
                if ((v5 /* !! */  = (cfr_temp_1 = fg.pu - fg.ikap("ikct", ikau(int ), (int)25)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v5 /* !! */  == fg.ikap("ikcu", ikam(int ), (int)27)) break;
                v5 /* !! */  = (long)fg.ikap("ikcv", ikam(int ), (int)28);
            }
            v6 = var1_1.getMessage();
            v7 /* !! */  = fg.pu;
            if (true) ** GOTO lbl60
            block58: while (true) {
                v7 /* !! */  = (long)(v8 - fg.ikap("ikcw", ikau(int ), (int)26));
lbl60:
                // 2 sources

                switch ((int)v7 /* !! */ ) {
                    case -1669463446: {
                        break block58;
                    }
                    case -768820442: {
                        v8 = fg.ikap("ikcx", ikau(int ), (int)27);
                        continue block58;
                    }
                    case 1952603394: {
                        v8 = fg.ikap("ikcy", ikau(int ), (int)28);
                        continue block58;
                    }
                }
                break;
            }
            if (fg.isBlockedCommand(v6)) ** GOTO lbl78
            if (var4_4) ** GOTO lbl36
        }
        if (var4_4) ** GOTO lbl36
        if (var5_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_4) ** GOTO lbl36
                return;
            }
lbl78:
            // 1 sources

            if (var4_4 || var4_4) ** GOTO lbl36
            v9 = fg.ikap("ikcz", ikam(int ), (int)29);
            while (true) {
                if ((v10 /* !! */  = (cfr_temp_2 = fg.pu - fg.ikap("ikda", ikau(int ), (int)29)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v10 /* !! */  == fg.ikap("ikdb", ikam(int ), (int)30)) break;
                v10 /* !! */  = (long)fg.ikap("ikdc", ikam(int ), (int)31);
            }
            var1_1.setCancelled((boolean)v9);
            if (var4_4 || var4_4) ** GOTO lbl36
            v11 /* !! */  = fg.pu;
            if (true) ** GOTO lbl91
            block60: while (true) {
                v11 /* !! */  = (long)(v12 - fg.ikap("ikdd", ikau(int ), (int)30));
lbl91:
                // 2 sources

                switch ((int)v11 /* !! */ ) {
                    case -1669463446: {
                        break block60;
                    }
                    case 221170806: {
                        v12 = fg.ikap("ikde", ikau(int ), (int)31);
                        continue block60;
                    }
                    case 947845387: {
                        v12 = fg.ikap("ikdf", ikau(int ), (int)32);
                        continue block60;
                    }
                }
                break;
            }
            var2_5 = System.currentTimeMillis();
            if (var4_4 || var4_4) ** GOTO lbl36
            while (true) {
                if ((v13 /* !! */  = (cfr_temp_3 = fg.pu - fg.ikap("ikdg", ikau(int ), (int)33)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v13 /* !! */  == fg.ikap("ikdh", ikam(int ), (int)32)) break;
                v13 /* !! */  = (long)fg.ikap("ikdi", ikam(int ), (int)33);
            }
            if (var2_5 - this.lastWarningAt < fg.ikap("ikdj", ikau(int ), (int)34)) ** GOTO lbl127
            if (var4_4 || var4_4) ** GOTO lbl36
            v14 /* !! */  = fg.pu;
            if (true) ** GOTO lbl113
            block62: while (true) {
                v14 /* !! */  = (long)(fg.ikap("ikdl", ikau(int ), (int)36) - fg.ikap("ikdk", ikau(int ), (int)35));
lbl113:
                // 2 sources

                switch ((int)v14 /* !! */ ) {
                    case -1669463446: {
                        break block62;
                    }
                    case -166590052: {
                        continue block62;
                    }
                }
                break;
            }
            this.lastWarningAt = var2_5;
            if (var4_4 || var4_4) ** GOTO lbl36
            while (true) {
                if ((v15 /* !! */  = (cfr_temp_4 = fg.pu - fg.ikap("ikdm", ikau(int ), (int)37)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                if (v15 /* !! */  == fg.ikap("ikdn", ikam(int ), (int)34)) break;
                v15 /* !! */  = (long)fg.ikap("ikdo", ikam(int ), (int)35);
            }
            ee.info("\u0412\u044b\u0445\u043e\u0434 \u0437\u0430\u043f\u0440\u0435\u0449\u0451\u043d \u0442\u0430\u043a \u043a\u0430\u043a \u0430\u043a\u0442\u0438\u0432\u0435\u043d PvP-\u0440\u0435\u0436\u0438\u043c");
            if (var4_4) ** GOTO lbl36
lbl127:
            // 2 sources

            if (!var4_4 && !var4_4) ** break;
            ** continue;
            return;
lbl130:
            // 2 sources

            case 0: {
                var5_3 /* !! */  = (int)fg.ikap("ikdp", ikam(int ), (int)36);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl203
            }
lbl135:
            // 3 sources

            case 1: {
                var5_3 /* !! */  = (int)fg.ikap("ikdq", ikam(int ), (int)37);
                if (!var6_2) break;
                throw null;
            }
lbl139:
            // 2 sources

            case 2: {
                var5_3 /* !! */  = (int)fg.ikap("ikdr", ikam(int ), (int)38);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl159
            }
lbl144:
            // 3 sources

            case 3: {
                var5_3 /* !! */  = (int)fg.ikap("ikds", ikam(int ), (int)39);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl203
            }
lbl149:
            // 3 sources

            case 4: {
                var5_3 /* !! */  = (int)fg.ikap("ikdt", ikam(int ), (int)40);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl177
            }
lbl154:
            // 2 sources

            case 5: {
                do {
                    var5_3 /* !! */  = (int)fg.ikap("ikdu", ikam(int ), (int)41);
                } while (!var6_2);
                throw null;
            }
lbl159:
            // 3 sources

            case 6: {
                var5_3 /* !! */  = (int)fg.ikap("ikdv", ikam(int ), (int)42);
                if (!var6_2) ** GOTO lbl144
                throw null;
            }
            case 7: {
                var5_3 /* !! */  = (int)fg.ikap("ikdw", ikam(int ), (int)43);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl194
            }
            case 8: {
                var5_3 /* !! */  = (int)fg.ikap("ikdx", ikam(int ), (int)44);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl198
            }
            case 9: {
                var5_3 /* !! */  = (int)fg.ikap("ikdy", ikam(int ), (int)45);
                if (!var6_2) ** GOTO lbl135
                throw null;
            }
lbl177:
            // 2 sources

            case 10: {
                var5_3 /* !! */  = (int)fg.ikap("ikdz", ikam(int ), (int)46);
                if (!var6_2) ** GOTO lbl135
                throw null;
            }
            case 11: {
                var5_3 /* !! */  = (int)fg.ikap("ikea", ikam(int ), (int)47);
                if (!var6_2) ** GOTO lbl130
                throw null;
            }
lbl185:
            // 2 sources

            case 12: {
                do {
                    var5_3 /* !! */  = (int)fg.ikap("ikeb", ikam(int ), (int)48);
                } while (!var6_2);
                throw null;
            }
            case 13: {
                var5_3 /* !! */  = (int)fg.ikap("ikec", ikam(int ), (int)49);
                if (!var6_2) ** GOTO lbl144
                throw null;
            }
lbl194:
            // 2 sources

            case 14: {
                var5_3 /* !! */  = (int)fg.ikap("iked", ikam(int ), (int)50);
                if (!var6_2) ** GOTO lbl149
                throw null;
            }
lbl198:
            // 3 sources

            case 15: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_3 /* !! */  = (int)fg.ikap("ikee", ikam(int ), (int)51);
                    if (!var6_2) ** GOTO lbl139
                    throw null;
                }
            }
lbl203:
            // 3 sources

            case 16: {
                var5_3 /* !! */  = (int)fg.ikap("ikef", ikam(int ), (int)52);
                if (!var6_2) ** GOTO lbl149
                throw null;
            }
            case 17: {
                var5_3 /* !! */  = (int)fg.ikap("ikeg", ikam(int ), (int)53);
                if (!var6_2) ** GOTO lbl154
                throw null;
            }
            case 18: {
                var5_3 /* !! */  = (int)fg.ikap("ikeh", ikam(int ), (int)54);
                if (!var6_2) ** GOTO lbl198
                throw null;
            }
            case 19: {
                var5_3 /* !! */  = (int)fg.ikap("ikei", ikam(int ), (int)55);
                if (!var6_2) ** GOTO lbl185
                throw null;
            }
            case 20: {
                var5_3 /* !! */  = (int)fg.ikap("ikej", ikam(int ), (int)56);
                if (!var6_2) ** GOTO lbl159
                throw null;
            }
            case 21: 
        }
        var5_3 /* !! */  = (int)fg.ikap("ikek", ikam(int ), (int)57);
        ** while (!var6_2)
lbl226:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ikjo() {
        fg.ikan[100] = -1795612539;
        fg.ikan[101] = -2043757047;
        fg.ikan[102] = -1647283178;
        fg.ikan[103] = 857088908;
        fg.ikan[104] = 1115777921;
        fg.ikan[105] = 1586706087;
        fg.ikan[106] = 2009924075;
        fg.ikan[107] = -1976639226;
        fg.ikan[108] = -940487228;
        fg.ikan[109] = 802928554;
        fg.ikan[110] = 2020274331;
        fg.ikan[111] = 1689530987;
        fg.ikan[112] = 1232872898;
        fg.ikan[113] = 523292605;
        fg.ikan[114] = -1480899692;
        fg.ikan[115] = 1405046241;
        fg.ikan[116] = 55220497;
        fg.ikan[117] = 171947331;
        fg.ikan[118] = 955478095;
        fg.ikan[119] = 960094237;
        fg.ikan[120] = 2118784656;
        fg.ikan[121] = 882055385;
        fg.ikan[122] = -922074483;
        fg.ikan[123] = -616006201;
        fg.ikan[124] = 496249563;
        fg.ikan[125] = -734707377;
        fg.ikan[126] = -1877345977;
        fg.ikan[127] = -1993749924;
        fg.ikan[128] = -1843424699;
        fg.ikan[129] = -1998276945;
        fg.ikan[130] = -93688097;
        fg.ikan[131] = -397433947;
        fg.ikan[132] = -1979574336;
        fg.ikan[133] = 959303443;
        fg.ikan[134] = -1901348445;
        fg.ikan[135] = -153558568;
        fg.ikan[136] = -163389344;
        fg.ikan[137] = 390320700;
        fg.ikan[138] = -777538740;
        fg.ikan[139] = -1886872366;
        fg.ikan[140] = 1131390664;
        fg.ikan[141] = 565438769;
        fg.ikan[142] = 1900710168;
        fg.ikan[143] = 1946308975;
        fg.ikan[144] = 323726007;
        fg.ikan[145] = 1593527459;
        fg.ikan[146] = -62866423;
        fg.ikan[147] = -1766623598;
        fg.ikan[148] = -837330707;
        fg.ikan[149] = 1974298229;
        fg.ikan[150] = 376124029;
        fg.ikan[151] = 860379246;
        fg.ikan[152] = -1671696257;
        fg.ikan[153] = 1684920948;
        fg.ikan[154] = 1263550283;
        fg.ikan[155] = -200061862;
        fg.ikan[156] = 1729537476;
        fg.ikan[157] = 2026744655;
        fg.ikan[158] = 1354417384;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public fg() {
        var2_1 /* !! */  = fg.b;
        super("PVPSafe", "\u0417\u0430\u043f\u0440\u0435\u0449\u0430\u0435\u0442 \u0432\u044b\u0445\u043e\u0434 \u0438 \u043a\u043e\u043c\u0430\u043d\u0434\u0443 /hub, \u043f\u043e\u043a\u0430 \u0430\u043a\u0442\u0438\u0432\u0435\u043d PvP-\u0440\u0435\u0436\u0438\u043c", du.MISC);
        fg.instance = this;
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                return;
            }
lbl8:
            // 2 sources

            case 0: {
                var2_1 /* !! */  = (int)fg.ikap("ikaq", ikam(int ), (int)0);
            }
            case 1: {
                var2_1 /* !! */  = (int)fg.ikap("ikar", ikam(int ), (int)1);
                ** GOTO lbl8
            }
            case 2: {
                while (true) {
                    var2_1 /* !! */  = (int)fg.ikap("ikas", ikam(int ), (int)2);
                }
            }
            case 3: 
        }
        while (true) {
            var2_1 /* !! */  = (int)fg.ikap("ikat", ikam(int ), (int)3);
        }
    }
}

