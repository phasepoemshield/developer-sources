/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_1799
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.minecraft.class_1297;
import net.minecraft.class_1799;

final class jj$Trajectory {
    private double sourceY;
    private double sourceX;
    private static long[] bdop;
    private int steps;
    private static long[] bdoq;
    private final double[] x;
    private double sourceVy;
    private class_1799 stack;
    public static final int b;
    public static final boolean c;
    private double sourceVz;
    private static int[] bdof;
    private final double[] z;
    private int pointCount;
    public static final boolean a;
    private final double[] y;
    private double sourceZ;
    static final long cy = -5457152458481768116L;
    private double sourceVx;
    private static int[] bdog;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private jj$Trajectory() {
        var2_1 /* !! */  = jj$Trajectory.b;
        super();
        this.x = new double[302];
        this.y = new double[302];
        this.z = new double[302];
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.stack = class_1799.field_8037;
                return;
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)jj$Trajectory.bdoh("bdoi", bdoe(int ), (int)0);
                    ** GOTO lbl24
                    break;
                }
            }
lbl15:
            // 2 sources

            case 1: {
                while (true) {
                    var2_1 /* !! */  = (int)jj$Trajectory.bdoh("bdoj", bdoe(int ), (int)1);
                }
            }
            case 2: {
                var2_1 /* !! */  = (int)jj$Trajectory.bdoh("bdok", bdoe(int ), (int)2);
                ** GOTO lbl15
            }
            case 3: {
                var2_1 /* !! */  = (int)jj$Trajectory.bdoh("bdol", bdoe(int ), (int)3);
            }
