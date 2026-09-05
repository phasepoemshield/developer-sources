/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_3675$class_307
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.function.Supplier;
import net.minecraft.class_3675;
import ruhack.phobia.jx;

public class ka
extends jx {
    public static final boolean c;
    private static int[] lkef;
    protected static final long uc = -9209939556856284067L;
    private int type;
    private int key;
    public static final int b;
    public static final int WHEEL_DOWN = -3;
    private static long[] lket;
    public static final int WHEEL_UP = -2;
    public static final boolean a;
    private boolean mouse;
    private static int[] lkeg;
    private static long[] lkes;

    private static /* synthetic */ void lkqm() {
        ka.lkes[100] = 7668828059568366496L;
        ka.lkes[101] = 655879296831043088L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean isMouse() {
        v0 /* !! */  = ka.uc;
        if (true) ** GOTO lbl5
        block21: while (true) {
            v0 /* !! */  = (long)(ka.lkeh("lkns", lker(int ), (int)67) - ka.lkeh("lknr", lker(int ), (int)66));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -154977187: {
                    break block21;
                }
                case 1002800152: {
                    continue block21;
                }
            }
            break;
        }
        var3_1 = ka.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = ka.uc - ka.lkeh("lknt", lker(int ), (int)68)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == ka.lkeh("lknu", lkee(int ), (int)174)) break;
            v1 /* !! */  = (long)ka.lkeh("lknv", lkee(int ), (int)175);
        }
        var2_2 /* !! */  = ka.b;
        v2 /* !! */  = ka.uc;
        if (true) ** GOTO lbl22
        block23: while (true) {
            v2 /* !! */  = (long)(v3 - ka.lkeh("lknw", lker(int ), (int)69));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1583038986: {
                    v3 = ka.lkeh("lknx", lker(int ), (int)70);
                    continue block23;
                }
                case -154977187: {
                    break block23;
                }
                case 925094737: {
                    v3 = ka.lkeh("lkny", lker(int ), (int)71);
                    continue block23;
                }
                case 2005973897: {
                    v3 = ka.lkeh("lknz", lker(int ), (int)72);
                    continue block23;
                }
            }
            break;
        }
        var1_3 = ka.a;
        if (var3_1) {
            throw null;
lbl37:
            // 2 sources

            return (boolean)ka.lkeh("lkoa", lkee(int ), (int)176);
        }
        if (var1_3) ** GOTO lbl37
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block10 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                v4 /* !! */  = ka.uc;
                if (true) ** GOTO lbl48
                block25: while (true) {
                    v4 /* !! */  = (long)(v5 - ka.lkeh("lkob", lker(int ), (int)73));
lbl48:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1983565312: {
                            v5 = ka.lkeh("lkoc", lker(int ), (int)74);
                            continue block25;
                        }
                        case -458074173: {
                            v5 = ka.lkeh("lkod", lker(int ), (int)75);
                            continue block25;
                        }
                        case -154977187: {
                            break block25;
                        }
                    }
                    break;
                }
                return this.mouse;
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ka.lkeh("lkoe", lkee(int ), (int)177);
                    if (!var3_1) break block10;
                    throw null;
                }
            }
lbl63:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)ka.lkeh("lkof", lkee(int ), (int)178);
                if (!var3_1) break;
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)ka.lkeh("lkog", lkee(int ), (int)179);
                if (!var3_1) ** GOTO lbl63
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)ka.lkeh("lkoh", lkee(int ), (int)180);
        ** while (!var3_1)
lbl74:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public int getType() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ka.uc - ka.lkeh("lkmz", lker(int ), (int)57)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ka.lkeh("lkna", lkee(int ), (int)165)) break;
            v0 /* !! */  = (long)ka.lkeh("lknb", lkee(int ), (int)166);
        }
        var3_1 = ka.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ka.uc - ka.lkeh("lknc", lker(int ), (int)58)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == ka.lkeh("lknd", lkee(int ), (int)167)) break;
            v1 /* !! */  = (long)ka.lkeh("lkne", lkee(int ), (int)168);
        }
        var2_2 /* !! */  = ka.b;
        v2 /* !! */  = ka.uc;
        if (true) ** GOTO lbl19
        block19: while (true) {
            v2 /* !! */  = (long)(v3 - ka.lkeh("lknf", lker(int ), (int)59));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -154977187: {
                    break block19;
                }
                case 1052571570: {
                    v3 = ka.lkeh("lkng", lker(int ), (int)60);
                    continue block19;
                }
                case 1291053717: {
                    v3 = ka.lkeh("lknh", lker(int ), (int)61);
                    continue block19;
                }
                case 1298617328: {
                    v3 = ka.lkeh("lkni", lker(int ), (int)62);
                    continue block19;
                }
            }
            break;
        }
        var1_3 = ka.a;
        if (var3_1) {
            throw null;
lbl34:
            // 2 sources

            return (int)ka.lkeh("lknj", lkee(int ), (int)169);
        }
        if (var1_3) ** GOTO lbl34
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                v4 /* !! */  = ka.uc;
                if (true) ** GOTO lbl45
                block21: while (true) {
                    v4 /* !! */  = (long)(v5 - ka.lkeh("lknk", lker(int ), (int)63));
lbl45:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1627706718: {
                            v5 = ka.lkeh("lknl", lker(int ), (int)64);
                            continue block21;
                        }
                        case -684698545: {
                            v5 = ka.lkeh("lknm", lker(int ), (int)65);
                            continue block21;
                        }
                        case -154977187: {
                            break block21;
                        }
                    }
                    break;
                }
                return this.type;
            }
lbl55:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)ka.lkeh("lknn", lkee(int ), (int)170);
                if (var3_1) {
                    throw null;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)ka.lkeh("lkno", lkee(int ), (int)171);
                if (!var3_1) ** GOTO lbl55
                throw null;
            }
            case 2: {
                do {
                    var2_2 /* !! */  = (int)ka.lkeh("lknp", lkee(int ), (int)172);
                } while (!var3_1);
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)ka.lkeh("lknq", lkee(int ), (int)173);
        } while (!var3_1);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public ka visible(Supplier<Boolean> var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ka.uc - ka.lkeh("lklq", lker(int ), (int)43)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ka.lkeh("lklr", lkee(int ), (int)144)) break;
            v0 /* !! */  = (long)ka.lkeh("lkls", lkee(int ), (int)145);
        }
        var4_2 = ka.c;
        v1 /* !! */  = ka.uc;
        if (true) ** GOTO lbl11
        block15: while (true) {
            v1 /* !! */  = (long)(v2 - ka.lkeh("lklt", lker(int ), (int)44));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -907942758: {
                    v2 = ka.lkeh("lklu", lker(int ), (int)45);
                    continue block15;
                }
                case -270099119: {
                    v2 = ka.lkeh("lklv", lker(int ), (int)46);
                    continue block15;
                }
                case -154977187: {
                    break block15;
                }
                case 944218876: {
                    v2 = ka.lkeh("lklw", lker(int ), (int)47);
                    continue block15;
                }
            }
            break;
        }
        var3_3 /* !! */  = ka.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = ka.uc - ka.lkeh("lklx", lker(int ), (int)48)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == ka.lkeh("lkly", lkee(int ), (int)146)) break;
            v3 /* !! */  = (long)ka.lkeh("lklz", lkee(int ), (int)147);
        }
        var2_4 = ka.a;
        if (var4_2) {
            throw null;
lbl32:
            // 2 sources

            return null;
        }
        if (var2_4 || var2_4) ** GOTO lbl32
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_2 = ka.uc - ka.lkeh("lkma", lker(int ), (int)49)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == ka.lkeh("lkmb", lkee(int ), (int)148)) break;
            v4 /* !! */  = (long)ka.lkeh("lkmc", lkee(int ), (int)149);
        }
        this.setVisible(var1_1);
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4 || var2_4) ** continue;
                return this;
            }
            case 0: {
                var3_3 /* !! */  = (int)ka.lkeh("lkmd", lkee(int ), (int)150);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl60
            }
lbl51:
            // 2 sources

            case 1: {
                var3_3 /* !! */  = (int)ka.lkeh("lkme", lkee(int ), (int)151);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl60
            }
            case 2: {
                var3_3 /* !! */  = (int)ka.lkeh("lkmf", lkee(int ), (int)152);
                if (!var4_2) ** GOTO lbl51
                throw null;
            }
lbl60:
            // 4 sources

            case 3: {
                do {
                    var3_3 /* !! */  = (int)ka.lkeh("lkmg", lkee(int ), (int)153);
                } while (!var4_2);
                throw null;
            }
            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)ka.lkeh("lkmh", lkee(int ), (int)154);
                    if (!var4_2) ** GOTO lbl60
                    throw null;
                }
            }
            case 5: 
        }
        var3_3 /* !! */  = (int)ka.lkeh("lkmi", lkee(int ), (int)155);
        ** while (!var4_2)
