/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  net.minecraft.class_2350
 *  net.minecraft.class_243
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.runtime.ObjectMethods;
import net.minecraft.class_2350;
import net.minecraft.class_243;

final class gl$AimPoint
extends Record {
    private static long[] cghd;
    public static final long fs = 1270379105349402038L;
    private final class_2350 side;
    private final class_243 point;
    public static final boolean c;
    private static int[] cggu;
    private static int[] cggv;
    private static long[] cghe;
    private final float pitch;
    public static final boolean a;
    public static final int b;
    private final float yaw;
    private final float score;

    private static /* synthetic */ long cghc(int n2) {
        return cghd[n2] ^ cghe[n2];
    }

    /*
     * Enabled aggressive block sorting
     */
    public float score() {
        boolean bl2;
        while (true) {
            long l2;
            Object object;
            if ((object = (l2 = fs - gl$AimPoint.cggw("cglw", cghc(int ), (int)68)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object == gl$AimPoint.cggw("cglx", cggt(int ), (int)57)) break;
            object = gl$AimPoint.cggw("cgly", cggt(int ), (int)58);
        }
        boolean bl3 = c;
        while (true) {
            long l3;
            Object object;
            if ((object = (l3 = fs - gl$AimPoint.cggw("cglz", cghc(int ), (int)69)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object == gl$AimPoint.cggw("cgma", cggt(int ), (int)59)) break;
            object = gl$AimPoint.cggw("cgmb", cggt(int ), (int)60);
        }
        int n2 = b;
        while (true) {
            long l4;
            Object object;
            if ((object = (l4 = fs - gl$AimPoint.cggw("cgmc", cghc(int ), (int)70)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            if (object == gl$AimPoint.cggw("cgmd", cggt(int ), (int)61)) {
                bl2 = a;
                if (bl3) {
                    throw null;
                }
                break;
            }
            object = gl$AimPoint.cggw("cgme", cggt(int ), (int)62);
        }
        if (bl2) return (float)gl$AimPoint.cggw("cgmf", cgkw(int ), (int)63);
        if (bl2) return (float)gl$AimPoint.cggw("cgmf", cgkw(int ), (int)63);
        while (true) {
            long l5;
            Object object;
            if ((object = (l5 = fs - gl$AimPoint.cggw("cgmg", cghc(int ), (int)71)) == 0L ? 0 : (l5 < 0L ? -1 : 1)) == false) continue;
            if (object == gl$AimPoint.cggw("cgmh", cggt(int ), (int)64)) {
                return this.score;
            }
            object = gl$AimPoint.cggw("cgmi", cggt(int ), (int)65);
        }
    }

    private static /* synthetic */ void cgmn() {
        gl$AimPoint.cggu[0] = 954256635;
        gl$AimPoint.cggu[1] = 17780102;
        gl$AimPoint.cggu[2] = -1746130213;
        gl$AimPoint.cggu[3] = -1158308353;
        gl$AimPoint.cggu[4] = 784791162;
        gl$AimPoint.cggu[5] = -703648748;
        gl$AimPoint.cggu[6] = 453618195;
        gl$AimPoint.cggu[7] = 1253953956;
        gl$AimPoint.cggu[8] = -1303585046;
        gl$AimPoint.cggu[9] = 1616196679;
        gl$AimPoint.cggu[10] = 30229564;
        gl$AimPoint.cggu[11] = -208929889;
        gl$AimPoint.cggu[12] = -558574425;
        gl$AimPoint.cggu[13] = 307538996;
        gl$AimPoint.cggu[14] = -1326369391;
        gl$AimPoint.cggu[15] = 550904445;
        gl$AimPoint.cggu[16] = 442675122;
        gl$AimPoint.cggu[17] = 1838571408;
        gl$AimPoint.cggu[18] = -1967722273;
        gl$AimPoint.cggu[19] = 578193848;
        gl$AimPoint.cggu[20] = 1242503532;
        gl$AimPoint.cggu[21] = 126813215;
        gl$AimPoint.cggu[22] = 1481404476;
        gl$AimPoint.cggu[23] = 1635998617;
        gl$AimPoint.cggu[24] = -931682041;
        gl$AimPoint.cggu[25] = 2058194147;
        gl$AimPoint.cggu[26] = -739419603;
        gl$AimPoint.cggu[27] = 277299673;
        gl$AimPoint.cggu[28] = 2016245229;
        gl$AimPoint.cggu[29] = -1846513471;
        gl$AimPoint.cggu[30] = -712180979;
        gl$AimPoint.cggu[31] = 1694845705;
        gl$AimPoint.cggu[32] = 1110365306;
        gl$AimPoint.cggu[33] = -518013155;
        gl$AimPoint.cggu[34] = 1997650585;
        gl$AimPoint.cggu[35] = 321621060;
        gl$AimPoint.cggu[36] = -285262029;
        gl$AimPoint.cggu[37] = 1137957644;
        gl$AimPoint.cggu[38] = -1699416432;
        gl$AimPoint.cggu[39] = -1043979327;
        gl$AimPoint.cggu[40] = -2045171065;
        gl$AimPoint.cggu[41] = -1045673497;
        gl$AimPoint.cggu[42] = -1259453657;
        gl$AimPoint.cggu[43] = -728810125;
        gl$AimPoint.cggu[44] = -1312430044;
        gl$AimPoint.cggu[45] = 677445347;
        gl$AimPoint.cggu[46] = 331270246;
        gl$AimPoint.cggu[47] = -1640421885;
        gl$AimPoint.cggu[48] = 130241566;
        gl$AimPoint.cggu[49] = -1176606524;
        gl$AimPoint.cggu[50] = -1448397627;
        gl$AimPoint.cggu[51] = 1268139178;
        gl$AimPoint.cggu[52] = 147420005;
        gl$AimPoint.cggu[53] = 767667602;
        gl$AimPoint.cggu[54] = 89418858;
        gl$AimPoint.cggu[55] = 1825102630;
        gl$AimPoint.cggu[56] = -896430141;
        gl$AimPoint.cggu[57] = -833133042;
        gl$AimPoint.cggu[58] = -1786922721;
        gl$AimPoint.cggu[59] = 1267197443;
        gl$AimPoint.cggu[60] = -1703434616;
        gl$AimPoint.cggu[61] = -1754197818;
        gl$AimPoint.cggu[62] = -1836348305;
        gl$AimPoint.cggu[63] = 1539396709;
        gl$AimPoint.cggu[64] = 1301737454;
        gl$AimPoint.cggu[65] = -803444251;
        gl$AimPoint.cggu[66] = 1537732450;
        gl$AimPoint.cggu[67] = 247408328;
        gl$AimPoint.cggu[68] = -1174495751;
        gl$AimPoint.cggu[69] = 160914733;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public class_243 point() {
        v0 /* !! */  = gl$AimPoint.fs;
        if (true) ** GOTO lbl5
        block21: while (true) {
            v0 /* !! */  = (long)(gl$AimPoint.cggw("cgjf", cghc(int ), (int)28) - gl$AimPoint.cggw("cgje", cghc(int ), (int)27));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1318334112: {
                    continue block21;
                }
                case -932315722: {
                    break block21;
                }
            }
            break;
        }
        var3_1 = gl$AimPoint.c;
        v1 /* !! */  = gl$AimPoint.fs;
        if (true) ** GOTO lbl15
        block22: while (true) {
            v1 /* !! */  = (long)(v2 - gl$AimPoint.cggw("cgjg", cghc(int ), (int)29));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1709417305: {
                    v2 = gl$AimPoint.cggw("cgjh", cghc(int ), (int)30);
                    continue block22;
                }
                case -932315722: {
                    break block22;
                }
                case 2082200142: {
                    v2 = gl$AimPoint.cggw("cgji", cghc(int ), (int)31);
                    continue block22;
                }
            }
            break;
        }
        var2_2 /* !! */  = gl$AimPoint.b;
        v3 /* !! */  = gl$AimPoint.fs;
        if (true) ** GOTO lbl29
        block23: while (true) {
            v3 /* !! */  = (long)(v4 - gl$AimPoint.cggw("cgjj", cghc(int ), (int)32));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -932315722: {
                    break block23;
                }
                case -168614957: {
                    v4 = gl$AimPoint.cggw("cgjk", cghc(int ), (int)33);
                    continue block23;
                }
                case 181016215: {
                    v4 = gl$AimPoint.cggw("cgjl", cghc(int ), (int)34);
                    continue block23;
                }
                case 1353723732: {
                    v4 = gl$AimPoint.cggw("cgjm", cghc(int ), (int)35);
                    continue block23;
                }
            }
            break;
        }
        var1_3 = gl$AimPoint.a;
        if (var3_1) {
            throw null;
lbl44:
            // 2 sources

            return null;
        }
        if (var1_3) ** GOTO lbl44
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_0 = gl$AimPoint.fs - gl$AimPoint.cggw("cgjn", cghc(int ), (int)36)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == gl$AimPoint.cggw("cgjo", cggt(int ), (int)29)) break;
                    v5 /* !! */  = (long)gl$AimPoint.cggw("cgjp", cggt(int ), (int)30);
                }
                return this.point;
            }
            case 0: {
                var2_2 /* !! */  = (int)gl$AimPoint.cggw("cgjq", cggt(int ), (int)31);
                if (!var3_1) break;
                throw null;
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)gl$AimPoint.cggw("cgjr", cggt(int ), (int)32);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 2: {
                do {
                    var2_2 /* !! */  = (int)gl$AimPoint.cggw("cgjs", cggt(int ), (int)33);
                } while (!var3_1);
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)gl$AimPoint.cggw("cgjt", cggt(int ), (int)34);
        ** while (!var3_1)
lbl75:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final boolean equals(Object var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = gl$AimPoint.fs - gl$AimPoint.cggw("cgin", cghc(int ), (int)19)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == gl$AimPoint.cggw("cgio", cggt(int ), (int)20)) break;
            v0 /* !! */  = (long)gl$AimPoint.cggw("cgip", cggt(int ), (int)21);
        }
        var4_2 = gl$AimPoint.c;
        v1 /* !! */  = gl$AimPoint.fs;
        if (true) ** GOTO lbl12
        block17: while (true) {
            v1 /* !! */  = (long)(gl$AimPoint.cggw("cgir", cghc(int ), (int)21) - gl$AimPoint.cggw("cgiq", cghc(int ), (int)20));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -932315722: {
                    break block17;
                }
                case -814273832: {
                    continue block17;
                }
            }
            break;
        }
        var3_3 /* !! */  = gl$AimPoint.b;
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v2 /* !! */  = (cfr_temp_1 = gl$AimPoint.fs - gl$AimPoint.cggw("cgis", cghc(int ), (int)22)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v2 /* !! */  == gl$AimPoint.cggw("cgit", cggt(int ), (int)22)) break;
                    v2 /* !! */  = (long)gl$AimPoint.cggw("cgiu", cggt(int ), (int)23);
                }
                var2_4 = gl$AimPoint.a;
                if (var4_2) {
                    throw null;
                    return (boolean)gl$AimPoint.cggw("cgiv", cggt(int ), (int)24);
                }
                if (var2_4 || var2_4) ** continue;
                v3 /* !! */  = gl$AimPoint.fs;
                if (true) ** GOTO lbl37
                block20: while (true) {
                    v3 /* !! */  = (long)(v4 - gl$AimPoint.cggw("cgiw", cghc(int ), (int)23));
lbl37:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1428823451: {
                            v4 = gl$AimPoint.cggw("cgix", cghc(int ), (int)24);
                            continue block20;
                        }
                        case -932315722: {
                            break block20;
                        }
                        case 670254643: {
                            v4 = gl$AimPoint.cggw("cgiy", cghc(int ), (int)25);
                            continue block20;
                        }
                        case 1584557001: {
                            v4 = gl$AimPoint.cggw("cgiz", cghc(int ), (int)26);
                            continue block20;
                        }
                    }
                    break;
                }
                return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{gl$AimPoint.class, "point;side;yaw;pitch;score", "point", "side", "yaw", "pitch", "score"}, this, var1_1);
            }
