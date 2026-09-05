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
import ruhack.phobia.kg;

final class py$SliderTrack
extends Record {
    static final long rw = -7142787212951709659L;
    private static int[] jttw;
    private final float width;
    public static final int b;
    private static long[] jtui;
    private final float x;
    private final float height;
    private final float y;
    private static long[] jtuh;
    public static final boolean c;
    private final kg setting;
    public static final boolean a;
    private static int[] jttv;

    private static /* synthetic */ void jubm() {
        py$SliderTrack.jtuh[0] = -2444059247222137099L;
        py$SliderTrack.jtuh[1] = -536880877807840670L;
        py$SliderTrack.jtuh[2] = 4581913786975105580L;
        py$SliderTrack.jtuh[3] = -6473109613881179322L;
        py$SliderTrack.jtuh[4] = 6875069522687418028L;
        py$SliderTrack.jtuh[5] = 6288981024403558163L;
        py$SliderTrack.jtuh[6] = 5649644605640229113L;
        py$SliderTrack.jtuh[7] = -1138537925111187565L;
        py$SliderTrack.jtuh[8] = 5817804631421036713L;
        py$SliderTrack.jtuh[9] = 3169537286480307579L;
        py$SliderTrack.jtuh[10] = 4234206360598947687L;
        py$SliderTrack.jtuh[11] = -3088882591695794448L;
        py$SliderTrack.jtuh[12] = -6165708793189582238L;
        py$SliderTrack.jtuh[13] = -7045434863335186910L;
        py$SliderTrack.jtuh[14] = 2268162596346516173L;
        py$SliderTrack.jtuh[15] = 8466754710802881917L;
        py$SliderTrack.jtuh[16] = -4670298176958700158L;
        py$SliderTrack.jtuh[17] = -2246113116004878150L;
        py$SliderTrack.jtuh[18] = 9151323527717479339L;
        py$SliderTrack.jtuh[19] = 2787849185610205185L;
        py$SliderTrack.jtuh[20] = 4609526315910495528L;
        py$SliderTrack.jtuh[21] = 1736768087064748931L;
        py$SliderTrack.jtuh[22] = 6363397265533760620L;
        py$SliderTrack.jtuh[23] = 2814598161724897550L;
        py$SliderTrack.jtuh[24] = 9099449022884492557L;
        py$SliderTrack.jtuh[25] = -2319275156932517199L;
        py$SliderTrack.jtuh[26] = 7598054445483719789L;
        py$SliderTrack.jtuh[27] = 1407565752793690846L;
        py$SliderTrack.jtuh[28] = -3367580443476100851L;
        py$SliderTrack.jtuh[29] = 3252947620028639667L;
        py$SliderTrack.jtuh[30] = -966292098915665697L;
        py$SliderTrack.jtuh[31] = -4100345684313505225L;
        py$SliderTrack.jtuh[32] = 8001326265404187991L;
        py$SliderTrack.jtuh[33] = 1061265656758606912L;
        py$SliderTrack.jtuh[34] = -7909864316531257685L;
        py$SliderTrack.jtuh[35] = 3228535416546210318L;
        py$SliderTrack.jtuh[36] = 6205002671891004217L;
        py$SliderTrack.jtuh[37] = 251375428959634289L;
        py$SliderTrack.jtuh[38] = -6015313183842551905L;
        py$SliderTrack.jtuh[39] = -967520708070827958L;
        py$SliderTrack.jtuh[40] = 5077229482018250982L;
        py$SliderTrack.jtuh[41] = 6469771182933173158L;
        py$SliderTrack.jtuh[42] = 7765965498744909208L;
        py$SliderTrack.jtuh[43] = -4287254313980144521L;
        py$SliderTrack.jtuh[44] = -984591023923949778L;
        py$SliderTrack.jtuh[45] = -3723243640656698162L;
        py$SliderTrack.jtuh[46] = 1135084643519488746L;
        py$SliderTrack.jtuh[47] = -2001534208311742530L;
        py$SliderTrack.jtuh[48] = 4539083886370488154L;
        py$SliderTrack.jtuh[49] = 913371342713963567L;
        py$SliderTrack.jtuh[50] = -5925272022295591033L;
        py$SliderTrack.jtuh[51] = -6697400005390083448L;
        py$SliderTrack.jtuh[52] = 2456248550703174754L;
        py$SliderTrack.jtuh[53] = 1295113079170496380L;
        py$SliderTrack.jtuh[54] = -5638933984721930066L;
        py$SliderTrack.jtuh[55] = 6189313493890050853L;
        py$SliderTrack.jtuh[56] = 3929913684335225230L;
        py$SliderTrack.jtuh[57] = 5810460452491145853L;
        py$SliderTrack.jtuh[58] = -7224098005338601932L;
        py$SliderTrack.jtuh[59] = 700304565352712926L;
        py$SliderTrack.jtuh[60] = -7494201564910647062L;
        py$SliderTrack.jtuh[61] = -7272220239666425204L;
        py$SliderTrack.jtuh[62] = 199141365403771046L;
        py$SliderTrack.jtuh[63] = 2419982552551238252L;
        py$SliderTrack.jtuh[64] = 3484693713974294542L;
        py$SliderTrack.jtuh[65] = -2725309982428836768L;
        py$SliderTrack.jtuh[66] = 6191397917237605064L;
        py$SliderTrack.jtuh[67] = -925778398207734287L;
        py$SliderTrack.jtuh[68] = 6671254424079589747L;
        py$SliderTrack.jtuh[69] = -6551154459509930519L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public float height() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = py$SliderTrack.rw - py$SliderTrack.jttx("juan", jtug(int ), (int)59)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == py$SliderTrack.jttx("juao", jttu(int ), (int)62)) break;
            v0 /* !! */  = (long)py$SliderTrack.jttx("juap", jttu(int ), (int)63);
        }
        var3_1 = py$SliderTrack.c;
        v1 /* !! */  = py$SliderTrack.rw;
        if (true) ** GOTO lbl12
        block23: while (true) {
            v1 /* !! */  = (long)(v2 - py$SliderTrack.jttx("juaq", jtug(int ), (int)60));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1639685681: {
                    v2 = py$SliderTrack.jttx("juar", jtug(int ), (int)61);
                    continue block23;
                }
                case -1177577435: {
                    break block23;
                }
                case 393546096: {
                    v2 = py$SliderTrack.jttx("juas", jtug(int ), (int)62);
                    continue block23;
                }
            }
            break;
        }
        var2_2 /* !! */  = py$SliderTrack.b;
        v3 /* !! */  = py$SliderTrack.rw;
        if (true) ** GOTO lbl26
        block24: while (true) {
            v3 /* !! */  = (long)(v4 - py$SliderTrack.jttx("juau", jtug(int ), (int)63));
lbl26:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -2057280245: {
                    v4 = py$SliderTrack.jttx("juav", jtug(int ), (int)64);
                    continue block24;
                }
                case -1177577435: {
                    break block24;
                }
                case -13482130: {
                    v4 = py$SliderTrack.jttx("juaw", jtug(int ), (int)65);
                    continue block24;
                }
            }
            break;
        }
        var1_3 = py$SliderTrack.a;
        if (var3_1) {
            throw null;
lbl38:
            // 2 sources

            return (float)py$SliderTrack.jttx("juax", jtyi(int ), (int)64);
        }
        if (var1_3) ** GOTO lbl38
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                v5 /* !! */  = py$SliderTrack.rw;
                if (true) ** GOTO lbl49
                block26: while (true) {
                    v5 /* !! */  = (long)(v6 - py$SliderTrack.jttx("juaz", jtug(int ), (int)66));
lbl49:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1177577435: {
                            break block26;
                        }
                        case -582305848: {
                            v6 = py$SliderTrack.jttx("juba", jtug(int ), (int)67);
                            continue block26;
                        }
                        case -358499809: {
                            v6 = py$SliderTrack.jttx("jubb", jtug(int ), (int)68);
                            continue block26;
                        }
                        case 1059095793: {
                            v6 = py$SliderTrack.jttx("jubc", jtug(int ), (int)69);
                            continue block26;
                        }
                    }
                    break;
                }
                return this.height;
            }
