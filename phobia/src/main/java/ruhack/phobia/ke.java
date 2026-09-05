/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import ruhack.phobia.jx;

public class ke
extends jx {
    private static int[] limu;
    public static final boolean c;
    private static int[] limt;
    private List<String> selected;
    static final long tx = -4587968309584194138L;
    public static final int b;
    private static long[] linc;
    private static long[] linb;
    private List<String> list;
    public static final boolean a;

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public void setSelected(List<String> list) {
        Object object = tx;
        boolean bl2 = true;
        block16: while (true) {
            CallSite callSite;
            if (!bl2 || (bl2 = false) || !true) {
                object = callSite - ke.limv("liup", lina(int ), (int)87);
            }
            switch ((int)object) {
                case -1877365689: {
                    callSite = ke.limv("liuq", lina(int ), (int)88);
                    continue block16;
                }
                case -1001563493: {
                    callSite = ke.limv("liur", lina(int ), (int)89);
                    continue block16;
                }
                case 1786516902: {
                    break block16;
                }
            }
            break;
        }
        boolean bl3 = c;
        Object object2 = tx;
        boolean bl4 = true;
        block17: while (true) {
            CallSite callSite;
            if (!bl4 || (bl4 = false) || !true) {
                object2 = callSite - ke.limv("lius", lina(int ), (int)90);
            }
            switch ((int)object2) {
                case 181528066: {
                    callSite = ke.limv("liut", lina(int ), (int)91);
                    continue block17;
                }
                case 918234154: {
                    callSite = ke.limv("liuu", lina(int ), (int)92);
                    continue block17;
                }
                case 1044211196: {
                    callSite = ke.limv("liuv", lina(int ), (int)93);
                    continue block17;
                }
                case 1786516902: {
                    break block17;
                }
            }
            break;
        }
        int n2 = b;
        Object object3 = tx;
        boolean bl5 = true;
        block18: while (true) {
            CallSite callSite;
            if (!bl5 || (bl5 = false) || !true) {
                object3 = callSite - ke.limv("liuw", lina(int ), (int)94);
            }
            switch ((int)object3) {
                case -350536856: {
                    callSite = ke.limv("liux", lina(int ), (int)95);
                    continue block18;
                }
                case 1037565818: {
                    callSite = ke.limv("liuy", lina(int ), (int)96);
                    continue block18;
                }
                case 1786516902: {
                    break block18;
                }
            }
            break;
        }
        boolean bl6 = a;
        if (bl3) {
            throw null;
        }
        if (bl6 || bl6) return;
        while (true) {
            long l2;
            Object object4;
            if ((object4 = (l2 = tx - ke.limv("liuz", lina(int ), (int)97)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (object4 == ke.limv("liva", lims(int ), (int)111)) {
                this.selected = list;
                if (bl6) return;
                return;
            }
            object4 = ke.limv("livb", lims(int ), (int)112);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void toggle(String var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ke.tx - ke.limv("liqw", lina(int ), (int)41)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ke.limv("liqx", lims(int ), (int)60)) break;
            v0 /* !! */  = (long)ke.limv("liqy", lims(int ), (int)61);
        }
        var4_2 = ke.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ke.tx - ke.limv("liqz", lina(int ), (int)42)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == ke.limv("lira", lims(int ), (int)62)) break;
            v1 /* !! */  = (long)ke.limv("lirb", lims(int ), (int)63);
        }
        var3_3 /* !! */  = ke.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = ke.tx - ke.limv("lirc", lina(int ), (int)43)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == ke.limv("lird", lims(int ), (int)64)) break;
            v2 /* !! */  = (long)ke.limv("lire", lims(int ), (int)65);
        }
        var2_4 = ke.a;
        if (var4_2) {
            throw null;
lbl21:
            // 9 sources

            return;
        }
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4 || var2_4) ** GOTO lbl21
                if (var1_1 != null) ** GOTO lbl30
                if (var2_4) ** GOTO lbl21
                return;
lbl30:
                // 1 sources

                if (var2_4 || var2_4) ** GOTO lbl21
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_3 = ke.tx - ke.limv("lirf", lina(int ), (int)44)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == ke.limv("lirg", lims(int ), (int)66)) break;
                    v3 /* !! */  = (long)ke.limv("lirh", lims(int ), (int)67);
                }
                if (this.selected != null) ** GOTO lbl82
                if (var2_4) ** GOTO lbl21
                v4 /* !! */  = ke.tx;
                if (true) ** GOTO lbl42
                block51: while (true) {
                    v4 /* !! */  = (long)(ke.limv("lirj", lina(int ), (int)46) - ke.limv("liri", lina(int ), (int)45));
lbl42:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case 508071087: {
                            continue block51;
                        }
                        case 1786516902: {
                            break block51;
                        }
                    }
                    break;
                }
                v5 /* !! */  = ke.tx;
                if (true) ** GOTO lbl51
                block52: while (true) {
                    v5 /* !! */  = (long)(v6 - ke.limv("lirk", lina(int ), (int)47));
lbl51:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case 27807085: {
                            v6 = ke.limv("lirl", lina(int ), (int)48);
                            continue block52;
                        }
                        case 770353450: {
                            v6 = ke.limv("lirm", lina(int ), (int)49);
                            continue block52;
                        }
                        case 1330295862: {
                            v6 = ke.limv("lirn", lina(int ), (int)50);
                            continue block52;
                        }
                        case 1786516902: {
                            break block52;
                        }
                    }
                    break;
                }
                v7 = new ArrayList<String>();
                v8 /* !! */  = ke.tx;
                if (true) ** GOTO lbl68
                block53: while (true) {
                    v8 /* !! */  = (long)(v9 - ke.limv("liro", lina(int ), (int)51));
lbl68:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -1375283381: {
                            v9 = ke.limv("lirp", lina(int ), (int)52);
                            continue block53;
                        }
                        case -1029038530: {
                            v9 = ke.limv("lirq", lina(int ), (int)53);
                            continue block53;
                        }
                        case 261988449: {
                            v9 = ke.limv("lirr", lina(int ), (int)54);
                            continue block53;
                        }
                        case 1786516902: {
                            break block53;
                        }
                    }
                    break;
                }
                this.selected = v7;
                if (var2_4) ** GOTO lbl21
