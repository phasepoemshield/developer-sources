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

record gx$HealthSnapshot(float health, long lastDropAt) {
    public static final boolean a;
    public static final long uh = 5203677076079489844L;
    private static long[] loso;
    private static long[] losp;
    public static final boolean c;
    public static final int b;
    private static int[] losi;
    private final float health;
    private final long lastDropAt;
    private static int[] losh;

    public static /* synthetic */ CallSite losj(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ long losn(int n2) {
        return loso[n2] ^ losp[n2];
    }

    private static /* synthetic */ void lovz() {
        gx$HealthSnapshot.losi[0] = -764048175;
        gx$HealthSnapshot.losi[1] = -1853249144;
        gx$HealthSnapshot.losi[2] = -1737158858;
        gx$HealthSnapshot.losi[3] = 653186662;
        gx$HealthSnapshot.losi[4] = 1412443526;
        gx$HealthSnapshot.losi[5] = -1408921988;
        gx$HealthSnapshot.losi[6] = -259639669;
        gx$HealthSnapshot.losi[7] = -342538898;
        gx$HealthSnapshot.losi[8] = 1119471714;
        gx$HealthSnapshot.losi[9] = -550924012;
        gx$HealthSnapshot.losi[10] = 30562226;
        gx$HealthSnapshot.losi[11] = 1402991050;
        gx$HealthSnapshot.losi[12] = 2024622248;
        gx$HealthSnapshot.losi[13] = -38565470;
        gx$HealthSnapshot.losi[14] = -1433334330;
        gx$HealthSnapshot.losi[15] = 1842262803;
        gx$HealthSnapshot.losi[16] = -1486848754;
        gx$HealthSnapshot.losi[17] = 1572663391;
        gx$HealthSnapshot.losi[18] = 1566999427;
        gx$HealthSnapshot.losi[19] = -106439065;
        gx$HealthSnapshot.losi[20] = -957028185;
        gx$HealthSnapshot.losi[21] = 1788170848;
        gx$HealthSnapshot.losi[22] = -506143009;
        gx$HealthSnapshot.losi[23] = -1209040509;
        gx$HealthSnapshot.losi[24] = -1253422704;
        gx$HealthSnapshot.losi[25] = -608021099;
        gx$HealthSnapshot.losi[26] = 1846768769;
        gx$HealthSnapshot.losi[27] = -1817090475;
        gx$HealthSnapshot.losi[28] = 1453473872;
        gx$HealthSnapshot.losi[29] = 1028297027;
        gx$HealthSnapshot.losi[30] = -2029865024;
        gx$HealthSnapshot.losi[31] = -274853664;
        gx$HealthSnapshot.losi[32] = -1179599361;
        gx$HealthSnapshot.losi[33] = 859146430;
        gx$HealthSnapshot.losi[34] = -1346222153;
        gx$HealthSnapshot.losi[35] = -15244703;
        gx$HealthSnapshot.losi[36] = -1226652105;
        gx$HealthSnapshot.losi[37] = -1271068818;
        gx$HealthSnapshot.losi[38] = 1519064587;
        gx$HealthSnapshot.losi[39] = 441189343;
        gx$HealthSnapshot.losi[40] = 1153335804;
        gx$HealthSnapshot.losi[41] = 198643027;
        gx$HealthSnapshot.losi[42] = -973232682;
        gx$HealthSnapshot.losi[43] = -449467365;
        gx$HealthSnapshot.losi[44] = 2067219676;
        gx$HealthSnapshot.losi[45] = 141887735;
        gx$HealthSnapshot.losi[46] = -676034776;
        gx$HealthSnapshot.losi[47] = 255792276;
        gx$HealthSnapshot.losi[48] = 560178242;
        gx$HealthSnapshot.losi[49] = -1866508747;
        gx$HealthSnapshot.losi[50] = 852396201;
        gx$HealthSnapshot.losi[51] = -1108871303;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public float health() {
        boolean bl2;
        Object object = uh;
        boolean bl3 = true;
        block10: while (true) {
            CallSite callSite;
            if (!bl3 || (bl3 = false) || !true) {
                object = callSite - gx$HealthSnapshot.losj("louo", losn(int ), (int)18);
            }
            switch ((int)object) {
                case -1970144805: {
                    callSite = gx$HealthSnapshot.losj("loup", losn(int ), (int)19);
                    continue block10;
                }
                case -40914124: {
                    break block10;
                }
                case 26502127: {
                    callSite = gx$HealthSnapshot.losj("louq", losn(int ), (int)20);
                    continue block10;
                }
            }
            break;
        }
        boolean bl4 = c;
        Object object2 = uh;
        boolean bl5 = true;
        block11: while (true) {
            CallSite callSite;
            if (!bl5 || (bl5 = false) || !true) {
                object2 = callSite - gx$HealthSnapshot.losj("lour", losn(int ), (int)21);
            }
            switch ((int)object2) {
                case -1429680702: {
                    callSite = gx$HealthSnapshot.losj("lous", losn(int ), (int)22);
                    continue block11;
                }
                case -1411480725: {
                    callSite = gx$HealthSnapshot.losj("lout", losn(int ), (int)23);
                    continue block11;
                }
                case -40914124: {
                    break block11;
                }
            }
            break;
        }
        int n2 = b;
        while (true) {
            long l2;
            Object object3;
            if ((object3 = (l2 = uh - gx$HealthSnapshot.losj("louu", losn(int ), (int)24)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (object3 == gx$HealthSnapshot.losj("louv", losg(int ), (int)35)) {
                bl2 = a;
                if (bl4) {
                    throw null;
                }
                break;
            }
            object3 = gx$HealthSnapshot.losj("louw", losg(int ), (int)36);
        }
        if (bl2) return (float)gx$HealthSnapshot.losj("louy", loux(int ), (int)37);
        if (bl2) return (float)gx$HealthSnapshot.losj("louy", loux(int ), (int)37);
        while (true) {
            long l3;
            Object object4;
            if ((object4 = (l3 = uh - gx$HealthSnapshot.losj("louz", losn(int ), (int)25)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (object4 == gx$HealthSnapshot.losj("lova", losg(int ), (int)38)) {
                return this.health;
            }
            object4 = gx$HealthSnapshot.losj("lovb", losg(int ), (int)39);
        }
    }

    private static /* synthetic */ float loux(int n2) {
        return Float.intBitsToFloat(losh[n2] ^ losi[n2]);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public long lastDropAt() {
        v0 /* !! */  = gx$HealthSnapshot.uh;
        if (true) ** GOTO lbl5
        block17: while (true) {
            v0 /* !! */  = (long)(v1 - gx$HealthSnapshot.losj("lovg", losn(int ), (int)26));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1638732602: {
                    v1 = gx$HealthSnapshot.losj("lovh", losn(int ), (int)27);
                    continue block17;
                }
                case -804298955: {
                    v1 = gx$HealthSnapshot.losj("lovi", losn(int ), (int)28);
                    continue block17;
                }
                case -40914124: {
                    break block17;
                }
                case 1711463261: {
                    v1 = gx$HealthSnapshot.losj("lovj", losn(int ), (int)29);
                    continue block17;
                }
            }
            break;
        }
        var3_1 = gx$HealthSnapshot.c;
        v2 /* !! */  = gx$HealthSnapshot.uh;
        if (true) ** GOTO lbl22
        block18: while (true) {
            v2 /* !! */  = (long)(v3 - gx$HealthSnapshot.losj("lovk", losn(int ), (int)30));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -40914124: {
                    break block18;
                }
                case 1348755741: {
                    v3 = gx$HealthSnapshot.losj("lovl", losn(int ), (int)31);
                    continue block18;
                }
                case 1515484680: {
                    v3 = gx$HealthSnapshot.losj("lovm", losn(int ), (int)32);
                    continue block18;
                }
            }
            break;
        }
        var2_2 /* !! */  = gx$HealthSnapshot.b;
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_0 = gx$HealthSnapshot.uh - gx$HealthSnapshot.losj("lovn", losn(int ), (int)33)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v4 /* !! */  == gx$HealthSnapshot.losj("lovo", losg(int ), (int)44)) break;
            v4 /* !! */  = (long)gx$HealthSnapshot.losj("lovp", losg(int ), (int)45);
        }
        var1_3 = gx$HealthSnapshot.a;
        if (var3_1) {
            throw null;
            return (long)gx$HealthSnapshot.losj("lovq", losn(int ), (int)34);
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** continue;
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = gx$HealthSnapshot.uh - gx$HealthSnapshot.losj("lovr", losn(int ), (int)35)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == gx$HealthSnapshot.losj("lovs", losg(int ), (int)46)) break;
                    v5 /* !! */  = (long)gx$HealthSnapshot.losj("lovt", losg(int ), (int)47);
                }
                return this.lastDropAt;
            }
            case 0: {
                do {
                    var2_2 /* !! */  = (int)gx$HealthSnapshot.losj("lovu", losg(int ), (int)48);
                } while (!var3_1);
                throw null;
            }
lbl59:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)gx$HealthSnapshot.losj("lovv", losg(int ), (int)49);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)gx$HealthSnapshot.losj("lovw", losg(int ), (int)50);
                if (!var3_1) ** GOTO lbl59
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)gx$HealthSnapshot.losj("lovx", losg(int ), (int)51);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ void lovy() {
        gx$HealthSnapshot.losh[0] = -764048173;
        gx$HealthSnapshot.losh[1] = -1853249144;
        gx$HealthSnapshot.losh[2] = -1737158858;
        gx$HealthSnapshot.losh[3] = 653186663;
        gx$HealthSnapshot.losh[4] = 1085696319;
        gx$HealthSnapshot.losh[5] = -1408921987;
        gx$HealthSnapshot.losh[6] = -195756625;
        gx$HealthSnapshot.losh[7] = -342538897;
        gx$HealthSnapshot.losh[8] = 145205425;
        gx$HealthSnapshot.losh[9] = -550924012;
        gx$HealthSnapshot.losh[10] = 30562224;
        gx$HealthSnapshot.losh[11] = 1402991051;
        gx$HealthSnapshot.losh[12] = 2024622248;
        gx$HealthSnapshot.losh[13] = -38565469;
        gx$HealthSnapshot.losh[14] = 1074226269;
        gx$HealthSnapshot.losh[15] = 2112454637;
        gx$HealthSnapshot.losh[16] = -1486848753;
        gx$HealthSnapshot.losh[17] = 968161224;
        gx$HealthSnapshot.losh[18] = 1566999424;
        gx$HealthSnapshot.losh[19] = -106439066;
        gx$HealthSnapshot.losh[20] = -957028185;
        gx$HealthSnapshot.losh[21] = 1788170850;
        gx$HealthSnapshot.losh[22] = -506143010;
        gx$HealthSnapshot.losh[23] = -527196819;
        gx$HealthSnapshot.losh[24] = 1253422703;
        gx$HealthSnapshot.losh[25] = -1886694703;
        gx$HealthSnapshot.losh[26] = 1846768768;
        gx$HealthSnapshot.losh[27] = 1707756690;
        gx$HealthSnapshot.losh[28] = 1453473872;
        gx$HealthSnapshot.losh[29] = 1028297026;
        gx$HealthSnapshot.losh[30] = 2112327824;
        gx$HealthSnapshot.losh[31] = -274853664;
        gx$HealthSnapshot.losh[32] = -1179599364;
        gx$HealthSnapshot.losh[33] = 859146429;
        gx$HealthSnapshot.losh[34] = -1346222156;
        gx$HealthSnapshot.losh[35] = -15244704;
        gx$HealthSnapshot.losh[36] = -1668314849;
        gx$HealthSnapshot.losh[37] = -1957769272;
        gx$HealthSnapshot.losh[38] = 1519064586;
        gx$HealthSnapshot.losh[39] = -1866552282;
        gx$HealthSnapshot.losh[40] = 1153335806;
        gx$HealthSnapshot.losh[41] = 198643025;
        gx$HealthSnapshot.losh[42] = -973232681;
        gx$HealthSnapshot.losh[43] = -449467368;
        gx$HealthSnapshot.losh[44] = 2067219677;
        gx$HealthSnapshot.losh[45] = 1656664694;
        gx$HealthSnapshot.losh[46] = -676034775;
        gx$HealthSnapshot.losh[47] = -2067676564;
        gx$HealthSnapshot.losh[48] = 560178243;
        gx$HealthSnapshot.losh[49] = -1866508748;
        gx$HealthSnapshot.losh[50] = 852396200;
        gx$HealthSnapshot.losh[51] = -1108871303;
    }

    static {
        losh = new int[52];
        losi = new int[52];
        gx$HealthSnapshot.lovy();
        gx$HealthSnapshot.lovz();
        loso = new long[36];
        losp = new long[36];
        gx$HealthSnapshot.lowa();
        gx$HealthSnapshot.lowb();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final boolean equals(Object var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = gx$HealthSnapshot.uh - gx$HealthSnapshot.losj("lotx", losn(int ), (int)14)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == gx$HealthSnapshot.losj("loty", losg(int ), (int)22)) break;
            v0 /* !! */  = (long)gx$HealthSnapshot.losj("lotz", losg(int ), (int)23);
        }
        var4_2 = gx$HealthSnapshot.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = gx$HealthSnapshot.uh - gx$HealthSnapshot.losj("loua", losn(int ), (int)15)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == gx$HealthSnapshot.losj("loub", losg(int ), (int)24)) break;
            v1 /* !! */  = (long)gx$HealthSnapshot.losj("louc", losg(int ), (int)25);
        }
        var3_3 /* !! */  = gx$HealthSnapshot.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = gx$HealthSnapshot.uh - gx$HealthSnapshot.losj("loud", losn(int ), (int)16)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == gx$HealthSnapshot.losj("loue", losg(int ), (int)26)) break;
            v2 /* !! */  = (long)gx$HealthSnapshot.losj("louf", losg(int ), (int)27);
        }
        var2_4 = gx$HealthSnapshot.a;
        if (var4_2) {
            throw null;
lbl24:
            // 2 sources

            return (boolean)gx$HealthSnapshot.losj("loug", losg(int ), (int)28);
        }
        if (var2_4) ** GOTO lbl24
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** continue;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_3 = gx$HealthSnapshot.uh - gx$HealthSnapshot.losj("louh", losn(int ), (int)17)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == gx$HealthSnapshot.losj("loui", losg(int ), (int)29)) break;
                    v3 /* !! */  = (long)gx$HealthSnapshot.losj("louj", losg(int ), (int)30);
                }
                return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{gx$HealthSnapshot.class, "health;lastDropAt", "health", "lastDropAt"}, this, var1_1);
            }
            case 0: {
                var3_3 /* !! */  = (int)gx$HealthSnapshot.losj("louk", losg(int ), (int)31);
                if (!var4_2) break;
                throw null;
            }
