/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import ruhack.phobia.du;

final class mo$SidebarCategory
extends Enum<mo$SidebarCategory> {
    private static int[] btfa;
    private final String icon;
    public static final int b;
    public static final /* enum */ mo$SidebarCategory RENDER;
    public static final /* enum */ mo$SidebarCategory MISC;
    private static long[] bter;
    public static final /* enum */ mo$SidebarCategory MOVEMENT;
    private static final /* synthetic */ mo$SidebarCategory[] $VALUES;
    public static final /* enum */ mo$SidebarCategory THEME;
    private final du[] moduleCategories;
    private final String label;
    public static final boolean c;
    public static final /* enum */ mo$SidebarCategory COMBAT;
    public static final boolean a;
    public static final /* enum */ mo$SidebarCategory PLAYER;
    private static int[] btez;
    public static final long ej = -6775390248135710522L;
    private static long[] btes;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private mo$SidebarCategory(String var3_3, String var4_4, du ... var5_5) {
        var7_6 /* !! */  = mo$SidebarCategory.b;
        var6_7 = mo$SidebarCategory.a;
        if (var7_6 /* !! */  == 0) ** GOTO lbl-1000
        switch (var7_6 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                super(var1_1, var2_2);
                this.label = var3_3;
                this.icon = var4_4;
                this.moduleCategories = var5_5;
                return;
            }
            case 0: {
                var7_6 /* !! */  = (int)mo$SidebarCategory.btet("btge", btey(int ), (int)16);
                ** GOTO lbl18
            }
lbl14:
            // 2 sources

            case 1: {
                while (true) {
                    var7_6 /* !! */  = (int)mo$SidebarCategory.btet("btgf", btey(int ), (int)17);
                }
            }
lbl18:
            // 2 sources

            case 2: {
                var7_6 /* !! */  = (int)mo$SidebarCategory.btet("btgg", btey(int ), (int)18);
                ** GOTO lbl14
            }
            case 3: {
                while (true) {
                    var7_6 /* !! */  = (int)mo$SidebarCategory.btet("btgh", btey(int ), (int)19);
                }
            }
            case 4: {
                var7_6 /* !! */  = (int)mo$SidebarCategory.btet("btgi", btey(int ), (int)20);
            }
            case 5: 
        }
        while (true) {
            var7_6 /* !! */  = (int)mo$SidebarCategory.btet("btgj", btey(int ), (int)21);
        }
    }

    public static /* synthetic */ CallSite btet(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void btjl() {
        mo$SidebarCategory.bter[0] = 3053850411731545018L;
        mo$SidebarCategory.bter[1] = -4908503109072362359L;
        mo$SidebarCategory.bter[2] = -4685817881889895610L;
        mo$SidebarCategory.bter[3] = -2586932759960715016L;
        mo$SidebarCategory.bter[4] = 1203046166778329765L;
        mo$SidebarCategory.bter[5] = 3926629168010390110L;
        mo$SidebarCategory.bter[6] = 9179059236390258033L;
        mo$SidebarCategory.bter[7] = 1936073259417307706L;
        mo$SidebarCategory.bter[8] = 8498107148834217170L;
        mo$SidebarCategory.bter[9] = -8014904774888773483L;
        mo$SidebarCategory.bter[10] = -7019674733037933421L;
        mo$SidebarCategory.bter[11] = -1077086649668853952L;
        mo$SidebarCategory.bter[12] = -1630154325389844743L;
        mo$SidebarCategory.bter[13] = 2711673385205943776L;
        mo$SidebarCategory.bter[14] = -1731696995722460556L;
        mo$SidebarCategory.bter[15] = -3965391388424796767L;
        mo$SidebarCategory.bter[16] = -391660567268840647L;
        mo$SidebarCategory.bter[17] = -9163708193304152014L;
        mo$SidebarCategory.bter[18] = -5108001119037829800L;
        mo$SidebarCategory.bter[19] = -1258317770086862287L;
        mo$SidebarCategory.bter[20] = -5720223646605269646L;
        mo$SidebarCategory.bter[21] = -9021398035677026972L;
        mo$SidebarCategory.bter[22] = -5444421298719314970L;
        mo$SidebarCategory.bter[23] = 7804029543243881407L;
        mo$SidebarCategory.bter[24] = 9013664999041791935L;
        mo$SidebarCategory.bter[25] = 380216430751011934L;
        mo$SidebarCategory.bter[26] = 1390987066261616247L;
        mo$SidebarCategory.bter[27] = -7216020083782401494L;
        mo$SidebarCategory.bter[28] = 2970754000420271215L;
        mo$SidebarCategory.bter[29] = -8659371111201545153L;
        mo$SidebarCategory.bter[30] = 5924649762176490778L;
        mo$SidebarCategory.bter[31] = -1567608385323719665L;
        mo$SidebarCategory.bter[32] = 3975928704161954529L;
        mo$SidebarCategory.bter[33] = -1991805442216857059L;
        mo$SidebarCategory.bter[34] = 2343338473892951183L;
        mo$SidebarCategory.bter[35] = 7216781539367167457L;
        mo$SidebarCategory.bter[36] = -6489457166087704813L;
        mo$SidebarCategory.bter[37] = 7470214287941369611L;
        mo$SidebarCategory.bter[38] = -8745435905656667099L;
        mo$SidebarCategory.bter[39] = -8536683761506789074L;
        mo$SidebarCategory.bter[40] = 7912426557717182963L;
        mo$SidebarCategory.bter[41] = -8838821290164576379L;
        mo$SidebarCategory.bter[42] = -908032607621908579L;
        mo$SidebarCategory.bter[43] = 4617171001629351839L;
        mo$SidebarCategory.bter[44] = -4344616976425589331L;
        mo$SidebarCategory.bter[45] = 4313377122011540049L;
        mo$SidebarCategory.bter[46] = -6026710053064295741L;
    }

    private static /* synthetic */ void btjj() {
        mo$SidebarCategory.btez[0] = -1252651368;
        mo$SidebarCategory.btez[1] = 1341366109;
        mo$SidebarCategory.btez[2] = -164001585;
        mo$SidebarCategory.btez[3] = -104653368;
        mo$SidebarCategory.btez[4] = 1901414300;
        mo$SidebarCategory.btez[5] = 763558532;
        mo$SidebarCategory.btez[6] = 1968171929;
        mo$SidebarCategory.btez[7] = 261379757;
        mo$SidebarCategory.btez[8] = -1788421583;
        mo$SidebarCategory.btez[9] = 1151264227;
        mo$SidebarCategory.btez[10] = -1536708071;
        mo$SidebarCategory.btez[11] = 366542107;
        mo$SidebarCategory.btez[12] = -2023533352;
        mo$SidebarCategory.btez[13] = 1504205268;
        mo$SidebarCategory.btez[14] = 1118236984;
        mo$SidebarCategory.btez[15] = 875320462;
        mo$SidebarCategory.btez[16] = 300110514;
        mo$SidebarCategory.btez[17] = -342373420;
        mo$SidebarCategory.btez[18] = -1827068417;
        mo$SidebarCategory.btez[19] = 765233385;
        mo$SidebarCategory.btez[20] = 64762963;
        mo$SidebarCategory.btez[21] = 980837971;
        mo$SidebarCategory.btez[22] = -2049087940;
        mo$SidebarCategory.btez[23] = -1197230864;
        mo$SidebarCategory.btez[24] = -1640993634;
        mo$SidebarCategory.btez[25] = -2022899428;
        mo$SidebarCategory.btez[26] = -1594868803;
        mo$SidebarCategory.btez[27] = 148674304;
        mo$SidebarCategory.btez[28] = 1223590589;
        mo$SidebarCategory.btez[29] = 331507591;
        mo$SidebarCategory.btez[30] = 888988300;
        mo$SidebarCategory.btez[31] = 1663886287;
        mo$SidebarCategory.btez[32] = 182517723;
        mo$SidebarCategory.btez[33] = -912210220;
        mo$SidebarCategory.btez[34] = -1569949889;
        mo$SidebarCategory.btez[35] = -918621952;
        mo$SidebarCategory.btez[36] = -1333191085;
        mo$SidebarCategory.btez[37] = -1270429214;
        mo$SidebarCategory.btez[38] = -1628388728;
        mo$SidebarCategory.btez[39] = 1175360267;
        mo$SidebarCategory.btez[40] = -1157032297;
        mo$SidebarCategory.btez[41] = 1547845872;
        mo$SidebarCategory.btez[42] = -514933790;
        mo$SidebarCategory.btez[43] = 295182746;
        mo$SidebarCategory.btez[44] = 1717903612;
        mo$SidebarCategory.btez[45] = -297041584;
        mo$SidebarCategory.btez[46] = 2079563074;
        mo$SidebarCategory.btez[47] = -1614808602;
        mo$SidebarCategory.btez[48] = -1655281589;
        mo$SidebarCategory.btez[49] = 637004528;
        mo$SidebarCategory.btez[50] = -1736062111;
        mo$SidebarCategory.btez[51] = 1133852602;
        mo$SidebarCategory.btez[52] = 764653499;
        mo$SidebarCategory.btez[53] = 144088573;
        mo$SidebarCategory.btez[54] = 1453956787;
        mo$SidebarCategory.btez[55] = 1036481698;
        mo$SidebarCategory.btez[56] = -1531469440;
        mo$SidebarCategory.btez[57] = 887249311;
        mo$SidebarCategory.btez[58] = 348312358;
        mo$SidebarCategory.btez[59] = 1034851889;
        mo$SidebarCategory.btez[60] = 923947627;
        mo$SidebarCategory.btez[61] = -143672525;
        mo$SidebarCategory.btez[62] = -978144540;
        mo$SidebarCategory.btez[63] = -1183921591;
        mo$SidebarCategory.btez[64] = -634024233;
        mo$SidebarCategory.btez[65] = 316461793;
        mo$SidebarCategory.btez[66] = -47927921;
        mo$SidebarCategory.btez[67] = 1241970342;
        mo$SidebarCategory.btez[68] = -1506620516;
    }

    private static /* synthetic */ int btey(int n2) {
        return btez[n2] ^ btfa[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean accepts(du var1_1) {
        v0 /* !! */  = mo$SidebarCategory.ej;
        if (true) ** GOTO lbl5
        block36: while (true) {
            v0 /* !! */  = (long)(v1 - mo$SidebarCategory.btet("btgk", bteq(int ), (int)17));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -2059818810: {
                    break block36;
                }
                case -1609401525: {
                    v1 = mo$SidebarCategory.btet("btgl", bteq(int ), (int)18);
                    continue block36;
                }
                case 144387181: {
                    v1 = mo$SidebarCategory.btet("btgm", bteq(int ), (int)19);
                    continue block36;
                }
            }
            break;
        }
        var8_2 = mo$SidebarCategory.c;
        v2 /* !! */  = mo$SidebarCategory.ej;
        if (true) ** GOTO lbl19
        block37: while (true) {
            v2 /* !! */  = (long)(mo$SidebarCategory.btet("btgo", bteq(int ), (int)21) - mo$SidebarCategory.btet("btgn", bteq(int ), (int)20));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -2059818810: {
                    break block37;
                }
                case 905588180: {
                    continue block37;
                }
            }
            break;
        }
        var7_3 /* !! */  = mo$SidebarCategory.b;
        v3 /* !! */  = mo$SidebarCategory.ej;
        if (true) ** GOTO lbl29
        block38: while (true) {
            v3 /* !! */  = (long)(v4 - mo$SidebarCategory.btet("btgp", bteq(int ), (int)22));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -2059818810: {
                    break block38;
                }
                case -1809052198: {
                    v4 = mo$SidebarCategory.btet("btgq", bteq(int ), (int)23);
                    continue block38;
                }
                case 376837506: {
                    v4 = mo$SidebarCategory.btet("btgr", bteq(int ), (int)24);
                    continue block38;
                }
                case 1319642888: {
                    v4 = mo$SidebarCategory.btet("btgs", bteq(int ), (int)25);
                    continue block38;
                }
            }
            break;
        }
        var6_4 = mo$SidebarCategory.a;
        if (var8_2) {
            throw null;
lbl44:
            // 11 sources

            return (boolean)mo$SidebarCategory.btet("btgt", btey(int ), (int)22);
        }
        if (var6_4 || var6_4) ** GOTO lbl44
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_0 = mo$SidebarCategory.ej - mo$SidebarCategory.btet("btgu", bteq(int ), (int)26)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v5 /* !! */  == mo$SidebarCategory.btet("btgv", btey(int ), (int)23)) break;
            v5 /* !! */  = (long)mo$SidebarCategory.btet("btgw", btey(int ), (int)24);
        }
        var2_5 = this.moduleCategories;
        if (var6_4) ** GOTO lbl44
        if (var7_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var7_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                var3_6 = var2_5.length;
                if (var6_4) ** GOTO lbl44
                var4_7 = mo$SidebarCategory.btet("btgx", btey(int ), (int)25);
                if (var6_4) ** GOTO lbl44
                do {
                    if (var6_4 || var6_4) ** GOTO lbl44
                    if (var4_7 >= var3_6) ** GOTO lbl76
                    if (var6_4) ** GOTO lbl44
                    var5_8 = var2_5[var4_7];
                    if (var6_4 || var6_4) ** GOTO lbl44
                    if (var5_8 != var1_1) ** GOTO lbl71
                    if (var6_4) ** GOTO lbl44
                    return (boolean)mo$SidebarCategory.btet("btgy", btey(int ), (int)26);
lbl71:
                    // 1 sources

                    if (var6_4 || var6_4) ** GOTO lbl44
                    ++var4_7;
                    if (var6_4) ** GOTO lbl44
                } while (!var8_2);
                throw null;
lbl76:
                // 1 sources

                if (!var6_4 && !var6_4) ** break;
                ** continue;
                return (boolean)mo$SidebarCategory.btet("btgz", btey(int ), (int)27);
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var7_3 /* !! */  = (int)mo$SidebarCategory.btet("btha", btey(int ), (int)28);
                    if (var8_2) {
                        throw null;
                    }
                    ** GOTO lbl156
                    break;
                }
            }
