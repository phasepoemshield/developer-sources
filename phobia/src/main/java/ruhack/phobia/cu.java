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

public final class cu
implements az {
    public static final boolean c;
    private static long[] drxt;
    private static int[] drxz;
    private final class_243 to;
    private final double fallDistance;
    private static int[] drxy;
    private static final long iw = 7336003029593245547L;
    private final class_243 from;
    public static final int b;
    public static final boolean a;
    private final boolean toGround;
    private static long[] drxu;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public double getFallDistance() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = cu.iw - cu.drxv("dsbv", drxs(int ), (int)29)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == cu.drxv("dsbw", drxx(int ), (int)21)) break;
            v0 /* !! */  = (long)cu.drxv("dsbx", drxx(int ), (int)22);
        }
        var3_1 = cu.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = cu.iw - cu.drxv("dsby", drxs(int ), (int)30)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == cu.drxv("dscb", drxx(int ), (int)23)) break;
            v1 /* !! */  = (long)cu.drxv("dscc", drxx(int ), (int)24);
        }
        var2_2 /* !! */  = cu.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = cu.iw - cu.drxv("dsce", drxs(int ), (int)31)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == cu.drxv("dscg", drxx(int ), (int)25)) break;
            v2 /* !! */  = (long)cu.drxv("dsci", drxx(int ), (int)26);
        }
        var1_3 = cu.a;
        if (var3_1) {
            throw null;
            return (double)cu.drxv("dscp", dscm(int ), (int)32);
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** continue;
                v3 /* !! */  = cu.iw;
                if (true) ** GOTO lbl34
                block15: while (true) {
                    v3 /* !! */  = (long)(v4 - cu.drxv("dscr", drxs(int ), (int)33));
lbl34:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1238234086: {
                            v4 = cu.drxv("dsct", drxs(int ), (int)34);
                            continue block15;
                        }
                        case 311252179: {
                            v4 = cu.drxv("dscu", drxs(int ), (int)35);
                            continue block15;
                        }
                        case 974669675: {
                            break block15;
                        }
                    }
                    break;
                }
                return this.fallDistance;
            }
            case 0: {
                var2_2 /* !! */  = (int)cu.drxv("dscw", drxx(int ), (int)27);
                if (var3_1) {
                    throw null;
                }
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)cu.drxv("dscy", drxx(int ), (int)28);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)cu.drxv("dscz", drxx(int ), (int)29);
                if (!var3_1) break;
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)cu.drxv("dsdd", drxx(int ), (int)30);
        ** while (!var3_1)
lbl60:
        // 1 sources

        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public class_243 getFrom() {
        block25: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_1 = cu.iw - cu.drxv("drxw", drxs(int ), (int)0)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  == cu.drxv("drya", drxx(int ), (int)0)) break;
                v0 /* !! */  = (long)cu.drxv("dryb", drxx(int ), (int)1);
            }
            var3_1 = cu.c;
            while (true) {
                block26: {
                    if ((v1 /* !! */  = (cfr_temp_2 = cu.iw - cu.drxv("dryg", drxs(int ), (int)1)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v1 /* !! */  != cu.drxv("dryh", drxx(int ), (int)2)) break block26;
                    var2_2 /* !! */  = cu.b;
                    v2 /* !! */  = cu.iw;
                    if (true) ** GOTO lbl18
                }
                v1 /* !! */  = (long)cu.drxv("dryj", drxx(int ), (int)3);
            }
            block18: while (true) {
                v2 /* !! */  = (long)(v3 - cu.drxv("dryl", drxs(int ), (int)2));
lbl18:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case -1613142343: {
                        v3 = cu.drxv("dryn", drxs(int ), (int)3);
                        continue block18;
                    }
                    case 974669675: {
                        break block18;
                    }
                    case 1358491095: {
                        v3 = cu.drxv("dryp", drxs(int ), (int)4);
                        continue block18;
                    }
                    case 1496439240: {
                        v3 = cu.drxv("dryr", drxs(int ), (int)5);
                        continue block18;
                    }
                }
                break;
            }
            var1_3 = cu.a;
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            cfr_temp_0 = -2147483648;
            block19: do {
                switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var3_1) {
                            throw null;
                        }
                        if (var1_3 != false) return null;
                        if (var1_3 != false) return null;
                        v4 /* !! */  = cu.iw;
                        block20: while (true) {
                            switch ((int)v4 /* !! */ ) {
                                case 778587602: {
                                    v4 /* !! */  = (long)(cu.drxv("dryw", drxs(int ), (int)7) - cu.drxv("dryu", drxs(int ), (int)6));
                                    continue block20;
                                }
                                case 974669675: {
                                    return this.from;
                                }
                            }
                            break;
                        }
                        return this.from;
                    }
                    case 0: {
                        ** break;
                    }
                    case 2: {
                        var2_2 /* !! */  = (int)cu.drxv("drzc", drxx(int ), (int)6);
                        if (var3_1) {
                            throw null;
                        }
                        break block25;
                    }
                    case 3: {
                        break block25;
                    }
