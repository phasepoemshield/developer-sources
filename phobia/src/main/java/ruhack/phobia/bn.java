/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_243
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.minecraft.class_243;
import ruhack.phobia.az;

public class bn
implements az {
    private static final long je = 4536186151229930363L;
    private static int[] dtzz = new int[22];
    private static int[] duaa = new int[22];
    private class_243 pos;
    public static final boolean c;
    public static final boolean a;
    private static long[] dtzp;
    public static final int b;
    private static long[] dtzq;

    static {
        bn.dude();
        bn.dudj();
        dtzp = new long[17];
        dtzq = new long[17];
        bn.dudp();
        bn.dudq();
    }

    private static /* synthetic */ void dudp() {
        bn.dtzp[0] = -5232704947524738809L;
        bn.dtzp[1] = 1231047742881934084L;
        bn.dtzp[2] = 2923572771856074601L;
        bn.dtzp[3] = 399218603745232569L;
        bn.dtzp[4] = -4775671621584707414L;
        bn.dtzp[5] = 1691571922290599545L;
        bn.dtzp[6] = -7552887624024533278L;
        bn.dtzp[7] = 6328921406890438412L;
        bn.dtzp[8] = 9201807801178034862L;
        bn.dtzp[9] = -1693415199240038771L;
        bn.dtzp[10] = 7786554669738380999L;
        bn.dtzp[11] = 8760457499242611568L;
        bn.dtzp[12] = -7355594478331865133L;
        bn.dtzp[13] = 6876475944077187186L;
        bn.dtzp[14] = 6405481978173868385L;
        bn.dtzp[15] = -1777137136587325552L;
        bn.dtzp[16] = 6917339038446360107L;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public bn(class_243 var1_1) {
        block7: {
            var3_2 /* !! */  = bn.b;
            var2_3 = bn.a;
            if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
            cfr_temp_0 = -2147483648;
            do {
                switch (cfr_temp_0 == -2147483648 ? var3_2 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        super();
                        this.pos = var1_1;
                        return;
                    }
                    case 0: {
                        ** break;
                    }
                    case 2: {
                        break block7;
                    }
lbl15:
                    // 2 sources

                    while (true) {
                        cfr_temp_0 = 1;
                        var3_2 /* !! */  = (int)bn.dtzw("ducy", dtzy(int ), (int)19);
                        break;
                    }
                    case 1: 
                }
                break;
            } while (true);
            var3_2 /* !! */  = (int)bn.dtzw("ducz", dtzy(int ), (int)20);
        }
        var3_2 /* !! */  = (int)bn.dtzw("dudb", dtzy(int ), (int)21);
        ** while (true)
    }

    private static /* synthetic */ void dudj() {
        bn.duaa[0] = -1656795368;
        bn.duaa[1] = 358484872;
        bn.duaa[2] = 241847766;
        bn.duaa[3] = -340900475;
        bn.duaa[4] = -405144102;
        bn.duaa[5] = 1172470380;
        bn.duaa[6] = 371882670;
        bn.duaa[7] = 1491617903;
        bn.duaa[8] = -1163951542;
        bn.duaa[9] = 703772182;
        bn.duaa[10] = 161912246;
        bn.duaa[11] = -216281859;
        bn.duaa[12] = -1419705822;
        bn.duaa[13] = -1258362267;
        bn.duaa[14] = -2120103272;
        bn.duaa[15] = 1514265722;
        bn.duaa[16] = -1555760153;
        bn.duaa[17] = -617352265;
        bn.duaa[18] = -326971386;
        bn.duaa[19] = -1046972014;
        bn.duaa[20] = 1167421642;
        bn.duaa[21] = -843054551;
    }

    private static /* synthetic */ int dtzy(int n2) {
        return dtzz[n2] ^ duaa[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public class_243 getPos() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = bn.je - bn.dtzw("dtzx", dtzn(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == bn.dtzw("duab", dtzy(int ), (int)0)) break;
            v0 /* !! */  = (long)bn.dtzw("duac", dtzy(int ), (int)1);
        }
        var3_1 = bn.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = bn.je - bn.dtzw("duai", dtzn(int ), (int)1)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == bn.dtzw("duaj", dtzy(int ), (int)2)) break;
            v1 /* !! */  = (long)bn.dtzw("duak", dtzy(int ), (int)3);
        }
        var2_2 /* !! */  = bn.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = bn.je - bn.dtzw("dual", dtzn(int ), (int)2)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == bn.dtzw("duan", dtzy(int ), (int)4)) break;
            v2 /* !! */  = (long)bn.dtzw("duap", dtzy(int ), (int)5);
        }
        var1_3 = bn.a;
        if (!var3_1) ** GOTO lbl28
        throw null;
        {
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var2_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return null;
                }