lbl62:
            // 2 sources

            case 0: {
                do {
                    var2_2 /* !! */  = (int)py$SliderTrack.jttx("jube", jttu(int ), (int)65);
                } while (!var3_1);
                throw null;
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)py$SliderTrack.jttx("jubf", jttu(int ), (int)66);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)py$SliderTrack.jttx("jubg", jttu(int ), (int)67);
                if (!var3_1) ** GOTO lbl62
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)py$SliderTrack.jttx("jubh", jttu(int ), (int)68);
        ** while (!var3_1)
lbl79:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public float y() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = py$SliderTrack.rw - py$SliderTrack.jttx("jtyu", jtug(int ), (int)43)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == py$SliderTrack.jttx("jtyv", jttu(int ), (int)44)) break;
            v0 /* !! */  = (long)py$SliderTrack.jttx("jtyw", jttu(int ), (int)45);
        }
        var3_1 = py$SliderTrack.c;
        v1 /* !! */  = py$SliderTrack.rw;
        if (true) ** GOTO lbl12
        block17: while (true) {
            v1 /* !! */  = (long)(v2 - py$SliderTrack.jttx("jtyx", jtug(int ), (int)44));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1788571148: {
                    v2 = py$SliderTrack.jttx("jtyz", jtug(int ), (int)45);
                    continue block17;
                }
                case -1431147180: {
                    v2 = py$SliderTrack.jttx("jtza", jtug(int ), (int)46);
                    continue block17;
                }
                case -1177577435: {
                    break block17;
                }
            }
            break;
        }
        var2_2 /* !! */  = py$SliderTrack.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = py$SliderTrack.rw - py$SliderTrack.jttx("jtzb", jtug(int ), (int)47)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == py$SliderTrack.jttx("jtzc", jttu(int ), (int)46)) break;
            v3 /* !! */  = (long)py$SliderTrack.jttx("jtzd", jttu(int ), (int)47);
        }
        var1_3 = py$SliderTrack.a;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block5 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_1) {
                    throw null;
                    return (float)py$SliderTrack.jttx("jtzf", jtyi(int ), (int)48);
                }
                if (var1_3 || var1_3) ** continue;
                v4 /* !! */  = py$SliderTrack.rw;
                if (true) ** GOTO lbl41
                block20: while (true) {
                    v4 /* !! */  = (long)(v5 - py$SliderTrack.jttx("jtzh", jtug(int ), (int)48));
lbl41:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1177577435: {
                            break block20;
                        }
                        case -91812901: {
                            v5 = py$SliderTrack.jttx("jtzi", jtug(int ), (int)49);
                            continue block20;
                        }
                        case 1496455829: {
                            v5 = py$SliderTrack.jttx("jtzk", jtug(int ), (int)50);
                            continue block20;
                        }
                    }
                    break;
                }
                return this.y;
            }
            case 0: {
                var2_2 /* !! */  = (int)py$SliderTrack.jttx("jtzl", jttu(int ), (int)49);
                if (!var3_1) break;
                throw null;
            }
            case 1: {
                var2_2 /* !! */  = (int)py$SliderTrack.jttx("jtzm", jttu(int ), (int)50);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)py$SliderTrack.jttx("jtzo", jttu(int ), (int)51);
                    if (!var3_1) break block5;
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)py$SliderTrack.jttx("jtzp", jttu(int ), (int)52);
        ** while (!var3_1)
