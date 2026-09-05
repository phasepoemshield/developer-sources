/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.runtime.ObjectMethods;

final class jr$NameSegment
extends Record {
    public static final boolean a;
    private static long[] bffi;
    public static final long dc = -1527864024036945627L;
    private static long[] bffj;
    public static final boolean c;
    private static int[] bffc;
    private final int color;
    private final String text;
    private static int[] bffb;
    public static final int b;

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private jr$NameSegment(String var1_1, int var2_2) {
        block7: {
            var4_3 /* !! */  = jr$NameSegment.b;
            super();
            if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
            cfr_temp_0 = -2147483648;
            do {
                switch (cfr_temp_0 == -2147483648 ? var4_3 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        this.text = var1_1;
                        this.color = var2_2;
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
                        var4_3 /* !! */  = (int)jr$NameSegment.bffd("bffe", bffa(int ), (int)0);
                        break;
                    }
                    case 1: 
                }
                break;
            } while (true);
            var4_3 /* !! */  = (int)jr$NameSegment.bffd("bfff", bffa(int ), (int)1);
        }
        var4_3 /* !! */  = (int)jr$NameSegment.bffd("bffg", bffa(int ), (int)2);
        ** while (true)
    }

    static {
        bffb = new int[44];
        bffc = new int[44];
        jr$NameSegment.bfin();
        jr$NameSegment.bfio();
        bffi = new long[40];
        bffj = new long[40];
        jr$NameSegment.bfip();
        jr$NameSegment.bfiq();
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public String text() {
        v0 /* !! */  = jr$NameSegment.dc;
        block18: while (true) {
            switch ((int)v0 /* !! */ ) {
                case -567422683: {
                    break block18;
                }
                case 534605110: {
                    v0 /* !! */  = (long)(jr$NameSegment.bffd("bfhk", bffh(int ), (int)24) - jr$NameSegment.bffd("bfhj", bffh(int ), (int)23));
                    continue block18;
                }
            }
            break;
        }
        var3_1 = jr$NameSegment.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = jr$NameSegment.dc - jr$NameSegment.bffd("bfhl", bffh(int ), (int)25)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == jr$NameSegment.bffd("bfhm", bffa(int ), (int)31)) break;
            v1 /* !! */  = (long)jr$NameSegment.bffd("bfhn", bffa(int ), (int)32);
        }
        var2_2 /* !! */  = jr$NameSegment.b;
        v2 /* !! */  = jr$NameSegment.dc;
        block20: while (true) {
            switch ((int)v2 /* !! */ ) {
                case -567422683: {
                    break block20;
                }
                case 1849381751: {
                    v2 /* !! */  = (long)(jr$NameSegment.bffd("bfhp", bffh(int ), (int)27) - jr$NameSegment.bffd("bfho", bffh(int ), (int)26));
                    continue block20;
                }
            }
            break;
        }
        var1_3 = jr$NameSegment.a;
        if (var3_1) {
            throw null;
        }
        if (var1_3 != false) return null;
        if (var1_3 != false) return null;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block21: while (true) {
            block28: {
                switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        v3 /* !! */  = jr$NameSegment.dc;
                        block22: while (true) {
                            switch ((int)v3 /* !! */ ) {
                                case -567422683: {
                                    return this.text;
                                }
                                case 1837705013: {
                                    v3 /* !! */  = (long)(jr$NameSegment.bffd("bfhr", bffh(int ), (int)29) - jr$NameSegment.bffd("bfhq", bffh(int ), (int)28));
                                    continue block22;
                                }
                            }
                            break;
                        }
                        return this.text;
                    }
                    case 0: {
                        var2_2 /* !! */  = (int)jr$NameSegment.bffd("bfhs", bffa(int ), (int)33);
                        cfr_temp_0 = 1;
                        if (var3_1) {
                            throw null;
                        }
                        break block28;
                    }
                    case 3: {
                        var2_2 /* !! */  = (int)jr$NameSegment.bffd("bfhv", bffa(int ), (int)36);
                        if (var3_1) {
                            throw null;
                        }
                        ** GOTO lbl-1000
                    }
                    case 1: lbl-1000:
                    // 2 sources

                    {
                        var2_2 /* !! */  = (int)jr$NameSegment.bffd("bfht", bffa(int ), (int)34);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 2: 
                }
                ** GOTO lbl63
            }
            do {
                if (true) continue block21;
lbl63:
                // 2 sources

                var2_2 /* !! */  = (int)jr$NameSegment.bffd("bfhu", bffa(int ), (int)35);
                cfr_temp_0 = 1;
            } while (!var3_1);
            break;
        }
        throw null;
    }

    private static /* synthetic */ void bfiq() {
        jr$NameSegment.bffj[0] = -2837965824936006807L;
        jr$NameSegment.bffj[1] = -9220444892848522105L;
        jr$NameSegment.bffj[2] = 3012179088028316925L;
        jr$NameSegment.bffj[3] = -154096864977268665L;
        jr$NameSegment.bffj[4] = -3300962884485428961L;
        jr$NameSegment.bffj[5] = -5742999548989988501L;
        jr$NameSegment.bffj[6] = 225183739738728671L;
        jr$NameSegment.bffj[7] = 237577428697755319L;
        jr$NameSegment.bffj[8] = -7907587730972818512L;
        jr$NameSegment.bffj[9] = -3890710708015782952L;
        jr$NameSegment.bffj[10] = -7813502853519559778L;
        jr$NameSegment.bffj[11] = -1834450124995012576L;
        jr$NameSegment.bffj[12] = 5593983805390040245L;
        jr$NameSegment.bffj[13] = 7673254666250044719L;
        jr$NameSegment.bffj[14] = -6212917750616851057L;
        jr$NameSegment.bffj[15] = -289853565692653504L;
        jr$NameSegment.bffj[16] = 1597901106596453214L;
        jr$NameSegment.bffj[17] = -458065621285837277L;
        jr$NameSegment.bffj[18] = -4234151120380071241L;
        jr$NameSegment.bffj[19] = 7386189006280250699L;
        jr$NameSegment.bffj[20] = -731399748792994114L;
        jr$NameSegment.bffj[21] = 1611208601936099621L;
        jr$NameSegment.bffj[22] = -4151299708583276557L;
        jr$NameSegment.bffj[23] = 9104830053927601544L;
        jr$NameSegment.bffj[24] = 8443171729652491444L;
        jr$NameSegment.bffj[25] = 8643441340162439752L;
        jr$NameSegment.bffj[26] = 804444779243655837L;
        jr$NameSegment.bffj[27] = 2092686095184631120L;
        jr$NameSegment.bffj[28] = -2840625008237746499L;
        jr$NameSegment.bffj[29] = 8393935723259949882L;
        jr$NameSegment.bffj[30] = 2226037136493377147L;
        jr$NameSegment.bffj[31] = -7912447677125325116L;
        jr$NameSegment.bffj[32] = -3523121675614784429L;
        jr$NameSegment.bffj[33] = 985727259584617753L;
        jr$NameSegment.bffj[34] = -2654594343573872485L;
        jr$NameSegment.bffj[35] = 8856670364988608682L;
        jr$NameSegment.bffj[36] = -2464871351279215649L;
        jr$NameSegment.bffj[37] = -4532355495989654586L;
        jr$NameSegment.bffj[38] = -986113533644923453L;
        jr$NameSegment.bffj[39] = 2928233334139727331L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final boolean equals(Object var1_1) {
        v0 /* !! */  = jr$NameSegment.dc;
        if (true) ** GOTO lbl5
        block21: while (true) {
            v0 /* !! */  = (long)(v1 - jr$NameSegment.bffd("bfgs", bffh(int ), (int)13));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -567422683: {
                    break block21;
                }
                case 433915452: {
                    v1 = jr$NameSegment.bffd("bfgt", bffh(int ), (int)14);
                    continue block21;
                }
                case 906657558: {
                    v1 = jr$NameSegment.bffd("bfgu", bffh(int ), (int)15);
                    continue block21;
                }
                case 1501719473: {
                    v1 = jr$NameSegment.bffd("bfgv", bffh(int ), (int)16);
                    continue block21;
                }
            }
            break;
        }
        var4_2 = jr$NameSegment.c;
        v2 /* !! */  = jr$NameSegment.dc;
        if (true) ** GOTO lbl22
        block22: while (true) {
            v2 /* !! */  = (long)(v3 - jr$NameSegment.bffd("bfgw", bffh(int ), (int)17));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -567422683: {
                    break block22;
                }
                case 1403015779: {
                    v3 = jr$NameSegment.bffd("bfgx", bffh(int ), (int)18);
                    continue block22;
                }
                case 1964712021: {
                    v3 = jr$NameSegment.bffd("bfgy", bffh(int ), (int)19);
                    continue block22;
                }
            }
            break;
        }
        var3_3 /* !! */  = jr$NameSegment.b;
        v4 /* !! */  = jr$NameSegment.dc;
        if (true) ** GOTO lbl36
        block23: while (true) {
            v4 /* !! */  = (long)(jr$NameSegment.bffd("bfha", bffh(int ), (int)21) - jr$NameSegment.bffd("bfgz", bffh(int ), (int)20));
lbl36:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -2065460588: {
                    continue block23;
                }
                case -567422683: {
                    break block23;
                }
            }
            break;
        }
        var2_4 = jr$NameSegment.a;
        if (!var4_2) ** GOTO lbl48
        throw null;
        {
            if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
            switch (var3_3 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return (boolean)jr$NameSegment.bffd("bfhb", bffa(int ), (int)24);
                }
lbl48:
                // 1 sources

                if (var2_4 || var2_4) continue block24;
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_0 = jr$NameSegment.dc - jr$NameSegment.bffd("bfhc", bffh(int ), (int)22)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == jr$NameSegment.bffd("bfhd", bffa(int ), (int)25)) break;
                    v5 /* !! */  = (long)jr$NameSegment.bffd("bfhe", bffa(int ), (int)26);
                }
                return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{jr$NameSegment.class, "text;color", "text", "color"}, this, var1_1);
                case 0: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var3_3 /* !! */  = (int)jr$NameSegment.bffd("bfhf", bffa(int ), (int)27);
                        if (!var4_2) break block24;
                        throw null;
                    }
                }
                case 1: {
                    do {
                        var3_3 /* !! */  = (int)jr$NameSegment.bffd("bfhg", bffa(int ), (int)28);
                    } while (!var4_2);
                    throw null;
                }
                case 2: {
                    var3_3 /* !! */  = (int)jr$NameSegment.bffd("bfhh", bffa(int ), (int)29);
                    if (!var4_2) break block24;
                    throw null;
                }
                case 3: 
            }
        }
        var3_3 /* !! */  = (int)jr$NameSegment.bffd("bfhi", bffa(int ), (int)30);
        ** while (!var4_2)
