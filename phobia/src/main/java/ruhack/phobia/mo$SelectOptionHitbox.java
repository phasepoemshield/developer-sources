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
import ruhack.phobia.kf;

final class mo$SelectOptionHitbox
extends Record {
    private static int[] fimo = new int[75];
    public static final long md = 919252862652512847L;
    private static long[] fimx;
    private final float y;
    public static final int b;
    private final kf setting;
    public static final boolean a;
    public static final boolean c;
    private final float height;
    private final String option;
    private static long[] fimy;
    private final float width;
    private final float x;
    private static int[] fimp;

    private static /* synthetic */ void fisv() {
        mo$SelectOptionHitbox.fimy[0] = -3369562505098959263L;
        mo$SelectOptionHitbox.fimy[1] = -4614063661790630352L;
        mo$SelectOptionHitbox.fimy[2] = -8765630415193568807L;
        mo$SelectOptionHitbox.fimy[3] = 9142881225426219857L;
        mo$SelectOptionHitbox.fimy[4] = 7274722732944322639L;
        mo$SelectOptionHitbox.fimy[5] = -3818045766892603366L;
        mo$SelectOptionHitbox.fimy[6] = -2551110019995850760L;
        mo$SelectOptionHitbox.fimy[7] = 1616229827395099147L;
        mo$SelectOptionHitbox.fimy[8] = -785508773166061386L;
        mo$SelectOptionHitbox.fimy[9] = -5154095419296939638L;
        mo$SelectOptionHitbox.fimy[10] = 4401522738856293665L;
        mo$SelectOptionHitbox.fimy[11] = 5037315627922472191L;
        mo$SelectOptionHitbox.fimy[12] = 2524608093065611027L;
        mo$SelectOptionHitbox.fimy[13] = -4455383382099730417L;
        mo$SelectOptionHitbox.fimy[14] = -8830861180815741256L;
        mo$SelectOptionHitbox.fimy[15] = -4708162652341943146L;
        mo$SelectOptionHitbox.fimy[16] = -6522095241331950235L;
        mo$SelectOptionHitbox.fimy[17] = 5554650077873555712L;
        mo$SelectOptionHitbox.fimy[18] = 5640114175211456416L;
        mo$SelectOptionHitbox.fimy[19] = -5213490819575880030L;
        mo$SelectOptionHitbox.fimy[20] = 6319460856407391510L;
        mo$SelectOptionHitbox.fimy[21] = -5751547397306392371L;
        mo$SelectOptionHitbox.fimy[22] = -4119635377989353771L;
        mo$SelectOptionHitbox.fimy[23] = 5312504569160957168L;
        mo$SelectOptionHitbox.fimy[24] = -1468184833521346317L;
        mo$SelectOptionHitbox.fimy[25] = -2155095601708974274L;
        mo$SelectOptionHitbox.fimy[26] = -237029463408456732L;
        mo$SelectOptionHitbox.fimy[27] = -4536235791997602658L;
        mo$SelectOptionHitbox.fimy[28] = -481119427869237885L;
        mo$SelectOptionHitbox.fimy[29] = 4823844476186754529L;
        mo$SelectOptionHitbox.fimy[30] = 1212998431877481965L;
        mo$SelectOptionHitbox.fimy[31] = 6717500613710963246L;
        mo$SelectOptionHitbox.fimy[32] = 8092226889324331330L;
        mo$SelectOptionHitbox.fimy[33] = -2484414416127430365L;
        mo$SelectOptionHitbox.fimy[34] = -1828187575222823731L;
        mo$SelectOptionHitbox.fimy[35] = -8293931183571481991L;
        mo$SelectOptionHitbox.fimy[36] = -2644044594695837736L;
        mo$SelectOptionHitbox.fimy[37] = -9090758471592074891L;
        mo$SelectOptionHitbox.fimy[38] = -6065533208571794971L;
        mo$SelectOptionHitbox.fimy[39] = 6374965264064126467L;
        mo$SelectOptionHitbox.fimy[40] = 5295970458609934153L;
        mo$SelectOptionHitbox.fimy[41] = -4226584177947409634L;
        mo$SelectOptionHitbox.fimy[42] = -3049773603535995287L;
        mo$SelectOptionHitbox.fimy[43] = 9043932833880073219L;
        mo$SelectOptionHitbox.fimy[44] = -8204343644028126266L;
        mo$SelectOptionHitbox.fimy[45] = -7961328198096185637L;
        mo$SelectOptionHitbox.fimy[46] = 6281899263185222012L;
        mo$SelectOptionHitbox.fimy[47] = -1538369300105160853L;
        mo$SelectOptionHitbox.fimy[48] = -6839732692167000096L;
        mo$SelectOptionHitbox.fimy[49] = -1086770513225327882L;
        mo$SelectOptionHitbox.fimy[50] = -7026979933639574726L;
        mo$SelectOptionHitbox.fimy[51] = 2964145277587284670L;
        mo$SelectOptionHitbox.fimy[52] = 3487784417196874257L;
        mo$SelectOptionHitbox.fimy[53] = -7922864136188337941L;
        mo$SelectOptionHitbox.fimy[54] = 4855371445582178898L;
        mo$SelectOptionHitbox.fimy[55] = -2451819390810438668L;
        mo$SelectOptionHitbox.fimy[56] = 3315311872368844236L;
        mo$SelectOptionHitbox.fimy[57] = 8118639558062247929L;
        mo$SelectOptionHitbox.fimy[58] = 8952810129858768926L;
        mo$SelectOptionHitbox.fimy[59] = 4608560057063564030L;
        mo$SelectOptionHitbox.fimy[60] = -370746051184247111L;
        mo$SelectOptionHitbox.fimy[61] = -764206162190383188L;
        mo$SelectOptionHitbox.fimy[62] = 7012650567586925799L;
        mo$SelectOptionHitbox.fimy[63] = -3564546958833418345L;
        mo$SelectOptionHitbox.fimy[64] = 527314567955787134L;
        mo$SelectOptionHitbox.fimy[65] = 3644102119447782803L;
        mo$SelectOptionHitbox.fimy[66] = -1107858072931921035L;
        mo$SelectOptionHitbox.fimy[67] = 7432919794317034195L;
        mo$SelectOptionHitbox.fimy[68] = -5482312895591408944L;
        mo$SelectOptionHitbox.fimy[69] = 8484335528372358546L;
        mo$SelectOptionHitbox.fimy[70] = 5555456320292484050L;
        mo$SelectOptionHitbox.fimy[71] = -4329924625742679706L;
        mo$SelectOptionHitbox.fimy[72] = -1451036924047602747L;
        mo$SelectOptionHitbox.fimy[73] = -3966366005357342404L;
        mo$SelectOptionHitbox.fimy[74] = -4968790794894029984L;
        mo$SelectOptionHitbox.fimy[75] = 6532332277110321031L;
        mo$SelectOptionHitbox.fimy[76] = 3434151348041845474L;
        mo$SelectOptionHitbox.fimy[77] = 5447297873745183421L;
    }

    static {
        fimp = new int[75];
        mo$SelectOptionHitbox.fiss();
        mo$SelectOptionHitbox.fist();
        fimx = new long[78];
        fimy = new long[78];
        mo$SelectOptionHitbox.fisu();
        mo$SelectOptionHitbox.fisv();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final int hashCode() {
        v0 /* !! */  = mo$SelectOptionHitbox.md;
        if (true) ** GOTO lbl5
        block23: while (true) {
            v0 /* !! */  = (long)(v1 - mo$SelectOptionHitbox.fimq("finq", fimw(int ), (int)9));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1328109043: {
                    v1 = mo$SelectOptionHitbox.fimq("finr", fimw(int ), (int)10);
                    continue block23;
                }
                case -1322649009: {
                    break block23;
                }
                case -28409419: {
                    v1 = mo$SelectOptionHitbox.fimq("fins", fimw(int ), (int)11);
                    continue block23;
                }
                case 1591907311: {
                    v1 = mo$SelectOptionHitbox.fimq("fint", fimw(int ), (int)12);
                    continue block23;
                }
            }
            break;
        }
        var3_1 = mo$SelectOptionHitbox.c;
        v2 /* !! */  = mo$SelectOptionHitbox.md;
        if (true) ** GOTO lbl22
        block24: while (true) {
            v2 /* !! */  = (long)(v3 - mo$SelectOptionHitbox.fimq("finu", fimw(int ), (int)13));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1322649009: {
                    break block24;
                }
                case 1123560288: {
                    v3 = mo$SelectOptionHitbox.fimq("finv", fimw(int ), (int)14);
                    continue block24;
                }
                case 1651275965: {
                    v3 = mo$SelectOptionHitbox.fimq("finw", fimw(int ), (int)15);
                    continue block24;
                }
            }
            break;
        }
        var2_2 /* !! */  = mo$SelectOptionHitbox.b;
        v4 /* !! */  = mo$SelectOptionHitbox.md;
        if (true) ** GOTO lbl36
        block25: while (true) {
            v4 /* !! */  = (long)(v5 - mo$SelectOptionHitbox.fimq("finx", fimw(int ), (int)16));
lbl36:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1322649009: {
                    break block25;
                }
                case -1265819480: {
                    v5 = mo$SelectOptionHitbox.fimq("finy", fimw(int ), (int)17);
                    continue block25;
                }
                case -108958608: {
                    v5 = mo$SelectOptionHitbox.fimq("finz", fimw(int ), (int)18);
                    continue block25;
                }
                case 1104323032: {
                    v5 = mo$SelectOptionHitbox.fimq("fioa", fimw(int ), (int)19);
                    continue block25;
                }
            }
            break;
        }
        var1_3 = mo$SelectOptionHitbox.a;
        if (var3_1) {
            throw null;
lbl51:
            // 2 sources

            return (int)mo$SelectOptionHitbox.fimq("fiob", fimn(int ), (int)13);
        }
        if (var1_3) ** GOTO lbl51
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_0 = mo$SelectOptionHitbox.md - mo$SelectOptionHitbox.fimq("fioc", fimw(int ), (int)20)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v6 /* !! */  == mo$SelectOptionHitbox.fimq("fiod", fimn(int ), (int)14)) break;
                    v6 /* !! */  = (long)mo$SelectOptionHitbox.fimq("fioe", fimn(int ), (int)15);
                }
                return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{mo$SelectOptionHitbox.class, "setting;option;x;y;width;height", "setting", "option", "x", "y", "width", "height"}, this);
            }
