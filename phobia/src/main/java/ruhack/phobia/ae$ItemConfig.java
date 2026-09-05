/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

public class ae$ItemConfig {
    public static final boolean c;
    static final long cw = 6566261809836550453L;
    private static long[] bdfp;
    public static final int b;
    private static long[] bdfq;
    private int minQuantity;
    private static int[] bdeq;
    private int buyBelow;
    public static final boolean a;
    private static int[] bder;
    private boolean enabled;

    static {
        bdeq = new int[71];
        bder = new int[71];
        ae$ItemConfig.bdmn();
        ae$ItemConfig.bdmy();
        bdfp = new long[56];
        bdfq = new long[56];
        ae$ItemConfig.bdnn();
        ae$ItemConfig.bdoa();
    }

    private static /* synthetic */ long bdfo(int n2) {
        return bdfp[n2] ^ bdfq[n2];
    }

    private static /* synthetic */ void bdmy() {
        ae$ItemConfig.bder[0] = -1361507744;
        ae$ItemConfig.bder[1] = -136549384;
        ae$ItemConfig.bder[2] = -646319921;
        ae$ItemConfig.bder[3] = 1395042131;
        ae$ItemConfig.bder[4] = 296923361;
        ae$ItemConfig.bder[5] = -1530365384;
        ae$ItemConfig.bder[6] = 98541444;
        ae$ItemConfig.bder[7] = -1584026252;
        ae$ItemConfig.bder[8] = 1791088357;
        ae$ItemConfig.bder[9] = -526786548;
        ae$ItemConfig.bder[10] = -261797634;
        ae$ItemConfig.bder[11] = -519492790;
        ae$ItemConfig.bder[12] = 986964971;
        ae$ItemConfig.bder[13] = -1614287015;
        ae$ItemConfig.bder[14] = 1811340211;
        ae$ItemConfig.bder[15] = -177727730;
        ae$ItemConfig.bder[16] = -2059683481;
        ae$ItemConfig.bder[17] = -774154111;
        ae$ItemConfig.bder[18] = -2087004731;
        ae$ItemConfig.bder[19] = 1394745769;
        ae$ItemConfig.bder[20] = -1071254077;
        ae$ItemConfig.bder[21] = -1076631564;
        ae$ItemConfig.bder[22] = 1088415721;
        ae$ItemConfig.bder[23] = -156063170;
        ae$ItemConfig.bder[24] = 1134628436;
        ae$ItemConfig.bder[25] = -646495616;
        ae$ItemConfig.bder[26] = 531084721;
        ae$ItemConfig.bder[27] = -1939000433;
        ae$ItemConfig.bder[28] = 1878565958;
        ae$ItemConfig.bder[29] = -1789298029;
        ae$ItemConfig.bder[30] = 936815718;
        ae$ItemConfig.bder[31] = 1564921803;
        ae$ItemConfig.bder[32] = 127999229;
        ae$ItemConfig.bder[33] = 2029506835;
        ae$ItemConfig.bder[34] = 937559640;
        ae$ItemConfig.bder[35] = -884060955;
        ae$ItemConfig.bder[36] = -635820823;
        ae$ItemConfig.bder[37] = 540419826;
        ae$ItemConfig.bder[38] = -1595215356;
        ae$ItemConfig.bder[39] = -1339155279;
        ae$ItemConfig.bder[40] = -1698614335;
        ae$ItemConfig.bder[41] = -424631871;
        ae$ItemConfig.bder[42] = -1885477752;
        ae$ItemConfig.bder[43] = -1914182773;
        ae$ItemConfig.bder[44] = -1688698525;
        ae$ItemConfig.bder[45] = 1532339295;
        ae$ItemConfig.bder[46] = -1665466885;
        ae$ItemConfig.bder[47] = 477161089;
        ae$ItemConfig.bder[48] = 836568351;
        ae$ItemConfig.bder[49] = 416785204;
        ae$ItemConfig.bder[50] = -409497617;
        ae$ItemConfig.bder[51] = 1748879297;
        ae$ItemConfig.bder[52] = 1347562179;
        ae$ItemConfig.bder[53] = 419197349;
        ae$ItemConfig.bder[54] = -1698370524;
        ae$ItemConfig.bder[55] = -260955864;
        ae$ItemConfig.bder[56] = -1617017446;
        ae$ItemConfig.bder[57] = -273527305;
        ae$ItemConfig.bder[58] = 1470005368;
        ae$ItemConfig.bder[59] = 1962044727;
        ae$ItemConfig.bder[60] = -274604363;
        ae$ItemConfig.bder[61] = -1780503780;
        ae$ItemConfig.bder[62] = 1319515335;
        ae$ItemConfig.bder[63] = 360224827;
        ae$ItemConfig.bder[64] = 433224704;
        ae$ItemConfig.bder[65] = 1907675245;
        ae$ItemConfig.bder[66] = -1853521523;
        ae$ItemConfig.bder[67] = -1610928364;
        ae$ItemConfig.bder[68] = 387479125;
        ae$ItemConfig.bder[69] = 1074693380;
        ae$ItemConfig.bder[70] = -1821839047;
    }

