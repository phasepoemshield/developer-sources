/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1268
 *  net.minecraft.class_1799
 *  net.minecraft.class_742
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.minecraft.class_1268;
import net.minecraft.class_1799;
import net.minecraft.class_742;
import ruhack.phobia.az;

public class cl
implements az {
    private static long[] dlwh;
    public static final int b;
    private static int[] dlwx;
    private static long[] dlwi;
    private class_1799 stack;
    private static final long ia = 68945633932238394L;
    private class_742 player;
    private static int[] dlwy;
    public static final boolean a;
    public static final boolean c;
    private class_1268 hand;

    private static /* synthetic */ void dmat() {
        cl.dlwy[0] = -947407674;
        cl.dlwy[1] = 855431646;
        cl.dlwy[2] = 1906727514;
        cl.dlwy[3] = 984131541;
        cl.dlwy[4] = 2122198454;
        cl.dlwy[5] = 2054538409;
        cl.dlwy[6] = 1102864036;
        cl.dlwy[7] = 1451384938;
        cl.dlwy[8] = 1727893792;
        cl.dlwy[9] = 1939804886;
        cl.dlwy[10] = -609056484;
        cl.dlwy[11] = -1431149386;
        cl.dlwy[12] = 1088123915;
        cl.dlwy[13] = 1584289760;
        cl.dlwy[14] = -741290310;
        cl.dlwy[15] = 1143432167;
        cl.dlwy[16] = 881702608;
        cl.dlwy[17] = 652790724;
        cl.dlwy[18] = 1155899097;
        cl.dlwy[19] = 1605455979;
        cl.dlwy[20] = 602719927;
        cl.dlwy[21] = -1348525676;
        cl.dlwy[22] = -1753940166;
        cl.dlwy[23] = 1657108922;
        cl.dlwy[24] = -528512022;
        cl.dlwy[25] = -1207501047;
        cl.dlwy[26] = -1560284096;
        cl.dlwy[27] = -979855485;
        cl.dlwy[28] = -1866082453;
        cl.dlwy[29] = 187565633;
        cl.dlwy[30] = -1129114249;
        cl.dlwy[31] = -1838571008;
        cl.dlwy[32] = 954340983;
        cl.dlwy[33] = 635649483;
        cl.dlwy[34] = 1152673516;
        cl.dlwy[35] = 425600021;
        cl.dlwy[36] = 818552929;
        cl.dlwy[37] = 1356221571;
        cl.dlwy[38] = -524769482;
        cl.dlwy[39] = 931624938;
        cl.dlwy[40] = 1279763921;
        cl.dlwy[41] = 1367551333;
        cl.dlwy[42] = -928285678;
        cl.dlwy[43] = -997191712;
        cl.dlwy[44] = -1686584298;
        cl.dlwy[45] = 1641864091;
        cl.dlwy[46] = 1188961742;
        cl.dlwy[47] = -1163717629;
        cl.dlwy[48] = -474550189;
        cl.dlwy[49] = -1388862822;
        cl.dlwy[50] = -1905167558;
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public cl(class_742 class_7422, class_1799 class_17992, class_1268 class_12682) {
        int n2 = b;
        boolean bl2 = a;
        this.player = class_7422;
        this.stack = class_17992;
        this.hand = class_12682;
        if (n2 == 0) return;
        switch (n2) {
            default: {
                return;
            }
            case 1: {
                CallSite callSite = cl.dlwj("dmap", dlww(int ), (int)48);
            }
            case 0: {
                CallSite callSite = cl.dlwj("dmao", dlww(int ), (int)47);
            }
            case 2: {
                break;
            }
            case 3: {
                CallSite callSite = cl.dlwj("dmar", dlww(int ), (int)50);
            }
        }
        while (true) {
            CallSite callSite = cl.dlwj("dmaq", dlww(int ), (int)49);
        }
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public class_742 getPlayer() {
        Object object = ia;
        boolean bl2 = true;
        block17: while (true) {
            CallSite callSite;
            if (!bl2 || (bl2 = false) || !true) {
                object = callSite - cl.dlwj("dlwk", dlwg(int ), (int)0);
            }
            switch ((int)object) {
                case -902034394: {
                    callSite = cl.dlwj("dlwl", dlwg(int ), (int)1);
                    continue block17;
                }
                case 903448568: {
                    callSite = cl.dlwj("dlwm", dlwg(int ), (int)2);
                    continue block17;
                }
                case 1038260768: {
                    callSite = cl.dlwj("dlwn", dlwg(int ), (int)3);
                    continue block17;
                }
                case 1398300218: {
                    break block17;
                }
            }
            break;
        }
        boolean bl3 = c;
        Object object2 = ia;
        boolean bl4 = true;
        block18: while (true) {
            CallSite callSite;
            if (!bl4 || (bl4 = false) || !true) {
                object2 = callSite - cl.dlwj("dlwo", dlwg(int ), (int)4);
            }
            switch ((int)object2) {
                case -617008281: {
                    callSite = cl.dlwj("dlwp", dlwg(int ), (int)5);
                    continue block18;
                }
                case 902903973: {
                    callSite = cl.dlwj("dlwq", dlwg(int ), (int)6);
                    continue block18;
                }
                case 1398300218: {
                    break block18;
                }
                case 2113798353: {
                    callSite = cl.dlwj("dlwr", dlwg(int ), (int)7);
                    continue block18;
                }
            }
            break;
        }
        int n2 = b;
        Object object3 = ia;
        boolean bl5 = true;
        block19: while (true) {
            CallSite callSite;
            if (!bl5 || (bl5 = false) || !true) {
                object3 = callSite - cl.dlwj("dlws", dlwg(int ), (int)8);
            }
            switch ((int)object3) {
                case 1398300218: {
                    break block19;
                }
                case 1474311353: {
                    callSite = cl.dlwj("dlwt", dlwg(int ), (int)9);
                    continue block19;
                }
                case 1780106357: {
                    callSite = cl.dlwj("dlwu", dlwg(int ), (int)10);
                    continue block19;
                }
            }
            break;
        }
        boolean bl6 = a;
        if (bl3) {
            throw null;
        }
        if (bl6) return null;
        if (bl6) return null;
        while (true) {
            long l2;
            Object object4;
            if ((object4 = (l2 = ia - cl.dlwj("dlwv", dlwg(int ), (int)11)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (object4 == cl.dlwj("dlwz", dlww(int ), (int)0)) {
                return this.player;
            }
            object4 = cl.dlwj("dlxa", dlww(int ), (int)1);
        }
    }

    static {
        dlwx = new int[51];
        dlwy = new int[51];
        cl.dmas();
        cl.dmat();
        dlwh = new long[58];
        dlwi = new long[58];
        cl.dmau();
        cl.dmav();
    }

    private static /* synthetic */ long dlwg(int n2) {
        return dlwh[n2] ^ dlwi[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public class_1799 getStack() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = cl.ia - cl.dlwj("dlxf", dlwg(int ), (int)12)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == cl.dlwj("dlxg", dlww(int ), (int)6)) break;
            v0 /* !! */  = (long)cl.dlwj("dlxh", dlww(int ), (int)7);
        }
        var3_1 = cl.c;
        v1 /* !! */  = cl.ia;
        if (true) ** GOTO lbl12
        block23: while (true) {
            v1 /* !! */  = (long)(cl.dlwj("dlxj", dlwg(int ), (int)14) - cl.dlwj("dlxi", dlwg(int ), (int)13));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1609806724: {
                    continue block23;
                }
                case 1398300218: {
                    break block23;
                }
            }
            break;
        }
        var2_2 /* !! */  = cl.b;
        v2 /* !! */  = cl.ia;
        if (true) ** GOTO lbl22
        block24: while (true) {
            v2 /* !! */  = (long)(v3 - cl.dlwj("dlxk", dlwg(int ), (int)15));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1275574408: {
                    v3 = cl.dlwj("dlxl", dlwg(int ), (int)16);
                    continue block24;
                }
                case 781191343: {
                    v3 = cl.dlwj("dlxm", dlwg(int ), (int)17);
                    continue block24;
                }
                case 1148211277: {
                    v3 = cl.dlwj("dlxn", dlwg(int ), (int)18);
                    continue block24;
                }
                case 1398300218: {
                    break block24;
                }
            }
            break;
        }
        var1_3 = cl.a;
        if (var3_1) {
            throw null;
lbl37:
            // 2 sources

            return null;
        }
        if (var1_3) ** GOTO lbl37
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                v4 /* !! */  = cl.ia;
                if (true) ** GOTO lbl48
                block26: while (true) {
                    v4 /* !! */  = (long)(v5 - cl.dlwj("dlxo", dlwg(int ), (int)19));
lbl48:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1081852955: {
                            v5 = cl.dlwj("dlxp", dlwg(int ), (int)20);
                            continue block26;
                        }
                        case -145733151: {
                            v5 = cl.dlwj("dlxq", dlwg(int ), (int)21);
                            continue block26;
                        }
                        case 1130698085: {
                            v5 = cl.dlwj("dlxr", dlwg(int ), (int)22);
                            continue block26;
                        }
                        case 1398300218: {
                            break block26;
                        }
                    }
                    break;
                }
                return this.stack;
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)cl.dlwj("dlxs", dlww(int ), (int)8);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl72
                    break;
                }
            }
            case 1: {
                do {
                    var2_2 /* !! */  = (int)cl.dlwj("dlxt", dlww(int ), (int)9);
                } while (!var3_1);
                throw null;
            }
