/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.Random;

public class lw {
    public float phase;
    private static int[] hzsa;
    public float spiralRadius;
    public double x;
    public float spiralAngle;
    public double vz;
    public static final boolean c;
    public static final boolean a;
    public int maxLifetime;
    private static long[] hzwj;
    protected static final long pf = 5374666901489868916L;
    public int lifetime;
    public float rotationY;
    public static final int b;
    public float initialSize;
    public float rotationSpeedX;
    public float size;
    private static long[] hzwn;
    private static int[] hzrz;
    public double vx;
    public double vy;
    public float rotationX;
    public double y;
    public float rotationSpeedY;
    public double z;
    private static final Random RANDOM;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean isDead() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = lw.pf - lw.hzsc("iaiq", hzwi(int ), (int)42)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == lw.hzsc("iair", hzry(int ), (int)167)) break;
            v0 /* !! */  = (long)lw.hzsc("iais", hzry(int ), (int)168);
        }
        var3_1 = lw.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = lw.pf - lw.hzsc("iait", hzwi(int ), (int)43)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == lw.hzsc("iaiu", hzry(int ), (int)169)) break;
            v1 /* !! */  = (long)lw.hzsc("iaiv", hzry(int ), (int)170);
        }
        var2_2 /* !! */  = lw.b;
        v2 /* !! */  = lw.pf;
        if (true) ** GOTO lbl19
        block17: while (true) {
            v2 /* !! */  = (long)(v3 - lw.hzsc("iaiw", hzwi(int ), (int)44));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -2020679497: {
                    v3 = lw.hzsc("iaix", hzwi(int ), (int)45);
                    continue block17;
                }
                case -1732241905: {
                    v3 = lw.hzsc("iaiy", hzwi(int ), (int)46);
                    continue block17;
                }
                case 425353332: {
                    break block17;
                }
            }
            break;
        }
        var1_3 = lw.a;
        if (var3_1) {
            throw null;
lbl31:
            // 3 sources

            return (boolean)lw.hzsc("iaiz", hzry(int ), (int)171);
        }
        if (var1_3 || var1_3) ** GOTO lbl31
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_2 = lw.pf - lw.hzsc("iaja", hzwi(int ), (int)47)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v4 /* !! */  == lw.hzsc("iajb", hzry(int ), (int)172)) break;
            v4 /* !! */  = (long)lw.hzsc("iajc", hzry(int ), (int)173);
        }
        if (this.lifetime > 0) ** GOTO lbl49
        if (var1_3) ** GOTO lbl31
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v5 = lw.hzsc("iajd", hzry(int ), (int)174);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl52
            }
lbl49:
            // 1 sources

            if (!var1_3 && !var1_3) ** break;
            ** continue;
            v5 = lw.hzsc("iaje", hzry(int ), (int)175);
lbl52:
            // 2 sources

            return (boolean)v5;
lbl53:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)lw.hzsc("iajf", hzry(int ), (int)176);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl64
                    break;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)lw.hzsc("iajg", hzry(int ), (int)177);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl72
            }
lbl64:
            // 3 sources

            case 2: {
                var2_2 /* !! */  = (int)lw.hzsc("iajh", hzry(int ), (int)178);
                if (!var3_1) break;
                throw null;
            }
            case 3: {
                var2_2 /* !! */  = (int)lw.hzsc("iaji", hzry(int ), (int)179);
                if (!var3_1) ** GOTO lbl53
                throw null;
            }
lbl72:
            // 2 sources

            case 4: {
                var2_2 /* !! */  = (int)lw.hzsc("iajj", hzry(int ), (int)180);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl82
            }
            case 5: {
                do {
                    var2_2 /* !! */  = (int)lw.hzsc("iajk", hzry(int ), (int)181);
                } while (!var3_1);
                throw null;
            }
lbl82:
            // 2 sources

            case 6: {
                var2_2 /* !! */  = (int)lw.hzsc("iajl", hzry(int ), (int)182);
                if (!var3_1) ** GOTO lbl64
                throw null;
            }
            case 7: 
        }
        var2_2 /* !! */  = (int)lw.hzsc("iajm", hzry(int ), (int)183);
        ** while (!var3_1)
