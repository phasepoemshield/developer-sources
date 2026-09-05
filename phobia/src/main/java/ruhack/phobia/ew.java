/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1268
 *  net.minecraft.class_1792
 *  net.minecraft.class_1802
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.List;
import net.minecraft.class_1268;
import net.minecraft.class_1792;
import net.minecraft.class_1802;
import ruhack.phobia.aw;
import ruhack.phobia.cn;
import ruhack.phobia.df;
import ruhack.phobia.dj;
import ruhack.phobia.ds;
import ruhack.phobia.du;
import ruhack.phobia.ew$ActionPhase;
import ruhack.phobia.ex;
import ruhack.phobia.jx;
import ruhack.phobia.ka;
import ruhack.phobia.kf;
import ruhack.phobia.nv;
import ruhack.phobia.nx;
import ruhack.phobia.pp;

public class ew
extends ds {
    private final List<ex> itemBinds;
    private static long[] bjkn;
    private final ka explicitDust;
    private int targetSlot;
    private final ka trap;
    private final ka fireTornado;
    static final long dl = 1376046606243192747L;
    public static final boolean a;
    private long actionAt;
    private final ka divineAura;
    private final kf mode;
    public static final int b;
    private final nx movement;
    private int previousSlot;
    private int temporaryHotbarSlot;
    private boolean fromHotbar;
    private final ka disorientation;
    public static final boolean c;
    private ew$ActionPhase phase;
    private long restoreAt;
    private final ka layer;
    private static int[] bjky;
    private static int[] bjkz;
    private static long[] bjko;
    private final ka snowball;
    private int stopTicks;

    private static /* synthetic */ void blak() {
        ew.bjkz[0] = -3778690;
        ew.bjkz[1] = -748017361;
        ew.bjkz[2] = -581038008;
        ew.bjkz[3] = 653620850;
        ew.bjkz[4] = 820456024;
        ew.bjkz[5] = -838637482;
        ew.bjkz[6] = 328596395;
        ew.bjkz[7] = 2045235820;
        ew.bjkz[8] = -1949212628;
        ew.bjkz[9] = -1427095392;
        ew.bjkz[10] = 473459385;
        ew.bjkz[11] = -2057820893;
        ew.bjkz[12] = -115491204;
        ew.bjkz[13] = 339133150;
        ew.bjkz[14] = -664235909;
        ew.bjkz[15] = -1659336751;
        ew.bjkz[16] = 144313392;
        ew.bjkz[17] = -1918300515;
        ew.bjkz[18] = -948074702;
        ew.bjkz[19] = 555284112;
        ew.bjkz[20] = 719201067;
        ew.bjkz[21] = 2135954406;
        ew.bjkz[22] = 1202062000;
        ew.bjkz[23] = 1388426783;
        ew.bjkz[24] = -1998103363;
        ew.bjkz[25] = 955840670;
        ew.bjkz[26] = 1382306787;
        ew.bjkz[27] = -1872170960;
        ew.bjkz[28] = 1871614386;
        ew.bjkz[29] = -713230793;
        ew.bjkz[30] = 183066516;
        ew.bjkz[31] = -335255192;
        ew.bjkz[32] = 2011691787;
        ew.bjkz[33] = 1416374998;
        ew.bjkz[34] = -1374179781;
        ew.bjkz[35] = -517949790;
        ew.bjkz[36] = -1809455556;
        ew.bjkz[37] = -970378821;
        ew.bjkz[38] = -879518232;
        ew.bjkz[39] = -1492806621;
        ew.bjkz[40] = 797168002;
        ew.bjkz[41] = -242184682;
        ew.bjkz[42] = -723919452;
        ew.bjkz[43] = -535416634;
        ew.bjkz[44] = -1422956321;
        ew.bjkz[45] = 1779595154;
        ew.bjkz[46] = 1820169954;
        ew.bjkz[47] = -403727142;
        ew.bjkz[48] = -351365840;
        ew.bjkz[49] = -1341964835;
        ew.bjkz[50] = -1753520980;
        ew.bjkz[51] = 1506067274;
        ew.bjkz[52] = 300869758;
        ew.bjkz[53] = -1584406424;
        ew.bjkz[54] = 1986529823;
        ew.bjkz[55] = -1407299330;
        ew.bjkz[56] = 1146026899;
        ew.bjkz[57] = -251797909;
        ew.bjkz[58] = 791649305;
        ew.bjkz[59] = 10956417;
        ew.bjkz[60] = 854036688;
        ew.bjkz[61] = 1237943083;
        ew.bjkz[62] = 976294448;
        ew.bjkz[63] = -166432796;
        ew.bjkz[64] = -1172074434;
        ew.bjkz[65] = -1113181569;
        ew.bjkz[66] = 298676965;
        ew.bjkz[67] = -507388191;
        ew.bjkz[68] = -1626132254;
        ew.bjkz[69] = -1600620145;
        ew.bjkz[70] = -1052700904;
        ew.bjkz[71] = 881492802;
        ew.bjkz[72] = 2119689044;
        ew.bjkz[73] = -795220001;
        ew.bjkz[74] = 571506879;
        ew.bjkz[75] = 1962331523;
        ew.bjkz[76] = 1397477778;
        ew.bjkz[77] = 1840444555;
        ew.bjkz[78] = -709205806;
        ew.bjkz[79] = -1907341386;
        ew.bjkz[80] = -1635710959;
        ew.bjkz[81] = -1284017196;
        ew.bjkz[82] = 2130307209;
        ew.bjkz[83] = -1027280730;
        ew.bjkz[84] = 2145491989;
        ew.bjkz[85] = 680943834;
        ew.bjkz[86] = 703984073;
        ew.bjkz[87] = 1153606975;
        ew.bjkz[88] = 58417985;
        ew.bjkz[89] = -319422549;
        ew.bjkz[90] = -1468331301;
        ew.bjkz[91] = -346735571;
        ew.bjkz[92] = 764874865;
        ew.bjkz[93] = 249666428;
        ew.bjkz[94] = 1310101854;
        ew.bjkz[95] = 349714370;
        ew.bjkz[96] = -597440057;
        ew.bjkz[97] = 2086561077;
        ew.bjkz[98] = -1965815681;
        ew.bjkz[99] = 888615452;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public ew() {
        var2_1 /* !! */  = ew.b;
        var1_2 = ew.a;
        super("FuntimeHelper", "\u041f\u043e\u043c\u043e\u0449\u043d\u0438\u043a \u0434\u043b\u044f \u0438\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u043d\u0438\u044f \u0441\u043f\u0435\u0446\u0438\u0430\u043b\u044c\u043d\u044b\u0445 \u043f\u0440\u0435\u0434\u043c\u0435\u0442\u043e\u0432 Funtime", du.MISC);
        this.disorientation = new ka("\u0414\u0435\u0437\u043e\u0440\u0438\u0435\u043d\u0442\u0430\u0446\u0438\u044f", "\u0418\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u0442\u044c \u0434\u0435\u0437\u043e\u0440\u0438\u0435\u043d\u0442\u0430\u0446\u0438\u044e");
        this.trap = new ka("\u0422\u0440\u0430\u043f\u043a\u0430", "\u0418\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u0442\u044c \u0442\u0440\u0430\u043f\u043a\u0443");
        this.explicitDust = new ka("\u042f\u0432\u043d\u0430\u044f \u043f\u044b\u043b\u044c", "\u0418\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u0442\u044c \u044f\u0432\u043d\u0443\u044e \u043f\u044b\u043b\u044c");
        this.fireTornado = new ka("\u041e\u0433\u043d\u0435\u043d\u043d\u044b\u0439 \u0441\u043c\u0435\u0440\u0447", "\u0418\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u0442\u044c \u043e\u0433\u043d\u0435\u043d\u043d\u044b\u0439 \u0441\u043c\u0435\u0440\u0447");
        this.layer = new ka("\u041f\u043b\u0430\u0441\u0442", "\u0418\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u0442\u044c \u043f\u043b\u0430\u0441\u0442");
        this.divineAura = new ka("\u0411\u043e\u0436\u044c\u044f \u0430\u0443\u0440\u0430", "\u0418\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u0442\u044c \u0431\u043e\u0436\u044c\u044e \u0430\u0443\u0440\u0443");
        this.snowball = new ka("\u0421\u043d\u0435\u0436\u043e\u043a", "\u0418\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u0442\u044c \u0441\u043d\u0435\u0436\u043e\u043a");
        this.mode = new kf("\u0420\u0435\u0436\u0438\u043c \u0441\u0432\u0430\u043f\u0430", "\u0411\u044b\u0441\u0442\u0440\u044b\u0439 - \u043c\u043e\u043c\u0435\u043d\u0442\u0430\u043b\u044c\u043d\u043e, ReallyWorld - \u0437\u0430\u0434\u0435\u0440\u0436\u043a\u0430 \u043f\u043e\u043b \u0442\u0438\u043a\u0430, New - \u043e\u0441\u0442\u0430\u043d\u043e\u0432\u043a\u0430 \u043d\u0430 \u0442\u0438\u043a", "\u0411\u044b\u0441\u0442\u0440\u044b\u0439", new String[]{"\u0411\u044b\u0441\u0442\u0440\u044b\u0439", "ReallyWorld", "New"});
        this.movement = new nx();
        this.phase = ew$ActionPhase.IDLE;
        this.previousSlot = (int)ew.bjkp("bjli", bjkx(int ), (int)6);
        this.targetSlot = (int)ew.bjkp("bjlj", bjkx(int ), (int)7);
        this.temporaryHotbarSlot = (int)ew.bjkp("bjlk", bjkx(int ), (int)8);
        this.itemBinds = List.of(new ex("FT", class_1802.field_8449, this.disorientation), new ex("FT", class_1802.field_22021, this.trap), new ex("FT", class_1802.field_8479, this.explicitDust), new ex("FT", class_1802.field_8814, this.fireTornado), new ex("FT", class_1802.field_8551, this.layer), new ex("FT", class_1802.field_8614, this.divineAura), new ex("FT", class_1802.field_8543, this.snowball));
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.settings(new jx[]{this.disorientation, this.trap, this.explicitDust, this.fireTornado, this.layer, this.divineAura, this.snowball, this.mode});
                return;
            }
lbl23:
            // 2 sources

            case 0: {
                var2_1 /* !! */  = (int)ew.bjkp("bjll", bjkx(int ), (int)9);
                ** GOTO lbl48
            }
lbl26:
            // 2 sources

            case 1: {
                var2_1 /* !! */  = (int)ew.bjkp("bjlm", bjkx(int ), (int)10);
                ** GOTO lbl48
            }
            case 2: {
                var2_1 /* !! */  = (int)ew.bjkp("bjln", bjkx(int ), (int)11);
                ** GOTO lbl26
            }
            case 3: {
                while (true) {
                    var2_1 /* !! */  = (int)ew.bjkp("bjlo", bjkx(int ), (int)12);
                }
            }
            case 4: {
                var2_1 /* !! */  = (int)ew.bjkp("bjlp", bjkx(int ), (int)13);
                ** GOTO lbl51
            }
            case 5: {
                var2_1 /* !! */  = (int)ew.bjkp("bjlq", bjkx(int ), (int)14);
                ** GOTO lbl48
            }
lbl42:
            // 2 sources

            case 6: {
                var2_1 /* !! */  = (int)ew.bjkp("bjlr", bjkx(int ), (int)15);
                ** GOTO lbl69
            }
            case 7: {
                var2_1 /* !! */  = (int)ew.bjkp("bjls", bjkx(int ), (int)16);
                break;
            }
lbl48:
            // 4 sources

            case 8: {
                var2_1 /* !! */  = (int)ew.bjkp("bjlt", bjkx(int ), (int)17);
                ** GOTO lbl57
            }
lbl51:
            // 2 sources

            case 9: {
                var2_1 /* !! */  = (int)ew.bjkp("bjlu", bjkx(int ), (int)18);
                ** GOTO lbl42
            }
lbl54:
            // 2 sources

            case 10: {
                var2_1 /* !! */  = (int)ew.bjkp("bjlv", bjkx(int ), (int)19);
                ** GOTO lbl23
            }
lbl57:
            // 3 sources

            case 11: {
                var2_1 /* !! */  = (int)ew.bjkp("bjlw", bjkx(int ), (int)20);
                ** GOTO lbl63
            }
lbl60:
            // 3 sources

            case 12: {
                var2_1 /* !! */  = (int)ew.bjkp("bjlx", bjkx(int ), (int)21);
                ** GOTO lbl57
            }
lbl63:
            // 3 sources

            case 13: {
                var2_1 /* !! */  = (int)ew.bjkp("bjly", bjkx(int ), (int)22);
                ** GOTO lbl60
            }
            case 14: {
                var2_1 /* !! */  = (int)ew.bjkp("bjlz", bjkx(int ), (int)23);
                ** GOTO lbl63
            }
lbl69:
            // 2 sources

            case 15: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)ew.bjkp("bjma", bjkx(int ), (int)24);
                    ** GOTO lbl60
                    break;
                }
            }
            case 16: {
                var2_1 /* !! */  = (int)ew.bjkp("bjmb", bjkx(int ), (int)25);
                ** GOTO lbl54
            }
            case 17: 
        }
        var2_1 /* !! */  = (int)ew.bjkp("bjmc", bjkx(int ), (int)26);
        ** while (true)
    }

    private static /* synthetic */ void bldn() {
        ew.bjkn[200] = 6721921074525844014L;
        ew.bjkn[201] = -2033228093476904773L;
        ew.bjkn[202] = 6425896630100510390L;
        ew.bjkn[203] = -3127926667387597300L;
        ew.bjkn[204] = 1461975611477958731L;
        ew.bjkn[205] = -3619016416099800261L;
        ew.bjkn[206] = -618019341140780896L;
        ew.bjkn[207] = -8778188751255192221L;
        ew.bjkn[208] = -9000850694838701982L;
        ew.bjkn[209] = 5594350321285800195L;
        ew.bjkn[210] = -2183205120004676158L;
        ew.bjkn[211] = 8652139248439528157L;
        ew.bjkn[212] = -8552613703179490642L;
        ew.bjkn[213] = 2460474739314689187L;
        ew.bjkn[214] = -7204022404879936854L;
        ew.bjkn[215] = 2646476091505822486L;
        ew.bjkn[216] = 3349072941058368496L;
        ew.bjkn[217] = -7702603691879633780L;
        ew.bjkn[218] = 7987096513883881100L;
        ew.bjkn[219] = -7319409991723751770L;
        ew.bjkn[220] = -8048402343442186182L;
        ew.bjkn[221] = 3456814294314217977L;
        ew.bjkn[222] = 7570387922020665722L;
        ew.bjkn[223] = 10344493182789629L;
        ew.bjkn[224] = -3068602782246172805L;
        ew.bjkn[225] = 3903730258219545582L;
        ew.bjkn[226] = -677039712730533063L;
        ew.bjkn[227] = 4708094381544662889L;
        ew.bjkn[228] = -5075160009583054150L;
        ew.bjkn[229] = 6319687692635410608L;
        ew.bjkn[230] = -7848871588179322405L;
        ew.bjkn[231] = -5532949047989744630L;
        ew.bjkn[232] = 6464464640000655504L;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public List<ex> getItemBinds() {
        boolean bl2;
        Object object = dl;
        boolean bl3 = true;
        block14: while (true) {
            CallSite callSite;
            if (!bl3 || (bl3 = false) || !true) {
                object = callSite - ew.bjkp("bjkq", bjkm(int ), (int)0);
            }
            switch ((int)object) {
                case -1427901825: {
                    callSite = ew.bjkp("bjkr", bjkm(int ), (int)1);
                    continue block14;
                }
                case 125951915: {
                    break block14;
                }
                case 974905071: {
                    callSite = ew.bjkp("bjks", bjkm(int ), (int)2);
                    continue block14;
                }
                case 2045378476: {
                    callSite = ew.bjkp("bjkt", bjkm(int ), (int)3);
                    continue block14;
                }
            }
            break;
        }
        boolean bl4 = c;
        Object object2 = dl;
        block15: while (true) {
            switch ((int)object2) {
                case 125951915: {
                    break block15;
                }
                case 953030960: {
                    object2 = ew.bjkp("bjkv", bjkm(int ), (int)5) - ew.bjkp("bjku", bjkm(int ), (int)4);
                    continue block15;
                }
            }
            break;
        }
        int n2 = b;
        while (true) {
            long l2;
            Object object3;
            if ((object3 = (l2 = dl - ew.bjkp("bjkw", bjkm(int ), (int)6)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (object3 == ew.bjkp("bjla", bjkx(int ), (int)0)) {
                bl2 = a;
                if (bl4) {
                    throw null;
                }
                break;
            }
            object3 = ew.bjkp("bjlb", bjkx(int ), (int)1);
        }
        if (bl2) return null;
        if (bl2) return null;
        Object object4 = dl;
        block17: while (true) {
            switch ((int)object4) {
                case 125951915: {
                    return this.itemBinds;
                }
                case 605510573: {
                    object4 = ew.bjkp("bjld", bjkm(int ), (int)8) - ew.bjkp("bjlc", bjkm(int ), (int)7);
                    continue block17;
                }
            }
            break;
        }
        return this.itemBinds;
    }

    private static /* synthetic */ void blbu() {
        ew.bjkz[300] = 1699508461;
        ew.bjkz[301] = -1104460748;
        ew.bjkz[302] = 258493018;
        ew.bjkz[303] = -1645231024;
        ew.bjkz[304] = 233132506;
        ew.bjkz[305] = -785322136;
        ew.bjkz[306] = -2121232202;
        ew.bjkz[307] = -927757521;
        ew.bjkz[308] = -693284253;
        ew.bjkz[309] = 697932426;
        ew.bjkz[310] = -268085600;
        ew.bjkz[311] = 673229678;
        ew.bjkz[312] = -1697750166;
        ew.bjkz[313] = -1625914405;
        ew.bjkz[314] = -1900885348;
        ew.bjkz[315] = -349058538;
        ew.bjkz[316] = -1483452363;
        ew.bjkz[317] = 839903222;
        ew.bjkz[318] = -334791876;
        ew.bjkz[319] = 640168831;
        ew.bjkz[320] = 185472068;
        ew.bjkz[321] = -1145924368;
        ew.bjkz[322] = 212212652;
        ew.bjkz[323] = -1296255043;
        ew.bjkz[324] = -1754213470;
        ew.bjkz[325] = -1265268130;
        ew.bjkz[326] = -181490657;
        ew.bjkz[327] = -272201045;
        ew.bjkz[328] = 1582614648;
        ew.bjkz[329] = -1058150834;
        ew.bjkz[330] = 155964734;
        ew.bjkz[331] = 1402805022;
        ew.bjkz[332] = 1087973781;
        ew.bjkz[333] = -1741608155;
        ew.bjkz[334] = -1181151539;
        ew.bjkz[335] = 151700148;
        ew.bjkz[336] = -1786746663;
        ew.bjkz[337] = 1085254835;
        ew.bjkz[338] = 85265562;
        ew.bjkz[339] = -995064927;
        ew.bjkz[340] = -1208821549;
        ew.bjkz[341] = -489167428;
        ew.bjkz[342] = -353170201;
        ew.bjkz[343] = 914924120;
        ew.bjkz[344] = -1408935282;
        ew.bjkz[345] = -564169755;
        ew.bjkz[346] = -408998869;
        ew.bjkz[347] = 224752766;
        ew.bjkz[348] = 1812572439;
        ew.bjkz[349] = 960413253;
        ew.bjkz[350] = 1503710921;
        ew.bjkz[351] = 1551436710;
        ew.bjkz[352] = 377825764;
        ew.bjkz[353] = 702836682;
        ew.bjkz[354] = 602451775;
        ew.bjkz[355] = -650341726;
        ew.bjkz[356] = 1967213127;
        ew.bjkz[357] = 1366816118;
        ew.bjkz[358] = 1191313591;
        ew.bjkz[359] = -1834134303;
        ew.bjkz[360] = 1014176190;
        ew.bjkz[361] = -815449842;
        ew.bjkz[362] = 946010482;
        ew.bjkz[363] = -569531741;
        ew.bjkz[364] = 1969670726;
        ew.bjkz[365] = -1773836779;
        ew.bjkz[366] = 2138569181;
        ew.bjkz[367] = 1980146995;
        ew.bjkz[368] = 1716579906;
        ew.bjkz[369] = -333846797;
        ew.bjkz[370] = -1041966603;
        ew.bjkz[371] = 1508225802;
        ew.bjkz[372] = -1409037102;
        ew.bjkz[373] = -1355074687;
        ew.bjkz[374] = 216892219;
        ew.bjkz[375] = 974825801;
        ew.bjkz[376] = 1267264878;
        ew.bjkz[377] = 1173492624;
        ew.bjkz[378] = -186594307;
        ew.bjkz[379] = -1555268369;
        ew.bjkz[380] = -1577355811;
        ew.bjkz[381] = -1613686537;
        ew.bjkz[382] = -1066444996;
        ew.bjkz[383] = 345450012;
        ew.bjkz[384] = -1022667626;
        ew.bjkz[385] = -230896737;
        ew.bjkz[386] = 1148333261;
        ew.bjkz[387] = -1859188082;
        ew.bjkz[388] = 171353676;
        ew.bjkz[389] = -986590892;
        ew.bjkz[390] = 1838777988;
        ew.bjkz[391] = -823159941;
        ew.bjkz[392] = 1768609855;
        ew.bjkz[393] = -1339554940;
        ew.bjkz[394] = 1802846245;
        ew.bjkz[395] = 1833040383;
        ew.bjkz[396] = 142338162;
        ew.bjkz[397] = 51571266;
        ew.bjkz[398] = 964157556;
        ew.bjkz[399] = 74221014;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private class_1792 getBoundItem(cn var1_1) {
        block166: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = ew.dl - ew.bjkp("bjvb", bjkm(int ), (int)32)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v0 /* !! */  == ew.bjkp("bjvc", bjkx(int ), (int)178)) break;
                v0 /* !! */  = (long)ew.bjkp("bjvd", bjkx(int ), (int)179);
            }
            var4_2 = ew.c;
            while (true) {
                if ((v1 /* !! */  = (cfr_temp_1 = ew.dl - ew.bjkp("bjve", bjkm(int ), (int)33)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v1 /* !! */  == ew.bjkp("bjvf", bjkx(int ), (int)180)) break;
                v1 /* !! */  = (long)ew.bjkp("bjvg", bjkx(int ), (int)181);
            }
            var3_3 /* !! */  = ew.b;
            v2 /* !! */  = ew.dl;
            if (true) ** GOTO lbl19
            block115: while (true) {
                v2 /* !! */  = (long)(v3 - ew.bjkp("bjvh", bjkm(int ), (int)34));
lbl19:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case -922397589: {
                        v3 = ew.bjkp("bjvi", bjkm(int ), (int)35);
                        continue block115;
                    }
                    case 125951915: {
                        break block115;
                    }
                    case 1011591079: {
                        v3 = ew.bjkp("bjvj", bjkm(int ), (int)36);
                        continue block115;
                    }
                }
                break;
            }
            var2_4 = ew.a;
            if (var4_2) {
                throw null;
lbl31:
                // 15 sources

                return null;
            }
            if (var2_4 || var2_4) ** GOTO lbl31
            while (true) {
                if ((v4 /* !! */  = (cfr_temp_2 = ew.dl - ew.bjkp("bjvk", bjkm(int ), (int)37)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v4 /* !! */  == ew.bjkp("bjvl", bjkx(int ), (int)182)) break;
                v4 /* !! */  = (long)ew.bjkp("bjvm", bjkx(int ), (int)183);
            }
            v5 /* !! */  = ew.dl;
            if (true) ** GOTO lbl44
            block118: while (true) {
                v5 /* !! */  = (long)(v6 - ew.bjkp("bjvn", bjkm(int ), (int)38));
lbl44:
                // 2 sources

                switch ((int)v5 /* !! */ ) {
                    case -1258696123: {
                        v6 = ew.bjkp("bjvo", bjkm(int ), (int)39);
                        continue block118;
                    }
                    case 125951915: {
                        break block118;
                    }
                    case 1288156944: {
                        v6 = ew.bjkp("bjvp", bjkm(int ), (int)40);
                        continue block118;
                    }
                }
                break;
            }
            if (!var1_1.isBindReleased(this.disorientation)) break block166;
            if (var2_4) ** GOTO lbl31
            v7 /* !! */  = ew.dl;
            if (true) ** GOTO lbl59
            block119: while (true) {
                v7 /* !! */  = (long)(ew.bjkp("bjvr", bjkm(int ), (int)42) - ew.bjkp("bjvq", bjkm(int ), (int)41));
lbl59:
                // 2 sources

                switch ((int)v7 /* !! */ ) {
                    case 125951915: {
                        break block119;
                    }
                    case 1590124473: {
                        continue block119;
                    }
                }
                break;
            }
            return class_1802.field_8449;
        }
        if (var2_4 || var2_4) ** GOTO lbl31
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v8 /* !! */  = ew.dl;
                if (true) ** GOTO lbl74
                block120: while (true) {
                    v8 /* !! */  = (long)(ew.bjkp("bjvt", bjkm(int ), (int)44) - ew.bjkp("bjvs", bjkm(int ), (int)43));
lbl74:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case 125951915: {
                            break block120;
                        }
                        case 1139736069: {
                            continue block120;
                        }
                    }
                    break;
                }
                v9 /* !! */  = ew.dl;
                if (true) ** GOTO lbl83
                block121: while (true) {
                    v9 /* !! */  = (long)(ew.bjkp("bjvv", bjkm(int ), (int)46) - ew.bjkp("bjvu", bjkm(int ), (int)45));
lbl83:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -917559788: {
                            continue block121;
                        }
                        case 125951915: {
                            break block121;
                        }
                    }
                    break;
                }
                if (!var1_1.isBindReleased(this.trap)) ** GOTO lbl100
                if (var2_4) ** GOTO lbl31
                v10 /* !! */  = ew.dl;
                if (true) ** GOTO lbl94
                block122: while (true) {
                    v10 /* !! */  = (long)(ew.bjkp("bjvx", bjkm(int ), (int)48) - ew.bjkp("bjvw", bjkm(int ), (int)47));
lbl94:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case 125951915: {
                            break block122;
                        }
                        case 1580949441: {
                            continue block122;
                        }
                    }
                    break;
                }
                return class_1802.field_22021;
lbl100:
                // 1 sources

                if (var2_4 || var2_4) ** GOTO lbl31
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_3 = ew.dl - ew.bjkp("bjvy", bjkm(int ), (int)49)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v11 /* !! */  == ew.bjkp("bjvz", bjkx(int ), (int)184)) break;
                    v11 /* !! */  = (long)ew.bjkp("bjwa", bjkx(int ), (int)185);
                }
                v12 /* !! */  = ew.dl;
                if (true) ** GOTO lbl111
                block124: while (true) {
                    v12 /* !! */  = (long)(v13 - ew.bjkp("bjwb", bjkm(int ), (int)50));
lbl111:
                    // 2 sources

                    switch ((int)v12 /* !! */ ) {
                        case -1951439564: {
                            v13 = ew.bjkp("bjwc", bjkm(int ), (int)51);
                            continue block124;
                        }
                        case -53360362: {
                            v13 = ew.bjkp("bjwd", bjkm(int ), (int)52);
                            continue block124;
                        }
                        case 125951915: {
                            break block124;
                        }
                    }
                    break;
                }
                if (!var1_1.isBindReleased(this.explicitDust)) ** GOTO lbl139
                if (var2_4) ** GOTO lbl31
                v14 /* !! */  = ew.dl;
                if (true) ** GOTO lbl126
                block125: while (true) {
                    v14 /* !! */  = (long)(v15 - ew.bjkp("bjwe", bjkm(int ), (int)53));
lbl126:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case -1376288384: {
                            v15 = ew.bjkp("bjwf", bjkm(int ), (int)54);
                            continue block125;
                        }
                        case -811149726: {
                            v15 = ew.bjkp("bjwg", bjkm(int ), (int)55);
                            continue block125;
                        }
                        case 125951915: {
                            break block125;
                        }
                        case 1426879248: {
                            v15 = ew.bjkp("bjwh", bjkm(int ), (int)56);
                            continue block125;
                        }
                    }
                    break;
                }
                return class_1802.field_8479;