lbl82:
                // 2 sources

                if (var2_4 || var2_4) ** GOTO lbl21
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_4 = ke.tx - ke.limv("lirs", lina(int ), (int)55)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == ke.limv("lirt", lims(int ), (int)68)) break;
                    v10 /* !! */  = (long)ke.limv("liru", lims(int ), (int)69);
                }
                v11 /* !! */  = ke.tx;
                if (true) ** GOTO lbl92
                block55: while (true) {
                    v11 /* !! */  = (long)(v12 - ke.limv("lirv", lina(int ), (int)56));
lbl92:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -181061018: {
                            v12 = ke.limv("lirw", lina(int ), (int)57);
                            continue block55;
                        }
                        case 1519791247: {
                            v12 = ke.limv("lirx", lina(int ), (int)58);
                            continue block55;
                        }
                        case 1662091191: {
                            v12 = ke.limv("liry", lina(int ), (int)59);
                            continue block55;
                        }
                        case 1786516902: {
                            break block55;
                        }
                    }
                    break;
                }
                if (this.selected.remove(var1_1)) ** GOTO lbl129
                if (var2_4) ** GOTO lbl21
                v13 /* !! */  = ke.tx;
                if (true) ** GOTO lbl110
                block56: while (true) {
                    v13 /* !! */  = (long)(v14 - ke.limv("lirz", lina(int ), (int)60));
lbl110:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case -1514641064: {
                            v14 = ke.limv("lisa", lina(int ), (int)61);
                            continue block56;
                        }
                        case 491477226: {
                            v14 = ke.limv("lisb", lina(int ), (int)62);
                            continue block56;
                        }
                        case 629422295: {
                            v14 = ke.limv("lisc", lina(int ), (int)63);
                            continue block56;
                        }
                        case 1786516902: {
                            break block56;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v15 /* !! */  = (cfr_temp_5 = ke.tx - ke.limv("lisd", lina(int ), (int)64)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v15 /* !! */  == ke.limv("lise", lims(int ), (int)70)) break;
                    v15 /* !! */  = (long)ke.limv("lisf", lims(int ), (int)71);
                }
                this.selected.add(var1_1);
                if (var2_4) ** GOTO lbl21
lbl129:
                // 2 sources

                if (!var2_4 && !var2_4) ** break;
                ** continue;
                return;
            }
lbl132:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)ke.limv("lisg", lims(int ), (int)72);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl178
            }
lbl137:
            // 2 sources

            case 1: {
                var3_3 /* !! */  = (int)ke.limv("lish", lims(int ), (int)73);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl166
            }
lbl142:
            // 2 sources

            case 2: {
                var3_3 /* !! */  = (int)ke.limv("lisi", lims(int ), (int)74);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl190
            }
            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)ke.limv("lisj", lims(int ), (int)75);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl182
                    break;
                }
            }
lbl153:
            // 2 sources

            case 4: {
                var3_3 /* !! */  = (int)ke.limv("lisk", lims(int ), (int)76);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl162
            }
lbl158:
            // 2 sources

            case 5: {
                var3_3 /* !! */  = (int)ke.limv("lisl", lims(int ), (int)77);
                if (var4_2) {
                    throw null;
                }
            }
lbl162:
            // 7 sources

            case 6: {
                var3_3 /* !! */  = (int)ke.limv("lism", lims(int ), (int)78);
                if (!var4_2) ** GOTO lbl158
                throw null;
            }
lbl166:
            // 3 sources

            case 7: {
                var3_3 /* !! */  = (int)ke.limv("lisn", lims(int ), (int)79);
                if (!var4_2) ** GOTO lbl132
                throw null;
            }
            case 8: {
                var3_3 /* !! */  = (int)ke.limv("liso", lims(int ), (int)80);
                if (!var4_2) ** GOTO lbl153
                throw null;
            }
            case 9: {
                var3_3 /* !! */  = (int)ke.limv("lisp", lims(int ), (int)81);
                if (!var4_2) ** GOTO lbl162
                throw null;
            }
lbl178:
            // 2 sources

            case 10: {
                var3_3 /* !! */  = (int)ke.limv("lisq", lims(int ), (int)82);
                if (!var4_2) ** GOTO lbl137
                throw null;
            }
lbl182:
            // 2 sources

            case 11: {
                var3_3 /* !! */  = (int)ke.limv("lisr", lims(int ), (int)83);
                if (!var4_2) ** GOTO lbl162
                throw null;
            }
            case 12: {
                var3_3 /* !! */  = (int)ke.limv("liss", lims(int ), (int)84);
                if (!var4_2) ** GOTO lbl142
                throw null;
            }
lbl190:
            // 2 sources

            case 13: {
                var3_3 /* !! */  = (int)ke.limv("list", lims(int ), (int)85);
                if (!var4_2) ** GOTO lbl166
                throw null;
            }
            case 14: {
                var3_3 /* !! */  = (int)ke.limv("lisu", lims(int ), (int)86);
                if (!var4_2) ** GOTO lbl162
                throw null;
            }
            case 15: 
        }
        var3_3 /* !! */  = (int)ke.limv("lisv", lims(int ), (int)87);
        ** while (!var4_2)
lbl201:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ int lims(int n2) {
        return limt[n2] ^ limu[n2];
    }

    private static /* synthetic */ long lina(int n2) {
        return linb[n2] ^ linc[n2];
    }

    static {
        limt = new int[118];
        limu = new int[118];
        ke.livh();
        ke.livi();
        ke.livj();
        ke.livk();
        linb = new long[98];
        linc = new long[98];
        ke.livl();
        ke.livm();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public ke selected(String ... var1_1) {
        v0 /* !! */  = ke.tx;
        if (true) ** GOTO lbl5
        block30: while (true) {
            v0 /* !! */  = (long)(v1 - ke.limv("linx", lina(int ), (int)8));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1077448531: {
                    v1 = ke.limv("liny", lina(int ), (int)9);
                    continue block30;
                }
                case 70944402: {
                    v1 = ke.limv("linz", lina(int ), (int)10);
                    continue block30;
                }
                case 1532419557: {
                    v1 = ke.limv("lioa", lina(int ), (int)11);
                    continue block30;
                }
                case 1786516902: {
                    break block30;
                }
            }
            break;
        }
        var4_2 = ke.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = ke.tx - ke.limv("liob", lina(int ), (int)12)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == ke.limv("lioc", lims(int ), (int)16)) break;
            v2 /* !! */  = (long)ke.limv("liod", lims(int ), (int)17);
        }
        var3_3 /* !! */  = ke.b;
        v3 /* !! */  = ke.tx;
        if (true) ** GOTO lbl28
        block32: while (true) {
            v3 /* !! */  = (long)(v4 - ke.limv("lioe", lina(int ), (int)13));
lbl28:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case 1260542016: {
                    v4 = ke.limv("liof", lina(int ), (int)14);
                    continue block32;
                }
                case 1424204801: {
                    v4 = ke.limv("liog", lina(int ), (int)15);
                    continue block32;
                }
                case 1556742973: {
                    v4 = ke.limv("lioh", lina(int ), (int)16);
                    continue block32;
                }
                case 1786516902: {
                    break block32;
                }
            }
            break;
        }
        var2_4 = ke.a;
        if (var4_2) {
            throw null;
lbl43:
            // 2 sources

            return null;
        }
        if (var2_4 || var2_4) ** GOTO lbl43
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_1 = ke.tx - ke.limv("lioi", lina(int ), (int)17)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == ke.limv("lioj", lims(int ), (int)18)) break;
            v5 /* !! */  = (long)ke.limv("liok", lims(int ), (int)19);
        }
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_2 = ke.tx - ke.limv("liol", lina(int ), (int)18)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v6 /* !! */  == ke.limv("liom", lims(int ), (int)20)) break;
            v6 /* !! */  = (long)ke.limv("lion", lims(int ), (int)21);
        }
        v7 = Arrays.asList(var1_1);
        v8 /* !! */  = ke.tx;
        if (true) ** GOTO lbl61
        block36: while (true) {
            v8 /* !! */  = (long)(ke.limv("liop", lina(int ), (int)20) - ke.limv("lioo", lina(int ), (int)19));
lbl61:
            // 2 sources

            switch ((int)v8 /* !! */ ) {
                case 1530113689: {
                    continue block36;
                }
                case 1786516902: {
                    break block36;
                }
            }
            break;
        }
        v9 = new ArrayList<String>(v7);
        v10 /* !! */  = ke.tx;
        if (true) ** GOTO lbl71
        block37: while (true) {
            v10 /* !! */  = (long)(v11 - ke.limv("lioq", lina(int ), (int)21));
lbl71:
            // 2 sources

            switch ((int)v10 /* !! */ ) {
                case -2015046834: {
                    v11 = ke.limv("lior", lina(int ), (int)22);
                    continue block37;
                }
                case -1405569498: {
                    v11 = ke.limv("lios", lina(int ), (int)23);
                    continue block37;
                }
                case 69367806: {
                    v11 = ke.limv("liot", lina(int ), (int)24);
                    continue block37;
                }
                case 1786516902: {
                    break block37;
                }
            }
            break;
        }
        this.selected = v9;
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4 || var2_4) ** continue;
                return this;
            }
