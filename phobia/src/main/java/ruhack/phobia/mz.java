/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

public class mz {
    public static final boolean a;
    private float progress;
    private long startTime;
    private static long[] flfo;
    private final float duration;
    private boolean active;
    private static int[] flfg;
    private boolean completed;
    public static final int b;
    private static long[] flfn;
    private static int[] flff;
    public static final boolean c;
    private static final long mn = 7241220161316840809L;

    private static /* synthetic */ long flfm(int n2) {
        return flfn[n2] ^ flfo[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public float getProgress() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = mz.mn - mz.flfh("fllk", flfm(int ), (int)58)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == mz.flfh("flll", flfj(int ), (int)96)) break;
            v0 /* !! */  = (long)mz.flfh("fllm", flfj(int ), (int)97);
        }
        var3_1 = mz.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = mz.mn - mz.flfh("flln", flfm(int ), (int)59)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == mz.flfh("fllo", flfj(int ), (int)98)) break;
            v1 /* !! */  = (long)mz.flfh("fllp", flfj(int ), (int)99);
        }
        var2_2 = mz.b;
        v2 /* !! */  = mz.mn;
        if (true) ** GOTO lbl19
        block8: while (true) {
            v2 /* !! */  = (long)(v3 - mz.flfh("fllq", flfm(int ), (int)60));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1631373467: {
                    v3 = mz.flfh("fllr", flfm(int ), (int)61);
                    continue block8;
                }
                case -5249687: {
                    break block8;
                }
                case 185247175: {
                    v3 = mz.flfh("flls", flfm(int ), (int)62);
                    continue block8;
                }
                case 638345082: {
                    v3 = mz.flfh("fllt", flfm(int ), (int)63);
                    continue block8;
                }
            }
            break;
        }
        var1_3 = mz.a;
        if (var3_1) {
            throw null;
lbl34:
            // 1 sources

            return (float)mz.flfh("fllu", flfe(int ), (int)100);
        }
        ** while (var1_3 || var1_3)
