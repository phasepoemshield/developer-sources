/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1735
 *  net.minecraft.class_332
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.minecraft.class_1735;
import net.minecraft.class_332;
import ruhack.phobia.bc;

public class ce
extends bc {
    public static final boolean a;
    private class_332 drawContext;
    private static long[] dntt;
    private int mouseY;
    private int backgroundWidth;
    private static long[] dntu;
    private static int[] dnty;
    private int mouseX;
    private int backgroundHeight;
    public static final int b;
    public static final boolean c;
    static final long ij = -660334702556019588L;
    private static int[] dntz;
    private class_1735 slotHover;

    private static /* synthetic */ void dnyc() {
        ce.dntu[0] = -7446518911907721737L;
        ce.dntu[1] = 2303911460396457035L;
        ce.dntu[2] = 2533665175753659615L;
        ce.dntu[3] = 9214170698588504885L;
        ce.dntu[4] = 329240907765679726L;
        ce.dntu[5] = -913682908683117851L;
        ce.dntu[6] = -6565522816773666066L;
        ce.dntu[7] = -5546868266926718970L;
        ce.dntu[8] = -5658719847464607825L;
        ce.dntu[9] = 5285955670832609095L;
        ce.dntu[10] = 1129422979126963101L;
        ce.dntu[11] = -6801168114413084099L;
        ce.dntu[12] = -7258657760698117747L;
        ce.dntu[13] = -4332499674178404281L;
        ce.dntu[14] = -2044917166659065901L;
        ce.dntu[15] = 3444895745787698536L;
        ce.dntu[16] = 1736830900094281011L;
        ce.dntu[17] = 2110139929775090725L;
        ce.dntu[18] = -2107208502413215968L;
        ce.dntu[19] = -4499713052171629839L;
        ce.dntu[20] = 2587363241878570886L;
        ce.dntu[21] = 5567533565743026902L;
        ce.dntu[22] = 4536772071787024L;
        ce.dntu[23] = 3036313803564053516L;
        ce.dntu[24] = 6301430961293427984L;
        ce.dntu[25] = -2532596250575670045L;
        ce.dntu[26] = -5635709684552048984L;
        ce.dntu[27] = -6816389806424527393L;
        ce.dntu[28] = 4495856717930168906L;
        ce.dntu[29] = -1097544104065016271L;
        ce.dntu[30] = -8361259660100671327L;
        ce.dntu[31] = 5491208508950224599L;
        ce.dntu[32] = -7428636586042952573L;
        ce.dntu[33] = -193346528715396848L;
        ce.dntu[34] = 7211561824380745146L;
        ce.dntu[35] = 4992053539710915694L;
        ce.dntu[36] = 8143621870818254669L;
        ce.dntu[37] = -7833428610460091127L;
        ce.dntu[38] = -933069465068833656L;
        ce.dntu[39] = 4177617628386325068L;
        ce.dntu[40] = 4822501860443556810L;
        ce.dntu[41] = -2504472153404916739L;
    }

    private static /* synthetic */ long dnts(int n2) {
        return dntt[n2] ^ dntu[n2];
    }

    private static /* synthetic */ void dnyb() {
        ce.dntt[0] = 6658606334572944194L;
        ce.dntt[1] = -6913627308369749798L;
        ce.dntt[2] = -312732315422706214L;
        ce.dntt[3] = 4464015002236264143L;
        ce.dntt[4] = 1715574471534404993L;
        ce.dntt[5] = 331796984189538586L;
        ce.dntt[6] = -4378007539719386921L;
        ce.dntt[7] = 9088564905707093598L;
        ce.dntt[8] = -5946380054554469348L;
        ce.dntt[9] = 4782150535547103553L;
        ce.dntt[10] = -7218083530660885703L;
        ce.dntt[11] = 3796275877024077L;
        ce.dntt[12] = -1405803527141583157L;
        ce.dntt[13] = -5263602810435707330L;
        ce.dntt[14] = 2524821365120293549L;
        ce.dntt[15] = -3519542066808912321L;
        ce.dntt[16] = -1444233806179056738L;
        ce.dntt[17] = 2117593517660615150L;
        ce.dntt[18] = -4890576733920113252L;
        ce.dntt[19] = 6242276116724618230L;
        ce.dntt[20] = -7761596544899960293L;
        ce.dntt[21] = -6416414815060959486L;
        ce.dntt[22] = 1857503625668527517L;
        ce.dntt[23] = -7540861218570344391L;
        ce.dntt[24] = 1017503971538412701L;
        ce.dntt[25] = 1503480580154133910L;
        ce.dntt[26] = -2418743166639583019L;
        ce.dntt[27] = 7536461394479416287L;
        ce.dntt[28] = 4905386164269683029L;
        ce.dntt[29] = -5516685460854156970L;
        ce.dntt[30] = 6693499454344428815L;
        ce.dntt[31] = 7422324191880238870L;
        ce.dntt[32] = -3737219061044075345L;
        ce.dntt[33] = -6799352411677268622L;
        ce.dntt[34] = 6629514669591474340L;
        ce.dntt[35] = -64823902883617930L;
        ce.dntt[36] = 5068278201047513574L;
        ce.dntt[37] = -781567406656101546L;
        ce.dntt[38] = -6255806478892417681L;
        ce.dntt[39] = -2348841541716382005L;
        ce.dntt[40] = 8959137303029916937L;
        ce.dntt[41] = -7232156811807119718L;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public int getMouseX() {
        Object object = ij;
        boolean bl2 = true;
        block16: while (true) {
            CallSite callSite;
            if (!bl2 || (bl2 = false) || !true) {
                object = callSite - ce.dntv("dnvf", dnts(int ), (int)14);
            }
            switch ((int)object) {
                case -215410373: {
                    callSite = ce.dntv("dnvg", dnts(int ), (int)15);
                    continue block16;
                }
                case 536144610: {
                    callSite = ce.dntv("dnvh", dnts(int ), (int)16);
                    continue block16;
                }
                case 759759996: {
                    break block16;
                }
                case 1599028221: {
                    callSite = ce.dntv("dnvi", dnts(int ), (int)17);
                    continue block16;
                }
            }
            break;
        }
        boolean bl3 = c;
        Object object2 = ij;
        boolean bl4 = true;
        block17: while (true) {
            CallSite callSite;
            if (!bl4 || (bl4 = false) || !true) {
                object2 = callSite - ce.dntv("dnvj", dnts(int ), (int)18);
            }
            switch ((int)object2) {
                case -280346793: {
                    callSite = ce.dntv("dnvk", dnts(int ), (int)19);
                    continue block17;
                }
                case 759759996: {
                    break block17;
                }
                case 1867746336: {
                    callSite = ce.dntv("dnvl", dnts(int ), (int)20);
                    continue block17;
                }
                case 2077642615: {
                    callSite = ce.dntv("dnvm", dnts(int ), (int)21);
                    continue block17;
                }
            }
            break;
        }
        int n2 = b;
        Object object3 = ij;
        block18: while (true) {
            switch ((int)object3) {
                case 759759996: {
                    break block18;
                }
                case 1988201043: {
                    object3 = ce.dntv("dnvo", dnts(int ), (int)23) - ce.dntv("dnvn", dnts(int ), (int)22);
                    continue block18;
                }
            }
            break;
        }
        boolean bl5 = a;
        if (bl3) {
            throw null;
        }
        if (bl5) return (int)ce.dntv("dnvp", dntx(int ), (int)18);
        if (bl5) return (int)ce.dntv("dnvp", dntx(int ), (int)18);
        while (true) {
            long l2;
            Object object4;
            if ((object4 = (l2 = ij - ce.dntv("dnvq", dnts(int ), (int)24)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (object4 == ce.dntv("dnvr", dntx(int ), (int)19)) {
                return this.mouseX;
            }
            object4 = ce.dntv("dnvs", dntx(int ), (int)20);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public class_332 getDrawContext() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ce.ij - ce.dntv("dntw", dnts(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ce.dntv("dnua", dntx(int ), (int)0)) break;
            v0 /* !! */  = (long)ce.dntv("dnub", dntx(int ), (int)1);
        }
        var3_1 = ce.c;
        v1 /* !! */  = ce.ij;
        if (true) ** GOTO lbl12
        block16: while (true) {
            v1 /* !! */  = (long)(v2 - ce.dntv("dnuc", dnts(int ), (int)1));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -697754824: {
                    v2 = ce.dntv("dnud", dnts(int ), (int)2);
                    continue block16;
                }
                case 759759996: {
                    break block16;
                }
                case 836052665: {
                    v2 = ce.dntv("dnue", dnts(int ), (int)3);
                    continue block16;
                }
            }
            break;
        }
        var2_2 = ce.b;
        v3 /* !! */  = ce.ij;
        if (true) ** GOTO lbl26
        block17: while (true) {
            v3 /* !! */  = (long)(ce.dntv("dnug", dnts(int ), (int)5) - ce.dntv("dnuf", dnts(int ), (int)4));
lbl26:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -200127358: {
                    continue block17;
                }
                case 759759996: {
                    break block17;
                }
            }
            break;
        }
        var1_3 = ce.a;
        if (var3_1) {
            throw null;
lbl34:
            // 1 sources

            return null;
        }
        ** while (var1_3 || var1_3)
lbl37:
        // 1 sources

        v4 /* !! */  = ce.ij;
        if (true) ** GOTO lbl41
        block19: while (true) {
            v4 /* !! */  = (long)(v5 - ce.dntv("dnuh", dnts(int ), (int)6));
lbl41:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1842979825: {
                    v5 = ce.dntv("dnui", dnts(int ), (int)7);
                    continue block19;
                }
                case -1791214243: {
                    v5 = ce.dntv("dnuj", dnts(int ), (int)8);
                    continue block19;
                }
                case -1073975342: {
                    v5 = ce.dntv("dnuk", dnts(int ), (int)9);
                    continue block19;
                }
                case 759759996: {
                    break block19;
                }
            }
            break;
        }
        return this.drawContext;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public int getBackgroundWidth() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ce.ij - ce.dntv("dnwn", dnts(int ), (int)32)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ce.dntv("dnwo", dntx(int ), (int)34)) break;
            v0 /* !! */  = (long)ce.dntv("dnwp", dntx(int ), (int)35);
        }
        var3_1 = ce.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ce.ij - ce.dntv("dnwq", dnts(int ), (int)33)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == ce.dntv("dnwr", dntx(int ), (int)36)) break;
            v1 /* !! */  = (long)ce.dntv("dnws", dntx(int ), (int)37);
        }
        var2_2 /* !! */  = ce.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = ce.ij - ce.dntv("dnwt", dnts(int ), (int)34)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == ce.dntv("dnwu", dntx(int ), (int)38)) break;
            v2 /* !! */  = (long)ce.dntv("dnwv", dntx(int ), (int)39);
        }
        var1_3 = ce.a;
        if (var3_1) {
            throw null;
lbl24:
            // 2 sources

            return (int)ce.dntv("dnww", dntx(int ), (int)40);
        }
        if (var1_3) ** GOTO lbl24
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                v3 /* !! */  = ce.ij;
                if (true) ** GOTO lbl35
                block14: while (true) {
                    v3 /* !! */  = (long)(ce.dntv("dnwy", dnts(int ), (int)36) - ce.dntv("dnwx", dnts(int ), (int)35));
lbl35:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -850649900: {
                            continue block14;
                        }
                        case 759759996: {
                            break block14;
                        }
                    }
                    break;
                }
                return this.backgroundWidth;
            }
            case 0: {
                var2_2 /* !! */  = (int)ce.dntv("dnwz", dntx(int ), (int)41);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl50
            }
            case 1: {
                var2_2 /* !! */  = (int)ce.dntv("dnxa", dntx(int ), (int)42);
                if (var3_1) {
                    throw null;
                }
            }