    private static /* synthetic */ void bdoa() {
        ae$ItemConfig.bdfq[0] = -6254291410537682518L;
        ae$ItemConfig.bdfq[1] = 16370127989629866L;
        ae$ItemConfig.bdfq[2] = 3478307089727473935L;
        ae$ItemConfig.bdfq[3] = -6726846521519138429L;
        ae$ItemConfig.bdfq[4] = 2193782892492831225L;
        ae$ItemConfig.bdfq[5] = 4538220147285953851L;
        ae$ItemConfig.bdfq[6] = 1651630444415408685L;
        ae$ItemConfig.bdfq[7] = 3337064369294680135L;
        ae$ItemConfig.bdfq[8] = -7542908351310429935L;
        ae$ItemConfig.bdfq[9] = 4099694625110893469L;
        ae$ItemConfig.bdfq[10] = -7860451396263637588L;
        ae$ItemConfig.bdfq[11] = 5988120767040717332L;
        ae$ItemConfig.bdfq[12] = 1682241977018998653L;
        ae$ItemConfig.bdfq[13] = 5470307260266830478L;
        ae$ItemConfig.bdfq[14] = 8711754894631682981L;
        ae$ItemConfig.bdfq[15] = -4877323599948510928L;
        ae$ItemConfig.bdfq[16] = 1727087331625497564L;
        ae$ItemConfig.bdfq[17] = -1034469055674575560L;
        ae$ItemConfig.bdfq[18] = -6713011955578345604L;
        ae$ItemConfig.bdfq[19] = -3521753618075852172L;
        ae$ItemConfig.bdfq[20] = 712080992022097357L;
        ae$ItemConfig.bdfq[21] = 7347452754301731555L;
        ae$ItemConfig.bdfq[22] = 148815942335470231L;
        ae$ItemConfig.bdfq[23] = -3614485292346827045L;
        ae$ItemConfig.bdfq[24] = 2791611659159613466L;
        ae$ItemConfig.bdfq[25] = 146905960768265857L;
        ae$ItemConfig.bdfq[26] = -1234848342477947489L;
        ae$ItemConfig.bdfq[27] = -390997485160167372L;
        ae$ItemConfig.bdfq[28] = -7190309264144581302L;
        ae$ItemConfig.bdfq[29] = 835213335795912849L;
        ae$ItemConfig.bdfq[30] = -2499496701552709396L;
        ae$ItemConfig.bdfq[31] = -3185889352336672598L;
        ae$ItemConfig.bdfq[32] = 7054780544608965702L;
        ae$ItemConfig.bdfq[33] = -3780439791066804867L;
        ae$ItemConfig.bdfq[34] = -1607107436978212976L;
        ae$ItemConfig.bdfq[35] = -826704998898546348L;
        ae$ItemConfig.bdfq[36] = 604642074139314569L;
        ae$ItemConfig.bdfq[37] = 5153971856661752395L;
        ae$ItemConfig.bdfq[38] = 6677761869997574548L;
        ae$ItemConfig.bdfq[39] = 7678682126647797210L;
        ae$ItemConfig.bdfq[40] = 3002339653950335843L;
        ae$ItemConfig.bdfq[41] = -3465968582656385008L;
        ae$ItemConfig.bdfq[42] = 7867438416444565941L;
        ae$ItemConfig.bdfq[43] = -6555110885118506315L;
        ae$ItemConfig.bdfq[44] = 5307495917712264575L;
        ae$ItemConfig.bdfq[45] = -7565193686884592076L;
        ae$ItemConfig.bdfq[46] = 8868277154270817475L;
        ae$ItemConfig.bdfq[47] = -1932634234724412043L;
        ae$ItemConfig.bdfq[48] = -6923538419544222441L;
        ae$ItemConfig.bdfq[49] = -1758662134939328426L;
        ae$ItemConfig.bdfq[50] = 1699739817520693901L;
        ae$ItemConfig.bdfq[51] = 2993717513912571276L;
        ae$ItemConfig.bdfq[52] = -2726186589993266385L;
        ae$ItemConfig.bdfq[53] = 6578944538657303220L;
        ae$ItemConfig.bdfq[54] = -3152550003467950285L;
        ae$ItemConfig.bdfq[55] = 7497869317333789096L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public ae$ItemConfig(boolean var1_1, int var2_2, int var3_3) {
        var5_4 /* !! */  = ae$ItemConfig.b;
        super();
        this.enabled = ae$ItemConfig.bdes("bdfc", bdep(int ), (int)9);
        if (var5_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.buyBelow = (int)ae$ItemConfig.bdes("bdfd", bdep(int ), (int)10);
                this.minQuantity = (int)ae$ItemConfig.bdes("bdfe", bdep(int ), (int)11);
                this.enabled = var1_1;
                this.buyBelow = var2_2;
                this.minQuantity = var3_3;
                return;
            }
lbl13:
            // 2 sources

            case 0: {
                var5_4 /* !! */  = (int)ae$ItemConfig.bdes("bdff", bdep(int ), (int)12);
                ** GOTO lbl26
            }
lbl16:
            // 3 sources

            case 1: {
                var5_4 /* !! */  = (int)ae$ItemConfig.bdes("bdfg", bdep(int ), (int)13);
                ** GOTO lbl13
            }
lbl19:
            // 2 sources

            case 2: {
                var5_4 /* !! */  = (int)ae$ItemConfig.bdes("bdfh", bdep(int ), (int)14);
                break;
            }
            case 3: {
                while (true) {
                    var5_4 /* !! */  = (int)ae$ItemConfig.bdes("bdfi", bdep(int ), (int)15);
                }
            }
lbl26:
            // 2 sources

            case 4: {
                var5_4 /* !! */  = (int)ae$ItemConfig.bdes("bdfj", bdep(int ), (int)16);
                ** GOTO lbl19
            }
            case 5: {
                while (true) {
                    var5_4 /* !! */  = (int)ae$ItemConfig.bdes("bdfk", bdep(int ), (int)17);
                }
            }
            case 6: {
                var5_4 /* !! */  = (int)ae$ItemConfig.bdes("bdfl", bdep(int ), (int)18);
                ** GOTO lbl16
            }
            case 7: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_4 /* !! */  = (int)ae$ItemConfig.bdes("bdfm", bdep(int ), (int)19);
                    ** GOTO lbl16
                    break;
                }
            }
            case 8: 
        }
        var5_4 /* !! */  = (int)ae$ItemConfig.bdes("bdfn", bdep(int ), (int)20);
        ** while (true)
    }

    private static /* synthetic */ void bdmn() {
        ae$ItemConfig.bdeq[0] = -1361507744;
        ae$ItemConfig.bdeq[1] = -136550384;
        ae$ItemConfig.bdeq[2] = -646319922;
        ae$ItemConfig.bdeq[3] = 1395042129;
        ae$ItemConfig.bdeq[4] = 296923360;
        ae$ItemConfig.bdeq[5] = -1530365384;
        ae$ItemConfig.bdeq[6] = 98541441;
        ae$ItemConfig.bdeq[7] = -1584026252;
        ae$ItemConfig.bdeq[8] = 1791088357;
        ae$ItemConfig.bdeq[9] = -526786548;
        ae$ItemConfig.bdeq[10] = -261797098;
        ae$ItemConfig.bdeq[11] = -519492789;
        ae$ItemConfig.bdeq[12] = 986964970;
        ae$ItemConfig.bdeq[13] = -1614287011;
        ae$ItemConfig.bdeq[14] = 1811340209;
        ae$ItemConfig.bdeq[15] = -177727731;
        ae$ItemConfig.bdeq[16] = -2059683483;
        ae$ItemConfig.bdeq[17] = -774154112;
        ae$ItemConfig.bdeq[18] = -2087004735;
        ae$ItemConfig.bdeq[19] = 1394745761;
        ae$ItemConfig.bdeq[20] = -1071254078;
        ae$ItemConfig.bdeq[21] = -1076631564;
        ae$ItemConfig.bdeq[22] = 1088415720;
        ae$ItemConfig.bdeq[23] = 689896837;
        ae$ItemConfig.bdeq[24] = 1134628437;
        ae$ItemConfig.bdeq[25] = -646495616;
        ae$ItemConfig.bdeq[26] = 531084721;
        ae$ItemConfig.bdeq[27] = -1939000435;
        ae$ItemConfig.bdeq[28] = 1878565959;
        ae$ItemConfig.bdeq[29] = -1409538621;
        ae$ItemConfig.bdeq[30] = 936815719;
        ae$ItemConfig.bdeq[31] = -629655422;
        ae$ItemConfig.bdeq[32] = 373779809;
        ae$ItemConfig.bdeq[33] = 2029506835;
        ae$ItemConfig.bdeq[34] = 937559641;
        ae$ItemConfig.bdeq[35] = -884060955;
        ae$ItemConfig.bdeq[36] = -635820824;
        ae$ItemConfig.bdeq[37] = 540419827;
        ae$ItemConfig.bdeq[38] = 429958277;
        ae$ItemConfig.bdeq[39] = 776795150;
        ae$ItemConfig.bdeq[40] = -1698614336;
        ae$ItemConfig.bdeq[41] = -682307423;
        ae$ItemConfig.bdeq[42] = -1885477751;
        ae$ItemConfig.bdeq[43] = -1914182774;
        ae$ItemConfig.bdeq[44] = -1688698528;
        ae$ItemConfig.bdeq[45] = 1532339292;
        ae$ItemConfig.bdeq[46] = 1665466884;
        ae$ItemConfig.bdeq[47] = -1794593121;
        ae$ItemConfig.bdeq[48] = 836568350;
        ae$ItemConfig.bdeq[49] = -1116596816;
        ae$ItemConfig.bdeq[50] = -409497619;
        ae$ItemConfig.bdeq[51] = 1748879296;
        ae$ItemConfig.bdeq[52] = 1347562176;
        ae$ItemConfig.bdeq[53] = 419197351;
        ae$ItemConfig.bdeq[54] = -1698370528;
        ae$ItemConfig.bdeq[55] = -260955863;
        ae$ItemConfig.bdeq[56] = 399861947;
        ae$ItemConfig.bdeq[57] = 273527304;
        ae$ItemConfig.bdeq[58] = -1162122141;
        ae$ItemConfig.bdeq[59] = 1962044726;
        ae$ItemConfig.bdeq[60] = -274604367;
        ae$ItemConfig.bdeq[61] = -1780503778;
        ae$ItemConfig.bdeq[62] = 1319515331;
        ae$ItemConfig.bdeq[63] = 360224827;
        ae$ItemConfig.bdeq[64] = 433224705;
        ae$ItemConfig.bdeq[65] = -759354481;
        ae$ItemConfig.bdeq[66] = -1853521527;
        ae$ItemConfig.bdeq[67] = -1610928362;
        ae$ItemConfig.bdeq[68] = 387479127;
        ae$ItemConfig.bdeq[69] = 1074693380;
        ae$ItemConfig.bdeq[70] = -1821839046;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void setMinQuantity(int var1_1) {
        v0 /* !! */  = ae$ItemConfig.cw;
        if (true) ** GOTO lbl5
        block25: while (true) {
            v0 /* !! */  = (long)(v1 - ae$ItemConfig.bdes("bdks", bdfo(int ), (int)43));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1907153632: {
                    v1 = ae$ItemConfig.bdes("bdku", bdfo(int ), (int)44);
                    continue block25;
                }
                case -1786418891: {
                    break block25;
                }
                case -331796227: {
                    v1 = ae$ItemConfig.bdes("bdkv", bdfo(int ), (int)45);
                    continue block25;
                }
                case -142138600: {
                    v1 = ae$ItemConfig.bdes("bdkw", bdfo(int ), (int)46);
                    continue block25;
                }
            }
            break;
        }
        var4_2 = ae$ItemConfig.c;
        v2 /* !! */  = ae$ItemConfig.cw;
        if (true) ** GOTO lbl22
        block26: while (true) {
            v2 /* !! */  = (long)(v3 - ae$ItemConfig.bdes("bdkx", bdfo(int ), (int)47));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1786418891: {
                    break block26;
                }
                case -755638510: {
                    v3 = ae$ItemConfig.bdes("bdla", bdfo(int ), (int)48);
                    continue block26;
                }
                case -646905749: {
                    v3 = ae$ItemConfig.bdes("bdlf", bdfo(int ), (int)49);
                    continue block26;
                }
                case 600891142: {
                    v3 = ae$ItemConfig.bdes("bdlg", bdfo(int ), (int)50);
                    continue block26;
                }
            }
            break;
        }
        var3_3 /* !! */  = ae$ItemConfig.b;
        v4 /* !! */  = ae$ItemConfig.cw;
        if (true) ** GOTO lbl39
        block27: while (true) {
            v4 /* !! */  = (long)(v5 - ae$ItemConfig.bdes("bdlh", bdfo(int ), (int)51));
lbl39:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1786418891: {
                    break block27;
                }
                case -1554529994: {
                    v5 = ae$ItemConfig.bdes("bdli", bdfo(int ), (int)52);
                    continue block27;
                }
                case -1269841502: {
                    v5 = ae$ItemConfig.bdes("bdlj", bdfo(int ), (int)53);
                    continue block27;
                }
                case -391290152: {
                    v5 = ae$ItemConfig.bdes("bdln", bdfo(int ), (int)54);
                    continue block27;
                }
            }
            break;
        }
        var2_4 = ae$ItemConfig.a;
        if (var4_2) {
            throw null;
lbl54:
            // 2 sources

            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl54
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_0 = ae$ItemConfig.cw - ae$ItemConfig.bdes("bdlr", bdfo(int ), (int)55)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == ae$ItemConfig.bdes("bdlt", bdep(int ), (int)64)) break;
                    v6 /* !! */  = (long)ae$ItemConfig.bdes("bdlu", bdep(int ), (int)65);
                }
                this.minQuantity = var1_1;
                if (!var2_4) ** break;
                ** continue;
                return;
            }
