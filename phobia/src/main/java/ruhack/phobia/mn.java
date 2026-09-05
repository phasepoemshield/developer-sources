/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_11905
 *  net.minecraft.class_11908
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.minecraft.class_11905;
import net.minecraft.class_11908;

public final class mn {
    private static int[] hbdl = new int[162];
    public static final boolean a;
    private static long[] hbdt;
    private boolean active;
    private static int[] hbdm;
    private boolean selectAll;
    public static final int b;
    private static long[] hbds;
    public static final long ny = 7299756563684628437L;
    private String query;
    public static final boolean c;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void close() {
        v0 /* !! */  = mn.ny;
        if (true) ** GOTO lbl5
        block34: while (true) {
            v0 /* !! */  = (long)(v1 - mn.hbdn("hbgv", hbdr(int ), (int)36));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1204568037: {
                    v1 = mn.hbdn("hbgw", hbdr(int ), (int)37);
                    continue block34;
                }
                case 341181558: {
                    v1 = mn.hbdn("hbgx", hbdr(int ), (int)38);
                    continue block34;
                }
                case 1027577813: {
                    break block34;
                }
                case 1322554240: {
                    v1 = mn.hbdn("hbgy", hbdr(int ), (int)39);
                    continue block34;
                }
            }
            break;
        }
        var3_1 = mn.c;
        v2 /* !! */  = mn.ny;
        if (true) ** GOTO lbl22
        block35: while (true) {
            v2 /* !! */  = (long)(v3 - mn.hbdn("hbgz", hbdr(int ), (int)40));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1250675275: {
                    v3 = mn.hbdn("hbha", hbdr(int ), (int)41);
                    continue block35;
                }
                case 1027577813: {
                    break block35;
                }
                case 1564931169: {
                    v3 = mn.hbdn("hbhb", hbdr(int ), (int)42);
                    continue block35;
                }
            }
            break;
        }
        var2_2 /* !! */  = mn.b;
        v4 /* !! */  = mn.ny;
        if (true) ** GOTO lbl36
        block36: while (true) {
            v4 /* !! */  = (long)(v5 - mn.hbdn("hbhc", hbdr(int ), (int)43));
lbl36:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -2045567835: {
                    v5 = mn.hbdn("hbhd", hbdr(int ), (int)44);
                    continue block36;
                }
                case -693174042: {
                    v5 = mn.hbdn("hbhe", hbdr(int ), (int)45);
                    continue block36;
                }
                case 353007420: {
                    v5 = mn.hbdn("hbhf", hbdr(int ), (int)46);
                    continue block36;
                }
                case 1027577813: {
                    break block36;
                }
            }
            break;
        }
        var1_3 = mn.a;
        if (var3_1) {
            throw null;
lbl51:
            // 5 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl51
        v6 = mn.hbdn("hbhg", hbdk(int ), (int)46);
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_0 = mn.ny - mn.hbdn("hbhh", hbdr(int ), (int)47)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v7 /* !! */  == mn.hbdn("hbhi", hbdk(int ), (int)47)) break;
            v7 /* !! */  = (long)mn.hbdn("hbhj", hbdk(int ), (int)48);
        }
        this.active = v6;
        if (var1_3 || var1_3) ** GOTO lbl51
        while (true) {
            if ((v8 /* !! */  = (cfr_temp_1 = mn.ny - mn.hbdn("hbhk", hbdr(int ), (int)48)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v8 /* !! */  == mn.hbdn("hbhl", hbdk(int ), (int)49)) break;
            v8 /* !! */  = (long)mn.hbdn("hbhm", hbdk(int ), (int)50);
        }
        this.query = "";
        if (var1_3) ** GOTO lbl51
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl51
                v9 = mn.hbdn("hbhn", hbdk(int ), (int)51);
                v10 /* !! */  = mn.ny;
                if (true) ** GOTO lbl78
                block40: while (true) {
                    v10 /* !! */  = (long)(v11 - mn.hbdn("hbho", hbdr(int ), (int)49));
lbl78:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -1073715456: {
                            v11 = mn.hbdn("hbhp", hbdr(int ), (int)50);
                            continue block40;
                        }
                        case 724320235: {
                            v11 = mn.hbdn("hbhq", hbdr(int ), (int)51);
                            continue block40;
                        }
                        case 1027577813: {
                            break block40;
                        }
                    }
                    break;
                }
                this.selectAll = v9;
                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
lbl91:
            // 2 sources

            case 0: {
                do {
                    var2_2 /* !! */  = (int)mn.hbdn("hbhr", hbdk(int ), (int)52);
                } while (!var3_1);
                throw null;
            }
lbl96:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)mn.hbdn("hbhs", hbdk(int ), (int)53);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl120
            }
            case 2: {
                var2_2 /* !! */  = (int)mn.hbdn("hbht", hbdk(int ), (int)54);
                if (!var3_1) ** GOTO lbl91
                throw null;
            }
            case 3: {
                var2_2 /* !! */  = (int)mn.hbdn("hbhu", hbdk(int ), (int)55);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl128
            }
lbl110:
            // 3 sources

            case 4: {
                var2_2 /* !! */  = (int)mn.hbdn("hbhv", hbdk(int ), (int)56);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl120
            }
            case 5: {
                do {
                    var2_2 /* !! */  = (int)mn.hbdn("hbhw", hbdk(int ), (int)57);
                } while (!var3_1);
                throw null;
            }
lbl120:
            // 3 sources

            case 6: {
                var2_2 /* !! */  = (int)mn.hbdn("hbhx", hbdk(int ), (int)58);
                if (!var3_1) ** GOTO lbl96
                throw null;
            }
            case 7: {
                var2_2 /* !! */  = (int)mn.hbdn("hbhy", hbdk(int ), (int)59);
                if (!var3_1) ** GOTO lbl110
                throw null;
            }
