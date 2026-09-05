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
import ruhack.phobia.ke;

final class mo$MultiOptionHitbox
extends Record {
    private static long[] hcq;
    private final float width;
    private static int[] hci;
    public static final int b;
    private final String option;
    private static int[] hch;
    private final float x;
    public static final boolean a;
    private final float y;
    protected static final long af = 5475390888782075737L;
    private final ke setting;
    public static final boolean c;
    private final float height;
    private static long[] hcr;

    public static /* synthetic */ CallSite hcj(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ float hge(int n2) {
        return Float.intBitsToFloat(hch[n2] ^ hci[n2]);
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public float x() {
        boolean bl2;
        Object object = af;
        boolean bl3 = true;
        block10: while (true) {
            CallSite callSite;
            if (!bl3 || (bl3 = false) || !true) {
                object = callSite - mo$MultiOptionHitbox.hcj("hfu", hcp(int ), (int)36);
            }
            switch ((int)object) {
                case -1942145973: {
                    callSite = mo$MultiOptionHitbox.hcj("hfv", hcp(int ), (int)37);
                    continue block10;
                }
                case -465299623: {
                    break block10;
                }
                case -87523079: {
                    callSite = mo$MultiOptionHitbox.hcj("hfw", hcp(int ), (int)38);
                    continue block10;
                }
                case 681392664: {
                    callSite = mo$MultiOptionHitbox.hcj("hfx", hcp(int ), (int)39);
                    continue block10;
                }
            }
            break;
        }
        boolean bl4 = c;
        while (true) {
            long l2;
            Object object2;
            if ((object2 = (l2 = af - mo$MultiOptionHitbox.hcj("hfy", hcp(int ), (int)40)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object2 == mo$MultiOptionHitbox.hcj("hfz", hcg(int ), (int)49)) break;
            object2 = mo$MultiOptionHitbox.hcj("hga", hcg(int ), (int)50);
        }
        int n2 = b;
        while (true) {
            long l3;
            Object object3;
            if ((object3 = (l3 = af - mo$MultiOptionHitbox.hcj("hgb", hcp(int ), (int)41)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object3 == mo$MultiOptionHitbox.hcj("hgc", hcg(int ), (int)51)) {
                bl2 = a;
                if (bl4) {
                    throw null;
                }
                break;
            }
            object3 = mo$MultiOptionHitbox.hcj("hgd", hcg(int ), (int)52);
        }
        if (bl2) return (float)mo$MultiOptionHitbox.hcj("hgf", hge(int ), (int)53);
        if (bl2) return (float)mo$MultiOptionHitbox.hcj("hgf", hge(int ), (int)53);
        Object object4 = af;
        block13: while (true) {
            switch ((int)object4) {
                case -465299623: {
                    return this.x;
                }
                case -15143433: {
                    object4 = mo$MultiOptionHitbox.hcj("hgh", hcp(int ), (int)43) - mo$MultiOptionHitbox.hcj("hgg", hcp(int ), (int)42);
                    continue block13;
                }
            }
            break;
        }
        return this.x;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final boolean equals(Object var1_1) {
        v0 /* !! */  = mo$MultiOptionHitbox.af;
        if (true) ** GOTO lbl5
        block20: while (true) {
            v0 /* !! */  = (long)(mo$MultiOptionHitbox.hcj("hdy", hcp(int ), (int)15) - mo$MultiOptionHitbox.hcj("hdx", hcp(int ), (int)14));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -519496724: {
                    continue block20;
                }
                case -465299623: {
                    break block20;
                }
            }
            break;
        }
        var4_2 = mo$MultiOptionHitbox.c;
        v1 /* !! */  = mo$MultiOptionHitbox.af;
        if (true) ** GOTO lbl15
        block21: while (true) {
            v1 /* !! */  = (long)(v2 - mo$MultiOptionHitbox.hcj("hdz", hcp(int ), (int)16));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1830434785: {
                    v2 = mo$MultiOptionHitbox.hcj("hea", hcp(int ), (int)17);
                    continue block21;
                }
                case -465299623: {
                    break block21;
                }
                case -410997172: {
                    v2 = mo$MultiOptionHitbox.hcj("heb", hcp(int ), (int)18);
                    continue block21;
                }
                case 1981698742: {
                    v2 = mo$MultiOptionHitbox.hcj("hec", hcp(int ), (int)19);
                    continue block21;
                }
            }
            break;
        }
        var3_3 /* !! */  = mo$MultiOptionHitbox.b;
        v3 /* !! */  = mo$MultiOptionHitbox.af;
        if (true) ** GOTO lbl32
        block22: while (true) {
            v3 /* !! */  = (long)(mo$MultiOptionHitbox.hcj("hee", hcp(int ), (int)21) - mo$MultiOptionHitbox.hcj("hed", hcp(int ), (int)20));
lbl32:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1228758799: {
                    continue block22;
                }
                case -465299623: {
                    break block22;
                }
            }
            break;
        }
        var2_4 = mo$MultiOptionHitbox.a;
        if (var4_2) {
            throw null;
lbl40:
            // 1 sources

            return (boolean)mo$MultiOptionHitbox.hcj("hef", hcg(int ), (int)22);
        }
        ** while (var2_4 || var2_4)
lbl43:
        // 1 sources

        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_0 = mo$MultiOptionHitbox.af - mo$MultiOptionHitbox.hcj("heg", hcp(int ), (int)22)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == mo$MultiOptionHitbox.hcj("heh", hcg(int ), (int)23)) break;
                    v4 /* !! */  = (long)mo$MultiOptionHitbox.hcj("hei", hcg(int ), (int)24);
                }
                return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{mo$MultiOptionHitbox.class, "setting;option;x;y;width;height", "setting", "option", "x", "y", "width", "height"}, this, var1_1);
            }
lbl53:
            // 3 sources

            case 0: {
                var3_3 /* !! */  = (int)mo$MultiOptionHitbox.hcj("hej", hcg(int ), (int)25);
                if (!var4_2) break;
                throw null;
            }
            case 1: {
                var3_3 /* !! */  = (int)mo$MultiOptionHitbox.hcj("hek", hcg(int ), (int)26);
                if (!var4_2) ** GOTO lbl53
                throw null;
            }
            case 2: {
                var3_3 /* !! */  = (int)mo$MultiOptionHitbox.hcj("hel", hcg(int ), (int)27);
                if (!var4_2) ** GOTO lbl53
                throw null;
            }
            case 3: 
        }
        do {
            var3_3 /* !! */  = (int)mo$MultiOptionHitbox.hcj("hem", hcg(int ), (int)28);
        } while (!var4_2);
        throw null;
    }

    private static /* synthetic */ void hio() {
        mo$MultiOptionHitbox.hcr[0] = 9119749497399062653L;
        mo$MultiOptionHitbox.hcr[1] = 2928389798937485678L;
        mo$MultiOptionHitbox.hcr[2] = -2608433832139425997L;
        mo$MultiOptionHitbox.hcr[3] = 2590975135383905305L;
        mo$MultiOptionHitbox.hcr[4] = 1026116066377610861L;
        mo$MultiOptionHitbox.hcr[5] = 2775713024904620137L;
        mo$MultiOptionHitbox.hcr[6] = -1566700902297492625L;
        mo$MultiOptionHitbox.hcr[7] = 5349223039770183013L;
        mo$MultiOptionHitbox.hcr[8] = -6924102975974796827L;
        mo$MultiOptionHitbox.hcr[9] = 3642770551017429903L;
        mo$MultiOptionHitbox.hcr[10] = -7176670942427392466L;
        mo$MultiOptionHitbox.hcr[11] = 2411582606138699260L;
        mo$MultiOptionHitbox.hcr[12] = -4971627591828246474L;
        mo$MultiOptionHitbox.hcr[13] = -5404364609952072823L;
        mo$MultiOptionHitbox.hcr[14] = -8584091262840026304L;
        mo$MultiOptionHitbox.hcr[15] = 7545972619889866970L;
        mo$MultiOptionHitbox.hcr[16] = -5705269029515206186L;
        mo$MultiOptionHitbox.hcr[17] = -4902958356935037689L;
        mo$MultiOptionHitbox.hcr[18] = 5274225493204630837L;
        mo$MultiOptionHitbox.hcr[19] = 2100419267740355733L;
        mo$MultiOptionHitbox.hcr[20] = 4462469495782393537L;
        mo$MultiOptionHitbox.hcr[21] = -5008830230918349748L;
        mo$MultiOptionHitbox.hcr[22] = 3303781064305935098L;
        mo$MultiOptionHitbox.hcr[23] = -1819408352370406403L;
        mo$MultiOptionHitbox.hcr[24] = -205298240305319813L;
        mo$MultiOptionHitbox.hcr[25] = 3205491922533305115L;
        mo$MultiOptionHitbox.hcr[26] = -895102615895265956L;
        mo$MultiOptionHitbox.hcr[27] = -8027434541313843467L;
        mo$MultiOptionHitbox.hcr[28] = -8039866183269864253L;
        mo$MultiOptionHitbox.hcr[29] = 5438804762823037009L;
        mo$MultiOptionHitbox.hcr[30] = 7782968753124638594L;
        mo$MultiOptionHitbox.hcr[31] = -7702550550661060110L;
        mo$MultiOptionHitbox.hcr[32] = -4712248552577453743L;
        mo$MultiOptionHitbox.hcr[33] = 7904233057545479153L;
        mo$MultiOptionHitbox.hcr[34] = -3291044492585801537L;
        mo$MultiOptionHitbox.hcr[35] = 8558636831807639284L;
        mo$MultiOptionHitbox.hcr[36] = -6163592124656031321L;
        mo$MultiOptionHitbox.hcr[37] = 451854773830124266L;
        mo$MultiOptionHitbox.hcr[38] = -614438052930456386L;
        mo$MultiOptionHitbox.hcr[39] = 4880145849291633338L;
        mo$MultiOptionHitbox.hcr[40] = 8726103940060625749L;
        mo$MultiOptionHitbox.hcr[41] = 1905266326694884226L;
        mo$MultiOptionHitbox.hcr[42] = -606140023133440064L;
        mo$MultiOptionHitbox.hcr[43] = 4965954681494310875L;
        mo$MultiOptionHitbox.hcr[44] = -1214404906698728575L;
        mo$MultiOptionHitbox.hcr[45] = 8700809938848279185L;
        mo$MultiOptionHitbox.hcr[46] = -3414784274889188299L;
        mo$MultiOptionHitbox.hcr[47] = -6446780647616993935L;
        mo$MultiOptionHitbox.hcr[48] = 8801581827373793429L;
        mo$MultiOptionHitbox.hcr[49] = -4284346925405638157L;
        mo$MultiOptionHitbox.hcr[50] = -5321758195908065229L;
        mo$MultiOptionHitbox.hcr[51] = -3608706534548785779L;
        mo$MultiOptionHitbox.hcr[52] = -9176316646010354197L;
        mo$MultiOptionHitbox.hcr[53] = 78663672122465273L;
        mo$MultiOptionHitbox.hcr[54] = 5069361393464087767L;
        mo$MultiOptionHitbox.hcr[55] = 1469658426226879591L;
        mo$MultiOptionHitbox.hcr[56] = -1390079849222602615L;
        mo$MultiOptionHitbox.hcr[57] = -4066479654347311202L;
        mo$MultiOptionHitbox.hcr[58] = 1663338818365422547L;
        mo$MultiOptionHitbox.hcr[59] = -4130131574303594914L;
        mo$MultiOptionHitbox.hcr[60] = -7318421824443888017L;
        mo$MultiOptionHitbox.hcr[61] = 6209867729006380677L;
        mo$MultiOptionHitbox.hcr[62] = -6700370443142185702L;
        mo$MultiOptionHitbox.hcr[63] = -1430880753658506471L;
        mo$MultiOptionHitbox.hcr[64] = 9046955559399747327L;
        mo$MultiOptionHitbox.hcr[65] = 5506541973853870904L;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public final String toString() {
        Object object = af;
        boolean bl2 = true;
        block9: while (true) {
            CallSite callSite;
            if (!bl2 || (bl2 = false) || !true) {
                object = callSite - mo$MultiOptionHitbox.hcj("hcs", hcp(int ), (int)0);
            }
            switch ((int)object) {
                case -696163883: {
                    callSite = mo$MultiOptionHitbox.hcj("hct", hcp(int ), (int)1);
                    continue block9;
                }
                case -465299623: {
                    break block9;
                }
                case 104543267: {
                    callSite = mo$MultiOptionHitbox.hcj("hcu", hcp(int ), (int)2);
                    continue block9;
                }
            }
            break;
        }
        boolean bl3 = c;
        while (true) {
            long l2;
            Object object2;
            if ((object2 = (l2 = af - mo$MultiOptionHitbox.hcj("hcv", hcp(int ), (int)3)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object2 == mo$MultiOptionHitbox.hcj("hcw", hcg(int ), (int)5)) break;
            object2 = mo$MultiOptionHitbox.hcj("hcx", hcg(int ), (int)6);
        }
        int n2 = b;
        Object object3 = af;
        block11: while (true) {
            switch ((int)object3) {
                case -465299623: {
                    break block11;
                }
                case 45749381: {
                    object3 = mo$MultiOptionHitbox.hcj("hcz", hcp(int ), (int)5) - mo$MultiOptionHitbox.hcj("hcy", hcp(int ), (int)4);
                    continue block11;
                }
            }
            break;
        }
        boolean bl4 = a;
        if (bl3) {
            throw null;
        }
        if (bl4) return null;
        if (bl4) return null;
        while (true) {
            long l3;
            Object object4;
            if ((object4 = (l3 = af - mo$MultiOptionHitbox.hcj("hda", hcp(int ), (int)6)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object4 == mo$MultiOptionHitbox.hcj("hdb", hcg(int ), (int)7)) {
                return ObjectMethods.bootstrap("toString", new MethodHandle[]{mo$MultiOptionHitbox.class, "setting;option;x;y;width;height", "setting", "option", "x", "y", "width", "height"}, this);
            }
            object4 = mo$MultiOptionHitbox.hcj("hdc", hcg(int ), (int)8);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public float width() {
        v0 /* !! */  = mo$MultiOptionHitbox.af;
        if (true) ** GOTO lbl5
        block16: while (true) {
            v0 /* !! */  = (long)(v1 - mo$MultiOptionHitbox.hcj("hhd", hcp(int ), (int)48));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -2101550237: {
                    v1 = mo$MultiOptionHitbox.hcj("hhe", hcp(int ), (int)49);
                    continue block16;
                }
                case -465299623: {
                    break block16;
                }
                case 1287662293: {
                    v1 = mo$MultiOptionHitbox.hcj("hhf", hcp(int ), (int)50);
                    continue block16;
                }
            }
            break;
        }
        var3_1 = mo$MultiOptionHitbox.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = mo$MultiOptionHitbox.af - mo$MultiOptionHitbox.hcj("hhg", hcp(int ), (int)51)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == mo$MultiOptionHitbox.hcj("hhh", hcg(int ), (int)71)) break;
            v2 /* !! */  = (long)mo$MultiOptionHitbox.hcj("hhi", hcg(int ), (int)72);
        }
        var2_2 /* !! */  = mo$MultiOptionHitbox.b;
        v3 /* !! */  = mo$MultiOptionHitbox.af;
        if (true) ** GOTO lbl26
        block18: while (true) {
            v3 /* !! */  = (long)(v4 - mo$MultiOptionHitbox.hcj("hhj", hcp(int ), (int)52));
lbl26:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -465299623: {
                    break block18;
                }
                case 11217425: {
                    v4 = mo$MultiOptionHitbox.hcj("hhk", hcp(int ), (int)53);
                    continue block18;
                }
                case 1041968014: {
                    v4 = mo$MultiOptionHitbox.hcj("hhl", hcp(int ), (int)54);
                    continue block18;
                }
            }
            break;
        }
        var1_3 = mo$MultiOptionHitbox.a;
        if (var3_1) {
            throw null;
            return (float)mo$MultiOptionHitbox.hcj("hhm", hge(int ), (int)73);
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block10 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** continue;
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = mo$MultiOptionHitbox.af - mo$MultiOptionHitbox.hcj("hhn", hcp(int ), (int)55)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == mo$MultiOptionHitbox.hcj("hho", hcg(int ), (int)74)) break;
                    v5 /* !! */  = (long)mo$MultiOptionHitbox.hcj("hhp", hcg(int ), (int)75);
                }
                return this.width;
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)mo$MultiOptionHitbox.hcj("hhq", hcg(int ), (int)76);
                    if (!var3_1) break block10;
                    throw null;
                }
            }
