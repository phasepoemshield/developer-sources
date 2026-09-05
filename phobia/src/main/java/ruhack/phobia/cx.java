/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_243
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.minecraft.class_243;
import ruhack.phobia.az;

public class cx
implements az {
    private static int[] dqzz;
    private static long[] dqzi;
    public static final boolean c;
    protected static final long it = 4789512391139903967L;
    private class_243 velocity;
    private static long[] dqzh;
    private final float yaw;
    private final class_243 movementInput;
    public static final int b;
    private final float speed;
    private static int[] dqzy;
    public static final boolean a;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public float getYaw() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = cx.it - cx.dqzj("draw", dqzg(int ), (int)21)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == cx.dqzj("drax", dqzx(int ), (int)13)) break;
            v0 /* !! */  = (long)cx.dqzj("dray", dqzx(int ), (int)14);
        }
        var3_1 = cx.c;
        v1 /* !! */  = cx.it;
        if (true) ** GOTO lbl12
        block11: while (true) {
            v1 /* !! */  = (long)(cx.dqzj("drba", dqzg(int ), (int)23) - cx.dqzj("draz", dqzg(int ), (int)22));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1715016083: {
                    continue block11;
                }
                case -784741921: {
                    break block11;
                }
            }
            break;
        }
        var2_2 /* !! */  = cx.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = cx.it - cx.dqzj("drbb", dqzg(int ), (int)24)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == cx.dqzj("drbc", dqzx(int ), (int)15)) break;
            v2 /* !! */  = (long)cx.dqzj("drbd", dqzx(int ), (int)16);
        }
        var1_3 = cx.a;
        if (var3_1) {
            throw null;
lbl27:
            // 1 sources

            return (float)cx.dqzj("drbe", dran(int ), (int)17);
        }
        ** while (var1_3 || var1_3)
lbl30:
        // 1 sources

        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = cx.it - cx.dqzj("drbf", dqzg(int ), (int)25)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == cx.dqzj("drbg", dqzx(int ), (int)18)) break;
                    v3 /* !! */  = (long)cx.dqzj("drbh", dqzx(int ), (int)19);
                }
                return this.yaw;
            }
            case 0: {
                var2_2 /* !! */  = (int)cx.dqzj("drbi", dqzx(int ), (int)20);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl50
            }
            case 1: {
                do {
                    var2_2 /* !! */  = (int)cx.dqzj("drbj", dqzx(int ), (int)21);
                } while (!var3_1);
                throw null;
            }
lbl50:
            // 2 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)cx.dqzj("drbk", dqzx(int ), (int)22);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)cx.dqzj("drbl", dqzx(int ), (int)23);
        ** while (!var3_1)
