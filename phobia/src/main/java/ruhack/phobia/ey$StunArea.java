/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.runtime.ObjectMethods
 *  net.minecraft.class_243
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.runtime.ObjectMethods;
import net.minecraft.class_243;

record ey$StunArea(class_243 position, long expiresAt) {
    private static int[] ebhg = new int[47];
    public static final int b;
    private static long[] ebhn;
    public static final boolean a;
    private final class_243 position;
    protected static final long kh = -1623087865484313372L;
    private static int[] ebhh;
    public static final boolean c;
    private final long expiresAt;
    private static long[] ebho;

    private static /* synthetic */ int ebhf(int n2) {
        return ebhg[n2] ^ ebhh[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public long expiresAt() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ey$StunArea.kh - ey$StunArea.ebhi("ebkb", ebhm(int ), (int)30)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ey$StunArea.ebhi("ebkc", ebhf(int ), (int)37)) break;
            v0 /* !! */  = (long)ey$StunArea.ebhi("ebkd", ebhf(int ), (int)38);
        }
        var3_1 = ey$StunArea.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ey$StunArea.kh - ey$StunArea.ebhi("ebke", ebhm(int ), (int)31)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == ey$StunArea.ebhi("ebkf", ebhf(int ), (int)39)) break;
            v1 /* !! */  = (long)ey$StunArea.ebhi("ebkg", ebhf(int ), (int)40);
        }
        var2_2 /* !! */  = ey$StunArea.b;
        v2 /* !! */  = ey$StunArea.kh;
        if (true) ** GOTO lbl19
        block12: while (true) {
            v2 /* !! */  = (long)(ey$StunArea.ebhi("ebki", ebhm(int ), (int)33) - ey$StunArea.ebhi("ebkh", ebhm(int ), (int)32));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1836090140: {
                    break block12;
                }
                case 1241619175: {
                    continue block12;
                }
            }
            break;
        }
        var1_3 = ey$StunArea.a;
        if (var3_1) {
            throw null;
lbl27:
            // 2 sources

            return (long)ey$StunArea.ebhi("ebkj", ebhm(int ), (int)34);
        }
        if (var1_3) ** GOTO lbl27
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = ey$StunArea.kh - ey$StunArea.ebhi("ebkk", ebhm(int ), (int)35)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == ey$StunArea.ebhi("ebkl", ebhf(int ), (int)41)) break;
                    v3 /* !! */  = (long)ey$StunArea.ebhi("ebkm", ebhf(int ), (int)42);
                }
                return this.expiresAt;
            }
lbl41:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)ey$StunArea.ebhi("ebkn", ebhf(int ), (int)43);
                if (var3_1) {
                    throw null;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)ey$StunArea.ebhi("ebko", ebhf(int ), (int)44);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ey$StunArea.ebhi("ebkp", ebhf(int ), (int)45);
                    if (!var3_1) ** GOTO lbl41
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)ey$StunArea.ebhi("ebkq", ebhf(int ), (int)46);
        ** while (!var3_1)