lbl73:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void lkqf() {
        ka.lkef[0] = 2012335994;
        ka.lkef[1] = -1979388325;
        ka.lkef[2] = 1787519457;
        ka.lkef[3] = 2128781550;
        ka.lkef[4] = 86880498;
        ka.lkef[5] = -1170636803;
        ka.lkef[6] = -2112702340;
        ka.lkef[7] = -80675204;
        ka.lkef[8] = -2010077138;
        ka.lkef[9] = -186090946;
        ka.lkef[10] = 746533851;
        ka.lkef[11] = 421149644;
        ka.lkef[12] = 1196480442;
        ka.lkef[13] = -1528116882;
        ka.lkef[14] = 1099478404;
        ka.lkef[15] = 1497381956;
        ka.lkef[16] = 2084257865;
        ka.lkef[17] = -124927512;
        ka.lkef[18] = 1724419107;
        ka.lkef[19] = -1032268817;
        ka.lkef[20] = -415656232;
        ka.lkef[21] = -1339976866;
        ka.lkef[22] = -1641691430;
        ka.lkef[23] = -505779661;
        ka.lkef[24] = -1328256301;
        ka.lkef[25] = -270232442;
        ka.lkef[26] = 1382189582;
        ka.lkef[27] = -725975535;
        ka.lkef[28] = 555763607;
        ka.lkef[29] = 1946770064;
        ka.lkef[30] = 262928534;
        ka.lkef[31] = -794766562;
        ka.lkef[32] = 201533516;
        ka.lkef[33] = 1580075375;
        ka.lkef[34] = 2029082325;
        ka.lkef[35] = 2008540291;
        ka.lkef[36] = 974930561;
        ka.lkef[37] = -542903889;
        ka.lkef[38] = -297196039;
        ka.lkef[39] = -293977638;
        ka.lkef[40] = 1492314094;
        ka.lkef[41] = -1275241916;
        ka.lkef[42] = -1488863997;
        ka.lkef[43] = -925001008;
        ka.lkef[44] = 843827798;
        ka.lkef[45] = -987094748;
        ka.lkef[46] = -114258856;
        ka.lkef[47] = -2001138244;
        ka.lkef[48] = -243840991;
        ka.lkef[49] = 876197845;
        ka.lkef[50] = -22920613;
        ka.lkef[51] = 1253237062;
        ka.lkef[52] = 720766472;
        ka.lkef[53] = -1381899202;
        ka.lkef[54] = 104231653;
        ka.lkef[55] = 877477280;
        ka.lkef[56] = -641906466;
        ka.lkef[57] = -2127935144;
        ka.lkef[58] = 1243625974;
        ka.lkef[59] = -1470396786;
        ka.lkef[60] = -338827802;
        ka.lkef[61] = 152632615;
        ka.lkef[62] = 2129453397;
        ka.lkef[63] = 530594860;
        ka.lkef[64] = 1604967507;
        ka.lkef[65] = 1396485512;
        ka.lkef[66] = -130387399;
        ka.lkef[67] = -991066528;
        ka.lkef[68] = 2019683028;
        ka.lkef[69] = -315286925;
        ka.lkef[70] = -106322580;
        ka.lkef[71] = -1927229799;
        ka.lkef[72] = 532002608;
        ka.lkef[73] = 1680009056;
        ka.lkef[74] = 521791291;
        ka.lkef[75] = 99879489;
        ka.lkef[76] = -229221369;
        ka.lkef[77] = 114975195;
        ka.lkef[78] = 2127878116;
        ka.lkef[79] = 124380578;
        ka.lkef[80] = 1452637452;
        ka.lkef[81] = 816572679;
        ka.lkef[82] = 1462613854;
        ka.lkef[83] = -714813748;
        ka.lkef[84] = 1988691703;
        ka.lkef[85] = -911952645;
        ka.lkef[86] = 650878406;
        ka.lkef[87] = 1330823723;
        ka.lkef[88] = 864478455;
        ka.lkef[89] = 1214500462;
        ka.lkef[90] = -2067370120;
        ka.lkef[91] = -1898223778;
        ka.lkef[92] = 1261626661;
        ka.lkef[93] = -1804532016;
        ka.lkef[94] = -380413875;
        ka.lkef[95] = 1774917078;
        ka.lkef[96] = 410668917;
        ka.lkef[97] = -371578308;
        ka.lkef[98] = 1762349250;
        ka.lkef[99] = 298275655;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public String getKeyDisplayName() {
        boolean bl2;
        Object object = uc;
        boolean bl3 = true;
        block26: while (true) {
            CallSite callSite;
            if (!bl3 || (bl3 = false) || !true) {
                object = callSite - ka.lkeh("lkje", lker(int ), (int)26);
            }
            switch ((int)object) {
                case -1765265707: {
                    callSite = ka.lkeh("lkjf", lker(int ), (int)27);
                    continue block26;
                }
                case -154977187: {
                    break block26;
                }
                case 1960928582: {
                    callSite = ka.lkeh("lkjg", lker(int ), (int)28);
                    continue block26;
                }
            }
            break;
        }
        boolean bl4 = c;
        Object object2 = uc;
        boolean bl5 = true;
        block27: while (true) {
            CallSite callSite;
            if (!bl5 || (bl5 = false) || !true) {
                object2 = callSite - ka.lkeh("lkjh", lker(int ), (int)29);
            }
            switch ((int)object2) {
                case -327600732: {
                    callSite = ka.lkeh("lkji", lker(int ), (int)30);
                    continue block27;
                }
                case -154977187: {
                    break block27;
                }
                case 2075276359: {
                    callSite = ka.lkeh("lkjj", lker(int ), (int)31);
                    continue block27;
                }
            }
            break;
        }
        int n2 = b;
        while (true) {
            long l2;
            Object object3;
            if ((object3 = (l2 = uc - ka.lkeh("lkjk", lker(int ), (int)32)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (object3 == ka.lkeh("lkjl", lkee(int ), (int)97)) {
                bl2 = a;
                if (bl4) {
                    throw null;
                }
                break;
            }
            object3 = ka.lkeh("lkjm", lkee(int ), (int)98);
        }
        if (bl2) return null;
        if (bl2) return null;
        Object object4 = uc;
        boolean bl6 = true;
        block29: while (true) {
            CallSite callSite;
            if (!bl6 || (bl6 = false) || !true) {
                object4 = callSite - ka.lkeh("lkjn", lker(int ), (int)33);
            }
            switch ((int)object4) {
                case -2125734694: {
                    callSite = ka.lkeh("lkjo", lker(int ), (int)34);
                    continue block29;
                }
                case -1904648197: {
                    callSite = ka.lkeh("lkjp", lker(int ), (int)35);
                    continue block29;
                }
                case -154977187: {
                    break block29;
                }
                case 619094839: {
                    callSite = ka.lkeh("lkjq", lker(int ), (int)36);
                    continue block29;
                }
            }
            break;
        }
        Object object5 = uc;
        block30: while (true) {
            switch ((int)object5) {
                case -154977187: {
                    break block30;
                }
                case 19595187: {
                    object5 = ka.lkeh("lkjs", lker(int ), (int)38) - ka.lkeh("lkjr", lker(int ), (int)37);
                    continue block30;
                }
            }
            break;
        }
        Object object6 = uc;
        boolean bl7 = true;
        block31: while (true) {
            CallSite callSite;
            if (!bl7 || (bl7 = false) || !true) {
                object6 = callSite - ka.lkeh("lkjt", lker(int ), (int)39);
            }
            switch ((int)object6) {
                case -154977187: {
                    return ka.formatKey(this.key, this.mouse);
                }
                case 748062434: {
                    callSite = ka.lkeh("lkju", lker(int ), (int)40);
                    continue block31;
                }
                case 1915236391: {
                    callSite = ka.lkeh("lkjv", lker(int ), (int)41);
                    continue block31;
                }
                case 2060399935: {
                    callSite = ka.lkeh("lkjw", lker(int ), (int)42);
                    continue block31;
                }
            }
            break;
        }
        return ka.formatKey(this.key, this.mouse);
    }

    static {
        lkef = new int[204];
        lkeg = new int[204];
        ka.lkqf();
        ka.lkqg();
        ka.lkqh();
        ka.lkqi();
        ka.lkqj();
        ka.lkqk();
        lkes = new long[102];
        lket = new long[102];
        ka.lkql();
        ka.lkqm();
        ka.lkqn();
        ka.lkqo();
    }

    private static /* synthetic */ void lkqo() {
        ka.lket[100] = -4068101175903315771L;
        ka.lket[101] = 109715232740425048L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean isPressed(int var1_1, class_3675.class_307 var2_2) {
        block68: {
            block70: {
                block69: {
                    block65: {
                        block67: {
                            block66: {
                                block64: {
                                    var5_3 = ka.c;
                                    var4_4 /* !! */  = ka.b;
                                    var3_5 = ka.a;
                                    if (var5_3) {
                                        throw null;
lbl6:
                                        // 16 sources

                                        return (boolean)ka.lkeh("lkgq", lkee(int ), (int)37);
                                    }
                                    if (var3_5 || var3_5) ** GOTO lbl6
                                    if (this.key != ka.lkeh("lkgr", lkee(int ), (int)38)) break block64;
                                    if (var3_5 || var3_5) ** GOTO lbl6
                                    return (boolean)ka.lkeh("lkgs", lkee(int ), (int)39);
                                }
                                if (var3_5 || var3_5) ** GOTO lbl6
                                if (!ka.isWheel(this.key)) break block65;
                                if (var3_5 || var3_5) ** GOTO lbl6
                                if (var2_2 != class_3675.class_307.field_1672) break block66;
                                if (var3_5) ** GOTO lbl6
                                if (var1_1 != this.key) break block66;
                                if (var3_5) ** GOTO lbl6
                                v0 = ka.lkeh("lkgt", lkee(int ), (int)40);
                                if (var5_3) {
                                    throw null;
                                }
                                break block67;
                            }
                            if (var3_5 || var3_5) ** GOTO lbl6
                            v0 = ka.lkeh("lkgu", lkee(int ), (int)41);
                        }
                        return (boolean)v0;
                    }
                    if (var3_5 || var3_5) ** GOTO lbl6
                    if (!this.mouse) break block68;
                    if (var3_5 || var3_5) ** GOTO lbl6
                    if (var2_2 != class_3675.class_307.field_1672) break block69;
                    if (var3_5) ** GOTO lbl6
                    if (var1_1 != this.key) break block69;
                    if (var3_5) ** GOTO lbl6
                    v1 = ka.lkeh("lkgv", lkee(int ), (int)42);
                    if (var5_3) {
                        throw null;
                    }
                    break block70;
                }
                if (var3_5 || var3_5) ** GOTO lbl6
                v1 = ka.lkeh("lkgw", lkee(int ), (int)43);
            }
            return (boolean)v1;
        }
        if (var3_5 || var3_5) ** GOTO lbl6
        if (var4_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_2 != class_3675.class_307.field_1668) ** GOTO lbl59
                if (var3_5) ** GOTO lbl6
                if (var1_1 != this.key) ** GOTO lbl59
                if (var3_5) ** GOTO lbl6
                v2 = ka.lkeh("lkgx", lkee(int ), (int)44);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl62
lbl59:
                // 2 sources

                if (!var3_5 && !var3_5) ** break;
                ** continue;
                v2 = ka.lkeh("lkgy", lkee(int ), (int)45);
lbl62:
                // 2 sources

                return (boolean)v2;
            }
lbl63:
            // 2 sources

            case 0: {
                var4_4 /* !! */  = (int)ka.lkeh("lkgz", lkee(int ), (int)46);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl82
            }
lbl68:
            // 5 sources

            case 1: {
                var4_4 /* !! */  = (int)ka.lkeh("lkha", lkee(int ), (int)47);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl168
            }
lbl73:
            // 2 sources

            case 2: {
                var4_4 /* !! */  = (int)ka.lkeh("lkhb", lkee(int ), (int)48);
                if (!var5_3) ** GOTO lbl68
                throw null;
            }
lbl77:
            // 2 sources

            case 3: {
                var4_4 /* !! */  = (int)ka.lkeh("lkhc", lkee(int ), (int)49);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl136
            }
lbl82:
            // 3 sources

            case 4: {
                var4_4 /* !! */  = (int)ka.lkeh("lkhd", lkee(int ), (int)50);
                if (!var5_3) ** GOTO lbl68
                throw null;
            }
            case 5: {
                var4_4 /* !! */  = (int)ka.lkeh("lkhe", lkee(int ), (int)51);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl136
            }
lbl91:
            // 2 sources

            case 6: {
                var4_4 /* !! */  = (int)ka.lkeh("lkhf", lkee(int ), (int)52);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl180
            }
lbl96:
            // 3 sources

            case 7: {
                var4_4 /* !! */  = (int)ka.lkeh("lkhg", lkee(int ), (int)53);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl193
            }
lbl101:
            // 2 sources

            case 8: {
                var4_4 /* !! */  = (int)ka.lkeh("lkhh", lkee(int ), (int)54);
                if (!var5_3) break;
                throw null;
            }
lbl105:
            // 2 sources

            case 9: {
                var4_4 /* !! */  = (int)ka.lkeh("lkhi", lkee(int ), (int)55);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl180
            }
lbl110:
            // 2 sources

            case 10: {
                var4_4 /* !! */  = (int)ka.lkeh("lkhj", lkee(int ), (int)56);
                if (!var5_3) ** GOTO lbl96
                throw null;
            }
            case 11: {
                var4_4 /* !! */  = (int)ka.lkeh("lkhk", lkee(int ), (int)57);
                if (!var5_3) ** GOTO lbl105
                throw null;
            }
            case 12: {
                var4_4 /* !! */  = (int)ka.lkeh("lkhl", lkee(int ), (int)58);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl164
            }
            case 13: {
                var4_4 /* !! */  = (int)ka.lkeh("lkhm", lkee(int ), (int)59);
                if (!var5_3) ** GOTO lbl68
                throw null;
            }
            case 14: {
                var4_4 /* !! */  = (int)ka.lkeh("lkhn", lkee(int ), (int)60);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl172
            }
            case 15: {
                var4_4 /* !! */  = (int)ka.lkeh("lkho", lkee(int ), (int)61);
                if (!var5_3) ** GOTO lbl73
                throw null;
            }
lbl136:
            // 3 sources

            case 16: {
                var4_4 /* !! */  = (int)ka.lkeh("lkhp", lkee(int ), (int)62);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl176
            }
            case 17: {
                var4_4 /* !! */  = (int)ka.lkeh("lkhq", lkee(int ), (int)63);
                if (!var5_3) ** GOTO lbl77
                throw null;
            }
            case 18: {
                var4_4 /* !! */  = (int)ka.lkeh("lkhr", lkee(int ), (int)64);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl176
            }
            case 19: {
                var4_4 /* !! */  = (int)ka.lkeh("lkhs", lkee(int ), (int)65);
                if (!var5_3) ** GOTO lbl91
                throw null;
            }
            case 20: {
                do {
                    var4_4 /* !! */  = (int)ka.lkeh("lkht", lkee(int ), (int)66);
                } while (!var5_3);
                throw null;
            }
lbl159:
            // 2 sources

            case 21: {
                var4_4 /* !! */  = (int)ka.lkeh("lkhu", lkee(int ), (int)67);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl193
            }
lbl164:
            // 3 sources

            case 22: {
                var4_4 /* !! */  = (int)ka.lkeh("lkhv", lkee(int ), (int)68);
                if (!var5_3) ** GOTO lbl101
                throw null;
            }
lbl168:
            // 2 sources

            case 23: {
                var4_4 /* !! */  = (int)ka.lkeh("lkhw", lkee(int ), (int)69);
                if (!var5_3) ** GOTO lbl63
                throw null;
            }
lbl172:
            // 2 sources

            case 24: {
                var4_4 /* !! */  = (int)ka.lkeh("lkhx", lkee(int ), (int)70);
                if (!var5_3) ** GOTO lbl68
                throw null;
            }
lbl176:
            // 3 sources

            case 25: {
                var4_4 /* !! */  = (int)ka.lkeh("lkhy", lkee(int ), (int)71);
                if (!var5_3) ** GOTO lbl110
                throw null;
            }
lbl180:
            // 3 sources

            case 26: {
                var4_4 /* !! */  = (int)ka.lkeh("lkhz", lkee(int ), (int)72);
                if (!var5_3) ** GOTO lbl159
                throw null;
            }
            case 27: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_4 /* !! */  = (int)ka.lkeh("lkia", lkee(int ), (int)73);
                    if (!var5_3) ** GOTO lbl82
                    throw null;
                }
            }
            case 28: {
                var4_4 /* !! */  = (int)ka.lkeh("lkib", lkee(int ), (int)74);
                if (!var5_3) ** GOTO lbl164
                throw null;
            }
lbl193:
            // 3 sources

            case 29: {
                var4_4 /* !! */  = (int)ka.lkeh("lkic", lkee(int ), (int)75);
                if (!var5_3) ** GOTO lbl96
                throw null;
            }
            case 30: 
        }
        var4_4 /* !! */  = (int)ka.lkeh("lkid", lkee(int ), (int)76);
        ** while (!var5_3)
lbl200:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ int lkee(int n2) {
        return lkef[n2] ^ lkeg[n2];
    }

    private static /* synthetic */ void lkqk() {
        ka.lkeg[200] = -2131515588;
        ka.lkeg[201] = 2129970860;
        ka.lkeg[202] = 291222102;
        ka.lkeg[203] = -1995505097;
    }

    private static /* synthetic */ void lkqi() {
        ka.lkeg[0] = -2012335995;
        ka.lkeg[1] = -1979388326;
        ka.lkeg[2] = 1787519457;
        ka.lkeg[3] = 2128781548;
        ka.lkeg[4] = 86880496;
        ka.lkeg[5] = -1170636804;
        ka.lkeg[6] = -2112702337;
        ka.lkeg[7] = -80675207;
        ka.lkeg[8] = -2010077142;
        ka.lkeg[9] = 186090945;
        ka.lkeg[10] = -877112775;
        ka.lkeg[11] = -421149645;
        ka.lkeg[12] = -970251707;
        ka.lkeg[13] = 1528116881;
        ka.lkeg[14] = -2126337694;
        ka.lkeg[15] = 1497381959;
        ka.lkeg[16] = 2084257868;
        ka.lkeg[17] = -124927508;
        ka.lkeg[18] = 1724419110;
        ka.lkeg[19] = -1032268817;
        ka.lkeg[20] = -415656227;
        ka.lkeg[21] = -1339976866;
        ka.lkeg[22] = -1641691428;
        ka.lkeg[23] = 505779660;
        ka.lkeg[24] = 465682014;
        ka.lkeg[25] = 270232441;
        ka.lkeg[26] = -1909966111;
        ka.lkeg[27] = 725975534;
        ka.lkeg[28] = 555763607;
        ka.lkeg[29] = 1946770066;
        ka.lkeg[30] = 262928530;
        ka.lkeg[31] = -794766568;
        ka.lkeg[32] = 201533513;
        ka.lkeg[33] = 1580075371;
        ka.lkeg[34] = 2029082320;
        ka.lkeg[35] = 2008540294;
        ka.lkeg[36] = 974930565;
        ka.lkeg[37] = -542903890;
        ka.lkeg[38] = 297196038;
        ka.lkeg[39] = -293977638;
        ka.lkeg[40] = 1492314095;
        ka.lkeg[41] = -1275241916;
        ka.lkeg[42] = -1488863998;
        ka.lkeg[43] = -925001008;
        ka.lkeg[44] = 843827799;
        ka.lkeg[45] = -987094748;
        ka.lkeg[46] = -114258870;
        ka.lkeg[47] = -2001138263;
        ka.lkeg[48] = -243840969;
        ka.lkeg[49] = 876197841;
        ka.lkeg[50] = -22920625;
        ka.lkeg[51] = 1253237071;
        ka.lkeg[52] = 720766468;
        ka.lkeg[53] = -1381899226;
        ka.lkeg[54] = 104231649;
        ka.lkeg[55] = 877477308;
        ka.lkeg[56] = -641906489;
        ka.lkeg[57] = -2127935147;
        ka.lkeg[58] = 1243625957;
        ka.lkeg[59] = -1470396771;
        ka.lkeg[60] = -338827796;
        ka.lkeg[61] = 152632620;
        ka.lkeg[62] = 2129453382;
        ka.lkeg[63] = 530594866;
        ka.lkeg[64] = 1604967514;
        ka.lkeg[65] = 1396485530;
        ka.lkeg[66] = -130387415;
        ka.lkeg[67] = -991066505;
        ka.lkeg[68] = 2019683011;
        ka.lkeg[69] = -315286926;
        ka.lkeg[70] = -106322588;
        ka.lkeg[71] = -1927229816;
        ka.lkeg[72] = 532002620;
        ka.lkeg[73] = 1680009070;
        ka.lkeg[74] = 521791279;
        ka.lkeg[75] = 99879489;
        ka.lkeg[76] = -229221361;
        ka.lkeg[77] = -114975196;
        ka.lkeg[78] = -2096861744;
        ka.lkeg[79] = -124380579;
        ka.lkeg[80] = -606602419;
        ka.lkeg[81] = 816572679;
        ka.lkeg[82] = -1462613856;
        ka.lkeg[83] = 714813745;
        ka.lkeg[84] = 1988691702;
        ka.lkeg[85] = -911952645;
        ka.lkeg[86] = 650878405;
        ka.lkeg[87] = 1330823720;
        ka.lkeg[88] = 864478449;
        ka.lkeg[89] = 1214500456;
        ka.lkeg[90] = -2067370126;
        ka.lkeg[91] = -1898223777;
        ka.lkeg[92] = 1261626671;
        ka.lkeg[93] = -1804532006;
        ka.lkeg[94] = -380413877;
        ka.lkeg[95] = 1774917075;
        ka.lkeg[96] = 410668914;
        ka.lkeg[97] = 371578307;
        ka.lkeg[98] = -1438420596;
        ka.lkeg[99] = 298275654;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public int getKey() {
        block28: {
            v0 /* !! */  = ka.uc;
            block15: while (true) {
                switch ((int)v0 /* !! */ ) {
                    case -154977187: {
                        break block15;
                    }
                    case 1279093680: {
                        v0 /* !! */  = (long)(ka.lkeh("lkmk", lker(int ), (int)51) - ka.lkeh("lkmj", lker(int ), (int)50));
                        continue block15;
                    }
                }
                break;
            }
            var3_1 = ka.c;
            v1 /* !! */  = ka.uc;
            if (true) ** GOTO lbl14
            block16: while (true) {
                v1 /* !! */  = (long)(v2 - ka.lkeh("lkml", lker(int ), (int)52));
lbl14:
                // 2 sources

                switch ((int)v1 /* !! */ ) {
                    case -207302935: {
                        v2 = ka.lkeh("lkmm", lker(int ), (int)53);
                        continue block16;
                    }
                    case -154977187: {
                        break block16;
                    }
                    case 1844627518: {
                        v2 = ka.lkeh("lkmn", lker(int ), (int)54);
                        continue block16;
                    }
                }
                break;
            }
            var2_2 /* !! */  = ka.b;
            while (true) {
                if ((v3 /* !! */  = (cfr_temp_1 = ka.uc - ka.lkeh("lkmo", lker(int ), (int)55)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v3 /* !! */  == ka.lkeh("lkmp", lkee(int ), (int)156)) {
                    var1_3 = ka.a;
                    if (var3_1) {
                        throw null;
                    }
                    break;
                }
                v3 /* !! */  = (long)ka.lkeh("lkmq", lkee(int ), (int)157);
            }
            if (!var1_3 && !var1_3) ** GOTO lbl41
            if (var2_2 /* !! */  == 0) return (int)ka.lkeh("lkmr", lkee(int ), (int)158);
            cfr_temp_0 = -2147483648;
lbl37:
            // 2 sources

            block18: while (true) {
                switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                    default: {
                        return (int)ka.lkeh("lkmr", lkee(int ), (int)158);
                    }
lbl41:
                    // 1 sources

                    while (true) {
                        if ((v4 /* !! */  = (cfr_temp_2 = ka.uc - ka.lkeh("lkms", lker(int ), (int)56)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                            continue;
                        }
                        if (v4 /* !! */  == ka.lkeh("lkmt", lkee(int ), (int)159)) {
                            return this.key;
                        }
                        v4 /* !! */  = (long)ka.lkeh("lkmu", lkee(int ), (int)160);
                    }
                    case 0: {
                        var2_2 /* !! */  = (int)ka.lkeh("lkmv", lkee(int ), (int)161);
                        cfr_temp_0 = 2;
                        if (!var3_1) continue block18;
                        throw null;
                    }
                    case 1: {
                        ** GOTO lbl59
                    }
                    case 3: {
                        var2_2 /* !! */  = (int)ka.lkeh("lkmy", lkee(int ), (int)164);
                        if (var3_1) {
                            throw null;
                        }
lbl59:
                        // 3 sources

                        var2_2 /* !! */  = (int)ka.lkeh("lkmw", lkee(int ), (int)162);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 2: 
                }
                break;
            }
            break block28;
            ** while (true)
        }
        do {
            var2_2 /* !! */  = (int)ka.lkeh("lkmx", lkee(int ), (int)163);
        } while (!var3_1);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public ka setType(int var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ka.uc - ka.lkeh("lkox", lker(int ), (int)84)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ka.lkeh("lkoy", lkee(int ), (int)188)) break;
            v0 /* !! */  = (long)ka.lkeh("lkoz", lkee(int ), (int)189);
        }
        var4_2 = ka.c;
        v1 /* !! */  = ka.uc;
        if (true) ** GOTO lbl12
        block17: while (true) {
            v1 /* !! */  = (long)(v2 - ka.lkeh("lkpa", lker(int ), (int)85));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1558243606: {
                    v2 = ka.lkeh("lkpb", lker(int ), (int)86);
                    continue block17;
                }
                case -154977187: {
                    break block17;
                }
                case 629281684: {
                    v2 = ka.lkeh("lkpc", lker(int ), (int)87);
                    continue block17;
                }
            }
            break;
        }
        var3_3 /* !! */  = ka.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = ka.uc - ka.lkeh("lkpd", lker(int ), (int)88)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == ka.lkeh("lkpe", lkee(int ), (int)190)) break;
            v3 /* !! */  = (long)ka.lkeh("lkpf", lkee(int ), (int)191);
        }
        var2_4 = ka.a;
        if (var4_2) {
            throw null;
lbl31:
            // 2 sources

            return null;
        }
        if (var2_4 || var2_4) ** GOTO lbl31
        v4 /* !! */  = ka.uc;
        if (true) ** GOTO lbl38
        block20: while (true) {
            v4 /* !! */  = (long)(ka.lkeh("lkph", lker(int ), (int)90) - ka.lkeh("lkpg", lker(int ), (int)89));
lbl38:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -154977187: {
                    break block20;
                }
                case 848953463: {
                    continue block20;
                }
            }
            break;
        }
        this.type = var1_1;
        if (!var2_4) ** break;
        ** while (true)
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                return this;
            }
            case 0: {
                do {
                    var3_3 /* !! */  = (int)ka.lkeh("lkpi", lkee(int ), (int)192);
                } while (!var4_2);
                throw null;
            }
            case 1: {
                var3_3 /* !! */  = (int)ka.lkeh("lkpj", lkee(int ), (int)193);
                if (var4_2) {
                    throw null;
                }
            }
lbl59:
            // 4 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var3_3 /* !! */  = (int)ka.lkeh("lkpk", lkee(int ), (int)194);
                    if (!var4_2) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 3: {
                var3_3 /* !! */  = (int)ka.lkeh("lkpl", lkee(int ), (int)195);
                if (!var4_2) ** GOTO lbl59
                throw null;
            }
            case 4: 
        }
        var3_3 /* !! */  = (int)ka.lkeh("lkpm", lkee(int ), (int)196);
        ** while (!var4_2)
lbl71:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ long lker(int n2) {
        return lkes[n2] ^ lket[n2];
    }

    private static /* synthetic */ void lkqj() {
        ka.lkeg[100] = -159654434;
        ka.lkeg[101] = -2147189453;
        ka.lkeg[102] = -1000250283;
        ka.lkeg[103] = 1915724012;
        ka.lkeg[104] = -320774213;
        ka.lkeg[105] = 1809444542;
        ka.lkeg[106] = 439035461;
        ka.lkeg[107] = 1178672040;
        ka.lkeg[108] = -1906946670;
        ka.lkeg[109] = 178113239;
        ka.lkeg[110] = 474097169;
        ka.lkeg[111] = 122135965;
        ka.lkeg[112] = -306366998;
        ka.lkeg[113] = -525419259;
        ka.lkeg[114] = -1576029329;
        ka.lkeg[115] = 303065200;
        ka.lkeg[116] = -2080615831;
        ka.lkeg[117] = -866859286;
        ka.lkeg[118] = -765109057;
        ka.lkeg[119] = -2142116598;
        ka.lkeg[120] = -1071229374;
        ka.lkeg[121] = -74621018;
        ka.lkeg[122] = -674618203;
        ka.lkeg[123] = 136231836;
        ka.lkeg[124] = 649932779;
        ka.lkeg[125] = -546331267;
        ka.lkeg[126] = -2115175209;
        ka.lkeg[127] = -1485934621;
        ka.lkeg[128] = 569553427;
        ka.lkeg[129] = 1215268278;
        ka.lkeg[130] = 574855735;
        ka.lkeg[131] = 548908461;
        ka.lkeg[132] = 1251366867;
        ka.lkeg[133] = 164691654;
        ka.lkeg[134] = -491129309;
        ka.lkeg[135] = -1555312229;
        ka.lkeg[136] = 1621006371;
        ka.lkeg[137] = -1274355538;
        ka.lkeg[138] = -288878324;
        ka.lkeg[139] = -1898202585;
        ka.lkeg[140] = 103775375;
        ka.lkeg[141] = 669691808;
        ka.lkeg[142] = 2122893893;
        ka.lkeg[143] = -2121653016;
        ka.lkeg[144] = -1312431843;
        ka.lkeg[145] = -1150280684;
        ka.lkeg[146] = -735864407;
        ka.lkeg[147] = 79217269;
        ka.lkeg[148] = 636672829;
        ka.lkeg[149] = 1911629056;
        ka.lkeg[150] = 372891416;
        ka.lkeg[151] = 652320821;
        ka.lkeg[152] = 2130451406;
        ka.lkeg[153] = 942515959;
        ka.lkeg[154] = -204599033;
        ka.lkeg[155] = -985584991;
        ka.lkeg[156] = 1310330158;
        ka.lkeg[157] = -2139228203;
        ka.lkeg[158] = -1961770059;
        ka.lkeg[159] = -1792532790;
        ka.lkeg[160] = 2050002211;
        ka.lkeg[161] = -703137268;
        ka.lkeg[162] = -969450043;
        ka.lkeg[163] = 1583043467;
        ka.lkeg[164] = 1221031433;
        ka.lkeg[165] = 375162121;
        ka.lkeg[166] = -333868;
        ka.lkeg[167] = -1303781047;
        ka.lkeg[168] = 1548114193;
        ka.lkeg[169] = 911080779;
        ka.lkeg[170] = 936995088;
        ka.lkeg[171] = 438068617;
        ka.lkeg[172] = 1560155733;
        ka.lkeg[173] = -1678629058;
        ka.lkeg[174] = -28541424;
        ka.lkeg[175] = 995892623;
        ka.lkeg[176] = -936109311;
        ka.lkeg[177] = -1275092985;
        ka.lkeg[178] = -658650689;
        ka.lkeg[179] = 1863067335;
        ka.lkeg[180] = 305961343;
        ka.lkeg[181] = -591480453;
        ka.lkeg[182] = -138606800;
        ka.lkeg[183] = -536751128;
        ka.lkeg[184] = 665296485;
        ka.lkeg[185] = -325979414;
        ka.lkeg[186] = 1880516309;
        ka.lkeg[187] = 396313725;
        ka.lkeg[188] = 1029923194;
        ka.lkeg[189] = 1487965704;
        ka.lkeg[190] = 1065063688;
        ka.lkeg[191] = 1838363591;
        ka.lkeg[192] = 1030757139;
        ka.lkeg[193] = -562002275;
        ka.lkeg[194] = -1555705184;
        ka.lkeg[195] = -697513167;
        ka.lkeg[196] = 565551208;
        ka.lkeg[197] = -108598059;
        ka.lkeg[198] = -1747686759;
        ka.lkeg[199] = 1641018078;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public ka(String var1_1, String var2_2) {
        var4_3 /* !! */  = ka.b;
        super(var1_1, var2_2);
        this.key = (int)ka.lkeh("lkei", lkee(int ), (int)0);
        this.type = (int)ka.lkeh("lkej", lkee(int ), (int)1);
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.mouse = ka.lkeh("lkek", lkee(int ), (int)2);
                return;
            }
lbl10:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_3 /* !! */  = (int)ka.lkeh("lkel", lkee(int ), (int)3);
                    ** GOTO lbl20
                    break;
                }
            }
            case 1: {
                var4_3 /* !! */  = (int)ka.lkeh("lkem", lkee(int ), (int)4);
                break;
            }
            case 2: {
                var4_3 /* !! */  = (int)ka.lkeh("lken", lkee(int ), (int)5);
                ** GOTO lbl23
            }
