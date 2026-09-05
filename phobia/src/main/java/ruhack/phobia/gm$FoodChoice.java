/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  net.minecraft.class_1268
 *  net.minecraft.class_1799
 *  net.minecraft.class_4174
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.runtime.ObjectMethods;
import net.minecraft.class_1268;
import net.minecraft.class_1799;
import net.minecraft.class_4174;

final class gm$FoodChoice
extends Record {
    private static long[] fkhu;
    public static final boolean c;
    private static long[] fkhv;
    private final class_1799 stack;
    static final long mk = 71514803910300550L;
    public static final boolean a;
    public static final int b;
    private final float score;
    private final class_4174 food;
    private final class_1268 hand;
    private final int hotbarSlot;
    private static int[] fkhm;
    private static int[] fkhl;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public class_1268 hand() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = gm$FoodChoice.mk - gm$FoodChoice.fkhn("fkjv", fkht(int ), (int)25)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == gm$FoodChoice.fkhn("fkjw", fkhk(int ), (int)31)) break;
            v0 /* !! */  = (long)gm$FoodChoice.fkhn("fkjx", fkhk(int ), (int)32);
        }
        var3_1 = gm$FoodChoice.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = gm$FoodChoice.mk - gm$FoodChoice.fkhn("fkjy", fkht(int ), (int)26)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == gm$FoodChoice.fkhn("fkjz", fkhk(int ), (int)33)) break;
            v1 /* !! */  = (long)gm$FoodChoice.fkhn("fkka", fkhk(int ), (int)34);
        }
        var2_2 = gm$FoodChoice.b;
        v2 /* !! */  = gm$FoodChoice.mk;
        if (true) ** GOTO lbl19
        block11: while (true) {
            v2 /* !! */  = (long)(v3 - gm$FoodChoice.fkhn("fkkb", fkht(int ), (int)27));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -750693498: {
                    break block11;
                }
                case -561897408: {
                    v3 = gm$FoodChoice.fkhn("fkkc", fkht(int ), (int)28);
                    continue block11;
                }
                case 1560677972: {
                    v3 = gm$FoodChoice.fkhn("fkkd", fkht(int ), (int)29);
                    continue block11;
                }
            }
            break;
        }
        var1_3 = gm$FoodChoice.a;
        if (var3_1) {
            throw null;
lbl31:
            // 1 sources

            return null;
        }
        ** while (var1_3 || var1_3)
lbl34:
        // 1 sources

        v4 /* !! */  = gm$FoodChoice.mk;
        if (true) ** GOTO lbl38
        block13: while (true) {
            v4 /* !! */  = (long)(gm$FoodChoice.fkhn("fkkf", fkht(int ), (int)31) - gm$FoodChoice.fkhn("fkke", fkht(int ), (int)30));
lbl38:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -750693498: {
                    break block13;
                }
                case 1788793821: {
                    continue block13;
                }
            }
            break;
        }
        return this.hand;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final boolean equals(Object var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = gm$FoodChoice.mk - gm$FoodChoice.fkhn("fkje", fkht(int ), (int)17)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == gm$FoodChoice.fkhn("fkjf", fkhk(int ), (int)22)) break;
            v0 /* !! */  = (long)gm$FoodChoice.fkhn("fkjg", fkhk(int ), (int)23);
        }
        var4_2 = gm$FoodChoice.c;
        v1 /* !! */  = gm$FoodChoice.mk;
        if (true) ** GOTO lbl12
        block17: while (true) {
            v1 /* !! */  = (long)(v2 - gm$FoodChoice.fkhn("fkjh", fkht(int ), (int)18));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1533946541: {
                    v2 = gm$FoodChoice.fkhn("fkji", fkht(int ), (int)19);
                    continue block17;
                }
                case -750693498: {
                    break block17;
                }
                case 1861731555: {
                    v2 = gm$FoodChoice.fkhn("fkjj", fkht(int ), (int)20);
                    continue block17;
                }
            }
            break;
        }
        var3_3 /* !! */  = gm$FoodChoice.b;
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        block5 : switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_1 = gm$FoodChoice.mk - gm$FoodChoice.fkhn("fkjk", fkht(int ), (int)21)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == gm$FoodChoice.fkhn("fkjl", fkhk(int ), (int)24)) break;
                    v3 /* !! */  = (long)gm$FoodChoice.fkhn("fkjm", fkhk(int ), (int)25);
                }
                var2_4 = gm$FoodChoice.a;
                if (var4_2) {
                    throw null;
                    return (boolean)gm$FoodChoice.fkhn("fkjn", fkhk(int ), (int)26);
                }
                if (var2_4 || var2_4) ** continue;
                v4 /* !! */  = gm$FoodChoice.mk;
                if (true) ** GOTO lbl41
                block20: while (true) {
                    v4 /* !! */  = (long)(v5 - gm$FoodChoice.fkhn("fkjo", fkht(int ), (int)22));
lbl41:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -750693498: {
                            break block20;
                        }
                        case 421680805: {
                            v5 = gm$FoodChoice.fkhn("fkjp", fkht(int ), (int)23);
                            continue block20;
                        }
                        case 2002377128: {
                            v5 = gm$FoodChoice.fkhn("fkjq", fkht(int ), (int)24);
                            continue block20;
                        }
                    }
                    break;
                }
                return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{gm$FoodChoice.class, "hand;hotbarSlot;stack;food;score", "hand", "hotbarSlot", "stack", "food", "score"}, this, var1_1);
            }
            case 0: {
                do {
                    var3_3 /* !! */  = (int)gm$FoodChoice.fkhn("fkjr", fkhk(int ), (int)27);
                } while (!var4_2);
                throw null;
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)gm$FoodChoice.fkhn("fkjs", fkhk(int ), (int)28);
                    if (!var4_2) break block5;
                    throw null;
                }
            }
            case 2: {
                do {
                    var3_3 /* !! */  = (int)gm$FoodChoice.fkhn("fkjt", fkhk(int ), (int)29);
                } while (!var4_2);
                throw null;
            }
            case 3: 
        }
        var3_3 /* !! */  = (int)gm$FoodChoice.fkhn("fkju", fkhk(int ), (int)30);
        ** while (!var4_2)