lbl85:
            // 3 sources

            case 1: {
                var7_3 /* !! */  = (int)mo$SidebarCategory.btet("bthb", btey(int ), (int)29);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl127
            }
            case 2: {
                var7_3 /* !! */  = (int)mo$SidebarCategory.btet("bthc", btey(int ), (int)30);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl104
            }
            case 3: {
                var7_3 /* !! */  = (int)mo$SidebarCategory.btet("bthd", btey(int ), (int)31);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl131
            }
lbl100:
            // 2 sources

            case 4: {
                var7_3 /* !! */  = (int)mo$SidebarCategory.btet("bthe", btey(int ), (int)32);
                if (var8_2) {
                    throw null;
                }
            }
lbl104:
            // 4 sources

            case 5: {
                var7_3 /* !! */  = (int)mo$SidebarCategory.btet("bthf", btey(int ), (int)33);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl156
            }
lbl109:
            // 2 sources

            case 6: {
                var7_3 /* !! */  = (int)mo$SidebarCategory.btet("bthg", btey(int ), (int)34);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl156
            }
            case 7: {
                var7_3 /* !! */  = (int)mo$SidebarCategory.btet("bthh", btey(int ), (int)35);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl152
            }
            case 8: {
                var7_3 /* !! */  = (int)mo$SidebarCategory.btet("bthi", btey(int ), (int)36);
                if (!var8_2) break;
                throw null;
            }
