/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1268
 *  net.minecraft.class_1792
 *  net.minecraft.class_310
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.concurrent.ConcurrentHashMap;
import net.minecraft.class_1268;
import net.minecraft.class_1792;
import net.minecraft.class_310;
import ruhack.phobia.nu;
import ruhack.phobia.nv;
import ruhack.phobia.oa;
import ruhack.phobia.oc;

public final class nz {
    private static long[] kzdz;
    private static long[] kzdy;
    private static oa currentSwap;
    public static final boolean a;
    private static final PriorityQueue<oa> swapQueue;
    public static final int PRIORITY_HIGH = 10;
    public static final int b;
    private static final long SWAP_TIMEOUT = 3000L;
    static final long tq = 1432376696930834345L;
    private static int[] kzdr;
    public static final boolean c;
    public static final int PRIORITY_NORMAL = 20;
    private static int[] kzds;
    public static final int PRIORITY_CRITICAL = 0;
    private static final class_310 mc;
    private static long currentSwapStartTime;
    public static final int PRIORITY_LOW = 30;
    private static final Map<String, oa> swapRegistry;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void swapAndUseSilent(class_1792 var0) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = nz.tq - nz.kzdt("laay", kzdx(int ), (int)235)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == nz.kzdt("laaz", kzdq(int ), (int)364)) break;
            v0 /* !! */  = (long)nz.kzdt("laba", kzdq(int ), (int)365);
        }
        var3_1 = nz.c;
        v1 /* !! */  = nz.tq;
        if (true) ** GOTO lbl11
        block15: while (true) {
            v1 /* !! */  = (long)(v2 - nz.kzdt("labb", kzdx(int ), (int)236));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1427097993: {
                    v2 = nz.kzdt("labc", kzdx(int ), (int)237);
                    continue block15;
                }
                case -1330854893: {
                    v2 = nz.kzdt("labd", kzdx(int ), (int)238);
                    continue block15;
                }
                case -912065373: {
                    v2 = nz.kzdt("labe", kzdx(int ), (int)239);
                    continue block15;
                }
                case 1293686697: {
                    break block15;
                }
            }
            break;
        }
        var2_2 /* !! */  = nz.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = nz.tq - nz.kzdt("labf", kzdx(int ), (int)240)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == nz.kzdt("labg", kzdq(int ), (int)366)) break;
            v3 /* !! */  = (long)nz.kzdt("labh", kzdq(int ), (int)367);
        }
        var1_3 = nz.a;
        if (var3_1) {
            throw null;
lbl32:
            // 3 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl32
        v4 = nz.kzdt("labi", kzdq(int ), (int)368);
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_2 = nz.tq - nz.kzdt("labj", kzdx(int ), (int)241)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == nz.kzdt("labk", kzdq(int ), (int)369)) break;
            v5 /* !! */  = (long)nz.kzdt("labl", kzdq(int ), (int)370);
        }
        nz.swapAndUseSilent(var0, (int)v4);
        if (var1_3) ** GOTO lbl32
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block6 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var1_3) ** break;
                ** continue;
                return;
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)nz.kzdt("labm", kzdq(int ), (int)371);
                    if (!var3_1) break block6;
                    throw null;
                }
            }
            case 1: {
                do {
                    var2_2 /* !! */  = (int)nz.kzdt("labn", kzdq(int ), (int)372);
                } while (!var3_1);
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)nz.kzdt("labo", kzdq(int ), (int)373);
                if (!var3_1) break;
                throw null;
            }
            case 3: {
                do {
                    var2_2 /* !! */  = (int)nz.kzdt("labp", kzdq(int ), (int)374);
                } while (!var3_1);
                throw null;
            }
            case 4: {
                var2_2 /* !! */  = (int)nz.kzdt("labq", kzdq(int ), (int)375);
                if (!var3_1) break;
                throw null;
            }
            case 5: 
        }
        var2_2 /* !! */  = (int)nz.kzdt("labr", kzdq(int ), (int)376);
        ** while (!var3_1)
lbl75:
        // 1 sources

        throw null;
    }

    static {
        kzdr = new int[565];
        kzds = new int[565];
        nz.laoy();
        nz.laoz();
        nz.lapa();
        nz.lapb();
        nz.lapc();
        nz.lapd();
        nz.lape();
        nz.lapf();
        nz.lapg();
        nz.laph();
        nz.lapi();
        nz.lapj();
        kzdy = new long[398];
        kzdz = new long[398];
        nz.lapk();
        nz.lapl();
        nz.lapm();
        nz.lapn();
        nz.lapo();
        nz.lapp();
        nz.lapq();
        nz.lapr();
        mc = class_310.method_1551();
        swapQueue = new PriorityQueue();
        swapRegistry = new ConcurrentHashMap<String, oa>();
        currentSwap = null;
        currentSwapStartTime = (long)nz.kzdt("laox", kzdx(int ), (int)397);
    }

    private static /* synthetic */ void lapq() {
        nz.kzdz[200] = 260512896919807230L;
        nz.kzdz[201] = 5015219139178873953L;
        nz.kzdz[202] = -6317086810802925454L;
        nz.kzdz[203] = -6374773603620080122L;
        nz.kzdz[204] = -4747565185722001777L;
        nz.kzdz[205] = -1235526853852888470L;
        nz.kzdz[206] = -8932708668567938386L;
        nz.kzdz[207] = 7457248307019029944L;
        nz.kzdz[208] = 3722687393203031340L;
        nz.kzdz[209] = -5563326481400333156L;
        nz.kzdz[210] = -507242386580481122L;
        nz.kzdz[211] = 3160417911576258790L;
        nz.kzdz[212] = -7594151095468969656L;
        nz.kzdz[213] = 475452137411699088L;
        nz.kzdz[214] = 6780388677178143454L;
        nz.kzdz[215] = -8214002269325259119L;
        nz.kzdz[216] = 5612845140151733367L;
        nz.kzdz[217] = -2519867653494658404L;
        nz.kzdz[218] = -2675994443412617089L;
        nz.kzdz[219] = -7739056212922845004L;
        nz.kzdz[220] = -983387499336421374L;
        nz.kzdz[221] = 1141181577032798440L;
        nz.kzdz[222] = -2288968808384841899L;
        nz.kzdz[223] = -3557014910987163366L;
        nz.kzdz[224] = 6512429352810839642L;
        nz.kzdz[225] = 3361656499424601640L;
        nz.kzdz[226] = 3041532424232634621L;
        nz.kzdz[227] = -6329123005158063968L;
        nz.kzdz[228] = 9086194025695167565L;
        nz.kzdz[229] = -1319647787822544262L;
        nz.kzdz[230] = 7195369092289525430L;
        nz.kzdz[231] = 2535651792493470060L;
        nz.kzdz[232] = -4571858851688111200L;
        nz.kzdz[233] = -7303964696185357401L;
        nz.kzdz[234] = -5062976907883111906L;
        nz.kzdz[235] = -2980586902838965113L;
        nz.kzdz[236] = 3484322571190520125L;
        nz.kzdz[237] = 3276846363807856428L;
        nz.kzdz[238] = 4972001165896518537L;
        nz.kzdz[239] = -4444203554005253926L;
        nz.kzdz[240] = 8721102806672655406L;
        nz.kzdz[241] = 1496011830841660200L;
        nz.kzdz[242] = -4813154874661467889L;
        nz.kzdz[243] = 8283920020775891422L;
        nz.kzdz[244] = 8736787630459885053L;
        nz.kzdz[245] = -684634364543845232L;
        nz.kzdz[246] = -2779250193862946659L;
        nz.kzdz[247] = -5061619138513714644L;
        nz.kzdz[248] = 8457662799988356956L;
        nz.kzdz[249] = 8178539840606488211L;
        nz.kzdz[250] = 7653002382268107735L;
        nz.kzdz[251] = 5001534895063033241L;
        nz.kzdz[252] = -4725254639437974909L;
        nz.kzdz[253] = -8784813676129347321L;
        nz.kzdz[254] = -5800163340142640451L;
        nz.kzdz[255] = 9192528869237807315L;
        nz.kzdz[256] = 5264204324875437087L;
        nz.kzdz[257] = -5793127015176868588L;
        nz.kzdz[258] = 2419916831639794727L;
        nz.kzdz[259] = 8510242798860695214L;
        nz.kzdz[260] = 1497321920075766198L;
        nz.kzdz[261] = -798156710692796156L;
        nz.kzdz[262] = -5951574708382401263L;
        nz.kzdz[263] = 3578577126761837280L;
        nz.kzdz[264] = -3343366559060302646L;
        nz.kzdz[265] = -5982670266476652955L;
        nz.kzdz[266] = -3589488040157196378L;
        nz.kzdz[267] = -3259259803858494235L;
        nz.kzdz[268] = -331760622636666047L;
        nz.kzdz[269] = -3387103712307948148L;
        nz.kzdz[270] = 5393720305806052363L;
        nz.kzdz[271] = 6688371590847158253L;
        nz.kzdz[272] = -7587180899833038521L;
        nz.kzdz[273] = 5647875164382248391L;
        nz.kzdz[274] = -1829015599436721055L;
        nz.kzdz[275] = 7947766067208127921L;
        nz.kzdz[276] = -5793367347032040758L;
        nz.kzdz[277] = 5409130183226407568L;
        nz.kzdz[278] = 397795527673641781L;
        nz.kzdz[279] = 231775468311857016L;
        nz.kzdz[280] = -2858186600012211034L;
        nz.kzdz[281] = 4849652118589589389L;
        nz.kzdz[282] = -7879360850735318197L;
        nz.kzdz[283] = 704073273977163193L;
        nz.kzdz[284] = -2714300903423763702L;
        nz.kzdz[285] = -832947095846213392L;
        nz.kzdz[286] = 9070838840971370401L;
        nz.kzdz[287] = -9119901984562990971L;
        nz.kzdz[288] = -5151858715096533180L;
        nz.kzdz[289] = 4356401350112545401L;
        nz.kzdz[290] = 6903276886538785951L;
        nz.kzdz[291] = -4536422650850027956L;
        nz.kzdz[292] = 7946730775034011137L;
        nz.kzdz[293] = -7981522352159940085L;
        nz.kzdz[294] = 440681780702934444L;
        nz.kzdz[295] = -7369922714496152189L;
        nz.kzdz[296] = 7461906274468650507L;
        nz.kzdz[297] = -7974886782400044274L;
        nz.kzdz[298] = -2413367426490426805L;
        nz.kzdz[299] = -9142443329406390971L;
    }

    private static /* synthetic */ void lapa() {
        nz.kzdr[200] = -1341067846;
        nz.kzdr[201] = 55638364;
        nz.kzdr[202] = -1434052064;
        nz.kzdr[203] = 707432471;
        nz.kzdr[204] = 241321263;
        nz.kzdr[205] = 538096658;
        nz.kzdr[206] = 669860021;
        nz.kzdr[207] = -1688769154;
        nz.kzdr[208] = 124737717;
        nz.kzdr[209] = -1459486468;
        nz.kzdr[210] = -1065641596;
        nz.kzdr[211] = 89881228;
        nz.kzdr[212] = 133519531;
        nz.kzdr[213] = -2061113469;
        nz.kzdr[214] = 164249353;
        nz.kzdr[215] = -326816274;
        nz.kzdr[216] = -629571311;
        nz.kzdr[217] = 1044036250;
        nz.kzdr[218] = -196194918;
        nz.kzdr[219] = 1736524683;
        nz.kzdr[220] = -770355272;
        nz.kzdr[221] = -640644226;
        nz.kzdr[222] = 1542182381;
        nz.kzdr[223] = 1997779770;
        nz.kzdr[224] = -1308463;
        nz.kzdr[225] = 233822881;
        nz.kzdr[226] = -1258396620;
        nz.kzdr[227] = -1005455913;
        nz.kzdr[228] = 141275452;
        nz.kzdr[229] = -1527640592;
        nz.kzdr[230] = -1588929578;
        nz.kzdr[231] = -716302710;
        nz.kzdr[232] = 898835181;
        nz.kzdr[233] = -1129535490;
        nz.kzdr[234] = -1512076764;
        nz.kzdr[235] = 1235721905;
        nz.kzdr[236] = 662840504;
        nz.kzdr[237] = 1348115069;
        nz.kzdr[238] = -439456952;
        nz.kzdr[239] = -880351467;
        nz.kzdr[240] = 1314903714;
        nz.kzdr[241] = 25122429;
        nz.kzdr[242] = -1696388268;
        nz.kzdr[243] = -2125098010;
        nz.kzdr[244] = 797978376;
        nz.kzdr[245] = 1039781864;
        nz.kzdr[246] = -1028753778;
        nz.kzdr[247] = 235250520;
        nz.kzdr[248] = 844425059;
        nz.kzdr[249] = 1226462503;
        nz.kzdr[250] = -409725629;
        nz.kzdr[251] = -1728457796;
        nz.kzdr[252] = 1069813997;
        nz.kzdr[253] = -1214209307;
        nz.kzdr[254] = -793072711;
        nz.kzdr[255] = 1464735546;
        nz.kzdr[256] = -1595469886;
        nz.kzdr[257] = 259192933;
        nz.kzdr[258] = -146652321;
        nz.kzdr[259] = -1616789546;
        nz.kzdr[260] = -1080515792;
        nz.kzdr[261] = -1665442027;
        nz.kzdr[262] = -2104539101;
        nz.kzdr[263] = -1688288599;
        nz.kzdr[264] = -192284527;
        nz.kzdr[265] = 711616909;
        nz.kzdr[266] = 1119948344;
        nz.kzdr[267] = -2065275758;
        nz.kzdr[268] = -181203402;
        nz.kzdr[269] = 1538833661;
        nz.kzdr[270] = 1345126601;
        nz.kzdr[271] = 1942074581;
        nz.kzdr[272] = 992342101;
        nz.kzdr[273] = -1547800307;
        nz.kzdr[274] = -2120261348;
        nz.kzdr[275] = 1401000664;
        nz.kzdr[276] = 1659015953;
        nz.kzdr[277] = 2040065395;
        nz.kzdr[278] = 193032138;
        nz.kzdr[279] = 1635383021;
        nz.kzdr[280] = -695930953;
        nz.kzdr[281] = 1809640512;
        nz.kzdr[282] = 87307183;
        nz.kzdr[283] = -228543659;
        nz.kzdr[284] = 1830938922;
        nz.kzdr[285] = 476611972;
        nz.kzdr[286] = 43055080;
        nz.kzdr[287] = -1276269788;
        nz.kzdr[288] = -1334682483;
        nz.kzdr[289] = -1763554652;
        nz.kzdr[290] = -630391510;
        nz.kzdr[291] = -1191247202;
        nz.kzdr[292] = -435966667;
        nz.kzdr[293] = 494089335;
        nz.kzdr[294] = 872697111;
        nz.kzdr[295] = 712346998;
        nz.kzdr[296] = -2060653792;
        nz.kzdr[297] = 1324672604;
        nz.kzdr[298] = 884738643;
        nz.kzdr[299] = 658661499;
    }

    private static /* synthetic */ void lape() {
        nz.kzds[0] = -1973091607;
        nz.kzds[1] = 420269214;
        nz.kzds[2] = 526824492;
        nz.kzds[3] = -1913026731;
        nz.kzds[4] = -1221771198;
        nz.kzds[5] = 966708533;
        nz.kzds[6] = -1421974110;
        nz.kzds[7] = -147492592;
        nz.kzds[8] = -1518846278;
        nz.kzds[9] = -1560422673;
        nz.kzds[10] = 1994902582;
        nz.kzds[11] = -1558990523;
        nz.kzds[12] = -724638504;
        nz.kzds[13] = -988301582;
        nz.kzds[14] = 2021108657;
        nz.kzds[15] = -721165807;
        nz.kzds[16] = 1110826066;
        nz.kzds[17] = 1678670294;
        nz.kzds[18] = 1725930623;
        nz.kzds[19] = 347204259;
        nz.kzds[20] = -293436245;
        nz.kzds[21] = -1037852052;
        nz.kzds[22] = 1549933543;
        nz.kzds[23] = 465545484;
        nz.kzds[24] = -1795572562;
        nz.kzds[25] = -172314899;
        nz.kzds[26] = 262045905;
        nz.kzds[27] = 1693299231;
        nz.kzds[28] = 931258298;
        nz.kzds[29] = 1693147853;
        nz.kzds[30] = 1927225953;
        nz.kzds[31] = -1288756278;
        nz.kzds[32] = 1710461053;
        nz.kzds[33] = -1055493780;
        nz.kzds[34] = 762511644;
        nz.kzds[35] = -623010561;
        nz.kzds[36] = 1377950557;
        nz.kzds[37] = -1625675814;
        nz.kzds[38] = 1394344990;
        nz.kzds[39] = 1710252685;
        nz.kzds[40] = -296649401;
        nz.kzds[41] = 37058319;
        nz.kzds[42] = 919461393;
        nz.kzds[43] = -1678015823;
        nz.kzds[44] = 1104571357;
        nz.kzds[45] = 430093050;
        nz.kzds[46] = -4728111;
        nz.kzds[47] = 438942068;
        nz.kzds[48] = 758856857;
        nz.kzds[49] = -1932114134;
        nz.kzds[50] = -1210124336;
        nz.kzds[51] = 969630495;
        nz.kzds[52] = -609211325;
        nz.kzds[53] = -1936193306;
        nz.kzds[54] = -888032705;
        nz.kzds[55] = 546100682;
        nz.kzds[56] = 1806266709;
        nz.kzds[57] = 1714726141;
        nz.kzds[58] = 1854914676;
        nz.kzds[59] = -226607231;
        nz.kzds[60] = 2119027637;
        nz.kzds[61] = 527472848;
        nz.kzds[62] = -1086632365;
        nz.kzds[63] = 76697779;
        nz.kzds[64] = 119510298;
        nz.kzds[65] = 736898273;
        nz.kzds[66] = 1175886100;
        nz.kzds[67] = 566941963;
        nz.kzds[68] = 858054715;
        nz.kzds[69] = -72742888;
        nz.kzds[70] = -415755673;
        nz.kzds[71] = -1236533457;
        nz.kzds[72] = -250196400;
        nz.kzds[73] = 665727506;
        nz.kzds[74] = -1731810753;
        nz.kzds[75] = 1290827242;
        nz.kzds[76] = -1379284002;
        nz.kzds[77] = 868704272;
        nz.kzds[78] = -841717004;
        nz.kzds[79] = -741749349;
        nz.kzds[80] = -948381734;
        nz.kzds[81] = -419706760;
        nz.kzds[82] = -1736859751;
        nz.kzds[83] = 369132023;
        nz.kzds[84] = -628482623;
        nz.kzds[85] = -755779207;
        nz.kzds[86] = 245749625;
        nz.kzds[87] = -388394232;
        nz.kzds[88] = 1452292540;
        nz.kzds[89] = -1728217247;
        nz.kzds[90] = -65408041;
        nz.kzds[91] = -1356182481;
        nz.kzds[92] = -1670809796;
        nz.kzds[93] = 1262548637;
        nz.kzds[94] = 1044211058;
        nz.kzds[95] = -2096699387;
        nz.kzds[96] = -1086292571;
        nz.kzds[97] = 890588212;
        nz.kzds[98] = -158754508;
        nz.kzds[99] = 896751923;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static String getCurrentSwapId() {
        v0 /* !! */  = nz.tq;
        if (true) ** GOTO lbl5
        block33: while (true) {
            v0 /* !! */  = (long)(v1 - nz.kzdt("kzma", kzdx(int ), (int)93));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1415983038: {
                    v1 = nz.kzdt("kzmb", kzdx(int ), (int)94);
                    continue block33;
                }
                case -1400535198: {
                    v1 = nz.kzdt("kzmc", kzdx(int ), (int)95);
                    continue block33;
                }
                case 1293686697: {
                    break block33;
                }
            }
            break;
        }
        var2 = nz.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = nz.tq - nz.kzdt("kzmd", kzdx(int ), (int)96)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == nz.kzdt("kzme", kzdq(int ), (int)118)) break;
            v2 /* !! */  = (long)nz.kzdt("kzmf", kzdq(int ), (int)119);
        }
        var1_1 /* !! */  = nz.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = nz.tq - nz.kzdt("kzmg", kzdx(int ), (int)97)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == nz.kzdt("kzmh", kzdq(int ), (int)120)) break;
            v3 /* !! */  = (long)nz.kzdt("kzmi", kzdq(int ), (int)121);
        }
        var0_2 = nz.a;
        if (!var2) ** GOTO lbl35
        throw null;
        {
            if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
            switch (var1_1 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return null;
                }
lbl35:
                // 1 sources

                if (var0_2 || var0_2) continue block36;
                v4 /* !! */  = nz.tq;
                if (true) ** GOTO lbl40
                block37: while (true) {
                    v4 /* !! */  = (long)(v5 - nz.kzdt("kzmj", kzdx(int ), (int)98));
lbl40:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case 219648415: {
                            v5 = nz.kzdt("kzmk", kzdx(int ), (int)99);
                            continue block37;
                        }
                        case 1293686697: {
                            break block37;
                        }
                        case 1517196058: {
                            v5 = nz.kzdt("kzml", kzdx(int ), (int)100);
                            continue block37;
                        }
                        case 1627016930: {
                            v5 = nz.kzdt("kzmm", kzdx(int ), (int)101);
                            continue block37;
                        }
                    }
                    break;
                }
                if (nz.currentSwap == null) ** GOTO lbl90
                if (var0_2) continue block36;
                v6 /* !! */  = nz.tq;
                if (true) ** GOTO lbl58
                block38: while (true) {
                    v6 /* !! */  = (long)(v7 - nz.kzdt("kzmn", kzdx(int ), (int)102));
lbl58:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -506466178: {
                            v7 = nz.kzdt("kzmo", kzdx(int ), (int)103);
                            continue block38;
                        }
                        case 954824434: {
                            v7 = nz.kzdt("kzmp", kzdx(int ), (int)104);
                            continue block38;
                        }
                        case 1293686697: {
                            break block38;
                        }
                        case 1315603635: {
                            v7 = nz.kzdt("kzmq", kzdx(int ), (int)105);
                            continue block38;
                        }
                    }
                    break;
                }
                v8 /* !! */  = nz.tq;
                if (true) ** GOTO lbl74
                block39: while (true) {
                    v8 /* !! */  = (long)(v9 - nz.kzdt("kzmr", kzdx(int ), (int)106));
lbl74:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -1314839660: {
                            v9 = nz.kzdt("kzms", kzdx(int ), (int)107);
                            continue block39;
                        }
                        case -167483431: {
                            v9 = nz.kzdt("kzmt", kzdx(int ), (int)108);
                            continue block39;
                        }
                        case 1293686697: {
                            break block39;
                        }
                        case 1723916081: {
                            v9 = nz.kzdt("kzmu", kzdx(int ), (int)109);
                            continue block39;
                        }
                    }
                    break;
                }
                v10 = nz.currentSwap.getId();
                if (var2) {
                    throw null;
                }
                ** GOTO lbl93
lbl90:
                // 1 sources

                if (!var0_2 && !var0_2) ** break;
                continue block36;
                v10 = null;
lbl93:
                // 2 sources

                return v10;
                case 0: {
                    var1_1 /* !! */  = (int)nz.kzdt("kzmv", kzdq(int ), (int)122);
                    if (!var2) break block36;
                    throw null;
                }
                case 1: {
                    var1_1 /* !! */  = (int)nz.kzdt("kzmw", kzdq(int ), (int)123);
                    if (!var2) break block36;
                    throw null;
                }
                case 2: {
                    var1_1 /* !! */  = (int)nz.kzdt("kzmx", kzdq(int ), (int)124);
                    if (var2) {
                        throw null;
                    }
                    ** GOTO lbl112
                }
lbl107:
                // 2 sources

                case 3: lbl-1000:
                // 2 sources

                {
                    while (true) lbl-1000:
                    // 2 sources

                    {
                        var1_1 /* !! */  = (int)nz.kzdt("kzmy", kzdq(int ), (int)125);
                        if (!var2) ** GOTO lbl-1000
                        throw null;
                    }
                }
lbl112:
                // 2 sources

                case 4: {
                    var1_1 /* !! */  = (int)nz.kzdt("kzmz", kzdq(int ), (int)126);
                    if (!var2) break block36;
                    throw null;
                }
                case 5: {
                    do {
                        var1_1 /* !! */  = (int)nz.kzdt("kzna", kzdq(int ), (int)127);
                    } while (!var2);
                    throw null;
                }
                case 6: {
                    var1_1 /* !! */  = (int)nz.kzdt("kznb", kzdq(int ), (int)128);
                    if (!var2) ** GOTO lbl107
                    throw null;
                }
                case 7: 
            }
        }
        var1_1 /* !! */  = (int)nz.kzdt("kznc", kzdq(int ), (int)129);
        ** while (!var2)
