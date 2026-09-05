/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

final class fi$ActionPhase
extends Enum<fi$ActionPhase> {
    private static long[] awm;
    public static final /* enum */ fi$ActionPhase WAIT_USE_HALF;
    public static final /* enum */ fi$ActionPhase WAIT_RESTORE;
    private static final /* synthetic */ fi$ActionPhase[] $VALUES;
    public static final boolean a;
    public static final /* enum */ fi$ActionPhase ANTI_WAIT_RESTORE;
    public static final int b;
    public static final boolean c;
    private static long[] awn;
    public static final /* enum */ fi$ActionPhase ANTI_WAIT_RELEASE;
    private static final long i = 7369665902653918048L;
    public static final /* enum */ fi$ActionPhase WAIT_RESTORE_STOP;
    private static int[] aws;
    public static final /* enum */ fi$ActionPhase ANTI_WAIT_PRESS;
    private static int[] awr;
    public static final /* enum */ fi$ActionPhase WAIT_USE_STOP;
    public static final /* enum */ fi$ActionPhase IDLE;
    public static final /* enum */ fi$ActionPhase ANTI_WAIT_STOP;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static fi$ActionPhase valueOf(String var0) {
        v0 /* !! */  = fi$ActionPhase.i;
        if (true) ** GOTO lbl5
        block22: while (true) {
            v0 /* !! */  = (long)(v1 - fi$ActionPhase.awo("axm", awl(int ), (int)12));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -2109454951: {
                    v1 = fi$ActionPhase.awo("axn", awl(int ), (int)13);
                    continue block22;
                }
                case -1593914528: {
                    break block22;
                }
                case -27719569: {
                    v1 = fi$ActionPhase.awo("axo", awl(int ), (int)14);
                    continue block22;
                }
                case 65733360: {
                    v1 = fi$ActionPhase.awo("axp", awl(int ), (int)15);
                    continue block22;
                }
            }
            break;
        }
        var3_1 = fi$ActionPhase.c;
        v2 /* !! */  = fi$ActionPhase.i;
        if (true) ** GOTO lbl22
        block23: while (true) {
            v2 /* !! */  = (long)(v3 - fi$ActionPhase.awo("axq", awl(int ), (int)16));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1691867815: {
                    v3 = fi$ActionPhase.awo("axr", awl(int ), (int)17);
                    continue block23;
                }
                case -1593914528: {
                    break block23;
                }
                case 1954124666: {
                    v3 = fi$ActionPhase.awo("axs", awl(int ), (int)18);
                    continue block23;
                }
            }
            break;
        }
        var2_2 /* !! */  = fi$ActionPhase.b;
        v4 /* !! */  = fi$ActionPhase.i;
        if (true) ** GOTO lbl36
        block24: while (true) {
            v4 /* !! */  = (long)(v5 - fi$ActionPhase.awo("axt", awl(int ), (int)19));
lbl36:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1870143358: {
                    v5 = fi$ActionPhase.awo("axu", awl(int ), (int)20);
                    continue block24;
                }
                case -1593914528: {
                    break block24;
                }
                case 992798617: {
                    v5 = fi$ActionPhase.awo("axv", awl(int ), (int)21);
                    continue block24;
                }
            }
            break;
        }
        var1_3 = fi$ActionPhase.a;
        if (!var3_1) ** GOTO lbl52
        throw null;
        {
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var2_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return null;
                }
lbl52:
                // 1 sources

                if (var1_3 || var1_3) continue block25;
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_0 = fi$ActionPhase.i - fi$ActionPhase.awo("axw", awl(int ), (int)22)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v6 /* !! */  == fi$ActionPhase.awo("axx", awq(int ), (int)8)) break;
                    v6 /* !! */  = (long)fi$ActionPhase.awo("axy", awq(int ), (int)9);
                }
                return Enum.valueOf(fi$ActionPhase.class, var0);
