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
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;
import ruhack.phobia.ds;

public class dq {
    public static final boolean c;
    private static long[] bslx;
    public static final long ec = 2226508525297381029L;
    private final List<ds> moduleStructures;
    private static long[] bsly;
    public static final int b;
    private static int[] bsmc;
    public static final boolean a;
    private static int[] bsmd;

    /*
     * Enabled aggressive block sorting
     */
    public <T extends ds> T get(String string) {
        boolean bl2;
        while (true) {
            long l2;
            Object object;
            if ((object = (l2 = ec - dq.bslz("bsma", bslw(int ), (int)0)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object == dq.bslz("bsme", bsmb(int ), (int)0)) break;
            object = dq.bslz("bsmf", bsmb(int ), (int)1);
        }
        boolean bl3 = c;
        while (true) {
            long l3;
            Object object;
            if ((object = (l3 = ec - dq.bslz("bsmg", bslw(int ), (int)1)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object == dq.bslz("bsmh", bsmb(int ), (int)2)) break;
            object = dq.bslz("bsmi", bsmb(int ), (int)3);
        }
        int n2 = b;
        while (true) {
            long l4;
            Object object;
            if ((object = (l4 = ec - dq.bslz("bsmj", bslw(int ), (int)2)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            if (object == dq.bslz("bsmk", bsmb(int ), (int)4)) {
                bl2 = a;
                if (bl3) {
                    throw null;
                }
                break;
            }
            object = dq.bslz("bsml", bsmb(int ), (int)5);
        }
        if (bl2) return null;
        if (bl2) return null;
        while (true) {
            long l5;
            Object object;
            if ((object = (l5 = ec - dq.bslz("bsmm", bslw(int ), (int)3)) == 0L ? 0 : (l5 < 0L ? -1 : 1)) == false) continue;
            if (object == dq.bslz("bsmn", bsmb(int ), (int)6)) break;
            object = dq.bslz("bsmo", bsmb(int ), (int)7);
        }
        while (true) {
            long l6;
            Object object;
            if ((object = (l6 = ec - dq.bslz("bsmp", bslw(int ), (int)4)) == 0L ? 0 : (l6 < 0L ? -1 : 1)) == false) continue;
            if (object == dq.bslz("bsmq", bsmb(int ), (int)8)) break;
            object = dq.bslz("bsmr", bsmb(int ), (int)9);
        }
        Stream stream = this.moduleStructures.stream();
        while (true) {
            long l7;
            Object object;
            if ((object = (l7 = ec - dq.bslz("bsms", bslw(int ), (int)5)) == 0L ? 0 : (l7 < 0L ? -1 : 1)) == false) continue;
            if (object == dq.bslz("bsmt", bsmb(int ), (int)10)) break;
            object = dq.bslz("bsmu", bsmb(int ), (int)11);
        }
        Predicate<ds> predicate = arg_0 -> dq.lambda$get$0(string, arg_0);
        while (true) {
            long l8;
            Object object;
            if ((object = (l8 = ec - dq.bslz("bsmv", bslw(int ), (int)6)) == 0L ? 0 : (l8 < 0L ? -1 : 1)) == false) continue;
            if (object == dq.bslz("bsmw", bsmb(int ), (int)12)) break;
            object = dq.bslz("bsmx", bsmb(int ), (int)13);
        }
        Stream<ds> stream2 = stream.filter(predicate);
        while (true) {
            long l9;
            Object object;
            if ((object = (l9 = ec - dq.bslz("bsmy", bslw(int ), (int)7)) == 0L ? 0 : (l9 < 0L ? -1 : 1)) == false) continue;
            if (object == dq.bslz("bsmz", bsmb(int ), (int)14)) break;
            object = dq.bslz("bsna", bsmb(int ), (int)15);
        }
        Function<ds, ds> function = dq::lambda$get$1;
        while (true) {
            long l10;
            Object object;
            if ((object = (l10 = ec - dq.bslz("bsnb", bslw(int ), (int)8)) == 0L ? 0 : (l10 < 0L ? -1 : 1)) == false) continue;
            if (object == dq.bslz("bsnc", bsmb(int ), (int)16)) break;
            object = dq.bslz("bsnd", bsmb(int ), (int)17);
        }
        Stream<ds> stream3 = stream2.map(function);
        while (true) {
            long l11;
            Object object;
            if ((object = (l11 = ec - dq.bslz("bsne", bslw(int ), (int)9)) == 0L ? 0 : (l11 < 0L ? -1 : 1)) == false) continue;
            if (object == dq.bslz("bsnf", bsmb(int ), (int)18)) break;
            object = dq.bslz("bsng", bsmb(int ), (int)19);
        }
        Optional<ds> optional = stream3.findFirst();
        while (true) {
            long l12;
            Object object;
            if ((object = (l12 = ec - dq.bslz("bsnh", bslw(int ), (int)10)) == 0L ? 0 : (l12 < 0L ? -1 : 1)) == false) continue;
            if (object == dq.bslz("bsni", bsmb(int ), (int)20)) {
                return (T)optional.orElse(null);
            }
            object = dq.bslz("bsnj", bsmb(int ), (int)21);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ boolean lambda$get$0(String var0, ds var1_1) {
        v0 /* !! */  = dq.ec;
        if (true) ** GOTO lbl5
        block19: while (true) {
            v0 /* !! */  = (long)(dq.bslz("bsre", bslw(int ), (int)71) - dq.bslz("bsrd", bslw(int ), (int)70));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1748419008: {
                    continue block19;
                }
                case 196783781: {
                    break block19;
                }
            }
            break;
        }
        var4_2 = dq.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = dq.ec - dq.bslz("bsrf", bslw(int ), (int)72)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == dq.bslz("bsrg", bsmb(int ), (int)60)) break;
            v1 /* !! */  = (long)dq.bslz("bsrh", bsmb(int ), (int)61);
        }
        var3_3 /* !! */  = dq.b;
        v2 /* !! */  = dq.ec;
        if (true) ** GOTO lbl21
        block21: while (true) {
            v2 /* !! */  = (long)(dq.bslz("bsrj", bslw(int ), (int)74) - dq.bslz("bsri", bslw(int ), (int)73));
lbl21:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 196783781: {
                    break block21;
                }
                case 1136624647: {
                    continue block21;
                }
            }
            break;
        }
        var2_4 = dq.a;
        if (var4_2) {
            throw null;
lbl29:
            // 1 sources

            return (boolean)dq.bslz("bsrk", bsmb(int ), (int)62);
        }
        ** while (var2_4 || var2_4)
lbl32:
        // 1 sources

        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        block8 : switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_1 = dq.ec - dq.bslz("bsrl", bslw(int ), (int)75)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == dq.bslz("bsrm", bsmb(int ), (int)63)) break;
                    v3 /* !! */  = (long)dq.bslz("bsrn", bsmb(int ), (int)64);
                }
                v4 = var1_1.getName();
                v5 /* !! */  = dq.ec;
                if (true) ** GOTO lbl45
                block24: while (true) {
                    v5 /* !! */  = (long)(v6 - dq.bslz("bsro", bslw(int ), (int)76));
lbl45:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -2053499357: {
                            v6 = dq.bslz("bsrp", bslw(int ), (int)77);
                            continue block24;
                        }
                        case 196783781: {
                            break block24;
                        }
                        case 1346493201: {
                            v6 = dq.bslz("bsrq", bslw(int ), (int)78);
                            continue block24;
                        }
                    }
                    break;
                }
                return v4.equalsIgnoreCase(var0);
            }
            case 0: {
                var3_3 /* !! */  = (int)dq.bslz("bsrr", bsmb(int ), (int)65);
                if (!var4_2) break;
                throw null;
            }
            case 1: {
                do {
                    var3_3 /* !! */  = (int)dq.bslz("bsrs", bsmb(int ), (int)66);
                } while (!var4_2);
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)dq.bslz("bsrt", bsmb(int ), (int)67);
                    if (!var4_2) break block8;
                    throw null;
                }
            }
            case 3: 
        }
        var3_3 /* !! */  = (int)dq.bslz("bsru", bsmb(int ), (int)68);
        ** while (!var4_2)