lbl50:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)gl$AimPoint.cggw("cgja", cggt(int ), (int)25);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl60
                    break;
                }
            }
            case 1: {
                var3_3 /* !! */  = (int)gl$AimPoint.cggw("cgjb", cggt(int ), (int)26);
                if (!var4_2) ** GOTO lbl50
                throw null;
            }
lbl60:
            // 2 sources

            case 2: {
                var3_3 /* !! */  = (int)gl$AimPoint.cggw("cgjc", cggt(int ), (int)27);
                if (!var4_2) break;
                throw null;
            }
            case 3: 
        }
        var3_3 /* !! */  = (int)gl$AimPoint.cggw("cgjd", cggt(int ), (int)28);
        ** while (!var4_2)
lbl67:
        // 1 sources

        throw null;
    }

    static {
        cggu = new int[70];
        cggv = new int[70];
        gl$AimPoint.cgmn();
        gl$AimPoint.cgmo();
        cghd = new long[72];
        cghe = new long[72];
        gl$AimPoint.cgmp();
        gl$AimPoint.cgmq();
    }

    private static /* synthetic */ int cggt(int n2) {
        return cggu[n2] ^ cggv[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public float pitch() {
        v0 /* !! */  = gl$AimPoint.fs;
        if (true) ** GOTO lbl5
        block21: while (true) {
            v0 /* !! */  = (long)(v1 - gl$AimPoint.cggw("cglf", cghc(int ), (int)58));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -932315722: {
                    break block21;
                }
                case -86723737: {
                    v1 = gl$AimPoint.cggw("cglg", cghc(int ), (int)59);
                    continue block21;
                }
                case 137804877: {
                    v1 = gl$AimPoint.cggw("cglh", cghc(int ), (int)60);
                    continue block21;
                }
            }
            break;
        }
        var3_1 = gl$AimPoint.c;
        v2 /* !! */  = gl$AimPoint.fs;
        if (true) ** GOTO lbl19
        block22: while (true) {
            v2 /* !! */  = (long)(v3 - gl$AimPoint.cggw("cgli", cghc(int ), (int)61));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1783416490: {
                    v3 = gl$AimPoint.cggw("cglj", cghc(int ), (int)62);
                    continue block22;
                }
                case -932315722: {
                    break block22;
                }
                case 368734369: {
                    v3 = gl$AimPoint.cggw("cglk", cghc(int ), (int)63);
                    continue block22;
                }
            }
            break;
        }
        var2_2 /* !! */  = gl$AimPoint.b;
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_0 = gl$AimPoint.fs - gl$AimPoint.cggw("cgll", cghc(int ), (int)64)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v4 /* !! */  == gl$AimPoint.cggw("cglm", cggt(int ), (int)50)) break;
            v4 /* !! */  = (long)gl$AimPoint.cggw("cgln", cggt(int ), (int)51);
        }
        var1_3 = gl$AimPoint.a;
        if (var3_1) {
            throw null;
lbl38:
            // 2 sources

            return (float)gl$AimPoint.cggw("cglo", cgkw(int ), (int)52);
        }
        if (var1_3) ** GOTO lbl38
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                v5 /* !! */  = gl$AimPoint.fs;
                if (true) ** GOTO lbl49
                block25: while (true) {
                    v5 /* !! */  = (long)(v6 - gl$AimPoint.cggw("cglp", cghc(int ), (int)65));
lbl49:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1600341896: {
                            v6 = gl$AimPoint.cggw("cglq", cghc(int ), (int)66);
                            continue block25;
                        }
                        case -932315722: {
                            break block25;
                        }
                        case 1083963264: {
                            v6 = gl$AimPoint.cggw("cglr", cghc(int ), (int)67);
                            continue block25;
                        }
                    }
                    break;
                }
                return this.pitch;
            }
            case 0: {
                var2_2 /* !! */  = (int)gl$AimPoint.cggw("cgls", cggt(int ), (int)53);
                if (var3_1) {
                    throw null;
                }
            }
