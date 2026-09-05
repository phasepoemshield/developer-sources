/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.runtime.ObjectMethods
 *  net.minecraft.class_243
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.runtime.ObjectMethods;
import net.minecraft.class_243;

record je$FireworkMarker(class_243 position, long createdAt) {
    public static final boolean a;
    public static final int b;
    private static long[] lxtm;
    private final class_243 position;
    private static int[] lxtf;
    private static int[] lxtg;
    public static final boolean c;
    private static long[] lxtn;
    private final long createdAt;
    protected static final long ur = -4543348124449540364L;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private je$FireworkMarker(class_243 var1_1, long var2_2) {
        var5_3 /* !! */  = je$FireworkMarker.b;
        if (var5_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                super();
                this.position = var1_1;
                this.createdAt = var2_2;
                return;
            }
lbl9:
            // 2 sources

            case 0: {
                var5_3 /* !! */  = (int)je$FireworkMarker.lxth("lxti", lxte(int ), (int)0);
                break;
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_3 /* !! */  = (int)je$FireworkMarker.lxth("lxtj", lxte(int ), (int)1);
                    ** GOTO lbl9
                    break;
                }
            }
            case 2: 
        }
        var5_3 /* !! */  = (int)je$FireworkMarker.lxth("lxtk", lxte(int ), (int)2);
        ** while (true)
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final boolean equals(Object var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = je$FireworkMarker.ur - je$FireworkMarker.lxth("lxwd", lxtl(int ), (int)27)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == je$FireworkMarker.lxth("lxwe", lxte(int ), (int)42)) break;
            v0 /* !! */  = (long)je$FireworkMarker.lxth("lxwf", lxte(int ), (int)43);
        }
        var4_2 = je$FireworkMarker.c;
        v1 /* !! */  = je$FireworkMarker.ur;
        if (true) ** GOTO lbl12
        block17: while (true) {
            v1 /* !! */  = (long)(je$FireworkMarker.lxth("lxwh", lxtl(int ), (int)29) - je$FireworkMarker.lxth("lxwg", lxtl(int ), (int)28));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -683706636: {
                    break block17;
                }
                case 392450024: {
                    continue block17;
                }
            }
            break;
        }
        var3_3 /* !! */  = je$FireworkMarker.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = je$FireworkMarker.ur - je$FireworkMarker.lxth("lxwi", lxtl(int ), (int)30)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == je$FireworkMarker.lxth("lxwj", lxte(int ), (int)44)) break;
            v2 /* !! */  = (long)je$FireworkMarker.lxth("lxwk", lxte(int ), (int)45);
        }
        var2_4 = je$FireworkMarker.a;
        if (!var4_2) ** GOTO lbl31
        throw null;
        {
            if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
            switch (var3_3 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return (boolean)je$FireworkMarker.lxth("lxwl", lxte(int ), (int)46);
                }
lbl31:
                // 1 sources

                if (var2_4 || var2_4) continue block19;
                v3 /* !! */  = je$FireworkMarker.ur;
                if (true) ** GOTO lbl36
                block20: while (true) {
                    v3 /* !! */  = (long)(v4 - je$FireworkMarker.lxth("lxwm", lxtl(int ), (int)31));
lbl36:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1785018673: {
                            v4 = je$FireworkMarker.lxth("lxwn", lxtl(int ), (int)32);
                            continue block20;
                        }
                        case -683706636: {
                            break block20;
                        }
                        case 736347664: {
                            v4 = je$FireworkMarker.lxth("lxwo", lxtl(int ), (int)33);
                            continue block20;
                        }
                        case 820306950: {
                            v4 = je$FireworkMarker.lxth("lxwp", lxtl(int ), (int)34);
                            continue block20;
                        }
                    }
                    break;
                }
                return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{je$FireworkMarker.class, "position;createdAt", "position", "createdAt"}, this, var1_1);
lbl49:
                // 2 sources

                case 0: {
                    var3_3 /* !! */  = (int)je$FireworkMarker.lxth("lxwq", lxte(int ), (int)47);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl59
                }
                case 1: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var3_3 /* !! */  = (int)je$FireworkMarker.lxth("lxwr", lxte(int ), (int)48);
                        if (!var4_2) ** GOTO lbl49
                        throw null;
                    }
                }
lbl59:
                // 2 sources

                case 2: {
                    do {
                        var3_3 /* !! */  = (int)je$FireworkMarker.lxth("lxws", lxte(int ), (int)49);
                    } while (!var4_2);
                    throw null;
                }
                case 3: 
            }
        }
        var3_3 /* !! */  = (int)je$FireworkMarker.lxth("lxwt", lxte(int ), (int)50);
        ** while (!var4_2)