lbl72:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ boolean lambda$get$2(Class var0, ds var1_1) {
        v0 /* !! */  = dq.ec;
        if (true) ** GOTO lbl5
        block30: while (true) {
            v0 /* !! */  = (long)(dq.bslz("bspx", bslw(int ), (int)49) - dq.bslz("bspw", bslw(int ), (int)48));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 196783781: {
                    break block30;
                }
                case 1575250965: {
                    continue block30;
                }
            }
            break;
        }
        var4_2 = dq.c;
        v1 /* !! */  = dq.ec;
        if (true) ** GOTO lbl15
        block31: while (true) {
            v1 /* !! */  = (long)(dq.bslz("bspz", bslw(int ), (int)51) - dq.bslz("bspy", bslw(int ), (int)50));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1860589171: {
                    continue block31;
                }
                case 196783781: {
                    break block31;
                }
            }
            break;
        }
        var3_3 /* !! */  = dq.b;
        v2 /* !! */  = dq.ec;
        if (true) ** GOTO lbl25
        block32: while (true) {
            v2 /* !! */  = (long)(v3 - dq.bslz("bsqa", bslw(int ), (int)52));
lbl25:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -2127427851: {
                    v3 = dq.bslz("bsqb", bslw(int ), (int)53);
                    continue block32;
                }
                case -1026870813: {
                    v3 = dq.bslz("bsqc", bslw(int ), (int)54);
                    continue block32;
                }
                case -979555030: {
                    v3 = dq.bslz("bsqd", bslw(int ), (int)55);
                    continue block32;
                }
                case 196783781: {
                    break block32;
                }
            }
            break;
        }
        var2_4 = dq.a;
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        block14 : switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_2) {
                    throw null;
                    return (boolean)dq.bslz("bsqe", bsmb(int ), (int)49);
                }
                if (var2_4 || var2_4) ** continue;
                v4 /* !! */  = dq.ec;
                if (true) ** GOTO lbl50
                block34: while (true) {
                    v4 /* !! */  = (long)(dq.bslz("bsqg", bslw(int ), (int)57) - dq.bslz("bsqf", bslw(int ), (int)56));
lbl50:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -914106305: {
                            continue block34;
                        }
                        case 196783781: {
                            break block34;
                        }
                    }
                    break;
                }
                v5 = var1_1.getClass();
                v6 /* !! */  = dq.ec;
                if (true) ** GOTO lbl60
                block35: while (true) {
                    v6 /* !! */  = (long)(v7 - dq.bslz("bsqh", bslw(int ), (int)58));
lbl60:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -272563151: {
                            v7 = dq.bslz("bsqi", bslw(int ), (int)59);
                            continue block35;
                        }
                        case 196783781: {
                            break block35;
                        }
                        case 356532494: {
                            v7 = dq.bslz("bsqj", bslw(int ), (int)60);
                            continue block35;
                        }
                        case 1413771446: {
                            v7 = dq.bslz("bsqk", bslw(int ), (int)61);
                            continue block35;
                        }
                    }
                    break;
                }
                return var0.isAssignableFrom(v5);
            }
            case 0: {
                var3_3 /* !! */  = (int)dq.bslz("bsql", bsmb(int ), (int)50);
                if (!var4_2) break;
                throw null;
            }
            case 1: {
                do {
                    var3_3 /* !! */  = (int)dq.bslz("bsqm", bsmb(int ), (int)51);
                } while (!var4_2);
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)dq.bslz("bsqn", bsmb(int ), (int)52);
                    if (!var4_2) break block14;
                    throw null;
                }
            }
            case 3: 
        }
        var3_3 /* !! */  = (int)dq.bslz("bsqo", bsmb(int ), (int)53);
        ** while (!var4_2)