lbl63:
            // 4 sources

            case 1: {
                do {
                    var2_2 /* !! */  = (int)gl$AimPoint.cggw("cglt", cggt(int ), (int)54);
                } while (!var3_1);
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)gl$AimPoint.cggw("cglu", cggt(int ), (int)55);
                if (!var3_1) ** GOTO lbl63
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)gl$AimPoint.cggw("cglv", cggt(int ), (int)56);
        } while (!var3_1);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private gl$AimPoint(class_243 var1_1, class_2350 var2_2, float var3_3, float var4_4, float var5_5) {
        var7_6 /* !! */  = gl$AimPoint.b;
        super();
        this.point = var1_1;
        this.side = var2_2;
        if (var7_6 /* !! */  == 0) ** GOTO lbl-1000
        block0 : switch (var7_6 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.yaw = var3_3;
                this.pitch = var4_4;
                this.score = var5_5;
                return;
            }
            case 0: {
                var7_6 /* !! */  = (int)gl$AimPoint.cggw("cggx", cggt(int ), (int)0);
                break;
            }
            case 1: {
                var7_6 /* !! */  = (int)gl$AimPoint.cggw("cggy", cggt(int ), (int)1);
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var7_6 /* !! */  = (int)gl$AimPoint.cggw("cggz", cggt(int ), (int)2);
                    break block0;
                    break;
                }
            }
            case 3: {
                while (true) {
                    var7_6 /* !! */  = (int)gl$AimPoint.cggw("cgha", cggt(int ), (int)3);
                }
            }
            case 4: 
        }
        var7_6 /* !! */  = (int)gl$AimPoint.cggw("cghb", cggt(int ), (int)4);
        ** while (true)
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public class_2350 side() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = gl$AimPoint.fs - gl$AimPoint.cggw("cgju", cghc(int ), (int)37)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == gl$AimPoint.cggw("cgjv", cggt(int ), (int)35)) break;
            v0 /* !! */  = (long)gl$AimPoint.cggw("cgjw", cggt(int ), (int)36);
        }
        var3_1 = gl$AimPoint.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = gl$AimPoint.fs - gl$AimPoint.cggw("cgjx", cghc(int ), (int)38)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == gl$AimPoint.cggw("cgjy", cggt(int ), (int)37)) break;
            v1 /* !! */  = (long)gl$AimPoint.cggw("cgjz", cggt(int ), (int)38);
        }
        var2_2 /* !! */  = gl$AimPoint.b;
        v2 /* !! */  = gl$AimPoint.fs;
        if (true) ** GOTO lbl19
        block19: while (true) {
            v2 /* !! */  = (long)(v3 - gl$AimPoint.cggw("cgka", cghc(int ), (int)39));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1832648669: {
                    v3 = gl$AimPoint.cggw("cgkb", cghc(int ), (int)40);
                    continue block19;
                }
                case -932315722: {
                    break block19;
                }
                case 2027187725: {
                    v3 = gl$AimPoint.cggw("cgkc", cghc(int ), (int)41);
                    continue block19;
                }
            }
            break;
        }
        var1_3 = gl$AimPoint.a;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block5 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_1) {
                    throw null;
                    return null;
                }
                if (var1_3 || var1_3) ** continue;
                v4 /* !! */  = gl$AimPoint.fs;
                if (true) ** GOTO lbl41
                block21: while (true) {
                    v4 /* !! */  = (long)(v5 - gl$AimPoint.cggw("cgkd", cghc(int ), (int)42));
lbl41:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -932315722: {
                            break block21;
                        }
                        case -424807590: {
                            v5 = gl$AimPoint.cggw("cgke", cghc(int ), (int)43);
                            continue block21;
                        }
                        case 1775872277: {
                            v5 = gl$AimPoint.cggw("cgkf", cghc(int ), (int)44);
                            continue block21;
                        }
                        case 2114381812: {
                            v5 = gl$AimPoint.cggw("cgkg", cghc(int ), (int)45);
                            continue block21;
                        }
                    }
                    break;
                }
                return this.side;
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)gl$AimPoint.cggw("cgkh", cggt(int ), (int)39);
                    if (!var3_1) break block5;
                    throw null;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)gl$AimPoint.cggw("cgki", cggt(int ), (int)40);
                if (!var3_1) break;
                throw null;
            }
            case 2: {
                do {
                    var2_2 /* !! */  = (int)gl$AimPoint.cggw("cgkj", cggt(int ), (int)41);
                } while (!var3_1);
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)gl$AimPoint.cggw("cgkk", cggt(int ), (int)42);
        ** while (!var3_1)
