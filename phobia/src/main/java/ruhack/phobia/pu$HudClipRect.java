/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.runtime.ObjectMethods
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.runtime.ObjectMethods;

public record pu$HudClipRect(float width, float y, float x, float height) {
    private static int[] iqb;
    private final float width;
    private static long[] iqi;
    private static int[] iqa;
    protected static final long al = -9004873613393588846L;
    public static final boolean a;
    private final float y;
    public static final boolean c;
    public static final int b;
    private static long[] iqj;
    private final float x;
    private final float height;

    private static /* synthetic */ void iuw() {
        pu$HudClipRect.iqb[0] = -21407199;
        pu$HudClipRect.iqb[1] = 177058310;
        pu$HudClipRect.iqb[2] = 1078314382;
        pu$HudClipRect.iqb[3] = 1202662502;
        pu$HudClipRect.iqb[4] = -1901822719;
        pu$HudClipRect.iqb[5] = -1752616487;
        pu$HudClipRect.iqb[6] = -1824993973;
        pu$HudClipRect.iqb[7] = -1967739702;
        pu$HudClipRect.iqb[8] = 1260117447;
        pu$HudClipRect.iqb[9] = 1409395775;
        pu$HudClipRect.iqb[10] = -1373624636;
        pu$HudClipRect.iqb[11] = 1842997859;
        pu$HudClipRect.iqb[12] = -1307272300;
        pu$HudClipRect.iqb[13] = 1155269163;
        pu$HudClipRect.iqb[14] = -1610506624;
        pu$HudClipRect.iqb[15] = -1266467325;
        pu$HudClipRect.iqb[16] = 1042324950;
        pu$HudClipRect.iqb[17] = -144674311;
        pu$HudClipRect.iqb[18] = -608046375;
        pu$HudClipRect.iqb[19] = 1709260528;
        pu$HudClipRect.iqb[20] = -517654812;
        pu$HudClipRect.iqb[21] = 1852106333;
        pu$HudClipRect.iqb[22] = 891585831;
        pu$HudClipRect.iqb[23] = -935356402;
        pu$HudClipRect.iqb[24] = 1756736556;
        pu$HudClipRect.iqb[25] = -532298939;
        pu$HudClipRect.iqb[26] = -1647483209;
        pu$HudClipRect.iqb[27] = -2060485354;
        pu$HudClipRect.iqb[28] = 1517829686;
        pu$HudClipRect.iqb[29] = -482708895;
        pu$HudClipRect.iqb[30] = -1806566509;
        pu$HudClipRect.iqb[31] = -445992164;
        pu$HudClipRect.iqb[32] = -1133225536;
        pu$HudClipRect.iqb[33] = 629200471;
        pu$HudClipRect.iqb[34] = 1475107158;
        pu$HudClipRect.iqb[35] = -1575648539;
        pu$HudClipRect.iqb[36] = 1770716286;
        pu$HudClipRect.iqb[37] = 1949540372;
        pu$HudClipRect.iqb[38] = -2058742690;
        pu$HudClipRect.iqb[39] = -674759290;
        pu$HudClipRect.iqb[40] = 1707187600;
        pu$HudClipRect.iqb[41] = -565906104;
        pu$HudClipRect.iqb[42] = 2003631383;
        pu$HudClipRect.iqb[43] = 1008797786;
        pu$HudClipRect.iqb[44] = -1408333240;
        pu$HudClipRect.iqb[45] = 1421767399;
        pu$HudClipRect.iqb[46] = -1961424058;
        pu$HudClipRect.iqb[47] = -1061327440;
        pu$HudClipRect.iqb[48] = 361249440;
        pu$HudClipRect.iqb[49] = 1643865990;
        pu$HudClipRect.iqb[50] = 906586676;
        pu$HudClipRect.iqb[51] = -471432557;
        pu$HudClipRect.iqb[52] = -1595765784;
        pu$HudClipRect.iqb[53] = -1502515058;
        pu$HudClipRect.iqb[54] = 972962304;
        pu$HudClipRect.iqb[55] = -1278287711;
        pu$HudClipRect.iqb[56] = 1022582311;
        pu$HudClipRect.iqb[57] = -1370532629;
        pu$HudClipRect.iqb[58] = 638352508;
        pu$HudClipRect.iqb[59] = 1071719490;
        pu$HudClipRect.iqb[60] = 1927743028;
        pu$HudClipRect.iqb[61] = 722388527;
        pu$HudClipRect.iqb[62] = -1658678669;
        pu$HudClipRect.iqb[63] = 695556351;
        pu$HudClipRect.iqb[64] = -406767652;
        pu$HudClipRect.iqb[65] = -565825022;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final int hashCode() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = pu$HudClipRect.al - pu$HudClipRect.iqc("iqz", iqh(int ), (int)9)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == pu$HudClipRect.iqc("ira", ipz(int ), (int)10)) break;
            v0 /* !! */  = (long)pu$HudClipRect.iqc("irb", ipz(int ), (int)11);
        }
        var3_1 = pu$HudClipRect.c;
        v1 /* !! */  = pu$HudClipRect.al;
        if (true) ** GOTO lbl12
        block16: while (true) {
            v1 /* !! */  = (long)(v2 - pu$HudClipRect.iqc("irc", iqh(int ), (int)10));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1839002222: {
                    break block16;
                }
                case -1477882227: {
                    v2 = pu$HudClipRect.iqc("ird", iqh(int ), (int)11);
                    continue block16;
                }
                case 1880920096: {
                    v2 = pu$HudClipRect.iqc("ire", iqh(int ), (int)12);
                    continue block16;
                }
            }
            break;
        }
        var2_2 /* !! */  = pu$HudClipRect.b;
        v3 /* !! */  = pu$HudClipRect.al;
        if (true) ** GOTO lbl26
        block17: while (true) {
            v3 /* !! */  = (long)(pu$HudClipRect.iqc("irg", iqh(int ), (int)14) - pu$HudClipRect.iqc("irf", iqh(int ), (int)13));
lbl26:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1839002222: {
                    break block17;
                }
                case 829747985: {
                    continue block17;
                }
            }
            break;
        }
        var1_3 = pu$HudClipRect.a;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block9 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_1) {
                    throw null;
                    return (int)pu$HudClipRect.iqc("irh", ipz(int ), (int)12);
                }
                if (var1_3 || var1_3) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_1 = pu$HudClipRect.al - pu$HudClipRect.iqc("iri", iqh(int ), (int)15)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == pu$HudClipRect.iqc("irj", ipz(int ), (int)13)) break;
                    v4 /* !! */  = (long)pu$HudClipRect.iqc("irk", ipz(int ), (int)14);
                }
                return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{pu$HudClipRect.class, "x;y;width;height", "x", "y", "width", "height"}, this);
            }
            case 0: {
                var2_2 /* !! */  = (int)pu$HudClipRect.iqc("irl", ipz(int ), (int)15);
                if (var3_1) {
                    throw null;
                }
            }
