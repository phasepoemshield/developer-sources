/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

final class mo$SearchAction
extends Enum<mo$SearchAction> {
    private static final /* synthetic */ mo$SearchAction[] $VALUES;
    public static final int b;
    public static final /* enum */ mo$SearchAction PASTE;
    private static int[] fiju;
    private static long[] fijp;
    public static final /* enum */ mo$SearchAction COPY;
    public static final /* enum */ mo$SearchAction NONE;
    public static final boolean a;
    public static final /* enum */ mo$SearchAction SELECT;
    public static final boolean c;
    private static long[] fijo;
    static final long mc = -2113336330033240747L;
    private static int[] fijt;

    private static /* synthetic */ void fiml() {
        mo$SearchAction.fijo[0] = -1066539238995161085L;
        mo$SearchAction.fijo[1] = 4579581042683620599L;
        mo$SearchAction.fijo[2] = -1903247088093410765L;
        mo$SearchAction.fijo[3] = 3420210890720905535L;
        mo$SearchAction.fijo[4] = -934686236268606246L;
        mo$SearchAction.fijo[5] = 1794238702782465107L;
        mo$SearchAction.fijo[6] = -3123997223483464392L;
        mo$SearchAction.fijo[7] = 3510240492512055000L;
        mo$SearchAction.fijo[8] = 5979978054169255417L;
        mo$SearchAction.fijo[9] = 3803061516268382293L;
        mo$SearchAction.fijo[10] = 6666745438413208817L;
        mo$SearchAction.fijo[11] = 3646026393298977888L;
        mo$SearchAction.fijo[12] = 1944793414577582261L;
        mo$SearchAction.fijo[13] = -4784477212187841596L;
        mo$SearchAction.fijo[14] = 2459112764924921308L;
        mo$SearchAction.fijo[15] = -4992938279791305527L;
        mo$SearchAction.fijo[16] = 5378961792313386269L;
        mo$SearchAction.fijo[17] = -1588899718273945922L;
        mo$SearchAction.fijo[18] = 3138662381388329139L;
        mo$SearchAction.fijo[19] = 8185776108636127277L;
        mo$SearchAction.fijo[20] = -148774356167651633L;
        mo$SearchAction.fijo[21] = 5188505796245153734L;
        mo$SearchAction.fijo[22] = -2563641881636091968L;
        mo$SearchAction.fijo[23] = 2435014824587880686L;
        mo$SearchAction.fijo[24] = -6704366874405135360L;
        mo$SearchAction.fijo[25] = -1636997271326427002L;
        mo$SearchAction.fijo[26] = 2942848188185449524L;
        mo$SearchAction.fijo[27] = 1048873468720712614L;
        mo$SearchAction.fijo[28] = -247249433342749030L;
        mo$SearchAction.fijo[29] = 5464279394849039697L;
        mo$SearchAction.fijo[30] = 6020170094478471422L;
        mo$SearchAction.fijo[31] = 3992791101614928170L;
        mo$SearchAction.fijo[32] = -7482374597955025197L;
    }

    private static /* synthetic */ void fimk() {
        mo$SearchAction.fiju[0] = -1002258039;
        mo$SearchAction.fiju[1] = -1979703909;
        mo$SearchAction.fiju[2] = 1854376962;
        mo$SearchAction.fiju[3] = -1397889619;
        mo$SearchAction.fiju[4] = -664689600;
        mo$SearchAction.fiju[5] = 135000966;
        mo$SearchAction.fiju[6] = -312530912;
        mo$SearchAction.fiju[7] = 265623360;
        mo$SearchAction.fiju[8] = -1041689909;
        mo$SearchAction.fiju[9] = 1258217726;
        mo$SearchAction.fiju[10] = -323434054;
        mo$SearchAction.fiju[11] = 824274541;
        mo$SearchAction.fiju[12] = 908007806;
        mo$SearchAction.fiju[13] = -1236457647;
        mo$SearchAction.fiju[14] = -1465444048;
        mo$SearchAction.fiju[15] = 1865359516;
        mo$SearchAction.fiju[16] = -336229530;
        mo$SearchAction.fiju[17] = -724276519;
        mo$SearchAction.fiju[18] = -650240429;
        mo$SearchAction.fiju[19] = 621367124;
        mo$SearchAction.fiju[20] = -678123014;
        mo$SearchAction.fiju[21] = -322316057;
        mo$SearchAction.fiju[22] = -444033520;
        mo$SearchAction.fiju[23] = -1873469635;
        mo$SearchAction.fiju[24] = -966516166;
        mo$SearchAction.fiju[25] = -206975517;
        mo$SearchAction.fiju[26] = 1216494662;
        mo$SearchAction.fiju[27] = 883652915;
        mo$SearchAction.fiju[28] = 214136379;
        mo$SearchAction.fiju[29] = 1896549701;
        mo$SearchAction.fiju[30] = 995466617;
        mo$SearchAction.fiju[31] = 563055209;
        mo$SearchAction.fiju[32] = -229907467;
        mo$SearchAction.fiju[33] = 2121577368;
    }

    public static /* synthetic */ CallSite fijq(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private mo$SearchAction() {
        var4_3 /* !! */  = mo$SearchAction.b;
        var3_4 = mo$SearchAction.a;
        super(var1_1, var2_2);
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                return;
            }
lbl8:
            // 2 sources

            case 0: {
                var4_3 /* !! */  = (int)mo$SearchAction.fijq("fild", fijs(int ), (int)16);
                break;
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_3 /* !! */  = (int)mo$SearchAction.fijq("file", fijs(int ), (int)17);
                    ** GOTO lbl8
                    break;
                }
            }
            case 2: 
        }
        var4_3 /* !! */  = (int)mo$SearchAction.fijq("filf", fijs(int ), (int)18);
        ** while (true)
    }

    private static /* synthetic */ int fijs(int n2) {
        return fijt[n2] ^ fiju[n2];
    }

    static {
        fijt = new int[34];
        fiju = new int[34];
        mo$SearchAction.fimj();
        mo$SearchAction.fimk();
        fijo = new long[33];
        fijp = new long[33];
        mo$SearchAction.fiml();
        mo$SearchAction.fimm();
        NONE = new mo$SearchAction();
        SELECT = new mo$SearchAction();
        COPY = new mo$SearchAction();
        PASTE = new mo$SearchAction();
        $VALUES = mo$SearchAction.$values();
    }

    private static /* synthetic */ long fijn(int n2) {
        return fijo[n2] ^ fijp[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static mo$SearchAction[] values() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = mo$SearchAction.mc - mo$SearchAction.fijq("fijr", fijn(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == mo$SearchAction.fijq("fijv", fijs(int ), (int)0)) break;
            v0 /* !! */  = (long)mo$SearchAction.fijq("fijw", fijs(int ), (int)1);
        }
        var2 = mo$SearchAction.c;
        v1 /* !! */  = mo$SearchAction.mc;
        if (true) ** GOTO lbl12
        block17: while (true) {
            v1 /* !! */  = (long)(v2 - mo$SearchAction.fijq("fijx", fijn(int ), (int)1));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -987151480: {
                    v2 = mo$SearchAction.fijq("fijy", fijn(int ), (int)2);
                    continue block17;
                }
                case -93749824: {
                    v2 = mo$SearchAction.fijq("fijz", fijn(int ), (int)3);
                    continue block17;
                }
                case 91284821: {
                    break block17;
                }
                case 325668482: {
                    v2 = mo$SearchAction.fijq("fika", fijn(int ), (int)4);
                    continue block17;
                }
            }
            break;
        }
        var1_1 = mo$SearchAction.b;
        v3 /* !! */  = mo$SearchAction.mc;
        if (true) ** GOTO lbl29
        block18: while (true) {
            v3 /* !! */  = (long)(mo$SearchAction.fijq("fikc", fijn(int ), (int)6) - mo$SearchAction.fijq("fikb", fijn(int ), (int)5));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case 91284821: {
                    break block18;
                }
                case 1531087696: {
                    continue block18;
                }
            }
            break;
        }
        var0_2 = mo$SearchAction.a;
        if (var2) {
            throw null;
lbl37:
            // 1 sources

            return null;
        }
        ** while (var0_2 || var0_2)