lbl71:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public float yaw() {
        v0 /* !! */  = gl$AimPoint.fs;
        if (true) ** GOTO lbl5
        block23: while (true) {
            v0 /* !! */  = (long)(v1 - gl$AimPoint.cggw("cgkl", cghc(int ), (int)46));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -932315722: {
                    break block23;
                }
                case -278241678: {
                    v1 = gl$AimPoint.cggw("cgkm", cghc(int ), (int)47);
                    continue block23;
                }
                case 362539117: {
                    v1 = gl$AimPoint.cggw("cgkn", cghc(int ), (int)48);
                    continue block23;
                }
                case 1097134591: {
                    v1 = gl$AimPoint.cggw("cgko", cghc(int ), (int)49);
                    continue block23;
                }
            }
            break;
        }
        var3_1 = gl$AimPoint.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = gl$AimPoint.fs - gl$AimPoint.cggw("cgkp", cghc(int ), (int)50)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == gl$AimPoint.cggw("cgkq", cggt(int ), (int)43)) break;
            v2 /* !! */  = (long)gl$AimPoint.cggw("cgkr", cggt(int ), (int)44);
        }
        var2_2 /* !! */  = gl$AimPoint.b;
        v3 /* !! */  = gl$AimPoint.fs;
        if (true) ** GOTO lbl29
        block25: while (true) {
            v3 /* !! */  = (long)(v4 - gl$AimPoint.cggw("cgks", cghc(int ), (int)51));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -2074213659: {
                    v4 = gl$AimPoint.cggw("cgkt", cghc(int ), (int)52);
                    continue block25;
                }
                case -1196783521: {
                    v4 = gl$AimPoint.cggw("cgku", cghc(int ), (int)53);
                    continue block25;
                }
                case -932315722: {
                    break block25;
                }
                case 1554203650: {
                    v4 = gl$AimPoint.cggw("cgkv", cghc(int ), (int)54);
                    continue block25;
                }
            }
            break;
        }
        var1_3 = gl$AimPoint.a;
        if (var3_1) {
            throw null;
lbl44:
            // 2 sources

            return (float)gl$AimPoint.cggw("cgkx", cgkw(int ), (int)45);
        }
        if (var1_3) ** GOTO lbl44
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                v5 /* !! */  = gl$AimPoint.fs;
                if (true) ** GOTO lbl55
                block27: while (true) {
                    v5 /* !! */  = (long)(v6 - gl$AimPoint.cggw("cgky", cghc(int ), (int)55));
lbl55:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -932315722: {
                            break block27;
                        }
                        case 191680714: {
                            v6 = gl$AimPoint.cggw("cgkz", cghc(int ), (int)56);
                            continue block27;
                        }
                        case 285465443: {
                            v6 = gl$AimPoint.cggw("cgla", cghc(int ), (int)57);
                            continue block27;
                        }
                    }
                    break;
                }
                return this.yaw;
            }
            case 0: {
                var2_2 /* !! */  = (int)gl$AimPoint.cggw("cglb", cggt(int ), (int)46);
                if (var3_1) {
                    throw null;
                }
            }
