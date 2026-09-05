/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

public final class oh$ProxyType
extends Enum<oh$ProxyType> {
    private static long[] jyz;
    private static final /* synthetic */ oh$ProxyType[] $VALUES;
    private static int[] jzi;
    public static final boolean a;
    public static final /* enum */ oh$ProxyType SOCKS5;
    private static final long aq = 5823386997547180199L;
    public static final /* enum */ oh$ProxyType SOCKS4;
    public static final boolean c;
    private static long[] jzb;
    public static final int b;
    private static int[] jzk;

    private static /* synthetic */ void kdm() {
        oh$ProxyType.jzk[0] = -899186774;
        oh$ProxyType.jzk[1] = -1845618658;
        oh$ProxyType.jzk[2] = -1649862138;
        oh$ProxyType.jzk[3] = -1682228639;
        oh$ProxyType.jzk[4] = 1986138381;
        oh$ProxyType.jzk[5] = -317621329;
        oh$ProxyType.jzk[6] = -975932844;
        oh$ProxyType.jzk[7] = 2075015123;
        oh$ProxyType.jzk[8] = -1852106125;
        oh$ProxyType.jzk[9] = 2078333579;
        oh$ProxyType.jzk[10] = -557494659;
        oh$ProxyType.jzk[11] = -171927856;
        oh$ProxyType.jzk[12] = -359131105;
        oh$ProxyType.jzk[13] = -1416114034;
        oh$ProxyType.jzk[14] = 1270473000;
        oh$ProxyType.jzk[15] = -892964303;
        oh$ProxyType.jzk[16] = -563581199;
        oh$ProxyType.jzk[17] = -170489087;
        oh$ProxyType.jzk[18] = -1136341228;
        oh$ProxyType.jzk[19] = -1237132663;
        oh$ProxyType.jzk[20] = 1367396286;
        oh$ProxyType.jzk[21] = 1730827717;
        oh$ProxyType.jzk[22] = -1028818712;
        oh$ProxyType.jzk[23] = 1551026672;
        oh$ProxyType.jzk[24] = 1230581145;
        oh$ProxyType.jzk[25] = -1159797624;
        oh$ProxyType.jzk[26] = -158389803;
        oh$ProxyType.jzk[27] = 1529262034;
        oh$ProxyType.jzk[28] = 81297517;
        oh$ProxyType.jzk[29] = 679242218;
        oh$ProxyType.jzk[30] = -1546680127;
        oh$ProxyType.jzk[31] = -2040082046;
        oh$ProxyType.jzk[32] = 2103504783;
        oh$ProxyType.jzk[33] = -1501114429;
        oh$ProxyType.jzk[34] = -1210053504;
        oh$ProxyType.jzk[35] = 1001740099;
        oh$ProxyType.jzk[36] = 1182123372;
    }

    private static /* synthetic */ int jzg(int n2) {
        return jzi[n2] ^ jzk[n2];
    }

    static {
        jzi = new int[37];
        jzk = new int[37];
        oh$ProxyType.kdi();
        oh$ProxyType.kdm();
        jyz = new long[23];
        jzb = new long[23];
        oh$ProxyType.kdp();
        oh$ProxyType.kds();
        SOCKS4 = new oh$ProxyType();
        SOCKS5 = new oh$ProxyType();
        $VALUES = oh$ProxyType.$values();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private oh$ProxyType() {
        var4_3 /* !! */  = oh$ProxyType.b;
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                var3_4 = oh$ProxyType.a;
                super(var1_1, var2_2);
                return;
            }
            case 0: {
                while (true) {
                    var4_3 /* !! */  = (int)oh$ProxyType.jzd("kbu", jzg(int ), (int)22);
                }
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_3 /* !! */  = (int)oh$ProxyType.jzd("kbw", jzg(int ), (int)23);
                    continue;
                    break;
                }
            }
            case 2: 
        }
        var4_3 /* !! */  = (int)oh$ProxyType.jzd("kbx", jzg(int ), (int)24);
        ** while (true)
    }

    private static /* synthetic */ void kdi() {
        oh$ProxyType.jzi[0] = -899186773;
        oh$ProxyType.jzi[1] = 311217227;
        oh$ProxyType.jzi[2] = 1649862137;
        oh$ProxyType.jzi[3] = 841282717;
        oh$ProxyType.jzi[4] = 1986138380;
        oh$ProxyType.jzi[5] = 1593334493;
        oh$ProxyType.jzi[6] = 975932843;
        oh$ProxyType.jzi[7] = 883271696;
        oh$ProxyType.jzi[8] = -1852106125;
        oh$ProxyType.jzi[9] = 2078333577;
        oh$ProxyType.jzi[10] = -557494658;
        oh$ProxyType.jzi[11] = -171927855;
        oh$ProxyType.jzi[12] = -359131106;
        oh$ProxyType.jzi[13] = -1468634225;
        oh$ProxyType.jzi[14] = 1270473001;
        oh$ProxyType.jzi[15] = 1866620942;
        oh$ProxyType.jzi[16] = -563581200;
        oh$ProxyType.jzi[17] = 338666762;
        oh$ProxyType.jzi[18] = -1136341225;
        oh$ProxyType.jzi[19] = -1237132661;
        oh$ProxyType.jzi[20] = 1367396287;
        oh$ProxyType.jzi[21] = 1730827717;
        oh$ProxyType.jzi[22] = -1028818710;
        oh$ProxyType.jzi[23] = 1551026674;
        oh$ProxyType.jzi[24] = 1230581144;
        oh$ProxyType.jzi[25] = -1159797623;
        oh$ProxyType.jzi[26] = 1822670215;
        oh$ProxyType.jzi[27] = -1529262035;
        oh$ProxyType.jzi[28] = 29636505;
        oh$ProxyType.jzi[29] = 679242218;
        oh$ProxyType.jzi[30] = -1546680128;
        oh$ProxyType.jzi[31] = -2040082045;
        oh$ProxyType.jzi[32] = 2103504783;
        oh$ProxyType.jzi[33] = -1501114430;
        oh$ProxyType.jzi[34] = -1210053501;
        oh$ProxyType.jzi[35] = 1001740099;
        oh$ProxyType.jzi[36] = 1182123373;
    }

    private static /* synthetic */ void kdp() {
        oh$ProxyType.jyz[0] = 2124195926422938237L;
        oh$ProxyType.jyz[1] = 4696460884088974834L;
        oh$ProxyType.jyz[2] = -1090109412863331647L;
        oh$ProxyType.jyz[3] = -4380439365552955382L;
        oh$ProxyType.jyz[4] = 3448453383022201979L;
        oh$ProxyType.jyz[5] = 491094185151405908L;
        oh$ProxyType.jyz[6] = -7730872663082230351L;
        oh$ProxyType.jyz[7] = -1013403276025514803L;
        oh$ProxyType.jyz[8] = -8184973627673909604L;
        oh$ProxyType.jyz[9] = -1394364984967543359L;
        oh$ProxyType.jyz[10] = 7275786622127517640L;
        oh$ProxyType.jyz[11] = -220482825615366715L;
        oh$ProxyType.jyz[12] = 8260118204741939970L;
        oh$ProxyType.jyz[13] = -7365351365095511952L;
        oh$ProxyType.jyz[14] = -2077219723038216711L;
        oh$ProxyType.jyz[15] = -5336579454320826714L;
        oh$ProxyType.jyz[16] = 2293518351006897195L;
        oh$ProxyType.jyz[17] = 118059745281585449L;
        oh$ProxyType.jyz[18] = 7518835356029903007L;
        oh$ProxyType.jyz[19] = -5923381234426651285L;
        oh$ProxyType.jyz[20] = -2839000238085568723L;
        oh$ProxyType.jyz[21] = 1343488773457289465L;
        oh$ProxyType.jyz[22] = -2538710280534845618L;
    }

    private static /* synthetic */ long jyx(int n2) {
        return jyz[n2] ^ jzb[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static oh$ProxyType[] values() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = oh$ProxyType.aq - oh$ProxyType.jzd("jzf", jyx(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == oh$ProxyType.jzd("jzl", jzg(int ), (int)0)) break;
            v0 /* !! */  = (long)oh$ProxyType.jzd("jzm", jzg(int ), (int)1);
        }
        var2 = oh$ProxyType.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = oh$ProxyType.aq - oh$ProxyType.jzd("jzo", jyx(int ), (int)1)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == oh$ProxyType.jzd("jzq", jzg(int ), (int)2)) break;
            v1 /* !! */  = (long)oh$ProxyType.jzd("jzs", jzg(int ), (int)3);
        }
        var1_1 /* !! */  = oh$ProxyType.b;
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v2 /* !! */  = oh$ProxyType.aq;
                if (true) ** GOTO lbl22
                block13: while (true) {
                    v2 /* !! */  = (long)(v3 - oh$ProxyType.jzd("jzu", jyx(int ), (int)2));
lbl22:
                    // 2 sources

                    switch ((int)v2 /* !! */ ) {
                        case -1796953045: {
                            v3 = oh$ProxyType.jzd("jzw", jyx(int ), (int)3);
                            continue block13;
                        }
                        case -496131929: {
                            break block13;
                        }
                        case -435369121: {
                            v3 = oh$ProxyType.jzd("jzy", jyx(int ), (int)4);
                            continue block13;
                        }
                    }
                    break;
                }
                var0_2 = oh$ProxyType.a;
                if (var2) {
                    throw null;
                    return null;
                }
                if (var0_2 || var0_2) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = oh$ProxyType.aq - oh$ProxyType.jzd("kac", jyx(int ), (int)5)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == oh$ProxyType.jzd("kad", jzg(int ), (int)4)) break;
                    v4 /* !! */  = (long)oh$ProxyType.jzd("kaf", jzg(int ), (int)5);
                }
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_3 = oh$ProxyType.aq - oh$ProxyType.jzd("kah", jyx(int ), (int)6)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == oh$ProxyType.jzd("kaj", jzg(int ), (int)6)) break;
                    v5 /* !! */  = (long)oh$ProxyType.jzd("kal", jzg(int ), (int)7);
                }
                return (oh$ProxyType[])oh$ProxyType.$VALUES.clone();
            }
            case 0: {
                var1_1 /* !! */  = (int)oh$ProxyType.jzd("kan", jzg(int ), (int)8);
                if (var2) {
                    throw null;
                }
            }
