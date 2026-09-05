/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.runtime.ObjectMethods
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.runtime.ObjectMethods;

public record dm(String name, String message, int key) {
    public static final int b;
    private final String name;
    private final String message;
    private static long[] bwyv;
    private static int[] bwym;
    public static final boolean c;
    private static long[] bwyu;
    public static final boolean a;
    private static final long ep = -8864405319143229492L;
    private final int key;
    private static int[] bwyl;

    private static /* synthetic */ void bxcy() {
        dm.bwyv[0] = 6831840755511703995L;
        dm.bwyv[1] = 7057390489085017027L;
        dm.bwyv[2] = 3021501851351387883L;
        dm.bwyv[3] = -21921529481515370L;
        dm.bwyv[4] = 7610732577411059614L;
        dm.bwyv[5] = 7450741373474409796L;
        dm.bwyv[6] = -1095483294279971394L;
        dm.bwyv[7] = -4339905123310280953L;
        dm.bwyv[8] = -236305738737851058L;
        dm.bwyv[9] = -2827381985292812913L;
        dm.bwyv[10] = 4596854084475849813L;
        dm.bwyv[11] = 1339356099154498915L;
        dm.bwyv[12] = -1911110907236351651L;
        dm.bwyv[13] = -1072677009414073336L;
        dm.bwyv[14] = -6035296952152979730L;
        dm.bwyv[15] = -133012226009647546L;
        dm.bwyv[16] = 8537368145744122233L;
        dm.bwyv[17] = -7302914723773767097L;
        dm.bwyv[18] = 2889358962015405700L;
        dm.bwyv[19] = 3380533767037881884L;
        dm.bwyv[20] = -2587819967174180260L;
        dm.bwyv[21] = -1783107457321537374L;
        dm.bwyv[22] = -2931774645400161751L;
        dm.bwyv[23] = -4387524573596667185L;
        dm.bwyv[24] = -4277098583775383020L;
        dm.bwyv[25] = 7184415976816339089L;
        dm.bwyv[26] = -4333713051583686467L;
        dm.bwyv[27] = -735839885920258347L;
        dm.bwyv[28] = 1009165454995293494L;
        dm.bwyv[29] = 6188717346779413387L;
        dm.bwyv[30] = -8324628428164759653L;
        dm.bwyv[31] = -9185765412213453641L;
        dm.bwyv[32] = 9064934002347661303L;
        dm.bwyv[33] = 7531567833094794390L;
        dm.bwyv[34] = 2738038038567338747L;
        dm.bwyv[35] = 446656871048405227L;
        dm.bwyv[36] = -7769317005209322359L;
        dm.bwyv[37] = 4425338547509923516L;
        dm.bwyv[38] = 6137755091831993044L;
        dm.bwyv[39] = 3506929445147721992L;
        dm.bwyv[40] = -8877611565922741699L;
        dm.bwyv[41] = -3595313240954432837L;
        dm.bwyv[42] = 3510344054522245691L;
        dm.bwyv[43] = -4672874638539438115L;
        dm.bwyv[44] = -7265560759837199786L;
        dm.bwyv[45] = -5370557988476351303L;
        dm.bwyv[46] = 3864985820423569468L;
        dm.bwyv[47] = 5539976990317307199L;
        dm.bwyv[48] = 8988599046320413686L;
        dm.bwyv[49] = 6671471430259997266L;
    }

