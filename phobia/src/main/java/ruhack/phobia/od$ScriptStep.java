/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.function.BooleanSupplier;
import ruhack.phobia.oe;

public final class od$ScriptStep
implements Comparable<od$ScriptStep> {
    private int priority;
    private static int[] bqxa;
    private oe action;
    public static final boolean a;
    public static final boolean c;
    private int delay;
    protected static final long dw = -7660042766962418991L;
    private BooleanSupplier condition;
    private static long[] bqxs;
    private static long[] bqxt;
    public static final int b;
    private static int[] bqwv;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public oe action() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = od$ScriptStep.dw - od$ScriptStep.bqxc("brav", bqxq(int ), (int)22)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == od$ScriptStep.bqxc("braw", bqwt(int ), (int)27)) break;
            v0 /* !! */  = (long)od$ScriptStep.bqxc("brax", bqwt(int ), (int)28);
        }
        var3_1 = od$ScriptStep.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = od$ScriptStep.dw - od$ScriptStep.bqxc("bray", bqxq(int ), (int)23)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == od$ScriptStep.bqxc("brbc", bqwt(int ), (int)29)) break;
            v1 /* !! */  = (long)od$ScriptStep.bqxc("brbd", bqwt(int ), (int)30);
        }
        var2_2 /* !! */  = od$ScriptStep.b;
        v2 /* !! */  = od$ScriptStep.dw;
        if (true) ** GOTO lbl19
        block12: while (true) {
            v2 /* !! */  = (long)(od$ScriptStep.bqxc("brbg", bqxq(int ), (int)25) - od$ScriptStep.bqxc("brbe", bqxq(int ), (int)24));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 652712657: {
                    break block12;
                }
                case 701388050: {
                    continue block12;
                }
            }
            break;
        }
        var1_3 = od$ScriptStep.a;
        if (var3_1) {
            throw null;
lbl27:
            // 2 sources

            return null;
        }
        if (var1_3) ** GOTO lbl27
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = od$ScriptStep.dw - od$ScriptStep.bqxc("brbk", bqxq(int ), (int)26)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == od$ScriptStep.bqxc("brbm", bqwt(int ), (int)31)) break;
                    v3 /* !! */  = (long)od$ScriptStep.bqxc("brbp", bqwt(int ), (int)32);
                }
                return this.action;
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)od$ScriptStep.bqxc("brbq", bqwt(int ), (int)33);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
lbl46:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)od$ScriptStep.bqxc("brbr", bqwt(int ), (int)34);
                if (!var3_1) break;
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)od$ScriptStep.bqxc("brbt", bqwt(int ), (int)35);
                if (!var3_1) ** GOTO lbl46
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)od$ScriptStep.bqxc("brbv", bqwt(int ), (int)36);
        ** while (!var3_1)
