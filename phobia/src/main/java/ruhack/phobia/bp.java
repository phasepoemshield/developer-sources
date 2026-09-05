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

public class bp
extends bc {
    private static long[] dtha;
    public static final int b;
    public static final boolean c;
    public static final boolean a;
    private static int[] dtgo;
    private String message;
    private static long[] dthb;
    static final long jb = 5597193214597124533L;
    private static int[] dtgq;

    private static /* synthetic */ long dtgz(int n2) {
        return dtha[n2] ^ dthb[n2];
    }

    private static /* synthetic */ void dtje() {
        bp.dtgo[0] = -1726082814;
        bp.dtgo[1] = 1628513657;
        bp.dtgo[2] = 1181796653;
        bp.dtgo[3] = 1280168434;
        bp.dtgo[4] = -676136691;
        bp.dtgo[5] = -408506459;
        bp.dtgo[6] = -2095021444;
        bp.dtgo[7] = 1481436950;
        bp.dtgo[8] = -2118187434;
        bp.dtgo[9] = 1678708973;
        bp.dtgo[10] = 24290864;
        bp.dtgo[11] = 1871218158;
        bp.dtgo[12] = -677982264;
        bp.dtgo[13] = 623803423;
        bp.dtgo[14] = 1253076610;
        bp.dtgo[15] = -1184638244;
        bp.dtgo[16] = -1100821543;
        bp.dtgo[17] = 719062314;
        bp.dtgo[18] = -1242574081;
        bp.dtgo[19] = -1820040755;
        bp.dtgo[20] = -832089462;
        bp.dtgo[21] = 48265307;
        bp.dtgo[22] = -115133858;
        bp.dtgo[23] = 1941734594;
        bp.dtgo[24] = 384325598;
        bp.dtgo[25] = -857931775;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void setMessage(String var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = bp.jb - bp.dtgr("dtif", dtgz(int ), (int)4)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == bp.dtgr("dtih", dtgm(int ), (int)15)) break;
            v0 /* !! */  = (long)bp.dtgr("dtii", dtgm(int ), (int)16);
        }
        var4_2 = bp.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = bp.jb - bp.dtgr("dtij", dtgz(int ), (int)5)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == bp.dtgr("dtil", dtgm(int ), (int)17)) break;
            v1 /* !! */  = (long)bp.dtgr("dtim", dtgm(int ), (int)18);
        }
        var3_3 /* !! */  = bp.b;
        v2 /* !! */  = bp.jb;
        if (true) ** GOTO lbl17
        block15: while (true) {
            v2 /* !! */  = (long)(v3 - bp.dtgr("dtir", dtgz(int ), (int)6));
lbl17:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1987406584: {
                    v3 = bp.dtgr("dtis", dtgz(int ), (int)7);
                    continue block15;
                }
                case -1964381535: {
                    v3 = bp.dtgr("dtit", dtgz(int ), (int)8);
                    continue block15;
                }
                case -938376672: {
                    v3 = bp.dtgr("dtiu", dtgz(int ), (int)9);
                    continue block15;
                }
                case -817245771: {
                    break block15;
                }
            }
            break;
        }
        var2_4 = bp.a;
        if (!var4_2) ** GOTO lbl36
        throw null;
        {
            if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
            switch (var3_3 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return;
                }
lbl36:
                // 1 sources

                if (var2_4 || var2_4) continue block16;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = bp.jb - bp.dtgr("dtiv", dtgz(int ), (int)10)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == bp.dtgr("dtiw", dtgm(int ), (int)19)) break;
                    v4 /* !! */  = (long)bp.dtgr("dtiy", dtgm(int ), (int)20);
                }
                this.message = var1_1;
                if (!var2_4) ** break;
                continue block16;
                return;
                case 0: lbl-1000:
                // 2 sources

                {
                    while (true) lbl-1000:
                    // 2 sources

                    {
                        var3_3 /* !! */  = (int)bp.dtgr("dtiz", dtgm(int ), (int)21);
                        if (!var4_2) ** GOTO lbl-1000
                        throw null;
                    }
                }
                case 1: {
                    var3_3 /* !! */  = (int)bp.dtgr("dtja", dtgm(int ), (int)22);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl60
                }
                case 2: {
                    var3_3 /* !! */  = (int)bp.dtgr("dtjb", dtgm(int ), (int)23);
                    if (var4_2) {
                        throw null;
                    }
                }
lbl60:
                // 4 sources

                case 3: {
                    var3_3 /* !! */  = (int)bp.dtgr("dtjc", dtgm(int ), (int)24);
                    if (!var4_2) break block16;
                    throw null;
                }
                case 4: 
            }
        }
        var3_3 /* !! */  = (int)bp.dtgr("dtjd", dtgm(int ), (int)25);
        ** while (!var4_2)