lbl51:
            // 4 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)pu$HudClipRect.iqc("irm", ipz(int ), (int)16);
                    if (!var3_1) break block9;
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)pu$HudClipRect.iqc("irn", ipz(int ), (int)17);
                if (!var3_1) ** GOTO lbl51
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)pu$HudClipRect.iqc("iro", ipz(int ), (int)18);
        ** while (!var3_1)
lbl63:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void iuy() {
        pu$HudClipRect.iqj[0] = -1416116738944153214L;
        pu$HudClipRect.iqj[1] = -3217581225230142082L;
        pu$HudClipRect.iqj[2] = -7677692694755279676L;
        pu$HudClipRect.iqj[3] = -4386751273935230987L;
        pu$HudClipRect.iqj[4] = 6838564400427914279L;
        pu$HudClipRect.iqj[5] = -1291521498263995074L;
        pu$HudClipRect.iqj[6] = -4574290283437538591L;
        pu$HudClipRect.iqj[7] = -3616870393821692310L;
        pu$HudClipRect.iqj[8] = 2269091856695092364L;
        pu$HudClipRect.iqj[9] = -6042104408261274791L;
        pu$HudClipRect.iqj[10] = 1062353579110403871L;
        pu$HudClipRect.iqj[11] = 5487573279505900986L;
        pu$HudClipRect.iqj[12] = 4783172657778653657L;
        pu$HudClipRect.iqj[13] = 6545269785093669026L;
        pu$HudClipRect.iqj[14] = -4759344940266710311L;
        pu$HudClipRect.iqj[15] = -3001246073036602156L;
        pu$HudClipRect.iqj[16] = 5219032236293183630L;
        pu$HudClipRect.iqj[17] = -8915655908870362183L;
        pu$HudClipRect.iqj[18] = 1473919007674485979L;
        pu$HudClipRect.iqj[19] = -4693126422099389565L;
        pu$HudClipRect.iqj[20] = -5715863701199971286L;
        pu$HudClipRect.iqj[21] = 4217829877486767928L;
        pu$HudClipRect.iqj[22] = -3154099701032344148L;
        pu$HudClipRect.iqj[23] = -3632958002752839477L;
        pu$HudClipRect.iqj[24] = -7883832515974813358L;
        pu$HudClipRect.iqj[25] = 3739259131642174967L;
        pu$HudClipRect.iqj[26] = -8015626524259007577L;
        pu$HudClipRect.iqj[27] = 1584587099587520152L;
        pu$HudClipRect.iqj[28] = 8800166736506611551L;
        pu$HudClipRect.iqj[29] = 8701854057632047173L;
        pu$HudClipRect.iqj[30] = 1518221804735684607L;
        pu$HudClipRect.iqj[31] = -5527594591354098172L;
        pu$HudClipRect.iqj[32] = 3725504061327174469L;
        pu$HudClipRect.iqj[33] = -8291197705693820598L;
        pu$HudClipRect.iqj[34] = 2865144682147229744L;
        pu$HudClipRect.iqj[35] = -3199107486419452657L;
        pu$HudClipRect.iqj[36] = 5023755853894405850L;
        pu$HudClipRect.iqj[37] = -1674913751687714006L;
        pu$HudClipRect.iqj[38] = -4337143762985394841L;
        pu$HudClipRect.iqj[39] = 2422648738618036709L;
        pu$HudClipRect.iqj[40] = -2726375230773111682L;
        pu$HudClipRect.iqj[41] = -7273440795932170831L;
        pu$HudClipRect.iqj[42] = 5934215319906194816L;
        pu$HudClipRect.iqj[43] = 1096341444061453497L;
        pu$HudClipRect.iqj[44] = -8596973413275543219L;
        pu$HudClipRect.iqj[45] = 5215401367404292336L;
        pu$HudClipRect.iqj[46] = -1040587225546514033L;
        pu$HudClipRect.iqj[47] = -7616982482116508718L;
        pu$HudClipRect.iqj[48] = 7799784154899354541L;
        pu$HudClipRect.iqj[49] = -4716671916505865843L;
        pu$HudClipRect.iqj[50] = 9177032267908687344L;
        pu$HudClipRect.iqj[51] = -5959499939207208690L;
    }

    private static /* synthetic */ float iso(int n2) {
        return Float.intBitsToFloat(iqa[n2] ^ iqb[n2]);
    }

    /*
     * Enabled aggressive block sorting
     */
    public float x() {
        boolean bl2;
        while (true) {
            long l2;
            Object object;
            if ((object = (l2 = al - pu$HudClipRect.iqc("isf", iqh(int ), (int)23)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object == pu$HudClipRect.iqc("isg", ipz(int ), (int)28)) break;
            object = pu$HudClipRect.iqc("ish", ipz(int ), (int)29);
        }
        boolean bl3 = c;
        while (true) {
            long l3;
            Object object;
            if ((object = (l3 = al - pu$HudClipRect.iqc("isi", iqh(int ), (int)24)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object == pu$HudClipRect.iqc("isj", ipz(int ), (int)30)) break;
            object = pu$HudClipRect.iqc("isk", ipz(int ), (int)31);
        }
        int n2 = b;
        while (true) {
            long l4;
            Object object;
            if ((object = (l4 = al - pu$HudClipRect.iqc("isl", iqh(int ), (int)25)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            if (object == pu$HudClipRect.iqc("ism", ipz(int ), (int)32)) {
                bl2 = a;
                if (bl3) {
                    throw null;
                }
                break;
            }
            object = pu$HudClipRect.iqc("isn", ipz(int ), (int)33);
        }
        if (bl2) return (float)pu$HudClipRect.iqc("isp", iso(int ), (int)34);
        if (bl2) return (float)pu$HudClipRect.iqc("isp", iso(int ), (int)34);
        while (true) {
            long l5;
            Object object;
            if ((object = (l5 = al - pu$HudClipRect.iqc("isq", iqh(int ), (int)26)) == 0L ? 0 : (l5 < 0L ? -1 : 1)) == false) continue;
            if (object == pu$HudClipRect.iqc("isr", ipz(int ), (int)35)) {
                return this.x;
            }
            object = pu$HudClipRect.iqc("iss", ipz(int ), (int)36);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public pu$HudClipRect(float var1_1, float var2_2, float var3_3, float var4_4) {
        var6_5 /* !! */  = pu$HudClipRect.b;
        if (var6_5 /* !! */  == 0) ** GOTO lbl-1000
        block0 : switch (var6_5 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                super();
                this.x = var1_1;
                this.y = var2_2;
                this.width = var3_3;
                this.height = var4_4;
                return;
            }
            case 0: {
                var6_5 /* !! */  = (int)pu$HudClipRect.iqc("iqd", ipz(int ), (int)0);
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var6_5 /* !! */  = (int)pu$HudClipRect.iqc("iqe", ipz(int ), (int)1);
                    break block0;
                    break;
                }
            }
            case 2: {
                var6_5 /* !! */  = (int)pu$HudClipRect.iqc("iqf", ipz(int ), (int)2);
            }
            case 3: 
        }
        var6_5 /* !! */  = (int)pu$HudClipRect.iqc("iqg", ipz(int ), (int)3);
        ** while (true)
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public float width() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = pu$HudClipRect.al - pu$HudClipRect.iqc("itn", iqh(int ), (int)36)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == pu$HudClipRect.iqc("ito", ipz(int ), (int)48)) break;
            v0 /* !! */  = (long)pu$HudClipRect.iqc("itp", ipz(int ), (int)49);
        }
        var3_1 = pu$HudClipRect.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = pu$HudClipRect.al - pu$HudClipRect.iqc("itq", iqh(int ), (int)37)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == pu$HudClipRect.iqc("itr", ipz(int ), (int)50)) break;
            v1 /* !! */  = (long)pu$HudClipRect.iqc("its", ipz(int ), (int)51);
        }
        var2_2 /* !! */  = pu$HudClipRect.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = pu$HudClipRect.al - pu$HudClipRect.iqc("itt", iqh(int ), (int)38)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == pu$HudClipRect.iqc("itu", ipz(int ), (int)52)) break;
            v2 /* !! */  = (long)pu$HudClipRect.iqc("itv", ipz(int ), (int)53);
        }
        var1_3 = pu$HudClipRect.a;
        if (var3_1) {
            throw null;
lbl24:
            // 2 sources

            return (float)pu$HudClipRect.iqc("itw", iso(int ), (int)54);
        }
        if (var1_3) ** GOTO lbl24
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                v3 /* !! */  = pu$HudClipRect.al;
                if (true) ** GOTO lbl35
                block15: while (true) {
                    v3 /* !! */  = (long)(v4 - pu$HudClipRect.iqc("itx", iqh(int ), (int)39));
lbl35:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1839002222: {
                            break block15;
                        }
                        case 1072053113: {
                            v4 = pu$HudClipRect.iqc("ity", iqh(int ), (int)40);
                            continue block15;
                        }
                        case 1473694151: {
                            v4 = pu$HudClipRect.iqc("itz", iqh(int ), (int)41);
                            continue block15;
                        }
                    }
                    break;
                }
                return this.width;
            }
