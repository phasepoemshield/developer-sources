/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import ruhack.phobia.az;

public abstract class ba
implements az {
    private static int[] dxxm;
    public static final boolean a;
    public static final long jq = -6659907875513149567L;
    private boolean stopped;
    private static long[] dxxs;
    public static final int b;
    public static final boolean c;
    private static long[] dxxt;
    private static int[] dxxl;

    private static /* synthetic */ void dxzf() {
        ba.dxxs[0] = 7622459422695610847L;
        ba.dxxs[1] = 5808034482508404997L;
        ba.dxxs[2] = -3581385716146943197L;
        ba.dxxs[3] = 7704553604983028567L;
        ba.dxxs[4] = -731262750472716269L;
        ba.dxxs[5] = -3291418450054207441L;
        ba.dxxs[6] = 3645563235740065309L;
        ba.dxxs[7] = 6564551979177172147L;
        ba.dxxs[8] = 7845471457902083880L;
        ba.dxxs[9] = 4209773351202155928L;
        ba.dxxs[10] = 8318747475775231410L;
        ba.dxxs[11] = 850990129709545003L;
        ba.dxxs[12] = 5412439769815980765L;
    }

    static {
        dxxl = new int[25];
        dxxm = new int[25];
        ba.dxzd();
        ba.dxze();
        dxxs = new long[13];
        dxxt = new long[13];
        ba.dxzf();
        ba.dxzg();
    }

    private static /* synthetic */ int dxxk(int n2) {
        return dxxl[n2] ^ dxxm[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void stop() {
        v0 /* !! */  = ba.jq;
        if (true) ** GOTO lbl5
        block12: while (true) {
            v0 /* !! */  = (long)(ba.dxxn("dxxv", dxxr(int ), (int)1) - ba.dxxn("dxxu", dxxr(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1957883387: {
                    continue block12;
                }
                case -1422502015: {
                    break block12;
                }
            }
            break;
        }
        var3_1 = ba.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = ba.jq - ba.dxxn("dxxw", dxxr(int ), (int)2)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == ba.dxxn("dxxx", dxxk(int ), (int)3)) break;
            v1 /* !! */  = (long)ba.dxxn("dxxy", dxxk(int ), (int)4);
        }
        var2_2 /* !! */  = ba.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = ba.jq - ba.dxxn("dxxz", dxxr(int ), (int)3)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == ba.dxxn("dxya", dxxk(int ), (int)5)) break;
            v2 /* !! */  = (long)ba.dxxn("dxyb", dxxk(int ), (int)6);
        }
        var1_3 = ba.a;
        if (var3_1) {
            throw null;
lbl25:
            // 2 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl25
        v3 = ba.dxxn("dxyc", dxxk(int ), (int)7);
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_2 = ba.jq - ba.dxxn("dxyd", dxxr(int ), (int)4)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == ba.dxxn("dxye", dxxk(int ), (int)8)) break;
            v4 /* !! */  = (long)ba.dxxn("dxyf", dxxk(int ), (int)9);
        }
        this.stopped = v3;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** continue;
                return;
            }
lbl40:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)ba.dxxn("dxyg", dxxk(int ), (int)10);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl50
            }
            case 1: {
                do {
                    var2_2 /* !! */  = (int)ba.dxxn("dxyh", dxxk(int ), (int)11);
                } while (!var3_1);
                throw null;
            }