lbl37:
        // 1 sources

        while (true) {
            if ((v4 /* !! */  = (cfr_temp_2 = mz.mn - mz.flfh("fllv", flfm(int ), (int)64)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v4 /* !! */  == mz.flfh("fllw", flfj(int ), (int)101)) break;
            v4 /* !! */  = (long)mz.flfh("fllx", flfj(int ), (int)102);
        }
        return this.progress;
    }

    private static /* synthetic */ void flol() {
        mz.flff[100] = -303668311;
        mz.flff[101] = -1320388494;
        mz.flff[102] = 596423690;
        mz.flff[103] = -1025996045;
        mz.flff[104] = -1914752152;
        mz.flff[105] = 1098569404;
        mz.flff[106] = 1925936726;
        mz.flff[107] = 2094302073;
        mz.flff[108] = 1572406859;
        mz.flff[109] = -1229724064;
        mz.flff[110] = -1801440856;
        mz.flff[111] = 1263246113;
        mz.flff[112] = 2145683125;
        mz.flff[113] = -938067158;
        mz.flff[114] = 391404268;
        mz.flff[115] = 1395177827;
        mz.flff[116] = -425650709;
        mz.flff[117] = 1355109822;
        mz.flff[118] = -232768698;
        mz.flff[119] = 153176993;
        mz.flff[120] = -308842588;
        mz.flff[121] = -648272169;
        mz.flff[122] = 0x55B33B35;
        mz.flff[123] = 1084864140;
        mz.flff[124] = 580664444;
        mz.flff[125] = 1150595905;
        mz.flff[126] = -1316804801;
        mz.flff[127] = 921988676;
        mz.flff[128] = 1656641448;
        mz.flff[129] = 826056547;
        mz.flff[130] = 240860052;
        mz.flff[131] = 1847998950;
        mz.flff[132] = -900998935;
        mz.flff[133] = -344433879;
        mz.flff[134] = 832617238;
        mz.flff[135] = 332510221;
        mz.flff[136] = 1515546855;
        mz.flff[137] = -1703233298;
        mz.flff[138] = 1031512152;
        mz.flff[139] = -120118923;
        mz.flff[140] = -483461314;
        mz.flff[141] = 675817960;
        mz.flff[142] = -721082609;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public boolean isFinished() {
        CallSite callSite;
        boolean bl2;
        block27: {
            Object object = mn;
            boolean bl3 = true;
            block10: while (true) {
                CallSite callSite2;
                if (!bl3 || (bl3 = false) || !true) {
                    object = callSite2 - mz.flfh("flnj", flfm(int ), (int)80);
                }
                switch ((int)object) {
                    case -515181903: {
                        callSite2 = mz.flfh("flnk", flfm(int ), (int)81);
                        continue block10;
                    }
                    case -5249687: {
                        break block10;
                    }
                    case 16661356: {
                        callSite2 = mz.flfh("flnl", flfm(int ), (int)82);
                        continue block10;
                    }
                }
                break;
            }
            boolean bl4 = c;
            while (true) {
                long l2;
                Object object2;
                if ((object2 = (l2 = mn - mz.flfh("flnm", flfm(int ), (int)83)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
                if (object2 == mz.flfh("flnn", flfj(int ), (int)125)) break;
                object2 = mz.flfh("flno", flfj(int ), (int)126);
            }
            int n2 = b;
            while (true) {
                long l3;
                Object object3;
                if ((object3 = (l3 = mn - mz.flfh("flnp", flfm(int ), (int)84)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
                if (object3 == mz.flfh("flnq", flfj(int ), (int)127)) {
                    bl2 = a;
                    if (bl4) {
                        throw null;
                    }
                    break;
                }
                object3 = mz.flfh("flnr", flfj(int ), (int)128);
            }
            if (bl2 || bl2) return (boolean)mz.flfh("flns", flfj(int ), (int)129);
            Object object4 = mn;
            boolean bl5 = true;
            block13: while (true) {
                CallSite callSite3;
                if (!bl5 || (bl5 = false) || !true) {
                    object4 = callSite3 - mz.flfh("flnt", flfm(int ), (int)85);
                }
                switch ((int)object4) {
                    case -2127885375: {
                        callSite3 = mz.flfh("flnu", flfm(int ), (int)86);
                        continue block13;
                    }
                    case -9619195: {
                        callSite3 = mz.flfh("flnv", flfm(int ), (int)87);
                        continue block13;
                    }
                    case -5249687: {
                        break block13;
                    }
                }
                break;
            }
            if (this.completed) {
                if (bl2) return (boolean)mz.flfh("flns", flfj(int ), (int)129);
                while (true) {
                    long l4;
                    Object object5;
                    if ((object5 = (l4 = mn - mz.flfh("flnw", flfm(int ), (int)88)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
                    if (object5 == mz.flfh("flnx", flfj(int ), (int)130)) {
                        if (!this.active) {
                            break;
                        }
                        break block27;
                    }
                    object5 = mz.flfh("flny", flfj(int ), (int)131);
                }
                if (bl2) return (boolean)mz.flfh("flns", flfj(int ), (int)129);
                callSite = mz.flfh("flnz", flfj(int ), (int)132);
                if (!bl4) return (boolean)callSite;
                throw null;
            }
        }
        if (bl2 || bl2) {
            return (boolean)mz.flfh("flns", flfj(int ), (int)129);
        }
        callSite = mz.flfh("floa", flfj(int ), (int)133);
        return (boolean)callSite;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean isActive() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = mz.mn - mz.flfh("flmt", flfm(int ), (int)71)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == mz.flfh("flmu", flfj(int ), (int)118)) break;
            v0 /* !! */  = (long)mz.flfh("flmv", flfj(int ), (int)119);
        }
        var3_1 = mz.c;
        v1 /* !! */  = mz.mn;
        if (true) ** GOTO lbl12
        block21: while (true) {
            v1 /* !! */  = (long)(v2 - mz.flfh("flmw", flfm(int ), (int)72));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -5249687: {
                    break block21;
                }
                case 250442762: {
                    v2 = mz.flfh("flmx", flfm(int ), (int)73);
                    continue block21;
                }
                case 551888272: {
                    v2 = mz.flfh("flmy", flfm(int ), (int)74);
                    continue block21;
                }
                case 1986082824: {
                    v2 = mz.flfh("flmz", flfm(int ), (int)75);
                    continue block21;
                }
            }
            break;
        }
        var2_2 /* !! */  = mz.b;
        v3 /* !! */  = mz.mn;
        if (true) ** GOTO lbl29
        block22: while (true) {
            v3 /* !! */  = (long)(mz.flfh("flnb", flfm(int ), (int)77) - mz.flfh("flna", flfm(int ), (int)76));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1655360884: {
                    continue block22;
                }
                case -5249687: {
                    break block22;
                }
            }
            break;
        }
        var1_3 = mz.a;
        if (var3_1) {
            throw null;
lbl37:
            // 2 sources

            return (boolean)mz.flfh("flnc", flfj(int ), (int)120);
        }
        if (var1_3) ** GOTO lbl37
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block10 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                v4 /* !! */  = mz.mn;
                if (true) ** GOTO lbl48
                block24: while (true) {
                    v4 /* !! */  = (long)(mz.flfh("flne", flfm(int ), (int)79) - mz.flfh("flnd", flfm(int ), (int)78));
lbl48:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -566913913: {
                            continue block24;
                        }
                        case -5249687: {
                            break block24;
                        }
                    }
                    break;
                }
                return this.active;
            }
            case 0: {
                var2_2 /* !! */  = (int)mz.flfh("flnf", flfj(int ), (int)121);
                if (var3_1) {
                    throw null;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)mz.flfh("flng", flfj(int ), (int)122);
                if (!var3_1) break;
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)mz.flfh("flnh", flfj(int ), (int)123);
                    if (!var3_1) break block10;
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)mz.flfh("flni", flfj(int ), (int)124);
        ** while (!var3_1)
lbl70:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void reset() {
        v0 /* !! */  = mz.mn;
        if (true) ** GOTO lbl5
        block39: while (true) {
            v0 /* !! */  = (long)(v1 - mz.flfh("flhu", flfm(int ), (int)21));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -5249687: {
                    break block39;
                }
                case 787826503: {
                    v1 = mz.flfh("flhv", flfm(int ), (int)22);
                    continue block39;
                }
                case 1697789250: {
                    v1 = mz.flfh("flhw", flfm(int ), (int)23);
                    continue block39;
                }
                case 1817436655: {
                    v1 = mz.flfh("flhx", flfm(int ), (int)24);
                    continue block39;
                }
            }
            break;
        }
        var3_1 = mz.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = mz.mn - mz.flfh("flhy", flfm(int ), (int)25)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == mz.flfh("flhz", flfj(int ), (int)39)) break;
            v2 /* !! */  = (long)mz.flfh("flia", flfj(int ), (int)40);
        }
        var2_2 /* !! */  = mz.b;
        v3 /* !! */  = mz.mn;
        if (true) ** GOTO lbl28
        block41: while (true) {
            v3 /* !! */  = (long)(v4 - mz.flfh("flib", flfm(int ), (int)26));
lbl28:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1259596498: {
                    v4 = mz.flfh("flic", flfm(int ), (int)27);
                    continue block41;
                }
                case -5249687: {
                    break block41;
                }
                case 424477636: {
                    v4 = mz.flfh("flid", flfm(int ), (int)28);
                    continue block41;
                }
                case 2063167746: {
                    v4 = mz.flfh("flie", flfm(int ), (int)29);
                    continue block41;
                }
            }
            break;
        }
        var1_3 = mz.a;
        if (var3_1) {
            throw null;
lbl43:
            // 5 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl43
        v5 /* !! */  = mz.mn;
        if (true) ** GOTO lbl50
        block43: while (true) {
            v5 /* !! */  = (long)(mz.flfh("flig", flfm(int ), (int)31) - mz.flfh("flif", flfm(int ), (int)30));
lbl50:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -5249687: {
                    break block43;
                }
                case 1640175768: {
                    continue block43;
                }
            }
            break;
        }
        this.progress = 0.0f;
        if (var1_3 || var1_3) ** GOTO lbl43
        v6 = mz.flfh("flih", flfj(int ), (int)41);
        v7 /* !! */  = mz.mn;
        if (true) ** GOTO lbl62
        block44: while (true) {
            v7 /* !! */  = (long)(v8 - mz.flfh("flii", flfm(int ), (int)32));
lbl62:
            // 2 sources

            switch ((int)v7 /* !! */ ) {
                case -517434883: {
                    v8 = mz.flfh("flij", flfm(int ), (int)33);
                    continue block44;
                }
                case -5249687: {
                    break block44;
                }
                case 130300067: {
                    v8 = mz.flfh("flik", flfm(int ), (int)34);
                    continue block44;
                }
            }
            break;
        }
        this.completed = v6;
        if (var1_3 || var1_3) ** GOTO lbl43
        v9 = mz.flfh("flil", flfj(int ), (int)42);
        while (true) {
            if ((v10 /* !! */  = (cfr_temp_1 = mz.mn - mz.flfh("flim", flfm(int ), (int)35)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v10 /* !! */  == mz.flfh("flin", flfj(int ), (int)43)) break;
            v10 /* !! */  = (long)mz.flfh("flio", flfj(int ), (int)44);
        }
        this.active = v9;
        if (var1_3 || var1_3) ** GOTO lbl43
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v11 = mz.flfh("flip", flfm(int ), (int)36);
                v12 /* !! */  = mz.mn;
                if (true) ** GOTO lbl89
                block46: while (true) {
                    v12 /* !! */  = (long)(mz.flfh("flir", flfm(int ), (int)38) - mz.flfh("fliq", flfm(int ), (int)37));
lbl89:
                    // 2 sources

                    switch ((int)v12 /* !! */ ) {
                        case -650531621: {
                            continue block46;
                        }
                        case -5249687: {
                            break block46;
                        }
                    }
                    break;
                }
                this.startTime = (long)v11;
                if (var1_3 || var1_3) ** continue;
                return;
            }
lbl97:
            // 3 sources

            case 0: {
                var2_2 /* !! */  = (int)mz.flfh("flis", flfj(int ), (int)45);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl142
            }
lbl102:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)mz.flfh("flit", flfj(int ), (int)46);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl129
            }
            case 2: {
                var2_2 /* !! */  = (int)mz.flfh("fliu", flfj(int ), (int)47);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl129
            }
lbl112:
            // 2 sources

            case 3: {
                var2_2 /* !! */  = (int)mz.flfh("fliv", flfj(int ), (int)48);
                if (!var3_1) ** GOTO lbl97
                throw null;
            }
            case 4: {
                var2_2 /* !! */  = (int)mz.flfh("fliw", flfj(int ), (int)49);
                if (!var3_1) ** GOTO lbl97
                throw null;
            }
            case 5: {
                var2_2 /* !! */  = (int)mz.flfh("flix", flfj(int ), (int)50);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl142
            }
lbl125:
            // 2 sources

            case 6: {
                var2_2 /* !! */  = (int)mz.flfh("fliy", flfj(int ), (int)51);
                if (!var3_1) ** GOTO lbl112
                throw null;
            }
lbl129:
            // 3 sources

            case 7: {
                var2_2 /* !! */  = (int)mz.flfh("fliz", flfj(int ), (int)52);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl138
            }
            case 8: {
                var2_2 /* !! */  = (int)mz.flfh("flja", flfj(int ), (int)53);
                if (!var3_1) ** GOTO lbl125
                throw null;
            }
lbl138:
            // 2 sources

            case 9: {
                var2_2 /* !! */  = (int)mz.flfh("fljb", flfj(int ), (int)54);
                if (!var3_1) ** GOTO lbl102
                throw null;
            }
lbl142:
            // 3 sources

            case 10: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)mz.flfh("fljc", flfj(int ), (int)55);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 11: 
        }
        var2_2 /* !! */  = (int)mz.flfh("fljd", flfj(int ), (int)56);
        ** while (!var3_1)