lbl56:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)mo$MultiOptionHitbox.hcj("hhr", hcg(int ), (int)77);
                if (!var3_1) break;
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)mo$MultiOptionHitbox.hcj("hhs", hcg(int ), (int)78);
                if (!var3_1) ** GOTO lbl56
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)mo$MultiOptionHitbox.hcj("hht", hcg(int ), (int)79);
        ** while (!var3_1)
lbl67:
        // 1 sources

        throw null;
    }

    static {
        hch = new int[87];
        hci = new int[87];
        mo$MultiOptionHitbox.hil();
        mo$MultiOptionHitbox.him();
        hcq = new long[66];
        hcr = new long[66];
        mo$MultiOptionHitbox.hin();
        mo$MultiOptionHitbox.hio();
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public float height() {
        v0 /* !! */  = mo$MultiOptionHitbox.af;
        if (true) ** GOTO lbl5
        block21: while (true) {
            v0 /* !! */  = (long)(v1 - mo$MultiOptionHitbox.hcj("hhu", hcp(int ), (int)56));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1464504840: {
                    v1 = mo$MultiOptionHitbox.hcj("hhv", hcp(int ), (int)57);
                    continue block21;
                }
                case -465299623: {
                    break block21;
                }
                case 687708962: {
                    v1 = mo$MultiOptionHitbox.hcj("hhw", hcp(int ), (int)58);
                    continue block21;
                }
            }
            break;
        }
        var3_1 = mo$MultiOptionHitbox.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = mo$MultiOptionHitbox.af - mo$MultiOptionHitbox.hcj("hhx", hcp(int ), (int)59)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == mo$MultiOptionHitbox.hcj("hhy", hcg(int ), (int)80)) break;
            v2 /* !! */  = (long)mo$MultiOptionHitbox.hcj("hhz", hcg(int ), (int)81);
        }
        var2_2 /* !! */  = mo$MultiOptionHitbox.b;
        v3 /* !! */  = mo$MultiOptionHitbox.af;
        block23: while (true) {
            switch ((int)v3 /* !! */ ) {
                case -465299623: {
                    break block23;
                }
                case 1091000908: {
                    v3 /* !! */  = (long)(mo$MultiOptionHitbox.hcj("hib", hcp(int ), (int)61) - mo$MultiOptionHitbox.hcj("hia", hcp(int ), (int)60));
                    continue block23;
                }
            }
            break;
        }
        var1_3 = mo$MultiOptionHitbox.a;
        if (var3_1) {
            throw null;
        }
        if (var1_3 != false) return (float)mo$MultiOptionHitbox.hcj("hic", hge(int ), (int)82);
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        while (true) {
            switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var1_3 != false) return (float)mo$MultiOptionHitbox.hcj("hic", hge(int ), (int)82);
                    v4 /* !! */  = mo$MultiOptionHitbox.af;
                    block25: while (true) {
                        switch ((int)v4 /* !! */ ) {
                            case -2094373179: {
                                v5 = mo$MultiOptionHitbox.hcj("hie", hcp(int ), (int)63);
                                ** GOTO lbl52
                            }
                            case -465299623: {
                                return this.height;
                            }
                            case 297050751: {
                                v5 = mo$MultiOptionHitbox.hcj("hif", hcp(int ), (int)64);
                                ** GOTO lbl52
                            }
                            case 1410315336: {
                                v5 = mo$MultiOptionHitbox.hcj("hig", hcp(int ), (int)65);
lbl52:
                                // 3 sources

                                v4 /* !! */  = (long)(v5 - mo$MultiOptionHitbox.hcj("hid", hcp(int ), (int)62));
                                continue block25;
                            }
                        }
                        break;
                    }
                    return this.height;
                }
                case 1: {
                    ** GOTO lbl66
                }
                case 3: {
                    ** GOTO lbl63
                }
                case 0: {
                    var2_2 /* !! */  = (int)mo$MultiOptionHitbox.hcj("hih", hcg(int ), (int)83);
                    if (var3_1) {
                        throw null;
                    }
lbl63:
                    // 3 sources

                    var2_2 /* !! */  = (int)mo$MultiOptionHitbox.hcj("hik", hcg(int ), (int)86);
                    if (var3_1) {
                        throw null;
                    }
lbl66:
                    // 3 sources

                    var2_2 /* !! */  = (int)mo$MultiOptionHitbox.hcj("hii", hcg(int ), (int)84);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 2: 
            }
            if (true) ** GOTO lbl73
            break;
        }
        do {
            if (true) ** continue;
lbl73:
            // 2 sources

            var2_2 /* !! */  = (int)mo$MultiOptionHitbox.hcj("hij", hcg(int ), (int)85);
            cfr_temp_0 = 0;
        } while (!var3_1);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public String option() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = mo$MultiOptionHitbox.af - mo$MultiOptionHitbox.hcj("hfe", hcp(int ), (int)32)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == mo$MultiOptionHitbox.hcj("hff", hcg(int ), (int)37)) break;
            v0 /* !! */  = (long)mo$MultiOptionHitbox.hcj("hfg", hcg(int ), (int)38);
        }
        var3_1 = mo$MultiOptionHitbox.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = mo$MultiOptionHitbox.af - mo$MultiOptionHitbox.hcj("hfh", hcp(int ), (int)33)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == mo$MultiOptionHitbox.hcj("hfi", hcg(int ), (int)39)) break;
            v1 /* !! */  = (long)mo$MultiOptionHitbox.hcj("hfj", hcg(int ), (int)40);
        }
        var2_2 /* !! */  = mo$MultiOptionHitbox.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = mo$MultiOptionHitbox.af - mo$MultiOptionHitbox.hcj("hfk", hcp(int ), (int)34)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == mo$MultiOptionHitbox.hcj("hfl", hcg(int ), (int)41)) break;
            v2 /* !! */  = (long)mo$MultiOptionHitbox.hcj("hfm", hcg(int ), (int)42);
        }
        var1_3 = mo$MultiOptionHitbox.a;
        if (var3_1) {
            throw null;
            return null;
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block0 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** continue;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_3 = mo$MultiOptionHitbox.af - mo$MultiOptionHitbox.hcj("hfn", hcp(int ), (int)35)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == mo$MultiOptionHitbox.hcj("hfo", hcg(int ), (int)43)) break;
                    v3 /* !! */  = (long)mo$MultiOptionHitbox.hcj("hfp", hcg(int ), (int)44);
                }
                return this.option;
            }
            case 0: {
                do {
                    var2_2 /* !! */  = (int)mo$MultiOptionHitbox.hcj("hfq", hcg(int ), (int)45);
                } while (!var3_1);
                throw null;
            }
            case 1: {
                do {
                    var2_2 /* !! */  = (int)mo$MultiOptionHitbox.hcj("hfr", hcg(int ), (int)46);
                } while (!var3_1);
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)mo$MultiOptionHitbox.hcj("hfs", hcg(int ), (int)47);
                    if (!var3_1) break block0;
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)mo$MultiOptionHitbox.hcj("hft", hcg(int ), (int)48);
        ** while (!var3_1)
