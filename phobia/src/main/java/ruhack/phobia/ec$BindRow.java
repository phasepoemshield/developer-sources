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

record ec$BindRow(String name, String key, String icon) {
    public static final boolean a;
    private final String name;
    private static long[] jfho;
    private static final long rg = -999345598797174026L;
    private static int[] jfhg;
    public static final boolean c;
    private final String key;
    private final String icon;
    public static final int b;
    private static int[] jfhh;
    private static long[] jfhp;

    private static /* synthetic */ long jfhn(int n2) {
        return jfho[n2] ^ jfhp[n2];
    }

    private static /* synthetic */ void jflu() {
        ec$BindRow.jfho[0] = -1827760785390967430L;
        ec$BindRow.jfho[1] = 4944018047212989965L;
        ec$BindRow.jfho[2] = 2696888835133147416L;
        ec$BindRow.jfho[3] = 452005814578469235L;
        ec$BindRow.jfho[4] = 2162469114370223124L;
        ec$BindRow.jfho[5] = -392215010258193222L;
        ec$BindRow.jfho[6] = 3804503155199187724L;
        ec$BindRow.jfho[7] = 8671935554631501718L;
        ec$BindRow.jfho[8] = 6990868844170261134L;
        ec$BindRow.jfho[9] = 4534702894575494623L;
        ec$BindRow.jfho[10] = 7695665458191810588L;
        ec$BindRow.jfho[11] = -5800807376205691323L;
        ec$BindRow.jfho[12] = -3399193210566834759L;
        ec$BindRow.jfho[13] = 2359335891984048365L;
        ec$BindRow.jfho[14] = 7092809042410154333L;
        ec$BindRow.jfho[15] = -7388143180371031323L;
        ec$BindRow.jfho[16] = -3913075279108557326L;
        ec$BindRow.jfho[17] = 7117356934074946123L;
        ec$BindRow.jfho[18] = -651669737211757555L;
        ec$BindRow.jfho[19] = -2594916414240704763L;
        ec$BindRow.jfho[20] = -2022315698535269245L;
        ec$BindRow.jfho[21] = 2688570382272929120L;
        ec$BindRow.jfho[22] = -7610482250037286670L;
        ec$BindRow.jfho[23] = 2583648855223143660L;
        ec$BindRow.jfho[24] = -4800147804683974598L;
        ec$BindRow.jfho[25] = 4369668317899193856L;
        ec$BindRow.jfho[26] = 1243965107588900606L;
        ec$BindRow.jfho[27] = 7964725893246302908L;
        ec$BindRow.jfho[28] = -8398685112607450982L;
        ec$BindRow.jfho[29] = -8944277020288007835L;
        ec$BindRow.jfho[30] = -6709195957532782902L;
        ec$BindRow.jfho[31] = 7491434006882584494L;
        ec$BindRow.jfho[32] = -2414553982560149847L;
        ec$BindRow.jfho[33] = 4855804816924144891L;
        ec$BindRow.jfho[34] = -9073393167584140894L;
        ec$BindRow.jfho[35] = -5648006581320009408L;
        ec$BindRow.jfho[36] = 4458757217075435689L;
        ec$BindRow.jfho[37] = -7400449039427407657L;
        ec$BindRow.jfho[38] = -7327191153825449227L;
        ec$BindRow.jfho[39] = 2079137822060096909L;
        ec$BindRow.jfho[40] = 2305004241056520941L;
        ec$BindRow.jfho[41] = 8923609493377850057L;
        ec$BindRow.jfho[42] = 5093520339623766709L;
        ec$BindRow.jfho[43] = -6357812424899940527L;
        ec$BindRow.jfho[44] = 415741953646426049L;
        ec$BindRow.jfho[45] = 780495255521946511L;
        ec$BindRow.jfho[46] = -5368783785831512117L;
        ec$BindRow.jfho[47] = 1561989322083412517L;
        ec$BindRow.jfho[48] = -3282833578979354209L;
        ec$BindRow.jfho[49] = -8350605640792311900L;
        ec$BindRow.jfho[50] = 6652401701943977739L;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final String toString() {
        boolean bl2;
        Object object = rg;
        block4: while (true) {
            switch ((int)object) {
                case -467491499: {
                    object = ec$BindRow.jfhi("jfhr", jfhn(int ), (int)1) - ec$BindRow.jfhi("jfhq", jfhn(int ), (int)0);
                    continue block4;
                }
                case -2610442: {
                    break block4;
                }
            }
            break;
        }
        boolean bl3 = c;
        while (true) {
            long l2;
            Object object2;
            if ((object2 = (l2 = rg - ec$BindRow.jfhi("jfhs", jfhn(int ), (int)2)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object2 == ec$BindRow.jfhi("jfht", jfhf(int ), (int)4)) break;
            object2 = ec$BindRow.jfhi("jfhu", jfhf(int ), (int)5);
        }
        int n2 = b;
        while (true) {
            long l3;
            Object object3;
            if ((object3 = (l3 = rg - ec$BindRow.jfhi("jfhv", jfhn(int ), (int)3)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object3 == ec$BindRow.jfhi("jfhw", jfhf(int ), (int)6)) {
                bl2 = a;
                if (bl3) {
                    throw null;
                }
                break;
            }
            object3 = ec$BindRow.jfhi("jfhx", jfhf(int ), (int)7);
        }
        if (bl2) return null;
        if (bl2) return null;
        while (true) {
            long l4;
            Object object4;
            if ((object4 = (l4 = rg - ec$BindRow.jfhi("jfhy", jfhn(int ), (int)4)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            if (object4 == ec$BindRow.jfhi("jfhz", jfhf(int ), (int)8)) {
                return ObjectMethods.bootstrap("toString", new MethodHandle[]{ec$BindRow.class, "name;key;icon", "name", "key", "icon"}, this);
            }
            object4 = ec$BindRow.jfhi("jfia", jfhf(int ), (int)9);
        }
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public final boolean equals(Object object) {
        boolean bl2;
        Object object2 = rg;
        boolean bl3 = true;
        block12: while (true) {
            CallSite callSite;
            if (!bl3 || (bl3 = false) || !true) {
                object2 = callSite - ec$BindRow.jfhi("jfiz", jfhn(int ), (int)10);
            }
            switch ((int)object2) {
                case -671429796: {
                    callSite = ec$BindRow.jfhi("jfja", jfhn(int ), (int)11);
                    continue block12;
                }
                case -2610442: {
                    break block12;
                }
                case 547796757: {
                    callSite = ec$BindRow.jfhi("jfjb", jfhn(int ), (int)12);
                    continue block12;
                }
                case 1291652682: {
                    callSite = ec$BindRow.jfhi("jfjc", jfhn(int ), (int)13);
                    continue block12;
                }
            }
            break;
        }
        boolean bl4 = c;
        while (true) {
            long l2;
            Object object3;
            if ((object3 = (l2 = rg - ec$BindRow.jfhi("jfje", jfhn(int ), (int)14)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object3 == ec$BindRow.jfhi("jfjf", jfhf(int ), (int)25)) break;
            object3 = ec$BindRow.jfhi("jfjg", jfhf(int ), (int)26);
        }
        int n2 = b;
        while (true) {
            long l3;
            Object object4;
            if ((object4 = (l3 = rg - ec$BindRow.jfhi("jfjh", jfhn(int ), (int)15)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object4 == ec$BindRow.jfhi("jfji", jfhf(int ), (int)27)) {
                bl2 = a;
                if (bl4) {
                    throw null;
                }
                break;
            }
            object4 = ec$BindRow.jfhi("jfjj", jfhf(int ), (int)28);
        }
        if (bl2) return (boolean)ec$BindRow.jfhi("jfjk", jfhf(int ), (int)29);
        if (bl2) return (boolean)ec$BindRow.jfhi("jfjk", jfhf(int ), (int)29);
        Object object5 = rg;
        boolean bl5 = true;
        block15: while (true) {
            CallSite callSite;
            if (!bl5 || (bl5 = false) || !true) {
                object5 = callSite - ec$BindRow.jfhi("jfjl", jfhn(int ), (int)16);
            }
            switch ((int)object5) {
                case -1626304294: {
                    callSite = ec$BindRow.jfhi("jfjm", jfhn(int ), (int)17);
                    continue block15;
                }
                case -294871461: {
                    callSite = ec$BindRow.jfhi("jfjn", jfhn(int ), (int)18);
                    continue block15;
                }
                case -209227730: {
                    callSite = ec$BindRow.jfhi("jfjo", jfhn(int ), (int)19);
                    continue block15;
                }
                case -2610442: {
                    return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ec$BindRow.class, "name;key;icon", "name", "key", "icon"}, this, object);
                }
            }
            break;
        }
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ec$BindRow.class, "name;key;icon", "name", "key", "icon"}, this, object);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private ec$BindRow(String var1_1, String var2_2, String var3_3) {
        var5_4 /* !! */  = ec$BindRow.b;
        super();
        this.name = var1_1;
        this.key = var2_2;
        this.icon = var3_3;
        if (var5_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                return;
            }
lbl10:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_4 /* !! */  = (int)ec$BindRow.jfhi("jfhj", jfhf(int ), (int)0);
                    ** GOTO lbl16
                    break;
                }
            }
            case 1: {
                var5_4 /* !! */  = (int)ec$BindRow.jfhi("jfhk", jfhf(int ), (int)1);
            }
lbl16:
            // 3 sources

            case 2: {
                var5_4 /* !! */  = (int)ec$BindRow.jfhi("jfhl", jfhf(int ), (int)2);
                ** GOTO lbl10
            }
            case 3: 
        }
        var5_4 /* !! */  = (int)ec$BindRow.jfhi("jfhm", jfhf(int ), (int)3);
        ** while (true)
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final int hashCode() {
        v0 /* !! */  = ec$BindRow.rg;
        if (true) ** GOTO lbl5
        block10: while (true) {
            v0 /* !! */  = (long)(ec$BindRow.jfhi("jfii", jfhn(int ), (int)6) - ec$BindRow.jfhi("jfih", jfhn(int ), (int)5));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1369104999: {
                    continue block10;
                }
                case -2610442: {
                    break block10;
                }
            }
            break;
        }
        var3_1 = ec$BindRow.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = ec$BindRow.rg - ec$BindRow.jfhi("jfij", jfhn(int ), (int)7)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == ec$BindRow.jfhi("jfik", jfhf(int ), (int)14)) break;
            v1 /* !! */  = (long)ec$BindRow.jfhi("jfil", jfhf(int ), (int)15);
        }
        var2_2 /* !! */  = ec$BindRow.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = ec$BindRow.rg - ec$BindRow.jfhi("jfim", jfhn(int ), (int)8)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == ec$BindRow.jfhi("jfin", jfhf(int ), (int)16)) break;
            v2 /* !! */  = (long)ec$BindRow.jfhi("jfio", jfhf(int ), (int)17);
        }
        var1_3 = ec$BindRow.a;
        if (var3_1) {
            throw null;
            return (int)ec$BindRow.jfhi("jfiq", jfhf(int ), (int)18);
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block4 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** continue;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = ec$BindRow.rg - ec$BindRow.jfhi("jfir", jfhn(int ), (int)9)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == ec$BindRow.jfhi("jfit", jfhf(int ), (int)19)) break;
                    v3 /* !! */  = (long)ec$BindRow.jfhi("jfiu", jfhf(int ), (int)20);
                }
                return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ec$BindRow.class, "name;key;icon", "name", "key", "icon"}, this);
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ec$BindRow.jfhi("jfiv", jfhf(int ), (int)21);
                    if (!var3_1) break block4;
                    throw null;
                }
            }
            case 1: {
                do {
                    var2_2 /* !! */  = (int)ec$BindRow.jfhi("jfiw", jfhf(int ), (int)22);
                } while (!var3_1);
                throw null;
            }
            case 2: {
                do {
                    var2_2 /* !! */  = (int)ec$BindRow.jfhi("jfix", jfhf(int ), (int)23);
                } while (!var3_1);
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)ec$BindRow.jfhi("jfiy", jfhf(int ), (int)24);
        ** while (!var3_1)
