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
import java.util.List;
import ruhack.phobia.pw$Message;

final class pw$MessageLayout
extends Record {
    private static int[] ixup;
    private static long[] ixvd;
    static final long qu = -2991364673137674331L;
    private final pw$Message message;
    public static final boolean c;
    public static final int b;
    private final float height;
    private static long[] ixvc;
    private final List<String> lines;
    private static int[] ixuo;
    public static final boolean a;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public float height() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = pw$MessageLayout.qu - pw$MessageLayout.ixuq("iyak", ixva(int ), (int)33)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == pw$MessageLayout.ixuq("iyal", ixun(int ), (int)50)) break;
            v0 /* !! */  = (long)pw$MessageLayout.ixuq("iyan", ixun(int ), (int)51);
        }
        var3_1 = pw$MessageLayout.c;
        v1 /* !! */  = pw$MessageLayout.qu;
        if (true) ** GOTO lbl12
        block13: while (true) {
            v1 /* !! */  = (long)(v2 - pw$MessageLayout.ixuq("iyao", ixva(int ), (int)34));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1074137179: {
                    break block13;
                }
                case -593233096: {
                    v2 = pw$MessageLayout.ixuq("iyaq", ixva(int ), (int)35);
                    continue block13;
                }
                case 624556575: {
                    v2 = pw$MessageLayout.ixuq("iyar", ixva(int ), (int)36);
                    continue block13;
                }
                case 1181543856: {
                    v2 = pw$MessageLayout.ixuq("iyas", ixva(int ), (int)37);
                    continue block13;
                }
            }
            break;
        }
        var2_2 /* !! */  = pw$MessageLayout.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_1 = pw$MessageLayout.qu - pw$MessageLayout.ixuq("iyau", ixva(int ), (int)38)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == pw$MessageLayout.ixuq("iyav", ixun(int ), (int)52)) break;
                    v3 /* !! */  = (long)pw$MessageLayout.ixuq("iyax", ixun(int ), (int)53);
                }
                var1_3 = pw$MessageLayout.a;
                if (var3_1) {
                    throw null;
                    return (float)pw$MessageLayout.ixuq("iyba", iyay(int ), (int)54);
                }
                if (var1_3 || var1_3) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = pw$MessageLayout.qu - pw$MessageLayout.ixuq("iybc", ixva(int ), (int)39)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == pw$MessageLayout.ixuq("iybe", ixun(int ), (int)55)) break;
                    v4 /* !! */  = (long)pw$MessageLayout.ixuq("iybf", ixun(int ), (int)56);
                }
                return this.height;
            }
