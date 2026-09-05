/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import ruhack.phobia.bc;

public class dd
extends bc {
    public static final boolean c;
    private static int[] byvr;
    private static int[] byvt;
    private float animation;
    public static final int b;
    private static long[] byvl;
    private static long[] byvk;
    public static final boolean a;
    protected static final long fc = -2687507088316804115L;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public float getAnimation() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = dd.fc - dd.byvn("byvo", byvh(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == dd.byvn("byvu", byvq(int ), (int)0)) break;
            v0 /* !! */  = (long)dd.byvn("byvw", byvq(int ), (int)1);
        }
        var3_1 = dd.c;
        v1 /* !! */  = dd.fc;
        if (true) ** GOTO lbl12
        block24: while (true) {
            v1 /* !! */  = (long)(v2 - dd.byvn("bywa", byvh(int ), (int)1));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -846703635: {
                    break block24;
                }
                case -265079948: {
                    v2 = dd.byvn("bywb", byvh(int ), (int)2);
                    continue block24;
                }
                case 450914444: {
                    v2 = dd.byvn("bywc", byvh(int ), (int)3);
                    continue block24;
                }
                case 1938597318: {
                    v2 = dd.byvn("bywd", byvh(int ), (int)4);
                    continue block24;
                }
            }
            break;
        }
        var2_2 /* !! */  = dd.b;
        v3 /* !! */  = dd.fc;
        if (true) ** GOTO lbl29
        block25: while (true) {
            v3 /* !! */  = (long)(v4 - dd.byvn("bywe", byvh(int ), (int)5));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1771996030: {
                    v4 = dd.byvn("bywf", byvh(int ), (int)6);
                    continue block25;
                }
                case -1556702572: {
                    v4 = dd.byvn("bywk", byvh(int ), (int)7);
                    continue block25;
                }
                case -846703635: {
                    break block25;
                }
                case 1501840672: {
                    v4 = dd.byvn("bywm", byvh(int ), (int)8);
                    continue block25;
                }
            }
            break;
        }
        var1_3 = dd.a;
        if (!var3_1) ** GOTO lbl48
        throw null;
        {
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var2_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return (float)dd.byvn("bywo", bywn(int ), (int)2);
                }
lbl48:
                // 1 sources

                if (var1_3 || var1_3) continue block26;
                v5 /* !! */  = dd.fc;
                if (true) ** GOTO lbl53
                block27: while (true) {
                    v5 /* !! */  = (long)(v6 - dd.byvn("bywq", byvh(int ), (int)9));
lbl53:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -846703635: {
                            break block27;
                        }
                        case 972238939: {
                            v6 = dd.byvn("byws", byvh(int ), (int)10);
                            continue block27;
                        }
                        case 2070829959: {
                            v6 = dd.byvn("bywt", byvh(int ), (int)11);
                            continue block27;
                        }
                    }
                    break;
                }
                return this.animation;
                case 0: lbl-1000:
                // 2 sources

                {
                    while (true) lbl-1000:
                    // 2 sources

                    {
                        var2_2 /* !! */  = (int)dd.byvn("bywx", byvq(int ), (int)3);
                        if (!var3_1) ** GOTO lbl-1000
                        throw null;
                    }
                }
                case 1: {
                    var2_2 /* !! */  = (int)dd.byvn("bywy", byvq(int ), (int)4);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 2: {
                    do {
                        var2_2 /* !! */  = (int)dd.byvn("bywz", byvq(int ), (int)5);
                    } while (!var3_1);
                    throw null;
                }
                case 3: 
            }
        }
        var2_2 /* !! */  = (int)dd.byvn("byxb", byvq(int ), (int)6);
        ** while (!var3_1)
