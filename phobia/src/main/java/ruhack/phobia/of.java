/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.Collections;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import ruhack.phobia.od;

public class of {
    public static final int b;
    public static final boolean c;
    private final Map<String, od> scripts;
    private static int[] mbgq;
    public static final long uz = -7687000072841825235L;
    private static long[] mbgy;
    public static final boolean a;
    private static long[] mbgx;
    private static int[] mbgr;

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ od lambda$cleanupScript$1(String string, od od2) {
        Object object = uz;
        block15: while (true) {
            switch ((int)object) {
                case 1172075565: {
                    break block15;
                }
                case 1722186832: {
                    object = of.mbgs("mbyg", mbgw(int ), (int)201) - of.mbgs("mbyf", mbgw(int ), (int)200);
                    continue block15;
                }
            }
            break;
        }
        boolean bl2 = c;
        Object object2 = uz;
        boolean bl3 = true;
        block16: while (true) {
            CallSite callSite;
            if (!bl3 || (bl3 = false) || !true) {
                object2 = callSite - of.mbgs("mbyh", mbgw(int ), (int)202);
            }
            switch ((int)object2) {
                case 93318377: {
                    callSite = of.mbgs("mbyi", mbgw(int ), (int)203);
                    continue block16;
                }
                case 1126869005: {
                    callSite = of.mbgs("mbyj", mbgw(int ), (int)204);
                    continue block16;
                }
                case 1172075565: {
                    break block16;
                }
                case 1450167764: {
                    callSite = of.mbgs("mbyk", mbgw(int ), (int)205);
                    continue block16;
                }
            }
            break;
        }
        int n2 = b;
        Object object3 = uz;
        boolean bl4 = true;
        block17: while (true) {
            CallSite callSite;
            if (!bl4 || (bl4 = false) || !true) {
                object3 = callSite - of.mbgs("mbyl", mbgw(int ), (int)206);
            }
            switch ((int)object3) {
                case -1957680900: {
                    callSite = of.mbgs("mbym", mbgw(int ), (int)207);
                    continue block17;
                }
                case 1172075565: {
                    break block17;
                }
                case 2027193776: {
                    callSite = of.mbgs("mbyn", mbgw(int ), (int)208);
                    continue block17;
                }
            }
            break;
        }
        boolean bl5 = a;
        if (bl2) {
            throw null;
        }
        if (bl5 || bl5) return null;
        while (true) {
            long l2;
            Object object4;
            if ((object4 = (l2 = uz - of.mbgs("mbyo", mbgw(int ), (int)209)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (object4 == of.mbgs("mbyp", mbgp(int ), (int)251)) {
                od2.cleanup();
                if (bl5) return null;
                break;
            }
            object4 = of.mbgs("mbyq", mbgp(int ), (int)252);
        }
        if (!bl5) return od2;
        return null;
    }

    private static /* synthetic */ void mcac() {
        of.mbgy[200] = -6138966770074151098L;
        of.mbgy[201] = 9212835278803107100L;
        of.mbgy[202] = 553438467069315734L;
        of.mbgy[203] = -3899887700397518782L;
        of.mbgy[204] = 2333280609281482466L;
        of.mbgy[205] = 3019731751547047905L;
        of.mbgy[206] = 368730330473119611L;
        of.mbgy[207] = -6867056512399163603L;
        of.mbgy[208] = 6280790747897989986L;
        of.mbgy[209] = 2502103591430573441L;
        of.mbgy[210] = -8287808015469471094L;
        of.mbgy[211] = -4156886629656023969L;
        of.mbgy[212] = 7178619424110647394L;
        of.mbgy[213] = -7990194579600467652L;
        of.mbgy[214] = 542605697381227823L;
        of.mbgy[215] = 1648000276096666061L;
        of.mbgy[216] = 3622836457508814826L;
        of.mbgy[217] = 8563593849963922567L;
    }

    private static /* synthetic */ void mbzw() {
        of.mbgr[200] = -493770464;
        of.mbgr[201] = -1853106708;
        of.mbgr[202] = -87568472;
        of.mbgr[203] = 753897298;
        of.mbgr[204] = 312938856;
        of.mbgr[205] = -696209235;
        of.mbgr[206] = -1843088154;
        of.mbgr[207] = 764237154;
        of.mbgr[208] = -1606795918;
        of.mbgr[209] = 1071118297;
        of.mbgr[210] = 877495771;
        of.mbgr[211] = 1751189933;
        of.mbgr[212] = 1304026216;
        of.mbgr[213] = 1929309526;
        of.mbgr[214] = -36237967;
        of.mbgr[215] = 841999807;
        of.mbgr[216] = 2109916939;
        of.mbgr[217] = 2095654641;
        of.mbgr[218] = -370720091;
        of.mbgr[219] = 1271304495;
        of.mbgr[220] = -1149209788;
        of.mbgr[221] = -356685707;
        of.mbgr[222] = 796373277;
        of.mbgr[223] = -333280268;
        of.mbgr[224] = 1873460467;
        of.mbgr[225] = -2049186386;
        of.mbgr[226] = 1935805662;
        of.mbgr[227] = -937325765;
        of.mbgr[228] = -290535998;
        of.mbgr[229] = -134532924;
        of.mbgr[230] = -1368334272;
        of.mbgr[231] = 840662740;
        of.mbgr[232] = 1084062812;
        of.mbgr[233] = -1920309663;
        of.mbgr[234] = 37946472;
        of.mbgr[235] = 1210555778;
        of.mbgr[236] = -2122519001;
        of.mbgr[237] = -1105863143;
        of.mbgr[238] = 611195311;
        of.mbgr[239] = -739512189;
        of.mbgr[240] = -1774937599;
        of.mbgr[241] = -1596572324;
        of.mbgr[242] = -482650309;
        of.mbgr[243] = -1567502899;
        of.mbgr[244] = 1412259663;
        of.mbgr[245] = -816613408;
        of.mbgr[246] = 1540810511;
        of.mbgr[247] = -1951950116;
        of.mbgr[248] = -365099259;
        of.mbgr[249] = 1332380976;
        of.mbgr[250] = 733070717;
        of.mbgr[251] = -969338940;
        of.mbgr[252] = -456557627;
        of.mbgr[253] = 119540806;
        of.mbgr[254] = 2096286339;
        of.mbgr[255] = 1013241733;
        of.mbgr[256] = -1512837431;
        of.mbgr[257] = 144414401;
        of.mbgr[258] = -965560187;
        of.mbgr[259] = -502413589;
        of.mbgr[260] = 514941230;
        of.mbgr[261] = -1505073038;
        of.mbgr[262] = 1440927833;
        of.mbgr[263] = -87324605;
        of.mbgr[264] = -655413152;
        of.mbgr[265] = -1172325526;
        of.mbgr[266] = 1987237780;
        of.mbgr[267] = -5460822;
        of.mbgr[268] = 1574757957;
        of.mbgr[269] = 1578238071;
        of.mbgr[270] = 1199430768;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void clearAll() {
        v0 /* !! */  = of.uz;
        if (true) ** GOTO lbl5
        block23: while (true) {
            v0 /* !! */  = (long)(v1 - of.mbgs("mbpp", mbgw(int ), (int)104));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1269056047: {
                    v1 = of.mbgs("mbpq", mbgw(int ), (int)105);
                    continue block23;
                }
                case 1172075565: {
                    break block23;
                }
                case 1322600449: {
                    v1 = of.mbgs("mbpr", mbgw(int ), (int)106);
                    continue block23;
                }
            }
            break;
        }
        var3_1 = of.c;
        v2 /* !! */  = of.uz;
        if (true) ** GOTO lbl19
        block24: while (true) {
            v2 /* !! */  = (long)(v3 - of.mbgs("mbps", mbgw(int ), (int)107));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1718314066: {
                    v3 = of.mbgs("mbpt", mbgw(int ), (int)108);
                    continue block24;
                }
                case 1172075565: {
                    break block24;
                }
                case 1300687731: {
                    v3 = of.mbgs("mbpu", mbgw(int ), (int)109);
                    continue block24;
                }
                case 1861503694: {
                    v3 = of.mbgs("mbpv", mbgw(int ), (int)110);
                    continue block24;
                }
            }
            break;
        }
        var2_2 /* !! */  = of.b;
        v4 /* !! */  = of.uz;
        if (true) ** GOTO lbl36
        block25: while (true) {
            v4 /* !! */  = (long)(of.mbgs("mbpx", mbgw(int ), (int)112) - of.mbgs("mbpw", mbgw(int ), (int)111));
lbl36:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case 699126078: {
                    continue block25;
                }
                case 1172075565: {
                    break block25;
                }
            }
            break;
        }
        var1_3 = of.a;
        if (var3_1) {
            throw null;
lbl44:
            // 3 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl44
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_0 = of.uz - of.mbgs("mbpy", mbgw(int ), (int)113)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == of.mbgs("mbpz", mbgp(int ), (int)123)) break;
            v5 /* !! */  = (long)of.mbgs("mbqa", mbgp(int ), (int)124);
        }
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_1 = of.uz - of.mbgs("mbqb", mbgw(int ), (int)114)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v6 /* !! */  == of.mbgs("mbqc", mbgp(int ), (int)125)) break;
            v6 /* !! */  = (long)of.mbgs("mbqd", mbgp(int ), (int)126);
        }
        this.scripts.clear();
        if (var1_3) ** GOTO lbl44
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var1_3) ** break;
                ** continue;
                return;
            }
            case 0: {
                var2_2 /* !! */  = (int)of.mbgs("mbqe", mbgp(int ), (int)127);
                if (!var3_1) break;
                throw null;
            }
            case 1: {
                do {
                    var2_2 /* !! */  = (int)of.mbgs("mbqf", mbgp(int ), (int)128);
                } while (!var3_1);
                throw null;
            }
lbl74:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)of.mbgs("mbqg", mbgp(int ), (int)129);
                if (!var3_1) break;
                throw null;
            }
lbl78:
            // 2 sources

            case 3: {
                var2_2 /* !! */  = (int)of.mbgs("mbqh", mbgp(int ), (int)130);
                if (!var3_1) ** GOTO lbl74
                throw null;
            }
            case 4: {
                var2_2 /* !! */  = (int)of.mbgs("mbqi", mbgp(int ), (int)131);
                if (!var3_1) ** GOTO lbl78
                throw null;
            }
            case 5: 
        }
        do {
            var2_2 /* !! */  = (int)of.mbgs("mbqj", mbgp(int ), (int)132);
        } while (!var3_1);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void updateScript(String var1_1) {
        v0 /* !! */  = of.uz;
        if (true) ** GOTO lbl5
        block22: while (true) {
            v0 /* !! */  = (long)(of.mbgs("mbql", mbgw(int ), (int)116) - of.mbgs("mbqk", mbgw(int ), (int)115));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 704518488: {
                    continue block22;
                }
                case 1172075565: {
                    break block22;
                }
            }
            break;
        }
        var4_2 = of.c;
        v1 /* !! */  = of.uz;
        if (true) ** GOTO lbl15
        block23: while (true) {
            v1 /* !! */  = (long)(v2 - of.mbgs("mbqm", mbgw(int ), (int)117));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -759672006: {
                    v2 = of.mbgs("mbqn", mbgw(int ), (int)118);
                    continue block23;
                }
                case -26206030: {
                    v2 = of.mbgs("mbqo", mbgw(int ), (int)119);
                    continue block23;
                }
                case 1172075565: {
                    break block23;
                }
            }
            break;
        }
        var3_3 /* !! */  = of.b;
        v3 /* !! */  = of.uz;
        if (true) ** GOTO lbl29
        block24: while (true) {
            v3 /* !! */  = (long)(v4 - of.mbgs("mbqp", mbgw(int ), (int)120));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case 375405351: {
                    v4 = of.mbgs("mbqq", mbgw(int ), (int)121);
                    continue block24;
                }
                case 1172075565: {
                    break block24;
                }
                case 1369281518: {
                    v4 = of.mbgs("mbqr", mbgw(int ), (int)122);
                    continue block24;
                }
            }
            break;
        }
        var2_4 = of.a;
        if (var4_2) {
            throw null;
lbl41:
            // 3 sources

            return;
        }
        if (var2_4) ** GOTO lbl41
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** GOTO lbl41
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_0 = of.uz - of.mbgs("mbqs", mbgw(int ), (int)123)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == of.mbgs("mbqt", mbgp(int ), (int)133)) break;
                    v5 /* !! */  = (long)of.mbgs("mbqu", mbgp(int ), (int)134);
                }
                v6 = (Supplier<Boolean>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$updateScript$3(), ()Ljava/lang/Boolean;)();
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_1 = of.uz - of.mbgs("mbqv", mbgw(int ), (int)124)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == of.mbgs("mbqw", mbgp(int ), (int)135)) break;
                    v7 /* !! */  = (long)of.mbgs("mbqx", mbgp(int ), (int)136);
                }
                this.updateScript(var1_1, v6);
                if (!var2_4 && !var2_4) ** break;
                ** continue;
                return;
            }
lbl63:
            // 3 sources

            case 0: {
                var3_3 /* !! */  = (int)of.mbgs("mbqy", mbgp(int ), (int)137);
                if (var4_2) {
                    throw null;
                }
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var3_3 /* !! */  = (int)of.mbgs("mbqz", mbgp(int ), (int)138);
                    if (!var4_2) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 2: {
                var3_3 /* !! */  = (int)of.mbgs("mbra", mbgp(int ), (int)139);
                if (!var4_2) break;
                throw null;
            }
            case 3: {
                var3_3 /* !! */  = (int)of.mbgs("mbrb", mbgp(int ), (int)140);
                if (!var4_2) ** GOTO lbl63
                throw null;
            }
            case 4: {
                var3_3 /* !! */  = (int)of.mbgs("mbrc", mbgp(int ), (int)141);
                if (!var4_2) ** GOTO lbl63
                throw null;
            }
            case 5: 
        }
        var3_3 /* !! */  = (int)of.mbgs("mbrd", mbgp(int ), (int)142);
        ** while (!var4_2)
