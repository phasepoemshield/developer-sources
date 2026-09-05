/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1713
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.minecraft.class_1713;
import ruhack.phobia.bc;

public class br
extends bc {
    public static final int b;
    private static long[] eaev;
    private static long[] eaeu;
    private int windowId;
    private int button;
    static final long ka = -7283328414806416908L;
    private int slotId;
    public static final boolean c;
    public static final boolean a;
    private static int[] eafa;
    private class_1713 actionType;
    private static int[] eaez;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public int getWindowId() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = br.ka - br.eaew("eaex", eaet(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == br.eaew("eafb", eaey(int ), (int)0)) break;
            v0 /* !! */  = (long)br.eaew("eafc", eaey(int ), (int)1);
        }
        var3_1 = br.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = br.ka - br.eaew("eafd", eaet(int ), (int)1)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == br.eaew("eafe", eaey(int ), (int)2)) break;
            v1 /* !! */  = (long)br.eaew("eaff", eaey(int ), (int)3);
        }
        var2_2 /* !! */  = br.b;
        v2 /* !! */  = br.ka;
        if (true) ** GOTO lbl19
        block12: while (true) {
            v2 /* !! */  = (long)(br.eaew("eafh", eaet(int ), (int)3) - br.eaew("eafg", eaet(int ), (int)2));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -211581822: {
                    continue block12;
                }
                case 1022648820: {
                    break block12;
                }
            }
            break;
        }
        var1_3 = br.a;
        if (var3_1) {
            throw null;
lbl27:
            // 2 sources

            return (int)br.eaew("eafi", eaey(int ), (int)4);
        }
        if (var1_3) ** GOTO lbl27
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = br.ka - br.eaew("eafj", eaet(int ), (int)4)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == br.eaew("eafk", eaey(int ), (int)5)) break;
                    v3 /* !! */  = (long)br.eaew("eafl", eaey(int ), (int)6);
                }
                return this.windowId;
            }
