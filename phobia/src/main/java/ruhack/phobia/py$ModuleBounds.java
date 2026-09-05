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
import ruhack.phobia.mj;

final class py$ModuleBounds
extends Record {
    private static int[] fgpf = new int[94];
    private final float height;
    private final mj category;
    private static int[] fgpg = new int[94];
    public static final boolean a;
    private final float x;
    private final float viewportHeight;
    public static final boolean c;
    private final float y;
    private static long[] fgpu;
    private final float viewportY;
    public static final int b;
    private final float width;
    private static long[] fgpt;
    static final long ly = -7019161433766959133L;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private py$ModuleBounds(mj var1_1, float var2_2, float var3_3, float var4_4, float var5_5, float var6_6, float var7_7) {
        var9_8 /* !! */  = py$ModuleBounds.b;
        super();
        if (var9_8 /* !! */  == 0) ** GOTO lbl-1000
        switch (var9_8 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.category = var1_1;
                this.x = var2_2;
                this.y = var3_3;
                this.width = var4_4;
                this.height = var5_5;
                this.viewportY = var6_6;
                this.viewportHeight = var7_7;
                return;
            }
lbl14:
            // 3 sources

            case 0: {
                while (true) {
                    var9_8 /* !! */  = (int)py$ModuleBounds.fgph("fgpi", fgox(int ), (int)0);
                }
            }
            case 1: {
                var9_8 /* !! */  = (int)py$ModuleBounds.fgph("fgpj", fgox(int ), (int)1);
            }
lbl20:
            // 3 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var9_8 /* !! */  = (int)py$ModuleBounds.fgph("fgpk", fgox(int ), (int)2);
                    ** GOTO lbl14
                    break;
                }
            }
            case 3: {
                var9_8 /* !! */  = (int)py$ModuleBounds.fgph("fgpl", fgox(int ), (int)3);
                ** GOTO lbl14
            }
            case 4: {
                var9_8 /* !! */  = (int)py$ModuleBounds.fgph("fgpn", fgox(int ), (int)4);
                ** GOTO lbl20
            }
            case 5: 
        }
        var9_8 /* !! */  = (int)py$ModuleBounds.fgph("fgpo", fgox(int ), (int)5);
        ** while (true)
    }

    private static /* synthetic */ long fgps(int n2) {
        return fgpt[n2] ^ fgpu[n2];
    }

    public static /* synthetic */ CallSite fgph(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final String toString() {
        v0 /* !! */  = py$ModuleBounds.ly;
        if (true) ** GOTO lbl5
        block20: while (true) {
            v0 /* !! */  = (long)(py$ModuleBounds.fgph("fgpx", fgps(int ), (int)1) - py$ModuleBounds.fgph("fgpw", fgps(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 152430705: {
                    continue block20;
                }
                case 1999824867: {
                    break block20;
                }
            }
            break;
        }
        var3_1 = py$ModuleBounds.c;
        v1 /* !! */  = py$ModuleBounds.ly;
        if (true) ** GOTO lbl15
        block21: while (true) {
            v1 /* !! */  = (long)(v2 - py$ModuleBounds.fgph("fgpz", fgps(int ), (int)2));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -2002827625: {
                    v2 = py$ModuleBounds.fgph("fgqb", fgps(int ), (int)3);
                    continue block21;
                }
                case -100494296: {
                    v2 = py$ModuleBounds.fgph("fgqc", fgps(int ), (int)4);
                    continue block21;
                }
                case 1999824867: {
                    break block21;
                }
            }
            break;
        }
        var2_2 /* !! */  = py$ModuleBounds.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_0 = py$ModuleBounds.ly - py$ModuleBounds.fgph("fgqe", fgps(int ), (int)5)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == py$ModuleBounds.fgph("fgqg", fgox(int ), (int)6)) break;
                    v3 /* !! */  = (long)py$ModuleBounds.fgph("fgqh", fgox(int ), (int)7);
                }
                var1_3 = py$ModuleBounds.a;
                if (var3_1) {
                    throw null;
                    return null;
                }
                if (var1_3 || var1_3) ** continue;
                v4 /* !! */  = py$ModuleBounds.ly;
                if (true) ** GOTO lbl44
                block24: while (true) {
                    v4 /* !! */  = (long)(v5 - py$ModuleBounds.fgph("fgqi", fgps(int ), (int)6));
lbl44:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -561313050: {
                            v5 = py$ModuleBounds.fgph("fgqk", fgps(int ), (int)7);
                            continue block24;
                        }
                        case 1736197247: {
                            v5 = py$ModuleBounds.fgph("fgqm", fgps(int ), (int)8);
                            continue block24;
                        }
                        case 1999824867: {
                            break block24;
                        }
                    }
                    break;
                }
                return ObjectMethods.bootstrap("toString", new MethodHandle[]{py$ModuleBounds.class, "category;x;y;width;height;viewportY;viewportHeight", "category", "x", "y", "width", "height", "viewportY", "viewportHeight"}, this);
            }
lbl54:
            // 3 sources

            case 0: {
                var2_2 /* !! */  = (int)py$ModuleBounds.fgph("fgqo", fgox(int ), (int)8);
                if (var3_1) {
                    throw null;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)py$ModuleBounds.fgph("fgqq", fgox(int ), (int)9);
                if (!var3_1) ** GOTO lbl54
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)py$ModuleBounds.fgph("fgqs", fgox(int ), (int)10);
                if (!var3_1) ** GOTO lbl54
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)py$ModuleBounds.fgph("fgqv", fgox(int ), (int)11);
        } while (!var3_1);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final boolean equals(Object var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = py$ModuleBounds.ly - py$ModuleBounds.fgph("fgsb", fgps(int ), (int)16)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == py$ModuleBounds.fgph("fgsd", fgox(int ), (int)21)) break;
            v0 /* !! */  = (long)py$ModuleBounds.fgph("fgse", fgox(int ), (int)22);
        }
        var4_2 = py$ModuleBounds.c;
        v1 /* !! */  = py$ModuleBounds.ly;
        if (true) ** GOTO lbl12
        block11: while (true) {
            v1 /* !! */  = (long)(py$ModuleBounds.fgph("fgsj", fgps(int ), (int)18) - py$ModuleBounds.fgph("fgsi", fgps(int ), (int)17));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 614680349: {
                    continue block11;
                }
                case 1999824867: {
                    break block11;
                }
            }
            break;
        }
        var3_3 /* !! */  = py$ModuleBounds.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = py$ModuleBounds.ly - py$ModuleBounds.fgph("fgsk", fgps(int ), (int)19)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == py$ModuleBounds.fgph("fgsl", fgox(int ), (int)23)) break;
            v2 /* !! */  = (long)py$ModuleBounds.fgph("fgsn", fgox(int ), (int)24);
        }
        var2_4 = py$ModuleBounds.a;
        if (var4_2) {
            throw null;
            return (boolean)py$ModuleBounds.fgph("fgsq", fgox(int ), (int)25);
        }
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        block4 : switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4 || var2_4) ** continue;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = py$ModuleBounds.ly - py$ModuleBounds.fgph("fgsu", fgps(int ), (int)20)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == py$ModuleBounds.fgph("fgsv", fgox(int ), (int)26)) break;
                    v3 /* !! */  = (long)py$ModuleBounds.fgph("fgsw", fgox(int ), (int)27);
                }
                return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{py$ModuleBounds.class, "category;x;y;width;height;viewportY;viewportHeight", "category", "x", "y", "width", "height", "viewportY", "viewportHeight"}, this, var1_1);
            }
