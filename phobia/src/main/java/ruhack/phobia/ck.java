/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.minecraft.class_1297;
import ruhack.phobia.bc;

public class ck
extends bc {
    private static long[] dmbf;
    private static long[] dmbe;
    public static final boolean a;
    private static final long ic = 7319573210052194374L;
    private static int[] dmay;
    private class_1297 entity;
    public static final int b;
    public static final boolean c;
    private static int[] dmax;

    private static /* synthetic */ void dmco() {
        ck.dmay[0] = -1737625280;
        ck.dmay[1] = 1933312567;
        ck.dmay[2] = 1552589290;
        ck.dmay[3] = -2072398997;
        ck.dmay[4] = -171151657;
        ck.dmay[5] = 756118747;
        ck.dmay[6] = -642607275;
        ck.dmay[7] = 1383176480;
        ck.dmay[8] = 952540457;
        ck.dmay[9] = 818853136;
        ck.dmay[10] = -456636311;
        ck.dmay[11] = 294050288;
        ck.dmay[12] = -1323716575;
        ck.dmay[13] = -1261979349;
        ck.dmay[14] = -332806241;
        ck.dmay[15] = 1725545403;
        ck.dmay[16] = 1948292352;
        ck.dmay[17] = -1141343650;
        ck.dmay[18] = 538921173;
        ck.dmay[19] = 64438448;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public void setEntity(class_1297 var1_1) {
        block28: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_1 = ck.ic - ck.dmaz("dmbw", dmbd(int ), (int)8)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  == ck.dmaz("dmbx", dmaw(int ), (int)11)) break;
                v0 /* !! */  = (long)ck.dmaz("dmby", dmaw(int ), (int)12);
            }
            var4_2 = ck.c;
            while (true) {
                block29: {
                    if ((v1 /* !! */  = (cfr_temp_2 = ck.ic - ck.dmaz("dmbz", dmbd(int ), (int)9)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v1 /* !! */  != ck.dmaz("dmca", dmaw(int ), (int)13)) break block29;
                    var3_3 /* !! */  = ck.b;
                    v2 /* !! */  = ck.ic;
                    if (true) ** GOTO lbl18
                }
                v1 /* !! */  = (long)ck.dmaz("dmcb", dmaw(int ), (int)14);
            }
            block19: while (true) {
                v2 /* !! */  = (long)(v3 - ck.dmaz("dmcc", dmbd(int ), (int)10));
lbl18:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case -996118458: {
                        break block19;
                    }
                    case 26269304: {
                        v3 = ck.dmaz("dmcd", dmbd(int ), (int)11);
                        continue block19;
                    }
                    case 1682581092: {
                        v3 = ck.dmaz("dmce", dmbd(int ), (int)12);
                        continue block19;
                    }
                }
                break;
            }
            var2_4 = ck.a;
            if (var4_2) {
                throw null;
            }
            if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
            cfr_temp_0 = -2147483648;
            block20: do {
                switch (cfr_temp_0 == -2147483648 ? var3_3 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var2_4 || var2_4) ** GOTO lbl50
                        v4 /* !! */  = ck.ic;
                        block21: while (true) {
                            switch ((int)v4 /* !! */ ) {
                                case -996118458: {
                                    break block21;
                                }
                                case 381661723: {
                                    v5 = ck.dmaz("dmcg", dmbd(int ), (int)14);
                                    ** GOTO lbl46
                                }
                                case 2046035169: {
                                    v5 = ck.dmaz("dmch", dmbd(int ), (int)15);
lbl46:
                                    // 2 sources

                                    v4 /* !! */  = (long)(v5 - ck.dmaz("dmcf", dmbd(int ), (int)13));
                                    continue block21;
                                }
                            }
                            break;
                        }
                        this.entity = var1_1;
                        if (!var2_4) ** GOTO lbl51
lbl50:
                        // 2 sources

                        return;
lbl51:
                        // 1 sources

                        return;
                    }
                    case 2: {
                        var3_3 /* !! */  = (int)ck.dmaz("dmck", dmaw(int ), (int)17);
                        if (!var4_2) ** break;
                        throw null;
                    }
                    case 3: {
                        var3_3 /* !! */  = (int)ck.dmaz("dmcl", dmaw(int ), (int)18);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 0: {
                        ** break;
                    }
                    case 4: {
                        break block28;
                    }
lbl64:
                    // 2 sources

                    while (true) {
                        var3_3 /* !! */  = (int)ck.dmaz("dmci", dmaw(int ), (int)15);
                        cfr_temp_0 = 1;
                        if (!var4_2) continue block20;
                        throw null;
                    }
                    case 1: 
                }
                break;
            } while (true);
            var3_3 /* !! */  = (int)ck.dmaz("dmcj", dmaw(int ), (int)16);
            if (!var4_2) ** break;
            throw null;
        }
        var3_3 /* !! */  = (int)ck.dmaz("dmcm", dmaw(int ), (int)19);
        ** while (!var4_2)