lbl87:
        // 1 sources

        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public void cleanupAll() {
        v0 /* !! */  = of.uz;
        if (true) ** GOTO lbl5
        block18: while (true) {
            v0 /* !! */  = (long)(v1 - of.mbgs("mbor", mbgw(int ), (int)94));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -917723581: {
                    v1 = of.mbgs("mbos", mbgw(int ), (int)95);
                    continue block18;
                }
                case -710831593: {
                    v1 = of.mbgs("mbot", mbgw(int ), (int)96);
                    continue block18;
                }
                case 1172075565: {
                    break block18;
                }
                case 1516419509: {
                    v1 = of.mbgs("mbou", mbgw(int ), (int)97);
                    continue block18;
                }
            }
            break;
        }
        var3_1 = of.c;
        v2 /* !! */  = of.uz;
        block19: while (true) {
            switch ((int)v2 /* !! */ ) {
                case -1568322149: {
                    v2 /* !! */  = (long)(of.mbgs("mbow", mbgw(int ), (int)99) - of.mbgs("mbov", mbgw(int ), (int)98));
                    continue block19;
                }
                case 1172075565: {
                    break block19;
                }
            }
            break;
        }
        var2_2 /* !! */  = of.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = of.uz - of.mbgs("mbox", mbgw(int ), (int)100)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == of.mbgs("mboy", mbgp(int ), (int)109)) {
                var1_3 = of.a;
                if (var3_1) {
                    throw null;
                }
                break;
            }
            v3 /* !! */  = (long)of.mbgs("mboz", mbgp(int ), (int)110);
        }
        if (var1_3 || var1_3) return;
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_2 = of.uz - of.mbgs("mbpa", mbgw(int ), (int)101)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == of.mbgs("mbpb", mbgp(int ), (int)111)) break;
            v4 /* !! */  = (long)of.mbgs("mbpc", mbgp(int ), (int)112);
        }
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_3 = of.uz - of.mbgs("mbpd", mbgw(int ), (int)102)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == of.mbgs("mbpe", mbgp(int ), (int)113)) break;
            v5 /* !! */  = (long)of.mbgs("mbpf", mbgp(int ), (int)114);
        }
        v6 = (BiConsumer<String, od>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, lambda$cleanupAll$2(java.lang.String ruhack.phobia.od ), (Ljava/lang/String;Lruhack/phobia/od;)V)();
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_4 = of.uz - of.mbgs("mbpg", mbgw(int ), (int)103)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v7 /* !! */  == of.mbgs("mbph", mbgp(int ), (int)115)) {
                this.scripts.forEach(v6);
                if (var1_3) return;
                break;
            }
            v7 /* !! */  = (long)of.mbgs("mbpi", mbgp(int ), (int)116);
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block24: do {
            switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                default: lbl-1000:
                // 2 sources

                {
                    if (!var1_3) return;
                    return;
                }
                case 2: {
                    var2_2 /* !! */  = (int)of.mbgs("mbpl", mbgp(int ), (int)119);
                    if (!var3_1) ** break;
                    throw null;
                }
                case 3: {
                    var2_2 /* !! */  = (int)of.mbgs("mbpm", mbgp(int ), (int)120);
                    cfr_temp_0 = 1;
                    if (!var3_1) continue block24;
                    throw null;
                }
                case 4: {
                    var2_2 /* !! */  = (int)of.mbgs("mbpn", mbgp(int ), (int)121);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 0: {
                    ** GOTO lbl82
                }
                case 5: {
                    var2_2 /* !! */  = (int)of.mbgs("mbpo", mbgp(int ), (int)122);
                    if (var3_1) {
                        throw null;
                    }
lbl82:
                    // 3 sources

                    var2_2 /* !! */  = (int)of.mbgs("mbpj", mbgp(int ), (int)117);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 1: 
            }
            break;
        } while (true);
        do {
            var2_2 /* !! */  = (int)of.mbgs("mbpk", mbgp(int ), (int)118);
        } while (!var3_1);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public Set<String> getAllScriptNames() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = of.uz - of.mbgs("mbto", mbgw(int ), (int)153)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == of.mbgs("mbtp", mbgp(int ), (int)177)) break;
            v0 /* !! */  = (long)of.mbgs("mbtq", mbgp(int ), (int)178);
        }
        var3_1 = of.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = of.uz - of.mbgs("mbtr", mbgw(int ), (int)154)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == of.mbgs("mbts", mbgp(int ), (int)179)) break;
            v1 /* !! */  = (long)of.mbgs("mbtt", mbgp(int ), (int)180);
        }
        var2_2 /* !! */  = of.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = of.uz - of.mbgs("mbtu", mbgw(int ), (int)155)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == of.mbgs("mbtv", mbgp(int ), (int)181)) break;
            v2 /* !! */  = (long)of.mbgs("mbtw", mbgp(int ), (int)182);
        }
        var1_3 = of.a;
        if (var3_1) {
            throw null;
lbl21:
            // 1 sources

            return null;
        }
        ** while (var1_3 || var1_3)