lbl89:
        // 1 sources

        throw null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void reset(double d2, double d3, double d4, float f2, int n2) {
        block5: {
            block4: {
                boolean bl2 = c;
                int n3 = b;
                boolean bl3 = a;
                if (bl2) {
                    throw null;
                }
                if (bl3 || bl3) break block4;
                this.x = d2;
                if (bl3 || bl3) break block4;
                this.y = d3;
                if (bl3 || bl3) break block4;
                this.z = d4;
                if (bl3 || bl3) break block4;
                this.size = f2;
                if (bl3 || bl3) break block4;
                this.initialSize = f2;
                if (bl3 || bl3) break block4;
                this.maxLifetime = n2;
                if (bl3 || bl3) break block4;
                this.lifetime = n2;
                if (bl3 || bl3) break block4;
                this.vx = 0.0;
                if (bl3 || bl3) break block4;
                this.vy = 0.0;
                if (bl3 || bl3) break block4;
                this.vz = 0.0;
                if (bl3 || bl3) break block4;
                this.rotationY = RANDOM.nextFloat() * lw.hzsc("hztf", hzsz(int ), (int)4);
                if (bl3 || bl3) break block4;
                this.rotationX = RANDOM.nextFloat() * lw.hzsc("hzth", hzsz(int ), (int)5);
                if (bl3 || bl3) break block4;
                this.rotationSpeedY = 0.0f;
                if (bl3 || bl3) break block4;
                this.rotationSpeedX = 0.0f;
                if (bl3 || bl3) break block4;
                this.phase = RANDOM.nextFloat() * lw.hzsc("hztk", hzsz(int ), (int)6) * 2.0f;
                if (bl3 || bl3) break block4;
                this.spiralAngle = RANDOM.nextFloat() * lw.hzsc("hztp", hzsz(int ), (int)7) * 2.0f;
                if (bl3 || bl3) break block4;
                this.spiralRadius = 0.0f;
                if (!bl3 && !bl3) break block5;
            }
            return;
        }
    }

    private static /* synthetic */ int hzry(int n2) {
        return hzrz[n2] ^ hzsa[n2];
    }

    private static /* synthetic */ void iaxu() {
        lw.hzwj[0] = 1240099221345973487L;
        lw.hzwj[1] = 4334727123208919053L;
        lw.hzwj[2] = 4434093391035268865L;
        lw.hzwj[3] = 2524186153889365376L;
        lw.hzwj[4] = -5988283964480797607L;
        lw.hzwj[5] = 2671752221783434678L;
        lw.hzwj[6] = 7417032831271149488L;
        lw.hzwj[7] = -8930792732591658688L;
        lw.hzwj[8] = -1799445800210288803L;
        lw.hzwj[9] = -7634758176129181343L;
        lw.hzwj[10] = 5476399083054281039L;
        lw.hzwj[11] = 2026842154591172413L;
        lw.hzwj[12] = 7714177913122606031L;
        lw.hzwj[13] = -8632789353138798513L;
        lw.hzwj[14] = 4773166817215993621L;
        lw.hzwj[15] = 3122974687191634787L;
        lw.hzwj[16] = -2403168088413720160L;
        lw.hzwj[17] = 9015017557900678535L;
        lw.hzwj[18] = -7330057282868573903L;
        lw.hzwj[19] = -537875324956530102L;
        lw.hzwj[20] = 1317489071459418746L;
        lw.hzwj[21] = 7710002300517802228L;
        lw.hzwj[22] = -7223196135583828585L;
        lw.hzwj[23] = -1774955283565458975L;
        lw.hzwj[24] = 3182110757461463074L;
        lw.hzwj[25] = 3740019486800185018L;
        lw.hzwj[26] = -6785067355822692855L;
        lw.hzwj[27] = -2838712640160591826L;
        lw.hzwj[28] = 4607673466621128518L;
        lw.hzwj[29] = 4936727724038943957L;
        lw.hzwj[30] = -6584422855800769581L;
        lw.hzwj[31] = -8333697824640850792L;
        lw.hzwj[32] = -3727870438883867175L;
        lw.hzwj[33] = 441131712519619367L;
        lw.hzwj[34] = 5765250426447396631L;
        lw.hzwj[35] = 218411002119331084L;
        lw.hzwj[36] = -8006125039574808943L;
        lw.hzwj[37] = -2026651434256985996L;
        lw.hzwj[38] = 8469574613909414425L;
        lw.hzwj[39] = 2135033402899902339L;
        lw.hzwj[40] = -7359559423973369633L;
        lw.hzwj[41] = 3041280509733637840L;
        lw.hzwj[42] = -340200574601384725L;
        lw.hzwj[43] = -4412762577907853494L;
        lw.hzwj[44] = 5165585048598225798L;
        lw.hzwj[45] = -1661068646346237345L;
        lw.hzwj[46] = 4787379248527634694L;
        lw.hzwj[47] = -2507310353548372609L;
        lw.hzwj[48] = 6003818999907006736L;
        lw.hzwj[49] = 698987366276068556L;
        lw.hzwj[50] = -4502224257507586628L;
        lw.hzwj[51] = -4123217533220009855L;
        lw.hzwj[52] = 6745972992919537532L;
        lw.hzwj[53] = -7115325724493884978L;
        lw.hzwj[54] = -6386697874814513277L;
        lw.hzwj[55] = 3787631744221238605L;
        lw.hzwj[56] = -9102403551723929373L;
        lw.hzwj[57] = 2859346200729303466L;
        lw.hzwj[58] = 7534320776067331183L;
        lw.hzwj[59] = -8884428741638103358L;
        lw.hzwj[60] = -9119652927791084197L;
        lw.hzwj[61] = -7418640904925663798L;
        lw.hzwj[62] = -8379206404426278290L;
        lw.hzwj[63] = 1842016375863381791L;
        lw.hzwj[64] = -7258330542153633907L;
        lw.hzwj[65] = -1562785084121113166L;
        lw.hzwj[66] = -3393351276348144720L;
        lw.hzwj[67] = 2615585021673314790L;
        lw.hzwj[68] = -6154343741235210977L;
        lw.hzwj[69] = -771797021513315166L;
        lw.hzwj[70] = 7684752117172182952L;
        lw.hzwj[71] = -3103783559008823925L;
        lw.hzwj[72] = -7590086211247498357L;
        lw.hzwj[73] = 999506488450919001L;
        lw.hzwj[74] = 7113066303557272246L;
        lw.hzwj[75] = -4507854107100401770L;
        lw.hzwj[76] = 4485370683994616235L;
        lw.hzwj[77] = -7353638487213996339L;
        lw.hzwj[78] = -1956909090160111237L;
        lw.hzwj[79] = -9042629631968275357L;
        lw.hzwj[80] = -2204477077454769158L;
        lw.hzwj[81] = -233486105552571347L;
        lw.hzwj[82] = -7254507921358244100L;
        lw.hzwj[83] = -2330426035478337212L;
        lw.hzwj[84] = -1636343475606231576L;
        lw.hzwj[85] = 4712278516426626961L;
        lw.hzwj[86] = -299975595764128199L;
        lw.hzwj[87] = -2003398429048472325L;
        lw.hzwj[88] = -426774873555395847L;
        lw.hzwj[89] = -6818422074941492654L;
        lw.hzwj[90] = -5515974858306678561L;
        lw.hzwj[91] = -3202827839670024522L;
        lw.hzwj[92] = -6083797393736434738L;
        lw.hzwj[93] = -6028371131825266998L;
        lw.hzwj[94] = 3240995060539979634L;
        lw.hzwj[95] = 24878122624092029L;
        lw.hzwj[96] = -1274341513579611757L;
        lw.hzwj[97] = -3511894326509703296L;
        lw.hzwj[98] = -2795758547855825455L;
        lw.hzwj[99] = -2641351206227071097L;
    }

    private static /* synthetic */ void iaze() {
        lw.hzwn[100] = 2476970319400452663L;
        lw.hzwn[101] = 8000070248156309775L;
        lw.hzwn[102] = -1445542471587190421L;
    }

    private static /* synthetic */ void iapa() {
        lw.hzrz[0] = -1948082928;
        lw.hzrz[1] = -1671784192;
        lw.hzrz[2] = 439268328;
        lw.hzrz[3] = -1233297697;
        lw.hzrz[4] = -2073643043;
        lw.hzrz[5] = 170561801;
        lw.hzrz[6] = -1639941000;
        lw.hzrz[7] = 1037688799;
        lw.hzrz[8] = -1259205550;
        lw.hzrz[9] = 241255432;
        lw.hzrz[10] = -762477119;
        lw.hzrz[11] = -1073728811;
        lw.hzrz[12] = 788865152;
        lw.hzrz[13] = -1289220416;
        lw.hzrz[14] = -1750756657;
        lw.hzrz[15] = -711987571;
        lw.hzrz[16] = -1794401880;
        lw.hzrz[17] = -1326886143;
        lw.hzrz[18] = 1598588336;
        lw.hzrz[19] = -229876459;
        lw.hzrz[20] = 1560339729;
        lw.hzrz[21] = -267305666;
        lw.hzrz[22] = 1872640917;
        lw.hzrz[23] = 850572676;
        lw.hzrz[24] = -515934620;
        lw.hzrz[25] = 1307650130;
        lw.hzrz[26] = 983400718;
        lw.hzrz[27] = -338835545;
        lw.hzrz[28] = -1850499702;
        lw.hzrz[29] = -10725651;
        lw.hzrz[30] = -1715338857;
        lw.hzrz[31] = -1339401115;
        lw.hzrz[32] = -1168689044;
        lw.hzrz[33] = -2077495378;
        lw.hzrz[34] = -1254158994;
        lw.hzrz[35] = -2073014183;
        lw.hzrz[36] = -666909067;
        lw.hzrz[37] = 210729605;
        lw.hzrz[38] = 889084483;
        lw.hzrz[39] = -173360312;
        lw.hzrz[40] = 52207085;
        lw.hzrz[41] = 1034831866;
        lw.hzrz[42] = -855105309;
        lw.hzrz[43] = 689616950;
        lw.hzrz[44] = 1251691775;
        lw.hzrz[45] = 846298636;
        lw.hzrz[46] = 1510236823;
        lw.hzrz[47] = -1012033606;
        lw.hzrz[48] = 1930828072;
        lw.hzrz[49] = -1423195676;
        lw.hzrz[50] = -358478481;
        lw.hzrz[51] = -1663883954;
        lw.hzrz[52] = 1040177853;
        lw.hzrz[53] = -1096488295;
        lw.hzrz[54] = 1935553068;
        lw.hzrz[55] = 1737315715;
        lw.hzrz[56] = 1270846318;
        lw.hzrz[57] = -143910538;
        lw.hzrz[58] = -503574210;
        lw.hzrz[59] = -1696329325;
        lw.hzrz[60] = 1992008146;
        lw.hzrz[61] = 971610735;
        lw.hzrz[62] = -1193578212;
        lw.hzrz[63] = 968609959;
        lw.hzrz[64] = 561661005;
        lw.hzrz[65] = -376095701;
        lw.hzrz[66] = -1521017307;
        lw.hzrz[67] = -2045437120;
        lw.hzrz[68] = 985492089;
        lw.hzrz[69] = 2124778046;
        lw.hzrz[70] = -1845383324;
        lw.hzrz[71] = -41167741;
        lw.hzrz[72] = 21927689;
        lw.hzrz[73] = 1842037220;
        lw.hzrz[74] = -564663350;
        lw.hzrz[75] = -1845375781;
        lw.hzrz[76] = 1668749658;
        lw.hzrz[77] = -310343902;
        lw.hzrz[78] = -528336574;
        lw.hzrz[79] = 702857011;
        lw.hzrz[80] = -1585312680;
        lw.hzrz[81] = -1560431380;
        lw.hzrz[82] = 671848106;
        lw.hzrz[83] = 429807234;
        lw.hzrz[84] = -426381779;
        lw.hzrz[85] = 1396366005;
        lw.hzrz[86] = 1769705572;
        lw.hzrz[87] = -1987729930;
        lw.hzrz[88] = -1830677479;
        lw.hzrz[89] = 533571832;
        lw.hzrz[90] = -2107797479;
        lw.hzrz[91] = -82505985;
        lw.hzrz[92] = -1952382596;
        lw.hzrz[93] = -1243792341;
        lw.hzrz[94] = 490466039;
        lw.hzrz[95] = 476082722;
        lw.hzrz[96] = 824601284;
        lw.hzrz[97] = 1592931418;
        lw.hzrz[98] = 1258453564;
        lw.hzrz[99] = 299285673;
    }

    private static /* synthetic */ long hzwi(int n2) {
        return hzwj[n2] ^ hzwn[n2];
    }

    private static /* synthetic */ void iapb() {
        lw.hzrz[100] = -540315838;
        lw.hzrz[101] = -2141942729;
        lw.hzrz[102] = 1468998441;
        lw.hzrz[103] = 1503617701;
        lw.hzrz[104] = -637532054;
        lw.hzrz[105] = -1429479052;
        lw.hzrz[106] = 1253634481;
        lw.hzrz[107] = -136731333;
        lw.hzrz[108] = 1756689652;
        lw.hzrz[109] = 1487808070;
        lw.hzrz[110] = -1065572749;
        lw.hzrz[111] = -385045420;
        lw.hzrz[112] = -2000574997;
        lw.hzrz[113] = -697045177;
        lw.hzrz[114] = -2071469725;
        lw.hzrz[115] = 1970589908;
        lw.hzrz[116] = 1142812738;
        lw.hzrz[117] = 29936534;
        lw.hzrz[118] = -2058728808;
        lw.hzrz[119] = 231450604;
        lw.hzrz[120] = -2063628994;
        lw.hzrz[121] = -1350474091;
        lw.hzrz[122] = -1018798707;
        lw.hzrz[123] = -840064682;
        lw.hzrz[124] = -1285064764;
        lw.hzrz[125] = -1186439947;
        lw.hzrz[126] = 1087486301;
        lw.hzrz[127] = -1533456073;
        lw.hzrz[128] = 866931118;
        lw.hzrz[129] = 997063775;
        lw.hzrz[130] = 789519113;
        lw.hzrz[131] = -827213742;
        lw.hzrz[132] = 441548085;
        lw.hzrz[133] = 693527947;
        lw.hzrz[134] = -1796577239;
        lw.hzrz[135] = -1053944124;
        lw.hzrz[136] = 1464141885;
        lw.hzrz[137] = -2033925822;
        lw.hzrz[138] = 109144545;
        lw.hzrz[139] = -1938346147;
        lw.hzrz[140] = -1263992314;
        lw.hzrz[141] = -1392937288;
        lw.hzrz[142] = 753540882;
        lw.hzrz[143] = 261813852;
        lw.hzrz[144] = 1272838327;
        lw.hzrz[145] = -1484478813;
        lw.hzrz[146] = 1911671165;
        lw.hzrz[147] = 649927699;
        lw.hzrz[148] = 1255693818;
        lw.hzrz[149] = -183677067;
        lw.hzrz[150] = 528356552;
        lw.hzrz[151] = 532409405;
        lw.hzrz[152] = -735916348;
        lw.hzrz[153] = -1755262376;
        lw.hzrz[154] = 1223427736;
        lw.hzrz[155] = -1083807262;
        lw.hzrz[156] = 2039189478;
        lw.hzrz[157] = 321247490;
        lw.hzrz[158] = 1818137050;
        lw.hzrz[159] = -1441156719;
        lw.hzrz[160] = -593776730;
        lw.hzrz[161] = -1245135535;
        lw.hzrz[162] = -1935085665;
        lw.hzrz[163] = 292093054;
        lw.hzrz[164] = -1260739124;
        lw.hzrz[165] = -1897467166;
        lw.hzrz[166] = -1600180586;
        lw.hzrz[167] = -350365831;
        lw.hzrz[168] = -1023928430;
        lw.hzrz[169] = -1905985959;
        lw.hzrz[170] = 94127497;
        lw.hzrz[171] = 588415986;
        lw.hzrz[172] = 1870413087;
        lw.hzrz[173] = -904328586;
        lw.hzrz[174] = 2082330970;
        lw.hzrz[175] = -1891708424;
        lw.hzrz[176] = -685729360;
        lw.hzrz[177] = -1978270615;
        lw.hzrz[178] = -1527014841;
        lw.hzrz[179] = 1721052038;
        lw.hzrz[180] = 1371972163;
        lw.hzrz[181] = -1818569452;
        lw.hzrz[182] = -416809339;
        lw.hzrz[183] = 1210627954;
        lw.hzrz[184] = -880679245;
        lw.hzrz[185] = 1044446140;
        lw.hzrz[186] = 1289731236;
        lw.hzrz[187] = -143553815;
        lw.hzrz[188] = 1259934986;
        lw.hzrz[189] = -211636889;
        lw.hzrz[190] = 857540157;
        lw.hzrz[191] = 1986991934;
        lw.hzrz[192] = -84686369;
        lw.hzrz[193] = 1780271777;
        lw.hzrz[194] = 1366495674;
        lw.hzrz[195] = 151967333;
        lw.hzrz[196] = -1584608656;
        lw.hzrz[197] = 1334179249;
        lw.hzrz[198] = 1177570334;
        lw.hzrz[199] = -606171163;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void update(float var1_1, float var2_2, float var3_3, float var4_4, float var5_5, int var6_6, float var7_7, float var8_8, float var9_9, double var10_10, double var12_11, double var14_12, float var16_13, float var17_14, float var18_15) {
        block189: {
            block188: {
                block187: {
                    block186: {
                        var31_16 = lw.c;
                        var30_17 /* !! */  = lw.b;
                        var29_18 = lw.a;
                        if (var31_16) {
                            throw null;
lbl6:
                            // 48 sources

                            return;
                        }
                        if (var29_18 || var29_18) ** GOTO lbl6
                        this.vx += (double)var7_7 * lw.hzsc("iaat", iaap(int ), (int)25);
                        if (var29_18 || var29_18) ** GOTO lbl6
                        this.vy += (double)var8_8 * lw.hzsc("iaav", iaap(int ), (int)26);
                        if (var29_18 || var29_18) ** GOTO lbl6
                        this.vz += (double)var9_9 * lw.hzsc("iaax", iaap(int ), (int)27);
                        if (var29_18 || var29_18) ** GOTO lbl6
                        this.vy -= (double)var1_1 * lw.hzsc("iabc", iaap(int ), (int)28);
                        if (var29_18 || var29_18) ** GOTO lbl6
                        if (var16_13 == 0.0f) break block186;
                        if (var29_18 || var29_18) ** GOTO lbl6
                        var19_19 = var10_10 - this.x;
                        if (var29_18 || var29_18) ** GOTO lbl6
                        var21_21 = var12_11 + 1.0 - this.y;
                        if (var29_18 || var29_18) ** GOTO lbl6
                        var23_22 = var14_12 - this.z;
                        if (var29_18 || var29_18) ** GOTO lbl6
                        var25_23 = Math.sqrt(var19_19 * var19_19 + var21_21 * var21_21 + var23_22 * var23_22);
                        if (var29_18 || var29_18) ** GOTO lbl6
                        if (!(var25_23 > lw.hzsc("iabh", iaap(int ), (int)29))) break block186;
                        if (var29_18 || var29_18) ** GOTO lbl6
                        var27_24 = (double)var16_13 * lw.hzsc("iabj", iaap(int ), (int)30) / Math.max(var25_23, 1.0);
                        if (var29_18 || var29_18) ** GOTO lbl6
                        this.vx += var19_19 * var27_24;
                        if (var29_18 || var29_18) ** GOTO lbl6
                        this.vy += var21_21 * var27_24;
                        if (var29_18 || var29_18) ** GOTO lbl6
                        this.vz += var23_22 * var27_24;
                        if (var29_18) ** GOTO lbl6
                    }
                    if (var29_18 || var29_18) ** GOTO lbl6
                    if (!(var18_15 > 0.0f)) break block187;
                    if (var29_18) ** GOTO lbl6
                    if (var17_14 == 0.0f) break block187;
                    if (var29_18 || var29_18) ** GOTO lbl6
                    this.spiralAngle = (float)((double)this.spiralAngle + (double)var17_14 * lw.hzsc("iabo", iaap(int ), (int)31));
                    if (var29_18 || var29_18) ** GOTO lbl6
                    this.spiralRadius = (float)((double)this.spiralRadius + (double)var18_15 * lw.hzsc("iabr", iaap(int ), (int)32));
                    if (var29_18 || var29_18) ** GOTO lbl6
                    var19_19 = Math.cos(this.spiralAngle) * (double)this.spiralRadius * lw.hzsc("iabv", iaap(int ), (int)33);
                    if (var29_18 || var29_18) ** GOTO lbl6
                    var21_21 = Math.sin(this.spiralAngle) * (double)this.spiralRadius * lw.hzsc("iacl", iaap(int ), (int)34);
                    if (var29_18 || var29_18) ** GOTO lbl6
                    this.vx += var19_19;
                    if (var29_18 || var29_18) ** GOTO lbl6
                    this.vz += var21_21;
                    if (var29_18) ** GOTO lbl6
                }
                if (var29_18 || var29_18) ** GOTO lbl6
                this.vx *= 1.0 - (double)var2_2;
                if (var29_18 || var29_18) ** GOTO lbl6
                this.vy *= 1.0 - (double)var2_2;
                if (var29_18 || var29_18) ** GOTO lbl6
                this.vz *= 1.0 - (double)var2_2;
                if (var29_18 || var29_18) ** GOTO lbl6
                if (!(var3_3 > 0.0f)) break block188;
                if (var29_18 || var29_18) ** GOTO lbl6
                this.vx += (lw.RANDOM.nextDouble() - lw.hzsc("iacv", iaap(int ), (int)35)) * (double)var3_3 * lw.hzsc("iacx", iaap(int ), (int)36);
                if (var29_18 || var29_18) ** GOTO lbl6
                this.vy += (lw.RANDOM.nextDouble() - lw.hzsc("iadb", iaap(int ), (int)37)) * (double)var3_3 * lw.hzsc("iadc", iaap(int ), (int)38);
                if (var29_18 || var29_18) ** GOTO lbl6
                this.vz += (lw.RANDOM.nextDouble() - lw.hzsc("iadg", iaap(int ), (int)39)) * (double)var3_3 * lw.hzsc("iadi", iaap(int ), (int)40);
                if (var29_18) ** GOTO lbl6
            }
            if (var29_18 || var29_18) ** GOTO lbl6
            this.x += this.vx;
            if (var29_18 || var29_18) ** GOTO lbl6
            this.y += this.vy;
            if (var29_18 || var29_18) ** GOTO lbl6
            this.z += this.vz;
            if (var29_18 || var29_18) ** GOTO lbl6
            if (!(var4_4 > 0.0f)) break block189;
            if (var29_18 || var29_18) ** GOTO lbl6
            var19_20 = (float)Math.sin((double)this.phase + (double)((float)(this.maxLifetime - this.lifetime) * var5_5) * lw.hzsc("iadu", iaap(int ), (int)41)) * var4_4 * lw.hzsc("iadw", hzsz(int ), (int)72);
            if (var29_18 || var29_18) ** GOTO lbl6
            switch (var6_6) {
                case 0: {
                    if (var29_18 || var29_18) ** GOTO lbl6
                    this.x += (double)var19_20;
                    if (var29_18) ** GOTO lbl6
                    if (!var31_16) break;
                    throw null;
                }
                case 1: {
                    if (var29_18 || var29_18) ** GOTO lbl6
                    this.y += (double)var19_20;
                    if (var29_18) ** GOTO lbl6
                    if (!var31_16) break;
                    throw null;
                }
                case 2: {
                    if (var29_18 || var29_18) ** GOTO lbl6
                    this.z += (double)var19_20;
                    if (var29_18) ** break;
                }
            }
        }
        if (var29_18 || var29_18) ** GOTO lbl6
        this.rotationY += this.rotationSpeedY;
        if (var30_17 /* !! */  == 0) ** GOTO lbl-1000
        switch (var30_17 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var29_18 || var29_18) ** GOTO lbl6
                this.rotationX += this.rotationSpeedX;
                if (var29_18 || var29_18) ** GOTO lbl6
                this.lifetime -= lw.hzsc("iady", hzry(int ), (int)73);
                if (!var29_18 && !var29_18) ** break;
                ** continue;
                return;
            }
            case 0: {
                var30_17 /* !! */  = (int)lw.hzsc("iaea", hzry(int ), (int)74);
                if (var31_16) {
                    throw null;
                }
                ** GOTO lbl279
            }
lbl118:
            // 2 sources

            case 1: {
                var30_17 /* !! */  = (int)lw.hzsc("iaeb", hzry(int ), (int)75);
                if (var31_16) {
                    throw null;
                }
                ** GOTO lbl338
            }
            case 2: {
                var30_17 /* !! */  = (int)lw.hzsc("iaed", hzry(int ), (int)76);
                if (var31_16) {
                    throw null;
                }
                ** GOTO lbl308
            }
lbl128:
            // 4 sources

            case 3: {
                var30_17 /* !! */  = (int)lw.hzsc("iaee", hzry(int ), (int)77);
                if (var31_16) {
                    throw null;
                }
                ** GOTO lbl182
            }
lbl133:
            // 2 sources

            case 4: {
                var30_17 /* !! */  = (int)lw.hzsc("iaef", hzry(int ), (int)78);
                if (var31_16) {
                    throw null;
                }
                ** GOTO lbl359
            }
            case 5: {
                var30_17 /* !! */  = (int)lw.hzsc("iaeg", hzry(int ), (int)79);
                if (var31_16) {
                    throw null;
                }
                ** GOTO lbl251
            }
            case 6: {
                var30_17 /* !! */  = (int)lw.hzsc("iaeh", hzry(int ), (int)80);
                if (var31_16) {
                    throw null;
                }
                ** GOTO lbl246
            }
lbl148:
            // 3 sources

            case 7: {
                var30_17 /* !! */  = (int)lw.hzsc("iaei", hzry(int ), (int)81);
                if (var31_16) {
                    throw null;
                }
            }
lbl152:
            // 4 sources

            case 8: {
                var30_17 /* !! */  = (int)lw.hzsc("iaek", hzry(int ), (int)82);
                if (var31_16) {
                    throw null;
                }
                ** GOTO lbl368
            }
lbl157:
            // 4 sources

            case 9: {
                var30_17 /* !! */  = (int)lw.hzsc("iaem", hzry(int ), (int)83);
                if (var31_16) {
                    throw null;
                }
                ** GOTO lbl206
            }
lbl162:
            // 2 sources

            case 10: {
                var30_17 /* !! */  = (int)lw.hzsc("iaen", hzry(int ), (int)84);
                if (var31_16) {
                    throw null;
                }
                ** GOTO lbl359
            }
lbl167:
            // 3 sources

            case 11: {
                var30_17 /* !! */  = (int)lw.hzsc("iaeo", hzry(int ), (int)85);
                if (var31_16) {
                    throw null;
                }
                ** GOTO lbl373
            }
lbl172:
            // 2 sources

            case 12: {
                var30_17 /* !! */  = (int)lw.hzsc("iaep", hzry(int ), (int)86);
                if (var31_16) {
                    throw null;
                }
                ** GOTO lbl496
            }
lbl177:
            // 2 sources

            case 13: {
                var30_17 /* !! */  = (int)lw.hzsc("iaer", hzry(int ), (int)87);
                if (var31_16) {
                    throw null;
                }
                ** GOTO lbl504
            }
lbl182:
            // 2 sources

            case 14: {
                var30_17 /* !! */  = (int)lw.hzsc("iaes", hzry(int ), (int)88);
                if (var31_16) {
                    throw null;
                }
                ** GOTO lbl496
            }
            case 15: {
                var30_17 /* !! */  = (int)lw.hzsc("iaet", hzry(int ), (int)89);
                if (var31_16) {
                    throw null;
                }
                ** GOTO lbl261
            }
lbl192:
            // 2 sources

            case 16: {
                var30_17 /* !! */  = (int)lw.hzsc("iaeu", hzry(int ), (int)90);
                if (var31_16) {
                    throw null;
                }
                ** GOTO lbl368
            }
lbl197:
            // 3 sources

            case 17: {
                var30_17 /* !! */  = (int)lw.hzsc("iaew", hzry(int ), (int)91);
                if (var31_16) {
                    throw null;
                }
            }
lbl201:
            // 4 sources

            case 18: {
                var30_17 /* !! */  = (int)lw.hzsc("iaey", hzry(int ), (int)92);
                if (var31_16) {
                    throw null;
                }
                ** GOTO lbl393
            }
lbl206:
            // 3 sources

            case 19: {
                var30_17 /* !! */  = (int)lw.hzsc("iaez", hzry(int ), (int)93);
                if (var31_16) {
                    throw null;
                }
                ** GOTO lbl419
            }
lbl211:
            // 2 sources

            case 20: {
                var30_17 /* !! */  = (int)lw.hzsc("iafa", hzry(int ), (int)94);
                if (var31_16) {
                    throw null;
                }
                ** GOTO lbl405
            }
lbl216:
            // 2 sources

            case 21: {
                var30_17 /* !! */  = (int)lw.hzsc("iafc", hzry(int ), (int)95);
                if (var31_16) {
                    throw null;
                }
                ** GOTO lbl293
            }
lbl221:
            // 2 sources

            case 22: {
                var30_17 /* !! */  = (int)lw.hzsc("iaff", hzry(int ), (int)96);
                if (var31_16) {
                    throw null;
                }
                ** GOTO lbl256
            }
            case 23: {
                var30_17 /* !! */  = (int)lw.hzsc("iafh", hzry(int ), (int)97);
                if (var31_16) {
                    throw null;
                }
                ** GOTO lbl293
            }
lbl231:
            // 2 sources

            case 24: {
                var30_17 /* !! */  = (int)lw.hzsc("iafi", hzry(int ), (int)98);
                if (var31_16) {
                    throw null;
                }
                ** GOTO lbl512
            }
            case 25: {
                var30_17 /* !! */  = (int)lw.hzsc("iafj", hzry(int ), (int)99);
                if (var31_16) {
                    throw null;
                }
                ** GOTO lbl521
            }
lbl241:
            // 2 sources

            case 26: {
                var30_17 /* !! */  = (int)lw.hzsc("iafl", hzry(int ), (int)100);
                if (var31_16) {
                    throw null;
                }
                ** GOTO lbl471
            }
lbl246:
            // 2 sources

            case 27: {
                var30_17 /* !! */  = (int)lw.hzsc("iafm", hzry(int ), (int)101);
                if (var31_16) {
                    throw null;
                }
                ** GOTO lbl433
            }
lbl251:
            // 3 sources

            case 28: {
                var30_17 /* !! */  = (int)lw.hzsc("iafn", hzry(int ), (int)102);
                if (var31_16) {
                    throw null;
                }
                ** GOTO lbl393
            }
lbl256:
            // 2 sources

            case 29: {
                var30_17 /* !! */  = (int)lw.hzsc("iafq", hzry(int ), (int)103);
                if (var31_16) {
                    throw null;
                }
                ** GOTO lbl487
            }
lbl261:
            // 3 sources

            case 30: {
                var30_17 /* !! */  = (int)lw.hzsc("iafr", hzry(int ), (int)104);
                if (var31_16) {
                    throw null;
                }
                ** GOTO lbl516
            }
            case 31: {
                var30_17 /* !! */  = (int)lw.hzsc("iafs", hzry(int ), (int)105);
                if (!var31_16) ** GOTO lbl201
                throw null;
            }
lbl270:
            // 2 sources

            case 32: {
                var30_17 /* !! */  = (int)lw.hzsc("iafu", hzry(int ), (int)106);
                if (!var31_16) ** GOTO lbl157
                throw null;
            }
            case 33: {
                var30_17 /* !! */  = (int)lw.hzsc("iafv", hzry(int ), (int)107);
                if (var31_16) {
                    throw null;
                }
                ** GOTO lbl351
            }
lbl279:
            // 2 sources

            case 34: {
                var30_17 /* !! */  = (int)lw.hzsc("iafy", hzry(int ), (int)108);
                if (var31_16) {
                    throw null;
                }
                ** GOTO lbl368
            }
lbl284:
            // 2 sources

            case 35: {
                var30_17 /* !! */  = (int)lw.hzsc("iafz", hzry(int ), (int)109);
                if (!var31_16) ** GOTO lbl197
                throw null;
            }
            case 36: {
                var30_17 /* !! */  = (int)lw.hzsc("iaga", hzry(int ), (int)110);
                if (var31_16) {
                    throw null;
                }
                ** GOTO lbl450
            }
lbl293:
            // 3 sources

            case 37: {
                var30_17 /* !! */  = (int)lw.hzsc("iagc", hzry(int ), (int)111);
                if (var31_16) {
                    throw null;
                }
                ** GOTO lbl496
            }
lbl298:
            // 2 sources

            case 38: {
                var30_17 /* !! */  = (int)lw.hzsc("iagd", hzry(int ), (int)112);
                if (var31_16) {
                    throw null;
                }
                ** GOTO lbl329
            }
            case 39: {
                var30_17 /* !! */  = (int)lw.hzsc("iage", hzry(int ), (int)113);
                if (var31_16) {
                    throw null;
                }
                ** GOTO lbl512
            }
lbl308:
            // 2 sources

            case 40: {
                var30_17 /* !! */  = (int)lw.hzsc("iagg", hzry(int ), (int)114);
                if (!var31_16) ** GOTO lbl192
                throw null;
            }
            case 41: {
                var30_17 /* !! */  = (int)lw.hzsc("iagi", hzry(int ), (int)115);
                if (!var31_16) ** GOTO lbl177
                throw null;
            }
            case 42: {
                var30_17 /* !! */  = (int)lw.hzsc("iagk", hzry(int ), (int)116);
                if (var31_16) {
                    throw null;
                }
                ** GOTO lbl343
            }
            case 43: {
                var30_17 /* !! */  = (int)lw.hzsc("iagl", hzry(int ), (int)117);
                if (!var31_16) ** GOTO lbl152
                throw null;
            }
lbl325:
            // 3 sources

            case 44: {
                var30_17 /* !! */  = (int)lw.hzsc("iagm", hzry(int ), (int)118);
                if (!var31_16) ** GOTO lbl284
                throw null;
            }
lbl329:
            // 2 sources

            case 45: {
                var30_17 /* !! */  = (int)lw.hzsc("iagn", hzry(int ), (int)119);
                if (!var31_16) ** GOTO lbl211
                throw null;
            }
            case 46: {
                var30_17 /* !! */  = (int)lw.hzsc("iago", hzry(int ), (int)120);
                if (var31_16) {
                    throw null;
                }
                ** GOTO lbl347
            }
lbl338:
            // 2 sources

            case 47: {
                var30_17 /* !! */  = (int)lw.hzsc("iagp", hzry(int ), (int)121);
                if (var31_16) {
                    throw null;
                }
                ** GOTO lbl401
            }
lbl343:
            // 2 sources

            case 48: {
                var30_17 /* !! */  = (int)lw.hzsc("iagr", hzry(int ), (int)122);
                if (!var31_16) ** GOTO lbl251
                throw null;
            }
lbl347:
            // 3 sources

            case 49: {
                var30_17 /* !! */  = (int)lw.hzsc("iags", hzry(int ), (int)123);
                if (!var31_16) ** GOTO lbl325
                throw null;
            }
lbl351:
            // 3 sources

            case 50: {
                var30_17 /* !! */  = (int)lw.hzsc("iagu", hzry(int ), (int)124);
                if (!var31_16) ** GOTO lbl133
                throw null;
            }
            case 51: {
                var30_17 /* !! */  = (int)lw.hzsc("iagv", hzry(int ), (int)125);
                if (!var31_16) ** GOTO lbl157
                throw null;
            }
lbl359:
            // 3 sources

            case 52: {
                var30_17 /* !! */  = (int)lw.hzsc("iagw", hzry(int ), (int)126);
                if (!var31_16) ** GOTO lbl347
                throw null;
            }
            case 53: {
                var30_17 /* !! */  = (int)lw.hzsc("iagx", hzry(int ), (int)127);
                if (var31_16) {
                    throw null;
                }
                ** GOTO lbl429
            }
lbl368:
            // 4 sources

            case 54: {
                var30_17 /* !! */  = (int)lw.hzsc("iagy", hzry(int ), (int)128);
                if (var31_16) {
                    throw null;
                }
                ** GOTO lbl479
            }
lbl373:
            // 2 sources

            case 55: {
                var30_17 /* !! */  = (int)lw.hzsc("iaha", hzry(int ), (int)129);
                if (!var31_16) ** GOTO lbl148
                throw null;
            }
            case 56: {
                var30_17 /* !! */  = (int)lw.hzsc("iahc", hzry(int ), (int)130);
                if (!var31_16) ** GOTO lbl118
                throw null;
            }
lbl381:
            // 2 sources

            case 57: {
                var30_17 /* !! */  = (int)lw.hzsc("iahd", hzry(int ), (int)131);
                if (!var31_16) ** GOTO lbl148
                throw null;
            }
            case 58: {
                var30_17 /* !! */  = (int)lw.hzsc("iahf", hzry(int ), (int)132);
                if (!var31_16) ** GOTO lbl298
                throw null;
            }
lbl389:
            // 2 sources

            case 59: {
                var30_17 /* !! */  = (int)lw.hzsc("iahg", hzry(int ), (int)133);
                if (!var31_16) ** GOTO lbl231
                throw null;
            }
lbl393:
            // 4 sources

            case 60: {
                var30_17 /* !! */  = (int)lw.hzsc("iahh", hzry(int ), (int)134);
                if (!var31_16) ** GOTO lbl206
                throw null;
            }
            case 61: {
                var30_17 /* !! */  = (int)lw.hzsc("iahi", hzry(int ), (int)135);
                if (!var31_16) ** GOTO lbl128
                throw null;
            }
lbl401:
            // 2 sources

            case 62: {
                var30_17 /* !! */  = (int)lw.hzsc("iahl", hzry(int ), (int)136);
                if (!var31_16) ** GOTO lbl270
                throw null;
            }
lbl405:
            // 2 sources

            case 63: {
                var30_17 /* !! */  = (int)lw.hzsc("iahm", hzry(int ), (int)137);
                if (!var31_16) ** GOTO lbl172
                throw null;
            }
            case 64: {
                var30_17 /* !! */  = (int)lw.hzsc("iahn", hzry(int ), (int)138);
                if (var31_16) {
                    throw null;
                }
                ** GOTO lbl424
            }
            case 65: {
                var30_17 /* !! */  = (int)lw.hzsc("iaho", hzry(int ), (int)139);
                if (var31_16) {
                    throw null;
                }
                ** GOTO lbl479
            }
lbl419:
            // 3 sources

            case 66: {
                var30_17 /* !! */  = (int)lw.hzsc("iahp", hzry(int ), (int)140);
                if (var31_16) {
                    throw null;
                }
                ** GOTO lbl508
            }
lbl424:
            // 3 sources

            case 67: {
                var30_17 /* !! */  = (int)lw.hzsc("iahq", hzry(int ), (int)141);
                if (var31_16) {
                    throw null;
                }
                ** GOTO lbl471
            }
lbl429:
            // 2 sources

            case 68: {
                var30_17 /* !! */  = (int)lw.hzsc("iahr", hzry(int ), (int)142);
                if (!var31_16) break;
                throw null;
            }
lbl433:
            // 3 sources

            case 69: {
                var30_17 /* !! */  = (int)lw.hzsc("iahs", hzry(int ), (int)143);
                if (var31_16) {
                    throw null;
                }
                ** GOTO lbl458
            }
            case 70: {
                var30_17 /* !! */  = (int)lw.hzsc("iaht", hzry(int ), (int)144);
                if (!var31_16) ** GOTO lbl128
                throw null;
            }
            case 71: {
                var30_17 /* !! */  = (int)lw.hzsc("iahu", hzry(int ), (int)145);
                if (!var31_16) ** GOTO lbl216
                throw null;
            }
            case 72: {
                var30_17 /* !! */  = (int)lw.hzsc("iahv", hzry(int ), (int)146);
                if (!var31_16) ** GOTO lbl157
                throw null;
            }
lbl450:
            // 2 sources

            case 73: {
                var30_17 /* !! */  = (int)lw.hzsc("iahw", hzry(int ), (int)147);
                if (!var31_16) ** GOTO lbl167
                throw null;
            }
            case 74: {
                var30_17 /* !! */  = (int)lw.hzsc("iahx", hzry(int ), (int)148);
                if (!var31_16) ** GOTO lbl167
                throw null;
            }
lbl458:
            // 2 sources

            case 75: {
                var30_17 /* !! */  = (int)lw.hzsc("iahy", hzry(int ), (int)149);
                if (!var31_16) ** GOTO lbl128
                throw null;
            }
            case 76: {
                var30_17 /* !! */  = (int)lw.hzsc("iahz", hzry(int ), (int)150);
                if (var31_16) {
                    throw null;
                }
                ** GOTO lbl508
            }
            case 77: {
                var30_17 /* !! */  = (int)lw.hzsc("iaia", hzry(int ), (int)151);
                if (!var31_16) ** GOTO lbl351
                throw null;
            }
lbl471:
            // 3 sources

            case 78: {
                var30_17 /* !! */  = (int)lw.hzsc("iaib", hzry(int ), (int)152);
                if (!var31_16) ** GOTO lbl241
                throw null;
            }
            case 79: {
                var30_17 /* !! */  = (int)lw.hzsc("iaic", hzry(int ), (int)153);
                if (!var31_16) ** GOTO lbl325
                throw null;
            }
lbl479:
            // 3 sources

            case 80: {
                var30_17 /* !! */  = (int)lw.hzsc("iaid", hzry(int ), (int)154);
                if (!var31_16) ** GOTO lbl162
                throw null;
            }
lbl483:
            // 2 sources

            case 81: {
                var30_17 /* !! */  = (int)lw.hzsc("iaie", hzry(int ), (int)155);
                if (!var31_16) ** GOTO lbl393
                throw null;
            }
lbl487:
            // 2 sources

            case 82: {
                var30_17 /* !! */  = (int)lw.hzsc("iaif", hzry(int ), (int)156);
                if (var31_16) {
                    throw null;
                }
                ** GOTO lbl525
            }
            case 83: {
                var30_17 /* !! */  = (int)lw.hzsc("iaig", hzry(int ), (int)157);
                if (!var31_16) ** GOTO lbl261
                throw null;
            }
lbl496:
            // 4 sources

            case 84: {
                var30_17 /* !! */  = (int)lw.hzsc("iaih", hzry(int ), (int)158);
                if (!var31_16) ** GOTO lbl197
                throw null;
            }
            case 85: {
                var30_17 /* !! */  = (int)lw.hzsc("iaii", hzry(int ), (int)159);
                if (!var31_16) ** GOTO lbl381
                throw null;
            }
lbl504:
            // 2 sources

            case 86: {
                var30_17 /* !! */  = (int)lw.hzsc("iaij", hzry(int ), (int)160);
                if (!var31_16) ** GOTO lbl419
                throw null;
            }
lbl508:
            // 3 sources

            case 87: {
                var30_17 /* !! */  = (int)lw.hzsc("iaik", hzry(int ), (int)161);
                if (!var31_16) ** GOTO lbl433
                throw null;
            }
lbl512:
            // 3 sources

            case 88: {
                var30_17 /* !! */  = (int)lw.hzsc("iail", hzry(int ), (int)162);
                if (!var31_16) ** GOTO lbl483
                throw null;
            }
lbl516:
            // 2 sources

            case 89: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var30_17 /* !! */  = (int)lw.hzsc("iaim", hzry(int ), (int)163);
                    if (!var31_16) ** GOTO lbl424
                    throw null;
                }
            }