lbl65:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)mo$SelectOptionHitbox.fimq("fiof", fimn(int ), (int)16);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl75
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)mo$SelectOptionHitbox.fimq("fiog", fimn(int ), (int)17);
                    if (!var3_1) ** GOTO lbl65
                    throw null;
                }
            }
lbl75:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)mo$SelectOptionHitbox.fimq("fioh", fimn(int ), (int)18);
                if (!var3_1) break;
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)mo$SelectOptionHitbox.fimq("fioi", fimn(int ), (int)19);
        ** while (!var3_1)
lbl82:
        // 1 sources

        throw null;
    }

    public static /* synthetic */ CallSite fimq(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void fist() {
        mo$SelectOptionHitbox.fimp[0] = -264642352;
        mo$SelectOptionHitbox.fimp[1] = 990585604;
        mo$SelectOptionHitbox.fimp[2] = -576848478;
        mo$SelectOptionHitbox.fimp[3] = 2003004848;
        mo$SelectOptionHitbox.fimp[4] = 567515371;
        mo$SelectOptionHitbox.fimp[5] = 81942454;
        mo$SelectOptionHitbox.fimp[6] = 1302697146;
        mo$SelectOptionHitbox.fimp[7] = 413986030;
        mo$SelectOptionHitbox.fimp[8] = -969632013;
        mo$SelectOptionHitbox.fimp[9] = -808977255;
        mo$SelectOptionHitbox.fimp[10] = 553132085;
        mo$SelectOptionHitbox.fimp[11] = 2116621980;
        mo$SelectOptionHitbox.fimp[12] = 454654975;
        mo$SelectOptionHitbox.fimp[13] = 2025579440;
        mo$SelectOptionHitbox.fimp[14] = 1553582695;
        mo$SelectOptionHitbox.fimp[15] = -1488675090;
        mo$SelectOptionHitbox.fimp[16] = -1103550656;
        mo$SelectOptionHitbox.fimp[17] = -596494935;
        mo$SelectOptionHitbox.fimp[18] = 178115503;
        mo$SelectOptionHitbox.fimp[19] = 1937201757;
        mo$SelectOptionHitbox.fimp[20] = 839387108;
        mo$SelectOptionHitbox.fimp[21] = -1210303819;
        mo$SelectOptionHitbox.fimp[22] = 586115956;
        mo$SelectOptionHitbox.fimp[23] = 172554983;
        mo$SelectOptionHitbox.fimp[24] = 953875929;
        mo$SelectOptionHitbox.fimp[25] = -706166984;
        mo$SelectOptionHitbox.fimp[26] = -1797555193;
        mo$SelectOptionHitbox.fimp[27] = -2132217935;
        mo$SelectOptionHitbox.fimp[28] = 1148736403;
        mo$SelectOptionHitbox.fimp[29] = 2124139776;
        mo$SelectOptionHitbox.fimp[30] = 1176524302;
        mo$SelectOptionHitbox.fimp[31] = 846354443;
        mo$SelectOptionHitbox.fimp[32] = 966252009;
        mo$SelectOptionHitbox.fimp[33] = 960599787;
        mo$SelectOptionHitbox.fimp[34] = 1158602397;
        mo$SelectOptionHitbox.fimp[35] = -1316048808;
        mo$SelectOptionHitbox.fimp[36] = 531425012;
        mo$SelectOptionHitbox.fimp[37] = -366378296;
        mo$SelectOptionHitbox.fimp[38] = -1420421750;
        mo$SelectOptionHitbox.fimp[39] = -1718366638;
        mo$SelectOptionHitbox.fimp[40] = -674421009;
        mo$SelectOptionHitbox.fimp[41] = -1193238563;
        mo$SelectOptionHitbox.fimp[42] = -1254904938;
        mo$SelectOptionHitbox.fimp[43] = 1979734771;
        mo$SelectOptionHitbox.fimp[44] = -1146490482;
        mo$SelectOptionHitbox.fimp[45] = -1130674502;
        mo$SelectOptionHitbox.fimp[46] = 1327865958;
        mo$SelectOptionHitbox.fimp[47] = 197607075;
        mo$SelectOptionHitbox.fimp[48] = 1584609822;
        mo$SelectOptionHitbox.fimp[49] = 270652129;
        mo$SelectOptionHitbox.fimp[50] = -805732147;
        mo$SelectOptionHitbox.fimp[51] = -665151886;
        mo$SelectOptionHitbox.fimp[52] = -1393900570;
        mo$SelectOptionHitbox.fimp[53] = -135290158;
        mo$SelectOptionHitbox.fimp[54] = 970147861;
        mo$SelectOptionHitbox.fimp[55] = -828051264;
        mo$SelectOptionHitbox.fimp[56] = 1055320137;
        mo$SelectOptionHitbox.fimp[57] = 2041734787;
        mo$SelectOptionHitbox.fimp[58] = 9113421;
        mo$SelectOptionHitbox.fimp[59] = 552010516;
        mo$SelectOptionHitbox.fimp[60] = -604486911;
        mo$SelectOptionHitbox.fimp[61] = 1768608284;
        mo$SelectOptionHitbox.fimp[62] = 511988794;
        mo$SelectOptionHitbox.fimp[63] = -1003923688;
        mo$SelectOptionHitbox.fimp[64] = 341725917;
        mo$SelectOptionHitbox.fimp[65] = 85019888;
        mo$SelectOptionHitbox.fimp[66] = -1681222159;
        mo$SelectOptionHitbox.fimp[67] = -252655148;
        mo$SelectOptionHitbox.fimp[68] = 460242106;
        mo$SelectOptionHitbox.fimp[69] = -527355569;
        mo$SelectOptionHitbox.fimp[70] = -651418119;
        mo$SelectOptionHitbox.fimp[71] = 152070244;
        mo$SelectOptionHitbox.fimp[72] = -314607213;
        mo$SelectOptionHitbox.fimp[73] = -44113926;
        mo$SelectOptionHitbox.fimp[74] = 1981477064;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public float width() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = mo$SelectOptionHitbox.md - mo$SelectOptionHitbox.fimq("firl", fimw(int ), (int)61)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == mo$SelectOptionHitbox.fimq("firm", fimn(int ), (int)59)) break;
            v0 /* !! */  = (long)mo$SelectOptionHitbox.fimq("firn", fimn(int ), (int)60);
        }
        var3_1 = mo$SelectOptionHitbox.c;
        v1 /* !! */  = mo$SelectOptionHitbox.md;
        if (true) ** GOTO lbl12
        block10: while (true) {
            v1 /* !! */  = (long)(v2 - mo$SelectOptionHitbox.fimq("firo", fimw(int ), (int)62));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1322649009: {
                    break block10;
                }
                case 1499868998: {
                    v2 = mo$SelectOptionHitbox.fimq("firp", fimw(int ), (int)63);
                    continue block10;
                }
                case 1618885920: {
                    v2 = mo$SelectOptionHitbox.fimq("firq", fimw(int ), (int)64);
                    continue block10;
                }
            }
            break;
        }
        var2_2 = mo$SelectOptionHitbox.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = mo$SelectOptionHitbox.md - mo$SelectOptionHitbox.fimq("firr", fimw(int ), (int)65)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == mo$SelectOptionHitbox.fimq("firs", fimn(int ), (int)61)) break;
            v3 /* !! */  = (long)mo$SelectOptionHitbox.fimq("firt", fimn(int ), (int)62);
        }
        var1_3 = mo$SelectOptionHitbox.a;
        if (var3_1) {
            throw null;
lbl31:
            // 1 sources

            return (float)mo$SelectOptionHitbox.fimq("firu", fiqm(int ), (int)63);
        }
        ** while (var1_3 || var1_3)