lbl41:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)br.eaew("eafm", eaey(int ), (int)7);
                if (!var3_1) break;
                throw null;
            }
            case 1: {
                do {
                    var2_2 /* !! */  = (int)br.eaew("eafn", eaey(int ), (int)8);
                } while (!var3_1);
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)br.eaew("eafo", eaey(int ), (int)9);
                if (!var3_1) ** GOTO lbl41
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)br.eaew("eafp", eaey(int ), (int)10);
        } while (!var3_1);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public br(int var1_1, int var2_2, int var3_3, class_1713 var4_4) {
        var6_5 /* !! */  = br.b;
        var5_6 = br.a;
        super();
        this.windowId = var1_1;
        if (var6_5 /* !! */  == 0) ** GOTO lbl-1000
        switch (var6_5 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.slotId = var2_2;
                this.button = var3_3;
                this.actionType = var4_4;
                return;
            }
lbl12:
            // 2 sources

            case 0: {
                var6_5 /* !! */  = (int)br.eaew("eaka", eaey(int ), (int)73);
                break;
            }
            case 1: {
                var6_5 /* !! */  = (int)br.eaew("eakb", eaey(int ), (int)74);
            }
lbl17:
            // 3 sources

            case 2: {
                var6_5 /* !! */  = (int)br.eaew("eakc", eaey(int ), (int)75);
                ** GOTO lbl12
            }
            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var6_5 /* !! */  = (int)br.eaew("eakd", eaey(int ), (int)76);
                    ** GOTO lbl17
                    break;
                }
            }
            case 4: 
        }
        var6_5 /* !! */  = (int)br.eaew("eake", eaey(int ), (int)77);
        ** while (true)
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public void setButton(int var1_1) {
        while (true) {
            block28: {
                if ((v0 /* !! */  = (cfr_temp_1 = br.ka - br.eaew("eais", eaet(int ), (int)45)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v0 /* !! */  != br.eaew("eait", eaey(int ), (int)51)) break block28;
                var4_2 = br.c;
                v1 /* !! */  = br.ka;
                if (true) ** GOTO lbl13
            }
            v0 /* !! */  = (long)br.eaew("eaiu", eaey(int ), (int)52);
        }
        block13: while (true) {
            v1 /* !! */  = (long)(v2 - br.eaew("eaiv", eaet(int ), (int)46));
lbl13:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 124925543: {
                    v2 = br.eaew("eaiw", eaet(int ), (int)47);
                    continue block13;
                }
                case 672387207: {
                    v2 = br.eaew("eaix", eaet(int ), (int)48);
                    continue block13;
                }
                case 1022648820: {
                    break block13;
                }
            }
            break;
        }
        var3_3 /* !! */  = br.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_2 = br.ka - br.eaew("eaiy", eaet(int ), (int)49)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == br.eaew("eaiz", eaey(int ), (int)53)) {
                var2_4 = br.a;
                if (var4_2) {
                    throw null;
                }
                break;
            }
            v3 /* !! */  = (long)br.eaew("eaja", eaey(int ), (int)54);
        }
        if (var2_4 || var2_4) return;
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block15: while (true) {
            block29: {
                switch (cfr_temp_0 == -2147483648 ? var3_3 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        while (true) {
                            if ((v4 /* !! */  = (cfr_temp_3 = br.ka - br.eaew("eajb", eaet(int ), (int)50)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                                continue;
                            }
                            if (v4 /* !! */  == br.eaew("eajc", eaey(int ), (int)55)) {
                                this.button = var1_1;
                                if (!var2_4) return;
                            }
                            ** GOTO lbl47
                            return;
lbl47:
                            // 1 sources

                            v4 /* !! */  = (long)br.eaew("eajd", eaey(int ), (int)56);
                        }
                    }
                    case 3: {
                        var3_3 /* !! */  = (int)br.eaew("eajh", eaey(int ), (int)60);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 2: {
                        var3_3 /* !! */  = (int)br.eaew("eajg", eaey(int ), (int)59);
                        cfr_temp_0 = 0;
                        if (var4_2) {
                            throw null;
                        }
                        break block29;
                    }
                    case 4: {
                        var3_3 /* !! */  = (int)br.eaew("eaji", eaey(int ), (int)61);
                        if (var4_2) {
                            throw null;
                        }
                        ** GOTO lbl-1000
                    }
                    case 0: lbl-1000:
                    // 2 sources

                    {
                        var3_3 /* !! */  = (int)br.eaew("eaje", eaey(int ), (int)57);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 1: 
                }
                ** GOTO lbl73
            }
            do {
                if (true) continue block15;
lbl73:
                // 2 sources

                var3_3 /* !! */  = (int)br.eaew("eajf", eaey(int ), (int)58);
                cfr_temp_0 = 0;
            } while (!var4_2);
            break;
        }
        throw null;
    }

    private static /* synthetic */ void eakh() {
        br.eaeu[0] = 3255817057655949769L;
        br.eaeu[1] = 10987093492666658L;
        br.eaeu[2] = 6062163902895151153L;
        br.eaeu[3] = 5733492028357282516L;
        br.eaeu[4] = 7478579931554646706L;
        br.eaeu[5] = -3309904357623023361L;
        br.eaeu[6] = 8468815966923940928L;
        br.eaeu[7] = 6258825899729768367L;
        br.eaeu[8] = -3210004864198669698L;
        br.eaeu[9] = -5275541872938653226L;
        br.eaeu[10] = -2624766916176732379L;
        br.eaeu[11] = 2860415817708322878L;
        br.eaeu[12] = -4419347566732153174L;
        br.eaeu[13] = 7532929871416597036L;
        br.eaeu[14] = 7937747304872084701L;
        br.eaeu[15] = -6154359926872338062L;
        br.eaeu[16] = -4493617089678756782L;
        br.eaeu[17] = 5874851209670025115L;
        br.eaeu[18] = 546314095816744786L;
        br.eaeu[19] = 6210624928796902030L;
        br.eaeu[20] = -7249461137010284503L;
        br.eaeu[21] = -7058900841297877091L;
        br.eaeu[22] = 5242868557747624228L;
        br.eaeu[23] = -4006547913522008207L;
        br.eaeu[24] = -4132325812509508098L;
        br.eaeu[25] = 7069616543937641161L;
        br.eaeu[26] = 6085937464272358383L;
        br.eaeu[27] = -7764744465235334109L;
        br.eaeu[28] = -820058763928597024L;
        br.eaeu[29] = 1339382192463067748L;
        br.eaeu[30] = -228083292680566439L;
        br.eaeu[31] = 6059716557146353988L;
        br.eaeu[32] = 3909569634649799184L;
        br.eaeu[33] = 6831492547522094445L;
        br.eaeu[34] = -8822152405044080184L;
        br.eaeu[35] = -9059258090081338294L;
        br.eaeu[36] = -5636568572429729831L;
        br.eaeu[37] = -1208178112573522470L;
        br.eaeu[38] = 8868461659375668101L;
        br.eaeu[39] = 5693681781796547571L;
        br.eaeu[40] = 1989997607726232861L;
        br.eaeu[41] = -5030793274284256593L;
        br.eaeu[42] = -5650638303334018643L;
        br.eaeu[43] = 6333336861267837761L;
        br.eaeu[44] = -5177346202006602424L;
        br.eaeu[45] = -4896194278122376378L;
        br.eaeu[46] = -8364752130869155998L;
        br.eaeu[47] = -7547683690250011151L;
        br.eaeu[48] = -2525302100020118896L;
        br.eaeu[49] = 5341054008142429790L;
        br.eaeu[50] = 7383938735535196049L;
        br.eaeu[51] = 3538928318668556806L;
        br.eaeu[52] = 5190770567666171771L;
        br.eaeu[53] = -815629539902513884L;
        br.eaeu[54] = -6460035478349498532L;
        br.eaeu[55] = -13663690231263746L;
        br.eaeu[56] = -3855233929621395073L;
    }

    public static /* synthetic */ CallSite eaew(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void eaki() {
        br.eaev[0] = -7370504645285546183L;
        br.eaev[1] = -2006749304440632440L;
        br.eaev[2] = 8666511383893694005L;
        br.eaev[3] = 1189889349298725027L;
        br.eaev[4] = 2487066872408059350L;
        br.eaev[5] = -8881349138331177666L;
        br.eaev[6] = 104659268994269336L;
        br.eaev[7] = 300631552331192146L;
        br.eaev[8] = 7129939386419174334L;
        br.eaev[9] = 2820207526481115051L;
        br.eaev[10] = 921594056853223173L;
        br.eaev[11] = 4516042009320801066L;
        br.eaev[12] = -8302471468753348337L;
        br.eaev[13] = -8132656296067645802L;
        br.eaev[14] = 2768217299848570559L;
        br.eaev[15] = 3376904326802960898L;
        br.eaev[16] = 3793702600380814163L;
        br.eaev[17] = 6838039748612561009L;
        br.eaev[18] = -1451821032033131984L;
        br.eaev[19] = 9136051648451280899L;
        br.eaev[20] = 4371056139510313829L;
        br.eaev[21] = -3205820896416010589L;
        br.eaev[22] = 466046131534406538L;
        br.eaev[23] = -1712871203046383877L;
        br.eaev[24] = -5692755923272420762L;
        br.eaev[25] = -3347414116009981937L;
        br.eaev[26] = -8118197491487581510L;
        br.eaev[27] = -2864544107593166733L;
        br.eaev[28] = 3586376828145512842L;
        br.eaev[29] = 7195726280047046654L;
        br.eaev[30] = -869087223049191187L;
        br.eaev[31] = -2586819854155581250L;
        br.eaev[32] = -5508461081418718996L;
        br.eaev[33] = -4778115382275917410L;
        br.eaev[34] = -5748595284957767145L;
        br.eaev[35] = -2993582667658348712L;
        br.eaev[36] = -7900394423835603362L;
        br.eaev[37] = -7929038459918933855L;
        br.eaev[38] = 360615730762161245L;
        br.eaev[39] = -8883922296590370976L;
        br.eaev[40] = -7012293509194859937L;
        br.eaev[41] = -2619014769113965557L;
        br.eaev[42] = 254562584019848283L;
        br.eaev[43] = -2905726428609664713L;
        br.eaev[44] = 6670927920656196860L;
        br.eaev[45] = 2422412279985191426L;
        br.eaev[46] = 5616076774982022304L;
        br.eaev[47] = -2569701231574230196L;
        br.eaev[48] = -6569416562131577525L;
        br.eaev[49] = -3387868860883526916L;
        br.eaev[50] = 5616267681549263065L;
        br.eaev[51] = -6877703125523571602L;
        br.eaev[52] = -1357723307017372146L;
        br.eaev[53] = -8820137004174642563L;
        br.eaev[54] = 1611660217088592178L;
        br.eaev[55] = -9152935972964398451L;
        br.eaev[56] = 3644621094653862752L;
    }

    private static /* synthetic */ void eakg() {
        br.eafa[0] = -571212731;
        br.eafa[1] = -1491135390;
        br.eafa[2] = 654847188;
        br.eafa[3] = -1080054366;
        br.eafa[4] = 1454921995;
        br.eafa[5] = 1583947718;
        br.eafa[6] = -1843685787;
        br.eafa[7] = 1315420694;
        br.eafa[8] = -494248074;
        br.eafa[9] = 1489503343;
        br.eafa[10] = -1441324482;
        br.eafa[11] = 2087746391;
        br.eafa[12] = 1396139629;
        br.eafa[13] = 1651136727;
        br.eafa[14] = -771061277;
        br.eafa[15] = 2142847092;
        br.eafa[16] = 2143207869;
        br.eafa[17] = -881964099;
        br.eafa[18] = 199357084;
        br.eafa[19] = -1233231478;
        br.eafa[20] = 1564911637;
        br.eafa[21] = -1010787390;
        br.eafa[22] = -1996695262;
        br.eafa[23] = 185731529;
        br.eafa[24] = -1150421175;
        br.eafa[25] = 1594968263;
        br.eafa[26] = -1870275277;
        br.eafa[27] = -1145406725;
        br.eafa[28] = 1336191971;
        br.eafa[29] = 1314803891;
        br.eafa[30] = -1362265053;
        br.eafa[31] = -1525804707;
        br.eafa[32] = -717391061;
        br.eafa[33] = 183608943;
        br.eafa[34] = 1719738115;
        br.eafa[35] = 1739353857;
        br.eafa[36] = -761975603;
        br.eafa[37] = 456893484;
        br.eafa[38] = -151186390;
        br.eafa[39] = 1862355084;
        br.eafa[40] = -1223255771;
        br.eafa[41] = 297071467;
        br.eafa[42] = 167030392;
        br.eafa[43] = -102205007;
        br.eafa[44] = 605751542;
        br.eafa[45] = 1819308756;
        br.eafa[46] = -1542154659;
        br.eafa[47] = -1023049829;
        br.eafa[48] = -804968003;
        br.eafa[49] = 658196267;
        br.eafa[50] = -610507418;
        br.eafa[51] = 1517208976;
        br.eafa[52] = 702955177;
        br.eafa[53] = 875984803;
        br.eafa[54] = -1916189680;
        br.eafa[55] = 17719895;
        br.eafa[56] = -1978499739;
        br.eafa[57] = -1485516905;
        br.eafa[58] = -2025534542;
        br.eafa[59] = 221325476;
        br.eafa[60] = -933599364;
        br.eafa[61] = 2053341132;
        br.eafa[62] = 1875962071;
        br.eafa[63] = -18818224;
        br.eafa[64] = -869608013;
        br.eafa[65] = 429255680;
        br.eafa[66] = 1617026970;
        br.eafa[67] = -1632629631;
        br.eafa[68] = -528720453;
        br.eafa[69] = -1447651972;
        br.eafa[70] = 140120376;
        br.eafa[71] = 723107900;
        br.eafa[72] = -1986063814;
        br.eafa[73] = -2082501548;
        br.eafa[74] = -1668208201;
        br.eafa[75] = 71031329;
        br.eafa[76] = -82638435;
        br.eafa[77] = 140075212;
    }

    private static /* synthetic */ void eakf() {
        br.eaez[0] = 571212730;
        br.eaez[1] = -2058259189;
        br.eaez[2] = -654847189;
        br.eaez[3] = -1186997459;
        br.eaez[4] = 449788456;
        br.eaez[5] = -1583947719;
        br.eaez[6] = 204800261;
        br.eaez[7] = 1315420692;
        br.eaez[8] = -494248076;
        br.eaez[9] = 1489503340;
        br.eaez[10] = -1441324481;
        br.eaez[11] = -2087746392;
        br.eaez[12] = 1099352587;
        br.eaez[13] = -1651136728;
        br.eaez[14] = -797315549;
        br.eaez[15] = -960677099;
        br.eaez[16] = 2143207868;
        br.eaez[17] = 2003445558;
        br.eaez[18] = 199357087;
        br.eaez[19] = -1233231480;
        br.eaez[20] = 1564911637;
        br.eaez[21] = -1010787391;
        br.eaez[22] = -777125;
        br.eaez[23] = -185731530;
        br.eaez[24] = -1289986282;
        br.eaez[25] = 1594968261;
        br.eaez[26] = -1870275279;
        br.eaez[27] = -1145406727;
        br.eaez[28] = 1336191969;
        br.eaez[29] = 1314803890;
        br.eaez[30] = -1362265056;
        br.eaez[31] = -1525804705;
        br.eaez[32] = -717391064;
        br.eaez[33] = -183608944;
        br.eaez[34] = 618462786;
        br.eaez[35] = -1739353858;
        br.eaez[36] = -458205968;
        br.eaez[37] = -456893485;
        br.eaez[38] = 554921790;
        br.eaez[39] = 1862355084;
        br.eaez[40] = -1223255775;
        br.eaez[41] = 297071464;
        br.eaez[42] = 167030394;
        br.eaez[43] = -102205003;
        br.eaez[44] = -605751543;
        br.eaez[45] = -1975673635;
        br.eaez[46] = -1542154657;
        br.eaez[47] = -1023049830;
        br.eaez[48] = -804968007;
        br.eaez[49] = 658196264;
        br.eaez[50] = -610507422;
        br.eaez[51] = -1517208977;
        br.eaez[52] = -847450568;
        br.eaez[53] = 875984802;
        br.eaez[54] = -1642522982;
        br.eaez[55] = -17719896;
        br.eaez[56] = 849285511;
        br.eaez[57] = -1485516907;
        br.eaez[58] = -2025534542;
        br.eaez[59] = 221325478;
        br.eaez[60] = -933599368;
        br.eaez[61] = 2053341132;
        br.eaez[62] = 1875962070;
        br.eaez[63] = 1347319511;
        br.eaez[64] = 869608012;
        br.eaez[65] = 1779656710;
        br.eaez[66] = -1617026971;
        br.eaez[67] = 236716703;
        br.eaez[68] = -528720456;
        br.eaez[69] = -1447651972;
        br.eaez[70] = 140120376;
        br.eaez[71] = 723107902;
        br.eaez[72] = -1986063816;
        br.eaez[73] = -2082501548;
        br.eaez[74] = -1668208204;
        br.eaez[75] = 71031331;
        br.eaez[76] = -82638435;
        br.eaez[77] = 140075212;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void setSlotId(int var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = br.ka - br.eaew("eaid", eaet(int ), (int)37)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == br.eaew("eaie", eaey(int ), (int)44)) break;
            v0 /* !! */  = (long)br.eaew("eaif", eaey(int ), (int)45);
        }
        var4_2 = br.c;
        v1 /* !! */  = br.ka;
        if (true) ** GOTO lbl12
        block21: while (true) {
            v1 /* !! */  = (long)(br.eaew("eaih", eaet(int ), (int)39) - br.eaew("eaig", eaet(int ), (int)38));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 1022648820: {
                    break block21;
                }
                case 1769377907: {
                    continue block21;
                }
            }
            break;
        }
        var3_3 /* !! */  = br.b;
        v2 /* !! */  = br.ka;
        if (true) ** GOTO lbl22
        block22: while (true) {
            v2 /* !! */  = (long)(v3 - br.eaew("eaii", eaet(int ), (int)40));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -550992105: {
                    v3 = br.eaew("eaij", eaet(int ), (int)41);
                    continue block22;
                }
                case 1022648820: {
                    break block22;
                }
                case 1664847000: {
                    v3 = br.eaew("eaik", eaet(int ), (int)42);
                    continue block22;
                }
            }
            break;
        }
        var2_4 = br.a;
        if (var4_2) {
            throw null;
lbl34:
            // 3 sources

            return;
        }
        if (var2_4) ** GOTO lbl34
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** GOTO lbl34
                v4 /* !! */  = br.ka;
                if (true) ** GOTO lbl45
                block24: while (true) {
                    v4 /* !! */  = (long)(br.eaew("eaim", eaet(int ), (int)44) - br.eaew("eail", eaet(int ), (int)43));
lbl45:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -92397578: {
                            continue block24;
                        }
                        case 1022648820: {
                            break block24;
                        }
                    }
                    break;
                }
                this.slotId = var1_1;
                if (var2_4) ** continue;
                return;
            }
            case 0: {
                var3_3 /* !! */  = (int)br.eaew("eain", eaey(int ), (int)46);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl67
            }
            case 1: {
                var3_3 /* !! */  = (int)br.eaew("eaio", eaey(int ), (int)47);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl67
            }
            case 2: {
                var3_3 /* !! */  = (int)br.eaew("eaip", eaey(int ), (int)48);
                if (!var4_2) break;
                throw null;
            }