lbl150:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ float flfe(int n2) {
        return Float.intBitsToFloat(flff[n2] ^ flfg[n2]);
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public mz(float var1_1) {
        var3_2 /* !! */  = mz.b;
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block10: while (true) {
            block12: {
                switch (cfr_temp_0 == -2147483648 ? var3_2 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        super();
                        this.progress = 0.0f;
                        this.duration = var1_1 * mz.flfh("flfi", flfe(int ), (int)0);
                        this.completed = mz.flfh("flfk", flfj(int ), (int)1);
                        this.active = mz.flfh("flfl", flfj(int ), (int)2);
                        this.startTime = (long)mz.flfh("flfp", flfm(int ), (int)0);
                        return;
                    }
                    case 3: {
                        var3_2 /* !! */  = (int)mz.flfh("flft", flfj(int ), (int)6);
                    }
                    case 6: {
                        var3_2 /* !! */  = (int)mz.flfh("flfw", flfj(int ), (int)9);
                    }
                    case 0: {
                        var3_2 /* !! */  = (int)mz.flfh("flfq", flfj(int ), (int)3);
                    }
                    case 1: {
                        var3_2 /* !! */  = (int)mz.flfh("flfr", flfj(int ), (int)4);
                        cfr_temp_0 = 5;
                        break block12;
                    }
                    case 7: {
                        var3_2 /* !! */  = (int)mz.flfh("flfx", flfj(int ), (int)10);
                        ** GOTO lbl-1000
                    }
                    case 2: {
                        var3_2 /* !! */  = (int)mz.flfh("flfs", flfj(int ), (int)5);
                    }
                    case 4: lbl-1000:
                    // 2 sources

                    {
                        var3_2 /* !! */  = (int)mz.flfh("flfu", flfj(int ), (int)7);
                    }
                    case 5: 
                }
                ** GOTO lbl36
            }
            while (true) {
                if (true) continue block10;
lbl36:
                // 2 sources

                var3_2 /* !! */  = (int)mz.flfh("flfv", flfj(int ), (int)8);
                cfr_temp_0 = 2;
            }
            break;
        }
    }

    private static /* synthetic */ void floo() {
        mz.flfn[0] = -4691229453174107496L;
        mz.flfn[1] = -7197983501870611836L;
        mz.flfn[2] = -2922012863778129684L;
        mz.flfn[3] = -8194788062855103368L;
        mz.flfn[4] = 6020222759360816366L;
        mz.flfn[5] = -3265966438156180136L;
        mz.flfn[6] = 3826720110430566303L;
        mz.flfn[7] = 5357683863449214203L;
        mz.flfn[8] = 1982233392867347151L;
        mz.flfn[9] = 133607955222347452L;
        mz.flfn[10] = 8325664168267525723L;
        mz.flfn[11] = 4172331554065236739L;
        mz.flfn[12] = 3623477595617681356L;
        mz.flfn[13] = -1511850306614554513L;
        mz.flfn[14] = -9129326915993405285L;
        mz.flfn[15] = 4596688546609499219L;
        mz.flfn[16] = -1746983191178735724L;
        mz.flfn[17] = 8471890254218992106L;
        mz.flfn[18] = -6081913422372529362L;
        mz.flfn[19] = 895726710440270718L;
        mz.flfn[20] = 6595948412681492675L;
        mz.flfn[21] = 7615362387352217475L;
        mz.flfn[22] = 682655621943500353L;
        mz.flfn[23] = 8953451617921234649L;
        mz.flfn[24] = 3048656005732322022L;
        mz.flfn[25] = -693690956765699758L;
        mz.flfn[26] = -320802948119984956L;
        mz.flfn[27] = 4735506510522150276L;
        mz.flfn[28] = -471822165708270509L;
        mz.flfn[29] = -3109886070626558383L;
        mz.flfn[30] = -1697196938501386320L;
        mz.flfn[31] = -8995626698638763449L;
        mz.flfn[32] = 7417879798758231188L;
        mz.flfn[33] = 4878943675376368837L;
        mz.flfn[34] = 136314207505920502L;
        mz.flfn[35] = -4021305546234000559L;
        mz.flfn[36] = 2455090175819057651L;
        mz.flfn[37] = 2084139018270384483L;
        mz.flfn[38] = -4516727466859245612L;
        mz.flfn[39] = 5910425376092620461L;
        mz.flfn[40] = -4862049938775398404L;
        mz.flfn[41] = 8277395694822873459L;
        mz.flfn[42] = 6288458145356077900L;
        mz.flfn[43] = 2895843397016534504L;
        mz.flfn[44] = -8464897399551383334L;
        mz.flfn[45] = 3015867869678499876L;
        mz.flfn[46] = -422572370757110761L;
        mz.flfn[47] = -6361996404171616800L;
        mz.flfn[48] = -3130742010667638659L;
        mz.flfn[49] = -2199281344083350877L;
        mz.flfn[50] = 1888033478842320343L;
        mz.flfn[51] = -4267971131768523746L;
        mz.flfn[52] = -7355404684335947376L;
        mz.flfn[53] = -6936479747186828168L;
        mz.flfn[54] = -6362695449646884907L;
        mz.flfn[55] = -5828769930702169748L;
        mz.flfn[56] = 7268668975024568040L;
        mz.flfn[57] = -4921173032255971851L;
        mz.flfn[58] = -1687559042915379779L;
        mz.flfn[59] = 513965329252187844L;
        mz.flfn[60] = -2917777315830808083L;
        mz.flfn[61] = -5154213696060672653L;
        mz.flfn[62] = 4628740009627649049L;
        mz.flfn[63] = 95038894869358815L;
        mz.flfn[64] = -1649348709840463491L;
        mz.flfn[65] = -6231101285122224073L;
        mz.flfn[66] = -1667691365536381788L;
        mz.flfn[67] = -4678845986745445697L;
        mz.flfn[68] = 3140671092471312780L;
        mz.flfn[69] = 850187574374373128L;
        mz.flfn[70] = -785077826614054580L;
        mz.flfn[71] = -1860169033124932533L;
        mz.flfn[72] = 7873171503265519197L;
        mz.flfn[73] = 6728798580545405176L;
        mz.flfn[74] = 7655485639473669876L;
        mz.flfn[75] = 7450171088883032517L;
        mz.flfn[76] = -1595154359899512321L;
        mz.flfn[77] = 8281732446001056774L;
        mz.flfn[78] = -1394076622073118096L;
        mz.flfn[79] = -7872499839481886497L;
        mz.flfn[80] = -1046471134725332057L;
        mz.flfn[81] = -7090342348843385716L;
        mz.flfn[82] = 3658373433408565399L;
        mz.flfn[83] = 5110889227843210320L;
        mz.flfn[84] = 3172771042805348371L;
        mz.flfn[85] = 338931471634944637L;
        mz.flfn[86] = -5537049876126019330L;
        mz.flfn[87] = 7685345783180422143L;
        mz.flfn[88] = -138046850902648669L;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public void start() {
        v0 /* !! */  = mz.mn;
        block43: while (true) {
            switch ((int)v0 /* !! */ ) {
                case -1916993304: {
                    v0 /* !! */  = (long)(mz.flfh("flfz", flfm(int ), (int)2) - mz.flfh("flfy", flfm(int ), (int)1));
                    continue block43;
                }
                case -5249687: {
                    break block43;
                }
            }
            break;
        }
        var3_1 = mz.c;
        while (true) {
            block84: {
                if ((v1 /* !! */  = (cfr_temp_1 = mz.mn - mz.flfh("flga", flfm(int ), (int)3)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v1 /* !! */  != mz.flfh("flgb", flfj(int ), (int)11)) break block84;
                var2_2 /* !! */  = mz.b;
                v2 /* !! */  = mz.mn;
                if (true) ** GOTO lbl22
            }
            v1 /* !! */  = (long)mz.flfh("flgc", flfj(int ), (int)12);
        }
        block45: while (true) {
            v2 /* !! */  = (long)(v3 - mz.flfh("flgd", flfm(int ), (int)4));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -888765831: {
                    v3 = mz.flfh("flge", flfm(int ), (int)5);
                    continue block45;
                }
                case -5249687: {
                    break block45;
                }
                case 801499906: {
                    v3 = mz.flfh("flgf", flfm(int ), (int)6);
                    continue block45;
                }
                case 1071296659: {
                    v3 = mz.flfh("flgg", flfm(int ), (int)7);
                    continue block45;
                }
            }
            break;
        }
        var1_3 = mz.a;
        if (var3_1) {
            throw null;
        }
        if (var1_3 || var1_3) return;
        v4 /* !! */  = mz.mn;
        if (true) ** GOTO lbl42
        block46: while (true) {
            v4 /* !! */  = (long)(v5 - mz.flfh("flgh", flfm(int ), (int)8));
lbl42:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -5249687: {
                    break block46;
                }
                case 242148123: {
                    v5 = mz.flfh("flgi", flfm(int ), (int)9);
                    continue block46;
                }
                case 1559476313: {
                    v5 = mz.flfh("flgj", flfm(int ), (int)10);
                    continue block46;
                }
            }
            break;
        }
        if (this.active) ** GOTO lbl201
        if (var1_3) return;
        while (true) {
            block85: {
                if ((v6 /* !! */  = (cfr_temp_2 = mz.mn - mz.flfh("flgk", flfm(int ), (int)11)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v6 /* !! */  != mz.flfh("flgl", flfj(int ), (int)13)) break block85;
                if (!this.completed) {
                    break;
                }
                ** GOTO lbl201
            }
            v6 /* !! */  = (long)mz.flfh("flgm", flfj(int ), (int)14);
        }
        if (var1_3 || var1_3) return;
        v7 /* !! */  = mz.mn;
        if (true) ** GOTO lbl68
        block48: while (true) {
            v7 /* !! */  = (long)(v8 - mz.flfh("flgn", flfm(int ), (int)12));
lbl68:
            // 2 sources

            switch ((int)v7 /* !! */ ) {
                case -1929337892: {
                    v8 = mz.flfh("flgo", flfm(int ), (int)13);
                    continue block48;
                }
                case -974758250: {
                    v8 = mz.flfh("flgp", flfm(int ), (int)14);
                    continue block48;
                }
                case -5249687: {
                    break block48;
                }
                case 1857742905: {
                    v8 = mz.flfh("flgq", flfm(int ), (int)15);
                    continue block48;
                }
            }
            break;
        }
        this.progress = 0.0f;
        if (var1_3) return;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block49: while (true) {
            block86: {
                switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var1_3) return;
                        v9 = mz.flfh("flgr", flfj(int ), (int)15);
                        while (true) {
                            if ((v10 /* !! */  = (cfr_temp_3 = mz.mn - mz.flfh("flgs", flfm(int ), (int)16)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                                continue;
                            }
                            if (v10 /* !! */  == mz.flfh("flgt", flfj(int ), (int)16)) {
                                this.completed = v9;
                                if (var1_3) return;
                                break;
                            }
                            v10 /* !! */  = (long)mz.flfh("flgu", flfj(int ), (int)17);
                        }
                        if (var1_3) return;
                        v11 = mz.flfh("flgv", flfj(int ), (int)18);
                        while (true) {
                            if ((v12 /* !! */  = (cfr_temp_4 = mz.mn - mz.flfh("flgw", flfm(int ), (int)17)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                                continue;
                            }
                            if (v12 /* !! */  == mz.flfh("flgx", flfj(int ), (int)19)) {
                                this.active = v11;
                                if (var1_3) return;
                                break;
                            }
                            v12 /* !! */  = (long)mz.flfh("flgy", flfj(int ), (int)20);
                        }
                        if (var1_3) return;
                        while (true) {
                            if ((v13 /* !! */  = (cfr_temp_5 = mz.mn - mz.flfh("flgz", flfm(int ), (int)18)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) {
                                continue;
                            }
                            if (v13 /* !! */  != mz.flfh("flha", flfj(int ), (int)21)) ** GOTO lbl117
                            v14 = System.currentTimeMillis();
                            v15 /* !! */  = mz.mn;
                            ** GOTO lbl192
lbl117:
                            // 1 sources

                            v13 /* !! */  = (long)mz.flfh("flhb", flfj(int ), (int)22);
                        }
                    }
                    case 2: {
                        var2_2 /* !! */  = (int)mz.flfh("flhg", flfj(int ), (int)25);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 0: {
                        ** GOTO lbl187
                    }
                    case 3: {
                        var2_2 /* !! */  = (int)mz.flfh("flhh", flfj(int ), (int)26);
                        cfr_temp_0 = 11;
                        if (var3_1) {
                            throw null;
                        }
                        break block86;
                    }
                    case 4: {
                        var2_2 /* !! */  = (int)mz.flfh("flhi", flfj(int ), (int)27);
                        cfr_temp_0 = 10;
                        if (var3_1) {
                            throw null;
                        }
                        break block86;
                    }
                    case 5: {
                        var2_2 /* !! */  = (int)mz.flfh("flhj", flfj(int ), (int)28);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 6: {
                        var2_2 /* !! */  = (int)mz.flfh("flhk", flfj(int ), (int)29);
                        cfr_temp_0 = 11;
                        if (var3_1) {
                            throw null;
                        }
                        break block86;
                    }
                    case 7: {
                        var2_2 /* !! */  = (int)mz.flfh("flhl", flfj(int ), (int)30);
                        if (var3_1) {
                            throw null;
                        }
                        ** GOTO lbl-1000
                    }
                    case 8: {
                        var2_2 /* !! */  = (int)mz.flfh("flhm", flfj(int ), (int)31);
                        cfr_temp_0 = 12;
                        if (var3_1) {
                            throw null;
                        }
                        break block86;
                    }
                    case 10: {
                        var2_2 /* !! */  = (int)mz.flfh("flho", flfj(int ), (int)33);
                        cfr_temp_0 = 14;
                        if (var3_1) {
                            throw null;
                        }
                        break block86;
                    }
                    case 12: {
                        var2_2 /* !! */  = (int)mz.flfh("flhq", flfj(int ), (int)35);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 11: {
                        var2_2 /* !! */  = (int)mz.flfh("flhp", flfj(int ), (int)34);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 13: {
                        do {
                            var2_2 /* !! */  = (int)mz.flfh("flhr", flfj(int ), (int)36);
                        } while (!var3_1);
                        throw null;
                    }
                    case 14: {
                        var2_2 /* !! */  = (int)mz.flfh("flhs", flfj(int ), (int)37);
                        cfr_temp_0 = 1;
                        if (var3_1) {
                            throw null;
                        }
                        break block86;
                    }
                    case 15: lbl-1000:
                    // 2 sources

                    {
                        var2_2 /* !! */  = (int)mz.flfh("flht", flfj(int ), (int)38);
                        if (var3_1) {
                            throw null;
                        }
lbl187:
                        // 3 sources

                        var2_2 /* !! */  = (int)mz.flfh("flhe", flfj(int ), (int)23);
                        cfr_temp_0 = 9;
                        if (var3_1) {
                            throw null;
                        }
                        break block86;
                    }
lbl192:
                    // 1 sources

                    block54: while (true) {
                        switch ((int)v15 /* !! */ ) {
                            case -155847013: {
                                v15 /* !! */  = (long)(mz.flfh("flhd", flfm(int ), (int)20) - mz.flfh("flhc", flfm(int ), (int)19));
                                continue block54;
                            }
                            case -5249687: {
                                break block54;
                            }
                        }
                        break;
                    }
                    this.startTime = v14;
                    if (var1_3) return;
lbl201:
                    // 3 sources

                    if (!var1_3 && !var1_3) return;
                    return;
                    case 1: {
                        var2_2 /* !! */  = (int)mz.flfh("flhf", flfj(int ), (int)24);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 9: 
                }
                ** GOTO lbl212
            }
            do {
                if (true) continue block49;
lbl212:
                // 2 sources

                var2_2 /* !! */  = (int)mz.flfh("flhn", flfj(int ), (int)32);
                cfr_temp_0 = 1;
            } while (!var3_1);
            break;
        }
        throw null;
    }

    private static /* synthetic */ void flop() {
        mz.flfo[0] = -4691229453174107496L;
        mz.flfo[1] = 1772712417772101737L;
        mz.flfo[2] = -519988823109572252L;
        mz.flfo[3] = 6034288851324226322L;
        mz.flfo[4] = -579779160023473044L;
        mz.flfo[5] = -1126116359005762981L;
        mz.flfo[6] = 4045279607294840225L;
        mz.flfo[7] = -3442197061248870397L;
        mz.flfo[8] = -1871479227904761591L;
        mz.flfo[9] = 5539028004007839700L;
        mz.flfo[10] = 3666325086164496556L;
        mz.flfo[11] = -3865774298468906484L;
        mz.flfo[12] = 674969530095612694L;
        mz.flfo[13] = 1853106797154114566L;
        mz.flfo[14] = 5087247307600095281L;
        mz.flfo[15] = 6203573086180489315L;
        mz.flfo[16] = 2808542264340829343L;
        mz.flfo[17] = 5018574833160165617L;
        mz.flfo[18] = -4192523844860692715L;
        mz.flfo[19] = 3538197904157169343L;
        mz.flfo[20] = 7417398030649823429L;
        mz.flfo[21] = -8007313605392016964L;
        mz.flfo[22] = -7848314934497876325L;
        mz.flfo[23] = -2320086506993833807L;
        mz.flfo[24] = 443434738547136304L;
        mz.flfo[25] = -7122812807942931628L;
        mz.flfo[26] = -7108643104476467488L;
        mz.flfo[27] = 6987108522908381354L;
        mz.flfo[28] = -7702810812400983424L;
        mz.flfo[29] = -2711809234205711481L;
        mz.flfo[30] = -1537986757584159211L;
        mz.flfo[31] = -1436049175371097026L;
        mz.flfo[32] = 3687780925146768521L;
        mz.flfo[33] = 7554999831520254906L;
        mz.flfo[34] = 1553388342680957197L;
        mz.flfo[35] = -5246355042516605202L;
        mz.flfo[36] = 2455090175819057651L;
        mz.flfo[37] = -5857377113364940725L;
        mz.flfo[38] = 6951176727276596518L;
        mz.flfo[39] = -3913607997949658775L;
        mz.flfo[40] = -8409756995253891555L;
        mz.flfo[41] = -7016130379365328754L;
        mz.flfo[42] = 7210664440952347426L;
        mz.flfo[43] = -2787806276829073336L;
        mz.flfo[44] = -874283424531736822L;
        mz.flfo[45] = 564048706851632895L;
        mz.flfo[46] = -3084333559557450777L;
        mz.flfo[47] = 2790875908299924019L;
        mz.flfo[48] = 1266536147256413034L;
        mz.flfo[49] = 5253039682278700010L;
        mz.flfo[50] = -8282805138653643953L;
        mz.flfo[51] = 5332036993839443903L;
        mz.flfo[52] = 7173036707226858072L;
        mz.flfo[53] = -608761382370505662L;
        mz.flfo[54] = -5299795222927883283L;
        mz.flfo[55] = 3845039671041182199L;
        mz.flfo[56] = -5776730619990026381L;
        mz.flfo[57] = -1219014876912177745L;
        mz.flfo[58] = -7303710532865376703L;
        mz.flfo[59] = 6969967766226423673L;
        mz.flfo[60] = 5000769324502201123L;
        mz.flfo[61] = 2629386666686752529L;
        mz.flfo[62] = 8910068756528189087L;
        mz.flfo[63] = -3119249450981695945L;
        mz.flfo[64] = 1969363495514402881L;
        mz.flfo[65] = -1809261898611375358L;
        mz.flfo[66] = -8106160659073222557L;
        mz.flfo[67] = 8818675027127224238L;
        mz.flfo[68] = -8140701369254277874L;
        mz.flfo[69] = -6867540516908711987L;
        mz.flfo[70] = 3872696331775841753L;
        mz.flfo[71] = 285255489427296087L;
        mz.flfo[72] = -4488330634643979070L;
        mz.flfo[73] = -8865017016257356636L;
        mz.flfo[74] = 421360037940893455L;
        mz.flfo[75] = 2067688640910811500L;
        mz.flfo[76] = 4518064346137095460L;
        mz.flfo[77] = 4706757298538364471L;
        mz.flfo[78] = 8952643364548868786L;
        mz.flfo[79] = -4139208444855529987L;
        mz.flfo[80] = -8512899707891678650L;
        mz.flfo[81] = -8704269638418339927L;
        mz.flfo[82] = -1756889587873927559L;
        mz.flfo[83] = -2685216362950654260L;
        mz.flfo[84] = -7413713502790543774L;
        mz.flfo[85] = 223302813305597872L;
        mz.flfo[86] = -8253279558520381945L;
        mz.flfo[87] = 1684457131820699392L;
        mz.flfo[88] = -6756718356781329644L;
    }

    private static /* synthetic */ int flfj(int n2) {
        return flff[n2] ^ flfg[n2];
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public void update() {
        v0 /* !! */  = mz.mn;
        block44: while (true) {
            switch ((int)v0 /* !! */ ) {
                case -1535898588: {
                    v0 /* !! */  = (long)(mz.flfh("fljf", flfm(int ), (int)40) - mz.flfh("flje", flfm(int ), (int)39));
                    continue block44;
                }
                case -5249687: {
                    break block44;
                }
            }
            break;
        }
        var5_1 = mz.c;
        v1 /* !! */  = mz.mn;
        block45: while (true) {
            switch ((int)v1 /* !! */ ) {
                case -249923044: {
                    v1 /* !! */  = (long)(mz.flfh("fljh", flfm(int ), (int)42) - mz.flfh("fljg", flfm(int ), (int)41));
                    continue block45;
                }
                case -5249687: {
                    break block45;
                }
            }
            break;
        }
        var4_2 /* !! */  = mz.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = mz.mn - mz.flfh("flji", flfm(int ), (int)43)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == mz.flfh("fljj", flfj(int ), (int)57)) {
                var3_3 = mz.a;
                if (var5_1) {
                    throw null;
                }
                break;
            }
            v2 /* !! */  = (long)mz.flfh("fljk", flfj(int ), (int)58);
        }
        if (var3_3 || var3_3) return;
        v3 /* !! */  = mz.mn;
        block47: while (true) {
            switch ((int)v3 /* !! */ ) {
                case -1808302396: {
                    v3 /* !! */  = (long)(mz.flfh("fljm", flfm(int ), (int)45) - mz.flfh("fljl", flfm(int ), (int)44));
                    continue block47;
                }
                case -5249687: {
                    break block47;
                }
            }
            break;
        }
        if (!this.active) {
            if (var3_3) return;
            return;
        }
        if (var3_3 || var3_3) return;
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_2 = mz.mn - mz.flfh("fljn", flfm(int ), (int)46)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == mz.flfh("fljo", flfj(int ), (int)59)) break;
            v4 /* !! */  = (long)mz.flfh("fljp", flfj(int ), (int)60);
        }
        v5 = System.currentTimeMillis();
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_3 = mz.mn - mz.flfh("fljq", flfm(int ), (int)47)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v6 /* !! */  == mz.flfh("fljr", flfj(int ), (int)61)) {
                var1_4 = v5 - this.startTime;
                if (var3_3) return;
                break;
            }
            v6 /* !! */  = (long)mz.flfh("fljs", flfj(int ), (int)62);
        }
        if (var3_3) return;
        v7 = var1_4;
        v8 /* !! */  = mz.mn;
        block50: while (true) {
            switch ((int)v8 /* !! */ ) {
                case -189399057: {
                    v8 /* !! */  = (long)(mz.flfh("flju", flfm(int ), (int)49) - mz.flfh("fljt", flfm(int ), (int)48));
                    continue block50;
                }
                case -5249687: {
                    break block50;
                }
            }
            break;
        }
        v9 = v7 / this.duration;
        v10 /* !! */  = mz.mn;
        if (true) ** GOTO lbl70
        block51: while (true) {
            v10 /* !! */  = (long)(v11 - mz.flfh("fljv", flfm(int ), (int)50));
lbl70:
            // 2 sources

            switch ((int)v10 /* !! */ ) {
                case -1596337705: {
                    v11 = mz.flfh("fljw", flfm(int ), (int)51);
                    continue block51;
                }
                case -5249687: {
                    break block51;
                }
                case 1066246393: {
                    v11 = mz.flfh("fljx", flfm(int ), (int)52);
                    continue block51;
                }
            }
            break;
        }
        v12 = Math.min(v9, 1.0f);
        while (true) {
            if ((v13 /* !! */  = (cfr_temp_4 = mz.mn - mz.flfh("fljy", flfm(int ), (int)53)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v13 /* !! */  == mz.flfh("fljz", flfj(int ), (int)63)) {
                this.progress = v12;
                if (var3_3) return;
                break;
            }
            v13 /* !! */  = (long)mz.flfh("flka", flfj(int ), (int)64);
        }
        if (var3_3) return;
        while (true) {
            block87: {
                if ((v14 /* !! */  = (cfr_temp_5 = mz.mn - mz.flfh("flkb", flfm(int ), (int)54)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                if (v14 /* !! */  != mz.flfh("flkc", flfj(int ), (int)65)) break block87;
                if (this.progress >= 1.0f) {
                    break;
                }
                ** GOTO lbl-1000
            }
            v14 /* !! */  = (long)mz.flfh("flkd", flfj(int ), (int)66);
        }
        if (var3_3 || var3_3) return;
        while (true) {
            if ((v15 /* !! */  = (cfr_temp_6 = mz.mn - mz.flfh("flke", flfm(int ), (int)55)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
            if (v15 /* !! */  == mz.flfh("flkf", flfj(int ), (int)67)) {
                this.progress = 1.0f;
                if (var3_3) return;
                break;
            }
            v15 /* !! */  = (long)mz.flfh("flkg", flfj(int ), (int)68);
        }
        if (var3_3) return;
        v16 = mz.flfh("flkh", flfj(int ), (int)69);
        while (true) {
            if ((v17 /* !! */  = (cfr_temp_7 = mz.mn - mz.flfh("flki", flfm(int ), (int)56)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
            if (v17 /* !! */  == mz.flfh("flkj", flfj(int ), (int)70)) {
                this.completed = v16;
                if (var3_3) return;
                break;
            }
            v17 /* !! */  = (long)mz.flfh("flkk", flfj(int ), (int)71);
        }
        if (var3_3) return;
        v18 = mz.flfh("flkl", flfj(int ), (int)72);
        while (true) {
            if ((v19 /* !! */  = (cfr_temp_8 = mz.mn - mz.flfh("flkm", flfm(int ), (int)57)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
            if (v19 /* !! */  == mz.flfh("flkn", flfj(int ), (int)73)) {
                this.active = v18;
                if (var3_3) return;
                break;
            }
            v19 /* !! */  = (long)mz.flfh("flko", flfj(int ), (int)74);
        }
        if (var4_2 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block57: do {
            switch (cfr_temp_0 == -2147483648 ? var4_2 /* !! */  : cfr_temp_0) {
                default: lbl-1000:
                // 3 sources

                {
                    if (!var3_3 && !var3_3) return;
                    return;
                }
                case 0: {
                    var4_2 /* !! */  = (int)mz.flfh("flkp", flfj(int ), (int)75);
                    cfr_temp_0 = 12;
                    if (!var5_1) continue block57;
                    throw null;
                }
                case 1: {
                    var4_2 /* !! */  = (int)mz.flfh("flkq", flfj(int ), (int)76);
                    cfr_temp_0 = 7;
                    if (!var5_1) continue block57;
                    throw null;
                }
                case 2: {
                    var4_2 /* !! */  = (int)mz.flfh("flkr", flfj(int ), (int)77);
                    cfr_temp_0 = 18;
                    if (!var5_1) continue block57;
                    throw null;
                }
                case 4: {
                    var4_2 /* !! */  = (int)mz.flfh("flkt", flfj(int ), (int)79);
                    cfr_temp_0 = 19;
                    if (!var5_1) continue block57;
                    throw null;
                }
                case 5: {
                    var4_2 /* !! */  = (int)mz.flfh("flku", flfj(int ), (int)80);
                    cfr_temp_0 = 10;
                    if (!var5_1) continue block57;
                    throw null;
                }
                case 7: {
                    var4_2 /* !! */  = (int)mz.flfh("flkw", flfj(int ), (int)82);
                    cfr_temp_0 = 12;
                    if (!var5_1) continue block57;
                    throw null;
                }
                case 9: {
                    do {
                        var4_2 /* !! */  = (int)mz.flfh("flky", flfj(int ), (int)84);
                    } while (!var5_1);
                    throw null;
                }
                case 10: {
                    var4_2 /* !! */  = (int)mz.flfh("flkz", flfj(int ), (int)85);
                    cfr_temp_0 = 11;
                    if (!var5_1) continue block57;
                    throw null;
                }
                case 13: {
                    var4_2 /* !! */  = (int)mz.flfh("fllc", flfj(int ), (int)88);
                    if (var5_1) {
                        throw null;
                    }
                }
                case 11: {
                    var4_2 /* !! */  = (int)mz.flfh("flla", flfj(int ), (int)86);
                    if (var5_1) {
                        throw null;
                    }
                }
                case 12: {
                    var4_2 /* !! */  = (int)mz.flfh("fllb", flfj(int ), (int)87);
                    cfr_temp_0 = 18;
                    if (!var5_1) continue block57;
                    throw null;
                }
                case 14: {
                    var4_2 /* !! */  = (int)mz.flfh("flld", flfj(int ), (int)89);
                    cfr_temp_0 = 17;
                    if (!var5_1) continue block57;
                    throw null;
                }
                case 16: {
                    ** GOTO lbl207
                }
                case 19: {
                    var4_2 /* !! */  = (int)mz.flfh("flli", flfj(int ), (int)94);
                    if (var5_1) {
                        throw null;
                    }
                }
                case 18: {
                    var4_2 /* !! */  = (int)mz.flfh("fllh", flfj(int ), (int)93);
                    cfr_temp_0 = 8;
                    if (!var5_1) continue block57;
                    throw null;
                }
                case 20: {
                    var4_2 /* !! */  = (int)mz.flfh("fllj", flfj(int ), (int)95);
                    if (var5_1) {
                        throw null;
                    }
lbl207:
                    // 3 sources

                    var4_2 /* !! */  = (int)mz.flfh("fllf", flfj(int ), (int)91);
                    if (var5_1) {
                        throw null;
                    }
                }
                case 17: {
                    var4_2 /* !! */  = (int)mz.flfh("fllg", flfj(int ), (int)92);
                    if (var5_1) {
                        throw null;
                    }
                }
                case 6: {
                    var4_2 /* !! */  = (int)mz.flfh("flkv", flfj(int ), (int)81);
                    if (var5_1) {
                        throw null;
                    }
                }
                case 3: {
                    var4_2 /* !! */  = (int)mz.flfh("flks", flfj(int ), (int)78);
                    if (var5_1) {
                        throw null;
                    }
                }
                case 8: {
                    var4_2 /* !! */  = (int)mz.flfh("flkx", flfj(int ), (int)83);
                    if (var5_1) {
                        throw null;
                    }
                }
                case 15: 
            }
            break;
        } while (true);
        do {
            var4_2 /* !! */  = (int)mz.flfh("flle", flfj(int ), (int)90);
        } while (!var5_1);
        throw null;
    }

    private static /* synthetic */ void flon() {
        mz.flfg[100] = -760518233;
        mz.flfg[101] = -1320388493;
        mz.flfg[102] = 1283002788;
        mz.flfg[103] = -1025996048;
        mz.flfg[104] = -1914752149;
        mz.flfg[105] = 1098569406;
        mz.flfg[106] = 1925936726;
        mz.flfg[107] = 2094302072;
        mz.flfg[108] = 657264189;
        mz.flfg[109] = 1229724063;
        mz.flfg[110] = -490709646;
        mz.flfg[111] = 1263246112;
        mz.flfg[112] = 2145683124;
        mz.flfg[113] = 1644404176;
        mz.flfg[114] = 391404269;
        mz.flfg[115] = 1395177825;
        mz.flfg[116] = -425650711;
        mz.flfg[117] = 1355109821;
        mz.flfg[118] = -232768697;
        mz.flfg[119] = -1287733576;
        mz.flfg[120] = -308842588;
        mz.flfg[121] = -648272169;
        mz.flfg[122] = 1437809462;
        mz.flfg[123] = 1084864142;
        mz.flfg[124] = 580664445;
        mz.flfg[125] = 1150595904;
        mz.flfg[126] = -199429669;
        mz.flfg[127] = 921988677;
        mz.flfg[128] = -983782160;
        mz.flfg[129] = 826056547;
        mz.flfg[130] = 240860053;
        mz.flfg[131] = -1371532508;
        mz.flfg[132] = -900998936;
        mz.flfg[133] = -344433879;
        mz.flfg[134] = 832617235;
        mz.flfg[135] = 332510217;
        mz.flfg[136] = 1515546851;
        mz.flfg[137] = -1703233303;
        mz.flfg[138] = 1031512144;
        mz.flfg[139] = -120118923;
        mz.flfg[140] = -483461316;
        mz.flfg[141] = 675817967;
        mz.flfg[142] = -721082609;
    }

    public static /* synthetic */ CallSite flfh(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    static {
        flff = new int[143];
        flfg = new int[143];
        mz.flok();
        mz.flol();
        mz.flom();
        mz.flon();
        flfn = new long[89];
        flfo = new long[89];
        mz.floo();
        mz.flop();
    }

    private static /* synthetic */ void flok() {
        mz.flff[0] = -817332915;
        mz.flff[1] = -1366985281;
        mz.flff[2] = 810060965;
        mz.flff[3] = 442898020;
        mz.flff[4] = 1441961735;
        mz.flff[5] = -1089590887;
        mz.flff[6] = -802570230;
        mz.flff[7] = -290676365;
        mz.flff[8] = 40525357;
        mz.flff[9] = -1078879186;
        mz.flff[10] = -1979375554;
        mz.flff[11] = 1201710015;
        mz.flff[12] = 357446816;
        mz.flff[13] = 1376228303;
        mz.flff[14] = -721472057;
        mz.flff[15] = 17981105;
        mz.flff[16] = 141078795;
        mz.flff[17] = -161545730;
        mz.flff[18] = -1218290882;
        mz.flff[19] = 2077634378;
        mz.flff[20] = -2132517281;
        mz.flff[21] = 1393389743;
        mz.flff[22] = 1377841297;
        mz.flff[23] = -1200871052;
        mz.flff[24] = -1747953649;
        mz.flff[25] = -232278666;
        mz.flff[26] = 1805267458;
        mz.flff[27] = 1011723408;
        mz.flff[28] = -1540406116;
        mz.flff[29] = -719228901;
        mz.flff[30] = 1833660755;
        mz.flff[31] = -37173361;
        mz.flff[32] = -1792873268;
        mz.flff[33] = -37365366;
        mz.flff[34] = -1764919416;
        mz.flff[35] = 444595908;
        mz.flff[36] = -44871514;
        mz.flff[37] = -129336959;
        mz.flff[38] = 1135815008;
        mz.flff[39] = -1235458932;
        mz.flff[40] = 805114358;
        mz.flff[41] = -1229454731;
        mz.flff[42] = 1916475705;
        mz.flff[43] = 1499354428;
        mz.flff[44] = -1726468529;
        mz.flff[45] = -235098217;
        mz.flff[46] = -780420421;
        mz.flff[47] = -683603335;
        mz.flff[48] = -1520361283;
        mz.flff[49] = -949094349;
        mz.flff[50] = 188015616;
        mz.flff[51] = -461456418;
        mz.flff[52] = -864144427;
        mz.flff[53] = -334334416;
        mz.flff[54] = 2102959002;
        mz.flff[55] = 109209077;
        mz.flff[56] = 1338584502;
        mz.flff[57] = 707019799;
        mz.flff[58] = 297455646;
        mz.flff[59] = -2087612559;
        mz.flff[60] = 59649794;
        mz.flff[61] = 1633647327;
        mz.flff[62] = 81572252;
        mz.flff[63] = 1809415967;
        mz.flff[64] = -1770487921;
        mz.flff[65] = -149014300;
        mz.flff[66] = -1740901406;
        mz.flff[67] = 1943661720;
        mz.flff[68] = 385670138;
        mz.flff[69] = 1197839213;
        mz.flff[70] = 665175437;
        mz.flff[71] = -1165100798;
        mz.flff[72] = -2141243229;
        mz.flff[73] = 483092294;
        mz.flff[74] = 1015462093;
        mz.flff[75] = 1601672956;
        mz.flff[76] = -640357546;
        mz.flff[77] = 1097935882;
        mz.flff[78] = -1756803464;
        mz.flff[79] = 1953618746;
        mz.flff[80] = -2044672093;
        mz.flff[81] = -575605284;
        mz.flff[82] = 508830851;
        mz.flff[83] = -560982682;
        mz.flff[84] = -1403071360;
        mz.flff[85] = -332492310;
        mz.flff[86] = -1754040219;
        mz.flff[87] = 342769797;
        mz.flff[88] = -2061827191;
        mz.flff[89] = -618260785;
        mz.flff[90] = -1851205095;
        mz.flff[91] = -2014196596;
        mz.flff[92] = -146668990;
        mz.flff[93] = -331593432;
        mz.flff[94] = 777418587;
        mz.flff[95] = 238410540;
        mz.flff[96] = -1110061461;
        mz.flff[97] = 409265559;
        mz.flff[98] = 1686254624;
        mz.flff[99] = 356686585;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean isCompleted() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = mz.mn - mz.flfh("flmc", flfm(int ), (int)65)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == mz.flfh("flmd", flfj(int ), (int)107)) break;
            v0 /* !! */  = (long)mz.flfh("flme", flfj(int ), (int)108);
        }
        var3_1 = mz.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = mz.mn - mz.flfh("flmf", flfm(int ), (int)66)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == mz.flfh("flmg", flfj(int ), (int)109)) break;
            v1 /* !! */  = (long)mz.flfh("flmh", flfj(int ), (int)110);
        }
        var2_2 = mz.b;
        v2 /* !! */  = mz.mn;
        if (true) ** GOTO lbl19
        block7: while (true) {
            v2 /* !! */  = (long)(v3 - mz.flfh("flmi", flfm(int ), (int)67));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1250186108: {
                    v3 = mz.flfh("flmj", flfm(int ), (int)68);
                    continue block7;
                }
                case -5249687: {
                    break block7;
                }
                case 1263616300: {
                    v3 = mz.flfh("flmk", flfm(int ), (int)69);
                    continue block7;
                }
            }
            break;
        }
        var1_3 = mz.a;
        if (var3_1) {
            throw null;
lbl31:
            // 1 sources

            return (boolean)mz.flfh("flml", flfj(int ), (int)111);
        }
        ** while (var1_3 || var1_3)
lbl34:
        // 1 sources

        while (true) {
            if ((v4 /* !! */  = (cfr_temp_2 = mz.mn - mz.flfh("flmm", flfm(int ), (int)70)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v4 /* !! */  == mz.flfh("flmn", flfj(int ), (int)112)) break;
            v4 /* !! */  = (long)mz.flfh("flmo", flfj(int ), (int)113);
        }
        return this.completed;
    }

    private static /* synthetic */ void flom() {
        mz.flfg[0] = -1959625395;
        mz.flfg[1] = -1366985281;
        mz.flfg[2] = 810060965;
        mz.flfg[3] = 442898023;
        mz.flfg[4] = 1441961728;
        mz.flfg[5] = -1089590884;
        mz.flfg[6] = -802570230;
        mz.flfg[7] = -290676361;
        mz.flfg[8] = 40525357;
        mz.flfg[9] = -1078879192;
        mz.flfg[10] = -1979375555;
        mz.flfg[11] = 1201710014;
        mz.flfg[12] = 128444522;
        mz.flfg[13] = 1376228302;
        mz.flfg[14] = 474671364;
        mz.flfg[15] = 17981105;
        mz.flfg[16] = 141078794;
        mz.flfg[17] = -611405092;
        mz.flfg[18] = -1218290881;
        mz.flfg[19] = 2077634379;
        mz.flfg[20] = -467142387;
        mz.flfg[21] = -1393389744;
        mz.flfg[22] = -888026200;
        mz.flfg[23] = -1200871044;
        mz.flfg[24] = -1747953656;
        mz.flfg[25] = -232278671;
        mz.flfg[26] = 1805267460;
        mz.flfg[27] = 1011723417;
        mz.flfg[28] = -1540406114;
        mz.flfg[29] = -719228906;
        mz.flfg[30] = 1833660752;
        mz.flfg[31] = -37173374;
        mz.flfg[32] = -1792873273;
        mz.flfg[33] = -37365364;
        mz.flfg[34] = -1764919414;
        mz.flfg[35] = 444595911;
        mz.flfg[36] = -44871515;
        mz.flfg[37] = -129336956;
        mz.flfg[38] = 1135815017;
        mz.flfg[39] = 1235458931;
        mz.flfg[40] = 322710328;
        mz.flfg[41] = -1229454731;
        mz.flfg[42] = 1916475705;
        mz.flfg[43] = -1499354429;
        mz.flfg[44] = 1642935687;
        mz.flfg[45] = -235098220;
        mz.flfg[46] = -780420423;
        mz.flfg[47] = -683603330;
        mz.flfg[48] = -1520361290;
        mz.flfg[49] = -949094349;
        mz.flfg[50] = 188015624;
        mz.flfg[51] = -461456426;
        mz.flfg[52] = -864144417;
        mz.flfg[53] = -334334410;
        mz.flfg[54] = 2102959005;
        mz.flfg[55] = 109209084;
        mz.flfg[56] = 1338584499;
        mz.flfg[57] = 707019798;
        mz.flfg[58] = 1394212458;
        mz.flfg[59] = -2087612560;
        mz.flfg[60] = 645849939;
        mz.flfg[61] = 1633647326;
        mz.flfg[62] = 1407428487;
        mz.flfg[63] = -1809415968;
        mz.flfg[64] = 1499822665;
        mz.flfg[65] = -149014299;
        mz.flfg[66] = -403652322;
        mz.flfg[67] = 1943661721;
        mz.flfg[68] = 1490320941;
        mz.flfg[69] = 1197839212;
        mz.flfg[70] = 665175436;
        mz.flfg[71] = -1600706690;
        mz.flfg[72] = -2141243229;
        mz.flfg[73] = 483092295;
        mz.flfg[74] = 2025259677;
        mz.flfg[75] = 1601672956;
        mz.flfg[76] = -640357546;
        mz.flfg[77] = 1097935885;
        mz.flfg[78] = -1756803478;
        mz.flfg[79] = 1953618746;
        mz.flfg[80] = -2044672091;
        mz.flfg[81] = -575605295;
        mz.flfg[82] = 508830849;
        mz.flfg[83] = -560982684;
        mz.flfg[84] = -1403071340;
        mz.flfg[85] = -332492313;
        mz.flfg[86] = -1754040209;
        mz.flfg[87] = 342769802;
        mz.flfg[88] = -2061827191;
        mz.flfg[89] = -618260792;
        mz.flfg[90] = -1851205089;
        mz.flfg[91] = -2014196605;
        mz.flfg[92] = -146668990;
        mz.flfg[93] = -331593433;
        mz.flfg[94] = 777418588;
        mz.flfg[95] = 238410530;
        mz.flfg[96] = 1110061460;
        mz.flfg[97] = 568433832;
        mz.flfg[98] = -1686254625;
        mz.flfg[99] = 656637816;
    }
}