lbl55:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void hil() {
        mo$MultiOptionHitbox.hch[0] = -1666008409;
        mo$MultiOptionHitbox.hch[1] = -1208187580;
        mo$MultiOptionHitbox.hch[2] = -1955502323;
        mo$MultiOptionHitbox.hch[3] = 84963220;
        mo$MultiOptionHitbox.hch[4] = -545426798;
        mo$MultiOptionHitbox.hch[5] = -1313344955;
        mo$MultiOptionHitbox.hch[6] = -1945871662;
        mo$MultiOptionHitbox.hch[7] = -557526816;
        mo$MultiOptionHitbox.hch[8] = -588373655;
        mo$MultiOptionHitbox.hch[9] = 1003548869;
        mo$MultiOptionHitbox.hch[10] = 1423541445;
        mo$MultiOptionHitbox.hch[11] = -179737926;
        mo$MultiOptionHitbox.hch[12] = -1684309259;
        mo$MultiOptionHitbox.hch[13] = -1845890750;
        mo$MultiOptionHitbox.hch[14] = 1745238116;
        mo$MultiOptionHitbox.hch[15] = -629503428;
        mo$MultiOptionHitbox.hch[16] = -742032109;
        mo$MultiOptionHitbox.hch[17] = -788453446;
        mo$MultiOptionHitbox.hch[18] = 1857687835;
        mo$MultiOptionHitbox.hch[19] = 1797222414;
        mo$MultiOptionHitbox.hch[20] = 74203548;
        mo$MultiOptionHitbox.hch[21] = 275055676;
        mo$MultiOptionHitbox.hch[22] = 103067819;
        mo$MultiOptionHitbox.hch[23] = -707491057;
        mo$MultiOptionHitbox.hch[24] = 597487304;
        mo$MultiOptionHitbox.hch[25] = -65912007;
        mo$MultiOptionHitbox.hch[26] = -1525212094;
        mo$MultiOptionHitbox.hch[27] = -1138929347;
        mo$MultiOptionHitbox.hch[28] = 2019349581;
        mo$MultiOptionHitbox.hch[29] = -1698683738;
        mo$MultiOptionHitbox.hch[30] = -1044600549;
        mo$MultiOptionHitbox.hch[31] = 1874948817;
        mo$MultiOptionHitbox.hch[32] = 817262925;
        mo$MultiOptionHitbox.hch[33] = -1384562357;
        mo$MultiOptionHitbox.hch[34] = 1113806440;
        mo$MultiOptionHitbox.hch[35] = -1244896596;
        mo$MultiOptionHitbox.hch[36] = 1633818549;
        mo$MultiOptionHitbox.hch[37] = 26260158;
        mo$MultiOptionHitbox.hch[38] = -196934789;
        mo$MultiOptionHitbox.hch[39] = 1342996364;
        mo$MultiOptionHitbox.hch[40] = -1619378629;
        mo$MultiOptionHitbox.hch[41] = 1901977591;
        mo$MultiOptionHitbox.hch[42] = -1380955419;
        mo$MultiOptionHitbox.hch[43] = 1797794736;
        mo$MultiOptionHitbox.hch[44] = 1466235657;
        mo$MultiOptionHitbox.hch[45] = -1271130797;
        mo$MultiOptionHitbox.hch[46] = 1069544937;
        mo$MultiOptionHitbox.hch[47] = 1546272884;
        mo$MultiOptionHitbox.hch[48] = -964619862;
        mo$MultiOptionHitbox.hch[49] = -1041895092;
        mo$MultiOptionHitbox.hch[50] = 735438740;
        mo$MultiOptionHitbox.hch[51] = 489454486;
        mo$MultiOptionHitbox.hch[52] = 1607495946;
        mo$MultiOptionHitbox.hch[53] = -1235560723;
        mo$MultiOptionHitbox.hch[54] = 144238925;
        mo$MultiOptionHitbox.hch[55] = 1708579240;
        mo$MultiOptionHitbox.hch[56] = -182025324;
        mo$MultiOptionHitbox.hch[57] = -1111264618;
        mo$MultiOptionHitbox.hch[58] = -1599662011;
        mo$MultiOptionHitbox.hch[59] = 486943937;
        mo$MultiOptionHitbox.hch[60] = 1782255946;
        mo$MultiOptionHitbox.hch[61] = -1097216543;
        mo$MultiOptionHitbox.hch[62] = -1835542236;
        mo$MultiOptionHitbox.hch[63] = 1222762103;
        mo$MultiOptionHitbox.hch[64] = 1624637534;
        mo$MultiOptionHitbox.hch[65] = -164013343;
        mo$MultiOptionHitbox.hch[66] = 2031702532;
        mo$MultiOptionHitbox.hch[67] = 1833688326;
        mo$MultiOptionHitbox.hch[68] = 1453219065;
        mo$MultiOptionHitbox.hch[69] = 1356999232;
        mo$MultiOptionHitbox.hch[70] = -1541613395;
        mo$MultiOptionHitbox.hch[71] = 1598636565;
        mo$MultiOptionHitbox.hch[72] = 834093722;
        mo$MultiOptionHitbox.hch[73] = -1570989078;
        mo$MultiOptionHitbox.hch[74] = -729451503;
        mo$MultiOptionHitbox.hch[75] = 1854972195;
        mo$MultiOptionHitbox.hch[76] = -2020337622;
        mo$MultiOptionHitbox.hch[77] = 1670984241;
        mo$MultiOptionHitbox.hch[78] = -1340630247;
        mo$MultiOptionHitbox.hch[79] = 282416502;
        mo$MultiOptionHitbox.hch[80] = 17856749;
        mo$MultiOptionHitbox.hch[81] = 1610728805;
        mo$MultiOptionHitbox.hch[82] = 660332888;
        mo$MultiOptionHitbox.hch[83] = -212317746;
        mo$MultiOptionHitbox.hch[84] = 1442058200;
        mo$MultiOptionHitbox.hch[85] = 668616561;
        mo$MultiOptionHitbox.hch[86] = -893927073;
    }

    private static /* synthetic */ int hcg(int n2) {
        return hch[n2] ^ hci[n2];
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public ke setting() {
        boolean bl2;
        Object object = af;
        boolean bl3 = true;
        block11: while (true) {
            CallSite callSite;
            if (!bl3 || (bl3 = false) || !true) {
                object = callSite - mo$MultiOptionHitbox.hcj("hen", hcp(int ), (int)23);
            }
            switch ((int)object) {
                case -1722804949: {
                    callSite = mo$MultiOptionHitbox.hcj("heo", hcp(int ), (int)24);
                    continue block11;
                }
                case -918417796: {
                    callSite = mo$MultiOptionHitbox.hcj("hep", hcp(int ), (int)25);
                    continue block11;
                }
                case -465299623: {
                    break block11;
                }
                case 73904740: {
                    callSite = mo$MultiOptionHitbox.hcj("heq", hcp(int ), (int)26);
                    continue block11;
                }
            }
            break;
        }
        boolean bl4 = c;
        while (true) {
            long l2;
            Object object2;
            if ((object2 = (l2 = af - mo$MultiOptionHitbox.hcj("her", hcp(int ), (int)27)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object2 == mo$MultiOptionHitbox.hcj("hes", hcg(int ), (int)29)) break;
            object2 = mo$MultiOptionHitbox.hcj("het", hcg(int ), (int)30);
        }
        int n2 = b;
        while (true) {
            long l3;
            Object object3;
            if ((object3 = (l3 = af - mo$MultiOptionHitbox.hcj("heu", hcp(int ), (int)28)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object3 == mo$MultiOptionHitbox.hcj("hev", hcg(int ), (int)31)) {
                bl2 = a;
                if (bl4) {
                    throw null;
                }
                break;
            }
            object3 = mo$MultiOptionHitbox.hcj("hew", hcg(int ), (int)32);
        }
        if (bl2) return null;
        if (bl2) return null;
        Object object4 = af;
        boolean bl5 = true;
        block14: while (true) {
            CallSite callSite;
            if (!bl5 || (bl5 = false) || !true) {
                object4 = callSite - mo$MultiOptionHitbox.hcj("hex", hcp(int ), (int)29);
            }
            switch ((int)object4) {
                case -465299623: {
                    return this.setting;
                }
                case 0x8EFEFFF: {
                    callSite = mo$MultiOptionHitbox.hcj("hey", hcp(int ), (int)30);
                    continue block14;
                }
                case 1305324234: {
                    callSite = mo$MultiOptionHitbox.hcj("hez", hcp(int ), (int)31);
                    continue block14;
                }
            }
            break;
        }
        return this.setting;
    }

    private mo$MultiOptionHitbox(ke ke2, String string, float f2, float f3, float f4, float f5) {
        int n2 = b;
        this.setting = ke2;
        this.option = string;
        this.x = f2;
        this.y = f3;
        this.width = f4;
        this.height = f5;
    }

    private static /* synthetic */ long hcp(int n2) {
        return hcq[n2] ^ hcr[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public float y() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = mo$MultiOptionHitbox.af - mo$MultiOptionHitbox.hcj("hgm", hcp(int ), (int)44)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == mo$MultiOptionHitbox.hcj("hgn", hcg(int ), (int)58)) break;
            v0 /* !! */  = (long)mo$MultiOptionHitbox.hcj("hgo", hcg(int ), (int)59);
        }
        var3_1 = mo$MultiOptionHitbox.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = mo$MultiOptionHitbox.af - mo$MultiOptionHitbox.hcj("hgp", hcp(int ), (int)45)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == mo$MultiOptionHitbox.hcj("hgq", hcg(int ), (int)60)) break;
            v1 /* !! */  = (long)mo$MultiOptionHitbox.hcj("hgr", hcg(int ), (int)61);
        }
        var2_2 /* !! */  = mo$MultiOptionHitbox.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = mo$MultiOptionHitbox.af - mo$MultiOptionHitbox.hcj("hgs", hcp(int ), (int)46)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == mo$MultiOptionHitbox.hcj("hgt", hcg(int ), (int)62)) break;
            v2 /* !! */  = (long)mo$MultiOptionHitbox.hcj("hgu", hcg(int ), (int)63);
        }
        var1_3 = mo$MultiOptionHitbox.a;
        if (var3_1) {
            throw null;
lbl24:
            // 2 sources

            return (float)mo$MultiOptionHitbox.hcj("hgv", hge(int ), (int)64);
        }
        if (var1_3) ** GOTO lbl24
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block0 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_3 = mo$MultiOptionHitbox.af - mo$MultiOptionHitbox.hcj("hgw", hcp(int ), (int)47)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == mo$MultiOptionHitbox.hcj("hgx", hcg(int ), (int)65)) break;
                    v3 /* !! */  = (long)mo$MultiOptionHitbox.hcj("hgy", hcg(int ), (int)66);
                }
                return this.y;
            }
            case 0: {
                var2_2 /* !! */  = (int)mo$MultiOptionHitbox.hcj("hgz", hcg(int ), (int)67);
                if (!var3_1) break;
                throw null;
            }