lbl40:
            // 3 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)py$ModuleBounds.fgph("fgsx", fgox(int ), (int)28);
                    if (!var4_2) break block4;
                    throw null;
                }
            }
            case 1: {
                var3_3 /* !! */  = (int)py$ModuleBounds.fgph("fgsy", fgox(int ), (int)29);
                if (!var4_2) ** GOTO lbl40
                throw null;
            }
            case 2: {
                var3_3 /* !! */  = (int)py$ModuleBounds.fgph("fgta", fgox(int ), (int)30);
                if (!var4_2) ** GOTO lbl40
                throw null;
            }
            case 3: 
        }
        var3_3 /* !! */  = (int)py$ModuleBounds.fgph("fgtc", fgox(int ), (int)31);
        ** while (!var4_2)
lbl56:
        // 1 sources

        throw null;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public float viewportY() {
        boolean bl2;
        Object object = ly;
        block9: while (true) {
            switch ((int)object) {
                case -302580062: {
                    object = py$ModuleBounds.fgph("fgxx", fgps(int ), (int)65) - py$ModuleBounds.fgph("fgxw", fgps(int ), (int)64);
                    continue block9;
                }
                case 1999824867: {
                    break block9;
                }
            }
            break;
        }
        boolean bl3 = c;
        Object object2 = ly;
        boolean bl4 = true;
        block10: while (true) {
            CallSite callSite;
            if (!bl4 || (bl4 = false) || !true) {
                object2 = callSite - py$ModuleBounds.fgph("fgxy", fgps(int ), (int)66);
            }
            switch ((int)object2) {
                case -2050230137: {
                    callSite = py$ModuleBounds.fgph("fgxz", fgps(int ), (int)67);
                    continue block10;
                }
                case 1698453568: {
                    callSite = py$ModuleBounds.fgph("fgya", fgps(int ), (int)68);
                    continue block10;
                }
                case 1999824867: {
                    break block10;
                }
            }
            break;
        }
        int n2 = b;
        while (true) {
            long l2;
            Object object3;
            if ((object3 = (l2 = ly - py$ModuleBounds.fgph("fgyb", fgps(int ), (int)69)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (object3 == py$ModuleBounds.fgph("fgyc", fgox(int ), (int)76)) {
                bl2 = a;
                if (bl3) {
                    throw null;
                }
                break;
            }
            object3 = py$ModuleBounds.fgph("fgyd", fgox(int ), (int)77);
        }
        if (bl2) return (float)py$ModuleBounds.fgph("fgye", fguz(int ), (int)78);
        if (bl2) return (float)py$ModuleBounds.fgph("fgye", fguz(int ), (int)78);
        while (true) {
            long l3;
            Object object4;
            if ((object4 = (l3 = ly - py$ModuleBounds.fgph("fgyf", fgps(int ), (int)70)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (object4 == py$ModuleBounds.fgph("fgyi", fgox(int ), (int)79)) {
                return this.viewportY;
            }
            object4 = py$ModuleBounds.fgph("fgyj", fgox(int ), (int)80);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public float x() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = py$ModuleBounds.ly - py$ModuleBounds.fgph("fgum", fgps(int ), (int)28)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == py$ModuleBounds.fgph("fgun", fgox(int ), (int)42)) break;
            v0 /* !! */  = (long)py$ModuleBounds.fgph("fguo", fgox(int ), (int)43);
        }
        var3_1 = py$ModuleBounds.c;
        v1 /* !! */  = py$ModuleBounds.ly;
        if (true) ** GOTO lbl12
        block11: while (true) {
            v1 /* !! */  = (long)(py$ModuleBounds.fgph("fgur", fgps(int ), (int)30) - py$ModuleBounds.fgph("fguq", fgps(int ), (int)29));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -2080924219: {
                    continue block11;
                }
                case 1999824867: {
                    break block11;
                }
            }
            break;
        }
        var2_2 /* !! */  = py$ModuleBounds.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = py$ModuleBounds.ly - py$ModuleBounds.fgph("fgut", fgps(int ), (int)31)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == py$ModuleBounds.fgph("fguu", fgox(int ), (int)44)) break;
            v2 /* !! */  = (long)py$ModuleBounds.fgph("fguv", fgox(int ), (int)45);
        }
        var1_3 = py$ModuleBounds.a;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_1) {
                    throw null;
                    return (float)py$ModuleBounds.fgph("fgva", fguz(int ), (int)46);
                }
                if (var1_3 || var1_3) ** continue;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = py$ModuleBounds.ly - py$ModuleBounds.fgph("fgvb", fgps(int ), (int)32)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == py$ModuleBounds.fgph("fgvc", fgox(int ), (int)47)) break;
                    v3 /* !! */  = (long)py$ModuleBounds.fgph("fgvh", fgox(int ), (int)48);
                }
                return this.x;
            }
            case 0: {
                var2_2 /* !! */  = (int)py$ModuleBounds.fgph("fgvj", fgox(int ), (int)49);
                if (!var3_1) break;
                throw null;
            }