lbl20:
            // 2 sources

            case 3: {
                var4_3 /* !! */  = (int)ka.lkeh("lkeo", lkee(int ), (int)6);
                ** GOTO lbl10
            }
lbl23:
            // 2 sources

            case 4: {
                while (true) {
                    var4_3 /* !! */  = (int)ka.lkeh("lkep", lkee(int ), (int)7);
                }
            }
            case 5: 
        }
        var4_3 /* !! */  = (int)ka.lkeh("lkeq", lkee(int ), (int)8);
        ** while (true)
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public ka setKey(int var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ka.uc - ka.lkeh("lkoi", lker(int ), (int)76)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ka.lkeh("lkoj", lkee(int ), (int)181)) break;
            v0 /* !! */  = (long)ka.lkeh("lkok", lkee(int ), (int)182);
        }
        var4_2 = ka.c;
        v1 /* !! */  = ka.uc;
        if (true) ** GOTO lbl12
        block21: while (true) {
            v1 /* !! */  = (long)(ka.lkeh("lkom", lker(int ), (int)78) - ka.lkeh("lkol", lker(int ), (int)77));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -154977187: {
                    break block21;
                }
                case 1377437592: {
                    continue block21;
                }
            }
            break;
        }
        var3_3 /* !! */  = ka.b;
        v2 /* !! */  = ka.uc;
        if (true) ** GOTO lbl22
        block22: while (true) {
            v2 /* !! */  = (long)(v3 - ka.lkeh("lkon", lker(int ), (int)79));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -239247181: {
                    v3 = ka.lkeh("lkoo", lker(int ), (int)80);
                    continue block22;
                }
                case -165799486: {
                    v3 = ka.lkeh("lkop", lker(int ), (int)81);
                    continue block22;
                }
                case -154977187: {
                    break block22;
                }
            }
            break;
        }
        var2_4 = ka.a;
        if (var4_2) {
            throw null;
lbl34:
            // 3 sources

            return null;
        }
        if (var2_4) ** GOTO lbl34
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** GOTO lbl34
                v4 /* !! */  = ka.uc;
                if (true) ** GOTO lbl45
                block24: while (true) {
                    v4 /* !! */  = (long)(ka.lkeh("lkor", lker(int ), (int)83) - ka.lkeh("lkoq", lker(int ), (int)82));
lbl45:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -154977187: {
                            break block24;
                        }
                        case 1663449826: {
                            continue block24;
                        }
                    }
                    break;
                }
                this.key = var1_1;
                if (var2_4) ** continue;
                return this;
            }
            case 0: {
                do {
                    var3_3 /* !! */  = (int)ka.lkeh("lkos", lkee(int ), (int)183);
                } while (!var4_2);
                throw null;
            }
