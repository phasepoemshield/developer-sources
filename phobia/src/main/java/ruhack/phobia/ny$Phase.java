/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

public final class ny$Phase
extends Enum<ny$Phase> {
    private static long[] cvvp;
    public static final /* enum */ ny$Phase POST_SWAP;
    public static final /* enum */ ny$Phase IDLE;
    private static long[] cvvq;
    public static final boolean a;
    public static final /* enum */ ny$Phase RESUMING;
    public static final /* enum */ ny$Phase WAIT_STOP;
    public static final boolean c;
    public static final /* enum */ ny$Phase FINISHED;
    static final long gp = 5413428223649478812L;
    private static int[] cvvz;
    public static final /* enum */ ny$Phase SWAPPING;
    public static final /* enum */ ny$Phase PRE_SWAP;
    private static final /* synthetic */ ny$Phase[] $VALUES;
    public static final int b;
    private static int[] cvwb;
    public static final /* enum */ ny$Phase STOPPING;
    public static final /* enum */ ny$Phase PRE_STOP;

    private static /* synthetic */ void cwer() {
        ny$Phase.cvwb[0] = -1872552537;
        ny$Phase.cvwb[1] = -151640866;
        ny$Phase.cvwb[2] = -1066741082;
        ny$Phase.cvwb[3] = -1323094100;
        ny$Phase.cvwb[4] = 1167714724;
        ny$Phase.cvwb[5] = 907219764;
        ny$Phase.cvwb[6] = 208650085;
        ny$Phase.cvwb[7] = 1321358928;
        ny$Phase.cvwb[8] = 590544354;
        ny$Phase.cvwb[9] = 2044735198;
        ny$Phase.cvwb[10] = 1674933019;
        ny$Phase.cvwb[11] = 164572982;
        ny$Phase.cvwb[12] = 1763607392;
        ny$Phase.cvwb[13] = -632872660;
        ny$Phase.cvwb[14] = -1951032905;
        ny$Phase.cvwb[15] = 41222026;
        ny$Phase.cvwb[16] = 1238986215;
        ny$Phase.cvwb[17] = 1672758790;
        ny$Phase.cvwb[18] = -948355821;
        ny$Phase.cvwb[19] = -1011939244;
        ny$Phase.cvwb[20] = -1645295318;
        ny$Phase.cvwb[21] = 922905068;
        ny$Phase.cvwb[22] = -1254335398;
        ny$Phase.cvwb[23] = 1449133169;
        ny$Phase.cvwb[24] = 870998561;
        ny$Phase.cvwb[25] = -1385717397;
        ny$Phase.cvwb[26] = 2011694087;
        ny$Phase.cvwb[27] = -1027297116;
        ny$Phase.cvwb[28] = -1901038295;
        ny$Phase.cvwb[29] = 1420082895;
        ny$Phase.cvwb[30] = -821265585;
        ny$Phase.cvwb[31] = 446618089;
        ny$Phase.cvwb[32] = -71271130;
        ny$Phase.cvwb[33] = 418277606;
        ny$Phase.cvwb[34] = 77317789;
        ny$Phase.cvwb[35] = -53625400;
        ny$Phase.cvwb[36] = -2032576135;
        ny$Phase.cvwb[37] = 1452555911;
        ny$Phase.cvwb[38] = -976177005;
        ny$Phase.cvwb[39] = -1094338222;
        ny$Phase.cvwb[40] = -1527821614;
        ny$Phase.cvwb[41] = 1960498701;
        ny$Phase.cvwb[42] = 955704578;
        ny$Phase.cvwb[43] = -1266642802;
        ny$Phase.cvwb[44] = 1940894175;
        ny$Phase.cvwb[45] = -1817480196;
        ny$Phase.cvwb[46] = -1542647787;
        ny$Phase.cvwb[47] = 1039355909;
        ny$Phase.cvwb[48] = 1015364868;
        ny$Phase.cvwb[49] = -1010753274;
        ny$Phase.cvwb[50] = -536976459;
        ny$Phase.cvwb[51] = -173967903;
        ny$Phase.cvwb[52] = -890555543;
        ny$Phase.cvwb[53] = 1583784363;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ ny$Phase[] $values() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ny$Phase.gp - ny$Phase.cvvr("cvzm", cvvo(int ), (int)13)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ny$Phase.cvvr("cvzn", cvvx(int ), (int)25)) break;
            v0 /* !! */  = (long)ny$Phase.cvvr("cvzp", cvvx(int ), (int)26);
        }
        var2 = ny$Phase.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ny$Phase.gp - ny$Phase.cvvr("cvzr", cvvo(int ), (int)14)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == ny$Phase.cvvr("cvzw", cvvx(int ), (int)27)) break;
            v1 /* !! */  = (long)ny$Phase.cvvr("cvzx", cvvx(int ), (int)28);
        }
        var1_1 = ny$Phase.b;
        v2 /* !! */  = ny$Phase.gp;
        if (true) ** GOTO lbl19
        block40: while (true) {
            v2 /* !! */  = (long)(v3 - ny$Phase.cvvr("cvzy", cvvo(int ), (int)15));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1347192676: {
                    break block40;
                }
                case -1165139113: {
                    v3 = ny$Phase.cvvr("cvzz", cvvo(int ), (int)16);
                    continue block40;
                }
                case 1183367308: {
                    v3 = ny$Phase.cvvr("cwaa", cvvo(int ), (int)17);
                    continue block40;
                }
                case 1520181675: {
                    v3 = ny$Phase.cvvr("cwac", cvvo(int ), (int)18);
                    continue block40;
                }
            }
            break;
        }
        var0_2 = ny$Phase.a;
        if (var2) {
            throw null;
lbl34:
            // 1 sources

            return null;
        }
        ** while (var0_2 || var0_2)