lbl50:
            // 4 sources

            case 2: {
                do {
                    var2_2 /* !! */  = (int)ce.dntv("dnxb", dntx(int ), (int)43);
                } while (!var3_1);
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)ce.dntv("dnxc", dntx(int ), (int)44);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ int dntx(int n2) {
        return dnty[n2] ^ dntz[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public class_1735 getSlotHover() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ce.ij - ce.dntv("dnup", dnts(int ), (int)10)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ce.dntv("dnuq", dntx(int ), (int)6)) break;
            v0 /* !! */  = (long)ce.dntv("dnur", dntx(int ), (int)7);
        }
        var3_1 = ce.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ce.ij - ce.dntv("dnus", dnts(int ), (int)11)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == ce.dntv("dnut", dntx(int ), (int)8)) break;
            v1 /* !! */  = (long)ce.dntv("dnuu", dntx(int ), (int)9);
        }
        var2_2 /* !! */  = ce.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = ce.ij - ce.dntv("dnuv", dnts(int ), (int)12)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == ce.dntv("dnuw", dntx(int ), (int)10)) break;
            v2 /* !! */  = (long)ce.dntv("dnux", dntx(int ), (int)11);
        }
        var1_3 = ce.a;
        if (var3_1) {
            throw null;
lbl24:
            // 2 sources

            return null;
        }
        if (var1_3) ** GOTO lbl24
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block0 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_3 = ce.ij - ce.dntv("dnuy", dnts(int ), (int)13)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == ce.dntv("dnuz", dntx(int ), (int)12)) break;
                    v3 /* !! */  = (long)ce.dntv("dnva", dntx(int ), (int)13);
                }
                return this.slotHover;
            }