lbl67:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void dtka() {
        bp.dthb[0] = 8877995509009934023L;
        bp.dthb[1] = -3008541096274503786L;
        bp.dthb[2] = 8726545468820157034L;
        bp.dthb[3] = 4083449838984518534L;
        bp.dthb[4] = -7726748055880234679L;
        bp.dthb[5] = -1363666315105117928L;
        bp.dthb[6] = -1569015448336594328L;
        bp.dthb[7] = 437484290624234607L;
        bp.dthb[8] = -34990820884192553L;
        bp.dthb[9] = -6828363004774307322L;
        bp.dthb[10] = 3312282170300126210L;
    }

    private static /* synthetic */ int dtgm(int n2) {
        return dtgo[n2] ^ dtgq[n2];
    }

    static {
        dtgo = new int[26];
        dtgq = new int[26];
        bp.dtje();
        bp.dtjo();
        dtha = new long[11];
        dthb = new long[11];
        bp.dtjt();
        bp.dtka();
    }

    private static /* synthetic */ void dtjo() {
        bp.dtgq[0] = -1726082813;
        bp.dtgq[1] = 1628513656;
        bp.dtgq[2] = 1181796653;
        bp.dtgq[3] = -1280168435;
        bp.dtgq[4] = 2112047994;
        bp.dtgq[5] = -408506460;
        bp.dtgq[6] = -1890333365;
        bp.dtgq[7] = 1481436951;
        bp.dtgq[8] = -1960200864;
        bp.dtgq[9] = 1678708972;
        bp.dtgq[10] = -959577597;
        bp.dtgq[11] = 1871218156;
        bp.dtgq[12] = -677982262;
        bp.dtgq[13] = 623803423;
        bp.dtgq[14] = 1253076608;
        bp.dtgq[15] = 1184638243;
        bp.dtgq[16] = 1702165459;
        bp.dtgq[17] = 719062315;
        bp.dtgq[18] = -2103127901;
        bp.dtgq[19] = -1820040756;
        bp.dtgq[20] = 1365060924;
        bp.dtgq[21] = 48265304;
        bp.dtgq[22] = -115133858;
        bp.dtgq[23] = 1941734592;
        bp.dtgq[24] = 384325594;
        bp.dtgq[25] = -857931773;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public bp(String var1_1) {
        var3_2 /* !! */  = bp.b;
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                super();
                this.message = var1_1;
                return;
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_2 /* !! */  = (int)bp.dtgr("dtgt", dtgm(int ), (int)0);
                    continue;
                    break;
                }
            }
            case 1: {
                var3_2 /* !! */  = (int)bp.dtgr("dtgu", dtgm(int ), (int)1);
            }
            case 2: 
        }
        var3_2 /* !! */  = (int)bp.dtgr("dtgx", dtgm(int ), (int)2);
        ** while (true)
    }

    public static /* synthetic */ CallSite dtgr(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void dtjt() {
        bp.dtha[0] = 962691311756051637L;
        bp.dtha[1] = -2271153186035631058L;
        bp.dtha[2] = -2789589171421572482L;
        bp.dtha[3] = -3831248452862081465L;
        bp.dtha[4] = -3820104970554057914L;
        bp.dtha[5] = 6920243029256747707L;
        bp.dtha[6] = 348827596892722427L;
        bp.dtha[7] = -1950468259754000220L;
        bp.dtha[8] = -4853254215818239081L;
        bp.dtha[9] = 3892070033118721675L;
        bp.dtha[10] = -7485462872669397214L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public String getMessage() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = bp.jb - bp.dtgr("dthc", dtgz(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == bp.dtgr("dthd", dtgm(int ), (int)3)) break;
            v0 /* !! */  = (long)bp.dtgr("dthi", dtgm(int ), (int)4);
        }
        var3_1 = bp.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = bp.jb - bp.dtgr("dthk", dtgz(int ), (int)1)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == bp.dtgr("dthl", dtgm(int ), (int)5)) break;
            v1 /* !! */  = (long)bp.dtgr("dthm", dtgm(int ), (int)6);
        }
        var2_2 /* !! */  = bp.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = bp.jb - bp.dtgr("dthn", dtgz(int ), (int)2)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == bp.dtgr("dtho", dtgm(int ), (int)7)) break;
            v2 /* !! */  = (long)bp.dtgr("dthp", dtgm(int ), (int)8);
        }
        var1_3 = bp.a;
        if (var3_1) {
            throw null;
lbl24:
            // 1 sources

            return null;
        }
        ** while (var1_3 || var1_3)
lbl27:
        // 1 sources

        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_3 = bp.jb - bp.dtgr("dthu", dtgz(int ), (int)3)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == bp.dtgr("dthw", dtgm(int ), (int)9)) break;
                    v3 /* !! */  = (long)bp.dtgr("dthx", dtgm(int ), (int)10);
                }
                return this.message;
            }
            case 0: {
                var2_2 /* !! */  = (int)bp.dtgr("dthz", dtgm(int ), (int)11);
                if (var3_1) {
                    throw null;
                }
            }
            case 1: {
                do {
                    var2_2 /* !! */  = (int)bp.dtgr("dtia", dtgm(int ), (int)12);
                } while (!var3_1);
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)bp.dtgr("dtic", dtgm(int ), (int)13);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)bp.dtgr("dtid", dtgm(int ), (int)14);
        ** while (!var3_1)
lbl54:
        // 1 sources

        throw null;
    }
}