lbl45:
            // 2 sources

            case 0: {
                do {
                    var2_2 /* !! */  = (int)pu$HudClipRect.iqc("iua", ipz(int ), (int)55);
                } while (!var3_1);
                throw null;
            }
lbl50:
            // 2 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)pu$HudClipRect.iqc("iub", ipz(int ), (int)56);
                    if (!var3_1) ** GOTO lbl45
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)pu$HudClipRect.iqc("iuc", ipz(int ), (int)57);
                if (!var3_1) ** GOTO lbl50
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)pu$HudClipRect.iqc("iud", ipz(int ), (int)58);
        ** while (!var3_1)
lbl62:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void iuv() {
        pu$HudClipRect.iqa[0] = -21407198;
        pu$HudClipRect.iqa[1] = 177058308;
        pu$HudClipRect.iqa[2] = 1078314381;
        pu$HudClipRect.iqa[3] = 1202662501;
        pu$HudClipRect.iqa[4] = 1901822718;
        pu$HudClipRect.iqa[5] = 432399578;
        pu$HudClipRect.iqa[6] = -1824993976;
        pu$HudClipRect.iqa[7] = -1967739703;
        pu$HudClipRect.iqa[8] = 1260117445;
        pu$HudClipRect.iqa[9] = 1409395772;
        pu$HudClipRect.iqa[10] = 1373624635;
        pu$HudClipRect.iqa[11] = 1764713316;
        pu$HudClipRect.iqa[12] = -341433155;
        pu$HudClipRect.iqa[13] = -1155269164;
        pu$HudClipRect.iqa[14] = 946810312;
        pu$HudClipRect.iqa[15] = -1266467327;
        pu$HudClipRect.iqa[16] = 1042324951;
        pu$HudClipRect.iqa[17] = -144674309;
        pu$HudClipRect.iqa[18] = -608046375;
        pu$HudClipRect.iqa[19] = -1709260529;
        pu$HudClipRect.iqa[20] = -1820055059;
        pu$HudClipRect.iqa[21] = 1852106332;
        pu$HudClipRect.iqa[22] = -891585832;
        pu$HudClipRect.iqa[23] = 1791193847;
        pu$HudClipRect.iqa[24] = 1756736559;
        pu$HudClipRect.iqa[25] = -532298937;
        pu$HudClipRect.iqa[26] = -1647483212;
        pu$HudClipRect.iqa[27] = -2060485355;
        pu$HudClipRect.iqa[28] = -1517829687;
        pu$HudClipRect.iqa[29] = 206086942;
        pu$HudClipRect.iqa[30] = 1806566508;
        pu$HudClipRect.iqa[31] = 1207278463;
        pu$HudClipRect.iqa[32] = 1133225535;
        pu$HudClipRect.iqa[33] = 1117279109;
        pu$HudClipRect.iqa[34] = 1755639052;
        pu$HudClipRect.iqa[35] = 1575648538;
        pu$HudClipRect.iqa[36] = -1764897089;
        pu$HudClipRect.iqa[37] = 1949540375;
        pu$HudClipRect.iqa[38] = -2058742689;
        pu$HudClipRect.iqa[39] = -674759289;
        pu$HudClipRect.iqa[40] = 1707187600;
        pu$HudClipRect.iqa[41] = 565906103;
        pu$HudClipRect.iqa[42] = -1033697655;
        pu$HudClipRect.iqa[43] = 45174466;
        pu$HudClipRect.iqa[44] = -1408333238;
        pu$HudClipRect.iqa[45] = 1421767397;
        pu$HudClipRect.iqa[46] = -1961424057;
        pu$HudClipRect.iqa[47] = -1061327437;
        pu$HudClipRect.iqa[48] = -361249441;
        pu$HudClipRect.iqa[49] = 414978683;
        pu$HudClipRect.iqa[50] = -906586677;
        pu$HudClipRect.iqa[51] = -1477989979;
        pu$HudClipRect.iqa[52] = 1595765783;
        pu$HudClipRect.iqa[53] = -1111617272;
        pu$HudClipRect.iqa[54] = 111266199;
        pu$HudClipRect.iqa[55] = -1278287709;
        pu$HudClipRect.iqa[56] = 1022582308;
        pu$HudClipRect.iqa[57] = -1370532631;
        pu$HudClipRect.iqa[58] = 638352508;
        pu$HudClipRect.iqa[59] = 0xC86C6C;
        pu$HudClipRect.iqa[60] = -1927743029;
        pu$HudClipRect.iqa[61] = -609740267;
        pu$HudClipRect.iqa[62] = -1658678670;
        pu$HudClipRect.iqa[63] = 695556348;
        pu$HudClipRect.iqa[64] = -406767651;
        pu$HudClipRect.iqa[65] = -565825022;
    }

    public static /* synthetic */ CallSite iqc(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public float height() {
        Object object = al;
        boolean bl2 = true;
        block15: while (true) {
            CallSite callSite;
            if (!bl2 || (bl2 = false) || !true) {
                object = callSite - pu$HudClipRect.iqc("iue", iqh(int ), (int)42);
            }
            switch ((int)object) {
                case -1970057332: {
                    callSite = pu$HudClipRect.iqc("iuf", iqh(int ), (int)43);
                    continue block15;
                }
                case -1839002222: {
                    break block15;
                }
                case 1175695606: {
                    callSite = pu$HudClipRect.iqc("iug", iqh(int ), (int)44);
                    continue block15;
                }
            }
            break;
        }
        boolean bl3 = c;
        Object object2 = al;
        boolean bl4 = true;
        block16: while (true) {
            CallSite callSite;
            if (!bl4 || (bl4 = false) || !true) {
                object2 = callSite - pu$HudClipRect.iqc("iuh", iqh(int ), (int)45);
            }
            switch ((int)object2) {
                case -1839002222: {
                    break block16;
                }
                case -544051393: {
                    callSite = pu$HudClipRect.iqc("iui", iqh(int ), (int)46);
                    continue block16;
                }
                case -259344446: {
                    callSite = pu$HudClipRect.iqc("iuj", iqh(int ), (int)47);
                    continue block16;
                }
            }
            break;
        }
        int n2 = b;
        Object object3 = al;
        boolean bl5 = true;
        block17: while (true) {
            CallSite callSite;
            if (!bl5 || (bl5 = false) || !true) {
                object3 = callSite - pu$HudClipRect.iqc("iuk", iqh(int ), (int)48);
            }
            switch ((int)object3) {
                case -1839002222: {
                    break block17;
                }
                case -1608062451: {
                    callSite = pu$HudClipRect.iqc("iul", iqh(int ), (int)49);
                    continue block17;
                }
                case -134775041: {
                    callSite = pu$HudClipRect.iqc("ium", iqh(int ), (int)50);
                    continue block17;
                }
            }
            break;
        }
        boolean bl6 = a;
        if (bl3) {
            throw null;
        }
        if (bl6) return (float)pu$HudClipRect.iqc("iun", iso(int ), (int)59);
        if (bl6) return (float)pu$HudClipRect.iqc("iun", iso(int ), (int)59);
        while (true) {
            long l2;
            Object object4;
            if ((object4 = (l2 = al - pu$HudClipRect.iqc("iuo", iqh(int ), (int)51)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (object4 == pu$HudClipRect.iqc("iup", ipz(int ), (int)60)) {
                return this.height;
            }
            object4 = pu$HudClipRect.iqc("iuq", ipz(int ), (int)61);
        }
    }

    private static /* synthetic */ long iqh(int n2) {
        return iqi[n2] ^ iqj[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public float y() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = pu$HudClipRect.al - pu$HudClipRect.iqc("isx", iqh(int ), (int)27)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == pu$HudClipRect.iqc("isy", ipz(int ), (int)41)) break;
            v0 /* !! */  = (long)pu$HudClipRect.iqc("isz", ipz(int ), (int)42);
        }
        var3_1 = pu$HudClipRect.c;
        v1 /* !! */  = pu$HudClipRect.al;
        if (true) ** GOTO lbl12
        block21: while (true) {
            v1 /* !! */  = (long)(v2 - pu$HudClipRect.iqc("ita", iqh(int ), (int)28));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1839002222: {
                    break block21;
                }
                case -1824417927: {
                    v2 = pu$HudClipRect.iqc("itb", iqh(int ), (int)29);
                    continue block21;
                }
                case 816915192: {
                    v2 = pu$HudClipRect.iqc("itc", iqh(int ), (int)30);
                    continue block21;
                }
            }
            break;
        }
        var2_2 /* !! */  = pu$HudClipRect.b;
        v3 /* !! */  = pu$HudClipRect.al;
        if (true) ** GOTO lbl26
        block22: while (true) {
            v3 /* !! */  = (long)(v4 - pu$HudClipRect.iqc("itd", iqh(int ), (int)31));
lbl26:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1839002222: {
                    break block22;
                }
                case 254375419: {
                    v4 = pu$HudClipRect.iqc("ite", iqh(int ), (int)32);
                    continue block22;
                }
                case 1985107281: {
                    v4 = pu$HudClipRect.iqc("itf", iqh(int ), (int)33);
                    continue block22;
                }
            }
            break;
        }
        var1_3 = pu$HudClipRect.a;
        if (var3_1) {
            throw null;
lbl38:
            // 1 sources

            return (float)pu$HudClipRect.iqc("itg", iso(int ), (int)43);
        }
        ** while (var1_3 || var1_3)
lbl41:
        // 1 sources

        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block10 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v5 /* !! */  = pu$HudClipRect.al;
                if (true) ** GOTO lbl48
                block24: while (true) {
                    v5 /* !! */  = (long)(pu$HudClipRect.iqc("iti", iqh(int ), (int)35) - pu$HudClipRect.iqc("ith", iqh(int ), (int)34));
lbl48:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1839002222: {
                            break block24;
                        }
                        case 782994184: {
                            continue block24;
                        }
                    }
                    break;
                }
                return this.y;
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)pu$HudClipRect.iqc("itj", ipz(int ), (int)44);
                    if (!var3_1) break block10;
                    throw null;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)pu$HudClipRect.iqc("itk", ipz(int ), (int)45);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)pu$HudClipRect.iqc("itl", ipz(int ), (int)46);
                if (!var3_1) break;
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)pu$HudClipRect.iqc("itm", ipz(int ), (int)47);
        ** while (!var3_1)