lbl89:
            // 3 sources

            case 0: {
                var3_3 /* !! */  = (int)ke.limv("liou", lims(int ), (int)22);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl106
            }
            case 1: {
                var3_3 /* !! */  = (int)ke.limv("liov", lims(int ), (int)23);
                if (!var4_2) ** GOTO lbl89
                throw null;
            }
            case 2: {
                var3_3 /* !! */  = (int)ke.limv("liow", lims(int ), (int)24);
                if (!var4_2) break;
                throw null;
            }
            case 3: {
                var3_3 /* !! */  = (int)ke.limv("liox", lims(int ), (int)25);
                if (var4_2) {
                    throw null;
                }
            }
lbl106:
            // 4 sources

            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)ke.limv("lioy", lims(int ), (int)26);
                    if (!var4_2) ** GOTO lbl89
                    throw null;
                }
            }
            case 5: 
        }
        var3_3 /* !! */  = (int)ke.limv("lioz", lims(int ), (int)27);
        ** while (!var4_2)
lbl114:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void livh() {
        ke.limt[0] = -2013874992;
        ke.limt[1] = -1652417318;
        ke.limt[2] = 405302711;
        ke.limt[3] = -1288387528;
        ke.limt[4] = 1558135497;
        ke.limt[5] = 1242704307;
        ke.limt[6] = 423270701;
        ke.limt[7] = 1444150752;
        ke.limt[8] = -1461848149;
        ke.limt[9] = 1845715526;
        ke.limt[10] = -584351139;
        ke.limt[11] = -2116738537;
        ke.limt[12] = -399340853;
        ke.limt[13] = -1574300777;
        ke.limt[14] = 1868312230;
        ke.limt[15] = 761319432;
        ke.limt[16] = 764672100;
        ke.limt[17] = 2049943786;
        ke.limt[18] = 1693140263;
        ke.limt[19] = -815724402;
        ke.limt[20] = 653258608;
        ke.limt[21] = -1933903786;
        ke.limt[22] = -1476326403;
        ke.limt[23] = 561390017;
        ke.limt[24] = 259664695;
        ke.limt[25] = 124566937;
        ke.limt[26] = 1932729716;
        ke.limt[27] = -728486628;
        ke.limt[28] = -1764169149;
        ke.limt[29] = 177605884;
        ke.limt[30] = 847865827;
        ke.limt[31] = 1061122927;
        ke.limt[32] = 579807256;
        ke.limt[33] = -1977242939;
        ke.limt[34] = -1277392640;
        ke.limt[35] = -1886900116;
        ke.limt[36] = 1141407197;
        ke.limt[37] = -178187946;
        ke.limt[38] = -1826361988;
        ke.limt[39] = 1264798663;
        ke.limt[40] = 314419280;
        ke.limt[41] = -1034098216;
        ke.limt[42] = 386666562;
        ke.limt[43] = -1132687037;
        ke.limt[44] = 634615646;
        ke.limt[45] = 889285500;
        ke.limt[46] = 1438188319;
        ke.limt[47] = 1334789387;
        ke.limt[48] = 522888435;
        ke.limt[49] = -1905207735;
        ke.limt[50] = -1532167110;
        ke.limt[51] = -2109686237;
        ke.limt[52] = -541196631;
        ke.limt[53] = -1056018493;
        ke.limt[54] = -659192691;
        ke.limt[55] = -1759213211;
        ke.limt[56] = 1852107475;
        ke.limt[57] = 664972340;
        ke.limt[58] = -1782929981;
        ke.limt[59] = 950141395;
        ke.limt[60] = -115485663;
        ke.limt[61] = 1682374074;
        ke.limt[62] = -262100660;
        ke.limt[63] = 1076252638;
        ke.limt[64] = 301879593;
        ke.limt[65] = -1188949015;
        ke.limt[66] = -1666962341;
        ke.limt[67] = 1015912595;
        ke.limt[68] = 105260409;
        ke.limt[69] = 983876497;
        ke.limt[70] = -483824780;
        ke.limt[71] = -141811472;
        ke.limt[72] = -1180997229;
        ke.limt[73] = 6976740;
        ke.limt[74] = 1812111565;
        ke.limt[75] = 1105154525;
        ke.limt[76] = -609554599;
        ke.limt[77] = 1486814986;
        ke.limt[78] = 908823649;
        ke.limt[79] = 1968198291;
        ke.limt[80] = -1109396510;
        ke.limt[81] = -882744697;
        ke.limt[82] = -1312178418;
        ke.limt[83] = -1005321936;
        ke.limt[84] = 898623554;
        ke.limt[85] = -1461956908;
        ke.limt[86] = 732358940;
        ke.limt[87] = 31077168;
        ke.limt[88] = 1103766227;
        ke.limt[89] = -370195549;
        ke.limt[90] = -702734542;
        ke.limt[91] = 811994585;
        ke.limt[92] = -2035049044;
        ke.limt[93] = 1569533883;
        ke.limt[94] = -1113320372;
        ke.limt[95] = -1100915252;
        ke.limt[96] = -1607981036;
        ke.limt[97] = 405136332;
        ke.limt[98] = 1129219040;
        ke.limt[99] = 467511675;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public ke value(String ... var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ke.tx - ke.limv("lind", lina(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ke.limv("line", lims(int ), (int)4)) break;
            v0 /* !! */  = (long)ke.limv("linf", lims(int ), (int)5);
        }
        var4_2 = ke.c;
        v1 /* !! */  = ke.tx;
        if (true) ** GOTO lbl11
        block18: while (true) {
            v1 /* !! */  = (long)(ke.limv("linh", lina(int ), (int)2) - ke.limv("ling", lina(int ), (int)1));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1403813373: {
                    continue block18;
                }
                case 1786516902: {
                    break block18;
                }
            }
            break;
        }
        var3_3 /* !! */  = ke.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = ke.tx - ke.limv("lini", lina(int ), (int)3)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == ke.limv("linj", lims(int ), (int)6)) break;
            v2 /* !! */  = (long)ke.limv("link", lims(int ), (int)7);
        }
        var2_4 = ke.a;
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        block4 : switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_2) {
                    throw null;
lbl28:
                    // 2 sources

                    return null;
                }
                if (var2_4 || var2_4) ** GOTO lbl28
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = ke.tx - ke.limv("linl", lina(int ), (int)4)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == ke.limv("linm", lims(int ), (int)8)) break;
                    v3 /* !! */  = (long)ke.limv("linn", lims(int ), (int)9);
                }
                v4 = Arrays.asList(var1_1);
                v5 /* !! */  = ke.tx;
                if (true) ** GOTO lbl41
                block22: while (true) {
                    v5 /* !! */  = (long)(v6 - ke.limv("lino", lina(int ), (int)5));
lbl41:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -334039108: {
                            v6 = ke.limv("linp", lina(int ), (int)6);
                            continue block22;
                        }
                        case 656063350: {
                            v6 = ke.limv("linq", lina(int ), (int)7);
                            continue block22;
                        }
                        case 1786516902: {
                            break block22;
                        }
                    }
                    break;
                }
                this.list = v4;
                if (var2_4 || var2_4) ** continue;
                return this;
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)ke.limv("linr", lims(int ), (int)10);
                    if (!var4_2) break block4;
                    throw null;
                }
            }
            case 1: {
                var3_3 /* !! */  = (int)ke.limv("lins", lims(int ), (int)11);
                if (!var4_2) break;
                throw null;
            }