lbl128:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void lapn() {
        nz.kzdy[300] = -2878349345200039042L;
        nz.kzdy[301] = 8822517570442683124L;
        nz.kzdy[302] = -1002704229560022031L;
        nz.kzdy[303] = 1798908251886280394L;
        nz.kzdy[304] = -5343484526004825617L;
        nz.kzdy[305] = -3534183614238246203L;
        nz.kzdy[306] = 7034726251094824920L;
        nz.kzdy[307] = 1366218496022383357L;
        nz.kzdy[308] = 4222090613195353467L;
        nz.kzdy[309] = -1665118871441492025L;
        nz.kzdy[310] = -1495580956608776403L;
        nz.kzdy[311] = -5890750052991794472L;
        nz.kzdy[312] = 3619993093860887792L;
        nz.kzdy[313] = 5159727977306968181L;
        nz.kzdy[314] = -5268790613258716263L;
        nz.kzdy[315] = 3090270305191367969L;
        nz.kzdy[316] = -3562002576442670820L;
        nz.kzdy[317] = -1055396955605316406L;
        nz.kzdy[318] = -4865330466428343729L;
        nz.kzdy[319] = 4575130349660568674L;
        nz.kzdy[320] = -1917088994566418978L;
        nz.kzdy[321] = -5830814686790877916L;
        nz.kzdy[322] = 6225136366180757115L;
        nz.kzdy[323] = -7933724334983321219L;
        nz.kzdy[324] = 3637529544550950926L;
        nz.kzdy[325] = 4072004550641600297L;
        nz.kzdy[326] = -1463075349045435841L;
        nz.kzdy[327] = 5594510133545948595L;
        nz.kzdy[328] = 5442636845813340452L;
        nz.kzdy[329] = 5443697392679448379L;
        nz.kzdy[330] = -5871947656549540799L;
        nz.kzdy[331] = -3081482746485119781L;
        nz.kzdy[332] = 9045745831240303275L;
        nz.kzdy[333] = -2829831578056526133L;
        nz.kzdy[334] = 2919632723262782374L;
        nz.kzdy[335] = 5937091456817874696L;
        nz.kzdy[336] = 4246638778427550272L;
        nz.kzdy[337] = 4677479065685718942L;
        nz.kzdy[338] = -6788260301211270576L;
        nz.kzdy[339] = -6045164608865713339L;
        nz.kzdy[340] = -8996509607918639806L;
        nz.kzdy[341] = -8842703527914181142L;
        nz.kzdy[342] = -1593355830549671204L;
        nz.kzdy[343] = -1885760795360100787L;
        nz.kzdy[344] = 2315918552375983948L;
        nz.kzdy[345] = -5669879599612590026L;
        nz.kzdy[346] = 1483215902545315295L;
        nz.kzdy[347] = -8099170206420231469L;
        nz.kzdy[348] = -5870314741510256679L;
        nz.kzdy[349] = -4832842471961031559L;
        nz.kzdy[350] = -2272163817715311817L;
        nz.kzdy[351] = -4751855277249442457L;
        nz.kzdy[352] = 3975838480344340346L;
        nz.kzdy[353] = 7282618318328774358L;
        nz.kzdy[354] = -475745370459001457L;
        nz.kzdy[355] = 1844717502176145211L;
        nz.kzdy[356] = -2641824639435564673L;
        nz.kzdy[357] = 4460100296876418487L;
        nz.kzdy[358] = -4645828519985219966L;
        nz.kzdy[359] = 6024854914331935257L;
        nz.kzdy[360] = -8548668106570029876L;
        nz.kzdy[361] = 4569377747002777911L;
        nz.kzdy[362] = 746920797587882770L;
        nz.kzdy[363] = 4240583116918114607L;
        nz.kzdy[364] = 8584756882785443408L;
        nz.kzdy[365] = 4671321440703377002L;
        nz.kzdy[366] = -8952895207038445094L;
        nz.kzdy[367] = 2396435429972143906L;
        nz.kzdy[368] = -4568692059761685576L;
        nz.kzdy[369] = -3391106145515970017L;
        nz.kzdy[370] = 3260845934023863660L;
        nz.kzdy[371] = -9095769129889040651L;
        nz.kzdy[372] = 1520400271483014610L;
        nz.kzdy[373] = 5416051856623202606L;
        nz.kzdy[374] = -7050420636896832633L;
        nz.kzdy[375] = -8384883725612705447L;
        nz.kzdy[376] = 3125362020254219972L;
        nz.kzdy[377] = 5422489121115325239L;
        nz.kzdy[378] = 2432611344505410764L;
        nz.kzdy[379] = -4871128255882350356L;
        nz.kzdy[380] = 7536302141577075521L;
        nz.kzdy[381] = 4214007898216805210L;
        nz.kzdy[382] = 3349397472173517669L;
        nz.kzdy[383] = 4508179724364881307L;
        nz.kzdy[384] = -1847921366495532569L;
        nz.kzdy[385] = 1676934062965199219L;
        nz.kzdy[386] = 3002769634856109186L;
        nz.kzdy[387] = 3688972971965589888L;
        nz.kzdy[388] = 1148672133870925857L;
        nz.kzdy[389] = 1524125081326219221L;
        nz.kzdy[390] = -2737267608005437809L;
        nz.kzdy[391] = 8356999364888289117L;
        nz.kzdy[392] = 4401702244445922813L;
        nz.kzdy[393] = -205968728831209178L;
        nz.kzdy[394] = 6621334657163805478L;
        nz.kzdy[395] = 6493966059567232587L;
        nz.kzdy[396] = 3269887728973482877L;
        nz.kzdy[397] = -2495473037413074582L;
    }

    public static /* synthetic */ CallSite kzdt(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void lapr() {
        nz.kzdz[300] = -2775550045602898482L;
        nz.kzdz[301] = 3870324602171754115L;
        nz.kzdz[302] = -3585547602027856286L;
        nz.kzdz[303] = 1661272340929121046L;
        nz.kzdz[304] = -7720890855172131854L;
        nz.kzdz[305] = -5854449063644426895L;
        nz.kzdz[306] = 7779597877461778614L;
        nz.kzdz[307] = 1095728410112789754L;
        nz.kzdz[308] = 7941499586298540218L;
        nz.kzdz[309] = 4252087902626867704L;
        nz.kzdz[310] = -3031747675667471278L;
        nz.kzdz[311] = 5874607335739306218L;
        nz.kzdz[312] = 7850986590979047956L;
        nz.kzdz[313] = -2734965347906644470L;
        nz.kzdz[314] = -1541956397856536814L;
        nz.kzdz[315] = 4787978903745635637L;
        nz.kzdz[316] = 5309149607128567324L;
        nz.kzdz[317] = 4311480818349817488L;
        nz.kzdz[318] = -7125392669759569157L;
        nz.kzdz[319] = -4177983794797517050L;
        nz.kzdz[320] = 7052532832001187716L;
        nz.kzdz[321] = 4050792666605047143L;
        nz.kzdz[322] = -8596392855349370479L;
        nz.kzdz[323] = 4028127828101615699L;
        nz.kzdz[324] = -8427548576741075495L;
        nz.kzdz[325] = -8036604684917468703L;
        nz.kzdz[326] = -5974743427599499390L;
        nz.kzdz[327] = 3592894299708466458L;
        nz.kzdz[328] = 2453568351943033824L;
        nz.kzdz[329] = 7542922659970547509L;
        nz.kzdz[330] = 4154258354945051732L;
        nz.kzdz[331] = 5561991809899645554L;
        nz.kzdz[332] = -5292311530020585995L;
        nz.kzdz[333] = -7688478807767020745L;
        nz.kzdz[334] = -3796939415292111053L;
        nz.kzdz[335] = 8473443948537230673L;
        nz.kzdz[336] = 7221998989667495120L;
        nz.kzdz[337] = -2859005235573467595L;
        nz.kzdz[338] = -4395577391100831249L;
        nz.kzdz[339] = 8436498679291043774L;
        nz.kzdz[340] = -2241860375995998824L;
        nz.kzdz[341] = -2396727205099174368L;
        nz.kzdz[342] = 2664522810735428669L;
        nz.kzdz[343] = -8114335032689659223L;
        nz.kzdz[344] = 7739832557051892023L;
        nz.kzdz[345] = 594477991691988667L;
        nz.kzdz[346] = -5964322775684801722L;
        nz.kzdz[347] = -2370675532880733238L;
        nz.kzdz[348] = -4440958171458486772L;
        nz.kzdz[349] = -4886072407485605725L;
        nz.kzdz[350] = -110004268195496868L;
        nz.kzdz[351] = 2630781845463082688L;
        nz.kzdz[352] = -7959882981207708080L;
        nz.kzdz[353] = 930098013661823478L;
        nz.kzdz[354] = 5344100251636674171L;
        nz.kzdz[355] = -1537705753013469413L;
        nz.kzdz[356] = 8592080855772621221L;
        nz.kzdz[357] = 4633341258107473941L;
        nz.kzdz[358] = -354747144205093836L;
        nz.kzdz[359] = -3363911555419689372L;
        nz.kzdz[360] = -4126303260530680277L;
        nz.kzdz[361] = -7851640863600884059L;
        nz.kzdz[362] = 9211557524578162223L;
        nz.kzdz[363] = -6665549425575244981L;
        nz.kzdz[364] = 9131536056091360180L;
        nz.kzdz[365] = 3360627033287561828L;
        nz.kzdz[366] = -4096172682003342934L;
        nz.kzdz[367] = -7662854242158110021L;
        nz.kzdz[368] = 8392396063347399739L;
        nz.kzdz[369] = 8291060727352948881L;
        nz.kzdz[370] = -6403057269619167787L;
        nz.kzdz[371] = -3809149247576505019L;
        nz.kzdz[372] = -7002297206801477230L;
        nz.kzdz[373] = -1378217749968524622L;
        nz.kzdz[374] = 6954428383802718888L;
        nz.kzdz[375] = -1843351921055238896L;
        nz.kzdz[376] = 5233111585370579390L;
        nz.kzdz[377] = -8125209480966212082L;
        nz.kzdz[378] = -5804343258691424401L;
        nz.kzdz[379] = 4613839149965855588L;
        nz.kzdz[380] = 7466482808699627660L;
        nz.kzdz[381] = 2769675471457589225L;
        nz.kzdz[382] = -3464585821788256018L;
        nz.kzdz[383] = -6390736653361787710L;
        nz.kzdz[384] = 7569978379425640301L;
        nz.kzdz[385] = 3582629396236622475L;
        nz.kzdz[386] = -4529965903086394154L;
        nz.kzdz[387] = -7075491952628656371L;
        nz.kzdz[388] = 3933120313289815554L;
        nz.kzdz[389] = -4412441484402009390L;
        nz.kzdz[390] = 3627895163878350226L;
        nz.kzdz[391] = 3855420614848111611L;
        nz.kzdz[392] = 2559080391821153498L;
        nz.kzdz[393] = -1000488995182378979L;
        nz.kzdz[394] = -3763053773679144808L;
        nz.kzdz[395] = 4112508668906809851L;
        nz.kzdz[396] = 1971286564930895658L;
        nz.kzdz[397] = -2495473037413074582L;
    }

    private static /* synthetic */ int kzdq(int n2) {
        return kzdr[n2] ^ kzds[n2];
    }

    private static /* synthetic */ void lapb() {
        nz.kzdr[300] = 625955069;
        nz.kzdr[301] = -639147435;
        nz.kzdr[302] = 1349403111;
        nz.kzdr[303] = -122717948;
        nz.kzdr[304] = -1268267269;
        nz.kzdr[305] = -393485654;
        nz.kzdr[306] = -1155988567;
        nz.kzdr[307] = 443563931;
        nz.kzdr[308] = 1156594510;
        nz.kzdr[309] = 82246147;
        nz.kzdr[310] = -697084421;
        nz.kzdr[311] = 793161441;
        nz.kzdr[312] = 1013755231;
        nz.kzdr[313] = -978170644;
        nz.kzdr[314] = 128695838;
        nz.kzdr[315] = -1155849822;
        nz.kzdr[316] = 181297236;
        nz.kzdr[317] = -645331177;
        nz.kzdr[318] = 555240925;
        nz.kzdr[319] = -561645373;
        nz.kzdr[320] = 167860103;
        nz.kzdr[321] = -351184727;
        nz.kzdr[322] = -1651818449;
        nz.kzdr[323] = 1441416338;
        nz.kzdr[324] = -375180943;
        nz.kzdr[325] = 669193211;
        nz.kzdr[326] = -163829229;
        nz.kzdr[327] = -150476542;
        nz.kzdr[328] = 1097401691;
        nz.kzdr[329] = -1431681716;
        nz.kzdr[330] = -1916721764;
        nz.kzdr[331] = -1352833026;
        nz.kzdr[332] = -1937986225;
        nz.kzdr[333] = 114464792;
        nz.kzdr[334] = -322095840;
        nz.kzdr[335] = -2094125763;
        nz.kzdr[336] = -534716283;
        nz.kzdr[337] = -1830946498;
        nz.kzdr[338] = 88124758;
        nz.kzdr[339] = 1563932380;
        nz.kzdr[340] = -1364412939;
        nz.kzdr[341] = 201138630;
        nz.kzdr[342] = 1361573817;
        nz.kzdr[343] = -1507826243;
        nz.kzdr[344] = 1301803755;
        nz.kzdr[345] = 1825126573;
        nz.kzdr[346] = 954621930;
        nz.kzdr[347] = 1168617328;
        nz.kzdr[348] = -1761022091;
        nz.kzdr[349] = -1639039428;
        nz.kzdr[350] = -1811447691;
        nz.kzdr[351] = 1800007644;
        nz.kzdr[352] = 1847193094;
        nz.kzdr[353] = -1122224299;
        nz.kzdr[354] = -1734993468;
        nz.kzdr[355] = -132932200;
        nz.kzdr[356] = 478582002;
        nz.kzdr[357] = -157795453;
        nz.kzdr[358] = -1971425842;
        nz.kzdr[359] = 1783066326;
        nz.kzdr[360] = 768187251;
        nz.kzdr[361] = -1497619046;
        nz.kzdr[362] = -1951622578;
        nz.kzdr[363] = -1486519760;
        nz.kzdr[364] = 1441839226;
        nz.kzdr[365] = 1811434087;
        nz.kzdr[366] = -895540616;
        nz.kzdr[367] = -750413859;
        nz.kzdr[368] = 729432319;
        nz.kzdr[369] = 976582646;
        nz.kzdr[370] = -518526832;
        nz.kzdr[371] = 320063579;
        nz.kzdr[372] = 1592826895;
        nz.kzdr[373] = -988350044;
        nz.kzdr[374] = 490977918;
        nz.kzdr[375] = 604937529;
        nz.kzdr[376] = -1218869627;
        nz.kzdr[377] = 2133122177;
        nz.kzdr[378] = 1320634479;
        nz.kzdr[379] = 1432914581;
        nz.kzdr[380] = -130531135;
        nz.kzdr[381] = 1729308428;
        nz.kzdr[382] = -2099781040;
        nz.kzdr[383] = -103669149;
        nz.kzdr[384] = -2144104917;
        nz.kzdr[385] = -473606556;
        nz.kzdr[386] = 2110148347;
        nz.kzdr[387] = 1269704282;
        nz.kzdr[388] = -2094650194;
        nz.kzdr[389] = -1758907831;
        nz.kzdr[390] = -668544602;
        nz.kzdr[391] = -1630683985;
        nz.kzdr[392] = 1115553673;
        nz.kzdr[393] = 923438654;
        nz.kzdr[394] = 1214812486;
        nz.kzdr[395] = -1876521251;
        nz.kzdr[396] = 833367158;
        nz.kzdr[397] = 839955360;
        nz.kzdr[398] = 333786535;
        nz.kzdr[399] = 1601933480;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void moveToHotbar(class_1792 var0, int var1_1) {
        block79: {
            block78: {
                while (true) {
                    if ((v0 /* !! */  = (cfr_temp_0 = nz.tq - nz.kzdt("laeg", kzdx(int ), (int)269)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v0 /* !! */  == nz.kzdt("laeh", kzdq(int ), (int)416)) break;
                    v0 /* !! */  = (long)nz.kzdt("laei", kzdq(int ), (int)417);
                }
                var6_2 = nz.c;
                v1 /* !! */  = nz.tq;
                if (true) ** GOTO lbl11
                block53: while (true) {
                    v1 /* !! */  = (long)(nz.kzdt("laek", kzdx(int ), (int)271) - nz.kzdt("laej", kzdx(int ), (int)270));
lbl11:
                    // 2 sources

                    switch ((int)v1 /* !! */ ) {
                        case 1293686697: {
                            break block53;
                        }
                        case 1918837236: {
                            continue block53;
                        }
                    }
                    break;
                }
                var5_3 /* !! */  = nz.b;
                while (true) {
                    if ((v2 /* !! */  = (cfr_temp_1 = nz.tq - nz.kzdt("lael", kzdx(int ), (int)272)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v2 /* !! */  == nz.kzdt("laem", kzdq(int ), (int)418)) break;
                    v2 /* !! */  = (long)nz.kzdt("laen", kzdq(int ), (int)419);
                }
                var4_4 = nz.a;
                if (var6_2) {
                    throw null;
lbl25:
                    // 9 sources

                    return;
                }
                if (var4_4 || var4_4) ** GOTO lbl25
                v3 /* !! */  = nz.tq;
                if (true) ** GOTO lbl32
                block56: while (true) {
                    v3 /* !! */  = (long)(v4 - nz.kzdt("laeo", kzdx(int ), (int)273));
lbl32:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -967853098: {
                            v4 = nz.kzdt("laep", kzdx(int ), (int)274);
                            continue block56;
                        }
                        case -407704150: {
                            v4 = nz.kzdt("laeq", kzdx(int ), (int)275);
                            continue block56;
                        }
                        case 1293686697: {
                            break block56;
                        }
                    }
                    break;
                }
                var2_5 = nv.find(var0);
                if (var4_4 || var4_4) ** GOTO lbl25
                v5 /* !! */  = nz.tq;
                if (true) ** GOTO lbl47
                block57: while (true) {
                    v5 /* !! */  = (long)(nz.kzdt("laes", kzdx(int ), (int)277) - nz.kzdt("laer", kzdx(int ), (int)276));
lbl47:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case 385670959: {
                            continue block57;
                        }
                        case 1293686697: {
                            break block57;
                        }
                    }
                    break;
                }
                if (!var2_5.found()) break block78;
                if (var4_4) ** GOTO lbl25
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_2 = nz.tq - nz.kzdt("laet", kzdx(int ), (int)278)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == nz.kzdt("laeu", kzdq(int ), (int)420)) break;
                    v6 /* !! */  = (long)nz.kzdt("laev", kzdq(int ), (int)421);
                }
                if (!var2_5.isHotbar()) break block79;
                if (var4_4) ** GOTO lbl25
            }
            if (var4_4 || var4_4) ** GOTO lbl25
            return;
        }
        if (var4_4 || var4_4) ** GOTO lbl25
        v7 /* !! */  = nz.tq;
        if (true) ** GOTO lbl70
        block59: while (true) {
            v7 /* !! */  = (long)(nz.kzdt("laex", kzdx(int ), (int)280) - nz.kzdt("laew", kzdx(int ), (int)279));
lbl70:
            // 2 sources

            switch ((int)v7 /* !! */ ) {
                case 1293686697: {
                    break block59;
                }
                case 1756528279: {
                    continue block59;
                }
            }
            break;
        }
        v8 = var0.toString();
        v9 /* !! */  = nz.tq;
        if (true) ** GOTO lbl80
        block60: while (true) {
            v9 /* !! */  = (long)(v10 - nz.kzdt("laey", kzdx(int ), (int)281));
lbl80:
            // 2 sources

            switch ((int)v9 /* !! */ ) {
                case -230267842: {
                    v10 = nz.kzdt("laez", kzdx(int ), (int)282);
                    continue block60;
                }
                case 1293686697: {
                    break block60;
                }
                case 1516837042: {
                    v10 = nz.kzdt("lafa", kzdx(int ), (int)283);
                    continue block60;
                }
            }
            break;
        }
        v11 = System.nanoTime();
        v12 /* !! */  = nz.tq;
        if (true) ** GOTO lbl94
        block61: while (true) {
            v12 /* !! */  = (long)(v13 - nz.kzdt("lafb", kzdx(int ), (int)284));
lbl94:
            // 2 sources

            switch ((int)v12 /* !! */ ) {
                case -115337922: {
                    v13 = nz.kzdt("lafc", kzdx(int ), (int)285);
                    continue block61;
                }
                case 606250766: {
                    v13 = nz.kzdt("lafd", kzdx(int ), (int)286);
                    continue block61;
                }
                case 1293686697: {
                    break block61;
                }
            }
            break;
        }
        var3_6 = "moveToHotbar_" + v8 + "_" + v11;
        if (var4_4 || var4_4) ** GOTO lbl25
        v14 = nz.kzdt("lafe", kzdq(int ), (int)422);
        while (true) {
            if ((v15 /* !! */  = (cfr_temp_3 = nz.tq - nz.kzdt("laff", kzdx(int ), (int)287)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v15 /* !! */  == nz.kzdt("lafg", kzdq(int ), (int)423)) break;
            v15 /* !! */  = (long)nz.kzdt("lafh", kzdq(int ), (int)424);
        }
        v16 = (Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, lambda$moveToHotbar$4(ruhack.phobia.nu int ), ()V)((nu)var2_5, (int)var1_1);
        v17 /* !! */  = nz.tq;
        if (true) ** GOTO lbl116
        block63: while (true) {
            v17 /* !! */  = (long)(v18 - nz.kzdt("lafi", kzdx(int ), (int)288));
lbl116:
            // 2 sources

            switch ((int)v17 /* !! */ ) {
                case -1522621299: {
                    v18 = nz.kzdt("lafj", kzdx(int ), (int)289);
                    continue block63;
                }
                case -244718523: {
                    v18 = nz.kzdt("lafk", kzdx(int ), (int)290);
                    continue block63;
                }
                case 1293686697: {
                    break block63;
                }
                case 1477460516: {
                    v18 = nz.kzdt("lafl", kzdx(int ), (int)291);
                    continue block63;
                }
            }
            break;
        }
        nz.queueSwapInstant(var3_6, (int)v14, v16, null);
        if (var4_4) ** GOTO lbl25
        if (var5_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var4_4) ** break;
                ** continue;
                return;
            }
lbl137:
            // 3 sources

            case 0: {
                var5_3 /* !! */  = (int)nz.kzdt("lafm", kzdq(int ), (int)425);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl194
            }
            case 1: {
                var5_3 /* !! */  = (int)nz.kzdt("lafn", kzdq(int ), (int)426);
                if (!var6_2) ** GOTO lbl137
                throw null;
            }
lbl146:
            // 5 sources

            case 2: {
                var5_3 /* !! */  = (int)nz.kzdt("lafo", kzdq(int ), (int)427);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl182
            }
lbl151:
            // 2 sources

            case 3: {
                var5_3 /* !! */  = (int)nz.kzdt("lafp", kzdq(int ), (int)428);
                if (!var6_2) ** GOTO lbl146
                throw null;
            }
lbl155:
            // 2 sources

            case 4: {
                var5_3 /* !! */  = (int)nz.kzdt("lafq", kzdq(int ), (int)429);
                if (!var6_2) ** GOTO lbl146
                throw null;
            }
lbl159:
            // 2 sources

            case 5: {
                var5_3 /* !! */  = (int)nz.kzdt("lafr", kzdq(int ), (int)430);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl190
            }
lbl164:
            // 2 sources

            case 6: {
                var5_3 /* !! */  = (int)nz.kzdt("lafs", kzdq(int ), (int)431);
                if (!var6_2) ** GOTO lbl155
                throw null;
            }
            case 7: {
                var5_3 /* !! */  = (int)nz.kzdt("laft", kzdq(int ), (int)432);
                if (!var6_2) ** GOTO lbl146
                throw null;
            }
            case 8: {
                var5_3 /* !! */  = (int)nz.kzdt("lafu", kzdq(int ), (int)433);
                if (!var6_2) ** GOTO lbl146
                throw null;
            }
lbl176:
            // 2 sources

            case 9: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_3 /* !! */  = (int)nz.kzdt("lafv", kzdq(int ), (int)434);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl194
                    break;
                }
            }
lbl182:
            // 2 sources

            case 10: {
                var5_3 /* !! */  = (int)nz.kzdt("lafw", kzdq(int ), (int)435);
                if (!var6_2) ** GOTO lbl137
                throw null;
            }
            case 11: {
                var5_3 /* !! */  = (int)nz.kzdt("lafx", kzdq(int ), (int)436);
                if (!var6_2) ** GOTO lbl159
                throw null;
            }
lbl190:
            // 3 sources

            case 12: {
                var5_3 /* !! */  = (int)nz.kzdt("lafy", kzdq(int ), (int)437);
                if (!var6_2) ** GOTO lbl151
                throw null;
            }
lbl194:
            // 3 sources

            case 13: {
                var5_3 /* !! */  = (int)nz.kzdt("lafz", kzdq(int ), (int)438);
                if (!var6_2) ** GOTO lbl164
                throw null;
            }
            case 14: {
                var5_3 /* !! */  = (int)nz.kzdt("laga", kzdq(int ), (int)439);
                if (!var6_2) ** GOTO lbl190
                throw null;
            }
            case 15: {
                var5_3 /* !! */  = (int)nz.kzdt("lagb", kzdq(int ), (int)440);
                if (!var6_2) ** GOTO lbl176
                throw null;
            }
            case 16: 
        }
        var5_3 /* !! */  = (int)nz.kzdt("lagc", kzdq(int ), (int)441);
        ** while (!var6_2)
lbl209:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Deprecated
    public static boolean isLocked() {
        v0 /* !! */  = nz.tq;
        if (true) ** GOTO lbl5
        block10: while (true) {
            v0 /* !! */  = (long)(nz.kzdt("kzwa", kzdx(int ), (int)187) - nz.kzdt("kzvz", kzdx(int ), (int)186));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 1150708399: {
                    continue block10;
                }
                case 1293686697: {
                    break block10;
                }
            }
            break;
        }
        var2 = nz.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = nz.tq - nz.kzdt("kzwb", kzdx(int ), (int)188)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == nz.kzdt("kzwc", kzdq(int ), (int)284)) break;
            v1 /* !! */  = (long)nz.kzdt("kzwd", kzdq(int ), (int)285);
        }
        var1_1 /* !! */  = nz.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = nz.tq - nz.kzdt("kzwe", kzdx(int ), (int)189)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == nz.kzdt("kzwf", kzdq(int ), (int)286)) break;
            v2 /* !! */  = (long)nz.kzdt("kzwg", kzdq(int ), (int)287);
        }
        var0_2 = nz.a;
        if (var2) {
            throw null;
lbl27:
            // 1 sources

            return (boolean)nz.kzdt("kzwh", kzdq(int ), (int)288);
        }
        ** while (var0_2 || var0_2)
lbl30:
        // 1 sources

        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = nz.tq - nz.kzdt("kzwi", kzdx(int ), (int)190)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == nz.kzdt("kzwj", kzdq(int ), (int)289)) break;
                    v3 /* !! */  = (long)nz.kzdt("kzwk", kzdq(int ), (int)290);
                }
                return nz.anySwapRunning();
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var1_1 /* !! */  = (int)nz.kzdt("kzwl", kzdq(int ), (int)291);
                    if (!var2) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 1: {
                var1_1 /* !! */  = (int)nz.kzdt("kzwm", kzdq(int ), (int)292);
                if (var2) {
                    throw null;
                }
            }
            case 2: {
                do {
                    var1_1 /* !! */  = (int)nz.kzdt("kzwn", kzdq(int ), (int)293);
                } while (!var2);
                throw null;
            }
            case 3: 
        }
        var1_1 /* !! */  = (int)nz.kzdt("kzwo", kzdq(int ), (int)294);
        ** while (!var2)
lbl57:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void lapj() {
        nz.kzds[500] = -1522810000;
        nz.kzds[501] = -572884731;
        nz.kzds[502] = 1109786226;
        nz.kzds[503] = 1865660898;
        nz.kzds[504] = -1982052579;
        nz.kzds[505] = 718663584;
        nz.kzds[506] = -424690051;
        nz.kzds[507] = -2033219882;
        nz.kzds[508] = 1230284264;
        nz.kzds[509] = 1298422152;
        nz.kzds[510] = 513130834;
        nz.kzds[511] = -1906326372;
        nz.kzds[512] = -628839952;
        nz.kzds[513] = 63917246;
        nz.kzds[514] = -329875117;
        nz.kzds[515] = -2113202682;
        nz.kzds[516] = -602829294;
        nz.kzds[517] = 1234927412;
        nz.kzds[518] = -1933772501;
        nz.kzds[519] = 832974485;
        nz.kzds[520] = -965716687;
        nz.kzds[521] = -1863357255;
        nz.kzds[522] = -538180386;
        nz.kzds[523] = -1090321783;
        nz.kzds[524] = -1025009842;
        nz.kzds[525] = 1106342638;
        nz.kzds[526] = -1340674572;
        nz.kzds[527] = -1422729333;
        nz.kzds[528] = 1054679506;
        nz.kzds[529] = 2126717038;
        nz.kzds[530] = -1298170723;
        nz.kzds[531] = 1363602258;
        nz.kzds[532] = -641012924;
        nz.kzds[533] = -1910212024;
        nz.kzds[534] = 361391614;
        nz.kzds[535] = 95274512;
        nz.kzds[536] = 1885398623;
        nz.kzds[537] = -43305185;
        nz.kzds[538] = 602304118;
        nz.kzds[539] = -1967216732;
        nz.kzds[540] = 2012239408;
        nz.kzds[541] = -215860009;
        nz.kzds[542] = -1826806813;
        nz.kzds[543] = 860351123;
        nz.kzds[544] = -506137293;
        nz.kzds[545] = -687529837;
        nz.kzds[546] = 1668784183;
        nz.kzds[547] = -1649909915;
        nz.kzds[548] = 2001281984;
        nz.kzds[549] = 2134777296;
        nz.kzds[550] = 309269269;
        nz.kzds[551] = 484534960;
        nz.kzds[552] = -19295664;
        nz.kzds[553] = 947625773;
        nz.kzds[554] = -1770290650;
        nz.kzds[555] = -766474652;
        nz.kzds[556] = 1323299779;
        nz.kzds[557] = 99159914;
        nz.kzds[558] = -1082600612;
        nz.kzds[559] = 661814901;
        nz.kzds[560] = 593617562;
        nz.kzds[561] = 2019287695;
        nz.kzds[562] = -1941216111;
        nz.kzds[563] = 678833265;
        nz.kzds[564] = 1419265201;
    }

    private static /* synthetic */ void lapg() {
        nz.kzds[200] = -1341067845;
        nz.kzds[201] = 163041143;
        nz.kzds[202] = -1434052063;
        nz.kzds[203] = 578852362;
        nz.kzds[204] = -241321264;
        nz.kzds[205] = 706683077;
        nz.kzds[206] = 669860017;
        nz.kzds[207] = -1688769156;
        nz.kzds[208] = 124737720;
        nz.kzds[209] = -1459486487;
        nz.kzds[210] = -1065641598;
        nz.kzds[211] = 89881224;
        nz.kzds[212] = 133519549;
        nz.kzds[213] = -2061113470;
        nz.kzds[214] = 164249368;
        nz.kzds[215] = -326816259;
        nz.kzds[216] = -629571310;
        nz.kzds[217] = 1044036226;
        nz.kzds[218] = -196194920;
        nz.kzds[219] = 1736524700;
        nz.kzds[220] = -770355274;
        nz.kzds[221] = -640644238;
        nz.kzds[222] = 1542182373;
        nz.kzds[223] = 1997779770;
        nz.kzds[224] = -1308476;
        nz.kzds[225] = 233822887;
        nz.kzds[226] = -1258396622;
        nz.kzds[227] = -1005455930;
        nz.kzds[228] = 141275436;
        nz.kzds[229] = -1527640600;
        nz.kzds[230] = -1588929575;
        nz.kzds[231] = -716302711;
        nz.kzds[232] = 898835180;
        nz.kzds[233] = 473056263;
        nz.kzds[234] = 605614202;
        nz.kzds[235] = -1235721906;
        nz.kzds[236] = 484002813;
        nz.kzds[237] = -1348115070;
        nz.kzds[238] = -934203221;
        nz.kzds[239] = -880351468;
        nz.kzds[240] = -934913048;
        nz.kzds[241] = 25122427;
        nz.kzds[242] = -1696388268;
        nz.kzds[243] = -2125098001;
        nz.kzds[244] = 797978379;
        nz.kzds[245] = 1039781857;
        nz.kzds[246] = -1028753785;
        nz.kzds[247] = 235250526;
        nz.kzds[248] = 844425065;
        nz.kzds[249] = 1226462502;
        nz.kzds[250] = -409725626;
        nz.kzds[251] = -1728457798;
        nz.kzds[252] = 1069813995;
        nz.kzds[253] = -1214209308;
        nz.kzds[254] = 539576055;
        nz.kzds[255] = 1464735547;
        nz.kzds[256] = 40478631;
        nz.kzds[257] = 259192932;
        nz.kzds[258] = -146652322;
        nz.kzds[259] = -1616789546;
        nz.kzds[260] = -1080515789;
        nz.kzds[261] = -1665442028;
        nz.kzds[262] = -2104539100;
        nz.kzds[263] = -1688288598;
        nz.kzds[264] = -192284527;
        nz.kzds[265] = 711616909;
        nz.kzds[266] = 1119948350;
        nz.kzds[267] = -2065275754;
        nz.kzds[268] = 181203401;
        nz.kzds[269] = 120665757;
        nz.kzds[270] = 1345126601;
        nz.kzds[271] = 1942074580;
        nz.kzds[272] = 992342100;
        nz.kzds[273] = -1547800306;
        nz.kzds[274] = 2120261347;
        nz.kzds[275] = -2006242133;
        nz.kzds[276] = -1659015954;
        nz.kzds[277] = 115269698;
        nz.kzds[278] = 193032142;
        nz.kzds[279] = 1635383021;
        nz.kzds[280] = -695930953;
        nz.kzds[281] = 1809640516;
        nz.kzds[282] = 87307178;
        nz.kzds[283] = -228543657;
        nz.kzds[284] = -1830938923;
        nz.kzds[285] = 1072091261;
        nz.kzds[286] = 43055081;
        nz.kzds[287] = 642022015;
        nz.kzds[288] = -1334682484;
        nz.kzds[289] = -1763554651;
        nz.kzds[290] = 1133207269;
        nz.kzds[291] = -1191247203;
        nz.kzds[292] = -435966667;
        nz.kzds[293] = 494089334;
        nz.kzds[294] = 872697109;
        nz.kzds[295] = 712346999;
        nz.kzds[296] = -983362171;
        nz.kzds[297] = 1324672605;
        nz.kzds[298] = -1084519737;
        nz.kzds[299] = 658661498;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Deprecated
    public static void forceReleaseLock() {
        v0 /* !! */  = nz.tq;
        if (true) ** GOTO lbl5
        block18: while (true) {
            v0 /* !! */  = (long)(v1 - nz.kzdt("kzvh", kzdx(int ), (int)178));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -2006315034: {
                    v1 = nz.kzdt("kzvi", kzdx(int ), (int)179);
                    continue block18;
                }
                case 1293686697: {
                    break block18;
                }
                case 1987938508: {
                    v1 = nz.kzdt("kzvj", kzdx(int ), (int)180);
                    continue block18;
                }
            }
            break;
        }
        var2 = nz.c;
        v2 /* !! */  = nz.tq;
        if (true) ** GOTO lbl19
        block19: while (true) {
            v2 /* !! */  = (long)(v3 - nz.kzdt("kzvk", kzdx(int ), (int)181));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1507392721: {
                    v3 = nz.kzdt("kzvl", kzdx(int ), (int)182);
                    continue block19;
                }
                case 1293686697: {
                    break block19;
                }
                case 1788184805: {
                    v3 = nz.kzdt("kzvm", kzdx(int ), (int)183);
                    continue block19;
                }
            }
            break;
        }
        var1_1 /* !! */  = nz.b;
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_0 = nz.tq - nz.kzdt("kzvn", kzdx(int ), (int)184)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == nz.kzdt("kzvo", kzdq(int ), (int)274)) break;
            v4 /* !! */  = (long)nz.kzdt("kzvp", kzdq(int ), (int)275);
        }
        var0_2 = nz.a;
        if (var2) {
            throw null;
lbl37:
            // 2 sources

            return;
        }
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var0_2 || var0_2) ** GOTO lbl37
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = nz.tq - nz.kzdt("kzvq", kzdx(int ), (int)185)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == nz.kzdt("kzvr", kzdq(int ), (int)276)) break;
                    v5 /* !! */  = (long)nz.kzdt("kzvs", kzdq(int ), (int)277);
                }
                nz.cancelAll();
                if (var0_2 || var0_2) ** continue;
                return;
            }
lbl51:
            // 3 sources

            case 0: {
                var1_1 /* !! */  = (int)nz.kzdt("kzvt", kzdq(int ), (int)278);
                if (!var2) break;
                throw null;
            }
            case 1: {
                do {
                    var1_1 /* !! */  = (int)nz.kzdt("kzvu", kzdq(int ), (int)279);
                } while (!var2);
                throw null;
            }
lbl60:
            // 2 sources

            case 2: {
                var1_1 /* !! */  = (int)nz.kzdt("kzvv", kzdq(int ), (int)280);
                if (!var2) ** GOTO lbl51
                throw null;
            }
            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)nz.kzdt("kzvw", kzdq(int ), (int)281);
                    if (!var2) ** GOTO lbl51
                    throw null;
                }
            }
            case 4: {
                var1_1 /* !! */  = (int)nz.kzdt("kzvx", kzdq(int ), (int)282);
                if (!var2) ** GOTO lbl60
                throw null;
            }
            case 5: 
        }
        var1_1 /* !! */  = (int)nz.kzdt("kzvy", kzdq(int ), (int)283);
        ** while (!var2)