lbl139:
                // 1 sources

                if (var2_4 || var2_4) ** GOTO lbl31
                v16 /* !! */  = ew.dl;
                if (true) ** GOTO lbl144
                block126: while (true) {
                    v16 /* !! */  = (long)(v17 - ew.bjkp("bjwi", bjkm(int ), (int)57));
lbl144:
                    // 2 sources

                    switch ((int)v16 /* !! */ ) {
                        case -1969379815: {
                            v17 = ew.bjkp("bjwj", bjkm(int ), (int)58);
                            continue block126;
                        }
                        case 125951915: {
                            break block126;
                        }
                        case 619125685: {
                            v17 = ew.bjkp("bjwk", bjkm(int ), (int)59);
                            continue block126;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v18 /* !! */  = (cfr_temp_4 = ew.dl - ew.bjkp("bjwl", bjkm(int ), (int)60)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v18 /* !! */  == ew.bjkp("bjwm", bjkx(int ), (int)186)) break;
                    v18 /* !! */  = (long)ew.bjkp("bjwn", bjkx(int ), (int)187);
                }
                if (!var1_1.isBindReleased(this.fireTornado)) ** GOTO lbl175
                if (var2_4) ** GOTO lbl31
                v19 /* !! */  = ew.dl;
                if (true) ** GOTO lbl165
                block128: while (true) {
                    v19 /* !! */  = (long)(v20 - ew.bjkp("bjwo", bjkm(int ), (int)61));
lbl165:
                    // 2 sources

                    switch ((int)v19 /* !! */ ) {
                        case -848939450: {
                            v20 = ew.bjkp("bjwp", bjkm(int ), (int)62);
                            continue block128;
                        }
                        case -485240911: {
                            v20 = ew.bjkp("bjwq", bjkm(int ), (int)63);
                            continue block128;
                        }
                        case 125951915: {
                            break block128;
                        }
                    }
                    break;
                }
                return class_1802.field_8814;
lbl175:
                // 1 sources

                if (var2_4 || var2_4) ** GOTO lbl31
                v21 /* !! */  = ew.dl;
                if (true) ** GOTO lbl180
                block129: while (true) {
                    v21 /* !! */  = (long)(ew.bjkp("bjwu", bjkm(int ), (int)65) - ew.bjkp("bjws", bjkm(int ), (int)64));
lbl180:
                    // 2 sources

                    switch ((int)v21 /* !! */ ) {
                        case -1033514278: {
                            continue block129;
                        }
                        case 125951915: {
                            break block129;
                        }
                    }
                    break;
                }
                v22 /* !! */  = ew.dl;
                if (true) ** GOTO lbl189
                block130: while (true) {
                    v22 /* !! */  = (long)(v23 - ew.bjkp("bjww", bjkm(int ), (int)66));
lbl189:
                    // 2 sources

                    switch ((int)v22 /* !! */ ) {
                        case -1504075648: {
                            v23 = ew.bjkp("bjwx", bjkm(int ), (int)67);
                            continue block130;
                        }
                        case -1279972971: {
                            v23 = ew.bjkp("bjwz", bjkm(int ), (int)68);
                            continue block130;
                        }
                        case 125951915: {
                            break block130;
                        }
                    }
                    break;
                }
                if (!var1_1.isBindReleased(this.layer)) ** GOTO lbl214
                if (var2_4) ** GOTO lbl31
                v24 /* !! */  = ew.dl;
                if (true) ** GOTO lbl204
                block131: while (true) {
                    v24 /* !! */  = (long)(v25 - ew.bjkp("bjxc", bjkm(int ), (int)69));
lbl204:
                    // 2 sources

                    switch ((int)v24 /* !! */ ) {
                        case -276159967: {
                            v25 = ew.bjkp("bjxd", bjkm(int ), (int)70);
                            continue block131;
                        }
                        case 125951915: {
                            break block131;
                        }
                        case 483561508: {
                            v25 = ew.bjkp("bjxf", bjkm(int ), (int)71);
                            continue block131;
                        }
                    }
                    break;
                }
                return class_1802.field_8551;
lbl214:
                // 1 sources

                if (var2_4 || var2_4) ** GOTO lbl31
                v26 /* !! */  = ew.dl;
                if (true) ** GOTO lbl219
                block132: while (true) {
                    v26 /* !! */  = (long)(ew.bjkp("bjxj", bjkm(int ), (int)73) - ew.bjkp("bjxi", bjkm(int ), (int)72));
lbl219:
                    // 2 sources

                    switch ((int)v26 /* !! */ ) {
                        case -1703125979: {
                            continue block132;
                        }
                        case 125951915: {
                            break block132;
                        }
                    }
                    break;
                }
                v27 /* !! */  = ew.dl;
                if (true) ** GOTO lbl228
                block133: while (true) {
                    v27 /* !! */  = (long)(v28 - ew.bjkp("bjxr", bjkm(int ), (int)74));
lbl228:
                    // 2 sources

                    switch ((int)v27 /* !! */ ) {
                        case -982214664: {
                            v28 = ew.bjkp("bjxt", bjkm(int ), (int)75);
                            continue block133;
                        }
                        case -710522744: {
                            v28 = ew.bjkp("bjxu", bjkm(int ), (int)76);
                            continue block133;
                        }
                        case 125951915: {
                            break block133;
                        }
                        case 1013777783: {
                            v28 = ew.bjkp("bjxv", bjkm(int ), (int)77);
                            continue block133;
                        }
                    }
                    break;
                }
                if (!var1_1.isBindReleased(this.divineAura)) ** GOTO lbl256
                if (var2_4) ** GOTO lbl31
                v29 /* !! */  = ew.dl;
                if (true) ** GOTO lbl246
                block134: while (true) {
                    v29 /* !! */  = (long)(v30 - ew.bjkp("bjxw", bjkm(int ), (int)78));
lbl246:
                    // 2 sources

                    switch ((int)v29 /* !! */ ) {
                        case -1983217752: {
                            v30 = ew.bjkp("bjxx", bjkm(int ), (int)79);
                            continue block134;
                        }
                        case 125951915: {
                            break block134;
                        }
                        case 1818195698: {
                            v30 = ew.bjkp("bjxy", bjkm(int ), (int)80);
                            continue block134;
                        }
                    }
                    break;
                }
                return class_1802.field_8614;
lbl256:
                // 1 sources

                if (var2_4 || var2_4) ** GOTO lbl31
                while (true) {
                    if ((v31 /* !! */  = (cfr_temp_5 = ew.dl - ew.bjkp("bjya", bjkm(int ), (int)81)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v31 /* !! */  == ew.bjkp("bjyb", bjkx(int ), (int)188)) break;
                    v31 /* !! */  = (long)ew.bjkp("bjyd", bjkx(int ), (int)189);
                }
                v32 /* !! */  = ew.dl;
                if (true) ** GOTO lbl267
                block136: while (true) {
                    v32 /* !! */  = (long)(v33 - ew.bjkp("bjye", bjkm(int ), (int)82));
lbl267:
                    // 2 sources

                    switch ((int)v32 /* !! */ ) {
                        case -1768376546: {
                            v33 = ew.bjkp("bjyf", bjkm(int ), (int)83);
                            continue block136;
                        }
                        case -177682083: {
                            v33 = ew.bjkp("bjyh", bjkm(int ), (int)84);
                            continue block136;
                        }
                        case 125951915: {
                            break block136;
                        }
                        case 246781132: {
                            v33 = ew.bjkp("bjyk", bjkm(int ), (int)85);
                            continue block136;
                        }
                    }
                    break;
                }
                if (!var1_1.isBindReleased(this.snowball)) ** GOTO lbl288
                if (var2_4) ** GOTO lbl31
                while (true) {
                    if ((v34 /* !! */  = (cfr_temp_6 = ew.dl - ew.bjkp("bjyo", bjkm(int ), (int)86)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v34 /* !! */  == ew.bjkp("bjyq", bjkx(int ), (int)190)) break;
                    v34 /* !! */  = (long)ew.bjkp("bjys", bjkx(int ), (int)191);
                }
                return class_1802.field_8543;
lbl288:
                // 1 sources

                if (!var2_4 && !var2_4) ** break;
                ** continue;
                return null;
            }
            case 0: {
                var3_3 /* !! */  = (int)ew.bjkp("bjza", bjkx(int ), (int)192);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl311
            }
lbl296:
            // 2 sources

            case 1: {
                var3_3 /* !! */  = (int)ew.bjkp("bjzc", bjkx(int ), (int)193);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl393
            }
            case 2: {
                do {
                    var3_3 /* !! */  = (int)ew.bjkp("bjzg", bjkx(int ), (int)194);
                } while (!var4_2);
                throw null;
            }
lbl306:
            // 3 sources

            case 3: {
                var3_3 /* !! */  = (int)ew.bjkp("bjzj", bjkx(int ), (int)195);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl315
            }
lbl311:
            // 5 sources

            case 4: {
                var3_3 /* !! */  = (int)ew.bjkp("bjzk", bjkx(int ), (int)196);
                if (!var4_2) ** GOTO lbl306
                throw null;
            }
lbl315:
            // 3 sources

            case 5: {
                var3_3 /* !! */  = (int)ew.bjkp("bjzo", bjkx(int ), (int)197);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl329
            }
            case 6: {
                var3_3 /* !! */  = (int)ew.bjkp("bjzr", bjkx(int ), (int)198);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl329
            }
lbl325:
            // 2 sources

            case 7: {
                var3_3 /* !! */  = (int)ew.bjkp("bjzt", bjkx(int ), (int)199);
                if (!var4_2) ** GOTO lbl311
                throw null;
            }
lbl329:
            // 6 sources

            case 8: {
                var3_3 /* !! */  = (int)ew.bjkp("bjzv", bjkx(int ), (int)200);
                if (!var4_2) ** GOTO lbl296
                throw null;
            }
            case 9: {
                var3_3 /* !! */  = (int)ew.bjkp("bjzw", bjkx(int ), (int)201);
                if (!var4_2) ** GOTO lbl315
                throw null;
            }
lbl337:
            // 3 sources

            case 10: {
                var3_3 /* !! */  = (int)ew.bjkp("bjzx", bjkx(int ), (int)202);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl389
            }
            case 11: {
                var3_3 /* !! */  = (int)ew.bjkp("bjzz", bjkx(int ), (int)203);
                if (!var4_2) ** GOTO lbl306
                throw null;
            }
            case 12: {
                var3_3 /* !! */  = (int)ew.bjkp("bkad", bjkx(int ), (int)204);
                if (!var4_2) ** GOTO lbl337
                throw null;
            }
            case 13: {
                do {
                    var3_3 /* !! */  = (int)ew.bjkp("bkae", bjkx(int ), (int)205);
                } while (!var4_2);
                throw null;
            }
            case 14: {
                var3_3 /* !! */  = (int)ew.bjkp("bkag", bjkx(int ), (int)206);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl372
            }
lbl360:
            // 5 sources

            case 15: {
                var3_3 /* !! */  = (int)ew.bjkp("bkaj", bjkx(int ), (int)207);
                if (!var4_2) ** GOTO lbl329
                throw null;
            }
lbl364:
            // 2 sources

            case 16: {
                var3_3 /* !! */  = (int)ew.bjkp("bkam", bjkx(int ), (int)208);
                if (!var4_2) ** GOTO lbl337
                throw null;
            }
            case 17: {
                var3_3 /* !! */  = (int)ew.bjkp("bkao", bjkx(int ), (int)209);
                if (!var4_2) ** GOTO lbl360
                throw null;
            }
lbl372:
            // 2 sources

            case 18: {
                var3_3 /* !! */  = (int)ew.bjkp("bkar", bjkx(int ), (int)210);
                if (!var4_2) ** GOTO lbl329
                throw null;
            }
            case 19: {
                var3_3 /* !! */  = (int)ew.bjkp("bkat", bjkx(int ), (int)211);
                if (!var4_2) ** GOTO lbl364
                throw null;
            }
            case 20: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)ew.bjkp("bkaw", bjkx(int ), (int)212);
                    if (!var4_2) ** GOTO lbl325
                    throw null;
                }
            }
            case 21: {
                var3_3 /* !! */  = (int)ew.bjkp("bkay", bjkx(int ), (int)213);
                if (!var4_2) ** GOTO lbl311
                throw null;
            }
lbl389:
            // 2 sources

            case 22: {
                var3_3 /* !! */  = (int)ew.bjkp("bkba", bjkx(int ), (int)214);
                if (!var4_2) ** GOTO lbl311
                throw null;
            }
lbl393:
            // 2 sources

            case 23: {
                var3_3 /* !! */  = (int)ew.bjkp("bkbb", bjkx(int ), (int)215);
                if (var4_2) {
                    throw null;
                }
            }
            case 24: {
                var3_3 /* !! */  = (int)ew.bjkp("bkbd", bjkx(int ), (int)216);
                if (!var4_2) ** GOTO lbl360
                throw null;
            }
            case 25: {
                var3_3 /* !! */  = (int)ew.bjkp("bkbf", bjkx(int ), (int)217);
                if (!var4_2) ** GOTO lbl360
                throw null;
            }
            case 26: {
                var3_3 /* !! */  = (int)ew.bjkp("bkbl", bjkx(int ), (int)218);
                if (!var4_2) ** GOTO lbl329
                throw null;
            }
            case 27: {
                var3_3 /* !! */  = (int)ew.bjkp("bkbm", bjkx(int ), (int)219);
                if (!var4_2) ** GOTO lbl360
                throw null;
            }
            case 28: 
        }
        var3_3 /* !! */  = (int)ew.bjkp("bkbo", bjkx(int ), (int)220);
        ** while (!var4_2)
lbl416:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void restoreMovement() {
        block40: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = ew.dl - ew.bjkp("bkox", bjkm(int ), (int)170)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v0 /* !! */  == ew.bjkp("bkoy", bjkx(int ), (int)338)) break;
                v0 /* !! */  = (long)ew.bjkp("bkoz", bjkx(int ), (int)339);
            }
            var3_1 = ew.c;
            while (true) {
                if ((v1 /* !! */  = (cfr_temp_1 = ew.dl - ew.bjkp("bkpa", bjkm(int ), (int)171)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v1 /* !! */  == ew.bjkp("bkpb", bjkx(int ), (int)340)) break;
                v1 /* !! */  = (long)ew.bjkp("bkpc", bjkx(int ), (int)341);
            }
            var2_2 /* !! */  = ew.b;
            v2 /* !! */  = ew.dl;
            if (true) ** GOTO lbl19
            block21: while (true) {
                v2 /* !! */  = (long)(ew.bjkp("bkpe", bjkm(int ), (int)173) - ew.bjkp("bkpd", bjkm(int ), (int)172));
lbl19:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case 125951915: {
                        break block21;
                    }
                    case 602788426: {
                        continue block21;
                    }
                }
                break;
            }
            var1_3 = ew.a;
            if (var3_1) {
                throw null;
lbl27:
                // 4 sources

                return;
            }
            if (var1_3 || var1_3) ** GOTO lbl27
            while (true) {
                if ((v3 /* !! */  = (cfr_temp_2 = ew.dl - ew.bjkp("bkpf", bjkm(int ), (int)174)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v3 /* !! */  == ew.bjkp("bkpg", bjkx(int ), (int)342)) break;
                v3 /* !! */  = (long)ew.bjkp("bkph", bjkx(int ), (int)343);
            }
            while (true) {
                if ((v4 /* !! */  = (cfr_temp_3 = ew.dl - ew.bjkp("bkpi", bjkm(int ), (int)175)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v4 /* !! */  == ew.bjkp("bkpj", bjkx(int ), (int)344)) break;
                v4 /* !! */  = (long)ew.bjkp("bkpk", bjkx(int ), (int)345);
            }
            if (!this.movement.isBlocked()) break block40;
            if (var1_3 || var1_3) ** GOTO lbl27
            while (true) {
                if ((v5 /* !! */  = (cfr_temp_4 = ew.dl - ew.bjkp("bkpl", bjkm(int ), (int)176)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v5 /* !! */  == ew.bjkp("bkpm", bjkx(int ), (int)346)) break;
                v5 /* !! */  = (long)ew.bjkp("bkpn", bjkx(int ), (int)347);
            }
            v6 /* !! */  = ew.dl;
            if (true) ** GOTO lbl54
            block26: while (true) {
                v6 /* !! */  = (long)(ew.bjkp("bkpq", bjkm(int ), (int)178) - ew.bjkp("bkpo", bjkm(int ), (int)177));
lbl54:
                // 2 sources

                switch ((int)v6 /* !! */ ) {
                    case -1949915246: {
                        continue block26;
                    }
                    case 125951915: {
                        break block26;
                    }
                }
                break;
            }
            this.movement.restoreFromCurrent();
            if (var1_3) ** GOTO lbl27
        }
        if (!var1_3 && !var1_3) ** break;
        ** while (true)
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                return;
            }
lbl68:
            // 3 sources

            case 0: {
                var2_2 /* !! */  = (int)ew.bjkp("bkps", bjkx(int ), (int)348);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl82
            }
            case 1: {
                var2_2 /* !! */  = (int)ew.bjkp("bkpt", bjkx(int ), (int)349);
                if (!var3_1) ** GOTO lbl68
                throw null;
            }
lbl77:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)ew.bjkp("bkpv", bjkx(int ), (int)350);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl86
            }
lbl82:
            // 3 sources

            case 3: {
                var2_2 /* !! */  = (int)ew.bjkp("bkpw", bjkx(int ), (int)351);
                if (var3_1) {
                    throw null;
                }
            }
lbl86:
            // 4 sources

            case 4: {
                var2_2 /* !! */  = (int)ew.bjkp("bkpx", bjkx(int ), (int)352);
                if (!var3_1) ** GOTO lbl77
                throw null;
            }
            case 5: {
                var2_2 /* !! */  = (int)ew.bjkp("bkpz", bjkx(int ), (int)353);
                if (!var3_1) ** GOTO lbl68
                throw null;
            }
            case 6: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ew.bjkp("bkqb", bjkx(int ), (int)354);
                    if (!var3_1) ** GOTO lbl82
                    throw null;
                }
            }
            case 7: {
                var2_2 /* !! */  = (int)ew.bjkp("bkqd", bjkx(int ), (int)355);
                if (!var3_1) break;
                throw null;
            }
            case 8: 
        }
        var2_2 /* !! */  = (int)ew.bjkp("bkqe", bjkx(int ), (int)356);
        ** while (!var3_1)
