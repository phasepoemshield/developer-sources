/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_4185
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.minecraft.class_4185;
import ruhack.phobia.an;
import ruhack.phobia.oh;

public class oi {
    public static final boolean a;
    private static long[] lzzu;
    public static final boolean c;
    private static int[] maaa;
    private static long[] lzzt;
    private static int[] maab;
    public static final long uw = 2998486224788081560L;
    public static class_4185 proxyMenuButton;
    public static final int b;

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public static String getLastUsedProxyIp() {
        String string;
        oh oh2;
        boolean bl2;
        block40: {
            Object object = uw;
            boolean bl3 = true;
            block20: while (true) {
                CallSite callSite;
                if (!bl3 || (bl3 = false) || !true) {
                    object = callSite - oi.lzzv("maei", lzzs(int ), (int)62);
                }
                switch ((int)object) {
                    case -1268429928: {
                        break block20;
                    }
                    case -156221413: {
                        callSite = oi.lzzv("maej", lzzs(int ), (int)63);
                        continue block20;
                    }
                    case 1995873647: {
                        callSite = oi.lzzv("maek", lzzs(int ), (int)64);
                        continue block20;
                    }
                }
                break;
            }
            boolean bl4 = c;
            Object object2 = uw;
            boolean bl5 = true;
            block21: while (true) {
                CallSite callSite;
                if (!bl5 || (bl5 = false) || !true) {
                    object2 = callSite - oi.lzzv("mael", lzzs(int ), (int)65);
                }
                switch ((int)object2) {
                    case -1535592813: {
                        callSite = oi.lzzv("maem", lzzs(int ), (int)66);
                        continue block21;
                    }
                    case -1268429928: {
                        break block21;
                    }
                    case 981764991: {
                        callSite = oi.lzzv("maen", lzzs(int ), (int)67);
                        continue block21;
                    }
                    case 1679349071: {
                        callSite = oi.lzzv("maeo", lzzs(int ), (int)68);
                        continue block21;
                    }
                }
                break;
            }
            int n2 = b;
            while (true) {
                long l2;
                Object object3;
                if ((object3 = (l2 = uw - oi.lzzv("maep", lzzs(int ), (int)69)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (object3 == oi.lzzv("maeq", lzzz(int ), (int)51)) {
                    bl2 = a;
                    if (bl4) {
                        throw null;
                    }
                    break;
                }
                object3 = oi.lzzv("maer", lzzz(int ), (int)52);
            }
            if (bl2 || bl2) return null;
            Object object4 = uw;
            block23: while (true) {
                switch ((int)object4) {
                    case -1842057014: {
                        object4 = oi.lzzv("maet", lzzs(int ), (int)71) - oi.lzzv("maes", lzzs(int ), (int)70);
                        continue block23;
                    }
                    case -1268429928: {
                        break block23;
                    }
                }
                break;
            }
            oh2 = oi.getLastUsedProxy();
            if (bl2 || bl2) return null;
            while (true) {
                long l3;
                Object object5;
                if ((object5 = (l3 = uw - oi.lzzv("maeu", lzzs(int ), (int)72)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (object5 == oi.lzzv("maev", lzzz(int ), (int)53)) {
                    if (oh2.isEmpty()) {
                        break;
                    }
                    break block40;
                }
                object5 = oi.lzzv("maew", lzzz(int ), (int)54);
            }
            if (bl2) return null;
            string = "none";
            if (!bl4) return string;
            throw null;
        }
        if (bl2 || bl2) {
            return null;
        }
        Object object = uw;
        boolean bl6 = true;
        block25: while (true) {
            CallSite callSite;
            if (!bl6 || (bl6 = false) || !true) {
                object = callSite - oi.lzzv("maex", lzzs(int ), (int)73);
            }
            switch ((int)object) {
                case -1268429928: {
                    break block25;
                }
                case -1261911303: {
                    callSite = oi.lzzv("maey", lzzs(int ), (int)74);
                    continue block25;
                }
                case -262034383: {
                    callSite = oi.lzzv("maez", lzzs(int ), (int)75);
                    continue block25;
                }
            }
            break;
        }
        string = oh2.getIp();
        return string;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean isProxyEnabled() {
        boolean bl2;
        Object object = uw;
        block12: while (true) {
            switch ((int)object) {
                case -1268429928: {
                    break block12;
                }
                case -455069860: {
                    object = oi.lzzv("lzzx", lzzs(int ), (int)1) - oi.lzzv("lzzw", lzzs(int ), (int)0);
                    continue block12;
                }
            }
            break;
        }
        boolean bl3 = c;
        while (true) {
            long l2;
            Object object2;
            if ((object2 = (l2 = uw - oi.lzzv("lzzy", lzzs(int ), (int)2)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object2 == oi.lzzv("maac", lzzz(int ), (int)0)) break;
            object2 = oi.lzzv("maad", lzzz(int ), (int)1);
        }
        int n2 = b;
        while (true) {
            long l3;
            Object object3;
            if ((object3 = (l3 = uw - oi.lzzv("maae", lzzs(int ), (int)3)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object3 == oi.lzzv("maaf", lzzz(int ), (int)2)) {
                bl2 = a;
                if (bl3) {
                    throw null;
                }
                break;
            }
            object3 = oi.lzzv("maag", lzzz(int ), (int)3);
        }
        if (bl2) return (boolean)oi.lzzv("maah", lzzz(int ), (int)4);
        if (bl2) return (boolean)oi.lzzv("maah", lzzz(int ), (int)4);
        Object object4 = uw;
        block15: while (true) {
            switch ((int)object4) {
                case -1268429928: {
                    break block15;
                }
                case -872571280: {
                    object4 = oi.lzzv("maaj", lzzs(int ), (int)5) - oi.lzzv("maai", lzzs(int ), (int)4);
                    continue block15;
                }
            }
            break;
        }
        an an2 = an.getInstance();
        Object object5 = uw;
        block16: while (true) {
            switch ((int)object5) {
                case -1268429928: {
                    return an2.isProxyEnabled();
                }
                case -895487092: {
                    object5 = oi.lzzv("maal", lzzs(int ), (int)7) - oi.lzzv("maak", lzzs(int ), (int)6);
                    continue block16;
                }
            }
            break;
        }
        return an2.isProxyEnabled();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void setLastUsedProxy(oh var0) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = oi.uw - oi.lzzv("mado", lzzs(int ), (int)56)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == oi.lzzv("madp", lzzz(int ), (int)37)) break;
            v0 /* !! */  = (long)oi.lzzv("madq", lzzz(int ), (int)38);
        }
        var3_1 = oi.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = oi.uw - oi.lzzv("madr", lzzs(int ), (int)57)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == oi.lzzv("mads", lzzz(int ), (int)39)) break;
            v1 /* !! */  = (long)oi.lzzv("madt", lzzz(int ), (int)40);
        }
        var2_2 /* !! */  = oi.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = oi.uw - oi.lzzv("madu", lzzs(int ), (int)58)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == oi.lzzv("madv", lzzz(int ), (int)41)) break;
            v2 /* !! */  = (long)oi.lzzv("madw", lzzz(int ), (int)42);
        }
        var1_3 = oi.a;
        if (var3_1) {
            throw null;
lbl21:
            // 3 sources

            return;
        }
        if (var1_3) ** GOTO lbl21
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl21
                v3 /* !! */  = oi.uw;
                if (true) ** GOTO lbl32
                block16: while (true) {
                    v3 /* !! */  = (long)(oi.lzzv("mady", lzzs(int ), (int)60) - oi.lzzv("madx", lzzs(int ), (int)59));
lbl32:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1268429928: {
                            break block16;
                        }
                        case 1885553301: {
                            continue block16;
                        }
                    }
                    break;
                }
                v4 = an.getInstance();
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_3 = oi.uw - oi.lzzv("madz", lzzs(int ), (int)61)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == oi.lzzv("maea", lzzz(int ), (int)43)) break;
                    v5 /* !! */  = (long)oi.lzzv("maeb", lzzz(int ), (int)44);
                }
                v4.setLastUsedProxy(var0);
                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
lbl47:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)oi.lzzv("maec", lzzz(int ), (int)45);
                if (!var3_1) break;
                throw null;
            }
            case 1: {
                var2_2 /* !! */  = (int)oi.lzzv("maed", lzzz(int ), (int)46);
                if (!var3_1) ** GOTO lbl47
                throw null;
            }
lbl55:
            // 3 sources

            case 2: {
                var2_2 /* !! */  = (int)oi.lzzv("maee", lzzz(int ), (int)47);
                if (var3_1) {
                    throw null;
                }
            }
            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)oi.lzzv("maef", lzzz(int ), (int)48);
                    if (!var3_1) ** GOTO lbl55
                    throw null;
                }
            }
            case 4: {
                var2_2 /* !! */  = (int)oi.lzzv("maeg", lzzz(int ), (int)49);
                if (!var3_1) ** GOTO lbl55
                throw null;
            }
            case 5: 
        }
        var2_2 /* !! */  = (int)oi.lzzv("maeh", lzzz(int ), (int)50);
        ** while (!var3_1)
