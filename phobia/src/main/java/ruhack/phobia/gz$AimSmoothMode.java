/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_243
 *  net.minecraft.class_3532
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.minecraft.class_1297;
import net.minecraft.class_243;
import net.minecraft.class_3532;
import ruhack.phobia.hx;
import ruhack.phobia.ov;
import ruhack.phobia.ow;

final class gz$AimSmoothMode
extends hx {
    private static final float AIM_PITCH_STEP = 18.0f;
    private static int[] ihpc = new int[55];
    private static final float AIM_YAW_STEP = 28.0f;
    public static final boolean a;
    public static final boolean c;
    public static final int b;
    public static final long pp = -3485514744183124592L;
    private static long[] ihrl;
    private static int[] ihpd;
    private static final float RESET_YAW_STEP = 20.0f;
    private static final float RESET_PITCH_STEP = 14.0f;
    private static long[] ihrk;

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private gz$AimSmoothMode() {
        int n2 = b;
        super("AimBotFocused");
        if (n2 == 0) return;
        switch (n2) {
            default: {
                return;
            }
            case 1: {
                CallSite callSite = gz$AimSmoothMode.ihpe("ihpg", ihpb(int ), (int)1);
            }
            case 0: {
                break;
            }
            case 2: {
                CallSite callSite = gz$AimSmoothMode.ihpe("ihph", ihpb(int ), (int)2);
            }
        }
        while (true) {
            CallSite callSite = gz$AimSmoothMode.ihpe("ihpf", ihpb(int ), (int)0);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public ov limitAngleChange(ov var1_1, ov var2_2, class_243 var3_3, class_1297 var4_4) {
        block72: {
            block71: {
                block70: {
                    block69: {
                        block68: {
                            block67: {
                                var14_5 = gz$AimSmoothMode.c;
                                var13_6 /* !! */  = gz$AimSmoothMode.b;
                                var12_7 = gz$AimSmoothMode.a;
                                if (var14_5) {
                                    throw null;
lbl6:
                                    // 16 sources

                                    return null;
                                }
                                if (var12_7 || var12_7) ** GOTO lbl6
                                var5_8 = ow.calculateDelta(var1_1, var2_2);
                                if (var12_7 || var12_7) ** GOTO lbl6
                                if (var3_3 != null) break block67;
                                if (var12_7) ** GOTO lbl6
                                v0 = gz$AimSmoothMode.ihpe("ihpj", ihpb(int ), (int)3);
                                if (var14_5) {
                                    throw null;
                                }
                                break block68;
                            }
                            if (var12_7 || var12_7) ** GOTO lbl6
                            v0 = var6_9 = gz$AimSmoothMode.ihpe("ihpk", ihpb(int ), (int)4);
                        }
                        if (var12_7 || var12_7) ** GOTO lbl6
                        if (var6_9 == false) break block69;
                        if (var12_7) ** GOTO lbl6
                        v1 = gz$AimSmoothMode.ihpe("ihpn", ihpl(int ), (int)5);
                        if (var14_5) {
                            throw null;
                        }
                        break block70;
                    }
                    if (var12_7 || var12_7) ** GOTO lbl6
                    v1 = var7_10 = gz$AimSmoothMode.ihpe("ihpo", ihpl(int ), (int)6);
                }
                if (var12_7 || var12_7) ** GOTO lbl6
                if (var6_9 == false) break block71;
                if (var12_7) ** GOTO lbl6
                v2 = gz$AimSmoothMode.ihpe("ihpp", ihpl(int ), (int)7);
                if (var14_5) {
                    throw null;
                }
                break block72;
            }
            if (var12_7 || var12_7) ** GOTO lbl6
            v2 = var8_11 = gz$AimSmoothMode.ihpe("ihpq", ihpl(int ), (int)8);
        }
        if (var13_6 /* !! */  == 0) ** GOTO lbl-1000
        switch (var13_6 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var12_7 || var12_7) ** GOTO lbl6
                if (var6_9 == false) ** GOTO lbl53
                if (var12_7) ** GOTO lbl6
                v3 = gz$AimSmoothMode.ihpe("ihpr", ihpl(int ), (int)9);
                if (var14_5) {
                    throw null;
                }
                ** GOTO lbl55
lbl53:
                // 1 sources

                if (var12_7 || var12_7) ** GOTO lbl6
                v3 = var9_12 = gz$AimSmoothMode.ihpe("ihps", ihpl(int ), (int)10);
lbl55:
                // 2 sources

                if (var12_7 || var12_7) ** GOTO lbl6
                var10_13 = class_3532.method_15363((float)(var5_8.getYaw() * var9_12), (float)(-var7_10), (float)var7_10);
                if (var12_7 || var12_7) ** GOTO lbl6
                var11_14 = class_3532.method_15363((float)(var5_8.getPitch() * var9_12), (float)(-var8_11), (float)var8_11);
                if (!var12_7 && !var12_7) ** break;
                ** continue;
                return new ov(var1_1.getYaw() + var10_13, class_3532.method_15363((float)(var1_1.getPitch() + var11_14), (float)gz$AimSmoothMode.ihpe("ihpu", ihpl(int ), (int)11), (float)gz$AimSmoothMode.ihpe("ihpv", ihpl(int ), (int)12)));
            }
            case 0: {
                var13_6 /* !! */  = (int)gz$AimSmoothMode.ihpe("ihpw", ihpb(int ), (int)13);
                if (var14_5) {
                    throw null;
                }
                ** GOTO lbl158
            }
lbl67:
            // 3 sources

            case 1: {
                var13_6 /* !! */  = (int)gz$AimSmoothMode.ihpe("ihpx", ihpb(int ), (int)14);
                if (var14_5) {
                    throw null;
                }
                ** GOTO lbl120
            }
lbl72:
            // 2 sources

            case 2: {
                var13_6 /* !! */  = (int)gz$AimSmoothMode.ihpe("ihpy", ihpb(int ), (int)15);
                if (var14_5) {
                    throw null;
                }
                ** GOTO lbl158
            }
lbl77:
            // 3 sources

            case 3: {
                var13_6 /* !! */  = (int)gz$AimSmoothMode.ihpe("ihpz", ihpb(int ), (int)16);
                if (var14_5) {
                    throw null;
                }
                ** GOTO lbl137
            }
lbl82:
            // 3 sources

            case 4: {
                var13_6 /* !! */  = (int)gz$AimSmoothMode.ihpe("ihqb", ihpb(int ), (int)17);
                if (!var14_5) ** GOTO lbl77
                throw null;
            }
            case 5: {
                var13_6 /* !! */  = (int)gz$AimSmoothMode.ihpe("ihqc", ihpb(int ), (int)18);
                if (var14_5) {
                    throw null;
                }
                ** GOTO lbl154
            }
lbl91:
            // 2 sources

            case 6: {
                var13_6 /* !! */  = (int)gz$AimSmoothMode.ihpe("ihqd", ihpb(int ), (int)19);
                if (!var14_5) ** GOTO lbl67
                throw null;
            }
            case 7: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var13_6 /* !! */  = (int)gz$AimSmoothMode.ihpe("ihqe", ihpb(int ), (int)20);
                    if (var14_5) {
                        throw null;
                    }
                    ** GOTO lbl182
                    break;
                }
            }
            case 8: {
                var13_6 /* !! */  = (int)gz$AimSmoothMode.ihpe("ihqf", ihpb(int ), (int)21);
                if (var14_5) {
                    throw null;
                }
                ** GOTO lbl194
            }
            case 9: {
                var13_6 /* !! */  = (int)gz$AimSmoothMode.ihpe("ihqg", ihpb(int ), (int)22);
                if (!var14_5) ** GOTO lbl82
                throw null;
            }
lbl110:
            // 2 sources

            case 10: {
                var13_6 /* !! */  = (int)gz$AimSmoothMode.ihpe("ihqh", ihpb(int ), (int)23);
                if (var14_5) {
                    throw null;
                }
                ** GOTO lbl129
            }
lbl115:
            // 2 sources

            case 11: {
                var13_6 /* !! */  = (int)gz$AimSmoothMode.ihpe("ihqk", ihpb(int ), (int)24);
                if (var14_5) {
                    throw null;
                }
                ** GOTO lbl174
            }
lbl120:
            // 3 sources

            case 12: {
                var13_6 /* !! */  = (int)gz$AimSmoothMode.ihpe("ihql", ihpb(int ), (int)25);
                if (var14_5) {
                    throw null;
                }
                ** GOTO lbl141
            }
lbl125:
            // 2 sources

            case 13: {
                var13_6 /* !! */  = (int)gz$AimSmoothMode.ihpe("ihqm", ihpb(int ), (int)26);
                if (!var14_5) ** GOTO lbl115
                throw null;
            }
lbl129:
            // 3 sources

            case 14: {
                var13_6 /* !! */  = (int)gz$AimSmoothMode.ihpe("ihqn", ihpb(int ), (int)27);
                if (!var14_5) ** GOTO lbl110
                throw null;
            }
lbl133:
            // 2 sources

            case 15: {
                var13_6 /* !! */  = (int)gz$AimSmoothMode.ihpe("ihqo", ihpb(int ), (int)28);
                if (!var14_5) ** GOTO lbl67
                throw null;
            }
lbl137:
            // 3 sources

            case 16: {
                var13_6 /* !! */  = (int)gz$AimSmoothMode.ihpe("ihqp", ihpb(int ), (int)29);
                if (!var14_5) ** GOTO lbl129
                throw null;
            }
lbl141:
            // 3 sources

            case 17: {
                var13_6 /* !! */  = (int)gz$AimSmoothMode.ihpe("ihqr", ihpb(int ), (int)30);
                if (!var14_5) ** GOTO lbl120
                throw null;
            }
            case 18: {
                var13_6 /* !! */  = (int)gz$AimSmoothMode.ihpe("ihqs", ihpb(int ), (int)31);
                if (var14_5) {
                    throw null;
                }
                ** GOTO lbl162
            }
            case 19: {
                var13_6 /* !! */  = (int)gz$AimSmoothMode.ihpe("ihqt", ihpb(int ), (int)32);
                if (!var14_5) break;
                throw null;
            }
lbl154:
            // 4 sources

            case 20: {
                var13_6 /* !! */  = (int)gz$AimSmoothMode.ihpe("ihqu", ihpb(int ), (int)33);
                if (!var14_5) ** GOTO lbl72
                throw null;
            }
lbl158:
            // 3 sources

            case 21: {
                var13_6 /* !! */  = (int)gz$AimSmoothMode.ihpe("ihqv", ihpb(int ), (int)34);
                if (!var14_5) ** GOTO lbl137
                throw null;
            }
lbl162:
            // 3 sources

            case 22: {
                var13_6 /* !! */  = (int)gz$AimSmoothMode.ihpe("ihqx", ihpb(int ), (int)35);
                if (!var14_5) ** GOTO lbl154
                throw null;
            }
            case 23: {
                var13_6 /* !! */  = (int)gz$AimSmoothMode.ihpe("ihqy", ihpb(int ), (int)36);
                if (!var14_5) ** GOTO lbl82
                throw null;
            }
            case 24: {
                var13_6 /* !! */  = (int)gz$AimSmoothMode.ihpe("ihqz", ihpb(int ), (int)37);
                if (!var14_5) ** GOTO lbl154
                throw null;
            }
lbl174:
            // 2 sources

            case 25: {
                var13_6 /* !! */  = (int)gz$AimSmoothMode.ihpe("ihra", ihpb(int ), (int)38);
                if (!var14_5) ** GOTO lbl125
                throw null;
            }
            case 26: {
                var13_6 /* !! */  = (int)gz$AimSmoothMode.ihpe("ihrc", ihpb(int ), (int)39);
                if (!var14_5) ** GOTO lbl141
                throw null;
            }
lbl182:
            // 2 sources

            case 27: {
                var13_6 /* !! */  = (int)gz$AimSmoothMode.ihpe("ihrd", ihpb(int ), (int)40);
                if (!var14_5) ** GOTO lbl133
                throw null;
            }
            case 28: {
                var13_6 /* !! */  = (int)gz$AimSmoothMode.ihpe("ihre", ihpb(int ), (int)41);
                if (!var14_5) ** GOTO lbl77
                throw null;
            }
            case 29: {
                var13_6 /* !! */  = (int)gz$AimSmoothMode.ihpe("ihrf", ihpb(int ), (int)42);
                if (!var14_5) ** GOTO lbl162
                throw null;
            }
lbl194:
            // 2 sources

            case 30: {
                var13_6 /* !! */  = (int)gz$AimSmoothMode.ihpe("ihrg", ihpb(int ), (int)43);
                if (!var14_5) ** GOTO lbl91
                throw null;
            }
            case 31: 
        }
        var13_6 /* !! */  = (int)gz$AimSmoothMode.ihpe("ihri", ihpb(int ), (int)44);
        ** while (!var14_5)