lbl106:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onKey(cn var1_1) {
        var5_2 = ew.c;
        var4_3 /* !! */  = ew.b;
        var3_4 = ew.a;
        if (var5_2) {
            throw null;
lbl6:
            // 24 sources

            return;
        }
        if (var3_4 || var3_4) ** GOTO lbl6
        if (ew.mc.field_1724 == null) ** GOTO lbl18
        if (var3_4) ** GOTO lbl6
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (ew.mc.field_1755 != null) ** GOTO lbl18
                if (var3_4) ** GOTO lbl6
                if (this.phase == ew$ActionPhase.IDLE) ** GOTO lbl20
                if (var3_4) ** GOTO lbl6
lbl18:
                // 3 sources

                if (var3_4 || var3_4) ** GOTO lbl6
                return;
lbl20:
                // 1 sources

                if (var3_4 || var3_4) ** GOTO lbl6
                var2_5 = this.getBoundItem(var1_1);
                if (var3_4 || var3_4) ** GOTO lbl6
                if (var2_5 != null) ** GOTO lbl26
                if (var3_4 || var3_4) ** GOTO lbl6
                return;
lbl26:
                // 1 sources

                if (var3_4 || var3_4) ** GOTO lbl6
                if (this.prepare(var2_5)) ** GOTO lbl32
                if (var3_4 || var3_4) ** GOTO lbl6
                pp.brandmessage("\u041f\u0440\u0435\u0434\u043c\u0435\u0442 \u043d\u0435 \u043d\u0430\u0439\u0434\u0435\u043d");
                if (var3_4 || var3_4) ** GOTO lbl6
                return;
lbl32:
                // 1 sources

                if (var3_4 || var3_4) ** GOTO lbl6
                if (!this.mode.isSelected("ReallyWorld")) ** GOTO lbl42
                if (var3_4 || var3_4) ** GOTO lbl6
                this.actionAt = System.currentTimeMillis() + ew.bjkp("bjmd", bjkm(int ), (int)9);
                if (var3_4 || var3_4) ** GOTO lbl6
                this.phase = ew$ActionPhase.WAIT_USE_HALF;
                if (var3_4) ** GOTO lbl6
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl59
lbl42:
                // 1 sources

                if (var3_4 || var3_4) ** GOTO lbl6
                if (!this.mode.isSelected("New")) ** GOTO lbl56
                if (var3_4 || var3_4) ** GOTO lbl6
                this.movement.saveState();
                if (var3_4 || var3_4) ** GOTO lbl6
                this.movement.block();
                if (var3_4 || var3_4) ** GOTO lbl6
                this.stopTicks = (int)ew.bjkp("bjme", bjkx(int ), (int)27);
                if (var3_4 || var3_4) ** GOTO lbl6
                this.phase = ew$ActionPhase.WAIT_USE_STOP;
                if (var3_4) ** GOTO lbl6
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl59
lbl56:
                // 1 sources

                if (var3_4 || var3_4) ** GOTO lbl6
                this.usePreparedItem();
                if (var3_4) ** GOTO lbl6
lbl59:
                // 3 sources

                if (!var3_4 && !var3_4) ** break;
                ** continue;
                return;
            }
lbl62:
            // 3 sources

            case 0: {
                var4_3 /* !! */  = (int)ew.bjkp("bjmf", bjkx(int ), (int)28);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl149
            }
            case 1: {
                var4_3 /* !! */  = (int)ew.bjkp("bjmg", bjkx(int ), (int)29);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl106
            }
            case 2: {
                var4_3 /* !! */  = (int)ew.bjkp("bjmh", bjkx(int ), (int)30);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl210
            }
            case 3: {
                var4_3 /* !! */  = (int)ew.bjkp("bjmi", bjkx(int ), (int)31);
                if (!var5_2) ** GOTO lbl62
                throw null;
            }
lbl81:
            // 2 sources

            case 4: {
                var4_3 /* !! */  = (int)ew.bjkp("bjmj", bjkx(int ), (int)32);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl101
            }
            case 5: {
                var4_3 /* !! */  = (int)ew.bjkp("bjmk", bjkx(int ), (int)33);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl267
            }
lbl91:
            // 3 sources

            case 6: {
                var4_3 /* !! */  = (int)ew.bjkp("bjml", bjkx(int ), (int)34);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl106
            }
lbl96:
            // 2 sources

            case 7: {
                var4_3 /* !! */  = (int)ew.bjkp("bjmm", bjkx(int ), (int)35);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl245
            }
lbl101:
            // 2 sources

            case 8: {
                var4_3 /* !! */  = (int)ew.bjkp("bjmn", bjkx(int ), (int)36);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl130
            }
lbl106:
            // 5 sources

            case 9: {
                var4_3 /* !! */  = (int)ew.bjkp("bjmo", bjkx(int ), (int)37);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl171
            }
            case 10: {
                var4_3 /* !! */  = (int)ew.bjkp("bjmp", bjkx(int ), (int)38);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl167
            }
            case 11: {
                var4_3 /* !! */  = (int)ew.bjkp("bjmq", bjkx(int ), (int)39);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl202
            }
            case 12: {
                var4_3 /* !! */  = (int)ew.bjkp("bjmr", bjkx(int ), (int)40);
                if (!var5_2) ** GOTO lbl91
                throw null;
            }
lbl125:
            // 2 sources

            case 13: {
                var4_3 /* !! */  = (int)ew.bjkp("bjms", bjkx(int ), (int)41);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl149
            }
lbl130:
            // 3 sources

            case 14: {
                var4_3 /* !! */  = (int)ew.bjkp("bjmt", bjkx(int ), (int)42);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl232
            }
            case 15: {
                var4_3 /* !! */  = (int)ew.bjkp("bjmu", bjkx(int ), (int)43);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl149
            }
            case 16: {
                var4_3 /* !! */  = (int)ew.bjkp("bjmv", bjkx(int ), (int)44);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl227
            }
lbl145:
            // 2 sources

            case 17: {
                var4_3 /* !! */  = (int)ew.bjkp("bjmw", bjkx(int ), (int)45);
                if (!var5_2) ** GOTO lbl106
                throw null;
            }
lbl149:
            // 5 sources

            case 18: {
                var4_3 /* !! */  = (int)ew.bjkp("bjmx", bjkx(int ), (int)46);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl254
            }
            case 19: {
                var4_3 /* !! */  = (int)ew.bjkp("bjmy", bjkx(int ), (int)47);
                if (!var5_2) ** GOTO lbl81
                throw null;
            }
lbl158:
            // 5 sources

            case 20: {
                var4_3 /* !! */  = (int)ew.bjkp("bjmz", bjkx(int ), (int)48);
                if (!var5_2) ** GOTO lbl106
                throw null;
            }
            case 21: {
                do {
                    var4_3 /* !! */  = (int)ew.bjkp("bjna", bjkx(int ), (int)49);
                } while (!var5_2);
                throw null;
            }
lbl167:
            // 2 sources

            case 22: {
                var4_3 /* !! */  = (int)ew.bjkp("bjnb", bjkx(int ), (int)50);
                if (!var5_2) ** GOTO lbl158
                throw null;
            }
lbl171:
            // 2 sources

            case 23: {
                var4_3 /* !! */  = (int)ew.bjkp("bjnc", bjkx(int ), (int)51);
                if (!var5_2) ** GOTO lbl125
                throw null;
            }
            case 24: {
                var4_3 /* !! */  = (int)ew.bjkp("bjnd", bjkx(int ), (int)52);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl198
            }
            case 25: {
                var4_3 /* !! */  = (int)ew.bjkp("bjne", bjkx(int ), (int)53);
                if (!var5_2) break;
                throw null;
            }
            case 26: {
                var4_3 /* !! */  = (int)ew.bjkp("bjnf", bjkx(int ), (int)54);
                if (!var5_2) ** GOTO lbl96
                throw null;
            }
lbl188:
            // 2 sources

            case 27: {
                var4_3 /* !! */  = (int)ew.bjkp("bjng", bjkx(int ), (int)55);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl245
            }
lbl193:
            // 2 sources

            case 28: {
                var4_3 /* !! */  = (int)ew.bjkp("bjnh", bjkx(int ), (int)56);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl245
            }
lbl198:
            // 2 sources

            case 29: {
                var4_3 /* !! */  = (int)ew.bjkp("bjni", bjkx(int ), (int)57);
                if (!var5_2) ** GOTO lbl149
                throw null;
            }
lbl202:
            // 2 sources

            case 30: {
                var4_3 /* !! */  = (int)ew.bjkp("bjnj", bjkx(int ), (int)58);
                if (!var5_2) ** GOTO lbl193
                throw null;
            }
            case 31: {
                var4_3 /* !! */  = (int)ew.bjkp("bjnk", bjkx(int ), (int)59);
                if (!var5_2) break;
                throw null;
            }
lbl210:
            // 2 sources

            case 32: {
                var4_3 /* !! */  = (int)ew.bjkp("bjnl", bjkx(int ), (int)60);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl232
            }
            case 33: {
                var4_3 /* !! */  = (int)ew.bjkp("bjnm", bjkx(int ), (int)61);
                if (!var5_2) ** GOTO lbl158
                throw null;
            }
            case 34: {
                var4_3 /* !! */  = (int)ew.bjkp("bjnn", bjkx(int ), (int)62);
                if (!var5_2) ** GOTO lbl158
                throw null;
            }
            case 35: {
                var4_3 /* !! */  = (int)ew.bjkp("bjno", bjkx(int ), (int)63);
                if (!var5_2) ** GOTO lbl91
                throw null;
            }
lbl227:
            // 2 sources

            case 36: {
                var4_3 /* !! */  = (int)ew.bjkp("bjnp", bjkx(int ), (int)64);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl245
            }
lbl232:
            // 3 sources

            case 37: {
                var4_3 /* !! */  = (int)ew.bjkp("bjnq", bjkx(int ), (int)65);
                if (!var5_2) ** GOTO lbl62
                throw null;
            }
            case 38: {
                var4_3 /* !! */  = (int)ew.bjkp("bjnr", bjkx(int ), (int)66);
                if (!var5_2) ** GOTO lbl158
                throw null;
            }
            case 39: {
                var4_3 /* !! */  = (int)ew.bjkp("bjns", bjkx(int ), (int)67);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl254
            }
lbl245:
            // 5 sources

            case 40: {
                var4_3 /* !! */  = (int)ew.bjkp("bjnt", bjkx(int ), (int)68);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl262
            }
lbl250:
            // 2 sources

            case 41: {
                var4_3 /* !! */  = (int)ew.bjkp("bjnu", bjkx(int ), (int)69);
                if (!var5_2) ** GOTO lbl130
                throw null;
            }
lbl254:
            // 3 sources

            case 42: {
                var4_3 /* !! */  = (int)ew.bjkp("bjnv", bjkx(int ), (int)70);
                if (!var5_2) ** GOTO lbl250
                throw null;
            }
lbl258:
            // 2 sources

            case 43: {
                var4_3 /* !! */  = (int)ew.bjkp("bjnw", bjkx(int ), (int)71);
                if (!var5_2) ** GOTO lbl188
                throw null;
            }
lbl262:
            // 2 sources

            case 44: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_3 /* !! */  = (int)ew.bjkp("bjnx", bjkx(int ), (int)72);
                    if (!var5_2) ** GOTO lbl258
                    throw null;
                }
            }
lbl267:
            // 2 sources

            case 45: {
                var4_3 /* !! */  = (int)ew.bjkp("bjny", bjkx(int ), (int)73);
                if (!var5_2) ** GOTO lbl145
                throw null;
            }
            case 46: 
        }
        var4_3 /* !! */  = (int)ew.bjkp("bjnz", bjkx(int ), (int)74);
        ** while (!var5_2)
lbl274:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onTick(df var1_1) {
        block131: {
            block129: {
                block130: {
                    block128: {
                        var4_2 = ew.c;
                        var3_3 /* !! */  = ew.b;
                        var2_4 = ew.a;
                        if (var4_2) {
                            throw null;
lbl6:
                            // 31 sources

                            return;
                        }
                        if (var2_4 || var2_4) ** GOTO lbl6
                        if (ew.mc.field_1724 != null) break block128;
                        if (var2_4 || var2_4) ** GOTO lbl6
                        this.cleanup();
                        if (var2_4 || var2_4) ** GOTO lbl6
                        return;
                    }
                    if (var2_4 || var2_4) ** GOTO lbl6
                    this.tryHalfTickUse();
                    if (var2_4 || var2_4) ** GOTO lbl6
                    if (this.phase != ew$ActionPhase.WAIT_USE_STOP) break block129;
                    if (var2_4 || var2_4) ** GOTO lbl6
                    this.movement.block();
                    if (var2_4 || var2_4) ** GOTO lbl6
                    v0 = this.stopTicks;
                    this.stopTicks = v0 - ew.bjkp("bjoa", bjkx(int ), (int)75);
                    if (v0 <= 0) break block130;
                    if (var2_4 || var2_4) ** GOTO lbl6
                    return;
                }
                if (var2_4 || var2_4) ** GOTO lbl6
                this.usePreparedItem();
                if (var2_4 || var2_4) ** GOTO lbl6
                this.restoreMovement();
                if (var2_4 || var2_4) ** GOTO lbl6
                return;
            }
            if (var2_4 || var2_4) ** GOTO lbl6
            if (this.phase != ew$ActionPhase.WAIT_RESTORE) ** GOTO lbl63
            if (var2_4) ** GOTO lbl6
            if (System.currentTimeMillis() < this.restoreAt) ** GOTO lbl63
            if (var2_4 || var2_4) ** GOTO lbl6
            if (!this.mode.isSelected("New")) break block131;
            if (var2_4) ** GOTO lbl6
            if (this.fromHotbar) break block131;
            if (var2_4 || var2_4) ** GOTO lbl6
            this.movement.saveState();
            if (var2_4 || var2_4) ** GOTO lbl6
            this.movement.block();
            if (var2_4 || var2_4) ** GOTO lbl6
            this.stopTicks = (int)ew.bjkp("bjob", bjkx(int ), (int)76);
            if (var2_4 || var2_4) ** GOTO lbl6
            this.phase = ew$ActionPhase.WAIT_RESTORE_STOP;
            if (var2_4 || var2_4) ** GOTO lbl6
            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl6
        this.restoreItem();
        if (var2_4 || var2_4) ** GOTO lbl6
        this.cleanup();
        if (var2_4 || var2_4) ** GOTO lbl6
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                return;
            }
lbl63:
            // 2 sources

            if (var2_4 || var2_4) ** GOTO lbl6
            if (this.phase != ew$ActionPhase.WAIT_RESTORE_STOP) ** GOTO lbl78
            if (var2_4 || var2_4) ** GOTO lbl6
            this.movement.block();
            if (var2_4 || var2_4) ** GOTO lbl6
            v1 = this.stopTicks;
            this.stopTicks = v1 - ew.bjkp("bjoc", bjkx(int ), (int)77);
            if (v1 <= 0) ** GOTO lbl73
            if (var2_4 || var2_4) ** GOTO lbl6
            return;
lbl73:
            // 1 sources

            if (var2_4 || var2_4) ** GOTO lbl6
            this.restoreItem();
            if (var2_4 || var2_4) ** GOTO lbl6
            this.cleanup();
            if (var2_4) ** GOTO lbl6
lbl78:
            // 2 sources

            if (!var2_4 && !var2_4) ** break;
            ** continue;
            return;
lbl81:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)ew.bjkp("bjod", bjkx(int ), (int)78);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl163
            }
            case 1: {
                var3_3 /* !! */  = (int)ew.bjkp("bjoe", bjkx(int ), (int)79);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl229
            }
            case 2: {
                var3_3 /* !! */  = (int)ew.bjkp("bjof", bjkx(int ), (int)80);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl116
            }
lbl96:
            // 3 sources

            case 3: {
                var3_3 /* !! */  = (int)ew.bjkp("bjog", bjkx(int ), (int)81);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl126
            }
            case 4: {
                var3_3 /* !! */  = (int)ew.bjkp("bjoh", bjkx(int ), (int)82);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl279
            }
            case 5: {
                var3_3 /* !! */  = (int)ew.bjkp("bjoi", bjkx(int ), (int)83);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl136
            }
lbl111:
            // 2 sources

            case 6: {
                var3_3 /* !! */  = (int)ew.bjkp("bjqp", bjkx(int ), (int)84);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl334
            }
lbl116:
            // 3 sources

            case 7: {
                var3_3 /* !! */  = (int)ew.bjkp("bjqq", bjkx(int ), (int)85);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl220
            }
            case 8: {
                var3_3 /* !! */  = (int)ew.bjkp("bjqr", bjkx(int ), (int)86);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl211
            }
lbl126:
            // 2 sources

            case 9: {
                var3_3 /* !! */  = (int)ew.bjkp("bjqs", bjkx(int ), (int)87);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl243
            }
lbl131:
            // 2 sources

            case 10: {
                var3_3 /* !! */  = (int)ew.bjkp("bjqt", bjkx(int ), (int)88);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl342
            }
lbl136:
            // 3 sources

            case 11: {
                var3_3 /* !! */  = (int)ew.bjkp("bjqu", bjkx(int ), (int)89);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl168
            }
lbl141:
            // 2 sources

            case 12: {
                var3_3 /* !! */  = (int)ew.bjkp("bjqv", bjkx(int ), (int)90);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl312
            }
lbl146:
            // 2 sources

            case 13: {
                var3_3 /* !! */  = (int)ew.bjkp("bjqw", bjkx(int ), (int)91);
                if (!var4_2) ** GOTO lbl111
                throw null;
            }
            case 14: {
                var3_3 /* !! */  = (int)ew.bjkp("bjqx", bjkx(int ), (int)92);
                if (!var4_2) ** GOTO lbl116
                throw null;
            }
lbl154:
            // 2 sources

            case 15: {
                var3_3 /* !! */  = (int)ew.bjkp("bjqy", bjkx(int ), (int)93);
                if (!var4_2) ** GOTO lbl141
                throw null;
            }
            case 16: {
                var3_3 /* !! */  = (int)ew.bjkp("bjqz", bjkx(int ), (int)94);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl296
            }
lbl163:
            // 3 sources

            case 17: {
                var3_3 /* !! */  = (int)ew.bjkp("bjra", bjkx(int ), (int)95);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl252
            }
lbl168:
            // 3 sources

            case 18: {
                var3_3 /* !! */  = (int)ew.bjkp("bjrb", bjkx(int ), (int)96);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl362
            }
lbl173:
            // 2 sources

            case 19: {
                var3_3 /* !! */  = (int)ew.bjkp("bjrc", bjkx(int ), (int)97);
                if (!var4_2) ** GOTO lbl81
                throw null;
            }
            case 20: {
                var3_3 /* !! */  = (int)ew.bjkp("bjrd", bjkx(int ), (int)98);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl186
            }
            case 21: {
                var3_3 /* !! */  = (int)ew.bjkp("bjre", bjkx(int ), (int)99);
                if (!var4_2) ** GOTO lbl146
                throw null;
            }
lbl186:
            // 2 sources

            case 22: {
                var3_3 /* !! */  = (int)ew.bjkp("bjrf", bjkx(int ), (int)100);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl358
            }
            case 23: {
                var3_3 /* !! */  = (int)ew.bjkp("bjrg", bjkx(int ), (int)101);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl296
            }
lbl196:
            // 3 sources

            case 24: {
                var3_3 /* !! */  = (int)ew.bjkp("bjrh", bjkx(int ), (int)102);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl238
            }
            case 25: {
                var3_3 /* !! */  = (int)ew.bjkp("bjri", bjkx(int ), (int)103);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl307
            }
            case 26: {
                var3_3 /* !! */  = (int)ew.bjkp("bjrj", bjkx(int ), (int)104);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl252
            }
lbl211:
            // 2 sources

            case 27: {
                var3_3 /* !! */  = (int)ew.bjkp("bjrk", bjkx(int ), (int)105);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl302
            }
lbl216:
            // 3 sources

            case 28: {
                var3_3 /* !! */  = (int)ew.bjkp("bjrl", bjkx(int ), (int)106);
                if (!var4_2) break;
                throw null;
            }
lbl220:
            // 3 sources

            case 29: {
                var3_3 /* !! */  = (int)ew.bjkp("bjrm", bjkx(int ), (int)107);
                if (!var4_2) ** GOTO lbl154
                throw null;
            }
lbl224:
            // 2 sources

            case 30: {
                var3_3 /* !! */  = (int)ew.bjkp("bjrn", bjkx(int ), (int)108);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl296
            }
lbl229:
            // 2 sources

            case 31: {
                var3_3 /* !! */  = (int)ew.bjkp("bjro", bjkx(int ), (int)109);
                if (!var4_2) ** GOTO lbl196
                throw null;
            }
lbl233:
            // 2 sources

            case 32: {
                var3_3 /* !! */  = (int)ew.bjkp("bjrp", bjkx(int ), (int)110);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl275
            }
lbl238:
            // 2 sources

            case 33: {
                var3_3 /* !! */  = (int)ew.bjkp("bjrq", bjkx(int ), (int)111);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl321
            }
lbl243:
            // 2 sources

            case 34: {
                var3_3 /* !! */  = (int)ew.bjkp("bjrr", bjkx(int ), (int)112);
                if (!var4_2) ** GOTO lbl173
                throw null;
            }
            case 35: {
                var3_3 /* !! */  = (int)ew.bjkp("bjrs", bjkx(int ), (int)113);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl287
            }
lbl252:
            // 4 sources

            case 36: {
                var3_3 /* !! */  = (int)ew.bjkp("bjrt", bjkx(int ), (int)114);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl321
            }
lbl257:
            // 2 sources

            case 37: {
                var3_3 /* !! */  = (int)ew.bjkp("bjru", bjkx(int ), (int)115);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl296
            }
lbl262:
            // 2 sources

            case 38: {
                var3_3 /* !! */  = (int)ew.bjkp("bjrv", bjkx(int ), (int)116);
                if (!var4_2) ** GOTO lbl224
                throw null;
            }
            case 39: {
                var3_3 /* !! */  = (int)ew.bjkp("bjrw", bjkx(int ), (int)117);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl338
            }
            case 40: {
                var3_3 /* !! */  = (int)ew.bjkp("bjrx", bjkx(int ), (int)118);
                if (!var4_2) ** GOTO lbl216
                throw null;
            }
lbl275:
            // 2 sources

            case 41: {
                var3_3 /* !! */  = (int)ew.bjkp("bjry", bjkx(int ), (int)119);
                if (!var4_2) ** GOTO lbl96
                throw null;
            }
lbl279:
            // 2 sources

            case 42: {
                var3_3 /* !! */  = (int)ew.bjkp("bjrz", bjkx(int ), (int)120);
                if (!var4_2) ** GOTO lbl136
                throw null;
            }
            case 43: {
                var3_3 /* !! */  = (int)ew.bjkp("bjsa", bjkx(int ), (int)121);
                if (!var4_2) ** GOTO lbl233
                throw null;
            }
lbl287:
            // 3 sources

            case 44: {
                var3_3 /* !! */  = (int)ew.bjkp("bjsb", bjkx(int ), (int)122);
                if (!var4_2) ** GOTO lbl96
                throw null;
            }
            case 45: {
                var3_3 /* !! */  = (int)ew.bjkp("bjsc", bjkx(int ), (int)123);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl334
            }
lbl296:
            // 6 sources

            case 46: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)ew.bjkp("bjsd", bjkx(int ), (int)124);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl312
                    break;
                }
            }
lbl302:
            // 2 sources

            case 47: {
                do {
                    var3_3 /* !! */  = (int)ew.bjkp("bjse", bjkx(int ), (int)125);
                } while (!var4_2);
                throw null;
            }
lbl307:
            // 2 sources

            case 48: {
                var3_3 /* !! */  = (int)ew.bjkp("bjsf", bjkx(int ), (int)126);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl366
            }
lbl312:
            // 3 sources

            case 49: {
                var3_3 /* !! */  = (int)ew.bjkp("bjsg", bjkx(int ), (int)127);
                if (!var4_2) ** GOTO lbl287
                throw null;
            }
            case 50: {
                var3_3 /* !! */  = (int)ew.bjkp("bjsh", bjkx(int ), (int)128);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl330
            }
lbl321:
            // 3 sources

            case 51: {
                var3_3 /* !! */  = (int)ew.bjkp("bjsi", bjkx(int ), (int)129);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl350
            }
            case 52: {
                var3_3 /* !! */  = (int)ew.bjkp("bjsj", bjkx(int ), (int)130);
                if (!var4_2) ** GOTO lbl216
                throw null;
            }
lbl330:
            // 2 sources

            case 53: {
                var3_3 /* !! */  = (int)ew.bjkp("bjsk", bjkx(int ), (int)131);
                if (!var4_2) ** GOTO lbl220
                throw null;
            }
lbl334:
            // 3 sources

            case 54: {
                var3_3 /* !! */  = (int)ew.bjkp("bjsl", bjkx(int ), (int)132);
                if (!var4_2) ** GOTO lbl163
                throw null;
            }
lbl338:
            // 2 sources

            case 55: {
                var3_3 /* !! */  = (int)ew.bjkp("bjsm", bjkx(int ), (int)133);
                if (!var4_2) ** GOTO lbl168
                throw null;
            }