lbl38:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ce.dntv("dnvb", dntx(int ), (int)14);
                    if (!var3_1) break block0;
                    throw null;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)ce.dntv("dnvc", dntx(int ), (int)15);
                if (!var3_1) break;
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)ce.dntv("dnvd", dntx(int ), (int)16);
                if (!var3_1) ** GOTO lbl38
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)ce.dntv("dnve", dntx(int ), (int)17);
        ** while (!var3_1)
lbl54:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public int getBackgroundHeight() {
        v0 /* !! */  = ce.ij;
        if (true) ** GOTO lbl5
        block10: while (true) {
            v0 /* !! */  = (long)(ce.dntv("dnxe", dnts(int ), (int)38) - ce.dntv("dnxd", dnts(int ), (int)37));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 560526692: {
                    continue block10;
                }
                case 759759996: {
                    break block10;
                }
            }
            break;
        }
        var3_1 = ce.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = ce.ij - ce.dntv("dnxf", dnts(int ), (int)39)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == ce.dntv("dnxg", dntx(int ), (int)45)) break;
            v1 /* !! */  = (long)ce.dntv("dnxh", dntx(int ), (int)46);
        }
        var2_2 /* !! */  = ce.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = ce.ij - ce.dntv("dnxi", dnts(int ), (int)40)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == ce.dntv("dnxj", dntx(int ), (int)47)) break;
            v2 /* !! */  = (long)ce.dntv("dnxk", dntx(int ), (int)48);
        }
        var1_3 = ce.a;
        if (var3_1) {
            throw null;
lbl27:
            // 2 sources

            return (int)ce.dntv("dnxl", dntx(int ), (int)49);
        }
        if (var1_3) ** GOTO lbl27
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = ce.ij - ce.dntv("dnxm", dnts(int ), (int)41)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == ce.dntv("dnxn", dntx(int ), (int)50)) break;
                    v3 /* !! */  = (long)ce.dntv("dnxo", dntx(int ), (int)51);
                }
                return this.backgroundHeight;
            }
            case 0: {
                var2_2 /* !! */  = (int)ce.dntv("dnxp", dntx(int ), (int)52);
                if (!var3_1) break;
                throw null;
            }