lbl521:
            // 2 sources

            case 90: {
                var30_17 /* !! */  = (int)lw.hzsc("iain", hzry(int ), (int)164);
                if (!var31_16) ** GOTO lbl221
                throw null;
            }
lbl525:
            // 2 sources

            case 91: {
                var30_17 /* !! */  = (int)lw.hzsc("iaio", hzry(int ), (int)165);
                if (!var31_16) ** GOTO lbl389
                throw null;
            }
            case 92: 
        }
        var30_17 /* !! */  = (int)lw.hzsc("iaip", hzry(int ), (int)166);
        ** while (!var31_16)
lbl532:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void iapc() {
        lw.hzrz[200] = -364117462;
        lw.hzrz[201] = 2110194306;
        lw.hzrz[202] = 1641337524;
        lw.hzrz[203] = 1623879887;
        lw.hzrz[204] = -2133002970;
        lw.hzrz[205] = 1210575989;
        lw.hzrz[206] = 233699518;
        lw.hzrz[207] = -1875037229;
        lw.hzrz[208] = -464347103;
        lw.hzrz[209] = 1740619785;
        lw.hzrz[210] = 415804300;
        lw.hzrz[211] = 549554492;
        lw.hzrz[212] = 191549302;
        lw.hzrz[213] = -432441830;
        lw.hzrz[214] = -1023457796;
        lw.hzrz[215] = 1642352566;
        lw.hzrz[216] = -485812373;
        lw.hzrz[217] = 1438430988;
        lw.hzrz[218] = 1959265651;
        lw.hzrz[219] = 160581785;
        lw.hzrz[220] = 1316258641;
        lw.hzrz[221] = -2124678029;
        lw.hzrz[222] = 422486311;
        lw.hzrz[223] = 951217032;
        lw.hzrz[224] = -2112654918;
        lw.hzrz[225] = 504530248;
        lw.hzrz[226] = -2035399184;
        lw.hzrz[227] = 1449933859;
        lw.hzrz[228] = -1503624280;
        lw.hzrz[229] = 523982515;
        lw.hzrz[230] = 326566267;
        lw.hzrz[231] = 514205872;
        lw.hzrz[232] = 1767466199;
        lw.hzrz[233] = -1402464074;
        lw.hzrz[234] = -1616610194;
        lw.hzrz[235] = 647276615;
        lw.hzrz[236] = 773373002;
        lw.hzrz[237] = -527802225;
        lw.hzrz[238] = 1589024435;
        lw.hzrz[239] = 731312894;
        lw.hzrz[240] = -1254301049;
        lw.hzrz[241] = -955197418;
        lw.hzrz[242] = -1615337876;
        lw.hzrz[243] = -488696628;
        lw.hzrz[244] = 541533527;
        lw.hzrz[245] = 1608715732;
        lw.hzrz[246] = 267118045;
        lw.hzrz[247] = 1165530808;
        lw.hzrz[248] = -1379224860;
        lw.hzrz[249] = -1136687453;
        lw.hzrz[250] = -112446450;
        lw.hzrz[251] = -1071365499;
        lw.hzrz[252] = 1197770129;
        lw.hzrz[253] = 1050486998;
        lw.hzrz[254] = -685666398;
        lw.hzrz[255] = -64314432;
        lw.hzrz[256] = -476930231;
        lw.hzrz[257] = -1104287393;
        lw.hzrz[258] = -1553537333;
        lw.hzrz[259] = -1490825765;
        lw.hzrz[260] = 492346732;
        lw.hzrz[261] = -1989969902;
        lw.hzrz[262] = -1213529738;
        lw.hzrz[263] = -79184808;
        lw.hzrz[264] = 2106550127;
        lw.hzrz[265] = 1664769666;
        lw.hzrz[266] = 192327064;
        lw.hzrz[267] = 403545634;
        lw.hzrz[268] = 1150329556;
        lw.hzrz[269] = 484277779;
        lw.hzrz[270] = 781128237;
        lw.hzrz[271] = -743058121;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static float smooth(float var0) {
        v0 /* !! */  = lw.pf;
        if (true) ** GOTO lbl5
        block26: while (true) {
            v0 /* !! */  = (long)(v1 - lw.hzsc("iald", hzwi(int ), (int)60));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -914710331: {
                    v1 = lw.hzsc("iale", hzwi(int ), (int)61);
                    continue block26;
                }
                case -670804038: {
                    v1 = lw.hzsc("ialf", hzwi(int ), (int)62);
                    continue block26;
                }
                case 425353332: {
                    break block26;
                }
                case 1941558916: {
                    v1 = lw.hzsc("ialg", hzwi(int ), (int)63);
                    continue block26;
                }
            }
            break;
        }
        var4_1 = lw.c;
        v2 /* !! */  = lw.pf;
        if (true) ** GOTO lbl22
        block27: while (true) {
            v2 /* !! */  = (long)(lw.hzsc("iali", hzwi(int ), (int)65) - lw.hzsc("ialh", hzwi(int ), (int)64));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -930580830: {
                    continue block27;
                }
                case 425353332: {
                    break block27;
                }
            }
            break;
        }
        var3_2 /* !! */  = lw.b;
        v3 /* !! */  = lw.pf;
        if (true) ** GOTO lbl32
        block28: while (true) {
            v3 /* !! */  = (long)(lw.hzsc("ialk", hzwi(int ), (int)67) - lw.hzsc("ialj", hzwi(int ), (int)66));
lbl32:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1463484422: {
                    continue block28;
                }
                case 425353332: {
                    break block28;
                }
            }
            break;
        }
        var2_3 = lw.a;
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_1) {
                    throw null;
lbl43:
                    // 2 sources

                    return (float)lw.hzsc("iall", hzsz(int ), (int)214);
                }
                if (var2_3 || var2_3) ** GOTO lbl43
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_0 = lw.pf - lw.hzsc("ialm", hzwi(int ), (int)68)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == lw.hzsc("ialn", hzry(int ), (int)215)) break;
                    v4 /* !! */  = (long)lw.hzsc("ialo", hzry(int ), (int)216);
                }
                v5 = Math.min(1.0f, var0);
                v6 /* !! */  = lw.pf;
                if (true) ** GOTO lbl56
                block31: while (true) {
                    v6 /* !! */  = (long)(lw.hzsc("ialq", hzwi(int ), (int)70) - lw.hzsc("ialp", hzwi(int ), (int)69));
lbl56:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -694151539: {
                            continue block31;
                        }
                        case 425353332: {
                            break block31;
                        }
                    }
                    break;
                }
                var1_4 = Math.max(0.0f, v5);
                if (var2_3 || var2_3) ** continue;
                return var1_4 * var1_4 * (lw.hzsc("ialr", hzsz(int ), (int)217) - 2.0f * var1_4);
            }