lbl342:
            // 2 sources

            case 56: {
                var3_3 /* !! */  = (int)ew.bjkp("bjsn", bjkx(int ), (int)134);
                if (!var4_2) ** GOTO lbl262
                throw null;
            }
            case 57: {
                var3_3 /* !! */  = (int)ew.bjkp("bjso", bjkx(int ), (int)135);
                if (!var4_2) ** GOTO lbl257
                throw null;
            }
lbl350:
            // 2 sources

            case 58: {
                var3_3 /* !! */  = (int)ew.bjkp("bjsp", bjkx(int ), (int)136);
                if (!var4_2) ** GOTO lbl196
                throw null;
            }
            case 59: {
                var3_3 /* !! */  = (int)ew.bjkp("bjsq", bjkx(int ), (int)137);
                if (!var4_2) ** GOTO lbl131
                throw null;
            }
lbl358:
            // 2 sources

            case 60: {
                var3_3 /* !! */  = (int)ew.bjkp("bjsr", bjkx(int ), (int)138);
                if (!var4_2) ** GOTO lbl296
                throw null;
            }
lbl362:
            // 2 sources

            case 61: {
                var3_3 /* !! */  = (int)ew.bjkp("bjss", bjkx(int ), (int)139);
                if (!var4_2) ** GOTO lbl252
                throw null;
            }
lbl366:
            // 2 sources

            case 62: {
                do {
                    var3_3 /* !! */  = (int)ew.bjkp("bjst", bjkx(int ), (int)140);
                } while (!var4_2);
                throw null;
            }
            case 63: 
        }
        var3_3 /* !! */  = (int)ew.bjkp("bjsu", bjkx(int ), (int)141);
        ** while (!var4_2)
lbl374:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void blcy() {
        ew.bjkn[100] = 1209186670793725607L;
        ew.bjkn[101] = -6046602828849617670L;
        ew.bjkn[102] = -4067782851652064941L;
        ew.bjkn[103] = -1341026611154390731L;
        ew.bjkn[104] = 3619423709399068940L;
        ew.bjkn[105] = -7675360214402748836L;
        ew.bjkn[106] = 5411320753610071647L;
        ew.bjkn[107] = 2472567436936006364L;
        ew.bjkn[108] = -4828141205870575083L;
        ew.bjkn[109] = -8104910590900439352L;
        ew.bjkn[110] = -2703779637778971251L;
        ew.bjkn[111] = 9177126674022947827L;
        ew.bjkn[112] = 2623239487831627781L;
        ew.bjkn[113] = 4530210279350439929L;
        ew.bjkn[114] = 5383065751699357442L;
        ew.bjkn[115] = 1889743644011332636L;
        ew.bjkn[116] = -24511434673362454L;
        ew.bjkn[117] = -4927563422054371268L;
        ew.bjkn[118] = 8145923154876050472L;
        ew.bjkn[119] = 6164739764063815434L;
        ew.bjkn[120] = 9083034837163707987L;
        ew.bjkn[121] = 3487346134972293831L;
        ew.bjkn[122] = -1108233515887109501L;
        ew.bjkn[123] = -4930288090460433559L;
        ew.bjkn[124] = 5982316042374527109L;
        ew.bjkn[125] = 7682323306246992205L;
        ew.bjkn[126] = 4143519616036665556L;
        ew.bjkn[127] = -8659760094990710192L;
        ew.bjkn[128] = -3985652447339088434L;
        ew.bjkn[129] = 984464646791697429L;
        ew.bjkn[130] = -274498257529377486L;
        ew.bjkn[131] = 225701265352026792L;
        ew.bjkn[132] = -4508555892959913260L;
        ew.bjkn[133] = 2857280844343973597L;
        ew.bjkn[134] = 8498288332551599436L;
        ew.bjkn[135] = -8734137844455570409L;
        ew.bjkn[136] = 8221171616290098915L;
        ew.bjkn[137] = -3167880409884667240L;
        ew.bjkn[138] = 950130548185743932L;
        ew.bjkn[139] = 5183056597230226835L;
        ew.bjkn[140] = -108845470979047534L;
        ew.bjkn[141] = -6083342396549317258L;
        ew.bjkn[142] = 1034417677694489356L;
        ew.bjkn[143] = 8303645009300715271L;
        ew.bjkn[144] = 4805591128298989644L;
        ew.bjkn[145] = -4127274022327047641L;
        ew.bjkn[146] = -3260706026677078153L;
        ew.bjkn[147] = -2479032361672564183L;
        ew.bjkn[148] = 3316042160049405528L;
        ew.bjkn[149] = -5149416314585318059L;
        ew.bjkn[150] = -5301793206086598301L;
        ew.bjkn[151] = -6188580075311307326L;
        ew.bjkn[152] = -7183741398755118488L;
        ew.bjkn[153] = -2585071680360812097L;
        ew.bjkn[154] = -4090473786757170652L;
        ew.bjkn[155] = 8056690221247939498L;
        ew.bjkn[156] = 6446131380570112839L;
        ew.bjkn[157] = -1514156808957860280L;
        ew.bjkn[158] = 7870426275975695280L;
        ew.bjkn[159] = 2375930173890653062L;
        ew.bjkn[160] = 2344547253603815276L;
        ew.bjkn[161] = 6127872869704448309L;
        ew.bjkn[162] = 1320331903316483726L;
        ew.bjkn[163] = 1132780260481796153L;
        ew.bjkn[164] = 8815404893327189998L;
        ew.bjkn[165] = -1870462344876471244L;
        ew.bjkn[166] = 5713590744586287699L;
        ew.bjkn[167] = -8625313118853085784L;
        ew.bjkn[168] = -1256891848582237419L;
        ew.bjkn[169] = 2965393542936791480L;
        ew.bjkn[170] = 7371624623294008953L;
        ew.bjkn[171] = 5168626795294453148L;
        ew.bjkn[172] = -11566637278438737L;
        ew.bjkn[173] = -112444543062022003L;
        ew.bjkn[174] = -1994293024229401963L;
        ew.bjkn[175] = 4187429017480671260L;
        ew.bjkn[176] = -6698832205681260979L;
        ew.bjkn[177] = -8168038360078142929L;
        ew.bjkn[178] = 1505232961191623581L;
        ew.bjkn[179] = 4145998261093968991L;
        ew.bjkn[180] = -3360246041295518288L;
        ew.bjkn[181] = 8955481007763337792L;
        ew.bjkn[182] = 8264116830554383732L;
        ew.bjkn[183] = -2632897686835007736L;
        ew.bjkn[184] = 3530617732579551498L;
        ew.bjkn[185] = -1721625966210914688L;
        ew.bjkn[186] = 6959156250880537982L;
        ew.bjkn[187] = 4867131058220882986L;
        ew.bjkn[188] = 659593343244485366L;
        ew.bjkn[189] = -8234833923786651707L;
        ew.bjkn[190] = -623704958100761664L;
        ew.bjkn[191] = 2993019636410983212L;
        ew.bjkn[192] = 1448925351163110203L;
        ew.bjkn[193] = 8889977984101970414L;
        ew.bjkn[194] = 4496464810147773179L;
        ew.bjkn[195] = 6053970963321881614L;
        ew.bjkn[196] = -155401322897944448L;
        ew.bjkn[197] = 6238120265065130851L;
        ew.bjkn[198] = 7773628307042650157L;
        ew.bjkn[199] = -5085315278570550893L;
    }

    private static /* synthetic */ void bkzy() {
        ew.bjky[300] = 1699508479;
        ew.bjky[301] = -1104460743;
        ew.bjky[302] = 258493009;
        ew.bjky[303] = -1645231015;
        ew.bjky[304] = 233132497;
        ew.bjky[305] = -785322138;
        ew.bjky[306] = -2121232205;
        ew.bjky[307] = -927757533;
        ew.bjky[308] = -693284246;
        ew.bjky[309] = 697932428;
        ew.bjky[310] = -268085599;
        ew.bjky[311] = 673229675;
        ew.bjky[312] = -1697750169;
        ew.bjky[313] = -1625914414;
        ew.bjky[314] = -1900885348;
        ew.bjky[315] = -349058529;
        ew.bjky[316] = -1483452365;
        ew.bjky[317] = -839903223;
        ew.bjky[318] = 2008250629;
        ew.bjky[319] = -640168832;
        ew.bjky[320] = 1089719772;
        ew.bjky[321] = 1145924367;
        ew.bjky[322] = 505042212;
        ew.bjky[323] = -1296255044;
        ew.bjky[324] = -171869251;
        ew.bjky[325] = -1265268129;
        ew.bjky[326] = 1689135571;
        ew.bjky[327] = -272201042;
        ew.bjky[328] = 1582614653;
        ew.bjky[329] = -1058150838;
        ew.bjky[330] = 155964730;
        ew.bjky[331] = 1402805014;
        ew.bjky[332] = 1087973782;
        ew.bjky[333] = -1741608155;
        ew.bjky[334] = -1181151548;
        ew.bjky[335] = 151700145;
        ew.bjky[336] = -1786746659;
        ew.bjky[337] = 1085254836;
        ew.bjky[338] = 85265563;
        ew.bjky[339] = -1024797542;
        ew.bjky[340] = -1208821550;
        ew.bjky[341] = 659934901;
        ew.bjky[342] = -353170202;
        ew.bjky[343] = -1610758134;
        ew.bjky[344] = -1408935281;
        ew.bjky[345] = 973083678;
        ew.bjky[346] = -408998870;
        ew.bjky[347] = -1076923865;
        ew.bjky[348] = 1812572432;
        ew.bjky[349] = 960413252;
        ew.bjky[350] = 1503710913;
        ew.bjky[351] = 1551436704;
        ew.bjky[352] = 377825765;
        ew.bjky[353] = 702836682;
        ew.bjky[354] = 602451767;
        ew.bjky[355] = -650341723;
        ew.bjky[356] = 1967213124;
        ew.bjky[357] = -1366816119;
        ew.bjky[358] = 1688448454;
        ew.bjky[359] = 1834134302;
        ew.bjky[360] = 1262371304;
        ew.bjky[361] = 815449841;
        ew.bjky[362] = -946010483;
        ew.bjky[363] = -1183340341;
        ew.bjky[364] = -1969670727;
        ew.bjky[365] = 1773836778;
        ew.bjky[366] = -2138569182;
        ew.bjky[367] = -1906539009;
        ew.bjky[368] = 1716579906;
        ew.bjky[369] = 333846796;
        ew.bjky[370] = 1325529792;
        ew.bjky[371] = 1508225802;
        ew.bjky[372] = -1409037095;
        ew.bjky[373] = -1355074676;
        ew.bjky[374] = 216892214;
        ew.bjky[375] = 974825819;
        ew.bjky[376] = 1267264879;
        ew.bjky[377] = 1173492612;
        ew.bjky[378] = -186594317;
        ew.bjky[379] = -1555268370;
        ew.bjky[380] = -1577355822;
        ew.bjky[381] = -1613686553;
        ew.bjky[382] = -1066445016;
        ew.bjky[383] = 345450001;
        ew.bjky[384] = -1022667632;
        ew.bjky[385] = -230896739;
        ew.bjky[386] = 1148333248;
        ew.bjky[387] = -1859188087;
        ew.bjky[388] = 171353688;
        ew.bjky[389] = -986590896;
        ew.bjky[390] = 1838777989;
        ew.bjky[391] = -823159954;
        ew.bjky[392] = 1768609851;
        ew.bjky[393] = -1339554942;
        ew.bjky[394] = 1802846244;
        ew.bjky[395] = 680917357;
        ew.bjky[396] = 142338163;
        ew.bjky[397] = -1035111385;
        ew.bjky[398] = 964157557;
        ew.bjky[399] = 220540255;
    }

    private static /* synthetic */ void blah() {
        ew.bjky[400] = -1683203530;
        ew.bjky[401] = 806446536;
        ew.bjky[402] = 260068405;
        ew.bjky[403] = 1063267312;
        ew.bjky[404] = 1141303061;
        ew.bjky[405] = -1454706523;
        ew.bjky[406] = 634339642;
        ew.bjky[407] = -810842066;
        ew.bjky[408] = -1964869284;
        ew.bjky[409] = -235099207;
        ew.bjky[410] = 575407270;
        ew.bjky[411] = 183795737;
        ew.bjky[412] = -674887150;
        ew.bjky[413] = -1545434500;
        ew.bjky[414] = 1145966713;
        ew.bjky[415] = -590840276;
        ew.bjky[416] = -1835351036;
        ew.bjky[417] = 1338896725;
        ew.bjky[418] = -206767806;
    }

    private static /* synthetic */ void bkyh() {
        ew.bjky[0] = 3778689;
        ew.bjky[1] = 581207398;
        ew.bjky[2] = -581038006;
        ew.bjky[3] = 653620851;
        ew.bjky[4] = 820456026;
        ew.bjky[5] = -838637482;
        ew.bjky[6] = -328596396;
        ew.bjky[7] = -2045235821;
        ew.bjky[8] = 1949212627;
        ew.bjky[9] = -1427095378;
        ew.bjky[10] = 473459390;
        ew.bjky[11] = -2057820877;
        ew.bjky[12] = -115491212;
        ew.bjky[13] = 339133140;
        ew.bjky[14] = -664235913;
        ew.bjky[15] = -1659336749;
        ew.bjky[16] = 144313405;
        ew.bjky[17] = -1918300526;
        ew.bjky[18] = -948074702;
        ew.bjky[19] = 555284116;
        ew.bjky[20] = 719201057;
        ew.bjky[21] = 2135954413;
        ew.bjky[22] = 1202062008;
        ew.bjky[23] = 1388426773;
        ew.bjky[24] = -1998103374;
        ew.bjky[25] = 955840669;
        ew.bjky[26] = 1382306797;
        ew.bjky[27] = -1872170959;
        ew.bjky[28] = 1871614372;
        ew.bjky[29] = -713230796;
        ew.bjky[30] = 183066514;
        ew.bjky[31] = -335255183;
        ew.bjky[32] = 2011691814;
        ew.bjky[33] = 1416374996;
        ew.bjky[34] = -1374179787;
        ew.bjky[35] = -517949771;
        ew.bjky[36] = -1809455586;
        ew.bjky[37] = -970378859;
        ew.bjky[38] = -879518261;
        ew.bjky[39] = -1492806595;
        ew.bjky[40] = 797168037;
        ew.bjky[41] = -242184674;
        ew.bjky[42] = -723919439;
        ew.bjky[43] = -535416596;
        ew.bjky[44] = -1422956290;
        ew.bjky[45] = 1779595187;
        ew.bjky[46] = 1820169962;
        ew.bjky[47] = -403727146;
        ew.bjky[48] = -351365825;
        ew.bjky[49] = -1341964812;
        ew.bjky[50] = -1753520965;
        ew.bjky[51] = 1506067289;
        ew.bjky[52] = 300869730;
        ew.bjky[53] = -1584406462;
        ew.bjky[54] = 1986529813;
        ew.bjky[55] = -1407299358;
        ew.bjky[56] = 1146026882;
        ew.bjky[57] = -251797951;
        ew.bjky[58] = 791649284;
        ew.bjky[59] = 10956431;
        ew.bjky[60] = 854036676;
        ew.bjky[61] = 1237943074;
        ew.bjky[62] = 976294460;
        ew.bjky[63] = -166432830;
        ew.bjky[64] = -1172074475;
        ew.bjky[65] = -1113181593;
        ew.bjky[66] = 298676985;
        ew.bjky[67] = -507388170;
        ew.bjky[68] = -1626132234;
        ew.bjky[69] = -1600620119;
        ew.bjky[70] = -1052700924;
        ew.bjky[71] = 881492807;
        ew.bjky[72] = 2119689036;
        ew.bjky[73] = -795220001;
        ew.bjky[74] = 571506846;
        ew.bjky[75] = 1962331522;
        ew.bjky[76] = 1397477779;
        ew.bjky[77] = 1840444554;
        ew.bjky[78] = -709205763;
        ew.bjky[79] = -1907341417;
        ew.bjky[80] = -1635710929;
        ew.bjky[81] = -1284017159;
        ew.bjky[82] = 2130307221;
        ew.bjky[83] = -1027280759;
        ew.bjky[84] = 2145491980;
        ew.bjky[85] = 680943867;
        ew.bjky[86] = 703984107;
        ew.bjky[87] = 1153606927;
        ew.bjky[88] = 58418029;
        ew.bjky[89] = -319422547;
        ew.bjky[90] = -1468331273;
        ew.bjky[91] = -346735611;
        ew.bjky[92] = 764874817;
        ew.bjky[93] = 249666397;
        ew.bjky[94] = 1310101848;
        ew.bjky[95] = 349714383;
        ew.bjky[96] = -597440041;
        ew.bjky[97] = 2086561047;
        ew.bjky[98] = -1965815714;
        ew.bjky[99] = 888615436;
    }

    private static /* synthetic */ void bler() {
        ew.bjko[200] = 6721921074525844014L;
        ew.bjko[201] = 1684110119558342641L;
        ew.bjko[202] = -2884062254653541812L;
        ew.bjko[203] = -3172138681633613817L;
        ew.bjko[204] = 1461975611477958731L;
        ew.bjko[205] = -3043923449845072797L;
        ew.bjko[206] = -8907576126278398660L;
        ew.bjko[207] = -8894774300444622399L;
        ew.bjko[208] = -4946310697750838532L;
        ew.bjko[209] = 6909959774912814406L;
        ew.bjko[210] = -5907133325595231319L;
        ew.bjko[211] = 6011741801230550430L;
        ew.bjko[212] = 1416994212236009088L;
        ew.bjko[213] = -3154027199924509942L;
        ew.bjko[214] = -2859739553401529072L;
        ew.bjko[215] = 7590810357348142528L;
        ew.bjko[216] = 2462932042011717042L;
        ew.bjko[217] = 1522397199455611050L;
        ew.bjko[218] = -6623028675742162360L;
        ew.bjko[219] = 912119356759139355L;
        ew.bjko[220] = -4887369044406012234L;
        ew.bjko[221] = -5203450918903888034L;
        ew.bjko[222] = -8249761130902468854L;
        ew.bjko[223] = 5963255596396370676L;
        ew.bjko[224] = -329422540812041472L;
        ew.bjko[225] = 5295255452302900436L;
        ew.bjko[226] = -3636034125156841255L;
        ew.bjko[227] = 351663017942490753L;
        ew.bjko[228] = 2586925729479679871L;
        ew.bjko[229] = -5331863037517598996L;
        ew.bjko[230] = 8492875019148106445L;
        ew.bjko[231] = -7825393185574345508L;
        ew.bjko[232] = 2145093543531668322L;
    }

    private static /* synthetic */ long bjkm(int n2) {
        return bjkn[n2] ^ bjko[n2];
    }

    static {
        bjky = new int[419];
        bjkz = new int[419];
        ew.bkyh();
        ew.bkyz();
        ew.bkzm();
        ew.bkzy();
        ew.blah();
        ew.blak();
        ew.blax();
        ew.blbj();
        ew.blbu();
        ew.blcf();
        bjkn = new long[233];
        bjko = new long[233];
        ew.blck();
        ew.blcy();
        ew.bldn();
        ew.bldr();
        ew.bleg();
        ew.bler();
    }

    public static /* synthetic */ CallSite bjkp(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void blbj() {
        ew.bjkz[200] = -849432121;
        ew.bjkz[201] = 1264204564;
        ew.bjkz[202] = 1265217358;
        ew.bjkz[203] = -336858623;
        ew.bjkz[204] = 2140887969;
        ew.bjkz[205] = -1850940790;
        ew.bjkz[206] = 1379874789;
        ew.bjkz[207] = -1674168664;
        ew.bjkz[208] = 410505461;
        ew.bjkz[209] = 241519327;
        ew.bjkz[210] = 1855730088;
        ew.bjkz[211] = -1469111406;
        ew.bjkz[212] = 2058248088;
        ew.bjkz[213] = -592651529;
        ew.bjkz[214] = 1365269111;
        ew.bjkz[215] = 610030364;
        ew.bjkz[216] = 830875962;
        ew.bjkz[217] = 295250320;
        ew.bjkz[218] = -391322209;
        ew.bjkz[219] = 1180272302;
        ew.bjkz[220] = 1353563610;
        ew.bjkz[221] = 415793292;
        ew.bjkz[222] = -66227841;
        ew.bjkz[223] = -1978481014;
        ew.bjkz[224] = 1656901612;
        ew.bjkz[225] = -1659736112;
        ew.bjkz[226] = 1528959769;
        ew.bjkz[227] = 1597711165;
        ew.bjkz[228] = -1781843695;
        ew.bjkz[229] = -1966589531;
        ew.bjkz[230] = -754313403;
        ew.bjkz[231] = -1410553283;
        ew.bjkz[232] = 1909215349;
        ew.bjkz[233] = -489504710;
        ew.bjkz[234] = -1199845871;
        ew.bjkz[235] = -366983569;
        ew.bjkz[236] = -1689025692;
        ew.bjkz[237] = 1972112479;
        ew.bjkz[238] = 1089035408;
        ew.bjkz[239] = 1064559068;
        ew.bjkz[240] = 935842147;
        ew.bjkz[241] = -1298209648;
        ew.bjkz[242] = 56671207;
        ew.bjkz[243] = 1075027766;
        ew.bjkz[244] = -2055708024;
        ew.bjkz[245] = -779390249;
        ew.bjkz[246] = 1431622681;
        ew.bjkz[247] = 2144018355;
        ew.bjkz[248] = -777918017;
        ew.bjkz[249] = 1280343875;
        ew.bjkz[250] = -1787653186;
        ew.bjkz[251] = 1536034246;
        ew.bjkz[252] = -1913406963;
        ew.bjkz[253] = -1362962070;
        ew.bjkz[254] = -1625275692;
        ew.bjkz[255] = 554156051;
        ew.bjkz[256] = 559012984;
        ew.bjkz[257] = -1113401336;
        ew.bjkz[258] = 930363035;
        ew.bjkz[259] = 51424478;
        ew.bjkz[260] = 940396434;
        ew.bjkz[261] = -462728276;
        ew.bjkz[262] = -1252521173;
        ew.bjkz[263] = 1426765714;
        ew.bjkz[264] = 2023458997;
        ew.bjkz[265] = 433948694;
        ew.bjkz[266] = -2117733977;
        ew.bjkz[267] = 1764646117;
        ew.bjkz[268] = 1699319642;
        ew.bjkz[269] = -314495238;
        ew.bjkz[270] = -120574542;
        ew.bjkz[271] = 1516326202;
        ew.bjkz[272] = -1900742229;
        ew.bjkz[273] = -414907645;
        ew.bjkz[274] = 150969942;
        ew.bjkz[275] = -1439305958;
        ew.bjkz[276] = 2141982627;
        ew.bjkz[277] = 1273196007;
        ew.bjkz[278] = -866241592;
        ew.bjkz[279] = -739517033;
        ew.bjkz[280] = -1660207673;
        ew.bjkz[281] = -527784005;
        ew.bjkz[282] = 1894671479;
        ew.bjkz[283] = 472430948;
        ew.bjkz[284] = 476231516;
        ew.bjkz[285] = -927774521;
        ew.bjkz[286] = 747748772;
        ew.bjkz[287] = -832089900;
        ew.bjkz[288] = 274772166;
        ew.bjkz[289] = -1283763709;
        ew.bjkz[290] = 990154231;
        ew.bjkz[291] = 197720253;
        ew.bjkz[292] = 1026403342;
        ew.bjkz[293] = 1677290120;
        ew.bjkz[294] = -1168698875;
        ew.bjkz[295] = 1610647356;
        ew.bjkz[296] = 1455505797;
        ew.bjkz[297] = -978160752;
        ew.bjkz[298] = -114163787;
        ew.bjkz[299] = -1068969499;
    }

    private static /* synthetic */ void blax() {
        ew.bjkz[100] = -2005038076;
        ew.bjkz[101] = 588330546;
        ew.bjkz[102] = 1908219494;
        ew.bjkz[103] = -1123653754;
        ew.bjkz[104] = 187035416;
        ew.bjkz[105] = -411616441;
        ew.bjkz[106] = 89134323;
        ew.bjkz[107] = -1435565282;
        ew.bjkz[108] = 1852579835;
        ew.bjkz[109] = 1473235973;
        ew.bjkz[110] = -416841303;
        ew.bjkz[111] = -1803480648;
        ew.bjkz[112] = 301605821;
        ew.bjkz[113] = -264900037;
        ew.bjkz[114] = -1404462870;
        ew.bjkz[115] = 1001864962;
        ew.bjkz[116] = 470464476;
        ew.bjkz[117] = -1068735041;
        ew.bjkz[118] = -62621596;
        ew.bjkz[119] = 1855373544;
        ew.bjkz[120] = -764648491;
        ew.bjkz[121] = -1614348178;
        ew.bjkz[122] = -643816245;
        ew.bjkz[123] = 1175983418;
        ew.bjkz[124] = 2024509437;
        ew.bjkz[125] = 2051599984;
        ew.bjkz[126] = 92679880;
        ew.bjkz[127] = -617908854;
        ew.bjkz[128] = 667334032;
        ew.bjkz[129] = -1262543168;
        ew.bjkz[130] = -1710607568;
        ew.bjkz[131] = 1656104282;
        ew.bjkz[132] = -1905460214;
        ew.bjkz[133] = 718452715;
        ew.bjkz[134] = 1702734457;
        ew.bjkz[135] = 865336951;
        ew.bjkz[136] = 133748661;
        ew.bjkz[137] = -1433955049;
        ew.bjkz[138] = -1460880535;
        ew.bjkz[139] = 1559945119;
        ew.bjkz[140] = 828210563;
        ew.bjkz[141] = 1389825862;
        ew.bjkz[142] = 1599553565;
        ew.bjkz[143] = -2141743396;
        ew.bjkz[144] = -1248056773;
        ew.bjkz[145] = 1963319646;
        ew.bjkz[146] = 880685076;
        ew.bjkz[147] = -439959098;
        ew.bjkz[148] = -1118866048;
        ew.bjkz[149] = -1217118488;
        ew.bjkz[150] = -1072960734;
        ew.bjkz[151] = -1019522652;
        ew.bjkz[152] = -1215571620;
        ew.bjkz[153] = 1236407041;
        ew.bjkz[154] = -1543116912;
        ew.bjkz[155] = 692130712;
        ew.bjkz[156] = 1271384344;
        ew.bjkz[157] = -1646279811;
        ew.bjkz[158] = 1638348187;
        ew.bjkz[159] = 681937406;
        ew.bjkz[160] = 37910347;
        ew.bjkz[161] = 1452924829;
        ew.bjkz[162] = -249384846;
        ew.bjkz[163] = -1510189723;
        ew.bjkz[164] = -1981397062;
        ew.bjkz[165] = -1970931343;
        ew.bjkz[166] = -239737165;
        ew.bjkz[167] = -646616477;
        ew.bjkz[168] = -1588170653;
        ew.bjkz[169] = -179381783;
        ew.bjkz[170] = 550600810;
        ew.bjkz[171] = 1127714727;
        ew.bjkz[172] = -2041176065;
        ew.bjkz[173] = -1412798567;
        ew.bjkz[174] = 203311422;
        ew.bjkz[175] = -521217799;
        ew.bjkz[176] = 771060780;
        ew.bjkz[177] = 806231029;
        ew.bjkz[178] = -1074504329;
        ew.bjkz[179] = -1602304465;
        ew.bjkz[180] = 1955127686;
        ew.bjkz[181] = 1228372585;
        ew.bjkz[182] = -1941659862;
        ew.bjkz[183] = 1415040995;
        ew.bjkz[184] = 637407430;
        ew.bjkz[185] = 1605945339;
        ew.bjkz[186] = -2094194453;
        ew.bjkz[187] = -1800976054;
        ew.bjkz[188] = -1722723604;
        ew.bjkz[189] = 628799992;
        ew.bjkz[190] = -1850690287;
        ew.bjkz[191] = -1983493704;
        ew.bjkz[192] = 1317311614;
        ew.bjkz[193] = 1860140511;
        ew.bjkz[194] = 1639235725;
        ew.bjkz[195] = -794957648;
        ew.bjkz[196] = -1093943750;
        ew.bjkz[197] = -177909681;
        ew.bjkz[198] = -1297768677;
        ew.bjkz[199] = 1705989754;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void usePreparedItem() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ew.dl - ew.bjkp("bkhs", bjkm(int ), (int)118)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ew.bjkp("bkht", bjkx(int ), (int)274)) break;
            v0 /* !! */  = (long)ew.bjkp("bkhu", bjkx(int ), (int)275);
        }
        var3_1 = ew.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ew.dl - ew.bjkp("bkhz", bjkm(int ), (int)119)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == ew.bjkp("bkia", bjkx(int ), (int)276)) break;
            v1 /* !! */  = (long)ew.bjkp("bkic", bjkx(int ), (int)277);
        }
        var2_2 /* !! */  = ew.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = ew.dl - ew.bjkp("bkid", bjkm(int ), (int)120)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == ew.bjkp("bkif", bjkx(int ), (int)278)) break;
            v2 /* !! */  = (long)ew.bjkp("bkig", bjkx(int ), (int)279);
        }
        var1_3 = ew.a;
        if (var3_1) {
            throw null;
lbl21:
            // 9 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl21
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v3 /* !! */  = ew.dl;
                if (true) ** GOTO lbl31
                block60: while (true) {
                    v3 /* !! */  = (long)(v4 - ew.bjkp("bkii", bjkm(int ), (int)121));
lbl31:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -766311213: {
                            v4 = ew.bjkp("bkik", bjkm(int ), (int)122);
                            continue block60;
                        }
                        case 125951915: {
                            break block60;
                        }
                        case 273536769: {
                            v4 = ew.bjkp("bkil", bjkm(int ), (int)123);
                            continue block60;
                        }
                    }
                    break;
                }
                if (this.fromHotbar) ** GOTO lbl85
                if (var1_3 || var1_3) ** GOTO lbl21
                v5 /* !! */  = ew.dl;
                if (true) ** GOTO lbl46
                block61: while (true) {
                    v5 /* !! */  = (long)(v6 - ew.bjkp("bkin", bjkm(int ), (int)124));
lbl46:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -977531622: {
                            v6 = ew.bjkp("bkip", bjkm(int ), (int)125);
                            continue block61;
                        }
                        case -231139599: {
                            v6 = ew.bjkp("bkiq", bjkm(int ), (int)126);
                            continue block61;
                        }
                        case 125951915: {
                            break block61;
                        }
                        case 289015058: {
                            v6 = ew.bjkp("bkir", bjkm(int ), (int)127);
                            continue block61;
                        }
                    }
                    break;
                }
                v7 /* !! */  = ew.dl;
                if (true) ** GOTO lbl62
                block62: while (true) {
                    v7 /* !! */  = (long)(v8 - ew.bjkp("bkis", bjkm(int ), (int)128));
lbl62:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -179606299: {
                            v8 = ew.bjkp("bkit", bjkm(int ), (int)129);
                            continue block62;
                        }
                        case -136674136: {
                            v8 = ew.bjkp("bkiu", bjkm(int ), (int)130);
                            continue block62;
                        }
                        case 125951915: {
                            break block62;
                        }
                        case 1211466983: {
                            v8 = ew.bjkp("bkiv", bjkm(int ), (int)131);
                            continue block62;
                        }
                    }
                    break;
                }
                v9 /* !! */  = ew.dl;
                if (true) ** GOTO lbl78
                block63: while (true) {
                    v9 /* !! */  = (long)(ew.bjkp("bkix", bjkm(int ), (int)133) - ew.bjkp("bkiw", bjkm(int ), (int)132));
lbl78:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -1507797892: {
                            continue block63;
                        }
                        case 125951915: {
                            break block63;
                        }
                    }
                    break;
                }
                nv.swapHotbar(this.targetSlot, this.temporaryHotbarSlot);
                if (var1_3) ** GOTO lbl21