    private static /* synthetic */ void bxcv() {
        dm.bwyl[0] = -1650287277;
        dm.bwyl[1] = 1631318883;
        dm.bwyl[2] = -537247115;
        dm.bwyl[3] = -1436045563;
        dm.bwyl[4] = 1728778888;
        dm.bwyl[5] = -1007934812;
        dm.bwyl[6] = -959664461;
        dm.bwyl[7] = -143291432;
        dm.bwyl[8] = -1076280702;
        dm.bwyl[9] = -2139995944;
        dm.bwyl[10] = 845911551;
        dm.bwyl[11] = -429317910;
        dm.bwyl[12] = 1208308060;
        dm.bwyl[13] = 1046644548;
        dm.bwyl[14] = -1082511328;
        dm.bwyl[15] = 1057201188;
        dm.bwyl[16] = -1759821857;
        dm.bwyl[17] = 407317510;
        dm.bwyl[18] = -1294671429;
        dm.bwyl[19] = 27348510;
        dm.bwyl[20] = 1796778175;
        dm.bwyl[21] = -915377205;
        dm.bwyl[22] = 1427078363;
        dm.bwyl[23] = -1439848031;
        dm.bwyl[24] = -340925570;
        dm.bwyl[25] = 338592506;
        dm.bwyl[26] = 992809017;
        dm.bwyl[27] = -1460024196;
        dm.bwyl[28] = -1065611503;
        dm.bwyl[29] = 120922224;
        dm.bwyl[30] = -1668270062;
        dm.bwyl[31] = -2003372106;
        dm.bwyl[32] = -1604965378;
        dm.bwyl[33] = 1686236117;
        dm.bwyl[34] = 21661333;
        dm.bwyl[35] = 1950542616;
        dm.bwyl[36] = 1301908063;
        dm.bwyl[37] = 1598284070;
        dm.bwyl[38] = -1509325027;
        dm.bwyl[39] = 790368369;
        dm.bwyl[40] = -257797475;
        dm.bwyl[41] = 189520289;
        dm.bwyl[42] = 1495246678;
        dm.bwyl[43] = 2124049775;
        dm.bwyl[44] = -1357924933;
        dm.bwyl[45] = 158722488;
        dm.bwyl[46] = -1724083857;
        dm.bwyl[47] = 1881449371;
        dm.bwyl[48] = 2113556988;
        dm.bwyl[49] = 968663922;
        dm.bwyl[50] = -1863039220;
        dm.bwyl[51] = 1030564965;
        dm.bwyl[52] = 1029604231;
        dm.bwyl[53] = -1437782715;
        dm.bwyl[54] = -959525736;
        dm.bwyl[55] = -590891163;
        dm.bwyl[56] = 325495032;
    }

