/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.runtime.ObjectMethods;
import java.util.function.BooleanSupplier;

final class ob$SwapStep
extends Record {
    private final BooleanSupplier condition;
    private final int delayTicks;
    private static int[] iln = new int[51];
    private static long[] ilw;
    public static final boolean a;
    public static final int b;
    public static final long aj = 8778311592817725686L;
    private static int[] ilo;
    private final Runnable action;
    private static long[] ilv;
    public static final boolean c;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public int delayTicks() {
        v0 /* !! */  = ob$SwapStep.aj;
        if (true) ** GOTO lbl5
        block24: while (true) {
            v0 /* !! */  = (long)(v1 - ob$SwapStep.ilp("inw", ilu(int ), (int)25));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1266761128: {
                    v1 = ob$SwapStep.ilp("inx", ilu(int ), (int)26);
                    continue block24;
                }
                case -363479266: {
                    v1 = ob$SwapStep.ilp("iny", ilu(int ), (int)27);
                    continue block24;
                }
                case 1503138038: {
                    break block24;
                }
                case 2134788530: {
                    v1 = ob$SwapStep.ilp("inz", ilu(int ), (int)28);
                    continue block24;
                }
            }
            break;
        }
        var3_1 = ob$SwapStep.c;
        v2 /* !! */  = ob$SwapStep.aj;
        if (true) ** GOTO lbl22
        block25: while (true) {
            v2 /* !! */  = (long)(v3 - ob$SwapStep.ilp("ioa", ilu(int ), (int)29));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -915310958: {
                    v3 = ob$SwapStep.ilp("iob", ilu(int ), (int)30);
                    continue block25;
                }
                case 55252199: {
                    v3 = ob$SwapStep.ilp("ioc", ilu(int ), (int)31);
                    continue block25;
                }
                case 1436842315: {
                    v3 = ob$SwapStep.ilp("iod", ilu(int ), (int)32);
                    continue block25;
                }
                case 1503138038: {
                    break block25;
                }
            }
            break;
        }
        var2_2 /* !! */  = ob$SwapStep.b;
        v4 /* !! */  = ob$SwapStep.aj;
        if (true) ** GOTO lbl39
        block26: while (true) {
            v4 /* !! */  = (long)(v5 - ob$SwapStep.ilp("ioe", ilu(int ), (int)33));
lbl39:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1767861616: {
                    v5 = ob$SwapStep.ilp("iof", ilu(int ), (int)34);
                    continue block26;
                }
                case -1661673751: {
                    v5 = ob$SwapStep.ilp("iog", ilu(int ), (int)35);
                    continue block26;
                }
                case 1503138038: {
                    break block26;
                }
                case 1749479201: {
                    v5 = ob$SwapStep.ilp("ioh", ilu(int ), (int)36);
                    continue block26;
                }
            }
            break;
        }
        var1_3 = ob$SwapStep.a;
        if (var3_1) {
            throw null;
            return (int)ob$SwapStep.ilp("ioi", ilm(int ), (int)30);
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** continue;
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_0 = ob$SwapStep.aj - ob$SwapStep.ilp("ioj", ilu(int ), (int)37)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v6 /* !! */  == ob$SwapStep.ilp("iok", ilm(int ), (int)31)) break;
                    v6 /* !! */  = (long)ob$SwapStep.ilp("iol", ilm(int ), (int)32);
                }
                return this.delayTicks;
            }
            case 0: {
                var2_2 /* !! */  = (int)ob$SwapStep.ilp("iom", ilm(int ), (int)33);
                if (var3_1) {
                    throw null;
                }
            }