lbl80:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void byyi() {
        dd.byvr[0] = -116781997;
        dd.byvr[1] = 1312323934;
        dd.byvr[2] = 407637930;
        dd.byvr[3] = -1783871438;
        dd.byvr[4] = 605818739;
        dd.byvr[5] = 431167277;
        dd.byvr[6] = -1338209950;
        dd.byvr[7] = -1881871966;
        dd.byvr[8] = 341310964;
        dd.byvr[9] = 1706602194;
        dd.byvr[10] = 1940927845;
        dd.byvr[11] = -614573894;
        dd.byvr[12] = 102614527;
        dd.byvr[13] = -676150547;
        dd.byvr[14] = 420817232;
        dd.byvr[15] = 1869145869;
        dd.byvr[16] = -1516245495;
        dd.byvr[17] = 500629300;
    }

    private static /* synthetic */ void byyn() {
        dd.byvt[0] = 116781996;
        dd.byvt[1] = -1459551516;
        dd.byvt[2] = 659842064;
        dd.byvt[3] = -1783871439;
        dd.byvt[4] = 605818736;
        dd.byvt[5] = 431167278;
        dd.byvt[6] = -1338209949;
        dd.byvt[7] = -1881871965;
        dd.byvt[8] = -1755811012;
        dd.byvt[9] = -1706602195;
        dd.byvt[10] = 339931555;
        dd.byvt[11] = 614573893;
        dd.byvt[12] = -864274148;
        dd.byvt[13] = -676150548;
        dd.byvt[14] = 420817236;
        dd.byvt[15] = 1869145870;
        dd.byvt[16] = -1516245494;
        dd.byvt[17] = 500629303;
    }

    private static /* synthetic */ int byvq(int n2) {
        return byvr[n2] ^ byvt[n2];
    }

    private static /* synthetic */ void byyu() {
        dd.byvl[0] = -7079667474595088064L;
        dd.byvl[1] = -8875323998422708693L;
        dd.byvl[2] = 8691768461498324863L;
        dd.byvl[3] = 5769086895633607175L;
        dd.byvl[4] = -6745647770719270990L;
        dd.byvl[5] = -8854427607567870805L;
        dd.byvl[6] = -6847685627420643448L;
        dd.byvl[7] = -7368519611658501641L;
        dd.byvl[8] = -7040707428725153345L;
        dd.byvl[9] = -4836619446638501933L;
        dd.byvl[10] = -5060930178673601401L;
        dd.byvl[11] = 3368455970712564710L;
        dd.byvl[12] = -3812899801325306751L;
        dd.byvl[13] = -1981509119780139523L;
        dd.byvl[14] = -2556647038541065621L;
        dd.byvl[15] = -6355015721714074400L;
        dd.byvl[16] = 5573033249986915720L;
        dd.byvl[17] = 8260410748905007459L;
        dd.byvl[18] = 3997938101506747518L;
    }

    public dd() {
    }

    private static /* synthetic */ float bywn(int n2) {
        return Float.intBitsToFloat(byvr[n2] ^ byvt[n2]);
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public void setAnimation(float var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_1 = dd.fc - dd.byvn("byxc", byvh(int ), (int)12)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == dd.byvn("byxd", byvq(int ), (int)7)) break;
            v0 /* !! */  = (long)dd.byvn("byxh", byvq(int ), (int)8);
        }
        var4_2 = dd.c;
        while (true) {
            block29: {
                if ((v1 /* !! */  = (cfr_temp_2 = dd.fc - dd.byvn("byxj", byvh(int ), (int)13)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v1 /* !! */  != dd.byvn("byxk", byvq(int ), (int)9)) break block29;
                var3_3 /* !! */  = dd.b;
                v2 /* !! */  = dd.fc;
                if (true) ** GOTO lbl18
            }
            v1 /* !! */  = (long)dd.byvn("byxl", byvq(int ), (int)10);
        }
        block15: while (true) {
            v2 /* !! */  = (long)(v3 - dd.byvn("byxm", byvh(int ), (int)14));
lbl18:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -2047570099: {
                    v3 = dd.byvn("byxo", byvh(int ), (int)15);
                    continue block15;
                }
                case -846703635: {
                    break block15;
                }
                case 207434302: {
                    v3 = dd.byvn("byxq", byvh(int ), (int)16);
                    continue block15;
                }
                case 466510830: {
                    v3 = dd.byvn("byxr", byvh(int ), (int)17);
                    continue block15;
                }
            }
            break;
        }
        var2_4 = dd.a;
        if (var4_2) {
            throw null;
        }
        if (var2_4 || var2_4) ** GOTO lbl49
        while (true) {
            block30: {
                if ((v4 /* !! */  = (cfr_temp_3 = dd.fc - dd.byvn("byxu", byvh(int ), (int)18)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v4 /* !! */  != dd.byvn("byxv", byvq(int ), (int)11)) break block30;
                this.animation = var1_1;
                if (var3_3 /* !! */  != 0) {
                    break;
                }
                ** GOTO lbl-1000
            }
            v4 /* !! */  = (long)dd.byvn("byxx", byvq(int ), (int)12);
        }
        cfr_temp_0 = -2147483648;
        while (true) {
            switch (cfr_temp_0 == -2147483648 ? var3_3 /* !! */  : cfr_temp_0) {
                default: lbl-1000:
                // 2 sources

                {
                    if (!var2_4) ** GOTO lbl50
lbl49:
                    // 2 sources

                    return;
lbl50:
                    // 1 sources

                    return;
                }
                case 0: {
                    ** GOTO lbl62
                }
                case 2: {
                    do {
                        var3_3 /* !! */  = (int)dd.byvn("byyc", byvq(int ), (int)15);
                    } while (!var4_2);
                    throw null;
                }
                case 4: {
                    var3_3 /* !! */  = (int)dd.byvn("byye", byvq(int ), (int)17);
                    if (var4_2) {
                        throw null;
                    }
lbl62:
                    // 3 sources

                    var3_3 /* !! */  = (int)dd.byvn("byxy", byvq(int ), (int)13);
                    if (var4_2) {
                        throw null;
                    }
                }
                case 1: {
                    var3_3 /* !! */  = (int)dd.byvn("byxz", byvq(int ), (int)14);
                    if (var4_2) {
                        throw null;
                    }
                }
                case 3: 
            }
            if (true) ** GOTO lbl73
            break;
        }
        do {
            if (true) ** continue;
lbl73:
            // 2 sources

            var3_3 /* !! */  = (int)dd.byvn("byyd", byvq(int ), (int)16);
            cfr_temp_0 = 1;
        } while (!var4_2);
        throw null;
    }

    private static /* synthetic */ void byyq() {
        dd.byvk[0] = -594405000945332367L;
        dd.byvk[1] = 6862018226410251155L;
        dd.byvk[2] = 6575781398146217281L;
        dd.byvk[3] = -1966862941641893567L;
        dd.byvk[4] = 926493478221168786L;
        dd.byvk[5] = -6324349580012461326L;
        dd.byvk[6] = -5180116789593990637L;
        dd.byvk[7] = 5908231952354631494L;
        dd.byvk[8] = 7634244227065386971L;
        dd.byvk[9] = 3972572622926154713L;
        dd.byvk[10] = 7245964935583253256L;
        dd.byvk[11] = 8200213771477794461L;
        dd.byvk[12] = 1063169473731112103L;
        dd.byvk[13] = -3502488768543824175L;
        dd.byvk[14] = 5130811822313681893L;
        dd.byvk[15] = -7202732460330314492L;
        dd.byvk[16] = 472558575514199855L;
        dd.byvk[17] = 424513989535220802L;
        dd.byvk[18] = -3002204397534132473L;
    }

    public static /* synthetic */ CallSite byvn(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    static {
        byvr = new int[18];
        byvt = new int[18];
        dd.byyi();
        dd.byyn();
        byvk = new long[19];
        byvl = new long[19];
        dd.byyq();
        dd.byyu();
    }

    private static /* synthetic */ long byvh(int n2) {
        return byvk[n2] ^ byvl[n2];
    }
}