lbl85:
                // 2 sources

                if (var1_3 || var1_3) ** GOTO lbl21
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_3 = ew.dl - ew.bjkp("bkiy", bjkm(int ), (int)134)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == ew.bjkp("bkiz", bjkx(int ), (int)280)) break;
                    v10 /* !! */  = (long)ew.bjkp("bkja", bjkx(int ), (int)281);
                }
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_4 = ew.dl - ew.bjkp("bkjc", bjkm(int ), (int)135)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v11 /* !! */  == ew.bjkp("bkjd", bjkx(int ), (int)282)) break;
                    v11 /* !! */  = (long)ew.bjkp("bkje", bjkx(int ), (int)283);
                }
                nv.selectSlotSilent(this.temporaryHotbarSlot);
                if (var1_3 || var1_3) ** GOTO lbl21
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_5 = ew.dl - ew.bjkp("bkjf", bjkm(int ), (int)136)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == ew.bjkp("bkjg", bjkx(int ), (int)284)) break;
                    v12 /* !! */  = (long)ew.bjkp("bkjh", bjkx(int ), (int)285);
                }
                while (true) {
                    if ((v13 /* !! */  = (cfr_temp_6 = ew.dl - ew.bjkp("bkjj", bjkm(int ), (int)137)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v13 /* !! */  == ew.bjkp("bkjk", bjkx(int ), (int)286)) break;
                    v13 /* !! */  = (long)ew.bjkp("bkjm", bjkx(int ), (int)287);
                }
                nv.sendUsePacket(class_1268.field_5808);
                if (var1_3 || var1_3) ** GOTO lbl21
                while (true) {
                    if ((v14 /* !! */  = (cfr_temp_7 = ew.dl - ew.bjkp("bkjr", bjkm(int ), (int)138)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v14 /* !! */  == ew.bjkp("bkjs", bjkx(int ), (int)288)) break;
                    v14 /* !! */  = (long)ew.bjkp("bkjt", bjkx(int ), (int)289);
                }
                while (true) {
                    if ((v15 /* !! */  = (cfr_temp_8 = ew.dl - ew.bjkp("bkjv", bjkm(int ), (int)139)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v15 /* !! */  == ew.bjkp("bkjx", bjkx(int ), (int)290)) break;
                    v15 /* !! */  = (long)ew.bjkp("bkjz", bjkx(int ), (int)291);
                }
                v16 = ew.mc.field_1724;
                v17 /* !! */  = ew.dl;
                if (true) ** GOTO lbl125
                block70: while (true) {
                    v17 /* !! */  = (long)(v18 - ew.bjkp("bkkb", bjkm(int ), (int)140));
lbl125:
                    // 2 sources

                    switch ((int)v17 /* !! */ ) {
                        case -1720450338: {
                            v18 = ew.bjkp("bkkf", bjkm(int ), (int)141);
                            continue block70;
                        }
                        case -438928617: {
                            v18 = ew.bjkp("bkkg", bjkm(int ), (int)142);
                            continue block70;
                        }
                        case 125951915: {
                            break block70;
                        }
                    }
                    break;
                }
                v19 /* !! */  = ew.dl;
                if (true) ** GOTO lbl138
                block71: while (true) {
                    v19 /* !! */  = (long)(ew.bjkp("bkki", bjkm(int ), (int)144) - ew.bjkp("bkkh", bjkm(int ), (int)143));
lbl138:
                    // 2 sources

                    switch ((int)v19 /* !! */ ) {
                        case 125951915: {
                            break block71;
                        }
                        case 1506552469: {
                            continue block71;
                        }
                    }
                    break;
                }
                v16.method_6104(class_1268.field_5808);
                if (var1_3 || var1_3) ** GOTO lbl21
                while (true) {
                    if ((v20 /* !! */  = (cfr_temp_9 = ew.dl - ew.bjkp("bkkl", bjkm(int ), (int)145)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                    if (v20 /* !! */  == ew.bjkp("bkko", bjkx(int ), (int)292)) break;
                    v20 /* !! */  = (long)ew.bjkp("bkkq", bjkx(int ), (int)293);
                }
                v21 = System.currentTimeMillis() + ew.bjkp("bkkt", bjkm(int ), (int)146);
                v22 /* !! */  = ew.dl;
                if (true) ** GOTO lbl155
                block73: while (true) {
                    v22 /* !! */  = (long)(v23 - ew.bjkp("bkkw", bjkm(int ), (int)147));
lbl155:
                    // 2 sources

                    switch ((int)v22 /* !! */ ) {
                        case -849606571: {
                            v23 = ew.bjkp("bkkz", bjkm(int ), (int)148);
                            continue block73;
                        }
                        case 125951915: {
                            break block73;
                        }
                        case 376501824: {
                            v23 = ew.bjkp("bklb", bjkm(int ), (int)149);
                            continue block73;
                        }
                    }
                    break;
                }
                this.restoreAt = v21;
                if (var1_3 || var1_3) ** GOTO lbl21
                while (true) {
                    if ((v24 /* !! */  = (cfr_temp_10 = ew.dl - ew.bjkp("bkle", bjkm(int ), (int)150)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
                    if (v24 /* !! */  == ew.bjkp("bklh", bjkx(int ), (int)294)) break;
                    v24 /* !! */  = (long)ew.bjkp("bklj", bjkx(int ), (int)295);
                }
                while (true) {
                    if ((v25 /* !! */  = (cfr_temp_11 = ew.dl - ew.bjkp("bklm", bjkm(int ), (int)151)) == 0L ? 0 : (cfr_temp_11 < 0L ? -1 : 1)) == false) continue;
                    if (v25 /* !! */  == ew.bjkp("bklp", bjkx(int ), (int)296)) break;
                    v25 /* !! */  = (long)ew.bjkp("bklr", bjkx(int ), (int)297);
                }
                this.phase = ew$ActionPhase.WAIT_RESTORE;
                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
lbl180:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)ew.bjkp("bklu", bjkx(int ), (int)298);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl233
            }
lbl185:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)ew.bjkp("bklv", bjkx(int ), (int)299);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl259
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ew.bjkp("bklw", bjkx(int ), (int)300);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl238
                    break;
                }
            }
            case 3: {
                var2_2 /* !! */  = (int)ew.bjkp("bklx", bjkx(int ), (int)301);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl233
            }
lbl201:
            // 2 sources

            case 4: {
                var2_2 /* !! */  = (int)ew.bjkp("bklz", bjkx(int ), (int)302);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl211
            }
lbl206:
            // 2 sources

            case 5: {
                var2_2 /* !! */  = (int)ew.bjkp("bkma", bjkx(int ), (int)303);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl247
            }
lbl211:
            // 2 sources

            case 6: {
                var2_2 /* !! */  = (int)ew.bjkp("bkmc", bjkx(int ), (int)304);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl238
            }
            case 7: {
                var2_2 /* !! */  = (int)ew.bjkp("bkmd", bjkx(int ), (int)305);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl229
            }
            case 8: {
                var2_2 /* !! */  = (int)ew.bjkp("bkme", bjkx(int ), (int)306);
                if (var3_1) {
                    throw null;
                }
            }
            case 9: {
                var2_2 /* !! */  = (int)ew.bjkp("bkmg", bjkx(int ), (int)307);
                if (!var3_1) ** GOTO lbl206
                throw null;
            }
lbl229:
            // 3 sources

            case 10: {
                var2_2 /* !! */  = (int)ew.bjkp("bkmh", bjkx(int ), (int)308);
                if (!var3_1) ** GOTO lbl185
                throw null;
            }
lbl233:
            // 3 sources

            case 11: {
                var2_2 /* !! */  = (int)ew.bjkp("bkmk", bjkx(int ), (int)309);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl251
            }
lbl238:
            // 3 sources

            case 12: {
                var2_2 /* !! */  = (int)ew.bjkp("bkml", bjkx(int ), (int)310);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl251
            }
lbl243:
            // 2 sources

            case 13: {
                var2_2 /* !! */  = (int)ew.bjkp("bkmm", bjkx(int ), (int)311);
                if (!var3_1) ** GOTO lbl201
                throw null;
            }
lbl247:
            // 2 sources

            case 14: {
                var2_2 /* !! */  = (int)ew.bjkp("bkmo", bjkx(int ), (int)312);
                if (!var3_1) ** GOTO lbl180
                throw null;
            }
lbl251:
            // 3 sources

            case 15: {
                var2_2 /* !! */  = (int)ew.bjkp("bkmp", bjkx(int ), (int)313);
                if (!var3_1) ** GOTO lbl243
                throw null;
            }
            case 16: {
                var2_2 /* !! */  = (int)ew.bjkp("bkmr", bjkx(int ), (int)314);
                if (!var3_1) break;
                throw null;
            }
lbl259:
            // 2 sources

            case 17: {
                var2_2 /* !! */  = (int)ew.bjkp("bkms", bjkx(int ), (int)315);
                if (!var3_1) ** GOTO lbl229
                throw null;
            }
            case 18: 
        }
        var2_2 /* !! */  = (int)ew.bjkp("bkmt", bjkx(int ), (int)316);
        ** while (!var3_1)
lbl266:
        // 1 sources

        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private boolean prepare(class_1792 var1_1) {
        v0 /* !! */  = ew.dl;
        if (true) ** GOTO lbl5
        block66: while (true) {
            v0 /* !! */  = (long)(v1 - ew.bjkp("bkbt", bjkm(int ), (int)87));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1928274045: {
                    v1 = ew.bjkp("bkbu", bjkm(int ), (int)88);
                    continue block66;
                }
                case 125951915: {
                    break block66;
                }
                case 388733361: {
                    v1 = ew.bjkp("bkbv", bjkm(int ), (int)89);
                    continue block66;
                }
            }
            break;
        }
        var6_2 = ew.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = ew.dl - ew.bjkp("bkbw", bjkm(int ), (int)90)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == ew.bjkp("bkbx", bjkx(int ), (int)221)) break;
            v2 /* !! */  = (long)ew.bjkp("bkby", bjkx(int ), (int)222);
        }
        var5_3 /* !! */  = ew.b;
        v3 /* !! */  = ew.dl;
        block68: while (true) {
            switch ((int)v3 /* !! */ ) {
                case -1900375334: {
                    v3 /* !! */  = (long)(ew.bjkp("bkca", bjkm(int ), (int)92) - ew.bjkp("bkbz", bjkm(int ), (int)91));
                    continue block68;
                }
                case 125951915: {
                    break block68;
                }
            }
            break;
        }
        var4_4 = ew.a;
        if (var6_2) {
            throw null;
        }
        if (var4_4 || var4_4) return (boolean)ew.bjkp("bkcb", bjkx(int ), (int)223);
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_2 = ew.dl - ew.bjkp("bkcc", bjkm(int ), (int)93)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == ew.bjkp("bkce", bjkx(int ), (int)224)) {
                var2_5 = nv.findItemInHotbar(var1_1);
                if (var4_4) return (boolean)ew.bjkp("bkcb", bjkx(int ), (int)223);
                break;
            }
            v4 /* !! */  = (long)ew.bjkp("bkcf", bjkx(int ), (int)225);
        }
        if (var4_4) return (boolean)ew.bjkp("bkcb", bjkx(int ), (int)223);
        if (var2_5 != ew.bjkp("bkci", bjkx(int ), (int)226)) {
            if (var4_4 || var4_4) return (boolean)ew.bjkp("bkcb", bjkx(int ), (int)223);
            v5 /* !! */  = ew.bjkp("bkco", bjkx(int ), (int)227);
        } else {
            if (var4_4) return (boolean)ew.bjkp("bkcb", bjkx(int ), (int)223);
            v6 /* !! */  = ew.dl;
            block70: while (true) {
                switch ((int)v6 /* !! */ ) {
                    case -381041375: {
                        v6 /* !! */  = (long)(ew.bjkp("bkcl", bjkm(int ), (int)95) - ew.bjkp("bkcj", bjkm(int ), (int)94));
                        continue block70;
                    }
                    case 125951915: {
                        break block70;
                    }
                }
                break;
            }
            v5 /* !! */  = (CallSite)nv.findItemInInventory(var1_1);
            if (var6_2) {
                throw null;
            }
        }
        var3_6 = v5 /* !! */ ;
        if (var4_4 || var4_4) return (boolean)ew.bjkp("bkcb", bjkx(int ), (int)223);
        if (var2_5 == ew.bjkp("bkcq", bjkx(int ), (int)228)) {
            if (var4_4) return (boolean)ew.bjkp("bkcb", bjkx(int ), (int)223);
            if (var3_6 == ew.bjkp("bkcs", bjkx(int ), (int)229)) {
                if (var4_4 || var4_4) return (boolean)ew.bjkp("bkcb", bjkx(int ), (int)223);
                return (boolean)ew.bjkp("bkcu", bjkx(int ), (int)230);
            }
        }
        if (var4_4 || var4_4) return (boolean)ew.bjkp("bkcb", bjkx(int ), (int)223);
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_3 = ew.dl - ew.bjkp("bkdb", bjkm(int ), (int)96)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v7 /* !! */  == ew.bjkp("bkdd", bjkx(int ), (int)231)) break;
            v7 /* !! */  = (long)ew.bjkp("bkdg", bjkx(int ), (int)232);
        }
        while (true) {
            block131: {
                if ((v8 /* !! */  = (cfr_temp_4 = ew.dl - ew.bjkp("bkdi", bjkm(int ), (int)97)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                if (v8 /* !! */  != ew.bjkp("bkdj", bjkx(int ), (int)233)) break block131;
                v9 = ew.mc.field_1724;
                v10 /* !! */  = ew.dl;
                if (true) ** GOTO lbl82
            }
            v8 /* !! */  = (long)ew.bjkp("bkdk", bjkx(int ), (int)234);
        }
        block73: while (true) {
            v10 /* !! */  = (long)(v11 - ew.bjkp("bkdn", bjkm(int ), (int)98));
lbl82:
            // 2 sources

            switch ((int)v10 /* !! */ ) {
                case 125951915: {
                    break block73;
                }
                case 167476277: {
                    v11 = ew.bjkp("bkdr", bjkm(int ), (int)99);
                    continue block73;
                }
                case 691949903: {
                    v11 = ew.bjkp("bkdt", bjkm(int ), (int)100);
                    continue block73;
                }
                case 1512797210: {
                    v11 = ew.bjkp("bkdw", bjkm(int ), (int)101);
                    continue block73;
                }
            }
            break;
        }
        v12 = v9.method_31548();
        v13 /* !! */  = ew.dl;
        if (true) ** GOTO lbl99
        block74: while (true) {
            v13 /* !! */  = (long)(v14 - ew.bjkp("bkdy", bjkm(int ), (int)102));
lbl99:
            // 2 sources

            switch ((int)v13 /* !! */ ) {
                case 125951915: {
                    break block74;
                }
                case 463960091: {
                    v14 = ew.bjkp("bkea", bjkm(int ), (int)103);
                    continue block74;
                }
                case 1714147900: {
                    v14 = ew.bjkp("bkeb", bjkm(int ), (int)104);
                    continue block74;
                }
            }
            break;
        }
        v15 = v12.method_67532();
        v16 /* !! */  = ew.dl;
        if (true) ** GOTO lbl113
        block75: while (true) {
            v16 /* !! */  = (long)(v17 - ew.bjkp("bked", bjkm(int ), (int)105));
lbl113:
            // 2 sources

            switch ((int)v16 /* !! */ ) {
                case -261290085: {
                    v17 = ew.bjkp("bkeg", bjkm(int ), (int)106);
                    continue block75;
                }
                case 125951915: {
                    break block75;
                }
                case 1422160354: {
                    v17 = ew.bjkp("bkeh", bjkm(int ), (int)107);
                    continue block75;
                }
                case 1962374776: {
                    v17 = ew.bjkp("bkei", bjkm(int ), (int)108);
                    continue block75;
                }
            }
            break;
        }
        this.previousSlot = v15;
        if (var5_3 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block76: while (true) {
            block132: {
                switch (cfr_temp_0 == -2147483648 ? var5_3 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var4_4 || var4_4) return (boolean)ew.bjkp("bkcb", bjkx(int ), (int)223);
                        if (var2_5 != ew.bjkp("bkej", bjkx(int ), (int)235)) {
                            v18 = ew.bjkp("bkel", bjkx(int ), (int)236);
                            if (var6_2) {
                                throw null;
                            }
                        } else {
                            v18 = ew.bjkp("bkem", bjkx(int ), (int)237);
                        }
                        while (true) {
                            if ((v19 /* !! */  = (cfr_temp_5 = ew.dl - ew.bjkp("bkeo", bjkm(int ), (int)109)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                            if (v19 /* !! */  == ew.bjkp("bkes", bjkx(int ), (int)238)) {
                                this.fromHotbar = v18;
                                if (var4_4) return (boolean)ew.bjkp("bkcb", bjkx(int ), (int)223);
                                break;
                            }
                            v19 /* !! */  = (long)ew.bjkp("bket", bjkx(int ), (int)239);
                        }
                        if (var4_4) return (boolean)ew.bjkp("bkcb", bjkx(int ), (int)223);
                        while (true) {
                            if ((v20 /* !! */  = (cfr_temp_6 = ew.dl - ew.bjkp("bkeu", bjkm(int ), (int)110)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                            if (v20 /* !! */  != ew.bjkp("bkev", bjkx(int ), (int)240)) ** GOTO lbl153
                            if (this.fromHotbar) {
                                break;
                            }
                            ** GOTO lbl159
lbl153:
                            // 1 sources

                            v20 /* !! */  = (long)ew.bjkp("bkew", bjkx(int ), (int)241);
                        }
                        v21 /* !! */  = var2_5;
                        if (var6_2) {
                            throw null;
                        }
                        ** GOTO lbl160
lbl159:
                        // 1 sources

                        v21 /* !! */  = (int)var3_6;
lbl160:
                        // 2 sources

                        v22 /* !! */  = ew.dl;
                        block79: while (true) {
                            switch ((int)v22 /* !! */ ) {
                                case -978911847: {
                                    v23 = ew.bjkp("bkey", bjkm(int ), (int)112);
                                    ** GOTO lbl168
                                }
                                case -603916795: {
                                    v23 = ew.bjkp("bkez", bjkm(int ), (int)113);
lbl168:
                                    // 2 sources

                                    v22 /* !! */  = (long)(v23 - ew.bjkp("bkex", bjkm(int ), (int)111));
                                    continue block79;
                                }
                                case 125951915: {
                                    break block79;
                                }
                            }
                            break;
                        }
                        this.targetSlot = v21 /* !! */ ;
                        if (var4_4 || var4_4) return (boolean)ew.bjkp("bkcb", bjkx(int ), (int)223);
                        v24 /* !! */  = ew.dl;
                        block80: while (true) {
                            switch ((int)v24 /* !! */ ) {
                                case -1973216701: {
                                    v24 /* !! */  = (long)(ew.bjkp("bkfb", bjkm(int ), (int)115) - ew.bjkp("bkfa", bjkm(int ), (int)114));
                                    continue block80;
                                }
                                case 125951915: {
                                    break block80;
                                }
                            }
                            break;
                        }
                        if (!this.fromHotbar) ** GOTO lbl187
                        v25 = var2_5;
                        if (var6_2) {
                            throw null;
                        }
                        ** GOTO lbl296
lbl187:
                        // 1 sources

                        while (true) {
                            if ((v26 /* !! */  = (cfr_temp_7 = ew.dl - ew.bjkp("bkfc", bjkm(int ), (int)116)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                            if (v26 /* !! */  != ew.bjkp("bkfd", bjkx(int ), (int)242)) ** GOTO lbl192
                            v25 = (this.previousSlot + ew.bjkp("bkff", bjkx(int ), (int)244)) % ew.bjkp("bkfg", bjkx(int ), (int)245);
                            ** GOTO lbl296
lbl192:
                            // 1 sources

                            v26 /* !! */  = (long)ew.bjkp("bkfe", bjkx(int ), (int)243);
                        }
                    }
                    case 3: {
                        var5_3 /* !! */  = (int)ew.bjkp("bkfy", bjkx(int ), (int)252);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 0: {
                        var5_3 /* !! */  = (int)ew.bjkp("bkfq", bjkx(int ), (int)249);
                        cfr_temp_0 = 6;
                        if (var6_2) {
                            throw null;
                        }
                        break block132;
                    }
                    case 9: {
                        var5_3 /* !! */  = (int)ew.bjkp("bkgi", bjkx(int ), (int)258);
                        cfr_temp_0 = 2;
                        if (var6_2) {
                            throw null;
                        }
                        break block132;
                    }
                    case 11: {
                        var5_3 /* !! */  = (int)ew.bjkp("bkgn", bjkx(int ), (int)260);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 10: {
                        var5_3 /* !! */  = (int)ew.bjkp("bkgm", bjkx(int ), (int)259);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 6: {
                        var5_3 /* !! */  = (int)ew.bjkp("bkgc", bjkx(int ), (int)255);
                        cfr_temp_0 = 2;
                        if (var6_2) {
                            throw null;
                        }
                        break block132;
                    }
                    case 13: {
                        var5_3 /* !! */  = (int)ew.bjkp("bkgr", bjkx(int ), (int)262);
                        cfr_temp_0 = 20;
                        if (var6_2) {
                            throw null;
                        }
                        break block132;
                    }
                    case 14: {
                        ** GOTO lbl287
                    }
                    case 18: {
                        var5_3 /* !! */  = (int)ew.bjkp("bkha", bjkx(int ), (int)267);
                        cfr_temp_0 = 20;
                        if (var6_2) {
                            throw null;
                        }
                        break block132;
                    }
                    case 19: {
                        var5_3 /* !! */  = (int)ew.bjkp("bkhc", bjkx(int ), (int)268);
                        cfr_temp_0 = 7;
                        if (var6_2) {
                            throw null;
                        }
                        break block132;
                    }
                    case 22: {
                        var5_3 /* !! */  = (int)ew.bjkp("bkhi", bjkx(int ), (int)271);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 20: {
                        var5_3 /* !! */  = (int)ew.bjkp("bkhe", bjkx(int ), (int)269);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 5: {
                        var5_3 /* !! */  = (int)ew.bjkp("bkga", bjkx(int ), (int)254);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 16: {
                        var5_3 /* !! */  = (int)ew.bjkp("bkgw", bjkx(int ), (int)265);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 2: {
                        var5_3 /* !! */  = (int)ew.bjkp("bkfu", bjkx(int ), (int)251);
                        cfr_temp_0 = 4;
                        if (var6_2) {
                            throw null;
                        }
                        break block132;
                    }
                    case 23: {
                        var5_3 /* !! */  = (int)ew.bjkp("bkhj", bjkx(int ), (int)272);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 8: {
                        var5_3 /* !! */  = (int)ew.bjkp("bkgg", bjkx(int ), (int)257);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 21: {
                        var5_3 /* !! */  = (int)ew.bjkp("bkhg", bjkx(int ), (int)270);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 12: {
                        var5_3 /* !! */  = (int)ew.bjkp("bkgp", bjkx(int ), (int)261);
                        if (var6_2) {
                            throw null;
                        }
                        ** GOTO lbl-1000
                    }
                    case 24: lbl-1000:
                    // 2 sources

                    {
                        var5_3 /* !! */  = (int)ew.bjkp("bkhk", bjkx(int ), (int)273);
                        if (var6_2) {
                            throw null;
                        }
lbl287:
                        // 3 sources

                        var5_3 /* !! */  = (int)ew.bjkp("bkgt", bjkx(int ), (int)263);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 15: {
                        var5_3 /* !! */  = (int)ew.bjkp("bkgv", bjkx(int ), (int)264);
                        cfr_temp_0 = 17;
                        if (var6_2) {
                            throw null;
                        }
                        break block132;
                    }
lbl296:
                    // 2 sources

                    while (true) {
                        if ((v27 /* !! */  = (cfr_temp_8 = ew.dl - ew.bjkp("bkfl", bjkm(int ), (int)117)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                        if (v27 /* !! */  == ew.bjkp("bkfm", bjkx(int ), (int)246)) {
                            this.temporaryHotbarSlot = v25;
                            if (var4_4) return (boolean)ew.bjkp("bkcb", bjkx(int ), (int)223);
                            break;
                        }
                        v27 /* !! */  = (long)ew.bjkp("bkfn", bjkx(int ), (int)247);
                    }
                    if (!var4_4) return (boolean)ew.bjkp("bkfo", bjkx(int ), (int)248);
                    return (boolean)ew.bjkp("bkcb", bjkx(int ), (int)223);
                    case 1: {
                        var5_3 /* !! */  = (int)ew.bjkp("bkfs", bjkx(int ), (int)250);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 7: {
                        var5_3 /* !! */  = (int)ew.bjkp("bkge", bjkx(int ), (int)256);
                        cfr_temp_0 = 1;
                        if (var6_2) {
                            throw null;
                        }
                        break block132;
                    }
                    case 4: {
                        var5_3 /* !! */  = (int)ew.bjkp("bkfz", bjkx(int ), (int)253);
                        if (var6_2) {
                            throw null;
                        }
                    }
                    case 17: 
                }
                ** GOTO lbl325
            }
            do {
                if (true) continue block76;
lbl325:
                // 2 sources

                var5_3 /* !! */  = (int)ew.bjkp("bkgy", bjkx(int ), (int)266);
                cfr_temp_0 = 4;
            } while (!var6_2);
            break;
        }
        throw null;
    }

    private static /* synthetic */ int bjkx(int n2) {
        return bjky[n2] ^ bjkz[n2];
    }

    private static /* synthetic */ void bleg() {
        ew.bjko[100] = -6181028330564028598L;
        ew.bjko[101] = 5490094644314956391L;
        ew.bjko[102] = -4715025453659202709L;
        ew.bjko[103] = -8322750309089061888L;
        ew.bjko[104] = 8391114201995494133L;
        ew.bjko[105] = 7890260809772774887L;
        ew.bjko[106] = -593035173599704158L;
        ew.bjko[107] = -520167795322173945L;
        ew.bjko[108] = -4918599326013344890L;
        ew.bjko[109] = 2054342243065478414L;
        ew.bjko[110] = 3763608765153115411L;
        ew.bjko[111] = 2220309960933856027L;
        ew.bjko[112] = 6993944990590969254L;
        ew.bjko[113] = -8254809614330371629L;
        ew.bjko[114] = -4906754672526809745L;
        ew.bjko[115] = -7585963148455867714L;
        ew.bjko[116] = 2000519461587678159L;
        ew.bjko[117] = -9208992962789401169L;
        ew.bjko[118] = -7017041283161370299L;
        ew.bjko[119] = -714897021602081548L;
        ew.bjko[120] = 8830893101423574157L;
        ew.bjko[121] = 3049455817079613459L;
        ew.bjko[122] = -6008771141947896865L;
        ew.bjko[123] = 5132261754246858990L;
        ew.bjko[124] = -43892740186472895L;
        ew.bjko[125] = -152308173147034166L;
        ew.bjko[126] = -3591202726969197938L;
        ew.bjko[127] = 4383917399578224830L;
        ew.bjko[128] = -7277603949297069141L;
        ew.bjko[129] = 6593087532146439089L;
        ew.bjko[130] = -2282252819153076585L;
        ew.bjko[131] = 2884557608830465785L;
        ew.bjko[132] = 1375778189755691948L;
        ew.bjko[133] = 7089453311251568196L;
        ew.bjko[134] = -7491618021801975772L;
        ew.bjko[135] = 1468112984065928158L;
        ew.bjko[136] = 288082130756851554L;
        ew.bjko[137] = 1105814242052666914L;
        ew.bjko[138] = -3186592927312770814L;
        ew.bjko[139] = -7002782574730183398L;
        ew.bjko[140] = -9146068372231580998L;
        ew.bjko[141] = 5638870546943854074L;
        ew.bjko[142] = 7905898728144629934L;
        ew.bjko[143] = 1737019021663018538L;
        ew.bjko[144] = 4659921649152305090L;
        ew.bjko[145] = -5711646494965472680L;
        ew.bjko[146] = -3260706026677078131L;
        ew.bjko[147] = 3573480349054631256L;
        ew.bjko[148] = 8446462847747317874L;
        ew.bjko[149] = 1233181686311297687L;
        ew.bjko[150] = -9017824740175590088L;
        ew.bjko[151] = 4614279960247715260L;
        ew.bjko[152] = -928510593077905003L;
        ew.bjko[153] = -6875678416162518583L;
        ew.bjko[154] = -7171194044075265788L;
        ew.bjko[155] = -3094602605691512304L;
        ew.bjko[156] = 5463526820072376070L;
        ew.bjko[157] = -1920332456861979285L;
        ew.bjko[158] = -5391763112599938328L;
        ew.bjko[159] = 6965165512948543802L;
        ew.bjko[160] = 4640501855252958724L;
        ew.bjko[161] = -2559994838002305923L;
        ew.bjko[162] = -3407423911341340298L;
        ew.bjko[163] = -3715990717250504316L;
        ew.bjko[164] = -228209648059950499L;
        ew.bjko[165] = 4348255523152292012L;
        ew.bjko[166] = -636845721897973950L;
        ew.bjko[167] = 7917739495798383218L;
        ew.bjko[168] = -5576453977045929673L;
        ew.bjko[169] = -3600913031730381905L;
        ew.bjko[170] = -1885495836598953697L;
        ew.bjko[171] = -423115690294788501L;
        ew.bjko[172] = -2373987973641151829L;
        ew.bjko[173] = -9119648579433666496L;
        ew.bjko[174] = 5216202842434794453L;
        ew.bjko[175] = -2758239674664141334L;
        ew.bjko[176] = 2467048165169940826L;
        ew.bjko[177] = -3650494076143324251L;
        ew.bjko[178] = -6526635840587346249L;
        ew.bjko[179] = 8972616618571631742L;
        ew.bjko[180] = -828133131996536475L;
        ew.bjko[181] = 9064525504793290860L;
        ew.bjko[182] = 6544363393331529117L;
        ew.bjko[183] = -5502867730962261221L;
        ew.bjko[184] = -1717861846054386662L;
        ew.bjko[185] = 414402918393860957L;
        ew.bjko[186] = 6413084380311338248L;
        ew.bjko[187] = 2980709105460607945L;
        ew.bjko[188] = -2046187146848640663L;
        ew.bjko[189] = -3188969505216367681L;
        ew.bjko[190] = -6962493468787425348L;
        ew.bjko[191] = 7160309768996916590L;
        ew.bjko[192] = -7856880041399113876L;
        ew.bjko[193] = 4543763856946601355L;
        ew.bjko[194] = 4862845700917732372L;
        ew.bjko[195] = 20613397682624321L;
        ew.bjko[196] = -7427490156997899589L;
        ew.bjko[197] = -3443775073465258724L;
        ew.bjko[198] = -5435983977785335892L;
        ew.bjko[199] = 3266682506926038441L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void cleanup() {
        v0 /* !! */  = ew.dl;
        if (true) ** GOTO lbl5
        block62: while (true) {
            v0 /* !! */  = (long)(ew.bjkp("bkqh", bjkm(int ), (int)180) - ew.bjkp("bkqg", bjkm(int ), (int)179));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1994852379: {
                    continue block62;
                }
                case 125951915: {
                    break block62;
                }
            }
            break;
        }
        var3_1 = ew.c;
        v1 /* !! */  = ew.dl;
        if (true) ** GOTO lbl15
        block63: while (true) {
            v1 /* !! */  = (long)(ew.bjkp("bkql", bjkm(int ), (int)182) - ew.bjkp("bkqj", bjkm(int ), (int)181));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1276167795: {
                    continue block63;
                }
                case 125951915: {
                    break block63;
                }
            }
            break;
        }
        var2_2 /* !! */  = ew.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = ew.dl - ew.bjkp("bkqn", bjkm(int ), (int)183)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == ew.bjkp("bkqo", bjkx(int ), (int)357)) break;
            v2 /* !! */  = (long)ew.bjkp("bkqp", bjkx(int ), (int)358);
        }
        var1_3 = ew.a;
        if (var3_1) {
            throw null;
lbl29:
            // 11 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl29
        v3 /* !! */  = ew.dl;
        if (true) ** GOTO lbl36
        block66: while (true) {
            v3 /* !! */  = (long)(ew.bjkp("bkqs", bjkm(int ), (int)185) - ew.bjkp("bkqr", bjkm(int ), (int)184));
lbl36:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1869578872: {
                    continue block66;
                }
                case 125951915: {
                    break block66;
                }
            }
            break;
        }
        this.restoreMovement();
        if (var1_3) ** GOTO lbl29
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl29
                v4 /* !! */  = ew.dl;
                if (true) ** GOTO lbl51
                block67: while (true) {
                    v4 /* !! */  = (long)(v5 - ew.bjkp("bkqu", bjkm(int ), (int)186));
lbl51:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -289964083: {
                            v5 = ew.bjkp("bkqv", bjkm(int ), (int)187);
                            continue block67;
                        }
                        case 125951915: {
                            break block67;
                        }
                        case 1269882664: {
                            v5 = ew.bjkp("bkqw", bjkm(int ), (int)188);
                            continue block67;
                        }
                        case 1881613736: {
                            v5 = ew.bjkp("bkqx", bjkm(int ), (int)189);
                            continue block67;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_1 = ew.dl - ew.bjkp("bkqy", bjkm(int ), (int)190)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == ew.bjkp("bkqz", bjkx(int ), (int)359)) break;
                    v6 /* !! */  = (long)ew.bjkp("bkrb", bjkx(int ), (int)360);
                }
                this.phase = ew$ActionPhase.IDLE;
                if (var1_3 || var1_3) ** GOTO lbl29
                v7 = ew.bjkp("bkrc", bjkx(int ), (int)361);
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_2 = ew.dl - ew.bjkp("bkre", bjkm(int ), (int)191)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == ew.bjkp("bkrg", bjkx(int ), (int)362)) break;
                    v8 /* !! */  = (long)ew.bjkp("bkrh", bjkx(int ), (int)363);
                }
                this.previousSlot = (int)v7;
                if (var1_3 || var1_3) ** GOTO lbl29
                v9 = ew.bjkp("bkrj", bjkx(int ), (int)364);
                v10 /* !! */  = ew.dl;
                if (true) ** GOTO lbl83
                block70: while (true) {
                    v10 /* !! */  = (long)(v11 - ew.bjkp("bkro", bjkm(int ), (int)192));
lbl83:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -1648964366: {
                            v11 = ew.bjkp("bkrq", bjkm(int ), (int)193);
                            continue block70;
                        }
                        case 125951915: {
                            break block70;
                        }
                        case 321418537: {
                            v11 = ew.bjkp("bkrs", bjkm(int ), (int)194);
                            continue block70;
                        }
                    }
                    break;
                }
                this.targetSlot = (int)v9;
                if (var1_3 || var1_3) ** GOTO lbl29
                v12 = ew.bjkp("bkrt", bjkx(int ), (int)365);
                while (true) {
                    if ((v13 /* !! */  = (cfr_temp_3 = ew.dl - ew.bjkp("bkrv", bjkm(int ), (int)195)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v13 /* !! */  == ew.bjkp("bkrw", bjkx(int ), (int)366)) break;
                    v13 /* !! */  = (long)ew.bjkp("bkry", bjkx(int ), (int)367);
                }
                this.temporaryHotbarSlot = (int)v12;
                if (var1_3 || var1_3) ** GOTO lbl29
                v14 = ew.bjkp("bkrz", bjkx(int ), (int)368);
                while (true) {
                    if ((v15 /* !! */  = (cfr_temp_4 = ew.dl - ew.bjkp("bksa", bjkm(int ), (int)196)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v15 /* !! */  == ew.bjkp("bksc", bjkx(int ), (int)369)) break;
                    v15 /* !! */  = (long)ew.bjkp("bksd", bjkx(int ), (int)370);
                }
                this.fromHotbar = v14;
                if (var1_3 || var1_3) ** GOTO lbl29
                v16 = ew.bjkp("bksf", bjkx(int ), (int)371);
                v17 /* !! */  = ew.dl;
                if (true) ** GOTO lbl115
                block73: while (true) {
                    v17 /* !! */  = (long)(v18 - ew.bjkp("bksh", bjkm(int ), (int)197));
lbl115:
                    // 2 sources

                    switch ((int)v17 /* !! */ ) {
                        case -1784564250: {
                            v18 = ew.bjkp("bksm", bjkm(int ), (int)198);
                            continue block73;
                        }
                        case 125951915: {
                            break block73;
                        }
                        case 807419592: {
                            v18 = ew.bjkp("bksn", bjkm(int ), (int)199);
                            continue block73;
                        }
                    }
                    break;
                }
                this.stopTicks = (int)v16;
                if (var1_3 || var1_3) ** GOTO lbl29
                v19 = ew.bjkp("bkso", bjkm(int ), (int)200);
                v20 /* !! */  = ew.dl;
                if (true) ** GOTO lbl131
                block74: while (true) {
                    v20 /* !! */  = (long)(v21 - ew.bjkp("bksp", bjkm(int ), (int)201));
lbl131:
                    // 2 sources

                    switch ((int)v20 /* !! */ ) {
                        case -614044578: {
                            v21 = ew.bjkp("bksq", bjkm(int ), (int)202);
                            continue block74;
                        }
                        case 125951915: {
                            break block74;
                        }
                        case 1361693588: {
                            v21 = ew.bjkp("bksr", bjkm(int ), (int)203);
                            continue block74;
                        }
                    }
                    break;
                }
                this.restoreAt = (long)v19;
                if (var1_3 || var1_3) ** GOTO lbl29
                v22 = ew.bjkp("bksu", bjkm(int ), (int)204);
                v23 /* !! */  = ew.dl;
                if (true) ** GOTO lbl147
                block75: while (true) {
                    v23 /* !! */  = (long)(v24 - ew.bjkp("bksv", bjkm(int ), (int)205));
lbl147:
                    // 2 sources

                    switch ((int)v23 /* !! */ ) {
                        case -1823309312: {
                            v24 = ew.bjkp("bksx", bjkm(int ), (int)206);
                            continue block75;
                        }
                        case -952289453: {
                            v24 = ew.bjkp("bksy", bjkm(int ), (int)207);
                            continue block75;
                        }
                        case 125951915: {
                            break block75;
                        }
                    }
                    break;
                }
                this.actionAt = (long)v22;
                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
lbl160:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)ew.bjkp("bkta", bjkx(int ), (int)372);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl170
            }
lbl165:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)ew.bjkp("bktb", bjkx(int ), (int)373);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl211
            }
lbl170:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)ew.bjkp("bktc", bjkx(int ), (int)374);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl236
            }
            case 3: {
                var2_2 /* !! */  = (int)ew.bjkp("bkte", bjkx(int ), (int)375);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl241
            }
lbl180:
            // 2 sources

            case 4: {
                var2_2 /* !! */  = (int)ew.bjkp("bktf", bjkx(int ), (int)376);
                if (var3_1) {
                    throw null;
                }
            }
lbl184:
            // 4 sources

            case 5: {
                var2_2 /* !! */  = (int)ew.bjkp("bktg", bjkx(int ), (int)377);
                if (var3_1) {
                    throw null;
                }
            }
lbl188:
            // 4 sources

            case 6: {
                var2_2 /* !! */  = (int)ew.bjkp("bkti", bjkx(int ), (int)378);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl203
            }
            case 7: {
                var2_2 /* !! */  = (int)ew.bjkp("bktk", bjkx(int ), (int)379);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl224
            }
lbl198:
            // 2 sources

            case 8: {
                var2_2 /* !! */  = (int)ew.bjkp("bktl", bjkx(int ), (int)380);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl232
            }
lbl203:
            // 2 sources

            case 9: {
                var2_2 /* !! */  = (int)ew.bjkp("bkto", bjkx(int ), (int)381);
                if (!var3_1) ** GOTO lbl165
                throw null;
            }
lbl207:
            // 2 sources

            case 10: {
                var2_2 /* !! */  = (int)ew.bjkp("bktq", bjkx(int ), (int)382);
                if (!var3_1) ** GOTO lbl198
                throw null;
            }
lbl211:
            // 2 sources

            case 11: {
                var2_2 /* !! */  = (int)ew.bjkp("bktr", bjkx(int ), (int)383);
                if (!var3_1) ** GOTO lbl180
                throw null;
            }
            case 12: {
                var2_2 /* !! */  = (int)ew.bjkp("bktz", bjkx(int ), (int)384);
                if (!var3_1) ** GOTO lbl207
                throw null;
            }
            case 13: {
                var2_2 /* !! */  = (int)ew.bjkp("bkub", bjkx(int ), (int)385);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl236
            }
lbl224:
            // 3 sources

            case 14: {
                var2_2 /* !! */  = (int)ew.bjkp("bkud", bjkx(int ), (int)386);
                if (!var3_1) ** GOTO lbl188
                throw null;
            }
lbl228:
            // 4 sources

            case 15: {
                var2_2 /* !! */  = (int)ew.bjkp("bkue", bjkx(int ), (int)387);
                if (!var3_1) ** GOTO lbl160
                throw null;
            }
lbl232:
            // 2 sources

            case 16: {
                var2_2 /* !! */  = (int)ew.bjkp("bkuf", bjkx(int ), (int)388);
                if (!var3_1) ** GOTO lbl224
                throw null;
            }
lbl236:
            // 3 sources

            case 17: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ew.bjkp("bkuj", bjkx(int ), (int)389);
                    if (!var3_1) ** GOTO lbl228
                    throw null;
                }
            }
lbl241:
            // 2 sources

            case 18: {
                var2_2 /* !! */  = (int)ew.bjkp("bkuk", bjkx(int ), (int)390);
                if (!var3_1) ** GOTO lbl228
                throw null;
            }
            case 19: {
                var2_2 /* !! */  = (int)ew.bjkp("bkul", bjkx(int ), (int)391);
                if (!var3_1) ** GOTO lbl184
                throw null;
            }
            case 20: {
                var2_2 /* !! */  = (int)ew.bjkp("bkum", bjkx(int ), (int)392);
                if (!var3_1) ** GOTO lbl228
                throw null;
            }
            case 21: 
        }
        var2_2 /* !! */  = (int)ew.bjkp("bkun", bjkx(int ), (int)393);
        ** while (!var3_1)
lbl256:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void blck() {
        ew.bjkn[0] = 207080965040678935L;
        ew.bjkn[1] = -4580662021209821401L;
        ew.bjkn[2] = -2430274939479577956L;
        ew.bjkn[3] = 7964481709663489959L;
        ew.bjkn[4] = 1006283182186704644L;
        ew.bjkn[5] = 5398188536114153234L;
        ew.bjkn[6] = -5745399149512926850L;
        ew.bjkn[7] = 1089153644998431991L;
        ew.bjkn[8] = 7892057506004921902L;
        ew.bjkn[9] = -6528018350912974479L;
        ew.bjkn[10] = 2823525627763096543L;
        ew.bjkn[11] = 4077268589058302401L;
        ew.bjkn[12] = -5544309796860926286L;
        ew.bjkn[13] = -110378003052814838L;
        ew.bjkn[14] = 6104050346482278857L;
        ew.bjkn[15] = -7569904202131598775L;
        ew.bjkn[16] = -1410689060937305974L;
        ew.bjkn[17] = -7590806646537878120L;
        ew.bjkn[18] = 1133233796630473845L;
        ew.bjkn[19] = 8322877830699666027L;
        ew.bjkn[20] = -5591292624364617374L;
        ew.bjkn[21] = 8713284032579334468L;
        ew.bjkn[22] = 7790456077030706780L;
        ew.bjkn[23] = 6037368421368109821L;
        ew.bjkn[24] = -8128758703690770756L;
        ew.bjkn[25] = 3277416662991236014L;
        ew.bjkn[26] = -149567208189525776L;
        ew.bjkn[27] = -5224450123673040681L;
        ew.bjkn[28] = -4227695916020573843L;
        ew.bjkn[29] = -2385602647677284855L;
        ew.bjkn[30] = 2726175764440332431L;
        ew.bjkn[31] = -1810497046635610823L;
        ew.bjkn[32] = -6671862873204763827L;
        ew.bjkn[33] = -4308330492465350137L;
        ew.bjkn[34] = 5354568871450552298L;
        ew.bjkn[35] = -7281862481656224307L;
        ew.bjkn[36] = -4780422470448328091L;
        ew.bjkn[37] = 5791674186688911360L;
        ew.bjkn[38] = 2746978244692408945L;
        ew.bjkn[39] = 7590639097395423202L;
        ew.bjkn[40] = -3594916842276014498L;
        ew.bjkn[41] = 8937973156019123885L;
        ew.bjkn[42] = -7691055662855399993L;
        ew.bjkn[43] = -5483225103675885466L;
        ew.bjkn[44] = 7678205773462740215L;
        ew.bjkn[45] = 8019488357239172424L;
        ew.bjkn[46] = 1181520034393765185L;
        ew.bjkn[47] = 7867527310757987677L;
        ew.bjkn[48] = -3714608150187132350L;
        ew.bjkn[49] = 7897578885297707350L;
        ew.bjkn[50] = 2992693394128962700L;
        ew.bjkn[51] = -7738625531824875853L;
        ew.bjkn[52] = -2020363152098372939L;
        ew.bjkn[53] = -1631509959594723575L;
        ew.bjkn[54] = -8708217145893264648L;
        ew.bjkn[55] = -1206720136695583049L;
        ew.bjkn[56] = -3827956702571674813L;
        ew.bjkn[57] = 2707435004330524396L;
        ew.bjkn[58] = 7914378660954791857L;
        ew.bjkn[59] = -178398838737299622L;
        ew.bjkn[60] = -8125964680304909625L;
        ew.bjkn[61] = -8644672311732906526L;
        ew.bjkn[62] = 7006693019442641069L;
        ew.bjkn[63] = -1518773664575941708L;
        ew.bjkn[64] = 2539146673682865911L;
        ew.bjkn[65] = 2709492325286056294L;
        ew.bjkn[66] = 74092097337677735L;
        ew.bjkn[67] = -1108608508906621113L;
        ew.bjkn[68] = -4597099034168293707L;
        ew.bjkn[69] = 3535747620435552608L;
        ew.bjkn[70] = 4924044502117056708L;
        ew.bjkn[71] = 3029371382349531611L;
        ew.bjkn[72] = -4156305565968278535L;
        ew.bjkn[73] = 5744881494218616204L;
        ew.bjkn[74] = 6491406355419587463L;
        ew.bjkn[75] = -6991477858407004406L;
        ew.bjkn[76] = -6056747305030197353L;
        ew.bjkn[77] = -7627761732619399658L;
        ew.bjkn[78] = -6437093821872936796L;
        ew.bjkn[79] = 426370883099073047L;
        ew.bjkn[80] = -2343957859188512751L;
        ew.bjkn[81] = -5958353979811114555L;
        ew.bjkn[82] = -5261741987673804453L;
        ew.bjkn[83] = 7821513990737495801L;
        ew.bjkn[84] = -6027497706059176111L;
        ew.bjkn[85] = -747729374435058220L;
        ew.bjkn[86] = 1033950102991519792L;
        ew.bjkn[87] = 5497314280847992878L;
        ew.bjkn[88] = 7365567457545727294L;
        ew.bjkn[89] = -323282945190840543L;
        ew.bjkn[90] = -2060062177761370172L;
        ew.bjkn[91] = 6982364331240491498L;
        ew.bjkn[92] = 6253182183889365787L;
        ew.bjkn[93] = 2808767714405533240L;
        ew.bjkn[94] = 6873066848776405316L;
        ew.bjkn[95] = -7309136527622037216L;
        ew.bjkn[96] = 6276467553984048482L;
        ew.bjkn[97] = -2502153742379374103L;
        ew.bjkn[98] = 5829736718517688262L;
        ew.bjkn[99] = 3998488612650058939L;
    }

    private static /* synthetic */ void blcf() {
        ew.bjkz[400] = -1683203529;
        ew.bjkz[401] = 283072005;
        ew.bjkz[402] = -260068406;
        ew.bjkz[403] = 1910808650;
        ew.bjkz[404] = 1141303065;
        ew.bjkz[405] = -1454706521;
        ew.bjkz[406] = 634339635;
        ew.bjkz[407] = -810842078;
        ew.bjkz[408] = -1964869292;
        ew.bjkz[409] = -235099208;
        ew.bjkz[410] = 575407276;
        ew.bjkz[411] = 183795742;
        ew.bjkz[412] = -674887137;
        ew.bjkz[413] = -1545434511;
        ew.bjkz[414] = 1145966719;
        ew.bjkz[415] = -590840283;
        ew.bjkz[416] = -1835351028;
        ew.bjkz[417] = 1338896724;
        ew.bjkz[418] = -206767808;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void deactivate() {
        block73: {
            v0 /* !! */  = ew.dl;
            if (true) ** GOTO lbl5
            block49: while (true) {
                v0 /* !! */  = (long)(v1 - ew.bjkp("bkus", bjkm(int ), (int)208));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -705745238: {
                        v1 = ew.bjkp("bkuu", bjkm(int ), (int)209);
                        continue block49;
                    }
                    case 125951915: {
                        break block49;
                    }
                    case 473246042: {
                        v1 = ew.bjkp("bkuv", bjkm(int ), (int)210);
                        continue block49;
                    }
                    case 800310553: {
                        v1 = ew.bjkp("bkuw", bjkm(int ), (int)211);
                        continue block49;
                    }
                }
                break;
            }
            var3_1 = ew.c;
            while (true) {
                if ((v2 /* !! */  = (cfr_temp_0 = ew.dl - ew.bjkp("bkux", bjkm(int ), (int)212)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v2 /* !! */  == ew.bjkp("bkuy", bjkx(int ), (int)394)) break;
                v2 /* !! */  = (long)ew.bjkp("bkva", bjkx(int ), (int)395);
            }
            var2_2 /* !! */  = ew.b;
            v3 /* !! */  = ew.dl;
            if (true) ** GOTO lbl28
            block51: while (true) {
                v3 /* !! */  = (long)(v4 - ew.bjkp("bkvb", bjkm(int ), (int)213));
lbl28:
                // 2 sources

                switch ((int)v3 /* !! */ ) {
                    case -522508172: {
                        v4 = ew.bjkp("bkvd", bjkm(int ), (int)214);
                        continue block51;
                    }
                    case -169158787: {
                        v4 = ew.bjkp("bkve", bjkm(int ), (int)215);
                        continue block51;
                    }
                    case 59414208: {
                        v4 = ew.bjkp("bkvg", bjkm(int ), (int)216);
                        continue block51;
                    }
                    case 125951915: {
                        break block51;
                    }
                }
                break;
            }
            var1_3 = ew.a;
            if (var3_1) {
                throw null;
lbl43:
                // 8 sources

                return;
            }
            if (var1_3 || var1_3) ** GOTO lbl43
            while (true) {
                if ((v5 /* !! */  = (cfr_temp_1 = ew.dl - ew.bjkp("bkvi", bjkm(int ), (int)217)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v5 /* !! */  == ew.bjkp("bkvk", bjkx(int ), (int)396)) break;
                v5 /* !! */  = (long)ew.bjkp("bkvn", bjkx(int ), (int)397);
            }
            v6 /* !! */  = ew.dl;
            if (true) ** GOTO lbl55
            block54: while (true) {
                v6 /* !! */  = (long)(v7 - ew.bjkp("bkvo", bjkm(int ), (int)218));
lbl55:
                // 2 sources

                switch ((int)v6 /* !! */ ) {
                    case 125951915: {
                        break block54;
                    }
                    case 163536152: {
                        v7 = ew.bjkp("bkvp", bjkm(int ), (int)219);
                        continue block54;
                    }
                    case 1996262577: {
                        v7 = ew.bjkp("bkvq", bjkm(int ), (int)220);
                        continue block54;
                    }
                }
                break;
            }
            if (this.phase == ew$ActionPhase.WAIT_RESTORE) break block73;
            if (var1_3) ** GOTO lbl43
            v8 /* !! */  = ew.dl;
            if (true) ** GOTO lbl70
            block55: while (true) {
                v8 /* !! */  = (long)(v9 - ew.bjkp("bkvr", bjkm(int ), (int)221));
lbl70:
                // 2 sources

                switch ((int)v8 /* !! */ ) {
                    case -1865944187: {
                        v9 = ew.bjkp("bkvt", bjkm(int ), (int)222);
                        continue block55;
                    }
                    case -527464677: {
                        v9 = ew.bjkp("bkvv", bjkm(int ), (int)223);
                        continue block55;
                    }
                    case 125951915: {
                        break block55;
                    }
                    case 914529102: {
                        v9 = ew.bjkp("bkvz", bjkm(int ), (int)224);
                        continue block55;
                    }
                }
                break;
            }
            v10 /* !! */  = ew.dl;
            if (true) ** GOTO lbl86
            block56: while (true) {
                v10 /* !! */  = (long)(v11 - ew.bjkp("bkwa", bjkm(int ), (int)225));
lbl86:
                // 2 sources

                switch ((int)v10 /* !! */ ) {
                    case 125951915: {
                        break block56;
                    }
                    case 1575575331: {
                        v11 = ew.bjkp("bkwb", bjkm(int ), (int)226);
                        continue block56;
                    }
                    case 1695893294: {
                        v11 = ew.bjkp("bkwc", bjkm(int ), (int)227);
                        continue block56;
                    }
                }
                break;
            }
            if (this.phase != ew$ActionPhase.WAIT_RESTORE_STOP) ** GOTO lbl125
            if (var1_3) ** GOTO lbl43
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block28 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** GOTO lbl43
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_2 = ew.dl - ew.bjkp("bkwf", bjkm(int ), (int)228)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == ew.bjkp("bkwh", bjkx(int ), (int)398)) break;
                    v12 /* !! */  = (long)ew.bjkp("bkwl", bjkx(int ), (int)399);
                }
                while (true) {
                    if ((v13 /* !! */  = (cfr_temp_3 = ew.dl - ew.bjkp("bkwm", bjkm(int ), (int)229)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v13 /* !! */  == ew.bjkp("bkwn", bjkx(int ), (int)400)) break;
                    v13 /* !! */  = (long)ew.bjkp("bkwp", bjkx(int ), (int)401);
                }
                if (ew.mc.field_1724 == null) ** GOTO lbl125
                if (var1_3 || var1_3) ** GOTO lbl43
                v14 /* !! */  = ew.dl;
                if (true) ** GOTO lbl118
                block59: while (true) {
                    v14 /* !! */  = (long)(ew.bjkp("bkwu", bjkm(int ), (int)231) - ew.bjkp("bkwr", bjkm(int ), (int)230));
lbl118:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case -2079001294: {
                            continue block59;
                        }
                        case 125951915: {
                            break block59;
                        }
                    }
                    break;
                }
                this.restoreItem();
                if (var1_3) ** GOTO lbl43
lbl125:
                // 3 sources

                if (var1_3 || var1_3) ** GOTO lbl43
                while (true) {
                    if ((v15 /* !! */  = (cfr_temp_4 = ew.dl - ew.bjkp("bkwx", bjkm(int ), (int)232)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v15 /* !! */  == ew.bjkp("bkwz", bjkx(int ), (int)402)) break;
                    v15 /* !! */  = (long)ew.bjkp("bkxa", bjkx(int ), (int)403);
                }
                this.cleanup();
                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
            case 0: {
                var2_2 /* !! */  = (int)ew.bjkp("bkxb", bjkx(int ), (int)404);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl159
            }
            case 1: {
                var2_2 /* !! */  = (int)ew.bjkp("bkxc", bjkx(int ), (int)405);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl182
            }
lbl145:
            // 3 sources

            case 2: {
                var2_2 /* !! */  = (int)ew.bjkp("bkxd", bjkx(int ), (int)406);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl190
            }
lbl150:
            // 2 sources

            case 3: {
                var2_2 /* !! */  = (int)ew.bjkp("bkxe", bjkx(int ), (int)407);
                if (!var3_1) break;
                throw null;
            }
            case 4: {
                var2_2 /* !! */  = (int)ew.bjkp("bkxg", bjkx(int ), (int)408);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl168
            }
lbl159:
            // 2 sources

            case 5: {
                var2_2 /* !! */  = (int)ew.bjkp("bkxj", bjkx(int ), (int)409);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl186
            }
            case 6: {
                var2_2 /* !! */  = (int)ew.bjkp("bkxl", bjkx(int ), (int)410);
                if (!var3_1) ** GOTO lbl145
                throw null;
            }
lbl168:
            // 3 sources

            case 7: {
                var2_2 /* !! */  = (int)ew.bjkp("bkxm", bjkx(int ), (int)411);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl190
            }
            case 8: {
                var2_2 /* !! */  = (int)ew.bjkp("bkxn", bjkx(int ), (int)412);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl194
            }
            case 9: {
                var2_2 /* !! */  = (int)ew.bjkp("bkxq", bjkx(int ), (int)413);
                if (!var3_1) ** GOTO lbl150
                throw null;
            }
lbl182:
            // 2 sources

            case 10: {
                var2_2 /* !! */  = (int)ew.bjkp("bkxs", bjkx(int ), (int)414);
                if (!var3_1) ** GOTO lbl168
                throw null;
            }
lbl186:
            // 2 sources

            case 11: {
                var2_2 /* !! */  = (int)ew.bjkp("bkxt", bjkx(int ), (int)415);
                if (!var3_1) break;
                throw null;
            }
lbl190:
            // 3 sources

            case 12: {
                var2_2 /* !! */  = (int)ew.bjkp("bkxx", bjkx(int ), (int)416);
                if (!var3_1) ** GOTO lbl145
                throw null;
            }
lbl194:
            // 2 sources

            case 13: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ew.bjkp("bkxy", bjkx(int ), (int)417);
                    if (!var3_1) break block28;
                    throw null;
                }
            }
            case 14: 
        }
        var2_2 /* !! */  = (int)ew.bjkp("bkya", bjkx(int ), (int)418);
        ** while (!var3_1)
lbl202:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void tryHalfTickUse() {
        v0 /* !! */  = ew.dl;
        if (true) ** GOTO lbl5
        block32: while (true) {
            v0 /* !! */  = (long)(ew.bjkp("bjto", bjkm(int ), (int)17) - ew.bjkp("bjtn", bjkm(int ), (int)16));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -703376616: {
                    continue block32;
                }
                case 125951915: {
                    break block32;
                }
            }
            break;
        }
        var3_1 = ew.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = ew.dl - ew.bjkp("bjtp", bjkm(int ), (int)18)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == ew.bjkp("bjtq", bjkx(int ), (int)154)) break;
            v1 /* !! */  = (long)ew.bjkp("bjtr", bjkx(int ), (int)155);
        }
        var2_2 /* !! */  = ew.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = ew.dl - ew.bjkp("bjts", bjkm(int ), (int)19)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == ew.bjkp("bjtt", bjkx(int ), (int)156)) break;
            v2 /* !! */  = (long)ew.bjkp("bjtu", bjkx(int ), (int)157);
        }
        var1_3 = ew.a;
        if (var3_1) {
            throw null;
lbl27:
            // 7 sources

            return;
        }
        if (var1_3) ** GOTO lbl27
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl27
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = ew.dl - ew.bjkp("bjtv", bjkm(int ), (int)20)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == ew.bjkp("bjtw", bjkx(int ), (int)158)) break;
                    v3 /* !! */  = (long)ew.bjkp("bjtx", bjkx(int ), (int)159);
                }
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_3 = ew.dl - ew.bjkp("bjty", bjkm(int ), (int)21)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == ew.bjkp("bjtz", bjkx(int ), (int)160)) break;
                    v4 /* !! */  = (long)ew.bjkp("bjua", bjkx(int ), (int)161);
                }
                if (this.phase != ew$ActionPhase.WAIT_USE_HALF) ** GOTO lbl102
                if (var1_3) ** GOTO lbl27
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_4 = ew.dl - ew.bjkp("bjub", bjkm(int ), (int)22)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == ew.bjkp("bjuc", bjkx(int ), (int)162)) break;
                    v5 /* !! */  = (long)ew.bjkp("bjud", bjkx(int ), (int)163);
                }
                v6 /* !! */  = ew.dl;
                if (true) ** GOTO lbl58
                block39: while (true) {
                    v6 /* !! */  = (long)(ew.bjkp("bjuf", bjkm(int ), (int)24) - ew.bjkp("bjue", bjkm(int ), (int)23));
lbl58:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case 125951915: {
                            break block39;
                        }
                        case 1264605814: {
                            continue block39;
                        }
                    }
                    break;
                }
                if (ew.mc.field_1724 == null) ** GOTO lbl102
                if (var1_3 || var1_3) ** GOTO lbl27
                v7 /* !! */  = ew.dl;
                if (true) ** GOTO lbl69
                block40: while (true) {
                    v7 /* !! */  = (long)(v8 - ew.bjkp("bjug", bjkm(int ), (int)25));
lbl69:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -1871633126: {
                            v8 = ew.bjkp("bjuh", bjkm(int ), (int)26);
                            continue block40;
                        }
                        case -535848460: {
                            v8 = ew.bjkp("bjui", bjkm(int ), (int)27);
                            continue block40;
                        }
                        case 125951915: {
                            break block40;
                        }
                    }
                    break;
                }
                v9 = System.currentTimeMillis();
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_5 = ew.dl - ew.bjkp("bjuj", bjkm(int ), (int)28)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v10 /* !! */  == ew.bjkp("bjuk", bjkx(int ), (int)164)) break;
                    v10 /* !! */  = (long)ew.bjkp("bjul", bjkx(int ), (int)165);
                }
                if (v9 < this.actionAt) ** GOTO lbl102
                if (var1_3 || var1_3) ** GOTO lbl27
                v11 /* !! */  = ew.dl;
                if (true) ** GOTO lbl91
                block42: while (true) {
                    v11 /* !! */  = (long)(v12 - ew.bjkp("bjum", bjkm(int ), (int)29));
lbl91:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -1267975601: {
                            v12 = ew.bjkp("bjun", bjkm(int ), (int)30);
                            continue block42;
                        }
                        case 125951915: {
                            break block42;
                        }
                        case 2084407690: {
                            v12 = ew.bjkp("bjuo", bjkm(int ), (int)31);
                            continue block42;
                        }
                    }
                    break;
                }
                this.usePreparedItem();
                if (var1_3) ** GOTO lbl27
lbl102:
                // 4 sources

                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
lbl105:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)ew.bjkp("bjup", bjkx(int ), (int)166);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl115
            }
            case 1: {
                var2_2 /* !! */  = (int)ew.bjkp("bjuq", bjkx(int ), (int)167);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl143
            }
lbl115:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)ew.bjkp("bjur", bjkx(int ), (int)168);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl147
            }