lbl62:
            // 2 sources

            case 2: {
                var3_3 /* !! */  = (int)ke.limv("lint", lims(int ), (int)12);
                if (var4_2) {
                    throw null;
                }
            }
            case 3: {
                var3_3 /* !! */  = (int)ke.limv("linu", lims(int ), (int)13);
                if (!var4_2) ** GOTO lbl62
                throw null;
            }
            case 4: {
                var3_3 /* !! */  = (int)ke.limv("linv", lims(int ), (int)14);
                if (!var4_2) break;
                throw null;
            }
            case 5: 
        }
        var3_3 /* !! */  = (int)ke.limv("linw", lims(int ), (int)15);
        ** while (!var4_2)
lbl77:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public List<String> getList() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ke.tx - ke.limv("lisw", lina(int ), (int)65)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ke.limv("lisx", lims(int ), (int)88)) break;
            v0 /* !! */  = (long)ke.limv("lisy", lims(int ), (int)89);
        }
        var3_1 = ke.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ke.tx - ke.limv("lisz", lina(int ), (int)66)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == ke.limv("lita", lims(int ), (int)90)) break;
            v1 /* !! */  = (long)ke.limv("litb", lims(int ), (int)91);
        }
        var2_2 /* !! */  = ke.b;
        v2 /* !! */  = ke.tx;
        if (true) ** GOTO lbl19
        block18: while (true) {
            v2 /* !! */  = (long)(v3 - ke.limv("litc", lina(int ), (int)67));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1990075175: {
                    v3 = ke.limv("litd", lina(int ), (int)68);
                    continue block18;
                }
                case -1942104325: {
                    v3 = ke.limv("lite", lina(int ), (int)69);
                    continue block18;
                }
                case 1786516902: {
                    break block18;
                }
            }
            break;
        }
        var1_3 = ke.a;
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
                v4 /* !! */  = ke.tx;
                if (true) ** GOTO lbl41
                block20: while (true) {
                    v4 /* !! */  = (long)(v5 - ke.limv("litf", lina(int ), (int)70));
lbl41:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1825853275: {
                            v5 = ke.limv("litg", lina(int ), (int)71);
                            continue block20;
                        }
                        case -842542935: {
                            v5 = ke.limv("lith", lina(int ), (int)72);
                            continue block20;
                        }
                        case 1786516902: {
                            break block20;
                        }
                    }
                    break;
                }
                return this.list;
            }
            case 0: {
                var2_2 /* !! */  = (int)ke.limv("liti", lims(int ), (int)92);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl60
            }
            case 1: {
                var2_2 /* !! */  = (int)ke.limv("litj", lims(int ), (int)93);
                if (var3_1) {
                    throw null;
                }
            }
lbl60:
            // 4 sources

            case 2: {
                var2_2 /* !! */  = (int)ke.limv("litk", lims(int ), (int)94);
                if (!var3_1) break;
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)ke.limv("litl", lims(int ), (int)95);
        } while (!var3_1);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public ke visible(Supplier<Boolean> var1_1) {
        v0 /* !! */  = ke.tx;
        if (true) ** GOTO lbl5
        block13: while (true) {
            v0 /* !! */  = (long)(v1 - ke.limv("lipa", lina(int ), (int)25));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1723131156: {
                    v1 = ke.limv("lipb", lina(int ), (int)26);
                    continue block13;
                }
                case 1786516902: {
                    break block13;
                }
                case 1890690160: {
                    v1 = ke.limv("lipc", lina(int ), (int)27);
                    continue block13;
                }
            }
            break;
        }
        var4_2 = ke.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = ke.tx - ke.limv("lipd", lina(int ), (int)28)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == ke.limv("lipe", lims(int ), (int)28)) break;
            v2 /* !! */  = (long)ke.limv("lipf", lims(int ), (int)29);
        }
        var3_3 /* !! */  = ke.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = ke.tx - ke.limv("lipg", lina(int ), (int)29)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == ke.limv("liph", lims(int ), (int)30)) break;
            v3 /* !! */  = (long)ke.limv("lipi", lims(int ), (int)31);
        }
        var2_4 = ke.a;
        if (var4_2) {
            throw null;
lbl29:
            // 2 sources

            return null;
        }
        if (var2_4 || var2_4) ** GOTO lbl29
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = ke.tx - ke.limv("lipj", lina(int ), (int)30)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == ke.limv("lipk", lims(int ), (int)32)) break;
                    v4 /* !! */  = (long)ke.limv("lipl", lims(int ), (int)33);
                }
                this.setVisible(var1_1);
                if (var2_4 || var2_4) ** continue;
                return this;
            }