lbl69:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void fknd() {
        gm$FoodChoice.fkhl[0] = -1295557383;
        gm$FoodChoice.fkhl[1] = 392785383;
        gm$FoodChoice.fkhl[2] = 539087679;
        gm$FoodChoice.fkhl[3] = 1453706546;
        gm$FoodChoice.fkhl[4] = 2029576214;
        gm$FoodChoice.fkhl[5] = -1653140090;
        gm$FoodChoice.fkhl[6] = 1105973215;
        gm$FoodChoice.fkhl[7] = 89140744;
        gm$FoodChoice.fkhl[8] = -1902811849;
        gm$FoodChoice.fkhl[9] = -951777213;
        gm$FoodChoice.fkhl[10] = -673765138;
        gm$FoodChoice.fkhl[11] = -845495858;
        gm$FoodChoice.fkhl[12] = 2016638054;
        gm$FoodChoice.fkhl[13] = 1055272143;
        gm$FoodChoice.fkhl[14] = 2050516743;
        gm$FoodChoice.fkhl[15] = 1828685890;
        gm$FoodChoice.fkhl[16] = 75956888;
        gm$FoodChoice.fkhl[17] = -313454658;
        gm$FoodChoice.fkhl[18] = -1748612299;
        gm$FoodChoice.fkhl[19] = -1209717036;
        gm$FoodChoice.fkhl[20] = 2146261882;
        gm$FoodChoice.fkhl[21] = 993483542;
        gm$FoodChoice.fkhl[22] = 1470194380;
        gm$FoodChoice.fkhl[23] = 2043423651;
        gm$FoodChoice.fkhl[24] = 861988131;
        gm$FoodChoice.fkhl[25] = 2090629836;
        gm$FoodChoice.fkhl[26] = -1111813517;
        gm$FoodChoice.fkhl[27] = 1134958242;
        gm$FoodChoice.fkhl[28] = -312520173;
        gm$FoodChoice.fkhl[29] = 216813371;
        gm$FoodChoice.fkhl[30] = -561900478;
        gm$FoodChoice.fkhl[31] = -2123706688;
        gm$FoodChoice.fkhl[32] = -343549152;
        gm$FoodChoice.fkhl[33] = 581332936;
        gm$FoodChoice.fkhl[34] = -827165790;
        gm$FoodChoice.fkhl[35] = 342575938;
        gm$FoodChoice.fkhl[36] = -1617406516;
        gm$FoodChoice.fkhl[37] = 1952603701;
        gm$FoodChoice.fkhl[38] = -739891272;
        gm$FoodChoice.fkhl[39] = 651110278;
        gm$FoodChoice.fkhl[40] = -27284891;
        gm$FoodChoice.fkhl[41] = -886867793;
        gm$FoodChoice.fkhl[42] = 770338490;
        gm$FoodChoice.fkhl[43] = -1742769489;
        gm$FoodChoice.fkhl[44] = 1087750184;
        gm$FoodChoice.fkhl[45] = 573661770;
        gm$FoodChoice.fkhl[46] = -1908743797;
        gm$FoodChoice.fkhl[47] = 1882732376;
        gm$FoodChoice.fkhl[48] = 490165155;
        gm$FoodChoice.fkhl[49] = 910176167;
        gm$FoodChoice.fkhl[50] = 1520046598;
        gm$FoodChoice.fkhl[51] = 1156960183;
        gm$FoodChoice.fkhl[52] = -1806407419;
        gm$FoodChoice.fkhl[53] = 2033930519;
        gm$FoodChoice.fkhl[54] = -702944973;
        gm$FoodChoice.fkhl[55] = 177952180;
        gm$FoodChoice.fkhl[56] = 1772665640;
        gm$FoodChoice.fkhl[57] = 800562884;
        gm$FoodChoice.fkhl[58] = 1279084629;
        gm$FoodChoice.fkhl[59] = 392241479;
        gm$FoodChoice.fkhl[60] = 1605459972;
        gm$FoodChoice.fkhl[61] = 1743165190;
        gm$FoodChoice.fkhl[62] = -842320617;
        gm$FoodChoice.fkhl[63] = -1988630388;
        gm$FoodChoice.fkhl[64] = -833816759;
        gm$FoodChoice.fkhl[65] = -754199512;
        gm$FoodChoice.fkhl[66] = -1365544511;
        gm$FoodChoice.fkhl[67] = 53759645;
        gm$FoodChoice.fkhl[68] = -44132740;
        gm$FoodChoice.fkhl[69] = -1427497543;
        gm$FoodChoice.fkhl[70] = -600867629;
        gm$FoodChoice.fkhl[71] = -1500381630;
        gm$FoodChoice.fkhl[72] = 1231135671;
        gm$FoodChoice.fkhl[73] = 153123959;
        gm$FoodChoice.fkhl[74] = 1691149915;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public float score() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = gm$FoodChoice.mk - gm$FoodChoice.fkhn("fkmk", fkht(int ), (int)59)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == gm$FoodChoice.fkhn("fkml", fkhk(int ), (int)64)) break;
            v0 /* !! */  = (long)gm$FoodChoice.fkhn("fkmm", fkhk(int ), (int)65);
        }
        var3_1 = gm$FoodChoice.c;
        v1 /* !! */  = gm$FoodChoice.mk;
        if (true) ** GOTO lbl12
        block13: while (true) {
            v1 /* !! */  = (long)(v2 - gm$FoodChoice.fkhn("fkmn", fkht(int ), (int)60));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1897629999: {
                    v2 = gm$FoodChoice.fkhn("fkmo", fkht(int ), (int)61);
                    continue block13;
                }
                case -1087309004: {
                    v2 = gm$FoodChoice.fkhn("fkmp", fkht(int ), (int)62);
                    continue block13;
                }
                case -983792136: {
                    v2 = gm$FoodChoice.fkhn("fkmq", fkht(int ), (int)63);
                    continue block13;
                }
                case -750693498: {
                    break block13;
                }
            }
            break;
        }
        var2_2 /* !! */  = gm$FoodChoice.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = gm$FoodChoice.mk - gm$FoodChoice.fkhn("fkmr", fkht(int ), (int)64)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == gm$FoodChoice.fkhn("fkms", fkhk(int ), (int)66)) break;
            v3 /* !! */  = (long)gm$FoodChoice.fkhn("fkmt", fkhk(int ), (int)67);
        }
        var1_3 = gm$FoodChoice.a;
        if (var3_1) {
            throw null;
lbl34:
            // 1 sources

            return (float)gm$FoodChoice.fkhn("fkmv", fkmu(int ), (int)68);
        }
        ** while (var1_3 || var1_3)