lbl42:
            // 2 sources

            case 1: {
                do {
                    var3_3 /* !! */  = (int)gx$HealthSnapshot.losj("loul", losg(int ), (int)32);
                } while (!var4_2);
                throw null;
            }
            case 2: {
                var3_3 /* !! */  = (int)gx$HealthSnapshot.losj("loum", losg(int ), (int)33);
                if (!var4_2) ** GOTO lbl42
                throw null;
            }
            case 3: 
        }
        do {
            var3_3 /* !! */  = (int)gx$HealthSnapshot.losj("loun", losg(int ), (int)34);
        } while (!var4_2);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private gx$HealthSnapshot(float var1_1, long var2_2) {
        var5_3 /* !! */  = gx$HealthSnapshot.b;
        super();
        this.health = var1_1;
        this.lastDropAt = var2_2;
        if (var5_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                return;
            }
lbl9:
            // 2 sources

            case 0: {
                var5_3 /* !! */  = (int)gx$HealthSnapshot.losj("losk", losg(int ), (int)0);
                break;
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_3 /* !! */  = (int)gx$HealthSnapshot.losj("losl", losg(int ), (int)1);
                    ** GOTO lbl9
                    break;
                }
            }
            case 2: 
        }
        var5_3 /* !! */  = (int)gx$HealthSnapshot.losj("losm", losg(int ), (int)2);
        ** while (true)
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final String toString() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = gx$HealthSnapshot.uh - gx$HealthSnapshot.losj("losq", losn(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == gx$HealthSnapshot.losj("losr", losg(int ), (int)3)) break;
            v0 /* !! */  = (long)gx$HealthSnapshot.losj("loss", losg(int ), (int)4);
        }
        var3_1 = gx$HealthSnapshot.c;
        v1 /* !! */  = gx$HealthSnapshot.uh;
        if (true) ** GOTO lbl12
        block12: while (true) {
            v1 /* !! */  = (long)(v2 - gx$HealthSnapshot.losj("lost", losn(int ), (int)1));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -40914124: {
                    break block12;
                }
                case 227017191: {
                    v2 = gx$HealthSnapshot.losj("losu", losn(int ), (int)2);
                    continue block12;
                }
                case 1677517347: {
                    v2 = gx$HealthSnapshot.losj("losv", losn(int ), (int)3);
                    continue block12;
                }
            }
            break;
        }
        var2_2 /* !! */  = gx$HealthSnapshot.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = gx$HealthSnapshot.uh - gx$HealthSnapshot.losj("losw", losn(int ), (int)4)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == gx$HealthSnapshot.losj("losx", losg(int ), (int)5)) break;
            v3 /* !! */  = (long)gx$HealthSnapshot.losj("losy", losg(int ), (int)6);
        }
        var1_3 = gx$HealthSnapshot.a;
        if (var3_1) {
            throw null;
lbl31:
            // 2 sources

            return null;
        }
        if (var1_3) ** GOTO lbl31
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = gx$HealthSnapshot.uh - gx$HealthSnapshot.losj("losz", losn(int ), (int)5)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == gx$HealthSnapshot.losj("lota", losg(int ), (int)7)) break;
                    v4 /* !! */  = (long)gx$HealthSnapshot.losj("lotb", losg(int ), (int)8);
                }
                return ObjectMethods.bootstrap("toString", new MethodHandle[]{gx$HealthSnapshot.class, "health;lastDropAt", "health", "lastDropAt"}, this);
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)gx$HealthSnapshot.losj("lotc", losg(int ), (int)9);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
lbl50:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)gx$HealthSnapshot.losj("lotd", losg(int ), (int)10);
                if (!var3_1) break;
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)gx$HealthSnapshot.losj("lote", losg(int ), (int)11);
                if (!var3_1) ** GOTO lbl50
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)gx$HealthSnapshot.losj("lotf", losg(int ), (int)12);
        ** while (!var3_1)