lbl69:
            // 4 sources

            case 1: {
                do {
                    var2_2 /* !! */  = (int)gl$AimPoint.cggw("cglc", cggt(int ), (int)47);
                } while (!var3_1);
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)gl$AimPoint.cggw("cgld", cggt(int ), (int)48);
                    if (!var3_1) ** GOTO lbl69
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)gl$AimPoint.cggw("cgle", cggt(int ), (int)49);
        ** while (!var3_1)
lbl82:
        // 1 sources

        throw null;
    }

    public static /* synthetic */ CallSite cggw(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void cgmo() {
        gl$AimPoint.cggv[0] = 954256635;
        gl$AimPoint.cggv[1] = 17780102;
        gl$AimPoint.cggv[2] = -1746130213;
        gl$AimPoint.cggv[3] = -1158308354;
        gl$AimPoint.cggv[4] = 784791163;
        gl$AimPoint.cggv[5] = -703648747;
        gl$AimPoint.cggv[6] = -282144325;
        gl$AimPoint.cggv[7] = -1253953957;
        gl$AimPoint.cggv[8] = -659928688;
        gl$AimPoint.cggv[9] = 1616196678;
        gl$AimPoint.cggv[10] = 30229566;
        gl$AimPoint.cggv[11] = -208929892;
        gl$AimPoint.cggv[12] = -558574428;
        gl$AimPoint.cggv[13] = 307538997;
        gl$AimPoint.cggv[14] = -1784610111;
        gl$AimPoint.cggv[15] = 402912762;
        gl$AimPoint.cggv[16] = 442675121;
        gl$AimPoint.cggv[17] = 1838571408;
        gl$AimPoint.cggv[18] = -1967722273;
        gl$AimPoint.cggv[19] = 578193848;
        gl$AimPoint.cggv[20] = -1242503533;
        gl$AimPoint.cggv[21] = 1537422898;
        gl$AimPoint.cggv[22] = -1481404477;
        gl$AimPoint.cggv[23] = 1246628740;
        gl$AimPoint.cggv[24] = -931682042;
        gl$AimPoint.cggv[25] = 2058194144;
        gl$AimPoint.cggv[26] = -739419604;
        gl$AimPoint.cggv[27] = 277299673;
        gl$AimPoint.cggv[28] = 2016245230;
        gl$AimPoint.cggv[29] = 1846513470;
        gl$AimPoint.cggv[30] = 1106628029;
        gl$AimPoint.cggv[31] = 1694845705;
        gl$AimPoint.cggv[32] = 1110365306;
        gl$AimPoint.cggv[33] = -518013153;
        gl$AimPoint.cggv[34] = 1997650586;
        gl$AimPoint.cggv[35] = -321621061;
        gl$AimPoint.cggv[36] = -1320458360;
        gl$AimPoint.cggv[37] = -1137957645;
        gl$AimPoint.cggv[38] = 1366894001;
        gl$AimPoint.cggv[39] = -1043979328;
        gl$AimPoint.cggv[40] = -2045171065;
        gl$AimPoint.cggv[41] = -1045673499;
        gl$AimPoint.cggv[42] = -1259453660;
        gl$AimPoint.cggv[43] = 728810124;
        gl$AimPoint.cggv[44] = -1433398334;
        gl$AimPoint.cggv[45] = 390092150;
        gl$AimPoint.cggv[46] = 331270247;
        gl$AimPoint.cggv[47] = -1640421888;
        gl$AimPoint.cggv[48] = 130241564;
        gl$AimPoint.cggv[49] = -1176606521;
        gl$AimPoint.cggv[50] = -1448397628;
        gl$AimPoint.cggv[51] = -1258639784;
        gl$AimPoint.cggv[52] = 909536135;
        gl$AimPoint.cggv[53] = 767667600;
        gl$AimPoint.cggv[54] = 89418857;
        gl$AimPoint.cggv[55] = 1825102630;
        gl$AimPoint.cggv[56] = -896430141;
        gl$AimPoint.cggv[57] = 833133041;
        gl$AimPoint.cggv[58] = 222090247;
        gl$AimPoint.cggv[59] = 1267197442;
        gl$AimPoint.cggv[60] = 2048670082;
        gl$AimPoint.cggv[61] = 1754197817;
        gl$AimPoint.cggv[62] = 880591616;
        gl$AimPoint.cggv[63] = 1694116633;
        gl$AimPoint.cggv[64] = -1301737455;
        gl$AimPoint.cggv[65] = 1070027621;
        gl$AimPoint.cggv[66] = 1537732449;
        gl$AimPoint.cggv[67] = 247408330;
        gl$AimPoint.cggv[68] = -1174495751;
        gl$AimPoint.cggv[69] = 160914735;
    }

    private static /* synthetic */ void cgmq() {
        gl$AimPoint.cghe[0] = 4461143216035035894L;
        gl$AimPoint.cghe[1] = -7739511395124548462L;
        gl$AimPoint.cghe[2] = -1557549856689751606L;
        gl$AimPoint.cghe[3] = -1450099875073136L;
        gl$AimPoint.cghe[4] = -4674030033383561540L;
        gl$AimPoint.cghe[5] = 2279350333215361698L;
        gl$AimPoint.cghe[6] = -3705608722294803813L;
        gl$AimPoint.cghe[7] = -7776016077850803354L;
        gl$AimPoint.cghe[8] = -4374162192342074981L;
        gl$AimPoint.cghe[9] = 2025376385555465142L;
        gl$AimPoint.cghe[10] = 4289501339098047566L;
        gl$AimPoint.cghe[11] = 2345713836338436932L;
        gl$AimPoint.cghe[12] = 4715096142207477488L;
        gl$AimPoint.cghe[13] = 757299302906790234L;
        gl$AimPoint.cghe[14] = 1656311318533188925L;
        gl$AimPoint.cghe[15] = 790015345182163436L;
        gl$AimPoint.cghe[16] = -6430549416224621835L;
        gl$AimPoint.cghe[17] = 7604831733704732720L;
        gl$AimPoint.cghe[18] = -4397215238324398154L;
        gl$AimPoint.cghe[19] = 8563269319742724896L;
        gl$AimPoint.cghe[20] = -327499061663102407L;
        gl$AimPoint.cghe[21] = 1686977622442668131L;
        gl$AimPoint.cghe[22] = 2447420276388078383L;
        gl$AimPoint.cghe[23] = 2760344649584579406L;
        gl$AimPoint.cghe[24] = 434029914823100519L;
        gl$AimPoint.cghe[25] = 2461973954803363193L;
        gl$AimPoint.cghe[26] = -4859904761175117700L;
        gl$AimPoint.cghe[27] = -2218778649233399676L;
        gl$AimPoint.cghe[28] = 4211339896924647308L;
        gl$AimPoint.cghe[29] = 7194775678393517835L;
        gl$AimPoint.cghe[30] = 5157584662026758053L;
        gl$AimPoint.cghe[31] = 5957766476748101418L;
        gl$AimPoint.cghe[32] = -700167518210814311L;
        gl$AimPoint.cghe[33] = 3939383371017528283L;
        gl$AimPoint.cghe[34] = -126214598418267475L;
        gl$AimPoint.cghe[35] = 2142145410949367714L;
        gl$AimPoint.cghe[36] = -4099803634591039201L;
        gl$AimPoint.cghe[37] = -7542707524893141973L;
        gl$AimPoint.cghe[38] = -8406975091970537133L;
        gl$AimPoint.cghe[39] = 4873231185434578142L;
        gl$AimPoint.cghe[40] = 7459177956795882568L;
        gl$AimPoint.cghe[41] = -3155654734552386861L;
        gl$AimPoint.cghe[42] = -6584561284594477570L;
        gl$AimPoint.cghe[43] = -6605725912116537619L;
        gl$AimPoint.cghe[44] = -1203245462355660359L;
        gl$AimPoint.cghe[45] = -5018820785214169493L;
        gl$AimPoint.cghe[46] = -1779156353972098352L;
        gl$AimPoint.cghe[47] = 3046481505680669661L;
        gl$AimPoint.cghe[48] = 1819972165683633867L;
        gl$AimPoint.cghe[49] = 139925611367405022L;
        gl$AimPoint.cghe[50] = -4187951035513062861L;
        gl$AimPoint.cghe[51] = 3900025562520855865L;
        gl$AimPoint.cghe[52] = 8519935403755693455L;
        gl$AimPoint.cghe[53] = -2044470664532491076L;
        gl$AimPoint.cghe[54] = 822647114198486534L;
        gl$AimPoint.cghe[55] = 520325969061281153L;
        gl$AimPoint.cghe[56] = 6307653271974054396L;
        gl$AimPoint.cghe[57] = -8141043607926163404L;
        gl$AimPoint.cghe[58] = -3896362463782226163L;
        gl$AimPoint.cghe[59] = 5487452178609538611L;
        gl$AimPoint.cghe[60] = -182328745097184687L;
        gl$AimPoint.cghe[61] = 2848881584314072141L;
        gl$AimPoint.cghe[62] = 7754480021360347811L;
        gl$AimPoint.cghe[63] = 1750947335818457968L;
        gl$AimPoint.cghe[64] = 5400933759628192454L;
        gl$AimPoint.cghe[65] = -4404678840371132273L;
        gl$AimPoint.cghe[66] = -6056318607936446044L;
        gl$AimPoint.cghe[67] = 6843871110984707324L;
        gl$AimPoint.cghe[68] = -2270641188285657591L;
        gl$AimPoint.cghe[69] = 671609741723842703L;
        gl$AimPoint.cghe[70] = -5332327609303127499L;
        gl$AimPoint.cghe[71] = 391174306847718463L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final int hashCode() {
        v0 /* !! */  = gl$AimPoint.fs;
        if (true) ** GOTO lbl5
        block20: while (true) {
            v0 /* !! */  = (long)(v1 - gl$AimPoint.cggw("cghx", cghc(int ), (int)10));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -932315722: {
                    break block20;
                }
                case -407712549: {
                    v1 = gl$AimPoint.cggw("cghy", cghc(int ), (int)11);
                    continue block20;
                }
                case 223793795: {
                    v1 = gl$AimPoint.cggw("cghz", cghc(int ), (int)12);
                    continue block20;
                }
                case 1968546142: {
                    v1 = gl$AimPoint.cggw("cgia", cghc(int ), (int)13);
                    continue block20;
                }
            }
            break;
        }
        var3_1 = gl$AimPoint.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = gl$AimPoint.fs - gl$AimPoint.cggw("cgib", cghc(int ), (int)14)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == gl$AimPoint.cggw("cgic", cggt(int ), (int)13)) break;
            v2 /* !! */  = (long)gl$AimPoint.cggw("cgid", cggt(int ), (int)14);
        }
        var2_2 /* !! */  = gl$AimPoint.b;
        v3 /* !! */  = gl$AimPoint.fs;
        if (true) ** GOTO lbl29
        block22: while (true) {
            v3 /* !! */  = (long)(gl$AimPoint.cggw("cgif", cghc(int ), (int)16) - gl$AimPoint.cggw("cgie", cghc(int ), (int)15));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -932315722: {
                    break block22;
                }
                case 1415386422: {
                    continue block22;
                }
            }
            break;
        }
        var1_3 = gl$AimPoint.a;
        if (var3_1) {
            throw null;
lbl37:
            // 1 sources

            return (int)gl$AimPoint.cggw("cgig", cggt(int ), (int)15);
        }
        ** while (var1_3 || var1_3)
