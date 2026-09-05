/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1268
 *  net.minecraft.class_1297
 *  net.minecraft.class_1747
 *  net.minecraft.class_1934
 *  net.minecraft.class_2338
 *  net.minecraft.class_2350
 *  net.minecraft.class_239$class_240
 *  net.minecraft.class_243
 *  net.minecraft.class_304
 *  net.minecraft.class_310
 *  net.minecraft.class_3532
 *  net.minecraft.class_3675$class_306
 *  net.minecraft.class_3959
 *  net.minecraft.class_3959$class_242
 *  net.minecraft.class_3959$class_3960
 *  net.minecraft.class_3965
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.minecraft.class_1268;
import net.minecraft.class_1297;
import net.minecraft.class_1747;
import net.minecraft.class_1934;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_239;
import net.minecraft.class_243;
import net.minecraft.class_304;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import net.minecraft.class_3675;
import net.minecraft.class_3959;
import net.minecraft.class_3965;
import ruhack.phobia.aw;
import ruhack.phobia.df;
import ruhack.phobia.ds;
import ruhack.phobia.du;
import ruhack.phobia.gc$1;
import ruhack.phobia.hz;
import ruhack.phobia.nn;
import ruhack.phobia.os;
import ruhack.phobia.ot;
import ruhack.phobia.ov;

public class gc
extends ds {
    private float stableYaw;
    private int oldSlot;
    private int lockedBlockSlot;
    private long lastRightClickTime;
    public static final boolean c;
    private static long[] iykk;
    private long enableTimeMs;
    public static final boolean a;
    private static int[] iykp;
    public static final int b;
    private static int[] iykq;
    static final long qv = -2214557435008347369L;
    private static long[] iykj;

    private static /* synthetic */ void izuo() {
        gc.iykp[300] = -1429618511;
        gc.iykp[301] = 996594568;
        gc.iykp[302] = 1079937241;
        gc.iykp[303] = -131614917;
        gc.iykp[304] = -941479866;
        gc.iykp[305] = 2044911497;
        gc.iykp[306] = -1232709592;
        gc.iykp[307] = -539020550;
        gc.iykp[308] = 1632318062;
        gc.iykp[309] = -1264346764;
        gc.iykp[310] = -2065382184;
        gc.iykp[311] = -150640592;
        gc.iykp[312] = -227958264;
        gc.iykp[313] = -123023848;
        gc.iykp[314] = 478207245;
        gc.iykp[315] = -1280771309;
        gc.iykp[316] = -710100661;
        gc.iykp[317] = 690821323;
        gc.iykp[318] = 1616905416;
        gc.iykp[319] = 169037564;
        gc.iykp[320] = 1722461812;
        gc.iykp[321] = 1309021455;
        gc.iykp[322] = -482629740;
        gc.iykp[323] = 1105624684;
        gc.iykp[324] = -99373640;
        gc.iykp[325] = 1111166658;
        gc.iykp[326] = -204461267;
        gc.iykp[327] = 438017498;
        gc.iykp[328] = 118301066;
        gc.iykp[329] = -1756506824;
        gc.iykp[330] = 932181651;
        gc.iykp[331] = -1883928710;
        gc.iykp[332] = -1737609283;
        gc.iykp[333] = -635989135;
        gc.iykp[334] = 1155441943;
        gc.iykp[335] = 1300019213;
        gc.iykp[336] = 1450287777;
        gc.iykp[337] = -1627532305;
        gc.iykp[338] = -1817857582;
        gc.iykp[339] = -1070496800;
        gc.iykp[340] = -1614506752;
        gc.iykp[341] = -648650630;
        gc.iykp[342] = 212907272;
        gc.iykp[343] = 474850692;
        gc.iykp[344] = 1685318786;
        gc.iykp[345] = -916970631;
        gc.iykp[346] = -189549853;
        gc.iykp[347] = -1117694982;
        gc.iykp[348] = 554800420;
        gc.iykp[349] = -247663252;
        gc.iykp[350] = 1055364576;
        gc.iykp[351] = 1275786155;
        gc.iykp[352] = 2124515893;
        gc.iykp[353] = -1144000546;
        gc.iykp[354] = 1458002253;
        gc.iykp[355] = 888546411;
        gc.iykp[356] = -275895293;
        gc.iykp[357] = 505177708;
        gc.iykp[358] = -597432918;
        gc.iykp[359] = -1690549510;
        gc.iykp[360] = 1742947300;
        gc.iykp[361] = 319877881;
        gc.iykp[362] = 1002965445;
        gc.iykp[363] = 14303976;
        gc.iykp[364] = -1496913526;
        gc.iykp[365] = 229528554;
        gc.iykp[366] = 709909852;
        gc.iykp[367] = -1924504345;
        gc.iykp[368] = 1006240713;
        gc.iykp[369] = -1531763669;
        gc.iykp[370] = 876987662;
        gc.iykp[371] = -1650954534;
        gc.iykp[372] = 1140920719;
        gc.iykp[373] = 1077771791;
        gc.iykp[374] = 596840349;
        gc.iykp[375] = 1017405220;
        gc.iykp[376] = 1580613545;
        gc.iykp[377] = -1315454810;
        gc.iykp[378] = 2089153327;
        gc.iykp[379] = -1599057593;
        gc.iykp[380] = 575398402;
        gc.iykp[381] = -40656235;
        gc.iykp[382] = 1399820538;
        gc.iykp[383] = -569827448;
        gc.iykp[384] = 1650883484;
        gc.iykp[385] = 105361954;
        gc.iykp[386] = 955691722;
        gc.iykp[387] = -1701816508;
        gc.iykp[388] = -1403587973;
        gc.iykp[389] = 1428009545;
        gc.iykp[390] = -964966048;
        gc.iykp[391] = 1384356502;
        gc.iykp[392] = 645760693;
        gc.iykp[393] = -1758918938;
        gc.iykp[394] = 2075305385;
        gc.iykp[395] = 479471700;
        gc.iykp[396] = 1856815157;
        gc.iykp[397] = 1696993236;
        gc.iykp[398] = -583571142;
        gc.iykp[399] = 158298758;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private float getMovementBasedYaw() {
        block63: {
            var9_1 = gc.c;
            var8_2 /* !! */  = gc.b;
            var7_3 = gc.a;
            if (var9_1) {
                throw null;
lbl6:
                // 16 sources

                return (float)gc.iykl("izlk", iyko(int ), (int)422);
            }
            if (var7_3 || var7_3) ** GOTO lbl6
            var1_4 = class_310.method_1551();
            if (var7_3 || var7_3) ** GOTO lbl6
            if (var1_4.field_1724 != null) break block63;
            if (var7_3) ** GOTO lbl6
            return (float)gc.iykl("izll", iyko(int ), (int)423);
        }
        if (var7_3 || var7_3) ** GOTO lbl6
        var2_5 = this.getMovementInput();
        if (var7_3) ** GOTO lbl6
        if (var8_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var8_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var7_3) ** GOTO lbl6
                if (!(var2_5.method_1027() < gc.iykl("izlm", iyuo(int ), (int)156))) ** GOTO lbl25
                if (var7_3 || var7_3) ** GOTO lbl6
                return this.stableYaw;
lbl25:
                // 1 sources

                if (var7_3 || var7_3) ** GOTO lbl6
                var3_6 = var2_5.field_1352;
                if (var7_3 || var7_3) ** GOTO lbl6
                var5_7 = var2_5.field_1350;
                if (var7_3 || var7_3) ** GOTO lbl6
                if (!(Math.abs(var3_6) > Math.abs(var5_7))) ** GOTO lbl37
                if (var7_3 || var7_3) ** GOTO lbl6
                if (!(var3_6 > 0.0)) ** GOTO lbl35
                if (var7_3) ** GOTO lbl6
                return (float)gc.iykl("izln", iyko(int ), (int)424);
lbl35:
                // 1 sources

                if (var7_3 || var7_3) ** GOTO lbl6
                return (float)gc.iykl("izlo", iyko(int ), (int)425);
lbl37:
                // 1 sources

                if (var7_3 || var7_3) ** GOTO lbl6
                if (!(var5_7 > 0.0)) ** GOTO lbl41
                if (var7_3) ** GOTO lbl6
                return (float)gc.iykl("izlp", iyko(int ), (int)426);
lbl41:
                // 1 sources

                if (!var7_3 && !var7_3) ** break;
                ** continue;
                return 0.0f;
            }
lbl44:
            // 3 sources

            case 0: {
                var8_2 /* !! */  = (int)gc.iykl("izlq", iyks(int ), (int)427);
                if (var9_1) {
                    throw null;
                }
                ** GOTO lbl167
            }
lbl49:
            // 2 sources

            case 1: {
                var8_2 /* !! */  = (int)gc.iykl("izlr", iyks(int ), (int)428);
                if (var9_1) {
                    throw null;
                }
                ** GOTO lbl115
            }
lbl54:
            // 2 sources

            case 2: {
                var8_2 /* !! */  = (int)gc.iykl("izls", iyks(int ), (int)429);
                if (var9_1) {
                    throw null;
                }
                ** GOTO lbl93
            }
            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var8_2 /* !! */  = (int)gc.iykl("izlt", iyks(int ), (int)430);
                    if (var9_1) {
                        throw null;
                    }
                    ** GOTO lbl89
                    break;
                }
            }
lbl65:
            // 2 sources

            case 4: {
                var8_2 /* !! */  = (int)gc.iykl("izlu", iyks(int ), (int)431);
                if (var9_1) {
                    throw null;
                }
                ** GOTO lbl167
            }
lbl70:
            // 5 sources

            case 5: {
                var8_2 /* !! */  = (int)gc.iykl("izlv", iyks(int ), (int)432);
                if (!var9_1) ** GOTO lbl54
                throw null;
            }
            case 6: {
                var8_2 /* !! */  = (int)gc.iykl("izlw", iyks(int ), (int)433);
                if (var9_1) {
                    throw null;
                }
                ** GOTO lbl124
            }
            case 7: {
                var8_2 /* !! */  = (int)gc.iykl("izlx", iyks(int ), (int)434);
                if (var9_1) {
                    throw null;
                }
                ** GOTO lbl124
            }
            case 8: {
                var8_2 /* !! */  = (int)gc.iykl("izly", iyks(int ), (int)435);
                if (var9_1) {
                    throw null;
                }
                ** GOTO lbl155
            }
lbl89:
            // 2 sources

            case 9: {
                var8_2 /* !! */  = (int)gc.iykl("izlz", iyks(int ), (int)436);
                if (!var9_1) ** GOTO lbl70
                throw null;
            }
lbl93:
            // 3 sources

            case 10: {
                var8_2 /* !! */  = (int)gc.iykl("izma", iyks(int ), (int)437);
                if (!var9_1) ** GOTO lbl44
                throw null;
            }
            case 11: {
                var8_2 /* !! */  = (int)gc.iykl("izmb", iyks(int ), (int)438);
                if (!var9_1) ** GOTO lbl70
                throw null;
            }
            case 12: {
                var8_2 /* !! */  = (int)gc.iykl("izmc", iyks(int ), (int)439);
                if (var9_1) {
                    throw null;
                }
                ** GOTO lbl163
            }
            case 13: {
                var8_2 /* !! */  = (int)gc.iykl("izmd", iyks(int ), (int)440);
                if (!var9_1) ** GOTO lbl70
                throw null;
            }
            case 14: {
                var8_2 /* !! */  = (int)gc.iykl("izme", iyks(int ), (int)441);
                if (var9_1) {
                    throw null;
                }
                ** GOTO lbl150
            }
lbl115:
            // 3 sources

            case 15: {
                var8_2 /* !! */  = (int)gc.iykl("izmf", iyks(int ), (int)442);
                if (var9_1) {
                    throw null;
                }
                ** GOTO lbl163
            }
            case 16: {
                var8_2 /* !! */  = (int)gc.iykl("izmg", iyks(int ), (int)443);
                if (!var9_1) ** GOTO lbl115
                throw null;
            }
lbl124:
            // 4 sources

            case 17: {
                var8_2 /* !! */  = (int)gc.iykl("izmh", iyks(int ), (int)444);
                if (!var9_1) ** GOTO lbl49
                throw null;
            }
lbl128:
            // 3 sources

            case 18: {
                var8_2 /* !! */  = (int)gc.iykl("izmi", iyks(int ), (int)445);
                if (var9_1) {
                    throw null;
                }
                ** GOTO lbl159
            }
            case 19: {
                var8_2 /* !! */  = (int)gc.iykl("izmj", iyks(int ), (int)446);
                if (var9_1) {
                    throw null;
                }
                ** GOTO lbl142
            }
            case 20: {
                var8_2 /* !! */  = (int)gc.iykl("izmk", iyks(int ), (int)447);
                if (!var9_1) ** GOTO lbl128
                throw null;
            }
lbl142:
            // 3 sources

            case 21: {
                var8_2 /* !! */  = (int)gc.iykl("izml", iyks(int ), (int)448);
                if (!var9_1) ** GOTO lbl93
                throw null;
            }
            case 22: {
                var8_2 /* !! */  = (int)gc.iykl("izmm", iyks(int ), (int)449);
                if (!var9_1) ** GOTO lbl65
                throw null;
            }
lbl150:
            // 3 sources

            case 23: {
                do {
                    var8_2 /* !! */  = (int)gc.iykl("izmn", iyks(int ), (int)450);
                } while (!var9_1);
                throw null;
            }
lbl155:
            // 2 sources

            case 24: {
                var8_2 /* !! */  = (int)gc.iykl("izmo", iyks(int ), (int)451);
                if (!var9_1) ** GOTO lbl142
                throw null;
            }
lbl159:
            // 2 sources

            case 25: {
                var8_2 /* !! */  = (int)gc.iykl("izmp", iyks(int ), (int)452);
                if (!var9_1) ** GOTO lbl70
                throw null;
            }
lbl163:
            // 4 sources

            case 26: {
                var8_2 /* !! */  = (int)gc.iykl("izmq", iyks(int ), (int)453);
                if (!var9_1) ** GOTO lbl128
                throw null;
            }
lbl167:
            // 3 sources

            case 27: {
                var8_2 /* !! */  = (int)gc.iykl("izmr", iyks(int ), (int)454);
                if (!var9_1) ** GOTO lbl44
                throw null;
            }
            case 28: {
                var8_2 /* !! */  = (int)gc.iykl("izms", iyks(int ), (int)455);
                if (!var9_1) ** GOTO lbl124
                throw null;
            }
            case 29: {
                var8_2 /* !! */  = (int)gc.iykl("izmt", iyks(int ), (int)456);
                if (!var9_1) ** GOTO lbl163
                throw null;
            }
            case 30: {
                var8_2 /* !! */  = (int)gc.iykl("izmu", iyks(int ), (int)457);
                if (!var9_1) ** GOTO lbl150
                throw null;
            }
            case 31: 
        }
        var8_2 /* !! */  = (int)gc.iykl("izmv", iyks(int ), (int)458);
        ** while (!var9_1)