lbl123:
            // 2 sources

            case 9: {
                var7_3 /* !! */  = (int)mo$SidebarCategory.btet("bthj", btey(int ), (int)37);
                if (!var8_2) break;
                throw null;
            }
lbl127:
            // 3 sources

            case 10: {
                var7_3 /* !! */  = (int)mo$SidebarCategory.btet("bthk", btey(int ), (int)38);
                if (!var8_2) ** GOTO lbl109
                throw null;
            }
lbl131:
            // 2 sources

            case 11: {
                var7_3 /* !! */  = (int)mo$SidebarCategory.btet("bthl", btey(int ), (int)39);
                if (!var8_2) ** GOTO lbl85
                throw null;
            }
            case 12: {
                var7_3 /* !! */  = (int)mo$SidebarCategory.btet("bthm", btey(int ), (int)40);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl148
            }
            case 13: {
                var7_3 /* !! */  = (int)mo$SidebarCategory.btet("bthn", btey(int ), (int)41);
                if (!var8_2) ** GOTO lbl123
                throw null;
            }
            case 14: {
                var7_3 /* !! */  = (int)mo$SidebarCategory.btet("btho", btey(int ), (int)42);
                if (!var8_2) ** GOTO lbl100
                throw null;
            }
lbl148:
            // 2 sources

            case 15: {
                var7_3 /* !! */  = (int)mo$SidebarCategory.btet("bthp", btey(int ), (int)43);
                if (!var8_2) ** GOTO lbl127
                throw null;
            }