lbl58:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ int dqzx(int n2) {
        return dqzy[n2] ^ dqzz[n2];
    }

    private static /* synthetic */ void drcw() {
        cx.dqzy[0] = 949038601;
        cx.dqzy[1] = 544810364;
        cx.dqzy[2] = 470582973;
        cx.dqzy[3] = -525431769;
        cx.dqzy[4] = 655715119;
        cx.dqzy[5] = 248131652;
        cx.dqzy[6] = -1580353450;
        cx.dqzy[7] = -800650508;
        cx.dqzy[8] = 238381118;
        cx.dqzy[9] = 731529588;
        cx.dqzy[10] = -1292718795;
        cx.dqzy[11] = -2129026030;
        cx.dqzy[12] = 2138509528;
        cx.dqzy[13] = 2107616604;
        cx.dqzy[14] = 1300904390;
        cx.dqzy[15] = 724388933;
        cx.dqzy[16] = 1143447347;
        cx.dqzy[17] = -1911447741;
        cx.dqzy[18] = 405717567;
        cx.dqzy[19] = -1274931661;
        cx.dqzy[20] = 109577528;
        cx.dqzy[21] = -1853193382;
        cx.dqzy[22] = 1626766254;
        cx.dqzy[23] = -909203556;
        cx.dqzy[24] = 181279358;
        cx.dqzy[25] = -2098390285;
        cx.dqzy[26] = 750080393;
        cx.dqzy[27] = -1189187148;
        cx.dqzy[28] = 2082666463;
        cx.dqzy[29] = 320727928;
        cx.dqzy[30] = 917182590;
        cx.dqzy[31] = -1834387921;
        cx.dqzy[32] = -1506582070;
        cx.dqzy[33] = 1596399951;
        cx.dqzy[34] = 723424489;
        cx.dqzy[35] = -312155089;
        cx.dqzy[36] = -1964341768;
        cx.dqzy[37] = -1509075838;
        cx.dqzy[38] = 1223546663;
        cx.dqzy[39] = -500520573;
        cx.dqzy[40] = -698562021;
        cx.dqzy[41] = 1547597765;
        cx.dqzy[42] = -710833216;
        cx.dqzy[43] = -1721427819;
    }

    static {
        dqzy = new int[44];
        dqzz = new int[44];
        cx.drcw();
        cx.drcx();
        dqzh = new long[42];
        dqzi = new long[42];
        cx.drcy();
        cx.drcz();
    }

    private static /* synthetic */ void drcy() {
        cx.dqzh[0] = -8881018371260012701L;
        cx.dqzh[1] = -8609238255862867969L;
        cx.dqzh[2] = 9204091244988033015L;
        cx.dqzh[3] = 1058715328257332521L;
        cx.dqzh[4] = 2614358797125071677L;
        cx.dqzh[5] = 1677761205956842224L;
        cx.dqzh[6] = 3759308412070289225L;
        cx.dqzh[7] = 5012790321333327152L;
        cx.dqzh[8] = -5652816378894121422L;
        cx.dqzh[9] = -7438697354662692319L;
        cx.dqzh[10] = -8377173143957622504L;
        cx.dqzh[11] = 4511461320236157504L;
        cx.dqzh[12] = -6804190240140649649L;
        cx.dqzh[13] = -7843332966686584934L;
        cx.dqzh[14] = 7686201155364538265L;
        cx.dqzh[15] = 4843327574807037963L;
        cx.dqzh[16] = 5957724556094280433L;
        cx.dqzh[17] = -4288233486156475583L;
        cx.dqzh[18] = -2965492456036301613L;
        cx.dqzh[19] = -3253567147187009763L;
        cx.dqzh[20] = -479087862580008548L;
        cx.dqzh[21] = 8160098857744536451L;
        cx.dqzh[22] = -6814576821413124318L;
        cx.dqzh[23] = 5535216034543739626L;
        cx.dqzh[24] = -343921454230450864L;
        cx.dqzh[25] = -6255912568433945413L;
        cx.dqzh[26] = -8741631513340554092L;
        cx.dqzh[27] = -5261936266838595138L;
        cx.dqzh[28] = -4714897313536216681L;
        cx.dqzh[29] = -1463130870879237682L;
        cx.dqzh[30] = 3686795563249801221L;
        cx.dqzh[31] = 8445342100065561146L;
        cx.dqzh[32] = 6458055841120361425L;
        cx.dqzh[33] = -1052759923568657720L;
        cx.dqzh[34] = -7680276273802612860L;
        cx.dqzh[35] = -590186424855877581L;
        cx.dqzh[36] = -9028510992316897221L;
        cx.dqzh[37] = -3508981175716454911L;
        cx.dqzh[38] = -4193447197020862937L;
        cx.dqzh[39] = 7883405800057214054L;
        cx.dqzh[40] = -7339205657713758572L;
        cx.dqzh[41] = 3556607474314671098L;
    }

    public static /* synthetic */ CallSite dqzj(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public class_243 getVelocity() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = cx.it - cx.dqzj("drbm", dqzg(int ), (int)26)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == cx.dqzj("drbn", dqzx(int ), (int)24)) break;
            v0 /* !! */  = (long)cx.dqzj("drbo", dqzx(int ), (int)25);
        }
        var3_1 = cx.c;
        v1 /* !! */  = cx.it;
        if (true) ** GOTO lbl12
        block16: while (true) {
            v1 /* !! */  = (long)(v2 - cx.dqzj("drbp", dqzg(int ), (int)27));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -784741921: {
                    break block16;
                }
                case -576541333: {
                    v2 = cx.dqzj("drbq", dqzg(int ), (int)28);
                    continue block16;
                }
                case -390531083: {
                    v2 = cx.dqzj("drbr", dqzg(int ), (int)29);
                    continue block16;
                }
            }
            break;
        }
        var2_2 = cx.b;
        v3 /* !! */  = cx.it;
        if (true) ** GOTO lbl26
        block17: while (true) {
            v3 /* !! */  = (long)(v4 - cx.dqzj("drbs", dqzg(int ), (int)30));
lbl26:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1032028313: {
                    v4 = cx.dqzj("drbt", dqzg(int ), (int)31);
                    continue block17;
                }
                case -787216840: {
                    v4 = cx.dqzj("drbu", dqzg(int ), (int)32);
                    continue block17;
                }
                case -784741921: {
                    break block17;
                }
                case 1121689674: {
                    v4 = cx.dqzj("drbv", dqzg(int ), (int)33);
                    continue block17;
                }
            }
            break;
        }
        var1_3 = cx.a;
        if (var3_1) {
            throw null;
lbl41:
            // 1 sources

            return null;
        }
        ** while (var1_3 || var1_3)