lbl71:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ int lzzz(int n2) {
        return maaa[n2] ^ maab[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static oh getLastUsedProxy() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = oi.uw - oi.lzzv("macx", lzzs(int ), (int)47)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == oi.lzzv("macy", lzzz(int ), (int)29)) break;
            v0 /* !! */  = (long)oi.lzzv("macz", lzzz(int ), (int)30);
        }
        var2 = oi.c;
        v1 /* !! */  = oi.uw;
        if (true) ** GOTO lbl12
        block20: while (true) {
            v1 /* !! */  = (long)(v2 - oi.lzzv("mada", lzzs(int ), (int)48));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1268429928: {
                    break block20;
                }
                case 756410743: {
                    v2 = oi.lzzv("madb", lzzs(int ), (int)49);
                    continue block20;
                }
                case 2015056606: {
                    v2 = oi.lzzv("madc", lzzs(int ), (int)50);
                    continue block20;
                }
            }
            break;
        }
        var1_1 /* !! */  = oi.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = oi.uw - oi.lzzv("madd", lzzs(int ), (int)51)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == oi.lzzv("made", lzzz(int ), (int)31)) break;
            v3 /* !! */  = (long)oi.lzzv("madf", lzzz(int ), (int)32);
        }
        var0_2 = oi.a;
        if (var2) {
            throw null;
lbl31:
            // 2 sources

            return null;
        }
        if (var0_2) ** GOTO lbl31
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var0_2) ** continue;
                v4 /* !! */  = oi.uw;
                if (true) ** GOTO lbl42
                block23: while (true) {
                    v4 /* !! */  = (long)(oi.lzzv("madh", lzzs(int ), (int)53) - oi.lzzv("madg", lzzs(int ), (int)52));
lbl42:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1268429928: {
                            break block23;
                        }
                        case -291266063: {
                            continue block23;
                        }
                    }
                    break;
                }
                v5 = an.getInstance();
                v6 /* !! */  = oi.uw;
                if (true) ** GOTO lbl52
                block24: while (true) {
                    v6 /* !! */  = (long)(oi.lzzv("madj", lzzs(int ), (int)55) - oi.lzzv("madi", lzzs(int ), (int)54));
lbl52:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1407914372: {
                            continue block24;
                        }
                        case -1268429928: {
                            break block24;
                        }
                    }
                    break;
                }
                return v5.getLastUsedProxy();
            }
            case 0: {
                var1_1 /* !! */  = (int)oi.lzzv("madk", lzzz(int ), (int)33);
                if (var2) {
                    throw null;
                }
            }
lbl62:
            // 4 sources

            case 1: {
                do {
                    var1_1 /* !! */  = (int)oi.lzzv("madl", lzzz(int ), (int)34);
                } while (!var2);
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)oi.lzzv("madm", lzzz(int ), (int)35);
                    if (!var2) ** GOTO lbl62
                    throw null;
                }
            }
            case 3: 
        }
        var1_1 /* !! */  = (int)oi.lzzv("madn", lzzz(int ), (int)36);
        ** while (!var2)