lbl37:
        // 1 sources

        v4 = new ny$Phase[9];
        v5 = ny$Phase.cvvr("cwaf", cvvx(int ), (int)29);
        while (true) {
            if ((v6 = (cfr_temp_2 = ny$Phase.gp - ny$Phase.cvvr("cwaj", cvvo(int ), (int)19)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v6 == ny$Phase.cvvr("cwak", cvvx(int ), (int)30)) break;
            v6 = 1123145539;
        }
        v4[v5] = ny$Phase.IDLE;
        v7 = ny$Phase.cvvr("cwam", cvvx(int ), (int)31);
        v8 /* !! */  = ny$Phase.gp;
        if (true) ** GOTO lbl51
        block43: while (true) {
            v8 /* !! */  = (long)(v9 - ny$Phase.cvvr("cwao", cvvo(int ), (int)20));
lbl51:
            // 2 sources

            switch ((int)v8 /* !! */ ) {
                case -1499544762: {
                    v9 = ny$Phase.cvvr("cwap", cvvo(int ), (int)21);
                    continue block43;
                }
                case -1368684837: {
                    v9 = ny$Phase.cvvr("cwar", cvvo(int ), (int)22);
                    continue block43;
                }
                case -1347192676: {
                    break block43;
                }
                case -956314997: {
                    v9 = ny$Phase.cvvr("cwas", cvvo(int ), (int)23);
                    continue block43;
                }
            }
            break;
        }
        v4[v7] = ny$Phase.PRE_STOP;
        v10 = ny$Phase.cvvr("cwaw", cvvx(int ), (int)32);
        v11 /* !! */  = ny$Phase.gp;
        if (true) ** GOTO lbl69
        block44: while (true) {
            v11 /* !! */  = (long)(v12 - ny$Phase.cvvr("cway", cvvo(int ), (int)24));
lbl69:
            // 2 sources

            switch ((int)v11 /* !! */ ) {
                case -1347192676: {
                    break block44;
                }
                case -1271694821: {
                    v12 = ny$Phase.cvvr("cwba", cvvo(int ), (int)25);
                    continue block44;
                }
                case -1116456926: {
                    v12 = ny$Phase.cvvr("cwbc", cvvo(int ), (int)26);
                    continue block44;
                }
            }
            break;
        }
        v4[v10] = ny$Phase.STOPPING;
        v13 = ny$Phase.cvvr("cwbd", cvvx(int ), (int)33);
        v14 /* !! */  = ny$Phase.gp;
        if (true) ** GOTO lbl84
        block45: while (true) {
            v14 /* !! */  = (long)(ny$Phase.cvvr("cwbj", cvvo(int ), (int)28) - ny$Phase.cvvr("cwbh", cvvo(int ), (int)27));
lbl84:
            // 2 sources

            switch ((int)v14 /* !! */ ) {
                case -1823429294: {
                    continue block45;
                }
                case -1347192676: {
                    break block45;
                }
            }
            break;
        }
        v4[v13] = ny$Phase.WAIT_STOP;
        v15 = ny$Phase.cvvr("cwbk", cvvx(int ), (int)34);
        v16 /* !! */  = ny$Phase.gp;
        if (true) ** GOTO lbl95
        block46: while (true) {
            v16 /* !! */  = (long)(v17 - ny$Phase.cvvr("cwbm", cvvo(int ), (int)29));
lbl95:
            // 2 sources

            switch ((int)v16 /* !! */ ) {
                case -1347192676: {
                    break block46;
                }
                case -1342236013: {
                    v17 = ny$Phase.cvvr("cwbn", cvvo(int ), (int)30);
                    continue block46;
                }
                case 150400216: {
                    v17 = ny$Phase.cvvr("cwbp", cvvo(int ), (int)31);
                    continue block46;
                }
                case 712479654: {
                    v17 = ny$Phase.cvvr("cwbq", cvvo(int ), (int)32);
                    continue block46;
                }
            }
            break;
        }
        v4[v15] = ny$Phase.PRE_SWAP;
        v18 = ny$Phase.cvvr("cwbu", cvvx(int ), (int)35);
        while (true) {
            if ((v19 = (cfr_temp_3 = ny$Phase.gp - ny$Phase.cvvr("cwbw", cvvo(int ), (int)33)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v19 == ny$Phase.cvvr("cwby", cvvx(int ), (int)36)) break;
            v19 = -177552784;
        }
        v4[v18] = ny$Phase.SWAPPING;
        v20 = ny$Phase.cvvr("cwca", cvvx(int ), (int)37);
        v21 /* !! */  = ny$Phase.gp;
        if (true) ** GOTO lbl121
        block48: while (true) {
            v21 /* !! */  = (long)(v22 - ny$Phase.cvvr("cwcc", cvvo(int ), (int)34));
lbl121:
            // 2 sources

            switch ((int)v21 /* !! */ ) {
                case -1347192676: {
                    break block48;
                }
                case -265170210: {
                    v22 = ny$Phase.cvvr("cwce", cvvo(int ), (int)35);
                    continue block48;
                }
                case 342570639: {
                    v22 = ny$Phase.cvvr("cwcj", cvvo(int ), (int)36);
                    continue block48;
                }
                case 2080272895: {
                    v22 = ny$Phase.cvvr("cwcl", cvvo(int ), (int)37);
                    continue block48;
                }
            }
            break;
        }
        v4[v20] = ny$Phase.POST_SWAP;
        v23 = ny$Phase.cvvr("cwcn", cvvx(int ), (int)38);
        v24 /* !! */  = ny$Phase.gp;
        if (true) ** GOTO lbl139
        block49: while (true) {
            v24 /* !! */  = (long)(v25 - ny$Phase.cvvr("cwcp", cvvo(int ), (int)38));
lbl139:
            // 2 sources

            switch ((int)v24 /* !! */ ) {
                case -1347192676: {
                    break block49;
                }
                case -206537779: {
                    v25 = ny$Phase.cvvr("cwcq", cvvo(int ), (int)39);
                    continue block49;
                }
                case 599728034: {
                    v25 = ny$Phase.cvvr("cwcr", cvvo(int ), (int)40);
                    continue block49;
                }
            }
            break;
        }
        v4[v23] = ny$Phase.RESUMING;
        v26 = ny$Phase.cvvr("cwct", cvvx(int ), (int)39);
        while (true) {
            if ((v27 = (cfr_temp_4 = ny$Phase.gp - ny$Phase.cvvr("cwcy", cvvo(int ), (int)41)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v27 == ny$Phase.cvvr("cwda", cvvx(int ), (int)40)) break;
            v27 = 55690826;
        }
        v4[v26] = ny$Phase.FINISHED;
        return v4;
    }

    private static /* synthetic */ int cvvx(int n2) {
        return cvvz[n2] ^ cvwb[n2];
    }

    public static /* synthetic */ CallSite cvvr(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static ny$Phase[] values() {
        v0 /* !! */  = ny$Phase.gp;
        if (true) ** GOTO lbl5
        block16: while (true) {
            v0 /* !! */  = (long)(ny$Phase.cvvr("cvvu", cvvo(int ), (int)1) - ny$Phase.cvvr("cvvs", cvvo(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1347192676: {
                    break block16;
                }
                case 1257852462: {
                    continue block16;
                }
            }
            break;
        }
        var2 = ny$Phase.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = ny$Phase.gp - ny$Phase.cvvr("cvvw", cvvo(int ), (int)2)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == ny$Phase.cvvr("cvwc", cvvx(int ), (int)0)) break;
            v1 /* !! */  = (long)ny$Phase.cvvr("cvwj", cvvx(int ), (int)1);
        }
        var1_1 /* !! */  = ny$Phase.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = ny$Phase.gp - ny$Phase.cvvr("cvwk", cvvo(int ), (int)3)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == ny$Phase.cvvr("cvwl", cvvx(int ), (int)2)) break;
            v2 /* !! */  = (long)ny$Phase.cvvr("cvwm", cvvx(int ), (int)3);
        }
        var0_2 = ny$Phase.a;
        if (var2) {
            throw null;
            return null;
        }
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        block4 : switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var0_2 || var0_2) ** continue;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = ny$Phase.gp - ny$Phase.cvvr("cvwn", cvvo(int ), (int)4)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == ny$Phase.cvvr("cvwo", cvvx(int ), (int)4)) break;
                    v3 /* !! */  = (long)ny$Phase.cvvr("cvwp", cvvx(int ), (int)5);
                }
                v4 /* !! */  = ny$Phase.gp;
                if (true) ** GOTO lbl43
                block21: while (true) {
                    v4 /* !! */  = (long)(v5 - ny$Phase.cvvr("cvxa", cvvo(int ), (int)5));
lbl43:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1815646348: {
                            v5 = ny$Phase.cvvr("cvxc", cvvo(int ), (int)6);
                            continue block21;
                        }
                        case -1347192676: {
                            break block21;
                        }
                        case -1089207124: {
                            v5 = ny$Phase.cvvr("cvxe", cvvo(int ), (int)7);
                            continue block21;
                        }
                        case 530512556: {
                            v5 = ny$Phase.cvvr("cvxg", cvvo(int ), (int)8);
                            continue block21;
                        }
                    }
                    break;
                }
                return (ny$Phase[])ny$Phase.$VALUES.clone();
            }
            case 0: {
                do {
                    var1_1 /* !! */  = (int)ny$Phase.cvvr("cvxi", cvvx(int ), (int)6);
                } while (!var2);
                throw null;
            }