lbl70:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final boolean equals(Object var1_1) {
        v0 /* !! */  = pu$HudClipRect.al;
        if (true) ** GOTO lbl5
        block15: while (true) {
            v0 /* !! */  = (long)(v1 - pu$HudClipRect.iqc("irp", iqh(int ), (int)16));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1839002222: {
                    break block15;
                }
                case -1632282015: {
                    v1 = pu$HudClipRect.iqc("irq", iqh(int ), (int)17);
                    continue block15;
                }
                case -1034873157: {
                    v1 = pu$HudClipRect.iqc("irr", iqh(int ), (int)18);
                    continue block15;
                }
            }
            break;
        }
        var4_2 = pu$HudClipRect.c;
        v2 /* !! */  = pu$HudClipRect.al;
        if (true) ** GOTO lbl19
        block16: while (true) {
            v2 /* !! */  = (long)(pu$HudClipRect.iqc("irt", iqh(int ), (int)20) - pu$HudClipRect.iqc("irs", iqh(int ), (int)19));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1839002222: {
                    break block16;
                }
                case -1798295637: {
                    continue block16;
                }
            }
            break;
        }
        var3_3 /* !! */  = pu$HudClipRect.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_0 = pu$HudClipRect.al - pu$HudClipRect.iqc("iru", iqh(int ), (int)21)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == pu$HudClipRect.iqc("irv", ipz(int ), (int)19)) break;
            v3 /* !! */  = (long)pu$HudClipRect.iqc("irw", ipz(int ), (int)20);
        }
        var2_4 = pu$HudClipRect.a;
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_2) {
                    throw null;
                    return (boolean)pu$HudClipRect.iqc("irx", ipz(int ), (int)21);
                }
                if (var2_4 || var2_4) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_1 = pu$HudClipRect.al - pu$HudClipRect.iqc("iry", iqh(int ), (int)22)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == pu$HudClipRect.iqc("irz", ipz(int ), (int)22)) break;
                    v4 /* !! */  = (long)pu$HudClipRect.iqc("isa", ipz(int ), (int)23);
                }
                return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{pu$HudClipRect.class, "x;y;width;height", "x", "y", "width", "height"}, this, var1_1);
            }