lbl43:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)ke.limv("lipm", lims(int ), (int)34);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl57
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var3_3 /* !! */  = (int)ke.limv("lipn", lims(int ), (int)35);
                    if (!var4_2) ** GOTO lbl-1000
                    throw null;
                }
            }
lbl53:
            // 2 sources

            case 2: {
                var3_3 /* !! */  = (int)ke.limv("lipo", lims(int ), (int)36);
                if (!var4_2) break;
                throw null;
            }
lbl57:
            // 2 sources

            case 3: {
                var3_3 /* !! */  = (int)ke.limv("lipp", lims(int ), (int)37);
                if (!var4_2) ** GOTO lbl43
                throw null;
            }
            case 4: {
                var3_3 /* !! */  = (int)ke.limv("lipq", lims(int ), (int)38);
                if (!var4_2) ** GOTO lbl53
                throw null;
            }
            case 5: 
        }
        var3_3 /* !! */  = (int)ke.limv("lipr", lims(int ), (int)39);
        ** while (!var4_2)
lbl68:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void livj() {
        ke.limu[0] = -2013874990;
        ke.limu[1] = -1652417318;
        ke.limu[2] = 405302710;
        ke.limu[3] = -1288387525;
        ke.limu[4] = -1558135498;
        ke.limu[5] = 638484963;
        ke.limu[6] = -423270702;
        ke.limu[7] = -2068217593;
        ke.limu[8] = -1461848150;
        ke.limu[9] = 628722010;
        ke.limu[10] = -584351137;
        ke.limu[11] = -2116738540;
        ke.limu[12] = -399340854;
        ke.limu[13] = -1574300780;
        ke.limu[14] = 1868312231;
        ke.limu[15] = 761319435;
        ke.limu[16] = 764672101;
        ke.limu[17] = -1643698108;
        ke.limu[18] = -1693140264;
        ke.limu[19] = -1124894500;
        ke.limu[20] = -653258609;
        ke.limu[21] = 407059297;
        ke.limu[22] = -1476326402;
        ke.limu[23] = 561390020;
        ke.limu[24] = 259664690;
        ke.limu[25] = 124566938;
        ke.limu[26] = 1932729719;
        ke.limu[27] = -728486632;
        ke.limu[28] = 1764169148;
        ke.limu[29] = 1605384655;
        ke.limu[30] = 847865826;
        ke.limu[31] = -533201055;
        ke.limu[32] = -579807257;
        ke.limu[33] = -1965912468;
        ke.limu[34] = -1277392636;
        ke.limu[35] = -1886900115;
        ke.limu[36] = 1141407193;
        ke.limu[37] = -178187950;
        ke.limu[38] = -1826361992;
        ke.limu[39] = 1264798662;
        ke.limu[40] = -314419281;
        ke.limu[41] = 1786656582;
        ke.limu[42] = -386666563;
        ke.limu[43] = 919764338;
        ke.limu[44] = 634615646;
        ke.limu[45] = -889285501;
        ke.limu[46] = -519216640;
        ke.limu[47] = 1334789386;
        ke.limu[48] = -52069116;
        ke.limu[49] = -1905207736;
        ke.limu[50] = -1532167110;
        ke.limu[51] = -2109686236;
        ke.limu[52] = -541196629;
        ke.limu[53] = -1056018493;
        ke.limu[54] = -659192691;
        ke.limu[55] = -1759213216;
        ke.limu[56] = 1852107479;
        ke.limu[57] = 664972336;
        ke.limu[58] = -1782929978;
        ke.limu[59] = 950141397;
        ke.limu[60] = 115485662;
        ke.limu[61] = 1570651902;
        ke.limu[62] = 262100659;
        ke.limu[63] = 1966870206;
        ke.limu[64] = -301879594;
        ke.limu[65] = 1628638116;
        ke.limu[66] = 1666962340;
        ke.limu[67] = -204778640;
        ke.limu[68] = -105260410;
        ke.limu[69] = 199899173;
        ke.limu[70] = -483824779;
        ke.limu[71] = 541072508;
        ke.limu[72] = -1180997224;
        ke.limu[73] = 6976737;
        ke.limu[74] = 1812111553;
        ke.limu[75] = 1105154518;
        ke.limu[76] = -609554593;
        ke.limu[77] = 1486814986;
        ke.limu[78] = 908823660;
        ke.limu[79] = 1968198291;
        ke.limu[80] = -1109396504;
        ke.limu[81] = -882744699;
        ke.limu[82] = -1312178426;
        ke.limu[83] = -1005321928;
        ke.limu[84] = 898623560;
        ke.limu[85] = -1461956902;
        ke.limu[86] = 732358935;
        ke.limu[87] = 31077178;
        ke.limu[88] = -1103766228;
        ke.limu[89] = 770804605;
        ke.limu[90] = -702734541;
        ke.limu[91] = 1484519702;
        ke.limu[92] = -2035049043;
        ke.limu[93] = 1569533880;
        ke.limu[94] = -1113320369;
        ke.limu[95] = -1100915252;
        ke.limu[96] = 1607981035;
        ke.limu[97] = 1951428160;
        ke.limu[98] = -1129219041;
        ke.limu[99] = -243847010;
    }

    private static /* synthetic */ void livl() {
        ke.linb[0] = 7200145157296409834L;
        ke.linb[1] = 6130165681208572759L;
        ke.linb[2] = 9117987036830111852L;
        ke.linb[3] = 6841289129006921699L;
        ke.linb[4] = -6996266561005722263L;
        ke.linb[5] = 5816001006229055004L;
        ke.linb[6] = -4823040291832499931L;
        ke.linb[7] = -2904025158985141136L;
        ke.linb[8] = -2768340720328283158L;
        ke.linb[9] = 5267265976151422262L;
        ke.linb[10] = -3117662087894901545L;
        ke.linb[11] = -2318593402829513932L;
        ke.linb[12] = -4378033655254464177L;
        ke.linb[13] = 3913722218071711104L;
        ke.linb[14] = 8780816141170348162L;
        ke.linb[15] = -2954830259990056253L;
        ke.linb[16] = 1510312194722901886L;
        ke.linb[17] = -5469614215625268593L;
        ke.linb[18] = -8822065320547777283L;
        ke.linb[19] = -7522877087847202446L;
        ke.linb[20] = -5264900708307002720L;
        ke.linb[21] = -5836748597195362442L;
        ke.linb[22] = 3181134406495705903L;
        ke.linb[23] = 7297537126170635261L;
        ke.linb[24] = 9019568147383412370L;
        ke.linb[25] = 1681637239975196719L;
        ke.linb[26] = 7400797225079484408L;
        ke.linb[27] = 1471642701028297646L;
        ke.linb[28] = 1951925480031785531L;
        ke.linb[29] = -2386134819069607583L;
        ke.linb[30] = -9176553610512713387L;
        ke.linb[31] = 4737587677460887459L;
        ke.linb[32] = 7670568477233239245L;
        ke.linb[33] = 434500252499723820L;
        ke.linb[34] = 337671671219701247L;
        ke.linb[35] = 1890188352425905501L;
        ke.linb[36] = -7011584811804957688L;
        ke.linb[37] = -8010769729033887902L;
        ke.linb[38] = 2761734225506254404L;
        ke.linb[39] = -3878175742743116963L;
        ke.linb[40] = -3659892369564610763L;
        ke.linb[41] = 7317423087886831589L;
        ke.linb[42] = 525441172018635496L;
        ke.linb[43] = -4559077412529617624L;
        ke.linb[44] = 621376105989796067L;
        ke.linb[45] = -2498462254977051172L;
        ke.linb[46] = 4811469724580447535L;
        ke.linb[47] = -5868548947890045554L;
        ke.linb[48] = 2504734636349302725L;
        ke.linb[49] = -3449240957284638701L;
        ke.linb[50] = -2950031212400774952L;
        ke.linb[51] = -7188602137545730882L;
        ke.linb[52] = -1278817987874798177L;
        ke.linb[53] = 4508243284738436394L;
        ke.linb[54] = -1833592888460688198L;
        ke.linb[55] = -3378610912220816960L;
        ke.linb[56] = -2310758758780715823L;
        ke.linb[57] = 5058930345361373674L;
        ke.linb[58] = -5389920233580961048L;
        ke.linb[59] = -3683864747018269262L;
        ke.linb[60] = 2646893825976526799L;
        ke.linb[61] = -1019092111353725733L;
        ke.linb[62] = -8585105205868016146L;
        ke.linb[63] = 8462977062216598480L;
        ke.linb[64] = -8327037819846582940L;
        ke.linb[65] = -7296291266605315167L;
        ke.linb[66] = 6771994951371867237L;
        ke.linb[67] = 637329128737147518L;
        ke.linb[68] = 6967739859719569554L;
        ke.linb[69] = -5495779801796890437L;
        ke.linb[70] = 1549152111998132078L;
        ke.linb[71] = -4580286342096175124L;
        ke.linb[72] = -1858110261406256131L;
        ke.linb[73] = 6305340235325557426L;
        ke.linb[74] = -8627651782190282781L;
        ke.linb[75] = -4601855142290909056L;
        ke.linb[76] = -8470201508767975965L;
        ke.linb[77] = -4159659336091921784L;
        ke.linb[78] = -8292569247902471353L;
        ke.linb[79] = -8294096151755490790L;
        ke.linb[80] = 2160226749880135070L;
        ke.linb[81] = -2455730536101547151L;
        ke.linb[82] = -5790695027149724157L;
        ke.linb[83] = 8227980282123009285L;
        ke.linb[84] = 8395177650546947214L;
        ke.linb[85] = -1419186725258594914L;
        ke.linb[86] = 8336811677327940299L;
        ke.linb[87] = -3974342983671928627L;
        ke.linb[88] = 8991379194620543592L;
        ke.linb[89] = 1615412252459565408L;
        ke.linb[90] = -3427527925491328004L;
        ke.linb[91] = 588488412084974977L;
        ke.linb[92] = 3423467109987465745L;
        ke.linb[93] = 2996964316180836420L;
        ke.linb[94] = -3152956052765033576L;
        ke.linb[95] = -7914476896734353615L;
        ke.linb[96] = -6950666592914846997L;
        ke.linb[97] = -9193703380690750831L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void setList(List<String> var1_1) {
        v0 /* !! */  = ke.tx;
        if (true) ** GOTO lbl5
        block19: while (true) {
            v0 /* !! */  = (long)(ke.limv("liuc", lina(int ), (int)81) - ke.limv("liub", lina(int ), (int)80));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 1786516902: {
                    break block19;
                }
                case 1999023382: {
                    continue block19;
                }
            }
            break;
        }
        var4_2 = ke.c;
        v1 /* !! */  = ke.tx;
        if (true) ** GOTO lbl15
        block20: while (true) {
            v1 /* !! */  = (long)(ke.limv("liue", lina(int ), (int)83) - ke.limv("liud", lina(int ), (int)82));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -500841990: {
                    continue block20;
                }
                case 1786516902: {
                    break block20;
                }
            }
            break;
        }
        var3_3 /* !! */  = ke.b;
        v2 /* !! */  = ke.tx;
        if (true) ** GOTO lbl25
        block21: while (true) {
            v2 /* !! */  = (long)(ke.limv("liug", lina(int ), (int)85) - ke.limv("liuf", lina(int ), (int)84));
lbl25:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -2097930000: {
                    continue block21;
                }
                case 1786516902: {
                    break block21;
                }
            }
            break;
        }
        var2_4 = ke.a;
        if (!var4_2) ** GOTO lbl37
        throw null;
        {
            if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
            switch (var3_3 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return;
                }
lbl37:
                // 1 sources

                if (var2_4 || var2_4) continue block22;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_0 = ke.tx - ke.limv("liuh", lina(int ), (int)86)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == ke.limv("liui", lims(int ), (int)104)) break;
                    v3 /* !! */  = (long)ke.limv("liuj", lims(int ), (int)105);
                }
                this.list = var1_1;
                if (!var2_4) ** break;
                continue block22;
                return;
                case 0: lbl-1000:
                // 2 sources

                {
                    while (true) lbl-1000:
                    // 2 sources

                    {
                        var3_3 /* !! */  = (int)ke.limv("liuk", lims(int ), (int)106);
                        if (!var4_2) ** GOTO lbl-1000
                        throw null;
                    }
                }
                case 1: {
                    var3_3 /* !! */  = (int)ke.limv("liul", lims(int ), (int)107);
                    if (!var4_2) break block22;
                    throw null;
                }