lbl24:
        // 1 sources

        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_3 = of.uz - of.mbgs("mbtx", mbgw(int ), (int)156)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == of.mbgs("mbty", mbgp(int ), (int)183)) break;
                    v3 /* !! */  = (long)of.mbgs("mbtz", mbgp(int ), (int)184);
                }
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_4 = of.uz - of.mbgs("mbua", mbgw(int ), (int)157)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == of.mbgs("mbub", mbgp(int ), (int)185)) break;
                    v4 /* !! */  = (long)of.mbgs("mbuc", mbgp(int ), (int)186);
                }
                v5 = this.scripts.keySet();
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_5 = of.uz - of.mbgs("mbud", mbgw(int ), (int)158)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == of.mbgs("mbue", mbgp(int ), (int)187)) break;
                    v6 /* !! */  = (long)of.mbgs("mbuf", mbgp(int ), (int)188);
                }
                return Collections.unmodifiableSet(v5);
            }
            case 0: {
                var2_2 /* !! */  = (int)of.mbgs("mbug", mbgp(int ), (int)189);
                if (!var3_1) break;
                throw null;
            }
            case 1: {
                do {
                    var2_2 /* !! */  = (int)of.mbgs("mbuh", mbgp(int ), (int)190);
                } while (!var3_1);
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)of.mbgs("mbui", mbgp(int ), (int)191);
                if (!var3_1) break;
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)of.mbgs("mbuj", mbgp(int ), (int)192);
        } while (!var3_1);
        throw null;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ Boolean lambda$updateScript$3() {
        while (true) {
            long l2;
            Object object;
            if ((object = (l2 = uz - of.mbgs("mbwy", mbgw(int ), (int)191)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object == of.mbgs("mbwz", mbgp(int ), (int)227)) break;
            object = of.mbgs("mbxa", mbgp(int ), (int)228);
        }
        boolean bl2 = c;
        while (true) {
            long l3;
            Object object;
            if ((object = (l3 = uz - of.mbgs("mbxb", mbgw(int ), (int)192)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object == of.mbgs("mbxc", mbgp(int ), (int)229)) break;
            object = of.mbgs("mbxd", mbgp(int ), (int)230);
        }
        int n2 = b;
        Object object = uz;
        block6: while (true) {
            switch ((int)object) {
                case -1128708728: {
                    object = of.mbgs("mbxf", mbgw(int ), (int)194) - of.mbgs("mbxe", mbgw(int ), (int)193);
                    continue block6;
                }
                case 1172075565: {
                    break block6;
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
        CallSite callSite = of.mbgs("mbxg", mbgp(int ), (int)231);
        while (true) {
            long l4;
            Object object2;
            if ((object2 = (l4 = uz - of.mbgs("mbxh", mbgw(int ), (int)195)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            if (object2 == of.mbgs("mbxi", mbgp(int ), (int)232)) {
                return (boolean)callSite;
            }
            object2 = of.mbgs("mbxj", mbgp(int ), (int)233);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public of() {
        var2_1 /* !! */  = of.b;
        super();
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.scripts = new ConcurrentHashMap<String, od>();
                return;
            }
            case 0: {
                while (true) {
                    var2_1 /* !! */  = (int)of.mbgs("mbgt", mbgp(int ), (int)0);
                }
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)of.mbgs("mbgu", mbgp(int ), (int)1);
                    break;
                }
            }
            case 2: 
        }
        var2_1 /* !! */  = (int)of.mbgs("mbgv", mbgp(int ), (int)2);
        ** while (true)
    }

    private static /* synthetic */ void mbzu() {
        of.mbgr[0] = -1965011880;
        of.mbgr[1] = 1924896895;
        of.mbgr[2] = -1880214002;
        of.mbgr[3] = 1495697677;
        of.mbgr[4] = -1553234301;
        of.mbgr[5] = -2092146193;
        of.mbgr[6] = 2112125415;
        of.mbgr[7] = 1370241412;
        of.mbgr[8] = 286791202;
        of.mbgr[9] = 1076168044;
        of.mbgr[10] = 422693280;
        of.mbgr[11] = -995438063;
        of.mbgr[12] = -890422300;
        of.mbgr[13] = 842734817;
        of.mbgr[14] = -1383330164;
        of.mbgr[15] = -1998817551;
        of.mbgr[16] = -1421680548;
        of.mbgr[17] = 1509934940;
        of.mbgr[18] = 540628867;
        of.mbgr[19] = -745528431;
        of.mbgr[20] = 1188419458;
        of.mbgr[21] = 1674783985;
        of.mbgr[22] = -676268875;
        of.mbgr[23] = 1988657170;
        of.mbgr[24] = -679726194;
        of.mbgr[25] = 1425376433;
        of.mbgr[26] = -1643020482;
        of.mbgr[27] = -1313689344;
        of.mbgr[28] = -336408460;
        of.mbgr[29] = 264883351;
        of.mbgr[30] = -1501802114;
        of.mbgr[31] = -949827787;
        of.mbgr[32] = -2055597994;
        of.mbgr[33] = -403628711;
        of.mbgr[34] = -768049682;
        of.mbgr[35] = 1387007049;
        of.mbgr[36] = -755251024;
        of.mbgr[37] = -1343221507;
        of.mbgr[38] = 882961601;
        of.mbgr[39] = -2072091700;
        of.mbgr[40] = -1130524233;
        of.mbgr[41] = 753606936;
        of.mbgr[42] = 696561039;
        of.mbgr[43] = 69717637;
        of.mbgr[44] = -1075501140;
        of.mbgr[45] = -364738413;
        of.mbgr[46] = -824894425;
        of.mbgr[47] = -785132992;
        of.mbgr[48] = -389566355;
        of.mbgr[49] = -1270379312;
        of.mbgr[50] = -1612582794;
        of.mbgr[51] = 396191825;
        of.mbgr[52] = 2096065513;
        of.mbgr[53] = -165124322;
        of.mbgr[54] = 1509405185;
        of.mbgr[55] = -1899575129;
        of.mbgr[56] = -1813573554;
        of.mbgr[57] = 154469377;
        of.mbgr[58] = -1987282536;
        of.mbgr[59] = -1061798711;
        of.mbgr[60] = -1249042326;
        of.mbgr[61] = -390978484;
        of.mbgr[62] = 1943385412;
        of.mbgr[63] = -1646950385;
        of.mbgr[64] = -752858734;
        of.mbgr[65] = 1253712237;
        of.mbgr[66] = 515993998;
        of.mbgr[67] = 9769874;
        of.mbgr[68] = -235343355;
        of.mbgr[69] = -844137886;
        of.mbgr[70] = -1047073413;
        of.mbgr[71] = 1785321861;
        of.mbgr[72] = -1085266607;
        of.mbgr[73] = -939036481;
        of.mbgr[74] = 1109961119;
        of.mbgr[75] = -211919707;
        of.mbgr[76] = -2120884015;
        of.mbgr[77] = -1713909014;
        of.mbgr[78] = -277762222;
        of.mbgr[79] = 1482435599;
        of.mbgr[80] = 1582078164;
        of.mbgr[81] = -100845317;
        of.mbgr[82] = 989044103;
        of.mbgr[83] = -1847783882;
        of.mbgr[84] = -732646121;
        of.mbgr[85] = 1092399132;
        of.mbgr[86] = 833716589;
        of.mbgr[87] = -1459677017;
        of.mbgr[88] = 128433987;
        of.mbgr[89] = 197611751;
        of.mbgr[90] = 1497501912;
        of.mbgr[91] = -85141009;
        of.mbgr[92] = -89991923;
        of.mbgr[93] = -847517375;
        of.mbgr[94] = 417949606;
        of.mbgr[95] = -1634237652;
        of.mbgr[96] = 315575609;
        of.mbgr[97] = 773723071;
        of.mbgr[98] = 692446183;
        of.mbgr[99] = 505334228;
    }

    public static /* synthetic */ CallSite mbgs(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void updateScript(String var1_1, Supplier<Boolean> var2_2) {
        block52: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = of.uz - of.mbgs("mbre", mbgw(int ), (int)125)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  == of.mbgs("mbrf", mbgp(int ), (int)143)) break;
                v0 /* !! */  = (long)of.mbgs("mbrg", mbgp(int ), (int)144);
            }
            var5_3 = of.c;
            v1 /* !! */  = of.uz;
            if (true) ** GOTO lbl11
            block33: while (true) {
                v1 /* !! */  = (long)(v2 - of.mbgs("mbrh", mbgw(int ), (int)126));
lbl11:
                // 2 sources

                switch ((int)v1 /* !! */ ) {
                    case -2067866540: {
                        v2 = of.mbgs("mbri", mbgw(int ), (int)127);
                        continue block33;
                    }
                    case -735771336: {
                        v2 = of.mbgs("mbrj", mbgw(int ), (int)128);
                        continue block33;
                    }
                    case 1172075565: {
                        break block33;
                    }
                    case 1468021308: {
                        v2 = of.mbgs("mbrk", mbgw(int ), (int)129);
                        continue block33;
                    }
                }
                break;
            }
            var4_4 /* !! */  = of.b;
            while (true) {
                if ((v3 /* !! */  = (cfr_temp_1 = of.uz - of.mbgs("mbrl", mbgw(int ), (int)130)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v3 /* !! */  == of.mbgs("mbrm", mbgp(int ), (int)145)) break;
                v3 /* !! */  = (long)of.mbgs("mbrn", mbgp(int ), (int)146);
            }
            var3_5 = of.a;
            if (var5_3) {
                throw null;
lbl32:
                // 5 sources

                return;
            }
            if (var3_5 || var3_5) ** GOTO lbl32
            v4 /* !! */  = of.uz;
            if (true) ** GOTO lbl39
            block36: while (true) {
                v4 /* !! */  = (long)(v5 - of.mbgs("mbro", mbgw(int ), (int)131));
lbl39:
                // 2 sources

                switch ((int)v4 /* !! */ ) {
                    case -1245096312: {
                        v5 = of.mbgs("mbrp", mbgw(int ), (int)132);
                        continue block36;
                    }
                    case 1172075565: {
                        break block36;
                    }
                    case 1225446062: {
                        v5 = of.mbgs("mbrq", mbgw(int ), (int)133);
                        continue block36;
                    }
                }
                break;
            }
            v6 /* !! */  = of.uz;
            if (true) ** GOTO lbl52
            block37: while (true) {
                v6 /* !! */  = (long)(of.mbgs("mbrs", mbgw(int ), (int)135) - of.mbgs("mbrr", mbgw(int ), (int)134));
lbl52:
                // 2 sources

                switch ((int)v6 /* !! */ ) {
                    case 1172075565: {
                        break block37;
                    }
                    case 1257445863: {
                        continue block37;
                    }
                }
                break;
            }
            if (!var2_2.get().booleanValue()) break block52;
            if (var3_5) ** GOTO lbl32
            while (true) {
                if ((v7 /* !! */  = (cfr_temp_2 = of.uz - of.mbgs("mbrt", mbgw(int ), (int)136)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v7 /* !! */  == of.mbgs("mbru", mbgp(int ), (int)147)) break;
                v7 /* !! */  = (long)of.mbgs("mbrv", mbgp(int ), (int)148);
            }
            if (this.isNullOrEmpty(var1_1)) break block52;
            if (var3_5 || var3_5) ** GOTO lbl32
            while (true) {
                if ((v8 /* !! */  = (cfr_temp_3 = of.uz - of.mbgs("mbrw", mbgw(int ), (int)137)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v8 /* !! */  == of.mbgs("mbrx", mbgp(int ), (int)149)) break;
                v8 /* !! */  = (long)of.mbgs("mbry", mbgp(int ), (int)150);
            }
            while (true) {
                if ((v9 /* !! */  = (cfr_temp_4 = of.uz - of.mbgs("mbrz", mbgw(int ), (int)138)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                if (v9 /* !! */  == of.mbgs("mbsa", mbgp(int ), (int)151)) break;
                v9 /* !! */  = (long)of.mbgs("mbsb", mbgp(int ), (int)152);
            }
            v10 = (BiFunction<String, od, od>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;, lambda$updateScript$4(java.lang.String ruhack.phobia.od ), (Ljava/lang/String;Lruhack/phobia/od;)Lruhack/phobia/od;)();
            v11 /* !! */  = of.uz;
            if (true) ** GOTO lbl81
            block41: while (true) {
                v11 /* !! */  = (long)(v12 - of.mbgs("mbsc", mbgw(int ), (int)139));
lbl81:
                // 2 sources

                switch ((int)v11 /* !! */ ) {
                    case -448323738: {
                        v12 = of.mbgs("mbsd", mbgw(int ), (int)140);
                        continue block41;
                    }
                    case -285182141: {
                        v12 = of.mbgs("mbse", mbgw(int ), (int)141);
                        continue block41;
                    }
                    case 1172075565: {
                        break block41;
                    }
                }
                break;
            }
            this.scripts.computeIfPresent(var1_1, v10);
            if (var3_5) ** GOTO lbl32
        }
        if (var4_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var3_5 && !var3_5) ** break;
                ** continue;
                return;
            }
lbl100:
            // 2 sources

            case 0: {
                var4_4 /* !! */  = (int)of.mbgs("mbsf", mbgp(int ), (int)153);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl128
            }
lbl105:
            // 2 sources

            case 1: {
                var4_4 /* !! */  = (int)of.mbgs("mbsg", mbgp(int ), (int)154);
                if (!var5_3) ** GOTO lbl100
                throw null;
            }
            case 2: {
                var4_4 /* !! */  = (int)of.mbgs("mbsh", mbgp(int ), (int)155);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl128
            }
lbl114:
            // 3 sources

            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_4 /* !! */  = (int)of.mbgs("mbsi", mbgp(int ), (int)156);
                    if (!var5_3) ** GOTO lbl105
                    throw null;
                }
            }
lbl119:
            // 2 sources

            case 4: {
                var4_4 /* !! */  = (int)of.mbgs("mbsj", mbgp(int ), (int)157);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl132
            }
            case 5: {
                var4_4 /* !! */  = (int)of.mbgs("mbsk", mbgp(int ), (int)158);
                if (!var5_3) ** GOTO lbl114
                throw null;
            }
lbl128:
            // 3 sources

            case 6: {
                var4_4 /* !! */  = (int)of.mbgs("mbsl", mbgp(int ), (int)159);
                if (!var5_3) ** GOTO lbl114
                throw null;
            }
lbl132:
            // 2 sources

            case 7: {
                var4_4 /* !! */  = (int)of.mbgs("mbsm", mbgp(int ), (int)160);
                if (!var5_3) ** GOTO lbl119
                throw null;
            }
            case 8: {
                do {
                    var4_4 /* !! */  = (int)of.mbgs("mbsn", mbgp(int ), (int)161);
                } while (!var5_3);
                throw null;
            }
            case 9: 
        }
        var4_4 /* !! */  = (int)of.mbgs("mbso", mbgp(int ), (int)162);
        ** while (!var5_3)
lbl144:
        // 1 sources

        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ void lambda$cleanupAll$2(String var0, od var1_1) {
        block17: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_1 = of.uz - of.mbgs("mbxo", mbgw(int ), (int)196)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  == of.mbgs("mbxp", mbgp(int ), (int)238)) break;
                v0 /* !! */  = (long)of.mbgs("mbxq", mbgp(int ), (int)239);
            }
            var4_2 = of.c;
            while (true) {
                if ((v1 /* !! */  = (cfr_temp_2 = of.uz - of.mbgs("mbxr", mbgw(int ), (int)197)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v1 /* !! */  == of.mbgs("mbxs", mbgp(int ), (int)240)) break;
                v1 /* !! */  = (long)of.mbgs("mbxt", mbgp(int ), (int)241);
            }
            var3_3 /* !! */  = of.b;
            while (true) {
                if ((v2 /* !! */  = (cfr_temp_3 = of.uz - of.mbgs("mbxu", mbgw(int ), (int)198)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v2 /* !! */  == of.mbgs("mbxv", mbgp(int ), (int)242)) {
                    var2_4 = of.a;
                    if (var4_2) {
                        throw null;
                    }
                    break;
                }
                v2 /* !! */  = (long)of.mbgs("mbxw", mbgp(int ), (int)243);
            }
            if (var2_4 || var2_4) return;
            if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
            cfr_temp_0 = -2147483648;
            block10: do {
                switch (cfr_temp_0 == -2147483648 ? var3_3 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        while (true) {
                            if ((v3 /* !! */  = (cfr_temp_4 = of.uz - of.mbgs("mbxx", mbgw(int ), (int)199)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                            if (v3 /* !! */  == of.mbgs("mbxy", mbgp(int ), (int)244)) {
                                var1_1.cleanup();
                                if (!var2_4) return;
                            }
                            ** GOTO lbl35
                            return;
lbl35:
                            // 1 sources

                            v3 /* !! */  = (long)of.mbgs("mbxz", mbgp(int ), (int)245);
                        }
                    }
                    case 0: {
                        ** break;
                    }
                    case 2: {
                        var3_3 /* !! */  = (int)of.mbgs("mbyc", mbgp(int ), (int)248);
                        cfr_temp_0 = 3;
                        if (!var4_2) continue block10;
                        throw null;
                    }
                    case 4: {
                        break block17;
                    }
lbl46:
                    // 2 sources

                    while (true) {
                        var3_3 /* !! */  = (int)of.mbgs("mbya", mbgp(int ), (int)246);
                        cfr_temp_0 = 1;
                        if (!var4_2) continue block10;
                        throw null;
                    }
                    case 1: {
                        var3_3 /* !! */  = (int)of.mbgs("mbyb", mbgp(int ), (int)247);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 3: 
                }
                break;
            } while (true);
            var3_3 /* !! */  = (int)of.mbgs("mbyd", mbgp(int ), (int)249);
            if (!var4_2) ** break;
            throw null;
        }
        var3_3 /* !! */  = (int)of.mbgs("mbye", mbgp(int ), (int)250);
        ** while (!var4_2)
lbl64:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean finished(String var1_1) {
        block57: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = of.uz - of.mbgs("mbkw", mbgw(int ), (int)50)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  == of.mbgs("mbkx", mbgp(int ), (int)54)) break;
                v0 /* !! */  = (long)of.mbgs("mbky", mbgp(int ), (int)55);
            }
            var4_2 = of.c;
            v1 /* !! */  = of.uz;
            if (true) ** GOTO lbl11
            block38: while (true) {
                v1 /* !! */  = (long)(v2 - of.mbgs("mbkz", mbgw(int ), (int)51));
lbl11:
                // 2 sources

                switch ((int)v1 /* !! */ ) {
                    case -1803738178: {
                        v2 = of.mbgs("mbla", mbgw(int ), (int)52);
                        continue block38;
                    }
                    case -66105011: {
                        v2 = of.mbgs("mblb", mbgw(int ), (int)53);
                        continue block38;
                    }
                    case 1172075565: {
                        break block38;
                    }
                }
                break;
            }
            var3_3 /* !! */  = of.b;
            v3 /* !! */  = of.uz;
            if (true) ** GOTO lbl25
            block39: while (true) {
                v3 /* !! */  = (long)(v4 - of.mbgs("mblc", mbgw(int ), (int)54));
lbl25:
                // 2 sources

                switch ((int)v3 /* !! */ ) {
                    case -1083725811: {
                        v4 = of.mbgs("mbld", mbgw(int ), (int)55);
                        continue block39;
                    }
                    case -745755629: {
                        v4 = of.mbgs("mble", mbgw(int ), (int)56);
                        continue block39;
                    }
                    case -136176611: {
                        v4 = of.mbgs("mblf", mbgw(int ), (int)57);
                        continue block39;
                    }
                    case 1172075565: {
                        break block39;
                    }
                }
                break;
            }
            var2_4 = of.a;
            if (var4_2) {
                throw null;
lbl40:
                // 5 sources

                return (boolean)of.mbgs("mblg", mbgp(int ), (int)56);
            }
            if (var2_4 || var2_4) ** GOTO lbl40
            v5 /* !! */  = of.uz;
            if (true) ** GOTO lbl47
            block41: while (true) {
                v5 /* !! */  = (long)(v6 - of.mbgs("mblh", mbgw(int ), (int)58));
lbl47:
                // 2 sources

                switch ((int)v5 /* !! */ ) {
                    case 1172075565: {
                        break block41;
                    }
                    case 1672528428: {
                        v6 = of.mbgs("mbli", mbgw(int ), (int)59);
                        continue block41;
                    }
                    case 1719205408: {
                        v6 = of.mbgs("mblj", mbgw(int ), (int)60);
                        continue block41;
                    }
                }
                break;
            }
            if (this.isNullOrEmpty(var1_1)) break block57;
            if (var2_4) ** GOTO lbl40
            while (true) {
                if ((v7 /* !! */  = (cfr_temp_1 = of.uz - of.mbgs("mblk", mbgw(int ), (int)61)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v7 /* !! */  == of.mbgs("mbll", mbgp(int ), (int)57)) break;
                v7 /* !! */  = (long)of.mbgs("mblm", mbgp(int ), (int)58);
            }
            v8 = this.getScript(var1_1);
            while (true) {
                if ((v9 /* !! */  = (cfr_temp_2 = of.uz - of.mbgs("mbln", mbgw(int ), (int)62)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v9 /* !! */  == of.mbgs("mblo", mbgp(int ), (int)59)) break;
                v9 /* !! */  = (long)of.mbgs("mblp", mbgp(int ), (int)60);
            }
            if (!v8.isPresent()) break block57;
            if (var2_4) ** GOTO lbl40
            v10 /* !! */  = of.uz;
            if (true) ** GOTO lbl75
            block44: while (true) {
                v10 /* !! */  = (long)(v11 - of.mbgs("mblq", mbgw(int ), (int)63));
lbl75:
                // 2 sources

                switch ((int)v10 /* !! */ ) {
                    case 494147571: {
                        v11 = of.mbgs("mblr", mbgw(int ), (int)64);
                        continue block44;
                    }
                    case 1172075565: {
                        break block44;
                    }
                    case 1827133228: {
                        v11 = of.mbgs("mbls", mbgw(int ), (int)65);
                        continue block44;
                    }
                }
                break;
            }
            v12 = this.getScript(var1_1);
            while (true) {
                if ((v13 /* !! */  = (cfr_temp_3 = of.uz - of.mbgs("mblt", mbgw(int ), (int)66)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v13 /* !! */  == of.mbgs("mblu", mbgp(int ), (int)61)) break;
                v13 /* !! */  = (long)of.mbgs("mblv", mbgp(int ), (int)62);
            }
            v14 /* !! */  = of.uz;
            if (true) ** GOTO lbl94
            block46: while (true) {
                v14 /* !! */  = (long)(of.mbgs("mblx", mbgw(int ), (int)68) - of.mbgs("mblw", mbgw(int ), (int)67));
lbl94:
                // 2 sources

                switch ((int)v14 /* !! */ ) {
                    case 1156150104: {
                        continue block46;
                    }
                    case 1172075565: {
                        break block46;
                    }
                }
                break;
            }
            if (!v12.get().isFinished()) break block57;
            if (var2_4) ** GOTO lbl40
            v15 = of.mbgs("mbly", mbgp(int ), (int)63);
            if (var4_2) {
                throw null;
            }
            ** GOTO lbl112
        }
        if (!var2_4 && !var2_4) ** break;
        ** while (true)
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v15 = of.mbgs("mblz", mbgp(int ), (int)64);
lbl112:
                // 2 sources

                return (boolean)v15;
            }
            case 0: {
                do {
                    var3_3 /* !! */  = (int)of.mbgs("mbma", mbgp(int ), (int)65);
                } while (!var4_2);
                throw null;
            }
lbl118:
            // 2 sources

            case 1: {
                var3_3 /* !! */  = (int)of.mbgs("mbmb", mbgp(int ), (int)66);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl132
            }
lbl123:
            // 2 sources

            case 2: {
                var3_3 /* !! */  = (int)of.mbgs("mbmc", mbgp(int ), (int)67);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl140
            }
            case 3: {
                var3_3 /* !! */  = (int)of.mbgs("mbmd", mbgp(int ), (int)68);
                if (var4_2) {
                    throw null;
                }
            }
lbl132:
            // 4 sources

            case 4: {
                var3_3 /* !! */  = (int)of.mbgs("mbme", mbgp(int ), (int)69);
                if (!var4_2) ** GOTO lbl123
                throw null;
            }
            case 5: {
                var3_3 /* !! */  = (int)of.mbgs("mbmf", mbgp(int ), (int)70);
                if (!var4_2) ** GOTO lbl118
                throw null;
            }
lbl140:
            // 3 sources

            case 6: {
                var3_3 /* !! */  = (int)of.mbgs("mbmg", mbgp(int ), (int)71);
                if (!var4_2) break;
                throw null;
            }
            case 7: {
                var3_3 /* !! */  = (int)of.mbgs("mbmh", mbgp(int ), (int)72);
                if (!var4_2) ** GOTO lbl140
                throw null;
            }
            case 8: {
                var3_3 /* !! */  = (int)of.mbgs("mbmi", mbgp(int ), (int)73);
                if (!var4_2) break;
                throw null;
            }
            case 9: 
        }
        do {
            var3_3 /* !! */  = (int)of.mbgs("mbmj", mbgp(int ), (int)74);
        } while (!var4_2);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public Map<String, od> getAllScripts() {
        v0 /* !! */  = of.uz;
        if (true) ** GOTO lbl5
        block17: while (true) {
            v0 /* !! */  = (long)(v1 - of.mbgs("mbuk", mbgw(int ), (int)159));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1095539212: {
                    v1 = of.mbgs("mbul", mbgw(int ), (int)160);
                    continue block17;
                }
                case -458221748: {
                    v1 = of.mbgs("mbum", mbgw(int ), (int)161);
                    continue block17;
                }
                case 1172075565: {
                    break block17;
                }
            }
            break;
        }
        var3_1 = of.c;
        v2 /* !! */  = of.uz;
        if (true) ** GOTO lbl19
        block18: while (true) {
            v2 /* !! */  = (long)(v3 - of.mbgs("mbun", mbgw(int ), (int)162));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1751187928: {
                    v3 = of.mbgs("mbuo", mbgw(int ), (int)163);
                    continue block18;
                }
                case 517467610: {
                    v3 = of.mbgs("mbup", mbgw(int ), (int)164);
                    continue block18;
                }
                case 778556863: {
                    v3 = of.mbgs("mbuq", mbgw(int ), (int)165);
                    continue block18;
                }
                case 1172075565: {
                    break block18;
                }
            }
            break;
        }
        var2_2 /* !! */  = of.b;
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_0 = of.uz - of.mbgs("mbur", mbgw(int ), (int)166)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v4 /* !! */  == of.mbgs("mbus", mbgp(int ), (int)193)) break;
            v4 /* !! */  = (long)of.mbgs("mbut", mbgp(int ), (int)194);
        }
        var1_3 = of.a;
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
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = of.uz - of.mbgs("mbuu", mbgw(int ), (int)167)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == of.mbgs("mbuv", mbgp(int ), (int)195)) break;
                    v5 /* !! */  = (long)of.mbgs("mbuw", mbgp(int ), (int)196);
                }
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_2 = of.uz - of.mbgs("mbux", mbgw(int ), (int)168)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v6 /* !! */  == of.mbgs("mbuy", mbgp(int ), (int)197)) break;
                    v6 /* !! */  = (long)of.mbgs("mbuz", mbgp(int ), (int)198);
                }
                return Collections.unmodifiableMap(this.scripts);
            }
            case 0: {
                var2_2 /* !! */  = (int)of.mbgs("mbva", mbgp(int ), (int)199);
                if (var3_1) {
                    throw null;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)of.mbgs("mbvb", mbgp(int ), (int)200);
                if (!var3_1) break;
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)of.mbgs("mbvc", mbgp(int ), (int)201);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)of.mbgs("mbvd", mbgp(int ), (int)202);
        ** while (!var3_1)
lbl76:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ od lambda$updateScript$4(String var0, od var1_1) {
        v0 /* !! */  = of.uz;
        if (true) ** GOTO lbl5
        block16: while (true) {
            v0 /* !! */  = (long)(of.mbgs("mbwj", mbgw(int ), (int)186) - of.mbgs("mbwi", mbgw(int ), (int)185));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 1172075565: {
                    break block16;
                }
                case 1353769218: {
                    continue block16;
                }
            }
            break;
        }
        var4_2 = of.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = of.uz - of.mbgs("mbwk", mbgw(int ), (int)187)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == of.mbgs("mbwl", mbgp(int ), (int)217)) break;
            v1 /* !! */  = (long)of.mbgs("mbwm", mbgp(int ), (int)218);
        }
        var3_3 /* !! */  = of.b;
        v2 /* !! */  = of.uz;
        if (true) ** GOTO lbl21
        block18: while (true) {
            v2 /* !! */  = (long)(of.mbgs("mbwo", mbgw(int ), (int)189) - of.mbgs("mbwn", mbgw(int ), (int)188));
lbl21:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -543692882: {
                    continue block18;
                }
                case 1172075565: {
                    break block18;
                }
            }
            break;
        }
        var2_4 = of.a;
        if (!var4_2) ** GOTO lbl33
        throw null;
lbl-1000:
        // 2 sources

        {
            if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
            switch (var3_3 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return null;
                }
lbl33:
                // 1 sources

                if (var2_4 || var2_4) ** GOTO lbl-1000
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_1 = of.uz - of.mbgs("mbwp", mbgw(int ), (int)190)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == of.mbgs("mbwq", mbgp(int ), (int)219)) break;
                    v3 /* !! */  = (long)of.mbgs("mbwr", mbgp(int ), (int)220);
                }
                var1_1.update();
                if (var2_4 || var2_4) continue block19;
                return var1_1;
lbl42:
                // 2 sources

                case 0: {
                    do {
                        var3_3 /* !! */  = (int)of.mbgs("mbws", mbgp(int ), (int)221);
                    } while (!var4_2);
                    throw null;
                }
lbl47:
                // 3 sources

                case 1: {
                    var3_3 /* !! */  = (int)of.mbgs("mbwt", mbgp(int ), (int)222);
                    if (!var4_2) break block19;
                    throw null;
                }
                case 2: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var3_3 /* !! */  = (int)of.mbgs("mbwu", mbgp(int ), (int)223);
                        if (!var4_2) ** GOTO lbl47
                        throw null;
                    }
                }
                case 3: {
                    var3_3 /* !! */  = (int)of.mbgs("mbwv", mbgp(int ), (int)224);
                    if (!var4_2) ** GOTO lbl42
                    throw null;
                }
                case 4: {
                    var3_3 /* !! */  = (int)of.mbgs("mbww", mbgp(int ), (int)225);
                    if (!var4_2) ** GOTO lbl47
                    throw null;
                }
                case 5: 
            }
        }
        var3_3 /* !! */  = (int)of.mbgs("mbwx", mbgp(int ), (int)226);
        ** while (!var4_2)
lbl67:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ int mbgp(int n2) {
        return mbgq[n2] ^ mbgr[n2];
    }

    private static /* synthetic */ long mbgw(int n2) {
        return mbgx[n2] ^ mbgy[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public od addScript(String var1_1, od var2_2) {
        v0 /* !! */  = of.uz;
        if (true) ** GOTO lbl5
        block38: while (true) {
            v0 /* !! */  = (long)(of.mbgs("mbih", mbgw(int ), (int)16) - of.mbgs("mbig", mbgw(int ), (int)15));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 953898809: {
                    continue block38;
                }
                case 1172075565: {
                    break block38;
                }
            }
            break;
        }
        var5_3 = of.c;
        v1 /* !! */  = of.uz;
        if (true) ** GOTO lbl15
        block39: while (true) {
            v1 /* !! */  = (long)(v2 - of.mbgs("mbii", mbgw(int ), (int)17));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -872194840: {
                    v2 = of.mbgs("mbij", mbgw(int ), (int)18);
                    continue block39;
                }
                case 1000207170: {
                    v2 = of.mbgs("mbik", mbgw(int ), (int)19);
                    continue block39;
                }
                case 1172075565: {
                    break block39;
                }
                case 1597156207: {
                    v2 = of.mbgs("mbil", mbgw(int ), (int)20);
                    continue block39;
                }
            }
            break;
        }
        var4_4 /* !! */  = of.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_0 = of.uz - of.mbgs("mbim", mbgw(int ), (int)21)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == of.mbgs("mbin", mbgp(int ), (int)21)) break;
            v3 /* !! */  = (long)of.mbgs("mbio", mbgp(int ), (int)22);
        }
        var3_5 = of.a;
        if (var5_3) {
            throw null;
lbl37:
            // 5 sources

            return null;
        }
        if (var4_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_5 || var3_5) ** GOTO lbl37
                v4 /* !! */  = of.uz;
                if (true) ** GOTO lbl47
                block42: while (true) {
                    v4 /* !! */  = (long)(v5 - of.mbgs("mbip", mbgw(int ), (int)22));
lbl47:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1740317482: {
                            v5 = of.mbgs("mbiq", mbgw(int ), (int)23);
                            continue block42;
                        }
                        case 808281570: {
                            v5 = of.mbgs("mbir", mbgw(int ), (int)24);
                            continue block42;
                        }
                        case 1172075565: {
                            break block42;
                        }
                    }
                    break;
                }
                if (this.isNullOrEmpty(var1_1)) ** GOTO lbl60
                if (var3_5) ** GOTO lbl37
                if (var2_2 != null) ** GOTO lbl87
                if (var3_5) ** GOTO lbl37