lbl64:
            // 2 sources

            case 0: {
                var3_2 /* !! */  = (int)lw.hzsc("ials", hzry(int ), (int)218);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl74
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var3_2 /* !! */  = (int)lw.hzsc("ialt", hzry(int ), (int)219);
                    if (!var4_1) ** GOTO lbl-1000
                    throw null;
                }
            }
lbl74:
            // 2 sources

            case 2: {
                var3_2 /* !! */  = (int)lw.hzsc("ialu", hzry(int ), (int)220);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl83
            }
            case 3: {
                var3_2 /* !! */  = (int)lw.hzsc("ialv", hzry(int ), (int)221);
                if (!var4_1) break;
                throw null;
            }
lbl83:
            // 2 sources

            case 4: {
                var3_2 /* !! */  = (int)lw.hzsc("ialw", hzry(int ), (int)222);
                if (!var4_1) ** GOTO lbl64
                throw null;
            }
            case 5: 
        }
        var3_2 /* !! */  = (int)lw.hzsc("ialx", hzry(int ), (int)223);
        ** while (!var4_1)
lbl90:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void iapd() {
        lw.hzsa[0] = -1948082928;
        lw.hzsa[1] = -1671784191;
        lw.hzsa[2] = 439268328;
        lw.hzsa[3] = -1233297698;
        lw.hzsa[4] = -942491683;
        lw.hzsa[5] = 1235128585;
        lw.hzsa[6] = -569805917;
        lw.hzsa[7] = 2106642436;
        lw.hzsa[8] = -1259205562;
        lw.hzsa[9] = 241255454;
        lw.hzsa[10] = -762477100;
        lw.hzsa[11] = -1073728815;
        lw.hzsa[12] = 788865153;
        lw.hzsa[13] = -1289220392;
        lw.hzsa[14] = -1750756662;
        lw.hzsa[15] = -711987579;
        lw.hzsa[16] = -1794401888;
        lw.hzsa[17] = -1326886123;
        lw.hzsa[18] = 1598588331;
        lw.hzsa[19] = -229876454;
        lw.hzsa[20] = 1560339735;
        lw.hzsa[21] = -267305680;
        lw.hzsa[22] = 1872640919;
        lw.hzsa[23] = 850572697;
        lw.hzsa[24] = -515934597;
        lw.hzsa[25] = 1307650163;
        lw.hzsa[26] = 983400716;
        lw.hzsa[27] = -338835544;
        lw.hzsa[28] = -1850499700;
        lw.hzsa[29] = -10725687;
        lw.hzsa[30] = -1715338869;
        lw.hzsa[31] = -1339401112;
        lw.hzsa[32] = -1168689035;
        lw.hzsa[33] = -2077495368;
        lw.hzsa[34] = -1254158981;
        lw.hzsa[35] = -2073014147;
        lw.hzsa[36] = -666909103;
        lw.hzsa[37] = 210729613;
        lw.hzsa[38] = 889084494;
        lw.hzsa[39] = -173360275;
        lw.hzsa[40] = 52207089;
        lw.hzsa[41] = 1034831832;
        lw.hzsa[42] = -855105310;
        lw.hzsa[43] = 689616942;
        lw.hzsa[44] = 1251691740;
        lw.hzsa[45] = 846298650;
        lw.hzsa[46] = 1510236822;
        lw.hzsa[47] = 1586871741;
        lw.hzsa[48] = 1930828073;
        lw.hzsa[49] = -1323390065;
        lw.hzsa[50] = -358478482;
        lw.hzsa[51] = -311017170;
        lw.hzsa[52] = 1040177853;
        lw.hzsa[53] = -1096488292;
        lw.hzsa[54] = 1935553060;
        lw.hzsa[55] = 1737315715;
        lw.hzsa[56] = 1270846313;
        lw.hzsa[57] = -143910544;
        lw.hzsa[58] = -503574212;
        lw.hzsa[59] = -1696329326;
        lw.hzsa[60] = 1992008149;
        lw.hzsa[61] = 971610733;
        lw.hzsa[62] = 1193578211;
        lw.hzsa[63] = 693754158;
        lw.hzsa[64] = 561661006;
        lw.hzsa[65] = -376095704;
        lw.hzsa[66] = -1521017308;
        lw.hzsa[67] = -2045437115;
        lw.hzsa[68] = 985492095;
        lw.hzsa[69] = 2124778044;
        lw.hzsa[70] = -1845383327;
        lw.hzsa[71] = -41167741;
        lw.hzsa[72] = 1015176132;
        lw.hzsa[73] = 1842037221;
        lw.hzsa[74] = -564663321;
        lw.hzsa[75] = -1845375793;
        lw.hzsa[76] = 1668749665;
        lw.hzsa[77] = -310343921;
        lw.hzsa[78] = -528336540;
        lw.hzsa[79] = 702856993;
        lw.hzsa[80] = -1585312666;
        lw.hzsa[81] = -1560431429;
        lw.hzsa[82] = 671848076;
        lw.hzsa[83] = 429807276;
        lw.hzsa[84] = -426381718;
        lw.hzsa[85] = 1396365983;
        lw.hzsa[86] = 1769705542;
        lw.hzsa[87] = -1987729970;
        lw.hzsa[88] = -1830677442;
        lw.hzsa[89] = 533571813;
        lw.hzsa[90] = -2107797493;
        lw.hzsa[91] = -82506071;
        lw.hzsa[92] = -1952382673;
        lw.hzsa[93] = -1243792354;
        lw.hzsa[94] = 490465996;
        lw.hzsa[95] = 476082746;
        lw.hzsa[96] = 824601223;
        lw.hzsa[97] = 1592931445;
        lw.hzsa[98] = 1258453523;
        lw.hzsa[99] = 299285674;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void setRotationSpeed(float var1_1, float var2_2) {
        v0 /* !! */  = lw.pf;
        if (true) ** GOTO lbl5
        block29: while (true) {
            v0 /* !! */  = (long)(v1 - lw.hzsc("hzyv", hzwi(int ), (int)13));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -812548162: {
                    v1 = lw.hzsc("hzyy", hzwi(int ), (int)14);
                    continue block29;
                }
                case 425353332: {
                    break block29;
                }
                case 1708000386: {
                    v1 = lw.hzsc("hzza", hzwi(int ), (int)15);
                    continue block29;
                }
            }
            break;
        }
        var5_3 = lw.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = lw.pf - lw.hzsc("hzzb", hzwi(int ), (int)16)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == lw.hzsc("hzzc", hzry(int ), (int)62)) break;
            v2 /* !! */  = (long)lw.hzsc("hzzd", hzry(int ), (int)63);
        }
        var4_4 /* !! */  = lw.b;
        v3 /* !! */  = lw.pf;
        if (true) ** GOTO lbl26
        block31: while (true) {
            v3 /* !! */  = (long)(v4 - lw.hzsc("hzze", hzwi(int ), (int)17));
lbl26:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1291322176: {
                    v4 = lw.hzsc("hzzf", hzwi(int ), (int)18);
                    continue block31;
                }
                case 37784736: {
                    v4 = lw.hzsc("hzzi", hzwi(int ), (int)19);
                    continue block31;
                }
                case 425353332: {
                    break block31;
                }
            }
            break;
        }
        var3_5 = lw.a;
        if (var5_3) {
            throw null;
lbl38:
            // 3 sources

            return;
        }
        if (var3_5 || var3_5) ** GOTO lbl38
        if (var4_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v5 /* !! */  = lw.pf;
                if (true) ** GOTO lbl48
                block33: while (true) {
                    v5 /* !! */  = (long)(v6 - lw.hzsc("hzzj", hzwi(int ), (int)20));
lbl48:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1431303051: {
                            v6 = lw.hzsc("hzzk", hzwi(int ), (int)21);
                            continue block33;
                        }
                        case 425353332: {
                            break block33;
                        }
                        case 1978568594: {
                            v6 = lw.hzsc("hzzm", hzwi(int ), (int)22);
                            continue block33;
                        }
                    }
                    break;
                }
                this.rotationSpeedY = var1_1;
                if (var3_5 || var3_5) ** GOTO lbl38
                v7 /* !! */  = lw.pf;
                if (true) ** GOTO lbl63
                block34: while (true) {
                    v7 /* !! */  = (long)(lw.hzsc("hzzo", hzwi(int ), (int)24) - lw.hzsc("hzzn", hzwi(int ), (int)23));
lbl63:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -316297192: {
                            continue block34;
                        }
                        case 425353332: {
                            break block34;
                        }
                    }
                    break;
                }
                this.rotationSpeedX = var2_2;
                if (var3_5 || var3_5) ** continue;
                return;
            }
            case 0: {
                var4_4 /* !! */  = (int)lw.hzsc("hzzp", hzry(int ), (int)64);
                if (var5_3) {
                    throw null;
                }
            }