lbl44:
        // 1 sources

        v5 /* !! */  = cx.it;
        if (true) ** GOTO lbl48
        block19: while (true) {
            v5 /* !! */  = (long)(cx.dqzj("drbx", dqzg(int ), (int)35) - cx.dqzj("drbw", dqzg(int ), (int)34));
lbl48:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -784741921: {
                    break block19;
                }
                case -769150091: {
                    continue block19;
                }
            }
            break;
        }
        return this.velocity;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void setVelocity(class_243 var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = cx.it - cx.dqzj("drcc", dqzg(int ), (int)36)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == cx.dqzj("drcd", dqzx(int ), (int)30)) break;
            v0 /* !! */  = (long)cx.dqzj("drce", dqzx(int ), (int)31);
        }
        var4_2 = cx.c;
        v1 /* !! */  = cx.it;
        if (true) ** GOTO lbl11
        block16: while (true) {
            v1 /* !! */  = (long)(cx.dqzj("drcg", dqzg(int ), (int)38) - cx.dqzj("drcf", dqzg(int ), (int)37));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -784741921: {
                    break block16;
                }
                case 989346508: {
                    continue block16;
                }
            }
            break;
        }
        var3_3 /* !! */  = cx.b;
        v2 /* !! */  = cx.it;
        if (true) ** GOTO lbl21
        block17: while (true) {
            v2 /* !! */  = (long)(cx.dqzj("drci", dqzg(int ), (int)40) - cx.dqzj("drch", dqzg(int ), (int)39));
lbl21:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -784741921: {
                    break block17;
                }
                case -254569194: {
                    continue block17;
                }
            }
            break;
        }
        var2_4 = cx.a;
        if (var4_2) {
            throw null;
lbl29:
            // 3 sources

            return;
        }
        if (var2_4) ** GOTO lbl29
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** GOTO lbl29
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_1 = cx.it - cx.dqzj("drcj", dqzg(int ), (int)41)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == cx.dqzj("drck", dqzx(int ), (int)32)) break;
                    v3 /* !! */  = (long)cx.dqzj("drcl", dqzx(int ), (int)33);
                }
                this.velocity = var1_1;
                if (var2_4) ** continue;
                return;
            }
lbl44:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)cx.dqzj("drcm", dqzx(int ), (int)34);
                if (var4_2) {
                    throw null;
                }
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)cx.dqzj("drcn", dqzx(int ), (int)35);
                    if (!var4_2) ** GOTO lbl44
                    throw null;
                }
            }
            case 2: {
                var3_3 /* !! */  = (int)cx.dqzj("drco", dqzx(int ), (int)36);
                if (!var4_2) break;
                throw null;
            }
            case 3: {
                var3_3 /* !! */  = (int)cx.dqzj("drcp", dqzx(int ), (int)37);
                if (!var4_2) break;
                throw null;
            }
            case 4: 
        }
        var3_3 /* !! */  = (int)cx.dqzj("drcq", dqzx(int ), (int)38);
        ** while (!var4_2)
