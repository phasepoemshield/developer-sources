/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import ruhack.phobia.bc;

public class cg
extends bc {
    private static int[] dmyf = new int[38];
    private static long[] dmxo;
    public static final int b;
    private static int[] dmyg;
    static final long ih = 3964633875536020518L;
    private double vertical;
    private double horizontal;
    private static long[] dmxp;
    public static final boolean a;
    public static final boolean c;

    static {
        dmyg = new int[38];
        cg.dnap();
        cg.dnaq();
        dmxo = new long[34];
        dmxp = new long[34];
        cg.dnar();
        cg.dnas();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public double getVertical() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = cg.ih - cg.dmxq("dmyn", dmxn(int ), (int)12)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == cg.dmxq("dmyo", dmye(int ), (int)6)) break;
            v0 /* !! */  = (long)cg.dmxq("dmyp", dmye(int ), (int)7);
        }
        var3_1 = cg.c;
        v1 /* !! */  = cg.ih;
        if (true) ** GOTO lbl12
        block16: while (true) {
            v1 /* !! */  = (long)(cg.dmxq("dmyr", dmxn(int ), (int)14) - cg.dmxq("dmyq", dmxn(int ), (int)13));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 399377446: {
                    break block16;
                }
                case 606285393: {
                    continue block16;
                }
            }
            break;
        }
        var2_2 /* !! */  = cg.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = cg.ih - cg.dmxq("dmys", dmxn(int ), (int)15)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == cg.dmxq("dmyt", dmye(int ), (int)8)) break;
            v2 /* !! */  = (long)cg.dmxq("dmyu", dmye(int ), (int)9);
        }
        var1_3 = cg.a;
        if (var3_1) {
            throw null;
lbl27:
            // 2 sources

            return (double)cg.dmxq("dmyv", dmyb(int ), (int)16);
        }
        if (var1_3) ** GOTO lbl27
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block4 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                v3 /* !! */  = cg.ih;
                if (true) ** GOTO lbl38
                block19: while (true) {
                    v3 /* !! */  = (long)(v4 - cg.dmxq("dmyw", dmxn(int ), (int)17));
lbl38:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -2052038823: {
                            v4 = cg.dmxq("dmyx", dmxn(int ), (int)18);
                            continue block19;
                        }
                        case -693664826: {
                            v4 = cg.dmxq("dmyy", dmxn(int ), (int)19);
                            continue block19;
                        }
                        case 399377446: {
                            break block19;
                        }
                    }
                    break;
                }
                return this.vertical;
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)cg.dmxq("dmyz", dmye(int ), (int)10);
                    if (!var3_1) break block4;
                    throw null;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)cg.dmxq("dmza", dmye(int ), (int)11);
                if (!var3_1) break;
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)cg.dmxq("dmzb", dmye(int ), (int)12);
                if (!var3_1) break;
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)cg.dmxq("dmzc", dmye(int ), (int)13);
        ** while (!var3_1)