lbl47:
            // 2 sources

            case 0: {
                do {
                    var3_3 /* !! */  = (int)pu$HudClipRect.iqc("isb", ipz(int ), (int)24);
                } while (!var4_2);
                throw null;
            }
            case 1: {
                do {
                    var3_3 /* !! */  = (int)pu$HudClipRect.iqc("isc", ipz(int ), (int)25);
                } while (!var4_2);
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)pu$HudClipRect.iqc("isd", ipz(int ), (int)26);
                    if (!var4_2) ** GOTO lbl47
                    throw null;
                }
            }
            case 3: 
        }
        var3_3 /* !! */  = (int)pu$HudClipRect.iqc("ise", ipz(int ), (int)27);
        ** while (!var4_2)
lbl65:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final String toString() {
        v0 /* !! */  = pu$HudClipRect.al;
        if (true) ** GOTO lbl5
        block20: while (true) {
            v0 /* !! */  = (long)(pu$HudClipRect.iqc("iql", iqh(int ), (int)1) - pu$HudClipRect.iqc("iqk", iqh(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1839002222: {
                    break block20;
                }
                case -229884432: {
                    continue block20;
                }
            }
            break;
        }
        var3_1 = pu$HudClipRect.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = pu$HudClipRect.al - pu$HudClipRect.iqc("iqm", iqh(int ), (int)2)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == pu$HudClipRect.iqc("iqn", ipz(int ), (int)4)) break;
            v1 /* !! */  = (long)pu$HudClipRect.iqc("iqo", ipz(int ), (int)5);
        }
        var2_2 /* !! */  = pu$HudClipRect.b;
        v2 /* !! */  = pu$HudClipRect.al;
        if (true) ** GOTO lbl22
        block22: while (true) {
            v2 /* !! */  = (long)(pu$HudClipRect.iqc("iqq", iqh(int ), (int)4) - pu$HudClipRect.iqc("iqp", iqh(int ), (int)3));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1839002222: {
                    break block22;
                }
                case -1748341747: {
                    continue block22;
                }
            }
            break;
        }
        var1_3 = pu$HudClipRect.a;
        if (var3_1) {
            throw null;
lbl30:
            // 1 sources

            return null;
        }
        ** while (var1_3 || var1_3)