lbl64:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void drcz() {
        cx.dqzi[0] = -7425036617205926184L;
        cx.dqzi[1] = 8521828514285270954L;
        cx.dqzi[2] = -5330577563719849207L;
        cx.dqzi[3] = -595649727173547576L;
        cx.dqzi[4] = -5778201079883147651L;
        cx.dqzi[5] = 4983645569857970512L;
        cx.dqzi[6] = 7927784007309479532L;
        cx.dqzi[7] = 4220101571685036242L;
        cx.dqzi[8] = -3410018620978326373L;
        cx.dqzi[9] = -4659432303933841679L;
        cx.dqzi[10] = -5576681304793495751L;
        cx.dqzi[11] = -3281659840339588008L;
        cx.dqzi[12] = -3130286673780246036L;
        cx.dqzi[13] = 2743770126321193147L;
        cx.dqzi[14] = -5613331313100057250L;
        cx.dqzi[15] = 7810296670383872695L;
        cx.dqzi[16] = 743026638515414401L;
        cx.dqzi[17] = -7308765892601576595L;
        cx.dqzi[18] = -8415541967669083508L;
        cx.dqzi[19] = -3971957668182032949L;
        cx.dqzi[20] = -480842440252934174L;
        cx.dqzi[21] = -1230433672772497335L;
        cx.dqzi[22] = -3174355696835110468L;
        cx.dqzi[23] = 3563339657399548452L;
        cx.dqzi[24] = 4956541777364642666L;
        cx.dqzi[25] = 6679750920531156752L;
        cx.dqzi[26] = 2551620475130031823L;
        cx.dqzi[27] = -211713101372533017L;
        cx.dqzi[28] = -2356689613426295554L;
        cx.dqzi[29] = -3578748542001163067L;
        cx.dqzi[30] = -6629264033762277592L;
        cx.dqzi[31] = -5365962930951966142L;
        cx.dqzi[32] = -2052103296299827938L;
        cx.dqzi[33] = -446229637211360185L;
        cx.dqzi[34] = 6804725257893178121L;
        cx.dqzi[35] = -2540226868568344998L;
        cx.dqzi[36] = 2696430625009935754L;
        cx.dqzi[37] = -3426480049138177870L;
        cx.dqzi[38] = 8307406126143412703L;
        cx.dqzi[39] = -549984214617410402L;
        cx.dqzi[40] = -3158835136735096997L;
        cx.dqzi[41] = -979758946411018577L;
    }

    private static /* synthetic */ void drcx() {
        cx.dqzz[0] = -949038602;
        cx.dqzz[1] = -139115283;
        cx.dqzz[2] = 470582972;
        cx.dqzz[3] = -525431771;
        cx.dqzz[4] = 655715119;
        cx.dqzz[5] = 248131655;
        cx.dqzz[6] = -1634817065;
        cx.dqzz[7] = -800650507;
        cx.dqzz[8] = 658990353;
        cx.dqzz[9] = 731529590;
        cx.dqzz[10] = -1292718795;
        cx.dqzz[11] = -2129026032;
        cx.dqzz[12] = 2138509531;
        cx.dqzz[13] = 2107616605;
        cx.dqzz[14] = -1906122635;
        cx.dqzz[15] = 724388932;
        cx.dqzz[16] = -432661196;
        cx.dqzz[17] = -1334119169;
        cx.dqzz[18] = 405717566;
        cx.dqzz[19] = -12205516;
        cx.dqzz[20] = 109577529;
        cx.dqzz[21] = -1853193381;
        cx.dqzz[22] = 1626766254;
        cx.dqzz[23] = -909203553;
        cx.dqzz[24] = 181279359;
        cx.dqzz[25] = 2002472805;
        cx.dqzz[26] = 750080393;
        cx.dqzz[27] = -1189187146;
        cx.dqzz[28] = 2082666460;
        cx.dqzz[29] = 320727931;
        cx.dqzz[30] = 917182591;
        cx.dqzz[31] = 374429745;
        cx.dqzz[32] = -1506582069;
        cx.dqzz[33] = -229919040;
        cx.dqzz[34] = 723424493;
        cx.dqzz[35] = -312155090;
        cx.dqzz[36] = -1964341768;
        cx.dqzz[37] = -1509075837;
        cx.dqzz[38] = 1223546662;
        cx.dqzz[39] = -500520576;
        cx.dqzz[40] = -698562023;
        cx.dqzz[41] = 1547597764;
        cx.dqzz[42] = -710833214;
        cx.dqzz[43] = -1721427817;
    }

    private static /* synthetic */ long dqzg(int n2) {
        return dqzh[n2] ^ dqzi[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public float getSpeed() {
        v0 /* !! */  = cx.it;
        if (true) ** GOTO lbl5
        block19: while (true) {
            v0 /* !! */  = (long)(cx.dqzj("drah", dqzg(int ), (int)14) - cx.dqzj("drag", dqzg(int ), (int)13));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1057448016: {
                    continue block19;
                }
                case -784741921: {
                    break block19;
                }
            }
            break;
        }
        var3_1 = cx.c;
        v1 /* !! */  = cx.it;
        if (true) ** GOTO lbl15
        block20: while (true) {
            v1 /* !! */  = (long)(cx.dqzj("draj", dqzg(int ), (int)16) - cx.dqzj("drai", dqzg(int ), (int)15));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1129218353: {
                    continue block20;
                }
                case -784741921: {
                    break block20;
                }
            }
            break;
        }
        var2_2 /* !! */  = cx.b;
        v2 /* !! */  = cx.it;
        if (true) ** GOTO lbl25
        block21: while (true) {
            v2 /* !! */  = (long)(v3 - cx.dqzj("drak", dqzg(int ), (int)17));
lbl25:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -784741921: {
                    break block21;
                }
                case 247042210: {
                    v3 = cx.dqzj("dral", dqzg(int ), (int)18);
                    continue block21;
                }
                case 646631806: {
                    v3 = cx.dqzj("dram", dqzg(int ), (int)19);
                    continue block21;
                }
            }
            break;
        }
        var1_3 = cx.a;
        if (var3_1) {
            throw null;
lbl37:
            // 1 sources

            return (float)cx.dqzj("drao", dran(int ), (int)6);
        }
        ** while (var1_3 || var1_3)