lbl57:
        // 1 sources

        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public od$ScriptStep(int var1_1, oe var2_2, BooleanSupplier var3_3, int var4_4) {
        var6_5 /* !! */  = od$ScriptStep.b;
        super();
        this.delay = var1_1;
        this.action = var2_2;
        if (var6_5 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block9: while (true) {
            block13: {
                switch (cfr_temp_0 == -2147483648 ? var6_5 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        this.condition = var3_3;
                        this.priority = var4_4;
                        return;
                    }
                    case 0: {
                        var6_5 /* !! */  = (int)od$ScriptStep.bqxc("bqxd", bqwt(int ), (int)0);
                        cfr_temp_0 = 3;
                        break block13;
                    }
                    case 1: {
                        while (true) {
                            var6_5 /* !! */  = (int)od$ScriptStep.bqxc("bqxe", bqwt(int ), (int)1);
                        }
                    }
                    case 2: {
                        ** GOTO lbl29
                    }
                    case 5: {
                        while (true) {
                            var6_5 /* !! */  = (int)od$ScriptStep.bqxc("bqxm", bqwt(int ), (int)5);
                        }
                    }
                    case 6: {
                        var6_5 /* !! */  = (int)od$ScriptStep.bqxc("bqxn", bqwt(int ), (int)6);
lbl29:
                        // 2 sources

                        var6_5 /* !! */  = (int)od$ScriptStep.bqxc("bqxf", bqwt(int ), (int)2);
                        cfr_temp_0 = 4;
                        break block13;
                    }
                    case 3: {
                        var6_5 /* !! */  = (int)od$ScriptStep.bqxc("bqxh", bqwt(int ), (int)3);
                    }
                    case 4: 
                }
                ** GOTO lbl39
            }
            while (true) {
                if (true) continue block9;
lbl39:
                // 2 sources

                var6_5 /* !! */  = (int)od$ScriptStep.bqxc("bqxk", bqwt(int ), (int)4);
                cfr_temp_0 = 3;
            }
            break;
        }
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public od$ScriptStep priority(int var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_1 = od$ScriptStep.dw - od$ScriptStep.bqxc("brhj", bqxq(int ), (int)64)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == od$ScriptStep.bqxc("brhl", bqwt(int ), (int)85)) break;
            v0 /* !! */  = (long)od$ScriptStep.bqxc("brhm", bqwt(int ), (int)86);
        }
        var4_2 = od$ScriptStep.c;
        while (true) {
            block23: {
                if ((v1 /* !! */  = (cfr_temp_2 = od$ScriptStep.dw - od$ScriptStep.bqxc("brho", bqxq(int ), (int)65)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v1 /* !! */  != od$ScriptStep.bqxc("brhq", bqwt(int ), (int)87)) break block23;
                var3_3 /* !! */  = od$ScriptStep.b;
                if (var3_3 /* !! */  != 0) {
                    break;
                }
                ** GOTO lbl-1000
            }
            v1 /* !! */  = (long)od$ScriptStep.bqxc("brhs", bqwt(int ), (int)88);
        }
        cfr_temp_0 = -2147483648;
        block13: do {
            switch (cfr_temp_0 == -2147483648 ? var3_3 /* !! */  : cfr_temp_0) {
                default: lbl-1000:
                // 2 sources

                {
                    v2 /* !! */  = od$ScriptStep.dw;
                    block14: while (true) {
                        switch ((int)v2 /* !! */ ) {
                            case -64781003: {
                                v2 /* !! */  = (long)(od$ScriptStep.bqxc("brhw", bqxq(int ), (int)67) - od$ScriptStep.bqxc("brhu", bqxq(int ), (int)66));
                                continue block14;
                            }
                            case 652712657: {
                                break block14;
                            }
                        }
                        break;
                    }
                    var2_4 = od$ScriptStep.a;
                    if (var4_2) {
                        throw null;
                    }
                    if (var2_4 || var2_4) ** GOTO lbl39
                    while (true) {
                        if ((v3 /* !! */  = (cfr_temp_3 = od$ScriptStep.dw - od$ScriptStep.bqxc("brhy", bqxq(int ), (int)68)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                        if (v3 /* !! */  == od$ScriptStep.bqxc("brhz", bqwt(int ), (int)89)) {
                            this.priority = var1_1;
                            if (!var2_4) break;
                        }
                        ** GOTO lbl40
lbl39:
                        // 2 sources

                        return null;
lbl40:
                        // 1 sources

                        v3 /* !! */  = (long)od$ScriptStep.bqxc("bric", bqwt(int ), (int)90);
                    }
                    return this;
                }
                case 2: {
                    var3_3 /* !! */  = (int)od$ScriptStep.bqxc("brii", bqwt(int ), (int)93);
                    cfr_temp_0 = 0;
                    if (!var4_2) continue block13;
                    throw null;
                }
                case 3: {
                    var3_3 /* !! */  = (int)od$ScriptStep.bqxc("brik", bqwt(int ), (int)94);
                    if (var4_2) {
                        throw null;
                    }
                }
                case 0: {
                    ** GOTO lbl58
                }
                case 4: {
                    var3_3 /* !! */  = (int)od$ScriptStep.bqxc("brim", bqwt(int ), (int)95);
                    if (var4_2) {
                        throw null;
                    }
lbl58:
                    // 3 sources

                    var3_3 /* !! */  = (int)od$ScriptStep.bqxc("brie", bqwt(int ), (int)91);
                    if (var4_2) {
                        throw null;
                    }
                }
                case 1: 
            }
            break;
        } while (true);
        do {
            var3_3 /* !! */  = (int)od$ScriptStep.bqxc("brig", bqwt(int ), (int)92);
        } while (!var4_2);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public BooleanSupplier condition() {
        v0 /* !! */  = od$ScriptStep.dw;
        if (true) ** GOTO lbl5
        block22: while (true) {
            v0 /* !! */  = (long)(v1 - od$ScriptStep.bqxc("brca", bqxq(int ), (int)27));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1178867841: {
                    v1 = od$ScriptStep.bqxc("brcb", bqxq(int ), (int)28);
                    continue block22;
                }
                case 652712657: {
                    break block22;
                }
                case 1973467690: {
                    v1 = od$ScriptStep.bqxc("brcd", bqxq(int ), (int)29);
                    continue block22;
                }
            }
            break;
        }
        var3_1 = od$ScriptStep.c;
        v2 /* !! */  = od$ScriptStep.dw;
        if (true) ** GOTO lbl19
        block23: while (true) {
            v2 /* !! */  = (long)(v3 - od$ScriptStep.bqxc("brcf", bqxq(int ), (int)30));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1035470023: {
                    v3 = od$ScriptStep.bqxc("brcg", bqxq(int ), (int)31);
                    continue block23;
                }
                case 652712657: {
                    break block23;
                }
                case 1677737457: {
                    v3 = od$ScriptStep.bqxc("brci", bqxq(int ), (int)32);
                    continue block23;
                }
            }
            break;
        }
        var2_2 /* !! */  = od$ScriptStep.b;
        v4 /* !! */  = od$ScriptStep.dw;
        if (true) ** GOTO lbl33
        block24: while (true) {
            v4 /* !! */  = (long)(v5 - od$ScriptStep.bqxc("brck", bqxq(int ), (int)33));
lbl33:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1705702755: {
                    v5 = od$ScriptStep.bqxc("brco", bqxq(int ), (int)34);
                    continue block24;
                }
                case -1147257880: {
                    v5 = od$ScriptStep.bqxc("brcp", bqxq(int ), (int)35);
                    continue block24;
                }
                case -1019033087: {
                    v5 = od$ScriptStep.bqxc("brcq", bqxq(int ), (int)36);
                    continue block24;
                }
                case 652712657: {
                    break block24;
                }
            }
            break;
        }
        var1_3 = od$ScriptStep.a;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_1) {
                    throw null;
                }
                if (var1_3 != false) return null;
                if (var1_3 != false) return null;
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_0 = od$ScriptStep.dw - od$ScriptStep.bqxc("brct", bqxq(int ), (int)37)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v6 /* !! */  == od$ScriptStep.bqxc("brcu", bqwt(int ), (int)37)) {
                        return this.condition;
                    }
                    v6 /* !! */  = (long)od$ScriptStep.bqxc("brcw", bqwt(int ), (int)38);
                }
            }
            case 0: {
                ** GOTO lbl66
            }
            case 3: {
                var2_2 /* !! */  = (int)od$ScriptStep.bqxc("brde", bqwt(int ), (int)42);
                if (var3_1) {
                    throw null;
                }
lbl66:
                // 3 sources

                var2_2 /* !! */  = (int)od$ScriptStep.bqxc("brdb", bqwt(int ), (int)39);
                if (var3_1) {
                    throw null;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)od$ScriptStep.bqxc("brdc", bqwt(int ), (int)40);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: 
        }
        do {
            var2_2 /* !! */  = (int)od$ScriptStep.bqxc("brdd", bqwt(int ), (int)41);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ void brky() {
        od$ScriptStep.bqxs[0] = -8089319825140223196L;
        od$ScriptStep.bqxs[1] = 7009437587328779039L;
        od$ScriptStep.bqxs[2] = 7914168098444196756L;
        od$ScriptStep.bqxs[3] = 4735912301950471688L;
        od$ScriptStep.bqxs[4] = 5898900265112883050L;
        od$ScriptStep.bqxs[5] = -6156289051135265983L;
        od$ScriptStep.bqxs[6] = 7435222307175066311L;
        od$ScriptStep.bqxs[7] = 7576883963908870327L;
        od$ScriptStep.bqxs[8] = -8027918257510181970L;
        od$ScriptStep.bqxs[9] = -3013167140761961014L;
        od$ScriptStep.bqxs[10] = -2084718824557563977L;
        od$ScriptStep.bqxs[11] = -3070614916449658623L;
        od$ScriptStep.bqxs[12] = 7358022554863625344L;
        od$ScriptStep.bqxs[13] = 600433340211648681L;
        od$ScriptStep.bqxs[14] = -5663722863913617952L;
        od$ScriptStep.bqxs[15] = -1055792504795543495L;
        od$ScriptStep.bqxs[16] = -3402871167623978795L;
        od$ScriptStep.bqxs[17] = 4858543504059935497L;
        od$ScriptStep.bqxs[18] = -436806004918097327L;
        od$ScriptStep.bqxs[19] = -8166941765719676384L;
        od$ScriptStep.bqxs[20] = -4739713427133665733L;
        od$ScriptStep.bqxs[21] = 4841478944505974831L;
        od$ScriptStep.bqxs[22] = 7549355957557376524L;
        od$ScriptStep.bqxs[23] = 5862447743440858401L;
        od$ScriptStep.bqxs[24] = 3295832240011081958L;
        od$ScriptStep.bqxs[25] = 1791138053906962496L;
        od$ScriptStep.bqxs[26] = 6103617006737903881L;
        od$ScriptStep.bqxs[27] = -1788223209095831901L;
        od$ScriptStep.bqxs[28] = -2088842282970080588L;
        od$ScriptStep.bqxs[29] = 181416327816778365L;
        od$ScriptStep.bqxs[30] = -6662981553808245303L;
        od$ScriptStep.bqxs[31] = 7210637104873267206L;
        od$ScriptStep.bqxs[32] = -8880095118181601594L;
        od$ScriptStep.bqxs[33] = -4014377579919694368L;
        od$ScriptStep.bqxs[34] = -3812908791752367989L;
        od$ScriptStep.bqxs[35] = -7881293634123783383L;
        od$ScriptStep.bqxs[36] = -1320024637172658320L;
        od$ScriptStep.bqxs[37] = -2900463961636318639L;
        od$ScriptStep.bqxs[38] = 6394476911843555980L;
        od$ScriptStep.bqxs[39] = 7358337404713363923L;
        od$ScriptStep.bqxs[40] = 8997868183028465628L;
        od$ScriptStep.bqxs[41] = 8027047185050706812L;
        od$ScriptStep.bqxs[42] = -6577425897326041109L;
        od$ScriptStep.bqxs[43] = -5180134573003475032L;
        od$ScriptStep.bqxs[44] = 3489891011555458225L;
        od$ScriptStep.bqxs[45] = 5079003314261498121L;
        od$ScriptStep.bqxs[46] = 2181411023156447753L;
        od$ScriptStep.bqxs[47] = -8628536614409347276L;
        od$ScriptStep.bqxs[48] = -632442768382314395L;
        od$ScriptStep.bqxs[49] = 4625488233644732415L;
        od$ScriptStep.bqxs[50] = 919616844164080146L;
        od$ScriptStep.bqxs[51] = -3980629574817526905L;
        od$ScriptStep.bqxs[52] = 5740478439682407065L;
        od$ScriptStep.bqxs[53] = 2673429052895308527L;
        od$ScriptStep.bqxs[54] = 1592145573599465828L;
        od$ScriptStep.bqxs[55] = -8475398873981747376L;
        od$ScriptStep.bqxs[56] = -2621880542417697518L;
        od$ScriptStep.bqxs[57] = 681553978087386096L;
        od$ScriptStep.bqxs[58] = 5496911464958126103L;
        od$ScriptStep.bqxs[59] = -6652593817087531602L;
        od$ScriptStep.bqxs[60] = 1845585968436837381L;
        od$ScriptStep.bqxs[61] = -1479495658871538068L;
        od$ScriptStep.bqxs[62] = 8870303948424304867L;
        od$ScriptStep.bqxs[63] = 7440170846079106883L;
        od$ScriptStep.bqxs[64] = -2535385680877475350L;
        od$ScriptStep.bqxs[65] = 513548705985979539L;
        od$ScriptStep.bqxs[66] = 367263090643670669L;
        od$ScriptStep.bqxs[67] = -2012928802288645378L;
        od$ScriptStep.bqxs[68] = 7979912532856163839L;
        od$ScriptStep.bqxs[69] = -4679598463965451049L;
        od$ScriptStep.bqxs[70] = -5824721786161961849L;
        od$ScriptStep.bqxs[71] = -1152352769125526051L;
        od$ScriptStep.bqxs[72] = -925258751307314461L;
        od$ScriptStep.bqxs[73] = -5653895637402671591L;
        od$ScriptStep.bqxs[74] = -1396147157205305714L;
        od$ScriptStep.bqxs[75] = -78331583263268950L;
    }

    private static /* synthetic */ void brki() {
        od$ScriptStep.bqwv[100] = -1045488516;
        od$ScriptStep.bqwv[101] = 1711303291;
        od$ScriptStep.bqwv[102] = 1589435220;
        od$ScriptStep.bqwv[103] = -2026090578;
        od$ScriptStep.bqwv[104] = 1572445614;
    }

    /*
     * Enabled aggressive block sorting
     */
    public od$ScriptStep delay(int n2) {
        boolean bl2;
        while (true) {
            long l2;
            Object object;
            if ((object = (l2 = dw - od$ScriptStep.bqxc("brek", bqxq(int ), (int)45)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object == od$ScriptStep.bqxc("brem", bqwt(int ), (int)52)) break;
            object = od$ScriptStep.bqxc("bren", bqwt(int ), (int)53);
        }
        boolean bl3 = c;
        while (true) {
            long l3;
            Object object;
            if ((object = (l3 = dw - od$ScriptStep.bqxc("brep", bqxq(int ), (int)46)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object == od$ScriptStep.bqxc("breq", bqwt(int ), (int)54)) break;
            object = od$ScriptStep.bqxc("bret", bqwt(int ), (int)55);
        }
        int n3 = b;
        while (true) {
            long l4;
            Object object;
            if ((object = (l4 = dw - od$ScriptStep.bqxc("brev", bqxq(int ), (int)47)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            if (object == od$ScriptStep.bqxc("brew", bqwt(int ), (int)56)) {
                bl2 = a;
                if (bl3) {
                    throw null;
                }
                break;
            }
            object = od$ScriptStep.bqxc("brex", bqwt(int ), (int)57);
        }
        if (bl2 || bl2) return null;
        while (true) {
            Object object;
            block7: {
                long l5;
                if ((object = (l5 = dw - od$ScriptStep.bqxc("brey", bqxq(int ), (int)48)) == 0L ? 0 : (l5 < 0L ? -1 : 1)) == false) continue;
                if (object == od$ScriptStep.bqxc("brfa", bqwt(int ), (int)58)) {
                    this.delay = n2;
                    if (!bl2) return this;
                }
                break block7;
                return null;
            }
            object = od$ScriptStep.bqxc("brfd", bqwt(int ), (int)59);
        }
    }

    private static /* synthetic */ long bqxq(int n2) {
        return bqxs[n2] ^ bqxt[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public int compareTo(od$ScriptStep var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = od$ScriptStep.dw - od$ScriptStep.bqxc("bqxu", bqxq(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == od$ScriptStep.bqxc("bqxw", bqwt(int ), (int)7)) break;
            v0 /* !! */  = (long)od$ScriptStep.bqxc("bqxx", bqwt(int ), (int)8);
        }
        var4_2 = od$ScriptStep.c;
        v1 /* !! */  = od$ScriptStep.dw;
        if (true) ** GOTO lbl11
        block16: while (true) {
            v1 /* !! */  = (long)(od$ScriptStep.bqxc("bqyc", bqxq(int ), (int)2) - od$ScriptStep.bqxc("bqyb", bqxq(int ), (int)1));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 652712657: {
                    break block16;
                }
                case 1493284359: {
                    continue block16;
                }
            }
            break;
        }
        var3_3 /* !! */  = od$ScriptStep.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = od$ScriptStep.dw - od$ScriptStep.bqxc("bqyd", bqxq(int ), (int)3)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == od$ScriptStep.bqxc("bqye", bqwt(int ), (int)9)) break;
            v2 /* !! */  = (long)od$ScriptStep.bqxc("bqyg", bqwt(int ), (int)10);
        }
        var2_4 = od$ScriptStep.a;
        if (var4_2) {
            throw null;
            return (int)od$ScriptStep.bqxc("bqyh", bqwt(int ), (int)11);
        }
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4 || var2_4) ** continue;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = od$ScriptStep.dw - od$ScriptStep.bqxc("bqyj", bqxq(int ), (int)4)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == od$ScriptStep.bqxc("bqyl", bqwt(int ), (int)12)) break;
                    v3 /* !! */  = (long)od$ScriptStep.bqxc("bqyn", bqwt(int ), (int)13);
                }
                v4 = var1_1.priority();
                v5 /* !! */  = od$ScriptStep.dw;
                if (true) ** GOTO lbl41
                block20: while (true) {
                    v5 /* !! */  = (long)(v6 - od$ScriptStep.bqxc("bqyo", bqxq(int ), (int)5));
lbl41:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -2089852969: {
                            v6 = od$ScriptStep.bqxc("bqys", bqxq(int ), (int)6);
                            continue block20;
                        }
                        case -42880020: {
                            v6 = od$ScriptStep.bqxc("bqyt", bqxq(int ), (int)7);
                            continue block20;
                        }
                        case 652712657: {
                            break block20;
                        }
                    }
                    break;
                }
                v7 = this.priority();
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_3 = od$ScriptStep.dw - od$ScriptStep.bqxc("bqyu", bqxq(int ), (int)8)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == od$ScriptStep.bqxc("bqyw", bqwt(int ), (int)14)) break;
                    v8 /* !! */  = (long)od$ScriptStep.bqxc("bqyx", bqwt(int ), (int)15);
                }
                return Integer.compare(v4, v7);
            }
            case 0: {
                var3_3 /* !! */  = (int)od$ScriptStep.bqxc("bqyz", bqwt(int ), (int)16);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl66
            }
            case 1: {
                var3_3 /* !! */  = (int)od$ScriptStep.bqxc("bqzb", bqwt(int ), (int)17);
                if (!var4_2) break;
                throw null;
            }
lbl66:
            // 2 sources

            case 2: {
                var3_3 /* !! */  = (int)od$ScriptStep.bqxc("bqzd", bqwt(int ), (int)18);
                if (!var4_2) break;
                throw null;
            }
            case 3: 
        }
        do {
            var3_3 /* !! */  = (int)od$ScriptStep.bqxc("bqzf", bqwt(int ), (int)19);
        } while (!var4_2);
        throw null;
    }

    static {
        bqwv = new int[105];
        bqxa = new int[105];
        od$ScriptStep.brjy();
        od$ScriptStep.brki();
        od$ScriptStep.brkk();
        od$ScriptStep.brkv();
        bqxs = new long[76];
        bqxt = new long[76];
        od$ScriptStep.brky();
        od$ScriptStep.brlj();
    }

    private static /* synthetic */ void brlj() {
        od$ScriptStep.bqxt[0] = 1697420528616201071L;
        od$ScriptStep.bqxt[1] = -8754184683291577596L;
        od$ScriptStep.bqxt[2] = 8197816100967674745L;
        od$ScriptStep.bqxt[3] = -582624982866546942L;
        od$ScriptStep.bqxt[4] = 6457419990355476660L;
        od$ScriptStep.bqxt[5] = -6514259486882088508L;
        od$ScriptStep.bqxt[6] = -8176408474110451709L;
        od$ScriptStep.bqxt[7] = 1565746381122212506L;
        od$ScriptStep.bqxt[8] = -622590205492429138L;
        od$ScriptStep.bqxt[9] = 3589884029014499892L;
        od$ScriptStep.bqxt[10] = -4468726802373180237L;
        od$ScriptStep.bqxt[11] = 7754552489187737645L;
        od$ScriptStep.bqxt[12] = 8258838190938756L;
        od$ScriptStep.bqxt[13] = -2550261965105018374L;
        od$ScriptStep.bqxt[14] = 2183733216734730811L;
        od$ScriptStep.bqxt[15] = -494064661037923855L;
        od$ScriptStep.bqxt[16] = -4056082057756125308L;
        od$ScriptStep.bqxt[17] = 3852091771172917861L;
        od$ScriptStep.bqxt[18] = 4150726077893724039L;
        od$ScriptStep.bqxt[19] = 6009715803879028290L;
        od$ScriptStep.bqxt[20] = -519623048713046121L;
        od$ScriptStep.bqxt[21] = -642360417667556274L;
        od$ScriptStep.bqxt[22] = -4958299632941264338L;
        od$ScriptStep.bqxt[23] = 8449537213433864775L;
        od$ScriptStep.bqxt[24] = -4410871430465218108L;
        od$ScriptStep.bqxt[25] = 8759366907899183302L;
        od$ScriptStep.bqxt[26] = 6896731636625323218L;
        od$ScriptStep.bqxt[27] = -3735073971831763291L;
        od$ScriptStep.bqxt[28] = 5786894112321835136L;
        od$ScriptStep.bqxt[29] = -3632439900214934158L;
        od$ScriptStep.bqxt[30] = 2943041337821172240L;
        od$ScriptStep.bqxt[31] = 5032235883963399941L;
        od$ScriptStep.bqxt[32] = 6341024849149455845L;
        od$ScriptStep.bqxt[33] = 2366479867715218607L;
        od$ScriptStep.bqxt[34] = 7625926167697706224L;
        od$ScriptStep.bqxt[35] = 754068873294610150L;
        od$ScriptStep.bqxt[36] = -6257931200728261097L;
        od$ScriptStep.bqxt[37] = 3901505335832734773L;
        od$ScriptStep.bqxt[38] = -1765365552248419015L;
        od$ScriptStep.bqxt[39] = 6595566411135582350L;
        od$ScriptStep.bqxt[40] = 2629775837705853349L;
        od$ScriptStep.bqxt[41] = -8228379255217025309L;
        od$ScriptStep.bqxt[42] = 6601870777289432270L;
        od$ScriptStep.bqxt[43] = -8393376077387371706L;
        od$ScriptStep.bqxt[44] = -3323484508095115025L;
        od$ScriptStep.bqxt[45] = -8299925250255917789L;
        od$ScriptStep.bqxt[46] = -1489994133429054354L;
        od$ScriptStep.bqxt[47] = -2731489014315623689L;
        od$ScriptStep.bqxt[48] = 4385379594092202046L;
        od$ScriptStep.bqxt[49] = 5332033960647178723L;
        od$ScriptStep.bqxt[50] = -1237105467470311621L;
        od$ScriptStep.bqxt[51] = 2783268083100083663L;
        od$ScriptStep.bqxt[52] = -3659255057441677852L;
        od$ScriptStep.bqxt[53] = -3079934138647232937L;
        od$ScriptStep.bqxt[54] = -2762581020834112640L;
        od$ScriptStep.bqxt[55] = 8712601628059828357L;
        od$ScriptStep.bqxt[56] = 2473871354897687352L;
        od$ScriptStep.bqxt[57] = 1581042038873440522L;
        od$ScriptStep.bqxt[58] = 3798811759704609500L;
        od$ScriptStep.bqxt[59] = -2368729563673821474L;
        od$ScriptStep.bqxt[60] = -3244090820924443908L;
        od$ScriptStep.bqxt[61] = 7044117044806995309L;
        od$ScriptStep.bqxt[62] = 3754307276153627909L;
        od$ScriptStep.bqxt[63] = 3498767640967142375L;
        od$ScriptStep.bqxt[64] = -6213257649062565409L;
        od$ScriptStep.bqxt[65] = 6455167250007629154L;
        od$ScriptStep.bqxt[66] = 4272079086077018248L;
        od$ScriptStep.bqxt[67] = -3934798494292379311L;
        od$ScriptStep.bqxt[68] = 6452737204197391866L;
        od$ScriptStep.bqxt[69] = 3124924483517313595L;
        od$ScriptStep.bqxt[70] = -2578959221642269048L;
        od$ScriptStep.bqxt[71] = -6863846791683663223L;
        od$ScriptStep.bqxt[72] = 1415086575460207127L;
        od$ScriptStep.bqxt[73] = -4257067839490735328L;
        od$ScriptStep.bqxt[74] = -407681379427290711L;
        od$ScriptStep.bqxt[75] = 6185772492103794305L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public int priority() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = od$ScriptStep.dw - od$ScriptStep.bqxc("brdg", bqxq(int ), (int)38)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == od$ScriptStep.bqxc("brdi", bqwt(int ), (int)43)) break;
            v0 /* !! */  = (long)od$ScriptStep.bqxc("brdm", bqwt(int ), (int)44);
        }
        var3_1 = od$ScriptStep.c;
        v1 /* !! */  = od$ScriptStep.dw;
        if (true) ** GOTO lbl12
        block16: while (true) {
            v1 /* !! */  = (long)(od$ScriptStep.bqxc("brdp", bqxq(int ), (int)40) - od$ScriptStep.bqxc("brdn", bqxq(int ), (int)39));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 75369328: {
                    continue block16;
                }
                case 652712657: {
                    break block16;
                }
            }
            break;
        }
        var2_2 /* !! */  = od$ScriptStep.b;
        v2 /* !! */  = od$ScriptStep.dw;
        if (true) ** GOTO lbl22
        block17: while (true) {
            v2 /* !! */  = (long)(v3 - od$ScriptStep.bqxc("brdq", bqxq(int ), (int)41));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -444529771: {
                    v3 = od$ScriptStep.bqxc("brdr", bqxq(int ), (int)42);
                    continue block17;
                }
                case 505695174: {
                    v3 = od$ScriptStep.bqxc("brds", bqxq(int ), (int)43);
                    continue block17;
                }
                case 652712657: {
                    break block17;
                }
            }
            break;
        }
        var1_3 = od$ScriptStep.a;
        if (var3_1) {
            throw null;
lbl34:
            // 2 sources

            return (int)od$ScriptStep.bqxc("brdu", bqwt(int ), (int)45);
        }
        if (var1_3) ** GOTO lbl34
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_1 = od$ScriptStep.dw - od$ScriptStep.bqxc("brdz", bqxq(int ), (int)44)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == od$ScriptStep.bqxc("breb", bqwt(int ), (int)46)) break;
                    v4 /* !! */  = (long)od$ScriptStep.bqxc("brec", bqwt(int ), (int)47);
                }
                return this.priority;
            }