lbl40:
        // 1 sources

        while (true) {
            if ((v4 /* !! */  = (cfr_temp_1 = mo$SearchAction.mc - mo$SearchAction.fijq("fikd", fijn(int ), (int)7)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v4 /* !! */  == mo$SearchAction.fijq("fike", fijs(int ), (int)2)) break;
            v4 /* !! */  = (long)mo$SearchAction.fijq("fikf", fijs(int ), (int)3);
        }
        v5 /* !! */  = mo$SearchAction.mc;
        if (true) ** GOTO lbl50
        block21: while (true) {
            v5 /* !! */  = (long)(v6 - mo$SearchAction.fijq("fikg", fijn(int ), (int)8));
lbl50:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -1648893340: {
                    v6 = mo$SearchAction.fijq("fikh", fijn(int ), (int)9);
                    continue block21;
                }
                case -522719397: {
                    v6 = mo$SearchAction.fijq("fiki", fijn(int ), (int)10);
                    continue block21;
                }
                case 91284821: {
                    break block21;
                }
                case 1354519003: {
                    v6 = mo$SearchAction.fijq("fikj", fijn(int ), (int)11);
                    continue block21;
                }
            }
            break;
        }
        return (mo$SearchAction[])mo$SearchAction.$VALUES.clone();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static mo$SearchAction valueOf(String var0) {
        v0 /* !! */  = mo$SearchAction.mc;
        if (true) ** GOTO lbl5
        block15: while (true) {
            v0 /* !! */  = (long)(v1 - mo$SearchAction.fijq("fiko", fijn(int ), (int)12));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -914055028: {
                    v1 = mo$SearchAction.fijq("fikp", fijn(int ), (int)13);
                    continue block15;
                }
                case -137488353: {
                    v1 = mo$SearchAction.fijq("fikq", fijn(int ), (int)14);
                    continue block15;
                }
                case 91284821: {
                    break block15;
                }
            }
            break;
        }
        var3_1 = mo$SearchAction.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = mo$SearchAction.mc - mo$SearchAction.fijq("fikr", fijn(int ), (int)15)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == mo$SearchAction.fijq("fiks", fijs(int ), (int)8)) break;
            v2 /* !! */  = (long)mo$SearchAction.fijq("fikt", fijs(int ), (int)9);
        }
        var2_2 /* !! */  = mo$SearchAction.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_1 = mo$SearchAction.mc - mo$SearchAction.fijq("fiku", fijn(int ), (int)16)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == mo$SearchAction.fijq("fikv", fijs(int ), (int)10)) break;
                    v3 /* !! */  = (long)mo$SearchAction.fijq("fikw", fijs(int ), (int)11);
                }
                var1_3 = mo$SearchAction.a;
                if (var3_1) {
                    throw null;
                    return null;
                }
                if (var1_3 || var1_3) ** continue;
                v4 /* !! */  = mo$SearchAction.mc;
                if (true) ** GOTO lbl41
                block19: while (true) {
                    v4 /* !! */  = (long)(mo$SearchAction.fijq("fiky", fijn(int ), (int)18) - mo$SearchAction.fijq("fikx", fijn(int ), (int)17));
lbl41:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -2018012130: {
                            continue block19;
                        }
                        case 91284821: {
                            break block19;
                        }
                    }
                    break;
                }
                return Enum.valueOf(mo$SearchAction.class, var0);
            }
            case 0: {
                var2_2 /* !! */  = (int)mo$SearchAction.fijq("fikz", fijs(int ), (int)12);
                if (var3_1) {
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
                    var2_2 /* !! */  = (int)mo$SearchAction.fijq("fila", fijs(int ), (int)13);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
lbl57:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)mo$SearchAction.fijq("filb", fijs(int ), (int)14);
                if (!var3_1) break;
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)mo$SearchAction.fijq("filc", fijs(int ), (int)15);
        ** while (!var3_1)