lbl75:
            // 4 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_4 /* !! */  = (int)lw.hzsc("hzzr", hzry(int ), (int)65);
                    if (var5_3) {
                        throw null;
                    }
                    ** GOTO lbl95
                    break;
                }
            }
            case 2: {
                do {
                    var4_4 /* !! */  = (int)lw.hzsc("hzzt", hzry(int ), (int)66);
                } while (!var5_3);
                throw null;
            }
lbl86:
            // 3 sources

            case 3: {
                var4_4 /* !! */  = (int)lw.hzsc("hzzv", hzry(int ), (int)67);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl95
            }
            case 4: {
                var4_4 /* !! */  = (int)lw.hzsc("hzzx", hzry(int ), (int)68);
                if (!var5_3) ** GOTO lbl86
                throw null;
            }
lbl95:
            // 3 sources

            case 5: {
                var4_4 /* !! */  = (int)lw.hzsc("hzzz", hzry(int ), (int)69);
                if (!var5_3) ** GOTO lbl86
                throw null;
            }
            case 6: {
                var4_4 /* !! */  = (int)lw.hzsc("iaaa", hzry(int ), (int)70);
                if (!var5_3) ** GOTO lbl75
                throw null;
            }
            case 7: 
        }
        var4_4 /* !! */  = (int)lw.hzsc("iaaf", hzry(int ), (int)71);
        ** while (!var5_3)