lbl73:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ long bffh(int n2) {
        return bffi[n2] ^ bffj[n2];
    }

    public static /* synthetic */ CallSite bffd(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void bfio() {
        jr$NameSegment.bffc[0] = -205219616;
        jr$NameSegment.bffc[1] = 1183284449;
        jr$NameSegment.bffc[2] = 81772894;
        jr$NameSegment.bffc[3] = 1856595967;
        jr$NameSegment.bffc[4] = 8703459;
        jr$NameSegment.bffc[5] = -424177445;
        jr$NameSegment.bffc[6] = -167835813;
        jr$NameSegment.bffc[7] = 1704834693;
        jr$NameSegment.bffc[8] = 1431788163;
        jr$NameSegment.bffc[9] = -79207525;
        jr$NameSegment.bffc[10] = -1275779939;
        jr$NameSegment.bffc[11] = 715413145;
        jr$NameSegment.bffc[12] = -1986428680;
        jr$NameSegment.bffc[13] = -1658419166;
        jr$NameSegment.bffc[14] = -1153227513;
        jr$NameSegment.bffc[15] = -968168103;
        jr$NameSegment.bffc[16] = 426502519;
        jr$NameSegment.bffc[17] = 782887195;
        jr$NameSegment.bffc[18] = -1313311722;
        jr$NameSegment.bffc[19] = 326278661;
        jr$NameSegment.bffc[20] = -1044732704;
        jr$NameSegment.bffc[21] = -553631632;
        jr$NameSegment.bffc[22] = 788614145;
        jr$NameSegment.bffc[23] = 976864725;
        jr$NameSegment.bffc[24] = -97002337;
        jr$NameSegment.bffc[25] = 1027058009;
        jr$NameSegment.bffc[26] = 761751598;
        jr$NameSegment.bffc[27] = -2037075485;
        jr$NameSegment.bffc[28] = -468570988;
        jr$NameSegment.bffc[29] = -430745265;
        jr$NameSegment.bffc[30] = 1141336210;
        jr$NameSegment.bffc[31] = -457932867;
        jr$NameSegment.bffc[32] = 2137269757;
        jr$NameSegment.bffc[33] = -1643083274;
        jr$NameSegment.bffc[34] = 1988785307;
        jr$NameSegment.bffc[35] = -1834474797;
        jr$NameSegment.bffc[36] = -604725400;
        jr$NameSegment.bffc[37] = -900197137;
        jr$NameSegment.bffc[38] = -206052519;
        jr$NameSegment.bffc[39] = 436266230;
        jr$NameSegment.bffc[40] = -1956163892;
        jr$NameSegment.bffc[41] = -1396887125;
        jr$NameSegment.bffc[42] = 1625132995;
        jr$NameSegment.bffc[43] = 1398941947;
    }

    private static /* synthetic */ int bffa(int n2) {
        return bffb[n2] ^ bffc[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final String toString() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = jr$NameSegment.dc - jr$NameSegment.bffd("bffk", bffh(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == jr$NameSegment.bffd("bffl", bffa(int ), (int)3)) break;
            v0 /* !! */  = (long)jr$NameSegment.bffd("bffm", bffa(int ), (int)4);
        }
        var3_1 = jr$NameSegment.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = jr$NameSegment.dc - jr$NameSegment.bffd("bffn", bffh(int ), (int)1)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == jr$NameSegment.bffd("bffo", bffa(int ), (int)5)) break;
            v1 /* !! */  = (long)jr$NameSegment.bffd("bffp", bffa(int ), (int)6);
        }
        var2_2 /* !! */  = jr$NameSegment.b;
        v2 /* !! */  = jr$NameSegment.dc;
        if (true) ** GOTO lbl19
        block13: while (true) {
            v2 /* !! */  = (long)(v3 - jr$NameSegment.bffd("bffq", bffh(int ), (int)2));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1946212332: {
                    v3 = jr$NameSegment.bffd("bffr", bffh(int ), (int)3);
                    continue block13;
                }
                case -598943321: {
                    v3 = jr$NameSegment.bffd("bffs", bffh(int ), (int)4);
                    continue block13;
                }
                case -567422683: {
                    break block13;
                }
            }
            break;
        }
        var1_3 = jr$NameSegment.a;
        if (var3_1) {
            throw null;
lbl31:
            // 2 sources

            return null;
        }
        if (var1_3) ** GOTO lbl31
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block5 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = jr$NameSegment.dc - jr$NameSegment.bffd("bfft", bffh(int ), (int)5)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == jr$NameSegment.bffd("bffu", bffa(int ), (int)7)) break;
                    v4 /* !! */  = (long)jr$NameSegment.bffd("bffv", bffa(int ), (int)8);
                }
                return ObjectMethods.bootstrap("toString", new MethodHandle[]{jr$NameSegment.class, "text;color", "text", "color"}, this);
            }
            case 0: {
                var2_2 /* !! */  = (int)jr$NameSegment.bffd("bffw", bffa(int ), (int)9);
                if (!var3_1) break;
                throw null;
            }