lbl76:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void laoy() {
        nz.kzdr[0] = -1973091607;
        nz.kzdr[1] = 420269212;
        nz.kzdr[2] = 526824492;
        nz.kzdr[3] = 1913026730;
        nz.kzdr[4] = -1262897502;
        nz.kzdr[5] = -966708534;
        nz.kzdr[6] = 668159172;
        nz.kzdr[7] = -147492591;
        nz.kzdr[8] = 1518846277;
        nz.kzdr[9] = -16190397;
        nz.kzdr[10] = 1994902582;
        nz.kzdr[11] = -1558990524;
        nz.kzdr[12] = -891705255;
        nz.kzdr[13] = -988301581;
        nz.kzdr[14] = 1473172373;
        nz.kzdr[15] = 721165806;
        nz.kzdr[16] = -983484838;
        nz.kzdr[17] = 1678670295;
        nz.kzdr[18] = 1725930612;
        nz.kzdr[19] = 347204263;
        nz.kzdr[20] = -293436245;
        nz.kzdr[21] = -1037852057;
        nz.kzdr[22] = 1549933538;
        nz.kzdr[23] = 465545485;
        nz.kzdr[24] = -1795572569;
        nz.kzdr[25] = -172314906;
        nz.kzdr[26] = 262045911;
        nz.kzdr[27] = 1693299222;
        nz.kzdr[28] = 931258297;
        nz.kzdr[29] = 1693147850;
        nz.kzdr[30] = 1927225967;
        nz.kzdr[31] = -1288756277;
        nz.kzdr[32] = 1710461051;
        nz.kzdr[33] = 1055493779;
        nz.kzdr[34] = -2050878850;
        nz.kzdr[35] = 623010560;
        nz.kzdr[36] = 1648713496;
        nz.kzdr[37] = -1625675813;
        nz.kzdr[38] = 1394344991;
        nz.kzdr[39] = 43224853;
        nz.kzdr[40] = -296649401;
        nz.kzdr[41] = 37058317;
        nz.kzdr[42] = 919461395;
        nz.kzdr[43] = -1678015822;
        nz.kzdr[44] = 1104571357;
        nz.kzdr[45] = -430093051;
        nz.kzdr[46] = -1051299197;
        nz.kzdr[47] = -438942069;
        nz.kzdr[48] = -1879521251;
        nz.kzdr[49] = -1932114143;
        nz.kzdr[50] = -1210124332;
        nz.kzdr[51] = 969630481;
        nz.kzdr[52] = -609211319;
        nz.kzdr[53] = -1936193308;
        nz.kzdr[54] = -888032709;
        nz.kzdr[55] = 546100672;
        nz.kzdr[56] = 1806266712;
        nz.kzdr[57] = 1714726130;
        nz.kzdr[58] = 1854914672;
        nz.kzdr[59] = -226607226;
        nz.kzdr[60] = 2119027637;
        nz.kzdr[61] = 527472854;
        nz.kzdr[62] = -1086632357;
        nz.kzdr[63] = 76697784;
        nz.kzdr[64] = 119510293;
        nz.kzdr[65] = 736898278;
        nz.kzdr[66] = -1175886101;
        nz.kzdr[67] = 1072783669;
        nz.kzdr[68] = 858054714;
        nz.kzdr[69] = -2135940472;
        nz.kzdr[70] = -415755673;
        nz.kzdr[71] = -1236533460;
        nz.kzdr[72] = -250196399;
        nz.kzdr[73] = 665727507;
        nz.kzdr[74] = -1731810754;
        nz.kzdr[75] = -1290827243;
        nz.kzdr[76] = -1129041149;
        nz.kzdr[77] = 868704273;
        nz.kzdr[78] = 429597373;
        nz.kzdr[79] = 741749348;
        nz.kzdr[80] = -1066991254;
        nz.kzdr[81] = -419706760;
        nz.kzdr[82] = 1736859750;
        nz.kzdr[83] = -1694967202;
        nz.kzdr[84] = -628482624;
        nz.kzdr[85] = 399689843;
        nz.kzdr[86] = -245749626;
        nz.kzdr[87] = 709241720;
        nz.kzdr[88] = 1452292541;
        nz.kzdr[89] = -1728217247;
        nz.kzdr[90] = -65408043;
        nz.kzdr[91] = -1356182487;
        nz.kzdr[92] = -1670809796;
        nz.kzdr[93] = 1262548635;
        nz.kzdr[94] = 1044211059;
        nz.kzdr[95] = -2096699386;
        nz.kzdr[96] = -1086292570;
        nz.kzdr[97] = 890588220;
        nz.kzdr[98] = -158754512;
        nz.kzdr[99] = -896751924;
    }

    private static /* synthetic */ void lapi() {
        nz.kzds[400] = -1631887382;
        nz.kzds[401] = -1236591230;
        nz.kzds[402] = 1261501787;
        nz.kzds[403] = 1514100594;
        nz.kzds[404] = 414714925;
        nz.kzds[405] = 698951056;
        nz.kzds[406] = 29012382;
        nz.kzds[407] = 1144632453;
        nz.kzds[408] = -573418112;
        nz.kzds[409] = 1136976886;
        nz.kzds[410] = -910955995;
        nz.kzds[411] = 868308905;
        nz.kzds[412] = 1773451851;
        nz.kzds[413] = -1890131104;
        nz.kzds[414] = -319156787;
        nz.kzds[415] = -1732548969;
        nz.kzds[416] = 1392459488;
        nz.kzds[417] = -1541263565;
        nz.kzds[418] = -816557189;
        nz.kzds[419] = 1659908713;
        nz.kzds[420] = 1057221132;
        nz.kzds[421] = 983813463;
        nz.kzds[422] = 1496954855;
        nz.kzds[423] = 653778438;
        nz.kzds[424] = 1086184533;
        nz.kzds[425] = 1674719726;
        nz.kzds[426] = -2108480610;
        nz.kzds[427] = 1722449884;
        nz.kzds[428] = -1047275705;
        nz.kzds[429] = 747836744;
        nz.kzds[430] = -1874505572;
        nz.kzds[431] = -1016892369;
        nz.kzds[432] = 1104188766;
        nz.kzds[433] = -333563123;
        nz.kzds[434] = -1978379938;
        nz.kzds[435] = 1949246847;
        nz.kzds[436] = 1773949228;
        nz.kzds[437] = -1562651933;
        nz.kzds[438] = -902182298;
        nz.kzds[439] = -1717360960;
        nz.kzds[440] = -375907474;
        nz.kzds[441] = -270779072;
        nz.kzds[442] = 800412070;
        nz.kzds[443] = 1259042655;
        nz.kzds[444] = -1094919580;
        nz.kzds[445] = 860379191;
        nz.kzds[446] = 87748469;
        nz.kzds[447] = -1238257374;
        nz.kzds[448] = -1386881834;
        nz.kzds[449] = -63493729;
        nz.kzds[450] = -404450316;
        nz.kzds[451] = 765334833;
        nz.kzds[452] = -2047483891;
        nz.kzds[453] = 1800850989;
        nz.kzds[454] = -621077089;
        nz.kzds[455] = -1346688509;
        nz.kzds[456] = 1606538672;
        nz.kzds[457] = -1724361710;
        nz.kzds[458] = -931068437;
        nz.kzds[459] = 1241689542;
        nz.kzds[460] = 911510215;
        nz.kzds[461] = -2070298852;
        nz.kzds[462] = -718460451;
        nz.kzds[463] = 454213485;
        nz.kzds[464] = -1888799167;
        nz.kzds[465] = -418887065;
        nz.kzds[466] = -370147081;
        nz.kzds[467] = -446310079;
        nz.kzds[468] = -1239495052;
        nz.kzds[469] = 814745966;
        nz.kzds[470] = 1951401610;
        nz.kzds[471] = -325166619;
        nz.kzds[472] = 1667506711;
        nz.kzds[473] = 377177060;
        nz.kzds[474] = 643108360;
        nz.kzds[475] = -1392443905;
        nz.kzds[476] = -103625725;
        nz.kzds[477] = 1391165107;
        nz.kzds[478] = 2095519071;
        nz.kzds[479] = -1254070886;
        nz.kzds[480] = -454966889;
        nz.kzds[481] = -88444758;
        nz.kzds[482] = -576296239;
        nz.kzds[483] = -1447847803;
        nz.kzds[484] = 230797985;
        nz.kzds[485] = -2081230518;
        nz.kzds[486] = 2061950323;
        nz.kzds[487] = -1894593224;
        nz.kzds[488] = 916369138;
        nz.kzds[489] = -424006189;
        nz.kzds[490] = 1269791519;
        nz.kzds[491] = 279855045;
        nz.kzds[492] = 1425861177;
        nz.kzds[493] = -402896618;
        nz.kzds[494] = -984255373;
        nz.kzds[495] = 1090337421;
        nz.kzds[496] = -74934413;
        nz.kzds[497] = -1464538596;
        nz.kzds[498] = -52818925;
        nz.kzds[499] = -1304675187;
    }

    private static /* synthetic */ void lapo() {
        nz.kzdz[0] = -3984528323210216333L;
        nz.kzdz[1] = -5323140999738814013L;
        nz.kzdz[2] = 8383982545969524714L;
        nz.kzdz[3] = 4563813710736728045L;
        nz.kzdz[4] = 55598396325211180L;
        nz.kzdz[5] = 1869446887823483091L;
        nz.kzdz[6] = 5674560776323968371L;
        nz.kzdz[7] = 8361320043997428815L;
        nz.kzdz[8] = 388656570925644856L;
        nz.kzdz[9] = 8296701940426466759L;
        nz.kzdz[10] = 265947900402137539L;
        nz.kzdz[11] = -3167593286536515826L;
        nz.kzdz[12] = 8160519671760673041L;
        nz.kzdz[13] = -6892265227762840638L;
        nz.kzdz[14] = 1417925234975361044L;
        nz.kzdz[15] = -2349783498545926319L;
        nz.kzdz[16] = 6690407290022498613L;
        nz.kzdz[17] = 1034371143604201352L;
        nz.kzdz[18] = -9066387425040434838L;
        nz.kzdz[19] = -1421527694109509184L;
        nz.kzdz[20] = 7674024419371527963L;
        nz.kzdz[21] = -6398413314848361641L;
        nz.kzdz[22] = 8770204628063399818L;
        nz.kzdz[23] = -8007130128416268487L;
        nz.kzdz[24] = 2163167966231229664L;
        nz.kzdz[25] = -5299296283313890271L;
        nz.kzdz[26] = -3442667259495619887L;
        nz.kzdz[27] = 1586872575384904380L;
        nz.kzdz[28] = 1355518010617328919L;
        nz.kzdz[29] = -266216429995678326L;
        nz.kzdz[30] = -1246889152280266601L;
        nz.kzdz[31] = -3045285311690468507L;
        nz.kzdz[32] = -7491810581545625166L;
        nz.kzdz[33] = -1928000216282880855L;
        nz.kzdz[34] = -8993640295351343579L;
        nz.kzdz[35] = -5952572939477564422L;
        nz.kzdz[36] = -4891067241931078990L;
        nz.kzdz[37] = 9118251342175725713L;
        nz.kzdz[38] = 7511517387793450110L;
        nz.kzdz[39] = 6109157427063807532L;
        nz.kzdz[40] = 4381236295446180366L;
        nz.kzdz[41] = 814133916735660982L;
        nz.kzdz[42] = -8045488641074026864L;
        nz.kzdz[43] = -5899586071488199592L;
        nz.kzdz[44] = -3357137759934975878L;
        nz.kzdz[45] = 4854020979298349007L;
        nz.kzdz[46] = -2724203801437689549L;
        nz.kzdz[47] = -4293075192831452477L;
        nz.kzdz[48] = -8471289257780197181L;
        nz.kzdz[49] = 2104495863551891072L;
        nz.kzdz[50] = 3960077017308161705L;
        nz.kzdz[51] = 8880577664280293356L;
        nz.kzdz[52] = 2452960562227229675L;
        nz.kzdz[53] = 2518086511493958069L;
        nz.kzdz[54] = 5972262756632232557L;
        nz.kzdz[55] = 8916504431216338377L;
        nz.kzdz[56] = 3713283755085852038L;
        nz.kzdz[57] = 3127708528120369675L;
        nz.kzdz[58] = 5773556248769814878L;
        nz.kzdz[59] = 2748461797804924089L;
        nz.kzdz[60] = 383364606626887056L;
        nz.kzdz[61] = -8956321875976616406L;
        nz.kzdz[62] = -7560820401595147854L;
        nz.kzdz[63] = -4938152643786891843L;
        nz.kzdz[64] = -5871222099028222260L;
        nz.kzdz[65] = 2904814388091519814L;
        nz.kzdz[66] = 2029982963595941527L;
        nz.kzdz[67] = -5135353999055055394L;
        nz.kzdz[68] = -2395403549582318311L;
        nz.kzdz[69] = 3285794439223525096L;
        nz.kzdz[70] = 5242698715971613378L;
        nz.kzdz[71] = -2031360748325341874L;
        nz.kzdz[72] = 1917152261243874366L;
        nz.kzdz[73] = 8721752413388689592L;
        nz.kzdz[74] = -3729517695744102405L;
        nz.kzdz[75] = -6016561093331694871L;
        nz.kzdz[76] = 9158862303714118717L;
        nz.kzdz[77] = -8865141185532581883L;
        nz.kzdz[78] = -5163555554363584275L;
        nz.kzdz[79] = 2626954567267180798L;
        nz.kzdz[80] = 3176012292075316658L;
        nz.kzdz[81] = 8057703619484812392L;
        nz.kzdz[82] = 194772749569427658L;
        nz.kzdz[83] = 4001816740872685049L;
        nz.kzdz[84] = -3671668647845014517L;
        nz.kzdz[85] = 5623599451218952137L;
        nz.kzdz[86] = 947785877989364990L;
        nz.kzdz[87] = -1324823207580086104L;
        nz.kzdz[88] = -653927415184097816L;
        nz.kzdz[89] = 4571516113989400943L;
        nz.kzdz[90] = -1347642436897299649L;
        nz.kzdz[91] = 7959706747888684263L;
        nz.kzdz[92] = -7383701538743778636L;
        nz.kzdz[93] = -2958492606295252051L;
        nz.kzdz[94] = 6752586089632094211L;
        nz.kzdz[95] = 2172117142730278062L;
        nz.kzdz[96] = 1150804251705056422L;
        nz.kzdz[97] = -3859181425075325051L;
        nz.kzdz[98] = 5704902400992479304L;
        nz.kzdz[99] = -1811248103397507493L;
    }

    private static /* synthetic */ void lapm() {
        nz.kzdy[200] = 3995924952639195008L;
        nz.kzdy[201] = 1592688195294277784L;
        nz.kzdy[202] = -2780719247816352397L;
        nz.kzdy[203] = 4951903102615624072L;
        nz.kzdy[204] = -5240688282244003056L;
        nz.kzdy[205] = 7697028363786655202L;
        nz.kzdy[206] = -3161774721933280836L;
        nz.kzdy[207] = 1276016108001216713L;
        nz.kzdy[208] = -4160203383801081971L;
        nz.kzdy[209] = -2998066278627096205L;
        nz.kzdy[210] = 6225257144062999829L;
        nz.kzdy[211] = 9135243454572059574L;
        nz.kzdy[212] = -5785091449166169951L;
        nz.kzdy[213] = -557972472600467475L;
        nz.kzdy[214] = -767933001552119505L;
        nz.kzdy[215] = -8973283861813677900L;
        nz.kzdy[216] = 9019809809640538194L;
        nz.kzdy[217] = -2961670999939257518L;
        nz.kzdy[218] = -9010565905255346159L;
        nz.kzdy[219] = -6323757902065301716L;
        nz.kzdy[220] = -550734067599470150L;
        nz.kzdy[221] = 794157473843403172L;
        nz.kzdy[222] = 284298562028804689L;
        nz.kzdy[223] = -5939994776829204378L;
        nz.kzdy[224] = -7335676366817835605L;
        nz.kzdy[225] = 5412330626807521180L;
        nz.kzdy[226] = 1429476971256596987L;
        nz.kzdy[227] = -1412094475793946399L;
        nz.kzdy[228] = 1859262180112215004L;
        nz.kzdy[229] = -937779738446223038L;
        nz.kzdy[230] = 3180187301299064458L;
        nz.kzdy[231] = 8073306839078234798L;
        nz.kzdy[232] = 7626468190801009830L;
        nz.kzdy[233] = 2635476555600768233L;
        nz.kzdy[234] = 6261209512039812794L;
        nz.kzdy[235] = 4331974251758541573L;
        nz.kzdy[236] = 3408400455109049541L;
        nz.kzdy[237] = 4805464428771841848L;
        nz.kzdy[238] = -7179225334503152565L;
        nz.kzdy[239] = -7218465155360787026L;
        nz.kzdy[240] = 117444490118230855L;
        nz.kzdy[241] = -383156754013679222L;
        nz.kzdy[242] = 868085840455124598L;
        nz.kzdy[243] = -611712205646026223L;
        nz.kzdy[244] = 7994791679078842661L;
        nz.kzdy[245] = 2236278537995999097L;
        nz.kzdy[246] = 9032181667936095612L;
        nz.kzdy[247] = 8010060222579991331L;
        nz.kzdy[248] = 4933835472691887528L;
        nz.kzdy[249] = -5150912028491170123L;
        nz.kzdy[250] = -446759777228194361L;
        nz.kzdy[251] = 7022590476888091269L;
        nz.kzdy[252] = 5327495914509264002L;
        nz.kzdy[253] = 1635080933426536415L;
        nz.kzdy[254] = -8601416081087541567L;
        nz.kzdy[255] = 2824182970503633705L;
        nz.kzdy[256] = -1341524398056693315L;
        nz.kzdy[257] = 2787001336095384815L;
        nz.kzdy[258] = 4199655489184782150L;
        nz.kzdy[259] = 8779080024641545378L;
        nz.kzdy[260] = 8028420528345209138L;
        nz.kzdy[261] = 5481535133243058506L;
        nz.kzdy[262] = -4569352241488385130L;
        nz.kzdy[263] = 7315362600303904363L;
        nz.kzdy[264] = -6963418905911458462L;
        nz.kzdy[265] = -1435942740423239166L;
        nz.kzdy[266] = -90956913818818530L;
        nz.kzdy[267] = 5018080670090861919L;
        nz.kzdy[268] = 5821873980633194283L;
        nz.kzdy[269] = -2547378957571635596L;
        nz.kzdy[270] = -7044458296563684208L;
        nz.kzdy[271] = 6013733390556293392L;
        nz.kzdy[272] = 2605957170259988424L;
        nz.kzdy[273] = -2416869225945283175L;
        nz.kzdy[274] = -5225650536688421979L;
        nz.kzdy[275] = -152517777478095381L;
        nz.kzdy[276] = 3135179584618484932L;
        nz.kzdy[277] = -8000554699244049667L;
        nz.kzdy[278] = 7337357180586972589L;
        nz.kzdy[279] = 6876712258613375002L;
        nz.kzdy[280] = -3135245867026859439L;
        nz.kzdy[281] = 8122056797290776189L;
        nz.kzdy[282] = -8058680971571961957L;
        nz.kzdy[283] = -8740939672844152026L;
        nz.kzdy[284] = 4289059905865843494L;
        nz.kzdy[285] = -6221281533122799094L;
        nz.kzdy[286] = 6273430284019124954L;
        nz.kzdy[287] = 3443303051040935964L;
        nz.kzdy[288] = -6127768515874859006L;
        nz.kzdy[289] = 1502578860715227750L;
        nz.kzdy[290] = 3118416727271132953L;
        nz.kzdy[291] = 2539981596360267340L;
        nz.kzdy[292] = 7204797544693177456L;
        nz.kzdy[293] = 4586203059189803917L;
        nz.kzdy[294] = 3232434711712122460L;
        nz.kzdy[295] = -828441498467433680L;
        nz.kzdy[296] = -112597184337790463L;
        nz.kzdy[297] = 2535935030975524094L;
        nz.kzdy[298] = 724666595736386645L;
        nz.kzdy[299] = -2082624507068510750L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void tick() {
        var4 = nz.c;
        var3_1 /* !! */  = nz.b;
        var2_2 = nz.a;
        if (var4) {
            throw null;
lbl6:
            // 32 sources

            return;
        }
        if (var2_2 || var2_2) ** GOTO lbl6
        if (var3_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (nz.mc.field_1724 != null) ** GOTO lbl17
                if (var2_2 || var2_2) ** GOTO lbl6
                nz.cancelAll();
                if (var2_2 || var2_2) ** GOTO lbl6
                return;
lbl17:
                // 1 sources

                if (var2_2 || var2_2) ** GOTO lbl6
                if (nz.currentSwap == null) ** GOTO lbl31
                if (var2_2 || var2_2) ** GOTO lbl6
                var0_3 = System.currentTimeMillis() - nz.currentSwapStartTime;
                if (var2_2 || var2_2) ** GOTO lbl6
                if (var0_3 <= nz.kzdt("kznd", kzdx(int ), (int)110)) ** GOTO lbl31
                if (var2_2 || var2_2) ** GOTO lbl6
                nz.currentSwap.cancel();
                if (var2_2 || var2_2) ** GOTO lbl6
                nz.swapRegistry.remove(nz.currentSwap.getId());
                if (var2_2 || var2_2) ** GOTO lbl6
                nz.currentSwap = null;
                if (var2_2) ** GOTO lbl6
lbl31:
                // 3 sources

                if (var2_2 || var2_2) ** GOTO lbl6
                if (nz.currentSwap == null) ** GOTO lbl43
                if (var2_2 || var2_2) ** GOTO lbl6
                nz.currentSwap.tick();
                if (var2_2 || var2_2) ** GOTO lbl6
                if (!nz.currentSwap.isFinished()) ** GOTO lbl43
                if (var2_2 || var2_2) ** GOTO lbl6
                nz.swapRegistry.remove(nz.currentSwap.getId());
                if (var2_2 || var2_2) ** GOTO lbl6
                nz.currentSwap = null;
                if (var2_2) ** GOTO lbl6
lbl43:
                // 3 sources

                if (var2_2 || var2_2) ** GOTO lbl6
                if (nz.currentSwap != null) ** GOTO lbl76
                if (var2_2) ** GOTO lbl6
                if (nz.swapQueue.isEmpty()) ** GOTO lbl76
                if (var2_2) ** GOTO lbl6
                do {
                    if (var2_2 || var2_2) ** GOTO lbl6
                    if (nz.swapQueue.isEmpty()) ** GOTO lbl76
                    if (var2_2 || var2_2) ** GOTO lbl6
                    var0_4 = nz.swapQueue.poll();
                    if (var2_2 || var2_2) ** GOTO lbl6
                    if (var0_4 == null) ** GOTO lbl67
                    if (var2_2) ** GOTO lbl6
                    if (var0_4.isCancelled()) ** GOTO lbl67
                    if (var2_2 || var2_2) ** GOTO lbl6
                    nz.currentSwap = var0_4;
                    if (var2_2 || var2_2) ** GOTO lbl6
                    nz.currentSwapStartTime = System.currentTimeMillis();
                    if (var2_2 || var2_2) ** GOTO lbl6
                    nz.currentSwap.start();
                    if (var2_2 || var2_2) ** GOTO lbl6
                    if (var4) {
                        throw null;
                    }
                    ** GOTO lbl76
lbl67:
                    // 2 sources

                    if (var2_2 || var2_2) ** GOTO lbl6
                    if (var0_4 == null) ** GOTO lbl73
                    if (var2_2 || var2_2) ** GOTO lbl6
                    nz.swapRegistry.remove(var0_4.getId());
                    if (var2_2) ** GOTO lbl6
lbl73:
                    // 2 sources

                    if (var2_2 || var2_2) ** GOTO lbl6
                } while (!var4);
                throw null;
lbl76:
                // 4 sources

                if (!var2_2 && !var2_2) ** break;
                ** continue;
                return;
            }
lbl79:
            // 2 sources

            case 0: {
                var3_1 /* !! */  = (int)nz.kzdt("kzne", kzdq(int ), (int)130);
                if (var4) {
                    throw null;
                }
                ** GOTO lbl245
            }
lbl84:
            // 3 sources

            case 1: {
                var3_1 /* !! */  = (int)nz.kzdt("kznf", kzdq(int ), (int)131);
                if (var4) {
                    throw null;
                }
                ** GOTO lbl169
            }
lbl89:
            // 3 sources

            case 2: {
                do {
                    var3_1 /* !! */  = (int)nz.kzdt("kzng", kzdq(int ), (int)132);
                } while (!var4);
                throw null;
            }
            case 3: {
                var3_1 /* !! */  = (int)nz.kzdt("kznh", kzdq(int ), (int)133);
                if (var4) {
                    throw null;
                }
                ** GOTO lbl192
            }
lbl99:
            // 2 sources

            case 4: {
                var3_1 /* !! */  = (int)nz.kzdt("kzni", kzdq(int ), (int)134);
                if (var4) {
                    throw null;
                }
                ** GOTO lbl289
            }
            case 5: {
                var3_1 /* !! */  = (int)nz.kzdt("kznj", kzdq(int ), (int)135);
                if (var4) {
                    throw null;
                }
                ** GOTO lbl352
            }
lbl109:
            // 3 sources

            case 6: {
                var3_1 /* !! */  = (int)nz.kzdt("kznk", kzdq(int ), (int)136);
                if (var4) {
                    throw null;
                }
                ** GOTO lbl301
            }
lbl114:
            // 2 sources

            case 7: {
                var3_1 /* !! */  = (int)nz.kzdt("kznl", kzdq(int ), (int)137);
                if (var4) {
                    throw null;
                }
                ** GOTO lbl129
            }
lbl119:
            // 3 sources

            case 8: {
                var3_1 /* !! */  = (int)nz.kzdt("kznm", kzdq(int ), (int)138);
                if (var4) {
                    throw null;
                }
                ** GOTO lbl149
            }
            case 9: {
                var3_1 /* !! */  = (int)nz.kzdt("kznn", kzdq(int ), (int)139);
                if (var4) {
                    throw null;
                }
                ** GOTO lbl183
            }
lbl129:
            // 2 sources

            case 10: {
                var3_1 /* !! */  = (int)nz.kzdt("kzno", kzdq(int ), (int)140);
                if (var4) {
                    throw null;
                }
                ** GOTO lbl254
            }
lbl134:
            // 2 sources

            case 11: {
                var3_1 /* !! */  = (int)nz.kzdt("kznp", kzdq(int ), (int)141);
                if (var4) {
                    throw null;
                }
                ** GOTO lbl331
            }
            case 12: {
                var3_1 /* !! */  = (int)nz.kzdt("kznq", kzdq(int ), (int)142);
                if (var4) {
                    throw null;
                }
                ** GOTO lbl214
            }
            case 13: {
                var3_1 /* !! */  = (int)nz.kzdt("kznr", kzdq(int ), (int)143);
                if (var4) {
                    throw null;
                }
                ** GOTO lbl183
            }
lbl149:
            // 2 sources

            case 14: {
                var3_1 /* !! */  = (int)nz.kzdt("kzns", kzdq(int ), (int)144);
                if (var4) {
                    throw null;
                }
                ** GOTO lbl204
            }
            case 15: {
                var3_1 /* !! */  = (int)nz.kzdt("kznt", kzdq(int ), (int)145);
                if (var4) {
                    throw null;
                }
                ** GOTO lbl192
            }
lbl159:
            // 2 sources

            case 16: {
                var3_1 /* !! */  = (int)nz.kzdt("kznu", kzdq(int ), (int)146);
                if (var4) {
                    throw null;
                }
                ** GOTO lbl305
            }
lbl164:
            // 2 sources

            case 17: {
                var3_1 /* !! */  = (int)nz.kzdt("kznv", kzdq(int ), (int)147);
                if (var4) {
                    throw null;
                }
                ** GOTO lbl276
            }
lbl169:
            // 2 sources

            case 18: {
                var3_1 /* !! */  = (int)nz.kzdt("kznw", kzdq(int ), (int)148);
                if (!var4) ** GOTO lbl79
                throw null;
            }
            case 19: {
                var3_1 /* !! */  = (int)nz.kzdt("kznx", kzdq(int ), (int)149);
                if (var4) {
                    throw null;
                }
                ** GOTO lbl305
            }
            case 20: {
                var3_1 /* !! */  = (int)nz.kzdt("kzny", kzdq(int ), (int)150);
                if (var4) {
                    throw null;
                }
                ** GOTO lbl340
            }
lbl183:
            // 4 sources

            case 21: {
                var3_1 /* !! */  = (int)nz.kzdt("kznz", kzdq(int ), (int)151);
                if (!var4) break;
                throw null;
            }
            case 22: {
                var3_1 /* !! */  = (int)nz.kzdt("kzoa", kzdq(int ), (int)152);
                if (var4) {
                    throw null;
                }
                ** GOTO lbl258
            }
lbl192:
            // 3 sources

            case 23: {
                var3_1 /* !! */  = (int)nz.kzdt("kzob", kzdq(int ), (int)153);
                if (!var4) ** GOTO lbl109
                throw null;
            }
lbl196:
            // 3 sources

            case 24: {
                var3_1 /* !! */  = (int)nz.kzdt("kzoc", kzdq(int ), (int)154);
                if (!var4) ** GOTO lbl89
                throw null;
            }
            case 25: {
                var3_1 /* !! */  = (int)nz.kzdt("kzod", kzdq(int ), (int)155);
                if (!var4) ** GOTO lbl134
                throw null;
            }
lbl204:
            // 2 sources

            case 26: {
                var3_1 /* !! */  = (int)nz.kzdt("kzoe", kzdq(int ), (int)156);
                if (var4) {
                    throw null;
                }
                ** GOTO lbl240
            }
            case 27: {
                var3_1 /* !! */  = (int)nz.kzdt("kzof", kzdq(int ), (int)157);
                if (var4) {
                    throw null;
                }
                ** GOTO lbl322
            }
lbl214:
            // 3 sources

            case 28: {
                var3_1 /* !! */  = (int)nz.kzdt("kzog", kzdq(int ), (int)158);
                if (!var4) ** GOTO lbl99
                throw null;
            }
            case 29: {
                var3_1 /* !! */  = (int)nz.kzdt("kzoh", kzdq(int ), (int)159);
                if (!var4) ** GOTO lbl196
                throw null;
            }
            case 30: {
                var3_1 /* !! */  = (int)nz.kzdt("kzoi", kzdq(int ), (int)160);
                if (var4) {
                    throw null;
                }
                ** GOTO lbl268
            }
            case 31: {
                var3_1 /* !! */  = (int)nz.kzdt("kzoj", kzdq(int ), (int)161);
                if (!var4) ** GOTO lbl84
                throw null;
            }
            case 32: {
                var3_1 /* !! */  = (int)nz.kzdt("kzok", kzdq(int ), (int)162);
                if (!var4) break;
                throw null;
            }
lbl235:
            // 2 sources

            case 33: {
                var3_1 /* !! */  = (int)nz.kzdt("kzol", kzdq(int ), (int)163);
                if (var4) {
                    throw null;
                }
                ** GOTO lbl322
            }
lbl240:
            // 3 sources

            case 34: {
                var3_1 /* !! */  = (int)nz.kzdt("kzom", kzdq(int ), (int)164);
                if (var4) {
                    throw null;
                }
                ** GOTO lbl326
            }
lbl245:
            // 2 sources

            case 35: {
                var3_1 /* !! */  = (int)nz.kzdt("kzon", kzdq(int ), (int)165);
                if (!var4) ** GOTO lbl196
                throw null;
            }
            case 36: {
                var3_1 /* !! */  = (int)nz.kzdt("kzoo", kzdq(int ), (int)166);
                if (var4) {
                    throw null;
                }
                ** GOTO lbl326
            }
lbl254:
            // 3 sources

            case 37: {
                var3_1 /* !! */  = (int)nz.kzdt("kzop", kzdq(int ), (int)167);
                if (!var4) ** GOTO lbl114
                throw null;
            }
lbl258:
            // 2 sources

            case 38: {
                var3_1 /* !! */  = (int)nz.kzdt("kzoq", kzdq(int ), (int)168);
                if (var4) {
                    throw null;
                }
                ** GOTO lbl310
            }
lbl263:
            // 2 sources

            case 39: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_1 /* !! */  = (int)nz.kzdt("kzor", kzdq(int ), (int)169);
                    if (!var4) ** GOTO lbl119
                    throw null;
                }
            }
lbl268:
            // 3 sources

            case 40: {
                var3_1 /* !! */  = (int)nz.kzdt("kzos", kzdq(int ), (int)170);
                if (!var4) ** GOTO lbl214
                throw null;
            }
            case 41: {
                var3_1 /* !! */  = (int)nz.kzdt("kzot", kzdq(int ), (int)171);
                if (!var4) ** GOTO lbl89
                throw null;
            }
lbl276:
            // 2 sources

            case 42: {
                var3_1 /* !! */  = (int)nz.kzdt("kzou", kzdq(int ), (int)172);
                if (var4) {
                    throw null;
                }
                ** GOTO lbl305
            }
            case 43: {
                var3_1 /* !! */  = (int)nz.kzdt("kzov", kzdq(int ), (int)173);
                if (!var4) ** GOTO lbl268
                throw null;
            }
            case 44: {
                var3_1 /* !! */  = (int)nz.kzdt("kzow", kzdq(int ), (int)174);
                if (!var4) ** GOTO lbl164
                throw null;
            }
lbl289:
            // 2 sources

            case 45: {
                var3_1 /* !! */  = (int)nz.kzdt("kzox", kzdq(int ), (int)175);
                if (!var4) ** GOTO lbl183
                throw null;
            }
            case 46: {
                var3_1 /* !! */  = (int)nz.kzdt("kzoy", kzdq(int ), (int)176);
                if (!var4) ** GOTO lbl235
                throw null;
            }
            case 47: {
                var3_1 /* !! */  = (int)nz.kzdt("kzoz", kzdq(int ), (int)177);
                if (!var4) ** GOTO lbl263
                throw null;
            }
lbl301:
            // 3 sources

            case 48: {
                var3_1 /* !! */  = (int)nz.kzdt("kzpa", kzdq(int ), (int)178);
                if (var4) {
                    throw null;
                }
            }
lbl305:
            // 6 sources

            case 49: {
                var3_1 /* !! */  = (int)nz.kzdt("kzpb", kzdq(int ), (int)179);
                if (var4) {
                    throw null;
                }
                ** GOTO lbl314
            }
lbl310:
            // 2 sources

            case 50: {
                var3_1 /* !! */  = (int)nz.kzdt("kzpc", kzdq(int ), (int)180);
                if (!var4) ** GOTO lbl119
                throw null;
            }
lbl314:
            // 2 sources

            case 51: {
                var3_1 /* !! */  = (int)nz.kzdt("kzpd", kzdq(int ), (int)181);
                if (!var4) ** GOTO lbl159
                throw null;
            }
            case 52: {
                var3_1 /* !! */  = (int)nz.kzdt("kzpe", kzdq(int ), (int)182);
                if (!var4) ** GOTO lbl84
                throw null;
            }
lbl322:
            // 3 sources

            case 53: {
                var3_1 /* !! */  = (int)nz.kzdt("kzpf", kzdq(int ), (int)183);
                if (!var4) ** GOTO lbl109
                throw null;
            }
lbl326:
            // 3 sources

            case 54: {
                var3_1 /* !! */  = (int)nz.kzdt("kzpg", kzdq(int ), (int)184);
                if (var4) {
                    throw null;
                }
                ** GOTO lbl336
            }
lbl331:
            // 2 sources

            case 55: {
                var3_1 /* !! */  = (int)nz.kzdt("kzph", kzdq(int ), (int)185);
                if (var4) {
                    throw null;
                }
                ** GOTO lbl344
            }
lbl336:
            // 2 sources

            case 56: {
                var3_1 /* !! */  = (int)nz.kzdt("kzpi", kzdq(int ), (int)186);
                if (var4) {
                    throw null;
                }
            }
lbl340:
            // 4 sources

            case 57: {
                var3_1 /* !! */  = (int)nz.kzdt("kzpj", kzdq(int ), (int)187);
                if (var4) {
                    throw null;
                }
            }
lbl344:
            // 4 sources

            case 58: {
                var3_1 /* !! */  = (int)nz.kzdt("kzpk", kzdq(int ), (int)188);
                if (!var4) ** GOTO lbl301
                throw null;
            }
            case 59: {
                var3_1 /* !! */  = (int)nz.kzdt("kzpl", kzdq(int ), (int)189);
                if (!var4) ** GOTO lbl240
                throw null;
            }
lbl352:
            // 2 sources

            case 60: {
                var3_1 /* !! */  = (int)nz.kzdt("kzpm", kzdq(int ), (int)190);
                if (!var4) ** GOTO lbl254
                throw null;
            }
            case 61: 
        }
        var3_1 /* !! */  = (int)nz.kzdt("kzpn", kzdq(int ), (int)191);
        ** while (!var4)