lbl75:
        // 1 sources

        throw null;
    }

    public static /* synthetic */ CallSite lzzv(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void setProxyEnabled(boolean var0) {
        v0 /* !! */  = oi.uw;
        if (true) ** GOTO lbl5
        block29: while (true) {
            v0 /* !! */  = (long)(oi.lzzv("maar", lzzs(int ), (int)9) - oi.lzzv("maaq", lzzs(int ), (int)8));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1268429928: {
                    break block29;
                }
                case 490952761: {
                    continue block29;
                }
            }
            break;
        }
        var3_1 = oi.c;
        v1 /* !! */  = oi.uw;
        if (true) ** GOTO lbl15
        block30: while (true) {
            v1 /* !! */  = (long)(v2 - oi.lzzv("maas", lzzs(int ), (int)10));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1734759713: {
                    v2 = oi.lzzv("maat", lzzs(int ), (int)11);
                    continue block30;
                }
                case -1268429928: {
                    break block30;
                }
                case 386686415: {
                    v2 = oi.lzzv("maau", lzzs(int ), (int)12);
                    continue block30;
                }
                case 1261592435: {
                    v2 = oi.lzzv("maav", lzzs(int ), (int)13);
                    continue block30;
                }
            }
            break;
        }
        var2_2 /* !! */  = oi.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_0 = oi.uw - oi.lzzv("maaw", lzzs(int ), (int)14)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == oi.lzzv("maax", lzzz(int ), (int)9)) break;
            v3 /* !! */  = (long)oi.lzzv("maay", lzzz(int ), (int)10);
        }
        var1_3 = oi.a;
        if (var3_1) {
            throw null;
lbl37:
            // 2 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl37
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v4 /* !! */  = oi.uw;
                if (true) ** GOTO lbl47
                block33: while (true) {
                    v4 /* !! */  = (long)(v5 - oi.lzzv("maaz", lzzs(int ), (int)15));
lbl47:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -2094008367: {
                            v5 = oi.lzzv("maba", lzzs(int ), (int)16);
                            continue block33;
                        }
                        case -1268429928: {
                            break block33;
                        }
                        case -364555161: {
                            v5 = oi.lzzv("mabb", lzzs(int ), (int)17);
                            continue block33;
                        }
                        case 219568723: {
                            v5 = oi.lzzv("mabc", lzzs(int ), (int)18);
                            continue block33;
                        }
                    }
                    break;
                }
                v6 = an.getInstance();
                v7 /* !! */  = oi.uw;
                if (true) ** GOTO lbl64
                block34: while (true) {
                    v7 /* !! */  = (long)(v8 - oi.lzzv("mabd", lzzs(int ), (int)19));
lbl64:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -1268429928: {
                            break block34;
                        }
                        case -326519512: {
                            v8 = oi.lzzv("mabe", lzzs(int ), (int)20);
                            continue block34;
                        }
                        case 311481164: {
                            v8 = oi.lzzv("mabf", lzzs(int ), (int)21);
                            continue block34;
                        }
                    }
                    break;
                }
                v6.setProxyEnabled(var0);
                if (var1_3 || var1_3) ** continue;
                return;
            }
            case 0: {
                var2_2 /* !! */  = (int)oi.lzzv("mabg", lzzz(int ), (int)11);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl90
            }
lbl81:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)oi.lzzv("mabh", lzzz(int ), (int)12);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl90
            }
            case 2: {
                var2_2 /* !! */  = (int)oi.lzzv("mabi", lzzz(int ), (int)13);
                if (var3_1) {
                    throw null;
                }
            }
