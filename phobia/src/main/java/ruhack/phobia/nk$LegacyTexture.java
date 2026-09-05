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

record nk$LegacyTexture(String signature, String value) {
    private static long[] cpuf;
    public static final boolean c;
    private final String signature;
    private final String value;
    public static final long gc = 1863722726461092438L;
    public static final int b;
    private static int[] cpto;
    public static final boolean a;
    private static long[] cpud;
    private static int[] cptq;

    public static /* synthetic */ CallSite cptr(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final String toString() {
        v0 /* !! */  = nk$LegacyTexture.gc;
        if (true) ** GOTO lbl5
        block20: while (true) {
            v0 /* !! */  = (long)(v1 - nk$LegacyTexture.cptr("cpuh", cpub(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -24563114: {
                    break block20;
                }
                case 86915059: {
                    v1 = nk$LegacyTexture.cptr("cpui", cpub(int ), (int)1);
                    continue block20;
                }
                case 1574722959: {
                    v1 = nk$LegacyTexture.cptr("cpuk", cpub(int ), (int)2);
                    continue block20;
                }
                case 1649459732: {
                    v1 = nk$LegacyTexture.cptr("cpum", cpub(int ), (int)3);
                    continue block20;
                }
            }
            break;
        }
        var3_1 = nk$LegacyTexture.c;
        v2 /* !! */  = nk$LegacyTexture.gc;
        if (true) ** GOTO lbl22
        block21: while (true) {
            v2 /* !! */  = (long)(nk$LegacyTexture.cptr("cpup", cpub(int ), (int)5) - nk$LegacyTexture.cptr("cpuo", cpub(int ), (int)4));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -24563114: {
                    break block21;
                }
                case 623400646: {
                    continue block21;
                }
            }
            break;
        }
        var2_2 /* !! */  = nk$LegacyTexture.b;
        v3 /* !! */  = nk$LegacyTexture.gc;
        if (true) ** GOTO lbl32
        block22: while (true) {
            v3 /* !! */  = (long)(nk$LegacyTexture.cptr("cput", cpub(int ), (int)7) - nk$LegacyTexture.cptr("cpur", cpub(int ), (int)6));
lbl32:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -24563114: {
                    break block22;
                }
                case 1132917082: {
                    continue block22;
                }
            }
            break;
        }
        var1_3 = nk$LegacyTexture.a;
        if (var3_1) {
            throw null;
lbl40:
            // 2 sources

            return null;
        }
        if (var1_3) ** GOTO lbl40
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_0 = nk$LegacyTexture.gc - nk$LegacyTexture.cptr("cpuu", cpub(int ), (int)8)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == nk$LegacyTexture.cptr("cpuw", cptm(int ), (int)3)) break;
                    v4 /* !! */  = (long)nk$LegacyTexture.cptr("cpux", cptm(int ), (int)4);
                }
                return ObjectMethods.bootstrap("toString", new MethodHandle[]{nk$LegacyTexture.class, "value;signature", "value", "signature"}, this);
            }
lbl54:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)nk$LegacyTexture.cptr("cpuz", cptm(int ), (int)5);
                if (!var3_1) break;
                throw null;
            }
lbl58:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)nk$LegacyTexture.cptr("cpva", cptm(int ), (int)6);
                if (!var3_1) ** GOTO lbl54
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)nk$LegacyTexture.cptr("cpvb", cptm(int ), (int)7);
                    if (!var3_1) ** GOTO lbl58
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)nk$LegacyTexture.cptr("cpvd", cptm(int ), (int)8);
        ** while (!var3_1)