lbl48:
            // 2 sources

            case 0: {
                do {
                    var2_2 /* !! */  = (int)od$ScriptStep.bqxc("bree", bqwt(int ), (int)48);
                } while (!var3_1);
                throw null;
            }
lbl53:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)od$ScriptStep.bqxc("bref", bqwt(int ), (int)49);
                if (!var3_1) ** GOTO lbl48
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)od$ScriptStep.bqxc("breg", bqwt(int ), (int)50);
                if (!var3_1) ** GOTO lbl53
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)od$ScriptStep.bqxc("brei", bqwt(int ), (int)51);
        } while (!var3_1);
        throw null;
    }

    public static /* synthetic */ CallSite bqxc(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ int bqwt(int n2) {
        return bqwv[n2] ^ bqxa[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public int delay() {
        v0 /* !! */  = od$ScriptStep.dw;
        if (true) ** GOTO lbl5
        block24: while (true) {
            v0 /* !! */  = (long)(v1 - od$ScriptStep.bqxc("bqzk", bqxq(int ), (int)9));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1594176602: {
                    v1 = od$ScriptStep.bqxc("bqzl", bqxq(int ), (int)10);
                    continue block24;
                }
                case -317027188: {
                    v1 = od$ScriptStep.bqxc("bqzm", bqxq(int ), (int)11);
                    continue block24;
                }
                case 652712657: {
                    break block24;
                }
                case 2089601082: {
                    v1 = od$ScriptStep.bqxc("bqzp", bqxq(int ), (int)12);
                    continue block24;
                }
            }
            break;
        }
        var3_1 = od$ScriptStep.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = od$ScriptStep.dw - od$ScriptStep.bqxc("bqzq", bqxq(int ), (int)13)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == od$ScriptStep.bqxc("bqzs", bqwt(int ), (int)20)) break;
            v2 /* !! */  = (long)od$ScriptStep.bqxc("bqzt", bqwt(int ), (int)21);
        }
        var2_2 /* !! */  = od$ScriptStep.b;
        v3 /* !! */  = od$ScriptStep.dw;
        if (true) ** GOTO lbl29
        block26: while (true) {
            v3 /* !! */  = (long)(v4 - od$ScriptStep.bqxc("bqzu", bqxq(int ), (int)14));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1904435457: {
                    v4 = od$ScriptStep.bqxc("bqzw", bqxq(int ), (int)15);
                    continue block26;
                }
                case -1185650053: {
                    v4 = od$ScriptStep.bqxc("bqzy", bqxq(int ), (int)16);
                    continue block26;
                }
                case 321911179: {
                    v4 = od$ScriptStep.bqxc("braa", bqxq(int ), (int)17);
                    continue block26;
                }
                case 652712657: {
                    break block26;
                }
            }
            break;
        }
        var1_3 = od$ScriptStep.a;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_1) {
                    throw null;
                    return (int)od$ScriptStep.bqxc("brac", bqwt(int ), (int)22);
                }
                if (var1_3 || var1_3) ** continue;
                v5 /* !! */  = od$ScriptStep.dw;
                if (true) ** GOTO lbl54
                block28: while (true) {
                    v5 /* !! */  = (long)(v6 - od$ScriptStep.bqxc("brag", bqxq(int ), (int)18));
lbl54:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1633386794: {
                            v6 = od$ScriptStep.bqxc("brah", bqxq(int ), (int)19);
                            continue block28;
                        }
                        case -1435744458: {
                            v6 = od$ScriptStep.bqxc("brai", bqxq(int ), (int)20);
                            continue block28;
                        }
                        case 414870233: {
                            v6 = od$ScriptStep.bqxc("braj", bqxq(int ), (int)21);
                            continue block28;
                        }
                        case 652712657: {
                            break block28;
                        }
                    }
                    break;
                }
                return this.delay;
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)od$ScriptStep.bqxc("bral", bqwt(int ), (int)23);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)od$ScriptStep.bqxc("brao", bqwt(int ), (int)24);
                if (!var3_1) break;
                throw null;
            }
            case 2: {
                do {
                    var2_2 /* !! */  = (int)od$ScriptStep.bqxc("brat", bqwt(int ), (int)25);
                } while (!var3_1);
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)od$ScriptStep.bqxc("brau", bqwt(int ), (int)26);
        ** while (!var3_1)