lbl71:
            // 4 sources

            case 1: {
                var2_2 /* !! */  = (int)ob$SwapStep.ilp("ion", ilm(int ), (int)34);
                if (!var3_1) break;
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)ob$SwapStep.ilp("ioo", ilm(int ), (int)35);
                if (!var3_1) ** GOTO lbl71
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)ob$SwapStep.ilp("iop", ilm(int ), (int)36);
        } while (!var3_1);
        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public final int hashCode() {
        while (true) {
            block29: {
                if ((v0 /* !! */  = (cfr_temp_1 = ob$SwapStep.aj - ob$SwapStep.ilp("imn", ilu(int ), (int)10)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v0 /* !! */  != ob$SwapStep.ilp("imo", ilm(int ), (int)10)) break block29;
                var3_1 = ob$SwapStep.c;
                v1 /* !! */  = ob$SwapStep.aj;
                if (true) ** GOTO lbl13
            }
            v0 /* !! */  = (long)ob$SwapStep.ilp("imp", ilm(int ), (int)11);
        }
        block17: while (true) {
            v1 /* !! */  = (long)(v2 - ob$SwapStep.ilp("imq", ilu(int ), (int)11));
lbl13:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -205342738: {
                    v2 = ob$SwapStep.ilp("imr", ilu(int ), (int)12);
                    continue block17;
                }
                case 652929855: {
                    v2 = ob$SwapStep.ilp("ims", ilu(int ), (int)13);
                    continue block17;
                }
                case 1503138038: {
                    break block17;
                }
                case 1622359779: {
                    v2 = ob$SwapStep.ilp("imt", ilu(int ), (int)14);
                    continue block17;
                }
            }
            break;
        }
        var2_2 /* !! */  = ob$SwapStep.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        while (true) {
            switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                default: lbl-1000:
                // 2 sources

                {
                    v3 /* !! */  = ob$SwapStep.aj;
                    block19: while (true) {
                        switch ((int)v3 /* !! */ ) {
                            case -1816917039: {
                                v3 /* !! */  = (long)(ob$SwapStep.ilp("imv", ilu(int ), (int)16) - ob$SwapStep.ilp("imu", ilu(int ), (int)15));
                                continue block19;
                            }
                            case 1503138038: {
                                break block19;
                            }
                        }
                        break;
                    }
                    var1_3 = ob$SwapStep.a;
                    if (var3_1) {
                        throw null;
                    }
                    if (var1_3 != false) return (int)ob$SwapStep.ilp("imw", ilm(int ), (int)12);
                    if (var1_3 != false) return (int)ob$SwapStep.ilp("imw", ilm(int ), (int)12);
                    while (true) {
                        if ((v4 /* !! */  = (cfr_temp_2 = ob$SwapStep.aj - ob$SwapStep.ilp("imx", ilu(int ), (int)17)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                            continue;
                        }
                        if (v4 /* !! */  == ob$SwapStep.ilp("imy", ilm(int ), (int)13)) {
                            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ob$SwapStep.class, "delayTicks;action;condition", "delayTicks", "action", "condition"}, this);
                        }
                        v4 /* !! */  = (long)ob$SwapStep.ilp("imz", ilm(int ), (int)14);
                    }
                }
                case 2: {
                    do {
                        var2_2 /* !! */  = (int)ob$SwapStep.ilp("inc", ilm(int ), (int)17);
                    } while (!var3_1);
                    throw null;
                }
                case 3: {
                    var2_2 /* !! */  = (int)ob$SwapStep.ilp("ind", ilm(int ), (int)18);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl-1000
                }
                case 0: lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)ob$SwapStep.ilp("ina", ilm(int ), (int)15);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 1: 
            }
            if (true) ** GOTO lbl69
            break;
        }
        do {
            if (true) ** continue;
lbl69:
            // 2 sources

            var2_2 /* !! */  = (int)ob$SwapStep.ilp("inb", ilm(int ), (int)16);
            cfr_temp_0 = 0;
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ void ipy() {
        ob$SwapStep.ilw[0] = 1740265150351490475L;
        ob$SwapStep.ilw[1] = 5514897866436181127L;
        ob$SwapStep.ilw[2] = -4223906699060913167L;
        ob$SwapStep.ilw[3] = 4871586507949096346L;
        ob$SwapStep.ilw[4] = -4532791214384087491L;
        ob$SwapStep.ilw[5] = 3139908783580409825L;
        ob$SwapStep.ilw[6] = -7718741697415649956L;
        ob$SwapStep.ilw[7] = 5746821102577004238L;
        ob$SwapStep.ilw[8] = 789869736750404335L;
        ob$SwapStep.ilw[9] = -8063227939065841822L;
        ob$SwapStep.ilw[10] = -5854700812299167897L;
        ob$SwapStep.ilw[11] = -4658667421963138139L;
        ob$SwapStep.ilw[12] = -6290860836965681329L;
        ob$SwapStep.ilw[13] = -1859055646943004753L;
        ob$SwapStep.ilw[14] = -6608300077179617345L;
        ob$SwapStep.ilw[15] = 5064853838697832681L;
        ob$SwapStep.ilw[16] = 1614363729641380919L;
        ob$SwapStep.ilw[17] = 3620801600686896864L;
        ob$SwapStep.ilw[18] = -8654216446761408887L;
        ob$SwapStep.ilw[19] = -4428815971637032219L;
        ob$SwapStep.ilw[20] = -635844819161283924L;
        ob$SwapStep.ilw[21] = -4021334543448475537L;
        ob$SwapStep.ilw[22] = 6493096619503134300L;
        ob$SwapStep.ilw[23] = 2027999501384203374L;
        ob$SwapStep.ilw[24] = 2285848632796028144L;
        ob$SwapStep.ilw[25] = 7690666083489973384L;
        ob$SwapStep.ilw[26] = 7523495077519592159L;
        ob$SwapStep.ilw[27] = 9151112136630458222L;
        ob$SwapStep.ilw[28] = -585883125769315802L;
        ob$SwapStep.ilw[29] = 6672338357765069956L;
        ob$SwapStep.ilw[30] = 2527481210611645941L;
        ob$SwapStep.ilw[31] = 6682383608296337477L;
        ob$SwapStep.ilw[32] = -9010883530833761510L;
        ob$SwapStep.ilw[33] = -4882044032969718261L;
        ob$SwapStep.ilw[34] = -4232713235625936164L;
        ob$SwapStep.ilw[35] = 1169492715764747734L;
        ob$SwapStep.ilw[36] = -2677715392404647838L;
        ob$SwapStep.ilw[37] = 6173786697308074695L;
        ob$SwapStep.ilw[38] = -8826247173669386994L;
        ob$SwapStep.ilw[39] = 7639608297498034084L;
        ob$SwapStep.ilw[40] = 4714410530106299525L;
        ob$SwapStep.ilw[41] = 6639488251160091486L;
        ob$SwapStep.ilw[42] = -6462081388325810637L;
        ob$SwapStep.ilw[43] = 6206602332602855039L;
        ob$SwapStep.ilw[44] = -2431033054734471872L;
        ob$SwapStep.ilw[45] = -3014656504728230400L;
        ob$SwapStep.ilw[46] = -110370241817003314L;
        ob$SwapStep.ilw[47] = -4814274771711830395L;
        ob$SwapStep.ilw[48] = 5720616465823849598L;
        ob$SwapStep.ilw[49] = -6780474112726033177L;
        ob$SwapStep.ilw[50] = -1133119674868645638L;
        ob$SwapStep.ilw[51] = -7618662723050370981L;
        ob$SwapStep.ilw[52] = -6672763560222249192L;
        ob$SwapStep.ilw[53] = 450233782419683938L;
        ob$SwapStep.ilw[54] = 2823271888837377804L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final boolean equals(Object var1_1) {
        v0 /* !! */  = ob$SwapStep.aj;
        if (true) ** GOTO lbl5
        block12: while (true) {
            v0 /* !! */  = (long)(v1 - ob$SwapStep.ilp("ine", ilu(int ), (int)18));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1531741697: {
                    v1 = ob$SwapStep.ilp("inf", ilu(int ), (int)19);
                    continue block12;
                }
                case 687920601: {
                    v1 = ob$SwapStep.ilp("ing", ilu(int ), (int)20);
                    continue block12;
                }
                case 1503138038: {
                    break block12;
                }
                case 1630106360: {
                    v1 = ob$SwapStep.ilp("inh", ilu(int ), (int)21);
                    continue block12;
                }
            }
            break;
        }
        var4_2 = ob$SwapStep.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = ob$SwapStep.aj - ob$SwapStep.ilp("ini", ilu(int ), (int)22)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == ob$SwapStep.ilp("inj", ilm(int ), (int)19)) break;
            v2 /* !! */  = (long)ob$SwapStep.ilp("ink", ilm(int ), (int)20);
        }
        var3_3 /* !! */  = ob$SwapStep.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = ob$SwapStep.aj - ob$SwapStep.ilp("inl", ilu(int ), (int)23)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == ob$SwapStep.ilp("inm", ilm(int ), (int)21)) break;
            v3 /* !! */  = (long)ob$SwapStep.ilp("inn", ilm(int ), (int)22);
        }
        var2_4 = ob$SwapStep.a;
        if (var4_2) {
            throw null;
lbl34:
            // 2 sources

            return (boolean)ob$SwapStep.ilp("ino", ilm(int ), (int)23);
        }
        if (var2_4) ** GOTO lbl34
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        block6 : switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = ob$SwapStep.aj - ob$SwapStep.ilp("inp", ilu(int ), (int)24)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == ob$SwapStep.ilp("inq", ilm(int ), (int)24)) break;
                    v4 /* !! */  = (long)ob$SwapStep.ilp("inr", ilm(int ), (int)25);
                }
                return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ob$SwapStep.class, "delayTicks;action;condition", "delayTicks", "action", "condition"}, this, var1_1);
            }
            case 0: {
                var3_3 /* !! */  = (int)ob$SwapStep.ilp("ins", ilm(int ), (int)26);
                if (!var4_2) break;
                throw null;
            }
            case 1: {
                var3_3 /* !! */  = (int)ob$SwapStep.ilp("int", ilm(int ), (int)27);
                if (!var4_2) break;
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)ob$SwapStep.ilp("inu", ilm(int ), (int)28);
                    if (!var4_2) break block6;
                    throw null;
                }
            }
            case 3: 
        }
        var3_3 /* !! */  = (int)ob$SwapStep.ilp("inv", ilm(int ), (int)29);
        ** while (!var4_2)