lbl33:
        // 1 sources

        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block8 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v3 /* !! */  = pu$HudClipRect.al;
                if (true) ** GOTO lbl40
                block24: while (true) {
                    v3 /* !! */  = (long)(v4 - pu$HudClipRect.iqc("iqr", iqh(int ), (int)5));
lbl40:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1839002222: {
                            break block24;
                        }
                        case 152584620: {
                            v4 = pu$HudClipRect.iqc("iqs", iqh(int ), (int)6);
                            continue block24;
                        }
                        case 204406694: {
                            v4 = pu$HudClipRect.iqc("iqt", iqh(int ), (int)7);
                            continue block24;
                        }
                        case 1006717599: {
                            v4 = pu$HudClipRect.iqc("iqu", iqh(int ), (int)8);
                            continue block24;
                        }
                    }
                    break;
                }
                return ObjectMethods.bootstrap("toString", new MethodHandle[]{pu$HudClipRect.class, "x;y;width;height", "x", "y", "width", "height"}, this);
            }
lbl53:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)pu$HudClipRect.iqc("iqv", ipz(int ), (int)6);
                if (var3_1) {
                    throw null;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)pu$HudClipRect.iqc("iqw", ipz(int ), (int)7);
                if (!var3_1) ** GOTO lbl53
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)pu$HudClipRect.iqc("iqx", ipz(int ), (int)8);
                    if (!var3_1) break block8;
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)pu$HudClipRect.iqc("iqy", ipz(int ), (int)9);
        ** while (!var3_1)