lbl44:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)py$ModuleBounds.fgph("fgvk", fgox(int ), (int)50);
                if (!var3_1) break;
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)py$ModuleBounds.fgph("fgvm", fgox(int ), (int)51);
                if (!var3_1) ** GOTO lbl44
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)py$ModuleBounds.fgph("fgvn", fgox(int ), (int)52);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ float fguz(int n2) {
        return Float.intBitsToFloat(fgpf[n2] ^ fgpg[n2]);
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public mj category() {
        boolean bl2;
        while (true) {
            long l2;
            Object object;
            if ((object = (l2 = ly - py$ModuleBounds.fgph("fgth", fgps(int ), (int)21)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object == py$ModuleBounds.fgph("fgti", fgox(int ), (int)32)) break;
            object = py$ModuleBounds.fgph("fgtj", fgox(int ), (int)33);
        }
        boolean bl3 = c;
        while (true) {
            long l3;
            Object object;
            if ((object = (l3 = ly - py$ModuleBounds.fgph("fgtl", fgps(int ), (int)22)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object == py$ModuleBounds.fgph("fgtn", fgox(int ), (int)34)) break;
            object = py$ModuleBounds.fgph("fgto", fgox(int ), (int)35);
        }
        int n2 = b;
        while (true) {
            long l4;
            Object object;
            if ((object = (l4 = ly - py$ModuleBounds.fgph("fgtv", fgps(int ), (int)23)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            if (object == py$ModuleBounds.fgph("fgtw", fgox(int ), (int)36)) {
                bl2 = a;
                if (bl3) {
                    throw null;
                }
                break;
            }
            object = py$ModuleBounds.fgph("fgtx", fgox(int ), (int)37);
        }
        if (bl2) return null;
        if (bl2) return null;
        Object object = ly;
        boolean bl4 = true;
        block9: while (true) {
            CallSite callSite;
            if (!bl4 || (bl4 = false) || !true) {
                object = callSite - py$ModuleBounds.fgph("fgty", fgps(int ), (int)24);
            }
            switch ((int)object) {
                case -317678023: {
                    callSite = py$ModuleBounds.fgph("fgua", fgps(int ), (int)25);
                    continue block9;
                }
                case -163908388: {
                    callSite = py$ModuleBounds.fgph("fgub", fgps(int ), (int)26);
                    continue block9;
                }
                case 1426306208: {
                    callSite = py$ModuleBounds.fgph("fgug", fgps(int ), (int)27);
                    continue block9;
                }
                case 1999824867: {
                    return this.category;
                }
            }
            break;
        }
        return this.category;
    }

    private static /* synthetic */ void fgzy() {
        py$ModuleBounds.fgpf[0] = -413992219;
        py$ModuleBounds.fgpf[1] = -388673873;
        py$ModuleBounds.fgpf[2] = -1503273049;
        py$ModuleBounds.fgpf[3] = -1412565417;
        py$ModuleBounds.fgpf[4] = 619216724;
        py$ModuleBounds.fgpf[5] = 588325008;
        py$ModuleBounds.fgpf[6] = 1643535344;
        py$ModuleBounds.fgpf[7] = 1060996761;
        py$ModuleBounds.fgpf[8] = -1728533621;
        py$ModuleBounds.fgpf[9] = 1822110192;
        py$ModuleBounds.fgpf[10] = -1079750384;
        py$ModuleBounds.fgpf[11] = 1163762101;
        py$ModuleBounds.fgpf[12] = -2006424212;
        py$ModuleBounds.fgpf[13] = 1522873659;
        py$ModuleBounds.fgpf[14] = -1781399875;
        py$ModuleBounds.fgpf[15] = -2093092620;
        py$ModuleBounds.fgpf[16] = -2109890580;
        py$ModuleBounds.fgpf[17] = 647427347;
        py$ModuleBounds.fgpf[18] = -2097457898;
        py$ModuleBounds.fgpf[19] = 2060361776;
        py$ModuleBounds.fgpf[20] = 2112258761;
        py$ModuleBounds.fgpf[21] = 1825280519;
        py$ModuleBounds.fgpf[22] = -362828625;
        py$ModuleBounds.fgpf[23] = -346210472;
        py$ModuleBounds.fgpf[24] = 1133156581;
        py$ModuleBounds.fgpf[25] = -957487700;
        py$ModuleBounds.fgpf[26] = -925526678;
        py$ModuleBounds.fgpf[27] = -1530232497;
        py$ModuleBounds.fgpf[28] = 1084377640;
        py$ModuleBounds.fgpf[29] = -135273073;
        py$ModuleBounds.fgpf[30] = -722136962;
        py$ModuleBounds.fgpf[31] = 1382268920;
        py$ModuleBounds.fgpf[32] = -1291966025;
        py$ModuleBounds.fgpf[33] = -1987482826;
        py$ModuleBounds.fgpf[34] = -1806635059;
        py$ModuleBounds.fgpf[35] = -191640085;
        py$ModuleBounds.fgpf[36] = -243917989;
        py$ModuleBounds.fgpf[37] = 818426822;
        py$ModuleBounds.fgpf[38] = -935166053;
        py$ModuleBounds.fgpf[39] = -794650621;
        py$ModuleBounds.fgpf[40] = -969126998;
        py$ModuleBounds.fgpf[41] = -491119309;
        py$ModuleBounds.fgpf[42] = 1885596109;
        py$ModuleBounds.fgpf[43] = 1580198720;
        py$ModuleBounds.fgpf[44] = -537813445;
        py$ModuleBounds.fgpf[45] = -1407909957;
        py$ModuleBounds.fgpf[46] = 850260526;
        py$ModuleBounds.fgpf[47] = -731973423;
        py$ModuleBounds.fgpf[48] = 487022623;
        py$ModuleBounds.fgpf[49] = -236356196;
        py$ModuleBounds.fgpf[50] = 430960060;
        py$ModuleBounds.fgpf[51] = -1389315751;
        py$ModuleBounds.fgpf[52] = 298944624;
        py$ModuleBounds.fgpf[53] = -1174754431;
        py$ModuleBounds.fgpf[54] = 1881326292;
        py$ModuleBounds.fgpf[55] = -857652128;
        py$ModuleBounds.fgpf[56] = -975336779;
        py$ModuleBounds.fgpf[57] = -519396038;
        py$ModuleBounds.fgpf[58] = 815230866;
        py$ModuleBounds.fgpf[59] = -1603944377;
        py$ModuleBounds.fgpf[60] = -1339407889;
        py$ModuleBounds.fgpf[61] = -642876640;
        py$ModuleBounds.fgpf[62] = 1768475075;
        py$ModuleBounds.fgpf[63] = 2087368722;
        py$ModuleBounds.fgpf[64] = 1988515978;
        py$ModuleBounds.fgpf[65] = 1323847080;
        py$ModuleBounds.fgpf[66] = 77098311;
        py$ModuleBounds.fgpf[67] = -703791403;
        py$ModuleBounds.fgpf[68] = 844778791;
        py$ModuleBounds.fgpf[69] = -84136759;
        py$ModuleBounds.fgpf[70] = 944166758;
        py$ModuleBounds.fgpf[71] = 708556263;
        py$ModuleBounds.fgpf[72] = 2122580603;
        py$ModuleBounds.fgpf[73] = 2078797443;
        py$ModuleBounds.fgpf[74] = -1295584761;
        py$ModuleBounds.fgpf[75] = 486724995;
        py$ModuleBounds.fgpf[76] = 1778680722;
        py$ModuleBounds.fgpf[77] = 235806206;
        py$ModuleBounds.fgpf[78] = 1046106958;
        py$ModuleBounds.fgpf[79] = 1901039891;
        py$ModuleBounds.fgpf[80] = -781631150;
        py$ModuleBounds.fgpf[81] = -1383728107;
        py$ModuleBounds.fgpf[82] = -935365579;
        py$ModuleBounds.fgpf[83] = -309323616;
        py$ModuleBounds.fgpf[84] = -1932643136;
        py$ModuleBounds.fgpf[85] = -2138042023;
        py$ModuleBounds.fgpf[86] = -960713201;
        py$ModuleBounds.fgpf[87] = -1327072268;
        py$ModuleBounds.fgpf[88] = -655875920;
        py$ModuleBounds.fgpf[89] = 1937762415;
        py$ModuleBounds.fgpf[90] = -1776010738;
        py$ModuleBounds.fgpf[91] = 142038733;
        py$ModuleBounds.fgpf[92] = 873015993;
        py$ModuleBounds.fgpf[93] = -1229825511;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final int hashCode() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = py$ModuleBounds.ly - py$ModuleBounds.fgph("fgqy", fgps(int ), (int)9)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == py$ModuleBounds.fgph("fgqz", fgox(int ), (int)12)) break;
            v0 /* !! */  = (long)py$ModuleBounds.fgph("fgrb", fgox(int ), (int)13);
        }
        var3_1 = py$ModuleBounds.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = py$ModuleBounds.ly - py$ModuleBounds.fgph("fgrd", fgps(int ), (int)10)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == py$ModuleBounds.fgph("fgrf", fgox(int ), (int)14)) break;
            v1 /* !! */  = (long)py$ModuleBounds.fgph("fgrg", fgox(int ), (int)15);
        }
        var2_2 /* !! */  = py$ModuleBounds.b;
        v2 /* !! */  = py$ModuleBounds.ly;
        if (true) ** GOTO lbl19
        block17: while (true) {
            v2 /* !! */  = (long)(v3 - py$ModuleBounds.fgph("fgrh", fgps(int ), (int)11));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -397907981: {
                    v3 = py$ModuleBounds.fgph("fgri", fgps(int ), (int)12);
                    continue block17;
                }
                case 1383690661: {
                    v3 = py$ModuleBounds.fgph("fgrj", fgps(int ), (int)13);
                    continue block17;
                }
                case 1999824867: {
                    break block17;
                }
            }
            break;
        }
        var1_3 = py$ModuleBounds.a;
        if (var3_1) {
            throw null;
lbl31:
            // 2 sources

            return (int)py$ModuleBounds.fgph("fgrk", fgox(int ), (int)16);
        }
        if (var1_3) ** GOTO lbl31
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block5 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                v4 /* !! */  = py$ModuleBounds.ly;
                if (true) ** GOTO lbl42
                block19: while (true) {
                    v4 /* !! */  = (long)(py$ModuleBounds.fgph("fgrm", fgps(int ), (int)15) - py$ModuleBounds.fgph("fgrl", fgps(int ), (int)14));
lbl42:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case 1161825444: {
                            continue block19;
                        }
                        case 1999824867: {
                            break block19;
                        }
                    }
                    break;
                }
                return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{py$ModuleBounds.class, "category;x;y;width;height;viewportY;viewportHeight", "category", "x", "y", "width", "height", "viewportY", "viewportHeight"}, this);
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)py$ModuleBounds.fgph("fgrn", fgox(int ), (int)17);
                    if (!var3_1) break block5;
                    throw null;
                }
            }