lbl67:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void lxyf() {
        je$FireworkMarker.lxtn[0] = -419010392634541169L;
        je$FireworkMarker.lxtn[1] = -6552648950740880763L;
        je$FireworkMarker.lxtn[2] = -6947759955740198147L;
        je$FireworkMarker.lxtn[3] = 6844299012952041066L;
        je$FireworkMarker.lxtn[4] = -5572844082439201453L;
        je$FireworkMarker.lxtn[5] = -7860783267956880302L;
        je$FireworkMarker.lxtn[6] = -252715864686916751L;
        je$FireworkMarker.lxtn[7] = 8693477916081572861L;
        je$FireworkMarker.lxtn[8] = 6123529004730870799L;
        je$FireworkMarker.lxtn[9] = 5593128148410919542L;
        je$FireworkMarker.lxtn[10] = 4091989079334252665L;
        je$FireworkMarker.lxtn[11] = -8490910555334928464L;
        je$FireworkMarker.lxtn[12] = 7088749886681244039L;
        je$FireworkMarker.lxtn[13] = -4090498124816208960L;
        je$FireworkMarker.lxtn[14] = -1892926945405159222L;
        je$FireworkMarker.lxtn[15] = -2335836283441766294L;
        je$FireworkMarker.lxtn[16] = -9069605311877580450L;
        je$FireworkMarker.lxtn[17] = -8501907313468667258L;
        je$FireworkMarker.lxtn[18] = -8454569082399287986L;
        je$FireworkMarker.lxtn[19] = 7248269683463400834L;
        je$FireworkMarker.lxtn[20] = 7718718133365177428L;
        je$FireworkMarker.lxtn[21] = -3791382967757926689L;
        je$FireworkMarker.lxtn[22] = -4744577037368359340L;
        je$FireworkMarker.lxtn[23] = 4652295669217396965L;
        je$FireworkMarker.lxtn[24] = -8052998572264622713L;
        je$FireworkMarker.lxtn[25] = -1436226325986340012L;
        je$FireworkMarker.lxtn[26] = -3920579028899784349L;
        je$FireworkMarker.lxtn[27] = 8859686997259658195L;
        je$FireworkMarker.lxtn[28] = 8279000880212307683L;
        je$FireworkMarker.lxtn[29] = 4133793537289872381L;
        je$FireworkMarker.lxtn[30] = 1982893476872401807L;
        je$FireworkMarker.lxtn[31] = 7675749716068299503L;
        je$FireworkMarker.lxtn[32] = 6111713061355807755L;
        je$FireworkMarker.lxtn[33] = 266365393576437306L;
        je$FireworkMarker.lxtn[34] = -845395614405100651L;
        je$FireworkMarker.lxtn[35] = -5207273419135877956L;
        je$FireworkMarker.lxtn[36] = -6792184717853122043L;
        je$FireworkMarker.lxtn[37] = -4919462165016521169L;
        je$FireworkMarker.lxtn[38] = -736070636339076311L;
        je$FireworkMarker.lxtn[39] = 6303719965355883643L;
        je$FireworkMarker.lxtn[40] = -4439153041674253577L;
        je$FireworkMarker.lxtn[41] = 5082969301622809495L;
        je$FireworkMarker.lxtn[42] = 3682458254876956714L;
        je$FireworkMarker.lxtn[43] = 2278959190977939248L;
        je$FireworkMarker.lxtn[44] = -7254475152692685019L;
        je$FireworkMarker.lxtn[45] = 3361633811746051541L;
        je$FireworkMarker.lxtn[46] = 1475554791849011448L;
        je$FireworkMarker.lxtn[47] = -7144839037765884753L;
        je$FireworkMarker.lxtn[48] = -5704342150268652705L;
        je$FireworkMarker.lxtn[49] = -1590354206383394532L;
        je$FireworkMarker.lxtn[50] = -2457896534921196496L;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public class_243 position() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_1 = je$FireworkMarker.ur - je$FireworkMarker.lxth("lxwu", lxtl(int ), (int)35)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == je$FireworkMarker.lxth("lxwv", lxte(int ), (int)51)) break;
            v0 /* !! */  = (long)je$FireworkMarker.lxth("lxww", lxte(int ), (int)52);
        }
        var3_1 = je$FireworkMarker.c;
        while (true) {
            block28: {
                if ((v1 /* !! */  = (cfr_temp_2 = je$FireworkMarker.ur - je$FireworkMarker.lxth("lxwx", lxtl(int ), (int)36)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v1 /* !! */  != je$FireworkMarker.lxth("lxwy", lxte(int ), (int)53)) break block28;
                var2_2 /* !! */  = je$FireworkMarker.b;
                v2 /* !! */  = je$FireworkMarker.ur;
                if (true) ** GOTO lbl18
            }
            v1 /* !! */  = (long)je$FireworkMarker.lxth("lxwz", lxte(int ), (int)54);
        }
        block20: while (true) {
            v2 /* !! */  = (long)(v3 - je$FireworkMarker.lxth("lxxa", lxtl(int ), (int)37));
lbl18:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -2064746932: {
                    v3 = je$FireworkMarker.lxth("lxxb", lxtl(int ), (int)38);
                    continue block20;
                }
                case -863634786: {
                    v3 = je$FireworkMarker.lxth("lxxc", lxtl(int ), (int)39);
                    continue block20;
                }
                case -683706636: {
                    break block20;
                }
                case -381544138: {
                    v3 = je$FireworkMarker.lxth("lxxd", lxtl(int ), (int)40);
                    continue block20;
                }
            }
            break;
        }
        var1_3 = je$FireworkMarker.a;
        if (var3_1) {
            throw null;
        }
        if (var1_3 != false) return null;
        if (var1_3 != false) return null;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        while (true) {
            switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                default: lbl-1000:
                // 2 sources

                {
                    v4 /* !! */  = je$FireworkMarker.ur;
                    block22: while (true) {
                        switch ((int)v4 /* !! */ ) {
                            case -1670875409: {
                                v5 = je$FireworkMarker.lxth("lxxf", lxtl(int ), (int)42);
                                ** GOTO lbl53
                            }
                            case -683706636: {
                                return this.position;
                            }
                            case -549032870: {
                                v5 = je$FireworkMarker.lxth("lxxg", lxtl(int ), (int)43);
                                ** GOTO lbl53
                            }
                            case 622347596: {
                                v5 = je$FireworkMarker.lxth("lxxh", lxtl(int ), (int)44);
lbl53:
                                // 3 sources

                                v4 /* !! */  = (long)(v5 - je$FireworkMarker.lxth("lxxe", lxtl(int ), (int)41));
                                continue block22;
                            }
                        }
                        break;
                    }
                    return this.position;
                }
                case 3: {
                    var2_2 /* !! */  = (int)je$FireworkMarker.lxth("lxxl", lxte(int ), (int)58);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl-1000
                }
                case 0: {
                    var2_2 /* !! */  = (int)je$FireworkMarker.lxth("lxxi", lxte(int ), (int)55);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 1: lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)je$FireworkMarker.lxth("lxxj", lxte(int ), (int)56);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 2: 
            }
            if (true) ** GOTO lbl73
            break;
        }
        do {
            if (true) ** continue;
lbl73:
            // 2 sources

            var2_2 /* !! */  = (int)je$FireworkMarker.lxth("lxxk", lxte(int ), (int)57);
            cfr_temp_0 = 0;
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ void lxyd() {
        je$FireworkMarker.lxtg[0] = 1679650020;
        je$FireworkMarker.lxtg[1] = 1839561009;
        je$FireworkMarker.lxtg[2] = -1926443238;
        je$FireworkMarker.lxtg[3] = 1113149209;
        je$FireworkMarker.lxtg[4] = 1135512952;
        je$FireworkMarker.lxtg[5] = -142638681;
        je$FireworkMarker.lxtg[6] = 384611623;
        je$FireworkMarker.lxtg[7] = 1432199088;
        je$FireworkMarker.lxtg[8] = -1722017683;
        je$FireworkMarker.lxtg[9] = 734894897;
        je$FireworkMarker.lxtg[10] = -1380692250;
        je$FireworkMarker.lxtg[11] = -845392769;
        je$FireworkMarker.lxtg[12] = -1648513641;
        je$FireworkMarker.lxtg[13] = 397801517;
        je$FireworkMarker.lxtg[14] = -1798676996;
        je$FireworkMarker.lxtg[15] = 1903256;
        je$FireworkMarker.lxtg[16] = -1875809076;
        je$FireworkMarker.lxtg[17] = 1043468503;
        je$FireworkMarker.lxtg[18] = -764914946;
        je$FireworkMarker.lxtg[19] = -1446323635;
        je$FireworkMarker.lxtg[20] = 934614347;
        je$FireworkMarker.lxtg[21] = -170762493;
        je$FireworkMarker.lxtg[22] = -170954312;
        je$FireworkMarker.lxtg[23] = -61044453;
        je$FireworkMarker.lxtg[24] = -1882346740;
        je$FireworkMarker.lxtg[25] = 2042051223;
        je$FireworkMarker.lxtg[26] = 1626711338;
        je$FireworkMarker.lxtg[27] = -556406120;
        je$FireworkMarker.lxtg[28] = 2049502712;
        je$FireworkMarker.lxtg[29] = 1829747761;
        je$FireworkMarker.lxtg[30] = -2105110892;
        je$FireworkMarker.lxtg[31] = -2043335926;
        je$FireworkMarker.lxtg[32] = -1449838018;
        je$FireworkMarker.lxtg[33] = -640762614;
        je$FireworkMarker.lxtg[34] = -2058058104;
        je$FireworkMarker.lxtg[35] = -1555950397;
        je$FireworkMarker.lxtg[36] = 1906341811;
        je$FireworkMarker.lxtg[37] = -8528871;
        je$FireworkMarker.lxtg[38] = -963850996;
        je$FireworkMarker.lxtg[39] = 1147073444;
        je$FireworkMarker.lxtg[40] = -1888456461;
        je$FireworkMarker.lxtg[41] = 1700360723;
        je$FireworkMarker.lxtg[42] = 68832032;
        je$FireworkMarker.lxtg[43] = 1359026359;
        je$FireworkMarker.lxtg[44] = -685921286;
        je$FireworkMarker.lxtg[45] = -1687385990;
        je$FireworkMarker.lxtg[46] = 574001150;
        je$FireworkMarker.lxtg[47] = -1515008136;
        je$FireworkMarker.lxtg[48] = 691314223;
        je$FireworkMarker.lxtg[49] = 2053726046;
        je$FireworkMarker.lxtg[50] = -694399113;
        je$FireworkMarker.lxtg[51] = 1317367821;
        je$FireworkMarker.lxtg[52] = 1765944971;
        je$FireworkMarker.lxtg[53] = 1662699643;
        je$FireworkMarker.lxtg[54] = 1552176736;
        je$FireworkMarker.lxtg[55] = -1286116701;
        je$FireworkMarker.lxtg[56] = -1471392053;
        je$FireworkMarker.lxtg[57] = 2101653623;
        je$FireworkMarker.lxtg[58] = 51309376;
        je$FireworkMarker.lxtg[59] = 1523214137;
        je$FireworkMarker.lxtg[60] = 1452883714;
        je$FireworkMarker.lxtg[61] = -2054838899;
        je$FireworkMarker.lxtg[62] = 220496783;
        je$FireworkMarker.lxtg[63] = -2013626787;
        je$FireworkMarker.lxtg[64] = -1431152872;
        je$FireworkMarker.lxtg[65] = 1195187108;
        je$FireworkMarker.lxtg[66] = -984484803;
        je$FireworkMarker.lxtg[67] = -1627233403;
        je$FireworkMarker.lxtg[68] = -1571845492;
    }

    private static /* synthetic */ float lxtx(int n2) {
        return Float.intBitsToFloat(lxtf[n2] ^ lxtg[n2]);
    }

    private static /* synthetic */ long lxtl(int n2) {
        return lxtm[n2] ^ lxtn[n2];
    }

    public static /* synthetic */ CallSite lxth(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public final String toString() {
        Object object = ur;
        boolean bl2 = true;
        block10: while (true) {
            CallSite callSite;
            if (!bl2 || (bl2 = false) || !true) {
                object = callSite - je$FireworkMarker.lxth("lxuv", lxtl(int ), (int)8);
            }
            switch ((int)object) {
                case -1620265167: {
                    callSite = je$FireworkMarker.lxth("lxuw", lxtl(int ), (int)9);
                    continue block10;
                }
                case -683706636: {
                    break block10;
                }
                case 733923178: {
                    callSite = je$FireworkMarker.lxth("lxux", lxtl(int ), (int)10);
                    continue block10;
                }
                case 1253581346: {
                    callSite = je$FireworkMarker.lxth("lxuy", lxtl(int ), (int)11);
                    continue block10;
                }
            }
            break;
        }
        boolean bl3 = c;
        while (true) {
            long l2;
            Object object2;
            if ((object2 = (l2 = ur - je$FireworkMarker.lxth("lxuz", lxtl(int ), (int)12)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object2 == je$FireworkMarker.lxth("lxva", lxte(int ), (int)27)) break;
            object2 = je$FireworkMarker.lxth("lxvb", lxte(int ), (int)28);
        }
        int n2 = b;
        Object object3 = ur;
        block12: while (true) {
            switch ((int)object3) {
                case -683706636: {
                    break block12;
                }
                case 8283340: {
                    object3 = je$FireworkMarker.lxth("lxvd", lxtl(int ), (int)14) - je$FireworkMarker.lxth("lxvc", lxtl(int ), (int)13);
                    continue block12;
                }
            }
            break;
        }
        boolean bl4 = a;
        if (bl3) {
            throw null;
        }
        if (bl4) return null;
        if (bl4) return null;
        while (true) {
            long l3;
            Object object4;
            if ((object4 = (l3 = ur - je$FireworkMarker.lxth("lxve", lxtl(int ), (int)15)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object4 == je$FireworkMarker.lxth("lxvf", lxte(int ), (int)29)) {
                return ObjectMethods.bootstrap("toString", new MethodHandle[]{je$FireworkMarker.class, "position;createdAt", "position", "createdAt"}, this);
            }
            object4 = je$FireworkMarker.lxth("lxvg", lxte(int ), (int)30);
        }
    }

    private static /* synthetic */ void lxyc() {
        je$FireworkMarker.lxtf[0] = 1679650022;
        je$FireworkMarker.lxtf[1] = 1839561009;
        je$FireworkMarker.lxtf[2] = -1926443238;
        je$FireworkMarker.lxtf[3] = -1113149210;
        je$FireworkMarker.lxtf[4] = -1004236910;
        je$FireworkMarker.lxtf[5] = 142638680;
        je$FireworkMarker.lxtf[6] = 1782355293;
        je$FireworkMarker.lxtf[7] = -1432199089;
        je$FireworkMarker.lxtf[8] = -80657489;
        je$FireworkMarker.lxtf[9] = 356587327;
        je$FireworkMarker.lxtf[10] = 1380692249;
        je$FireworkMarker.lxtf[11] = -245959383;
        je$FireworkMarker.lxtf[12] = 1648513640;
        je$FireworkMarker.lxtf[13] = -995058152;
        je$FireworkMarker.lxtf[14] = -681222660;
        je$FireworkMarker.lxtf[15] = -1903257;
        je$FireworkMarker.lxtf[16] = 351175990;
        je$FireworkMarker.lxtf[17] = 1043468501;
        je$FireworkMarker.lxtf[18] = -764914947;
        je$FireworkMarker.lxtf[19] = -1446323633;
        je$FireworkMarker.lxtf[20] = 934614347;
        je$FireworkMarker.lxtf[21] = -170762489;
        je$FireworkMarker.lxtf[22] = -170954308;
        je$FireworkMarker.lxtf[23] = -61044453;
        je$FireworkMarker.lxtf[24] = -1882346742;
        je$FireworkMarker.lxtf[25] = 2042051222;
        je$FireworkMarker.lxtf[26] = 1626711337;
        je$FireworkMarker.lxtf[27] = 556406119;
        je$FireworkMarker.lxtf[28] = 100370697;
        je$FireworkMarker.lxtf[29] = 1829747760;
        je$FireworkMarker.lxtf[30] = -1126900781;
        je$FireworkMarker.lxtf[31] = -2043335925;
        je$FireworkMarker.lxtf[32] = -1449838017;
        je$FireworkMarker.lxtf[33] = -640762616;
        je$FireworkMarker.lxtf[34] = -2058058102;
        je$FireworkMarker.lxtf[35] = 1555950396;
        je$FireworkMarker.lxtf[36] = 113205815;
        je$FireworkMarker.lxtf[37] = -1542617528;
        je$FireworkMarker.lxtf[38] = -963850996;
        je$FireworkMarker.lxtf[39] = 1147073444;
        je$FireworkMarker.lxtf[40] = -1888456464;
        je$FireworkMarker.lxtf[41] = 1700360720;
        je$FireworkMarker.lxtf[42] = 68832033;
        je$FireworkMarker.lxtf[43] = 84367431;
        je$FireworkMarker.lxtf[44] = 685921285;
        je$FireworkMarker.lxtf[45] = -1781607887;
        je$FireworkMarker.lxtf[46] = 574001150;
        je$FireworkMarker.lxtf[47] = -1515008136;
        je$FireworkMarker.lxtf[48] = 691314220;
        je$FireworkMarker.lxtf[49] = 2053726047;
        je$FireworkMarker.lxtf[50] = -694399116;
        je$FireworkMarker.lxtf[51] = -1317367822;
        je$FireworkMarker.lxtf[52] = -1241187223;
        je$FireworkMarker.lxtf[53] = 1662699642;
        je$FireworkMarker.lxtf[54] = -1678217344;
        je$FireworkMarker.lxtf[55] = -1286116703;
        je$FireworkMarker.lxtf[56] = -1471392056;
        je$FireworkMarker.lxtf[57] = 2101653622;
        je$FireworkMarker.lxtf[58] = 51309377;
        je$FireworkMarker.lxtf[59] = -1523214138;
        je$FireworkMarker.lxtf[60] = 1174747414;
        je$FireworkMarker.lxtf[61] = 2054838898;
        je$FireworkMarker.lxtf[62] = -1120221020;
        je$FireworkMarker.lxtf[63] = -2013626788;
        je$FireworkMarker.lxtf[64] = 2079494463;
        je$FireworkMarker.lxtf[65] = 1195187109;
        je$FireworkMarker.lxtf[66] = -984484802;
        je$FireworkMarker.lxtf[67] = -1627233402;
        je$FireworkMarker.lxtf[68] = -1571845492;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final int hashCode() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = je$FireworkMarker.ur - je$FireworkMarker.lxth("lxvl", lxtl(int ), (int)16)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == je$FireworkMarker.lxth("lxvm", lxte(int ), (int)35)) break;
            v0 /* !! */  = (long)je$FireworkMarker.lxth("lxvn", lxte(int ), (int)36);
        }
        var3_1 = je$FireworkMarker.c;
        v1 /* !! */  = je$FireworkMarker.ur;
        if (true) ** GOTO lbl12
        block23: while (true) {
            v1 /* !! */  = (long)(v2 - je$FireworkMarker.lxth("lxvo", lxtl(int ), (int)17));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1000468848: {
                    v2 = je$FireworkMarker.lxth("lxvp", lxtl(int ), (int)18);
                    continue block23;
                }
                case -683706636: {
                    break block23;
                }
                case -531108538: {
                    v2 = je$FireworkMarker.lxth("lxvq", lxtl(int ), (int)19);
                    continue block23;
                }
                case 23553521: {
                    v2 = je$FireworkMarker.lxth("lxvr", lxtl(int ), (int)20);
                    continue block23;
                }
            }
            break;
        }
        var2_2 /* !! */  = je$FireworkMarker.b;
        v3 /* !! */  = je$FireworkMarker.ur;
        if (true) ** GOTO lbl29
        block24: while (true) {
            v3 /* !! */  = (long)(v4 - je$FireworkMarker.lxth("lxvs", lxtl(int ), (int)21));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1430867259: {
                    v4 = je$FireworkMarker.lxth("lxvt", lxtl(int ), (int)22);
                    continue block24;
                }
                case -683706636: {
                    break block24;
                }
                case 744728915: {
                    v4 = je$FireworkMarker.lxth("lxvu", lxtl(int ), (int)23);
                    continue block24;
                }
                case 1502912568: {
                    v4 = je$FireworkMarker.lxth("lxvv", lxtl(int ), (int)24);
                    continue block24;
                }
            }
            break;
        }
        var1_3 = je$FireworkMarker.a;
        if (!var3_1) ** GOTO lbl48
        throw null;
        {
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var2_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return (int)je$FireworkMarker.lxth("lxvw", lxte(int ), (int)37);
                }
lbl48:
                // 1 sources

                if (var1_3 || var1_3) continue block25;
                v5 /* !! */  = je$FireworkMarker.ur;
                if (true) ** GOTO lbl53
                block26: while (true) {
                    v5 /* !! */  = (long)(je$FireworkMarker.lxth("lxvy", lxtl(int ), (int)26) - je$FireworkMarker.lxth("lxvx", lxtl(int ), (int)25));
lbl53:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -683706636: {
                            break block26;
                        }
                        case 1886935178: {
                            continue block26;
                        }
                    }
                    break;
                }
                return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{je$FireworkMarker.class, "position;createdAt", "position", "createdAt"}, this);
lbl59:
                // 2 sources

                case 0: {
                    do {
                        var2_2 /* !! */  = (int)je$FireworkMarker.lxth("lxvz", lxte(int ), (int)38);
                    } while (!var3_1);
                    throw null;
                }
                case 1: {
                    do {
                        var2_2 /* !! */  = (int)je$FireworkMarker.lxth("lxwa", lxte(int ), (int)39);
                    } while (!var3_1);
                    throw null;
                }
                case 2: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var2_2 /* !! */  = (int)je$FireworkMarker.lxth("lxwb", lxte(int ), (int)40);
                        if (!var3_1) ** GOTO lbl59
                        throw null;
                    }
                }
                case 3: 
            }
        }
        var2_2 /* !! */  = (int)je$FireworkMarker.lxth("lxwc", lxte(int ), (int)41);
        ** while (!var3_1)