lbl58:
            // 2 sources

            case 1: {
                var3_3 /* !! */  = (int)ka.lkeh("lkot", lkee(int ), (int)184);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl68
            }
            case 2: {
                do {
                    var3_3 /* !! */  = (int)ka.lkeh("lkou", lkee(int ), (int)185);
                } while (!var4_2);
                throw null;
            }
lbl68:
            // 2 sources

            case 3: {
                var3_3 /* !! */  = (int)ka.lkeh("lkov", lkee(int ), (int)186);
                if (!var4_2) ** GOTO lbl58
                throw null;
            }
            case 4: 
        }
        do {
            var3_3 /* !! */  = (int)ka.lkeh("lkow", lkee(int ), (int)187);
        } while (!var4_2);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public ka setMouse(boolean var1_1) {
        block36: {
            while (true) {
                block35: {
                    if ((v0 /* !! */  = (cfr_temp_0 = ka.uc - ka.lkeh("lkpn", lker(int ), (int)91)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v0 /* !! */  != ka.lkeh("lkpo", lkee(int ), (int)197)) break block35;
                    var4_2 = ka.c;
                    v1 /* !! */  = ka.uc;
                    if (true) ** GOTO lbl13
                }
                v0 /* !! */  = (long)ka.lkeh("lkpp", lkee(int ), (int)198);
            }
            block24: while (true) {
                v1 /* !! */  = (long)(v2 - ka.lkeh("lkpq", lker(int ), (int)92));
lbl13:
                // 2 sources

                switch ((int)v1 /* !! */ ) {
                    case -1955122156: {
                        v2 = ka.lkeh("lkpr", lker(int ), (int)93);
                        continue block24;
                    }
                    case -154977187: {
                        break block24;
                    }
                    case 663086631: {
                        v2 = ka.lkeh("lkps", lker(int ), (int)94);
                        continue block24;
                    }
                }
                break;
            }
            var3_3 /* !! */  = ka.b;
            v3 /* !! */  = ka.uc;
            if (true) ** GOTO lbl27
            block25: while (true) {
                v3 /* !! */  = (long)(v4 - ka.lkeh("lkpt", lker(int ), (int)95));
lbl27:
                // 2 sources

                switch ((int)v3 /* !! */ ) {
                    case -1419313316: {
                        v4 = ka.lkeh("lkpu", lker(int ), (int)96);
                        continue block25;
                    }
                    case -154977187: {
                        break block25;
                    }
                    case 1083087143: {
                        v4 = ka.lkeh("lkpv", lker(int ), (int)97);
                        continue block25;
                    }
                }
                break;
            }
            var2_4 = ka.a;
            if (var4_2) {
                throw null;
            }
            if (var2_4 || var2_4) break block36;
            v5 /* !! */  = ka.uc;
            if (true) ** GOTO lbl73
        }
lbl43:
        // 2 sources

        while (true) {
            if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
            switch (var3_3 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return null;
                }
                case 0: {
                    ** GOTO lbl59
                }
                case 2: {
                    do {
                        var3_3 /* !! */  = (int)ka.lkeh("lkqc", lkee(int ), (int)201);
                    } while (!var4_2);
                    throw null;
                }
                case 4: {
                    var3_3 /* !! */  = (int)ka.lkeh("lkqe", lkee(int ), (int)203);
                    if (var4_2) {
                        throw null;
                    }
lbl59:
                    // 3 sources

                    var3_3 /* !! */  = (int)ka.lkeh("lkqa", lkee(int ), (int)199);
                    if (var4_2) {
                        throw null;
                    }
                }
                case 1: {
                    var3_3 /* !! */  = (int)ka.lkeh("lkqb", lkee(int ), (int)200);
                    if (var4_2) {
                        throw null;
                    }
                }
                case 3: 
            }
            do {
                var3_3 /* !! */  = (int)ka.lkeh("lkqd", lkee(int ), (int)202);
            } while (!var4_2);
            throw null;
        }
        block29: while (true) {
            v5 /* !! */  = (long)(v6 - ka.lkeh("lkpw", lker(int ), (int)98));
lbl73:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -154977187: {
                    break block29;
                }
                case 1128488529: {
                    v6 = ka.lkeh("lkpx", lker(int ), (int)99);
                    continue block29;
                }
                case 1646983931: {
                    v6 = ka.lkeh("lkpy", lker(int ), (int)100);
                    continue block29;
                }
                case 1785128710: {
                    v6 = ka.lkeh("lkpz", lker(int ), (int)101);
                    continue block29;
                }
            }
            break;
        }
        this.mouse = var1_1;
        ** while (var2_4)
lbl87:
        // 1 sources

        return this;
    }

    /*
     * Exception decompiling
     */
    public static String formatKey(int var0, boolean var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [4[CASE]], but top level block is 8[SWITCH]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private static /* synthetic */ void lkqn() {
        ka.lket[0] = 4305590219846081611L;
        ka.lket[1] = -509244737109909315L;
        ka.lket[2] = 4306288790881047971L;
        ka.lket[3] = -643364271012293424L;
        ka.lket[4] = 5704760606684950518L;
        ka.lket[5] = 3019800786945415755L;
        ka.lket[6] = 1011861965130105598L;
        ka.lket[7] = -8977747872812940275L;
        ka.lket[8] = 1764280478864725101L;
        ka.lket[9] = 9080398845819715988L;
        ka.lket[10] = 1265468934348435919L;
        ka.lket[11] = -5431686586938963791L;
        ka.lket[12] = -600891258308791654L;
        ka.lket[13] = 459431802256423760L;
        ka.lket[14] = -7300998324551799985L;
        ka.lket[15] = 6649991497872686298L;
        ka.lket[16] = 3839902934214883805L;
        ka.lket[17] = -6593634272920699339L;
        ka.lket[18] = -8152578544545409728L;
        ka.lket[19] = 6600777845519951874L;
        ka.lket[20] = -940114925174037988L;
        ka.lket[21] = 149280829183247684L;
        ka.lket[22] = -2440395197939462482L;
        ka.lket[23] = 4867828772485577154L;
        ka.lket[24] = -1627962418446408950L;
        ka.lket[25] = 2897457261461388133L;
        ka.lket[26] = -5643769910962033175L;
        ka.lket[27] = 1585761065972859752L;
        ka.lket[28] = -3269949760332549871L;
        ka.lket[29] = -385099056771922437L;
        ka.lket[30] = -4449529340657775320L;
        ka.lket[31] = -4101640938628313113L;
        ka.lket[32] = 3969443545398598374L;
        ka.lket[33] = 3102574880781965898L;
        ka.lket[34] = 7519032943473844229L;
        ka.lket[35] = 6116835337392740301L;
        ka.lket[36] = 4949384112729554808L;
        ka.lket[37] = -3688905664563580710L;
        ka.lket[38] = -5633831722900930897L;
        ka.lket[39] = 3986784434533018492L;
        ka.lket[40] = -4065134665230067737L;
        ka.lket[41] = 4774163654782965081L;
        ka.lket[42] = -8353210138387150104L;
        ka.lket[43] = 3451849860704210152L;
        ka.lket[44] = -1416817761035990519L;
        ka.lket[45] = 836107326761744455L;
        ka.lket[46] = -2156309071353411034L;
        ka.lket[47] = -5220081026195408254L;
        ka.lket[48] = -6690967235780995676L;
        ka.lket[49] = -7156481762816965620L;
        ka.lket[50] = 1212681214483079205L;
        ka.lket[51] = 338056970524483111L;
        ka.lket[52] = -2069153825412396397L;
        ka.lket[53] = -3669433488026084654L;
        ka.lket[54] = -1367443963035434486L;
        ka.lket[55] = 6251513034090273545L;
        ka.lket[56] = -3342419763973980784L;
        ka.lket[57] = -5588739351478793245L;
        ka.lket[58] = -1610100056900957763L;
        ka.lket[59] = 207862819627135862L;
        ka.lket[60] = 3409869686344169502L;
        ka.lket[61] = 1243649303850437463L;
        ka.lket[62] = 4647881831403506980L;
        ka.lket[63] = -4032077492744148968L;
        ka.lket[64] = -2740362013781053200L;
        ka.lket[65] = -7122643854861498883L;
        ka.lket[66] = -6582424015940820290L;
        ka.lket[67] = 8122748335648573037L;
        ka.lket[68] = 5768218956890124191L;
        ka.lket[69] = -6142036671973819707L;
        ka.lket[70] = -4761351162183875366L;
        ka.lket[71] = -6930350538300989258L;
        ka.lket[72] = 7733424829185604031L;
        ka.lket[73] = -2983436229287629050L;
        ka.lket[74] = -37768045549363921L;
        ka.lket[75] = 2590465726070092490L;
        ka.lket[76] = 6062980929035119883L;
        ka.lket[77] = 7088409235405011250L;
        ka.lket[78] = -4262934389273772676L;
        ka.lket[79] = -6785233159722887414L;
        ka.lket[80] = 7755851584594548652L;
        ka.lket[81] = 1863859511202894421L;
        ka.lket[82] = 970501486521725960L;
        ka.lket[83] = 5078751890162570546L;
        ka.lket[84] = 730585904790045349L;
        ka.lket[85] = 5746690521519423391L;
        ka.lket[86] = -645541324938364011L;
        ka.lket[87] = 1100501874736982844L;
        ka.lket[88] = 5425571254519151182L;
        ka.lket[89] = -3646592789661731553L;
        ka.lket[90] = -6318589966905855306L;
        ka.lket[91] = 1650680464894295348L;
        ka.lket[92] = -3326421532319306029L;
        ka.lket[93] = 4326268967811713219L;
        ka.lket[94] = -7169468604412902474L;
        ka.lket[95] = -3849884303403388501L;
        ka.lket[96] = -173215567138675669L;
        ka.lket[97] = 2784386379511303921L;
        ka.lket[98] = -2511299529729776399L;
        ka.lket[99] = -4689273182380865660L;
    }

    private static /* synthetic */ void lkqg() {
        ka.lkef[100] = -159654434;
        ka.lkef[101] = -2147189456;
        ka.lkef[102] = -1000250282;
        ka.lkef[103] = -1915724013;
        ka.lkef[104] = 320774213;
        ka.lkef[105] = -1809444541;
        ka.lkef[106] = 439035460;
        ka.lkef[107] = 1178672052;
        ka.lkef[108] = -1906946668;
        ka.lkef[109] = 178113223;
        ka.lkef[110] = 474097201;
        ka.lkef[111] = 122135943;
        ka.lkef[112] = -306366996;
        ka.lkef[113] = -525419233;
        ka.lkef[114] = -1576029364;
        ka.lkef[115] = 303065196;
        ka.lkef[116] = -2080615835;
        ka.lkef[117] = -866859267;
        ka.lkef[118] = -765109076;
        ka.lkef[119] = -2142116604;
        ka.lkef[120] = -1071229342;
        ka.lkef[121] = -74621008;
        ka.lkef[122] = -674618183;
        ka.lkef[123] = 136231820;
        ka.lkef[124] = 649932792;
        ka.lkef[125] = -546331273;
        ka.lkef[126] = -2115175178;
        ka.lkef[127] = -1485934649;
        ka.lkef[128] = 569553437;
        ka.lkef[129] = 1215268277;
        ka.lkef[130] = 574855734;
        ka.lkef[131] = 548908463;
        ka.lkef[132] = 1251366867;
        ka.lkef[133] = 164691684;
        ka.lkef[134] = -491129305;
        ka.lkef[135] = -1555312229;
        ka.lkef[136] = 1621006371;
        ka.lkef[137] = -1274355526;
        ka.lkef[138] = -288878309;
        ka.lkef[139] = -1898202576;
        ka.lkef[140] = 103775380;
        ka.lkef[141] = 669691819;
        ka.lkef[142] = 2122893909;
        ka.lkef[143] = -2121652997;
        ka.lkef[144] = 1312431842;
        ka.lkef[145] = -993197398;
        ka.lkef[146] = 735864406;
        ka.lkef[147] = -946931774;
        ka.lkef[148] = -636672830;
        ka.lkef[149] = -33743187;
        ka.lkef[150] = 372891417;
        ka.lkef[151] = 652320816;
        ka.lkef[152] = 2130451403;
        ka.lkef[153] = 942515958;
        ka.lkef[154] = -204599036;
        ka.lkef[155] = -985584989;
        ka.lkef[156] = -1310330159;
        ka.lkef[157] = -815835852;
        ka.lkef[158] = -2052211475;
        ka.lkef[159] = 1792532789;
        ka.lkef[160] = -488444769;
        ka.lkef[161] = -703137268;
        ka.lkef[162] = -969450044;
        ka.lkef[163] = 1583043467;
        ka.lkef[164] = 1221031434;
        ka.lkef[165] = -375162122;
        ka.lkef[166] = -324815258;
        ka.lkef[167] = 1303781046;
        ka.lkef[168] = 1743362037;
        ka.lkef[169] = 2104371621;
        ka.lkef[170] = 936995090;
        ka.lkef[171] = 438068617;
        ka.lkef[172] = 1560155733;
        ka.lkef[173] = -1678629060;
        ka.lkef[174] = 28541423;
        ka.lkef[175] = -1876892974;
        ka.lkef[176] = -936109311;
        ka.lkef[177] = -1275092986;
        ka.lkef[178] = -658650691;
        ka.lkef[179] = 1863067335;
        ka.lkef[180] = 305961341;
        ka.lkef[181] = 591480452;
        ka.lkef[182] = 1697466116;
        ka.lkef[183] = -536751124;
        ka.lkef[184] = 665296481;
        ka.lkef[185] = -325979415;
        ka.lkef[186] = 1880516308;
        ka.lkef[187] = 396313721;
        ka.lkef[188] = -1029923195;
        ka.lkef[189] = -168412153;
        ka.lkef[190] = -1065063689;
        ka.lkef[191] = 328462868;
        ka.lkef[192] = 1030757143;
        ka.lkef[193] = -562002273;
        ka.lkef[194] = -1555705182;
        ka.lkef[195] = -697513166;
        ka.lkef[196] = 565551208;
        ka.lkef[197] = 108598058;
        ka.lkef[198] = -1828495675;
        ka.lkef[199] = 1641018076;
    }

    private static /* synthetic */ void lkqh() {
        ka.lkef[200] = -2131515587;
        ka.lkef[201] = 2129970856;
        ka.lkef[202] = 291222101;
        ka.lkef[203] = -1995505099;
    }

    private static /* synthetic */ void lkql() {
        ka.lkes[0] = -335436285606962339L;
        ka.lkes[1] = 7818672666064606033L;
        ka.lkes[2] = -6313985814283833973L;
        ka.lkes[3] = 4196714524728906767L;
        ka.lkes[4] = -7938433953372585035L;
        ka.lkes[5] = 4028857296570868824L;
        ka.lkes[6] = 6016951204370289448L;
        ka.lkes[7] = -4181423242443653960L;
        ka.lkes[8] = -246853862858179556L;
        ka.lkes[9] = 4055435353899631916L;
        ka.lkes[10] = -2750733026928089983L;
        ka.lkes[11] = -3562704684027661553L;
        ka.lkes[12] = 7693227728483511740L;
        ka.lkes[13] = -4509772859559331153L;
        ka.lkes[14] = -476469160872201546L;
        ka.lkes[15] = 1736442258870592912L;
        ka.lkes[16] = 2899263542434484527L;
        ka.lkes[17] = -5375314106756935168L;
        ka.lkes[18] = -8883542644648758666L;
        ka.lkes[19] = -1759843835280445115L;
        ka.lkes[20] = 8872366914162032781L;
        ka.lkes[21] = 5976473982997459173L;
        ka.lkes[22] = 3709315342726134065L;
        ka.lkes[23] = -8548229757763895077L;
        ka.lkes[24] = 3966829584101622264L;
        ka.lkes[25] = -8441991184667305049L;
        ka.lkes[26] = 991795193338434304L;
        ka.lkes[27] = -5058132094702751627L;
        ka.lkes[28] = 6616954236487782522L;
        ka.lkes[29] = -8921979376829649758L;
        ka.lkes[30] = 4758943629912472822L;
        ka.lkes[31] = 5568942825270197480L;
        ka.lkes[32] = 8568927909071088756L;
        ka.lkes[33] = 2424153205745604212L;
        ka.lkes[34] = -5485316379140751504L;
        ka.lkes[35] = 4755161164228436653L;
        ka.lkes[36] = 2840558214547676236L;
        ka.lkes[37] = -3375382753546366386L;
        ka.lkes[38] = 4581348766530013984L;
        ka.lkes[39] = -8198682347366005296L;
        ka.lkes[40] = 3636164490649042277L;
        ka.lkes[41] = -1975004435056391740L;
        ka.lkes[42] = -8013842372760017884L;
        ka.lkes[43] = -6652068467770756049L;
        ka.lkes[44] = -8680768306205779570L;
        ka.lkes[45] = -7265372261300774123L;
        ka.lkes[46] = -6041473261019316530L;
        ka.lkes[47] = 6602526591787721181L;
        ka.lkes[48] = 1836452609685220219L;
        ka.lkes[49] = -1966304296083324452L;
        ka.lkes[50] = 4775624001593070756L;
        ka.lkes[51] = -8356872674116549636L;
        ka.lkes[52] = -1362784713345087448L;
        ka.lkes[53] = -1101304717489716082L;
        ka.lkes[54] = -2255282352978461522L;
        ka.lkes[55] = 674515067397286179L;
        ka.lkes[56] = 4947670836330288600L;
        ka.lkes[57] = 4298128818624828161L;
        ka.lkes[58] = 7532332634363584711L;
        ka.lkes[59] = -1294987718190774580L;
        ka.lkes[60] = -7960273052643813868L;
        ka.lkes[61] = 5478845558555053511L;
        ka.lkes[62] = -1948500175739126314L;
        ka.lkes[63] = -4996611689303468610L;
        ka.lkes[64] = 1526544105270284678L;
        ka.lkes[65] = -7783786173638820200L;
        ka.lkes[66] = 4324692579643161049L;
        ka.lkes[67] = -94984449077307496L;
        ka.lkes[68] = -8702430015436349056L;
        ka.lkes[69] = -8872601888533081065L;
        ka.lkes[70] = -6945104886680293647L;
        ka.lkes[71] = 2080051529039622130L;
        ka.lkes[72] = -3666984458171092149L;
        ka.lkes[73] = -4321047924536782754L;
        ka.lkes[74] = 1481893491837777653L;
        ka.lkes[75] = -1506749167219366038L;
        ka.lkes[76] = 2306237224867535827L;
        ka.lkes[77] = -681501035836117380L;
        ka.lkes[78] = 3320340132435758331L;
        ka.lkes[79] = -6028578039035857595L;
        ka.lkes[80] = 3503439938601345311L;
        ka.lkes[81] = 6011372571940010485L;
        ka.lkes[82] = -1051024255538179103L;
        ka.lkes[83] = -696611916282223933L;
        ka.lkes[84] = 4628479073179195419L;
        ka.lkes[85] = 8489723406723898990L;
        ka.lkes[86] = 962327335720403622L;
        ka.lkes[87] = 6118583940033575195L;
        ka.lkes[88] = 4585005457504714189L;
        ka.lkes[89] = -3481591934918624638L;
        ka.lkes[90] = 1973850440001694240L;
        ka.lkes[91] = 7177938856526661725L;
        ka.lkes[92] = 4195741900022744892L;
        ka.lkes[93] = 1489453667019450907L;
        ka.lkes[94] = -5886295481304713668L;
        ka.lkes[95] = -5865835965522292778L;
        ka.lkes[96] = 8782254517822838620L;
        ka.lkes[97] = -5117585175645547817L;
        ka.lkes[98] = -2887665857678581587L;
        ka.lkes[99] = -255305672565733185L;
    }

    public static /* synthetic */ CallSite lkeh(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void setKeyBind(int var1_1, boolean var2_2) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ka.uc - ka.lkeh("lkeu", lker(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ka.lkeh("lkev", lkee(int ), (int)9)) break;
            v0 /* !! */  = (long)ka.lkeh("lkew", lkee(int ), (int)10);
        }
        var5_3 = ka.c;
        v1 /* !! */  = ka.uc;
        if (true) ** GOTO lbl11
        block21: while (true) {
            v1 /* !! */  = (long)(ka.lkeh("lkey", lker(int ), (int)2) - ka.lkeh("lkex", lker(int ), (int)1));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1337088941: {
                    continue block21;
                }
                case -154977187: {
                    break block21;
                }
            }
            break;
        }
        var4_4 /* !! */  = ka.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = ka.uc - ka.lkeh("lkez", lker(int ), (int)3)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == ka.lkeh("lkfa", lkee(int ), (int)11)) break;
            v2 /* !! */  = (long)ka.lkeh("lkfb", lkee(int ), (int)12);
        }
        var3_5 = ka.a;
        if (var5_3) {
            throw null;
lbl25:
            // 4 sources

            return;
        }
        if (var3_5) ** GOTO lbl25
        if (var4_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_5) ** GOTO lbl25
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = ka.uc - ka.lkeh("lkfc", lker(int ), (int)4)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == ka.lkeh("lkfd", lkee(int ), (int)13)) break;
                    v3 /* !! */  = (long)ka.lkeh("lkfe", lkee(int ), (int)14);
                }
                this.key = var1_1;
                if (var3_5 || var3_5) ** GOTO lbl25
                v4 /* !! */  = ka.uc;
                if (true) ** GOTO lbl43
                block25: while (true) {
                    v4 /* !! */  = (long)(v5 - ka.lkeh("lkff", lker(int ), (int)5));
lbl43:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1658579863: {
                            v5 = ka.lkeh("lkfg", lker(int ), (int)6);
                            continue block25;
                        }
                        case -154977187: {
                            break block25;
                        }
                        case 1343674710: {
                            v5 = ka.lkeh("lkfh", lker(int ), (int)7);
                            continue block25;
                        }
                        case 1829950474: {
                            v5 = ka.lkeh("lkfi", lker(int ), (int)8);
                            continue block25;
                        }
                    }
                    break;
                }
                this.mouse = var2_2;
                if (!var3_5 && !var3_5) ** break;
                ** continue;
                return;
            }
            case 0: {
                do {
                    var4_4 /* !! */  = (int)ka.lkeh("lkfj", lkee(int ), (int)15);
                } while (!var5_3);
                throw null;
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_4 /* !! */  = (int)ka.lkeh("lkfk", lkee(int ), (int)16);
                    if (var5_3) {
                        throw null;
                    }
                    ** GOTO lbl74
                    break;
                }
            }