lbl58:
                    // 2 sources

                    while (true) {
                        var2_2 /* !! */  = (int)cu.drxv("dryy", drxx(int ), (int)4);
                        cfr_temp_0 = 1;
                        if (!var3_1) continue block19;
                        throw null;
                    }
                    case 1: 
                }
                break;
            } while (true);
            var2_2 /* !! */  = (int)cu.drxv("drza", drxx(int ), (int)5);
            if (var3_1) {
                throw null;
            }
        }
        var2_2 /* !! */  = (int)cu.drxv("drzd", drxx(int ), (int)7);
        ** while (!var3_1)
lbl72:
        // 1 sources

        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public cu(class_243 var1_1, class_243 var2_2, boolean var3_3, double var4_4) {
        var7_5 /* !! */  = cu.b;
        var6_6 = cu.a;
        if (var7_5 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block7: while (true) {
            block10: {
                switch (cfr_temp_0 == -2147483648 ? var7_5 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        super();
                        this.from = var1_1;
                        this.to = var2_2;
                        this.toGround = var3_3;
                        this.fallDistance = var4_4;
                        return;
                    }
                    case 0: {
                        var7_5 /* !! */  = (int)cu.drxv("dsdg", drxx(int ), (int)31);
                        cfr_temp_0 = 3;
                        break block10;
                    }
                    case 1: {
                        while (true) {
                            var7_5 /* !! */  = (int)cu.drxv("dsdi", drxx(int ), (int)32);
                        }
                    }
                    case 4: {
                        var7_5 /* !! */  = (int)cu.drxv("dsdm", drxx(int ), (int)35);
                        ** GOTO lbl-1000
                    }
                    case 2: lbl-1000:
                    // 2 sources

                    {
                        var7_5 /* !! */  = (int)cu.drxv("dsdk", drxx(int ), (int)33);
                    }
                    case 3: 
                }
                ** GOTO lbl32
            }
            while (true) {
                if (true) continue block7;
lbl32:
                // 2 sources

                var7_5 /* !! */  = (int)cu.drxv("dsdl", drxx(int ), (int)34);
                cfr_temp_0 = 2;
            }
            break;
        }
    }

    private static /* synthetic */ void dsdy() {
        cu.drxz[0] = -200420094;
        cu.drxz[1] = -1350099665;
        cu.drxz[2] = -1628352463;
        cu.drxz[3] = 18679609;
        cu.drxz[4] = 1421747601;
        cu.drxz[5] = -1935534912;
        cu.drxz[6] = 713987604;
        cu.drxz[7] = -1088399209;
        cu.drxz[8] = -1880117039;
        cu.drxz[9] = 238567663;
        cu.drxz[10] = -1436651991;
        cu.drxz[11] = 1135192950;
        cu.drxz[12] = 1864636587;
        cu.drxz[13] = 1335310654;
        cu.drxz[14] = 931230364;
        cu.drxz[15] = -1567690681;
        cu.drxz[16] = 2090485430;
        cu.drxz[17] = -1643707184;
        cu.drxz[18] = -124253928;
        cu.drxz[19] = -569834945;
        cu.drxz[20] = -139712434;
        cu.drxz[21] = -1196861546;
        cu.drxz[22] = -987782899;
        cu.drxz[23] = 1991160516;
        cu.drxz[24] = 268908646;
        cu.drxz[25] = 1011025929;
        cu.drxz[26] = 2090343103;
        cu.drxz[27] = -10860113;
        cu.drxz[28] = -22908365;
        cu.drxz[29] = 560345225;
        cu.drxz[30] = 452697734;
        cu.drxz[31] = -1978245171;
        cu.drxz[32] = 209239040;
        cu.drxz[33] = -2065682192;
        cu.drxz[34] = -2030137324;
        cu.drxz[35] = 1688752639;
    }

    private static /* synthetic */ void dsdu() {
        cu.drxy[0] = -200420093;
        cu.drxy[1] = 1820671484;
        cu.drxy[2] = -1628352464;
        cu.drxy[3] = 2142516558;
        cu.drxy[4] = 1421747602;
        cu.drxy[5] = -1935534912;
        cu.drxy[6] = 713987605;
        cu.drxy[7] = -1088399211;
        cu.drxy[8] = -1880117037;
        cu.drxy[9] = 238567660;
        cu.drxy[10] = -1436651991;
        cu.drxy[11] = 1135192948;
        cu.drxy[12] = 1864636586;
        cu.drxy[13] = 1584525131;
        cu.drxy[14] = 931230365;
        cu.drxy[15] = -1131785002;
        cu.drxy[16] = 2090485431;
        cu.drxy[17] = -1643707184;
        cu.drxy[18] = -124253925;
        cu.drxy[19] = -569834947;
        cu.drxy[20] = -139712436;
        cu.drxy[21] = -1196861545;
        cu.drxy[22] = -955882717;
        cu.drxy[23] = 1991160517;
        cu.drxy[24] = -562420322;
        cu.drxy[25] = 1011025928;
        cu.drxy[26] = -434890329;
        cu.drxy[27] = -10860113;
        cu.drxy[28] = -22908365;
        cu.drxy[29] = 560345224;
        cu.drxy[30] = 452697732;
        cu.drxy[31] = -1978245172;
        cu.drxy[32] = 209239041;
        cu.drxy[33] = -2065682189;
        cu.drxy[34] = -2030137322;
        cu.drxy[35] = 1688752635;
    }

    private static /* synthetic */ void dsei() {
        cu.drxt[0] = -8457521551253213634L;
        cu.drxt[1] = 65435071205947576L;
        cu.drxt[2] = -1351829554282581128L;
        cu.drxt[3] = -5928641780964334899L;
        cu.drxt[4] = -5807990250751509047L;
        cu.drxt[5] = -203710848613309295L;
        cu.drxt[6] = -6139090540037549582L;
        cu.drxt[7] = -9202276710560047546L;
        cu.drxt[8] = 2818569199286356042L;
        cu.drxt[9] = 6107539287997970303L;
        cu.drxt[10] = -1858887801599498023L;
        cu.drxt[11] = -6533535252300459495L;
        cu.drxt[12] = -14065502922011611L;
        cu.drxt[13] = -4309655675306383469L;
        cu.drxt[14] = 3265597661672179504L;
        cu.drxt[15] = 8441754108942270752L;
        cu.drxt[16] = 7682868556299665104L;
        cu.drxt[17] = 2451691704206668916L;
        cu.drxt[18] = -1074785178147803530L;
        cu.drxt[19] = -5532746017602525179L;
        cu.drxt[20] = -4669570948859057680L;
        cu.drxt[21] = -1666948401122514739L;
        cu.drxt[22] = 5804166012074070219L;
        cu.drxt[23] = 1597420044008995219L;
        cu.drxt[24] = -170962426689993858L;
        cu.drxt[25] = -3813917465339042472L;
        cu.drxt[26] = 706274785740661371L;
        cu.drxt[27] = -3294937136907480558L;
        cu.drxt[28] = 3746257153142722417L;
        cu.drxt[29] = -7107946900158439167L;
        cu.drxt[30] = 6867301513758754972L;
        cu.drxt[31] = 2761856310279496214L;
        cu.drxt[32] = 170036426667360785L;
        cu.drxt[33] = -6620406373660977554L;
        cu.drxt[34] = -4259865427072219440L;
        cu.drxt[35] = -7114688670174203101L;
    }

    public static /* synthetic */ CallSite drxv(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean isToGround() {
        boolean bl2;
        Object object = iw;
        block8: while (true) {
            switch ((int)object) {
                case 465172547: {
                    object = cu.drxv("dsat", drxs(int ), (int)24) - cu.drxv("dsar", drxs(int ), (int)23);
                    continue block8;
                }
                case 974669675: {
                    break block8;
                }
            }
            break;
        }
        boolean bl3 = c;
        while (true) {
            long l2;
            Object object2;
            if ((object2 = (l2 = iw - cu.drxv("dsav", drxs(int ), (int)25)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object2 == cu.drxv("dsax", drxx(int ), (int)12)) break;
            object2 = cu.drxv("dsaz", drxx(int ), (int)13);
        }
        int n2 = b;
        while (true) {
            long l3;
            Object object3;
            if ((object3 = (l3 = iw - cu.drxv("dsbb", drxs(int ), (int)26)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object3 == cu.drxv("dsbd", drxx(int ), (int)14)) {
                bl2 = a;
                if (bl3) {
                    throw null;
                }
                break;
            }
            object3 = cu.drxv("dsbf", drxx(int ), (int)15);
        }
        if (bl2) return (boolean)cu.drxv("dsbh", drxx(int ), (int)16);
        if (bl2) return (boolean)cu.drxv("dsbh", drxx(int ), (int)16);
        Object object4 = iw;
        block11: while (true) {
            switch ((int)object4) {
                case -474259601: {
                    object4 = cu.drxv("dsbl", drxs(int ), (int)28) - cu.drxv("dsbj", drxs(int ), (int)27);
                    continue block11;
                }
                case 974669675: {
                    return this.toGround;
                }
            }
            break;
        }
        return this.toGround;
    }

    private static /* synthetic */ int drxx(int n2) {
        return drxy[n2] ^ drxz[n2];
    }

    private static /* synthetic */ void dseq() {
        cu.drxu[0] = -7420079163260906504L;
        cu.drxu[1] = 2518842028151014L;
        cu.drxu[2] = -7818998873209687154L;
        cu.drxu[3] = 4638758640716220923L;
        cu.drxu[4] = -5640660923573749798L;
        cu.drxu[5] = 6709091810219774510L;
        cu.drxu[6] = -7173840409687457602L;
        cu.drxu[7] = -4428827486526354669L;
        cu.drxu[8] = 7156242313224560314L;
        cu.drxu[9] = 6074480580318039985L;
        cu.drxu[10] = 7413453732720768734L;
        cu.drxu[11] = -4897177253431045874L;
        cu.drxu[12] = 8901181329302796283L;
        cu.drxu[13] = 1861260971066255856L;
        cu.drxu[14] = -8832678755942636290L;
        cu.drxu[15] = -923658685279789229L;
        cu.drxu[16] = 9059480180624057018L;
        cu.drxu[17] = -7566711420766140591L;
        cu.drxu[18] = 153632135254952427L;
        cu.drxu[19] = 4600898068238357703L;
        cu.drxu[20] = 6636212280690890104L;
        cu.drxu[21] = 4501671047819852087L;
        cu.drxu[22] = -3063472824500293384L;
        cu.drxu[23] = 3516738534558748011L;
        cu.drxu[24] = -273289462496259464L;
        cu.drxu[25] = -7329883802834251273L;
        cu.drxu[26] = -2844590919383042408L;
        cu.drxu[27] = -7047001829023311247L;
        cu.drxu[28] = 4545382270475689060L;
        cu.drxu[29] = 806469241592987476L;
        cu.drxu[30] = 8351976107856684499L;
        cu.drxu[31] = 3466124690117745279L;
        cu.drxu[32] = 4431584436021313299L;
        cu.drxu[33] = -7022190193066937907L;
        cu.drxu[34] = -5911556679896933134L;
        cu.drxu[35] = 2255820760747024018L;
    }

    static {
        drxy = new int[36];
        drxz = new int[36];
        cu.dsdu();
        cu.dsdy();
        drxt = new long[36];
        drxu = new long[36];
        cu.dsei();
        cu.dseq();
    }

    private static /* synthetic */ long drxs(int n2) {
        return drxt[n2] ^ drxu[n2];
    }

    private static /* synthetic */ double dscm(int n2) {
        return Double.longBitsToDouble(drxt[n2] ^ drxu[n2]);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public class_243 getTo() {
        v0 /* !! */  = cu.iw;
        if (true) ** GOTO lbl5
        block29: while (true) {
            v0 /* !! */  = (long)(v1 - cu.drxv("drze", drxs(int ), (int)8));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -893734093: {
                    v1 = cu.drxv("drzf", drxs(int ), (int)9);
                    continue block29;
                }
                case -875781433: {
                    v1 = cu.drxv("drzg", drxs(int ), (int)10);
                    continue block29;
                }
                case 442937257: {
                    v1 = cu.drxv("drzi", drxs(int ), (int)11);
                    continue block29;
                }
                case 974669675: {
                    break block29;
                }
            }
            break;
        }
        var3_1 = cu.c;
        v2 /* !! */  = cu.iw;
        if (true) ** GOTO lbl22
        block30: while (true) {
            v2 /* !! */  = (long)(v3 - cu.drxv("drzl", drxs(int ), (int)12));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1266482027: {
                    v3 = cu.drxv("drzn", drxs(int ), (int)13);
                    continue block30;
                }
                case -122026323: {
                    v3 = cu.drxv("drzr", drxs(int ), (int)14);
                    continue block30;
                }
                case 974669675: {
                    break block30;
                }
                case 1446894025: {
                    v3 = cu.drxv("drzs", drxs(int ), (int)15);
                    continue block30;
                }
            }
            break;
        }
        var2_2 /* !! */  = cu.b;
        v4 /* !! */  = cu.iw;
        if (true) ** GOTO lbl39
        block31: while (true) {
            v4 /* !! */  = (long)(v5 - cu.drxv("drzt", drxs(int ), (int)16));
lbl39:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case 663141287: {
                    v5 = cu.drxv("drzu", drxs(int ), (int)17);
                    continue block31;
                }
                case 974669675: {
                    break block31;
                }
                case 1448190333: {
                    v5 = cu.drxv("drzv", drxs(int ), (int)18);
                    continue block31;
                }
            }
            break;
        }
        var1_3 = cu.a;
        if (var3_1) {
            throw null;
            return null;
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** continue;
                v6 /* !! */  = cu.iw;
                if (true) ** GOTO lbl61
                block33: while (true) {
                    v6 /* !! */  = (long)(v7 - cu.drxv("drzy", drxs(int ), (int)19));
lbl61:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1509092438: {
                            v7 = cu.drxv("dsaa", drxs(int ), (int)20);
                            continue block33;
                        }
                        case -864238647: {
                            v7 = cu.drxv("dsae", drxs(int ), (int)21);
                            continue block33;
                        }
                        case 974669675: {
                            break block33;
                        }
                        case 1473040210: {
                            v7 = cu.drxv("dsaf", drxs(int ), (int)22);
                            continue block33;
                        }
                    }
                    break;
                }
                return this.to;
            }
lbl74:
            // 2 sources

            case 0: {
                do {
                    var2_2 /* !! */  = (int)cu.drxv("dsah", drxx(int ), (int)8);
                } while (!var3_1);
                throw null;
            }
            case 1: {
                var2_2 /* !! */  = (int)cu.drxv("dsaj", drxx(int ), (int)9);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)cu.drxv("dsal", drxx(int ), (int)10);
                if (!var3_1) ** GOTO lbl74
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)cu.drxv("dsao", drxx(int ), (int)11);
        } while (!var3_1);
        throw null;
    }
}

