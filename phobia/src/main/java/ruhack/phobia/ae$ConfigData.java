/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.HashMap;
import java.util.Map;
import ruhack.phobia.ae$ItemConfig;

public class ae$ConfigData {
    private static long[] adih;
    protected static final long bp = 8261978768592549668L;
    private boolean globalEnabled;
    private static long[] adig;
    private static int[] adhy;
    public static final int b;
    private static int[] adhx;
    public static final boolean a;
    private Map<String, ae$ItemConfig> items;
    public static final boolean c;

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public void setGlobalEnabled(boolean bl2) {
        boolean bl3;
        Object object = bp;
        boolean bl4 = true;
        block11: while (true) {
            CallSite callSite;
            if (!bl4 || (bl4 = false) || !true) {
                object = callSite - ae$ConfigData.adhz("aeav", adif(int ), (int)21);
            }
            switch ((int)object) {
                case -1949878492: {
                    break block11;
                }
                case -1121172251: {
                    callSite = ae$ConfigData.adhz("aeaw", adif(int ), (int)22);
                    continue block11;
                }
                case 454359163: {
                    callSite = ae$ConfigData.adhz("aeax", adif(int ), (int)23);
                    continue block11;
                }
                case 757400786: {
                    callSite = ae$ConfigData.adhz("aeay", adif(int ), (int)24);
                    continue block11;
                }
            }
            break;
        }
        boolean bl5 = c;
        Object object2 = bp;
        boolean bl6 = true;
        block12: while (true) {
            CallSite callSite;
            if (!bl6 || (bl6 = false) || !true) {
                object2 = callSite - ae$ConfigData.adhz("aeaz", adif(int ), (int)25);
            }
            switch ((int)object2) {
                case -1977637406: {
                    callSite = ae$ConfigData.adhz("aeba", adif(int ), (int)26);
                    continue block12;
                }
                case -1949878492: {
                    break block12;
                }
                case -1343800050: {
                    callSite = ae$ConfigData.adhz("aebb", adif(int ), (int)27);
                    continue block12;
                }
            }
            break;
        }
        int n2 = b;
        while (true) {
            long l2;
            Object object3;
            if ((object3 = (l2 = bp - ae$ConfigData.adhz("aebc", adif(int ), (int)28)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (object3 == ae$ConfigData.adhz("aebd", adhw(int ), (int)20)) {
                bl3 = a;
                if (bl5) {
                    throw null;
                }
                break;
            }
            object3 = ae$ConfigData.adhz("aebe", adhw(int ), (int)21);
        }
        if (bl3 || bl3) return;
        while (true) {
            long l3;
            Object object4;
            if ((object4 = (l3 = bp - ae$ConfigData.adhz("aebf", adif(int ), (int)29)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (object4 == ae$ConfigData.adhz("aebg", adhw(int ), (int)22)) {
                this.globalEnabled = bl2;
                if (bl3) return;
                return;
            }
            object4 = ae$ConfigData.adhz("aebh", adhw(int ), (int)23);
        }
    }

    static {
        adhx = new int[36];
        adhy = new int[36];
        ae$ConfigData.aecb();
        ae$ConfigData.aecc();
        adig = new long[37];
        adih = new long[37];
        ae$ConfigData.aecd();
        ae$ConfigData.aece();
    }

    private static /* synthetic */ void aecb() {
        ae$ConfigData.adhx[0] = 474520414;
        ae$ConfigData.adhx[1] = 1392739074;
        ae$ConfigData.adhx[2] = 71614259;
        ae$ConfigData.adhx[3] = 1051178160;
        ae$ConfigData.adhx[4] = 1907576860;
        ae$ConfigData.adhx[5] = -578276017;
        ae$ConfigData.adhx[6] = -156216008;
        ae$ConfigData.adhx[7] = -1966047844;
        ae$ConfigData.adhx[8] = -588897137;
        ae$ConfigData.adhx[9] = 256666315;
        ae$ConfigData.adhx[10] = 1258927200;
        ae$ConfigData.adhx[11] = 134198344;
        ae$ConfigData.adhx[12] = 1679540398;
        ae$ConfigData.adhx[13] = 775825451;
        ae$ConfigData.adhx[14] = -1257418904;
        ae$ConfigData.adhx[15] = 527796714;
        ae$ConfigData.adhx[16] = -46989700;
        ae$ConfigData.adhx[17] = -981461851;
        ae$ConfigData.adhx[18] = -1061092778;
        ae$ConfigData.adhx[19] = 2140196496;
        ae$ConfigData.adhx[20] = -734190265;
        ae$ConfigData.adhx[21] = 908620707;
        ae$ConfigData.adhx[22] = 1811003888;
        ae$ConfigData.adhx[23] = -128132001;
        ae$ConfigData.adhx[24] = 1805074262;
        ae$ConfigData.adhx[25] = 95637370;
        ae$ConfigData.adhx[26] = -1164533489;
        ae$ConfigData.adhx[27] = 1376607312;
        ae$ConfigData.adhx[28] = -693370605;
        ae$ConfigData.adhx[29] = 1072200798;
        ae$ConfigData.adhx[30] = 1413931985;
        ae$ConfigData.adhx[31] = 1880500187;
        ae$ConfigData.adhx[32] = -2135017754;
        ae$ConfigData.adhx[33] = -1182417283;
        ae$ConfigData.adhx[34] = -203907899;
        ae$ConfigData.adhx[35] = -222786435;
    }

    private static /* synthetic */ long adif(int n2) {
        return adig[n2] ^ adih[n2];
    }

    /*
     * Enabled aggressive block sorting
     */
    public void setItems(Map<String, ae$ItemConfig> map) {
        block21: {
            block20: {
                Object object = bp;
                block12: while (true) {
                    switch ((int)object) {
                        case -2027962119: {
                            object = ae$ConfigData.adhz("aebo", adif(int ), (int)31) - ae$ConfigData.adhz("aebn", adif(int ), (int)30);
                            continue block12;
                        }
                        case -1949878492: {
                            break block12;
                        }
                    }
                    break;
                }
                boolean bl2 = c;
                while (true) {
                    long l2;
                    Object object2;
                    if ((object2 = (l2 = bp - ae$ConfigData.adhz("aebp", adif(int ), (int)32)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
                    if (object2 == ae$ConfigData.adhz("aebq", adhw(int ), (int)29)) break;
                    object2 = ae$ConfigData.adhz("aebr", adhw(int ), (int)30);
                }
                int n2 = b;
                Object object3 = bp;
                block14: while (true) {
                    switch ((int)object3) {
                        case -1949878492: {
                            break block14;
                        }
                        case 1587775789: {
                            object3 = ae$ConfigData.adhz("aebt", adif(int ), (int)34) - ae$ConfigData.adhz("aebs", adif(int ), (int)33);
                            continue block14;
                        }
                    }
                    break;
                }
                boolean bl3 = a;
                if (bl2) {
                    throw null;
                }
                if (bl3 || bl3) break block20;
                Object object4 = bp;
                block15: while (true) {
                    switch ((int)object4) {
                        case -1949878492: {
                            break block15;
                        }
                        case -1487957241: {
                            object4 = ae$ConfigData.adhz("aebv", adif(int ), (int)36) - ae$ConfigData.adhz("aebu", adif(int ), (int)35);
                            continue block15;
                        }
                    }
                    break;
                }
                this.items = map;
                if (!bl3) break block21;
            }
            return;
        }
    }

    private static /* synthetic */ void aecc() {
        ae$ConfigData.adhy[0] = 474520414;
        ae$ConfigData.adhy[1] = 1392739073;
        ae$ConfigData.adhy[2] = 71614257;
        ae$ConfigData.adhy[3] = 1051178162;
        ae$ConfigData.adhy[4] = 1907576862;
        ae$ConfigData.adhy[5] = 578276016;
        ae$ConfigData.adhy[6] = -1114674050;
        ae$ConfigData.adhy[7] = -1966047843;
        ae$ConfigData.adhy[8] = 786662033;
        ae$ConfigData.adhy[9] = 256666314;
        ae$ConfigData.adhy[10] = 1258927200;
        ae$ConfigData.adhy[11] = 134198344;
        ae$ConfigData.adhy[12] = 1679540396;
        ae$ConfigData.adhy[13] = 775825451;
        ae$ConfigData.adhy[14] = 1257418903;
        ae$ConfigData.adhy[15] = 813912116;
        ae$ConfigData.adhy[16] = -46989698;
        ae$ConfigData.adhy[17] = -981461852;
        ae$ConfigData.adhy[18] = -1061092779;
        ae$ConfigData.adhy[19] = 2140196498;
        ae$ConfigData.adhy[20] = -734190266;
        ae$ConfigData.adhy[21] = 597173898;
        ae$ConfigData.adhy[22] = 1811003889;
        ae$ConfigData.adhy[23] = -1183282278;
        ae$ConfigData.adhy[24] = 1805074262;
        ae$ConfigData.adhy[25] = 95637369;
        ae$ConfigData.adhy[26] = -1164533489;
        ae$ConfigData.adhy[27] = 1376607314;
        ae$ConfigData.adhy[28] = -693370608;
        ae$ConfigData.adhy[29] = -1072200799;
        ae$ConfigData.adhy[30] = -747302324;
        ae$ConfigData.adhy[31] = 1880500191;
        ae$ConfigData.adhy[32] = -2135017758;
        ae$ConfigData.adhy[33] = -1182417283;
        ae$ConfigData.adhy[34] = -203907900;
        ae$ConfigData.adhy[35] = -222786439;
    }

    private static /* synthetic */ void aecd() {
        ae$ConfigData.adig[0] = -3260153645361515955L;
        ae$ConfigData.adig[1] = -1403665483687512401L;
        ae$ConfigData.adig[2] = -8035990487147794826L;
        ae$ConfigData.adig[3] = -2346039320617492464L;
        ae$ConfigData.adig[4] = -3881631065807205980L;
        ae$ConfigData.adig[5] = 3729648952975166385L;
        ae$ConfigData.adig[6] = 3680947169622696004L;
        ae$ConfigData.adig[7] = 7232873621805061588L;
        ae$ConfigData.adig[8] = 5716317824356454517L;
        ae$ConfigData.adig[9] = -8222930986500653107L;
        ae$ConfigData.adig[10] = 8765326626545204935L;
        ae$ConfigData.adig[11] = 7799431800603424548L;
        ae$ConfigData.adig[12] = -343072980768039593L;
        ae$ConfigData.adig[13] = -7314186056306157740L;
        ae$ConfigData.adig[14] = -8370161528133144226L;
        ae$ConfigData.adig[15] = 921282679626089658L;
        ae$ConfigData.adig[16] = -3359272138362327162L;
        ae$ConfigData.adig[17] = -8346211335189319118L;
        ae$ConfigData.adig[18] = 7388222334352721985L;
        ae$ConfigData.adig[19] = -3489915127547618709L;
        ae$ConfigData.adig[20] = 4694479036631416893L;
        ae$ConfigData.adig[21] = -6156100031510233433L;
        ae$ConfigData.adig[22] = 5876375170397935047L;
        ae$ConfigData.adig[23] = 6431776455738642736L;
        ae$ConfigData.adig[24] = -8074917405816944788L;
        ae$ConfigData.adig[25] = 2495975751856420292L;
        ae$ConfigData.adig[26] = -3715780952024017935L;
        ae$ConfigData.adig[27] = 819532516225765514L;
        ae$ConfigData.adig[28] = -3277088324933605793L;
        ae$ConfigData.adig[29] = -2047806025633991105L;
        ae$ConfigData.adig[30] = -2901107500797353843L;
        ae$ConfigData.adig[31] = -226852449198672554L;
        ae$ConfigData.adig[32] = 8087320520711279021L;
        ae$ConfigData.adig[33] = 722089099959483515L;
        ae$ConfigData.adig[34] = 9204457800707897825L;
        ae$ConfigData.adig[35] = 5463702081875058386L;
        ae$ConfigData.adig[36] = 5941598000526506101L;
    }

    public static /* synthetic */ CallSite adhz(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ int adhw(int n2) {
        return adhx[n2] ^ adhy[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public ae$ConfigData() {
        var2_1 /* !! */  = ae$ConfigData.b;
        super();
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.globalEnabled = ae$ConfigData.adhz("adia", adhw(int ), (int)0);
                this.items = new HashMap<String, ae$ItemConfig>();
                return;
            }
            case 0: {
                while (true) {
                    var2_1 /* !! */  = (int)ae$ConfigData.adhz("adib", adhw(int ), (int)1);
                }
            }
lbl13:
            // 2 sources

            case 1: {
                var2_1 /* !! */  = (int)ae$ConfigData.adhz("adic", adhw(int ), (int)2);
                break;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)ae$ConfigData.adhz("adid", adhw(int ), (int)3);
                    ** GOTO lbl13
                    break;
                }
            }
            case 3: 
        }
        var2_1 /* !! */  = (int)ae$ConfigData.adhz("adie", adhw(int ), (int)4);
        ** while (true)
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public Map<String, ae$ItemConfig> getItems() {
        v0 /* !! */  = ae$ConfigData.bp;
        if (true) ** GOTO lbl5
        block23: while (true) {
            v0 /* !! */  = (long)(v1 - ae$ConfigData.adhz("aead", adif(int ), (int)9));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1949878492: {
                    break block23;
                }
                case -1101316443: {
                    v1 = ae$ConfigData.adhz("aeae", adif(int ), (int)10);
                    continue block23;
                }
                case -203071003: {
                    v1 = ae$ConfigData.adhz("aeaf", adif(int ), (int)11);
                    continue block23;
                }
                case -89376149: {
                    v1 = ae$ConfigData.adhz("aeag", adif(int ), (int)12);
                    continue block23;
                }
            }
            break;
        }
        var3_1 = ae$ConfigData.c;
        v2 /* !! */  = ae$ConfigData.bp;
        if (true) ** GOTO lbl22
        block24: while (true) {
            v2 /* !! */  = (long)(v3 - ae$ConfigData.adhz("aeah", adif(int ), (int)13));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1949878492: {
                    break block24;
                }
                case -372036765: {
                    v3 = ae$ConfigData.adhz("aeai", adif(int ), (int)14);
                    continue block24;
                }
                case 1299565470: {
                    v3 = ae$ConfigData.adhz("aeaj", adif(int ), (int)15);
                    continue block24;
                }
                case 1846351372: {
                    v3 = ae$ConfigData.adhz("aeak", adif(int ), (int)16);
                    continue block24;
                }
            }
            break;
        }
        var2_2 /* !! */  = ae$ConfigData.b;
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_0 = ae$ConfigData.bp - ae$ConfigData.adhz("aeal", adif(int ), (int)17)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v4 /* !! */  == ae$ConfigData.adhz("aeam", adhw(int ), (int)14)) break;
            v4 /* !! */  = (long)ae$ConfigData.adhz("aean", adhw(int ), (int)15);
        }
        var1_3 = ae$ConfigData.a;
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
                v5 /* !! */  = ae$ConfigData.bp;
                if (true) ** GOTO lbl54
                block27: while (true) {
                    v5 /* !! */  = (long)(v6 - ae$ConfigData.adhz("aeao", adif(int ), (int)18));
lbl54:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1949878492: {
                            break block27;
                        }
                        case -1435313830: {
                            v6 = ae$ConfigData.adhz("aeap", adif(int ), (int)19);
                            continue block27;
                        }
                        case -795680692: {
                            v6 = ae$ConfigData.adhz("aeaq", adif(int ), (int)20);
                            continue block27;
                        }
                    }
                    break;
                }
                return this.items;
            }
lbl64:
            // 2 sources

            case 0: {
                do {
                    var2_2 /* !! */  = (int)ae$ConfigData.adhz("aear", adhw(int ), (int)16);
                } while (!var3_1);
                throw null;
            }
lbl69:
            // 2 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ae$ConfigData.adhz("aeas", adhw(int ), (int)17);
                    if (!var3_1) ** GOTO lbl64
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)ae$ConfigData.adhz("aeat", adhw(int ), (int)18);
                if (!var3_1) ** GOTO lbl69
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)ae$ConfigData.adhz("aeau", adhw(int ), (int)19);
        ** while (!var3_1)
lbl81:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void aece() {
        ae$ConfigData.adih[0] = -7574710196124333757L;
        ae$ConfigData.adih[1] = 1267926932799461546L;
        ae$ConfigData.adih[2] = 6575161551656148561L;
        ae$ConfigData.adih[3] = -6605211689278346482L;
        ae$ConfigData.adih[4] = 7728020461653485717L;
        ae$ConfigData.adih[5] = 6254739412771382547L;
        ae$ConfigData.adih[6] = -7557054881503597017L;
        ae$ConfigData.adih[7] = 5630395776254376358L;
        ae$ConfigData.adih[8] = -2216355907985627544L;
        ae$ConfigData.adih[9] = 4343287123003198480L;
        ae$ConfigData.adih[10] = -6878745627286311056L;
        ae$ConfigData.adih[11] = -8367343919935796163L;
        ae$ConfigData.adih[12] = -2820206266829435081L;
        ae$ConfigData.adih[13] = 8343441925551261305L;
        ae$ConfigData.adih[14] = -6683744459453221018L;
        ae$ConfigData.adih[15] = 6609846474963952993L;
        ae$ConfigData.adih[16] = 2100282222290990320L;
        ae$ConfigData.adih[17] = -872807267068714172L;
        ae$ConfigData.adih[18] = -4777717890812483286L;
        ae$ConfigData.adih[19] = 8507410669987982754L;
        ae$ConfigData.adih[20] = 3875236982113933848L;
        ae$ConfigData.adih[21] = 3517571115023417530L;
        ae$ConfigData.adih[22] = 1561493574833488993L;
        ae$ConfigData.adih[23] = 2368626116801994983L;
        ae$ConfigData.adih[24] = -755549301486270826L;
        ae$ConfigData.adih[25] = 251304560130926923L;
        ae$ConfigData.adih[26] = 3792142777820107214L;
        ae$ConfigData.adih[27] = 6761099450322590481L;
        ae$ConfigData.adih[28] = 3057846234142914742L;
        ae$ConfigData.adih[29] = -7869203398329627439L;
        ae$ConfigData.adih[30] = -1989131839121452016L;
        ae$ConfigData.adih[31] = -8343967389618680818L;
        ae$ConfigData.adih[32] = 796808268829785125L;
        ae$ConfigData.adih[33] = 8660991890608351915L;
        ae$ConfigData.adih[34] = 4792217711067011495L;
        ae$ConfigData.adih[35] = 2948484512709551330L;
        ae$ConfigData.adih[36] = -7810390634432048975L;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public boolean isGlobalEnabled() {
        boolean bl2;
        Object object = bp;
        boolean bl3 = true;
        block11: while (true) {
            CallSite callSite;
            if (!bl3 || (bl3 = false) || !true) {
                object = callSite - ae$ConfigData.adhz("adii", adif(int ), (int)0);
            }
            switch ((int)object) {
                case -1949878492: {
                    break block11;
                }
                case -756499759: {
                    callSite = ae$ConfigData.adhz("adij", adif(int ), (int)1);
                    continue block11;
                }
                case 1079511832: {
                    callSite = ae$ConfigData.adhz("adik", adif(int ), (int)2);
                    continue block11;
                }
            }
            break;
        }
        boolean bl4 = c;
        while (true) {
            long l2;
            Object object2;
            if ((object2 = (l2 = bp - ae$ConfigData.adhz("adil", adif(int ), (int)3)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object2 == ae$ConfigData.adhz("adim", adhw(int ), (int)5)) break;
            object2 = ae$ConfigData.adhz("adin", adhw(int ), (int)6);
        }
        int n2 = b;
        while (true) {
            long l3;
            Object object3;
            if ((object3 = (l3 = bp - ae$ConfigData.adhz("adio", adif(int ), (int)4)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object3 == ae$ConfigData.adhz("adip", adhw(int ), (int)7)) {
                bl2 = a;
                if (bl4) {
                    throw null;
                }
                break;
            }
            object3 = ae$ConfigData.adhz("adiq", adhw(int ), (int)8);
        }
        if (bl2) return (boolean)ae$ConfigData.adhz("adir", adhw(int ), (int)9);
        if (bl2) return (boolean)ae$ConfigData.adhz("adir", adhw(int ), (int)9);
        Object object4 = bp;
        boolean bl5 = true;
        block14: while (true) {
            CallSite callSite;
            if (!bl5 || (bl5 = false) || !true) {
                object4 = callSite - ae$ConfigData.adhz("adis", adif(int ), (int)5);
            }
            switch ((int)object4) {
                case -1949878492: {
                    return this.globalEnabled;
                }
                case -933197841: {
                    callSite = ae$ConfigData.adhz("adit", adif(int ), (int)6);
                    continue block14;
                }
                case 772941750: {
                    callSite = ae$ConfigData.adhz("adiu", adif(int ), (int)7);
                    continue block14;
                }
                case 1137595341: {
                    callSite = ae$ConfigData.adhz("adiv", adif(int ), (int)8);
                    continue block14;
                }
            }
            break;
        }
        return this.globalEnabled;
    }
}