lbl37:
        // 1 sources

        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = gm$FoodChoice.mk - gm$FoodChoice.fkhn("fkmw", fkht(int ), (int)65)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == gm$FoodChoice.fkhn("fkmx", fkhk(int ), (int)69)) break;
                    v4 /* !! */  = (long)gm$FoodChoice.fkhn("fkmy", fkhk(int ), (int)70);
                }
                return this.score;
            }
            case 0: {
                var2_2 /* !! */  = (int)gm$FoodChoice.fkhn("fkmz", fkhk(int ), (int)71);
                if (!var3_1) break;
                throw null;
            }
lbl51:
            // 2 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)gm$FoodChoice.fkhn("fkna", fkhk(int ), (int)72);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)gm$FoodChoice.fkhn("fknb", fkhk(int ), (int)73);
                if (!var3_1) ** GOTO lbl51
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)gm$FoodChoice.fkhn("fknc", fkhk(int ), (int)74);
        ** while (!var3_1)
lbl63:
        // 1 sources

        throw null;
    }

    static {
        fkhl = new int[75];
        fkhm = new int[75];
        gm$FoodChoice.fknd();
        gm$FoodChoice.fkne();
        fkhu = new long[66];
        fkhv = new long[66];
        gm$FoodChoice.fknf();
        gm$FoodChoice.fkng();
    }

    private static /* synthetic */ int fkhk(int n2) {
        return fkhl[n2] ^ fkhm[n2];
    }

    private static /* synthetic */ float fkmu(int n2) {
        return Float.intBitsToFloat(fkhl[n2] ^ fkhm[n2]);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final String toString() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = gm$FoodChoice.mk - gm$FoodChoice.fkhn("fkhw", fkht(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == gm$FoodChoice.fkhn("fkhx", fkhk(int ), (int)5)) break;
            v0 /* !! */  = (long)gm$FoodChoice.fkhn("fkhy", fkhk(int ), (int)6);
        }
        var3_1 = gm$FoodChoice.c;
        v1 /* !! */  = gm$FoodChoice.mk;
        if (true) ** GOTO lbl12
        block12: while (true) {
            v1 /* !! */  = (long)(v2 - gm$FoodChoice.fkhn("fkhz", fkht(int ), (int)1));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -750693498: {
                    break block12;
                }
                case -444667433: {
                    v2 = gm$FoodChoice.fkhn("fkia", fkht(int ), (int)2);
                    continue block12;
                }
                case 913876088: {
                    v2 = gm$FoodChoice.fkhn("fkib", fkht(int ), (int)3);
                    continue block12;
                }
            }
            break;
        }
        var2_2 /* !! */  = gm$FoodChoice.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = gm$FoodChoice.mk - gm$FoodChoice.fkhn("fkic", fkht(int ), (int)4)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == gm$FoodChoice.fkhn("fkid", fkhk(int ), (int)7)) break;
            v3 /* !! */  = (long)gm$FoodChoice.fkhn("fkie", fkhk(int ), (int)8);
        }
        var1_3 = gm$FoodChoice.a;
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
                    if ((v4 /* !! */  = (cfr_temp_2 = gm$FoodChoice.mk - gm$FoodChoice.fkhn("fkif", fkht(int ), (int)5)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == gm$FoodChoice.fkhn("fkig", fkhk(int ), (int)9)) break;
                    v4 /* !! */  = (long)gm$FoodChoice.fkhn("fkih", fkhk(int ), (int)10);
                }
                return ObjectMethods.bootstrap("toString", new MethodHandle[]{gm$FoodChoice.class, "hand;hotbarSlot;stack;food;score", "hand", "hotbarSlot", "stack", "food", "score"}, this);
            }
lbl45:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)gm$FoodChoice.fkhn("fkii", fkhk(int ), (int)11);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl54
            }
            case 1: {
                var2_2 /* !! */  = (int)gm$FoodChoice.fkhn("fkij", fkhk(int ), (int)12);
                if (!var3_1) ** GOTO lbl45
                throw null;
            }
