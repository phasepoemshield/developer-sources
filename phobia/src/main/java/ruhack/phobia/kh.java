/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.function.Supplier;
import ruhack.phobia.jx;

public class kh
extends jx {
    private int min;
    private int max;
    private static int[] lhml = new int[72];
    private static int[] lhmm = new int[72];
    private static long[] lhmt;
    private static long[] lhmu;
    public static final int b;
    public static final boolean c;
    public static final boolean a;
    private static final long tu = -2133774338694861396L;
    private String value;

    /*
     * Enabled aggressive block sorting
     */
    public int getMax() {
        boolean bl2;
        Object object = tu;
        block4: while (true) {
            switch ((int)object) {
                case -1680677430: {
                    object = kh.lhmn("lhpm", lhms(int ), (int)32) - kh.lhmn("lhpl", lhms(int ), (int)31);
                    continue block4;
                }
                case 1329573292: {
                    break block4;
                }
            }
            break;
        }
        boolean bl3 = c;
        while (true) {
            long l2;
            Object object2;
            if ((object2 = (l2 = tu - kh.lhmn("lhpn", lhms(int ), (int)33)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object2 == kh.lhmn("lhpo", lhmk(int ), (int)41)) break;
            object2 = kh.lhmn("lhpp", lhmk(int ), (int)42);
        }
        int n2 = b;
        while (true) {
            long l3;
            Object object3;
            if ((object3 = (l3 = tu - kh.lhmn("lhpq", lhms(int ), (int)34)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object3 == kh.lhmn("lhpr", lhmk(int ), (int)43)) {
                bl2 = a;
                if (bl3) {
                    throw null;
                }
                break;
            }
            object3 = kh.lhmn("lhps", lhmk(int ), (int)44);
        }
        if (bl2) return (int)kh.lhmn("lhpt", lhmk(int ), (int)45);
        if (bl2) return (int)kh.lhmn("lhpt", lhmk(int ), (int)45);
        while (true) {
            long l4;
            Object object4;
            if ((object4 = (l4 = tu - kh.lhmn("lhpu", lhms(int ), (int)35)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            if (object4 == kh.lhmn("lhpv", lhmk(int ), (int)46)) {
                return this.max;
            }
            object4 = kh.lhmn("lhpw", lhmk(int ), (int)47);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public kh visible(Supplier<Boolean> var1_1) {
        v0 /* !! */  = kh.tu;
        if (true) ** GOTO lbl5
        block16: while (true) {
            v0 /* !! */  = (long)(kh.lhmn("lhof", lhms(int ), (int)20) - kh.lhmn("lhoe", lhms(int ), (int)19));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 130857972: {
                    continue block16;
                }
                case 1329573292: {
                    break block16;
                }
            }
            break;
        }
        var4_2 = kh.c;
        v1 /* !! */  = kh.tu;
        if (true) ** GOTO lbl15
        block17: while (true) {
            v1 /* !! */  = (long)(kh.lhmn("lhoh", lhms(int ), (int)22) - kh.lhmn("lhog", lhms(int ), (int)21));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1689195259: {
                    continue block17;
                }
                case 1329573292: {
                    break block17;
                }
            }
            break;
        }
        var3_3 /* !! */  = kh.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = kh.tu - kh.lhmn("lhoi", lhms(int ), (int)23)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == kh.lhmn("lhoj", lhmk(int ), (int)20)) break;
            v2 /* !! */  = (long)kh.lhmn("lhok", lhmk(int ), (int)21);
        }
        var2_4 = kh.a;
        if (var4_2) {
            throw null;
lbl29:
            // 3 sources

            return null;
        }
        if (var2_4 || var2_4) ** GOTO lbl29
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = kh.tu - kh.lhmn("lhol", lhms(int ), (int)24)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == kh.lhmn("lhom", lhmk(int ), (int)22)) break;
            v3 /* !! */  = (long)kh.lhmn("lhon", lhmk(int ), (int)23);
        }
        this.setVisible(var1_1);
        if (var2_4) ** GOTO lbl29
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var2_4) ** break;
                ** continue;
                return this;
            }
            case 0: {
                do {
                    var3_3 /* !! */  = (int)kh.lhmn("lhoo", lhmk(int ), (int)24);
                } while (!var4_2);
                throw null;
            }
lbl50:
            // 2 sources

            case 1: {
                var3_3 /* !! */  = (int)kh.lhmn("lhop", lhmk(int ), (int)25);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl59
            }
            case 2: {
                var3_3 /* !! */  = (int)kh.lhmn("lhoq", lhmk(int ), (int)26);
                if (!var4_2) ** GOTO lbl50
                throw null;
            }
lbl59:
            // 3 sources

            case 3: {
                var3_3 /* !! */  = (int)kh.lhmn("lhor", lhmk(int ), (int)27);
                if (!var4_2) break;
                throw null;
            }
            case 4: {
                var3_3 /* !! */  = (int)kh.lhmn("lhos", lhmk(int ), (int)28);
                if (!var4_2) ** GOTO lbl59
                throw null;
            }
            case 5: 
        }
        do {
            var3_3 /* !! */  = (int)kh.lhmn("lhot", lhmk(int ), (int)29);
        } while (!var4_2);
        throw null;
    }

    private static /* synthetic */ void lhrm() {
        kh.lhmm[0] = -2015029237;
        kh.lhmm[1] = 1814036410;
        kh.lhmm[2] = -1705101674;
        kh.lhmm[3] = 443702966;
        kh.lhmm[4] = -1515540018;
        kh.lhmm[5] = 342383927;
        kh.lhmm[6] = 2044589368;
        kh.lhmm[7] = -449515693;
        kh.lhmm[8] = -1988092683;
        kh.lhmm[9] = -813903462;
        kh.lhmm[10] = 1347252334;
        kh.lhmm[11] = 413980496;
        kh.lhmm[12] = -630727014;
        kh.lhmm[13] = 1024225092;
        kh.lhmm[14] = 1032954812;
        kh.lhmm[15] = -1647893550;
        kh.lhmm[16] = -1969480990;
        kh.lhmm[17] = -1649944827;
        kh.lhmm[18] = -1261281537;
        kh.lhmm[19] = -1544452844;
        kh.lhmm[20] = 1693472789;
        kh.lhmm[21] = -231312792;
        kh.lhmm[22] = 1560245958;
        kh.lhmm[23] = 1944859654;
        kh.lhmm[24] = -1067398533;
        kh.lhmm[25] = 859070569;
        kh.lhmm[26] = -1643888210;
        kh.lhmm[27] = -1941415513;
        kh.lhmm[28] = -1817134643;
        kh.lhmm[29] = 1077015619;
        kh.lhmm[30] = 967296226;
        kh.lhmm[31] = -1317798466;
        kh.lhmm[32] = -262098937;
        kh.lhmm[33] = -1211188923;
        kh.lhmm[34] = -1092836437;
        kh.lhmm[35] = -1706123841;
        kh.lhmm[36] = -1082740528;
        kh.lhmm[37] = -1356514982;
        kh.lhmm[38] = 279212832;
        kh.lhmm[39] = 1025181368;
        kh.lhmm[40] = 1106396819;
        kh.lhmm[41] = -301430863;
        kh.lhmm[42] = -36184567;
        kh.lhmm[43] = -742448370;
        kh.lhmm[44] = -2000279877;
        kh.lhmm[45] = 839944822;
        kh.lhmm[46] = 477759312;
        kh.lhmm[47] = -928971345;
        kh.lhmm[48] = -950076239;
        kh.lhmm[49] = -1582317491;
        kh.lhmm[50] = -1586972787;
        kh.lhmm[51] = 1546590063;
        kh.lhmm[52] = 1721325808;
        kh.lhmm[53] = 1813246061;
        kh.lhmm[54] = -1571364161;
        kh.lhmm[55] = 1900308651;
        kh.lhmm[56] = -1621002651;
        kh.lhmm[57] = 751872102;
        kh.lhmm[58] = -1631053655;
        kh.lhmm[59] = 608662054;
        kh.lhmm[60] = -1817861919;
        kh.lhmm[61] = 1954556184;
        kh.lhmm[62] = 657516330;
        kh.lhmm[63] = 946652818;
        kh.lhmm[64] = -1855143347;
        kh.lhmm[65] = 1065295709;
        kh.lhmm[66] = 800251750;
        kh.lhmm[67] = -953508758;
        kh.lhmm[68] = 1165347451;
        kh.lhmm[69] = 1448832813;
        kh.lhmm[70] = -1609614091;
        kh.lhmm[71] = 2108726584;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void setMax(int var1_1) {
        v0 /* !! */  = kh.tu;
        if (true) ** GOTO lbl5
        block19: while (true) {
            v0 /* !! */  = (long)(v1 - kh.lhmn("lhqs", lhms(int ), (int)42));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 371021041: {
                    v1 = kh.lhmn("lhqt", lhms(int ), (int)43);
                    continue block19;
                }
                case 766016338: {
                    v1 = kh.lhmn("lhqu", lhms(int ), (int)44);
                    continue block19;
                }
                case 1329573292: {
                    break block19;
                }
                case 1923461704: {
                    v1 = kh.lhmn("lhqv", lhms(int ), (int)45);
                    continue block19;
                }
            }
            break;
        }
        var4_2 = kh.c;
        v2 /* !! */  = kh.tu;
        if (true) ** GOTO lbl22
        block20: while (true) {
            v2 /* !! */  = (long)(v3 - kh.lhmn("lhqw", lhms(int ), (int)46));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 910353619: {
                    v3 = kh.lhmn("lhqx", lhms(int ), (int)47);
                    continue block20;
                }
                case 1329573292: {
                    break block20;
                }
                case 1791667297: {
                    v3 = kh.lhmn("lhqy", lhms(int ), (int)48);
                    continue block20;
                }
                case 1862190578: {
                    v3 = kh.lhmn("lhqz", lhms(int ), (int)49);
                    continue block20;
                }
            }
            break;
        }
        var3_3 /* !! */  = kh.b;
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_0 = kh.tu - kh.lhmn("lhra", lhms(int ), (int)50)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == kh.lhmn("lhrb", lhmk(int ), (int)63)) break;
            v4 /* !! */  = (long)kh.lhmn("lhrc", lhmk(int ), (int)64);
        }
        var2_4 = kh.a;
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_2) {
                    throw null;
lbl46:
                    // 2 sources

                    return;
                }
                if (var2_4 || var2_4) ** GOTO lbl46
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = kh.tu - kh.lhmn("lhrd", lhms(int ), (int)51)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == kh.lhmn("lhre", lhmk(int ), (int)65)) break;
                    v5 /* !! */  = (long)kh.lhmn("lhrf", lhmk(int ), (int)66);
                }
                this.max = var1_1;
                if (!var2_4) ** break;
                ** continue;
                return;
            }