lbl70:
            // 2 sources

            case 2: {
                var4_4 /* !! */  = (int)ka.lkeh("lkfl", lkee(int ), (int)17);
                if (!var5_3) break;
                throw null;
            }
lbl74:
            // 2 sources

            case 3: {
                do {
                    var4_4 /* !! */  = (int)ka.lkeh("lkfm", lkee(int ), (int)18);
                } while (!var5_3);
                throw null;
            }
            case 4: {
                var4_4 /* !! */  = (int)ka.lkeh("lkfn", lkee(int ), (int)19);
                if (!var5_3) break;
                throw null;
            }
lbl83:
            // 2 sources

            case 5: {
                var4_4 /* !! */  = (int)ka.lkeh("lkfo", lkee(int ), (int)20);
                if (!var5_3) ** GOTO lbl70
                throw null;
            }
            case 6: {
                var4_4 /* !! */  = (int)ka.lkeh("lkfp", lkee(int ), (int)21);
                if (!var5_3) ** GOTO lbl83
                throw null;
            }
            case 7: 
        }
        var4_4 /* !! */  = (int)ka.lkeh("lkfq", lkee(int ), (int)22);
        ** while (!var5_3)
lbl94:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static boolean isWheel(int var0) {
        block16: {
            block15: {
                block14: {
                    while (true) {
                        if ((v0 /* !! */  = (cfr_temp_0 = ka.uc - ka.lkeh("lkie", lker(int ), (int)20)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                            continue;
                        }
                        if (v0 /* !! */  == ka.lkeh("lkif", lkee(int ), (int)77)) break;
                        v0 /* !! */  = (long)ka.lkeh("lkig", lkee(int ), (int)78);
                    }
                    var3_1 = ka.c;
                    v1 /* !! */  = ka.uc;
                    if (true) ** GOTO lbl12
                    block7: while (true) {
                        v1 /* !! */  = (long)(v2 - ka.lkeh("lkih", lker(int ), (int)21));
lbl12:
                        // 2 sources

                        switch ((int)v1 /* !! */ ) {
                            case -1353460776: {
                                v2 = ka.lkeh("lkii", lker(int ), (int)22);
                                continue block7;
                            }
                            case -518216767: {
                                v2 = ka.lkeh("lkij", lker(int ), (int)23);
                                continue block7;
                            }
                            case -154977187: {
                                break block7;
                            }
                            case 1600629480: {
                                v2 = ka.lkeh("lkik", lker(int ), (int)24);
                                continue block7;
                            }
                        }
                        break;
                    }
                    var2_2 = ka.b;
                    while (true) {
                        if ((v3 /* !! */  = (cfr_temp_1 = ka.uc - ka.lkeh("lkil", lker(int ), (int)25)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                            continue;
                        }
                        if (v3 /* !! */  == ka.lkeh("lkim", lkee(int ), (int)79)) break;
                        v3 /* !! */  = (long)ka.lkeh("lkin", lkee(int ), (int)80);
                    }
                    var1_3 = ka.a;
                    if (var3_1) {
                        throw null;
lbl34:
                        // 5 sources

                        return (boolean)ka.lkeh("lkio", lkee(int ), (int)81);
                    }
                    if (var1_3 || var1_3) ** GOTO lbl34
                    if (var0 == ka.lkeh("lkip", lkee(int ), (int)82)) break block14;
                    if (var1_3) ** GOTO lbl34
                    if (var0 != ka.lkeh("lkiq", lkee(int ), (int)83)) break block15;
                    if (var1_3) ** GOTO lbl34
                }
                if (var1_3 || var1_3) ** GOTO lbl34
                v4 = ka.lkeh("lkir", lkee(int ), (int)84);
                if (var3_1) {
                    throw null;
                }
                break block16;
            }
            if (!var1_3 && !var1_3) ** break;
            ** while (true)
            v4 = ka.lkeh("lkis", lkee(int ), (int)85);
        }
        return (boolean)v4;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void reset() {
        v0 /* !! */  = ka.uc;
        if (true) ** GOTO lbl5
        block25: while (true) {
            v0 /* !! */  = (long)(ka.lkeh("lkfs", lker(int ), (int)10) - ka.lkeh("lkfr", lker(int ), (int)9));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -154977187: {
                    break block25;
                }
                case 1886288096: {
                    continue block25;
                }
            }
            break;
        }
        var3_1 = ka.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = ka.uc - ka.lkeh("lkft", lker(int ), (int)11)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == ka.lkeh("lkfu", lkee(int ), (int)23)) break;
            v1 /* !! */  = (long)ka.lkeh("lkfv", lkee(int ), (int)24);
        }
        var2_2 /* !! */  = ka.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = ka.uc - ka.lkeh("lkfw", lker(int ), (int)12)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == ka.lkeh("lkfx", lkee(int ), (int)25)) break;
            v2 /* !! */  = (long)ka.lkeh("lkfy", lkee(int ), (int)26);
        }
        var1_3 = ka.a;
        if (var3_1) {
            throw null;
lbl27:
            // 3 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl27
        v3 = ka.lkeh("lkfz", lkee(int ), (int)27);
        v4 /* !! */  = ka.uc;
        if (true) ** GOTO lbl35
        block29: while (true) {
            v4 /* !! */  = (long)(v5 - ka.lkeh("lkga", lker(int ), (int)13));
lbl35:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -154977187: {
                    break block29;
                }
                case 226977605: {
                    v5 = ka.lkeh("lkgb", lker(int ), (int)14);
                    continue block29;
                }
                case 746328763: {
                    v5 = ka.lkeh("lkgc", lker(int ), (int)15);
                    continue block29;
                }
            }
            break;
        }
        this.key = (int)v3;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** GOTO lbl27
                v6 = ka.lkeh("lkgd", lkee(int ), (int)28);
                v7 /* !! */  = ka.uc;
                if (true) ** GOTO lbl54
                block30: while (true) {
                    v7 /* !! */  = (long)(v8 - ka.lkeh("lkge", lker(int ), (int)16));
lbl54:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -764624689: {
                            v8 = ka.lkeh("lkgf", lker(int ), (int)17);
                            continue block30;
                        }
                        case -475262140: {
                            v8 = ka.lkeh("lkgg", lker(int ), (int)18);
                            continue block30;
                        }
                        case -154977187: {
                            break block30;
                        }
                        case 63600844: {
                            v8 = ka.lkeh("lkgh", lker(int ), (int)19);
                            continue block30;
                        }
                    }
                    break;
                }
                this.mouse = v6;
                if (var1_3 || var1_3) ** continue;
                return;
            }