lbl72:
            // 2 sources

            case 2: {
                do {
                    var2_2 /* !! */  = (int)cl.dlwj("dlxu", dlww(int ), (int)10);
                } while (!var3_1);
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)cl.dlwj("dlxv", dlww(int ), (int)11);
        ** while (!var3_1)
lbl80:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void setPlayer(class_742 var1_1) {
        v0 /* !! */  = cl.ia;
        if (true) ** GOTO lbl5
        block24: while (true) {
            v0 /* !! */  = (long)(v1 - cl.dlwj("dlyp", dlwg(int ), (int)36));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -928285873: {
                    v1 = cl.dlwj("dlyq", dlwg(int ), (int)37);
                    continue block24;
                }
                case 737284837: {
                    v1 = cl.dlwj("dlyr", dlwg(int ), (int)38);
                    continue block24;
                }
                case 1398300218: {
                    break block24;
                }
            }
            break;
        }
        var4_2 = cl.c;
        v2 /* !! */  = cl.ia;
        if (true) ** GOTO lbl19
        block25: while (true) {
            v2 /* !! */  = (long)(v3 - cl.dlwj("dlys", dlwg(int ), (int)39));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1584455100: {
                    v3 = cl.dlwj("dlyt", dlwg(int ), (int)40);
                    continue block25;
                }
                case -190296138: {
                    v3 = cl.dlwj("dlyu", dlwg(int ), (int)41);
                    continue block25;
                }
                case 1105052786: {
                    v3 = cl.dlwj("dlyv", dlwg(int ), (int)42);
                    continue block25;
                }
                case 1398300218: {
                    break block25;
                }
            }
            break;
        }
        var3_3 /* !! */  = cl.b;
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v4 /* !! */  = cl.ia;
                if (true) ** GOTO lbl39
                block26: while (true) {
                    v4 /* !! */  = (long)(v5 - cl.dlwj("dlyw", dlwg(int ), (int)43));
lbl39:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -580640207: {
                            v5 = cl.dlwj("dlyx", dlwg(int ), (int)44);
                            continue block26;
                        }
                        case 566804934: {
                            v5 = cl.dlwj("dlyy", dlwg(int ), (int)45);
                            continue block26;
                        }
                        case 742403448: {
                            v5 = cl.dlwj("dlyz", dlwg(int ), (int)46);
                            continue block26;
                        }
                        case 1398300218: {
                            break block26;
                        }
                    }
                    break;
                }
                var2_4 = cl.a;
                if (var4_2) {
                    throw null;
lbl54:
                    // 2 sources

                    return;
                }
                if (var2_4 || var2_4) ** GOTO lbl54
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_0 = cl.ia - cl.dlwj("dlza", dlwg(int ), (int)47)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == cl.dlwj("dlzb", dlww(int ), (int)18)) break;
                    v6 /* !! */  = (long)cl.dlwj("dlzc", dlww(int ), (int)19);
                }
                this.player = var1_1;
                if (!var2_4) ** break;
                ** continue;
                return;
            }