lbl128:
            // 2 sources

            case 8: {
                var2_2 /* !! */  = (int)mn.hbdn("hbhz", hbdk(int ), (int)60);
                if (!var3_1) ** GOTO lbl110
                throw null;
            }
            case 9: 
        }
        do {
            var2_2 /* !! */  = (int)mn.hbdn("hbia", hbdk(int ), (int)61);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ long hbdr(int n2) {
        return hbds[n2] ^ hbdt[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public mn() {
        var2_1 /* !! */  = mn.b;
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        block0 : switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                super();
                this.query = "";
                return;
            }
lbl8:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)mn.hbdn("hbdo", hbdk(int ), (int)0);
                    break block0;
                    break;
                }
            }
            case 1: {
                var2_1 /* !! */  = (int)mn.hbdn("hbdp", hbdk(int ), (int)1);
                ** GOTO lbl8
            }
            case 2: 
        }
        var2_1 /* !! */  = (int)mn.hbdn("hbdq", hbdk(int ), (int)2);
        ** while (true)
    }

    public static /* synthetic */ CallSite hbdn(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public boolean hasQuery() {
        CallSite callSite;
        boolean bl2;
        block28: {
            while (true) {
                long l2;
                Object object;
                if ((object = (l2 = ny - mn.hbdn("hbfb", hbdr(int ), (int)16)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
                if (object == mn.hbdn("hbfc", hbdk(int ), (int)20)) break;
                object = mn.hbdn("hbfd", hbdk(int ), (int)21);
            }
            boolean bl3 = c;
            Object object = ny;
            block15: while (true) {
                switch ((int)object) {
                    case 335123680: {
                        object = mn.hbdn("hbff", hbdr(int ), (int)18) - mn.hbdn("hbfe", hbdr(int ), (int)17);
                        continue block15;
                    }
                    case 1027577813: {
                        break block15;
                    }
                }
                break;
            }
            int n2 = b;
            Object object2 = ny;
            block16: while (true) {
                switch ((int)object2) {
                    case 1027577813: {
                        break block16;
                    }
                    case 1055544802: {
                        object2 = mn.hbdn("hbfh", hbdr(int ), (int)20) - mn.hbdn("hbfg", hbdr(int ), (int)19);
                        continue block16;
                    }
                }
                break;
            }
            bl2 = a;
            if (bl3) {
                throw null;
            }
            if (bl2 || bl2) return (boolean)mn.hbdn("hbfi", hbdk(int ), (int)22);
            Object object3 = ny;
            boolean bl4 = true;
            block17: while (true) {
                CallSite callSite2;
                if (!bl4 || (bl4 = false) || !true) {
                    object3 = callSite2 - mn.hbdn("hbfj", hbdr(int ), (int)21);
                }
                switch ((int)object3) {
                    case 1027577813: {
                        break block17;
                    }
                    case 1094033263: {
                        callSite2 = mn.hbdn("hbfk", hbdr(int ), (int)22);
                        continue block17;
                    }
                    case 1301484246: {
                        callSite2 = mn.hbdn("hbfl", hbdr(int ), (int)23);
                        continue block17;
                    }
                    case 1572139313: {
                        callSite2 = mn.hbdn("hbfm", hbdr(int ), (int)24);
                        continue block17;
                    }
                }
                break;
            }
            while (true) {
                long l3;
                Object object4;
                if ((object4 = (l3 = ny - mn.hbdn("hbfn", hbdr(int ), (int)25)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
                if (object4 == mn.hbdn("hbfo", hbdk(int ), (int)23)) {
                    if (!this.query.isBlank()) {
                        break;
                    }
                    break block28;
                }
                object4 = mn.hbdn("hbfp", hbdk(int ), (int)24);
            }
            if (bl2) return (boolean)mn.hbdn("hbfi", hbdk(int ), (int)22);
            callSite = mn.hbdn("hbfq", hbdk(int ), (int)25);
            if (!bl3) return (boolean)callSite;
            throw null;
        }
        if (bl2 || bl2) {
            return (boolean)mn.hbdn("hbfi", hbdk(int ), (int)22);
        }
        callSite = mn.hbdn("hbfr", hbdk(int ), (int)26);
        return (boolean)callSite;
    }

    static {
        hbdm = new int[162];
        mn.hbne();
        mn.hbnf();
        mn.hbng();
        mn.hbnh();
        hbds = new long[85];
        hbdt = new long[85];
        mn.hbni();
        mn.hbnj();
    }

    private static /* synthetic */ void hbnh() {
        mn.hbdm[100] = -1203554428;
        mn.hbdm[101] = -1770139547;
        mn.hbdm[102] = 1058737864;
        mn.hbdm[103] = 1891429975;
        mn.hbdm[104] = -602027283;
        mn.hbdm[105] = -1532525500;
        mn.hbdm[106] = 1760439142;
        mn.hbdm[107] = 1247650825;
        mn.hbdm[108] = 185449321;
        mn.hbdm[109] = 1012337218;
        mn.hbdm[110] = 122851063;
        mn.hbdm[111] = 10174780;
        mn.hbdm[112] = 1150312481;
        mn.hbdm[113] = -1636712752;
        mn.hbdm[114] = 846596699;
        mn.hbdm[115] = -1745581856;
        mn.hbdm[116] = -1292724197;
        mn.hbdm[117] = -156334722;
        mn.hbdm[118] = -448014568;
        mn.hbdm[119] = -1583876342;
        mn.hbdm[120] = -978861601;
        mn.hbdm[121] = 944411089;
        mn.hbdm[122] = 1583649185;
        mn.hbdm[123] = 820144103;
        mn.hbdm[124] = -1380078860;
        mn.hbdm[125] = 1682051781;
        mn.hbdm[126] = 348367088;
        mn.hbdm[127] = -697621680;
        mn.hbdm[128] = -531936489;
        mn.hbdm[129] = -1232926019;
        mn.hbdm[130] = 1980778614;
        mn.hbdm[131] = -1257324124;
        mn.hbdm[132] = -1361112364;
        mn.hbdm[133] = -1020067185;
        mn.hbdm[134] = -348579480;
        mn.hbdm[135] = 341134038;
        mn.hbdm[136] = 302062670;
        mn.hbdm[137] = -44176341;
        mn.hbdm[138] = 1454183287;
        mn.hbdm[139] = 1970529579;
        mn.hbdm[140] = -197320075;
        mn.hbdm[141] = -2024565462;
        mn.hbdm[142] = -408658112;
        mn.hbdm[143] = -39097533;
        mn.hbdm[144] = -1706308298;
        mn.hbdm[145] = -185346394;
        mn.hbdm[146] = 842764696;
        mn.hbdm[147] = 936532519;
        mn.hbdm[148] = 367931786;
        mn.hbdm[149] = -1554964600;
        mn.hbdm[150] = 280696908;
        mn.hbdm[151] = 1119062339;
        mn.hbdm[152] = 1414965621;
        mn.hbdm[153] = -2046562789;
        mn.hbdm[154] = -1907615214;
        mn.hbdm[155] = -669702027;
        mn.hbdm[156] = -1190222321;
        mn.hbdm[157] = 1915487955;
        mn.hbdm[158] = -1223001719;
        mn.hbdm[159] = 875487192;
        mn.hbdm[160] = 1508758022;
        mn.hbdm[161] = 1411244997;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public String getQuery() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = mn.ny - mn.hbdn("hbem", hbdr(int ), (int)9)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == mn.hbdn("hben", hbdk(int ), (int)12)) break;
            v0 /* !! */  = (long)mn.hbdn("hbeo", hbdk(int ), (int)13);
        }
        var3_1 = mn.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = mn.ny - mn.hbdn("hbep", hbdr(int ), (int)10)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == mn.hbdn("hbeq", hbdk(int ), (int)14)) break;
            v1 /* !! */  = (long)mn.hbdn("hber", hbdk(int ), (int)15);
        }
        var2_2 /* !! */  = mn.b;
        v2 /* !! */  = mn.ny;
        if (true) ** GOTO lbl19
        block17: while (true) {
            v2 /* !! */  = (long)(v3 - mn.hbdn("hbes", hbdr(int ), (int)11));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 504941699: {
                    v3 = mn.hbdn("hbet", hbdr(int ), (int)12);
                    continue block17;
                }
                case 658998308: {
                    v3 = mn.hbdn("hbeu", hbdr(int ), (int)13);
                    continue block17;
                }
                case 1027577813: {
                    break block17;
                }
            }
            break;
        }
        var1_3 = mn.a;
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
                v4 /* !! */  = mn.ny;
                if (true) ** GOTO lbl42
                block19: while (true) {
                    v4 /* !! */  = (long)(mn.hbdn("hbew", hbdr(int ), (int)15) - mn.hbdn("hbev", hbdr(int ), (int)14));
lbl42:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case 1027577813: {
                            break block19;
                        }
                        case 1036149549: {
                            continue block19;
                        }
                    }
                    break;
                }
                return this.query;
            }
lbl48:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)mn.hbdn("hbex", hbdk(int ), (int)16);
                if (!var3_1) break;
                throw null;
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)mn.hbdn("hbey", hbdk(int ), (int)17);
                    if (!var3_1) ** GOTO lbl48
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)mn.hbdn("hbez", hbdk(int ), (int)18);
                if (!var3_1) break;
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)mn.hbdn("hbfa", hbdk(int ), (int)19);
        ** while (!var3_1)