lbl120:
            // 2 sources

            case 3: {
                var2_2 /* !! */  = (int)ew.bjkp("bjus", bjkx(int ), (int)169);
                if (!var3_1) ** GOTO lbl105
                throw null;
            }
lbl124:
            // 2 sources

            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ew.bjkp("bjut", bjkx(int ), (int)170);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl138
                    break;
                }
            }
lbl130:
            // 2 sources

            case 5: {
                var2_2 /* !! */  = (int)ew.bjkp("bjuu", bjkx(int ), (int)171);
                if (!var3_1) ** GOTO lbl120
                throw null;
            }
lbl134:
            // 2 sources

            case 6: {
                var2_2 /* !! */  = (int)ew.bjkp("bjuv", bjkx(int ), (int)172);
                if (!var3_1) break;
                throw null;
            }
lbl138:
            // 2 sources

            case 7: {
                var2_2 /* !! */  = (int)ew.bjkp("bjuw", bjkx(int ), (int)173);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl147
            }
lbl143:
            // 2 sources

            case 8: {
                var2_2 /* !! */  = (int)ew.bjkp("bjux", bjkx(int ), (int)174);
                if (!var3_1) ** GOTO lbl130
                throw null;
            }
lbl147:
            // 3 sources

            case 9: {
                var2_2 /* !! */  = (int)ew.bjkp("bjuy", bjkx(int ), (int)175);
                if (!var3_1) ** GOTO lbl124
                throw null;
            }
            case 10: {
                var2_2 /* !! */  = (int)ew.bjkp("bjuz", bjkx(int ), (int)176);
                if (!var3_1) ** GOTO lbl134
                throw null;
            }
            case 11: 
        }
        var2_2 /* !! */  = (int)ew.bjkp("bjva", bjkx(int ), (int)177);
        ** while (!var3_1)