lbl84:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void brjy() {
        od$ScriptStep.bqwv[0] = 388793350;
        od$ScriptStep.bqwv[1] = 1504027892;
        od$ScriptStep.bqwv[2] = 1714181144;
        od$ScriptStep.bqwv[3] = 1608727258;
        od$ScriptStep.bqwv[4] = -1646432552;
        od$ScriptStep.bqwv[5] = -1679302507;
        od$ScriptStep.bqwv[6] = 893835484;
        od$ScriptStep.bqwv[7] = 1803980026;
        od$ScriptStep.bqwv[8] = -1794749853;
        od$ScriptStep.bqwv[9] = -1243901818;
        od$ScriptStep.bqwv[10] = 2061796137;
        od$ScriptStep.bqwv[11] = 1825775106;
        od$ScriptStep.bqwv[12] = 899538308;
        od$ScriptStep.bqwv[13] = -1338578178;
        od$ScriptStep.bqwv[14] = 1557563988;
        od$ScriptStep.bqwv[15] = -111339200;
        od$ScriptStep.bqwv[16] = -691789924;
        od$ScriptStep.bqwv[17] = 308897443;
        od$ScriptStep.bqwv[18] = 992717046;
        od$ScriptStep.bqwv[19] = -163064836;
        od$ScriptStep.bqwv[20] = 404837225;
        od$ScriptStep.bqwv[21] = 910121800;
        od$ScriptStep.bqwv[22] = 490888784;
        od$ScriptStep.bqwv[23] = -1047958608;
        od$ScriptStep.bqwv[24] = -1848312076;
        od$ScriptStep.bqwv[25] = 1810175055;
        od$ScriptStep.bqwv[26] = 1736451767;
        od$ScriptStep.bqwv[27] = 519346261;
        od$ScriptStep.bqwv[28] = -2132435358;
        od$ScriptStep.bqwv[29] = 740111876;
        od$ScriptStep.bqwv[30] = 637794338;
        od$ScriptStep.bqwv[31] = -1800931090;
        od$ScriptStep.bqwv[32] = 1774237193;
        od$ScriptStep.bqwv[33] = -1407172523;
        od$ScriptStep.bqwv[34] = 855648446;
        od$ScriptStep.bqwv[35] = 1966104468;
        od$ScriptStep.bqwv[36] = 114187623;
        od$ScriptStep.bqwv[37] = -996893485;
        od$ScriptStep.bqwv[38] = 900157377;
        od$ScriptStep.bqwv[39] = 179977990;
        od$ScriptStep.bqwv[40] = -1069354123;
        od$ScriptStep.bqwv[41] = -1413424867;
        od$ScriptStep.bqwv[42] = 472484306;
        od$ScriptStep.bqwv[43] = -1580053207;
        od$ScriptStep.bqwv[44] = -1998325057;
        od$ScriptStep.bqwv[45] = 1254695054;
        od$ScriptStep.bqwv[46] = 1146982191;
        od$ScriptStep.bqwv[47] = 1639011695;
        od$ScriptStep.bqwv[48] = 1104546147;
        od$ScriptStep.bqwv[49] = -1470668823;
        od$ScriptStep.bqwv[50] = 489573475;
        od$ScriptStep.bqwv[51] = -381925684;
        od$ScriptStep.bqwv[52] = 2102915694;
        od$ScriptStep.bqwv[53] = -1631195965;
        od$ScriptStep.bqwv[54] = -272585439;
        od$ScriptStep.bqwv[55] = -989240280;
        od$ScriptStep.bqwv[56] = 498039509;
        od$ScriptStep.bqwv[57] = -1482587850;
        od$ScriptStep.bqwv[58] = 26618263;
        od$ScriptStep.bqwv[59] = 346767041;
        od$ScriptStep.bqwv[60] = 2128122649;
        od$ScriptStep.bqwv[61] = 445729633;
        od$ScriptStep.bqwv[62] = -1575684204;
        od$ScriptStep.bqwv[63] = 1001804057;
        od$ScriptStep.bqwv[64] = -1877185427;
        od$ScriptStep.bqwv[65] = 2120123197;
        od$ScriptStep.bqwv[66] = 1175841172;
        od$ScriptStep.bqwv[67] = -814021656;
        od$ScriptStep.bqwv[68] = 1497294169;
        od$ScriptStep.bqwv[69] = 1852629339;
        od$ScriptStep.bqwv[70] = 1827961659;
        od$ScriptStep.bqwv[71] = 790570426;
        od$ScriptStep.bqwv[72] = 1527459846;
        od$ScriptStep.bqwv[73] = 878395751;
        od$ScriptStep.bqwv[74] = 552627646;
        od$ScriptStep.bqwv[75] = -1632081758;
        od$ScriptStep.bqwv[76] = 1498512164;
        od$ScriptStep.bqwv[77] = 1995053644;
        od$ScriptStep.bqwv[78] = 744415918;
        od$ScriptStep.bqwv[79] = 1613169226;
        od$ScriptStep.bqwv[80] = 655697834;
        od$ScriptStep.bqwv[81] = 361236109;
        od$ScriptStep.bqwv[82] = 1672714509;
        od$ScriptStep.bqwv[83] = 431012907;
        od$ScriptStep.bqwv[84] = -64591701;
        od$ScriptStep.bqwv[85] = 336294701;
        od$ScriptStep.bqwv[86] = 857602140;
        od$ScriptStep.bqwv[87] = 1072520969;
        od$ScriptStep.bqwv[88] = -581272579;
        od$ScriptStep.bqwv[89] = -728854316;
        od$ScriptStep.bqwv[90] = 1128452754;
        od$ScriptStep.bqwv[91] = 1884637443;
        od$ScriptStep.bqwv[92] = -1659242384;
        od$ScriptStep.bqwv[93] = 187481889;
        od$ScriptStep.bqwv[94] = 836116875;
        od$ScriptStep.bqwv[95] = -2048223915;
        od$ScriptStep.bqwv[96] = 922852763;
        od$ScriptStep.bqwv[97] = 568685124;
        od$ScriptStep.bqwv[98] = 1174683762;
        od$ScriptStep.bqwv[99] = 524290122;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public od$ScriptStep action(oe var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = od$ScriptStep.dw - od$ScriptStep.bqxc("brfn", bqxq(int ), (int)49)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == od$ScriptStep.bqxc("brfo", bqwt(int ), (int)65)) break;
            v0 /* !! */  = (long)od$ScriptStep.bqxc("brfp", bqwt(int ), (int)66);
        }
        var4_2 = od$ScriptStep.c;
        v1 /* !! */  = od$ScriptStep.dw;
        if (true) ** GOTO lbl11
        block18: while (true) {
            v1 /* !! */  = (long)(od$ScriptStep.bqxc("brfs", bqxq(int ), (int)51) - od$ScriptStep.bqxc("brfr", bqxq(int ), (int)50));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1532749806: {
                    continue block18;
                }
                case 652712657: {
                    break block18;
                }
            }
            break;
        }
        var3_3 /* !! */  = od$ScriptStep.b;
        v2 /* !! */  = od$ScriptStep.dw;
        if (true) ** GOTO lbl21
        block19: while (true) {
            v2 /* !! */  = (long)(v3 - od$ScriptStep.bqxc("brfu", bqxq(int ), (int)52));
lbl21:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 309781387: {
                    v3 = od$ScriptStep.bqxc("brfv", bqxq(int ), (int)53);
                    continue block19;
                }
                case 330307852: {
                    v3 = od$ScriptStep.bqxc("brfz", bqxq(int ), (int)54);
                    continue block19;
                }
                case 652712657: {
                    break block19;
                }
                case 1747721109: {
                    v3 = od$ScriptStep.bqxc("brga", bqxq(int ), (int)55);
                    continue block19;
                }
            }
            break;
        }
        var2_4 = od$ScriptStep.a;
        if (var4_2) {
            throw null;
lbl36:
            // 3 sources

            return null;
        }
        if (var2_4) ** GOTO lbl36
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** GOTO lbl36
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_1 = od$ScriptStep.dw - od$ScriptStep.bqxc("brgb", bqxq(int ), (int)56)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == od$ScriptStep.bqxc("brgc", bqwt(int ), (int)67)) break;
                    v4 /* !! */  = (long)od$ScriptStep.bqxc("brgd", bqwt(int ), (int)68);
                }
                this.action = var1_1;
                if (var2_4) ** continue;
                return this;
            }