lbl70:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final int hashCode() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = nk$LegacyTexture.gc - nk$LegacyTexture.cptr("cpvg", cpub(int ), (int)9)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == nk$LegacyTexture.cptr("cpvi", cptm(int ), (int)9)) break;
            v0 /* !! */  = (long)nk$LegacyTexture.cptr("cpvj", cptm(int ), (int)10);
        }
        var3_1 = nk$LegacyTexture.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = nk$LegacyTexture.gc - nk$LegacyTexture.cptr("cpvl", cpub(int ), (int)10)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == nk$LegacyTexture.cptr("cpvm", cptm(int ), (int)11)) break;
            v1 /* !! */  = (long)nk$LegacyTexture.cptr("cpvo", cptm(int ), (int)12);
        }
        var2_2 /* !! */  = nk$LegacyTexture.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = nk$LegacyTexture.gc - nk$LegacyTexture.cptr("cpvp", cpub(int ), (int)11)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == nk$LegacyTexture.cptr("cpvr", cptm(int ), (int)13)) break;
            v2 /* !! */  = (long)nk$LegacyTexture.cptr("cpvs", cptm(int ), (int)14);
        }
        var1_3 = nk$LegacyTexture.a;
        if (var3_1) {
            throw null;
lbl24:
            // 2 sources

            return (int)nk$LegacyTexture.cptr("cpvu", cptm(int ), (int)15);
        }
        if (var1_3) ** GOTO lbl24
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                v3 /* !! */  = nk$LegacyTexture.gc;
                if (true) ** GOTO lbl35
                block14: while (true) {
                    v3 /* !! */  = (long)(nk$LegacyTexture.cptr("cpvx", cpub(int ), (int)13) - nk$LegacyTexture.cptr("cpvw", cpub(int ), (int)12));
lbl35:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -24563114: {
                            break block14;
                        }
                        case 340063516: {
                            continue block14;
                        }
                    }
                    break;
                }
                return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{nk$LegacyTexture.class, "value;signature", "value", "signature"}, this);
            }
lbl41:
            // 2 sources

            case 0: {
                do {
                    var2_2 /* !! */  = (int)nk$LegacyTexture.cptr("cpvy", cptm(int ), (int)16);
                } while (!var3_1);
                throw null;
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)nk$LegacyTexture.cptr("cpvz", cptm(int ), (int)17);
                    if (!var3_1) ** GOTO lbl41
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)nk$LegacyTexture.cptr("cpwa", cptm(int ), (int)18);
                if (!var3_1) break;
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)nk$LegacyTexture.cptr("cpwb", cptm(int ), (int)19);
        ** while (!var3_1)