lbl54:
            // 2 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)gm$FoodChoice.fkhn("fkik", fkhk(int ), (int)13);
                    if (!var3_1) break block5;
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)gm$FoodChoice.fkhn("fkil", fkhk(int ), (int)14);
        ** while (!var3_1)
lbl62:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ long fkht(int n2) {
        return fkhu[n2] ^ fkhv[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public class_1799 stack() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = gm$FoodChoice.mk - gm$FoodChoice.fkhn("fkld", fkht(int ), (int)44)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == gm$FoodChoice.fkhn("fkle", fkhk(int ), (int)46)) break;
            v0 /* !! */  = (long)gm$FoodChoice.fkhn("fklf", fkhk(int ), (int)47);
        }
        var3_1 = gm$FoodChoice.c;
        v1 /* !! */  = gm$FoodChoice.mk;
        if (true) ** GOTO lbl12
        block11: while (true) {
            v1 /* !! */  = (long)(gm$FoodChoice.fkhn("fklh", fkht(int ), (int)46) - gm$FoodChoice.fkhn("fklg", fkht(int ), (int)45));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1757961406: {
                    continue block11;
                }
                case -750693498: {
                    break block11;
                }
            }
            break;
        }
        var2_2 /* !! */  = gm$FoodChoice.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = gm$FoodChoice.mk - gm$FoodChoice.fkhn("fkli", fkht(int ), (int)47)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == gm$FoodChoice.fkhn("fklj", fkhk(int ), (int)48)) break;
            v2 /* !! */  = (long)gm$FoodChoice.fkhn("fklk", fkhk(int ), (int)49);
        }
        var1_3 = gm$FoodChoice.a;
        if (var3_1) {
            throw null;
lbl27:
            // 1 sources

            return null;
        }
        ** while (var1_3 || var1_3)
lbl30:
        // 1 sources

        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = gm$FoodChoice.mk - gm$FoodChoice.fkhn("fkll", fkht(int ), (int)48)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == gm$FoodChoice.fkhn("fklm", fkhk(int ), (int)50)) break;
                    v3 /* !! */  = (long)gm$FoodChoice.fkhn("fkln", fkhk(int ), (int)51);
                }
                return this.stack;
            }
            case 0: {
                var2_2 /* !! */  = (int)gm$FoodChoice.fkhn("fklo", fkhk(int ), (int)52);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl49
            }
            case 1: {
                var2_2 /* !! */  = (int)gm$FoodChoice.fkhn("fklp", fkhk(int ), (int)53);
                if (var3_1) {
                    throw null;
                }
            }
lbl49:
            // 4 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)gm$FoodChoice.fkhn("fklq", fkhk(int ), (int)54);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)gm$FoodChoice.fkhn("fklr", fkhk(int ), (int)55);
        ** while (!var3_1)
