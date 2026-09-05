/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_124
 *  net.minecraft.class_2558
 *  net.minecraft.class_2558$class_10609
 *  net.minecraft.class_2561
 *  net.minecraft.class_2583
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.List;
import java.util.stream.Stream;
import net.minecraft.class_124;
import net.minecraft.class_2558;
import net.minecraft.class_2561;
import net.minecraft.class_2583;
import ruhack.phobia.f;
import ruhack.phobia.g;
import ruhack.phobia.i;
import ruhack.phobia.mk;

public final class r
extends f {
    private static long[] aevc;
    public static final long bs = 429025638317726031L;
    public static final boolean a;
    private static int[] aeqf;
    private final mk client;
    private static int[] aeqg;
    public static final int b;
    private static long[] aevb;
    public static final boolean c;

    private static /* synthetic */ void afau() {
        r.aevc[0] = -2043647450879404539L;
        r.aevc[1] = 2680563243633994268L;
        r.aevc[2] = 3186138463776235920L;
        r.aevc[3] = 7217872072564676421L;
        r.aevc[4] = -6880605650599994233L;
        r.aevc[5] = 1506698942211950678L;
        r.aevc[6] = -3507416568204992673L;
        r.aevc[7] = 5417234567609021951L;
        r.aevc[8] = 4208654406936774086L;
        r.aevc[9] = -5984225514312699060L;
        r.aevc[10] = 686013999007478526L;
        r.aevc[11] = -3906325785884858875L;
        r.aevc[12] = -5798856214829879200L;
        r.aevc[13] = -3829846268069843563L;
        r.aevc[14] = -172464227352819303L;
        r.aevc[15] = 8992273540414506391L;
        r.aevc[16] = 8617993634748784345L;
        r.aevc[17] = 451537957984311858L;
        r.aevc[18] = 6295744508319502586L;
        r.aevc[19] = 2354941869537507190L;
        r.aevc[20] = -6183269166671458469L;
        r.aevc[21] = 7877710207351861416L;
        r.aevc[22] = 229486303443309568L;
        r.aevc[23] = -1662506698579605619L;
        r.aevc[24] = 849334407723397582L;
        r.aevc[25] = -7666560827360061490L;
        r.aevc[26] = -3553898230668645891L;
        r.aevc[27] = -7969725493431573073L;
        r.aevc[28] = 2592493248940960287L;
        r.aevc[29] = -574750463697223211L;
        r.aevc[30] = -1671381578193038696L;
        r.aevc[31] = 2440399042974591285L;
        r.aevc[32] = -9041366252523639308L;
        r.aevc[33] = 970847308229678826L;
        r.aevc[34] = 7730859134634929403L;
        r.aevc[35] = 8611319484652563137L;
        r.aevc[36] = 522545596074199508L;
        r.aevc[37] = -7995772146572366955L;
        r.aevc[38] = 6437873660689077416L;
        r.aevc[39] = -3289387023280089332L;
        r.aevc[40] = -3166434854213084765L;
        r.aevc[41] = 1630857693200316900L;
        r.aevc[42] = 5913156372603666964L;
        r.aevc[43] = -149978477710538730L;
        r.aevc[44] = -5097113460625580054L;
        r.aevc[45] = 4328751395629542723L;
        r.aevc[46] = 2910857033228924759L;
        r.aevc[47] = -4010185609917112763L;
        r.aevc[48] = -8554999279649915065L;
    }

    private static /* synthetic */ void afas() {
        r.aeqg[200] = 1478851067;
        r.aeqg[201] = 324583737;
        r.aeqg[202] = -501298111;
        r.aeqg[203] = 796688956;
        r.aeqg[204] = -160829786;
        r.aeqg[205] = 573865716;
        r.aeqg[206] = 1966574011;
        r.aeqg[207] = -148785848;
        r.aeqg[208] = -1365223766;
        r.aeqg[209] = 765029332;
        r.aeqg[210] = -591624798;
        r.aeqg[211] = -1024345915;
        r.aeqg[212] = -1794278880;
    }

    private static /* synthetic */ void afan() {
        r.aeqf[0] = 1702612630;
        r.aeqf[1] = 158552207;
        r.aeqf[2] = -203800450;
        r.aeqf[3] = 458315275;
        r.aeqf[4] = -1765312531;
        r.aeqf[5] = 1608386782;
        r.aeqf[6] = 118399451;
        r.aeqf[7] = -1649478507;
        r.aeqf[8] = 135241398;
        r.aeqf[9] = -1737145495;
        r.aeqf[10] = 662755096;
        r.aeqf[11] = 550396053;
        r.aeqf[12] = -139816719;
        r.aeqf[13] = 392813377;
        r.aeqf[14] = -1642999868;
        r.aeqf[15] = 51189130;
        r.aeqf[16] = 1136532245;
        r.aeqf[17] = 1692925242;
        r.aeqf[18] = -907973952;
        r.aeqf[19] = 1558685688;
        r.aeqf[20] = 656503235;
        r.aeqf[21] = -177257617;
        r.aeqf[22] = -1902249987;
        r.aeqf[23] = 867100999;
        r.aeqf[24] = 217722792;
        r.aeqf[25] = 1527161565;
        r.aeqf[26] = 978435930;
        r.aeqf[27] = 480037115;
        r.aeqf[28] = 2026695168;
        r.aeqf[29] = -485552258;
        r.aeqf[30] = -981360584;
        r.aeqf[31] = -132091147;
        r.aeqf[32] = -1664245149;
        r.aeqf[33] = 1665268186;
        r.aeqf[34] = 1108156401;
        r.aeqf[35] = -1800571380;
        r.aeqf[36] = -1547009168;
        r.aeqf[37] = -1315501236;
        r.aeqf[38] = -1284409707;
        r.aeqf[39] = -892210619;
        r.aeqf[40] = -1967217147;
        r.aeqf[41] = -1197553948;
        r.aeqf[42] = -1693027012;
        r.aeqf[43] = 773066435;
        r.aeqf[44] = 750897880;
        r.aeqf[45] = -225056013;
        r.aeqf[46] = -2040180606;
        r.aeqf[47] = 1867990522;
        r.aeqf[48] = 1709522269;
        r.aeqf[49] = 458211745;
        r.aeqf[50] = 2144775510;
        r.aeqf[51] = 2056143163;
        r.aeqf[52] = -304260230;
        r.aeqf[53] = 1247002575;
        r.aeqf[54] = -1725531785;
        r.aeqf[55] = -1434037820;
        r.aeqf[56] = 1968859848;
        r.aeqf[57] = 896340734;
        r.aeqf[58] = -525242445;
        r.aeqf[59] = -555368399;
        r.aeqf[60] = 1340783085;
        r.aeqf[61] = -827259496;
        r.aeqf[62] = 266948484;
        r.aeqf[63] = 306610166;
        r.aeqf[64] = 1667970820;
        r.aeqf[65] = -1578408894;
        r.aeqf[66] = -1979046332;
        r.aeqf[67] = 1156253259;
        r.aeqf[68] = -2069168614;
        r.aeqf[69] = -2102511909;
        r.aeqf[70] = -636734162;
        r.aeqf[71] = 874727959;
        r.aeqf[72] = -633765635;
        r.aeqf[73] = 674530232;
        r.aeqf[74] = -1703718476;
        r.aeqf[75] = -1286328978;
        r.aeqf[76] = 1235111476;
        r.aeqf[77] = 85849866;
        r.aeqf[78] = 2052443179;
        r.aeqf[79] = 1643370833;
        r.aeqf[80] = -2085314575;
        r.aeqf[81] = -385642055;
        r.aeqf[82] = 637678263;
        r.aeqf[83] = 2112999120;
        r.aeqf[84] = -1714149223;
        r.aeqf[85] = 390319028;
        r.aeqf[86] = 139233140;
        r.aeqf[87] = 1277800062;
        r.aeqf[88] = 1913902889;
        r.aeqf[89] = 1801896662;
        r.aeqf[90] = -922698614;
        r.aeqf[91] = -588514499;
        r.aeqf[92] = 1015709287;
        r.aeqf[93] = -1235131449;
        r.aeqf[94] = -696154368;
        r.aeqf[95] = 832070193;
        r.aeqf[96] = -1321428685;
        r.aeqf[97] = -1291276816;
        r.aeqf[98] = 964157388;
        r.aeqf[99] = 502873982;
    }

    private static /* synthetic */ void afar() {
        r.aeqg[100] = 1302699635;
        r.aeqg[101] = 561279166;
        r.aeqg[102] = 183027676;
        r.aeqg[103] = -725061449;
        r.aeqg[104] = -1531013153;
        r.aeqg[105] = -886886224;
        r.aeqg[106] = -1672733163;
        r.aeqg[107] = 1321317496;
        r.aeqg[108] = -1270157447;
        r.aeqg[109] = 1252462328;
        r.aeqg[110] = 1066967533;
        r.aeqg[111] = -1759046492;
        r.aeqg[112] = -514873071;
        r.aeqg[113] = 2076040473;
        r.aeqg[114] = 2145808639;
        r.aeqg[115] = 870328791;
        r.aeqg[116] = -81233245;
        r.aeqg[117] = -499859914;
        r.aeqg[118] = -209021241;
        r.aeqg[119] = 312816914;
        r.aeqg[120] = 1676769296;
        r.aeqg[121] = 823786164;
        r.aeqg[122] = -387547305;
        r.aeqg[123] = 629408433;
        r.aeqg[124] = 707309044;
        r.aeqg[125] = 2039488858;
        r.aeqg[126] = 1770456179;
        r.aeqg[127] = -2097746149;
        r.aeqg[128] = -175369639;
        r.aeqg[129] = 1616330044;
        r.aeqg[130] = 1527620462;
        r.aeqg[131] = 659187076;
        r.aeqg[132] = 2033808224;
        r.aeqg[133] = 453290393;
        r.aeqg[134] = -903763416;
        r.aeqg[135] = -209810838;
        r.aeqg[136] = -1517702857;
        r.aeqg[137] = 1315129542;
        r.aeqg[138] = -1981131847;
        r.aeqg[139] = 1982826575;
        r.aeqg[140] = 255782481;
        r.aeqg[141] = -36794978;
        r.aeqg[142] = 2096724694;
        r.aeqg[143] = -720733766;
        r.aeqg[144] = -485616257;
        r.aeqg[145] = 2027129066;
        r.aeqg[146] = -127128678;
        r.aeqg[147] = 1300836503;
        r.aeqg[148] = -185485553;
        r.aeqg[149] = 1042158039;
        r.aeqg[150] = 1230937947;
        r.aeqg[151] = 434783627;
        r.aeqg[152] = -1567604606;
        r.aeqg[153] = -2139799342;
        r.aeqg[154] = 348488538;
        r.aeqg[155] = -2004004867;
        r.aeqg[156] = -976931931;
        r.aeqg[157] = 1209710854;
        r.aeqg[158] = -969392680;
        r.aeqg[159] = -1789335680;
        r.aeqg[160] = -1916765310;
        r.aeqg[161] = 912819192;
        r.aeqg[162] = 1649341749;
        r.aeqg[163] = -1517237894;
        r.aeqg[164] = -702733787;
        r.aeqg[165] = -1568217715;
        r.aeqg[166] = -1539865646;
        r.aeqg[167] = 540455477;
        r.aeqg[168] = -451378742;
        r.aeqg[169] = -1516818408;
        r.aeqg[170] = -1974617755;
        r.aeqg[171] = -1808656337;
        r.aeqg[172] = 248473830;
        r.aeqg[173] = -882151771;
        r.aeqg[174] = -1118412176;
        r.aeqg[175] = -1124762420;
        r.aeqg[176] = -1002022241;
        r.aeqg[177] = -438170018;
        r.aeqg[178] = -924434472;
        r.aeqg[179] = -1657483689;
        r.aeqg[180] = -1563368834;
        r.aeqg[181] = -1291306449;
        r.aeqg[182] = 1770546103;
        r.aeqg[183] = -1475254714;
        r.aeqg[184] = -521277597;
        r.aeqg[185] = -1584149331;
        r.aeqg[186] = 2049771376;
        r.aeqg[187] = 537995201;
        r.aeqg[188] = 1553623480;
        r.aeqg[189] = -1393558477;
        r.aeqg[190] = -244895996;
        r.aeqg[191] = -1265991067;
        r.aeqg[192] = 830109929;
        r.aeqg[193] = 2499918;
        r.aeqg[194] = -1332695645;
        r.aeqg[195] = -1601741500;
        r.aeqg[196] = -565367789;
        r.aeqg[197] = 1872648026;
        r.aeqg[198] = 944856966;
        r.aeqg[199] = 767372848;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void usage() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = r.bs - r.aeqh("aezm", aeva(int ), (int)34)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == r.aeqh("aezn", aeqe(int ), (int)201)) break;
            v0 /* !! */  = (long)r.aeqh("aezo", aeqe(int ), (int)202);
        }
        var3_1 = r.c;
        v1 /* !! */  = r.bs;
        if (true) ** GOTO lbl11
        block29: while (true) {
            v1 /* !! */  = (long)(v2 - r.aeqh("aezp", aeva(int ), (int)35));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -2089379505: {
                    break block29;
                }
                case -130738484: {
                    v2 = r.aeqh("aezq", aeva(int ), (int)36);
                    continue block29;
                }
                case 310817142: {
                    v2 = r.aeqh("aezr", aeva(int ), (int)37);
                    continue block29;
                }
                case 1259788985: {
                    v2 = r.aeqh("aezs", aeva(int ), (int)38);
                    continue block29;
                }
            }
            break;
        }
        var2_2 /* !! */  = r.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = r.bs - r.aeqh("aezt", aeva(int ), (int)39)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == r.aeqh("aezu", aeqe(int ), (int)203)) break;
            v3 /* !! */  = (long)r.aeqh("aezv", aeqe(int ), (int)204);
        }
        var1_3 = r.a;
        if (var3_1) {
            throw null;
lbl32:
            // 2 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl32
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v4 /* !! */  = r.bs;
                if (true) ** GOTO lbl42
                block32: while (true) {
                    v4 /* !! */  = (long)(v5 - r.aeqh("aezw", aeva(int ), (int)40));
lbl42:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -2089379505: {
                            break block32;
                        }
                        case -1628159588: {
                            v5 = r.aeqh("aezx", aeva(int ), (int)41);
                            continue block32;
                        }
                        case 805273144: {
                            v5 = r.aeqh("aezy", aeva(int ), (int)42);
                            continue block32;
                        }
                        case 1761390877: {
                            v5 = r.aeqh("aezz", aeva(int ), (int)43);
                            continue block32;
                        }
                    }
                    break;
                }
                v6 = class_2561.method_43470((String)"\u0418\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u043d\u0438\u0435: .party create | invite <login> | leave | disband | info");
                v7 /* !! */  = r.bs;
                if (true) ** GOTO lbl59
                block33: while (true) {
                    v7 /* !! */  = (long)(r.aeqh("afab", aeva(int ), (int)45) - r.aeqh("afaa", aeva(int ), (int)44));
lbl59:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -2089379505: {
                            break block33;
                        }
                        case -1778725822: {
                            continue block33;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_2 = r.bs - r.aeqh("afac", aeva(int ), (int)46)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == r.aeqh("afad", aeqe(int ), (int)205)) break;
                    v8 /* !! */  = (long)r.aeqh("afae", aeqe(int ), (int)206);
                }
                v9 = v6.method_27692(class_124.field_1080);
                v10 /* !! */  = r.bs;
                if (true) ** GOTO lbl74
                block35: while (true) {
                    v10 /* !! */  = (long)(r.aeqh("afag", aeva(int ), (int)48) - r.aeqh("afaf", aeva(int ), (int)47));
lbl74:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -2089379505: {
                            break block35;
                        }
                        case 868948458: {
                            continue block35;
                        }
                    }
                    break;
                }
                this.logDirect(v9);
                if (var1_3 || var1_3) ** continue;
                return;
            }
            case 0: {
                var2_2 /* !! */  = (int)r.aeqh("afah", aeqe(int ), (int)207);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl102
            }