lbl60:
                // 2 sources

                case 0: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var2_2 /* !! */  = (int)fi$ActionPhase.awo("axz", awq(int ), (int)10);
                        if (!var3_1) break block25;
                        throw null;
                    }
                }
                case 1: {
                    var2_2 /* !! */  = (int)fi$ActionPhase.awo("aya", awq(int ), (int)11);
                    if (!var3_1) ** GOTO lbl60
                    throw null;
                }
                case 2: {
                    do {
                        var2_2 /* !! */  = (int)fi$ActionPhase.awo("ayb", awq(int ), (int)12);
                    } while (!var3_1);
                    throw null;
                }
                case 3: 
            }
        }
        var2_2 /* !! */  = (int)fi$ActionPhase.awo("ayc", awq(int ), (int)13);
        ** while (!var3_1)
lbl77:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void bjt() {
        fi$ActionPhase.aws[0] = -279210158;
        fi$ActionPhase.aws[1] = 1667478064;
        fi$ActionPhase.aws[2] = 863907988;
        fi$ActionPhase.aws[3] = 523881210;
        fi$ActionPhase.aws[4] = -2076032589;
        fi$ActionPhase.aws[5] = -2006885358;
        fi$ActionPhase.aws[6] = -998083352;
        fi$ActionPhase.aws[7] = 536032056;
        fi$ActionPhase.aws[8] = -1247608023;
        fi$ActionPhase.aws[9] = -751644774;
        fi$ActionPhase.aws[10] = -1983717340;
        fi$ActionPhase.aws[11] = 1218189124;
        fi$ActionPhase.aws[12] = 144818137;
        fi$ActionPhase.aws[13] = 935915137;
        fi$ActionPhase.aws[14] = 702000819;
        fi$ActionPhase.aws[15] = -99845192;
        fi$ActionPhase.aws[16] = 612933423;
        fi$ActionPhase.aws[17] = 2055833813;
        fi$ActionPhase.aws[18] = 1300270370;
        fi$ActionPhase.aws[19] = -1910453165;
        fi$ActionPhase.aws[20] = 1975628951;
        fi$ActionPhase.aws[21] = 1398372006;
        fi$ActionPhase.aws[22] = -1603766025;
        fi$ActionPhase.aws[23] = -403169140;
        fi$ActionPhase.aws[24] = 732427515;
        fi$ActionPhase.aws[25] = 1421604055;
        fi$ActionPhase.aws[26] = -744156471;
        fi$ActionPhase.aws[27] = -1334613;
        fi$ActionPhase.aws[28] = 72397972;
        fi$ActionPhase.aws[29] = 1807795476;
        fi$ActionPhase.aws[30] = -488418458;
        fi$ActionPhase.aws[31] = -569835031;
        fi$ActionPhase.aws[32] = 649983270;
        fi$ActionPhase.aws[33] = 756479138;
        fi$ActionPhase.aws[34] = -287492409;
        fi$ActionPhase.aws[35] = -1398506352;
        fi$ActionPhase.aws[36] = 235052921;
        fi$ActionPhase.aws[37] = -177614674;
        fi$ActionPhase.aws[38] = -587142719;
        fi$ActionPhase.aws[39] = -358768735;
        fi$ActionPhase.aws[40] = -1762587775;
        fi$ActionPhase.aws[41] = 1887329950;
        fi$ActionPhase.aws[42] = -169132032;
        fi$ActionPhase.aws[43] = -390654949;
        fi$ActionPhase.aws[44] = -2134129011;
        fi$ActionPhase.aws[45] = 1071741335;
        fi$ActionPhase.aws[46] = -1310171221;
        fi$ActionPhase.aws[47] = -524122700;
        fi$ActionPhase.aws[48] = 823153410;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private fi$ActionPhase() {
        var4_3 /* !! */  = fi$ActionPhase.b;
        var3_4 = fi$ActionPhase.a;
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                super(var1_1, var2_2);
                return;
            }
            case 0: {
                while (true) {
                    var4_3 /* !! */  = (int)fi$ActionPhase.awo("ayd", awq(int ), (int)14);
                }
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_3 /* !! */  = (int)fi$ActionPhase.awo("aye", awq(int ), (int)15);
                    break;
                }
            }
            case 2: 
        }
        var4_3 /* !! */  = (int)fi$ActionPhase.awo("ayf", awq(int ), (int)16);
        ** while (true)
    }

    private static /* synthetic */ void bjv() {
        fi$ActionPhase.awm[0] = -1692575730677667143L;
        fi$ActionPhase.awm[1] = -4340363820576976080L;
        fi$ActionPhase.awm[2] = 222027197571369046L;
        fi$ActionPhase.awm[3] = 2519364314464031722L;
        fi$ActionPhase.awm[4] = -725371793349819892L;
        fi$ActionPhase.awm[5] = -1400552866160862524L;
        fi$ActionPhase.awm[6] = -7784511900491867278L;
        fi$ActionPhase.awm[7] = 4496698287719061785L;
        fi$ActionPhase.awm[8] = -7665802590677687143L;
        fi$ActionPhase.awm[9] = 6372828172643000177L;
        fi$ActionPhase.awm[10] = 8217858681454284975L;
        fi$ActionPhase.awm[11] = -7679738563272170077L;
        fi$ActionPhase.awm[12] = -2754692511252300428L;
        fi$ActionPhase.awm[13] = -7935402125317024439L;
        fi$ActionPhase.awm[14] = -6900719661853070464L;
        fi$ActionPhase.awm[15] = -560078180531944492L;
        fi$ActionPhase.awm[16] = -759579681766508722L;
        fi$ActionPhase.awm[17] = -4948091577241637285L;
        fi$ActionPhase.awm[18] = -3878623669871754056L;
        fi$ActionPhase.awm[19] = -5567956266701224678L;
        fi$ActionPhase.awm[20] = 191135353674124018L;
        fi$ActionPhase.awm[21] = -3340923993343611290L;
        fi$ActionPhase.awm[22] = -3128349001417840205L;
        fi$ActionPhase.awm[23] = -2789094596179639122L;
        fi$ActionPhase.awm[24] = 1697938424842999068L;
        fi$ActionPhase.awm[25] = -5703545593523605187L;
        fi$ActionPhase.awm[26] = 7650493124458753367L;
        fi$ActionPhase.awm[27] = -5634594195869939627L;
        fi$ActionPhase.awm[28] = 1410676139640944292L;
        fi$ActionPhase.awm[29] = -1259396903671963341L;
        fi$ActionPhase.awm[30] = 3308266453349125817L;
        fi$ActionPhase.awm[31] = -1567781453056996073L;
        fi$ActionPhase.awm[32] = 3597206345048078240L;
        fi$ActionPhase.awm[33] = -538361195014487133L;
        fi$ActionPhase.awm[34] = 6695062643800700567L;
        fi$ActionPhase.awm[35] = 3110607991257264808L;
        fi$ActionPhase.awm[36] = -1541819239087702736L;
        fi$ActionPhase.awm[37] = 8377639282986300923L;
        fi$ActionPhase.awm[38] = -1771185350893370503L;
        fi$ActionPhase.awm[39] = 5832512558585618818L;
        fi$ActionPhase.awm[40] = -4228796303026867459L;
        fi$ActionPhase.awm[41] = 7998745322484193195L;
        fi$ActionPhase.awm[42] = 1521018755272398446L;
        fi$ActionPhase.awm[43] = -4994662929157914268L;
        fi$ActionPhase.awm[44] = -7618095814839472320L;
        fi$ActionPhase.awm[45] = -2538159584502786549L;
        fi$ActionPhase.awm[46] = -4534759340396762973L;
        fi$ActionPhase.awm[47] = -2091498885014446240L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ fi$ActionPhase[] $values() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = fi$ActionPhase.i - fi$ActionPhase.awo("ayg", awl(int ), (int)23)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == fi$ActionPhase.awo("ayh", awq(int ), (int)17)) break;
            v0 /* !! */  = (long)fi$ActionPhase.awo("ayi", awq(int ), (int)18);
        }
        var2 = fi$ActionPhase.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = fi$ActionPhase.i - fi$ActionPhase.awo("ayj", awl(int ), (int)24)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == fi$ActionPhase.awo("ayk", awq(int ), (int)19)) break;
            v1 /* !! */  = (long)fi$ActionPhase.awo("ayl", awq(int ), (int)20);
        }
        var1_1 /* !! */  = fi$ActionPhase.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = fi$ActionPhase.i - fi$ActionPhase.awo("aym", awl(int ), (int)25)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == fi$ActionPhase.awo("ayn", awq(int ), (int)21)) break;
            v2 /* !! */  = (long)fi$ActionPhase.awo("ayo", awq(int ), (int)22);
        }
        var0_2 = fi$ActionPhase.a;
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2) {
                    throw null;
                    return null;
                }
                if (var0_2 || var0_2) ** continue;
                v3 = new fi$ActionPhase[9];
                v4 = fi$ActionPhase.awo("ayp", awq(int ), (int)23);
                while (true) {
                    if ((v5 = (cfr_temp_3 = fi$ActionPhase.i - fi$ActionPhase.awo("ayq", awl(int ), (int)26)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 == fi$ActionPhase.awo("ayr", awq(int ), (int)24)) break;
                    v5 = 140551668;
                }
                v3[v4] = fi$ActionPhase.IDLE;
                v6 = fi$ActionPhase.awo("ays", awq(int ), (int)25);
                while (true) {
                    if ((v7 = (cfr_temp_4 = fi$ActionPhase.i - fi$ActionPhase.awo("ayt", awl(int ), (int)27)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v7 == fi$ActionPhase.awo("ayu", awq(int ), (int)26)) break;
                    v7 = -1697010798;
                }
                v3[v6] = fi$ActionPhase.WAIT_USE_HALF;
                v8 = fi$ActionPhase.awo("ayv", awq(int ), (int)27);
                v9 /* !! */  = fi$ActionPhase.i;
                if (true) ** GOTO lbl52
                block40: while (true) {
                    v9 /* !! */  = (long)(v10 - fi$ActionPhase.awo("ayw", awl(int ), (int)28));
lbl52:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -1627790311: {
                            v10 = fi$ActionPhase.awo("ayx", awl(int ), (int)29);
                            continue block40;
                        }
                        case -1593914528: {
                            break block40;
                        }
                        case -849606472: {
                            v10 = fi$ActionPhase.awo("ayy", awl(int ), (int)30);
                            continue block40;
                        }
                        case -726990139: {
                            v10 = fi$ActionPhase.awo("ayz", awl(int ), (int)31);
                            continue block40;
                        }
                    }
                    break;
                }
                v3[v8] = fi$ActionPhase.WAIT_USE_STOP;
                v11 = fi$ActionPhase.awo("aza", awq(int ), (int)28);
                v12 /* !! */  = fi$ActionPhase.i;
                if (true) ** GOTO lbl70
                block41: while (true) {
                    v12 /* !! */  = (long)(fi$ActionPhase.awo("azc", awl(int ), (int)33) - fi$ActionPhase.awo("azb", awl(int ), (int)32));
lbl70:
                    // 2 sources

                    switch ((int)v12 /* !! */ ) {
                        case -1593914528: {
                            break block41;
                        }
                        case -393864446: {
                            continue block41;
                        }
                    }
                    break;
                }
                v3[v11] = fi$ActionPhase.WAIT_RESTORE;
                v13 = fi$ActionPhase.awo("azd", awq(int ), (int)29);
                while (true) {
                    if ((v14 = (cfr_temp_5 = fi$ActionPhase.i - fi$ActionPhase.awo("aze", awl(int ), (int)34)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v14 == fi$ActionPhase.awo("azf", awq(int ), (int)30)) break;
                    v14 = -2145625893;
                }
                v3[v13] = fi$ActionPhase.WAIT_RESTORE_STOP;
                v15 = fi$ActionPhase.awo("azg", awq(int ), (int)31);
                v16 /* !! */  = fi$ActionPhase.i;
                if (true) ** GOTO lbl89
                block43: while (true) {
                    v16 /* !! */  = (long)(v17 - fi$ActionPhase.awo("azh", awl(int ), (int)35));
lbl89:
                    // 2 sources

                    switch ((int)v16 /* !! */ ) {
                        case -1593914528: {
                            break block43;
                        }
                        case -988122893: {
                            v17 = fi$ActionPhase.awo("azi", awl(int ), (int)36);
                            continue block43;
                        }
                        case -862838512: {
                            v17 = fi$ActionPhase.awo("azj", awl(int ), (int)37);
                            continue block43;
                        }
                        case 1300329683: {
                            v17 = fi$ActionPhase.awo("azk", awl(int ), (int)38);
                            continue block43;
                        }
                    }
                    break;
                }
                v3[v15] = fi$ActionPhase.ANTI_WAIT_STOP;
                v18 = fi$ActionPhase.awo("azl", awq(int ), (int)32);
                v19 /* !! */  = fi$ActionPhase.i;
                if (true) ** GOTO lbl107
                block44: while (true) {
                    v19 /* !! */  = (long)(v20 - fi$ActionPhase.awo("azm", awl(int ), (int)39));
lbl107:
                    // 2 sources

                    switch ((int)v19 /* !! */ ) {
                        case -1719894854: {
                            v20 = fi$ActionPhase.awo("azn", awl(int ), (int)40);
                            continue block44;
                        }
                        case -1593914528: {
                            break block44;
                        }
                        case -820366822: {
                            v20 = fi$ActionPhase.awo("azo", awl(int ), (int)41);
                            continue block44;
                        }
                        case -120358646: {
                            v20 = fi$ActionPhase.awo("azp", awl(int ), (int)42);
                            continue block44;
                        }
                    }
                    break;
                }
                v3[v18] = fi$ActionPhase.ANTI_WAIT_PRESS;
                v21 = fi$ActionPhase.awo("azq", awq(int ), (int)33);
                while (true) {
                    if ((v22 = (cfr_temp_6 = fi$ActionPhase.i - fi$ActionPhase.awo("azr", awl(int ), (int)43)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v22 == fi$ActionPhase.awo("azs", awq(int ), (int)34)) break;
                    v22 = -1296892028;
                }
                v3[v21] = fi$ActionPhase.ANTI_WAIT_RELEASE;
                v23 = fi$ActionPhase.awo("azt", awq(int ), (int)35);
                v24 /* !! */  = fi$ActionPhase.i;
                if (true) ** GOTO lbl133
                block46: while (true) {
                    v24 /* !! */  = (long)(v25 - fi$ActionPhase.awo("azu", awl(int ), (int)44));
lbl133:
                    // 2 sources

                    switch ((int)v24 /* !! */ ) {
                        case -1751455744: {
                            v25 = fi$ActionPhase.awo("azv", awl(int ), (int)45);
                            continue block46;
                        }
                        case -1593914528: {
                            break block46;
                        }
                        case -1423438990: {
                            v25 = fi$ActionPhase.awo("azw", awl(int ), (int)46);
                            continue block46;
                        }
                        case 1576606972: {
                            v25 = fi$ActionPhase.awo("azx", awl(int ), (int)47);
                            continue block46;
                        }
                    }
                    break;
                }
                v3[v23] = fi$ActionPhase.ANTI_WAIT_RESTORE;
                return v3;
            }
lbl147:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var1_1 /* !! */  = (int)fi$ActionPhase.awo("azy", awq(int ), (int)36);
                    if (!var2) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 1: {
                var1_1 /* !! */  = (int)fi$ActionPhase.awo("bih", awq(int ), (int)37);
                if (!var2) ** GOTO lbl147
                throw null;
            }
            case 2: {
                var1_1 /* !! */  = (int)fi$ActionPhase.awo("bij", awq(int ), (int)38);
                if (!var2) break;
                throw null;
            }
            case 3: 
        }
        var1_1 /* !! */  = (int)fi$ActionPhase.awo("bim", awq(int ), (int)39);
        ** while (!var2)
lbl163:
        // 1 sources

        throw null;
    }

    public static /* synthetic */ CallSite awo(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void bjp() {
        fi$ActionPhase.awr[0] = -279210157;
        fi$ActionPhase.awr[1] = 407297339;
        fi$ActionPhase.awr[2] = 863907989;
        fi$ActionPhase.awr[3] = -513692710;
        fi$ActionPhase.awr[4] = -2076032589;
        fi$ActionPhase.awr[5] = -2006885359;
        fi$ActionPhase.awr[6] = -998083351;
        fi$ActionPhase.awr[7] = 536032059;
        fi$ActionPhase.awr[8] = -1247608024;
        fi$ActionPhase.awr[9] = 1296445048;
        fi$ActionPhase.awr[10] = -1983717338;
        fi$ActionPhase.awr[11] = 1218189126;
        fi$ActionPhase.awr[12] = 144818139;
        fi$ActionPhase.awr[13] = 935915136;
        fi$ActionPhase.awr[14] = 702000819;
        fi$ActionPhase.awr[15] = -99845192;
        fi$ActionPhase.awr[16] = 612933422;
        fi$ActionPhase.awr[17] = -2055833814;
        fi$ActionPhase.awr[18] = -1509584061;
        fi$ActionPhase.awr[19] = -1910453166;
        fi$ActionPhase.awr[20] = 1986105598;
        fi$ActionPhase.awr[21] = 1398372007;
        fi$ActionPhase.awr[22] = 567783032;
        fi$ActionPhase.awr[23] = -403169140;
        fi$ActionPhase.awr[24] = -732427516;
        fi$ActionPhase.awr[25] = 1421604054;
        fi$ActionPhase.awr[26] = -744156472;
        fi$ActionPhase.awr[27] = -1334615;
        fi$ActionPhase.awr[28] = 72397975;
        fi$ActionPhase.awr[29] = 1807795472;
        fi$ActionPhase.awr[30] = -488418457;
        fi$ActionPhase.awr[31] = -569835028;
        fi$ActionPhase.awr[32] = 649983264;
        fi$ActionPhase.awr[33] = 756479141;
        fi$ActionPhase.awr[34] = -287492410;
        fi$ActionPhase.awr[35] = -1398506344;
        fi$ActionPhase.awr[36] = 235052923;
        fi$ActionPhase.awr[37] = -177614673;
        fi$ActionPhase.awr[38] = -587142717;
        fi$ActionPhase.awr[39] = -358768736;
        fi$ActionPhase.awr[40] = -1762587775;
        fi$ActionPhase.awr[41] = 1887329951;
        fi$ActionPhase.awr[42] = -169132030;
        fi$ActionPhase.awr[43] = -390654952;
        fi$ActionPhase.awr[44] = -2134129015;
        fi$ActionPhase.awr[45] = 1071741330;
        fi$ActionPhase.awr[46] = -1310171219;
        fi$ActionPhase.awr[47] = -524122701;
        fi$ActionPhase.awr[48] = 823153418;
    }

    private static /* synthetic */ int awq(int n2) {
        return awr[n2] ^ aws[n2];
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static fi$ActionPhase[] values() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = fi$ActionPhase.i - fi$ActionPhase.awo("awp", awl(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == fi$ActionPhase.awo("awt", awq(int ), (int)0)) break;
            v0 /* !! */  = (long)fi$ActionPhase.awo("awu", awq(int ), (int)1);
        }
        var2 = fi$ActionPhase.c;
        v1 /* !! */  = fi$ActionPhase.i;
        block23: while (true) {
            switch ((int)v1 /* !! */ ) {
                case -1593914528: {
                    break block23;
                }
                case -497337514: {
                    v1 /* !! */  = (long)(fi$ActionPhase.awo("aww", awl(int ), (int)2) - fi$ActionPhase.awo("awv", awl(int ), (int)1));
                    continue block23;
                }
            }
            break;
        }
        var1_1 /* !! */  = fi$ActionPhase.b;
        v2 /* !! */  = fi$ActionPhase.i;
        if (true) ** GOTO lbl20
        block24: while (true) {
            v2 /* !! */  = (long)(v3 - fi$ActionPhase.awo("awx", awl(int ), (int)3));
lbl20:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1751718892: {
                    v3 = fi$ActionPhase.awo("awy", awl(int ), (int)4);
                    continue block24;
                }
                case -1617018187: {
                    v3 = fi$ActionPhase.awo("awz", awl(int ), (int)5);
                    continue block24;
                }
                case -1593914528: {
                    break block24;
                }
                case -508965601: {
                    v3 = fi$ActionPhase.awo("axa", awl(int ), (int)6);
                    continue block24;
                }
            }
            break;
        }
        var0_2 = fi$ActionPhase.a;
        if (var2) {
            throw null;
        }
        if (var0_2 != false) return null;
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var0_2 != false) return null;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_1 = fi$ActionPhase.i - fi$ActionPhase.awo("axb", awl(int ), (int)7)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  != fi$ActionPhase.awo("axc", awq(int ), (int)2)) ** GOTO lbl45
                    v5 /* !! */  = fi$ActionPhase.i;
                    if (true) ** GOTO lbl67
lbl45:
                    // 1 sources

                    v4 /* !! */  = (long)fi$ActionPhase.awo("axd", awq(int ), (int)3);
                }
            }
            case 1: {
                ** GOTO lbl53
            }
            case 3: {
                var1_1 /* !! */  = (int)fi$ActionPhase.awo("axl", awq(int ), (int)7);
                if (var2) {
                    throw null;
                }
lbl53:
                // 3 sources

                var1_1 /* !! */  = (int)fi$ActionPhase.awo("axj", awq(int ), (int)5);
                if (var2) {
                    throw null;
                }
            }
            case 2: {
                var1_1 /* !! */  = (int)fi$ActionPhase.awo("axk", awq(int ), (int)6);
                if (var2) {
                    throw null;
                }
            }
            case 0: 
        }
        do {
            var1_1 /* !! */  = (int)fi$ActionPhase.awo("axi", awq(int ), (int)4);
        } while (!var2);
        throw null;
        block27: while (true) {
            v5 /* !! */  = (long)(v6 - fi$ActionPhase.awo("axe", awl(int ), (int)8));
lbl67:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -1593914528: {
                    return (fi$ActionPhase[])fi$ActionPhase.$VALUES.clone();
                }
                case -102802154: {
                    v6 = fi$ActionPhase.awo("axf", awl(int ), (int)9);
                    continue block27;
                }
                case 152363173: {
                    v6 = fi$ActionPhase.awo("axg", awl(int ), (int)10);
                    continue block27;
                }
                case 2035275274: {
                    v6 = fi$ActionPhase.awo("axh", awl(int ), (int)11);
                    continue block27;
                }
            }
            break;
        }
        return (fi$ActionPhase[])fi$ActionPhase.$VALUES.clone();
    }

    private static /* synthetic */ long awl(int n2) {
        return awm[n2] ^ awn[n2];
    }

    private static /* synthetic */ void bjy() {
        fi$ActionPhase.awn[0] = 3643431615887894331L;
        fi$ActionPhase.awn[1] = 5353662030852154519L;
        fi$ActionPhase.awn[2] = 5374584698938471386L;
        fi$ActionPhase.awn[3] = 2425513536188362479L;
        fi$ActionPhase.awn[4] = 1343747943898087081L;
        fi$ActionPhase.awn[5] = 4102605692248818135L;
        fi$ActionPhase.awn[6] = -8253644477116695511L;
        fi$ActionPhase.awn[7] = 3849454842267954407L;
        fi$ActionPhase.awn[8] = -6656875157747079710L;
        fi$ActionPhase.awn[9] = 3657817425767339916L;
        fi$ActionPhase.awn[10] = -840200336051644134L;
        fi$ActionPhase.awn[11] = 7326810737430117673L;
        fi$ActionPhase.awn[12] = -7625951727457769883L;
        fi$ActionPhase.awn[13] = -7537410574771156289L;
        fi$ActionPhase.awn[14] = -6884016525225315099L;
        fi$ActionPhase.awn[15] = 193257359131967529L;
        fi$ActionPhase.awn[16] = 7265922098074237702L;
        fi$ActionPhase.awn[17] = 6948666140869879113L;
        fi$ActionPhase.awn[18] = -1049386676008466819L;
        fi$ActionPhase.awn[19] = 9096681643110213534L;
        fi$ActionPhase.awn[20] = -3742357256039220956L;
        fi$ActionPhase.awn[21] = -7027458480057157928L;
        fi$ActionPhase.awn[22] = 4410110956860603680L;
        fi$ActionPhase.awn[23] = -5697493999390154650L;
        fi$ActionPhase.awn[24] = 1592898631916990150L;
        fi$ActionPhase.awn[25] = 1010130171684841258L;
        fi$ActionPhase.awn[26] = 1885759667727376548L;
        fi$ActionPhase.awn[27] = 2456704661210187626L;
        fi$ActionPhase.awn[28] = 2320507754045514368L;
        fi$ActionPhase.awn[29] = -6889784760094214177L;
        fi$ActionPhase.awn[30] = -5691257531554613189L;
        fi$ActionPhase.awn[31] = 4528240364853371745L;
        fi$ActionPhase.awn[32] = 4505381262295257139L;
        fi$ActionPhase.awn[33] = 1676401719540041387L;
        fi$ActionPhase.awn[34] = -5059038187347585449L;
        fi$ActionPhase.awn[35] = -2159488271517953596L;
        fi$ActionPhase.awn[36] = 6211392855658733910L;
        fi$ActionPhase.awn[37] = -1920716727134843078L;
        fi$ActionPhase.awn[38] = 879646057833939029L;
        fi$ActionPhase.awn[39] = -3724715371937033636L;
        fi$ActionPhase.awn[40] = 4243446671485796251L;
        fi$ActionPhase.awn[41] = 8508071807762859606L;
        fi$ActionPhase.awn[42] = -4856148077382827956L;
        fi$ActionPhase.awn[43] = -5154006092999299705L;
        fi$ActionPhase.awn[44] = -1974555212502390757L;
        fi$ActionPhase.awn[45] = -1625564863905292863L;
        fi$ActionPhase.awn[46] = 5750515937974187434L;
        fi$ActionPhase.awn[47] = 8835183131904420081L;
    }

    static {
        awr = new int[49];
        aws = new int[49];
        fi$ActionPhase.bjp();
        fi$ActionPhase.bjt();
        awm = new long[48];
        awn = new long[48];
        fi$ActionPhase.bjv();
        fi$ActionPhase.bjy();
        IDLE = new fi$ActionPhase();
        WAIT_USE_HALF = new fi$ActionPhase();
        WAIT_USE_STOP = new fi$ActionPhase();
        WAIT_RESTORE = new fi$ActionPhase();
        WAIT_RESTORE_STOP = new fi$ActionPhase();
        ANTI_WAIT_STOP = new fi$ActionPhase();
        ANTI_WAIT_PRESS = new fi$ActionPhase();
        ANTI_WAIT_RELEASE = new fi$ActionPhase();
        ANTI_WAIT_RESTORE = new fi$ActionPhase();
        $VALUES = fi$ActionPhase.$values();
    }
}