lbl34:
        // 1 sources

        v4 /* !! */  = mo$SelectOptionHitbox.md;
        if (true) ** GOTO lbl38
        block13: while (true) {
            v4 /* !! */  = (long)(mo$SelectOptionHitbox.fimq("firw", fimw(int ), (int)67) - mo$SelectOptionHitbox.fimq("firv", fimw(int ), (int)66));
lbl38:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1322649009: {
                    break block13;
                }
                case -567977726: {
                    continue block13;
                }
            }
            break;
        }
        return this.width;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public float height() {
        v0 /* !! */  = mo$SelectOptionHitbox.md;
        if (true) ** GOTO lbl5
        block21: while (true) {
            v0 /* !! */  = (long)(v1 - mo$SelectOptionHitbox.fimq("fisb", fimw(int ), (int)68));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1322649009: {
                    break block21;
                }
                case -888515534: {
                    v1 = mo$SelectOptionHitbox.fimq("fisc", fimw(int ), (int)69);
                    continue block21;
                }
                case 325682450: {
                    v1 = mo$SelectOptionHitbox.fimq("fisd", fimw(int ), (int)70);
                    continue block21;
                }
            }
            break;
        }
        var3_1 = mo$SelectOptionHitbox.c;
        v2 /* !! */  = mo$SelectOptionHitbox.md;
        if (true) ** GOTO lbl19
        block22: while (true) {
            v2 /* !! */  = (long)(v3 - mo$SelectOptionHitbox.fimq("fise", fimw(int ), (int)71));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1322649009: {
                    break block22;
                }
                case -1207946468: {
                    v3 = mo$SelectOptionHitbox.fimq("fisf", fimw(int ), (int)72);
                    continue block22;
                }
                case -1126673823: {
                    v3 = mo$SelectOptionHitbox.fimq("fisg", fimw(int ), (int)73);
                    continue block22;
                }
                case -637870867: {
                    v3 = mo$SelectOptionHitbox.fimq("fish", fimw(int ), (int)74);
                    continue block22;
                }
            }
            break;
        }
        var2_2 /* !! */  = mo$SelectOptionHitbox.b;
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_0 = mo$SelectOptionHitbox.md - mo$SelectOptionHitbox.fimq("fisi", fimw(int ), (int)75)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v4 /* !! */  == mo$SelectOptionHitbox.fimq("fisj", fimn(int ), (int)68)) break;
            v4 /* !! */  = (long)mo$SelectOptionHitbox.fimq("fisk", fimn(int ), (int)69);
        }
        var1_3 = mo$SelectOptionHitbox.a;
        if (var3_1) {
            throw null;
lbl41:
            // 1 sources

            return (float)mo$SelectOptionHitbox.fimq("fisl", fiqm(int ), (int)70);
        }
        ** while (var1_3 || var1_3)