lbl69:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)ae$ItemConfig.bdes("bdlv", bdep(int ), (int)66);
                if (var4_2) {
                    throw null;
                }
            }
            case 1: {
                var3_3 /* !! */  = (int)ae$ItemConfig.bdes("bdlw", bdep(int ), (int)67);
                if (!var4_2) ** GOTO lbl69
                throw null;
            }
lbl77:
            // 2 sources

            case 2: {
                var3_3 /* !! */  = (int)ae$ItemConfig.bdes("bdly", bdep(int ), (int)68);
                if (!var4_2) break;
                throw null;
            }
            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)ae$ItemConfig.bdes("bdma", bdep(int ), (int)69);
                    if (!var4_2) ** GOTO lbl77
                    throw null;
                }
            }
            case 4: 
        }
        var3_3 /* !! */  = (int)ae$ItemConfig.bdes("bdmf", bdep(int ), (int)70);
        ** while (!var4_2)
lbl89:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean isEnabled() {
        v0 /* !! */  = ae$ItemConfig.cw;
        if (true) ** GOTO lbl5
        block20: while (true) {
            v0 /* !! */  = (long)(v1 - ae$ItemConfig.bdes("bdfr", bdfo(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1786418891: {
                    break block20;
                }
                case 2001419764: {
                    v1 = ae$ItemConfig.bdes("bdfs", bdfo(int ), (int)1);
                    continue block20;
                }
                case 2139655319: {
                    v1 = ae$ItemConfig.bdes("bdft", bdfo(int ), (int)2);
                    continue block20;
                }
            }
            break;
        }
        var3_1 = ae$ItemConfig.c;
        v2 /* !! */  = ae$ItemConfig.cw;
        if (true) ** GOTO lbl19
        block21: while (true) {
            v2 /* !! */  = (long)(v3 - ae$ItemConfig.bdes("bdfu", bdfo(int ), (int)3));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1786418891: {
                    break block21;
                }
                case -445669712: {
                    v3 = ae$ItemConfig.bdes("bdfv", bdfo(int ), (int)4);
                    continue block21;
                }
                case 332966627: {
                    v3 = ae$ItemConfig.bdes("bdfw", bdfo(int ), (int)5);
                    continue block21;
                }
            }
            break;
        }
        var2_2 /* !! */  = ae$ItemConfig.b;
        v4 /* !! */  = ae$ItemConfig.cw;
        if (true) ** GOTO lbl33
        block22: while (true) {
            v4 /* !! */  = (long)(ae$ItemConfig.bdes("bdfy", bdfo(int ), (int)7) - ae$ItemConfig.bdes("bdfx", bdfo(int ), (int)6));
lbl33:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1786418891: {
                    break block22;
                }
                case 362866462: {
                    continue block22;
                }
            }
            break;
        }
        var1_3 = ae$ItemConfig.a;
        if (var3_1) {
            throw null;
lbl41:
            // 2 sources

            return (boolean)ae$ItemConfig.bdes("bdfz", bdep(int ), (int)21);
        }
        if (var1_3) ** GOTO lbl41
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block14 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_0 = ae$ItemConfig.cw - ae$ItemConfig.bdes("bdga", bdfo(int ), (int)8)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == ae$ItemConfig.bdes("bdgb", bdep(int ), (int)22)) break;
                    v5 /* !! */  = (long)ae$ItemConfig.bdes("bdgc", bdep(int ), (int)23);
                }
                return this.enabled;
            }
            case 0: {
                do {
                    var2_2 /* !! */  = (int)ae$ItemConfig.bdes("bdgd", bdep(int ), (int)24);
                } while (!var3_1);
                throw null;
            }
