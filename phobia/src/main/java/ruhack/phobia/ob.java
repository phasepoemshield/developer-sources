/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BooleanSupplier;
import ruhack.phobia.ob$SwapStep;

public class ob {
    private boolean running;
    public static final boolean a;
    public static final int b;
    private static long[] mehn;
    private static int[] mehf;
    private int tickCounter;
    private int currentIndex;
    private static int[] mehg;
    static final long vc = -785373820877648734L;
    private final List<ob$SwapStep> steps;
    private static long[] mehm;
    public static final boolean c;

    private static /* synthetic */ void meqc() {
        ob.mehg[100] = 650493813;
        ob.mehg[101] = -1344129610;
        ob.mehg[102] = -1796305678;
        ob.mehg[103] = 11361094;
        ob.mehg[104] = 950310157;
        ob.mehg[105] = 552017820;
        ob.mehg[106] = 2130328085;
        ob.mehg[107] = 1120616100;
        ob.mehg[108] = -1494380471;
        ob.mehg[109] = -1404840222;
        ob.mehg[110] = -217824649;
        ob.mehg[111] = -1636479752;
        ob.mehg[112] = -367259957;
        ob.mehg[113] = -673416767;
        ob.mehg[114] = -1107587146;
        ob.mehg[115] = -1925452810;
        ob.mehg[116] = -1571205726;
        ob.mehg[117] = 1722016100;
        ob.mehg[118] = -1235033320;
        ob.mehg[119] = 239745549;
        ob.mehg[120] = -970799805;
        ob.mehg[121] = 2120017633;
        ob.mehg[122] = -1888009709;
        ob.mehg[123] = 1721066477;
        ob.mehg[124] = -841958809;
        ob.mehg[125] = 238740883;
        ob.mehg[126] = -137591616;
        ob.mehg[127] = -1499476121;
        ob.mehg[128] = -1590519080;
        ob.mehg[129] = 1906708384;
        ob.mehg[130] = 1002275768;
        ob.mehg[131] = -206747318;
        ob.mehg[132] = -1297989720;
        ob.mehg[133] = -617578658;
        ob.mehg[134] = 938992109;
        ob.mehg[135] = 1541844960;
        ob.mehg[136] = -1483871053;
        ob.mehg[137] = -4746946;
        ob.mehg[138] = 1631168226;
        ob.mehg[139] = -596427423;
        ob.mehg[140] = 1994197358;
        ob.mehg[141] = 1953800342;
        ob.mehg[142] = -1417257305;
        ob.mehg[143] = 1809040658;
        ob.mehg[144] = -1121828798;
        ob.mehg[145] = -1054750685;
        ob.mehg[146] = 1293151380;
        ob.mehg[147] = 1009052047;
        ob.mehg[148] = -2077471140;
        ob.mehg[149] = 1434358087;
        ob.mehg[150] = 1430908837;
        ob.mehg[151] = 1009076485;
    }