lbl24:
            // 3 sources

            case 4: {
                var2_1 /* !! */  = (int)jj$Trajectory.bdoh("bdom", bdoe(int ), (int)4);
            }
            case 5: 
        }
        var2_1 /* !! */  = (int)jj$Trajectory.bdoh("bdon", bdoe(int ), (int)5);
        ** while (true)
    }

    public static /* synthetic */ CallSite bdoh(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    static {
        bdof = new int[82];
        bdog = new int[82];
        jj$Trajectory.benb();
        jj$Trajectory.benc();
        bdop = new long[88];
        bdoq = new long[88];
        jj$Trajectory.bend();
        jj$Trajectory.bene();
    }

    private static /* synthetic */ void benb() {
        jj$Trajectory.bdof[0] = 1457043014;
        jj$Trajectory.bdof[1] = -1734199574;
        jj$Trajectory.bdof[2] = -52734349;
        jj$Trajectory.bdof[3] = 1931326447;
        jj$Trajectory.bdof[4] = 1062987800;
        jj$Trajectory.bdof[5] = -1316476618;
        jj$Trajectory.bdof[6] = -851987392;
        jj$Trajectory.bdof[7] = 939594366;
        jj$Trajectory.bdof[8] = -573289285;
        jj$Trajectory.bdof[9] = -1212507586;
        jj$Trajectory.bdof[10] = 1942680143;
        jj$Trajectory.bdof[11] = -1747612922;
        jj$Trajectory.bdof[12] = 483889967;
        jj$Trajectory.bdof[13] = 1200185418;
        jj$Trajectory.bdof[14] = -302923014;
        jj$Trajectory.bdof[15] = -693440450;
        jj$Trajectory.bdof[16] = -2140665167;
        jj$Trajectory.bdof[17] = -1036200591;
        jj$Trajectory.bdof[18] = 1972784010;
        jj$Trajectory.bdof[19] = 320770363;
        jj$Trajectory.bdof[20] = -1066333642;
        jj$Trajectory.bdof[21] = -237462264;
        jj$Trajectory.bdof[22] = -626057046;
        jj$Trajectory.bdof[23] = 337082663;
        jj$Trajectory.bdof[24] = 1686119954;
        jj$Trajectory.bdof[25] = 1378163834;
        jj$Trajectory.bdof[26] = 1635544943;
        jj$Trajectory.bdof[27] = -1915593292;
        jj$Trajectory.bdof[28] = -1460840409;
        jj$Trajectory.bdof[29] = -1540978829;
        jj$Trajectory.bdof[30] = -1737892581;
        jj$Trajectory.bdof[31] = -1902270150;
        jj$Trajectory.bdof[32] = -1798011740;
        jj$Trajectory.bdof[33] = 1724077958;
        jj$Trajectory.bdof[34] = -1399599056;
        jj$Trajectory.bdof[35] = 1818850851;
        jj$Trajectory.bdof[36] = 905647379;
        jj$Trajectory.bdof[37] = 678983532;
        jj$Trajectory.bdof[38] = -95443157;
        jj$Trajectory.bdof[39] = -209275025;
        jj$Trajectory.bdof[40] = -875941751;
        jj$Trajectory.bdof[41] = -1912582710;
        jj$Trajectory.bdof[42] = 254570404;
        jj$Trajectory.bdof[43] = -769443114;
        jj$Trajectory.bdof[44] = -661063468;
        jj$Trajectory.bdof[45] = -1519115407;
        jj$Trajectory.bdof[46] = 1626759343;
        jj$Trajectory.bdof[47] = 388451170;
        jj$Trajectory.bdof[48] = -1567698644;
        jj$Trajectory.bdof[49] = 350652926;
        jj$Trajectory.bdof[50] = 610395158;
        jj$Trajectory.bdof[51] = 497457518;
        jj$Trajectory.bdof[52] = -410826453;
        jj$Trajectory.bdof[53] = -997096548;
        jj$Trajectory.bdof[54] = 1318086691;
        jj$Trajectory.bdof[55] = -545420229;
        jj$Trajectory.bdof[56] = 1486530193;
        jj$Trajectory.bdof[57] = 706198230;
        jj$Trajectory.bdof[58] = -951591217;
        jj$Trajectory.bdof[59] = 715493206;
        jj$Trajectory.bdof[60] = 2081256874;
        jj$Trajectory.bdof[61] = -1145107172;
        jj$Trajectory.bdof[62] = -818711018;
        jj$Trajectory.bdof[63] = 28368999;
        jj$Trajectory.bdof[64] = 1454577671;
        jj$Trajectory.bdof[65] = 970013059;
        jj$Trajectory.bdof[66] = 1264684791;
        jj$Trajectory.bdof[67] = 63578374;
        jj$Trajectory.bdof[68] = -1618571951;
        jj$Trajectory.bdof[69] = 1414290109;
        jj$Trajectory.bdof[70] = 1134020751;
        jj$Trajectory.bdof[71] = -495598307;
        jj$Trajectory.bdof[72] = -1185825282;
        jj$Trajectory.bdof[73] = -1015415180;
        jj$Trajectory.bdof[74] = -42973543;
        jj$Trajectory.bdof[75] = 1257206703;
        jj$Trajectory.bdof[76] = -2007081250;
        jj$Trajectory.bdof[77] = 1686483717;
        jj$Trajectory.bdof[78] = -2101476455;
        jj$Trajectory.bdof[79] = -545549159;
        jj$Trajectory.bdof[80] = -1245850358;
        jj$Trajectory.bdof[81] = -1007760883;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void captureSource(class_1297 var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = jj$Trajectory.cy - jj$Trajectory.bdoh("bdsf", bdoo(int ), (int)50)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == jj$Trajectory.bdoh("bdsg", bdoe(int ), (int)48)) break;
            v0 /* !! */  = (long)jj$Trajectory.bdoh("bdsh", bdoe(int ), (int)49);
        }
        var6_2 = jj$Trajectory.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = jj$Trajectory.cy - jj$Trajectory.bdoh("bdsi", bdoo(int ), (int)51)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == jj$Trajectory.bdoh("bdsj", bdoe(int ), (int)50)) break;
            v1 /* !! */  = (long)jj$Trajectory.bdoh("bdsk", bdoe(int ), (int)51);
        }
        var5_3 /* !! */  = jj$Trajectory.b;
        v2 /* !! */  = jj$Trajectory.cy;
        if (true) ** GOTO lbl17
        block75: while (true) {
            v2 /* !! */  = (long)(v3 - jj$Trajectory.bdoh("bdsl", bdoo(int ), (int)52));
lbl17:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1827968692: {
                    break block75;
                }
                case -1710093827: {
                    v3 = jj$Trajectory.bdoh("bdsm", bdoo(int ), (int)53);
                    continue block75;
                }
                case 62572135: {
                    v3 = jj$Trajectory.bdoh("bdsn", bdoo(int ), (int)54);
                    continue block75;
                }
            }
            break;
        }
        var4_4 = jj$Trajectory.a;
        if (var6_2) {
            throw null;
lbl29:
            // 10 sources

            return;
        }
        if (var4_4 || var4_4) ** GOTO lbl29
        v4 /* !! */  = jj$Trajectory.cy;
        if (true) ** GOTO lbl36
        block77: while (true) {
            v4 /* !! */  = (long)(v5 - jj$Trajectory.bdoh("bdso", bdoo(int ), (int)55));
lbl36:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1827968692: {
                    break block77;
                }
                case -663898193: {
                    v5 = jj$Trajectory.bdoh("bdsp", bdoo(int ), (int)56);
                    continue block77;
                }
                case 1624416138: {
                    v5 = jj$Trajectory.bdoh("bdsq", bdoo(int ), (int)57);
                    continue block77;
                }
            }
            break;
        }
        var2_5 = var1_1.method_73189();
        if (var4_4 || var4_4) ** GOTO lbl29
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_2 = jj$Trajectory.cy - jj$Trajectory.bdoh("bdsr", bdoo(int ), (int)58)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v6 /* !! */  == jj$Trajectory.bdoh("bdss", bdoe(int ), (int)52)) break;
            v6 /* !! */  = (long)jj$Trajectory.bdoh("bdst", bdoe(int ), (int)53);
        }
        var3_6 = var1_1.method_18798();
        if (var4_4 || var4_4) ** GOTO lbl29
        v7 /* !! */  = jj$Trajectory.cy;
        if (true) ** GOTO lbl58
        block79: while (true) {
            v7 /* !! */  = (long)(v8 - jj$Trajectory.bdoh("bdsu", bdoo(int ), (int)59));
lbl58:
            // 2 sources

            switch ((int)v7 /* !! */ ) {
                case -1827968692: {
                    break block79;
                }
                case -654004397: {
                    v8 = jj$Trajectory.bdoh("bdsv", bdoo(int ), (int)60);
                    continue block79;
                }
                case 1381186096: {
                    v8 = jj$Trajectory.bdoh("bdsw", bdoo(int ), (int)61);
                    continue block79;
                }
                case 1897564741: {
                    v8 = jj$Trajectory.bdoh("bdsx", bdoo(int ), (int)62);
                    continue block79;
                }
            }
            break;
        }
        v9 = var2_5.field_1352;
        v10 /* !! */  = jj$Trajectory.cy;
        if (true) ** GOTO lbl75
        block80: while (true) {
            v10 /* !! */  = (long)(v11 - jj$Trajectory.bdoh("bdsy", bdoo(int ), (int)63));
lbl75:
            // 2 sources

            switch ((int)v10 /* !! */ ) {
                case -1827968692: {
                    break block80;
                }
                case -200393911: {
                    v11 = jj$Trajectory.bdoh("bdsz", bdoo(int ), (int)64);
                    continue block80;
                }
                case 151225044: {
                    v11 = jj$Trajectory.bdoh("bdta", bdoo(int ), (int)65);
                    continue block80;
                }
            }
            break;
        }
        this.sourceX = v9;
        if (var4_4 || var4_4) ** GOTO lbl29
        v12 /* !! */  = jj$Trajectory.cy;
        if (true) ** GOTO lbl90
        block81: while (true) {
            v12 /* !! */  = (long)(v13 - jj$Trajectory.bdoh("bdtb", bdoo(int ), (int)66));
lbl90:
            // 2 sources

            switch ((int)v12 /* !! */ ) {
                case -1827968692: {
                    break block81;
                }
                case -901627049: {
                    v13 = jj$Trajectory.bdoh("bdtc", bdoo(int ), (int)67);
                    continue block81;
                }
                case 184501502: {
                    v13 = jj$Trajectory.bdoh("bdtd", bdoo(int ), (int)68);
                    continue block81;
                }
            }
            break;
        }
        v14 = var2_5.field_1351;
        v15 /* !! */  = jj$Trajectory.cy;
        if (true) ** GOTO lbl104
        block82: while (true) {
            v15 /* !! */  = (long)(v16 - jj$Trajectory.bdoh("bdte", bdoo(int ), (int)69));
lbl104:
            // 2 sources

            switch ((int)v15 /* !! */ ) {
                case -1827968692: {
                    break block82;
                }
                case -1122121304: {
                    v16 = jj$Trajectory.bdoh("bdtf", bdoo(int ), (int)70);
                    continue block82;
                }
                case 1855855413: {
                    v16 = jj$Trajectory.bdoh("bdtg", bdoo(int ), (int)71);
                    continue block82;
                }
            }
            break;
        }
        this.sourceY = v14;
        if (var4_4 || var4_4) ** GOTO lbl29
        v17 /* !! */  = jj$Trajectory.cy;
        if (true) ** GOTO lbl119
        block83: while (true) {
            v17 /* !! */  = (long)(v18 - jj$Trajectory.bdoh("bdth", bdoo(int ), (int)72));
lbl119:
            // 2 sources

            switch ((int)v17 /* !! */ ) {
                case -1827968692: {
                    break block83;
                }
                case 169107211: {
                    v18 = jj$Trajectory.bdoh("bdti", bdoo(int ), (int)73);
                    continue block83;
                }
                case 223311993: {
                    v18 = jj$Trajectory.bdoh("bdtj", bdoo(int ), (int)74);
                    continue block83;
                }
                case 1449210465: {
                    v18 = jj$Trajectory.bdoh("bdtk", bdoo(int ), (int)75);
                    continue block83;
                }
            }
            break;
        }
        v19 = var2_5.field_1350;
        v20 /* !! */  = jj$Trajectory.cy;
        if (true) ** GOTO lbl136
        block84: while (true) {
            v20 /* !! */  = (long)(jj$Trajectory.bdoh("bdtm", bdoo(int ), (int)77) - jj$Trajectory.bdoh("bdtl", bdoo(int ), (int)76));
lbl136:
            // 2 sources

            switch ((int)v20 /* !! */ ) {
                case -1827968692: {
                    break block84;
                }
                case 717463895: {
                    continue block84;
                }
            }
            break;
        }
        this.sourceZ = v19;
        if (var4_4 || var4_4) ** GOTO lbl29
        while (true) {
            if ((v21 /* !! */  = (cfr_temp_3 = jj$Trajectory.cy - jj$Trajectory.bdoh("bdtn", bdoo(int ), (int)78)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v21 /* !! */  == jj$Trajectory.bdoh("bdto", bdoe(int ), (int)54)) break;
            v21 /* !! */  = (long)jj$Trajectory.bdoh("bdtp", bdoe(int ), (int)55);
        }
        v22 = var3_6.field_1352;
        while (true) {
            if ((v23 /* !! */  = (cfr_temp_4 = jj$Trajectory.cy - jj$Trajectory.bdoh("bdtq", bdoo(int ), (int)79)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v23 /* !! */  == jj$Trajectory.bdoh("belt", bdoe(int ), (int)56)) break;
            v23 /* !! */  = (long)jj$Trajectory.bdoh("belu", bdoe(int ), (int)57);
        }
        this.sourceVx = v22;
        if (var4_4 || var4_4) ** GOTO lbl29
        v24 /* !! */  = jj$Trajectory.cy;
        if (true) ** GOTO lbl160
        block87: while (true) {
            v24 /* !! */  = (long)(v25 - jj$Trajectory.bdoh("belv", bdoo(int ), (int)80));
lbl160:
            // 2 sources

            switch ((int)v24 /* !! */ ) {
                case -1827968692: {
                    break block87;
                }
                case -939857268: {
                    v25 = jj$Trajectory.bdoh("belw", bdoo(int ), (int)81);
                    continue block87;
                }
                case -646679760: {
                    v25 = jj$Trajectory.bdoh("belx", bdoo(int ), (int)82);
                    continue block87;
                }
                case 974984358: {
                    v25 = jj$Trajectory.bdoh("bely", bdoo(int ), (int)83);
                    continue block87;
                }
            }
            break;
        }
        v26 = var3_6.field_1351;
        while (true) {
            if ((v27 /* !! */  = (cfr_temp_5 = jj$Trajectory.cy - jj$Trajectory.bdoh("belz", bdoo(int ), (int)84)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v27 /* !! */  == jj$Trajectory.bdoh("bema", bdoe(int ), (int)58)) break;
            v27 /* !! */  = (long)jj$Trajectory.bdoh("bemb", bdoe(int ), (int)59);
        }
        this.sourceVy = v26;
        if (var4_4) ** GOTO lbl29
        if (var5_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_4) ** GOTO lbl29
                while (true) {
                    if ((v28 /* !! */  = (cfr_temp_6 = jj$Trajectory.cy - jj$Trajectory.bdoh("bemc", bdoo(int ), (int)85)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v28 /* !! */  == jj$Trajectory.bdoh("bemd", bdoe(int ), (int)60)) break;
                    v28 /* !! */  = (long)jj$Trajectory.bdoh("beme", bdoe(int ), (int)61);
                }
                v29 = var3_6.field_1350;
                v30 /* !! */  = jj$Trajectory.cy;
                if (true) ** GOTO lbl194
                block90: while (true) {
                    v30 /* !! */  = (long)(jj$Trajectory.bdoh("bemg", bdoo(int ), (int)87) - jj$Trajectory.bdoh("bemf", bdoo(int ), (int)86));
lbl194:
                    // 2 sources

                    switch ((int)v30 /* !! */ ) {
                        case -1827968692: {
                            break block90;
                        }
                        case 1121733186: {
                            continue block90;
                        }
                    }
                    break;
                }
                this.sourceVz = v29;
                if (!var4_4 && !var4_4) ** break;
                ** continue;
                return;
            }
lbl203:
            // 3 sources

            case 0: {
                var5_3 /* !! */  = (int)jj$Trajectory.bdoh("bemh", bdoe(int ), (int)62);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl267
            }
lbl208:
            // 2 sources

            case 1: {
                var5_3 /* !! */  = (int)jj$Trajectory.bdoh("bemi", bdoe(int ), (int)63);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl259
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var5_3 /* !! */  = (int)jj$Trajectory.bdoh("bemj", bdoe(int ), (int)64);
                    if (!var6_2) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 3: {
                var5_3 /* !! */  = (int)jj$Trajectory.bdoh("bemk", bdoe(int ), (int)65);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl283
            }
lbl223:
            // 2 sources

            case 4: {
                do {
                    var5_3 /* !! */  = (int)jj$Trajectory.bdoh("beml", bdoe(int ), (int)66);
                } while (!var6_2);
                throw null;
            }
lbl228:
            // 2 sources

            case 5: {
                var5_3 /* !! */  = (int)jj$Trajectory.bdoh("bemm", bdoe(int ), (int)67);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl250
            }
            case 6: {
                var5_3 /* !! */  = (int)jj$Trajectory.bdoh("bemn", bdoe(int ), (int)68);
                if (!var6_2) ** GOTO lbl223
                throw null;
            }
lbl237:
            // 2 sources

            case 7: {
                var5_3 /* !! */  = (int)jj$Trajectory.bdoh("bemo", bdoe(int ), (int)69);
                if (!var6_2) break;
                throw null;
            }
            case 8: {
                var5_3 /* !! */  = (int)jj$Trajectory.bdoh("bemp", bdoe(int ), (int)70);
                if (!var6_2) ** GOTO lbl208
                throw null;
            }
            case 9: {
                var5_3 /* !! */  = (int)jj$Trajectory.bdoh("bemq", bdoe(int ), (int)71);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl255
            }
lbl250:
            // 2 sources

            case 10: {
                do {
                    var5_3 /* !! */  = (int)jj$Trajectory.bdoh("bemr", bdoe(int ), (int)72);
                } while (!var6_2);
                throw null;
            }
lbl255:
            // 3 sources

            case 11: {
                var5_3 /* !! */  = (int)jj$Trajectory.bdoh("bems", bdoe(int ), (int)73);
                if (!var6_2) ** GOTO lbl228
                throw null;
            }
lbl259:
            // 2 sources

            case 12: {
                var5_3 /* !! */  = (int)jj$Trajectory.bdoh("bemt", bdoe(int ), (int)74);
                if (!var6_2) ** GOTO lbl237
                throw null;
            }
lbl263:
            // 2 sources

            case 13: {
                var5_3 /* !! */  = (int)jj$Trajectory.bdoh("bemu", bdoe(int ), (int)75);
                if (!var6_2) ** GOTO lbl203
                throw null;
            }
lbl267:
            // 2 sources

            case 14: {
                var5_3 /* !! */  = (int)jj$Trajectory.bdoh("bemv", bdoe(int ), (int)76);
                if (!var6_2) ** GOTO lbl203
                throw null;
            }
            case 15: {
                var5_3 /* !! */  = (int)jj$Trajectory.bdoh("bemw", bdoe(int ), (int)77);
                if (!var6_2) break;
                throw null;
            }
            case 16: {
                var5_3 /* !! */  = (int)jj$Trajectory.bdoh("bemx", bdoe(int ), (int)78);
                if (!var6_2) ** GOTO lbl255
                throw null;
            }
            case 17: {
                var5_3 /* !! */  = (int)jj$Trajectory.bdoh("bemy", bdoe(int ), (int)79);
                if (!var6_2) ** GOTO lbl263
                throw null;
            }
lbl283:
            // 2 sources

            case 18: {
                var5_3 /* !! */  = (int)jj$Trajectory.bdoh("bemz", bdoe(int ), (int)80);
                if (!var6_2) break;
                throw null;
            }
            case 19: 
        }
        var5_3 /* !! */  = (int)jj$Trajectory.bdoh("bena", bdoe(int ), (int)81);
        ** while (!var6_2)
lbl290:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ long bdoo(int n2) {
        return bdop[n2] ^ bdoq[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean sourceChanged(class_1297 var1_1) {
        v0 /* !! */  = jj$Trajectory.cy;
        if (true) ** GOTO lbl5
        block87: while (true) {
            v0 /* !! */  = (long)(v1 - jj$Trajectory.bdoh("bdor", bdoo(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1827968692: {
                    break block87;
                }
                case -1721138521: {
                    v1 = jj$Trajectory.bdoh("bdos", bdoo(int ), (int)1);
                    continue block87;
                }
                case -258132456: {
                    v1 = jj$Trajectory.bdoh("bdot", bdoo(int ), (int)2);
                    continue block87;
                }
            }
            break;
        }
        var6_2 = jj$Trajectory.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = jj$Trajectory.cy - jj$Trajectory.bdoh("bdou", bdoo(int ), (int)3)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == jj$Trajectory.bdoh("bdov", bdoe(int ), (int)6)) break;
            v2 /* !! */  = (long)jj$Trajectory.bdoh("bdow", bdoe(int ), (int)7);
        }
        var5_3 /* !! */  = jj$Trajectory.b;
        v3 /* !! */  = jj$Trajectory.cy;
        if (true) ** GOTO lbl25
        block89: while (true) {
            v3 /* !! */  = (long)(v4 - jj$Trajectory.bdoh("bdox", bdoo(int ), (int)4));
lbl25:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1827968692: {
                    break block89;
                }
                case -571704473: {
                    v4 = jj$Trajectory.bdoh("bdoy", bdoo(int ), (int)5);
                    continue block89;
                }
                case -90740683: {
                    v4 = jj$Trajectory.bdoh("bdoz", bdoo(int ), (int)6);
                    continue block89;
                }
                case 2097797578: {
                    v4 = jj$Trajectory.bdoh("bdpa", bdoo(int ), (int)7);
                    continue block89;
                }
            }
            break;
        }
        var4_4 = jj$Trajectory.a;
        if (var6_2) {
            throw null;
lbl40:
            // 11 sources

            return (boolean)jj$Trajectory.bdoh("bdpb", bdoe(int ), (int)8);
        }
        if (var4_4 || var4_4) ** GOTO lbl40
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_1 = jj$Trajectory.cy - jj$Trajectory.bdoh("bdpc", bdoo(int ), (int)8)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == jj$Trajectory.bdoh("bdpd", bdoe(int ), (int)9)) break;
            v5 /* !! */  = (long)jj$Trajectory.bdoh("bdpe", bdoe(int ), (int)10);
        }
        var2_5 = var1_1.method_73189();
        if (var4_4 || var4_4) ** GOTO lbl40
        v6 /* !! */  = jj$Trajectory.cy;
        if (true) ** GOTO lbl54
        block92: while (true) {
            v6 /* !! */  = (long)(jj$Trajectory.bdoh("bdpg", bdoo(int ), (int)10) - jj$Trajectory.bdoh("bdpf", bdoo(int ), (int)9));
lbl54:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case -1827968692: {
                    break block92;
                }
                case -654499266: {
                    continue block92;
                }
            }
            break;
        }
        var3_6 = var1_1.method_18798();
        if (var4_4 || var4_4) ** GOTO lbl40
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_2 = jj$Trajectory.cy - jj$Trajectory.bdoh("bdph", bdoo(int ), (int)11)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v7 /* !! */  == jj$Trajectory.bdoh("bdpi", bdoe(int ), (int)11)) break;
            v7 /* !! */  = (long)jj$Trajectory.bdoh("bdpj", bdoe(int ), (int)12);
        }
        while (true) {
            if ((v8 /* !! */  = (cfr_temp_3 = jj$Trajectory.cy - jj$Trajectory.bdoh("bdpk", bdoo(int ), (int)12)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v8 /* !! */  == jj$Trajectory.bdoh("bdpl", bdoe(int ), (int)13)) break;
            v8 /* !! */  = (long)jj$Trajectory.bdoh("bdpm", bdoe(int ), (int)14);
        }
        v9 = var2_5.field_1352;
        v10 /* !! */  = jj$Trajectory.cy;
        if (true) ** GOTO lbl76
        block95: while (true) {
            v10 /* !! */  = (long)(jj$Trajectory.bdoh("bdpo", bdoo(int ), (int)14) - jj$Trajectory.bdoh("bdpn", bdoo(int ), (int)13));
lbl76:
            // 2 sources

            switch ((int)v10 /* !! */ ) {
                case -1827968692: {
                    break block95;
                }
                case -716566096: {
                    continue block95;
                }
            }
            break;
        }
        if (Double.compare(this.sourceX, v9) != 0) ** GOTO lbl252
        if (var4_4) ** GOTO lbl40
        v11 /* !! */  = jj$Trajectory.cy;
        if (true) ** GOTO lbl87
        block96: while (true) {
            v11 /* !! */  = (long)(v12 - jj$Trajectory.bdoh("bdpp", bdoo(int ), (int)15));
lbl87:
            // 2 sources

            switch ((int)v11 /* !! */ ) {
                case -1827968692: {
                    break block96;
                }
                case -327328592: {
                    v12 = jj$Trajectory.bdoh("bdpq", bdoo(int ), (int)16);
                    continue block96;
                }
                case 1738281357: {
                    v12 = jj$Trajectory.bdoh("bdpr", bdoo(int ), (int)17);
                    continue block96;
                }
            }
            break;
        }
        v13 /* !! */  = jj$Trajectory.cy;
        if (true) ** GOTO lbl100
        block97: while (true) {
            v13 /* !! */  = (long)(v14 - jj$Trajectory.bdoh("bdps", bdoo(int ), (int)18));
lbl100:
            // 2 sources

            switch ((int)v13 /* !! */ ) {
                case -1827968692: {
                    break block97;
                }
                case -1789913910: {
                    v14 = jj$Trajectory.bdoh("bdpt", bdoo(int ), (int)19);
                    continue block97;
                }
                case -413384698: {
                    v14 = jj$Trajectory.bdoh("bdpu", bdoo(int ), (int)20);
                    continue block97;
                }
                case 1397263601: {
                    v14 = jj$Trajectory.bdoh("bdpv", bdoo(int ), (int)21);
                    continue block97;
                }
            }
            break;
        }
        v15 = var2_5.field_1351;
        while (true) {
            if ((v16 /* !! */  = (cfr_temp_4 = jj$Trajectory.cy - jj$Trajectory.bdoh("bdpw", bdoo(int ), (int)22)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v16 /* !! */  == jj$Trajectory.bdoh("bdpx", bdoe(int ), (int)15)) break;
            v16 /* !! */  = (long)jj$Trajectory.bdoh("bdpy", bdoe(int ), (int)16);
        }
        if (Double.compare(this.sourceY, v15) != 0) ** GOTO lbl252
        if (var5_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_4) ** GOTO lbl40
                while (true) {
                    if ((v17 /* !! */  = (cfr_temp_5 = jj$Trajectory.cy - jj$Trajectory.bdoh("bdpz", bdoo(int ), (int)23)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v17 /* !! */  == jj$Trajectory.bdoh("bdqa", bdoe(int ), (int)17)) break;
                    v17 /* !! */  = (long)jj$Trajectory.bdoh("bdqb", bdoe(int ), (int)18);
                }
                v18 /* !! */  = jj$Trajectory.cy;
                if (true) ** GOTO lbl132
                block100: while (true) {
                    v18 /* !! */  = (long)(jj$Trajectory.bdoh("bdqd", bdoo(int ), (int)25) - jj$Trajectory.bdoh("bdqc", bdoo(int ), (int)24));
lbl132:
                    // 2 sources

                    switch ((int)v18 /* !! */ ) {
                        case -1827968692: {
                            break block100;
                        }
                        case 383498196: {
                            continue block100;
                        }
                    }
                    break;
                }
                v19 = var2_5.field_1350;
                while (true) {
                    if ((v20 /* !! */  = (cfr_temp_6 = jj$Trajectory.cy - jj$Trajectory.bdoh("bdqe", bdoo(int ), (int)26)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v20 /* !! */  == jj$Trajectory.bdoh("bdqf", bdoe(int ), (int)19)) break;
                    v20 /* !! */  = (long)jj$Trajectory.bdoh("bdqg", bdoe(int ), (int)20);
                }
                if (Double.compare(this.sourceZ, v19) != 0) ** GOTO lbl252
                if (var4_4) ** GOTO lbl40
                v21 /* !! */  = jj$Trajectory.cy;
                if (true) ** GOTO lbl149
                block102: while (true) {
                    v21 /* !! */  = (long)(v22 - jj$Trajectory.bdoh("bdqh", bdoo(int ), (int)27));
lbl149:
                    // 2 sources

                    switch ((int)v21 /* !! */ ) {
                        case -1827968692: {
                            break block102;
                        }
                        case -197006743: {
                            v22 = jj$Trajectory.bdoh("bdqi", bdoo(int ), (int)28);
                            continue block102;
                        }
                        case 624203398: {
                            v22 = jj$Trajectory.bdoh("bdqj", bdoo(int ), (int)29);
                            continue block102;
                        }
                        case 1604239232: {
                            v22 = jj$Trajectory.bdoh("bdqk", bdoo(int ), (int)30);
                            continue block102;
                        }
                    }
                    break;
                }
                v23 /* !! */  = jj$Trajectory.cy;
                if (true) ** GOTO lbl165
                block103: while (true) {
                    v23 /* !! */  = (long)(v24 - jj$Trajectory.bdoh("bdql", bdoo(int ), (int)31));
lbl165:
                    // 2 sources

                    switch ((int)v23 /* !! */ ) {
                        case -1827968692: {
                            break block103;
                        }
                        case 279024159: {
                            v24 = jj$Trajectory.bdoh("bdqm", bdoo(int ), (int)32);
                            continue block103;
                        }
                        case 614961368: {
                            v24 = jj$Trajectory.bdoh("bdqn", bdoo(int ), (int)33);
                            continue block103;
                        }
                        case 1417812185: {
                            v24 = jj$Trajectory.bdoh("bdqo", bdoo(int ), (int)34);
                            continue block103;
                        }
                    }
                    break;
                }
                v25 = var3_6.field_1352;
                v26 /* !! */  = jj$Trajectory.cy;
                if (true) ** GOTO lbl182
                block104: while (true) {
                    v26 /* !! */  = (long)(jj$Trajectory.bdoh("bdqq", bdoo(int ), (int)36) - jj$Trajectory.bdoh("bdqp", bdoo(int ), (int)35));
lbl182:
                    // 2 sources

                    switch ((int)v26 /* !! */ ) {
                        case -1827968692: {
                            break block104;
                        }
                        case -886864381: {
                            continue block104;
                        }
                    }
                    break;
                }
                if (Double.compare(this.sourceVx, v25) != 0) ** GOTO lbl252
                if (var4_4) ** GOTO lbl40
                v27 /* !! */  = jj$Trajectory.cy;
                if (true) ** GOTO lbl193
                block105: while (true) {
                    v27 /* !! */  = (long)(v28 - jj$Trajectory.bdoh("bdqr", bdoo(int ), (int)37));
lbl193:
                    // 2 sources

                    switch ((int)v27 /* !! */ ) {
                        case -1827968692: {
                            break block105;
                        }
                        case -1092377903: {
                            v28 = jj$Trajectory.bdoh("bdqs", bdoo(int ), (int)38);
                            continue block105;
                        }
                        case -184390546: {
                            v28 = jj$Trajectory.bdoh("bdqt", bdoo(int ), (int)39);
                            continue block105;
                        }
                        case 1213048564: {
                            v28 = jj$Trajectory.bdoh("bdqu", bdoo(int ), (int)40);
                            continue block105;
                        }
                    }
                    break;
                }
                v29 /* !! */  = jj$Trajectory.cy;
                if (true) ** GOTO lbl209
                block106: while (true) {
                    v29 /* !! */  = (long)(v30 - jj$Trajectory.bdoh("bdqv", bdoo(int ), (int)41));
lbl209:
                    // 2 sources

                    switch ((int)v29 /* !! */ ) {
                        case -1827968692: {
                            break block106;
                        }
                        case 1656369130: {
                            v30 = jj$Trajectory.bdoh("bdqw", bdoo(int ), (int)42);
                            continue block106;
                        }
                        case 1839355156: {
                            v30 = jj$Trajectory.bdoh("bdqx", bdoo(int ), (int)43);
                            continue block106;
                        }
                    }
                    break;
                }
                v31 = var3_6.field_1351;
                while (true) {
                    if ((v32 /* !! */  = (cfr_temp_7 = jj$Trajectory.cy - jj$Trajectory.bdoh("bdqy", bdoo(int ), (int)44)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v32 /* !! */  == jj$Trajectory.bdoh("bdqz", bdoe(int ), (int)21)) break;
                    v32 /* !! */  = (long)jj$Trajectory.bdoh("bdra", bdoe(int ), (int)22);
                }
                if (Double.compare(this.sourceVy, v31) != 0) ** GOTO lbl252
                if (var4_4) ** GOTO lbl40
                v33 /* !! */  = jj$Trajectory.cy;
                if (true) ** GOTO lbl230
                block108: while (true) {
                    v33 /* !! */  = (long)(v34 - jj$Trajectory.bdoh("bdrb", bdoo(int ), (int)45));
lbl230:
                    // 2 sources

                    switch ((int)v33 /* !! */ ) {
                        case -2106871218: {
                            v34 = jj$Trajectory.bdoh("bdrc", bdoo(int ), (int)46);
                            continue block108;
                        }
                        case -1827968692: {
                            break block108;
                        }
                        case 1272015353: {
                            v34 = jj$Trajectory.bdoh("bdrd", bdoo(int ), (int)47);
                            continue block108;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v35 /* !! */  = (cfr_temp_8 = jj$Trajectory.cy - jj$Trajectory.bdoh("bdre", bdoo(int ), (int)48)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v35 /* !! */  == jj$Trajectory.bdoh("bdrf", bdoe(int ), (int)23)) break;
                    v35 /* !! */  = (long)jj$Trajectory.bdoh("bdrg", bdoe(int ), (int)24);
                }
                v36 = var3_6.field_1350;
                while (true) {
                    if ((v37 /* !! */  = (cfr_temp_9 = jj$Trajectory.cy - jj$Trajectory.bdoh("bdrh", bdoo(int ), (int)49)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                    if (v37 /* !! */  == jj$Trajectory.bdoh("bdri", bdoe(int ), (int)25)) break;
                    v37 /* !! */  = (long)jj$Trajectory.bdoh("bdrj", bdoe(int ), (int)26);
                }
                if (Double.compare(this.sourceVz, v36) == 0) ** GOTO lbl257
                if (var4_4) ** GOTO lbl40
lbl252:
                // 6 sources

                if (var4_4 || var4_4) ** GOTO lbl40
                v38 = jj$Trajectory.bdoh("bdrk", bdoe(int ), (int)27);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl260
lbl257:
                // 1 sources

                if (!var4_4 && !var4_4) ** break;
                ** continue;
                v38 = jj$Trajectory.bdoh("bdrl", bdoe(int ), (int)28);
lbl260:
                // 2 sources

                return (boolean)v38;
            }
lbl261:
            // 2 sources

            case 0: {
                var5_3 /* !! */  = (int)jj$Trajectory.bdoh("bdrm", bdoe(int ), (int)29);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl321
            }
lbl266:
            // 3 sources

            case 1: {
                var5_3 /* !! */  = (int)jj$Trajectory.bdoh("bdrn", bdoe(int ), (int)30);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl288
            }
            case 2: {
                var5_3 /* !! */  = (int)jj$Trajectory.bdoh("bdro", bdoe(int ), (int)31);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl325
            }
            case 3: {
                var5_3 /* !! */  = (int)jj$Trajectory.bdoh("bdrp", bdoe(int ), (int)32);
                if (!var6_2) ** GOTO lbl261
                throw null;
            }
lbl280:
            // 2 sources

            case 4: {
                var5_3 /* !! */  = (int)jj$Trajectory.bdoh("bdrq", bdoe(int ), (int)33);
                if (var6_2) {
                    throw null;
                }
            }
lbl284:
            // 4 sources

            case 5: {
                var5_3 /* !! */  = (int)jj$Trajectory.bdoh("bdrr", bdoe(int ), (int)34);
                if (!var6_2) ** GOTO lbl266
                throw null;
            }
lbl288:
            // 2 sources

            case 6: {
                var5_3 /* !! */  = (int)jj$Trajectory.bdoh("bdrs", bdoe(int ), (int)35);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl333
            }
lbl293:
            // 2 sources

            case 7: {
                var5_3 /* !! */  = (int)jj$Trajectory.bdoh("bdrt", bdoe(int ), (int)36);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl325
            }
lbl298:
            // 2 sources

            case 8: {
                var5_3 /* !! */  = (int)jj$Trajectory.bdoh("bdru", bdoe(int ), (int)37);
                if (var6_2) {
                    throw null;
                }
            }
            case 9: {
                var5_3 /* !! */  = (int)jj$Trajectory.bdoh("bdrv", bdoe(int ), (int)38);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl329
            }
            case 10: {
                var5_3 /* !! */  = (int)jj$Trajectory.bdoh("bdrw", bdoe(int ), (int)39);
                if (!var6_2) ** GOTO lbl293
                throw null;
            }
lbl311:
            // 2 sources

            case 11: {
                var5_3 /* !! */  = (int)jj$Trajectory.bdoh("bdrx", bdoe(int ), (int)40);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl325
            }
            case 12: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_3 /* !! */  = (int)jj$Trajectory.bdoh("bdry", bdoe(int ), (int)41);
                    if (!var6_2) ** GOTO lbl284
                    throw null;
                }
            }
lbl321:
            // 2 sources

            case 13: {
                var5_3 /* !! */  = (int)jj$Trajectory.bdoh("bdrz", bdoe(int ), (int)42);
                if (!var6_2) ** GOTO lbl280
                throw null;
            }
lbl325:
            // 5 sources

            case 14: {
                var5_3 /* !! */  = (int)jj$Trajectory.bdoh("bdsa", bdoe(int ), (int)43);
                if (!var6_2) ** GOTO lbl266
                throw null;
            }
lbl329:
            // 2 sources

            case 15: {
                var5_3 /* !! */  = (int)jj$Trajectory.bdoh("bdsb", bdoe(int ), (int)44);
                if (!var6_2) ** GOTO lbl325
                throw null;
            }
lbl333:
            // 2 sources

            case 16: {
                var5_3 /* !! */  = (int)jj$Trajectory.bdoh("bdsc", bdoe(int ), (int)45);
                if (!var6_2) ** GOTO lbl311
                throw null;
            }
            case 17: {
                var5_3 /* !! */  = (int)jj$Trajectory.bdoh("bdsd", bdoe(int ), (int)46);
                if (!var6_2) ** GOTO lbl298
                throw null;
            }
            case 18: 
        }
        var5_3 /* !! */  = (int)jj$Trajectory.bdoh("bdse", bdoe(int ), (int)47);
        ** while (!var6_2)
lbl344:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void bene() {
        jj$Trajectory.bdoq[0] = 3176565396670454144L;
        jj$Trajectory.bdoq[1] = 7938900075968183860L;
        jj$Trajectory.bdoq[2] = 1294980632549156700L;
        jj$Trajectory.bdoq[3] = 3343206732659304997L;
        jj$Trajectory.bdoq[4] = 4628919894412346650L;
        jj$Trajectory.bdoq[5] = 3418635288624978857L;
        jj$Trajectory.bdoq[6] = 5386606608895206295L;
        jj$Trajectory.bdoq[7] = 7178186611985764427L;
        jj$Trajectory.bdoq[8] = -2999357312993007977L;
        jj$Trajectory.bdoq[9] = 6136937018756279221L;
        jj$Trajectory.bdoq[10] = -4031582481894854320L;
        jj$Trajectory.bdoq[11] = 8513179088782075302L;
        jj$Trajectory.bdoq[12] = 5297227354419640906L;
        jj$Trajectory.bdoq[13] = 153172599284850189L;
        jj$Trajectory.bdoq[14] = -1152181901916243280L;
        jj$Trajectory.bdoq[15] = 5622731985229744239L;
        jj$Trajectory.bdoq[16] = 5241498507067812567L;
        jj$Trajectory.bdoq[17] = 7039859450299477183L;
        jj$Trajectory.bdoq[18] = -1970853068072775655L;
        jj$Trajectory.bdoq[19] = -6870616927677449431L;
        jj$Trajectory.bdoq[20] = -6971695899258548263L;
        jj$Trajectory.bdoq[21] = 4365610940194975219L;
        jj$Trajectory.bdoq[22] = -465001123472928879L;
        jj$Trajectory.bdoq[23] = 6259333446026557429L;
        jj$Trajectory.bdoq[24] = -1876643774693849512L;
        jj$Trajectory.bdoq[25] = -5121113563909915511L;
        jj$Trajectory.bdoq[26] = -6840493692985700273L;
        jj$Trajectory.bdoq[27] = 5104597815414889875L;
        jj$Trajectory.bdoq[28] = -2401360637908466484L;
        jj$Trajectory.bdoq[29] = -7401384035398861781L;
        jj$Trajectory.bdoq[30] = -1535210423482589635L;
        jj$Trajectory.bdoq[31] = 2237351939496653514L;
        jj$Trajectory.bdoq[32] = 3340107510601559521L;
        jj$Trajectory.bdoq[33] = 6388756249129350517L;
        jj$Trajectory.bdoq[34] = -5604691847623376272L;
        jj$Trajectory.bdoq[35] = 1083681595664892008L;
        jj$Trajectory.bdoq[36] = 4219674635760641890L;
        jj$Trajectory.bdoq[37] = 9024801067997953338L;
        jj$Trajectory.bdoq[38] = -4785436178553665356L;
        jj$Trajectory.bdoq[39] = 8983486030800000575L;
        jj$Trajectory.bdoq[40] = -2911317119472808213L;
        jj$Trajectory.bdoq[41] = 1997519580652969005L;
        jj$Trajectory.bdoq[42] = 1358135349361227608L;
        jj$Trajectory.bdoq[43] = -6133360606844820991L;
        jj$Trajectory.bdoq[44] = 8423524461816622238L;
        jj$Trajectory.bdoq[45] = -3880260475213618319L;
        jj$Trajectory.bdoq[46] = 3478026622729357256L;
        jj$Trajectory.bdoq[47] = 8939836400711073696L;
        jj$Trajectory.bdoq[48] = -5378821012433314921L;
        jj$Trajectory.bdoq[49] = 5970165700019702414L;
        jj$Trajectory.bdoq[50] = -5473983949447240582L;
        jj$Trajectory.bdoq[51] = 4088780579689256316L;
        jj$Trajectory.bdoq[52] = 8699556496256750348L;
        jj$Trajectory.bdoq[53] = -6167131644655960164L;
        jj$Trajectory.bdoq[54] = 4541391779141840357L;
        jj$Trajectory.bdoq[55] = -2107995606054967344L;
        jj$Trajectory.bdoq[56] = 1604536308342290560L;
        jj$Trajectory.bdoq[57] = 3928303499533367423L;
        jj$Trajectory.bdoq[58] = 311046402302990830L;
        jj$Trajectory.bdoq[59] = -9125746827033003545L;
        jj$Trajectory.bdoq[60] = 8658664792815715407L;
        jj$Trajectory.bdoq[61] = -2338535762055505374L;
        jj$Trajectory.bdoq[62] = -939706294238078927L;
        jj$Trajectory.bdoq[63] = 4410276142582083814L;
        jj$Trajectory.bdoq[64] = 5406297927297933368L;
        jj$Trajectory.bdoq[65] = -5115291432719214368L;
        jj$Trajectory.bdoq[66] = 5448000358121786768L;
        jj$Trajectory.bdoq[67] = 6649345933220260407L;
        jj$Trajectory.bdoq[68] = 3296323441160520862L;
        jj$Trajectory.bdoq[69] = -7719557794326277923L;
        jj$Trajectory.bdoq[70] = 4831213549731007864L;
        jj$Trajectory.bdoq[71] = 1539298090116838440L;
        jj$Trajectory.bdoq[72] = 6832223090336831383L;
        jj$Trajectory.bdoq[73] = 1778713082078643104L;
        jj$Trajectory.bdoq[74] = -6549868178666978101L;
        jj$Trajectory.bdoq[75] = -3675920423050085094L;
        jj$Trajectory.bdoq[76] = 1342172346809806702L;
        jj$Trajectory.bdoq[77] = -6186036927639633915L;
        jj$Trajectory.bdoq[78] = -218661935937740836L;
        jj$Trajectory.bdoq[79] = -4634755052627008222L;
        jj$Trajectory.bdoq[80] = -3048676075487034124L;
        jj$Trajectory.bdoq[81] = -3612522245901579027L;
        jj$Trajectory.bdoq[82] = 5645168840594634468L;
        jj$Trajectory.bdoq[83] = 2556053553859750598L;
        jj$Trajectory.bdoq[84] = 3996660203445493457L;
        jj$Trajectory.bdoq[85] = -7949454284995495267L;
        jj$Trajectory.bdoq[86] = 5644882523655698210L;
        jj$Trajectory.bdoq[87] = 5503620581557634380L;
    }

    private static /* synthetic */ void bend() {
        jj$Trajectory.bdop[0] = -7259162931675320126L;
        jj$Trajectory.bdop[1] = 1638771855698427189L;
        jj$Trajectory.bdop[2] = 8375938685045775472L;
        jj$Trajectory.bdop[3] = 8389385220219797701L;
        jj$Trajectory.bdop[4] = -1112826329988068701L;
        jj$Trajectory.bdop[5] = -3006360542817288484L;
        jj$Trajectory.bdop[6] = -4648646908504318751L;
        jj$Trajectory.bdop[7] = -7584846318806943030L;
        jj$Trajectory.bdop[8] = 8945999926046837992L;
        jj$Trajectory.bdop[9] = 3269387258292791205L;
        jj$Trajectory.bdop[10] = 1256354003163282410L;
        jj$Trajectory.bdop[11] = 815203251898965174L;
        jj$Trajectory.bdop[12] = -337443035068976417L;
        jj$Trajectory.bdop[13] = -4344012780643055044L;
        jj$Trajectory.bdop[14] = 5377675163368669588L;
        jj$Trajectory.bdop[15] = -6625207982057882209L;
        jj$Trajectory.bdop[16] = 2041189887521396142L;
        jj$Trajectory.bdop[17] = -3200924755786021037L;
        jj$Trajectory.bdop[18] = -4504930379137869861L;
        jj$Trajectory.bdop[19] = 5829781071217852990L;
        jj$Trajectory.bdop[20] = 3250497344930256404L;
        jj$Trajectory.bdop[21] = -6500948245561536068L;
        jj$Trajectory.bdop[22] = -6522871831460306229L;
        jj$Trajectory.bdop[23] = -5145877505717560159L;
        jj$Trajectory.bdop[24] = 7611117308378508811L;
        jj$Trajectory.bdop[25] = -5401105783268607407L;
        jj$Trajectory.bdop[26] = -6498245617346399790L;
        jj$Trajectory.bdop[27] = 5234429246267493016L;
        jj$Trajectory.bdop[28] = 6419240838788528506L;
        jj$Trajectory.bdop[29] = 4016789258060172613L;
        jj$Trajectory.bdop[30] = -166211296464225148L;
        jj$Trajectory.bdop[31] = -5919156263171628202L;
        jj$Trajectory.bdop[32] = 8369699625929151008L;
        jj$Trajectory.bdop[33] = -5738041506226762937L;
        jj$Trajectory.bdop[34] = 5721058658674332659L;
        jj$Trajectory.bdop[35] = -4876658429079699994L;
        jj$Trajectory.bdop[36] = 8234820012159648420L;
        jj$Trajectory.bdop[37] = -1081651978235825733L;
        jj$Trajectory.bdop[38] = -6484081766769596016L;
        jj$Trajectory.bdop[39] = -2609547955527312521L;
        jj$Trajectory.bdop[40] = 5456758361663593646L;
        jj$Trajectory.bdop[41] = 8740996244727465824L;
        jj$Trajectory.bdop[42] = -144802032635672922L;
        jj$Trajectory.bdop[43] = 3461041069646308708L;
        jj$Trajectory.bdop[44] = 5787593888428667400L;
        jj$Trajectory.bdop[45] = 7736212585064141494L;
        jj$Trajectory.bdop[46] = -7226654900248095316L;
        jj$Trajectory.bdop[47] = 7677459596960337393L;
        jj$Trajectory.bdop[48] = 2416391625357770602L;
        jj$Trajectory.bdop[49] = 789618097022320012L;
        jj$Trajectory.bdop[50] = 3366240749112537932L;
        jj$Trajectory.bdop[51] = 172236391632315711L;
        jj$Trajectory.bdop[52] = 2649923396749796426L;
        jj$Trajectory.bdop[53] = 2563315655818104008L;
        jj$Trajectory.bdop[54] = -941130951450980651L;
        jj$Trajectory.bdop[55] = -122395067538800975L;
        jj$Trajectory.bdop[56] = 8404883613721207750L;
        jj$Trajectory.bdop[57] = 9056490193500699180L;
        jj$Trajectory.bdop[58] = -218448742812531024L;
        jj$Trajectory.bdop[59] = 5937380032626460065L;
        jj$Trajectory.bdop[60] = 6078268599931377928L;
        jj$Trajectory.bdop[61] = 5230022269288431860L;
        jj$Trajectory.bdop[62] = -2399931489530124595L;
        jj$Trajectory.bdop[63] = 8583158584855536303L;
        jj$Trajectory.bdop[64] = 6645076014063529353L;
        jj$Trajectory.bdop[65] = 4377412395221975198L;
        jj$Trajectory.bdop[66] = -7889799728680817274L;
        jj$Trajectory.bdop[67] = -1371319957919895890L;
        jj$Trajectory.bdop[68] = -4713745878797091763L;
        jj$Trajectory.bdop[69] = 3256587745162074275L;
        jj$Trajectory.bdop[70] = 4134547153777570850L;
        jj$Trajectory.bdop[71] = -6746445608384092845L;
        jj$Trajectory.bdop[72] = 3553023922243363765L;
        jj$Trajectory.bdop[73] = 592288498748214767L;
        jj$Trajectory.bdop[74] = 2231826464999373151L;
        jj$Trajectory.bdop[75] = 5428849337532006885L;
        jj$Trajectory.bdop[76] = -6887837669745164042L;
        jj$Trajectory.bdop[77] = 8235583102542211146L;
        jj$Trajectory.bdop[78] = -5084801274124278001L;
        jj$Trajectory.bdop[79] = 539722845723519385L;
        jj$Trajectory.bdop[80] = -6846455399391581528L;
        jj$Trajectory.bdop[81] = 6738587730324554437L;
        jj$Trajectory.bdop[82] = -7253177603773015833L;
        jj$Trajectory.bdop[83] = 3921669614654656654L;
        jj$Trajectory.bdop[84] = -5589524418983807113L;
        jj$Trajectory.bdop[85] = -6439154197622782466L;
        jj$Trajectory.bdop[86] = -7216652284371248360L;
        jj$Trajectory.bdop[87] = -2775443588236983162L;
    }

    private static /* synthetic */ void benc() {
        jj$Trajectory.bdog[0] = 1457043010;
        jj$Trajectory.bdog[1] = -1734199575;
        jj$Trajectory.bdog[2] = -52734350;
        jj$Trajectory.bdog[3] = 1931326446;
        jj$Trajectory.bdog[4] = 1062987805;
        jj$Trajectory.bdog[5] = -1316476622;
        jj$Trajectory.bdog[6] = 851987391;
        jj$Trajectory.bdog[7] = 402632415;
        jj$Trajectory.bdog[8] = -573289286;
        jj$Trajectory.bdog[9] = -1212507585;
        jj$Trajectory.bdog[10] = 648823168;
        jj$Trajectory.bdog[11] = 1747612921;
        jj$Trajectory.bdog[12] = -951872134;
        jj$Trajectory.bdog[13] = 1200185419;
        jj$Trajectory.bdog[14] = 1898152306;
        jj$Trajectory.bdog[15] = 693440449;
        jj$Trajectory.bdog[16] = 1668572931;
        jj$Trajectory.bdog[17] = 1036200590;
        jj$Trajectory.bdog[18] = -505192028;
        jj$Trajectory.bdog[19] = -320770364;
        jj$Trajectory.bdog[20] = -1266229231;
        jj$Trajectory.bdog[21] = 237462263;
        jj$Trajectory.bdog[22] = 962196259;
        jj$Trajectory.bdog[23] = 337082662;
        jj$Trajectory.bdog[24] = -273611436;
        jj$Trajectory.bdog[25] = -1378163835;
        jj$Trajectory.bdog[26] = 1427610265;
        jj$Trajectory.bdog[27] = -1915593291;
        jj$Trajectory.bdog[28] = -1460840409;
        jj$Trajectory.bdog[29] = -1540978827;
        jj$Trajectory.bdog[30] = -1737892578;
        jj$Trajectory.bdog[31] = -1902270159;
        jj$Trajectory.bdog[32] = -1798011722;
        jj$Trajectory.bdog[33] = 1724077974;
        jj$Trajectory.bdog[34] = -1399599048;
        jj$Trajectory.bdog[35] = 1818850862;
        jj$Trajectory.bdog[36] = 905647380;
        jj$Trajectory.bdog[37] = 678983550;
        jj$Trajectory.bdog[38] = -95443156;
        jj$Trajectory.bdog[39] = -209275035;
        jj$Trajectory.bdog[40] = -875941759;
        jj$Trajectory.bdog[41] = -1912582709;
        jj$Trajectory.bdog[42] = 254570413;
        jj$Trajectory.bdog[43] = -769443105;
        jj$Trajectory.bdog[44] = -661063482;
        jj$Trajectory.bdog[45] = -1519115397;
        jj$Trajectory.bdog[46] = 1626759331;
        jj$Trajectory.bdog[47] = 388451170;
        jj$Trajectory.bdog[48] = -1567698643;
        jj$Trajectory.bdog[49] = -1983417048;
        jj$Trajectory.bdog[50] = -610395159;
        jj$Trajectory.bdog[51] = 220291538;
        jj$Trajectory.bdog[52] = 410826452;
        jj$Trajectory.bdog[53] = -749906577;
        jj$Trajectory.bdog[54] = -1318086692;
        jj$Trajectory.bdog[55] = -373472765;
        jj$Trajectory.bdog[56] = -1486530194;
        jj$Trajectory.bdog[57] = 1112406203;
        jj$Trajectory.bdog[58] = -951591218;
        jj$Trajectory.bdog[59] = 1813513077;
        jj$Trajectory.bdog[60] = -2081256875;
        jj$Trajectory.bdog[61] = -1246850051;
        jj$Trajectory.bdog[62] = -818711015;
        jj$Trajectory.bdog[63] = 28368997;
        jj$Trajectory.bdog[64] = 1454577670;
        jj$Trajectory.bdog[65] = 970013069;
        jj$Trajectory.bdog[66] = 1264684797;
        jj$Trajectory.bdog[67] = 63578380;
        jj$Trajectory.bdog[68] = -1618571940;
        jj$Trajectory.bdog[69] = 1414290105;
        jj$Trajectory.bdog[70] = 1134020737;
        jj$Trajectory.bdog[71] = -495598323;
        jj$Trajectory.bdog[72] = -1185825290;
        jj$Trajectory.bdog[73] = -1015415180;
        jj$Trajectory.bdog[74] = -42973545;
        jj$Trajectory.bdog[75] = 1257206696;
        jj$Trajectory.bdog[76] = -2007081255;
        jj$Trajectory.bdog[77] = 1686483734;
        jj$Trajectory.bdog[78] = -2101476461;
        jj$Trajectory.bdog[79] = -545549162;
        jj$Trajectory.bdog[80] = -1245850364;
        jj$Trajectory.bdog[81] = -1007760889;
    }

    private static /* synthetic */ int bdoe(int n2) {
        return bdof[n2] ^ bdog[n2];
    }
}