lbl60:
            // 2 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ae$ItemConfig.bdes("bdge", bdep(int ), (int)25);
                    if (!var3_1) break block14;
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)ae$ItemConfig.bdes("bdgf", bdep(int ), (int)26);
                if (!var3_1) ** GOTO lbl60
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)ae$ItemConfig.bdes("bdgg", bdep(int ), (int)27);
        ** while (!var3_1)
lbl72:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public ae$ItemConfig() {
        var2_1 /* !! */  = ae$ItemConfig.b;
        super();
        this.enabled = ae$ItemConfig.bdes("bdet", bdep(int ), (int)0);
        this.buyBelow = (int)ae$ItemConfig.bdes("bdeu", bdep(int ), (int)1);
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.minQuantity = (int)ae$ItemConfig.bdes("bdev", bdep(int ), (int)2);
                return;
            }
lbl10:
            // 3 sources

            case 0: {
                while (true) {
                    var2_1 /* !! */  = (int)ae$ItemConfig.bdes("bdew", bdep(int ), (int)3);
                }
            }
            case 1: {
                var2_1 /* !! */  = (int)ae$ItemConfig.bdes("bdex", bdep(int ), (int)4);
                ** GOTO lbl10
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)ae$ItemConfig.bdes("bdey", bdep(int ), (int)5);
                    ** GOTO lbl10
                    break;
                }
            }
            case 3: {
                var2_1 /* !! */  = (int)ae$ItemConfig.bdes("bdez", bdep(int ), (int)6);
            }
            case 4: {
                while (true) {
                    var2_1 /* !! */  = (int)ae$ItemConfig.bdes("bdfa", bdep(int ), (int)7);
                }
            }
            case 5: 
        }
        var2_1 /* !! */  = (int)ae$ItemConfig.bdes("bdfb", bdep(int ), (int)8);
        ** while (true)
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public int getMinQuantity() {
        v0 /* !! */  = ae$ItemConfig.cw;
        if (true) ** GOTO lbl5
        block18: while (true) {
            v0 /* !! */  = (long)(v1 - ae$ItemConfig.bdes("bdgy", bdfo(int ), (int)17));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1945878831: {
                    v1 = ae$ItemConfig.bdes("bdgz", bdfo(int ), (int)18);
                    continue block18;
                }
                case -1786418891: {
                    break block18;
                }
                case 90064789: {
                    v1 = ae$ItemConfig.bdes("bdha", bdfo(int ), (int)19);
                    continue block18;
                }
                case 1468896365: {
                    v1 = ae$ItemConfig.bdes("bdhb", bdfo(int ), (int)20);
                    continue block18;
                }
            }
            break;
        }
        var3_1 = ae$ItemConfig.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = ae$ItemConfig.cw - ae$ItemConfig.bdes("bdhc", bdfo(int ), (int)21)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == ae$ItemConfig.bdes("bdhd", bdep(int ), (int)37)) break;
            v2 /* !! */  = (long)ae$ItemConfig.bdes("bdhe", bdep(int ), (int)38);
        }
        var2_2 /* !! */  = ae$ItemConfig.b;
        v3 /* !! */  = ae$ItemConfig.cw;
        if (true) ** GOTO lbl29
        block20: while (true) {
            v3 /* !! */  = (long)(v4 - ae$ItemConfig.bdes("bdhf", bdfo(int ), (int)22));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1786418891: {
                    break block20;
                }
                case -1201432803: {
                    v4 = ae$ItemConfig.bdes("bdhg", bdfo(int ), (int)23);
                    continue block20;
                }
                case -739988322: {
                    v4 = ae$ItemConfig.bdes("bdhh", bdfo(int ), (int)24);
                    continue block20;
                }
                case 1191686784: {
                    v4 = ae$ItemConfig.bdes("bdhi", bdfo(int ), (int)25);
                    continue block20;
                }
            }
            break;
        }
        var1_3 = ae$ItemConfig.a;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_1) {
                    throw null;
                    return (int)ae$ItemConfig.bdes("bdhj", bdep(int ), (int)39);
                }
                if (var1_3 || var1_3) ** continue;
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = ae$ItemConfig.cw - ae$ItemConfig.bdes("bdhk", bdfo(int ), (int)26)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == ae$ItemConfig.bdes("bdhl", bdep(int ), (int)40)) break;
                    v5 /* !! */  = (long)ae$ItemConfig.bdes("bdhm", bdep(int ), (int)41);
                }
                return this.minQuantity;
            }
            case 0: {
                var2_2 /* !! */  = (int)ae$ItemConfig.bdes("bdhn", bdep(int ), (int)42);
                if (!var3_1) break;
                throw null;
            }
            case 1: {
                var2_2 /* !! */  = (int)ae$ItemConfig.bdes("bdho", bdep(int ), (int)43);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)ae$ItemConfig.bdes("bdhp", bdep(int ), (int)44);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)ae$ItemConfig.bdes("bdhq", bdep(int ), (int)45);
        ** while (!var3_1)