lbl201:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ihsh() {
        gz$AimSmoothMode.ihpd[0] = 1593239104;
        gz$AimSmoothMode.ihpd[1] = -781282865;
        gz$AimSmoothMode.ihpd[2] = 2079041654;
        gz$AimSmoothMode.ihpd[3] = -634801060;
        gz$AimSmoothMode.ihpd[4] = -1813862558;
        gz$AimSmoothMode.ihpd[5] = -990333482;
        gz$AimSmoothMode.ihpd[6] = 1101839290;
        gz$AimSmoothMode.ihpd[7] = 1029636593;
        gz$AimSmoothMode.ihpd[8] = 2001748360;
        gz$AimSmoothMode.ihpd[9] = 2117495505;
        gz$AimSmoothMode.ihpd[10] = 149248767;
        gz$AimSmoothMode.ihpd[11] = 985185990;
        gz$AimSmoothMode.ihpd[12] = -1853527692;
        gz$AimSmoothMode.ihpd[13] = -1751943450;
        gz$AimSmoothMode.ihpd[14] = -795235716;
        gz$AimSmoothMode.ihpd[15] = -738706875;
        gz$AimSmoothMode.ihpd[16] = 989371715;
        gz$AimSmoothMode.ihpd[17] = -1014035745;
        gz$AimSmoothMode.ihpd[18] = -1408887665;
        gz$AimSmoothMode.ihpd[19] = 175623289;
        gz$AimSmoothMode.ihpd[20] = -435506154;
        gz$AimSmoothMode.ihpd[21] = -1963244807;
        gz$AimSmoothMode.ihpd[22] = 1826069509;
        gz$AimSmoothMode.ihpd[23] = -1044450040;
        gz$AimSmoothMode.ihpd[24] = -858307596;
        gz$AimSmoothMode.ihpd[25] = 812867836;
        gz$AimSmoothMode.ihpd[26] = -1759474024;
        gz$AimSmoothMode.ihpd[27] = -2134575777;
        gz$AimSmoothMode.ihpd[28] = 1359675886;
        gz$AimSmoothMode.ihpd[29] = -231533685;
        gz$AimSmoothMode.ihpd[30] = 1837587384;
        gz$AimSmoothMode.ihpd[31] = -1417258450;
        gz$AimSmoothMode.ihpd[32] = 687702147;
        gz$AimSmoothMode.ihpd[33] = -1689624899;
        gz$AimSmoothMode.ihpd[34] = 667259790;
        gz$AimSmoothMode.ihpd[35] = 1608853527;
        gz$AimSmoothMode.ihpd[36] = 557707334;
        gz$AimSmoothMode.ihpd[37] = 818870763;
        gz$AimSmoothMode.ihpd[38] = 1651069501;
        gz$AimSmoothMode.ihpd[39] = -1408065631;
        gz$AimSmoothMode.ihpd[40] = -1969699139;
        gz$AimSmoothMode.ihpd[41] = 1885681355;
        gz$AimSmoothMode.ihpd[42] = 1563138922;
        gz$AimSmoothMode.ihpd[43] = -2059613070;
        gz$AimSmoothMode.ihpd[44] = 1284927372;
        gz$AimSmoothMode.ihpd[45] = 1512657853;
        gz$AimSmoothMode.ihpd[46] = 1372679123;
        gz$AimSmoothMode.ihpd[47] = -2101400357;
        gz$AimSmoothMode.ihpd[48] = 1579291214;
        gz$AimSmoothMode.ihpd[49] = 91167466;
        gz$AimSmoothMode.ihpd[50] = 2145122998;
        gz$AimSmoothMode.ihpd[51] = -920229210;
        gz$AimSmoothMode.ihpd[52] = -1549610686;
        gz$AimSmoothMode.ihpd[53] = 1080199188;
        gz$AimSmoothMode.ihpd[54] = 2077177181;
    }

    public static /* synthetic */ CallSite ihpe(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    static {
        ihpd = new int[55];
        gz$AimSmoothMode.ihsf();
        gz$AimSmoothMode.ihsh();
        ihrk = new long[6];
        ihrl = new long[6];
        gz$AimSmoothMode.ihsj();
        gz$AimSmoothMode.ihsk();
    }

    private static /* synthetic */ void ihsk() {
        gz$AimSmoothMode.ihrl[0] = 614677290794772990L;
        gz$AimSmoothMode.ihrl[1] = -4497148358795888598L;
        gz$AimSmoothMode.ihrl[2] = -6194078995801930797L;
        gz$AimSmoothMode.ihrl[3] = -2437296799549422677L;
        gz$AimSmoothMode.ihrl[4] = -905091776365728041L;
        gz$AimSmoothMode.ihrl[5] = 1516559015696307537L;
    }

    private static /* synthetic */ void ihsf() {
        gz$AimSmoothMode.ihpc[0] = 1593239105;
        gz$AimSmoothMode.ihpc[1] = -781282867;
        gz$AimSmoothMode.ihpc[2] = 2079041655;
        gz$AimSmoothMode.ihpc[3] = -634801059;
        gz$AimSmoothMode.ihpc[4] = -1813862558;
        gz$AimSmoothMode.ihpc[5] = -2057783850;
        gz$AimSmoothMode.ihpc[6] = 5028794;
        gz$AimSmoothMode.ihpc[7] = 2084504049;
        gz$AimSmoothMode.ihpc[8] = 918569352;
        gz$AimSmoothMode.ihpc[9] = 1091570871;
        gz$AimSmoothMode.ihpc[10] = 931347609;
        gz$AimSmoothMode.ihpc[11] = -133382458;
        gz$AimSmoothMode.ihpc[12] = -751736460;
        gz$AimSmoothMode.ihpc[13] = -1751943425;
        gz$AimSmoothMode.ihpc[14] = -795235715;
        gz$AimSmoothMode.ihpc[15] = -738706853;
        gz$AimSmoothMode.ihpc[16] = 989371728;
        gz$AimSmoothMode.ihpc[17] = -1014035748;
        gz$AimSmoothMode.ihpc[18] = -1408887656;
        gz$AimSmoothMode.ihpc[19] = 175623288;
        gz$AimSmoothMode.ihpc[20] = -435506149;
        gz$AimSmoothMode.ihpc[21] = -1963244822;
        gz$AimSmoothMode.ihpc[22] = 1826069518;
        gz$AimSmoothMode.ihpc[23] = -1044450048;
        gz$AimSmoothMode.ihpc[24] = -858307596;
        gz$AimSmoothMode.ihpc[25] = 812867808;
        gz$AimSmoothMode.ihpc[26] = -1759474021;
        gz$AimSmoothMode.ihpc[27] = -2134575793;
        gz$AimSmoothMode.ihpc[28] = 1359675881;
        gz$AimSmoothMode.ihpc[29] = -231533675;
        gz$AimSmoothMode.ihpc[30] = 1837587365;
        gz$AimSmoothMode.ihpc[31] = -1417258451;
        gz$AimSmoothMode.ihpc[32] = 687702163;
        gz$AimSmoothMode.ihpc[33] = -1689624921;
        gz$AimSmoothMode.ihpc[34] = 667259782;
        gz$AimSmoothMode.ihpc[35] = 1608853534;
        gz$AimSmoothMode.ihpc[36] = 557707330;
        gz$AimSmoothMode.ihpc[37] = 818870755;
        gz$AimSmoothMode.ihpc[38] = 1651069488;
        gz$AimSmoothMode.ihpc[39] = -1408065621;
        gz$AimSmoothMode.ihpc[40] = -1969699148;
        gz$AimSmoothMode.ihpc[41] = 1885681363;
        gz$AimSmoothMode.ihpc[42] = 1563138931;
        gz$AimSmoothMode.ihpc[43] = -2059613064;
        gz$AimSmoothMode.ihpc[44] = 1284927368;
        gz$AimSmoothMode.ihpc[45] = -1512657854;
        gz$AimSmoothMode.ihpc[46] = -1866759310;
        gz$AimSmoothMode.ihpc[47] = 2101400356;
        gz$AimSmoothMode.ihpc[48] = -1670809809;
        gz$AimSmoothMode.ihpc[49] = -91167467;
        gz$AimSmoothMode.ihpc[50] = 744955213;
        gz$AimSmoothMode.ihpc[51] = -920229211;
        gz$AimSmoothMode.ihpc[52] = -1549610685;
        gz$AimSmoothMode.ihpc[53] = 1080199191;
        gz$AimSmoothMode.ihpc[54] = 2077177181;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public class_243 randomValue() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = gz$AimSmoothMode.pp - gz$AimSmoothMode.ihpe("ihrn", ihrj(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == gz$AimSmoothMode.ihpe("ihro", ihpb(int ), (int)45)) break;
            v0 /* !! */  = (long)gz$AimSmoothMode.ihpe("ihrp", ihpb(int ), (int)46);
        }
        var3_1 = gz$AimSmoothMode.c;
        v1 /* !! */  = gz$AimSmoothMode.pp;
        if (true) ** GOTO lbl12
        block12: while (true) {
            v1 /* !! */  = (long)(v2 - gz$AimSmoothMode.ihpe("ihrq", ihrj(int ), (int)1));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1517023856: {
                    break block12;
                }
                case -338641068: {
                    v2 = gz$AimSmoothMode.ihpe("ihrr", ihrj(int ), (int)2);
                    continue block12;
                }
                case 1033078302: {
                    v2 = gz$AimSmoothMode.ihpe("ihrs", ihrj(int ), (int)3);
                    continue block12;
                }
            }
            break;
        }
        var2_2 /* !! */  = gz$AimSmoothMode.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = gz$AimSmoothMode.pp - gz$AimSmoothMode.ihpe("ihrt", ihrj(int ), (int)4)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == gz$AimSmoothMode.ihpe("ihrv", ihpb(int ), (int)47)) break;
            v3 /* !! */  = (long)gz$AimSmoothMode.ihpe("ihrw", ihpb(int ), (int)48);
        }
        var1_3 = gz$AimSmoothMode.a;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_1) {
                    throw null;
                    return null;
                }
                if (var1_3 || var1_3) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = gz$AimSmoothMode.pp - gz$AimSmoothMode.ihpe("ihrx", ihrj(int ), (int)5)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == gz$AimSmoothMode.ihpe("ihry", ihpb(int ), (int)49)) break;
                    v4 /* !! */  = (long)gz$AimSmoothMode.ihpe("ihrz", ihpb(int ), (int)50);
                }
                return class_243.field_1353;
            }