    private static /* synthetic */ void bxcx() {
        dm.bwyu[0] = 7626582403196904700L;
        dm.bwyu[1] = -894697545206857943L;
        dm.bwyu[2] = 7808284185659122164L;
        dm.bwyu[3] = 7097196858617595885L;
        dm.bwyu[4] = -45955646338866399L;
        dm.bwyu[5] = 5895223991071293958L;
        dm.bwyu[6] = -3281852746558570949L;
        dm.bwyu[7] = -4807881838466189205L;
        dm.bwyu[8] = -3832327832378255635L;
        dm.bwyu[9] = -1324599081895053552L;
        dm.bwyu[10] = -6847891012396238360L;
        dm.bwyu[11] = -1656851533714563432L;
        dm.bwyu[12] = 6873169023843029455L;
        dm.bwyu[13] = -4069548317555708663L;
        dm.bwyu[14] = -9138374080747151332L;
        dm.bwyu[15] = 1290688498136558739L;
        dm.bwyu[16] = 208068581701801057L;
        dm.bwyu[17] = -5193828930251287450L;
        dm.bwyu[18] = -8314859686446128744L;
        dm.bwyu[19] = 6961871559618633182L;
        dm.bwyu[20] = 2591677354997997549L;
        dm.bwyu[21] = -5468739165807058991L;
        dm.bwyu[22] = 667216516350138557L;
        dm.bwyu[23] = -3632524616683561457L;
        dm.bwyu[24] = 5640705569594931486L;
        dm.bwyu[25] = 2462655664581300905L;
        dm.bwyu[26] = 2213655291471295413L;
        dm.bwyu[27] = -6353954764787880218L;
        dm.bwyu[28] = 4188282497165055877L;
        dm.bwyu[29] = 7516388374723555980L;
        dm.bwyu[30] = 1173359375339828637L;
        dm.bwyu[31] = -7136198325444998542L;
        dm.bwyu[32] = -756488424170805316L;
        dm.bwyu[33] = -4069522539912900513L;
        dm.bwyu[34] = -5724234706445633936L;
        dm.bwyu[35] = 7766751301833481920L;
        dm.bwyu[36] = -4634755455766308132L;
        dm.bwyu[37] = -1555519966934018763L;
        dm.bwyu[38] = -5145625165731156277L;
        dm.bwyu[39] = 134475717251814997L;
        dm.bwyu[40] = -1012384538741373964L;
        dm.bwyu[41] = 5880836171708372012L;
        dm.bwyu[42] = -6026713190327866075L;
        dm.bwyu[43] = 6304795940216328215L;
        dm.bwyu[44] = 4667095060470868301L;
        dm.bwyu[45] = 1415108738874939260L;
        dm.bwyu[46] = -8663681656215382625L;
        dm.bwyu[47] = 368190576569311413L;
        dm.bwyu[48] = 1602245976415708397L;
        dm.bwyu[49] = 4542190190895696963L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final boolean equals(Object var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = dm.ep - dm.bwyo("bxaf", bwyt(int ), (int)20)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == dm.bwyo("bxag", bwyk(int ), (int)19)) break;
            v0 /* !! */  = (long)dm.bwyo("bxah", bwyk(int ), (int)20);
        }
        var4_2 = dm.c;
        v1 /* !! */  = dm.ep;
        if (true) ** GOTO lbl12
        block18: while (true) {
            v1 /* !! */  = (long)(v2 - dm.bwyo("bxai", bwyt(int ), (int)21));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1969903175: {
                    v2 = dm.bwyo("bxaj", bwyt(int ), (int)22);
                    continue block18;
                }
                case -278759476: {
                    break block18;
                }
                case 638907861: {
                    v2 = dm.bwyo("bxak", bwyt(int ), (int)23);
                    continue block18;
                }
            }
            break;
        }
        var3_3 /* !! */  = dm.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = dm.ep - dm.bwyo("bxal", bwyt(int ), (int)24)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == dm.bwyo("bxam", bwyk(int ), (int)21)) break;
            v3 /* !! */  = (long)dm.bwyo("bxan", bwyk(int ), (int)22);
        }
        var2_4 = dm.a;
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_2) {
                    throw null;
                    return (boolean)dm.bwyo("bxao", bwyk(int ), (int)23);
                }
                if (var2_4 || var2_4) ** continue;
                v4 /* !! */  = dm.ep;
                if (true) ** GOTO lbl41
                block21: while (true) {
                    v4 /* !! */  = (long)(v5 - dm.bwyo("bxap", bwyt(int ), (int)25));
lbl41:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -278759476: {
                            break block21;
                        }
                        case 268643544: {
                            v5 = dm.bwyo("bxaq", bwyt(int ), (int)26);
                            continue block21;
                        }
                        case 363349446: {
                            v5 = dm.bwyo("bxar", bwyt(int ), (int)27);
                            continue block21;
                        }
                        case 1346505267: {
                            v5 = dm.bwyo("bxas", bwyt(int ), (int)28);
                            continue block21;
                        }
                    }
                    break;
                }
                return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dm.class, "name;message;key", "name", "message", "key"}, this, var1_1);
            }
            case 0: {
                var3_3 /* !! */  = (int)dm.bwyo("bxat", bwyk(int ), (int)24);
                if (!var4_2) break;
                throw null;
            }
lbl58:
            // 2 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var3_3 /* !! */  = (int)dm.bwyo("bxau", bwyk(int ), (int)25);
                    if (!var4_2) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 2: {
                var3_3 /* !! */  = (int)dm.bwyo("bxav", bwyk(int ), (int)26);
                if (!var4_2) ** GOTO lbl58
                throw null;
            }
            case 3: 
        }
        var3_3 /* !! */  = (int)dm.bwyo("bxaw", bwyk(int ), (int)27);
        ** while (!var4_2)