lbl67:
        // 1 sources

        throw null;
    }

    public static /* synthetic */ CallSite jttx(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ int jttu(int n2) {
        return jttv[n2] ^ jttw[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public float width() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = py$SliderTrack.rw - py$SliderTrack.jttx("jtzr", jtug(int ), (int)51)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == py$SliderTrack.jttx("jtzs", jttu(int ), (int)53)) break;
            v0 /* !! */  = (long)py$SliderTrack.jttx("jtzt", jttu(int ), (int)54);
        }
        var3_1 = py$SliderTrack.c;
        v1 /* !! */  = py$SliderTrack.rw;
        if (true) ** GOTO lbl12
        block17: while (true) {
            v1 /* !! */  = (long)(v2 - py$SliderTrack.jttx("jtzu", jtug(int ), (int)52));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1177577435: {
                    break block17;
                }
                case -1048661286: {
                    v2 = py$SliderTrack.jttx("jtzw", jtug(int ), (int)53);
                    continue block17;
                }
                case 1725524883: {
                    v2 = py$SliderTrack.jttx("jtzx", jtug(int ), (int)54);
                    continue block17;
                }
                case 1829979518: {
                    v2 = py$SliderTrack.jttx("jtzy", jtug(int ), (int)55);
                    continue block17;
                }
            }
            break;
        }
        var2_2 /* !! */  = py$SliderTrack.b;
        v3 /* !! */  = py$SliderTrack.rw;
        if (true) ** GOTO lbl29
        block18: while (true) {
            v3 /* !! */  = (long)(py$SliderTrack.jttx("juaa", jtug(int ), (int)57) - py$SliderTrack.jttx("jtzz", jtug(int ), (int)56));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1177577435: {
                    break block18;
                }
                case -584561067: {
                    continue block18;
                }
            }
            break;
        }
        var1_3 = py$SliderTrack.a;
        if (var3_1) {
            throw null;
lbl37:
            // 2 sources

            return (float)py$SliderTrack.jttx("juac", jtyi(int ), (int)55);
        }
        if (var1_3) ** GOTO lbl37
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_1 = py$SliderTrack.rw - py$SliderTrack.jttx("juad", jtug(int ), (int)58)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == py$SliderTrack.jttx("juae", jttu(int ), (int)56)) break;
                    v4 /* !! */  = (long)py$SliderTrack.jttx("juag", jttu(int ), (int)57);
                }
                return this.width;
            }
            case 0: {
                var2_2 /* !! */  = (int)py$SliderTrack.jttx("juah", jttu(int ), (int)58);
                if (var3_1) {
                    throw null;
                }
            }
lbl55:
            // 4 sources

            case 1: {
                var2_2 /* !! */  = (int)py$SliderTrack.jttx("juai", jttu(int ), (int)59);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)py$SliderTrack.jttx("juaj", jttu(int ), (int)60);
                if (!var3_1) ** GOTO lbl55
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)py$SliderTrack.jttx("jual", jttu(int ), (int)61);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ long jtug(int n2) {
        return jtuh[n2] ^ jtui[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final boolean equals(Object var1_1) {
        v0 /* !! */  = py$SliderTrack.rw;
        if (true) ** GOTO lbl5
        block26: while (true) {
            v0 /* !! */  = (long)(v1 - py$SliderTrack.jttx("jtwc", jtug(int ), (int)15));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1177577435: {
                    break block26;
                }
                case -305093243: {
                    v1 = py$SliderTrack.jttx("jtwe", jtug(int ), (int)16);
                    continue block26;
                }
                case 543915362: {
                    v1 = py$SliderTrack.jttx("jtwf", jtug(int ), (int)17);
                    continue block26;
                }
                case 1603235736: {
                    v1 = py$SliderTrack.jttx("jtwg", jtug(int ), (int)18);
                    continue block26;
                }
            }
            break;
        }
        var4_2 = py$SliderTrack.c;
        v2 /* !! */  = py$SliderTrack.rw;
        if (true) ** GOTO lbl22
        block27: while (true) {
            v2 /* !! */  = (long)(v3 - py$SliderTrack.jttx("jtwh", jtug(int ), (int)19));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1177577435: {
                    break block27;
                }
                case -1110468500: {
                    v3 = py$SliderTrack.jttx("jtwj", jtug(int ), (int)20);
                    continue block27;
                }
                case 1263140125: {
                    v3 = py$SliderTrack.jttx("jtwk", jtug(int ), (int)21);
                    continue block27;
                }
                case 2107546080: {
                    v3 = py$SliderTrack.jttx("jtwl", jtug(int ), (int)22);
                    continue block27;
                }
            }
            break;
        }
        var3_3 /* !! */  = py$SliderTrack.b;
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        block12 : switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v4 /* !! */  = py$SliderTrack.rw;
                if (true) ** GOTO lbl42
                block28: while (true) {
                    v4 /* !! */  = (long)(py$SliderTrack.jttx("jtwn", jtug(int ), (int)24) - py$SliderTrack.jttx("jtwm", jtug(int ), (int)23));
lbl42:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1177577435: {
                            break block28;
                        }
                        case -1123001498: {
                            continue block28;
                        }
                    }
                    break;
                }
                var2_4 = py$SliderTrack.a;
                if (var4_2) {
                    throw null;
                    return (boolean)py$SliderTrack.jttx("jtwp", jttu(int ), (int)22);
                }
                if (var2_4 || var2_4) ** continue;
                v5 /* !! */  = py$SliderTrack.rw;
                if (true) ** GOTO lbl57
                block30: while (true) {
                    v5 /* !! */  = (long)(py$SliderTrack.jttx("jtwr", jtug(int ), (int)26) - py$SliderTrack.jttx("jtwq", jtug(int ), (int)25));
lbl57:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1177577435: {
                            break block30;
                        }
                        case -841750099: {
                            continue block30;
                        }
                    }
                    break;
                }
                return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{py$SliderTrack.class, "setting;x;y;width;height", "setting", "x", "y", "width", "height"}, this, var1_1);
            }