lbl44:
        // 1 sources

        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v5 /* !! */  = mo$SelectOptionHitbox.md;
                if (true) ** GOTO lbl51
                block25: while (true) {
                    v5 /* !! */  = (long)(mo$SelectOptionHitbox.fimq("fisn", fimw(int ), (int)77) - mo$SelectOptionHitbox.fimq("fism", fimw(int ), (int)76));
lbl51:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1322649009: {
                            break block25;
                        }
                        case 1419914881: {
                            continue block25;
                        }
                    }
                    break;
                }
                return this.height;
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)mo$SelectOptionHitbox.fimq("fiso", fimn(int ), (int)71);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 1: {
                do {
                    var2_2 /* !! */  = (int)mo$SelectOptionHitbox.fimq("fisp", fimn(int ), (int)72);
                } while (!var3_1);
                throw null;
            }
            case 2: {
                do {
                    var2_2 /* !! */  = (int)mo$SelectOptionHitbox.fimq("fisq", fimn(int ), (int)73);
                } while (!var3_1);
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)mo$SelectOptionHitbox.fimq("fisr", fimn(int ), (int)74);
        ** while (!var3_1)
lbl75:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ float fiqm(int n2) {
        return Float.intBitsToFloat(fimo[n2] ^ fimp[n2]);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public String option() {
        v0 /* !! */  = mo$SelectOptionHitbox.md;
        if (true) ** GOTO lbl5
        block10: while (true) {
            v0 /* !! */  = (long)(v1 - mo$SelectOptionHitbox.fimq("fipn", fimw(int ), (int)38));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1322649009: {
                    break block10;
                }
                case 411961660: {
                    v1 = mo$SelectOptionHitbox.fimq("fipo", fimw(int ), (int)39);
                    continue block10;
                }
                case 1262312993: {
                    v1 = mo$SelectOptionHitbox.fimq("fipp", fimw(int ), (int)40);
                    continue block10;
                }
            }
            break;
        }
        var3_1 = mo$SelectOptionHitbox.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = mo$SelectOptionHitbox.md - mo$SelectOptionHitbox.fimq("fipq", fimw(int ), (int)41)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == mo$SelectOptionHitbox.fimq("fipr", fimn(int ), (int)33)) break;
            v2 /* !! */  = (long)mo$SelectOptionHitbox.fimq("fips", fimn(int ), (int)34);
        }
        var2_2 = mo$SelectOptionHitbox.b;
        v3 /* !! */  = mo$SelectOptionHitbox.md;
        if (true) ** GOTO lbl26
        block12: while (true) {
            v3 /* !! */  = (long)(v4 - mo$SelectOptionHitbox.fimq("fipt", fimw(int ), (int)42));
lbl26:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1322649009: {
                    break block12;
                }
                case 1082088098: {
                    v4 = mo$SelectOptionHitbox.fimq("fipu", fimw(int ), (int)43);
                    continue block12;
                }
                case 1208072914: {
                    v4 = mo$SelectOptionHitbox.fimq("fipv", fimw(int ), (int)44);
                    continue block12;
                }
            }
            break;
        }
        var1_3 = mo$SelectOptionHitbox.a;
        if (var3_1) {
            throw null;
lbl38:
            // 1 sources

            return null;
        }
        ** while (var1_3 || var1_3)