lbl61:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final int hashCode() {
        v0 /* !! */  = gx$HealthSnapshot.uh;
        if (true) ** GOTO lbl5
        block16: while (true) {
            v0 /* !! */  = (long)(v1 - gx$HealthSnapshot.losj("lotg", losn(int ), (int)6));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1119068955: {
                    v1 = gx$HealthSnapshot.losj("loth", losn(int ), (int)7);
                    continue block16;
                }
                case -582711033: {
                    v1 = gx$HealthSnapshot.losj("loti", losn(int ), (int)8);
                    continue block16;
                }
                case -40914124: {
                    break block16;
                }
            }
            break;
        }
        var3_1 = gx$HealthSnapshot.c;
        v2 /* !! */  = gx$HealthSnapshot.uh;
        if (true) ** GOTO lbl19
        block17: while (true) {
            v2 /* !! */  = (long)(v3 - gx$HealthSnapshot.losj("lotj", losn(int ), (int)9));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1730635137: {
                    v3 = gx$HealthSnapshot.losj("lotk", losn(int ), (int)10);
                    continue block17;
                }
                case -40914124: {
                    break block17;
                }
                case 426092722: {
                    v3 = gx$HealthSnapshot.losj("lotl", losn(int ), (int)11);
                    continue block17;
                }
            }
            break;
        }
        var2_2 /* !! */  = gx$HealthSnapshot.b;
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_0 = gx$HealthSnapshot.uh - gx$HealthSnapshot.losj("lotm", losn(int ), (int)12)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v4 /* !! */  == gx$HealthSnapshot.losj("lotn", losg(int ), (int)13)) break;
            v4 /* !! */  = (long)gx$HealthSnapshot.losj("loto", losg(int ), (int)14);
        }
        var1_3 = gx$HealthSnapshot.a;
        if (var3_1) {
            throw null;
lbl38:
            // 2 sources

            return (int)gx$HealthSnapshot.losj("lotp", losg(int ), (int)15);
        }
        if (var1_3) ** GOTO lbl38
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = gx$HealthSnapshot.uh - gx$HealthSnapshot.losj("lotq", losn(int ), (int)13)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == gx$HealthSnapshot.losj("lotr", losg(int ), (int)16)) break;
                    v5 /* !! */  = (long)gx$HealthSnapshot.losj("lots", losg(int ), (int)17);
                }
                return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{gx$HealthSnapshot.class, "health;lastDropAt", "health", "lastDropAt"}, this);
            }