lbl70:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final String toString() {
        v0 /* !! */  = dm.ep;
        if (true) ** GOTO lbl5
        block16: while (true) {
            v0 /* !! */  = (long)(v1 - dm.bwyo("bwyw", bwyt(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -278759476: {
                    break block16;
                }
                case 1159999144: {
                    v1 = dm.bwyo("bwyx", bwyt(int ), (int)1);
                    continue block16;
                }
                case 1667164242: {
                    v1 = dm.bwyo("bwyy", bwyt(int ), (int)2);
                    continue block16;
                }
                case 1771861492: {
                    v1 = dm.bwyo("bwyz", bwyt(int ), (int)3);
                    continue block16;
                }
            }
            break;
        }
        var3_1 = dm.c;
        v2 /* !! */  = dm.ep;
        if (true) ** GOTO lbl22
        block17: while (true) {
            v2 /* !! */  = (long)(dm.bwyo("bwzb", bwyt(int ), (int)5) - dm.bwyo("bwza", bwyt(int ), (int)4));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1312987251: {
                    continue block17;
                }
                case -278759476: {
                    break block17;
                }
            }
            break;
        }
        var2_2 /* !! */  = dm.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_0 = dm.ep - dm.bwyo("bwzc", bwyt(int ), (int)6)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == dm.bwyo("bwzd", bwyk(int ), (int)4)) break;
            v3 /* !! */  = (long)dm.bwyo("bwze", bwyk(int ), (int)5);
        }
        var1_3 = dm.a;
        if (var3_1) {
            throw null;
lbl37:
            // 1 sources

            return null;
        }
        ** while (var1_3 || var1_3)
lbl40:
        // 1 sources

        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block10 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_1 = dm.ep - dm.bwyo("bwzf", bwyt(int ), (int)7)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == dm.bwyo("bwzg", bwyk(int ), (int)6)) break;
                    v4 /* !! */  = (long)dm.bwyo("bwzh", bwyk(int ), (int)7);
                }
                return ObjectMethods.bootstrap("toString", new MethodHandle[]{dm.class, "name;message;key", "name", "message", "key"}, this);
            }
lbl50:
            // 2 sources

            case 0: {
                do {
                    var2_2 /* !! */  = (int)dm.bwyo("bwzi", bwyk(int ), (int)8);
                } while (!var3_1);
                throw null;
            }
            case 1: {
                var2_2 /* !! */  = (int)dm.bwyo("bwzj", bwyk(int ), (int)9);
                if (!var3_1) ** GOTO lbl50
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)dm.bwyo("bwzk", bwyk(int ), (int)10);
                    if (!var3_1) break block10;
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)dm.bwyo("bwzl", bwyk(int ), (int)11);
        ** while (!var3_1)
lbl67:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ long bwyt(int n2) {
        return bwyu[n2] ^ bwyv[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public String message() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = dm.ep - dm.bwyo("bxbn", bwyt(int ), (int)35)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == dm.bwyo("bxbo", bwyk(int ), (int)38)) break;
            v0 /* !! */  = (long)dm.bwyo("bxbp", bwyk(int ), (int)39);
        }
        var3_1 = dm.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = dm.ep - dm.bwyo("bxbq", bwyt(int ), (int)36)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == dm.bwyo("bxbr", bwyk(int ), (int)40)) break;
            v1 /* !! */  = (long)dm.bwyo("bxbs", bwyk(int ), (int)41);
        }
        var2_2 /* !! */  = dm.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = dm.ep - dm.bwyo("bxbt", bwyt(int ), (int)37)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == dm.bwyo("bxbu", bwyk(int ), (int)42)) break;
            v2 /* !! */  = (long)dm.bwyo("bxbv", bwyk(int ), (int)43);
        }
        var1_3 = dm.a;
        if (!var3_1) ** GOTO lbl28
        throw null;
        {
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var2_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return null;
                }
lbl28:
                // 1 sources

                if (var1_3 || var1_3) continue block13;
                v3 /* !! */  = dm.ep;
                if (true) ** GOTO lbl33
                block14: while (true) {
                    v3 /* !! */  = (long)(dm.bwyo("bxbx", bwyt(int ), (int)39) - dm.bwyo("bxbw", bwyt(int ), (int)38));
lbl33:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -278759476: {
                            break block14;
                        }
                        case 483414013: {
                            continue block14;
                        }
                    }
                    break;
                }
                return this.message;
                case 0: {
                    var2_2 /* !! */  = (int)dm.bwyo("bxby", bwyk(int ), (int)44);
                    if (!var3_1) break block13;
                    throw null;
                }