lbl73:
        // 1 sources

        throw null;
    }

    public static /* synthetic */ CallSite bdes(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void bdnn() {
        ae$ItemConfig.bdfp[0] = 2697391012533844178L;
        ae$ItemConfig.bdfp[1] = -2182926144878052937L;
        ae$ItemConfig.bdfp[2] = -6652924648000415002L;
        ae$ItemConfig.bdfp[3] = -2626298020600204690L;
        ae$ItemConfig.bdfp[4] = 1434598351360785332L;
        ae$ItemConfig.bdfp[5] = 123617725974245028L;
        ae$ItemConfig.bdfp[6] = -863063791844229936L;
        ae$ItemConfig.bdfp[7] = -6233216626564087879L;
        ae$ItemConfig.bdfp[8] = -6909965440049856539L;
        ae$ItemConfig.bdfp[9] = -1838472673264168073L;
        ae$ItemConfig.bdfp[10] = -7688080271976929244L;
        ae$ItemConfig.bdfp[11] = 1257263555598928984L;
        ae$ItemConfig.bdfp[12] = -7933174966695763246L;
        ae$ItemConfig.bdfp[13] = 3196613756131640378L;
        ae$ItemConfig.bdfp[14] = -6593148603102569661L;
        ae$ItemConfig.bdfp[15] = -5122731980273551570L;
        ae$ItemConfig.bdfp[16] = 4735637869730170273L;
        ae$ItemConfig.bdfp[17] = -5834178782684843270L;
        ae$ItemConfig.bdfp[18] = 61845079807484124L;
        ae$ItemConfig.bdfp[19] = -8845406244637362888L;
        ae$ItemConfig.bdfp[20] = -1339673177965730159L;
        ae$ItemConfig.bdfp[21] = -4730531191123255697L;
        ae$ItemConfig.bdfp[22] = 4826052271802588239L;
        ae$ItemConfig.bdfp[23] = -6337172976431478967L;
        ae$ItemConfig.bdfp[24] = -3346827517929779388L;
        ae$ItemConfig.bdfp[25] = -1297434950701759368L;
        ae$ItemConfig.bdfp[26] = 7434049521047618964L;
        ae$ItemConfig.bdfp[27] = 6578157139963825616L;
        ae$ItemConfig.bdfp[28] = 4569236921274600646L;
        ae$ItemConfig.bdfp[29] = 4881279486173464667L;
        ae$ItemConfig.bdfp[30] = -6115305666122763352L;
        ae$ItemConfig.bdfp[31] = 5943852187635142160L;
        ae$ItemConfig.bdfp[32] = 5496411452802387277L;
        ae$ItemConfig.bdfp[33] = -49927990564898912L;
        ae$ItemConfig.bdfp[34] = 7907439954091151935L;
        ae$ItemConfig.bdfp[35] = 4000918683537565073L;
        ae$ItemConfig.bdfp[36] = -3832068040398430481L;
        ae$ItemConfig.bdfp[37] = -218908627958336800L;
        ae$ItemConfig.bdfp[38] = -7531572583571360499L;
        ae$ItemConfig.bdfp[39] = 3601636056229024165L;
        ae$ItemConfig.bdfp[40] = -1458419245024183331L;
        ae$ItemConfig.bdfp[41] = -4710514337882319779L;
        ae$ItemConfig.bdfp[42] = 384440937666395033L;
        ae$ItemConfig.bdfp[43] = -5943787362658804271L;
        ae$ItemConfig.bdfp[44] = -3594444206408631565L;
        ae$ItemConfig.bdfp[45] = 353633085625211089L;
        ae$ItemConfig.bdfp[46] = -3432751156089711455L;
        ae$ItemConfig.bdfp[47] = 1015056192819596511L;
        ae$ItemConfig.bdfp[48] = -349489283933594970L;
        ae$ItemConfig.bdfp[49] = 2031926726352355266L;
        ae$ItemConfig.bdfp[50] = 3352164866105151649L;
        ae$ItemConfig.bdfp[51] = -4194902986427756625L;
        ae$ItemConfig.bdfp[52] = 2083182255320216120L;
        ae$ItemConfig.bdfp[53] = -4669468538094831839L;
        ae$ItemConfig.bdfp[54] = -2798971927968897812L;
        ae$ItemConfig.bdfp[55] = -5013613933508373922L;
    }

    private static /* synthetic */ int bdep(int n2) {
        return bdeq[n2] ^ bder[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void setEnabled(boolean var1_1) {
        v0 /* !! */  = ae$ItemConfig.cw;
        if (true) ** GOTO lbl5
        block16: while (true) {
            v0 /* !! */  = (long)(v1 - ae$ItemConfig.bdes("bdhr", bdfo(int ), (int)27));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1786418891: {
                    break block16;
                }
                case 1131496805: {
                    v1 = ae$ItemConfig.bdes("bdhs", bdfo(int ), (int)28);
                    continue block16;
                }
                case 1779674132: {
                    v1 = ae$ItemConfig.bdes("bdht", bdfo(int ), (int)29);
                    continue block16;
                }
            }
            break;
        }
        var4_2 = ae$ItemConfig.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = ae$ItemConfig.cw - ae$ItemConfig.bdes("bdhu", bdfo(int ), (int)30)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == ae$ItemConfig.bdes("bdhw", bdep(int ), (int)46)) break;
            v2 /* !! */  = (long)ae$ItemConfig.bdes("bdhx", bdep(int ), (int)47);
        }
        var3_3 /* !! */  = ae$ItemConfig.b;
        v3 /* !! */  = ae$ItemConfig.cw;
        if (true) ** GOTO lbl25
        block18: while (true) {
            v3 /* !! */  = (long)(ae$ItemConfig.bdes("bdia", bdfo(int ), (int)32) - ae$ItemConfig.bdes("bdhz", bdfo(int ), (int)31));
lbl25:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1786418891: {
                    break block18;
                }
                case 730852707: {
                    continue block18;
                }
            }
            break;
        }
        var2_4 = ae$ItemConfig.a;
        if (var4_2) {
            throw null;
lbl33:
            // 2 sources

            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl33
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_1 = ae$ItemConfig.cw - ae$ItemConfig.bdes("bdib", bdfo(int ), (int)33)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == ae$ItemConfig.bdes("bdif", bdep(int ), (int)48)) break;
            v4 /* !! */  = (long)ae$ItemConfig.bdes("bdii", bdep(int ), (int)49);
        }
        this.enabled = var1_1;
        if (!var2_4) ** break;
        ** while (true)
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        block9 : switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                return;
            }