lbl359:
        // 1 sources

        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static boolean queueSwap(String var0, int var1_1, Runnable var2_2, oc var3_3, Runnable var4_4) {
        block73: {
            block75: {
                while (true) {
                    if ((v0 /* !! */  = (cfr_temp_1 = nz.tq - nz.kzdt("kzea", kzdx(int ), (int)0)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v0 /* !! */  == nz.kzdt("kzeb", kzdq(int ), (int)3)) break;
                    v0 /* !! */  = (long)nz.kzdt("kzec", kzdq(int ), (int)4);
                }
                var8_5 = nz.c;
                v1 /* !! */  = nz.tq;
                block41: while (true) {
                    switch ((int)v1 /* !! */ ) {
                        case 1034858724: {
                            v1 /* !! */  = (long)(nz.kzdt("kzee", kzdx(int ), (int)2) - nz.kzdt("kzed", kzdx(int ), (int)1));
                            continue block41;
                        }
                        case 1293686697: {
                            break block41;
                        }
                    }
                    break;
                }
                var7_6 /* !! */  = nz.b;
                while (true) {
                    if ((v2 /* !! */  = (cfr_temp_2 = nz.tq - nz.kzdt("kzef", kzdx(int ), (int)3)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v2 /* !! */  == nz.kzdt("kzeg", kzdq(int ), (int)5)) {
                        var6_7 = nz.a;
                        if (var8_5) {
                            throw null;
                        }
                        break;
                    }
                    v2 /* !! */  = (long)nz.kzdt("kzeh", kzdq(int ), (int)6);
                }
                if (var6_7 || var6_7) return (boolean)nz.kzdt("kzei", kzdq(int ), (int)7);
                v3 /* !! */  = nz.tq;
                block43: while (true) {
                    switch ((int)v3 /* !! */ ) {
                        case 1293686697: {
                            break block43;
                        }
                        case 1712654174: {
                            v3 /* !! */  = (long)(nz.kzdt("kzek", kzdx(int ), (int)5) - nz.kzdt("kzej", kzdx(int ), (int)4));
                            continue block43;
                        }
                    }
                    break;
                }
                while (true) {
                    block74: {
                        if ((v4 /* !! */  = (cfr_temp_3 = nz.tq - nz.kzdt("kzel", kzdx(int ), (int)6)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                        if (v4 /* !! */  != nz.kzdt("kzem", kzdq(int ), (int)8)) break block74;
                        if (nz.swapRegistry.containsKey(var0)) {
                            break;
                        }
                        ** GOTO lbl51
                    }
                    v4 /* !! */  = (long)nz.kzdt("kzen", kzdq(int ), (int)9);
                }
                if (var6_7) return (boolean)nz.kzdt("kzei", kzdq(int ), (int)7);
                if (var7_6 /* !! */  == 0) ** GOTO lbl-1000
                cfr_temp_0 = -2147483648;
lbl46:
                // 2 sources

                block45: while (true) {
                    switch (cfr_temp_0 == -2147483648 ? var7_6 /* !! */  : cfr_temp_0) {
                        default: lbl-1000:
                        // 2 sources

                        {
                            if (var6_7) return (boolean)nz.kzdt("kzei", kzdq(int ), (int)7);
                            return (boolean)nz.kzdt("kzeo", kzdq(int ), (int)10);
                        }
lbl51:
                        // 1 sources

                        if (var6_7 || var6_7) return (boolean)nz.kzdt("kzei", kzdq(int ), (int)7);
                        v5 /* !! */  = nz.tq;
                        break block73;
                        case 1: {
                            var7_6 /* !! */  = (int)nz.kzdt("kzfj", kzdq(int ), (int)19);
                            cfr_temp_0 = 8;
                            if (!var8_5) continue block45;
                            throw null;
                        }
                        case 2: {
                            ** GOTO lbl91
                        }
                        case 5: {
                            var7_6 /* !! */  = (int)nz.kzdt("kzfn", kzdq(int ), (int)23);
                            if (var8_5) {
                                throw null;
                            }
                        }
                        case 7: {
                            var7_6 /* !! */  = (int)nz.kzdt("kzfp", kzdq(int ), (int)25);
                            if (var8_5) {
                                throw null;
                            }
                        }
                        case 0: {
                            var7_6 /* !! */  = (int)nz.kzdt("kzfi", kzdq(int ), (int)18);
                            cfr_temp_0 = 6;
                            if (!var8_5) continue block45;
                            throw null;
                        }
                        case 9: {
                            var7_6 /* !! */  = (int)nz.kzdt("kzfr", kzdq(int ), (int)27);
                            if (var8_5) {
                                throw null;
                            }
                        }
                        case 11: {
                            var7_6 /* !! */  = (int)nz.kzdt("kzft", kzdq(int ), (int)29);
                            if (var8_5) {
                                throw null;
                            }
                        }
                        case 6: {
                            var7_6 /* !! */  = (int)nz.kzdt("kzfo", kzdq(int ), (int)24);
                            cfr_temp_0 = 4;
                            if (!var8_5) continue block45;
                            throw null;
                        }
                        case 14: {
                            var7_6 /* !! */  = (int)nz.kzdt("kzfw", kzdq(int ), (int)32);
                            if (var8_5) {
                                throw null;
                            }
lbl91:
                            // 3 sources

                            var7_6 /* !! */  = (int)nz.kzdt("kzfk", kzdq(int ), (int)20);
                            if (var8_5) {
                                throw null;
                            }
                        }
                        case 8: {
                            var7_6 /* !! */  = (int)nz.kzdt("kzfq", kzdq(int ), (int)26);
                            if (var8_5) {
                                throw null;
                            }
                        }
                        case 4: {
                            var7_6 /* !! */  = (int)nz.kzdt("kzfm", kzdq(int ), (int)22);
                            if (var8_5) {
                                throw null;
                            }
                        }
                        case 13: {
                            var7_6 /* !! */  = (int)nz.kzdt("kzfv", kzdq(int ), (int)31);
                            if (var8_5) {
                                throw null;
                            }
                        }
                        case 10: {
                            var7_6 /* !! */  = (int)nz.kzdt("kzfs", kzdq(int ), (int)28);
                            if (var8_5) {
                                throw null;
                            }
                        }
                        case 12: {
                            var7_6 /* !! */  = (int)nz.kzdt("kzfu", kzdq(int ), (int)30);
                            if (var8_5) {
                                throw null;
                            }
                        }
                        case 3: 
                    }
                    break;
                }
                break block75;
                ** while (true)
            }
            do {
                var7_6 /* !! */  = (int)nz.kzdt("kzfl", kzdq(int ), (int)21);
            } while (!var8_5);
            throw null;
        }
        block47: while (true) {
            switch ((int)v5 /* !! */ ) {
                case 683251218: {
                    v5 /* !! */  = (long)(nz.kzdt("kzeq", kzdx(int ), (int)8) - nz.kzdt("kzep", kzdx(int ), (int)7));
                    continue block47;
                }
                case 1293686697: {
                    break block47;
                }
            }
            break;
        }
        v6 /* !! */  = nz.tq;
        if (true) ** GOTO lbl134
        block48: while (true) {
            v6 /* !! */  = (long)(v7 - nz.kzdt("kzer", kzdx(int ), (int)9));
lbl134:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case -2056084245: {
                    v7 = nz.kzdt("kzes", kzdx(int ), (int)10);
                    continue block48;
                }
                case -660894898: {
                    v7 = nz.kzdt("kzet", kzdx(int ), (int)11);
                    continue block48;
                }
                case 1293686697: {
                    break block48;
                }
            }
            break;
        }
        var5_8 = new oa(var0, var1_1, var2_2, var3_3, var4_4);
        if (var6_7 || var6_7) return (boolean)nz.kzdt("kzei", kzdq(int ), (int)7);
        while (true) {
            if ((v8 /* !! */  = (cfr_temp_4 = nz.tq - nz.kzdt("kzeu", kzdx(int ), (int)12)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v8 /* !! */  == nz.kzdt("kzev", kzdq(int ), (int)11)) break;
            v8 /* !! */  = (long)nz.kzdt("kzew", kzdq(int ), (int)12);
        }
        while (true) {
            if ((v9 /* !! */  = (cfr_temp_5 = nz.tq - nz.kzdt("kzex", kzdx(int ), (int)13)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v9 /* !! */  == nz.kzdt("kzey", kzdq(int ), (int)13)) {
                nz.swapRegistry.put(var0, var5_8);
                if (var6_7) return (boolean)nz.kzdt("kzei", kzdq(int ), (int)7);
                break;
            }
            v9 /* !! */  = (long)nz.kzdt("kzez", kzdq(int ), (int)14);
        }
        if (var6_7) return (boolean)nz.kzdt("kzei", kzdq(int ), (int)7);
        while (true) {
            block76: {
                if ((v10 /* !! */  = (cfr_temp_6 = nz.tq - nz.kzdt("kzfa", kzdx(int ), (int)14)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                if (v10 /* !! */  != nz.kzdt("kzfb", kzdq(int ), (int)15)) break block76;
                v11 /* !! */  = nz.tq;
                if (true) ** GOTO lbl169
            }
            v10 /* !! */  = (long)nz.kzdt("kzfc", kzdq(int ), (int)16);
        }
        block52: while (true) {
            v11 /* !! */  = (long)(v12 - nz.kzdt("kzfd", kzdx(int ), (int)15));
lbl169:
            // 2 sources

            switch ((int)v11 /* !! */ ) {
                case -2003331955: {
                    v12 = nz.kzdt("kzfe", kzdx(int ), (int)16);
                    continue block52;
                }
                case -1389438734: {
                    v12 = nz.kzdt("kzff", kzdx(int ), (int)17);
                    continue block52;
                }
                case 1293686697: {
                    break block52;
                }
                case 1684070699: {
                    v12 = nz.kzdt("kzfg", kzdx(int ), (int)18);
                    continue block52;
                }
            }
            break;
        }
        nz.swapQueue.add(var5_8);
        if (!var6_7 && !var6_7) return (boolean)nz.kzdt("kzfh", kzdq(int ), (int)17);
        return (boolean)nz.kzdt("kzei", kzdq(int ), (int)7);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ void lambda$swapSlots$5(int var0, int var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = nz.tq - nz.kzdt("lahi", kzdx(int ), (int)304)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == nz.kzdt("lahj", kzdq(int ), (int)461)) break;
            v0 /* !! */  = (long)nz.kzdt("lahk", kzdq(int ), (int)462);
        }
        var4_2 = nz.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = nz.tq - nz.kzdt("lahl", kzdx(int ), (int)305)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == nz.kzdt("lahm", kzdq(int ), (int)463)) break;
            v1 /* !! */  = (long)nz.kzdt("lahn", kzdq(int ), (int)464);
        }
        var3_3 /* !! */  = nz.b;
        v2 /* !! */  = nz.tq;
        if (true) ** GOTO lbl17
        block13: while (true) {
            v2 /* !! */  = (long)(nz.kzdt("lahp", kzdx(int ), (int)307) - nz.kzdt("laho", kzdx(int ), (int)306));
lbl17:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 403069276: {
                    continue block13;
                }
                case 1293686697: {
                    break block13;
                }
            }
            break;
        }
        var2_4 = nz.a;
        if (var4_2) {
            throw null;
lbl25:
            // 3 sources

            return;
        }
        if (var2_4) ** GOTO lbl25
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** GOTO lbl25
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = nz.tq - nz.kzdt("lahq", kzdx(int ), (int)308)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == nz.kzdt("lahr", kzdq(int ), (int)465)) break;
                    v3 /* !! */  = (long)nz.kzdt("lahs", kzdq(int ), (int)466);
                }
                nv.swap(var0, var1_1);
                if (var2_4) ** continue;
                return;
            }
lbl40:
            // 2 sources

            case 0: {
                do {
                    var3_3 /* !! */  = (int)nz.kzdt("laht", kzdq(int ), (int)467);
                } while (!var4_2);
                throw null;
            }
lbl45:
            // 2 sources

            case 1: {
                do {
                    var3_3 /* !! */  = (int)nz.kzdt("lahu", kzdq(int ), (int)468);
                } while (!var4_2);
                throw null;
            }
            case 2: {
                var3_3 /* !! */  = (int)nz.kzdt("lahv", kzdq(int ), (int)469);
                if (!var4_2) ** GOTO lbl45
                throw null;
            }
            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)nz.kzdt("lahw", kzdq(int ), (int)470);
                    if (!var4_2) ** GOTO lbl40
                    throw null;
                }
            }
            case 4: 
        }
        var3_3 /* !! */  = (int)nz.kzdt("lahx", kzdq(int ), (int)471);
        ** while (!var4_2)
lbl62:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void lapk() {
        nz.kzdy[0] = -8832475437596574942L;
        nz.kzdy[1] = -1051133299297308267L;
        nz.kzdy[2] = -1454747011362426583L;
        nz.kzdy[3] = 8596409652212077827L;
        nz.kzdy[4] = -5564902659895982325L;
        nz.kzdy[5] = 3531470788071384417L;
        nz.kzdy[6] = 1985731713339654772L;
        nz.kzdy[7] = -5378755661508741606L;
        nz.kzdy[8] = -5710046890334674492L;
        nz.kzdy[9] = -2216011392163972957L;
        nz.kzdy[10] = 5473573675686257344L;
        nz.kzdy[11] = -3569383530257125475L;
        nz.kzdy[12] = 8226838714136430737L;
        nz.kzdy[13] = 7232196791685740575L;
        nz.kzdy[14] = 2721971634676350600L;
        nz.kzdy[15] = -8764867692700207569L;
        nz.kzdy[16] = 2192507135603963933L;
        nz.kzdy[17] = -4835136143409937929L;
        nz.kzdy[18] = -991746045325391918L;
        nz.kzdy[19] = 2244032674152184584L;
        nz.kzdy[20] = 6120172705239166758L;
        nz.kzdy[21] = -4792469455598419637L;
        nz.kzdy[22] = 552301437940442365L;
        nz.kzdy[23] = -8575074858631980128L;
        nz.kzdy[24] = 368146110767400428L;
        nz.kzdy[25] = 8140306348941733001L;
        nz.kzdy[26] = -5327893885931390150L;
        nz.kzdy[27] = 6515839189278355479L;
        nz.kzdy[28] = -5750650881293677333L;
        nz.kzdy[29] = -1426407197005331025L;
        nz.kzdy[30] = -7102435844047680458L;
        nz.kzdy[31] = 8840926448446318107L;
        nz.kzdy[32] = -3413882507592255267L;
        nz.kzdy[33] = -4792720891967819967L;
        nz.kzdy[34] = 3905358597791369887L;
        nz.kzdy[35] = 5332237135711555142L;
        nz.kzdy[36] = -8705115604668121187L;
        nz.kzdy[37] = 6465660788344968829L;
        nz.kzdy[38] = 4803176862105787136L;
        nz.kzdy[39] = -3177226381801187864L;
        nz.kzdy[40] = 5569079259146607463L;
        nz.kzdy[41] = 8479337386049113428L;
        nz.kzdy[42] = 3131527413984964851L;
        nz.kzdy[43] = 1708157974022543172L;
        nz.kzdy[44] = -6312182753346239550L;
        nz.kzdy[45] = 2524249114960420725L;
        nz.kzdy[46] = -7402692687837616848L;
        nz.kzdy[47] = 4705721528763398738L;
        nz.kzdy[48] = 5181453361425443821L;
        nz.kzdy[49] = 5362273221791368303L;
        nz.kzdy[50] = -8604104863443159811L;
        nz.kzdy[51] = -471656156837075029L;
        nz.kzdy[52] = -7541068791112087519L;
        nz.kzdy[53] = -6268817981195270567L;
        nz.kzdy[54] = 1468418173206303711L;
        nz.kzdy[55] = -3527471941476851986L;
        nz.kzdy[56] = -3697820173610410379L;
        nz.kzdy[57] = -317535005059831780L;
        nz.kzdy[58] = -7404600242749520268L;
        nz.kzdy[59] = 7201052048959064057L;
        nz.kzdy[60] = 5873701240606698655L;
        nz.kzdy[61] = -8981840774364645868L;
        nz.kzdy[62] = -8685937491032982602L;
        nz.kzdy[63] = 406014988340878016L;
        nz.kzdy[64] = -4159423663826064054L;
        nz.kzdy[65] = -6285308666080445042L;
        nz.kzdy[66] = 8598841188667106664L;
        nz.kzdy[67] = -4674845741156522044L;
        nz.kzdy[68] = -8629309992081743727L;
        nz.kzdy[69] = -3070086975848360067L;
        nz.kzdy[70] = 1293714634608322504L;
        nz.kzdy[71] = -197161926412145625L;
        nz.kzdy[72] = -6901802074121370460L;
        nz.kzdy[73] = 3211116608746358590L;
        nz.kzdy[74] = -864536926785191198L;
        nz.kzdy[75] = -8995468122135836253L;
        nz.kzdy[76] = 7057573718571456283L;
        nz.kzdy[77] = 3592242609205913923L;
        nz.kzdy[78] = -5395723135989267777L;
        nz.kzdy[79] = -4758321361381688982L;
        nz.kzdy[80] = -906743946133541984L;
        nz.kzdy[81] = -1951271390414752515L;
        nz.kzdy[82] = -2062404535827842483L;
        nz.kzdy[83] = 7394408536683845063L;
        nz.kzdy[84] = 869333825069927743L;
        nz.kzdy[85] = -9189579176203224072L;
        nz.kzdy[86] = -7919726345672332907L;
        nz.kzdy[87] = -8872800549073158557L;
        nz.kzdy[88] = -898940854708736146L;
        nz.kzdy[89] = -1138541075845369581L;
        nz.kzdy[90] = -5574649487672351114L;
        nz.kzdy[91] = -2830328081032396872L;
        nz.kzdy[92] = -7454412213996926441L;
        nz.kzdy[93] = -8238562827209707287L;
        nz.kzdy[94] = 7845791626083728320L;
        nz.kzdy[95] = 5841133322569501517L;
        nz.kzdy[96] = 3963692654634296431L;
        nz.kzdy[97] = -7899583556014924203L;
        nz.kzdy[98] = 2835629399865056290L;
        nz.kzdy[99] = -2112025885240797265L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Deprecated
    public static boolean isLockedBy(String var0) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = nz.tq - nz.kzdt("kzwp", kzdx(int ), (int)191)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == nz.kzdt("kzwq", kzdq(int ), (int)295)) break;
            v0 /* !! */  = (long)nz.kzdt("kzwr", kzdq(int ), (int)296);
        }
        var3_1 = nz.c;
        v1 /* !! */  = nz.tq;
        if (true) ** GOTO lbl12
        block11: while (true) {
            v1 /* !! */  = (long)(nz.kzdt("kzwt", kzdx(int ), (int)193) - nz.kzdt("kzws", kzdx(int ), (int)192));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1329793456: {
                    continue block11;
                }
                case 1293686697: {
                    break block11;
                }
            }
            break;
        }
        var2_2 /* !! */  = nz.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = nz.tq - nz.kzdt("kzwu", kzdx(int ), (int)194)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == nz.kzdt("kzwv", kzdq(int ), (int)297)) break;
            v2 /* !! */  = (long)nz.kzdt("kzww", kzdq(int ), (int)298);
        }
        var1_3 = nz.a;
        if (var3_1) {
            throw null;
lbl27:
            // 2 sources

            return (boolean)nz.kzdt("kzwx", kzdq(int ), (int)299);
        }
        if (var1_3) ** GOTO lbl27
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = nz.tq - nz.kzdt("kzwy", kzdx(int ), (int)195)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == nz.kzdt("kzwz", kzdq(int ), (int)300)) break;
                    v3 /* !! */  = (long)nz.kzdt("kzxa", kzdq(int ), (int)301);
                }
                return nz.isSwapRunning(var0);
            }
            case 0: {
                var2_2 /* !! */  = (int)nz.kzdt("kzxb", kzdq(int ), (int)302);
                if (var3_1) {
                    throw null;
                }
            }
lbl45:
            // 4 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)nz.kzdt("kzxc", kzdq(int ), (int)303);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)nz.kzdt("kzxd", kzdq(int ), (int)304);
                if (!var3_1) ** GOTO lbl45
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)nz.kzdt("kzxe", kzdq(int ), (int)305);
        ** while (!var3_1)
lbl57:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void lapc() {
        nz.kzdr[400] = -1631887378;
        nz.kzdr[401] = -1236591232;
        nz.kzdr[402] = 1261501776;
        nz.kzdr[403] = 1514100594;
        nz.kzdr[404] = 414714921;
        nz.kzdr[405] = 698951068;
        nz.kzdr[406] = 29012369;
        nz.kzdr[407] = 1144632465;
        nz.kzdr[408] = -573418106;
        nz.kzdr[409] = 1136976884;
        nz.kzdr[410] = -910955988;
        nz.kzdr[411] = 868308908;
        nz.kzdr[412] = 1773451844;
        nz.kzdr[413] = -1890131086;
        nz.kzdr[414] = -319156795;
        nz.kzdr[415] = -1732548966;
        nz.kzdr[416] = 1392459489;
        nz.kzdr[417] = -1344089518;
        nz.kzdr[418] = -816557190;
        nz.kzdr[419] = -210193369;
        nz.kzdr[420] = -1057221133;
        nz.kzdr[421] = -820119244;
        nz.kzdr[422] = 1496954873;
        nz.kzdr[423] = 653778439;
        nz.kzdr[424] = 317622246;
        nz.kzdr[425] = 1674719716;
        nz.kzdr[426] = -2108480622;
        nz.kzdr[427] = 1722449875;
        nz.kzdr[428] = -1047275711;
        nz.kzdr[429] = 747836738;
        nz.kzdr[430] = -1874505569;
        nz.kzdr[431] = -1016892377;
        nz.kzdr[432] = 1104188757;
        nz.kzdr[433] = -333563126;
        nz.kzdr[434] = -1978379947;
        nz.kzdr[435] = 1949246833;
        nz.kzdr[436] = 1773949228;
        nz.kzdr[437] = -1562651928;
        nz.kzdr[438] = -902182293;
        nz.kzdr[439] = -1717360960;
        nz.kzdr[440] = -375907485;
        nz.kzdr[441] = -270779065;
        nz.kzdr[442] = 800412071;
        nz.kzdr[443] = -1278333408;
        nz.kzdr[444] = -1094919579;
        nz.kzdr[445] = 1915918589;
        nz.kzdr[446] = 87748468;
        nz.kzdr[447] = -1188085940;
        nz.kzdr[448] = 1386881833;
        nz.kzdr[449] = -396499376;
        nz.kzdr[450] = -404450326;
        nz.kzdr[451] = 765334832;
        nz.kzdr[452] = 1922933939;
        nz.kzdr[453] = 1800850985;
        nz.kzdr[454] = -621077095;
        nz.kzdr[455] = -1346688506;
        nz.kzdr[456] = 1606538676;
        nz.kzdr[457] = -1724361708;
        nz.kzdr[458] = -931068440;
        nz.kzdr[459] = 1241689538;
        nz.kzdr[460] = 911510214;
        nz.kzdr[461] = 2070298851;
        nz.kzdr[462] = -1282203685;
        nz.kzdr[463] = -454213486;
        nz.kzdr[464] = -861063655;
        nz.kzdr[465] = 418887064;
        nz.kzdr[466] = 62011807;
        nz.kzdr[467] = -446310079;
        nz.kzdr[468] = -1239495056;
        nz.kzdr[469] = 814745966;
        nz.kzdr[470] = 1951401614;
        nz.kzdr[471] = -325166619;
        nz.kzdr[472] = 1667506710;
        nz.kzdr[473] = 62997115;
        nz.kzdr[474] = -643108361;
        nz.kzdr[475] = -1164469269;
        nz.kzdr[476] = -103625726;
        nz.kzdr[477] = -1471724551;
        nz.kzdr[478] = -2095519072;
        nz.kzdr[479] = -423734961;
        nz.kzdr[480] = -454966890;
        nz.kzdr[481] = -88444758;
        nz.kzdr[482] = -576296237;
        nz.kzdr[483] = -1447847803;
        nz.kzdr[484] = 230797985;
        nz.kzdr[485] = -2081230517;
        nz.kzdr[486] = -286170950;
        nz.kzdr[487] = 1894593223;
        nz.kzdr[488] = -1257975284;
        nz.kzdr[489] = -424006190;
        nz.kzdr[490] = -994529134;
        nz.kzdr[491] = 279855044;
        nz.kzdr[492] = 639006579;
        nz.kzdr[493] = -402896617;
        nz.kzdr[494] = -2141817846;
        nz.kzdr[495] = -1090337422;
        nz.kzdr[496] = -1761515807;
        nz.kzdr[497] = 1464538595;
        nz.kzdr[498] = -562743977;
        nz.kzdr[499] = -1304675193;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static boolean isSwapQueued(String var0) {
        v0 /* !! */  = nz.tq;
        block20: while (true) {
            switch ((int)v0 /* !! */ ) {
                case 1293686697: {
                    break block20;
                }
                case 1409630032: {
                    v0 /* !! */  = (long)(nz.kzdt("kzis", kzdx(int ), (int)59) - nz.kzdt("kzir", kzdx(int ), (int)58));
                    continue block20;
                }
            }
            break;
        }
        var3_1 = nz.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = nz.tq - nz.kzdt("kzit", kzdx(int ), (int)60)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == nz.kzdt("kziu", kzdq(int ), (int)66)) break;
            v1 /* !! */  = (long)nz.kzdt("kziv", kzdq(int ), (int)67);
        }
        var2_2 /* !! */  = nz.b;
        while (true) {
            block32: {
                if ((v2 /* !! */  = (cfr_temp_2 = nz.tq - nz.kzdt("kziw", kzdx(int ), (int)61)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v2 /* !! */  != nz.kzdt("kzix", kzdq(int ), (int)68)) break block32;
                var1_3 = nz.a;
                if (var2_2 /* !! */  != 0) {
                    break;
                }
                ** GOTO lbl-1000
            }
            v2 /* !! */  = (long)nz.kzdt("kziy", kzdq(int ), (int)69);
        }
        cfr_temp_0 = -2147483648;
        block23: while (true) {
            block33: {
                switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var3_1) {
                            throw null;
                        }
                        if (var1_3 != false) return (boolean)nz.kzdt("kziz", kzdq(int ), (int)70);
                        if (var1_3 != false) return (boolean)nz.kzdt("kziz", kzdq(int ), (int)70);
                        v3 /* !! */  = nz.tq;
                        block24: while (true) {
                            switch ((int)v3 /* !! */ ) {
                                case -1602642381: {
                                    v4 = nz.kzdt("kzjb", kzdx(int ), (int)63);
                                    ** GOTO lbl47
                                }
                                case 616193648: {
                                    v4 = nz.kzdt("kzjc", kzdx(int ), (int)64);
                                    ** GOTO lbl47
                                }
                                case 1293686697: {
                                    break block24;
                                }
                                case 1445580558: {
                                    v4 = nz.kzdt("kzjd", kzdx(int ), (int)65);
lbl47:
                                    // 3 sources

                                    v3 /* !! */  = (long)(v4 - nz.kzdt("kzja", kzdx(int ), (int)62));
                                    continue block24;
                                }
                            }
                            break;
                        }
                        v5 /* !! */  = nz.tq;
                        block25: while (true) {
                            switch ((int)v5 /* !! */ ) {
                                case 1142045126: {
                                    v5 /* !! */  = (long)(nz.kzdt("kzjf", kzdx(int ), (int)67) - nz.kzdt("kzje", kzdx(int ), (int)66));
                                    continue block25;
                                }
                                case 1293686697: {
                                    return nz.swapRegistry.containsKey(var0);
                                }
                            }
                            break;
                        }
                        return nz.swapRegistry.containsKey(var0);
                    }
                    case 0: {
                        var2_2 /* !! */  = (int)nz.kzdt("kzjg", kzdq(int ), (int)71);
                        cfr_temp_0 = 2;
                        if (var3_1) {
                            throw null;
                        }
                        break block33;
                    }
                    case 3: {
                        var2_2 /* !! */  = (int)nz.kzdt("kzjj", kzdq(int ), (int)74);
                        if (var3_1) {
                            throw null;
                        }
                        ** GOTO lbl-1000
                    }
                    case 1: lbl-1000:
                    // 2 sources

                    {
                        var2_2 /* !! */  = (int)nz.kzdt("kzjh", kzdq(int ), (int)72);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 2: 
                }
                ** GOTO lbl78
            }
            do {
                if (true) continue block23;
lbl78:
                // 2 sources

                var2_2 /* !! */  = (int)nz.kzdt("kzji", kzdq(int ), (int)73);
                cfr_temp_0 = 1;
            } while (!var3_1);
            break;
        }
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ void lambda$swapAndUse$0(nu var0) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = nz.tq - nz.kzdt("lanl", kzdx(int ), (int)377)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == nz.kzdt("lanm", kzdq(int ), (int)547)) break;
            v0 /* !! */  = (long)nz.kzdt("lann", kzdq(int ), (int)548);
        }
        var3_1 = nz.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = nz.tq - nz.kzdt("lano", kzdx(int ), (int)378)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == nz.kzdt("lanp", kzdq(int ), (int)549)) break;
            v1 /* !! */  = (long)nz.kzdt("lanq", kzdq(int ), (int)550);
        }
        var2_2 /* !! */  = nz.b;
        v2 /* !! */  = nz.tq;
        if (true) ** GOTO lbl19
        block45: while (true) {
            v2 /* !! */  = (long)(v3 - nz.kzdt("lanr", kzdx(int ), (int)379));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -748043626: {
                    v3 = nz.kzdt("lans", kzdx(int ), (int)380);
                    continue block45;
                }
                case 791119831: {
                    v3 = nz.kzdt("lant", kzdx(int ), (int)381);
                    continue block45;
                }
                case 1293686697: {
                    break block45;
                }
            }
            break;
        }
        var1_3 = nz.a;
        if (var3_1) {
            throw null;
lbl31:
            // 5 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl31
        v4 /* !! */  = nz.tq;
        if (true) ** GOTO lbl38
        block47: while (true) {
            v4 /* !! */  = (long)(v5 - nz.kzdt("lanu", kzdx(int ), (int)382));
lbl38:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -754322136: {
                    v5 = nz.kzdt("lanv", kzdx(int ), (int)383);
                    continue block47;
                }
                case -436800087: {
                    v5 = nz.kzdt("lanw", kzdx(int ), (int)384);
                    continue block47;
                }
                case 931063986: {
                    v5 = nz.kzdt("lanx", kzdx(int ), (int)385);
                    continue block47;
                }
                case 1293686697: {
                    break block47;
                }
            }
            break;
        }
        nv.saveSlot();
        if (var1_3 || var1_3) ** GOTO lbl31
        v6 /* !! */  = nz.tq;
        if (true) ** GOTO lbl56
        block48: while (true) {
            v6 /* !! */  = (long)(v7 - nz.kzdt("lany", kzdx(int ), (int)386));
lbl56:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case -632833911: {
                    v7 = nz.kzdt("lanz", kzdx(int ), (int)387);
                    continue block48;
                }
                case 833296519: {
                    v7 = nz.kzdt("laoa", kzdx(int ), (int)388);
                    continue block48;
                }
                case 919213466: {
                    v7 = nz.kzdt("laob", kzdx(int ), (int)389);
                    continue block48;
                }
                case 1293686697: {
                    break block48;
                }
            }
            break;
        }
        v8 = var0.slot();
        v9 /* !! */  = nz.tq;
        if (true) ** GOTO lbl73
        block49: while (true) {
            v9 /* !! */  = (long)(nz.kzdt("laod", kzdx(int ), (int)391) - nz.kzdt("laoc", kzdx(int ), (int)390));
lbl73:
            // 2 sources

            switch ((int)v9 /* !! */ ) {
                case 738942941: {
                    continue block49;
                }
                case 1293686697: {
                    break block49;
                }
            }
            break;
        }
        nv.selectSlot(v8);
        if (var1_3 || var1_3) ** GOTO lbl31
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block21 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_2 = nz.tq - nz.kzdt("laoe", kzdx(int ), (int)392)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v10 /* !! */  == nz.kzdt("laof", kzdq(int ), (int)551)) break;
                    v10 /* !! */  = (long)nz.kzdt("laog", kzdq(int ), (int)552);
                }
                v11 /* !! */  = nz.tq;
                if (true) ** GOTO lbl93
                block51: while (true) {
                    v11 /* !! */  = (long)(nz.kzdt("laoi", kzdx(int ), (int)394) - nz.kzdt("laoh", kzdx(int ), (int)393));
lbl93:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case 926155322: {
                            continue block51;
                        }
                        case 1293686697: {
                            break block51;
                        }
                    }
                    break;
                }
                nv.use(class_1268.field_5808);
                if (var1_3 || var1_3) ** GOTO lbl31
                v12 /* !! */  = nz.tq;
                if (true) ** GOTO lbl104
                block52: while (true) {
                    v12 /* !! */  = (long)(nz.kzdt("laok", kzdx(int ), (int)396) - nz.kzdt("laoj", kzdx(int ), (int)395));
lbl104:
                    // 2 sources

                    switch ((int)v12 /* !! */ ) {
                        case -1579933172: {
                            continue block52;
                        }
                        case 1293686697: {
                            break block52;
                        }
                    }
                    break;
                }
                nv.restoreSlot();
                if (var1_3 || var1_3) ** continue;
                return;
            }
            case 0: {
                var2_2 /* !! */  = (int)nz.kzdt("laol", kzdq(int ), (int)553);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl158
            }
lbl117:
            // 3 sources

            case 1: {
                var2_2 /* !! */  = (int)nz.kzdt("laom", kzdq(int ), (int)554);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl158
            }
            case 2: {
                var2_2 /* !! */  = (int)nz.kzdt("laon", kzdq(int ), (int)555);
                if (!var3_1) ** GOTO lbl117
                throw null;
            }
            case 3: {
                var2_2 /* !! */  = (int)nz.kzdt("laoo", kzdq(int ), (int)556);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl146
            }
lbl131:
            // 2 sources

            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)nz.kzdt("laop", kzdq(int ), (int)557);
                    if (!var3_1) break block21;
                    throw null;
                }
            }
            case 5: {
                var2_2 /* !! */  = (int)nz.kzdt("laoq", kzdq(int ), (int)558);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl154
            }
lbl141:
            // 2 sources

            case 6: {
                var2_2 /* !! */  = (int)nz.kzdt("laor", kzdq(int ), (int)559);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl154
            }
lbl146:
            // 2 sources

            case 7: {
                var2_2 /* !! */  = (int)nz.kzdt("laos", kzdq(int ), (int)560);
                if (!var3_1) ** GOTO lbl131
                throw null;
            }
lbl150:
            // 2 sources

            case 8: {
                var2_2 /* !! */  = (int)nz.kzdt("laot", kzdq(int ), (int)561);
                if (!var3_1) ** GOTO lbl141
                throw null;
            }
lbl154:
            // 3 sources

            case 9: {
                var2_2 /* !! */  = (int)nz.kzdt("laou", kzdq(int ), (int)562);
                if (!var3_1) ** GOTO lbl117
                throw null;
            }
lbl158:
            // 3 sources

            case 10: {
                var2_2 /* !! */  = (int)nz.kzdt("laov", kzdq(int ), (int)563);
                if (!var3_1) ** GOTO lbl150
                throw null;
            }
            case 11: 
        }
        var2_2 /* !! */  = (int)nz.kzdt("laow", kzdq(int ), (int)564);
        ** while (!var3_1)
