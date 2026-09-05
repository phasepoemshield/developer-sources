/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import ruhack.phobia.ds;
import ruhack.phobia.du;
import ruhack.phobia.nj;

public final class hq
extends ds {
    public static final boolean a;
    private static int[] byjp;
    public static final boolean c;
    public static final int b;
    private static int[] byjq;
    private static long[] byjw;
    private static long[] byjx;
    private static final long ez = -5818510224561464963L;

    private static /* synthetic */ void byko() {
        hq.byjq[0] = -1995022294;
        hq.byjq[1] = 1858380604;
        hq.byjq[2] = -916153146;
        hq.byjq[3] = 17709039;
        hq.byjq[4] = 1312097139;
        hq.byjq[5] = -421045699;
        hq.byjq[6] = 1177591112;
        hq.byjq[7] = 1129770098;
        hq.byjq[8] = 462811830;
        hq.byjq[9] = -1097699774;
        hq.byjq[10] = -560788590;
    }

    private static /* synthetic */ void bykn() {
        hq.byjp[0] = -1995022294;
        hq.byjp[1] = 1858380606;
        hq.byjp[2] = -916153148;
        hq.byjp[3] = -17709040;
        hq.byjp[4] = -228401757;
        hq.byjp[5] = 421045698;
        hq.byjp[6] = -1767850953;
        hq.byjp[7] = 1129770099;
        hq.byjp[8] = 462811831;
        hq.byjp[9] = -1097699773;
        hq.byjp[10] = -560788592;
    }

    private static /* synthetic */ int byjo(int n2) {
        return byjp[n2] ^ byjq[n2];
    }

    public static /* synthetic */ CallSite byjr(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void bykq() {
        hq.byjx[0] = 8234431393004398807L;
        hq.byjx[1] = -7425037112801682812L;
        hq.byjx[2] = 7732534840184477638L;
        hq.byjx[3] = -8390936470294605153L;
        hq.byjx[4] = 6972691582293355599L;
        hq.byjx[5] = -8724045066593280513L;
        hq.byjx[6] = 203547772406951093L;
    }

    private static /* synthetic */ void bykp() {
        hq.byjw[0] = 3944316460072811014L;
        hq.byjw[1] = 342745350935767842L;
        hq.byjw[2] = -7341149276777028308L;
        hq.byjw[3] = 6670676862960607134L;
        hq.byjw[4] = 7154946087603151295L;
        hq.byjw[5] = 7248701753448908782L;
        hq.byjw[6] = -3591166751471568338L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static hq getInstance() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = hq.ez - hq.byjr("byjy", byjv(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == hq.byjr("byjz", byjo(int ), (int)3)) break;
            v0 /* !! */  = (long)hq.byjr("byka", byjo(int ), (int)4);
        }
        var2 = hq.c;
        v1 /* !! */  = hq.ez;
        if (true) ** GOTO lbl12
        block16: while (true) {
            v1 /* !! */  = (long)(hq.byjr("bykc", byjv(int ), (int)2) - hq.byjr("bykb", byjv(int ), (int)1));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 1325996413: {
                    break block16;
                }
                case 1809403054: {
                    continue block16;
                }
            }
            break;
        }
        var1_1 /* !! */  = hq.b;
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v2 /* !! */  = hq.ez;
                if (true) ** GOTO lbl25
                block17: while (true) {
                    v2 /* !! */  = (long)(v3 - hq.byjr("bykd", byjv(int ), (int)3));
lbl25:
                    // 2 sources

                    switch ((int)v2 /* !! */ ) {
                        case -476652034: {
                            v3 = hq.byjr("byke", byjv(int ), (int)4);
                            continue block17;
                        }
                        case -463457493: {
                            v3 = hq.byjr("bykf", byjv(int ), (int)5);
                            continue block17;
                        }
                        case 1325996413: {
                            break block17;
                        }
                    }
                    break;
                }
                var0_2 = hq.a;
                if (var2) {
                    throw null;
                    return null;
                }
                if (var0_2 || var0_2) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_1 = hq.ez - hq.byjr("bykg", byjv(int ), (int)6)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == hq.byjr("bykh", byjo(int ), (int)5)) break;
                    v4 /* !! */  = (long)hq.byjr("byki", byjo(int ), (int)6);
                }
                return nj.get(hq.class);
            }
            case 0: {
                var1_1 /* !! */  = (int)hq.byjr("bykj", byjo(int ), (int)7);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl57
            }
lbl52:
            // 2 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var1_1 /* !! */  = (int)hq.byjr("bykk", byjo(int ), (int)8);
                    if (!var2) ** GOTO lbl-1000
                    throw null;
                }
            }
lbl57:
            // 2 sources

            case 2: {
                var1_1 /* !! */  = (int)hq.byjr("bykl", byjo(int ), (int)9);
                if (!var2) ** GOTO lbl52
                throw null;
            }
            case 3: 
        }
        var1_1 /* !! */  = (int)hq.byjr("bykm", byjo(int ), (int)10);
        ** while (!var2)
lbl64:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public hq() {
        var2_1 /* !! */  = hq.b;
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                super("NoServerDesync", "\u041d\u0435 \u043f\u043e\u0437\u0432\u043e\u043b\u044f\u0435\u0442 \u0441\u0435\u0440\u0432\u0435\u0440\u0443 \u043f\u0440\u0438\u043d\u0443\u0434\u0438\u0442\u0435\u043b\u044c\u043d\u043e \u043f\u043e\u0432\u043e\u0440\u0430\u0447\u0438\u0432\u0430\u0442\u044c \u043a\u0430\u043c\u0435\u0440\u0443", du.RAGE);
                return;
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)hq.byjr("byjs", byjo(int ), (int)0);
                    continue;
                    break;
                }
            }
            case 1: {
                while (true) {
                    var2_1 /* !! */  = (int)hq.byjr("byjt", byjo(int ), (int)1);
                }
            }
            case 2: 
        }
        var2_1 /* !! */  = (int)hq.byjr("byju", byjo(int ), (int)2);
        ** while (true)
    }

    private static /* synthetic */ long byjv(int n2) {
        return byjw[n2] ^ byjx[n2];
    }

    static {
        byjp = new int[11];
        byjq = new int[11];
        hq.bykn();
        hq.byko();
        byjw = new long[7];
        byjx = new long[7];
        hq.bykp();
        hq.bykq();
    }
}