lbl56:
                // 2 sources

                case 2: {
                    do {
                        var3_3 /* !! */  = (int)ke.limv("lium", lims(int ), (int)108);
                    } while (!var4_2);
                    throw null;
                }
                case 3: {
                    var3_3 /* !! */  = (int)ke.limv("liun", lims(int ), (int)109);
                    if (!var4_2) ** GOTO lbl56
                    throw null;
                }
                case 4: 
            }
        }
        var3_3 /* !! */  = (int)ke.limv("liuo", lims(int ), (int)110);
        ** while (!var4_2)
lbl68:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public List<String> getSelected() {
        v0 /* !! */  = ke.tx;
        if (true) ** GOTO lbl5
        block15: while (true) {
            v0 /* !! */  = (long)(ke.limv("litn", lina(int ), (int)74) - ke.limv("litm", lina(int ), (int)73));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -324743547: {
                    continue block15;
                }
                case 1786516902: {
                    break block15;
                }
            }
            break;
        }
        var3_1 = ke.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = ke.tx - ke.limv("lito", lina(int ), (int)75)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == ke.limv("litp", lims(int ), (int)96)) break;
            v1 /* !! */  = (long)ke.limv("litq", lims(int ), (int)97);
        }
        var2_2 /* !! */  = ke.b;
        v2 /* !! */  = ke.tx;
        if (true) ** GOTO lbl22
        block17: while (true) {
            v2 /* !! */  = (long)(v3 - ke.limv("litr", lina(int ), (int)76));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1359064476: {
                    v3 = ke.limv("lits", lina(int ), (int)77);
                    continue block17;
                }
                case 377239760: {
                    v3 = ke.limv("litt", lina(int ), (int)78);
                    continue block17;
                }
                case 1786516902: {
                    break block17;
                }
            }
            break;
        }
        var1_3 = ke.a;
        if (!var3_1) ** GOTO lbl38
        throw null;
        {
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var2_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return null;
                }