lbl58:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void cqbc() {
        nk$LegacyTexture.cpuf[0] = 9105613565157092807L;
        nk$LegacyTexture.cpuf[1] = 6550351491182139639L;
        nk$LegacyTexture.cpuf[2] = 85663696517513868L;
        nk$LegacyTexture.cpuf[3] = -1216886445292313181L;
        nk$LegacyTexture.cpuf[4] = -46499385375268050L;
        nk$LegacyTexture.cpuf[5] = -1987120102420952169L;
        nk$LegacyTexture.cpuf[6] = -5836159222380787089L;
        nk$LegacyTexture.cpuf[7] = -2953304166651888855L;
        nk$LegacyTexture.cpuf[8] = 1649306213484766834L;
        nk$LegacyTexture.cpuf[9] = -1057827661990108927L;
        nk$LegacyTexture.cpuf[10] = 5987530135848924632L;
        nk$LegacyTexture.cpuf[11] = -3292906679846563635L;
        nk$LegacyTexture.cpuf[12] = 8649990329216567967L;
        nk$LegacyTexture.cpuf[13] = -3110178963939163710L;
        nk$LegacyTexture.cpuf[14] = 4996386710935948484L;
        nk$LegacyTexture.cpuf[15] = 7498852640317569364L;
        nk$LegacyTexture.cpuf[16] = -311441679918641270L;
        nk$LegacyTexture.cpuf[17] = 914718538204895696L;
        nk$LegacyTexture.cpuf[18] = 1464689428896292421L;
        nk$LegacyTexture.cpuf[19] = 9045608769216887105L;
        nk$LegacyTexture.cpuf[20] = 7230973836424284605L;
        nk$LegacyTexture.cpuf[21] = -6332527306507237920L;
        nk$LegacyTexture.cpuf[22] = 3804228977141980294L;
        nk$LegacyTexture.cpuf[23] = 7236838930916228613L;
        nk$LegacyTexture.cpuf[24] = -3729832726282305517L;
        nk$LegacyTexture.cpuf[25] = -906033401645269309L;
        nk$LegacyTexture.cpuf[26] = -6480970750969177323L;
        nk$LegacyTexture.cpuf[27] = 7196796351704541895L;
        nk$LegacyTexture.cpuf[28] = -9216644175660780848L;
        nk$LegacyTexture.cpuf[29] = 643646138068470082L;
        nk$LegacyTexture.cpuf[30] = 776750040084128324L;
        nk$LegacyTexture.cpuf[31] = -2671798616929001830L;
        nk$LegacyTexture.cpuf[32] = 5739502437359012272L;
        nk$LegacyTexture.cpuf[33] = 7561689024284440117L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private nk$LegacyTexture(String var1_1, String var2_2) {
        var4_3 /* !! */  = nk$LegacyTexture.b;
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                super();
                this.value = var1_1;
                this.signature = var2_2;
                return;
            }
            case 0: {
                var4_3 /* !! */  = (int)nk$LegacyTexture.cptr("cptu", cptm(int ), (int)0);
            }
            case 1: {
                while (true) {
                    var4_3 /* !! */  = (int)nk$LegacyTexture.cptr("cptx", cptm(int ), (int)1);
                }
            }
            case 2: 
        }
        while (true) {
            var4_3 /* !! */  = (int)nk$LegacyTexture.cptr("cpty", cptm(int ), (int)2);
        }
    }

    private static /* synthetic */ void cqas() {
        nk$LegacyTexture.cpto[0] = 368460795;
        nk$LegacyTexture.cpto[1] = 1162939527;
        nk$LegacyTexture.cpto[2] = -807048429;
        nk$LegacyTexture.cpto[3] = -694805083;
        nk$LegacyTexture.cpto[4] = 1619225712;
        nk$LegacyTexture.cpto[5] = 247522808;
        nk$LegacyTexture.cpto[6] = 1725859453;
        nk$LegacyTexture.cpto[7] = -1634111892;
        nk$LegacyTexture.cpto[8] = -1568059707;
        nk$LegacyTexture.cpto[9] = -2069868874;
        nk$LegacyTexture.cpto[10] = -998254920;
        nk$LegacyTexture.cpto[11] = -276422139;
        nk$LegacyTexture.cpto[12] = 855407061;
        nk$LegacyTexture.cpto[13] = -1844259443;
        nk$LegacyTexture.cpto[14] = 227119465;
        nk$LegacyTexture.cpto[15] = -1328388298;
        nk$LegacyTexture.cpto[16] = -733883189;
        nk$LegacyTexture.cpto[17] = -667903502;
        nk$LegacyTexture.cpto[18] = -979800624;
        nk$LegacyTexture.cpto[19] = -23847456;
        nk$LegacyTexture.cpto[20] = 796316323;
        nk$LegacyTexture.cpto[21] = -1406938255;
        nk$LegacyTexture.cpto[22] = -1664490518;
        nk$LegacyTexture.cpto[23] = -1478989978;
        nk$LegacyTexture.cpto[24] = 1719739;
        nk$LegacyTexture.cpto[25] = 1732264785;
        nk$LegacyTexture.cpto[26] = 133347515;
        nk$LegacyTexture.cpto[27] = 85941235;
        nk$LegacyTexture.cpto[28] = 696518362;
        nk$LegacyTexture.cpto[29] = 1656981471;
        nk$LegacyTexture.cpto[30] = -1448519573;
        nk$LegacyTexture.cpto[31] = 1952604307;
        nk$LegacyTexture.cpto[32] = 622178420;
        nk$LegacyTexture.cpto[33] = -602382057;
        nk$LegacyTexture.cpto[34] = 1790922271;
        nk$LegacyTexture.cpto[35] = 1981050895;
        nk$LegacyTexture.cpto[36] = 1821120249;
        nk$LegacyTexture.cpto[37] = 1934658569;
        nk$LegacyTexture.cpto[38] = -1982414649;
        nk$LegacyTexture.cpto[39] = -1597070386;
        nk$LegacyTexture.cpto[40] = -369145767;
        nk$LegacyTexture.cpto[41] = -745234862;
        nk$LegacyTexture.cpto[42] = -1911196730;
        nk$LegacyTexture.cpto[43] = -721962598;
        nk$LegacyTexture.cpto[44] = 584304586;
        nk$LegacyTexture.cpto[45] = -506614388;
        nk$LegacyTexture.cpto[46] = 1490860462;
        nk$LegacyTexture.cpto[47] = 1026983914;
        nk$LegacyTexture.cpto[48] = 1539708821;
    }

    private static /* synthetic */ void cqav() {
        nk$LegacyTexture.cptq[0] = 368460794;
        nk$LegacyTexture.cptq[1] = 1162939527;
        nk$LegacyTexture.cptq[2] = -807048429;
        nk$LegacyTexture.cptq[3] = -694805084;
        nk$LegacyTexture.cptq[4] = 1806186921;
        nk$LegacyTexture.cptq[5] = 247522810;
        nk$LegacyTexture.cptq[6] = 1725859454;
        nk$LegacyTexture.cptq[7] = -1634111892;
        nk$LegacyTexture.cptq[8] = -1568059706;
        nk$LegacyTexture.cptq[9] = -2069868873;
        nk$LegacyTexture.cptq[10] = 1875371055;
        nk$LegacyTexture.cptq[11] = 276422138;
        nk$LegacyTexture.cptq[12] = 223574909;
        nk$LegacyTexture.cptq[13] = 1844259442;
        nk$LegacyTexture.cptq[14] = -350888369;
        nk$LegacyTexture.cptq[15] = 1919447798;
        nk$LegacyTexture.cptq[16] = -733883190;
        nk$LegacyTexture.cptq[17] = -667903502;
        nk$LegacyTexture.cptq[18] = -979800621;
        nk$LegacyTexture.cptq[19] = -23847456;
        nk$LegacyTexture.cptq[20] = -796316324;
        nk$LegacyTexture.cptq[21] = 2045584711;
        nk$LegacyTexture.cptq[22] = -1664490518;
        nk$LegacyTexture.cptq[23] = -1478989977;
        nk$LegacyTexture.cptq[24] = 247596344;
        nk$LegacyTexture.cptq[25] = 1732264785;
        nk$LegacyTexture.cptq[26] = 133347515;
        nk$LegacyTexture.cptq[27] = 85941235;
        nk$LegacyTexture.cptq[28] = 696518363;
        nk$LegacyTexture.cptq[29] = -1656981472;
        nk$LegacyTexture.cptq[30] = 720673118;
        nk$LegacyTexture.cptq[31] = 1952604306;
        nk$LegacyTexture.cptq[32] = 945511782;
        nk$LegacyTexture.cptq[33] = 602382056;
        nk$LegacyTexture.cptq[34] = -1303944902;
        nk$LegacyTexture.cptq[35] = 1981050894;
        nk$LegacyTexture.cptq[36] = 2147447429;
        nk$LegacyTexture.cptq[37] = 1934658570;
        nk$LegacyTexture.cptq[38] = -1982414649;
        nk$LegacyTexture.cptq[39] = -1597070385;
        nk$LegacyTexture.cptq[40] = -369145765;
        nk$LegacyTexture.cptq[41] = 745234861;
        nk$LegacyTexture.cptq[42] = -1550923399;
        nk$LegacyTexture.cptq[43] = -721962597;
        nk$LegacyTexture.cptq[44] = 19385901;
        nk$LegacyTexture.cptq[45] = -506614386;
        nk$LegacyTexture.cptq[46] = 1490860461;
        nk$LegacyTexture.cptq[47] = 1026983912;
        nk$LegacyTexture.cptq[48] = 1539708820;
    }

    private static /* synthetic */ long cpub(int n2) {
        return cpud[n2] ^ cpuf[n2];
    }

    /*
     * Enabled aggressive block sorting
     */
    public String value() {
        boolean bl2;
        while (true) {
            long l2;
            Object object;
            if ((object = (l2 = gc - nk$LegacyTexture.cptr("cpxo", cpub(int ), (int)22)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object == nk$LegacyTexture.cptr("cpxq", cptm(int ), (int)29)) break;
            object = nk$LegacyTexture.cptr("cpxs", cptm(int ), (int)30);
        }
        boolean bl3 = c;
        while (true) {
            long l3;
            Object object;
            if ((object = (l3 = gc - nk$LegacyTexture.cptr("cpxu", cpub(int ), (int)23)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object == nk$LegacyTexture.cptr("cpxw", cptm(int ), (int)31)) break;
            object = nk$LegacyTexture.cptr("cpxy", cptm(int ), (int)32);
        }
        int n2 = b;
        while (true) {
            long l4;
            Object object;
            if ((object = (l4 = gc - nk$LegacyTexture.cptr("cpyd", cpub(int ), (int)24)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            if (object == nk$LegacyTexture.cptr("cpyg", cptm(int ), (int)33)) {
                bl2 = a;
                if (bl3) {
                    throw null;
                }
                break;
            }
            object = nk$LegacyTexture.cptr("cpyi", cptm(int ), (int)34);
        }
        if (bl2) return null;
        if (bl2) return null;
        while (true) {
            long l5;
            Object object;
            if ((object = (l5 = gc - nk$LegacyTexture.cptr("cpyn", cpub(int ), (int)25)) == 0L ? 0 : (l5 < 0L ? -1 : 1)) == false) continue;
            if (object == nk$LegacyTexture.cptr("cpyp", cptm(int ), (int)35)) {
                return this.value;
            }
            object = nk$LegacyTexture.cptr("cpyq", cptm(int ), (int)36);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public String signature() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = nk$LegacyTexture.gc - nk$LegacyTexture.cptr("cpzh", cpub(int ), (int)26)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == nk$LegacyTexture.cptr("cpzj", cptm(int ), (int)41)) break;
            v0 /* !! */  = (long)nk$LegacyTexture.cptr("cpzl", cptm(int ), (int)42);
        }
        var3_1 = nk$LegacyTexture.c;
        v1 /* !! */  = nk$LegacyTexture.gc;
        if (true) ** GOTO lbl12
        block17: while (true) {
            v1 /* !! */  = (long)(v2 - nk$LegacyTexture.cptr("cpzn", cpub(int ), (int)27));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1727849752: {
                    v2 = nk$LegacyTexture.cptr("cpzp", cpub(int ), (int)28);
                    continue block17;
                }
                case -1643878955: {
                    v2 = nk$LegacyTexture.cptr("cpzr", cpub(int ), (int)29);
                    continue block17;
                }
                case -1458613068: {
                    v2 = nk$LegacyTexture.cptr("cpzs", cpub(int ), (int)30);
                    continue block17;
                }
                case -24563114: {
                    break block17;
                }
            }
            break;
        }
        var2_2 /* !! */  = nk$LegacyTexture.b;
        v3 /* !! */  = nk$LegacyTexture.gc;
        if (true) ** GOTO lbl29
        block18: while (true) {
            v3 /* !! */  = (long)(nk$LegacyTexture.cptr("cpzx", cpub(int ), (int)32) - nk$LegacyTexture.cptr("cpzv", cpub(int ), (int)31));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -404101104: {
                    continue block18;
                }
                case -24563114: {
                    break block18;
                }
            }
            break;
        }
        var1_3 = nk$LegacyTexture.a;
        if (var3_1) {
            throw null;
            return null;
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block10 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_1 = nk$LegacyTexture.gc - nk$LegacyTexture.cptr("cpzz", cpub(int ), (int)33)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == nk$LegacyTexture.cptr("cqab", cptm(int ), (int)43)) break;
                    v4 /* !! */  = (long)nk$LegacyTexture.cptr("cqac", cptm(int ), (int)44);
                }
                return this.signature;
            }
lbl50:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)nk$LegacyTexture.cptr("cqaf", cptm(int ), (int)45);
                    if (!var3_1) break block10;
                    throw null;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)nk$LegacyTexture.cptr("cqag", cptm(int ), (int)46);
                if (!var3_1) ** GOTO lbl50
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)nk$LegacyTexture.cptr("cqai", cptm(int ), (int)47);
                if (!var3_1) break;
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)nk$LegacyTexture.cptr("cqam", cptm(int ), (int)48);
        ** while (!var3_1)