lbl53:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)py$ModuleBounds.fgph("fgrx", fgox(int ), (int)18);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)py$ModuleBounds.fgph("fgry", fgox(int ), (int)19);
                if (!var3_1) ** GOTO lbl53
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)py$ModuleBounds.fgph("fgrz", fgox(int ), (int)20);
        ** while (!var3_1)
lbl64:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void fhbg() {
        py$ModuleBounds.fgpt[0] = 68080726647967447L;
        py$ModuleBounds.fgpt[1] = 1481065326854818432L;
        py$ModuleBounds.fgpt[2] = 3109672044058174412L;
        py$ModuleBounds.fgpt[3] = 7348413956052794873L;
        py$ModuleBounds.fgpt[4] = 5362865043027343743L;
        py$ModuleBounds.fgpt[5] = 672582750763011298L;
        py$ModuleBounds.fgpt[6] = -5904012043221040595L;
        py$ModuleBounds.fgpt[7] = 4493227764674033133L;
        py$ModuleBounds.fgpt[8] = -8358942860981213972L;
        py$ModuleBounds.fgpt[9] = 1260844464821879896L;
        py$ModuleBounds.fgpt[10] = 8693741261705037449L;
        py$ModuleBounds.fgpt[11] = 263569809728425760L;
        py$ModuleBounds.fgpt[12] = -2174643248626483642L;
        py$ModuleBounds.fgpt[13] = -3762464719030784702L;
        py$ModuleBounds.fgpt[14] = 3346303921167887928L;
        py$ModuleBounds.fgpt[15] = -5902493185616421124L;
        py$ModuleBounds.fgpt[16] = 8557246729000864827L;
        py$ModuleBounds.fgpt[17] = -277668432043908423L;
        py$ModuleBounds.fgpt[18] = -4541094469488392913L;
        py$ModuleBounds.fgpt[19] = -1872378542500662256L;
        py$ModuleBounds.fgpt[20] = -603614411065385876L;
        py$ModuleBounds.fgpt[21] = -7575953980703513095L;
        py$ModuleBounds.fgpt[22] = -3086543564412294957L;
        py$ModuleBounds.fgpt[23] = 5001141121575218697L;
        py$ModuleBounds.fgpt[24] = 589655179816778620L;
        py$ModuleBounds.fgpt[25] = -7454100010015441451L;
        py$ModuleBounds.fgpt[26] = 4860360876309671051L;
        py$ModuleBounds.fgpt[27] = -7355219662527041981L;
        py$ModuleBounds.fgpt[28] = -2635610017062832492L;
        py$ModuleBounds.fgpt[29] = 8170172433119086668L;
        py$ModuleBounds.fgpt[30] = -4786937423351806881L;
        py$ModuleBounds.fgpt[31] = -8085329444849349347L;
        py$ModuleBounds.fgpt[32] = -7521577963946005214L;
        py$ModuleBounds.fgpt[33] = -5127679134668449517L;
        py$ModuleBounds.fgpt[34] = -1036667014076600735L;
        py$ModuleBounds.fgpt[35] = -7549010478979075918L;
        py$ModuleBounds.fgpt[36] = -689128841866044823L;
        py$ModuleBounds.fgpt[37] = 7430164358988020651L;
        py$ModuleBounds.fgpt[38] = 3136826214530583776L;
        py$ModuleBounds.fgpt[39] = 8932707116024812514L;
        py$ModuleBounds.fgpt[40] = 1465757913105842777L;
        py$ModuleBounds.fgpt[41] = -1935350920294142783L;
        py$ModuleBounds.fgpt[42] = 2905124666750827536L;
        py$ModuleBounds.fgpt[43] = -807276145317665302L;
        py$ModuleBounds.fgpt[44] = 7979649360745629906L;
        py$ModuleBounds.fgpt[45] = 1938409018512327103L;
        py$ModuleBounds.fgpt[46] = -5946067747652404734L;
        py$ModuleBounds.fgpt[47] = -1774798983376632558L;
        py$ModuleBounds.fgpt[48] = -1414630596416246211L;
        py$ModuleBounds.fgpt[49] = 352262149565867174L;
        py$ModuleBounds.fgpt[50] = 9140893437917695104L;
        py$ModuleBounds.fgpt[51] = 3066884650906435936L;
        py$ModuleBounds.fgpt[52] = -1816338813159028804L;
        py$ModuleBounds.fgpt[53] = -2198313898818274335L;
        py$ModuleBounds.fgpt[54] = -6946737799447900236L;
        py$ModuleBounds.fgpt[55] = -4941193526430232422L;
        py$ModuleBounds.fgpt[56] = 7489773902901491772L;
        py$ModuleBounds.fgpt[57] = 1608885952373927897L;
        py$ModuleBounds.fgpt[58] = 1667909468404687403L;
        py$ModuleBounds.fgpt[59] = 1811576393543894020L;
        py$ModuleBounds.fgpt[60] = 5058887370714311643L;
        py$ModuleBounds.fgpt[61] = -5961452134267986644L;
        py$ModuleBounds.fgpt[62] = -7465939593596414064L;
        py$ModuleBounds.fgpt[63] = 8547539510204437869L;
        py$ModuleBounds.fgpt[64] = 7078997215684899365L;
        py$ModuleBounds.fgpt[65] = 651048113659990584L;
        py$ModuleBounds.fgpt[66] = 9029433397518526890L;
        py$ModuleBounds.fgpt[67] = -5513141776716040661L;
        py$ModuleBounds.fgpt[68] = 8883185663048916246L;
        py$ModuleBounds.fgpt[69] = 7178751212571772595L;
        py$ModuleBounds.fgpt[70] = 2290889807975654449L;
        py$ModuleBounds.fgpt[71] = 4900967943002186148L;
        py$ModuleBounds.fgpt[72] = -8848869664749641033L;
        py$ModuleBounds.fgpt[73] = 2409090552111213806L;
        py$ModuleBounds.fgpt[74] = -4269693811484898194L;
        py$ModuleBounds.fgpt[75] = 3919410095086383468L;
        py$ModuleBounds.fgpt[76] = 8384520213509758323L;
        py$ModuleBounds.fgpt[77] = -8186997475561410552L;
    }

    private static /* synthetic */ void fhbu() {
        py$ModuleBounds.fgpu[0] = -5354823630662232335L;
        py$ModuleBounds.fgpu[1] = -2931147952999311193L;
        py$ModuleBounds.fgpu[2] = 5448810089951808302L;
        py$ModuleBounds.fgpu[3] = -570308076865237748L;
        py$ModuleBounds.fgpu[4] = -1412048302260004796L;
        py$ModuleBounds.fgpu[5] = -3598950274787803557L;
        py$ModuleBounds.fgpu[6] = -4135743431532325959L;
        py$ModuleBounds.fgpu[7] = 8401790314496646443L;
        py$ModuleBounds.fgpu[8] = -3295068702841990377L;
        py$ModuleBounds.fgpu[9] = -7634603234818659457L;
        py$ModuleBounds.fgpu[10] = -8504142752914792535L;
        py$ModuleBounds.fgpu[11] = -341509187726040648L;
        py$ModuleBounds.fgpu[12] = -6039987465658444487L;
        py$ModuleBounds.fgpu[13] = 6596810252551274313L;
        py$ModuleBounds.fgpu[14] = -2436438873978701639L;
        py$ModuleBounds.fgpu[15] = -4790308878262073989L;
        py$ModuleBounds.fgpu[16] = -7634253229985567532L;
        py$ModuleBounds.fgpu[17] = 2917138311981575888L;
        py$ModuleBounds.fgpu[18] = 2679520451497898382L;
        py$ModuleBounds.fgpu[19] = -6857155379083016400L;
        py$ModuleBounds.fgpu[20] = 6806523273203694416L;
        py$ModuleBounds.fgpu[21] = -3440063052867189317L;
        py$ModuleBounds.fgpu[22] = 5584720106212232662L;
        py$ModuleBounds.fgpu[23] = -573939580766907690L;
        py$ModuleBounds.fgpu[24] = 4964299394514933334L;
        py$ModuleBounds.fgpu[25] = -8467749159518926100L;
        py$ModuleBounds.fgpu[26] = -7467761744000055689L;
        py$ModuleBounds.fgpu[27] = 2971720147667849940L;
        py$ModuleBounds.fgpu[28] = 3297676378302602964L;
        py$ModuleBounds.fgpu[29] = -5373099660965164938L;
        py$ModuleBounds.fgpu[30] = -5987301355069357515L;
        py$ModuleBounds.fgpu[31] = 4565359505493925131L;
        py$ModuleBounds.fgpu[32] = -5254035628488746203L;
        py$ModuleBounds.fgpu[33] = 84317483484594228L;
        py$ModuleBounds.fgpu[34] = -3243443179659483257L;
        py$ModuleBounds.fgpu[35] = 8418495339997256063L;
        py$ModuleBounds.fgpu[36] = 808485688247716401L;
        py$ModuleBounds.fgpu[37] = -8169843524412304339L;
        py$ModuleBounds.fgpu[38] = -4384276482383644441L;
        py$ModuleBounds.fgpu[39] = 3589373015148786433L;
        py$ModuleBounds.fgpu[40] = -3750706871385414441L;
        py$ModuleBounds.fgpu[41] = -1574509633288509502L;
        py$ModuleBounds.fgpu[42] = -5072258176710030327L;
        py$ModuleBounds.fgpu[43] = 3071480211286342068L;
        py$ModuleBounds.fgpu[44] = 7936742556059152871L;
        py$ModuleBounds.fgpu[45] = 1107806969395633458L;
        py$ModuleBounds.fgpu[46] = -1621423105964518010L;
        py$ModuleBounds.fgpu[47] = -6233288907934485210L;
        py$ModuleBounds.fgpu[48] = 5198292106582832501L;
        py$ModuleBounds.fgpu[49] = -3243202142500765265L;
        py$ModuleBounds.fgpu[50] = -5415173244221323374L;
        py$ModuleBounds.fgpu[51] = -8610737456983588735L;
        py$ModuleBounds.fgpu[52] = -4209393563372996693L;
        py$ModuleBounds.fgpu[53] = 8270023095946741042L;
        py$ModuleBounds.fgpu[54] = 9147000407832922309L;
        py$ModuleBounds.fgpu[55] = 2495319297469205887L;
        py$ModuleBounds.fgpu[56] = 4188477839508533904L;
        py$ModuleBounds.fgpu[57] = 586768234952485314L;
        py$ModuleBounds.fgpu[58] = -7529656894494424534L;
        py$ModuleBounds.fgpu[59] = -3332174622021772435L;
        py$ModuleBounds.fgpu[60] = 3465587770902846097L;
        py$ModuleBounds.fgpu[61] = -3468253730264087029L;
        py$ModuleBounds.fgpu[62] = -4168679790936781192L;
        py$ModuleBounds.fgpu[63] = -4417431412731689978L;
        py$ModuleBounds.fgpu[64] = 1403759801638496216L;
        py$ModuleBounds.fgpu[65] = -1915127718805235754L;
        py$ModuleBounds.fgpu[66] = -2657951219237088189L;
        py$ModuleBounds.fgpu[67] = 5831003206371423742L;
        py$ModuleBounds.fgpu[68] = -1898388712477041964L;
        py$ModuleBounds.fgpu[69] = -5033360871217635297L;
        py$ModuleBounds.fgpu[70] = -2402437991845476505L;
        py$ModuleBounds.fgpu[71] = 1064984909390131619L;
        py$ModuleBounds.fgpu[72] = 8848007109324903272L;
        py$ModuleBounds.fgpu[73] = -2802721745896533513L;
        py$ModuleBounds.fgpu[74] = 8704808946901971763L;
        py$ModuleBounds.fgpu[75] = -3218579510779467266L;
        py$ModuleBounds.fgpu[76] = 5827577282879495318L;
        py$ModuleBounds.fgpu[77] = 4505491493150582056L;
    }

    private static /* synthetic */ int fgox(int n2) {
        return fgpf[n2] ^ fgpg[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public float width() {
        v0 /* !! */  = py$ModuleBounds.ly;
        if (true) ** GOTO lbl5
        block29: while (true) {
            v0 /* !! */  = (long)(v1 - py$ModuleBounds.fgph("fgwk", fgps(int ), (int)42));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 213385783: {
                    v1 = py$ModuleBounds.fgph("fgwl", fgps(int ), (int)43);
                    continue block29;
                }
                case 1999824867: {
                    break block29;
                }
                case 2041572262: {
                    v1 = py$ModuleBounds.fgph("fgwm", fgps(int ), (int)44);
                    continue block29;
                }
                case 2095503490: {
                    v1 = py$ModuleBounds.fgph("fgwn", fgps(int ), (int)45);
                    continue block29;
                }
            }
            break;
        }
        var3_1 = py$ModuleBounds.c;
        v2 /* !! */  = py$ModuleBounds.ly;
        if (true) ** GOTO lbl22
        block30: while (true) {
            v2 /* !! */  = (long)(v3 - py$ModuleBounds.fgph("fgwo", fgps(int ), (int)46));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1958980049: {
                    v3 = py$ModuleBounds.fgph("fgwp", fgps(int ), (int)47);
                    continue block30;
                }
                case -703156259: {
                    v3 = py$ModuleBounds.fgph("fgwq", fgps(int ), (int)48);
                    continue block30;
                }
                case 583611349: {
                    v3 = py$ModuleBounds.fgph("fgwr", fgps(int ), (int)49);
                    continue block30;
                }
                case 1999824867: {
                    break block30;
                }
            }
            break;
        }
        var2_2 /* !! */  = py$ModuleBounds.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v4 /* !! */  = py$ModuleBounds.ly;
                if (true) ** GOTO lbl42
                block31: while (true) {
                    v4 /* !! */  = (long)(v5 - py$ModuleBounds.fgph("fgws", fgps(int ), (int)50));
lbl42:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -115087296: {
                            v5 = py$ModuleBounds.fgph("fgwt", fgps(int ), (int)51);
                            continue block31;
                        }
                        case 1707053420: {
                            v5 = py$ModuleBounds.fgph("fgwu", fgps(int ), (int)52);
                            continue block31;
                        }
                        case 1999824867: {
                            break block31;
                        }
                    }
                    break;
                }
                var1_3 = py$ModuleBounds.a;
                if (var3_1) {
                    throw null;
                    return (float)py$ModuleBounds.fgph("fgwv", fguz(int ), (int)62);
                }
                if (var1_3 || var1_3) ** continue;
                v6 /* !! */  = py$ModuleBounds.ly;
                if (true) ** GOTO lbl61
                block33: while (true) {
                    v6 /* !! */  = (long)(v7 - py$ModuleBounds.fgph("fgww", fgps(int ), (int)53));
lbl61:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -977943982: {
                            v7 = py$ModuleBounds.fgph("fgwx", fgps(int ), (int)54);
                            continue block33;
                        }
                        case -190019138: {
                            v7 = py$ModuleBounds.fgph("fgwy", fgps(int ), (int)55);
                            continue block33;
                        }
                        case -185160741: {
                            v7 = py$ModuleBounds.fgph("fgwz", fgps(int ), (int)56);
                            continue block33;
                        }
                        case 1999824867: {
                            break block33;
                        }
                    }
                    break;
                }
                return this.width;
            }