lbl41:
        // 1 sources

        while (true) {
            if ((v5 /* !! */  = (cfr_temp_1 = mo$SelectOptionHitbox.md - mo$SelectOptionHitbox.fimq("fipw", fimw(int ), (int)45)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v5 /* !! */  == mo$SelectOptionHitbox.fimq("fipx", fimn(int ), (int)35)) break;
            v5 /* !! */  = (long)mo$SelectOptionHitbox.fimq("fipy", fimn(int ), (int)36);
        }
        return this.option;
    }

    /*
     * Enabled aggressive block sorting
     */
    public kf setting() {
        while (true) {
            long l2;
            Object object;
            if ((object = (l2 = md - mo$SelectOptionHitbox.fimq("fioz", fimw(int ), (int)32)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object == mo$SelectOptionHitbox.fimq("fipa", fimn(int ), (int)25)) break;
            object = mo$SelectOptionHitbox.fimq("fipb", fimn(int ), (int)26);
        }
        boolean bl2 = c;
        while (true) {
            long l3;
            Object object;
            if ((object = (l3 = md - mo$SelectOptionHitbox.fimq("fipc", fimw(int ), (int)33)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object == mo$SelectOptionHitbox.fimq("fipd", fimn(int ), (int)27)) break;
            object = mo$SelectOptionHitbox.fimq("fipe", fimn(int ), (int)28);
        }
        int n2 = b;
        Object object = md;
        block10: while (true) {
            switch ((int)object) {
                case -1322649009: {
                    break block10;
                }
                case 92459784: {
                    object = mo$SelectOptionHitbox.fimq("fipg", fimw(int ), (int)35) - mo$SelectOptionHitbox.fimq("fipf", fimw(int ), (int)34);
                    continue block10;
                }
            }
            break;
        }
        boolean bl3 = a;
        if (bl2) {
            throw null;
        }
        if (bl3) return null;
        if (bl3) return null;
        Object object2 = md;
        block11: while (true) {
            switch ((int)object2) {
                case -1322649009: {
                    return this.setting;
                }
                case 909234939: {
                    object2 = mo$SelectOptionHitbox.fimq("fipi", fimw(int ), (int)37) - mo$SelectOptionHitbox.fimq("fiph", fimw(int ), (int)36);
                    continue block11;
                }
            }
            break;
        }
        return this.setting;
    }

    private static /* synthetic */ int fimn(int n2) {
        return fimo[n2] ^ fimp[n2];
    }

    private static /* synthetic */ void fisu() {
        mo$SelectOptionHitbox.fimx[0] = 7007680899953469352L;
        mo$SelectOptionHitbox.fimx[1] = -4684054235222391966L;
        mo$SelectOptionHitbox.fimx[2] = 3253451935501548005L;
        mo$SelectOptionHitbox.fimx[3] = 725823842159293516L;
        mo$SelectOptionHitbox.fimx[4] = -8353642119973134747L;
        mo$SelectOptionHitbox.fimx[5] = -3876134065398225808L;
        mo$SelectOptionHitbox.fimx[6] = 8569812473447263319L;
        mo$SelectOptionHitbox.fimx[7] = 4839353015696959294L;
        mo$SelectOptionHitbox.fimx[8] = -2316903885930097224L;
        mo$SelectOptionHitbox.fimx[9] = -3089541633594035542L;
        mo$SelectOptionHitbox.fimx[10] = -4335352614157600053L;
        mo$SelectOptionHitbox.fimx[11] = -7408350887611722704L;
        mo$SelectOptionHitbox.fimx[12] = 5701318746002501384L;
        mo$SelectOptionHitbox.fimx[13] = -2794704177141394335L;
        mo$SelectOptionHitbox.fimx[14] = 7922886169286206212L;
        mo$SelectOptionHitbox.fimx[15] = -2783783079176078974L;
        mo$SelectOptionHitbox.fimx[16] = 8546277348032478439L;
        mo$SelectOptionHitbox.fimx[17] = -7544685900652731194L;
        mo$SelectOptionHitbox.fimx[18] = -8507634417064012878L;
        mo$SelectOptionHitbox.fimx[19] = 744994589994380348L;
        mo$SelectOptionHitbox.fimx[20] = -3045095619552839820L;
        mo$SelectOptionHitbox.fimx[21] = 4470357695184248460L;
        mo$SelectOptionHitbox.fimx[22] = -1190265753611698371L;
        mo$SelectOptionHitbox.fimx[23] = -1683891727868791046L;
        mo$SelectOptionHitbox.fimx[24] = -9082864815435583405L;
        mo$SelectOptionHitbox.fimx[25] = 2490630358324699056L;
        mo$SelectOptionHitbox.fimx[26] = -8357441105721750271L;
        mo$SelectOptionHitbox.fimx[27] = 1812996917849895477L;
        mo$SelectOptionHitbox.fimx[28] = -4332727068693548738L;
        mo$SelectOptionHitbox.fimx[29] = -6977091330327033919L;
        mo$SelectOptionHitbox.fimx[30] = -8159027401525546186L;
        mo$SelectOptionHitbox.fimx[31] = -5164867040397372106L;
        mo$SelectOptionHitbox.fimx[32] = 2411243569037513502L;
        mo$SelectOptionHitbox.fimx[33] = -4481643922584920961L;
        mo$SelectOptionHitbox.fimx[34] = 8601913814140863882L;
        mo$SelectOptionHitbox.fimx[35] = 3870624448040438235L;
        mo$SelectOptionHitbox.fimx[36] = -867675861449636767L;
        mo$SelectOptionHitbox.fimx[37] = -2729219864863749329L;
        mo$SelectOptionHitbox.fimx[38] = 4612712439979553683L;
        mo$SelectOptionHitbox.fimx[39] = 6275862335650139978L;
        mo$SelectOptionHitbox.fimx[40] = -1672266276492024651L;
        mo$SelectOptionHitbox.fimx[41] = -276871583953168516L;
        mo$SelectOptionHitbox.fimx[42] = -1649103621818046782L;
        mo$SelectOptionHitbox.fimx[43] = -1334881179138756805L;
        mo$SelectOptionHitbox.fimx[44] = 1190542145007740051L;
        mo$SelectOptionHitbox.fimx[45] = -8643933880292577257L;
        mo$SelectOptionHitbox.fimx[46] = 321874072835585634L;
        mo$SelectOptionHitbox.fimx[47] = -3721046749508012260L;
        mo$SelectOptionHitbox.fimx[48] = -7263931963998054171L;
        mo$SelectOptionHitbox.fimx[49] = 562956882804693870L;
        mo$SelectOptionHitbox.fimx[50] = 6864898290744015513L;
        mo$SelectOptionHitbox.fimx[51] = 1440182905427661506L;
        mo$SelectOptionHitbox.fimx[52] = -7552407642049954801L;
        mo$SelectOptionHitbox.fimx[53] = 782192499396529830L;
        mo$SelectOptionHitbox.fimx[54] = 8034391944171924870L;
        mo$SelectOptionHitbox.fimx[55] = 647664011879524177L;
        mo$SelectOptionHitbox.fimx[56] = -1414503561590937906L;
        mo$SelectOptionHitbox.fimx[57] = -707279193434414176L;
        mo$SelectOptionHitbox.fimx[58] = -1435252409982620563L;
        mo$SelectOptionHitbox.fimx[59] = 7439493286510132987L;
        mo$SelectOptionHitbox.fimx[60] = 3747753829705927130L;
        mo$SelectOptionHitbox.fimx[61] = 79576779009087171L;
        mo$SelectOptionHitbox.fimx[62] = -6248552804107236541L;
        mo$SelectOptionHitbox.fimx[63] = 5846390778839498026L;
        mo$SelectOptionHitbox.fimx[64] = -5552043117454850842L;
        mo$SelectOptionHitbox.fimx[65] = -161194521818342686L;
        mo$SelectOptionHitbox.fimx[66] = 6012212664972425781L;
        mo$SelectOptionHitbox.fimx[67] = 7922356624196980128L;
        mo$SelectOptionHitbox.fimx[68] = 5822061426196041771L;
        mo$SelectOptionHitbox.fimx[69] = -8737411200016345781L;
        mo$SelectOptionHitbox.fimx[70] = 6106715920580923497L;
        mo$SelectOptionHitbox.fimx[71] = 383754208963272267L;
        mo$SelectOptionHitbox.fimx[72] = -6665036583287770006L;
        mo$SelectOptionHitbox.fimx[73] = 2796159668250781326L;
        mo$SelectOptionHitbox.fimx[74] = 3083692351247110931L;
        mo$SelectOptionHitbox.fimx[75] = -7935676895440454363L;
        mo$SelectOptionHitbox.fimx[76] = -3397238263650037471L;
        mo$SelectOptionHitbox.fimx[77] = 780581502101045685L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public float y() {
        v0 /* !! */  = mo$SelectOptionHitbox.md;
        if (true) ** GOTO lbl5
        block20: while (true) {
            v0 /* !! */  = (long)(v1 - mo$SelectOptionHitbox.fimq("fiqv", fimw(int ), (int)52));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1322649009: {
                    break block20;
                }
                case 309414264: {
                    v1 = mo$SelectOptionHitbox.fimq("fiqw", fimw(int ), (int)53);
                    continue block20;
                }
                case 778171791: {
                    v1 = mo$SelectOptionHitbox.fimq("fiqx", fimw(int ), (int)54);
                    continue block20;
                }
                case 1987309073: {
                    v1 = mo$SelectOptionHitbox.fimq("fiqy", fimw(int ), (int)55);
                    continue block20;
                }
            }
            break;
        }
        var3_1 = mo$SelectOptionHitbox.c;
        v2 /* !! */  = mo$SelectOptionHitbox.md;
        if (true) ** GOTO lbl22
        block21: while (true) {
            v2 /* !! */  = (long)(mo$SelectOptionHitbox.fimq("fira", fimw(int ), (int)57) - mo$SelectOptionHitbox.fimq("fiqz", fimw(int ), (int)56));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1322649009: {
                    break block21;
                }
                case -1230019871: {
                    continue block21;
                }
            }
            break;
        }
        var2_2 /* !! */  = mo$SelectOptionHitbox.b;
        v3 /* !! */  = mo$SelectOptionHitbox.md;
        if (true) ** GOTO lbl32
        block22: while (true) {
            v3 /* !! */  = (long)(mo$SelectOptionHitbox.fimq("firc", fimw(int ), (int)59) - mo$SelectOptionHitbox.fimq("firb", fimw(int ), (int)58));
lbl32:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1770643980: {
                    continue block22;
                }
                case -1322649009: {
                    break block22;
                }
            }
            break;
        }
        var1_3 = mo$SelectOptionHitbox.a;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_1) {
                    throw null;
                    return (float)mo$SelectOptionHitbox.fimq("fird", fiqm(int ), (int)52);
                }
                if (var1_3 || var1_3) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_0 = mo$SelectOptionHitbox.md - mo$SelectOptionHitbox.fimq("fire", fimw(int ), (int)60)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == mo$SelectOptionHitbox.fimq("firf", fimn(int ), (int)53)) break;
                    v4 /* !! */  = (long)mo$SelectOptionHitbox.fimq("firg", fimn(int ), (int)54);
                }
                return this.y;
            }