lbl165:
        // 1 sources

        throw null;
    }

    /*
     * Handled impossible loop by duplicating code
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    @Deprecated
    public static void releaseLock(String string) {
        CallSite callSite;
        boolean bl2;
        Object object = tq;
        boolean bl3 = true;
        block16: while (true) {
            CallSite callSite2;
            if (!bl3 || (bl3 = false) || !true) {
                object = callSite2 - nz.kzdt("kzuu", kzdx(int ), (int)171);
            }
            switch ((int)object) {
                case 824019342: {
                    callSite2 = nz.kzdt("kzuv", kzdx(int ), (int)172);
                    continue block16;
                }
                case 1293686697: {
                    break block16;
                }
                case 1988871994: {
                    callSite2 = nz.kzdt("kzuw", kzdx(int ), (int)173);
                    continue block16;
                }
            }
            break;
        }
        boolean bl4 = c;
        Object object2 = tq;
        boolean bl5 = true;
        block17: while (true) {
            CallSite callSite3;
            if (!bl5 || (bl5 = false) || !true) {
                object2 = callSite3 - nz.kzdt("kzux", kzdx(int ), (int)174);
            }
            switch ((int)object2) {
                case -1934969022: {
                    callSite3 = nz.kzdt("kzuy", kzdx(int ), (int)175);
                    continue block17;
                }
                case 577232810: {
                    callSite3 = nz.kzdt("kzuz", kzdx(int ), (int)176);
                    continue block17;
                }
                case 1293686697: {
                    break block17;
                }
            }
            break;
        }
        int n2 = b;
        while (true) {
            long l2;
            Object object3;
            if ((object3 = (l2 = tq - nz.kzdt("kzva", kzdx(int ), (int)177)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (object3 == nz.kzdt("kzvb", kzdq(int ), (int)268)) {
                bl2 = a;
                if (bl4) {
                    throw null;
                }
                break;
            }
            object3 = nz.kzdt("kzvc", kzdq(int ), (int)269);
        }
        if (!bl2 && !bl2) {
            return;
        }
        if (n2 == 0) return;
        switch (n2) {
            default: {
                return;
            }
            case 0: {
                break;
            }
            case 1: {
                CallSite callSite4 = nz.kzdt("kzve", kzdq(int ), (int)271);
                if (bl4) {
                    throw null;
                }
                callSite = nz.kzdt("kzvg", kzdq(int ), (int)273);
                if (!bl4) break;
                throw null;
            }
            case 2: {
                CallSite callSite5 = nz.kzdt("kzvf", kzdq(int ), (int)272);
                if (bl4) {
                    throw null;
                }
                callSite = nz.kzdt("kzvg", kzdq(int ), (int)273);
                if (!bl4) break;
                throw null;
            }
            case 3: {
                callSite = nz.kzdt("kzvg", kzdq(int ), (int)273);
                if (!bl4) break;
                throw null;
            }
        }
        do {
            callSite = nz.kzdt("kzvd", kzdq(int ), (int)270);
            if (bl4) {
                throw null;
            }
            callSite = nz.kzdt("kzvg", kzdq(int ), (int)273);
        } while (!bl4);
        throw null;
    }

    private static /* synthetic */ void lapf() {
        nz.kzds[100] = 1636744820;
        nz.kzds[101] = 195067920;
        nz.kzds[102] = 291241027;
        nz.kzds[103] = 2054793038;
        nz.kzds[104] = -1253758738;
        nz.kzds[105] = -1516261910;
        nz.kzds[106] = 1363406882;
        nz.kzds[107] = -1249494935;
        nz.kzds[108] = 169665964;
        nz.kzds[109] = -1115097485;
        nz.kzds[110] = 1815135920;
        nz.kzds[111] = -1458736444;
        nz.kzds[112] = -1773257471;
        nz.kzds[113] = 1682053289;
        nz.kzds[114] = 1715496531;
        nz.kzds[115] = -90737310;
        nz.kzds[116] = 1222645532;
        nz.kzds[117] = 1795611462;
        nz.kzds[118] = -1989447280;
        nz.kzds[119] = 2132194039;
        nz.kzds[120] = 1582025533;
        nz.kzds[121] = -696621373;
        nz.kzds[122] = 2019234052;
        nz.kzds[123] = -1248192085;
        nz.kzds[124] = 204179810;
        nz.kzds[125] = 625004713;
        nz.kzds[126] = 2077273023;
        nz.kzds[127] = 1495606830;
        nz.kzds[128] = -894738501;
        nz.kzds[129] = 1841633554;
        nz.kzds[130] = -1844920349;
        nz.kzds[131] = -461119757;
        nz.kzds[132] = -1224929872;
        nz.kzds[133] = 39744206;
        nz.kzds[134] = 1937282104;
        nz.kzds[135] = 1007619049;
        nz.kzds[136] = -810284336;
        nz.kzds[137] = 1241666638;
        nz.kzds[138] = 1228808895;
        nz.kzds[139] = 1880937290;
        nz.kzds[140] = 359666199;
        nz.kzds[141] = -330365713;
        nz.kzds[142] = -619521959;
        nz.kzds[143] = -231084222;
        nz.kzds[144] = -1440543359;
        nz.kzds[145] = -1109381371;
        nz.kzds[146] = -429714637;
        nz.kzds[147] = 75500607;
        nz.kzds[148] = -1438058225;
        nz.kzds[149] = 988759790;
        nz.kzds[150] = -244801405;
        nz.kzds[151] = 1656555150;
        nz.kzds[152] = 2133752211;
        nz.kzds[153] = -564905133;
        nz.kzds[154] = 1803739504;
        nz.kzds[155] = -501359034;
        nz.kzds[156] = 625867;
        nz.kzds[157] = 296379821;
        nz.kzds[158] = 1320667985;
        nz.kzds[159] = 1664779620;
        nz.kzds[160] = 1566877362;
        nz.kzds[161] = -2018148597;
        nz.kzds[162] = -314034406;
        nz.kzds[163] = 1888349239;
        nz.kzds[164] = -1718759407;
        nz.kzds[165] = -509960943;
        nz.kzds[166] = 905262098;
        nz.kzds[167] = -298323970;
        nz.kzds[168] = -775906725;
        nz.kzds[169] = 641563459;
        nz.kzds[170] = -650423863;
        nz.kzds[171] = -40038449;
        nz.kzds[172] = 534445242;
        nz.kzds[173] = -2125294461;
        nz.kzds[174] = -459008695;
        nz.kzds[175] = 1917979577;
        nz.kzds[176] = 14315109;
        nz.kzds[177] = 1773850840;
        nz.kzds[178] = -1633874549;
        nz.kzds[179] = 469750317;
        nz.kzds[180] = 576705076;
        nz.kzds[181] = 751160176;
        nz.kzds[182] = 1615280940;
        nz.kzds[183] = -1932632167;
        nz.kzds[184] = 1179518837;
        nz.kzds[185] = -1438386969;
        nz.kzds[186] = -2102870176;
        nz.kzds[187] = -1683262379;
        nz.kzds[188] = -1467993088;
        nz.kzds[189] = 203560393;
        nz.kzds[190] = 215352870;
        nz.kzds[191] = -2018753342;
        nz.kzds[192] = -129572931;
        nz.kzds[193] = -1810397264;
        nz.kzds[194] = 175801610;
        nz.kzds[195] = -18213238;
        nz.kzds[196] = -1355616001;
        nz.kzds[197] = -385013267;
        nz.kzds[198] = -1717000595;
        nz.kzds[199] = -366124122;
    }

    private static /* synthetic */ void laph() {
        nz.kzds[300] = -625955070;
        nz.kzds[301] = -1780222547;
        nz.kzds[302] = 1349403108;
        nz.kzds[303] = -122717946;
        nz.kzds[304] = -1268267270;
        nz.kzds[305] = -393485655;
        nz.kzds[306] = -1155988568;
        nz.kzds[307] = 920311361;
        nz.kzds[308] = -1156594511;
        nz.kzds[309] = 1362572469;
        nz.kzds[310] = -697084423;
        nz.kzds[311] = 793161442;
        nz.kzds[312] = 1013755231;
        nz.kzds[313] = -978170644;
        nz.kzds[314] = 128695839;
        nz.kzds[315] = 845000836;
        nz.kzds[316] = 181297237;
        nz.kzds[317] = 1521407563;
        nz.kzds[318] = 555240924;
        nz.kzds[319] = 684008576;
        nz.kzds[320] = 167860115;
        nz.kzds[321] = 351184726;
        nz.kzds[322] = 1601444063;
        nz.kzds[323] = 1441416342;
        nz.kzds[324] = -375180941;
        nz.kzds[325] = 669193209;
        nz.kzds[326] = -163829225;
        nz.kzds[327] = -150476544;
        nz.kzds[328] = 1097401690;
        nz.kzds[329] = -1431681715;
        nz.kzds[330] = 86935656;
        nz.kzds[331] = 1352833025;
        nz.kzds[332] = 674088759;
        nz.kzds[333] = 114464793;
        nz.kzds[334] = -893615964;
        nz.kzds[335] = -2094125764;
        nz.kzds[336] = 2028270026;
        nz.kzds[337] = 1830946497;
        nz.kzds[338] = -1126862698;
        nz.kzds[339] = 1563932381;
        nz.kzds[340] = 1662792207;
        nz.kzds[341] = 201138638;
        nz.kzds[342] = 1361573804;
        nz.kzds[343] = -1507826256;
        nz.kzds[344] = 1301803756;
        nz.kzds[345] = 1825126566;
        nz.kzds[346] = 954621932;
        nz.kzds[347] = 1168617339;
        nz.kzds[348] = -1761022108;
        nz.kzds[349] = -1639039439;
        nz.kzds[350] = -1811447707;
        nz.kzds[351] = 1800007647;
        nz.kzds[352] = 1847193093;
        nz.kzds[353] = -1122224301;
        nz.kzds[354] = -1734993459;
        nz.kzds[355] = -132932212;
        nz.kzds[356] = 478582008;
        nz.kzds[357] = -157795454;
        nz.kzds[358] = -1971425851;
        nz.kzds[359] = 1783066334;
        nz.kzds[360] = 768187237;
        nz.kzds[361] = -1497619064;
        nz.kzds[362] = -1951622578;
        nz.kzds[363] = -1486519747;
        nz.kzds[364] = 1441839227;
        nz.kzds[365] = 2077370567;
        nz.kzds[366] = 895540615;
        nz.kzds[367] = -1310039719;
        nz.kzds[368] = 729432299;
        nz.kzds[369] = 976582647;
        nz.kzds[370] = 896564239;
        nz.kzds[371] = 320063576;
        nz.kzds[372] = 1592826893;
        nz.kzds[373] = -988350041;
        nz.kzds[374] = 490977915;
        nz.kzds[375] = 604937533;
        nz.kzds[376] = -1218869632;
        nz.kzds[377] = 2133122176;
        nz.kzds[378] = -358965811;
        nz.kzds[379] = 1432914580;
        nz.kzds[380] = -674516240;
        nz.kzds[381] = 1729308429;
        nz.kzds[382] = 1748503184;
        nz.kzds[383] = -103669150;
        nz.kzds[384] = -1504434745;
        nz.kzds[385] = 473606555;
        nz.kzds[386] = -1871048934;
        nz.kzds[387] = 1269704283;
        nz.kzds[388] = -1902169160;
        nz.kzds[389] = -1758907832;
        nz.kzds[390] = 1175889146;
        nz.kzds[391] = -1630683986;
        nz.kzds[392] = 165772427;
        nz.kzds[393] = 923438636;
        nz.kzds[394] = 1214812488;
        nz.kzds[395] = -1876521256;
        nz.kzds[396] = 833367140;
        nz.kzds[397] = 839955368;
        nz.kzds[398] = 333786549;
        nz.kzds[399] = 1601933502;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void swapAndUseSilent(class_1792 var0, int var1_1) {
        block94: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = nz.tq - nz.kzdt("labs", kzdx(int ), (int)242)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  == nz.kzdt("labt", kzdq(int ), (int)377)) break;
                v0 /* !! */  = (long)nz.kzdt("labu", kzdq(int ), (int)378);
            }
            var7_2 = nz.c;
            while (true) {
                if ((v1 /* !! */  = (cfr_temp_1 = nz.tq - nz.kzdt("labv", kzdx(int ), (int)243)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v1 /* !! */  == nz.kzdt("labw", kzdq(int ), (int)379)) break;
                v1 /* !! */  = (long)nz.kzdt("labx", kzdq(int ), (int)380);
            }
            var6_3 /* !! */  = nz.b;
            v2 /* !! */  = nz.tq;
            if (true) ** GOTO lbl17
            block58: while (true) {
                v2 /* !! */  = (long)(v3 - nz.kzdt("laby", kzdx(int ), (int)244));
lbl17:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case -434934782: {
                        v3 = nz.kzdt("labz", kzdx(int ), (int)245);
                        continue block58;
                    }
                    case 1061371375: {
                        v3 = nz.kzdt("laca", kzdx(int ), (int)246);
                        continue block58;
                    }
                    case 1172011989: {
                        v3 = nz.kzdt("lacb", kzdx(int ), (int)247);
                        continue block58;
                    }
                    case 1293686697: {
                        break block58;
                    }
                }
                break;
            }
            var5_4 = nz.a;
            if (var7_2) {
                throw null;
lbl32:
                // 12 sources

                return;
            }
            if (var5_4 || var5_4) ** GOTO lbl32
            v4 /* !! */  = nz.tq;
            if (true) ** GOTO lbl39
            block60: while (true) {
                v4 /* !! */  = (long)(v5 - nz.kzdt("lacc", kzdx(int ), (int)248));
lbl39:
                // 2 sources

                switch ((int)v4 /* !! */ ) {
                    case -2100755040: {
                        v5 = nz.kzdt("lacd", kzdx(int ), (int)249);
                        continue block60;
                    }
                    case -1481497448: {
                        v5 = nz.kzdt("lace", kzdx(int ), (int)250);
                        continue block60;
                    }
                    case -1187388450: {
                        v5 = nz.kzdt("lacf", kzdx(int ), (int)251);
                        continue block60;
                    }
                    case 1293686697: {
                        break block60;
                    }
                }
                break;
            }
            var2_5 = nv.find(var0);
            if (var5_4 || var5_4) ** GOTO lbl32
            v6 /* !! */  = nz.tq;
            if (true) ** GOTO lbl57
            block61: while (true) {
                v6 /* !! */  = (long)(v7 - nz.kzdt("lacg", kzdx(int ), (int)252));
lbl57:
                // 2 sources

                switch ((int)v6 /* !! */ ) {
                    case -983494338: {
                        v7 = nz.kzdt("lach", kzdx(int ), (int)253);
                        continue block61;
                    }
                    case -870176150: {
                        v7 = nz.kzdt("laci", kzdx(int ), (int)254);
                        continue block61;
                    }
                    case 1293686697: {
                        break block61;
                    }
                    case 1833961374: {
                        v7 = nz.kzdt("lacj", kzdx(int ), (int)255);
                        continue block61;
                    }
                }
                break;
            }
            if (var2_5.found()) break block94;
            if (var5_4 || var5_4) ** GOTO lbl32
            return;
        }
        if (var5_4 || var5_4) ** GOTO lbl32
        while (true) {
            if ((v8 /* !! */  = (cfr_temp_2 = nz.tq - nz.kzdt("lack", kzdx(int ), (int)256)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v8 /* !! */  == nz.kzdt("lacl", kzdq(int ), (int)381)) break;
            v8 /* !! */  = (long)nz.kzdt("lacm", kzdq(int ), (int)382);
        }
        v9 = var0.toString();
        v10 /* !! */  = nz.tq;
        if (true) ** GOTO lbl84
        block63: while (true) {
            v10 /* !! */  = (long)(nz.kzdt("laco", kzdx(int ), (int)258) - nz.kzdt("lacn", kzdx(int ), (int)257));
lbl84:
            // 2 sources

            switch ((int)v10 /* !! */ ) {
                case 527367515: {
                    continue block63;
                }
                case 1293686697: {
                    break block63;
                }
            }
            break;
        }
        v11 = System.nanoTime();
        while (true) {
            if ((v12 /* !! */  = (cfr_temp_3 = nz.tq - nz.kzdt("lacp", kzdx(int ), (int)259)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v12 /* !! */  == nz.kzdt("lacq", kzdq(int ), (int)383)) break;
            v12 /* !! */  = (long)nz.kzdt("lacr", kzdq(int ), (int)384);
        }
        var3_6 = "swapAndUseSilent_" + v9 + "_" + v11;
        if (var5_4 || var5_4) ** GOTO lbl32
        while (true) {
            if ((v13 /* !! */  = (cfr_temp_4 = nz.tq - nz.kzdt("lacs", kzdx(int ), (int)260)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v13 /* !! */  == nz.kzdt("lact", kzdq(int ), (int)385)) break;
            v13 /* !! */  = (long)nz.kzdt("lacu", kzdq(int ), (int)386);
        }
        if (!var2_5.isHotbar()) ** GOTO lbl129
        if (var5_4) ** GOTO lbl32
        if (var6_3 /* !! */  == 0) ** GOTO lbl-1000
        block22 : switch (var6_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var5_4) ** GOTO lbl32
                while (true) {
                    if ((v14 /* !! */  = (cfr_temp_5 = nz.tq - nz.kzdt("lacv", kzdx(int ), (int)261)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v14 /* !! */  == nz.kzdt("lacw", kzdq(int ), (int)387)) break;
                    v14 /* !! */  = (long)nz.kzdt("lacx", kzdq(int ), (int)388);
                }
                v15 = (Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, lambda$swapAndUseSilent$2(ruhack.phobia.nu ), ()V)((nu)var2_5);
                v16 /* !! */  = nz.tq;
                if (true) ** GOTO lbl118
                block67: while (true) {
                    v16 /* !! */  = (long)(nz.kzdt("lacz", kzdx(int ), (int)263) - nz.kzdt("lacy", kzdx(int ), (int)262));
lbl118:
                    // 2 sources

                    switch ((int)v16 /* !! */ ) {
                        case -1745681614: {
                            continue block67;
                        }
                        case 1293686697: {
                            break block67;
                        }
                    }
                    break;
                }
                nz.queueSwapInstant(var3_6, var1_1, v15, null);
                if (var5_4) ** GOTO lbl32
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl158
            }
lbl129:
            // 1 sources

            if (var5_4 || var5_4) ** GOTO lbl32
            v17 /* !! */  = nz.tq;
            if (true) ** GOTO lbl134
            block68: while (true) {
                v17 /* !! */  = (long)(v18 - nz.kzdt("lada", kzdx(int ), (int)264));
lbl134:
                // 2 sources

                switch ((int)v17 /* !! */ ) {
                    case 1288833835: {
                        v18 = nz.kzdt("ladb", kzdx(int ), (int)265);
                        continue block68;
                    }
                    case 1293686697: {
                        break block68;
                    }
                    case 1701699807: {
                        v18 = nz.kzdt("ladc", kzdx(int ), (int)266);
                        continue block68;
                    }
                }
                break;
            }
            var4_7 = nv.currentSlot();
            if (var5_4 || var5_4) ** GOTO lbl32
            while (true) {
                if ((v19 /* !! */  = (cfr_temp_6 = nz.tq - nz.kzdt("ladd", kzdx(int ), (int)267)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                if (v19 /* !! */  == nz.kzdt("lade", kzdq(int ), (int)389)) break;
                v19 /* !! */  = (long)nz.kzdt("ladf", kzdq(int ), (int)390);
            }
            v20 = (Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, lambda$swapAndUseSilent$3(ruhack.phobia.nu int ), ()V)((nu)var2_5, (int)var4_7);
            while (true) {
                if ((v21 /* !! */  = (cfr_temp_7 = nz.tq - nz.kzdt("ladg", kzdx(int ), (int)268)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                if (v21 /* !! */  == nz.kzdt("ladh", kzdq(int ), (int)391)) break;
                v21 /* !! */  = (long)nz.kzdt("ladi", kzdq(int ), (int)392);
            }
            nz.queueSwapInstant(var3_6, var1_1, v20, null);
            if (var5_4) ** GOTO lbl32
lbl158:
            // 2 sources

            if (!var5_4 && !var5_4) ** break;
            ** continue;
            return;
lbl161:
            // 2 sources

            case 0: {
                var6_3 /* !! */  = (int)nz.kzdt("ladj", kzdq(int ), (int)393);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl222
            }
lbl166:
            // 2 sources

            case 1: {
                var6_3 /* !! */  = (int)nz.kzdt("ladk", kzdq(int ), (int)394);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl230
            }
lbl171:
            // 2 sources

            case 2: {
                var6_3 /* !! */  = (int)nz.kzdt("ladl", kzdq(int ), (int)395);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl218
            }
            case 3: {
                var6_3 /* !! */  = (int)nz.kzdt("ladm", kzdq(int ), (int)396);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl251
            }
lbl181:
            // 2 sources

            case 4: {
                var6_3 /* !! */  = (int)nz.kzdt("ladn", kzdq(int ), (int)397);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl218
            }
lbl186:
            // 2 sources

            case 5: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var6_3 /* !! */  = (int)nz.kzdt("lado", kzdq(int ), (int)398);
                    if (!var7_2) break block22;
                    throw null;
                }
            }
lbl191:
            // 2 sources

            case 6: {
                var6_3 /* !! */  = (int)nz.kzdt("ladp", kzdq(int ), (int)399);
                if (var7_2) {
                    throw null;
                }
            }
lbl195:
            // 4 sources

            case 7: {
                var6_3 /* !! */  = (int)nz.kzdt("ladq", kzdq(int ), (int)400);
                if (!var7_2) ** GOTO lbl171
                throw null;
            }
            case 8: {
                var6_3 /* !! */  = (int)nz.kzdt("ladr", kzdq(int ), (int)401);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl256
            }
            case 9: {
                var6_3 /* !! */  = (int)nz.kzdt("lads", kzdq(int ), (int)402);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl213
            }
lbl209:
            // 2 sources

            case 10: {
                var6_3 /* !! */  = (int)nz.kzdt("ladt", kzdq(int ), (int)403);
                if (!var7_2) ** GOTO lbl166
                throw null;
            }
lbl213:
            // 4 sources

            case 11: {
                var6_3 /* !! */  = (int)nz.kzdt("ladu", kzdq(int ), (int)404);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl256
            }
lbl218:
            // 3 sources

            case 12: {
                var6_3 /* !! */  = (int)nz.kzdt("ladv", kzdq(int ), (int)405);
                if (!var7_2) ** GOTO lbl161
                throw null;
            }
lbl222:
            // 2 sources

            case 13: {
                var6_3 /* !! */  = (int)nz.kzdt("ladw", kzdq(int ), (int)406);
                if (!var7_2) ** GOTO lbl213
                throw null;
            }
            case 14: {
                var6_3 /* !! */  = (int)nz.kzdt("ladx", kzdq(int ), (int)407);
                if (!var7_2) ** GOTO lbl209
                throw null;
            }
lbl230:
            // 2 sources

            case 15: {
                var6_3 /* !! */  = (int)nz.kzdt("lady", kzdq(int ), (int)408);
                if (!var7_2) ** GOTO lbl186
                throw null;
            }
            case 16: {
                var6_3 /* !! */  = (int)nz.kzdt("ladz", kzdq(int ), (int)409);
                if (!var7_2) ** GOTO lbl191
                throw null;
            }
            case 17: {
                var6_3 /* !! */  = (int)nz.kzdt("laea", kzdq(int ), (int)410);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl256
            }
            case 18: {
                var6_3 /* !! */  = (int)nz.kzdt("laeb", kzdq(int ), (int)411);
                if (!var7_2) ** GOTO lbl181
                throw null;
            }
            case 19: {
                var6_3 /* !! */  = (int)nz.kzdt("laec", kzdq(int ), (int)412);
                if (!var7_2) ** GOTO lbl213
                throw null;
            }
lbl251:
            // 2 sources

            case 20: {
                do {
                    var6_3 /* !! */  = (int)nz.kzdt("laed", kzdq(int ), (int)413);
                } while (!var7_2);
                throw null;
            }
lbl256:
            // 4 sources

            case 21: {
                var6_3 /* !! */  = (int)nz.kzdt("laee", kzdq(int ), (int)414);
                if (!var7_2) ** GOTO lbl195
                throw null;
            }
            case 22: 
        }
        var6_3 /* !! */  = (int)nz.kzdt("laef", kzdq(int ), (int)415);
        ** while (!var7_2)
lbl263:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static boolean isSwapRunning(String var0) {
        block64: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = nz.tq - nz.kzdt("kzko", kzdx(int ), (int)74)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v0 /* !! */  == nz.kzdt("kzkp", kzdq(int ), (int)99)) break;
                v0 /* !! */  = (long)nz.kzdt("kzkq", kzdq(int ), (int)100);
            }
            var3_1 = nz.c;
            while (true) {
                if ((v1 /* !! */  = (cfr_temp_1 = nz.tq - nz.kzdt("kzkr", kzdx(int ), (int)75)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v1 /* !! */  == nz.kzdt("kzks", kzdq(int ), (int)101)) break;
                v1 /* !! */  = (long)nz.kzdt("kzkt", kzdq(int ), (int)102);
            }
            var2_2 /* !! */  = nz.b;
            v2 /* !! */  = nz.tq;
            if (true) ** GOTO lbl19
            block42: while (true) {
                v2 /* !! */  = (long)(nz.kzdt("kzkv", kzdx(int ), (int)77) - nz.kzdt("kzku", kzdx(int ), (int)76));
lbl19:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case -1943269268: {
                        continue block42;
                    }
                    case 1293686697: {
                        break block42;
                    }
                }
                break;
            }
            var1_3 = nz.a;
            if (var3_1) {
                throw null;
lbl27:
                // 5 sources

                return (boolean)nz.kzdt("kzkw", kzdq(int ), (int)103);
            }
            if (var1_3 || var1_3) ** GOTO lbl27
            v3 /* !! */  = nz.tq;
            if (true) ** GOTO lbl34
            block44: while (true) {
                v3 /* !! */  = (long)(v4 - nz.kzdt("kzkx", kzdx(int ), (int)78));
lbl34:
                // 2 sources

                switch ((int)v3 /* !! */ ) {
                    case 740628121: {
                        v4 = nz.kzdt("kzky", kzdx(int ), (int)79);
                        continue block44;
                    }
                    case 1293686697: {
                        break block44;
                    }
                    case 2004974662: {
                        v4 = nz.kzdt("kzkz", kzdx(int ), (int)80);
                        continue block44;
                    }
                }
                break;
            }
            if (nz.currentSwap == null) break block64;
            if (var1_3) ** GOTO lbl27
            while (true) {
                if ((v5 /* !! */  = (cfr_temp_2 = nz.tq - nz.kzdt("kzla", kzdx(int ), (int)81)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v5 /* !! */  == nz.kzdt("kzlb", kzdq(int ), (int)104)) break;
                v5 /* !! */  = (long)nz.kzdt("kzlc", kzdq(int ), (int)105);
            }
            v6 /* !! */  = nz.tq;
            if (true) ** GOTO lbl55
            block46: while (true) {
                v6 /* !! */  = (long)(nz.kzdt("kzle", kzdx(int ), (int)83) - nz.kzdt("kzld", kzdx(int ), (int)82));
lbl55:
                // 2 sources

                switch ((int)v6 /* !! */ ) {
                    case -143001828: {
                        continue block46;
                    }
                    case 1293686697: {
                        break block46;
                    }
                }
                break;
            }
            v7 = nz.currentSwap.getId();
            v8 /* !! */  = nz.tq;
            if (true) ** GOTO lbl65
            block47: while (true) {
                v8 /* !! */  = (long)(v9 - nz.kzdt("kzlf", kzdx(int ), (int)84));
lbl65:
                // 2 sources

                switch ((int)v8 /* !! */ ) {
                    case -2109101267: {
                        v9 = nz.kzdt("kzlg", kzdx(int ), (int)85);
                        continue block47;
                    }
                    case -1556896873: {
                        v9 = nz.kzdt("kzlh", kzdx(int ), (int)86);
                        continue block47;
                    }
                    case 1293686697: {
                        break block47;
                    }
                }
                break;
            }
            if (!var0.equals(v7)) break block64;
            if (var1_3) ** GOTO lbl27
            v10 /* !! */  = nz.tq;
            if (true) ** GOTO lbl80
            block48: while (true) {
                v10 /* !! */  = (long)(nz.kzdt("kzlj", kzdx(int ), (int)88) - nz.kzdt("kzli", kzdx(int ), (int)87));
lbl80:
                // 2 sources

                switch ((int)v10 /* !! */ ) {
                    case 1158159938: {
                        continue block48;
                    }
                    case 1293686697: {
                        break block48;
                    }
                }
                break;
            }
            v11 /* !! */  = nz.tq;
            if (true) ** GOTO lbl89
            block49: while (true) {
                v11 /* !! */  = (long)(v12 - nz.kzdt("kzlk", kzdx(int ), (int)89));
lbl89:
                // 2 sources

                switch ((int)v11 /* !! */ ) {
                    case 1150871179: {
                        v12 = nz.kzdt("kzll", kzdx(int ), (int)90);
                        continue block49;
                    }
                    case 1173483752: {
                        v12 = nz.kzdt("kzlm", kzdx(int ), (int)91);
                        continue block49;
                    }
                    case 1293686697: {
                        break block49;
                    }
                    case 1875819119: {
                        v12 = nz.kzdt("kzln", kzdx(int ), (int)92);
                        continue block49;
                    }
                }
                break;
            }
            if (nz.currentSwap.isFinished()) break block64;
            if (var1_3) ** GOTO lbl27
            v13 = nz.kzdt("kzlo", kzdq(int ), (int)106);
            if (var3_1) {
                throw null;
            }
            ** GOTO lbl114
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var1_3 && !var1_3) ** break;
                ** continue;
                v13 = nz.kzdt("kzlp", kzdq(int ), (int)107);
lbl114:
                // 2 sources

                return (boolean)v13;
            }
            case 0: {
                do {
                    var2_2 /* !! */  = (int)nz.kzdt("kzlq", kzdq(int ), (int)108);
                } while (!var3_1);
                throw null;
            }
            case 1: {
                var2_2 /* !! */  = (int)nz.kzdt("kzlr", kzdq(int ), (int)109);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl138
            }
lbl125:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)nz.kzdt("kzls", kzdq(int ), (int)110);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl152
            }
lbl130:
            // 2 sources

            case 3: {
                var2_2 /* !! */  = (int)nz.kzdt("kzlt", kzdq(int ), (int)111);
                if (!var3_1) ** GOTO lbl125
                throw null;
            }
            case 4: {
                var2_2 /* !! */  = (int)nz.kzdt("kzlu", kzdq(int ), (int)112);
                if (!var3_1) break;
                throw null;
            }
lbl138:
            // 2 sources

            case 5: {
                var2_2 /* !! */  = (int)nz.kzdt("kzlv", kzdq(int ), (int)113);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl152
            }
lbl143:
            // 2 sources

            case 6: {
                var2_2 /* !! */  = (int)nz.kzdt("kzlw", kzdq(int ), (int)114);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl152
            }
            case 7: {
                var2_2 /* !! */  = (int)nz.kzdt("kzlx", kzdq(int ), (int)115);
                if (!var3_1) ** GOTO lbl130
                throw null;
            }
lbl152:
            // 4 sources

            case 8: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)nz.kzdt("kzly", kzdq(int ), (int)116);
                    if (!var3_1) ** GOTO lbl143
                    throw null;
                }
            }
            case 9: 
        }
        var2_2 /* !! */  = (int)nz.kzdt("kzlz", kzdq(int ), (int)117);
        ** while (!var3_1)
lbl160:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ void lambda$moveToHotbar$4(nu var0, int var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = nz.tq - nz.kzdt("lahy", kzdx(int ), (int)309)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == nz.kzdt("lahz", kzdq(int ), (int)472)) break;
            v0 /* !! */  = (long)nz.kzdt("laia", kzdq(int ), (int)473);
        }
        var4_2 = nz.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = nz.tq - nz.kzdt("laib", kzdx(int ), (int)310)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == nz.kzdt("laic", kzdq(int ), (int)474)) break;
            v1 /* !! */  = (long)nz.kzdt("laid", kzdq(int ), (int)475);
        }
        var3_3 /* !! */  = nz.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = nz.tq - nz.kzdt("laie", kzdx(int ), (int)311)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == nz.kzdt("laif", kzdq(int ), (int)476)) break;
            v2 /* !! */  = (long)nz.kzdt("laig", kzdq(int ), (int)477);
        }
        var2_4 = nz.a;
        if (var4_2) {
            throw null;
lbl21:
            // 2 sources

            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl21
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_3 = nz.tq - nz.kzdt("laih", kzdx(int ), (int)312)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == nz.kzdt("laii", kzdq(int ), (int)478)) break;
                    v3 /* !! */  = (long)nz.kzdt("laij", kzdq(int ), (int)479);
                }
                v4 = var0.slot();
                v5 /* !! */  = nz.tq;
                if (true) ** GOTO lbl37
                block18: while (true) {
                    v5 /* !! */  = (long)(v6 - nz.kzdt("laik", kzdx(int ), (int)313));
lbl37:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1244999298: {
                            v6 = nz.kzdt("lail", kzdx(int ), (int)314);
                            continue block18;
                        }
                        case 314235199: {
                            v6 = nz.kzdt("laim", kzdx(int ), (int)315);
                            continue block18;
                        }
                        case 1293686697: {
                            break block18;
                        }
                        case 1639323634: {
                            v6 = nz.kzdt("lain", kzdx(int ), (int)316);
                            continue block18;
                        }
                    }
                    break;
                }
                nv.swapHotbar(v4, var1_1);
                if (!var2_4) ** break;
                ** continue;
                return;
            }
lbl53:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)nz.kzdt("laio", kzdq(int ), (int)480);
                if (var4_2) {
                    throw null;
                }
            }
            case 1: {
                var3_3 /* !! */  = (int)nz.kzdt("laip", kzdq(int ), (int)481);
                if (!var4_2) break;
                throw null;
            }
lbl61:
            // 2 sources

            case 2: {
                var3_3 /* !! */  = (int)nz.kzdt("laiq", kzdq(int ), (int)482);
                if (!var4_2) ** GOTO lbl53
                throw null;
            }
            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)nz.kzdt("lair", kzdq(int ), (int)483);
                    if (!var4_2) ** GOTO lbl61
                    throw null;
                }
            }
            case 4: 
        }
        var3_3 /* !! */  = (int)nz.kzdt("lais", kzdq(int ), (int)484);
        ** while (!var4_2)