lbl38:
                // 1 sources

                if (var1_3 || var1_3) continue block18;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_1 = ke.tx - ke.limv("litu", lina(int ), (int)79)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == ke.limv("litv", lims(int ), (int)98)) break;
                    v4 /* !! */  = (long)ke.limv("litw", lims(int ), (int)99);
                }
                return this.selected;
                case 0: {
                    var2_2 /* !! */  = (int)ke.limv("litx", lims(int ), (int)100);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl56
                }
                case 1: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var2_2 /* !! */  = (int)ke.limv("lity", lims(int ), (int)101);
                        if (!var3_1) break block18;
                        throw null;
                    }
                }
lbl56:
                // 2 sources

                case 2: {
                    do {
                        var2_2 /* !! */  = (int)ke.limv("litz", lims(int ), (int)102);
                    } while (!var3_1);
                    throw null;
                }
                case 3: 
            }
        }
        var2_2 /* !! */  = (int)ke.limv("liua", lims(int ), (int)103);
        ** while (!var3_1)
lbl64:
        // 1 sources

        throw null;
    }

    public ke(String string, String string2) {
        int n2 = b;
        super(string, string2);
        this.selected = new ArrayList<String>();
    }

    private static /* synthetic */ void livk() {
        ke.limu[100] = 2072942720;
        ke.limu[101] = 1775196515;
        ke.limu[102] = -1248706627;
        ke.limu[103] = -857980549;
        ke.limu[104] = 1260261152;
        ke.limu[105] = 413173289;
        ke.limu[106] = -761117247;
        ke.limu[107] = 499093793;
        ke.limu[108] = 2026784878;
        ke.limu[109] = 1965108676;
        ke.limu[110] = -1520157070;
        ke.limu[111] = -1950969126;
        ke.limu[112] = -1759904344;
        ke.limu[113] = -2089530813;
        ke.limu[114] = 1722038141;
        ke.limu[115] = 1143501215;
        ke.limu[116] = 385217025;
        ke.limu[117] = -1743549658;
    }

    private static /* synthetic */ void livi() {
        ke.limt[100] = 2072942720;
        ke.limt[101] = 1775196515;
        ke.limt[102] = -1248706626;
        ke.limt[103] = -857980549;
        ke.limt[104] = 1260261153;
        ke.limt[105] = 1086708552;
        ke.limt[106] = -761117246;
        ke.limt[107] = 499093795;
        ke.limt[108] = 2026784874;
        ke.limt[109] = 1965108679;
        ke.limt[110] = -1520157070;
        ke.limt[111] = 1950969125;
        ke.limt[112] = 753686798;
        ke.limt[113] = -2089530814;
        ke.limt[114] = 1722038143;
        ke.limt[115] = 1143501212;
        ke.limt[116] = 385217029;
        ke.limt[117] = -1743549659;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean isSelected(String var1_1) {
        block42: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = ke.tx - ke.limv("lips", lina(int ), (int)31)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v0 /* !! */  == ke.limv("lipt", lims(int ), (int)40)) break;
                v0 /* !! */  = (long)ke.limv("lipu", lims(int ), (int)41);
            }
            var4_2 = ke.c;
            while (true) {
                if ((v1 /* !! */  = (cfr_temp_1 = ke.tx - ke.limv("lipv", lina(int ), (int)32)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v1 /* !! */  == ke.limv("lipw", lims(int ), (int)42)) break;
                v1 /* !! */  = (long)ke.limv("lipx", lims(int ), (int)43);
            }
            var3_3 /* !! */  = ke.b;
            v2 /* !! */  = ke.tx;
            if (true) ** GOTO lbl19
            block23: while (true) {
                v2 /* !! */  = (long)(v3 - ke.limv("lipy", lina(int ), (int)33));
lbl19:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case -2092866264: {
                        v3 = ke.limv("lipz", lina(int ), (int)34);
                        continue block23;
                    }
                    case -245687059: {
                        v3 = ke.limv("liqa", lina(int ), (int)35);
                        continue block23;
                    }
                    case 517668954: {
                        v3 = ke.limv("liqb", lina(int ), (int)36);
                        continue block23;
                    }
                    case 1786516902: {
                        break block23;
                    }
                }
                break;
            }
            var2_4 = ke.a;
            if (var4_2) {
                throw null;
lbl34:
                // 5 sources

                return (boolean)ke.limv("liqc", lims(int ), (int)44);
            }
            if (var2_4 || var2_4) ** GOTO lbl34
            while (true) {
                if ((v4 /* !! */  = (cfr_temp_2 = ke.tx - ke.limv("liqd", lina(int ), (int)37)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v4 /* !! */  == ke.limv("liqe", lims(int ), (int)45)) break;
                v4 /* !! */  = (long)ke.limv("liqf", lims(int ), (int)46);
            }
            if (this.selected == null) break block42;
            if (var2_4) ** GOTO lbl34
            v5 /* !! */  = ke.tx;
            if (true) ** GOTO lbl49
            block26: while (true) {
                v5 /* !! */  = (long)(ke.limv("liqh", lina(int ), (int)39) - ke.limv("liqg", lina(int ), (int)38));
lbl49:
                // 2 sources

                switch ((int)v5 /* !! */ ) {
                    case -639495783: {
                        continue block26;
                    }
                    case 1786516902: {
                        break block26;
                    }
                }
                break;
            }
            while (true) {
                if ((v6 /* !! */  = (cfr_temp_3 = ke.tx - ke.limv("liqi", lina(int ), (int)40)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v6 /* !! */  == ke.limv("liqj", lims(int ), (int)47)) break;
                v6 /* !! */  = (long)ke.limv("liqk", lims(int ), (int)48);
            }
            if (!this.selected.contains(var1_1)) break block42;
            if (var2_4) ** GOTO lbl34
            v7 = ke.limv("liql", lims(int ), (int)49);
            if (var4_2) {
                throw null;
            }
            ** GOTO lbl74
        }
        if (var2_4) ** GOTO lbl34
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var2_4) ** break;
                ** continue;
                v7 = ke.limv("liqm", lims(int ), (int)50);
lbl74:
                // 2 sources

                return (boolean)v7;
            }
lbl75:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)ke.limv("liqn", lims(int ), (int)51);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl97
            }
            case 1: {
                var3_3 /* !! */  = (int)ke.limv("liqo", lims(int ), (int)52);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl102
            }
            case 2: {
                var3_3 /* !! */  = (int)ke.limv("liqp", lims(int ), (int)53);
                if (var4_2) {
                    throw null;
                }
            }
            case 3: {
                var3_3 /* !! */  = (int)ke.limv("liqq", lims(int ), (int)54);
                if (!var4_2) ** GOTO lbl75
                throw null;
            }
            case 4: {
                var3_3 /* !! */  = (int)ke.limv("liqr", lims(int ), (int)55);
                if (var4_2) {
                    throw null;
                }
            }