lbl53:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)mo$SelectOptionHitbox.fimq("firh", fimn(int ), (int)55);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl64
                    break;
                }
            }
            case 1: {
                do {
                    var2_2 /* !! */  = (int)mo$SelectOptionHitbox.fimq("firi", fimn(int ), (int)56);
                } while (!var3_1);
                throw null;
            }
lbl64:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)mo$SelectOptionHitbox.fimq("firj", fimn(int ), (int)57);
                if (!var3_1) ** GOTO lbl53
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)mo$SelectOptionHitbox.fimq("firk", fimn(int ), (int)58);
        ** while (!var3_1)
lbl71:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final String toString() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = mo$SelectOptionHitbox.md - mo$SelectOptionHitbox.fimq("fimz", fimw(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == mo$SelectOptionHitbox.fimq("fina", fimn(int ), (int)5)) break;
            v0 /* !! */  = (long)mo$SelectOptionHitbox.fimq("finb", fimn(int ), (int)6);
        }
        var3_1 = mo$SelectOptionHitbox.c;
        v1 /* !! */  = mo$SelectOptionHitbox.md;
        if (true) ** GOTO lbl12
        block18: while (true) {
            v1 /* !! */  = (long)(v2 - mo$SelectOptionHitbox.fimq("finc", fimw(int ), (int)1));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1759678123: {
                    v2 = mo$SelectOptionHitbox.fimq("find", fimw(int ), (int)2);
                    continue block18;
                }
                case -1322649009: {
                    break block18;
                }
                case -782506807: {
                    v2 = mo$SelectOptionHitbox.fimq("fine", fimw(int ), (int)3);
                    continue block18;
                }
                case 900080705: {
                    v2 = mo$SelectOptionHitbox.fimq("finf", fimw(int ), (int)4);
                    continue block18;
                }
            }
            break;
        }
        var2_2 /* !! */  = mo$SelectOptionHitbox.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = mo$SelectOptionHitbox.md - mo$SelectOptionHitbox.fimq("fing", fimw(int ), (int)5)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == mo$SelectOptionHitbox.fimq("finh", fimn(int ), (int)7)) break;
            v3 /* !! */  = (long)mo$SelectOptionHitbox.fimq("fini", fimn(int ), (int)8);
        }
        var1_3 = mo$SelectOptionHitbox.a;
        if (var3_1) {
            throw null;
lbl34:
            // 2 sources

            return null;
        }
        if (var1_3) ** GOTO lbl34
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                v4 /* !! */  = mo$SelectOptionHitbox.md;
                if (true) ** GOTO lbl45
                block21: while (true) {
                    v4 /* !! */  = (long)(v5 - mo$SelectOptionHitbox.fimq("finj", fimw(int ), (int)6));
lbl45:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1457671624: {
                            v5 = mo$SelectOptionHitbox.fimq("fink", fimw(int ), (int)7);
                            continue block21;
                        }
                        case -1322649009: {
                            break block21;
                        }
                        case -1205812825: {
                            v5 = mo$SelectOptionHitbox.fimq("finl", fimw(int ), (int)8);
                            continue block21;
                        }
                    }
                    break;
                }
                return ObjectMethods.bootstrap("toString", new MethodHandle[]{mo$SelectOptionHitbox.class, "setting;option;x;y;width;height", "setting", "option", "x", "y", "width", "height"}, this);
            }
lbl55:
            // 2 sources

            case 0: {
                do {
                    var2_2 /* !! */  = (int)mo$SelectOptionHitbox.fimq("finm", fimn(int ), (int)9);
                } while (!var3_1);
                throw null;
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)mo$SelectOptionHitbox.fimq("finn", fimn(int ), (int)10);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)mo$SelectOptionHitbox.fimq("fino", fimn(int ), (int)11);
                if (!var3_1) ** GOTO lbl55
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)mo$SelectOptionHitbox.fimq("finp", fimn(int ), (int)12);
        ** while (!var3_1)