lbl90:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ ds lambda$get$1(ds var0) {
        v0 /* !! */  = dq.ec;
        if (true) ** GOTO lbl5
        block17: while (true) {
            v0 /* !! */  = (long)(v1 - dq.bslz("bsqp", bslw(int ), (int)62));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -398476706: {
                    v1 = dq.bslz("bsqq", bslw(int ), (int)63);
                    continue block17;
                }
                case 196783781: {
                    break block17;
                }
                case 599257961: {
                    v1 = dq.bslz("bsqr", bslw(int ), (int)64);
                    continue block17;
                }
                case 1688516557: {
                    v1 = dq.bslz("bsqs", bslw(int ), (int)65);
                    continue block17;
                }
            }
            break;
        }
        var3_1 = dq.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = dq.ec - dq.bslz("bsqt", bslw(int ), (int)66)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == dq.bslz("bsqu", bsmb(int ), (int)54)) break;
            v2 /* !! */  = (long)dq.bslz("bsqv", bsmb(int ), (int)55);
        }
        var2_2 /* !! */  = dq.b;
        v3 /* !! */  = dq.ec;
        if (true) ** GOTO lbl29
        block19: while (true) {
            v3 /* !! */  = (long)(v4 - dq.bslz("bsqw", bslw(int ), (int)67));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case 196783781: {
                    break block19;
                }
                case 659907868: {
                    v4 = dq.bslz("bsqx", bslw(int ), (int)68);
                    continue block19;
                }
                case 668688364: {
                    v4 = dq.bslz("bsqy", bslw(int ), (int)69);
                    continue block19;
                }
            }
            break;
        }
        var1_3 = dq.a;
        if (!var3_1) ** GOTO lbl45
        throw null;
        {
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var2_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return null;
                }
lbl45:
                // 1 sources

                if (var1_3 || var1_3) continue block20;
                return var0;
lbl47:
                // 2 sources

                case 0: {
                    var2_2 /* !! */  = (int)dq.bslz("bsqz", bsmb(int ), (int)56);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 1: {
                    do {
                        var2_2 /* !! */  = (int)dq.bslz("bsra", bsmb(int ), (int)57);
                    } while (!var3_1);
                    throw null;
                }
                case 2: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var2_2 /* !! */  = (int)dq.bslz("bsrb", bsmb(int ), (int)58);
                        if (!var3_1) ** GOTO lbl47
                        throw null;
                    }
                }
                case 3: 
            }
        }
        var2_2 /* !! */  = (int)dq.bslz("bsrc", bsmb(int ), (int)59);
        ** while (!var3_1)