    public static /* synthetic */ CallSite mehh(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public ob() {
        int n2 = b;
        this.steps = new ArrayList<ob$SwapStep>();
        if (n2 == 0) return;
        switch (n2) {
            default: {
                return;
            }
            case 1: {
                CallSite callSite = ob.mehh("mehj", mehe(int ), (int)1);
            }
            case 0: {
                while (true) {
                    CallSite callSite = ob.mehh("mehi", mehe(int ), (int)0);
                }
            }
            case 2: 
        }
        while (true) {
            CallSite callSite = ob.mehh("mehk", mehe(int ), (int)2);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public void tick() {
        boolean bl2;
        boolean bl3;
        block16: {
            block15: {
                bl3 = c;
                int n2 = b;
                bl2 = a;
                if (bl3) {
                    throw null;
                }
                if (bl2 || bl2) return;
                if (!this.running) break block15;
                if (bl2) return;
                if (this.currentIndex < this.steps.size()) break block16;
                if (bl2) return;
            }
            if (bl2 || bl2) return;
            this.running = ob.mehh("meko", mehe(int ), (int)50);
            if (bl2 || bl2) return;
            return;
        }
        if (bl2 || bl2) return;
        ob$SwapStep ob$SwapStep = this.steps.get(this.currentIndex);
        if (bl2 || bl2) return;
        if (!ob$SwapStep.condition.getAsBoolean()) {
            if (bl2 || bl2) return;
            return;
        }
        if (bl2 || bl2) return;
        if (this.tickCounter >= ob$SwapStep.delayTicks) {
            if (bl2 || bl2) return;
            ob$SwapStep.action.run();
            if (bl2 || bl2) return;
            this.currentIndex += ob.mehh("mekp", mehe(int ), (int)51);
            if (bl2 || bl2) return;
            this.tickCounter = (int)ob.mehh("mekq", mehe(int ), (int)52);
            if (bl2) return;
            if (bl3) {
                throw null;
            }
        } else {
            if (bl2 || bl2) return;
            this.tickCounter += ob.mehh("mekr", mehe(int ), (int)53);
            if (bl2) return;
        }
        if (!bl2 && !bl2) return;
    }

    private static /* synthetic */ int mehe(int n2) {
        return mehf[n2] ^ mehg[n2];
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ boolean lambda$step$0() {
        boolean bl2;
        while (true) {
            long l2;
            Object object;
            if ((object = (l2 = vc - ob.mehh("mepk", mehl(int ), (int)67)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object == ob.mehh("mepl", mehe(int ), (int)140)) break;
            object = ob.mehh("mepm", mehe(int ), (int)141);
        }
        boolean bl3 = c;
        while (true) {
            long l3;
            Object object;
            if ((object = (l3 = vc - ob.mehh("mepn", mehl(int ), (int)68)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object == ob.mehh("mepo", mehe(int ), (int)142)) break;
            object = ob.mehh("mepp", mehe(int ), (int)143);
        }
        int n2 = b;
        while (true) {
            long l4;
            Object object;
            if ((object = (l4 = vc - ob.mehh("mepq", mehl(int ), (int)69)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            if (object == ob.mehh("mepr", mehe(int ), (int)144)) {
                bl2 = a;
                if (bl3) {
                    throw null;
                }
                break;
            }
            object = ob.mehh("meps", mehe(int ), (int)145);
        }
        if (bl2 || bl2) {
            return (boolean)ob.mehh("mept", mehe(int ), (int)146);
        }
        if (n2 == 0) return (boolean)ob.mehh("mepu", mehe(int ), (int)147);
        switch (n2) {
            default: {
                return (boolean)ob.mehh("mepu", mehe(int ), (int)147);
            }
            case 2: {
                CallSite callSite = ob.mehh("mepx", mehe(int ), (int)150);
                if (bl3) {
                    throw null;
                }
            }
            case 0: {
                CallSite callSite = ob.mehh("mepv", mehe(int ), (int)148);
                if (bl3) {
                    throw null;
                }
            }
            case 1: {
                CallSite callSite = ob.mehh("mepw", mehe(int ), (int)149);
                if (!bl3) break;
                throw null;
            }
            case 3: 
        }
        do {
            CallSite callSite = ob.mehh("mepy", mehe(int ), (int)151);
        } while (!bl3);
        throw null;
    }

    private static /* synthetic */ void meqe() {
        ob.mehn[0] = -4489314847067262761L;
        ob.mehn[1] = 6916945767468212938L;
        ob.mehn[2] = 3042166303367822325L;
        ob.mehn[3] = 4138925979052101877L;
        ob.mehn[4] = -4641124410076094426L;
        ob.mehn[5] = -5822911994835106822L;
        ob.mehn[6] = 7210844229542231771L;
        ob.mehn[7] = -2719215788292512176L;
        ob.mehn[8] = -9143812080084169484L;
        ob.mehn[9] = -8335437767135977312L;
        ob.mehn[10] = 1148151613490248227L;
        ob.mehn[11] = -6502127042210991795L;
        ob.mehn[12] = -8521951133419451166L;
        ob.mehn[13] = 8960842028887971229L;
        ob.mehn[14] = -4276198404528449260L;
        ob.mehn[15] = -4742456252101716617L;
        ob.mehn[16] = -1606168523867895823L;
        ob.mehn[17] = 4000375268282740108L;
        ob.mehn[18] = 6792821564122215865L;
        ob.mehn[19] = 7928371109064747669L;
        ob.mehn[20] = 7349034979675406266L;
        ob.mehn[21] = -1942748814137451799L;
        ob.mehn[22] = 9140217413716877981L;
        ob.mehn[23] = -5319784903280548224L;
        ob.mehn[24] = -7014741510725395497L;
        ob.mehn[25] = 8188354518360119398L;
        ob.mehn[26] = -3000241434779364373L;
        ob.mehn[27] = -4652105581228571990L;
        ob.mehn[28] = -3720798747458478051L;
        ob.mehn[29] = -8389699911231499612L;
        ob.mehn[30] = 3090162462178262447L;
        ob.mehn[31] = -1035078958154462403L;
        ob.mehn[32] = -7748940720957296950L;
        ob.mehn[33] = 4243165435189799295L;
        ob.mehn[34] = -2968039207785613643L;
        ob.mehn[35] = -5448963743457505829L;
        ob.mehn[36] = 7448358570753536534L;
        ob.mehn[37] = -9103360768040694406L;
        ob.mehn[38] = 8948712877012000338L;
        ob.mehn[39] = -2810797250964561855L;
        ob.mehn[40] = -1681370102363859656L;
        ob.mehn[41] = 3654210945586139694L;
        ob.mehn[42] = -6182061126145222494L;
        ob.mehn[43] = -8535017934829327655L;
        ob.mehn[44] = 3452897771211017573L;
        ob.mehn[45] = -3522060496718670844L;
        ob.mehn[46] = -7097336136596163723L;
        ob.mehn[47] = -8852900882832447802L;
        ob.mehn[48] = -2993670096949486850L;
        ob.mehn[49] = 7148766991614493327L;
        ob.mehn[50] = 2895077148271621047L;
        ob.mehn[51] = 1318401781371611542L;
        ob.mehn[52] = -922330729563450495L;
        ob.mehn[53] = 8661145497470213467L;
        ob.mehn[54] = -1063408234985151564L;
        ob.mehn[55] = 911104179123050021L;
        ob.mehn[56] = 6120361721125791042L;
        ob.mehn[57] = -2760146641532206621L;
        ob.mehn[58] = 536384514246196664L;
        ob.mehn[59] = 5528865912092077610L;
        ob.mehn[60] = -6048332380929807260L;
        ob.mehn[61] = -3114086662911187902L;
        ob.mehn[62] = 5026327334212102404L;
        ob.mehn[63] = 1408258777096106677L;
        ob.mehn[64] = 3994539336063055978L;
        ob.mehn[65] = -4933767520799849210L;
        ob.mehn[66] = 6511042633620168412L;
        ob.mehn[67] = 2312921311403132020L;
        ob.mehn[68] = -105278872839922350L;
        ob.mehn[69] = -8952121733958518616L;
    }

    private static /* synthetic */ void mepz() {
        ob.mehf[0] = -1963472884;
        ob.mehf[1] = 1597925886;
        ob.mehf[2] = -497997256;
        ob.mehf[3] = 1883249035;
        ob.mehf[4] = -2065540397;
        ob.mehf[5] = -883929420;
        ob.mehf[6] = -976479408;
        ob.mehf[7] = 90885246;
        ob.mehf[8] = 1653560946;
        ob.mehf[9] = -611719079;
        ob.mehf[10] = -841823750;
        ob.mehf[11] = 1907658100;
        ob.mehf[12] = 1452731263;
        ob.mehf[13] = 854247376;
        ob.mehf[14] = -676123767;
        ob.mehf[15] = -399019799;
        ob.mehf[16] = 954423563;
        ob.mehf[17] = -1764727866;
        ob.mehf[18] = 1039059639;
        ob.mehf[19] = -1201319646;
        ob.mehf[20] = -1534242937;
        ob.mehf[21] = -212087239;
        ob.mehf[22] = 1486183473;
        ob.mehf[23] = 247411092;
        ob.mehf[24] = 1827234123;
        ob.mehf[25] = -598047371;
        ob.mehf[26] = 43466387;
        ob.mehf[27] = -1905374304;
        ob.mehf[28] = 1035667242;
        ob.mehf[29] = 107875452;
        ob.mehf[30] = 99583528;
        ob.mehf[31] = -1269930174;
        ob.mehf[32] = -1418724884;
        ob.mehf[33] = 1276849227;
        ob.mehf[34] = 1471041540;
        ob.mehf[35] = -1998852586;
        ob.mehf[36] = 1320638789;
        ob.mehf[37] = 1656595695;
        ob.mehf[38] = -1070725340;
        ob.mehf[39] = -1186694170;
        ob.mehf[40] = 442919480;
        ob.mehf[41] = -1054974292;
        ob.mehf[42] = 0x10009091;
        ob.mehf[43] = -254027099;
        ob.mehf[44] = 2103142781;
        ob.mehf[45] = -920020266;
        ob.mehf[46] = -2109354810;
        ob.mehf[47] = 1274024760;
        ob.mehf[48] = -1992393441;
        ob.mehf[49] = -886970256;
        ob.mehf[50] = -473139940;
        ob.mehf[51] = 839935102;
        ob.mehf[52] = -965272284;
        ob.mehf[53] = -442118240;
        ob.mehf[54] = -1597380635;
        ob.mehf[55] = 12316925;
        ob.mehf[56] = 325730057;
        ob.mehf[57] = 1768338760;
        ob.mehf[58] = 1026276191;
        ob.mehf[59] = -691659708;
        ob.mehf[60] = 1724806390;
        ob.mehf[61] = 1558895187;
        ob.mehf[62] = 936202195;
        ob.mehf[63] = -362876071;
        ob.mehf[64] = 971544190;
        ob.mehf[65] = 1569175460;
        ob.mehf[66] = -1183540960;
        ob.mehf[67] = 1188974942;
        ob.mehf[68] = -410560542;
        ob.mehf[69] = 1656048646;
        ob.mehf[70] = 1936530921;
        ob.mehf[71] = 1383496415;
        ob.mehf[72] = -652839735;
        ob.mehf[73] = -1043321154;
        ob.mehf[74] = -914066586;
        ob.mehf[75] = 218766727;
        ob.mehf[76] = 92819154;
        ob.mehf[77] = 996768702;
        ob.mehf[78] = 1167833763;
        ob.mehf[79] = 1017965990;
        ob.mehf[80] = -2007029671;
        ob.mehf[81] = 1705045242;
        ob.mehf[82] = 70639871;
        ob.mehf[83] = 555044985;
        ob.mehf[84] = -804430656;
        ob.mehf[85] = -1846102797;
        ob.mehf[86] = 633136659;
        ob.mehf[87] = 24586090;
        ob.mehf[88] = 1600412694;
        ob.mehf[89] = -57704731;
        ob.mehf[90] = -1508634017;
        ob.mehf[91] = 1749977966;
        ob.mehf[92] = -676275807;
        ob.mehf[93] = 171183707;
        ob.mehf[94] = -1429641681;
        ob.mehf[95] = 176599100;
        ob.mehf[96] = 1171854426;
        ob.mehf[97] = -430456820;
        ob.mehf[98] = 1712227516;
        ob.mehf[99] = 1066141793;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public ob start() {
        Object object = vc;
        boolean bl2 = true;
        block21: while (true) {
            CallSite callSite;
            if (!bl2 || (bl2 = false) || !true) {
                object = callSite - ob.mehh("meji", mehl(int ), (int)16);
            }
            switch ((int)object) {
                case -2001390215: {
                    callSite = ob.mehh("mejj", mehl(int ), (int)17);
                    continue block21;
                }
                case -961393502: {
                    break block21;
                }
                case 976627661: {
                    callSite = ob.mehh("mejk", mehl(int ), (int)18);
                    continue block21;
                }
            }
            break;
        }
        boolean bl3 = c;
        Object object2 = vc;
        boolean bl4 = true;
        block22: while (true) {
            CallSite callSite;
            if (!bl4 || (bl4 = false) || !true) {
                object2 = callSite - ob.mehh("mejl", mehl(int ), (int)19);
            }
            switch ((int)object2) {
                case -961393502: {
                    break block22;
                }
                case -396565890: {
                    callSite = ob.mehh("mejm", mehl(int ), (int)20);
                    continue block22;
                }
                case 875617124: {
                    callSite = ob.mehh("mejn", mehl(int ), (int)21);
                    continue block22;
                }
                case 1684642594: {
                    callSite = ob.mehh("mejo", mehl(int ), (int)22);
                    continue block22;
                }
            }
            break;
        }
        int n2 = b;
        Object object3 = vc;
        boolean bl5 = true;
        block23: while (true) {
            CallSite callSite;
            if (!bl5 || (bl5 = false) || !true) {
                object3 = callSite - ob.mehh("mejp", mehl(int ), (int)23);
            }
            switch ((int)object3) {
                case -2029692744: {
                    callSite = ob.mehh("mejq", mehl(int ), (int)24);
                    continue block23;
                }
                case -961393502: {
                    break block23;
                }
                case -596672189: {
                    callSite = ob.mehh("mejr", mehl(int ), (int)25);
                    continue block23;
                }
            }
            break;
        }
        boolean bl6 = a;
        if (bl3) {
            throw null;
        }
        if (bl6 || bl6) return null;
        CallSite callSite = ob.mehh("mejs", mehe(int ), (int)33);
        while (true) {
            long l2;
            Object object4;
            if ((object4 = (l2 = vc - ob.mehh("mejt", mehl(int ), (int)26)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (object4 == ob.mehh("meju", mehe(int ), (int)34)) {
                this.currentIndex = (int)callSite;
                if (bl6) return null;
                break;
            }
            object4 = ob.mehh("mejv", mehe(int ), (int)35);
        }
        if (bl6) return null;
        CallSite callSite2 = ob.mehh("mejw", mehe(int ), (int)36);
        while (true) {
            long l3;
            Object object5;
            if ((object5 = (l3 = vc - ob.mehh("mejx", mehl(int ), (int)27)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (object5 == ob.mehh("mejy", mehe(int ), (int)37)) {
                this.tickCounter = (int)callSite2;
                if (bl6) return null;
                break;
            }
            object5 = ob.mehh("mejz", mehe(int ), (int)38);
        }
        if (bl6) return null;
        CallSite callSite3 = ob.mehh("meka", mehe(int ), (int)39);
        Object object6 = vc;
        boolean bl7 = true;
        block26: while (true) {
            CallSite callSite4;
            if (!bl7 || (bl7 = false) || !true) {
                object6 = callSite4 - ob.mehh("mekb", mehl(int ), (int)28);
            }
            switch ((int)object6) {
                case -961393502: {
                    break block26;
                }
                case -27168146: {
                    callSite4 = ob.mehh("mekc", mehl(int ), (int)29);
                    continue block26;
                }
                case 1055283364: {
                    callSite4 = ob.mehh("mekd", mehl(int ), (int)30);
                    continue block26;
                }
            }
            break;
        }
        this.running = callSite3;
        if (!bl6 && !bl6) return this;
        return null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public ob step(int var1_1, Runnable var2_2) {
        block26: {
            v0 /* !! */  = ob.vc;
            if (true) ** GOTO lbl5
            block12: while (true) {
                v0 /* !! */  = (long)(v1 - ob.mehh("meho", mehl(int ), (int)0));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -1761773624: {
                        v1 = ob.mehh("mehp", mehl(int ), (int)1);
                        continue block12;
                    }
                    case -961393502: {
                        break block12;
                    }
                    case -468336299: {
                        v1 = ob.mehh("mehq", mehl(int ), (int)2);
                        continue block12;
                    }
                    case 1786735005: {
                        v1 = ob.mehh("mehr", mehl(int ), (int)3);
                        continue block12;
                    }
                }
                break;
            }
            var5_3 = ob.c;
            while (true) {
                if ((v2 /* !! */  = (cfr_temp_1 = ob.vc - ob.mehh("mehs", mehl(int ), (int)4)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v2 /* !! */  == ob.mehh("meht", mehe(int ), (int)3)) break;
                v2 /* !! */  = (long)ob.mehh("mehu", mehe(int ), (int)4);
            }
            var4_4 /* !! */  = ob.b;
            while (true) {
                if ((v3 /* !! */  = (cfr_temp_2 = ob.vc - ob.mehh("mehv", mehl(int ), (int)5)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v3 /* !! */  == ob.mehh("mehw", mehe(int ), (int)5)) {
                    var3_5 = ob.a;
                    if (var5_3) {
                        throw null;
                    }
                    break;
                }
                v3 /* !! */  = (long)ob.mehh("mehx", mehe(int ), (int)6);
            }
            if (!var3_5 && !var3_5) ** GOTO lbl40
            if (var4_4 /* !! */  == 0) return null;
            cfr_temp_0 = -2147483648;
            while (true) {
                switch (cfr_temp_0 == -2147483648 ? var4_4 /* !! */  : cfr_temp_0) {
                    default: {
                        return null;
                    }
lbl40:
                    // 1 sources

                    while (true) {
                        if ((v4 /* !! */  = (cfr_temp_3 = ob.vc - ob.mehh("mehy", mehl(int ), (int)6)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                        if (v4 /* !! */  != ob.mehh("mehz", mehe(int ), (int)7)) {
                            v4 /* !! */  = (long)ob.mehh("meia", mehe(int ), (int)8);
                            continue;
                        }
                        ** GOTO lbl57
                        break;
                    }
                    case 0: {
                        var4_4 /* !! */  = (int)ob.mehh("meie", mehe(int ), (int)11);
                        cfr_temp_0 = 2;
                        if (var5_3) {
                            throw null;
                        }
                        break block26;
                    }
                    case 3: {
                        var4_4 /* !! */  = (int)ob.mehh("meih", mehe(int ), (int)14);
                        if (var5_3) {
                            throw null;
                        }
                        ** GOTO lbl-1000
                    }
lbl57:
                    // 1 sources

                    v5 = (BooleanSupplier)LambdaMetafactory.metafactory(null, null, null, ()Z, lambda$step$0(), ()Z)();
                    while (true) {
                        if ((v6 /* !! */  = (cfr_temp_4 = ob.vc - ob.mehh("meib", mehl(int ), (int)7)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                        if (v6 /* !! */  == ob.mehh("meic", mehe(int ), (int)9)) {
                            return this.step(var1_1, var2_2, v5);
                        }
                        v6 /* !! */  = (long)ob.mehh("meid", mehe(int ), (int)10);
                    }
                    case 1: lbl-1000:
                    // 2 sources

                    {
                        var4_4 /* !! */  = (int)ob.mehh("meif", mehe(int ), (int)12);
                        if (var5_3) {
                            throw null;
                        }
                    }
                    case 2: 
                }
                break;
            }
            ** GOTO lbl73
        }
        do {
            if (true) ** continue;
lbl73:
            // 2 sources

            var4_4 /* !! */  = (int)ob.mehh("meig", mehe(int ), (int)13);
            cfr_temp_0 = 1;
        } while (!var5_3);
        throw null;
    }

    private static /* synthetic */ long mehl(int n2) {
        return mehm[n2] ^ mehn[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean isFinished() {
        block50: {
            block49: {
                v0 /* !! */  = ob.vc;
                if (true) ** GOTO lbl5
                block25: while (true) {
                    v0 /* !! */  = (long)(ob.mehh("melz", mehl(int ), (int)32) - ob.mehh("mely", mehl(int ), (int)31));
lbl5:
                    // 2 sources

                    switch ((int)v0 /* !! */ ) {
                        case -1606084847: {
                            continue block25;
                        }
                        case -961393502: {
                            break block25;
                        }
                    }
                    break;
                }
                var3_1 = ob.c;
                v1 /* !! */  = ob.vc;
                if (true) ** GOTO lbl15
                block26: while (true) {
                    v1 /* !! */  = (long)(ob.mehh("memb", mehl(int ), (int)34) - ob.mehh("mema", mehl(int ), (int)33));
lbl15:
                    // 2 sources

                    switch ((int)v1 /* !! */ ) {
                        case -961393502: {
                            break block26;
                        }
                        case 1975129183: {
                            continue block26;
                        }
                    }
                    break;
                }
                var2_2 /* !! */  = ob.b;
                while (true) {
                    if ((v2 /* !! */  = (cfr_temp_0 = ob.vc - ob.mehh("memc", mehl(int ), (int)35)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v2 /* !! */  == ob.mehh("memd", mehe(int ), (int)86)) break;
                    v2 /* !! */  = (long)ob.mehh("meme", mehe(int ), (int)87);
                }
                var1_3 = ob.a;
                if (var3_1) {
                    throw null;
lbl30:
                    // 5 sources

                    return (boolean)ob.mehh("memf", mehe(int ), (int)88);
                }
                if (var1_3 || var1_3) ** GOTO lbl30
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_1 = ob.vc - ob.mehh("memg", mehl(int ), (int)36)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == ob.mehh("memh", mehe(int ), (int)89)) break;
                    v3 /* !! */  = (long)ob.mehh("memi", mehe(int ), (int)90);
                }
                if (!this.running) break block49;
                if (var1_3) ** GOTO lbl30
                v4 /* !! */  = ob.vc;
                if (true) ** GOTO lbl45
                block30: while (true) {
                    v4 /* !! */  = (long)(ob.mehh("memk", mehl(int ), (int)38) - ob.mehh("memj", mehl(int ), (int)37));
lbl45:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -965741962: {
                            continue block30;
                        }
                        case -961393502: {
                            break block30;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_2 = ob.vc - ob.mehh("meml", mehl(int ), (int)39)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == ob.mehh("memm", mehe(int ), (int)91)) break;
                    v5 /* !! */  = (long)ob.mehh("memn", mehe(int ), (int)92);
                }
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_3 = ob.vc - ob.mehh("memo", mehl(int ), (int)40)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v6 /* !! */  == ob.mehh("memp", mehe(int ), (int)93)) break;
                    v6 /* !! */  = (long)ob.mehh("memq", mehe(int ), (int)94);
                }
                if (this.currentIndex < this.steps.size()) break block50;
                if (var1_3) ** GOTO lbl30
            }
            if (var1_3 || var1_3) ** GOTO lbl30
            v7 = ob.mehh("memr", mehe(int ), (int)95);
            if (var3_1) {
                throw null;
            }
            ** GOTO lbl77
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block12 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var1_3 && !var1_3) ** break;
                ** continue;
                v7 = ob.mehh("mems", mehe(int ), (int)96);
lbl77:
                // 2 sources

                return (boolean)v7;
            }
lbl78:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)ob.mehh("memt", mehe(int ), (int)97);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl115
            }
lbl83:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)ob.mehh("memu", mehe(int ), (int)98);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)ob.mehh("memv", mehe(int ), (int)99);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl110
            }
lbl92:
            // 2 sources

            case 3: {
                var2_2 /* !! */  = (int)ob.mehh("memw", mehe(int ), (int)100);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl115
            }
lbl97:
            // 2 sources

            case 4: {
                var2_2 /* !! */  = (int)ob.mehh("memx", mehe(int ), (int)101);
                if (!var3_1) ** GOTO lbl78
                throw null;
            }
            case 5: {
                var2_2 /* !! */  = (int)ob.mehh("memy", mehe(int ), (int)102);
                if (!var3_1) ** GOTO lbl83
                throw null;
            }
            case 6: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ob.mehh("memz", mehe(int ), (int)103);
                    if (!var3_1) break block12;
                    throw null;
                }
            }
lbl110:
            // 2 sources

            case 7: {
                do {
                    var2_2 /* !! */  = (int)ob.mehh("mena", mehe(int ), (int)104);
                } while (!var3_1);
                throw null;
            }
lbl115:
            // 3 sources

            case 8: {
                var2_2 /* !! */  = (int)ob.mehh("menb", mehe(int ), (int)105);
                if (!var3_1) ** GOTO lbl97
                throw null;
            }
            case 9: {
                var2_2 /* !! */  = (int)ob.mehh("menc", mehe(int ), (int)106);
                if (!var3_1) ** GOTO lbl92
                throw null;
            }
            case 10: 
        }
        var2_2 /* !! */  = (int)ob.mehh("mend", mehe(int ), (int)107);
        ** while (!var3_1)
lbl126:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void meqd() {
        ob.mehm[0] = 5496008104275565509L;
        ob.mehm[1] = 3450713205345723997L;
        ob.mehm[2] = 4866693150267077485L;
        ob.mehm[3] = -3849928767836227091L;
        ob.mehm[4] = -2080932007695028397L;
        ob.mehm[5] = -2675747456357200019L;
        ob.mehm[6] = 8687999368411609739L;
        ob.mehm[7] = 7335871820242823007L;
        ob.mehm[8] = -2515611109999419502L;
        ob.mehm[9] = 8914038270938372723L;
        ob.mehm[10] = -6891925510297851807L;
        ob.mehm[11] = -4002873352467600655L;
        ob.mehm[12] = 4527626100957521778L;
        ob.mehm[13] = -941139330357890835L;
        ob.mehm[14] = 7476311682453188510L;
        ob.mehm[15] = 5650040482835698197L;
        ob.mehm[16] = -2203586047586098545L;
        ob.mehm[17] = -8915067928385727913L;
        ob.mehm[18] = -6322746778272120596L;
        ob.mehm[19] = -6413657150909416312L;
        ob.mehm[20] = 8945383355591986467L;
        ob.mehm[21] = 5057762326102927067L;
        ob.mehm[22] = 3215565549506765367L;
        ob.mehm[23] = -6085734556565549328L;
        ob.mehm[24] = 6525480990424176085L;
        ob.mehm[25] = -4075229243520264380L;
        ob.mehm[26] = 3556882848908288260L;
        ob.mehm[27] = 2267646992296130137L;
        ob.mehm[28] = -5764657966948074659L;
        ob.mehm[29] = 519289926217268665L;
        ob.mehm[30] = 7055336097023193652L;
        ob.mehm[31] = 619418665631899987L;
        ob.mehm[32] = -5686629004828141737L;
        ob.mehm[33] = 6487305139106945836L;
        ob.mehm[34] = -1247817788534743711L;
        ob.mehm[35] = 3199855752123411024L;
        ob.mehm[36] = 2111794752649010977L;
        ob.mehm[37] = -6328292208896608349L;
        ob.mehm[38] = -3261460165736479798L;
        ob.mehm[39] = -7861300121294786396L;
        ob.mehm[40] = -6548701672456011858L;
        ob.mehm[41] = -7483318584851223377L;
        ob.mehm[42] = -5896415627210324881L;
        ob.mehm[43] = 136836448356642300L;
        ob.mehm[44] = 7714353515855663905L;
        ob.mehm[45] = -606581757321774437L;
        ob.mehm[46] = 3750495256621112758L;
        ob.mehm[47] = -7085874198121305230L;
        ob.mehm[48] = -1743906129877780528L;
        ob.mehm[49] = -6766319776815307518L;
        ob.mehm[50] = 4815996618891131996L;
        ob.mehm[51] = -8311861157587735261L;
        ob.mehm[52] = -5995628391074238247L;
        ob.mehm[53] = 3513736234383610046L;
        ob.mehm[54] = -7335374953759563737L;
        ob.mehm[55] = 970178326221193902L;
        ob.mehm[56] = -6090654967969883287L;
        ob.mehm[57] = -4498445150287212075L;
        ob.mehm[58] = 8489560047680241209L;
        ob.mehm[59] = 256623007347310698L;
        ob.mehm[60] = 7373198766682487861L;
        ob.mehm[61] = 6240278268133399638L;
        ob.mehm[62] = -6557779818526178160L;
        ob.mehm[63] = 4665555960144011878L;
        ob.mehm[64] = 8438493142848516216L;
        ob.mehm[65] = -391727398458548386L;
        ob.mehm[66] = 4523633328821850193L;
        ob.mehm[67] = 57063366229538754L;
        ob.mehm[68] = 4126970517287410473L;
        ob.mehm[69] = 1402270106680610018L;
    }

    static {
        mehf = new int[152];
        mehg = new int[152];
        ob.mepz();
        ob.meqa();
        ob.meqb();
        ob.meqc();
        mehm = new long[70];
        mehn = new long[70];
        ob.meqd();
        ob.meqe();
    }

    private static /* synthetic */ void meqb() {
        ob.mehg[0] = -1963472884;
        ob.mehg[1] = 1597925887;
        ob.mehg[2] = -497997255;
        ob.mehg[3] = -1883249036;
        ob.mehg[4] = -887664739;
        ob.mehg[5] = 883929419;
        ob.mehg[6] = 882696756;
        ob.mehg[7] = -90885247;
        ob.mehg[8] = 776718174;
        ob.mehg[9] = -611719080;
        ob.mehg[10] = -1895001645;
        ob.mehg[11] = 1907658103;
        ob.mehg[12] = 1452731263;
        ob.mehg[13] = 854247376;
        ob.mehg[14] = -676123767;
        ob.mehg[15] = 399019798;
        ob.mehg[16] = -120199407;
        ob.mehg[17] = 1764727865;
        ob.mehg[18] = -1095122111;
        ob.mehg[19] = -1201319645;
        ob.mehg[20] = -2058566382;
        ob.mehg[21] = 212087238;
        ob.mehg[22] = -2108585012;
        ob.mehg[23] = 247411093;
        ob.mehg[24] = 275612512;
        ob.mehg[25] = -598047372;
        ob.mehg[26] = -492202395;
        ob.mehg[27] = -1905374303;
        ob.mehg[28] = 1035667240;
        ob.mehg[29] = 107875449;
        ob.mehg[30] = 99583528;
        ob.mehg[31] = -1269930170;
        ob.mehg[32] = -1418724883;
        ob.mehg[33] = 1276849227;
        ob.mehg[34] = 1471041541;
        ob.mehg[35] = -1253950402;
        ob.mehg[36] = 1320638789;
        ob.mehg[37] = 1656595694;
        ob.mehg[38] = 347630446;
        ob.mehg[39] = -1186694169;
        ob.mehg[40] = 442919482;
        ob.mehg[41] = -1054974292;
        ob.mehg[42] = 268472466;
        ob.mehg[43] = -254027103;
        ob.mehg[44] = 2103142773;
        ob.mehg[45] = -920020258;
        ob.mehg[46] = -2109354813;
        ob.mehg[47] = 1274024762;
        ob.mehg[48] = -1992393445;
        ob.mehg[49] = -886970250;
        ob.mehg[50] = -473139940;
        ob.mehg[51] = 839935103;
        ob.mehg[52] = -965272284;
        ob.mehg[53] = -442118239;
        ob.mehg[54] = -1597380611;
        ob.mehg[55] = 12316907;
        ob.mehg[56] = 325730073;
        ob.mehg[57] = 1768338771;
        ob.mehg[58] = 1026276164;
        ob.mehg[59] = -691659681;
        ob.mehg[60] = 1724806395;
        ob.mehg[61] = 1558895192;
        ob.mehg[62] = 936202189;
        ob.mehg[63] = -362876073;
        ob.mehg[64] = 971544164;
        ob.mehg[65] = 1569175465;
        ob.mehg[66] = -1183540937;
        ob.mehg[67] = 1188974942;
        ob.mehg[68] = -410560532;
        ob.mehg[69] = 1656048640;
        ob.mehg[70] = 1936530925;
        ob.mehg[71] = 1383496387;
        ob.mehg[72] = -652839730;
        ob.mehg[73] = -1043321170;
        ob.mehg[74] = -914066588;
        ob.mehg[75] = 218766733;
        ob.mehg[76] = 92819146;
        ob.mehg[77] = 996768684;
        ob.mehg[78] = 1167833761;
        ob.mehg[79] = 1017965995;
        ob.mehg[80] = -2007029684;
        ob.mehg[81] = 1705045231;
        ob.mehg[82] = 70639870;
        ob.mehg[83] = 555044975;
        ob.mehg[84] = -804430643;
        ob.mehg[85] = -1846102785;
        ob.mehg[86] = 633136658;
        ob.mehg[87] = -423345933;
        ob.mehg[88] = 1600412695;
        ob.mehg[89] = 57704730;
        ob.mehg[90] = -572830989;
        ob.mehg[91] = -1749977967;
        ob.mehg[92] = -253322164;
        ob.mehg[93] = -171183708;
        ob.mehg[94] = 1544246894;
        ob.mehg[95] = 176599101;
        ob.mehg[96] = 1171854426;
        ob.mehg[97] = -430456818;
        ob.mehg[98] = 1712227514;
        ob.mehg[99] = 1066141801;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void cancel() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ob.vc - ob.mehh("meot", mehl(int ), (int)61)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ob.mehh("meou", mehe(int ), (int)129)) break;
            v0 /* !! */  = (long)ob.mehh("meov", mehe(int ), (int)130);
        }
        var3_1 = ob.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ob.vc - ob.mehh("meow", mehl(int ), (int)62)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == ob.mehh("meox", mehe(int ), (int)131)) break;
            v1 /* !! */  = (long)ob.mehh("meoy", mehe(int ), (int)132);
        }
        var2_2 /* !! */  = ob.b;
        v2 /* !! */  = ob.vc;
        if (true) ** GOTO lbl19
        block18: while (true) {
            v2 /* !! */  = (long)(ob.mehh("mepa", mehl(int ), (int)64) - ob.mehh("meoz", mehl(int ), (int)63));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -961393502: {
                    break block18;
                }
                case 1691297059: {
                    continue block18;
                }
            }
            break;
        }
        var1_3 = ob.a;
        if (var3_1) {
            throw null;
lbl27:
            // 3 sources

            return;
        }
        if (var1_3) ** GOTO lbl27
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl27
                v3 = ob.mehh("mepb", mehe(int ), (int)133);
                v4 /* !! */  = ob.vc;
                if (true) ** GOTO lbl39
                block20: while (true) {
                    v4 /* !! */  = (long)(ob.mehh("mepd", mehl(int ), (int)66) - ob.mehh("mepc", mehl(int ), (int)65));
lbl39:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -961393502: {
                            break block20;
                        }
                        case 594385136: {
                            continue block20;
                        }
                    }
                    break;
                }
                this.running = v3;
                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
lbl48:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)ob.mehh("mepe", mehe(int ), (int)134);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl66
            }
            case 1: {
                var2_2 /* !! */  = (int)ob.mehh("mepf", mehe(int ), (int)135);
                if (!var3_1) ** GOTO lbl48
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)ob.mehh("mepg", mehe(int ), (int)136);
                if (!var3_1) break;
                throw null;
            }
            case 3: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)ob.mehh("meph", mehe(int ), (int)137);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
lbl66:
            // 2 sources

            case 4: {
                do {
                    var2_2 /* !! */  = (int)ob.mehh("mepi", mehe(int ), (int)138);
                } while (!var3_1);
                throw null;
            }
            case 5: 
        }
        var2_2 /* !! */  = (int)ob.mehh("mepj", mehe(int ), (int)139);
        ** while (!var3_1)
lbl74:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void meqa() {
        ob.mehf[100] = 650493811;
        ob.mehf[101] = -1344129612;
        ob.mehf[102] = -1796305674;
        ob.mehf[103] = 11361100;
        ob.mehf[104] = 950310149;
        ob.mehf[105] = 552017821;
        ob.mehf[106] = 2130328082;
        ob.mehf[107] = 1120616110;
        ob.mehf[108] = 1494380470;
        ob.mehf[109] = -244959183;
        ob.mehf[110] = 217824648;
        ob.mehf[111] = 1729435113;
        ob.mehf[112] = -367259957;
        ob.mehf[113] = 673416766;
        ob.mehf[114] = 1287991244;
        ob.mehf[115] = -1925452810;
        ob.mehf[116] = -1571205726;
        ob.mehf[117] = 1722016109;
        ob.mehf[118] = -1235033316;
        ob.mehf[119] = 239745547;
        ob.mehf[120] = -970799805;
        ob.mehf[121] = 2120017633;
        ob.mehf[122] = -1888009708;
        ob.mehf[123] = 1721066478;
        ob.mehf[124] = -841958812;
        ob.mehf[125] = 238740891;
        ob.mehf[126] = -137591605;
        ob.mehf[127] = -1499476114;
        ob.mehf[128] = -1590519086;
        ob.mehf[129] = 1906708385;
        ob.mehf[130] = -1759107155;
        ob.mehf[131] = -206747317;
        ob.mehf[132] = 832467129;
        ob.mehf[133] = -617578658;
        ob.mehf[134] = 938992104;
        ob.mehf[135] = 1541844961;
        ob.mehf[136] = -1483871049;
        ob.mehf[137] = -4746946;
        ob.mehf[138] = 1631168226;
        ob.mehf[139] = -596427423;
        ob.mehf[140] = -1994197359;
        ob.mehf[141] = 1511755389;
        ob.mehf[142] = -1417257306;
        ob.mehf[143] = -1883235570;
        ob.mehf[144] = -1121828797;
        ob.mehf[145] = 1597589670;
        ob.mehf[146] = 1293151381;
        ob.mehf[147] = 1009052046;
        ob.mehf[148] = -2077471139;
        ob.mehf[149] = 1434358087;
        ob.mehf[150] = 1430908838;
        ob.mehf[151] = 1009076485;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public ob step(int var1_1, Runnable var2_2, BooleanSupplier var3_3) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ob.vc - ob.mehh("meii", mehl(int ), (int)8)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ob.mehh("meij", mehe(int ), (int)15)) break;
            v0 /* !! */  = (long)ob.mehh("meik", mehe(int ), (int)16);
        }
        var6_4 = ob.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ob.vc - ob.mehh("meil", mehl(int ), (int)9)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == ob.mehh("meim", mehe(int ), (int)17)) break;
            v1 /* !! */  = (long)ob.mehh("mein", mehe(int ), (int)18);
        }
        var5_5 /* !! */  = ob.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = ob.vc - ob.mehh("meio", mehl(int ), (int)10)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == ob.mehh("meip", mehe(int ), (int)19)) break;
            v2 /* !! */  = (long)ob.mehh("meiq", mehe(int ), (int)20);
        }
        var4_6 = ob.a;
        if (var6_4) {
            throw null;
lbl21:
            // 2 sources

            return null;
        }
        if (var4_6 || var4_6) ** GOTO lbl21
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_3 = ob.vc - ob.mehh("meir", mehl(int ), (int)11)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == ob.mehh("meis", mehe(int ), (int)21)) break;
            v3 /* !! */  = (long)ob.mehh("meit", mehe(int ), (int)22);
        }
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_4 = ob.vc - ob.mehh("meiu", mehl(int ), (int)12)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == ob.mehh("meiv", mehe(int ), (int)23)) break;
            v4 /* !! */  = (long)ob.mehh("meiw", mehe(int ), (int)24);
        }
        v5 /* !! */  = ob.vc;
        if (true) ** GOTO lbl38
        block18: while (true) {
            v5 /* !! */  = (long)(ob.mehh("meiy", mehl(int ), (int)14) - ob.mehh("meix", mehl(int ), (int)13));
lbl38:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -961393502: {
                    break block18;
                }
                case 1386131867: {
                    continue block18;
                }
            }
            break;
        }
        v6 = new ob$SwapStep(var1_1, var2_2, var3_3);
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_5 = ob.vc - ob.mehh("meiz", mehl(int ), (int)15)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v7 /* !! */  == ob.mehh("meja", mehe(int ), (int)25)) break;
            v7 /* !! */  = (long)ob.mehh("mejb", mehe(int ), (int)26);
        }
        this.steps.add(v6);
        if (var5_5 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_5 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_6 || var4_6) ** continue;
                return this;
            }
            case 0: {
                var5_5 /* !! */  = (int)ob.mehh("mejc", mehe(int ), (int)27);
                if (var6_4) {
                    throw null;
                }
                ** GOTO lbl75
            }
