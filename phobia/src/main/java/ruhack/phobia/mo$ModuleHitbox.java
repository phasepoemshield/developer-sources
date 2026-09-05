/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.runtime.ObjectMethods
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.runtime.ObjectMethods;
import ruhack.phobia.ds;

record mo$ModuleHitbox(ds module, float y, float width, float x, float height, float headerBottom) {
    private final ds module;
    public static final int b;
    static final long mm = 3641905319222182603L;
    private final float y;
    private static int[] fkyv;
    private final float width;
    private final float x;
    private static long[] fkzd;
    private static long[] fkze;
    private final float height;
    private final float headerBottom;
    public static final boolean c;
    private static int[] fkyu;
    public static final boolean a;

    static {
        fkyu = new int[80];
        fkyv = new int[80];
        mo$ModuleHitbox.flfa();
        mo$ModuleHitbox.flfb();
        fkzd = new long[75];
        fkze = new long[75];
        mo$ModuleHitbox.flfc();
        mo$ModuleHitbox.flfd();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final int hashCode() {
        v0 /* !! */  = mo$ModuleHitbox.mm;
        if (true) ** GOTO lbl5
        block26: while (true) {
            v0 /* !! */  = (long)(v1 - mo$ModuleHitbox.fkyw("fkzv", fkzc(int ), (int)8));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1713896757: {
                    break block26;
                }
                case -415783464: {
                    v1 = mo$ModuleHitbox.fkyw("fkzw", fkzc(int ), (int)9);
                    continue block26;
                }
                case 2029981275: {
                    v1 = mo$ModuleHitbox.fkyw("fkzx", fkzc(int ), (int)10);
                    continue block26;
                }
            }
            break;
        }
        var3_1 = mo$ModuleHitbox.c;
        v2 /* !! */  = mo$ModuleHitbox.mm;
        if (true) ** GOTO lbl19
        block27: while (true) {
            v2 /* !! */  = (long)(v3 - mo$ModuleHitbox.fkyw("fkzy", fkzc(int ), (int)11));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1713896757: {
                    break block27;
                }
                case -415256399: {
                    v3 = mo$ModuleHitbox.fkyw("fkzz", fkzc(int ), (int)12);
                    continue block27;
                }
                case 1710928828: {
                    v3 = mo$ModuleHitbox.fkyw("flaa", fkzc(int ), (int)13);
                    continue block27;
                }
            }
            break;
        }
        var2_2 /* !! */  = mo$ModuleHitbox.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v4 /* !! */  = mo$ModuleHitbox.mm;
                if (true) ** GOTO lbl36
                block28: while (true) {
                    v4 /* !! */  = (long)(v5 - mo$ModuleHitbox.fkyw("flab", fkzc(int ), (int)14));
lbl36:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1713896757: {
                            break block28;
                        }
                        case -911843134: {
                            v5 = mo$ModuleHitbox.fkyw("flac", fkzc(int ), (int)15);
                            continue block28;
                        }
                        case 698879179: {
                            v5 = mo$ModuleHitbox.fkyw("flad", fkzc(int ), (int)16);
                            continue block28;
                        }
                        case 1151524654: {
                            v5 = mo$ModuleHitbox.fkyw("flae", fkzc(int ), (int)17);
                            continue block28;
                        }
                    }
                    break;
                }
                var1_3 = mo$ModuleHitbox.a;
                if (var3_1) {
                    throw null;
                    return (int)mo$ModuleHitbox.fkyw("flaf", fkyt(int ), (int)13);
                }
                if (var1_3 || var1_3) ** continue;
                v6 /* !! */  = mo$ModuleHitbox.mm;
                if (true) ** GOTO lbl58
                block30: while (true) {
                    v6 /* !! */  = (long)(mo$ModuleHitbox.fkyw("flah", fkzc(int ), (int)19) - mo$ModuleHitbox.fkyw("flag", fkzc(int ), (int)18));
lbl58:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1713896757: {
                            break block30;
                        }
                        case 1470070432: {
                            continue block30;
                        }
                    }
                    break;
                }
                return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{mo$ModuleHitbox.class, "module;x;y;width;height;headerBottom", "module", "x", "y", "width", "height", "headerBottom"}, this);
            }
            case 0: {
                var2_2 /* !! */  = (int)mo$ModuleHitbox.fkyw("flai", fkyt(int ), (int)14);
                if (var3_1) {
                    throw null;
                }
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)mo$ModuleHitbox.fkyw("flaj", fkyt(int ), (int)15);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)mo$ModuleHitbox.fkyw("flak", fkyt(int ), (int)16);
                if (!var3_1) break;
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)mo$ModuleHitbox.fkyw("flal", fkyt(int ), (int)17);
        ** while (!var3_1)
lbl80:
        // 1 sources

        throw null;
    }

    public static /* synthetic */ CallSite fkyw(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private mo$ModuleHitbox(ds ds2, float f2, float f3, float f4, float f5, float f6) {
        int n2 = b;
        this.module = ds2;
        this.x = f2;
        this.y = f3;
        this.width = f4;
        this.height = f5;
        this.headerBottom = f6;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public float y() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = mo$ModuleHitbox.mm - mo$ModuleHitbox.fkyw("flcl", fkzc(int ), (int)44)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == mo$ModuleHitbox.fkyw("flcm", fkyt(int ), (int)44)) break;
            v0 /* !! */  = (long)mo$ModuleHitbox.fkyw("flcn", fkyt(int ), (int)45);
        }
        var3_1 = mo$ModuleHitbox.c;
        v1 /* !! */  = mo$ModuleHitbox.mm;
        if (true) ** GOTO lbl12
        block19: while (true) {
            v1 /* !! */  = (long)(v2 - mo$ModuleHitbox.fkyw("flco", fkzc(int ), (int)45));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1713896757: {
                    break block19;
                }
                case -1229934062: {
                    v2 = mo$ModuleHitbox.fkyw("flcp", fkzc(int ), (int)46);
                    continue block19;
                }
                case 1017598283: {
                    v2 = mo$ModuleHitbox.fkyw("flcq", fkzc(int ), (int)47);
                    continue block19;
                }
                case 1147909618: {
                    v2 = mo$ModuleHitbox.fkyw("flcr", fkzc(int ), (int)48);
                    continue block19;
                }
            }
            break;
        }
        var2_2 /* !! */  = mo$ModuleHitbox.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = mo$ModuleHitbox.mm - mo$ModuleHitbox.fkyw("flcs", fkzc(int ), (int)49)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == mo$ModuleHitbox.fkyw("flct", fkyt(int ), (int)46)) break;
            v3 /* !! */  = (long)mo$ModuleHitbox.fkyw("flcu", fkyt(int ), (int)47);
        }
        var1_3 = mo$ModuleHitbox.a;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_1) {
                    throw null;
                    return (float)mo$ModuleHitbox.fkyw("flcv", flcc(int ), (int)48);
                }
                if (var1_3 || var1_3) ** continue;
                v4 /* !! */  = mo$ModuleHitbox.mm;
                if (true) ** GOTO lbl44
                block22: while (true) {
                    v4 /* !! */  = (long)(v5 - mo$ModuleHitbox.fkyw("flcw", fkzc(int ), (int)50));
lbl44:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1713896757: {
                            break block22;
                        }
                        case -1604232738: {
                            v5 = mo$ModuleHitbox.fkyw("flcx", fkzc(int ), (int)51);
                            continue block22;
                        }
                        case -1042581091: {
                            v5 = mo$ModuleHitbox.fkyw("flcy", fkzc(int ), (int)52);
                            continue block22;
                        }
                        case 297330908: {
                            v5 = mo$ModuleHitbox.fkyw("flcz", fkzc(int ), (int)53);
                            continue block22;
                        }
                    }
                    break;
                }
                return this.y;
            }