lbl40:
        // 1 sources

        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v4 /* !! */  = gl$AimPoint.fs;
                if (true) ** GOTO lbl47
                block24: while (true) {
                    v4 /* !! */  = (long)(gl$AimPoint.cggw("cgii", cghc(int ), (int)18) - gl$AimPoint.cggw("cgih", cghc(int ), (int)17));
lbl47:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -932315722: {
                            break block24;
                        }
                        case 1923038397: {
                            continue block24;
                        }
                    }
                    break;
                }
                return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{gl$AimPoint.class, "point;side;yaw;pitch;score", "point", "side", "yaw", "pitch", "score"}, this);
            }
lbl53:
            // 3 sources

            case 0: {
                var2_2 /* !! */  = (int)gl$AimPoint.cggw("cgij", cggt(int ), (int)16);
                if (!var3_1) break;
                throw null;
            }
            case 1: {
                var2_2 /* !! */  = (int)gl$AimPoint.cggw("cgik", cggt(int ), (int)17);
                if (!var3_1) ** GOTO lbl53
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)gl$AimPoint.cggw("cgil", cggt(int ), (int)18);
                    if (!var3_1) ** GOTO lbl53
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)gl$AimPoint.cggw("cgim", cggt(int ), (int)19);
        ** while (!var3_1)