lbl64:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void hbnf() {
        mn.hbdl[100] = -1203554427;
        mn.hbdl[101] = -1770139541;
        mn.hbdl[102] = 1058737866;
        mn.hbdl[103] = 1891429963;
        mn.hbdl[104] = -602027265;
        mn.hbdl[105] = -1532525464;
        mn.hbdl[106] = 1760439105;
        mn.hbdl[107] = 1247650842;
        mn.hbdl[108] = 185449288;
        mn.hbdl[109] = 1012337245;
        mn.hbdl[110] = 122851044;
        mn.hbdl[111] = 10174768;
        mn.hbdl[112] = 1150312497;
        mn.hbdl[113] = -1636712759;
        mn.hbdl[114] = 846596726;
        mn.hbdl[115] = -1745581827;
        mn.hbdl[116] = -1292724217;
        mn.hbdl[117] = -156334753;
        mn.hbdl[118] = -448014578;
        mn.hbdl[119] = -1583876324;
        mn.hbdl[120] = -978861610;
        mn.hbdl[121] = 944411090;
        mn.hbdl[122] = 1583649193;
        mn.hbdl[123] = 820144118;
        mn.hbdl[124] = -1380078859;
        mn.hbdl[125] = -1632413992;
        mn.hbdl[126] = 348367089;
        mn.hbdl[127] = 1402181032;
        mn.hbdl[128] = -531936489;
        mn.hbdl[129] = -1232926019;
        mn.hbdl[130] = 1980778615;
        mn.hbdl[131] = 282935020;
        mn.hbdl[132] = -1361112364;
        mn.hbdl[133] = -1020067186;
        mn.hbdl[134] = -1253285621;
        mn.hbdl[135] = 341134039;
        mn.hbdl[136] = -56912747;
        mn.hbdl[137] = 44176340;
        mn.hbdl[138] = -802180882;
        mn.hbdl[139] = 1970529578;
        mn.hbdl[140] = 662471160;
        mn.hbdl[141] = -2024565461;
        mn.hbdl[142] = -408658099;
        mn.hbdl[143] = -39097519;
        mn.hbdl[144] = -1706308316;
        mn.hbdl[145] = -185346388;
        mn.hbdl[146] = 842764698;
        mn.hbdl[147] = 936532526;
        mn.hbdl[148] = 367931791;
        mn.hbdl[149] = -1554964598;
        mn.hbdl[150] = 280696910;
        mn.hbdl[151] = 1119062351;
        mn.hbdl[152] = 1414965621;
        mn.hbdl[153] = -2046562807;
        mn.hbdl[154] = -1907615210;
        mn.hbdl[155] = -669702017;
        mn.hbdl[156] = -1190222325;
        mn.hbdl[157] = 1915487958;
        mn.hbdl[158] = -1223001724;
        mn.hbdl[159] = 875487198;
        mn.hbdl[160] = 1508758036;
        mn.hbdl[161] = 1411244997;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean charTyped(class_11905 var1_1) {
        v0 /* !! */  = mn.ny;
        if (true) ** GOTO lbl5
        block66: while (true) {
            v0 /* !! */  = (long)(v1 - mn.hbdn("hbkl", hbdr(int ), (int)52));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1681950293: {
                    v1 = mn.hbdn("hbkm", hbdr(int ), (int)53);
                    continue block66;
                }
                case -1233691286: {
                    v1 = mn.hbdn("hbkn", hbdr(int ), (int)54);
                    continue block66;
                }
                case -651718850: {
                    v1 = mn.hbdn("hbko", hbdr(int ), (int)55);
                    continue block66;
                }
                case 1027577813: {
                    break block66;
                }
            }
            break;
        }
        var4_2 = mn.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = mn.ny - mn.hbdn("hbkp", hbdr(int ), (int)56)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == mn.hbdn("hbkq", hbdk(int ), (int)124)) break;
            v2 /* !! */  = (long)mn.hbdn("hbkr", hbdk(int ), (int)125);
        }
        var3_3 /* !! */  = mn.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = mn.ny - mn.hbdn("hbks", hbdr(int ), (int)57)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == mn.hbdn("hbkt", hbdk(int ), (int)126)) break;
            v3 /* !! */  = (long)mn.hbdn("hbku", hbdk(int ), (int)127);
        }
        var2_4 = mn.a;
        if (var4_2) {
            throw null;
lbl32:
            // 10 sources

            return (boolean)mn.hbdn("hbkv", hbdk(int ), (int)128);
        }
        if (var2_4 || var2_4) ** GOTO lbl32
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v4 /* !! */  = mn.ny;
                if (true) ** GOTO lbl42
                block70: while (true) {
                    v4 /* !! */  = (long)(v5 - mn.hbdn("hbkw", hbdr(int ), (int)58));
lbl42:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1761769221: {
                            v5 = mn.hbdn("hbkx", hbdr(int ), (int)59);
                            continue block70;
                        }
                        case -1405226114: {
                            v5 = mn.hbdn("hbky", hbdr(int ), (int)60);
                            continue block70;
                        }
                        case 456089741: {
                            v5 = mn.hbdn("hbkz", hbdr(int ), (int)61);
                            continue block70;
                        }
                        case 1027577813: {
                            break block70;
                        }
                    }
                    break;
                }
                if (!this.active) ** GOTO lbl81
                if (var2_4) ** GOTO lbl32
                v6 /* !! */  = mn.ny;
                if (true) ** GOTO lbl60
                block71: while (true) {
                    v6 /* !! */  = (long)(v7 - mn.hbdn("hbla", hbdr(int ), (int)62));
lbl60:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1991307801: {
                            v7 = mn.hbdn("hblb", hbdr(int ), (int)63);
                            continue block71;
                        }
                        case -356814655: {
                            v7 = mn.hbdn("hblc", hbdr(int ), (int)64);
                            continue block71;
                        }
                        case 1027577813: {
                            break block71;
                        }
                    }
                    break;
                }
                v8 = var1_1.comp_4793();
                v9 /* !! */  = mn.ny;
                if (true) ** GOTO lbl74
                block72: while (true) {
                    v9 /* !! */  = (long)(mn.hbdn("hble", hbdr(int ), (int)66) - mn.hbdn("hbld", hbdr(int ), (int)65));
lbl74:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case 679063804: {
                            continue block72;
                        }
                        case 1027577813: {
                            break block72;
                        }
                    }
                    break;
                }
                if (!Character.isISOControl(v8)) ** GOTO lbl83
                if (var2_4) ** GOTO lbl32
lbl81:
                // 2 sources

                if (var2_4 || var2_4) ** GOTO lbl32
                return (boolean)mn.hbdn("hblf", hbdk(int ), (int)129);
lbl83:
                // 1 sources

                if (var2_4 || var2_4) ** GOTO lbl32
                v10 /* !! */  = mn.ny;
                if (true) ** GOTO lbl88
                block73: while (true) {
                    v10 /* !! */  = (long)(mn.hbdn("hblh", hbdr(int ), (int)68) - mn.hbdn("hblg", hbdr(int ), (int)67));
lbl88:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -238625903: {
                            continue block73;
                        }
                        case 1027577813: {
                            break block73;
                        }
                    }
                    break;
                }
                if (!this.selectAll) ** GOTO lbl118
                if (var2_4 || var2_4) ** GOTO lbl32
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_2 = mn.ny - mn.hbdn("hbli", hbdr(int ), (int)69)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v11 /* !! */  == mn.hbdn("hblj", hbdk(int ), (int)130)) break;
                    v11 /* !! */  = (long)mn.hbdn("hblk", hbdk(int ), (int)131);
                }
                this.query = "";
                if (var2_4 || var2_4) ** GOTO lbl32
                v12 = mn.hbdn("hbll", hbdk(int ), (int)132);
                v13 /* !! */  = mn.ny;
                if (true) ** GOTO lbl107
                block75: while (true) {
                    v13 /* !! */  = (long)(v14 - mn.hbdn("hblm", hbdr(int ), (int)70));
lbl107:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case -150203851: {
                            v14 = mn.hbdn("hbln", hbdr(int ), (int)71);
                            continue block75;
                        }
                        case 390903311: {
                            v14 = mn.hbdn("hblo", hbdr(int ), (int)72);
                            continue block75;
                        }
                        case 1027577813: {
                            break block75;
                        }
                    }
                    break;
                }
                this.selectAll = v12;
                if (var2_4) ** GOTO lbl32