lbl152:
            // 2 sources

            case 16: {
                var7_3 /* !! */  = (int)mo$SidebarCategory.btet("bthq", btey(int ), (int)44);
                if (!var8_2) ** GOTO lbl85
                throw null;
            }
lbl156:
            // 4 sources

            case 17: {
                var7_3 /* !! */  = (int)mo$SidebarCategory.btet("bthr", btey(int ), (int)45);
                if (!var8_2) break;
                throw null;
            }
            case 18: 
        }
        var7_3 /* !! */  = (int)mo$SidebarCategory.btet("bths", btey(int ), (int)46);
        ** while (!var8_2)
lbl163:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static mo$SidebarCategory valueOf(String var0) {
        v0 /* !! */  = mo$SidebarCategory.ej;
        if (true) ** GOTO lbl5
        block14: while (true) {
            v0 /* !! */  = (long)(mo$SidebarCategory.btet("btfr", bteq(int ), (int)12) - mo$SidebarCategory.btet("btfq", bteq(int ), (int)11));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -2059818810: {
                    break block14;
                }
                case -1799137459: {
                    continue block14;
                }
            }
            break;
        }
        var3_1 = mo$SidebarCategory.c;
        v1 /* !! */  = mo$SidebarCategory.ej;
        if (true) ** GOTO lbl15
        block15: while (true) {
            v1 /* !! */  = (long)(mo$SidebarCategory.btet("btft", bteq(int ), (int)14) - mo$SidebarCategory.btet("btfs", bteq(int ), (int)13));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -2059818810: {
                    break block15;
                }
                case 1968447028: {
                    continue block15;
                }
            }
            break;
        }
        var2_2 /* !! */  = mo$SidebarCategory.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = mo$SidebarCategory.ej - mo$SidebarCategory.btet("btfu", bteq(int ), (int)15)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == mo$SidebarCategory.btet("btfv", btey(int ), (int)8)) break;
            v2 /* !! */  = (long)mo$SidebarCategory.btet("btfw", btey(int ), (int)9);
        }
        var1_3 = mo$SidebarCategory.a;
        if (var3_1) {
            throw null;
lbl30:
            // 1 sources

            return null;
        }
        ** while (var1_3 || var1_3)