lbl64:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ long dmxn(int n2) {
        return dmxo[n2] ^ dmxp[n2];
    }

    private static /* synthetic */ void dnas() {
        cg.dmxp[0] = -7456433811207826505L;
        cg.dmxp[1] = -5841848123360878753L;
        cg.dmxp[2] = -8362281359689477999L;
        cg.dmxp[3] = -3116937206743213570L;
        cg.dmxp[4] = -5150977801352869612L;
        cg.dmxp[5] = 1019014761754211609L;
        cg.dmxp[6] = 7776462870783854601L;
        cg.dmxp[7] = 6903240775571441718L;
        cg.dmxp[8] = 1980775314786510786L;
        cg.dmxp[9] = -6119929482279581847L;
        cg.dmxp[10] = 366618231313390649L;
        cg.dmxp[11] = -444607587810913250L;
        cg.dmxp[12] = 8625736376140767407L;
        cg.dmxp[13] = -3761098255321192345L;
        cg.dmxp[14] = -3613571419687140272L;
        cg.dmxp[15] = -999129030882964318L;
        cg.dmxp[16] = -7642554079211161173L;
        cg.dmxp[17] = -5505034314981947818L;
        cg.dmxp[18] = -6842940892180519176L;
        cg.dmxp[19] = -4669376985663305630L;
        cg.dmxp[20] = -4480957260614143117L;
        cg.dmxp[21] = 7655999598179847871L;
        cg.dmxp[22] = -2372838509693270704L;
        cg.dmxp[23] = 3146156182368500473L;
        cg.dmxp[24] = -1134118966995117543L;
        cg.dmxp[25] = -941643768330784243L;
        cg.dmxp[26] = 2392054637261734665L;
        cg.dmxp[27] = 8771782123204714323L;
        cg.dmxp[28] = 4421875040570592278L;
        cg.dmxp[29] = 3049811944560241911L;
        cg.dmxp[30] = 5650215281740103150L;
        cg.dmxp[31] = 4474675535625021802L;
        cg.dmxp[32] = 8348631312288386113L;
        cg.dmxp[33] = 5823134095819185516L;
    }

    private static /* synthetic */ double dmyb(int n2) {
        return Double.longBitsToDouble(dmxo[n2] ^ dmxp[n2]);
    }

    public static /* synthetic */ CallSite dmxq(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public double getHorizontal() {
        v0 /* !! */  = cg.ih;
        if (true) ** GOTO lbl5
        block22: while (true) {
            v0 /* !! */  = (long)(v1 - cg.dmxq("dmxr", dmxn(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1682327284: {
                    v1 = cg.dmxq("dmxs", dmxn(int ), (int)1);
                    continue block22;
                }
                case -486170013: {
                    v1 = cg.dmxq("dmxt", dmxn(int ), (int)2);
                    continue block22;
                }
                case 337308458: {
                    v1 = cg.dmxq("dmxu", dmxn(int ), (int)3);
                    continue block22;
                }
                case 399377446: {
                    break block22;
                }
            }
            break;
        }
        var3_1 = cg.c;
        v2 /* !! */  = cg.ih;
        if (true) ** GOTO lbl22
        block23: while (true) {
            v2 /* !! */  = (long)(v3 - cg.dmxq("dmxv", dmxn(int ), (int)4));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -498288497: {
                    v3 = cg.dmxq("dmxw", dmxn(int ), (int)5);
                    continue block23;
                }
                case 399377446: {
                    break block23;
                }
                case 1815695364: {
                    v3 = cg.dmxq("dmxx", dmxn(int ), (int)6);
                    continue block23;
                }
            }
            break;
        }
        var2_2 /* !! */  = cg.b;
        v4 /* !! */  = cg.ih;
        if (true) ** GOTO lbl36
        block24: while (true) {
            v4 /* !! */  = (long)(v5 - cg.dmxq("dmxy", dmxn(int ), (int)7));
lbl36:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1638429169: {
                    v5 = cg.dmxq("dmxz", dmxn(int ), (int)8);
                    continue block24;
                }
                case 399377446: {
                    break block24;
                }
                case 1168171490: {
                    v5 = cg.dmxq("dmya", dmxn(int ), (int)9);
                    continue block24;
                }
            }
            break;
        }
        var1_3 = cg.a;
        if (var3_1) {
            throw null;
        }
        if (!var1_3 && !var1_3) ** GOTO lbl53
        if (var2_2 /* !! */  == 0) return (double)cg.dmxq("dmyc", dmyb(int ), (int)10);
        switch (var2_2 /* !! */ ) {
            default: {
                return (double)cg.dmxq("dmyc", dmyb(int ), (int)10);
            }
lbl53:
            // 1 sources

            while (true) {
                if ((v6 /* !! */  = (cfr_temp_0 = cg.ih - cg.dmxq("dmyd", dmxn(int ), (int)11)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v6 /* !! */  == cg.dmxq("dmyh", dmye(int ), (int)0)) {
                    return this.horizontal;
                }
                v6 /* !! */  = (long)cg.dmxq("dmyi", dmye(int ), (int)1);
            }
            case 0: {
                do {
                    var2_2 /* !! */  = (int)cg.dmxq("dmyj", dmye(int ), (int)2);
                } while (!var3_1);
                throw null;
            }
            case 1: {
                ** GOTO lbl71
            }
            case 3: {
                var2_2 /* !! */  = (int)cg.dmxq("dmym", dmye(int ), (int)5);
                if (var3_1) {
                    throw null;
                }
lbl71:
                // 3 sources

                var2_2 /* !! */  = (int)cg.dmxq("dmyk", dmye(int ), (int)3);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: 
        }
        do {
            var2_2 /* !! */  = (int)cg.dmxq("dmyl", dmye(int ), (int)4);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ void dnaq() {
        cg.dmyg[0] = -1580723718;
        cg.dmyg[1] = -1995687047;
        cg.dmyg[2] = -168796075;
        cg.dmyg[3] = 1572214294;
        cg.dmyg[4] = -322614333;
        cg.dmyg[5] = -221943748;
        cg.dmyg[6] = -1282569490;
        cg.dmyg[7] = -1939127595;
        cg.dmyg[8] = -68419600;
        cg.dmyg[9] = 1665673175;
        cg.dmyg[10] = -373885773;
        cg.dmyg[11] = -1873660495;
        cg.dmyg[12] = -667591653;
        cg.dmyg[13] = 631116374;
        cg.dmyg[14] = -969177237;
        cg.dmyg[15] = -1963147494;
        cg.dmyg[16] = 1021768150;
        cg.dmyg[17] = 0x1AAAAAE1;
        cg.dmyg[18] = 1188767218;
        cg.dmyg[19] = -1151286087;
        cg.dmyg[20] = 729677525;
        cg.dmyg[21] = -249497854;
        cg.dmyg[22] = 1811967100;
        cg.dmyg[23] = 879341248;
        cg.dmyg[24] = 848674127;
        cg.dmyg[25] = -24313481;
        cg.dmyg[26] = -137155491;
        cg.dmyg[27] = 164833869;
        cg.dmyg[28] = -388776385;
        cg.dmyg[29] = 1850916876;
        cg.dmyg[30] = -1882942384;
        cg.dmyg[31] = -1493646189;
        cg.dmyg[32] = -1761895502;
        cg.dmyg[33] = 234807507;
        cg.dmyg[34] = 305210891;
        cg.dmyg[35] = 731362441;
        cg.dmyg[36] = -1757453741;
        cg.dmyg[37] = 80258590;
    }

    private static /* synthetic */ int dmye(int n2) {
        return dmyf[n2] ^ dmyg[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void setVertical(double var1_1) {
        v0 /* !! */  = cg.ih;
        if (true) ** GOTO lbl5
        block17: while (true) {
            v0 /* !! */  = (long)(v1 - cg.dmxq("dmzu", dmxn(int ), (int)26));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -766300665: {
                    v1 = cg.dmxq("dmzv", dmxn(int ), (int)27);
                    continue block17;
                }
                case 399377446: {
                    break block17;
                }
                case 2106063890: {
                    v1 = cg.dmxq("dmzw", dmxn(int ), (int)28);
                    continue block17;
                }
            }
            break;
        }
        var5_2 = cg.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = cg.ih - cg.dmxq("dmzx", dmxn(int ), (int)29)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == cg.dmxq("dmzy", dmye(int ), (int)25)) break;
            v2 /* !! */  = (long)cg.dmxq("dmzz", dmye(int ), (int)26);
        }
        var4_3 /* !! */  = cg.b;
        v3 /* !! */  = cg.ih;
        if (true) ** GOTO lbl25
        block19: while (true) {
            v3 /* !! */  = (long)(v4 - cg.dmxq("dnaa", dmxn(int ), (int)30));
lbl25:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1212550700: {
                    v4 = cg.dmxq("dnab", dmxn(int ), (int)31);
                    continue block19;
                }
                case 399377446: {
                    break block19;
                }
                case 1080989913: {
                    v4 = cg.dmxq("dnac", dmxn(int ), (int)32);
                    continue block19;
                }
            }
            break;
        }
        var3_4 = cg.a;
        if (var5_2) {
            throw null;
lbl37:
            // 2 sources

            return;
        }
        if (var3_4 || var3_4) ** GOTO lbl37
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_1 = cg.ih - cg.dmxq("dnad", dmxn(int ), (int)33)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == cg.dmxq("dnae", dmye(int ), (int)27)) break;
            v5 /* !! */  = (long)cg.dmxq("dnaf", dmye(int ), (int)28);
        }
        this.vertical = var1_1;
        if (!var3_4) ** break;
        ** while (true)
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                return;
            }
lbl52:
            // 3 sources

            case 0: {
                var4_3 /* !! */  = (int)cg.dmxq("dnag", dmye(int ), (int)29);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl66
            }
            case 1: {
                var4_3 /* !! */  = (int)cg.dmxq("dnah", dmye(int ), (int)30);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl66
            }
            case 2: {
                var4_3 /* !! */  = (int)cg.dmxq("dnai", dmye(int ), (int)31);
                if (!var5_2) ** GOTO lbl52
                throw null;
            }
lbl66:
            // 3 sources

            case 3: {
                var4_3 /* !! */  = (int)cg.dmxq("dnaj", dmye(int ), (int)32);
                if (!var5_2) ** GOTO lbl52
                throw null;
            }
            case 4: 
        }
        do {
            var4_3 /* !! */  = (int)cg.dmxq("dnak", dmye(int ), (int)33);
        } while (!var5_2);
        throw null;
    }

    private static /* synthetic */ void dnap() {
        cg.dmyf[0] = -1580723717;
        cg.dmyf[1] = 1136875337;
        cg.dmyf[2] = -168796074;
        cg.dmyf[3] = 1572214292;
        cg.dmyf[4] = -322614333;
        cg.dmyf[5] = -221943746;
        cg.dmyf[6] = -1282569489;
        cg.dmyf[7] = -1282154840;
        cg.dmyf[8] = -68419599;
        cg.dmyf[9] = -392270189;
        cg.dmyf[10] = -373885776;
        cg.dmyf[11] = -1873660493;
        cg.dmyf[12] = -667591653;
        cg.dmyf[13] = 631116373;
        cg.dmyf[14] = -969177238;
        cg.dmyf[15] = 1625083651;
        cg.dmyf[16] = 1021768151;
        cg.dmyf[17] = 763206065;
        cg.dmyf[18] = -1188767219;
        cg.dmyf[19] = 1374814093;
        cg.dmyf[20] = 729677525;
        cg.dmyf[21] = -249497850;
        cg.dmyf[22] = 1811967102;
        cg.dmyf[23] = 879341248;
        cg.dmyf[24] = 848674126;
        cg.dmyf[25] = -24313482;
        cg.dmyf[26] = -1300763581;
        cg.dmyf[27] = 164833868;
        cg.dmyf[28] = 1100268699;
        cg.dmyf[29] = 1850916879;
        cg.dmyf[30] = -1882942383;
        cg.dmyf[31] = -1493646191;
        cg.dmyf[32] = -1761895502;
        cg.dmyf[33] = 234807511;
        cg.dmyf[34] = 305210891;
        cg.dmyf[35] = 731362440;
        cg.dmyf[36] = -1757453743;
        cg.dmyf[37] = 80258591;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public cg(double var1_1, double var3_2) {
        var6_3 /* !! */  = cg.b;
        var5_4 = cg.a;
        if (var6_3 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block6: while (true) {
            block8: {
                switch (cfr_temp_0 == -2147483648 ? var6_3 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        super();
                        this.horizontal = var1_1;
                        this.vertical = var3_2;
                        return;
                    }
                    case 2: {
                        var6_3 /* !! */  = (int)cg.dmxq("dnan", dmye(int ), (int)36);
                        cfr_temp_0 = 1;
                        break block8;
                    }
                    case 3: {
                        var6_3 /* !! */  = (int)cg.dmxq("dnao", dmye(int ), (int)37);
                        ** GOTO lbl-1000
                    }
                    case 0: lbl-1000:
                    // 2 sources

                    {
                        var6_3 /* !! */  = (int)cg.dmxq("dnal", dmye(int ), (int)34);
                    }
                    case 1: 
                }
                ** GOTO lbl26
            }
            while (true) {
                if (true) continue block6;
lbl26:
                // 2 sources

                var6_3 /* !! */  = (int)cg.dmxq("dnam", dmye(int ), (int)35);
                cfr_temp_0 = 0;
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void setHorizontal(double var1_1) {
        v0 /* !! */  = cg.ih;
        if (true) ** GOTO lbl5
        block12: while (true) {
            v0 /* !! */  = (long)(v1 - cg.dmxq("dmzd", dmxn(int ), (int)20));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 399377446: {
                    break block12;
                }
                case 1219056602: {
                    v1 = cg.dmxq("dmze", dmxn(int ), (int)21);
                    continue block12;
                }
                case 1728411278: {
                    v1 = cg.dmxq("dmzf", dmxn(int ), (int)22);
                    continue block12;
                }
            }
            break;
        }
        var5_2 = cg.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = cg.ih - cg.dmxq("dmzg", dmxn(int ), (int)23)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == cg.dmxq("dmzh", dmye(int ), (int)14)) break;
            v2 /* !! */  = (long)cg.dmxq("dmzi", dmye(int ), (int)15);
        }
        var4_3 /* !! */  = cg.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = cg.ih - cg.dmxq("dmzj", dmxn(int ), (int)24)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == cg.dmxq("dmzk", dmye(int ), (int)16)) break;
            v3 /* !! */  = (long)cg.dmxq("dmzl", dmye(int ), (int)17);
        }
        var3_4 = cg.a;
        if (var5_2) {
            throw null;
lbl29:
            // 2 sources

            return;
        }
        if (var3_4 || var3_4) ** GOTO lbl29
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_2 = cg.ih - cg.dmxq("dmzm", dmxn(int ), (int)25)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == cg.dmxq("dmzn", dmye(int ), (int)18)) break;
            v4 /* !! */  = (long)cg.dmxq("dmzo", dmye(int ), (int)19);
        }
        this.horizontal = var1_1;
        if (!var3_4) ** break;
        ** while (true)
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                return;
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_3 /* !! */  = (int)cg.dmxq("dmzp", dmye(int ), (int)20);
                    if (var5_2) {
                        throw null;
                    }
                    ** GOTO lbl54
                    break;
                }
            }
            case 1: {
                var4_3 /* !! */  = (int)cg.dmxq("dmzq", dmye(int ), (int)21);
                if (!var5_2) break;
                throw null;
            }