lbl186:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void izva() {
        gc.iykj[100] = -6888126258535060301L;
        gc.iykj[101] = 5607126464606061601L;
        gc.iykj[102] = 8157192039175704750L;
        gc.iykj[103] = -4092874735212200237L;
        gc.iykj[104] = 7749010393287419079L;
        gc.iykj[105] = -3423827284473467518L;
        gc.iykj[106] = -6514976036949686361L;
        gc.iykj[107] = -5963108434253489640L;
        gc.iykj[108] = -8936089767260264375L;
        gc.iykj[109] = 7714073635510241936L;
        gc.iykj[110] = 4374773648557097955L;
        gc.iykj[111] = -2726938300186389776L;
        gc.iykj[112] = 5439914785316963040L;
        gc.iykj[113] = -498863148682116300L;
        gc.iykj[114] = 4776537141900533031L;
        gc.iykj[115] = 6634469268480916892L;
        gc.iykj[116] = -1530611445102282979L;
        gc.iykj[117] = 1125670466940244986L;
        gc.iykj[118] = 5108056447275727384L;
        gc.iykj[119] = 8439183288597881970L;
        gc.iykj[120] = -693254777621960254L;
        gc.iykj[121] = -4560027100037423327L;
        gc.iykj[122] = 3332676728619259178L;
        gc.iykj[123] = 1000149217547623579L;
        gc.iykj[124] = 8222169531215860267L;
        gc.iykj[125] = 5198745406120748282L;
        gc.iykj[126] = 1676258381467969881L;
        gc.iykj[127] = 6710044866945863093L;
        gc.iykj[128] = 8697533888104797579L;
        gc.iykj[129] = 4646780351791952588L;
        gc.iykj[130] = -4249784083979076392L;
        gc.iykj[131] = -8390080427443316377L;
        gc.iykj[132] = -1163785720297740176L;
        gc.iykj[133] = -778555783598257113L;
        gc.iykj[134] = 7586882745913751853L;
        gc.iykj[135] = 2155249806443933655L;
        gc.iykj[136] = -7931937841838340120L;
        gc.iykj[137] = 2214299346113457025L;
        gc.iykj[138] = -8703406841710929296L;
        gc.iykj[139] = 6750824972061398461L;
        gc.iykj[140] = 8498856584268205340L;
        gc.iykj[141] = -2723933467314621144L;
        gc.iykj[142] = 8218144350146788276L;
        gc.iykj[143] = 8245581885235637623L;
        gc.iykj[144] = -1820071279743570175L;
        gc.iykj[145] = -1069654707786506584L;
        gc.iykj[146] = -6718079154841828771L;
        gc.iykj[147] = 7800008146089832249L;
        gc.iykj[148] = 2062203218254076674L;
        gc.iykj[149] = 1826826756113506314L;
        gc.iykj[150] = -2508550997144237063L;
        gc.iykj[151] = 1549703097623435356L;
        gc.iykj[152] = 2214770285567797060L;
        gc.iykj[153] = 7939127111229052132L;
        gc.iykj[154] = -3715656305171666933L;
        gc.iykj[155] = 5554900295623402142L;
        gc.iykj[156] = 7273435675796366224L;
        gc.iykj[157] = -5256564281331212851L;
        gc.iykj[158] = -3905848513117038994L;
        gc.iykj[159] = -1887607454956771193L;
        gc.iykj[160] = 2466946334686765885L;
        gc.iykj[161] = 6082755611379647712L;
        gc.iykj[162] = -1660413715265645626L;
        gc.iykj[163] = 8323702391440601602L;
        gc.iykj[164] = 5206500320089347755L;
        gc.iykj[165] = -3849352972663622443L;
        gc.iykj[166] = 3992386083595048937L;
        gc.iykj[167] = -7093381430685649431L;
        gc.iykj[168] = 2101966560908298629L;
        gc.iykj[169] = -749880485131384019L;
        gc.iykj[170] = -5409178437854044931L;
        gc.iykj[171] = 2749668281845554058L;
        gc.iykj[172] = 752057666349583916L;
        gc.iykj[173] = 9197756898819987425L;
        gc.iykj[174] = 6679984752893920241L;
        gc.iykj[175] = -1924881830955633181L;
        gc.iykj[176] = 3029227980710586619L;
        gc.iykj[177] = -8770060472469221623L;
        gc.iykj[178] = -7387910001443778335L;
        gc.iykj[179] = 353004554272654004L;
        gc.iykj[180] = -1391520515389404593L;
        gc.iykj[181] = 1846247241622436827L;
        gc.iykj[182] = 1479814276266490374L;
        gc.iykj[183] = -1660634566552900996L;
        gc.iykj[184] = -8937418726403940467L;
        gc.iykj[185] = 7305481824870016735L;
        gc.iykj[186] = -1748618772698842879L;
        gc.iykj[187] = -9092815825929605388L;
        gc.iykj[188] = -651112615278020023L;
        gc.iykj[189] = -1088266489621020223L;
        gc.iykj[190] = 1273846557110806137L;
        gc.iykj[191] = -2653499361759306026L;
        gc.iykj[192] = 4030156764408914963L;
        gc.iykj[193] = 8413693310515619606L;
        gc.iykj[194] = -3186020193245129778L;
        gc.iykj[195] = -3304522266168169536L;
        gc.iykj[196] = -3559187195942079547L;
        gc.iykj[197] = -8995850280263335383L;
        gc.iykj[198] = -163586775561165228L;
        gc.iykj[199] = 1678772046107263950L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void deactivate() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = gc.qv - gc.iykl("iynz", iyki(int ), (int)41)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == gc.iykl("iyoa", iyks(int ), (int)46)) break;
            v0 /* !! */  = (long)gc.iykl("iyob", iyks(int ), (int)47);
        }
        var4_1 = gc.c;
        v1 /* !! */  = gc.qv;
        if (true) ** GOTO lbl11
        block62: while (true) {
            v1 /* !! */  = (long)(v2 - gc.iykl("iyoc", iyki(int ), (int)42));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1392315599: {
                    v2 = gc.iykl("iyod", iyki(int ), (int)43);
                    continue block62;
                }
                case -44466360: {
                    v2 = gc.iykl("iyoe", iyki(int ), (int)44);
                    continue block62;
                }
                case -6253801: {
                    break block62;
                }
                case 1178284842: {
                    v2 = gc.iykl("iyof", iyki(int ), (int)45);
                    continue block62;
                }
            }
            break;
        }
        var3_2 /* !! */  = gc.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = gc.qv - gc.iykl("iyog", iyki(int ), (int)46)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == gc.iykl("iyoh", iyks(int ), (int)48)) break;
            v3 /* !! */  = (long)gc.iykl("iyoi", iyks(int ), (int)49);
        }
        var2_3 = gc.a;
        if (var4_1) {
            throw null;
lbl32:
            // 11 sources

            return;
        }
        if (var2_3 || var2_3) ** GOTO lbl32
        v4 /* !! */  = gc.qv;
        if (true) ** GOTO lbl39
        block65: while (true) {
            v4 /* !! */  = (long)(gc.iykl("iyok", iyki(int ), (int)48) - gc.iykl("iyoj", iyki(int ), (int)47));
lbl39:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -6253801: {
                    break block65;
                }
                case 1928568830: {
                    continue block65;
                }
            }
            break;
        }
        var1_4 = class_310.method_1551();
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_3 || var2_3) ** GOTO lbl32
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_2 = gc.qv - gc.iykl("iyol", iyki(int ), (int)49)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == gc.iykl("iyom", iyks(int ), (int)50)) break;
                    v5 /* !! */  = (long)gc.iykl("iyon", iyks(int ), (int)51);
                }
                if (var1_4.field_1724 == null) ** GOTO lbl115
                if (var2_3 || var2_3) ** GOTO lbl32
                v6 /* !! */  = gc.qv;
                if (true) ** GOTO lbl60
                block67: while (true) {
                    v6 /* !! */  = (long)(gc.iykl("iyop", iyki(int ), (int)51) - gc.iykl("iyoo", iyki(int ), (int)50));
lbl60:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -6253801: {
                            break block67;
                        }
                        case 1274141011: {
                            continue block67;
                        }
                    }
                    break;
                }
                v7 = var1_4.field_1724;
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_3 = gc.qv - gc.iykl("iyoq", iyki(int ), (int)52)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == gc.iykl("iyor", iyks(int ), (int)52)) break;
                    v8 /* !! */  = (long)gc.iykl("iyos", iyks(int ), (int)53);
                }
                v9 = v7.method_31548();
                v10 /* !! */  = gc.qv;
                if (true) ** GOTO lbl76
                block69: while (true) {
                    v10 /* !! */  = (long)(v11 - gc.iykl("iyot", iyki(int ), (int)53));
lbl76:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -503360036: {
                            v11 = gc.iykl("iyou", iyki(int ), (int)54);
                            continue block69;
                        }
                        case -351327759: {
                            v11 = gc.iykl("iyov", iyki(int ), (int)55);
                            continue block69;
                        }
                        case -6253801: {
                            break block69;
                        }
                        case 688550878: {
                            v11 = gc.iykl("iyow", iyki(int ), (int)56);
                            continue block69;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_4 = gc.qv - gc.iykl("iyox", iyki(int ), (int)57)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == gc.iykl("iyoy", iyks(int ), (int)54)) break;
                    v12 /* !! */  = (long)gc.iykl("iyoz", iyks(int ), (int)55);
                }
                v9.method_61496(this.oldSlot);
                if (var2_3 || var2_3) ** GOTO lbl32
                while (true) {
                    if ((v13 /* !! */  = (cfr_temp_5 = gc.qv - gc.iykl("iypa", iyki(int ), (int)58)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v13 /* !! */  == gc.iykl("iypb", iyks(int ), (int)56)) break;
                    v13 /* !! */  = (long)gc.iykl("iypc", iyks(int ), (int)57);
                }
                v14 = var1_4.field_1690;
                while (true) {
                    if ((v15 /* !! */  = (cfr_temp_6 = gc.qv - gc.iykl("iypd", iyki(int ), (int)59)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v15 /* !! */  == gc.iykl("iype", iyks(int ), (int)58)) break;
                    v15 /* !! */  = (long)gc.iykl("iypf", iyks(int ), (int)59);
                }
                v16 = v14.field_1832;
                v17 = gc.iykl("iypg", iyks(int ), (int)60);
                while (true) {
                    if ((v18 /* !! */  = (cfr_temp_7 = gc.qv - gc.iykl("iyph", iyki(int ), (int)60)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v18 /* !! */  == gc.iykl("iypi", iyks(int ), (int)61)) break;
                    v18 /* !! */  = (long)gc.iykl("iypj", iyks(int ), (int)62);
                }
                v16.method_23481((boolean)v17);
                if (var2_3) ** GOTO lbl32
lbl115:
                // 2 sources

                if (var2_3 || var2_3) ** GOTO lbl32
                v19 = gc.iykl("iypk", iyks(int ), (int)63);
                v20 /* !! */  = gc.qv;
                if (true) ** GOTO lbl121
                block74: while (true) {
                    v20 /* !! */  = (long)(v21 - gc.iykl("iypl", iyki(int ), (int)61));
lbl121:
                    // 2 sources

                    switch ((int)v20 /* !! */ ) {
                        case -183935736: {
                            v21 = gc.iykl("iypm", iyki(int ), (int)62);
                            continue block74;
                        }
                        case -6253801: {
                            break block74;
                        }
                        case 2047305524: {
                            v21 = gc.iykl("iypn", iyki(int ), (int)63);
                            continue block74;
                        }
                    }
                    break;
                }
                this.oldSlot = (int)v19;
                if (var2_3 || var2_3) ** GOTO lbl32
                v22 = gc.iykl("iypo", iyks(int ), (int)64);
                v23 /* !! */  = gc.qv;
                if (true) ** GOTO lbl137
                block75: while (true) {
                    v23 /* !! */  = (long)(v24 - gc.iykl("iypp", iyki(int ), (int)64));
lbl137:
                    // 2 sources

                    switch ((int)v23 /* !! */ ) {
                        case -1079564854: {
                            v24 = gc.iykl("iypq", iyki(int ), (int)65);
                            continue block75;
                        }
                        case -67959229: {
                            v24 = gc.iykl("iypr", iyki(int ), (int)66);
                            continue block75;
                        }
                        case -6253801: {
                            break block75;
                        }
                    }
                    break;
                }
                this.lockedBlockSlot = (int)v22;
                if (var2_3 || var2_3) ** GOTO lbl32
                v25 = gc.iykl("iyps", iyki(int ), (int)67);
                while (true) {
                    if ((v26 /* !! */  = (cfr_temp_8 = gc.qv - gc.iykl("iypt", iyki(int ), (int)68)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v26 /* !! */  == gc.iykl("iypu", iyks(int ), (int)65)) break;
                    v26 /* !! */  = (long)gc.iykl("iypv", iyks(int ), (int)66);
                }
                this.lastRightClickTime = (long)v25;
                if (var2_3 || var2_3) ** GOTO lbl32
                v27 = gc.iykl("iypw", iyki(int ), (int)69);
                v28 /* !! */  = gc.qv;
                if (true) ** GOTO lbl161
                block77: while (true) {
                    v28 /* !! */  = (long)(v29 - gc.iykl("iypx", iyki(int ), (int)70));
lbl161:
                    // 2 sources

                    switch ((int)v28 /* !! */ ) {
                        case -6253801: {
                            break block77;
                        }
                        case 45693056: {
                            v29 = gc.iykl("iypy", iyki(int ), (int)71);
                            continue block77;
                        }
                        case 1245402777: {
                            v29 = gc.iykl("iypz", iyki(int ), (int)72);
                            continue block77;
                        }
                        case 1426413433: {
                            v29 = gc.iykl("iyqa", iyki(int ), (int)73);
                            continue block77;
                        }
                    }
                    break;
                }
                this.enableTimeMs = (long)v27;
                if (var2_3 || var2_3) ** GOTO lbl32
                while (true) {
                    if ((v30 /* !! */  = (cfr_temp_9 = gc.qv - gc.iykl("iyqb", iyki(int ), (int)74)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                    if (v30 /* !! */  == gc.iykl("iyqc", iyks(int ), (int)67)) break;
                    v30 /* !! */  = (long)gc.iykl("iyqd", iyks(int ), (int)68);
                }
                super.deactivate();
                if (!var2_3 && !var2_3) ** break;
                ** continue;
                return;
            }
lbl184:
            // 2 sources

            case 0: {
                var3_2 /* !! */  = (int)gc.iykl("iyqe", iyks(int ), (int)69);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl276
            }
lbl189:
            // 2 sources

            case 1: {
                var3_2 /* !! */  = (int)gc.iykl("iyqf", iyks(int ), (int)70);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl238
            }
lbl194:
            // 2 sources

            case 2: {
                do {
                    var3_2 /* !! */  = (int)gc.iykl("iyqg", iyks(int ), (int)71);
                } while (!var4_1);
                throw null;
            }
lbl199:
            // 2 sources

            case 3: {
                var3_2 /* !! */  = (int)gc.iykl("iyqh", iyks(int ), (int)72);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl214
            }
            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_2 /* !! */  = (int)gc.iykl("iyqi", iyks(int ), (int)73);
                    if (!var4_1) ** GOTO lbl189
                    throw null;
                }
            }
            case 5: {
                var3_2 /* !! */  = (int)gc.iykl("iyqj", iyks(int ), (int)74);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl229
            }
lbl214:
            // 2 sources

            case 6: {
                var3_2 /* !! */  = (int)gc.iykl("iyqk", iyks(int ), (int)75);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl272
            }
lbl219:
            // 3 sources

            case 7: {
                var3_2 /* !! */  = (int)gc.iykl("iyql", iyks(int ), (int)76);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl268
            }
lbl224:
            // 3 sources

            case 8: {
                var3_2 /* !! */  = (int)gc.iykl("iyqm", iyks(int ), (int)77);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl276
            }
lbl229:
            // 3 sources

            case 9: {
                var3_2 /* !! */  = (int)gc.iykl("iyqn", iyks(int ), (int)78);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl247
            }
            case 10: {
                var3_2 /* !! */  = (int)gc.iykl("iyqo", iyks(int ), (int)79);
                if (!var4_1) ** GOTO lbl219
                throw null;
            }
lbl238:
            // 3 sources

            case 11: {
                var3_2 /* !! */  = (int)gc.iykl("iyqp", iyks(int ), (int)80);
                if (!var4_1) ** GOTO lbl219
                throw null;
            }
            case 12: {
                var3_2 /* !! */  = (int)gc.iykl("iyqq", iyks(int ), (int)81);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl268
            }
lbl247:
            // 2 sources

            case 13: {
                var3_2 /* !! */  = (int)gc.iykl("iyqr", iyks(int ), (int)82);
                if (!var4_1) ** GOTO lbl199
                throw null;
            }
            case 14: {
                var3_2 /* !! */  = (int)gc.iykl("iyqs", iyks(int ), (int)83);
                if (!var4_1) ** GOTO lbl229
                throw null;
            }
            case 15: {
                var3_2 /* !! */  = (int)gc.iykl("iyqt", iyks(int ), (int)84);
                if (!var4_1) ** GOTO lbl224
                throw null;
            }
            case 16: {
                do {
                    var3_2 /* !! */  = (int)gc.iykl("iyqu", iyks(int ), (int)85);
                } while (!var4_1);
                throw null;
            }
            case 17: {
                var3_2 /* !! */  = (int)gc.iykl("iyqv", iyks(int ), (int)86);
                if (!var4_1) ** GOTO lbl224
                throw null;
            }
lbl268:
            // 4 sources

            case 18: {
                var3_2 /* !! */  = (int)gc.iykl("iyqw", iyks(int ), (int)87);
                if (!var4_1) ** GOTO lbl194
                throw null;
            }
lbl272:
            // 2 sources

            case 19: {
                var3_2 /* !! */  = (int)gc.iykl("iyqx", iyks(int ), (int)88);
                if (!var4_1) ** GOTO lbl268
                throw null;
            }
lbl276:
            // 3 sources

            case 20: {
                var3_2 /* !! */  = (int)gc.iykl("iyqy", iyks(int ), (int)89);
                if (!var4_1) ** GOTO lbl184
                throw null;
            }
            case 21: {
                var3_2 /* !! */  = (int)gc.iykl("iyqz", iyks(int ), (int)90);
                if (!var4_1) ** GOTO lbl238
                throw null;
            }
            case 22: 
        }
        var3_2 /* !! */  = (int)gc.iykl("iyra", iyks(int ), (int)91);
        ** while (!var4_1)
lbl287:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ double iyuo(int n2) {
        return Double.longBitsToDouble(iykj[n2] ^ iykk[n2]);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onUpdate(df var1_1) {
        block129: {
            block128: {
                v0 /* !! */  = gc.qv;
                if (true) ** GOTO lbl5
                block79: while (true) {
                    v0 /* !! */  = (long)(v1 - gc.iykl("iyrb", iyki(int ), (int)75));
lbl5:
                    // 2 sources

                    switch ((int)v0 /* !! */ ) {
                        case -2099609398: {
                            v1 = gc.iykl("iyrc", iyki(int ), (int)76);
                            continue block79;
                        }
                        case -661872332: {
                            v1 = gc.iykl("iyrd", iyki(int ), (int)77);
                            continue block79;
                        }
                        case -6253801: {
                            break block79;
                        }
                    }
                    break;
                }
                var7_2 = gc.c;
                v2 /* !! */  = gc.qv;
                if (true) ** GOTO lbl19
                block80: while (true) {
                    v2 /* !! */  = (long)(gc.iykl("iyrf", iyki(int ), (int)79) - gc.iykl("iyre", iyki(int ), (int)78));
lbl19:
                    // 2 sources

                    switch ((int)v2 /* !! */ ) {
                        case -6253801: {
                            break block80;
                        }
                        case 831920267: {
                            continue block80;
                        }
                    }
                    break;
                }
                var6_3 /* !! */  = gc.b;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_0 = gc.qv - gc.iykl("iyrg", iyki(int ), (int)80)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == gc.iykl("iyrh", iyks(int ), (int)92)) break;
                    v3 /* !! */  = (long)gc.iykl("iyri", iyks(int ), (int)93);
                }
                var5_4 = gc.a;
                if (var7_2) {
                    throw null;
lbl33:
                    // 13 sources

                    return;
                }
                if (var5_4 || var5_4) ** GOTO lbl33
                v4 /* !! */  = gc.qv;
                if (true) ** GOTO lbl40
                block83: while (true) {
                    v4 /* !! */  = (long)(gc.iykl("iyrk", iyki(int ), (int)82) - gc.iykl("iyrj", iyki(int ), (int)81));
lbl40:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -6253801: {
                            break block83;
                        }
                        case 1713121080: {
                            continue block83;
                        }
                    }
                    break;
                }
                var2_5 = class_310.method_1551();
                if (var5_4 || var5_4) ** GOTO lbl33
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = gc.qv - gc.iykl("iyrl", iyki(int ), (int)83)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == gc.iykl("iyrm", iyks(int ), (int)94)) break;
                    v5 /* !! */  = (long)gc.iykl("iyrn", iyks(int ), (int)95);
                }
                if (var2_5.field_1724 == null) break block128;
                if (var5_4) ** GOTO lbl33
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_2 = gc.qv - gc.iykl("iyro", iyki(int ), (int)84)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == gc.iykl("iyrp", iyks(int ), (int)96)) break;
                    v6 /* !! */  = (long)gc.iykl("iyrq", iyks(int ), (int)97);
                }
                if (var2_5.field_1687 == null) break block128;
                if (var5_4) ** GOTO lbl33
                v7 /* !! */  = gc.qv;
                if (true) ** GOTO lbl65
                block86: while (true) {
                    v7 /* !! */  = (long)(gc.iykl("iyrs", iyki(int ), (int)86) - gc.iykl("iyrr", iyki(int ), (int)85));
lbl65:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -1962395550: {
                            continue block86;
                        }
                        case -6253801: {
                            break block86;
                        }
                    }
                    break;
                }
                if (var2_5.field_1755 == null) break block129;
                if (var5_4) ** GOTO lbl33
            }
            if (var5_4 || var5_4) ** GOTO lbl33
            return;
        }
        if (var5_4 || var5_4) ** GOTO lbl33
        v8 /* !! */  = gc.qv;
        if (true) ** GOTO lbl81
        block87: while (true) {
            v8 /* !! */  = (long)(gc.iykl("iyru", iyki(int ), (int)88) - gc.iykl("iyrt", iyki(int ), (int)87));
lbl81:
            // 2 sources

            switch ((int)v8 /* !! */ ) {
                case -1719990125: {
                    continue block87;
                }
                case -6253801: {
                    break block87;
                }
            }
            break;
        }
        v9 = this.getMovementBasedYaw();
        while (true) {
            if ((v10 /* !! */  = (cfr_temp_3 = gc.qv - gc.iykl("iyrv", iyki(int ), (int)89)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v10 /* !! */  == gc.iykl("iyrw", iyks(int ), (int)98)) break;
            v10 /* !! */  = (long)gc.iykl("iyrx", iyks(int ), (int)99);
        }
        this.stableYaw = v9;
        if (var5_4 || var5_4) ** GOTO lbl33
        while (true) {
            if ((v11 /* !! */  = (cfr_temp_4 = gc.qv - gc.iykl("iyry", iyki(int ), (int)90)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v11 /* !! */  == gc.iykl("iyrz", iyks(int ), (int)100)) break;
            v11 /* !! */  = (long)gc.iykl("iysa", iyks(int ), (int)101);
        }
        var3_6 = this.stableYaw;
        if (var6_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var6_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var5_4 || var5_4) ** GOTO lbl33
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_5 = gc.qv - gc.iykl("iysb", iyki(int ), (int)91)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == gc.iykl("iysc", iyks(int ), (int)102)) break;
                    v12 /* !! */  = (long)gc.iykl("iysd", iyks(int ), (int)103);
                }
                var4_7 = this.calculateDynamicPitch();
                if (var5_4 || var5_4) ** GOTO lbl33
                v13 /* !! */  = gc.qv;
                if (true) ** GOTO lbl115
                block91: while (true) {
                    v13 /* !! */  = (long)(v14 - gc.iykl("iyse", iyki(int ), (int)92));
lbl115:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case -1270631735: {
                            v14 = gc.iykl("iysf", iyki(int ), (int)93);
                            continue block91;
                        }
                        case -6253801: {
                            break block91;
                        }
                        case 314237283: {
                            v14 = gc.iykl("iysg", iyki(int ), (int)94);
                            continue block91;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v15 /* !! */  = (cfr_temp_6 = gc.qv - gc.iykl("iysh", iyki(int ), (int)95)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v15 /* !! */  == gc.iykl("iysi", iyks(int ), (int)104)) break;
                    v15 /* !! */  = (long)gc.iykl("iysj", iyks(int ), (int)105);
                }
                v16 /* !! */  = gc.qv;
                if (true) ** GOTO lbl133
                block93: while (true) {
                    v16 /* !! */  = (long)(v17 - gc.iykl("iysk", iyki(int ), (int)96));
lbl133:
                    // 2 sources

                    switch ((int)v16 /* !! */ ) {
                        case -1879800905: {
                            v17 = gc.iykl("iysl", iyki(int ), (int)97);
                            continue block93;
                        }
                        case -6253801: {
                            break block93;
                        }
                        case 1692065218: {
                            v17 = gc.iykl("iysm", iyki(int ), (int)98);
                            continue block93;
                        }
                        case 1747209085: {
                            v17 = gc.iykl("iysn", iyki(int ), (int)99);
                            continue block93;
                        }
                    }
                    break;
                }
                v18 = new ov(var3_6, var4_7);
                while (true) {
                    if ((v19 /* !! */  = (cfr_temp_7 = gc.qv - gc.iykl("iyso", iyki(int ), (int)100)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v19 /* !! */  == gc.iykl("iysp", iyks(int ), (int)106)) break;
                    v19 /* !! */  = (long)gc.iykl("iysq", iyks(int ), (int)107);
                }
                v20 /* !! */  = gc.qv;
                if (true) ** GOTO lbl155
                block95: while (true) {
                    v20 /* !! */  = (long)(v21 - gc.iykl("iysr", iyki(int ), (int)101));
lbl155:
                    // 2 sources

                    switch ((int)v20 /* !! */ ) {
                        case -1378820741: {
                            v21 = gc.iykl("iyss", iyki(int ), (int)102);
                            continue block95;
                        }
                        case -6253801: {
                            break block95;
                        }
                        case 1515198176: {
                            v21 = gc.iykl("iyst", iyki(int ), (int)103);
                            continue block95;
                        }
                    }
                    break;
                }
                v22 /* !! */  = gc.qv;
                if (true) ** GOTO lbl168
                block96: while (true) {
                    v22 /* !! */  = (long)(v23 - gc.iykl("iysu", iyki(int ), (int)104));
lbl168:
                    // 2 sources

                    switch ((int)v22 /* !! */ ) {
                        case -344342138: {
                            v23 = gc.iykl("iysv", iyki(int ), (int)105);
                            continue block96;
                        }
                        case -6253801: {
                            break block96;
                        }
                        case 886587592: {
                            v23 = gc.iykl("iysw", iyki(int ), (int)106);
                            continue block96;
                        }
                    }
                    break;
                }
                v24 = new hz();
                v25 = gc.iykl("iysx", iyks(int ), (int)108);
                v26 = gc.iykl("iysy", iyks(int ), (int)109);
                v27 = gc.iykl("iysz", iyks(int ), (int)110);
                v28 /* !! */  = gc.qv;
                if (true) ** GOTO lbl185
                block97: while (true) {
                    v28 /* !! */  = (long)(gc.iykl("iytb", iyki(int ), (int)108) - gc.iykl("iyta", iyki(int ), (int)107));
lbl185:
                    // 2 sources

                    switch ((int)v28 /* !! */ ) {
                        case -6253801: {
                            break block97;
                        }
                        case 1775106040: {
                            continue block97;
                        }
                    }
                    break;
                }
                v29 = new os(v24, (boolean)v25, (boolean)v26, (boolean)v27);
                while (true) {
                    if ((v30 /* !! */  = (cfr_temp_8 = gc.qv - gc.iykl("iytc", iyki(int ), (int)109)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v30 /* !! */  == gc.iykl("iytd", iyks(int ), (int)111)) break;
                    v30 /* !! */  = (long)gc.iykl("iyte", iyks(int ), (int)112);
                }
                while (true) {
                    if ((v31 /* !! */  = (cfr_temp_9 = gc.qv - gc.iykl("iytf", iyki(int ), (int)110)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                    if (v31 /* !! */  == gc.iykl("iytg", iyks(int ), (int)113)) break;
                    v31 /* !! */  = (long)gc.iykl("iyth", iyks(int ), (int)114);
                }
                ot.INSTANCE.rotateTo(v18, v29, nn.LOW_PRIORITY, this);
                if (var5_4 || var5_4) ** GOTO lbl33
                while (true) {
                    if ((v32 /* !! */  = (cfr_temp_10 = gc.qv - gc.iykl("iyti", iyki(int ), (int)111)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
                    if (v32 /* !! */  == gc.iykl("iytj", iyks(int ), (int)115)) break;
                    v32 /* !! */  = (long)gc.iykl("iytk", iyks(int ), (int)116);
                }
                this.updateSneakState();
                if (var5_4 || var5_4) ** GOTO lbl33
                v33 /* !! */  = gc.qv;
                if (true) ** GOTO lbl214
                block101: while (true) {
                    v33 /* !! */  = (long)(v34 - gc.iykl("iytl", iyki(int ), (int)112));
lbl214:
                    // 2 sources

                    switch ((int)v33 /* !! */ ) {
                        case -1204677132: {
                            v34 = gc.iykl("iytm", iyki(int ), (int)113);
                            continue block101;
                        }
                        case -6253801: {
                            break block101;
                        }
                        case 942913200: {
                            v34 = gc.iykl("iytn", iyki(int ), (int)114);
                            continue block101;
                        }
                    }
                    break;
                }
                this.tryPlaceLegit();
                if (!var5_4 && !var5_4) ** break;
                ** continue;
                return;
            }
            case 0: {
                var6_3 /* !! */  = (int)gc.iykl("iyto", iyks(int ), (int)117);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl246
            }
            case 1: {
                var6_3 /* !! */  = (int)gc.iykl("iytp", iyks(int ), (int)118);
                if (!var7_2) break;
                throw null;
            }
lbl236:
            // 2 sources

            case 2: {
                var6_3 /* !! */  = (int)gc.iykl("iytq", iyks(int ), (int)119);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl251
            }
lbl241:
            // 2 sources

            case 3: {
                var6_3 /* !! */  = (int)gc.iykl("iytr", iyks(int ), (int)120);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl294
            }
lbl246:
            // 3 sources

            case 4: {
                var6_3 /* !! */  = (int)gc.iykl("iyts", iyks(int ), (int)121);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl312
            }
lbl251:
            // 2 sources

            case 5: {
                var6_3 /* !! */  = (int)gc.iykl("iytt", iyks(int ), (int)122);
                if (!var7_2) ** GOTO lbl241
                throw null;
            }
lbl255:
            // 2 sources

            case 6: {
                var6_3 /* !! */  = (int)gc.iykl("iytu", iyks(int ), (int)123);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl289
            }
            case 7: {
                var6_3 /* !! */  = (int)gc.iykl("iytv", iyks(int ), (int)124);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl329
            }
            case 8: {
                var6_3 /* !! */  = (int)gc.iykl("iytw", iyks(int ), (int)125);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl321
            }
            case 9: {
                var6_3 /* !! */  = (int)gc.iykl("iytx", iyks(int ), (int)126);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl308
            }
            case 10: {
                var6_3 /* !! */  = (int)gc.iykl("iyty", iyks(int ), (int)127);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl285
            }
            case 11: {
                var6_3 /* !! */  = (int)gc.iykl("iytz", iyks(int ), (int)128);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl294
            }
lbl285:
            // 3 sources

            case 12: {
                var6_3 /* !! */  = (int)gc.iykl("iyua", iyks(int ), (int)129);
                if (var7_2) {
                    throw null;
                }
            }
lbl289:
            // 4 sources

            case 13: {
                var6_3 /* !! */  = (int)gc.iykl("iyub", iyks(int ), (int)130);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl321
            }
lbl294:
            // 3 sources

            case 14: {
                var6_3 /* !! */  = (int)gc.iykl("iyuc", iyks(int ), (int)131);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl303
            }
lbl299:
            // 2 sources

            case 15: {
                var6_3 /* !! */  = (int)gc.iykl("iyud", iyks(int ), (int)132);
                if (!var7_2) ** GOTO lbl236
                throw null;
            }
lbl303:
            // 2 sources

            case 16: {
                do {
                    var6_3 /* !! */  = (int)gc.iykl("iyue", iyks(int ), (int)133);
                } while (!var7_2);
                throw null;
            }
lbl308:
            // 2 sources

            case 17: {
                var6_3 /* !! */  = (int)gc.iykl("iyuf", iyks(int ), (int)134);
                if (!var7_2) ** GOTO lbl246
                throw null;
            }
lbl312:
            // 2 sources

            case 18: {
                do {
                    var6_3 /* !! */  = (int)gc.iykl("iyug", iyks(int ), (int)135);
                } while (!var7_2);
                throw null;
            }
            case 19: {
                var6_3 /* !! */  = (int)gc.iykl("iyuh", iyks(int ), (int)136);
                if (!var7_2) ** GOTO lbl299
                throw null;
            }
lbl321:
            // 3 sources

            case 20: {
                var6_3 /* !! */  = (int)gc.iykl("iyui", iyks(int ), (int)137);
                if (!var7_2) ** GOTO lbl285
                throw null;
            }
            case 21: {
                var6_3 /* !! */  = (int)gc.iykl("iyuj", iyks(int ), (int)138);
                if (!var7_2) ** GOTO lbl255
                throw null;
            }
lbl329:
            // 2 sources

            case 22: {
                var6_3 /* !! */  = (int)gc.iykl("iyuk", iyks(int ), (int)139);
                if (var7_2) {
                    throw null;
                }
            }
lbl333:
            // 4 sources

            case 23: {
                do {
                    var6_3 /* !! */  = (int)gc.iykl("iyul", iyks(int ), (int)140);
                } while (!var7_2);
                throw null;
            }
            case 24: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var6_3 /* !! */  = (int)gc.iykl("iyum", iyks(int ), (int)141);
                    if (!var7_2) ** GOTO lbl333
                    throw null;
                }
            }
            case 25: 
        }
        var6_3 /* !! */  = (int)gc.iykl("iyun", iyks(int ), (int)142);
        ** while (!var7_2)
lbl346:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean isValidPlaceRaycast(class_3965 var1_1) {
        var9_2 = gc.c;
        var8_3 /* !! */  = gc.b;
        var7_4 = gc.a;
        if (var9_2) {
            throw null;
lbl6:
            // 22 sources

            return (boolean)gc.iykl("iyyf", iyks(int ), (int)234);
        }
        if (var7_4 || var7_4) ** GOTO lbl6
        var2_5 = class_310.method_1551();
        if (var7_4 || var7_4) ** GOTO lbl6
        if (var8_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var8_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_5.field_1724 == null) ** GOTO lbl18
                if (var7_4) ** GOTO lbl6
                if (var2_5.field_1687 != null) ** GOTO lbl20
                if (var7_4) ** GOTO lbl6
lbl18:
                // 2 sources

                if (var7_4 || var7_4) ** GOTO lbl6
                return (boolean)gc.iykl("iyyg", iyks(int ), (int)235);
lbl20:
                // 1 sources

                if (var7_4 || var7_4) ** GOTO lbl6
                var3_6 = var1_1.method_17777();
                if (var7_4 || var7_4) ** GOTO lbl6
                if (!var2_5.field_1687.method_8320(var3_6).method_26215()) ** GOTO lbl26
                if (var7_4) ** GOTO lbl6
                return (boolean)gc.iykl("iyyh", iyks(int ), (int)236);
lbl26:
                // 1 sources

                if (var7_4 || var7_4) ** GOTO lbl6
                if (var2_5.field_1687.method_8316(var3_6).method_15769()) ** GOTO lbl30
                if (var7_4) ** GOTO lbl6
                return (boolean)gc.iykl("iyyi", iyks(int ), (int)237);
lbl30:
                // 1 sources

                if (var7_4 || var7_4) ** GOTO lbl6
                var4_7 = var3_6.method_10093(var1_1.method_17780());
                if (var7_4 || var7_4) ** GOTO lbl6
                if (var2_5.field_1687.method_8320(var4_7).method_45474()) ** GOTO lbl36
                if (var7_4) ** GOTO lbl6
                return (boolean)gc.iykl("iyyj", iyks(int ), (int)238);
lbl36:
                // 1 sources

                if (var7_4 || var7_4) ** GOTO lbl6
                var5_8 = var2_5.field_1687.method_17742(new class_3959(var2_5.field_1724.method_33571(), var1_1.method_17784(), class_3959.class_3960.field_17558, class_3959.class_242.field_1348, (class_1297)var2_5.field_1724));
                if (var7_4 || var7_4) ** GOTO lbl6
                if (var5_8.method_17783() == class_239.class_240.field_1332) ** GOTO lbl42
                if (var7_4 || var7_4) ** GOTO lbl6
                return (boolean)gc.iykl("iyyk", iyks(int ), (int)239);
lbl42:
                // 1 sources

                if (var7_4 || var7_4) ** GOTO lbl6
                var6_9 = var5_8.method_17777();
                if (var7_4 || var7_4) ** GOTO lbl6
                if (var6_9.equals((Object)var3_6)) ** GOTO lbl49
                if (var7_4) ** GOTO lbl6
                if (!var6_9.equals((Object)var4_7)) ** GOTO lbl54
                if (var7_4) ** GOTO lbl6
lbl49:
                // 2 sources

                if (var7_4 || var7_4) ** GOTO lbl6
                v0 = gc.iykl("iyyl", iyks(int ), (int)240);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl57
lbl54:
                // 1 sources

                if (!var7_4 && !var7_4) ** break;
                ** continue;
                v0 = gc.iykl("iyym", iyks(int ), (int)241);
lbl57:
                // 2 sources

                return (boolean)v0;
            }
            case 0: {
                do {
                    var8_3 /* !! */  = (int)gc.iykl("iyyn", iyks(int ), (int)242);
                } while (!var9_2);
                throw null;
            }
            case 1: {
                var8_3 /* !! */  = (int)gc.iykl("iyyo", iyks(int ), (int)243);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl150
            }
lbl68:
            // 2 sources

            case 2: {
                var8_3 /* !! */  = (int)gc.iykl("iyyp", iyks(int ), (int)244);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl140
            }
lbl73:
            // 2 sources

            case 3: {
                var8_3 /* !! */  = (int)gc.iykl("iyyq", iyks(int ), (int)245);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl87
            }
            case 4: {
                var8_3 /* !! */  = (int)gc.iykl("iyyr", iyks(int ), (int)246);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl121
            }
lbl83:
            // 2 sources

            case 5: {
                var8_3 /* !! */  = (int)gc.iykl("iyys", iyks(int ), (int)247);
                if (!var9_2) break;
                throw null;
            }
lbl87:
            // 2 sources

            case 6: {
                var8_3 /* !! */  = (int)gc.iykl("iyyt", iyks(int ), (int)248);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl237
            }
lbl92:
            // 2 sources

            case 7: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var8_3 /* !! */  = (int)gc.iykl("iyyu", iyks(int ), (int)249);
                    if (var9_2) {
                        throw null;
                    }
                    ** GOTO lbl162
                    break;
                }
            }
            case 8: {
                var8_3 /* !! */  = (int)gc.iykl("iyyv", iyks(int ), (int)250);
                if (!var9_2) ** GOTO lbl83
                throw null;
            }
lbl102:
            // 4 sources

            case 9: {
                var8_3 /* !! */  = (int)gc.iykl("iyyw", iyks(int ), (int)251);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl237
            }
            case 10: {
                var8_3 /* !! */  = (int)gc.iykl("iyyx", iyks(int ), (int)252);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl184
            }
lbl112:
            // 2 sources

            case 11: {
                var8_3 /* !! */  = (int)gc.iykl("iyyy", iyks(int ), (int)253);
                if (!var9_2) ** GOTO lbl68
                throw null;
            }
lbl116:
            // 2 sources

            case 12: {
                var8_3 /* !! */  = (int)gc.iykl("iyyz", iyks(int ), (int)254);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl237
            }
lbl121:
            // 3 sources

            case 13: {
                var8_3 /* !! */  = (int)gc.iykl("iyza", iyks(int ), (int)255);
                if (!var9_2) ** GOTO lbl73
                throw null;
            }
            case 14: {
                var8_3 /* !! */  = (int)gc.iykl("iyzb", iyks(int ), (int)256);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl209
            }
            case 15: {
                var8_3 /* !! */  = (int)gc.iykl("iyzc", iyks(int ), (int)257);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl158
            }
            case 16: {
                var8_3 /* !! */  = (int)gc.iykl("iyzd", iyks(int ), (int)258);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl145
            }
lbl140:
            // 2 sources

            case 17: {
                var8_3 /* !! */  = (int)gc.iykl("iyze", iyks(int ), (int)259);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl150
            }
lbl145:
            // 4 sources

            case 18: {
                var8_3 /* !! */  = (int)gc.iykl("iyzf", iyks(int ), (int)260);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl197
            }
lbl150:
            // 4 sources

            case 19: {
                var8_3 /* !! */  = (int)gc.iykl("iyzg", iyks(int ), (int)261);
                if (!var9_2) ** GOTO lbl145
                throw null;
            }
lbl154:
            // 3 sources

            case 20: {
                var8_3 /* !! */  = (int)gc.iykl("iyzh", iyks(int ), (int)262);
                if (!var9_2) ** GOTO lbl112
                throw null;
            }
lbl158:
            // 2 sources

            case 21: {
                var8_3 /* !! */  = (int)gc.iykl("iyzi", iyks(int ), (int)263);
                if (!var9_2) ** GOTO lbl121
                throw null;
            }
lbl162:
            // 3 sources

            case 22: {
                var8_3 /* !! */  = (int)gc.iykl("iyzj", iyks(int ), (int)264);
                if (!var9_2) ** GOTO lbl116
                throw null;
            }
            case 23: {
                var8_3 /* !! */  = (int)gc.iykl("iyzk", iyks(int ), (int)265);
                if (!var9_2) break;
                throw null;
            }
lbl170:
            // 2 sources

            case 24: {
                var8_3 /* !! */  = (int)gc.iykl("iyzl", iyks(int ), (int)266);
                if (!var9_2) ** GOTO lbl102
                throw null;
            }
            case 25: {
                var8_3 /* !! */  = (int)gc.iykl("iyzm", iyks(int ), (int)267);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl237
            }
lbl179:
            // 3 sources

            case 26: {
                var8_3 /* !! */  = (int)gc.iykl("iyzn", iyks(int ), (int)268);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl213
            }
lbl184:
            // 2 sources

            case 27: {
                var8_3 /* !! */  = (int)gc.iykl("iyzo", iyks(int ), (int)269);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl221
            }
lbl189:
            // 2 sources

            case 28: {
                var8_3 /* !! */  = (int)gc.iykl("iyzp", iyks(int ), (int)270);
                if (!var9_2) ** GOTO lbl154
                throw null;
            }
lbl193:
            // 2 sources

            case 29: {
                var8_3 /* !! */  = (int)gc.iykl("iyzq", iyks(int ), (int)271);
                if (!var9_2) ** GOTO lbl145
                throw null;
            }
lbl197:
            // 2 sources

            case 30: {
                var8_3 /* !! */  = (int)gc.iykl("iyzr", iyks(int ), (int)272);
                if (!var9_2) ** GOTO lbl150
                throw null;
            }
            case 31: {
                var8_3 /* !! */  = (int)gc.iykl("iyzs", iyks(int ), (int)273);
                if (!var9_2) ** GOTO lbl154
                throw null;
            }
            case 32: {
                var8_3 /* !! */  = (int)gc.iykl("iyzt", iyks(int ), (int)274);
                if (!var9_2) ** GOTO lbl92
                throw null;
            }
lbl209:
            // 2 sources

            case 33: {
                var8_3 /* !! */  = (int)gc.iykl("iyzu", iyks(int ), (int)275);
                if (!var9_2) ** GOTO lbl179
                throw null;
            }
lbl213:
            // 2 sources

            case 34: {
                var8_3 /* !! */  = (int)gc.iykl("iyzv", iyks(int ), (int)276);
                if (!var9_2) ** GOTO lbl193
                throw null;
            }
            case 35: {
                var8_3 /* !! */  = (int)gc.iykl("iyzw", iyks(int ), (int)277);
                if (!var9_2) ** GOTO lbl179
                throw null;
            }
lbl221:
            // 2 sources

            case 36: {
                var8_3 /* !! */  = (int)gc.iykl("iyzx", iyks(int ), (int)278);
                if (!var9_2) ** GOTO lbl102
                throw null;
            }
            case 37: {
                var8_3 /* !! */  = (int)gc.iykl("iyzy", iyks(int ), (int)279);
                if (!var9_2) ** GOTO lbl102
                throw null;
            }
            case 38: {
                var8_3 /* !! */  = (int)gc.iykl("iyzz", iyks(int ), (int)280);
                if (!var9_2) ** GOTO lbl170
                throw null;
            }
            case 39: {
                var8_3 /* !! */  = (int)gc.iykl("izaa", iyks(int ), (int)281);
                if (!var9_2) ** GOTO lbl162
                throw null;
            }
lbl237:
            // 5 sources

            case 40: {
                var8_3 /* !! */  = (int)gc.iykl("izab", iyks(int ), (int)282);
                if (!var9_2) ** GOTO lbl189
                throw null;
            }
            case 41: 
        }
        var8_3 /* !! */  = (int)gc.iykl("izac", iyks(int ), (int)283);
        ** while (!var9_2)
lbl244:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private float resolveEdgeBasedYaw(boolean var1_1) {
        block121: {
            block120: {
                block119: {
                    var21_2 = gc.c;
                    var20_3 /* !! */  = gc.b;
                    var19_4 = gc.a;
                    if (var21_2) {
                        throw null;
lbl6:
                        // 34 sources

                        return (float)gc.iykl("izol", iyko(int ), (int)500);
                    }
                    if (var19_4 || var19_4) ** GOTO lbl6
                    var2_5 = class_310.method_1551();
                    if (var19_4 || var19_4) ** GOTO lbl6
                    if (var2_5.field_1724 != null) break block119;
                    if (var19_4) ** GOTO lbl6
                    return (float)gc.iykl("izom", iyko(int ), (int)501);
                }
                if (var19_4 || var19_4) ** GOTO lbl6
                var3_6 = class_2338.method_49637((double)var2_5.field_1724.method_23317(), (double)(var2_5.field_1724.method_23318() - 1.0), (double)var2_5.field_1724.method_23321());
                if (var19_4 || var19_4) ** GOTO lbl6
                var4_7 = var2_5.field_1724.method_23317() - (double)var3_6.method_10263();
                if (var19_4 || var19_4) ** GOTO lbl6
                var6_8 = var2_5.field_1724.method_23321() - (double)var3_6.method_10260();
                if (var19_4 || var19_4) ** GOTO lbl6
                var8_9 = var4_7;
                if (var19_4 || var19_4) ** GOTO lbl6
                var10_10 = 1.0 - var4_7;
                if (var19_4 || var19_4) ** GOTO lbl6
                var12_11 = var6_8;
                if (var19_4 || var19_4) ** GOTO lbl6
                var14_12 = 1.0 - var6_8;
                if (var19_4 || var19_4) ** GOTO lbl6
                var16_13 = var8_9;
                if (var19_4 || var19_4) ** GOTO lbl6
                var18_14 = class_2350.field_11039;
                if (var19_4 || var19_4) ** GOTO lbl6
                if (!(var10_10 < var16_13)) break block120;
                if (var19_4) ** GOTO lbl6
                var16_13 = var10_10;
                if (var19_4) ** GOTO lbl6
                var18_14 = class_2350.field_11034;
                if (var19_4) ** GOTO lbl6
            }
            if (var19_4 || var19_4) ** GOTO lbl6
            if (!(var12_11 < var16_13)) break block121;
            if (var19_4) ** GOTO lbl6
            var16_13 = var12_11;
            if (var19_4) ** GOTO lbl6
            var18_14 = class_2350.field_11043;
            if (var19_4) ** GOTO lbl6
        }
        if (var19_4) ** GOTO lbl6
        if (var20_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var20_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var19_4) ** GOTO lbl6
                if (!(var14_12 < var16_13)) ** GOTO lbl60
                if (var19_4) ** GOTO lbl6
                var16_13 = var14_12;
                if (var19_4) ** GOTO lbl6
                var18_14 = class_2350.field_11035;
                if (var19_4) ** GOTO lbl6
lbl60:
                // 2 sources

                if (var19_4 || var19_4) ** GOTO lbl6
                if (!var1_1) ** GOTO lbl66
                if (var19_4) ** GOTO lbl6
                if (!(var16_13 > gc.iykl("izon", iyuo(int ), (int)157))) ** GOTO lbl66
                if (var19_4) ** GOTO lbl6
                return this.stableYaw;
lbl66:
                // 2 sources

                if (var19_4 || var19_4) ** GOTO lbl6
                switch (gc$1.$SwitchMap$net$minecraft$util$math$Direction[var18_14.ordinal()]) {
                    case 1: {
                        if (var19_4 || var19_4) ** GOTO lbl6
                        v0 /* !! */  = (float)gc.iykl("izoo", iyko(int ), (int)502);
                        if (!var21_2) break;
                        throw null;
                    }
                    case 2: {
                        if (var19_4 || var19_4) ** GOTO lbl6
                        v0 /* !! */  = 0.0f;
                        if (!var21_2) break;
                        throw null;
                    }
                    case 3: {
                        if (var19_4 || var19_4) ** GOTO lbl6
                        v0 /* !! */  = (float)gc.iykl("izop", iyko(int ), (int)503);
                        if (!var21_2) break;
                        throw null;
                    }
                    case 4: {
                        if (var19_4 || var19_4) ** GOTO lbl6
                        v0 /* !! */  = (float)gc.iykl("izoq", iyko(int ), (int)504);
                        if (!var21_2) break;
                        throw null;
                    }
                    default: {
                        if (!var19_4 && !var19_4) ** break;
                        ** continue;
                        v0 /* !! */  = this.stableYaw;
                    }
                }
                return v0 /* !! */ ;
            }
            case 0: {
                var20_3 /* !! */  = (int)gc.iykl("izor", iyks(int ), (int)505);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl344
            }
            case 1: {
                var20_3 /* !! */  = (int)gc.iykl("izos", iyks(int ), (int)506);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl222
            }
lbl103:
            // 4 sources

            case 2: {
                var20_3 /* !! */  = (int)gc.iykl("izot", iyks(int ), (int)507);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl226
            }
lbl108:
            // 2 sources

            case 3: {
                var20_3 /* !! */  = (int)gc.iykl("izou", iyks(int ), (int)508);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl129
            }
lbl113:
            // 2 sources

            case 4: {
                var20_3 /* !! */  = (int)gc.iykl("izov", iyks(int ), (int)509);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl139
            }
lbl118:
            // 4 sources

            case 5: {
                var20_3 /* !! */  = (int)gc.iykl("izow", iyks(int ), (int)510);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl307
            }
lbl123:
            // 2 sources

            case 6: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var20_3 /* !! */  = (int)gc.iykl("izox", iyks(int ), (int)511);
                    if (var21_2) {
                        throw null;
                    }
                    ** GOTO lbl213
                    break;
                }
            }
lbl129:
            // 2 sources

            case 7: {
                var20_3 /* !! */  = (int)gc.iykl("izoy", iyks(int ), (int)512);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl294
            }
            case 8: {
                var20_3 /* !! */  = (int)gc.iykl("izoz", iyks(int ), (int)513);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl285
            }
lbl139:
            // 2 sources

            case 9: {
                var20_3 /* !! */  = (int)gc.iykl("izpa", iyks(int ), (int)514);
                if (!var21_2) ** GOTO lbl103
                throw null;
            }
lbl143:
            // 2 sources

            case 10: {
                var20_3 /* !! */  = (int)gc.iykl("izpb", iyks(int ), (int)515);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl320
            }
            case 11: {
                var20_3 /* !! */  = (int)gc.iykl("izpc", iyks(int ), (int)516);
                if (!var21_2) ** GOTO lbl118
                throw null;
            }
            case 12: {
                var20_3 /* !! */  = (int)gc.iykl("izpd", iyks(int ), (int)517);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl222
            }
            case 13: {
                var20_3 /* !! */  = (int)gc.iykl("izpe", iyks(int ), (int)518);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl303
            }
            case 14: {
                var20_3 /* !! */  = (int)gc.iykl("izpf", iyks(int ), (int)519);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl273
            }
            case 15: {
                var20_3 /* !! */  = (int)gc.iykl("izpg", iyks(int ), (int)520);
                if (!var21_2) ** GOTO lbl118
                throw null;
            }
lbl171:
            // 2 sources

            case 16: {
                var20_3 /* !! */  = (int)gc.iykl("izph", iyks(int ), (int)521);
                if (!var21_2) ** GOTO lbl143
                throw null;
            }
lbl175:
            // 2 sources

            case 17: {
                var20_3 /* !! */  = (int)gc.iykl("izpi", iyks(int ), (int)522);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl312
            }
lbl180:
            // 2 sources

            case 18: {
                var20_3 /* !! */  = (int)gc.iykl("izpj", iyks(int ), (int)523);
                if (!var21_2) ** GOTO lbl108
                throw null;
            }
            case 19: {
                var20_3 /* !! */  = (int)gc.iykl("izpk", iyks(int ), (int)524);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl294
            }
            case 20: {
                var20_3 /* !! */  = (int)gc.iykl("izpl", iyks(int ), (int)525);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl263
            }
lbl194:
            // 2 sources

            case 21: {
                var20_3 /* !! */  = (int)gc.iykl("izpm", iyks(int ), (int)526);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl253
            }
            case 22: {
                var20_3 /* !! */  = (int)gc.iykl("izpn", iyks(int ), (int)527);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl268
            }
            case 23: {
                var20_3 /* !! */  = (int)gc.iykl("izpo", iyks(int ), (int)528);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl253
            }
lbl209:
            // 2 sources

            case 24: {
                var20_3 /* !! */  = (int)gc.iykl("izpp", iyks(int ), (int)529);
                if (!var21_2) break;
                throw null;
            }
lbl213:
            // 2 sources

            case 25: {
                var20_3 /* !! */  = (int)gc.iykl("izpq", iyks(int ), (int)530);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl316
            }
            case 26: {
                var20_3 /* !! */  = (int)gc.iykl("izpr", iyks(int ), (int)531);
                if (!var21_2) ** GOTO lbl103
                throw null;
            }
lbl222:
            // 3 sources

            case 27: {
                var20_3 /* !! */  = (int)gc.iykl("izps", iyks(int ), (int)532);
                if (!var21_2) ** GOTO lbl113
                throw null;
            }
lbl226:
            // 2 sources

            case 28: {
                var20_3 /* !! */  = (int)gc.iykl("izpt", iyks(int ), (int)533);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl285
            }
lbl231:
            // 4 sources

            case 29: {
                var20_3 /* !! */  = (int)gc.iykl("izpu", iyks(int ), (int)534);
                if (!var21_2) break;
                throw null;
            }
            case 30: {
                var20_3 /* !! */  = (int)gc.iykl("izpv", iyks(int ), (int)535);
                if (!var21_2) break;
                throw null;
            }
lbl239:
            // 4 sources

            case 31: {
                var20_3 /* !! */  = (int)gc.iykl("izpw", iyks(int ), (int)536);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl253
            }
            case 32: {
                var20_3 /* !! */  = (int)gc.iykl("izpx", iyks(int ), (int)537);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl336
            }
lbl249:
            // 2 sources

            case 33: {
                var20_3 /* !! */  = (int)gc.iykl("izpy", iyks(int ), (int)538);
                if (!var21_2) ** GOTO lbl239
                throw null;
            }
lbl253:
            // 5 sources

            case 34: {
                var20_3 /* !! */  = (int)gc.iykl("izpz", iyks(int ), (int)539);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl336
            }
            case 35: {
                var20_3 /* !! */  = (int)gc.iykl("izqa", iyks(int ), (int)540);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl356
            }
lbl263:
            // 2 sources

            case 36: {
                var20_3 /* !! */  = (int)gc.iykl("izqb", iyks(int ), (int)541);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl290
            }
lbl268:
            // 2 sources

            case 37: {
                var20_3 /* !! */  = (int)gc.iykl("izqc", iyks(int ), (int)542);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl281
            }
lbl273:
            // 3 sources

            case 38: {
                var20_3 /* !! */  = (int)gc.iykl("izqd", iyks(int ), (int)543);
                if (!var21_2) ** GOTO lbl175
                throw null;
            }
            case 39: {
                var20_3 /* !! */  = (int)gc.iykl("izqe", iyks(int ), (int)544);
                if (!var21_2) ** GOTO lbl103
                throw null;
            }
lbl281:
            // 2 sources

            case 40: {
                var20_3 /* !! */  = (int)gc.iykl("izqf", iyks(int ), (int)545);
                if (!var21_2) ** GOTO lbl249
                throw null;
            }
lbl285:
            // 3 sources

            case 41: {
                var20_3 /* !! */  = (int)gc.iykl("izqg", iyks(int ), (int)546);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl328
            }
lbl290:
            // 2 sources

            case 42: {
                var20_3 /* !! */  = (int)gc.iykl("izqh", iyks(int ), (int)547);
                if (!var21_2) ** GOTO lbl239
                throw null;
            }
lbl294:
            // 3 sources

            case 43: {
                var20_3 /* !! */  = (int)gc.iykl("izqi", iyks(int ), (int)548);
                if (!var21_2) ** GOTO lbl194
                throw null;
            }
            case 44: {
                var20_3 /* !! */  = (int)gc.iykl("izqj", iyks(int ), (int)549);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl332
            }
lbl303:
            // 2 sources

            case 45: {
                var20_3 /* !! */  = (int)gc.iykl("izqk", iyks(int ), (int)550);
                if (!var21_2) ** GOTO lbl253
                throw null;
            }
lbl307:
            // 2 sources

            case 46: {
                var20_3 /* !! */  = (int)gc.iykl("izql", iyks(int ), (int)551);
                if (var21_2) {
                    throw null;
                }
                ** GOTO lbl316
            }
lbl312:
            // 2 sources

            case 47: {
                var20_3 /* !! */  = (int)gc.iykl("izqm", iyks(int ), (int)552);
                if (!var21_2) ** GOTO lbl239
                throw null;
            }
lbl316:
            // 3 sources

            case 48: {
                var20_3 /* !! */  = (int)gc.iykl("izqn", iyks(int ), (int)553);
                if (!var21_2) ** GOTO lbl209
                throw null;
            }
lbl320:
            // 2 sources

            case 49: {
                var20_3 /* !! */  = (int)gc.iykl("izqo", iyks(int ), (int)554);
                if (!var21_2) ** GOTO lbl171
                throw null;
            }
lbl324:
            // 2 sources

            case 50: {
                var20_3 /* !! */  = (int)gc.iykl("izqp", iyks(int ), (int)555);
                if (!var21_2) ** GOTO lbl231
                throw null;
            }
lbl328:
            // 2 sources

            case 51: {
                var20_3 /* !! */  = (int)gc.iykl("izqq", iyks(int ), (int)556);
                if (!var21_2) ** GOTO lbl273
                throw null;
            }
lbl332:
            // 3 sources

            case 52: {
                var20_3 /* !! */  = (int)gc.iykl("izqr", iyks(int ), (int)557);
                if (!var21_2) ** GOTO lbl231
                throw null;
            }
lbl336:
            // 3 sources

            case 53: {
                var20_3 /* !! */  = (int)gc.iykl("izqs", iyks(int ), (int)558);
                if (!var21_2) ** GOTO lbl324
                throw null;
            }
            case 54: {
                var20_3 /* !! */  = (int)gc.iykl("izqt", iyks(int ), (int)559);
                if (!var21_2) ** GOTO lbl180
                throw null;
            }
lbl344:
            // 2 sources

            case 55: {
                var20_3 /* !! */  = (int)gc.iykl("izqu", iyks(int ), (int)560);
                if (!var21_2) ** GOTO lbl332
                throw null;
            }
            case 56: {
                var20_3 /* !! */  = (int)gc.iykl("izqv", iyks(int ), (int)561);
                if (!var21_2) ** GOTO lbl123
                throw null;
            }
            case 57: {
                var20_3 /* !! */  = (int)gc.iykl("izqw", iyks(int ), (int)562);
                if (!var21_2) ** GOTO lbl231
                throw null;
            }
lbl356:
            // 2 sources

            case 58: {
                var20_3 /* !! */  = (int)gc.iykl("izqx", iyks(int ), (int)563);
                if (!var21_2) ** GOTO lbl118
                throw null;
            }
            case 59: 
        }
        var20_3 /* !! */  = (int)gc.iykl("izqy", iyks(int ), (int)564);
        ** while (!var21_2)
lbl363:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private int getBlockSlot() {
        block101: {
            block100: {
                block99: {
                    var9_1 = gc.c;
                    var8_2 /* !! */  = gc.b;
                    var7_3 = gc.a;
                    if (var9_1) {
                        throw null;
lbl6:
                        // 25 sources

                        return (int)gc.iykl("izad", iyks(int ), (int)284);
                    }
                    if (var7_3 || var7_3) ** GOTO lbl6
                    var1_4 = class_310.method_1551();
                    if (var7_3 || var7_3) ** GOTO lbl6
                    if (var1_4.field_1724 != null) break block99;
                    if (var7_3) ** GOTO lbl6
                    return (int)gc.iykl("izae", iyks(int ), (int)285);
                }
                if (var7_3 || var7_3) ** GOTO lbl6
                if (!this.isValidBlockSlot(this.lockedBlockSlot)) break block100;
                if (var7_3) ** GOTO lbl6
                return this.lockedBlockSlot;
            }
            if (var7_3 || var7_3) ** GOTO lbl6
            var2_5 = var1_4.field_1724.method_31548().method_67532();
            if (var7_3 || var7_3) ** GOTO lbl6
            if (!this.isValidBlockSlot(var2_5)) break block101;
            if (var7_3 || var7_3) ** GOTO lbl6
            this.lockedBlockSlot = var2_5;
            if (var7_3 || var7_3) ** GOTO lbl6
            return this.lockedBlockSlot;
        }
        if (var7_3 || var7_3) ** GOTO lbl6
        var3_6 = gc.iykl("izaf", iyks(int ), (int)286);
        if (var7_3 || var7_3) ** GOTO lbl6
        var4_7 /* !! */  = gc.iykl("izag", iyks(int ), (int)287);
        if (var7_3 || var7_3) ** GOTO lbl6
        var5_8 = gc.iykl("izah", iyks(int ), (int)288);
        if (var7_3) ** GOTO lbl6
        block52: while (true) {
            block103: {
                block102: {
                    if (var7_3 || var7_3) ** GOTO lbl6
                    if (var5_8 >= gc.iykl("izai", iyks(int ), (int)289)) ** GOTO lbl64
                    if (var7_3 || var7_3) ** GOTO lbl6
                    var6_9 = var1_4.field_1724.method_31548().method_5438((int)var5_8);
                    if (var7_3 || var7_3) ** GOTO lbl6
                    if (var6_9.method_7909() instanceof class_1747) break block102;
                    if (var7_3) ** GOTO lbl6
                    if (var9_1) {
                        throw null;
                    }
                    break block103;
                }
                if (var7_3 || var7_3) ** GOTO lbl6
                if (var6_9.method_7947() <= var4_7 /* !! */ ) break block103;
                if (var7_3 || var7_3) ** GOTO lbl6
                var4_7 /* !! */  = (CallSite)var6_9.method_7947();
                if (var7_3 || var7_3) ** GOTO lbl6
                var3_6 = var5_8;
                if (var7_3) ** GOTO lbl6
            }
            if (var7_3 || var7_3) ** GOTO lbl6
            ++var5_8;
            if (var8_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var8_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var7_3) ** GOTO lbl6
                    if (!var9_1) continue block52;
                    throw null;
                }
lbl64:
                // 1 sources

                if (var7_3 || var7_3) ** GOTO lbl6
                this.lockedBlockSlot = (int)var3_6;
                if (!var7_3 && !var7_3) ** break;
                ** continue;
                return (int)var3_6;
lbl69:
                // 2 sources

                case 0: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var8_2 /* !! */  = (int)gc.iykl("izaj", iyks(int ), (int)290);
                        if (var9_1) {
                            throw null;
                        }
                        ** GOTO lbl217
                        break;
                    }
                }
lbl75:
                // 2 sources

                case 1: {
                    var8_2 /* !! */  = (int)gc.iykl("izak", iyks(int ), (int)291);
                    if (var9_1) {
                        throw null;
                    }
                    ** GOTO lbl225
                }
lbl80:
                // 2 sources

                case 2: {
                    var8_2 /* !! */  = (int)gc.iykl("izal", iyks(int ), (int)292);
                    if (var9_1) {
                        throw null;
                    }
                    ** GOTO lbl135
                }
                case 3: {
                    var8_2 /* !! */  = (int)gc.iykl("izam", iyks(int ), (int)293);
                    if (var9_1) {
                        throw null;
                    }
                    ** GOTO lbl130
                }
                case 4: {
                    do {
                        var8_2 /* !! */  = (int)gc.iykl("izan", iyks(int ), (int)294);
                    } while (!var9_1);
                    throw null;
                }
                case 5: {
                    var8_2 /* !! */  = (int)gc.iykl("izao", iyks(int ), (int)295);
                    if (var9_1) {
                        throw null;
                    }
                    ** GOTO lbl225
                }
lbl100:
                // 2 sources

                case 6: {
                    var8_2 /* !! */  = (int)gc.iykl("izap", iyks(int ), (int)296);
                    if (var9_1) {
                        throw null;
                    }
                    ** GOTO lbl143
                }
lbl105:
                // 3 sources

                case 7: {
                    var8_2 /* !! */  = (int)gc.iykl("izaq", iyks(int ), (int)297);
                    if (var9_1) {
                        throw null;
                    }
                    ** GOTO lbl217
                }
                case 8: {
                    var8_2 /* !! */  = (int)gc.iykl("izar", iyks(int ), (int)298);
                    if (var9_1) {
                        throw null;
                    }
                    ** GOTO lbl202
                }
                case 9: {
                    var8_2 /* !! */  = (int)gc.iykl("izas", iyks(int ), (int)299);
                    if (var9_1) {
                        throw null;
                    }
                    ** GOTO lbl130
                }
lbl120:
                // 2 sources

                case 10: {
                    var8_2 /* !! */  = (int)gc.iykl("izat", iyks(int ), (int)300);
                    if (var9_1) {
                        throw null;
                    }
                    ** GOTO lbl267
                }
                case 11: {
                    var8_2 /* !! */  = (int)gc.iykl("izau", iyks(int ), (int)301);
                    if (var9_1) {
                        throw null;
                    }
                    ** GOTO lbl197
                }
lbl130:
                // 4 sources

                case 12: {
                    var8_2 /* !! */  = (int)gc.iykl("izav", iyks(int ), (int)302);
                    if (var9_1) {
                        throw null;
                    }
                    ** GOTO lbl275
                }
lbl135:
                // 3 sources

                case 13: {
                    var8_2 /* !! */  = (int)gc.iykl("izaw", iyks(int ), (int)303);
                    if (var9_1) {
                        throw null;
                    }
                }
                case 14: {
                    var8_2 /* !! */  = (int)gc.iykl("izax", iyks(int ), (int)304);
                    if (!var9_1) break block52;
                    throw null;
                }
lbl143:
                // 4 sources

                case 15: {
                    var8_2 /* !! */  = (int)gc.iykl("izay", iyks(int ), (int)305);
                    if (!var9_1) break block52;
                    throw null;
                }
                case 16: {
                    var8_2 /* !! */  = (int)gc.iykl("izaz", iyks(int ), (int)306);
                    if (var9_1) {
                        throw null;
                    }
                    ** GOTO lbl221
                }
                case 17: {
                    var8_2 /* !! */  = (int)gc.iykl("izba", iyks(int ), (int)307);
                    if (!var9_1) ** GOTO lbl143
                    throw null;
                }
lbl156:
                // 2 sources

                case 18: {
                    var8_2 /* !! */  = (int)gc.iykl("izbb", iyks(int ), (int)308);
                    if (var9_1) {
                        throw null;
                    }
                    ** GOTO lbl169
                }
lbl161:
                // 2 sources

                case 19: {
                    var8_2 /* !! */  = (int)gc.iykl("izbc", iyks(int ), (int)309);
                    if (!var9_1) ** GOTO lbl135
                    throw null;
                }
lbl165:
                // 2 sources

                case 20: {
                    var8_2 /* !! */  = (int)gc.iykl("izbd", iyks(int ), (int)310);
                    if (!var9_1) ** GOTO lbl105
                    throw null;
                }
lbl169:
                // 2 sources

                case 21: {
                    var8_2 /* !! */  = (int)gc.iykl("izbe", iyks(int ), (int)311);
                    if (var9_1) {
                        throw null;
                    }
                    ** GOTO lbl259
                }
                case 22: {
                    var8_2 /* !! */  = (int)gc.iykl("izbf", iyks(int ), (int)312);
                    if (!var9_1) ** GOTO lbl69
                    throw null;
                }
                case 23: {
                    var8_2 /* !! */  = (int)gc.iykl("izbg", iyks(int ), (int)313);
                    if (!var9_1) ** GOTO lbl105
                    throw null;
                }
lbl182:
                // 2 sources

                case 24: {
                    var8_2 /* !! */  = (int)gc.iykl("izbh", iyks(int ), (int)314);
                    if (var9_1) {
                        throw null;
                    }
                    ** GOTO lbl207
                }
lbl187:
                // 2 sources

                case 25: {
                    var8_2 /* !! */  = (int)gc.iykl("izbi", iyks(int ), (int)315);
                    if (var9_1) {
                        throw null;
                    }
                    ** GOTO lbl197
                }
lbl192:
                // 2 sources

                case 26: {
                    var8_2 /* !! */  = (int)gc.iykl("izbj", iyks(int ), (int)316);
                    if (var9_1) {
                        throw null;
                    }
                    ** GOTO lbl259
                }
lbl197:
                // 3 sources

                case 27: {
                    var8_2 /* !! */  = (int)gc.iykl("izbk", iyks(int ), (int)317);
                    if (var9_1) {
                        throw null;
                    }
                    ** GOTO lbl241
                }
lbl202:
                // 3 sources

                case 28: {
                    var8_2 /* !! */  = (int)gc.iykl("izbl", iyks(int ), (int)318);
                    if (var9_1) {
                        throw null;
                    }
                    ** GOTO lbl225
                }
lbl207:
                // 3 sources

                case 29: {
                    var8_2 /* !! */  = (int)gc.iykl("izbm", iyks(int ), (int)319);
                    if (var9_1) {
                        throw null;
                    }
                    ** GOTO lbl271
                }
                case 30: {
                    var8_2 /* !! */  = (int)gc.iykl("izbn", iyks(int ), (int)320);
                    if (var9_1) {
                        throw null;
                    }
                    ** GOTO lbl271
                }
lbl217:
                // 3 sources

                case 31: {
                    var8_2 /* !! */  = (int)gc.iykl("izbo", iyks(int ), (int)321);
                    if (!var9_1) ** GOTO lbl156
                    throw null;
                }
lbl221:
                // 2 sources

                case 32: {
                    var8_2 /* !! */  = (int)gc.iykl("izbp", iyks(int ), (int)322);
                    if (!var9_1) ** GOTO lbl100
                    throw null;
                }
lbl225:
                // 4 sources

                case 33: {
                    var8_2 /* !! */  = (int)gc.iykl("izbq", iyks(int ), (int)323);
                    if (!var9_1) ** GOTO lbl143
                    throw null;
                }
                case 34: {
                    var8_2 /* !! */  = (int)gc.iykl("izbr", iyks(int ), (int)324);
                    if (!var9_1) ** GOTO lbl202
                    throw null;
                }
                case 35: {
                    var8_2 /* !! */  = (int)gc.iykl("izbs", iyks(int ), (int)325);
                    if (!var9_1) ** GOTO lbl187
                    throw null;
                }
                case 36: {
                    var8_2 /* !! */  = (int)gc.iykl("izbt", iyks(int ), (int)326);
                    if (!var9_1) ** GOTO lbl192
                    throw null;
                }
lbl241:
                // 2 sources

                case 37: {
                    var8_2 /* !! */  = (int)gc.iykl("izbu", iyks(int ), (int)327);
                    if (!var9_1) break block52;
                    throw null;
                }
                case 38: {
                    var8_2 /* !! */  = (int)gc.iykl("izbv", iyks(int ), (int)328);
                    if (!var9_1) ** GOTO lbl120
                    throw null;
                }
                case 39: {
                    do {
                        var8_2 /* !! */  = (int)gc.iykl("izbw", iyks(int ), (int)329);
                    } while (!var9_1);
                    throw null;
                }
                case 40: {
                    var8_2 /* !! */  = (int)gc.iykl("izbx", iyks(int ), (int)330);
                    if (var9_1) {
                        throw null;
                    }
                    ** GOTO lbl279
                }
lbl259:
                // 3 sources

                case 41: {
                    var8_2 /* !! */  = (int)gc.iykl("izby", iyks(int ), (int)331);
                    if (!var9_1) ** GOTO lbl161
                    throw null;
                }
                case 42: {
                    var8_2 /* !! */  = (int)gc.iykl("izbz", iyks(int ), (int)332);
                    if (!var9_1) ** GOTO lbl207
                    throw null;
                }
lbl267:
                // 2 sources

                case 43: {
                    var8_2 /* !! */  = (int)gc.iykl("izca", iyks(int ), (int)333);
                    if (!var9_1) ** GOTO lbl165
                    throw null;
                }
lbl271:
                // 3 sources

                case 44: {
                    var8_2 /* !! */  = (int)gc.iykl("izcb", iyks(int ), (int)334);
                    if (!var9_1) ** GOTO lbl80
                    throw null;
                }
lbl275:
                // 2 sources

                case 45: {
                    var8_2 /* !! */  = (int)gc.iykl("izcc", iyks(int ), (int)335);
                    if (!var9_1) ** GOTO lbl75
                    throw null;
                }
lbl279:
                // 2 sources

                case 46: {
                    var8_2 /* !! */  = (int)gc.iykl("izcd", iyks(int ), (int)336);
                    if (!var9_1) ** GOTO lbl130
                    throw null;
                }
                case 47: {
                    var8_2 /* !! */  = (int)gc.iykl("izce", iyks(int ), (int)337);
                    if (!var9_1) ** GOTO lbl182
                    throw null;
                }
                case 48: 
            }
            break;
        }
        var8_2 /* !! */  = (int)gc.iykl("izcf", iyks(int ), (int)338);
        ** while (!var9_1)
lbl290:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void izum() {
        gc.iykp[100] = -1964429952;
        gc.iykp[101] = -632218852;
        gc.iykp[102] = -1460329257;
        gc.iykp[103] = -57275245;
        gc.iykp[104] = -1608217420;
        gc.iykp[105] = 435523068;
        gc.iykp[106] = 1132505769;
        gc.iykp[107] = -1030906838;
        gc.iykp[108] = 1139265832;
        gc.iykp[109] = -893135928;
        gc.iykp[110] = 1271691929;
        gc.iykp[111] = -12325457;
        gc.iykp[112] = 1612351944;
        gc.iykp[113] = 1316959472;
        gc.iykp[114] = 1197446167;
        gc.iykp[115] = 1167625547;
        gc.iykp[116] = 532010129;
        gc.iykp[117] = 1906571807;
        gc.iykp[118] = -1233923392;
        gc.iykp[119] = -1008215253;
        gc.iykp[120] = 892519497;
        gc.iykp[121] = -1994020200;
        gc.iykp[122] = -1159728;
        gc.iykp[123] = 858175720;
        gc.iykp[124] = 1349282458;
        gc.iykp[125] = 415009670;
        gc.iykp[126] = -480551115;
        gc.iykp[127] = -1861225533;
        gc.iykp[128] = -553851842;
        gc.iykp[129] = -2083111384;
        gc.iykp[130] = -2052743649;
        gc.iykp[131] = -499952044;
        gc.iykp[132] = 995033486;
        gc.iykp[133] = 1484596394;
        gc.iykp[134] = 649633051;
        gc.iykp[135] = 1342615242;
        gc.iykp[136] = -1505657610;
        gc.iykp[137] = 1074605482;
        gc.iykp[138] = -886820267;
        gc.iykp[139] = -1936887052;
        gc.iykp[140] = -1754672917;
        gc.iykp[141] = 1625434672;
        gc.iykp[142] = 1265123689;
        gc.iykp[143] = 86503064;
        gc.iykp[144] = -81396235;
        gc.iykp[145] = -1856976056;
        gc.iykp[146] = -858859409;
        gc.iykp[147] = -536981189;
        gc.iykp[148] = -1926448391;
        gc.iykp[149] = -1218777396;
        gc.iykp[150] = -1959228731;
        gc.iykp[151] = -1024302313;
        gc.iykp[152] = 1072721040;
        gc.iykp[153] = -525972764;
        gc.iykp[154] = -1392445427;
        gc.iykp[155] = 1687763567;
        gc.iykp[156] = -179264011;
        gc.iykp[157] = -2117646315;
        gc.iykp[158] = -1927031910;
        gc.iykp[159] = -1288401336;
        gc.iykp[160] = 1804934005;
        gc.iykp[161] = -155401499;
        gc.iykp[162] = -741391738;
        gc.iykp[163] = -1391502597;
        gc.iykp[164] = -932883718;
        gc.iykp[165] = -723352352;
        gc.iykp[166] = 1638133354;
        gc.iykp[167] = -916223775;
        gc.iykp[168] = -1304537986;
        gc.iykp[169] = -1625134553;
        gc.iykp[170] = -1587529513;
        gc.iykp[171] = 1032394018;
        gc.iykp[172] = -751153291;
        gc.iykp[173] = -1956481686;
        gc.iykp[174] = 935167917;
        gc.iykp[175] = 1297915922;
        gc.iykp[176] = -1421063529;
        gc.iykp[177] = 1672106922;
        gc.iykp[178] = 1245830339;
        gc.iykp[179] = 1011189418;
        gc.iykp[180] = -590818265;
        gc.iykp[181] = 1608390103;
        gc.iykp[182] = 266913898;
        gc.iykp[183] = 1671173283;
        gc.iykp[184] = -1508039558;
        gc.iykp[185] = 987842860;
        gc.iykp[186] = 1584825176;
        gc.iykp[187] = 1536980601;
        gc.iykp[188] = -1677630902;
        gc.iykp[189] = 1895600017;
        gc.iykp[190] = -37548482;
        gc.iykp[191] = -1516732149;
        gc.iykp[192] = 1433746295;
        gc.iykp[193] = 1820639635;
        gc.iykp[194] = 1807818605;
        gc.iykp[195] = 875485537;
        gc.iykp[196] = -409495369;
        gc.iykp[197] = -596663582;
        gc.iykp[198] = -386334391;
        gc.iykp[199] = 1974040470;
    }

    private static /* synthetic */ void izus() {
        gc.iykq[0] = -1130809008;
        gc.iykq[1] = 1897060584;
        gc.iykq[2] = 1752278039;
        gc.iykq[3] = -460862802;
        gc.iykq[4] = -2038476417;
        gc.iykq[5] = -181345095;
        gc.iykq[6] = 35411401;
        gc.iykq[7] = -1379788191;
        gc.iykq[8] = 991871097;
        gc.iykq[9] = -1134225388;
        gc.iykq[10] = -299713167;
        gc.iykq[11] = 75385924;
        gc.iykq[12] = 1691523904;
        gc.iykq[13] = -2007694130;
        gc.iykq[14] = 970220594;
        gc.iykq[15] = 1802829556;
        gc.iykq[16] = 272255983;
        gc.iykq[17] = 2139056915;
        gc.iykq[18] = -1814650080;
        gc.iykq[19] = -1598156439;
        gc.iykq[20] = -724184709;
        gc.iykq[21] = 2091225402;
        gc.iykq[22] = 1294994048;
        gc.iykq[23] = -671879828;
        gc.iykq[24] = -443197514;
        gc.iykq[25] = 789687288;
        gc.iykq[26] = 302685308;
        gc.iykq[27] = 998765096;
        gc.iykq[28] = 1446842722;
        gc.iykq[29] = 358673983;
        gc.iykq[30] = 80564406;
        gc.iykq[31] = 283396066;
        gc.iykq[32] = 1916360583;
        gc.iykq[33] = 918033549;
        gc.iykq[34] = -1758999679;
        gc.iykq[35] = -1345227647;
        gc.iykq[36] = 1355676924;
        gc.iykq[37] = -165534806;
        gc.iykq[38] = 8880150;
        gc.iykq[39] = -1448225374;
        gc.iykq[40] = 1284171989;
        gc.iykq[41] = 1115761730;
        gc.iykq[42] = -506435162;
        gc.iykq[43] = 1922722398;
        gc.iykq[44] = 1243977904;
        gc.iykq[45] = 699547811;
        gc.iykq[46] = -1766329266;
        gc.iykq[47] = 1339327172;
        gc.iykq[48] = 382706006;
        gc.iykq[49] = 1697068926;
        gc.iykq[50] = 492885140;
        gc.iykq[51] = -204662036;
        gc.iykq[52] = 990331265;
        gc.iykq[53] = -1743932932;
        gc.iykq[54] = -1407295648;
        gc.iykq[55] = 181128725;
        gc.iykq[56] = 1831761054;
        gc.iykq[57] = -1065505917;
        gc.iykq[58] = 1879030135;
        gc.iykq[59] = -1911976327;
        gc.iykq[60] = 1619891105;
        gc.iykq[61] = -1406211674;
        gc.iykq[62] = -512476315;
        gc.iykq[63] = 1779971172;
        gc.iykq[64] = 794364971;
        gc.iykq[65] = 999473460;
        gc.iykq[66] = 1758659934;
        gc.iykq[67] = -715579493;
        gc.iykq[68] = -2510161;
        gc.iykq[69] = -1105535034;
        gc.iykq[70] = 2063962112;
        gc.iykq[71] = -1394115408;
        gc.iykq[72] = 1366937764;
        gc.iykq[73] = -2019501004;
        gc.iykq[74] = -961523123;
        gc.iykq[75] = 448087554;
        gc.iykq[76] = 284802048;
        gc.iykq[77] = -1519977771;
        gc.iykq[78] = -818161061;
        gc.iykq[79] = 2056073840;
        gc.iykq[80] = 1332512999;
        gc.iykq[81] = 1199861603;
        gc.iykq[82] = -1832627932;
        gc.iykq[83] = -1757268577;
        gc.iykq[84] = -45856408;
        gc.iykq[85] = -1440147097;
        gc.iykq[86] = -1681973042;
        gc.iykq[87] = 60022302;
        gc.iykq[88] = -246252853;
        gc.iykq[89] = 343247104;
        gc.iykq[90] = -202566627;
        gc.iykq[91] = -1434979893;
        gc.iykq[92] = -1118928955;
        gc.iykq[93] = 1507849635;
        gc.iykq[94] = 594837079;
        gc.iykq[95] = -372226140;
        gc.iykq[96] = 1234547346;
        gc.iykq[97] = 88528504;
        gc.iykq[98] = 1121583247;
        gc.iykq[99] = -936903821;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void updateSneakState() {
        CallSite callSite;
        CallSite callSite2;
        boolean bl2 = c;
        int n2 = b;
        boolean bl3 = a;
        if (bl2) {
            throw null;
        }
        if (bl3 || bl3) return;
        class_310 class_3102 = class_310.method_1551();
        if (bl3 || bl3) return;
        if (class_3102.field_1724 == null) {
            if (bl3) return;
            return;
        }
        if (bl3 || bl3) return;
        class_2338 class_23382 = class_2338.method_49637((double)class_3102.field_1724.method_23317(), (double)(class_3102.field_1724.method_23318() - gc.iykl("iyup", iyuo(int ), (int)115)), (double)class_3102.field_1724.method_23321());
        if (bl3 || bl3) return;
        if (!class_3102.field_1687.method_8320(class_23382).method_26215()) {
            if (bl3) return;
            v0 = gc.iykl("iyuq", iyks(int ), (int)143);
            if (bl2) {
                throw null;
            }
        } else {
            if (bl3 || bl3) return;
            v0 = callSite2 = gc.iykl("iyur", iyks(int ), (int)144);
        }
        if (bl3 || bl3) return;
        if (callSite2 != false) {
            if (bl3 || bl3) return;
            class_3102.field_1690.field_1832.method_23481((boolean)gc.iykl("iyus", iyks(int ), (int)145));
            if (bl3 || bl3) return;
            return;
        }
        if (bl3 || bl3) return;
        double d2 = class_3102.field_1724.method_23317() - (double)class_23382.method_10263();
        if (bl3 || bl3) return;
        double d3 = class_3102.field_1724.method_23321() - (double)class_23382.method_10260();
        if (bl3 || bl3) return;
        double d4 = Math.min(Math.min(d2, 1.0 - d2), Math.min(d3, 1.0 - d3));
        if (bl3 || bl3) return;
        class_304 class_3042 = class_3102.field_1690.field_1832;
        if (d4 < gc.iykl("iyut", iyuo(int ), (int)116)) {
            callSite = gc.iykl("iyuu", iyks(int ), (int)146);
            if (bl2) {
                throw null;
            }
        } else {
            callSite = gc.iykl("iyuv", iyks(int ), (int)147);
        }
        class_3042.method_23481((boolean)callSite);
        if (!bl3 && !bl3) return;
    }

    private static /* synthetic */ void izvb() {
        gc.iykj[200] = -1808421165047464625L;
        gc.iykj[201] = -7961908710978729492L;
        gc.iykj[202] = 6484581301436345031L;
    }

    private static /* synthetic */ void izuu() {
        gc.iykq[200] = -2044946775;
        gc.iykq[201] = -2007236008;
        gc.iykq[202] = -983846489;
        gc.iykq[203] = -404050410;
        gc.iykq[204] = 1151589169;
        gc.iykq[205] = 142445043;
        gc.iykq[206] = -678974916;
        gc.iykq[207] = 1674493523;
        gc.iykq[208] = 692704774;
        gc.iykq[209] = 1643788973;
        gc.iykq[210] = -899110897;
        gc.iykq[211] = 1674756737;
        gc.iykq[212] = -1334877777;
        gc.iykq[213] = 128402;
        gc.iykq[214] = -1310915995;
        gc.iykq[215] = -275124278;
        gc.iykq[216] = 561411859;
        gc.iykq[217] = 327858030;
        gc.iykq[218] = 513828793;
        gc.iykq[219] = -403278713;
        gc.iykq[220] = -991303565;
        gc.iykq[221] = 1159883443;
        gc.iykq[222] = -1922755636;
        gc.iykq[223] = 766211773;
        gc.iykq[224] = -915318886;
        gc.iykq[225] = 1878094751;
        gc.iykq[226] = -1174285568;
        gc.iykq[227] = 1282537193;
        gc.iykq[228] = 2102516562;
        gc.iykq[229] = -786998626;
        gc.iykq[230] = -684955930;
        gc.iykq[231] = -1138582784;
        gc.iykq[232] = 961480730;
        gc.iykq[233] = 1430075628;
        gc.iykq[234] = -2103631851;
        gc.iykq[235] = 2005050800;
        gc.iykq[236] = -1496887275;
        gc.iykq[237] = -36713602;
        gc.iykq[238] = 770818365;
        gc.iykq[239] = 726834668;
        gc.iykq[240] = -652087740;
        gc.iykq[241] = 1645039650;
        gc.iykq[242] = -1686962309;
        gc.iykq[243] = -316577113;
        gc.iykq[244] = 1632882935;
        gc.iykq[245] = 607228132;
        gc.iykq[246] = -1941883922;
        gc.iykq[247] = -1739659554;
        gc.iykq[248] = 614741888;
        gc.iykq[249] = -2100510284;
        gc.iykq[250] = 950145673;
        gc.iykq[251] = 1020604892;
        gc.iykq[252] = 1563490090;
        gc.iykq[253] = -1879567291;
        gc.iykq[254] = 477264426;
        gc.iykq[255] = -1759494215;
        gc.iykq[256] = -29516951;
        gc.iykq[257] = -974838217;
        gc.iykq[258] = -698568213;
        gc.iykq[259] = 917466659;
        gc.iykq[260] = 1868027218;
        gc.iykq[261] = -931943049;
        gc.iykq[262] = -1314609224;
        gc.iykq[263] = -1296752288;
        gc.iykq[264] = -1827738035;
        gc.iykq[265] = -397736218;
        gc.iykq[266] = 627115042;
        gc.iykq[267] = 1017425299;
        gc.iykq[268] = -1348259320;
        gc.iykq[269] = 330009400;
        gc.iykq[270] = 1779509105;
        gc.iykq[271] = -1193340867;
        gc.iykq[272] = -1662155858;
        gc.iykq[273] = 369479198;
        gc.iykq[274] = -588422145;
        gc.iykq[275] = -1179435514;
        gc.iykq[276] = -1844538792;
        gc.iykq[277] = -2019284057;
        gc.iykq[278] = 1884293571;
        gc.iykq[279] = -1058076483;
        gc.iykq[280] = -1032298301;
        gc.iykq[281] = 1821722595;
        gc.iykq[282] = -412412116;
        gc.iykq[283] = -997596771;
        gc.iykq[284] = 1406932035;
        gc.iykq[285] = -204708663;
        gc.iykq[286] = 711435056;
        gc.iykq[287] = 1539505106;
        gc.iykq[288] = -256819464;
        gc.iykq[289] = -413748646;
        gc.iykq[290] = 206132387;
        gc.iykq[291] = 933270330;
        gc.iykq[292] = -1532290754;
        gc.iykq[293] = 1792212229;
        gc.iykq[294] = 1723955916;
        gc.iykq[295] = -1537844369;
        gc.iykq[296] = -859611543;
        gc.iykq[297] = -2142544307;
        gc.iykq[298] = 1321376564;
        gc.iykq[299] = 351623941;
    }

    private static /* synthetic */ void izvc() {
        gc.iykk[0] = -7178816510545808706L;
        gc.iykk[1] = 3686659351429321853L;
        gc.iykk[2] = 1908633810856665595L;
        gc.iykk[3] = 5783201674991037620L;
        gc.iykk[4] = 4758808402961001143L;
        gc.iykk[5] = -3700039467455614595L;
        gc.iykk[6] = 3827217340790291527L;
        gc.iykk[7] = 226385818242272529L;
        gc.iykk[8] = 6811255625149908062L;
        gc.iykk[9] = -1798976154407384993L;
        gc.iykk[10] = -1351123110669403748L;
        gc.iykk[11] = 8093998215636538739L;
        gc.iykk[12] = 2681756894571007759L;
        gc.iykk[13] = 282445444646878390L;
        gc.iykk[14] = 6908804193119417129L;
        gc.iykk[15] = -5048837196171108904L;
        gc.iykk[16] = -5989834744805120228L;
        gc.iykk[17] = -7170179360420034679L;
        gc.iykk[18] = 7599513180879154905L;
        gc.iykk[19] = -6057805016133133278L;
        gc.iykk[20] = -7765714032417378833L;
        gc.iykk[21] = -5458711083767412326L;
        gc.iykk[22] = -7805908983365237625L;
        gc.iykk[23] = 1209482647341675261L;
        gc.iykk[24] = -1845085363398272593L;
        gc.iykk[25] = -4568615563201734083L;
        gc.iykk[26] = 9184165587853516841L;
        gc.iykk[27] = -1779774632634772352L;
        gc.iykk[28] = -1024417549139130277L;
        gc.iykk[29] = -3421918232569203040L;
        gc.iykk[30] = -4874638557281546475L;
        gc.iykk[31] = 6645577408549421588L;
        gc.iykk[32] = -7394735164332680552L;
        gc.iykk[33] = -2534706880838369017L;
        gc.iykk[34] = -7628183834419962611L;
        gc.iykk[35] = -8095471043065679187L;
        gc.iykk[36] = 2284226937346512415L;
        gc.iykk[37] = -8094817599636897062L;
        gc.iykk[38] = 2512549907513867188L;
        gc.iykk[39] = -3913726147515354296L;
        gc.iykk[40] = 6645947891221794826L;
        gc.iykk[41] = -4383471577764443989L;
        gc.iykk[42] = 1696641416713045249L;
        gc.iykk[43] = 2585143587828436616L;
        gc.iykk[44] = -8860167966482075584L;
        gc.iykk[45] = -5501306706238520252L;
        gc.iykk[46] = -4918056837853327408L;
        gc.iykk[47] = -1798276729877236727L;
        gc.iykk[48] = 8610679463126648312L;
        gc.iykk[49] = 4751448207717355733L;
        gc.iykk[50] = 431975570260851860L;
        gc.iykk[51] = -8031705197329014120L;
        gc.iykk[52] = 8663048569286605119L;
        gc.iykk[53] = 6908955290534833103L;
        gc.iykk[54] = -643033258581203231L;
        gc.iykk[55] = -8420526188180658721L;
        gc.iykk[56] = 9143844731383251997L;
        gc.iykk[57] = -807747288503736944L;
        gc.iykk[58] = -6966892404381192276L;
        gc.iykk[59] = -4859364556158212083L;
        gc.iykk[60] = -4140061231568828487L;
        gc.iykk[61] = 7153766424035636694L;
        gc.iykk[62] = 8166490127997763160L;
        gc.iykk[63] = -8250335746131964993L;
        gc.iykk[64] = 9013610595987418178L;
        gc.iykk[65] = 2955089203677961981L;
        gc.iykk[66] = -1351829382971620855L;
        gc.iykk[67] = -5802783332088481308L;
        gc.iykk[68] = 5461213239227827108L;
        gc.iykk[69] = -8614186782219838558L;
        gc.iykk[70] = 8416654401363696100L;
        gc.iykk[71] = -8235221738969326394L;
        gc.iykk[72] = 4100834061665892516L;
        gc.iykk[73] = 6786133843321310165L;
        gc.iykk[74] = 6507557558718749554L;
        gc.iykk[75] = 6832369845720845282L;
        gc.iykk[76] = 8361628871177989236L;
        gc.iykk[77] = -469031530579163487L;
        gc.iykk[78] = 1031952476795782337L;
        gc.iykk[79] = -1162249032967315921L;
        gc.iykk[80] = 5315417904281131856L;
        gc.iykk[81] = -7607189695666702303L;
        gc.iykk[82] = -3437943288773835717L;
        gc.iykk[83] = 2519998525744249395L;
        gc.iykk[84] = 1204776150702431599L;
        gc.iykk[85] = 2925803456819264197L;
        gc.iykk[86] = 8943949300475860743L;
        gc.iykk[87] = -2880981036761602412L;
        gc.iykk[88] = -462368182516867495L;
        gc.iykk[89] = 4894720470549107023L;
        gc.iykk[90] = -6784397264100422052L;
        gc.iykk[91] = -1383468296861194945L;
        gc.iykk[92] = 1678015010507870455L;
        gc.iykk[93] = -8852313751749122827L;
        gc.iykk[94] = 6769225808478900648L;
        gc.iykk[95] = 2112515614073306969L;
        gc.iykk[96] = 1928900789343321133L;
        gc.iykk[97] = 2279401223828207039L;
        gc.iykk[98] = 5276977591015643380L;
        gc.iykk[99] = -5947534112039247525L;
    }

    private static /* synthetic */ void izuy() {
        gc.iykq[600] = 774886612;
        gc.iykq[601] = -1480119118;
        gc.iykq[602] = 1142603621;
        gc.iykq[603] = -587822315;
        gc.iykq[604] = -123736634;
        gc.iykq[605] = -1790954968;
        gc.iykq[606] = 2083674098;
        gc.iykq[607] = 1844977141;
        gc.iykq[608] = 645893252;
        gc.iykq[609] = 805730177;
    }

    private static /* synthetic */ void izuq() {
        gc.iykp[500] = 597447242;
        gc.iykp[501] = 163823488;
        gc.iykp[502] = 1140894589;
        gc.iykp[503] = 754960553;
        gc.iykp[504] = -1195426739;
        gc.iykp[505] = -652626853;
        gc.iykp[506] = -1615863019;
        gc.iykp[507] = -68533803;
        gc.iykp[508] = 1303376956;
        gc.iykp[509] = -1913254532;
        gc.iykp[510] = -1522691867;
        gc.iykp[511] = -790277877;
        gc.iykp[512] = -2020383611;
        gc.iykp[513] = -1681340968;
        gc.iykp[514] = 1753849590;
        gc.iykp[515] = 1817864988;
        gc.iykp[516] = 1185411015;
        gc.iykp[517] = 1477328243;
        gc.iykp[518] = -2022857682;
        gc.iykp[519] = 356084951;
        gc.iykp[520] = -1344334434;
        gc.iykp[521] = -1178880048;
        gc.iykp[522] = 180968212;
        gc.iykp[523] = -1814769074;
        gc.iykp[524] = -2147375403;
        gc.iykp[525] = 1090799862;
        gc.iykp[526] = 1437404815;
        gc.iykp[527] = -129463314;
        gc.iykp[528] = 602125059;
        gc.iykp[529] = -1654130803;
        gc.iykp[530] = -42707421;
        gc.iykp[531] = 731462293;
        gc.iykp[532] = -1238587741;
        gc.iykp[533] = 1162772501;
        gc.iykp[534] = 1300279504;
        gc.iykp[535] = 1598411402;
        gc.iykp[536] = 410995476;
        gc.iykp[537] = -626959939;
        gc.iykp[538] = -64431686;
        gc.iykp[539] = 1646389618;
        gc.iykp[540] = 1112841933;
        gc.iykp[541] = 149872695;
        gc.iykp[542] = -1704271827;
        gc.iykp[543] = -2115029268;
        gc.iykp[544] = 1033353525;
        gc.iykp[545] = -1378170378;
        gc.iykp[546] = 171729426;
        gc.iykp[547] = -1013905239;
        gc.iykp[548] = -12571733;
        gc.iykp[549] = 574507770;
        gc.iykp[550] = -650808007;
        gc.iykp[551] = -1206080195;
        gc.iykp[552] = -334784441;
        gc.iykp[553] = -1818457334;
        gc.iykp[554] = -1542974335;
        gc.iykp[555] = 666246432;
        gc.iykp[556] = -296849532;
        gc.iykp[557] = -1598664462;
        gc.iykp[558] = -1677776206;
        gc.iykp[559] = -732404759;
        gc.iykp[560] = 1155466804;
        gc.iykp[561] = 324143311;
        gc.iykp[562] = 937264473;
        gc.iykp[563] = 446532341;
        gc.iykp[564] = -744653038;
        gc.iykp[565] = 1651371859;
        gc.iykp[566] = -619972985;
        gc.iykp[567] = -1646809767;
        gc.iykp[568] = 1915352082;
        gc.iykp[569] = 404126203;
        gc.iykp[570] = -1766727058;
        gc.iykp[571] = 251567681;
        gc.iykp[572] = 1804712011;
        gc.iykp[573] = 1199152497;
        gc.iykp[574] = 752950598;
        gc.iykp[575] = -1568218912;
        gc.iykp[576] = 694818168;
        gc.iykp[577] = 1543995561;
        gc.iykp[578] = -1325550344;
        gc.iykp[579] = 1937821459;
        gc.iykp[580] = -2121996820;
        gc.iykp[581] = 700725500;
        gc.iykp[582] = -1175195333;
        gc.iykp[583] = -945184489;
        gc.iykp[584] = -1026602328;
        gc.iykp[585] = 605484473;
        gc.iykp[586] = 320502174;
        gc.iykp[587] = 1526477509;
        gc.iykp[588] = -695099823;
        gc.iykp[589] = -999817134;
        gc.iykp[590] = 2074394094;
        gc.iykp[591] = 951044364;
        gc.iykp[592] = -1125343693;
        gc.iykp[593] = 1170188144;
        gc.iykp[594] = -332335999;
        gc.iykp[595] = 155493731;
        gc.iykp[596] = -797163319;
        gc.iykp[597] = 1743224029;
        gc.iykp[598] = 327554164;
        gc.iykp[599] = -1713465807;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public int getOldSlot() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = gc.qv - gc.iykl("iztb", iyki(int ), (int)189)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == gc.iykl("iztc", iyks(int ), (int)588)) break;
            v0 /* !! */  = (long)gc.iykl("iztd", iyks(int ), (int)589);
        }
        var3_1 = gc.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = gc.qv - gc.iykl("izte", iyki(int ), (int)190)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == gc.iykl("iztf", iyks(int ), (int)590)) break;
            v1 /* !! */  = (long)gc.iykl("iztg", iyks(int ), (int)591);
        }
        var2_2 /* !! */  = gc.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = gc.qv - gc.iykl("izth", iyki(int ), (int)191)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == gc.iykl("izti", iyks(int ), (int)592)) break;
            v2 /* !! */  = (long)gc.iykl("iztj", iyks(int ), (int)593);
        }
        var1_3 = gc.a;
        if (!var3_1) ** GOTO lbl28
        throw null;
        {
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var2_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return (int)gc.iykl("iztk", iyks(int ), (int)594);
                }