lbl48:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)ae$ItemConfig.bdes("bdik", bdep(int ), (int)50);
                    if (!var4_2) break block9;
                    throw null;
                }
            }
            case 1: {
                do {
                    var3_3 /* !! */  = (int)ae$ItemConfig.bdes("bdil", bdep(int ), (int)51);
                } while (!var4_2);
                throw null;
            }
            case 2: {
                var3_3 /* !! */  = (int)ae$ItemConfig.bdes("bdim", bdep(int ), (int)52);
                if (!var4_2) break;
                throw null;
            }
            case 3: {
                var3_3 /* !! */  = (int)ae$ItemConfig.bdes("bdin", bdep(int ), (int)53);
                if (!var4_2) ** GOTO lbl48
                throw null;
            }
            case 4: 
        }
        var3_3 /* !! */  = (int)ae$ItemConfig.bdes("bdip", bdep(int ), (int)54);
        ** while (!var4_2)
lbl69:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void setBuyBelow(int var1_1) {
        v0 /* !! */  = ae$ItemConfig.cw;
        if (true) ** GOTO lbl5
        block18: while (true) {
            v0 /* !! */  = (long)(v1 - ae$ItemConfig.bdes("bdix", bdfo(int ), (int)34));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1812055369: {
                    v1 = ae$ItemConfig.bdes("bdiz", bdfo(int ), (int)35);
                    continue block18;
                }
                case -1786418891: {
                    break block18;
                }
                case 1272847466: {
                    v1 = ae$ItemConfig.bdes("bdjb", bdfo(int ), (int)36);
                    continue block18;
                }
            }
            break;
        }
        var4_2 = ae$ItemConfig.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = ae$ItemConfig.cw - ae$ItemConfig.bdes("bdjd", bdfo(int ), (int)37)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == ae$ItemConfig.bdes("bdjg", bdep(int ), (int)55)) break;
            v2 /* !! */  = (long)ae$ItemConfig.bdes("bdjk", bdep(int ), (int)56);
        }
        var3_3 /* !! */  = ae$ItemConfig.b;
        v3 /* !! */  = ae$ItemConfig.cw;
        if (true) ** GOTO lbl25
        block20: while (true) {
            v3 /* !! */  = (long)(v4 - ae$ItemConfig.bdes("bdjm", bdfo(int ), (int)38));
lbl25:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1786418891: {
                    break block20;
                }
                case -415575660: {
                    v4 = ae$ItemConfig.bdes("bdjn", bdfo(int ), (int)39);
                    continue block20;
                }
                case 264995103: {
                    v4 = ae$ItemConfig.bdes("bdjp", bdfo(int ), (int)40);
                    continue block20;
                }
                case 2133306823: {
                    v4 = ae$ItemConfig.bdes("bdjs", bdfo(int ), (int)41);
                    continue block20;
                }
            }
            break;
        }
        var2_4 = ae$ItemConfig.a;
        if (var4_2) {
            throw null;
lbl40:
            // 2 sources

            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl40
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_1 = ae$ItemConfig.cw - ae$ItemConfig.bdes("bdju", bdfo(int ), (int)42)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == ae$ItemConfig.bdes("bdjx", bdep(int ), (int)57)) break;
            v5 /* !! */  = (long)ae$ItemConfig.bdes("bdkc", bdep(int ), (int)58);
        }
        this.buyBelow = var1_1;
        if (!var2_4) ** break;
        ** while (true)
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        block11 : switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                return;
            }