lbl74:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)py$ModuleBounds.fgph("fgxa", fgox(int ), (int)63);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl85
                    break;
                }
            }
            case 1: {
                do {
                    var2_2 /* !! */  = (int)py$ModuleBounds.fgph("fgxb", fgox(int ), (int)64);
                } while (!var3_1);
                throw null;
            }
lbl85:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)py$ModuleBounds.fgph("fgxc", fgox(int ), (int)65);
                if (!var3_1) ** GOTO lbl74
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)py$ModuleBounds.fgph("fgxd", fgox(int ), (int)66);
        ** while (!var3_1)
lbl92:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public float viewportHeight() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = py$ModuleBounds.ly - py$ModuleBounds.fgph("fgys", fgps(int ), (int)71)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == py$ModuleBounds.fgph("fgyt", fgox(int ), (int)85)) break;
            v0 /* !! */  = (long)py$ModuleBounds.fgph("fgyu", fgox(int ), (int)86);
        }
        var3_1 = py$ModuleBounds.c;
        v1 /* !! */  = py$ModuleBounds.ly;
        if (true) ** GOTO lbl12
        block16: while (true) {
            v1 /* !! */  = (long)(py$ModuleBounds.fgph("fgyx", fgps(int ), (int)73) - py$ModuleBounds.fgph("fgyv", fgps(int ), (int)72));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 1674710814: {
                    continue block16;
                }
                case 1999824867: {
                    break block16;
                }
            }
            break;
        }
        var2_2 /* !! */  = py$ModuleBounds.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = py$ModuleBounds.ly - py$ModuleBounds.fgph("fgyz", fgps(int ), (int)74)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == py$ModuleBounds.fgph("fgzb", fgox(int ), (int)87)) break;
            v2 /* !! */  = (long)py$ModuleBounds.fgph("fgzh", fgox(int ), (int)88);
        }
        var1_3 = py$ModuleBounds.a;
        if (var3_1) {
            throw null;
            return (float)py$ModuleBounds.fgph("fgzi", fguz(int ), (int)89);
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block4 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** continue;
                v3 /* !! */  = py$ModuleBounds.ly;
                if (true) ** GOTO lbl37
                block19: while (true) {
                    v3 /* !! */  = (long)(v4 - py$ModuleBounds.fgph("fgzj", fgps(int ), (int)75));
lbl37:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1107182164: {
                            v4 = py$ModuleBounds.fgph("fgzk", fgps(int ), (int)76);
                            continue block19;
                        }
                        case -1067526587: {
                            v4 = py$ModuleBounds.fgph("fgzl", fgps(int ), (int)77);
                            continue block19;
                        }
                        case 1999824867: {
                            break block19;
                        }
                    }
                    break;
                }
                return this.viewportHeight;
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)py$ModuleBounds.fgph("fgzm", fgox(int ), (int)90);
                    if (!var3_1) break block4;
                    throw null;
                }
            }
            case 1: {
                do {
                    var2_2 /* !! */  = (int)py$ModuleBounds.fgph("fgzp", fgox(int ), (int)91);
                } while (!var3_1);
                throw null;
            }
            case 2: {
                do {
                    var2_2 /* !! */  = (int)py$ModuleBounds.fgph("fgzt", fgox(int ), (int)92);
                } while (!var3_1);
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)py$ModuleBounds.fgph("fgzu", fgox(int ), (int)93);
        ** while (!var3_1)