lbl28:
                // 1 sources

                if (var1_3 || var1_3) continue block9;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_3 = gc.qv - gc.iykl("iztl", iyki(int ), (int)192)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == gc.iykl("iztm", iyks(int ), (int)595)) break;
                    v3 /* !! */  = (long)gc.iykl("iztn", iyks(int ), (int)596);
                }
                return this.oldSlot;
lbl36:
                // 2 sources

                case 0: {
                    do {
                        var2_2 /* !! */  = (int)gc.iykl("izto", iyks(int ), (int)597);
                    } while (!var3_1);
                    throw null;
                }
                case 1: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var2_2 /* !! */  = (int)gc.iykl("iztp", iyks(int ), (int)598);
                        if (!var3_1) break block9;
                        throw null;
                    }
                }
                case 2: {
                    var2_2 /* !! */  = (int)gc.iykl("iztq", iyks(int ), (int)599);
                    if (!var3_1) ** GOTO lbl36
                    throw null;
                }
                case 3: 
            }
        }
        var2_2 /* !! */  = (int)gc.iykl("iztr", iyks(int ), (int)600);
        ** while (!var3_1)
lbl53:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ long iyki(int n2) {
        return iykj[n2] ^ iykk[n2];
    }

    private static /* synthetic */ void izup() {
        gc.iykp[400] = -1877207881;
        gc.iykp[401] = -1848375035;
        gc.iykp[402] = -1693442385;
        gc.iykp[403] = 1860518657;
        gc.iykp[404] = 1443527060;
        gc.iykp[405] = 1536268029;
        gc.iykp[406] = -762949418;
        gc.iykp[407] = -603179584;
        gc.iykp[408] = 1029460834;
        gc.iykp[409] = 1972657698;
        gc.iykp[410] = 248721867;
        gc.iykp[411] = -494040512;
        gc.iykp[412] = 1547926144;
        gc.iykp[413] = 1589797695;
        gc.iykp[414] = 1918961017;
        gc.iykp[415] = 337254632;
        gc.iykp[416] = -1391565412;
        gc.iykp[417] = 1321804717;
        gc.iykp[418] = -1491608419;
        gc.iykp[419] = -662943147;
        gc.iykp[420] = 1812060028;
        gc.iykp[421] = -298023558;
        gc.iykp[422] = -409922437;
        gc.iykp[423] = -1409677410;
        gc.iykp[424] = -1236795600;
        gc.iykp[425] = 2055390636;
        gc.iykp[426] = -1729689062;
        gc.iykp[427] = -654144678;
        gc.iykp[428] = 408178852;
        gc.iykp[429] = -1323182;
        gc.iykp[430] = -414091798;
        gc.iykp[431] = -1696403566;
        gc.iykp[432] = -1235512110;
        gc.iykp[433] = 456224095;
        gc.iykp[434] = -1006090784;
        gc.iykp[435] = 262934841;
        gc.iykp[436] = -83485636;
        gc.iykp[437] = -435811620;
        gc.iykp[438] = 1921864105;
        gc.iykp[439] = -2015242670;
        gc.iykp[440] = 1701751705;
        gc.iykp[441] = 1993630393;
        gc.iykp[442] = 1257381370;
        gc.iykp[443] = 1806220469;
        gc.iykp[444] = 862412682;
        gc.iykp[445] = 715978900;
        gc.iykp[446] = 383751777;
        gc.iykp[447] = -963297450;
        gc.iykp[448] = -140740349;
        gc.iykp[449] = 1019699864;
        gc.iykp[450] = -111217680;
        gc.iykp[451] = -636345123;
        gc.iykp[452] = 124676164;
        gc.iykp[453] = -821025047;
        gc.iykp[454] = -248561785;
        gc.iykp[455] = 599399744;
        gc.iykp[456] = -2102286323;
        gc.iykp[457] = 1519399444;
        gc.iykp[458] = -326489170;
        gc.iykp[459] = -1351767102;
        gc.iykp[460] = -1822933325;
        gc.iykp[461] = -1345902405;
        gc.iykp[462] = -466472528;
        gc.iykp[463] = -480130365;
        gc.iykp[464] = 1056044935;
        gc.iykp[465] = 1088559721;
        gc.iykp[466] = -1563480825;
        gc.iykp[467] = -395325741;
        gc.iykp[468] = 757967826;
        gc.iykp[469] = 1716279506;
        gc.iykp[470] = 205382839;
        gc.iykp[471] = -1208376689;
        gc.iykp[472] = 509028702;
        gc.iykp[473] = -1313835455;
        gc.iykp[474] = -372623637;
        gc.iykp[475] = 746342541;
        gc.iykp[476] = 1215467889;
        gc.iykp[477] = -2141474626;
        gc.iykp[478] = 1804787319;
        gc.iykp[479] = -595777378;
        gc.iykp[480] = 1515143132;
        gc.iykp[481] = -1537847892;
        gc.iykp[482] = -539950878;
        gc.iykp[483] = -1969569816;
        gc.iykp[484] = -1225158935;
        gc.iykp[485] = -1079530982;
        gc.iykp[486] = 900529505;
        gc.iykp[487] = -158023193;
        gc.iykp[488] = 1788087618;
        gc.iykp[489] = 1734672911;
        gc.iykp[490] = 233647718;
        gc.iykp[491] = -1548990270;
        gc.iykp[492] = 152434913;
        gc.iykp[493] = 815150556;
        gc.iykp[494] = -1486712097;
        gc.iykp[495] = 2074279358;
        gc.iykp[496] = -789179790;
        gc.iykp[497] = -940831565;
        gc.iykp[498] = 1522700669;
        gc.iykp[499] = 682253132;
    }

    private static /* synthetic */ int iyks(int n2) {
        return iykp[n2] ^ iykq[n2];
    }

    private static /* synthetic */ void izuw() {
        gc.iykq[400] = -1877207887;
        gc.iykq[401] = -1848375003;
        gc.iykq[402] = -1693442397;
        gc.iykq[403] = 1860518676;
        gc.iykq[404] = 1443527040;
        gc.iykq[405] = 1536268007;
        gc.iykq[406] = -762949416;
        gc.iykq[407] = -603179576;
        gc.iykq[408] = 1029460839;
        gc.iykq[409] = 1972657716;
        gc.iykq[410] = 248721885;
        gc.iykq[411] = -494040481;
        gc.iykq[412] = 1547926174;
        gc.iykq[413] = -1589797696;
        gc.iykq[414] = 1114041845;
        gc.iykq[415] = 337254633;
        gc.iykq[416] = -701724668;
        gc.iykq[417] = 1937398389;
        gc.iykq[418] = -1491608418;
        gc.iykq[419] = -662943147;
        gc.iykq[420] = 1812060028;
        gc.iykq[421] = -298023560;
        gc.iykq[422] = -661801882;
        gc.iykq[423] = -389150818;
        gc.iykq[424] = -185336016;
        gc.iykq[425] = -1204370004;
        gc.iykq[426] = 1540557338;
        gc.iykq[427] = -654144677;
        gc.iykq[428] = 408178879;
        gc.iykq[429] = -1323175;
        gc.iykq[430] = -414091804;
        gc.iykq[431] = -1696403570;
        gc.iykq[432] = -1235512127;
        gc.iykq[433] = 456224078;
        gc.iykq[434] = -1006090760;
        gc.iykq[435] = 262934835;
        gc.iykq[436] = -83485664;
        gc.iykq[437] = -435811638;
        gc.iykq[438] = 1921864123;
        gc.iykq[439] = -2015242680;
        gc.iykq[440] = 1701751704;
        gc.iykq[441] = 1993630370;
        gc.iykq[442] = 1257381349;
        gc.iykq[443] = 1806220475;
        gc.iykq[444] = 862412681;
        gc.iykq[445] = 715978888;
        gc.iykq[446] = 383751797;
        gc.iykq[447] = -963297452;
        gc.iykq[448] = -140740339;
        gc.iykq[449] = 1019699855;
        gc.iykq[450] = -111217692;
        gc.iykq[451] = -636345135;
        gc.iykq[452] = 124676173;
        gc.iykq[453] = -821025042;
        gc.iykq[454] = -248561763;
        gc.iykq[455] = 599399762;
        gc.iykq[456] = -2102286320;
        gc.iykq[457] = 1519399427;
        gc.iykq[458] = -326489173;
        gc.iykq[459] = -1813818889;
        gc.iykq[460] = -1822933356;
        gc.iykq[461] = -1345902437;
        gc.iykq[462] = -466472525;
        gc.iykq[463] = -480130361;
        gc.iykq[464] = 1056044961;
        gc.iykq[465] = 1088559728;
        gc.iykq[466] = -1563480795;
        gc.iykq[467] = -395325741;
        gc.iykq[468] = 757967834;
        gc.iykq[469] = 1716279538;
        gc.iykq[470] = 205382830;
        gc.iykq[471] = -1208376678;
        gc.iykq[472] = 509028693;
        gc.iykq[473] = -1313835446;
        gc.iykq[474] = -372623632;
        gc.iykq[475] = 746342575;
        gc.iykq[476] = 1215467886;
        gc.iykq[477] = -2141474661;
        gc.iykq[478] = 1804787317;
        gc.iykq[479] = -595777384;
        gc.iykq[480] = 1515143128;
        gc.iykq[481] = -1537847926;
        gc.iykq[482] = -539950880;
        gc.iykq[483] = -1969569799;
        gc.iykq[484] = -1225158924;
        gc.iykq[485] = -1079531008;
        gc.iykq[486] = 900529509;
        gc.iykq[487] = -158023182;
        gc.iykq[488] = 1788087653;
        gc.iykq[489] = 1734672942;
        gc.iykq[490] = 233647738;
        gc.iykq[491] = -1548990268;
        gc.iykq[492] = 152434916;
        gc.iykq[493] = 815150545;
        gc.iykq[494] = -1486712114;
        gc.iykq[495] = 2074279354;
        gc.iykq[496] = -789179824;
        gc.iykq[497] = -940831562;
        gc.iykq[498] = 1522700666;
        gc.iykq[499] = 682253126;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private class_243 getMovementInput() {
        block78: {
            block77: {
                block76: {
                    block75: {
                        var15_1 = gc.c;
                        var14_2 /* !! */  = gc.b;
                        var13_3 = gc.a;
                        if (var15_1) {
                            throw null;
lbl6:
                            // 23 sources

                            return null;
                        }
                        if (var13_3 || var13_3) ** GOTO lbl6
                        var1_4 = class_310.method_1551();
                        if (var13_3 || var13_3) ** GOTO lbl6
                        if (var1_4.field_1724 != null) break block75;
                        if (var13_3) ** GOTO lbl6
                        return class_243.field_1353;
                    }
                    if (var13_3 || var13_3) ** GOTO lbl6
                    var2_5 = 0.0f;
                    if (var13_3 || var13_3) ** GOTO lbl6
                    var3_6 = 0.0f;
                    if (var13_3 || var13_3) ** GOTO lbl6
                    if (!var1_4.field_1690.field_1894.method_1434()) break block76;
                    if (var13_3) ** GOTO lbl6
                    var2_5 += 1.0f;
                    if (var13_3) ** GOTO lbl6
                }
                if (var13_3 || var13_3) ** GOTO lbl6
                if (!var1_4.field_1690.field_1881.method_1434()) break block77;
                if (var13_3) ** GOTO lbl6
                var2_5 -= 1.0f;
                if (var13_3) ** GOTO lbl6
            }
            if (var13_3 || var13_3) ** GOTO lbl6
            if (!var1_4.field_1690.field_1913.method_1434()) break block78;
            if (var13_3) ** GOTO lbl6
            var3_6 += 1.0f;
            if (var13_3) ** GOTO lbl6
        }
        if (var13_3 || var13_3) ** GOTO lbl6
        if (!var1_4.field_1690.field_1849.method_1434()) ** GOTO lbl45
        if (var14_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var14_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var13_3) ** GOTO lbl6
                var3_6 -= 1.0f;
                if (var13_3) ** GOTO lbl6
lbl45:
                // 2 sources

                if (var13_3 || var13_3) ** GOTO lbl6
                var4_7 = var1_4.field_1724.method_36454() * gc.iykl("izmw", iyko(int ), (int)459);
                if (var13_3 || var13_3) ** GOTO lbl6
                var5_8 = Math.sin(var4_7);
                if (var13_3 || var13_3) ** GOTO lbl6
                var7_9 = Math.cos(var4_7);
                if (var13_3 || var13_3) ** GOTO lbl6
                var9_10 = (double)var3_6 * var7_9 - (double)var2_5 * var5_8;
                if (var13_3 || var13_3) ** GOTO lbl6
                var11_11 = (double)var2_5 * var7_9 + (double)var3_6 * var5_8;
                if (!var13_3 && !var13_3) ** break;
                ** continue;
                return new class_243(var9_10, 0.0, var11_11);
            }
            case 0: {
                var14_2 /* !! */  = (int)gc.iykl("izmx", iyks(int ), (int)460);
                if (var15_1) {
                    throw null;
                }
                ** GOTO lbl198
            }
            case 1: {
                var14_2 /* !! */  = (int)gc.iykl("izmy", iyks(int ), (int)461);
                if (var15_1) {
                    throw null;
                }
                ** GOTO lbl151
            }
lbl68:
            // 2 sources

            case 2: {
                var14_2 /* !! */  = (int)gc.iykl("izmz", iyks(int ), (int)462);
                if (var15_1) {
                    throw null;
                }
                ** GOTO lbl190
            }
lbl73:
            // 3 sources

            case 3: {
                var14_2 /* !! */  = (int)gc.iykl("izna", iyks(int ), (int)463);
                if (var15_1) {
                    throw null;
                }
                ** GOTO lbl156
            }
lbl78:
            // 3 sources

            case 4: {
                var14_2 /* !! */  = (int)gc.iykl("iznb", iyks(int ), (int)464);
                if (var15_1) {
                    throw null;
                }
                ** GOTO lbl120
            }
lbl83:
            // 3 sources

            case 5: {
                var14_2 /* !! */  = (int)gc.iykl("iznc", iyks(int ), (int)465);
                if (var15_1) {
                    throw null;
                }
                ** GOTO lbl180
            }
            case 6: {
                var14_2 /* !! */  = (int)gc.iykl("iznd", iyks(int ), (int)466);
                if (!var15_1) ** GOTO lbl78
                throw null;
            }
            case 7: {
                var14_2 /* !! */  = (int)gc.iykl("izne", iyks(int ), (int)467);
                if (!var15_1) ** GOTO lbl83
                throw null;
            }
lbl96:
            // 3 sources

            case 8: {
                var14_2 /* !! */  = (int)gc.iykl("iznf", iyks(int ), (int)468);
                if (!var15_1) break;
                throw null;
            }
lbl100:
            // 3 sources

            case 9: {
                var14_2 /* !! */  = (int)gc.iykl("izng", iyks(int ), (int)469);
                if (var15_1) {
                    throw null;
                }
                ** GOTO lbl161
            }
lbl105:
            // 2 sources

            case 10: {
                var14_2 /* !! */  = (int)gc.iykl("iznh", iyks(int ), (int)470);
                if (var15_1) {
                    throw null;
                }
                ** GOTO lbl226
            }
lbl110:
            // 2 sources

            case 11: {
                var14_2 /* !! */  = (int)gc.iykl("izni", iyks(int ), (int)471);
                if (var15_1) {
                    throw null;
                }
                ** GOTO lbl190
            }
            case 12: {
                var14_2 /* !! */  = (int)gc.iykl("iznj", iyks(int ), (int)472);
                if (var15_1) {
                    throw null;
                }
                ** GOTO lbl175
            }
lbl120:
            // 5 sources

            case 13: {
                var14_2 /* !! */  = (int)gc.iykl("iznk", iyks(int ), (int)473);
                if (var15_1) {
                    throw null;
                }
                ** GOTO lbl166
            }
            case 14: {
                var14_2 /* !! */  = (int)gc.iykl("iznl", iyks(int ), (int)474);
                if (!var15_1) ** GOTO lbl96
                throw null;
            }
            case 15: {
                var14_2 /* !! */  = (int)gc.iykl("iznm", iyks(int ), (int)475);
                if (var15_1) {
                    throw null;
                }
                ** GOTO lbl198
            }
            case 16: {
                var14_2 /* !! */  = (int)gc.iykl("iznn", iyks(int ), (int)476);
                if (!var15_1) ** GOTO lbl100
                throw null;
            }
            case 17: {
                var14_2 /* !! */  = (int)gc.iykl("izno", iyks(int ), (int)477);
                if (var15_1) {
                    throw null;
                }
                ** GOTO lbl180
            }
            case 18: {
                var14_2 /* !! */  = (int)gc.iykl("iznp", iyks(int ), (int)478);
                if (!var15_1) ** GOTO lbl120
                throw null;
            }
lbl147:
            // 2 sources

            case 19: {
                var14_2 /* !! */  = (int)gc.iykl("iznq", iyks(int ), (int)479);
                if (!var15_1) ** GOTO lbl100
                throw null;
            }
lbl151:
            // 2 sources

            case 20: {
                var14_2 /* !! */  = (int)gc.iykl("iznr", iyks(int ), (int)480);
                if (var15_1) {
                    throw null;
                }
                ** GOTO lbl214
            }
lbl156:
            // 2 sources

            case 21: {
                var14_2 /* !! */  = (int)gc.iykl("izns", iyks(int ), (int)481);
                if (var15_1) {
                    throw null;
                }
                ** GOTO lbl175
            }
lbl161:
            // 2 sources

            case 22: {
                var14_2 /* !! */  = (int)gc.iykl("iznt", iyks(int ), (int)482);
                if (var15_1) {
                    throw null;
                }
                ** GOTO lbl180
            }
lbl166:
            // 2 sources

            case 23: {
                var14_2 /* !! */  = (int)gc.iykl("iznu", iyks(int ), (int)483);
                if (!var15_1) ** GOTO lbl78
                throw null;
            }
            case 24: {
                var14_2 /* !! */  = (int)gc.iykl("iznv", iyks(int ), (int)484);
                if (var15_1) {
                    throw null;
                }
                ** GOTO lbl218
            }
lbl175:
            // 3 sources

            case 25: {
                var14_2 /* !! */  = (int)gc.iykl("iznw", iyks(int ), (int)485);
                if (var15_1) {
                    throw null;
                }
                ** GOTO lbl210
            }
lbl180:
            // 4 sources

            case 26: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var14_2 /* !! */  = (int)gc.iykl("iznx", iyks(int ), (int)486);
                    if (var15_1) {
                        throw null;
                    }
                    ** GOTO lbl230
                    break;
                }
            }
            case 27: {
                var14_2 /* !! */  = (int)gc.iykl("izny", iyks(int ), (int)487);
                if (!var15_1) ** GOTO lbl73
                throw null;
            }