lbl28:
                // 1 sources

                if (var1_3 || var1_3) continue block15;
                v3 /* !! */  = bn.je;
                if (true) ** GOTO lbl33
                block16: while (true) {
                    v3 /* !! */  = (long)(v4 - bn.dtzw("duar", dtzn(int ), (int)3));
lbl33:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -2141977243: {
                            v4 = bn.dtzw("duay", dtzn(int ), (int)4);
                            continue block16;
                        }
                        case -594759062: {
                            v4 = bn.dtzw("duba", dtzn(int ), (int)5);
                            continue block16;
                        }
                        case -504966639: {
                            v4 = bn.dtzw("dubb", dtzn(int ), (int)6);
                            continue block16;
                        }
                        case 1394293627: {
                            break block16;
                        }
                    }
                    break;
                }
                return this.pos;
lbl46:
                // 2 sources

                case 0: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var2_2 /* !! */  = (int)bn.dtzw("dubc", dtzy(int ), (int)6);
                        if (var3_1) {
                            throw null;
                        }
                        ** GOTO lbl56
                        break;
                    }
                }
                case 1: {
                    var2_2 /* !! */  = (int)bn.dtzw("dubd", dtzy(int ), (int)7);
                    if (var3_1) {
                        throw null;
                    }
                }
lbl56:
                // 4 sources

                case 2: {
                    var2_2 /* !! */  = (int)bn.dtzw("dubf", dtzy(int ), (int)8);
                    if (!var3_1) ** GOTO lbl46
                    throw null;
                }
                case 3: 
            }
        }
        var2_2 /* !! */  = (int)bn.dtzw("dubh", dtzy(int ), (int)9);
        ** while (!var3_1)
lbl63:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void setPos(class_243 var1_1) {
        v0 /* !! */  = bn.je;
        if (true) ** GOTO lbl5
        block19: while (true) {
            v0 /* !! */  = (long)(v1 - bn.dtzw("dubp", dtzn(int ), (int)7));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -905945589: {
                    v1 = bn.dtzw("dubr", dtzn(int ), (int)8);
                    continue block19;
                }
                case 1394293627: {
                    break block19;
                }
                case 1586195324: {
                    v1 = bn.dtzw("dubs", dtzn(int ), (int)9);
                    continue block19;
                }
                case 1647572479: {
                    v1 = bn.dtzw("dubt", dtzn(int ), (int)10);
                    continue block19;
                }
            }
            break;
        }
        var4_2 = bn.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = bn.je - bn.dtzw("dubu", dtzn(int ), (int)11)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == bn.dtzw("dubv", dtzy(int ), (int)10)) break;
            v2 /* !! */  = (long)bn.dtzw("dubz", dtzy(int ), (int)11);
        }
        var3_3 /* !! */  = bn.b;
        v3 /* !! */  = bn.je;
        if (true) ** GOTO lbl28
        block21: while (true) {
            v3 /* !! */  = (long)(v4 - bn.dtzw("ducb", dtzn(int ), (int)12));
lbl28:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -971714908: {
                    v4 = bn.dtzw("ducd", dtzn(int ), (int)13);
                    continue block21;
                }
                case 824506055: {
                    v4 = bn.dtzw("duce", dtzn(int ), (int)14);
                    continue block21;
                }
                case 1394293627: {
                    break block21;
                }
                case 2118384015: {
                    v4 = bn.dtzw("ducg", dtzn(int ), (int)15);
                    continue block21;
                }
            }
            break;
        }
        var2_4 = bn.a;
        if (var4_2) {
            throw null;
lbl43:
            // 3 sources

            return;
        }
        if (var2_4) ** GOTO lbl43
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** GOTO lbl43
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = bn.je - bn.dtzw("duck", dtzn(int ), (int)16)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == bn.dtzw("duco", dtzy(int ), (int)12)) break;
                    v5 /* !! */  = (long)bn.dtzw("ducp", dtzy(int ), (int)13);
                }
                this.pos = var1_1;
                if (var2_4) ** continue;
                return;
            }