lbl66:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ int cptm(int n2) {
        return cpto[n2] ^ cptq[n2];
    }

    static {
        cpto = new int[49];
        cptq = new int[49];
        nk$LegacyTexture.cqas();
        nk$LegacyTexture.cqav();
        cpud = new long[34];
        cpuf = new long[34];
        nk$LegacyTexture.cqaz();
        nk$LegacyTexture.cqbc();
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public final boolean equals(Object var1_1) {
        v0 /* !! */  = nk$LegacyTexture.gc;
        if (true) ** GOTO lbl5
        block16: while (true) {
            v0 /* !! */  = (long)(v1 - nk$LegacyTexture.cptr("cpwc", cpub(int ), (int)14));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -512823445: {
                    v1 = nk$LegacyTexture.cptr("cpwd", cpub(int ), (int)15);
                    continue block16;
                }
                case -364712863: {
                    v1 = nk$LegacyTexture.cptr("cpwe", cpub(int ), (int)16);
                    continue block16;
                }
                case -24563114: {
                    break block16;
                }
            }
            break;
        }
        var4_2 = nk$LegacyTexture.c;
        while (true) {
            block29: {
                if ((v2 /* !! */  = (cfr_temp_1 = nk$LegacyTexture.gc - nk$LegacyTexture.cptr("cpwf", cpub(int ), (int)17)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v2 /* !! */  != nk$LegacyTexture.cptr("cpwg", cptm(int ), (int)20)) break block29;
                var3_3 /* !! */  = nk$LegacyTexture.b;
                v3 /* !! */  = nk$LegacyTexture.gc;
                if (true) ** GOTO lbl27
            }
            v2 /* !! */  = (long)nk$LegacyTexture.cptr("cpwh", cptm(int ), (int)21);
        }
        block18: while (true) {
            v3 /* !! */  = (long)(v4 - nk$LegacyTexture.cptr("cpwi", cpub(int ), (int)18));
lbl27:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1232958819: {
                    v4 = nk$LegacyTexture.cptr("cpwl", cpub(int ), (int)19);
                    continue block18;
                }
                case -24563114: {
                    break block18;
                }
                case 1265502573: {
                    v4 = nk$LegacyTexture.cptr("cpwn", cpub(int ), (int)20);
                    continue block18;
                }
            }
            break;
        }
        var2_4 = nk$LegacyTexture.a;
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block19: while (true) {
            block30: {
                switch (cfr_temp_0 == -2147483648 ? var3_3 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var4_2) {
                            throw null;
                        }
                        if (var2_4 != false) return (boolean)nk$LegacyTexture.cptr("cpwq", cptm(int ), (int)22);
                        if (var2_4 != false) return (boolean)nk$LegacyTexture.cptr("cpwq", cptm(int ), (int)22);
                        while (true) {
                            if ((v5 /* !! */  = (cfr_temp_2 = nk$LegacyTexture.gc - nk$LegacyTexture.cptr("cpws", cpub(int ), (int)21)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                                continue;
                            }
                            if (v5 /* !! */  == nk$LegacyTexture.cptr("cpwu", cptm(int ), (int)23)) {
                                return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{nk$LegacyTexture.class, "value;signature", "value", "signature"}, this, var1_1);
                            }
                            v5 /* !! */  = (long)nk$LegacyTexture.cptr("cpwx", cptm(int ), (int)24);
                        }
                    }
                    case 1: {
                        ** GOTO lbl59
                    }
                    case 3: {
                        var3_3 /* !! */  = (int)nk$LegacyTexture.cptr("cpxj", cptm(int ), (int)28);
                        if (var4_2) {
                            throw null;
                        }
lbl59:
                        // 3 sources

                        var3_3 /* !! */  = (int)nk$LegacyTexture.cptr("cpxd", cptm(int ), (int)26);
                        cfr_temp_0 = 2;
                        if (var4_2) {
                            throw null;
                        }
                        break block30;
                    }
                    case 0: {
                        var3_3 /* !! */  = (int)nk$LegacyTexture.cptr("cpxa", cptm(int ), (int)25);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 2: 
                }
                ** GOTO lbl73
            }
            do {
                if (true) continue block19;
lbl73:
                // 2 sources

                var3_3 /* !! */  = (int)nk$LegacyTexture.cptr("cpxg", cptm(int ), (int)27);
                cfr_temp_0 = 0;
            } while (!var4_2);
            break;
        }
        throw null;
    }

    private static /* synthetic */ void cqaz() {
        nk$LegacyTexture.cpud[0] = 8064302307661946227L;
        nk$LegacyTexture.cpud[1] = -1644169237823879297L;
        nk$LegacyTexture.cpud[2] = 1794760422677523632L;
        nk$LegacyTexture.cpud[3] = -8649507178176089448L;
        nk$LegacyTexture.cpud[4] = -2406830761990850475L;
        nk$LegacyTexture.cpud[5] = -2248930957499998292L;
        nk$LegacyTexture.cpud[6] = 2681818922587313971L;
        nk$LegacyTexture.cpud[7] = 1712292611561615155L;
        nk$LegacyTexture.cpud[8] = 2241717009004451804L;
        nk$LegacyTexture.cpud[9] = 7281690239212942979L;
        nk$LegacyTexture.cpud[10] = 4479765059069569564L;
        nk$LegacyTexture.cpud[11] = -6410089720575942240L;
        nk$LegacyTexture.cpud[12] = 3336491002285335568L;
        nk$LegacyTexture.cpud[13] = 4816412588934817251L;
        nk$LegacyTexture.cpud[14] = -1796060026215128982L;
        nk$LegacyTexture.cpud[15] = -6145683729798534251L;
        nk$LegacyTexture.cpud[16] = 3694655428138342501L;
        nk$LegacyTexture.cpud[17] = 7088480737723739521L;
        nk$LegacyTexture.cpud[18] = -3545676336295348541L;
        nk$LegacyTexture.cpud[19] = -5186090226324586388L;
        nk$LegacyTexture.cpud[20] = 3303636012792732873L;
        nk$LegacyTexture.cpud[21] = 7348822003108270900L;
        nk$LegacyTexture.cpud[22] = 5292114233786215517L;
        nk$LegacyTexture.cpud[23] = -9162370397564646504L;
        nk$LegacyTexture.cpud[24] = -7824923244377431721L;
        nk$LegacyTexture.cpud[25] = 7668544199974807650L;
        nk$LegacyTexture.cpud[26] = -7186431894402252141L;
        nk$LegacyTexture.cpud[27] = 183891985748450999L;
        nk$LegacyTexture.cpud[28] = 5569264018667245799L;
        nk$LegacyTexture.cpud[29] = 583249193118211839L;
        nk$LegacyTexture.cpud[30] = -4364156412852955916L;
        nk$LegacyTexture.cpud[31] = -2878789928173936019L;
        nk$LegacyTexture.cpud[32] = 9199434616968846190L;
        nk$LegacyTexture.cpud[33] = -2241104052844144361L;
    }
}