lbl64:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ mo$SearchAction[] $values() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = mo$SearchAction.mc - mo$SearchAction.fijq("filg", fijn(int ), (int)19)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == mo$SearchAction.fijq("filh", fijs(int ), (int)19)) break;
            v0 /* !! */  = (long)mo$SearchAction.fijq("fili", fijs(int ), (int)20);
        }
        var2 = mo$SearchAction.c;
        v1 /* !! */  = mo$SearchAction.mc;
        if (true) ** GOTO lbl12
        block29: while (true) {
            v1 /* !! */  = (long)(v2 - mo$SearchAction.fijq("filj", fijn(int ), (int)20));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -267462056: {
                    v2 = mo$SearchAction.fijq("filk", fijn(int ), (int)21);
                    continue block29;
                }
                case 91284821: {
                    break block29;
                }
                case 1176452895: {
                    v2 = mo$SearchAction.fijq("fill", fijn(int ), (int)22);
                    continue block29;
                }
            }
            break;
        }
        var1_1 /* !! */  = mo$SearchAction.b;
        v3 /* !! */  = mo$SearchAction.mc;
        if (true) ** GOTO lbl26
        block30: while (true) {
            v3 /* !! */  = (long)(mo$SearchAction.fijq("filn", fijn(int ), (int)24) - mo$SearchAction.fijq("film", fijn(int ), (int)23));
lbl26:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1895867367: {
                    continue block30;
                }
                case 91284821: {
                    break block30;
                }
            }
            break;
        }
        var0_2 = mo$SearchAction.a;
        if (var2) {
            throw null;
lbl34:
            // 1 sources

            return null;
        }
        ** while (var0_2 || var0_2)