lbl42:
            // 2 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)mo$MultiOptionHitbox.hcj("hha", hcg(int ), (int)68);
                    if (!var3_1) break block0;
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)mo$MultiOptionHitbox.hcj("hhb", hcg(int ), (int)69);
                if (!var3_1) ** GOTO lbl42
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)mo$MultiOptionHitbox.hcj("hhc", hcg(int ), (int)70);
        ** while (!var3_1)
lbl54:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void hin() {
        mo$MultiOptionHitbox.hcq[0] = -3003888161790239069L;
        mo$MultiOptionHitbox.hcq[1] = -6637166234507746805L;
        mo$MultiOptionHitbox.hcq[2] = 8502836159528905105L;
        mo$MultiOptionHitbox.hcq[3] = 6908877870074980947L;
        mo$MultiOptionHitbox.hcq[4] = 9185531312238214657L;
        mo$MultiOptionHitbox.hcq[5] = 2147177759536064958L;
        mo$MultiOptionHitbox.hcq[6] = 4698215208585202974L;
        mo$MultiOptionHitbox.hcq[7] = 3080577672765001556L;
        mo$MultiOptionHitbox.hcq[8] = 5374829206892157486L;
        mo$MultiOptionHitbox.hcq[9] = 7841276446980025481L;
        mo$MultiOptionHitbox.hcq[10] = -5976965225631934142L;
        mo$MultiOptionHitbox.hcq[11] = 7401191930744638359L;
        mo$MultiOptionHitbox.hcq[12] = -4313790972800705196L;
        mo$MultiOptionHitbox.hcq[13] = -4447502602181922497L;
        mo$MultiOptionHitbox.hcq[14] = 8632511811274686748L;
        mo$MultiOptionHitbox.hcq[15] = -3444756512964087897L;
        mo$MultiOptionHitbox.hcq[16] = -1987230374369250732L;
        mo$MultiOptionHitbox.hcq[17] = 7691523217422914047L;
        mo$MultiOptionHitbox.hcq[18] = -7521544983670327775L;
        mo$MultiOptionHitbox.hcq[19] = 3767274617880964252L;
        mo$MultiOptionHitbox.hcq[20] = -3632006157953505633L;
        mo$MultiOptionHitbox.hcq[21] = -1512583429504256261L;
        mo$MultiOptionHitbox.hcq[22] = -3845002090312102650L;
        mo$MultiOptionHitbox.hcq[23] = 516036432172694318L;
        mo$MultiOptionHitbox.hcq[24] = 8758384219993055958L;
        mo$MultiOptionHitbox.hcq[25] = 9158061777244845819L;
        mo$MultiOptionHitbox.hcq[26] = 2784294361255494526L;
        mo$MultiOptionHitbox.hcq[27] = 1657711953207371543L;
        mo$MultiOptionHitbox.hcq[28] = 3659974912406968266L;
        mo$MultiOptionHitbox.hcq[29] = 9051258094782931769L;
        mo$MultiOptionHitbox.hcq[30] = 3828632338240580499L;
        mo$MultiOptionHitbox.hcq[31] = -4195839061204075663L;
        mo$MultiOptionHitbox.hcq[32] = -5802517529302053828L;
        mo$MultiOptionHitbox.hcq[33] = -280269086273375650L;
        mo$MultiOptionHitbox.hcq[34] = -5232995977179966011L;
        mo$MultiOptionHitbox.hcq[35] = 2711266375779260212L;
        mo$MultiOptionHitbox.hcq[36] = 1419375789839109369L;
        mo$MultiOptionHitbox.hcq[37] = -5072206919434817271L;
        mo$MultiOptionHitbox.hcq[38] = 3305921190938507126L;
        mo$MultiOptionHitbox.hcq[39] = -1764892390918374111L;
        mo$MultiOptionHitbox.hcq[40] = -112399109096087667L;
        mo$MultiOptionHitbox.hcq[41] = 3499961855332061562L;
        mo$MultiOptionHitbox.hcq[42] = -6402163447872589067L;
        mo$MultiOptionHitbox.hcq[43] = 3982798207335740520L;
        mo$MultiOptionHitbox.hcq[44] = -7543223705685476303L;
        mo$MultiOptionHitbox.hcq[45] = 1298063886930865907L;
        mo$MultiOptionHitbox.hcq[46] = 8386026011248950129L;
        mo$MultiOptionHitbox.hcq[47] = 4323932300276631992L;
        mo$MultiOptionHitbox.hcq[48] = -5525611533610926968L;
        mo$MultiOptionHitbox.hcq[49] = -2296132783015360818L;
        mo$MultiOptionHitbox.hcq[50] = 4544893537278082907L;
        mo$MultiOptionHitbox.hcq[51] = -3295553434851316032L;
        mo$MultiOptionHitbox.hcq[52] = 6810289954881235328L;
        mo$MultiOptionHitbox.hcq[53] = 2926823303657621330L;
        mo$MultiOptionHitbox.hcq[54] = -6253983535081961650L;
        mo$MultiOptionHitbox.hcq[55] = -5113223872265400516L;
        mo$MultiOptionHitbox.hcq[56] = -876592593041031335L;
        mo$MultiOptionHitbox.hcq[57] = 8458227589978986022L;
        mo$MultiOptionHitbox.hcq[58] = -2713148281702913117L;
        mo$MultiOptionHitbox.hcq[59] = -5098433330515243456L;
        mo$MultiOptionHitbox.hcq[60] = 6378031929672912598L;
        mo$MultiOptionHitbox.hcq[61] = 8526946610034158994L;
        mo$MultiOptionHitbox.hcq[62] = -729780137917009106L;
        mo$MultiOptionHitbox.hcq[63] = -2070790147040542054L;
        mo$MultiOptionHitbox.hcq[64] = -6792223157407782040L;
        mo$MultiOptionHitbox.hcq[65] = -2374166477569289227L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final int hashCode() {
        v0 /* !! */  = mo$MultiOptionHitbox.af;
        if (true) ** GOTO lbl5
        block15: while (true) {
            v0 /* !! */  = (long)(v1 - mo$MultiOptionHitbox.hcj("hdh", hcp(int ), (int)7));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -535535272: {
                    v1 = mo$MultiOptionHitbox.hcj("hdi", hcp(int ), (int)8);
                    continue block15;
                }
                case -465299623: {
                    break block15;
                }
                case 1245666322: {
                    v1 = mo$MultiOptionHitbox.hcj("hdj", hcp(int ), (int)9);
                    continue block15;
                }
            }
            break;
        }
        var3_1 = mo$MultiOptionHitbox.c;
        v2 /* !! */  = mo$MultiOptionHitbox.af;
        if (true) ** GOTO lbl19
        block16: while (true) {
            v2 /* !! */  = (long)(mo$MultiOptionHitbox.hcj("hdl", hcp(int ), (int)11) - mo$MultiOptionHitbox.hcj("hdk", hcp(int ), (int)10));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1111022479: {
                    continue block16;
                }
                case -465299623: {
                    break block16;
                }
            }
            break;
        }
        var2_2 /* !! */  = mo$MultiOptionHitbox.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_0 = mo$MultiOptionHitbox.af - mo$MultiOptionHitbox.hcj("hdm", hcp(int ), (int)12)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == mo$MultiOptionHitbox.hcj("hdn", hcg(int ), (int)13)) break;
            v3 /* !! */  = (long)mo$MultiOptionHitbox.hcj("hdo", hcg(int ), (int)14);
        }
        var1_3 = mo$MultiOptionHitbox.a;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_1) {
                    throw null;
                    return (int)mo$MultiOptionHitbox.hcj("hdp", hcg(int ), (int)15);
                }
                if (var1_3 || var1_3) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_1 = mo$MultiOptionHitbox.af - mo$MultiOptionHitbox.hcj("hdq", hcp(int ), (int)13)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == mo$MultiOptionHitbox.hcj("hdr", hcg(int ), (int)16)) break;
                    v4 /* !! */  = (long)mo$MultiOptionHitbox.hcj("hds", hcg(int ), (int)17);
                }
                return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{mo$MultiOptionHitbox.class, "setting;option;x;y;width;height", "setting", "option", "x", "y", "width", "height"}, this);
            }
            case 0: {
                var2_2 /* !! */  = (int)mo$MultiOptionHitbox.hcj("hdt", hcg(int ), (int)18);
                if (!var3_1) break;
                throw null;
            }