lbl60:
            // 2 sources

            case 1: {
                var5_5 /* !! */  = (int)ob.mehh("mejd", mehe(int ), (int)28);
                if (var6_4) {
                    throw null;
                }
                ** GOTO lbl75
            }
            case 2: {
                do {
                    var5_5 /* !! */  = (int)ob.mehh("meje", mehe(int ), (int)29);
                } while (!var6_4);
                throw null;
            }
lbl70:
            // 2 sources

            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_5 /* !! */  = (int)ob.mehh("mejf", mehe(int ), (int)30);
                    if (!var6_4) ** GOTO lbl60
                    throw null;
                }
            }
lbl75:
            // 3 sources

            case 4: {
                var5_5 /* !! */  = (int)ob.mehh("mejg", mehe(int ), (int)31);
                if (!var6_4) ** GOTO lbl70
                throw null;
            }
            case 5: 
        }
        var5_5 /* !! */  = (int)ob.mehh("mejh", mehe(int ), (int)32);
        ** while (!var6_4)
lbl82:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void reset() {
        v0 /* !! */  = ob.vc;
        if (true) ** GOTO lbl5
        block41: while (true) {
            v0 /* !! */  = (long)(v1 - ob.mehh("mene", mehl(int ), (int)41));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -961393502: {
                    break block41;
                }
                case -130279662: {
                    v1 = ob.mehh("menf", mehl(int ), (int)42);
                    continue block41;
                }
                case 15312985: {
                    v1 = ob.mehh("meng", mehl(int ), (int)43);
                    continue block41;
                }
            }
            break;
        }
        var3_1 = ob.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = ob.vc - ob.mehh("menh", mehl(int ), (int)44)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == ob.mehh("meni", mehe(int ), (int)108)) break;
            v2 /* !! */  = (long)ob.mehh("menj", mehe(int ), (int)109);
        }
        var2_2 /* !! */  = ob.b;
        v3 /* !! */  = ob.vc;
        if (true) ** GOTO lbl25
        block43: while (true) {
            v3 /* !! */  = (long)(v4 - ob.mehh("menk", mehl(int ), (int)45));
lbl25:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1833812399: {
                    v4 = ob.mehh("menl", mehl(int ), (int)46);
                    continue block43;
                }
                case -1742613822: {
                    v4 = ob.mehh("menm", mehl(int ), (int)47);
                    continue block43;
                }
                case -961393502: {
                    break block43;
                }
                case 570447068: {
                    v4 = ob.mehh("menn", mehl(int ), (int)48);
                    continue block43;
                }
            }
            break;
        }
        var1_3 = ob.a;
        if (var3_1) {
            throw null;
lbl40:
            // 6 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl40
        v5 /* !! */  = ob.vc;
        if (true) ** GOTO lbl47
        block45: while (true) {
            v5 /* !! */  = (long)(v6 - ob.mehh("meno", mehl(int ), (int)49));
lbl47:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -961393502: {
                    break block45;
                }
                case 152357101: {
                    v6 = ob.mehh("menp", mehl(int ), (int)50);
                    continue block45;
                }
                case 1437771601: {
                    v6 = ob.mehh("menq", mehl(int ), (int)51);
                    continue block45;
                }
                case 1846359724: {
                    v6 = ob.mehh("menr", mehl(int ), (int)52);
                    continue block45;
                }
            }
            break;
        }
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_1 = ob.vc - ob.mehh("mens", mehl(int ), (int)53)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v7 /* !! */  == ob.mehh("ment", mehe(int ), (int)110)) break;
            v7 /* !! */  = (long)ob.mehh("menu", mehe(int ), (int)111);
        }
        this.steps.clear();
        if (var1_3 || var1_3) ** GOTO lbl40
        v8 = ob.mehh("menv", mehe(int ), (int)112);
        while (true) {
            if ((v9 /* !! */  = (cfr_temp_2 = ob.vc - ob.mehh("menw", mehl(int ), (int)54)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v9 /* !! */  == ob.mehh("menx", mehe(int ), (int)113)) break;
            v9 /* !! */  = (long)ob.mehh("meny", mehe(int ), (int)114);
        }
        this.currentIndex = (int)v8;
        if (var1_3 || var1_3) ** GOTO lbl40
        v10 = ob.mehh("menz", mehe(int ), (int)115);
        v11 /* !! */  = ob.vc;
        if (true) ** GOTO lbl79
        block48: while (true) {
            v11 /* !! */  = (long)(v12 - ob.mehh("meoa", mehl(int ), (int)55));
lbl79:
            // 2 sources

            switch ((int)v11 /* !! */ ) {
                case -961393502: {
                    break block48;
                }
                case -583930686: {
                    v12 = ob.mehh("meob", mehl(int ), (int)56);
                    continue block48;
                }
                case 48153327: {
                    v12 = ob.mehh("meoc", mehl(int ), (int)57);
                    continue block48;
                }
            }
            break;
        }
        this.tickCounter = (int)v10;
        if (var1_3) ** GOTO lbl40
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl40
                v13 = ob.mehh("meod", mehe(int ), (int)116);
                v14 /* !! */  = ob.vc;
                if (true) ** GOTO lbl99
                block49: while (true) {
                    v14 /* !! */  = (long)(v15 - ob.mehh("meoe", mehl(int ), (int)58));
lbl99:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case -961393502: {
                            break block49;
                        }
                        case 12530696: {
                            v15 = ob.mehh("meof", mehl(int ), (int)59);
                            continue block49;
                        }
                        case 194432201: {
                            v15 = ob.mehh("meog", mehl(int ), (int)60);
                            continue block49;
                        }
                    }
                    break;
                }
                this.running = v13;
                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
lbl112:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)ob.mehh("meoh", mehe(int ), (int)117);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl138
            }