lbl90:
            // 5 sources

            case 3: {
                var2_2 /* !! */  = (int)oi.lzzv("mabj", lzzz(int ), (int)14);
                if (var3_1) {
                    throw null;
                }
            }
            case 4: {
                var2_2 /* !! */  = (int)oi.lzzv("mabk", lzzz(int ), (int)15);
                if (!var3_1) ** GOTO lbl81
                throw null;
            }
            case 5: 
        }
        do {
            var2_2 /* !! */  = (int)oi.lzzv("mabl", lzzz(int ), (int)16);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ void mahh() {
        oi.lzzt[100] = 7939032335513993812L;
        oi.lzzt[101] = 6206323028768393624L;
    }

    private static /* synthetic */ void mahi() {
        oi.lzzu[0] = -8438009275709895457L;
        oi.lzzu[1] = 7243744340058593898L;
        oi.lzzu[2] = 5595786207993284522L;
        oi.lzzu[3] = -6901385190416740817L;
        oi.lzzu[4] = 3710540606255965229L;
        oi.lzzu[5] = 7343606308319906804L;
        oi.lzzu[6] = -2408927549248136104L;
        oi.lzzu[7] = 5981031529032695600L;
        oi.lzzu[8] = -2784416947089014814L;
        oi.lzzu[9] = 615940585806729560L;
        oi.lzzu[10] = -3892274360957871236L;
        oi.lzzu[11] = -8014640882769410025L;
        oi.lzzu[12] = 8506710175621239036L;
        oi.lzzu[13] = -452964768304342375L;
        oi.lzzu[14] = 4390677527633003705L;
        oi.lzzu[15] = 115248427155398192L;
        oi.lzzu[16] = 1089107101366380348L;
        oi.lzzu[17] = -6210915072978023624L;
        oi.lzzu[18] = -1878332911585987365L;
        oi.lzzu[19] = 2475826484552123001L;
        oi.lzzu[20] = 1368837658695460639L;
        oi.lzzu[21] = -3375281559375136482L;
        oi.lzzu[22] = -5993164605360883001L;
        oi.lzzu[23] = -5626471713022686035L;
        oi.lzzu[24] = -4230057335749285500L;
        oi.lzzu[25] = -7412944212142720766L;
        oi.lzzu[26] = -3523793427562719908L;
        oi.lzzu[27] = -5155752258027151613L;
        oi.lzzu[28] = 1211920260519149343L;
        oi.lzzu[29] = 3930727537768993998L;
        oi.lzzu[30] = 2474301063681556282L;
        oi.lzzu[31] = 4351076564477302291L;
        oi.lzzu[32] = 7465332129527672252L;
        oi.lzzu[33] = 5980584920279803750L;
        oi.lzzu[34] = -9166315043589408084L;
        oi.lzzu[35] = 2158752525327808306L;
        oi.lzzu[36] = -5032640180751400593L;
        oi.lzzu[37] = -4338288676787191975L;
        oi.lzzu[38] = 6102301266537544716L;
        oi.lzzu[39] = 151284700291690770L;
        oi.lzzu[40] = 3763782685453118738L;
        oi.lzzu[41] = -9057581206357439506L;
        oi.lzzu[42] = 1560833244007714942L;
        oi.lzzu[43] = 226901236635403032L;
        oi.lzzu[44] = -6820047776604955271L;
        oi.lzzu[45] = 4418974042150278093L;
        oi.lzzu[46] = -536644921550797842L;
        oi.lzzu[47] = 5317597966951736044L;
        oi.lzzu[48] = 8139648846420804293L;
        oi.lzzu[49] = 7233173119341250851L;
        oi.lzzu[50] = -3235457071452463457L;
        oi.lzzu[51] = 5739304019600817494L;
        oi.lzzu[52] = -1789621370192443241L;
        oi.lzzu[53] = 2136231457784499008L;
        oi.lzzu[54] = 3520570523454753854L;
        oi.lzzu[55] = 6667040623200654849L;
        oi.lzzu[56] = 244281155267265334L;
        oi.lzzu[57] = -7887113883017257808L;
        oi.lzzu[58] = -4439429980029998072L;
        oi.lzzu[59] = 2572931011747148170L;
        oi.lzzu[60] = -882315366404640860L;
        oi.lzzu[61] = -6055282467550411981L;
        oi.lzzu[62] = 2925555318690054969L;
        oi.lzzu[63] = -5701501552191388603L;
        oi.lzzu[64] = -3063151991909153103L;
        oi.lzzu[65] = -2969344285870470385L;
        oi.lzzu[66] = -3074193619694833878L;
        oi.lzzu[67] = -3408094173988717165L;
        oi.lzzu[68] = 5292546899029537025L;
        oi.lzzu[69] = 100429443260152003L;
        oi.lzzu[70] = -4003601981037111498L;
        oi.lzzu[71] = -7548079228464721406L;
        oi.lzzu[72] = -2861079157081087022L;
        oi.lzzu[73] = 6505901616946250694L;
        oi.lzzu[74] = 9058064789596151950L;
        oi.lzzu[75] = 1166916498423794622L;
        oi.lzzu[76] = -2483311311064780072L;
        oi.lzzu[77] = -2793833476119819458L;
        oi.lzzu[78] = -5713020903114450349L;
        oi.lzzu[79] = 2626754345206107342L;
        oi.lzzu[80] = -3395129484719866719L;
        oi.lzzu[81] = -563319018540420006L;
        oi.lzzu[82] = 4189527996086863367L;
        oi.lzzu[83] = -3514737509704823396L;
        oi.lzzu[84] = 7616704189448044266L;
        oi.lzzu[85] = 5592667324682859111L;
        oi.lzzu[86] = -5996404846499788454L;
        oi.lzzu[87] = -3608240351294371553L;
        oi.lzzu[88] = -2660179923987822934L;
        oi.lzzu[89] = -4104147448896440725L;
        oi.lzzu[90] = 6260101292813531659L;
        oi.lzzu[91] = 6271334236001835259L;
        oi.lzzu[92] = 84690709689924202L;
        oi.lzzu[93] = -8877299134324015627L;
        oi.lzzu[94] = -7323015321425740844L;
        oi.lzzu[95] = 4064933530012581329L;
        oi.lzzu[96] = -3948461129924637111L;
        oi.lzzu[97] = -1594790468108528499L;
        oi.lzzu[98] = 6582636681616079635L;
        oi.lzzu[99] = 3417509794240643926L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static oh getProxy() {
        v0 /* !! */  = oi.uw;
        if (true) ** GOTO lbl5
        block26: while (true) {
            v0 /* !! */  = (long)(v1 - oi.lzzv("mabm", lzzs(int ), (int)22));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1268429928: {
                    break block26;
                }
                case 793488684: {
                    v1 = oi.lzzv("mabn", lzzs(int ), (int)23);
                    continue block26;
                }
                case 2018787130: {
                    v1 = oi.lzzv("mabo", lzzs(int ), (int)24);
                    continue block26;
                }
            }
            break;
        }
        var2 = oi.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = oi.uw - oi.lzzv("mabp", lzzs(int ), (int)25)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == oi.lzzv("mabq", lzzz(int ), (int)17)) break;
            v2 /* !! */  = (long)oi.lzzv("mabr", lzzz(int ), (int)18);
        }
        var1_1 /* !! */  = oi.b;
        v3 /* !! */  = oi.uw;
        if (true) ** GOTO lbl26
        block28: while (true) {
            v3 /* !! */  = (long)(oi.lzzv("mabt", lzzs(int ), (int)27) - oi.lzzv("mabs", lzzs(int ), (int)26));
lbl26:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1268429928: {
                    break block28;
                }
                case 252320785: {
                    continue block28;
                }
            }
            break;
        }
        var0_2 = oi.a;
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        block9 : switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2) {
                    throw null;
                    return null;
                }
                if (var0_2 || var0_2) ** continue;
                v4 /* !! */  = oi.uw;
                if (true) ** GOTO lbl44
                block30: while (true) {
                    v4 /* !! */  = (long)(v5 - oi.lzzv("mabu", lzzs(int ), (int)28));
lbl44:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1611357281: {
                            v5 = oi.lzzv("mabv", lzzs(int ), (int)29);
                            continue block30;
                        }
                        case -1268429928: {
                            break block30;
                        }
                        case -337466724: {
                            v5 = oi.lzzv("mabw", lzzs(int ), (int)30);
                            continue block30;
                        }
                        case 2045112714: {
                            v5 = oi.lzzv("mabx", lzzs(int ), (int)31);
                            continue block30;
                        }
                    }
                    break;
                }
                v6 = an.getInstance();
                v7 /* !! */  = oi.uw;
                if (true) ** GOTO lbl61
                block31: while (true) {
                    v7 /* !! */  = (long)(v8 - oi.lzzv("maby", lzzs(int ), (int)32));
lbl61:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -1268429928: {
                            break block31;
                        }
                        case -271184379: {
                            v8 = oi.lzzv("mabz", lzzs(int ), (int)33);
                            continue block31;
                        }
                        case 407922774: {
                            v8 = oi.lzzv("maca", lzzs(int ), (int)34);
                            continue block31;
                        }
                    }
                    break;
                }
                return v6.getDefaultProxy();
            }