lbl69:
            // 3 sources

            case 0: {
                do {
                    var2_2 /* !! */  = (int)ka.lkeh("lkgi", lkee(int ), (int)29);
                } while (!var3_1);
                throw null;
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ka.lkeh("lkgj", lkee(int ), (int)30);
                    if (!var3_1) ** GOTO lbl69
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)ka.lkeh("lkgk", lkee(int ), (int)31);
                if (!var3_1) break;
                throw null;
            }
            case 3: {
                var2_2 /* !! */  = (int)ka.lkeh("lkgl", lkee(int ), (int)32);
                if (!var3_1) ** GOTO lbl69
                throw null;
            }
            case 4: {
                do {
                    var2_2 /* !! */  = (int)ka.lkeh("lkgm", lkee(int ), (int)33);
                } while (!var3_1);
                throw null;
            }
            case 5: {
                do {
                    var2_2 /* !! */  = (int)ka.lkeh("lkgn", lkee(int ), (int)34);
                } while (!var3_1);
                throw null;
            }
            case 6: {
                do {
                    var2_2 /* !! */  = (int)ka.lkeh("lkgo", lkee(int ), (int)35);
                } while (!var3_1);
                throw null;
            }
            case 7: 
        }
        var2_2 /* !! */  = (int)ka.lkeh("lkgp", lkee(int ), (int)36);
        ** while (!var3_1)
lbl105:
        // 1 sources

        throw null;
    }
}