lbl58:
            // 3 sources

            case 0: {
                do {
                    var3_3 /* !! */  = (int)kh.lhmn("lhrg", lhmk(int ), (int)67);
                } while (!var4_2);
                throw null;
            }
            case 1: {
                var3_3 /* !! */  = (int)kh.lhmn("lhrh", lhmk(int ), (int)68);
                if (!var4_2) ** GOTO lbl58
                throw null;
            }
            case 2: {
                do {
                    var3_3 /* !! */  = (int)kh.lhmn("lhri", lhmk(int ), (int)69);
                } while (!var4_2);
                throw null;
            }
            case 3: {
                var3_3 /* !! */  = (int)kh.lhmn("lhrj", lhmk(int ), (int)70);
                if (!var4_2) ** GOTO lbl58
                throw null;
            }
            case 4: 
        }
        do {
            var3_3 /* !! */  = (int)kh.lhmn("lhrk", lhmk(int ), (int)71);
        } while (!var4_2);
        throw null;
    }

    private static /* synthetic */ void lhro() {
        kh.lhmu[0] = 227086654007344377L;
        kh.lhmu[1] = -294070162549332878L;
        kh.lhmu[2] = 2277560614083833431L;
        kh.lhmu[3] = -1718116397305693133L;
        kh.lhmu[4] = -2852039305397392399L;
        kh.lhmu[5] = -4306924063047917653L;
        kh.lhmu[6] = 7680581576876479307L;
        kh.lhmu[7] = -6831969016279094105L;
        kh.lhmu[8] = -7107471159322793765L;
        kh.lhmu[9] = 6785550699345349469L;
        kh.lhmu[10] = 3808933430685738817L;
        kh.lhmu[11] = 3197530176181348000L;
        kh.lhmu[12] = 8252617210741596616L;
        kh.lhmu[13] = -8350097026163298236L;
        kh.lhmu[14] = 2435411121706935167L;
        kh.lhmu[15] = 5899439516418129631L;
        kh.lhmu[16] = 6766127025072392738L;
        kh.lhmu[17] = -7466562497553179633L;
        kh.lhmu[18] = -5830888462927774025L;
        kh.lhmu[19] = 3937546802137946694L;
        kh.lhmu[20] = -6586868453142431863L;
        kh.lhmu[21] = -404280916672717541L;
        kh.lhmu[22] = 5298507629978434237L;
        kh.lhmu[23] = 2942719276531542207L;
        kh.lhmu[24] = -3456954558625554049L;
        kh.lhmu[25] = -7919636796608598525L;
        kh.lhmu[26] = 2541269112522524113L;
        kh.lhmu[27] = -207169077873370389L;
        kh.lhmu[28] = -7989501850948298152L;
        kh.lhmu[29] = -7388502560013036050L;
        kh.lhmu[30] = -8379357291812226767L;
        kh.lhmu[31] = -9111006075566115794L;
        kh.lhmu[32] = -292911521255385106L;
        kh.lhmu[33] = -3692417223388728456L;
        kh.lhmu[34] = -3004151953492104511L;
        kh.lhmu[35] = 5875634650100507404L;
        kh.lhmu[36] = -7863477768869764232L;
        kh.lhmu[37] = -6543538207276771251L;
        kh.lhmu[38] = 2205477642190512952L;
        kh.lhmu[39] = -4950374170745610759L;
        kh.lhmu[40] = 643670818381160112L;
        kh.lhmu[41] = -2010887311111316554L;
        kh.lhmu[42] = -2849079795961357277L;
        kh.lhmu[43] = -8653913060176663900L;
        kh.lhmu[44] = 3978743316753362793L;
        kh.lhmu[45] = -8364809740539346641L;
        kh.lhmu[46] = -7818354560462975518L;
        kh.lhmu[47] = 6409677291234313661L;
        kh.lhmu[48] = -6260996095719244908L;
        kh.lhmu[49] = -7406554080829728353L;
        kh.lhmu[50] = -7190027034123314050L;
        kh.lhmu[51] = 3227983041928565248L;
    }

    private static /* synthetic */ void lhrl() {
        kh.lhml[0] = -2015029239;
        kh.lhml[1] = 1814036410;
        kh.lhml[2] = -1705101676;
        kh.lhml[3] = 443702965;
        kh.lhml[4] = -1515540017;
        kh.lhml[5] = -143485498;
        kh.lhml[6] = 2044589369;
        kh.lhml[7] = -639965267;
        kh.lhml[8] = -1988092681;
        kh.lhml[9] = -813903464;
        kh.lhml[10] = 1347252334;
        kh.lhml[11] = 413980496;
        kh.lhml[12] = 630727013;
        kh.lhml[13] = -36434072;
        kh.lhml[14] = 1032954814;
        kh.lhml[15] = -1647893552;
        kh.lhml[16] = -1969480989;
        kh.lhml[17] = -1649944827;
        kh.lhml[18] = -1261281542;
        kh.lhml[19] = -1544452844;
        kh.lhml[20] = -1693472790;
        kh.lhml[21] = -757690233;
        kh.lhml[22] = -1560245959;
        kh.lhml[23] = 1513206511;
        kh.lhml[24] = -1067398536;
        kh.lhml[25] = 859070572;
        kh.lhml[26] = -1643888211;
        kh.lhml[27] = -1941415515;
        kh.lhml[28] = -1817134644;
        kh.lhml[29] = 1077015616;
        kh.lhml[30] = -967296227;
        kh.lhml[31] = 430606986;
        kh.lhml[32] = 262098936;
        kh.lhml[33] = 1391103051;
        kh.lhml[34] = -973839691;
        kh.lhml[35] = 1706123840;
        kh.lhml[36] = 1545838445;
        kh.lhml[37] = -1356514984;
        kh.lhml[38] = 279212833;
        kh.lhml[39] = 1025181368;
        kh.lhml[40] = 1106396819;
        kh.lhml[41] = 301430862;
        kh.lhml[42] = 148691959;
        kh.lhml[43] = -742448369;
        kh.lhml[44] = 287486575;
        kh.lhml[45] = 1321649372;
        kh.lhml[46] = -477759313;
        kh.lhml[47] = -1656289540;
        kh.lhml[48] = -950076237;
        kh.lhml[49] = -1582317492;
        kh.lhml[50] = -1586972788;
        kh.lhml[51] = 1546590061;
        kh.lhml[52] = -1721325809;
        kh.lhml[53] = -690780080;
        kh.lhml[54] = -1571364162;
        kh.lhml[55] = 339746750;
        kh.lhml[56] = 1621002650;
        kh.lhml[57] = 1585549956;
        kh.lhml[58] = -1631053656;
        kh.lhml[59] = 0x24477227;
        kh.lhml[60] = -1817861917;
        kh.lhml[61] = 1954556188;
        kh.lhml[62] = 657516328;
        kh.lhml[63] = 946652819;
        kh.lhml[64] = 535274832;
        kh.lhml[65] = 1065295708;
        kh.lhml[66] = 1395212944;
        kh.lhml[67] = -953508759;
        kh.lhml[68] = 1165347450;
        kh.lhml[69] = 1448832815;
        kh.lhml[70] = -1609614089;
        kh.lhml[71] = 2108726586;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public int getMin() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = kh.tu - kh.lhmn("lhou", lhms(int ), (int)25)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == kh.lhmn("lhov", lhmk(int ), (int)30)) break;
            v0 /* !! */  = (long)kh.lhmn("lhow", lhmk(int ), (int)31);
        }
        var3_1 = kh.c;
        v1 /* !! */  = kh.tu;
        if (true) ** GOTO lbl12
        block12: while (true) {
            v1 /* !! */  = (long)(v2 - kh.lhmn("lhox", lhms(int ), (int)26));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1819175546: {
                    v2 = kh.lhmn("lhoy", lhms(int ), (int)27);
                    continue block12;
                }
                case -1000983953: {
                    v2 = kh.lhmn("lhoz", lhms(int ), (int)28);
                    continue block12;
                }
                case 1329573292: {
                    break block12;
                }
            }
            break;
        }
        var2_2 /* !! */  = kh.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = kh.tu - kh.lhmn("lhpa", lhms(int ), (int)29)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == kh.lhmn("lhpb", lhmk(int ), (int)32)) break;
            v3 /* !! */  = (long)kh.lhmn("lhpc", lhmk(int ), (int)33);
        }
        var1_3 = kh.a;
        if (var3_1) {
            throw null;
lbl31:
            // 1 sources

            return (int)kh.lhmn("lhpd", lhmk(int ), (int)34);
        }
        ** while (var1_3 || var1_3)