lbl45:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)ce.dntv("dnxq", dntx(int ), (int)53);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)ce.dntv("dnxr", dntx(int ), (int)54);
                if (!var3_1) ** GOTO lbl45
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)ce.dntv("dnxs", dntx(int ), (int)55);
        } while (!var3_1);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public ce(class_332 var1_1, class_1735 var2_2, int var3_3, int var4_4, int var5_5, int var6_6) {
        var8_7 /* !! */  = ce.b;
        var7_8 = ce.a;
        super();
        this.drawContext = var1_1;
        this.slotHover = var2_2;
        if (var8_7 /* !! */  == 0) ** GOTO lbl-1000
        switch (var8_7 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.mouseX = var3_3;
                this.mouseY = var4_4;
                this.backgroundWidth = var5_5;
                this.backgroundHeight = var6_6;
                return;
            }
lbl14:
            // 2 sources

            case 0: {
                while (true) {
                    var8_7 /* !! */  = (int)ce.dntv("dnxt", dntx(int ), (int)56);
                }
            }
lbl18:
            // 2 sources

            case 1: {
                var8_7 /* !! */  = (int)ce.dntv("dnxu", dntx(int ), (int)57);
                ** GOTO lbl14
            }
lbl21:
            // 2 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var8_7 /* !! */  = (int)ce.dntv("dnxv", dntx(int ), (int)58);
                    ** GOTO lbl28
                    break;
                }
            }
            case 3: {
                var8_7 /* !! */  = (int)ce.dntv("dnxw", dntx(int ), (int)59);
                ** GOTO lbl18
            }