lbl33:
        // 1 sources

        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_1 = mo$SidebarCategory.ej - mo$SidebarCategory.btet("btfx", bteq(int ), (int)16)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == mo$SidebarCategory.btet("btfy", btey(int ), (int)10)) break;
                    v3 /* !! */  = (long)mo$SidebarCategory.btet("btfz", btey(int ), (int)11);
                }
                return Enum.valueOf(mo$SidebarCategory.class, var0);
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)mo$SidebarCategory.btet("btga", btey(int ), (int)12);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl53
                    break;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)mo$SidebarCategory.btet("btgb", btey(int ), (int)13);
                if (!var3_1) break;
                throw null;
            }
lbl53:
            // 2 sources

            case 2: {
                do {
                    var2_2 /* !! */  = (int)mo$SidebarCategory.btet("btgc", btey(int ), (int)14);
                } while (!var3_1);
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)mo$SidebarCategory.btet("btgd", btey(int ), (int)15);
        ** while (!var3_1)
lbl61:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static mo$SidebarCategory[] values() {
        v0 /* !! */  = mo$SidebarCategory.ej;
        if (true) ** GOTO lbl5
        block21: while (true) {
            v0 /* !! */  = (long)(v1 - mo$SidebarCategory.btet("bteu", bteq(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -2059818810: {
                    break block21;
                }
                case 569059583: {
                    v1 = mo$SidebarCategory.btet("btev", bteq(int ), (int)1);
                    continue block21;
                }
                case 1209800274: {
                    v1 = mo$SidebarCategory.btet("btew", bteq(int ), (int)2);
                    continue block21;
                }
            }
            break;
        }
        var2 = mo$SidebarCategory.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = mo$SidebarCategory.ej - mo$SidebarCategory.btet("btex", bteq(int ), (int)3)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == mo$SidebarCategory.btet("btfb", btey(int ), (int)0)) break;
            v2 /* !! */  = (long)mo$SidebarCategory.btet("btfc", btey(int ), (int)1);
        }
        var1_1 /* !! */  = mo$SidebarCategory.b;
        v3 /* !! */  = mo$SidebarCategory.ej;
        if (true) ** GOTO lbl26
        block23: while (true) {
            v3 /* !! */  = (long)(v4 - mo$SidebarCategory.btet("btfd", bteq(int ), (int)4));
lbl26:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -2059818810: {
                    break block23;
                }
                case -1650514831: {
                    v4 = mo$SidebarCategory.btet("btfe", bteq(int ), (int)5);
                    continue block23;
                }
                case -906145185: {
                    v4 = mo$SidebarCategory.btet("btff", bteq(int ), (int)6);
                    continue block23;
                }
            }
            break;
        }
        var0_2 = mo$SidebarCategory.a;
        if (var2) {
            throw null;
            return null;
        }
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        block10 : switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var0_2 || var0_2) ** continue;
                v5 /* !! */  = mo$SidebarCategory.ej;
                if (true) ** GOTO lbl48
                block25: while (true) {
                    v5 /* !! */  = (long)(v6 - mo$SidebarCategory.btet("btfg", bteq(int ), (int)7));
lbl48:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -2059818810: {
                            break block25;
                        }
                        case -1738309137: {
                            v6 = mo$SidebarCategory.btet("btfh", bteq(int ), (int)8);
                            continue block25;
                        }
                        case 1081739269: {
                            v6 = mo$SidebarCategory.btet("btfi", bteq(int ), (int)9);
                            continue block25;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_1 = mo$SidebarCategory.ej - mo$SidebarCategory.btet("btfj", bteq(int ), (int)10)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v7 /* !! */  == mo$SidebarCategory.btet("btfk", btey(int ), (int)2)) break;
                    v7 /* !! */  = (long)mo$SidebarCategory.btet("btfl", btey(int ), (int)3);
                }
                return (mo$SidebarCategory[])mo$SidebarCategory.$VALUES.clone();
            }
            case 0: {
                var1_1 /* !! */  = (int)mo$SidebarCategory.btet("btfm", btey(int ), (int)4);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl74
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)mo$SidebarCategory.btet("btfn", btey(int ), (int)5);
                    if (!var2) break block10;
                    throw null;
                }
            }
lbl74:
            // 2 sources

            case 2: {
                do {
                    var1_1 /* !! */  = (int)mo$SidebarCategory.btet("btfo", btey(int ), (int)6);
                } while (!var2);
                throw null;
            }
            case 3: 
        }
        var1_1 /* !! */  = (int)mo$SidebarCategory.btet("btfp", btey(int ), (int)7);
        ** while (!var2)
