/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1268
 *  net.minecraft.class_4587
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.minecraft.class_1268;
import net.minecraft.class_4587;
import ruhack.phobia.bc;

public class cc
extends bc {
    public static final boolean c;
    private class_1268 hand;
    private float swingProgress;
    public static final int b;
    private static int[] dpjd;
    public static final boolean a;
    private static final long im = 2154829065395591266L;
    private class_4587 matrices;
    private static int[] dpje;
    private static long[] dpjl;
    private static long[] dpjm;

    private static /* synthetic */ void dpnp() {
        cc.dpjm[0] = 4897428542074351032L;
        cc.dpjm[1] = -5498783644413471084L;
        cc.dpjm[2] = 4425787865274713386L;
        cc.dpjm[3] = 6708080215566718460L;
        cc.dpjm[4] = 1983032354002517830L;
        cc.dpjm[5] = -3037653742552287248L;
        cc.dpjm[6] = -8651652858146831465L;
        cc.dpjm[7] = 1870762053291675421L;
        cc.dpjm[8] = 777300616619344354L;
        cc.dpjm[9] = 511290777904336667L;
        cc.dpjm[10] = 8850202280307117183L;
        cc.dpjm[11] = -1208546557941405864L;
        cc.dpjm[12] = 3083724084048209641L;
        cc.dpjm[13] = -6153162607362440916L;
        cc.dpjm[14] = 450998511624594315L;
        cc.dpjm[15] = -6596723529487632672L;
        cc.dpjm[16] = -7537421608324871454L;
        cc.dpjm[17] = -1384503662057426668L;
        cc.dpjm[18] = -4502745141662209178L;
        cc.dpjm[19] = -7456363383560063138L;
        cc.dpjm[20] = -6578398225374453156L;
        cc.dpjm[21] = -7769247186352974928L;
        cc.dpjm[22] = 4013841792041870809L;
        cc.dpjm[23] = 8607061372515932774L;
        cc.dpjm[24] = -7288225645347716138L;
        cc.dpjm[25] = -2425419435816267859L;
        cc.dpjm[26] = -7648149709605619234L;
        cc.dpjm[27] = 6456973938844369465L;
        cc.dpjm[28] = 4591242709337233969L;
        cc.dpjm[29] = 1832235543945858334L;
        cc.dpjm[30] = 2730780315328071610L;
        cc.dpjm[31] = 9116299404699015237L;
        cc.dpjm[32] = -2917435953868537114L;
        cc.dpjm[33] = 8713151402100964424L;
        cc.dpjm[34] = 7613071502546007750L;
        cc.dpjm[35] = 3115266682912796186L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public class_1268 getHand() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = cc.im - cc.dpjf("dpkf", dpjk(int ), (int)10)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == cc.dpjf("dpkg", dpjc(int ), (int)12)) break;
            v0 /* !! */  = (long)cc.dpjf("dpkh", dpjc(int ), (int)13);
        }
        var3_1 = cc.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = cc.im - cc.dpjf("dpki", dpjk(int ), (int)11)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == cc.dpjf("dpkj", dpjc(int ), (int)14)) break;
            v1 /* !! */  = (long)cc.dpjf("dpkk", dpjc(int ), (int)15);
        }
        var2_2 /* !! */  = cc.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = cc.im - cc.dpjf("dpkl", dpjk(int ), (int)12)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == cc.dpjf("dpkm", dpjc(int ), (int)16)) break;
            v2 /* !! */  = (long)cc.dpjf("dpkn", dpjc(int ), (int)17);
        }
        var1_3 = cc.a;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_1) {
                    throw null;
                    return null;
                }
                if (var1_3 || var1_3) ** continue;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_3 = cc.im - cc.dpjf("dpko", dpjk(int ), (int)13)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == cc.dpjf("dpkp", dpjc(int ), (int)18)) break;
                    v3 /* !! */  = (long)cc.dpjf("dpkq", dpjc(int ), (int)19);
                }
                return this.hand;
            }
            case 0: {
                var2_2 /* !! */  = (int)cc.dpjf("dpkr", dpjc(int ), (int)20);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl46
            }
            case 1: {
                var2_2 /* !! */  = (int)cc.dpjf("dpks", dpjc(int ), (int)21);
                if (!var3_1) break;
                throw null;
            }