lbl57:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private gm$FoodChoice(class_1268 var1_1, int var2_2, class_1799 var3_3, class_4174 var4_4, float var5_5) {
        var7_6 /* !! */  = gm$FoodChoice.b;
        super();
        if (var7_6 /* !! */  == 0) ** GOTO lbl-1000
        switch (var7_6 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.hand = var1_1;
                this.hotbarSlot = var2_2;
                this.stack = var3_3;
                this.food = var4_4;
                this.score = var5_5;
                return;
            }
            case 0: {
                var7_6 /* !! */  = (int)gm$FoodChoice.fkhn("fkho", fkhk(int ), (int)0);
            }
            case 1: {
                var7_6 /* !! */  = (int)gm$FoodChoice.fkhn("fkhp", fkhk(int ), (int)1);
                break;
            }
            case 2: {
                var7_6 /* !! */  = (int)gm$FoodChoice.fkhn("fkhq", fkhk(int ), (int)2);
                break;
            }
            case 3: {
                while (true) {
                    var7_6 /* !! */  = (int)gm$FoodChoice.fkhn("fkhr", fkhk(int ), (int)3);
                }
            }
            case 4: 
        }
        while (true) {
            var7_6 /* !! */  = (int)gm$FoodChoice.fkhn("fkhs", fkhk(int ), (int)4);
        }
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public final int hashCode() {
        boolean bl2;
        Object object = mk;
        boolean bl3 = true;
        block16: while (true) {
            CallSite callSite;
            if (!bl3 || (bl3 = false) || !true) {
                object = callSite - gm$FoodChoice.fkhn("fkim", fkht(int ), (int)6);
            }
            switch ((int)object) {
                case -1705707818: {
                    callSite = gm$FoodChoice.fkhn("fkin", fkht(int ), (int)7);
                    continue block16;
                }
                case -1071144409: {
                    callSite = gm$FoodChoice.fkhn("fkio", fkht(int ), (int)8);
                    continue block16;
                }
                case -750693498: {
                    break block16;
                }
                case -666694182: {
                    callSite = gm$FoodChoice.fkhn("fkip", fkht(int ), (int)9);
                    continue block16;
                }
            }
            break;
        }
        boolean bl4 = c;
        Object object2 = mk;
        block17: while (true) {
            switch ((int)object2) {
                case -776770607: {
                    object2 = gm$FoodChoice.fkhn("fkir", fkht(int ), (int)11) - gm$FoodChoice.fkhn("fkiq", fkht(int ), (int)10);
                    continue block17;
                }
                case -750693498: {
                    break block17;
                }
            }
            break;
        }
        int n2 = b;
        while (true) {
            long l2;
            Object object3;
            if ((object3 = (l2 = mk - gm$FoodChoice.fkhn("fkis", fkht(int ), (int)12)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (object3 == gm$FoodChoice.fkhn("fkit", fkhk(int ), (int)15)) {
                bl2 = a;
                if (bl4) {
                    throw null;
                }
                break;
            }
            object3 = gm$FoodChoice.fkhn("fkiu", fkhk(int ), (int)16);
        }
        if (bl2) return (int)gm$FoodChoice.fkhn("fkiv", fkhk(int ), (int)17);
        if (bl2) return (int)gm$FoodChoice.fkhn("fkiv", fkhk(int ), (int)17);
        Object object4 = mk;
        boolean bl5 = true;
        block19: while (true) {
            CallSite callSite;
            if (!bl5 || (bl5 = false) || !true) {
                object4 = callSite - gm$FoodChoice.fkhn("fkiw", fkht(int ), (int)13);
            }
            switch ((int)object4) {
                case -750693498: {
                    return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{gm$FoodChoice.class, "hand;hotbarSlot;stack;food;score", "hand", "hotbarSlot", "stack", "food", "score"}, this);
                }
                case -248660790: {
                    callSite = gm$FoodChoice.fkhn("fkix", fkht(int ), (int)14);
                    continue block19;
                }
                case 207481092: {
                    callSite = gm$FoodChoice.fkhn("fkiy", fkht(int ), (int)15);
                    continue block19;
                }
                case 632472470: {
                    callSite = gm$FoodChoice.fkhn("fkiz", fkht(int ), (int)16);
                    continue block19;
                }
            }
            break;
        }
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{gm$FoodChoice.class, "hand;hotbarSlot;stack;food;score", "hand", "hotbarSlot", "stack", "food", "score"}, this);
    }

    public static /* synthetic */ CallSite fkhn(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public class_4174 food() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = gm$FoodChoice.mk - gm$FoodChoice.fkhn("fkls", fkht(int ), (int)49)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == gm$FoodChoice.fkhn("fklt", fkhk(int ), (int)56)) break;
            v0 /* !! */  = (long)gm$FoodChoice.fkhn("fklu", fkhk(int ), (int)57);
        }
        var3_1 = gm$FoodChoice.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = gm$FoodChoice.mk - gm$FoodChoice.fkhn("fklv", fkht(int ), (int)50)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == gm$FoodChoice.fkhn("fklw", fkhk(int ), (int)58)) break;
            v1 /* !! */  = (long)gm$FoodChoice.fkhn("fklx", fkhk(int ), (int)59);
        }
        var2_2 = gm$FoodChoice.b;
        v2 /* !! */  = gm$FoodChoice.mk;
        if (true) ** GOTO lbl19
        block14: while (true) {
            v2 /* !! */  = (long)(v3 - gm$FoodChoice.fkhn("fkly", fkht(int ), (int)51));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1302752611: {
                    v3 = gm$FoodChoice.fkhn("fklz", fkht(int ), (int)52);
                    continue block14;
                }
                case -930435788: {
                    v3 = gm$FoodChoice.fkhn("fkma", fkht(int ), (int)53);
                    continue block14;
                }
                case -750693498: {
                    break block14;
                }
                case 1657208934: {
                    v3 = gm$FoodChoice.fkhn("fkmb", fkht(int ), (int)54);
                    continue block14;
                }
            }
            break;
        }
        var1_3 = gm$FoodChoice.a;
        if (var3_1) {
            throw null;
lbl34:
            // 1 sources

            return null;
        }
        ** while (var1_3 || var1_3)