lbl106:
        // 1 sources

        throw null;
    }

    static {
        hzrz = new int[272];
        hzsa = new int[272];
        lw.iapa();
        lw.iapb();
        lw.iapc();
        lw.iapd();
        lw.iape();
        lw.iaxd();
        hzwj = new long[103];
        hzwn = new long[103];
        lw.iaxu();
        lw.iays();
        lw.iayu();
        lw.iaze();
        RANDOM = new Random();
    }

    private static /* synthetic */ float hzsz(int n2) {
        return Float.intBitsToFloat(hzrz[n2] ^ hzsa[n2]);
    }

    private static /* synthetic */ void iaxd() {
        lw.hzsa[200] = -364117464;
        lw.hzsa[201] = 2110194316;
        lw.hzsa[202] = 1641337528;
        lw.hzsa[203] = 1623879875;
        lw.hzsa[204] = -2133002963;
        lw.hzsa[205] = 1210575985;
        lw.hzsa[206] = 233699517;
        lw.hzsa[207] = -1875037232;
        lw.hzsa[208] = -464347098;
        lw.hzsa[209] = 1740619785;
        lw.hzsa[210] = 415804289;
        lw.hzsa[211] = 549554484;
        lw.hzsa[212] = 191549309;
        lw.hzsa[213] = -432441840;
        lw.hzsa[214] = -36566882;
        lw.hzsa[215] = 1642352567;
        lw.hzsa[216] = 796323965;
        lw.hzsa[217] = 368883468;
        lw.hzsa[218] = 1959265654;
        lw.hzsa[219] = 160581787;
        lw.hzsa[220] = 1316258644;
        lw.hzsa[221] = -2124678026;
        lw.hzsa[222] = 422486310;
        lw.hzsa[223] = 951217036;
        lw.hzsa[224] = 2112654917;
        lw.hzsa[225] = -458387156;
        lw.hzsa[226] = -1179044969;
        lw.hzsa[227] = 1449933858;
        lw.hzsa[228] = -1827156031;
        lw.hzsa[229] = -523982516;
        lw.hzsa[230] = -1561571460;
        lw.hzsa[231] = 514205873;
        lw.hzsa[232] = 657060567;
        lw.hzsa[233] = 1402464073;
        lw.hzsa[234] = -1274945988;
        lw.hzsa[235] = 647276614;
        lw.hzsa[236] = 1897569269;
        lw.hzsa[237] = -544579441;
        lw.hzsa[238] = 1639356083;
        lw.hzsa[239] = 731312889;
        lw.hzsa[240] = -1254301056;
        lw.hzsa[241] = -955197419;
        lw.hzsa[242] = -1615337879;
        lw.hzsa[243] = -488696626;
        lw.hzsa[244] = 541533527;
        lw.hzsa[245] = 1608715730;
        lw.hzsa[246] = 267118043;
        lw.hzsa[247] = 1165530809;
        lw.hzsa[248] = -1379224862;
        lw.hzsa[249] = -1136687449;
        lw.hzsa[250] = -112446454;
        lw.hzsa[251] = -1071365497;
        lw.hzsa[252] = 1197770128;
        lw.hzsa[253] = -17716687;
        lw.hzsa[254] = -685666397;
        lw.hzsa[255] = 505574552;
        lw.hzsa[256] = -476930232;
        lw.hzsa[257] = -1042785592;
        lw.hzsa[258] = -1553537334;
        lw.hzsa[259] = 165943373;
        lw.hzsa[260] = 492346733;
        lw.hzsa[261] = 1715091692;
        lw.hzsa[262] = -1213529740;
        lw.hzsa[263] = -79184804;
        lw.hzsa[264] = 2106550118;
        lw.hzsa[265] = 1664769667;
        lw.hzsa[266] = 192327064;
        lw.hzsa[267] = 403545642;
        lw.hzsa[268] = 1150329559;
        lw.hzsa[269] = 484277779;
        lw.hzsa[270] = 781128232;
        lw.hzsa[271] = -743058128;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public lw(double var1_1, double var3_2, double var5_3, float var7_4, int var8_5) {
        var10_6 /* !! */  = lw.b;
        super();
        if (var10_6 /* !! */  == 0) ** GOTO lbl-1000
        switch (var10_6 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.reset(var1_1, var3_2, var5_3, var7_4, var8_5);
                return;
            }
            case 0: {
                var10_6 /* !! */  = (int)lw.hzsc("hzsf", hzry(int ), (int)0);
            }
            case 1: {
                var10_6 /* !! */  = (int)lw.hzsc("hzsh", hzry(int ), (int)1);
            }
            case 2: {
                while (true) {
                    var10_6 /* !! */  = (int)lw.hzsc("hzsj", hzry(int ), (int)2);
                }
            }
            case 3: 
        }
        while (true) {
            var10_6 /* !! */  = (int)lw.hzsc("hzsl", hzry(int ), (int)3);
        }
    }

    private static /* synthetic */ void iape() {
        lw.hzsa[100] = -540315814;
        lw.hzsa[101] = -2141942745;
        lw.hzsa[102] = 1468998504;
        lw.hzsa[103] = 1503617764;
        lw.hzsa[104] = -637532034;
        lw.hzsa[105] = -1429479118;
        lw.hzsa[106] = 1253634549;
        lw.hzsa[107] = -136731289;
        lw.hzsa[108] = 1756689626;
        lw.hzsa[109] = 1487808076;
        lw.hzsa[110] = -1065572756;
        lw.hzsa[111] = -385045412;
        lw.hzsa[112] = -2000575005;
        lw.hzsa[113] = -697045226;
        lw.hzsa[114] = -2071469784;
        lw.hzsa[115] = 1970589931;
        lw.hzsa[116] = 1142812772;
        lw.hzsa[117] = 29936529;
        lw.hzsa[118] = -2058728814;
        lw.hzsa[119] = 231450569;
        lw.hzsa[120] = -2063628931;
        lw.hzsa[121] = -1350474032;
        lw.hzsa[122] = -1018798650;
        lw.hzsa[123] = -840064747;
        lw.hzsa[124] = -1285064723;
        lw.hzsa[125] = -1186439953;
        lw.hzsa[126] = 1087486325;
        lw.hzsa[127] = -1533456028;
        lw.hzsa[128] = 866931091;
        lw.hzsa[129] = 997063747;
        lw.hzsa[130] = 789519116;
        lw.hzsa[131] = -827213798;
        lw.hzsa[132] = 441548081;
        lw.hzsa[133] = 693528018;
        lw.hzsa[134] = -1796577259;
        lw.hzsa[135] = -1053944069;
        lw.hzsa[136] = 1464141939;
        lw.hzsa[137] = -2033925883;
        lw.hzsa[138] = 109144542;
        lw.hzsa[139] = -1938346239;
        lw.hzsa[140] = -1263992272;
        lw.hzsa[141] = -1392937316;
        lw.hzsa[142] = 753540951;
        lw.hzsa[143] = 261813871;
        lw.hzsa[144] = 1272838382;
        lw.hzsa[145] = -1484478751;
        lw.hzsa[146] = 1911671104;
        lw.hzsa[147] = 649927717;
        lw.hzsa[148] = 1255693739;
        lw.hzsa[149] = -183677152;
        lw.hzsa[150] = 528356483;
        lw.hzsa[151] = 532409398;
        lw.hzsa[152] = -735916326;
        lw.hzsa[153] = -1755262378;
        lw.hzsa[154] = 1223427806;
        lw.hzsa[155] = -1083807305;
        lw.hzsa[156] = 2039189419;
        lw.hzsa[157] = 321247527;
        lw.hzsa[158] = 1818137028;
        lw.hzsa[159] = -1441156646;
        lw.hzsa[160] = -593776753;
        lw.hzsa[161] = -1245135595;
        lw.hzsa[162] = -1935085691;
        lw.hzsa[163] = 292092986;
        lw.hzsa[164] = -1260739077;
        lw.hzsa[165] = -1897467153;
        lw.hzsa[166] = -1600180564;
        lw.hzsa[167] = 350365830;
        lw.hzsa[168] = 1280937895;
        lw.hzsa[169] = 1905985958;
        lw.hzsa[170] = -2103600979;
        lw.hzsa[171] = 588415987;
        lw.hzsa[172] = 1870413086;
        lw.hzsa[173] = 1280855196;
        lw.hzsa[174] = 2082330971;
        lw.hzsa[175] = -1891708424;
        lw.hzsa[176] = -685729358;
        lw.hzsa[177] = -1978270610;
        lw.hzsa[178] = -1527014846;
        lw.hzsa[179] = 1721052034;
        lw.hzsa[180] = 1371972165;
        lw.hzsa[181] = -1818569453;
        lw.hzsa[182] = -416809339;
        lw.hzsa[183] = 1210627954;
        lw.hzsa[184] = -880679246;
        lw.hzsa[185] = 714813505;
        lw.hzsa[186] = -1289731237;
        lw.hzsa[187] = 1751262940;
        lw.hzsa[188] = -1259934987;
        lw.hzsa[189] = -1233064774;
        lw.hzsa[190] = 203210443;
        lw.hzsa[191] = 1986991935;
        lw.hzsa[192] = -521917624;
        lw.hzsa[193] = 1431307884;
        lw.hzsa[194] = 1866456439;
        lw.hzsa[195] = 151967332;
        lw.hzsa[196] = 551318293;
        lw.hzsa[197] = 1897688107;
        lw.hzsa[198] = 2024396164;
        lw.hzsa[199] = -606171155;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public float getAlpha() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = lw.pf - lw.hzsc("iajn", hzwi(int ), (int)48)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == lw.hzsc("iajo", hzry(int ), (int)184)) break;
            v0 /* !! */  = (long)lw.hzsc("iajp", hzry(int ), (int)185);
        }
        var4_1 = lw.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = lw.pf - lw.hzsc("iajq", hzwi(int ), (int)49)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == lw.hzsc("iajr", hzry(int ), (int)186)) break;
            v1 /* !! */  = (long)lw.hzsc("iajs", hzry(int ), (int)187);
        }
        var3_2 /* !! */  = lw.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = lw.pf - lw.hzsc("iajt", hzwi(int ), (int)50)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == lw.hzsc("iaju", hzry(int ), (int)188)) break;
            v2 /* !! */  = (long)lw.hzsc("iajv", hzry(int ), (int)189);
        }
        var2_3 = lw.a;
        if (var4_1) {
            throw null;
lbl24:
            // 6 sources

            return (float)lw.hzsc("iajw", hzsz(int ), (int)190);
        }
        if (var2_3 || var2_3) ** GOTO lbl24
        v3 /* !! */  = lw.pf;
        if (true) ** GOTO lbl31
        block32: while (true) {
            v3 /* !! */  = (long)(v4 - lw.hzsc("iajx", hzwi(int ), (int)51));
lbl31:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1807864191: {
                    v4 = lw.hzsc("iajy", hzwi(int ), (int)52);
                    continue block32;
                }
                case -1730769648: {
                    v4 = lw.hzsc("iajz", hzwi(int ), (int)53);
                    continue block32;
                }
                case -1568863905: {
                    v4 = lw.hzsc("iaka", hzwi(int ), (int)54);
                    continue block32;
                }
                case 425353332: {
                    break block32;
                }
            }
            break;
        }
        v5 = this.lifetime;
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_3 = lw.pf - lw.hzsc("iakb", hzwi(int ), (int)55)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v6 /* !! */  == lw.hzsc("iakc", hzry(int ), (int)191)) break;
            v6 /* !! */  = (long)lw.hzsc("iakd", hzry(int ), (int)192);
        }
        var1_4 = v5 / (float)this.maxLifetime;
        if (var2_3 || var2_3) ** GOTO lbl24
        if (!(var1_4 > lw.hzsc("iake", hzsz(int ), (int)193))) ** GOTO lbl65
        if (var2_3 || var2_3) ** GOTO lbl24
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v7 = (1.0f - var1_4) / lw.hzsc("iakf", hzsz(int ), (int)194);
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_4 = lw.pf - lw.hzsc("iakg", hzwi(int ), (int)56)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v8 /* !! */  == lw.hzsc("iakh", hzry(int ), (int)195)) break;
                    v8 /* !! */  = (long)lw.hzsc("iaki", hzry(int ), (int)196);
                }
                return lw.smooth(v7);
            }
lbl65:
            // 1 sources

            if (var2_3 || var2_3) ** GOTO lbl24
            if (!(var1_4 < lw.hzsc("iakj", hzsz(int ), (int)197))) ** GOTO lbl83
            if (var2_3 || var2_3) ** GOTO lbl24
            v9 = var1_4 / lw.hzsc("iakk", hzsz(int ), (int)198);
            v10 /* !! */  = lw.pf;
            if (true) ** GOTO lbl73
            block35: while (true) {
                v10 /* !! */  = (long)(v11 - lw.hzsc("iakl", hzwi(int ), (int)57));
lbl73:
                // 2 sources

                switch ((int)v10 /* !! */ ) {
                    case -2031324818: {
                        v11 = lw.hzsc("iakm", hzwi(int ), (int)58);
                        continue block35;
                    }
                    case 425353332: {
                        break block35;
                    }
                    case 804779981: {
                        v11 = lw.hzsc("iakn", hzwi(int ), (int)59);
                        continue block35;
                    }
                }
                break;
            }
            return lw.smooth(v9);
lbl83:
            // 1 sources

            if (var2_3 || var2_3) ** continue;
            return 1.0f;
            case 0: {
                var3_2 /* !! */  = (int)lw.hzsc("iako", hzry(int ), (int)199);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl117
            }
lbl90:
            // 3 sources

            case 1: {
                var3_2 /* !! */  = (int)lw.hzsc("iakp", hzry(int ), (int)200);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl104
            }
lbl95:
            // 2 sources

            case 2: {
                var3_2 /* !! */  = (int)lw.hzsc("iakq", hzry(int ), (int)201);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl142
            }
lbl100:
            // 3 sources

            case 3: {
                var3_2 /* !! */  = (int)lw.hzsc("iakr", hzry(int ), (int)202);
                if (!var4_1) break;
                throw null;
            }
lbl104:
            // 3 sources

            case 4: {
                var3_2 /* !! */  = (int)lw.hzsc("iaks", hzry(int ), (int)203);
                if (!var4_1) ** GOTO lbl90
                throw null;
            }
            case 5: {
                var3_2 /* !! */  = (int)lw.hzsc("iakt", hzry(int ), (int)204);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl121
            }
            case 6: {
                var3_2 /* !! */  = (int)lw.hzsc("iaku", hzry(int ), (int)205);
                if (!var4_1) ** GOTO lbl100
                throw null;
            }
