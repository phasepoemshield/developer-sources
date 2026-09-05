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

final class fo$Rank
extends Record {
    private static long[] gxxh;
    public static final boolean c;
    public static final boolean a;
    private static int[] gxwz;
    public static final int b;
    private static int[] gxxa;
    private static final fo$Rank[] VALUES;
    private final String name;
    private static final long ns = 1913887131770455239L;
    private static long[] gxxg;
    private final char symbol;

    public static /* synthetic */ CallSite gxxb(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    static {
        gxwz = new int[102];
        gxxa = new int[102];
        fo$Rank.gydq();
        fo$Rank.gydr();
        fo$Rank.gyds();
        fo$Rank.gydt();
        gxxg = new long[65];
        gxxh = new long[65];
        fo$Rank.gydu();
        fo$Rank.gydv();
        fo$Rank[] fo$RankArray = new fo$Rank[11];
        fo$RankArray[fo$Rank.gxxb("gycu", gxwy(int ), (int)80)] = fo$Rank.rank((char)fo$Rank.gxxb("gycv", gxwy(int ), (int)81), "D.HELPER");
        fo$RankArray[fo$Rank.gxxb("gycw", gxwy(int ), (int)82)] = fo$Rank.rank((char)fo$Rank.gxxb("gycx", gxwy(int ), (int)83), "HELPER");
        fo$RankArray[fo$Rank.gxxb("gycy", gxwy(int ), (int)84)] = fo$Rank.rank((char)fo$Rank.gxxb("gycz", gxwy(int ), (int)85), "ML.MODER");
        fo$RankArray[fo$Rank.gxxb("gyda", gxwy(int ), (int)86)] = fo$Rank.rank((char)fo$Rank.gxxb("gydb", gxwy(int ), (int)87), "MODER");
        fo$RankArray[fo$Rank.gxxb("gydc", gxwy(int ), (int)88)] = fo$Rank.rank((char)fo$Rank.gxxb("gydd", gxwy(int ), (int)89), "MODER+");
        fo$RankArray[fo$Rank.gxxb("gyde", gxwy(int ), (int)90)] = fo$Rank.rank((char)fo$Rank.gxxb("gydf", gxwy(int ), (int)91), "ST.MODER");
        fo$RankArray[fo$Rank.gxxb("gydg", gxwy(int ), (int)92)] = fo$Rank.rank((char)fo$Rank.gxxb("gydh", gxwy(int ), (int)93), "GL.MODER");
        fo$RankArray[fo$Rank.gxxb("gydi", gxwy(int ), (int)94)] = fo$Rank.rank((char)fo$Rank.gxxb("gydj", gxwy(int ), (int)95), "ML.ADMIN");
        fo$RankArray[fo$Rank.gxxb("gydk", gxwy(int ), (int)96)] = fo$Rank.rank((char)fo$Rank.gxxb("gydl", gxwy(int ), (int)97), "ADMIN");
        fo$RankArray[fo$Rank.gxxb("gydm", gxwy(int ), (int)98)] = fo$Rank.rank((char)fo$Rank.gxxb("gydn", gxwy(int ), (int)99), "MEDIA");
        fo$RankArray[fo$Rank.gxxb("gydo", gxwy(int ), (int)100)] = fo$Rank.rank((char)fo$Rank.gxxb("gydp", gxwy(int ), (int)101), "YT");
        VALUES = fo$RankArray;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static fo$Rank rank(char var0, String var1_1) {
        v0 /* !! */  = fo$Rank.ns;
        if (true) ** GOTO lbl5
        block27: while (true) {
            v0 /* !! */  = (long)(v1 - fo$Rank.gxxb("gxyv", gxxf(int ), (int)11));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1701182106: {
                    v1 = fo$Rank.gxxb("gxyw", gxxf(int ), (int)12);
                    continue block27;
                }
                case -983661369: {
                    break block27;
                }
                case 605901525: {
                    v1 = fo$Rank.gxxb("gxyx", gxxf(int ), (int)13);
                    continue block27;
                }
                case 606280207: {
                    v1 = fo$Rank.gxxb("gxyy", gxxf(int ), (int)14);
                    continue block27;
                }
            }
            break;
        }
        var4_2 = fo$Rank.c;
        v2 /* !! */  = fo$Rank.ns;
        if (true) ** GOTO lbl22
        block28: while (true) {
            v2 /* !! */  = (long)(v3 - fo$Rank.gxxb("gxyz", gxxf(int ), (int)15));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1847968539: {
                    v3 = fo$Rank.gxxb("gxza", gxxf(int ), (int)16);
                    continue block28;
                }
                case -983661369: {
                    break block28;
                }
                case 803223411: {
                    v3 = fo$Rank.gxxb("gxzb", gxxf(int ), (int)17);
                    continue block28;
                }
                case 1295247309: {
                    v3 = fo$Rank.gxxb("gxzc", gxxf(int ), (int)18);
                    continue block28;
                }
            }
            break;
        }
        var3_3 /* !! */  = fo$Rank.b;
        v4 /* !! */  = fo$Rank.ns;
        if (true) ** GOTO lbl39
        block29: while (true) {
            v4 /* !! */  = (long)(fo$Rank.gxxb("gxze", gxxf(int ), (int)20) - fo$Rank.gxxb("gxzd", gxxf(int ), (int)19));
lbl39:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -983661369: {
                    break block29;
                }
                case -919487786: {
                    continue block29;
                }
            }
            break;
        }
        var2_4 = fo$Rank.a;
        if (var4_2) {
            throw null;
lbl47:
            // 2 sources

            return null;
        }
        if (var2_4) ** GOTO lbl47
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** continue;
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_0 = fo$Rank.ns - fo$Rank.gxxb("gxzf", gxxf(int ), (int)21)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == fo$Rank.gxxb("gxzg", gxwy(int ), (int)31)) break;
                    v5 /* !! */  = (long)fo$Rank.gxxb("gxzh", gxwy(int ), (int)32);
                }
                v6 /* !! */  = fo$Rank.ns;
                if (true) ** GOTO lbl64
                block32: while (true) {
                    v6 /* !! */  = (long)(v7 - fo$Rank.gxxb("gxzi", gxxf(int ), (int)22));
lbl64:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -983661369: {
                            break block32;
                        }
                        case 1031982395: {
                            v7 = fo$Rank.gxxb("gxzj", gxxf(int ), (int)23);
                            continue block32;
                        }
                        case 1675475221: {
                            v7 = fo$Rank.gxxb("gxzk", gxxf(int ), (int)24);
                            continue block32;
                        }
                    }
                    break;
                }
                return new fo$Rank(var0, var1_1);
            }
            case 0: {
                var3_3 /* !! */  = (int)fo$Rank.gxxb("gxzl", gxwy(int ), (int)33);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl83
            }
            case 1: {
                var3_3 /* !! */  = (int)fo$Rank.gxxb("gxzm", gxwy(int ), (int)34);
                if (var4_2) {
                    throw null;
                }
            }