lbl97:
            // 4 sources

            case 5: {
                do {
                    var3_3 /* !! */  = (int)ke.limv("liqs", lims(int ), (int)56);
                } while (!var4_2);
                throw null;
            }
lbl102:
            // 2 sources

            case 6: {
                var3_3 /* !! */  = (int)ke.limv("liqt", lims(int ), (int)57);
                if (!var4_2) break;
                throw null;
            }
            case 7: {
                do {
                    var3_3 /* !! */  = (int)ke.limv("liqu", lims(int ), (int)58);
                } while (!var4_2);
                throw null;
            }
            case 8: 
        }
        do {
            var3_3 /* !! */  = (int)ke.limv("liqv", lims(int ), (int)59);
        } while (!var4_2);
        throw null;
    }

    private static /* synthetic */ void livm() {
        ke.linc[0] = 5560183059755344598L;
        ke.linc[1] = 236762825052261224L;
        ke.linc[2] = -2063003326447442722L;
        ke.linc[3] = 2026259841723897183L;
        ke.linc[4] = 3916759783872380781L;
        ke.linc[5] = 4851071740335290926L;
        ke.linc[6] = -3317086356669170798L;
        ke.linc[7] = 1747735926994040424L;
        ke.linc[8] = -5503782175677566307L;
        ke.linc[9] = -7163218358857499693L;
        ke.linc[10] = 5001298819269423335L;
        ke.linc[11] = 6585931886946392986L;
        ke.linc[12] = 8018149047062335378L;
        ke.linc[13] = -8421714753854436609L;
        ke.linc[14] = -58233155464107377L;
        ke.linc[15] = -3409426129680193902L;
        ke.linc[16] = -4159559434648914312L;
        ke.linc[17] = 6925219259216195769L;
        ke.linc[18] = 6951724798820713261L;
        ke.linc[19] = -5376179765750135945L;
        ke.linc[20] = -7544092295891221866L;
        ke.linc[21] = 7383724015258019766L;
        ke.linc[22] = 1956394041255897688L;
        ke.linc[23] = 4593263285807891359L;
        ke.linc[24] = 3779068316977669240L;
        ke.linc[25] = -9183183118070723489L;
        ke.linc[26] = 3491894519405522609L;
        ke.linc[27] = 2268700019219279558L;
        ke.linc[28] = 5640636990600750032L;
        ke.linc[29] = 8161977998337634334L;
        ke.linc[30] = -7222293206873477064L;
        ke.linc[31] = 3999829491692203650L;
        ke.linc[32] = -5800647914313068698L;
        ke.linc[33] = -8190262068057296513L;
        ke.linc[34] = -9199092196819849710L;
        ke.linc[35] = -3948759593883474483L;
        ke.linc[36] = 8206076000620086841L;
        ke.linc[37] = -2491578614899865446L;
        ke.linc[38] = 8020359649178762626L;
        ke.linc[39] = 1729485189781750383L;
        ke.linc[40] = 6387740994918466845L;
        ke.linc[41] = 2732546662212978933L;
        ke.linc[42] = -1721756432266153196L;
        ke.linc[43] = 755939420654746321L;
        ke.linc[44] = -2555849342672904808L;
        ke.linc[45] = 3426676116125141532L;
        ke.linc[46] = 378467926214156758L;
        ke.linc[47] = -4528833235955285309L;
        ke.linc[48] = 5324934594512802689L;
        ke.linc[49] = -783612501733752256L;
        ke.linc[50] = 5468170401901843802L;
        ke.linc[51] = 5099080832498960001L;
        ke.linc[52] = 5419364693052572681L;
        ke.linc[53] = -5995989002130102836L;
        ke.linc[54] = 1859417548975194043L;
        ke.linc[55] = -5212751597447671260L;
        ke.linc[56] = 698637919202455281L;
        ke.linc[57] = -2323419948899093303L;
        ke.linc[58] = 8314886515779886303L;
        ke.linc[59] = -8641278606288593544L;
        ke.linc[60] = 3983297624920891398L;
        ke.linc[61] = -6865753243578415337L;
        ke.linc[62] = -1207417731936746422L;
        ke.linc[63] = 6930110851291531429L;
        ke.linc[64] = 2621370553381331972L;
        ke.linc[65] = 7897323261959819513L;
        ke.linc[66] = -3817795171707348134L;
        ke.linc[67] = -9010193150617998234L;
        ke.linc[68] = 1804418463308308056L;
        ke.linc[69] = -3179244510288709867L;
        ke.linc[70] = 7906399340526707726L;
        ke.linc[71] = -4045676924833828393L;
        ke.linc[72] = -6248030334876795644L;
        ke.linc[73] = -6044132072163940418L;
        ke.linc[74] = 9196338465527065790L;
        ke.linc[75] = -6686987341965455723L;
        ke.linc[76] = 8984403644378015341L;
        ke.linc[77] = -659627383381003962L;
        ke.linc[78] = 846243778028120355L;
        ke.linc[79] = -7283803647235047396L;
        ke.linc[80] = -1545618720074762920L;
        ke.linc[81] = 8712588084453333996L;
        ke.linc[82] = -7684937936056181924L;
        ke.linc[83] = -4423387131843037475L;
        ke.linc[84] = -2832174299038938193L;
        ke.linc[85] = 7847158061710428504L;
        ke.linc[86] = -207163731915341441L;
        ke.linc[87] = 3372112677692788835L;
        ke.linc[88] = -1955588739448588764L;
        ke.linc[89] = 2887485142245403593L;
        ke.linc[90] = 4051316045865503848L;
        ke.linc[91] = -746609577186673377L;
        ke.linc[92] = 8956442768077754325L;
        ke.linc[93] = 5458254598650274952L;
        ke.linc[94] = -3250202935405420261L;
        ke.linc[95] = 5452318337396517637L;
        ke.linc[96] = -155665003710811305L;
        ke.linc[97] = -8744641904426750746L;
    }

    public static /* synthetic */ CallSite limv(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }
}