lbl61:
            // 2 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)ny$Phase.cvvr("cvxk", cvvx(int ), (int)7);
                    if (!var2) break block4;
                    throw null;
                }
            }
            case 2: {
                var1_1 /* !! */  = (int)ny$Phase.cvvr("cvxl", cvvx(int ), (int)8);
                if (!var2) ** GOTO lbl61
                throw null;
            }
            case 3: 
        }
        var1_1 /* !! */  = (int)ny$Phase.cvvr("cvxq", cvvx(int ), (int)9);
        ** while (!var2)
lbl73:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void cwei() {
        ny$Phase.cvvz[0] = -1872552538;
        ny$Phase.cvvz[1] = 1767100687;
        ny$Phase.cvvz[2] = -1066741081;
        ny$Phase.cvvz[3] = 2124444652;
        ny$Phase.cvvz[4] = 1167714725;
        ny$Phase.cvvz[5] = -63235975;
        ny$Phase.cvvz[6] = 208650084;
        ny$Phase.cvvz[7] = 1321358929;
        ny$Phase.cvvz[8] = 590544354;
        ny$Phase.cvvz[9] = 2044735197;
        ny$Phase.cvvz[10] = 1674933018;
        ny$Phase.cvvz[11] = 553191717;
        ny$Phase.cvvz[12] = -1763607393;
        ny$Phase.cvvz[13] = 437838288;
        ny$Phase.cvvz[14] = 1951032904;
        ny$Phase.cvvz[15] = -84040276;
        ny$Phase.cvvz[16] = 1238986214;
        ny$Phase.cvvz[17] = 987422728;
        ny$Phase.cvvz[18] = -948355824;
        ny$Phase.cvvz[19] = -1011939242;
        ny$Phase.cvvz[20] = -1645295318;
        ny$Phase.cvvz[21] = 922905071;
        ny$Phase.cvvz[22] = -1254335400;
        ny$Phase.cvvz[23] = 1449133171;
        ny$Phase.cvvz[24] = 870998560;
        ny$Phase.cvvz[25] = -1385717398;
        ny$Phase.cvvz[26] = -1856788394;
        ny$Phase.cvvz[27] = 1027297115;
        ny$Phase.cvvz[28] = 1088129914;
        ny$Phase.cvvz[29] = 1420082895;
        ny$Phase.cvvz[30] = -821265586;
        ny$Phase.cvvz[31] = 446618088;
        ny$Phase.cvvz[32] = -71271132;
        ny$Phase.cvvz[33] = 418277605;
        ny$Phase.cvvz[34] = 77317785;
        ny$Phase.cvvz[35] = -53625395;
        ny$Phase.cvvz[36] = -2032576136;
        ny$Phase.cvvz[37] = 1452555905;
        ny$Phase.cvvz[38] = -976177004;
        ny$Phase.cvvz[39] = -1094338214;
        ny$Phase.cvvz[40] = -1527821613;
        ny$Phase.cvvz[41] = 1960498702;
        ny$Phase.cvvz[42] = 955704577;
        ny$Phase.cvvz[43] = -1266642801;
        ny$Phase.cvvz[44] = 1940894174;
        ny$Phase.cvvz[45] = -1817480196;
        ny$Phase.cvvz[46] = -1542647788;
        ny$Phase.cvvz[47] = 1039355911;
        ny$Phase.cvvz[48] = 1015364871;
        ny$Phase.cvvz[49] = -1010753278;
        ny$Phase.cvvz[50] = -536976464;
        ny$Phase.cvvz[51] = -173967897;
        ny$Phase.cvvz[52] = -890555538;
        ny$Phase.cvvz[53] = 1583784355;
    }

    private static /* synthetic */ void cwft() {
        ny$Phase.cvvq[0] = 5869801280023867252L;
        ny$Phase.cvvq[1] = 3518304551887224356L;
        ny$Phase.cvvq[2] = -1273420326987214741L;
        ny$Phase.cvvq[3] = 3035140157335346431L;
        ny$Phase.cvvq[4] = -3403521162389009921L;
        ny$Phase.cvvq[5] = -1208382400338887532L;
        ny$Phase.cvvq[6] = -3175778011354319755L;
        ny$Phase.cvvq[7] = 7370950102312618954L;
        ny$Phase.cvvq[8] = 4331446862804856806L;
        ny$Phase.cvvq[9] = 4746789864340992123L;
        ny$Phase.cvvq[10] = -1508003117400478064L;
        ny$Phase.cvvq[11] = -8104012256850227390L;
        ny$Phase.cvvq[12] = -3936295473969706375L;
        ny$Phase.cvvq[13] = 4872535229955671936L;
        ny$Phase.cvvq[14] = 2201911163971630141L;
        ny$Phase.cvvq[15] = 6025164247345687053L;
        ny$Phase.cvvq[16] = -6641769024355905387L;
        ny$Phase.cvvq[17] = 6984846861160027392L;
        ny$Phase.cvvq[18] = 5418131066278725393L;
        ny$Phase.cvvq[19] = 8216027856120865054L;
        ny$Phase.cvvq[20] = -5795315585829807047L;
        ny$Phase.cvvq[21] = -4447325119067407939L;
        ny$Phase.cvvq[22] = 8798591553973759809L;
        ny$Phase.cvvq[23] = -9172379565015626439L;
        ny$Phase.cvvq[24] = 5769899771442670983L;
        ny$Phase.cvvq[25] = 6252988445482723986L;
        ny$Phase.cvvq[26] = 7238222985321429810L;
        ny$Phase.cvvq[27] = 5356954368601869538L;
        ny$Phase.cvvq[28] = 9141611772693306542L;
        ny$Phase.cvvq[29] = 3671190741783510741L;
        ny$Phase.cvvq[30] = -9043227697425840613L;
        ny$Phase.cvvq[31] = 6844384619045818390L;
        ny$Phase.cvvq[32] = 3810686941844114153L;
        ny$Phase.cvvq[33] = -4799514946733218557L;
        ny$Phase.cvvq[34] = 8683252002484110425L;
        ny$Phase.cvvq[35] = 4954201946411444109L;
        ny$Phase.cvvq[36] = 6303024571911456547L;
        ny$Phase.cvvq[37] = -7916749350484933541L;
        ny$Phase.cvvq[38] = -6248278670283248336L;
        ny$Phase.cvvq[39] = 1256330227489035168L;
        ny$Phase.cvvq[40] = -1731029320725493266L;
        ny$Phase.cvvq[41] = 6840116236197651343L;
    }

    private static /* synthetic */ long cvvo(int n2) {
        return cvvp[n2] ^ cvvq[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private ny$Phase() {
        var4_3 /* !! */  = ny$Phase.b;
        var3_4 = ny$Phase.a;
        super(var1_1, var2_2);
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                return;
            }
lbl8:
            // 2 sources

            case 0: {
                var4_3 /* !! */  = (int)ny$Phase.cvvr("cvzb", cvvx(int ), (int)22);
                break;
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_3 /* !! */  = (int)ny$Phase.cvvr("cvzc", cvvx(int ), (int)23);
                    ** GOTO lbl8
                    break;
                }
            }
            case 2: 
        }
        var4_3 /* !! */  = (int)ny$Phase.cvvr("cvze", cvvx(int ), (int)24);
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    public static ny$Phase valueOf(String string) {
        boolean bl2;
        while (true) {
            long l2;
            Object object;
            if ((object = (l2 = gp - ny$Phase.cvvr("cvxt", cvvo(int ), (int)9)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object == ny$Phase.cvvr("cvxv", cvvx(int ), (int)10)) break;
            object = ny$Phase.cvvr("cvxw", cvvx(int ), (int)11);
        }
        boolean bl3 = c;
        while (true) {
            long l3;
            Object object;
            if ((object = (l3 = gp - ny$Phase.cvvr("cvxy", cvvo(int ), (int)10)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object == ny$Phase.cvvr("cvxz", cvvx(int ), (int)12)) break;
            object = ny$Phase.cvvr("cvyf", cvvx(int ), (int)13);
        }
        int n2 = b;
        while (true) {
            long l4;
            Object object;
            if ((object = (l4 = gp - ny$Phase.cvvr("cvyh", cvvo(int ), (int)11)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            if (object == ny$Phase.cvvr("cvyi", cvvx(int ), (int)14)) {
                bl2 = a;
                if (bl3) {
                    throw null;
                }
                break;
            }
            object = ny$Phase.cvvr("cvyk", cvvx(int ), (int)15);
        }
        if (bl2) return null;
        if (bl2) return null;
        while (true) {
            long l5;
            Object object;
            if ((object = (l5 = gp - ny$Phase.cvvr("cvyn", cvvo(int ), (int)12)) == 0L ? 0 : (l5 < 0L ? -1 : 1)) == false) continue;
            if (object == ny$Phase.cvvr("cvyo", cvvx(int ), (int)16)) {
                return Enum.valueOf(ny$Phase.class, string);
            }
            object = ny$Phase.cvvr("cvyp", cvvx(int ), (int)17);
        }
    }

    private static /* synthetic */ void cwfj() {
        ny$Phase.cvvp[0] = -1825055285711250389L;
        ny$Phase.cvvp[1] = -416489358725864886L;
        ny$Phase.cvvp[2] = 192517864483511908L;
        ny$Phase.cvvp[3] = -7520455569337989628L;
        ny$Phase.cvvp[4] = 1417602119991264052L;
        ny$Phase.cvvp[5] = -8766323013557478297L;
        ny$Phase.cvvp[6] = 6132439317853031069L;
        ny$Phase.cvvp[7] = 8369142973302989859L;
        ny$Phase.cvvp[8] = -1833619609541395088L;
        ny$Phase.cvvp[9] = -3896795007178222990L;
        ny$Phase.cvvp[10] = -4875459343124946125L;
        ny$Phase.cvvp[11] = -3000395943350487226L;
        ny$Phase.cvvp[12] = -8342554651484211599L;
        ny$Phase.cvvp[13] = -8488939736769358617L;
        ny$Phase.cvvp[14] = 5402144410759566560L;
        ny$Phase.cvvp[15] = 9095899237592085817L;
        ny$Phase.cvvp[16] = 7912385593283277854L;
        ny$Phase.cvvp[17] = -8186730720988713121L;
        ny$Phase.cvvp[18] = -3530277126464136217L;
        ny$Phase.cvvp[19] = -5401100973069493670L;
        ny$Phase.cvvp[20] = 8228714522996037263L;
        ny$Phase.cvvp[21] = 52959340825158228L;
        ny$Phase.cvvp[22] = 3652641201909638060L;
        ny$Phase.cvvp[23] = 2614919646838870235L;
        ny$Phase.cvvp[24] = 3616371213924934146L;
        ny$Phase.cvvp[25] = -6367090018272515146L;
        ny$Phase.cvvp[26] = -3246117555515906094L;
        ny$Phase.cvvp[27] = 5080525377398041510L;
        ny$Phase.cvvp[28] = 5277931935943705819L;
        ny$Phase.cvvp[29] = -7714659902488689948L;
        ny$Phase.cvvp[30] = 2007692414396655505L;
        ny$Phase.cvvp[31] = 5436834034100495077L;
        ny$Phase.cvvp[32] = -3088299637970419342L;
        ny$Phase.cvvp[33] = 8476323632182727540L;
        ny$Phase.cvvp[34] = -5520651294258972157L;
        ny$Phase.cvvp[35] = 230214002181140881L;
        ny$Phase.cvvp[36] = 7944450650704784060L;
        ny$Phase.cvvp[37] = -3150106210867959100L;
        ny$Phase.cvvp[38] = -3721301310478525996L;
        ny$Phase.cvvp[39] = -8318505205949947708L;
        ny$Phase.cvvp[40] = -5590639173666205500L;
        ny$Phase.cvvp[41] = 7232833998014039951L;
    }

    static {
        cvvz = new int[54];
        cvwb = new int[54];
        ny$Phase.cwei();
        ny$Phase.cwer();
        cvvp = new long[42];
        cvvq = new long[42];
        ny$Phase.cwfj();
        ny$Phase.cwft();
        IDLE = new ny$Phase();
        PRE_STOP = new ny$Phase();
        STOPPING = new ny$Phase();
        WAIT_STOP = new ny$Phase();
        PRE_SWAP = new ny$Phase();
        SWAPPING = new ny$Phase();
        POST_SWAP = new ny$Phase();
        RESUMING = new ny$Phase();
        FINISHED = new ny$Phase();
        $VALUES = ny$Phase.$values();
    }
}