lbl72:
        // 1 sources

        throw null;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public final boolean equals(Object object) {
        Object object2 = md;
        boolean bl2 = true;
        block19: while (true) {
            CallSite callSite;
            if (!bl2 || (bl2 = false) || !true) {
                object2 = callSite - mo$SelectOptionHitbox.fimq("fioj", fimw(int ), (int)21);
            }
            switch ((int)object2) {
                case -1322649009: {
                    break block19;
                }
                case 813572731: {
                    callSite = mo$SelectOptionHitbox.fimq("fiok", fimw(int ), (int)22);
                    continue block19;
                }
                case 1315758965: {
                    callSite = mo$SelectOptionHitbox.fimq("fiol", fimw(int ), (int)23);
                    continue block19;
                }
            }
            break;
        }
        boolean bl3 = c;
        Object object3 = md;
        boolean bl4 = true;
        block20: while (true) {
            CallSite callSite;
            if (!bl4 || (bl4 = false) || !true) {
                object3 = callSite - mo$SelectOptionHitbox.fimq("fiom", fimw(int ), (int)24);
            }
            switch ((int)object3) {
                case -1322649009: {
                    break block20;
                }
                case 217189154: {
                    callSite = mo$SelectOptionHitbox.fimq("fion", fimw(int ), (int)25);
                    continue block20;
                }
                case 1704473985: {
                    callSite = mo$SelectOptionHitbox.fimq("fioo", fimw(int ), (int)26);
                    continue block20;
                }
            }
            break;
        }
        int n2 = b;
        Object object4 = md;
        boolean bl5 = true;
        block21: while (true) {
            CallSite callSite;
            if (!bl5 || (bl5 = false) || !true) {
                object4 = callSite - mo$SelectOptionHitbox.fimq("fiop", fimw(int ), (int)27);
            }
            switch ((int)object4) {
                case -1322649009: {
                    break block21;
                }
                case -910559976: {
                    callSite = mo$SelectOptionHitbox.fimq("fioq", fimw(int ), (int)28);
                    continue block21;
                }
                case 345649349: {
                    callSite = mo$SelectOptionHitbox.fimq("fior", fimw(int ), (int)29);
                    continue block21;
                }
            }
            break;
        }
        boolean bl6 = a;
        if (bl3) {
            throw null;
        }
        if (bl6) return (boolean)mo$SelectOptionHitbox.fimq("fios", fimn(int ), (int)20);
        if (bl6) return (boolean)mo$SelectOptionHitbox.fimq("fios", fimn(int ), (int)20);
        Object object5 = md;
        block22: while (true) {
            switch ((int)object5) {
                case -1537839172: {
                    object5 = mo$SelectOptionHitbox.fimq("fiou", fimw(int ), (int)31) - mo$SelectOptionHitbox.fimq("fiot", fimw(int ), (int)30);
                    continue block22;
                }
                case -1322649009: {
                    return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{mo$SelectOptionHitbox.class, "setting;option;x;y;width;height", "setting", "option", "x", "y", "width", "height"}, this, object);
                }
            }
            break;
        }
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{mo$SelectOptionHitbox.class, "setting;option;x;y;width;height", "setting", "option", "x", "y", "width", "height"}, this, object);
    }

    private static /* synthetic */ void fiss() {
        mo$SelectOptionHitbox.fimo[0] = -264642352;
        mo$SelectOptionHitbox.fimo[1] = 990585600;
        mo$SelectOptionHitbox.fimo[2] = -576848480;
        mo$SelectOptionHitbox.fimo[3] = 2003004850;
        mo$SelectOptionHitbox.fimo[4] = 567515368;
        mo$SelectOptionHitbox.fimo[5] = 81942455;
        mo$SelectOptionHitbox.fimo[6] = 359459493;
        mo$SelectOptionHitbox.fimo[7] = 413986031;
        mo$SelectOptionHitbox.fimo[8] = -751896374;
        mo$SelectOptionHitbox.fimo[9] = -808977254;
        mo$SelectOptionHitbox.fimo[10] = 553132084;
        mo$SelectOptionHitbox.fimo[11] = 2116621981;
        mo$SelectOptionHitbox.fimo[12] = 454654973;
        mo$SelectOptionHitbox.fimo[13] = 1395570341;
        mo$SelectOptionHitbox.fimo[14] = 1553582694;
        mo$SelectOptionHitbox.fimo[15] = 251110253;
        mo$SelectOptionHitbox.fimo[16] = -1103550655;
        mo$SelectOptionHitbox.fimo[17] = -596494934;
        mo$SelectOptionHitbox.fimo[18] = 178115500;
        mo$SelectOptionHitbox.fimo[19] = 1937201757;
        mo$SelectOptionHitbox.fimo[20] = 839387108;
        mo$SelectOptionHitbox.fimo[21] = -1210303819;
        mo$SelectOptionHitbox.fimo[22] = 586115958;
        mo$SelectOptionHitbox.fimo[23] = 172554980;
        mo$SelectOptionHitbox.fimo[24] = 953875928;
        mo$SelectOptionHitbox.fimo[25] = 706166983;
        mo$SelectOptionHitbox.fimo[26] = 923818632;
        mo$SelectOptionHitbox.fimo[27] = 2132217934;
        mo$SelectOptionHitbox.fimo[28] = 384016117;
        mo$SelectOptionHitbox.fimo[29] = 2124139776;
        mo$SelectOptionHitbox.fimo[30] = 1176524300;
        mo$SelectOptionHitbox.fimo[31] = 846354440;
        mo$SelectOptionHitbox.fimo[32] = 966252008;
        mo$SelectOptionHitbox.fimo[33] = -960599788;
        mo$SelectOptionHitbox.fimo[34] = -1765839147;
        mo$SelectOptionHitbox.fimo[35] = 1316048807;
        mo$SelectOptionHitbox.fimo[36] = 1510394232;
        mo$SelectOptionHitbox.fimo[37] = -366378295;
        mo$SelectOptionHitbox.fimo[38] = -1420421750;
        mo$SelectOptionHitbox.fimo[39] = -1718366639;
        mo$SelectOptionHitbox.fimo[40] = -674421010;
        mo$SelectOptionHitbox.fimo[41] = 1193238562;
        mo$SelectOptionHitbox.fimo[42] = 244545766;
        mo$SelectOptionHitbox.fimo[43] = -1979734772;
        mo$SelectOptionHitbox.fimo[44] = 1698918393;
        mo$SelectOptionHitbox.fimo[45] = 1130674501;
        mo$SelectOptionHitbox.fimo[46] = -143620173;
        mo$SelectOptionHitbox.fimo[47] = 883220165;
        mo$SelectOptionHitbox.fimo[48] = 1584609820;
        mo$SelectOptionHitbox.fimo[49] = 270652129;
        mo$SelectOptionHitbox.fimo[50] = -805732147;
        mo$SelectOptionHitbox.fimo[51] = -665151886;
        mo$SelectOptionHitbox.fimo[52] = -1820111194;
        mo$SelectOptionHitbox.fimo[53] = -135290157;
        mo$SelectOptionHitbox.fimo[54] = -1191478807;
        mo$SelectOptionHitbox.fimo[55] = -828051261;
        mo$SelectOptionHitbox.fimo[56] = 1055320139;
        mo$SelectOptionHitbox.fimo[57] = 2041734787;
        mo$SelectOptionHitbox.fimo[58] = 9113423;
        mo$SelectOptionHitbox.fimo[59] = 552010517;
        mo$SelectOptionHitbox.fimo[60] = -1625154538;
        mo$SelectOptionHitbox.fimo[61] = 1768608285;
        mo$SelectOptionHitbox.fimo[62] = 2100267443;
        mo$SelectOptionHitbox.fimo[63] = -79299045;
        mo$SelectOptionHitbox.fimo[64] = 341725916;
        mo$SelectOptionHitbox.fimo[65] = 85019890;
        mo$SelectOptionHitbox.fimo[66] = -1681222157;
        mo$SelectOptionHitbox.fimo[67] = -252655147;
        mo$SelectOptionHitbox.fimo[68] = 460242107;
        mo$SelectOptionHitbox.fimo[69] = -455666786;
        mo$SelectOptionHitbox.fimo[70] = -436085647;
        mo$SelectOptionHitbox.fimo[71] = 152070244;
        mo$SelectOptionHitbox.fimo[72] = -314607216;
        mo$SelectOptionHitbox.fimo[73] = -44113927;
        mo$SelectOptionHitbox.fimo[74] = 1981477066;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public float x() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = mo$SelectOptionHitbox.md - mo$SelectOptionHitbox.fimq("fiqd", fimw(int ), (int)46)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == mo$SelectOptionHitbox.fimq("fiqe", fimn(int ), (int)41)) break;
            v0 /* !! */  = (long)mo$SelectOptionHitbox.fimq("fiqf", fimn(int ), (int)42);
        }
        var3_1 = mo$SelectOptionHitbox.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = mo$SelectOptionHitbox.md - mo$SelectOptionHitbox.fimq("fiqg", fimw(int ), (int)47)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == mo$SelectOptionHitbox.fimq("fiqh", fimn(int ), (int)43)) break;
            v1 /* !! */  = (long)mo$SelectOptionHitbox.fimq("fiqi", fimn(int ), (int)44);
        }
        var2_2 /* !! */  = mo$SelectOptionHitbox.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = mo$SelectOptionHitbox.md - mo$SelectOptionHitbox.fimq("fiqj", fimw(int ), (int)48)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == mo$SelectOptionHitbox.fimq("fiqk", fimn(int ), (int)45)) break;
            v2 /* !! */  = (long)mo$SelectOptionHitbox.fimq("fiql", fimn(int ), (int)46);
        }
        var1_3 = mo$SelectOptionHitbox.a;
        if (!var3_1) ** GOTO lbl28
        throw null;
        {
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var2_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return (float)mo$SelectOptionHitbox.fimq("fiqn", fiqm(int ), (int)47);
                }