lbl58:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ int jfhf(int n2) {
        return jfhg[n2] ^ jfhh[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public String key() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ec$BindRow.rg - ec$BindRow.jfhi("jfkm", jfhn(int ), (int)33)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ec$BindRow.jfhi("jfkn", jfhf(int ), (int)40)) break;
            v0 /* !! */  = (long)ec$BindRow.jfhi("jfko", jfhf(int ), (int)41);
        }
        var3_1 = ec$BindRow.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ec$BindRow.rg - ec$BindRow.jfhi("jfkp", jfhn(int ), (int)34)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == ec$BindRow.jfhi("jfkq", jfhf(int ), (int)42)) break;
            v1 /* !! */  = (long)ec$BindRow.jfhi("jfkr", jfhf(int ), (int)43);
        }
        var2_2 /* !! */  = ec$BindRow.b;
        v2 /* !! */  = ec$BindRow.rg;
        if (true) ** GOTO lbl19
        block17: while (true) {
            v2 /* !! */  = (long)(v3 - ec$BindRow.jfhi("jfks", jfhn(int ), (int)35));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1018526823: {
                    v3 = ec$BindRow.jfhi("jfkt", jfhn(int ), (int)36);
                    continue block17;
                }
                case -2610442: {
                    break block17;
                }
                case 1555978816: {
                    v3 = ec$BindRow.jfhi("jfku", jfhn(int ), (int)37);
                    continue block17;
                }
            }
            break;
        }
        var1_3 = ec$BindRow.a;
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
                v4 /* !! */  = ec$BindRow.rg;
                if (true) ** GOTO lbl42
                block19: while (true) {
                    v4 /* !! */  = (long)(ec$BindRow.jfhi("jfkw", jfhn(int ), (int)39) - ec$BindRow.jfhi("jfkv", jfhn(int ), (int)38));
lbl42:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1963816490: {
                            continue block19;
                        }
                        case -2610442: {
                            break block19;
                        }
                    }
                    break;
                }
                return this.key;
            }
            case 0: {
                var2_2 /* !! */  = (int)ec$BindRow.jfhi("jfkx", jfhf(int ), (int)44);
                if (!var3_1) break;
                throw null;
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)ec$BindRow.jfhi("jfky", jfhf(int ), (int)45);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 2: {
                do {
                    var2_2 /* !! */  = (int)ec$BindRow.jfhi("jfkz", jfhf(int ), (int)46);
                } while (!var3_1);
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)ec$BindRow.jfhi("jfla", jfhf(int ), (int)47);
        ** while (!var3_1)