lbl117:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)ob.mehh("meoi", mehe(int ), (int)118);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl138
            }
lbl122:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)ob.mehh("meoj", mehe(int ), (int)119);
                if (!var3_1) ** GOTO lbl112
                throw null;
            }
lbl126:
            // 2 sources

            case 3: {
                var2_2 /* !! */  = (int)ob.mehh("meok", mehe(int ), (int)120);
                if (!var3_1) ** GOTO lbl122
                throw null;
            }
            case 4: {
                var2_2 /* !! */  = (int)ob.mehh("meol", mehe(int ), (int)121);
                if (var3_1) {
                    throw null;
                }
            }
            case 5: {
                var2_2 /* !! */  = (int)ob.mehh("meom", mehe(int ), (int)122);
                if (!var3_1) ** GOTO lbl126
                throw null;
            }
lbl138:
            // 3 sources

            case 6: {
                var2_2 /* !! */  = (int)ob.mehh("meon", mehe(int ), (int)123);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl147
            }
lbl143:
            // 2 sources

            case 7: {
                var2_2 /* !! */  = (int)ob.mehh("meoo", mehe(int ), (int)124);
                if (!var3_1) ** GOTO lbl117
                throw null;
            }
lbl147:
            // 2 sources

            case 8: {
                var2_2 /* !! */  = (int)ob.mehh("meop", mehe(int ), (int)125);
                if (!var3_1) break;
                throw null;
            }
            case 9: {
                var2_2 /* !! */  = (int)ob.mehh("meoq", mehe(int ), (int)126);
                if (!var3_1) ** GOTO lbl143
                throw null;
            }
            case 10: {
                var2_2 /* !! */  = (int)ob.mehh("meor", mehe(int ), (int)127);
                if (!var3_1) break;
                throw null;
            }
            case 11: 
        }
        do {
            var2_2 /* !! */  = (int)ob.mehh("meos", mehe(int ), (int)128);
        } while (!var3_1);
        throw null;
    }
}