lbl50:
            // 3 sources

            case 2: {
                var2_2 /* !! */  = (int)ba.dxxn("dxyi", dxxk(int ), (int)12);
                if (var3_1) {
                    throw null;
                }
            }
            case 3: {
                var2_2 /* !! */  = (int)ba.dxxn("dxyj", dxxk(int ), (int)13);
                if (!var3_1) ** GOTO lbl50
                throw null;
            }
            case 4: {
                var2_2 /* !! */  = (int)ba.dxxn("dxyk", dxxk(int ), (int)14);
                if (!var3_1) ** GOTO lbl40
                throw null;
            }
            case 5: 
        }
        do {
            var2_2 /* !! */  = (int)ba.dxxn("dxyl", dxxk(int ), (int)15);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ void dxze() {
        ba.dxxm[0] = -1721850575;
        ba.dxxm[1] = 1803085209;
        ba.dxxm[2] = 1761667236;
        ba.dxxm[3] = -1358789407;
        ba.dxxm[4] = 678543932;
        ba.dxxm[5] = 1430046463;
        ba.dxxm[6] = 164680870;
        ba.dxxm[7] = -268076806;
        ba.dxxm[8] = -762707414;
        ba.dxxm[9] = 57812929;
        ba.dxxm[10] = 2137695208;
        ba.dxxm[11] = -2001692574;
        ba.dxxm[12] = -485654103;
        ba.dxxm[13] = -532015662;
        ba.dxxm[14] = 756386440;
        ba.dxxm[15] = -112896316;
        ba.dxxm[16] = -586374232;
        ba.dxxm[17] = 1447562364;
        ba.dxxm[18] = -773593476;
        ba.dxxm[19] = -568211829;
        ba.dxxm[20] = 1716563789;
        ba.dxxm[21] = -803047701;
        ba.dxxm[22] = 1973274637;
        ba.dxxm[23] = 1520093703;
        ba.dxxm[24] = -1301157256;
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    protected ba() {
        block6: {
            int n2 = b;
            if (n2 == 0) return;
            switch (n2) {
                default: {
                    return;
                }
                case 0: {
                    break block6;
                }
                case 1: {
                    CallSite callSite = ba.dxxn("dxxp", dxxk(int ), (int)1);
                    break;
                }
                case 2: 
            }
            CallSite callSite = ba.dxxn("dxxq", dxxk(int ), (int)2);
        }
        while (true) {
            CallSite callSite = ba.dxxn("dxxo", dxxk(int ), (int)0);
        }
    }

    private static /* synthetic */ void dxzg() {
        ba.dxxt[0] = -6101505816675236478L;
        ba.dxxt[1] = -5480442905145590141L;
        ba.dxxt[2] = -2279284932811326446L;
        ba.dxxt[3] = -7867413276177966871L;
        ba.dxxt[4] = -7546205283818529430L;
        ba.dxxt[5] = 1487100048337995140L;
        ba.dxxt[6] = -6570950332396571405L;
        ba.dxxt[7] = 2794749179611839544L;
        ba.dxxt[8] = 2340734248773685454L;
        ba.dxxt[9] = 186164476677609565L;
        ba.dxxt[10] = 9189658773748711534L;
        ba.dxxt[11] = -1333009791730761922L;
        ba.dxxt[12] = -9180483201562902030L;
    }

    public static /* synthetic */ CallSite dxxn(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean isStopped() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ba.jq - ba.dxxn("dxym", dxxr(int ), (int)5)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ba.dxxn("dxyn", dxxk(int ), (int)16)) break;
            v0 /* !! */  = (long)ba.dxxn("dxyo", dxxk(int ), (int)17);
        }
        var3_1 = ba.c;
        v1 /* !! */  = ba.jq;
        if (true) ** GOTO lbl12
        block11: while (true) {
            v1 /* !! */  = (long)(v2 - ba.dxxn("dxyp", dxxr(int ), (int)6));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1561290049: {
                    v2 = ba.dxxn("dxyq", dxxr(int ), (int)7);
                    continue block11;
                }
                case -1422502015: {
                    break block11;
                }
                case -1381768287: {
                    v2 = ba.dxxn("dxyr", dxxr(int ), (int)8);
                    continue block11;
                }
            }
            break;
        }
        var2_2 = ba.b;
        v3 /* !! */  = ba.jq;
        if (true) ** GOTO lbl26
        block12: while (true) {
            v3 /* !! */  = (long)(v4 - ba.dxxn("dxys", dxxr(int ), (int)9));
lbl26:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1726937413: {
                    v4 = ba.dxxn("dxyt", dxxr(int ), (int)10);
                    continue block12;
                }
                case -1422502015: {
                    break block12;
                }
                case 2085128343: {
                    v4 = ba.dxxn("dxyu", dxxr(int ), (int)11);
                    continue block12;
                }
            }
            break;
        }
        var1_3 = ba.a;
        if (var3_1) {
            throw null;
lbl38:
            // 1 sources

            return (boolean)ba.dxxn("dxyv", dxxk(int ), (int)18);
        }
        ** while (var1_3 || var1_3)
lbl41:
        // 1 sources

        while (true) {
            if ((v5 /* !! */  = (cfr_temp_1 = ba.jq - ba.dxxn("dxyw", dxxr(int ), (int)12)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v5 /* !! */  == ba.dxxn("dxyx", dxxk(int ), (int)19)) break;
            v5 /* !! */  = (long)ba.dxxn("dxyy", dxxk(int ), (int)20);
        }
        return this.stopped;
    }

    private static /* synthetic */ void dxzd() {
        ba.dxxl[0] = -1721850576;
        ba.dxxl[1] = 1803085211;
        ba.dxxl[2] = 1761667237;
        ba.dxxl[3] = 1358789406;
        ba.dxxl[4] = 665552139;
        ba.dxxl[5] = -1430046464;
        ba.dxxl[6] = 2001974682;
        ba.dxxl[7] = -268076805;
        ba.dxxl[8] = 762707413;
        ba.dxxl[9] = 240681410;
        ba.dxxl[10] = 2137695212;
        ba.dxxl[11] = -2001692576;
        ba.dxxl[12] = -485654100;
        ba.dxxl[13] = -532015663;
        ba.dxxl[14] = 756386440;
        ba.dxxl[15] = -112896320;
        ba.dxxl[16] = 586374231;
        ba.dxxl[17] = -2043844483;
        ba.dxxl[18] = -773593475;
        ba.dxxl[19] = 568211828;
        ba.dxxl[20] = -1863409550;
        ba.dxxl[21] = -803047704;
        ba.dxxl[22] = 1973274638;
        ba.dxxl[23] = 1520093702;
        ba.dxxl[24] = -1301157253;
    }

    private static /* synthetic */ long dxxr(int n2) {
        return dxxs[n2] ^ dxxt[n2];
    }
}