lbl37:
        // 1 sources

        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v4 = new mo$SearchAction[4];
                v5 = mo$SearchAction.fijq("filo", fijs(int ), (int)21);
                v6 /* !! */  = mo$SearchAction.mc;
                if (true) ** GOTO lbl46
                block32: while (true) {
                    v6 /* !! */  = (long)(mo$SearchAction.fijq("filq", fijn(int ), (int)26) - mo$SearchAction.fijq("filp", fijn(int ), (int)25));
lbl46:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -565590475: {
                            continue block32;
                        }
                        case 91284821: {
                            break block32;
                        }
                    }
                    break;
                }
                v4[v5] = mo$SearchAction.NONE;
                v7 = mo$SearchAction.fijq("filr", fijs(int ), (int)22);
                v8 /* !! */  = mo$SearchAction.mc;
                if (true) ** GOTO lbl57
                block33: while (true) {
                    v8 /* !! */  = (long)(v9 - mo$SearchAction.fijq("fils", fijn(int ), (int)27));
lbl57:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -1729890581: {
                            v9 = mo$SearchAction.fijq("filt", fijn(int ), (int)28);
                            continue block33;
                        }
                        case 91284821: {
                            break block33;
                        }
                        case 1645534138: {
                            v9 = mo$SearchAction.fijq("filu", fijn(int ), (int)29);
                            continue block33;
                        }
                    }
                    break;
                }
                v4[v7] = mo$SearchAction.SELECT;
                v10 = mo$SearchAction.fijq("filv", fijs(int ), (int)23);
                v11 /* !! */  = mo$SearchAction.mc;
                if (true) ** GOTO lbl72
                block34: while (true) {
                    v11 /* !! */  = (long)(mo$SearchAction.fijq("filx", fijn(int ), (int)31) - mo$SearchAction.fijq("filw", fijn(int ), (int)30));
lbl72:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -23434898: {
                            continue block34;
                        }
                        case 91284821: {
                            break block34;
                        }
                    }
                    break;
                }
                v4[v10] = mo$SearchAction.COPY;
                v12 = mo$SearchAction.fijq("fily", fijs(int ), (int)24);
                while (true) {
                    if ((v13 = (cfr_temp_1 = mo$SearchAction.mc - mo$SearchAction.fijq("filz", fijn(int ), (int)32)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v13 == mo$SearchAction.fijq("fima", fijs(int ), (int)25)) break;
                    v13 = 1271624564;
                }
                v4[v12] = mo$SearchAction.PASTE;
                return v4;
            }
lbl87:
            // 3 sources

            case 0: {
                var1_1 /* !! */  = (int)mo$SearchAction.fijq("fimb", fijs(int ), (int)26);
                if (var2) {
                    throw null;
                }
            }
            case 1: {
                var1_1 /* !! */  = (int)mo$SearchAction.fijq("fimc", fijs(int ), (int)27);
                if (!var2) ** GOTO lbl87
                throw null;
            }
            case 2: {
                var1_1 /* !! */  = (int)mo$SearchAction.fijq("fimd", fijs(int ), (int)28);
                if (!var2) ** GOTO lbl87
                throw null;
            }
            case 3: 
        }
        do {
            var1_1 /* !! */  = (int)mo$SearchAction.fijq("fime", fijs(int ), (int)29);
        } while (!var2);
        throw null;
    }

    private static /* synthetic */ void fimj() {
        mo$SearchAction.fijt[0] = 1002258038;
        mo$SearchAction.fijt[1] = -273814228;
        mo$SearchAction.fijt[2] = -1854376963;
        mo$SearchAction.fijt[3] = -708664183;
        mo$SearchAction.fijt[4] = -664689599;
        mo$SearchAction.fijt[5] = 135000967;
        mo$SearchAction.fijt[6] = -312530909;
        mo$SearchAction.fijt[7] = 265623362;
        mo$SearchAction.fijt[8] = 1041689908;
        mo$SearchAction.fijt[9] = -1018921105;
        mo$SearchAction.fijt[10] = 323434053;
        mo$SearchAction.fijt[11] = 546491843;
        mo$SearchAction.fijt[12] = 908007806;
        mo$SearchAction.fijt[13] = -1236457646;
        mo$SearchAction.fijt[14] = -1465444046;
        mo$SearchAction.fijt[15] = 1865359519;
        mo$SearchAction.fijt[16] = -336229530;
        mo$SearchAction.fijt[17] = -724276517;
        mo$SearchAction.fijt[18] = -650240430;
        mo$SearchAction.fijt[19] = 621367125;
        mo$SearchAction.fijt[20] = -1423078170;
        mo$SearchAction.fijt[21] = -322316057;
        mo$SearchAction.fijt[22] = -444033519;
        mo$SearchAction.fijt[23] = -1873469633;
        mo$SearchAction.fijt[24] = -966516167;
        mo$SearchAction.fijt[25] = 206975516;
        mo$SearchAction.fijt[26] = 1216494662;
        mo$SearchAction.fijt[27] = 883652912;
        mo$SearchAction.fijt[28] = 214136376;
        mo$SearchAction.fijt[29] = 1896549703;
        mo$SearchAction.fijt[30] = 995466617;
        mo$SearchAction.fijt[31] = 563055208;
        mo$SearchAction.fijt[32] = -229907465;
        mo$SearchAction.fijt[33] = 2121577371;
    }

    private static /* synthetic */ void fimm() {
        mo$SearchAction.fijp[0] = -2848077670250425662L;
        mo$SearchAction.fijp[1] = -4152396507596794134L;
        mo$SearchAction.fijp[2] = 7607099760443832082L;
        mo$SearchAction.fijp[3] = 5217390896280150705L;
        mo$SearchAction.fijp[4] = -3104188425494329295L;
        mo$SearchAction.fijp[5] = -1001921441439534521L;
        mo$SearchAction.fijp[6] = -3907023573091070308L;
        mo$SearchAction.fijp[7] = 1603645718379143161L;
        mo$SearchAction.fijp[8] = 7669986997902540283L;
        mo$SearchAction.fijp[9] = 6757229611937316831L;
        mo$SearchAction.fijp[10] = -2658173293911865240L;
        mo$SearchAction.fijp[11] = 989632399390708335L;
        mo$SearchAction.fijp[12] = 5912117258822769229L;
        mo$SearchAction.fijp[13] = 1646594102943418622L;
        mo$SearchAction.fijp[14] = 4711117879596257577L;
        mo$SearchAction.fijp[15] = 4771984770603531654L;
        mo$SearchAction.fijp[16] = 9035513404951593605L;
        mo$SearchAction.fijp[17] = -3576297856424009634L;
        mo$SearchAction.fijp[18] = -7689712831233142443L;
        mo$SearchAction.fijp[19] = -5053471786842427065L;
        mo$SearchAction.fijp[20] = 1647806490184097692L;
        mo$SearchAction.fijp[21] = 2362645880491681202L;
        mo$SearchAction.fijp[22] = 872129238751994889L;
        mo$SearchAction.fijp[23] = -8963479765888573883L;
        mo$SearchAction.fijp[24] = 7242519090582398163L;
        mo$SearchAction.fijp[25] = -8375162249011531278L;
        mo$SearchAction.fijp[26] = 4681495736308853246L;
        mo$SearchAction.fijp[27] = -5996148611304425691L;
        mo$SearchAction.fijp[28] = -7973233846394568574L;
        mo$SearchAction.fijp[29] = 4876621221967237349L;
        mo$SearchAction.fijp[30] = -6913142334562676169L;
        mo$SearchAction.fijp[31] = 8347387945924689667L;
        mo$SearchAction.fijp[32] = -5052213594079416648L;
    }
}