lbl67:
            // 3 sources

            case 3: {
                var3_3 /* !! */  = (int)br.eaew("eaiq", eaey(int ), (int)49);
                if (!var4_2) break;
                throw null;
            }
            case 4: 
        }
        do {
            var3_3 /* !! */  = (int)br.eaew("eair", eaey(int ), (int)50);
        } while (!var4_2);
        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public void setWindowId(int var1_1) {
        block23: {
            v0 /* !! */  = br.ka;
            block11: while (true) {
                switch ((int)v0 /* !! */ ) {
                    case -1656107938: {
                        v0 /* !! */  = (long)(br.eaew("eaho", eaet(int ), (int)33) - br.eaew("eahn", eaet(int ), (int)32));
                        continue block11;
                    }
                    case 1022648820: {
                        break block11;
                    }
                }
                break;
            }
            var4_2 = br.c;
            while (true) {
                if ((v1 /* !! */  = (cfr_temp_1 = br.ka - br.eaew("eahp", eaet(int ), (int)34)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v1 /* !! */  == br.eaew("eahq", eaey(int ), (int)33)) break;
                v1 /* !! */  = (long)br.eaew("eahr", eaey(int ), (int)34);
            }
            var3_3 /* !! */  = br.b;
            while (true) {
                if ((v2 /* !! */  = (cfr_temp_2 = br.ka - br.eaew("eahs", eaet(int ), (int)35)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v2 /* !! */  == br.eaew("eaht", eaey(int ), (int)35)) {
                    var2_4 = br.a;
                    if (var4_2) {
                        throw null;
                    }
                    break;
                }
                v2 /* !! */  = (long)br.eaew("eahu", eaey(int ), (int)36);
            }
            if (var2_4 || var2_4) return;
            while (true) {
                block24: {
                    if ((v3 /* !! */  = (cfr_temp_3 = br.ka - br.eaew("eahv", eaet(int ), (int)36)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == br.eaew("eahw", eaey(int ), (int)37)) {
                        this.windowId = var1_1;
                        if (!var2_4) break;
                    }
                    break block24;
                    return;
                }
                v3 /* !! */  = (long)br.eaew("eahx", eaey(int ), (int)38);
            }
            if (var3_3 /* !! */  == 0) return;
            cfr_temp_0 = -2147483648;
            block15: do {
                switch (cfr_temp_0 == -2147483648 ? var3_3 /* !! */  : cfr_temp_0) {
                    default: {
                        return;
                    }
                    case 0: {
                        var3_3 /* !! */  = (int)br.eaew("eahy", eaey(int ), (int)39);
                        if (var4_2) {
                            throw null;
                        }
                        break block23;
                    }
                    case 1: {
                        var3_3 /* !! */  = (int)br.eaew("eahz", eaey(int ), (int)40);
                        if (var4_2) {
                            throw null;
                        }
                        break block23;
                    }
                    case 2: {
                        ** break;
                    }
                    case 4: {
                        break block23;
                    }
lbl56:
                    // 2 sources

                    while (true) {
                        var3_3 /* !! */  = (int)br.eaew("eaia", eaey(int ), (int)41);
                        cfr_temp_0 = 3;
                        if (!var4_2) continue block15;
                        throw null;
                    }
                    case 3: 
                }
                break;
            } while (true);
            var3_3 /* !! */  = (int)br.eaew("eaib", eaey(int ), (int)42);
            if (var4_2) {
                throw null;
            }
        }
        var3_3 /* !! */  = (int)br.eaew("eaic", eaey(int ), (int)43);
        ** while (!var4_2)
lbl70:
        // 1 sources

        throw null;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public class_1713 getActionType() {
        Object object = ka;
        boolean bl2 = true;
        block21: while (true) {
            CallSite callSite;
            if (!bl2 || (bl2 = false) || !true) {
                object = callSite - br.eaew("eagw", eaet(int ), (int)19);
            }
            switch ((int)object) {
                case -190926623: {
                    callSite = br.eaew("eagx", eaet(int ), (int)20);
                    continue block21;
                }
                case 352071039: {
                    callSite = br.eaew("eagy", eaet(int ), (int)21);
                    continue block21;
                }
                case 1022648820: {
                    break block21;
                }
            }
            break;
        }
        boolean bl3 = c;
        Object object2 = ka;
        block22: while (true) {
            switch ((int)object2) {
                case -1264755538: {
                    object2 = br.eaew("eaha", eaet(int ), (int)23) - br.eaew("eagz", eaet(int ), (int)22);
                    continue block22;
                }
                case 1022648820: {
                    break block22;
                }
            }
            break;
        }
        int n2 = b;
        Object object3 = ka;
        boolean bl4 = true;
        block23: while (true) {
            CallSite callSite;
            if (!bl4 || (bl4 = false) || !true) {
                object3 = callSite - br.eaew("eahb", eaet(int ), (int)24);
            }
            switch ((int)object3) {
                case 16344826: {
                    callSite = br.eaew("eahc", eaet(int ), (int)25);
                    continue block23;
                }
                case 939806075: {
                    callSite = br.eaew("eahd", eaet(int ), (int)26);
                    continue block23;
                }
                case 1022648820: {
                    break block23;
                }
                case 1228336036: {
                    callSite = br.eaew("eahe", eaet(int ), (int)27);
                    continue block23;
                }
            }
            break;
        }
        boolean bl5 = a;
        if (bl3) {
            throw null;
        }
        if (bl5) return null;
        if (bl5) return null;
        Object object4 = ka;
        boolean bl6 = true;
        block24: while (true) {
            CallSite callSite;
            if (!bl6 || (bl6 = false) || !true) {
                object4 = callSite - br.eaew("eahf", eaet(int ), (int)28);
            }
            switch ((int)object4) {
                case -248526876: {
                    callSite = br.eaew("eahg", eaet(int ), (int)29);
                    continue block24;
                }
                case 289750789: {
                    callSite = br.eaew("eahh", eaet(int ), (int)30);
                    continue block24;
                }
                case 1022648820: {
                    return this.actionType;
                }
                case 1163059817: {
                    callSite = br.eaew("eahi", eaet(int ), (int)31);
                    continue block24;
                }
            }
            break;
        }
        return this.actionType;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void setActionType(class_1713 var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = br.ka - br.eaew("eajj", eaet(int ), (int)51)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == br.eaew("eajk", eaey(int ), (int)62)) break;
            v0 /* !! */  = (long)br.eaew("eajl", eaey(int ), (int)63);
        }
        var4_2 = br.c;
        v1 /* !! */  = br.ka;
        if (true) ** GOTO lbl11
        block6: while (true) {
            v1 /* !! */  = (long)(v2 - br.eaew("eajm", eaet(int ), (int)52));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -259509474: {
                    v2 = br.eaew("eajn", eaet(int ), (int)53);
                    continue block6;
                }
                case 389277254: {
                    v2 = br.eaew("eajo", eaet(int ), (int)54);
                    continue block6;
                }
                case 1022648820: {
                    break block6;
                }
            }
            break;
        }
        var3_3 = br.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = br.ka - br.eaew("eajp", eaet(int ), (int)55)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == br.eaew("eajq", eaey(int ), (int)64)) break;
            v3 /* !! */  = (long)br.eaew("eajr", eaey(int ), (int)65);
        }
        var2_4 = br.a;
        if (var4_2) {
            throw null;
lbl29:
            // 2 sources

            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl29
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_2 = br.ka - br.eaew("eajs", eaet(int ), (int)56)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == br.eaew("eajt", eaey(int ), (int)66)) break;
            v4 /* !! */  = (long)br.eaew("eaju", eaey(int ), (int)67);
        }
        this.actionType = var1_1;
        if (!var2_4) ** break;
        ** while (true)
    }

    static {
        eaez = new int[78];
        eafa = new int[78];
        br.eakf();
        br.eakg();
        eaeu = new long[57];
        eaev = new long[57];
        br.eakh();
        br.eaki();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public int getButton() {
        v0 /* !! */  = br.ka;
        if (true) ** GOTO lbl5
        block20: while (true) {
            v0 /* !! */  = (long)(v1 - br.eaew("eagg", eaet(int ), (int)10));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -2095846337: {
                    v1 = br.eaew("eagh", eaet(int ), (int)11);
                    continue block20;
                }
                case 1152457: {
                    v1 = br.eaew("eagi", eaet(int ), (int)12);
                    continue block20;
                }
                case 1022648820: {
                    break block20;
                }
            }
            break;
        }
        var3_1 = br.c;
        v2 /* !! */  = br.ka;
        if (true) ** GOTO lbl19
        block21: while (true) {
            v2 /* !! */  = (long)(br.eaew("eagk", eaet(int ), (int)14) - br.eaew("eagj", eaet(int ), (int)13));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1968767887: {
                    continue block21;
                }
                case 1022648820: {
                    break block21;
                }
            }
            break;
        }
        var2_2 /* !! */  = br.b;
        v3 /* !! */  = br.ka;
        if (true) ** GOTO lbl29
        block22: while (true) {
            v3 /* !! */  = (long)(v4 - br.eaew("eagl", eaet(int ), (int)15));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case 1022648820: {
                    break block22;
                }
                case 1079686982: {
                    v4 = br.eaew("eagm", eaet(int ), (int)16);
                    continue block22;
                }
                case 1643532505: {
                    v4 = br.eaew("eagn", eaet(int ), (int)17);
                    continue block22;
                }
            }
            break;
        }
        var1_3 = br.a;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_1) {
                    throw null;
                    return (int)br.eaew("eago", eaey(int ), (int)22);
                }
                if (var1_3 || var1_3) ** continue;
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_0 = br.ka - br.eaew("eagp", eaet(int ), (int)18)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == br.eaew("eagq", eaey(int ), (int)23)) break;
                    v5 /* !! */  = (long)br.eaew("eagr", eaey(int ), (int)24);
                }
                return this.button;
            }
