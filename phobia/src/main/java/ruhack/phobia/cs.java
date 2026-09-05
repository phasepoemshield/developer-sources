/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2596
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.minecraft.class_2596;
import ruhack.phobia.az;

public final class cs
implements az {
    public static final boolean c;
    private static int[] dsjm;
    private static long[] dsiz;
    public static final int b;
    public static final boolean a;
    private final class_2596<?> packet;
    protected static final long iz = 4410533430833966351L;
    private static long[] dsiy;
    private static int[] dsjn;

    static {
        dsjm = new int[9];
        dsjn = new int[9];
        cs.dsjx();
        cs.dsjy();
        dsiy = new long[10];
        dsiz = new long[10];
        cs.dsjz();
        cs.dska();
    }

    private static /* synthetic */ void dsjx() {
        cs.dsjm[0] = -1823354764;
        cs.dsjm[1] = -1732222594;
        cs.dsjm[2] = -1703040548;
        cs.dsjm[3] = 1414396695;
        cs.dsjm[4] = -1362142705;
        cs.dsjm[5] = 1111481222;
        cs.dsjm[6] = 1270405107;
        cs.dsjm[7] = 448967469;
        cs.dsjm[8] = -1974229814;
    }

    public static /* synthetic */ CallSite dsja(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ int dsjl(int n2) {
        return dsjm[n2] ^ dsjn[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public cs(class_2596<?> var1_1) {
        var3_2 /* !! */  = cs.b;
        var2_3 = cs.a;
        super();
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.packet = var1_1;
                return;
            }
            case 0: {
                var3_2 /* !! */  = (int)cs.dsja("dsju", dsjl(int ), (int)6);
            }
            case 1: {
                while (true) {
                    var3_2 /* !! */  = (int)cs.dsja("dsjv", dsjl(int ), (int)7);
                }
            }
            case 2: 
        }
        while (true) {
            var3_2 /* !! */  = (int)cs.dsja("dsjw", dsjl(int ), (int)8);
        }
    }

    private static /* synthetic */ void dsjz() {
        cs.dsiy[0] = -2754020311299865219L;
        cs.dsiy[1] = 8261485979961688372L;
        cs.dsiy[2] = 2387033365645189323L;
        cs.dsiy[3] = 9103562090034938607L;
        cs.dsiy[4] = -49601579063218446L;
        cs.dsiy[5] = 3079177113274856235L;
        cs.dsiy[6] = 5264509315212774186L;
        cs.dsiy[7] = -5302118033755932225L;
        cs.dsiy[8] = -6976711210667097848L;
        cs.dsiy[9] = 2932901225097908842L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public class_2596<?> getPacket() {
        v0 /* !! */  = cs.iz;
        if (true) ** GOTO lbl5
        block21: while (true) {
            v0 /* !! */  = (long)(cs.dsja("dsjc", dsix(int ), (int)1) - cs.dsja("dsjb", dsix(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1898451697: {
                    break block21;
                }
                case 61529301: {
                    continue block21;
                }
            }
            break;
        }
        var3_1 = cs.c;
        v1 /* !! */  = cs.iz;
        if (true) ** GOTO lbl15
        block22: while (true) {
            v1 /* !! */  = (long)(v2 - cs.dsja("dsjd", dsix(int ), (int)2));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1898451697: {
                    break block22;
                }
                case 14344700: {
                    v2 = cs.dsja("dsje", dsix(int ), (int)3);
                    continue block22;
                }
                case 911900535: {
                    v2 = cs.dsja("dsjf", dsix(int ), (int)4);
                    continue block22;
                }
            }
            break;
        }
        var2_2 /* !! */  = cs.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block9 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v3 /* !! */  = cs.iz;
                if (true) ** GOTO lbl32
                block23: while (true) {
                    v3 /* !! */  = (long)(v4 - cs.dsja("dsjg", dsix(int ), (int)5));
lbl32:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1898451697: {
                            break block23;
                        }
                        case 169313688: {
                            v4 = cs.dsja("dsjh", dsix(int ), (int)6);
                            continue block23;
                        }
                        case 236365861: {
                            v4 = cs.dsja("dsji", dsix(int ), (int)7);
                            continue block23;
                        }
                        case 2141226918: {
                            v4 = cs.dsja("dsjj", dsix(int ), (int)8);
                            continue block23;
                        }
                    }
                    break;
                }
                var1_3 = cs.a;
                if (var3_1) {
                    throw null;
                    return null;
                }
                if (var1_3 || var1_3) ** continue;
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_0 = cs.iz - cs.dsja("dsjk", dsix(int ), (int)9)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == cs.dsja("dsjo", dsjl(int ), (int)0)) break;
                    v5 /* !! */  = (long)cs.dsja("dsjp", dsjl(int ), (int)1);
                }
                return this.packet;
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)cs.dsja("dsjq", dsjl(int ), (int)2);
                    if (!var3_1) break block9;
                    throw null;
                }
            }
lbl62:
            // 2 sources

            case 1: {
                do {
                    var2_2 /* !! */  = (int)cs.dsja("dsjr", dsjl(int ), (int)3);
                } while (!var3_1);
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)cs.dsja("dsjs", dsjl(int ), (int)4);
                if (!var3_1) ** GOTO lbl62
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)cs.dsja("dsjt", dsjl(int ), (int)5);
        ** while (!var3_1)
lbl74:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void dska() {
        cs.dsiz[0] = -7423384133989242056L;
        cs.dsiz[1] = 5394286428873043670L;
        cs.dsiz[2] = 2596035928001012307L;
        cs.dsiz[3] = 3420574682910017774L;
        cs.dsiz[4] = 5839362371481040259L;
        cs.dsiz[5] = -7429146120897324663L;
        cs.dsiz[6] = -2743945660888114117L;
        cs.dsiz[7] = 5049764980234981702L;
        cs.dsiz[8] = -4664625881018058585L;
        cs.dsiz[9] = -4582564030033023577L;
    }

    private static /* synthetic */ void dsjy() {
        cs.dsjn[0] = -1823354763;
        cs.dsjn[1] = -1067720431;
        cs.dsjn[2] = -1703040546;
        cs.dsjn[3] = 1414396695;
        cs.dsjn[4] = -1362142705;
        cs.dsjn[5] = 1111481222;
        cs.dsjn[6] = 1270405105;
        cs.dsjn[7] = 448967471;
        cs.dsjn[8] = -1974229814;
    }

    private static /* synthetic */ long dsix(int n2) {
        return dsiy[n2] ^ dsiz[n2];
    }
}