lbl57:
            // 2 sources

            case 0: {
                do {
                    var2_2 /* !! */  = (int)mo$ModuleHitbox.fkyw("flda", fkyt(int ), (int)49);
                } while (!var3_1);
                throw null;
            }
            case 1: {
                var2_2 /* !! */  = (int)mo$ModuleHitbox.fkyw("fldb", fkyt(int ), (int)50);
                if (!var3_1) ** GOTO lbl57
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)mo$ModuleHitbox.fkyw("fldc", fkyt(int ), (int)51);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)mo$ModuleHitbox.fkyw("fldd", fkyt(int ), (int)52);
        ** while (!var3_1)
lbl74:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public float width() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = mo$ModuleHitbox.mm - mo$ModuleHitbox.fkyw("flde", fkzc(int ), (int)54)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == mo$ModuleHitbox.fkyw("fldf", fkyt(int ), (int)53)) break;
            v0 /* !! */  = (long)mo$ModuleHitbox.fkyw("fldg", fkyt(int ), (int)54);
        }
        var3_1 = mo$ModuleHitbox.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = mo$ModuleHitbox.mm - mo$ModuleHitbox.fkyw("fldh", fkzc(int ), (int)55)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == mo$ModuleHitbox.fkyw("fldi", fkyt(int ), (int)55)) break;
            v1 /* !! */  = (long)mo$ModuleHitbox.fkyw("fldj", fkyt(int ), (int)56);
        }
        var2_2 /* !! */  = mo$ModuleHitbox.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v2 /* !! */  = mo$ModuleHitbox.mm;
                if (true) ** GOTO lbl22
                block13: while (true) {
                    v2 /* !! */  = (long)(v3 - mo$ModuleHitbox.fkyw("fldk", fkzc(int ), (int)56));
lbl22:
                    // 2 sources

                    switch ((int)v2 /* !! */ ) {
                        case -1713896757: {
                            break block13;
                        }
                        case -622280153: {
                            v3 = mo$ModuleHitbox.fkyw("fldl", fkzc(int ), (int)57);
                            continue block13;
                        }
                        case 324469959: {
                            v3 = mo$ModuleHitbox.fkyw("fldm", fkzc(int ), (int)58);
                            continue block13;
                        }
                    }
                    break;
                }
                var1_3 = mo$ModuleHitbox.a;
                if (var3_1) {
                    throw null;
                    return (float)mo$ModuleHitbox.fkyw("fldn", flcc(int ), (int)57);
                }
                if (var1_3 || var1_3) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = mo$ModuleHitbox.mm - mo$ModuleHitbox.fkyw("fldo", fkzc(int ), (int)59)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == mo$ModuleHitbox.fkyw("fldp", fkyt(int ), (int)58)) break;
                    v4 /* !! */  = (long)mo$ModuleHitbox.fkyw("fldq", fkyt(int ), (int)59);
                }
                return this.width;
            }
lbl44:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)mo$ModuleHitbox.fkyw("fldr", fkyt(int ), (int)60);
                if (!var3_1) break;
                throw null;
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)mo$ModuleHitbox.fkyw("flds", fkyt(int ), (int)61);
                    if (!var3_1) ** GOTO lbl44
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)mo$ModuleHitbox.fkyw("fldt", fkyt(int ), (int)62);
                if (!var3_1) break;
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)mo$ModuleHitbox.fkyw("fldu", fkyt(int ), (int)63);
        ** while (!var3_1)