lbl51:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)mo$MultiOptionHitbox.hcj("hdu", hcg(int ), (int)19);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)mo$MultiOptionHitbox.hcj("hdv", hcg(int ), (int)20);
                    if (!var3_1) ** GOTO lbl51
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)mo$MultiOptionHitbox.hcj("hdw", hcg(int ), (int)21);
        ** while (!var3_1)
lbl63:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void him() {
        mo$MultiOptionHitbox.hci[0] = -1666008413;
        mo$MultiOptionHitbox.hci[1] = -1208187580;
        mo$MultiOptionHitbox.hci[2] = -1955502323;
        mo$MultiOptionHitbox.hci[3] = 84963223;
        mo$MultiOptionHitbox.hci[4] = -545426798;
        mo$MultiOptionHitbox.hci[5] = 1313344954;
        mo$MultiOptionHitbox.hci[6] = -2129875150;
        mo$MultiOptionHitbox.hci[7] = -557526815;
        mo$MultiOptionHitbox.hci[8] = -2094916608;
        mo$MultiOptionHitbox.hci[9] = 1003548868;
        mo$MultiOptionHitbox.hci[10] = 1423541445;
        mo$MultiOptionHitbox.hci[11] = -179737926;
        mo$MultiOptionHitbox.hci[12] = -1684309260;
        mo$MultiOptionHitbox.hci[13] = 1845890749;
        mo$MultiOptionHitbox.hci[14] = 80517207;
        mo$MultiOptionHitbox.hci[15] = -1246247902;
        mo$MultiOptionHitbox.hci[16] = 742032108;
        mo$MultiOptionHitbox.hci[17] = 1239872880;
        mo$MultiOptionHitbox.hci[18] = 1857687834;
        mo$MultiOptionHitbox.hci[19] = 1797222412;
        mo$MultiOptionHitbox.hci[20] = 74203551;
        mo$MultiOptionHitbox.hci[21] = 275055677;
        mo$MultiOptionHitbox.hci[22] = 103067819;
        mo$MultiOptionHitbox.hci[23] = -707491058;
        mo$MultiOptionHitbox.hci[24] = -1638272081;
        mo$MultiOptionHitbox.hci[25] = -65912007;
        mo$MultiOptionHitbox.hci[26] = -1525212095;
        mo$MultiOptionHitbox.hci[27] = -1138929348;
        mo$MultiOptionHitbox.hci[28] = 2019349581;
        mo$MultiOptionHitbox.hci[29] = -1698683737;
        mo$MultiOptionHitbox.hci[30] = 1797716108;
        mo$MultiOptionHitbox.hci[31] = 1874948816;
        mo$MultiOptionHitbox.hci[32] = 2064108221;
        mo$MultiOptionHitbox.hci[33] = -1384562359;
        mo$MultiOptionHitbox.hci[34] = 1113806442;
        mo$MultiOptionHitbox.hci[35] = -1244896594;
        mo$MultiOptionHitbox.hci[36] = 1633818548;
        mo$MultiOptionHitbox.hci[37] = 26260159;
        mo$MultiOptionHitbox.hci[38] = 959876564;
        mo$MultiOptionHitbox.hci[39] = 1342996365;
        mo$MultiOptionHitbox.hci[40] = -906411404;
        mo$MultiOptionHitbox.hci[41] = -1901977592;
        mo$MultiOptionHitbox.hci[42] = 1982783627;
        mo$MultiOptionHitbox.hci[43] = -1797794737;
        mo$MultiOptionHitbox.hci[44] = -1524451812;
        mo$MultiOptionHitbox.hci[45] = -1271130800;
        mo$MultiOptionHitbox.hci[46] = 1069544937;
        mo$MultiOptionHitbox.hci[47] = 1546272884;
        mo$MultiOptionHitbox.hci[48] = -964619862;
        mo$MultiOptionHitbox.hci[49] = -1041895091;
        mo$MultiOptionHitbox.hci[50] = -1259420078;
        mo$MultiOptionHitbox.hci[51] = 489454487;
        mo$MultiOptionHitbox.hci[52] = 1738244536;
        mo$MultiOptionHitbox.hci[53] = -1999472071;
        mo$MultiOptionHitbox.hci[54] = 144238925;
        mo$MultiOptionHitbox.hci[55] = 1708579240;
        mo$MultiOptionHitbox.hci[56] = -182025323;
        mo$MultiOptionHitbox.hci[57] = -1111264620;
        mo$MultiOptionHitbox.hci[58] = 1599662010;
        mo$MultiOptionHitbox.hci[59] = 670543836;
        mo$MultiOptionHitbox.hci[60] = -1782255947;
        mo$MultiOptionHitbox.hci[61] = -1367469320;
        mo$MultiOptionHitbox.hci[62] = -1835542235;
        mo$MultiOptionHitbox.hci[63] = 335317919;
        mo$MultiOptionHitbox.hci[64] = 1581586808;
        mo$MultiOptionHitbox.hci[65] = -164013344;
        mo$MultiOptionHitbox.hci[66] = -434346156;
        mo$MultiOptionHitbox.hci[67] = 1833688325;
        mo$MultiOptionHitbox.hci[68] = 1453219067;
        mo$MultiOptionHitbox.hci[69] = 1356999234;
        mo$MultiOptionHitbox.hci[70] = -1541613396;
        mo$MultiOptionHitbox.hci[71] = 1598636564;
        mo$MultiOptionHitbox.hci[72] = -580146718;
        mo$MultiOptionHitbox.hci[73] = -1656542485;
        mo$MultiOptionHitbox.hci[74] = -729451504;
        mo$MultiOptionHitbox.hci[75] = -218486029;
        mo$MultiOptionHitbox.hci[76] = -2020337623;
        mo$MultiOptionHitbox.hci[77] = 1670984243;
        mo$MultiOptionHitbox.hci[78] = -1340630247;
        mo$MultiOptionHitbox.hci[79] = 282416501;
        mo$MultiOptionHitbox.hci[80] = -17856750;
        mo$MultiOptionHitbox.hci[81] = 848552569;
        mo$MultiOptionHitbox.hci[82] = 426255592;
        mo$MultiOptionHitbox.hci[83] = -212317748;
        mo$MultiOptionHitbox.hci[84] = 1442058202;
        mo$MultiOptionHitbox.hci[85] = 668616562;
        mo$MultiOptionHitbox.hci[86] = -893927073;
    }
}