lbl44:
            // 2 sources

            case 0: {
                do {
                    var2_2 /* !! */  = (int)gz$AimSmoothMode.ihpe("ihsa", ihpb(int ), (int)51);
                } while (!var3_1);
                throw null;
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)gz$AimSmoothMode.ihpe("ihsc", ihpb(int ), (int)52);
                    if (!var3_1) ** GOTO lbl44
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)gz$AimSmoothMode.ihpe("ihsd", ihpb(int ), (int)53);
                if (!var3_1) break;
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)gz$AimSmoothMode.ihpe("ihse", ihpb(int ), (int)54);
        ** while (!var3_1)
lbl61:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ float ihpl(int n2) {
        return Float.intBitsToFloat(ihpc[n2] ^ ihpd[n2]);
    }

    private static /* synthetic */ int ihpb(int n2) {
        return ihpc[n2] ^ ihpd[n2];
    }

    private static /* synthetic */ long ihrj(int n2) {
        return ihrk[n2] ^ ihrl[n2];
    }

    private static /* synthetic */ void ihsj() {
        gz$AimSmoothMode.ihrk[0] = -2600332454540663568L;
        gz$AimSmoothMode.ihrk[1] = 2759445023932444092L;
        gz$AimSmoothMode.ihrk[2] = 7398681959298160283L;
        gz$AimSmoothMode.ihrk[3] = -5396381244992054870L;
        gz$AimSmoothMode.ihrk[4] = 3027707049673229376L;
        gz$AimSmoothMode.ihrk[5] = 3296853506574562465L;
    }
}