lbl117:
            // 2 sources

            case 7: {
                var3_2 /* !! */  = (int)lw.hzsc("iakv", hzry(int ), (int)206);
                if (!var4_1) ** GOTO lbl95
                throw null;
            }
lbl121:
            // 2 sources

            case 8: {
                var3_2 /* !! */  = (int)lw.hzsc("iakw", hzry(int ), (int)207);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl138
            }
            case 9: {
                var3_2 /* !! */  = (int)lw.hzsc("iakx", hzry(int ), (int)208);
                if (!var4_1) ** GOTO lbl104
                throw null;
            }
            case 10: {
                var3_2 /* !! */  = (int)lw.hzsc("iaky", hzry(int ), (int)209);
                if (!var4_1) ** GOTO lbl100
                throw null;
            }
            case 11: {
                var3_2 /* !! */  = (int)lw.hzsc("iakz", hzry(int ), (int)210);
                if (var4_1) {
                    throw null;
                }
            }
lbl138:
            // 4 sources

            case 12: {
                var3_2 /* !! */  = (int)lw.hzsc("iala", hzry(int ), (int)211);
                if (var4_1) {
                    throw null;
                }
            }
lbl142:
            // 4 sources

            case 13: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_2 /* !! */  = (int)lw.hzsc("ialb", hzry(int ), (int)212);
                    if (!var4_1) ** GOTO lbl90
                    throw null;
                }
            }
            case 14: 
        }
        var3_2 /* !! */  = (int)lw.hzsc("ialc", hzry(int ), (int)213);
        ** while (!var4_1)
lbl150:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public double getDistanceTo(double var1_1, double var3_2, double var5_3) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = lw.pf - lw.hzsc("ianv", hzwi(int ), (int)92)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == lw.hzsc("ianw", hzry(int ), (int)252)) break;
            v0 /* !! */  = (long)lw.hzsc("ianx", hzry(int ), (int)253);
        }
        var15_4 = lw.c;
        v1 /* !! */  = lw.pf;
        if (true) ** GOTO lbl12
        block22: while (true) {
            v1 /* !! */  = (long)(lw.hzsc("ianz", hzwi(int ), (int)94) - lw.hzsc("iany", hzwi(int ), (int)93));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1183937434: {
                    continue block22;
                }
                case 425353332: {
                    break block22;
                }
            }
            break;
        }
        var14_5 /* !! */  = lw.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = lw.pf - lw.hzsc("iaoa", hzwi(int ), (int)95)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == lw.hzsc("iaob", hzry(int ), (int)254)) break;
            v2 /* !! */  = (long)lw.hzsc("iaoc", hzry(int ), (int)255);
        }
        var13_6 = lw.a;
        if (var15_4) {
            throw null;
lbl27:
            // 4 sources

            return (double)lw.hzsc("iaod", iaap(int ), (int)96);
        }
        if (var13_6 || var13_6) ** GOTO lbl27
        if (var14_5 /* !! */  == 0) ** GOTO lbl-1000
        switch (var14_5 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = lw.pf - lw.hzsc("iaoe", hzwi(int ), (int)97)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == lw.hzsc("iaof", hzry(int ), (int)256)) break;
                    v3 /* !! */  = (long)lw.hzsc("iaog", hzry(int ), (int)257);
                }
                var7_7 = this.x - var1_1;
                if (var13_6 || var13_6) ** GOTO lbl27
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_3 = lw.pf - lw.hzsc("iaoh", hzwi(int ), (int)98)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == lw.hzsc("iaoi", hzry(int ), (int)258)) break;
                    v4 /* !! */  = (long)lw.hzsc("iaoj", hzry(int ), (int)259);
                }
                var9_8 = this.y - var3_2;
                if (var13_6 || var13_6) ** GOTO lbl27
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_4 = lw.pf - lw.hzsc("iaok", hzwi(int ), (int)99)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == lw.hzsc("iaol", hzry(int ), (int)260)) break;
                    v5 /* !! */  = (long)lw.hzsc("iaom", hzry(int ), (int)261);
                }
                var11_9 = this.z - var5_3;
                if (var13_6 || var13_6) ** continue;
                v6 /* !! */  = lw.pf;
                if (true) ** GOTO lbl61
                block28: while (true) {
                    v6 /* !! */  = (long)(v7 - lw.hzsc("iaon", hzwi(int ), (int)100));
lbl61:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case 425353332: {
                            break block28;
                        }
                        case 493595728: {
                            v7 = lw.hzsc("iaoo", hzwi(int ), (int)101);
                            continue block28;
                        }
                        case 770910288: {
                            v7 = lw.hzsc("iaop", hzwi(int ), (int)102);
                            continue block28;
                        }
                    }
                    break;
                }
                return Math.sqrt(var7_7 * var7_7 + var9_8 * var9_8 + var11_9 * var11_9);
            }
lbl71:
            // 2 sources

            case 0: {
                var14_5 /* !! */  = (int)lw.hzsc("iaoq", hzry(int ), (int)262);
                if (var15_4) {
                    throw null;
                }
                ** GOTO lbl108
            }
            case 1: {
                do {
                    var14_5 /* !! */  = (int)lw.hzsc("iaor", hzry(int ), (int)263);
                } while (!var15_4);
                throw null;
            }
lbl81:
            // 2 sources

            case 2: {
                var14_5 /* !! */  = (int)lw.hzsc("iaos", hzry(int ), (int)264);
                if (!var15_4) ** GOTO lbl71
                throw null;
            }
lbl85:
            // 3 sources

            case 3: {
                var14_5 /* !! */  = (int)lw.hzsc("iaot", hzry(int ), (int)265);
                if (var15_4) {
                    throw null;
                }
                ** GOTO lbl99
            }
lbl90:
            // 2 sources

            case 4: {
                var14_5 /* !! */  = (int)lw.hzsc("iaou", hzry(int ), (int)266);
                if (var15_4) {
                    throw null;
                }
                ** GOTO lbl103
            }
            case 5: {
                var14_5 /* !! */  = (int)lw.hzsc("iaov", hzry(int ), (int)267);
                if (!var15_4) ** GOTO lbl81
                throw null;
            }
lbl99:
            // 2 sources

            case 6: {
                var14_5 /* !! */  = (int)lw.hzsc("iaow", hzry(int ), (int)268);
                if (!var15_4) ** GOTO lbl90
                throw null;
            }
lbl103:
            // 2 sources

            case 7: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var14_5 /* !! */  = (int)lw.hzsc("iaox", hzry(int ), (int)269);
                    if (!var15_4) ** GOTO lbl85
                    throw null;
                }
            }
lbl108:
            // 2 sources

            case 8: {
                var14_5 /* !! */  = (int)lw.hzsc("iaoy", hzry(int ), (int)270);
                if (!var15_4) ** GOTO lbl85
                throw null;
            }
            case 9: 
        }
        var14_5 /* !! */  = (int)lw.hzsc("iaoz", hzry(int ), (int)271);
        ** while (!var15_4)
lbl115:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void setVelocity(double var1_1, double var3_2, double var5_3) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = lw.pf - lw.hzsc("hzwo", hzwi(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == lw.hzsc("hzwq", hzry(int ), (int)46)) break;
            v0 /* !! */  = (long)lw.hzsc("hzws", hzry(int ), (int)47);
        }
        var9_4 = lw.c;
        v1 /* !! */  = lw.pf;
        if (true) ** GOTO lbl11
        block29: while (true) {
            v1 /* !! */  = (long)(v2 - lw.hzsc("hzwu", hzwi(int ), (int)1));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1533845710: {
                    v2 = lw.hzsc("hzwv", hzwi(int ), (int)2);
                    continue block29;
                }
                case -299790864: {
                    v2 = lw.hzsc("hzwx", hzwi(int ), (int)3);
                    continue block29;
                }
                case 425353332: {
                    break block29;
                }
                case 1563253023: {
                    v2 = lw.hzsc("hzxb", hzwi(int ), (int)4);
                    continue block29;
                }
            }
            break;
        }
        var8_5 /* !! */  = lw.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = lw.pf - lw.hzsc("hzxc", hzwi(int ), (int)5)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == lw.hzsc("hzxf", hzry(int ), (int)48)) break;
            v3 /* !! */  = (long)lw.hzsc("hzxg", hzry(int ), (int)49);
        }
        var7_6 = lw.a;
        if (var9_4) {
            throw null;
lbl32:
            // 5 sources

            return;
        }
        if (var7_6 || var7_6) ** GOTO lbl32
        v4 /* !! */  = lw.pf;
        if (true) ** GOTO lbl39
        block32: while (true) {
            v4 /* !! */  = (long)(v5 - lw.hzsc("hzxi", hzwi(int ), (int)6));
lbl39:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -530891049: {
                    v5 = lw.hzsc("hzxm", hzwi(int ), (int)7);
                    continue block32;
                }
                case 425353332: {
                    break block32;
                }
                case 1462285651: {
                    v5 = lw.hzsc("hzxo", hzwi(int ), (int)8);
                    continue block32;
                }
            }
            break;
        }
        this.vx = var1_1;
        if (var7_6) ** GOTO lbl32
        if (var8_5 /* !! */  == 0) ** GOTO lbl-1000
        switch (var8_5 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var7_6) ** GOTO lbl32
                v6 /* !! */  = lw.pf;
                if (true) ** GOTO lbl58
                block33: while (true) {
                    v6 /* !! */  = (long)(v7 - lw.hzsc("hzxq", hzwi(int ), (int)9));
lbl58:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -552089207: {
                            v7 = lw.hzsc("hzxs", hzwi(int ), (int)10);
                            continue block33;
                        }
                        case 425353332: {
                            break block33;
                        }
                        case 1210082915: {
                            v7 = lw.hzsc("hzxt", hzwi(int ), (int)11);
                            continue block33;
                        }
                    }
                    break;
                }
                this.vy = var3_2;
                if (var7_6 || var7_6) ** GOTO lbl32
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_2 = lw.pf - lw.hzsc("hzxv", hzwi(int ), (int)12)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == lw.hzsc("hzxx", hzry(int ), (int)50)) break;
                    v8 /* !! */  = (long)lw.hzsc("hzyb", hzry(int ), (int)51);
                }
                this.vz = var5_3;
                if (!var7_6 && !var7_6) ** break;
                ** continue;
                return;
            }
lbl78:
            // 3 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var8_5 /* !! */  = (int)lw.hzsc("hzyc", hzry(int ), (int)52);
                    if (var9_4) {
                        throw null;
                    }
                    ** GOTO lbl92
                    break;
                }
            }
lbl84:
            // 2 sources

            case 1: {
                var8_5 /* !! */  = (int)lw.hzsc("hzye", hzry(int ), (int)53);
                if (!var9_4) break;
                throw null;
            }
            case 2: {
                var8_5 /* !! */  = (int)lw.hzsc("hzyg", hzry(int ), (int)54);
                if (!var9_4) ** GOTO lbl78
                throw null;
            }
lbl92:
            // 3 sources

            case 3: {
                var8_5 /* !! */  = (int)lw.hzsc("hzyh", hzry(int ), (int)55);
                if (var9_4) {
                    throw null;
                }
                ** GOTO lbl109
            }
lbl97:
            // 2 sources

            case 4: {
                var8_5 /* !! */  = (int)lw.hzsc("hzyj", hzry(int ), (int)56);
                if (!var9_4) ** GOTO lbl84
                throw null;
            }
            case 5: {
                var8_5 /* !! */  = (int)lw.hzsc("hzyk", hzry(int ), (int)57);
                if (!var9_4) ** GOTO lbl97
                throw null;
            }
            case 6: {
                var8_5 /* !! */  = (int)lw.hzsc("hzyo", hzry(int ), (int)58);
                if (!var9_4) ** GOTO lbl92
                throw null;
            }
lbl109:
            // 2 sources

            case 7: {
                do {
                    var8_5 /* !! */  = (int)lw.hzsc("hzyp", hzry(int ), (int)59);
                } while (!var9_4);
                throw null;
            }
            case 8: {
                var8_5 /* !! */  = (int)lw.hzsc("hzyr", hzry(int ), (int)60);
                if (!var9_4) ** GOTO lbl78
                throw null;
            }
            case 9: 
        }
        var8_5 /* !! */  = (int)lw.hzsc("hzys", hzry(int ), (int)61);
        ** while (!var9_4)