lbl60:
                // 2 sources

                if (var3_5 || var3_5) ** GOTO lbl37
                v6 /* !! */  = of.uz;
                if (true) ** GOTO lbl65
                block43: while (true) {
                    v6 /* !! */  = (long)(of.mbgs("mbit", mbgw(int ), (int)26) - of.mbgs("mbis", mbgw(int ), (int)25));
lbl65:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -913824611: {
                            continue block43;
                        }
                        case 1172075565: {
                            break block43;
                        }
                    }
                    break;
                }
                v7 /* !! */  = of.uz;
                if (true) ** GOTO lbl74
                block44: while (true) {
                    v7 /* !! */  = (long)(v8 - of.mbgs("mbiu", mbgw(int ), (int)27));
lbl74:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -1466669882: {
                            v8 = of.mbgs("mbiv", mbgw(int ), (int)28);
                            continue block44;
                        }
                        case -507871810: {
                            v8 = of.mbgs("mbiw", mbgw(int ), (int)29);
                            continue block44;
                        }
                        case 1172075565: {
                            break block44;
                        }
                        case 2074641513: {
                            v8 = of.mbgs("mbix", mbgw(int ), (int)30);
                            continue block44;
                        }
                    }
                    break;
                }
                throw new IllegalArgumentException("Script name or instance cannot be null or empty");
lbl87:
                // 1 sources

                if (!var3_5 && !var3_5) ** break;
                ** continue;
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_1 = of.uz - of.mbgs("mbiy", mbgw(int ), (int)31)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v9 /* !! */  == of.mbgs("mbiz", mbgp(int ), (int)23)) break;
                    v9 /* !! */  = (long)of.mbgs("mbja", mbgp(int ), (int)24);
                }
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_2 = of.uz - of.mbgs("mbjb", mbgw(int ), (int)32)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v10 /* !! */  == of.mbgs("mbjc", mbgp(int ), (int)25)) break;
                    v10 /* !! */  = (long)of.mbgs("mbjd", mbgp(int ), (int)26);
                }
                return this.scripts.put(var1_1, var2_2);
            }
lbl102:
            // 3 sources

            case 0: {
                var4_4 /* !! */  = (int)of.mbgs("mbje", mbgp(int ), (int)27);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl134
            }
lbl107:
            // 3 sources

            case 1: {
                var4_4 /* !! */  = (int)of.mbgs("mbjf", mbgp(int ), (int)28);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl116
            }
lbl112:
            // 2 sources

            case 2: {
                var4_4 /* !! */  = (int)of.mbgs("mbjg", mbgp(int ), (int)29);
                if (!var5_3) ** GOTO lbl107
                throw null;
            }
lbl116:
            // 3 sources

            case 3: {
                var4_4 /* !! */  = (int)of.mbgs("mbjh", mbgp(int ), (int)30);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl126
            }
            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_4 /* !! */  = (int)of.mbgs("mbji", mbgp(int ), (int)31);
                    if (!var5_3) ** GOTO lbl102
                    throw null;
                }
            }
lbl126:
            // 2 sources

            case 5: {
                var4_4 /* !! */  = (int)of.mbgs("mbjj", mbgp(int ), (int)32);
                if (!var5_3) ** GOTO lbl107
                throw null;
            }
lbl130:
            // 2 sources

            case 6: {
                var4_4 /* !! */  = (int)of.mbgs("mbjk", mbgp(int ), (int)33);
                if (!var5_3) ** GOTO lbl116
                throw null;
            }
lbl134:
            // 2 sources

            case 7: {
                var4_4 /* !! */  = (int)of.mbgs("mbjl", mbgp(int ), (int)34);
                if (!var5_3) ** GOTO lbl112
                throw null;
            }
            case 8: {
                var4_4 /* !! */  = (int)of.mbgs("mbjm", mbgp(int ), (int)35);
                if (!var5_3) ** GOTO lbl130
                throw null;
            }
            case 9: {
                var4_4 /* !! */  = (int)of.mbgs("mbjn", mbgp(int ), (int)36);
                if (!var5_3) ** GOTO lbl102
                throw null;
            }
            case 10: 
        }
        var4_4 /* !! */  = (int)of.mbgs("mbjo", mbgp(int ), (int)37);
        ** while (!var5_3)
lbl149:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void updateAll() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = of.uz - of.mbgs("mbsp", mbgw(int ), (int)142)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == of.mbgs("mbsq", mbgp(int ), (int)163)) break;
            v0 /* !! */  = (long)of.mbgs("mbsr", mbgp(int ), (int)164);
        }
        var3_1 = of.c;
        v1 /* !! */  = of.uz;
        if (true) ** GOTO lbl11
        block22: while (true) {
            v1 /* !! */  = (long)(of.mbgs("mbst", mbgw(int ), (int)144) - of.mbgs("mbss", mbgw(int ), (int)143));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -891786338: {
                    continue block22;
                }
                case 1172075565: {
                    break block22;
                }
            }
            break;
        }
        var2_2 /* !! */  = of.b;
        v2 /* !! */  = of.uz;
        if (true) ** GOTO lbl21
        block23: while (true) {
            v2 /* !! */  = (long)(of.mbgs("mbsv", mbgw(int ), (int)146) - of.mbgs("mbsu", mbgw(int ), (int)145));
lbl21:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1174846383: {
                    continue block23;
                }
                case 1172075565: {
                    break block23;
                }
            }
            break;
        }
        var1_3 = of.a;
        if (var3_1) {
            throw null;
lbl29:
            // 2 sources

            return;
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** GOTO lbl29
                v3 /* !! */  = of.uz;
                if (true) ** GOTO lbl39
                block25: while (true) {
                    v3 /* !! */  = (long)(v4 - of.mbgs("mbsw", mbgw(int ), (int)147));
lbl39:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1621995967: {
                            v4 = of.mbgs("mbsx", mbgw(int ), (int)148);
                            continue block25;
                        }
                        case 674348165: {
                            v4 = of.mbgs("mbsy", mbgw(int ), (int)149);
                            continue block25;
                        }
                        case 1172075565: {
                            break block25;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = of.uz - of.mbgs("mbsz", mbgw(int ), (int)150)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == of.mbgs("mbta", mbgp(int ), (int)165)) break;
                    v5 /* !! */  = (long)of.mbgs("mbtb", mbgp(int ), (int)166);
                }
                v6 = this.scripts.values();
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_2 = of.uz - of.mbgs("mbtc", mbgw(int ), (int)151)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == of.mbgs("mbtd", mbgp(int ), (int)167)) break;
                    v7 /* !! */  = (long)of.mbgs("mbte", mbgp(int ), (int)168);
                }
                v8 = (Consumer<od>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)V, update(), (Lruhack/phobia/od;)V)();
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_3 = of.uz - of.mbgs("mbtf", mbgw(int ), (int)152)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == of.mbgs("mbtg", mbgp(int ), (int)169)) break;
                    v9 /* !! */  = (long)of.mbgs("mbth", mbgp(int ), (int)170);
                }
                v6.forEach(v8);
                if (var1_3 || var1_3) ** continue;
                return;
            }
lbl68:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)of.mbgs("mbti", mbgp(int ), (int)171);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl81
            }
            case 1: {
                var2_2 /* !! */  = (int)of.mbgs("mbtj", mbgp(int ), (int)172);
                if (!var3_1) break;
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)of.mbgs("mbtk", mbgp(int ), (int)173);
                if (var3_1) {
                    throw null;
                }
            }
lbl81:
            // 4 sources

            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)of.mbgs("mbtl", mbgp(int ), (int)174);
                    if (!var3_1) ** GOTO lbl68
                    throw null;
                }
            }
            case 4: {
                do {
                    var2_2 /* !! */  = (int)of.mbgs("mbtm", mbgp(int ), (int)175);
                } while (!var3_1);
                throw null;
            }
            case 5: 
        }
        var2_2 /* !! */  = (int)of.mbgs("mbtn", mbgp(int ), (int)176);
        ** while (!var3_1)
lbl94:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void mbzv() {
        of.mbgr[100] = -2135748342;
        of.mbgr[101] = 1312730956;
        of.mbgr[102] = -1306483888;
        of.mbgr[103] = 1662787341;
        of.mbgr[104] = -663336312;
        of.mbgr[105] = 1049553028;
        of.mbgr[106] = -51791416;
        of.mbgr[107] = 236264112;
        of.mbgr[108] = -270653003;
        of.mbgr[109] = 899891752;
        of.mbgr[110] = -2014195489;
        of.mbgr[111] = -1326617714;
        of.mbgr[112] = 1251717499;
        of.mbgr[113] = 415086099;
        of.mbgr[114] = 257658269;
        of.mbgr[115] = -2098908832;
        of.mbgr[116] = -1104836544;
        of.mbgr[117] = -1476784800;
        of.mbgr[118] = -383686780;
        of.mbgr[119] = -244806413;
        of.mbgr[120] = 1021693947;
        of.mbgr[121] = -1805804542;
        of.mbgr[122] = -253061151;
        of.mbgr[123] = -816619720;
        of.mbgr[124] = -1603794292;
        of.mbgr[125] = 471623104;
        of.mbgr[126] = -351660778;
        of.mbgr[127] = -1715231640;
        of.mbgr[128] = -304892619;
        of.mbgr[129] = -956525641;
        of.mbgr[130] = 1332649777;
        of.mbgr[131] = 1126900867;
        of.mbgr[132] = 338337043;
        of.mbgr[133] = 1145628817;
        of.mbgr[134] = 859739379;
        of.mbgr[135] = -835674851;
        of.mbgr[136] = 1999065008;
        of.mbgr[137] = -1660827499;
        of.mbgr[138] = 2070849874;
        of.mbgr[139] = -1817390010;
        of.mbgr[140] = 1272514658;
        of.mbgr[141] = 529308132;
        of.mbgr[142] = -416183265;
        of.mbgr[143] = 841912624;
        of.mbgr[144] = 760560987;
        of.mbgr[145] = 1960700578;
        of.mbgr[146] = -1024448176;
        of.mbgr[147] = 1721186208;
        of.mbgr[148] = -418174317;
        of.mbgr[149] = 339832995;
        of.mbgr[150] = 1937933727;
        of.mbgr[151] = -1970449954;
        of.mbgr[152] = 716424300;
        of.mbgr[153] = 1011561129;
        of.mbgr[154] = 136570784;
        of.mbgr[155] = -1594980320;
        of.mbgr[156] = 2115691143;
        of.mbgr[157] = 380865484;
        of.mbgr[158] = 1261248307;
        of.mbgr[159] = -996087560;
        of.mbgr[160] = 52860180;
        of.mbgr[161] = -908979469;
        of.mbgr[162] = 396657253;
        of.mbgr[163] = -1910370742;
        of.mbgr[164] = 601325357;
        of.mbgr[165] = 1618966599;
        of.mbgr[166] = 1544556088;
        of.mbgr[167] = -2125350964;
        of.mbgr[168] = -857190679;
        of.mbgr[169] = -1890109683;
        of.mbgr[170] = -1203979068;
        of.mbgr[171] = -11091660;
        of.mbgr[172] = -1079355562;
        of.mbgr[173] = 824264440;
        of.mbgr[174] = -329119347;
        of.mbgr[175] = 385553853;
        of.mbgr[176] = -1129827895;
        of.mbgr[177] = -850114708;
        of.mbgr[178] = -135793116;
        of.mbgr[179] = 1596106570;
        of.mbgr[180] = -1155216063;
        of.mbgr[181] = -543874870;
        of.mbgr[182] = 479814000;
        of.mbgr[183] = -218222346;
        of.mbgr[184] = 269866906;
        of.mbgr[185] = 92577003;
        of.mbgr[186] = 1058649768;
        of.mbgr[187] = -930833529;
        of.mbgr[188] = 1083859237;
        of.mbgr[189] = -1601527237;
        of.mbgr[190] = 241151112;
        of.mbgr[191] = 1802331744;
        of.mbgr[192] = 411370785;
        of.mbgr[193] = -525063530;
        of.mbgr[194] = -1195753150;
        of.mbgr[195] = 265801164;
        of.mbgr[196] = -408579437;
        of.mbgr[197] = -90102453;
        of.mbgr[198] = 2122797133;
        of.mbgr[199] = -1367868455;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ od lambda$getScript$0(String var0) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = of.uz - of.mbgs("mbyx", mbgw(int ), (int)210)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == of.mbgs("mbyy", mbgp(int ), (int)259)) break;
            v0 /* !! */  = (long)of.mbgs("mbyz", mbgp(int ), (int)260);
        }
        var3_1 = of.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = of.uz - of.mbgs("mbza", mbgw(int ), (int)211)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == of.mbgs("mbzb", mbgp(int ), (int)261)) break;
            v1 /* !! */  = (long)of.mbgs("mbzc", mbgp(int ), (int)262);
        }
        var2_2 /* !! */  = of.b;
        v2 /* !! */  = of.uz;
        if (true) ** GOTO lbl19
        block14: while (true) {
            v2 /* !! */  = (long)(v3 - of.mbgs("mbzd", mbgw(int ), (int)212));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1525588586: {
                    v3 = of.mbgs("mbze", mbgw(int ), (int)213);
                    continue block14;
                }
                case -1186151045: {
                    v3 = of.mbgs("mbzf", mbgw(int ), (int)214);
                    continue block14;
                }
                case 1172075565: {
                    break block14;
                }
                case 1538256703: {
                    v3 = of.mbgs("mbzg", mbgw(int ), (int)215);
                    continue block14;
                }
            }
            break;
        }
        var1_3 = of.a;
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
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = of.uz - of.mbgs("mbzh", mbgw(int ), (int)216)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == of.mbgs("mbzi", mbgp(int ), (int)263)) break;
                    v4 /* !! */  = (long)of.mbgs("mbzj", mbgp(int ), (int)264);
                }
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_3 = of.uz - of.mbgs("mbzk", mbgw(int ), (int)217)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == of.mbgs("mbzl", mbgp(int ), (int)265)) break;
                    v5 /* !! */  = (long)of.mbgs("mbzm", mbgp(int ), (int)266);
                }
                return new od();
            }
