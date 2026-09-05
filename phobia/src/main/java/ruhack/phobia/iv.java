/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1799
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.minecraft.class_1799;
import ruhack.phobia.ds;
import ruhack.phobia.du;
import ruhack.phobia.iv$MathHelper;
import ruhack.phobia.nj;

public final class iv
extends ds {
    public static final long p = 7904228090459216969L;
    private static final float[][] COLORS;
    private static int[] cqw;
    private static long[] crd;
    public static final boolean c;
    private static long[] cre;
    private static int[] cqx;
    public static final int b;
    public static final boolean a;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static iv getInstance() {
        v0 /* !! */  = iv.p;
        if (true) ** GOTO lbl5
        block15: while (true) {
            v0 /* !! */  = (long)(v1 - iv.cqy("crf", crc(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -560750098: {
                    v1 = iv.cqy("crg", crc(int ), (int)1);
                    continue block15;
                }
                case -478389175: {
                    break block15;
                }
                case 154852050: {
                    v1 = iv.cqy("crh", crc(int ), (int)2);
                    continue block15;
                }
            }
            break;
        }
        var2 = iv.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = iv.p - iv.cqy("cri", crc(int ), (int)3)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == iv.cqy("crj", cqv(int ), (int)3)) break;
            v2 /* !! */  = (long)iv.cqy("crk", cqv(int ), (int)4);
        }
        var1_1 = iv.b;
        v3 /* !! */  = iv.p;
        if (true) ** GOTO lbl26
        block17: while (true) {
            v3 /* !! */  = (long)(v4 - iv.cqy("crl", crc(int ), (int)4));
lbl26:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -478389175: {
                    break block17;
                }
                case -25780521: {
                    v4 = iv.cqy("crm", crc(int ), (int)5);
                    continue block17;
                }
                case 535469344: {
                    v4 = iv.cqy("crn", crc(int ), (int)6);
                    continue block17;
                }
                case 1117711039: {
                    v4 = iv.cqy("cro", crc(int ), (int)7);
                    continue block17;
                }
            }
            break;
        }
        var0_2 = iv.a;
        if (var2) {
            throw null;
lbl41:
            // 1 sources

            return null;
        }
        ** while (var0_2 || var0_2)
lbl44:
        // 1 sources

        v5 /* !! */  = iv.p;
        if (true) ** GOTO lbl48
        block19: while (true) {
            v5 /* !! */  = (long)(iv.cqy("crq", crc(int ), (int)9) - iv.cqy("crp", crc(int ), (int)8));
lbl48:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -478389175: {
                    break block19;
                }
                case 249761976: {
                    continue block19;
                }
            }
            break;
        }
        return nj.get(iv.class);
    }

    private static /* synthetic */ float ctd(int n2) {
        return Float.intBitsToFloat(cqw[n2] ^ cqx[n2]);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public iv() {
        var2_1 /* !! */  = iv.b;
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                super("ArmorDurabilityView", "\u041e\u043a\u0440\u0430\u0448\u0438\u0432\u0430\u0435\u0442 \u0431\u0440\u043e\u043d\u044e \u0432 \u0437\u0430\u0432\u0438\u0441\u0438\u043c\u043e\u0441\u0442\u0438 \u043e\u0442 \u0435\u0451 \u043f\u0440\u043e\u0447\u043d\u043e\u0441\u0442\u0438", du.RENDER);
                return;
            }
            case 0: {
                while (true) {
                    var2_1 /* !! */  = (int)iv.cqy("cqz", cqv(int ), (int)0);
                }
            }
            case 1: {
                while (true) {
                    var2_1 /* !! */  = (int)iv.cqy("cra", cqv(int ), (int)1);
                }
            }
            case 2: 
        }
        while (true) {
            var2_1 /* !! */  = (int)iv.cqy("crb", cqv(int ), (int)2);
        }
    }

    private static /* synthetic */ long crc(int n2) {
        return crd[n2] ^ cre[n2];
    }

    private static /* synthetic */ void cwa() {
        iv.cre[0] = 5271975168837064120L;
        iv.cre[1] = 3371632149222600163L;
        iv.cre[2] = 1927143494338055126L;
        iv.cre[3] = -2387718485570059830L;
        iv.cre[4] = 987142529347724045L;
        iv.cre[5] = 1700222020245175734L;
        iv.cre[6] = -473981863187437980L;
        iv.cre[7] = 1880614148561346885L;
        iv.cre[8] = -1844424016884574487L;
        iv.cre[9] = 4307652697420853305L;
        iv.cre[10] = -4740775233540836300L;
        iv.cre[11] = -1623233113079553277L;
        iv.cre[12] = 4499151023514616458L;
        iv.cre[13] = -5737234477996745157L;
        iv.cre[14] = 5132752007544033907L;
        iv.cre[15] = -8025695099216405986L;
        iv.cre[16] = -6744232195184232900L;
        iv.cre[17] = -3061489405494259710L;
        iv.cre[18] = -2512962190418326932L;
        iv.cre[19] = 688196511651808884L;
        iv.cre[20] = -4840503051830479539L;
        iv.cre[21] = -737105615842482012L;
        iv.cre[22] = -7087823217779530342L;
        iv.cre[23] = 4866922090523156523L;
        iv.cre[24] = 6019052592327833387L;
        iv.cre[25] = -6077144800349846024L;
        iv.cre[26] = -280912104606273401L;
        iv.cre[27] = 3947248139377231265L;
        iv.cre[28] = -8598833810459687430L;
        iv.cre[29] = -5950490950554359822L;
        iv.cre[30] = 7407245607082752245L;
        iv.cre[31] = -837392351861615134L;
        iv.cre[32] = -5150028902284852365L;
        iv.cre[33] = -6198138162354807360L;
        iv.cre[34] = -1803781923670767020L;
        iv.cre[35] = -5729217403804068089L;
        iv.cre[36] = -1941919698947405757L;
        iv.cre[37] = 355143504698682819L;
        iv.cre[38] = 3252651951648311550L;
        iv.cre[39] = -1227520897320550049L;
        iv.cre[40] = 8308108816116993108L;
        iv.cre[41] = 6889606645417536252L;
        iv.cre[42] = -2228500223323719719L;
        iv.cre[43] = 8870226012216163250L;
        iv.cre[44] = -6114459568627544099L;
        iv.cre[45] = -2278536419746177978L;
    }

    private static /* synthetic */ int cqv(int n2) {
        return cqw[n2] ^ cqx[n2];
    }

    private static /* synthetic */ void cvx() {
        iv.cqw[0] = -2008873256;
        iv.cqw[1] = 506152376;
        iv.cqw[2] = -471201984;
        iv.cqw[3] = -241860671;
        iv.cqw[4] = -1461193189;
        iv.cqw[5] = 812837694;
        iv.cqw[6] = -1796354018;
        iv.cqw[7] = 1233369958;
        iv.cqw[8] = -2117136009;
        iv.cqw[9] = 2111895632;
        iv.cqw[10] = 935991978;
        iv.cqw[11] = 167164106;
        iv.cqw[12] = 1801806849;
        iv.cqw[13] = -624239538;
        iv.cqw[14] = -2011176922;
        iv.cqw[15] = -1142465113;
        iv.cqw[16] = 1643319188;
        iv.cqw[17] = 832653361;
        iv.cqw[18] = -673865471;
        iv.cqw[19] = 946867845;
        iv.cqw[20] = 467536557;
        iv.cqw[21] = -1676557730;
        iv.cqw[22] = -2041807316;
        iv.cqw[23] = 19204219;
        iv.cqw[24] = 1398573118;
        iv.cqw[25] = 531351709;
        iv.cqw[26] = -117329338;
        iv.cqw[27] = 931591290;
        iv.cqw[28] = 1337233801;
        iv.cqw[29] = 2113853132;
        iv.cqw[30] = 1244415120;
        iv.cqw[31] = 394187524;
        iv.cqw[32] = -282487476;
        iv.cqw[33] = 1703718625;
        iv.cqw[34] = -547736016;
        iv.cqw[35] = -1356992179;
        iv.cqw[36] = 1529947747;
        iv.cqw[37] = -810771385;
        iv.cqw[38] = -1071224907;
        iv.cqw[39] = -1486228598;
        iv.cqw[40] = -1745307343;
        iv.cqw[41] = 958204291;
    }

    static {
        cqw = new int[42];
        cqx = new int[42];
        iv.cvx();
        iv.cvy();
        crd = new long[46];
        cre = new long[46];
        iv.cvz();
        iv.cwa();
        COLORS = new float[][]{{0.6f, 0.0f, 0.0f}, {0.8f, 0.0f, 0.0f}, {1.0f, 0.0f, 0.0f}, {1.0f, 0.2f, 0.0f}, {1.0f, 0.4f, 0.0f}, {1.0f, 0.6f, 0.0f}, {1.0f, 0.8f, 0.0f}, {1.0f, 1.0f, 0.0f}, {0.9f, 1.0f, 0.0f}, {0.7f, 1.0f, 0.0f}, {0.5f, 1.0f, 0.0f}, {0.0f, 0.6f, 0.0f}, {0.0f, 0.7f, 0.0f}, {0.0f, 0.8f, 0.0f}, {0.0f, 0.9f, 0.0f}, {0.0f, 1.0f, 0.0f}, {0.2f, 1.0f, 0.2f}, {0.4f, 1.0f, 0.4f}, {0.6f, 1.0f, 0.6f}, {0.8f, 1.0f, 0.8f}, {1.0f, 1.0f, 1.0f}};
    }

    public static /* synthetic */ CallSite cqy(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static int durabilityColor(class_1799 var0) {
        block102: {
            block101: {
                v0 /* !! */  = iv.p;
                if (true) ** GOTO lbl5
                block67: while (true) {
                    v0 /* !! */  = (long)(v1 - iv.cqy("crv", crc(int ), (int)10));
lbl5:
                    // 2 sources

                    switch ((int)v0 /* !! */ ) {
                        case -2003829467: {
                            v1 = iv.cqy("crw", crc(int ), (int)11);
                            continue block67;
                        }
                        case -732924174: {
                            v1 = iv.cqy("crx", crc(int ), (int)12);
                            continue block67;
                        }
                        case -478389175: {
                            break block67;
                        }
                        case 1352164550: {
                            v1 = iv.cqy("cry", crc(int ), (int)13);
                            continue block67;
                        }
                    }
                    break;
                }
                var5_1 = iv.c;
                v2 /* !! */  = iv.p;
                if (true) ** GOTO lbl22
                block68: while (true) {
                    v2 /* !! */  = (long)(v3 - iv.cqy("crz", crc(int ), (int)14));
lbl22:
                    // 2 sources

                    switch ((int)v2 /* !! */ ) {
                        case -1316846992: {
                            v3 = iv.cqy("csa", crc(int ), (int)15);
                            continue block68;
                        }
                        case -478389175: {
                            break block68;
                        }
                        case -103769500: {
                            v3 = iv.cqy("csb", crc(int ), (int)16);
                            continue block68;
                        }
                        case 132143600: {
                            v3 = iv.cqy("csc", crc(int ), (int)17);
                            continue block68;
                        }
                    }
                    break;
                }
                var4_2 /* !! */  = iv.b;
                v4 /* !! */  = iv.p;
                if (true) ** GOTO lbl39
                block69: while (true) {
                    v4 /* !! */  = (long)(v5 - iv.cqy("csd", crc(int ), (int)18));
lbl39:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -478389175: {
                            break block69;
                        }
                        case -389508287: {
                            v5 = iv.cqy("cse", crc(int ), (int)19);
                            continue block69;
                        }
                        case 897628335: {
                            v5 = iv.cqy("csf", crc(int ), (int)20);
                            continue block69;
                        }
                    }
                    break;
                }
                var3_3 = iv.a;
                if (var5_1) {
                    throw null;
                }
                if (var3_3 != false) return (int)iv.cqy("csg", cqv(int ), (int)9);
                if (var3_3 != false) return (int)iv.cqy("csg", cqv(int ), (int)9);
                if (var0 == null) break block101;
                if (var3_3 != false) return (int)iv.cqy("csg", cqv(int ), (int)9);
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_1 = iv.p - iv.cqy("csh", crc(int ), (int)21)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == iv.cqy("csi", cqv(int ), (int)10)) {
                        if (!var0.method_7960()) {
                            break;
                        }
                        break block101;
                    }
                    v6 /* !! */  = (long)iv.cqy("csj", cqv(int ), (int)11);
                }
                if (var3_3 != false) return (int)iv.cqy("csg", cqv(int ), (int)9);
                v7 /* !! */  = iv.p;
                if (true) ** GOTO lbl68
                block71: while (true) {
                    v7 /* !! */  = (long)(v8 - iv.cqy("csk", crc(int ), (int)22));
lbl68:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -478389175: {
                            break block71;
                        }
                        case 989153182: {
                            v8 = iv.cqy("csl", crc(int ), (int)23);
                            continue block71;
                        }
                        case 1945890575: {
                            v8 = iv.cqy("csm", crc(int ), (int)24);
                            continue block71;
                        }
                    }
                    break;
                }
                if (var0.method_7963()) break block102;
                if (var3_3 != false) return (int)iv.cqy("csg", cqv(int ), (int)9);
            }
            if (var3_3 != false) return (int)iv.cqy("csg", cqv(int ), (int)9);
            if (var3_3 != false) return (int)iv.cqy("csg", cqv(int ), (int)9);
            return (int)iv.cqy("csn", cqv(int ), (int)12);
        }
        if (var3_3 != false) return (int)iv.cqy("csg", cqv(int ), (int)9);
        if (var4_2 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block72: do {
            switch (cfr_temp_0 == -2147483648 ? var4_2 /* !! */  : cfr_temp_0) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var3_3 != false) return (int)iv.cqy("csg", cqv(int ), (int)9);
                    v9 /* !! */  = iv.p;
                    block73: while (true) {
                        switch ((int)v9 /* !! */ ) {
                            case -1789889926: {
                                v10 = iv.cqy("csp", crc(int ), (int)26);
                                ** GOTO lbl104
                            }
                            case -478389175: {
                                break block73;
                            }
                            case 316621779: {
                                v10 = iv.cqy("csq", crc(int ), (int)27);
                                ** GOTO lbl104
                            }
                            case 912234699: {
                                v10 = iv.cqy("csr", crc(int ), (int)28);
lbl104:
                                // 3 sources

                                v9 /* !! */  = (long)(v10 - iv.cqy("cso", crc(int ), (int)25));
                                continue block73;
                            }
                        }
                        break;
                    }
                    v11 = var0.method_7919();
                    v12 /* !! */  = iv.p;
                    block74: while (true) {
                        switch ((int)v12 /* !! */ ) {
                            case -478389175: {
                                break block74;
                            }
                            case 642703831: {
                                v13 = iv.cqy("cst", crc(int ), (int)30);
                                ** GOTO lbl120
                            }
                            case 1203449453: {
                                v13 = iv.cqy("csu", crc(int ), (int)31);
                                ** GOTO lbl120
                            }
                            case 1565024097: {
                                v13 = iv.cqy("csv", crc(int ), (int)32);
lbl120:
                                // 3 sources

                                v12 /* !! */  = (long)(v13 - iv.cqy("css", crc(int ), (int)29));
                                continue block74;
                            }
                        }
                        break;
                    }
                    var1_4 = 1.0f - v11 / (float)var0.method_7936();
                    if (var3_3 != false) return (int)iv.cqy("csg", cqv(int ), (int)9);
                    if (var3_3 != false) return (int)iv.cqy("csg", cqv(int ), (int)9);
                    while (true) {
                        if ((v14 /* !! */  = (cfr_temp_2 = iv.p - iv.cqy("csw", crc(int ), (int)33)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                        if (v14 /* !! */  != iv.cqy("csx", cqv(int ), (int)13)) ** GOTO lbl130
                        v15 /* !! */  = iv.p;
                        if (true) ** GOTO lbl212
lbl130:
                        // 1 sources

                        v14 /* !! */  = (long)iv.cqy("csy", cqv(int ), (int)14);
                    }
                }
                case 0: {
                    do {
                        var4_2 /* !! */  = (int)iv.cqy("ctx", cqv(int ), (int)26);
                    } while (!var5_1);
                    throw null;
                }
                case 1: {
                    var4_2 /* !! */  = (int)iv.cqy("cty", cqv(int ), (int)27);
                    if (var5_1) {
                        throw null;
                    }
                    ** GOTO lbl-1000
                }
                case 3: {
                    var4_2 /* !! */  = (int)iv.cqy("cua", cqv(int ), (int)29);
                    cfr_temp_0 = 8;
                    if (!var5_1) continue block72;
                    throw null;
                }
                case 4: {
                    do {
                        var4_2 /* !! */  = (int)iv.cqy("cub", cqv(int ), (int)30);
                    } while (!var5_1);
                    throw null;
                }
                case 6: {
                    var4_2 /* !! */  = (int)iv.cqy("cul", cqv(int ), (int)32);
                    cfr_temp_0 = 5;
                    if (!var5_1) continue block72;
                    throw null;
                }
                case 7: {
                    var4_2 /* !! */  = (int)iv.cqy("cup", cqv(int ), (int)33);
                    cfr_temp_0 = 12;
                    if (!var5_1) continue block72;
                    throw null;
                }
                case 10: {
                    var4_2 /* !! */  = (int)iv.cqy("cvr", cqv(int ), (int)36);
                    if (var5_1) {
                        throw null;
                    }
                    ** GOTO lbl-1000
                }
                case 11: {
                    var4_2 /* !! */  = (int)iv.cqy("cvs", cqv(int ), (int)37);
                    if (var5_1) {
                        throw null;
                    }
                }
                case 5: {
                    var4_2 /* !! */  = (int)iv.cqy("cuf", cqv(int ), (int)31);
                    cfr_temp_0 = 14;
                    if (!var5_1) continue block72;
                    throw null;
                }
                case 12: {
                    var4_2 /* !! */  = (int)iv.cqy("cvt", cqv(int ), (int)38);
                    cfr_temp_0 = 8;
                    if (!var5_1) continue block72;
                    throw null;
                }
                case 13: {
                    var4_2 /* !! */  = (int)iv.cqy("cvu", cqv(int ), (int)39);
                    cfr_temp_0 = 8;
                    if (!var5_1) continue block72;
                    throw null;
                }
                case 14: {
                    var4_2 /* !! */  = (int)iv.cqy("cvv", cqv(int ), (int)40);
                    if (var5_1) {
                        throw null;
                    }
                }
                case 2: {
                    var4_2 /* !! */  = (int)iv.cqy("ctz", cqv(int ), (int)28);
                    if (var5_1) {
                        throw null;
                    }
                }
                case 8: {
                    ** GOTO lbl200
                }
                case 15: lbl-1000:
                // 3 sources

                {
                    var4_2 /* !! */  = (int)iv.cqy("cvw", cqv(int ), (int)41);
                    if (var5_1) {
                        throw null;
                    }
lbl200:
                    // 3 sources

                    var4_2 /* !! */  = (int)iv.cqy("cuu", cqv(int ), (int)34);
                    if (var5_1) {
                        throw null;
                    }
                }
                case 9: 
            }
            break;
        } while (true);
        do {
            var4_2 /* !! */  = (int)iv.cqy("cve", cqv(int ), (int)35);
        } while (!var5_1);
        throw null;
        block79: while (true) {
            v15 /* !! */  = (long)(v16 - iv.cqy("csz", crc(int ), (int)34));
lbl212:
            // 2 sources

            switch ((int)v15 /* !! */ ) {
                case -1541929574: {
                    v16 = iv.cqy("cta", crc(int ), (int)35);
                    continue block79;
                }
                case -478389175: {
                    break block79;
                }
                case 529012734: {
                    v16 = iv.cqy("ctb", crc(int ), (int)36);
                    continue block79;
                }
                case 2001912885: {
                    v16 = iv.cqy("ctc", crc(int ), (int)37);
                    continue block79;
                }
            }
            break;
        }
        v17 = (int)(iv$MathHelper.clamp(var1_4, 0.0f, 1.0f) * iv.cqy("cte", ctd(int ), (int)15));
        while (true) {
            if ((v18 = (cfr_temp_3 = iv.p - iv.cqy("ctf", crc(int ), (int)38)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v18 == iv.cqy("ctg", cqv(int ), (int)16)) break;
            v18 = -1295314068;
        }
        v19 = iv.COLORS.length - iv.cqy("cth", cqv(int ), (int)17);
        while (true) {
            block103: {
                if ((v20 = (cfr_temp_4 = iv.p - iv.cqy("cti", crc(int ), (int)39)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                if (v20 != iv.cqy("ctj", cqv(int ), (int)18)) break block103;
                var2_5 = iv.COLORS[Math.min(v17, v19)];
                if (var3_3 != false) return (int)iv.cqy("csg", cqv(int ), (int)9);
                if (var3_3 != false) return (int)iv.cqy("csg", cqv(int ), (int)9);
                v21 = var2_5[0] * iv.cqy("ctk", ctd(int ), (int)19);
                v22 /* !! */  = iv.p;
                if (true) ** GOTO lbl245
            }
            v20 = 10141973;
        }
        block82: while (true) {
            v22 /* !! */  = (long)(v23 - iv.cqy("ctl", crc(int ), (int)40));
lbl245:
            // 2 sources

            switch ((int)v22 /* !! */ ) {
                case -478389175: {
                    break block82;
                }
                case -56674134: {
                    v23 = iv.cqy("ctm", crc(int ), (int)41);
                    continue block82;
                }
                case 438664114: {
                    v23 = iv.cqy("ctn", crc(int ), (int)42);
                    continue block82;
                }
            }
            break;
        }
        v24 = -16777216 | Math.round(v21) << iv.cqy("cto", cqv(int ), (int)20);
        v25 = var2_5[1] * iv.cqy("ctp", ctd(int ), (int)21);
        v26 /* !! */  = iv.p;
        block83: while (true) {
            switch ((int)v26 /* !! */ ) {
                case -478389175: {
                    break block83;
                }
                case 720515911: {
                    v26 /* !! */  = (long)(iv.cqy("ctr", crc(int ), (int)44) - iv.cqy("ctq", crc(int ), (int)43));
                    continue block83;
                }
            }
            break;
        }
        v27 = v24 | Math.round(v25) << iv.cqy("cts", cqv(int ), (int)22);
        v28 = var2_5[2] * iv.cqy("ctt", ctd(int ), (int)23);
        while (true) {
            if ((v29 /* !! */  = (cfr_temp_5 = iv.p - iv.cqy("ctu", crc(int ), (int)45)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v29 /* !! */  == iv.cqy("ctv", cqv(int ), (int)24)) {
                return v27 | Math.round(v28);
            }
            v29 /* !! */  = (long)iv.cqy("ctw", cqv(int ), (int)25);
        }
    }

    private static /* synthetic */ void cvy() {
        iv.cqx[0] = -2008873254;
        iv.cqx[1] = 506152378;
        iv.cqx[2] = -471201982;
        iv.cqx[3] = -241860672;
        iv.cqx[4] = -1764627481;
        iv.cqx[5] = 812837694;
        iv.cqx[6] = -1796354018;
        iv.cqx[7] = 1233369956;
        iv.cqx[8] = -2117136012;
        iv.cqx[9] = 1278218939;
        iv.cqx[10] = 935991979;
        iv.cqx[11] = -1712987948;
        iv.cqx[12] = -1801806850;
        iv.cqx[13] = -624239537;
        iv.cqx[14] = 1488883279;
        iv.cqx[15] = -95986265;
        iv.cqx[16] = 1643319189;
        iv.cqx[17] = 832653360;
        iv.cqx[18] = -673865472;
        iv.cqx[19] = 2064584325;
        iv.cqx[20] = 467536573;
        iv.cqx[21] = -546389410;
        iv.cqx[22] = -2041807324;
        iv.cqx[23] = 1113196667;
        iv.cqx[24] = 1398573119;
        iv.cqx[25] = -574508035;
        iv.cqx[26] = -117329338;
        iv.cqx[27] = 931591282;
        iv.cqx[28] = 1337233801;
        iv.cqx[29] = 2113853122;
        iv.cqx[30] = 1244415134;
        iv.cqx[31] = 394187522;
        iv.cqx[32] = -282487473;
        iv.cqx[33] = 1703718635;
        iv.cqx[34] = -547736001;
        iv.cqx[35] = -1356992182;
        iv.cqx[36] = 1529947744;
        iv.cqx[37] = -810771392;
        iv.cqx[38] = -1071224897;
        iv.cqx[39] = -1486228595;
        iv.cqx[40] = -1745307336;
        iv.cqx[41] = 958204296;
    }

    private static /* synthetic */ void cvz() {
        iv.crd[0] = 5061020309605839017L;
        iv.crd[1] = 5498287440221968516L;
        iv.crd[2] = 7922056400990191727L;
        iv.crd[3] = 8680967392846492025L;
        iv.crd[4] = 649434790878348582L;
        iv.crd[5] = -1366467194107870082L;
        iv.crd[6] = -697373614287181225L;
        iv.crd[7] = -7728679237683075788L;
        iv.crd[8] = -5850603791881655950L;
        iv.crd[9] = 5166949712710308359L;
        iv.crd[10] = 7400625488744980470L;
        iv.crd[11] = 5525678117866309943L;
        iv.crd[12] = -7349018510835063432L;
        iv.crd[13] = -5254964427857298522L;
        iv.crd[14] = 4564503575071737962L;
        iv.crd[15] = -3865061401364536942L;
        iv.crd[16] = -8174817485804022833L;
        iv.crd[17] = -8790235643575840732L;
        iv.crd[18] = -7088342444810397594L;
        iv.crd[19] = 3471162409128716198L;
        iv.crd[20] = -284356698518260545L;
        iv.crd[21] = 2789360339305075151L;
        iv.crd[22] = 4288380490525229959L;
        iv.crd[23] = 7776505026559153679L;
        iv.crd[24] = -3325502349347884987L;
        iv.crd[25] = 6990969169583501452L;
        iv.crd[26] = -6897775329052006816L;
        iv.crd[27] = 7417969105838610750L;
        iv.crd[28] = -3179372004781948474L;
        iv.crd[29] = 1096580798371882171L;
        iv.crd[30] = -4386798187009879533L;
        iv.crd[31] = -7169974420911512529L;
        iv.crd[32] = 7608086165716145525L;
        iv.crd[33] = -1773554782356306340L;
        iv.crd[34] = -4783168550044851332L;
        iv.crd[35] = -4712353707153187679L;
        iv.crd[36] = 2686486938728684480L;
        iv.crd[37] = -635497989620808540L;
        iv.crd[38] = 1415952043286236517L;
        iv.crd[39] = -4246605124077877920L;
        iv.crd[40] = -5538249576068398714L;
        iv.crd[41] = 9218172948103173381L;
        iv.crd[42] = 8653093054663883608L;
        iv.crd[43] = -4191729698850509067L;
        iv.crd[44] = -1567363910675771656L;
        iv.crd[45] = 7775371945395885072L;
    }
}

