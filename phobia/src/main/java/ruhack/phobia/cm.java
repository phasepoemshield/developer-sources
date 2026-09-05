/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1657
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.minecraft.class_1657;
import ruhack.phobia.bc;

public class cm
extends bc {
    private class_1657 player;
    public static final boolean a;
    private static int[] dlvj;
    public static final int b;
    private static long[] dlvd;
    private static long[] dlve;
    static final long hz = -170721637266065834L;
    public static final boolean c;
    private static int[] dlvi;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public class_1657 getPlayer() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = cm.hz - cm.dlvf("dlvg", dlvc(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == cm.dlvf("dlvk", dlvh(int ), (int)0)) break;
            v0 /* !! */  = (long)cm.dlvf("dlvl", dlvh(int ), (int)1);
        }
        var3_1 = cm.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = cm.hz - cm.dlvf("dlvm", dlvc(int ), (int)1)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == cm.dlvf("dlvn", dlvh(int ), (int)2)) break;
            v1 /* !! */  = (long)cm.dlvf("dlvo", dlvh(int ), (int)3);
        }
        var2_2 /* !! */  = cm.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = cm.hz - cm.dlvf("dlvp", dlvc(int ), (int)2)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == cm.dlvf("dlvq", dlvh(int ), (int)4)) break;
            v2 /* !! */  = (long)cm.dlvf("dlvr", dlvh(int ), (int)5);
        }
        var1_3 = cm.a;
        if (var3_1) {
            throw null;
lbl24:
            // 2 sources

            return null;
        }
        if (var1_3) ** GOTO lbl24
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_3 = cm.hz - cm.dlvf("dlvs", dlvc(int ), (int)3)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == cm.dlvf("dlvt", dlvh(int ), (int)6)) break;
                    v3 /* !! */  = (long)cm.dlvf("dlvu", dlvh(int ), (int)7);
                }
                return this.player;
            }
            case 0: {
                var2_2 /* !! */  = (int)cm.dlvf("dlvv", dlvh(int ), (int)8);
                if (!var3_1) break;
                throw null;
            }
lbl42:
            // 2 sources

            case 1: {
                do {
                    var2_2 /* !! */  = (int)cm.dlvf("dlvw", dlvh(int ), (int)9);
                } while (!var3_1);
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)cm.dlvf("dlvx", dlvh(int ), (int)10);
                if (!var3_1) ** GOTO lbl42
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)cm.dlvf("dlvy", dlvh(int ), (int)11);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ void dlwe() {
        cm.dlvd[0] = -4593766182551180793L;
        cm.dlvd[1] = 1695023529590352317L;
        cm.dlvd[2] = 4245303286263185500L;
        cm.dlvd[3] = 185327532859944595L;
    }

    static {
        dlvi = new int[15];
        dlvj = new int[15];
        cm.dlwc();
        cm.dlwd();
        dlvd = new long[4];
        dlve = new long[4];
        cm.dlwe();
        cm.dlwf();
    }

    private static /* synthetic */ void dlwc() {
        cm.dlvi[0] = -96214017;
        cm.dlvi[1] = -1522098514;
        cm.dlvi[2] = 1699048573;
        cm.dlvi[3] = 214381678;
        cm.dlvi[4] = -1722447126;
        cm.dlvi[5] = 296871651;
        cm.dlvi[6] = 1220943861;
        cm.dlvi[7] = -1929777722;
        cm.dlvi[8] = 1045407225;
        cm.dlvi[9] = 1078796200;
        cm.dlvi[10] = -1460701700;
        cm.dlvi[11] = 630385148;
        cm.dlvi[12] = 1135224890;
        cm.dlvi[13] = -111695736;
        cm.dlvi[14] = 1774420875;
    }

    public static /* synthetic */ CallSite dlvf(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ int dlvh(int n2) {
        return dlvi[n2] ^ dlvj[n2];
    }

    private static /* synthetic */ void dlwf() {
        cm.dlve[0] = -7459738781936162057L;
        cm.dlve[1] = -5768764269421649410L;
        cm.dlve[2] = 8507383443337857801L;
        cm.dlve[3] = -7773565940240061334L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public cm(class_1657 var1_1) {
        var3_2 /* !! */  = cm.b;
        var2_3 = cm.a;
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        block0 : switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                super();
                this.player = var1_1;
                return;
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_2 /* !! */  = (int)cm.dlvf("dlvz", dlvh(int ), (int)12);
                    break block0;
                    break;
                }
            }
            case 1: {
                while (true) {
                    var3_2 /* !! */  = (int)cm.dlvf("dlwa", dlvh(int ), (int)13);
                }
            }
            case 2: 
        }
        var3_2 /* !! */  = (int)cm.dlvf("dlwb", dlvh(int ), (int)14);
        ** while (true)
    }

    private static /* synthetic */ long dlvc(int n2) {
        return dlvd[n2] ^ dlve[n2];
    }

    private static /* synthetic */ void dlwd() {
        cm.dlvj[0] = 96214016;
        cm.dlvj[1] = -378277626;
        cm.dlvj[2] = 1699048572;
        cm.dlvj[3] = 38673330;
        cm.dlvj[4] = 1722447125;
        cm.dlvj[5] = -1408973657;
        cm.dlvj[6] = 1220943860;
        cm.dlvj[7] = 929613646;
        cm.dlvj[8] = 1045407224;
        cm.dlvj[9] = 1078796203;
        cm.dlvj[10] = -1460701699;
        cm.dlvj[11] = 630385149;
        cm.dlvj[12] = 1135224890;
        cm.dlvj[13] = -111695734;
        cm.dlvj[14] = 1774420875;
    }
}