lbl118:
                // 2 sources

                if (var2_4 || var2_4) ** GOTO lbl32
                while (true) {
                    if ((v15 /* !! */  = (cfr_temp_3 = mn.ny - mn.hbdn("hblp", hbdr(int ), (int)73)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v15 /* !! */  == mn.hbdn("hblq", hbdk(int ), (int)133)) break;
                    v15 /* !! */  = (long)mn.hbdn("hblr", hbdk(int ), (int)134);
                }
                while (true) {
                    if ((v16 /* !! */  = (cfr_temp_4 = mn.ny - mn.hbdn("hbls", hbdr(int ), (int)74)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v16 /* !! */  == mn.hbdn("hblt", hbdk(int ), (int)135)) break;
                    v16 /* !! */  = (long)mn.hbdn("hblu", hbdk(int ), (int)136);
                }
                while (true) {
                    if ((v17 /* !! */  = (cfr_temp_5 = mn.ny - mn.hbdn("hblv", hbdr(int ), (int)75)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v17 /* !! */  == mn.hbdn("hblw", hbdk(int ), (int)137)) break;
                    v17 /* !! */  = (long)mn.hbdn("hblx", hbdk(int ), (int)138);
                }
                v18 = var1_1.comp_4793();
                v19 /* !! */  = mn.ny;
                if (true) ** GOTO lbl139
                block79: while (true) {
                    v19 /* !! */  = (long)(mn.hbdn("hblz", hbdr(int ), (int)77) - mn.hbdn("hbly", hbdr(int ), (int)76));
lbl139:
                    // 2 sources

                    switch ((int)v19 /* !! */ ) {
                        case -2135709162: {
                            continue block79;
                        }
                        case 1027577813: {
                            break block79;
                        }
                    }
                    break;
                }
                v20 = Character.toChars(v18);
                v21 /* !! */  = mn.ny;
                if (true) ** GOTO lbl149
                block80: while (true) {
                    v21 /* !! */  = (long)(v22 - mn.hbdn("hbma", hbdr(int ), (int)78));
lbl149:
                    // 2 sources

                    switch ((int)v21 /* !! */ ) {
                        case -1127627281: {
                            v22 = mn.hbdn("hbmb", hbdr(int ), (int)79);
                            continue block80;
                        }
                        case 245614235: {
                            v22 = mn.hbdn("hbmc", hbdr(int ), (int)80);
                            continue block80;
                        }
                        case 906053452: {
                            v22 = mn.hbdn("hbmd", hbdr(int ), (int)81);
                            continue block80;
                        }
                        case 1027577813: {
                            break block80;
                        }
                    }
                    break;
                }
                v23 = new String(v20);
                while (true) {
                    if ((v24 /* !! */  = (cfr_temp_6 = mn.ny - mn.hbdn("hbme", hbdr(int ), (int)82)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v24 /* !! */  == mn.hbdn("hbmf", hbdk(int ), (int)139)) break;
                    v24 /* !! */  = (long)mn.hbdn("hbmg", hbdk(int ), (int)140);
                }
                v25 = this.query + v23;
                v26 /* !! */  = mn.ny;
                if (true) ** GOTO lbl172
                block82: while (true) {
                    v26 /* !! */  = (long)(mn.hbdn("hbmi", hbdr(int ), (int)84) - mn.hbdn("hbmh", hbdr(int ), (int)83));
lbl172:
                    // 2 sources

                    switch ((int)v26 /* !! */ ) {
                        case 6135251: {
                            continue block82;
                        }
                        case 1027577813: {
                            break block82;
                        }
                    }
                    break;
                }
                this.query = v25;
                if (!var2_4 && !var2_4) ** break;
                ** continue;
                return (boolean)mn.hbdn("hbmj", hbdk(int ), (int)141);
            }
lbl181:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)mn.hbdn("hbmk", hbdk(int ), (int)142);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl205
            }
            case 1: {
                var3_3 /* !! */  = (int)mn.hbdn("hbml", hbdk(int ), (int)143);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl244
            }
lbl191:
            // 3 sources

            case 2: {
                var3_3 /* !! */  = (int)mn.hbdn("hbmm", hbdk(int ), (int)144);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl260
            }
            case 3: {
                var3_3 /* !! */  = (int)mn.hbdn("hbmn", hbdk(int ), (int)145);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl236
            }
            case 4: {
                var3_3 /* !! */  = (int)mn.hbdn("hbmo", hbdk(int ), (int)146);
                if (var4_2) {
                    throw null;
                }
            }
lbl205:
            // 4 sources

            case 5: {
                var3_3 /* !! */  = (int)mn.hbdn("hbmp", hbdk(int ), (int)147);
                if (!var4_2) ** GOTO lbl181
                throw null;
            }
            case 6: {
                var3_3 /* !! */  = (int)mn.hbdn("hbmq", hbdk(int ), (int)148);
                if (!var4_2) break;
                throw null;
            }
            case 7: {
                var3_3 /* !! */  = (int)mn.hbdn("hbmr", hbdk(int ), (int)149);
                if (!var4_2) ** GOTO lbl191
                throw null;
            }
lbl217:
            // 2 sources

            case 8: {
                var3_3 /* !! */  = (int)mn.hbdn("hbms", hbdk(int ), (int)150);
                if (!var4_2) ** GOTO lbl191
                throw null;
            }
lbl221:
            // 2 sources

            case 9: {
                var3_3 /* !! */  = (int)mn.hbdn("hbmt", hbdk(int ), (int)151);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl244
            }
lbl226:
            // 3 sources

            case 10: {
                var3_3 /* !! */  = (int)mn.hbdn("hbmu", hbdk(int ), (int)152);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl248
            }
            case 11: {
                var3_3 /* !! */  = (int)mn.hbdn("hbmv", hbdk(int ), (int)153);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl256
            }
lbl236:
            // 3 sources

            case 12: {
                var3_3 /* !! */  = (int)mn.hbdn("hbmw", hbdk(int ), (int)154);
                if (!var4_2) ** GOTO lbl226
                throw null;
            }
lbl240:
            // 2 sources

            case 13: {
                var3_3 /* !! */  = (int)mn.hbdn("hbmx", hbdk(int ), (int)155);
                if (!var4_2) ** GOTO lbl217
                throw null;
            }
lbl244:
            // 3 sources

            case 14: {
                var3_3 /* !! */  = (int)mn.hbdn("hbmy", hbdk(int ), (int)156);
                if (!var4_2) ** GOTO lbl240
                throw null;
            }
lbl248:
            // 2 sources

            case 15: {
                var3_3 /* !! */  = (int)mn.hbdn("hbmz", hbdk(int ), (int)157);
                if (!var4_2) ** GOTO lbl221
                throw null;
            }
            case 16: {
                var3_3 /* !! */  = (int)mn.hbdn("hbna", hbdk(int ), (int)158);
                if (!var4_2) ** GOTO lbl236
                throw null;
            }
lbl256:
            // 2 sources

            case 17: {
                var3_3 /* !! */  = (int)mn.hbdn("hbnb", hbdk(int ), (int)159);
                if (var4_2) {
                    throw null;
                }
            }
lbl260:
            // 4 sources

            case 18: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)mn.hbdn("hbnc", hbdk(int ), (int)160);
                    if (!var4_2) ** GOTO lbl226
                    throw null;
                }
            }
            case 19: 
        }
        var3_3 /* !! */  = (int)mn.hbdn("hbnd", hbdk(int ), (int)161);
        ** while (!var4_2)
lbl268:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void hbnj() {
        mn.hbdt[0] = 2445170648981499469L;
        mn.hbdt[1] = 6952623080640907483L;
        mn.hbdt[2] = 4500678634589144302L;
        mn.hbdt[3] = -4023942378728113450L;
        mn.hbdt[4] = -935553752653239003L;
        mn.hbdt[5] = -8529933951347356119L;
        mn.hbdt[6] = 2154170176809093500L;
        mn.hbdt[7] = -6037697317852355966L;
        mn.hbdt[8] = 6847140150557633567L;
        mn.hbdt[9] = 2019900978990421948L;
        mn.hbdt[10] = 5106106706678076685L;
        mn.hbdt[11] = -4628043310295949185L;
        mn.hbdt[12] = -5751528359961621498L;
        mn.hbdt[13] = -8765632630403916914L;
        mn.hbdt[14] = -930819653797759653L;
        mn.hbdt[15] = 2387535286763970663L;
        mn.hbdt[16] = 4722328997686592215L;
        mn.hbdt[17] = -7871042494119992788L;
        mn.hbdt[18] = 3775583852808770492L;
        mn.hbdt[19] = 1028711280581698553L;
        mn.hbdt[20] = -2739591269218092509L;
        mn.hbdt[21] = 5337853393674162620L;
        mn.hbdt[22] = 7762160480584664109L;
        mn.hbdt[23] = -5970381728859203971L;
        mn.hbdt[24] = 5826105371316569649L;
        mn.hbdt[25] = -5480741697723273310L;
        mn.hbdt[26] = -9132771071424861034L;
        mn.hbdt[27] = -5518028203442042214L;
        mn.hbdt[28] = -8569152457495644804L;
        mn.hbdt[29] = -5730299960114069553L;
        mn.hbdt[30] = 6730418670498033652L;
        mn.hbdt[31] = 7638220522724284069L;
        mn.hbdt[32] = -915049037721678620L;
        mn.hbdt[33] = 2578606989679583925L;
        mn.hbdt[34] = 2277987910856337983L;
        mn.hbdt[35] = 1667089853911560891L;
        mn.hbdt[36] = 190499370320453024L;
        mn.hbdt[37] = -531029013352490176L;
        mn.hbdt[38] = -8152827097699025855L;
        mn.hbdt[39] = 6247458309283640084L;
        mn.hbdt[40] = -4615689677524600615L;
        mn.hbdt[41] = -3191576795506643252L;
        mn.hbdt[42] = 5018820885549826677L;
        mn.hbdt[43] = 2511206316719204007L;
        mn.hbdt[44] = -6123193917269191025L;
        mn.hbdt[45] = -5940317580877427355L;
        mn.hbdt[46] = -307046425648040832L;
        mn.hbdt[47] = -7829839089564071081L;
        mn.hbdt[48] = -3558798445332217766L;
        mn.hbdt[49] = 6171576386670678627L;
        mn.hbdt[50] = 5736760861384824466L;
        mn.hbdt[51] = 5974887840654304621L;
        mn.hbdt[52] = 226879125946722649L;
        mn.hbdt[53] = 6040756303396911598L;
        mn.hbdt[54] = 1774189609051910915L;
        mn.hbdt[55] = -337220375998570668L;
        mn.hbdt[56] = -7369239910589421653L;
        mn.hbdt[57] = 1507708848188045301L;
        mn.hbdt[58] = -537270461365823586L;
        mn.hbdt[59] = -693260078410557689L;
        mn.hbdt[60] = -7380348059450977652L;
        mn.hbdt[61] = -6462867269446185204L;
        mn.hbdt[62] = -98878070427789547L;
        mn.hbdt[63] = 2127566323311515346L;
        mn.hbdt[64] = -4198241622818836322L;
        mn.hbdt[65] = -7332319410270220407L;
        mn.hbdt[66] = 5386409630508316L;
        mn.hbdt[67] = -3953806367820961066L;
        mn.hbdt[68] = 2198501914952948218L;
        mn.hbdt[69] = 3466161236170058875L;
        mn.hbdt[70] = 8931524771723562035L;
        mn.hbdt[71] = -4334485576630828060L;
        mn.hbdt[72] = -5131390139659079827L;
        mn.hbdt[73] = -7782379706216341404L;
        mn.hbdt[74] = -7044332583761568163L;
        mn.hbdt[75] = -2213914961191166050L;
        mn.hbdt[76] = 7338527476123763608L;
        mn.hbdt[77] = 2678501926158148075L;
        mn.hbdt[78] = -4097111295262952566L;
        mn.hbdt[79] = -6764673117115509468L;
        mn.hbdt[80] = 3341478771921259741L;
        mn.hbdt[81] = 2414753735498018839L;
        mn.hbdt[82] = 8590238182648860112L;
        mn.hbdt[83] = 1159398455332481111L;
        mn.hbdt[84] = -3273334473994424275L;
    }

    private static /* synthetic */ int hbdk(int n2) {
        return hbdl[n2] ^ hbdm[n2];
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public boolean isActive() {
        block30: {
            v0 /* !! */  = mn.ny;
            if (true) ** GOTO lbl5
            block17: while (true) {
                v0 /* !! */  = (long)(v1 - mn.hbdn("hbdu", hbdr(int ), (int)0));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -1993229095: {
                        v1 = mn.hbdn("hbdv", hbdr(int ), (int)1);
                        continue block17;
                    }
                    case -114937514: {
                        v1 = mn.hbdn("hbdw", hbdr(int ), (int)2);
                        continue block17;
                    }
                    case 682433187: {
                        v1 = mn.hbdn("hbdx", hbdr(int ), (int)3);
                        continue block17;
                    }
                    case 1027577813: {
                        break block17;
                    }
                }
                break;
            }
            var3_1 = mn.c;
            v2 /* !! */  = mn.ny;
            if (true) ** GOTO lbl22
            block18: while (true) {
                v2 /* !! */  = (long)(v3 - mn.hbdn("hbdy", hbdr(int ), (int)4));
lbl22:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case -1281672462: {
                        v3 = mn.hbdn("hbdz", hbdr(int ), (int)5);
                        continue block18;
                    }
                    case 1027577813: {
                        break block18;
                    }
                    case 1280563875: {
                        v3 = mn.hbdn("hbea", hbdr(int ), (int)6);
                        continue block18;
                    }
                }
                break;
            }
            var2_2 /* !! */  = mn.b;
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            cfr_temp_0 = -2147483648;
            block19: do {
                switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        while (true) {
                            if ((v4 /* !! */  = (cfr_temp_1 = mn.ny - mn.hbdn("hbeb", hbdr(int ), (int)7)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                                continue;
                            }
                            if (v4 /* !! */  == mn.hbdn("hbec", hbdk(int ), (int)3)) {
                                var1_3 = mn.a;
                                if (var3_1) {
                                    throw null;
                                }
                                break;
                            }
                            v4 /* !! */  = (long)mn.hbdn("hbed", hbdk(int ), (int)4);
                        }
                        if (var1_3 != false) return (boolean)mn.hbdn("hbee", hbdk(int ), (int)5);
                        if (var1_3 != false) return (boolean)mn.hbdn("hbee", hbdk(int ), (int)5);
                        while (true) {
                            if ((v5 /* !! */  = (cfr_temp_2 = mn.ny - mn.hbdn("hbef", hbdr(int ), (int)8)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                                continue;
                            }
                            if (v5 /* !! */  == mn.hbdn("hbeg", hbdk(int ), (int)6)) {
                                return this.active;
                            }
                            v5 /* !! */  = (long)mn.hbdn("hbeh", hbdk(int ), (int)7);
                        }
                    }
                    case 0: {
                        var2_2 /* !! */  = (int)mn.hbdn("hbei", hbdk(int ), (int)8);
                        if (var3_1) {
                            throw null;
                        }
                        break block30;
                    }
                    case 1: {
                        ** break;
                    }
                    case 3: {
                        break block30;
                    }
lbl65:
                    // 2 sources

                    while (true) {
                        var2_2 /* !! */  = (int)mn.hbdn("hbej", hbdk(int ), (int)9);
                        cfr_temp_0 = 2;
                        if (!var3_1) continue block19;
                        throw null;
                    }
                    case 2: 
                }
                break;
            } while (true);
            var2_2 /* !! */  = (int)mn.hbdn("hbek", hbdk(int ), (int)10);
            if (var3_1) {
                throw null;
            }
        }
        var2_2 /* !! */  = (int)mn.hbdn("hbel", hbdk(int ), (int)11);
        ** while (!var3_1)
lbl79:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void hbne() {
        mn.hbdl[0] = -1955008408;
        mn.hbdl[1] = 1947068994;
        mn.hbdl[2] = 661743910;
        mn.hbdl[3] = -1947904952;
        mn.hbdl[4] = 423341923;
        mn.hbdl[5] = -1046909943;
        mn.hbdl[6] = -2001147697;
        mn.hbdl[7] = -200469499;
        mn.hbdl[8] = -311880348;
        mn.hbdl[9] = 1960576785;
        mn.hbdl[10] = -793542496;
        mn.hbdl[11] = -1983719822;
        mn.hbdl[12] = -1180558522;
        mn.hbdl[13] = 574357426;
        mn.hbdl[14] = 1108222505;
        mn.hbdl[15] = -2010562108;
        mn.hbdl[16] = 137450091;
        mn.hbdl[17] = -733872469;
        mn.hbdl[18] = 1697625255;
        mn.hbdl[19] = -2130734627;
        mn.hbdl[20] = -484665143;
        mn.hbdl[21] = 1278233606;
        mn.hbdl[22] = 709969352;
        mn.hbdl[23] = 1319587406;
        mn.hbdl[24] = 945362818;
        mn.hbdl[25] = 1001344139;
        mn.hbdl[26] = -1328838686;
        mn.hbdl[27] = 1201789429;
        mn.hbdl[28] = -1121270139;
        mn.hbdl[29] = 435310952;
        mn.hbdl[30] = -389680952;
        mn.hbdl[31] = -1153961145;
        mn.hbdl[32] = -538373822;
        mn.hbdl[33] = -1002644072;
        mn.hbdl[34] = -292484003;
        mn.hbdl[35] = 1894999413;
        mn.hbdl[36] = 1719403934;
        mn.hbdl[37] = 1121405372;
        mn.hbdl[38] = 1468573312;
        mn.hbdl[39] = 1738249080;
        mn.hbdl[40] = 1348040647;
        mn.hbdl[41] = -1977262095;
        mn.hbdl[42] = -1628697527;
        mn.hbdl[43] = 1526929434;
        mn.hbdl[44] = -481638970;
        mn.hbdl[45] = -1334196174;
        mn.hbdl[46] = -1451289070;
        mn.hbdl[47] = -38071245;
        mn.hbdl[48] = -72526453;
        mn.hbdl[49] = 908497944;
        mn.hbdl[50] = 2136543853;
        mn.hbdl[51] = -1121475945;
        mn.hbdl[52] = 631683379;
        mn.hbdl[53] = -859977096;
        mn.hbdl[54] = -1099395164;
        mn.hbdl[55] = 1156769649;
        mn.hbdl[56] = -79988894;
        mn.hbdl[57] = 1468697061;
        mn.hbdl[58] = -131615208;
        mn.hbdl[59] = -875951714;
        mn.hbdl[60] = 1876781192;
        mn.hbdl[61] = -1597282525;
        mn.hbdl[62] = -774383393;
        mn.hbdl[63] = 314991103;
        mn.hbdl[64] = 1108822879;
        mn.hbdl[65] = 473503410;
        mn.hbdl[66] = -552117335;
        mn.hbdl[67] = -1880741569;
        mn.hbdl[68] = 1885609541;
        mn.hbdl[69] = 332049345;
        mn.hbdl[70] = 905785133;
        mn.hbdl[71] = 736582193;
        mn.hbdl[72] = -1023144464;
        mn.hbdl[73] = -1678358087;
        mn.hbdl[74] = 1441335886;
        mn.hbdl[75] = -1220350245;
        mn.hbdl[76] = 2083026512;
        mn.hbdl[77] = -362110813;
        mn.hbdl[78] = -2021605480;
        mn.hbdl[79] = -225502807;
        mn.hbdl[80] = 1041972367;
        mn.hbdl[81] = 1618772730;
        mn.hbdl[82] = 161846933;
        mn.hbdl[83] = 1290146160;
        mn.hbdl[84] = 1252250131;
        mn.hbdl[85] = 577057208;
        mn.hbdl[86] = -1719364199;
        mn.hbdl[87] = 47317775;
        mn.hbdl[88] = 1177454769;
        mn.hbdl[89] = -1323095590;
        mn.hbdl[90] = 1955662628;
        mn.hbdl[91] = -1558827292;
        mn.hbdl[92] = -1168039800;
        mn.hbdl[93] = -1483174735;
        mn.hbdl[94] = 2053690953;
        mn.hbdl[95] = -407347133;
        mn.hbdl[96] = -384717679;
        mn.hbdl[97] = -1046514229;
        mn.hbdl[98] = -157928705;
        mn.hbdl[99] = 2016229031;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean keyPressed(class_11908 var1_1) {
        block92: {
            block91: {
                var4_2 = mn.c;
                var3_3 /* !! */  = mn.b;
                var2_4 = mn.a;
                if (var4_2) {
                    throw null;
lbl6:
                    // 23 sources

                    return (boolean)mn.hbdn("hbib", hbdk(int ), (int)62);
                }
                if (var2_4 || var2_4) ** GOTO lbl6
                if (this.active) break block91;
                if (var2_4 || var2_4) ** GOTO lbl6
                return (boolean)mn.hbdn("hbic", hbdk(int ), (int)63);
            }
            if (var2_4 || var2_4) ** GOTO lbl6
            if (var1_1.comp_4795() != mn.hbdn("hbid", hbdk(int ), (int)64)) break block92;
            if (var2_4 || var2_4) ** GOTO lbl6
            this.close();
            if (var2_4 || var2_4) ** GOTO lbl6
            return (boolean)mn.hbdn("hbie", hbdk(int ), (int)65);
        }
        if (var2_4 || var2_4) ** GOTO lbl6
        if (var1_1.comp_4795() != mn.hbdn("hbif", hbdk(int ), (int)66)) ** GOTO lbl43
        if (var2_4) ** GOTO lbl6
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** GOTO lbl6
                if (!this.selectAll) ** GOTO lbl36
                if (var2_4 || var2_4) ** GOTO lbl6
                this.query = "";
                if (var2_4 || var2_4) ** GOTO lbl6
                this.selectAll = mn.hbdn("hbig", hbdk(int ), (int)67);
                if (var2_4) ** GOTO lbl6
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl41
lbl36:
                // 1 sources

                if (var2_4 || var2_4) ** GOTO lbl6
                if (this.query.isEmpty()) ** GOTO lbl41
                if (var2_4 || var2_4) ** GOTO lbl6
                this.query = this.query.substring((int)mn.hbdn("hbih", hbdk(int ), (int)68), this.query.length() - mn.hbdn("hbii", hbdk(int ), (int)69));
                if (var2_4) ** GOTO lbl6
lbl41:
                // 3 sources

                if (var2_4 || var2_4) ** GOTO lbl6
                return (boolean)mn.hbdn("hbij", hbdk(int ), (int)70);
            }
lbl43:
            // 1 sources

            if (var2_4 || var2_4) ** GOTO lbl6
            if (var1_1.comp_4795() != mn.hbdn("hbik", hbdk(int ), (int)71)) ** GOTO lbl49
            if (var2_4 || var2_4) ** GOTO lbl6
            this.query = "";
            if (var2_4 || var2_4) ** GOTO lbl6
            return (boolean)mn.hbdn("hbil", hbdk(int ), (int)72);
lbl49:
            // 1 sources

            if (var2_4 || var2_4) ** GOTO lbl6
            if (var1_1.comp_4795() != mn.hbdn("hbim", hbdk(int ), (int)73)) ** GOTO lbl57
            if (var2_4) ** GOTO lbl6
            if ((var1_1.comp_4797() & mn.hbdn("hbin", hbdk(int ), (int)74)) == 0) ** GOTO lbl57
            if (var2_4 || var2_4) ** GOTO lbl6
            this.selectAll = mn.hbdn("hbio", hbdk(int ), (int)75);
            if (var2_4 || var2_4) ** GOTO lbl6
            return (boolean)mn.hbdn("hbip", hbdk(int ), (int)76);
lbl57:
            // 2 sources

            if (!var2_4 && !var2_4) ** break;
            ** continue;
            return (boolean)mn.hbdn("hbiq", hbdk(int ), (int)77);
lbl60:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)mn.hbdn("hbir", hbdk(int ), (int)78);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl128
            }
lbl65:
            // 2 sources

            case 1: {
                var3_3 /* !! */  = (int)mn.hbdn("hbis", hbdk(int ), (int)79);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl214
            }
lbl70:
            // 2 sources

            case 2: {
                var3_3 /* !! */  = (int)mn.hbdn("hbit", hbdk(int ), (int)80);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl155
            }
            case 3: {
                var3_3 /* !! */  = (int)mn.hbdn("hbiu", hbdk(int ), (int)81);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl161
            }
lbl80:
            // 3 sources

            case 4: {
                var3_3 /* !! */  = (int)mn.hbdn("hbiv", hbdk(int ), (int)82);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl105
            }
lbl85:
            // 2 sources

            case 5: {
                var3_3 /* !! */  = (int)mn.hbdn("hbiw", hbdk(int ), (int)83);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl222
            }
            case 6: {
                var3_3 /* !! */  = (int)mn.hbdn("hbix", hbdk(int ), (int)84);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl151
            }
lbl95:
            // 2 sources

            case 7: {
                var3_3 /* !! */  = (int)mn.hbdn("hbiy", hbdk(int ), (int)85);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl105
            }
lbl100:
            // 2 sources

            case 8: {
                var3_3 /* !! */  = (int)mn.hbdn("hbiz", hbdk(int ), (int)86);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl201
            }
lbl105:
            // 4 sources

            case 9: {
                var3_3 /* !! */  = (int)mn.hbdn("hbja", hbdk(int ), (int)87);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl226
            }
            case 10: {
                var3_3 /* !! */  = (int)mn.hbdn("hbjb", hbdk(int ), (int)88);
                if (!var4_2) ** GOTO lbl80
                throw null;
            }
            case 11: {
                var3_3 /* !! */  = (int)mn.hbdn("hbjc", hbdk(int ), (int)89);
                if (!var4_2) break;
                throw null;
            }
            case 12: {
                var3_3 /* !! */  = (int)mn.hbdn("hbjd", hbdk(int ), (int)90);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl250
            }
lbl123:
            // 2 sources

            case 13: {
                var3_3 /* !! */  = (int)mn.hbdn("hbje", hbdk(int ), (int)91);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl166
            }
lbl128:
            // 3 sources

            case 14: {
                var3_3 /* !! */  = (int)mn.hbdn("hbjf", hbdk(int ), (int)92);
                if (!var4_2) ** GOTO lbl65
                throw null;
            }
            case 15: {
                var3_3 /* !! */  = (int)mn.hbdn("hbjg", hbdk(int ), (int)93);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl246
            }
            case 16: {
                var3_3 /* !! */  = (int)mn.hbdn("hbjh", hbdk(int ), (int)94);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl175
            }
            case 17: {
                var3_3 /* !! */  = (int)mn.hbdn("hbji", hbdk(int ), (int)95);
                if (!var4_2) ** GOTO lbl60
                throw null;
            }
lbl146:
            // 3 sources

            case 18: {
                var3_3 /* !! */  = (int)mn.hbdn("hbjj", hbdk(int ), (int)96);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl184
            }
lbl151:
            // 2 sources

            case 19: {
                var3_3 /* !! */  = (int)mn.hbdn("hbjk", hbdk(int ), (int)97);
                if (var4_2) {
                    throw null;
                }
            }
lbl155:
            // 4 sources

            case 20: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)mn.hbdn("hbjl", hbdk(int ), (int)98);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl201
                    break;
                }
            }