lbl53:
            // 2 sources

            case 0: {
                do {
                    var2_2 /* !! */  = (int)of.mbgs("mbzn", mbgp(int ), (int)267);
                } while (!var3_1);
                throw null;
            }
            case 1: {
                do {
                    var2_2 /* !! */  = (int)of.mbgs("mbzo", mbgp(int ), (int)268);
                } while (!var3_1);
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)of.mbgs("mbzp", mbgp(int ), (int)269);
                    if (!var3_1) ** GOTO lbl53
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)of.mbgs("mbzq", mbgp(int ), (int)270);
        ** while (!var3_1)
lbl71:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void mcaa() {
        of.mbgy[0] = -719200185587647248L;
        of.mbgy[1] = 5233482247719593857L;
        of.mbgy[2] = 6130935716168825428L;
        of.mbgy[3] = -1084823069704998382L;
        of.mbgy[4] = -4654277570084661837L;
        of.mbgy[5] = -565383638336467300L;
        of.mbgy[6] = -4477386045287529201L;
        of.mbgy[7] = -6726735423140162398L;
        of.mbgy[8] = 7064120462169206514L;
        of.mbgy[9] = 332893257311678847L;
        of.mbgy[10] = -1909855607520070837L;
        of.mbgy[11] = -7638250480801178675L;
        of.mbgy[12] = 8323440922542719809L;
        of.mbgy[13] = -2821160808100783476L;
        of.mbgy[14] = -6041273184353705125L;
        of.mbgy[15] = -1161830468997010186L;
        of.mbgy[16] = 3073938741185861922L;
        of.mbgy[17] = 4548607818436013473L;
        of.mbgy[18] = 9149024513884693227L;
        of.mbgy[19] = -1684405463237609330L;
        of.mbgy[20] = -8145326651876455342L;
        of.mbgy[21] = 465055261425384855L;
        of.mbgy[22] = -5068469343419723223L;
        of.mbgy[23] = 4082473781059399620L;
        of.mbgy[24] = 4956647776034491978L;
        of.mbgy[25] = 2973814714741675036L;
        of.mbgy[26] = 8412391314269500892L;
        of.mbgy[27] = 8343145607984517172L;
        of.mbgy[28] = -7225499667432410590L;
        of.mbgy[29] = 8139682589544868220L;
        of.mbgy[30] = 7224324670878490499L;
        of.mbgy[31] = -6151724713928062525L;
        of.mbgy[32] = 6377225210602356440L;
        of.mbgy[33] = -7090623051416640436L;
        of.mbgy[34] = -948058588645067207L;
        of.mbgy[35] = 2155869357938821996L;
        of.mbgy[36] = 4930597453031910180L;
        of.mbgy[37] = 8111095104830876461L;
        of.mbgy[38] = 2329876766381403311L;
        of.mbgy[39] = 6649657605229459874L;
        of.mbgy[40] = 1951842105025517250L;
        of.mbgy[41] = -1290585358123483487L;
        of.mbgy[42] = -4696884452063158511L;
        of.mbgy[43] = -3691483357667624118L;
        of.mbgy[44] = 7942027989647399307L;
        of.mbgy[45] = -535919648747413798L;
        of.mbgy[46] = -6626114602985706792L;
        of.mbgy[47] = 6360047216860655868L;
        of.mbgy[48] = -2699360482948441124L;
        of.mbgy[49] = 1421278975406078837L;
        of.mbgy[50] = 2113880993590589913L;
        of.mbgy[51] = -5989619623431733308L;
        of.mbgy[52] = 3155020866340206750L;
        of.mbgy[53] = 5995189794147249689L;
        of.mbgy[54] = 9042613649788346804L;
        of.mbgy[55] = 8198239922238390419L;
        of.mbgy[56] = 8137606841892127439L;
        of.mbgy[57] = 7820108723767753841L;
        of.mbgy[58] = -3923348872316134365L;
        of.mbgy[59] = -8152012812715060697L;
        of.mbgy[60] = -7854831191078469912L;
        of.mbgy[61] = 8829892709808506713L;
        of.mbgy[62] = -8323508615680749593L;
        of.mbgy[63] = 117515013621340324L;
        of.mbgy[64] = -1470430571932122662L;
        of.mbgy[65] = -704598433586891855L;
        of.mbgy[66] = -4674309725750977329L;
        of.mbgy[67] = -7147933424986008321L;
        of.mbgy[68] = -104781391975622486L;
        of.mbgy[69] = 8541985899344326475L;
        of.mbgy[70] = -3039328414029391794L;
        of.mbgy[71] = -3589475376233450028L;
        of.mbgy[72] = 8927187491210003222L;
        of.mbgy[73] = -504345517030859299L;
        of.mbgy[74] = 6258924743184532718L;
        of.mbgy[75] = -6434062003179119602L;
        of.mbgy[76] = -4865111523415119811L;
        of.mbgy[77] = 2163735592095171711L;
        of.mbgy[78] = 3324085872945531326L;
        of.mbgy[79] = -4311626045050033296L;
        of.mbgy[80] = 994694461925411433L;
        of.mbgy[81] = 6029731580845496469L;
        of.mbgy[82] = 7683904854209427037L;
        of.mbgy[83] = -6927756167179115001L;
        of.mbgy[84] = -5111942277839177643L;
        of.mbgy[85] = 8972117679688261567L;
        of.mbgy[86] = 9166921356529062758L;
        of.mbgy[87] = -2370826529508658901L;
        of.mbgy[88] = 4311565305749318214L;
        of.mbgy[89] = -5925139136788771190L;
        of.mbgy[90] = 63211484715783247L;
        of.mbgy[91] = -1635764870006255318L;
        of.mbgy[92] = -245713008145031195L;
        of.mbgy[93] = -364381485305426569L;
        of.mbgy[94] = 7248554231574279005L;
        of.mbgy[95] = -2360220568946726767L;
        of.mbgy[96] = -6593848234328253229L;
        of.mbgy[97] = 4572100218788981340L;
        of.mbgy[98] = 7709329647325491400L;
        of.mbgy[99] = 7978121740891711325L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void cleanupScript(String var1_1) {
        block43: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = of.uz - of.mbgs("mbnn", mbgw(int ), (int)81)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  == of.mbgs("mbno", mbgp(int ), (int)92)) break;
                v0 /* !! */  = (long)of.mbgs("mbnp", mbgp(int ), (int)93);
            }
            var4_2 = of.c;
            while (true) {
                if ((v1 /* !! */  = (cfr_temp_1 = of.uz - of.mbgs("mbnq", mbgw(int ), (int)82)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v1 /* !! */  == of.mbgs("mbnr", mbgp(int ), (int)94)) break;
                v1 /* !! */  = (long)of.mbgs("mbns", mbgp(int ), (int)95);
            }
            var3_3 /* !! */  = of.b;
            v2 /* !! */  = of.uz;
            if (true) ** GOTO lbl17
            block28: while (true) {
                v2 /* !! */  = (long)(of.mbgs("mbnu", mbgw(int ), (int)84) - of.mbgs("mbnt", mbgw(int ), (int)83));
lbl17:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case -886445921: {
                        continue block28;
                    }
                    case 1172075565: {
                        break block28;
                    }
                }
                break;
            }
            var2_4 = of.a;
            if (var4_2) {
                throw null;
lbl25:
                // 4 sources

                return;
            }
            if (var2_4 || var2_4) ** GOTO lbl25
            v3 /* !! */  = of.uz;
            if (true) ** GOTO lbl32
            block30: while (true) {
                v3 /* !! */  = (long)(v4 - of.mbgs("mbnv", mbgw(int ), (int)85));
lbl32:
                // 2 sources

                switch ((int)v3 /* !! */ ) {
                    case 1098762913: {
                        v4 = of.mbgs("mbnw", mbgw(int ), (int)86);
                        continue block30;
                    }
                    case 1151240429: {
                        v4 = of.mbgs("mbnx", mbgw(int ), (int)87);
                        continue block30;
                    }
                    case 1172075565: {
                        break block30;
                    }
                }
                break;
            }
            if (this.isNullOrEmpty(var1_1)) break block43;
            if (var2_4 || var2_4) ** GOTO lbl25
            while (true) {
                if ((v5 /* !! */  = (cfr_temp_2 = of.uz - of.mbgs("mbny", mbgw(int ), (int)88)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v5 /* !! */  == of.mbgs("mbnz", mbgp(int ), (int)96)) break;
                v5 /* !! */  = (long)of.mbgs("mboa", mbgp(int ), (int)97);
            }
            v6 /* !! */  = of.uz;
            if (true) ** GOTO lbl52
            block32: while (true) {
                v6 /* !! */  = (long)(v7 - of.mbgs("mbob", mbgw(int ), (int)89));
lbl52:
                // 2 sources

                switch ((int)v6 /* !! */ ) {
                    case -116002047: {
                        v7 = of.mbgs("mboc", mbgw(int ), (int)90);
                        continue block32;
                    }
                    case 530934048: {
                        v7 = of.mbgs("mbod", mbgw(int ), (int)91);
                        continue block32;
                    }
                    case 1157477595: {
                        v7 = of.mbgs("mboe", mbgw(int ), (int)92);
                        continue block32;
                    }
                    case 1172075565: {
                        break block32;
                    }
                }
                break;
            }
            v8 = (BiFunction<String, od, od>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;, lambda$cleanupScript$1(java.lang.String ruhack.phobia.od ), (Ljava/lang/String;Lruhack/phobia/od;)Lruhack/phobia/od;)();
            while (true) {
                if ((v9 /* !! */  = (cfr_temp_3 = of.uz - of.mbgs("mbof", mbgw(int ), (int)93)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v9 /* !! */  == of.mbgs("mbog", mbgp(int ), (int)98)) break;
                v9 /* !! */  = (long)of.mbgs("mboh", mbgp(int ), (int)99);
            }
            this.scripts.computeIfPresent(var1_1, v8);
            if (var2_4) ** GOTO lbl25
        }
        if (!var2_4 && !var2_4) ** break;
        ** while (true)
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                return;
            }
            case 0: {
                var3_3 /* !! */  = (int)of.mbgs("mboi", mbgp(int ), (int)100);
                if (!var4_2) break;
                throw null;
            }
lbl83:
            // 2 sources

            case 1: {
                var3_3 /* !! */  = (int)of.mbgs("mboj", mbgp(int ), (int)101);
                if (var4_2) {
                    throw null;
                }
            }
            case 2: {
                var3_3 /* !! */  = (int)of.mbgs("mbok", mbgp(int ), (int)102);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl102
            }
            case 3: {
                var3_3 /* !! */  = (int)of.mbgs("mbol", mbgp(int ), (int)103);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl107
            }
lbl97:
            // 2 sources

            case 4: {
                var3_3 /* !! */  = (int)of.mbgs("mbom", mbgp(int ), (int)104);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl111
            }
lbl102:
            // 2 sources

            case 5: {
                do {
                    var3_3 /* !! */  = (int)of.mbgs("mbon", mbgp(int ), (int)105);
                } while (!var4_2);
                throw null;
            }
lbl107:
            // 2 sources

            case 6: {
                var3_3 /* !! */  = (int)of.mbgs("mboo", mbgp(int ), (int)106);
                if (!var4_2) ** GOTO lbl97
                throw null;
            }
lbl111:
            // 2 sources

            case 7: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)of.mbgs("mbop", mbgp(int ), (int)107);
                    if (!var4_2) ** GOTO lbl83
                    throw null;
                }
            }
            case 8: 
        }
        var3_3 /* !! */  = (int)of.mbgs("mboq", mbgp(int ), (int)108);
        ** while (!var4_2)
lbl119:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void mbzt() {
        of.mbgq[200] = -493770464;
        of.mbgq[201] = -1853106708;
        of.mbgq[202] = -87568469;
        of.mbgq[203] = 753897299;
        of.mbgq[204] = 312938857;
        of.mbgq[205] = -696209235;
        of.mbgq[206] = -1843088153;
        of.mbgq[207] = 764237156;
        of.mbgq[208] = -1606795916;
        of.mbgq[209] = 1071118296;
        of.mbgq[210] = 877495768;
        of.mbgq[211] = 1751189933;
        of.mbgq[212] = 1304026218;
        of.mbgq[213] = 1929309524;
        of.mbgq[214] = -36237966;
        of.mbgq[215] = 841999797;
        of.mbgq[216] = 2109916940;
        of.mbgq[217] = -2095654642;
        of.mbgq[218] = -1106098150;
        of.mbgq[219] = -1271304496;
        of.mbgq[220] = -1717067901;
        of.mbgq[221] = -356685712;
        of.mbgq[222] = 796373273;
        of.mbgq[223] = -333280266;
        of.mbgq[224] = 1873460466;
        of.mbgq[225] = -2049186385;
        of.mbgq[226] = 1935805659;
        of.mbgq[227] = -937325766;
        of.mbgq[228] = -619642660;
        of.mbgq[229] = 134532923;
        of.mbgq[230] = -1554289948;
        of.mbgq[231] = 840662741;
        of.mbgq[232] = -1084062813;
        of.mbgq[233] = 644546819;
        of.mbgq[234] = 37946473;
        of.mbgq[235] = 1210555779;
        of.mbgq[236] = -2122519001;
        of.mbgq[237] = -1105863141;
        of.mbgq[238] = -611195312;
        of.mbgq[239] = -720633417;
        of.mbgq[240] = 1774937598;
        of.mbgq[241] = -1371709294;
        of.mbgq[242] = 482650308;
        of.mbgq[243] = -205761210;
        of.mbgq[244] = -1412259664;
        of.mbgq[245] = -1310095808;
        of.mbgq[246] = 1540810509;
        of.mbgq[247] = -1951950113;
        of.mbgq[248] = -365099260;
        of.mbgq[249] = 1332380976;
        of.mbgq[250] = 733070718;
        of.mbgq[251] = 969338939;
        of.mbgq[252] = -665790080;
        of.mbgq[253] = 119540805;
        of.mbgq[254] = 2096286343;
        of.mbgq[255] = 1013241728;
        of.mbgq[256] = -1512837429;
        of.mbgq[257] = 144414401;
        of.mbgq[258] = -965560186;
        of.mbgq[259] = 502413588;
        of.mbgq[260] = -1383039963;
        of.mbgq[261] = 1505073037;
        of.mbgq[262] = 319725229;
        of.mbgq[263] = 87324604;
        of.mbgq[264] = -1657602120;
        of.mbgq[265] = 1172325525;
        of.mbgq[266] = -89964918;
        of.mbgq[267] = -5460824;
        of.mbgq[268] = 1574757959;
        of.mbgq[269] = 1578238068;
        of.mbgq[270] = 1199430768;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void removeScript(String var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = of.uz - of.mbgs("mbmk", mbgw(int ), (int)69)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == of.mbgs("mbml", mbgp(int ), (int)75)) break;
            v0 /* !! */  = (long)of.mbgs("mbmm", mbgp(int ), (int)76);
        }
        var4_2 = of.c;
        v1 /* !! */  = of.uz;
        if (true) ** GOTO lbl11
        block24: while (true) {
            v1 /* !! */  = (long)(v2 - of.mbgs("mbmn", mbgw(int ), (int)70));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1886520569: {
                    v2 = of.mbgs("mbmo", mbgw(int ), (int)71);
                    continue block24;
                }
                case -629276827: {
                    v2 = of.mbgs("mbmp", mbgw(int ), (int)72);
                    continue block24;
                }
                case 682329102: {
                    v2 = of.mbgs("mbmq", mbgw(int ), (int)73);
                    continue block24;
                }
                case 1172075565: {
                    break block24;
                }
            }
            break;
        }
        var3_3 /* !! */  = of.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = of.uz - of.mbgs("mbmr", mbgw(int ), (int)74)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == of.mbgs("mbms", mbgp(int ), (int)77)) break;
            v3 /* !! */  = (long)of.mbgs("mbmt", mbgp(int ), (int)78);
        }
        var2_4 = of.a;
        if (var4_2) {
            throw null;
lbl32:
            // 4 sources

            return;
        }
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4 || var2_4) ** GOTO lbl32
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = of.uz - of.mbgs("mbmu", mbgw(int ), (int)75)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == of.mbgs("mbmv", mbgp(int ), (int)79)) break;
                    v4 /* !! */  = (long)of.mbgs("mbmw", mbgp(int ), (int)80);
                }
                if (this.isNullOrEmpty(var1_1)) ** GOTO lbl68
                if (var2_4 || var2_4) ** GOTO lbl32
                v5 /* !! */  = of.uz;
                if (true) ** GOTO lbl49
                block28: while (true) {
                    v5 /* !! */  = (long)(v6 - of.mbgs("mbmx", mbgw(int ), (int)76));
lbl49:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -971242504: {
                            v6 = of.mbgs("mbmy", mbgw(int ), (int)77);
                            continue block28;
                        }
                        case 1172075565: {
                            break block28;
                        }
                        case 1639163898: {
                            v6 = of.mbgs("mbmz", mbgw(int ), (int)78);
                            continue block28;
                        }
                        case 1814406900: {
                            v6 = of.mbgs("mbna", mbgw(int ), (int)79);
                            continue block28;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_3 = of.uz - of.mbgs("mbnb", mbgw(int ), (int)80)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == of.mbgs("mbnc", mbgp(int ), (int)81)) break;
                    v7 /* !! */  = (long)of.mbgs("mbnd", mbgp(int ), (int)82);
                }
                this.scripts.remove(var1_1);
                if (var2_4) ** GOTO lbl32
