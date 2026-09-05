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

public class dg
extends bc {
    static final long ew = -7821339897418842734L;
    public static final boolean c;
    public static final boolean a;
    private static int[] byga;
    byte type;
    private static int[] bygb;
    public static final int b;
    private static long[] byft;
    private static long[] byfs;

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public void setType(byte var1_1) {
        block31: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_1 = dg.ew - dg.byfu("bygq", byfr(int ), (int)11)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  == dg.byfu("bygr", byfz(int ), (int)7)) break;
                v0 /* !! */  = (long)dg.byfu("bygs", byfz(int ), (int)8);
            }
            var4_2 = dg.c;
            while (true) {
                block30: {
                    if ((v1 /* !! */  = (cfr_temp_2 = dg.ew - dg.byfu("bygt", byfr(int ), (int)12)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v1 /* !! */  != dg.byfu("bygu", byfz(int ), (int)9)) break block30;
                    var3_3 /* !! */  = dg.b;
                    v2 /* !! */  = dg.ew;
                    if (true) ** GOTO lbl18
                }
                v1 /* !! */  = (long)dg.byfu("bygv", byfz(int ), (int)10);
            }
            block20: while (true) {
                v2 /* !! */  = (long)(v3 - dg.byfu("bygw", byfr(int ), (int)13));
lbl18:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case 128242037: {
                        v3 = dg.byfu("bygx", byfr(int ), (int)14);
                        continue block20;
                    }
                    case 1127100643: {
                        v3 = dg.byfu("bygy", byfr(int ), (int)15);
                        continue block20;
                    }
                    case 1925348754: {
                        break block20;
                    }
                }
                break;
            }
            var2_4 = dg.a;
            if (var4_2) {
                throw null;
            }
            if (var2_4 || var2_4) break block31;
            v4 /* !! */  = dg.ew;
            if (true) ** GOTO lbl47
        }
        block21: while (true) {
            if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
            cfr_temp_0 = -2147483648;
            while (true) {
                switch (cfr_temp_0 == -2147483648 ? var3_3 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        return;
                    }
                    case 1: {
                        ** GOTO lbl69
                    }
                    case 4: {
                        ** GOTO lbl66
                    }
                    block23: while (true) {
                        v4 /* !! */  = (long)(v5 - dg.byfu("bygz", byfr(int ), (int)16));
lbl47:
                        // 2 sources

                        switch ((int)v4 /* !! */ ) {
                            case -900394635: {
                                v5 = dg.byfu("byha", byfr(int ), (int)17);
                                continue block23;
                            }
                            case 197604367: {
                                v5 = dg.byfu("byhb", byfr(int ), (int)18);
                                continue block23;
                            }
                            case 316259682: {
                                v5 = dg.byfu("byhc", byfr(int ), (int)19);
                                continue block23;
                            }
                            case 1925348754: {
                                break block23;
                            }
                        }
                        break;
                    }
                    this.type = var1_1;
                    if (var2_4) continue block21;
                    return;
                    case 0: {
                        var3_3 /* !! */  = (int)dg.byfu("byhd", byfz(int ), (int)11);
                        if (var4_2) {
                            throw null;
                        }
lbl66:
                        // 3 sources

                        var3_3 /* !! */  = (int)dg.byfu("byhh", byfz(int ), (int)15);
                        if (var4_2) {
                            throw null;
                        }
lbl69:
                        // 3 sources

                        var3_3 /* !! */  = (int)dg.byfu("byhe", byfz(int ), (int)12);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 2: {
                        var3_3 /* !! */  = (int)dg.byfu("byhf", byfz(int ), (int)13);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 3: 
                }
                break;
            }
            break;
        }
        if (true) ** GOTO lbl80
        do {
            if (true) ** continue;
lbl80:
            // 2 sources

            var3_3 /* !! */  = (int)dg.byfu("byhg", byfz(int ), (int)14);
            cfr_temp_0 = 0;
        } while (!var4_2);
        throw null;
    }

    private static /* synthetic */ void byho() {
        dg.byft[0] = -7084624928540107744L;
        dg.byft[1] = -8562542956760883874L;
        dg.byft[2] = 4238323665243875406L;
        dg.byft[3] = -3356904768752371185L;
        dg.byft[4] = -6400760841577521400L;
        dg.byft[5] = 4714017319020391229L;
        dg.byft[6] = 9110068203459202604L;
        dg.byft[7] = -3604697822949370411L;
        dg.byft[8] = -8768238426186980251L;
        dg.byft[9] = -8469139264783499902L;
        dg.byft[10] = 1839837625030671594L;
        dg.byft[11] = -5709389546118432426L;
        dg.byft[12] = -1289645345225220825L;
        dg.byft[13] = 7928172521455891227L;
        dg.byft[14] = -7948715639071514283L;
        dg.byft[15] = -1080138709477747203L;
        dg.byft[16] = -5282476684440231049L;
        dg.byft[17] = 1138587926926600400L;
        dg.byft[18] = -7805187754664307594L;
        dg.byft[19] = 4052778701720025142L;
    }

    static {
        byga = new int[19];
        bygb = new int[19];
        dg.byhl();
        dg.byhm();
        byfs = new long[20];
        byft = new long[20];
        dg.byhn();
        dg.byho();
    }

    private static /* synthetic */ int byfz(int n2) {
        return byga[n2] ^ bygb[n2];
    }

    public static /* synthetic */ CallSite byfu(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public byte getType() {
        v0 /* !! */  = dg.ew;
        if (true) ** GOTO lbl5
        block16: while (true) {
            v0 /* !! */  = (long)(v1 - dg.byfu("byfv", byfr(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -364550358: {
                    v1 = dg.byfu("byfw", byfr(int ), (int)1);
                    continue block16;
                }
                case 1735329011: {
                    v1 = dg.byfu("byfx", byfr(int ), (int)2);
                    continue block16;
                }
                case 1925348754: {
                    break block16;
                }
            }
            break;
        }
        var3_1 = dg.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = dg.ew - dg.byfu("byfy", byfr(int ), (int)3)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == dg.byfu("bygc", byfz(int ), (int)0)) break;
            v2 /* !! */  = (long)dg.byfu("bygd", byfz(int ), (int)1);
        }
        var2_2 = dg.b;
        v3 /* !! */  = dg.ew;
        if (true) ** GOTO lbl26
        block18: while (true) {
            v3 /* !! */  = (long)(v4 - dg.byfu("byge", byfr(int ), (int)4));
lbl26:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -524383132: {
                    v4 = dg.byfu("bygf", byfr(int ), (int)5);
                    continue block18;
                }
                case 994125849: {
                    v4 = dg.byfu("bygg", byfr(int ), (int)6);
                    continue block18;
                }
                case 1779237188: {
                    v4 = dg.byfu("bygh", byfr(int ), (int)7);
                    continue block18;
                }
                case 1925348754: {
                    break block18;
                }
            }
            break;
        }
        var1_3 = dg.a;
        if (var3_1) {
            throw null;
lbl41:
            // 1 sources

            return (byte)dg.byfu("bygi", byfz(int ), (int)2);
        }
        ** while (var1_3 || var1_3)
lbl44:
        // 1 sources

        v5 /* !! */  = dg.ew;
        if (true) ** GOTO lbl48
        block20: while (true) {
            v5 /* !! */  = (long)(v6 - dg.byfu("bygj", byfr(int ), (int)8));
lbl48:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case 271707368: {
                    v6 = dg.byfu("bygk", byfr(int ), (int)9);
                    continue block20;
                }
                case 1350197459: {
                    v6 = dg.byfu("bygl", byfr(int ), (int)10);
                    continue block20;
                }
                case 1925348754: {
                    break block20;
                }
            }
            break;
        }
        return this.type;
    }

    private static /* synthetic */ void byhn() {
        dg.byfs[0] = -1319488610747793991L;
        dg.byfs[1] = 7081556625653694023L;
        dg.byfs[2] = -4944712836436323357L;
        dg.byfs[3] = -431061388566558928L;
        dg.byfs[4] = 8877378609931629513L;
        dg.byfs[5] = -5250128642555645734L;
        dg.byfs[6] = -2236157113806675806L;
        dg.byfs[7] = 7962928805184600097L;
        dg.byfs[8] = 2528613239604631905L;
        dg.byfs[9] = -3220728977915419601L;
        dg.byfs[10] = -4629477992749821976L;
        dg.byfs[11] = 2001499921944133580L;
        dg.byfs[12] = 5263150518229184080L;
        dg.byfs[13] = -109404912891960200L;
        dg.byfs[14] = 2312908649057914559L;
        dg.byfs[15] = -7978490060241228407L;
        dg.byfs[16] = 1228636483840890381L;
        dg.byfs[17] = 603010926140876186L;
        dg.byfs[18] = 4602647762491087924L;
        dg.byfs[19] = 8520035914370645821L;
    }

    private static /* synthetic */ long byfr(int n2) {
        return byfs[n2] ^ byft[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public dg(byte var1_1) {
        var3_2 /* !! */  = dg.b;
        var2_3 = dg.a;
        super();
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.type = var1_1;
                return;
            }
lbl9:
            // 2 sources

            case 0: {
                var3_2 /* !! */  = (int)dg.byfu("byhi", byfz(int ), (int)16);
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_2 /* !! */  = (int)dg.byfu("byhj", byfz(int ), (int)17);
                    ** GOTO lbl9
                    break;
                }
            }
            case 2: 
        }
        var3_2 /* !! */  = (int)dg.byfu("byhk", byfz(int ), (int)18);
        ** while (true)
    }

    private static /* synthetic */ void byhl() {
        dg.byga[0] = -1818380479;
        dg.byga[1] = -1968163823;
        dg.byga[2] = -1692984271;
        dg.byga[3] = 747701263;
        dg.byga[4] = 989831668;
        dg.byga[5] = 746847598;
        dg.byga[6] = -649677496;
        dg.byga[7] = 624854257;
        dg.byga[8] = 1193372452;
        dg.byga[9] = -1373925219;
        dg.byga[10] = -536362216;
        dg.byga[11] = 1851165481;
        dg.byga[12] = -158631213;
        dg.byga[13] = 2078906918;
        dg.byga[14] = -1792586217;
        dg.byga[15] = -24421022;
        dg.byga[16] = -1271573560;
        dg.byga[17] = 1190690839;
        dg.byga[18] = 1953602423;
    }

    private static /* synthetic */ void byhm() {
        dg.bygb[0] = 1818380478;
        dg.bygb[1] = -29668106;
        dg.bygb[2] = -1692984310;
        dg.bygb[3] = 747701261;
        dg.bygb[4] = 989831669;
        dg.bygb[5] = 746847598;
        dg.bygb[6] = -649677495;
        dg.bygb[7] = -624854258;
        dg.bygb[8] = -1134200923;
        dg.bygb[9] = 1373925218;
        dg.bygb[10] = 591824886;
        dg.bygb[11] = 1851165483;
        dg.bygb[12] = -158631209;
        dg.bygb[13] = 2078906919;
        dg.bygb[14] = -1792586219;
        dg.bygb[15] = -24421024;
        dg.bygb[16] = -1271573560;
        dg.bygb[17] = 1190690839;
        dg.bygb[18] = 1953602423;
    }
}