lbl73:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void cancelAll() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = nz.tq - nz.kzdt("kzpo", kzdx(int ), (int)111)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == nz.kzdt("kzpp", kzdq(int ), (int)192)) break;
            v0 /* !! */  = (long)nz.kzdt("kzpq", kzdq(int ), (int)193);
        }
        var4 = nz.c;
        v1 /* !! */  = nz.tq;
        if (true) ** GOTO lbl11
        block73: while (true) {
            v1 /* !! */  = (long)(nz.kzdt("kzps", kzdx(int ), (int)113) - nz.kzdt("kzpr", kzdx(int ), (int)112));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1413924915: {
                    continue block73;
                }
                case 1293686697: {
                    break block73;
                }
            }
            break;
        }
        var3_1 /* !! */  = nz.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = nz.tq - nz.kzdt("kzpt", kzdx(int ), (int)114)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == nz.kzdt("kzpu", kzdq(int ), (int)194)) break;
            v2 /* !! */  = (long)nz.kzdt("kzpv", kzdq(int ), (int)195);
        }
        var2_2 = nz.a;
        if (var4) {
            throw null;
lbl25:
            // 13 sources

            return;
        }
        if (var2_2 || var2_2) ** GOTO lbl25
        v3 /* !! */  = nz.tq;
        if (true) ** GOTO lbl32
        block76: while (true) {
            v3 /* !! */  = (long)(nz.kzdt("kzpx", kzdx(int ), (int)116) - nz.kzdt("kzpw", kzdx(int ), (int)115));
lbl32:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case 497149631: {
                    continue block76;
                }
                case 1293686697: {
                    break block76;
                }
            }
            break;
        }
        if (nz.currentSwap == null) ** GOTO lbl84
        if (var2_2 || var2_2) ** GOTO lbl25
        v4 /* !! */  = nz.tq;
        if (true) ** GOTO lbl43
        block77: while (true) {
            v4 /* !! */  = (long)(nz.kzdt("kzpz", kzdx(int ), (int)118) - nz.kzdt("kzpy", kzdx(int ), (int)117));
lbl43:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1652911587: {
                    continue block77;
                }
                case 1293686697: {
                    break block77;
                }
            }
            break;
        }
        v5 /* !! */  = nz.tq;
        if (true) ** GOTO lbl52
        block78: while (true) {
            v5 /* !! */  = (long)(v6 - nz.kzdt("kzqa", kzdx(int ), (int)119));
lbl52:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -875402587: {
                    v6 = nz.kzdt("kzqb", kzdx(int ), (int)120);
                    continue block78;
                }
                case 362101944: {
                    v6 = nz.kzdt("kzqc", kzdx(int ), (int)121);
                    continue block78;
                }
                case 1293686697: {
                    break block78;
                }
            }
            break;
        }
        nz.currentSwap.cancel();
        if (var3_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_2 || var2_2) ** GOTO lbl25
                v7 /* !! */  = nz.tq;
                if (true) ** GOTO lbl70
                block79: while (true) {
                    v7 /* !! */  = (long)(v8 - nz.kzdt("kzqd", kzdx(int ), (int)122));
lbl70:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -259180197: {
                            v8 = nz.kzdt("kzqe", kzdx(int ), (int)123);
                            continue block79;
                        }
                        case -7152061: {
                            v8 = nz.kzdt("kzqf", kzdx(int ), (int)124);
                            continue block79;
                        }
                        case 1293686697: {
                            break block79;
                        }
                        case 1488125589: {
                            v8 = nz.kzdt("kzqg", kzdx(int ), (int)125);
                            continue block79;
                        }
                    }
                    break;
                }
                nz.currentSwap = null;
                if (var2_2) ** GOTO lbl25
lbl84:
                // 2 sources

                if (var2_2 || var2_2) ** GOTO lbl25
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_2 = nz.tq - nz.kzdt("kzqh", kzdx(int ), (int)126)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == nz.kzdt("kzqi", kzdq(int ), (int)196)) break;
                    v9 /* !! */  = (long)nz.kzdt("kzqj", kzdq(int ), (int)197);
                }
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_3 = nz.tq - nz.kzdt("kzqk", kzdx(int ), (int)127)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == nz.kzdt("kzql", kzdq(int ), (int)198)) break;
                    v10 /* !! */  = (long)nz.kzdt("kzqm", kzdq(int ), (int)199);
                }
                var0_3 = nz.swapQueue.iterator();
                if (var2_2) ** GOTO lbl25
                do {
                    if (var2_2 || var2_2) ** GOTO lbl25
                    while (true) {
                        if ((v11 /* !! */  = (cfr_temp_4 = nz.tq - nz.kzdt("kzqn", kzdx(int ), (int)128)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                        if (v11 /* !! */  == nz.kzdt("kzqo", kzdq(int ), (int)200)) break;
                        v11 /* !! */  = (long)nz.kzdt("kzqp", kzdq(int ), (int)201);
                    }
                    if (!var0_3.hasNext()) ** GOTO lbl130
                    if (var2_2) ** GOTO lbl25
                    v12 /* !! */  = nz.tq;
                    if (true) ** GOTO lbl110
                    block84: while (true) {
                        v12 /* !! */  = (long)(v13 - nz.kzdt("kzqq", kzdx(int ), (int)129));
lbl110:
                        // 2 sources

                        switch ((int)v12 /* !! */ ) {
                            case -2014056357: {
                                v13 = nz.kzdt("kzqr", kzdx(int ), (int)130);
                                continue block84;
                            }
                            case 1293686697: {
                                break block84;
                            }
                            case 1872958985: {
                                v13 = nz.kzdt("kzqs", kzdx(int ), (int)131);
                                continue block84;
                            }
                        }
                        break;
                    }
                    var1_4 = var0_3.next();
                    if (var2_2 || var2_2) ** GOTO lbl25
                    while (true) {
                        if ((v14 /* !! */  = (cfr_temp_5 = nz.tq - nz.kzdt("kzqt", kzdx(int ), (int)132)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                        if (v14 /* !! */  == nz.kzdt("kzqu", kzdq(int ), (int)202)) break;
                        v14 /* !! */  = (long)nz.kzdt("kzqv", kzdq(int ), (int)203);
                    }
                    var1_4.cancel();
                    if (var2_2 || var2_2) ** GOTO lbl25
                } while (!var4);
                throw null;
lbl130:
                // 1 sources

                if (var2_2 || var2_2) ** GOTO lbl25
                v15 /* !! */  = nz.tq;
                if (true) ** GOTO lbl135
                block86: while (true) {
                    v15 /* !! */  = (long)(v16 - nz.kzdt("kzqw", kzdx(int ), (int)133));
lbl135:
                    // 2 sources

                    switch ((int)v15 /* !! */ ) {
                        case -2077354029: {
                            v16 = nz.kzdt("kzqx", kzdx(int ), (int)134);
                            continue block86;
                        }
                        case -684183315: {
                            v16 = nz.kzdt("kzqy", kzdx(int ), (int)135);
                            continue block86;
                        }
                        case 1293686697: {
                            break block86;
                        }
                        case 2058992273: {
                            v16 = nz.kzdt("kzqz", kzdx(int ), (int)136);
                            continue block86;
                        }
                    }
                    break;
                }
                v17 /* !! */  = nz.tq;
                if (true) ** GOTO lbl151
                block87: while (true) {
                    v17 /* !! */  = (long)(v18 - nz.kzdt("kzra", kzdx(int ), (int)137));
lbl151:
                    // 2 sources

                    switch ((int)v17 /* !! */ ) {
                        case -1155636697: {
                            v18 = nz.kzdt("kzrb", kzdx(int ), (int)138);
                            continue block87;
                        }
                        case -130650888: {
                            v18 = nz.kzdt("kzrc", kzdx(int ), (int)139);
                            continue block87;
                        }
                        case 871154159: {
                            v18 = nz.kzdt("kzrd", kzdx(int ), (int)140);
                            continue block87;
                        }
                        case 1293686697: {
                            break block87;
                        }
                    }
                    break;
                }
                nz.swapQueue.clear();
                if (var2_2 || var2_2) ** GOTO lbl25
                while (true) {
                    if ((v19 /* !! */  = (cfr_temp_6 = nz.tq - nz.kzdt("kzre", kzdx(int ), (int)141)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v19 /* !! */  == nz.kzdt("kzrf", kzdq(int ), (int)204)) break;
                    v19 /* !! */  = (long)nz.kzdt("kzrg", kzdq(int ), (int)205);
                }
                v20 /* !! */  = nz.tq;
                if (true) ** GOTO lbl174
                block89: while (true) {
                    v20 /* !! */  = (long)(nz.kzdt("kzri", kzdx(int ), (int)143) - nz.kzdt("kzrh", kzdx(int ), (int)142));
lbl174:
                    // 2 sources

                    switch ((int)v20 /* !! */ ) {
                        case 538042975: {
                            continue block89;
                        }
                        case 1293686697: {
                            break block89;
                        }
                    }
                    break;
                }
                nz.swapRegistry.clear();
                if (!var2_2 && !var2_2) ** break;
                ** continue;
                return;
            }
lbl183:
            // 2 sources

            case 0: {
                var3_1 /* !! */  = (int)nz.kzdt("kzrj", kzdq(int ), (int)206);
                if (var4) {
                    throw null;
                }
                ** GOTO lbl275
            }
            case 1: {
                var3_1 /* !! */  = (int)nz.kzdt("kzrk", kzdq(int ), (int)207);
                if (var4) {
                    throw null;
                }
                ** GOTO lbl208
            }
            case 2: {
                var3_1 /* !! */  = (int)nz.kzdt("kzrl", kzdq(int ), (int)208);
                if (var4) {
                    throw null;
                }
                ** GOTO lbl263
            }
            case 3: {
                var3_1 /* !! */  = (int)nz.kzdt("kzrm", kzdq(int ), (int)209);
                if (var4) {
                    throw null;
                }
                ** GOTO lbl291
            }
lbl203:
            // 2 sources

            case 4: {
                var3_1 /* !! */  = (int)nz.kzdt("kzrn", kzdq(int ), (int)210);
                if (var4) {
                    throw null;
                }
                ** GOTO lbl213
            }
lbl208:
            // 2 sources

            case 5: {
                var3_1 /* !! */  = (int)nz.kzdt("kzro", kzdq(int ), (int)211);
                if (var4) {
                    throw null;
                }
                ** GOTO lbl271
            }
lbl213:
            // 3 sources

            case 6: {
                var3_1 /* !! */  = (int)nz.kzdt("kzrp", kzdq(int ), (int)212);
                if (var4) {
                    throw null;
                }
                ** GOTO lbl232
            }
lbl218:
            // 2 sources

            case 7: {
                var3_1 /* !! */  = (int)nz.kzdt("kzrq", kzdq(int ), (int)213);
                if (var4) {
                    throw null;
                }
                ** GOTO lbl275
            }
lbl223:
            // 3 sources

            case 8: {
                var3_1 /* !! */  = (int)nz.kzdt("kzrr", kzdq(int ), (int)214);
                if (!var4) ** GOTO lbl203
                throw null;
            }
            case 9: {
                var3_1 /* !! */  = (int)nz.kzdt("kzrs", kzdq(int ), (int)215);
                if (var4) {
                    throw null;
                }
                ** GOTO lbl259
            }
lbl232:
            // 3 sources

            case 10: {
                var3_1 /* !! */  = (int)nz.kzdt("kzrt", kzdq(int ), (int)216);
                if (var4) {
                    throw null;
                }
                ** GOTO lbl241
            }
lbl237:
            // 2 sources

            case 11: {
                var3_1 /* !! */  = (int)nz.kzdt("kzru", kzdq(int ), (int)217);
                if (!var4) ** GOTO lbl213
                throw null;
            }
lbl241:
            // 2 sources

            case 12: {
                var3_1 /* !! */  = (int)nz.kzdt("kzrv", kzdq(int ), (int)218);
                if (var4) {
                    throw null;
                }
                ** GOTO lbl287
            }
lbl246:
            // 2 sources

            case 13: {
                var3_1 /* !! */  = (int)nz.kzdt("kzrw", kzdq(int ), (int)219);
                if (!var4) ** GOTO lbl223
                throw null;
            }
lbl250:
            // 2 sources

            case 14: {
                var3_1 /* !! */  = (int)nz.kzdt("kzrx", kzdq(int ), (int)220);
                if (!var4) break;
                throw null;
            }
lbl254:
            // 2 sources

            case 15: {
                var3_1 /* !! */  = (int)nz.kzdt("kzry", kzdq(int ), (int)221);
                if (var4) {
                    throw null;
                }
                ** GOTO lbl275
            }
lbl259:
            // 2 sources

            case 16: {
                var3_1 /* !! */  = (int)nz.kzdt("kzrz", kzdq(int ), (int)222);
                if (!var4) ** GOTO lbl246
                throw null;
            }
lbl263:
            // 2 sources

            case 17: {
                var3_1 /* !! */  = (int)nz.kzdt("kzsa", kzdq(int ), (int)223);
                if (!var4) ** GOTO lbl250
                throw null;
            }
            case 18: {
                var3_1 /* !! */  = (int)nz.kzdt("kzsb", kzdq(int ), (int)224);
                if (!var4) ** GOTO lbl223
                throw null;
            }
lbl271:
            // 2 sources

            case 19: {
                var3_1 /* !! */  = (int)nz.kzdt("kzsc", kzdq(int ), (int)225);
                if (!var4) ** GOTO lbl237
                throw null;
            }
lbl275:
            // 4 sources

            case 20: {
                var3_1 /* !! */  = (int)nz.kzdt("kzsd", kzdq(int ), (int)226);
                if (!var4) ** GOTO lbl218
                throw null;
            }
            case 21: {
                var3_1 /* !! */  = (int)nz.kzdt("kzse", kzdq(int ), (int)227);
                if (!var4) ** GOTO lbl254
                throw null;
            }
            case 22: {
                var3_1 /* !! */  = (int)nz.kzdt("kzsf", kzdq(int ), (int)228);
                if (!var4) ** GOTO lbl232
                throw null;
            }
lbl287:
            // 2 sources

            case 23: {
                var3_1 /* !! */  = (int)nz.kzdt("kzsg", kzdq(int ), (int)229);
                if (!var4) ** GOTO lbl183
                throw null;
            }
lbl291:
            // 2 sources

            case 24: {
                var3_1 /* !! */  = (int)nz.kzdt("kzsh", kzdq(int ), (int)230);
                if (!var4) break;
                throw null;
            }
            case 25: 
        }
        do {
            var3_1 /* !! */  = (int)nz.kzdt("kzsi", kzdq(int ), (int)231);
        } while (!var4);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static int getQueueSize() {
        v0 /* !! */  = nz.tq;
        if (true) ** GOTO lbl5
        block37: while (true) {
            v0 /* !! */  = (long)(v1 - nz.kzdt("kzsj", kzdx(int ), (int)144));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1026857681: {
                    v1 = nz.kzdt("kzsk", kzdx(int ), (int)145);
                    continue block37;
                }
                case 454827421: {
                    v1 = nz.kzdt("kzsl", kzdx(int ), (int)146);
                    continue block37;
                }
                case 743797398: {
                    v1 = nz.kzdt("kzsm", kzdx(int ), (int)147);
                    continue block37;
                }
                case 1293686697: {
                    break block37;
                }
            }
            break;
        }
        var3 = nz.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = nz.tq - nz.kzdt("kzsn", kzdx(int ), (int)148)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == nz.kzdt("kzso", kzdq(int ), (int)232)) break;
            v2 /* !! */  = (long)nz.kzdt("kzsp", kzdq(int ), (int)233);
        }
        var2_1 /* !! */  = nz.b;
        v3 /* !! */  = nz.tq;
        if (true) ** GOTO lbl29
        block39: while (true) {
            v3 /* !! */  = (long)(v4 - nz.kzdt("kzsq", kzdx(int ), (int)149));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1065439232: {
                    v4 = nz.kzdt("kzsr", kzdx(int ), (int)150);
                    continue block39;
                }
                case -842520186: {
                    v4 = nz.kzdt("kzss", kzdx(int ), (int)151);
                    continue block39;
                }
                case 1293686697: {
                    break block39;
                }
            }
            break;
        }
        var1_2 = nz.a;
        if (var3) {
            throw null;
lbl41:
            // 7 sources

            return (int)nz.kzdt("kzst", kzdq(int ), (int)234);
        }
        if (var1_2 || var1_2) ** GOTO lbl41
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_1 = nz.tq - nz.kzdt("kzsu", kzdx(int ), (int)152)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v5 /* !! */  == nz.kzdt("kzsv", kzdq(int ), (int)235)) break;
            v5 /* !! */  = (long)nz.kzdt("kzsw", kzdq(int ), (int)236);
        }
        v6 /* !! */  = nz.tq;
        if (true) ** GOTO lbl54
        block42: while (true) {
            v6 /* !! */  = (long)(v7 - nz.kzdt("kzsx", kzdx(int ), (int)153));
lbl54:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case -1114727567: {
                    v7 = nz.kzdt("kzsy", kzdx(int ), (int)154);
                    continue block42;
                }
                case 486518717: {
                    v7 = nz.kzdt("kzsz", kzdx(int ), (int)155);
                    continue block42;
                }
                case 821919967: {
                    v7 = nz.kzdt("kzta", kzdx(int ), (int)156);
                    continue block42;
                }
                case 1293686697: {
                    break block42;
                }
            }
            break;
        }
        var0_3 = nz.swapQueue.size();
        if (var1_2 || var1_2) ** GOTO lbl41
        v8 /* !! */  = nz.tq;
        if (true) ** GOTO lbl72
        block43: while (true) {
            v8 /* !! */  = (long)(v9 - nz.kzdt("kztb", kzdx(int ), (int)157));
lbl72:
            // 2 sources

            switch ((int)v8 /* !! */ ) {
                case 137630626: {
                    v9 = nz.kzdt("kztc", kzdx(int ), (int)158);
                    continue block43;
                }
                case 420081921: {
                    v9 = nz.kzdt("kztd", kzdx(int ), (int)159);
                    continue block43;
                }
                case 883924975: {
                    v9 = nz.kzdt("kzte", kzdx(int ), (int)160);
                    continue block43;
                }
                case 1293686697: {
                    break block43;
                }
            }
            break;
        }
        if (nz.currentSwap == null) ** GOTO lbl106
        if (var1_2) ** GOTO lbl41
        while (true) {
            if ((v10 /* !! */  = (cfr_temp_2 = nz.tq - nz.kzdt("kztf", kzdx(int ), (int)161)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v10 /* !! */  == nz.kzdt("kztg", kzdq(int ), (int)237)) break;
            v10 /* !! */  = (long)nz.kzdt("kzth", kzdq(int ), (int)238);
        }
        while (true) {
            if ((v11 /* !! */  = (cfr_temp_3 = nz.tq - nz.kzdt("kzti", kzdx(int ), (int)162)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v11 /* !! */  == nz.kzdt("kztj", kzdq(int ), (int)239)) break;
            v11 /* !! */  = (long)nz.kzdt("kztk", kzdq(int ), (int)240);
        }
        if (nz.currentSwap.isFinished()) ** GOTO lbl106
        if (var1_2) ** GOTO lbl41
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_2) ** GOTO lbl41
                ++var0_3;
                if (var1_2) ** GOTO lbl41
lbl106:
                // 3 sources

                if (!var1_2 && !var1_2) ** break;
                ** continue;
                return var0_3;
            }
lbl109:
            // 3 sources

            case 0: {
                var2_1 /* !! */  = (int)nz.kzdt("kztl", kzdq(int ), (int)241);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl124
            }
            case 1: {
                var2_1 /* !! */  = (int)nz.kzdt("kztm", kzdq(int ), (int)242);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl124
            }
lbl119:
            // 3 sources

            case 2: {
                var2_1 /* !! */  = (int)nz.kzdt("kztn", kzdq(int ), (int)243);
                if (var3) {
                    throw null;
                }
                ** GOTO lbl133
            }
lbl124:
            // 4 sources

            case 3: {
                var2_1 /* !! */  = (int)nz.kzdt("kzto", kzdq(int ), (int)244);
                if (!var3) ** GOTO lbl109
                throw null;
            }
            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)nz.kzdt("kztp", kzdq(int ), (int)245);
                    if (!var3) ** GOTO lbl109
                    throw null;
                }
            }
lbl133:
            // 3 sources

            case 5: {
                var2_1 /* !! */  = (int)nz.kzdt("kztq", kzdq(int ), (int)246);
                if (!var3) ** GOTO lbl119
                throw null;
            }
lbl137:
            // 2 sources

            case 6: {
                var2_1 /* !! */  = (int)nz.kzdt("kztr", kzdq(int ), (int)247);
                if (!var3) ** GOTO lbl133
                throw null;
            }
lbl141:
            // 2 sources

            case 7: {
                var2_1 /* !! */  = (int)nz.kzdt("kzts", kzdq(int ), (int)248);
                if (!var3) ** GOTO lbl137
                throw null;
            }
            case 8: {
                var2_1 /* !! */  = (int)nz.kzdt("kztt", kzdq(int ), (int)249);
                if (!var3) ** GOTO lbl141
                throw null;
            }
            case 9: {
                var2_1 /* !! */  = (int)nz.kzdt("kztu", kzdq(int ), (int)250);
                if (!var3) ** GOTO lbl124
                throw null;
            }
            case 10: {
                var2_1 /* !! */  = (int)nz.kzdt("kztv", kzdq(int ), (int)251);
                if (!var3) ** GOTO lbl119
                throw null;
            }
            case 11: 
        }
        var2_1 /* !! */  = (int)nz.kzdt("kztw", kzdq(int ), (int)252);
        ** while (!var3)
lbl160:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void cancelSwap(String var0) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = nz.tq - nz.kzdt("kzgw", kzdx(int ), (int)32)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == nz.kzdt("kzgx", kzdq(int ), (int)45)) break;
            v0 /* !! */  = (long)nz.kzdt("kzgy", kzdq(int ), (int)46);
        }
        var4_1 = nz.c;
        v1 /* !! */  = nz.tq;
        if (true) ** GOTO lbl12
        block60: while (true) {
            v1 /* !! */  = (long)(v2 - nz.kzdt("kzgz", kzdx(int ), (int)33));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -225457729: {
                    v2 = nz.kzdt("kzha", kzdx(int ), (int)34);
                    continue block60;
                }
                case 1293686697: {
                    break block60;
                }
                case 1433986698: {
                    v2 = nz.kzdt("kzhb", kzdx(int ), (int)35);
                    continue block60;
                }
            }
            break;
        }
        var3_2 /* !! */  = nz.b;
        v3 /* !! */  = nz.tq;
        if (true) ** GOTO lbl26
        block61: while (true) {
            v3 /* !! */  = (long)(nz.kzdt("kzhd", kzdx(int ), (int)37) - nz.kzdt("kzhc", kzdx(int ), (int)36));
lbl26:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1750467241: {
                    continue block61;
                }
                case 1293686697: {
                    break block61;
                }
            }
            break;
        }
        var2_3 = nz.a;
        if (var4_1) {
            throw null;
lbl34:
            // 9 sources

            return;
        }
        if (var2_3) ** GOTO lbl34
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_3) ** GOTO lbl34
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_1 = nz.tq - nz.kzdt("kzhe", kzdx(int ), (int)38)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == nz.kzdt("kzhf", kzdq(int ), (int)47)) break;
                    v4 /* !! */  = (long)nz.kzdt("kzhg", kzdq(int ), (int)48);
                }
                v5 /* !! */  = nz.tq;
                if (true) ** GOTO lbl51
                block64: while (true) {
                    v5 /* !! */  = (long)(nz.kzdt("kzhi", kzdx(int ), (int)40) - nz.kzdt("kzhh", kzdx(int ), (int)39));
lbl51:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -867840852: {
                            continue block64;
                        }
                        case 1293686697: {
                            break block64;
                        }
                    }
                    break;
                }
                var1_4 = nz.swapRegistry.remove(var0);
                if (var2_3 || var2_3) ** GOTO lbl34
                if (var1_4 == null) ** GOTO lbl139
                if (var2_3 || var2_3) ** GOTO lbl34
                v6 /* !! */  = nz.tq;
                if (true) ** GOTO lbl64
                block65: while (true) {
                    v6 /* !! */  = (long)(nz.kzdt("kzhk", kzdx(int ), (int)42) - nz.kzdt("kzhj", kzdx(int ), (int)41));
lbl64:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case 480927939: {
                            continue block65;
                        }
                        case 1293686697: {
                            break block65;
                        }
                    }
                    break;
                }
                var1_4.cancel();
                if (var2_3 || var2_3) ** GOTO lbl34
                v7 /* !! */  = nz.tq;
                if (true) ** GOTO lbl75
                block66: while (true) {
                    v7 /* !! */  = (long)(v8 - nz.kzdt("kzhl", kzdx(int ), (int)43));
lbl75:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -1966383406: {
                            v8 = nz.kzdt("kzhm", kzdx(int ), (int)44);
                            continue block66;
                        }
                        case -924345927: {
                            v8 = nz.kzdt("kzhn", kzdx(int ), (int)45);
                            continue block66;
                        }
                        case 1293686697: {
                            break block66;
                        }
                        case 1540244518: {
                            v8 = nz.kzdt("kzho", kzdx(int ), (int)46);
                            continue block66;
                        }
                    }
                    break;
                }
                v9 /* !! */  = nz.tq;
                if (true) ** GOTO lbl91
                block67: while (true) {
                    v9 /* !! */  = (long)(v10 - nz.kzdt("kzhp", kzdx(int ), (int)47));
lbl91:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -1998665672: {
                            v10 = nz.kzdt("kzhq", kzdx(int ), (int)48);
                            continue block67;
                        }
                        case -1040648830: {
                            v10 = nz.kzdt("kzhr", kzdx(int ), (int)49);
                            continue block67;
                        }
                        case -248641996: {
                            v10 = nz.kzdt("kzhs", kzdx(int ), (int)50);
                            continue block67;
                        }
                        case 1293686697: {
                            break block67;
                        }
                    }
                    break;
                }
                nz.swapQueue.remove(var1_4);
                if (var2_3 || var2_3) ** GOTO lbl34
                v11 /* !! */  = nz.tq;
                if (true) ** GOTO lbl110
                block68: while (true) {
                    v11 /* !! */  = (long)(v12 - nz.kzdt("kzht", kzdx(int ), (int)51));
lbl110:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case 1098325886: {
                            v12 = nz.kzdt("kzhu", kzdx(int ), (int)52);
                            continue block68;
                        }
                        case 1293686697: {
                            break block68;
                        }
                        case 1557601763: {
                            v12 = nz.kzdt("kzhv", kzdx(int ), (int)53);
                            continue block68;
                        }
                        case 2095283527: {
                            v12 = nz.kzdt("kzhw", kzdx(int ), (int)54);
                            continue block68;
                        }
                    }
                    break;
                }
                if (nz.currentSwap != var1_4) ** GOTO lbl139
                if (var2_3 || var2_3) ** GOTO lbl34
                v13 /* !! */  = nz.tq;
                if (true) ** GOTO lbl128
                block69: while (true) {
                    v13 /* !! */  = (long)(v14 - nz.kzdt("kzhx", kzdx(int ), (int)55));
lbl128:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case 1293686697: {
                            break block69;
                        }
                        case 1331961304: {
                            v14 = nz.kzdt("kzhy", kzdx(int ), (int)56);
                            continue block69;
                        }
                        case 1503749581: {
                            v14 = nz.kzdt("kzhz", kzdx(int ), (int)57);
                            continue block69;
                        }
                    }
                    break;
                }
                nz.currentSwap = null;
                if (var2_3) ** GOTO lbl34
lbl139:
                // 3 sources

                if (!var2_3 && !var2_3) ** break;
                ** continue;
                return;
            }
lbl142:
            // 2 sources

            case 0: {
                var3_2 /* !! */  = (int)nz.kzdt("kzia", kzdq(int ), (int)49);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl172
            }
            case 1: {
                var3_2 /* !! */  = (int)nz.kzdt("kzib", kzdq(int ), (int)50);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl198
            }
            case 2: {
                var3_2 /* !! */  = (int)nz.kzdt("kzic", kzdq(int ), (int)51);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl211
            }
            case 3: {
                var3_2 /* !! */  = (int)nz.kzdt("kzid", kzdq(int ), (int)52);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl180
            }
lbl162:
            // 3 sources

            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_2 /* !! */  = (int)nz.kzdt("kzie", kzdq(int ), (int)53);
                    if (var4_1) {
                        throw null;
                    }
                    ** GOTO lbl176
                    break;
                }
            }
lbl168:
            // 4 sources

            case 5: {
                var3_2 /* !! */  = (int)nz.kzdt("kzif", kzdq(int ), (int)54);
                if (!var4_1) break;
                throw null;
            }
lbl172:
            // 2 sources

            case 6: {
                var3_2 /* !! */  = (int)nz.kzdt("kzig", kzdq(int ), (int)55);
                if (!var4_1) ** GOTO lbl142
                throw null;
            }
lbl176:
            // 3 sources

            case 7: {
                var3_2 /* !! */  = (int)nz.kzdt("kzih", kzdq(int ), (int)56);
                if (!var4_1) ** GOTO lbl162
                throw null;
            }
lbl180:
            // 2 sources

            case 8: {
                var3_2 /* !! */  = (int)nz.kzdt("kzii", kzdq(int ), (int)57);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl198
            }
            case 9: {
                var3_2 /* !! */  = (int)nz.kzdt("kzij", kzdq(int ), (int)58);
                if (!var4_1) ** GOTO lbl176
                throw null;
            }
            case 10: {
                var3_2 /* !! */  = (int)nz.kzdt("kzik", kzdq(int ), (int)59);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl198
            }
            case 11: {
                var3_2 /* !! */  = (int)nz.kzdt("kzil", kzdq(int ), (int)60);
                if (!var4_1) ** GOTO lbl168
                throw null;
            }
lbl198:
            // 4 sources

            case 12: {
                var3_2 /* !! */  = (int)nz.kzdt("kzim", kzdq(int ), (int)61);
                if (!var4_1) ** GOTO lbl168
                throw null;
            }
            case 13: {
                var3_2 /* !! */  = (int)nz.kzdt("kzin", kzdq(int ), (int)62);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl211
            }
            case 14: {
                var3_2 /* !! */  = (int)nz.kzdt("kzio", kzdq(int ), (int)63);
                if (!var4_1) ** GOTO lbl162
                throw null;
            }
lbl211:
            // 3 sources

            case 15: {
                var3_2 /* !! */  = (int)nz.kzdt("kzip", kzdq(int ), (int)64);
                if (!var4_1) ** GOTO lbl168
                throw null;
            }
            case 16: 
        }
        var3_2 /* !! */  = (int)nz.kzdt("kziq", kzdq(int ), (int)65);
        ** while (!var4_1)
lbl218:
        // 1 sources

        throw null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean anySwapRunning() {
        CallSite callSite;
        boolean bl2;
        block17: {
            while (true) {
                long l2;
                Object object;
                if ((object = (l2 = tq - nz.kzdt("kzjk", kzdx(int ), (int)68)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
                if (object == nz.kzdt("kzjl", kzdq(int ), (int)75)) break;
                object = nz.kzdt("kzjm", kzdq(int ), (int)76);
            }
            boolean bl3 = c;
            while (true) {
                long l3;
                Object object;
                if ((object = (l3 = tq - nz.kzdt("kzjn", kzdx(int ), (int)69)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
                if (object == nz.kzdt("kzjo", kzdq(int ), (int)77)) break;
                object = nz.kzdt("kzjp", kzdq(int ), (int)78);
            }
            int n2 = b;
            while (true) {
                long l4;
                Object object;
                if ((object = (l4 = tq - nz.kzdt("kzjq", kzdx(int ), (int)70)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
                if (object == nz.kzdt("kzjr", kzdq(int ), (int)79)) {
                    bl2 = a;
                    if (bl3) {
                        throw null;
                    }
                    break;
                }
                object = nz.kzdt("kzjs", kzdq(int ), (int)80);
            }
            if (bl2 || bl2) return (boolean)nz.kzdt("kzjt", kzdq(int ), (int)81);
            while (true) {
                long l5;
                Object object;
                if ((object = (l5 = tq - nz.kzdt("kzju", kzdx(int ), (int)71)) == 0L ? 0 : (l5 < 0L ? -1 : 1)) == false) continue;
                if (object == nz.kzdt("kzjv", kzdq(int ), (int)82)) {
                    if (currentSwap != null) {
                        break;
                    }
                    break block17;
                }
                object = nz.kzdt("kzjw", kzdq(int ), (int)83);
            }
            if (bl2) return (boolean)nz.kzdt("kzjt", kzdq(int ), (int)81);
            while (true) {
                long l6;
                Object object;
                if ((object = (l6 = tq - nz.kzdt("kzjx", kzdx(int ), (int)72)) == 0L ? 0 : (l6 < 0L ? -1 : 1)) == false) continue;
                if (object == nz.kzdt("kzjy", kzdq(int ), (int)84)) break;
                object = nz.kzdt("kzjz", kzdq(int ), (int)85);
            }
            while (true) {
                long l7;
                Object object;
                if ((object = (l7 = tq - nz.kzdt("kzka", kzdx(int ), (int)73)) == 0L ? 0 : (l7 < 0L ? -1 : 1)) == false) continue;
                if (object == nz.kzdt("kzkb", kzdq(int ), (int)86)) {
                    if (!currentSwap.isFinished()) {
                        break;
                    }
                    break block17;
                }
                object = nz.kzdt("kzkc", kzdq(int ), (int)87);
            }
            if (bl2) return (boolean)nz.kzdt("kzjt", kzdq(int ), (int)81);
            callSite = nz.kzdt("kzkd", kzdq(int ), (int)88);
            if (!bl3) return (boolean)callSite;
            throw null;
        }
        if (bl2 || bl2) {
            return (boolean)nz.kzdt("kzjt", kzdq(int ), (int)81);
        }
        callSite = nz.kzdt("kzke", kzdq(int ), (int)89);
        return (boolean)callSite;
    }

    private static /* synthetic */ long kzdx(int n2) {
        return kzdy[n2] ^ kzdz[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void swapAndUse(class_1792 var0) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = nz.tq - nz.kzdt("kzxu", kzdx(int ), (int)203)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == nz.kzdt("kzxv", kzdq(int ), (int)314)) break;
            v0 /* !! */  = (long)nz.kzdt("kzxw", kzdq(int ), (int)315);
        }
        var3_1 = nz.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = nz.tq - nz.kzdt("kzxx", kzdx(int ), (int)204)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == nz.kzdt("kzxy", kzdq(int ), (int)316)) break;
            v1 /* !! */  = (long)nz.kzdt("kzxz", kzdq(int ), (int)317);
        }
        var2_2 /* !! */  = nz.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = nz.tq - nz.kzdt("kzya", kzdx(int ), (int)205)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == nz.kzdt("kzyb", kzdq(int ), (int)318)) break;
            v2 /* !! */  = (long)nz.kzdt("kzyc", kzdq(int ), (int)319);
        }
        var1_3 = nz.a;
        if (!var3_1) ** GOTO lbl25
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
lbl25:
                // 1 sources

                if (var1_3 || var1_3) ** GOTO lbl-1000
                v3 = nz.kzdt("kzyd", kzdq(int ), (int)320);
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_3 = nz.tq - nz.kzdt("kzye", kzdx(int ), (int)206)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == nz.kzdt("kzyf", kzdq(int ), (int)321)) break;
                    v4 /* !! */  = (long)nz.kzdt("kzyg", kzdq(int ), (int)322);
                }
                nz.swapAndUse(var0, (int)v3);
                if (var1_3 || var1_3) continue block11;
                return;
                case 0: {
                    var2_2 /* !! */  = (int)nz.kzdt("kzyh", kzdq(int ), (int)323);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 1: {
                    do {
                        var2_2 /* !! */  = (int)nz.kzdt("kzyi", kzdq(int ), (int)324);
                    } while (!var3_1);
                    throw null;
                }
                case 2: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var2_2 /* !! */  = (int)nz.kzdt("kzyj", kzdq(int ), (int)325);
                        if (!var3_1) break block11;
                        throw null;
                    }
                }
                case 3: {
                    do {
                        var2_2 /* !! */  = (int)nz.kzdt("kzyk", kzdq(int ), (int)326);
                    } while (!var3_1);
                    throw null;
                }
                case 4: {
                    do {
                        var2_2 /* !! */  = (int)nz.kzdt("kzyl", kzdq(int ), (int)327);
                    } while (!var3_1);
                    throw null;
                }
                case 5: 
            }
        }
        var2_2 /* !! */  = (int)nz.kzdt("kzym", kzdq(int ), (int)328);
        ** while (!var3_1)