lbl161:
            // 2 sources

            case 21: {
                var3_3 /* !! */  = (int)mn.hbdn("hbjm", hbdk(int ), (int)99);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl222
            }
lbl166:
            // 3 sources

            case 22: {
                var3_3 /* !! */  = (int)mn.hbdn("hbjn", hbdk(int ), (int)100);
                if (!var4_2) ** GOTO lbl146
                throw null;
            }
lbl170:
            // 3 sources

            case 23: {
                var3_3 /* !! */  = (int)mn.hbdn("hbjo", hbdk(int ), (int)101);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl254
            }
lbl175:
            // 4 sources

            case 24: {
                var3_3 /* !! */  = (int)mn.hbdn("hbjp", hbdk(int ), (int)102);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl209
            }
lbl180:
            // 3 sources

            case 25: {
                var3_3 /* !! */  = (int)mn.hbdn("hbjq", hbdk(int ), (int)103);
                if (!var4_2) ** GOTO lbl123
                throw null;
            }
lbl184:
            // 2 sources

            case 26: {
                var3_3 /* !! */  = (int)mn.hbdn("hbjr", hbdk(int ), (int)104);
                if (!var4_2) ** GOTO lbl175
                throw null;
            }
lbl188:
            // 2 sources

            case 27: {
                var3_3 /* !! */  = (int)mn.hbdn("hbjs", hbdk(int ), (int)105);
                if (!var4_2) ** GOTO lbl170
                throw null;
            }
            case 28: {
                var3_3 /* !! */  = (int)mn.hbdn("hbjt", hbdk(int ), (int)106);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl254
            }
            case 29: {
                var3_3 /* !! */  = (int)mn.hbdn("hbju", hbdk(int ), (int)107);
                if (!var4_2) ** GOTO lbl105
                throw null;
            }