lbl83:
            // 4 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var3_3 /* !! */  = (int)fo$Rank.gxxb("gxzn", gxwy(int ), (int)35);
                    if (!var4_2) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 3: 
        }
        var3_3 /* !! */  = (int)fo$Rank.gxxb("gxzo", gxwy(int ), (int)36);
        ** while (!var4_2)
lbl91:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final int hashCode() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = fo$Rank.ns - fo$Rank.gxxb("gyad", gxxf(int ), (int)33)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == fo$Rank.gxxb("gyae", gxwy(int ), (int)43)) break;
            v0 /* !! */  = (long)fo$Rank.gxxb("gyaf", gxwy(int ), (int)44);
        }
        var3_1 = fo$Rank.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = fo$Rank.ns - fo$Rank.gxxb("gyag", gxxf(int ), (int)34)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == fo$Rank.gxxb("gyah", gxwy(int ), (int)45)) break;
            v1 /* !! */  = (long)fo$Rank.gxxb("gyai", gxwy(int ), (int)46);
        }
        var2_2 /* !! */  = fo$Rank.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = fo$Rank.ns - fo$Rank.gxxb("gyaj", gxxf(int ), (int)35)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == fo$Rank.gxxb("gyak", gxwy(int ), (int)47)) break;
            v2 /* !! */  = (long)fo$Rank.gxxb("gyal", gxwy(int ), (int)48);
        }
        var1_3 = fo$Rank.a;
        if (var3_1) {
            throw null;
lbl24:
            // 2 sources

            return (int)fo$Rank.gxxb("gyam", gxwy(int ), (int)49);
        }
        if (var1_3) ** GOTO lbl24
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_3 = fo$Rank.ns - fo$Rank.gxxb("gyan", gxxf(int ), (int)36)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == fo$Rank.gxxb("gyao", gxwy(int ), (int)50)) break;
                    v3 /* !! */  = (long)fo$Rank.gxxb("gyap", gxwy(int ), (int)51);
                }
                return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{fo$Rank.class, "symbol;name", "symbol", "name"}, this);
            }
lbl38:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)fo$Rank.gxxb("gyaq", gxwy(int ), (int)52);
                if (!var3_1) break;
                throw null;
            }
            case 1: {
                var2_2 /* !! */  = (int)fo$Rank.gxxb("gyar", gxwy(int ), (int)53);
                if (!var3_1) break;
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)fo$Rank.gxxb("gyas", gxwy(int ), (int)54);
                if (!var3_1) ** GOTO lbl38
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)fo$Rank.gxxb("gyat", gxwy(int ), (int)55);
        } while (!var3_1);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public String name() {
        v0 /* !! */  = fo$Rank.ns;
        if (true) ** GOTO lbl5
        block16: while (true) {
            v0 /* !! */  = (long)(fo$Rank.gxxb("gycf", gxxf(int ), (int)58) - fo$Rank.gxxb("gyce", gxxf(int ), (int)57));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -983661369: {
                    break block16;
                }
                case 405912129: {
                    continue block16;
                }
            }
            break;
        }
        var3_1 = fo$Rank.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = fo$Rank.ns - fo$Rank.gxxb("gycg", gxxf(int ), (int)59)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == fo$Rank.gxxb("gych", gxwy(int ), (int)72)) break;
            v1 /* !! */  = (long)fo$Rank.gxxb("gyci", gxwy(int ), (int)73);
        }
        var2_2 /* !! */  = fo$Rank.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = fo$Rank.ns - fo$Rank.gxxb("gycj", gxxf(int ), (int)60)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == fo$Rank.gxxb("gyck", gxwy(int ), (int)74)) break;
            v2 /* !! */  = (long)fo$Rank.gxxb("gycl", gxwy(int ), (int)75);
        }
        var1_3 = fo$Rank.a;
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
                v3 /* !! */  = fo$Rank.ns;
                if (true) ** GOTO lbl37
                block20: while (true) {
                    v3 /* !! */  = (long)(v4 - fo$Rank.gxxb("gycm", gxxf(int ), (int)61));
lbl37:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -983661369: {
                            break block20;
                        }
                        case -649978862: {
                            v4 = fo$Rank.gxxb("gycn", gxxf(int ), (int)62);
                            continue block20;
                        }
                        case 529531227: {
                            v4 = fo$Rank.gxxb("gyco", gxxf(int ), (int)63);
                            continue block20;
                        }
                        case 1482643438: {
                            v4 = fo$Rank.gxxb("gycp", gxxf(int ), (int)64);
                            continue block20;
                        }
                    }
                    break;
                }
                return this.name;
            }
lbl50:
            // 3 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)fo$Rank.gxxb("gycq", gxwy(int ), (int)76);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl60
                    break;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)fo$Rank.gxxb("gycr", gxwy(int ), (int)77);
                if (!var3_1) ** GOTO lbl50
                throw null;
            }
lbl60:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)fo$Rank.gxxb("gycs", gxwy(int ), (int)78);
                if (!var3_1) ** GOTO lbl50
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)fo$Rank.gxxb("gyct", gxwy(int ), (int)79);
        ** while (!var3_1)
