/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import ruhack.phobia.ff;
import ruhack.phobia.fq;
import ruhack.phobia.kb;

class ff$1
extends kb {
    private static long[] iuma;
    public static final int b;
    final /* synthetic */ ff this$0;
    private static long[] iulz;
    private static final long ql = -7441972690025301585L;
    private static int[] iuls;
    public static final boolean a;
    public static final boolean c;
    private static int[] iult;

    private static /* synthetic */ void iunk() {
        ff$1.iuma[0] = 6289547215788704487L;
        ff$1.iuma[1] = 5861963768239983697L;
        ff$1.iuma[2] = -6183014324569660958L;
        ff$1.iuma[3] = 5131543729370989019L;
        ff$1.iuma[4] = 7721171131523907175L;
        ff$1.iuma[5] = -1955648189691202498L;
        ff$1.iuma[6] = 9045097093057449140L;
        ff$1.iuma[7] = 7332360614534942883L;
        ff$1.iuma[8] = 5930023364075476668L;
        ff$1.iuma[9] = 3561997199754949186L;
        ff$1.iuma[10] = -7281098703346065845L;
        ff$1.iuma[11] = -5276970348993824065L;
        ff$1.iuma[12] = -3253023830049688062L;
    }

    private static /* synthetic */ long iuly(int n2) {
        return iulz[n2] ^ iuma[n2];
    }

    public static /* synthetic */ CallSite iulu(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public kb setValue(boolean var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ff$1.ql - ff$1.iulu("iumb", iuly(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ff$1.iulu("iumc", iulr(int ), (int)3)) break;
            v0 /* !! */  = (long)ff$1.iulu("iumd", iulr(int ), (int)4);
        }
        var4_2 = ff$1.c;
        v1 /* !! */  = ff$1.ql;
        if (true) ** GOTO lbl12
        block29: while (true) {
            v1 /* !! */  = (long)(ff$1.iulu("iumf", iuly(int ), (int)2) - ff$1.iulu("iume", iuly(int ), (int)1));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -2031994449: {
                    break block29;
                }
                case 2020630998: {
                    continue block29;
                }
            }
            break;
        }
        var3_3 /* !! */  = ff$1.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = ff$1.ql - ff$1.iulu("iumg", iuly(int ), (int)3)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == ff$1.iulu("iumh", iulr(int ), (int)5)) break;
            v2 /* !! */  = (long)ff$1.iulu("iumi", iulr(int ), (int)6);
        }
        var2_4 = ff$1.a;
        if (var4_2) {
            throw null;
lbl27:
            // 6 sources

            return null;
        }
        if (var2_4 || var2_4) ** GOTO lbl27
        v3 /* !! */  = ff$1.ql;
        if (true) ** GOTO lbl34
        block32: while (true) {
            v3 /* !! */  = (long)(v4 - ff$1.iulu("iumj", iuly(int ), (int)4));
lbl34:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -2031994449: {
                    break block32;
                }
                case -945922626: {
                    v4 = ff$1.iulu("iumk", iuly(int ), (int)5);
                    continue block32;
                }
                case -180816725: {
                    v4 = ff$1.iulu("iuml", iuly(int ), (int)6);
                    continue block32;
                }
            }
            break;
        }
        super.setValue(var1_1);
        if (var2_4) ** GOTO lbl27
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        block9 : switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** GOTO lbl27
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_2 = ff$1.ql - ff$1.iulu("iumm", iuly(int ), (int)7)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == ff$1.iulu("iumn", iulr(int ), (int)7)) break;
                    v5 /* !! */  = (long)ff$1.iulu("iumo", iulr(int ), (int)8);
                }
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_3 = ff$1.ql - ff$1.iulu("iump", iuly(int ), (int)8)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v6 /* !! */  == ff$1.iulu("iumq", iulr(int ), (int)9)) break;
                    v6 /* !! */  = (long)ff$1.iulu("iumr", iulr(int ), (int)10);
                }
                if (ff.instance != this.this$0) ** GOTO lbl82
                if (var2_4 || var2_4) ** GOTO lbl27
                v7 /* !! */  = ff$1.ql;
                if (true) ** GOTO lbl68
                block35: while (true) {
                    v7 /* !! */  = (long)(v8 - ff$1.iulu("iums", iuly(int ), (int)9));
lbl68:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -2031994449: {
                            break block35;
                        }
                        case -1275470041: {
                            v8 = ff$1.iulu("iumt", iuly(int ), (int)10);
                            continue block35;
                        }
                        case -229064580: {
                            v8 = ff$1.iulu("iumu", iuly(int ), (int)11);
                            continue block35;
                        }
                        case 458091059: {
                            v8 = ff$1.iulu("iumv", iuly(int ), (int)12);
                            continue block35;
                        }
                    }
                    break;
                }
                fq.setEnabled(var1_1);
                if (var2_4) ** GOTO lbl27
lbl82:
                // 2 sources

                if (!var2_4 && !var2_4) ** break;
                ** continue;
                return this;
            }
lbl85:
            // 3 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)ff$1.iulu("iumw", iulr(int ), (int)11);
                    if (!var4_2) break block9;
                    throw null;
                }
            }
            case 1: {
                var3_3 /* !! */  = (int)ff$1.iulu("iumx", iulr(int ), (int)12);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl125
            }
            case 2: {
                do {
                    var3_3 /* !! */  = (int)ff$1.iulu("iumy", iulr(int ), (int)13);
                } while (!var4_2);
                throw null;
            }