lbl71:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)oi.lzzv("macb", lzzz(int ), (int)19);
                    if (!var2) break block9;
                    throw null;
                }
            }
            case 1: {
                do {
                    var1_1 /* !! */  = (int)oi.lzzv("macc", lzzz(int ), (int)20);
                } while (!var2);
                throw null;
            }
            case 2: {
                var1_1 /* !! */  = (int)oi.lzzv("macd", lzzz(int ), (int)21);
                if (!var2) ** GOTO lbl71
                throw null;
            }
            case 3: 
        }
        var1_1 /* !! */  = (int)oi.lzzv("mace", lzzz(int ), (int)22);
        ** while (!var2)
lbl88:
        // 1 sources

        throw null;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public static void setProxy(oh oh2) {
        block35: {
            block34: {
                Object object = uw;
                boolean bl2 = true;
                block22: while (true) {
                    CallSite callSite;
                    if (!bl2 || (bl2 = false) || !true) {
                        object = callSite - oi.lzzv("macf", lzzs(int ), (int)35);
                    }
                    switch ((int)object) {
                        case -1268429928: {
                            break block22;
                        }
                        case -528065289: {
                            callSite = oi.lzzv("macg", lzzs(int ), (int)36);
                            continue block22;
                        }
                        case 785822074: {
                            callSite = oi.lzzv("mach", lzzs(int ), (int)37);
                            continue block22;
                        }
                    }
                    break;
                }
                boolean bl3 = c;
                Object object2 = uw;
                boolean bl4 = true;
                block23: while (true) {
                    CallSite callSite;
                    if (!bl4 || (bl4 = false) || !true) {
                        object2 = callSite - oi.lzzv("maci", lzzs(int ), (int)38);
                    }
                    switch ((int)object2) {
                        case -2060658605: {
                            callSite = oi.lzzv("macj", lzzs(int ), (int)39);
                            continue block23;
                        }
                        case -1268429928: {
                            break block23;
                        }
                        case -1078917247: {
                            callSite = oi.lzzv("mack", lzzs(int ), (int)40);
                            continue block23;
                        }
                    }
                    break;
                }
                int n2 = b;
                Object object3 = uw;
                block24: while (true) {
                    switch ((int)object3) {
                        case -1268429928: {
                            break block24;
                        }
                        case -293286618: {
                            object3 = oi.lzzv("macm", lzzs(int ), (int)42) - oi.lzzv("macl", lzzs(int ), (int)41);
                            continue block24;
                        }
                    }
                    break;
                }
                boolean bl5 = a;
                if (bl3) {
                    throw null;
                }
                if (bl5 || bl5) break block34;
                Object object4 = uw;
                block25: while (true) {
                    switch ((int)object4) {
                        case -1268429928: {
                            break block25;
                        }
                        case 347355246: {
                            object4 = oi.lzzv("maco", lzzs(int ), (int)44) - oi.lzzv("macn", lzzs(int ), (int)43);
                            continue block25;
                        }
                    }
                    break;
                }
                an an2 = an.getInstance();
                Object object5 = uw;
                block26: while (true) {
                    switch ((int)object5) {
                        case -1268429928: {
                            break block26;
                        }
                        case 963422685: {
                            object5 = oi.lzzv("macq", lzzs(int ), (int)46) - oi.lzzv("macp", lzzs(int ), (int)45);
                            continue block26;
                        }
                    }
                    break;
                }
                an2.setDefaultProxy(oh2);
                if (!bl5 && !bl5) break block35;
            }
            return;
        }
    }

    static {
        maaa = new int[85];
        maab = new int[85];
        oi.mahe();
        oi.mahf();
        lzzt = new long[102];
        lzzu = new long[102];
        oi.mahg();
        oi.mahh();
        oi.mahi();
        oi.mahj();
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static void load() {
        v0 /* !! */  = oi.uw;
        block24: while (true) {
            switch ((int)v0 /* !! */ ) {
                case -1268429928: {
                    break block24;
                }
                case 285236961: {
                    v0 /* !! */  = (long)(oi.lzzv("magj", lzzs(int ), (int)91) - oi.lzzv("magi", lzzs(int ), (int)90));
                    continue block24;
                }
            }
            break;
        }
        var2 = oi.c;
        v1 /* !! */  = oi.uw;
        if (true) ** GOTO lbl14
        block25: while (true) {
            v1 /* !! */  = (long)(v2 - oi.lzzv("magk", lzzs(int ), (int)92));
lbl14:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1268429928: {
                    break block25;
                }
                case -706592879: {
                    v2 = oi.lzzv("magl", lzzs(int ), (int)93);
                    continue block25;
                }
                case 521904235: {
                    v2 = oi.lzzv("magm", lzzs(int ), (int)94);
                    continue block25;
                }
                case 1508788328: {
                    v2 = oi.lzzv("magn", lzzs(int ), (int)95);
                    continue block25;
                }
            }
            break;
        }
        var1_1 /* !! */  = oi.b;
        v3 /* !! */  = oi.uw;
        if (true) ** GOTO lbl31
        block26: while (true) {
            v3 /* !! */  = (long)(v4 - oi.lzzv("mago", lzzs(int ), (int)96));
lbl31:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1268429928: {
                    break block26;
                }
                case 1011563611: {
                    v4 = oi.lzzv("magp", lzzs(int ), (int)97);
                    continue block26;
                }
                case 1888695891: {
                    v4 = oi.lzzv("magq", lzzs(int ), (int)98);
                    continue block26;
                }
                case 1929317896: {
                    v4 = oi.lzzv("magr", lzzs(int ), (int)99);
                    continue block26;
                }
            }
            break;
        }
        var0_2 = oi.a;
        if (var2) {
            throw null;
        }
        if (var0_2 || var0_2) ** GOTO lbl68
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_1 = oi.uw - oi.lzzv("mags", lzzs(int ), (int)100)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == oi.lzzv("magt", lzzz(int ), (int)75)) break;
            v5 /* !! */  = (long)oi.lzzv("magu", lzzz(int ), (int)76);
        }
        v6 = an.getInstance();
        while (true) {
            block39: {
                if ((v7 /* !! */  = (cfr_temp_2 = oi.uw - oi.lzzv("magv", lzzs(int ), (int)101)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v7 /* !! */  != oi.lzzv("magw", lzzz(int ), (int)77)) break block39;
                v6.load();
                if (var1_1 /* !! */  != 0) {
                    break;
                }
                ** GOTO lbl-1000
            }
            v7 /* !! */  = (long)oi.lzzv("magx", lzzz(int ), (int)78);
        }
        cfr_temp_0 = -2147483648;
        block29: do {
            switch (cfr_temp_0 == -2147483648 ? var1_1 /* !! */  : cfr_temp_0) {
                default: lbl-1000:
                // 2 sources

                {
                    if (!var0_2 && !var0_2) ** GOTO lbl69
lbl68:
                    // 2 sources

                    return;
lbl69:
                    // 1 sources

                    return;
                }
                case 0: {
                    var1_1 /* !! */  = (int)oi.lzzv("magy", lzzz(int ), (int)79);
                    cfr_temp_0 = 4;
                    if (!var2) continue block29;
                    throw null;
                }
                case 1: {
                    var1_1 /* !! */  = (int)oi.lzzv("magz", lzzz(int ), (int)80);
                    if (!var2) ** break;
                    throw null;
                }
                case 2: {
                    ** GOTO lbl89
                }
                case 4: {
                    var1_1 /* !! */  = (int)oi.lzzv("mahc", lzzz(int ), (int)83);
                    if (!var2) ** break;
                    throw null;
                }
                case 5: {
                    var1_1 /* !! */  = (int)oi.lzzv("mahd", lzzz(int ), (int)84);
                    if (var2) {
                        throw null;
                    }
lbl89:
                    // 3 sources

                    var1_1 /* !! */  = (int)oi.lzzv("maha", lzzz(int ), (int)81);
                    if (var2) {
                        throw null;
                    }
                }
                case 3: 
            }
            break;
        } while (true);
        do {
            var1_1 /* !! */  = (int)oi.lzzv("mahb", lzzz(int ), (int)82);
        } while (!var2);
        throw null;
    }

    private static /* synthetic */ void mahg() {
        oi.lzzt[0] = -7569318000804198674L;
        oi.lzzt[1] = 6355080395278456157L;
        oi.lzzt[2] = 8646425992565103626L;
        oi.lzzt[3] = 7583049560027679385L;
        oi.lzzt[4] = -2398263084339104924L;
        oi.lzzt[5] = -5719038714195386673L;
        oi.lzzt[6] = -3393609786060301151L;
        oi.lzzt[7] = 2127618601150551732L;
        oi.lzzt[8] = 7898718735664978385L;
        oi.lzzt[9] = 550099123447891297L;
        oi.lzzt[10] = 12371683072141525L;
        oi.lzzt[11] = 4382189541824532875L;
        oi.lzzt[12] = -8954507374923925829L;
        oi.lzzt[13] = -7306007005716827815L;
        oi.lzzt[14] = 272029651771191114L;
        oi.lzzt[15] = 9201561859955461051L;
        oi.lzzt[16] = 7521965298429786963L;
        oi.lzzt[17] = 2356941064246056235L;
        oi.lzzt[18] = -1810953422641299662L;
        oi.lzzt[19] = -4355860353714004563L;
        oi.lzzt[20] = -6823054474340130520L;
        oi.lzzt[21] = 7402640589398534626L;
        oi.lzzt[22] = -7181068057291271519L;
        oi.lzzt[23] = 8772796897183264041L;
        oi.lzzt[24] = 5784982414375446218L;
        oi.lzzt[25] = 8747619393694580973L;
        oi.lzzt[26] = 8347412967183463987L;
        oi.lzzt[27] = -8795275101307822192L;
        oi.lzzt[28] = -2241209889372385252L;
        oi.lzzt[29] = 4689667490721483043L;
        oi.lzzt[30] = -4847165620426375194L;
        oi.lzzt[31] = -7272693164548843337L;
        oi.lzzt[32] = 8174208065605875053L;
        oi.lzzt[33] = -545204131081036693L;
        oi.lzzt[34] = -109152042807687422L;
        oi.lzzt[35] = 2322472759306328409L;
        oi.lzzt[36] = 478735377578249403L;
        oi.lzzt[37] = -2541981806193953729L;
        oi.lzzt[38] = -2279777029529021348L;
        oi.lzzt[39] = -7823632139772695100L;
        oi.lzzt[40] = 7798146753397251482L;
        oi.lzzt[41] = 6039016989726255349L;
        oi.lzzt[42] = 8456075295759605549L;
        oi.lzzt[43] = -1491171024768834861L;
        oi.lzzt[44] = -3668227284193587358L;
        oi.lzzt[45] = -6505419685287861935L;
        oi.lzzt[46] = 6329172026755384808L;
        oi.lzzt[47] = 4306764519220637979L;
        oi.lzzt[48] = 4588652699777962350L;
        oi.lzzt[49] = 7378934715130711668L;
        oi.lzzt[50] = 25151040164361536L;
        oi.lzzt[51] = 7905681814956521859L;
        oi.lzzt[52] = 2480697597805097955L;
        oi.lzzt[53] = 8214777197760984255L;
        oi.lzzt[54] = 6814962328551150343L;
        oi.lzzt[55] = 1536931067579400308L;
        oi.lzzt[56] = -2155754380813726864L;
        oi.lzzt[57] = -1573972032928700208L;
        oi.lzzt[58] = -2974261133485877552L;
        oi.lzzt[59] = 2552909898813049950L;
        oi.lzzt[60] = -4815433460747883831L;
        oi.lzzt[61] = 4290818304692244664L;
        oi.lzzt[62] = 5885048544110882600L;
        oi.lzzt[63] = -4037279360516140538L;
        oi.lzzt[64] = -6678067462790087013L;
        oi.lzzt[65] = 7484042940978279271L;
        oi.lzzt[66] = 5149528458981344831L;
        oi.lzzt[67] = 6192719315391260563L;
        oi.lzzt[68] = -2203546524946307856L;
        oi.lzzt[69] = 835261466939775306L;
        oi.lzzt[70] = -4272733906365519995L;
        oi.lzzt[71] = -6314006569543260782L;
        oi.lzzt[72] = -3066141809742892095L;
        oi.lzzt[73] = 1807943802259222124L;
        oi.lzzt[74] = 4371524073933955096L;
        oi.lzzt[75] = 2507215030449409774L;
        oi.lzzt[76] = 6111246836629837639L;
        oi.lzzt[77] = 8003697607936834646L;
        oi.lzzt[78] = -7317333567071445878L;
        oi.lzzt[79] = 3746720867000543830L;
        oi.lzzt[80] = -2127471763246743854L;
        oi.lzzt[81] = -4628523168137114343L;
        oi.lzzt[82] = 4389927733834826833L;
        oi.lzzt[83] = 3949337091796063982L;
        oi.lzzt[84] = 909637327531778081L;
        oi.lzzt[85] = 282101674136693325L;
        oi.lzzt[86] = 3065752735737734906L;
        oi.lzzt[87] = -521245011658772342L;
        oi.lzzt[88] = -22998465202975982L;
        oi.lzzt[89] = -364088094562040133L;
        oi.lzzt[90] = 1741884320521528387L;
        oi.lzzt[91] = 2308815771227175823L;
        oi.lzzt[92] = -3151630700731815315L;
        oi.lzzt[93] = 7706962544494358354L;
        oi.lzzt[94] = -446993979421388068L;
        oi.lzzt[95] = 2056248150480544183L;
        oi.lzzt[96] = -5022409510516205863L;
        oi.lzzt[97] = 4840233020168012544L;
        oi.lzzt[98] = 7053756716631913867L;
        oi.lzzt[99] = 8790594900986743698L;
    }

    private static /* synthetic */ void mahe() {
        oi.maaa[0] = 2124405164;
        oi.maaa[1] = 862500651;
        oi.maaa[2] = -1043162678;
        oi.maaa[3] = -1472675284;
        oi.maaa[4] = 257027308;
        oi.maaa[5] = -936647174;
        oi.maaa[6] = -701340403;
        oi.maaa[7] = 973593445;
        oi.maaa[8] = 946851506;
        oi.maaa[9] = 988113923;
        oi.maaa[10] = -1464426578;
        oi.maaa[11] = -1629239466;
        oi.maaa[12] = -1493272685;
        oi.maaa[13] = 374376280;
        oi.maaa[14] = 1077837771;
        oi.maaa[15] = -770479484;
        oi.maaa[16] = 753781815;
        oi.maaa[17] = 0x20F2202;
        oi.maaa[18] = 1599355168;
        oi.maaa[19] = 1873864313;
        oi.maaa[20] = -1247496848;
        oi.maaa[21] = 798244143;
        oi.maaa[22] = -2116177894;
        oi.maaa[23] = 1562512829;
        oi.maaa[24] = 168873738;
        oi.maaa[25] = 1419483278;
        oi.maaa[26] = -1550078120;
        oi.maaa[27] = -1384691668;
        oi.maaa[28] = 657050251;
        oi.maaa[29] = 1984644814;
        oi.maaa[30] = 438883834;
        oi.maaa[31] = -223961702;
        oi.maaa[32] = -1392900831;
        oi.maaa[33] = 938949259;
        oi.maaa[34] = 253963346;
        oi.maaa[35] = -1050375440;
        oi.maaa[36] = 721317534;
        oi.maaa[37] = -1524102674;
        oi.maaa[38] = 1809373618;
        oi.maaa[39] = 110069487;
        oi.maaa[40] = -72667757;
        oi.maaa[41] = -638816239;
        oi.maaa[42] = 1047902303;
        oi.maaa[43] = -798912982;
        oi.maaa[44] = 1710168050;
        oi.maaa[45] = -808250164;
        oi.maaa[46] = -913560409;
        oi.maaa[47] = 415337083;
        oi.maaa[48] = -349768884;
        oi.maaa[49] = -1856717325;
        oi.maaa[50] = -873915798;
        oi.maaa[51] = 1495988002;
        oi.maaa[52] = 1883066135;
        oi.maaa[53] = -369507296;
        oi.maaa[54] = 1709600296;
        oi.maaa[55] = -1234496881;
        oi.maaa[56] = 1778291594;
        oi.maaa[57] = -820153394;
        oi.maaa[58] = -645434283;
        oi.maaa[59] = 1292550526;
        oi.maaa[60] = -1238271718;
        oi.maaa[61] = 794941074;
        oi.maaa[62] = -1041686081;
        oi.maaa[63] = -1690097067;
        oi.maaa[64] = -12776166;
        oi.maaa[65] = 1111558815;
        oi.maaa[66] = -120249152;
        oi.maaa[67] = 1268499078;
        oi.maaa[68] = -320832158;
        oi.maaa[69] = 677856850;
        oi.maaa[70] = -1375046104;
        oi.maaa[71] = 2114428764;
        oi.maaa[72] = -78973520;
        oi.maaa[73] = -1734662312;
        oi.maaa[74] = 229756836;
        oi.maaa[75] = 626115340;
        oi.maaa[76] = -2045054940;
        oi.maaa[77] = 828247589;
        oi.maaa[78] = 1664413843;
        oi.maaa[79] = 99894805;
        oi.maaa[80] = -344086583;
        oi.maaa[81] = -1635550170;
        oi.maaa[82] = -1304861166;
        oi.maaa[83] = -1516219966;
        oi.maaa[84] = -2121179041;
    }

    private static /* synthetic */ long lzzs(int n2) {
        return lzzt[n2] ^ lzzu[n2];
    }

    public oi() {
    }

    private static /* synthetic */ void mahj() {
        oi.lzzu[100] = -8323250331067906978L;
        oi.lzzu[101] = 5956475120013478413L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void save() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = oi.uw - oi.lzzv("mafk", lzzs(int ), (int)76)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == oi.lzzv("mafl", lzzz(int ), (int)65)) break;
            v0 /* !! */  = (long)oi.lzzv("mafm", lzzz(int ), (int)66);
        }
        var2 = oi.c;
        v1 /* !! */  = oi.uw;
        if (true) ** GOTO lbl11
        block19: while (true) {
            v1 /* !! */  = (long)(v2 - oi.lzzv("mafn", lzzs(int ), (int)77));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1268429928: {
                    break block19;
                }
                case -829877014: {
                    v2 = oi.lzzv("mafo", lzzs(int ), (int)78);
                    continue block19;
                }
                case 1719678369: {
                    v2 = oi.lzzv("mafp", lzzs(int ), (int)79);
                    continue block19;
                }
                case 2055080029: {
                    v2 = oi.lzzv("mafq", lzzs(int ), (int)80);
                    continue block19;
                }
            }
            break;
        }
        var1_1 = oi.b;
        v3 /* !! */  = oi.uw;
        if (true) ** GOTO lbl28
        block20: while (true) {
            v3 /* !! */  = (long)(v4 - oi.lzzv("mafr", lzzs(int ), (int)81));
lbl28:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1268429928: {
                    break block20;
                }
                case 105781556: {
                    v4 = oi.lzzv("mafs", lzzs(int ), (int)82);
                    continue block20;
                }
                case 248586317: {
                    v4 = oi.lzzv("maft", lzzs(int ), (int)83);
                    continue block20;
                }
                case 1628649760: {
                    v4 = oi.lzzv("mafu", lzzs(int ), (int)84);
                    continue block20;
                }
            }
            break;
        }
        var0_2 = oi.a;
        if (var2) {
            throw null;
lbl43:
            // 2 sources

            return;
        }
        if (var0_2 || var0_2) ** GOTO lbl43
        v5 /* !! */  = oi.uw;
        if (true) ** GOTO lbl50
        block22: while (true) {
            v5 /* !! */  = (long)(v6 - oi.lzzv("mafv", lzzs(int ), (int)85));
lbl50:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -1268429928: {
                    break block22;
                }
                case -955972567: {
                    v6 = oi.lzzv("mafw", lzzs(int ), (int)86);
                    continue block22;
                }
                case -595393226: {
                    v6 = oi.lzzv("mafx", lzzs(int ), (int)87);
                    continue block22;
                }
                case -313303507: {
                    v6 = oi.lzzv("mafy", lzzs(int ), (int)88);
                    continue block22;
                }
            }
            break;
        }
        v7 = an.getInstance();
        while (true) {
            if ((v8 /* !! */  = (cfr_temp_1 = oi.uw - oi.lzzv("mafz", lzzs(int ), (int)89)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v8 /* !! */  == oi.lzzv("maga", lzzz(int ), (int)67)) break;
            v8 /* !! */  = (long)oi.lzzv("magb", lzzz(int ), (int)68);
        }
        v7.save();
        ** while (var0_2 || var0_2)
lbl70:
        // 1 sources

    }

    private static /* synthetic */ void mahf() {
        oi.maab[0] = -2124405165;
        oi.maab[1] = -899803982;
        oi.maab[2] = -1043162677;
        oi.maab[3] = 1925366086;
        oi.maab[4] = 257027308;
        oi.maab[5] = -936647174;
        oi.maab[6] = -701340403;
        oi.maab[7] = 973593447;
        oi.maab[8] = 946851507;
        oi.maab[9] = -988113924;
        oi.maab[10] = 1262029069;
        oi.maab[11] = -1629239469;
        oi.maab[12] = -1493272681;
        oi.maab[13] = 374376283;
        oi.maab[14] = 1077837769;
        oi.maab[15] = -770479482;
        oi.maab[16] = 753781813;
        oi.maab[17] = 34546179;
        oi.maab[18] = -1682788031;
        oi.maab[19] = 1873864312;
        oi.maab[20] = -1247496845;
        oi.maab[21] = 798244140;
        oi.maab[22] = -2116177895;
        oi.maab[23] = 1562512830;
        oi.maab[24] = 168873739;
        oi.maab[25] = 1419483279;
        oi.maab[26] = -1550078116;
        oi.maab[27] = -1384691671;
        oi.maab[28] = 657050248;
        oi.maab[29] = -1984644815;
        oi.maab[30] = -1287361307;
        oi.maab[31] = -223961701;
        oi.maab[32] = -1826238058;
        oi.maab[33] = 938949258;
        oi.maab[34] = 253963345;
        oi.maab[35] = -1050375440;
        oi.maab[36] = 721317533;
        oi.maab[37] = -1524102673;
        oi.maab[38] = -1402191602;
        oi.maab[39] = -110069488;
        oi.maab[40] = -1332601193;
        oi.maab[41] = -638816240;
        oi.maab[42] = 2024784152;
        oi.maab[43] = -798912981;
        oi.maab[44] = 377739344;
        oi.maab[45] = -808250162;
        oi.maab[46] = -913560409;
        oi.maab[47] = 415337081;
        oi.maab[48] = -349768883;
        oi.maab[49] = -1856717327;
        oi.maab[50] = -873915800;
        oi.maab[51] = 1495988003;
        oi.maab[52] = -820084529;
        oi.maab[53] = -369507295;
        oi.maab[54] = -1074632024;
        oi.maab[55] = -1234496887;
        oi.maab[56] = 1778291593;
        oi.maab[57] = -820153401;
        oi.maab[58] = -645434286;
        oi.maab[59] = 1292550525;
        oi.maab[60] = -1238271725;
        oi.maab[61] = 794941078;
        oi.maab[62] = -1041686082;
        oi.maab[63] = -1690097060;
        oi.maab[64] = -12776167;
        oi.maab[65] = 1111558814;
        oi.maab[66] = 1320746002;
        oi.maab[67] = -1268499079;
        oi.maab[68] = 590889538;
        oi.maab[69] = 677856855;
        oi.maab[70] = -1375046104;
        oi.maab[71] = 2114428760;
        oi.maab[72] = -78973518;
        oi.maab[73] = -1734662309;
        oi.maab[74] = 229756832;
        oi.maab[75] = 626115341;
        oi.maab[76] = 4910141;
        oi.maab[77] = 828247588;
        oi.maab[78] = 1583494443;
        oi.maab[79] = 99894806;
        oi.maab[80] = -344086582;
        oi.maab[81] = -1635550174;
        oi.maab[82] = -1304861166;
        oi.maab[83] = -1516219965;
        oi.maab[84] = -2121179041;
    }
}