lbl54:
            // 4 sources

            case 1: {
                var1_1 /* !! */  = (int)oh$ProxyType.jzd("kap", jzg(int ), (int)9);
                if (!var2) break;
                throw null;
            }
            case 2: {
                var1_1 /* !! */  = (int)oh$ProxyType.jzd("kar", jzg(int ), (int)10);
                if (!var2) ** GOTO lbl54
                throw null;
            }
            case 3: 
        }
        do {
            var1_1 /* !! */  = (int)oh$ProxyType.jzd("kat", jzg(int ), (int)11);
        } while (!var2);
        throw null;
    }

    private static /* synthetic */ void kds() {
        oh$ProxyType.jzb[0] = 2497574571782747872L;
        oh$ProxyType.jzb[1] = 3214202003935345082L;
        oh$ProxyType.jzb[2] = 4020318491524079926L;
        oh$ProxyType.jzb[3] = -7327979473145597340L;
        oh$ProxyType.jzb[4] = -8140315138201638239L;
        oh$ProxyType.jzb[5] = -8199304681793299832L;
        oh$ProxyType.jzb[6] = -855662926648738596L;
        oh$ProxyType.jzb[7] = 3583654873130464917L;
        oh$ProxyType.jzb[8] = -3966745792048703550L;
        oh$ProxyType.jzb[9] = 8518281313863972306L;
        oh$ProxyType.jzb[10] = -364982875418857369L;
        oh$ProxyType.jzb[11] = -3377271734111615496L;
        oh$ProxyType.jzb[12] = 2291059528305265632L;
        oh$ProxyType.jzb[13] = -1949266006230602949L;
        oh$ProxyType.jzb[14] = 6518125258979115349L;
        oh$ProxyType.jzb[15] = 1207918929104108363L;
        oh$ProxyType.jzb[16] = 7812658784236062978L;
        oh$ProxyType.jzb[17] = -3718276674203109891L;
        oh$ProxyType.jzb[18] = -2821172939419541702L;
        oh$ProxyType.jzb[19] = 3251662649946259931L;
        oh$ProxyType.jzb[20] = 434125336373922140L;
        oh$ProxyType.jzb[21] = -547271600078004197L;
        oh$ProxyType.jzb[22] = -735701865004268085L;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static oh$ProxyType valueOf(String string) {
        while (true) {
            long l2;
            Object object;
            if ((object = (l2 = aq - oh$ProxyType.jzd("kav", jyx(int ), (int)7)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object == oh$ProxyType.jzd("kax", jzg(int ), (int)12)) break;
            object = oh$ProxyType.jzd("kay", jzg(int ), (int)13);
        }
        boolean bl2 = c;
        while (true) {
            long l3;
            Object object;
            if ((object = (l3 = aq - oh$ProxyType.jzd("kba", jyx(int ), (int)8)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object == oh$ProxyType.jzd("kbb", jzg(int ), (int)14)) break;
            object = oh$ProxyType.jzd("kbc", jzg(int ), (int)15);
        }
        int n2 = b;
        Object object = aq;
        block6: while (true) {
            switch ((int)object) {
                case -496131929: {
                    break block6;
                }
                case 1068122861: {
                    object = oh$ProxyType.jzd("kbg", jyx(int ), (int)10) - oh$ProxyType.jzd("kbe", jyx(int ), (int)9);
                    continue block6;
                }
            }
            break;
        }
        boolean bl3 = a;
        if (bl2) {
            throw null;
        }
        if (bl3) return null;
        if (bl3) return null;
        while (true) {
            long l4;
            Object object2;
            if ((object2 = (l4 = aq - oh$ProxyType.jzd("kbj", jyx(int ), (int)11)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            if (object2 == oh$ProxyType.jzd("kbl", jzg(int ), (int)16)) {
                return Enum.valueOf(oh$ProxyType.class, string);
            }
            object2 = oh$ProxyType.jzd("kbn", jzg(int ), (int)17);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ oh$ProxyType[] $values() {
        v0 /* !! */  = oh$ProxyType.aq;
        if (true) ** GOTO lbl5
        block21: while (true) {
            v0 /* !! */  = (long)(v1 - oh$ProxyType.jzd("kbz", jyx(int ), (int)12));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -679045733: {
                    v1 = oh$ProxyType.jzd("kcb", jyx(int ), (int)13);
                    continue block21;
                }
                case -496131929: {
                    break block21;
                }
                case 2056095658: {
                    v1 = oh$ProxyType.jzd("kcc", jyx(int ), (int)14);
                    continue block21;
                }
            }
            break;
        }
        var2 = oh$ProxyType.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = oh$ProxyType.aq - oh$ProxyType.jzd("kce", jyx(int ), (int)15)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == oh$ProxyType.jzd("kcf", jzg(int ), (int)25)) break;
            v2 /* !! */  = (long)oh$ProxyType.jzd("kcg", jzg(int ), (int)26);
        }
        var1_1 /* !! */  = oh$ProxyType.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = oh$ProxyType.aq - oh$ProxyType.jzd("kch", jyx(int ), (int)16)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == oh$ProxyType.jzd("kcj", jzg(int ), (int)27)) {
                var0_2 = oh$ProxyType.a;
                if (var2) {
                    throw null;
                }
                break;
            }
            v3 /* !! */  = (long)oh$ProxyType.jzd("kck", jzg(int ), (int)28);
        }
        if (var0_2 || var0_2) {
            return null;
        }
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v4 = new oh$ProxyType[2];
                v5 = oh$ProxyType.jzd("kcm", jzg(int ), (int)29);
                v6 /* !! */  = oh$ProxyType.aq;
                block24: while (true) {
                    switch ((int)v6 /* !! */ ) {
                        case -705761142: {
                            v6 /* !! */  = (long)(oh$ProxyType.jzd("kco", jyx(int ), (int)18) - oh$ProxyType.jzd("kcn", jyx(int ), (int)17));
                            continue block24;
                        }
                        case -496131929: {
                            break block24;
                        }
                    }
                    break;
                }
                v4[v5] = oh$ProxyType.SOCKS4;
                v7 = oh$ProxyType.jzd("kcq", jzg(int ), (int)30);
                v8 /* !! */  = oh$ProxyType.aq;
                block25: while (true) {
                    switch ((int)v8 /* !! */ ) {
                        case -496131929: {
                            break block25;
                        }
                        case -168695184: {
                            v9 = oh$ProxyType.jzd("kct", jyx(int ), (int)20);
                            ** GOTO lbl60
                        }
                        case 1169053197: {
                            v9 = oh$ProxyType.jzd("kcv", jyx(int ), (int)21);
                            ** GOTO lbl60
                        }
                        case 1951123295: {
                            v9 = oh$ProxyType.jzd("kcw", jyx(int ), (int)22);
lbl60:
                            // 3 sources

                            v8 /* !! */  = (long)(v9 - oh$ProxyType.jzd("kcs", jyx(int ), (int)19));
                            continue block25;
                        }
                    }
                    break;
                }
                v4[v7] = oh$ProxyType.SOCKS5;
                return v4;
            }
            case 0: {
                var1_1 /* !! */  = (int)oh$ProxyType.jzd("kcy", jzg(int ), (int)31);
                if (var2) {
                    throw null;
                }
            }
            case 1: {
                ** GOTO lbl74
            }
            case 3: {
                var1_1 /* !! */  = (int)oh$ProxyType.jzd("kdd", jzg(int ), (int)34);
                if (var2) {
                    throw null;
                }
lbl74:
                // 3 sources

                var1_1 /* !! */  = (int)oh$ProxyType.jzd("kcz", jzg(int ), (int)32);
                if (var2) {
                    throw null;
                }
            }
            case 2: 
        }
        do {
            var1_1 /* !! */  = (int)oh$ProxyType.jzd("kdb", jzg(int ), (int)33);
        } while (!var2);
        throw null;
    }

    public static /* synthetic */ CallSite jzd(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }
}