lbl158:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onWorldRender(dj var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ew.dl - ew.bjkp("bjsv", bjkm(int ), (int)10)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ew.bjkp("bjsw", bjkx(int ), (int)142)) break;
            v0 /* !! */  = (long)ew.bjkp("bjsx", bjkx(int ), (int)143);
        }
        var4_2 = ew.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ew.dl - ew.bjkp("bjsy", bjkm(int ), (int)11)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == ew.bjkp("bjsz", bjkx(int ), (int)144)) break;
            v1 /* !! */  = (long)ew.bjkp("bjta", bjkx(int ), (int)145);
        }
        var3_3 /* !! */  = ew.b;
        v2 /* !! */  = ew.dl;
        if (true) ** GOTO lbl17
        block15: while (true) {
            v2 /* !! */  = (long)(v3 - ew.bjkp("bjtb", bjkm(int ), (int)12));
lbl17:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1222105698: {
                    v3 = ew.bjkp("bjtc", bjkm(int ), (int)13);
                    continue block15;
                }
                case -88244383: {
                    v3 = ew.bjkp("bjtd", bjkm(int ), (int)14);
                    continue block15;
                }
                case 125951915: {
                    break block15;
                }
            }
            break;
        }
        var2_4 = ew.a;
        if (var4_2) {
            throw null;
lbl29:
            // 2 sources

            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl29
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_2 = ew.dl - ew.bjkp("bjte", bjkm(int ), (int)15)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == ew.bjkp("bjtf", bjkx(int ), (int)146)) break;
            v4 /* !! */  = (long)ew.bjkp("bjtg", bjkx(int ), (int)147);
        }
        this.tryHalfTickUse();
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4 || var2_4) ** continue;
                return;
            }