lbl34:
        // 1 sources

        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = kh.tu - kh.lhmn("lhpe", lhms(int ), (int)30)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == kh.lhmn("lhpf", lhmk(int ), (int)35)) break;
                    v4 /* !! */  = (long)kh.lhmn("lhpg", lhmk(int ), (int)36);
                }
                return this.min;
            }
            case 0: {
                do {
                    var2_2 /* !! */  = (int)kh.lhmn("lhph", lhmk(int ), (int)37);
                } while (!var3_1);
                throw null;
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)kh.lhmn("lhpi", lhmk(int ), (int)38);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 2: {
                do {
                    var2_2 /* !! */  = (int)kh.lhmn("lhpj", lhmk(int ), (int)39);
                } while (!var3_1);
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)kh.lhmn("lhpk", lhmk(int ), (int)40);
        ** while (!var3_1)
lbl62:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void lhrn() {
        kh.lhmt[0] = -6378191383585992120L;
        kh.lhmt[1] = -3925783616425686358L;
        kh.lhmt[2] = 6566521451151857690L;
        kh.lhmt[3] = 6594492578698965357L;
        kh.lhmt[4] = 602070517949083236L;
        kh.lhmt[5] = 3087775007978737088L;
        kh.lhmt[6] = -3447175897115725300L;
        kh.lhmt[7] = 8934587347495198901L;
        kh.lhmt[8] = 8534989928276575745L;
        kh.lhmt[9] = 1435713505165569135L;
        kh.lhmt[10] = 1340561725838653915L;
        kh.lhmt[11] = -1113197938348224476L;
        kh.lhmt[12] = -5715274632252354162L;
        kh.lhmt[13] = -8210741202321385035L;
        kh.lhmt[14] = 3226141158786566481L;
        kh.lhmt[15] = -6028393433087913324L;
        kh.lhmt[16] = 6255602916581775957L;
        kh.lhmt[17] = 1807967910082299223L;
        kh.lhmt[18] = 195000149474059146L;
        kh.lhmt[19] = 4003738791479121582L;
        kh.lhmt[20] = 7776770097708651917L;
        kh.lhmt[21] = 3981180169266789484L;
        kh.lhmt[22] = 1171404272937921193L;
        kh.lhmt[23] = 3396607580069754674L;
        kh.lhmt[24] = -7802712378577510169L;
        kh.lhmt[25] = -7859517187674094125L;
        kh.lhmt[26] = 2847130871662494196L;
        kh.lhmt[27] = -5847521665192468865L;
        kh.lhmt[28] = 3513023432676761876L;
        kh.lhmt[29] = -7212543936671952034L;
        kh.lhmt[30] = -4724385656386887350L;
        kh.lhmt[31] = 5791849512866128655L;
        kh.lhmt[32] = 7766194549641022716L;
        kh.lhmt[33] = -3341254755765670746L;
        kh.lhmt[34] = 6038844733229680876L;
        kh.lhmt[35] = -5104723378438319145L;
        kh.lhmt[36] = -1072633134900166211L;
        kh.lhmt[37] = -6566841877933597046L;
        kh.lhmt[38] = -8852786762742540099L;
        kh.lhmt[39] = 408102632472822414L;
        kh.lhmt[40] = -2975370622745053525L;
        kh.lhmt[41] = -5103656260742542800L;
        kh.lhmt[42] = 8546453796800788168L;
        kh.lhmt[43] = 8387361521489477578L;
        kh.lhmt[44] = 835850641398784267L;
        kh.lhmt[45] = -7992251578444374018L;
        kh.lhmt[46] = -5108618436633474197L;
        kh.lhmt[47] = 7662438217091302581L;
        kh.lhmt[48] = 2717229896758293231L;
        kh.lhmt[49] = 5342357077765594463L;
        kh.lhmt[50] = 3040936484404312010L;
        kh.lhmt[51] = -6298322575218479757L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void setMin(int var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = kh.tu - kh.lhmn("lhqb", lhms(int ), (int)36)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == kh.lhmn("lhqc", lhmk(int ), (int)52)) break;
            v0 /* !! */  = (long)kh.lhmn("lhqd", lhmk(int ), (int)53);
        }
        var4_2 = kh.c;
        v1 /* !! */  = kh.tu;
        if (true) ** GOTO lbl11
        block13: while (true) {
            v1 /* !! */  = (long)(v2 - kh.lhmn("lhqe", lhms(int ), (int)37));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 1329573292: {
                    break block13;
                }
                case 1945360874: {
                    v2 = kh.lhmn("lhqf", lhms(int ), (int)38);
                    continue block13;
                }
                case 2041219866: {
                    v2 = kh.lhmn("lhqg", lhms(int ), (int)39);
                    continue block13;
                }
            }
            break;
        }
        var3_3 /* !! */  = kh.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = kh.tu - kh.lhmn("lhqh", lhms(int ), (int)40)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == kh.lhmn("lhqi", lhmk(int ), (int)54)) break;
            v3 /* !! */  = (long)kh.lhmn("lhqj", lhmk(int ), (int)55);
        }
        var2_4 = kh.a;
        if (var4_2) {
            throw null;
lbl29:
            // 2 sources

            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl29
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_2 = kh.tu - kh.lhmn("lhqk", lhms(int ), (int)41)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == kh.lhmn("lhql", lhmk(int ), (int)56)) break;
            v4 /* !! */  = (long)kh.lhmn("lhqm", lhmk(int ), (int)57);
        }
        this.min = var1_1;
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var2_4) ** break;
                ** continue;
                return;
            }
