/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_10124
 *  net.minecraft.class_1268
 *  net.minecraft.class_1309
 *  net.minecraft.class_1657
 *  net.minecraft.class_1799
 *  net.minecraft.class_1802
 *  net.minecraft.class_2596
 *  net.minecraft.class_2868
 *  net.minecraft.class_4174
 *  net.minecraft.class_9334
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.ToDoubleFunction;
import net.minecraft.class_10124;
import net.minecraft.class_1268;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2596;
import net.minecraft.class_2868;
import net.minecraft.class_4174;
import net.minecraft.class_9334;
import ruhack.phobia.aw;
import ruhack.phobia.cy;
import ruhack.phobia.ds;
import ruhack.phobia.du;
import ruhack.phobia.gm$FoodChoice;
import ruhack.phobia.jx;
import ruhack.phobia.kg;
import ruhack.phobia.na;

public final class gm
extends ds {
    private static int[] dhla;
    private static long[] dhmk;
    public static final boolean a;
    private static gm instance;
    public static final boolean c;
    private static long[] dhmd;
    private int previousSlot;
    private final kg healthThreshold;
    private static int[] dhkx;
    private int eatingTicks;
    private boolean eating;
    public static final int b;
    private class_1268 eatingHand;
    private static volatile boolean eatingNow;
    public static final long hj = 2747968335222615266L;

    private static /* synthetic */ void djag() {
        gm.dhkx[300] = 166057747;
        gm.dhkx[301] = 1835621056;
        gm.dhkx[302] = 1436520601;
        gm.dhkx[303] = 180072764;
        gm.dhkx[304] = -1972133529;
        gm.dhkx[305] = 1134662660;
        gm.dhkx[306] = -2072757367;
        gm.dhkx[307] = 608086072;
        gm.dhkx[308] = 738069913;
        gm.dhkx[309] = 254778287;
        gm.dhkx[310] = -402888434;
        gm.dhkx[311] = -1644218358;
        gm.dhkx[312] = 2012149690;
        gm.dhkx[313] = 1184363852;
        gm.dhkx[314] = -160612211;
        gm.dhkx[315] = -853479674;
        gm.dhkx[316] = -585447635;
        gm.dhkx[317] = -956847918;
        gm.dhkx[318] = 348737779;
        gm.dhkx[319] = 728723256;
        gm.dhkx[320] = -632653963;
        gm.dhkx[321] = -371653207;
        gm.dhkx[322] = 1066519637;
        gm.dhkx[323] = 679145665;
        gm.dhkx[324] = -192047217;
        gm.dhkx[325] = 1243393402;
        gm.dhkx[326] = 1195220633;
        gm.dhkx[327] = 741412104;
        gm.dhkx[328] = 738856220;
        gm.dhkx[329] = 2037457601;
        gm.dhkx[330] = 1309025815;
        gm.dhkx[331] = -1774057818;
        gm.dhkx[332] = -1142901225;
        gm.dhkx[333] = 1605174380;
        gm.dhkx[334] = 1574738323;
        gm.dhkx[335] = -1924909455;
        gm.dhkx[336] = -834543097;
        gm.dhkx[337] = -37068154;
        gm.dhkx[338] = -68956177;
        gm.dhkx[339] = 938583273;
        gm.dhkx[340] = -43583346;
        gm.dhkx[341] = 80721725;
        gm.dhkx[342] = -974508039;
        gm.dhkx[343] = 760859287;
        gm.dhkx[344] = -1564481994;
        gm.dhkx[345] = -536252008;
        gm.dhkx[346] = 1682300404;
        gm.dhkx[347] = -1083759921;
        gm.dhkx[348] = 1065896342;
        gm.dhkx[349] = -1291130701;
        gm.dhkx[350] = 172084291;
        gm.dhkx[351] = -1531369417;
        gm.dhkx[352] = -531238582;
        gm.dhkx[353] = 171831346;
        gm.dhkx[354] = 1412706699;
        gm.dhkx[355] = 127169964;
        gm.dhkx[356] = -2091783771;
        gm.dhkx[357] = -1912838879;
        gm.dhkx[358] = -316508040;
        gm.dhkx[359] = 1441055613;
        gm.dhkx[360] = 1071971052;
        gm.dhkx[361] = -531296634;
        gm.dhkx[362] = 648160696;
        gm.dhkx[363] = 143735945;
        gm.dhkx[364] = 1940814330;
        gm.dhkx[365] = 1534839471;
        gm.dhkx[366] = 174724727;
        gm.dhkx[367] = 1155527112;
        gm.dhkx[368] = 1903714254;
        gm.dhkx[369] = -51792519;
        gm.dhkx[370] = -1268868790;
        gm.dhkx[371] = 1909835962;
        gm.dhkx[372] = 1222627575;
        gm.dhkx[373] = -2066536415;
        gm.dhkx[374] = -1272963290;
        gm.dhkx[375] = 1279344490;
        gm.dhkx[376] = 772959847;
        gm.dhkx[377] = 409351459;
        gm.dhkx[378] = 857019430;
        gm.dhkx[379] = -132031963;
        gm.dhkx[380] = 1480165102;
        gm.dhkx[381] = -794317932;
        gm.dhkx[382] = -178762623;
        gm.dhkx[383] = -376708868;
        gm.dhkx[384] = -1560778777;
        gm.dhkx[385] = -963243986;
        gm.dhkx[386] = 1624199775;
        gm.dhkx[387] = 1844669252;
        gm.dhkx[388] = -1356270430;
        gm.dhkx[389] = 1291327226;
        gm.dhkx[390] = 995355918;
        gm.dhkx[391] = 88568884;
        gm.dhkx[392] = 1230157502;
        gm.dhkx[393] = 1383305501;
        gm.dhkx[394] = 1859838482;
        gm.dhkx[395] = -1653496705;
        gm.dhkx[396] = 139307686;
        gm.dhkx[397] = -10835111;
        gm.dhkx[398] = 1695266279;
        gm.dhkx[399] = -2013960390;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void finishEating() {
        v0 /* !! */  = gm.hj;
        if (true) ** GOTO lbl5
        block47: while (true) {
            v0 /* !! */  = (long)(gm.dhld("digg", dhmc(int ), (int)108) - gm.dhld("digf", dhmc(int ), (int)107));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 989277410: {
                    break block47;
                }
                case 1695080152: {
                    continue block47;
                }
            }
            break;
        }
        var3_1 = gm.c;
        v1 /* !! */  = gm.hj;
        if (true) ** GOTO lbl15
        block48: while (true) {
            v1 /* !! */  = (long)(v2 - gm.dhld("digh", dhmc(int ), (int)109));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -41790732: {
                    v2 = gm.dhld("digi", dhmc(int ), (int)110);
                    continue block48;
                }
                case 989277410: {
                    break block48;
                }
                case 1238630946: {
                    v2 = gm.dhld("digj", dhmc(int ), (int)111);
                    continue block48;
                }
            }
            break;
        }
        var2_2 /* !! */  = gm.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_0 = gm.hj - gm.dhld("digk", dhmc(int ), (int)112)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == gm.dhld("digl", dhlg(int ), (int)242)) break;
            v3 /* !! */  = (long)gm.dhld("digm", dhlg(int ), (int)243);
        }
        var1_3 = gm.a;
        if (var3_1) {
            throw null;
lbl33:
            // 8 sources

            return;
        }
        if (var1_3) ** GOTO lbl33
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl33
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_1 = gm.hj - gm.dhld("dign", dhmc(int ), (int)113)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == gm.dhld("digo", dhlg(int ), (int)244)) break;
                    v4 /* !! */  = (long)gm.dhld("digp", dhlg(int ), (int)245);
                }
                v5 /* !! */  = gm.hj;
                if (true) ** GOTO lbl49
                block52: while (true) {
                    v5 /* !! */  = (long)(v6 - gm.dhld("digq", dhmc(int ), (int)114));
lbl49:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -2060493702: {
                            v6 = gm.dhld("digr", dhmc(int ), (int)115);
                            continue block52;
                        }
                        case -113244276: {
                            v6 = gm.dhld("digs", dhmc(int ), (int)116);
                            continue block52;
                        }
                        case 989277410: {
                            break block52;
                        }
                    }
                    break;
                }
                v7 = gm.mc.field_1690;
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_2 = gm.hj - gm.dhld("digt", dhmc(int ), (int)117)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == gm.dhld("digu", dhlg(int ), (int)246)) break;
                    v8 /* !! */  = (long)gm.dhld("digv", dhlg(int ), (int)247);
                }
                v9 = v7.field_1904;
                v10 = gm.dhld("digw", dhlg(int ), (int)248);
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_3 = gm.hj - gm.dhld("digx", dhmc(int ), (int)118)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v11 /* !! */  == gm.dhld("digy", dhlg(int ), (int)249)) break;
                    v11 /* !! */  = (long)gm.dhld("digz", dhlg(int ), (int)250);
                }
                v9.method_23481((boolean)v10);
                if (var1_3 || var1_3) ** GOTO lbl33
                v12 = gm.dhld("diha", dhlg(int ), (int)251);
                while (true) {
                    if ((v13 /* !! */  = (cfr_temp_4 = gm.hj - gm.dhld("dihb", dhmc(int ), (int)119)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v13 /* !! */  == gm.dhld("dihc", dhlg(int ), (int)252)) break;
                    v13 /* !! */  = (long)gm.dhld("dihd", dhlg(int ), (int)253);
                }
                this.eating = v12;
                if (var1_3 || var1_3) ** GOTO lbl33
                v14 = gm.dhld("dihe", dhlg(int ), (int)254);
                v15 /* !! */  = gm.hj;
                if (true) ** GOTO lbl86
                block56: while (true) {
                    v15 /* !! */  = (long)(gm.dhld("dihg", dhmc(int ), (int)121) - gm.dhld("dihf", dhmc(int ), (int)120));
lbl86:
                    // 2 sources

                    switch ((int)v15 /* !! */ ) {
                        case -891822081: {
                            continue block56;
                        }
                        case 989277410: {
                            break block56;
                        }
                    }
                    break;
                }
                gm.eatingNow = v14;
                if (var1_3 || var1_3) ** GOTO lbl33
                while (true) {
                    if ((v16 /* !! */  = (cfr_temp_5 = gm.hj - gm.dhld("dihh", dhmc(int ), (int)122)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v16 /* !! */  == gm.dhld("dihi", dhlg(int ), (int)255)) break;
                    v16 /* !! */  = (long)gm.dhld("dihj", dhlg(int ), (int)256);
                }
                this.eatingHand = null;
                if (var1_3 || var1_3) ** GOTO lbl33
                v17 = gm.dhld("dihk", dhlg(int ), (int)257);
                v18 /* !! */  = gm.hj;
                if (true) ** GOTO lbl105
                block58: while (true) {
                    v18 /* !! */  = (long)(v19 - gm.dhld("dihl", dhmc(int ), (int)123));
lbl105:
                    // 2 sources

                    switch ((int)v18 /* !! */ ) {
                        case 80549082: {
                            v19 = gm.dhld("dihm", dhmc(int ), (int)124);
                            continue block58;
                        }
                        case 989277410: {
                            break block58;
                        }
                        case 1905898648: {
                            v19 = gm.dhld("dihn", dhmc(int ), (int)125);
                            continue block58;
                        }
                    }
                    break;
                }
                this.eatingTicks = (int)v17;
                if (var1_3 || var1_3) ** GOTO lbl33
                v20 /* !! */  = gm.hj;
                if (true) ** GOTO lbl120
                block59: while (true) {
                    v20 /* !! */  = (long)(v21 - gm.dhld("diho", dhmc(int ), (int)126));
lbl120:
                    // 2 sources

                    switch ((int)v20 /* !! */ ) {
                        case -1038214562: {
                            v21 = gm.dhld("dihp", dhmc(int ), (int)127);
                            continue block59;
                        }
                        case 595365120: {
                            v21 = gm.dhld("dihq", dhmc(int ), (int)128);
                            continue block59;
                        }
                        case 692146756: {
                            v21 = gm.dhld("dihr", dhmc(int ), (int)129);
                            continue block59;
                        }
                        case 989277410: {
                            break block59;
                        }
                    }
                    break;
                }
                this.restoreSlot();
                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
lbl136:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)gm.dhld("dihs", dhlg(int ), (int)258);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl147
                    break;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)gm.dhld("diht", dhlg(int ), (int)259);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl183
            }
lbl147:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)gm.dhld("dihu", dhlg(int ), (int)260);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl197
            }
lbl152:
            // 3 sources

            case 3: {
                var2_2 /* !! */  = (int)gm.dhld("dihv", dhlg(int ), (int)261);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl193
            }
lbl157:
            // 2 sources

            case 4: {
                var2_2 /* !! */  = (int)gm.dhld("dihw", dhlg(int ), (int)262);
                if (!var3_1) ** GOTO lbl152
                throw null;
            }
            case 5: {
                var2_2 /* !! */  = (int)gm.dhld("dihx", dhlg(int ), (int)263);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl171
            }
            case 6: {
                var2_2 /* !! */  = (int)gm.dhld("dihy", dhlg(int ), (int)264);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl179
            }
lbl171:
            // 3 sources

            case 7: {
                var2_2 /* !! */  = (int)gm.dhld("dihz", dhlg(int ), (int)265);
                if (var3_1) {
                    throw null;
                }
            }
lbl175:
            // 4 sources

            case 8: {
                var2_2 /* !! */  = (int)gm.dhld("diia", dhlg(int ), (int)266);
                if (!var3_1) ** GOTO lbl171
                throw null;
            }
lbl179:
            // 2 sources

            case 9: {
                var2_2 /* !! */  = (int)gm.dhld("diib", dhlg(int ), (int)267);
                if (!var3_1) ** GOTO lbl136
                throw null;
            }
lbl183:
            // 2 sources

            case 10: {
                var2_2 /* !! */  = (int)gm.dhld("diic", dhlg(int ), (int)268);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl193
            }
            case 11: {
                do {
                    var2_2 /* !! */  = (int)gm.dhld("diid", dhlg(int ), (int)269);
                } while (!var3_1);
                throw null;
            }
lbl193:
            // 3 sources

            case 12: {
                var2_2 /* !! */  = (int)gm.dhld("diie", dhlg(int ), (int)270);
                if (!var3_1) ** GOTO lbl152
                throw null;
            }
lbl197:
            // 2 sources

            case 13: {
                var2_2 /* !! */  = (int)gm.dhld("diif", dhlg(int ), (int)271);
                if (!var3_1) ** GOTO lbl157
                throw null;
            }
            case 14: {
                var2_2 /* !! */  = (int)gm.dhld("diig", dhlg(int ), (int)272);
                if (!var3_1) ** GOTO lbl175
                throw null;
            }
            case 15: 
        }
        var2_2 /* !! */  = (int)gm.dhld("diih", dhlg(int ), (int)273);
        ** while (!var3_1)