lbl69:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void iux() {
        pu$HudClipRect.iqi[0] = 3158672334310127343L;
        pu$HudClipRect.iqi[1] = -3276852128035603131L;
        pu$HudClipRect.iqi[2] = -4775790027322261128L;
        pu$HudClipRect.iqi[3] = -8533083288042181824L;
        pu$HudClipRect.iqi[4] = -3099410074591342793L;
        pu$HudClipRect.iqi[5] = 7712496025518271188L;
        pu$HudClipRect.iqi[6] = -8040357953003751135L;
        pu$HudClipRect.iqi[7] = -7893767063098719084L;
        pu$HudClipRect.iqi[8] = -1958536385921404240L;
        pu$HudClipRect.iqi[9] = -2734773309852224815L;
        pu$HudClipRect.iqi[10] = -7669875853441096678L;
        pu$HudClipRect.iqi[11] = 3936837203073752444L;
        pu$HudClipRect.iqi[12] = 4853317913228439370L;
        pu$HudClipRect.iqi[13] = -3262669837794418641L;
        pu$HudClipRect.iqi[14] = -6007310019945062608L;
        pu$HudClipRect.iqi[15] = -2814738255251031531L;
        pu$HudClipRect.iqi[16] = 3473103010139022594L;
        pu$HudClipRect.iqi[17] = -3068244620615173023L;
        pu$HudClipRect.iqi[18] = 139852125420501439L;
        pu$HudClipRect.iqi[19] = -2615986978630531575L;
        pu$HudClipRect.iqi[20] = 5013296005078739182L;
        pu$HudClipRect.iqi[21] = -8028054034413869771L;
        pu$HudClipRect.iqi[22] = 505800115004272231L;
        pu$HudClipRect.iqi[23] = 6408248561737030260L;
        pu$HudClipRect.iqi[24] = 1900342183308440476L;
        pu$HudClipRect.iqi[25] = -8288716011244313178L;
        pu$HudClipRect.iqi[26] = 5850663825329667745L;
        pu$HudClipRect.iqi[27] = -752259110188623713L;
        pu$HudClipRect.iqi[28] = 405508647154108659L;
        pu$HudClipRect.iqi[29] = 9057741804870243885L;
        pu$HudClipRect.iqi[30] = 1463959486449255869L;
        pu$HudClipRect.iqi[31] = -1521085038143241950L;
        pu$HudClipRect.iqi[32] = -8220183616238270311L;
        pu$HudClipRect.iqi[33] = 7709824216241967909L;
        pu$HudClipRect.iqi[34] = 3960229185852446182L;
        pu$HudClipRect.iqi[35] = 2751055646567048300L;
        pu$HudClipRect.iqi[36] = 5572406029534408789L;
        pu$HudClipRect.iqi[37] = -2431760075117170433L;
        pu$HudClipRect.iqi[38] = -4829395686903188656L;
        pu$HudClipRect.iqi[39] = 4249098796462889941L;
        pu$HudClipRect.iqi[40] = -5604558771856677957L;
        pu$HudClipRect.iqi[41] = 6150654950404049566L;
        pu$HudClipRect.iqi[42] = 8165046140797710241L;
        pu$HudClipRect.iqi[43] = 8292996760269875917L;
        pu$HudClipRect.iqi[44] = 1040338671104456900L;
        pu$HudClipRect.iqi[45] = -557911472529705301L;
        pu$HudClipRect.iqi[46] = 820978480395764279L;
        pu$HudClipRect.iqi[47] = 8844847693932081379L;
        pu$HudClipRect.iqi[48] = -802839445363669485L;
        pu$HudClipRect.iqi[49] = 8109602041603695323L;
        pu$HudClipRect.iqi[50] = 7810912806499530180L;
        pu$HudClipRect.iqi[51] = 4800401918673187870L;
    }

    static {
        iqa = new int[66];
        iqb = new int[66];
        pu$HudClipRect.iuv();
        pu$HudClipRect.iuw();
        iqi = new long[52];
        iqj = new long[52];
        pu$HudClipRect.iux();
        pu$HudClipRect.iuy();
    }

    private static /* synthetic */ int ipz(int n2) {
        return iqa[n2] ^ iqb[n2];
    }
}