lbl82:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ mo$SidebarCategory[] $values() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = mo$SidebarCategory.ej - mo$SidebarCategory.btet("btht", bteq(int ), (int)27)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == mo$SidebarCategory.btet("bthu", btey(int ), (int)47)) break;
            v0 /* !! */  = (long)mo$SidebarCategory.btet("bthv", btey(int ), (int)48);
        }
        var2 = mo$SidebarCategory.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = mo$SidebarCategory.ej - mo$SidebarCategory.btet("bthw", bteq(int ), (int)28)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == mo$SidebarCategory.btet("bthx", btey(int ), (int)49)) break;
            v1 /* !! */  = (long)mo$SidebarCategory.btet("bthy", btey(int ), (int)50);
        }
        var1_1 = mo$SidebarCategory.b;
        v2 /* !! */  = mo$SidebarCategory.ej;
        if (true) ** GOTO lbl19
        block28: while (true) {
            v2 /* !! */  = (long)(v3 - mo$SidebarCategory.btet("bthz", bteq(int ), (int)29));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -2059818810: {
                    break block28;
                }
                case -317929406: {
                    v3 = mo$SidebarCategory.btet("btia", bteq(int ), (int)30);
                    continue block28;
                }
                case 1354292074: {
                    v3 = mo$SidebarCategory.btet("btib", bteq(int ), (int)31);
                    continue block28;
                }
            }
            break;
        }
        var0_2 = mo$SidebarCategory.a;
        if (var2) {
            throw null;
lbl31:
            // 1 sources

            return null;
        }
        ** while (var0_2 || var0_2)