lbl49:
            // 2 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)jr$NameSegment.bffd("bffx", bffa(int ), (int)10);
                    if (!var3_1) break block5;
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)jr$NameSegment.bffd("bffy", bffa(int ), (int)11);
                if (!var3_1) ** GOTO lbl49
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)jr$NameSegment.bffd("bffz", bffa(int ), (int)12);
        ** while (!var3_1)
lbl61:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void bfip() {
        jr$NameSegment.bffi[0] = 5687575824110972815L;
        jr$NameSegment.bffi[1] = 1823937114578436221L;
        jr$NameSegment.bffi[2] = 7480872985514519123L;
        jr$NameSegment.bffi[3] = 7354698857401580110L;
        jr$NameSegment.bffi[4] = -2788622631169662573L;
        jr$NameSegment.bffi[5] = -4744519013447411180L;
        jr$NameSegment.bffi[6] = 5617955066024155710L;
        jr$NameSegment.bffi[7] = -1266064877330795379L;
        jr$NameSegment.bffi[8] = -8354951632922137468L;
        jr$NameSegment.bffi[9] = -1444014356793461947L;
        jr$NameSegment.bffi[10] = 8863329778093293761L;
        jr$NameSegment.bffi[11] = -3696988669772860623L;
        jr$NameSegment.bffi[12] = 2602981695558629665L;
        jr$NameSegment.bffi[13] = -1705232954526397505L;
        jr$NameSegment.bffi[14] = -1564612206148062343L;
        jr$NameSegment.bffi[15] = 7531219637722660750L;
        jr$NameSegment.bffi[16] = -7483164641261505054L;
        jr$NameSegment.bffi[17] = 2139490403079433959L;
        jr$NameSegment.bffi[18] = -1740594711751244881L;
        jr$NameSegment.bffi[19] = 5892958628883343382L;
        jr$NameSegment.bffi[20] = -1173928644851943992L;
        jr$NameSegment.bffi[21] = -6846096244501241859L;
        jr$NameSegment.bffi[22] = 2162859521309809711L;
        jr$NameSegment.bffi[23] = -1547373436794871302L;
        jr$NameSegment.bffi[24] = 7133996236972930384L;
        jr$NameSegment.bffi[25] = -5001408747745930412L;
        jr$NameSegment.bffi[26] = -148495188310555546L;
        jr$NameSegment.bffi[27] = -8857982297519766223L;
        jr$NameSegment.bffi[28] = 3528071413054845040L;
        jr$NameSegment.bffi[29] = 3392110431952378034L;
        jr$NameSegment.bffi[30] = -3896347631818001715L;
        jr$NameSegment.bffi[31] = 7873381254456717205L;
        jr$NameSegment.bffi[32] = 5631763547002539209L;
        jr$NameSegment.bffi[33] = -1928406945438212750L;
        jr$NameSegment.bffi[34] = -3287352735070096843L;
        jr$NameSegment.bffi[35] = -1005274000290859769L;
        jr$NameSegment.bffi[36] = 3777167734916043681L;
        jr$NameSegment.bffi[37] = -5358597687208726000L;
        jr$NameSegment.bffi[38] = 4961052121351040278L;
        jr$NameSegment.bffi[39] = 4483669829456567509L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final int hashCode() {
        v0 /* !! */  = jr$NameSegment.dc;
        if (true) ** GOTO lbl5
        block12: while (true) {
            v0 /* !! */  = (long)(v1 - jr$NameSegment.bffd("bfga", bffh(int ), (int)6));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1783708842: {
                    v1 = jr$NameSegment.bffd("bfgb", bffh(int ), (int)7);
                    continue block12;
                }
                case -567422683: {
                    break block12;
                }
                case -38300155: {
                    v1 = jr$NameSegment.bffd("bfgc", bffh(int ), (int)8);
                    continue block12;
                }
                case 156350742: {
                    v1 = jr$NameSegment.bffd("bfgd", bffh(int ), (int)9);
                    continue block12;
                }
            }
            break;
        }
        var3_1 = jr$NameSegment.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = jr$NameSegment.dc - jr$NameSegment.bffd("bfge", bffh(int ), (int)10)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == jr$NameSegment.bffd("bfgf", bffa(int ), (int)13)) break;
            v2 /* !! */  = (long)jr$NameSegment.bffd("bfgg", bffa(int ), (int)14);
        }
        var2_2 /* !! */  = jr$NameSegment.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_1 = jr$NameSegment.dc - jr$NameSegment.bffd("bfgh", bffh(int ), (int)11)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == jr$NameSegment.bffd("bfgi", bffa(int ), (int)15)) break;
                    v3 /* !! */  = (long)jr$NameSegment.bffd("bfgj", bffa(int ), (int)16);
                }
                var1_3 = jr$NameSegment.a;
                if (var3_1) {
                    throw null;
                    return (int)jr$NameSegment.bffd("bfgk", bffa(int ), (int)17);
                }
                if (var1_3 || var1_3) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = jr$NameSegment.dc - jr$NameSegment.bffd("bfgl", bffh(int ), (int)12)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == jr$NameSegment.bffd("bfgm", bffa(int ), (int)18)) break;
                    v4 /* !! */  = (long)jr$NameSegment.bffd("bfgn", bffa(int ), (int)19);
                }
                return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{jr$NameSegment.class, "text;color", "text", "color"}, this);
            }
            case 0: {
                do {
                    var2_2 /* !! */  = (int)jr$NameSegment.bffd("bfgo", bffa(int ), (int)20);
                } while (!var3_1);
                throw null;
            }
            case 1: {
                do {
                    var2_2 /* !! */  = (int)jr$NameSegment.bffd("bfgp", bffa(int ), (int)21);
                } while (!var3_1);
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)jr$NameSegment.bffd("bfgq", bffa(int ), (int)22);
                if (!var3_1) break;
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)jr$NameSegment.bffd("bfgr", bffa(int ), (int)23);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ void bfin() {
        jr$NameSegment.bffb[0] = -205219616;
        jr$NameSegment.bffb[1] = 1183284451;
        jr$NameSegment.bffb[2] = 81772894;
        jr$NameSegment.bffb[3] = 1856595966;
        jr$NameSegment.bffb[4] = 1089559246;
        jr$NameSegment.bffb[5] = -424177446;
        jr$NameSegment.bffb[6] = 307189164;
        jr$NameSegment.bffb[7] = -1704834694;
        jr$NameSegment.bffb[8] = 1400238041;
        jr$NameSegment.bffb[9] = -79207528;
        jr$NameSegment.bffb[10] = -1275779937;
        jr$NameSegment.bffb[11] = 715413144;
        jr$NameSegment.bffb[12] = -1986428679;
        jr$NameSegment.bffb[13] = -1658419165;
        jr$NameSegment.bffb[14] = 30107542;
        jr$NameSegment.bffb[15] = 968168102;
        jr$NameSegment.bffb[16] = 646728737;
        jr$NameSegment.bffb[17] = -1021829469;
        jr$NameSegment.bffb[18] = 1313311721;
        jr$NameSegment.bffb[19] = 1762962640;
        jr$NameSegment.bffb[20] = -1044732704;
        jr$NameSegment.bffb[21] = -553631631;
        jr$NameSegment.bffb[22] = 788614144;
        jr$NameSegment.bffb[23] = 976864724;
        jr$NameSegment.bffb[24] = -97002337;
        jr$NameSegment.bffb[25] = 1027058008;
        jr$NameSegment.bffb[26] = 229767370;
        jr$NameSegment.bffb[27] = -2037075488;
        jr$NameSegment.bffb[28] = -468570986;
        jr$NameSegment.bffb[29] = -430745267;
        jr$NameSegment.bffb[30] = 1141336210;
        jr$NameSegment.bffb[31] = -457932868;
        jr$NameSegment.bffb[32] = -786864494;
        jr$NameSegment.bffb[33] = -1643083274;
        jr$NameSegment.bffb[34] = 1988785304;
        jr$NameSegment.bffb[35] = -1834474797;
        jr$NameSegment.bffb[36] = -604725399;
        jr$NameSegment.bffb[37] = -900197138;
        jr$NameSegment.bffb[38] = 1792538785;
        jr$NameSegment.bffb[39] = -113930048;
        jr$NameSegment.bffb[40] = -1956163889;
        jr$NameSegment.bffb[41] = -1396887128;
        jr$NameSegment.bffb[42] = 1625132994;
        jr$NameSegment.bffb[43] = 1398941946;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public int color() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = jr$NameSegment.dc - jr$NameSegment.bffd("bfhw", bffh(int ), (int)30)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == jr$NameSegment.bffd("bfhx", bffa(int ), (int)37)) break;
            v0 /* !! */  = (long)jr$NameSegment.bffd("bfhy", bffa(int ), (int)38);
        }
        var3_1 = jr$NameSegment.c;
        v1 /* !! */  = jr$NameSegment.dc;
        if (true) ** GOTO lbl12
        block22: while (true) {
            v1 /* !! */  = (long)(v2 - jr$NameSegment.bffd("bfhz", bffh(int ), (int)31));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -2129038221: {
                    v2 = jr$NameSegment.bffd("bfia", bffh(int ), (int)32);
                    continue block22;
                }
                case -567422683: {
                    break block22;
                }
                case -272191104: {
                    v2 = jr$NameSegment.bffd("bfib", bffh(int ), (int)33);
                    continue block22;
                }
                case 1025302690: {
                    v2 = jr$NameSegment.bffd("bfic", bffh(int ), (int)34);
                    continue block22;
                }
            }
            break;
        }
        var2_2 /* !! */  = jr$NameSegment.b;
        v3 /* !! */  = jr$NameSegment.dc;
        if (true) ** GOTO lbl29
        block23: while (true) {
            v3 /* !! */  = (long)(v4 - jr$NameSegment.bffd("bfid", bffh(int ), (int)35));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1654811168: {
                    v4 = jr$NameSegment.bffd("bfie", bffh(int ), (int)36);
                    continue block23;
                }
                case -567422683: {
                    break block23;
                }
                case 1927605229: {
                    v4 = jr$NameSegment.bffd("bfif", bffh(int ), (int)37);
                    continue block23;
                }
            }
            break;
        }
        var1_3 = jr$NameSegment.a;
        if (var3_1) {
            throw null;
lbl41:
            // 2 sources

            return (int)jr$NameSegment.bffd("bfig", bffa(int ), (int)39);
        }
        if (var1_3) ** GOTO lbl41
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                v5 /* !! */  = jr$NameSegment.dc;
                if (true) ** GOTO lbl52
                block25: while (true) {
                    v5 /* !! */  = (long)(jr$NameSegment.bffd("bfii", bffh(int ), (int)39) - jr$NameSegment.bffd("bfih", bffh(int ), (int)38));
lbl52:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -567422683: {
                            break block25;
                        }
                        case -548630726: {
                            continue block25;
                        }
                    }
                    break;
                }
                return this.color;
            }
lbl58:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)jr$NameSegment.bffd("bfij", bffa(int ), (int)40);
                if (var3_1) {
                    throw null;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)jr$NameSegment.bffd("bfik", bffa(int ), (int)41);
                if (!var3_1) break;
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)jr$NameSegment.bffd("bfil", bffa(int ), (int)42);
                if (!var3_1) ** GOTO lbl58
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)jr$NameSegment.bffd("bfim", bffa(int ), (int)43);
        } while (!var3_1);
        throw null;
    }
}