lbl57:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ebkt() {
        ey$StunArea.ebhn[0] = 4988110236405829379L;
        ey$StunArea.ebhn[1] = -3481068426379714505L;
        ey$StunArea.ebhn[2] = 4476009575105291422L;
        ey$StunArea.ebhn[3] = -5838238931084008597L;
        ey$StunArea.ebhn[4] = 7823449835694592118L;
        ey$StunArea.ebhn[5] = 8010440268499968853L;
        ey$StunArea.ebhn[6] = -1157621332886633817L;
        ey$StunArea.ebhn[7] = 4687959210007976329L;
        ey$StunArea.ebhn[8] = -3072771724156625763L;
        ey$StunArea.ebhn[9] = 6342217765321447587L;
        ey$StunArea.ebhn[10] = 3555696610896603549L;
        ey$StunArea.ebhn[11] = -7716968420807715685L;
        ey$StunArea.ebhn[12] = 5666993677925649068L;
        ey$StunArea.ebhn[13] = -5812928751770825246L;
        ey$StunArea.ebhn[14] = 7419812921245474017L;
        ey$StunArea.ebhn[15] = -6032778512846962870L;
        ey$StunArea.ebhn[16] = 4512391518176018316L;
        ey$StunArea.ebhn[17] = -3955442175450983800L;
        ey$StunArea.ebhn[18] = -2016877954223301904L;
        ey$StunArea.ebhn[19] = -4988657444221440301L;
        ey$StunArea.ebhn[20] = 5262409529633322665L;
        ey$StunArea.ebhn[21] = -6366443004265149039L;
        ey$StunArea.ebhn[22] = 4189500512721606573L;
        ey$StunArea.ebhn[23] = -7340050532939239167L;
        ey$StunArea.ebhn[24] = -9101553583797815518L;
        ey$StunArea.ebhn[25] = 4930696092502971190L;
        ey$StunArea.ebhn[26] = -5859077225192714334L;
        ey$StunArea.ebhn[27] = 5807977025188485704L;
        ey$StunArea.ebhn[28] = 3428100437181818349L;
        ey$StunArea.ebhn[29] = -8168988802598160975L;
        ey$StunArea.ebhn[30] = 5115300230513733454L;
        ey$StunArea.ebhn[31] = -7267554258156907127L;
        ey$StunArea.ebhn[32] = 5354605939127805386L;
        ey$StunArea.ebhn[33] = -1483270816958945949L;
        ey$StunArea.ebhn[34] = -8305116502709819911L;
        ey$StunArea.ebhn[35] = 8032382995333110472L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public class_243 position() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ey$StunArea.kh - ey$StunArea.ebhi("ebjm", ebhm(int ), (int)23)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ey$StunArea.ebhi("ebjn", ebhf(int ), (int)29)) break;
            v0 /* !! */  = (long)ey$StunArea.ebhi("ebjo", ebhf(int ), (int)30);
        }
        var3_1 = ey$StunArea.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ey$StunArea.kh - ey$StunArea.ebhi("ebjp", ebhm(int ), (int)24)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == ey$StunArea.ebhi("ebjq", ebhf(int ), (int)31)) break;
            v1 /* !! */  = (long)ey$StunArea.ebhi("ebjr", ebhf(int ), (int)32);
        }
        var2_2 = ey$StunArea.b;
        v2 /* !! */  = ey$StunArea.kh;
        if (true) ** GOTO lbl19
        block11: while (true) {
            v2 /* !! */  = (long)(v3 - ey$StunArea.ebhi("ebjs", ebhm(int ), (int)25));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1836090140: {
                    break block11;
                }
                case -921212310: {
                    v3 = ey$StunArea.ebhi("ebjt", ebhm(int ), (int)26);
                    continue block11;
                }
                case 1586794446: {
                    v3 = ey$StunArea.ebhi("ebju", ebhm(int ), (int)27);
                    continue block11;
                }
            }
            break;
        }
        var1_3 = ey$StunArea.a;
        if (var3_1) {
            throw null;
lbl31:
            // 1 sources

            return null;
        }
        ** while (var1_3 || var1_3)