lbl40:
        // 1 sources

        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block13 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_0 = cx.it - cx.dqzj("drap", dqzg(int ), (int)20)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == cx.dqzj("draq", dqzx(int ), (int)7)) break;
                    v4 /* !! */  = (long)cx.dqzj("drar", dqzx(int ), (int)8);
                }
                return this.speed;
            }
            case 0: {
                var2_2 /* !! */  = (int)cx.dqzj("dras", dqzx(int ), (int)9);
                if (!var3_1) break;
                throw null;
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)cx.dqzj("drat", dqzx(int ), (int)10);
                    if (!var3_1) break block13;
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)cx.dqzj("drau", dqzx(int ), (int)11);
                if (!var3_1) break;
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)cx.dqzj("drav", dqzx(int ), (int)12);
        ** while (!var3_1)
lbl66:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public class_243 getMovementInput() {
        v0 /* !! */  = cx.it;
        if (true) ** GOTO lbl5
        block24: while (true) {
            v0 /* !! */  = (long)(v1 - cx.dqzj("dqzk", dqzg(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1888004739: {
                    v1 = cx.dqzj("dqzl", dqzg(int ), (int)1);
                    continue block24;
                }
                case -1625731920: {
                    v1 = cx.dqzj("dqzm", dqzg(int ), (int)2);
                    continue block24;
                }
                case -973960945: {
                    v1 = cx.dqzj("dqzn", dqzg(int ), (int)3);
                    continue block24;
                }
                case -784741921: {
                    break block24;
                }
            }
            break;
        }
        var3_1 = cx.c;
        v2 /* !! */  = cx.it;
        if (true) ** GOTO lbl22
        block25: while (true) {
            v2 /* !! */  = (long)(v3 - cx.dqzj("dqzo", dqzg(int ), (int)4));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -784741921: {
                    break block25;
                }
                case -741275082: {
                    v3 = cx.dqzj("dqzp", dqzg(int ), (int)5);
                    continue block25;
                }
                case 113196829: {
                    v3 = cx.dqzj("dqzq", dqzg(int ), (int)6);
                    continue block25;
                }
                case 2140548467: {
                    v3 = cx.dqzj("dqzr", dqzg(int ), (int)7);
                    continue block25;
                }
            }
            break;
        }
        var2_2 /* !! */  = cx.b;
        v4 /* !! */  = cx.it;
        if (true) ** GOTO lbl39
        block26: while (true) {
            v4 /* !! */  = (long)(v5 - cx.dqzj("dqzs", dqzg(int ), (int)8));
lbl39:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -784741921: {
                    break block26;
                }
                case 379967450: {
                    v5 = cx.dqzj("dqzt", dqzg(int ), (int)9);
                    continue block26;
                }
                case 901398502: {
                    v5 = cx.dqzj("dqzu", dqzg(int ), (int)10);
                    continue block26;
                }
                case 1191639111: {
                    v5 = cx.dqzj("dqzv", dqzg(int ), (int)11);
                    continue block26;
                }
            }
            break;
        }
        var1_3 = cx.a;
        if (var3_1) {
            throw null;
        }
        if (!var1_3 && !var1_3) ** GOTO lbl59
        if (var2_2 /* !! */  == 0) return null;
        switch (var2_2 /* !! */ ) {
            default: {
                return null;
            }
lbl59:
            // 1 sources

            while (true) {
                if ((v6 /* !! */  = (cfr_temp_0 = cx.it - cx.dqzj("dqzw", dqzg(int ), (int)12)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v6 /* !! */  == cx.dqzj("draa", dqzx(int ), (int)0)) {
                    return this.movementInput;
                }
                v6 /* !! */  = (long)cx.dqzj("drab", dqzx(int ), (int)1);
            }
            case 1: {
                ** GOTO lbl72
            }
            case 3: {
                var2_2 /* !! */  = (int)cx.dqzj("draf", dqzx(int ), (int)5);
                if (var3_1) {
                    throw null;
                }
lbl72:
                // 3 sources

                var2_2 /* !! */  = (int)cx.dqzj("drad", dqzx(int ), (int)3);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)cx.dqzj("drae", dqzx(int ), (int)4);
                if (var3_1) {
                    throw null;
                }
            }
            case 0: 
        }
        do {
            var2_2 /* !! */  = (int)cx.dqzj("drac", dqzx(int ), (int)2);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ float dran(int n2) {
        return Float.intBitsToFloat(dqzy[n2] ^ dqzz[n2]);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public cx(class_243 var1_1, float var2_2, float var3_3, class_243 var4_4) {
        var6_5 /* !! */  = cx.b;
        var5_6 = cx.a;
        super();
        if (var6_5 /* !! */  == 0) ** GOTO lbl-1000
        switch (var6_5 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.movementInput = var1_1;
                this.speed = var2_2;
                this.yaw = var3_3;
                this.velocity = var4_4;
                return;
            }
lbl12:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var6_5 /* !! */  = (int)cx.dqzj("drcr", dqzx(int ), (int)39);
                    ** GOTO lbl19
                    break;
                }
            }
            case 1: {
                var6_5 /* !! */  = (int)cx.dqzj("drcs", dqzx(int ), (int)40);
                break;
            }
lbl19:
            // 2 sources

            case 2: {
                while (true) {
                    var6_5 /* !! */  = (int)cx.dqzj("drct", dqzx(int ), (int)41);
                }
            }
            case 3: {
                var6_5 /* !! */  = (int)cx.dqzj("drcu", dqzx(int ), (int)42);
                ** GOTO lbl12
            }
            case 4: 
        }
        var6_5 /* !! */  = (int)cx.dqzj("drcv", dqzx(int ), (int)43);
        ** while (true)
    }
}