lbl190:
            // 3 sources

            case 28: {
                var14_2 /* !! */  = (int)gc.iykl("iznz", iyks(int ), (int)488);
                if (!var15_1) ** GOTO lbl120
                throw null;
            }
            case 29: {
                var14_2 /* !! */  = (int)gc.iykl("izoa", iyks(int ), (int)489);
                if (!var15_1) ** GOTO lbl120
                throw null;
            }
lbl198:
            // 3 sources

            case 30: {
                var14_2 /* !! */  = (int)gc.iykl("izob", iyks(int ), (int)490);
                if (!var15_1) ** GOTO lbl96
                throw null;
            }
            case 31: {
                var14_2 /* !! */  = (int)gc.iykl("izoc", iyks(int ), (int)491);
                if (!var15_1) ** GOTO lbl68
                throw null;
            }
            case 32: {
                var14_2 /* !! */  = (int)gc.iykl("izod", iyks(int ), (int)492);
                if (!var15_1) break;
                throw null;
            }
lbl210:
            // 3 sources

            case 33: {
                var14_2 /* !! */  = (int)gc.iykl("izoe", iyks(int ), (int)493);
                if (!var15_1) ** GOTO lbl105
                throw null;
            }
lbl214:
            // 2 sources

            case 34: {
                var14_2 /* !! */  = (int)gc.iykl("izof", iyks(int ), (int)494);
                if (!var15_1) ** GOTO lbl73
                throw null;
            }