lbl64:
        // 1 sources

        throw null;
    }

    static {
        ilo = new int[51];
        ob$SwapStep.ipv();
        ob$SwapStep.ipw();
        ilv = new long[55];
        ilw = new long[55];
        ob$SwapStep.ipx();
        ob$SwapStep.ipy();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public BooleanSupplier condition() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ob$SwapStep.aj - ob$SwapStep.ilp("ipf", ilu(int ), (int)47)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ob$SwapStep.ilp("ipg", ilm(int ), (int)43)) break;
            v0 /* !! */  = (long)ob$SwapStep.ilp("iph", ilm(int ), (int)44);
        }
        var3_1 = ob$SwapStep.c;
        v1 /* !! */  = ob$SwapStep.aj;
        if (true) ** GOTO lbl12
        block17: while (true) {
            v1 /* !! */  = (long)(v2 - ob$SwapStep.ilp("ipi", ilu(int ), (int)48));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1475129051: {
                    v2 = ob$SwapStep.ilp("ipj", ilu(int ), (int)49);
                    continue block17;
                }
                case -1341339330: {
                    v2 = ob$SwapStep.ilp("ipk", ilu(int ), (int)50);
                    continue block17;
                }
                case 1221841031: {
                    v2 = ob$SwapStep.ilp("ipl", ilu(int ), (int)51);
                    continue block17;
                }
                case 1503138038: {
                    break block17;
                }
            }
            break;
        }
        var2_2 /* !! */  = ob$SwapStep.b;
        v3 /* !! */  = ob$SwapStep.aj;
        if (true) ** GOTO lbl29
        block18: while (true) {
            v3 /* !! */  = (long)(ob$SwapStep.ilp("ipn", ilu(int ), (int)53) - ob$SwapStep.ilp("ipm", ilu(int ), (int)52));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case 114500687: {
                    continue block18;
                }
                case 1503138038: {
                    break block18;
                }
            }
            break;
        }
        var1_3 = ob$SwapStep.a;
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
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_1 = ob$SwapStep.aj - ob$SwapStep.ilp("ipo", ilu(int ), (int)54)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == ob$SwapStep.ilp("ipp", ilm(int ), (int)45)) break;
                    v4 /* !! */  = (long)ob$SwapStep.ilp("ipq", ilm(int ), (int)46);
                }
                return this.condition;
            }