lbl37:
        // 1 sources

        v4 /* !! */  = gm$FoodChoice.mk;
        if (true) ** GOTO lbl41
        block16: while (true) {
            v4 /* !! */  = (long)(v5 - gm$FoodChoice.fkhn("fkmc", fkht(int ), (int)55));
lbl41:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -750693498: {
                    break block16;
                }
                case -468619618: {
                    v5 = gm$FoodChoice.fkhn("fkmd", fkht(int ), (int)56);
                    continue block16;
                }
                case 1545858354: {
                    v5 = gm$FoodChoice.fkhn("fkme", fkht(int ), (int)57);
                    continue block16;
                }
                case 1610355175: {
                    v5 = gm$FoodChoice.fkhn("fkmf", fkht(int ), (int)58);
                    continue block16;
                }
            }
            break;
        }
        return this.food;
    }

    private static /* synthetic */ void fkng() {
        gm$FoodChoice.fkhv[0] = -7618078473618573844L;
        gm$FoodChoice.fkhv[1] = -528207559524872177L;
        gm$FoodChoice.fkhv[2] = 1630695870914943206L;
        gm$FoodChoice.fkhv[3] = -2800950850224383368L;
        gm$FoodChoice.fkhv[4] = -3070986285797954508L;
        gm$FoodChoice.fkhv[5] = 3848024792330809288L;
        gm$FoodChoice.fkhv[6] = 7905094559384333516L;
        gm$FoodChoice.fkhv[7] = 1368503640197197172L;
        gm$FoodChoice.fkhv[8] = -7792212923860341521L;
        gm$FoodChoice.fkhv[9] = 8243104164415335710L;
        gm$FoodChoice.fkhv[10] = -7594055877549565557L;
        gm$FoodChoice.fkhv[11] = -6536767916229612837L;
        gm$FoodChoice.fkhv[12] = -240404366343205926L;
        gm$FoodChoice.fkhv[13] = 5817715730622664860L;
        gm$FoodChoice.fkhv[14] = -1212698377806848509L;
        gm$FoodChoice.fkhv[15] = -5379952773062581819L;
        gm$FoodChoice.fkhv[16] = -3534208483340783728L;
        gm$FoodChoice.fkhv[17] = -841033127716373620L;
        gm$FoodChoice.fkhv[18] = 1634537715017328245L;
        gm$FoodChoice.fkhv[19] = 8723715467552986226L;
        gm$FoodChoice.fkhv[20] = 6372224370678430442L;
        gm$FoodChoice.fkhv[21] = 5556788065531483256L;
        gm$FoodChoice.fkhv[22] = 5587377460226668030L;
        gm$FoodChoice.fkhv[23] = 8288870909481630720L;
        gm$FoodChoice.fkhv[24] = -2173349104710392246L;
        gm$FoodChoice.fkhv[25] = -1448720279619808474L;
        gm$FoodChoice.fkhv[26] = -7503968604923270074L;
        gm$FoodChoice.fkhv[27] = 8530139674090778473L;
        gm$FoodChoice.fkhv[28] = 3014074759730601676L;
        gm$FoodChoice.fkhv[29] = -1765716010563711975L;
        gm$FoodChoice.fkhv[30] = 3561335659377331293L;
        gm$FoodChoice.fkhv[31] = 6143547173546536533L;
        gm$FoodChoice.fkhv[32] = 6694383160332810436L;
        gm$FoodChoice.fkhv[33] = -5418296553447389478L;
        gm$FoodChoice.fkhv[34] = -1371833245664696924L;
        gm$FoodChoice.fkhv[35] = -6610766086088474379L;
        gm$FoodChoice.fkhv[36] = 8008021692244147173L;
        gm$FoodChoice.fkhv[37] = -5324085916884528693L;
        gm$FoodChoice.fkhv[38] = -6230033968324622709L;
        gm$FoodChoice.fkhv[39] = 5118143412621030855L;
        gm$FoodChoice.fkhv[40] = 8732545999797435634L;
        gm$FoodChoice.fkhv[41] = 4008977001475449442L;
        gm$FoodChoice.fkhv[42] = 2727566689305430987L;
        gm$FoodChoice.fkhv[43] = 7394594787246168945L;
        gm$FoodChoice.fkhv[44] = -3132031755675979938L;
        gm$FoodChoice.fkhv[45] = -8790032153063254249L;
        gm$FoodChoice.fkhv[46] = 6103523704519902639L;
        gm$FoodChoice.fkhv[47] = -6312316107816789086L;
        gm$FoodChoice.fkhv[48] = 1541186081340825874L;
        gm$FoodChoice.fkhv[49] = 3587949709468258195L;
        gm$FoodChoice.fkhv[50] = -2800564876965469075L;
        gm$FoodChoice.fkhv[51] = -211298619839156570L;
        gm$FoodChoice.fkhv[52] = 5838657123012543650L;
        gm$FoodChoice.fkhv[53] = -3461021315455896407L;
        gm$FoodChoice.fkhv[54] = 4766555900600405091L;
        gm$FoodChoice.fkhv[55] = -7366222170387061274L;
        gm$FoodChoice.fkhv[56] = -5431244867255809785L;
        gm$FoodChoice.fkhv[57] = -3309198977783635551L;
        gm$FoodChoice.fkhv[58] = 2520866545640715176L;
        gm$FoodChoice.fkhv[59] = 8484178084671951489L;
        gm$FoodChoice.fkhv[60] = 1690755905287359564L;
        gm$FoodChoice.fkhv[61] = 6767812576131338752L;
        gm$FoodChoice.fkhv[62] = 1862879490795850824L;
        gm$FoodChoice.fkhv[63] = -8097853142400225721L;
        gm$FoodChoice.fkhv[64] = 3087107320909002513L;
        gm$FoodChoice.fkhv[65] = -410786015672070222L;
    }

    private static /* synthetic */ void fknf() {
        gm$FoodChoice.fkhu[0] = 4478099868344444822L;
        gm$FoodChoice.fkhu[1] = 4435298650722733191L;
        gm$FoodChoice.fkhu[2] = -3589115765097768236L;
        gm$FoodChoice.fkhu[3] = -5329455730702150890L;
        gm$FoodChoice.fkhu[4] = -6276254739330371663L;
        gm$FoodChoice.fkhu[5] = 4014509075686187335L;
        gm$FoodChoice.fkhu[6] = 4005566037927977737L;
        gm$FoodChoice.fkhu[7] = -5129208327235368493L;
        gm$FoodChoice.fkhu[8] = -3969420211160664635L;
        gm$FoodChoice.fkhu[9] = 8325218249993095656L;
        gm$FoodChoice.fkhu[10] = 6389776428099957528L;
        gm$FoodChoice.fkhu[11] = 6366811279304675195L;
        gm$FoodChoice.fkhu[12] = -3064658504750426759L;
        gm$FoodChoice.fkhu[13] = 2634064019522504489L;
        gm$FoodChoice.fkhu[14] = 4775143236728971475L;
        gm$FoodChoice.fkhu[15] = -8149130820521393640L;
        gm$FoodChoice.fkhu[16] = -2459047529351126265L;
        gm$FoodChoice.fkhu[17] = 4581256474361136172L;
        gm$FoodChoice.fkhu[18] = 6436710669378589783L;
        gm$FoodChoice.fkhu[19] = 3314848583738460533L;
        gm$FoodChoice.fkhu[20] = -214618268461262298L;
        gm$FoodChoice.fkhu[21] = 6438472172485741999L;
        gm$FoodChoice.fkhu[22] = 3543732416476058651L;
        gm$FoodChoice.fkhu[23] = 2964870479821263811L;
        gm$FoodChoice.fkhu[24] = -2395981431841785478L;
        gm$FoodChoice.fkhu[25] = -6992349232422857557L;
        gm$FoodChoice.fkhu[26] = 2914420487093214164L;
        gm$FoodChoice.fkhu[27] = 2624838287660034944L;
        gm$FoodChoice.fkhu[28] = -4793308122015754712L;
        gm$FoodChoice.fkhu[29] = 2481016060599738039L;
        gm$FoodChoice.fkhu[30] = 1801937607495428623L;
        gm$FoodChoice.fkhu[31] = -3034360533349076978L;
        gm$FoodChoice.fkhu[32] = -3741424820682674814L;
        gm$FoodChoice.fkhu[33] = -3006853434944150841L;
        gm$FoodChoice.fkhu[34] = -6460490365341619044L;
        gm$FoodChoice.fkhu[35] = 3315212107479654512L;
        gm$FoodChoice.fkhu[36] = 1233195959955827702L;
        gm$FoodChoice.fkhu[37] = 192569813599754421L;
        gm$FoodChoice.fkhu[38] = -1882018262849737252L;
        gm$FoodChoice.fkhu[39] = 6401673419250123612L;
        gm$FoodChoice.fkhu[40] = -4635195600816322983L;
        gm$FoodChoice.fkhu[41] = -5598556913078529395L;
        gm$FoodChoice.fkhu[42] = -663701211681185541L;
        gm$FoodChoice.fkhu[43] = -1488187948345344192L;
        gm$FoodChoice.fkhu[44] = -4188442312105919152L;
        gm$FoodChoice.fkhu[45] = 9182537614501975277L;
        gm$FoodChoice.fkhu[46] = 1348023431019361190L;
        gm$FoodChoice.fkhu[47] = 4812057860046520963L;
        gm$FoodChoice.fkhu[48] = -6072471900027724068L;
        gm$FoodChoice.fkhu[49] = -7021612420143895030L;
        gm$FoodChoice.fkhu[50] = -6399642834906123202L;
        gm$FoodChoice.fkhu[51] = 8778814876124343759L;
        gm$FoodChoice.fkhu[52] = -650294700113063805L;
        gm$FoodChoice.fkhu[53] = 1462058253665533294L;
        gm$FoodChoice.fkhu[54] = -1922931902680155583L;
        gm$FoodChoice.fkhu[55] = 5920362387764532944L;
        gm$FoodChoice.fkhu[56] = 6863765631749868190L;
        gm$FoodChoice.fkhu[57] = -273260516974444623L;
        gm$FoodChoice.fkhu[58] = 2966001570947293073L;
        gm$FoodChoice.fkhu[59] = -3690133659319843951L;
        gm$FoodChoice.fkhu[60] = 1097509474887145992L;
        gm$FoodChoice.fkhu[61] = -7333205562249238971L;
        gm$FoodChoice.fkhu[62] = -1667838508574550737L;
        gm$FoodChoice.fkhu[63] = -3004848661097058629L;
        gm$FoodChoice.fkhu[64] = 7984321140558113327L;
        gm$FoodChoice.fkhu[65] = -1088985754983594290L;
    }

    private static /* synthetic */ void fkne() {
        gm$FoodChoice.fkhm[0] = -1295557383;
        gm$FoodChoice.fkhm[1] = 392785381;
        gm$FoodChoice.fkhm[2] = 539087677;
        gm$FoodChoice.fkhm[3] = 1453706544;
        gm$FoodChoice.fkhm[4] = 2029576210;
        gm$FoodChoice.fkhm[5] = -1653140089;
        gm$FoodChoice.fkhm[6] = -1518373872;
        gm$FoodChoice.fkhm[7] = -89140745;
        gm$FoodChoice.fkhm[8] = 101823524;
        gm$FoodChoice.fkhm[9] = 951777212;
        gm$FoodChoice.fkhm[10] = 1283749463;
        gm$FoodChoice.fkhm[11] = -845495860;
        gm$FoodChoice.fkhm[12] = 2016638054;
        gm$FoodChoice.fkhm[13] = 1055272141;
        gm$FoodChoice.fkhm[14] = 2050516741;
        gm$FoodChoice.fkhm[15] = -1828685891;
        gm$FoodChoice.fkhm[16] = -1161273281;
        gm$FoodChoice.fkhm[17] = 955598570;
        gm$FoodChoice.fkhm[18] = -1748612300;
        gm$FoodChoice.fkhm[19] = -1209717034;
        gm$FoodChoice.fkhm[20] = 2146261881;
        gm$FoodChoice.fkhm[21] = 993483540;
        gm$FoodChoice.fkhm[22] = 1470194381;
        gm$FoodChoice.fkhm[23] = 846841186;
        gm$FoodChoice.fkhm[24] = -861988132;
        gm$FoodChoice.fkhm[25] = -51466692;
        gm$FoodChoice.fkhm[26] = -1111813518;
        gm$FoodChoice.fkhm[27] = 1134958242;
        gm$FoodChoice.fkhm[28] = -312520174;
        gm$FoodChoice.fkhm[29] = 216813371;
        gm$FoodChoice.fkhm[30] = -561900477;
        gm$FoodChoice.fkhm[31] = 2123706687;
        gm$FoodChoice.fkhm[32] = -445016355;
        gm$FoodChoice.fkhm[33] = 581332937;
        gm$FoodChoice.fkhm[34] = -1355791808;
        gm$FoodChoice.fkhm[35] = 342575937;
        gm$FoodChoice.fkhm[36] = -1617406513;
        gm$FoodChoice.fkhm[37] = 1952603701;
        gm$FoodChoice.fkhm[38] = -739891272;
        gm$FoodChoice.fkhm[39] = 1124781191;
        gm$FoodChoice.fkhm[40] = -27284892;
        gm$FoodChoice.fkhm[41] = 1530806603;
        gm$FoodChoice.fkhm[42] = 770338490;
        gm$FoodChoice.fkhm[43] = -1742769490;
        gm$FoodChoice.fkhm[44] = 1087750187;
        gm$FoodChoice.fkhm[45] = 573661770;
        gm$FoodChoice.fkhm[46] = 1908743796;
        gm$FoodChoice.fkhm[47] = -917283880;
        gm$FoodChoice.fkhm[48] = 490165154;
        gm$FoodChoice.fkhm[49] = 1471950303;
        gm$FoodChoice.fkhm[50] = 1520046599;
        gm$FoodChoice.fkhm[51] = -1532698877;
        gm$FoodChoice.fkhm[52] = -1806407420;
        gm$FoodChoice.fkhm[53] = 2033930519;
        gm$FoodChoice.fkhm[54] = -702944974;
        gm$FoodChoice.fkhm[55] = 177952181;
        gm$FoodChoice.fkhm[56] = 1772665641;
        gm$FoodChoice.fkhm[57] = -1848108733;
        gm$FoodChoice.fkhm[58] = -1279084630;
        gm$FoodChoice.fkhm[59] = 1549331362;
        gm$FoodChoice.fkhm[60] = 1605459973;
        gm$FoodChoice.fkhm[61] = 1743165190;
        gm$FoodChoice.fkhm[62] = -842320617;
        gm$FoodChoice.fkhm[63] = -1988630388;
        gm$FoodChoice.fkhm[64] = -833816760;
        gm$FoodChoice.fkhm[65] = 1577232023;
        gm$FoodChoice.fkhm[66] = 1365544510;
        gm$FoodChoice.fkhm[67] = 302564198;
        gm$FoodChoice.fkhm[68] = -1011948552;
        gm$FoodChoice.fkhm[69] = 1427497542;
        gm$FoodChoice.fkhm[70] = 626803018;
        gm$FoodChoice.fkhm[71] = -1500381630;
        gm$FoodChoice.fkhm[72] = 1231135669;
        gm$FoodChoice.fkhm[73] = 153123956;
        gm$FoodChoice.fkhm[74] = 1691149912;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public int hotbarSlot() {
        Object object = mk;
        boolean bl2 = true;
        block17: while (true) {
            CallSite callSite;
            if (!bl2 || (bl2 = false) || !true) {
                object = callSite - gm$FoodChoice.fkhn("fkkk", fkht(int ), (int)32);
            }
            switch ((int)object) {
                case -750693498: {
                    break block17;
                }
                case -269068539: {
                    callSite = gm$FoodChoice.fkhn("fkkl", fkht(int ), (int)33);
                    continue block17;
                }
                case 1607513373: {
                    callSite = gm$FoodChoice.fkhn("fkkm", fkht(int ), (int)34);
                    continue block17;
                }
                case 2122921528: {
                    callSite = gm$FoodChoice.fkhn("fkkn", fkht(int ), (int)35);
                    continue block17;
                }
            }
            break;
        }
        boolean bl3 = c;
        Object object2 = mk;
        boolean bl4 = true;
        block18: while (true) {
            CallSite callSite;
            if (!bl4 || (bl4 = false) || !true) {
                object2 = callSite - gm$FoodChoice.fkhn("fkko", fkht(int ), (int)36);
            }
            switch ((int)object2) {
                case -2120971219: {
                    callSite = gm$FoodChoice.fkhn("fkkp", fkht(int ), (int)37);
                    continue block18;
                }
                case -750693498: {
                    break block18;
                }
                case 1799300922: {
                    callSite = gm$FoodChoice.fkhn("fkkq", fkht(int ), (int)38);
                    continue block18;
                }
            }
            break;
        }
        int n2 = b;
        Object object3 = mk;
        boolean bl5 = true;
        block19: while (true) {
            CallSite callSite;
            if (!bl5 || (bl5 = false) || !true) {
                object3 = callSite - gm$FoodChoice.fkhn("fkkr", fkht(int ), (int)39);
            }
            switch ((int)object3) {
                case -1920204788: {
                    callSite = gm$FoodChoice.fkhn("fkks", fkht(int ), (int)40);
                    continue block19;
                }
                case -1567556380: {
                    callSite = gm$FoodChoice.fkhn("fkkt", fkht(int ), (int)41);
                    continue block19;
                }
                case -750693498: {
                    break block19;
                }
                case 1465754066: {
                    callSite = gm$FoodChoice.fkhn("fkku", fkht(int ), (int)42);
                    continue block19;
                }
            }
            break;
        }
        boolean bl6 = a;
        if (bl3) {
            throw null;
        }
        if (bl6) return (int)gm$FoodChoice.fkhn("fkkv", fkhk(int ), (int)39);
        if (bl6) return (int)gm$FoodChoice.fkhn("fkkv", fkhk(int ), (int)39);
        while (true) {
            long l2;
            Object object4;
            if ((object4 = (l2 = mk - gm$FoodChoice.fkhn("fkkw", fkht(int ), (int)43)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (object4 == gm$FoodChoice.fkhn("fkkx", fkhk(int ), (int)40)) {
                return this.hotbarSlot;
            }
            object4 = gm$FoodChoice.fkhn("fkky", fkhk(int ), (int)41);
        }
    }
}