lbl77:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private float alpha() {
        block28: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = je$FireworkMarker.ur - je$FireworkMarker.lxth("lxto", lxtl(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  == je$FireworkMarker.lxth("lxtp", lxte(int ), (int)3)) break;
                v0 /* !! */  = (long)je$FireworkMarker.lxth("lxtq", lxte(int ), (int)4);
            }
            var5_1 = je$FireworkMarker.c;
            while (true) {
                if ((v1 /* !! */  = (cfr_temp_1 = je$FireworkMarker.ur - je$FireworkMarker.lxth("lxtr", lxtl(int ), (int)1)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v1 /* !! */  == je$FireworkMarker.lxth("lxts", lxte(int ), (int)5)) break;
                v1 /* !! */  = (long)je$FireworkMarker.lxth("lxtt", lxte(int ), (int)6);
            }
            var4_2 /* !! */  = je$FireworkMarker.b;
            while (true) {
                if ((v2 /* !! */  = (cfr_temp_2 = je$FireworkMarker.ur - je$FireworkMarker.lxth("lxtu", lxtl(int ), (int)2)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v2 /* !! */  == je$FireworkMarker.lxth("lxtv", lxte(int ), (int)7)) break;
                v2 /* !! */  = (long)je$FireworkMarker.lxth("lxtw", lxte(int ), (int)8);
            }
            var3_3 = je$FireworkMarker.a;
            if (var5_1) {
                throw null;
lbl21:
                // 4 sources

                return (float)je$FireworkMarker.lxth("lxty", lxtx(int ), (int)9);
            }
            if (var3_3 || var3_3) ** GOTO lbl21
            while (true) {
                if ((v3 /* !! */  = (cfr_temp_3 = je$FireworkMarker.ur - je$FireworkMarker.lxth("lxtz", lxtl(int ), (int)3)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v3 /* !! */  == je$FireworkMarker.lxth("lxua", lxte(int ), (int)10)) break;
                v3 /* !! */  = (long)je$FireworkMarker.lxth("lxub", lxte(int ), (int)11);
            }
            v4 = System.currentTimeMillis();
            while (true) {
                if ((v5 /* !! */  = (cfr_temp_4 = je$FireworkMarker.ur - je$FireworkMarker.lxth("lxuc", lxtl(int ), (int)4)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                if (v5 /* !! */  == je$FireworkMarker.lxth("lxud", lxte(int ), (int)12)) break;
                v5 /* !! */  = (long)je$FireworkMarker.lxth("lxue", lxte(int ), (int)13);
            }
            var1_4 = v4 - this.createdAt;
            if (var3_3 || var3_3) ** GOTO lbl21
            if (var1_4 > je$FireworkMarker.lxth("lxuf", lxtl(int ), (int)5)) break block28;
            if (var3_3) ** GOTO lbl21
            return 1.0f;
        }
        if (!var3_3 && !var3_3) ** break;
        ** while (true)
        if (var4_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v6 = 1.0f - (float)(var1_4 - je$FireworkMarker.lxth("lxug", lxtl(int ), (int)6)) / je$FireworkMarker.lxth("lxuh", lxtx(int ), (int)14);
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_5 = je$FireworkMarker.ur - je$FireworkMarker.lxth("lxui", lxtl(int ), (int)7)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == je$FireworkMarker.lxth("lxuj", lxte(int ), (int)15)) break;
                    v7 /* !! */  = (long)je$FireworkMarker.lxth("lxuk", lxte(int ), (int)16);
                }
                return Math.max(0.0f, v6);
            }
lbl53:
            // 3 sources

            case 0: {
                var4_2 /* !! */  = (int)je$FireworkMarker.lxth("lxul", lxte(int ), (int)17);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl77
            }
            case 1: {
                var4_2 /* !! */  = (int)je$FireworkMarker.lxth("lxum", lxte(int ), (int)18);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl68
            }
            case 2: {
                var4_2 /* !! */  = (int)je$FireworkMarker.lxth("lxun", lxte(int ), (int)19);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl77
            }
lbl68:
            // 2 sources

            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_2 /* !! */  = (int)je$FireworkMarker.lxth("lxuo", lxte(int ), (int)20);
                    if (!var5_1) ** GOTO lbl53
                    throw null;
                }
            }
            case 4: {
                var4_2 /* !! */  = (int)je$FireworkMarker.lxth("lxup", lxte(int ), (int)21);
                if (var5_1) {
                    throw null;
                }
            }
lbl77:
            // 6 sources

            case 5: {
                do {
                    var4_2 /* !! */  = (int)je$FireworkMarker.lxth("lxuq", lxte(int ), (int)22);
                } while (!var5_1);
                throw null;
            }
            case 6: {
                var4_2 /* !! */  = (int)je$FireworkMarker.lxth("lxur", lxte(int ), (int)23);
                if (!var5_1) ** GOTO lbl77
                throw null;
            }
            case 7: {
                var4_2 /* !! */  = (int)je$FireworkMarker.lxth("lxus", lxte(int ), (int)24);
                if (!var5_1) break;
                throw null;
            }
            case 8: {
                var4_2 /* !! */  = (int)je$FireworkMarker.lxth("lxut", lxte(int ), (int)25);
                if (!var5_1) ** GOTO lbl53
                throw null;
            }
            case 9: 
        }
        var4_2 /* !! */  = (int)je$FireworkMarker.lxth("lxuu", lxte(int ), (int)26);
        ** while (!var5_1)
lbl97:
        // 1 sources

        throw null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public long createdAt() {
        while (true) {
            long l2;
            Object object;
            if ((object = (l2 = ur - je$FireworkMarker.lxth("lxxm", lxtl(int ), (int)45)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object == je$FireworkMarker.lxth("lxxn", lxte(int ), (int)59)) break;
            object = je$FireworkMarker.lxth("lxxo", lxte(int ), (int)60);
        }
        boolean bl2 = c;
        while (true) {
            long l3;
            Object object;
            if ((object = (l3 = ur - je$FireworkMarker.lxth("lxxp", lxtl(int ), (int)46)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object == je$FireworkMarker.lxth("lxxq", lxte(int ), (int)61)) break;
            object = je$FireworkMarker.lxth("lxxr", lxte(int ), (int)62);
        }
        int n2 = b;
        Object object = ur;
        block6: while (true) {
            switch ((int)object) {
                case -683706636: {
                    break block6;
                }
                case 339281267: {
                    object = je$FireworkMarker.lxth("lxxt", lxtl(int ), (int)48) - je$FireworkMarker.lxth("lxxs", lxtl(int ), (int)47);
                    continue block6;
                }
            }
            break;
        }
        boolean bl3 = a;
        if (bl2) {
            throw null;
        }
        if (bl3) return (long)je$FireworkMarker.lxth("lxxu", lxtl(int ), (int)49);
        if (bl3) return (long)je$FireworkMarker.lxth("lxxu", lxtl(int ), (int)49);
        while (true) {
            long l4;
            Object object2;
            if ((object2 = (l4 = ur - je$FireworkMarker.lxth("lxxv", lxtl(int ), (int)50)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            if (object2 == je$FireworkMarker.lxth("lxxw", lxte(int ), (int)63)) {
                return this.createdAt;
            }
            object2 = je$FireworkMarker.lxth("lxxx", lxte(int ), (int)64);
        }
    }

    static {
        lxtf = new int[69];
        lxtg = new int[69];
        je$FireworkMarker.lxyc();
        je$FireworkMarker.lxyd();
        lxtm = new long[51];
        lxtn = new long[51];
        je$FireworkMarker.lxye();
        je$FireworkMarker.lxyf();
    }

    private static /* synthetic */ void lxye() {
        je$FireworkMarker.lxtm[0] = -1403099969066725185L;
        je$FireworkMarker.lxtm[1] = -4339435463977757575L;
        je$FireworkMarker.lxtm[2] = 9197347736862604088L;
        je$FireworkMarker.lxtm[3] = 1278588393013743344L;
        je$FireworkMarker.lxtm[4] = -3491833432008122303L;
        je$FireworkMarker.lxtm[5] = -7860783267956875302L;
        je$FireworkMarker.lxtm[6] = -252715864686913287L;
        je$FireworkMarker.lxtm[7] = -8553237116737517917L;
        je$FireworkMarker.lxtm[8] = 2446228773091785606L;
        je$FireworkMarker.lxtm[9] = -118196972039561248L;
        je$FireworkMarker.lxtm[10] = 2560122053275362708L;
        je$FireworkMarker.lxtm[11] = -984089541577497067L;
        je$FireworkMarker.lxtm[12] = -5513598282111621294L;
        je$FireworkMarker.lxtm[13] = -1356788102642096626L;
        je$FireworkMarker.lxtm[14] = 2470544736217763624L;
        je$FireworkMarker.lxtm[15] = 8510876678961413475L;
        je$FireworkMarker.lxtm[16] = -6523858307486244905L;
        je$FireworkMarker.lxtm[17] = 2006219390615248587L;
        je$FireworkMarker.lxtm[18] = 7519777993785715723L;
        je$FireworkMarker.lxtm[19] = 5394087923322137338L;
        je$FireworkMarker.lxtm[20] = -8690070150310594619L;
        je$FireworkMarker.lxtm[21] = 1710269158589814208L;
        je$FireworkMarker.lxtm[22] = -3832534901550285077L;
        je$FireworkMarker.lxtm[23] = 8825809131922008826L;
        je$FireworkMarker.lxtm[24] = -1371862324455379116L;
        je$FireworkMarker.lxtm[25] = -9054853098808770517L;
        je$FireworkMarker.lxtm[26] = -6714332816528663312L;
        je$FireworkMarker.lxtm[27] = -1000853576734192050L;
        je$FireworkMarker.lxtm[28] = -4331660221272962074L;
        je$FireworkMarker.lxtm[29] = 671884885119268519L;
        je$FireworkMarker.lxtm[30] = -1892305347055723790L;
        je$FireworkMarker.lxtm[31] = -8771572055401855569L;
        je$FireworkMarker.lxtm[32] = 8894801515517958495L;
        je$FireworkMarker.lxtm[33] = -8458204592687488313L;
        je$FireworkMarker.lxtm[34] = -6781137996524413454L;
        je$FireworkMarker.lxtm[35] = -6744255716863093652L;
        je$FireworkMarker.lxtm[36] = 2772326280156259648L;
        je$FireworkMarker.lxtm[37] = -5779253074296573459L;
        je$FireworkMarker.lxtm[38] = -6186741258594738476L;
        je$FireworkMarker.lxtm[39] = -9050419907747894200L;
        je$FireworkMarker.lxtm[40] = -7432068121635869624L;
        je$FireworkMarker.lxtm[41] = 5372028974766510421L;
        je$FireworkMarker.lxtm[42] = -2093623544663800007L;
        je$FireworkMarker.lxtm[43] = -6360299757885762283L;
        je$FireworkMarker.lxtm[44] = -4893160035581218614L;
        je$FireworkMarker.lxtm[45] = 8064104014826110268L;
        je$FireworkMarker.lxtm[46] = 3399807438458702279L;
        je$FireworkMarker.lxtm[47] = 4804837391764344690L;
        je$FireworkMarker.lxtm[48] = 4648311892519907925L;
        je$FireworkMarker.lxtm[49] = 7866037683976290160L;
        je$FireworkMarker.lxtm[50] = 7335075153526667299L;
    }

    private static /* synthetic */ int lxte(int n2) {
        return lxtf[n2] ^ lxtg[n2];
    }
}