lbl43:
                // 2 sources

                case 1: {
                    var2_2 /* !! */  = (int)dm.bwyo("bxbz", bwyk(int ), (int)45);
                    if (!var3_1) break block13;
                    throw null;
                }
                case 2: {
                    var2_2 /* !! */  = (int)dm.bwyo("bxca", bwyk(int ), (int)46);
                    if (!var3_1) ** GOTO lbl43
                    throw null;
                }
                case 3: 
            }
        }
        do {
            var2_2 /* !! */  = (int)dm.bwyo("bxcb", bwyk(int ), (int)47);
        } while (!var3_1);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public int key() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = dm.ep - dm.bwyo("bxcc", bwyt(int ), (int)40)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == dm.bwyo("bxcd", bwyk(int ), (int)48)) break;
            v0 /* !! */  = (long)dm.bwyo("bxce", bwyk(int ), (int)49);
        }
        var3_1 = dm.c;
        v1 /* !! */  = dm.ep;
        if (true) ** GOTO lbl12
        block19: while (true) {
            v1 /* !! */  = (long)(v2 - dm.bwyo("bxcf", bwyt(int ), (int)41));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1738247656: {
                    v2 = dm.bwyo("bxcg", bwyt(int ), (int)42);
                    continue block19;
                }
                case -278759476: {
                    break block19;
                }
                case -110221038: {
                    v2 = dm.bwyo("bxch", bwyt(int ), (int)43);
                    continue block19;
                }
                case 992588997: {
                    v2 = dm.bwyo("bxci", bwyt(int ), (int)44);
                    continue block19;
                }
            }
            break;
        }
        var2_2 /* !! */  = dm.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = dm.ep - dm.bwyo("bxcj", bwyt(int ), (int)45)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == dm.bwyo("bxck", bwyk(int ), (int)50)) break;
            v3 /* !! */  = (long)dm.bwyo("bxcl", bwyk(int ), (int)51);
        }
        var1_3 = dm.a;
        if (var3_1) {
            throw null;
lbl34:
            // 2 sources

            return (int)dm.bwyo("bxcm", bwyk(int ), (int)52);
        }
        if (var1_3) ** GOTO lbl34
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                v4 /* !! */  = dm.ep;
                if (true) ** GOTO lbl45
                block22: while (true) {
                    v4 /* !! */  = (long)(v5 - dm.bwyo("bxcn", bwyt(int ), (int)46));
lbl45:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1737095607: {
                            v5 = dm.bwyo("bxco", bwyt(int ), (int)47);
                            continue block22;
                        }
                        case -712743754: {
                            v5 = dm.bwyo("bxcp", bwyt(int ), (int)48);
                            continue block22;
                        }
                        case -438344564: {
                            v5 = dm.bwyo("bxcq", bwyt(int ), (int)49);
                            continue block22;
                        }
                        case -278759476: {
                            break block22;
                        }
                    }
                    break;
                }
                return this.key;
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)dm.bwyo("bxcr", bwyk(int ), (int)53);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)dm.bwyo("bxcs", bwyk(int ), (int)54);
                if (!var3_1) break;
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)dm.bwyo("bxct", bwyk(int ), (int)55);
                if (!var3_1) break;
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)dm.bwyo("bxcu", bwyk(int ), (int)56);
        ** while (!var3_1)