lbl44:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)kh.lhmn("lhqn", lhmk(int ), (int)58);
                if (!var4_2) break;
                throw null;
            }
lbl48:
            // 2 sources

            case 1: {
                var3_3 /* !! */  = (int)kh.lhmn("lhqo", lhmk(int ), (int)59);
                if (!var4_2) ** GOTO lbl44
                throw null;
            }
            case 2: {
                var3_3 /* !! */  = (int)kh.lhmn("lhqp", lhmk(int ), (int)60);
                if (!var4_2) break;
                throw null;
            }
            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)kh.lhmn("lhqq", lhmk(int ), (int)61);
                    if (!var4_2) ** GOTO lbl48
                    throw null;
                }
            }
            case 4: 
        }
        var3_3 /* !! */  = (int)kh.lhmn("lhqr", lhmk(int ), (int)62);
        ** while (!var4_2)
lbl64:
        // 1 sources

        throw null;
    }

    public static /* synthetic */ CallSite lhmn(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public kh(String var1_1, String var2_2, String var3_3) {
        var5_4 /* !! */  = kh.b;
        if (var5_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                super(var1_1, var2_2);
                this.value = var3_3;
                return;
            }
            case 0: {
                var5_4 /* !! */  = (int)kh.lhmn("lhmo", lhmk(int ), (int)0);
                break;
            }
            case 1: {
                var5_4 /* !! */  = (int)kh.lhmn("lhmp", lhmk(int ), (int)1);
                break;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_4 /* !! */  = (int)kh.lhmn("lhmq", lhmk(int ), (int)2);
                    break;
                }
            }
            case 3: 
        }
        var5_4 /* !! */  = (int)kh.lhmn("lhmr", lhmk(int ), (int)3);
        ** while (true)
    }

    private static /* synthetic */ int lhmk(int n2) {
        return lhml[n2] ^ lhmm[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public String getValue() {
        v0 /* !! */  = kh.tu;
        if (true) ** GOTO lbl5
        block16: while (true) {
            v0 /* !! */  = (long)(v1 - kh.lhmn("lhmv", lhms(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1103373426: {
                    v1 = kh.lhmn("lhmw", lhms(int ), (int)1);
                    continue block16;
                }
                case -987066019: {
                    v1 = kh.lhmn("lhmx", lhms(int ), (int)2);
                    continue block16;
                }
                case 1329573292: {
                    break block16;
                }
                case 1750932735: {
                    v1 = kh.lhmn("lhmy", lhms(int ), (int)3);
                    continue block16;
                }
            }
            break;
        }
        var3_1 = kh.c;
        v2 /* !! */  = kh.tu;
        if (true) ** GOTO lbl22
        block17: while (true) {
            v2 /* !! */  = (long)(kh.lhmn("lhna", lhms(int ), (int)5) - kh.lhmn("lhmz", lhms(int ), (int)4));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -2114731027: {
                    continue block17;
                }
                case 1329573292: {
                    break block17;
                }
            }
            break;
        }
        var2_2 /* !! */  = kh.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_0 = kh.tu - kh.lhmn("lhnb", lhms(int ), (int)6)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == kh.lhmn("lhnc", lhmk(int ), (int)4)) break;
            v3 /* !! */  = (long)kh.lhmn("lhnd", lhmk(int ), (int)5);
        }
        var1_3 = kh.a;
        if (!var3_1) ** GOTO lbl41
        throw null;
        {
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var2_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return null;
                }
lbl41:
                // 1 sources

                if (var1_3 || var1_3) continue block19;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_1 = kh.tu - kh.lhmn("lhne", lhms(int ), (int)7)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == kh.lhmn("lhnf", lhmk(int ), (int)6)) break;
                    v4 /* !! */  = (long)kh.lhmn("lhng", lhmk(int ), (int)7);
                }
                return this.value;