lbl218:
            // 2 sources

            case 35: {
                var14_2 /* !! */  = (int)gc.iykl("izog", iyks(int ), (int)495);
                if (!var15_1) ** GOTO lbl147
                throw null;
            }
            case 36: {
                var14_2 /* !! */  = (int)gc.iykl("izoh", iyks(int ), (int)496);
                if (!var15_1) ** GOTO lbl83
                throw null;
            }
lbl226:
            // 2 sources

            case 37: {
                var14_2 /* !! */  = (int)gc.iykl("izoi", iyks(int ), (int)497);
                if (!var15_1) ** GOTO lbl110
                throw null;
            }
lbl230:
            // 2 sources

            case 38: {
                var14_2 /* !! */  = (int)gc.iykl("izoj", iyks(int ), (int)498);
                if (!var15_1) ** GOTO lbl210
                throw null;
            }
            case 39: 
        }
        var14_2 /* !! */  = (int)gc.iykl("izok", iyks(int ), (int)499);
        ** while (!var15_1)
lbl237:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void izvd() {
        gc.iykk[100] = -707928363317525753L;
        gc.iykk[101] = -4318740947497052963L;
        gc.iykk[102] = -6363958924119979273L;
        gc.iykk[103] = -4035871676259212404L;
        gc.iykk[104] = 9171591246464387462L;
        gc.iykk[105] = 4801990806962921615L;
        gc.iykk[106] = 2591461387108788239L;
        gc.iykk[107] = 5986832934683879055L;
        gc.iykk[108] = -7595899345875429291L;
        gc.iykk[109] = 5249714225876933310L;
        gc.iykk[110] = 4360416915541655855L;
        gc.iykk[111] = 2862367026558041099L;
        gc.iykk[112] = 5624734995014626818L;
        gc.iykk[113] = -8521003842770183603L;
        gc.iykk[114] = 7905977988043617628L;
        gc.iykk[115] = 7182053106527855622L;
        gc.iykk[116] = -3093658263582620626L;
        gc.iykk[117] = 1125670466940244814L;
        gc.iykk[118] = 4421694345250386436L;
        gc.iykk[119] = 4886987914448550391L;
        gc.iykk[120] = -7041910196507156886L;
        gc.iykk[121] = 6916466365728183358L;
        gc.iykk[122] = 2029101195216300240L;
        gc.iykk[123] = 2790413124725796707L;
        gc.iykk[124] = -7539611715097588700L;
        gc.iykk[125] = 750427120545238111L;
        gc.iykk[126] = 8026988307010044348L;
        gc.iykk[127] = -4160204498444988486L;
        gc.iykk[128] = -797516698653188915L;
        gc.iykk[129] = 2791194187857182040L;
        gc.iykk[130] = -5193743760606454738L;
        gc.iykk[131] = 3095994200076551584L;
        gc.iykk[132] = -8922704110876372444L;
        gc.iykk[133] = -1342003502046401249L;
        gc.iykk[134] = 3593342792689085970L;
        gc.iykk[135] = -543637880645597584L;
        gc.iykk[136] = -3273816398081577669L;
        gc.iykk[137] = -5861192355456440910L;
        gc.iykk[138] = -3794275709031369821L;
        gc.iykk[139] = -6999293955217542499L;
        gc.iykk[140] = 1725902885960567242L;
        gc.iykk[141] = 2725712845202285731L;
        gc.iykk[142] = -8124188557240811128L;
        gc.iykk[143] = 503460399000220261L;
        gc.iykk[144] = 4829816334970860586L;
        gc.iykk[145] = -3535806002948077774L;
        gc.iykk[146] = -7130026125821223993L;
        gc.iykk[147] = 3175374278733754169L;
        gc.iykk[148] = 2285102817505847292L;
        gc.iykk[149] = -8336845967152691785L;
        gc.iykk[150] = 2763397661543814089L;
        gc.iykk[151] = 4338727353462935499L;
        gc.iykk[152] = 4651661370711925618L;
        gc.iykk[153] = -2904220423177025701L;
        gc.iykk[154] = -5836212211718873019L;
        gc.iykk[155] = 6265431132442018565L;
        gc.iykk[156] = 6589916158245271531L;
        gc.iykk[157] = -8584901620708250263L;
        gc.iykk[158] = 4250140880811740327L;
        gc.iykk[159] = 6544072116312854228L;
        gc.iykk[160] = 2367812051887430351L;
        gc.iykk[161] = -744651402635463317L;
        gc.iykk[162] = 7655922351794539739L;
        gc.iykk[163] = -3297335726862174341L;
        gc.iykk[164] = 7856780869888194898L;
        gc.iykk[165] = 191695956614389046L;
        gc.iykk[166] = 1691947666567668202L;
        gc.iykk[167] = -7568892669880552713L;
        gc.iykk[168] = -4606874670113671843L;
        gc.iykk[169] = -5584687425515300519L;
        gc.iykk[170] = 3707755597011887482L;
        gc.iykk[171] = 1642129275994209759L;
        gc.iykk[172] = -5213217951917805598L;
        gc.iykk[173] = 1185788822073284410L;
        gc.iykk[174] = 4792267531034995891L;
        gc.iykk[175] = 6233936950784926134L;
        gc.iykk[176] = 1255883441546580276L;
        gc.iykk[177] = -8681210007364037202L;
        gc.iykk[178] = 4341750723159969136L;
        gc.iykk[179] = 1508614302945956161L;
        gc.iykk[180] = 7613689806410444553L;
        gc.iykk[181] = 8101289430402787653L;
        gc.iykk[182] = 337437875605029484L;
        gc.iykk[183] = -5984118269332785578L;
        gc.iykk[184] = 8070948290892086847L;
        gc.iykk[185] = -2982379261096242151L;
        gc.iykk[186] = 197997771320107781L;
        gc.iykk[187] = -3710203357638052462L;
        gc.iykk[188] = 5295442963276042489L;
        gc.iykk[189] = -6762556351240451580L;
        gc.iykk[190] = -6459618059797745253L;
        gc.iykk[191] = 2843421698625468443L;
        gc.iykk[192] = -6589574849174583198L;
        gc.iykk[193] = 3276215905540217768L;
        gc.iykk[194] = 1652613363749253351L;
        gc.iykk[195] = 1396159028204315175L;
        gc.iykk[196] = -1895277233453526135L;
        gc.iykk[197] = -7524714696838668975L;
        gc.iykk[198] = 7689851813355809068L;
        gc.iykk[199] = -8690979183655997677L;
    }

    static {
        iykp = new int[610];
        iykq = new int[610];
        gc.izul();
        gc.izum();
        gc.izun();
        gc.izuo();
        gc.izup();
        gc.izuq();
        gc.izur();
        gc.izus();
        gc.izut();
        gc.izuu();
        gc.izuv();
        gc.izuw();
        gc.izux();
        gc.izuy();
        iykj = new long[203];
        iykk = new long[203];
        gc.izuz();
        gc.izva();
        gc.izvb();
        gc.izvc();
        gc.izvd();
        gc.izve();
    }

    private static /* synthetic */ void izul() {
        gc.iykp[0] = -5424816;
        gc.iykp[1] = -1897060585;
        gc.iykp[2] = -1752278040;
        gc.iykp[3] = -460862802;
        gc.iykp[4] = -2038476419;
        gc.iykp[5] = -181345094;
        gc.iykp[6] = 35411400;
        gc.iykp[7] = -1379788186;
        gc.iykp[8] = 991871097;
        gc.iykp[9] = -1134225386;
        gc.iykp[10] = -299713168;
        gc.iykp[11] = 75385925;
        gc.iykp[12] = 1684159903;
        gc.iykp[13] = 2007694129;
        gc.iykp[14] = -721141491;
        gc.iykp[15] = 1802829557;
        gc.iykp[16] = 1005173707;
        gc.iykp[17] = -2139056916;
        gc.iykp[18] = 171764593;
        gc.iykp[19] = -1598156440;
        gc.iykp[20] = 874544150;
        gc.iykp[21] = -2091225403;
        gc.iykp[22] = 1294994049;
        gc.iykp[23] = -986629058;
        gc.iykp[24] = -443197520;
        gc.iykp[25] = 789687272;
        gc.iykp[26] = 302685309;
        gc.iykp[27] = 998765088;
        gc.iykp[28] = 1446842734;
        gc.iykp[29] = 358673978;
        gc.iykp[30] = 80564407;
        gc.iykp[31] = 283396079;
        gc.iykp[32] = 1916360583;
        gc.iykp[33] = 918033550;
        gc.iykp[34] = -1758999667;
        gc.iykp[35] = -1345227645;
        gc.iykp[36] = 1355676914;
        gc.iykp[37] = -165534816;
        gc.iykp[38] = 8880148;
        gc.iykp[39] = -1448225368;
        gc.iykp[40] = 1284171987;
        gc.iykp[41] = 1115761743;
        gc.iykp[42] = -506435153;
        gc.iykp[43] = 1922722395;
        gc.iykp[44] = 1243977906;
        gc.iykp[45] = 699547815;
        gc.iykp[46] = 1766329265;
        gc.iykp[47] = -1005747436;
        gc.iykp[48] = -382706007;
        gc.iykp[49] = -451717531;
        gc.iykp[50] = -492885141;
        gc.iykp[51] = -2042117335;
        gc.iykp[52] = -990331266;
        gc.iykp[53] = 782635307;
        gc.iykp[54] = -1407295647;
        gc.iykp[55] = 1719129279;
        gc.iykp[56] = 1831761055;
        gc.iykp[57] = 1124662632;
        gc.iykp[58] = 1879030134;
        gc.iykp[59] = -1410848027;
        gc.iykp[60] = 1619891105;
        gc.iykp[61] = -1406211673;
        gc.iykp[62] = -236186910;
        gc.iykp[63] = -1779971173;
        gc.iykp[64] = -794364972;
        gc.iykp[65] = -999473461;
        gc.iykp[66] = -133049902;
        gc.iykp[67] = -715579494;
        gc.iykp[68] = 817931878;
        gc.iykp[69] = -1105535037;
        gc.iykp[70] = 2063962126;
        gc.iykp[71] = -1394115401;
        gc.iykp[72] = 1366937777;
        gc.iykp[73] = -2019500995;
        gc.iykp[74] = -961523124;
        gc.iykp[75] = 448087567;
        gc.iykp[76] = 284802068;
        gc.iykp[77] = -1519977769;
        gc.iykp[78] = -818161060;
        gc.iykp[79] = 2056073829;
        gc.iykp[80] = 1332513003;
        gc.iykp[81] = 1199861608;
        gc.iykp[82] = -1832627932;
        gc.iykp[83] = -1757268599;
        gc.iykp[84] = -45856403;
        gc.iykp[85] = -1440147091;
        gc.iykp[86] = -1681973028;
        gc.iykp[87] = 60022289;
        gc.iykp[88] = -246252859;
        gc.iykp[89] = 343247110;
        gc.iykp[90] = -202566638;
        gc.iykp[91] = -1434979873;
        gc.iykp[92] = 1118928954;
        gc.iykp[93] = 1446854890;
        gc.iykp[94] = 594837078;
        gc.iykp[95] = 780559905;
        gc.iykp[96] = -1234547347;
        gc.iykp[97] = -2009885526;
        gc.iykp[98] = 1121583246;
        gc.iykp[99] = -1522061250;
    }

    private static /* synthetic */ void izuv() {
        gc.iykq[300] = -1429618510;
        gc.iykq[301] = 996594600;
        gc.iykq[302] = 1079937217;
        gc.iykq[303] = -131614960;
        gc.iykq[304] = -941479829;
        gc.iykq[305] = 2044911530;
        gc.iykq[306] = -1232709628;
        gc.iykq[307] = -539020568;
        gc.iykq[308] = 1632318074;
        gc.iykq[309] = -1264346781;
        gc.iykq[310] = -2065382194;
        gc.iykq[311] = -150640593;
        gc.iykq[312] = -227958268;
        gc.iykq[313] = -123023868;
        gc.iykq[314] = 478207241;
        gc.iykq[315] = -1280771309;
        gc.iykq[316] = -710100633;
        gc.iykq[317] = 690821320;
        gc.iykq[318] = 1616905412;
        gc.iykq[319] = 169037520;
        gc.iykq[320] = 0x66AAAE6E;
        gc.iykq[321] = 1309021457;
        gc.iykq[322] = -482629745;
        gc.iykq[323] = 1105624696;
        gc.iykq[324] = -99373633;
        gc.iykq[325] = 1111166672;
        gc.iykq[326] = -204461304;
        gc.iykq[327] = 438017526;
        gc.iykq[328] = 118301080;
        gc.iykq[329] = -1756506838;
        gc.iykq[330] = 932181686;
        gc.iykq[331] = -1883928752;
        gc.iykq[332] = -1737609286;
        gc.iykq[333] = -635989160;
        gc.iykq[334] = 1155441941;
        gc.iykq[335] = 1300019243;
        gc.iykq[336] = 1450287780;
        gc.iykq[337] = -1627532338;
        gc.iykq[338] = -1817857551;
        gc.iykq[339] = 1070496799;
        gc.iykq[340] = -1015505016;
        gc.iykq[341] = -648650629;
        gc.iykq[342] = 212907264;
        gc.iykq[343] = 474850692;
        gc.iykq[344] = 1685318786;
        gc.iykq[345] = 916970630;
        gc.iykq[346] = -471783648;
        gc.iykq[347] = -1117694981;
        gc.iykq[348] = 554800420;
        gc.iykq[349] = -247663254;
        gc.iykq[350] = 1055364596;
        gc.iykq[351] = 1275786168;
        gc.iykq[352] = 2124515903;
        gc.iykq[353] = -1144000568;
        gc.iykq[354] = 1458002249;
        gc.iykq[355] = 888546400;
        gc.iykq[356] = -275895283;
        gc.iykq[357] = 505177724;
        gc.iykq[358] = -597432923;
        gc.iykq[359] = -1690549517;
        gc.iykq[360] = 1742947310;
        gc.iykq[361] = 319877880;
        gc.iykq[362] = 1002965456;
        gc.iykq[363] = 14303994;
        gc.iykq[364] = -1496913508;
        gc.iykq[365] = 229528550;
        gc.iykq[366] = 709909840;
        gc.iykq[367] = -1924504341;
        gc.iykq[368] = 1006240710;
        gc.iykq[369] = -1531763676;
        gc.iykq[370] = 876987678;
        gc.iykq[371] = -1650954543;
        gc.iykq[372] = 2055716319;
        gc.iykq[373] = 43875855;
        gc.iykq[374] = 1628376989;
        gc.iykq[375] = 2117361444;
        gc.iykq[376] = 479870889;
        gc.iykq[377] = 1931853990;
        gc.iykq[378] = 1043854127;
        gc.iykq[379] = -1599057578;
        gc.iykq[380] = 575398417;
        gc.iykq[381] = -40656232;
        gc.iykq[382] = 1399820516;
        gc.iykq[383] = -569827439;
        gc.iykq[384] = 1650883460;
        gc.iykq[385] = 105361964;
        gc.iykq[386] = 955691727;
        gc.iykq[387] = -1701816485;
        gc.iykq[388] = -1403587979;
        gc.iykq[389] = 1428009551;
        gc.iykq[390] = -964966039;
        gc.iykq[391] = 1384356492;
        gc.iykq[392] = 645760692;
        gc.iykq[393] = -1758918920;
        gc.iykq[394] = 2075305400;
        gc.iykq[395] = 479471703;
        gc.iykq[396] = 1856815140;
        gc.iykq[397] = 1696993236;
        gc.iykq[398] = -583571159;
        gc.iykq[399] = 158298762;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public long getEnableTimeMs() {
        v0 /* !! */  = gc.qv;
        if (true) ** GOTO lbl5
        block28: while (true) {
            v0 /* !! */  = (long)(v1 - gc.iykl("izrq", iyki(int ), (int)167));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1119025604: {
                    v1 = gc.iykl("izrr", iyki(int ), (int)168);
                    continue block28;
                }
                case -125690068: {
                    v1 = gc.iykl("izrs", iyki(int ), (int)169);
                    continue block28;
                }
                case -6253801: {
                    break block28;
                }
                case 1770332731: {
                    v1 = gc.iykl("izrt", iyki(int ), (int)170);
                    continue block28;
                }
            }
            break;
        }
        var3_1 = gc.c;
        v2 /* !! */  = gc.qv;
        if (true) ** GOTO lbl22
        block29: while (true) {
            v2 /* !! */  = (long)(v3 - gc.iykl("izru", iyki(int ), (int)171));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1091959077: {
                    v3 = gc.iykl("izrv", iyki(int ), (int)172);
                    continue block29;
                }
                case -614185240: {
                    v3 = gc.iykl("izrw", iyki(int ), (int)173);
                    continue block29;
                }
                case -6253801: {
                    break block29;
                }
                case 797465645: {
                    v3 = gc.iykl("izrx", iyki(int ), (int)174);
                    continue block29;
                }
            }
            break;
        }
        var2_2 /* !! */  = gc.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block30: while (true) {
            block38: {
                switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        v4 /* !! */  = gc.qv;
                        block31: while (true) {
                            switch ((int)v4 /* !! */ ) {
                                case -1944405790: {
                                    v4 /* !! */  = (long)(gc.iykl("izrz", iyki(int ), (int)176) - gc.iykl("izry", iyki(int ), (int)175));
                                    continue block31;
                                }
                                case -6253801: {
                                    break block31;
                                }
                            }
                            break;
                        }
                        var1_3 = gc.a;
                        if (var3_1) {
                            throw null;
                        }
                        if (var1_3 != false) return (long)gc.iykl("izsa", iyki(int ), (int)177);
                        if (var1_3 != false) return (long)gc.iykl("izsa", iyki(int ), (int)177);
                        v5 /* !! */  = gc.qv;
                        block32: while (true) {
                            switch ((int)v5 /* !! */ ) {
                                case -1573310763: {
                                    v6 = gc.iykl("izsc", iyki(int ), (int)179);
                                    ** GOTO lbl66
                                }
                                case -740251918: {
                                    v6 = gc.iykl("izsd", iyki(int ), (int)180);
                                    ** GOTO lbl66
                                }
                                case -6253801: {
                                    return this.enableTimeMs;
                                }
                                case 577231695: {
                                    v6 = gc.iykl("izse", iyki(int ), (int)181);
lbl66:
                                    // 3 sources

                                    v5 /* !! */  = (long)(v6 - gc.iykl("izsb", iyki(int ), (int)178));
                                    continue block32;
                                }
                            }
                            break;
                        }
                        return this.enableTimeMs;
                    }
                    case 0: {
                        var2_2 /* !! */  = (int)gc.iykl("izsf", iyks(int ), (int)573);
                        cfr_temp_0 = 1;
                        if (var3_1) {
                            throw null;
                        }
                        break block38;
                    }
                    case 3: {
                        var2_2 /* !! */  = (int)gc.iykl("izsi", iyks(int ), (int)576);
                        if (var3_1) {
                            throw null;
                        }
                        ** GOTO lbl-1000
                    }
                    case 1: lbl-1000:
                    // 2 sources

                    {
                        var2_2 /* !! */  = (int)gc.iykl("izsg", iyks(int ), (int)574);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 2: 
                }
                ** GOTO lbl89
            }
            do {
                if (true) continue block30;
lbl89:
                // 2 sources

                var2_2 /* !! */  = (int)gc.iykl("izsh", iyks(int ), (int)575);
                cfr_temp_0 = 1;
            } while (!var3_1);
            break;
        }
        throw null;
    }

    private static /* synthetic */ float iyko(int n2) {
        return Float.intBitsToFloat(iykp[n2] ^ iykq[n2]);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public long getLastRightClickTime() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = gc.qv - gc.iykl("izqz", iyki(int ), (int)158)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == gc.iykl("izra", iyks(int ), (int)565)) break;
            v0 /* !! */  = (long)gc.iykl("izrb", iyks(int ), (int)566);
        }
        var3_1 = gc.c;
        v1 /* !! */  = gc.qv;
        if (true) ** GOTO lbl12
        block17: while (true) {
            v1 /* !! */  = (long)(gc.iykl("izrd", iyki(int ), (int)160) - gc.iykl("izrc", iyki(int ), (int)159));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -885154189: {
                    continue block17;
                }
                case -6253801: {
                    break block17;
                }
            }
            break;
        }
        var2_2 /* !! */  = gc.b;
        v2 /* !! */  = gc.qv;
        if (true) ** GOTO lbl22
        block18: while (true) {
            v2 /* !! */  = (long)(v3 - gc.iykl("izre", iyki(int ), (int)161));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1448095953: {
                    v3 = gc.iykl("izrf", iyki(int ), (int)162);
                    continue block18;
                }
                case -490698802: {
                    v3 = gc.iykl("izrg", iyki(int ), (int)163);
                    continue block18;
                }
                case -6253801: {
                    break block18;
                }
                case 958101726: {
                    v3 = gc.iykl("izrh", iyki(int ), (int)164);
                    continue block18;
                }
            }
            break;
        }
        var1_3 = gc.a;
        if (var3_1) {
            throw null;
lbl37:
            // 2 sources

            return (long)gc.iykl("izri", iyki(int ), (int)165);
        }
        if (var1_3) ** GOTO lbl37
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_1 = gc.qv - gc.iykl("izrj", iyki(int ), (int)166)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == gc.iykl("izrk", iyks(int ), (int)567)) break;
                    v4 /* !! */  = (long)gc.iykl("izrl", iyks(int ), (int)568);
                }
                return this.lastRightClickTime;
            }