lbl74:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ int bwyk(int n2) {
        return bwyl[n2] ^ bwym[n2];
    }

    public static /* synthetic */ CallSite bwyo(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    static {
        bwyl = new int[57];
        bwym = new int[57];
        dm.bxcv();
        dm.bxcw();
        bwyu = new long[50];
        bwyv = new long[50];
        dm.bxcx();
        dm.bxcy();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final int hashCode() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = dm.ep - dm.bwyo("bwzm", bwyt(int ), (int)8)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == dm.bwyo("bwzn", bwyk(int ), (int)12)) break;
            v0 /* !! */  = (long)dm.bwyo("bwzo", bwyk(int ), (int)13);
        }
        var3_1 = dm.c;
        v1 /* !! */  = dm.ep;
        if (true) ** GOTO lbl12
        block24: while (true) {
            v1 /* !! */  = (long)(v2 - dm.bwyo("bwzp", bwyt(int ), (int)9));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -278759476: {
                    break block24;
                }
                case 1164824204: {
                    v2 = dm.bwyo("bwzq", bwyt(int ), (int)10);
                    continue block24;
                }
                case 1202132596: {
                    v2 = dm.bwyo("bwzr", bwyt(int ), (int)11);
                    continue block24;
                }
                case 1347917902: {
                    v2 = dm.bwyo("bwzs", bwyt(int ), (int)12);
                    continue block24;
                }
            }
            break;
        }
        var2_2 /* !! */  = dm.b;
        v3 /* !! */  = dm.ep;
        if (true) ** GOTO lbl29
        block25: while (true) {
            v3 /* !! */  = (long)(v4 - dm.bwyo("bwzt", bwyt(int ), (int)13));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1030021287: {
                    v4 = dm.bwyo("bwzu", bwyt(int ), (int)14);
                    continue block25;
                }
                case -278759476: {
                    break block25;
                }
                case 134909296: {
                    v4 = dm.bwyo("bwzv", bwyt(int ), (int)15);
                    continue block25;
                }
                case 962982224: {
                    v4 = dm.bwyo("bwzw", bwyt(int ), (int)16);
                    continue block25;
                }
            }
            break;
        }
        var1_3 = dm.a;
        if (var3_1) {
            throw null;
lbl44:
            // 2 sources

            return (int)dm.bwyo("bwzx", bwyk(int ), (int)14);
        }
        if (var1_3) ** GOTO lbl44
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                v5 /* !! */  = dm.ep;
                if (true) ** GOTO lbl55
                block27: while (true) {
                    v5 /* !! */  = (long)(v6 - dm.bwyo("bwzy", bwyt(int ), (int)17));
lbl55:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -2127326304: {
                            v6 = dm.bwyo("bwzz", bwyt(int ), (int)18);
                            continue block27;
                        }
                        case -278759476: {
                            break block27;
                        }
                        case 1934285634: {
                            v6 = dm.bwyo("bxaa", bwyt(int ), (int)19);
                            continue block27;
                        }
                    }
                    break;
                }
                return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dm.class, "name;message;key", "name", "message", "key"}, this);
            }