lbl62:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static boolean queueSwapInstant(String var0, int var1_1, Runnable var2_2, Runnable var3_3) {
        v0 /* !! */  = nz.tq;
        if (true) ** GOTO lbl5
        block22: while (true) {
            v0 /* !! */  = (long)(v1 - nz.kzdt("kzfx", kzdx(int ), (int)19));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -231209387: {
                    v1 = nz.kzdt("kzfy", kzdx(int ), (int)20);
                    continue block22;
                }
                case 318724187: {
                    v1 = nz.kzdt("kzfz", kzdx(int ), (int)21);
                    continue block22;
                }
                case 1293686697: {
                    break block22;
                }
                case 1474174665: {
                    v1 = nz.kzdt("kzga", kzdx(int ), (int)22);
                    continue block22;
                }
            }
            break;
        }
        var6_4 = nz.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = nz.tq - nz.kzdt("kzgb", kzdx(int ), (int)23)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == nz.kzdt("kzgc", kzdq(int ), (int)33)) break;
            v2 /* !! */  = (long)nz.kzdt("kzgd", kzdq(int ), (int)34);
        }
        var5_5 /* !! */  = nz.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = nz.tq - nz.kzdt("kzge", kzdx(int ), (int)24)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == nz.kzdt("kzgf", kzdq(int ), (int)35)) {
                var4_6 = nz.a;
                if (var6_4) {
                    throw null;
                }
                break;
            }
            v3 /* !! */  = (long)nz.kzdt("kzgg", kzdq(int ), (int)36);
        }
        if (var4_6 != false) return (boolean)nz.kzdt("kzgh", kzdq(int ), (int)37);
        if (var5_5 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_5 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_6 != false) return (boolean)nz.kzdt("kzgh", kzdq(int ), (int)37);
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = nz.tq - nz.kzdt("kzgi", kzdx(int ), (int)25)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  != nz.kzdt("kzgj", kzdq(int ), (int)38)) ** GOTO lbl45
                    v5 = oc.instant();
                    v6 = nz.kzdt("kzgl", kzdq(int ), (int)40);
                    v7 /* !! */  = nz.tq;
                    if (true) ** GOTO lbl67
lbl45:
                    // 1 sources

                    v4 /* !! */  = (long)nz.kzdt("kzgk", kzdq(int ), (int)39);
                }
            }
            case 0: {
                var5_5 /* !! */  = (int)nz.kzdt("kzgs", kzdq(int ), (int)41);
                if (var6_4) {
                    throw null;
                }
            }
            case 1: {
                ** GOTO lbl57
            }
            case 3: {
                var5_5 /* !! */  = (int)nz.kzdt("kzgv", kzdq(int ), (int)44);
                if (var6_4) {
                    throw null;
                }
lbl57:
                // 3 sources

                var5_5 /* !! */  = (int)nz.kzdt("kzgt", kzdq(int ), (int)42);
                if (var6_4) {
                    throw null;
                }
            }
            case 2: 
        }
        do {
            var5_5 /* !! */  = (int)nz.kzdt("kzgu", kzdq(int ), (int)43);
        } while (!var6_4);
        throw null;
        block27: while (true) {
            v7 /* !! */  = (long)(v8 - nz.kzdt("kzgm", kzdx(int ), (int)26));
lbl67:
            // 2 sources

            switch ((int)v7 /* !! */ ) {
                case 348538705: {
                    v8 = nz.kzdt("kzgn", kzdx(int ), (int)27);
                    continue block27;
                }
                case 1293686697: {
                    break block27;
                }
                case 1628901520: {
                    v8 = nz.kzdt("kzgo", kzdx(int ), (int)28);
                    continue block27;
                }
            }
            break;
        }
        v9 = v5.closeInventory((boolean)v6);
        v10 /* !! */  = nz.tq;
        if (true) ** GOTO lbl81
        block28: while (true) {
            v10 /* !! */  = (long)(v11 - nz.kzdt("kzgp", kzdx(int ), (int)29));
lbl81:
            // 2 sources

            switch ((int)v10 /* !! */ ) {
                case 138562703: {
                    v11 = nz.kzdt("kzgq", kzdx(int ), (int)30);
                    continue block28;
                }
                case 1263320363: {
                    v11 = nz.kzdt("kzgr", kzdx(int ), (int)31);
                    continue block28;
                }
                case 1293686697: {
                    return nz.queueSwap(var0, var1_1, var2_2, v9, var3_3);
                }
            }
            break;
        }
        return nz.queueSwap(var0, var1_1, var2_2, v9, var3_3);
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ void lambda$swapAndUse$1(nu var0, int var1_1) {
        v0 /* !! */  = nz.tq;
        if (true) ** GOTO lbl5
        block44: while (true) {
            v0 /* !! */  = (long)(v1 - nz.kzdt("lalv", kzdx(int ), (int)355));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -639518724: {
                    v1 = nz.kzdt("lalw", kzdx(int ), (int)356);
                    continue block44;
                }
                case 178032398: {
                    v1 = nz.kzdt("lalx", kzdx(int ), (int)357);
                    continue block44;
                }
                case 1293686697: {
                    break block44;
                }
            }
            break;
        }
        var4_2 = nz.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = nz.tq - nz.kzdt("laly", kzdx(int ), (int)358)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == nz.kzdt("lalz", kzdq(int ), (int)527)) break;
            v2 /* !! */  = (long)nz.kzdt("lama", kzdq(int ), (int)528);
        }
        var3_3 /* !! */  = nz.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_2 = nz.tq - nz.kzdt("lamb", kzdx(int ), (int)359)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == nz.kzdt("lamc", kzdq(int ), (int)529)) {
                var2_4 = nz.a;
                if (var4_2) {
                    throw null;
                }
                break;
            }
            v3 /* !! */  = (long)nz.kzdt("lamd", kzdq(int ), (int)530);
        }
        if (var2_4 || var2_4) return;
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block47: while (true) {
            block72: {
                switch (cfr_temp_0 == -2147483648 ? var3_3 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        while (true) {
                            if ((v4 /* !! */  = (cfr_temp_3 = nz.tq - nz.kzdt("lame", kzdx(int ), (int)360)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                            if (v4 /* !! */  != nz.kzdt("lamf", kzdq(int ), (int)531)) ** GOTO lbl42
                            v5 = var0.slot();
                            v6 /* !! */  = nz.tq;
                            ** GOTO lbl90
lbl42:
                            // 1 sources

                            v4 /* !! */  = (long)nz.kzdt("lamg", kzdq(int ), (int)532);
                        }
                    }
                    case 1: {
                        var3_3 /* !! */  = (int)nz.kzdt("lana", kzdq(int ), (int)536);
                        cfr_temp_0 = 8;
                        if (var4_2) {
                            throw null;
                        }
                        break block72;
                    }
                    case 2: {
                        ** GOTO lbl77
                    }
                    case 5: {
                        var3_3 /* !! */  = (int)nz.kzdt("lane", kzdq(int ), (int)540);
                        cfr_temp_0 = 6;
                        if (var4_2) {
                            throw null;
                        }
                        break block72;
                    }
                    case 7: {
                        var3_3 /* !! */  = (int)nz.kzdt("lang", kzdq(int ), (int)542);
                        cfr_temp_0 = 8;
                        if (var4_2) {
                            throw null;
                        }
                        break block72;
                    }
                    case 9: {
                        var3_3 /* !! */  = (int)nz.kzdt("lani", kzdq(int ), (int)544);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 0: {
                        do {
                            var3_3 /* !! */  = (int)nz.kzdt("lamz", kzdq(int ), (int)535);
                        } while (!var4_2);
                        throw null;
                    }
                    case 11: {
                        var3_3 /* !! */  = (int)nz.kzdt("lank", kzdq(int ), (int)546);
                        if (var4_2) {
                            throw null;
                        }
lbl77:
                        // 3 sources

                        var3_3 /* !! */  = (int)nz.kzdt("lanb", kzdq(int ), (int)537);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 4: {
                        var3_3 /* !! */  = (int)nz.kzdt("land", kzdq(int ), (int)539);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 6: {
                        var3_3 /* !! */  = (int)nz.kzdt("lanf", kzdq(int ), (int)541);
                        cfr_temp_0 = 8;
                        if (var4_2) {
                            throw null;
                        }
                        break block72;
                    }
lbl90:
                    // 1 sources

                    block50: while (true) {
                        switch ((int)v6 /* !! */ ) {
                            case -281502612: {
                                v6 /* !! */  = (long)(nz.kzdt("lami", kzdx(int ), (int)362) - nz.kzdt("lamh", kzdx(int ), (int)361));
                                continue block50;
                            }
                            case 1293686697: {
                                break block50;
                            }
                        }
                        break;
                    }
                    nv.swapHotbar(v5, var1_1);
                    if (var2_4 || var2_4) return;
                    v7 /* !! */  = nz.tq;
                    if (true) ** GOTO lbl103
                    block51: while (true) {
                        v7 /* !! */  = (long)(v8 - nz.kzdt("lamj", kzdx(int ), (int)363));
lbl103:
                        // 2 sources

                        switch ((int)v7 /* !! */ ) {
                            case -1875665216: {
                                v8 = nz.kzdt("lamk", kzdx(int ), (int)364);
                                continue block51;
                            }
                            case -1263530353: {
                                v8 = nz.kzdt("laml", kzdx(int ), (int)365);
                                continue block51;
                            }
                            case 93472863: {
                                v8 = nz.kzdt("lamm", kzdx(int ), (int)366);
                                continue block51;
                            }
                            case 1293686697: {
                                break block51;
                            }
                        }
                        break;
                    }
                    v9 /* !! */  = nz.tq;
                    block52: while (true) {
                        switch ((int)v9 /* !! */ ) {
                            case 172749498: {
                                v9 /* !! */  = (long)(nz.kzdt("lamo", kzdx(int ), (int)368) - nz.kzdt("lamn", kzdx(int ), (int)367));
                                continue block52;
                            }
                            case 1293686697: {
                                break block52;
                            }
                        }
                        break;
                    }
                    nv.use(class_1268.field_5808);
                    if (var2_4 || var2_4) return;
                    while (true) {
                        if ((v10 /* !! */  = (cfr_temp_4 = nz.tq - nz.kzdt("lamp", kzdx(int ), (int)369)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                        if (v10 /* !! */  != nz.kzdt("lamq", kzdq(int ), (int)533)) ** GOTO lbl131
                        v11 = var0.slot();
                        v12 /* !! */  = nz.tq;
                        if (true) ** GOTO lbl135
lbl131:
                        // 1 sources

                        v10 /* !! */  = (long)nz.kzdt("lamr", kzdq(int ), (int)534);
                    }
                    block54: while (true) {
                        v12 /* !! */  = (long)(v13 - nz.kzdt("lams", kzdx(int ), (int)370));
lbl135:
                        // 2 sources

                        switch ((int)v12 /* !! */ ) {
                            case -1861667625: {
                                v13 = nz.kzdt("lamt", kzdx(int ), (int)371);
                                continue block54;
                            }
                            case 957354008: {
                                v13 = nz.kzdt("lamu", kzdx(int ), (int)372);
                                continue block54;
                            }
                            case 1053697291: {
                                v13 = nz.kzdt("lamv", kzdx(int ), (int)373);
                                continue block54;
                            }
                            case 1293686697: {
                                break block54;
                            }
                        }
                        break;
                    }
                    nv.swapHotbar(v11, var1_1);
                    if (var2_4 || var2_4) return;
                    v14 /* !! */  = nz.tq;
                    if (true) ** GOTO lbl153
                    block55: while (true) {
                        v14 /* !! */  = (long)(v15 - nz.kzdt("lamw", kzdx(int ), (int)374));
lbl153:
                        // 2 sources

                        switch ((int)v14 /* !! */ ) {
                            case -1137362000: {
                                v15 = nz.kzdt("lamx", kzdx(int ), (int)375);
                                continue block55;
                            }
                            case 1293686697: {
                                break block55;
                            }
                            case 1331167620: {
                                v15 = nz.kzdt("lamy", kzdx(int ), (int)376);
                                continue block55;
                            }
                        }
                        break;
                    }
                    nv.closeScreen();
                    if (!var2_4 && !var2_4) return;
                    return;
                    case 3: {
                        var3_3 /* !! */  = (int)nz.kzdt("lanc", kzdq(int ), (int)538);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 10: {
                        var3_3 /* !! */  = (int)nz.kzdt("lanj", kzdq(int ), (int)545);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 8: 
                }
                ** GOTO lbl178
            }
            do {
                if (true) continue block47;
lbl178:
                // 2 sources

                var3_3 /* !! */  = (int)nz.kzdt("lanh", kzdq(int ), (int)543);
                cfr_temp_0 = 3;
            } while (!var4_2);
            break;
        }
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Deprecated
    public static String getLockOwner() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = nz.tq - nz.kzdt("kzxf", kzdx(int ), (int)196)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == nz.kzdt("kzxg", kzdq(int ), (int)306)) break;
            v0 /* !! */  = (long)nz.kzdt("kzxh", kzdq(int ), (int)307);
        }
        var2 = nz.c;
        v1 /* !! */  = nz.tq;
        if (true) ** GOTO lbl12
        block10: while (true) {
            v1 /* !! */  = (long)(v2 - nz.kzdt("kzxi", kzdx(int ), (int)197));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -963976378: {
                    v2 = nz.kzdt("kzxj", kzdx(int ), (int)198);
                    continue block10;
                }
                case 835654223: {
                    v2 = nz.kzdt("kzxk", kzdx(int ), (int)199);
                    continue block10;
                }
                case 1293686697: {
                    break block10;
                }
            }
            break;
        }
        var1_1 = nz.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = nz.tq - nz.kzdt("kzxl", kzdx(int ), (int)200)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == nz.kzdt("kzxm", kzdq(int ), (int)308)) break;
            v3 /* !! */  = (long)nz.kzdt("kzxn", kzdq(int ), (int)309);
        }
        var0_2 = nz.a;
        if (var2) {
            throw null;
lbl31:
            // 1 sources

            return null;
        }
        ** while (var0_2 || var0_2)
lbl34:
        // 1 sources

        v4 /* !! */  = nz.tq;
        if (true) ** GOTO lbl38
        block13: while (true) {
            v4 /* !! */  = (long)(nz.kzdt("kzxp", kzdx(int ), (int)202) - nz.kzdt("kzxo", kzdx(int ), (int)201));
lbl38:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case 1098630035: {
                    continue block13;
                }
                case 1293686697: {
                    break block13;
                }
            }
            break;
        }
        return nz.getCurrentSwapId();
    }

    private static /* synthetic */ void lapd() {
        nz.kzdr[500] = -1522809996;
        nz.kzdr[501] = -572884730;
        nz.kzdr[502] = 1109786230;
        nz.kzdr[503] = 1865660901;
        nz.kzdr[504] = -1982052585;
        nz.kzdr[505] = 718663586;
        nz.kzdr[506] = -424690055;
        nz.kzdr[507] = -2033219887;
        nz.kzdr[508] = 1230284267;
        nz.kzdr[509] = 1298422152;
        nz.kzdr[510] = 513130837;
        nz.kzdr[511] = 1906326371;
        nz.kzdr[512] = 1255913730;
        nz.kzdr[513] = 63917247;
        nz.kzdr[514] = -2000011178;
        nz.kzdr[515] = -2113202673;
        nz.kzdr[516] = -602829293;
        nz.kzdr[517] = 1234927412;
        nz.kzdr[518] = -1933772499;
        nz.kzdr[519] = 832974481;
        nz.kzdr[520] = -965716688;
        nz.kzdr[521] = -1863357256;
        nz.kzdr[522] = -538180394;
        nz.kzdr[523] = -1090321779;
        nz.kzdr[524] = -1025009848;
        nz.kzdr[525] = 1106342636;
        nz.kzdr[526] = -1340674574;
        nz.kzdr[527] = 1422729332;
        nz.kzdr[528] = -1501439743;
        nz.kzdr[529] = 2126717039;
        nz.kzdr[530] = 711011548;
        nz.kzdr[531] = -1363602259;
        nz.kzdr[532] = -487811482;
        nz.kzdr[533] = -1910212023;
        nz.kzdr[534] = -89090579;
        nz.kzdr[535] = 95274518;
        nz.kzdr[536] = 1885398616;
        nz.kzdr[537] = -43305187;
        nz.kzdr[538] = 602304119;
        nz.kzdr[539] = -1967216731;
        nz.kzdr[540] = 2012239419;
        nz.kzdr[541] = -215860014;
        nz.kzdr[542] = -1826806815;
        nz.kzdr[543] = 860351124;
        nz.kzdr[544] = -506137290;
        nz.kzdr[545] = -687529840;
        nz.kzdr[546] = 1668784183;
        nz.kzdr[547] = -1649909916;
        nz.kzdr[548] = 2055296531;
        nz.kzdr[549] = 2134777297;
        nz.kzdr[550] = 71807347;
        nz.kzdr[551] = -484534961;
        nz.kzdr[552] = 446507170;
        nz.kzdr[553] = 947625765;
        nz.kzdr[554] = -1770290643;
        nz.kzdr[555] = -766474655;
        nz.kzdr[556] = 1323299780;
        nz.kzdr[557] = 99159916;
        nz.kzdr[558] = -1082600612;
        nz.kzdr[559] = 661814901;
        nz.kzdr[560] = 593617555;
        nz.kzdr[561] = 2019287695;
        nz.kzdr[562] = -1941216106;
        nz.kzdr[563] = 678833268;
        nz.kzdr[564] = 1419265204;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void swapSlots(int var0, int var1_1) {
        v0 /* !! */  = nz.tq;
        if (true) ** GOTO lbl5
        block21: while (true) {
            v0 /* !! */  = (long)(v1 - nz.kzdt("lagd", kzdx(int ), (int)292));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1541592924: {
                    v1 = nz.kzdt("lage", kzdx(int ), (int)293);
                    continue block21;
                }
                case 1293686697: {
                    break block21;
                }
                case 1961253372: {
                    v1 = nz.kzdt("lagf", kzdx(int ), (int)294);
                    continue block21;
                }
                case 2007365577: {
                    v1 = nz.kzdt("lagg", kzdx(int ), (int)295);
                    continue block21;
                }
            }
            break;
        }
        var5_2 = nz.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = nz.tq - nz.kzdt("lagh", kzdx(int ), (int)296)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == nz.kzdt("lagi", kzdq(int ), (int)442)) break;
            v2 /* !! */  = (long)nz.kzdt("lagj", kzdq(int ), (int)443);
        }
        var4_3 /* !! */  = nz.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = nz.tq - nz.kzdt("lagk", kzdx(int ), (int)297)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == nz.kzdt("lagl", kzdq(int ), (int)444)) break;
            v3 /* !! */  = (long)nz.kzdt("lagm", kzdq(int ), (int)445);
        }
        var3_4 = nz.a;
        if (var5_2) {
            throw null;
lbl32:
            // 4 sources

            return;
        }
        if (var3_4 || var3_4) ** GOTO lbl32
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_2 = nz.tq - nz.kzdt("lagn", kzdx(int ), (int)298)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == nz.kzdt("lago", kzdq(int ), (int)446)) break;
            v4 /* !! */  = (long)nz.kzdt("lagp", kzdq(int ), (int)447);
        }
        v5 = System.nanoTime();
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_3 = nz.tq - nz.kzdt("lagq", kzdx(int ), (int)299)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v6 /* !! */  == nz.kzdt("lagr", kzdq(int ), (int)448)) break;
            v6 /* !! */  = (long)nz.kzdt("lags", kzdq(int ), (int)449);
        }
        var2_5 = "swapSlots_" + var0 + "_" + var1_1 + "_" + v5;
        if (var3_4 || var3_4) ** GOTO lbl32
        v7 = nz.kzdt("lagt", kzdq(int ), (int)450);
        v8 /* !! */  = nz.tq;
        if (true) ** GOTO lbl53
        block27: while (true) {
            v8 /* !! */  = (long)(v9 - nz.kzdt("lagu", kzdx(int ), (int)300));
lbl53:
            // 2 sources

            switch ((int)v8 /* !! */ ) {
                case -1394248594: {
                    v9 = nz.kzdt("lagv", kzdx(int ), (int)301);
                    continue block27;
                }
                case 1277850149: {
                    v9 = nz.kzdt("lagw", kzdx(int ), (int)302);
                    continue block27;
                }
                case 1293686697: {
                    break block27;
                }
            }
            break;
        }
        v10 = (Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, lambda$swapSlots$5(int int ), ()V)((int)var0, (int)var1_1);
        while (true) {
            if ((v11 /* !! */  = (cfr_temp_4 = nz.tq - nz.kzdt("lagx", kzdx(int ), (int)303)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v11 /* !! */  == nz.kzdt("lagy", kzdq(int ), (int)451)) break;
            v11 /* !! */  = (long)nz.kzdt("lagz", kzdq(int ), (int)452);
        }
        nz.queueSwapInstant(var2_5, (int)v7, v10, null);
        if (var3_4) ** GOTO lbl32
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var3_4) ** break;
                ** continue;
                return;
            }
lbl76:
            // 2 sources

            case 0: {
                var4_3 /* !! */  = (int)nz.kzdt("laha", kzdq(int ), (int)453);
                if (!var5_2) break;
                throw null;
            }
            case 1: {
                var4_3 /* !! */  = (int)nz.kzdt("lahb", kzdq(int ), (int)454);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl90
            }
            case 2: {
                var4_3 /* !! */  = (int)nz.kzdt("lahc", kzdq(int ), (int)455);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl95
            }
lbl90:
            // 4 sources

            case 3: {
                var4_3 /* !! */  = (int)nz.kzdt("lahd", kzdq(int ), (int)456);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl99
            }
lbl95:
            // 2 sources

            case 4: {
                var4_3 /* !! */  = (int)nz.kzdt("lahe", kzdq(int ), (int)457);
                if (!var5_2) ** GOTO lbl76
                throw null;
            }
lbl99:
            // 2 sources

            case 5: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_3 /* !! */  = (int)nz.kzdt("lahf", kzdq(int ), (int)458);
                    if (!var5_2) ** GOTO lbl90
                    throw null;
                }
            }
            case 6: {
                var4_3 /* !! */  = (int)nz.kzdt("lahg", kzdq(int ), (int)459);
                if (!var5_2) ** GOTO lbl90
                throw null;
            }
            case 7: 
        }
        var4_3 /* !! */  = (int)nz.kzdt("lahh", kzdq(int ), (int)460);
        ** while (!var5_2)
lbl111:
        // 1 sources

        throw null;
    }

    private nz() {
        int n2 = b;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    @Deprecated
    public static boolean tryAcquireLock(String var0) {
        v0 /* !! */  = nz.tq;
        if (true) ** GOTO lbl5
        block20: while (true) {
            v0 /* !! */  = (long)(v1 - nz.kzdt("kztx", kzdx(int ), (int)163));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1908555957: {
                    v1 = nz.kzdt("kzty", kzdx(int ), (int)164);
                    continue block20;
                }
                case -1360529348: {
                    v1 = nz.kzdt("kztz", kzdx(int ), (int)165);
                    continue block20;
                }
                case -1241212819: {
                    v1 = nz.kzdt("kzua", kzdx(int ), (int)166);
                    continue block20;
                }
                case 1293686697: {
                    break block20;
                }
            }
            break;
        }
        var3_1 = nz.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = nz.tq - nz.kzdt("kzub", kzdx(int ), (int)167)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == nz.kzdt("kzuc", kzdq(int ), (int)253)) break;
            v2 /* !! */  = (long)nz.kzdt("kzud", kzdq(int ), (int)254);
        }
        var2_2 /* !! */  = nz.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_2 = nz.tq - nz.kzdt("kzue", kzdx(int ), (int)168)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == nz.kzdt("kzuf", kzdq(int ), (int)255)) {
                var1_3 = nz.a;
                if (var3_1) {
                    throw null;
                }
                break;
            }
            v3 /* !! */  = (long)nz.kzdt("kzug", kzdq(int ), (int)256);
        }
        if (var1_3) return (boolean)nz.kzdt("kzuh", kzdq(int ), (int)257);
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        while (true) {
            switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var1_3) return (boolean)nz.kzdt("kzuh", kzdq(int ), (int)257);
                    v4 /* !! */  = nz.tq;
                    block24: while (true) {
                        switch ((int)v4 /* !! */ ) {
                            case -1540636411: {
                                v4 /* !! */  = (long)(nz.kzdt("kzuj", kzdx(int ), (int)170) - nz.kzdt("kzui", kzdx(int ), (int)169));
                                continue block24;
                            }
                            case 1293686697: {
                                break block24;
                            }
                        }
                        break;
                    }
                    if (!nz.isSwapQueued(var0)) {
                        if (var1_3) return (boolean)nz.kzdt("kzuh", kzdq(int ), (int)257);
                        v5 = nz.kzdt("kzuk", kzdq(int ), (int)258);
                        if (!var3_1) return (boolean)v5;
                        throw null;
                    }
                    if (var1_3 || var1_3) {
                        return (boolean)nz.kzdt("kzuh", kzdq(int ), (int)257);
                    }
                    v5 = nz.kzdt("kzul", kzdq(int ), (int)259);
                    return (boolean)v5;
                }
                case 0: {
                    var2_2 /* !! */  = (int)nz.kzdt("kzum", kzdq(int ), (int)260);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 3: {
                    ** GOTO lbl76
                }
                case 6: {
                    var2_2 /* !! */  = (int)nz.kzdt("kzus", kzdq(int ), (int)266);
                    if (!var3_1) ** break;
                    throw null;
                }
                case 7: {
                    ** GOTO lbl73
                }
                case 1: {
                    var2_2 /* !! */  = (int)nz.kzdt("kzun", kzdq(int ), (int)261);
                    if (!var3_1) ** break;
                    throw null;
lbl73:
                    // 3 sources

                    var2_2 /* !! */  = (int)nz.kzdt("kzut", kzdq(int ), (int)267);
                    if (var3_1) {
                        throw null;
                    }
lbl76:
                    // 3 sources

                    var2_2 /* !! */  = (int)nz.kzdt("kzup", kzdq(int ), (int)263);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 4: {
                    var2_2 /* !! */  = (int)nz.kzdt("kzuq", kzdq(int ), (int)264);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 2: {
                    var2_2 /* !! */  = (int)nz.kzdt("kzuo", kzdq(int ), (int)262);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 5: 
            }
            if (true) ** GOTO lbl91
            break;
        }
        do {
            if (true) ** continue;
lbl91:
            // 2 sources

            var2_2 /* !! */  = (int)nz.kzdt("kzur", kzdq(int ), (int)265);
            cfr_temp_0 = 1;
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ void lapl() {
        nz.kzdy[100] = 3737061563589315881L;
        nz.kzdy[101] = -7758887795804433086L;
        nz.kzdy[102] = 278698263234301374L;
        nz.kzdy[103] = 2511782306013181347L;
        nz.kzdy[104] = 6849968205618885362L;
        nz.kzdy[105] = -4123143936384054846L;
        nz.kzdy[106] = -3854721030974418119L;
        nz.kzdy[107] = 8641184537166038536L;
        nz.kzdy[108] = 4794672124322765707L;
        nz.kzdy[109] = 7396748212466440468L;
        nz.kzdy[110] = 7461251988695648166L;
        nz.kzdy[111] = -5571010981718419350L;
        nz.kzdy[112] = 1978757998814923713L;
        nz.kzdy[113] = 2116734713306246664L;
        nz.kzdy[114] = -53444463039920679L;
        nz.kzdy[115] = -2469762435640545242L;
        nz.kzdy[116] = -6635708082945434220L;
        nz.kzdy[117] = -1250759229415246529L;
        nz.kzdy[118] = -8392415803967688553L;
        nz.kzdy[119] = -5846804058530791982L;
        nz.kzdy[120] = -847679788630736197L;
        nz.kzdy[121] = -4726849422498815572L;
        nz.kzdy[122] = 2749286407177401953L;
        nz.kzdy[123] = 7306248398807337638L;
        nz.kzdy[124] = -3458161429419084535L;
        nz.kzdy[125] = -31561219868347863L;
        nz.kzdy[126] = 1000938661789590375L;
        nz.kzdy[127] = 2985552064611400130L;
        nz.kzdy[128] = 699037010720854387L;
        nz.kzdy[129] = -2211762653169890953L;
        nz.kzdy[130] = 2294553162663234994L;
        nz.kzdy[131] = 5884824063883988991L;
        nz.kzdy[132] = 4078492541439099670L;
        nz.kzdy[133] = -3363693319449839830L;
        nz.kzdy[134] = 4835632267523277061L;
        nz.kzdy[135] = 2626985860767046256L;
        nz.kzdy[136] = -1957306810506360730L;
        nz.kzdy[137] = 6500839332581065067L;
        nz.kzdy[138] = 8155724438403381942L;
        nz.kzdy[139] = 2366507483696031815L;
        nz.kzdy[140] = 5811198581290189167L;
        nz.kzdy[141] = 881366408349431161L;
        nz.kzdy[142] = 218036091839900905L;
        nz.kzdy[143] = -3046094733911837985L;
        nz.kzdy[144] = 4259944526754016444L;
        nz.kzdy[145] = 6809398663502977283L;
        nz.kzdy[146] = -3861934970252235314L;
        nz.kzdy[147] = 6180240647246076101L;
        nz.kzdy[148] = -6376270550840545186L;
        nz.kzdy[149] = 7818564123425928270L;
        nz.kzdy[150] = -6002691475686723104L;
        nz.kzdy[151] = -2938408051689290784L;
        nz.kzdy[152] = -6228317796677121553L;
        nz.kzdy[153] = 3440398820772775777L;
        nz.kzdy[154] = -5016624532033372153L;
        nz.kzdy[155] = 6929886536549725312L;
        nz.kzdy[156] = -1046518776154105314L;
        nz.kzdy[157] = 2906597292549319673L;
        nz.kzdy[158] = -5911195969864852324L;
        nz.kzdy[159] = -5844442104844786517L;
        nz.kzdy[160] = -3710884765578145916L;
        nz.kzdy[161] = 325277057175555647L;
        nz.kzdy[162] = 6738365511840640959L;
        nz.kzdy[163] = 2694196691715384400L;
        nz.kzdy[164] = 2235708482129478816L;
        nz.kzdy[165] = -8081572183581508096L;
        nz.kzdy[166] = -4580586247484917527L;
        nz.kzdy[167] = 8607629241028729851L;
        nz.kzdy[168] = -2646296035878831462L;
        nz.kzdy[169] = 79734143441293241L;
        nz.kzdy[170] = -5541216643879537097L;
        nz.kzdy[171] = 2361857886105530640L;
        nz.kzdy[172] = 1967235932033720533L;
        nz.kzdy[173] = 2237497515217001618L;
        nz.kzdy[174] = 3866839186491549963L;
        nz.kzdy[175] = 7213550325456744482L;
        nz.kzdy[176] = -4145254633070156633L;
        nz.kzdy[177] = 8745557369989413839L;
        nz.kzdy[178] = 3976357717011365771L;
        nz.kzdy[179] = -8446446401534439957L;
        nz.kzdy[180] = 1327158970908527359L;
        nz.kzdy[181] = -3150675565567966564L;
        nz.kzdy[182] = 2130277202930792630L;
        nz.kzdy[183] = -3554046258741129334L;
        nz.kzdy[184] = -5967776554522970355L;
        nz.kzdy[185] = 4194820082529593690L;
        nz.kzdy[186] = 1349759353728689173L;
        nz.kzdy[187] = 2030902616319357599L;
        nz.kzdy[188] = 8400393737678034097L;
        nz.kzdy[189] = 2339167403238911907L;
        nz.kzdy[190] = 5377163310787003118L;
        nz.kzdy[191] = -8711599376626868817L;
        nz.kzdy[192] = 1056231701145947340L;
        nz.kzdy[193] = 4719453433262235642L;
        nz.kzdy[194] = 6004005178243265979L;
        nz.kzdy[195] = -3398776498270170866L;
        nz.kzdy[196] = -8443048665407530293L;
        nz.kzdy[197] = -6020885183488469052L;
        nz.kzdy[198] = -9048286816729121446L;
        nz.kzdy[199] = -5487366517455801056L;
    }

    private static /* synthetic */ void laoz() {
        nz.kzdr[100] = 594936731;
        nz.kzdr[101] = -195067921;
        nz.kzdr[102] = -742612180;
        nz.kzdr[103] = 2054793039;
        nz.kzdr[104] = -1253758737;
        nz.kzdr[105] = -2023115754;
        nz.kzdr[106] = 1363406883;
        nz.kzdr[107] = -1249494935;
        nz.kzdr[108] = 169665956;
        nz.kzdr[109] = -1115097487;
        nz.kzdr[110] = 1815135925;
        nz.kzdr[111] = -1458736444;
        nz.kzdr[112] = -1773257471;
        nz.kzdr[113] = 1682053295;
        nz.kzdr[114] = 1715496539;
        nz.kzdr[115] = -90737307;
        nz.kzdr[116] = 1222645533;
        nz.kzdr[117] = 1795611462;
        nz.kzdr[118] = 1989447279;
        nz.kzdr[119] = 873342222;
        nz.kzdr[120] = -1582025534;
        nz.kzdr[121] = 249111548;
        nz.kzdr[122] = 2019234054;
        nz.kzdr[123] = -1248192087;
        nz.kzdr[124] = 204179811;
        nz.kzdr[125] = 625004716;
        nz.kzdr[126] = 2077273023;
        nz.kzdr[127] = 1495606828;
        nz.kzdr[128] = -894738499;
        nz.kzdr[129] = 1841633559;
        nz.kzdr[130] = -1844920345;
        nz.kzdr[131] = -461119787;
        nz.kzdr[132] = -1224929884;
        nz.kzdr[133] = 39744200;
        nz.kzdr[134] = 1937282107;
        nz.kzdr[135] = 1007619056;
        nz.kzdr[136] = -810284345;
        nz.kzdr[137] = 1241666650;
        nz.kzdr[138] = 1228808885;
        nz.kzdr[139] = 1880937310;
        nz.kzdr[140] = 359666223;
        nz.kzdr[141] = -330365729;
        nz.kzdr[142] = -619521944;
        nz.kzdr[143] = -231084218;
        nz.kzdr[144] = -1440543312;
        nz.kzdr[145] = -1109381329;
        nz.kzdr[146] = -429714681;
        nz.kzdr[147] = 75500600;
        nz.kzdr[148] = -1438058211;
        nz.kzdr[149] = 988759802;
        nz.kzdr[150] = -244801395;
        nz.kzdr[151] = 1656555163;
        nz.kzdr[152] = 2133752238;
        nz.kzdr[153] = -564905148;
        nz.kzdr[154] = 1803739464;
        nz.kzdr[155] = -501359020;
        nz.kzdr[156] = 625871;
        nz.kzdr[157] = 296379822;
        nz.kzdr[158] = 1320668002;
        nz.kzdr[159] = 1664779597;
        nz.kzdr[160] = 1566877363;
        nz.kzdr[161] = -2018148553;
        nz.kzdr[162] = -314034418;
        nz.kzdr[163] = 1888349238;
        nz.kzdr[164] = -1718759370;
        nz.kzdr[165] = -509960922;
        nz.kzdr[166] = 905262089;
        nz.kzdr[167] = -298324001;
        nz.kzdr[168] = -775906735;
        nz.kzdr[169] = 641563469;
        nz.kzdr[170] = -650423870;
        nz.kzdr[171] = -40038443;
        nz.kzdr[172] = 534445186;
        nz.kzdr[173] = -2125294421;
        nz.kzdr[174] = -459008661;
        nz.kzdr[175] = 1917979568;
        nz.kzdr[176] = 14315129;
        nz.kzdr[177] = 1773850853;
        nz.kzdr[178] = -1633874499;
        nz.kzdr[179] = 469750316;
        nz.kzdr[180] = 576705043;
        nz.kzdr[181] = 751160174;
        nz.kzdr[182] = 1615280949;
        nz.kzdr[183] = -1932632176;
        nz.kzdr[184] = 1179518831;
        nz.kzdr[185] = -1438386960;
        nz.kzdr[186] = -2102870174;
        nz.kzdr[187] = -1683262385;
        nz.kzdr[188] = -1467993074;
        nz.kzdr[189] = 203560410;
        nz.kzdr[190] = 215352851;
        nz.kzdr[191] = -2018753322;
        nz.kzdr[192] = -129572932;
        nz.kzdr[193] = 10938433;
        nz.kzdr[194] = -175801611;
        nz.kzdr[195] = 1845710556;
        nz.kzdr[196] = -1355616002;
        nz.kzdr[197] = -1727671467;
        nz.kzdr[198] = 1717000594;
        nz.kzdr[199] = 1828749170;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ void lambda$swapAndUseSilent$3(nu var0, int var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = nz.tq - nz.kzdt("lait", kzdx(int ), (int)317)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == nz.kzdt("laiu", kzdq(int ), (int)485)) break;
            v0 /* !! */  = (long)nz.kzdt("laiv", kzdq(int ), (int)486);
        }
        var4_2 = nz.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = nz.tq - nz.kzdt("laiw", kzdx(int ), (int)318)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == nz.kzdt("laix", kzdq(int ), (int)487)) break;
            v1 /* !! */  = (long)nz.kzdt("laiy", kzdq(int ), (int)488);
        }
        var3_3 /* !! */  = nz.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = nz.tq - nz.kzdt("laiz", kzdx(int ), (int)319)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == nz.kzdt("laja", kzdq(int ), (int)489)) break;
            v2 /* !! */  = (long)nz.kzdt("lajb", kzdq(int ), (int)490);
        }
        var2_4 = nz.a;
        if (var4_2) {
            throw null;
lbl21:
            // 5 sources

            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl21
        v3 /* !! */  = nz.tq;
        if (true) ** GOTO lbl28
        block32: while (true) {
            v3 /* !! */  = (long)(nz.kzdt("lajd", kzdx(int ), (int)321) - nz.kzdt("lajc", kzdx(int ), (int)320));
lbl28:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case 1190089070: {
                    continue block32;
                }
                case 1293686697: {
                    break block32;
                }
            }
            break;
        }
        v4 = var0.slot();
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_3 = nz.tq - nz.kzdt("laje", kzdx(int ), (int)322)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == nz.kzdt("lajf", kzdq(int ), (int)491)) break;
            v5 /* !! */  = (long)nz.kzdt("lajg", kzdq(int ), (int)492);
        }
        nv.swapHotbar(v4, var1_1);
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4 || var2_4) ** GOTO lbl21
                v6 /* !! */  = nz.tq;
                if (true) ** GOTO lbl48
                block34: while (true) {
                    v6 /* !! */  = (long)(nz.kzdt("laji", kzdx(int ), (int)324) - nz.kzdt("lajh", kzdx(int ), (int)323));
lbl48:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case 1293686697: {
                            break block34;
                        }
                        case 1943777326: {
                            continue block34;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_4 = nz.tq - nz.kzdt("lajj", kzdx(int ), (int)325)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == nz.kzdt("lajk", kzdq(int ), (int)493)) break;
                    v7 /* !! */  = (long)nz.kzdt("lajl", kzdq(int ), (int)494);
                }
                nv.use(class_1268.field_5808);
                if (var2_4 || var2_4) ** GOTO lbl21
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_5 = nz.tq - nz.kzdt("lajm", kzdx(int ), (int)326)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == nz.kzdt("lajn", kzdq(int ), (int)495)) break;
                    v8 /* !! */  = (long)nz.kzdt("lajo", kzdq(int ), (int)496);
                }
                v9 = var0.slot();
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_6 = nz.tq - nz.kzdt("lajp", kzdx(int ), (int)327)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == nz.kzdt("lajq", kzdq(int ), (int)497)) break;
                    v10 /* !! */  = (long)nz.kzdt("lajr", kzdq(int ), (int)498);
                }
                nv.swapHotbar(v9, var1_1);
                if (var2_4 || var2_4) ** GOTO lbl21
                v11 /* !! */  = nz.tq;
                if (true) ** GOTO lbl77
                block38: while (true) {
                    v11 /* !! */  = (long)(v12 - nz.kzdt("lajs", kzdx(int ), (int)328));
lbl77:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -1657053011: {
                            v12 = nz.kzdt("lajt", kzdx(int ), (int)329);
                            continue block38;
                        }
                        case -1133184112: {
                            v12 = nz.kzdt("laju", kzdx(int ), (int)330);
                            continue block38;
                        }
                        case -576859449: {
                            v12 = nz.kzdt("lajv", kzdx(int ), (int)331);
                            continue block38;
                        }
                        case 1293686697: {
                            break block38;
                        }
                    }
                    break;
                }
                nv.closeScreen();
                if (var2_4 || var2_4) ** continue;
                return;
            }
            case 0: {
                var3_3 /* !! */  = (int)nz.kzdt("lajw", kzdq(int ), (int)499);
                if (var4_2) {
                    throw null;
                }
            }