lbl47:
            // 2 sources

            case 0: {
                do {
                    var2_2 /* !! */  = (int)pw$MessageLayout.ixuq("iybg", ixun(int ), (int)57);
                } while (!var3_1);
                throw null;
            }
            case 1: {
                var2_2 /* !! */  = (int)pw$MessageLayout.ixuq("iybh", ixun(int ), (int)58);
                if (!var3_1) break;
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)pw$MessageLayout.ixuq("iybj", ixun(int ), (int)59);
                if (!var3_1) ** GOTO lbl47
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)pw$MessageLayout.ixuq("iybl", ixun(int ), (int)60);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ void iybo() {
        pw$MessageLayout.ixuo[0] = 1597066564;
        pw$MessageLayout.ixuo[1] = 1995866693;
        pw$MessageLayout.ixuo[2] = 1323348601;
        pw$MessageLayout.ixuo[3] = -209545067;
        pw$MessageLayout.ixuo[4] = 327435167;
        pw$MessageLayout.ixuo[5] = 1951716440;
        pw$MessageLayout.ixuo[6] = -306881102;
        pw$MessageLayout.ixuo[7] = 1120359915;
        pw$MessageLayout.ixuo[8] = 1634730183;
        pw$MessageLayout.ixuo[9] = 253554711;
        pw$MessageLayout.ixuo[10] = -124468744;
        pw$MessageLayout.ixuo[11] = -1408963160;
        pw$MessageLayout.ixuo[12] = 1825241858;
        pw$MessageLayout.ixuo[13] = 582280208;
        pw$MessageLayout.ixuo[14] = -41524978;
        pw$MessageLayout.ixuo[15] = 1180330098;
        pw$MessageLayout.ixuo[16] = 1722486959;
        pw$MessageLayout.ixuo[17] = 149437982;
        pw$MessageLayout.ixuo[18] = 1632948554;
        pw$MessageLayout.ixuo[19] = 645219052;
        pw$MessageLayout.ixuo[20] = -476418627;
        pw$MessageLayout.ixuo[21] = -917603060;
        pw$MessageLayout.ixuo[22] = -1219453996;
        pw$MessageLayout.ixuo[23] = 1971637993;
        pw$MessageLayout.ixuo[24] = -8444597;
        pw$MessageLayout.ixuo[25] = 1231396738;
        pw$MessageLayout.ixuo[26] = 2028202366;
        pw$MessageLayout.ixuo[27] = 1069463201;
        pw$MessageLayout.ixuo[28] = -811776401;
        pw$MessageLayout.ixuo[29] = 174117019;
        pw$MessageLayout.ixuo[30] = -1869096936;
        pw$MessageLayout.ixuo[31] = 1293598976;
        pw$MessageLayout.ixuo[32] = -316214407;
        pw$MessageLayout.ixuo[33] = 1065124085;
        pw$MessageLayout.ixuo[34] = 1462441707;
        pw$MessageLayout.ixuo[35] = -610323016;
        pw$MessageLayout.ixuo[36] = 1141620521;
        pw$MessageLayout.ixuo[37] = 1761487036;
        pw$MessageLayout.ixuo[38] = -402291405;
        pw$MessageLayout.ixuo[39] = -1637902244;
        pw$MessageLayout.ixuo[40] = -2138029849;
        pw$MessageLayout.ixuo[41] = 1395207913;
        pw$MessageLayout.ixuo[42] = -512642534;
        pw$MessageLayout.ixuo[43] = -387301430;
        pw$MessageLayout.ixuo[44] = 1688363747;
        pw$MessageLayout.ixuo[45] = -1311536944;
        pw$MessageLayout.ixuo[46] = 619782168;
        pw$MessageLayout.ixuo[47] = 1728703882;
        pw$MessageLayout.ixuo[48] = -378143054;
        pw$MessageLayout.ixuo[49] = 870543088;
        pw$MessageLayout.ixuo[50] = -1030407497;
        pw$MessageLayout.ixuo[51] = 1020237330;
        pw$MessageLayout.ixuo[52] = 1755574216;
        pw$MessageLayout.ixuo[53] = 946583534;
        pw$MessageLayout.ixuo[54] = -1718916372;
        pw$MessageLayout.ixuo[55] = 736208325;
        pw$MessageLayout.ixuo[56] = 516533929;
        pw$MessageLayout.ixuo[57] = 560545007;
        pw$MessageLayout.ixuo[58] = 660511077;
        pw$MessageLayout.ixuo[59] = 598449848;
        pw$MessageLayout.ixuo[60] = -825570736;
    }

    private static /* synthetic */ void iybt() {
        pw$MessageLayout.ixvc[0] = 5802199621132693980L;
        pw$MessageLayout.ixvc[1] = 532325828378612162L;
        pw$MessageLayout.ixvc[2] = 8923986368773957917L;
        pw$MessageLayout.ixvc[3] = -7028304659234852203L;
        pw$MessageLayout.ixvc[4] = -1230339648738681509L;
        pw$MessageLayout.ixvc[5] = -7322939543160518599L;
        pw$MessageLayout.ixvc[6] = -2747605913613481044L;
        pw$MessageLayout.ixvc[7] = -1924709800289827008L;
        pw$MessageLayout.ixvc[8] = 5540773465510941179L;
        pw$MessageLayout.ixvc[9] = 4904135980221233885L;
        pw$MessageLayout.ixvc[10] = 3889541040758591089L;
        pw$MessageLayout.ixvc[11] = -8131851949713091149L;
        pw$MessageLayout.ixvc[12] = 5408067376585245469L;
        pw$MessageLayout.ixvc[13] = 3627367205062306039L;
        pw$MessageLayout.ixvc[14] = -5858777804408530026L;
        pw$MessageLayout.ixvc[15] = -6943399988157296043L;
        pw$MessageLayout.ixvc[16] = -3325311955783052473L;
        pw$MessageLayout.ixvc[17] = 4104933239416344207L;
        pw$MessageLayout.ixvc[18] = -1016695105376175959L;
        pw$MessageLayout.ixvc[19] = -249141033996820962L;
        pw$MessageLayout.ixvc[20] = -7277698225154736856L;
        pw$MessageLayout.ixvc[21] = 533351094325386587L;
        pw$MessageLayout.ixvc[22] = -320168682355620330L;
        pw$MessageLayout.ixvc[23] = -7331140210545062513L;
        pw$MessageLayout.ixvc[24] = -3032460470231367565L;
        pw$MessageLayout.ixvc[25] = 2978970195098111172L;
        pw$MessageLayout.ixvc[26] = 1440017730959625786L;
        pw$MessageLayout.ixvc[27] = -6355330721586453891L;
        pw$MessageLayout.ixvc[28] = 3633513079518487224L;
        pw$MessageLayout.ixvc[29] = 9105663342903893107L;
        pw$MessageLayout.ixvc[30] = -5553063339421951032L;
        pw$MessageLayout.ixvc[31] = 7634006590659813079L;
        pw$MessageLayout.ixvc[32] = 7482701819950397286L;
        pw$MessageLayout.ixvc[33] = 8421029978062449575L;
        pw$MessageLayout.ixvc[34] = 691270008111068418L;
        pw$MessageLayout.ixvc[35] = -8431680873953764062L;
        pw$MessageLayout.ixvc[36] = 2042660090258270754L;
        pw$MessageLayout.ixvc[37] = 9149226054700801804L;
        pw$MessageLayout.ixvc[38] = 8680305341319921661L;
        pw$MessageLayout.ixvc[39] = 3622457552982770341L;
    }

    static {
        ixuo = new int[61];
        ixup = new int[61];
        pw$MessageLayout.iybo();
        pw$MessageLayout.iybq();
        ixvc = new long[40];
        ixvd = new long[40];
        pw$MessageLayout.iybt();
        pw$MessageLayout.iybw();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private pw$MessageLayout(pw$Message var1_1, List<String> var2_2, float var3_3) {
        var5_4 /* !! */  = pw$MessageLayout.b;
        super();
        this.message = var1_1;
        this.lines = var2_2;
        if (var5_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.height = var3_3;
                return;
            }
lbl10:
            // 2 sources

            case 0: {
                var5_4 /* !! */  = (int)pw$MessageLayout.ixuq("ixur", ixun(int ), (int)0);
                break;
            }
lbl13:
            // 2 sources

            case 1: {
                var5_4 /* !! */  = (int)pw$MessageLayout.ixuq("ixus", ixun(int ), (int)1);
                ** GOTO lbl10
            }
            case 2: {
                var5_4 /* !! */  = (int)pw$MessageLayout.ixuq("ixuu", ixun(int ), (int)2);
                ** GOTO lbl13
            }
            case 3: 
        }
        while (true) {
            var5_4 /* !! */  = (int)pw$MessageLayout.ixuq("ixuv", ixun(int ), (int)3);
        }
    }

    private static /* synthetic */ int ixun(int n2) {
        return ixuo[n2] ^ ixup[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final int hashCode() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = pw$MessageLayout.qu - pw$MessageLayout.ixuq("ixvz", ixva(int ), (int)7)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == pw$MessageLayout.ixuq("ixwa", ixun(int ), (int)12)) break;
            v0 /* !! */  = (long)pw$MessageLayout.ixuq("ixwb", ixun(int ), (int)13);
        }
        var3_1 = pw$MessageLayout.c;
        v1 /* !! */  = pw$MessageLayout.qu;
        if (true) ** GOTO lbl12
        block16: while (true) {
            v1 /* !! */  = (long)(v2 - pw$MessageLayout.ixuq("ixwc", ixva(int ), (int)8));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1546064902: {
                    v2 = pw$MessageLayout.ixuq("ixwd", ixva(int ), (int)9);
                    continue block16;
                }
                case -1074137179: {
                    break block16;
                }
                case 59428389: {
                    v2 = pw$MessageLayout.ixuq("ixwf", ixva(int ), (int)10);
                    continue block16;
                }
            }
            break;
        }
        var2_2 /* !! */  = pw$MessageLayout.b;
        v3 /* !! */  = pw$MessageLayout.qu;
        if (true) ** GOTO lbl26
        block17: while (true) {
            v3 /* !! */  = (long)(pw$MessageLayout.ixuq("ixwi", ixva(int ), (int)12) - pw$MessageLayout.ixuq("ixwg", ixva(int ), (int)11));
lbl26:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1074137179: {
                    break block17;
                }
                case 2046866334: {
                    continue block17;
                }
            }
            break;
        }
        var1_3 = pw$MessageLayout.a;
        if (var3_1) {
            throw null;
            return (int)pw$MessageLayout.ixuq("ixwk", ixun(int ), (int)14);
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_1 = pw$MessageLayout.qu - pw$MessageLayout.ixuq("ixwn", ixva(int ), (int)13)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == pw$MessageLayout.ixuq("ixwp", ixun(int ), (int)15)) break;
                    v4 /* !! */  = (long)pw$MessageLayout.ixuq("ixwq", ixun(int ), (int)16);
                }
                return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{pw$MessageLayout.class, "message;lines;height", "message", "lines", "height"}, this);
            }