lbl54:
            // 3 sources

            case 2: {
                do {
                    var4_3 /* !! */  = (int)cg.dmxq("dmzr", dmye(int ), (int)22);
                } while (!var5_2);
                throw null;
            }
            case 3: {
                var4_3 /* !! */  = (int)cg.dmxq("dmzs", dmye(int ), (int)23);
                if (!var5_2) ** GOTO lbl54
                throw null;
            }
            case 4: 
        }
        var4_3 /* !! */  = (int)cg.dmxq("dmzt", dmye(int ), (int)24);
        ** while (!var5_2)
lbl66:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void dnar() {
        cg.dmxo[0] = 4575497104930551478L;
        cg.dmxo[1] = -8363252876298238887L;
        cg.dmxo[2] = 3251425196022225124L;
        cg.dmxo[3] = -1534358199710807388L;
        cg.dmxo[4] = 6152107015978920528L;
        cg.dmxo[5] = -7876270266720168118L;
        cg.dmxo[6] = -5611500726429936122L;
        cg.dmxo[7] = -8939413454736891366L;
        cg.dmxo[8] = 5389564845999115611L;
        cg.dmxo[9] = 4269635243016699901L;
        cg.dmxo[10] = 4249591213952291311L;
        cg.dmxo[11] = 4687632276545551729L;
        cg.dmxo[12] = -6802939611790537267L;
        cg.dmxo[13] = 8021550509513047770L;
        cg.dmxo[14] = -5979706383536882467L;
        cg.dmxo[15] = 4104921214351633717L;
        cg.dmxo[16] = -6184960738825872469L;
        cg.dmxo[17] = 5842126032129648931L;
        cg.dmxo[18] = 250977394493428524L;
        cg.dmxo[19] = -6574877389003241292L;
        cg.dmxo[20] = 7548751290611219200L;
        cg.dmxo[21] = -7890193349872128754L;
        cg.dmxo[22] = 8940431369163603420L;
        cg.dmxo[23] = -4509875198053339055L;
        cg.dmxo[24] = 8373562049757684725L;
        cg.dmxo[25] = -6273722682966959054L;
        cg.dmxo[26] = -7982824241158298827L;
        cg.dmxo[27] = 5635054463720509758L;
        cg.dmxo[28] = -699667713751437521L;
        cg.dmxo[29] = 3089904432434127303L;
        cg.dmxo[30] = -8544962356909798184L;
        cg.dmxo[31] = -8393510288566902470L;
        cg.dmxo[32] = 1564278064665816786L;
        cg.dmxo[33] = -8190780656733752826L;
    }
}