lbl64:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void bsry() {
        dq.bsly[0] = -7094539827840212512L;
        dq.bsly[1] = -6427869146252125036L;
        dq.bsly[2] = -6555263810981227819L;
        dq.bsly[3] = -5042580970927220639L;
        dq.bsly[4] = 3922945758763859344L;
        dq.bsly[5] = 4678365970444908456L;
        dq.bsly[6] = 6257696363727075952L;
        dq.bsly[7] = 4871769970094528258L;
        dq.bsly[8] = 1260565800363029477L;
        dq.bsly[9] = -1065668758296268197L;
        dq.bsly[10] = -4450261044791945994L;
        dq.bsly[11] = -3646327555101308996L;
        dq.bsly[12] = -8726016298835895382L;
        dq.bsly[13] = -5658740102857555880L;
        dq.bsly[14] = 8373896125323942322L;
        dq.bsly[15] = 6694345788293940197L;
        dq.bsly[16] = -707289710188912136L;
        dq.bsly[17] = -8859981312607981762L;
        dq.bsly[18] = 3512724469953965362L;
        dq.bsly[19] = 6173695037356990340L;
        dq.bsly[20] = 6321812990429993613L;
        dq.bsly[21] = -1620191822811636333L;
        dq.bsly[22] = -8146576472091016711L;
        dq.bsly[23] = -415174883178430043L;
        dq.bsly[24] = -219997004907834329L;
        dq.bsly[25] = 7251273810596741467L;
        dq.bsly[26] = -1908380253413811805L;
        dq.bsly[27] = 6280506453451034408L;
        dq.bsly[28] = -4190239822418483279L;
        dq.bsly[29] = -4660710531440921809L;
        dq.bsly[30] = -4584629096811323988L;
        dq.bsly[31] = -1056982952108910392L;
        dq.bsly[32] = 4802175610614813613L;
        dq.bsly[33] = 6726139103098264148L;
        dq.bsly[34] = -3650872683822149228L;
        dq.bsly[35] = 1747170668606050753L;
        dq.bsly[36] = -8150668793735777083L;
        dq.bsly[37] = 351014320200002069L;
        dq.bsly[38] = 8558208222919476203L;
        dq.bsly[39] = -1251108404678500231L;
        dq.bsly[40] = -1171377995514966855L;
        dq.bsly[41] = 3681774640799804726L;
        dq.bsly[42] = -8756622223238802908L;
        dq.bsly[43] = -2883107994715273509L;
        dq.bsly[44] = 4254874819421676387L;
        dq.bsly[45] = 6458988298310231763L;
        dq.bsly[46] = 7467800912982388941L;
        dq.bsly[47] = 2401292567094008898L;
        dq.bsly[48] = -85453754755940457L;
        dq.bsly[49] = -8349936520561922945L;
        dq.bsly[50] = 4633268089700716787L;
        dq.bsly[51] = 2768391550049002944L;
        dq.bsly[52] = 4089667460042942490L;
        dq.bsly[53] = 6390812967620638370L;
        dq.bsly[54] = -6009618743871661021L;
        dq.bsly[55] = 8242309811880842540L;
        dq.bsly[56] = 678150152734796074L;
        dq.bsly[57] = -7508599768793087553L;
        dq.bsly[58] = 2147483754034510173L;
        dq.bsly[59] = -1043018456128193704L;
        dq.bsly[60] = 3763404660660656554L;
        dq.bsly[61] = 75111161253663295L;
        dq.bsly[62] = 5722538982689462283L;
        dq.bsly[63] = 3941338216185005161L;
        dq.bsly[64] = -8893621395012328829L;
        dq.bsly[65] = 65150086612973853L;
        dq.bsly[66] = -1535068026381372923L;
        dq.bsly[67] = 6407104765802125172L;
        dq.bsly[68] = -4911763463391724211L;
        dq.bsly[69] = -2164033858079753855L;
        dq.bsly[70] = -3438762667128788752L;
        dq.bsly[71] = -5536793028531955937L;
        dq.bsly[72] = -9061838073571502178L;
        dq.bsly[73] = 4262919523989870769L;
        dq.bsly[74] = 1958320299104677041L;
        dq.bsly[75] = 3525812500674631866L;
        dq.bsly[76] = 6836737794798828608L;
        dq.bsly[77] = -2480560089243988400L;
        dq.bsly[78] = 4982804934147108991L;
    }

    static {
        bsmc = new int[69];
        bsmd = new int[69];
        dq.bsrv();
        dq.bsrw();
        bslx = new long[79];
        bsly = new long[79];
        dq.bsrx();
        dq.bsry();
    }

    private static /* synthetic */ long bslw(int n2) {
        return bslx[n2] ^ bsly[n2];
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public List<ds> getModuleStructures() {
        boolean bl2;
        Object object = ec;
        boolean bl3 = true;
        block10: while (true) {
            CallSite callSite;
            if (!bl3 || (bl3 = false) || !true) {
                object = callSite - dq.bslz("bspd", bslw(int ), (int)40);
            }
            switch ((int)object) {
                case -882096450: {
                    callSite = dq.bslz("bspe", bslw(int ), (int)41);
                    continue block10;
                }
                case -682275604: {
                    callSite = dq.bslz("bspf", bslw(int ), (int)42);
                    continue block10;
                }
                case 196783781: {
                    break block10;
                }
                case 1247595716: {
                    callSite = dq.bslz("bspg", bslw(int ), (int)43);
                    continue block10;
                }
            }
            break;
        }
        boolean bl4 = c;
        while (true) {
            long l2;
            Object object2;
            if ((object2 = (l2 = ec - dq.bslz("bsph", bslw(int ), (int)44)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object2 == dq.bslz("bspi", bsmb(int ), (int)38)) break;
            object2 = dq.bslz("bspj", bsmb(int ), (int)39);
        }
        int n2 = b;
        while (true) {
            long l3;
            Object object3;
            if ((object3 = (l3 = ec - dq.bslz("bspk", bslw(int ), (int)45)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object3 == dq.bslz("bspl", bsmb(int ), (int)40)) {
                bl2 = a;
                if (bl4) {
                    throw null;
                }
                break;
            }
            object3 = dq.bslz("bspm", bsmb(int ), (int)41);
        }
        if (bl2) return null;
        if (bl2) return null;
        Object object4 = ec;
        block13: while (true) {
            switch ((int)object4) {
                case -719445177: {
                    object4 = dq.bslz("bspo", bslw(int ), (int)47) - dq.bslz("bspn", bslw(int ), (int)46);
                    continue block13;
                }
                case 196783781: {
                    return this.moduleStructures;
                }
            }
            break;
        }
        return this.moduleStructures;
    }

    private static /* synthetic */ void bsrv() {
        dq.bsmc[0] = -1919463862;
        dq.bsmc[1] = 212667715;
        dq.bsmc[2] = -2097223688;
        dq.bsmc[3] = -857403340;
        dq.bsmc[4] = 1329692774;
        dq.bsmc[5] = -1142461341;
        dq.bsmc[6] = 962076642;
        dq.bsmc[7] = 25518135;
        dq.bsmc[8] = -1800368048;
        dq.bsmc[9] = 1086616865;
        dq.bsmc[10] = 420575454;
        dq.bsmc[11] = -26166379;
        dq.bsmc[12] = -558071316;
        dq.bsmc[13] = -906332234;
        dq.bsmc[14] = -245393091;
        dq.bsmc[15] = 69623640;
        dq.bsmc[16] = -1613181183;
        dq.bsmc[17] = -464398623;
        dq.bsmc[18] = 1504097804;
        dq.bsmc[19] = 392946768;
        dq.bsmc[20] = -237057994;
        dq.bsmc[21] = -354368953;
        dq.bsmc[22] = 119934805;
        dq.bsmc[23] = 1243708274;
        dq.bsmc[24] = -1620301909;
        dq.bsmc[25] = 1276388925;
        dq.bsmc[26] = 798715457;
        dq.bsmc[27] = -1469122020;
        dq.bsmc[28] = 1676161315;
        dq.bsmc[29] = -1640194011;
        dq.bsmc[30] = 1426555513;
        dq.bsmc[31] = -1913192156;
        dq.bsmc[32] = 187800959;
        dq.bsmc[33] = -172873689;
        dq.bsmc[34] = -1183386043;
        dq.bsmc[35] = -178903727;
        dq.bsmc[36] = -1124765555;
        dq.bsmc[37] = -1928754559;
        dq.bsmc[38] = -1756609179;
        dq.bsmc[39] = 672606332;
        dq.bsmc[40] = -1762663788;
        dq.bsmc[41] = -484421019;
        dq.bsmc[42] = -490416115;
        dq.bsmc[43] = -1607279522;
        dq.bsmc[44] = 397128397;
        dq.bsmc[45] = -1283899354;
        dq.bsmc[46] = 271662646;
        dq.bsmc[47] = -1082564;
        dq.bsmc[48] = -1911523424;
        dq.bsmc[49] = -1013226541;
        dq.bsmc[50] = 1167383657;
        dq.bsmc[51] = 1624538451;
        dq.bsmc[52] = -1616766925;
        dq.bsmc[53] = -1742782258;
        dq.bsmc[54] = 1305489951;
        dq.bsmc[55] = 133958427;
        dq.bsmc[56] = 1994561743;
        dq.bsmc[57] = -950691920;
        dq.bsmc[58] = 1851946481;
        dq.bsmc[59] = -1771856359;
        dq.bsmc[60] = 303119217;
        dq.bsmc[61] = -1166189500;
        dq.bsmc[62] = 908872900;
        dq.bsmc[63] = -857442156;
        dq.bsmc[64] = 1392985270;
        dq.bsmc[65] = 555307033;
        dq.bsmc[66] = -1053565476;
        dq.bsmc[67] = 268051349;
        dq.bsmc[68] = 1511968133;
    }

    private static /* synthetic */ void bsrw() {
        dq.bsmd[0] = -1919463861;
        dq.bsmd[1] = -558247340;
        dq.bsmd[2] = -2097223687;
        dq.bsmd[3] = 1107263277;
        dq.bsmd[4] = -1329692775;
        dq.bsmd[5] = -941535821;
        dq.bsmd[6] = 962076643;
        dq.bsmd[7] = -130675853;
        dq.bsmd[8] = -1800368047;
        dq.bsmd[9] = 1680776535;
        dq.bsmd[10] = 420575455;
        dq.bsmd[11] = -653176300;
        dq.bsmd[12] = 558071315;
        dq.bsmd[13] = 1513318374;
        dq.bsmd[14] = -245393092;
        dq.bsmd[15] = -99042945;
        dq.bsmd[16] = 1613181182;
        dq.bsmd[17] = 749520444;
        dq.bsmd[18] = 1504097805;
        dq.bsmd[19] = -66614886;
        dq.bsmd[20] = -237057993;
        dq.bsmd[21] = -1989945881;
        dq.bsmd[22] = 119934805;
        dq.bsmd[23] = 1243708273;
        dq.bsmd[24] = -1620301912;
        dq.bsmd[25] = 1276388924;
        dq.bsmd[26] = 798715456;
        dq.bsmd[27] = 910669306;
        dq.bsmd[28] = 1676161314;
        dq.bsmd[29] = 114136816;
        dq.bsmd[30] = 1426555512;
        dq.bsmd[31] = -925882201;
        dq.bsmd[32] = -187800960;
        dq.bsmd[33] = 1366426414;
        dq.bsmd[34] = -1183386044;
        dq.bsmd[35] = -178903725;
        dq.bsmd[36] = -1124765556;
        dq.bsmd[37] = -1928754560;
        dq.bsmd[38] = -1756609180;
        dq.bsmd[39] = 648020289;
        dq.bsmd[40] = -1762663787;
        dq.bsmd[41] = 1245439960;
        dq.bsmd[42] = -490416114;
        dq.bsmd[43] = -1607279522;
        dq.bsmd[44] = 397128396;
        dq.bsmd[45] = -1283899354;
        dq.bsmd[46] = 271662646;
        dq.bsmd[47] = -1082563;
        dq.bsmd[48] = -1911523422;
        dq.bsmd[49] = -1013226541;
        dq.bsmd[50] = 1167383659;
        dq.bsmd[51] = 1624538449;
        dq.bsmd[52] = -1616766926;
        dq.bsmd[53] = -1742782260;
        dq.bsmd[54] = -1305489952;
        dq.bsmd[55] = 1020795495;
        dq.bsmd[56] = 1994561741;
        dq.bsmd[57] = -950691917;
        dq.bsmd[58] = 1851946483;
        dq.bsmd[59] = -1771856359;
        dq.bsmd[60] = 303119216;
        dq.bsmd[61] = -768784805;
        dq.bsmd[62] = 908872900;
        dq.bsmd[63] = -857442155;
        dq.bsmd[64] = 186953163;
        dq.bsmd[65] = 555307033;
        dq.bsmd[66] = -1053565476;
        dq.bsmd[67] = 268051350;
        dq.bsmd[68] = 1511968133;
    }

    private static /* synthetic */ void bsrx() {
        dq.bslx[0] = -6970536194745903599L;
        dq.bslx[1] = 4363855247458515208L;
        dq.bslx[2] = -7290583562639035341L;
        dq.bslx[3] = -6381926700421777214L;
        dq.bslx[4] = -96630414836230981L;
        dq.bslx[5] = -5328255546727945776L;
        dq.bslx[6] = 585318075548805974L;
        dq.bslx[7] = -1927863832496405588L;
        dq.bslx[8] = 5860727291524366119L;
        dq.bslx[9] = 8247694990446657186L;
        dq.bslx[10] = 7409070797751152254L;
        dq.bslx[11] = -5248199068727477698L;
        dq.bslx[12] = -8220694843558261034L;
        dq.bslx[13] = 1391628637020563455L;
        dq.bslx[14] = -1422222811716084381L;
        dq.bslx[15] = -574996286355055039L;
        dq.bslx[16] = 4316384616584978807L;
        dq.bslx[17] = 4510156468904189363L;
        dq.bslx[18] = -7239171829754886689L;
        dq.bslx[19] = -5321121732727354527L;
        dq.bslx[20] = -8837187299800739948L;
        dq.bslx[21] = -8861323427895064836L;
        dq.bslx[22] = 6007939601288350809L;
        dq.bslx[23] = -8045690370565280209L;
        dq.bslx[24] = 7630771217613024894L;
        dq.bslx[25] = 5242043055692486711L;
        dq.bslx[26] = 256090982058073774L;
        dq.bslx[27] = -8685319084564636660L;
        dq.bslx[28] = -2782973995372443692L;
        dq.bslx[29] = 3913594534765969057L;
        dq.bslx[30] = 1635036711032592534L;
        dq.bslx[31] = -1404644943455259714L;
        dq.bslx[32] = -8747068805216228901L;
        dq.bslx[33] = -1031263001373542852L;
        dq.bslx[34] = 1219458729538064123L;
        dq.bslx[35] = 2247851872285743074L;
        dq.bslx[36] = -474822504940223836L;
        dq.bslx[37] = -9000678908954791435L;
        dq.bslx[38] = 937189932789512049L;
        dq.bslx[39] = -8555010431802788756L;
        dq.bslx[40] = 8023367778597497260L;
        dq.bslx[41] = -1735455050124936253L;
        dq.bslx[42] = -7099390791153720671L;
        dq.bslx[43] = 2499984214234434440L;
        dq.bslx[44] = -5269147776703873611L;
        dq.bslx[45] = 6288971281541238530L;
        dq.bslx[46] = -4491765889744233330L;
        dq.bslx[47] = -2159105167240373067L;
        dq.bslx[48] = -4658899136334237683L;
        dq.bslx[49] = -7498227132283505469L;
        dq.bslx[50] = 4271437618362621928L;
        dq.bslx[51] = -2536276764974708020L;
        dq.bslx[52] = -5793336877371477668L;
        dq.bslx[53] = -5291435602517670457L;
        dq.bslx[54] = -3492582498821405049L;
        dq.bslx[55] = -7220275776688076322L;
        dq.bslx[56] = -3174917606181108317L;
        dq.bslx[57] = 6609343223491395509L;
        dq.bslx[58] = 8430523452252368810L;
        dq.bslx[59] = -9079144097100082959L;
        dq.bslx[60] = -601694604673498428L;
        dq.bslx[61] = -6017683334885928332L;
        dq.bslx[62] = 979216466566934661L;
        dq.bslx[63] = -179226675629917426L;
        dq.bslx[64] = -1659226504719610137L;
        dq.bslx[65] = -1428848539709198571L;
        dq.bslx[66] = -8371249599668087804L;
        dq.bslx[67] = -2283280468693139113L;
        dq.bslx[68] = 1733866342309580444L;
        dq.bslx[69] = 4601348002395234027L;
        dq.bslx[70] = 496973456567525467L;
        dq.bslx[71] = 8960841222932352170L;
        dq.bslx[72] = 2572880779600732447L;
        dq.bslx[73] = -7020791973112306381L;
        dq.bslx[74] = 8861971568419503726L;
        dq.bslx[75] = 2597548225137421701L;
        dq.bslx[76] = 4582754476549449140L;
        dq.bslx[77] = 8992635737431627047L;
        dq.bslx[78] = -3749124528646758974L;
    }

    private static /* synthetic */ int bsmb(int n2) {
        return bsmc[n2] ^ bsmd[n2];
    }

    public static /* synthetic */ CallSite bslz(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public <T extends ds> T get(Class<T> var1_1) {
        v0 /* !! */  = dq.ec;
        if (true) ** GOTO lbl5
        block47: while (true) {
            v0 /* !! */  = (long)(v1 - dq.bslz("bsno", bslw(int ), (int)11));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1664563815: {
                    v1 = dq.bslz("bsnp", bslw(int ), (int)12);
                    continue block47;
                }
                case -458232764: {
                    v1 = dq.bslz("bsnq", bslw(int ), (int)13);
                    continue block47;
                }
                case 196783781: {
                    break block47;
                }
                case 308526339: {
                    v1 = dq.bslz("bsnr", bslw(int ), (int)14);
                    continue block47;
                }
            }
            break;
        }
        var4_2 = dq.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = dq.ec - dq.bslz("bsns", bslw(int ), (int)15)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == dq.bslz("bsnt", bsmb(int ), (int)26)) break;
            v2 /* !! */  = (long)dq.bslz("bsnu", bsmb(int ), (int)27);
        }
        var3_3 /* !! */  = dq.b;
        v3 /* !! */  = dq.ec;
        if (true) ** GOTO lbl28
        block49: while (true) {
            v3 /* !! */  = (long)(v4 - dq.bslz("bsnv", bslw(int ), (int)16));
lbl28:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1337158135: {
                    v4 = dq.bslz("bsnw", bslw(int ), (int)17);
                    continue block49;
                }
                case -484669775: {
                    v4 = dq.bslz("bsnx", bslw(int ), (int)18);
                    continue block49;
                }
                case 196783781: {
                    break block49;
                }
                case 1808029938: {
                    v4 = dq.bslz("bsny", bslw(int ), (int)19);
                    continue block49;
                }
            }
            break;
        }
        var2_4 = dq.a;
        if (var4_2) {
            throw null;
lbl43:
            // 2 sources

            return null;
        }
        if (var2_4) ** GOTO lbl43
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        block12 : switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** continue;
                v5 /* !! */  = dq.ec;
                if (true) ** GOTO lbl54
                block51: while (true) {
                    v5 /* !! */  = (long)(v6 - dq.bslz("bsnz", bslw(int ), (int)20));
lbl54:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1664021292: {
                            v6 = dq.bslz("bsoa", bslw(int ), (int)21);
                            continue block51;
                        }
                        case 196783781: {
                            break block51;
                        }
                        case 795065281: {
                            v6 = dq.bslz("bsob", bslw(int ), (int)22);
                            continue block51;
                        }
                        case 947961095: {
                            v6 = dq.bslz("bsoc", bslw(int ), (int)23);
                            continue block51;
                        }
                    }
                    break;
                }
                v7 /* !! */  = dq.ec;
                if (true) ** GOTO lbl70
                block52: while (true) {
                    v7 /* !! */  = (long)(dq.bslz("bsoe", bslw(int ), (int)25) - dq.bslz("bsod", bslw(int ), (int)24));
lbl70:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case 196783781: {
                            break block52;
                        }
                        case 793946201: {
                            continue block52;
                        }
                    }
                    break;
                }
                v8 = this.moduleStructures.stream();
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_1 = dq.ec - dq.bslz("bsof", bslw(int ), (int)26)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == dq.bslz("bsog", bsmb(int ), (int)28)) break;
                    v9 /* !! */  = (long)dq.bslz("bsoh", bsmb(int ), (int)29);
                }
                v10 = (Predicate<ds>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$get$2(java.lang.Class ruhack.phobia.ds ), (Lruhack/phobia/ds;)Z)(var1_1);
                v11 /* !! */  = dq.ec;
                if (true) ** GOTO lbl86
                block54: while (true) {
                    v11 /* !! */  = (long)(v12 - dq.bslz("bsoi", bslw(int ), (int)27));
lbl86:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -967597994: {
                            v12 = dq.bslz("bsoj", bslw(int ), (int)28);
                            continue block54;
                        }
                        case -211174812: {
                            v12 = dq.bslz("bsok", bslw(int ), (int)29);
                            continue block54;
                        }
                        case 196783781: {
                            break block54;
                        }
                        case 1669605904: {
                            v12 = dq.bslz("bsol", bslw(int ), (int)30);
                            continue block54;
                        }
                    }
                    break;
                }
                v13 = v8.filter(v10);
                v14 = var1_1;
                while (true) {
                    if ((v15 /* !! */  = (cfr_temp_2 = dq.ec - dq.bslz("bsom", bslw(int ), (int)31)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v15 /* !! */  == dq.bslz("bson", bsmb(int ), (int)30)) break;
                    v15 /* !! */  = (long)dq.bslz("bsoo", bsmb(int ), (int)31);
                }
                Objects.requireNonNull(v14);
                v16 /* !! */  = dq.ec;
                if (true) ** GOTO lbl110
                block56: while (true) {
                    v16 /* !! */  = (long)(dq.bslz("bsoq", bslw(int ), (int)33) - dq.bslz("bsop", bslw(int ), (int)32));
lbl110:
                    // 2 sources

                    switch ((int)v16 /* !! */ ) {
                        case 196783781: {
                            break block56;
                        }
                        case 266817952: {
                            continue block56;
                        }
                    }
                    break;
                }
                v17 = (Function<ds, ds>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, cast(java.lang.Object ), (Lruhack/phobia/ds;)Lruhack/phobia/ds;)(v14);
                v18 /* !! */  = dq.ec;
                if (true) ** GOTO lbl120
                block57: while (true) {
                    v18 /* !! */  = (long)(dq.bslz("bsos", bslw(int ), (int)35) - dq.bslz("bsor", bslw(int ), (int)34));
lbl120:
                    // 2 sources

                    switch ((int)v18 /* !! */ ) {
                        case -8235817: {
                            continue block57;
                        }
                        case 196783781: {
                            break block57;
                        }
                    }
                    break;
                }
                v19 = v13.map(v17);
                v20 /* !! */  = dq.ec;
                if (true) ** GOTO lbl130
                block58: while (true) {
                    v20 /* !! */  = (long)(v21 - dq.bslz("bsot", bslw(int ), (int)36));
lbl130:
                    // 2 sources

                    switch ((int)v20 /* !! */ ) {
                        case -1335593362: {
                            v21 = dq.bslz("bsou", bslw(int ), (int)37);
                            continue block58;
                        }
                        case 196783781: {
                            break block58;
                        }
                        case 925635953: {
                            v21 = dq.bslz("bsov", bslw(int ), (int)38);
                            continue block58;
                        }
                    }
                    break;
                }
                v22 = v19.findFirst();
                while (true) {
                    if ((v23 /* !! */  = (cfr_temp_3 = dq.ec - dq.bslz("bsow", bslw(int ), (int)39)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v23 /* !! */  == dq.bslz("bsox", bsmb(int ), (int)32)) break;
                    v23 /* !! */  = (long)dq.bslz("bsoy", bsmb(int ), (int)33);
                }
                return (T)((ds)v22.orElse(null));
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)dq.bslz("bsoz", bsmb(int ), (int)34);
                    if (!var4_2) break block12;
                    throw null;
                }
            }
            case 1: {
                var3_3 /* !! */  = (int)dq.bslz("bspa", bsmb(int ), (int)35);
                if (!var4_2) break;
                throw null;
            }
            case 2: {
                do {
                    var3_3 /* !! */  = (int)dq.bslz("bspb", bsmb(int ), (int)36);
                } while (!var4_2);
                throw null;
            }
            case 3: 
        }
        var3_3 /* !! */  = (int)dq.bslz("bspc", bsmb(int ), (int)37);
        ** while (!var4_2)
lbl163:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public dq(List<ds> var1_1) {
        var3_2 /* !! */  = dq.b;
        var2_3 = dq.a;
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                super();
                this.moduleStructures = var1_1;
                return;
            }
            case 0: {
                var3_2 /* !! */  = (int)dq.bslz("bspt", bsmb(int ), (int)46);
                break;
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_2 /* !! */  = (int)dq.bslz("bspu", bsmb(int ), (int)47);
                    break;
                }
            }
            case 2: 
        }
        var3_2 /* !! */  = (int)dq.bslz("bspv", bsmb(int ), (int)48);
        ** while (true)
    }
}