lbl34:
        // 1 sources

        v4 /* !! */  = ey$StunArea.kh;
        if (true) ** GOTO lbl38
        block13: while (true) {
            v4 /* !! */  = (long)(ey$StunArea.ebhi("ebjw", ebhm(int ), (int)29) - ey$StunArea.ebhi("ebjv", ebhm(int ), (int)28));
lbl38:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1836090140: {
                    break block13;
                }
                case 1914436797: {
                    continue block13;
                }
            }
            break;
        }
        return this.position;
    }

    private static /* synthetic */ void ebks() {
        ey$StunArea.ebhh[0] = 437136033;
        ey$StunArea.ebhh[1] = -1354478413;
        ey$StunArea.ebhh[2] = 892255594;
        ey$StunArea.ebhh[3] = 87140967;
        ey$StunArea.ebhh[4] = -524442766;
        ey$StunArea.ebhh[5] = 447311268;
        ey$StunArea.ebhh[6] = 113904567;
        ey$StunArea.ebhh[7] = -2035572979;
        ey$StunArea.ebhh[8] = 376485801;
        ey$StunArea.ebhh[9] = 1320697016;
        ey$StunArea.ebhh[10] = 1001695601;
        ey$StunArea.ebhh[11] = 1836910731;
        ey$StunArea.ebhh[12] = -1932211794;
        ey$StunArea.ebhh[13] = -551905279;
        ey$StunArea.ebhh[14] = 626167602;
        ey$StunArea.ebhh[15] = 2087175635;
        ey$StunArea.ebhh[16] = 664572645;
        ey$StunArea.ebhh[17] = 1884596155;
        ey$StunArea.ebhh[18] = -98777673;
        ey$StunArea.ebhh[19] = -873898783;
        ey$StunArea.ebhh[20] = 990912504;
        ey$StunArea.ebhh[21] = 239742048;
        ey$StunArea.ebhh[22] = 441180875;
        ey$StunArea.ebhh[23] = -2015417559;
        ey$StunArea.ebhh[24] = -2001096287;
        ey$StunArea.ebhh[25] = 1106714983;
        ey$StunArea.ebhh[26] = -456763361;
        ey$StunArea.ebhh[27] = 709214137;
        ey$StunArea.ebhh[28] = 1964547121;
        ey$StunArea.ebhh[29] = -1765002170;
        ey$StunArea.ebhh[30] = 2024319092;
        ey$StunArea.ebhh[31] = -40935592;
        ey$StunArea.ebhh[32] = 595002542;
        ey$StunArea.ebhh[33] = 2019832598;
        ey$StunArea.ebhh[34] = -901557758;
        ey$StunArea.ebhh[35] = -220308157;
        ey$StunArea.ebhh[36] = 282923722;
        ey$StunArea.ebhh[37] = -731948595;
        ey$StunArea.ebhh[38] = -387866413;
        ey$StunArea.ebhh[39] = -113046641;
        ey$StunArea.ebhh[40] = 1932698527;
        ey$StunArea.ebhh[41] = 1389553802;
        ey$StunArea.ebhh[42] = -2040372653;
        ey$StunArea.ebhh[43] = 22086328;
        ey$StunArea.ebhh[44] = 101923434;
        ey$StunArea.ebhh[45] = -1968085529;
        ey$StunArea.ebhh[46] = -1900900965;
    }

    static {
        ebhh = new int[47];
        ey$StunArea.ebkr();
        ey$StunArea.ebks();
        ebhn = new long[36];
        ebho = new long[36];
        ey$StunArea.ebkt();
        ey$StunArea.ebku();
    }

    public static /* synthetic */ CallSite ebhi(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Enabled aggressive block sorting
     */
    public final String toString() {
        boolean bl2;
        while (true) {
            long l2;
            Object object;
            if ((object = (l2 = kh - ey$StunArea.ebhi("ebhp", ebhm(int ), (int)0)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object == ey$StunArea.ebhi("ebhq", ebhf(int ), (int)3)) break;
            object = ey$StunArea.ebhi("ebhr", ebhf(int ), (int)4);
        }
        boolean bl3 = c;
        while (true) {
            long l3;
            Object object;
            if ((object = (l3 = kh - ey$StunArea.ebhi("ebhs", ebhm(int ), (int)1)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object == ey$StunArea.ebhi("ebht", ebhf(int ), (int)5)) break;
            object = ey$StunArea.ebhi("ebhu", ebhf(int ), (int)6);
        }
        int n2 = b;
        while (true) {
            long l4;
            Object object;
            if ((object = (l4 = kh - ey$StunArea.ebhi("ebhv", ebhm(int ), (int)2)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            if (object == ey$StunArea.ebhi("ebhw", ebhf(int ), (int)7)) {
                bl2 = a;
                if (bl3) {
                    throw null;
                }
                break;
            }
            object = ey$StunArea.ebhi("ebhx", ebhf(int ), (int)8);
        }
        if (bl2) return null;
        if (bl2) return null;
        while (true) {
            long l5;
            Object object;
            if ((object = (l5 = kh - ey$StunArea.ebhi("ebhy", ebhm(int ), (int)3)) == 0L ? 0 : (l5 < 0L ? -1 : 1)) == false) continue;
            if (object == ey$StunArea.ebhi("ebhz", ebhf(int ), (int)9)) {
                return ObjectMethods.bootstrap("toString", new MethodHandle[]{ey$StunArea.class, "position;expiresAt", "position", "expiresAt"}, this);
            }
            object = ey$StunArea.ebhi("ebia", ebhf(int ), (int)10);
        }
    }

    private static /* synthetic */ long ebhm(int n2) {
        return ebhn[n2] ^ ebho[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final int hashCode() {
        v0 /* !! */  = ey$StunArea.kh;
        if (true) ** GOTO lbl5
        block21: while (true) {
            v0 /* !! */  = (long)(ey$StunArea.ebhi("ebig", ebhm(int ), (int)5) - ey$StunArea.ebhi("ebif", ebhm(int ), (int)4));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1836090140: {
                    break block21;
                }
                case 1657785414: {
                    continue block21;
                }
            }
            break;
        }
        var3_1 = ey$StunArea.c;
        v1 /* !! */  = ey$StunArea.kh;
        if (true) ** GOTO lbl15
        block22: while (true) {
            v1 /* !! */  = (long)(v2 - ey$StunArea.ebhi("ebih", ebhm(int ), (int)6));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1836090140: {
                    break block22;
                }
                case -688054542: {
                    v2 = ey$StunArea.ebhi("ebii", ebhm(int ), (int)7);
                    continue block22;
                }
                case 935800081: {
                    v2 = ey$StunArea.ebhi("ebij", ebhm(int ), (int)8);
                    continue block22;
                }
            }
            break;
        }
        var2_2 /* !! */  = ey$StunArea.b;
        v3 /* !! */  = ey$StunArea.kh;
        if (true) ** GOTO lbl29
        block23: while (true) {
            v3 /* !! */  = (long)(v4 - ey$StunArea.ebhi("ebik", ebhm(int ), (int)9));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1836090140: {
                    break block23;
                }
                case -643300928: {
                    v4 = ey$StunArea.ebhi("ebil", ebhm(int ), (int)10);
                    continue block23;
                }
                case 264101045: {
                    v4 = ey$StunArea.ebhi("ebim", ebhm(int ), (int)11);
                    continue block23;
                }
                case 1977042655: {
                    v4 = ey$StunArea.ebhi("ebin", ebhm(int ), (int)12);
                    continue block23;
                }
            }
            break;
        }
        var1_3 = ey$StunArea.a;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block15 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_1) {
                    throw null;
                    return (int)ey$StunArea.ebhi("ebio", ebhf(int ), (int)15);
                }
                if (var1_3 || var1_3) ** continue;
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_0 = ey$StunArea.kh - ey$StunArea.ebhi("ebip", ebhm(int ), (int)13)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == ey$StunArea.ebhi("ebiq", ebhf(int ), (int)16)) break;
                    v5 /* !! */  = (long)ey$StunArea.ebhi("ebir", ebhf(int ), (int)17);
                }
                return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ey$StunArea.class, "position;expiresAt", "position", "expiresAt"}, this);
            }
lbl57:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)ey$StunArea.ebhi("ebis", ebhf(int ), (int)18);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl66
            }
            case 1: {
                var2_2 /* !! */  = (int)ey$StunArea.ebhi("ebit", ebhf(int ), (int)19);
                if (!var3_1) ** GOTO lbl57
                throw null;
            }