lbl51:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)gc.iykl("izrm", iyks(int ), (int)569);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl61
            }
            case 1: {
                do {
                    var2_2 /* !! */  = (int)gc.iykl("izrn", iyks(int ), (int)570);
                } while (!var3_1);
                throw null;
            }
lbl61:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)gc.iykl("izro", iyks(int ), (int)571);
                if (!var3_1) ** GOTO lbl51
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)gc.iykl("izrp", iyks(int ), (int)572);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ void izur() {
        gc.iykp[600] = 774886612;
        gc.iykp[601] = 1480119117;
        gc.iykp[602] = -428778301;
        gc.iykp[603] = -587822316;
        gc.iykp[604] = -1762772928;
        gc.iykp[605] = -1699287942;
        gc.iykp[606] = 2083674098;
        gc.iykp[607] = 1844977140;
        gc.iykp[608] = 645893255;
        gc.iykp[609] = 805730179;
    }

    private static /* synthetic */ void izve() {
        gc.iykk[200] = 5797128223548894965L;
        gc.iykk[201] = 6180866509368818748L;
        gc.iykk[202] = -1814581443529318488L;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public float getStableYaw() {
        boolean bl2;
        while (true) {
            long l2;
            Object object;
            if ((object = (l2 = qv - gc.iykl("izsj", iyki(int ), (int)182)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object == gc.iykl("izsk", iyks(int ), (int)577)) break;
            object = gc.iykl("izsl", iyks(int ), (int)578);
        }
        boolean bl3 = c;
        while (true) {
            long l3;
            Object object;
            if ((object = (l3 = qv - gc.iykl("izsm", iyki(int ), (int)183)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object == gc.iykl("izsn", iyks(int ), (int)579)) break;
            object = gc.iykl("izso", iyks(int ), (int)580);
        }
        int n2 = b;
        while (true) {
            long l4;
            Object object;
            if ((object = (l4 = qv - gc.iykl("izsp", iyki(int ), (int)184)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            if (object == gc.iykl("izsq", iyks(int ), (int)581)) {
                bl2 = a;
                if (bl3) {
                    throw null;
                }
                break;
            }
            object = gc.iykl("izsr", iyks(int ), (int)582);
        }
        if (bl2) return (float)gc.iykl("izss", iyko(int ), (int)583);
        if (bl2) return (float)gc.iykl("izss", iyko(int ), (int)583);
        Object object = qv;
        boolean bl4 = true;
        block9: while (true) {
            CallSite callSite;
            if (!bl4 || (bl4 = false) || !true) {
                object = callSite - gc.iykl("izst", iyki(int ), (int)185);
            }
            switch ((int)object) {
                case -1194009035: {
                    callSite = gc.iykl("izsu", iyki(int ), (int)186);
                    continue block9;
                }
                case -6253801: {
                    return this.stableYaw;
                }
                case 511821552: {
                    callSite = gc.iykl("izsv", iyki(int ), (int)187);
                    continue block9;
                }
                case 1572167737: {
                    callSite = gc.iykl("izsw", iyki(int ), (int)188);
                    continue block9;
                }
            }
            break;
        }
        return this.stableYaw;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private float calculateDynamicPitch() {
        block70: {
            block69: {
                var21_1 = gc.c;
                var20_2 /* !! */  = gc.b;
                var19_3 = gc.a;
                if (var21_1) {
                    throw null;
lbl6:
                    // 17 sources

                    return (float)gc.iykl("izjb", iyko(int ), (int)372);
                }
                if (var19_3 || var19_3) ** GOTO lbl6
                var1_4 = class_310.method_1551();
                if (var19_3 || var19_3) ** GOTO lbl6
                if (var1_4.field_1724 != null) break block69;
                if (var19_3) ** GOTO lbl6
                return (float)gc.iykl("izjc", iyko(int ), (int)373);
            }
            if (var19_3 || var19_3) ** GOTO lbl6
            var2_5 = class_2338.method_49637((double)var1_4.field_1724.method_23317(), (double)(var1_4.field_1724.method_23318() - 1.0), (double)var1_4.field_1724.method_23321());
            if (var19_3 || var19_3) ** GOTO lbl6
            var3_6 = var1_4.field_1724.method_23317() - (double)var2_5.method_10263();
            if (var19_3 || var19_3) ** GOTO lbl6
            var5_7 = var1_4.field_1724.method_23321() - (double)var2_5.method_10260();
            if (var19_3 || var19_3) ** GOTO lbl6
            var7_8 = var3_6;
            if (var19_3 || var19_3) ** GOTO lbl6
            var9_9 = 1.0 - var3_6;
            if (var19_3 || var19_3) ** GOTO lbl6
            var11_10 = var5_7;
            if (var19_3 || var19_3) ** GOTO lbl6
            var13_11 = 1.0 - var5_7;
            if (var19_3 || var19_3) ** GOTO lbl6
            var15_12 = Math.min(Math.min(var7_8, var9_9), Math.min(var11_10, var13_11));
            if (var19_3 || var19_3) ** GOTO lbl6
            var17_13 = gc.iykl("izjd", iyko(int ), (int)374);
            if (var19_3 || var19_3) ** GOTO lbl6
            if (!(var15_12 < gc.iykl("izje", iyuo(int ), (int)145))) break block70;
            if (var19_3 || var19_3) ** GOTO lbl6
            var18_14 = (float)((gc.iykl("izjf", iyuo(int ), (int)146) - var15_12) * gc.iykl("izjg", iyuo(int ), (int)147));
            if (var19_3 || var19_3) ** GOTO lbl6
            return class_3532.method_15363((float)(var17_13 + var18_14), (float)gc.iykl("izjh", iyko(int ), (int)375), (float)gc.iykl("izji", iyko(int ), (int)376));
        }
        if (var19_3) ** GOTO lbl6
        if (var20_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var20_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var19_3) ** break;
                ** continue;
                return class_3532.method_15363((float)var17_13, (float)gc.iykl("izjj", iyko(int ), (int)377), (float)gc.iykl("izjk", iyko(int ), (int)378));
            }
lbl47:
            // 2 sources

            case 0: {
                var20_2 /* !! */  = (int)gc.iykl("izjl", iyks(int ), (int)379);
                if (var21_1) {
                    throw null;
                }
                ** GOTO lbl157
            }
lbl52:
            // 3 sources

            case 1: {
                var20_2 /* !! */  = (int)gc.iykl("izjm", iyks(int ), (int)380);
                if (var21_1) {
                    throw null;
                }
                ** GOTO lbl131
            }
lbl57:
            // 2 sources

            case 2: {
                var20_2 /* !! */  = (int)gc.iykl("izjn", iyks(int ), (int)381);
                if (var21_1) {
                    throw null;
                }
                ** GOTO lbl190
            }
lbl62:
            // 2 sources

            case 3: {
                var20_2 /* !! */  = (int)gc.iykl("izjo", iyks(int ), (int)382);
                if (var21_1) {
                    throw null;
                }
                ** GOTO lbl122
            }
lbl67:
            // 4 sources

            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var20_2 /* !! */  = (int)gc.iykl("izjp", iyks(int ), (int)383);
                    if (var21_1) {
                        throw null;
                    }
                    ** GOTO lbl112
                    break;
                }
            }
lbl73:
            // 2 sources

            case 5: {
                var20_2 /* !! */  = (int)gc.iykl("izjq", iyks(int ), (int)384);
                if (var21_1) {
                    throw null;
                }
                ** GOTO lbl165
            }
lbl78:
            // 2 sources

            case 6: {
                var20_2 /* !! */  = (int)gc.iykl("izjr", iyks(int ), (int)385);
                if (var21_1) {
                    throw null;
                }
                ** GOTO lbl186
            }
            case 7: {
                var20_2 /* !! */  = (int)gc.iykl("izjs", iyks(int ), (int)386);
                if (!var21_1) ** GOTO lbl57
                throw null;
            }
lbl87:
            // 2 sources

            case 8: {
                var20_2 /* !! */  = (int)gc.iykl("izjt", iyks(int ), (int)387);
                if (var21_1) {
                    throw null;
                }
                ** GOTO lbl131
            }
            case 9: {
                var20_2 /* !! */  = (int)gc.iykl("izju", iyks(int ), (int)388);
                if (var21_1) {
                    throw null;
                }
                ** GOTO lbl136
            }
            case 10: {
                var20_2 /* !! */  = (int)gc.iykl("izjv", iyks(int ), (int)389);
                if (var21_1) {
                    throw null;
                }
                ** GOTO lbl186
            }
            case 11: {
                var20_2 /* !! */  = (int)gc.iykl("izjw", iyks(int ), (int)390);
                if (var21_1) {
                    throw null;
                }
                ** GOTO lbl174
            }
lbl107:
            // 2 sources

            case 12: {
                var20_2 /* !! */  = (int)gc.iykl("izjx", iyks(int ), (int)391);
                if (var21_1) {
                    throw null;
                }
                ** GOTO lbl190
            }
lbl112:
            // 2 sources

            case 13: {
                do {
                    var20_2 /* !! */  = (int)gc.iykl("izjy", iyks(int ), (int)392);
                } while (!var21_1);
                throw null;
            }
lbl117:
            // 2 sources

            case 14: {
                var20_2 /* !! */  = (int)gc.iykl("izjz", iyks(int ), (int)393);
                if (var21_1) {
                    throw null;
                }
                ** GOTO lbl153
            }
lbl122:
            // 2 sources

            case 15: {
                var20_2 /* !! */  = (int)gc.iykl("izka", iyks(int ), (int)394);
                if (var21_1) {
                    throw null;
                }
                ** GOTO lbl194
            }
            case 16: {
                var20_2 /* !! */  = (int)gc.iykl("izkb", iyks(int ), (int)395);
                if (!var21_1) ** GOTO lbl52
                throw null;
            }
lbl131:
            // 3 sources

            case 17: {
                var20_2 /* !! */  = (int)gc.iykl("izkc", iyks(int ), (int)396);
                if (var21_1) {
                    throw null;
                }
                ** GOTO lbl157
            }
lbl136:
            // 2 sources

            case 18: {
                var20_2 /* !! */  = (int)gc.iykl("izkd", iyks(int ), (int)397);
                if (!var21_1) ** GOTO lbl47
                throw null;
            }
            case 19: {
                var20_2 /* !! */  = (int)gc.iykl("izke", iyks(int ), (int)398);
                if (var21_1) {
                    throw null;
                }
                ** GOTO lbl165
            }
            case 20: {
                var20_2 /* !! */  = (int)gc.iykl("izkf", iyks(int ), (int)399);
                if (!var21_1) ** GOTO lbl78
                throw null;
            }
            case 21: {
                var20_2 /* !! */  = (int)gc.iykl("izkg", iyks(int ), (int)400);
                if (!var21_1) ** GOTO lbl67
                throw null;
            }
lbl153:
            // 2 sources

            case 22: {
                var20_2 /* !! */  = (int)gc.iykl("izkh", iyks(int ), (int)401);
                if (!var21_1) ** GOTO lbl73
                throw null;
            }
lbl157:
            // 4 sources

            case 23: {
                var20_2 /* !! */  = (int)gc.iykl("izki", iyks(int ), (int)402);
                if (!var21_1) ** GOTO lbl107
                throw null;
            }
            case 24: {
                var20_2 /* !! */  = (int)gc.iykl("izkj", iyks(int ), (int)403);
                if (!var21_1) ** GOTO lbl157
                throw null;
            }
lbl165:
            // 3 sources

            case 25: {
                var20_2 /* !! */  = (int)gc.iykl("izkk", iyks(int ), (int)404);
                if (var21_1) {
                    throw null;
                }
                ** GOTO lbl178
            }
lbl170:
            // 2 sources

            case 26: {
                var20_2 /* !! */  = (int)gc.iykl("izkl", iyks(int ), (int)405);
                if (!var21_1) ** GOTO lbl67
                throw null;
            }
lbl174:
            // 2 sources

            case 27: {
                var20_2 /* !! */  = (int)gc.iykl("izkm", iyks(int ), (int)406);
                if (!var21_1) ** GOTO lbl52
                throw null;
            }
lbl178:
            // 2 sources

            case 28: {
                var20_2 /* !! */  = (int)gc.iykl("izkn", iyks(int ), (int)407);
                if (!var21_1) ** GOTO lbl62
                throw null;
            }
            case 29: {
                var20_2 /* !! */  = (int)gc.iykl("izko", iyks(int ), (int)408);
                if (!var21_1) ** GOTO lbl117
                throw null;
            }
lbl186:
            // 3 sources

            case 30: {
                var20_2 /* !! */  = (int)gc.iykl("izkp", iyks(int ), (int)409);
                if (!var21_1) ** GOTO lbl67
                throw null;
            }
lbl190:
            // 3 sources

            case 31: {
                var20_2 /* !! */  = (int)gc.iykl("izkq", iyks(int ), (int)410);
                if (!var21_1) ** GOTO lbl87
                throw null;
            }
lbl194:
            // 2 sources

            case 32: {
                var20_2 /* !! */  = (int)gc.iykl("izkr", iyks(int ), (int)411);
                if (!var21_1) ** GOTO lbl170
                throw null;
            }
            case 33: 
        }
        var20_2 /* !! */  = (int)gc.iykl("izks", iyks(int ), (int)412);
        ** while (!var21_1)
lbl201:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public int getLockedBlockSlot() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = gc.qv - gc.iykl("izts", iyki(int ), (int)193)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == gc.iykl("iztt", iyks(int ), (int)601)) break;
            v0 /* !! */  = (long)gc.iykl("iztu", iyks(int ), (int)602);
        }
        var3_1 = gc.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = gc.qv - gc.iykl("iztv", iyki(int ), (int)194)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == gc.iykl("iztw", iyks(int ), (int)603)) break;
            v1 /* !! */  = (long)gc.iykl("iztx", iyks(int ), (int)604);
        }
        var2_2 /* !! */  = gc.b;
        v2 /* !! */  = gc.qv;
        if (true) ** GOTO lbl19
        block20: while (true) {
            v2 /* !! */  = (long)(v3 - gc.iykl("izty", iyki(int ), (int)195));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -267952981: {
                    v3 = gc.iykl("iztz", iyki(int ), (int)196);
                    continue block20;
                }
                case -6253801: {
                    break block20;
                }
                case 462235353: {
                    v3 = gc.iykl("izua", iyki(int ), (int)197);
                    continue block20;
                }
                case 1536509848: {
                    v3 = gc.iykl("izub", iyki(int ), (int)198);
                    continue block20;
                }
            }
            break;
        }
        var1_3 = gc.a;
        if (var3_1) {
            throw null;
lbl34:
            // 2 sources

            return (int)gc.iykl("izuc", iyks(int ), (int)605);
        }
        if (var1_3) ** GOTO lbl34
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block6 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                v4 /* !! */  = gc.qv;
                if (true) ** GOTO lbl45
                block22: while (true) {
                    v4 /* !! */  = (long)(v5 - gc.iykl("izud", iyki(int ), (int)199));
lbl45:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -155053509: {
                            v5 = gc.iykl("izue", iyki(int ), (int)200);
                            continue block22;
                        }
                        case -6253801: {
                            break block22;
                        }
                        case 135766849: {
                            v5 = gc.iykl("izuf", iyki(int ), (int)201);
                            continue block22;
                        }
                        case 1139401016: {
                            v5 = gc.iykl("izug", iyki(int ), (int)202);
                            continue block22;
                        }
                    }
                    break;
                }
                return this.lockedBlockSlot;
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)gc.iykl("izuh", iyks(int ), (int)606);
                    if (!var3_1) break block6;
                    throw null;
                }
            }
lbl63:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)gc.iykl("izui", iyks(int ), (int)607);
                if (!var3_1) break;
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)gc.iykl("izuj", iyks(int ), (int)608);
                if (!var3_1) ** GOTO lbl63
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)gc.iykl("izuk", iyks(int ), (int)609);
        ** while (!var3_1)