lbl201:
            // 3 sources

            case 30: {
                var3_3 /* !! */  = (int)mn.hbdn("hbjv", hbdk(int ), (int)108);
                if (!var4_2) ** GOTO lbl175
                throw null;
            }
            case 31: {
                var3_3 /* !! */  = (int)mn.hbdn("hbjw", hbdk(int ), (int)109);
                if (!var4_2) ** GOTO lbl170
                throw null;
            }
lbl209:
            // 2 sources

            case 32: {
                var3_3 /* !! */  = (int)mn.hbdn("hbjx", hbdk(int ), (int)110);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl222
            }
lbl214:
            // 2 sources

            case 33: {
                var3_3 /* !! */  = (int)mn.hbdn("hbjy", hbdk(int ), (int)111);
                if (!var4_2) ** GOTO lbl166
                throw null;
            }
            case 34: {
                var3_3 /* !! */  = (int)mn.hbdn("hbjz", hbdk(int ), (int)112);
                if (!var4_2) ** GOTO lbl128
                throw null;
            }
lbl222:
            // 4 sources

            case 35: {
                var3_3 /* !! */  = (int)mn.hbdn("hbka", hbdk(int ), (int)113);
                if (!var4_2) ** GOTO lbl188
                throw null;
            }
lbl226:
            // 2 sources

            case 36: {
                var3_3 /* !! */  = (int)mn.hbdn("hbkb", hbdk(int ), (int)114);
                if (!var4_2) ** GOTO lbl180
                throw null;
            }