lbl68:
                // 2 sources

                if (!var2_4 && !var2_4) ** break;
                ** continue;
                return;
            }
            case 0: {
                var3_3 /* !! */  = (int)of.mbgs("mbne", mbgp(int ), (int)83);
                if (var4_2) {
                    throw null;
                }
            }
lbl75:
            // 4 sources

            case 1: {
                var3_3 /* !! */  = (int)of.mbgs("mbnf", mbgp(int ), (int)84);
                if (!var4_2) break;
                throw null;
            }
lbl79:
            // 2 sources

            case 2: {
                var3_3 /* !! */  = (int)of.mbgs("mbng", mbgp(int ), (int)85);
                if (var4_2) {
                    throw null;
                }
            }
lbl83:
            // 5 sources

            case 3: {
                var3_3 /* !! */  = (int)of.mbgs("mbnh", mbgp(int ), (int)86);
                if (!var4_2) ** GOTO lbl79
                throw null;
            }
            case 4: {
                var3_3 /* !! */  = (int)of.mbgs("mbni", mbgp(int ), (int)87);
                if (!var4_2) ** GOTO lbl75
                throw null;
            }
lbl91:
            // 2 sources

            case 5: {
                var3_3 /* !! */  = (int)of.mbgs("mbnj", mbgp(int ), (int)88);
                if (!var4_2) ** GOTO lbl83
                throw null;
            }
            case 6: {
                var3_3 /* !! */  = (int)of.mbgs("mbnk", mbgp(int ), (int)89);
                if (!var4_2) ** GOTO lbl83
                throw null;
            }
            case 7: {
                var3_3 /* !! */  = (int)of.mbgs("mbnl", mbgp(int ), (int)90);
                if (!var4_2) ** GOTO lbl91
                throw null;
            }
            case 8: 
        }
        do {
            var3_3 /* !! */  = (int)of.mbgs("mbnm", mbgp(int ), (int)91);
        } while (!var4_2);
        throw null;
    }

    private static /* synthetic */ void mbzr() {
        of.mbgq[0] = -1965011880;
        of.mbgq[1] = 1924896895;
        of.mbgq[2] = -1880214004;
        of.mbgq[3] = -1495697678;
        of.mbgq[4] = 1780019175;
        of.mbgq[5] = 2092146192;
        of.mbgq[6] = -1614151437;
        of.mbgq[7] = -1370241413;
        of.mbgq[8] = 945751647;
        of.mbgq[9] = -1076168045;
        of.mbgq[10] = 820608928;
        of.mbgq[11] = 995438062;
        of.mbgq[12] = -2038376723;
        of.mbgq[13] = 842734821;
        of.mbgq[14] = -1383330162;
        of.mbgq[15] = -1998817551;
        of.mbgq[16] = -1421680548;
        of.mbgq[17] = 1509934940;
        of.mbgq[18] = 540628868;
        of.mbgq[19] = -745528428;
        of.mbgq[20] = 1188419461;
        of.mbgq[21] = -1674783986;
        of.mbgq[22] = 283630479;
        of.mbgq[23] = -1988657171;
        of.mbgq[24] = 1600796244;
        of.mbgq[25] = -1425376434;
        of.mbgq[26] = -80020728;
        of.mbgq[27] = -1313689337;
        of.mbgq[28] = -336408458;
        of.mbgq[29] = 264883358;
        of.mbgq[30] = -1501802116;
        of.mbgq[31] = -949827792;
        of.mbgq[32] = -2055597993;
        of.mbgq[33] = -403628712;
        of.mbgq[34] = -768049686;
        of.mbgq[35] = 1387007054;
        of.mbgq[36] = -755251024;
        of.mbgq[37] = -1343221515;
        of.mbgq[38] = -882961602;
        of.mbgq[39] = 434168303;
        of.mbgq[40] = -1130524233;
        of.mbgq[41] = -753606937;
        of.mbgq[42] = -1495772081;
        of.mbgq[43] = 69717636;
        of.mbgq[44] = -1075501140;
        of.mbgq[45] = -364738414;
        of.mbgq[46] = -824894417;
        of.mbgq[47] = -785132984;
        of.mbgq[48] = -389566358;
        of.mbgq[49] = -1270379307;
        of.mbgq[50] = -1612582786;
        of.mbgq[51] = 396191827;
        of.mbgq[52] = 2096065515;
        of.mbgq[53] = -165124325;
        of.mbgq[54] = -1509405186;
        of.mbgq[55] = 380246542;
        of.mbgq[56] = -1813573554;
        of.mbgq[57] = -154469378;
        of.mbgq[58] = -924527377;
        of.mbgq[59] = 1061798710;
        of.mbgq[60] = -1925612707;
        of.mbgq[61] = 390978483;
        of.mbgq[62] = 1305898903;
        of.mbgq[63] = -1646950386;
        of.mbgq[64] = -752858734;
        of.mbgq[65] = 1253712232;
        of.mbgq[66] = 515993991;
        of.mbgq[67] = 9769875;
        of.mbgq[68] = -235343360;
        of.mbgq[69] = -844137888;
        of.mbgq[70] = -1047073410;
        of.mbgq[71] = 1785321857;
        of.mbgq[72] = -1085266608;
        of.mbgq[73] = -939036485;
        of.mbgq[74] = 1109961112;
        of.mbgq[75] = 211919706;
        of.mbgq[76] = -1266214222;
        of.mbgq[77] = 1713909013;
        of.mbgq[78] = 1445781780;
        of.mbgq[79] = -1482435600;
        of.mbgq[80] = -1986650600;
        of.mbgq[81] = 100845316;
        of.mbgq[82] = 185916984;
        of.mbgq[83] = -1847783886;
        of.mbgq[84] = -732646124;
        of.mbgq[85] = 1092399134;
        of.mbgq[86] = 833716589;
        of.mbgq[87] = -1459677019;
        of.mbgq[88] = 128433987;
        of.mbgq[89] = 197611746;
        of.mbgq[90] = 1497501918;
        of.mbgq[91] = -85141010;
        of.mbgq[92] = 89991922;
        of.mbgq[93] = 1352428517;
        of.mbgq[94] = -417949607;
        of.mbgq[95] = -1350544643;
        of.mbgq[96] = -315575610;
        of.mbgq[97] = -1355048075;
        of.mbgq[98] = -692446184;
        of.mbgq[99] = -972904183;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public Optional<od> getScript(String var1_1) {
        v0 /* !! */  = of.uz;
        if (true) ** GOTO lbl5
        block28: while (true) {
            v0 /* !! */  = (long)(v1 - of.mbgs("mbgz", mbgw(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1736212592: {
                    v1 = of.mbgs("mbha", mbgw(int ), (int)1);
                    continue block28;
                }
                case 513167135: {
                    v1 = of.mbgs("mbhb", mbgw(int ), (int)2);
                    continue block28;
                }
                case 1172075565: {
                    break block28;
                }
            }
            break;
        }
        var4_2 = of.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = of.uz - of.mbgs("mbhc", mbgw(int ), (int)3)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == of.mbgs("mbhd", mbgp(int ), (int)3)) break;
            v2 /* !! */  = (long)of.mbgs("mbhe", mbgp(int ), (int)4);
        }
        var3_3 /* !! */  = of.b;
        v3 /* !! */  = of.uz;
        if (true) ** GOTO lbl25
        block30: while (true) {
            v3 /* !! */  = (long)(v4 - of.mbgs("mbhf", mbgw(int ), (int)4));
lbl25:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1675598230: {
                    v4 = of.mbgs("mbhg", mbgw(int ), (int)5);
                    continue block30;
                }
                case -611967892: {
                    v4 = of.mbgs("mbhh", mbgw(int ), (int)6);
                    continue block30;
                }
                case 1172075565: {
                    break block30;
                }
            }
            break;
        }
        var2_4 = of.a;
        if (!var4_2) ** GOTO lbl41
        throw null;
        {
            if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
            switch (var3_3 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return null;
                }
lbl41:
                // 1 sources

                if (var2_4 || var2_4) continue block31;
                v5 /* !! */  = of.uz;
                if (true) ** GOTO lbl46
                block32: while (true) {
                    v5 /* !! */  = (long)(of.mbgs("mbhj", mbgw(int ), (int)8) - of.mbgs("mbhi", mbgw(int ), (int)7));
lbl46:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case 1172075565: {
                            break block32;
                        }
                        case 1921477408: {
                            continue block32;
                        }
                    }
                    break;
                }
                if (!this.isNullOrEmpty(var1_1)) ** GOTO lbl62
                if (var2_4) continue block31;
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_1 = of.uz - of.mbgs("mbhk", mbgw(int ), (int)9)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == of.mbgs("mbhl", mbgp(int ), (int)5)) break;
                    v6 /* !! */  = (long)of.mbgs("mbhm", mbgp(int ), (int)6);
                }
                v7 = Optional.empty();
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl91
lbl62:
                // 1 sources

                if (!var2_4 && !var2_4) ** break;
                continue block31;
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_2 = of.uz - of.mbgs("mbhn", mbgw(int ), (int)10)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == of.mbgs("mbho", mbgp(int ), (int)7)) break;
                    v8 /* !! */  = (long)of.mbgs("mbhp", mbgp(int ), (int)8);
                }
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_3 = of.uz - of.mbgs("mbhq", mbgw(int ), (int)11)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == of.mbgs("mbhr", mbgp(int ), (int)9)) break;
                    v9 /* !! */  = (long)of.mbgs("mbhs", mbgp(int ), (int)10);
                }
                v10 = (Function<String, od>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$getScript$0(java.lang.String ), (Ljava/lang/String;)Lruhack/phobia/od;)();
                v11 /* !! */  = of.uz;
                if (true) ** GOTO lbl79
                block36: while (true) {
                    v11 /* !! */  = (long)(of.mbgs("mbhu", mbgw(int ), (int)13) - of.mbgs("mbht", mbgw(int ), (int)12));
lbl79:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case 272009766: {
                            continue block36;
                        }
                        case 1172075565: {
                            break block36;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_4 = of.uz - of.mbgs("mbhv", mbgw(int ), (int)14)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == of.mbgs("mbhw", mbgp(int ), (int)11)) {
                        v7 = Optional.of(this.scripts.computeIfAbsent(var1_1, v10));
                        break;
                    }
                    v12 /* !! */  = (long)of.mbgs("mbhx", mbgp(int ), (int)12);
                }
lbl91:
                // 2 sources

                return v7;
lbl92:
                // 3 sources

                case 0: {
                    var3_3 /* !! */  = (int)of.mbgs("mbhy", mbgp(int ), (int)13);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl110
                }
lbl97:
                // 2 sources

                case 1: {
                    var3_3 /* !! */  = (int)of.mbgs("mbhz", mbgp(int ), (int)14);
                    if (!var4_2) ** GOTO lbl92
                    throw null;
                }
                case 2: {
                    var3_3 /* !! */  = (int)of.mbgs("mbia", mbgp(int ), (int)15);
                    if (!var4_2) ** GOTO lbl97
                    throw null;
                }
                case 3: {
                    do {
                        var3_3 /* !! */  = (int)of.mbgs("mbib", mbgp(int ), (int)16);
                    } while (!var4_2);
                    throw null;
                }
lbl110:
                // 2 sources

                case 4: {
                    var3_3 /* !! */  = (int)of.mbgs("mbic", mbgp(int ), (int)17);
                    if (!var4_2) break block31;
                    throw null;
                }
                case 5: {
                    var3_3 /* !! */  = (int)of.mbgs("mbid", mbgp(int ), (int)18);
                    if (var4_2) {
                        throw null;
                    }
                }
                case 6: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var3_3 /* !! */  = (int)of.mbgs("mbie", mbgp(int ), (int)19);
                        if (!var4_2) ** GOTO lbl92
                        throw null;
                    }
                }
                case 7: 
            }
        }
        var3_3 /* !! */  = (int)of.mbgs("mbif", mbgp(int ), (int)20);
        ** while (!var4_2)
