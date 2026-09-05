/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

final class et$ActionPhase
extends Enum<et$ActionPhase> {
    private static int[] euf = new int[32];
    private static long[] etu;
    public static final boolean a;
    private static final /* synthetic */ et$ActionPhase[] $VALUES;
    public static final int b;
    public static final long y = 7869940065257285248L;
    private static int[] eug;
    private static long[] etv;
    public static final /* enum */ et$ActionPhase WAIT_STOP;
    public static final /* enum */ et$ActionPhase IDLE;
    public static final /* enum */ et$ActionPhase RESTORE;
    public static final boolean c;

    private static /* synthetic */ void ewp() {
        et$ActionPhase.euf[0] = 1686435618;
        et$ActionPhase.euf[1] = 465815068;
        et$ActionPhase.euf[2] = 622906286;
        et$ActionPhase.euf[3] = 750977561;
        et$ActionPhase.euf[4] = -272713247;
        et$ActionPhase.euf[5] = 1189362810;
        et$ActionPhase.euf[6] = -450924802;
        et$ActionPhase.euf[7] = 1229100519;
        et$ActionPhase.euf[8] = 197594402;
        et$ActionPhase.euf[9] = -450548806;
        et$ActionPhase.euf[10] = -719849486;
        et$ActionPhase.euf[11] = 1796482786;
        et$ActionPhase.euf[12] = 303435920;
        et$ActionPhase.euf[13] = -1893849279;
        et$ActionPhase.euf[14] = 568401077;
        et$ActionPhase.euf[15] = 2120318940;
        et$ActionPhase.euf[16] = 1066396351;
        et$ActionPhase.euf[17] = 1165402193;
        et$ActionPhase.euf[18] = 85154366;
        et$ActionPhase.euf[19] = -1794757477;
        et$ActionPhase.euf[20] = 1298159165;
        et$ActionPhase.euf[21] = 309046722;
        et$ActionPhase.euf[22] = 1864619949;
        et$ActionPhase.euf[23] = -918195969;
        et$ActionPhase.euf[24] = -2026188435;
        et$ActionPhase.euf[25] = -121166463;
        et$ActionPhase.euf[26] = 1579483625;
        et$ActionPhase.euf[27] = 886936482;
        et$ActionPhase.euf[28] = 1453660235;
        et$ActionPhase.euf[29] = 1269773743;
        et$ActionPhase.euf[30] = -695920045;
        et$ActionPhase.euf[31] = 1156639678;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public static et$ActionPhase[] values() {
        boolean bl2;
        Object object = y;
        boolean bl3 = true;
        block10: while (true) {
            CallSite callSite;
            if (!bl3 || (bl3 = false) || !true) {
                object = callSite - et$ActionPhase.etw("etx", ett(int ), (int)0);
            }
            switch ((int)object) {
                case -794503071: {
                    callSite = et$ActionPhase.etw("ety", ett(int ), (int)1);
                    continue block10;
                }
                case -381262208: {
                    break block10;
                }
                case 1771143061: {
                    callSite = et$ActionPhase.etw("etz", ett(int ), (int)2);
                    continue block10;
                }
            }
            break;
        }
        boolean bl4 = c;
        Object object2 = y;
        boolean bl5 = true;
        block11: while (true) {
            CallSite callSite;
            if (!bl5 || (bl5 = false) || !true) {
                object2 = callSite - et$ActionPhase.etw("eua", ett(int ), (int)3);
            }
            switch ((int)object2) {
                case -724752583: {
                    callSite = et$ActionPhase.etw("eub", ett(int ), (int)4);
                    continue block11;
                }
                case -381262208: {
                    break block11;
                }
                case -379672746: {
                    callSite = et$ActionPhase.etw("euc", ett(int ), (int)5);
                    continue block11;
                }
            }
            break;
        }
        int n2 = b;
        while (true) {
            long l2;
            Object object3;
            if ((object3 = (l2 = y - et$ActionPhase.etw("eud", ett(int ), (int)6)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (object3 == et$ActionPhase.etw("euh", eue(int ), (int)0)) {
                bl2 = a;
                if (bl4) {
                    throw null;
                }
                break;
            }
            object3 = et$ActionPhase.etw("eui", eue(int ), (int)1);
        }
        if (bl2) return null;
        if (bl2) return null;
        while (true) {
            long l3;
            Object object4;
            if ((object4 = (l3 = y - et$ActionPhase.etw("euj", ett(int ), (int)7)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (object4 == et$ActionPhase.etw("euk", eue(int ), (int)2)) break;
            object4 = et$ActionPhase.etw("eul", eue(int ), (int)3);
        }
        while (true) {
            long l4;
            Object object5;
            if ((object5 = (l4 = y - et$ActionPhase.etw("eum", ett(int ), (int)8)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (object5 == et$ActionPhase.etw("eun", eue(int ), (int)4)) {
                return (et$ActionPhase[])$VALUES.clone();
            }
            object5 = et$ActionPhase.etw("euo", eue(int ), (int)5);
        }
    }

    private et$ActionPhase() {
        int n3 = b;
        boolean bl2 = a;
    }

    private static /* synthetic */ void ewq() {
        et$ActionPhase.eug[0] = 1686435619;
        et$ActionPhase.eug[1] = 262676889;
        et$ActionPhase.eug[2] = 622906287;
        et$ActionPhase.eug[3] = 188353933;
        et$ActionPhase.eug[4] = -272713248;
        et$ActionPhase.eug[5] = -454366089;
        et$ActionPhase.eug[6] = -450924802;
        et$ActionPhase.eug[7] = 1229100516;
        et$ActionPhase.eug[8] = 197594401;
        et$ActionPhase.eug[9] = -450548807;
        et$ActionPhase.eug[10] = -719849485;
        et$ActionPhase.eug[11] = 2042959716;
        et$ActionPhase.eug[12] = 303435923;
        et$ActionPhase.eug[13] = -1893849279;
        et$ActionPhase.eug[14] = 568401077;
        et$ActionPhase.eug[15] = 2120318940;
        et$ActionPhase.eug[16] = 1066396349;
        et$ActionPhase.eug[17] = 1165402193;
        et$ActionPhase.eug[18] = 85154367;
        et$ActionPhase.eug[19] = -1794757478;
        et$ActionPhase.eug[20] = -1704261549;
        et$ActionPhase.eug[21] = 309046722;
        et$ActionPhase.eug[22] = 1864619948;
        et$ActionPhase.eug[23] = -918195971;
        et$ActionPhase.eug[24] = -2026188436;
        et$ActionPhase.eug[25] = -121166464;
        et$ActionPhase.eug[26] = 1579483627;
        et$ActionPhase.eug[27] = 886936483;
        et$ActionPhase.eug[28] = 1453660235;
        et$ActionPhase.eug[29] = 1269773743;
        et$ActionPhase.eug[30] = -695920046;
        et$ActionPhase.eug[31] = 1156639676;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static et$ActionPhase valueOf(String var0) {
        v0 /* !! */  = et$ActionPhase.y;
        if (true) ** GOTO lbl5
        block23: while (true) {
            v0 /* !! */  = (long)(v1 - et$ActionPhase.etw("eut", ett(int ), (int)9));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1291214197: {
                    v1 = et$ActionPhase.etw("euu", ett(int ), (int)10);
                    continue block23;
                }
                case -1080356774: {
                    v1 = et$ActionPhase.etw("euv", ett(int ), (int)11);
                    continue block23;
                }
                case -381262208: {
                    break block23;
                }
                case -179088045: {
                    v1 = et$ActionPhase.etw("euw", ett(int ), (int)12);
                    continue block23;
                }
            }
            break;
        }
        var3_1 = et$ActionPhase.c;
        v2 /* !! */  = et$ActionPhase.y;
        if (true) ** GOTO lbl22
        block24: while (true) {
            v2 /* !! */  = (long)(v3 - et$ActionPhase.etw("eux", ett(int ), (int)13));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -556472427: {
                    v3 = et$ActionPhase.etw("euy", ett(int ), (int)14);
                    continue block24;
                }
                case -381262208: {
                    break block24;
                }
                case 43369073: {
                    v3 = et$ActionPhase.etw("euz", ett(int ), (int)15);
                    continue block24;
                }
            }
            break;
        }
        var2_2 /* !! */  = et$ActionPhase.b;
        v4 /* !! */  = et$ActionPhase.y;
        if (true) ** GOTO lbl36
        block25: while (true) {
            v4 /* !! */  = (long)(v5 - et$ActionPhase.etw("eva", ett(int ), (int)16));
lbl36:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1483443286: {
                    v5 = et$ActionPhase.etw("evb", ett(int ), (int)17);
                    continue block25;
                }
                case -381262208: {
                    break block25;
                }
                case 108521349: {
                    v5 = et$ActionPhase.etw("evc", ett(int ), (int)18);
                    continue block25;
                }
                case 1588051234: {
                    v5 = et$ActionPhase.etw("evd", ett(int ), (int)19);
                    continue block25;
                }
            }
            break;
        }
        var1_3 = et$ActionPhase.a;
        if (!var3_1) ** GOTO lbl55
        throw null;
        {
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var2_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return null;
                }
lbl55:
                // 1 sources

                if (var1_3 || var1_3) continue block26;
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_0 = et$ActionPhase.y - et$ActionPhase.etw("eve", ett(int ), (int)20)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v6 /* !! */  == et$ActionPhase.etw("evf", eue(int ), (int)10)) break;
                    v6 /* !! */  = (long)et$ActionPhase.etw("evg", eue(int ), (int)11);
                }
                return Enum.valueOf(et$ActionPhase.class, var0);
                case 0: {
                    var2_2 /* !! */  = (int)et$ActionPhase.etw("evh", eue(int ), (int)12);
                    if (!var3_1) break block26;
                    throw null;
                }
                case 1: {
                    do {
                        var2_2 /* !! */  = (int)et$ActionPhase.etw("evi", eue(int ), (int)13);
                    } while (!var3_1);
                    throw null;
                }
                case 2: lbl-1000:
                // 2 sources

                {
                    while (true) lbl-1000:
                    // 2 sources

                    {
                        var2_2 /* !! */  = (int)et$ActionPhase.etw("evj", eue(int ), (int)14);
                        if (!var3_1) ** GOTO lbl-1000
                        throw null;
                    }
                }
                case 3: 
            }
        }
        var2_2 /* !! */  = (int)et$ActionPhase.etw("evk", eue(int ), (int)15);
        ** while (!var3_1)
lbl80:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ews() {
        et$ActionPhase.etv[0] = -7801477466610147888L;
        et$ActionPhase.etv[1] = 7612016202078124884L;
        et$ActionPhase.etv[2] = 884717001338808131L;
        et$ActionPhase.etv[3] = -4088096255439253049L;
        et$ActionPhase.etv[4] = 4602138070055947132L;
        et$ActionPhase.etv[5] = -973249055611997946L;
        et$ActionPhase.etv[6] = 7386086169653467462L;
        et$ActionPhase.etv[7] = 4825558932298835399L;
        et$ActionPhase.etv[8] = 8412000462589390820L;
        et$ActionPhase.etv[9] = -8478451575630544557L;
        et$ActionPhase.etv[10] = -7117874035854878973L;
        et$ActionPhase.etv[11] = -7326582886745658072L;
        et$ActionPhase.etv[12] = 2206088602786219292L;
        et$ActionPhase.etv[13] = 4864317182632798761L;
        et$ActionPhase.etv[14] = 4479837933610749154L;
        et$ActionPhase.etv[15] = -71645927919155826L;
        et$ActionPhase.etv[16] = 3625461721597232783L;
        et$ActionPhase.etv[17] = 7269417481198351844L;
        et$ActionPhase.etv[18] = -8097420190548075203L;
        et$ActionPhase.etv[19] = 2551142324592964148L;
        et$ActionPhase.etv[20] = -2885291456854952789L;
        et$ActionPhase.etv[21] = -6878631140578788574L;
        et$ActionPhase.etv[22] = 370797783476804201L;
        et$ActionPhase.etv[23] = 5540418664888603406L;
        et$ActionPhase.etv[24] = 8632814597020790985L;
        et$ActionPhase.etv[25] = -8174685177823503425L;
        et$ActionPhase.etv[26] = 6682128039238725481L;
        et$ActionPhase.etv[27] = -2200918342871229385L;
        et$ActionPhase.etv[28] = 8758265460349031097L;
        et$ActionPhase.etv[29] = -5645270079779923567L;
        et$ActionPhase.etv[30] = 9192600124699607980L;
        et$ActionPhase.etv[31] = 3209359250355637852L;
        et$ActionPhase.etv[32] = 6564607778554636105L;
        et$ActionPhase.etv[33] = 658859415993862516L;
        et$ActionPhase.etv[34] = -3077873676198269345L;
    }

    private static /* synthetic */ int eue(int n2) {
        return euf[n2] ^ eug[n2];
    }

    public static /* synthetic */ CallSite etw(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void ewr() {
        et$ActionPhase.etu[0] = 9047894281624579142L;
        et$ActionPhase.etu[1] = -7943588461300206623L;
        et$ActionPhase.etu[2] = -359988630239130345L;
        et$ActionPhase.etu[3] = 4497265178600741652L;
        et$ActionPhase.etu[4] = 4036193396025499832L;
        et$ActionPhase.etu[5] = -1563656338084880908L;
        et$ActionPhase.etu[6] = -4494694270406831591L;
        et$ActionPhase.etu[7] = 9215946970801114674L;
        et$ActionPhase.etu[8] = -9130066570547912035L;
        et$ActionPhase.etu[9] = 5054043912675247650L;
        et$ActionPhase.etu[10] = -1894752333070328238L;
        et$ActionPhase.etu[11] = -2453453478542178370L;
        et$ActionPhase.etu[12] = -8132711253811948125L;
        et$ActionPhase.etu[13] = -8439250548895561082L;
        et$ActionPhase.etu[14] = 412906467095624084L;
        et$ActionPhase.etu[15] = 7507432925946166551L;
        et$ActionPhase.etu[16] = -3118047368113590355L;
        et$ActionPhase.etu[17] = 6997524322399355346L;
        et$ActionPhase.etu[18] = -2596701036793371465L;
        et$ActionPhase.etu[19] = 1303205190302173992L;
        et$ActionPhase.etu[20] = -9105501058866437307L;
        et$ActionPhase.etu[21] = 6376915442878281330L;
        et$ActionPhase.etu[22] = -4607454081764222812L;
        et$ActionPhase.etu[23] = -3688725822477592902L;
        et$ActionPhase.etu[24] = 2932538122881286135L;
        et$ActionPhase.etu[25] = -2561376691720779437L;
        et$ActionPhase.etu[26] = 785584136343286621L;
        et$ActionPhase.etu[27] = 7917568831017248167L;
        et$ActionPhase.etu[28] = 1390243090202091516L;
        et$ActionPhase.etu[29] = -1867047580664516096L;
        et$ActionPhase.etu[30] = -8733867175943599875L;
        et$ActionPhase.etu[31] = -6234287095419606996L;
        et$ActionPhase.etu[32] = 6016852259903948914L;
        et$ActionPhase.etu[33] = 8548760321319284243L;
        et$ActionPhase.etu[34] = 6387592635980289023L;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ et$ActionPhase[] $values() {
        boolean bl2;
        Object object = y;
        boolean bl3 = true;
        block20: while (true) {
            CallSite callSite;
            if (!bl3 || (bl3 = false) || !true) {
                object = callSite - et$ActionPhase.etw("evo", ett(int ), (int)21);
            }
            switch ((int)object) {
                case -1738688961: {
                    callSite = et$ActionPhase.etw("evp", ett(int ), (int)22);
                    continue block20;
                }
                case -436970142: {
                    callSite = et$ActionPhase.etw("evq", ett(int ), (int)23);
                    continue block20;
                }
                case -381262208: {
                    break block20;
                }
                case 1537046102: {
                    callSite = et$ActionPhase.etw("evr", ett(int ), (int)24);
                    continue block20;
                }
            }
            break;
        }
        boolean bl4 = c;
        Object object2 = y;
        boolean bl5 = true;
        block21: while (true) {
            CallSite callSite;
            if (!bl5 || (bl5 = false) || !true) {
                object2 = callSite - et$ActionPhase.etw("evs", ett(int ), (int)25);
            }
            switch ((int)object2) {
                case -615065972: {
                    callSite = et$ActionPhase.etw("evt", ett(int ), (int)26);
                    continue block21;
                }
                case -381262208: {
                    break block21;
                }
                case 1080646034: {
                    callSite = et$ActionPhase.etw("evu", ett(int ), (int)27);
                    continue block21;
                }
            }
            break;
        }
        int n2 = b;
        while (true) {
            long l2;
            Object object3;
            if ((object3 = (l2 = y - et$ActionPhase.etw("evv", ett(int ), (int)28)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (object3 == et$ActionPhase.etw("evw", eue(int ), (int)19)) {
                bl2 = a;
                if (bl4) {
                    throw null;
                }
                break;
            }
            object3 = et$ActionPhase.etw("evx", eue(int ), (int)20);
        }
        if (bl2 || bl2) {
            return null;
        }
        et$ActionPhase[] et$ActionPhaseArray = new et$ActionPhase[3];
        CallSite callSite = et$ActionPhase.etw("evy", eue(int ), (int)21);
        Object object4 = y;
        block23: while (true) {
            switch ((int)object4) {
                case -1027872865: {
                    object4 = et$ActionPhase.etw("ewa", ett(int ), (int)30) - et$ActionPhase.etw("evz", ett(int ), (int)29);
                    continue block23;
                }
                case -381262208: {
                    break block23;
                }
            }
            break;
        }
        et$ActionPhaseArray[callSite] = IDLE;
        CallSite callSite2 = et$ActionPhase.etw("ewb", eue(int ), (int)22);
        Object object5 = y;
        boolean bl6 = true;
        block24: while (true) {
            CallSite callSite3;
            if (!bl6 || (bl6 = false) || !true) {
                object5 = callSite3 - et$ActionPhase.etw("ewc", ett(int ), (int)31);
            }
            switch ((int)object5) {
                case -381262208: {
                    break block24;
                }
                case -199256472: {
                    callSite3 = et$ActionPhase.etw("ewd", ett(int ), (int)32);
                    continue block24;
                }
                case 659973572: {
                    callSite3 = et$ActionPhase.etw("ewe", ett(int ), (int)33);
                    continue block24;
                }
            }
            break;
        }
        et$ActionPhaseArray[callSite2] = WAIT_STOP;
        CallSite callSite4 = et$ActionPhase.etw("ewf", eue(int ), (int)23);
        while (true) {
            long l3;
            long l4;
            if ((l4 = (l3 = y - et$ActionPhase.etw("ewg", ett(int ), (int)34)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (l4 == et$ActionPhase.etw("ewh", eue(int ), (int)24)) {
                et$ActionPhaseArray[callSite4] = RESTORE;
                return et$ActionPhaseArray;
            }
            l4 = 1307433017;
        }
    }

    static {
        eug = new int[32];
        et$ActionPhase.ewp();
        et$ActionPhase.ewq();
        etu = new long[35];
        etv = new long[35];
        et$ActionPhase.ewr();
        et$ActionPhase.ews();
        IDLE = new et$ActionPhase();
        WAIT_STOP = new et$ActionPhase();
        RESTORE = new et$ActionPhase();
        $VALUES = et$ActionPhase.$values();
    }

    private static /* synthetic */ long ett(int n2) {
        return etu[n2] ^ etv[n2];
    }
}