lbl50:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)ob$SwapStep.ilp("ipr", ilm(int ), (int)47);
                if (!var3_1) break;
                throw null;
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)ob$SwapStep.ilp("ips", ilm(int ), (int)48);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)ob$SwapStep.ilp("ipt", ilm(int ), (int)49);
                if (!var3_1) ** GOTO lbl50
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)ob$SwapStep.ilp("ipu", ilm(int ), (int)50);
        ** while (!var3_1)
lbl66:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private ob$SwapStep(int var1_1, Runnable var2_2, BooleanSupplier var3_3) {
        var5_4 /* !! */  = ob$SwapStep.b;
        if (var5_4 /* !! */  == 0) ** GOTO lbl-1000
        block0 : switch (var5_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                super();
                this.delayTicks = var1_1;
                this.action = var2_2;
                this.condition = var3_3;
                return;
            }
lbl10:
            // 3 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_4 /* !! */  = (int)ob$SwapStep.ilp("ilq", ilm(int ), (int)0);
                    break block0;
                    break;
                }
            }
            case 1: {
                var5_4 /* !! */  = (int)ob$SwapStep.ilp("ilr", ilm(int ), (int)1);
                ** GOTO lbl10
            }
            case 2: {
                var5_4 /* !! */  = (int)ob$SwapStep.ilp("ils", ilm(int ), (int)2);
                ** GOTO lbl10
            }
            case 3: 
        }
        var5_4 /* !! */  = (int)ob$SwapStep.ilp("ilt", ilm(int ), (int)3);
        ** while (true)
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public Runnable action() {
        v0 /* !! */  = ob$SwapStep.aj;
        if (true) ** GOTO lbl5
        block20: while (true) {
            v0 /* !! */  = (long)(v1 - ob$SwapStep.ilp("ioq", ilu(int ), (int)38));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1362681112: {
                    v1 = ob$SwapStep.ilp("ior", ilu(int ), (int)39);
                    continue block20;
                }
                case -608688292: {
                    v1 = ob$SwapStep.ilp("ios", ilu(int ), (int)40);
                    continue block20;
                }
                case 1503138038: {
                    break block20;
                }
            }
            break;
        }
        var3_1 = ob$SwapStep.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = ob$SwapStep.aj - ob$SwapStep.ilp("iot", ilu(int ), (int)41)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == ob$SwapStep.ilp("iou", ilm(int ), (int)37)) break;
            v2 /* !! */  = (long)ob$SwapStep.ilp("iov", ilm(int ), (int)38);
        }
        var2_2 /* !! */  = ob$SwapStep.b;
        v3 /* !! */  = ob$SwapStep.aj;
        if (true) ** GOTO lbl26
        block22: while (true) {
            v3 /* !! */  = (long)(v4 - ob$SwapStep.ilp("iow", ilu(int ), (int)42));
lbl26:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1190607086: {
                    v4 = ob$SwapStep.ilp("iox", ilu(int ), (int)43);
                    continue block22;
                }
                case -1149643556: {
                    v4 = ob$SwapStep.ilp("ioy", ilu(int ), (int)44);
                    continue block22;
                }
                case 1503138038: {
                    break block22;
                }
            }
            break;
        }
        var1_3 = ob$SwapStep.a;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_1) {
                    throw null;
                    return null;
                }
                if (var1_3 || var1_3) ** continue;
                v5 /* !! */  = ob$SwapStep.aj;
                if (true) ** GOTO lbl48
                block24: while (true) {
                    v5 /* !! */  = (long)(ob$SwapStep.ilp("ipa", ilu(int ), (int)46) - ob$SwapStep.ilp("ioz", ilu(int ), (int)45));
lbl48:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1429149553: {
                            continue block24;
                        }
                        case 1503138038: {
                            break block24;
                        }
                    }
                    break;
                }
                return this.action;
            }