lbl121:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void iays() {
        lw.hzwj[100] = -3416116162566094168L;
        lw.hzwj[101] = 1542862386259311688L;
        lw.hzwj[102] = 2210422989201849488L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public float getCurrentSize(boolean var1_1, float var2_2, float var3_3) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = lw.pf - lw.hzsc("ialy", hzwi(int ), (int)71)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == lw.hzsc("ialz", hzry(int ), (int)224)) break;
            v0 /* !! */  = (long)lw.hzsc("iama", hzry(int ), (int)225);
        }
        var8_4 = lw.c;
        v1 /* !! */  = lw.pf;
        if (true) ** GOTO lbl12
        block37: while (true) {
            v1 /* !! */  = (long)(v2 - lw.hzsc("iamb", hzwi(int ), (int)72));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 425353332: {
                    break block37;
                }
                case 606410982: {
                    v2 = lw.hzsc("iamc", hzwi(int ), (int)73);
                    continue block37;
                }
                case 1029345441: {
                    v2 = lw.hzsc("iamd", hzwi(int ), (int)74);
                    continue block37;
                }
            }
            break;
        }
        var7_5 /* !! */  = lw.b;
        v3 /* !! */  = lw.pf;
        if (true) ** GOTO lbl26
        block38: while (true) {
            v3 /* !! */  = (long)(v4 - lw.hzsc("iame", hzwi(int ), (int)75));
lbl26:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -2060701459: {
                    v4 = lw.hzsc("iamf", hzwi(int ), (int)76);
                    continue block38;
                }
                case 425353332: {
                    break block38;
                }
                case 794411248: {
                    v4 = lw.hzsc("iamg", hzwi(int ), (int)77);
                    continue block38;
                }
                case 1683599006: {
                    v4 = lw.hzsc("iamh", hzwi(int ), (int)78);
                    continue block38;
                }
            }
            break;
        }
        var6_6 = lw.a;
        if (var8_4) {
            throw null;
lbl41:
            // 7 sources

            return (float)lw.hzsc("iami", hzsz(int ), (int)226);
        }
        if (var6_6 || var6_6) ** GOTO lbl41
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_1 = lw.pf - lw.hzsc("iamj", hzwi(int ), (int)79)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v5 /* !! */  == lw.hzsc("iamk", hzry(int ), (int)227)) break;
            v5 /* !! */  = (long)lw.hzsc("iaml", hzry(int ), (int)228);
        }
        v6 = this.lifetime;
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_2 = lw.pf - lw.hzsc("iamm", hzwi(int ), (int)80)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v7 /* !! */  == lw.hzsc("iamn", hzry(int ), (int)229)) break;
            v7 /* !! */  = (long)lw.hzsc("iamo", hzry(int ), (int)230);
        }
        var4_7 = v6 / (float)this.maxLifetime;
        if (var6_6) ** GOTO lbl41
        if (var7_5 /* !! */  == 0) ** GOTO lbl-1000
        switch (var7_5 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var6_6) ** GOTO lbl41
                var5_8 = 1.0f;
                if (var6_6 || var6_6) ** GOTO lbl41
                if (!var1_1) ** GOTO lbl98
                if (var6_6 || var6_6) ** GOTO lbl41
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_3 = lw.pf - lw.hzsc("iamp", hzwi(int ), (int)81)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v8 /* !! */  == lw.hzsc("iamq", hzry(int ), (int)231)) break;
                    v8 /* !! */  = (long)lw.hzsc("iamr", hzry(int ), (int)232);
                }
                v9 = this.phase;
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_4 = lw.pf - lw.hzsc("iams", hzwi(int ), (int)82)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v10 /* !! */  == lw.hzsc("iamt", hzry(int ), (int)233)) break;
                    v10 /* !! */  = (long)lw.hzsc("iamu", hzry(int ), (int)234);
                }
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_5 = lw.pf - lw.hzsc("iamv", hzwi(int ), (int)83)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v11 /* !! */  == lw.hzsc("iamw", hzry(int ), (int)235)) break;
                    v11 /* !! */  = (long)lw.hzsc("iamx", hzry(int ), (int)236);
                }
                v12 = v9 + (double)((float)(this.maxLifetime - this.lifetime) * var3_3) * lw.hzsc("iamy", iaap(int ), (int)84);
                v13 /* !! */  = lw.pf;
                if (true) ** GOTO lbl91
                block45: while (true) {
                    v13 /* !! */  = (long)(lw.hzsc("iana", hzwi(int ), (int)86) - lw.hzsc("iamz", hzwi(int ), (int)85));
lbl91:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case 126491315: {
                            continue block45;
                        }
                        case 425353332: {
                            break block45;
                        }
                    }
                    break;
                }
                var5_8 = (float)(1.0 + Math.sin(v12) * (double)var2_2 * lw.hzsc("ianb", iaap(int ), (int)87));
                if (var6_6) ** GOTO lbl41
lbl98:
                // 2 sources

                if (!var6_6 && !var6_6) ** break;
                ** continue;
                v14 /* !! */  = lw.pf;
                if (true) ** GOTO lbl104
                block46: while (true) {
                    v14 /* !! */  = (long)(v15 - lw.hzsc("ianc", hzwi(int ), (int)88));
lbl104:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case -350813342: {
                            v15 = lw.hzsc("iand", hzwi(int ), (int)89);
                            continue block46;
                        }
                        case 425353332: {
                            break block46;
                        }
                        case 1097142225: {
                            v15 = lw.hzsc("iane", hzwi(int ), (int)90);
                            continue block46;
                        }
                        case 2135329030: {
                            v15 = lw.hzsc("ianf", hzwi(int ), (int)91);
                            continue block46;
                        }
                    }
                    break;
                }
                return this.initialSize * (lw.hzsc("iang", hzsz(int ), (int)237) + var4_7 * lw.hzsc("ianh", hzsz(int ), (int)238)) * var5_8;
            }
            case 0: {
                var7_5 /* !! */  = (int)lw.hzsc("iani", hzry(int ), (int)239);
                if (var8_4) {
                    throw null;
                }
                ** GOTO lbl166
            }
            case 1: {
                var7_5 /* !! */  = (int)lw.hzsc("ianj", hzry(int ), (int)240);
                if (var8_4) {
                    throw null;
                }
            }
lbl126:
            // 5 sources

            case 2: {
                var7_5 /* !! */  = (int)lw.hzsc("iank", hzry(int ), (int)241);
                if (var8_4) {
                    throw null;
                }
                ** GOTO lbl135
            }
lbl131:
            // 2 sources

            case 3: {
                var7_5 /* !! */  = (int)lw.hzsc("ianl", hzry(int ), (int)242);
                if (!var8_4) ** GOTO lbl126
                throw null;
            }
lbl135:
            // 3 sources

            case 4: {
                var7_5 /* !! */  = (int)lw.hzsc("ianm", hzry(int ), (int)243);
                if (var8_4) {
                    throw null;
                }
                ** GOTO lbl154
            }
            case 5: {
                var7_5 /* !! */  = (int)lw.hzsc("iann", hzry(int ), (int)244);
                if (var8_4) {
                    throw null;
                }
                ** GOTO lbl166
            }
            case 6: {
                do {
                    var7_5 /* !! */  = (int)lw.hzsc("iano", hzry(int ), (int)245);
                } while (!var8_4);
                throw null;
            }
            case 7: {
                var7_5 /* !! */  = (int)lw.hzsc("ianp", hzry(int ), (int)246);
                if (!var8_4) ** GOTO lbl135
                throw null;
            }
lbl154:
            // 3 sources

            case 8: {
                var7_5 /* !! */  = (int)lw.hzsc("ianq", hzry(int ), (int)247);
                if (!var8_4) ** GOTO lbl126
                throw null;
            }
            case 9: {
                var7_5 /* !! */  = (int)lw.hzsc("ianr", hzry(int ), (int)248);
                if (!var8_4) ** GOTO lbl154
                throw null;
            }
lbl162:
            // 2 sources

            case 10: {
                var7_5 /* !! */  = (int)lw.hzsc("ians", hzry(int ), (int)249);
                if (!var8_4) ** GOTO lbl131
                throw null;
            }
lbl166:
            // 3 sources

            case 11: {
                var7_5 /* !! */  = (int)lw.hzsc("iant", hzry(int ), (int)250);
                if (!var8_4) ** GOTO lbl162
                throw null;
            }
            case 12: 
        }
        do {
            var7_5 /* !! */  = (int)lw.hzsc("ianu", hzry(int ), (int)251);
        } while (!var8_4);
        throw null;
    }

    private static /* synthetic */ double iaap(int n2) {
        return Double.longBitsToDouble(hzwj[n2] ^ hzwn[n2]);
    }

    private static /* synthetic */ void iayu() {
        lw.hzwn[0] = -1665137614676188423L;
        lw.hzwn[1] = -1127524937898598300L;
        lw.hzwn[2] = 1207857661561704515L;
        lw.hzwn[3] = 5039625331494519215L;
        lw.hzwn[4] = -7444692284870420798L;
        lw.hzwn[5] = 209445038109710941L;
        lw.hzwn[6] = -8684971409994917114L;
        lw.hzwn[7] = -2886150617081877703L;
        lw.hzwn[8] = 1076087950457062763L;
        lw.hzwn[9] = -601160822157748039L;
        lw.hzwn[10] = -8042741413123715638L;
        lw.hzwn[11] = 6582931703993209063L;
        lw.hzwn[12] = -6043632872530018956L;
        lw.hzwn[13] = 6459125790877681978L;
        lw.hzwn[14] = 5165595245680605679L;
        lw.hzwn[15] = -4239605913584194501L;
        lw.hzwn[16] = -6021179427481758457L;
        lw.hzwn[17] = -3999437422798297200L;
        lw.hzwn[18] = -6807706570110358604L;
        lw.hzwn[19] = -1976876111972440188L;
        lw.hzwn[20] = -8643604773774525966L;
        lw.hzwn[21] = 6099079490495431051L;
        lw.hzwn[22] = 2058596926500779324L;
        lw.hzwn[23] = -5008140708620072235L;
        lw.hzwn[24] = 2127675474763293200L;
        lw.hzwn[25] = 916295219324006214L;
        lw.hzwn[26] = -7023650051899043851L;
        lw.hzwn[27] = -1744371172996236846L;
        lw.hzwn[28] = 33148608012352317L;
        lw.hzwn[29] = 8890888196870239445L;
        lw.hzwn[30] = -7270194439616321624L;
        lw.hzwn[31] = -5485005689450414846L;
        lw.hzwn[32] = -880581858808835678L;
        lw.hzwn[33] = 4146491538363012956L;
        lw.hzwn[34] = 8040669533326732140L;
        lw.hzwn[35] = 4388744257064410380L;
        lw.hzwn[36] = -5810454785927602421L;
        lw.hzwn[37] = -2576090588796186508L;
        lw.hzwn[38] = 5345879020768934787L;
        lw.hzwn[39] = 2468299775325319043L;
        lw.hzwn[40] = -6457020384286228155L;
        lw.hzwn[41] = 1552991021055842122L;
        lw.hzwn[42] = -5848825203722197397L;
        lw.hzwn[43] = -5275077436886994775L;
        lw.hzwn[44] = 609089037116547406L;
        lw.hzwn[45] = 3449440945704666076L;
        lw.hzwn[46] = 4281090105608881801L;
        lw.hzwn[47] = 347036246648788476L;
        lw.hzwn[48] = 4740069386112814115L;
        lw.hzwn[49] = 5983649128084345565L;
        lw.hzwn[50] = -6419683847994252012L;
        lw.hzwn[51] = 8506969182514473475L;
        lw.hzwn[52] = 877792013880950596L;
        lw.hzwn[53] = 4818566501050233203L;
        lw.hzwn[54] = 3031868140117696786L;
        lw.hzwn[55] = -5538324950868113593L;
        lw.hzwn[56] = -6399216744781984901L;
        lw.hzwn[57] = -2561987329766104142L;
        lw.hzwn[58] = -240516793626821756L;
        lw.hzwn[59] = 1606429585527605504L;
        lw.hzwn[60] = -3257397036011336972L;
        lw.hzwn[61] = -2472443523221411127L;
        lw.hzwn[62] = 8647555503659953677L;
        lw.hzwn[63] = -8115960441352779983L;
        lw.hzwn[64] = -5913054530019725108L;
        lw.hzwn[65] = -1661673419213043336L;
        lw.hzwn[66] = -1993725526906070436L;
        lw.hzwn[67] = 8483194232775696556L;
        lw.hzwn[68] = 1761645913722902461L;
        lw.hzwn[69] = -5507338005035520964L;
        lw.hzwn[70] = -5517248697730674413L;
        lw.hzwn[71] = -8704348098162306433L;
        lw.hzwn[72] = -4171544766313837888L;
        lw.hzwn[73] = -8184205409727422046L;
        lw.hzwn[74] = -2284753262510444611L;
        lw.hzwn[75] = -1324128426923400473L;
        lw.hzwn[76] = -277553318425928066L;
        lw.hzwn[77] = -3197856962906472844L;
        lw.hzwn[78] = -3549383793744124578L;
        lw.hzwn[79] = -7020638767310452531L;
        lw.hzwn[80] = -7421012043319461875L;
        lw.hzwn[81] = -428258603048024460L;
        lw.hzwn[82] = -705380232415787542L;
        lw.hzwn[83] = -2734717149126275924L;
        lw.hzwn[84] = -2962502282246095758L;
        lw.hzwn[85] = -1397691040621678094L;
        lw.hzwn[86] = 2561267323498043347L;
        lw.hzwn[87] = -2602714939159326776L;
        lw.hzwn[88] = -8438598143878198808L;
        lw.hzwn[89] = -9199230551432603395L;
        lw.hzwn[90] = 6225509350319244336L;
        lw.hzwn[91] = -7540482320943853694L;
        lw.hzwn[92] = 5090546420620099600L;
        lw.hzwn[93] = -7543696158504118632L;
        lw.hzwn[94] = 3727639110076822897L;
        lw.hzwn[95] = -5247638893954474098L;
        lw.hzwn[96] = -3347072594047538695L;
        lw.hzwn[97] = -888846107559949154L;
        lw.hzwn[98] = 6525568573029077114L;
        lw.hzwn[99] = -2719971069265224780L;
    }

    public static /* synthetic */ CallSite hzsc(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }
}