lbl49:
                // 2 sources

                case 0: {
                    var2_2 /* !! */  = (int)kh.lhmn("lhnh", lhmk(int ), (int)8);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl58
                }
lbl54:
                // 2 sources

                case 1: {
                    var2_2 /* !! */  = (int)kh.lhmn("lhni", lhmk(int ), (int)9);
                    if (!var3_1) ** GOTO lbl49
                    throw null;
                }
lbl58:
                // 2 sources

                case 2: {
                    var2_2 /* !! */  = (int)kh.lhmn("lhnj", lhmk(int ), (int)10);
                    if (!var3_1) ** GOTO lbl54
                    throw null;
                }
                case 3: 
            }
        }
        do {
            var2_2 /* !! */  = (int)kh.lhmn("lhnk", lhmk(int ), (int)11);
        } while (!var3_1);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void setValue(String var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = kh.tu - kh.lhmn("lhnl", lhms(int ), (int)8)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == kh.lhmn("lhnm", lhmk(int ), (int)12)) break;
            v0 /* !! */  = (long)kh.lhmn("lhnn", lhmk(int ), (int)13);
        }
        var4_2 = kh.c;
        v1 /* !! */  = kh.tu;
        if (true) ** GOTO lbl12
        block25: while (true) {
            v1 /* !! */  = (long)(v2 - kh.lhmn("lhno", lhms(int ), (int)9));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 691868946: {
                    v2 = kh.lhmn("lhnp", lhms(int ), (int)10);
                    continue block25;
                }
                case 762971549: {
                    v2 = kh.lhmn("lhnq", lhms(int ), (int)11);
                    continue block25;
                }
                case 1329573292: {
                    break block25;
                }
                case 1682102297: {
                    v2 = kh.lhmn("lhnr", lhms(int ), (int)12);
                    continue block25;
                }
            }
            break;
        }
        var3_3 /* !! */  = kh.b;
        v3 /* !! */  = kh.tu;
        if (true) ** GOTO lbl29
        block26: while (true) {
            v3 /* !! */  = (long)(v4 - kh.lhmn("lhns", lhms(int ), (int)13));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1076158783: {
                    v4 = kh.lhmn("lhnt", lhms(int ), (int)14);
                    continue block26;
                }
                case 1329573292: {
                    break block26;
                }
                case 1913740745: {
                    v4 = kh.lhmn("lhnu", lhms(int ), (int)15);
                    continue block26;
                }
            }
            break;
        }
        var2_4 = kh.a;
        if (var4_2) {
            throw null;
lbl41:
            // 2 sources

            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl41
        v5 /* !! */  = kh.tu;
        if (true) ** GOTO lbl48
        block28: while (true) {
            v5 /* !! */  = (long)(v6 - kh.lhmn("lhnv", lhms(int ), (int)16));
lbl48:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -367596021: {
                    v6 = kh.lhmn("lhnw", lhms(int ), (int)17);
                    continue block28;
                }
                case 685686005: {
                    v6 = kh.lhmn("lhnx", lhms(int ), (int)18);
                    continue block28;
                }
                case 1329573292: {
                    break block28;
                }
            }
            break;
        }
        this.value = var1_1;
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4 || var2_4) ** continue;
                return;
            }
            case 0: {
                var3_3 /* !! */  = (int)kh.lhmn("lhny", lhmk(int ), (int)14);
                if (!var4_2) break;
                throw null;
            }
lbl67:
            // 2 sources

            case 1: {
                var3_3 /* !! */  = (int)kh.lhmn("lhnz", lhmk(int ), (int)15);
                if (!var4_2) break;
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)kh.lhmn("lhoa", lhmk(int ), (int)16);
                    if (!var4_2) ** GOTO lbl67
                    throw null;
                }
            }
lbl76:
            // 2 sources

            case 3: {
                do {
                    var3_3 /* !! */  = (int)kh.lhmn("lhob", lhmk(int ), (int)17);
                } while (!var4_2);
                throw null;
            }
            case 4: {
                var3_3 /* !! */  = (int)kh.lhmn("lhoc", lhmk(int ), (int)18);
                if (!var4_2) ** GOTO lbl76
                throw null;
            }
            case 5: 
        }
        var3_3 /* !! */  = (int)kh.lhmn("lhod", lhmk(int ), (int)19);
        ** while (!var4_2)
lbl88:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ long lhms(int n2) {
        return lhmt[n2] ^ lhmu[n2];
    }

    static {
        kh.lhrl();
        kh.lhrm();
        lhmt = new long[52];
        lhmu = new long[52];
        kh.lhrn();
        kh.lhro();
    }
}