lbl46:
            // 2 sources

            case 2: {
                do {
                    var2_2 /* !! */  = (int)cc.dpjf("dpkt", dpjc(int ), (int)22);
                } while (!var3_1);
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)cc.dpjf("dpku", dpjc(int ), (int)23);
        } while (!var3_1);
        throw null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void setSwingProgress(float f2) {
        boolean bl2;
        while (true) {
            long l2;
            Object object;
            if ((object = (l2 = im - cc.dpjf("dpmv", dpjk(int ), (int)32)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object == cc.dpjf("dpmw", dpjc(int ), (int)57)) break;
            object = cc.dpjf("dpmx", dpjc(int ), (int)58);
        }
        boolean bl3 = c;
        while (true) {
            long l3;
            Object object;
            if ((object = (l3 = im - cc.dpjf("dpmy", dpjk(int ), (int)33)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object == cc.dpjf("dpmz", dpjc(int ), (int)59)) break;
            object = cc.dpjf("dpna", dpjc(int ), (int)60);
        }
        int n2 = b;
        while (true) {
            long l4;
            Object object;
            if ((object = (l4 = im - cc.dpjf("dpnb", dpjk(int ), (int)34)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            if (object == cc.dpjf("dpnc", dpjc(int ), (int)61)) {
                bl2 = a;
                if (bl3) {
                    throw null;
                }
                break;
            }
            object = cc.dpjf("dpnd", dpjc(int ), (int)62);
        }
        if (bl2 || bl2) return;
        while (true) {
            Object object;
            block7: {
                long l5;
                if ((object = (l5 = im - cc.dpjf("dpne", dpjk(int ), (int)35)) == 0L ? 0 : (l5 < 0L ? -1 : 1)) == false) continue;
                if (object == cc.dpjf("dpnf", dpjc(int ), (int)63)) {
                    this.swingProgress = f2;
                    if (!bl2) return;
                }
                break block7;
                return;
            }
            object = cc.dpjf("dpng", dpjc(int ), (int)64);
        }
    }

    private static /* synthetic */ float dple(int n2) {
        return Float.intBitsToFloat(dpjd[n2] ^ dpje[n2]);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public class_4587 getMatrices() {
        v0 /* !! */  = cc.im;
        if (true) ** GOTO lbl5
        block18: while (true) {
            v0 /* !! */  = (long)(v1 - cc.dpjf("dpjn", dpjk(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1904710626: {
                    v1 = cc.dpjf("dpjo", dpjk(int ), (int)1);
                    continue block18;
                }
                case 1117214818: {
                    break block18;
                }
                case 1233551379: {
                    v1 = cc.dpjf("dpjp", dpjk(int ), (int)2);
                    continue block18;
                }
                case 1652792223: {
                    v1 = cc.dpjf("dpjq", dpjk(int ), (int)3);
                    continue block18;
                }
            }
            break;
        }
        var3_1 = cc.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = cc.im - cc.dpjf("dpjr", dpjk(int ), (int)4)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == cc.dpjf("dpjs", dpjc(int ), (int)4)) break;
            v2 /* !! */  = (long)cc.dpjf("dpjt", dpjc(int ), (int)5);
        }
        var2_2 /* !! */  = cc.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = cc.im - cc.dpjf("dpju", dpjk(int ), (int)5)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == cc.dpjf("dpjv", dpjc(int ), (int)6)) break;
            v3 /* !! */  = (long)cc.dpjf("dpjw", dpjc(int ), (int)7);
        }
        var1_3 = cc.a;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_1) {
                    throw null;
                    return null;
                }
                if (var1_3 || var1_3) ** continue;
                v4 /* !! */  = cc.im;
                if (true) ** GOTO lbl44
                block22: while (true) {
                    v4 /* !! */  = (long)(v5 - cc.dpjf("dpjx", dpjk(int ), (int)6));
lbl44:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1669214571: {
                            v5 = cc.dpjf("dpjy", dpjk(int ), (int)7);
                            continue block22;
                        }
                        case -1148068767: {
                            v5 = cc.dpjf("dpjz", dpjk(int ), (int)8);
                            continue block22;
                        }
                        case 1117214818: {
                            break block22;
                        }
                        case 1803753830: {
                            v5 = cc.dpjf("dpka", dpjk(int ), (int)9);
                            continue block22;
                        }
                    }
                    break;
                }
                return this.matrices;
            }
            case 0: {
                var2_2 /* !! */  = (int)cc.dpjf("dpkb", dpjc(int ), (int)8);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl66
            }
            case 1: {
                var2_2 /* !! */  = (int)cc.dpjf("dpkc", dpjc(int ), (int)9);
                if (!var3_1) break;
                throw null;
            }
lbl66:
            // 2 sources

            case 2: {
                do {
                    var2_2 /* !! */  = (int)cc.dpjf("dpkd", dpjc(int ), (int)10);
                } while (!var3_1);
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)cc.dpjf("dpke", dpjc(int ), (int)11);
        } while (!var3_1);
        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public void setHand(class_1268 var1_1) {
        block24: {
            block26: {
                while (true) {
                    if ((v0 /* !! */  = (cfr_temp_1 = cc.im - cc.dpjf("dpme", dpjk(int ), (int)26)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v0 /* !! */  == cc.dpjf("dpmf", dpjc(int ), (int)46)) break;
                    v0 /* !! */  = (long)cc.dpjf("dpmg", dpjc(int ), (int)47);
                }
                var4_2 = cc.c;
                while (true) {
                    block25: {
                        if ((v1 /* !! */  = (cfr_temp_2 = cc.im - cc.dpjf("dpmh", dpjk(int ), (int)27)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                        if (v1 /* !! */  != cc.dpjf("dpmi", dpjc(int ), (int)48)) break block25;
                        var3_3 /* !! */  = cc.b;
                        v2 /* !! */  = cc.im;
                        if (true) ** GOTO lbl18
                    }
                    v1 /* !! */  = (long)cc.dpjf("dpmj", dpjc(int ), (int)49);
                }
                block14: while (true) {
                    v2 /* !! */  = (long)(v3 - cc.dpjf("dpmk", dpjk(int ), (int)28));
lbl18:
                    // 2 sources

                    switch ((int)v2 /* !! */ ) {
                        case -1311780319: {
                            v3 = cc.dpjf("dpml", dpjk(int ), (int)29);
                            continue block14;
                        }
                        case -996688147: {
                            v3 = cc.dpjf("dpmm", dpjk(int ), (int)30);
                            continue block14;
                        }
                        case 1117214818: {
                            break block14;
                        }
                    }
                    break;
                }
                var2_4 = cc.a;
                if (var4_2) {
                    throw null;
                }
                if (!var2_4 && !var2_4) ** GOTO lbl46
                block15: while (true) {
                    if (var3_3 /* !! */  == 0) return;
                    cfr_temp_0 = -2147483648;
lbl34:
                    // 2 sources

                    block16: while (true) {
                        switch (cfr_temp_0 == -2147483648 ? var3_3 /* !! */  : cfr_temp_0) {
                            default: {
                                return;
                            }
                            case 3: {
                                var3_3 /* !! */  = (int)cc.dpjf("dpmt", dpjc(int ), (int)55);
                                if (var4_2) {
                                    throw null;
                                }
                            }
                            case 0: {
                                ** break;
                            }
                            case 4: {
                                break block24;
                            }
lbl46:
                            // 1 sources

                            while (true) {
                                if ((v4 /* !! */  = (cfr_temp_3 = cc.im - cc.dpjf("dpmn", dpjk(int ), (int)31)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                                if (v4 /* !! */  == cc.dpjf("dpmo", dpjc(int ), (int)50)) {
                                    this.hand = var1_1;
                                    if (var2_4) continue block15;
                                    return;
                                }
                                v4 /* !! */  = (long)cc.dpjf("dpmp", dpjc(int ), (int)51);
                            }
lbl54:
                            // 2 sources

                            while (true) {
                                var3_3 /* !! */  = (int)cc.dpjf("dpmq", dpjc(int ), (int)52);
                                cfr_temp_0 = 1;
                                if (!var4_2) continue block16;
                                throw null;
                            }
                            case 1: {
                                var3_3 /* !! */  = (int)cc.dpjf("dpmr", dpjc(int ), (int)53);
                                if (var4_2) {
                                    throw null;
                                }
                            }
                            case 2: 
                        }
                        break;
                    }
                    break;
                }
                break block26;
                ** while (true)
            }
            var3_3 /* !! */  = (int)cc.dpjf("dpms", dpjc(int ), (int)54);
            if (var4_2) {
                throw null;
            }
        }
        var3_3 /* !! */  = (int)cc.dpjf("dpmu", dpjc(int ), (int)56);
        ** while (!var4_2)
lbl73:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void dpnm() {
        cc.dpjd[0] = -1734547291;
        cc.dpjd[1] = 1279370550;
        cc.dpjd[2] = 22055490;
        cc.dpjd[3] = 452508688;
        cc.dpjd[4] = 1914997035;
        cc.dpjd[5] = -1252295955;
        cc.dpjd[6] = -1353317964;
        cc.dpjd[7] = 266460632;
        cc.dpjd[8] = -1511930887;
        cc.dpjd[9] = -737937784;
        cc.dpjd[10] = 1045420783;
        cc.dpjd[11] = 1562659936;
        cc.dpjd[12] = -1418591616;
        cc.dpjd[13] = -1853370423;
        cc.dpjd[14] = -2113276455;
        cc.dpjd[15] = 1583738169;
        cc.dpjd[16] = 1347402428;
        cc.dpjd[17] = -377920051;
        cc.dpjd[18] = -2014816501;
        cc.dpjd[19] = 593035775;
        cc.dpjd[20] = 172326844;
        cc.dpjd[21] = 844535397;
        cc.dpjd[22] = -1286692717;
        cc.dpjd[23] = 483207857;
        cc.dpjd[24] = -756805904;
        cc.dpjd[25] = -1443896705;
        cc.dpjd[26] = -1649110893;
        cc.dpjd[27] = -599145489;
        cc.dpjd[28] = 380656594;
        cc.dpjd[29] = 2035026176;
        cc.dpjd[30] = 2109421786;
        cc.dpjd[31] = -459377831;
        cc.dpjd[32] = -1887429856;
        cc.dpjd[33] = 769187498;
        cc.dpjd[34] = -713582568;
        cc.dpjd[35] = -742526364;
        cc.dpjd[36] = 886551827;
        cc.dpjd[37] = 1796100990;
        cc.dpjd[38] = -258636086;
        cc.dpjd[39] = -1610121525;
        cc.dpjd[40] = 595861096;
        cc.dpjd[41] = 31121802;
        cc.dpjd[42] = -980797338;
        cc.dpjd[43] = -1286743652;
        cc.dpjd[44] = 246709763;
        cc.dpjd[45] = 1609881840;
        cc.dpjd[46] = -274361305;
        cc.dpjd[47] = 1820678562;
        cc.dpjd[48] = 161933055;
        cc.dpjd[49] = 1831112879;
        cc.dpjd[50] = -1337588801;
        cc.dpjd[51] = 1325001097;
        cc.dpjd[52] = 75394431;
        cc.dpjd[53] = -1068874020;
        cc.dpjd[54] = -60857180;
        cc.dpjd[55] = -2056432554;
        cc.dpjd[56] = -1961211283;
        cc.dpjd[57] = -2104497754;
        cc.dpjd[58] = -478818981;
        cc.dpjd[59] = -91506743;
        cc.dpjd[60] = 28546904;
        cc.dpjd[61] = 1339857757;
        cc.dpjd[62] = 1080713094;
        cc.dpjd[63] = 1772514356;
        cc.dpjd[64] = 206546889;
        cc.dpjd[65] = 1694725196;
        cc.dpjd[66] = 724878993;
        cc.dpjd[67] = 1257914250;
        cc.dpjd[68] = 1980329818;
        cc.dpjd[69] = 1686670399;
    }

    public static /* synthetic */ CallSite dpjf(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ int dpjc(int n2) {
        return dpjd[n2] ^ dpje[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public cc(class_4587 var1_1, class_1268 var2_2, float var3_3) {
        var5_4 /* !! */  = cc.b;
        if (var5_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                super();
                this.matrices = var1_1;
                this.hand = var2_2;
                this.swingProgress = var3_3;
                return;
            }
            case 0: {
                var5_4 /* !! */  = (int)cc.dpjf("dpjg", dpjc(int ), (int)0);
            }
lbl12:
            // 3 sources

            case 1: {
                var5_4 /* !! */  = (int)cc.dpjf("dpjh", dpjc(int ), (int)1);
                break;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_4 /* !! */  = (int)cc.dpjf("dpji", dpjc(int ), (int)2);
                    ** GOTO lbl12
                    break;
                }
            }
            case 3: 
        }
        var5_4 /* !! */  = (int)cc.dpjf("dpjj", dpjc(int ), (int)3);
        ** while (true)
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public float getSwingProgress() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = cc.im - cc.dpjf("dpkv", dpjk(int ), (int)14)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == cc.dpjf("dpkw", dpjc(int ), (int)24)) break;
            v0 /* !! */  = (long)cc.dpjf("dpkx", dpjc(int ), (int)25);
        }
        var3_1 = cc.c;
        while (true) {
            block22: {
                if ((v1 /* !! */  = (cfr_temp_1 = cc.im - cc.dpjf("dpky", dpjk(int ), (int)15)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v1 /* !! */  != cc.dpjf("dpkz", dpjc(int ), (int)26)) break block22;
                var2_2 /* !! */  = cc.b;
                if (var2_2 /* !! */  != 0) {
                    break;
                }
                ** GOTO lbl-1000
            }
            v1 /* !! */  = (long)cc.dpjf("dpla", dpjc(int ), (int)27);
        }
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v2 /* !! */  = cc.im;
                block13: while (true) {
                    switch ((int)v2 /* !! */ ) {
                        case -407795952: {
                            v3 = cc.dpjf("dplc", dpjk(int ), (int)17);
                            ** GOTO lbl27
                        }
                        case 860071508: {
                            v3 = cc.dpjf("dpld", dpjk(int ), (int)18);
lbl27:
                            // 2 sources

                            v2 /* !! */  = (long)(v3 - cc.dpjf("dplb", dpjk(int ), (int)16));
                            continue block13;
                        }
                        case 1117214818: {
                            break block13;
                        }
                    }
                    break;
                }
                var1_3 = cc.a;
                if (var3_1) {
                    throw null;
                }
                if (var1_3 != false) return (float)cc.dpjf("dplf", dple(int ), (int)28);
                if (var1_3 != false) return (float)cc.dpjf("dplf", dple(int ), (int)28);
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = cc.im - cc.dpjf("dplg", dpjk(int ), (int)19)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == cc.dpjf("dplh", dpjc(int ), (int)29)) {
                        return this.swingProgress;
                    }
                    v4 /* !! */  = (long)cc.dpjf("dpli", dpjc(int ), (int)30);
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)cc.dpjf("dpll", dpjc(int ), (int)33);
                if (var3_1) {
                    throw null;
                }
            }
            case 0: {
                ** GOTO lbl52
            }
            case 3: {
                var2_2 /* !! */  = (int)cc.dpjf("dplm", dpjc(int ), (int)34);
                if (var3_1) {
                    throw null;
                }
lbl52:
                // 3 sources

                var2_2 /* !! */  = (int)cc.dpjf("dplj", dpjc(int ), (int)31);
                if (var3_1) {
                    throw null;
                }
            }
            case 1: 
        }
        do {
            var2_2 /* !! */  = (int)cc.dpjf("dplk", dpjc(int ), (int)32);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ long dpjk(int n2) {
        return dpjl[n2] ^ dpjm[n2];
    }

    static {
        dpjd = new int[70];
        dpje = new int[70];
        cc.dpnm();
        cc.dpnn();
        dpjl = new long[36];
        dpjm = new long[36];
        cc.dpno();
        cc.dpnp();
    }

    private static /* synthetic */ void dpno() {
        cc.dpjl[0] = 7985213055266527547L;
        cc.dpjl[1] = 7293332552009591076L;
        cc.dpjl[2] = -4164801162177127182L;
        cc.dpjl[3] = -2480829889797036141L;
        cc.dpjl[4] = 2757956220135662621L;
        cc.dpjl[5] = -4533008872085428471L;
        cc.dpjl[6] = 4055105152070432792L;
        cc.dpjl[7] = -4830514925959072086L;
        cc.dpjl[8] = 1648308580912335338L;
        cc.dpjl[9] = -4872887984377779092L;
        cc.dpjl[10] = -3703583154100018589L;
        cc.dpjl[11] = -8871362615080502461L;
        cc.dpjl[12] = -2732828816354583857L;
        cc.dpjl[13] = -6997034325448595053L;
        cc.dpjl[14] = 3159630679828540522L;
        cc.dpjl[15] = -562797480812452630L;
        cc.dpjl[16] = 6405112999206302723L;
        cc.dpjl[17] = -338942694156988754L;
        cc.dpjl[18] = 6893470659798549261L;
        cc.dpjl[19] = -8138559079169349277L;
        cc.dpjl[20] = -931697741053196225L;
        cc.dpjl[21] = -8058440273021884639L;
        cc.dpjl[22] = -5549597077312087783L;
        cc.dpjl[23] = -8022794087365908348L;
        cc.dpjl[24] = 8958410221976383105L;
        cc.dpjl[25] = -76070800317208901L;
        cc.dpjl[26] = 8052036448253346659L;
        cc.dpjl[27] = -3854887949163105126L;
        cc.dpjl[28] = -147125572798961459L;
        cc.dpjl[29] = 2852634831111154212L;
        cc.dpjl[30] = 7529803435587361089L;
        cc.dpjl[31] = -6292640944158659304L;
        cc.dpjl[32] = 1220915421944810401L;
        cc.dpjl[33] = -488272266085120501L;
        cc.dpjl[34] = -3221650482460174102L;
        cc.dpjl[35] = 1254205291038517341L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void setMatrices(class_4587 var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = cc.im - cc.dpjf("dpln", dpjk(int ), (int)20)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == cc.dpjf("dplo", dpjc(int ), (int)35)) break;
            v0 /* !! */  = (long)cc.dpjf("dplp", dpjc(int ), (int)36);
        }
        var4_2 = cc.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = cc.im - cc.dpjf("dplq", dpjk(int ), (int)21)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == cc.dpjf("dplr", dpjc(int ), (int)37)) break;
            v1 /* !! */  = (long)cc.dpjf("dpls", dpjc(int ), (int)38);
        }
        var3_3 /* !! */  = cc.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = cc.im - cc.dpjf("dplt", dpjk(int ), (int)22)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == cc.dpjf("dplu", dpjc(int ), (int)39)) break;
            v2 /* !! */  = (long)cc.dpjf("dplv", dpjc(int ), (int)40);
        }
        var2_4 = cc.a;
        if (var4_2) {
            throw null;
lbl24:
            // 2 sources

            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl24
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v3 /* !! */  = cc.im;
                if (true) ** GOTO lbl34
                block16: while (true) {
                    v3 /* !! */  = (long)(v4 - cc.dpjf("dplw", dpjk(int ), (int)23));
lbl34:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1465404903: {
                            v4 = cc.dpjf("dplx", dpjk(int ), (int)24);
                            continue block16;
                        }
                        case -1210533990: {
                            v4 = cc.dpjf("dply", dpjk(int ), (int)25);
                            continue block16;
                        }
                        case 1117214818: {
                            break block16;
                        }
                    }
                    break;
                }
                this.matrices = var1_1;
                if (!var2_4) ** break;
                ** continue;
                return;
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)cc.dpjf("dplz", dpjc(int ), (int)41);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl58
                    break;
                }
            }
            case 1: {
                do {
                    var3_3 /* !! */  = (int)cc.dpjf("dpma", dpjc(int ), (int)42);
                } while (!var4_2);
                throw null;
            }
lbl58:
            // 3 sources

            case 2: {
                var3_3 /* !! */  = (int)cc.dpjf("dpmb", dpjc(int ), (int)43);
                if (var4_2) {
                    throw null;
                }
            }
            case 3: {
                var3_3 /* !! */  = (int)cc.dpjf("dpmc", dpjc(int ), (int)44);
                if (!var4_2) ** GOTO lbl58
                throw null;
            }
            case 4: 
        }
        var3_3 /* !! */  = (int)cc.dpjf("dpmd", dpjc(int ), (int)45);
        ** while (!var4_2)
lbl69:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void dpnn() {
        cc.dpje[0] = -1734547289;
        cc.dpje[1] = 1279370551;
        cc.dpje[2] = 22055488;
        cc.dpje[3] = 452508688;
        cc.dpje[4] = -1914997036;
        cc.dpje[5] = -906556922;
        cc.dpje[6] = -1353317963;
        cc.dpje[7] = 1203061314;
        cc.dpje[8] = -1511930888;
        cc.dpje[9] = -737937784;
        cc.dpje[10] = 1045420783;
        cc.dpje[11] = 1562659939;
        cc.dpje[12] = -1418591615;
        cc.dpje[13] = 1997336192;
        cc.dpje[14] = 2113276454;
        cc.dpje[15] = 154584165;
        cc.dpje[16] = 1347402429;
        cc.dpje[17] = 124824242;
        cc.dpje[18] = 2014816500;
        cc.dpje[19] = -967699915;
        cc.dpje[20] = 172326846;
        cc.dpje[21] = 844535398;
        cc.dpje[22] = -1286692719;
        cc.dpje[23] = 483207858;
        cc.dpje[24] = 756805903;
        cc.dpje[25] = 1383232998;
        cc.dpje[26] = 1649110892;
        cc.dpje[27] = 640419529;
        cc.dpje[28] = 715572498;
        cc.dpje[29] = 2035026177;
        cc.dpje[30] = 571812839;
        cc.dpje[31] = -459377831;
        cc.dpje[32] = -1887429856;
        cc.dpje[33] = 769187497;
        cc.dpje[34] = -713582565;
        cc.dpje[35] = 742526363;
        cc.dpje[36] = 1786238323;
        cc.dpje[37] = 1796100991;
        cc.dpje[38] = 1646657138;
        cc.dpje[39] = -1610121526;
        cc.dpje[40] = -2015583510;
        cc.dpje[41] = 31121802;
        cc.dpje[42] = -980797337;
        cc.dpje[43] = -1286743651;
        cc.dpje[44] = 246709763;
        cc.dpje[45] = 1609881844;
        cc.dpje[46] = -274361306;
        cc.dpje[47] = -877358534;
        cc.dpje[48] = 161933054;
        cc.dpje[49] = -309912462;
        cc.dpje[50] = -1337588802;
        cc.dpje[51] = 1076837884;
        cc.dpje[52] = 75394428;
        cc.dpje[53] = -1068874017;
        cc.dpje[54] = -60857177;
        cc.dpje[55] = -2056432553;
        cc.dpje[56] = -1961211283;
        cc.dpje[57] = -2104497753;
        cc.dpje[58] = 1876371894;
        cc.dpje[59] = -91506744;
        cc.dpje[60] = -1180304173;
        cc.dpje[61] = 1339857756;
        cc.dpje[62] = 1101583439;
        cc.dpje[63] = -1772514357;
        cc.dpje[64] = 1042971002;
        cc.dpje[65] = 1694725198;
        cc.dpje[66] = 724878997;
        cc.dpje[67] = 1257914251;
        cc.dpje[68] = 1980329816;
        cc.dpje[69] = 1686670395;
    }
}