lbl54:
            // 2 sources

            case 0: {
                do {
                    var2_2 /* !! */  = (int)br.eaew("eags", eaey(int ), (int)25);
                } while (!var3_1);
                throw null;
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)br.eaew("eagt", eaey(int ), (int)26);
                    if (!var3_1) ** GOTO lbl54
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)br.eaew("eagu", eaey(int ), (int)27);
                if (!var3_1) break;
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)br.eaew("eagv", eaey(int ), (int)28);
        ** while (!var3_1)
lbl71:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ long eaet(int n2) {
        return eaeu[n2] ^ eaev[n2];
    }

    private static /* synthetic */ int eaey(int n2) {
        return eaez[n2] ^ eafa[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public int getSlotId() {
        v0 /* !! */  = br.ka;
        if (true) ** GOTO lbl5
        block10: while (true) {
            v0 /* !! */  = (long)(br.eaew("eafr", eaet(int ), (int)6) - br.eaew("eafq", eaet(int ), (int)5));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1845456573: {
                    continue block10;
                }
                case 1022648820: {
                    break block10;
                }
            }
            break;
        }
        var3_1 = br.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = br.ka - br.eaew("eafs", eaet(int ), (int)7)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == br.eaew("eaft", eaey(int ), (int)11)) break;
            v1 /* !! */  = (long)br.eaew("eafu", eaey(int ), (int)12);
        }
        var2_2 /* !! */  = br.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = br.ka - br.eaew("eafv", eaet(int ), (int)8)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == br.eaew("eafw", eaey(int ), (int)13)) break;
            v2 /* !! */  = (long)br.eaew("eafx", eaey(int ), (int)14);
        }
        var1_3 = br.a;
        if (var3_1) {
            throw null;
lbl27:
            // 1 sources

            return (int)br.eaew("eafy", eaey(int ), (int)15);
        }
        ** while (var1_3 || var1_3)
lbl30:
        // 1 sources

        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = br.ka - br.eaew("eafz", eaet(int ), (int)9)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == br.eaew("eaga", eaey(int ), (int)16)) break;
                    v3 /* !! */  = (long)br.eaew("eagb", eaey(int ), (int)17);
                }
                return this.slotId;
            }
            case 0: {
                var2_2 /* !! */  = (int)br.eaew("eagc", eaey(int ), (int)18);
                if (!var3_1) break;
                throw null;
            }
            case 1: {
                var2_2 /* !! */  = (int)br.eaew("eagd", eaey(int ), (int)19);
                if (!var3_1) break;
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)br.eaew("eage", eaey(int ), (int)20);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)br.eaew("eagf", eaey(int ), (int)21);
        ** while (!var3_1)
lbl56:
        // 1 sources

        throw null;
    }
}