lbl65:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)dm.bwyo("bxab", bwyk(int ), (int)15);
                if (!var3_1) break;
                throw null;
            }
            case 1: {
                do {
                    var2_2 /* !! */  = (int)dm.bwyo("bxac", bwyk(int ), (int)16);
                } while (!var3_1);
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)dm.bwyo("bxad", bwyk(int ), (int)17);
                if (!var3_1) ** GOTO lbl65
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)dm.bwyo("bxae", bwyk(int ), (int)18);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ void bxcw() {
        dm.bwym[0] = -1650287280;
        dm.bwym[1] = 1631318880;
        dm.bwym[2] = -537247114;
        dm.bwym[3] = -1436045562;
        dm.bwym[4] = -1728778889;
        dm.bwym[5] = 630904880;
        dm.bwym[6] = 959664460;
        dm.bwym[7] = -1363800813;
        dm.bwym[8] = -1076280703;
        dm.bwym[9] = -2139995943;
        dm.bwym[10] = 845911551;
        dm.bwym[11] = -429317909;
        dm.bwym[12] = -1208308061;
        dm.bwym[13] = -449583820;
        dm.bwym[14] = 410524103;
        dm.bwym[15] = 1057201190;
        dm.bwym[16] = -1759821859;
        dm.bwym[17] = 407317510;
        dm.bwym[18] = -1294671430;
        dm.bwym[19] = -27348511;
        dm.bwym[20] = -1416052794;
        dm.bwym[21] = 915377204;
        dm.bwym[22] = -218912729;
        dm.bwym[23] = -1439848032;
        dm.bwym[24] = -340925571;
        dm.bwym[25] = 338592506;
        dm.bwym[26] = 992809019;
        dm.bwym[27] = -1460024196;
        dm.bwym[28] = 1065611502;
        dm.bwym[29] = 1900837602;
        dm.bwym[30] = 1668270061;
        dm.bwym[31] = 1627639710;
        dm.bwym[32] = 1604965377;
        dm.bwym[33] = 1768759153;
        dm.bwym[34] = 21661334;
        dm.bwym[35] = 1950542617;
        dm.bwym[36] = 1301908062;
        dm.bwym[37] = 1598284070;
        dm.bwym[38] = 1509325026;
        dm.bwym[39] = 1756102018;
        dm.bwym[40] = 257797474;
        dm.bwym[41] = -601798201;
        dm.bwym[42] = -1495246679;
        dm.bwym[43] = 1935181930;
        dm.bwym[44] = -1357924935;
        dm.bwym[45] = 158722488;
        dm.bwym[46] = -1724083857;
        dm.bwym[47] = 1881449371;
        dm.bwym[48] = -2113556989;
        dm.bwym[49] = 1129638632;
        dm.bwym[50] = 1863039219;
        dm.bwym[51] = 1634245030;
        dm.bwym[52] = -765382413;
        dm.bwym[53] = -1437782716;
        dm.bwym[54] = -959525733;
        dm.bwym[55] = -590891163;
        dm.bwym[56] = 325495034;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public String name() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = dm.ep - dm.bwyo("bxax", bwyt(int ), (int)29)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == dm.bwyo("bxay", bwyk(int ), (int)28)) break;
            v0 /* !! */  = (long)dm.bwyo("bxaz", bwyk(int ), (int)29);
        }
        var3_1 = dm.c;
        v1 /* !! */  = dm.ep;
        if (true) ** GOTO lbl12
        block12: while (true) {
            v1 /* !! */  = (long)(v2 - dm.bwyo("bxba", bwyt(int ), (int)30));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -278759476: {
                    break block12;
                }
                case 1260874381: {
                    v2 = dm.bwyo("bxbb", bwyt(int ), (int)31);
                    continue block12;
                }
                case 1783672476: {
                    v2 = dm.bwyo("bxbc", bwyt(int ), (int)32);
                    continue block12;
                }
            }
            break;
        }
        var2_2 /* !! */  = dm.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = dm.ep - dm.bwyo("bxbd", bwyt(int ), (int)33)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == dm.bwyo("bxbe", bwyk(int ), (int)30)) break;
            v3 /* !! */  = (long)dm.bwyo("bxbf", bwyk(int ), (int)31);
        }
        var1_3 = dm.a;
        if (var3_1) {
            throw null;
lbl31:
            // 2 sources

            return null;
        }
        if (var1_3) ** GOTO lbl31
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block5 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = dm.ep - dm.bwyo("bxbg", bwyt(int ), (int)34)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == dm.bwyo("bxbh", bwyk(int ), (int)32)) break;
                    v4 /* !! */  = (long)dm.bwyo("bxbi", bwyk(int ), (int)33);
                }
                return this.name;
            }
            case 0: {
                var2_2 /* !! */  = (int)dm.bwyo("bxbj", bwyk(int ), (int)34);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl54
            }
            case 1: {
                var2_2 /* !! */  = (int)dm.bwyo("bxbk", bwyk(int ), (int)35);
                if (var3_1) {
                    throw null;
                }
            }
lbl54:
            // 4 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)dm.bwyo("bxbl", bwyk(int ), (int)36);
                    if (!var3_1) break block5;
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)dm.bwyo("bxbm", bwyk(int ), (int)37);
        ** while (!var3_1)
lbl62:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public dm(String var1_1, String var2_2, int var3_3) {
        var5_4 /* !! */  = dm.b;
        if (var5_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                super();
                this.name = var1_1;
                this.message = var2_2;
                this.key = var3_3;
                return;
            }
            case 0: {
                var5_4 /* !! */  = (int)dm.bwyo("bwyp", bwyk(int ), (int)0);
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_4 /* !! */  = (int)dm.bwyo("bwyq", bwyk(int ), (int)1);
                    continue;
                    break;
                }
            }
            case 2: {
                while (true) {
                    var5_4 /* !! */  = (int)dm.bwyo("bwyr", bwyk(int ), (int)2);
                }
            }
            case 3: 
        }
        var5_4 /* !! */  = (int)dm.bwyo("bwys", bwyk(int ), (int)3);
        ** while (true)
    }
}