lbl58:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)bn.dtzw("ducq", dtzy(int ), (int)14);
                if (var4_2) {
                    throw null;
                }
            }
            case 1: {
                var3_3 /* !! */  = (int)bn.dtzw("ducr", dtzy(int ), (int)15);
                if (!var4_2) ** GOTO lbl58
                throw null;
            }
lbl66:
            // 2 sources

            case 2: {
                do {
                    var3_3 /* !! */  = (int)bn.dtzw("duct", dtzy(int ), (int)16);
                } while (!var4_2);
                throw null;
            }
            case 3: {
                var3_3 /* !! */  = (int)bn.dtzw("ducv", dtzy(int ), (int)17);
                if (!var4_2) ** GOTO lbl66
                throw null;
            }
            case 4: 
        }
        do {
            var3_3 /* !! */  = (int)bn.dtzw("ducw", dtzy(int ), (int)18);
        } while (!var4_2);
        throw null;
    }

    private static /* synthetic */ long dtzn(int n2) {
        return dtzp[n2] ^ dtzq[n2];
    }

    private static /* synthetic */ void dude() {
        bn.dtzz[0] = -1656795367;
        bn.dtzz[1] = 318963773;
        bn.dtzz[2] = 241847767;
        bn.dtzz[3] = 150443981;
        bn.dtzz[4] = -405144101;
        bn.dtzz[5] = 571053253;
        bn.dtzz[6] = 371882671;
        bn.dtzz[7] = 1491617903;
        bn.dtzz[8] = -1163951542;
        bn.dtzz[9] = 703772183;
        bn.dtzz[10] = 161912247;
        bn.dtzz[11] = 469013039;
        bn.dtzz[12] = -1419705821;
        bn.dtzz[13] = -2119794195;
        bn.dtzz[14] = -2120103270;
        bn.dtzz[15] = 1514265726;
        bn.dtzz[16] = -1555760154;
        bn.dtzz[17] = -617352266;
        bn.dtzz[18] = -326971386;
        bn.dtzz[19] = -1046972016;
        bn.dtzz[20] = 1167421640;
        bn.dtzz[21] = -843054552;
    }

    private static /* synthetic */ void dudq() {
        bn.dtzq[0] = -7416774201122505544L;
        bn.dtzq[1] = -2590998243944710279L;
        bn.dtzq[2] = -3030616039895895655L;
        bn.dtzq[3] = -8537376181964418184L;
        bn.dtzq[4] = 8368418640204567318L;
        bn.dtzq[5] = 8763689139647662293L;
        bn.dtzq[6] = -4275090943019685760L;
        bn.dtzq[7] = 1716098917793096175L;
        bn.dtzq[8] = 6692612777245699124L;
        bn.dtzq[9] = 4859415876157095429L;
        bn.dtzq[10] = 2258350635054016233L;
        bn.dtzq[11] = 6857207434327391440L;
        bn.dtzq[12] = -7630166322922285438L;
        bn.dtzq[13] = 4114132456759925557L;
        bn.dtzq[14] = 1524900161458217539L;
        bn.dtzq[15] = -851909695397683244L;
        bn.dtzq[16] = 9052940025919481686L;
    }

    public static /* synthetic */ CallSite dtzw(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }
}