lbl96:
            // 5 sources

            case 1: {
                var3_3 /* !! */  = (int)nz.kzdt("lajx", kzdq(int ), (int)500);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl110
            }
            case 2: {
                var3_3 /* !! */  = (int)nz.kzdt("lajy", kzdq(int ), (int)501);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl134
            }
            case 3: {
                var3_3 /* !! */  = (int)nz.kzdt("lajz", kzdq(int ), (int)502);
                if (!var4_2) ** GOTO lbl96
                throw null;
            }
lbl110:
            // 2 sources

            case 4: {
                var3_3 /* !! */  = (int)nz.kzdt("laka", kzdq(int ), (int)503);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl120
            }
lbl115:
            // 2 sources

            case 5: {
                var3_3 /* !! */  = (int)nz.kzdt("lakb", kzdq(int ), (int)504);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl134
            }
lbl120:
            // 4 sources

            case 6: {
                var3_3 /* !! */  = (int)nz.kzdt("lakc", kzdq(int ), (int)505);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl129
            }
            case 7: {
                var3_3 /* !! */  = (int)nz.kzdt("lakd", kzdq(int ), (int)506);
                if (!var4_2) ** GOTO lbl120
                throw null;
            }
lbl129:
            // 2 sources

            case 8: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)nz.kzdt("lake", kzdq(int ), (int)507);
                    if (!var4_2) ** GOTO lbl120
                    throw null;
                }
            }
lbl134:
            // 3 sources

            case 9: {
                var3_3 /* !! */  = (int)nz.kzdt("lakf", kzdq(int ), (int)508);
                if (!var4_2) ** GOTO lbl115
                throw null;
            }
            case 10: {
                var3_3 /* !! */  = (int)nz.kzdt("lakg", kzdq(int ), (int)509);
                if (!var4_2) ** GOTO lbl96
                throw null;
            }
            case 11: 
        }
        var3_3 /* !! */  = (int)nz.kzdt("lakh", kzdq(int ), (int)510);
        ** while (!var4_2)
lbl145:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void lapp() {
        nz.kzdz[100] = -4660000580788446991L;
        nz.kzdz[101] = 8681964401632487610L;
        nz.kzdz[102] = -8782902856352759007L;
        nz.kzdz[103] = -5562235519482161549L;
        nz.kzdz[104] = 1315220577603429779L;
        nz.kzdz[105] = 3664989002505409746L;
        nz.kzdz[106] = 6841131895088950765L;
        nz.kzdz[107] = 7647238009230751554L;
        nz.kzdz[108] = 9201935648403765943L;
        nz.kzdz[109] = -6401182778247810322L;
        nz.kzdz[110] = 7461251988695649310L;
        nz.kzdz[111] = 7841360174145860949L;
        nz.kzdz[112] = 1478896139937523844L;
        nz.kzdz[113] = -7287038232123439360L;
        nz.kzdz[114] = -6432960589458617015L;
        nz.kzdz[115] = 95074739431749145L;
        nz.kzdz[116] = 5135142673557919040L;
        nz.kzdz[117] = -1452135694256387667L;
        nz.kzdz[118] = 5193686264658812051L;
        nz.kzdz[119] = -3070500509814121723L;
        nz.kzdz[120] = -454110035303316971L;
        nz.kzdz[121] = 5119152489878158768L;
        nz.kzdz[122] = 2769815864563076959L;
        nz.kzdz[123] = -4677033006268376502L;
        nz.kzdz[124] = -8479648746293619660L;
        nz.kzdz[125] = -1527920860373006522L;
        nz.kzdz[126] = 24348085954885350L;
        nz.kzdz[127] = 6502416294058403576L;
        nz.kzdz[128] = -5967075811892095484L;
        nz.kzdz[129] = 8485117934281399007L;
        nz.kzdz[130] = 899109777605170123L;
        nz.kzdz[131] = 3186214987515994874L;
        nz.kzdz[132] = -6261899566677390219L;
        nz.kzdz[133] = -8816353935310827275L;
        nz.kzdz[134] = 455681088202412011L;
        nz.kzdz[135] = 3984771417131440888L;
        nz.kzdz[136] = 6271770664227230913L;
        nz.kzdz[137] = -5917861055035240155L;
        nz.kzdz[138] = -2830138624224992416L;
        nz.kzdz[139] = -4248872076904383978L;
        nz.kzdz[140] = 4330603272169572845L;
        nz.kzdz[141] = 3180836304001932196L;
        nz.kzdz[142] = 8384303830346615399L;
        nz.kzdz[143] = 4914079968813731741L;
        nz.kzdz[144] = 3212896830653738324L;
        nz.kzdz[145] = -1652050947904695120L;
        nz.kzdz[146] = 3106638088669366914L;
        nz.kzdz[147] = 6300012534075709703L;
        nz.kzdz[148] = 1504272657229952489L;
        nz.kzdz[149] = 1006260183055033986L;
        nz.kzdz[150] = 2019359014616176658L;
        nz.kzdz[151] = 6829496756933900203L;
        nz.kzdz[152] = -716138330584872677L;
        nz.kzdz[153] = -467721469545168470L;
        nz.kzdz[154] = -1532122991324497814L;
        nz.kzdz[155] = -3815677242285767769L;
        nz.kzdz[156] = -1647696305889625580L;
        nz.kzdz[157] = 7552318453727547729L;
        nz.kzdz[158] = -3709815753318021338L;
        nz.kzdz[159] = -629905704393548923L;
        nz.kzdz[160] = 4170410868720305146L;
        nz.kzdz[161] = 2011733217018218543L;
        nz.kzdz[162] = -587214283739354115L;
        nz.kzdz[163] = -2187070626606156460L;
        nz.kzdz[164] = 8447949222045177309L;
        nz.kzdz[165] = 4093119144757784700L;
        nz.kzdz[166] = 3660047699858814981L;
        nz.kzdz[167] = -9162043011400221243L;
        nz.kzdz[168] = 6614172441025298916L;
        nz.kzdz[169] = 7409814403436306752L;
        nz.kzdz[170] = 2688368873826972799L;
        nz.kzdz[171] = 4193586401623149007L;
        nz.kzdz[172] = 1510486371627919434L;
        nz.kzdz[173] = 4128293001968902523L;
        nz.kzdz[174] = -6547083985137214679L;
        nz.kzdz[175] = -6437558185789500048L;
        nz.kzdz[176] = 8716347401859490416L;
        nz.kzdz[177] = 5199589822769338772L;
        nz.kzdz[178] = -2218511269886410392L;
        nz.kzdz[179] = -6975661435185623065L;
        nz.kzdz[180] = 6283078769658817883L;
        nz.kzdz[181] = -2756658067467709383L;
        nz.kzdz[182] = -5486470809160188086L;
        nz.kzdz[183] = -1747067647991390624L;
        nz.kzdz[184] = -6939732116002938005L;
        nz.kzdz[185] = 1078453485703169233L;
        nz.kzdz[186] = -8345574144275639505L;
        nz.kzdz[187] = -8186900942331908146L;
        nz.kzdz[188] = 2505830208234411653L;
        nz.kzdz[189] = -5773700999596688213L;
        nz.kzdz[190] = -8009070214029155913L;
        nz.kzdz[191] = 4026856031848387743L;
        nz.kzdz[192] = -5614418828925355385L;
        nz.kzdz[193] = -5593250100857311302L;
        nz.kzdz[194] = -1903110149423182287L;
        nz.kzdz[195] = -8277298230590792676L;
        nz.kzdz[196] = -7261649472624948663L;
        nz.kzdz[197] = -3324784058164952090L;
        nz.kzdz[198] = -4680066970381257001L;
        nz.kzdz[199] = -320894755616542280L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void swapAndUse(class_1792 var0, int var1_1) {
        block101: {
            block100: {
                v0 /* !! */  = nz.tq;
                if (true) ** GOTO lbl5
                block63: while (true) {
                    v0 /* !! */  = (long)(v1 - nz.kzdt("kzyn", kzdx(int ), (int)207));
lbl5:
                    // 2 sources

                    switch ((int)v0 /* !! */ ) {
                        case -972021493: {
                            v1 = nz.kzdt("kzyo", kzdx(int ), (int)208);
                            continue block63;
                        }
                        case 1268045455: {
                            v1 = nz.kzdt("kzyp", kzdx(int ), (int)209);
                            continue block63;
                        }
                        case 1293686697: {
                            break block63;
                        }
                    }
                    break;
                }
                var7_2 = nz.c;
                while (true) {
                    if ((v2 /* !! */  = (cfr_temp_0 = nz.tq - nz.kzdt("kzyq", kzdx(int ), (int)210)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v2 /* !! */  == nz.kzdt("kzyr", kzdq(int ), (int)329)) break;
                    v2 /* !! */  = (long)nz.kzdt("kzys", kzdq(int ), (int)330);
                }
                var6_3 /* !! */  = nz.b;
                v3 /* !! */  = nz.tq;
                if (true) ** GOTO lbl25
                block65: while (true) {
                    v3 /* !! */  = (long)(v4 - nz.kzdt("kzyt", kzdx(int ), (int)211));
lbl25:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1482221747: {
                            v4 = nz.kzdt("kzyu", kzdx(int ), (int)212);
                            continue block65;
                        }
                        case 354644807: {
                            v4 = nz.kzdt("kzyv", kzdx(int ), (int)213);
                            continue block65;
                        }
                        case 1293686697: {
                            break block65;
                        }
                    }
                    break;
                }
                var5_4 = nz.a;
                if (var7_2) {
                    throw null;
lbl37:
                    // 11 sources

                    return;
                }
                if (var5_4 || var5_4) ** GOTO lbl37
                v5 /* !! */  = nz.tq;
                if (true) ** GOTO lbl44
                block67: while (true) {
                    v5 /* !! */  = (long)(v6 - nz.kzdt("kzyw", kzdx(int ), (int)214));
lbl44:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -2032231434: {
                            v6 = nz.kzdt("kzyx", kzdx(int ), (int)215);
                            continue block67;
                        }
                        case 1293686697: {
                            break block67;
                        }
                        case 1719894669: {
                            v6 = nz.kzdt("kzyy", kzdx(int ), (int)216);
                            continue block67;
                        }
                    }
                    break;
                }
                var2_5 = nv.find(var0);
                if (var5_4 || var5_4) ** GOTO lbl37
                v7 /* !! */  = nz.tq;
                if (true) ** GOTO lbl59
                block68: while (true) {
                    v7 /* !! */  = (long)(nz.kzdt("kzza", kzdx(int ), (int)218) - nz.kzdt("kzyz", kzdx(int ), (int)217));
lbl59:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -506287568: {
                            continue block68;
                        }
                        case 1293686697: {
                            break block68;
                        }
                    }
                    break;
                }
                if (var2_5.found()) break block100;
                if (var5_4 || var5_4) ** GOTO lbl37
                return;
            }
            if (var5_4 || var5_4) ** GOTO lbl37
            while (true) {
                if ((v8 /* !! */  = (cfr_temp_1 = nz.tq - nz.kzdt("kzzb", kzdx(int ), (int)219)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v8 /* !! */  == nz.kzdt("kzzc", kzdq(int ), (int)331)) break;
                v8 /* !! */  = (long)nz.kzdt("kzzd", kzdq(int ), (int)332);
            }
            v9 = var0.toString();
            while (true) {
                if ((v10 /* !! */  = (cfr_temp_2 = nz.tq - nz.kzdt("kzze", kzdx(int ), (int)220)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v10 /* !! */  == nz.kzdt("kzzf", kzdq(int ), (int)333)) break;
                v10 /* !! */  = (long)nz.kzdt("kzzg", kzdq(int ), (int)334);
            }
            v11 = System.nanoTime();
            while (true) {
                if ((v12 /* !! */  = (cfr_temp_3 = nz.tq - nz.kzdt("kzzh", kzdx(int ), (int)221)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v12 /* !! */  == nz.kzdt("kzzi", kzdq(int ), (int)335)) break;
                v12 /* !! */  = (long)nz.kzdt("kzzj", kzdq(int ), (int)336);
            }
            var3_6 = "swapAndUse_" + v9 + "_" + v11;
            if (var5_4 || var5_4) ** GOTO lbl37
            v13 /* !! */  = nz.tq;
            if (true) ** GOTO lbl92
            block72: while (true) {
                v13 /* !! */  = (long)(v14 - nz.kzdt("kzzk", kzdx(int ), (int)222));
lbl92:
                // 2 sources

                switch ((int)v13 /* !! */ ) {
                    case -1832194262: {
                        v14 = nz.kzdt("kzzl", kzdx(int ), (int)223);
                        continue block72;
                    }
                    case -1625511229: {
                        v14 = nz.kzdt("kzzm", kzdx(int ), (int)224);
                        continue block72;
                    }
                    case 1293686697: {
                        break block72;
                    }
                }
                break;
            }
            if (!var2_5.isHotbar()) break block101;
            if (var5_4 || var5_4) ** GOTO lbl37
            v15 /* !! */  = nz.tq;
            if (true) ** GOTO lbl107
            block73: while (true) {
                v15 /* !! */  = (long)(v16 - nz.kzdt("kzzn", kzdx(int ), (int)225));
lbl107:
                // 2 sources

                switch ((int)v15 /* !! */ ) {
                    case -1857308043: {
                        v16 = nz.kzdt("kzzo", kzdx(int ), (int)226);
                        continue block73;
                    }
                    case 1122540967: {
                        v16 = nz.kzdt("kzzp", kzdx(int ), (int)227);
                        continue block73;
                    }
                    case 1293686697: {
                        break block73;
                    }
                    case 1690067291: {
                        v16 = nz.kzdt("kzzq", kzdx(int ), (int)228);
                        continue block73;
                    }
                }
                break;
            }
            v17 = (Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, lambda$swapAndUse$0(ruhack.phobia.nu ), ()V)((nu)var2_5);
            v18 /* !! */  = nz.tq;
            if (true) ** GOTO lbl124
            block74: while (true) {
                v18 /* !! */  = (long)(nz.kzdt("kzzs", kzdx(int ), (int)230) - nz.kzdt("kzzr", kzdx(int ), (int)229));
lbl124:
                // 2 sources

                switch ((int)v18 /* !! */ ) {
                    case 1293686697: {
                        break block74;
                    }
                    case 1684006428: {
                        continue block74;
                    }
                }
                break;
            }
            nz.queueSwapInstant(var3_6, var1_1, v17, null);
            if (var5_4) ** GOTO lbl37
            if (var7_2) {
                throw null;
            }
            ** GOTO lbl165
        }
        if (var5_4 || var5_4) ** GOTO lbl37
        while (true) {
            if ((v19 /* !! */  = (cfr_temp_4 = nz.tq - nz.kzdt("kzzt", kzdx(int ), (int)231)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v19 /* !! */  == nz.kzdt("kzzu", kzdq(int ), (int)337)) break;
            v19 /* !! */  = (long)nz.kzdt("kzzv", kzdq(int ), (int)338);
        }
        var4_7 = nv.currentSlot();
        if (var5_4 || var5_4) ** GOTO lbl37
        if (var6_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var6_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v20 /* !! */  = (cfr_temp_5 = nz.tq - nz.kzdt("kzzw", kzdx(int ), (int)232)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v20 /* !! */  == nz.kzdt("kzzx", kzdq(int ), (int)339)) break;
                    v20 /* !! */  = (long)nz.kzdt("kzzy", kzdq(int ), (int)340);
                }
                v21 = (Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, lambda$swapAndUse$1(ruhack.phobia.nu int ), ()V)((nu)var2_5, (int)var4_7);
                v22 /* !! */  = nz.tq;
                if (true) ** GOTO lbl157
                block77: while (true) {
                    v22 /* !! */  = (long)(nz.kzdt("laaa", kzdx(int ), (int)234) - nz.kzdt("kzzz", kzdx(int ), (int)233));
lbl157:
                    // 2 sources

                    switch ((int)v22 /* !! */ ) {
                        case 1293686697: {
                            break block77;
                        }
                        case 1765581190: {
                            continue block77;
                        }
                    }
                    break;
                }
                nz.queueSwapInstant(var3_6, var1_1, v21, null);
                if (var5_4) ** GOTO lbl37
lbl165:
                // 2 sources

                if (!var5_4 && !var5_4) ** break;
                ** continue;
                return;
            }
lbl168:
            // 2 sources

            case 0: {
                var6_3 /* !! */  = (int)nz.kzdt("laab", kzdq(int ), (int)341);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl226
            }
lbl173:
            // 3 sources

            case 1: {
                var6_3 /* !! */  = (int)nz.kzdt("laac", kzdq(int ), (int)342);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl188
            }
lbl178:
            // 3 sources

            case 2: {
                var6_3 /* !! */  = (int)nz.kzdt("laad", kzdq(int ), (int)343);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl209
            }
lbl183:
            // 2 sources

            case 3: {
                var6_3 /* !! */  = (int)nz.kzdt("laae", kzdq(int ), (int)344);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl252
            }
lbl188:
            // 3 sources

            case 4: {
                var6_3 /* !! */  = (int)nz.kzdt("laaf", kzdq(int ), (int)345);
                if (!var7_2) ** GOTO lbl173
                throw null;
            }
            case 5: {
                var6_3 /* !! */  = (int)nz.kzdt("laag", kzdq(int ), (int)346);
                if (!var7_2) ** GOTO lbl173
                throw null;
            }
lbl196:
            // 2 sources

            case 6: {
                var6_3 /* !! */  = (int)nz.kzdt("laah", kzdq(int ), (int)347);
                if (var7_2) {
                    throw null;
                }
            }
lbl200:
            // 4 sources

            case 7: {
                var6_3 /* !! */  = (int)nz.kzdt("laai", kzdq(int ), (int)348);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl218
            }
lbl205:
            // 2 sources

            case 8: {
                var6_3 /* !! */  = (int)nz.kzdt("laaj", kzdq(int ), (int)349);
                if (!var7_2) ** GOTO lbl178
                throw null;
            }
lbl209:
            // 4 sources

            case 9: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var6_3 /* !! */  = (int)nz.kzdt("laak", kzdq(int ), (int)350);
                    if (!var7_2) ** GOTO lbl178
                    throw null;
                }
            }
            case 10: {
                var6_3 /* !! */  = (int)nz.kzdt("laal", kzdq(int ), (int)351);
                if (!var7_2) ** GOTO lbl205
                throw null;
            }
lbl218:
            // 3 sources

            case 11: {
                var6_3 /* !! */  = (int)nz.kzdt("laam", kzdq(int ), (int)352);
                if (!var7_2) ** GOTO lbl196
                throw null;
            }
            case 12: {
                var6_3 /* !! */  = (int)nz.kzdt("laan", kzdq(int ), (int)353);
                if (!var7_2) ** GOTO lbl188
                throw null;
            }
lbl226:
            // 2 sources

            case 13: {
                var6_3 /* !! */  = (int)nz.kzdt("laao", kzdq(int ), (int)354);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl235
            }
lbl231:
            // 2 sources

            case 14: {
                var6_3 /* !! */  = (int)nz.kzdt("laap", kzdq(int ), (int)355);
                if (!var7_2) ** GOTO lbl183
                throw null;
            }
lbl235:
            // 2 sources

            case 15: {
                var6_3 /* !! */  = (int)nz.kzdt("laaq", kzdq(int ), (int)356);
                if (!var7_2) ** GOTO lbl209
                throw null;
            }
            case 16: {
                var6_3 /* !! */  = (int)nz.kzdt("laar", kzdq(int ), (int)357);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl260
            }
            case 17: {
                var6_3 /* !! */  = (int)nz.kzdt("laas", kzdq(int ), (int)358);
                if (!var7_2) ** GOTO lbl218
                throw null;
            }
            case 18: {
                var6_3 /* !! */  = (int)nz.kzdt("laat", kzdq(int ), (int)359);
                if (!var7_2) ** GOTO lbl200
                throw null;
            }
lbl252:
            // 2 sources

            case 19: {
                var6_3 /* !! */  = (int)nz.kzdt("laau", kzdq(int ), (int)360);
                if (!var7_2) ** GOTO lbl231
                throw null;
            }
            case 20: {
                var6_3 /* !! */  = (int)nz.kzdt("laav", kzdq(int ), (int)361);
                if (!var7_2) ** GOTO lbl168
                throw null;
            }
lbl260:
            // 2 sources

            case 21: {
                var6_3 /* !! */  = (int)nz.kzdt("laaw", kzdq(int ), (int)362);
                if (!var7_2) ** GOTO lbl209
                throw null;
            }
            case 22: 
        }
        var6_3 /* !! */  = (int)nz.kzdt("laax", kzdq(int ), (int)363);
        ** while (!var7_2)
lbl267:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ void lambda$swapAndUseSilent$2(nu var0) {
        v0 /* !! */  = nz.tq;
        if (true) ** GOTO lbl5
        block35: while (true) {
            v0 /* !! */  = (long)(v1 - nz.kzdt("laki", kzdx(int ), (int)332));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -699930341: {
                    v1 = nz.kzdt("lakj", kzdx(int ), (int)333);
                    continue block35;
                }
                case 138130644: {
                    v1 = nz.kzdt("lakk", kzdx(int ), (int)334);
                    continue block35;
                }
                case 1293686697: {
                    break block35;
                }
            }
            break;
        }
        var3_1 = nz.c;
        v2 /* !! */  = nz.tq;
        if (true) ** GOTO lbl19
        block36: while (true) {
            v2 /* !! */  = (long)(nz.kzdt("lakm", kzdx(int ), (int)336) - nz.kzdt("lakl", kzdx(int ), (int)335));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -767313806: {
                    continue block36;
                }
                case 1293686697: {
                    break block36;
                }
            }
            break;
        }
        var2_2 = nz.b;
        v3 /* !! */  = nz.tq;
        if (true) ** GOTO lbl29
        block37: while (true) {
            v3 /* !! */  = (long)(v4 - nz.kzdt("lakn", kzdx(int ), (int)337));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1922749224: {
                    v4 = nz.kzdt("lako", kzdx(int ), (int)338);
                    continue block37;
                }
                case -973552258: {
                    v4 = nz.kzdt("lakp", kzdx(int ), (int)339);
                    continue block37;
                }
                case 498624969: {
                    v4 = nz.kzdt("lakq", kzdx(int ), (int)340);
                    continue block37;
                }
                case 1293686697: {
                    break block37;
                }
            }
            break;
        }
        var1_3 = nz.a;
        if (var3_1) {
            throw null;
lbl44:
            // 5 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl44
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_0 = nz.tq - nz.kzdt("lakr", kzdx(int ), (int)341)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == nz.kzdt("laks", kzdq(int ), (int)511)) break;
            v5 /* !! */  = (long)nz.kzdt("lakt", kzdq(int ), (int)512);
        }
        nv.saveSlot();
        if (var1_3 || var1_3) ** GOTO lbl44
        v6 /* !! */  = nz.tq;
        if (true) ** GOTO lbl58
        block40: while (true) {
            v6 /* !! */  = (long)(nz.kzdt("lakv", kzdx(int ), (int)343) - nz.kzdt("laku", kzdx(int ), (int)342));
lbl58:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case 444248604: {
                    continue block40;
                }
                case 1293686697: {
                    break block40;
                }
            }
            break;
        }
        v7 = var0.slot();
        v8 /* !! */  = nz.tq;
        if (true) ** GOTO lbl68
        block41: while (true) {
            v8 /* !! */  = (long)(nz.kzdt("lakx", kzdx(int ), (int)345) - nz.kzdt("lakw", kzdx(int ), (int)344));
lbl68:
            // 2 sources

            switch ((int)v8 /* !! */ ) {
                case 293336576: {
                    continue block41;
                }
                case 1293686697: {
                    break block41;
                }
            }
            break;
        }
        nv.selectSlotSilent(v7);
        if (var1_3 || var1_3) ** GOTO lbl44
        while (true) {
            if ((v9 /* !! */  = (cfr_temp_1 = nz.tq - nz.kzdt("laky", kzdx(int ), (int)346)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v9 /* !! */  == nz.kzdt("lakz", kzdq(int ), (int)513)) break;
            v9 /* !! */  = (long)nz.kzdt("lala", kzdq(int ), (int)514);
        }
        v10 /* !! */  = nz.tq;
        if (true) ** GOTO lbl84
        block43: while (true) {
            v10 /* !! */  = (long)(v11 - nz.kzdt("lalb", kzdx(int ), (int)347));
lbl84:
            // 2 sources

            switch ((int)v10 /* !! */ ) {
                case -2099576543: {
                    v11 = nz.kzdt("lalc", kzdx(int ), (int)348);
                    continue block43;
                }
                case -492880911: {
                    v11 = nz.kzdt("lald", kzdx(int ), (int)349);
                    continue block43;
                }
                case 1293686697: {
                    break block43;
                }
                case 1666486065: {
                    v11 = nz.kzdt("lale", kzdx(int ), (int)350);
                    continue block43;
                }
            }
            break;
        }
        nv.use(class_1268.field_5808);
        if (var1_3 || var1_3) ** GOTO lbl44
        v12 /* !! */  = nz.tq;
        if (true) ** GOTO lbl102
        block44: while (true) {
            v12 /* !! */  = (long)(v13 - nz.kzdt("lalf", kzdx(int ), (int)351));
lbl102:
            // 2 sources

            switch ((int)v12 /* !! */ ) {
                case -991248008: {
                    v13 = nz.kzdt("lalg", kzdx(int ), (int)352);
                    continue block44;
                }
                case 463363385: {
                    v13 = nz.kzdt("lalh", kzdx(int ), (int)353);
                    continue block44;
                }
                case 678152867: {
                    v13 = nz.kzdt("lali", kzdx(int ), (int)354);
                    continue block44;
                }
                case 1293686697: {
                    break block44;
                }
            }
            break;
        }
        nv.restoreSlotSilent();
        ** while (var1_3 || var1_3)
lbl116:
        // 1 sources

    }
}