lbl52:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)gx$HealthSnapshot.losj("lott", losg(int ), (int)18);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)gx$HealthSnapshot.losj("lotu", losg(int ), (int)19);
                if (!var3_1) break;
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)gx$HealthSnapshot.losj("lotv", losg(int ), (int)20);
                if (!var3_1) ** GOTO lbl52
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)gx$HealthSnapshot.losj("lotw", losg(int ), (int)21);
        ** while (!var3_1)
lbl68:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void lowa() {
        gx$HealthSnapshot.loso[0] = -4332275623160742554L;
        gx$HealthSnapshot.loso[1] = 7065414903619068194L;
        gx$HealthSnapshot.loso[2] = 5131109718201312306L;
        gx$HealthSnapshot.loso[3] = -8762788090676433894L;
        gx$HealthSnapshot.loso[4] = 3918273066052288220L;
        gx$HealthSnapshot.loso[5] = -5166757870987316741L;
        gx$HealthSnapshot.loso[6] = -5642418471898494602L;
        gx$HealthSnapshot.loso[7] = 2599676834811245353L;
        gx$HealthSnapshot.loso[8] = 514230116642225849L;
        gx$HealthSnapshot.loso[9] = -2701880957881514552L;
        gx$HealthSnapshot.loso[10] = -2813242721732326162L;
        gx$HealthSnapshot.loso[11] = -6956080791774400647L;
        gx$HealthSnapshot.loso[12] = -5727474016813040387L;
        gx$HealthSnapshot.loso[13] = -173639240756197318L;
        gx$HealthSnapshot.loso[14] = 7759902662431412528L;
        gx$HealthSnapshot.loso[15] = -5563186245978852953L;
        gx$HealthSnapshot.loso[16] = -4524185327386256463L;
        gx$HealthSnapshot.loso[17] = 5468735885121711551L;
        gx$HealthSnapshot.loso[18] = -717659203636871187L;
        gx$HealthSnapshot.loso[19] = -4795791405277626029L;
        gx$HealthSnapshot.loso[20] = -780663441515718352L;
        gx$HealthSnapshot.loso[21] = 113298022555490969L;
        gx$HealthSnapshot.loso[22] = 3508006763987269155L;
        gx$HealthSnapshot.loso[23] = -6795022462623206082L;
        gx$HealthSnapshot.loso[24] = -2360773418252201893L;
        gx$HealthSnapshot.loso[25] = -6098114159131470238L;
        gx$HealthSnapshot.loso[26] = 6580320290457989011L;
        gx$HealthSnapshot.loso[27] = -2192600032126903740L;
        gx$HealthSnapshot.loso[28] = -6562185698252719293L;
        gx$HealthSnapshot.loso[29] = 144359679512325999L;
        gx$HealthSnapshot.loso[30] = -1106452360814926375L;
        gx$HealthSnapshot.loso[31] = 3756801659330447195L;
        gx$HealthSnapshot.loso[32] = 2019604632749913408L;
        gx$HealthSnapshot.loso[33] = -3749082910055656473L;
        gx$HealthSnapshot.loso[34] = -7281573499171234193L;
        gx$HealthSnapshot.loso[35] = -7726322668598045507L;
    }

    private static /* synthetic */ void lowb() {
        gx$HealthSnapshot.losp[0] = 1318993370143251939L;
        gx$HealthSnapshot.losp[1] = -1777791792891967051L;
        gx$HealthSnapshot.losp[2] = -3937743420803901826L;
        gx$HealthSnapshot.losp[3] = -9202996687228368981L;
        gx$HealthSnapshot.losp[4] = -3183315306377548235L;
        gx$HealthSnapshot.losp[5] = 2365486493472626315L;
        gx$HealthSnapshot.losp[6] = 399473019348913392L;
        gx$HealthSnapshot.losp[7] = 3133606327061536930L;
        gx$HealthSnapshot.losp[8] = -8266515038543193694L;
        gx$HealthSnapshot.losp[9] = 3447665768486092295L;
        gx$HealthSnapshot.losp[10] = -2392850717370766717L;
        gx$HealthSnapshot.losp[11] = -2589692508074524698L;
        gx$HealthSnapshot.losp[12] = -5157833150011799762L;
        gx$HealthSnapshot.losp[13] = 2501740662031160402L;
        gx$HealthSnapshot.losp[14] = -2754081022179134484L;
        gx$HealthSnapshot.losp[15] = -108088238963982024L;
        gx$HealthSnapshot.losp[16] = 3513025660373156962L;
        gx$HealthSnapshot.losp[17] = -7695207051526171125L;
        gx$HealthSnapshot.losp[18] = -7425923754623545657L;
        gx$HealthSnapshot.losp[19] = -8726638739652414683L;
        gx$HealthSnapshot.losp[20] = -7767402037184469814L;
        gx$HealthSnapshot.losp[21] = -6379267250788240188L;
        gx$HealthSnapshot.losp[22] = -9057735907840176107L;
        gx$HealthSnapshot.losp[23] = -8612999690096768169L;
        gx$HealthSnapshot.losp[24] = -1267227478403808201L;
        gx$HealthSnapshot.losp[25] = 838974010506443431L;
        gx$HealthSnapshot.losp[26] = -5318651220301367838L;
        gx$HealthSnapshot.losp[27] = -378091031627782500L;
        gx$HealthSnapshot.losp[28] = 153815864715414091L;
        gx$HealthSnapshot.losp[29] = -5098139747688934887L;
        gx$HealthSnapshot.losp[30] = -6728927876528684720L;
        gx$HealthSnapshot.losp[31] = -3369129491132480010L;
        gx$HealthSnapshot.losp[32] = -2073865406200288746L;
        gx$HealthSnapshot.losp[33] = 833316286965065213L;
        gx$HealthSnapshot.losp[34] = -8567247113480585906L;
        gx$HealthSnapshot.losp[35] = -4970697520703394409L;
    }

    private static /* synthetic */ int losg(int n2) {
        return losh[n2] ^ losi[n2];
    }
}