lbl66:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)cl.dlwj("dlzd", dlww(int ), (int)20);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl79
            }
            case 1: {
                var3_3 /* !! */  = (int)cl.dlwj("dlze", dlww(int ), (int)21);
                if (var4_2) {
                    throw null;
                }
            }
            case 2: {
                var3_3 /* !! */  = (int)cl.dlwj("dlzf", dlww(int ), (int)22);
                if (!var4_2) ** GOTO lbl66
                throw null;
            }
lbl79:
            // 2 sources

            case 3: {
                do {
                    var3_3 /* !! */  = (int)cl.dlwj("dlzg", dlww(int ), (int)23);
                } while (!var4_2);
                throw null;
            }
            case 4: 
        }
        do {
            var3_3 /* !! */  = (int)cl.dlwj("dlzh", dlww(int ), (int)24);
        } while (!var4_2);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public class_1268 getHand() {
        v0 /* !! */  = cl.ia;
        if (true) ** GOTO lbl5
        block24: while (true) {
            v0 /* !! */  = (long)(v1 - cl.dlwj("dlxw", dlwg(int ), (int)23));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -303980444: {
                    v1 = cl.dlwj("dlxx", dlwg(int ), (int)24);
                    continue block24;
                }
                case -266588951: {
                    v1 = cl.dlwj("dlxy", dlwg(int ), (int)25);
                    continue block24;
                }
                case 1398300218: {
                    break block24;
                }
                case 1797148264: {
                    v1 = cl.dlwj("dlxz", dlwg(int ), (int)26);
                    continue block24;
                }
            }
            break;
        }
        var3_1 = cl.c;
        v2 /* !! */  = cl.ia;
        if (true) ** GOTO lbl22
        block25: while (true) {
            v2 /* !! */  = (long)(v3 - cl.dlwj("dlya", dlwg(int ), (int)27));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1292688924: {
                    v3 = cl.dlwj("dlyb", dlwg(int ), (int)28);
                    continue block25;
                }
                case -904896337: {
                    v3 = cl.dlwj("dlyc", dlwg(int ), (int)29);
                    continue block25;
                }
                case -900006609: {
                    v3 = cl.dlwj("dlyd", dlwg(int ), (int)30);
                    continue block25;
                }
                case 1398300218: {
                    break block25;
                }
            }
            break;
        }
        var2_2 /* !! */  = cl.b;
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_0 = cl.ia - cl.dlwj("dlye", dlwg(int ), (int)31)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v4 /* !! */  == cl.dlwj("dlyf", dlww(int ), (int)12)) {
                var1_3 = cl.a;
                if (var3_1) {
                    throw null;
                }
                break;
            }
            v4 /* !! */  = (long)cl.dlwj("dlyg", dlww(int ), (int)13);
        }
        if (var1_3 != false) return null;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 != false) return null;
                v5 /* !! */  = cl.ia;
                block27: while (true) {
                    switch ((int)v5 /* !! */ ) {
                        case 560249589: {
                            v6 = cl.dlwj("dlyi", dlwg(int ), (int)33);
                            ** GOTO lbl63
                        }
                        case 701434452: {
                            v6 = cl.dlwj("dlyj", dlwg(int ), (int)34);
                            ** GOTO lbl63
                        }
                        case 1398300218: {
                            return this.hand;
                        }
                        case 1535097660: {
                            v6 = cl.dlwj("dlyk", dlwg(int ), (int)35);
lbl63:
                            // 3 sources

                            v5 /* !! */  = (long)(v6 - cl.dlwj("dlyh", dlwg(int ), (int)32));
                            continue block27;
                        }
                    }
                    break;
                }
                return this.hand;
            }
            case 2: {
                var2_2 /* !! */  = (int)cl.dlwj("dlyn", dlww(int ), (int)16);
                if (var3_1) {
                    throw null;
                }
            }
            case 0: {
                ** GOTO lbl76
            }
            case 3: {
                var2_2 /* !! */  = (int)cl.dlwj("dlyo", dlww(int ), (int)17);
                if (var3_1) {
                    throw null;
                }
lbl76:
                // 3 sources

                var2_2 /* !! */  = (int)cl.dlwj("dlyl", dlww(int ), (int)14);
                if (var3_1) {
                    throw null;
                }
            }
            case 1: 
        }
        do {
            var2_2 /* !! */  = (int)cl.dlwj("dlym", dlww(int ), (int)15);
        } while (!var3_1);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void setStack(class_1799 var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = cl.ia - cl.dlwj("dlzi", dlwg(int ), (int)48)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == cl.dlwj("dlzj", dlww(int ), (int)25)) break;
            v0 /* !! */  = (long)cl.dlwj("dlzk", dlww(int ), (int)26);
        }
        var4_2 = cl.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = cl.ia - cl.dlwj("dlzl", dlwg(int ), (int)49)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == cl.dlwj("dlzm", dlww(int ), (int)27)) break;
            v1 /* !! */  = (long)cl.dlwj("dlzn", dlww(int ), (int)28);
        }
        var3_3 /* !! */  = cl.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = cl.ia - cl.dlwj("dlzo", dlwg(int ), (int)50)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == cl.dlwj("dlzp", dlww(int ), (int)29)) break;
            v2 /* !! */  = (long)cl.dlwj("dlzq", dlww(int ), (int)30);
        }
        var2_4 = cl.a;
        if (var4_2) {
            throw null;
lbl21:
            // 3 sources

            return;
        }
        if (var2_4) ** GOTO lbl21
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** GOTO lbl21
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_3 = cl.ia - cl.dlwj("dlzr", dlwg(int ), (int)51)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == cl.dlwj("dlzs", dlww(int ), (int)31)) break;
                    v3 /* !! */  = (long)cl.dlwj("dlzt", dlww(int ), (int)32);
                }
                this.stack = var1_1;
                if (var2_4) ** continue;
                return;
            }