lbl65:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public String name() {
        v0 /* !! */  = ec$BindRow.rg;
        if (true) ** GOTO lbl5
        block24: while (true) {
            v0 /* !! */  = (long)(v1 - ec$BindRow.jfhi("jfjt", jfhn(int ), (int)20));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -707135282: {
                    v1 = ec$BindRow.jfhi("jfju", jfhn(int ), (int)21);
                    continue block24;
                }
                case -2610442: {
                    break block24;
                }
                case 1276072783: {
                    v1 = ec$BindRow.jfhi("jfjv", jfhn(int ), (int)22);
                    continue block24;
                }
                case 1993335451: {
                    v1 = ec$BindRow.jfhi("jfjw", jfhn(int ), (int)23);
                    continue block24;
                }
            }
            break;
        }
        var3_1 = ec$BindRow.c;
        v2 /* !! */  = ec$BindRow.rg;
        if (true) ** GOTO lbl22
        block25: while (true) {
            v2 /* !! */  = (long)(v3 - ec$BindRow.jfhi("jfjx", jfhn(int ), (int)24));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1536609975: {
                    v3 = ec$BindRow.jfhi("jfjy", jfhn(int ), (int)25);
                    continue block25;
                }
                case -130051108: {
                    v3 = ec$BindRow.jfhi("jfjz", jfhn(int ), (int)26);
                    continue block25;
                }
                case -2610442: {
                    break block25;
                }
                case 1793271083: {
                    v3 = ec$BindRow.jfhi("jfka", jfhn(int ), (int)27);
                    continue block25;
                }
            }
            break;
        }
        var2_2 /* !! */  = ec$BindRow.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v4 /* !! */  = ec$BindRow.rg;
                block26: while (true) {
                    switch ((int)v4 /* !! */ ) {
                        case -2118808463: {
                            v5 = ec$BindRow.jfhi("jfkc", jfhn(int ), (int)29);
                            ** GOTO lbl49
                        }
                        case -860882404: {
                            v5 = ec$BindRow.jfhi("jfkd", jfhn(int ), (int)30);
                            ** GOTO lbl49
                        }
                        case -46037830: {
                            v5 = ec$BindRow.jfhi("jfke", jfhn(int ), (int)31);
lbl49:
                            // 3 sources

                            v4 /* !! */  = (long)(v5 - ec$BindRow.jfhi("jfkb", jfhn(int ), (int)28));
                            continue block26;
                        }
                        case -2610442: {
                            break block26;
                        }
                    }
                    break;
                }
                var1_3 = ec$BindRow.a;
                if (var3_1) {
                    throw null;
                }
                if (var1_3 != false) return null;
                if (var1_3 != false) return null;
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_0 = ec$BindRow.rg - ec$BindRow.jfhi("jfkf", jfhn(int ), (int)32)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v6 /* !! */  == ec$BindRow.jfhi("jfkg", jfhf(int ), (int)34)) {
                        return this.name;
                    }
                    v6 /* !! */  = (long)ec$BindRow.jfhi("jfkh", jfhf(int ), (int)35);
                }
            }
            case 1: {
                ** GOTO lbl71
            }
            case 3: {
                var2_2 /* !! */  = (int)ec$BindRow.jfhi("jfkl", jfhf(int ), (int)39);
                if (var3_1) {
                    throw null;
                }
lbl71:
                // 3 sources

                var2_2 /* !! */  = (int)ec$BindRow.jfhi("jfkj", jfhf(int ), (int)37);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)ec$BindRow.jfhi("jfkk", jfhf(int ), (int)38);
                if (var3_1) {
                    throw null;
                }
            }
            case 0: 
        }
        do {
            var2_2 /* !! */  = (int)ec$BindRow.jfhi("jfki", jfhf(int ), (int)36);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ void jfls() {
        ec$BindRow.jfhg[0] = -1608025942;
        ec$BindRow.jfhg[1] = 495731126;
        ec$BindRow.jfhg[2] = 1955053920;
        ec$BindRow.jfhg[3] = 1434074310;
        ec$BindRow.jfhg[4] = 1357351400;
        ec$BindRow.jfhg[5] = -1956019568;
        ec$BindRow.jfhg[6] = -2001602758;
        ec$BindRow.jfhg[7] = -623902373;
        ec$BindRow.jfhg[8] = -665417931;
        ec$BindRow.jfhg[9] = -646140508;
        ec$BindRow.jfhg[10] = 1804596716;
        ec$BindRow.jfhg[11] = -1573620326;
        ec$BindRow.jfhg[12] = 1003730755;
        ec$BindRow.jfhg[13] = 54544829;
        ec$BindRow.jfhg[14] = -427761820;
        ec$BindRow.jfhg[15] = 1426722686;
        ec$BindRow.jfhg[16] = 916701701;
        ec$BindRow.jfhg[17] = 524319537;
        ec$BindRow.jfhg[18] = 351770822;
        ec$BindRow.jfhg[19] = -2075977684;
        ec$BindRow.jfhg[20] = -110594981;
        ec$BindRow.jfhg[21] = 18973875;
        ec$BindRow.jfhg[22] = 1809203012;
        ec$BindRow.jfhg[23] = 1840372329;
        ec$BindRow.jfhg[24] = 1099616370;
        ec$BindRow.jfhg[25] = 5676555;
        ec$BindRow.jfhg[26] = -862211818;
        ec$BindRow.jfhg[27] = 171595559;
        ec$BindRow.jfhg[28] = 377239428;
        ec$BindRow.jfhg[29] = 643157257;
        ec$BindRow.jfhg[30] = 1180174940;
        ec$BindRow.jfhg[31] = -2002139876;
        ec$BindRow.jfhg[32] = -484271886;
        ec$BindRow.jfhg[33] = -533705892;
        ec$BindRow.jfhg[34] = 1916632956;
        ec$BindRow.jfhg[35] = -881163720;
        ec$BindRow.jfhg[36] = -508129698;
        ec$BindRow.jfhg[37] = 1900341011;
        ec$BindRow.jfhg[38] = 143831139;
        ec$BindRow.jfhg[39] = 1948637337;
        ec$BindRow.jfhg[40] = 2129284634;
        ec$BindRow.jfhg[41] = 934806252;
        ec$BindRow.jfhg[42] = -69273330;
        ec$BindRow.jfhg[43] = 20244899;
        ec$BindRow.jfhg[44] = -1147147276;
        ec$BindRow.jfhg[45] = -1129122560;
        ec$BindRow.jfhg[46] = 1971830168;
        ec$BindRow.jfhg[47] = -1237913715;
        ec$BindRow.jfhg[48] = 393073623;
        ec$BindRow.jfhg[49] = 794581245;
        ec$BindRow.jfhg[50] = -1273883254;
        ec$BindRow.jfhg[51] = -1958117434;
        ec$BindRow.jfhg[52] = -1980790076;
        ec$BindRow.jfhg[53] = 351447409;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public String icon() {
        block33: {
            v0 /* !! */  = ec$BindRow.rg;
            if (true) ** GOTO lbl5
            block22: while (true) {
                v0 /* !! */  = (long)(v1 - ec$BindRow.jfhi("jflb", jfhn(int ), (int)40));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -1652082507: {
                        v1 = ec$BindRow.jfhi("jflc", jfhn(int ), (int)41);
                        continue block22;
                    }
                    case -1236368492: {
                        v1 = ec$BindRow.jfhi("jfld", jfhn(int ), (int)42);
                        continue block22;
                    }
                    case -955940288: {
                        v1 = ec$BindRow.jfhi("jfle", jfhn(int ), (int)43);
                        continue block22;
                    }
                    case -2610442: {
                        break block22;
                    }
                }
                break;
            }
            var3_1 = ec$BindRow.c;
            v2 /* !! */  = ec$BindRow.rg;
            block23: while (true) {
                switch ((int)v2 /* !! */ ) {
                    case -1810410337: {
                        v2 /* !! */  = (long)(ec$BindRow.jfhi("jflg", jfhn(int ), (int)45) - ec$BindRow.jfhi("jflf", jfhn(int ), (int)44));
                        continue block23;
                    }
                    case -2610442: {
                        break block23;
                    }
                }
                break;
            }
            var2_2 /* !! */  = ec$BindRow.b;
            while (true) {
                if ((v3 /* !! */  = (cfr_temp_1 = ec$BindRow.rg - ec$BindRow.jfhi("jflh", jfhn(int ), (int)46)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v3 /* !! */  == ec$BindRow.jfhi("jfli", jfhf(int ), (int)48)) {
                    var1_3 = ec$BindRow.a;
                    if (var3_1) {
                        throw null;
                    }
                    break;
                }
                v3 /* !! */  = (long)ec$BindRow.jfhi("jflj", jfhf(int ), (int)49);
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
                        v4 /* !! */  = ec$BindRow.rg;
                        block26: while (true) {
                            switch ((int)v4 /* !! */ ) {
                                case -1685771561: {
                                    v5 = ec$BindRow.jfhi("jfll", jfhn(int ), (int)48);
                                    ** GOTO lbl57
                                }
                                case -2610442: {
                                    return this.icon;
                                }
                                case 567897275: {
                                    v5 = ec$BindRow.jfhi("jflm", jfhn(int ), (int)49);
                                    ** GOTO lbl57
                                }
                                case 992532267: {
                                    v5 = ec$BindRow.jfhi("jfln", jfhn(int ), (int)50);
lbl57:
                                    // 3 sources

                                    v4 /* !! */  = (long)(v5 - ec$BindRow.jfhi("jflk", jfhn(int ), (int)47));
                                    continue block26;
                                }
                            }
                            break;
                        }
                        return this.icon;
                    }
                    case 0: {
                        var2_2 /* !! */  = (int)ec$BindRow.jfhi("jflo", jfhf(int ), (int)50);
                        if (var3_1) {
                            throw null;
                        }
                        break block33;
                    }
                    case 1: {
                        ** break;
                    }
                    case 3: {
                        break block33;
                    }
lbl69:
                    // 2 sources

                    while (true) {
                        var2_2 /* !! */  = (int)ec$BindRow.jfhi("jflp", jfhf(int ), (int)51);
                        cfr_temp_0 = 2;
                        if (!var3_1) continue block25;
                        throw null;
                    }
                    case 2: 
                }
                break;
            } while (true);
            var2_2 /* !! */  = (int)ec$BindRow.jfhi("jflq", jfhf(int ), (int)52);
            if (var3_1) {
                throw null;
            }
        }
        var2_2 /* !! */  = (int)ec$BindRow.jfhi("jflr", jfhf(int ), (int)53);
        ** while (!var3_1)
lbl83:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void jflt() {
        ec$BindRow.jfhh[0] = -1608025942;
        ec$BindRow.jfhh[1] = 495731127;
        ec$BindRow.jfhh[2] = 1955053920;
        ec$BindRow.jfhh[3] = 1434074308;
        ec$BindRow.jfhh[4] = 1357351401;
        ec$BindRow.jfhh[5] = -1224442057;
        ec$BindRow.jfhh[6] = -2001602757;
        ec$BindRow.jfhh[7] = 156611610;
        ec$BindRow.jfhh[8] = -665417932;
        ec$BindRow.jfhh[9] = -1579550222;
        ec$BindRow.jfhh[10] = 1804596718;
        ec$BindRow.jfhh[11] = -1573620327;
        ec$BindRow.jfhh[12] = 1003730754;
        ec$BindRow.jfhh[13] = 54544829;
        ec$BindRow.jfhh[14] = 427761819;
        ec$BindRow.jfhh[15] = 810940259;
        ec$BindRow.jfhh[16] = -916701702;
        ec$BindRow.jfhh[17] = -1043476234;
        ec$BindRow.jfhh[18] = 2017857847;
        ec$BindRow.jfhh[19] = 2075977683;
        ec$BindRow.jfhh[20] = -2012505225;
        ec$BindRow.jfhh[21] = 18973873;
        ec$BindRow.jfhh[22] = 1809203014;
        ec$BindRow.jfhh[23] = 1840372330;
        ec$BindRow.jfhh[24] = 1099616370;
        ec$BindRow.jfhh[25] = 5676554;
        ec$BindRow.jfhh[26] = -847745446;
        ec$BindRow.jfhh[27] = -171595560;
        ec$BindRow.jfhh[28] = 1655321306;
        ec$BindRow.jfhh[29] = 643157256;
        ec$BindRow.jfhh[30] = 1180174943;
        ec$BindRow.jfhh[31] = -2002139875;
        ec$BindRow.jfhh[32] = -484271887;
        ec$BindRow.jfhh[33] = -533705892;
        ec$BindRow.jfhh[34] = -1916632957;
        ec$BindRow.jfhh[35] = -1870821218;
        ec$BindRow.jfhh[36] = -508129699;
        ec$BindRow.jfhh[37] = 1900341009;
        ec$BindRow.jfhh[38] = 143831139;
        ec$BindRow.jfhh[39] = 1948637338;
        ec$BindRow.jfhh[40] = -2129284635;
        ec$BindRow.jfhh[41] = -688720339;
        ec$BindRow.jfhh[42] = -69273329;
        ec$BindRow.jfhh[43] = 1449448118;
        ec$BindRow.jfhh[44] = -1147147273;
        ec$BindRow.jfhh[45] = -1129122559;
        ec$BindRow.jfhh[46] = 1971830168;
        ec$BindRow.jfhh[47] = -1237913714;
        ec$BindRow.jfhh[48] = 393073622;
        ec$BindRow.jfhh[49] = 1666800269;
        ec$BindRow.jfhh[50] = -1273883254;
        ec$BindRow.jfhh[51] = -1958117433;
        ec$BindRow.jfhh[52] = -1980790074;
        ec$BindRow.jfhh[53] = 351447411;
    }

    static {
        jfhg = new int[54];
        jfhh = new int[54];
        ec$BindRow.jfls();
        ec$BindRow.jflt();
        jfho = new long[51];
        jfhp = new long[51];
        ec$BindRow.jflu();
        ec$BindRow.jflv();
    }

    public static /* synthetic */ CallSite jfhi(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void jflv() {
        ec$BindRow.jfhp[0] = 6832418869469127509L;
        ec$BindRow.jfhp[1] = 8845285249161577546L;
        ec$BindRow.jfhp[2] = -4237426370676196497L;
        ec$BindRow.jfhp[3] = -7566044125937015541L;
        ec$BindRow.jfhp[4] = -3564549153314541047L;
        ec$BindRow.jfhp[5] = 8742764301190529517L;
        ec$BindRow.jfhp[6] = -7153892477720914610L;
        ec$BindRow.jfhp[7] = 2275479713536412975L;
        ec$BindRow.jfhp[8] = 4921287811759829429L;
        ec$BindRow.jfhp[9] = 8367474196397530654L;
        ec$BindRow.jfhp[10] = -6089662755971870328L;
        ec$BindRow.jfhp[11] = -2962949750451452917L;
        ec$BindRow.jfhp[12] = 1584806788703868403L;
        ec$BindRow.jfhp[13] = -1796668530141853880L;
        ec$BindRow.jfhp[14] = -8666442078659867656L;
        ec$BindRow.jfhp[15] = -3106023596791279355L;
        ec$BindRow.jfhp[16] = 305213923722876608L;
        ec$BindRow.jfhp[17] = -3275816410305608461L;
        ec$BindRow.jfhp[18] = 5522206576270792821L;
        ec$BindRow.jfhp[19] = -2809567726107943682L;
        ec$BindRow.jfhp[20] = 7126360988858877988L;
        ec$BindRow.jfhp[21] = 2420171321361468197L;
        ec$BindRow.jfhp[22] = 2928177632229677133L;
        ec$BindRow.jfhp[23] = 3192929712075045774L;
        ec$BindRow.jfhp[24] = 1923412806968839177L;
        ec$BindRow.jfhp[25] = -2473932341360329127L;
        ec$BindRow.jfhp[26] = -5725718731959673076L;
        ec$BindRow.jfhp[27] = 7095493740126505358L;
        ec$BindRow.jfhp[28] = 2721910068836138268L;
        ec$BindRow.jfhp[29] = 3875901816532787307L;
        ec$BindRow.jfhp[30] = 3655257427816015403L;
        ec$BindRow.jfhp[31] = 4273907103067826072L;
        ec$BindRow.jfhp[32] = -682232285891035224L;
        ec$BindRow.jfhp[33] = 5146177104784284108L;
        ec$BindRow.jfhp[34] = 5288667752938718775L;
        ec$BindRow.jfhp[35] = 2443648827035376125L;
        ec$BindRow.jfhp[36] = -6682685112612988221L;
        ec$BindRow.jfhp[37] = -3653538236071468629L;
        ec$BindRow.jfhp[38] = -7764527436480269884L;
        ec$BindRow.jfhp[39] = -3103620034888364670L;
        ec$BindRow.jfhp[40] = 8516827601339922893L;
        ec$BindRow.jfhp[41] = -6574034794524752137L;
        ec$BindRow.jfhp[42] = -5135242765610337541L;
        ec$BindRow.jfhp[43] = 1493246323794439318L;
        ec$BindRow.jfhp[44] = 8595676877291940241L;
        ec$BindRow.jfhp[45] = 6991034735370302667L;
        ec$BindRow.jfhp[46] = 7163886060243276987L;
        ec$BindRow.jfhp[47] = -671626750456062718L;
        ec$BindRow.jfhp[48] = 8578592780347197377L;
        ec$BindRow.jfhp[49] = -1296673283300858179L;
        ec$BindRow.jfhp[50] = 2001286035173347023L;
    }
}