lbl65:
        // 1 sources

        throw null;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public float y() {
        boolean bl2;
        Object object = ly;
        boolean bl3 = true;
        block11: while (true) {
            CallSite callSite;
            if (!bl3 || (bl3 = false) || !true) {
                object = callSite - py$ModuleBounds.fgph("fgvo", fgps(int ), (int)33);
            }
            switch ((int)object) {
                case 15143548: {
                    callSite = py$ModuleBounds.fgph("fgvp", fgps(int ), (int)34);
                    continue block11;
                }
                case 147458691: {
                    callSite = py$ModuleBounds.fgph("fgvq", fgps(int ), (int)35);
                    continue block11;
                }
                case 1442220940: {
                    callSite = py$ModuleBounds.fgph("fgvr", fgps(int ), (int)36);
                    continue block11;
                }
                case 1999824867: {
                    break block11;
                }
            }
            break;
        }
        boolean bl4 = c;
        Object object2 = ly;
        boolean bl5 = true;
        block12: while (true) {
            CallSite callSite;
            if (!bl5 || (bl5 = false) || !true) {
                object2 = callSite - py$ModuleBounds.fgph("fgvt", fgps(int ), (int)37);
            }
            switch ((int)object2) {
                case -1975462391: {
                    callSite = py$ModuleBounds.fgph("fgvu", fgps(int ), (int)38);
                    continue block12;
                }
                case 801597897: {
                    callSite = py$ModuleBounds.fgph("fgvv", fgps(int ), (int)39);
                    continue block12;
                }
                case 1999824867: {
                    break block12;
                }
            }
            break;
        }
        int n2 = b;
        while (true) {
            long l2;
            Object object3;
            if ((object3 = (l2 = ly - py$ModuleBounds.fgph("fgvx", fgps(int ), (int)40)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (object3 == py$ModuleBounds.fgph("fgvz", fgox(int ), (int)53)) {
                bl2 = a;
                if (bl4) {
                    throw null;
                }
                break;
            }
            object3 = py$ModuleBounds.fgph("fgwa", fgox(int ), (int)54);
        }
        if (bl2) return (float)py$ModuleBounds.fgph("fgwc", fguz(int ), (int)55);
        if (bl2) return (float)py$ModuleBounds.fgph("fgwc", fguz(int ), (int)55);
        while (true) {
            long l3;
            Object object4;
            if ((object4 = (l3 = ly - py$ModuleBounds.fgph("fgwd", fgps(int ), (int)41)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (object4 == py$ModuleBounds.fgph("fgwe", fgox(int ), (int)56)) {
                return this.y;
            }
            object4 = py$ModuleBounds.fgph("fgwf", fgox(int ), (int)57);
        }
    }

    static {
        py$ModuleBounds.fgzy();
        py$ModuleBounds.fhaq();
        fgpt = new long[78];
        fgpu = new long[78];
        py$ModuleBounds.fhbg();
        py$ModuleBounds.fhbu();
    }

    private static /* synthetic */ void fhaq() {
        py$ModuleBounds.fgpg[0] = -413992218;
        py$ModuleBounds.fgpg[1] = -388673874;
        py$ModuleBounds.fgpg[2] = -1503273053;
        py$ModuleBounds.fgpg[3] = -1412565418;
        py$ModuleBounds.fgpg[4] = 619216720;
        py$ModuleBounds.fgpg[5] = 588325008;
        py$ModuleBounds.fgpg[6] = -1643535345;
        py$ModuleBounds.fgpg[7] = -1478123994;
        py$ModuleBounds.fgpg[8] = -1728533624;
        py$ModuleBounds.fgpg[9] = 1822110193;
        py$ModuleBounds.fgpg[10] = -1079750383;
        py$ModuleBounds.fgpg[11] = 1163762103;
        py$ModuleBounds.fgpg[12] = -2006424211;
        py$ModuleBounds.fgpg[13] = 1668913390;
        py$ModuleBounds.fgpg[14] = 1781399874;
        py$ModuleBounds.fgpg[15] = 1019632428;
        py$ModuleBounds.fgpg[16] = -444141840;
        py$ModuleBounds.fgpg[17] = 647427346;
        py$ModuleBounds.fgpg[18] = -2097457898;
        py$ModuleBounds.fgpg[19] = 2060361778;
        py$ModuleBounds.fgpg[20] = 2112258761;
        py$ModuleBounds.fgpg[21] = -1825280520;
        py$ModuleBounds.fgpg[22] = 1861968272;
        py$ModuleBounds.fgpg[23] = 346210471;
        py$ModuleBounds.fgpg[24] = 1030018785;
        py$ModuleBounds.fgpg[25] = -957487699;
        py$ModuleBounds.fgpg[26] = 925526677;
        py$ModuleBounds.fgpg[27] = -1269610473;
        py$ModuleBounds.fgpg[28] = 1084377643;
        py$ModuleBounds.fgpg[29] = -135273076;
        py$ModuleBounds.fgpg[30] = -722136961;
        py$ModuleBounds.fgpg[31] = 1382268923;
        py$ModuleBounds.fgpg[32] = 1291966024;
        py$ModuleBounds.fgpg[33] = -882824809;
        py$ModuleBounds.fgpg[34] = -1806635060;
        py$ModuleBounds.fgpg[35] = -2044179989;
        py$ModuleBounds.fgpg[36] = 243917988;
        py$ModuleBounds.fgpg[37] = 1740320448;
        py$ModuleBounds.fgpg[38] = -935166056;
        py$ModuleBounds.fgpg[39] = -794650621;
        py$ModuleBounds.fgpg[40] = -969126999;
        py$ModuleBounds.fgpg[41] = -491119310;
        py$ModuleBounds.fgpg[42] = -1885596110;
        py$ModuleBounds.fgpg[43] = 626068504;
        py$ModuleBounds.fgpg[44] = 537813444;
        py$ModuleBounds.fgpg[45] = -553998251;
        py$ModuleBounds.fgpg[46] = 203001236;
        py$ModuleBounds.fgpg[47] = 731973422;
        py$ModuleBounds.fgpg[48] = -1542187922;
        py$ModuleBounds.fgpg[49] = -236356196;
        py$ModuleBounds.fgpg[50] = 430960061;
        py$ModuleBounds.fgpg[51] = -1389315752;
        py$ModuleBounds.fgpg[52] = 298944624;
        py$ModuleBounds.fgpg[53] = 1174754430;
        py$ModuleBounds.fgpg[54] = 792586944;
        py$ModuleBounds.fgpg[55] = -201635538;
        py$ModuleBounds.fgpg[56] = 975336778;
        py$ModuleBounds.fgpg[57] = -1093599803;
        py$ModuleBounds.fgpg[58] = 815230867;
        py$ModuleBounds.fgpg[59] = -1603944377;
        py$ModuleBounds.fgpg[60] = -1339407889;
        py$ModuleBounds.fgpg[61] = -642876637;
        py$ModuleBounds.fgpg[62] = 1444420282;
        py$ModuleBounds.fgpg[63] = 2087368722;
        py$ModuleBounds.fgpg[64] = 1988515978;
        py$ModuleBounds.fgpg[65] = 1323847080;
        py$ModuleBounds.fgpg[66] = 77098310;
        py$ModuleBounds.fgpg[67] = 703791402;
        py$ModuleBounds.fgpg[68] = -335028350;
        py$ModuleBounds.fgpg[69] = 84136758;
        py$ModuleBounds.fgpg[70] = -1985966842;
        py$ModuleBounds.fgpg[71] = 355380187;
        py$ModuleBounds.fgpg[72] = 2122580602;
        py$ModuleBounds.fgpg[73] = 2078797442;
        py$ModuleBounds.fgpg[74] = -1295584763;
        py$ModuleBounds.fgpg[75] = 486724995;
        py$ModuleBounds.fgpg[76] = -1778680723;
        py$ModuleBounds.fgpg[77] = 230495272;
        py$ModuleBounds.fgpg[78] = 22749912;
        py$ModuleBounds.fgpg[79] = -1901039892;
        py$ModuleBounds.fgpg[80] = -386071383;
        py$ModuleBounds.fgpg[81] = -1383728106;
        py$ModuleBounds.fgpg[82] = -935365580;
        py$ModuleBounds.fgpg[83] = -309323613;
        py$ModuleBounds.fgpg[84] = -1932643136;
        py$ModuleBounds.fgpg[85] = 2138042022;
        py$ModuleBounds.fgpg[86] = 831947273;
        py$ModuleBounds.fgpg[87] = 1327072267;
        py$ModuleBounds.fgpg[88] = -1629029960;
        py$ModuleBounds.fgpg[89] = 1282986909;
        py$ModuleBounds.fgpg[90] = -1776010740;
        py$ModuleBounds.fgpg[91] = 142038733;
        py$ModuleBounds.fgpg[92] = 873015994;
        py$ModuleBounds.fgpg[93] = -1229825511;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public float height() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = py$ModuleBounds.ly - py$ModuleBounds.fgph("fgxe", fgps(int ), (int)57)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == py$ModuleBounds.fgph("fgxf", fgox(int ), (int)67)) break;
            v0 /* !! */  = (long)py$ModuleBounds.fgph("fgxg", fgox(int ), (int)68);
        }
        var3_1 = py$ModuleBounds.c;
        v1 /* !! */  = py$ModuleBounds.ly;
        if (true) ** GOTO lbl12
        block16: while (true) {
            v1 /* !! */  = (long)(v2 - py$ModuleBounds.fgph("fgxh", fgps(int ), (int)58));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1567453589: {
                    v2 = py$ModuleBounds.fgph("fgxj", fgps(int ), (int)59);
                    continue block16;
                }
                case 1052801911: {
                    v2 = py$ModuleBounds.fgph("fgxk", fgps(int ), (int)60);
                    continue block16;
                }
                case 1999824867: {
                    break block16;
                }
            }
            break;
        }
        var2_2 /* !! */  = py$ModuleBounds.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = py$ModuleBounds.ly - py$ModuleBounds.fgph("fgxl", fgps(int ), (int)61)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == py$ModuleBounds.fgph("fgxm", fgox(int ), (int)69)) break;
            v3 /* !! */  = (long)py$ModuleBounds.fgph("fgxn", fgox(int ), (int)70);
        }
        var1_3 = py$ModuleBounds.a;
        if (var3_1) {
            throw null;
            return (float)py$ModuleBounds.fgph("fgxo", fguz(int ), (int)71);
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** continue;
                v4 /* !! */  = py$ModuleBounds.ly;
                if (true) ** GOTO lbl41
                block19: while (true) {
                    v4 /* !! */  = (long)(py$ModuleBounds.fgph("fgxr", fgps(int ), (int)63) - py$ModuleBounds.fgph("fgxq", fgps(int ), (int)62));
lbl41:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case 1999824867: {
                            break block19;
                        }
                        case 2040236818: {
                            continue block19;
                        }
                    }
                    break;
                }
                return this.height;
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)py$ModuleBounds.fgph("fgxs", fgox(int ), (int)72);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl57
                    break;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)py$ModuleBounds.fgph("fgxt", fgox(int ), (int)73);
                if (!var3_1) break;
                throw null;
            }
lbl57:
            // 2 sources

            case 2: {
                do {
                    var2_2 /* !! */  = (int)py$ModuleBounds.fgph("fgxu", fgox(int ), (int)74);
                } while (!var3_1);
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)py$ModuleBounds.fgph("fgxv", fgox(int ), (int)75);
        ** while (!var3_1)
lbl65:
        // 1 sources

        throw null;
    }
}