lbl87:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)r.aeqh("afai", aeqe(int ), (int)208);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl98
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)r.aeqh("afaj", aeqe(int ), (int)209);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl102
                    break;
                }
            }
lbl98:
            // 2 sources

            case 3: {
                var2_2 /* !! */  = (int)r.aeqh("afak", aeqe(int ), (int)210);
                if (!var3_1) break;
                throw null;
            }
lbl102:
            // 3 sources

            case 4: {
                var2_2 /* !! */  = (int)r.aeqh("afal", aeqe(int ), (int)211);
                if (!var3_1) ** GOTO lbl87
                throw null;
            }
            case 5: 
        }
        var2_2 /* !! */  = (int)r.aeqh("afam", aeqe(int ), (int)212);
        ** while (!var3_1)
lbl109:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public List<String> getLongDesc() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = r.bs - r.aeqh("aexj", aeva(int ), (int)30)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == r.aeqh("aexk", aeqe(int ), (int)150)) break;
            v0 /* !! */  = (long)r.aeqh("aexl", aeqe(int ), (int)151);
        }
        var3_1 = r.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = r.bs - r.aeqh("aexm", aeva(int ), (int)31)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == r.aeqh("aexn", aeqe(int ), (int)152)) break;
            v1 /* !! */  = (long)r.aeqh("aexo", aeqe(int ), (int)153);
        }
        var2_2 /* !! */  = r.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = r.bs - r.aeqh("aexp", aeva(int ), (int)32)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == r.aeqh("aexq", aeqe(int ), (int)154)) break;
            v2 /* !! */  = (long)r.aeqh("aexr", aeqe(int ), (int)155);
        }
        var1_3 = r.a;
        if (var3_1) {
            throw null;
lbl24:
            // 2 sources

            return null;
        }
        if (var1_3) ** GOTO lbl24
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block0 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_3 = r.bs - r.aeqh("aexs", aeva(int ), (int)33)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == r.aeqh("aext", aeqe(int ), (int)156)) break;
                    v3 /* !! */  = (long)r.aeqh("aexu", aeqe(int ), (int)157);
                }
                return List.of("\u0423\u043f\u0440\u0430\u0432\u043b\u044f\u0435\u0442 \u043e\u0431\u0449\u0435\u0439 Party \u0447\u0435\u0440\u0435\u0437 IRC-\u0441\u0435\u0440\u0432\u0435\u0440.", "> party create - \u0441\u043e\u0437\u0434\u0430\u0442\u044c Party", "> party invite <login> - \u0434\u043e\u0431\u0430\u0432\u0438\u0442\u044c \u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u0442\u0435\u043b\u044f", "> party leave - \u043f\u043e\u043a\u0438\u043d\u0443\u0442\u044c Party", "> party disband - \u0440\u0430\u0441\u043f\u0443\u0441\u0442\u0438\u0442\u044c Party", "> party info - \u043f\u043e\u043a\u0430\u0437\u0430\u0442\u044c \u0441\u043e\u0441\u0442\u0430\u0432 Party");
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)r.aeqh("aexv", aeqe(int ), (int)158);
                    if (!var3_1) break block0;
                    throw null;
                }
            }