lbl63:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)py$SliderTrack.jttx("jtwt", jttu(int ), (int)23);
                    if (!var4_2) break block12;
                    throw null;
                }
            }
            case 1: {
                var3_3 /* !! */  = (int)py$SliderTrack.jttx("jtwu", jttu(int ), (int)24);
                if (!var4_2) ** GOTO lbl63
                throw null;
            }
            case 2: {
                do {
                    var3_3 /* !! */  = (int)py$SliderTrack.jttx("jtww", jttu(int ), (int)25);
                } while (!var4_2);
                throw null;
            }
            case 3: 
        }
        var3_3 /* !! */  = (int)py$SliderTrack.jttx("jtwx", jttu(int ), (int)26);
        ** while (!var4_2)
lbl80:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final int hashCode() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = py$SliderTrack.rw - py$SliderTrack.jttx("jtvd", jtug(int ), (int)6)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == py$SliderTrack.jttx("jtvf", jttu(int ), (int)13)) break;
            v0 /* !! */  = (long)py$SliderTrack.jttx("jtvg", jttu(int ), (int)14);
        }
        var3_1 = py$SliderTrack.c;
        v1 /* !! */  = py$SliderTrack.rw;
        if (true) ** GOTO lbl12
        block18: while (true) {
            v1 /* !! */  = (long)(v2 - py$SliderTrack.jttx("jtvh", jtug(int ), (int)7));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1311486693: {
                    v2 = py$SliderTrack.jttx("jtvi", jtug(int ), (int)8);
                    continue block18;
                }
                case -1177577435: {
                    break block18;
                }
                case -173100399: {
                    v2 = py$SliderTrack.jttx("jtvk", jtug(int ), (int)9);
                    continue block18;
                }
            }
            break;
        }
        var2_2 /* !! */  = py$SliderTrack.b;
        v3 /* !! */  = py$SliderTrack.rw;
        if (true) ** GOTO lbl26
        block19: while (true) {
            v3 /* !! */  = (long)(v4 - py$SliderTrack.jttx("jtvl", jtug(int ), (int)10));
lbl26:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -2047860320: {
                    v4 = py$SliderTrack.jttx("jtvm", jtug(int ), (int)11);
                    continue block19;
                }
                case -1346823879: {
                    v4 = py$SliderTrack.jttx("jtvo", jtug(int ), (int)12);
                    continue block19;
                }
                case -1177577435: {
                    break block19;
                }
                case 214670706: {
                    v4 = py$SliderTrack.jttx("jtvp", jtug(int ), (int)13);
                    continue block19;
                }
            }
            break;
        }
        var1_3 = py$SliderTrack.a;
        if (var3_1) {
            throw null;
lbl41:
            // 2 sources

            return (int)py$SliderTrack.jttx("jtvq", jttu(int ), (int)15);
        }
        if (var1_3) ** GOTO lbl41
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = py$SliderTrack.rw - py$SliderTrack.jttx("jtvs", jtug(int ), (int)14)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == py$SliderTrack.jttx("jtvt", jttu(int ), (int)16)) break;
                    v5 /* !! */  = (long)py$SliderTrack.jttx("jtvv", jttu(int ), (int)17);
                }
                return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{py$SliderTrack.class, "setting;x;y;width;height", "setting", "x", "y", "width", "height"}, this);
            }
lbl55:
            // 3 sources

            case 0: {
                var2_2 /* !! */  = (int)py$SliderTrack.jttx("jtvw", jttu(int ), (int)18);
                if (var3_1) {
                    throw null;
                }
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)py$SliderTrack.jttx("jtvx", jttu(int ), (int)19);
                    if (!var3_1) ** GOTO lbl55
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)py$SliderTrack.jttx("jtvz", jttu(int ), (int)20);
                if (!var3_1) ** GOTO lbl55
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)py$SliderTrack.jttx("jtwa", jttu(int ), (int)21);
        ** while (!var3_1)