lbl126:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean isNullOrEmpty(String var1_1) {
        v0 /* !! */  = of.uz;
        if (true) ** GOTO lbl5
        block39: while (true) {
            v0 /* !! */  = (long)(of.mbgs("mbvf", mbgw(int ), (int)170) - of.mbgs("mbve", mbgw(int ), (int)169));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1538371245: {
                    continue block39;
                }
                case 1172075565: {
                    break block39;
                }
            }
            break;
        }
        var4_2 = of.c;
        v1 /* !! */  = of.uz;
        if (true) ** GOTO lbl15
        block40: while (true) {
            v1 /* !! */  = (long)(v2 - of.mbgs("mbvg", mbgw(int ), (int)171));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 305210830: {
                    v2 = of.mbgs("mbvh", mbgw(int ), (int)172);
                    continue block40;
                }
                case 1172075565: {
                    break block40;
                }
                case 2027341244: {
                    v2 = of.mbgs("mbvi", mbgw(int ), (int)173);
                    continue block40;
                }
            }
            break;
        }
        var3_3 /* !! */  = of.b;
        v3 /* !! */  = of.uz;
        if (true) ** GOTO lbl29
        block41: while (true) {
            v3 /* !! */  = (long)(v4 - of.mbgs("mbvj", mbgw(int ), (int)174));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1991144667: {
                    v4 = of.mbgs("mbvk", mbgw(int ), (int)175);
                    continue block41;
                }
                case -1223776754: {
                    v4 = of.mbgs("mbvl", mbgw(int ), (int)176);
                    continue block41;
                }
                case 1090873165: {
                    v4 = of.mbgs("mbvm", mbgw(int ), (int)177);
                    continue block41;
                }
                case 1172075565: {
                    break block41;
                }
            }
            break;
        }
        var2_4 = of.a;
        if (var4_2) {
            throw null;
lbl44:
            // 5 sources

            return (boolean)of.mbgs("mbvn", mbgp(int ), (int)203);
        }
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4 || var2_4) ** GOTO lbl44
                if (var1_1 == null) ** GOTO lbl84
                if (var2_4) ** GOTO lbl44
                v5 /* !! */  = of.uz;
                if (true) ** GOTO lbl56
                block43: while (true) {
                    v5 /* !! */  = (long)(v6 - of.mbgs("mbvo", mbgw(int ), (int)178));
lbl56:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case 600437528: {
                            v6 = of.mbgs("mbvp", mbgw(int ), (int)179);
                            continue block43;
                        }
                        case 883339469: {
                            v6 = of.mbgs("mbvq", mbgw(int ), (int)180);
                            continue block43;
                        }
                        case 1172075565: {
                            break block43;
                        }
                        case 1377165372: {
                            v6 = of.mbgs("mbvr", mbgw(int ), (int)181);
                            continue block43;
                        }
                    }
                    break;
                }
                v7 = var1_1.trim();
                v8 /* !! */  = of.uz;
                if (true) ** GOTO lbl73
                block44: while (true) {
                    v8 /* !! */  = (long)(v9 - of.mbgs("mbvs", mbgw(int ), (int)182));
lbl73:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case 138904461: {
                            v9 = of.mbgs("mbvt", mbgw(int ), (int)183);
                            continue block44;
                        }
                        case 522220393: {
                            v9 = of.mbgs("mbvu", mbgw(int ), (int)184);
                            continue block44;
                        }
                        case 1172075565: {
                            break block44;
                        }
                    }
                    break;
                }
                if (!v7.isEmpty()) ** GOTO lbl89
                if (var2_4) ** GOTO lbl44
lbl84:
                // 2 sources

                if (var2_4 || var2_4) ** GOTO lbl44
                v10 = of.mbgs("mbvv", mbgp(int ), (int)204);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl92
lbl89:
                // 1 sources

                if (!var2_4 && !var2_4) ** break;
                ** continue;
                v10 = of.mbgs("mbvw", mbgp(int ), (int)205);
lbl92:
                // 2 sources

                return (boolean)v10;
            }
lbl93:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)of.mbgs("mbvx", mbgp(int ), (int)206);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl131
            }
            case 1: {
                var3_3 /* !! */  = (int)of.mbgs("mbvy", mbgp(int ), (int)207);
                if (!var4_2) ** GOTO lbl93
                throw null;
            }
            case 2: {
                do {
                    var3_3 /* !! */  = (int)of.mbgs("mbvz", mbgp(int ), (int)208);
                } while (!var4_2);
                throw null;
            }
lbl107:
            // 2 sources

            case 3: {
                var3_3 /* !! */  = (int)of.mbgs("mbwa", mbgp(int ), (int)209);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl117
            }
lbl112:
            // 2 sources

            case 4: {
                var3_3 /* !! */  = (int)of.mbgs("mbwb", mbgp(int ), (int)210);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl135
            }
lbl117:
            // 2 sources

            case 5: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)of.mbgs("mbwc", mbgp(int ), (int)211);
                    if (!var4_2) ** GOTO lbl107
                    throw null;
                }
            }
            case 6: {
                var3_3 /* !! */  = (int)of.mbgs("mbwd", mbgp(int ), (int)212);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl135
            }
            case 7: {
                var3_3 /* !! */  = (int)of.mbgs("mbwe", mbgp(int ), (int)213);
                if (var4_2) {
                    throw null;
                }
            }
lbl131:
            // 4 sources

            case 8: {
                var3_3 /* !! */  = (int)of.mbgs("mbwf", mbgp(int ), (int)214);
                if (!var4_2) break;
                throw null;
            }
lbl135:
            // 3 sources

            case 9: {
                var3_3 /* !! */  = (int)of.mbgs("mbwg", mbgp(int ), (int)215);
                if (!var4_2) ** GOTO lbl112
                throw null;
            }
            case 10: 
        }
        var3_3 /* !! */  = (int)of.mbgs("mbwh", mbgp(int ), (int)216);
        ** while (!var4_2)
lbl142:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void mbzz() {
        of.mbgx[200] = -8028139536899954080L;
        of.mbgx[201] = -6896270057458391055L;
        of.mbgx[202] = 289642961706977373L;
        of.mbgx[203] = 1011804755740705766L;
        of.mbgx[204] = 3715216309536969232L;
        of.mbgx[205] = 571805847122141313L;
        of.mbgx[206] = 365801762021183382L;
        of.mbgx[207] = -3173013987113882694L;
        of.mbgx[208] = -8965691873111269099L;
        of.mbgx[209] = 4184611342893581216L;
        of.mbgx[210] = 3498461244947295436L;
        of.mbgx[211] = -7368768869020402883L;
        of.mbgx[212] = 7330575709668030462L;
        of.mbgx[213] = 5327957740554968736L;
        of.mbgx[214] = 5089030300502542694L;
        of.mbgx[215] = -7392571394798305688L;
        of.mbgx[216] = 8188390405923747408L;
        of.mbgx[217] = -2367650737207602875L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean containsScript(String var1_1) {
        block53: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = of.uz - of.mbgs("mbjp", mbgw(int ), (int)33)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v0 /* !! */  == of.mbgs("mbjq", mbgp(int ), (int)38)) break;
                v0 /* !! */  = (long)of.mbgs("mbjr", mbgp(int ), (int)39);
            }
            var4_2 = of.c;
            v1 /* !! */  = of.uz;
            if (true) ** GOTO lbl12
            block35: while (true) {
                v1 /* !! */  = (long)(v2 - of.mbgs("mbjs", mbgw(int ), (int)34));
lbl12:
                // 2 sources

                switch ((int)v1 /* !! */ ) {
                    case -1847966822: {
                        v2 = of.mbgs("mbjt", mbgw(int ), (int)35);
                        continue block35;
                    }
                    case -1081745160: {
                        v2 = of.mbgs("mbju", mbgw(int ), (int)36);
                        continue block35;
                    }
                    case 1172075565: {
                        break block35;
                    }
                }
                break;
            }
            var3_3 /* !! */  = of.b;
            v3 /* !! */  = of.uz;
            if (true) ** GOTO lbl26
            block36: while (true) {
                v3 /* !! */  = (long)(v4 - of.mbgs("mbjv", mbgw(int ), (int)37));
lbl26:
                // 2 sources

                switch ((int)v3 /* !! */ ) {
                    case -1973542139: {
                        v4 = of.mbgs("mbjw", mbgw(int ), (int)38);
                        continue block36;
                    }
                    case -948651572: {
                        v4 = of.mbgs("mbjx", mbgw(int ), (int)39);
                        continue block36;
                    }
                    case -391458366: {
                        v4 = of.mbgs("mbjy", mbgw(int ), (int)40);
                        continue block36;
                    }
                    case 1172075565: {
                        break block36;
                    }
                }
                break;
            }
            var2_4 = of.a;
            if (var4_2) {
                throw null;
lbl41:
                // 4 sources

                return (boolean)of.mbgs("mbjz", mbgp(int ), (int)40);
            }
            if (var2_4 || var2_4) ** GOTO lbl41
            v5 /* !! */  = of.uz;
            if (true) ** GOTO lbl48
            block38: while (true) {
                v5 /* !! */  = (long)(v6 - of.mbgs("mbka", mbgw(int ), (int)41));
lbl48:
                // 2 sources

                switch ((int)v5 /* !! */ ) {
                    case -2110062889: {
                        v6 = of.mbgs("mbkb", mbgw(int ), (int)42);
                        continue block38;
                    }
                    case -252717046: {
                        v6 = of.mbgs("mbkc", mbgw(int ), (int)43);
                        continue block38;
                    }
                    case 197024073: {
                        v6 = of.mbgs("mbkd", mbgw(int ), (int)44);
                        continue block38;
                    }
                    case 1172075565: {
                        break block38;
                    }
                }
                break;
            }
            if (this.isNullOrEmpty(var1_1)) break block53;
            if (var2_4) ** GOTO lbl41
            v7 /* !! */  = of.uz;
            if (true) ** GOTO lbl66
            block39: while (true) {
                v7 /* !! */  = (long)(v8 - of.mbgs("mbke", mbgw(int ), (int)45));
lbl66:
                // 2 sources

                switch ((int)v7 /* !! */ ) {
                    case -1741117457: {
                        v8 = of.mbgs("mbkf", mbgw(int ), (int)46);
                        continue block39;
                    }
                    case -1340413477: {
                        v8 = of.mbgs("mbkg", mbgw(int ), (int)47);
                        continue block39;
                    }
                    case 268043187: {
                        v8 = of.mbgs("mbkh", mbgw(int ), (int)48);
                        continue block39;
                    }
                    case 1172075565: {
                        break block39;
                    }
                }
                break;
            }
            while (true) {
                if ((v9 /* !! */  = (cfr_temp_1 = of.uz - of.mbgs("mbki", mbgw(int ), (int)49)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v9 /* !! */  == of.mbgs("mbkj", mbgp(int ), (int)41)) break;
                v9 /* !! */  = (long)of.mbgs("mbkk", mbgp(int ), (int)42);
            }
            if (!this.scripts.containsKey(var1_1)) break block53;
            if (var2_4) ** GOTO lbl41
            v10 = of.mbgs("mbkl", mbgp(int ), (int)43);
            if (var4_2) {
                throw null;
            }
            ** GOTO lbl97
        }
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var2_4 && !var2_4) ** break;
                ** continue;
                v10 = of.mbgs("mbkm", mbgp(int ), (int)44);
lbl97:
                // 2 sources

                return (boolean)v10;
            }
lbl98:
            // 3 sources

            case 0: {
                var3_3 /* !! */  = (int)of.mbgs("mbkn", mbgp(int ), (int)45);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl108
            }
            case 1: {
                var3_3 /* !! */  = (int)of.mbgs("mbko", mbgp(int ), (int)46);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl131
            }
lbl108:
            // 2 sources

            case 2: {
                var3_3 /* !! */  = (int)of.mbgs("mbkp", mbgp(int ), (int)47);
                if (!var4_2) ** GOTO lbl98
                throw null;
            }
            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)of.mbgs("mbkq", mbgp(int ), (int)48);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl123
                    break;
                }
            }
            case 4: {
                var3_3 /* !! */  = (int)of.mbgs("mbkr", mbgp(int ), (int)49);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl131
            }
lbl123:
            // 2 sources

            case 5: {
                var3_3 /* !! */  = (int)of.mbgs("mbks", mbgp(int ), (int)50);
                if (!var4_2) ** GOTO lbl98
                throw null;
            }
lbl127:
            // 2 sources

            case 6: {
                var3_3 /* !! */  = (int)of.mbgs("mbkt", mbgp(int ), (int)51);
                if (var4_2) {
                    throw null;
                }
            }
lbl131:
            // 5 sources

            case 7: {
                var3_3 /* !! */  = (int)of.mbgs("mbku", mbgp(int ), (int)52);
                if (!var4_2) ** GOTO lbl127
                throw null;
            }
            case 8: 
        }
        var3_3 /* !! */  = (int)of.mbgs("mbkv", mbgp(int ), (int)53);
        ** while (!var4_2)