lbl28:
            // 2 sources

            case 4: {
                var8_7 /* !! */  = (int)ce.dntv("dnxx", dntx(int ), (int)60);
                ** GOTO lbl21
            }
            case 5: 
        }
        var8_7 /* !! */  = (int)ce.dntv("dnxy", dntx(int ), (int)61);
        ** while (true)
    }

    private static /* synthetic */ void dnya() {
        ce.dntz[0] = -1434319786;
        ce.dntz[1] = -2133874071;
        ce.dntz[2] = -1442368413;
        ce.dntz[3] = 1754098844;
        ce.dntz[4] = -1085652684;
        ce.dntz[5] = -1922530026;
        ce.dntz[6] = -2106589166;
        ce.dntz[7] = -995934802;
        ce.dntz[8] = 1584698536;
        ce.dntz[9] = -807366316;
        ce.dntz[10] = -1404930;
        ce.dntz[11] = -812853028;
        ce.dntz[12] = -1036295653;
        ce.dntz[13] = -790632846;
        ce.dntz[14] = -1384153259;
        ce.dntz[15] = -1053490379;
        ce.dntz[16] = 639386775;
        ce.dntz[17] = -522854762;
        ce.dntz[18] = 562474672;
        ce.dntz[19] = 203068538;
        ce.dntz[20] = 263335650;
        ce.dntz[21] = -113423702;
        ce.dntz[22] = -1048499899;
        ce.dntz[23] = 1278530172;
        ce.dntz[24] = 171126250;
        ce.dntz[25] = 31893833;
        ce.dntz[26] = -1509369953;
        ce.dntz[27] = -918820547;
        ce.dntz[28] = 1752183139;
        ce.dntz[29] = -631219327;
        ce.dntz[30] = -638777884;
        ce.dntz[31] = 134951237;
        ce.dntz[32] = -1583030812;
        ce.dntz[33] = 1489364328;
        ce.dntz[34] = -1678077855;
        ce.dntz[35] = 714042093;
        ce.dntz[36] = 1121626451;
        ce.dntz[37] = -504997987;
        ce.dntz[38] = -517708280;
        ce.dntz[39] = -521266274;
        ce.dntz[40] = -611363610;
        ce.dntz[41] = 865390646;
        ce.dntz[42] = -994529231;
        ce.dntz[43] = 760973565;
        ce.dntz[44] = 1475369478;
        ce.dntz[45] = 246556279;
        ce.dntz[46] = -477833230;
        ce.dntz[47] = 1442470065;
        ce.dntz[48] = -1290217994;
        ce.dntz[49] = 82787686;
        ce.dntz[50] = -735407339;
        ce.dntz[51] = -887098238;
        ce.dntz[52] = 219429550;
        ce.dntz[53] = 2118355484;
        ce.dntz[54] = -2023219188;
        ce.dntz[55] = 1590839943;
        ce.dntz[56] = -990933266;
        ce.dntz[57] = 1818849924;
        ce.dntz[58] = -1791019379;
        ce.dntz[59] = 2038294485;
        ce.dntz[60] = -1740248188;
        ce.dntz[61] = 1467504044;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public int getMouseY() {
        v0 /* !! */  = ce.ij;
        if (true) ** GOTO lbl5
        block15: while (true) {
            v0 /* !! */  = (long)(ce.dntv("dnvy", dnts(int ), (int)26) - ce.dntv("dnvx", dnts(int ), (int)25));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 365952047: {
                    continue block15;
                }
                case 759759996: {
                    break block15;
                }
            }
            break;
        }
        var3_1 = ce.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = ce.ij - ce.dntv("dnvz", dnts(int ), (int)27)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == ce.dntv("dnwa", dntx(int ), (int)25)) break;
            v1 /* !! */  = (long)ce.dntv("dnwb", dntx(int ), (int)26);
        }
        var2_2 /* !! */  = ce.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v2 /* !! */  = ce.ij;
                if (true) ** GOTO lbl25
                block17: while (true) {
                    v2 /* !! */  = (long)(v3 - ce.dntv("dnwc", dnts(int ), (int)28));
lbl25:
                    // 2 sources

                    switch ((int)v2 /* !! */ ) {
                        case -707798075: {
                            v3 = ce.dntv("dnwd", dnts(int ), (int)29);
                            continue block17;
                        }
                        case 759759996: {
                            break block17;
                        }
                        case 1532409706: {
                            v3 = ce.dntv("dnwe", dnts(int ), (int)30);
                            continue block17;
                        }
                    }
                    break;
                }
                var1_3 = ce.a;
                if (var3_1) {
                    throw null;
                    return (int)ce.dntv("dnwf", dntx(int ), (int)27);
                }
                if (var1_3 || var1_3) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_1 = ce.ij - ce.dntv("dnwg", dnts(int ), (int)31)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == ce.dntv("dnwh", dntx(int ), (int)28)) break;
                    v4 /* !! */  = (long)ce.dntv("dnwi", dntx(int ), (int)29);
                }
                return this.mouseY;
            }