lbl71:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void jubl() {
        py$SliderTrack.jttw[0] = -560620193;
        py$SliderTrack.jttw[1] = 1220993980;
        py$SliderTrack.jttw[2] = 553078178;
        py$SliderTrack.jttw[3] = -1637368416;
        py$SliderTrack.jttw[4] = -1480067205;
        py$SliderTrack.jttw[5] = 522622891;
        py$SliderTrack.jttw[6] = 502938806;
        py$SliderTrack.jttw[7] = 1536483935;
        py$SliderTrack.jttw[8] = 35378585;
        py$SliderTrack.jttw[9] = 1699587607;
        py$SliderTrack.jttw[10] = 1691709768;
        py$SliderTrack.jttw[11] = 219308932;
        py$SliderTrack.jttw[12] = -58195037;
        py$SliderTrack.jttw[13] = 441910608;
        py$SliderTrack.jttw[14] = 611929636;
        py$SliderTrack.jttw[15] = 2130987066;
        py$SliderTrack.jttw[16] = -1655374304;
        py$SliderTrack.jttw[17] = 1211396184;
        py$SliderTrack.jttw[18] = 1030951421;
        py$SliderTrack.jttw[19] = -277901476;
        py$SliderTrack.jttw[20] = -2017662735;
        py$SliderTrack.jttw[21] = 987060375;
        py$SliderTrack.jttw[22] = 1003955167;
        py$SliderTrack.jttw[23] = 1358967070;
        py$SliderTrack.jttw[24] = -1081758277;
        py$SliderTrack.jttw[25] = -458945393;
        py$SliderTrack.jttw[26] = 58602587;
        py$SliderTrack.jttw[27] = 830536904;
        py$SliderTrack.jttw[28] = -1791905122;
        py$SliderTrack.jttw[29] = -1350076879;
        py$SliderTrack.jttw[30] = 450015647;
        py$SliderTrack.jttw[31] = 1625201944;
        py$SliderTrack.jttw[32] = -1977335032;
        py$SliderTrack.jttw[33] = 1113790977;
        py$SliderTrack.jttw[34] = 1716191487;
        py$SliderTrack.jttw[35] = 1718561993;
        py$SliderTrack.jttw[36] = -450090870;
        py$SliderTrack.jttw[37] = 257270642;
        py$SliderTrack.jttw[38] = -504023709;
        py$SliderTrack.jttw[39] = 642988934;
        py$SliderTrack.jttw[40] = -1651378029;
        py$SliderTrack.jttw[41] = -1038751609;
        py$SliderTrack.jttw[42] = 479535565;
        py$SliderTrack.jttw[43] = 671888539;
        py$SliderTrack.jttw[44] = 1978212619;
        py$SliderTrack.jttw[45] = -2085502662;
        py$SliderTrack.jttw[46] = 1199042675;
        py$SliderTrack.jttw[47] = -1328814252;
        py$SliderTrack.jttw[48] = 1866914345;
        py$SliderTrack.jttw[49] = 1206402779;
        py$SliderTrack.jttw[50] = 1458725871;
        py$SliderTrack.jttw[51] = -1379702780;
        py$SliderTrack.jttw[52] = -1730762658;
        py$SliderTrack.jttw[53] = -533162648;
        py$SliderTrack.jttw[54] = 432343346;
        py$SliderTrack.jttw[55] = 1936860889;
        py$SliderTrack.jttw[56] = 1990952608;
        py$SliderTrack.jttw[57] = -947006542;
        py$SliderTrack.jttw[58] = -1897513175;
        py$SliderTrack.jttw[59] = -2024848502;
        py$SliderTrack.jttw[60] = 911332753;
        py$SliderTrack.jttw[61] = -1079904262;
        py$SliderTrack.jttw[62] = -945114640;
        py$SliderTrack.jttw[63] = -722970445;
        py$SliderTrack.jttw[64] = 500405395;
        py$SliderTrack.jttw[65] = 264049425;
        py$SliderTrack.jttw[66] = 895401486;
        py$SliderTrack.jttw[67] = 384575982;
        py$SliderTrack.jttw[68] = 1671515459;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public float x() {
        v0 /* !! */  = py$SliderTrack.rw;
        if (true) ** GOTO lbl5
        block26: while (true) {
            v0 /* !! */  = (long)(py$SliderTrack.jttx("jtxw", jtug(int ), (int)32) - py$SliderTrack.jttx("jtxv", jtug(int ), (int)31));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1177577435: {
                    break block26;
                }
                case 1229507161: {
                    continue block26;
                }
            }
            break;
        }
        var3_1 = py$SliderTrack.c;
        v1 /* !! */  = py$SliderTrack.rw;
        if (true) ** GOTO lbl15
        block27: while (true) {
            v1 /* !! */  = (long)(v2 - py$SliderTrack.jttx("jtxx", jtug(int ), (int)33));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1177577435: {
                    break block27;
                }
                case -620407735: {
                    v2 = py$SliderTrack.jttx("jtxz", jtug(int ), (int)34);
                    continue block27;
                }
                case 138710299: {
                    v2 = py$SliderTrack.jttx("jtya", jtug(int ), (int)35);
                    continue block27;
                }
                case 2048713665: {
                    v2 = py$SliderTrack.jttx("jtyb", jtug(int ), (int)36);
                    continue block27;
                }
            }
            break;
        }
        var2_2 /* !! */  = py$SliderTrack.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v3 /* !! */  = py$SliderTrack.rw;
                if (true) ** GOTO lbl35
                block28: while (true) {
                    v3 /* !! */  = (long)(v4 - py$SliderTrack.jttx("jtyc", jtug(int ), (int)37));
lbl35:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1601739052: {
                            v4 = py$SliderTrack.jttx("jtye", jtug(int ), (int)38);
                            continue block28;
                        }
                        case -1177577435: {
                            break block28;
                        }
                        case 789564745: {
                            v4 = py$SliderTrack.jttx("jtyf", jtug(int ), (int)39);
                            continue block28;
                        }
                        case 1622601886: {
                            v4 = py$SliderTrack.jttx("jtyg", jtug(int ), (int)40);
                            continue block28;
                        }
                    }
                    break;
                }
                var1_3 = py$SliderTrack.a;
                if (var3_1) {
                    throw null;
                    return (float)py$SliderTrack.jttx("jtyk", jtyi(int ), (int)39);
                }
                if (var1_3 || var1_3) ** continue;
                v5 /* !! */  = py$SliderTrack.rw;
                if (true) ** GOTO lbl57
                block30: while (true) {
                    v5 /* !! */  = (long)(py$SliderTrack.jttx("jtyn", jtug(int ), (int)42) - py$SliderTrack.jttx("jtym", jtug(int ), (int)41));
lbl57:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1177577435: {
                            break block30;
                        }
                        case -746022661: {
                            continue block30;
                        }
                    }
                    break;
                }
                return this.x;
            }