lbl66:
            // 2 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ey$StunArea.ebhi("ebiu", ebhf(int ), (int)20);
                    if (!var3_1) break block15;
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)ey$StunArea.ebhi("ebiv", ebhf(int ), (int)21);
        ** while (!var3_1)
lbl74:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final boolean equals(Object var1_1) {
        v0 /* !! */  = ey$StunArea.kh;
        if (true) ** GOTO lbl5
        block14: while (true) {
            v0 /* !! */  = (long)(ey$StunArea.ebhi("ebix", ebhm(int ), (int)15) - ey$StunArea.ebhi("ebiw", ebhm(int ), (int)14));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1836090140: {
                    break block14;
                }
                case 968899700: {
                    continue block14;
                }
            }
            break;
        }
        var4_2 = ey$StunArea.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = ey$StunArea.kh - ey$StunArea.ebhi("ebiy", ebhm(int ), (int)16)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == ey$StunArea.ebhi("ebiz", ebhf(int ), (int)22)) break;
            v1 /* !! */  = (long)ey$StunArea.ebhi("ebja", ebhf(int ), (int)23);
        }
        var3_3 = ey$StunArea.b;
        v2 /* !! */  = ey$StunArea.kh;
        if (true) ** GOTO lbl22
        block16: while (true) {
            v2 /* !! */  = (long)(v3 - ey$StunArea.ebhi("ebjb", ebhm(int ), (int)17));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1836090140: {
                    break block16;
                }
                case -1007401468: {
                    v3 = ey$StunArea.ebhi("ebjc", ebhm(int ), (int)18);
                    continue block16;
                }
                case 359428481: {
                    v3 = ey$StunArea.ebhi("ebjd", ebhm(int ), (int)19);
                    continue block16;
                }
            }
            break;
        }
        var2_4 = ey$StunArea.a;
        if (var4_2) {
            throw null;
lbl34:
            // 1 sources

            return (boolean)ey$StunArea.ebhi("ebje", ebhf(int ), (int)24);
        }
        ** while (var2_4 || var2_4)