lbl74:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void izuz() {
        gc.iykj[0] = -7178816510545808706L;
        gc.iykj[1] = 3686659351429321853L;
        gc.iykj[2] = -536949771459955139L;
        gc.iykj[3] = -1575447026496404181L;
        gc.iykj[4] = -127616800298703022L;
        gc.iykj[5] = 7609329930689770427L;
        gc.iykj[6] = 4425356352528113558L;
        gc.iykj[7] = -6640953580186460009L;
        gc.iykj[8] = -3757304524957838469L;
        gc.iykj[9] = 7244362940732765073L;
        gc.iykj[10] = -417143779581640896L;
        gc.iykj[11] = 3398095082157181895L;
        gc.iykj[12] = -6532960952790947586L;
        gc.iykj[13] = 1869259410838985780L;
        gc.iykj[14] = 1070420372306646432L;
        gc.iykj[15] = 4490006219123169536L;
        gc.iykj[16] = -8593681639501608683L;
        gc.iykj[17] = -1515865390375122494L;
        gc.iykj[18] = -8957111523527215205L;
        gc.iykj[19] = -8289770290279900921L;
        gc.iykj[20] = -6216124388665116251L;
        gc.iykj[21] = 4176976029119802287L;
        gc.iykj[22] = 6253738416504568074L;
        gc.iykj[23] = 7549426350218554487L;
        gc.iykj[24] = -4902946220073383752L;
        gc.iykj[25] = 1280523675071841834L;
        gc.iykj[26] = 2973296026400882014L;
        gc.iykj[27] = 4432793335518352826L;
        gc.iykj[28] = -6531860385632667643L;
        gc.iykj[29] = -18915703418476680L;
        gc.iykj[30] = 1757884550037700895L;
        gc.iykj[31] = 6663019824054031348L;
        gc.iykj[32] = -1938528284401260699L;
        gc.iykj[33] = -2957163571930860163L;
        gc.iykj[34] = -7628183834419962611L;
        gc.iykj[35] = 5325692421157046395L;
        gc.iykj[36] = 394319982828457252L;
        gc.iykj[37] = -7041904562288694149L;
        gc.iykj[38] = -2790916434351551472L;
        gc.iykj[39] = -4923025354478791350L;
        gc.iykj[40] = 2030942046453810151L;
        gc.iykj[41] = 3791578844943938696L;
        gc.iykj[42] = -5621477882166187763L;
        gc.iykj[43] = 6683647038496523947L;
        gc.iykj[44] = 8049371464834592716L;
        gc.iykj[45] = -8870988995301128802L;
        gc.iykj[46] = -9043930521634961841L;
        gc.iykj[47] = 5854942734895229441L;
        gc.iykj[48] = -1571403746140301665L;
        gc.iykj[49] = -6040587822217441329L;
        gc.iykj[50] = -949665058217480073L;
        gc.iykj[51] = -6377930069141942674L;
        gc.iykj[52] = 1929500381496420095L;
        gc.iykj[53] = 998406885653620697L;
        gc.iykj[54] = -1068437566947164046L;
        gc.iykj[55] = 5996343593244678374L;
        gc.iykj[56] = -6518579552065492576L;
        gc.iykj[57] = 8640307395681932939L;
        gc.iykj[58] = 3047547984762692997L;
        gc.iykj[59] = 6698885124143207479L;
        gc.iykj[60] = 5945018617394315797L;
        gc.iykj[61] = 5988337664669210520L;
        gc.iykj[62] = 8441631894088965781L;
        gc.iykj[63] = 8888514474080261189L;
        gc.iykj[64] = 8314611697389592230L;
        gc.iykj[65] = 7010299462200799302L;
        gc.iykj[66] = 6007911513244267232L;
        gc.iykj[67] = -5802783332088481308L;
        gc.iykj[68] = 6257385943378937884L;
        gc.iykj[69] = -8614186782219838558L;
        gc.iykj[70] = 5719482516762816090L;
        gc.iykj[71] = -4410992048807732832L;
        gc.iykj[72] = 9105269973524527150L;
        gc.iykj[73] = 5445954372355445990L;
        gc.iykj[74] = -4301654386420256486L;
        gc.iykj[75] = -909284640912546562L;
        gc.iykj[76] = 1241167230523192432L;
        gc.iykj[77] = -1557858525189510727L;
        gc.iykj[78] = 1995300057995371377L;
        gc.iykj[79] = -6192562698730786943L;
        gc.iykj[80] = 9208794009656963073L;
        gc.iykj[81] = 8227340551817180897L;
        gc.iykj[82] = -4732239366990055432L;
        gc.iykj[83] = -5712672735614313230L;
        gc.iykj[84] = 7512847460420340890L;
        gc.iykj[85] = 2711150235164719029L;
        gc.iykj[86] = 8809583681493493453L;
        gc.iykj[87] = 2155625629149463721L;
        gc.iykj[88] = 1720336458952964352L;
        gc.iykj[89] = -7132055539297791302L;
        gc.iykj[90] = -6207561841477529474L;
        gc.iykj[91] = -1631680065933262937L;
        gc.iykj[92] = 3694620284873543093L;
        gc.iykj[93] = 4254647769727886119L;
        gc.iykj[94] = 683378257731451925L;
        gc.iykj[95] = -9219047631725056975L;
        gc.iykj[96] = -9079143072158641050L;
        gc.iykj[97] = 8554476787842572572L;
        gc.iykj[98] = -9032319941237410963L;
        gc.iykj[99] = 5152106735113828542L;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private boolean isValidBlockSlot(int var1_1) {
        v0 /* !! */  = gc.qv;
        block66: while (true) {
            switch ((int)v0 /* !! */ ) {
                case -1539717577: {
                    v0 /* !! */  = (long)(gc.iykl("izch", iyki(int ), (int)119) - gc.iykl("izcg", iyki(int ), (int)118));
                    continue block66;
                }
                case -6253801: {
                    break block66;
                }
            }
            break;
        }
        var6_2 = gc.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = gc.qv - gc.iykl("izci", iyki(int ), (int)120)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == gc.iykl("izcj", iyks(int ), (int)339)) break;
            v1 /* !! */  = (long)gc.iykl("izck", iyks(int ), (int)340);
        }
        var5_3 /* !! */  = gc.b;
        v2 /* !! */  = gc.qv;
        block68: while (true) {
            switch ((int)v2 /* !! */ ) {
                case -6253801: {
                    break block68;
                }
                case 1800605283: {
                    v2 /* !! */  = (long)(gc.iykl("izcm", iyki(int ), (int)122) - gc.iykl("izcl", iyki(int ), (int)121));
                    continue block68;
                }
            }
            break;
        }
        var4_4 = gc.a;
        if (var6_2) {
            throw null;
        }
        if (var4_4 || var4_4) return (boolean)gc.iykl("izcn", iyks(int ), (int)341);
        v3 /* !! */  = gc.qv;
        if (true) ** GOTO lbl32
        block69: while (true) {
            v3 /* !! */  = (long)(v4 - gc.iykl("izco", iyki(int ), (int)123));
lbl32:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -6253801: {
                    break block69;
                }
                case 56378126: {
                    v4 = gc.iykl("izcp", iyki(int ), (int)124);
                    continue block69;
                }
                case 947664050: {
                    v4 = gc.iykl("izcq", iyki(int ), (int)125);
                    continue block69;
                }
                case 1867668237: {
                    v4 = gc.iykl("izcr", iyki(int ), (int)126);
                    continue block69;
                }
            }
            break;
        }
        var2_5 = class_310.method_1551();
        if (var4_4 || var4_4) return (boolean)gc.iykl("izcn", iyks(int ), (int)341);
        if (var1_1 < 0) ** GOTO lbl55
        if (var5_3 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block70: while (true) {
            block116: {
                switch (cfr_temp_0 == -2147483648 ? var5_3 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var4_4) return (boolean)gc.iykl("izcn", iyks(int ), (int)341);
                        if (var1_1 <= gc.iykl("izcs", iyks(int ), (int)342)) ** GOTO lbl57
                        if (var4_4) return (boolean)gc.iykl("izcn", iyks(int ), (int)341);
lbl55:
                        // 2 sources

                        if (var4_4 || var4_4) return (boolean)gc.iykl("izcn", iyks(int ), (int)341);
                        return (boolean)gc.iykl("izct", iyks(int ), (int)343);
lbl57:
                        // 1 sources

                        if (var4_4 || var4_4) return (boolean)gc.iykl("izcn", iyks(int ), (int)341);
                        v5 /* !! */  = gc.qv;
                        block71: while (true) {
                            switch ((int)v5 /* !! */ ) {
                                case -1275360980: {
                                    v6 = gc.iykl("izcv", iyki(int ), (int)128);
                                    ** GOTO lbl68
                                }
                                case -6253801: {
                                    break block71;
                                }
                                case 216981480: {
                                    v6 = gc.iykl("izcw", iyki(int ), (int)129);
lbl68:
                                    // 2 sources

                                    v5 /* !! */  = (long)(v6 - gc.iykl("izcu", iyki(int ), (int)127));
                                    continue block71;
                                }
                            }
                            break;
                        }
                        if (var2_5.field_1724 == null) {
                            if (var4_4) return (boolean)gc.iykl("izcn", iyks(int ), (int)341);
                            return (boolean)gc.iykl("izcx", iyks(int ), (int)344);
                        }
                        if (var4_4 || var4_4) return (boolean)gc.iykl("izcn", iyks(int ), (int)341);
                        v7 /* !! */  = gc.qv;
                        block72: while (true) {
                            switch ((int)v7 /* !! */ ) {
                                case -1509984154: {
                                    v8 = gc.iykl("izcz", iyki(int ), (int)131);
                                    ** GOTO lbl87
                                }
                                case -6253801: {
                                    break block72;
                                }
                                case 119660744: {
                                    v8 = gc.iykl("izda", iyki(int ), (int)132);
                                    ** GOTO lbl87
                                }
                                case 268636838: {
                                    v8 = gc.iykl("izdb", iyki(int ), (int)133);
lbl87:
                                    // 3 sources

                                    v7 /* !! */  = (long)(v8 - gc.iykl("izcy", iyki(int ), (int)130));
                                    continue block72;
                                }
                            }
                            break;
                        }
                        v9 = var2_5.field_1724;
                        v10 /* !! */  = gc.qv;
                        block73: while (true) {
                            switch ((int)v10 /* !! */ ) {
                                case -1888807781: {
                                    v11 = gc.iykl("izdd", iyki(int ), (int)135);
                                    ** GOTO lbl101
                                }
                                case -1300645705: {
                                    v11 = gc.iykl("izde", iyki(int ), (int)136);
                                    ** GOTO lbl101
                                }
                                case -450381026: {
                                    v11 = gc.iykl("izdf", iyki(int ), (int)137);
lbl101:
                                    // 3 sources

                                    v10 /* !! */  = (long)(v11 - gc.iykl("izdc", iyki(int ), (int)134));
                                    continue block73;
                                }
                                case -6253801: {
                                    break block73;
                                }
                            }
                            break;
                        }
                        v12 = v9.method_31548();
                        while (true) {
                            if ((v13 /* !! */  = (cfr_temp_2 = gc.qv - gc.iykl("izdg", iyki(int ), (int)138)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                            if (v13 /* !! */  == gc.iykl("izdh", iyks(int ), (int)345)) {
                                var3_6 = v12.method_5438(var1_1);
                                if (var4_4) return (boolean)gc.iykl("izcn", iyks(int ), (int)341);
                                break;
                            }
                            v13 /* !! */  = (long)gc.iykl("izdi", iyks(int ), (int)346);
                        }
                        if (var4_4) return (boolean)gc.iykl("izcn", iyks(int ), (int)341);
                        v14 /* !! */  = gc.qv;
                        block75: while (true) {
                            switch ((int)v14 /* !! */ ) {
                                case -1368978215: {
                                    v15 = gc.iykl("izdk", iyki(int ), (int)140);
                                    ** GOTO lbl123
                                }
                                case -394314620: {
                                    v15 = gc.iykl("izdl", iyki(int ), (int)141);
lbl123:
                                    // 2 sources

                                    v14 /* !! */  = (long)(v15 - gc.iykl("izdj", iyki(int ), (int)139));
                                    continue block75;
                                }
                                case -6253801: {
                                    break block75;
                                }
                            }
                            break;
                        }
                        if (var3_6.method_7960()) ** GOTO lbl146
                        if (var4_4) return (boolean)gc.iykl("izcn", iyks(int ), (int)341);
                        v16 /* !! */  = gc.qv;
                        block76: while (true) {
                            switch ((int)v16 /* !! */ ) {
                                case -1203830683: {
                                    v17 = gc.iykl("izdn", iyki(int ), (int)143);
                                    ** GOTO lbl137
                                }
                                case -1055662651: {
                                    v17 = gc.iykl("izdo", iyki(int ), (int)144);
lbl137:
                                    // 2 sources

                                    v16 /* !! */  = (long)(v17 - gc.iykl("izdm", iyki(int ), (int)142));
                                    continue block76;
                                }
                                case -6253801: {
                                    break block76;
                                }
                            }
                            break;
                        }
                        if (var3_6.method_7909() instanceof class_1747) {
                            if (var4_4) return (boolean)gc.iykl("izcn", iyks(int ), (int)341);
                            v18 = gc.iykl("izic", iyks(int ), (int)347);
                            if (!var6_2) return (boolean)v18;
                            throw null;
                        }
lbl146:
                        // 3 sources

                        if (var4_4 || var4_4) {
                            return (boolean)gc.iykl("izcn", iyks(int ), (int)341);
                        }
                        v18 = gc.iykl("izid", iyks(int ), (int)348);
                        return (boolean)v18;
                    }
                    case 0: {
                        var5_3 /* !! */  = (int)gc.iykl("izie", iyks(int ), (int)349);
                        cfr_temp_0 = 21;
                        if (var6_2) {
                            throw null;
                        }
                        break block116;
                    }
                    case 3: {
                        var5_3 /* !! */  = (int)gc.iykl("izih", iyks(int ), (int)352);
                        cfr_temp_0 = 13;
                        if (var6_2) {
                            throw null;
                        }
                        break block116;
                    }
                    case 5: {
                        var5_3 /* !! */  = (int)gc.iykl("izij", iyks(int ), (int)354);
                        cfr_temp_0 = 14;
                        if (var6_2) {
                            throw null;
                        }
                        break block116;
                    }
                    case 6: {
                        var5_3 /* !! */  = (int)gc.iykl("izik", iyks(int ), (int)355);
                        cfr_temp_0 = 15;
                        if (var6_2) {
                            throw null;
                        }
                        break block116;
                    }
                    case 7: {
                        var5_3 /* !! */  = (int)gc.iykl("izil", iyks(int ), (int)356);
                        cfr_temp_0 = 21;
                        if (var6_2) {
                            throw null;
                        }
                        break block116;
                    }
                    case 10: {
                        var5_3 /* !! */  = (int)gc.iykl("izio", iyks(int ), (int)359);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 2: {
                        var5_3 /* !! */  = (int)gc.iykl("izig", iyks(int ), (int)351);
                        cfr_temp_0 = 17;
                        if (var6_2) {
                            throw null;
                        }
                        break block116;
                    }
                    case 11: {
                        var5_3 /* !! */  = (int)gc.iykl("izip", iyks(int ), (int)360);
                        cfr_temp_0 = 8;
                        if (var6_2) {
                            throw null;
                        }
                        break block116;
                    }
                    case 15: {
                        var5_3 /* !! */  = (int)gc.iykl("izit", iyks(int ), (int)364);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 12: {
                        var5_3 /* !! */  = (int)gc.iykl("iziq", iyks(int ), (int)361);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 18: {
                        var5_3 /* !! */  = (int)gc.iykl("iziw", iyks(int ), (int)367);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 21: {
                        var5_3 /* !! */  = (int)gc.iykl("iziz", iyks(int ), (int)370);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 17: {
                        var5_3 /* !! */  = (int)gc.iykl("iziv", iyks(int ), (int)366);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 4: {
                        var5_3 /* !! */  = (int)gc.iykl("izii", iyks(int ), (int)353);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 1: {
                        var5_3 /* !! */  = (int)gc.iykl("izif", iyks(int ), (int)350);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 19: {
                        var5_3 /* !! */  = (int)gc.iykl("izix", iyks(int ), (int)368);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 13: {
                        var5_3 /* !! */  = (int)gc.iykl("izir", iyks(int ), (int)362);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 16: {
                        do {
                            var5_3 /* !! */  = (int)gc.iykl("iziu", iyks(int ), (int)365);
                        } while (!var6_2);
                        throw null;
                    }
                    case 22: {
                        var5_3 /* !! */  = (int)gc.iykl("izja", iyks(int ), (int)371);
                        if (var6_2) {
                            throw null;
                        }
                        ** GOTO lbl-1000
                    }
                    case 8: lbl-1000:
                    // 2 sources

                    {
                        var5_3 /* !! */  = (int)gc.iykl("izim", iyks(int ), (int)357);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 20: {
                        var5_3 /* !! */  = (int)gc.iykl("iziy", iyks(int ), (int)369);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 14: {
                        var5_3 /* !! */  = (int)gc.iykl("izis", iyks(int ), (int)363);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 9: 
                }
                ** GOTO lbl259
            }
            do {
                if (true) continue block70;
lbl259:
                // 2 sources

                var5_3 /* !! */  = (int)gc.iykl("izin", iyks(int ), (int)358);
                cfr_temp_0 = 8;
            } while (!var6_2);
            break;
        }
        throw null;
    }

    private static /* synthetic */ void izux() {
        gc.iykq[500] = 480648968;
        gc.iykq[501] = 1257750400;
        gc.iykq[502] = 120892285;
        gc.iykq[503] = 1850460329;
        gc.iykq[504] = 2047556685;
        gc.iykq[505] = -652626856;
        gc.iykq[506] = -1615863038;
        gc.iykq[507] = -68533818;
        gc.iykq[508] = 1303376916;
        gc.iykq[509] = -1913254564;
        gc.iykq[510] = -1522691866;
        gc.iykq[511] = -790277874;
        gc.iykq[512] = -2020383592;
        gc.iykq[513] = -1681340935;
        gc.iykq[514] = 1753849539;
        gc.iykq[515] = 1817864988;
        gc.iykq[516] = 1185411030;
        gc.iykq[517] = 1477328210;
        gc.iykq[518] = -2022857704;
        gc.iykq[519] = 356084980;
        gc.iykq[520] = -1344334417;
        gc.iykq[521] = -1178880053;
        gc.iykq[522] = 180968213;
        gc.iykq[523] = -1814769085;
        gc.iykq[524] = -2147375396;
        gc.iykq[525] = 1090799856;
        gc.iykq[526] = 1437404854;
        gc.iykq[527] = -129463318;
        gc.iykq[528] = 602125086;
        gc.iykq[529] = -1654130795;
        gc.iykq[530] = -42707437;
        gc.iykq[531] = 731462333;
        gc.iykq[532] = -1238587718;
        gc.iykq[533] = 1162772541;
        gc.iykq[534] = 1300279541;
        gc.iykq[535] = 1598411399;
        gc.iykq[536] = 410995492;
        gc.iykq[537] = -626959937;
        gc.iykq[538] = -64431700;
        gc.iykq[539] = 1646389585;
        gc.iykq[540] = 1112841978;
        gc.iykq[541] = 149872678;
        gc.iykq[542] = -1704271841;
        gc.iykq[543] = -2115029277;
        gc.iykq[544] = 1033353523;
        gc.iykq[545] = -1378170407;
        gc.iykq[546] = 171729443;
        gc.iykq[547] = -1013905269;
        gc.iykq[548] = -12571752;
        gc.iykq[549] = 574507771;
        gc.iykq[550] = -650808048;
        gc.iykq[551] = -1206080228;
        gc.iykq[552] = -334784398;
        gc.iykq[553] = -1818457324;
        gc.iykq[554] = -1542974319;
        gc.iykq[555] = 666246457;
        gc.iykq[556] = -296849532;
        gc.iykq[557] = -1598664464;
        gc.iykq[558] = -1677776196;
        gc.iykq[559] = -732404781;
        gc.iykq[560] = 1155466811;
        gc.iykq[561] = 324143303;
        gc.iykq[562] = 937264482;
        gc.iykq[563] = 446532335;
        gc.iykq[564] = -744653021;
        gc.iykq[565] = -1651371860;
        gc.iykq[566] = -1622264675;
        gc.iykq[567] = 1646809766;
        gc.iykq[568] = -801396544;
        gc.iykq[569] = 404126203;
        gc.iykq[570] = -1766727057;
        gc.iykq[571] = 251567683;
        gc.iykq[572] = 1804712009;
        gc.iykq[573] = 1199152497;
        gc.iykq[574] = 752950597;
        gc.iykq[575] = -1568218909;
        gc.iykq[576] = 694818171;
        gc.iykq[577] = -1543995562;
        gc.iykq[578] = 1068182532;
        gc.iykq[579] = -1937821460;
        gc.iykq[580] = 468475924;
        gc.iykq[581] = -700725501;
        gc.iykq[582] = 1344288740;
        gc.iykq[583] = -123420164;
        gc.iykq[584] = -1026602328;
        gc.iykq[585] = 605484473;
        gc.iykq[586] = 320502173;
        gc.iykq[587] = 1526477511;
        gc.iykq[588] = 695099822;
        gc.iykq[589] = -698573055;
        gc.iykq[590] = 2074394095;
        gc.iykq[591] = 150472707;
        gc.iykq[592] = 1125343692;
        gc.iykq[593] = -217708967;
        gc.iykq[594] = -1519841756;
        gc.iykq[595] = 155493730;
        gc.iykq[596] = 1977651026;
        gc.iykq[597] = 1743224030;
        gc.iykq[598] = 327554166;
        gc.iykq[599] = -1713465808;
    }

    private static /* synthetic */ void izut() {
        gc.iykq[100] = 1964429951;
        gc.iykq[101] = 1008530137;
        gc.iykq[102] = 1460329256;
        gc.iykq[103] = -47255980;
        gc.iykq[104] = -1608217419;
        gc.iykq[105] = -1388088199;
        gc.iykq[106] = -1132505770;
        gc.iykq[107] = 1589613919;
        gc.iykq[108] = 1139265833;
        gc.iykq[109] = -893135927;
        gc.iykq[110] = 1271691929;
        gc.iykq[111] = 12325456;
        gc.iykq[112] = 7581374;
        gc.iykq[113] = -1316959473;
        gc.iykq[114] = 783166837;
        gc.iykq[115] = -1167625548;
        gc.iykq[116] = 1358870352;
        gc.iykq[117] = 1906571792;
        gc.iykq[118] = -1233923388;
        gc.iykq[119] = -1008215251;
        gc.iykq[120] = 892519501;
        gc.iykq[121] = -1994020195;
        gc.iykq[122] = -1159716;
        gc.iykq[123] = 858175727;
        gc.iykq[124] = 1349282444;
        gc.iykq[125] = 415009665;
        gc.iykq[126] = -480551105;
        gc.iykq[127] = -1861225530;
        gc.iykq[128] = -553851866;
        gc.iykq[129] = -2083111361;
        gc.iykq[130] = -2052743663;
        gc.iykq[131] = -499952034;
        gc.iykq[132] = 995033486;
        gc.iykq[133] = 1484596391;
        gc.iykq[134] = 649633053;
        gc.iykq[135] = 1342615246;
        gc.iykq[136] = -1505657607;
        gc.iykq[137] = 1074605473;
        gc.iykq[138] = -886820271;
        gc.iykq[139] = -1936887043;
        gc.iykq[140] = -1754672920;
        gc.iykq[141] = 1625434665;
        gc.iykq[142] = 1265123692;
        gc.iykq[143] = 86503065;
        gc.iykq[144] = -81396235;
        gc.iykq[145] = -1856976056;
        gc.iykq[146] = -858859410;
        gc.iykq[147] = -536981189;
        gc.iykq[148] = -1926448416;
        gc.iykq[149] = -1218777404;
        gc.iykq[150] = -1959228727;
        gc.iykq[151] = -1024302305;
        gc.iykq[152] = 1072721053;
        gc.iykq[153] = -525972764;
        gc.iykq[154] = -1392445413;
        gc.iykq[155] = 1687763583;
        gc.iykq[156] = -179264017;
        gc.iykq[157] = -2117646336;
        gc.iykq[158] = -1927031921;
        gc.iykq[159] = -1288401336;
        gc.iykq[160] = 1804933990;
        gc.iykq[161] = -155401476;
        gc.iykq[162] = -741391716;
        gc.iykq[163] = -1391502605;
        gc.iykq[164] = -932883729;
        gc.iykq[165] = -723352336;
        gc.iykq[166] = 1638133370;
        gc.iykq[167] = -916223768;
        gc.iykq[168] = -1304538010;
        gc.iykq[169] = -1625134548;
        gc.iykq[170] = -1587529519;
        gc.iykq[171] = 1032394017;
        gc.iykq[172] = -751153297;
        gc.iykq[173] = -1956481668;
        gc.iykq[174] = 935167923;
        gc.iykq[175] = 1297915918;
        gc.iykq[176] = -1421063546;
        gc.iykq[177] = 1672106924;
        gc.iykq[178] = 1245830348;
        gc.iykq[179] = 1011189432;
        gc.iykq[180] = 590818264;
        gc.iykq[181] = -1608390104;
        gc.iykq[182] = 266913858;
        gc.iykq[183] = 1671173306;
        gc.iykq[184] = -1508039596;
        gc.iykq[185] = 987842825;
        gc.iykq[186] = 1584825171;
        gc.iykq[187] = 1536980565;
        gc.iykq[188] = -1677630856;
        gc.iykq[189] = 1895600012;
        gc.iykq[190] = -37548498;
        gc.iykq[191] = -1516732138;
        gc.iykq[192] = 1433746275;
        gc.iykq[193] = 1820639627;
        gc.iykq[194] = 1807818618;
        gc.iykq[195] = 875485510;
        gc.iykq[196] = -409495400;
        gc.iykq[197] = -596663567;
        gc.iykq[198] = -386334354;
        gc.iykq[199] = 1974040454;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void tryPlaceLegit() {
        block103: {
            block102: {
                var7_1 = gc.c;
                var6_2 /* !! */  = gc.b;
                var5_3 = gc.a;
                if (var7_1) {
                    throw null;
lbl6:
                    // 29 sources

                    return;
                }
                if (var5_3 || var5_3) ** GOTO lbl6
                var1_4 = class_310.method_1551();
                if (var5_3 || var5_3) ** GOTO lbl6
                if (var1_4.field_1761 == null) break block102;
                if (var5_3) ** GOTO lbl6
                if (var1_4.field_1724 != null) break block103;
                if (var5_3) ** GOTO lbl6
            }
            if (var5_3 || var5_3) ** GOTO lbl6
            return;
        }
        if (var5_3 || var5_3) ** GOTO lbl6
        if (System.currentTimeMillis() - this.enableTimeMs >= gc.iykl("iywc", iyki(int ), (int)117)) ** GOTO lbl26
        if (var5_3) ** GOTO lbl6
        if (var6_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var6_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                return;
            }
lbl26:
            // 1 sources

            if (var5_3 || var5_3) ** GOTO lbl6
            if (var1_4.field_1761.method_2920() == class_1934.field_9219) ** GOTO lbl31
            if (var5_3) ** GOTO lbl6
            if (!var1_4.field_1724.method_6115()) ** GOTO lbl33
            if (var5_3) ** GOTO lbl6
lbl31:
            // 2 sources

            if (var5_3 || var5_3) ** GOTO lbl6
            return;
lbl33:
            // 1 sources

            if (var5_3 || var5_3) ** GOTO lbl6
            var2_5 = var1_4.field_1765;
            if (var5_3 || var5_3) ** GOTO lbl6
            if (!(var2_5 instanceof class_3965)) ** GOTO lbl42
            if (var5_3) ** GOTO lbl6
            var3_6 = (class_3965)var2_5;
            if (var5_3 || var5_3) ** GOTO lbl6
            if (var2_5.method_17783() == class_239.class_240.field_1332) ** GOTO lbl44
            if (var5_3) ** GOTO lbl6
lbl42:
            // 2 sources

            if (var5_3 || var5_3) ** GOTO lbl6
            return;
lbl44:
            // 1 sources

            if (var5_3 || var5_3) ** GOTO lbl6
            if (this.isValidPlaceRaycast(var3_6)) ** GOTO lbl48
            if (var5_3) ** GOTO lbl6
            return;
lbl48:
            // 1 sources

            if (var5_3 || var5_3) ** GOTO lbl6
            var4_7 = this.getBlockSlot();
            if (var5_3 || var5_3) ** GOTO lbl6
            if (var4_7 != gc.iykl("iywd", iyks(int ), (int)180)) ** GOTO lbl54
            if (var5_3) ** GOTO lbl6
            return;
lbl54:
            // 1 sources

            if (var5_3 || var5_3) ** GOTO lbl6
            if (this.oldSlot != gc.iykl("iywe", iyks(int ), (int)181)) ** GOTO lbl59
            if (var5_3) ** GOTO lbl6
            this.oldSlot = var1_4.field_1724.method_31548().method_67532();
            if (var5_3) ** GOTO lbl6
lbl59:
            // 2 sources

            if (var5_3 || var5_3) ** GOTO lbl6
            var1_4.field_1724.method_31548().method_61496(var4_7);
            if (var5_3 || var5_3) ** GOTO lbl6
            class_304.method_1420((class_3675.class_306)var1_4.field_1690.field_1904.method_1429());
            if (var5_3 || var5_3) ** GOTO lbl6
            var1_4.field_1724.method_6104(class_1268.field_5808);
            if (!var5_3 && !var5_3) ** break;
            ** continue;
            return;
lbl68:
            // 2 sources

            case 0: {
                var6_2 /* !! */  = (int)gc.iykl("iywf", iyks(int ), (int)182);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl103
            }
lbl73:
            // 4 sources

            case 1: {
                var6_2 /* !! */  = (int)gc.iykl("iywg", iyks(int ), (int)183);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl213
            }
lbl78:
            // 2 sources

            case 2: {
                var6_2 /* !! */  = (int)gc.iykl("iywh", iyks(int ), (int)184);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl189
            }
            case 3: {
                var6_2 /* !! */  = (int)gc.iykl("iywi", iyks(int ), (int)185);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl268
            }
lbl88:
            // 2 sources

            case 4: {
                var6_2 /* !! */  = (int)gc.iykl("iywj", iyks(int ), (int)186);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl137
            }
            case 5: {
                var6_2 /* !! */  = (int)gc.iykl("iywk", iyks(int ), (int)187);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl272
            }
lbl98:
            // 2 sources

            case 6: {
                var6_2 /* !! */  = (int)gc.iykl("iywl", iyks(int ), (int)188);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl239
            }
lbl103:
            // 2 sources

            case 7: {
                var6_2 /* !! */  = (int)gc.iykl("iywm", iyks(int ), (int)189);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl256
            }
lbl108:
            // 3 sources

            case 8: {
                var6_2 /* !! */  = (int)gc.iykl("iywn", iyks(int ), (int)190);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl222
            }
lbl113:
            // 2 sources

            case 9: {
                var6_2 /* !! */  = (int)gc.iykl("iywo", iyks(int ), (int)191);
                if (!var7_1) ** GOTO lbl108
                throw null;
            }
            case 10: {
                var6_2 /* !! */  = (int)gc.iykl("iywp", iyks(int ), (int)192);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl260
            }
            case 11: {
                var6_2 /* !! */  = (int)gc.iykl("iywq", iyks(int ), (int)193);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl181
            }
            case 12: {
                var6_2 /* !! */  = (int)gc.iykl("iywr", iyks(int ), (int)194);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl260
            }
lbl132:
            // 3 sources

            case 13: {
                var6_2 /* !! */  = (int)gc.iykl("iyws", iyks(int ), (int)195);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl227
            }
lbl137:
            // 3 sources

            case 14: {
                var6_2 /* !! */  = (int)gc.iykl("iywt", iyks(int ), (int)196);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl172
            }
lbl142:
            // 2 sources

            case 15: {
                var6_2 /* !! */  = (int)gc.iykl("iywu", iyks(int ), (int)197);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl256
            }
lbl147:
            // 2 sources

            case 16: {
                var6_2 /* !! */  = (int)gc.iykl("iywv", iyks(int ), (int)198);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl167
            }
lbl152:
            // 2 sources

            case 17: {
                var6_2 /* !! */  = (int)gc.iykl("iyww", iyks(int ), (int)199);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl222
            }
            case 18: {
                var6_2 /* !! */  = (int)gc.iykl("iywx", iyks(int ), (int)200);
                if (!var7_1) ** GOTO lbl98
                throw null;
            }
            case 19: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var6_2 /* !! */  = (int)gc.iykl("iywy", iyks(int ), (int)201);
                    if (var7_1) {
                        throw null;
                    }
                    ** GOTO lbl260
                    break;
                }
            }
lbl167:
            // 3 sources

            case 20: {
                var6_2 /* !! */  = (int)gc.iykl("iywz", iyks(int ), (int)202);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl193
            }
lbl172:
            // 2 sources

            case 21: {
                var6_2 /* !! */  = (int)gc.iykl("iyxa", iyks(int ), (int)203);
                if (!var7_1) ** GOTO lbl167
                throw null;
            }
            case 22: {
                var6_2 /* !! */  = (int)gc.iykl("iyxb", iyks(int ), (int)204);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl256
            }
lbl181:
            // 3 sources

            case 23: {
                var6_2 /* !! */  = (int)gc.iykl("iyxc", iyks(int ), (int)205);
                if (!var7_1) ** GOTO lbl132
                throw null;
            }
lbl185:
            // 2 sources

            case 24: {
                var6_2 /* !! */  = (int)gc.iykl("iyxd", iyks(int ), (int)206);
                if (var7_1) {
                    throw null;
                }
            }
lbl189:
            // 4 sources

            case 25: {
                var6_2 /* !! */  = (int)gc.iykl("iyxe", iyks(int ), (int)207);
                if (!var7_1) ** GOTO lbl68
                throw null;
            }
lbl193:
            // 2 sources

            case 26: {
                var6_2 /* !! */  = (int)gc.iykl("iyxf", iyks(int ), (int)208);
                if (!var7_1) ** GOTO lbl73
                throw null;
            }
lbl197:
            // 2 sources

            case 27: {
                var6_2 /* !! */  = (int)gc.iykl("iyxg", iyks(int ), (int)209);
                if (!var7_1) ** GOTO lbl73
                throw null;
            }
            case 28: {
                var6_2 /* !! */  = (int)gc.iykl("iyxh", iyks(int ), (int)210);
                if (!var7_1) ** GOTO lbl185
                throw null;
            }
            case 29: {
                var6_2 /* !! */  = (int)gc.iykl("iyxi", iyks(int ), (int)211);
                if (!var7_1) ** GOTO lbl137
                throw null;
            }
lbl209:
            // 2 sources

            case 30: {
                var6_2 /* !! */  = (int)gc.iykl("iyxj", iyks(int ), (int)212);
                if (!var7_1) ** GOTO lbl197
                throw null;
            }
lbl213:
            // 3 sources

            case 31: {
                var6_2 /* !! */  = (int)gc.iykl("iyxk", iyks(int ), (int)213);
                if (!var7_1) ** GOTO lbl152
                throw null;
            }
lbl217:
            // 3 sources

            case 32: {
                var6_2 /* !! */  = (int)gc.iykl("iyxl", iyks(int ), (int)214);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl288
            }
lbl222:
            // 3 sources

            case 33: {
                var6_2 /* !! */  = (int)gc.iykl("iyxm", iyks(int ), (int)215);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl244
            }
lbl227:
            // 2 sources

            case 34: {
                var6_2 /* !! */  = (int)gc.iykl("iyxn", iyks(int ), (int)216);
                if (!var7_1) ** GOTO lbl142
                throw null;
            }
            case 35: {
                var6_2 /* !! */  = (int)gc.iykl("iyxo", iyks(int ), (int)217);
                if (!var7_1) ** GOTO lbl147
                throw null;
            }
            case 36: {
                var6_2 /* !! */  = (int)gc.iykl("iyxp", iyks(int ), (int)218);
                if (!var7_1) ** GOTO lbl181
                throw null;
            }
lbl239:
            // 4 sources

            case 37: {
                var6_2 /* !! */  = (int)gc.iykl("iyxq", iyks(int ), (int)219);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl284
            }
lbl244:
            // 2 sources

            case 38: {
                var6_2 /* !! */  = (int)gc.iykl("iyxr", iyks(int ), (int)220);
                if (!var7_1) ** GOTO lbl239
                throw null;
            }
            case 39: {
                var6_2 /* !! */  = (int)gc.iykl("iyxs", iyks(int ), (int)221);
                if (!var7_1) ** GOTO lbl78
                throw null;
            }
            case 40: {
                var6_2 /* !! */  = (int)gc.iykl("iyxt", iyks(int ), (int)222);
                if (!var7_1) ** GOTO lbl113
                throw null;
            }
lbl256:
            // 5 sources

            case 41: {
                var6_2 /* !! */  = (int)gc.iykl("iyxu", iyks(int ), (int)223);
                if (!var7_1) ** GOTO lbl88
                throw null;
            }
lbl260:
            // 4 sources

            case 42: {
                var6_2 /* !! */  = (int)gc.iykl("iyxv", iyks(int ), (int)224);
                if (!var7_1) ** GOTO lbl217
                throw null;
            }
            case 43: {
                var6_2 /* !! */  = (int)gc.iykl("iyxw", iyks(int ), (int)225);
                if (!var7_1) ** GOTO lbl256
                throw null;
            }
lbl268:
            // 2 sources

            case 44: {
                var6_2 /* !! */  = (int)gc.iykl("iyxx", iyks(int ), (int)226);
                if (!var7_1) ** GOTO lbl213
                throw null;
            }
lbl272:
            // 2 sources

            case 45: {
                var6_2 /* !! */  = (int)gc.iykl("iyxy", iyks(int ), (int)227);
                if (!var7_1) ** GOTO lbl108
                throw null;
            }
            case 46: {
                var6_2 /* !! */  = (int)gc.iykl("iyxz", iyks(int ), (int)228);
                if (!var7_1) ** GOTO lbl209
                throw null;
            }
            case 47: {
                var6_2 /* !! */  = (int)gc.iykl("iyya", iyks(int ), (int)229);
                if (!var7_1) ** GOTO lbl132
                throw null;
            }
lbl284:
            // 2 sources

            case 48: {
                var6_2 /* !! */  = (int)gc.iykl("iyyb", iyks(int ), (int)230);
                if (!var7_1) ** GOTO lbl217
                throw null;
            }
lbl288:
            // 2 sources

            case 49: {
                var6_2 /* !! */  = (int)gc.iykl("iyyc", iyks(int ), (int)231);
                if (!var7_1) ** GOTO lbl239
                throw null;
            }
            case 50: {
                var6_2 /* !! */  = (int)gc.iykl("iyyd", iyks(int ), (int)232);
                if (!var7_1) ** GOTO lbl73
                throw null;
            }
            case 51: 
        }
        var6_2 /* !! */  = (int)gc.iykl("iyye", iyks(int ), (int)233);
        ** while (!var7_1)
lbl299:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void activate() {
        block115: {
            v0 /* !! */  = gc.qv;
            if (true) ** GOTO lbl5
            block76: while (true) {
                v0 /* !! */  = (long)(v1 - gc.iykl("iyld", iyki(int ), (int)2));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -665448232: {
                        v1 = gc.iykl("iyle", iyki(int ), (int)3);
                        continue block76;
                    }
                    case -327214805: {
                        v1 = gc.iykl("iylf", iyki(int ), (int)4);
                        continue block76;
                    }
                    case -6253801: {
                        break block76;
                    }
                    case 2073023152: {
                        v1 = gc.iykl("iylg", iyki(int ), (int)5);
                        continue block76;
                    }
                }
                break;
            }
            var4_1 = gc.c;
            v2 /* !! */  = gc.qv;
            if (true) ** GOTO lbl22
            block77: while (true) {
                v2 /* !! */  = (long)(v3 - gc.iykl("iylh", iyki(int ), (int)6));
lbl22:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case -1812304181: {
                        v3 = gc.iykl("iyli", iyki(int ), (int)7);
                        continue block77;
                    }
                    case -6253801: {
                        break block77;
                    }
                    case 1108116495: {
                        v3 = gc.iykl("iylj", iyki(int ), (int)8);
                        continue block77;
                    }
                }
                break;
            }
            var3_2 /* !! */  = gc.b;
            while (true) {
                if ((v4 /* !! */  = (cfr_temp_0 = gc.qv - gc.iykl("iylk", iyki(int ), (int)9)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v4 /* !! */  == gc.iykl("iyll", iyks(int ), (int)11)) break;
                v4 /* !! */  = (long)gc.iykl("iylm", iyks(int ), (int)12);
            }
            var2_3 = gc.a;
            if (var4_1) {
                throw null;
lbl40:
                // 10 sources

                return;
            }
            if (var2_3 || var2_3) ** GOTO lbl40
            v5 /* !! */  = gc.qv;
            if (true) ** GOTO lbl47
            block80: while (true) {
                v5 /* !! */  = (long)(v6 - gc.iykl("iyln", iyki(int ), (int)10));
lbl47:
                // 2 sources

                switch ((int)v5 /* !! */ ) {
                    case -1712557571: {
                        v6 = gc.iykl("iylo", iyki(int ), (int)11);
                        continue block80;
                    }
                    case -978237824: {
                        v6 = gc.iykl("iylp", iyki(int ), (int)12);
                        continue block80;
                    }
                    case -6253801: {
                        break block80;
                    }
                    case 1994690896: {
                        v6 = gc.iykl("iylq", iyki(int ), (int)13);
                        continue block80;
                    }
                }
                break;
            }
            super.activate();
            if (var2_3 || var2_3) ** GOTO lbl40
            while (true) {
                if ((v7 /* !! */  = (cfr_temp_1 = gc.qv - gc.iykl("iylr", iyki(int ), (int)14)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v7 /* !! */  == gc.iykl("iyls", iyks(int ), (int)13)) break;
                v7 /* !! */  = (long)gc.iykl("iylt", iyks(int ), (int)14);
            }
            var1_4 = class_310.method_1551();
            if (var2_3 || var2_3) ** GOTO lbl40
            while (true) {
                if ((v8 /* !! */  = (cfr_temp_2 = gc.qv - gc.iykl("iylu", iyki(int ), (int)15)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v8 /* !! */  == gc.iykl("iylv", iyks(int ), (int)15)) break;
                v8 /* !! */  = (long)gc.iykl("iylw", iyks(int ), (int)16);
            }
            if (var1_4.field_1724 != null) break block115;
            if (var2_3) ** GOTO lbl40
            return;
        }
        if (var2_3 || var2_3) ** GOTO lbl40
        v9 /* !! */  = gc.qv;
        if (true) ** GOTO lbl82
        block83: while (true) {
            v9 /* !! */  = (long)(gc.iykl("iyly", iyki(int ), (int)17) - gc.iykl("iylx", iyki(int ), (int)16));
lbl82:
            // 2 sources

            switch ((int)v9 /* !! */ ) {
                case -6253801: {
                    break block83;
                }
                case 1431590454: {
                    continue block83;
                }
            }
            break;
        }
        v10 = var1_4.field_1724;
        v11 /* !! */  = gc.qv;
        if (true) ** GOTO lbl92
        block84: while (true) {
            v11 /* !! */  = (long)(v12 - gc.iykl("iylz", iyki(int ), (int)18));
lbl92:
            // 2 sources

            switch ((int)v11 /* !! */ ) {
                case -1776048451: {
                    v12 = gc.iykl("iyma", iyki(int ), (int)19);
                    continue block84;
                }
                case -102346776: {
                    v12 = gc.iykl("iymb", iyki(int ), (int)20);
                    continue block84;
                }
                case -6253801: {
                    break block84;
                }
                case 218362664: {
                    v12 = gc.iykl("iymc", iyki(int ), (int)21);
                    continue block84;
                }
            }
            break;
        }
        v13 = v10.method_31548();
        v14 /* !! */  = gc.qv;
        if (true) ** GOTO lbl109
        block85: while (true) {
            v14 /* !! */  = (long)(v15 - gc.iykl("iymd", iyki(int ), (int)22));
lbl109:
            // 2 sources

            switch ((int)v14 /* !! */ ) {
                case -950189357: {
                    v15 = gc.iykl("iyme", iyki(int ), (int)23);
                    continue block85;
                }
                case -569962392: {
                    v15 = gc.iykl("iymf", iyki(int ), (int)24);
                    continue block85;
                }
                case -439794009: {
                    v15 = gc.iykl("iymg", iyki(int ), (int)25);
                    continue block85;
                }
                case -6253801: {
                    break block85;
                }
            }
            break;
        }
        v16 = v13.method_67532();
        while (true) {
            if ((v17 /* !! */  = (cfr_temp_3 = gc.qv - gc.iykl("iymh", iyki(int ), (int)26)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v17 /* !! */  == gc.iykl("iymi", iyks(int ), (int)17)) break;
            v17 /* !! */  = (long)gc.iykl("iymj", iyks(int ), (int)18);
        }
        this.oldSlot = v16;
        if (var2_3 || var2_3) ** GOTO lbl40
        while (true) {
            if ((v18 /* !! */  = (cfr_temp_4 = gc.qv - gc.iykl("iymk", iyki(int ), (int)27)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v18 /* !! */  == gc.iykl("iyml", iyks(int ), (int)19)) break;
            v18 /* !! */  = (long)gc.iykl("iymm", iyks(int ), (int)20);
        }
        v19 = this.getMovementBasedYaw();
        v20 /* !! */  = gc.qv;
        if (true) ** GOTO lbl139
        block88: while (true) {
            v20 /* !! */  = (long)(v21 - gc.iykl("iymn", iyki(int ), (int)28));
lbl139:
            // 2 sources

            switch ((int)v20 /* !! */ ) {
                case -1301511244: {
                    v21 = gc.iykl("iymo", iyki(int ), (int)29);
                    continue block88;
                }
                case -6253801: {
                    break block88;
                }
                case 145744533: {
                    v21 = gc.iykl("iymp", iyki(int ), (int)30);
                    continue block88;
                }
                case 1418837907: {
                    v21 = gc.iykl("iymq", iyki(int ), (int)31);
                    continue block88;
                }
            }
            break;
        }
        this.stableYaw = v19;
        if (var2_3 || var2_3) ** GOTO lbl40
        v22 = gc.iykl("iymr", iyks(int ), (int)21);
        v23 /* !! */  = gc.qv;
        if (true) ** GOTO lbl158
        block89: while (true) {
            v23 /* !! */  = (long)(gc.iykl("iymt", iyki(int ), (int)33) - gc.iykl("iyms", iyki(int ), (int)32));
lbl158:
            // 2 sources

            switch ((int)v23 /* !! */ ) {
                case -485851603: {
                    continue block89;
                }
                case -6253801: {
                    break block89;
                }
            }
            break;
        }
        this.lockedBlockSlot = (int)v22;
        if (var2_3 || var2_3) ** GOTO lbl40
        v24 = gc.iykl("iymu", iyki(int ), (int)34);
        while (true) {
            if ((v25 /* !! */  = (cfr_temp_5 = gc.qv - gc.iykl("iymv", iyki(int ), (int)35)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v25 /* !! */  == gc.iykl("iymw", iyks(int ), (int)22)) break;
            v25 /* !! */  = (long)gc.iykl("iymx", iyks(int ), (int)23);
        }
        this.lastRightClickTime = (long)v24;
        if (var2_3 || var2_3) ** GOTO lbl40
        v26 /* !! */  = gc.qv;
        if (true) ** GOTO lbl177
        block91: while (true) {
            v26 /* !! */  = (long)(v27 - gc.iykl("iymy", iyki(int ), (int)36));
lbl177:
            // 2 sources

            switch ((int)v26 /* !! */ ) {
                case -844793367: {
                    v27 = gc.iykl("iymz", iyki(int ), (int)37);
                    continue block91;
                }
                case -6253801: {
                    break block91;
                }
                case 169265522: {
                    v27 = gc.iykl("iyna", iyki(int ), (int)38);
                    continue block91;
                }
            }
            break;
        }
        v28 = System.currentTimeMillis();
        v29 /* !! */  = gc.qv;
        if (true) ** GOTO lbl191
        block92: while (true) {
            v29 /* !! */  = (long)(gc.iykl("iync", iyki(int ), (int)40) - gc.iykl("iynb", iyki(int ), (int)39));
lbl191:
            // 2 sources

            switch ((int)v29 /* !! */ ) {
                case -207776971: {
                    continue block92;
                }
                case -6253801: {
                    break block92;
                }
            }
            break;
        }
        this.enableTimeMs = v28;
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var2_3 && !var2_3) ** break;
                ** continue;
                return;
            }
            case 0: {
                var3_2 /* !! */  = (int)gc.iykl("iynd", iyks(int ), (int)24);
                if (var4_1) {
                    throw null;
                }
            }
lbl207:
            // 4 sources

            case 1: {
                var3_2 /* !! */  = (int)gc.iykl("iyne", iyks(int ), (int)25);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl269
            }
            case 2: {
                var3_2 /* !! */  = (int)gc.iykl("iynf", iyks(int ), (int)26);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl264
            }
            case 3: {
                var3_2 /* !! */  = (int)gc.iykl("iyng", iyks(int ), (int)27);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl277
            }
lbl222:
            // 2 sources

            case 4: {
                var3_2 /* !! */  = (int)gc.iykl("iynh", iyks(int ), (int)28);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl281
            }
lbl227:
            // 2 sources

            case 5: {
                var3_2 /* !! */  = (int)gc.iykl("iyni", iyks(int ), (int)29);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl237
            }
lbl232:
            // 2 sources

            case 6: {
                var3_2 /* !! */  = (int)gc.iykl("iynj", iyks(int ), (int)30);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl285
            }
lbl237:
            // 3 sources

            case 7: {
                var3_2 /* !! */  = (int)gc.iykl("iynk", iyks(int ), (int)31);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl273
            }
lbl242:
            // 2 sources

            case 8: {
                var3_2 /* !! */  = (int)gc.iykl("iynl", iyks(int ), (int)32);
                if (!var4_1) ** GOTO lbl237
                throw null;
            }
            case 9: {
                var3_2 /* !! */  = (int)gc.iykl("iynm", iyks(int ), (int)33);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl285
            }
            case 10: {
                var3_2 /* !! */  = (int)gc.iykl("iynn", iyks(int ), (int)34);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl264
            }
            case 11: {
                var3_2 /* !! */  = (int)gc.iykl("iyno", iyks(int ), (int)35);
                if (var4_1) {
                    throw null;
                }
            }
            case 12: {
                var3_2 /* !! */  = (int)gc.iykl("iynp", iyks(int ), (int)36);
                if (!var4_1) ** GOTO lbl232
                throw null;
            }
lbl264:
            // 3 sources

            case 13: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_2 /* !! */  = (int)gc.iykl("iynq", iyks(int ), (int)37);
                    if (!var4_1) ** GOTO lbl222
                    throw null;
                }
            }
lbl269:
            // 3 sources

            case 14: {
                var3_2 /* !! */  = (int)gc.iykl("iynr", iyks(int ), (int)38);
                if (!var4_1) ** GOTO lbl207
                throw null;
            }
lbl273:
            // 3 sources

            case 15: {
                var3_2 /* !! */  = (int)gc.iykl("iyns", iyks(int ), (int)39);
                if (!var4_1) ** GOTO lbl227
                throw null;
            }
lbl277:
            // 2 sources

            case 16: {
                var3_2 /* !! */  = (int)gc.iykl("iynt", iyks(int ), (int)40);
                if (!var4_1) ** GOTO lbl269
                throw null;
            }
lbl281:
            // 2 sources

            case 17: {
                var3_2 /* !! */  = (int)gc.iykl("iynu", iyks(int ), (int)41);
                if (!var4_1) ** GOTO lbl242
                throw null;
            }
lbl285:
            // 4 sources

            case 18: {
                var3_2 /* !! */  = (int)gc.iykl("iynv", iyks(int ), (int)42);
                if (!var4_1) ** GOTO lbl273
                throw null;
            }
            case 19: {
                var3_2 /* !! */  = (int)gc.iykl("iynw", iyks(int ), (int)43);
                if (!var4_1) ** GOTO lbl285
                throw null;
            }
            case 20: {
                var3_2 /* !! */  = (int)gc.iykl("iynx", iyks(int ), (int)44);
                if (!var4_1) break;
                throw null;
            }
            case 21: 
        }
        var3_2 /* !! */  = (int)gc.iykl("iyny", iyks(int ), (int)45);
        ** while (!var4_1)
lbl300:
        // 1 sources

        throw null;
    }

    public static /* synthetic */ CallSite iykl(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public gc() {
        var2_1 /* !! */  = gc.b;
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        block0 : switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                super("Scaffold", "Advanced Scaffold", du.MOVEMENT);
                this.lastRightClickTime = (long)gc.iykl("iykm", iyki(int ), (int)0);
                this.enableTimeMs = (long)gc.iykl("iykn", iyki(int ), (int)1);
                this.stableYaw = (float)gc.iykl("iykr", iyko(int ), (int)0);
                this.oldSlot = (int)gc.iykl("iykt", iyks(int ), (int)1);
                this.lockedBlockSlot = (int)gc.iykl("iyku", iyks(int ), (int)2);
                return;
            }
            case 0: {
                var2_1 /* !! */  = (int)gc.iykl("iykv", iyks(int ), (int)3);
                ** GOTO lbl26
            }
            case 1: {
                var2_1 /* !! */  = (int)gc.iykl("iykw", iyks(int ), (int)4);
                ** GOTO lbl22
            }
            case 2: {
                while (true) {
                    var2_1 /* !! */  = (int)gc.iykl("iykx", iyks(int ), (int)5);
                }
            }
lbl22:
            // 2 sources

            case 3: {
                while (true) {
                    var2_1 /* !! */  = (int)gc.iykl("iyky", iyks(int ), (int)6);
                }
            }
lbl26:
            // 3 sources

            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)gc.iykl("iykz", iyks(int ), (int)7);
                    break block0;
                    break;
                }
            }
            case 5: {
                while (true) {
                    var2_1 /* !! */  = (int)gc.iykl("iyla", iyks(int ), (int)8);
                }
            }
            case 6: {
                var2_1 /* !! */  = (int)gc.iykl("iylb", iyks(int ), (int)9);
                ** GOTO lbl26
            }
            case 7: 
        }
        var2_1 /* !! */  = (int)gc.iykl("iylc", iyks(int ), (int)10);
        ** while (true)
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private float getTargetYaw() {
        boolean bl2;
        Object object = qv;
        boolean bl3 = true;
        block10: while (true) {
            CallSite callSite;
            if (!bl3 || (bl3 = false) || !true) {
                object = callSite - gc.iykl("izkt", iyki(int ), (int)148);
            }
            switch ((int)object) {
                case -67846871: {
                    callSite = gc.iykl("izku", iyki(int ), (int)149);
                    continue block10;
                }
                case -6253801: {
                    break block10;
                }
                case 1163136261: {
                    callSite = gc.iykl("izkv", iyki(int ), (int)150);
                    continue block10;
                }
                case 2129040870: {
                    callSite = gc.iykl("izkw", iyki(int ), (int)151);
                    continue block10;
                }
            }
            break;
        }
        boolean bl4 = c;
        while (true) {
            long l2;
            Object object2;
            if ((object2 = (l2 = qv - gc.iykl("izkx", iyki(int ), (int)152)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object2 == gc.iykl("izky", iyks(int ), (int)413)) break;
            object2 = gc.iykl("izkz", iyks(int ), (int)414);
        }
        int n2 = b;
        while (true) {
            long l3;
            Object object3;
            if ((object3 = (l3 = qv - gc.iykl("izla", iyki(int ), (int)153)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object3 == gc.iykl("izlb", iyks(int ), (int)415)) {
                bl2 = a;
                if (bl4) {
                    throw null;
                }
                break;
            }
            object3 = gc.iykl("izlc", iyks(int ), (int)416);
        }
        if (bl2) return (float)gc.iykl("izld", iyko(int ), (int)417);
        if (bl2) return (float)gc.iykl("izld", iyko(int ), (int)417);
        Object object4 = qv;
        block13: while (true) {
            switch ((int)object4) {
                case -13538940: {
                    object4 = gc.iykl("izlf", iyki(int ), (int)155) - gc.iykl("izle", iyki(int ), (int)154);
                    continue block13;
                }
                case -6253801: {
                    return this.stableYaw;
                }
            }
            break;
        }
        return this.stableYaw;
    }

    private static /* synthetic */ void izun() {
        gc.iykp[200] = -2044946814;
        gc.iykp[201] = -2007236031;
        gc.iykp[202] = -983846475;
        gc.iykp[203] = -404050383;
        gc.iykp[204] = 1151589145;
        gc.iykp[205] = 142445051;
        gc.iykp[206] = -678974915;
        gc.iykp[207] = 1674493516;
        gc.iykp[208] = 692704801;
        gc.iykp[209] = 1643788966;
        gc.iykp[210] = -899110886;
        gc.iykp[211] = 1674756748;
        gc.iykp[212] = -1334877776;
        gc.iykp[213] = 128403;
        gc.iykp[214] = -1310915982;
        gc.iykp[215] = -275124272;
        gc.iykp[216] = 561411846;
        gc.iykp[217] = 327858023;
        gc.iykp[218] = 513828763;
        gc.iykp[219] = -403278682;
        gc.iykp[220] = -991303582;
        gc.iykp[221] = 1159883412;
        gc.iykp[222] = -1922755643;
        gc.iykp[223] = 766211769;
        gc.iykp[224] = -915318904;
        gc.iykp[225] = 1878094778;
        gc.iykp[226] = -1174285561;
        gc.iykp[227] = 1282537203;
        gc.iykp[228] = 2102516600;
        gc.iykp[229] = -786998611;
        gc.iykp[230] = -684955933;
        gc.iykp[231] = -1138582778;
        gc.iykp[232] = 961480762;
        gc.iykp[233] = 1430075589;
        gc.iykp[234] = -2103631852;
        gc.iykp[235] = 2005050800;
        gc.iykp[236] = -1496887275;
        gc.iykp[237] = -36713602;
        gc.iykp[238] = 770818365;
        gc.iykp[239] = 726834669;
        gc.iykp[240] = -652087739;
        gc.iykp[241] = 1645039650;
        gc.iykp[242] = -1686962305;
        gc.iykp[243] = -316577120;
        gc.iykp[244] = 1632882922;
        gc.iykp[245] = 607228150;
        gc.iykp[246] = -1941883908;
        gc.iykp[247] = -1739659558;
        gc.iykp[248] = 614741926;
        gc.iykp[249] = -2100510287;
        gc.iykp[250] = 950145678;
        gc.iykp[251] = 1020604893;
        gc.iykp[252] = 1563490092;
        gc.iykp[253] = -1879567291;
        gc.iykp[254] = 477264386;
        gc.iykp[255] = -1759494219;
        gc.iykp[256] = -29516951;
        gc.iykp[257] = -974838241;
        gc.iykp[258] = -698568212;
        gc.iykp[259] = 917466661;
        gc.iykp[260] = 1868027226;
        gc.iykp[261] = -931943069;
        gc.iykp[262] = -1314609227;
        gc.iykp[263] = -1296752267;
        gc.iykp[264] = -1827738019;
        gc.iykp[265] = -397736253;
        gc.iykp[266] = 627115013;
        gc.iykp[267] = 1017425297;
        gc.iykp[268] = -1348259323;
        gc.iykp[269] = 330009392;
        gc.iykp[270] = 1779509099;
        gc.iykp[271] = -1193340886;
        gc.iykp[272] = -1662155891;
        gc.iykp[273] = 369479193;
        gc.iykp[274] = -588422149;
        gc.iykp[275] = -1179435503;
        gc.iykp[276] = -1844538807;
        gc.iykp[277] = -2019284093;
        gc.iykp[278] = 1884293596;
        gc.iykp[279] = -1058076516;
        gc.iykp[280] = -1032298269;
        gc.iykp[281] = 1821722620;
        gc.iykp[282] = -412412127;
        gc.iykp[283] = -997596786;
        gc.iykp[284] = -1181191375;
        gc.iykp[285] = 204708662;
        gc.iykp[286] = -711435057;
        gc.iykp[287] = -1539505107;
        gc.iykp[288] = -256819464;
        gc.iykp[289] = -413748653;
        gc.iykp[290] = 206132367;
        gc.iykp[291] = 933270313;
        gc.iykp[292] = -1532290799;
        gc.iykp[293] = 1792212234;
        gc.iykp[294] = 1723955905;
        gc.iykp[295] = -1537844361;
        gc.iykp[296] = -859611549;
        gc.iykp[297] = -2142544281;
        gc.iykp[298] = 1321376542;
        gc.iykp[299] = 351623972;
    }
}