lbl138:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void mbzx() {
        of.mbgx[0] = 8660295726080668915L;
        of.mbgx[1] = 3636191432179464445L;
        of.mbgx[2] = -3702319260869749120L;
        of.mbgx[3] = -6984950271223473578L;
        of.mbgx[4] = 1819098283688708977L;
        of.mbgx[5] = 158753698027634910L;
        of.mbgx[6] = 6174679203192150384L;
        of.mbgx[7] = -2634903810396862325L;
        of.mbgx[8] = 1695216031629961630L;
        of.mbgx[9] = 1252425672319749052L;
        of.mbgx[10] = -832644719700326161L;
        of.mbgx[11] = 6913769398835167445L;
        of.mbgx[12] = -909913166651631730L;
        of.mbgx[13] = -350221051673578397L;
        of.mbgx[14] = 3802844364567235766L;
        of.mbgx[15] = 1925401024280608941L;
        of.mbgx[16] = 3113333851800311708L;
        of.mbgx[17] = 293683778710890302L;
        of.mbgx[18] = -4510994334674583865L;
        of.mbgx[19] = 810866906823906352L;
        of.mbgx[20] = -6292887413791961137L;
        of.mbgx[21] = 5846881676126371440L;
        of.mbgx[22] = 8547568771125548557L;
        of.mbgx[23] = -2824619053500547648L;
        of.mbgx[24] = -425740183274575990L;
        of.mbgx[25] = -3738805224474926213L;
        of.mbgx[26] = -1871739699555903742L;
        of.mbgx[27] = 7785649209783894417L;
        of.mbgx[28] = -5240101929236424896L;
        of.mbgx[29] = -6147358129747889701L;
        of.mbgx[30] = -4336556109704049560L;
        of.mbgx[31] = -3366394209954505699L;
        of.mbgx[32] = -5687269939174765880L;
        of.mbgx[33] = -4785040131757255323L;
        of.mbgx[34] = 5530265791477964492L;
        of.mbgx[35] = -2764429793863386845L;
        of.mbgx[36] = 8362443063703242237L;
        of.mbgx[37] = -5276553400512548452L;
        of.mbgx[38] = 828273595925743195L;
        of.mbgx[39] = -2552452908700347536L;
        of.mbgx[40] = 7010288518979172281L;
        of.mbgx[41] = -4621608415883016121L;
        of.mbgx[42] = 8592795831778056406L;
        of.mbgx[43] = -2454656928606029343L;
        of.mbgx[44] = -5115174267922189489L;
        of.mbgx[45] = 5181363723870038100L;
        of.mbgx[46] = 1833329120640221647L;
        of.mbgx[47] = 3262084587110274710L;
        of.mbgx[48] = -1346219495505999112L;
        of.mbgx[49] = -641190088999489854L;
        of.mbgx[50] = -4648353784683269807L;
        of.mbgx[51] = 6044911085055902723L;
        of.mbgx[52] = 9144015940008413623L;
        of.mbgx[53] = -3433605864597368135L;
        of.mbgx[54] = 4113952954704070920L;
        of.mbgx[55] = -8103799733297382801L;
        of.mbgx[56] = -4025034701660148816L;
        of.mbgx[57] = 8021650839725463543L;
        of.mbgx[58] = 1180771413121101600L;
        of.mbgx[59] = -7501342536329999030L;
        of.mbgx[60] = 7572902530683062349L;
        of.mbgx[61] = -1215480685311773097L;
        of.mbgx[62] = -6553527628952367926L;
        of.mbgx[63] = -2887162768115561365L;
        of.mbgx[64] = -2177320841181011974L;
        of.mbgx[65] = 2867033799437298091L;
        of.mbgx[66] = -4792610614886343080L;
        of.mbgx[67] = 2020203274290164365L;
        of.mbgx[68] = -156900799722513483L;
        of.mbgx[69] = 4993592189378086367L;
        of.mbgx[70] = 400385991070073761L;
        of.mbgx[71] = -2783234343385327002L;
        of.mbgx[72] = -1299282016727790874L;
        of.mbgx[73] = 5840831397604376657L;
        of.mbgx[74] = 6521026031747166468L;
        of.mbgx[75] = -5234689881051790051L;
        of.mbgx[76] = 1170816123230643306L;
        of.mbgx[77] = 7797081202428685801L;
        of.mbgx[78] = -1239764973110022614L;
        of.mbgx[79] = -1329371675946930177L;
        of.mbgx[80] = 1702690738945999827L;
        of.mbgx[81] = 1284484311315774373L;
        of.mbgx[82] = -1135365807271246676L;
        of.mbgx[83] = -9178304007531007665L;
        of.mbgx[84] = 8871759839398150292L;
        of.mbgx[85] = 4506837636499045840L;
        of.mbgx[86] = 7775887278959681068L;
        of.mbgx[87] = -6775204627209078008L;
        of.mbgx[88] = -7792134442321314881L;
        of.mbgx[89] = -8039299494640838949L;
        of.mbgx[90] = -3199627816249907199L;
        of.mbgx[91] = 3793249314729496793L;
        of.mbgx[92] = -9166938530483739530L;
        of.mbgx[93] = 800363339198526961L;
        of.mbgx[94] = 1557238118170519588L;
        of.mbgx[95] = -6461951719180725934L;
        of.mbgx[96] = 6298231079590900416L;
        of.mbgx[97] = 507967079905550349L;
        of.mbgx[98] = 2127426448488323584L;
        of.mbgx[99] = 7261605463088378077L;
    }

    static {
        mbgq = new int[271];
        mbgr = new int[271];
        of.mbzr();
        of.mbzs();
        of.mbzt();
        of.mbzu();
        of.mbzv();
        of.mbzw();
        mbgx = new long[218];
        mbgy = new long[218];
        of.mbzx();
        of.mbzy();
        of.mbzz();
        of.mcaa();
        of.mcab();
        of.mcac();
    }

    private static /* synthetic */ void mbzy() {
        of.mbgx[100] = -1254513809164662231L;
        of.mbgx[101] = 2066903301847053004L;
        of.mbgx[102] = -707448578606296787L;
        of.mbgx[103] = 4356454871655197703L;
        of.mbgx[104] = -8119625355343031618L;
        of.mbgx[105] = -7022842697407941524L;
        of.mbgx[106] = 465002589283213802L;
        of.mbgx[107] = 8381900422448834191L;
        of.mbgx[108] = 2259463567347180303L;
        of.mbgx[109] = -893976225826562445L;
        of.mbgx[110] = -4027800839889789058L;
        of.mbgx[111] = -9455411195149946L;
        of.mbgx[112] = -5187584022970075625L;
        of.mbgx[113] = -3250413024942941730L;
        of.mbgx[114] = 8054551809023376054L;
        of.mbgx[115] = -7903257550461186829L;
        of.mbgx[116] = 1689343500219744086L;
        of.mbgx[117] = 365602072303504947L;
        of.mbgx[118] = 7582975028099224529L;
        of.mbgx[119] = 6187475045942540547L;
        of.mbgx[120] = -4361455549521315273L;
        of.mbgx[121] = 3701445424607813352L;
        of.mbgx[122] = -1709438640303208765L;
        of.mbgx[123] = 3635003295078591495L;
        of.mbgx[124] = -553315421500649986L;
        of.mbgx[125] = -1855981910472156994L;
        of.mbgx[126] = 1522701736846697482L;
        of.mbgx[127] = 3285777461635565115L;
        of.mbgx[128] = 1669983096574795262L;
        of.mbgx[129] = 4355940750994390135L;
        of.mbgx[130] = 6094327674300387708L;
        of.mbgx[131] = -4282294597933928104L;
        of.mbgx[132] = -9024798206416438993L;
        of.mbgx[133] = -7387866978724852195L;
        of.mbgx[134] = -8414626924755702702L;
        of.mbgx[135] = 6345271819424059365L;
        of.mbgx[136] = -2609721595588422753L;
        of.mbgx[137] = 2341616649239362730L;
        of.mbgx[138] = -694477601979800485L;
        of.mbgx[139] = 123417373203823404L;
        of.mbgx[140] = -8994406654179772867L;
        of.mbgx[141] = 5773804056175393826L;
        of.mbgx[142] = 3614931944398803727L;
        of.mbgx[143] = -2852127832967769367L;
        of.mbgx[144] = -3496138811490349583L;
        of.mbgx[145] = 3765506546760881932L;
        of.mbgx[146] = -7303929339555484042L;
        of.mbgx[147] = 8400115502029105485L;
        of.mbgx[148] = 1290435163086779154L;
        of.mbgx[149] = -7185755106925304756L;
        of.mbgx[150] = 5357257650813900151L;
        of.mbgx[151] = -4306386569861243643L;
        of.mbgx[152] = -1773920538659769008L;
        of.mbgx[153] = 6620457964175819018L;
        of.mbgx[154] = -9040122629602270479L;
        of.mbgx[155] = -2739151257697161918L;
        of.mbgx[156] = 3143804013809898735L;
        of.mbgx[157] = -1250975927227749105L;
        of.mbgx[158] = -614228513838847045L;
        of.mbgx[159] = -1786858859103675310L;
        of.mbgx[160] = -7224315795731980719L;
        of.mbgx[161] = -4286346243636625909L;
        of.mbgx[162] = -6315101626362732144L;
        of.mbgx[163] = 9199805519021462234L;
        of.mbgx[164] = -3954771493485076081L;
        of.mbgx[165] = 7437682779457726471L;
        of.mbgx[166] = 2618876781101731194L;
        of.mbgx[167] = -7688703909960246145L;
        of.mbgx[168] = 7343407018983560428L;
        of.mbgx[169] = -2647288903955729849L;
        of.mbgx[170] = 8477110591220953675L;
        of.mbgx[171] = -3565724852176566625L;
        of.mbgx[172] = 2816093406775812807L;
        of.mbgx[173] = -899413624877306216L;
        of.mbgx[174] = 1580844895347851386L;
        of.mbgx[175] = -523070484805793802L;
        of.mbgx[176] = -7772442811582316409L;
        of.mbgx[177] = 15272155595628636L;
        of.mbgx[178] = 1361573307168970135L;
        of.mbgx[179] = -8584878239532735283L;
        of.mbgx[180] = -8133493250103685946L;
        of.mbgx[181] = -2481035897024536404L;
        of.mbgx[182] = 184144799609034747L;
        of.mbgx[183] = 204653843300512580L;
        of.mbgx[184] = -372589165123237724L;
        of.mbgx[185] = -3507987133155855225L;
        of.mbgx[186] = -2944697783329272120L;
        of.mbgx[187] = 7001918509156663873L;
        of.mbgx[188] = -2626355695736488928L;
        of.mbgx[189] = -4270600597591928497L;
        of.mbgx[190] = -102795350246047841L;
        of.mbgx[191] = -4545597515411548674L;
        of.mbgx[192] = 3500601020934240263L;
        of.mbgx[193] = 1787078461265336547L;
        of.mbgx[194] = 3792683523064814209L;
        of.mbgx[195] = 1890952059230114911L;
        of.mbgx[196] = -7192839266746189088L;
        of.mbgx[197] = 1140523318182484372L;
        of.mbgx[198] = -5816665259305336899L;
        of.mbgx[199] = 4661470858259284972L;
    }

    private static /* synthetic */ void mcab() {
        of.mbgy[100] = 3353563851585860376L;
        of.mbgy[101] = -2858743857021935998L;
        of.mbgy[102] = -8885028146978846581L;
        of.mbgy[103] = 6856063233019404194L;
        of.mbgy[104] = -4990063244661368767L;
        of.mbgy[105] = 892220520837726527L;
        of.mbgy[106] = -4013971560302026012L;
        of.mbgy[107] = -2867389886366606305L;
        of.mbgy[108] = -1806437681085800997L;
        of.mbgy[109] = -7623295729693743523L;
        of.mbgy[110] = -6433807071279261372L;
        of.mbgy[111] = -8540272801106955556L;
        of.mbgy[112] = 1035660000532863403L;
        of.mbgy[113] = -7241377947080634526L;
        of.mbgy[114] = -6440403572977376065L;
        of.mbgy[115] = -5327686659542436158L;
        of.mbgy[116] = -8717202321251321438L;
        of.mbgy[117] = -1219441194446901971L;
        of.mbgy[118] = -6660065976427881915L;
        of.mbgy[119] = -4903435602095315173L;
        of.mbgy[120] = -8859547717839724581L;
        of.mbgy[121] = -8939431500470786947L;
        of.mbgy[122] = 7243502235612950119L;
        of.mbgy[123] = -8028200157544758065L;
        of.mbgy[124] = -3799530460264543327L;
        of.mbgy[125] = 6272542681970243834L;
        of.mbgy[126] = 8186330407548589188L;
        of.mbgy[127] = 5684312964928229119L;
        of.mbgy[128] = 7293315947647621699L;
        of.mbgy[129] = 811690559088729445L;
        of.mbgy[130] = 8181416891744204569L;
        of.mbgy[131] = -8039512390514960084L;
        of.mbgy[132] = 4007887653192207919L;
        of.mbgy[133] = 8148403655884118471L;
        of.mbgy[134] = 1171591046925097122L;
        of.mbgy[135] = 153390083972653437L;
        of.mbgy[136] = 2385705232903946557L;
        of.mbgy[137] = -7589798605395226741L;
        of.mbgy[138] = -5164026507497166508L;
        of.mbgy[139] = 3568440271576109603L;
        of.mbgy[140] = -380216585594753248L;
        of.mbgy[141] = -8224092125639450878L;
        of.mbgy[142] = 8816930026524753241L;
        of.mbgy[143] = 6264770114665946397L;
        of.mbgy[144] = -5634322953833330350L;
        of.mbgy[145] = 1881998978722407998L;
        of.mbgy[146] = -1934539504064413431L;
        of.mbgy[147] = 2087271977203694582L;
        of.mbgy[148] = 1012016374953517027L;
        of.mbgy[149] = -6333908700595534753L;
        of.mbgy[150] = -6750781606437580827L;
        of.mbgy[151] = -7792213641116774152L;
        of.mbgy[152] = 8776081062368006275L;
        of.mbgy[153] = -3836380945525096132L;
        of.mbgy[154] = -1858717866134941440L;
        of.mbgy[155] = -6361726713964430713L;
        of.mbgy[156] = -529957299520882820L;
        of.mbgy[157] = 8132260837600022865L;
        of.mbgy[158] = -6354813762235584195L;
        of.mbgy[159] = -5784881166427107066L;
        of.mbgy[160] = -1066678049688967591L;
        of.mbgy[161] = 1604856589647836640L;
        of.mbgy[162] = -6834655342668339564L;
        of.mbgy[163] = -5249997781900847975L;
        of.mbgy[164] = 327276186474410063L;
        of.mbgy[165] = -4584501670425219504L;
        of.mbgy[166] = 4648455105303881628L;
        of.mbgy[167] = 3582688697061836102L;
        of.mbgy[168] = 4255194819454517305L;
        of.mbgy[169] = 9069792380555189327L;
        of.mbgy[170] = -2164234895922041973L;
        of.mbgy[171] = 1492819171967413732L;
        of.mbgy[172] = 8457225474617689939L;
        of.mbgy[173] = -1617714714464734168L;
        of.mbgy[174] = -5808863240692794926L;
        of.mbgy[175] = 4868885672007898170L;
        of.mbgy[176] = -6852303259136957287L;
        of.mbgy[177] = -7814026069330037522L;
        of.mbgy[178] = 618747391894522964L;
        of.mbgy[179] = 9083122672216617891L;
        of.mbgy[180] = -5979935571423886256L;
        of.mbgy[181] = -6106466364530196242L;
        of.mbgy[182] = 944479251332927321L;
        of.mbgy[183] = 7915397938039050632L;
        of.mbgy[184] = -7427327019324932072L;
        of.mbgy[185] = -8332442068278628693L;
        of.mbgy[186] = -5953113677059411985L;
        of.mbgy[187] = 2718129917732553706L;
        of.mbgy[188] = -7090855964947477322L;
        of.mbgy[189] = -3083123975407693540L;
        of.mbgy[190] = -106773167602961474L;
        of.mbgy[191] = 5292768479429815820L;
        of.mbgy[192] = -8981952560906616611L;
        of.mbgy[193] = -8715317199896495415L;
        of.mbgy[194] = 786733777724432844L;
        of.mbgy[195] = 9078732546296192717L;
        of.mbgy[196] = 6815946787467141765L;
        of.mbgy[197] = -2571597735715126755L;
        of.mbgy[198] = -5440388511321625411L;
        of.mbgy[199] = 8643248511191973970L;
    }

    private static /* synthetic */ void mbzs() {
        of.mbgq[100] = -2135748338;
        of.mbgq[101] = 1312730953;
        of.mbgq[102] = -1306483886;
        of.mbgq[103] = 1662787339;
        of.mbgq[104] = -663336310;
        of.mbgq[105] = 1049553031;
        of.mbgq[106] = -51791414;
        of.mbgq[107] = 236264119;
        of.mbgq[108] = -270653002;
        of.mbgq[109] = -899891753;
        of.mbgq[110] = -739042252;
        of.mbgq[111] = 1326617713;
        of.mbgq[112] = 914681466;
        of.mbgq[113] = -415086100;
        of.mbgq[114] = -1858869236;
        of.mbgq[115] = 2098908831;
        of.mbgq[116] = -1316980910;
        of.mbgq[117] = -1476784795;
        of.mbgq[118] = -383686784;
        of.mbgq[119] = -244806414;
        of.mbgq[120] = 1021693951;
        of.mbgq[121] = -1805804544;
        of.mbgq[122] = -253061149;
        of.mbgq[123] = 816619719;
        of.mbgq[124] = 716432719;
        of.mbgq[125] = -471623105;
        of.mbgq[126] = 624603970;
        of.mbgq[127] = -1715231635;
        of.mbgq[128] = -304892624;
        of.mbgq[129] = -956525645;
        of.mbgq[130] = 1332649778;
        of.mbgq[131] = 1126900871;
        of.mbgq[132] = 338337040;
        of.mbgq[133] = -1145628818;
        of.mbgq[134] = -830950835;
        of.mbgq[135] = 835674850;
        of.mbgq[136] = -1326978530;
        of.mbgq[137] = -1660827504;
        of.mbgq[138] = 2070849873;
        of.mbgq[139] = -1817390011;
        of.mbgq[140] = 1272514656;
        of.mbgq[141] = 529308129;
        of.mbgq[142] = -416183265;
        of.mbgq[143] = -841912625;
        of.mbgq[144] = -989269791;
        of.mbgq[145] = -1960700579;
        of.mbgq[146] = 1547108564;
        of.mbgq[147] = -1721186209;
        of.mbgq[148] = -1949962269;
        of.mbgq[149] = -339832996;
        of.mbgq[150] = 9661757;
        of.mbgq[151] = 1970449953;
        of.mbgq[152] = -1652784991;
        of.mbgq[153] = 1011561133;
        of.mbgq[154] = 136570788;
        of.mbgq[155] = -1594980316;
        of.mbgq[156] = 2115691143;
        of.mbgq[157] = 380865486;
        of.mbgq[158] = 1261248310;
        of.mbgq[159] = -996087560;
        of.mbgq[160] = 52860179;
        of.mbgq[161] = -908979466;
        of.mbgq[162] = 396657249;
        of.mbgq[163] = 1910370741;
        of.mbgq[164] = -921326821;
        of.mbgq[165] = -1618966600;
        of.mbgq[166] = 1787666701;
        of.mbgq[167] = 2125350963;
        of.mbgq[168] = 441708673;
        of.mbgq[169] = 1890109682;
        of.mbgq[170] = -2068141791;
        of.mbgq[171] = -11091663;
        of.mbgq[172] = -1079355562;
        of.mbgq[173] = 824264440;
        of.mbgq[174] = -329119346;
        of.mbgq[175] = 385553848;
        of.mbgq[176] = -1129827896;
        of.mbgq[177] = -850114707;
        of.mbgq[178] = 2007515597;
        of.mbgq[179] = -1596106571;
        of.mbgq[180] = 634724507;
        of.mbgq[181] = 543874869;
        of.mbgq[182] = -904650893;
        of.mbgq[183] = 218222345;
        of.mbgq[184] = 506236366;
        of.mbgq[185] = -92577004;
        of.mbgq[186] = 913864111;
        of.mbgq[187] = 930833528;
        of.mbgq[188] = -1638915389;
        of.mbgq[189] = -1601527238;
        of.mbgq[190] = 241151112;
        of.mbgq[191] = 1802331744;
        of.mbgq[192] = 411370784;
        of.mbgq[193] = 525063529;
        of.mbgq[194] = 104207651;
        of.mbgq[195] = -265801165;
        of.mbgq[196] = 628264467;
        of.mbgq[197] = 90102452;
        of.mbgq[198] = 2093296676;
        of.mbgq[199] = -1367868454;
    }
}