lbl63:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)py$SliderTrack.jttx("jtyp", jttu(int ), (int)40);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)py$SliderTrack.jttx("jtyq", jttu(int ), (int)41);
                if (!var3_1) ** GOTO lbl63
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)py$SliderTrack.jttx("jtyr", jttu(int ), (int)42);
                if (!var3_1) break;
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)py$SliderTrack.jttx("jtyt", jttu(int ), (int)43);
        ** while (!var3_1)
lbl79:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void jubi() {
        py$SliderTrack.jttv[0] = -560620196;
        py$SliderTrack.jttv[1] = 1220993982;
        py$SliderTrack.jttv[2] = 553078176;
        py$SliderTrack.jttv[3] = -1637368413;
        py$SliderTrack.jttv[4] = -1480067206;
        py$SliderTrack.jttv[5] = -522622892;
        py$SliderTrack.jttv[6] = -816351589;
        py$SliderTrack.jttv[7] = -1536483936;
        py$SliderTrack.jttv[8] = -1304494733;
        py$SliderTrack.jttv[9] = 1699587604;
        py$SliderTrack.jttv[10] = 1691709768;
        py$SliderTrack.jttv[11] = 219308932;
        py$SliderTrack.jttv[12] = -58195039;
        py$SliderTrack.jttv[13] = -441910609;
        py$SliderTrack.jttv[14] = 883620240;
        py$SliderTrack.jttv[15] = 588562717;
        py$SliderTrack.jttv[16] = 1655374303;
        py$SliderTrack.jttv[17] = 183712387;
        py$SliderTrack.jttv[18] = 1030951423;
        py$SliderTrack.jttv[19] = -277901473;
        py$SliderTrack.jttv[20] = -2017662735;
        py$SliderTrack.jttv[21] = 987060372;
        py$SliderTrack.jttv[22] = 1003955166;
        py$SliderTrack.jttv[23] = 1358967068;
        py$SliderTrack.jttv[24] = -1081758278;
        py$SliderTrack.jttv[25] = -458945395;
        py$SliderTrack.jttv[26] = 58602585;
        py$SliderTrack.jttv[27] = 830536905;
        py$SliderTrack.jttv[28] = 1364920480;
        py$SliderTrack.jttv[29] = 1350076878;
        py$SliderTrack.jttv[30] = 1986931647;
        py$SliderTrack.jttv[31] = -1625201945;
        py$SliderTrack.jttv[32] = -546388955;
        py$SliderTrack.jttv[33] = -1113790978;
        py$SliderTrack.jttv[34] = -1771305357;
        py$SliderTrack.jttv[35] = 1718561992;
        py$SliderTrack.jttv[36] = -450090871;
        py$SliderTrack.jttv[37] = 257270640;
        py$SliderTrack.jttv[38] = -504023711;
        py$SliderTrack.jttv[39] = 425259296;
        py$SliderTrack.jttv[40] = -1651378030;
        py$SliderTrack.jttv[41] = -1038751610;
        py$SliderTrack.jttv[42] = 479535567;
        py$SliderTrack.jttv[43] = 671888539;
        py$SliderTrack.jttv[44] = -1978212620;
        py$SliderTrack.jttv[45] = 672873655;
        py$SliderTrack.jttv[46] = -1199042676;
        py$SliderTrack.jttv[47] = -654462729;
        py$SliderTrack.jttv[48] = 1375171319;
        py$SliderTrack.jttv[49] = 1206402776;
        py$SliderTrack.jttv[50] = 1458725869;
        py$SliderTrack.jttv[51] = -1379702779;
        py$SliderTrack.jttv[52] = -1730762659;
        py$SliderTrack.jttv[53] = -533162647;
        py$SliderTrack.jttv[54] = 496551051;
        py$SliderTrack.jttv[55] = 1313072297;
        py$SliderTrack.jttv[56] = -1990952609;
        py$SliderTrack.jttv[57] = 1487264260;
        py$SliderTrack.jttv[58] = -1897513174;
        py$SliderTrack.jttv[59] = -2024848503;
        py$SliderTrack.jttv[60] = 911332753;
        py$SliderTrack.jttv[61] = -1079904263;
        py$SliderTrack.jttv[62] = 945114639;
        py$SliderTrack.jttv[63] = -1535030223;
        py$SliderTrack.jttv[64] = 593990289;
        py$SliderTrack.jttv[65] = 264049426;
        py$SliderTrack.jttv[66] = 895401485;
        py$SliderTrack.jttv[67] = 384575982;
        py$SliderTrack.jttv[68] = 1671515457;
    }

    /*
     * Enabled aggressive block sorting
     */
    public kg setting() {
        boolean bl2;
        while (true) {
            long l2;
            Object object;
            if ((object = (l2 = rw - py$SliderTrack.jttx("jtwz", jtug(int ), (int)27)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object == py$SliderTrack.jttx("jtxa", jttu(int ), (int)27)) break;
            object = py$SliderTrack.jttx("jtxb", jttu(int ), (int)28);
        }
        boolean bl3 = c;
        while (true) {
            long l3;
            Object object;
            if ((object = (l3 = rw - py$SliderTrack.jttx("jtxc", jtug(int ), (int)28)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object == py$SliderTrack.jttx("jtxe", jttu(int ), (int)29)) break;
            object = py$SliderTrack.jttx("jtxf", jttu(int ), (int)30);
        }
        int n2 = b;
        while (true) {
            long l4;
            Object object;
            if ((object = (l4 = rw - py$SliderTrack.jttx("jtxg", jtug(int ), (int)29)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            if (object == py$SliderTrack.jttx("jtxh", jttu(int ), (int)31)) {
                bl2 = a;
                if (bl3) {
                    throw null;
                }
                break;
            }
            object = py$SliderTrack.jttx("jtxi", jttu(int ), (int)32);
        }
        if (bl2) return null;
        if (bl2) return null;
        while (true) {
            long l5;
            Object object;
            if ((object = (l5 = rw - py$SliderTrack.jttx("jtxk", jtug(int ), (int)30)) == 0L ? 0 : (l5 < 0L ? -1 : 1)) == false) continue;
            if (object == py$SliderTrack.jttx("jtxm", jttu(int ), (int)33)) {
                return this.setting;
            }
            object = py$SliderTrack.jttx("jtxn", jttu(int ), (int)34);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final String toString() {
        boolean bl2;
        Object object = rw;
        block8: while (true) {
            switch ((int)object) {
                case -1177577435: {
                    break block8;
                }
                case 492948586: {
                    object = py$SliderTrack.jttx("jtul", jtug(int ), (int)1) - py$SliderTrack.jttx("jtuj", jtug(int ), (int)0);
                    continue block8;
                }
            }
            break;
        }
        boolean bl3 = c;
        while (true) {
            long l2;
            Object object2;
            if ((object2 = (l2 = rw - py$SliderTrack.jttx("jtum", jtug(int ), (int)2)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object2 == py$SliderTrack.jttx("jtun", jttu(int ), (int)5)) break;
            object2 = py$SliderTrack.jttx("jtup", jttu(int ), (int)6);
        }
        int n2 = b;
        while (true) {
            long l3;
            Object object3;
            if ((object3 = (l3 = rw - py$SliderTrack.jttx("jtuq", jtug(int ), (int)3)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object3 == py$SliderTrack.jttx("jtur", jttu(int ), (int)7)) {
                bl2 = a;
                if (bl3) {
                    throw null;
                }
                break;
            }
            object3 = py$SliderTrack.jttx("jtus", jttu(int ), (int)8);
        }
        if (bl2) return null;
        if (bl2) return null;
        Object object4 = rw;
        block11: while (true) {
            switch ((int)object4) {
                case -1177577435: {
                    return ObjectMethods.bootstrap("toString", new MethodHandle[]{py$SliderTrack.class, "setting;x;y;width;height", "setting", "x", "y", "width", "height"}, this);
                }
                case 865909019: {
                    object4 = py$SliderTrack.jttx("jtuv", jtug(int ), (int)5) - py$SliderTrack.jttx("jtuu", jtug(int ), (int)4);
                    continue block11;
                }
            }
            break;
        }
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{py$SliderTrack.class, "setting;x;y;width;height", "setting", "x", "y", "width", "height"}, this);
    }

    static {
        jttv = new int[69];
        jttw = new int[69];
        py$SliderTrack.jubi();
        py$SliderTrack.jubl();
        jtuh = new long[70];
        jtui = new long[70];
        py$SliderTrack.jubm();
        py$SliderTrack.jubo();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private py$SliderTrack(kg var1_1, float var2_2, float var3_3, float var4_4, float var5_5) {
        var7_6 /* !! */  = py$SliderTrack.b;
        super();
        this.setting = var1_1;
        this.x = var2_2;
        if (var7_6 /* !! */  == 0) ** GOTO lbl-1000
        block0 : switch (var7_6 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.y = var3_3;
                this.width = var4_4;
                this.height = var5_5;
                return;
            }
            case 0: {
                while (true) {
                    var7_6 /* !! */  = (int)py$SliderTrack.jttx("jttz", jttu(int ), (int)0);
                }
            }
            case 1: {
                var7_6 /* !! */  = (int)py$SliderTrack.jttx("jtua", jttu(int ), (int)1);
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var7_6 /* !! */  = (int)py$SliderTrack.jttx("jtub", jttu(int ), (int)2);
                    break block0;
                    break;
                }
            }
            case 3: {
                while (true) {
                    var7_6 /* !! */  = (int)py$SliderTrack.jttx("jtud", jttu(int ), (int)3);
                }
            }
            case 4: 
        }
        var7_6 /* !! */  = (int)py$SliderTrack.jttx("jtue", jttu(int ), (int)4);
        ** while (true)
    }

    private static /* synthetic */ float jtyi(int n2) {
        return Float.intBitsToFloat(jttv[n2] ^ jttw[n2]);
    }

    private static /* synthetic */ void jubo() {
        py$SliderTrack.jtui[0] = -7122329246660270912L;
        py$SliderTrack.jtui[1] = -2314785790446435266L;
        py$SliderTrack.jtui[2] = -4453216102557754748L;
        py$SliderTrack.jtui[3] = -2854248719682115162L;
        py$SliderTrack.jtui[4] = 1763295468197205853L;
        py$SliderTrack.jtui[5] = -1725398557704590963L;
        py$SliderTrack.jtui[6] = 7277986782362240401L;
        py$SliderTrack.jtui[7] = 9004247640900581711L;
        py$SliderTrack.jtui[8] = 1699980600980400528L;
        py$SliderTrack.jtui[9] = -4238191258141761236L;
        py$SliderTrack.jtui[10] = 6014305743115792355L;
        py$SliderTrack.jtui[11] = -5607412686110638009L;
        py$SliderTrack.jtui[12] = -2052198541629822950L;
        py$SliderTrack.jtui[13] = 8975938737399222619L;
        py$SliderTrack.jtui[14] = 2576531730987419455L;
        py$SliderTrack.jtui[15] = 8695947064396161207L;
        py$SliderTrack.jtui[16] = -7207539864036626546L;
        py$SliderTrack.jtui[17] = 7425565497689395937L;
        py$SliderTrack.jtui[18] = 2529394490798197718L;
        py$SliderTrack.jtui[19] = -111596518316242741L;
        py$SliderTrack.jtui[20] = 1074425346587141781L;
        py$SliderTrack.jtui[21] = -1673606401561952392L;
        py$SliderTrack.jtui[22] = -1129094210395509928L;
        py$SliderTrack.jtui[23] = -1019842375359327244L;
        py$SliderTrack.jtui[24] = 4217954951866888486L;
        py$SliderTrack.jtui[25] = 6887117101622391146L;
        py$SliderTrack.jtui[26] = -8791395012846505314L;
        py$SliderTrack.jtui[27] = -9155291260683969249L;
        py$SliderTrack.jtui[28] = -4117059536963571529L;
        py$SliderTrack.jtui[29] = 6341416303453179505L;
        py$SliderTrack.jtui[30] = 3214814137855044456L;
        py$SliderTrack.jtui[31] = 1856172641908217210L;
        py$SliderTrack.jtui[32] = -2128283926995160748L;
        py$SliderTrack.jtui[33] = -5793576280935268936L;
        py$SliderTrack.jtui[34] = -3484506448304400135L;
        py$SliderTrack.jtui[35] = 4404993423874941951L;
        py$SliderTrack.jtui[36] = -2419084004730493060L;
        py$SliderTrack.jtui[37] = -5326471625365712914L;
        py$SliderTrack.jtui[38] = 596079491337793369L;
        py$SliderTrack.jtui[39] = -3177427974329888278L;
        py$SliderTrack.jtui[40] = 9028421282266962648L;
        py$SliderTrack.jtui[41] = -5256367884053832321L;
        py$SliderTrack.jtui[42] = -4279984428456519404L;
        py$SliderTrack.jtui[43] = 3287790922526133482L;
        py$SliderTrack.jtui[44] = 6315375118484142051L;
        py$SliderTrack.jtui[45] = 557476872759644298L;
        py$SliderTrack.jtui[46] = 2251761663767865273L;
        py$SliderTrack.jtui[47] = 4279953800693118742L;
        py$SliderTrack.jtui[48] = 8761616778351706471L;
        py$SliderTrack.jtui[49] = -3070347662103756992L;
        py$SliderTrack.jtui[50] = 7061433283657779407L;
        py$SliderTrack.jtui[51] = 3809277214139794757L;
        py$SliderTrack.jtui[52] = 2230312119686609674L;
        py$SliderTrack.jtui[53] = -398414538173039491L;
        py$SliderTrack.jtui[54] = -7595948422501203197L;
        py$SliderTrack.jtui[55] = -8442809238000156056L;
        py$SliderTrack.jtui[56] = 1760539764068891763L;
        py$SliderTrack.jtui[57] = -1152682810434708685L;
        py$SliderTrack.jtui[58] = -3694895746148534145L;
        py$SliderTrack.jtui[59] = 2050467805702248453L;
        py$SliderTrack.jtui[60] = -1561956693482795478L;
        py$SliderTrack.jtui[61] = 8733043513208201561L;
        py$SliderTrack.jtui[62] = -2539545749988381679L;
        py$SliderTrack.jtui[63] = -3735099487384467842L;
        py$SliderTrack.jtui[64] = -4043104924426642331L;
        py$SliderTrack.jtui[65] = -1084498056338457195L;
        py$SliderTrack.jtui[66] = -2417416661059321192L;
        py$SliderTrack.jtui[67] = 1435273946537902508L;
        py$SliderTrack.jtui[68] = -6161323552095803792L;
        py$SliderTrack.jtui[69] = 2281635753814925574L;
    }
}