lbl28:
                // 1 sources

                if (var1_3 || var1_3) continue block14;
                v3 /* !! */  = mo$SelectOptionHitbox.md;
                if (true) ** GOTO lbl33
                block15: while (true) {
                    v3 /* !! */  = (long)(v4 - mo$SelectOptionHitbox.fimq("fiqo", fimw(int ), (int)49));
lbl33:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1322649009: {
                            break block15;
                        }
                        case -494819252: {
                            v4 = mo$SelectOptionHitbox.fimq("fiqp", fimw(int ), (int)50);
                            continue block15;
                        }
                        case 1188685615: {
                            v4 = mo$SelectOptionHitbox.fimq("fiqq", fimw(int ), (int)51);
                            continue block15;
                        }
                    }
                    break;
                }
                return this.x;
lbl43:
                // 2 sources

                case 0: {
                    var2_2 /* !! */  = (int)mo$SelectOptionHitbox.fimq("fiqr", fimn(int ), (int)48);
                    if (var3_1) {
                        throw null;
                    }
                }
lbl47:
                // 4 sources

                case 1: {
                    var2_2 /* !! */  = (int)mo$SelectOptionHitbox.fimq("fiqs", fimn(int ), (int)49);
                    if (!var3_1) ** GOTO lbl43
                    throw null;
                }
                case 2: {
                    var2_2 /* !! */  = (int)mo$SelectOptionHitbox.fimq("fiqt", fimn(int ), (int)50);
                    if (!var3_1) ** GOTO lbl47
                    throw null;
                }
                case 3: 
            }
        }
        do {
            var2_2 /* !! */  = (int)mo$SelectOptionHitbox.fimq("fiqu", fimn(int ), (int)51);
        } while (!var3_1);
        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private mo$SelectOptionHitbox(kf var1_1, String var2_2, float var3_3, float var4_4, float var5_5, float var6_6) {
        var8_7 /* !! */  = mo$SelectOptionHitbox.b;
        if (var8_7 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block7: while (true) {
            block9: {
                switch (cfr_temp_0 == -2147483648 ? var8_7 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        super();
                        this.setting = var1_1;
                        this.option = var2_2;
                        this.x = var3_3;
                        this.y = var4_4;
                        this.width = var5_5;
                        this.height = var6_6;
                        return;
                    }
                    case 0: {
                        var8_7 /* !! */  = (int)mo$SelectOptionHitbox.fimq("fimr", fimn(int ), (int)0);
                        cfr_temp_0 = 2;
                        break block9;
                    }
                    case 3: {
                        var8_7 /* !! */  = (int)mo$SelectOptionHitbox.fimq("fimu", fimn(int ), (int)3);
                        cfr_temp_0 = 2;
                        break block9;
                    }
                    case 4: {
                        var8_7 /* !! */  = (int)mo$SelectOptionHitbox.fimq("fimv", fimn(int ), (int)4);
                        ** GOTO lbl-1000
                    }
                    case 1: lbl-1000:
                    // 2 sources

                    {
                        var8_7 /* !! */  = (int)mo$SelectOptionHitbox.fimq("fims", fimn(int ), (int)1);
                    }
                    case 2: 
                }
                ** GOTO lbl33
            }
            while (true) {
                if (true) continue block7;
lbl33:
                // 2 sources

                var8_7 /* !! */  = (int)mo$SelectOptionHitbox.fimq("fimt", fimn(int ), (int)2);
                cfr_temp_0 = 1;
            }
            break;
        }
    }

    private static /* synthetic */ long fimw(int n2) {
        return fimx[n2] ^ fimy[n2];
    }
}