lbl230:
            // 2 sources

            case 37: {
                var3_3 /* !! */  = (int)mn.hbdn("hbkc", hbdk(int ), (int)115);
                if (!var4_2) ** GOTO lbl80
                throw null;
            }
            case 38: {
                var3_3 /* !! */  = (int)mn.hbdn("hbkd", hbdk(int ), (int)116);
                if (!var4_2) ** GOTO lbl95
                throw null;
            }
            case 39: {
                var3_3 /* !! */  = (int)mn.hbdn("hbke", hbdk(int ), (int)117);
                if (!var4_2) ** GOTO lbl146
                throw null;
            }
            case 40: {
                var3_3 /* !! */  = (int)mn.hbdn("hbkf", hbdk(int ), (int)118);
                if (!var4_2) ** GOTO lbl85
                throw null;
            }
lbl246:
            // 2 sources

            case 41: {
                var3_3 /* !! */  = (int)mn.hbdn("hbkg", hbdk(int ), (int)119);
                if (!var4_2) ** GOTO lbl180
                throw null;
            }
lbl250:
            // 2 sources

            case 42: {
                var3_3 /* !! */  = (int)mn.hbdn("hbkh", hbdk(int ), (int)120);
                if (!var4_2) ** GOTO lbl230
                throw null;
            }
lbl254:
            // 3 sources

            case 43: {
                var3_3 /* !! */  = (int)mn.hbdn("hbki", hbdk(int ), (int)121);
                if (!var4_2) ** GOTO lbl70
                throw null;
            }
            case 44: {
                var3_3 /* !! */  = (int)mn.hbdn("hbkj", hbdk(int ), (int)122);
                if (!var4_2) ** GOTO lbl100
                throw null;
            }
            case 45: 
        }
        var3_3 /* !! */  = (int)mn.hbdn("hbkk", hbdk(int ), (int)123);
        ** while (!var4_2)
lbl265:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void hbni() {
        mn.hbds[0] = 4449862126380555685L;
        mn.hbds[1] = 9208078864693613745L;
        mn.hbds[2] = -5147510826275866268L;
        mn.hbds[3] = 8062589148723831912L;
        mn.hbds[4] = -314142936609069167L;
        mn.hbds[5] = -6062662194850689416L;
        mn.hbds[6] = -8385979038531625951L;
        mn.hbds[7] = -1552134170148847504L;
        mn.hbds[8] = -6147588349186389378L;
        mn.hbds[9] = -1646499263920457585L;
        mn.hbds[10] = -4325256662394997808L;
        mn.hbds[11] = -8160627967363953036L;
        mn.hbds[12] = 487044912238155244L;
        mn.hbds[13] = 289831310528816777L;
        mn.hbds[14] = -7761876647646153261L;
        mn.hbds[15] = 4022933875033886076L;
        mn.hbds[16] = 6095014316080474439L;
        mn.hbds[17] = -3194685230196122013L;
        mn.hbds[18] = 1730600593188068290L;
        mn.hbds[19] = 2752790506169695587L;
        mn.hbds[20] = -2774579672544487095L;
        mn.hbds[21] = -3370559768823731353L;
        mn.hbds[22] = -8448100320806620375L;
        mn.hbds[23] = -4687052825930192803L;
        mn.hbds[24] = 2126710479075428512L;
        mn.hbds[25] = 4565391654018560206L;
        mn.hbds[26] = 2762384945775793972L;
        mn.hbds[27] = -2350775659219136767L;
        mn.hbds[28] = 2406586634778525677L;
        mn.hbds[29] = -6854342899309089878L;
        mn.hbds[30] = -1215647768523561134L;
        mn.hbds[31] = -2433097774734187308L;
        mn.hbds[32] = 7097521288210973686L;
        mn.hbds[33] = 1619589280708528511L;
        mn.hbds[34] = 3378753346437028217L;
        mn.hbds[35] = -4677062556406533887L;
        mn.hbds[36] = -7319714925832480098L;
        mn.hbds[37] = 7406133727218993410L;
        mn.hbds[38] = 242226133024510011L;
        mn.hbds[39] = 2039706627496258540L;
        mn.hbds[40] = 7517299915823491694L;
        mn.hbds[41] = 8416991543864884038L;
        mn.hbds[42] = 1506179915914100983L;
        mn.hbds[43] = -3071113416019801584L;
        mn.hbds[44] = 7415810817213330018L;
        mn.hbds[45] = 3440366727883944639L;
        mn.hbds[46] = -6273674026784377507L;
        mn.hbds[47] = -5967903001312043029L;
        mn.hbds[48] = -462726702565693508L;
        mn.hbds[49] = 5119240044925932471L;
        mn.hbds[50] = 3947397877320492784L;
        mn.hbds[51] = -1110213405753097450L;
        mn.hbds[52] = -6832567232226618138L;
        mn.hbds[53] = 6406374241952505176L;
        mn.hbds[54] = -6781387142938667572L;
        mn.hbds[55] = 372855963079718713L;
        mn.hbds[56] = -7435333827177500944L;
        mn.hbds[57] = 2370775333369082038L;
        mn.hbds[58] = 3205141301844259586L;
        mn.hbds[59] = 4429525748790618692L;
        mn.hbds[60] = 5088755227138524168L;
        mn.hbds[61] = 2080769842791580991L;
        mn.hbds[62] = -7305685322714190432L;
        mn.hbds[63] = 9043992940062281514L;
        mn.hbds[64] = 2621319175499594278L;
        mn.hbds[65] = 8699681239349890113L;
        mn.hbds[66] = 4773154669394597046L;
        mn.hbds[67] = -4436849902040315560L;
        mn.hbds[68] = -8360450362155494768L;
        mn.hbds[69] = -8108871967153579870L;
        mn.hbds[70] = -4715896315496882840L;
        mn.hbds[71] = -7959281494871464853L;
        mn.hbds[72] = -6235433897332003144L;
        mn.hbds[73] = -1021839552635968706L;
        mn.hbds[74] = 427090445348241126L;
        mn.hbds[75] = -8307465462832476885L;
        mn.hbds[76] = -8508787451093409436L;
        mn.hbds[77] = 4893386323127744826L;
        mn.hbds[78] = -6942595547620801448L;
        mn.hbds[79] = -6654306256393109694L;
        mn.hbds[80] = 7438541323194148904L;
        mn.hbds[81] = 6111412049995681030L;
        mn.hbds[82] = -2513618582428466847L;
        mn.hbds[83] = 6966050933522869251L;
        mn.hbds[84] = -5659861381530847168L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void open() {
        v0 /* !! */  = mn.ny;
        if (true) ** GOTO lbl5
        block20: while (true) {
            v0 /* !! */  = (long)(v1 - mn.hbdn("hbga", hbdr(int ), (int)26));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 69843012: {
                    v1 = mn.hbdn("hbgb", hbdr(int ), (int)27);
                    continue block20;
                }
                case 269131808: {
                    v1 = mn.hbdn("hbgc", hbdr(int ), (int)28);
                    continue block20;
                }
                case 1027577813: {
                    break block20;
                }
                case 1269559276: {
                    v1 = mn.hbdn("hbgd", hbdr(int ), (int)29);
                    continue block20;
                }
            }
            break;
        }
        var3_1 = mn.c;
        v2 /* !! */  = mn.ny;
        if (true) ** GOTO lbl22
        block21: while (true) {
            v2 /* !! */  = (long)(v3 - mn.hbdn("hbge", hbdr(int ), (int)30));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -464023735: {
                    v3 = mn.hbdn("hbgf", hbdr(int ), (int)31);
                    continue block21;
                }
                case 83474622: {
                    v3 = mn.hbdn("hbgg", hbdr(int ), (int)32);
                    continue block21;
                }
                case 1027577813: {
                    break block21;
                }
                case 1604053813: {
                    v3 = mn.hbdn("hbgh", hbdr(int ), (int)33);
                    continue block21;
                }
            }
            break;
        }
        var2_2 /* !! */  = mn.b;
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_0 = mn.ny - mn.hbdn("hbgi", hbdr(int ), (int)34)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == mn.hbdn("hbgj", hbdk(int ), (int)35)) break;
            v4 /* !! */  = (long)mn.hbdn("hbgk", hbdk(int ), (int)36);
        }
        var1_3 = mn.a;
        if (var3_1) {
            throw null;
lbl43:
            // 3 sources

            return;
        }
        if (var1_3) ** GOTO lbl43
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl43
                v5 = mn.hbdn("hbgl", hbdk(int ), (int)37);
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_1 = mn.ny - mn.hbdn("hbgm", hbdr(int ), (int)35)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == mn.hbdn("hbgn", hbdk(int ), (int)38)) break;
                    v6 /* !! */  = (long)mn.hbdn("hbgo", hbdk(int ), (int)39);
                }
                this.active = v5;
                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