lbl67:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void gydt() {
        fo$Rank.gxxa[100] = -2089593672;
        fo$Rank.gxxa[101] = -2135382422;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public char symbol() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = fo$Rank.ns - fo$Rank.gxxb("gybl", gxxf(int ), (int)45)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == fo$Rank.gxxb("gybm", gxwy(int ), (int)65)) break;
            v0 /* !! */  = (long)fo$Rank.gxxb("gybn", gxwy(int ), (int)66);
        }
        var3_1 = fo$Rank.c;
        v1 /* !! */  = fo$Rank.ns;
        if (true) ** GOTO lbl12
        block24: while (true) {
            v1 /* !! */  = (long)(v2 - fo$Rank.gxxb("gybo", gxxf(int ), (int)46));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1151881074: {
                    v2 = fo$Rank.gxxb("gybp", gxxf(int ), (int)47);
                    continue block24;
                }
                case -983661369: {
                    break block24;
                }
                case 1992092861: {
                    v2 = fo$Rank.gxxb("gybq", gxxf(int ), (int)48);
                    continue block24;
                }
                case 2113860530: {
                    v2 = fo$Rank.gxxb("gybr", gxxf(int ), (int)49);
                    continue block24;
                }
            }
            break;
        }
        var2_2 /* !! */  = fo$Rank.b;
        v3 /* !! */  = fo$Rank.ns;
        if (true) ** GOTO lbl29
        block25: while (true) {
            v3 /* !! */  = (long)(v4 - fo$Rank.gxxb("gybs", gxxf(int ), (int)50));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1346139430: {
                    v4 = fo$Rank.gxxb("gybt", gxxf(int ), (int)51);
                    continue block25;
                }
                case -983661369: {
                    break block25;
                }
                case -860898507: {
                    v4 = fo$Rank.gxxb("gybu", gxxf(int ), (int)52);
                    continue block25;
                }
                case -625627661: {
                    v4 = fo$Rank.gxxb("gybv", gxxf(int ), (int)53);
                    continue block25;
                }
            }
            break;
        }
        var1_3 = fo$Rank.a;
        if (var3_1) {
            throw null;
lbl44:
            // 2 sources

            return (char)fo$Rank.gxxb("gybw", gxwy(int ), (int)67);
        }
        if (var1_3) ** GOTO lbl44
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                v5 /* !! */  = fo$Rank.ns;
                if (true) ** GOTO lbl55
                block27: while (true) {
                    v5 /* !! */  = (long)(v6 - fo$Rank.gxxb("gybx", gxxf(int ), (int)54));
lbl55:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -983661369: {
                            break block27;
                        }
                        case 340914205: {
                            v6 = fo$Rank.gxxb("gyby", gxxf(int ), (int)55);
                            continue block27;
                        }
                        case 1753051896: {
                            v6 = fo$Rank.gxxb("gybz", gxxf(int ), (int)56);
                            continue block27;
                        }
                    }
                    break;
                }
                return this.symbol;
            }
lbl65:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)fo$Rank.gxxb("gyca", gxwy(int ), (int)68);
                if (var3_1) {
                    throw null;
                }
            }
            case 1: {
                do {
                    var2_2 /* !! */  = (int)fo$Rank.gxxb("gycb", gxwy(int ), (int)69);
                } while (!var3_1);
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)fo$Rank.gxxb("gycc", gxwy(int ), (int)70);
                    if (!var3_1) ** GOTO lbl65
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)fo$Rank.gxxb("gycd", gxwy(int ), (int)71);
        ** while (!var3_1)
lbl82:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void gydu() {
        fo$Rank.gxxg[0] = -4700531615720222389L;
        fo$Rank.gxxg[1] = -5828807593820681316L;
        fo$Rank.gxxg[2] = 8437427999686456706L;
        fo$Rank.gxxg[3] = 8221587565130303980L;
        fo$Rank.gxxg[4] = 3523312840040422604L;
        fo$Rank.gxxg[5] = -6994280744365265782L;
        fo$Rank.gxxg[6] = 1811944110161818799L;
        fo$Rank.gxxg[7] = -3013492289135554297L;
        fo$Rank.gxxg[8] = 3636458387377880004L;
        fo$Rank.gxxg[9] = 14653791574463136L;
        fo$Rank.gxxg[10] = 8318974211842106365L;
        fo$Rank.gxxg[11] = 8422417472881223524L;
        fo$Rank.gxxg[12] = 8886945675012860348L;
        fo$Rank.gxxg[13] = 8217116367054710241L;
        fo$Rank.gxxg[14] = -85659161348834148L;
        fo$Rank.gxxg[15] = -6511151927604713789L;
        fo$Rank.gxxg[16] = 2686562030761017193L;
        fo$Rank.gxxg[17] = 11748922818216546L;
        fo$Rank.gxxg[18] = -1947528820404080698L;
        fo$Rank.gxxg[19] = -1898408609745483879L;
        fo$Rank.gxxg[20] = 2311866708336810161L;
        fo$Rank.gxxg[21] = -503414780640945168L;
        fo$Rank.gxxg[22] = 7543088096759076213L;
        fo$Rank.gxxg[23] = -1359831821256820568L;
        fo$Rank.gxxg[24] = -8256662801288375186L;
        fo$Rank.gxxg[25] = 7030903716027744312L;
        fo$Rank.gxxg[26] = -7828058612694804151L;
        fo$Rank.gxxg[27] = 570550241410849650L;
        fo$Rank.gxxg[28] = 627835503676456575L;
        fo$Rank.gxxg[29] = -752353468230786767L;
        fo$Rank.gxxg[30] = -4855809136021059915L;
        fo$Rank.gxxg[31] = -8812658984905398046L;
        fo$Rank.gxxg[32] = -7142998340193066183L;
        fo$Rank.gxxg[33] = 6504936342451754722L;
        fo$Rank.gxxg[34] = -7392548251934167150L;
        fo$Rank.gxxg[35] = 5802565886780414007L;
        fo$Rank.gxxg[36] = 2490373155103470608L;
        fo$Rank.gxxg[37] = 556660716595088777L;
        fo$Rank.gxxg[38] = 5070725882524477898L;
        fo$Rank.gxxg[39] = -1194613129712992581L;
        fo$Rank.gxxg[40] = -5006997652647097581L;
        fo$Rank.gxxg[41] = 5483374155190909266L;
        fo$Rank.gxxg[42] = -833159523839670682L;
        fo$Rank.gxxg[43] = 2328058377852175426L;
        fo$Rank.gxxg[44] = 5024030452806552602L;
        fo$Rank.gxxg[45] = -6168840383522357319L;
        fo$Rank.gxxg[46] = 4812862760787418668L;
        fo$Rank.gxxg[47] = -2861546278539867905L;
        fo$Rank.gxxg[48] = -1577479538800702722L;
        fo$Rank.gxxg[49] = -5793679141106574598L;
        fo$Rank.gxxg[50] = 1883518017722550476L;
        fo$Rank.gxxg[51] = 2559857693428968397L;
        fo$Rank.gxxg[52] = 7116088647549564096L;
        fo$Rank.gxxg[53] = 7569614489796843824L;
        fo$Rank.gxxg[54] = 977622781681725532L;
        fo$Rank.gxxg[55] = -7444176834294465949L;
        fo$Rank.gxxg[56] = 5166000717718299286L;
        fo$Rank.gxxg[57] = 3109634240066609191L;
        fo$Rank.gxxg[58] = 6181543980913273040L;
        fo$Rank.gxxg[59] = -3714792562476038058L;
        fo$Rank.gxxg[60] = 3931105973203867754L;
        fo$Rank.gxxg[61] = 2247574971284391999L;
        fo$Rank.gxxg[62] = -799407817475618585L;
        fo$Rank.gxxg[63] = 6506878744139366887L;
        fo$Rank.gxxg[64] = 5665211564953332035L;
    }

    private static /* synthetic */ void gydr() {
        fo$Rank.gxwz[100] = -2089593678;
        fo$Rank.gxwz[101] = -2135424145;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final String toString() {
        v0 /* !! */  = fo$Rank.ns;
        if (true) ** GOTO lbl5
        block19: while (true) {
            v0 /* !! */  = (long)(fo$Rank.gxxb("gxzq", gxxf(int ), (int)26) - fo$Rank.gxxb("gxzp", gxxf(int ), (int)25));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -983661369: {
                    break block19;
                }
                case 1790037865: {
                    continue block19;
                }
            }
            break;
        }
        var3_1 = fo$Rank.c;
        v1 /* !! */  = fo$Rank.ns;
        if (true) ** GOTO lbl15
        block20: while (true) {
            v1 /* !! */  = (long)(v2 - fo$Rank.gxxb("gxzr", gxxf(int ), (int)27));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1682887768: {
                    v2 = fo$Rank.gxxb("gxzs", gxxf(int ), (int)28);
                    continue block20;
                }
                case -983661369: {
                    break block20;
                }
                case 1117428670: {
                    v2 = fo$Rank.gxxb("gxzt", gxxf(int ), (int)29);
                    continue block20;
                }
            }
            break;
        }
        var2_2 /* !! */  = fo$Rank.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_0 = fo$Rank.ns - fo$Rank.gxxb("gxzu", gxxf(int ), (int)30)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == fo$Rank.gxxb("gxzv", gxwy(int ), (int)37)) break;
            v3 /* !! */  = (long)fo$Rank.gxxb("gxzw", gxwy(int ), (int)38);
        }
        var1_3 = fo$Rank.a;
        if (var3_1) {
            throw null;
            return null;
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** continue;
                v4 /* !! */  = fo$Rank.ns;
                if (true) ** GOTO lbl44
                block23: while (true) {
                    v4 /* !! */  = (long)(fo$Rank.gxxb("gxzy", gxxf(int ), (int)32) - fo$Rank.gxxb("gxzx", gxxf(int ), (int)31));
lbl44:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -983661369: {
                            break block23;
                        }
                        case 1707229633: {
                            continue block23;
                        }
                    }
                    break;
                }
                return ObjectMethods.bootstrap("toString", new MethodHandle[]{fo$Rank.class, "symbol;name", "symbol", "name"}, this);
            }