lbl60:
        // 1 sources

        throw null;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public final String toString() {
        boolean bl2;
        Object object = mm;
        block10: while (true) {
            switch ((int)object) {
                case -1713896757: {
                    break block10;
                }
                case -785320839: {
                    object = mo$ModuleHitbox.fkyw("fkzg", fkzc(int ), (int)1) - mo$ModuleHitbox.fkyw("fkzf", fkzc(int ), (int)0);
                    continue block10;
                }
            }
            break;
        }
        boolean bl3 = c;
        Object object2 = mm;
        boolean bl4 = true;
        block11: while (true) {
            CallSite callSite;
            if (!bl4 || (bl4 = false) || !true) {
                object2 = callSite - mo$ModuleHitbox.fkyw("fkzh", fkzc(int ), (int)2);
            }
            switch ((int)object2) {
                case -1713896757: {
                    break block11;
                }
                case 290580830: {
                    callSite = mo$ModuleHitbox.fkyw("fkzi", fkzc(int ), (int)3);
                    continue block11;
                }
                case 504200260: {
                    callSite = mo$ModuleHitbox.fkyw("fkzj", fkzc(int ), (int)4);
                    continue block11;
                }
                case 1323262753: {
                    callSite = mo$ModuleHitbox.fkyw("fkzk", fkzc(int ), (int)5);
                    continue block11;
                }
            }
            break;
        }
        int n2 = b;
        while (true) {
            long l2;
            Object object3;
            if ((object3 = (l2 = mm - mo$ModuleHitbox.fkyw("fkzl", fkzc(int ), (int)6)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (object3 == mo$ModuleHitbox.fkyw("fkzm", fkyt(int ), (int)5)) {
                bl2 = a;
                if (bl3) {
                    throw null;
                }
                break;
            }
            object3 = mo$ModuleHitbox.fkyw("fkzn", fkyt(int ), (int)6);
        }
        if (bl2) return null;
        if (bl2) return null;
        while (true) {
            long l3;
            Object object4;
            if ((object4 = (l3 = mm - mo$ModuleHitbox.fkyw("fkzo", fkzc(int ), (int)7)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (object4 == mo$ModuleHitbox.fkyw("fkzp", fkyt(int ), (int)7)) {
                return ObjectMethods.bootstrap("toString", new MethodHandle[]{mo$ModuleHitbox.class, "module;x;y;width;height;headerBottom", "module", "x", "y", "width", "height", "headerBottom"}, this);
            }
            object4 = mo$ModuleHitbox.fkyw("fkzq", fkyt(int ), (int)8);
        }
    }

    private static /* synthetic */ void flfa() {
        mo$ModuleHitbox.fkyu[0] = -395181962;
        mo$ModuleHitbox.fkyu[1] = -2086082074;
        mo$ModuleHitbox.fkyu[2] = 510752844;
        mo$ModuleHitbox.fkyu[3] = -1138813680;
        mo$ModuleHitbox.fkyu[4] = -17594868;
        mo$ModuleHitbox.fkyu[5] = 1353750098;
        mo$ModuleHitbox.fkyu[6] = -1442929032;
        mo$ModuleHitbox.fkyu[7] = 114113673;
        mo$ModuleHitbox.fkyu[8] = 525690819;
        mo$ModuleHitbox.fkyu[9] = -1756433200;
        mo$ModuleHitbox.fkyu[10] = 1062193823;
        mo$ModuleHitbox.fkyu[11] = -1883450316;
        mo$ModuleHitbox.fkyu[12] = -1053225582;
        mo$ModuleHitbox.fkyu[13] = -890867776;
        mo$ModuleHitbox.fkyu[14] = 288124534;
        mo$ModuleHitbox.fkyu[15] = -565251444;
        mo$ModuleHitbox.fkyu[16] = -16369633;
        mo$ModuleHitbox.fkyu[17] = 311880669;
        mo$ModuleHitbox.fkyu[18] = -1375875616;
        mo$ModuleHitbox.fkyu[19] = 437298569;
        mo$ModuleHitbox.fkyu[20] = 735470560;
        mo$ModuleHitbox.fkyu[21] = 1578038228;
        mo$ModuleHitbox.fkyu[22] = -2101992468;
        mo$ModuleHitbox.fkyu[23] = 1531044637;
        mo$ModuleHitbox.fkyu[24] = 689110712;
        mo$ModuleHitbox.fkyu[25] = -1395086605;
        mo$ModuleHitbox.fkyu[26] = 1170339302;
        mo$ModuleHitbox.fkyu[27] = -606162393;
        mo$ModuleHitbox.fkyu[28] = -1794212954;
        mo$ModuleHitbox.fkyu[29] = 1652197433;
        mo$ModuleHitbox.fkyu[30] = -1529101705;
        mo$ModuleHitbox.fkyu[31] = 206542328;
        mo$ModuleHitbox.fkyu[32] = -1212032347;
        mo$ModuleHitbox.fkyu[33] = -2117183440;
        mo$ModuleHitbox.fkyu[34] = -582759215;
        mo$ModuleHitbox.fkyu[35] = 1707384071;
        mo$ModuleHitbox.fkyu[36] = 1929671148;
        mo$ModuleHitbox.fkyu[37] = -1214327083;
        mo$ModuleHitbox.fkyu[38] = -1341060253;
        mo$ModuleHitbox.fkyu[39] = 261438200;
        mo$ModuleHitbox.fkyu[40] = -528511755;
        mo$ModuleHitbox.fkyu[41] = 1044949763;
        mo$ModuleHitbox.fkyu[42] = -1638795767;
        mo$ModuleHitbox.fkyu[43] = 561676790;
        mo$ModuleHitbox.fkyu[44] = 1708394453;
        mo$ModuleHitbox.fkyu[45] = -1854447891;
        mo$ModuleHitbox.fkyu[46] = 814458881;
        mo$ModuleHitbox.fkyu[47] = 1928920343;
        mo$ModuleHitbox.fkyu[48] = -1367052557;
        mo$ModuleHitbox.fkyu[49] = 523117015;
        mo$ModuleHitbox.fkyu[50] = -726347583;
        mo$ModuleHitbox.fkyu[51] = 1165736363;
        mo$ModuleHitbox.fkyu[52] = -315086628;
        mo$ModuleHitbox.fkyu[53] = 53394803;
        mo$ModuleHitbox.fkyu[54] = -1406867520;
        mo$ModuleHitbox.fkyu[55] = 1770888838;
        mo$ModuleHitbox.fkyu[56] = 1451748278;
        mo$ModuleHitbox.fkyu[57] = 1408793225;
        mo$ModuleHitbox.fkyu[58] = 1745941;
        mo$ModuleHitbox.fkyu[59] = 92789108;
        mo$ModuleHitbox.fkyu[60] = -1095597817;
        mo$ModuleHitbox.fkyu[61] = 1910294423;
        mo$ModuleHitbox.fkyu[62] = 1594482188;
        mo$ModuleHitbox.fkyu[63] = -792180412;
        mo$ModuleHitbox.fkyu[64] = 253341690;
        mo$ModuleHitbox.fkyu[65] = 1849311308;
        mo$ModuleHitbox.fkyu[66] = 2026086274;
        mo$ModuleHitbox.fkyu[67] = -680734635;
        mo$ModuleHitbox.fkyu[68] = -1402573148;
        mo$ModuleHitbox.fkyu[69] = 175010984;
        mo$ModuleHitbox.fkyu[70] = -1360990251;
        mo$ModuleHitbox.fkyu[71] = 1415640868;
        mo$ModuleHitbox.fkyu[72] = -1467485881;
        mo$ModuleHitbox.fkyu[73] = -2125529971;
        mo$ModuleHitbox.fkyu[74] = 2145689167;
        mo$ModuleHitbox.fkyu[75] = -908315035;
        mo$ModuleHitbox.fkyu[76] = -2103990449;
        mo$ModuleHitbox.fkyu[77] = -961184153;
        mo$ModuleHitbox.fkyu[78] = -1168307831;
        mo$ModuleHitbox.fkyu[79] = 316945475;
    }

    /*
     * Enabled aggressive block sorting
     */
    public float height() {
        Object object = mm;
        block12: while (true) {
            switch ((int)object) {
                case -1713896757: {
                    break block12;
                }
                case -1617722079: {
                    object = mo$ModuleHitbox.fkyw("fldw", fkzc(int ), (int)61) - mo$ModuleHitbox.fkyw("fldv", fkzc(int ), (int)60);
                    continue block12;
                }
            }
            break;
        }
        boolean bl2 = c;
        while (true) {
            long l2;
            Object object2;
            if ((object2 = (l2 = mm - mo$ModuleHitbox.fkyw("fldx", fkzc(int ), (int)62)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object2 == mo$ModuleHitbox.fkyw("fldy", fkyt(int ), (int)64)) break;
            object2 = mo$ModuleHitbox.fkyw("fldz", fkyt(int ), (int)65);
        }
        int n2 = b;
        Object object3 = mm;
        block14: while (true) {
            switch ((int)object3) {
                case -1713896757: {
                    break block14;
                }
                case -1710722501: {
                    object3 = mo$ModuleHitbox.fkyw("fleb", fkzc(int ), (int)64) - mo$ModuleHitbox.fkyw("flea", fkzc(int ), (int)63);
                    continue block14;
                }
            }
            break;
        }
        boolean bl3 = a;
        if (bl2) {
            throw null;
        }
        if (bl3) return (float)mo$ModuleHitbox.fkyw("flec", flcc(int ), (int)66);
        if (bl3) return (float)mo$ModuleHitbox.fkyw("flec", flcc(int ), (int)66);
        Object object4 = mm;
        block15: while (true) {
            switch ((int)object4) {
                case -1713896757: {
                    return this.height;
                }
                case 316685721: {
                    object4 = mo$ModuleHitbox.fkyw("flee", fkzc(int ), (int)66) - mo$ModuleHitbox.fkyw("fled", fkzc(int ), (int)65);
                    continue block15;
                }
            }
            break;
        }
        return this.height;
    }

    private static /* synthetic */ long fkzc(int n2) {
        return fkzd[n2] ^ fkze[n2];
    }

    private static /* synthetic */ void flfc() {
        mo$ModuleHitbox.fkzd[0] = -7252515152777255312L;
        mo$ModuleHitbox.fkzd[1] = -5043588826172125371L;
        mo$ModuleHitbox.fkzd[2] = -8524125604540609133L;
        mo$ModuleHitbox.fkzd[3] = -8647361000469133209L;
        mo$ModuleHitbox.fkzd[4] = -6939457747449253417L;
        mo$ModuleHitbox.fkzd[5] = 7818092820298809656L;
        mo$ModuleHitbox.fkzd[6] = 2521204815268082578L;
        mo$ModuleHitbox.fkzd[7] = 145198178896775289L;
        mo$ModuleHitbox.fkzd[8] = 9222761090048803555L;
        mo$ModuleHitbox.fkzd[9] = -2021407486647932144L;
        mo$ModuleHitbox.fkzd[10] = -5385641317634181437L;
        mo$ModuleHitbox.fkzd[11] = 7479486230059911329L;
        mo$ModuleHitbox.fkzd[12] = 1994449294279568811L;
        mo$ModuleHitbox.fkzd[13] = 7045945489186220566L;
        mo$ModuleHitbox.fkzd[14] = 8205991747886026354L;
        mo$ModuleHitbox.fkzd[15] = -1625002019936142542L;
        mo$ModuleHitbox.fkzd[16] = 8193879752671437688L;
        mo$ModuleHitbox.fkzd[17] = -8287334812353493108L;
        mo$ModuleHitbox.fkzd[18] = -9165699399810722689L;
        mo$ModuleHitbox.fkzd[19] = -5545012805011051160L;
        mo$ModuleHitbox.fkzd[20] = 2504115995580745805L;
        mo$ModuleHitbox.fkzd[21] = -3429407033011605932L;
        mo$ModuleHitbox.fkzd[22] = 8417499057795131179L;
        mo$ModuleHitbox.fkzd[23] = 11423215696472686L;
        mo$ModuleHitbox.fkzd[24] = -3016789209614679339L;
        mo$ModuleHitbox.fkzd[25] = -4780920470197230582L;
        mo$ModuleHitbox.fkzd[26] = 6439242191742293100L;
        mo$ModuleHitbox.fkzd[27] = -3822264454774420509L;
        mo$ModuleHitbox.fkzd[28] = 9190438463543478368L;
        mo$ModuleHitbox.fkzd[29] = 2787330564845341263L;
        mo$ModuleHitbox.fkzd[30] = 2857284036749113419L;
        mo$ModuleHitbox.fkzd[31] = 2657589756890314178L;
        mo$ModuleHitbox.fkzd[32] = -223402757787526531L;
        mo$ModuleHitbox.fkzd[33] = -3257251531060701301L;
        mo$ModuleHitbox.fkzd[34] = 8486983787301573133L;
        mo$ModuleHitbox.fkzd[35] = -8462363251747339262L;
        mo$ModuleHitbox.fkzd[36] = -8806819719417035038L;
        mo$ModuleHitbox.fkzd[37] = 4390752042510464025L;
        mo$ModuleHitbox.fkzd[38] = 8473975036368213864L;
        mo$ModuleHitbox.fkzd[39] = -8646595035071966931L;
        mo$ModuleHitbox.fkzd[40] = 1271080687769810444L;
        mo$ModuleHitbox.fkzd[41] = -8229914315893127830L;
        mo$ModuleHitbox.fkzd[42] = 96248227786772587L;
        mo$ModuleHitbox.fkzd[43] = -526318031234333132L;
        mo$ModuleHitbox.fkzd[44] = -687494796448549816L;
        mo$ModuleHitbox.fkzd[45] = -1311391124159748854L;
        mo$ModuleHitbox.fkzd[46] = 5093884897478900452L;
        mo$ModuleHitbox.fkzd[47] = -7472992466616335182L;
        mo$ModuleHitbox.fkzd[48] = 4506981160403060554L;
        mo$ModuleHitbox.fkzd[49] = 1267881184799310362L;
        mo$ModuleHitbox.fkzd[50] = 1361796178865295075L;
        mo$ModuleHitbox.fkzd[51] = -8564431598318069165L;
        mo$ModuleHitbox.fkzd[52] = -3944086579481949048L;
        mo$ModuleHitbox.fkzd[53] = 8999957521230154594L;
        mo$ModuleHitbox.fkzd[54] = -149174909470596074L;
        mo$ModuleHitbox.fkzd[55] = 7802248951373612301L;
        mo$ModuleHitbox.fkzd[56] = -3312777441390395161L;
        mo$ModuleHitbox.fkzd[57] = 5763874277684617045L;
        mo$ModuleHitbox.fkzd[58] = -6425902338287034701L;
        mo$ModuleHitbox.fkzd[59] = -790017192017821995L;
        mo$ModuleHitbox.fkzd[60] = -1808195210836990850L;
        mo$ModuleHitbox.fkzd[61] = 7377213957321197734L;
        mo$ModuleHitbox.fkzd[62] = 8173162753917925755L;
        mo$ModuleHitbox.fkzd[63] = -3659689159316728750L;
        mo$ModuleHitbox.fkzd[64] = -2040843951208449534L;
        mo$ModuleHitbox.fkzd[65] = 4663588608410474826L;
        mo$ModuleHitbox.fkzd[66] = 7566719197091396550L;
        mo$ModuleHitbox.fkzd[67] = 5236975042346899071L;
        mo$ModuleHitbox.fkzd[68] = -8374327391234170012L;
        mo$ModuleHitbox.fkzd[69] = -7140140045160717773L;
        mo$ModuleHitbox.fkzd[70] = -4246093461216578257L;
        mo$ModuleHitbox.fkzd[71] = 7695806400970901393L;
        mo$ModuleHitbox.fkzd[72] = 404799724569452376L;
        mo$ModuleHitbox.fkzd[73] = 8468430076209591142L;
        mo$ModuleHitbox.fkzd[74] = 1263646873521109988L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public float x() {
        v0 /* !! */  = mo$ModuleHitbox.mm;
        if (true) ** GOTO lbl5
        block12: while (true) {
            v0 /* !! */  = (long)(v1 - mo$ModuleHitbox.fkyw("flbs", fkzc(int ), (int)37));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1713896757: {
                    break block12;
                }
                case 181610827: {
                    v1 = mo$ModuleHitbox.fkyw("flbt", fkzc(int ), (int)38);
                    continue block12;
                }
                case 1847451153: {
                    v1 = mo$ModuleHitbox.fkyw("flbu", fkzc(int ), (int)39);
                    continue block12;
                }
                case 2076217770: {
                    v1 = mo$ModuleHitbox.fkyw("flbv", fkzc(int ), (int)40);
                    continue block12;
                }
            }
            break;
        }
        var3_1 = mo$ModuleHitbox.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = mo$ModuleHitbox.mm - mo$ModuleHitbox.fkyw("flbw", fkzc(int ), (int)41)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == mo$ModuleHitbox.fkyw("flbx", fkyt(int ), (int)33)) break;
            v2 /* !! */  = (long)mo$ModuleHitbox.fkyw("flby", fkyt(int ), (int)34);
        }
        var2_2 /* !! */  = mo$ModuleHitbox.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = mo$ModuleHitbox.mm - mo$ModuleHitbox.fkyw("flbz", fkzc(int ), (int)42)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == mo$ModuleHitbox.fkyw("flca", fkyt(int ), (int)35)) break;
            v3 /* !! */  = (long)mo$ModuleHitbox.fkyw("flcb", fkyt(int ), (int)36);
        }
        var1_3 = mo$ModuleHitbox.a;
        if (var3_1) {
            throw null;
lbl34:
            // 2 sources

            return (float)mo$ModuleHitbox.fkyw("flcd", flcc(int ), (int)37);
        }
        if (var1_3) ** GOTO lbl34
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = mo$ModuleHitbox.mm - mo$ModuleHitbox.fkyw("flce", fkzc(int ), (int)43)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == mo$ModuleHitbox.fkyw("flcf", fkyt(int ), (int)38)) break;
                    v4 /* !! */  = (long)mo$ModuleHitbox.fkyw("flcg", fkyt(int ), (int)39);
                }
                return this.x;
            }
            case 0: {
                var2_2 /* !! */  = (int)mo$ModuleHitbox.fkyw("flch", fkyt(int ), (int)40);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl58
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)mo$ModuleHitbox.fkyw("flci", fkyt(int ), (int)41);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
lbl58:
            // 2 sources

            case 2: {
                do {
                    var2_2 /* !! */  = (int)mo$ModuleHitbox.fkyw("flcj", fkyt(int ), (int)42);
                } while (!var3_1);
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)mo$ModuleHitbox.fkyw("flck", fkyt(int ), (int)43);
        ** while (!var3_1)
lbl66:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ int fkyt(int n2) {
        return fkyu[n2] ^ fkyv[n2];
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public ds module() {
        block32: {
            v0 /* !! */  = mo$ModuleHitbox.mm;
            if (true) ** GOTO lbl5
            block22: while (true) {
                v0 /* !! */  = (long)(v1 - mo$ModuleHitbox.fkyw("flbb", fkzc(int ), (int)26));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -1713896757: {
                        break block22;
                    }
                    case -1002365174: {
                        v1 = mo$ModuleHitbox.fkyw("flbc", fkzc(int ), (int)27);
                        continue block22;
                    }
                    case 1156312053: {
                        v1 = mo$ModuleHitbox.fkyw("flbd", fkzc(int ), (int)28);
                        continue block22;
                    }
                }
                break;
            }
            var3_1 = mo$ModuleHitbox.c;
            while (true) {
                block33: {
                    if ((v2 /* !! */  = (cfr_temp_1 = mo$ModuleHitbox.mm - mo$ModuleHitbox.fkyw("flbe", fkzc(int ), (int)29)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v2 /* !! */  != mo$ModuleHitbox.fkyw("flbf", fkyt(int ), (int)27)) break block33;
                    var2_2 /* !! */  = mo$ModuleHitbox.b;
                    v3 /* !! */  = mo$ModuleHitbox.mm;
                    if (true) ** GOTO lbl27
                }
                v2 /* !! */  = (long)mo$ModuleHitbox.fkyw("flbg", fkyt(int ), (int)28);
            }
            block24: while (true) {
                v3 /* !! */  = (long)(v4 - mo$ModuleHitbox.fkyw("flbh", fkzc(int ), (int)30));
lbl27:
                // 2 sources

                switch ((int)v3 /* !! */ ) {
                    case -1713896757: {
                        break block24;
                    }
                    case -1369064889: {
                        v4 = mo$ModuleHitbox.fkyw("flbi", fkzc(int ), (int)31);
                        continue block24;
                    }
                    case 309242549: {
                        v4 = mo$ModuleHitbox.fkyw("flbj", fkzc(int ), (int)32);
                        continue block24;
                    }
                    case 1619333982: {
                        v4 = mo$ModuleHitbox.fkyw("flbk", fkzc(int ), (int)33);
                        continue block24;
                    }
                }
                break;
            }
            var1_3 = mo$ModuleHitbox.a;
            if (var3_1) {
                throw null;
            }
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            cfr_temp_0 = -2147483648;
            block25: do {
                switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var1_3 != false) return null;
                        if (var1_3 != false) return null;
                        v5 /* !! */  = mo$ModuleHitbox.mm;
                        block26: while (true) {
                            switch ((int)v5 /* !! */ ) {
                                case -2032836139: {
                                    v6 = mo$ModuleHitbox.fkyw("flbm", fkzc(int ), (int)35);
                                    ** GOTO lbl59
                                }
                                case -1713896757: {
                                    return this.module;
                                }
                                case 440742316: {
                                    v6 = mo$ModuleHitbox.fkyw("flbn", fkzc(int ), (int)36);
lbl59:
                                    // 2 sources

                                    v5 /* !! */  = (long)(v6 - mo$ModuleHitbox.fkyw("flbl", fkzc(int ), (int)34));
                                    continue block26;
                                }
                            }
                            break;
                        }
                        return this.module;
                    }
                    case 0: {
                        ** break;
                    }
                    case 2: {
                        var2_2 /* !! */  = (int)mo$ModuleHitbox.fkyw("flbq", fkyt(int ), (int)31);
                        if (var3_1) {
                            throw null;
                        }
                        break block32;
                    }
                    case 3: {
                        break block32;
                    }
lbl71:
                    // 2 sources

                    while (true) {
                        var2_2 /* !! */  = (int)mo$ModuleHitbox.fkyw("flbo", fkyt(int ), (int)29);
                        cfr_temp_0 = 1;
                        if (!var3_1) continue block25;
                        throw null;
                    }
                    case 1: 
                }
                break;
            } while (true);
            var2_2 /* !! */  = (int)mo$ModuleHitbox.fkyw("flbp", fkyt(int ), (int)30);
            if (var3_1) {
                throw null;
            }
        }
        var2_2 /* !! */  = (int)mo$ModuleHitbox.fkyw("flbr", fkyt(int ), (int)32);
        ** while (!var3_1)
lbl85:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void flfd() {
        mo$ModuleHitbox.fkze[0] = -2792551325676464135L;
        mo$ModuleHitbox.fkze[1] = -3418781460502998701L;
        mo$ModuleHitbox.fkze[2] = 5577935019802672516L;
        mo$ModuleHitbox.fkze[3] = 1432589126189272524L;
        mo$ModuleHitbox.fkze[4] = 3235140915922875121L;
        mo$ModuleHitbox.fkze[5] = -1183612174762208341L;
        mo$ModuleHitbox.fkze[6] = 1235676339277283815L;
        mo$ModuleHitbox.fkze[7] = -4240127093225390833L;
        mo$ModuleHitbox.fkze[8] = -7173150617650232267L;
        mo$ModuleHitbox.fkze[9] = 4314922268841787604L;
        mo$ModuleHitbox.fkze[10] = 4601956628376207333L;
        mo$ModuleHitbox.fkze[11] = -5377304442266854874L;
        mo$ModuleHitbox.fkze[12] = -6023139326800456043L;
        mo$ModuleHitbox.fkze[13] = -7129343397903437813L;
        mo$ModuleHitbox.fkze[14] = 1382747071282641799L;
        mo$ModuleHitbox.fkze[15] = -4869282176784304277L;
        mo$ModuleHitbox.fkze[16] = 2706016085121890615L;
        mo$ModuleHitbox.fkze[17] = 1355127811575807623L;
        mo$ModuleHitbox.fkze[18] = 6608864666578989492L;
        mo$ModuleHitbox.fkze[19] = 1522677550330529364L;
        mo$ModuleHitbox.fkze[20] = 2679197539423073806L;
        mo$ModuleHitbox.fkze[21] = -3463817306737546517L;
        mo$ModuleHitbox.fkze[22] = 6511240346563017751L;
        mo$ModuleHitbox.fkze[23] = 4551783281840686098L;
        mo$ModuleHitbox.fkze[24] = 1630088950278699399L;
        mo$ModuleHitbox.fkze[25] = 4464074901676619827L;
        mo$ModuleHitbox.fkze[26] = 2349818282452640286L;
        mo$ModuleHitbox.fkze[27] = 6485496329120079268L;
        mo$ModuleHitbox.fkze[28] = 1256360327819274713L;
        mo$ModuleHitbox.fkze[29] = 599737741701086017L;
        mo$ModuleHitbox.fkze[30] = -3348797853257606998L;
        mo$ModuleHitbox.fkze[31] = 7840391808373814004L;
        mo$ModuleHitbox.fkze[32] = -6581244691608798609L;
        mo$ModuleHitbox.fkze[33] = 7827228857324585324L;
        mo$ModuleHitbox.fkze[34] = -360790235768496933L;
        mo$ModuleHitbox.fkze[35] = 4091327588486811022L;
        mo$ModuleHitbox.fkze[36] = -8046374650175967675L;
        mo$ModuleHitbox.fkze[37] = -9030619558633283877L;
        mo$ModuleHitbox.fkze[38] = -1761947042654274454L;
        mo$ModuleHitbox.fkze[39] = -8366079073831402473L;
        mo$ModuleHitbox.fkze[40] = 709598907921893001L;
        mo$ModuleHitbox.fkze[41] = -1491980620335677369L;
        mo$ModuleHitbox.fkze[42] = -4049352217898547254L;
        mo$ModuleHitbox.fkze[43] = 423780303922283930L;
        mo$ModuleHitbox.fkze[44] = -6222042658440930353L;
        mo$ModuleHitbox.fkze[45] = -3340725942261368045L;
        mo$ModuleHitbox.fkze[46] = 7786558349475094830L;
        mo$ModuleHitbox.fkze[47] = 8142163959991443969L;
        mo$ModuleHitbox.fkze[48] = -1511322550744429250L;
        mo$ModuleHitbox.fkze[49] = 6566562833069930448L;
        mo$ModuleHitbox.fkze[50] = 5340886412934028452L;
        mo$ModuleHitbox.fkze[51] = -4299421165629534933L;
        mo$ModuleHitbox.fkze[52] = -3553764307924122694L;
        mo$ModuleHitbox.fkze[53] = 222387382852809728L;
        mo$ModuleHitbox.fkze[54] = -2926840508647392706L;
        mo$ModuleHitbox.fkze[55] = -3260956523193362441L;
        mo$ModuleHitbox.fkze[56] = 1429640747255079576L;
        mo$ModuleHitbox.fkze[57] = 5762772829169064514L;
        mo$ModuleHitbox.fkze[58] = -8745342333949372282L;
        mo$ModuleHitbox.fkze[59] = -6514494442960051406L;
        mo$ModuleHitbox.fkze[60] = -8172258947112404192L;
        mo$ModuleHitbox.fkze[61] = -4650270184022133174L;
        mo$ModuleHitbox.fkze[62] = -4412940186816641135L;
        mo$ModuleHitbox.fkze[63] = -3331330233994749210L;
        mo$ModuleHitbox.fkze[64] = -301884811633840897L;
        mo$ModuleHitbox.fkze[65] = 150849099939198996L;
        mo$ModuleHitbox.fkze[66] = -5058675272370655141L;
        mo$ModuleHitbox.fkze[67] = -1057328904377272081L;
        mo$ModuleHitbox.fkze[68] = -1650702177013649355L;
        mo$ModuleHitbox.fkze[69] = -19043623619390343L;
        mo$ModuleHitbox.fkze[70] = -3619449304565663668L;
        mo$ModuleHitbox.fkze[71] = -4711291482093522161L;
        mo$ModuleHitbox.fkze[72] = 1857921704801424593L;
        mo$ModuleHitbox.fkze[73] = 4348615150414659751L;
        mo$ModuleHitbox.fkze[74] = -1877890634107117558L;
    }

    private static /* synthetic */ void flfb() {
        mo$ModuleHitbox.fkyv[0] = -395181961;
        mo$ModuleHitbox.fkyv[1] = -2086082073;
        mo$ModuleHitbox.fkyv[2] = 510752847;
        mo$ModuleHitbox.fkyv[3] = -1138813677;
        mo$ModuleHitbox.fkyv[4] = -17594868;
        mo$ModuleHitbox.fkyv[5] = -1353750099;
        mo$ModuleHitbox.fkyv[6] = -1295600621;
        mo$ModuleHitbox.fkyv[7] = 114113672;
        mo$ModuleHitbox.fkyv[8] = 104780932;
        mo$ModuleHitbox.fkyv[9] = -1756433198;
        mo$ModuleHitbox.fkyv[10] = 1062193823;
        mo$ModuleHitbox.fkyv[11] = -1883450315;
        mo$ModuleHitbox.fkyv[12] = -1053225584;
        mo$ModuleHitbox.fkyv[13] = -1174597732;
        mo$ModuleHitbox.fkyv[14] = 288124534;
        mo$ModuleHitbox.fkyv[15] = -565251444;
        mo$ModuleHitbox.fkyv[16] = -16369634;
        mo$ModuleHitbox.fkyv[17] = 311880670;
        mo$ModuleHitbox.fkyv[18] = -1375875615;
        mo$ModuleHitbox.fkyv[19] = 1442702713;
        mo$ModuleHitbox.fkyv[20] = 735470561;
        mo$ModuleHitbox.fkyv[21] = 1578038229;
        mo$ModuleHitbox.fkyv[22] = -757489425;
        mo$ModuleHitbox.fkyv[23] = 1531044637;
        mo$ModuleHitbox.fkyv[24] = 689110712;
        mo$ModuleHitbox.fkyv[25] = -1395086608;
        mo$ModuleHitbox.fkyv[26] = 1170339303;
        mo$ModuleHitbox.fkyv[27] = -606162394;
        mo$ModuleHitbox.fkyv[28] = 278610686;
        mo$ModuleHitbox.fkyv[29] = 1652197433;
        mo$ModuleHitbox.fkyv[30] = -1529101708;
        mo$ModuleHitbox.fkyv[31] = 206542328;
        mo$ModuleHitbox.fkyv[32] = -1212032347;
        mo$ModuleHitbox.fkyv[33] = 2117183439;
        mo$ModuleHitbox.fkyv[34] = 1177271257;
        mo$ModuleHitbox.fkyv[35] = 1707384070;
        mo$ModuleHitbox.fkyv[36] = 1016350621;
        mo$ModuleHitbox.fkyv[37] = -1996946626;
        mo$ModuleHitbox.fkyv[38] = -1341060254;
        mo$ModuleHitbox.fkyv[39] = -758040320;
        mo$ModuleHitbox.fkyv[40] = -528511755;
        mo$ModuleHitbox.fkyv[41] = 1044949761;
        mo$ModuleHitbox.fkyv[42] = -1638795765;
        mo$ModuleHitbox.fkyv[43] = 561676790;
        mo$ModuleHitbox.fkyv[44] = -1708394454;
        mo$ModuleHitbox.fkyv[45] = -1164751493;
        mo$ModuleHitbox.fkyv[46] = -814458882;
        mo$ModuleHitbox.fkyv[47] = 641573095;
        mo$ModuleHitbox.fkyv[48] = -1846996322;
        mo$ModuleHitbox.fkyv[49] = 523117014;
        mo$ModuleHitbox.fkyv[50] = -726347581;
        mo$ModuleHitbox.fkyv[51] = 1165736362;
        mo$ModuleHitbox.fkyv[52] = -315086626;
        mo$ModuleHitbox.fkyv[53] = 53394802;
        mo$ModuleHitbox.fkyv[54] = -1682673084;
        mo$ModuleHitbox.fkyv[55] = 1770888839;
        mo$ModuleHitbox.fkyv[56] = 137479136;
        mo$ModuleHitbox.fkyv[57] = 1825749007;
        mo$ModuleHitbox.fkyv[58] = -1745942;
        mo$ModuleHitbox.fkyv[59] = -878492430;
        mo$ModuleHitbox.fkyv[60] = -1095597820;
        mo$ModuleHitbox.fkyv[61] = 1910294423;
        mo$ModuleHitbox.fkyv[62] = 1594482189;
        mo$ModuleHitbox.fkyv[63] = -792180409;
        mo$ModuleHitbox.fkyv[64] = 253341691;
        mo$ModuleHitbox.fkyv[65] = -1283029387;
        mo$ModuleHitbox.fkyv[66] = 1203488513;
        mo$ModuleHitbox.fkyv[67] = -680734636;
        mo$ModuleHitbox.fkyv[68] = -1402573146;
        mo$ModuleHitbox.fkyv[69] = 175010987;
        mo$ModuleHitbox.fkyv[70] = -1360990250;
        mo$ModuleHitbox.fkyv[71] = 1415640869;
        mo$ModuleHitbox.fkyv[72] = -169417500;
        mo$ModuleHitbox.fkyv[73] = 2125529970;
        mo$ModuleHitbox.fkyv[74] = -73457758;
        mo$ModuleHitbox.fkyv[75] = -144062857;
        mo$ModuleHitbox.fkyv[76] = -2103990449;
        mo$ModuleHitbox.fkyv[77] = -961184156;
        mo$ModuleHitbox.fkyv[78] = -1168307830;
        mo$ModuleHitbox.fkyv[79] = 316945472;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public float headerBottom() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_1 = mo$ModuleHitbox.mm - mo$ModuleHitbox.fkyw("flej", fkzc(int ), (int)67)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == mo$ModuleHitbox.fkyw("flek", fkyt(int ), (int)71)) break;
            v0 /* !! */  = (long)mo$ModuleHitbox.fkyw("flel", fkyt(int ), (int)72);
        }
        var3_1 = mo$ModuleHitbox.c;
        while (true) {
            block27: {
                if ((v1 /* !! */  = (cfr_temp_2 = mo$ModuleHitbox.mm - mo$ModuleHitbox.fkyw("flem", fkzc(int ), (int)68)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v1 /* !! */  != mo$ModuleHitbox.fkyw("flen", fkyt(int ), (int)73)) break block27;
                var2_2 /* !! */  = mo$ModuleHitbox.b;
                if (var2_2 /* !! */  != 0) {
                    break;
                }
                ** GOTO lbl-1000
            }
            v1 /* !! */  = (long)mo$ModuleHitbox.fkyw("fleo", fkyt(int ), (int)74);
        }
        cfr_temp_0 = -2147483648;
        while (true) {
            switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                default: lbl-1000:
                // 2 sources

                {
                    v2 /* !! */  = mo$ModuleHitbox.mm;
                    block19: while (true) {
                        switch ((int)v2 /* !! */ ) {
                            case -1713896757: {
                                break block19;
                            }
                            case -620856594: {
                                v3 = mo$ModuleHitbox.fkyw("fleq", fkzc(int ), (int)70);
                                ** GOTO lbl31
                            }
                            case 1660688084: {
                                v3 = mo$ModuleHitbox.fkyw("fler", fkzc(int ), (int)71);
lbl31:
                                // 2 sources

                                v2 /* !! */  = (long)(v3 - mo$ModuleHitbox.fkyw("flep", fkzc(int ), (int)69));
                                continue block19;
                            }
                        }
                        break;
                    }
                    var1_3 = mo$ModuleHitbox.a;
                    if (var3_1) {
                        throw null;
                    }
                    if (var1_3 != false) return (float)mo$ModuleHitbox.fkyw("fles", flcc(int ), (int)75);
                    if (var1_3 != false) return (float)mo$ModuleHitbox.fkyw("fles", flcc(int ), (int)75);
                    v4 /* !! */  = mo$ModuleHitbox.mm;
                    block20: while (true) {
                        switch ((int)v4 /* !! */ ) {
                            case -1713896757: {
                                return this.headerBottom;
                            }
                            case -696451955: {
                                v5 = mo$ModuleHitbox.fkyw("fleu", fkzc(int ), (int)73);
                                ** GOTO lbl48
                            }
                            case 1509221821: {
                                v5 = mo$ModuleHitbox.fkyw("flev", fkzc(int ), (int)74);
lbl48:
                                // 2 sources

                                v4 /* !! */  = (long)(v5 - mo$ModuleHitbox.fkyw("flet", fkzc(int ), (int)72));
                                continue block20;
                            }
                        }
                        break;
                    }
                    return this.headerBottom;
                }
                case 0: {
                    ** GOTO lbl57
                }
                case 3: {
                    var2_2 /* !! */  = (int)mo$ModuleHitbox.fkyw("flez", fkyt(int ), (int)79);
                    if (var3_1) {
                        throw null;
                    }
lbl57:
                    // 3 sources

                    var2_2 /* !! */  = (int)mo$ModuleHitbox.fkyw("flew", fkyt(int ), (int)76);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 1: {
                    var2_2 /* !! */  = (int)mo$ModuleHitbox.fkyw("flex", fkyt(int ), (int)77);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 2: 
            }
            if (true) ** GOTO lbl68
            break;
        }
        do {
            if (true) ** continue;
lbl68:
            // 2 sources

            var2_2 /* !! */  = (int)mo$ModuleHitbox.fkyw("fley", fkyt(int ), (int)78);
            cfr_temp_0 = 1;
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ float flcc(int n2) {
        return Float.intBitsToFloat(fkyu[n2] ^ fkyv[n2]);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final boolean equals(Object object) {
        while (true) {
            long l2;
            Object object2;
            if ((object2 = (l2 = mm - mo$ModuleHitbox.fkyw("flam", fkzc(int ), (int)20)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object2 == mo$ModuleHitbox.fkyw("flan", fkyt(int ), (int)18)) break;
            object2 = mo$ModuleHitbox.fkyw("flao", fkyt(int ), (int)19);
        }
        boolean bl2 = c;
        Object object3 = mm;
        block9: while (true) {
            switch ((int)object3) {
                case -1713896757: {
                    break block9;
                }
                case -907636177: {
                    object3 = mo$ModuleHitbox.fkyw("flaq", fkzc(int ), (int)22) - mo$ModuleHitbox.fkyw("flap", fkzc(int ), (int)21);
                    continue block9;
                }
            }
            break;
        }
        int n2 = b;
        Object object4 = mm;
        block10: while (true) {
            switch ((int)object4) {
                case -1713896757: {
                    break block10;
                }
                case -1558357593: {
                    object4 = mo$ModuleHitbox.fkyw("flas", fkzc(int ), (int)24) - mo$ModuleHitbox.fkyw("flar", fkzc(int ), (int)23);
                    continue block10;
                }
            }
            break;
        }
        boolean bl3 = a;
        if (bl2) {
            throw null;
        }
        if (bl3) return (boolean)mo$ModuleHitbox.fkyw("flat", fkyt(int ), (int)20);
        if (bl3) return (boolean)mo$ModuleHitbox.fkyw("flat", fkyt(int ), (int)20);
        while (true) {
            long l3;
            Object object5;
            if ((object5 = (l3 = mm - mo$ModuleHitbox.fkyw("flau", fkzc(int ), (int)25)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object5 == mo$ModuleHitbox.fkyw("flav", fkyt(int ), (int)21)) {
                return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{mo$ModuleHitbox.class, "module;x;y;width;height;headerBottom", "module", "x", "y", "width", "height", "headerBottom"}, this, object);
            }
            object5 = mo$ModuleHitbox.fkyw("flaw", fkyt(int ), (int)22);
        }
    }
}