lbl78:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public class_1297 getEntity() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ck.ic - ck.dmaz("dmbg", dmbd(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ck.dmaz("dmbh", dmaw(int ), (int)3)) break;
            v0 /* !! */  = (long)ck.dmaz("dmbi", dmaw(int ), (int)4);
        }
        var3_1 = ck.c;
        v1 /* !! */  = ck.ic;
        if (true) ** GOTO lbl12
        block17: while (true) {
            v1 /* !! */  = (long)(v2 - ck.dmaz("dmbj", dmbd(int ), (int)1));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1102364517: {
                    v2 = ck.dmaz("dmbk", dmbd(int ), (int)2);
                    continue block17;
                }
                case -996118458: {
                    break block17;
                }
                case 1405938212: {
                    v2 = ck.dmaz("dmbl", dmbd(int ), (int)3);
                    continue block17;
                }
                case 1902830465: {
                    v2 = ck.dmaz("dmbm", dmbd(int ), (int)4);
                    continue block17;
                }
            }
            break;
        }
        var2_2 /* !! */  = ck.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v3 /* !! */  = ck.ic;
                if (true) ** GOTO lbl32
                block18: while (true) {
                    v3 /* !! */  = (long)(ck.dmaz("dmbo", dmbd(int ), (int)6) - ck.dmaz("dmbn", dmbd(int ), (int)5));
lbl32:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -996118458: {
                            break block18;
                        }
                        case 339431051: {
                            continue block18;
                        }
                    }
                    break;
                }
                var1_3 = ck.a;
                if (var3_1) {
                    throw null;
                    return null;
                }
                if (var1_3 || var1_3) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_1 = ck.ic - ck.dmaz("dmbp", dmbd(int ), (int)7)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == ck.dmaz("dmbq", dmaw(int ), (int)5)) break;
                    v4 /* !! */  = (long)ck.dmaz("dmbr", dmaw(int ), (int)6);
                }
                return this.entity;
            }
lbl50:
            // 3 sources

            case 0: {
                var2_2 /* !! */  = (int)ck.dmaz("dmbs", dmaw(int ), (int)7);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl60
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ck.dmaz("dmbt", dmaw(int ), (int)8);
                    if (!var3_1) ** GOTO lbl50
                    throw null;
                }
            }
lbl60:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)ck.dmaz("dmbu", dmaw(int ), (int)9);
                if (!var3_1) ** GOTO lbl50
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)ck.dmaz("dmbv", dmaw(int ), (int)10);
        ** while (!var3_1)
lbl67:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ long dmbd(int n2) {
        return dmbe[n2] ^ dmbf[n2];
    }

    private static /* synthetic */ void dmcn() {
        ck.dmax[0] = -1737625279;
        ck.dmax[1] = 1933312565;
        ck.dmax[2] = 1552589291;
        ck.dmax[3] = -2072398998;
        ck.dmax[4] = -1728483517;
        ck.dmax[5] = 756118746;
        ck.dmax[6] = 200143609;
        ck.dmax[7] = 1383176481;
        ck.dmax[8] = 952540458;
        ck.dmax[9] = 818853137;
        ck.dmax[10] = -456636312;
        ck.dmax[11] = 294050289;
        ck.dmax[12] = 614880626;
        ck.dmax[13] = -1261979350;
        ck.dmax[14] = 1879014746;
        ck.dmax[15] = 1725545402;
        ck.dmax[16] = 1948292352;
        ck.dmax[17] = -1141343651;
        ck.dmax[18] = 538921169;
        ck.dmax[19] = 64438449;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public ck(class_1297 var1_1) {
        var3_2 /* !! */  = ck.b;
        super();
        this.entity = var1_1;
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                return;
            }
            case 0: {
                while (true) {
                    var3_2 /* !! */  = (int)ck.dmaz("dmba", dmaw(int ), (int)0);
                }
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_2 /* !! */  = (int)ck.dmaz("dmbb", dmaw(int ), (int)1);
                    break;
                }
            }
            case 2: 
        }
        var3_2 /* !! */  = (int)ck.dmaz("dmbc", dmaw(int ), (int)2);
        ** while (true)
    }

    private static /* synthetic */ void dmcp() {
        ck.dmbe[0] = -3144577554400558857L;
        ck.dmbe[1] = 3569886554456602578L;
        ck.dmbe[2] = 6687540430825396308L;
        ck.dmbe[3] = 1803103303852761409L;
        ck.dmbe[4] = 5974593125664281866L;
        ck.dmbe[5] = 5707810920409301612L;
        ck.dmbe[6] = 6691967151454789543L;
        ck.dmbe[7] = 1972628498286435068L;
        ck.dmbe[8] = 3960317515989754273L;
        ck.dmbe[9] = -5668970925612287746L;
        ck.dmbe[10] = 282922153301810672L;
        ck.dmbe[11] = 3471152713289357808L;
        ck.dmbe[12] = 6038132383689267137L;
        ck.dmbe[13] = 5151566822554245717L;
        ck.dmbe[14] = -7898197917087561992L;
        ck.dmbe[15] = 3239186185635009429L;
    }

    private static /* synthetic */ void dmcq() {
        ck.dmbf[0] = -8963004742084116094L;
        ck.dmbf[1] = 1710485393811213146L;
        ck.dmbf[2] = -4039151631824018012L;
        ck.dmbf[3] = 8704424769569813030L;
        ck.dmbf[4] = -4774148979539639554L;
        ck.dmbf[5] = 6621424388927531849L;
        ck.dmbf[6] = 496477413099521898L;
        ck.dmbf[7] = -4261306230661852386L;
        ck.dmbf[8] = -3350575794301119601L;
        ck.dmbf[9] = -8724047548898551352L;
        ck.dmbf[10] = 5002762846824146578L;
        ck.dmbf[11] = -1822584252402845508L;
        ck.dmbf[12] = 4731828411894098216L;
        ck.dmbf[13] = 8038266469081983073L;
        ck.dmbf[14] = 2332663000082206131L;
        ck.dmbf[15] = -7538309441004088812L;
    }

    static {
        dmax = new int[20];
        dmay = new int[20];
        ck.dmcn();
        ck.dmco();
        dmbe = new long[16];
        dmbf = new long[16];
        ck.dmcp();
        ck.dmcq();
    }

    public static /* synthetic */ CallSite dmaz(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ int dmaw(int n2) {
        return dmax[n2] ^ dmay[n2];
    }
}