lbl43:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)ew.bjkp("bjth", bjkx(int ), (int)148);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl54
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)ew.bjkp("bjti", bjkx(int ), (int)149);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl59
                    break;
                }
            }
lbl54:
            // 2 sources

            case 2: {
                var3_3 /* !! */  = (int)ew.bjkp("bjtj", bjkx(int ), (int)150);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl64
            }
lbl59:
            // 2 sources

            case 3: {
                do {
                    var3_3 /* !! */  = (int)ew.bjkp("bjtk", bjkx(int ), (int)151);
                } while (!var4_2);
                throw null;
            }
lbl64:
            // 2 sources

            case 4: {
                var3_3 /* !! */  = (int)ew.bjkp("bjtl", bjkx(int ), (int)152);
                if (!var4_2) ** GOTO lbl43
                throw null;
            }
            case 5: 
        }
        var3_3 /* !! */  = (int)ew.bjkp("bjtm", bjkx(int ), (int)153);
        ** while (!var4_2)
lbl71:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void bkyz() {
        ew.bjky[100] = -2005038077;
        ew.bjky[101] = 588330558;
        ew.bjky[102] = 1908219515;
        ew.bjky[103] = -1123653725;
        ew.bjky[104] = 187035400;
        ew.bjky[105] = -411616389;
        ew.bjky[106] = 89134300;
        ew.bjky[107] = -1435565311;
        ew.bjky[108] = 1852579834;
        ew.bjky[109] = 1473236029;
        ew.bjky[110] = -416841342;
        ew.bjky[111] = -1803480673;
        ew.bjky[112] = 301605807;
        ew.bjky[113] = -264900077;
        ew.bjky[114] = -1404462860;
        ew.bjky[115] = 1001864964;
        ew.bjky[116] = 470464472;
        ew.bjky[117] = -1068735085;
        ew.bjky[118] = -62621605;
        ew.bjky[119] = 1855373527;
        ew.bjky[120] = -764648475;
        ew.bjky[121] = -1614348201;
        ew.bjky[122] = -643816253;
        ew.bjky[123] = 1175983398;
        ew.bjky[124] = 2024509417;
        ew.bjky[125] = 2051599990;
        ew.bjky[126] = 92679892;
        ew.bjky[127] = -617908815;
        ew.bjky[128] = 667334042;
        ew.bjky[129] = -1262543145;
        ew.bjky[130] = -1710607600;
        ew.bjky[131] = 1656104280;
        ew.bjky[132] = -1905460220;
        ew.bjky[133] = 718452707;
        ew.bjky[134] = 1702734417;
        ew.bjky[135] = 865336917;
        ew.bjky[136] = 133748627;
        ew.bjky[137] = -1433955070;
        ew.bjky[138] = -1460880570;
        ew.bjky[139] = 1559945093;
        ew.bjky[140] = 828210562;
        ew.bjky[141] = 1389825874;
        ew.bjky[142] = 1599553564;
        ew.bjky[143] = 647260273;
        ew.bjky[144] = 1248056772;
        ew.bjky[145] = 676107349;
        ew.bjky[146] = -880685077;
        ew.bjky[147] = 2102852136;
        ew.bjky[148] = -1118866048;
        ew.bjky[149] = -1217118484;
        ew.bjky[150] = -1072960736;
        ew.bjky[151] = -1019522649;
        ew.bjky[152] = -1215571619;
        ew.bjky[153] = 1236407044;
        ew.bjky[154] = 1543116911;
        ew.bjky[155] = 350981370;
        ew.bjky[156] = -1271384345;
        ew.bjky[157] = -1114274867;
        ew.bjky[158] = 1638348186;
        ew.bjky[159] = 1427495050;
        ew.bjky[160] = 37910346;
        ew.bjky[161] = -1971852445;
        ew.bjky[162] = -249384845;
        ew.bjky[163] = 513179753;
        ew.bjky[164] = -1981397061;
        ew.bjky[165] = 1737107725;
        ew.bjky[166] = -239737165;
        ew.bjky[167] = -646616473;
        ew.bjky[168] = -1588170656;
        ew.bjky[169] = -179381784;
        ew.bjky[170] = 550600814;
        ew.bjky[171] = 1127714732;
        ew.bjky[172] = -2041176069;
        ew.bjky[173] = -1412798576;
        ew.bjky[174] = 203311416;
        ew.bjky[175] = -521217795;
        ew.bjky[176] = 771060774;
        ew.bjky[177] = 806231030;
        ew.bjky[178] = -1074504330;
        ew.bjky[179] = 2072420308;
        ew.bjky[180] = -1955127687;
        ew.bjky[181] = 91717242;
        ew.bjky[182] = 1941659861;
        ew.bjky[183] = -519567487;
        ew.bjky[184] = -637407431;
        ew.bjky[185] = 876457815;
        ew.bjky[186] = 2094194452;
        ew.bjky[187] = -1895608223;
        ew.bjky[188] = -1722723603;
        ew.bjky[189] = 868015078;
        ew.bjky[190] = -1850690288;
        ew.bjky[191] = -1613257398;
        ew.bjky[192] = 1317311593;
        ew.bjky[193] = 1860140495;
        ew.bjky[194] = 1639235724;
        ew.bjky[195] = -794957664;
        ew.bjky[196] = -1093943752;
        ew.bjky[197] = -177909685;
        ew.bjky[198] = -1297768689;
        ew.bjky[199] = 1705989743;
    }

    private static /* synthetic */ void bldr() {
        ew.bjko[0] = -7102802252513567744L;
        ew.bjko[1] = 7393675930538901110L;
        ew.bjko[2] = -9167448470322231260L;
        ew.bjko[3] = 7804858954341966705L;
        ew.bjko[4] = 9143895222741071801L;
        ew.bjko[5] = 1012739257943733399L;
        ew.bjko[6] = -7024164859657841836L;
        ew.bjko[7] = -8250761997567162025L;
        ew.bjko[8] = -8116863241861770297L;
        ew.bjko[9] = -6528018350912974500L;
        ew.bjko[10] = -898181089618304663L;
        ew.bjko[11] = 8620615326821283174L;
        ew.bjko[12] = 7142276454171005826L;
        ew.bjko[13] = 5533633343528939388L;
        ew.bjko[14] = 3485123180701112752L;
        ew.bjko[15] = -2760879358067052720L;
        ew.bjko[16] = 5103992315243096476L;
        ew.bjko[17] = -6426896072205400555L;
        ew.bjko[18] = 3884998200630580493L;
        ew.bjko[19] = 6564535954285560145L;
        ew.bjko[20] = 3652186025192423128L;
        ew.bjko[21] = -5318688430239420267L;
        ew.bjko[22] = -5442887310007644776L;
        ew.bjko[23] = -7487006871262226181L;
        ew.bjko[24] = -1008736499342169739L;
        ew.bjko[25] = 5178115352863470594L;
        ew.bjko[26] = -7574825448672321602L;
        ew.bjko[27] = 7871156952703446653L;
        ew.bjko[28] = 2230600247874528011L;
        ew.bjko[29] = 7088155146366120513L;
        ew.bjko[30] = 8509030497211293687L;
        ew.bjko[31] = -2420897460213883416L;
        ew.bjko[32] = 8617137563256511412L;
        ew.bjko[33] = -5868217374666494597L;
        ew.bjko[34] = -3054643562982459740L;
        ew.bjko[35] = 7448188198347310271L;
        ew.bjko[36] = 3026968587977590482L;
        ew.bjko[37] = 7092037875956320395L;
        ew.bjko[38] = 5464894397721202659L;
        ew.bjko[39] = 3585849034703334157L;
        ew.bjko[40] = 3253785837327355750L;
        ew.bjko[41] = 4670093559450864707L;
        ew.bjko[42] = 8448626692843708984L;
        ew.bjko[43] = -189600380882417699L;
        ew.bjko[44] = 432764963000320586L;
        ew.bjko[45] = -7897466728289251721L;
        ew.bjko[46] = -3712605132344164130L;
        ew.bjko[47] = 2879524216271749912L;
        ew.bjko[48] = 6589154581579989834L;
        ew.bjko[49] = 547182488396025750L;
        ew.bjko[50] = -951316210728477895L;
        ew.bjko[51] = 4556449783131600828L;
        ew.bjko[52] = 6449490406581831583L;
        ew.bjko[53] = -5271090919780055240L;
        ew.bjko[54] = -2606209801114822690L;
        ew.bjko[55] = -1934733873439298371L;
        ew.bjko[56] = -993355429591964177L;
        ew.bjko[57] = -1313226052744647102L;
        ew.bjko[58] = -1403750198159766967L;
        ew.bjko[59] = -899471258232845397L;
        ew.bjko[60] = -2651519284889282100L;
        ew.bjko[61] = -4592600121124577824L;
        ew.bjko[62] = -8353623426158993751L;
        ew.bjko[63] = 7482976336040078046L;
        ew.bjko[64] = 6064045470405791110L;
        ew.bjko[65] = 372617931153586350L;
        ew.bjko[66] = -8585315377011841762L;
        ew.bjko[67] = -6969693831256137296L;
        ew.bjko[68] = 5037651339535283630L;
        ew.bjko[69] = 2666468248389102559L;
        ew.bjko[70] = 7360299321311164470L;
        ew.bjko[71] = -4026844206094057420L;
        ew.bjko[72] = 7666721565945471L;
        ew.bjko[73] = -2914968132792241080L;
        ew.bjko[74] = -5216925144615846049L;
        ew.bjko[75] = 9217829208806869564L;
        ew.bjko[76] = -4174909184880045252L;
        ew.bjko[77] = -7296694448620352804L;
        ew.bjko[78] = -3159660340921240370L;
        ew.bjko[79] = 8598774444375531010L;
        ew.bjko[80] = 1720625708120013352L;
        ew.bjko[81] = 8090991962687046968L;
        ew.bjko[82] = 4843854401551195297L;
        ew.bjko[83] = 997278830617760013L;
        ew.bjko[84] = -3772953147654142440L;
        ew.bjko[85] = -4325863895787570151L;
        ew.bjko[86] = -5589609143446920551L;
        ew.bjko[87] = 7922949566525496687L;
        ew.bjko[88] = -5210477083477644932L;
        ew.bjko[89] = 1440310860061510155L;
        ew.bjko[90] = 2350763440943278362L;
        ew.bjko[91] = 4522474725943376599L;
        ew.bjko[92] = -1898404067889265386L;
        ew.bjko[93] = 3178834876362495487L;
        ew.bjko[94] = 826753218635053762L;
        ew.bjko[95] = 7825025460227210004L;
        ew.bjko[96] = 1050039446097490785L;
        ew.bjko[97] = 1721028053692465882L;
        ew.bjko[98] = 4424509538663404059L;
        ew.bjko[99] = 5308228034492462364L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void restoreItem() {
        block60: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = ew.dl - ew.bjkp("bkmw", bjkm(int ), (int)152)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v0 /* !! */  == ew.bjkp("bkmx", bjkx(int ), (int)317)) break;
                v0 /* !! */  = (long)ew.bjkp("bkmy", bjkx(int ), (int)318);
            }
            var3_1 = ew.c;
            while (true) {
                if ((v1 /* !! */  = (cfr_temp_1 = ew.dl - ew.bjkp("bkna", bjkm(int ), (int)153)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v1 /* !! */  == ew.bjkp("bknb", bjkx(int ), (int)319)) break;
                v1 /* !! */  = (long)ew.bjkp("bknc", bjkx(int ), (int)320);
            }
            var2_2 /* !! */  = ew.b;
            while (true) {
                if ((v2 /* !! */  = (cfr_temp_2 = ew.dl - ew.bjkp("bkne", bjkm(int ), (int)154)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v2 /* !! */  == ew.bjkp("bknf", bjkx(int ), (int)321)) break;
                v2 /* !! */  = (long)ew.bjkp("bkng", bjkx(int ), (int)322);
            }
            var1_3 = ew.a;
            if (var3_1) {
                throw null;
lbl24:
                // 6 sources

                return;
            }
            if (var1_3 || var1_3) ** GOTO lbl24
            v3 /* !! */  = ew.dl;
            if (true) ** GOTO lbl31
            block38: while (true) {
                v3 /* !! */  = (long)(v4 - ew.bjkp("bknh", bjkm(int ), (int)155));
lbl31:
                // 2 sources

                switch ((int)v3 /* !! */ ) {
                    case -1423660785: {
                        v4 = ew.bjkp("bknk", bjkm(int ), (int)156);
                        continue block38;
                    }
                    case 125951915: {
                        break block38;
                    }
                    case 925632220: {
                        v4 = ew.bjkp("bknl", bjkm(int ), (int)157);
                        continue block38;
                    }
                }
                break;
            }
            v5 /* !! */  = ew.dl;
            if (true) ** GOTO lbl44
            block39: while (true) {
                v5 /* !! */  = (long)(v6 - ew.bjkp("bknm", bjkm(int ), (int)158));
lbl44:
                // 2 sources

                switch ((int)v5 /* !! */ ) {
                    case -1035085778: {
                        v6 = ew.bjkp("bkno", bjkm(int ), (int)159);
                        continue block39;
                    }
                    case 125951915: {
                        break block39;
                    }
                    case 1295271512: {
                        v6 = ew.bjkp("bknp", bjkm(int ), (int)160);
                        continue block39;
                    }
                    case 1549162386: {
                        v6 = ew.bjkp("bknq", bjkm(int ), (int)161);
                        continue block39;
                    }
                }
                break;
            }
            nv.selectSlotSilent(this.previousSlot);
            if (var1_3 || var1_3) ** GOTO lbl24
            v7 /* !! */  = ew.dl;
            if (true) ** GOTO lbl62
            block40: while (true) {
                v7 /* !! */  = (long)(ew.bjkp("bkns", bjkm(int ), (int)163) - ew.bjkp("bknr", bjkm(int ), (int)162));
lbl62:
                // 2 sources

                switch ((int)v7 /* !! */ ) {
                    case -809398305: {
                        continue block40;
                    }
                    case 125951915: {
                        break block40;
                    }
                }
                break;
            }
            if (this.fromHotbar) break block60;
            if (var1_3 || var1_3) ** GOTO lbl24
            while (true) {
                if ((v8 /* !! */  = (cfr_temp_3 = ew.dl - ew.bjkp("bknu", bjkm(int ), (int)164)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v8 /* !! */  == ew.bjkp("bknv", bjkx(int ), (int)323)) break;
                v8 /* !! */  = (long)ew.bjkp("bknw", bjkx(int ), (int)324);
            }
            while (true) {
                if ((v9 /* !! */  = (cfr_temp_4 = ew.dl - ew.bjkp("bknx", bjkm(int ), (int)165)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v9 /* !! */  == ew.bjkp("bknz", bjkx(int ), (int)325)) break;
                v9 /* !! */  = (long)ew.bjkp("bkoa", bjkx(int ), (int)326);
            }
            v10 /* !! */  = ew.dl;
            if (true) ** GOTO lbl85
            block43: while (true) {
                v10 /* !! */  = (long)(v11 - ew.bjkp("bkod", bjkm(int ), (int)166));
lbl85:
                // 2 sources

                switch ((int)v10 /* !! */ ) {
                    case -212700957: {
                        v11 = ew.bjkp("bkoe", bjkm(int ), (int)167);
                        continue block43;
                    }
                    case 125951915: {
                        break block43;
                    }
                    case 263306084: {
                        v11 = ew.bjkp("bkof", bjkm(int ), (int)168);
                        continue block43;
                    }
                    case 913604471: {
                        v11 = ew.bjkp("bkoh", bjkm(int ), (int)169);
                        continue block43;
                    }
                }
                break;
            }
            nv.swapHotbar(this.targetSlot, this.temporaryHotbarSlot);
            if (var1_3) ** GOTO lbl24
        }
        if (var1_3) ** GOTO lbl24
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var1_3) ** break;
                ** continue;
                return;
            }
lbl107:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)ew.bjkp("bkoi", bjkx(int ), (int)327);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl143
            }
lbl112:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)ew.bjkp("bkok", bjkx(int ), (int)328);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl148
            }
            case 2: {
                var2_2 /* !! */  = (int)ew.bjkp("bkol", bjkx(int ), (int)329);
                if (!var3_1) ** GOTO lbl112
                throw null;
            }
lbl121:
            // 2 sources

            case 3: {
                var2_2 /* !! */  = (int)ew.bjkp("bkon", bjkx(int ), (int)330);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl134
            }
            case 4: {
                var2_2 /* !! */  = (int)ew.bjkp("bkoo", bjkx(int ), (int)331);
                if (!var3_1) break;
                throw null;
            }
            case 5: {
                var2_2 /* !! */  = (int)ew.bjkp("bkop", bjkx(int ), (int)332);
                if (!var3_1) ** GOTO lbl107
                throw null;
            }
lbl134:
            // 3 sources

            case 6: {
                var2_2 /* !! */  = (int)ew.bjkp("bkoq", bjkx(int ), (int)333);
                if (!var3_1) ** GOTO lbl121
                throw null;
            }
            case 7: {
                do {
                    var2_2 /* !! */  = (int)ew.bjkp("bkos", bjkx(int ), (int)334);
                } while (!var3_1);
                throw null;
            }
lbl143:
            // 2 sources

            case 8: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ew.bjkp("bkot", bjkx(int ), (int)335);
                    if (!var3_1) ** GOTO lbl134
                    throw null;
                }
            }
lbl148:
            // 2 sources

            case 9: {
                do {
                    var2_2 /* !! */  = (int)ew.bjkp("bkou", bjkx(int ), (int)336);
                } while (!var3_1);
                throw null;
            }
            case 10: 
        }
        var2_2 /* !! */  = (int)ew.bjkp("bkov", bjkx(int ), (int)337);
        ** while (!var3_1)
lbl156:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void bkzm() {
        ew.bjky[200] = -849432123;
        ew.bjky[201] = 1264204572;
        ew.bjky[202] = 1265217353;
        ew.bjky[203] = -336858607;
        ew.bjky[204] = 2140887990;
        ew.bjky[205] = -1850940781;
        ew.bjky[206] = 1379874805;
        ew.bjky[207] = -1674168665;
        ew.bjky[208] = 410505443;
        ew.bjky[209] = 241519311;
        ew.bjky[210] = 1855730106;
        ew.bjky[211] = -1469111403;
        ew.bjky[212] = 2058248077;
        ew.bjky[213] = -592651529;
        ew.bjky[214] = 1365269090;
        ew.bjky[215] = 610030340;
        ew.bjky[216] = 830875967;
        ew.bjky[217] = 295250306;
        ew.bjky[218] = -391322219;
        ew.bjky[219] = 1180272303;
        ew.bjky[220] = 1353563590;
        ew.bjky[221] = 415793293;
        ew.bjky[222] = -384599438;
        ew.bjky[223] = -1978481014;
        ew.bjky[224] = 1656901613;
        ew.bjky[225] = -585346819;
        ew.bjky[226] = -1528959770;
        ew.bjky[227] = -1597711166;
        ew.bjky[228] = 1781843694;
        ew.bjky[229] = 1966589530;
        ew.bjky[230] = -754313403;
        ew.bjky[231] = 1410553282;
        ew.bjky[232] = -1757487292;
        ew.bjky[233] = -489504709;
        ew.bjky[234] = -879255931;
        ew.bjky[235] = 366983568;
        ew.bjky[236] = -1689025691;
        ew.bjky[237] = 1972112479;
        ew.bjky[238] = 1089035409;
        ew.bjky[239] = -590131701;
        ew.bjky[240] = 935842146;
        ew.bjky[241] = 499595634;
        ew.bjky[242] = 56671206;
        ew.bjky[243] = 654264845;
        ew.bjky[244] = -2055708023;
        ew.bjky[245] = -779390242;
        ew.bjky[246] = -1431622682;
        ew.bjky[247] = 1277511026;
        ew.bjky[248] = -777918018;
        ew.bjky[249] = 1280343886;
        ew.bjky[250] = -1787653193;
        ew.bjky[251] = 1536034255;
        ew.bjky[252] = -1913406952;
        ew.bjky[253] = -1362962071;
        ew.bjky[254] = -1625275707;
        ew.bjky[255] = 554156055;
        ew.bjky[256] = 559012976;
        ew.bjky[257] = -1113401319;
        ew.bjky[258] = 930363031;
        ew.bjky[259] = 51424479;
        ew.bjky[260] = 940396423;
        ew.bjky[261] = -462728287;
        ew.bjky[262] = -1252521157;
        ew.bjky[263] = 1426765726;
        ew.bjky[264] = 2023459000;
        ew.bjky[265] = 433948695;
        ew.bjky[266] = -2117733961;
        ew.bjky[267] = 1764646125;
        ew.bjky[268] = 1699319646;
        ew.bjky[269] = -314495255;
        ew.bjky[270] = -120574540;
        ew.bjky[271] = 1516326193;
        ew.bjky[272] = -1900742216;
        ew.bjky[273] = -414907634;
        ew.bjky[274] = 150969943;
        ew.bjky[275] = -857344551;
        ew.bjky[276] = 2141982626;
        ew.bjky[277] = 319492827;
        ew.bjky[278] = -866241591;
        ew.bjky[279] = -1234328048;
        ew.bjky[280] = -1660207674;
        ew.bjky[281] = -1358106897;
        ew.bjky[282] = 1894671478;
        ew.bjky[283] = 1887514248;
        ew.bjky[284] = -476231517;
        ew.bjky[285] = -1792237357;
        ew.bjky[286] = 747748773;
        ew.bjky[287] = 917088573;
        ew.bjky[288] = 274772167;
        ew.bjky[289] = 1578126521;
        ew.bjky[290] = 990154230;
        ew.bjky[291] = -1179618566;
        ew.bjky[292] = -1026403343;
        ew.bjky[293] = 405988489;
        ew.bjky[294] = 1168698874;
        ew.bjky[295] = 1646244914;
        ew.bjky[296] = 1455505796;
        ew.bjky[297] = -120400932;
        ew.bjky[298] = -114163783;
        ew.bjky[299] = -1068969495;
    }
}