lbl47:
            // 2 sources

            case 0: {
                do {
                    var2_2 /* !! */  = (int)ce.dntv("dnwj", dntx(int ), (int)30);
                } while (!var3_1);
                throw null;
            }
lbl52:
            // 2 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ce.dntv("dnwk", dntx(int ), (int)31);
                    if (!var3_1) ** GOTO lbl47
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)ce.dntv("dnwl", dntx(int ), (int)32);
                if (!var3_1) ** GOTO lbl52
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)ce.dntv("dnwm", dntx(int ), (int)33);
        ** while (!var3_1)
lbl64:
        // 1 sources

        throw null;
    }

    static {
        dnty = new int[62];
        dntz = new int[62];
        ce.dnxz();
        ce.dnya();
        dntt = new long[42];
        dntu = new long[42];
        ce.dnyb();
        ce.dnyc();
    }

    private static /* synthetic */ void dnxz() {
        ce.dnty[0] = -1434319785;
        ce.dnty[1] = -969109095;
        ce.dnty[2] = -1442368415;
        ce.dnty[3] = 1754098847;
        ce.dnty[4] = -1085652682;
        ce.dnty[5] = -1922530027;
        ce.dnty[6] = -2106589165;
        ce.dnty[7] = -104251653;
        ce.dnty[8] = 1584698537;
        ce.dnty[9] = 573593821;
        ce.dnty[10] = 1404929;
        ce.dnty[11] = 159479345;
        ce.dnty[12] = 1036295652;
        ce.dnty[13] = -632786208;
        ce.dnty[14] = -1384153257;
        ce.dnty[15] = -1053490379;
        ce.dnty[16] = 639386774;
        ce.dnty[17] = -522854764;
        ce.dnty[18] = 9361110;
        ce.dnty[19] = -203068539;
        ce.dnty[20] = -1368797230;
        ce.dnty[21] = -113423701;
        ce.dnty[22] = -1048499899;
        ce.dnty[23] = 1278530173;
        ce.dnty[24] = 171126248;
        ce.dnty[25] = 31893832;
        ce.dnty[26] = -1255596618;
        ce.dnty[27] = -745230838;
        ce.dnty[28] = -1752183140;
        ce.dnty[29] = 1724612976;
        ce.dnty[30] = -638777883;
        ce.dnty[31] = 134951238;
        ce.dnty[32] = -1583030811;
        ce.dnty[33] = 1489364329;
        ce.dnty[34] = 1678077854;
        ce.dnty[35] = 516240578;
        ce.dnty[36] = -1121626452;
        ce.dnty[37] = 758900006;
        ce.dnty[38] = 517708279;
        ce.dnty[39] = 596322123;
        ce.dnty[40] = 340793844;
        ce.dnty[41] = 865390646;
        ce.dnty[42] = -994529229;
        ce.dnty[43] = 760973566;
        ce.dnty[44] = 1475369478;
        ce.dnty[45] = 246556278;
        ce.dnty[46] = 1419589746;
        ce.dnty[47] = -1442470066;
        ce.dnty[48] = -464189740;
        ce.dnty[49] = -349826229;
        ce.dnty[50] = 735407338;
        ce.dnty[51] = 1016924163;
        ce.dnty[52] = 219429549;
        ce.dnty[53] = 2118355485;
        ce.dnty[54] = -2023219185;
        ce.dnty[55] = 1590839943;
        ce.dnty[56] = -990933267;
        ce.dnty[57] = 1818849926;
        ce.dnty[58] = -1791019378;
        ce.dnty[59] = 2038294487;
        ce.dnty[60] = -1740248187;
        ce.dnty[61] = 1467504047;
    }

    public static /* synthetic */ CallSite dntv(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }
}