lbl54:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)ob$SwapStep.ilp("ipb", ilm(int ), (int)39);
                if (var3_1) {
                    throw null;
                }
            }
            case 1: {
                do {
                    var2_2 /* !! */  = (int)ob$SwapStep.ilp("ipc", ilm(int ), (int)40);
                } while (!var3_1);
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)ob$SwapStep.ilp("ipd", ilm(int ), (int)41);
                if (!var3_1) ** GOTO lbl54
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)ob$SwapStep.ilp("ipe", ilm(int ), (int)42);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ long ilu(int n2) {
        return ilv[n2] ^ ilw[n2];
    }

    private static /* synthetic */ void ipw() {
        ob$SwapStep.ilo[0] = 1026137030;
        ob$SwapStep.ilo[1] = 1937955500;
        ob$SwapStep.ilo[2] = 577109898;
        ob$SwapStep.ilo[3] = -952503715;
        ob$SwapStep.ilo[4] = -999313688;
        ob$SwapStep.ilo[5] = -1153246608;
        ob$SwapStep.ilo[6] = 2081413542;
        ob$SwapStep.ilo[7] = 221760210;
        ob$SwapStep.ilo[8] = -1156063398;
        ob$SwapStep.ilo[9] = -903332234;
        ob$SwapStep.ilo[10] = -1514272773;
        ob$SwapStep.ilo[11] = 890330680;
        ob$SwapStep.ilo[12] = -2096554659;
        ob$SwapStep.ilo[13] = 1818719896;
        ob$SwapStep.ilo[14] = 113659493;
        ob$SwapStep.ilo[15] = 2107048037;
        ob$SwapStep.ilo[16] = -1860909814;
        ob$SwapStep.ilo[17] = -1904084813;
        ob$SwapStep.ilo[18] = -1373778411;
        ob$SwapStep.ilo[19] = -935106539;
        ob$SwapStep.ilo[20] = -130813266;
        ob$SwapStep.ilo[21] = 1541304645;
        ob$SwapStep.ilo[22] = -1993727897;
        ob$SwapStep.ilo[23] = 323717408;
        ob$SwapStep.ilo[24] = -935360282;
        ob$SwapStep.ilo[25] = 408693882;
        ob$SwapStep.ilo[26] = -258457754;
        ob$SwapStep.ilo[27] = 1612926134;
        ob$SwapStep.ilo[28] = -1456844563;
        ob$SwapStep.ilo[29] = 1833937063;
        ob$SwapStep.ilo[30] = -1907597435;
        ob$SwapStep.ilo[31] = -1821282220;
        ob$SwapStep.ilo[32] = 459173437;
        ob$SwapStep.ilo[33] = -1362988288;
        ob$SwapStep.ilo[34] = -1799765312;
        ob$SwapStep.ilo[35] = 708308674;
        ob$SwapStep.ilo[36] = 911075011;
        ob$SwapStep.ilo[37] = -527965504;
        ob$SwapStep.ilo[38] = -336265616;
        ob$SwapStep.ilo[39] = -765791416;
        ob$SwapStep.ilo[40] = -2019790259;
        ob$SwapStep.ilo[41] = -691449604;
        ob$SwapStep.ilo[42] = 1635582952;
        ob$SwapStep.ilo[43] = 681025664;
        ob$SwapStep.ilo[44] = -105168083;
        ob$SwapStep.ilo[45] = -1060975537;
        ob$SwapStep.ilo[46] = 840344888;
        ob$SwapStep.ilo[47] = -1397102125;
        ob$SwapStep.ilo[48] = -1136579566;
        ob$SwapStep.ilo[49] = -1825362137;
        ob$SwapStep.ilo[50] = -420978285;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public final String toString() {
        Object object = aj;
        boolean bl2 = true;
        block15: while (true) {
            CallSite callSite;
            if (!bl2 || (bl2 = false) || !true) {
                object = callSite - ob$SwapStep.ilp("ilx", ilu(int ), (int)0);
            }
            switch ((int)object) {
                case -2140927082: {
                    callSite = ob$SwapStep.ilp("ily", ilu(int ), (int)1);
                    continue block15;
                }
                case 997711322: {
                    callSite = ob$SwapStep.ilp("ilz", ilu(int ), (int)2);
                    continue block15;
                }
                case 1503138038: {
                    break block15;
                }
            }
            break;
        }
        boolean bl3 = c;
        Object object2 = aj;
        block16: while (true) {
            switch ((int)object2) {
                case 164827924: {
                    object2 = ob$SwapStep.ilp("imb", ilu(int ), (int)4) - ob$SwapStep.ilp("ima", ilu(int ), (int)3);
                    continue block16;
                }
                case 1503138038: {
                    break block16;
                }
            }
            break;
        }
        int n2 = b;
        Object object3 = aj;
        boolean bl4 = true;
        block17: while (true) {
            CallSite callSite;
            if (!bl4 || (bl4 = false) || !true) {
                object3 = callSite - ob$SwapStep.ilp("imc", ilu(int ), (int)5);
            }
            switch ((int)object3) {
                case -1907636225: {
                    callSite = ob$SwapStep.ilp("imd", ilu(int ), (int)6);
                    continue block17;
                }
                case 596847483: {
                    callSite = ob$SwapStep.ilp("ime", ilu(int ), (int)7);
                    continue block17;
                }
                case 924769950: {
                    callSite = ob$SwapStep.ilp("imf", ilu(int ), (int)8);
                    continue block17;
                }
                case 1503138038: {
                    break block17;
                }
            }
            break;
        }
        boolean bl5 = a;
        if (bl3) {
            throw null;
        }
        if (bl5) return null;
        if (bl5) return null;
        while (true) {
            long l2;
            Object object4;
            if ((object4 = (l2 = aj - ob$SwapStep.ilp("img", ilu(int ), (int)9)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (object4 == ob$SwapStep.ilp("imh", ilm(int ), (int)4)) {
                return ObjectMethods.bootstrap("toString", new MethodHandle[]{ob$SwapStep.class, "delayTicks;action;condition", "delayTicks", "action", "condition"}, this);
            }
            object4 = ob$SwapStep.ilp("imi", ilm(int ), (int)5);
        }
    }

    public static /* synthetic */ CallSite ilp(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ int ilm(int n2) {
        return iln[n2] ^ ilo[n2];
    }

    private static /* synthetic */ void ipv() {
        ob$SwapStep.iln[0] = 1026137030;
        ob$SwapStep.iln[1] = 1937955500;
        ob$SwapStep.iln[2] = 577109896;
        ob$SwapStep.iln[3] = -952503715;
        ob$SwapStep.iln[4] = -999313687;
        ob$SwapStep.iln[5] = -367750144;
        ob$SwapStep.iln[6] = 2081413543;
        ob$SwapStep.iln[7] = 221760210;
        ob$SwapStep.iln[8] = -1156063399;
        ob$SwapStep.iln[9] = -903332236;
        ob$SwapStep.iln[10] = -1514272774;
        ob$SwapStep.iln[11] = 680740578;
        ob$SwapStep.iln[12] = -1912953032;
        ob$SwapStep.iln[13] = 1818719897;
        ob$SwapStep.iln[14] = -1615184926;
        ob$SwapStep.iln[15] = 2107048038;
        ob$SwapStep.iln[16] = -1860909813;
        ob$SwapStep.iln[17] = -1904084814;
        ob$SwapStep.iln[18] = -1373778409;
        ob$SwapStep.iln[19] = -935106540;
        ob$SwapStep.iln[20] = -718395663;
        ob$SwapStep.iln[21] = 1541304644;
        ob$SwapStep.iln[22] = 2111026610;
        ob$SwapStep.iln[23] = 323717408;
        ob$SwapStep.iln[24] = -935360281;
        ob$SwapStep.iln[25] = 1874248743;
        ob$SwapStep.iln[26] = -258457753;
        ob$SwapStep.iln[27] = 1612926132;
        ob$SwapStep.iln[28] = -1456844563;
        ob$SwapStep.iln[29] = 1833937061;
        ob$SwapStep.iln[30] = -1294658187;
        ob$SwapStep.iln[31] = -1821282219;
        ob$SwapStep.iln[32] = -2112013672;
        ob$SwapStep.iln[33] = -1362988286;
        ob$SwapStep.iln[34] = -1799765311;
        ob$SwapStep.iln[35] = 708308672;
        ob$SwapStep.iln[36] = 911075008;
        ob$SwapStep.iln[37] = -527965503;
        ob$SwapStep.iln[38] = 579716839;
        ob$SwapStep.iln[39] = -765791415;
        ob$SwapStep.iln[40] = -2019790258;
        ob$SwapStep.iln[41] = -691449602;
        ob$SwapStep.iln[42] = 1635582953;
        ob$SwapStep.iln[43] = 681025665;
        ob$SwapStep.iln[44] = 1604966755;
        ob$SwapStep.iln[45] = -1060975538;
        ob$SwapStep.iln[46] = 1125675527;
        ob$SwapStep.iln[47] = -1397102128;
        ob$SwapStep.iln[48] = -1136579565;
        ob$SwapStep.iln[49] = -1825362140;
        ob$SwapStep.iln[50] = -420978288;
    }

    private static /* synthetic */ void ipx() {
        ob$SwapStep.ilv[0] = 9164748927360266709L;
        ob$SwapStep.ilv[1] = 8395849476964242932L;
        ob$SwapStep.ilv[2] = -4960901123869077844L;
        ob$SwapStep.ilv[3] = 6231810104415615064L;
        ob$SwapStep.ilv[4] = -5592382514414492966L;
        ob$SwapStep.ilv[5] = -4848893213717554730L;
        ob$SwapStep.ilv[6] = -7627416173869515184L;
        ob$SwapStep.ilv[7] = -6717753435360939821L;
        ob$SwapStep.ilv[8] = 7779342305420355913L;
        ob$SwapStep.ilv[9] = 8426788401659888219L;
        ob$SwapStep.ilv[10] = -8997350700597602498L;
        ob$SwapStep.ilv[11] = -5286722454583217558L;
        ob$SwapStep.ilv[12] = 8698059460002323185L;
        ob$SwapStep.ilv[13] = 4646953596814749392L;
        ob$SwapStep.ilv[14] = 2802070085264617326L;
        ob$SwapStep.ilv[15] = 6682984030538377332L;
        ob$SwapStep.ilv[16] = -2011839552673549958L;
        ob$SwapStep.ilv[17] = 4227862311823716641L;
        ob$SwapStep.ilv[18] = 8533739162295406417L;
        ob$SwapStep.ilv[19] = -5103858616392241269L;
        ob$SwapStep.ilv[20] = -4542085178535386110L;
        ob$SwapStep.ilv[21] = -674995735739237402L;
        ob$SwapStep.ilv[22] = -4505024431852863817L;
        ob$SwapStep.ilv[23] = 4537100468320297622L;
        ob$SwapStep.ilv[24] = 9207570892993974400L;
        ob$SwapStep.ilv[25] = -142665029556298448L;
        ob$SwapStep.ilv[26] = 512436727390702376L;
        ob$SwapStep.ilv[27] = -1828869513990820480L;
        ob$SwapStep.ilv[28] = -932954325091936696L;
        ob$SwapStep.ilv[29] = -3754851727950912673L;
        ob$SwapStep.ilv[30] = 7804336113395085503L;
        ob$SwapStep.ilv[31] = 279297286132645640L;
        ob$SwapStep.ilv[32] = 4080177311394797752L;
        ob$SwapStep.ilv[33] = 6946861941036061873L;
        ob$SwapStep.ilv[34] = -2155595992814861367L;
        ob$SwapStep.ilv[35] = 6552079362737067038L;
        ob$SwapStep.ilv[36] = -6715638702524486734L;
        ob$SwapStep.ilv[37] = 6933023848563995241L;
        ob$SwapStep.ilv[38] = -8212250324369470575L;
        ob$SwapStep.ilv[39] = 4391904872602529972L;
        ob$SwapStep.ilv[40] = -5435209144097662321L;
        ob$SwapStep.ilv[41] = 7704826999941125602L;
        ob$SwapStep.ilv[42] = -5635707807701632938L;
        ob$SwapStep.ilv[43] = 8583765766745164388L;
        ob$SwapStep.ilv[44] = 4974871043682485017L;
        ob$SwapStep.ilv[45] = 1521711123714378352L;
        ob$SwapStep.ilv[46] = -2704321055774872950L;
        ob$SwapStep.ilv[47] = 5999485477706807951L;
        ob$SwapStep.ilv[48] = 8032549399794014430L;
        ob$SwapStep.ilv[49] = -6362591716349731648L;
        ob$SwapStep.ilv[50] = -2888675706616731780L;
        ob$SwapStep.ilv[51] = -4234375213445715957L;
        ob$SwapStep.ilv[52] = -6254079531701978320L;
        ob$SwapStep.ilv[53] = -440860922233201313L;
        ob$SwapStep.ilv[54] = -5998143163234974884L;
    }
}

