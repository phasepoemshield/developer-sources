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

public class dh
implements az {
    private static long[] byer;
    public static final boolean c;
    public static final boolean a;
    private static final dh INSTANCE;
    private static int[] byey;
    private static long[] byeq;
    public static final int b;
    private static int[] byez;
    public static final long ev = 8298500356493782885L;

    private static /* synthetic */ long byep(int n2) {
        return byeq[n2] ^ byer[n2];
    }

    public dh() {
    }

    private static /* synthetic */ int byex(int n2) {
        return byey[n2] ^ byez[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static dh get() {
        v0 /* !! */  = dh.ev;
        if (true) ** GOTO lbl5
        block17: while (true) {
            v0 /* !! */  = (long)(v1 - dh.byes("byet", byep(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -59409328: {
                    v1 = dh.byes("byeu", byep(int ), (int)1);
                    continue block17;
                }
                case 9685535: {
                    v1 = dh.byes("byev", byep(int ), (int)2);
                    continue block17;
                }
                case 1564716901: {
                    break block17;
                }
            }
            break;
        }
        var2 = dh.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = dh.ev - dh.byes("byew", byep(int ), (int)3)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == dh.byes("byfa", byex(int ), (int)0)) break;
            v2 /* !! */  = (long)dh.byes("byfb", byex(int ), (int)1);
        }
        var1_1 /* !! */  = dh.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = dh.ev - dh.byes("byfc", byep(int ), (int)4)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == dh.byes("byfd", byex(int ), (int)2)) break;
            v3 /* !! */  = (long)dh.byes("byfe", byex(int ), (int)3);
        }
        var0_2 = dh.a;
        if (var2) {
            throw null;
lbl31:
            // 2 sources

            return null;
        }
        if (var0_2) ** GOTO lbl31
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var0_2) ** continue;
                v4 /* !! */  = dh.ev;
                if (true) ** GOTO lbl42
                block21: while (true) {
                    v4 /* !! */  = (long)(v5 - dh.byes("byff", byep(int ), (int)5));
lbl42:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -2044065233: {
                            v5 = dh.byes("byfg", byep(int ), (int)6);
                            continue block21;
                        }
                        case 6166332: {
                            v5 = dh.byes("byfh", byep(int ), (int)7);
                            continue block21;
                        }
                        case 1564716901: {
                            break block21;
                        }
                        case 1654647796: {
                            v5 = dh.byes("byfi", byep(int ), (int)8);
                            continue block21;
                        }
                    }
                    break;
                }
                return dh.INSTANCE;
            }
            case 0: {
                do {
                    var1_1 /* !! */  = (int)dh.byes("byfj", byex(int ), (int)4);
                } while (!var2);
                throw null;
            }
            case 1: {
                do {
                    var1_1 /* !! */  = (int)dh.byes("byfk", byex(int ), (int)5);
                } while (!var2);
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var1_1 /* !! */  = (int)dh.byes("byfl", byex(int ), (int)6);
                    if (!var2) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 3: 
        }
        var1_1 /* !! */  = (int)dh.byes("byfm", byex(int ), (int)7);
        ** while (!var2)
lbl73:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void byfo() {
        dh.byez[0] = -886544298;
        dh.byez[1] = -333730319;
        dh.byez[2] = -712693922;
        dh.byez[3] = 556408173;
        dh.byez[4] = 20694887;
        dh.byez[5] = -467715118;
        dh.byez[6] = -1709596746;
        dh.byez[7] = -696147341;
    }

    private static /* synthetic */ void byfq() {
        dh.byer[0] = -7086277411756791872L;
        dh.byer[1] = -5435000871348656590L;
        dh.byer[2] = -3688289826476986108L;
        dh.byer[3] = -7373129178835936535L;
        dh.byer[4] = 6012030853472741071L;
        dh.byer[5] = 8280404790614289848L;
        dh.byer[6] = -2350090558614670902L;
        dh.byer[7] = -7348180520033458458L;
        dh.byer[8] = -6594472895675336482L;
    }

    private static /* synthetic */ void byfn() {
        dh.byey[0] = -886544297;
        dh.byey[1] = -140753901;
        dh.byey[2] = -712693921;
        dh.byey[3] = 994200456;
        dh.byey[4] = 20694884;
        dh.byey[5] = -467715118;
        dh.byey[6] = -1709596746;
        dh.byey[7] = -696147341;
    }

    static {
        byey = new int[8];
        byez = new int[8];
        dh.byfn();
        dh.byfo();
        byeq = new long[9];
        byer = new long[9];
        dh.byfp();
        dh.byfq();
        INSTANCE = new dh();
    }

    private static /* synthetic */ void byfp() {
        dh.byeq[0] = 5658128965828238577L;
        dh.byeq[1] = 3815292040014842294L;
        dh.byeq[2] = 1632870070211205493L;
        dh.byeq[3] = 6035132435427389198L;
        dh.byeq[4] = 4212943477428561262L;
        dh.byeq[5] = -8104447529207213070L;
        dh.byeq[6] = -2983170622175158366L;
        dh.byeq[7] = -1134579708279082460L;
        dh.byeq[8] = 5274333420762396774L;
    }

    public static /* synthetic */ CallSite byes(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }
}