lbl36:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)cl.dlwj("dlzu", dlww(int ), (int)33);
                if (var4_2) {
                    throw null;
                }
            }
lbl40:
            // 4 sources

            case 1: {
                var3_3 /* !! */  = (int)cl.dlwj("dlzv", dlww(int ), (int)34);
                if (!var4_2) ** GOTO lbl36
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)cl.dlwj("dlzw", dlww(int ), (int)35);
                    if (!var4_2) ** GOTO lbl40
                    throw null;
                }
            }
            case 3: {
                var3_3 /* !! */  = (int)cl.dlwj("dlzx", dlww(int ), (int)36);
                if (!var4_2) break;
                throw null;
            }
            case 4: 
        }
        var3_3 /* !! */  = (int)cl.dlwj("dlzy", dlww(int ), (int)37);
        ** while (!var4_2)
lbl56:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void dmau() {
        cl.dlwh[0] = 566565255254948504L;
        cl.dlwh[1] = 2803003327266746439L;
        cl.dlwh[2] = -8177975788558000155L;
        cl.dlwh[3] = 3667349292534095599L;
        cl.dlwh[4] = 6343457036810292443L;
        cl.dlwh[5] = -7607063838044075413L;
        cl.dlwh[6] = -2739318086837351178L;
        cl.dlwh[7] = -5307773395182921706L;
        cl.dlwh[8] = -600979119865648503L;
        cl.dlwh[9] = 6559510318741717248L;
        cl.dlwh[10] = 3083086804224696678L;
        cl.dlwh[11] = -6910716328972504458L;
        cl.dlwh[12] = 5155757778305998744L;
        cl.dlwh[13] = 5428140076500375195L;
        cl.dlwh[14] = -3289370966429916234L;
        cl.dlwh[15] = 8073078998793069148L;
        cl.dlwh[16] = 6460137869782045612L;
        cl.dlwh[17] = 2190849733283879370L;
        cl.dlwh[18] = -4553911481856944689L;
        cl.dlwh[19] = -3207168987564710018L;
        cl.dlwh[20] = 3358886847481086918L;
        cl.dlwh[21] = 450603295456026884L;
        cl.dlwh[22] = 7086794114171691034L;
        cl.dlwh[23] = -2958676652102923891L;
        cl.dlwh[24] = -4920038078241217167L;
        cl.dlwh[25] = -8247323862032898397L;
        cl.dlwh[26] = 7541031700235263214L;
        cl.dlwh[27] = 9219106444709626994L;
        cl.dlwh[28] = 7975823376376961305L;
        cl.dlwh[29] = 8056523090313435015L;
        cl.dlwh[30] = -5720270480397743740L;
        cl.dlwh[31] = -6028129498901481171L;
        cl.dlwh[32] = 6398452395051041376L;
        cl.dlwh[33] = 868869760545640207L;
        cl.dlwh[34] = 6899809562002831989L;
        cl.dlwh[35] = 1074241244741165493L;
        cl.dlwh[36] = -9148715045585907036L;
        cl.dlwh[37] = 7897756351274947117L;
        cl.dlwh[38] = 4357120166045316036L;
        cl.dlwh[39] = 318729737649938991L;
        cl.dlwh[40] = 5801554120235202515L;
        cl.dlwh[41] = -3387629300604905770L;
        cl.dlwh[42] = -8605925444862879030L;
        cl.dlwh[43] = -7421999574149258739L;
        cl.dlwh[44] = 1340300486710800715L;
        cl.dlwh[45] = -5983159718209521966L;
        cl.dlwh[46] = 7093868787619115176L;
        cl.dlwh[47] = 3548391230155818541L;
        cl.dlwh[48] = 2384343589773083749L;
        cl.dlwh[49] = -338947257559937747L;
        cl.dlwh[50] = -3752140775867312320L;
        cl.dlwh[51] = -7860507893472492411L;
        cl.dlwh[52] = -8864439576588165623L;
        cl.dlwh[53] = 7663001094016977113L;
        cl.dlwh[54] = 8827875214350243120L;
        cl.dlwh[55] = 6408800744113075154L;
        cl.dlwh[56] = 4087240747186559699L;
        cl.dlwh[57] = 8191627682696217284L;
    }

    private static /* synthetic */ void dmas() {
        cl.dlwx[0] = -947407673;
        cl.dlwx[1] = -1841045294;
        cl.dlwx[2] = 1906727515;
        cl.dlwx[3] = 984131542;
        cl.dlwx[4] = 2122198455;
        cl.dlwx[5] = 2054538411;
        cl.dlwx[6] = -1102864037;
        cl.dlwx[7] = -335121410;
        cl.dlwx[8] = 1727893792;
        cl.dlwx[9] = 1939804884;
        cl.dlwx[10] = -609056481;
        cl.dlwx[11] = -1431149385;
        cl.dlwx[12] = 1088123914;
        cl.dlwx[13] = -713636749;
        cl.dlwx[14] = -741290310;
        cl.dlwx[15] = 1143432166;
        cl.dlwx[16] = 881702611;
        cl.dlwx[17] = 652790724;
        cl.dlwx[18] = 1155899096;
        cl.dlwx[19] = -1430126855;
        cl.dlwx[20] = 602719923;
        cl.dlwx[21] = -1348525676;
        cl.dlwx[22] = -1753940168;
        cl.dlwx[23] = 1657108926;
        cl.dlwx[24] = -528512018;
        cl.dlwx[25] = -1207501048;
        cl.dlwx[26] = 706795592;
        cl.dlwx[27] = 979855484;
        cl.dlwx[28] = -1709007892;
        cl.dlwx[29] = -187565634;
        cl.dlwx[30] = 1286911209;
        cl.dlwx[31] = 1838571007;
        cl.dlwx[32] = 869631788;
        cl.dlwx[33] = 635649481;
        cl.dlwx[34] = 1152673512;
        cl.dlwx[35] = 425600021;
        cl.dlwx[36] = 818552929;
        cl.dlwx[37] = 1356221569;
        cl.dlwx[38] = 524769481;
        cl.dlwx[39] = 1170923559;
        cl.dlwx[40] = -1279763922;
        cl.dlwx[41] = 1853860300;
        cl.dlwx[42] = -928285679;
        cl.dlwx[43] = -997191708;
        cl.dlwx[44] = -1686584302;
        cl.dlwx[45] = 1641864089;
        cl.dlwx[46] = 1188961742;
        cl.dlwx[47] = -1163717632;
        cl.dlwx[48] = -474550190;
        cl.dlwx[49] = -1388862823;
        cl.dlwx[50] = -1905167558;
    }

    private static /* synthetic */ void dmav() {
        cl.dlwi[0] = -7458086298719477929L;
        cl.dlwi[1] = -2714306037948651469L;
        cl.dlwi[2] = 2157849226594179400L;
        cl.dlwi[3] = -7133161612531811624L;
        cl.dlwi[4] = 1678202820992494094L;
        cl.dlwi[5] = -5014937621200044832L;
        cl.dlwi[6] = 1448469566863930L;
        cl.dlwi[7] = 6073577358431561666L;
        cl.dlwi[8] = 3235382574826242998L;
        cl.dlwi[9] = -6196797756180399949L;
        cl.dlwi[10] = 2621186007973413474L;
        cl.dlwi[11] = 3588236019267085663L;
        cl.dlwi[12] = 5047972431898236354L;
        cl.dlwi[13] = 6045200364331415265L;
        cl.dlwi[14] = -4214827634049832050L;
        cl.dlwi[15] = 5705347434951954097L;
        cl.dlwi[16] = -5749941970011584494L;
        cl.dlwi[17] = -1776582905040614039L;
        cl.dlwi[18] = -731316227754403935L;
        cl.dlwi[19] = 7729675217138015273L;
        cl.dlwi[20] = -6021755772090989343L;
        cl.dlwi[21] = 3985977850090190961L;
        cl.dlwi[22] = -3696855023014228471L;
        cl.dlwi[23] = -125081458151136014L;
        cl.dlwi[24] = -3406321404665448705L;
        cl.dlwi[25] = 4366267283031863964L;
        cl.dlwi[26] = 4319723597246526918L;
        cl.dlwi[27] = 4717235867217029720L;
        cl.dlwi[28] = -6197176144068367279L;
        cl.dlwi[29] = -3455205990858663663L;
        cl.dlwi[30] = 1332352741522210072L;
        cl.dlwi[31] = 5882441722882352389L;
        cl.dlwi[32] = 3820669242628310016L;
        cl.dlwi[33] = 3647302430291492104L;
        cl.dlwi[34] = 4066433250769952972L;
        cl.dlwi[35] = 6503372402249851426L;
        cl.dlwi[36] = -1798850717537168522L;
        cl.dlwi[37] = 3304194507302318240L;
        cl.dlwi[38] = -7884898400041927047L;
        cl.dlwi[39] = 2259556105626204626L;
        cl.dlwi[40] = 1026439516195006272L;
        cl.dlwi[41] = -4552825220920937351L;
        cl.dlwi[42] = -4587341007115509474L;
        cl.dlwi[43] = -385760186241316728L;
        cl.dlwi[44] = 7263816960730715483L;
        cl.dlwi[45] = -6475069344219821858L;
        cl.dlwi[46] = -2324546206418230418L;
        cl.dlwi[47] = -5238733158062477165L;
        cl.dlwi[48] = -7878352171572828463L;
        cl.dlwi[49] = -9044836134782208225L;
        cl.dlwi[50] = -7289398198157965107L;
        cl.dlwi[51] = -3371594204596203096L;
        cl.dlwi[52] = -5818404685405883747L;
        cl.dlwi[53] = 285587223787624952L;
        cl.dlwi[54] = -8373041190543015097L;
        cl.dlwi[55] = -6909977406445193L;
        cl.dlwi[56] = -6010622765160552412L;
        cl.dlwi[57] = 3765238411963688787L;
    }

    private static /* synthetic */ int dlww(int n2) {
        return dlwx[n2] ^ dlwy[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void setHand(class_1268 var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = cl.ia - cl.dlwj("dlzz", dlwg(int ), (int)52)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == cl.dlwj("dmaa", dlww(int ), (int)38)) break;
            v0 /* !! */  = (long)cl.dlwj("dmab", dlww(int ), (int)39);
        }
        var4_2 = cl.c;
        v1 /* !! */  = cl.ia;
        if (true) ** GOTO lbl11
        block16: while (true) {
            v1 /* !! */  = (long)(cl.dlwj("dmad", dlwg(int ), (int)54) - cl.dlwj("dmac", dlwg(int ), (int)53));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 1398300218: {
                    break block16;
                }
                case 2012072776: {
                    continue block16;
                }
            }
            break;
        }
        var3_3 /* !! */  = cl.b;
        v2 /* !! */  = cl.ia;
        if (true) ** GOTO lbl21
        block17: while (true) {
            v2 /* !! */  = (long)(cl.dlwj("dmaf", dlwg(int ), (int)56) - cl.dlwj("dmae", dlwg(int ), (int)55));
lbl21:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 717899485: {
                    continue block17;
                }
                case 1398300218: {
                    break block17;
                }
            }
            break;
        }
        var2_4 = cl.a;
        if (var4_2) {
            throw null;
lbl29:
            // 2 sources

            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl29
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = cl.ia - cl.dlwj("dmag", dlwg(int ), (int)57)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == cl.dlwj("dmah", dlww(int ), (int)40)) break;
            v3 /* !! */  = (long)cl.dlwj("dmai", dlww(int ), (int)41);
        }
        this.hand = var1_1;
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var2_4) ** break;
                ** continue;
                return;
            }
lbl44:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)cl.dlwj("dmaj", dlww(int ), (int)42);
                if (var4_2) {
                    throw null;
                }
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)cl.dlwj("dmak", dlww(int ), (int)43);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl58
                    break;
                }
            }
            case 2: {
                var3_3 /* !! */  = (int)cl.dlwj("dmal", dlww(int ), (int)44);
                if (!var4_2) ** GOTO lbl44
                throw null;
            }
lbl58:
            // 2 sources

            case 3: {
                do {
                    var3_3 /* !! */  = (int)cl.dlwj("dmam", dlww(int ), (int)45);
                } while (!var4_2);
                throw null;
            }
            case 4: 
        }
        var3_3 /* !! */  = (int)cl.dlwj("dman", dlww(int ), (int)46);
        ** while (!var4_2)
lbl66:
        // 1 sources

        throw null;
    }

    public static /* synthetic */ CallSite dlwj(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }
}