lbl37:
        // 1 sources

        v4 /* !! */  = ey$StunArea.kh;
        if (true) ** GOTO lbl41
        block18: while (true) {
            v4 /* !! */  = (long)(v5 - ey$StunArea.ebhi("ebjf", ebhm(int ), (int)20));
lbl41:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1836090140: {
                    break block18;
                }
                case -1755649798: {
                    v5 = ey$StunArea.ebhi("ebjg", ebhm(int ), (int)21);
                    continue block18;
                }
                case -418805780: {
                    v5 = ey$StunArea.ebhi("ebjh", ebhm(int ), (int)22);
                    continue block18;
                }
            }
            break;
        }
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ey$StunArea.class, "position;expiresAt", "position", "expiresAt"}, this, var1_1);
    }

    private static /* synthetic */ void ebkr() {
        ey$StunArea.ebhg[0] = 437136035;
        ey$StunArea.ebhg[1] = -1354478413;
        ey$StunArea.ebhg[2] = 892255592;
        ey$StunArea.ebhg[3] = -87140968;
        ey$StunArea.ebhg[4] = 1399521996;
        ey$StunArea.ebhg[5] = -447311269;
        ey$StunArea.ebhg[6] = 1557116691;
        ey$StunArea.ebhg[7] = 2035572978;
        ey$StunArea.ebhg[8] = -324749445;
        ey$StunArea.ebhg[9] = -1320697017;
        ey$StunArea.ebhg[10] = -1242973752;
        ey$StunArea.ebhg[11] = 1836910729;
        ey$StunArea.ebhg[12] = -1932211796;
        ey$StunArea.ebhg[13] = -551905277;
        ey$StunArea.ebhg[14] = 626167601;
        ey$StunArea.ebhg[15] = 1153209130;
        ey$StunArea.ebhg[16] = 664572644;
        ey$StunArea.ebhg[17] = 232224532;
        ey$StunArea.ebhg[18] = -98777674;
        ey$StunArea.ebhg[19] = -873898781;
        ey$StunArea.ebhg[20] = 990912505;
        ey$StunArea.ebhg[21] = 239742050;
        ey$StunArea.ebhg[22] = 441180874;
        ey$StunArea.ebhg[23] = -1802674507;
        ey$StunArea.ebhg[24] = -2001096288;
        ey$StunArea.ebhg[25] = 1106714980;
        ey$StunArea.ebhg[26] = -456763364;
        ey$StunArea.ebhg[27] = 709214138;
        ey$StunArea.ebhg[28] = 1964547123;
        ey$StunArea.ebhg[29] = 1765002169;
        ey$StunArea.ebhg[30] = -182209532;
        ey$StunArea.ebhg[31] = -40935591;
        ey$StunArea.ebhg[32] = -1499447744;
        ey$StunArea.ebhg[33] = 2019832596;
        ey$StunArea.ebhg[34] = -901557758;
        ey$StunArea.ebhg[35] = -220308159;
        ey$StunArea.ebhg[36] = 282923720;
        ey$StunArea.ebhg[37] = -731948596;
        ey$StunArea.ebhg[38] = 913272265;
        ey$StunArea.ebhg[39] = 113046640;
        ey$StunArea.ebhg[40] = -1435563327;
        ey$StunArea.ebhg[41] = 1389553803;
        ey$StunArea.ebhg[42] = -1102755116;
        ey$StunArea.ebhg[43] = 22086329;
        ey$StunArea.ebhg[44] = 101923435;
        ey$StunArea.ebhg[45] = -1968085530;
        ey$StunArea.ebhg[46] = -1900900966;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private ey$StunArea(class_243 var1_1, long var2_2) {
        var5_3 /* !! */  = ey$StunArea.b;
        super();
        this.position = var1_1;
        if (var5_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.expiresAt = var2_2;
                return;
            }
lbl9:
            // 2 sources

            case 0: {
                while (true) {
                    var5_3 /* !! */  = (int)ey$StunArea.ebhi("ebhj", ebhf(int ), (int)0);
                }
            }
            case 1: {
                var5_3 /* !! */  = (int)ey$StunArea.ebhi("ebhk", ebhf(int ), (int)1);
                ** GOTO lbl9
            }
            case 2: 
        }
        while (true) {
            var5_3 /* !! */  = (int)ey$StunArea.ebhi("ebhl", ebhf(int ), (int)2);
        }
    }

    private static /* synthetic */ void ebku() {
        ey$StunArea.ebho[0] = 5205616387585508662L;
        ey$StunArea.ebho[1] = -2326767549420236042L;
        ey$StunArea.ebho[2] = 5245200839443647218L;
        ey$StunArea.ebho[3] = -4934077565549174359L;
        ey$StunArea.ebho[4] = -7359076680380425593L;
        ey$StunArea.ebho[5] = 3182985671590092433L;
        ey$StunArea.ebho[6] = 8823759874182398424L;
        ey$StunArea.ebho[7] = -4686359456717659017L;
        ey$StunArea.ebho[8] = 8583029729041097409L;
        ey$StunArea.ebho[9] = 6790512930221214997L;
        ey$StunArea.ebho[10] = -129587526180337789L;
        ey$StunArea.ebho[11] = -5446881409628248024L;
        ey$StunArea.ebho[12] = 263368053762460009L;
        ey$StunArea.ebho[13] = 387641055853957173L;
        ey$StunArea.ebho[14] = 8035436928763819880L;
        ey$StunArea.ebho[15] = -1019606996435489003L;
        ey$StunArea.ebho[16] = -7097893066485701153L;
        ey$StunArea.ebho[17] = -3454206399230097389L;
        ey$StunArea.ebho[18] = 1136071867237906998L;
        ey$StunArea.ebho[19] = -6937393824703205375L;
        ey$StunArea.ebho[20] = 414651926353229659L;
        ey$StunArea.ebho[21] = 4340007184786768394L;
        ey$StunArea.ebho[22] = 2285103917391903770L;
        ey$StunArea.ebho[23] = -3851022601526613324L;
        ey$StunArea.ebho[24] = 4108628272819709516L;
        ey$StunArea.ebho[25] = -2128883486929161794L;
        ey$StunArea.ebho[26] = 2151923748326258408L;
        ey$StunArea.ebho[27] = 1412391150385305877L;
        ey$StunArea.ebho[28] = 2012501973413127914L;
        ey$StunArea.ebho[29] = 9159466420294337208L;
        ey$StunArea.ebho[30] = -3519419952083060989L;
        ey$StunArea.ebho[31] = -5616005347064578416L;
        ey$StunArea.ebho[32] = -1690088738980289638L;
        ey$StunArea.ebho[33] = -5482719173986060442L;
        ey$StunArea.ebho[34] = 5600077793235902502L;
        ey$StunArea.ebho[35] = -8311549731639139796L;
    }
}