lbl60:
            // 3 sources

            case 0: {
                do {
                    var2_2 /* !! */  = (int)mn.hbdn("hbgp", hbdk(int ), (int)40);
                } while (!var3_1);
                throw null;
            }
            case 1: {
                var2_2 /* !! */  = (int)mn.hbdn("hbgq", hbdk(int ), (int)41);
                if (!var3_1) break;
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)mn.hbdn("hbgr", hbdk(int ), (int)42);
                    if (!var3_1) ** GOTO lbl60
                    throw null;
                }
            }
lbl74:
            // 2 sources

            case 3: {
                var2_2 /* !! */  = (int)mn.hbdn("hbgs", hbdk(int ), (int)43);
                if (!var3_1) ** GOTO lbl60
                throw null;
            }
            case 4: {
                var2_2 /* !! */  = (int)mn.hbdn("hbgt", hbdk(int ), (int)44);
                if (!var3_1) ** GOTO lbl74
                throw null;
            }
            case 5: 
        }
        var2_2 /* !! */  = (int)mn.hbdn("hbgu", hbdk(int ), (int)45);
        ** while (!var3_1)
lbl85:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void hbng() {
        mn.hbdm[0] = -1955008408;
        mn.hbdm[1] = 1947068992;
        mn.hbdm[2] = 661743910;
        mn.hbdm[3] = -1947904951;
        mn.hbdm[4] = -1875777770;
        mn.hbdm[5] = -1046909944;
        mn.hbdm[6] = -2001147698;
        mn.hbdm[7] = 1088179098;
        mn.hbdm[8] = -311880347;
        mn.hbdm[9] = 1960576786;
        mn.hbdm[10] = -793542496;
        mn.hbdm[11] = -1983719821;
        mn.hbdm[12] = -1180558521;
        mn.hbdm[13] = -1177811909;
        mn.hbdm[14] = 1108222504;
        mn.hbdm[15] = 51035367;
        mn.hbdm[16] = 137450091;
        mn.hbdm[17] = -733872469;
        mn.hbdm[18] = 1697625252;
        mn.hbdm[19] = -2130734625;
        mn.hbdm[20] = -484665144;
        mn.hbdm[21] = -117131610;
        mn.hbdm[22] = 709969353;
        mn.hbdm[23] = 1319587407;
        mn.hbdm[24] = -343349582;
        mn.hbdm[25] = 1001344138;
        mn.hbdm[26] = -1328838686;
        mn.hbdm[27] = 1201789428;
        mn.hbdm[28] = -1121270143;
        mn.hbdm[29] = 435310957;
        mn.hbdm[30] = -389680946;
        mn.hbdm[31] = -1153961149;
        mn.hbdm[32] = -538373822;
        mn.hbdm[33] = -1002644071;
        mn.hbdm[34] = -292484007;
        mn.hbdm[35] = 1894999412;
        mn.hbdm[36] = 224204626;
        mn.hbdm[37] = 1121405373;
        mn.hbdm[38] = 1468573313;
        mn.hbdm[39] = 1389987882;
        mn.hbdm[40] = 1348040643;
        mn.hbdm[41] = -1977262091;
        mn.hbdm[42] = -1628697528;
        mn.hbdm[43] = 1526929439;
        mn.hbdm[44] = -481638970;
        mn.hbdm[45] = -1334196170;
        mn.hbdm[46] = -1451289070;
        mn.hbdm[47] = -38071246;
        mn.hbdm[48] = -68035524;
        mn.hbdm[49] = 908497945;
        mn.hbdm[50] = -1571356344;
        mn.hbdm[51] = -1121475945;
        mn.hbdm[52] = 631683386;
        mn.hbdm[53] = -859977094;
        mn.hbdm[54] = -1099395155;
        mn.hbdm[55] = 1156769657;
        mn.hbdm[56] = -79988890;
        mn.hbdm[57] = 1468697057;
        mn.hbdm[58] = -131615205;
        mn.hbdm[59] = -875951714;
        mn.hbdm[60] = 1876781196;
        mn.hbdm[61] = -1597282527;
        mn.hbdm[62] = -774383394;
        mn.hbdm[63] = 314991103;
        mn.hbdm[64] = 1108822623;
        mn.hbdm[65] = 473503411;
        mn.hbdm[66] = -552117590;
        mn.hbdm[67] = -1880741569;
        mn.hbdm[68] = 1885609541;
        mn.hbdm[69] = 332049344;
        mn.hbdm[70] = 905785132;
        mn.hbdm[71] = 736582452;
        mn.hbdm[72] = -1023144463;
        mn.hbdm[73] = -1678358024;
        mn.hbdm[74] = 1441335884;
        mn.hbdm[75] = -1220350246;
        mn.hbdm[76] = 2083026513;
        mn.hbdm[77] = -362110813;
        mn.hbdm[78] = -2021605454;
        mn.hbdm[79] = -225502839;
        mn.hbdm[80] = 1041972395;
        mn.hbdm[81] = 1618772725;
        mn.hbdm[82] = 161846924;
        mn.hbdm[83] = 1290146154;
        mn.hbdm[84] = 1252250114;
        mn.hbdm[85] = 577057189;
        mn.hbdm[86] = -1719364211;
        mn.hbdm[87] = 47317799;
        mn.hbdm[88] = 1177454782;
        mn.hbdm[89] = -1323095616;
        mn.hbdm[90] = 1955662648;
        mn.hbdm[91] = -1558827295;
        mn.hbdm[92] = -1168039797;
        mn.hbdm[93] = -1483174726;
        mn.hbdm[94] = 2053690973;
        mn.hbdm[95] = -407347097;
        mn.hbdm[96] = -384717696;
        mn.hbdm[97] = -1046514235;
        mn.hbdm[98] = -157928733;
        mn.hbdm[99] = 2016229027;
    }
}