lbl47:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)pw$MessageLayout.ixuq("ixws", ixun(int ), (int)17);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl57
                    break;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)pw$MessageLayout.ixuq("ixwu", ixun(int ), (int)18);
                if (!var3_1) ** GOTO lbl47
                throw null;
            }
lbl57:
            // 2 sources

            case 2: {
                do {
                    var2_2 /* !! */  = (int)pw$MessageLayout.ixuq("ixww", ixun(int ), (int)19);
                } while (!var3_1);
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)pw$MessageLayout.ixuq("ixwx", ixun(int ), (int)20);
        ** while (!var3_1)
lbl65:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public List<String> lines() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = pw$MessageLayout.qu - pw$MessageLayout.ixuq("ixzl", ixva(int ), (int)27)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == pw$MessageLayout.ixuq("ixzn", ixun(int ), (int)40)) break;
            v0 /* !! */  = (long)pw$MessageLayout.ixuq("ixzo", ixun(int ), (int)41);
        }
        var3_1 = pw$MessageLayout.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = pw$MessageLayout.qu - pw$MessageLayout.ixuq("ixzq", ixva(int ), (int)28)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == pw$MessageLayout.ixuq("ixzr", ixun(int ), (int)42)) break;
            v1 /* !! */  = (long)pw$MessageLayout.ixuq("ixzs", ixun(int ), (int)43);
        }
        var2_2 /* !! */  = pw$MessageLayout.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = pw$MessageLayout.qu - pw$MessageLayout.ixuq("ixzt", ixva(int ), (int)29)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == pw$MessageLayout.ixuq("ixzu", ixun(int ), (int)44)) break;
            v2 /* !! */  = (long)pw$MessageLayout.ixuq("ixzw", ixun(int ), (int)45);
        }
        var1_3 = pw$MessageLayout.a;
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
                v3 /* !! */  = pw$MessageLayout.qu;
                if (true) ** GOTO lbl34
                block15: while (true) {
                    v3 /* !! */  = (long)(v4 - pw$MessageLayout.ixuq("ixzx", ixva(int ), (int)30));
lbl34:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1074137179: {
                            break block15;
                        }
                        case 1811831252: {
                            v4 = pw$MessageLayout.ixuq("ixzz", ixva(int ), (int)31);
                            continue block15;
                        }
                        case 2115526101: {
                            v4 = pw$MessageLayout.ixuq("iyaa", ixva(int ), (int)32);
                            continue block15;
                        }
                    }
                    break;
                }
                return this.lines;
            }
            case 0: {
                var2_2 /* !! */  = (int)pw$MessageLayout.ixuq("iyab", ixun(int ), (int)46);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl54
            }