lbl34:
        // 1 sources

        v4 = new mo$SidebarCategory[6];
        v5 = mo$SidebarCategory.btet("btic", btey(int ), (int)51);
        v6 /* !! */  = mo$SidebarCategory.ej;
        if (true) ** GOTO lbl40
        block30: while (true) {
            v6 /* !! */  = (long)(v7 - mo$SidebarCategory.btet("btid", bteq(int ), (int)32));
lbl40:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case -2059818810: {
                    break block30;
                }
                case 516027312: {
                    v7 = mo$SidebarCategory.btet("btie", bteq(int ), (int)33);
                    continue block30;
                }
                case 886561010: {
                    v7 = mo$SidebarCategory.btet("btif", bteq(int ), (int)34);
                    continue block30;
                }
                case 1322423061: {
                    v7 = mo$SidebarCategory.btet("btig", bteq(int ), (int)35);
                    continue block30;
                }
            }
            break;
        }
        v4[v5] = mo$SidebarCategory.COMBAT;
        v8 = mo$SidebarCategory.btet("btih", btey(int ), (int)52);
        v9 /* !! */  = mo$SidebarCategory.ej;
        if (true) ** GOTO lbl58
        block31: while (true) {
            v9 /* !! */  = (long)(v10 - mo$SidebarCategory.btet("btii", bteq(int ), (int)36));
lbl58:
            // 2 sources

            switch ((int)v9 /* !! */ ) {
                case -2059818810: {
                    break block31;
                }
                case -1320009826: {
                    v10 = mo$SidebarCategory.btet("btij", bteq(int ), (int)37);
                    continue block31;
                }
                case 342243463: {
                    v10 = mo$SidebarCategory.btet("btik", bteq(int ), (int)38);
                    continue block31;
                }
                case 1529336838: {
                    v10 = mo$SidebarCategory.btet("btil", bteq(int ), (int)39);
                    continue block31;
                }
            }
            break;
        }
        v4[v8] = mo$SidebarCategory.MOVEMENT;
        v11 = mo$SidebarCategory.btet("btim", btey(int ), (int)53);
        while (true) {
            if ((v12 = (cfr_temp_2 = mo$SidebarCategory.ej - mo$SidebarCategory.btet("btin", bteq(int ), (int)40)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v12 == mo$SidebarCategory.btet("btio", btey(int ), (int)54)) break;
            v12 = 1272699509;
        }
        v4[v11] = mo$SidebarCategory.PLAYER;
        v13 = mo$SidebarCategory.btet("btip", btey(int ), (int)55);
        v14 /* !! */  = mo$SidebarCategory.ej;
        if (true) ** GOTO lbl84
        block33: while (true) {
            v14 /* !! */  = (long)(mo$SidebarCategory.btet("btir", bteq(int ), (int)42) - mo$SidebarCategory.btet("btiq", bteq(int ), (int)41));
lbl84:
            // 2 sources

            switch ((int)v14 /* !! */ ) {
                case -2059818810: {
                    break block33;
                }
                case 450692225: {
                    continue block33;
                }
            }
            break;
        }
        v4[v13] = mo$SidebarCategory.RENDER;
        v15 = mo$SidebarCategory.btet("btis", btey(int ), (int)56);
        v16 /* !! */  = mo$SidebarCategory.ej;
        if (true) ** GOTO lbl95
        block34: while (true) {
            v16 /* !! */  = (long)(v17 - mo$SidebarCategory.btet("btit", bteq(int ), (int)43));
lbl95:
            // 2 sources

            switch ((int)v16 /* !! */ ) {
                case -2059818810: {
                    break block34;
                }
                case -1745860345: {
                    v17 = mo$SidebarCategory.btet("btiu", bteq(int ), (int)44);
                    continue block34;
                }
                case -841818676: {
                    v17 = mo$SidebarCategory.btet("btiv", bteq(int ), (int)45);
                    continue block34;
                }
            }
            break;
        }
        v4[v15] = mo$SidebarCategory.MISC;
        v18 = mo$SidebarCategory.btet("btiw", btey(int ), (int)57);
        while (true) {
            if ((v19 = (cfr_temp_3 = mo$SidebarCategory.ej - mo$SidebarCategory.btet("btix", bteq(int ), (int)46)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v19 == mo$SidebarCategory.btet("btiy", btey(int ), (int)58)) break;
            v19 = 656960287;
        }
        v4[v18] = mo$SidebarCategory.THEME;
        return v4;
    }

    private static /* synthetic */ void btjk() {
        mo$SidebarCategory.btfa[0] = 1252651367;
        mo$SidebarCategory.btfa[1] = -314118280;
        mo$SidebarCategory.btfa[2] = 164001584;
        mo$SidebarCategory.btfa[3] = 1833507582;
        mo$SidebarCategory.btfa[4] = 1901414302;
        mo$SidebarCategory.btfa[5] = 763558534;
        mo$SidebarCategory.btfa[6] = 1968171930;
        mo$SidebarCategory.btfa[7] = 261379757;
        mo$SidebarCategory.btfa[8] = -1788421584;
        mo$SidebarCategory.btfa[9] = -730806751;
        mo$SidebarCategory.btfa[10] = -1536708072;
        mo$SidebarCategory.btfa[11] = -1903539063;
        mo$SidebarCategory.btfa[12] = -2023533349;
        mo$SidebarCategory.btfa[13] = 1504205270;
        mo$SidebarCategory.btfa[14] = 1118236984;
        mo$SidebarCategory.btfa[15] = 875320460;
        mo$SidebarCategory.btfa[16] = 300110512;
        mo$SidebarCategory.btfa[17] = -342373420;
        mo$SidebarCategory.btfa[18] = -1827068419;
        mo$SidebarCategory.btfa[19] = 765233387;
        mo$SidebarCategory.btfa[20] = 64762966;
        mo$SidebarCategory.btfa[21] = 980837968;
        mo$SidebarCategory.btfa[22] = -2049087939;
        mo$SidebarCategory.btfa[23] = 1197230863;
        mo$SidebarCategory.btfa[24] = -2049742974;
        mo$SidebarCategory.btfa[25] = -2022899428;
        mo$SidebarCategory.btfa[26] = -1594868804;
        mo$SidebarCategory.btfa[27] = 148674304;
        mo$SidebarCategory.btfa[28] = 1223590581;
        mo$SidebarCategory.btfa[29] = 331507587;
        mo$SidebarCategory.btfa[30] = 888988316;
        mo$SidebarCategory.btfa[31] = 1663886303;
        mo$SidebarCategory.btfa[32] = 182517718;
        mo$SidebarCategory.btfa[33] = -912210235;
        mo$SidebarCategory.btfa[34] = -1569949907;
        mo$SidebarCategory.btfa[35] = -918621943;
        mo$SidebarCategory.btfa[36] = -1333191086;
        mo$SidebarCategory.btfa[37] = -1270429208;
        mo$SidebarCategory.btfa[38] = -1628388721;
        mo$SidebarCategory.btfa[39] = 1175360281;
        mo$SidebarCategory.btfa[40] = -1157032295;
        mo$SidebarCategory.btfa[41] = 1547845881;
        mo$SidebarCategory.btfa[42] = -514933788;
        mo$SidebarCategory.btfa[43] = 295182736;
        mo$SidebarCategory.btfa[44] = 1717903596;
        mo$SidebarCategory.btfa[45] = -297041583;
        mo$SidebarCategory.btfa[46] = 2079563078;
        mo$SidebarCategory.btfa[47] = 1614808601;
        mo$SidebarCategory.btfa[48] = 965858299;
        mo$SidebarCategory.btfa[49] = -637004529;
        mo$SidebarCategory.btfa[50] = 1973436391;
        mo$SidebarCategory.btfa[51] = 1133852602;
        mo$SidebarCategory.btfa[52] = 764653498;
        mo$SidebarCategory.btfa[53] = 144088575;
        mo$SidebarCategory.btfa[54] = -1453956788;
        mo$SidebarCategory.btfa[55] = 1036481697;
        mo$SidebarCategory.btfa[56] = -1531469436;
        mo$SidebarCategory.btfa[57] = 887249306;
        mo$SidebarCategory.btfa[58] = -348312359;
        mo$SidebarCategory.btfa[59] = 1034851890;
        mo$SidebarCategory.btfa[60] = 923947624;
        mo$SidebarCategory.btfa[61] = -143672525;
        mo$SidebarCategory.btfa[62] = -978144538;
        mo$SidebarCategory.btfa[63] = -1183921591;
        mo$SidebarCategory.btfa[64] = -634024234;
        mo$SidebarCategory.btfa[65] = 316461795;
        mo$SidebarCategory.btfa[66] = -47927924;
        mo$SidebarCategory.btfa[67] = 1241970338;
        mo$SidebarCategory.btfa[68] = -1506620519;
    }

    private static /* synthetic */ void btjm() {
        mo$SidebarCategory.btes[0] = -7042338822315054566L;
        mo$SidebarCategory.btes[1] = -3886659877711987305L;
        mo$SidebarCategory.btes[2] = 3966744775560794587L;
        mo$SidebarCategory.btes[3] = 7732846702599397158L;
        mo$SidebarCategory.btes[4] = -7008220191976520754L;
        mo$SidebarCategory.btes[5] = 6264272127442461160L;
        mo$SidebarCategory.btes[6] = 5228982517416134895L;
        mo$SidebarCategory.btes[7] = -790498771261049419L;
        mo$SidebarCategory.btes[8] = 850507575719097189L;
        mo$SidebarCategory.btes[9] = 6431379983402845150L;
        mo$SidebarCategory.btes[10] = -6576063175904034036L;
        mo$SidebarCategory.btes[11] = 551102235562417979L;
        mo$SidebarCategory.btes[12] = 2082438272610470181L;
        mo$SidebarCategory.btes[13] = 4856611619180361121L;
        mo$SidebarCategory.btes[14] = -4252153279165834456L;
        mo$SidebarCategory.btes[15] = 5674351366469909949L;
        mo$SidebarCategory.btes[16] = 7264908109261566952L;
        mo$SidebarCategory.btes[17] = -2980426322231663581L;
        mo$SidebarCategory.btes[18] = 7566004492923158430L;
        mo$SidebarCategory.btes[19] = 1603772655716747727L;
        mo$SidebarCategory.btes[20] = 6832118148245699065L;
        mo$SidebarCategory.btes[21] = -918812645011598774L;
        mo$SidebarCategory.btes[22] = -6596610288141798969L;
        mo$SidebarCategory.btes[23] = -4411026017398903656L;
        mo$SidebarCategory.btes[24] = 4173251349755513888L;
        mo$SidebarCategory.btes[25] = 6053569803335088774L;
        mo$SidebarCategory.btes[26] = -5215896722382816835L;
        mo$SidebarCategory.btes[27] = -282149312094628485L;
        mo$SidebarCategory.btes[28] = 7246188093936531886L;
        mo$SidebarCategory.btes[29] = -3387345730376888638L;
        mo$SidebarCategory.btes[30] = 5956973166290630209L;
        mo$SidebarCategory.btes[31] = -2593111196612610664L;
        mo$SidebarCategory.btes[32] = -864696038994339007L;
        mo$SidebarCategory.btes[33] = 4984283885606527539L;
        mo$SidebarCategory.btes[34] = 8126649566703511733L;
        mo$SidebarCategory.btes[35] = -5623898632756040788L;
        mo$SidebarCategory.btes[36] = -5304745490565837955L;
        mo$SidebarCategory.btes[37] = -2163589272645668071L;
        mo$SidebarCategory.btes[38] = 7674546083490453253L;
        mo$SidebarCategory.btes[39] = 7259159964210668794L;
        mo$SidebarCategory.btes[40] = 5111023580995644270L;
        mo$SidebarCategory.btes[41] = 2517114358044060331L;
        mo$SidebarCategory.btes[42] = 1945615777699012071L;
        mo$SidebarCategory.btes[43] = -2788280241180092944L;
        mo$SidebarCategory.btes[44] = 446105823407917249L;
        mo$SidebarCategory.btes[45] = -3324798087173681043L;
        mo$SidebarCategory.btes[46] = 4926573055709837922L;
    }

    static {
        btez = new int[69];
        btfa = new int[69];
        mo$SidebarCategory.btjj();
        mo$SidebarCategory.btjk();
        bter = new long[47];
        btes = new long[47];
        mo$SidebarCategory.btjl();
        mo$SidebarCategory.btjm();
        COMBAT = new mo$SidebarCategory("Combat", "V", du.RAGE, du.LEGIT);
        MOVEMENT = new mo$SidebarCategory("Movement", "W", du.MOVEMENT);
        PLAYER = new mo$SidebarCategory("Player", "Y", du.PLAYER, du.PVE);
        RENDER = new mo$SidebarCategory("Render", "Z", du.RENDER, du.DISPLAY, du.ESP);
        MISC = new mo$SidebarCategory("Misc", "X", du.MISC, du.BINDS, du.CONFIG, du.OTHER);
        THEME = new mo$SidebarCategory("Theme", "A", new du[0]);
        $VALUES = mo$SidebarCategory.$values();
    }

    private static /* synthetic */ long bteq(int n2) {
        return bter[n2] ^ btes[n2];
    }
}