lbl50:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)fo$Rank.gxxb("gxzz", gxwy(int ), (int)39);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl60
            }
            case 1: {
                do {
                    var2_2 /* !! */  = (int)fo$Rank.gxxb("gyaa", gxwy(int ), (int)40);
                } while (!var3_1);
                throw null;
            }
lbl60:
            // 2 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)fo$Rank.gxxb("gyab", gxwy(int ), (int)41);
                    if (!var3_1) ** GOTO lbl50
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)fo$Rank.gxxb("gyac", gxwy(int ), (int)42);
        ** while (!var3_1)
lbl68:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static fo$Rank byName(String var0) {
        block60: {
            v0 /* !! */  = fo$Rank.ns;
            if (true) ** GOTO lbl5
            block34: while (true) {
                v0 /* !! */  = (long)(fo$Rank.gxxb("gxxj", gxxf(int ), (int)1) - fo$Rank.gxxb("gxxi", gxxf(int ), (int)0));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -983661369: {
                        break block34;
                    }
                    case 1248721382: {
                        continue block34;
                    }
                }
                break;
            }
            var7_1 = fo$Rank.c;
            v1 /* !! */  = fo$Rank.ns;
            if (true) ** GOTO lbl15
            block35: while (true) {
                v1 /* !! */  = (long)(v2 - fo$Rank.gxxb("gxxk", gxxf(int ), (int)2));
lbl15:
                // 2 sources

                switch ((int)v1 /* !! */ ) {
                    case -1599090988: {
                        v2 = fo$Rank.gxxb("gxxl", gxxf(int ), (int)3);
                        continue block35;
                    }
                    case -983661369: {
                        break block35;
                    }
                    case 1538585062: {
                        v2 = fo$Rank.gxxb("gxxm", gxxf(int ), (int)4);
                        continue block35;
                    }
                }
                break;
            }
            var6_2 /* !! */  = fo$Rank.b;
            while (true) {
                if ((v3 /* !! */  = (cfr_temp_0 = fo$Rank.ns - fo$Rank.gxxb("gxxn", gxxf(int ), (int)5)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v3 /* !! */  == fo$Rank.gxxb("gxxo", gxwy(int ), (int)3)) break;
                v3 /* !! */  = (long)fo$Rank.gxxb("gxxp", gxwy(int ), (int)4);
            }
            var5_3 = fo$Rank.a;
            if (var7_1) {
                throw null;
lbl33:
                // 12 sources

                return null;
            }
            if (var5_3 || var5_3) ** GOTO lbl33
            while (true) {
                if ((v4 /* !! */  = (cfr_temp_1 = fo$Rank.ns - fo$Rank.gxxb("gxxq", gxxf(int ), (int)6)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v4 /* !! */  == fo$Rank.gxxb("gxxr", gxwy(int ), (int)5)) break;
                v4 /* !! */  = (long)fo$Rank.gxxb("gxxs", gxwy(int ), (int)6);
            }
            var1_4 = fo$Rank.VALUES;
            if (var5_3) ** GOTO lbl33
            var2_5 = var1_4.length;
            if (var5_3) ** GOTO lbl33
            var3_6 = fo$Rank.gxxb("gxxt", gxwy(int ), (int)7);
            if (var5_3) ** GOTO lbl33
            do {
                block61: {
                    if (var5_3 || var5_3) ** GOTO lbl33
                    if (var3_6 >= var2_5) break block60;
                    if (var5_3) ** GOTO lbl33
                    var4_7 = var1_4[var3_6];
                    if (var5_3 || var5_3) ** GOTO lbl33
                    while (true) {
                        if ((v5 /* !! */  = (cfr_temp_2 = fo$Rank.ns - fo$Rank.gxxb("gxxu", gxxf(int ), (int)7)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                        if (v5 /* !! */  == fo$Rank.gxxb("gxxv", gxwy(int ), (int)8)) break;
                        v5 /* !! */  = (long)fo$Rank.gxxb("gxxw", gxwy(int ), (int)9);
                    }
                    v6 = var4_7.name;
                    while (true) {
                        if ((v7 /* !! */  = (cfr_temp_3 = fo$Rank.ns - fo$Rank.gxxb("gxxx", gxxf(int ), (int)8)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                        if (v7 /* !! */  == fo$Rank.gxxb("gxxy", gxwy(int ), (int)10)) break;
                        v7 /* !! */  = (long)fo$Rank.gxxb("gxxz", gxwy(int ), (int)11);
                    }
                    if (!v6.equals(var0)) break block61;
                    if (var5_3) ** GOTO lbl33
                    return var4_7;
                }
                if (var5_3 || var5_3) ** GOTO lbl33
                ++var3_6;
                if (var5_3) ** GOTO lbl33
            } while (!var7_1);
            throw null;
        }
        if (var5_3) ** GOTO lbl33
        if (var6_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var6_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var5_3) ** break;
                ** continue;
                v8 /* !! */  = fo$Rank.ns;
                if (true) ** GOTO lbl84
                block42: while (true) {
                    v8 /* !! */  = (long)(fo$Rank.gxxb("gxyb", gxxf(int ), (int)10) - fo$Rank.gxxb("gxya", gxxf(int ), (int)9));
lbl84:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -1760673796: {
                            continue block42;
                        }
                        case -983661369: {
                            break block42;
                        }
                    }
                    break;
                }
                return fo$Rank.VALUES[8];
            }
lbl90:
            // 2 sources

            case 0: {
                var6_2 /* !! */  = (int)fo$Rank.gxxb("gxyc", gxwy(int ), (int)12);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl100
            }
lbl95:
            // 2 sources

            case 1: {
                var6_2 /* !! */  = (int)fo$Rank.gxxb("gxyd", gxwy(int ), (int)13);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl136
            }
lbl100:
            // 2 sources

            case 2: {
                var6_2 /* !! */  = (int)fo$Rank.gxxb("gxye", gxwy(int ), (int)14);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl127
            }
lbl105:
            // 3 sources

            case 3: {
                do {
                    var6_2 /* !! */  = (int)fo$Rank.gxxb("gxyf", gxwy(int ), (int)15);
                } while (!var7_1);
                throw null;
            }
            case 4: {
                var6_2 /* !! */  = (int)fo$Rank.gxxb("gxyg", gxwy(int ), (int)16);
                if (!var7_1) ** GOTO lbl105
                throw null;
            }
lbl114:
            // 2 sources

            case 5: {
                var6_2 /* !! */  = (int)fo$Rank.gxxb("gxyh", gxwy(int ), (int)17);
                if (!var7_1) break;
                throw null;
            }
lbl118:
            // 2 sources

            case 6: {
                var6_2 /* !! */  = (int)fo$Rank.gxxb("gxyi", gxwy(int ), (int)18);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl144
            }
            case 7: {
                var6_2 /* !! */  = (int)fo$Rank.gxxb("gxyj", gxwy(int ), (int)19);
                if (!var7_1) ** GOTO lbl118
                throw null;
            }
lbl127:
            // 2 sources

            case 8: {
                var6_2 /* !! */  = (int)fo$Rank.gxxb("gxyk", gxwy(int ), (int)20);
                if (!var7_1) ** GOTO lbl105
                throw null;
            }
            case 9: {
                var6_2 /* !! */  = (int)fo$Rank.gxxb("gxyl", gxwy(int ), (int)21);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl149
            }
lbl136:
            // 4 sources

            case 10: {
                var6_2 /* !! */  = (int)fo$Rank.gxxb("gxym", gxwy(int ), (int)22);
                if (!var7_1) ** GOTO lbl114
                throw null;
            }
            case 11: {
                var6_2 /* !! */  = (int)fo$Rank.gxxb("gxyn", gxwy(int ), (int)23);
                if (!var7_1) ** GOTO lbl136
                throw null;
            }
lbl144:
            // 2 sources

            case 12: {
                var6_2 /* !! */  = (int)fo$Rank.gxxb("gxyo", gxwy(int ), (int)24);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl153
            }
lbl149:
            // 3 sources

            case 13: {
                var6_2 /* !! */  = (int)fo$Rank.gxxb("gxyp", gxwy(int ), (int)25);
                if (!var7_1) ** GOTO lbl95
                throw null;
            }
lbl153:
            // 2 sources

            case 14: {
                var6_2 /* !! */  = (int)fo$Rank.gxxb("gxyq", gxwy(int ), (int)26);
                if (!var7_1) ** GOTO lbl90
                throw null;
            }
lbl157:
            // 2 sources

            case 15: {
                var6_2 /* !! */  = (int)fo$Rank.gxxb("gxyr", gxwy(int ), (int)27);
                if (!var7_1) ** GOTO lbl136
                throw null;
            }
            case 16: {
                var6_2 /* !! */  = (int)fo$Rank.gxxb("gxys", gxwy(int ), (int)28);
                if (!var7_1) ** GOTO lbl149
                throw null;
            }
            case 17: {
                var6_2 /* !! */  = (int)fo$Rank.gxxb("gxyt", gxwy(int ), (int)29);
                if (!var7_1) ** GOTO lbl157
                throw null;
            }
            case 18: 
        }
        do {
            var6_2 /* !! */  = (int)fo$Rank.gxxb("gxyu", gxwy(int ), (int)30);
        } while (!var7_1);
        throw null;
    }

    private static /* synthetic */ void gydq() {
        fo$Rank.gxwz[0] = 1533478165;
        fo$Rank.gxwz[1] = -1601670212;
        fo$Rank.gxwz[2] = -698924324;
        fo$Rank.gxwz[3] = 295924850;
        fo$Rank.gxwz[4] = -2029313196;
        fo$Rank.gxwz[5] = -917626935;
        fo$Rank.gxwz[6] = 1556468333;
        fo$Rank.gxwz[7] = 50179186;
        fo$Rank.gxwz[8] = 374857816;
        fo$Rank.gxwz[9] = 398034294;
        fo$Rank.gxwz[10] = 583560846;
        fo$Rank.gxwz[11] = -1186088165;
        fo$Rank.gxwz[12] = 131689115;
        fo$Rank.gxwz[13] = 23815549;
        fo$Rank.gxwz[14] = 288258729;
        fo$Rank.gxwz[15] = -11267891;
        fo$Rank.gxwz[16] = -1921191069;
        fo$Rank.gxwz[17] = -1985958122;
        fo$Rank.gxwz[18] = 1409880484;
        fo$Rank.gxwz[19] = 148843299;
        fo$Rank.gxwz[20] = -1108049695;
        fo$Rank.gxwz[21] = -1367450102;
        fo$Rank.gxwz[22] = 1031773120;
        fo$Rank.gxwz[23] = 45552513;
        fo$Rank.gxwz[24] = -928300575;
        fo$Rank.gxwz[25] = 1182494157;
        fo$Rank.gxwz[26] = -1716176648;
        fo$Rank.gxwz[27] = -1919578975;
        fo$Rank.gxwz[28] = 1006488510;
        fo$Rank.gxwz[29] = 1101904036;
        fo$Rank.gxwz[30] = 1609217705;
        fo$Rank.gxwz[31] = -1237023711;
        fo$Rank.gxwz[32] = 710417234;
        fo$Rank.gxwz[33] = -1118934541;
        fo$Rank.gxwz[34] = -5078970;
        fo$Rank.gxwz[35] = -652185674;
        fo$Rank.gxwz[36] = -180632198;
        fo$Rank.gxwz[37] = -124581088;
        fo$Rank.gxwz[38] = -2031083153;
        fo$Rank.gxwz[39] = -382201805;
        fo$Rank.gxwz[40] = 253976533;
        fo$Rank.gxwz[41] = 948532364;
        fo$Rank.gxwz[42] = 71090985;
        fo$Rank.gxwz[43] = 487146990;
        fo$Rank.gxwz[44] = -920914597;
        fo$Rank.gxwz[45] = 2006235324;
        fo$Rank.gxwz[46] = -2012484784;
        fo$Rank.gxwz[47] = 2084223017;
        fo$Rank.gxwz[48] = -1613209287;
        fo$Rank.gxwz[49] = 120955583;
        fo$Rank.gxwz[50] = 46475335;
        fo$Rank.gxwz[51] = 191344633;
        fo$Rank.gxwz[52] = 742706565;
        fo$Rank.gxwz[53] = -40613801;
        fo$Rank.gxwz[54] = 1586803370;
        fo$Rank.gxwz[55] = -170561790;
        fo$Rank.gxwz[56] = -1260129037;
        fo$Rank.gxwz[57] = 1050865715;
        fo$Rank.gxwz[58] = -1258616571;
        fo$Rank.gxwz[59] = 1302348383;
        fo$Rank.gxwz[60] = 947035189;
        fo$Rank.gxwz[61] = 1059398947;
        fo$Rank.gxwz[62] = 402969259;
        fo$Rank.gxwz[63] = -1075493434;
        fo$Rank.gxwz[64] = 1340443897;
        fo$Rank.gxwz[65] = -917338990;
        fo$Rank.gxwz[66] = -2045769244;
        fo$Rank.gxwz[67] = 1207535351;
        fo$Rank.gxwz[68] = 1048407308;
        fo$Rank.gxwz[69] = -1752760834;
        fo$Rank.gxwz[70] = 1964787509;
        fo$Rank.gxwz[71] = -1975316534;
        fo$Rank.gxwz[72] = -734794080;
        fo$Rank.gxwz[73] = 1389507064;
        fo$Rank.gxwz[74] = 1395502740;
        fo$Rank.gxwz[75] = 1463536263;
        fo$Rank.gxwz[76] = -1320556839;
        fo$Rank.gxwz[77] = -538726943;
        fo$Rank.gxwz[78] = 1713377409;
        fo$Rank.gxwz[79] = 2117714015;
        fo$Rank.gxwz[80] = -571692159;
        fo$Rank.gxwz[81] = 258611085;
        fo$Rank.gxwz[82] = 967564447;
        fo$Rank.gxwz[83] = -1009351010;
        fo$Rank.gxwz[84] = -1915668751;
        fo$Rank.gxwz[85] = 1319033205;
        fo$Rank.gxwz[86] = 1688055480;
        fo$Rank.gxwz[87] = -202928448;
        fo$Rank.gxwz[88] = -361262775;
        fo$Rank.gxwz[89] = -134605226;
        fo$Rank.gxwz[90] = 950764057;
        fo$Rank.gxwz[91] = -406523351;
        fo$Rank.gxwz[92] = -2116949881;
        fo$Rank.gxwz[93] = -407082237;
        fo$Rank.gxwz[94] = 477044886;
        fo$Rank.gxwz[95] = 268060165;
        fo$Rank.gxwz[96] = -743722657;
        fo$Rank.gxwz[97] = 1076237101;
        fo$Rank.gxwz[98] = -1015229162;
        fo$Rank.gxwz[99] = -1582853317;
    }

    private static /* synthetic */ void gyds() {
        fo$Rank.gxxa[0] = 1533478165;
        fo$Rank.gxxa[1] = -1601670212;
        fo$Rank.gxxa[2] = -698924323;
        fo$Rank.gxxa[3] = 295924851;
        fo$Rank.gxxa[4] = -66361694;
        fo$Rank.gxxa[5] = 917626934;
        fo$Rank.gxxa[6] = 671501397;
        fo$Rank.gxxa[7] = 50179186;
        fo$Rank.gxxa[8] = -374857817;
        fo$Rank.gxxa[9] = 1510426687;
        fo$Rank.gxxa[10] = 583560847;
        fo$Rank.gxxa[11] = 82896884;
        fo$Rank.gxxa[12] = 131689104;
        fo$Rank.gxxa[13] = 23815548;
        fo$Rank.gxxa[14] = 288258731;
        fo$Rank.gxxa[15] = -11267896;
        fo$Rank.gxxa[16] = -1921191064;
        fo$Rank.gxxa[17] = -1985958126;
        fo$Rank.gxxa[18] = 1409880485;
        fo$Rank.gxxa[19] = 148843314;
        fo$Rank.gxxa[20] = -1108049679;
        fo$Rank.gxxa[21] = -1367450097;
        fo$Rank.gxxa[22] = 1031773127;
        fo$Rank.gxxa[23] = 45552513;
        fo$Rank.gxxa[24] = -928300566;
        fo$Rank.gxxa[25] = 1182494148;
        fo$Rank.gxxa[26] = -1716176646;
        fo$Rank.gxxa[27] = -1919578970;
        fo$Rank.gxxa[28] = 1006488507;
        fo$Rank.gxxa[29] = 1101904037;
        fo$Rank.gxxa[30] = 1609217701;
        fo$Rank.gxxa[31] = -1237023712;
        fo$Rank.gxxa[32] = 2054618236;
        fo$Rank.gxxa[33] = -1118934543;
        fo$Rank.gxxa[34] = -5078969;
        fo$Rank.gxxa[35] = -652185675;
        fo$Rank.gxxa[36] = -180632198;
        fo$Rank.gxxa[37] = 124581087;
        fo$Rank.gxxa[38] = -1224303631;
        fo$Rank.gxxa[39] = -382201808;
        fo$Rank.gxxa[40] = 253976532;
        fo$Rank.gxxa[41] = 948532365;
        fo$Rank.gxxa[42] = 71090984;
        fo$Rank.gxxa[43] = 487146991;
        fo$Rank.gxxa[44] = 1685928507;
        fo$Rank.gxxa[45] = -2006235325;
        fo$Rank.gxxa[46] = -1230896830;
        fo$Rank.gxxa[47] = 2084223016;
        fo$Rank.gxxa[48] = -550775663;
        fo$Rank.gxxa[49] = -586704914;
        fo$Rank.gxxa[50] = 46475334;
        fo$Rank.gxxa[51] = 1534607741;
        fo$Rank.gxxa[52] = 742706565;
        fo$Rank.gxxa[53] = -40613804;
        fo$Rank.gxxa[54] = 1586803370;
        fo$Rank.gxxa[55] = -170561789;
        fo$Rank.gxxa[56] = 1260129036;
        fo$Rank.gxxa[57] = 94443902;
        fo$Rank.gxxa[58] = 1258616570;
        fo$Rank.gxxa[59] = -1205831142;
        fo$Rank.gxxa[60] = 947035188;
        fo$Rank.gxxa[61] = 1059398946;
        fo$Rank.gxxa[62] = 402969258;
        fo$Rank.gxxa[63] = -1075493433;
        fo$Rank.gxxa[64] = 1340443896;
        fo$Rank.gxxa[65] = -917338989;
        fo$Rank.gxxa[66] = -547189491;
        fo$Rank.gxxa[67] = 1207512542;
        fo$Rank.gxxa[68] = 1048407311;
        fo$Rank.gxxa[69] = -1752760834;
        fo$Rank.gxxa[70] = 1964787509;
        fo$Rank.gxxa[71] = -1975316536;
        fo$Rank.gxxa[72] = 734794079;
        fo$Rank.gxxa[73] = -667958242;
        fo$Rank.gxxa[74] = -1395502741;
        fo$Rank.gxxa[75] = -1701889746;
        fo$Rank.gxxa[76] = -1320556839;
        fo$Rank.gxxa[77] = -538726941;
        fo$Rank.gxxa[78] = 1713377408;
        fo$Rank.gxxa[79] = 2117714015;
        fo$Rank.gxxa[80] = -571692159;
        fo$Rank.gxxa[81] = 258650861;
        fo$Rank.gxxa[82] = 967564446;
        fo$Rank.gxxa[83] = -1009376361;
        fo$Rank.gxxa[84] = -1915668749;
        fo$Rank.gxxa[85] = 1319009382;
        fo$Rank.gxxa[86] = 1688055483;
        fo$Rank.gxxa[87] = -202953769;
        fo$Rank.gxxa[88] = -361262771;
        fo$Rank.gxxa[89] = -134565001;
        fo$Rank.gxxa[90] = 950764060;
        fo$Rank.gxxa[91] = -406563060;
        fo$Rank.gxxa[92] = -2116949887;
        fo$Rank.gxxa[93] = -407056854;
        fo$Rank.gxxa[94] = 477044881;
        fo$Rank.gxxa[95] = 268100406;
        fo$Rank.gxxa[96] = -743722665;
        fo$Rank.gxxa[97] = 1076278810;
        fo$Rank.gxxa[98] = -1015229153;
        fo$Rank.gxxa[99] = -1582877126;
    }

    private static /* synthetic */ long gxxf(int n2) {
        return gxxg[n2] ^ gxxh[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private fo$Rank(char var1_1, String var2_2) {
        var4_3 /* !! */  = fo$Rank.b;
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        block0 : switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                super();
                this.symbol = var1_1;
                this.name = var2_2;
                return;
            }
lbl9:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_3 /* !! */  = (int)fo$Rank.gxxb("gxxc", gxwy(int ), (int)0);
                    break block0;
                    break;
                }
            }
            case 1: {
                var4_3 /* !! */  = (int)fo$Rank.gxxb("gxxd", gxwy(int ), (int)1);
                ** GOTO lbl9
            }
            case 2: 
        }
        var4_3 /* !! */  = (int)fo$Rank.gxxb("gxxe", gxwy(int ), (int)2);
        ** while (true)
    }

    private static /* synthetic */ void gydv() {
        fo$Rank.gxxh[0] = 714513840053831233L;
        fo$Rank.gxxh[1] = -3124299426758492218L;
        fo$Rank.gxxh[2] = 6787079014889794862L;
        fo$Rank.gxxh[3] = 6593846131910516149L;
        fo$Rank.gxxh[4] = -3386341665966906878L;
        fo$Rank.gxxh[5] = 4191758349748818356L;
        fo$Rank.gxxh[6] = 5220630714810371673L;
        fo$Rank.gxxh[7] = -1676064712963324931L;
        fo$Rank.gxxh[8] = -3973351990113942028L;
        fo$Rank.gxxh[9] = -3814091147752299158L;
        fo$Rank.gxxh[10] = 2638138323278937716L;
        fo$Rank.gxxh[11] = 8596597113378567350L;
        fo$Rank.gxxh[12] = -5380395015096779368L;
        fo$Rank.gxxh[13] = 1194893239535505055L;
        fo$Rank.gxxh[14] = -3054871669240858069L;
        fo$Rank.gxxh[15] = -9196546611229112978L;
        fo$Rank.gxxh[16] = 6418892491995947686L;
        fo$Rank.gxxh[17] = -4765018083747092910L;
        fo$Rank.gxxh[18] = -8546522351651323933L;
        fo$Rank.gxxh[19] = 1191120993562039033L;
        fo$Rank.gxxh[20] = -1286070902695601102L;
        fo$Rank.gxxh[21] = 6954339847929046286L;
        fo$Rank.gxxh[22] = -21576406685104637L;
        fo$Rank.gxxh[23] = -1782096466058868822L;
        fo$Rank.gxxh[24] = 3778648074607230735L;
        fo$Rank.gxxh[25] = 5811175593810900067L;
        fo$Rank.gxxh[26] = 1144728310517548824L;
        fo$Rank.gxxh[27] = -9098441534173263941L;
        fo$Rank.gxxh[28] = -1957417347379692782L;
        fo$Rank.gxxh[29] = -3842397903999943658L;
        fo$Rank.gxxh[30] = -1912984005627905301L;
        fo$Rank.gxxh[31] = 2687720983851886530L;
        fo$Rank.gxxh[32] = -6603540581040837794L;
        fo$Rank.gxxh[33] = -6969827273418422203L;
        fo$Rank.gxxh[34] = -3134958180440019169L;
        fo$Rank.gxxh[35] = 5118315024396143002L;
        fo$Rank.gxxh[36] = -8708322732611396149L;
        fo$Rank.gxxh[37] = -891869799935198301L;
        fo$Rank.gxxh[38] = -8339618830786142344L;
        fo$Rank.gxxh[39] = -4412473157970464965L;
        fo$Rank.gxxh[40] = -4248581443700635156L;
        fo$Rank.gxxh[41] = 9208615300340137437L;
        fo$Rank.gxxh[42] = 3064194631855040178L;
        fo$Rank.gxxh[43] = 5479851341573666207L;
        fo$Rank.gxxh[44] = 3789261226742132831L;
        fo$Rank.gxxh[45] = 531848118128578772L;
        fo$Rank.gxxh[46] = 2514141051038581738L;
        fo$Rank.gxxh[47] = -5452931506097875517L;
        fo$Rank.gxxh[48] = -920391659921185619L;
        fo$Rank.gxxh[49] = 4571965131124320797L;
        fo$Rank.gxxh[50] = 9198820153692997041L;
        fo$Rank.gxxh[51] = -9136453050135837572L;
        fo$Rank.gxxh[52] = -205035713365527929L;
        fo$Rank.gxxh[53] = -65470092436716440L;
        fo$Rank.gxxh[54] = 5813686551312683833L;
        fo$Rank.gxxh[55] = 5737362243471038105L;
        fo$Rank.gxxh[56] = 4355752036811769071L;
        fo$Rank.gxxh[57] = 6852884273102911886L;
        fo$Rank.gxxh[58] = -5261019731324633867L;
        fo$Rank.gxxh[59] = -1864123061736662266L;
        fo$Rank.gxxh[60] = 4912997911817547033L;
        fo$Rank.gxxh[61] = -6943004446103664802L;
        fo$Rank.gxxh[62] = 2940500809182413671L;
        fo$Rank.gxxh[63] = 7431552837389856139L;
        fo$Rank.gxxh[64] = 4350351113319412156L;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public final boolean equals(Object object) {
        boolean bl2;
        Object object2 = ns;
        boolean bl3 = true;
        block10: while (true) {
            CallSite callSite;
            if (!bl3 || (bl3 = false) || !true) {
                object2 = callSite - fo$Rank.gxxb("gyau", gxxf(int ), (int)37);
            }
            switch ((int)object2) {
                case -983661369: {
                    break block10;
                }
                case -623224271: {
                    callSite = fo$Rank.gxxb("gyav", gxxf(int ), (int)38);
                    continue block10;
                }
                case 868304535: {
                    callSite = fo$Rank.gxxb("gyaw", gxxf(int ), (int)39);
                    continue block10;
                }
            }
            break;
        }
        boolean bl4 = c;
        while (true) {
            long l2;
            Object object3;
            if ((object3 = (l2 = ns - fo$Rank.gxxb("gyax", gxxf(int ), (int)40)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object3 == fo$Rank.gxxb("gyay", gxwy(int ), (int)56)) break;
            object3 = fo$Rank.gxxb("gyaz", gxwy(int ), (int)57);
        }
        int n2 = b;
        while (true) {
            long l3;
            Object object4;
            if ((object4 = (l3 = ns - fo$Rank.gxxb("gyba", gxxf(int ), (int)41)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object4 == fo$Rank.gxxb("gybb", gxwy(int ), (int)58)) {
                bl2 = a;
                if (bl4) {
                    throw null;
                }
                break;
            }
            object4 = fo$Rank.gxxb("gybc", gxwy(int ), (int)59);
        }
        if (bl2) return (boolean)fo$Rank.gxxb("gybd", gxwy(int ), (int)60);
        if (bl2) return (boolean)fo$Rank.gxxb("gybd", gxwy(int ), (int)60);
        Object object5 = ns;
        boolean bl5 = true;
        block13: while (true) {
            CallSite callSite;
            if (!bl5 || (bl5 = false) || !true) {
                object5 = callSite - fo$Rank.gxxb("gybe", gxxf(int ), (int)42);
            }
            switch ((int)object5) {
                case -983661369: {
                    return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{fo$Rank.class, "symbol;name", "symbol", "name"}, this, object);
                }
                case 755339593: {
                    callSite = fo$Rank.gxxb("gybf", gxxf(int ), (int)43);
                    continue block13;
                }
                case 976220235: {
                    callSite = fo$Rank.gxxb("gybg", gxxf(int ), (int)44);
                    continue block13;
                }
            }
            break;
        }
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{fo$Rank.class, "symbol;name", "symbol", "name"}, this, object);
    }

    private static /* synthetic */ int gxwy(int n2) {
        return gxwz[n2] ^ gxxa[n2];
    }
}