lbl208:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void djgu() {
        gm.dhmk[100] = 7690177316095716162L;
        gm.dhmk[101] = -8880929508828801201L;
        gm.dhmk[102] = 4094161432404806374L;
        gm.dhmk[103] = 8231418307359332759L;
        gm.dhmk[104] = 2535522425785059822L;
        gm.dhmk[105] = 9138508887005673679L;
        gm.dhmk[106] = 2093568512375224238L;
        gm.dhmk[107] = -8669810735481287977L;
        gm.dhmk[108] = -6913571511857761150L;
        gm.dhmk[109] = 5752747754692561516L;
        gm.dhmk[110] = -8520124223582407329L;
        gm.dhmk[111] = 4229413589110374254L;
        gm.dhmk[112] = 7297039110691386976L;
        gm.dhmk[113] = 387173209478236690L;
        gm.dhmk[114] = -1221313575552613506L;
        gm.dhmk[115] = 9121198388403236203L;
        gm.dhmk[116] = 4489288483060095882L;
        gm.dhmk[117] = 3571423935566500925L;
        gm.dhmk[118] = 3044021346492555836L;
        gm.dhmk[119] = -8937062017266320218L;
        gm.dhmk[120] = -8225393461892754303L;
        gm.dhmk[121] = -4865414301819661623L;
        gm.dhmk[122] = -6410239514441177498L;
        gm.dhmk[123] = 1041121709590686438L;
        gm.dhmk[124] = -4062282600327425349L;
        gm.dhmk[125] = -7094429034124044468L;
        gm.dhmk[126] = -6036590207080777406L;
        gm.dhmk[127] = -3773878708991180327L;
        gm.dhmk[128] = 5744662768781216200L;
        gm.dhmk[129] = -6071700212906069803L;
        gm.dhmk[130] = -3030939957770612876L;
        gm.dhmk[131] = 4746996511751729698L;
        gm.dhmk[132] = 2889384274344157139L;
        gm.dhmk[133] = -3677009988239829028L;
        gm.dhmk[134] = -4362608700662748660L;
        gm.dhmk[135] = -7619405039554389456L;
        gm.dhmk[136] = -7403605598466435766L;
        gm.dhmk[137] = 6944330973905828740L;
        gm.dhmk[138] = -1064597899121861046L;
        gm.dhmk[139] = -6308917080946542442L;
        gm.dhmk[140] = -6064628940856761407L;
        gm.dhmk[141] = -1953484484241928575L;
        gm.dhmk[142] = -3005964800603070484L;
        gm.dhmk[143] = -8224558073052713428L;
        gm.dhmk[144] = -5644473750941589751L;
        gm.dhmk[145] = 5431718664258436658L;
        gm.dhmk[146] = 5704172841026291070L;
        gm.dhmk[147] = 8055682736695833794L;
        gm.dhmk[148] = -1283836387110588857L;
        gm.dhmk[149] = 8474430492846853060L;
        gm.dhmk[150] = 6634553462035379977L;
        gm.dhmk[151] = 2534268906573320953L;
        gm.dhmk[152] = 2454895612749927187L;
        gm.dhmk[153] = -8705475843583378611L;
        gm.dhmk[154] = 3683127373332206096L;
        gm.dhmk[155] = -9165651533416392587L;
        gm.dhmk[156] = 1069676269736222602L;
        gm.dhmk[157] = 3558661049299105602L;
        gm.dhmk[158] = 542629876625368632L;
        gm.dhmk[159] = 2487230434081472363L;
        gm.dhmk[160] = 2887361469260360766L;
        gm.dhmk[161] = -4550916633890384085L;
        gm.dhmk[162] = -8461685540040384231L;
        gm.dhmk[163] = -6179059184112164150L;
        gm.dhmk[164] = 7117417279373290970L;
        gm.dhmk[165] = -1791848478695391118L;
        gm.dhmk[166] = -2584340624280416521L;
        gm.dhmk[167] = -5071248881165612821L;
        gm.dhmk[168] = -2646471613202776508L;
        gm.dhmk[169] = -7079731747850634901L;
        gm.dhmk[170] = 2612369521912730677L;
        gm.dhmk[171] = 3647065741347169278L;
        gm.dhmk[172] = 5468363637587277517L;
        gm.dhmk[173] = -7682897438920296746L;
        gm.dhmk[174] = -8033870276381103953L;
        gm.dhmk[175] = 23045601498985147L;
        gm.dhmk[176] = -9014640104485068349L;
        gm.dhmk[177] = 8409233448124984196L;
        gm.dhmk[178] = -6279040608592796157L;
        gm.dhmk[179] = 4065456078696427012L;
        gm.dhmk[180] = 8694439727739246601L;
        gm.dhmk[181] = -2376834830250717418L;
        gm.dhmk[182] = 7726170411910695686L;
        gm.dhmk[183] = 4144337083230733691L;
        gm.dhmk[184] = 2596105550616568514L;
        gm.dhmk[185] = 5166577544325227988L;
        gm.dhmk[186] = -2850927540171063575L;
        gm.dhmk[187] = -6403783556098531942L;
        gm.dhmk[188] = -6976001493661898015L;
        gm.dhmk[189] = 605111109514283883L;
        gm.dhmk[190] = -6100326394470689422L;
        gm.dhmk[191] = 8497078280569946860L;
        gm.dhmk[192] = 3994801330743919210L;
        gm.dhmk[193] = 532336252670022347L;
        gm.dhmk[194] = -3161445897659086855L;
        gm.dhmk[195] = 7446450918087834862L;
        gm.dhmk[196] = 9097095084214108781L;
        gm.dhmk[197] = 2651833736710831783L;
        gm.dhmk[198] = 995913706513529458L;
        gm.dhmk[199] = -5254598985860149535L;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    @Override
    public void deactivate() {
        boolean bl2;
        block35: {
            while (true) {
                long l2;
                Object object;
                if ((object = (l2 = hj - gm.dhld("dhwa", dhmc(int ), (int)29)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
                if (object == gm.dhld("dhwb", dhlg(int ), (int)55)) break;
                object = gm.dhld("dhwc", dhlg(int ), (int)56);
            }
            bl2 = c;
            Object object = hj;
            block19: while (true) {
                switch ((int)object) {
                    case 989277410: {
                        break block19;
                    }
                    case 1967733723: {
                        object = gm.dhld("dhwe", dhmc(int ), (int)31) - gm.dhld("dhwd", dhmc(int ), (int)30);
                        continue block19;
                    }
                }
                break;
            }
            int n2 = b;
            Object object2 = hj;
            boolean bl3 = true;
            block20: while (true) {
                CallSite callSite;
                if (!bl3 || (bl3 = false) || !true) {
                    object2 = callSite - gm.dhld("dhwf", dhmc(int ), (int)32);
                }
                switch ((int)object2) {
                    case -664823898: {
                        callSite = gm.dhld("dhwg", dhmc(int ), (int)33);
                        continue block20;
                    }
                    case 33127907: {
                        callSite = gm.dhld("dhwh", dhmc(int ), (int)34);
                        continue block20;
                    }
                    case 602469314: {
                        callSite = gm.dhld("dhwi", dhmc(int ), (int)35);
                        continue block20;
                    }
                    case 989277410: {
                        break block20;
                    }
                }
                break;
            }
            boolean bl4 = a;
            if (bl2) {
                throw null;
            }
            if (bl4 || bl4) return;
            CallSite callSite = gm.dhld("dhwj", dhlg(int ), (int)57);
            while (true) {
                long l3;
                Object object3;
                if ((object3 = (l3 = hj - gm.dhld("dhwk", dhmc(int ), (int)36)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
                if (object3 == gm.dhld("dhwl", dhlg(int ), (int)58)) {
                    this.resetState((boolean)callSite);
                    if (bl4) return;
                    break;
                }
                object3 = gm.dhld("dhwm", dhlg(int ), (int)59);
            }
            if (bl4) {
                return;
            }
            if (n2 == 0) return;
            switch (n2) {
                default: {
                    return;
                }
                case 1: {
                    break block35;
                }
                case 2: {
                    CallSite callSite2 = gm.dhld("dhwp", dhlg(int ), (int)62);
                    if (bl2) {
                        throw null;
                    }
                }
                case 0: {
                    CallSite callSite3 = gm.dhld("dhwn", dhlg(int ), (int)60);
                    if (bl2) {
                        throw null;
                    }
                }
                case 4: {
                    CallSite callSite4 = gm.dhld("dhwr", dhlg(int ), (int)64);
                    if (bl2) {
                        throw null;
                    }
                }
                case 3: {
                    CallSite callSite5 = gm.dhld("dhwq", dhlg(int ), (int)63);
                    if (!bl2) break;
                    throw null;
                }
                case 5: 
            }
            CallSite callSite6 = gm.dhld("dhws", dhlg(int ), (int)65);
            if (bl2) {
                throw null;
            }
        }
        do {
            CallSite callSite = gm.dhld("dhwo", dhlg(int ), (int)61);
        } while (!bl2);
        throw null;
    }

    private static /* synthetic */ long dhmc(int n2) {
        return dhmd[n2] ^ dhmk[n2];
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    @aw
    public void onTick(cy var1_1) {
        block134: {
            block137: {
                block136: {
                    block133: {
                        while (true) {
                            if ((v0 /* !! */  = (cfr_temp_1 = gm.hj - gm.dhld("dhwt", dhmc(int ), (int)37)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                            if (v0 /* !! */  == gm.dhld("dhwu", dhlg(int ), (int)66)) break;
                            v0 /* !! */  = (long)gm.dhld("dhwv", dhlg(int ), (int)67);
                        }
                        var4_2 = gm.c;
                        v1 /* !! */  = gm.hj;
                        block63: while (true) {
                            switch ((int)v1 /* !! */ ) {
                                case 743677008: {
                                    v1 /* !! */  = (long)(gm.dhld("dhwx", dhmc(int ), (int)39) - gm.dhld("dhww", dhmc(int ), (int)38));
                                    continue block63;
                                }
                                case 989277410: {
                                    break block63;
                                }
                            }
                            break;
                        }
                        var3_3 /* !! */  = gm.b;
                        while (true) {
                            if ((v2 /* !! */  = (cfr_temp_2 = gm.hj - gm.dhld("dhwy", dhmc(int ), (int)40)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                            if (v2 /* !! */  == gm.dhld("dhwz", dhlg(int ), (int)68)) {
                                var2_4 = gm.a;
                                if (var4_2) {
                                    throw null;
                                }
                                break;
                            }
                            v2 /* !! */  = (long)gm.dhld("dhxa", dhlg(int ), (int)69);
                        }
                        if (var2_4 || var2_4) return;
                        while (true) {
                            if ((v3 /* !! */  = (cfr_temp_3 = gm.hj - gm.dhld("dhxb", dhmc(int ), (int)41)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                            if (v3 /* !! */  == gm.dhld("dhxc", dhlg(int ), (int)70)) break;
                            v3 /* !! */  = (long)gm.dhld("dhxd", dhlg(int ), (int)71);
                        }
                        while (true) {
                            if ((v4 /* !! */  = (cfr_temp_4 = gm.hj - gm.dhld("dhxe", dhmc(int ), (int)42)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                            if (v4 /* !! */  == gm.dhld("dhxf", dhlg(int ), (int)72)) {
                                if (gm.mc.field_1724 != null) {
                                    break;
                                }
                                break block133;
                            }
                            v4 /* !! */  = (long)gm.dhld("dhxg", dhlg(int ), (int)73);
                        }
                        if (var2_4) return;
                        v5 /* !! */  = gm.hj;
                        if (true) ** GOTO lbl44
                        block67: while (true) {
                            v5 /* !! */  = (long)(v6 - gm.dhld("dhxh", dhmc(int ), (int)43));
lbl44:
                            // 2 sources

                            switch ((int)v5 /* !! */ ) {
                                case -2004820434: {
                                    v6 = gm.dhld("dhxi", dhmc(int ), (int)44);
                                    continue block67;
                                }
                                case 623990879: {
                                    v6 = gm.dhld("dhxj", dhmc(int ), (int)45);
                                    continue block67;
                                }
                                case 989277410: {
                                    break block67;
                                }
                                case 2146164806: {
                                    v6 = gm.dhld("dhxk", dhmc(int ), (int)46);
                                    continue block67;
                                }
                            }
                            break;
                        }
                        while (true) {
                            if ((v7 /* !! */  = (cfr_temp_5 = gm.hj - gm.dhld("dhxl", dhmc(int ), (int)47)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                            if (v7 /* !! */  == gm.dhld("dhxm", dhlg(int ), (int)74)) {
                                if (gm.mc.field_1687 != null) {
                                    break;
                                }
                                break block133;
                            }
                            v7 /* !! */  = (long)gm.dhld("dhxn", dhlg(int ), (int)75);
                        }
                        if (var2_4) return;
                        while (true) {
                            if ((v8 /* !! */  = (cfr_temp_6 = gm.hj - gm.dhld("dhxo", dhmc(int ), (int)48)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                            if (v8 /* !! */  == gm.dhld("dhxp", dhlg(int ), (int)76)) break;
                            v8 /* !! */  = (long)gm.dhld("dhxq", dhlg(int ), (int)77);
                        }
                        while (true) {
                            if ((v9 /* !! */  = (cfr_temp_7 = gm.hj - gm.dhld("dhxr", dhmc(int ), (int)49)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                            if (v9 /* !! */  == gm.dhld("dhxs", dhlg(int ), (int)78)) {
                                if (gm.mc.field_1761 != null) {
                                    break;
                                }
                                break block133;
                            }
                            v9 /* !! */  = (long)gm.dhld("dhxt", dhlg(int ), (int)79);
                        }
                        if (var2_4) return;
                        v10 /* !! */  = gm.hj;
                        if (true) ** GOTO lbl83
                        block71: while (true) {
                            v10 /* !! */  = (long)(v11 - gm.dhld("dhxu", dhmc(int ), (int)50));
lbl83:
                            // 2 sources

                            switch ((int)v10 /* !! */ ) {
                                case 485737972: {
                                    v11 = gm.dhld("dhxv", dhmc(int ), (int)51);
                                    continue block71;
                                }
                                case 677491856: {
                                    v11 = gm.dhld("dhxw", dhmc(int ), (int)52);
                                    continue block71;
                                }
                                case 989277410: {
                                    break block71;
                                }
                            }
                            break;
                        }
                        while (true) {
                            if ((v12 /* !! */  = (cfr_temp_8 = gm.hj - gm.dhld("dhxx", dhmc(int ), (int)53)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                            if (v12 /* !! */  == gm.dhld("dhxy", dhlg(int ), (int)80)) {
                                if (gm.mc.method_1562() != null) {
                                    break;
                                }
                                break block133;
                            }
                            v12 /* !! */  = (long)gm.dhld("dhxz", dhlg(int ), (int)81);
                        }
                        if (var2_4) return;
                        while (true) {
                            block135: {
                                if ((v13 /* !! */  = (cfr_temp_9 = gm.hj - gm.dhld("dhya", dhmc(int ), (int)54)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                                if (v13 /* !! */  != gm.dhld("dhyb", dhlg(int ), (int)82)) break block135;
                                v14 /* !! */  = gm.hj;
                                if (true) ** GOTO lbl111
                            }
                            v13 /* !! */  = (long)gm.dhld("dhyc", dhlg(int ), (int)83);
                        }
                        block74: while (true) {
                            v14 /* !! */  = (long)(v15 - gm.dhld("dhyd", dhmc(int ), (int)55));
lbl111:
                            // 2 sources

                            switch ((int)v14 /* !! */ ) {
                                case -967792122: {
                                    v15 = gm.dhld("dhye", dhmc(int ), (int)56);
                                    continue block74;
                                }
                                case -725661444: {
                                    v15 = gm.dhld("dhyf", dhmc(int ), (int)57);
                                    continue block74;
                                }
                                case 111991422: {
                                    v15 = gm.dhld("dhyg", dhmc(int ), (int)58);
                                    continue block74;
                                }
                                case 989277410: {
                                    break block74;
                                }
                            }
                            break;
                        }
                        if (gm.mc.field_1690 != null) break block136;
                        if (var2_4) return;
                    }
                    if (var2_4 || var2_4) return;
                    break block137;
                }
                if (var2_4 || var2_4) return;
                v16 /* !! */  = gm.hj;
                if (true) ** GOTO lbl147
            }
            v17 = gm.dhld("dhyh", dhlg(int ), (int)84);
            v18 /* !! */  = gm.hj;
            block75: while (true) {
                switch ((int)v18 /* !! */ ) {
                    case 989277410: {
                        break block75;
                    }
                    case 2027662535: {
                        v18 /* !! */  = (long)(gm.dhld("dhyj", dhmc(int ), (int)60) - gm.dhld("dhyi", dhmc(int ), (int)59));
                        continue block75;
                    }
                }
                break;
            }
            gm.eatingNow = v17;
            if (var2_4 || var2_4) return;
            return;
            block76: while (true) {
                v16 /* !! */  = (long)(v19 - gm.dhld("dhyk", dhmc(int ), (int)61));
lbl147:
                // 2 sources

                switch ((int)v16 /* !! */ ) {
                    case 449032132: {
                        v19 = gm.dhld("dhyl", dhmc(int ), (int)62);
                        continue block76;
                    }
                    case 472698506: {
                        v19 = gm.dhld("dhym", dhmc(int ), (int)63);
                        continue block76;
                    }
                    case 989277410: {
                        break block76;
                    }
                    case 1951618920: {
                        v19 = gm.dhld("dhyn", dhmc(int ), (int)64);
                        continue block76;
                    }
                }
                break;
            }
            if (!this.eating) ** GOTO lbl176
            if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
            cfr_temp_0 = -2147483648;
            while (true) {
                switch (cfr_temp_0 == -2147483648 ? var3_3 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var2_4 || var2_4) return;
                        while (true) {
                            if ((v20 /* !! */  = (cfr_temp_10 = gm.hj - gm.dhld("dhyo", dhmc(int ), (int)65)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
                            if (v20 /* !! */  == gm.dhld("dhyp", dhlg(int ), (int)85)) {
                                this.continueEating();
                                if (var2_4) return;
                                break;
                            }
                            v20 /* !! */  = (long)gm.dhld("dhyq", dhlg(int ), (int)86);
                        }
                        if (var2_4) return;
                        return;
                    }
lbl176:
                    // 1 sources

                    if (var2_4 || var2_4) return;
                    ** GOTO lbl281
                    case 3: {
                        var3_3 /* !! */  = (int)gm.dhld("dhze", dhlg(int ), (int)97);
                        cfr_temp_0 = 20;
                        if (var4_2) {
                            throw null;
                        }
                        break block134;
                    }
                    case 4: {
                        var3_3 /* !! */  = (int)gm.dhld("dhzf", dhlg(int ), (int)98);
                        cfr_temp_0 = 11;
                        if (var4_2) {
                            throw null;
                        }
                        break block134;
                    }
                    case 6: {
                        var3_3 /* !! */  = (int)gm.dhld("dhzh", dhlg(int ), (int)100);
                        cfr_temp_0 = 1;
                        if (var4_2) {
                            throw null;
                        }
                        break block134;
                    }
                    case 8: {
                        var3_3 /* !! */  = (int)gm.dhld("dhzj", dhlg(int ), (int)102);
                        cfr_temp_0 = 22;
                        if (var4_2) {
                            throw null;
                        }
                        break block134;
                    }
                    case 10: {
                        var3_3 /* !! */  = (int)gm.dhld("dhzl", dhlg(int ), (int)104);
                        cfr_temp_0 = 26;
                        if (var4_2) {
                            throw null;
                        }
                        break block134;
                    }
                    case 11: {
                        var3_3 /* !! */  = (int)gm.dhld("dhzm", dhlg(int ), (int)105);
                        cfr_temp_0 = 0;
                        if (var4_2) {
                            throw null;
                        }
                        break block134;
                    }
                    case 12: {
                        var3_3 /* !! */  = (int)gm.dhld("dhzn", dhlg(int ), (int)106);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 2: {
                        var3_3 /* !! */  = (int)gm.dhld("dhzd", dhlg(int ), (int)96);
                        cfr_temp_0 = 9;
                        if (var4_2) {
                            throw null;
                        }
                        break block134;
                    }
                    case 13: {
                        var3_3 /* !! */  = (int)gm.dhld("dhzo", dhlg(int ), (int)107);
                        if (var4_2) {
                            throw null;
                        }
                        ** GOTO lbl-1000
                    }
                    case 15: {
                        var3_3 /* !! */  = (int)gm.dhld("dhzq", dhlg(int ), (int)109);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 0: {
                        var3_3 /* !! */  = (int)gm.dhld("dhzb", dhlg(int ), (int)94);
                        cfr_temp_0 = 17;
                        if (var4_2) {
                            throw null;
                        }
                        break block134;
                    }
                    case 23: {
                        var3_3 /* !! */  = (int)gm.dhld("dhzy", dhlg(int ), (int)117);
                        cfr_temp_0 = 19;
                        if (var4_2) {
                            throw null;
                        }
                        break block134;
                    }
                    case 24: {
                        var3_3 /* !! */  = (int)gm.dhld("dhzz", dhlg(int ), (int)118);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 21: {
                        var3_3 /* !! */  = (int)gm.dhld("dhzw", dhlg(int ), (int)115);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 5: {
                        var3_3 /* !! */  = (int)gm.dhld("dhzg", dhlg(int ), (int)99);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 19: {
                        var3_3 /* !! */  = (int)gm.dhld("dhzu", dhlg(int ), (int)113);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 14: {
                        var3_3 /* !! */  = (int)gm.dhld("dhzp", dhlg(int ), (int)108);
                        cfr_temp_0 = 27;
                        if (var4_2) {
                            throw null;
                        }
                        break block134;
                    }
                    case 25: {
                        ** GOTO lbl273
                    }
                    case 28: lbl-1000:
                    // 2 sources

                    {
                        var3_3 /* !! */  = (int)gm.dhld("diad", dhlg(int ), (int)122);
                        if (var4_2) {
                            throw null;
                        }
lbl273:
                        // 3 sources

                        var3_3 /* !! */  = (int)gm.dhld("diaa", dhlg(int ), (int)119);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 26: {
                        var3_3 /* !! */  = (int)gm.dhld("diab", dhlg(int ), (int)120);
                        if (var4_2) {
                            throw null;
                        }
                        ** GOTO lbl310
                    }
lbl281:
                    // 1 sources

                    v21 = gm.dhld("dhyr", dhlg(int ), (int)87);
                    while (true) {
                        if ((v22 /* !! */  = (cfr_temp_11 = gm.hj - gm.dhld("dhys", dhmc(int ), (int)66)) == 0L ? 0 : (cfr_temp_11 < 0L ? -1 : 1)) == false) continue;
                        if (v22 /* !! */  == gm.dhld("dhyt", dhlg(int ), (int)88)) {
                            gm.eatingNow = v21;
                            if (var2_4) return;
                            break;
                        }
                        v22 /* !! */  = (long)gm.dhld("dhyu", dhlg(int ), (int)89);
                    }
                    if (var2_4) return;
                    while (true) {
                        if ((v23 /* !! */  = (cfr_temp_12 = gm.hj - gm.dhld("dhyv", dhmc(int ), (int)67)) == 0L ? 0 : (cfr_temp_12 < 0L ? -1 : 1)) == false) continue;
                        if (v23 /* !! */  != gm.dhld("dhyw", dhlg(int ), (int)90)) ** GOTO lbl297
                        if (this.shouldStartEating()) {
                            break;
                        }
                        ** GOTO lbl308
lbl297:
                        // 1 sources

                        v23 /* !! */  = (long)gm.dhld("dhyx", dhlg(int ), (int)91);
                    }
                    if (var2_4 || var2_4) return;
                    while (true) {
                        if ((v24 /* !! */  = (cfr_temp_13 = gm.hj - gm.dhld("dhyy", dhmc(int ), (int)68)) == 0L ? 0 : (cfr_temp_13 < 0L ? -1 : 1)) == false) continue;
                        if (v24 /* !! */  == gm.dhld("dhyz", dhlg(int ), (int)92)) {
                            this.startEating();
                            if (var2_4) return;
                            break;
                        }
                        v24 /* !! */  = (long)gm.dhld("dhza", dhlg(int ), (int)93);
                    }
lbl308:
                    // 2 sources

                    if (!var2_4 && !var2_4) return;
                    return;
lbl310:
                    // 2 sources

                    case 1: {
                        var3_3 /* !! */  = (int)gm.dhld("dhzc", dhlg(int ), (int)95);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 7: {
                        var3_3 /* !! */  = (int)gm.dhld("dhzi", dhlg(int ), (int)101);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 20: {
                        var3_3 /* !! */  = (int)gm.dhld("dhzv", dhlg(int ), (int)114);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 17: {
                        var3_3 /* !! */  = (int)gm.dhld("dhzs", dhlg(int ), (int)111);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 27: {
                        var3_3 /* !! */  = (int)gm.dhld("diac", dhlg(int ), (int)121);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 16: {
                        var3_3 /* !! */  = (int)gm.dhld("dhzr", dhlg(int ), (int)110);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 9: {
                        var3_3 /* !! */  = (int)gm.dhld("dhzk", dhlg(int ), (int)103);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 18: {
                        var3_3 /* !! */  = (int)gm.dhld("dhzt", dhlg(int ), (int)112);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 22: 
                }
                break;
            }
            ** GOTO lbl347
        }
        do {
            if (true) ** continue;
lbl347:
            // 2 sources

            var3_3 /* !! */  = (int)gm.dhld("dhzx", dhlg(int ), (int)116);
            cfr_temp_0 = 1;
        } while (!var4_2);
        throw null;
    }

    private static /* synthetic */ void djcn() {
        gm.dhla[200] = 1082923551;
        gm.dhla[201] = -1444954725;
        gm.dhla[202] = -1295755475;
        gm.dhla[203] = -1267571692;
        gm.dhla[204] = -397683218;
        gm.dhla[205] = 2105334839;
        gm.dhla[206] = 958998902;
        gm.dhla[207] = 1187608356;
        gm.dhla[208] = -777810260;
        gm.dhla[209] = 550582506;
        gm.dhla[210] = 1074645342;
        gm.dhla[211] = 1452229080;
        gm.dhla[212] = -1459007011;
        gm.dhla[213] = 1381000522;
        gm.dhla[214] = -232234561;
        gm.dhla[215] = 2048380356;
        gm.dhla[216] = -1122982526;
        gm.dhla[217] = 758937;
        gm.dhla[218] = -944602591;
        gm.dhla[219] = 503792499;
        gm.dhla[220] = -1399306030;
        gm.dhla[221] = 1245601902;
        gm.dhla[222] = -1808519021;
        gm.dhla[223] = 507312558;
        gm.dhla[224] = -1119433686;
        gm.dhla[225] = -204426348;
        gm.dhla[226] = 1762510014;
        gm.dhla[227] = 1674163453;
        gm.dhla[228] = 1612985409;
        gm.dhla[229] = 1817313073;
        gm.dhla[230] = -1134829514;
        gm.dhla[231] = 176937837;
        gm.dhla[232] = 1011752095;
        gm.dhla[233] = -1869603286;
        gm.dhla[234] = 1370626067;
        gm.dhla[235] = -646668141;
        gm.dhla[236] = -1784214193;
        gm.dhla[237] = 70159046;
        gm.dhla[238] = -455203904;
        gm.dhla[239] = 1462070737;
        gm.dhla[240] = -1774651437;
        gm.dhla[241] = -1245132143;
        gm.dhla[242] = -951503351;
        gm.dhla[243] = 2079079959;
        gm.dhla[244] = 2086904120;
        gm.dhla[245] = -963236479;
        gm.dhla[246] = 1993863781;
        gm.dhla[247] = 1961379998;
        gm.dhla[248] = 644773820;
        gm.dhla[249] = -712348535;
        gm.dhla[250] = -419471027;
        gm.dhla[251] = -625688749;
        gm.dhla[252] = 1911896357;
        gm.dhla[253] = -1420586157;
        gm.dhla[254] = 1690547102;
        gm.dhla[255] = 409121392;
        gm.dhla[256] = -1400368282;
        gm.dhla[257] = 2080795303;
        gm.dhla[258] = 1469872016;
        gm.dhla[259] = 1349782365;
        gm.dhla[260] = 1977607159;
        gm.dhla[261] = 237089556;
        gm.dhla[262] = 899352660;
        gm.dhla[263] = 2062641853;
        gm.dhla[264] = 1620431042;
        gm.dhla[265] = -1797164865;
        gm.dhla[266] = -50502010;
        gm.dhla[267] = 2042741425;
        gm.dhla[268] = 1878788812;
        gm.dhla[269] = 1412383834;
        gm.dhla[270] = 1870224156;
        gm.dhla[271] = 882411189;
        gm.dhla[272] = 1735328528;
        gm.dhla[273] = 349560833;
        gm.dhla[274] = -297624050;
        gm.dhla[275] = -2068352037;
        gm.dhla[276] = 469794054;
        gm.dhla[277] = 2134115060;
        gm.dhla[278] = 1637644180;
        gm.dhla[279] = 1488251887;
        gm.dhla[280] = 587117809;
        gm.dhla[281] = 78070614;
        gm.dhla[282] = -2058895213;
        gm.dhla[283] = 380264154;
        gm.dhla[284] = 848762741;
        gm.dhla[285] = -902614991;
        gm.dhla[286] = -840173996;
        gm.dhla[287] = -208312757;
        gm.dhla[288] = 1211391596;
        gm.dhla[289] = -135655491;
        gm.dhla[290] = -1303292554;
        gm.dhla[291] = -969115757;
        gm.dhla[292] = -1579079943;
        gm.dhla[293] = 757906913;
        gm.dhla[294] = 640495654;
        gm.dhla[295] = 1972522960;
        gm.dhla[296] = -84585252;
        gm.dhla[297] = -2027196678;
        gm.dhla[298] = -1834945652;
        gm.dhla[299] = -2069791155;
    }

    private static /* synthetic */ void djdn() {
        gm.dhla[400] = 1393132966;
        gm.dhla[401] = -308193127;
        gm.dhla[402] = 1625629568;
        gm.dhla[403] = -9252163;
        gm.dhla[404] = -1066092757;
        gm.dhla[405] = 1097630073;
        gm.dhla[406] = 2008121844;
        gm.dhla[407] = -1082470880;
        gm.dhla[408] = -812567659;
        gm.dhla[409] = -200101855;
        gm.dhla[410] = -550735671;
        gm.dhla[411] = 1334833638;
        gm.dhla[412] = 418377380;
        gm.dhla[413] = -1191263760;
        gm.dhla[414] = 1040553703;
        gm.dhla[415] = -1769295297;
        gm.dhla[416] = -683991658;
        gm.dhla[417] = -1074735710;
        gm.dhla[418] = -750642002;
        gm.dhla[419] = 351149932;
        gm.dhla[420] = 960004661;
        gm.dhla[421] = -1150161650;
        gm.dhla[422] = 1501755880;
        gm.dhla[423] = 730719070;
        gm.dhla[424] = 637804799;
        gm.dhla[425] = -2127300400;
        gm.dhla[426] = 2147074948;
        gm.dhla[427] = 689061418;
        gm.dhla[428] = -2069381425;
        gm.dhla[429] = 1152006213;
        gm.dhla[430] = -1980538379;
        gm.dhla[431] = -1952292872;
        gm.dhla[432] = 1869525076;
        gm.dhla[433] = 1338937219;
        gm.dhla[434] = -654582423;
        gm.dhla[435] = 1256666927;
        gm.dhla[436] = 1862114954;
        gm.dhla[437] = 521678597;
        gm.dhla[438] = 2089145918;
        gm.dhla[439] = 1655123893;
        gm.dhla[440] = -185710506;
        gm.dhla[441] = 1402870475;
        gm.dhla[442] = 1517852427;
        gm.dhla[443] = -885231502;
        gm.dhla[444] = 1803122213;
        gm.dhla[445] = 2115803131;
        gm.dhla[446] = 355371856;
        gm.dhla[447] = 761942479;
        gm.dhla[448] = 521497573;
        gm.dhla[449] = 1532653237;
        gm.dhla[450] = 1796666247;
        gm.dhla[451] = 1504347092;
        gm.dhla[452] = 1137297821;
        gm.dhla[453] = 1550086519;
        gm.dhla[454] = -1752844042;
        gm.dhla[455] = -1793685192;
        gm.dhla[456] = 1934340365;
        gm.dhla[457] = -1620947407;
        gm.dhla[458] = 528617500;
        gm.dhla[459] = -1098576104;
        gm.dhla[460] = 304451813;
        gm.dhla[461] = -680581420;
        gm.dhla[462] = 1494073316;
        gm.dhla[463] = -1012436433;
        gm.dhla[464] = 1637917401;
        gm.dhla[465] = 1113998430;
        gm.dhla[466] = -107476025;
        gm.dhla[467] = 1623285652;
        gm.dhla[468] = -1568159562;
        gm.dhla[469] = -887296854;
        gm.dhla[470] = -1485006495;
        gm.dhla[471] = 1121261777;
        gm.dhla[472] = 1428875509;
        gm.dhla[473] = 881592112;
        gm.dhla[474] = -18129878;
        gm.dhla[475] = 59453476;
        gm.dhla[476] = -2062724092;
        gm.dhla[477] = -1471711845;
        gm.dhla[478] = 825617078;
        gm.dhla[479] = 1913996537;
        gm.dhla[480] = 188913269;
        gm.dhla[481] = -596030240;
        gm.dhla[482] = -1652155264;
        gm.dhla[483] = -656869490;
        gm.dhla[484] = 1142062047;
        gm.dhla[485] = 998256304;
        gm.dhla[486] = -790505810;
        gm.dhla[487] = -1662977064;
        gm.dhla[488] = -1421413902;
        gm.dhla[489] = 428667131;
        gm.dhla[490] = -461637824;
        gm.dhla[491] = 93451939;
        gm.dhla[492] = 2014087371;
        gm.dhla[493] = -336283211;
    }

    public static /* synthetic */ CallSite dhld(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean isSafeFood(class_1799 var1_1) {
        block116: {
            block115: {
                v0 /* !! */  = gm.hj;
                if (true) ** GOTO lbl5
                block69: while (true) {
                    v0 /* !! */  = (long)(gm.dhld("dimw", dhmc(int ), (int)171) - gm.dhld("dimv", dhmc(int ), (int)170));
lbl5:
                    // 2 sources

                    switch ((int)v0 /* !! */ ) {
                        case -1026283301: {
                            continue block69;
                        }
                        case 989277410: {
                            break block69;
                        }
                    }
                    break;
                }
                var4_2 = gm.c;
                v1 /* !! */  = gm.hj;
                if (true) ** GOTO lbl15
                block70: while (true) {
                    v1 /* !! */  = (long)(v2 - gm.dhld("dimx", dhmc(int ), (int)172));
lbl15:
                    // 2 sources

                    switch ((int)v1 /* !! */ ) {
                        case -200183922: {
                            v2 = gm.dhld("dimy", dhmc(int ), (int)173);
                            continue block70;
                        }
                        case 520721918: {
                            v2 = gm.dhld("dimz", dhmc(int ), (int)174);
                            continue block70;
                        }
                        case 989277410: {
                            break block70;
                        }
                        case 1169539559: {
                            v2 = gm.dhld("dina", dhmc(int ), (int)175);
                            continue block70;
                        }
                    }
                    break;
                }
                var3_3 /* !! */  = gm.b;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_0 = gm.hj - gm.dhld("dinb", dhmc(int ), (int)176)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == gm.dhld("dinc", dhlg(int ), (int)351)) break;
                    v3 /* !! */  = (long)gm.dhld("dind", dhlg(int ), (int)352);
                }
                var2_4 = gm.a;
                if (var4_2) {
                    throw null;
lbl37:
                    // 13 sources

                    return (boolean)gm.dhld("dine", dhlg(int ), (int)353);
                }
                if (var2_4 || var2_4) ** GOTO lbl37
                if (var1_1 == null) break block115;
                if (var2_4) ** GOTO lbl37
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_1 = gm.hj - gm.dhld("dinf", dhmc(int ), (int)177)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == gm.dhld("ding", dhlg(int ), (int)354)) break;
                    v4 /* !! */  = (long)gm.dhld("dinh", dhlg(int ), (int)355);
                }
                if (var1_1.method_7960()) break block115;
                if (var2_4) ** GOTO lbl37
                v5 /* !! */  = gm.hj;
                if (true) ** GOTO lbl54
                block74: while (true) {
                    v5 /* !! */  = (long)(v6 - gm.dhld("dini", dhmc(int ), (int)178));
lbl54:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case 589388791: {
                            v6 = gm.dhld("dinj", dhmc(int ), (int)179);
                            continue block74;
                        }
                        case 596499210: {
                            v6 = gm.dhld("dink", dhmc(int ), (int)180);
                            continue block74;
                        }
                        case 871977443: {
                            v6 = gm.dhld("dinl", dhmc(int ), (int)181);
                            continue block74;
                        }
                        case 989277410: {
                            break block74;
                        }
                    }
                    break;
                }
                v7 /* !! */  = gm.hj;
                if (true) ** GOTO lbl70
                block75: while (true) {
                    v7 /* !! */  = (long)(gm.dhld("dinn", dhmc(int ), (int)183) - gm.dhld("dinm", dhmc(int ), (int)182));
lbl70:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -1843299384: {
                            continue block75;
                        }
                        case 989277410: {
                            break block75;
                        }
                    }
                    break;
                }
                if (var1_1.method_58694(class_9334.field_50075) == null) break block115;
                if (var2_4) ** GOTO lbl37
                v8 /* !! */  = gm.hj;
                if (true) ** GOTO lbl81
                block76: while (true) {
                    v8 /* !! */  = (long)(gm.dhld("dinp", dhmc(int ), (int)185) - gm.dhld("dino", dhmc(int ), (int)184));
lbl81:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -1954476277: {
                            continue block76;
                        }
                        case 989277410: {
                            break block76;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_2 = gm.hj - gm.dhld("dinq", dhmc(int ), (int)186)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v9 /* !! */  == gm.dhld("dinr", dhlg(int ), (int)356)) break;
                    v9 /* !! */  = (long)gm.dhld("dins", dhlg(int ), (int)357);
                }
                if (var1_1.method_58694(class_9334.field_53964) != null) break block116;
                if (var2_4) ** GOTO lbl37
            }
            if (var2_4 || var2_4) ** GOTO lbl37
            return (boolean)gm.dhld("dint", dhlg(int ), (int)358);
        }
        if (var2_4 || var2_4) ** GOTO lbl37
        v10 /* !! */  = gm.hj;
        if (true) ** GOTO lbl103
        block78: while (true) {
            v10 /* !! */  = (long)(v11 - gm.dhld("dinu", dhmc(int ), (int)187));
lbl103:
            // 2 sources

            switch ((int)v10 /* !! */ ) {
                case -649919623: {
                    v11 = gm.dhld("dinv", dhmc(int ), (int)188);
                    continue block78;
                }
                case -258401204: {
                    v11 = gm.dhld("dinw", dhmc(int ), (int)189);
                    continue block78;
                }
                case 989277410: {
                    break block78;
                }
            }
            break;
        }
        while (true) {
            if ((v12 /* !! */  = (cfr_temp_3 = gm.hj - gm.dhld("dinx", dhmc(int ), (int)190)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v12 /* !! */  == gm.dhld("diny", dhlg(int ), (int)359)) break;
            v12 /* !! */  = (long)gm.dhld("dinz", dhlg(int ), (int)360);
        }
        if (var1_1.method_31574(class_1802.field_8511)) ** GOTO lbl203
        if (var2_4) ** GOTO lbl37
        while (true) {
            if ((v13 /* !! */  = (cfr_temp_4 = gm.hj - gm.dhld("dioa", dhmc(int ), (int)191)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v13 /* !! */  == gm.dhld("diob", dhlg(int ), (int)361)) break;
            v13 /* !! */  = (long)gm.dhld("dioc", dhlg(int ), (int)362);
        }
        v14 /* !! */  = gm.hj;
        if (true) ** GOTO lbl130
        block81: while (true) {
            v14 /* !! */  = (long)(v15 - gm.dhld("diod", dhmc(int ), (int)192));
lbl130:
            // 2 sources

            switch ((int)v14 /* !! */ ) {
                case -1803574512: {
                    v15 = gm.dhld("dioe", dhmc(int ), (int)193);
                    continue block81;
                }
                case -1498150632: {
                    v15 = gm.dhld("diof", dhmc(int ), (int)194);
                    continue block81;
                }
                case 989277410: {
                    break block81;
                }
            }
            break;
        }
        if (var1_1.method_31574(class_1802.field_8680)) ** GOTO lbl203
        if (var2_4) ** GOTO lbl37
        v16 /* !! */  = gm.hj;
        if (true) ** GOTO lbl145
        block82: while (true) {
            v16 /* !! */  = (long)(v17 - gm.dhld("diog", dhmc(int ), (int)195));
lbl145:
            // 2 sources

            switch ((int)v16 /* !! */ ) {
                case -81098075: {
                    v17 = gm.dhld("dioh", dhmc(int ), (int)196);
                    continue block82;
                }
                case 989277410: {
                    break block82;
                }
                case 2058938507: {
                    v17 = gm.dhld("dioi", dhmc(int ), (int)197);
                    continue block82;
                }
            }
            break;
        }
        while (true) {
            if ((v18 /* !! */  = (cfr_temp_5 = gm.hj - gm.dhld("dioj", dhmc(int ), (int)198)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v18 /* !! */  == gm.dhld("diok", dhlg(int ), (int)363)) break;
            v18 /* !! */  = (long)gm.dhld("diol", dhlg(int ), (int)364);
        }
        if (var1_1.method_31574(class_1802.field_8635)) ** GOTO lbl203
        if (var2_4) ** GOTO lbl37
        v19 /* !! */  = gm.hj;
        if (true) ** GOTO lbl166
        block84: while (true) {
            v19 /* !! */  = (long)(gm.dhld("dion", dhmc(int ), (int)200) - gm.dhld("diom", dhmc(int ), (int)199));
lbl166:
            // 2 sources

            switch ((int)v19 /* !! */ ) {
                case -219613340: {
                    continue block84;
                }
                case 989277410: {
                    break block84;
                }
            }
            break;
        }
        while (true) {
            if ((v20 /* !! */  = (cfr_temp_6 = gm.hj - gm.dhld("dioo", dhmc(int ), (int)201)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v20 /* !! */  == gm.dhld("diop", dhlg(int ), (int)365)) break;
            v20 /* !! */  = (long)gm.dhld("dioq", dhlg(int ), (int)366);
        }
        if (var1_1.method_31574(class_1802.field_8323)) ** GOTO lbl203
        if (var2_4) ** GOTO lbl37
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v21 /* !! */  = (cfr_temp_7 = gm.hj - gm.dhld("dior", dhmc(int ), (int)202)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v21 /* !! */  == gm.dhld("dios", dhlg(int ), (int)367)) break;
                    v21 /* !! */  = (long)gm.dhld("diot", dhlg(int ), (int)368);
                }
                v22 /* !! */  = gm.hj;
                if (true) ** GOTO lbl192
                block87: while (true) {
                    v22 /* !! */  = (long)(gm.dhld("diov", dhmc(int ), (int)204) - gm.dhld("diou", dhmc(int ), (int)203));
lbl192:
                    // 2 sources

                    switch ((int)v22 /* !! */ ) {
                        case 612055348: {
                            continue block87;
                        }
                        case 989277410: {
                            break block87;
                        }
                    }
                    break;
                }
                if (var1_1.method_31574(class_1802.field_8233)) ** GOTO lbl203
                if (var2_4) ** GOTO lbl37
                v23 = gm.dhld("diow", dhlg(int ), (int)369);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl206
lbl203:
                // 5 sources

                if (!var2_4 && !var2_4) ** break;
                ** continue;
                v23 = gm.dhld("diox", dhlg(int ), (int)370);
lbl206:
                // 2 sources

                return (boolean)v23;
            }
lbl207:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)gm.dhld("dioy", dhlg(int ), (int)371);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl255
            }
lbl212:
            // 3 sources

            case 1: {
                var3_3 /* !! */  = (int)gm.dhld("dioz", dhlg(int ), (int)372);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl227
            }
            case 2: {
                var3_3 /* !! */  = (int)gm.dhld("dipa", dhlg(int ), (int)373);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl280
            }
lbl222:
            // 4 sources

            case 3: {
                do {
                    var3_3 /* !! */  = (int)gm.dhld("dipb", dhlg(int ), (int)374);
                } while (!var4_2);
                throw null;
            }
lbl227:
            // 2 sources

            case 4: {
                var3_3 /* !! */  = (int)gm.dhld("dipc", dhlg(int ), (int)375);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl272
            }
lbl232:
            // 2 sources

            case 5: {
                var3_3 /* !! */  = (int)gm.dhld("dipd", dhlg(int ), (int)376);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl251
            }
lbl237:
            // 2 sources

            case 6: {
                var3_3 /* !! */  = (int)gm.dhld("dipe", dhlg(int ), (int)377);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl268
            }
            case 7: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)gm.dhld("dipf", dhlg(int ), (int)378);
                    if (!var4_2) ** GOTO lbl212
                    throw null;
                }
            }
            case 8: {
                var3_3 /* !! */  = (int)gm.dhld("dipg", dhlg(int ), (int)379);
                if (!var4_2) ** GOTO lbl232
                throw null;
            }
lbl251:
            // 3 sources

            case 9: {
                var3_3 /* !! */  = (int)gm.dhld("diph", dhlg(int ), (int)380);
                if (!var4_2) ** GOTO lbl212
                throw null;
            }
lbl255:
            // 2 sources

            case 10: {
                var3_3 /* !! */  = (int)gm.dhld("dipi", dhlg(int ), (int)381);
                if (!var4_2) ** GOTO lbl207
                throw null;
            }
            case 11: {
                var3_3 /* !! */  = (int)gm.dhld("dipj", dhlg(int ), (int)382);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl272
            }
lbl264:
            // 2 sources

            case 12: {
                var3_3 /* !! */  = (int)gm.dhld("dipk", dhlg(int ), (int)383);
                if (!var4_2) ** GOTO lbl251
                throw null;
            }
lbl268:
            // 3 sources

            case 13: {
                var3_3 /* !! */  = (int)gm.dhld("dipl", dhlg(int ), (int)384);
                if (!var4_2) ** GOTO lbl264
                throw null;
            }
lbl272:
            // 3 sources

            case 14: {
                var3_3 /* !! */  = (int)gm.dhld("dipm", dhlg(int ), (int)385);
                if (!var4_2) ** GOTO lbl268
                throw null;
            }
            case 15: {
                var3_3 /* !! */  = (int)gm.dhld("dipn", dhlg(int ), (int)386);
                if (!var4_2) ** GOTO lbl222
                throw null;
            }
lbl280:
            // 2 sources

            case 16: {
                var3_3 /* !! */  = (int)gm.dhld("dipo", dhlg(int ), (int)387);
                if (!var4_2) ** GOTO lbl222
                throw null;
            }
            case 17: {
                var3_3 /* !! */  = (int)gm.dhld("dipp", dhlg(int ), (int)388);
                if (!var4_2) ** GOTO lbl222
                throw null;
            }
            case 18: {
                var3_3 /* !! */  = (int)gm.dhld("dipq", dhlg(int ), (int)389);
                if (!var4_2) ** GOTO lbl237
                throw null;
            }
            case 19: 
        }
        var3_3 /* !! */  = (int)gm.dhld("dipr", dhlg(int ), (int)390);
        ** while (!var4_2)
lbl295:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void djdb() {
        gm.dhla[300] = 166057735;
        gm.dhla[301] = 1835621082;
        gm.dhla[302] = 1436520584;
        gm.dhla[303] = 180072745;
        gm.dhla[304] = -1972133518;
        gm.dhla[305] = 1134662674;
        gm.dhla[306] = -2072757347;
        gm.dhla[307] = 608086070;
        gm.dhla[308] = 738069912;
        gm.dhla[309] = 1479894452;
        gm.dhla[310] = -402888433;
        gm.dhla[311] = -589127449;
        gm.dhla[312] = 2012149691;
        gm.dhla[313] = 1097068094;
        gm.dhla[314] = 160612210;
        gm.dhla[315] = -2009027490;
        gm.dhla[316] = 585447634;
        gm.dhla[317] = 808047565;
        gm.dhla[318] = 348737779;
        gm.dhla[319] = -728723257;
        gm.dhla[320] = -239985417;
        gm.dhla[321] = -1424947799;
        gm.dhla[322] = 2125581397;
        gm.dhla[323] = -679145666;
        gm.dhla[324] = -470860765;
        gm.dhla[325] = 1243393384;
        gm.dhla[326] = 1195220638;
        gm.dhla[327] = 741412107;
        gm.dhla[328] = 738856223;
        gm.dhla[329] = 2037457605;
        gm.dhla[330] = 1309025812;
        gm.dhla[331] = -1774057821;
        gm.dhla[332] = -1142901230;
        gm.dhla[333] = 1605174399;
        gm.dhla[334] = 1574738327;
        gm.dhla[335] = -1924909448;
        gm.dhla[336] = -834543097;
        gm.dhla[337] = -37068137;
        gm.dhla[338] = -68956179;
        gm.dhla[339] = 938583269;
        gm.dhla[340] = -43583352;
        gm.dhla[341] = 80721724;
        gm.dhla[342] = -974508053;
        gm.dhla[343] = 760859280;
        gm.dhla[344] = -1564481985;
        gm.dhla[345] = -536252015;
        gm.dhla[346] = 1682300387;
        gm.dhla[347] = -1083759925;
        gm.dhla[348] = 1065896323;
        gm.dhla[349] = -1291130702;
        gm.dhla[350] = 172084314;
        gm.dhla[351] = -1531369418;
        gm.dhla[352] = 1010960134;
        gm.dhla[353] = 171831347;
        gm.dhla[354] = 1412706698;
        gm.dhla[355] = -16943104;
        gm.dhla[356] = 2091783770;
        gm.dhla[357] = -203221450;
        gm.dhla[358] = -316508040;
        gm.dhla[359] = 1441055612;
        gm.dhla[360] = -1212853846;
        gm.dhla[361] = -531296633;
        gm.dhla[362] = -49836163;
        gm.dhla[363] = -143735946;
        gm.dhla[364] = 68935506;
        gm.dhla[365] = 1534839470;
        gm.dhla[366] = -545774098;
        gm.dhla[367] = 1155527113;
        gm.dhla[368] = 82000372;
        gm.dhla[369] = -51792520;
        gm.dhla[370] = -1268868790;
        gm.dhla[371] = 1909835965;
        gm.dhla[372] = 1222627579;
        gm.dhla[373] = -2066536399;
        gm.dhla[374] = -1272963282;
        gm.dhla[375] = 1279344482;
        gm.dhla[376] = 772959855;
        gm.dhla[377] = 409351466;
        gm.dhla[378] = 857019435;
        gm.dhla[379] = -132031955;
        gm.dhla[380] = 1480165094;
        gm.dhla[381] = -794317946;
        gm.dhla[382] = -178762619;
        gm.dhla[383] = -376708883;
        gm.dhla[384] = -1560778779;
        gm.dhla[385] = -963244000;
        gm.dhla[386] = 1624199762;
        gm.dhla[387] = 1844669269;
        gm.dhla[388] = -1356270429;
        gm.dhla[389] = 1291327220;
        gm.dhla[390] = 995355908;
        gm.dhla[391] = 88568885;
        gm.dhla[392] = -991374684;
        gm.dhla[393] = 1383305493;
        gm.dhla[394] = -1859838483;
        gm.dhla[395] = -1644654897;
        gm.dhla[396] = 139307687;
        gm.dhla[397] = -1685157463;
        gm.dhla[398] = -1695266280;
        gm.dhla[399] = -2013960389;
    }

    private static /* synthetic */ void djas() {
        gm.dhkx[400] = 1626269440;
        gm.dhkx[401] = 308193126;
        gm.dhkx[402] = -1104508181;
        gm.dhkx[403] = -9252164;
        gm.dhkx[404] = 1236859309;
        gm.dhkx[405] = 1097630072;
        gm.dhkx[406] = 1549677934;
        gm.dhkx[407] = 1082470879;
        gm.dhkx[408] = -1554938479;
        gm.dhkx[409] = -200101856;
        gm.dhkx[410] = 652033003;
        gm.dhkx[411] = 1334833639;
        gm.dhkx[412] = 1373008624;
        gm.dhkx[413] = -1191263759;
        gm.dhkx[414] = 1615773981;
        gm.dhkx[415] = -1769295298;
        gm.dhkx[416] = 1263124460;
        gm.dhkx[417] = 1074735709;
        gm.dhkx[418] = -750641986;
        gm.dhkx[419] = 351149925;
        gm.dhkx[420] = 960004666;
        gm.dhkx[421] = -1150161649;
        gm.dhkx[422] = 1501755879;
        gm.dhkx[423] = 730719054;
        gm.dhkx[424] = 637804793;
        gm.dhkx[425] = -2127300390;
        gm.dhkx[426] = 2147074960;
        gm.dhkx[427] = 689061420;
        gm.dhkx[428] = -2069381431;
        gm.dhkx[429] = 1152006212;
        gm.dhkx[430] = -1980538396;
        gm.dhkx[431] = -1952292876;
        gm.dhkx[432] = 1869525072;
        gm.dhkx[433] = 1338937226;
        gm.dhkx[434] = -654582419;
        gm.dhkx[435] = 1256666914;
        gm.dhkx[436] = 1862114969;
        gm.dhkx[437] = 521678605;
        gm.dhkx[438] = 2089145910;
        gm.dhkx[439] = -1655123894;
        gm.dhkx[440] = -710925454;
        gm.dhkx[441] = 1402870474;
        gm.dhkx[442] = 1014240802;
        gm.dhkx[443] = -885231501;
        gm.dhkx[444] = -934657155;
        gm.dhkx[445] = 2115803131;
        gm.dhkx[446] = -355371857;
        gm.dhkx[447] = 737113065;
        gm.dhkx[448] = 521497572;
        gm.dhkx[449] = -1836180567;
        gm.dhkx[450] = -1796666248;
        gm.dhkx[451] = -849723522;
        gm.dhkx[452] = -1137297822;
        gm.dhkx[453] = -1600949330;
        gm.dhkx[454] = -1752844041;
        gm.dhkx[455] = -1290087726;
        gm.dhkx[456] = 1934340364;
        gm.dhkx[457] = 711958649;
        gm.dhkx[458] = -528617501;
        gm.dhkx[459] = 418623486;
        gm.dhkx[460] = 304451813;
        gm.dhkx[461] = -680581419;
        gm.dhkx[462] = -332045424;
        gm.dhkx[463] = -1012436433;
        gm.dhkx[464] = 1637917400;
        gm.dhkx[465] = -1734096422;
        gm.dhkx[466] = -107476025;
        gm.dhkx[467] = 1623285649;
        gm.dhkx[468] = -1568159559;
        gm.dhkx[469] = -887296863;
        gm.dhkx[470] = -1485006488;
        gm.dhkx[471] = 1121261763;
        gm.dhkx[472] = 1428875518;
        gm.dhkx[473] = 881592118;
        gm.dhkx[474] = -18129885;
        gm.dhkx[475] = 59453490;
        gm.dhkx[476] = -2062724075;
        gm.dhkx[477] = -1471711849;
        gm.dhkx[478] = 825617058;
        gm.dhkx[479] = 1913996523;
        gm.dhkx[480] = 188913264;
        gm.dhkx[481] = -596030235;
        gm.dhkx[482] = -1652155247;
        gm.dhkx[483] = -656869499;
        gm.dhkx[484] = 1142062030;
        gm.dhkx[485] = 998256294;
        gm.dhkx[486] = -790505796;
        gm.dhkx[487] = -1662977079;
        gm.dhkx[488] = -1421413913;
        gm.dhkx[489] = 428667105;
        gm.dhkx[490] = -461637802;
        gm.dhkx[491] = 93451938;
        gm.dhkx[492] = 2014087384;
        gm.dhkx[493] = -336283203;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private gm$FoodChoice bestFood() {
        var7_1 = gm.c;
        var6_2 /* !! */  = gm.b;
        var5_3 = gm.a;
        if (var7_1) {
            throw null;
lbl6:
            // 14 sources

            return null;
        }
        if (var5_3 || var5_3) ** GOTO lbl6
        var1_4 = gm.dhld("diii", dhlg(int ), (int)274) - gm.mc.field_1724.method_7344().method_7586();
        if (var5_3 || var5_3) ** GOTO lbl6
        var2_5 = new ArrayList<gm$FoodChoice>();
        if (var5_3 || var5_3) ** GOTO lbl6
        this.addChoice(var2_5, class_1268.field_5810, (int)gm.dhld("diij", dhlg(int ), (int)275), gm.mc.field_1724.method_6079(), (int)var1_4, (float)gm.dhld("diik", dhku(int ), (int)276));
        if (var6_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var6_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var5_3 || var5_3) ** GOTO lbl6
                var3_6 = gm.mc.field_1724.method_31548().method_67532();
                if (var5_3 || var5_3) ** GOTO lbl6
                this.addChoice(var2_5, class_1268.field_5808, var3_6, gm.mc.field_1724.method_6047(), (int)var1_4, (float)gm.dhld("diil", dhku(int ), (int)277));
                if (var5_3 || var5_3) ** GOTO lbl6
                var4_7 = gm.dhld("diim", dhlg(int ), (int)278);
                if (var5_3) ** GOTO lbl6
                do {
                    if (var5_3 || var5_3) ** GOTO lbl6
                    if (var4_7 >= gm.dhld("diin", dhlg(int ), (int)279)) ** GOTO lbl37
                    if (var5_3 || var5_3) ** GOTO lbl6
                    if (var4_7 == var3_6) ** GOTO lbl32
                    if (var5_3 || var5_3) ** GOTO lbl6
                    this.addChoice(var2_5, class_1268.field_5808, (int)var4_7, gm.mc.field_1724.method_31548().method_5438((int)var4_7), (int)var1_4, 0.0f);
                    if (var5_3) ** GOTO lbl6
lbl32:
                    // 2 sources

                    if (var5_3 || var5_3) ** GOTO lbl6
                    ++var4_7;
                    if (var5_3) ** GOTO lbl6
                } while (!var7_1);
                throw null;
lbl37:
                // 1 sources

                if (!var5_3 && !var5_3) ** break;
                ** continue;
                return var2_5.stream().min(Comparator.comparingDouble((ToDoubleFunction<gm$FoodChoice>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)D, score(), (Lruhack/phobia/gm$FoodChoice;)D)())).orElse(null);
            }
lbl40:
            // 2 sources

            case 0: {
                var6_2 /* !! */  = (int)gm.dhld("diio", dhlg(int ), (int)280);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl50
            }
            case 1: {
                var6_2 /* !! */  = (int)gm.dhld("diip", dhlg(int ), (int)281);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl88
            }
lbl50:
            // 2 sources

            case 2: {
                var6_2 /* !! */  = (int)gm.dhld("diiq", dhlg(int ), (int)282);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl74
            }
lbl55:
            // 3 sources

            case 3: {
                var6_2 /* !! */  = (int)gm.dhld("diir", dhlg(int ), (int)283);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl79
            }
lbl60:
            // 4 sources

            case 4: {
                var6_2 /* !! */  = (int)gm.dhld("diis", dhlg(int ), (int)284);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl97
            }
lbl65:
            // 2 sources

            case 5: {
                var6_2 /* !! */  = (int)gm.dhld("diit", dhlg(int ), (int)285);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl106
            }
            case 6: {
                var6_2 /* !! */  = (int)gm.dhld("diiu", dhlg(int ), (int)286);
                if (!var7_1) break;
                throw null;
            }
lbl74:
            // 2 sources

            case 7: {
                var6_2 /* !! */  = (int)gm.dhld("diiv", dhlg(int ), (int)287);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl102
            }
lbl79:
            // 2 sources

            case 8: {
                var6_2 /* !! */  = (int)gm.dhld("diiw", dhlg(int ), (int)288);
                if (!var7_1) ** GOTO lbl60
                throw null;
            }
            case 9: {
                var6_2 /* !! */  = (int)gm.dhld("diix", dhlg(int ), (int)289);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl150
            }
lbl88:
            // 3 sources

            case 10: {
                var6_2 /* !! */  = (int)gm.dhld("diiy", dhlg(int ), (int)290);
                if (!var7_1) ** GOTO lbl60
                throw null;
            }
lbl92:
            // 2 sources

            case 11: {
                var6_2 /* !! */  = (int)gm.dhld("diiz", dhlg(int ), (int)291);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl146
            }
lbl97:
            // 2 sources

            case 12: {
                var6_2 /* !! */  = (int)gm.dhld("dija", dhlg(int ), (int)292);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl150
            }
lbl102:
            // 2 sources

            case 13: {
                var6_2 /* !! */  = (int)gm.dhld("dijb", dhlg(int ), (int)293);
                if (!var7_1) ** GOTO lbl65
                throw null;
            }
lbl106:
            // 2 sources

            case 14: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var6_2 /* !! */  = (int)gm.dhld("dijc", dhlg(int ), (int)294);
                    if (var7_1) {
                        throw null;
                    }
                    ** GOTO lbl129
                    break;
                }
            }
            case 15: {
                var6_2 /* !! */  = (int)gm.dhld("dijd", dhlg(int ), (int)295);
                if (!var7_1) ** GOTO lbl40
                throw null;
            }
lbl116:
            // 2 sources

            case 16: {
                var6_2 /* !! */  = (int)gm.dhld("dije", dhlg(int ), (int)296);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl125
            }
lbl121:
            // 2 sources

            case 17: {
                var6_2 /* !! */  = (int)gm.dhld("dijf", dhlg(int ), (int)297);
                if (!var7_1) ** GOTO lbl88
                throw null;
            }
lbl125:
            // 2 sources

            case 18: {
                var6_2 /* !! */  = (int)gm.dhld("dijg", dhlg(int ), (int)298);
                if (!var7_1) ** GOTO lbl92
                throw null;
            }
lbl129:
            // 2 sources

            case 19: {
                var6_2 /* !! */  = (int)gm.dhld("dijh", dhlg(int ), (int)299);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl154
            }
            case 20: {
                var6_2 /* !! */  = (int)gm.dhld("diji", dhlg(int ), (int)300);
                if (!var7_1) ** GOTO lbl116
                throw null;
            }
            case 21: {
                var6_2 /* !! */  = (int)gm.dhld("dijj", dhlg(int ), (int)301);
                if (!var7_1) ** GOTO lbl55
                throw null;
            }
lbl142:
            // 3 sources

            case 22: {
                var6_2 /* !! */  = (int)gm.dhld("dijk", dhlg(int ), (int)302);
                if (!var7_1) ** GOTO lbl55
                throw null;
            }
lbl146:
            // 2 sources

            case 23: {
                var6_2 /* !! */  = (int)gm.dhld("dijl", dhlg(int ), (int)303);
                if (!var7_1) ** GOTO lbl121
                throw null;
            }
lbl150:
            // 3 sources

            case 24: {
                var6_2 /* !! */  = (int)gm.dhld("dijm", dhlg(int ), (int)304);
                if (!var7_1) ** GOTO lbl142
                throw null;
            }
lbl154:
            // 2 sources

            case 25: {
                var6_2 /* !! */  = (int)gm.dhld("dijn", dhlg(int ), (int)305);
                if (!var7_1) ** GOTO lbl142
                throw null;
            }
            case 26: {
                var6_2 /* !! */  = (int)gm.dhld("dijo", dhlg(int ), (int)306);
                if (!var7_1) ** GOTO lbl60
                throw null;
            }
            case 27: 
        }
        var6_2 /* !! */  = (int)gm.dhld("dijp", dhlg(int ), (int)307);
        ** while (!var7_1)
lbl165:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ float dhku(int n2) {
        return Float.intBitsToFloat(dhkx[n2] ^ dhla[n2]);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static boolean isEatingNow() {
        v0 /* !! */  = gm.hj;
        if (true) ** GOTO lbl5
        block25: while (true) {
            v0 /* !! */  = (long)(v1 - gm.dhld("dhmm", dhmc(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -913888853: {
                    v1 = gm.dhld("dhmn", dhmc(int ), (int)1);
                    continue block25;
                }
                case 663427613: {
                    v1 = gm.dhld("dhmo", dhmc(int ), (int)2);
                    continue block25;
                }
                case 989277410: {
                    break block25;
                }
                case 1150927167: {
                    v1 = gm.dhld("dhmp", dhmc(int ), (int)3);
                    continue block25;
                }
            }
            break;
        }
        var2 = gm.c;
        v2 /* !! */  = gm.hj;
        if (true) ** GOTO lbl22
        block26: while (true) {
            v2 /* !! */  = (long)(gm.dhld("dhmr", dhmc(int ), (int)5) - gm.dhld("dhmq", dhmc(int ), (int)4));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 989277410: {
                    break block26;
                }
                case 1236198078: {
                    continue block26;
                }
            }
            break;
        }
        var1_1 /* !! */  = gm.b;
        v3 /* !! */  = gm.hj;
        if (true) ** GOTO lbl32
        block27: while (true) {
            v3 /* !! */  = (long)(v4 - gm.dhld("dhmu", dhmc(int ), (int)6));
lbl32:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1941704644: {
                    v4 = gm.dhld("dhmv", dhmc(int ), (int)7);
                    continue block27;
                }
                case 989277410: {
                    break block27;
                }
                case 1266545337: {
                    v4 = gm.dhld("dhmw", dhmc(int ), (int)8);
                    continue block27;
                }
            }
            break;
        }
        var0_2 = gm.a;
        if (var2) {
            throw null;
            return (boolean)gm.dhld("dhmy", dhlg(int ), (int)11);
        }
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var0_2 || var0_2) ** continue;
                v5 /* !! */  = gm.hj;
                if (true) ** GOTO lbl54
                block29: while (true) {
                    v5 /* !! */  = (long)(gm.dhld("dhnc", dhmc(int ), (int)10) - gm.dhld("dhnb", dhmc(int ), (int)9));
lbl54:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1547531547: {
                            continue block29;
                        }
                        case 989277410: {
                            break block29;
                        }
                    }
                    break;
                }
                return gm.eatingNow;
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var1_1 /* !! */  = (int)gm.dhld("dhnd", dhlg(int ), (int)12);
                    if (!var2) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 1: {
                var1_1 /* !! */  = (int)gm.dhld("dhnh", dhlg(int ), (int)13);
                if (var2) {
                    throw null;
                }
            }
            case 2: {
                var1_1 /* !! */  = (int)gm.dhld("dhni", dhlg(int ), (int)14);
                if (!var2) break;
                throw null;
            }
            case 3: 
        }
        var1_1 /* !! */  = (int)gm.dhld("dhnj", dhlg(int ), (int)15);
        ** while (!var2)
lbl76:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void activate() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = gm.hj - gm.dhld("dhvh", dhmc(int ), (int)23)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == gm.dhld("dhvi", dhlg(int ), (int)42)) break;
            v0 /* !! */  = (long)gm.dhld("dhvj", dhlg(int ), (int)43);
        }
        var3_1 = gm.c;
        v1 /* !! */  = gm.hj;
        if (true) ** GOTO lbl11
        block14: while (true) {
            v1 /* !! */  = (long)(v2 - gm.dhld("dhvk", dhmc(int ), (int)24));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1127417753: {
                    v2 = gm.dhld("dhvl", dhmc(int ), (int)25);
                    continue block14;
                }
                case -580027892: {
                    v2 = gm.dhld("dhvm", dhmc(int ), (int)26);
                    continue block14;
                }
                case 989277410: {
                    break block14;
                }
            }
            break;
        }
        var2_2 /* !! */  = gm.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = gm.hj - gm.dhld("dhvn", dhmc(int ), (int)27)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == gm.dhld("dhvo", dhlg(int ), (int)44)) break;
            v3 /* !! */  = (long)gm.dhld("dhvp", dhlg(int ), (int)45);
        }
        var1_3 = gm.a;
        if (!var3_1) ** GOTO lbl33
        throw null;
lbl-1000:
        // 2 sources

        {
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var2_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return;
                }
lbl33:
                // 1 sources

                if (var1_3 || var1_3) ** GOTO lbl-1000
                v4 = gm.dhld("dhvq", dhlg(int ), (int)46);
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_2 = gm.hj - gm.dhld("dhvr", dhmc(int ), (int)28)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == gm.dhld("dhvs", dhlg(int ), (int)47)) break;
                    v5 /* !! */  = (long)gm.dhld("dhvt", dhlg(int ), (int)48);
                }
                this.resetState((boolean)v4);
                if (var1_3 || var1_3) continue block16;
                return;
lbl43:
                // 3 sources

                case 0: {
                    var2_2 /* !! */  = (int)gm.dhld("dhvu", dhlg(int ), (int)49);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl56
                }
lbl48:
                // 2 sources

                case 1: {
                    var2_2 /* !! */  = (int)gm.dhld("dhvv", dhlg(int ), (int)50);
                    if (!var3_1) ** GOTO lbl43
                    throw null;
                }
                case 2: {
                    var2_2 /* !! */  = (int)gm.dhld("dhvw", dhlg(int ), (int)51);
                    if (!var3_1) ** GOTO lbl43
                    throw null;
                }
lbl56:
                // 2 sources

                case 3: {
                    var2_2 /* !! */  = (int)gm.dhld("dhvx", dhlg(int ), (int)52);
                    if (!var3_1) ** GOTO lbl48
                    throw null;
                }
                case 4: {
                    do {
                        var2_2 /* !! */  = (int)gm.dhld("dhvy", dhlg(int ), (int)53);
                    } while (!var3_1);
                    throw null;
                }
                case 5: 
            }
        }
        do {
            var2_2 /* !! */  = (int)gm.dhld("dhvz", dhlg(int ), (int)54);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ void djet() {
        gm.dhmd[100] = -5734349795413766568L;
        gm.dhmd[101] = 8094777949519014021L;
        gm.dhmd[102] = 9066594319347107924L;
        gm.dhmd[103] = 1746234802402550049L;
        gm.dhmd[104] = -557084506224975073L;
        gm.dhmd[105] = 4503244944508716537L;
        gm.dhmd[106] = -7489341561984596949L;
        gm.dhmd[107] = 8441878071469385381L;
        gm.dhmd[108] = -1882187791397087250L;
        gm.dhmd[109] = -190237209826256491L;
        gm.dhmd[110] = 8628879140938701523L;
        gm.dhmd[111] = 2108485705997927280L;
        gm.dhmd[112] = -5069161894242595952L;
        gm.dhmd[113] = -2256875033871888322L;
        gm.dhmd[114] = -5756758689448564733L;
        gm.dhmd[115] = 8694771542390264134L;
        gm.dhmd[116] = 8064562642274873552L;
        gm.dhmd[117] = -3605251881641886841L;
        gm.dhmd[118] = -7315581344276821918L;
        gm.dhmd[119] = -8959866173087828823L;
        gm.dhmd[120] = -3129367660326532014L;
        gm.dhmd[121] = -6041516106375005186L;
        gm.dhmd[122] = -1733877208152826986L;
        gm.dhmd[123] = 3660690566802570706L;
        gm.dhmd[124] = 509007737290922763L;
        gm.dhmd[125] = 5325154766559736816L;
        gm.dhmd[126] = 6518900226037978661L;
        gm.dhmd[127] = 226127664843453010L;
        gm.dhmd[128] = 6351607359411323564L;
        gm.dhmd[129] = 2622501349045460995L;
        gm.dhmd[130] = -1891398909817377576L;
        gm.dhmd[131] = 4352863841090504872L;
        gm.dhmd[132] = 250890541892784958L;
        gm.dhmd[133] = 7223968198218917916L;
        gm.dhmd[134] = 1878279352764045063L;
        gm.dhmd[135] = 3894326567083494351L;
        gm.dhmd[136] = 142086540170678686L;
        gm.dhmd[137] = 8948592082070406885L;
        gm.dhmd[138] = 7388782123275119694L;
        gm.dhmd[139] = -7361528991393971598L;
        gm.dhmd[140] = -3713074151547999571L;
        gm.dhmd[141] = 4661306726425660146L;
        gm.dhmd[142] = 366011793420887009L;
        gm.dhmd[143] = -4392342038994069443L;
        gm.dhmd[144] = -2689399971578586174L;
        gm.dhmd[145] = -6502711031354045316L;
        gm.dhmd[146] = 8414583881669796552L;
        gm.dhmd[147] = -7995550547242381098L;
        gm.dhmd[148] = 874541118229009975L;
        gm.dhmd[149] = 3438510745029260501L;
        gm.dhmd[150] = 3237288433161647163L;
        gm.dhmd[151] = 5892903724674690778L;
        gm.dhmd[152] = 7242074299474994563L;
        gm.dhmd[153] = -3088952961735940923L;
        gm.dhmd[154] = -6365273370007115035L;
        gm.dhmd[155] = 8175970689643009617L;
        gm.dhmd[156] = 8643939655333617735L;
        gm.dhmd[157] = 589289571036646728L;
        gm.dhmd[158] = -5658573042373446516L;
        gm.dhmd[159] = 3787877312431403688L;
        gm.dhmd[160] = 9100987470788302521L;
        gm.dhmd[161] = 5862922218637282510L;
        gm.dhmd[162] = -1105738360203112471L;
        gm.dhmd[163] = -4423767422511497839L;
        gm.dhmd[164] = 359485383926508884L;
        gm.dhmd[165] = 7487789100967330050L;
        gm.dhmd[166] = -8035118873660252881L;
        gm.dhmd[167] = 2720849499310667709L;
        gm.dhmd[168] = -2924609714905814861L;
        gm.dhmd[169] = 5968411015410753094L;
        gm.dhmd[170] = -3409234266527887953L;
        gm.dhmd[171] = 6122328708239268251L;
        gm.dhmd[172] = -6568568592317069934L;
        gm.dhmd[173] = 5319299434019794274L;
        gm.dhmd[174] = 4394991992979459251L;
        gm.dhmd[175] = 628205522744990010L;
        gm.dhmd[176] = -8776540955123164836L;
        gm.dhmd[177] = -5685355197775793346L;
        gm.dhmd[178] = -3188579265716240205L;
        gm.dhmd[179] = 4743514725389653913L;
        gm.dhmd[180] = -8774618297255735880L;
        gm.dhmd[181] = 284260336224036486L;
        gm.dhmd[182] = 4622567037495109514L;
        gm.dhmd[183] = -8503502621079428215L;
        gm.dhmd[184] = 9073672998168098742L;
        gm.dhmd[185] = -3637925748114755032L;
        gm.dhmd[186] = -6312216387341592872L;
        gm.dhmd[187] = -1643582260349358627L;
        gm.dhmd[188] = 3714489902323429311L;
        gm.dhmd[189] = 9075474115043600973L;
        gm.dhmd[190] = 5649544053641449242L;
        gm.dhmd[191] = 8857391273021009996L;
        gm.dhmd[192] = -5640603480902847263L;
        gm.dhmd[193] = -8568857633506784807L;
        gm.dhmd[194] = 7354418692190685912L;
        gm.dhmd[195] = -932178828623986509L;
        gm.dhmd[196] = 7307250029216642824L;
        gm.dhmd[197] = -9122234066783847485L;
        gm.dhmd[198] = 5270112202527566429L;
        gm.dhmd[199] = 592731326322561187L;
    }

    private static /* synthetic */ int dhlg(int n2) {
        return dhkx[n2] ^ dhla[n2];
    }

    static {
        dhkx = new int[494];
        dhla = new int[494];
        gm.diys();
        gm.dizd();
        gm.dizv();
        gm.djag();
        gm.djas();
        gm.djbm();
        gm.djbv();
        gm.djcn();
        gm.djdb();
        gm.djdn();
        dhmd = new long[296];
        dhmk = new long[296];
        gm.djef();
        gm.djet();
        gm.djfl();
        gm.djge();
        gm.djgu();
        gm.djhf();
    }

    private static /* synthetic */ void dizv() {
        gm.dhkx[200] = 1082923527;
        gm.dhkx[201] = -1444954721;
        gm.dhkx[202] = -1295755470;
        gm.dhkx[203] = -1267571707;
        gm.dhkx[204] = -397683215;
        gm.dhkx[205] = 2105334838;
        gm.dhkx[206] = 958998903;
        gm.dhkx[207] = 1187608357;
        gm.dhkx[208] = -777810257;
        gm.dhkx[209] = 550582507;
        gm.dhkx[210] = 1074645340;
        gm.dhkx[211] = 1452229083;
        gm.dhkx[212] = -1459007026;
        gm.dhkx[213] = 1381000543;
        gm.dhkx[214] = -232234586;
        gm.dhkx[215] = 2048380357;
        gm.dhkx[216] = -1122982497;
        gm.dhkx[217] = 758913;
        gm.dhkx[218] = -944602567;
        gm.dhkx[219] = 503792490;
        gm.dhkx[220] = -1399306036;
        gm.dhkx[221] = 1245601901;
        gm.dhkx[222] = -1808519029;
        gm.dhkx[223] = 507312552;
        gm.dhkx[224] = -1119433682;
        gm.dhkx[225] = -204426357;
        gm.dhkx[226] = 1762510013;
        gm.dhkx[227] = 1674163454;
        gm.dhkx[228] = 1612985411;
        gm.dhkx[229] = 1817313062;
        gm.dhkx[230] = -1134829524;
        gm.dhkx[231] = 176937834;
        gm.dhkx[232] = 1011752091;
        gm.dhkx[233] = -1869603265;
        gm.dhkx[234] = 1370626048;
        gm.dhkx[235] = -646668149;
        gm.dhkx[236] = -1784214193;
        gm.dhkx[237] = 70159055;
        gm.dhkx[238] = -455203883;
        gm.dhkx[239] = 1462070749;
        gm.dhkx[240] = -1774651435;
        gm.dhkx[241] = -1245132131;
        gm.dhkx[242] = -951503352;
        gm.dhkx[243] = 1735092386;
        gm.dhkx[244] = 2086904121;
        gm.dhkx[245] = -772731182;
        gm.dhkx[246] = 1993863780;
        gm.dhkx[247] = 95164676;
        gm.dhkx[248] = 644773820;
        gm.dhkx[249] = -712348536;
        gm.dhkx[250] = -251020559;
        gm.dhkx[251] = -625688749;
        gm.dhkx[252] = 1911896356;
        gm.dhkx[253] = 124003449;
        gm.dhkx[254] = 1690547102;
        gm.dhkx[255] = -409121393;
        gm.dhkx[256] = -7108474;
        gm.dhkx[257] = 2080795303;
        gm.dhkx[258] = 1469872019;
        gm.dhkx[259] = 1349782364;
        gm.dhkx[260] = 1977607154;
        gm.dhkx[261] = 237089563;
        gm.dhkx[262] = 899352663;
        gm.dhkx[263] = 2062641855;
        gm.dhkx[264] = 1620431044;
        gm.dhkx[265] = -1797164879;
        gm.dhkx[266] = -50502012;
        gm.dhkx[267] = 2042741426;
        gm.dhkx[268] = 1878788800;
        gm.dhkx[269] = 1412383830;
        gm.dhkx[270] = 1870224145;
        gm.dhkx[271] = 882411187;
        gm.dhkx[272] = 1735328540;
        gm.dhkx[273] = 349560839;
        gm.dhkx[274] = -297624038;
        gm.dhkx[275] = 2068352036;
        gm.dhkx[276] = -1565307339;
        gm.dhkx[277] = -1049047495;
        gm.dhkx[278] = 1637644180;
        gm.dhkx[279] = 1488251878;
        gm.dhkx[280] = 587117803;
        gm.dhkx[281] = 78070618;
        gm.dhkx[282] = -2058895225;
        gm.dhkx[283] = 380264151;
        gm.dhkx[284] = 848762741;
        gm.dhkx[285] = -902614989;
        gm.dhkx[286] = -840173996;
        gm.dhkx[287] = -208312740;
        gm.dhkx[288] = 1211391607;
        gm.dhkx[289] = -135655503;
        gm.dhkx[290] = -1303292569;
        gm.dhkx[291] = -969115760;
        gm.dhkx[292] = -1579079959;
        gm.dhkx[293] = 757906923;
        gm.dhkx[294] = 640495652;
        gm.dhkx[295] = 1972522962;
        gm.dhkx[296] = -84585263;
        gm.dhkx[297] = -2027196680;
        gm.dhkx[298] = -1834945649;
        gm.dhkx[299] = -2069791148;
    }

    private static /* synthetic */ void diys() {
        gm.dhkx[0] = -624910015;
        gm.dhkx[1] = 1717202045;
        gm.dhkx[2] = -1535273575;
        gm.dhkx[3] = -719152104;
        gm.dhkx[4] = 1752411195;
        gm.dhkx[5] = 320906237;
        gm.dhkx[6] = 578212064;
        gm.dhkx[7] = 2076191512;
        gm.dhkx[8] = -1746402814;
        gm.dhkx[9] = 1149192676;
        gm.dhkx[10] = -1810763686;
        gm.dhkx[11] = 188119269;
        gm.dhkx[12] = -1339842072;
        gm.dhkx[13] = -2070032750;
        gm.dhkx[14] = 177593969;
        gm.dhkx[15] = 1241700066;
        gm.dhkx[16] = 1867424845;
        gm.dhkx[17] = -313691434;
        gm.dhkx[18] = -256326149;
        gm.dhkx[19] = 2106692252;
        gm.dhkx[20] = -2122824096;
        gm.dhkx[21] = 1853656140;
        gm.dhkx[22] = -1210214075;
        gm.dhkx[23] = 1709155348;
        gm.dhkx[24] = 1864182792;
        gm.dhkx[25] = -139104228;
        gm.dhkx[26] = -574450088;
        gm.dhkx[27] = -1501962318;
        gm.dhkx[28] = -811502060;
        gm.dhkx[29] = 1978933162;
        gm.dhkx[30] = -215027338;
        gm.dhkx[31] = 145931795;
        gm.dhkx[32] = 1189484914;
        gm.dhkx[33] = -716993676;
        gm.dhkx[34] = -526236375;
        gm.dhkx[35] = -1974767589;
        gm.dhkx[36] = 385446075;
        gm.dhkx[37] = -585034977;
        gm.dhkx[38] = 97183138;
        gm.dhkx[39] = 2124016284;
        gm.dhkx[40] = 1090959688;
        gm.dhkx[41] = -2079818238;
        gm.dhkx[42] = 53945392;
        gm.dhkx[43] = -688737201;
        gm.dhkx[44] = 1485809281;
        gm.dhkx[45] = -1157449924;
        gm.dhkx[46] = -1556436952;
        gm.dhkx[47] = 284601317;
        gm.dhkx[48] = 1899498624;
        gm.dhkx[49] = -1565056813;
        gm.dhkx[50] = 1064684481;
        gm.dhkx[51] = -153149788;
        gm.dhkx[52] = -626675047;
        gm.dhkx[53] = 1501616742;
        gm.dhkx[54] = 448953000;
        gm.dhkx[55] = -640563777;
        gm.dhkx[56] = -241262998;
        gm.dhkx[57] = -1843009717;
        gm.dhkx[58] = -1955383510;
        gm.dhkx[59] = 1029315325;
        gm.dhkx[60] = 765429704;
        gm.dhkx[61] = -1825873687;
        gm.dhkx[62] = 699467085;
        gm.dhkx[63] = -1681337864;
        gm.dhkx[64] = -606614821;
        gm.dhkx[65] = 757396373;
        gm.dhkx[66] = -297014107;
        gm.dhkx[67] = -135916030;
        gm.dhkx[68] = -1981805571;
        gm.dhkx[69] = 1949536700;
        gm.dhkx[70] = 780692453;
        gm.dhkx[71] = 1789487463;
        gm.dhkx[72] = -1092984228;
        gm.dhkx[73] = 172981319;
        gm.dhkx[74] = -582299197;
        gm.dhkx[75] = -1585675241;
        gm.dhkx[76] = 873384362;
        gm.dhkx[77] = 1354888762;
        gm.dhkx[78] = 1023110591;
        gm.dhkx[79] = -711101797;
        gm.dhkx[80] = -1267329584;
        gm.dhkx[81] = -1339249185;
        gm.dhkx[82] = 1382901320;
        gm.dhkx[83] = -1132611068;
        gm.dhkx[84] = 473767902;
        gm.dhkx[85] = 1340009378;
        gm.dhkx[86] = 524724740;
        gm.dhkx[87] = -2088440663;
        gm.dhkx[88] = 1145150152;
        gm.dhkx[89] = 1319706405;
        gm.dhkx[90] = 1303277356;
        gm.dhkx[91] = -1904299233;
        gm.dhkx[92] = 1697639808;
        gm.dhkx[93] = -1679399076;
        gm.dhkx[94] = 206281617;
        gm.dhkx[95] = -819887772;
        gm.dhkx[96] = 581844290;
        gm.dhkx[97] = 1853969304;
        gm.dhkx[98] = 1976038625;
        gm.dhkx[99] = 1463438117;
    }

    private static /* synthetic */ void djef() {
        gm.dhmd[0] = -7098327363364706063L;
        gm.dhmd[1] = 7206274491280861370L;
        gm.dhmd[2] = 5845817105412938764L;
        gm.dhmd[3] = -3634895682890222053L;
        gm.dhmd[4] = 1546455431484058839L;
        gm.dhmd[5] = 2641104703555409519L;
        gm.dhmd[6] = -621529490533503160L;
        gm.dhmd[7] = -6632278590977263063L;
        gm.dhmd[8] = -2753822309415739452L;
        gm.dhmd[9] = -3058227079291609243L;
        gm.dhmd[10] = -2962717339267023665L;
        gm.dhmd[11] = 8332063773353361721L;
        gm.dhmd[12] = 609348171795847130L;
        gm.dhmd[13] = -5811517497414199284L;
        gm.dhmd[14] = -7551629723466963005L;
        gm.dhmd[15] = 4258219274773788266L;
        gm.dhmd[16] = 8961186609515713935L;
        gm.dhmd[17] = 3592280310933418278L;
        gm.dhmd[18] = -3615191290507522980L;
        gm.dhmd[19] = -5563388629882101042L;
        gm.dhmd[20] = -7185402219379459927L;
        gm.dhmd[21] = 6349044839325955399L;
        gm.dhmd[22] = -5919444190978531142L;
        gm.dhmd[23] = 1274202260641996553L;
        gm.dhmd[24] = -1174093339740301248L;
        gm.dhmd[25] = 1719534090135362398L;
        gm.dhmd[26] = 3981708434789923226L;
        gm.dhmd[27] = -8618813571063958003L;
        gm.dhmd[28] = -6932804991042634958L;
        gm.dhmd[29] = 1654403702324328128L;
        gm.dhmd[30] = -542060571236239391L;
        gm.dhmd[31] = -8417801768718480672L;
        gm.dhmd[32] = -123639466536644587L;
        gm.dhmd[33] = -7604671069178869720L;
        gm.dhmd[34] = 8525953066197688496L;
        gm.dhmd[35] = -6361170912697912352L;
        gm.dhmd[36] = 3319735260638879941L;
        gm.dhmd[37] = -5938114912021837920L;
        gm.dhmd[38] = 8616642550479658066L;
        gm.dhmd[39] = 182283238217960696L;
        gm.dhmd[40] = -8386079227748698017L;
        gm.dhmd[41] = 2551513675013585822L;
        gm.dhmd[42] = -7757128605029969747L;
        gm.dhmd[43] = -8605971452984862642L;
        gm.dhmd[44] = 2653233338590723720L;
        gm.dhmd[45] = -8051286419352971500L;
        gm.dhmd[46] = -9062302657776617105L;
        gm.dhmd[47] = -8365888925131994454L;
        gm.dhmd[48] = -1522509641780446027L;
        gm.dhmd[49] = -2830428569274667911L;
        gm.dhmd[50] = -3107654494119771729L;
        gm.dhmd[51] = 1395688445791030864L;
        gm.dhmd[52] = 589082760075446206L;
        gm.dhmd[53] = 8825220766996506984L;
        gm.dhmd[54] = 3051072986038689792L;
        gm.dhmd[55] = -7651667499700322299L;
        gm.dhmd[56] = -9213221598625148441L;
        gm.dhmd[57] = 4606304424475861068L;
        gm.dhmd[58] = -5268703559361265706L;
        gm.dhmd[59] = -5327124789612914479L;
        gm.dhmd[60] = -1052468841169175096L;
        gm.dhmd[61] = 545620942545638616L;
        gm.dhmd[62] = 8536424254085958670L;
        gm.dhmd[63] = -6486016989702416210L;
        gm.dhmd[64] = -3284618407401402474L;
        gm.dhmd[65] = 1943899329511239783L;
        gm.dhmd[66] = -2297555263857569763L;
        gm.dhmd[67] = 1029466142395034594L;
        gm.dhmd[68] = 7105261575841815083L;
        gm.dhmd[69] = -3488627535217466137L;
        gm.dhmd[70] = -1288959502045475281L;
        gm.dhmd[71] = -5714234725677096448L;
        gm.dhmd[72] = 1204159469053466296L;
        gm.dhmd[73] = -5285534190869316411L;
        gm.dhmd[74] = 5763765996406509749L;
        gm.dhmd[75] = -5588162006316024228L;
        gm.dhmd[76] = 4070846866912951276L;
        gm.dhmd[77] = -3751605449240261024L;
        gm.dhmd[78] = 7648094549412452809L;
        gm.dhmd[79] = -1515538046679162787L;
        gm.dhmd[80] = 969570770841923519L;
        gm.dhmd[81] = -799999894782285113L;
        gm.dhmd[82] = -6900993266263306737L;
        gm.dhmd[83] = 936640372979206483L;
        gm.dhmd[84] = 3070552725190530786L;
        gm.dhmd[85] = -5218508543194906340L;
        gm.dhmd[86] = -7043502483118685218L;
        gm.dhmd[87] = -7890252373499866271L;
        gm.dhmd[88] = -1921474188501133681L;
        gm.dhmd[89] = -8296671920791937492L;
        gm.dhmd[90] = 2343449226459921880L;
        gm.dhmd[91] = 3605196304046866373L;
        gm.dhmd[92] = 872784041061376385L;
        gm.dhmd[93] = 3930690079756654097L;
        gm.dhmd[94] = -1643193136010274977L;
        gm.dhmd[95] = 3572486621039928399L;
        gm.dhmd[96] = 1043543543021201926L;
        gm.dhmd[97] = 574897220909945645L;
        gm.dhmd[98] = -560379221224105640L;
        gm.dhmd[99] = 3822021685414749106L;
    }

    private static /* synthetic */ void djbm() {
        gm.dhla[0] = -1686068927;
        gm.dhla[1] = 1717202044;
        gm.dhla[2] = -1535273587;
        gm.dhla[3] = 719152103;
        gm.dhla[4] = 1752411197;
        gm.dhla[5] = 320906233;
        gm.dhla[6] = 578212066;
        gm.dhla[7] = 2076191512;
        gm.dhla[8] = -1746402816;
        gm.dhla[9] = 1149192678;
        gm.dhla[10] = -1810763684;
        gm.dhla[11] = 188119269;
        gm.dhla[12] = -1339842070;
        gm.dhla[13] = -2070032751;
        gm.dhla[14] = 177593969;
        gm.dhla[15] = 1241700064;
        gm.dhla[16] = 1867424844;
        gm.dhla[17] = 1416972707;
        gm.dhla[18] = 256326148;
        gm.dhla[19] = -704283032;
        gm.dhla[20] = -2122824096;
        gm.dhla[21] = 1853656141;
        gm.dhla[22] = -339655947;
        gm.dhla[23] = -1709155349;
        gm.dhla[24] = -1682380911;
        gm.dhla[25] = -139104227;
        gm.dhla[26] = -574450088;
        gm.dhla[27] = -1501962315;
        gm.dhla[28] = -811502051;
        gm.dhla[29] = 1978933162;
        gm.dhla[30] = -215027331;
        gm.dhla[31] = 145931800;
        gm.dhla[32] = 1189484912;
        gm.dhla[33] = -716993679;
        gm.dhla[34] = -526236374;
        gm.dhla[35] = -1974767590;
        gm.dhla[36] = 385446064;
        gm.dhla[37] = -585034990;
        gm.dhla[38] = 97183151;
        gm.dhla[39] = 2124016285;
        gm.dhla[40] = 1090959693;
        gm.dhla[41] = -2079818237;
        gm.dhla[42] = 53945393;
        gm.dhla[43] = 2020997813;
        gm.dhla[44] = 1485809280;
        gm.dhla[45] = 596633187;
        gm.dhla[46] = -1556436952;
        gm.dhla[47] = 284601316;
        gm.dhla[48] = 849983242;
        gm.dhla[49] = -1565056813;
        gm.dhla[50] = 1064684483;
        gm.dhla[51] = -153149786;
        gm.dhla[52] = -626675046;
        gm.dhla[53] = 1501616741;
        gm.dhla[54] = 448953003;
        gm.dhla[55] = 640563776;
        gm.dhla[56] = 1389680656;
        gm.dhla[57] = -1843009718;
        gm.dhla[58] = -1955383509;
        gm.dhla[59] = -1586795122;
        gm.dhla[60] = 765429706;
        gm.dhla[61] = -1825873684;
        gm.dhla[62] = 699467086;
        gm.dhla[63] = -1681337864;
        gm.dhla[64] = -606614818;
        gm.dhla[65] = 757396368;
        gm.dhla[66] = 297014106;
        gm.dhla[67] = 1193842326;
        gm.dhla[68] = -1981805572;
        gm.dhla[69] = -247915153;
        gm.dhla[70] = 780692452;
        gm.dhla[71] = 1571897456;
        gm.dhla[72] = -1092984227;
        gm.dhla[73] = -178256201;
        gm.dhla[74] = -582299198;
        gm.dhla[75] = 406993128;
        gm.dhla[76] = -873384363;
        gm.dhla[77] = -290756213;
        gm.dhla[78] = 1023110590;
        gm.dhla[79] = 233288195;
        gm.dhla[80] = -1267329583;
        gm.dhla[81] = -1465680508;
        gm.dhla[82] = -1382901321;
        gm.dhla[83] = 459482035;
        gm.dhla[84] = 473767902;
        gm.dhla[85] = -1340009379;
        gm.dhla[86] = 1282556454;
        gm.dhla[87] = -2088440663;
        gm.dhla[88] = 1145150153;
        gm.dhla[89] = 1114917277;
        gm.dhla[90] = -1303277357;
        gm.dhla[91] = 2044812328;
        gm.dhla[92] = 1697639809;
        gm.dhla[93] = -1009541110;
        gm.dhla[94] = 206281602;
        gm.dhla[95] = -819887773;
        gm.dhla[96] = 581844314;
        gm.dhla[97] = 1853969291;
        gm.dhla[98] = 1976038644;
        gm.dhla[99] = 1463438121;
    }

    private static /* synthetic */ void dizd() {
        gm.dhkx[100] = -1924795997;
        gm.dhkx[101] = -1930433043;
        gm.dhkx[102] = -1380342946;
        gm.dhkx[103] = 635076892;
        gm.dhkx[104] = 874030349;
        gm.dhkx[105] = 1924863956;
        gm.dhkx[106] = -785916428;
        gm.dhkx[107] = 761249316;
        gm.dhkx[108] = 929265625;
        gm.dhkx[109] = -1161819462;
        gm.dhkx[110] = 877763517;
        gm.dhkx[111] = 2064153750;
        gm.dhkx[112] = 1027061436;
        gm.dhkx[113] = -1679460028;
        gm.dhkx[114] = 1014116339;
        gm.dhkx[115] = -1987175095;
        gm.dhkx[116] = 549077311;
        gm.dhkx[117] = -2011797641;
        gm.dhkx[118] = -1237133409;
        gm.dhkx[119] = 1475422153;
        gm.dhkx[120] = -1538366402;
        gm.dhkx[121] = 1376293815;
        gm.dhkx[122] = -913372106;
        gm.dhkx[123] = 1261611286;
        gm.dhkx[124] = 1336133241;
        gm.dhkx[125] = 317539796;
        gm.dhkx[126] = -252778442;
        gm.dhkx[127] = -1239376001;
        gm.dhkx[128] = -149033372;
        gm.dhkx[129] = -2116151965;
        gm.dhkx[130] = -279024016;
        gm.dhkx[131] = -448227023;
        gm.dhkx[132] = -1578027547;
        gm.dhkx[133] = 187926490;
        gm.dhkx[134] = -1247504770;
        gm.dhkx[135] = -227852866;
        gm.dhkx[136] = -1729165765;
        gm.dhkx[137] = 28000100;
        gm.dhkx[138] = 1299566493;
        gm.dhkx[139] = -720873222;
        gm.dhkx[140] = 1607739484;
        gm.dhkx[141] = -1389096745;
        gm.dhkx[142] = -2000492223;
        gm.dhkx[143] = -1842696431;
        gm.dhkx[144] = 1394941320;
        gm.dhkx[145] = 871958646;
        gm.dhkx[146] = -1422557202;
        gm.dhkx[147] = 2091628345;
        gm.dhkx[148] = -1216115667;
        gm.dhkx[149] = 881668469;
        gm.dhkx[150] = -2140062879;
        gm.dhkx[151] = 915729412;
        gm.dhkx[152] = 1017504765;
        gm.dhkx[153] = -1441691860;
        gm.dhkx[154] = -919447387;
        gm.dhkx[155] = 1414747277;
        gm.dhkx[156] = -1366804128;
        gm.dhkx[157] = -246124848;
        gm.dhkx[158] = -539196232;
        gm.dhkx[159] = -596562037;
        gm.dhkx[160] = 1273960616;
        gm.dhkx[161] = -1259856201;
        gm.dhkx[162] = -1754029250;
        gm.dhkx[163] = -498397324;
        gm.dhkx[164] = 837604631;
        gm.dhkx[165] = -1778512048;
        gm.dhkx[166] = -840871434;
        gm.dhkx[167] = 402434546;
        gm.dhkx[168] = -1055909891;
        gm.dhkx[169] = 2480759;
        gm.dhkx[170] = -1189224561;
        gm.dhkx[171] = 837050341;
        gm.dhkx[172] = 71852295;
        gm.dhkx[173] = -284152589;
        gm.dhkx[174] = 997885268;
        gm.dhkx[175] = -1903640107;
        gm.dhkx[176] = 1227125044;
        gm.dhkx[177] = 744271642;
        gm.dhkx[178] = -1328284573;
        gm.dhkx[179] = -526674801;
        gm.dhkx[180] = -623260453;
        gm.dhkx[181] = -1434188322;
        gm.dhkx[182] = 324123944;
        gm.dhkx[183] = -1165354749;
        gm.dhkx[184] = 482595108;
        gm.dhkx[185] = 2136822856;
        gm.dhkx[186] = -1412987857;
        gm.dhkx[187] = -71131476;
        gm.dhkx[188] = -1191442235;
        gm.dhkx[189] = -1630479019;
        gm.dhkx[190] = 890497156;
        gm.dhkx[191] = -1412194326;
        gm.dhkx[192] = -745227174;
        gm.dhkx[193] = -1153454917;
        gm.dhkx[194] = -198173354;
        gm.dhkx[195] = -1224151112;
        gm.dhkx[196] = -31856423;
        gm.dhkx[197] = -1488819511;
        gm.dhkx[198] = -1521340476;
        gm.dhkx[199] = -143672566;
    }

    private static /* synthetic */ void djge() {
        gm.dhmk[0] = -2264815887248028433L;
        gm.dhmk[1] = -9139902271380023494L;
        gm.dhmk[2] = -3485078991322659069L;
        gm.dhmk[3] = 968755043022895056L;
        gm.dhmk[4] = 1479010235624987032L;
        gm.dhmk[5] = -6669554299533497990L;
        gm.dhmk[6] = 5152137157023327877L;
        gm.dhmk[7] = 4385322752690055630L;
        gm.dhmk[8] = 3064720677344022124L;
        gm.dhmk[9] = -5880296969167164141L;
        gm.dhmk[10] = 9207055636161772771L;
        gm.dhmk[11] = -5584098103598595866L;
        gm.dhmk[12] = 4544444219800056588L;
        gm.dhmk[13] = -1268395296757816270L;
        gm.dhmk[14] = 5119168814182879203L;
        gm.dhmk[15] = 7344896358372402516L;
        gm.dhmk[16] = -5584532236463100068L;
        gm.dhmk[17] = 8420327380611932596L;
        gm.dhmk[18] = 2094568538648683754L;
        gm.dhmk[19] = 942647818618756838L;
        gm.dhmk[20] = 2645653677720313622L;
        gm.dhmk[21] = -7120165402114886200L;
        gm.dhmk[22] = -7712291092074277361L;
        gm.dhmk[23] = 1942981176871557092L;
        gm.dhmk[24] = -4659013979795626666L;
        gm.dhmk[25] = -3901583800095314956L;
        gm.dhmk[26] = 4025116955825858946L;
        gm.dhmk[27] = 6181177113497086099L;
        gm.dhmk[28] = 6483091398221609484L;
        gm.dhmk[29] = 5347011904108334059L;
        gm.dhmk[30] = -7527331071960299787L;
        gm.dhmk[31] = -1242979642718273900L;
        gm.dhmk[32] = -7029555735583622707L;
        gm.dhmk[33] = -6511133284726995317L;
        gm.dhmk[34] = 6113881884081228565L;
        gm.dhmk[35] = -3856630952693748859L;
        gm.dhmk[36] = -7562137833302754310L;
        gm.dhmk[37] = -2257652254957815719L;
        gm.dhmk[38] = -2446478973216061092L;
        gm.dhmk[39] = -1447659649377575966L;
        gm.dhmk[40] = 7912910164380155846L;
        gm.dhmk[41] = -470894348039633409L;
        gm.dhmk[42] = -7111968292848048176L;
        gm.dhmk[43] = -748572139566982035L;
        gm.dhmk[44] = -5244453065826987430L;
        gm.dhmk[45] = 8623341569732390070L;
        gm.dhmk[46] = -8068634003984482413L;
        gm.dhmk[47] = 6963270946691152313L;
        gm.dhmk[48] = -6064960759775271045L;
        gm.dhmk[49] = -2582734043758022665L;
        gm.dhmk[50] = -4178306345221430681L;
        gm.dhmk[51] = -2713084485906398453L;
        gm.dhmk[52] = 1897589402782962369L;
        gm.dhmk[53] = -8797653644113788231L;
        gm.dhmk[54] = 5785793699831422946L;
        gm.dhmk[55] = 5630556213205415868L;
        gm.dhmk[56] = -2448450972594560223L;
        gm.dhmk[57] = -5900191811965324859L;
        gm.dhmk[58] = -5133173245246222609L;
        gm.dhmk[59] = -6169731500315440275L;
        gm.dhmk[60] = 3977747552590596662L;
        gm.dhmk[61] = -1660314455388441657L;
        gm.dhmk[62] = -7273955951115050330L;
        gm.dhmk[63] = 8821173607735242088L;
        gm.dhmk[64] = -1273932178580713787L;
        gm.dhmk[65] = 7951373377259063490L;
        gm.dhmk[66] = 2314466289160938130L;
        gm.dhmk[67] = 6654166029321083877L;
        gm.dhmk[68] = -8427113849033550823L;
        gm.dhmk[69] = -7675533558162122273L;
        gm.dhmk[70] = 3055908792283489886L;
        gm.dhmk[71] = -8163303300071528625L;
        gm.dhmk[72] = 7630940844656804678L;
        gm.dhmk[73] = 5621590016742372029L;
        gm.dhmk[74] = -703703842187391428L;
        gm.dhmk[75] = 8316828708259209098L;
        gm.dhmk[76] = -4646230640758313238L;
        gm.dhmk[77] = 7832921231284666687L;
        gm.dhmk[78] = 4034490395448080348L;
        gm.dhmk[79] = 208723281060348133L;
        gm.dhmk[80] = -699822412782801368L;
        gm.dhmk[81] = -7345396125323082035L;
        gm.dhmk[82] = -2994641169393004256L;
        gm.dhmk[83] = 1936841482514483452L;
        gm.dhmk[84] = 8455353158531808239L;
        gm.dhmk[85] = 5181613217148535726L;
        gm.dhmk[86] = 2714844632692486269L;
        gm.dhmk[87] = -7122676758339187700L;
        gm.dhmk[88] = -6264182070383978038L;
        gm.dhmk[89] = -7300638858495555621L;
        gm.dhmk[90] = -7928452430399448042L;
        gm.dhmk[91] = -6333150617833121096L;
        gm.dhmk[92] = -6708049791861129048L;
        gm.dhmk[93] = -1810099078873409077L;
        gm.dhmk[94] = 3406224026466378521L;
        gm.dhmk[95] = 4452277029595308539L;
        gm.dhmk[96] = 5667353667740748399L;
        gm.dhmk[97] = -4905752838092332174L;
        gm.dhmk[98] = 6441836835664325644L;
        gm.dhmk[99] = -1985175697062151400L;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private void restoreSlot() {
        block132: {
            block133: {
                block131: {
                    block130: {
                        v0 /* !! */  = gm.hj;
                        if (true) ** GOTO lbl5
                        block70: while (true) {
                            v0 /* !! */  = (long)(v1 - gm.dhld("dips", dhmc(int ), (int)205));
lbl5:
                            // 2 sources

                            switch ((int)v0 /* !! */ ) {
                                case -2070793104: {
                                    v1 = gm.dhld("dipt", dhmc(int ), (int)206);
                                    continue block70;
                                }
                                case -1222978726: {
                                    v1 = gm.dhld("dipu", dhmc(int ), (int)207);
                                    continue block70;
                                }
                                case 989277410: {
                                    break block70;
                                }
                            }
                            break;
                        }
                        var3_1 = gm.c;
                        v2 /* !! */  = gm.hj;
                        block71: while (true) {
                            switch ((int)v2 /* !! */ ) {
                                case 989277410: {
                                    break block71;
                                }
                                case 1318155153: {
                                    v2 /* !! */  = (long)(gm.dhld("dipw", dhmc(int ), (int)209) - gm.dhld("dipv", dhmc(int ), (int)208));
                                    continue block71;
                                }
                            }
                            break;
                        }
                        var2_2 /* !! */  = gm.b;
                        v3 /* !! */  = gm.hj;
                        block72: while (true) {
                            switch ((int)v3 /* !! */ ) {
                                case -1825424922: {
                                    v3 /* !! */  = (long)(gm.dhld("dipy", dhmc(int ), (int)211) - gm.dhld("dipx", dhmc(int ), (int)210));
                                    continue block72;
                                }
                                case 989277410: {
                                    break block72;
                                }
                            }
                            break;
                        }
                        var1_3 = gm.a;
                        if (var3_1) {
                            throw null;
                        }
                        if (var1_3 || var1_3) return;
                        v4 /* !! */  = gm.hj;
                        if (true) ** GOTO lbl40
                        block73: while (true) {
                            v4 /* !! */  = (long)(v5 - gm.dhld("dipz", dhmc(int ), (int)212));
lbl40:
                            // 2 sources

                            switch ((int)v4 /* !! */ ) {
                                case -28246048: {
                                    v5 = gm.dhld("diqa", dhmc(int ), (int)213);
                                    continue block73;
                                }
                                case 989277410: {
                                    break block73;
                                }
                                case 1826432067: {
                                    v5 = gm.dhld("diqb", dhmc(int ), (int)214);
                                    continue block73;
                                }
                            }
                            break;
                        }
                        if (this.previousSlot < 0) break block130;
                        if (var1_3) return;
                        while (true) {
                            if ((v6 /* !! */  = (cfr_temp_1 = gm.hj - gm.dhld("diqc", dhmc(int ), (int)215)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                            if (v6 /* !! */  == gm.dhld("diqd", dhlg(int ), (int)391)) {
                                if (this.previousSlot <= gm.dhld("diqf", dhlg(int ), (int)393)) {
                                    break;
                                }
                                break block130;
                            }
                            v6 /* !! */  = (long)gm.dhld("diqe", dhlg(int ), (int)392);
                        }
                        if (var1_3) return;
                        v7 /* !! */  = gm.hj;
                        if (true) ** GOTO lbl64
                        block75: while (true) {
                            v7 /* !! */  = (long)(v8 - gm.dhld("diqg", dhmc(int ), (int)216));
lbl64:
                            // 2 sources

                            switch ((int)v7 /* !! */ ) {
                                case -615123257: {
                                    v8 = gm.dhld("diqh", dhmc(int ), (int)217);
                                    continue block75;
                                }
                                case 679285523: {
                                    v8 = gm.dhld("diqi", dhmc(int ), (int)218);
                                    continue block75;
                                }
                                case 989277410: {
                                    break block75;
                                }
                            }
                            break;
                        }
                        while (true) {
                            if ((v9 /* !! */  = (cfr_temp_2 = gm.hj - gm.dhld("diqj", dhmc(int ), (int)219)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                            if (v9 /* !! */  == gm.dhld("diqk", dhlg(int ), (int)394)) {
                                if (gm.mc.field_1724 != null) {
                                    break;
                                }
                                break block130;
                            }
                            v9 /* !! */  = (long)gm.dhld("diql", dhlg(int ), (int)395);
                        }
                        if (var1_3) return;
                        v10 /* !! */  = gm.hj;
                        if (true) ** GOTO lbl86
                        block77: while (true) {
                            v10 /* !! */  = (long)(v11 - gm.dhld("diqm", dhmc(int ), (int)220));
lbl86:
                            // 2 sources

                            switch ((int)v10 /* !! */ ) {
                                case -856458280: {
                                    v11 = gm.dhld("diqn", dhmc(int ), (int)221);
                                    continue block77;
                                }
                                case 436551722: {
                                    v11 = gm.dhld("diqo", dhmc(int ), (int)222);
                                    continue block77;
                                }
                                case 989277410: {
                                    break block77;
                                }
                            }
                            break;
                        }
                        while (true) {
                            if ((v12 /* !! */  = (cfr_temp_3 = gm.hj - gm.dhld("diqp", dhmc(int ), (int)223)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                            if (v12 /* !! */  == gm.dhld("diqq", dhlg(int ), (int)396)) {
                                if (gm.mc.method_1562() == null) {
                                    break;
                                }
                                break block131;
                            }
                            v12 /* !! */  = (long)gm.dhld("diqr", dhlg(int ), (int)397);
                        }
                        if (var1_3) return;
                    }
                    if (var1_3 || var1_3) return;
                    break block133;
                }
                if (var1_3 || var1_3) return;
                ** GOTO lbl223
            }
            v13 = gm.dhld("diqs", dhlg(int ), (int)398);
            while (true) {
                if ((v14 /* !! */  = (cfr_temp_4 = gm.hj - gm.dhld("diqt", dhmc(int ), (int)224)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                if (v14 /* !! */  == gm.dhld("diqu", dhlg(int ), (int)399)) {
                    this.previousSlot = (int)v13;
                    if (var1_3) return;
                    break;
                }
                v14 /* !! */  = (long)gm.dhld("diqv", dhlg(int ), (int)400);
            }
            if (var1_3) return;
            if (var2_2 /* !! */  == 0) return;
            cfr_temp_0 = -2147483648;
            while (true) {
                switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                    default: {
                        return;
                    }
                    case 0: {
                        var2_2 /* !! */  = (int)gm.dhld("disg", dhlg(int ), (int)418);
                        cfr_temp_0 = 15;
                        if (var3_1) {
                            throw null;
                        }
                        break block132;
                    }
                    case 3: {
                        var2_2 /* !! */  = (int)gm.dhld("disj", dhlg(int ), (int)421);
                        cfr_temp_0 = 2;
                        if (var3_1) {
                            throw null;
                        }
                        break block132;
                    }
                    case 5: {
                        var2_2 /* !! */  = (int)gm.dhld("disl", dhlg(int ), (int)423);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 6: {
                        var2_2 /* !! */  = (int)gm.dhld("dism", dhlg(int ), (int)424);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 2: {
                        var2_2 /* !! */  = (int)gm.dhld("disi", dhlg(int ), (int)420);
                        cfr_temp_0 = 7;
                        if (var3_1) {
                            throw null;
                        }
                        break block132;
                    }
                    case 9: {
                        var2_2 /* !! */  = (int)gm.dhld("disp", dhlg(int ), (int)427);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 1: {
                        var2_2 /* !! */  = (int)gm.dhld("dish", dhlg(int ), (int)419);
                        cfr_temp_0 = 19;
                        if (var3_1) {
                            throw null;
                        }
                        break block132;
                    }
                    case 10: {
                        var2_2 /* !! */  = (int)gm.dhld("disq", dhlg(int ), (int)428);
                        cfr_temp_0 = 4;
                        if (var3_1) {
                            throw null;
                        }
                        break block132;
                    }
                    case 11: {
                        var2_2 /* !! */  = (int)gm.dhld("disr", dhlg(int ), (int)429);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 4: {
                        var2_2 /* !! */  = (int)gm.dhld("disk", dhlg(int ), (int)422);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 8: {
                        var2_2 /* !! */  = (int)gm.dhld("diso", dhlg(int ), (int)426);
                        cfr_temp_0 = 15;
                        if (var3_1) {
                            throw null;
                        }
                        break block132;
                    }
                    case 12: {
                        var2_2 /* !! */  = (int)gm.dhld("diss", dhlg(int ), (int)430);
                        cfr_temp_0 = 19;
                        if (var3_1) {
                            throw null;
                        }
                        break block132;
                    }
                    case 14: {
                        var2_2 /* !! */  = (int)gm.dhld("disu", dhlg(int ), (int)432);
                        if (var3_1) {
                            throw null;
                        }
                        ** GOTO lbl-1000
                    }
                    case 15: {
                        var2_2 /* !! */  = (int)gm.dhld("disv", dhlg(int ), (int)433);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 13: {
                        var2_2 /* !! */  = (int)gm.dhld("dist", dhlg(int ), (int)431);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 18: {
                        var2_2 /* !! */  = (int)gm.dhld("disy", dhlg(int ), (int)436);
                        cfr_temp_0 = 17;
                        if (var3_1) {
                            throw null;
                        }
                        break block132;
                    }
                    case 19: {
                        var2_2 /* !! */  = (int)gm.dhld("disz", dhlg(int ), (int)437);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 16: {
                        ** GOTO lbl218
                    }
                    case 20: lbl-1000:
                    // 2 sources

                    {
                        var2_2 /* !! */  = (int)gm.dhld("dita", dhlg(int ), (int)438);
                        if (var3_1) {
                            throw null;
                        }
lbl218:
                        // 3 sources

                        var2_2 /* !! */  = (int)gm.dhld("disw", dhlg(int ), (int)434);
                        cfr_temp_0 = 17;
                        if (var3_1) {
                            throw null;
                        }
                        break block132;
                    }
lbl223:
                    // 1 sources

                    while (true) {
                        if ((v15 /* !! */  = (cfr_temp_5 = gm.hj - gm.dhld("diqw", dhmc(int ), (int)225)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                        if (v15 /* !! */  == gm.dhld("diqx", dhlg(int ), (int)401)) break;
                        v15 /* !! */  = (long)gm.dhld("diqy", dhlg(int ), (int)402);
                    }
                    v16 /* !! */  = gm.hj;
                    block82: while (true) {
                        switch ((int)v16 /* !! */ ) {
                            case -1205466889: {
                                v16 /* !! */  = (long)(gm.dhld("dira", dhmc(int ), (int)227) - gm.dhld("diqz", dhmc(int ), (int)226));
                                continue block82;
                            }
                            case 989277410: {
                                break block82;
                            }
                        }
                        break;
                    }
                    v17 = gm.mc.field_1724;
                    v18 /* !! */  = gm.hj;
                    if (true) ** GOTO lbl241
                    block83: while (true) {
                        v18 /* !! */  = (long)(v19 - gm.dhld("dirb", dhmc(int ), (int)228));
lbl241:
                        // 2 sources

                        switch ((int)v18 /* !! */ ) {
                            case 406871217: {
                                v19 = gm.dhld("dirc", dhmc(int ), (int)229);
                                continue block83;
                            }
                            case 666821228: {
                                v19 = gm.dhld("dird", dhmc(int ), (int)230);
                                continue block83;
                            }
                            case 989277410: {
                                break block83;
                            }
                        }
                        break;
                    }
                    v20 = v17.method_31548();
                    v21 /* !! */  = gm.hj;
                    block84: while (true) {
                        switch ((int)v21 /* !! */ ) {
                            case -1736800366: {
                                v21 /* !! */  = (long)(gm.dhld("dirf", dhmc(int ), (int)232) - gm.dhld("dire", dhmc(int ), (int)231));
                                continue block84;
                            }
                            case 989277410: {
                                break block84;
                            }
                        }
                        break;
                    }
                    while (true) {
                        if ((v22 /* !! */  = (cfr_temp_6 = gm.hj - gm.dhld("dirg", dhmc(int ), (int)233)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                        if (v22 /* !! */  == gm.dhld("dirh", dhlg(int ), (int)403)) {
                            v20.method_61496(this.previousSlot);
                            if (var1_3) return;
                            break;
                        }
                        v22 /* !! */  = (long)gm.dhld("diri", dhlg(int ), (int)404);
                    }
                    if (var1_3) return;
                    while (true) {
                        if ((v23 /* !! */  = (cfr_temp_7 = gm.hj - gm.dhld("dirj", dhmc(int ), (int)234)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                        if (v23 /* !! */  == gm.dhld("dirk", dhlg(int ), (int)405)) break;
                        v23 /* !! */  = (long)gm.dhld("dirl", dhlg(int ), (int)406);
                    }
                    while (true) {
                        if ((v24 /* !! */  = (cfr_temp_8 = gm.hj - gm.dhld("dirm", dhmc(int ), (int)235)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                        if (v24 /* !! */  == gm.dhld("dirn", dhlg(int ), (int)407)) break;
                        v24 /* !! */  = (long)gm.dhld("diro", dhlg(int ), (int)408);
                    }
                    v25 = gm.mc.method_1562();
                    while (true) {
                        if ((v26 /* !! */  = (cfr_temp_9 = gm.hj - gm.dhld("dirp", dhmc(int ), (int)236)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                        if (v26 /* !! */  == gm.dhld("dirq", dhlg(int ), (int)409)) break;
                        v26 /* !! */  = (long)gm.dhld("dirr", dhlg(int ), (int)410);
                    }
                    while (true) {
                        if ((v27 /* !! */  = (cfr_temp_10 = gm.hj - gm.dhld("dirs", dhmc(int ), (int)237)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
                        if (v27 /* !! */  == gm.dhld("dirt", dhlg(int ), (int)411)) break;
                        v27 /* !! */  = (long)gm.dhld("diru", dhlg(int ), (int)412);
                    }
                    while (true) {
                        if ((v28 /* !! */  = (cfr_temp_11 = gm.hj - gm.dhld("dirv", dhmc(int ), (int)238)) == 0L ? 0 : (cfr_temp_11 < 0L ? -1 : 1)) == false) continue;
                        if (v28 /* !! */  == gm.dhld("dirw", dhlg(int ), (int)413)) break;
                        v28 /* !! */  = (long)gm.dhld("dirx", dhlg(int ), (int)414);
                    }
                    v29 = new class_2868(this.previousSlot);
                    while (true) {
                        if ((v30 /* !! */  = (cfr_temp_12 = gm.hj - gm.dhld("diry", dhmc(int ), (int)239)) == 0L ? 0 : (cfr_temp_12 < 0L ? -1 : 1)) == false) continue;
                        if (v30 /* !! */  == gm.dhld("dirz", dhlg(int ), (int)415)) {
                            v25.method_52787((class_2596)v29);
                            if (var1_3) return;
                            break;
                        }
                        v30 /* !! */  = (long)gm.dhld("disa", dhlg(int ), (int)416);
                    }
                    if (var1_3) return;
                    v31 = gm.dhld("disb", dhlg(int ), (int)417);
                    v32 /* !! */  = gm.hj;
                    if (true) ** GOTO lbl309
                    block92: while (true) {
                        v32 /* !! */  = (long)(v33 - gm.dhld("disc", dhmc(int ), (int)240));
lbl309:
                        // 2 sources

                        switch ((int)v32 /* !! */ ) {
                            case -1695242849: {
                                v33 = gm.dhld("disd", dhmc(int ), (int)241);
                                continue block92;
                            }
                            case 989277410: {
                                break block92;
                            }
                            case 1098740858: {
                                v33 = gm.dhld("dise", dhmc(int ), (int)242);
                                continue block92;
                            }
                            case 1931769936: {
                                v33 = gm.dhld("disf", dhmc(int ), (int)243);
                                continue block92;
                            }
                        }
                        break;
                    }
                    this.previousSlot = (int)v31;
                    if (!var1_3 && !var1_3) return;
                    return;
                    case 7: {
                        var2_2 /* !! */  = (int)gm.dhld("disn", dhlg(int ), (int)425);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 17: 
                }
                break;
            }
            ** GOTO lbl333
        }
        do {
            if (true) ** continue;
lbl333:
            // 2 sources

            var2_2 /* !! */  = (int)gm.dhld("disx", dhlg(int ), (int)435);
            cfr_temp_0 = 7;
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ void djbv() {
        gm.dhla[100] = -1924795996;
        gm.dhla[101] = -1930433053;
        gm.dhla[102] = -1380342946;
        gm.dhla[103] = 635076876;
        gm.dhla[104] = 874030360;
        gm.dhla[105] = 1924863964;
        gm.dhla[106] = -785916430;
        gm.dhla[107] = 761249320;
        gm.dhla[108] = 929265624;
        gm.dhla[109] = -1161819467;
        gm.dhla[110] = 877763517;
        gm.dhla[111] = 2064153754;
        gm.dhla[112] = 1027061408;
        gm.dhla[113] = -1679460023;
        gm.dhla[114] = 1014116344;
        gm.dhla[115] = -1987175102;
        gm.dhla[116] = 549077308;
        gm.dhla[117] = -2011797647;
        gm.dhla[118] = -1237133410;
        gm.dhla[119] = 1475422153;
        gm.dhla[120] = -1538366407;
        gm.dhla[121] = 1376293797;
        gm.dhla[122] = -913372098;
        gm.dhla[123] = -1261611287;
        gm.dhla[124] = -113594351;
        gm.dhla[125] = 317539797;
        gm.dhla[126] = -252778441;
        gm.dhla[127] = 1763592097;
        gm.dhla[128] = -149033371;
        gm.dhla[129] = -858188228;
        gm.dhla[130] = 279024015;
        gm.dhla[131] = 1077429994;
        gm.dhla[132] = -1578027548;
        gm.dhla[133] = 1645937025;
        gm.dhla[134] = -1247504769;
        gm.dhla[135] = -1960787979;
        gm.dhla[136] = -1729165766;
        gm.dhla[137] = 29820054;
        gm.dhla[138] = 1299566492;
        gm.dhla[139] = 877012694;
        gm.dhla[140] = 1607739464;
        gm.dhla[141] = -1389096746;
        gm.dhla[142] = 798034008;
        gm.dhla[143] = -1842696432;
        gm.dhla[144] = 1394941320;
        gm.dhla[145] = 871958645;
        gm.dhla[146] = -1422557203;
        gm.dhla[147] = 2091628338;
        gm.dhla[148] = -1216115673;
        gm.dhla[149] = 881668476;
        gm.dhla[150] = -2140062870;
        gm.dhla[151] = 915729421;
        gm.dhla[152] = 1017504762;
        gm.dhla[153] = -1441691862;
        gm.dhla[154] = -919447387;
        gm.dhla[155] = 1414747274;
        gm.dhla[156] = -1366804126;
        gm.dhla[157] = -246124847;
        gm.dhla[158] = -539196231;
        gm.dhla[159] = -596562037;
        gm.dhla[160] = 1273960617;
        gm.dhla[161] = -1259856198;
        gm.dhla[162] = -1754029285;
        gm.dhla[163] = -498397321;
        gm.dhla[164] = 837604657;
        gm.dhla[165] = -1778512059;
        gm.dhla[166] = -840871445;
        gm.dhla[167] = 402434550;
        gm.dhla[168] = -1055909904;
        gm.dhla[169] = 2480725;
        gm.dhla[170] = -1189224564;
        gm.dhla[171] = 837050361;
        gm.dhla[172] = 71852315;
        gm.dhla[173] = -284152598;
        gm.dhla[174] = 997885302;
        gm.dhla[175] = -1903640068;
        gm.dhla[176] = 1227125025;
        gm.dhla[177] = 744271630;
        gm.dhla[178] = -1328284598;
        gm.dhla[179] = -526674801;
        gm.dhla[180] = -623260454;
        gm.dhla[181] = -1434188299;
        gm.dhla[182] = 324123942;
        gm.dhla[183] = -1165354735;
        gm.dhla[184] = 482595072;
        gm.dhla[185] = 2136822879;
        gm.dhla[186] = -1412987846;
        gm.dhla[187] = -71131457;
        gm.dhla[188] = -1191442211;
        gm.dhla[189] = -1630479039;
        gm.dhla[190] = 890497179;
        gm.dhla[191] = -1412194324;
        gm.dhla[192] = -745227194;
        gm.dhla[193] = -1153454941;
        gm.dhla[194] = -198173353;
        gm.dhla[195] = -1224151151;
        gm.dhla[196] = -31856441;
        gm.dhla[197] = -1488819509;
        gm.dhla[198] = -1521340472;
        gm.dhla[199] = -143672568;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void addChoice(List<gm$FoodChoice> var1_1, class_1268 var2_2, int var3_3, class_1799 var4_4, int var5_5, float var6_6) {
        block129: {
            v0 /* !! */  = gm.hj;
            if (true) ** GOTO lbl5
            block83: while (true) {
                v0 /* !! */  = (long)(gm.dhld("dijr", dhmc(int ), (int)131) - gm.dhld("dijq", dhmc(int ), (int)130));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -1762195726: {
                        continue block83;
                    }
                    case 989277410: {
                        break block83;
                    }
                }
                break;
            }
            var13_7 = gm.c;
            v1 /* !! */  = gm.hj;
            if (true) ** GOTO lbl15
            block84: while (true) {
                v1 /* !! */  = (long)(v2 - gm.dhld("dijs", dhmc(int ), (int)132));
lbl15:
                // 2 sources

                switch ((int)v1 /* !! */ ) {
                    case -1929812556: {
                        v2 = gm.dhld("dijt", dhmc(int ), (int)133);
                        continue block84;
                    }
                    case -239199184: {
                        v2 = gm.dhld("diju", dhmc(int ), (int)134);
                        continue block84;
                    }
                    case 989277410: {
                        break block84;
                    }
                    case 1306062918: {
                        v2 = gm.dhld("dijv", dhmc(int ), (int)135);
                        continue block84;
                    }
                }
                break;
            }
            var12_8 /* !! */  = gm.b;
            while (true) {
                if ((v3 /* !! */  = (cfr_temp_0 = gm.hj - gm.dhld("dijw", dhmc(int ), (int)136)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v3 /* !! */  == gm.dhld("dijx", dhlg(int ), (int)308)) break;
                v3 /* !! */  = (long)gm.dhld("dijy", dhlg(int ), (int)309);
            }
            var11_9 = gm.a;
            if (var13_7) {
                throw null;
lbl37:
                // 13 sources

                return;
            }
            if (var11_9 || var11_9) ** GOTO lbl37
            while (true) {
                if ((v4 /* !! */  = (cfr_temp_1 = gm.hj - gm.dhld("dijz", dhmc(int ), (int)137)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v4 /* !! */  == gm.dhld("dika", dhlg(int ), (int)310)) break;
                v4 /* !! */  = (long)gm.dhld("dikb", dhlg(int ), (int)311);
            }
            if (this.isSafeFood(var4_4)) break block129;
            if (var11_9 || var11_9) ** GOTO lbl37
            return;
        }
        if (var11_9 || var11_9) ** GOTO lbl37
        v5 /* !! */  = gm.hj;
        if (true) ** GOTO lbl55
        block88: while (true) {
            v5 /* !! */  = (long)(gm.dhld("dikd", dhmc(int ), (int)139) - gm.dhld("dikc", dhmc(int ), (int)138));
lbl55:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case 55729962: {
                    continue block88;
                }
                case 989277410: {
                    break block88;
                }
            }
            break;
        }
        v6 /* !! */  = gm.hj;
        if (true) ** GOTO lbl64
        block89: while (true) {
            v6 /* !! */  = (long)(gm.dhld("dikf", dhmc(int ), (int)141) - gm.dhld("dike", dhmc(int ), (int)140));
lbl64:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case 977795935: {
                    continue block89;
                }
                case 989277410: {
                    break block89;
                }
            }
            break;
        }
        var7_10 = (class_4174)var4_4.method_58694(class_9334.field_50075);
        if (var11_9 || var11_9) ** GOTO lbl37
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_2 = gm.hj - gm.dhld("dikg", dhmc(int ), (int)142)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v7 /* !! */  == gm.dhld("dikh", dhlg(int ), (int)312)) break;
            v7 /* !! */  = (long)gm.dhld("diki", dhlg(int ), (int)313);
        }
        while (true) {
            if ((v8 /* !! */  = (cfr_temp_3 = gm.hj - gm.dhld("dikj", dhmc(int ), (int)143)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v8 /* !! */  == gm.dhld("dikk", dhlg(int ), (int)314)) break;
            v8 /* !! */  = (long)gm.dhld("dikl", dhlg(int ), (int)315);
        }
        var8_11 = (class_10124)var4_4.method_58694(class_9334.field_53964);
        if (var11_9 || var11_9) ** GOTO lbl37
        if (var7_10 == null) ** GOTO lbl-1000
        if (var11_9) ** GOTO lbl37
        if (var8_11 == null) ** GOTO lbl-1000
        if (var11_9) ** GOTO lbl37
        while (true) {
            if ((v9 /* !! */  = (cfr_temp_4 = gm.hj - gm.dhld("dikm", dhmc(int ), (int)144)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v9 /* !! */  == gm.dhld("dikn", dhlg(int ), (int)316)) break;
            v9 /* !! */  = (long)gm.dhld("diko", dhlg(int ), (int)317);
        }
        v10 /* !! */  = gm.hj;
        if (true) ** GOTO lbl99
        block93: while (true) {
            v10 /* !! */  = (long)(v11 - gm.dhld("dikp", dhmc(int ), (int)145));
lbl99:
            // 2 sources

            switch ((int)v10 /* !! */ ) {
                case 56135924: {
                    v11 = gm.dhld("dikq", dhmc(int ), (int)146);
                    continue block93;
                }
                case 989277410: {
                    break block93;
                }
                case 1674679769: {
                    v11 = gm.dhld("dikr", dhmc(int ), (int)147);
                    continue block93;
                }
                case 1794965947: {
                    v11 = gm.dhld("diks", dhmc(int ), (int)148);
                    continue block93;
                }
            }
            break;
        }
        v12 = gm.mc.field_1724;
        v13 /* !! */  = gm.hj;
        if (true) ** GOTO lbl116
        block94: while (true) {
            v13 /* !! */  = (long)(v14 - gm.dhld("dikt", dhmc(int ), (int)149));
lbl116:
            // 2 sources

            switch ((int)v13 /* !! */ ) {
                case -483754962: {
                    v14 = gm.dhld("diku", dhmc(int ), (int)150);
                    continue block94;
                }
                case -371927060: {
                    v14 = gm.dhld("dikv", dhmc(int ), (int)151);
                    continue block94;
                }
                case -148206382: {
                    v14 = gm.dhld("dikw", dhmc(int ), (int)152);
                    continue block94;
                }
                case 989277410: {
                    break block94;
                }
            }
            break;
        }
        if (var8_11.method_62844((class_1309)v12, var4_4)) ** GOTO lbl135
        if (var11_9) ** GOTO lbl37
        if (var12_8 /* !! */  == 0) ** GOTO lbl-1000
        switch (var12_8 /* !! */ ) {
            default: lbl-1000:
            // 4 sources

            {
                if (var11_9 || var11_9) ** GOTO lbl37
                return;
            }
lbl135:
            // 1 sources

            if (var11_9 || var11_9) ** GOTO lbl37
            v15 = gm.dhld("dikx", dhlg(int ), (int)318);
            while (true) {
                if ((v16 /* !! */  = (cfr_temp_5 = gm.hj - gm.dhld("diky", dhmc(int ), (int)153)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v16 /* !! */  == gm.dhld("dikz", dhlg(int ), (int)319)) break;
                v16 /* !! */  = (long)gm.dhld("dila", dhlg(int ), (int)320);
            }
            v17 = var7_10.comp_2491() - var5_5;
            v18 /* !! */  = gm.hj;
            if (true) ** GOTO lbl148
            block96: while (true) {
                v18 /* !! */  = (long)(v19 - gm.dhld("dilb", dhmc(int ), (int)154));
lbl148:
                // 2 sources

                switch ((int)v18 /* !! */ ) {
                    case 853831232: {
                        v19 = gm.dhld("dilc", dhmc(int ), (int)155);
                        continue block96;
                    }
                    case 989277410: {
                        break block96;
                    }
                    case 2135816228: {
                        v19 = gm.dhld("dild", dhmc(int ), (int)156);
                        continue block96;
                    }
                }
                break;
            }
            var9_12 = Math.max((int)v15, v17);
            if (var11_9 || var11_9) ** GOTO lbl37
            v20 = (float)var9_12 * gm.dhld("dile", dhku(int ), (int)321);
            v21 /* !! */  = gm.hj;
            if (true) ** GOTO lbl164
            block97: while (true) {
                v21 /* !! */  = (long)(v22 - gm.dhld("dilf", dhmc(int ), (int)157));
lbl164:
                // 2 sources

                switch ((int)v21 /* !! */ ) {
                    case -1833445980: {
                        v22 = gm.dhld("dilg", dhmc(int ), (int)158);
                        continue block97;
                    }
                    case 171534795: {
                        v22 = gm.dhld("dilh", dhmc(int ), (int)159);
                        continue block97;
                    }
                    case 583349118: {
                        v22 = gm.dhld("dili", dhmc(int ), (int)160);
                        continue block97;
                    }
                    case 989277410: {
                        break block97;
                    }
                }
                break;
            }
            v23 = v20 - var7_10.comp_2492() * gm.dhld("dilj", dhku(int ), (int)322);
            v24 /* !! */  = gm.hj;
            if (true) ** GOTO lbl181
            block98: while (true) {
                v24 /* !! */  = (long)(gm.dhld("dill", dhmc(int ), (int)162) - gm.dhld("dilk", dhmc(int ), (int)161));
lbl181:
                // 2 sources

                switch ((int)v24 /* !! */ ) {
                    case 136003539: {
                        continue block98;
                    }
                    case 989277410: {
                        break block98;
                    }
                }
                break;
            }
            var10_13 = v23 - (float)var7_10.comp_2491() + var6_6;
            if (var11_9 || var11_9) ** GOTO lbl37
            while (true) {
                if ((v25 /* !! */  = (cfr_temp_6 = gm.hj - gm.dhld("dilm", dhmc(int ), (int)163)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v25 /* !! */  == gm.dhld("diln", dhlg(int ), (int)323)) break;
                v25 /* !! */  = (long)gm.dhld("dilo", dhlg(int ), (int)324);
            }
            v26 /* !! */  = gm.hj;
            if (true) ** GOTO lbl198
            block100: while (true) {
                v26 /* !! */  = (long)(v27 - gm.dhld("dilp", dhmc(int ), (int)164));
lbl198:
                // 2 sources

                switch ((int)v26 /* !! */ ) {
                    case -223345024: {
                        v27 = gm.dhld("dilq", dhmc(int ), (int)165);
                        continue block100;
                    }
                    case 735975707: {
                        v27 = gm.dhld("dilr", dhmc(int ), (int)166);
                        continue block100;
                    }
                    case 989277410: {
                        break block100;
                    }
                }
                break;
            }
            v28 = new gm$FoodChoice(var2_2, var3_3, var4_4, var7_10, var10_13);
            v29 /* !! */  = gm.hj;
            if (true) ** GOTO lbl212
            block101: while (true) {
                v29 /* !! */  = (long)(v30 - gm.dhld("dils", dhmc(int ), (int)167));
lbl212:
                // 2 sources

                switch ((int)v29 /* !! */ ) {
                    case -1002517365: {
                        v30 = gm.dhld("dilt", dhmc(int ), (int)168);
                        continue block101;
                    }
                    case -236705758: {
                        v30 = gm.dhld("dilu", dhmc(int ), (int)169);
                        continue block101;
                    }
                    case 989277410: {
                        break block101;
                    }
                }
                break;
            }
            var1_1.add(v28);
            if (!var11_9 && !var11_9) ** break;
            ** continue;
            return;
lbl226:
            // 2 sources

            case 0: {
                var12_8 /* !! */  = (int)gm.dhld("dilv", dhlg(int ), (int)325);
                if (var13_7) {
                    throw null;
                }
                ** GOTO lbl245
            }
            case 1: {
                var12_8 /* !! */  = (int)gm.dhld("dilw", dhlg(int ), (int)326);
                if (var13_7) {
                    throw null;
                }
                ** GOTO lbl303
            }
lbl236:
            // 2 sources

            case 2: {
                var12_8 /* !! */  = (int)gm.dhld("dilx", dhlg(int ), (int)327);
                if (!var13_7) break;
                throw null;
            }
lbl240:
            // 4 sources

            case 3: {
                var12_8 /* !! */  = (int)gm.dhld("dily", dhlg(int ), (int)328);
                if (var13_7) {
                    throw null;
                }
                ** GOTO lbl255
            }
lbl245:
            // 2 sources

            case 4: {
                var12_8 /* !! */  = (int)gm.dhld("dilz", dhlg(int ), (int)329);
                if (var13_7) {
                    throw null;
                }
                ** GOTO lbl268
            }
lbl250:
            // 3 sources

            case 5: {
                var12_8 /* !! */  = (int)gm.dhld("dima", dhlg(int ), (int)330);
                if (var13_7) {
                    throw null;
                }
                ** GOTO lbl303
            }
lbl255:
            // 2 sources

            case 6: {
                var12_8 /* !! */  = (int)gm.dhld("dimb", dhlg(int ), (int)331);
                if (!var13_7) break;
                throw null;
            }
            case 7: {
                var12_8 /* !! */  = (int)gm.dhld("dimc", dhlg(int ), (int)332);
                if (!var13_7) ** GOTO lbl240
                throw null;
            }
            case 8: {
                var12_8 /* !! */  = (int)gm.dhld("dimd", dhlg(int ), (int)333);
                if (var13_7) {
                    throw null;
                }
                ** GOTO lbl319
            }
lbl268:
            // 3 sources

            case 9: {
                var12_8 /* !! */  = (int)gm.dhld("dime", dhlg(int ), (int)334);
                if (var13_7) {
                    throw null;
                }
                ** GOTO lbl319
            }
            case 10: {
                var12_8 /* !! */  = (int)gm.dhld("dimf", dhlg(int ), (int)335);
                if (!var13_7) break;
                throw null;
            }
            case 11: {
                var12_8 /* !! */  = (int)gm.dhld("dimg", dhlg(int ), (int)336);
                if (var13_7) {
                    throw null;
                }
                ** GOTO lbl315
            }
lbl282:
            // 2 sources

            case 12: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var12_8 /* !! */  = (int)gm.dhld("dimh", dhlg(int ), (int)337);
                    if (!var13_7) ** GOTO lbl240
                    throw null;
                }
            }
lbl287:
            // 2 sources

            case 13: {
                var12_8 /* !! */  = (int)gm.dhld("dimi", dhlg(int ), (int)338);
                if (!var13_7) ** GOTO lbl236
                throw null;
            }
lbl291:
            // 2 sources

            case 14: {
                var12_8 /* !! */  = (int)gm.dhld("dimj", dhlg(int ), (int)339);
                if (!var13_7) ** GOTO lbl268
                throw null;
            }
            case 15: {
                var12_8 /* !! */  = (int)gm.dhld("dimk", dhlg(int ), (int)340);
                if (!var13_7) ** GOTO lbl291
                throw null;
            }
lbl299:
            // 2 sources

            case 16: {
                var12_8 /* !! */  = (int)gm.dhld("diml", dhlg(int ), (int)341);
                if (!var13_7) ** GOTO lbl226
                throw null;
            }
lbl303:
            // 3 sources

            case 17: {
                var12_8 /* !! */  = (int)gm.dhld("dimm", dhlg(int ), (int)342);
                if (!var13_7) break;
                throw null;
            }
            case 18: {
                var12_8 /* !! */  = (int)gm.dhld("dimn", dhlg(int ), (int)343);
                if (!var13_7) ** GOTO lbl250
                throw null;
            }
lbl311:
            // 2 sources

            case 19: {
                var12_8 /* !! */  = (int)gm.dhld("dimo", dhlg(int ), (int)344);
                if (!var13_7) ** GOTO lbl250
                throw null;
            }
lbl315:
            // 2 sources

            case 20: {
                var12_8 /* !! */  = (int)gm.dhld("dimp", dhlg(int ), (int)345);
                if (!var13_7) ** GOTO lbl282
                throw null;
            }
lbl319:
            // 3 sources

            case 21: {
                var12_8 /* !! */  = (int)gm.dhld("dimq", dhlg(int ), (int)346);
                if (!var13_7) ** GOTO lbl299
                throw null;
            }
            case 22: {
                var12_8 /* !! */  = (int)gm.dhld("dimr", dhlg(int ), (int)347);
                if (!var13_7) ** GOTO lbl311
                throw null;
            }
            case 23: {
                var12_8 /* !! */  = (int)gm.dhld("dims", dhlg(int ), (int)348);
                if (!var13_7) ** GOTO lbl240
                throw null;
            }
            case 24: {
                var12_8 /* !! */  = (int)gm.dhld("dimt", dhlg(int ), (int)349);
                if (!var13_7) ** GOTO lbl287
                throw null;
            }
            case 25: 
        }
        var12_8 /* !! */  = (int)gm.dhld("dimu", dhlg(int ), (int)350);
        ** while (!var13_7)
lbl338:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void djfl() {
        gm.dhmd[200] = 9184665847039831023L;
        gm.dhmd[201] = -6727737572566509719L;
        gm.dhmd[202] = -9047435000475984878L;
        gm.dhmd[203] = -1155782765085627084L;
        gm.dhmd[204] = -7903357968953037503L;
        gm.dhmd[205] = -2594448917825579751L;
        gm.dhmd[206] = -138440786474659145L;
        gm.dhmd[207] = 3955407794565013034L;
        gm.dhmd[208] = -5947529685489334532L;
        gm.dhmd[209] = 2401626556410397300L;
        gm.dhmd[210] = -5941117313010543503L;
        gm.dhmd[211] = -5143915593087127019L;
        gm.dhmd[212] = 6781657490833584909L;
        gm.dhmd[213] = -1231345736079800764L;
        gm.dhmd[214] = 9040860072291687979L;
        gm.dhmd[215] = -9047814047934389893L;
        gm.dhmd[216] = -599170341750884090L;
        gm.dhmd[217] = -1036891727600669141L;
        gm.dhmd[218] = 2997548497770423534L;
        gm.dhmd[219] = -4420745136982247412L;
        gm.dhmd[220] = -2523109293267553883L;
        gm.dhmd[221] = -7382389682980155580L;
        gm.dhmd[222] = 12207201298247531L;
        gm.dhmd[223] = 6792544952451911523L;
        gm.dhmd[224] = 4769848755285214580L;
        gm.dhmd[225] = 7026903473090768422L;
        gm.dhmd[226] = -8244774553425475816L;
        gm.dhmd[227] = 5256777138861693832L;
        gm.dhmd[228] = 4364735794546565605L;
        gm.dhmd[229] = -6152089560247230745L;
        gm.dhmd[230] = -8830549745946902177L;
        gm.dhmd[231] = -6629084549015141874L;
        gm.dhmd[232] = 9098793190851755196L;
        gm.dhmd[233] = -6460033147391845061L;
        gm.dhmd[234] = -2747792549696330770L;
        gm.dhmd[235] = -8150932261428418818L;
        gm.dhmd[236] = 8733922267299336361L;
        gm.dhmd[237] = -8698885744875528878L;
        gm.dhmd[238] = -9060327642350044468L;
        gm.dhmd[239] = -7516554736522343069L;
        gm.dhmd[240] = 8411374275926278683L;
        gm.dhmd[241] = 6955376921981421208L;
        gm.dhmd[242] = 3634467526393415687L;
        gm.dhmd[243] = -5271744189874222963L;
        gm.dhmd[244] = 829007965439820160L;
        gm.dhmd[245] = -6559056594809656022L;
        gm.dhmd[246] = 883532930570854402L;
        gm.dhmd[247] = -6336215519257987453L;
        gm.dhmd[248] = 5445213296707655467L;
        gm.dhmd[249] = -8621210863550082962L;
        gm.dhmd[250] = 1809636473247105755L;
        gm.dhmd[251] = 5178794164623619411L;
        gm.dhmd[252] = 4918967098636742777L;
        gm.dhmd[253] = 6963047389912695897L;
        gm.dhmd[254] = -3928870339832092682L;
        gm.dhmd[255] = 6248632004072457200L;
        gm.dhmd[256] = 3069860917043237437L;
        gm.dhmd[257] = 6851489398372422248L;
        gm.dhmd[258] = -8987676695337535283L;
        gm.dhmd[259] = 6930016675844546114L;
        gm.dhmd[260] = 2302815498061048196L;
        gm.dhmd[261] = -1709627223995215096L;
        gm.dhmd[262] = -2878718717841255991L;
        gm.dhmd[263] = 1964800402268134690L;
        gm.dhmd[264] = 2577776854727332790L;
        gm.dhmd[265] = -6270019837892808831L;
        gm.dhmd[266] = -7956165612874058167L;
        gm.dhmd[267] = -8383097340889362769L;
        gm.dhmd[268] = -3495636080612833762L;
        gm.dhmd[269] = -7529570150803746216L;
        gm.dhmd[270] = 7321074851647260685L;
        gm.dhmd[271] = 5348045380580451187L;
        gm.dhmd[272] = -8068131312810403011L;
        gm.dhmd[273] = -3596417473885669257L;
        gm.dhmd[274] = -1096305026246198160L;
        gm.dhmd[275] = -6088756078385352595L;
        gm.dhmd[276] = -1839860731543597948L;
        gm.dhmd[277] = 6132703598274111765L;
        gm.dhmd[278] = -9212192505708233553L;
        gm.dhmd[279] = -3982406123377815770L;
        gm.dhmd[280] = -6401538353428285147L;
        gm.dhmd[281] = 3354668691042279068L;
        gm.dhmd[282] = -6259432807795144193L;
        gm.dhmd[283] = -6467085913662956917L;
        gm.dhmd[284] = 2555419486994580140L;
        gm.dhmd[285] = -4377063278229387826L;
        gm.dhmd[286] = -379818177804637117L;
        gm.dhmd[287] = -1761681465796591916L;
        gm.dhmd[288] = 4561261283548978581L;
        gm.dhmd[289] = -3157190949646253783L;
        gm.dhmd[290] = 5458088756146904356L;
        gm.dhmd[291] = 8317631844035401438L;
        gm.dhmd[292] = -6636068756613012686L;
        gm.dhmd[293] = -550692063543711976L;
        gm.dhmd[294] = 1293117285738544037L;
        gm.dhmd[295] = 8492782890143314018L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public gm() {
        var2_1 /* !! */  = gm.b;
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                super("AutoEat", "\u0423\u043c\u043d\u043e \u0435\u0441\u0442 \u043f\u0440\u0438 \u043d\u0438\u0437\u043a\u043e\u043c \u0437\u0434\u043e\u0440\u043e\u0432\u044c\u0435 \u0438 \u043d\u0430\u043b\u0438\u0447\u0438\u0438 \u0433\u043e\u043b\u043e\u0434\u0430", du.PLAYER);
                this.healthThreshold = new kg("\u0417\u0434\u043e\u0440\u043e\u0432\u044c\u0435", "\u041f\u0440\u0438 \u043a\u0430\u043a\u043e\u043c \u043a\u043e\u043b\u0438\u0447\u0435\u0441\u0442\u0432\u0435 \u0437\u0434\u043e\u0440\u043e\u0432\u044c\u044f \u043d\u0430\u0447\u0438\u043d\u0430\u0442\u044c \u0435\u0441\u0442\u044c", (float)gm.dhld("dhlf", dhku(int ), (int)0)).range((int)gm.dhld("dhlk", dhlg(int ), (int)1), (int)gm.dhld("dhlm", dhlg(int ), (int)2)).suffix(" HP");
                this.previousSlot = (int)gm.dhld("dhlo", dhlg(int ), (int)3);
                gm.instance = this;
                this.settings(new jx[]{this.healthThreshold});
                return;
            }
lbl11:
            // 2 sources

            case 0: {
                var2_1 /* !! */  = (int)gm.dhld("dhlq", dhlg(int ), (int)4);
                ** GOTO lbl24
            }
            case 1: {
                var2_1 /* !! */  = (int)gm.dhld("dhlr", dhlg(int ), (int)5);
                ** GOTO lbl24
            }
lbl17:
            // 2 sources

            case 2: {
                var2_1 /* !! */  = (int)gm.dhld("dhls", dhlg(int ), (int)6);
                ** GOTO lbl11
            }
lbl20:
            // 2 sources

            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)gm.dhld("dhlu", dhlg(int ), (int)7);
                    ** GOTO lbl17
                    break;
                }
            }
lbl24:
            // 3 sources

            case 4: {
                while (true) {
                    var2_1 /* !! */  = (int)gm.dhld("dhlw", dhlg(int ), (int)8);
                }
            }
            case 5: {
                var2_1 /* !! */  = (int)gm.dhld("dhlx", dhlg(int ), (int)9);
                ** GOTO lbl20
            }
            case 6: 
        }
        var2_1 /* !! */  = (int)gm.dhld("dhlz", dhlg(int ), (int)10);
        ** while (true)
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void resetState(boolean var1_1) {
        block143: {
            block142: {
                v0 /* !! */  = gm.hj;
                if (true) ** GOTO lbl5
                block93: while (true) {
                    v0 /* !! */  = (long)(v1 - gm.dhld("ditb", dhmc(int ), (int)244));
lbl5:
                    // 2 sources

                    switch ((int)v0 /* !! */ ) {
                        case -798394573: {
                            v1 = gm.dhld("ditc", dhmc(int ), (int)245);
                            continue block93;
                        }
                        case 535029334: {
                            v1 = gm.dhld("ditd", dhmc(int ), (int)246);
                            continue block93;
                        }
                        case 705974832: {
                            v1 = gm.dhld("dite", dhmc(int ), (int)247);
                            continue block93;
                        }
                        case 989277410: {
                            break block93;
                        }
                    }
                    break;
                }
                var4_2 = gm.c;
                v2 /* !! */  = gm.hj;
                if (true) ** GOTO lbl22
                block94: while (true) {
                    v2 /* !! */  = (long)(v3 - gm.dhld("ditf", dhmc(int ), (int)248));
lbl22:
                    // 2 sources

                    switch ((int)v2 /* !! */ ) {
                        case -1346819316: {
                            v3 = gm.dhld("ditg", dhmc(int ), (int)249);
                            continue block94;
                        }
                        case 648063720: {
                            v3 = gm.dhld("dith", dhmc(int ), (int)250);
                            continue block94;
                        }
                        case 989277410: {
                            break block94;
                        }
                        case 1095208734: {
                            v3 = gm.dhld("diti", dhmc(int ), (int)251);
                            continue block94;
                        }
                    }
                    break;
                }
                var3_3 /* !! */  = gm.b;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_0 = gm.hj - gm.dhld("ditj", dhmc(int ), (int)252)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == gm.dhld("ditk", dhlg(int ), (int)439)) break;
                    v4 /* !! */  = (long)gm.dhld("ditl", dhlg(int ), (int)440);
                }
                var2_4 = gm.a;
                if (var4_2) {
                    throw null;
lbl43:
                    // 15 sources

                    return;
                }
                if (var2_4 || var2_4) ** GOTO lbl43
                v5 /* !! */  = gm.hj;
                if (true) ** GOTO lbl50
                block97: while (true) {
                    v5 /* !! */  = (long)(v6 - gm.dhld("ditm", dhmc(int ), (int)253));
lbl50:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case 14186546: {
                            v6 = gm.dhld("ditn", dhmc(int ), (int)254);
                            continue block97;
                        }
                        case 989277410: {
                            break block97;
                        }
                        case 1567842401: {
                            v6 = gm.dhld("dito", dhmc(int ), (int)255);
                            continue block97;
                        }
                        case 2031954746: {
                            v6 = gm.dhld("ditp", dhmc(int ), (int)256);
                            continue block97;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_1 = gm.hj - gm.dhld("ditq", dhmc(int ), (int)257)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == gm.dhld("ditr", dhlg(int ), (int)441)) break;
                    v7 /* !! */  = (long)gm.dhld("dits", dhlg(int ), (int)442);
                }
                if (gm.mc.field_1690 == null) break block142;
                if (var2_4 || var2_4) ** GOTO lbl43
                v8 /* !! */  = gm.hj;
                if (true) ** GOTO lbl73
                block99: while (true) {
                    v8 /* !! */  = (long)(v9 - gm.dhld("ditt", dhmc(int ), (int)258));
lbl73:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -2020732842: {
                            v9 = gm.dhld("ditu", dhmc(int ), (int)259);
                            continue block99;
                        }
                        case -1587167642: {
                            v9 = gm.dhld("ditv", dhmc(int ), (int)260);
                            continue block99;
                        }
                        case 989277410: {
                            break block99;
                        }
                        case 2023681010: {
                            v9 = gm.dhld("ditw", dhmc(int ), (int)261);
                            continue block99;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_2 = gm.hj - gm.dhld("ditx", dhmc(int ), (int)262)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == gm.dhld("dity", dhlg(int ), (int)443)) break;
                    v10 /* !! */  = (long)gm.dhld("ditz", dhlg(int ), (int)444);
                }
                v11 = gm.mc.field_1690;
                v12 /* !! */  = gm.hj;
                if (true) ** GOTO lbl95
                block101: while (true) {
                    v12 /* !! */  = (long)(v13 - gm.dhld("diua", dhmc(int ), (int)263));
lbl95:
                    // 2 sources

                    switch ((int)v12 /* !! */ ) {
                        case -1501464316: {
                            v13 = gm.dhld("diub", dhmc(int ), (int)264);
                            continue block101;
                        }
                        case -1471304975: {
                            v13 = gm.dhld("diuc", dhmc(int ), (int)265);
                            continue block101;
                        }
                        case 65586527: {
                            v13 = gm.dhld("diud", dhmc(int ), (int)266);
                            continue block101;
                        }
                        case 989277410: {
                            break block101;
                        }
                    }
                    break;
                }
                v14 = v11.field_1904;
                v15 = gm.dhld("diue", dhlg(int ), (int)445);
                v16 /* !! */  = gm.hj;
                if (true) ** GOTO lbl113
                block102: while (true) {
                    v16 /* !! */  = (long)(gm.dhld("diug", dhmc(int ), (int)268) - gm.dhld("diuf", dhmc(int ), (int)267));
lbl113:
                    // 2 sources

                    switch ((int)v16 /* !! */ ) {
                        case -1378221233: {
                            continue block102;
                        }
                        case 989277410: {
                            break block102;
                        }
                    }
                    break;
                }
                v14.method_23481((boolean)v15);
                if (var2_4) ** GOTO lbl43
            }
            if (var2_4 || var2_4) ** GOTO lbl43
            if (!var1_1) break block143;
            if (var2_4) ** GOTO lbl43
            v17 /* !! */  = gm.hj;
            if (true) ** GOTO lbl128
            block103: while (true) {
                v17 /* !! */  = (long)(gm.dhld("diui", dhmc(int ), (int)270) - gm.dhld("diuh", dhmc(int ), (int)269));
lbl128:
                // 2 sources

                switch ((int)v17 /* !! */ ) {
                    case -1451896921: {
                        continue block103;
                    }
                    case 989277410: {
                        break block103;
                    }
                }
                break;
            }
            if (!this.eating) break block143;
            if (var2_4) ** GOTO lbl43
            while (true) {
                if ((v18 /* !! */  = (cfr_temp_3 = gm.hj - gm.dhld("diuj", dhmc(int ), (int)271)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v18 /* !! */  == gm.dhld("diuk", dhlg(int ), (int)446)) break;
                v18 /* !! */  = (long)gm.dhld("diul", dhlg(int ), (int)447);
            }
            while (true) {
                if ((v19 /* !! */  = (cfr_temp_4 = gm.hj - gm.dhld("dium", dhmc(int ), (int)272)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                if (v19 /* !! */  == gm.dhld("diun", dhlg(int ), (int)448)) break;
                v19 /* !! */  = (long)gm.dhld("diuo", dhlg(int ), (int)449);
            }
            if (gm.mc.field_1724 == null) break block143;
            if (var2_4) ** GOTO lbl43
            v20 /* !! */  = gm.hj;
            if (true) ** GOTO lbl151
            block106: while (true) {
                v20 /* !! */  = (long)(gm.dhld("diuq", dhmc(int ), (int)274) - gm.dhld("diup", dhmc(int ), (int)273));
lbl151:
                // 2 sources

                switch ((int)v20 /* !! */ ) {
                    case -495591032: {
                        continue block106;
                    }
                    case 989277410: {
                        break block106;
                    }
                }
                break;
            }
            v21 /* !! */  = gm.hj;
            if (true) ** GOTO lbl160
            block107: while (true) {
                v21 /* !! */  = (long)(v22 - gm.dhld("diur", dhmc(int ), (int)275));
lbl160:
                // 2 sources

                switch ((int)v21 /* !! */ ) {
                    case -856458615: {
                        v22 = gm.dhld("dius", dhmc(int ), (int)276);
                        continue block107;
                    }
                    case -560098766: {
                        v22 = gm.dhld("diut", dhmc(int ), (int)277);
                        continue block107;
                    }
                    case -1708741: {
                        v22 = gm.dhld("diuu", dhmc(int ), (int)278);
                        continue block107;
                    }
                    case 989277410: {
                        break block107;
                    }
                }
                break;
            }
            if (gm.mc.field_1761 == null) break block143;
            if (var2_4 || var2_4) ** GOTO lbl43
            while (true) {
                if ((v23 /* !! */  = (cfr_temp_5 = gm.hj - gm.dhld("diuv", dhmc(int ), (int)279)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                if (v23 /* !! */  == gm.dhld("diuw", dhlg(int ), (int)450)) break;
                v23 /* !! */  = (long)gm.dhld("diux", dhlg(int ), (int)451);
            }
            while (true) {
                if ((v24 /* !! */  = (cfr_temp_6 = gm.hj - gm.dhld("diuy", dhmc(int ), (int)280)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                if (v24 /* !! */  == gm.dhld("diuz", dhlg(int ), (int)452)) break;
                v24 /* !! */  = (long)gm.dhld("diva", dhlg(int ), (int)453);
            }
            v25 = gm.mc.field_1761;
            v26 /* !! */  = gm.hj;
            if (true) ** GOTO lbl189
            block110: while (true) {
                v26 /* !! */  = (long)(v27 - gm.dhld("divb", dhmc(int ), (int)281));
lbl189:
                // 2 sources

                switch ((int)v26 /* !! */ ) {
                    case -1872296250: {
                        v27 = gm.dhld("divc", dhmc(int ), (int)282);
                        continue block110;
                    }
                    case -512082386: {
                        v27 = gm.dhld("divd", dhmc(int ), (int)283);
                        continue block110;
                    }
                    case 989277410: {
                        break block110;
                    }
                    case 1476706420: {
                        v27 = gm.dhld("dive", dhmc(int ), (int)284);
                        continue block110;
                    }
                }
                break;
            }
            while (true) {
                if ((v28 /* !! */  = (cfr_temp_7 = gm.hj - gm.dhld("divf", dhmc(int ), (int)285)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                if (v28 /* !! */  == gm.dhld("divg", dhlg(int ), (int)454)) break;
                v28 /* !! */  = (long)gm.dhld("divh", dhlg(int ), (int)455);
            }
            v29 = gm.mc.field_1724;
            while (true) {
                if ((v30 /* !! */  = (cfr_temp_8 = gm.hj - gm.dhld("divi", dhmc(int ), (int)286)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                if (v30 /* !! */  == gm.dhld("divj", dhlg(int ), (int)456)) break;
                v30 /* !! */  = (long)gm.dhld("divk", dhlg(int ), (int)457);
            }
            v25.method_2897((class_1657)v29);
            if (var2_4) ** GOTO lbl43
        }
        if (var2_4 || var2_4) ** GOTO lbl43
        while (true) {
            if ((v31 /* !! */  = (cfr_temp_9 = gm.hj - gm.dhld("divl", dhmc(int ), (int)287)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
            if (v31 /* !! */  == gm.dhld("divm", dhlg(int ), (int)458)) break;
            v31 /* !! */  = (long)gm.dhld("divn", dhlg(int ), (int)459);
        }
        this.restoreSlot();
        if (var2_4 || var2_4) ** GOTO lbl43
        v32 = gm.dhld("divo", dhlg(int ), (int)460);
        while (true) {
            if ((v33 /* !! */  = (cfr_temp_10 = gm.hj - gm.dhld("divq", dhmc(int ), (int)288)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
            if (v33 /* !! */  == gm.dhld("divs", dhlg(int ), (int)461)) break;
            v33 /* !! */  = (long)gm.dhld("divt", dhlg(int ), (int)462);
        }
        this.eating = v32;
        if (var2_4 || var2_4) ** GOTO lbl43
        v34 = gm.dhld("divv", dhlg(int ), (int)463);
        while (true) {
            if ((v35 /* !! */  = (cfr_temp_11 = gm.hj - gm.dhld("divx", dhmc(int ), (int)289)) == 0L ? 0 : (cfr_temp_11 < 0L ? -1 : 1)) == false) continue;
            if (v35 /* !! */  == gm.dhld("divz", dhlg(int ), (int)464)) break;
            v35 /* !! */  = (long)gm.dhld("diwa", dhlg(int ), (int)465);
        }
        gm.eatingNow = v34;
        if (var2_4 || var2_4) ** GOTO lbl43
        v36 /* !! */  = gm.hj;
        if (true) ** GOTO lbl243
        block116: while (true) {
            v36 /* !! */  = (long)(v37 - gm.dhld("diwd", dhmc(int ), (int)290));
lbl243:
            // 2 sources

            switch ((int)v36 /* !! */ ) {
                case -1991066427: {
                    v37 = gm.dhld("diwg", dhmc(int ), (int)291);
                    continue block116;
                }
                case 956022421: {
                    v37 = gm.dhld("diwh", dhmc(int ), (int)292);
                    continue block116;
                }
                case 989277410: {
                    break block116;
                }
            }
            break;
        }
        this.eatingHand = null;
        if (var2_4 || var2_4) ** GOTO lbl43
        v38 = gm.dhld("diwj", dhlg(int ), (int)466);
        v39 /* !! */  = gm.hj;
        if (true) ** GOTO lbl259
        block117: while (true) {
            v39 /* !! */  = (long)(v40 - gm.dhld("diwl", dhmc(int ), (int)293));
lbl259:
            // 2 sources

            switch ((int)v39 /* !! */ ) {
                case 989277410: {
                    break block117;
                }
                case 1909187114: {
                    v40 = gm.dhld("diwm", dhmc(int ), (int)294);
                    continue block117;
                }
                case 1981809432: {
                    v40 = gm.dhld("diwn", dhmc(int ), (int)295);
                    continue block117;
                }
            }
            break;
        }
        this.eatingTicks = (int)v38;
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var2_4 && !var2_4) ** break;
                ** continue;
                return;
            }
lbl275:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)gm.dhld("diwp", dhlg(int ), (int)467);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl366
            }
            case 1: {
                var3_3 /* !! */  = (int)gm.dhld("diwr", dhlg(int ), (int)468);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl333
            }
            case 2: {
                do {
                    var3_3 /* !! */  = (int)gm.dhld("diwt", dhlg(int ), (int)469);
                } while (!var4_2);
                throw null;
            }
            case 3: {
                var3_3 /* !! */  = (int)gm.dhld("diwv", dhlg(int ), (int)470);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl313
            }
lbl295:
            // 3 sources

            case 4: {
                do {
                    var3_3 /* !! */  = (int)gm.dhld("diwx", dhlg(int ), (int)471);
                } while (!var4_2);
                throw null;
            }
lbl300:
            // 4 sources

            case 5: {
                var3_3 /* !! */  = (int)gm.dhld("diwz", dhlg(int ), (int)472);
                if (!var4_2) ** GOTO lbl275
                throw null;
            }
lbl304:
            // 2 sources

            case 6: {
                var3_3 /* !! */  = (int)gm.dhld("dixb", dhlg(int ), (int)473);
                if (!var4_2) ** GOTO lbl300
                throw null;
            }
            case 7: {
                var3_3 /* !! */  = (int)gm.dhld("dixc", dhlg(int ), (int)474);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl370
            }
lbl313:
            // 2 sources

            case 8: {
                do {
                    var3_3 /* !! */  = (int)gm.dhld("dixd", dhlg(int ), (int)475);
                } while (!var4_2);
                throw null;
            }
            case 9: {
                var3_3 /* !! */  = (int)gm.dhld("dixe", dhlg(int ), (int)476);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl362
            }
            case 10: {
                var3_3 /* !! */  = (int)gm.dhld("dixg", dhlg(int ), (int)477);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl378
            }
lbl328:
            // 2 sources

            case 11: {
                var3_3 /* !! */  = (int)gm.dhld("dixj", dhlg(int ), (int)478);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl386
            }
lbl333:
            // 3 sources

            case 12: {
                var3_3 /* !! */  = (int)gm.dhld("dixk", dhlg(int ), (int)479);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl356
            }
            case 13: {
                var3_3 /* !! */  = (int)gm.dhld("dixp", dhlg(int ), (int)480);
                if (!var4_2) ** GOTO lbl295
                throw null;
            }
            case 14: {
                var3_3 /* !! */  = (int)gm.dhld("dixq", dhlg(int ), (int)481);
                if (var4_2) {
                    throw null;
                }
            }
            case 15: {
                var3_3 /* !! */  = (int)gm.dhld("dixr", dhlg(int ), (int)482);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl366
            }
            case 16: {
                var3_3 /* !! */  = (int)gm.dhld("dixs", dhlg(int ), (int)483);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl374
            }
lbl356:
            // 2 sources

            case 17: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)gm.dhld("dixt", dhlg(int ), (int)484);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl390
                    break;
                }
            }
lbl362:
            // 2 sources

            case 18: {
                var3_3 /* !! */  = (int)gm.dhld("dixu", dhlg(int ), (int)485);
                if (!var4_2) ** GOTO lbl328
                throw null;
            }
lbl366:
            // 3 sources

            case 19: {
                var3_3 /* !! */  = (int)gm.dhld("dixx", dhlg(int ), (int)486);
                if (var4_2) {
                    throw null;
                }
            }
lbl370:
            // 4 sources

            case 20: {
                var3_3 /* !! */  = (int)gm.dhld("diyb", dhlg(int ), (int)487);
                if (!var4_2) ** GOTO lbl300
                throw null;
            }
lbl374:
            // 2 sources

            case 21: {
                var3_3 /* !! */  = (int)gm.dhld("diyd", dhlg(int ), (int)488);
                if (!var4_2) ** GOTO lbl295
                throw null;
            }
lbl378:
            // 2 sources

            case 22: {
                var3_3 /* !! */  = (int)gm.dhld("diyf", dhlg(int ), (int)489);
                if (!var4_2) ** GOTO lbl300
                throw null;
            }
            case 23: {
                var3_3 /* !! */  = (int)gm.dhld("diyg", dhlg(int ), (int)490);
                if (!var4_2) break;
                throw null;
            }
lbl386:
            // 2 sources

            case 24: {
                var3_3 /* !! */  = (int)gm.dhld("diyh", dhlg(int ), (int)491);
                if (!var4_2) ** GOTO lbl304
                throw null;
            }
lbl390:
            // 2 sources

            case 25: {
                var3_3 /* !! */  = (int)gm.dhld("diyi", dhlg(int ), (int)492);
                if (!var4_2) ** GOTO lbl333
                throw null;
            }
            case 26: 
        }
        var3_3 /* !! */  = (int)gm.dhld("diyj", dhlg(int ), (int)493);
        ** while (!var4_2)
lbl397:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void startEating() {
        block86: {
            var5_1 = gm.c;
            var4_2 /* !! */  = gm.b;
            var3_3 = gm.a;
            if (var5_1) {
                throw null;
lbl6:
                // 22 sources

                return;
            }
            if (var3_3 || var3_3) ** GOTO lbl6
            var1_4 = this.bestFood();
            if (var3_3 || var3_3) ** GOTO lbl6
            if (var1_4 != null) break block86;
            if (var3_3 || var3_3) ** GOTO lbl6
            return;
        }
        if (var3_3 || var3_3) ** GOTO lbl6
        if (var1_4.hotbarSlot() < 0) ** GOTO lbl32
        if (var3_3 || var3_3) ** GOTO lbl6
        var2_5 = gm.mc.field_1724.method_31548().method_67532();
        if (var3_3 || var3_3) ** GOTO lbl6
        if (var2_5 == var1_4.hotbarSlot()) ** GOTO lbl32
        if (var3_3 || var3_3) ** GOTO lbl6
        this.previousSlot = var2_5;
        if (var3_3) ** GOTO lbl6
        if (var4_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_3) ** GOTO lbl6
                gm.mc.field_1724.method_31548().method_61496(var1_4.hotbarSlot());
                if (var3_3 || var3_3) ** GOTO lbl6
                gm.mc.method_1562().method_52787((class_2596)new class_2868(var1_4.hotbarSlot()));
                if (var3_3) ** GOTO lbl6
lbl32:
                // 3 sources

                if (var3_3 || var3_3) ** GOTO lbl6
                na.pauseForInventoryAction();
                if (var3_3 || var3_3) ** GOTO lbl6
                var2_6 = gm.mc.field_1761.method_2919((class_1657)gm.mc.field_1724, var1_4.hand());
                if (var3_3 || var3_3) ** GOTO lbl6
                if (var2_6.method_23665()) ** GOTO lbl42
                if (var3_3 || var3_3) ** GOTO lbl6
                this.restoreSlot();
                if (var3_3 || var3_3) ** GOTO lbl6
                return;
lbl42:
                // 1 sources

                if (var3_3 || var3_3) ** GOTO lbl6
                this.eating = gm.dhld("dicy", dhlg(int ), (int)157);
                if (var3_3 || var3_3) ** GOTO lbl6
                gm.eatingNow = gm.dhld("dicz", dhlg(int ), (int)158);
                if (var3_3 || var3_3) ** GOTO lbl6
                this.eatingHand = var1_4.hand();
                if (var3_3 || var3_3) ** GOTO lbl6
                this.eatingTicks = (int)gm.dhld("dida", dhlg(int ), (int)159);
                if (var3_3 || var3_3) ** GOTO lbl6
                gm.mc.field_1690.field_1904.method_23481((boolean)gm.dhld("didb", dhlg(int ), (int)160));
                if (!var3_3 && !var3_3) ** break;
                ** continue;
                return;
            }
lbl55:
            // 2 sources

            case 0: {
                var4_2 /* !! */  = (int)gm.dhld("didc", dhlg(int ), (int)161);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl168
            }
lbl60:
            // 2 sources

            case 1: {
                var4_2 /* !! */  = (int)gm.dhld("didd", dhlg(int ), (int)162);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl156
            }
lbl65:
            // 3 sources

            case 2: {
                var4_2 /* !! */  = (int)gm.dhld("dide", dhlg(int ), (int)163);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl101
            }
            case 3: {
                var4_2 /* !! */  = (int)gm.dhld("didf", dhlg(int ), (int)164);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl120
            }
lbl75:
            // 2 sources

            case 4: {
                var4_2 /* !! */  = (int)gm.dhld("didg", dhlg(int ), (int)165);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl172
            }
            case 5: {
                var4_2 /* !! */  = (int)gm.dhld("didh", dhlg(int ), (int)166);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl223
            }
lbl85:
            // 2 sources

            case 6: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_2 /* !! */  = (int)gm.dhld("didi", dhlg(int ), (int)167);
                    if (var5_1) {
                        throw null;
                    }
                    ** GOTO lbl235
                    break;
                }
            }
            case 7: {
                var4_2 /* !! */  = (int)gm.dhld("didj", dhlg(int ), (int)168);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl139
            }
            case 8: {
                var4_2 /* !! */  = (int)gm.dhld("didk", dhlg(int ), (int)169);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl186
            }
lbl101:
            // 4 sources

            case 9: {
                var4_2 /* !! */  = (int)gm.dhld("didl", dhlg(int ), (int)170);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl120
            }
lbl106:
            // 3 sources

            case 10: {
                var4_2 /* !! */  = (int)gm.dhld("didm", dhlg(int ), (int)171);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl198
            }
            case 11: {
                var4_2 /* !! */  = (int)gm.dhld("didn", dhlg(int ), (int)172);
                if (!var5_1) ** GOTO lbl85
                throw null;
            }
lbl115:
            // 2 sources

            case 12: {
                var4_2 /* !! */  = (int)gm.dhld("dido", dhlg(int ), (int)173);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl198
            }
lbl120:
            // 3 sources

            case 13: {
                var4_2 /* !! */  = (int)gm.dhld("didp", dhlg(int ), (int)174);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl194
            }
            case 14: {
                var4_2 /* !! */  = (int)gm.dhld("didq", dhlg(int ), (int)175);
                if (!var5_1) ** GOTO lbl101
                throw null;
            }
lbl129:
            // 2 sources

            case 15: {
                var4_2 /* !! */  = (int)gm.dhld("didr", dhlg(int ), (int)176);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl190
            }
            case 16: {
                var4_2 /* !! */  = (int)gm.dhld("dids", dhlg(int ), (int)177);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl190
            }
lbl139:
            // 4 sources

            case 17: {
                var4_2 /* !! */  = (int)gm.dhld("didt", dhlg(int ), (int)178);
                if (!var5_1) ** GOTO lbl106
                throw null;
            }
lbl143:
            // 2 sources

            case 18: {
                var4_2 /* !! */  = (int)gm.dhld("didu", dhlg(int ), (int)179);
                if (!var5_1) ** GOTO lbl65
                throw null;
            }
            case 19: {
                var4_2 /* !! */  = (int)gm.dhld("didv", dhlg(int ), (int)180);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl160
            }
lbl152:
            // 2 sources

            case 20: {
                var4_2 /* !! */  = (int)gm.dhld("didw", dhlg(int ), (int)181);
                if (!var5_1) ** GOTO lbl60
                throw null;
            }
lbl156:
            // 2 sources

            case 21: {
                var4_2 /* !! */  = (int)gm.dhld("didx", dhlg(int ), (int)182);
                if (!var5_1) ** GOTO lbl139
                throw null;
            }
lbl160:
            // 3 sources

            case 22: {
                var4_2 /* !! */  = (int)gm.dhld("didy", dhlg(int ), (int)183);
                if (!var5_1) ** GOTO lbl115
                throw null;
            }
lbl164:
            // 2 sources

            case 23: {
                var4_2 /* !! */  = (int)gm.dhld("didz", dhlg(int ), (int)184);
                if (!var5_1) ** GOTO lbl160
                throw null;
            }
lbl168:
            // 2 sources

            case 24: {
                var4_2 /* !! */  = (int)gm.dhld("diea", dhlg(int ), (int)185);
                if (!var5_1) ** GOTO lbl75
                throw null;
            }
lbl172:
            // 2 sources

            case 25: {
                var4_2 /* !! */  = (int)gm.dhld("dieb", dhlg(int ), (int)186);
                if (!var5_1) ** GOTO lbl143
                throw null;
            }
            case 26: {
                var4_2 /* !! */  = (int)gm.dhld("diec", dhlg(int ), (int)187);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl219
            }
lbl181:
            // 3 sources

            case 27: {
                var4_2 /* !! */  = (int)gm.dhld("died", dhlg(int ), (int)188);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl235
            }
lbl186:
            // 2 sources

            case 28: {
                var4_2 /* !! */  = (int)gm.dhld("diee", dhlg(int ), (int)189);
                if (!var5_1) ** GOTO lbl101
                throw null;
            }
lbl190:
            // 3 sources

            case 29: {
                var4_2 /* !! */  = (int)gm.dhld("dief", dhlg(int ), (int)190);
                if (!var5_1) ** GOTO lbl65
                throw null;
            }
lbl194:
            // 2 sources

            case 30: {
                var4_2 /* !! */  = (int)gm.dhld("dieg", dhlg(int ), (int)191);
                if (!var5_1) ** GOTO lbl181
                throw null;
            }
lbl198:
            // 3 sources

            case 31: {
                var4_2 /* !! */  = (int)gm.dhld("dieh", dhlg(int ), (int)192);
                if (!var5_1) ** GOTO lbl129
                throw null;
            }
            case 32: {
                var4_2 /* !! */  = (int)gm.dhld("diei", dhlg(int ), (int)193);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl219
            }
            case 33: {
                var4_2 /* !! */  = (int)gm.dhld("diej", dhlg(int ), (int)194);
                if (!var5_1) ** GOTO lbl139
                throw null;
            }
lbl211:
            // 3 sources

            case 34: {
                var4_2 /* !! */  = (int)gm.dhld("diek", dhlg(int ), (int)195);
                if (!var5_1) ** GOTO lbl164
                throw null;
            }
            case 35: {
                var4_2 /* !! */  = (int)gm.dhld("diel", dhlg(int ), (int)196);
                if (!var5_1) ** GOTO lbl106
                throw null;
            }
lbl219:
            // 3 sources

            case 36: {
                var4_2 /* !! */  = (int)gm.dhld("diem", dhlg(int ), (int)197);
                if (!var5_1) ** GOTO lbl211
                throw null;
            }
lbl223:
            // 2 sources

            case 37: {
                var4_2 /* !! */  = (int)gm.dhld("dien", dhlg(int ), (int)198);
                if (!var5_1) ** GOTO lbl211
                throw null;
            }
lbl227:
            // 2 sources

            case 38: {
                var4_2 /* !! */  = (int)gm.dhld("dieo", dhlg(int ), (int)199);
                if (!var5_1) ** GOTO lbl152
                throw null;
            }
            case 39: {
                var4_2 /* !! */  = (int)gm.dhld("diep", dhlg(int ), (int)200);
                if (!var5_1) ** GOTO lbl181
                throw null;
            }
lbl235:
            // 3 sources

            case 40: {
                var4_2 /* !! */  = (int)gm.dhld("dieq", dhlg(int ), (int)201);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl244
            }
            case 41: {
                var4_2 /* !! */  = (int)gm.dhld("dier", dhlg(int ), (int)202);
                if (!var5_1) ** GOTO lbl55
                throw null;
            }
lbl244:
            // 2 sources

            case 42: {
                var4_2 /* !! */  = (int)gm.dhld("dies", dhlg(int ), (int)203);
                if (!var5_1) ** GOTO lbl227
                throw null;
            }
            case 43: 
        }
        var4_2 /* !! */  = (int)gm.dhld("diet", dhlg(int ), (int)204);
        ** while (!var5_1)
lbl251:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static boolean shouldPauseAutomation() {
        block57: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = gm.hj - gm.dhld("dhnp", dhmc(int ), (int)11)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v0 /* !! */  == gm.dhld("dhnq", dhlg(int ), (int)16)) break;
                v0 /* !! */  = (long)gm.dhld("dhtx", dhlg(int ), (int)17);
            }
            var3 = gm.c;
            while (true) {
                if ((v1 /* !! */  = (cfr_temp_1 = gm.hj - gm.dhld("dhty", dhmc(int ), (int)12)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v1 /* !! */  == gm.dhld("dhtz", dhlg(int ), (int)18)) break;
                v1 /* !! */  = (long)gm.dhld("dhua", dhlg(int ), (int)19);
            }
            var2_1 /* !! */  = gm.b;
            v2 /* !! */  = gm.hj;
            if (true) ** GOTO lbl19
            block33: while (true) {
                v2 /* !! */  = (long)(gm.dhld("dhuc", dhmc(int ), (int)14) - gm.dhld("dhub", dhmc(int ), (int)13));
lbl19:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case -1394963275: {
                        continue block33;
                    }
                    case 989277410: {
                        break block33;
                    }
                }
                break;
            }
            var1_2 = gm.a;
            if (var3) {
                throw null;
lbl27:
                // 9 sources

                return (boolean)gm.dhld("dhud", dhlg(int ), (int)20);
            }
            if (var1_2 || var1_2) ** GOTO lbl27
            v3 /* !! */  = gm.hj;
            if (true) ** GOTO lbl34
            block35: while (true) {
                v3 /* !! */  = (long)(v4 - gm.dhld("dhue", dhmc(int ), (int)15));
lbl34:
                // 2 sources

                switch ((int)v3 /* !! */ ) {
                    case -2071200473: {
                        v4 = gm.dhld("dhuf", dhmc(int ), (int)16);
                        continue block35;
                    }
                    case -1131959851: {
                        v4 = gm.dhld("dhug", dhmc(int ), (int)17);
                        continue block35;
                    }
                    case 989277410: {
                        break block35;
                    }
                }
                break;
            }
            var0_3 = gm.instance;
            if (var1_2 || var1_2) ** GOTO lbl27
            v5 /* !! */  = gm.hj;
            if (true) ** GOTO lbl49
            block36: while (true) {
                v5 /* !! */  = (long)(v6 - gm.dhld("dhuh", dhmc(int ), (int)18));
lbl49:
                // 2 sources

                switch ((int)v5 /* !! */ ) {
                    case -84744663: {
                        v6 = gm.dhld("dhui", dhmc(int ), (int)19);
                        continue block36;
                    }
                    case 989277410: {
                        break block36;
                    }
                    case 1770800324: {
                        v6 = gm.dhld("dhuj", dhmc(int ), (int)20);
                        continue block36;
                    }
                }
                break;
            }
            if (gm.eatingNow) break block57;
            if (var1_2) ** GOTO lbl27
            if (var0_3 == null) ** GOTO lbl88
            if (var1_2) ** GOTO lbl27
            while (true) {
                if ((v7 /* !! */  = (cfr_temp_2 = gm.hj - gm.dhld("dhuk", dhmc(int ), (int)21)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v7 /* !! */  == gm.dhld("dhul", dhlg(int ), (int)21)) break;
                v7 /* !! */  = (long)gm.dhld("dhum", dhlg(int ), (int)22);
            }
            if (!var0_3.isState()) ** GOTO lbl88
            if (var1_2) ** GOTO lbl27
            while (true) {
                if ((v8 /* !! */  = (cfr_temp_3 = gm.hj - gm.dhld("dhun", dhmc(int ), (int)22)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v8 /* !! */  == gm.dhld("dhuo", dhlg(int ), (int)23)) break;
                v8 /* !! */  = (long)gm.dhld("dhup", dhlg(int ), (int)24);
            }
            if (!var0_3.shouldStartEating()) ** GOTO lbl88
            if (var1_2) ** GOTO lbl27
        }
        if (var1_2) ** GOTO lbl27
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_2) ** GOTO lbl27
                v9 = gm.dhld("dhuq", dhlg(int ), (int)25);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl91
            }
lbl88:
            // 3 sources

            if (!var1_2 && !var1_2) ** break;
            ** continue;
            v9 = gm.dhld("dhur", dhlg(int ), (int)26);
lbl91:
            // 2 sources

            return (boolean)v9;
            case 0: {
                var2_1 /* !! */  = (int)gm.dhld("dhus", dhlg(int ), (int)27);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl114
            }
            case 1: {
                var2_1 /* !! */  = (int)gm.dhld("dhut", dhlg(int ), (int)28);
                if (var3) {
                    throw null;
                }
            }
lbl101:
            // 6 sources

            case 2: {
                var2_1 /* !! */  = (int)gm.dhld("dhuu", dhlg(int ), (int)29);
                if (var3) {
                    throw null;
                }
            }
            case 3: {
                var2_1 /* !! */  = (int)gm.dhld("dhuv", dhlg(int ), (int)30);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl145
            }
            case 4: {
                var2_1 /* !! */  = (int)gm.dhld("dhuw", dhlg(int ), (int)31);
                if (!var3) ** GOTO lbl101
                throw null;
            }
lbl114:
            // 3 sources

            case 5: {
                var2_1 /* !! */  = (int)gm.dhld("dhux", dhlg(int ), (int)32);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl141
            }
lbl119:
            // 2 sources

            case 6: {
                do {
                    var2_1 /* !! */  = (int)gm.dhld("dhuy", dhlg(int ), (int)33);
                } while (!var3);
                throw null;
            }
            case 7: {
                var2_1 /* !! */  = (int)gm.dhld("dhuz", dhlg(int ), (int)34);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl150
            }
            case 8: {
                var2_1 /* !! */  = (int)gm.dhld("dhva", dhlg(int ), (int)35);
                if (!var3) ** GOTO lbl114
                throw null;
            }
            case 9: {
                var2_1 /* !! */  = (int)gm.dhld("dhvb", dhlg(int ), (int)36);
                if (!var3) ** GOTO lbl119
                throw null;
            }
            case 10: {
                var2_1 /* !! */  = (int)gm.dhld("dhvc", dhlg(int ), (int)37);
                if (!var3) ** GOTO lbl101
                throw null;
            }
lbl141:
            // 2 sources

            case 11: {
                var2_1 /* !! */  = (int)gm.dhld("dhvd", dhlg(int ), (int)38);
                if (!var3) ** GOTO lbl101
                throw null;
            }
lbl145:
            // 2 sources

            case 12: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_1 /* !! */  = (int)gm.dhld("dhve", dhlg(int ), (int)39);
                    if (!var3) ** GOTO lbl-1000
                    throw null;
                }
            }
lbl150:
            // 2 sources

            case 13: {
                do {
                    var2_1 /* !! */  = (int)gm.dhld("dhvf", dhlg(int ), (int)40);
                } while (!var3);
                throw null;
            }
            case 14: 
        }
        var2_1 /* !! */  = (int)gm.dhld("dhvg", dhlg(int ), (int)41);
        ** while (!var3)
lbl158:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void continueEating() {
        var4_1 = gm.c;
        var3_2 /* !! */  = gm.b;
        var2_3 = gm.a;
        if (var4_1) {
            throw null;
lbl6:
            // 16 sources

            return;
        }
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_3 || var2_3) ** GOTO lbl6
                gm.eatingNow = gm.dhld("dieu", dhlg(int ), (int)205);
                if (var2_3 || var2_3) ** GOTO lbl6
                this.eatingTicks += gm.dhld("diev", dhlg(int ), (int)206);
                if (var2_3 || var2_3) ** GOTO lbl6
                na.pauseForInventoryAction();
                if (var2_3 || var2_3) ** GOTO lbl6
                gm.mc.field_1690.field_1904.method_23481((boolean)gm.dhld("diew", dhlg(int ), (int)207));
                if (var2_3 || var2_3) ** GOTO lbl6
                if (!gm.mc.field_1724.method_6115()) ** GOTO lbl36
                if (var2_3 || var2_3) ** GOTO lbl6
                var1_4 = gm.mc.field_1724.method_6030();
                if (var2_3 || var2_3) ** GOTO lbl6
                if (!this.isSafeFood(var1_4)) ** GOTO lbl32
                if (var2_3) ** GOTO lbl6
                if (this.eatingHand == null) ** GOTO lbl30
                if (var2_3) ** GOTO lbl6
                if (gm.mc.field_1724.method_6058() != this.eatingHand) ** GOTO lbl32
                if (var2_3) ** GOTO lbl6
lbl30:
                // 2 sources

                if (var2_3 || var2_3) ** GOTO lbl6
                return;
lbl32:
                // 2 sources

                if (var2_3 || var2_3) ** GOTO lbl6
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl40
lbl36:
                // 1 sources

                if (var2_3 || var2_3) ** GOTO lbl6
                if (this.eatingTicks > gm.dhld("diex", dhlg(int ), (int)208)) ** GOTO lbl40
                if (var2_3 || var2_3) ** GOTO lbl6
                return;
lbl40:
                // 2 sources

                if (var2_3 || var2_3) ** GOTO lbl6
                this.finishEating();
                if (!var2_3 && !var2_3) ** break;
                ** continue;
                return;
            }
lbl45:
            // 3 sources

            case 0: {
                var3_2 /* !! */  = (int)gm.dhld("diey", dhlg(int ), (int)209);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl177
            }
            case 1: {
                var3_2 /* !! */  = (int)gm.dhld("diez", dhlg(int ), (int)210);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl155
            }
            case 2: {
                var3_2 /* !! */  = (int)gm.dhld("difa", dhlg(int ), (int)211);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl85
            }
lbl60:
            // 2 sources

            case 3: {
                var3_2 /* !! */  = (int)gm.dhld("difb", dhlg(int ), (int)212);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl104
            }
lbl65:
            // 2 sources

            case 4: {
                var3_2 /* !! */  = (int)gm.dhld("difc", dhlg(int ), (int)213);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl164
            }
            case 5: {
                var3_2 /* !! */  = (int)gm.dhld("difd", dhlg(int ), (int)214);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl94
            }
lbl75:
            // 2 sources

            case 6: {
                var3_2 /* !! */  = (int)gm.dhld("dife", dhlg(int ), (int)215);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl159
            }
            case 7: {
                var3_2 /* !! */  = (int)gm.dhld("diff", dhlg(int ), (int)216);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl99
            }
lbl85:
            // 2 sources

            case 8: {
                var3_2 /* !! */  = (int)gm.dhld("difg", dhlg(int ), (int)217);
                if (!var4_1) ** GOTO lbl45
                throw null;
            }
lbl89:
            // 2 sources

            case 9: {
                var3_2 /* !! */  = (int)gm.dhld("difh", dhlg(int ), (int)218);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl143
            }
lbl94:
            // 2 sources

            case 10: {
                var3_2 /* !! */  = (int)gm.dhld("difi", dhlg(int ), (int)219);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl177
            }
lbl99:
            // 2 sources

            case 11: {
                var3_2 /* !! */  = (int)gm.dhld("difj", dhlg(int ), (int)220);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl138
            }
lbl104:
            // 5 sources

            case 12: {
                var3_2 /* !! */  = (int)gm.dhld("difk", dhlg(int ), (int)221);
                if (!var4_1) ** GOTO lbl45
                throw null;
            }
            case 13: {
                var3_2 /* !! */  = (int)gm.dhld("difl", dhlg(int ), (int)222);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl185
            }
            case 14: {
                var3_2 /* !! */  = (int)gm.dhld("difm", dhlg(int ), (int)223);
                if (!var4_1) ** GOTO lbl104
                throw null;
            }
lbl117:
            // 2 sources

            case 15: {
                do {
                    var3_2 /* !! */  = (int)gm.dhld("difn", dhlg(int ), (int)224);
                } while (!var4_1);
                throw null;
            }
            case 16: {
                var3_2 /* !! */  = (int)gm.dhld("difo", dhlg(int ), (int)225);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl185
            }
            case 17: {
                var3_2 /* !! */  = (int)gm.dhld("difp", dhlg(int ), (int)226);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl151
            }
lbl132:
            // 2 sources

            case 18: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_2 /* !! */  = (int)gm.dhld("difq", dhlg(int ), (int)227);
                    if (var4_1) {
                        throw null;
                    }
                    ** GOTO lbl168
                    break;
                }
            }
lbl138:
            // 2 sources

            case 19: {
                var3_2 /* !! */  = (int)gm.dhld("difr", dhlg(int ), (int)228);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl177
            }
lbl143:
            // 2 sources

            case 20: {
                var3_2 /* !! */  = (int)gm.dhld("difs", dhlg(int ), (int)229);
                if (!var4_1) ** GOTO lbl89
                throw null;
            }
lbl147:
            // 2 sources

            case 21: {
                var3_2 /* !! */  = (int)gm.dhld("dift", dhlg(int ), (int)230);
                if (!var4_1) break;
                throw null;
            }
lbl151:
            // 2 sources

            case 22: {
                var3_2 /* !! */  = (int)gm.dhld("difu", dhlg(int ), (int)231);
                if (!var4_1) ** GOTO lbl65
                throw null;
            }
lbl155:
            // 2 sources

            case 23: {
                var3_2 /* !! */  = (int)gm.dhld("difv", dhlg(int ), (int)232);
                if (!var4_1) ** GOTO lbl104
                throw null;
            }
lbl159:
            // 2 sources

            case 24: {
                var3_2 /* !! */  = (int)gm.dhld("difw", dhlg(int ), (int)233);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl168
            }
lbl164:
            // 2 sources

            case 25: {
                var3_2 /* !! */  = (int)gm.dhld("difx", dhlg(int ), (int)234);
                if (!var4_1) ** GOTO lbl147
                throw null;
            }
lbl168:
            // 3 sources

            case 26: {
                var3_2 /* !! */  = (int)gm.dhld("dify", dhlg(int ), (int)235);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl185
            }
            case 27: {
                var3_2 /* !! */  = (int)gm.dhld("difz", dhlg(int ), (int)236);
                if (!var4_1) ** GOTO lbl132
                throw null;
            }
lbl177:
            // 4 sources

            case 28: {
                var3_2 /* !! */  = (int)gm.dhld("diga", dhlg(int ), (int)237);
                if (!var4_1) ** GOTO lbl60
                throw null;
            }
            case 29: {
                var3_2 /* !! */  = (int)gm.dhld("digb", dhlg(int ), (int)238);
                if (!var4_1) ** GOTO lbl104
                throw null;
            }
lbl185:
            // 4 sources

            case 30: {
                var3_2 /* !! */  = (int)gm.dhld("digc", dhlg(int ), (int)239);
                if (!var4_1) ** GOTO lbl75
                throw null;
            }
            case 31: {
                var3_2 /* !! */  = (int)gm.dhld("digd", dhlg(int ), (int)240);
                if (!var4_1) ** GOTO lbl117
                throw null;
            }
            case 32: 
        }
        var3_2 /* !! */  = (int)gm.dhld("dige", dhlg(int ), (int)241);
        ** while (!var4_1)
lbl196:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean shouldStartEating() {
        block96: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = gm.hj - gm.dhld("diae", dhmc(int ), (int)69)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  == gm.dhld("diaf", dhlg(int ), (int)123)) break;
                v0 /* !! */  = (long)gm.dhld("diag", dhlg(int ), (int)124);
            }
            var3_1 = gm.c;
            v1 /* !! */  = gm.hj;
            if (true) ** GOTO lbl11
            block64: while (true) {
                v1 /* !! */  = (long)(v2 - gm.dhld("diah", dhmc(int ), (int)70));
lbl11:
                // 2 sources

                switch ((int)v1 /* !! */ ) {
                    case -386976598: {
                        v2 = gm.dhld("diai", dhmc(int ), (int)71);
                        continue block64;
                    }
                    case -292276615: {
                        v2 = gm.dhld("diaj", dhmc(int ), (int)72);
                        continue block64;
                    }
                    case 989277410: {
                        break block64;
                    }
                    case 1933073315: {
                        v2 = gm.dhld("diak", dhmc(int ), (int)73);
                        continue block64;
                    }
                }
                break;
            }
            var2_2 /* !! */  = gm.b;
            v3 /* !! */  = gm.hj;
            if (true) ** GOTO lbl28
            block65: while (true) {
                v3 /* !! */  = (long)(v4 - gm.dhld("dial", dhmc(int ), (int)74));
lbl28:
                // 2 sources

                switch ((int)v3 /* !! */ ) {
                    case -1333993253: {
                        v4 = gm.dhld("diam", dhmc(int ), (int)75);
                        continue block65;
                    }
                    case 286362292: {
                        v4 = gm.dhld("dian", dhmc(int ), (int)76);
                        continue block65;
                    }
                    case 989277410: {
                        break block65;
                    }
                }
                break;
            }
            var1_3 = gm.a;
            if (var3_1) {
                throw null;
lbl40:
                // 8 sources

                return (boolean)gm.dhld("diao", dhlg(int ), (int)125);
            }
            if (var1_3 || var1_3) ** GOTO lbl40
            while (true) {
                if ((v5 /* !! */  = (cfr_temp_1 = gm.hj - gm.dhld("diap", dhmc(int ), (int)77)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v5 /* !! */  == gm.dhld("diaq", dhlg(int ), (int)126)) break;
                v5 /* !! */  = (long)gm.dhld("diar", dhlg(int ), (int)127);
            }
            v6 /* !! */  = gm.hj;
            if (true) ** GOTO lbl52
            block68: while (true) {
                v6 /* !! */  = (long)(gm.dhld("diat", dhmc(int ), (int)79) - gm.dhld("dias", dhmc(int ), (int)78));
lbl52:
                // 2 sources

                switch ((int)v6 /* !! */ ) {
                    case -145647876: {
                        continue block68;
                    }
                    case 989277410: {
                        break block68;
                    }
                }
                break;
            }
            v7 = gm.mc.field_1724;
            while (true) {
                if ((v8 /* !! */  = (cfr_temp_2 = gm.hj - gm.dhld("diau", dhmc(int ), (int)80)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v8 /* !! */  == gm.dhld("diav", dhlg(int ), (int)128)) break;
                v8 /* !! */  = (long)gm.dhld("diaw", dhlg(int ), (int)129);
            }
            if (v7.method_29504()) break block96;
            if (var1_3) ** GOTO lbl40
            while (true) {
                if ((v9 /* !! */  = (cfr_temp_3 = gm.hj - gm.dhld("diax", dhmc(int ), (int)81)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v9 /* !! */  == gm.dhld("diay", dhlg(int ), (int)130)) break;
                v9 /* !! */  = (long)gm.dhld("diaz", dhlg(int ), (int)131);
            }
            v10 /* !! */  = gm.hj;
            if (true) ** GOTO lbl74
            block71: while (true) {
                v10 /* !! */  = (long)(gm.dhld("dibb", dhmc(int ), (int)83) - gm.dhld("diba", dhmc(int ), (int)82));
lbl74:
                // 2 sources

                switch ((int)v10 /* !! */ ) {
                    case -1334872882: {
                        continue block71;
                    }
                    case 989277410: {
                        break block71;
                    }
                }
                break;
            }
            v11 = gm.mc.field_1724;
            v12 /* !! */  = gm.hj;
            if (true) ** GOTO lbl84
            block72: while (true) {
                v12 /* !! */  = (long)(v13 - gm.dhld("dibc", dhmc(int ), (int)84));
lbl84:
                // 2 sources

                switch ((int)v12 /* !! */ ) {
                    case 989277410: {
                        break block72;
                    }
                    case 1173413500: {
                        v13 = gm.dhld("dibd", dhmc(int ), (int)85);
                        continue block72;
                    }
                    case 1812312214: {
                        v13 = gm.dhld("dibe", dhmc(int ), (int)86);
                        continue block72;
                    }
                }
                break;
            }
            if (v11.method_6115()) break block96;
            if (var1_3) ** GOTO lbl40
            v14 /* !! */  = gm.hj;
            if (true) ** GOTO lbl99
            block73: while (true) {
                v14 /* !! */  = (long)(gm.dhld("dibg", dhmc(int ), (int)88) - gm.dhld("dibf", dhmc(int ), (int)87));
lbl99:
                // 2 sources

                switch ((int)v14 /* !! */ ) {
                    case 687203750: {
                        continue block73;
                    }
                    case 989277410: {
                        break block73;
                    }
                }
                break;
            }
            v15 /* !! */  = gm.hj;
            if (true) ** GOTO lbl108
            block74: while (true) {
                v15 /* !! */  = (long)(v16 - gm.dhld("dibh", dhmc(int ), (int)89));
lbl108:
                // 2 sources

                switch ((int)v15 /* !! */ ) {
                    case -2025821713: {
                        v16 = gm.dhld("dibi", dhmc(int ), (int)90);
                        continue block74;
                    }
                    case -477085195: {
                        v16 = gm.dhld("dibj", dhmc(int ), (int)91);
                        continue block74;
                    }
                    case 989277410: {
                        break block74;
                    }
                }
                break;
            }
            v17 = gm.mc.field_1724;
            while (true) {
                if ((v18 /* !! */  = (cfr_temp_4 = gm.hj - gm.dhld("dibk", dhmc(int ), (int)92)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                if (v18 /* !! */  == gm.dhld("dibl", dhlg(int ), (int)132)) break;
                v18 /* !! */  = (long)gm.dhld("dibm", dhlg(int ), (int)133);
            }
            v19 = v17.method_6032();
            while (true) {
                if ((v20 /* !! */  = (cfr_temp_5 = gm.hj - gm.dhld("dibn", dhmc(int ), (int)93)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                if (v20 /* !! */  == gm.dhld("dibo", dhlg(int ), (int)134)) break;
                v20 /* !! */  = (long)gm.dhld("dibp", dhlg(int ), (int)135);
            }
            while (true) {
                if ((v21 /* !! */  = (cfr_temp_6 = gm.hj - gm.dhld("dibq", dhmc(int ), (int)94)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                if (v21 /* !! */  == gm.dhld("dibr", dhlg(int ), (int)136)) break;
                v21 /* !! */  = (long)gm.dhld("dibs", dhlg(int ), (int)137);
            }
            if (!(v19 <= this.healthThreshold.getValue())) break block96;
            if (var1_3) ** GOTO lbl40
            while (true) {
                if ((v22 /* !! */  = (cfr_temp_7 = gm.hj - gm.dhld("dibt", dhmc(int ), (int)95)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                if (v22 /* !! */  == gm.dhld("dibu", dhlg(int ), (int)138)) break;
                v22 /* !! */  = (long)gm.dhld("dibv", dhlg(int ), (int)139);
            }
            v23 /* !! */  = gm.hj;
            if (true) ** GOTO lbl145
            block79: while (true) {
                v23 /* !! */  = (long)(gm.dhld("dibx", dhmc(int ), (int)97) - gm.dhld("dibw", dhmc(int ), (int)96));
lbl145:
                // 2 sources

                switch ((int)v23 /* !! */ ) {
                    case 951299509: {
                        continue block79;
                    }
                    case 989277410: {
                        break block79;
                    }
                }
                break;
            }
            v24 = gm.mc.field_1724;
            v25 /* !! */  = gm.hj;
            if (true) ** GOTO lbl155
            block80: while (true) {
                v25 /* !! */  = (long)(v26 - gm.dhld("diby", dhmc(int ), (int)98));
lbl155:
                // 2 sources

                switch ((int)v25 /* !! */ ) {
                    case -1603097554: {
                        v26 = gm.dhld("dibz", dhmc(int ), (int)99);
                        continue block80;
                    }
                    case -1371027095: {
                        v26 = gm.dhld("dica", dhmc(int ), (int)100);
                        continue block80;
                    }
                    case 989277410: {
                        break block80;
                    }
                    case 1283972847: {
                        v26 = gm.dhld("dicb", dhmc(int ), (int)101);
                        continue block80;
                    }
                }
                break;
            }
            v27 = v24.method_7344();
            v28 /* !! */  = gm.hj;
            if (true) ** GOTO lbl172
            block81: while (true) {
                v28 /* !! */  = (long)(v29 - gm.dhld("dicc", dhmc(int ), (int)102));
lbl172:
                // 2 sources

                switch ((int)v28 /* !! */ ) {
                    case -152188412: {
                        v29 = gm.dhld("dicd", dhmc(int ), (int)103);
                        continue block81;
                    }
                    case -100110234: {
                        v29 = gm.dhld("dice", dhmc(int ), (int)104);
                        continue block81;
                    }
                    case 130979205: {
                        v29 = gm.dhld("dicf", dhmc(int ), (int)105);
                        continue block81;
                    }
                    case 989277410: {
                        break block81;
                    }
                }
                break;
            }
            if (v27.method_7586() >= gm.dhld("dicg", dhlg(int ), (int)140)) break block96;
            if (var1_3) ** GOTO lbl40
            while (true) {
                if ((v30 /* !! */  = (cfr_temp_8 = gm.hj - gm.dhld("dich", dhmc(int ), (int)106)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                if (v30 /* !! */  == gm.dhld("dici", dhlg(int ), (int)141)) break;
                v30 /* !! */  = (long)gm.dhld("dicj", dhlg(int ), (int)142);
            }
            if (this.bestFood() == null) break block96;
            if (var1_3) ** GOTO lbl40
            v31 = gm.dhld("dick", dhlg(int ), (int)143);
            if (var3_1) {
                throw null;
            }
            ** GOTO lbl205
        }
        if (var1_3) ** GOTO lbl40
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var1_3) ** break;
                ** continue;
                v31 = gm.dhld("dicl", dhlg(int ), (int)144);
lbl205:
                // 2 sources

                return (boolean)v31;
            }
            case 0: {
                var2_2 /* !! */  = (int)gm.dhld("dicm", dhlg(int ), (int)145);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl234
            }
lbl211:
            // 3 sources

            case 1: {
                var2_2 /* !! */  = (int)gm.dhld("dicn", dhlg(int ), (int)146);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl225
            }
lbl216:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)gm.dhld("dico", dhlg(int ), (int)147);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl247
            }
lbl221:
            // 2 sources

            case 3: {
                var2_2 /* !! */  = (int)gm.dhld("dicp", dhlg(int ), (int)148);
                if (!var3_1) ** GOTO lbl216
                throw null;
            }
lbl225:
            // 2 sources

            case 4: {
                var2_2 /* !! */  = (int)gm.dhld("dicq", dhlg(int ), (int)149);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl234
            }
lbl230:
            // 2 sources

            case 5: {
                var2_2 /* !! */  = (int)gm.dhld("dicr", dhlg(int ), (int)150);
                if (!var3_1) ** GOTO lbl221
                throw null;
            }
lbl234:
            // 3 sources

            case 6: {
                var2_2 /* !! */  = (int)gm.dhld("dics", dhlg(int ), (int)151);
                if (!var3_1) ** GOTO lbl211
                throw null;
            }
lbl238:
            // 2 sources

            case 7: {
                var2_2 /* !! */  = (int)gm.dhld("dict", dhlg(int ), (int)152);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl247
            }
            case 8: {
                var2_2 /* !! */  = (int)gm.dhld("dicu", dhlg(int ), (int)153);
                if (!var3_1) ** GOTO lbl211
                throw null;
            }
lbl247:
            // 3 sources

            case 9: {
                var2_2 /* !! */  = (int)gm.dhld("dicv", dhlg(int ), (int)154);
                if (!var3_1) ** GOTO lbl238
                throw null;
            }
            case 10: {
                var2_2 /* !! */  = (int)gm.dhld("dicw", dhlg(int ), (int)155);
                if (!var3_1) ** GOTO lbl230
                throw null;
            }
            case 11: 
        }
        do {
            var2_2 /* !! */  = (int)gm.dhld("dicx", dhlg(int ), (int)156);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ void djhf() {
        gm.dhmk[200] = 6500624840527905626L;
        gm.dhmk[201] = 4891264572714345044L;
        gm.dhmk[202] = -7579252175326917124L;
        gm.dhmk[203] = 6852605565764332977L;
        gm.dhmk[204] = -7224437290419837378L;
        gm.dhmk[205] = 5194078629129095607L;
        gm.dhmk[206] = -4661561249678094777L;
        gm.dhmk[207] = -5440135381602801647L;
        gm.dhmk[208] = -2716687762187143155L;
        gm.dhmk[209] = 6584719944562367278L;
        gm.dhmk[210] = -226702220339597338L;
        gm.dhmk[211] = 1909640076525014663L;
        gm.dhmk[212] = -879780752224480364L;
        gm.dhmk[213] = -6786468360781052342L;
        gm.dhmk[214] = -5766771731276029218L;
        gm.dhmk[215] = -6810005177498505396L;
        gm.dhmk[216] = -1370437628028040336L;
        gm.dhmk[217] = -3443849420512023166L;
        gm.dhmk[218] = -3542866036532008358L;
        gm.dhmk[219] = -832246902510678766L;
        gm.dhmk[220] = 1535434715250754175L;
        gm.dhmk[221] = -6573762691239402635L;
        gm.dhmk[222] = -4523003912330576814L;
        gm.dhmk[223] = -8378504597248959013L;
        gm.dhmk[224] = -3874825357276977132L;
        gm.dhmk[225] = 863808559109421040L;
        gm.dhmk[226] = 3359846753521370294L;
        gm.dhmk[227] = 5724305706529854592L;
        gm.dhmk[228] = 1129140201885605357L;
        gm.dhmk[229] = -4595021093986615185L;
        gm.dhmk[230] = 2135635243648512957L;
        gm.dhmk[231] = -3838712095059100230L;
        gm.dhmk[232] = -6513024703982864443L;
        gm.dhmk[233] = 1415194027042492516L;
        gm.dhmk[234] = 1567034531977061438L;
        gm.dhmk[235] = -3724086114767997354L;
        gm.dhmk[236] = -2173047388604784212L;
        gm.dhmk[237] = 6044912768043008811L;
        gm.dhmk[238] = 4704331520841935063L;
        gm.dhmk[239] = 6482182972670214210L;
        gm.dhmk[240] = 2361285075302337014L;
        gm.dhmk[241] = 5711650404265322469L;
        gm.dhmk[242] = 6450784050105847103L;
        gm.dhmk[243] = 5313407245665983368L;
        gm.dhmk[244] = 1982131176679634508L;
        gm.dhmk[245] = -8960881582216015692L;
        gm.dhmk[246] = -7125062825851405012L;
        gm.dhmk[247] = -1051732290123692061L;
        gm.dhmk[248] = 8542294419764535174L;
        gm.dhmk[249] = -553967067612988434L;
        gm.dhmk[250] = -5301729926717092909L;
        gm.dhmk[251] = -6187133480434782344L;
        gm.dhmk[252] = 188346485652549434L;
        gm.dhmk[253] = 6246388704597567340L;
        gm.dhmk[254] = -7433342611075889274L;
        gm.dhmk[255] = 5825001026991193520L;
        gm.dhmk[256] = 2193706287653276768L;
        gm.dhmk[257] = 9146588524135825212L;
        gm.dhmk[258] = 5830058316947146439L;
        gm.dhmk[259] = 3373841112432049713L;
        gm.dhmk[260] = 9010708915033246555L;
        gm.dhmk[261] = -6215833645525021706L;
        gm.dhmk[262] = -3182204272739334033L;
        gm.dhmk[263] = -698987671553912012L;
        gm.dhmk[264] = -8623613547580693076L;
        gm.dhmk[265] = -5080625596393393873L;
        gm.dhmk[266] = 8863834354016534858L;
        gm.dhmk[267] = 8297042315038348145L;
        gm.dhmk[268] = 6390800859325732665L;
        gm.dhmk[269] = 5338347344185481365L;
        gm.dhmk[270] = -8273741565773531949L;
        gm.dhmk[271] = 2783179935889898666L;
        gm.dhmk[272] = -5598559349624272071L;
        gm.dhmk[273] = 2435332206361170612L;
        gm.dhmk[274] = -6158729888911820427L;
        gm.dhmk[275] = 9077656366382710527L;
        gm.dhmk[276] = 893317447716902279L;
        gm.dhmk[277] = -3146783847079880654L;
        gm.dhmk[278] = -6603157571090824620L;
        gm.dhmk[279] = -8470692811155592803L;
        gm.dhmk[280] = -3419918727794797300L;
        gm.dhmk[281] = -4316578156135360949L;
        gm.dhmk[282] = 7848654954837299017L;
        gm.dhmk[283] = -335208717656622356L;
        gm.dhmk[284] = 2972217109448332624L;
        gm.dhmk[285] = 4424037509597680199L;
        gm.dhmk[286] = 4520435040850516417L;
        gm.dhmk[287] = -8070136903140103855L;
        gm.dhmk[288] = -5998754844962565469L;
        gm.dhmk[289] = 3337545793068100354L;
        gm.dhmk[290] = 8122445826850487508L;
        gm.dhmk[291] = -1515638468456895702L;
        gm.dhmk[292] = 7325959298638136374L;
        gm.dhmk[293] = -5292433423793228570L;
        gm.dhmk[294] = -6415103678186386456L;
        gm.dhmk[295] = -8676001550515275634L;
    }
}