lbl49:
            // 2 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)pw$MessageLayout.ixuq("iyac", ixun(int ), (int)47);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
lbl54:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)pw$MessageLayout.ixuq("iyae", ixun(int ), (int)48);
                if (!var3_1) ** GOTO lbl49
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)pw$MessageLayout.ixuq("iyag", ixun(int ), (int)49);
        ** while (!var3_1)
lbl61:
        // 1 sources

        throw null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public pw$Message message() {
        boolean bl2;
        while (true) {
            long l2;
            Object object;
            if ((object = (l2 = qu - pw$MessageLayout.ixuq("ixyh", ixva(int ), (int)22)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object == pw$MessageLayout.ixuq("ixyj", ixun(int ), (int)30)) break;
            object = pw$MessageLayout.ixuq("ixyk", ixun(int ), (int)31);
        }
        boolean bl3 = c;
        Object object = qu;
        block5: while (true) {
            switch ((int)object) {
                case -1157118363: {
                    object = pw$MessageLayout.ixuq("ixyp", ixva(int ), (int)24) - pw$MessageLayout.ixuq("ixym", ixva(int ), (int)23);
                    continue block5;
                }
                case -1074137179: {
                    break block5;
                }
            }
            break;
        }
        int n2 = b;
        while (true) {
            long l3;
            Object object2;
            if ((object2 = (l3 = qu - pw$MessageLayout.ixuq("ixyq", ixva(int ), (int)25)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object2 == pw$MessageLayout.ixuq("ixys", ixun(int ), (int)32)) {
                bl2 = a;
                if (bl3) {
                    throw null;
                }
                break;
            }
            object2 = pw$MessageLayout.ixuq("ixyu", ixun(int ), (int)33);
        }
        if (bl2) return null;
        if (bl2) return null;
        while (true) {
            long l4;
            Object object3;
            if ((object3 = (l4 = qu - pw$MessageLayout.ixuq("ixyx", ixva(int ), (int)26)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            if (object3 == pw$MessageLayout.ixuq("ixyz", ixun(int ), (int)34)) {
                return this.message;
            }
            object3 = pw$MessageLayout.ixuq("ixza", ixun(int ), (int)35);
        }
    }

    private static /* synthetic */ void iybw() {
        pw$MessageLayout.ixvd[0] = -2055384638856420019L;
        pw$MessageLayout.ixvd[1] = 928520289441904823L;
        pw$MessageLayout.ixvd[2] = 9064324682907990841L;
        pw$MessageLayout.ixvd[3] = 3059742074540352940L;
        pw$MessageLayout.ixvd[4] = -8002989425611002178L;
        pw$MessageLayout.ixvd[5] = 5996743707374198591L;
        pw$MessageLayout.ixvd[6] = -2416168701488009844L;
        pw$MessageLayout.ixvd[7] = 2181751390920731620L;
        pw$MessageLayout.ixvd[8] = 6162978595962306091L;
        pw$MessageLayout.ixvd[9] = 3830502323017977003L;
        pw$MessageLayout.ixvd[10] = 4411098109172937406L;
        pw$MessageLayout.ixvd[11] = 725836547873609814L;
        pw$MessageLayout.ixvd[12] = -5890350455237033343L;
        pw$MessageLayout.ixvd[13] = -5080401924188615111L;
        pw$MessageLayout.ixvd[14] = 6885916132834592904L;
        pw$MessageLayout.ixvd[15] = -2590056680154003304L;
        pw$MessageLayout.ixvd[16] = 5817010154239566183L;
        pw$MessageLayout.ixvd[17] = 1090598061342318710L;
        pw$MessageLayout.ixvd[18] = 7435559781112928957L;
        pw$MessageLayout.ixvd[19] = 7944989240398650341L;
        pw$MessageLayout.ixvd[20] = 1014019392357859555L;
        pw$MessageLayout.ixvd[21] = -8300607393003487029L;
        pw$MessageLayout.ixvd[22] = 3242293519023194694L;
        pw$MessageLayout.ixvd[23] = -2693648723358469984L;
        pw$MessageLayout.ixvd[24] = -7445824527732944812L;
        pw$MessageLayout.ixvd[25] = 876625136425523323L;
        pw$MessageLayout.ixvd[26] = 129205716827476582L;
        pw$MessageLayout.ixvd[27] = -262638497211333662L;
        pw$MessageLayout.ixvd[28] = -1715505205641226547L;
        pw$MessageLayout.ixvd[29] = 5840830176099422150L;
        pw$MessageLayout.ixvd[30] = -474561455364435599L;
        pw$MessageLayout.ixvd[31] = -8969645094350008876L;
        pw$MessageLayout.ixvd[32] = 6518229329576818698L;
        pw$MessageLayout.ixvd[33] = -2755343908474397187L;
        pw$MessageLayout.ixvd[34] = -5071599110676227524L;
        pw$MessageLayout.ixvd[35] = -299414206174439011L;
        pw$MessageLayout.ixvd[36] = 3604077629496252689L;
        pw$MessageLayout.ixvd[37] = -3856000316501646109L;
        pw$MessageLayout.ixvd[38] = -2864087448619884815L;
        pw$MessageLayout.ixvd[39] = 888346122382400943L;
    }

    private static /* synthetic */ float iyay(int n2) {
        return Float.intBitsToFloat(ixuo[n2] ^ ixup[n2]);
    }

    private static /* synthetic */ long ixva(int n2) {
        return ixvc[n2] ^ ixvd[n2];
    }

    private static /* synthetic */ void iybq() {
        pw$MessageLayout.ixup[0] = 1597066565;
        pw$MessageLayout.ixup[1] = 1995866692;
        pw$MessageLayout.ixup[2] = 1323348603;
        pw$MessageLayout.ixup[3] = -209545066;
        pw$MessageLayout.ixup[4] = 327435166;
        pw$MessageLayout.ixup[5] = 1158114080;
        pw$MessageLayout.ixup[6] = 306881101;
        pw$MessageLayout.ixup[7] = -1728463057;
        pw$MessageLayout.ixup[8] = 1634730180;
        pw$MessageLayout.ixup[9] = 253554709;
        pw$MessageLayout.ixup[10] = -124468744;
        pw$MessageLayout.ixup[11] = -1408963160;
        pw$MessageLayout.ixup[12] = -1825241859;
        pw$MessageLayout.ixup[13] = 1185535609;
        pw$MessageLayout.ixup[14] = -1559337547;
        pw$MessageLayout.ixup[15] = 1180330099;
        pw$MessageLayout.ixup[16] = 1260212978;
        pw$MessageLayout.ixup[17] = 149437980;
        pw$MessageLayout.ixup[18] = 1632948553;
        pw$MessageLayout.ixup[19] = 645219054;
        pw$MessageLayout.ixup[20] = -476418627;
        pw$MessageLayout.ixup[21] = -917603059;
        pw$MessageLayout.ixup[22] = 1198841717;
        pw$MessageLayout.ixup[23] = -1971637994;
        pw$MessageLayout.ixup[24] = -2132543639;
        pw$MessageLayout.ixup[25] = 1231396738;
        pw$MessageLayout.ixup[26] = 2028202366;
        pw$MessageLayout.ixup[27] = 1069463201;
        pw$MessageLayout.ixup[28] = -811776402;
        pw$MessageLayout.ixup[29] = 174117018;
        pw$MessageLayout.ixup[30] = 1869096935;
        pw$MessageLayout.ixup[31] = 1339900493;
        pw$MessageLayout.ixup[32] = 316214406;
        pw$MessageLayout.ixup[33] = -2133093960;
        pw$MessageLayout.ixup[34] = -1462441708;
        pw$MessageLayout.ixup[35] = 1937572226;
        pw$MessageLayout.ixup[36] = 1141620523;
        pw$MessageLayout.ixup[37] = 1761487036;
        pw$MessageLayout.ixup[38] = -402291406;
        pw$MessageLayout.ixup[39] = -1637902243;
        pw$MessageLayout.ixup[40] = 2138029848;
        pw$MessageLayout.ixup[41] = 1301240954;
        pw$MessageLayout.ixup[42] = 512642533;
        pw$MessageLayout.ixup[43] = 445123507;
        pw$MessageLayout.ixup[44] = -1688363748;
        pw$MessageLayout.ixup[45] = -1386494990;
        pw$MessageLayout.ixup[46] = 619782169;
        pw$MessageLayout.ixup[47] = 1728703880;
        pw$MessageLayout.ixup[48] = -378143055;
        pw$MessageLayout.ixup[49] = 870543090;
        pw$MessageLayout.ixup[50] = -1030407498;
        pw$MessageLayout.ixup[51] = -631186838;
        pw$MessageLayout.ixup[52] = 1755574217;
        pw$MessageLayout.ixup[53] = -265417661;
        pw$MessageLayout.ixup[54] = -1539476052;
        pw$MessageLayout.ixup[55] = -736208326;
        pw$MessageLayout.ixup[56] = -1140452249;
        pw$MessageLayout.ixup[57] = 560545007;
        pw$MessageLayout.ixup[58] = 660511079;
        pw$MessageLayout.ixup[59] = 598449850;
        pw$MessageLayout.ixup[60] = -825570736;
    }

    public static /* synthetic */ CallSite ixuq(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final String toString() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = pw$MessageLayout.qu - pw$MessageLayout.ixuq("ixve", ixva(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == pw$MessageLayout.ixuq("ixvg", ixun(int ), (int)4)) break;
            v0 /* !! */  = (long)pw$MessageLayout.ixuq("ixvh", ixun(int ), (int)5);
        }
        var3_1 = pw$MessageLayout.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = pw$MessageLayout.qu - pw$MessageLayout.ixuq("ixvi", ixva(int ), (int)1)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == pw$MessageLayout.ixuq("ixvj", ixun(int ), (int)6)) break;
            v1 /* !! */  = (long)pw$MessageLayout.ixuq("ixvk", ixun(int ), (int)7);
        }
        var2_2 = pw$MessageLayout.b;
        v2 /* !! */  = pw$MessageLayout.qu;
        if (true) ** GOTO lbl19
        block11: while (true) {
            v2 /* !! */  = (long)(v3 - pw$MessageLayout.ixuq("ixvl", ixva(int ), (int)2));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1313018360: {
                    v3 = pw$MessageLayout.ixuq("ixvm", ixva(int ), (int)3);
                    continue block11;
                }
                case -1074137179: {
                    break block11;
                }
                case 2112383030: {
                    v3 = pw$MessageLayout.ixuq("ixvn", ixva(int ), (int)4);
                    continue block11;
                }
            }
            break;
        }
        var1_3 = pw$MessageLayout.a;
        if (var3_1) {
            throw null;
lbl31:
            // 1 sources

            return null;
        }
        ** while (var1_3 || var1_3)
lbl34:
        // 1 sources

        v4 /* !! */  = pw$MessageLayout.qu;
        if (true) ** GOTO lbl38
        block13: while (true) {
            v4 /* !! */  = (long)(pw$MessageLayout.ixuq("ixvp", ixva(int ), (int)6) - pw$MessageLayout.ixuq("ixvo", ixva(int ), (int)5));
lbl38:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1074137179: {
                    break block13;
                }
                case 2139993042: {
                    continue block13;
                }
            }
            break;
        }
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{pw$MessageLayout.class, "message;lines;height", "message", "lines", "height"}, this);
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public final boolean equals(Object object) {
        boolean bl2;
        Object object2 = qu;
        block10: while (true) {
            switch ((int)object2) {
                case -1074137179: {
                    break block10;
                }
                case 2126126721: {
                    object2 = pw$MessageLayout.ixuq("ixxc", ixva(int ), (int)15) - pw$MessageLayout.ixuq("ixxb", ixva(int ), (int)14);
                    continue block10;
                }
            }
            break;
        }
        boolean bl3 = c;
        while (true) {
            long l2;
            Object object3;
            if ((object3 = (l2 = qu - pw$MessageLayout.ixuq("ixxe", ixva(int ), (int)16)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object3 == pw$MessageLayout.ixuq("ixxf", ixun(int ), (int)21)) break;
            object3 = pw$MessageLayout.ixuq("ixxh", ixun(int ), (int)22);
        }
        int n2 = b;
        while (true) {
            long l3;
            Object object4;
            if ((object4 = (l3 = qu - pw$MessageLayout.ixuq("ixxj", ixva(int ), (int)17)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object4 == pw$MessageLayout.ixuq("ixxk", ixun(int ), (int)23)) {
                bl2 = a;
                if (bl3) {
                    throw null;
                }
                break;
            }
            object4 = pw$MessageLayout.ixuq("ixxm", ixun(int ), (int)24);
        }
        if (bl2) return (boolean)pw$MessageLayout.ixuq("ixxp", ixun(int ), (int)25);
        if (bl2) return (boolean)pw$MessageLayout.ixuq("ixxp", ixun(int ), (int)25);
        Object object5 = qu;
        boolean bl4 = true;
        block13: while (true) {
            CallSite callSite;
            if (!bl4 || (bl4 = false) || !true) {
                object5 = callSite - pw$MessageLayout.ixuq("ixxr", ixva(int ), (int)18);
            }
            switch ((int)object5) {
                case -1074137179: {
                    return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{pw$MessageLayout.class, "message;lines;height", "message", "lines", "height"}, this, object);
                }
                case -845722568: {
                    callSite = pw$MessageLayout.ixuq("ixxt", ixva(int ), (int)19);
                    continue block13;
                }
                case -418342225: {
                    callSite = pw$MessageLayout.ixuq("ixxv", ixva(int ), (int)20);
                    continue block13;
                }
                case 1384693122: {
                    callSite = pw$MessageLayout.ixuq("ixxw", ixva(int ), (int)21);
                    continue block13;
                }
            }
            break;
        }
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{pw$MessageLayout.class, "message;lines;height", "message", "lines", "height"}, this, object);
    }
}