lbl51:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)od$ScriptStep.bqxc("brge", bqwt(int ), (int)69);
                if (var4_2) {
                    throw null;
                }
            }
lbl55:
            // 4 sources

            case 1: {
                var3_3 /* !! */  = (int)od$ScriptStep.bqxc("brgi", bqwt(int ), (int)70);
                if (var4_2) {
                    throw null;
                }
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)od$ScriptStep.bqxc("brgj", bqwt(int ), (int)71);
                    if (!var4_2) ** GOTO lbl55
                    throw null;
                }
            }
            case 3: {
                var3_3 /* !! */  = (int)od$ScriptStep.bqxc("brgl", bqwt(int ), (int)72);
                if (!var4_2) ** GOTO lbl51
                throw null;
            }
            case 4: 
        }
        var3_3 /* !! */  = (int)od$ScriptStep.bqxc("brgm", bqwt(int ), (int)73);
        ** while (!var4_2)
lbl71:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void brkv() {
        od$ScriptStep.bqxa[100] = 1540060978;
        od$ScriptStep.bqxa[101] = 1711303289;
        od$ScriptStep.bqxa[102] = 1589435222;
        od$ScriptStep.bqxa[103] = -2026090577;
        od$ScriptStep.bqxa[104] = 1572445614;
    }

    private static /* synthetic */ void brkk() {
        od$ScriptStep.bqxa[0] = 388793350;
        od$ScriptStep.bqxa[1] = 1504027888;
        od$ScriptStep.bqxa[2] = 1714181147;
        od$ScriptStep.bqxa[3] = 1608727262;
        od$ScriptStep.bqxa[4] = -1646432552;
        od$ScriptStep.bqxa[5] = -1679302511;
        od$ScriptStep.bqxa[6] = 893835484;
        od$ScriptStep.bqxa[7] = -1803980027;
        od$ScriptStep.bqxa[8] = 869141118;
        od$ScriptStep.bqxa[9] = 1243901817;
        od$ScriptStep.bqxa[10] = -115200658;
        od$ScriptStep.bqxa[11] = -852777142;
        od$ScriptStep.bqxa[12] = -899538309;
        od$ScriptStep.bqxa[13] = -438670679;
        od$ScriptStep.bqxa[14] = -1557563989;
        od$ScriptStep.bqxa[15] = -2002478014;
        od$ScriptStep.bqxa[16] = -691789921;
        od$ScriptStep.bqxa[17] = 308897440;
        od$ScriptStep.bqxa[18] = 992717046;
        od$ScriptStep.bqxa[19] = -163064833;
        od$ScriptStep.bqxa[20] = -404837226;
        od$ScriptStep.bqxa[21] = -1559393092;
        od$ScriptStep.bqxa[22] = -1913855489;
        od$ScriptStep.bqxa[23] = -1047958605;
        od$ScriptStep.bqxa[24] = -1848312073;
        od$ScriptStep.bqxa[25] = 1810175052;
        od$ScriptStep.bqxa[26] = 1736451767;
        od$ScriptStep.bqxa[27] = -519346262;
        od$ScriptStep.bqxa[28] = -236754027;
        od$ScriptStep.bqxa[29] = -740111877;
        od$ScriptStep.bqxa[30] = 1441575763;
        od$ScriptStep.bqxa[31] = 1800931089;
        od$ScriptStep.bqxa[32] = -2062285183;
        od$ScriptStep.bqxa[33] = -1407172524;
        od$ScriptStep.bqxa[34] = 855648445;
        od$ScriptStep.bqxa[35] = 1966104468;
        od$ScriptStep.bqxa[36] = 114187622;
        od$ScriptStep.bqxa[37] = 996893484;
        od$ScriptStep.bqxa[38] = 341833801;
        od$ScriptStep.bqxa[39] = 179977990;
        od$ScriptStep.bqxa[40] = -1069354124;
        od$ScriptStep.bqxa[41] = -1413424867;
        od$ScriptStep.bqxa[42] = 472484306;
        od$ScriptStep.bqxa[43] = 1580053206;
        od$ScriptStep.bqxa[44] = -1381488401;
        od$ScriptStep.bqxa[45] = -56067162;
        od$ScriptStep.bqxa[46] = -1146982192;
        od$ScriptStep.bqxa[47] = -1226734702;
        od$ScriptStep.bqxa[48] = 1104546145;
        od$ScriptStep.bqxa[49] = -1470668822;
        od$ScriptStep.bqxa[50] = 489573474;
        od$ScriptStep.bqxa[51] = -381925683;
        od$ScriptStep.bqxa[52] = -2102915695;
        od$ScriptStep.bqxa[53] = -2122772121;
        od$ScriptStep.bqxa[54] = 272585438;
        od$ScriptStep.bqxa[55] = -562404068;
        od$ScriptStep.bqxa[56] = -498039510;
        od$ScriptStep.bqxa[57] = -1319796298;
        od$ScriptStep.bqxa[58] = -26618264;
        od$ScriptStep.bqxa[59] = -13070417;
        od$ScriptStep.bqxa[60] = 2128122648;
        od$ScriptStep.bqxa[61] = 445729635;
        od$ScriptStep.bqxa[62] = -1575684204;
        od$ScriptStep.bqxa[63] = 1001804058;
        od$ScriptStep.bqxa[64] = -1877185425;
        od$ScriptStep.bqxa[65] = -2120123198;
        od$ScriptStep.bqxa[66] = 1812199626;
        od$ScriptStep.bqxa[67] = 814021655;
        od$ScriptStep.bqxa[68] = -735149799;
        od$ScriptStep.bqxa[69] = 1852629337;
        od$ScriptStep.bqxa[70] = 1827961656;
        od$ScriptStep.bqxa[71] = 790570426;
        od$ScriptStep.bqxa[72] = 1527459845;
        od$ScriptStep.bqxa[73] = 878395751;
        od$ScriptStep.bqxa[74] = -552627647;
        od$ScriptStep.bqxa[75] = 1126425756;
        od$ScriptStep.bqxa[76] = -1498512165;
        od$ScriptStep.bqxa[77] = -327824181;
        od$ScriptStep.bqxa[78] = -744415919;
        od$ScriptStep.bqxa[79] = -137418297;
        od$ScriptStep.bqxa[80] = 655697833;
        od$ScriptStep.bqxa[81] = 361236110;
        od$ScriptStep.bqxa[82] = 1672714510;
        od$ScriptStep.bqxa[83] = 431012911;
        od$ScriptStep.bqxa[84] = -64591702;
        od$ScriptStep.bqxa[85] = -336294702;
        od$ScriptStep.bqxa[86] = -1936241142;
        od$ScriptStep.bqxa[87] = -1072520970;
        od$ScriptStep.bqxa[88] = 81106578;
        od$ScriptStep.bqxa[89] = 728854315;
        od$ScriptStep.bqxa[90] = 1682250448;
        od$ScriptStep.bqxa[91] = 1884637441;
        od$ScriptStep.bqxa[92] = -1659242384;
        od$ScriptStep.bqxa[93] = 187481893;
        od$ScriptStep.bqxa[94] = 836116874;
        od$ScriptStep.bqxa[95] = -2048223914;
        od$ScriptStep.bqxa[96] = 922852762;
        od$ScriptStep.bqxa[97] = 1628026171;
        od$ScriptStep.bqxa[98] = 943411273;
        od$ScriptStep.bqxa[99] = -524290123;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public od$ScriptStep condition(BooleanSupplier var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = od$ScriptStep.dw - od$ScriptStep.bqxc("brgo", bqxq(int ), (int)57)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == od$ScriptStep.bqxc("brgp", bqwt(int ), (int)74)) break;
            v0 /* !! */  = (long)od$ScriptStep.bqxc("brgq", bqwt(int ), (int)75);
        }
        var4_2 = od$ScriptStep.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = od$ScriptStep.dw - od$ScriptStep.bqxc("brgr", bqxq(int ), (int)58)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == od$ScriptStep.bqxc("brgs", bqwt(int ), (int)76)) break;
            v1 /* !! */  = (long)od$ScriptStep.bqxc("brgt", bqwt(int ), (int)77);
        }
        var3_3 /* !! */  = od$ScriptStep.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = od$ScriptStep.dw - od$ScriptStep.bqxc("brgu", bqxq(int ), (int)59)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == od$ScriptStep.bqxc("brgv", bqwt(int ), (int)78)) break;
            v2 /* !! */  = (long)od$ScriptStep.bqxc("brgw", bqwt(int ), (int)79);
        }
        var2_4 = od$ScriptStep.a;
        if (var4_2) {
            throw null;
lbl24:
            // 3 sources

            return null;
        }
        if (var2_4) ** GOTO lbl24
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** GOTO lbl24
                v3 /* !! */  = od$ScriptStep.dw;
                if (true) ** GOTO lbl35
                block17: while (true) {
                    v3 /* !! */  = (long)(v4 - od$ScriptStep.bqxc("brgx", bqxq(int ), (int)60));
lbl35:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1668552179: {
                            v4 = od$ScriptStep.bqxc("brgz", bqxq(int ), (int)61);
                            continue block17;
                        }
                        case 652712657: {
                            break block17;
                        }
                        case 1468732442: {
                            v4 = od$ScriptStep.bqxc("brha", bqxq(int ), (int)62);
                            continue block17;
                        }
                        case 1830362965: {
                            v4 = od$ScriptStep.bqxc("brhb", bqxq(int ), (int)63);
                            continue block17;
                        }
                    }
                    break;
                }
                this.condition = var1_1;
                if (var2_4) ** continue;
                return this;
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var3_3 /* !! */  = (int)od$ScriptStep.bqxc("brhc", bqwt(int ), (int)80);
                    if (!var4_2) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 1: {
                var3_3 /* !! */  = (int)od$ScriptStep.bqxc("brhd", bqwt(int ), (int)81);
                if (var4_2) {
                    throw null;
                }
            }
            case 2: {
                var3_3 /* !! */  = (int)od$ScriptStep.bqxc("brhe", bqwt(int ), (int)82);
                if (var4_2) {
                    throw null;
                }
            }
            case 3: {
                do {
                    var3_3 /* !! */  = (int)od$ScriptStep.bqxc("brhf", bqwt(int ), (int)83);
                } while (!var4_2);
                throw null;
            }
            case 4: 
        }
        var3_3 /* !! */  = (int)od$ScriptStep.bqxc("brhg", bqwt(int ), (int)84);
        ** while (!var4_2)
lbl71:
        // 1 sources

        throw null;
    }
}