lbl100:
            // 2 sources

            case 3: {
                var3_3 /* !! */  = (int)ff$1.iulu("iumz", iulr(int ), (int)14);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl125
            }
            case 4: {
                var3_3 /* !! */  = (int)ff$1.iulu("iuna", iulr(int ), (int)15);
                if (!var4_2) ** GOTO lbl100
                throw null;
            }
lbl109:
            // 2 sources

            case 5: {
                var3_3 /* !! */  = (int)ff$1.iulu("iunb", iulr(int ), (int)16);
                if (!var4_2) ** GOTO lbl85
                throw null;
            }
lbl113:
            // 2 sources

            case 6: {
                var3_3 /* !! */  = (int)ff$1.iulu("iunc", iulr(int ), (int)17);
                if (!var4_2) ** GOTO lbl109
                throw null;
            }
            case 7: {
                var3_3 /* !! */  = (int)ff$1.iulu("iund", iulr(int ), (int)18);
                if (!var4_2) ** GOTO lbl85
                throw null;
            }
            case 8: {
                var3_3 /* !! */  = (int)ff$1.iulu("iune", iulr(int ), (int)19);
                if (!var4_2) ** GOTO lbl113
                throw null;
            }
lbl125:
            // 3 sources

            case 9: {
                var3_3 /* !! */  = (int)ff$1.iulu("iunf", iulr(int ), (int)20);
                if (!var4_2) break;
                throw null;
            }
            case 10: 
        }
        var3_3 /* !! */  = (int)ff$1.iulu("iung", iulr(int ), (int)21);
        ** while (!var4_2)
lbl132:
        // 1 sources

        throw null;
    }

    static {
        iuls = new int[22];
        iult = new int[22];
        ff$1.iunh();
        ff$1.iuni();
        iulz = new long[13];
        iuma = new long[13];
        ff$1.iunj();
        ff$1.iunk();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    ff$1(ff var1_1, String var2_2, String var3_3) {
        var5_4 /* !! */  = ff$1.b;
        if (var5_4 /* !! */  == 0) ** GOTO lbl-1000
        block0 : switch (var5_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.this$0 = var1_1;
                super(var2_2, var3_3);
                return;
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_4 /* !! */  = (int)ff$1.iulu("iulv", iulr(int ), (int)0);
                    break block0;
                    break;
                }
            }
            case 1: {
                var5_4 /* !! */  = (int)ff$1.iulu("iulw", iulr(int ), (int)1);
            }
            case 2: 
        }
        var5_4 /* !! */  = (int)ff$1.iulu("iulx", iulr(int ), (int)2);
        ** while (true)
    }

    private static /* synthetic */ void iunj() {
        ff$1.iulz[0] = 6323012970769214363L;
        ff$1.iulz[1] = 6471722571748782570L;
        ff$1.iulz[2] = 4597355635396434049L;
        ff$1.iulz[3] = -3734146152266487664L;
        ff$1.iulz[4] = -1924167918629928361L;
        ff$1.iulz[5] = -7597782923578681104L;
        ff$1.iulz[6] = -8112676935290518564L;
        ff$1.iulz[7] = 6864930171972562373L;
        ff$1.iulz[8] = -4507133889128129680L;
        ff$1.iulz[9] = -1350482672218825525L;
        ff$1.iulz[10] = -2923785389398812553L;
        ff$1.iulz[11] = 1719920209073370634L;
        ff$1.iulz[12] = -2394040573853161145L;
    }

    private static /* synthetic */ void iuni() {
        ff$1.iult[0] = 1631169902;
        ff$1.iult[1] = -1710597910;
        ff$1.iult[2] = -802897717;
        ff$1.iult[3] = -1723822144;
        ff$1.iult[4] = 1524836390;
        ff$1.iult[5] = 1392072226;
        ff$1.iult[6] = 1997570335;
        ff$1.iult[7] = -1796910393;
        ff$1.iult[8] = -759848258;
        ff$1.iult[9] = 995096813;
        ff$1.iult[10] = 1840705380;
        ff$1.iult[11] = 1751321513;
        ff$1.iult[12] = -908314545;
        ff$1.iult[13] = -2140068362;
        ff$1.iult[14] = -1203833754;
        ff$1.iult[15] = -918600349;
        ff$1.iult[16] = -1722666838;
        ff$1.iult[17] = 2001821465;
        ff$1.iult[18] = 295685448;
        ff$1.iult[19] = 522021212;
        ff$1.iult[20] = -1216642975;
        ff$1.iult[21] = -581034280;
    }

    private static /* synthetic */ int iulr(int n2) {
        return iuls[n2] ^ iult[n2];
    }

    private static /* synthetic */ void iunh() {
        ff$1.iuls[0] = 1631169903;
        ff$1.iuls[1] = -1710597910;
        ff$1.iuls[2] = -802897719;
        ff$1.iuls[3] = 1723822143;
        ff$1.iuls[4] = -94638829;
        ff$1.iuls[5] = 1392072227;
        ff$1.iuls[6] = 889198461;
        ff$1.iuls[7] = 1796910392;
        ff$1.iuls[8] = -637342138;
        ff$1.iuls[9] = 995096812;
        ff$1.iuls[10] = 1399606139;
        ff$1.iuls[11] = 1751321517;
        ff$1.iuls[12] = -908314545;
        ff$1.iuls[13] = -2140068354;
        ff$1.iuls[14] = -1203833760;
        ff$1.iuls[15] = -918600343;
        ff$1.iuls[16] = -1722666848;
        ff$1.iuls[17] = 2001821469;
        ff$1.iuls[18] = 295685451;
        ff$1.iuls[19] = 522021214;
        ff$1.iuls[20] = -1216642976;
        ff$1.iuls[21] = -581034276;
    }
}