lbl69:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ float cgkw(int n2) {
        return Float.intBitsToFloat(cggu[n2] ^ cggv[n2]);
    }

    private static /* synthetic */ void cgmp() {
        gl$AimPoint.cghd[0] = -4903356733923608540L;
        gl$AimPoint.cghd[1] = 8346698459181241752L;
        gl$AimPoint.cghd[2] = 5839819967103771466L;
        gl$AimPoint.cghd[3] = 6110078767121585673L;
        gl$AimPoint.cghd[4] = 1972465783919405590L;
        gl$AimPoint.cghd[5] = -8139624370990465387L;
        gl$AimPoint.cghd[6] = 2863290461234228480L;
        gl$AimPoint.cghd[7] = 1589768025436385072L;
        gl$AimPoint.cghd[8] = 5913102702797741435L;
        gl$AimPoint.cghd[9] = 4899690595966400411L;
        gl$AimPoint.cghd[10] = -1969882596674753282L;
        gl$AimPoint.cghd[11] = -7148895447426903498L;
        gl$AimPoint.cghd[12] = -2018246537283653479L;
        gl$AimPoint.cghd[13] = 2658496376020709354L;
        gl$AimPoint.cghd[14] = -8113433353515591197L;
        gl$AimPoint.cghd[15] = -5072402072068994334L;
        gl$AimPoint.cghd[16] = -7161469277236230549L;
        gl$AimPoint.cghd[17] = 713407904531822307L;
        gl$AimPoint.cghd[18] = 7212707910780473493L;
        gl$AimPoint.cghd[19] = 534119230350147832L;
        gl$AimPoint.cghd[20] = 5811991931411719106L;
        gl$AimPoint.cghd[21] = 631345428448193788L;
        gl$AimPoint.cghd[22] = 3863374692094242942L;
        gl$AimPoint.cghd[23] = 8262048199050734596L;
        gl$AimPoint.cghd[24] = 1343159746594984706L;
        gl$AimPoint.cghd[25] = -4480553124727811960L;
        gl$AimPoint.cghd[26] = -9155117447935809413L;
        gl$AimPoint.cghd[27] = 2146490026617663023L;
        gl$AimPoint.cghd[28] = 2719331144138991204L;
        gl$AimPoint.cghd[29] = -1802870426715720774L;
        gl$AimPoint.cghd[30] = 3318363324085998879L;
        gl$AimPoint.cghd[31] = 272621308976967360L;
        gl$AimPoint.cghd[32] = -2546174109760605204L;
        gl$AimPoint.cghd[33] = 2320455084501914102L;
        gl$AimPoint.cghd[34] = -2472206508123173990L;
        gl$AimPoint.cghd[35] = -4203704163712653447L;
        gl$AimPoint.cghd[36] = -934263783830902319L;
        gl$AimPoint.cghd[37] = -5155398063630088639L;
        gl$AimPoint.cghd[38] = -3158222044558925800L;
        gl$AimPoint.cghd[39] = -1277868243561673843L;
        gl$AimPoint.cghd[40] = 91541568964313504L;
        gl$AimPoint.cghd[41] = -4189110517215215054L;
        gl$AimPoint.cghd[42] = 7855724438750507618L;
        gl$AimPoint.cghd[43] = 8405416756019555366L;
        gl$AimPoint.cghd[44] = -1291979764761679445L;
        gl$AimPoint.cghd[45] = -1205420251176603040L;
        gl$AimPoint.cghd[46] = 4276634516374676896L;
        gl$AimPoint.cghd[47] = 3979340041898815410L;
        gl$AimPoint.cghd[48] = 2781888918250980003L;
        gl$AimPoint.cghd[49] = 4988303386935805000L;
        gl$AimPoint.cghd[50] = -8661396669746323843L;
        gl$AimPoint.cghd[51] = 5240957313614242164L;
        gl$AimPoint.cghd[52] = 4026712717762418563L;
        gl$AimPoint.cghd[53] = 4344377721901494494L;
        gl$AimPoint.cghd[54] = 5816551410190402764L;
        gl$AimPoint.cghd[55] = -5029911830147792568L;
        gl$AimPoint.cghd[56] = -6179705123317850295L;
        gl$AimPoint.cghd[57] = 3397070472012121680L;
        gl$AimPoint.cghd[58] = 7120813850854610368L;
        gl$AimPoint.cghd[59] = 4649438554721719961L;
        gl$AimPoint.cghd[60] = -3737542444273474577L;
        gl$AimPoint.cghd[61] = -5518196002311261239L;
        gl$AimPoint.cghd[62] = 5279730983725067049L;
        gl$AimPoint.cghd[63] = 3789140568273730607L;
        gl$AimPoint.cghd[64] = -1220344037078767665L;
        gl$AimPoint.cghd[65] = 5258783494997719831L;
        gl$AimPoint.cghd[66] = 6216587099164337286L;
        gl$AimPoint.cghd[67] = -6452471757835078360L;
        gl$AimPoint.cghd[68] = -5239557590300582002L;
        gl$AimPoint.cghd[69] = -4356456702250767043L;
        gl$AimPoint.cghd[70] = -8339099546149439204L;
        gl$AimPoint.cghd[71] = 6135797778362786669L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final String toString() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = gl$AimPoint.fs - gl$AimPoint.cggw("cghf", cghc(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == gl$AimPoint.cggw("cghg", cggt(int ), (int)5)) break;
            v0 /* !! */  = (long)gl$AimPoint.cggw("cghh", cggt(int ), (int)6);
        }
        var3_1 = gl$AimPoint.c;
        v1 /* !! */  = gl$AimPoint.fs;
        if (true) ** GOTO lbl12
        block19: while (true) {
            v1 /* !! */  = (long)(v2 - gl$AimPoint.cggw("cghi", cghc(int ), (int)1));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1675814058: {
                    v2 = gl$AimPoint.cggw("cghj", cghc(int ), (int)2);
                    continue block19;
                }
                case -1308065479: {
                    v2 = gl$AimPoint.cggw("cghk", cghc(int ), (int)3);
                    continue block19;
                }
                case -932315722: {
                    break block19;
                }
                case 1664756947: {
                    v2 = gl$AimPoint.cggw("cghl", cghc(int ), (int)4);
                    continue block19;
                }
            }
            break;
        }
        var2_2 /* !! */  = gl$AimPoint.b;
        v3 /* !! */  = gl$AimPoint.fs;
        if (true) ** GOTO lbl29
        block20: while (true) {
            v3 /* !! */  = (long)(v4 - gl$AimPoint.cggw("cghm", cghc(int ), (int)5));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -932315722: {
                    break block20;
                }
                case -291773825: {
                    v4 = gl$AimPoint.cggw("cghn", cghc(int ), (int)6);
                    continue block20;
                }
                case 454815394: {
                    v4 = gl$AimPoint.cggw("cgho", cghc(int ), (int)7);
                    continue block20;
                }
                case 1131418347: {
                    v4 = gl$AimPoint.cggw("cghp", cghc(int ), (int)8);
                    continue block20;
                }
            }
            break;
        }
        var1_3 = gl$AimPoint.a;
        if (var3_1) {
            throw null;
lbl44:
            // 1 sources

            return null;
        }
        ** while (var1_3 || var1_3)
lbl47:
        // 1 sources

        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = gl$AimPoint.fs - gl$AimPoint.cggw("cghq", cghc(int ), (int)9)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == gl$AimPoint.cggw("cghr", cggt(int ), (int)7)) break;
                    v5 /* !! */  = (long)gl$AimPoint.cggw("cghs", cggt(int ), (int)8);
                }
                return ObjectMethods.bootstrap("toString", new MethodHandle[]{gl$AimPoint.class, "point;side;yaw;pitch;score", "point", "side", "yaw", "pitch", "score"}, this);
            }
lbl57:
            // 2 sources

            case 0: {
                do {
                    var2_2 /* !! */  = (int)gl$AimPoint.cggw("cght", cggt(int ), (int)9);
                } while (!var3_1);
                throw null;
            }
            case 1: {
                var2_2 /* !! */  = (int)gl$AimPoint.cggw("cghu", cggt(int ), (int)10);
                if (!var3_1) break;
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)gl$AimPoint.cggw("cghv", cggt(int ), (int)11);
                    if (!var3_1) ** GOTO lbl57
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)gl$AimPoint.cggw("cghw", cggt(int ), (int)12);
        ** while (!var3_1)
lbl74:
        // 1 sources

        throw null;
    }
}