lbl55:
            // 3 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)ae$ItemConfig.bdes("bdkf", bdep(int ), (int)59);
                    if (!var4_2) break block11;
                    throw null;
                }
            }
            case 1: {
                var3_3 /* !! */  = (int)ae$ItemConfig.bdes("bdkh", bdep(int ), (int)60);
                if (!var4_2) ** GOTO lbl55
                throw null;
            }
lbl64:
            // 2 sources

            case 2: {
                var3_3 /* !! */  = (int)ae$ItemConfig.bdes("bdkl", bdep(int ), (int)61);
                if (!var4_2) ** GOTO lbl55
                throw null;
            }
            case 3: {
                var3_3 /* !! */  = (int)ae$ItemConfig.bdes("bdkm", bdep(int ), (int)62);
                if (!var4_2) ** GOTO lbl64
                throw null;
            }
            case 4: 
        }
        var3_3 /* !! */  = (int)ae$ItemConfig.bdes("bdko", bdep(int ), (int)63);
        ** while (!var4_2)
lbl75:
        // 1 sources

        throw null;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public int getBuyBelow() {
        while (true) {
            long l2;
            Object object;
            if ((object = (l2 = cw - ae$ItemConfig.bdes("bdgh", bdfo(int ), (int)9)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object == ae$ItemConfig.bdes("bdgi", bdep(int ), (int)28)) break;
            object = ae$ItemConfig.bdes("bdgj", bdep(int ), (int)29);
        }
        boolean bl2 = c;
        while (true) {
            long l3;
            Object object;
            if ((object = (l3 = cw - ae$ItemConfig.bdes("bdgk", bdfo(int ), (int)10)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object == ae$ItemConfig.bdes("bdgl", bdep(int ), (int)30)) break;
            object = ae$ItemConfig.bdes("bdgm", bdep(int ), (int)31);
        }
        int n2 = b;
        Object object = cw;
        block12: while (true) {
            switch ((int)object) {
                case -1786418891: {
                    break block12;
                }
                case 710850694: {
                    object = ae$ItemConfig.bdes("bdgo", bdfo(int ), (int)12) - ae$ItemConfig.bdes("bdgn", bdfo(int ), (int)11);
                    continue block12;
                }
            }
            break;
        }
        boolean bl3 = a;
        if (bl2) {
            throw null;
        }
        if (bl3) return (int)ae$ItemConfig.bdes("bdgp", bdep(int ), (int)32);
        if (bl3) return (int)ae$ItemConfig.bdes("bdgp", bdep(int ), (int)32);
        Object object2 = cw;
        boolean bl4 = true;
        block13: while (true) {
            CallSite callSite;
            if (!bl4 || (bl4 = false) || !true) {
                object2 = callSite - ae$ItemConfig.bdes("bdgq", bdfo(int ), (int)13);
            }
            switch ((int)object2) {
                case -1786418891: {
                    return this.buyBelow;
                }
                case -1733639114: {
                    callSite = ae$ItemConfig.bdes("bdgr", bdfo(int ), (int)14);
                    continue block13;
                }
                case 1245643440: {
                    callSite = ae$ItemConfig.bdes("bdgs", bdfo(int ), (int)15);
                    continue block13;
                }
                case 2064318871: {
                    callSite = ae$ItemConfig.bdes("bdgt", bdfo(int ), (int)16);
                    continue block13;
                }
            }
            break;
        }
        return this.buyBelow;
    }
}