lbl43:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)r.aeqh("aexw", aeqe(int ), (int)159);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)r.aeqh("aexx", aeqe(int ), (int)160);
                if (!var3_1) ** GOTO lbl43
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)r.aeqh("aexy", aeqe(int ), (int)161);
        ** while (!var3_1)
lbl54:
        // 1 sources

        throw null;
    }

    public static /* synthetic */ CallSite aeqh(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public Stream<String> tabComplete(String var1_1, String[] var2_2) {
        block60: {
            block59: {
                v0 /* !! */  = r.bs;
                if (true) ** GOTO lbl5
                block42: while (true) {
                    v0 /* !! */  = (long)(r.aeqh("aeve", aeva(int ), (int)1) - r.aeqh("aevd", aeva(int ), (int)0));
lbl5:
                    // 2 sources

                    switch ((int)v0 /* !! */ ) {
                        case -2089379505: {
                            break block42;
                        }
                        case -433741554: {
                            continue block42;
                        }
                    }
                    break;
                }
                var5_3 = r.c;
                v1 /* !! */  = r.bs;
                if (true) ** GOTO lbl15
                block43: while (true) {
                    v1 /* !! */  = (long)(r.aeqh("aevg", aeva(int ), (int)3) - r.aeqh("aevf", aeva(int ), (int)2));
lbl15:
                    // 2 sources

                    switch ((int)v1 /* !! */ ) {
                        case -2089379505: {
                            break block43;
                        }
                        case -1979314282: {
                            continue block43;
                        }
                    }
                    break;
                }
                var4_4 = r.b;
                while (true) {
                    if ((v2 /* !! */  = (cfr_temp_0 = r.bs - r.aeqh("aevh", aeva(int ), (int)4)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v2 /* !! */  == r.aeqh("aevi", aeqe(int ), (int)122)) break;
                    v2 /* !! */  = (long)r.aeqh("aevj", aeqe(int ), (int)123);
                }
                var3_5 = r.a;
                if (var5_3) {
                    throw null;
lbl29:
                    // 6 sources

                    return null;
                }
                if (var3_5 || var3_5) ** GOTO lbl29
                if (var2_2.length != r.aeqh("aevk", aeqe(int ), (int)124)) break block59;
                if (var3_5 || var3_5) ** GOTO lbl29
                v3 /* !! */  = r.bs;
                if (true) ** GOTO lbl38
                block46: while (true) {
                    v3 /* !! */  = (long)(v4 - r.aeqh("aevl", aeva(int ), (int)5));
lbl38:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -2094129734: {
                            v4 = r.aeqh("aevm", aeva(int ), (int)6);
                            continue block46;
                        }
                        case -2089379505: {
                            break block46;
                        }
                        case 1496521095: {
                            v4 = r.aeqh("aevn", aeva(int ), (int)7);
                            continue block46;
                        }
                    }
                    break;
                }
                v5 /* !! */  = r.bs;
                if (true) ** GOTO lbl51
                block47: while (true) {
                    v5 /* !! */  = (long)(r.aeqh("aevp", aeva(int ), (int)9) - r.aeqh("aevo", aeva(int ), (int)8));
lbl51:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -2089379505: {
                            break block47;
                        }
                        case -1038212248: {
                            continue block47;
                        }
                    }
                    break;
                }
                v6 = new i();
                v7 = var2_2[0];
                v8 /* !! */  = r.bs;
                if (true) ** GOTO lbl62
                block48: while (true) {
                    v8 /* !! */  = (long)(r.aeqh("aevr", aeva(int ), (int)11) - r.aeqh("aevq", aeva(int ), (int)10));
lbl62:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -2089379505: {
                            break block48;
                        }
                        case 1362686207: {
                            continue block48;
                        }
                    }
                    break;
                }
                v9 = v6.filterPrefix(v7);
                v10 = new String[]{"create", "invite", "accept", "decline", "leave", "disband", "info"};
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_1 = r.bs - r.aeqh("aevs", aeva(int ), (int)12)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v11 /* !! */  == r.aeqh("aevt", aeqe(int ), (int)125)) break;
                    v11 /* !! */  = (long)r.aeqh("aevu", aeqe(int ), (int)126);
                }
                v12 = v9.append(v10);
                while (true) {
                    if ((v13 /* !! */  = (cfr_temp_2 = r.bs - r.aeqh("aevv", aeva(int ), (int)13)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v13 /* !! */  == r.aeqh("aevw", aeqe(int ), (int)127)) break;
                    v13 /* !! */  = (long)r.aeqh("aevx", aeqe(int ), (int)128);
                }
                return v12.stream();
            }
            if (var3_5 || var3_5) ** GOTO lbl29
            if (var2_2.length != r.aeqh("aevy", aeqe(int ), (int)129)) break block60;
            if (var3_5) ** GOTO lbl29
            v14 = var2_2[0];
            v15 /* !! */  = r.bs;
            if (true) ** GOTO lbl90
            block51: while (true) {
                v15 /* !! */  = (long)(v16 - r.aeqh("aevz", aeva(int ), (int)14));
lbl90:
                // 2 sources

                switch ((int)v15 /* !! */ ) {
                    case -2089379505: {
                        break block51;
                    }
                    case -671011343: {
                        v16 = r.aeqh("aewa", aeva(int ), (int)15);
                        continue block51;
                    }
                    case 2056328277: {
                        v16 = r.aeqh("aewb", aeva(int ), (int)16);
                        continue block51;
                    }
                    case 2075518725: {
                        v16 = r.aeqh("aewc", aeva(int ), (int)17);
                        continue block51;
                    }
                }
                break;
            }
            if (!v14.equalsIgnoreCase("leave")) break block60;
            if (var3_5 || var3_5) ** GOTO lbl29
            while (true) {
                if ((v17 /* !! */  = (cfr_temp_3 = r.bs - r.aeqh("aewd", aeva(int ), (int)18)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v17 /* !! */  == r.aeqh("aewe", aeqe(int ), (int)130)) break;
                v17 /* !! */  = (long)r.aeqh("aewf", aeqe(int ), (int)131);
            }
            v18 /* !! */  = r.bs;
            if (true) ** GOTO lbl113
            block53: while (true) {
                v18 /* !! */  = (long)(v19 - r.aeqh("aewg", aeva(int ), (int)19));
lbl113:
                // 2 sources

                switch ((int)v18 /* !! */ ) {
                    case -2089379505: {
                        break block53;
                    }
                    case -1016023692: {
                        v19 = r.aeqh("aewh", aeva(int ), (int)20);
                        continue block53;
                    }
                    case 780299451: {
                        v19 = r.aeqh("aewi", aeva(int ), (int)21);
                        continue block53;
                    }
                    case 1260984472: {
                        v19 = r.aeqh("aewj", aeva(int ), (int)22);
                        continue block53;
                    }
                }
                break;
            }
            v20 = new i();
            v21 = var2_2[1];
            while (true) {
                if ((v22 /* !! */  = (cfr_temp_4 = r.bs - r.aeqh("aewk", aeva(int ), (int)23)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                if (v22 /* !! */  == r.aeqh("aewl", aeqe(int ), (int)132)) break;
                v22 /* !! */  = (long)r.aeqh("aewm", aeqe(int ), (int)133);
            }
            v23 = v20.filterPrefix(v21);
            v24 = new String[]{"confirm", "cancel"};
            v25 /* !! */  = r.bs;
            if (true) ** GOTO lbl138
            block55: while (true) {
                v25 /* !! */  = (long)(r.aeqh("aewo", aeva(int ), (int)25) - r.aeqh("aewn", aeva(int ), (int)24));
lbl138:
                // 2 sources

                switch ((int)v25 /* !! */ ) {
                    case -2089379505: {
                        break block55;
                    }
                    case -263185489: {
                        continue block55;
                    }
                }
                break;
            }
            v26 = v23.append(v24);
            v27 /* !! */  = r.bs;
            if (true) ** GOTO lbl148
            block56: while (true) {
                v27 /* !! */  = (long)(v28 - r.aeqh("aewp", aeva(int ), (int)26));
lbl148:
                // 2 sources

                switch ((int)v27 /* !! */ ) {
                    case -2089379505: {
                        break block56;
                    }
                    case 765217825: {
                        v28 = r.aeqh("aewq", aeva(int ), (int)27);
                        continue block56;
                    }
                    case 2006813881: {
                        v28 = r.aeqh("aewr", aeva(int ), (int)28);
                        continue block56;
                    }
                }
                break;
            }
            return v26.stream();
        }
        if (!var3_5 && !var3_5) ** break;
        ** while (true)
        while (true) {
            if ((v29 /* !! */  = (cfr_temp_5 = r.bs - r.aeqh("aews", aeva(int ), (int)29)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v29 /* !! */  == r.aeqh("aewt", aeqe(int ), (int)134)) break;
            v29 /* !! */  = (long)r.aeqh("aewu", aeqe(int ), (int)135);
        }
        return Stream.empty();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void handleLeave(String[] var1_1) {
        var6_2 = r.c;
        var5_3 /* !! */  = r.b;
        var4_4 = r.a;
        if (var6_2) {
            throw null;
lbl6:
            // 18 sources

            return;
        }
        if (var4_4 || var4_4) ** GOTO lbl6
        if (var1_1.length != r.aeqh("aexz", aeqe(int ), (int)162)) ** GOTO lbl21
        if (var4_4 || var4_4) ** GOTO lbl6
        var2_5 = g.getInstance().getPrefix();
        if (var4_4 || var4_4) ** GOTO lbl6
        var3_6 = class_2561.method_43470((String)"\u0412\u044b \u0434\u0435\u0439\u0441\u0442\u0432\u0438\u0442\u0435\u043b\u044c\u043d\u043e \u0445\u043e\u0442\u0438\u0442\u0435 \u043f\u043e\u043a\u0438\u043d\u0443\u0442\u044c Party? ").method_27692(class_124.field_1080).method_10852((class_2561)class_2561.method_43470((String)"[\u0414\u0430]").method_10862(class_2583.field_24360.method_10977(class_124.field_1060).method_10958((class_2558)new class_2558.class_10609(var2_5 + "party leave confirm")))).method_10852((class_2561)class_2561.method_43470((String)" ")).method_10852((class_2561)class_2561.method_43470((String)"[\u041d\u0435\u0442]").method_10862(class_2583.field_24360.method_10977(class_124.field_1061).method_10958((class_2558)new class_2558.class_10609(var2_5 + "party leave cancel"))));
        if (var4_4 || var4_4) ** GOTO lbl6
        if (var5_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.logDirect((class_2561)var3_6);
                if (var4_4 || var4_4) ** GOTO lbl6
                return;
            }
lbl21:
            // 1 sources

            if (var4_4 || var4_4) ** GOTO lbl6
            if (var1_1.length != r.aeqh("aeya", aeqe(int ), (int)163)) ** GOTO lbl29
            if (var4_4) ** GOTO lbl6
            if (!var1_1[1].equalsIgnoreCase("cancel")) ** GOTO lbl29
            if (var4_4 || var4_4) ** GOTO lbl6
            this.logDirect(class_2561.method_43470((String)"\u0412\u044b\u0445\u043e\u0434 \u0438\u0437 Party \u043e\u0442\u043c\u0435\u043d\u0451\u043d").method_27692(class_124.field_1080));
            if (var4_4 || var4_4) ** GOTO lbl6
            return;
lbl29:
            // 2 sources

            if (var4_4 || var4_4) ** GOTO lbl6
            if (var1_1.length != r.aeqh("aeyb", aeqe(int ), (int)164)) ** GOTO lbl34
            if (var4_4) ** GOTO lbl6
            if (var1_1[1].equalsIgnoreCase("confirm")) ** GOTO lbl38
            if (var4_4) ** GOTO lbl6
lbl34:
            // 2 sources

            if (var4_4 || var4_4) ** GOTO lbl6
            this.usage();
            if (var4_4 || var4_4) ** GOTO lbl6
            return;
lbl38:
            // 1 sources

            if (var4_4 || var4_4) ** GOTO lbl6
            if (this.client.leaveParty()) ** GOTO lbl43
            if (var4_4 || var4_4) ** GOTO lbl6
            this.logDirect(class_2561.method_43470((String)"IRC \u0435\u0449\u0451 \u043d\u0435 \u043f\u043e\u0434\u043a\u043b\u044e\u0447\u0451\u043d").method_27692(class_124.field_1061));
            if (var4_4) ** GOTO lbl6
lbl43:
            // 2 sources

            if (!var4_4 && !var4_4) ** break;
            ** continue;
            return;
lbl46:
            // 4 sources

            case 0: {
                var5_3 /* !! */  = (int)r.aeqh("aeyc", aeqe(int ), (int)165);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl150
            }
lbl51:
            // 3 sources

            case 1: {
                var5_3 /* !! */  = (int)r.aeqh("aeyd", aeqe(int ), (int)166);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl204
            }
            case 2: {
                var5_3 /* !! */  = (int)r.aeqh("aeye", aeqe(int ), (int)167);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl150
            }
            case 3: {
                var5_3 /* !! */  = (int)r.aeqh("aeyf", aeqe(int ), (int)168);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl154
            }
            case 4: {
                var5_3 /* !! */  = (int)r.aeqh("aeyg", aeqe(int ), (int)169);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl115
            }
lbl71:
            // 2 sources

            case 5: {
                var5_3 /* !! */  = (int)r.aeqh("aeyh", aeqe(int ), (int)170);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl178
            }
            case 6: {
                var5_3 /* !! */  = (int)r.aeqh("aeyi", aeqe(int ), (int)171);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl137
            }
            case 7: {
                var5_3 /* !! */  = (int)r.aeqh("aeyj", aeqe(int ), (int)172);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl204
            }
            case 8: {
                var5_3 /* !! */  = (int)r.aeqh("aeyk", aeqe(int ), (int)173);
                if (!var6_2) ** GOTO lbl71
                throw null;
            }
            case 9: {
                var5_3 /* !! */  = (int)r.aeqh("aeyl", aeqe(int ), (int)174);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl104
            }
            case 10: {
                var5_3 /* !! */  = (int)r.aeqh("aeym", aeqe(int ), (int)175);
                if (!var6_2) break;
                throw null;
            }
            case 11: {
                var5_3 /* !! */  = (int)r.aeqh("aeyn", aeqe(int ), (int)176);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl173
            }
lbl104:
            // 2 sources

            case 12: {
                var5_3 /* !! */  = (int)r.aeqh("aeyo", aeqe(int ), (int)177);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl150
            }
            case 13: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_3 /* !! */  = (int)r.aeqh("aeyp", aeqe(int ), (int)178);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl137
                    break;
                }
            }
lbl115:
            // 2 sources

            case 14: {
                var5_3 /* !! */  = (int)r.aeqh("aeyq", aeqe(int ), (int)179);
                if (!var6_2) ** GOTO lbl46
                throw null;
            }
            case 15: {
                var5_3 /* !! */  = (int)r.aeqh("aeyr", aeqe(int ), (int)180);
                if (!var6_2) break;
                throw null;
            }
lbl123:
            // 3 sources

            case 16: {
                var5_3 /* !! */  = (int)r.aeqh("aeys", aeqe(int ), (int)181);
                if (!var6_2) ** GOTO lbl46
                throw null;
            }
            case 17: {
                var5_3 /* !! */  = (int)r.aeqh("aeyt", aeqe(int ), (int)182);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl150
            }
            case 18: {
                var5_3 /* !! */  = (int)r.aeqh("aeyu", aeqe(int ), (int)183);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl150
            }
lbl137:
            // 3 sources

            case 19: {
                var5_3 /* !! */  = (int)r.aeqh("aeyv", aeqe(int ), (int)184);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl146
            }
lbl142:
            // 2 sources

            case 20: {
                var5_3 /* !! */  = (int)r.aeqh("aeyw", aeqe(int ), (int)185);
                if (!var6_2) ** GOTO lbl123
                throw null;
            }
lbl146:
            // 3 sources

            case 21: {
                var5_3 /* !! */  = (int)r.aeqh("aeyx", aeqe(int ), (int)186);
                if (!var6_2) ** GOTO lbl51
                throw null;
            }
lbl150:
            // 6 sources

            case 22: {
                var5_3 /* !! */  = (int)r.aeqh("aeyy", aeqe(int ), (int)187);
                if (!var6_2) ** GOTO lbl51
                throw null;
            }
lbl154:
            // 2 sources

            case 23: {
                var5_3 /* !! */  = (int)r.aeqh("aeyz", aeqe(int ), (int)188);
                if (!var6_2) ** GOTO lbl142
                throw null;
            }
            case 24: {
                var5_3 /* !! */  = (int)r.aeqh("aeza", aeqe(int ), (int)189);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl192
            }
lbl163:
            // 2 sources

            case 25: {
                var5_3 /* !! */  = (int)r.aeqh("aezb", aeqe(int ), (int)190);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl204
            }
            case 26: {
                var5_3 /* !! */  = (int)r.aeqh("aezc", aeqe(int ), (int)191);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl204
            }
lbl173:
            // 2 sources

            case 27: {
                var5_3 /* !! */  = (int)r.aeqh("aezd", aeqe(int ), (int)192);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl196
            }
lbl178:
            // 2 sources

            case 28: {
                do {
                    var5_3 /* !! */  = (int)r.aeqh("aeze", aeqe(int ), (int)193);
                } while (!var6_2);
                throw null;
            }
            case 29: {
                var5_3 /* !! */  = (int)r.aeqh("aezf", aeqe(int ), (int)194);
                if (!var6_2) ** GOTO lbl123
                throw null;
            }
            case 30: {
                do {
                    var5_3 /* !! */  = (int)r.aeqh("aezg", aeqe(int ), (int)195);
                } while (!var6_2);
                throw null;
            }
lbl192:
            // 2 sources

            case 31: {
                var5_3 /* !! */  = (int)r.aeqh("aezh", aeqe(int ), (int)196);
                if (!var6_2) ** GOTO lbl163
                throw null;
            }
lbl196:
            // 2 sources

            case 32: {
                var5_3 /* !! */  = (int)r.aeqh("aezi", aeqe(int ), (int)197);
                if (!var6_2) ** GOTO lbl46
                throw null;
            }
            case 33: {
                var5_3 /* !! */  = (int)r.aeqh("aezj", aeqe(int ), (int)198);
                if (!var6_2) ** GOTO lbl146
                throw null;
            }
lbl204:
            // 5 sources

            case 34: {
                var5_3 /* !! */  = (int)r.aeqh("aezk", aeqe(int ), (int)199);
                if (!var6_2) break;
                throw null;
            }
            case 35: 
        }
        var5_3 /* !! */  = (int)r.aeqh("aezl", aeqe(int ), (int)200);
        ** while (!var6_2)
lbl211:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ int aeqe(int n2) {
        return aeqf[n2] ^ aeqg[n2];
    }

    private static /* synthetic */ long aeva(int n2) {
        return aevb[n2] ^ aevc[n2];
    }

    private static /* synthetic */ void afat() {
        r.aevb[0] = 8493198208496487778L;
        r.aevb[1] = -2318171586842726097L;
        r.aevb[2] = 720986581041633632L;
        r.aevb[3] = -8189271499634740540L;
        r.aevb[4] = 3608990885395428283L;
        r.aevb[5] = -48909895875993056L;
        r.aevb[6] = 1757554365585616355L;
        r.aevb[7] = -8133988664998336879L;
        r.aevb[8] = 7292170685196170575L;
        r.aevb[9] = -7631132295019297782L;
        r.aevb[10] = 771893545532270746L;
        r.aevb[11] = -9148363922711370864L;
        r.aevb[12] = -8064961349377433936L;
        r.aevb[13] = 5400019171759517648L;
        r.aevb[14] = -7700085098245287939L;
        r.aevb[15] = 3724945723284985370L;
        r.aevb[16] = 8928018523709723460L;
        r.aevb[17] = 6260237991167852564L;
        r.aevb[18] = 7407025652362930036L;
        r.aevb[19] = -8496445623642502458L;
        r.aevb[20] = 7625429320213383757L;
        r.aevb[21] = -8621941462151411244L;
        r.aevb[22] = 8385961661532430204L;
        r.aevb[23] = -2807134167640345518L;
        r.aevb[24] = 5530651175817109495L;
        r.aevb[25] = 3982505356587174202L;
        r.aevb[26] = 895757761239927463L;
        r.aevb[27] = -5769536047302516198L;
        r.aevb[28] = -740286216428374426L;
        r.aevb[29] = 8233727887937216354L;
        r.aevb[30] = 7137941908015115627L;
        r.aevb[31] = -5566226247212855666L;
        r.aevb[32] = 5441466423185455250L;
        r.aevb[33] = 2477600776637609809L;
        r.aevb[34] = 2722228104907712892L;
        r.aevb[35] = -1267364622281041232L;
        r.aevb[36] = 6399284626564899433L;
        r.aevb[37] = -6717002572254445140L;
        r.aevb[38] = -4473137078514844602L;
        r.aevb[39] = -5048506944766917483L;
        r.aevb[40] = -1767978648571055479L;
        r.aevb[41] = 1554267052988274143L;
        r.aevb[42] = -91052050407136235L;
        r.aevb[43] = -3767583492522385152L;
        r.aevb[44] = 8302980334934059668L;
        r.aevb[45] = -1526637616365815351L;
        r.aevb[46] = 1284511438987218745L;
        r.aevb[47] = -840824998733629518L;
        r.aevb[48] = 7425811578062841822L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public r() {
        var2_1 /* !! */  = r.b;
        super("party", "\u0423\u043f\u0440\u0430\u0432\u043b\u0435\u043d\u0438\u0435 Party \u0447\u0435\u0440\u0435\u0437 IRC", new String[0]);
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.client = mk.INSTANCE;
                return;
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)r.aeqh("aeqi", aeqe(int ), (int)0);
                    continue;
                    break;
                }
            }
            case 1: {
                var2_1 /* !! */  = (int)r.aeqh("aeqj", aeqe(int ), (int)1);
                break;
            }
            case 2: {
                var2_1 /* !! */  = (int)r.aeqh("aeqk", aeqe(int ), (int)2);
            }
            case 3: 
        }
        var2_1 /* !! */  = (int)r.aeqh("aeql", aeqe(int ), (int)3);
        ** while (true)
    }

    private static /* synthetic */ void afaq() {
        r.aeqg[0] = 1702612628;
        r.aeqg[1] = 158552207;
        r.aeqg[2] = -203800450;
        r.aeqg[3] = 458315274;
        r.aeqg[4] = 1765312530;
        r.aeqg[5] = 1608386782;
        r.aeqg[6] = 118399450;
        r.aeqg[7] = -1649478505;
        r.aeqg[8] = 135241397;
        r.aeqg[9] = -1737145491;
        r.aeqg[10] = 662755101;
        r.aeqg[11] = 550396055;
        r.aeqg[12] = -139816720;
        r.aeqg[13] = 392813377;
        r.aeqg[14] = -1642999866;
        r.aeqg[15] = 51189131;
        r.aeqg[16] = 1136532245;
        r.aeqg[17] = 1692925240;
        r.aeqg[18] = -907973951;
        r.aeqg[19] = 1558685688;
        r.aeqg[20] = 656503234;
        r.aeqg[21] = -177257617;
        r.aeqg[22] = -1902249985;
        r.aeqg[23] = 867101034;
        r.aeqg[24] = 217722779;
        r.aeqg[25] = 1527161571;
        r.aeqg[26] = 978435906;
        r.aeqg[27] = 480037051;
        r.aeqg[28] = 2026695225;
        r.aeqg[29] = -485552294;
        r.aeqg[30] = -981360584;
        r.aeqg[31] = -132091243;
        r.aeqg[32] = -1664245151;
        r.aeqg[33] = 1665268099;
        r.aeqg[34] = 1108156363;
        r.aeqg[35] = -1800571340;
        r.aeqg[36] = -1547009160;
        r.aeqg[37] = -1315501220;
        r.aeqg[38] = -1284409673;
        r.aeqg[39] = -892210576;
        r.aeqg[40] = -1967217098;
        r.aeqg[41] = -1197553965;
        r.aeqg[42] = -1693026980;
        r.aeqg[43] = 773066490;
        r.aeqg[44] = 750897818;
        r.aeqg[45] = -225056080;
        r.aeqg[46] = -2040180523;
        r.aeqg[47] = 1867990501;
        r.aeqg[48] = 1709522205;
        r.aeqg[49] = 458211761;
        r.aeqg[50] = 2144775496;
        r.aeqg[51] = 2056143208;
        r.aeqg[52] = -304260310;
        r.aeqg[53] = 1247002614;
        r.aeqg[54] = -1725531777;
        r.aeqg[55] = -1434037790;
        r.aeqg[56] = 1968859852;
        r.aeqg[57] = 896340639;
        r.aeqg[58] = -525242441;
        r.aeqg[59] = -555368419;
        r.aeqg[60] = 1340783017;
        r.aeqg[61] = -827259469;
        r.aeqg[62] = 266948536;
        r.aeqg[63] = 306610134;
        r.aeqg[64] = 1667970862;
        r.aeqg[65] = -1578408893;
        r.aeqg[66] = -1979046363;
        r.aeqg[67] = 1156253308;
        r.aeqg[68] = -2069168629;
        r.aeqg[69] = -2102511922;
        r.aeqg[70] = -636734187;
        r.aeqg[71] = 874727992;
        r.aeqg[72] = -633765662;
        r.aeqg[73] = 674530279;
        r.aeqg[74] = -1703718431;
        r.aeqg[75] = -1286329043;
        r.aeqg[76] = 1235111482;
        r.aeqg[77] = 85849877;
        r.aeqg[78] = 2052443199;
        r.aeqg[79] = 1643370752;
        r.aeqg[80] = -2085314631;
        r.aeqg[81] = -385641990;
        r.aeqg[82] = 637678223;
        r.aeqg[83] = 2112999066;
        r.aeqg[84] = -1714149230;
        r.aeqg[85] = 390319030;
        r.aeqg[86] = 139233141;
        r.aeqg[87] = 1277799980;
        r.aeqg[88] = 1913902907;
        r.aeqg[89] = 1801896589;
        r.aeqg[90] = -922698585;
        r.aeqg[91] = -588514445;
        r.aeqg[92] = 1015709283;
        r.aeqg[93] = -1235131450;
        r.aeqg[94] = -696154361;
        r.aeqg[95] = 832070205;
        r.aeqg[96] = -1321428701;
        r.aeqg[97] = -1291276842;
        r.aeqg[98] = 964157427;
        r.aeqg[99] = 502873899;
    }

    /*
     * Exception decompiling
     */
    @Override
    public void execute(String var1_1, String[] var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [10[CASE]], but top level block is 16[SWITCH]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private static /* synthetic */ void afao() {
        r.aeqf[100] = 1302699613;
        r.aeqf[101] = 561279161;
        r.aeqf[102] = 183027600;
        r.aeqf[103] = -725061459;
        r.aeqf[104] = -1531013231;
        r.aeqf[105] = -886886248;
        r.aeqf[106] = -1672733068;
        r.aeqf[107] = 1321317479;
        r.aeqf[108] = -1270157451;
        r.aeqf[109] = 1252462297;
        r.aeqf[110] = 1066967513;
        r.aeqf[111] = -1759046423;
        r.aeqf[112] = -514873076;
        r.aeqf[113] = 2076040484;
        r.aeqf[114] = 2145808621;
        r.aeqf[115] = 870328798;
        r.aeqf[116] = -81233275;
        r.aeqf[117] = -499859849;
        r.aeqf[118] = -209021220;
        r.aeqf[119] = 312816983;
        r.aeqf[120] = 1676769300;
        r.aeqf[121] = 823786144;
        r.aeqf[122] = -387547306;
        r.aeqf[123] = 778043907;
        r.aeqf[124] = 707309045;
        r.aeqf[125] = -2039488859;
        r.aeqf[126] = 877778039;
        r.aeqf[127] = -2097746150;
        r.aeqf[128] = 1047456967;
        r.aeqf[129] = 1616330046;
        r.aeqf[130] = -1527620463;
        r.aeqf[131] = -1699889107;
        r.aeqf[132] = -2033808225;
        r.aeqf[133] = 335932150;
        r.aeqf[134] = -903763415;
        r.aeqf[135] = 342615790;
        r.aeqf[136] = -1517702854;
        r.aeqf[137] = 1315129537;
        r.aeqf[138] = -1981131853;
        r.aeqf[139] = 1982826565;
        r.aeqf[140] = 255782488;
        r.aeqf[141] = -36794990;
        r.aeqf[142] = 2096724703;
        r.aeqf[143] = -720733768;
        r.aeqf[144] = -485616262;
        r.aeqf[145] = 2027129056;
        r.aeqf[146] = -127128679;
        r.aeqf[147] = 1300836501;
        r.aeqf[148] = -185485557;
        r.aeqf[149] = 1042158042;
        r.aeqf[150] = 1230937946;
        r.aeqf[151] = 1348004296;
        r.aeqf[152] = -1567604605;
        r.aeqf[153] = 2022542853;
        r.aeqf[154] = 348488539;
        r.aeqf[155] = 1051828001;
        r.aeqf[156] = 976931930;
        r.aeqf[157] = 1192565002;
        r.aeqf[158] = -969392677;
        r.aeqf[159] = -1789335680;
        r.aeqf[160] = -1916765309;
        r.aeqf[161] = 912819193;
        r.aeqf[162] = 1649341748;
        r.aeqf[163] = -1517237896;
        r.aeqf[164] = -702733785;
        r.aeqf[165] = -1568217700;
        r.aeqf[166] = -1539865637;
        r.aeqf[167] = 540455487;
        r.aeqf[168] = -451378723;
        r.aeqf[169] = -1516818418;
        r.aeqf[170] = -1974617736;
        r.aeqf[171] = -1808656336;
        r.aeqf[172] = 248473841;
        r.aeqf[173] = -882151774;
        r.aeqf[174] = -1118412177;
        r.aeqf[175] = -1124762388;
        r.aeqf[176] = -1002022253;
        r.aeqf[177] = -438169986;
        r.aeqf[178] = -924434495;
        r.aeqf[179] = -1657483686;
        r.aeqf[180] = -1563368866;
        r.aeqf[181] = -1291306438;
        r.aeqf[182] = 1770546089;
        r.aeqf[183] = -1475254682;
        r.aeqf[184] = -521277591;
        r.aeqf[185] = -1584149315;
        r.aeqf[186] = 2049771374;
        r.aeqf[187] = 537995222;
        r.aeqf[188] = 1553623467;
        r.aeqf[189] = -1393558476;
        r.aeqf[190] = -244895995;
        r.aeqf[191] = -1265991060;
        r.aeqf[192] = 830109928;
        r.aeqf[193] = 2499909;
        r.aeqf[194] = -1332695679;
        r.aeqf[195] = -1601741491;
        r.aeqf[196] = -565367800;
        r.aeqf[197] = 1872648014;
        r.aeqf[198] = 944856980;
        r.aeqf[199] = 767372850;
    }

    static {
        aeqf = new int[213];
        aeqg = new int[213];
        r.afan();
        r.afao();
        r.afap();
        r.afaq();
        r.afar();
        r.afas();
        aevb = new long[49];
        aevc = new long[49];
        r.afat();
        r.afau();
    }

    private static /* synthetic */ void afap() {
        r.aeqf[200] = 1478851033;
        r.aeqf[201] = -324583738;
        r.aeqf[202] = 1459595322;
        r.aeqf[203] = -796688957;
        r.aeqf[204] = -1572630594;
        r.aeqf[205] = -573865717;
        r.aeqf[206] = -1361804286;
        r.aeqf[207] = -148785845;
        r.aeqf[208] = -1365223767;
        r.aeqf[209] = 765029335;
        r.aeqf[210] = -591624800;
        r.aeqf[211] = -1024345913;
        r.aeqf[212] = -1794278880;
    }
}

