/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1268
 *  net.minecraft.class_1297
 *  net.minecraft.class_1511
 *  net.minecraft.class_1542
 *  net.minecraft.class_1657
 *  net.minecraft.class_1747
 *  net.minecraft.class_1799
 *  net.minecraft.class_1802
 *  net.minecraft.class_2246
 *  net.minecraft.class_2338
 *  net.minecraft.class_2350
 *  net.minecraft.class_238
 *  net.minecraft.class_2382
 *  net.minecraft.class_239$class_240
 *  net.minecraft.class_243
 *  net.minecraft.class_2480
 *  net.minecraft.class_3965
 *  net.minecraft.class_742
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.function.Predicate;
import net.minecraft.class_1268;
import net.minecraft.class_1297;
import net.minecraft.class_1511;
import net.minecraft.class_1542;
import net.minecraft.class_1657;
import net.minecraft.class_1747;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_238;
import net.minecraft.class_2382;
import net.minecraft.class_239;
import net.minecraft.class_243;
import net.minecraft.class_2480;
import net.minecraft.class_3965;
import net.minecraft.class_742;
import ruhack.phobia.aw;
import ruhack.phobia.cy;
import ruhack.phobia.df;
import ruhack.phobia.dj;
import ruhack.phobia.dl;
import ruhack.phobia.ds;
import ruhack.phobia.du;
import ruhack.phobia.hy;
import ruhack.phobia.jx;
import ruhack.phobia.kb;
import ruhack.phobia.ke;
import ruhack.phobia.nn;
import ruhack.phobia.nv;
import ruhack.phobia.os;
import ruhack.phobia.ot;
import ruhack.phobia.ow;

public class he
extends ds {
    private final kb placeOnRightClick;
    private final ke protect;
    private class_2338 targetPos;
    private static int[] emjb = new int[637];
    public static final int b;
    private int waitingTicks;
    private int targetSlot;
    private static int[] emjc;
    public static final boolean c;
    private static final int CRYSTAL_ATTACK_WINDOW = 12;
    public static final long la = -8263458932431849370L;
    private int crystalAttackTicks;
    private int oldSlot;
    private boolean needSync;
    private static long[] emjr;
    private class_238 crystalArea;
    private static final long PLACE_DELAY_MS = 65L;
    public static final boolean a;
    private class_2338 waitingObsidian;
    private static long[] emjq;
    private long placeAt;
    private boolean useWasPressed;

    public static /* synthetic */ CallSite emjd(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private void armCrystalAttack(class_2338 var1_1) {
        v0 /* !! */  = he.la;
        block25: while (true) {
            switch ((int)v0 /* !! */ ) {
                case -1183369760: {
                    v0 /* !! */  = (long)(he.emjd("enwi", emjp(int ), (int)307) - he.emjd("enwh", emjp(int ), (int)306));
                    continue block25;
                }
                case -195102618: {
                    break block25;
                }
            }
            break;
        }
        var4_2 = he.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = he.la - he.emjd("enwj", emjp(int ), (int)308)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == he.emjd("enwk", emja(int ), (int)482)) break;
            v1 /* !! */  = (long)he.emjd("enwl", emja(int ), (int)483);
        }
        var3_3 /* !! */  = he.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = he.la - he.emjd("enwm", emjp(int ), (int)309)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == he.emjd("enwn", emja(int ), (int)484)) {
                var2_4 = he.a;
                if (var4_2) {
                    throw null;
                }
                break;
            }
            v2 /* !! */  = (long)he.emjd("enwo", emja(int ), (int)485);
        }
        if (var2_4 || var2_4) return;
        while (true) {
            block52: {
                if ((v3 /* !! */  = (cfr_temp_3 = he.la - he.emjd("enwp", emjp(int ), (int)310)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v3 /* !! */  != he.emjd("enwr", emja(int ), (int)486)) break block52;
                v4 /* !! */  = he.la;
                if (true) ** GOTO lbl36
            }
            v3 /* !! */  = (long)he.emjd("enws", emja(int ), (int)487);
        }
        block29: while (true) {
            v4 /* !! */  = (long)(v5 - he.emjd("enwt", emjp(int ), (int)311));
lbl36:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -195102618: {
                    break block29;
                }
                case -113746612: {
                    v5 = he.emjd("enwu", emjp(int ), (int)312);
                    continue block29;
                }
                case 713125540: {
                    v5 = he.emjd("enwv", emjp(int ), (int)313);
                    continue block29;
                }
                case 1323574564: {
                    v5 = he.emjd("enww", emjp(int ), (int)314);
                    continue block29;
                }
            }
            break;
        }
        v6 = var1_1.method_10084();
        v7 /* !! */  = he.la;
        if (true) ** GOTO lbl53
        block30: while (true) {
            v7 /* !! */  = (long)(v8 - he.emjd("enwx", emjp(int ), (int)315));
lbl53:
            // 2 sources

            switch ((int)v7 /* !! */ ) {
                case -1033427516: {
                    v8 = he.emjd("enwy", emjp(int ), (int)316);
                    continue block30;
                }
                case -195102618: {
                    break block30;
                }
                case 836834755: {
                    v8 = he.emjd("enwz", emjp(int ), (int)317);
                    continue block30;
                }
            }
            break;
        }
        v9 = new class_238(v6);
        v10 = he.emjd("enxa", emsz(int ), (int)318);
        while (true) {
            if ((v11 /* !! */  = (cfr_temp_4 = he.la - he.emjd("enxb", emjp(int ), (int)319)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v11 /* !! */  == he.emjd("enxc", emja(int ), (int)488)) break;
            v11 /* !! */  = (long)he.emjd("enxd", emja(int ), (int)489);
        }
        v12 = v9.method_1014((double)v10);
        while (true) {
            if ((v13 /* !! */  = (cfr_temp_5 = he.la - he.emjd("enxe", emjp(int ), (int)320)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v13 /* !! */  == he.emjd("enxf", emja(int ), (int)490)) {
                this.crystalArea = v12;
                if (var2_4) return;
                break;
            }
            v13 /* !! */  = (long)he.emjd("enxg", emja(int ), (int)491);
        }
        if (var2_4) return;
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block33: while (true) {
            block53: {
                switch (cfr_temp_0 == -2147483648 ? var3_3 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        v14 = he.emjd("enxh", emja(int ), (int)492);
                        while (true) {
                            if ((v15 /* !! */  = (cfr_temp_6 = he.la - he.emjd("enxi", emjp(int ), (int)321)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                            if (v15 /* !! */  == he.emjd("enxj", emja(int ), (int)493)) {
                                this.crystalAttackTicks = (int)v14;
                                if (var2_4) return;
                                break;
                            }
                            v15 /* !! */  = (long)he.emjd("enxk", emja(int ), (int)494);
                        }
                        if (!var2_4) return;
                        return;
                    }
                    case 2: {
                        var3_3 /* !! */  = (int)he.emjd("enxn", emja(int ), (int)497);
                        cfr_temp_0 = 1;
                        if (var4_2) {
                            throw null;
                        }
                        break block53;
                    }
                    case 3: {
                        var3_3 /* !! */  = (int)he.emjd("enxo", emja(int ), (int)498);
                        cfr_temp_0 = 1;
                        if (var4_2) {
                            throw null;
                        }
                        break block53;
                    }
                    case 6: {
                        var3_3 /* !! */  = (int)he.emjd("enxr", emja(int ), (int)501);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 4: {
                        var3_3 /* !! */  = (int)he.emjd("enxp", emja(int ), (int)499);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 5: {
                        do {
                            var3_3 /* !! */  = (int)he.emjd("enxq", emja(int ), (int)500);
                        } while (!var4_2);
                        throw null;
                    }
                    case 7: {
                        var3_3 /* !! */  = (int)he.emjd("enxs", emja(int ), (int)502);
                        if (var4_2) {
                            throw null;
                        }
                        ** GOTO lbl-1000
                    }
                    case 0: lbl-1000:
                    // 2 sources

                    {
                        var3_3 /* !! */  = (int)he.emjd("enxl", emja(int ), (int)495);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 1: 
                }
                ** GOTO lbl134
            }
            do {
                if (true) continue block33;
lbl134:
                // 2 sources

                var3_3 /* !! */  = (int)he.emjd("enxm", emja(int ), (int)496);
                cfr_temp_0 = 0;
            } while (!var4_2);
            break;
        }
        throw null;
    }

    private static /* synthetic */ void eofb() {
        he.emjq[0] = 4071812719519880961L;
        he.emjq[1] = 2982411168405273880L;
        he.emjq[2] = -1602581505389833315L;
        he.emjq[3] = 8073605344985085918L;
        he.emjq[4] = -3173145024017446870L;
        he.emjq[5] = 443016512707162146L;
        he.emjq[6] = -2986362747723212796L;
        he.emjq[7] = -7091613450487444203L;
        he.emjq[8] = 1145930821390349838L;
        he.emjq[9] = 2764213866830338291L;
        he.emjq[10] = -8809766728128610117L;
        he.emjq[11] = -5614940170462387328L;
        he.emjq[12] = -1887591987929641495L;
        he.emjq[13] = -6508485674323819655L;
        he.emjq[14] = -8055913300639955665L;
        he.emjq[15] = -3497505816210739894L;
        he.emjq[16] = 8452524266270249062L;
        he.emjq[17] = 7866433408139507738L;
        he.emjq[18] = 3568368005471043896L;
        he.emjq[19] = -3064115963255503507L;
        he.emjq[20] = 7843769070493040072L;
        he.emjq[21] = 7067211513474795613L;
        he.emjq[22] = 5655085445094281659L;
        he.emjq[23] = 7315396461557012830L;
        he.emjq[24] = 6273137753343587937L;
        he.emjq[25] = -4336986992528949422L;
        he.emjq[26] = -316166089654707310L;
        he.emjq[27] = 907189012605766858L;
        he.emjq[28] = -8218701871700094267L;
        he.emjq[29] = 6335231762642181236L;
        he.emjq[30] = -2276696053469527327L;
        he.emjq[31] = -4191019015061395442L;
        he.emjq[32] = 7487177119946080736L;
        he.emjq[33] = -426998186191189475L;
        he.emjq[34] = 1209501734874814568L;
        he.emjq[35] = -9137398793333110616L;
        he.emjq[36] = 6516026985603770882L;
        he.emjq[37] = 2455807574907637939L;
        he.emjq[38] = 6148455206996681569L;
        he.emjq[39] = -4762086711983846114L;
        he.emjq[40] = 7947413331893967253L;
        he.emjq[41] = -6742003351084468152L;
        he.emjq[42] = -4030896915588837732L;
        he.emjq[43] = -6803836390362238942L;
        he.emjq[44] = 5004146135721984337L;
        he.emjq[45] = 4159732782206958551L;
        he.emjq[46] = -738455182053841247L;
        he.emjq[47] = 3804104582427768322L;
        he.emjq[48] = -4150773759535597095L;
        he.emjq[49] = -6503033456472360938L;
        he.emjq[50] = 837223670515319164L;
        he.emjq[51] = 4122132739622450796L;
        he.emjq[52] = 4322596695537083879L;
        he.emjq[53] = 6978978925338388814L;
        he.emjq[54] = 8401157767642425969L;
        he.emjq[55] = -4175059934911186037L;
        he.emjq[56] = 7359684591196419243L;
        he.emjq[57] = 9103963690696685272L;
        he.emjq[58] = -3675254696147821947L;
        he.emjq[59] = 5648733993345881469L;
        he.emjq[60] = 8587915639238024096L;
        he.emjq[61] = 2677658942067016451L;
        he.emjq[62] = -2344426294633893278L;
        he.emjq[63] = -6140279317369261520L;
        he.emjq[64] = -4931834303651777632L;
        he.emjq[65] = 611565932545682435L;
        he.emjq[66] = 2398781398959422163L;
        he.emjq[67] = 3345783196135799100L;
        he.emjq[68] = 1528247569851660822L;
        he.emjq[69] = 6172818826090929362L;
        he.emjq[70] = 8707808548820480025L;
        he.emjq[71] = 3754983710795695611L;
        he.emjq[72] = -7130443832271335550L;
        he.emjq[73] = -2355436733992523360L;
        he.emjq[74] = -3750390112711660856L;
        he.emjq[75] = -2001776552490718666L;
        he.emjq[76] = 7117368518652113606L;
        he.emjq[77] = 7674557646654848244L;
        he.emjq[78] = 2512369238373955264L;
        he.emjq[79] = 6943592066117356523L;
        he.emjq[80] = -6495542514075171160L;
        he.emjq[81] = -1608663825768976860L;
        he.emjq[82] = 5855177889398990224L;
        he.emjq[83] = -1331569744218778719L;
        he.emjq[84] = 3967771055646699987L;
        he.emjq[85] = 1563700617084878967L;
        he.emjq[86] = -6038568460567692172L;
        he.emjq[87] = -4377377304087720997L;
        he.emjq[88] = -3246469891238466132L;
        he.emjq[89] = 5733714517258111907L;
        he.emjq[90] = -8715775831246426491L;
        he.emjq[91] = -2661897727314629431L;
        he.emjq[92] = -7910265315273211268L;
        he.emjq[93] = 3078009759470615607L;
        he.emjq[94] = 8206845873424995802L;
        he.emjq[95] = -9210548227270892367L;
        he.emjq[96] = 5895610740588076013L;
        he.emjq[97] = -4824730075060807543L;
        he.emjq[98] = -6772085195723070976L;
        he.emjq[99] = -776797523283208167L;
    }

    private static /* synthetic */ double emsz(int n2) {
        return Double.longBitsToDouble(emjq[n2] ^ emjr[n2]);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void clearCrystalAttack() {
        v0 /* !! */  = he.la;
        if (true) ** GOTO lbl5
        block31: while (true) {
            v0 /* !! */  = (long)(he.emjd("enxu", emjp(int ), (int)323) - he.emjd("enxt", emjp(int ), (int)322));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -195102618: {
                    break block31;
                }
                case 1007768568: {
                    continue block31;
                }
            }
            break;
        }
        var3_1 = he.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = he.la - he.emjd("enxv", emjp(int ), (int)324)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == he.emjd("enxw", emja(int ), (int)503)) break;
            v1 /* !! */  = (long)he.emjd("enxx", emja(int ), (int)504);
        }
        var2_2 /* !! */  = he.b;
        v2 /* !! */  = he.la;
        if (true) ** GOTO lbl22
        block33: while (true) {
            v2 /* !! */  = (long)(v3 - he.emjd("enxy", emjp(int ), (int)325));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1286205096: {
                    v3 = he.emjd("enxz", emjp(int ), (int)326);
                    continue block33;
                }
                case -1173870624: {
                    v3 = he.emjd("enya", emjp(int ), (int)327);
                    continue block33;
                }
                case -195102618: {
                    break block33;
                }
                case 949606313: {
                    v3 = he.emjd("enyb", emjp(int ), (int)328);
                    continue block33;
                }
            }
            break;
        }
        var1_3 = he.a;
        if (var3_1) {
            throw null;
lbl37:
            // 3 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl37
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v4 /* !! */  = he.la;
                if (true) ** GOTO lbl47
                block35: while (true) {
                    v4 /* !! */  = (long)(v5 - he.emjd("enyc", emjp(int ), (int)329));
lbl47:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -195102618: {
                            break block35;
                        }
                        case 696242316: {
                            v5 = he.emjd("enyd", emjp(int ), (int)330);
                            continue block35;
                        }
                        case 2020481950: {
                            v5 = he.emjd("enye", emjp(int ), (int)331);
                            continue block35;
                        }
                    }
                    break;
                }
                this.crystalArea = null;
                if (var1_3 || var1_3) ** GOTO lbl37
                v6 = he.emjd("enyf", emja(int ), (int)505);
                v7 /* !! */  = he.la;
                if (true) ** GOTO lbl63
                block36: while (true) {
                    v7 /* !! */  = (long)(v8 - he.emjd("enyg", emjp(int ), (int)332));
lbl63:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -1477955457: {
                            v8 = he.emjd("enyh", emjp(int ), (int)333);
                            continue block36;
                        }
                        case -1059984915: {
                            v8 = he.emjd("enyi", emjp(int ), (int)334);
                            continue block36;
                        }
                        case -1019414654: {
                            v8 = he.emjd("enyj", emjp(int ), (int)335);
                            continue block36;
                        }
                        case -195102618: {
                            break block36;
                        }
                    }
                    break;
                }
                this.crystalAttackTicks = (int)v6;
                if (var1_3 || var1_3) ** continue;
                return;
            }
            case 0: {
                var2_2 /* !! */  = (int)he.emjd("enyk", emja(int ), (int)506);
                if (var3_1) {
                    throw null;
                }
            }
lbl82:
            // 4 sources

            case 1: {
                var2_2 /* !! */  = (int)he.emjd("enyl", emja(int ), (int)507);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl92
            }
lbl87:
            // 3 sources

            case 2: {
                var2_2 /* !! */  = (int)he.emjd("enym", emja(int ), (int)508);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl106
            }
lbl92:
            // 2 sources

            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)he.emjd("enyn", emja(int ), (int)509);
                    if (!var3_1) ** GOTO lbl87
                    throw null;
                }
            }
            case 4: {
                var2_2 /* !! */  = (int)he.emjd("enyo", emja(int ), (int)510);
                if (!var3_1) ** GOTO lbl82
                throw null;
            }
            case 5: {
                do {
                    var2_2 /* !! */  = (int)he.emjd("enyp", emja(int ), (int)511);
                } while (!var3_1);
                throw null;
            }
lbl106:
            // 2 sources

            case 6: {
                var2_2 /* !! */  = (int)he.emjd("enyq", emja(int ), (int)512);
                if (!var3_1) ** GOTO lbl87
                throw null;
            }
            case 7: 
        }
        var2_2 /* !! */  = (int)he.emjd("enyr", emja(int ), (int)513);
        ** while (!var3_1)
lbl113:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void eofc() {
        he.emjq[100] = -6876456138088106810L;
        he.emjq[101] = 3855171883699257557L;
        he.emjq[102] = 1756040998578258035L;
        he.emjq[103] = -4474958495154281341L;
        he.emjq[104] = 7171053014479402049L;
        he.emjq[105] = 3562463843390278267L;
        he.emjq[106] = -868960108559430473L;
        he.emjq[107] = 3027510803576176401L;
        he.emjq[108] = 779663241370980487L;
        he.emjq[109] = 3162293851477786725L;
        he.emjq[110] = -428178936635004900L;
        he.emjq[111] = 29863277915281960L;
        he.emjq[112] = 8189407007223963546L;
        he.emjq[113] = -6348264992276690262L;
        he.emjq[114] = 8990209383365413281L;
        he.emjq[115] = 5818977853350730052L;
        he.emjq[116] = -6354018353393387553L;
        he.emjq[117] = 6975263990152851552L;
        he.emjq[118] = -156657197951731486L;
        he.emjq[119] = -5404840282554211382L;
        he.emjq[120] = 4973925334370730194L;
        he.emjq[121] = 1283361851718596634L;
        he.emjq[122] = -5921068447912294880L;
        he.emjq[123] = -2891032930793908450L;
        he.emjq[124] = 1026274473261010512L;
        he.emjq[125] = 2442125959283287950L;
        he.emjq[126] = 5600230903045084137L;
        he.emjq[127] = -5207188127179047259L;
        he.emjq[128] = -6753821293414496701L;
        he.emjq[129] = -8895089737467847925L;
        he.emjq[130] = -7698410817292657383L;
        he.emjq[131] = -8667424713614811920L;
        he.emjq[132] = -2605568149660817543L;
        he.emjq[133] = -2245908390546469412L;
        he.emjq[134] = 5600526451016496631L;
        he.emjq[135] = 1233087027845008375L;
        he.emjq[136] = 2755645688331024180L;
        he.emjq[137] = 8055724070955806088L;
        he.emjq[138] = -3858667600952208610L;
        he.emjq[139] = -3038128168767963304L;
        he.emjq[140] = 7839944038472168425L;
        he.emjq[141] = -4018881598194138699L;
        he.emjq[142] = 54548948843356875L;
        he.emjq[143] = -6909900014674343128L;
        he.emjq[144] = -1087958993621732183L;
        he.emjq[145] = -5599025628131749790L;
        he.emjq[146] = 6510121893581763294L;
        he.emjq[147] = 6363569658673128787L;
        he.emjq[148] = 7923369118660016364L;
        he.emjq[149] = 5542143286349553218L;
        he.emjq[150] = -7059355480809153600L;
        he.emjq[151] = 2157513062682817419L;
        he.emjq[152] = 6514922197141717992L;
        he.emjq[153] = -1592157041411539208L;
        he.emjq[154] = -1966690502657950418L;
        he.emjq[155] = -4796367646562872876L;
        he.emjq[156] = -1015086828637472671L;
        he.emjq[157] = 6657866585434648853L;
        he.emjq[158] = -2609885949530274279L;
        he.emjq[159] = -1392295815411166559L;
        he.emjq[160] = -2008581709721477410L;
        he.emjq[161] = 5036755807232262624L;
        he.emjq[162] = 6024201965988049737L;
        he.emjq[163] = 7943834300625615157L;
        he.emjq[164] = 5042758820061828392L;
        he.emjq[165] = -1665359731783503830L;
        he.emjq[166] = -5096592168070718693L;
        he.emjq[167] = -2918949904763171826L;
        he.emjq[168] = -3169888536103449254L;
        he.emjq[169] = -5407374490814827257L;
        he.emjq[170] = -989355675905821119L;
        he.emjq[171] = -4171451433963363105L;
        he.emjq[172] = -2553912117453105660L;
        he.emjq[173] = -1583164123805908702L;
        he.emjq[174] = 2849683077908961079L;
        he.emjq[175] = 2707968495518046411L;
        he.emjq[176] = 8620839792322554489L;
        he.emjq[177] = 1994030182443563776L;
        he.emjq[178] = 2122601843804369984L;
        he.emjq[179] = 1121371099844706262L;
        he.emjq[180] = -8101615616596102140L;
        he.emjq[181] = -7233888827506751167L;
        he.emjq[182] = -4201661659208804300L;
        he.emjq[183] = -3697838133782801780L;
        he.emjq[184] = 5184261015705250085L;
        he.emjq[185] = -4178464261164829761L;
        he.emjq[186] = 3220414812753740733L;
        he.emjq[187] = -1813788560933870347L;
        he.emjq[188] = 3657205319388189773L;
        he.emjq[189] = 911772944567687276L;
        he.emjq[190] = 8156040723210686194L;
        he.emjq[191] = -273215053793700915L;
        he.emjq[192] = -667963258213086971L;
        he.emjq[193] = 2935433110648903246L;
        he.emjq[194] = -1497576088881754113L;
        he.emjq[195] = 118611139138488220L;
        he.emjq[196] = -6713479390305541163L;
        he.emjq[197] = -3479394544464327594L;
        he.emjq[198] = 344416822266339536L;
        he.emjq[199] = 5562365693038485280L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void processScheduledPlacement() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = he.la - he.emjd("enbc", emjp(int ), (int)85)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == he.emjd("enbf", emja(int ), (int)263)) break;
            v0 /* !! */  = (long)he.emjd("enbg", emja(int ), (int)264);
        }
        var3_1 = he.c;
        v1 /* !! */  = he.la;
        if (true) ** GOTO lbl11
        block54: while (true) {
            v1 /* !! */  = (long)(he.emjd("enbi", emjp(int ), (int)87) - he.emjd("enbh", emjp(int ), (int)86));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -577966796: {
                    continue block54;
                }
                case -195102618: {
                    break block54;
                }
            }
            break;
        }
        var2_2 /* !! */  = he.b;
        v2 /* !! */  = he.la;
        if (true) ** GOTO lbl21
        block55: while (true) {
            v2 /* !! */  = (long)(v3 - he.emjd("enbk", emjp(int ), (int)88));
lbl21:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -195102618: {
                    break block55;
                }
                case 257516834: {
                    v3 = he.emjd("enbl", emjp(int ), (int)89);
                    continue block55;
                }
                case 495652000: {
                    v3 = he.emjd("enbm", emjp(int ), (int)90);
                    continue block55;
                }
                case 586127988: {
                    v3 = he.emjd("enbs", emjp(int ), (int)91);
                    continue block55;
                }
            }
            break;
        }
        var1_3 = he.a;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_1) {
                    throw null;
lbl39:
                    // 10 sources

                    return;
                }
                if (var1_3 || var1_3) ** GOTO lbl39
                v4 /* !! */  = he.la;
                if (true) ** GOTO lbl46
                block57: while (true) {
                    v4 /* !! */  = (long)(he.emjd("enbu", emjp(int ), (int)93) - he.emjd("enbt", emjp(int ), (int)92));
lbl46:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -195102618: {
                            break block57;
                        }
                        case 929179130: {
                            continue block57;
                        }
                    }
                    break;
                }
                if (this.targetPos != null) ** GOTO lbl54
                if (var1_3 || var1_3) ** GOTO lbl39
                return;
lbl54:
                // 1 sources

                if (var1_3 || var1_3) ** GOTO lbl39
                v5 /* !! */  = he.la;
                if (true) ** GOTO lbl59
                block58: while (true) {
                    v5 /* !! */  = (long)(he.emjd("enbw", emjp(int ), (int)95) - he.emjd("enbv", emjp(int ), (int)94));
lbl59:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -195102618: {
                            break block58;
                        }
                        case 1580959669: {
                            continue block58;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_1 = he.la - he.emjd("encd", emjp(int ), (int)96)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == he.emjd("ence", emja(int ), (int)265)) break;
                    v6 /* !! */  = (long)he.emjd("encf", emja(int ), (int)266);
                }
                if (this.canPlace(this.targetPos)) ** GOTO lbl87
                if (var1_3 || var1_3) ** GOTO lbl39
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_2 = he.la - he.emjd("encg", emjp(int ), (int)97)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == he.emjd("ench", emja(int ), (int)267)) break;
                    v7 /* !! */  = (long)he.emjd("enci", emja(int ), (int)268);
                }
                this.targetPos = null;
                if (var1_3 || var1_3) ** GOTO lbl39
                v8 = he.emjd("encj", emjp(int ), (int)98);
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_3 = he.la - he.emjd("encn", emjp(int ), (int)99)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == he.emjd("enco", emja(int ), (int)269)) break;
                    v9 /* !! */  = (long)he.emjd("encp", emja(int ), (int)270);
                }
                this.placeAt = (long)v8;
                if (var1_3 || var1_3) ** GOTO lbl39
                return;
lbl87:
                // 1 sources

                if (var1_3 || var1_3) ** GOTO lbl39
                v10 /* !! */  = he.la;
                if (true) ** GOTO lbl92
                block62: while (true) {
                    v10 /* !! */  = (long)(v11 - he.emjd("encr", emjp(int ), (int)100));
lbl92:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -365465581: {
                            v11 = he.emjd("encs", emjp(int ), (int)101);
                            continue block62;
                        }
                        case -195102618: {
                            break block62;
                        }
                        case 1349886763: {
                            v11 = he.emjd("enct", emjp(int ), (int)102);
                            continue block62;
                        }
                    }
                    break;
                }
                v12 = System.currentTimeMillis();
                v13 /* !! */  = he.la;
                if (true) ** GOTO lbl106
                block63: while (true) {
                    v13 /* !! */  = (long)(v14 - he.emjd("encv", emjp(int ), (int)103));
lbl106:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case -1851053128: {
                            v14 = he.emjd("ency", emjp(int ), (int)104);
                            continue block63;
                        }
                        case -1557977456: {
                            v14 = he.emjd("enda", emjp(int ), (int)105);
                            continue block63;
                        }
                        case -195102618: {
                            break block63;
                        }
                        case -159022630: {
                            v14 = he.emjd("endb", emjp(int ), (int)106);
                            continue block63;
                        }
                    }
                    break;
                }
                if (v12 < this.placeAt) ** GOTO lbl127
                if (var1_3 || var1_3) ** GOTO lbl39
                while (true) {
                    if ((v15 /* !! */  = (cfr_temp_4 = he.la - he.emjd("ende", emjp(int ), (int)107)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v15 /* !! */  == he.emjd("endf", emja(int ), (int)271)) break;
                    v15 /* !! */  = (long)he.emjd("endh", emja(int ), (int)272);
                }
                this.placeCrystal();
                if (var1_3) ** GOTO lbl39
lbl127:
                // 2 sources

                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
lbl130:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)he.emjd("endj", emja(int ), (int)273);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl203
            }
lbl135:
            // 3 sources

            case 1: {
                var2_2 /* !! */  = (int)he.emjd("endl", emja(int ), (int)274);
                if (!var3_1) ** GOTO lbl130
                throw null;
            }
lbl139:
            // 3 sources

            case 2: {
                var2_2 /* !! */  = (int)he.emjd("endn", emja(int ), (int)275);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl154
            }
lbl144:
            // 2 sources

            case 3: {
                var2_2 /* !! */  = (int)he.emjd("endo", emja(int ), (int)276);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl207
            }
lbl149:
            // 2 sources

            case 4: {
                var2_2 /* !! */  = (int)he.emjd("endq", emja(int ), (int)277);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl207
            }
lbl154:
            // 2 sources

            case 5: {
                var2_2 /* !! */  = (int)he.emjd("ends", emja(int ), (int)278);
                if (var3_1) {
                    throw null;
                }
            }
            case 6: {
                var2_2 /* !! */  = (int)he.emjd("endu", emja(int ), (int)279);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl194
            }
            case 7: {
                var2_2 /* !! */  = (int)he.emjd("endw", emja(int ), (int)280);
                if (var3_1) {
                    throw null;
                }
            }
lbl167:
            // 5 sources

            case 8: {
                var2_2 /* !! */  = (int)he.emjd("endy", emja(int ), (int)281);
                if (!var3_1) ** GOTO lbl139
                throw null;
            }
            case 9: {
                var2_2 /* !! */  = (int)he.emjd("endz", emja(int ), (int)282);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl211
            }
            case 10: {
                var2_2 /* !! */  = (int)he.emjd("enea", emja(int ), (int)283);
                if (!var3_1) ** GOTO lbl135
                throw null;
            }
            case 11: {
                var2_2 /* !! */  = (int)he.emjd("eneb", emja(int ), (int)284);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl219
            }
            case 12: {
                var2_2 /* !! */  = (int)he.emjd("ened", emja(int ), (int)285);
                if (!var3_1) ** GOTO lbl144
                throw null;
            }
            case 13: {
                var2_2 /* !! */  = (int)he.emjd("enee", emja(int ), (int)286);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl198
            }
lbl194:
            // 2 sources

            case 14: {
                var2_2 /* !! */  = (int)he.emjd("enef", emja(int ), (int)287);
                if (!var3_1) ** GOTO lbl149
                throw null;
            }
lbl198:
            // 2 sources

            case 15: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)he.emjd("enek", emja(int ), (int)288);
                    if (!var3_1) ** GOTO lbl167
                    throw null;
                }
            }
lbl203:
            // 2 sources

            case 16: {
                var2_2 /* !! */  = (int)he.emjd("enel", emja(int ), (int)289);
                if (!var3_1) break;
                throw null;
            }
lbl207:
            // 3 sources

            case 17: {
                var2_2 /* !! */  = (int)he.emjd("enem", emja(int ), (int)290);
                if (!var3_1) ** GOTO lbl139
                throw null;
            }
lbl211:
            // 3 sources

            case 18: {
                var2_2 /* !! */  = (int)he.emjd("eneo", emja(int ), (int)291);
                if (!var3_1) ** GOTO lbl135
                throw null;
            }
            case 19: {
                var2_2 /* !! */  = (int)he.emjd("enep", emja(int ), (int)292);
                if (!var3_1) ** GOTO lbl167
                throw null;
            }
lbl219:
            // 2 sources

            case 20: {
                var2_2 /* !! */  = (int)he.emjd("eneq", emja(int ), (int)293);
                if (!var3_1) ** GOTO lbl211
                throw null;
            }
            case 21: 
        }
        var2_2 /* !! */  = (int)he.emjd("ener", emja(int ), (int)294);
        ** while (!var3_1)
lbl226:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void eoen() {
        he.emjb[0] = -1682606188;
        he.emjb[1] = 92224546;
        he.emjb[2] = -500972271;
        he.emjb[3] = -182152080;
        he.emjb[4] = 1182568704;
        he.emjb[5] = -2018404975;
        he.emjb[6] = 404178496;
        he.emjb[7] = -1689402520;
        he.emjb[8] = 1123083689;
        he.emjb[9] = -409214693;
        he.emjb[10] = -2051664424;
        he.emjb[11] = -1203373154;
        he.emjb[12] = 1559710489;
        he.emjb[13] = 1678160022;
        he.emjb[14] = -1329001515;
        he.emjb[15] = -1014058059;
        he.emjb[16] = 569993201;
        he.emjb[17] = 825936460;
        he.emjb[18] = -415610767;
        he.emjb[19] = 676900973;
        he.emjb[20] = -1650987162;
        he.emjb[21] = 24714551;
        he.emjb[22] = -1417350134;
        he.emjb[23] = -1855928965;
        he.emjb[24] = 307236669;
        he.emjb[25] = 1881486568;
        he.emjb[26] = 226509534;
        he.emjb[27] = 1323765210;
        he.emjb[28] = -1648848643;
        he.emjb[29] = -80009682;
        he.emjb[30] = -2032900702;
        he.emjb[31] = 1777173645;
        he.emjb[32] = -2061761527;
        he.emjb[33] = -530818400;
        he.emjb[34] = -1150837974;
        he.emjb[35] = -714663623;
        he.emjb[36] = -831582283;
        he.emjb[37] = 671774495;
        he.emjb[38] = -1048210651;
        he.emjb[39] = 420252206;
        he.emjb[40] = 630679290;
        he.emjb[41] = -1959102871;
        he.emjb[42] = 1293272587;
        he.emjb[43] = 2064884124;
        he.emjb[44] = -478323997;
        he.emjb[45] = -1300746129;
        he.emjb[46] = -535947895;
        he.emjb[47] = 1315485059;
        he.emjb[48] = -2081778766;
        he.emjb[49] = 0xA0C00A;
        he.emjb[50] = -1630755687;
        he.emjb[51] = 1554200111;
        he.emjb[52] = 1447907213;
        he.emjb[53] = -1120379728;
        he.emjb[54] = 1110261905;
        he.emjb[55] = -784531481;
        he.emjb[56] = -1943986015;
        he.emjb[57] = -690512966;
        he.emjb[58] = -2124856933;
        he.emjb[59] = 678135821;
        he.emjb[60] = 57714662;
        he.emjb[61] = -310948794;
        he.emjb[62] = -1277492220;
        he.emjb[63] = -2108213861;
        he.emjb[64] = -1592256704;
        he.emjb[65] = 757162711;
        he.emjb[66] = -1989385709;
        he.emjb[67] = 442399930;
        he.emjb[68] = 984119675;
        he.emjb[69] = -553605018;
        he.emjb[70] = 176803103;
        he.emjb[71] = 1993837992;
        he.emjb[72] = -548927586;
        he.emjb[73] = -1875894499;
        he.emjb[74] = 155840240;
        he.emjb[75] = 966569424;
        he.emjb[76] = 837554246;
        he.emjb[77] = -1907993221;
        he.emjb[78] = 1200878935;
        he.emjb[79] = -1445163429;
        he.emjb[80] = -1307759103;
        he.emjb[81] = 11015206;
        he.emjb[82] = -858985854;
        he.emjb[83] = 224998405;
        he.emjb[84] = 2059328891;
        he.emjb[85] = -2039405343;
        he.emjb[86] = -1011432579;
        he.emjb[87] = 2018854073;
        he.emjb[88] = -1491097654;
        he.emjb[89] = 1652104010;
        he.emjb[90] = 935460203;
        he.emjb[91] = -1235694813;
        he.emjb[92] = 782725869;
        he.emjb[93] = 2095405652;
        he.emjb[94] = -1044578913;
        he.emjb[95] = -2022454265;
        he.emjb[96] = 1882043606;
        he.emjb[97] = -350696474;
        he.emjb[98] = -1529181676;
        he.emjb[99] = 1507212123;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean hasCrystalAt(class_2338 var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = he.la - he.emjd("enun", emjp(int ), (int)285)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == he.emjd("enuo", emja(int ), (int)459)) break;
            v0 /* !! */  = (long)he.emjd("enup", emja(int ), (int)460);
        }
        var4_2 = he.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = he.la - he.emjd("enuq", emjp(int ), (int)286)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == he.emjd("enur", emja(int ), (int)461)) break;
            v1 /* !! */  = (long)he.emjd("enus", emja(int ), (int)462);
        }
        var3_3 /* !! */  = he.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = he.la - he.emjd("enut", emjp(int ), (int)287)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == he.emjd("enuu", emja(int ), (int)463)) break;
            v2 /* !! */  = (long)he.emjd("enuv", emja(int ), (int)464);
        }
        var2_4 = he.a;
        if (var4_2) {
            throw null;
lbl21:
            // 4 sources

            return (boolean)he.emjd("enuw", emja(int ), (int)465);
        }
        if (var2_4) ** GOTO lbl21
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        block0 : switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** GOTO lbl21
                v3 /* !! */  = he.la;
                if (true) ** GOTO lbl32
                block40: while (true) {
                    v3 /* !! */  = (long)(he.emjd("enuy", emjp(int ), (int)289) - he.emjd("enux", emjp(int ), (int)288));
lbl32:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -195102618: {
                            break block40;
                        }
                        case 1823870762: {
                            continue block40;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_3 = he.la - he.emjd("enuz", emjp(int ), (int)290)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == he.emjd("envb", emja(int ), (int)466)) break;
                    v4 /* !! */  = (long)he.emjd("envc", emja(int ), (int)467);
                }
                v5 = he.mc.field_1687;
                v6 /* !! */  = he.la;
                if (true) ** GOTO lbl47
                block42: while (true) {
                    v6 /* !! */  = (long)(he.emjd("enve", emjp(int ), (int)292) - he.emjd("envd", emjp(int ), (int)291));
lbl47:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -195102618: {
                            break block42;
                        }
                        case 1928808846: {
                            continue block42;
                        }
                    }
                    break;
                }
                v7 /* !! */  = he.la;
                if (true) ** GOTO lbl56
                block43: while (true) {
                    v7 /* !! */  = (long)(v8 - he.emjd("envf", emjp(int ), (int)293));
lbl56:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -2018016132: {
                            v8 = he.emjd("envg", emjp(int ), (int)294);
                            continue block43;
                        }
                        case -514940024: {
                            v8 = he.emjd("envh", emjp(int ), (int)295);
                            continue block43;
                        }
                        case -195102618: {
                            break block43;
                        }
                    }
                    break;
                }
                v9 = var1_1.method_10084();
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_4 = he.la - he.emjd("envi", emjp(int ), (int)296)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == he.emjd("envj", emja(int ), (int)468)) break;
                    v10 /* !! */  = (long)he.emjd("envk", emja(int ), (int)469);
                }
                v11 = new class_238(v9);
                v12 = he.emjd("envl", emsz(int ), (int)297);
                while (true) {
                    if ((v13 /* !! */  = (cfr_temp_5 = he.la - he.emjd("envm", emjp(int ), (int)298)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v13 /* !! */  == he.emjd("envn", emja(int ), (int)470)) break;
                    v13 /* !! */  = (long)he.emjd("envo", emja(int ), (int)471);
                }
                v14 = v11.method_1014((double)v12);
                v15 /* !! */  = he.la;
                if (true) ** GOTO lbl83
                block46: while (true) {
                    v15 /* !! */  = (long)(he.emjd("envq", emjp(int ), (int)300) - he.emjd("envp", emjp(int ), (int)299));
lbl83:
                    // 2 sources

                    switch ((int)v15 /* !! */ ) {
                        case -501337358: {
                            continue block46;
                        }
                        case -195102618: {
                            break block46;
                        }
                    }
                    break;
                }
                v16 = (Predicate<class_1297>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$hasCrystalAt$1(net.minecraft.class_1297 ), (Lnet/minecraft/class_1297;)Z)();
                v17 /* !! */  = he.la;
                if (true) ** GOTO lbl93
                block47: while (true) {
                    v17 /* !! */  = (long)(v18 - he.emjd("envr", emjp(int ), (int)301));
lbl93:
                    // 2 sources

                    switch ((int)v17 /* !! */ ) {
                        case -2139013242: {
                            v18 = he.emjd("envs", emjp(int ), (int)302);
                            continue block47;
                        }
                        case -903675984: {
                            v18 = he.emjd("envt", emjp(int ), (int)303);
                            continue block47;
                        }
                        case -195102618: {
                            break block47;
                        }
                    }
                    break;
                }
                v19 = v5.method_8333(null, v14, v16);
                v20 /* !! */  = he.la;
                if (true) ** GOTO lbl107
                block48: while (true) {
                    v20 /* !! */  = (long)(he.emjd("envv", emjp(int ), (int)305) - he.emjd("envu", emjp(int ), (int)304));
lbl107:
                    // 2 sources

                    switch ((int)v20 /* !! */ ) {
                        case -195102618: {
                            break block48;
                        }
                        case -40112912: {
                            continue block48;
                        }
                    }
                    break;
                }
                if (v19.isEmpty()) ** GOTO lbl118
                if (var2_4) ** GOTO lbl21
                v21 = he.emjd("envw", emja(int ), (int)472);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl121
lbl118:
                // 1 sources

                if (!var2_4 && !var2_4) ** break;
                ** continue;
                v21 = he.emjd("envy", emja(int ), (int)473);
lbl121:
                // 2 sources

                return (boolean)v21;
            }
lbl122:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)he.emjd("envz", emja(int ), (int)474);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl149
            }
lbl127:
            // 2 sources

            case 1: {
                var3_3 /* !! */  = (int)he.emjd("enwa", emja(int ), (int)475);
                if (!var4_2) ** GOTO lbl122
                throw null;
            }
lbl131:
            // 3 sources

            case 2: {
                var3_3 /* !! */  = (int)he.emjd("enwb", emja(int ), (int)476);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl145
            }
            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)he.emjd("enwc", emja(int ), (int)477);
                    if (!var4_2) break block0;
                    throw null;
                }
            }
            case 4: {
                var3_3 /* !! */  = (int)he.emjd("enwd", emja(int ), (int)478);
                if (!var4_2) ** GOTO lbl127
                throw null;
            }
lbl145:
            // 2 sources

            case 5: {
                var3_3 /* !! */  = (int)he.emjd("enwe", emja(int ), (int)479);
                if (!var4_2) ** GOTO lbl131
                throw null;
            }
lbl149:
            // 2 sources

            case 6: {
                var3_3 /* !! */  = (int)he.emjd("enwf", emja(int ), (int)480);
                if (!var4_2) ** GOTO lbl131
                throw null;
            }
            case 7: 
        }
        var3_3 /* !! */  = (int)he.emjd("enwg", emja(int ), (int)481);
        ** while (!var4_2)
lbl156:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void eofe() {
        he.emjq[300] = 4466379988041815269L;
        he.emjq[301] = 3281493379800679916L;
        he.emjq[302] = -7934335439173553698L;
        he.emjq[303] = -3197171335238896903L;
        he.emjq[304] = 3339399174374230239L;
        he.emjq[305] = 6321644953133115016L;
        he.emjq[306] = 4050415552572143796L;
        he.emjq[307] = 6858879786183496775L;
        he.emjq[308] = -1045601013062646833L;
        he.emjq[309] = 8902688002492838610L;
        he.emjq[310] = 433370697443755943L;
        he.emjq[311] = 784478815475383941L;
        he.emjq[312] = 1782038122727908025L;
        he.emjq[313] = 255478791910390329L;
        he.emjq[314] = -3347996508484627270L;
        he.emjq[315] = -3560204713499041160L;
        he.emjq[316] = 8673873346609373765L;
        he.emjq[317] = -8022571005867458691L;
        he.emjq[318] = 341442593904971569L;
        he.emjq[319] = -8129731469344816877L;
        he.emjq[320] = 1159755495228890999L;
        he.emjq[321] = -4946494581790547509L;
        he.emjq[322] = -6447415022904466301L;
        he.emjq[323] = 8051672493344677988L;
        he.emjq[324] = 8947209858048639320L;
        he.emjq[325] = -881510943048898581L;
        he.emjq[326] = -1100280392443362598L;
        he.emjq[327] = 8823936235086750945L;
        he.emjq[328] = 2540781092191814860L;
        he.emjq[329] = -3833909697716482195L;
        he.emjq[330] = 912540595420391693L;
        he.emjq[331] = 4293789211962341990L;
        he.emjq[332] = -2972369484370850413L;
        he.emjq[333] = -5471314176862119189L;
        he.emjq[334] = 5630725858975327593L;
        he.emjq[335] = -3567449246097562284L;
        he.emjq[336] = 8181243649356117163L;
        he.emjq[337] = -5854224975014300026L;
        he.emjq[338] = -6978797909884557068L;
        he.emjq[339] = 610056891230237162L;
        he.emjq[340] = 8784387728113666739L;
        he.emjq[341] = 8460968417119036549L;
        he.emjq[342] = 5364197858600015553L;
        he.emjq[343] = 6878001601667229950L;
        he.emjq[344] = -4068158696927768338L;
        he.emjq[345] = -618517294775385883L;
        he.emjq[346] = -2821399000735640938L;
        he.emjq[347] = 4292123450301552562L;
        he.emjq[348] = -1899805286772487215L;
        he.emjq[349] = -1865255336345724067L;
        he.emjq[350] = -3710658664953010450L;
        he.emjq[351] = -3119357169654913011L;
        he.emjq[352] = -797177480028720389L;
        he.emjq[353] = 8214981308184447832L;
        he.emjq[354] = 2473081503378211475L;
        he.emjq[355] = -8760305082534369052L;
        he.emjq[356] = -7565030160721261464L;
        he.emjq[357] = 6062975438901546072L;
        he.emjq[358] = -1176650651754000023L;
        he.emjq[359] = 2494164935504789208L;
        he.emjq[360] = 6470271847284098118L;
        he.emjq[361] = -7686606998499545331L;
        he.emjq[362] = 3316857154631925996L;
        he.emjq[363] = 9053891454639479087L;
    }

    private static /* synthetic */ void eoez() {
        he.emjc[500] = -1916608108;
        he.emjc[501] = -635907552;
        he.emjc[502] = 2113725393;
        he.emjc[503] = 720616486;
        he.emjc[504] = 606490491;
        he.emjc[505] = 423516676;
        he.emjc[506] = -1198456557;
        he.emjc[507] = 1471411279;
        he.emjc[508] = 1756707734;
        he.emjc[509] = 1532752736;
        he.emjc[510] = 78169269;
        he.emjc[511] = 1025491588;
        he.emjc[512] = -843966244;
        he.emjc[513] = 317647250;
        he.emjc[514] = 1629103462;
        he.emjc[515] = 112103608;
        he.emjc[516] = -1823593138;
        he.emjc[517] = -1005092160;
        he.emjc[518] = -1786842975;
        he.emjc[519] = 282786785;
        he.emjc[520] = -1799510043;
        he.emjc[521] = -1044006050;
        he.emjc[522] = -662653344;
        he.emjc[523] = 83307442;
        he.emjc[524] = -1186630253;
        he.emjc[525] = -1604805196;
        he.emjc[526] = 936710246;
        he.emjc[527] = 146820285;
        he.emjc[528] = -1876565362;
        he.emjc[529] = -71881644;
        he.emjc[530] = 2012353288;
        he.emjc[531] = 1533094612;
        he.emjc[532] = 1961388183;
        he.emjc[533] = 1367784427;
        he.emjc[534] = 1069316294;
        he.emjc[535] = -437005811;
        he.emjc[536] = -860094508;
        he.emjc[537] = 1981192475;
        he.emjc[538] = -1761928656;
        he.emjc[539] = -986676796;
        he.emjc[540] = -1433228181;
        he.emjc[541] = -2104374162;
        he.emjc[542] = 1149539536;
        he.emjc[543] = -117533780;
        he.emjc[544] = 501209600;
        he.emjc[545] = 938781063;
        he.emjc[546] = -1419379641;
        he.emjc[547] = -700170202;
        he.emjc[548] = 669150076;
        he.emjc[549] = 2054135194;
        he.emjc[550] = 73464245;
        he.emjc[551] = 2046677973;
        he.emjc[552] = 1394180880;
        he.emjc[553] = -1786515171;
        he.emjc[554] = -568197794;
        he.emjc[555] = 203041393;
        he.emjc[556] = 1424967289;
        he.emjc[557] = 1690202303;
        he.emjc[558] = -2123012471;
        he.emjc[559] = -1440513316;
        he.emjc[560] = -2137709691;
        he.emjc[561] = -1027657319;
        he.emjc[562] = 701285803;
        he.emjc[563] = 1654194290;
        he.emjc[564] = 1203853525;
        he.emjc[565] = -1350769501;
        he.emjc[566] = 1406377157;
        he.emjc[567] = 1666084260;
        he.emjc[568] = -1162492189;
        he.emjc[569] = 447049064;
        he.emjc[570] = -1243266551;
        he.emjc[571] = -731049016;
        he.emjc[572] = 1492405574;
        he.emjc[573] = -1092308995;
        he.emjc[574] = -1356085053;
        he.emjc[575] = 1477033001;
        he.emjc[576] = 2139437109;
        he.emjc[577] = -906638801;
        he.emjc[578] = 608834679;
        he.emjc[579] = -1460588955;
        he.emjc[580] = 217612873;
        he.emjc[581] = 1794255867;
        he.emjc[582] = 1240562245;
        he.emjc[583] = -879902728;
        he.emjc[584] = 647163526;
        he.emjc[585] = -1080736958;
        he.emjc[586] = -656042859;
        he.emjc[587] = -153237229;
        he.emjc[588] = 1638153883;
        he.emjc[589] = -513626436;
        he.emjc[590] = -1980289809;
        he.emjc[591] = 580653746;
        he.emjc[592] = 1880361320;
        he.emjc[593] = 537406509;
        he.emjc[594] = -1649844182;
        he.emjc[595] = -1338469907;
        he.emjc[596] = 336000449;
        he.emjc[597] = 1446229463;
        he.emjc[598] = 415391944;
        he.emjc[599] = 793838733;
    }

    private static /* synthetic */ void eoeo() {
        he.emjb[100] = -1881567718;
        he.emjb[101] = 115669267;
        he.emjb[102] = -1464137758;
        he.emjb[103] = -1954929729;
        he.emjb[104] = 1321865318;
        he.emjb[105] = 468154695;
        he.emjb[106] = -1447404919;
        he.emjb[107] = -1219093692;
        he.emjb[108] = -1419430129;
        he.emjb[109] = 1094315312;
        he.emjb[110] = 276731257;
        he.emjb[111] = -1579461723;
        he.emjb[112] = -1155509571;
        he.emjb[113] = 1967782372;
        he.emjb[114] = 853660766;
        he.emjb[115] = -1881941092;
        he.emjb[116] = 578612356;
        he.emjb[117] = -1793984754;
        he.emjb[118] = -1122768634;
        he.emjb[119] = -1762990545;
        he.emjb[120] = -232692085;
        he.emjb[121] = 1447183133;
        he.emjb[122] = 1081524991;
        he.emjb[123] = 1098000702;
        he.emjb[124] = -1599808081;
        he.emjb[125] = 1081504670;
        he.emjb[126] = -1602050429;
        he.emjb[127] = 2090118255;
        he.emjb[128] = 1008340232;
        he.emjb[129] = 1804653764;
        he.emjb[130] = 1798156543;
        he.emjb[131] = -1705470088;
        he.emjb[132] = -1394787570;
        he.emjb[133] = -334894290;
        he.emjb[134] = -64736929;
        he.emjb[135] = 1826018662;
        he.emjb[136] = 686125735;
        he.emjb[137] = -1465323216;
        he.emjb[138] = 1054199752;
        he.emjb[139] = 1864933827;
        he.emjb[140] = 1947832040;
        he.emjb[141] = 1660253739;
        he.emjb[142] = -986342066;
        he.emjb[143] = 804803648;
        he.emjb[144] = -1288842215;
        he.emjb[145] = 67217995;
        he.emjb[146] = -431394811;
        he.emjb[147] = -224134685;
        he.emjb[148] = -476632130;
        he.emjb[149] = 1966075466;
        he.emjb[150] = -2105068972;
        he.emjb[151] = -1011509346;
        he.emjb[152] = 946680221;
        he.emjb[153] = 395164178;
        he.emjb[154] = -1698362850;
        he.emjb[155] = 626926573;
        he.emjb[156] = -370890268;
        he.emjb[157] = 663286029;
        he.emjb[158] = -2006979793;
        he.emjb[159] = -573401138;
        he.emjb[160] = -885280175;
        he.emjb[161] = 1455494915;
        he.emjb[162] = -1330647087;
        he.emjb[163] = 2019344964;
        he.emjb[164] = 219007711;
        he.emjb[165] = -1517068645;
        he.emjb[166] = 1405998705;
        he.emjb[167] = -318641635;
        he.emjb[168] = 565583393;
        he.emjb[169] = -1481136630;
        he.emjb[170] = 1628655318;
        he.emjb[171] = 793583443;
        he.emjb[172] = -1393873659;
        he.emjb[173] = -29140009;
        he.emjb[174] = -747299787;
        he.emjb[175] = -1551726525;
        he.emjb[176] = -31816394;
        he.emjb[177] = 8989335;
        he.emjb[178] = 2024813978;
        he.emjb[179] = 1656584965;
        he.emjb[180] = -1591153740;
        he.emjb[181] = 1425131696;
        he.emjb[182] = -1923016418;
        he.emjb[183] = -2057417101;
        he.emjb[184] = -1649640172;
        he.emjb[185] = -2120975780;
        he.emjb[186] = 2115900765;
        he.emjb[187] = 53984026;
        he.emjb[188] = -71630918;
        he.emjb[189] = 804323629;
        he.emjb[190] = -626489164;
        he.emjb[191] = -1664073756;
        he.emjb[192] = 314095878;
        he.emjb[193] = 832725298;
        he.emjb[194] = -405123835;
        he.emjb[195] = 1926886267;
        he.emjb[196] = -629459571;
        he.emjb[197] = -489118288;
        he.emjb[198] = 1477766271;
        he.emjb[199] = -824331977;
    }

    private static /* synthetic */ void eoer() {
        he.emjb[400] = -1367859062;
        he.emjb[401] = 1908597389;
        he.emjb[402] = 1272329369;
        he.emjb[403] = 1828229214;
        he.emjb[404] = 227180436;
        he.emjb[405] = 1282005637;
        he.emjb[406] = -834582557;
        he.emjb[407] = -1693839480;
        he.emjb[408] = -1189489664;
        he.emjb[409] = -1519656585;
        he.emjb[410] = 675166929;
        he.emjb[411] = 210775028;
        he.emjb[412] = -78392838;
        he.emjb[413] = 1239780686;
        he.emjb[414] = 1379976664;
        he.emjb[415] = 1123334066;
        he.emjb[416] = -545981665;
        he.emjb[417] = 40473601;
        he.emjb[418] = -1127919477;
        he.emjb[419] = 607966402;
        he.emjb[420] = -872919955;
        he.emjb[421] = 49491894;
        he.emjb[422] = 1344296357;
        he.emjb[423] = -1236420167;
        he.emjb[424] = -1210870467;
        he.emjb[425] = -1666453419;
        he.emjb[426] = 745896864;
        he.emjb[427] = -27211224;
        he.emjb[428] = 1863715509;
        he.emjb[429] = 28463868;
        he.emjb[430] = -30515564;
        he.emjb[431] = -729153622;
        he.emjb[432] = 404984766;
        he.emjb[433] = 1690111772;
        he.emjb[434] = 2031830159;
        he.emjb[435] = -1358431953;
        he.emjb[436] = 798742943;
        he.emjb[437] = -2105908548;
        he.emjb[438] = 175379847;
        he.emjb[439] = 563613124;
        he.emjb[440] = -163614268;
        he.emjb[441] = 960833844;
        he.emjb[442] = 1328508897;
        he.emjb[443] = 1180292940;
        he.emjb[444] = -1473014350;
        he.emjb[445] = -1809904558;
        he.emjb[446] = -69004118;
        he.emjb[447] = 2031763888;
        he.emjb[448] = 1107596984;
        he.emjb[449] = 533134129;
        he.emjb[450] = 1626808659;
        he.emjb[451] = 501105660;
        he.emjb[452] = 757314905;
        he.emjb[453] = 960797735;
        he.emjb[454] = 1035498805;
        he.emjb[455] = 31536348;
        he.emjb[456] = -644847142;
        he.emjb[457] = -1726988098;
        he.emjb[458] = 1910911170;
        he.emjb[459] = -692203178;
        he.emjb[460] = -167985629;
        he.emjb[461] = 1911663490;
        he.emjb[462] = -1893484865;
        he.emjb[463] = -1962552480;
        he.emjb[464] = -1326906826;
        he.emjb[465] = -1380470452;
        he.emjb[466] = 236780692;
        he.emjb[467] = 104938505;
        he.emjb[468] = 913939025;
        he.emjb[469] = -1780066131;
        he.emjb[470] = -440375733;
        he.emjb[471] = 1988778524;
        he.emjb[472] = 545946100;
        he.emjb[473] = -1394304311;
        he.emjb[474] = 1983687400;
        he.emjb[475] = -1765150252;
        he.emjb[476] = 1604759257;
        he.emjb[477] = -1413179123;
        he.emjb[478] = -1889852576;
        he.emjb[479] = -477531099;
        he.emjb[480] = 1940053340;
        he.emjb[481] = 397899302;
        he.emjb[482] = -1087944715;
        he.emjb[483] = -916887132;
        he.emjb[484] = 1227854892;
        he.emjb[485] = -1954763174;
        he.emjb[486] = -857710994;
        he.emjb[487] = -799449955;
        he.emjb[488] = 1221766230;
        he.emjb[489] = 170515324;
        he.emjb[490] = -1205282418;
        he.emjb[491] = -1754231337;
        he.emjb[492] = 1071952246;
        he.emjb[493] = -958495334;
        he.emjb[494] = 498418779;
        he.emjb[495] = 1419534039;
        he.emjb[496] = -406809612;
        he.emjb[497] = -633016042;
        he.emjb[498] = -1180263131;
        he.emjb[499] = 1891593761;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static boolean isProtectedResource(class_1799 var0) {
        var5_1 = he.c;
        var4_2 /* !! */  = he.b;
        var3_3 = he.a;
        if (var5_1) {
            throw null;
lbl6:
            // 31 sources

            return (boolean)he.emjd("eobr", emja(int ), (int)574);
        }
        if (var3_3 || var3_3) ** GOTO lbl6
        if (!var0.method_7960()) ** GOTO lbl15
        if (var4_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_3) ** GOTO lbl6
                return (boolean)he.emjd("eobs", emja(int ), (int)575);
            }
lbl15:
            // 1 sources

            if (var3_3 || var3_3) ** GOTO lbl6
            var2_4 = var0.method_7909();
            if (var3_3) ** GOTO lbl6
            if (!(var2_4 instanceof class_1747)) ** GOTO lbl25
            if (var3_3) ** GOTO lbl6
            var1_5 = (class_1747)var2_4;
            if (var3_3 || var3_3) ** GOTO lbl6
            if (!(var1_5.method_7711() instanceof class_2480)) ** GOTO lbl25
            if (var3_3 || var3_3) ** GOTO lbl6
            return (boolean)he.emjd("eobt", emja(int ), (int)576);
lbl25:
            // 2 sources

            if (var3_3 || var3_3) ** GOTO lbl6
            if (var0.method_31574(class_1802.field_8288)) ** GOTO lbl68
            if (var3_3) ** GOTO lbl6
            if (var0.method_31574(class_1802.field_8367)) ** GOTO lbl68
            if (var3_3) ** GOTO lbl6
            if (var0.method_31574(class_1802.field_22027)) ** GOTO lbl68
            if (var3_3) ** GOTO lbl6
            if (var0.method_31574(class_1802.field_22028)) ** GOTO lbl68
            if (var3_3) ** GOTO lbl6
            if (var0.method_31574(class_1802.field_22029)) ** GOTO lbl68
            if (var3_3) ** GOTO lbl6
            if (var0.method_31574(class_1802.field_22030)) ** GOTO lbl68
            if (var3_3) ** GOTO lbl6
            if (var0.method_31574(class_1802.field_8805)) ** GOTO lbl68
            if (var3_3) ** GOTO lbl6
            if (var0.method_31574(class_1802.field_8058)) ** GOTO lbl68
            if (var3_3) ** GOTO lbl6
            if (var0.method_31574(class_1802.field_8348)) ** GOTO lbl68
            if (var3_3) ** GOTO lbl6
            if (var0.method_31574(class_1802.field_8285)) ** GOTO lbl68
            if (var3_3) ** GOTO lbl6
            if (var0.method_31574(class_1802.field_8137)) ** GOTO lbl68
            if (var3_3) ** GOTO lbl6
            if (var0.method_31574(class_1802.field_8833)) ** GOTO lbl68
            if (var3_3) ** GOTO lbl6
            if (var0.method_31574(class_1802.field_22020)) ** GOTO lbl68
            if (var3_3) ** GOTO lbl6
            if (var0.method_31574(class_1802.field_22021)) ** GOTO lbl68
            if (var3_3) ** GOTO lbl6
            if (var0.method_31574(class_1802.field_22019)) ** GOTO lbl68
            if (var3_3) ** GOTO lbl6
            if (var0.method_31574(class_1802.field_8575)) ** GOTO lbl68
            if (var3_3) ** GOTO lbl6
            if (var0.method_31574(class_1802.field_22022)) ** GOTO lbl68
            if (var3_3) ** GOTO lbl6
            if (var0.method_31574(class_1802.field_22024)) ** GOTO lbl68
            if (var3_3) ** GOTO lbl6
            if (var0.method_31574(class_1802.field_22025)) ** GOTO lbl68
            if (var3_3) ** GOTO lbl6
            if (var0.method_31574(class_1802.field_22023)) ** GOTO lbl68
            if (var3_3) ** GOTO lbl6
            if (!var0.method_31574(class_1802.field_22026)) ** GOTO lbl73
            if (var3_3) ** GOTO lbl6
lbl68:
            // 21 sources

            if (var3_3 || var3_3) ** GOTO lbl6
            v0 = he.emjd("eobu", emja(int ), (int)577);
            if (var5_1) {
                throw null;
            }
            ** GOTO lbl76
lbl73:
            // 1 sources

            if (!var3_3 && !var3_3) ** break;
            ** continue;
            v0 = he.emjd("eobv", emja(int ), (int)578);
lbl76:
            // 2 sources

            return (boolean)v0;
lbl77:
            // 2 sources

            case 0: {
                var4_2 /* !! */  = (int)he.emjd("eobw", emja(int ), (int)579);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl241
            }
lbl82:
            // 2 sources

            case 1: {
                var4_2 /* !! */  = (int)he.emjd("eobx", emja(int ), (int)580);
                if (!var5_1) break;
                throw null;
            }
            case 2: {
                var4_2 /* !! */  = (int)he.emjd("eoby", emja(int ), (int)581);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl134
            }
lbl91:
            // 2 sources

            case 3: {
                var4_2 /* !! */  = (int)he.emjd("eobz", emja(int ), (int)582);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl152
            }
            case 4: {
                var4_2 /* !! */  = (int)he.emjd("eoca", emja(int ), (int)583);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl115
            }
            case 5: {
                var4_2 /* !! */  = (int)he.emjd("eocb", emja(int ), (int)584);
                if (!var5_1) ** GOTO lbl91
                throw null;
            }
lbl105:
            // 2 sources

            case 6: {
                var4_2 /* !! */  = (int)he.emjd("eocc", emja(int ), (int)585);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl253
            }
lbl110:
            // 2 sources

            case 7: {
                var4_2 /* !! */  = (int)he.emjd("eocd", emja(int ), (int)586);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl221
            }
lbl115:
            // 3 sources

            case 8: {
                var4_2 /* !! */  = (int)he.emjd("eoce", emja(int ), (int)587);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl172
            }
lbl120:
            // 3 sources

            case 9: {
                var4_2 /* !! */  = (int)he.emjd("eocf", emja(int ), (int)588);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl130
            }
lbl125:
            // 2 sources

            case 10: {
                var4_2 /* !! */  = (int)he.emjd("eocg", emja(int ), (int)589);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl139
            }
lbl130:
            // 2 sources

            case 11: {
                var4_2 /* !! */  = (int)he.emjd("eoch", emja(int ), (int)590);
                if (!var5_1) break;
                throw null;
            }
lbl134:
            // 4 sources

            case 12: {
                var4_2 /* !! */  = (int)he.emjd("eoci", emja(int ), (int)591);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl233
            }
lbl139:
            // 3 sources

            case 13: {
                var4_2 /* !! */  = (int)he.emjd("eocj", emja(int ), (int)592);
                if (!var5_1) ** GOTO lbl105
                throw null;
            }
            case 14: {
                var4_2 /* !! */  = (int)he.emjd("eock", emja(int ), (int)593);
                if (!var5_1) ** GOTO lbl77
                throw null;
            }
lbl147:
            // 2 sources

            case 15: {
                var4_2 /* !! */  = (int)he.emjd("eocl", emja(int ), (int)594);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl225
            }
lbl152:
            // 2 sources

            case 16: {
                var4_2 /* !! */  = (int)he.emjd("eocm", emja(int ), (int)595);
                if (!var5_1) ** GOTO lbl115
                throw null;
            }
lbl156:
            // 4 sources

            case 17: {
                var4_2 /* !! */  = (int)he.emjd("eocn", emja(int ), (int)596);
                if (!var5_1) ** GOTO lbl134
                throw null;
            }
            case 18: {
                var4_2 /* !! */  = (int)he.emjd("eoco", emja(int ), (int)597);
                if (!var5_1) ** GOTO lbl147
                throw null;
            }
lbl164:
            // 2 sources

            case 19: {
                var4_2 /* !! */  = (int)he.emjd("eocp", emja(int ), (int)598);
                if (!var5_1) ** GOTO lbl156
                throw null;
            }
lbl168:
            // 2 sources

            case 20: {
                var4_2 /* !! */  = (int)he.emjd("eocq", emja(int ), (int)599);
                if (!var5_1) ** GOTO lbl82
                throw null;
            }
lbl172:
            // 2 sources

            case 21: {
                var4_2 /* !! */  = (int)he.emjd("eocr", emja(int ), (int)600);
                if (!var5_1) ** GOTO lbl164
                throw null;
            }
            case 22: {
                var4_2 /* !! */  = (int)he.emjd("eocs", emja(int ), (int)601);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl208
            }
            case 23: {
                var4_2 /* !! */  = (int)he.emjd("eoct", emja(int ), (int)602);
                if (!var5_1) ** GOTO lbl120
                throw null;
            }
            case 24: {
                var4_2 /* !! */  = (int)he.emjd("eocu", emja(int ), (int)603);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl249
            }
lbl190:
            // 3 sources

            case 25: {
                var4_2 /* !! */  = (int)he.emjd("eocv", emja(int ), (int)604);
                if (!var5_1) ** GOTO lbl120
                throw null;
            }
            case 26: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_2 /* !! */  = (int)he.emjd("eocw", emja(int ), (int)605);
                    if (!var5_1) ** GOTO lbl125
                    throw null;
                }
            }
lbl199:
            // 2 sources

            case 27: {
                var4_2 /* !! */  = (int)he.emjd("eocx", emja(int ), (int)606);
                if (!var5_1) ** GOTO lbl139
                throw null;
            }
lbl203:
            // 2 sources

            case 28: {
                var4_2 /* !! */  = (int)he.emjd("eocy", emja(int ), (int)607);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl249
            }
lbl208:
            // 2 sources

            case 29: {
                var4_2 /* !! */  = (int)he.emjd("eocz", emja(int ), (int)608);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl225
            }
            case 30: {
                var4_2 /* !! */  = (int)he.emjd("eoda", emja(int ), (int)609);
                if (!var5_1) ** GOTO lbl156
                throw null;
            }
            case 31: {
                var4_2 /* !! */  = (int)he.emjd("eodb", emja(int ), (int)610);
                if (!var5_1) ** GOTO lbl199
                throw null;
            }
lbl221:
            // 2 sources

            case 32: {
                var4_2 /* !! */  = (int)he.emjd("eodc", emja(int ), (int)611);
                if (!var5_1) ** GOTO lbl203
                throw null;
            }
lbl225:
            // 3 sources

            case 33: {
                var4_2 /* !! */  = (int)he.emjd("eodd", emja(int ), (int)612);
                if (!var5_1) break;
                throw null;
            }
            case 34: {
                var4_2 /* !! */  = (int)he.emjd("eode", emja(int ), (int)613);
                if (!var5_1) ** GOTO lbl134
                throw null;
            }
lbl233:
            // 2 sources

            case 35: {
                var4_2 /* !! */  = (int)he.emjd("eodf", emja(int ), (int)614);
                if (!var5_1) ** GOTO lbl190
                throw null;
            }
            case 36: {
                var4_2 /* !! */  = (int)he.emjd("eodg", emja(int ), (int)615);
                if (!var5_1) ** GOTO lbl110
                throw null;
            }
lbl241:
            // 2 sources

            case 37: {
                var4_2 /* !! */  = (int)he.emjd("eodh", emja(int ), (int)616);
                if (!var5_1) ** GOTO lbl156
                throw null;
            }
            case 38: {
                var4_2 /* !! */  = (int)he.emjd("eodi", emja(int ), (int)617);
                if (!var5_1) ** GOTO lbl190
                throw null;
            }
lbl249:
            // 3 sources

            case 39: {
                var4_2 /* !! */  = (int)he.emjd("eodj", emja(int ), (int)618);
                if (var5_1) {
                    throw null;
                }
            }
lbl253:
            // 4 sources

            case 40: {
                var4_2 /* !! */  = (int)he.emjd("eodk", emja(int ), (int)619);
                if (!var5_1) ** GOTO lbl168
                throw null;
            }
            case 41: 
        }
        var4_2 /* !! */  = (int)he.emjd("eodl", emja(int ), (int)620);
        ** while (!var5_1)
lbl260:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void eoew() {
        he.emjc[200] = -1703400137;
        he.emjc[201] = -1145541843;
        he.emjc[202] = -939482721;
        he.emjc[203] = -27149900;
        he.emjc[204] = -743853720;
        he.emjc[205] = 17225327;
        he.emjc[206] = -1134318816;
        he.emjc[207] = 2021917001;
        he.emjc[208] = 680379459;
        he.emjc[209] = -1158200042;
        he.emjc[210] = -1017204846;
        he.emjc[211] = 282041109;
        he.emjc[212] = 1415953838;
        he.emjc[213] = 544297491;
        he.emjc[214] = -1394394022;
        he.emjc[215] = 446167438;
        he.emjc[216] = 104604433;
        he.emjc[217] = 461045324;
        he.emjc[218] = -939155507;
        he.emjc[219] = 1033631039;
        he.emjc[220] = -478292677;
        he.emjc[221] = 165417648;
        he.emjc[222] = 1964745646;
        he.emjc[223] = -1302475008;
        he.emjc[224] = 1801304199;
        he.emjc[225] = 1355616139;
        he.emjc[226] = -1414665227;
        he.emjc[227] = 2042405223;
        he.emjc[228] = -1375192262;
        he.emjc[229] = 1154825499;
        he.emjc[230] = -681968174;
        he.emjc[231] = -1798283459;
        he.emjc[232] = 1769020669;
        he.emjc[233] = -1168932171;
        he.emjc[234] = 1611537770;
        he.emjc[235] = -1912930668;
        he.emjc[236] = 1229010287;
        he.emjc[237] = 1979909675;
        he.emjc[238] = -762258;
        he.emjc[239] = -1724312814;
        he.emjc[240] = 204248099;
        he.emjc[241] = 50999148;
        he.emjc[242] = -413856088;
        he.emjc[243] = 921025566;
        he.emjc[244] = 210363011;
        he.emjc[245] = -962730467;
        he.emjc[246] = 394344627;
        he.emjc[247] = 1364319082;
        he.emjc[248] = -579355013;
        he.emjc[249] = 1437379832;
        he.emjc[250] = -868579697;
        he.emjc[251] = -1911391822;
        he.emjc[252] = 912015841;
        he.emjc[253] = -1476306004;
        he.emjc[254] = 83714088;
        he.emjc[255] = 992110709;
        he.emjc[256] = 1816316050;
        he.emjc[257] = -1791864595;
        he.emjc[258] = 1857721675;
        he.emjc[259] = 1316289031;
        he.emjc[260] = -1898176330;
        he.emjc[261] = -809298076;
        he.emjc[262] = 877515150;
        he.emjc[263] = -729356826;
        he.emjc[264] = -1299387792;
        he.emjc[265] = 1138336386;
        he.emjc[266] = 1596578001;
        he.emjc[267] = -1011962112;
        he.emjc[268] = -445907495;
        he.emjc[269] = -787242517;
        he.emjc[270] = -655484037;
        he.emjc[271] = -1545192203;
        he.emjc[272] = -1193102348;
        he.emjc[273] = -244507252;
        he.emjc[274] = -344704799;
        he.emjc[275] = 1076867478;
        he.emjc[276] = 999986121;
        he.emjc[277] = 606418461;
        he.emjc[278] = -231601461;
        he.emjc[279] = -1244247001;
        he.emjc[280] = 1332411679;
        he.emjc[281] = 1853419829;
        he.emjc[282] = -1727227107;
        he.emjc[283] = -1333113391;
        he.emjc[284] = 972989239;
        he.emjc[285] = 104998082;
        he.emjc[286] = 210079688;
        he.emjc[287] = 359613596;
        he.emjc[288] = 91719653;
        he.emjc[289] = -10623292;
        he.emjc[290] = 829904279;
        he.emjc[291] = 553038372;
        he.emjc[292] = 1849536042;
        he.emjc[293] = 677246239;
        he.emjc[294] = -1890136721;
        he.emjc[295] = 2126257730;
        he.emjc[296] = -845990583;
        he.emjc[297] = -1437933567;
        he.emjc[298] = -485812518;
        he.emjc[299] = -489076521;
    }

    private static /* synthetic */ void eoeu() {
        he.emjc[0] = -1682606187;
        he.emjc[1] = -92224547;
        he.emjc[2] = 500972270;
        he.emjc[3] = -182152074;
        he.emjc[4] = 1182568709;
        he.emjc[5] = -2018404976;
        he.emjc[6] = 404178502;
        he.emjc[7] = -1689402517;
        he.emjc[8] = 1123083691;
        he.emjc[9] = -409214696;
        he.emjc[10] = -2051664421;
        he.emjc[11] = 1203373153;
        he.emjc[12] = 134191257;
        he.emjc[13] = -1678160023;
        he.emjc[14] = -2145347864;
        he.emjc[15] = 1014058058;
        he.emjc[16] = 1437511814;
        he.emjc[17] = -825936461;
        he.emjc[18] = 415610766;
        he.emjc[19] = 2027480972;
        he.emjc[20] = 1650987161;
        he.emjc[21] = -24714552;
        he.emjc[22] = -767114514;
        he.emjc[23] = -1855928965;
        he.emjc[24] = 307236669;
        he.emjc[25] = 1881486568;
        he.emjc[26] = 226509534;
        he.emjc[27] = -1323765211;
        he.emjc[28] = -931773954;
        he.emjc[29] = -80009687;
        he.emjc[30] = -2032900692;
        he.emjc[31] = 1777173658;
        he.emjc[32] = -2061761525;
        he.emjc[33] = -530818387;
        he.emjc[34] = -1150837981;
        he.emjc[35] = -714663625;
        he.emjc[36] = -831582299;
        he.emjc[37] = 671774477;
        he.emjc[38] = -1048210645;
        he.emjc[39] = 420252206;
        he.emjc[40] = 630679272;
        he.emjc[41] = -1959102872;
        he.emjc[42] = 1293272579;
        he.emjc[43] = 2064884108;
        he.emjc[44] = -478323983;
        he.emjc[45] = -1300746117;
        he.emjc[46] = -535947898;
        he.emjc[47] = 1315485066;
        he.emjc[48] = -2081778784;
        he.emjc[49] = 10534930;
        he.emjc[50] = -1630755700;
        he.emjc[51] = 1554200099;
        he.emjc[52] = 1447907230;
        he.emjc[53] = -1120379718;
        he.emjc[54] = 1110261904;
        he.emjc[55] = -784531482;
        he.emjc[56] = -1943986015;
        he.emjc[57] = -690512965;
        he.emjc[58] = -2124856941;
        he.emjc[59] = 678135821;
        he.emjc[60] = 57714670;
        he.emjc[61] = -310948796;
        he.emjc[62] = -1277492161;
        he.emjc[63] = -2108213811;
        he.emjc[64] = -1592256737;
        he.emjc[65] = 757162728;
        he.emjc[66] = -1989385650;
        he.emjc[67] = 442399983;
        he.emjc[68] = 984119590;
        he.emjc[69] = -553605047;
        he.emjc[70] = 176803116;
        he.emjc[71] = 1993837983;
        he.emjc[72] = -548927599;
        he.emjc[73] = -1875894510;
        he.emjc[74] = 155840219;
        he.emjc[75] = 966569347;
        he.emjc[76] = 837554191;
        he.emjc[77] = -1907993302;
        he.emjc[78] = 1200878870;
        he.emjc[79] = -1445163505;
        he.emjc[80] = -1307759054;
        he.emjc[81] = 11015205;
        he.emjc[82] = -858985799;
        he.emjc[83] = 224998423;
        he.emjc[84] = 2059328886;
        he.emjc[85] = -2039405314;
        he.emjc[86] = -1011432609;
        he.emjc[87] = 2018854053;
        he.emjc[88] = -1491097727;
        he.emjc[89] = 1652103939;
        he.emjc[90] = 935460172;
        he.emjc[91] = -1235694836;
        he.emjc[92] = 782725804;
        he.emjc[93] = 2095405584;
        he.emjc[94] = -1044578931;
        he.emjc[95] = -2022454212;
        he.emjc[96] = 1882043585;
        he.emjc[97] = -350696449;
        he.emjc[98] = -1529181603;
        he.emjc[99] = 1507212120;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private void scheduleCrystal(class_2338 class_23382) {
        int n2;
        boolean bl2;
        block66: {
            block65: {
                Object object = la;
                block35: while (true) {
                    switch ((int)object) {
                        case -195102618: {
                            break block35;
                        }
                        case 467287044: {
                            object = he.emjd("emxc", emjp(int ), (int)59) - he.emjd("emwy", emjp(int ), (int)58);
                            continue block35;
                        }
                    }
                    break;
                }
                boolean bl3 = c;
                while (true) {
                    long l2;
                    Object object2;
                    if ((object2 = (l2 = la - he.emjd("emxe", emjp(int ), (int)60)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
                    if (object2 == he.emjd("emxf", emja(int ), (int)231)) break;
                    object2 = he.emjd("emxg", emja(int ), (int)232);
                }
                int n3 = b;
                while (true) {
                    long l3;
                    Object object3;
                    if ((object3 = (l3 = la - he.emjd("emxi", emjp(int ), (int)61)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
                    if (object3 == he.emjd("emxj", emja(int ), (int)233)) {
                        bl2 = a;
                        if (bl3) {
                            throw null;
                        }
                        break;
                    }
                    object3 = he.emjd("emxk", emja(int ), (int)234);
                }
                if (bl2 || bl2) return;
                while (true) {
                    long l4;
                    Object object4;
                    if ((object4 = (l4 = la - he.emjd("emxm", emjp(int ), (int)62)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
                    if (object4 == he.emjd("emxn", emja(int ), (int)235)) break;
                    object4 = he.emjd("emxp", emja(int ), (int)236);
                }
                Object object5 = la;
                block39: while (true) {
                    switch ((int)object5) {
                        case -1126255761: {
                            object5 = he.emjd("emxr", emjp(int ), (int)64) - he.emjd("emxq", emjp(int ), (int)63);
                            continue block39;
                        }
                        case -195102618: {
                            break block39;
                        }
                    }
                    break;
                }
                n2 = nv.findItemInHotbar(class_1802.field_8301);
                if (bl2 || bl2) return;
                if (n2 == he.emjd("emxs", emja(int ), (int)237)) break block65;
                if (bl2) return;
                Object object6 = la;
                boolean bl4 = true;
                block40: while (true) {
                    CallSite callSite;
                    if (!bl4 || (bl4 = false) || !true) {
                        object6 = callSite - he.emjd("emxt", emjp(int ), (int)65);
                    }
                    switch ((int)object6) {
                        case -933985603: {
                            callSite = he.emjd("emxu", emjp(int ), (int)66);
                            continue block40;
                        }
                        case -548174261: {
                            callSite = he.emjd("emxv", emjp(int ), (int)67);
                            continue block40;
                        }
                        case -195102618: {
                            break block40;
                        }
                    }
                    break;
                }
                if (!this.isProtected(class_23382)) break block66;
                if (bl2) return;
            }
            if (bl2 || bl2) return;
            return;
        }
        if (bl2 || bl2) return;
        Object object = la;
        boolean bl5 = true;
        block41: while (true) {
            CallSite callSite;
            if (!bl5 || (bl5 = false) || !true) {
                object = callSite - he.emjd("emxx", emjp(int ), (int)68);
            }
            switch ((int)object) {
                case -1720962392: {
                    callSite = he.emjd("emxy", emjp(int ), (int)69);
                    continue block41;
                }
                case -195102618: {
                    break block41;
                }
                case 23668247: {
                    callSite = he.emjd("emxz", emjp(int ), (int)70);
                    continue block41;
                }
                case 1329184319: {
                    callSite = he.emjd("emya", emjp(int ), (int)71);
                    continue block41;
                }
            }
            break;
        }
        class_2338 class_23383 = class_23382.method_10062();
        Object object7 = la;
        boolean bl6 = true;
        block42: while (true) {
            CallSite callSite;
            if (!bl6 || (bl6 = false) || !true) {
                object7 = callSite - he.emjd("emyb", emjp(int ), (int)72);
            }
            switch ((int)object7) {
                case -1518867249: {
                    callSite = he.emjd("emyh", emjp(int ), (int)73);
                    continue block42;
                }
                case -916417330: {
                    callSite = he.emjd("emyj", emjp(int ), (int)74);
                    continue block42;
                }
                case -195102618: {
                    break block42;
                }
                case 1116979937: {
                    callSite = he.emjd("emyk", emjp(int ), (int)75);
                    continue block42;
                }
            }
            break;
        }
        this.targetPos = class_23383;
        if (bl2 || bl2) return;
        while (true) {
            long l5;
            Object object8;
            if ((object8 = (l5 = la - he.emjd("emyl", emjp(int ), (int)76)) == 0L ? 0 : (l5 < 0L ? -1 : 1)) == false) continue;
            if (object8 == he.emjd("emym", emja(int ), (int)238)) {
                this.targetSlot = n2;
                if (bl2) return;
                break;
            }
            object8 = he.emjd("emyn", emja(int ), (int)239);
        }
        if (bl2) return;
        Object object9 = la;
        block44: while (true) {
            switch ((int)object9) {
                case -374238736: {
                    object9 = he.emjd("emyw", emjp(int ), (int)78) - he.emjd("emyo", emjp(int ), (int)77);
                    continue block44;
                }
                case -195102618: {
                    break block44;
                }
            }
            break;
        }
        long l6 = System.currentTimeMillis() + he.emjd("emyx", emjp(int ), (int)79);
        Object object10 = la;
        boolean bl7 = true;
        block45: while (true) {
            CallSite callSite;
            if (!bl7 || (bl7 = false) || !true) {
                object10 = callSite - he.emjd("emyy", emjp(int ), (int)80);
            }
            switch ((int)object10) {
                case -2118143228: {
                    callSite = he.emjd("emyz", emjp(int ), (int)81);
                    continue block45;
                }
                case -890552567: {
                    callSite = he.emjd("emza", emjp(int ), (int)82);
                    continue block45;
                }
                case -195102618: {
                    break block45;
                }
                case -159536464: {
                    callSite = he.emjd("emzf", emjp(int ), (int)83);
                    continue block45;
                }
            }
            break;
        }
        this.placeAt = l6;
        if (bl2 || bl2) return;
        while (true) {
            long l7;
            Object object11;
            if ((object11 = (l7 = la - he.emjd("emzj", emjp(int ), (int)84)) == 0L ? 0 : (l7 < 0L ? -1 : 1)) == false) continue;
            if (object11 == he.emjd("emzk", emja(int ), (int)240)) {
                this.armCrystalAttack(class_23382);
                if (bl2) return;
                break;
            }
            object11 = he.emjd("emzl", emja(int ), (int)241);
        }
        if (!bl2) return;
    }

    private static /* synthetic */ void eoff() {
        he.emjr[0] = -4102854087420860771L;
        he.emjr[1] = -7643515013512324726L;
        he.emjr[2] = -6091145766253498603L;
        he.emjr[3] = 1138137450847750501L;
        he.emjr[4] = 4228005150606528622L;
        he.emjr[5] = 2896577823915027803L;
        he.emjr[6] = 4856633272339373985L;
        he.emjr[7] = 7350142334985739490L;
        he.emjr[8] = 5044938750300384567L;
        he.emjr[9] = -3324163808295590871L;
        he.emjr[10] = 7862589998725344860L;
        he.emjr[11] = -9028026909525911497L;
        he.emjr[12] = -1156166168792617108L;
        he.emjr[13] = -4103472972344133739L;
        he.emjr[14] = 1762579590514845755L;
        he.emjr[15] = -3261194747685635243L;
        he.emjr[16] = 8011729223697721532L;
        he.emjr[17] = 4766383467094675392L;
        he.emjr[18] = 3568368005471043896L;
        he.emjr[19] = -6603675920954098293L;
        he.emjr[20] = -2613685130485506500L;
        he.emjr[21] = -8292407099074162802L;
        he.emjr[22] = -3964446439198672633L;
        he.emjr[23] = -4699693125200271123L;
        he.emjr[24] = -4833039416087988420L;
        he.emjr[25] = 8267347616591132778L;
        he.emjr[26] = -8014978226151752964L;
        he.emjr[27] = -906498419875541392L;
        he.emjr[28] = -4114364496903706658L;
        he.emjr[29] = -167634830163332169L;
        he.emjr[30] = -988580799700205483L;
        he.emjr[31] = 6114872532993828248L;
        he.emjr[32] = -3181519462218133942L;
        he.emjr[33] = 1843194558397916012L;
        he.emjr[34] = 3416218233849918173L;
        he.emjr[35] = -847160288706047706L;
        he.emjr[36] = 2695459702464769905L;
        he.emjr[37] = -7855471040450600834L;
        he.emjr[38] = -2675947862763628196L;
        he.emjr[39] = -2303256305450462811L;
        he.emjr[40] = -2313133310918631647L;
        he.emjr[41] = 2934803018446799617L;
        he.emjr[42] = -5616442597582956597L;
        he.emjr[43] = 1634847001460357962L;
        he.emjr[44] = -1242364954113288689L;
        he.emjr[45] = -6134644290175325491L;
        he.emjr[46] = -31414657048625186L;
        he.emjr[47] = -8769255865218541030L;
        he.emjr[48] = 8722075271521406957L;
        he.emjr[49] = 9136381215128203626L;
        he.emjr[50] = -9136667565254689561L;
        he.emjr[51] = -1358008762455024554L;
        he.emjr[52] = 1067506739363704448L;
        he.emjr[53] = -8579227358835418095L;
        he.emjr[54] = -7404492540914074308L;
        he.emjr[55] = 5909899990316998261L;
        he.emjr[56] = 2754753972210087083L;
        he.emjr[57] = 4735472052147304152L;
        he.emjr[58] = 7723380333225074223L;
        he.emjr[59] = -7124499574087011600L;
        he.emjr[60] = 2217300115088352181L;
        he.emjr[61] = 8005080279416342711L;
        he.emjr[62] = -5571677561570497506L;
        he.emjr[63] = -5794200215498520462L;
        he.emjr[64] = -7283306604321942959L;
        he.emjr[65] = 5793005464033982130L;
        he.emjr[66] = 1502119691985389306L;
        he.emjr[67] = -7276592323229432320L;
        he.emjr[68] = -6046509821449409816L;
        he.emjr[69] = -6802928677063284803L;
        he.emjr[70] = -414462922068613656L;
        he.emjr[71] = -6542457041104293915L;
        he.emjr[72] = -566229273359824138L;
        he.emjr[73] = 905217619804615918L;
        he.emjr[74] = 7152003748184632647L;
        he.emjr[75] = 3796133318034044443L;
        he.emjr[76] = -1500004970197360447L;
        he.emjr[77] = 4162112477538176429L;
        he.emjr[78] = -1633534333997700948L;
        he.emjr[79] = 6943592066117356458L;
        he.emjr[80] = 2374799658180486924L;
        he.emjr[81] = 107597302852483044L;
        he.emjr[82] = -4521352200759757582L;
        he.emjr[83] = -6119398432384337274L;
        he.emjr[84] = 9039651051367019601L;
        he.emjr[85] = 2500678279164001096L;
        he.emjr[86] = 2533662677751324885L;
        he.emjr[87] = -7877236754347234370L;
        he.emjr[88] = -6989087726701891965L;
        he.emjr[89] = 5232816842887661112L;
        he.emjr[90] = 6135590945445502804L;
        he.emjr[91] = -3939018192819600268L;
        he.emjr[92] = 2734928081819149740L;
        he.emjr[93] = -6846070308120745469L;
        he.emjr[94] = 6096673098454407440L;
        he.emjr[95] = 6673690539123515601L;
        he.emjr[96] = 1140654967934221360L;
        he.emjr[97] = -7022019240417173722L;
        he.emjr[98] = -6772085195723070976L;
        he.emjr[99] = 8736219282505525194L;
    }

    private static /* synthetic */ void eoey() {
        he.emjc[400] = -1367859062;
        he.emjc[401] = -1908597390;
        he.emjc[402] = 1584389468;
        he.emjc[403] = -1828229215;
        he.emjc[404] = -1314288962;
        he.emjc[405] = -1282005638;
        he.emjc[406] = 1570379684;
        he.emjc[407] = 1693839479;
        he.emjc[408] = -897137505;
        he.emjc[409] = 1519656584;
        he.emjc[410] = -3517445;
        he.emjc[411] = -210775029;
        he.emjc[412] = 1305652385;
        he.emjc[413] = -1239780687;
        he.emjc[414] = 656852866;
        he.emjc[415] = -1123334067;
        he.emjc[416] = -1910539453;
        he.emjc[417] = -40473602;
        he.emjc[418] = 1020823777;
        he.emjc[419] = 607966403;
        he.emjc[420] = -872919955;
        he.emjc[421] = 49491895;
        he.emjc[422] = 1344296356;
        he.emjc[423] = -1236420165;
        he.emjc[424] = -1210870476;
        he.emjc[425] = -1666453418;
        he.emjc[426] = 745896871;
        he.emjc[427] = -27211224;
        he.emjc[428] = 1863715516;
        he.emjc[429] = 28463861;
        he.emjc[430] = -30515561;
        he.emjc[431] = 729153621;
        he.emjc[432] = -1711364989;
        he.emjc[433] = 1690111773;
        he.emjc[434] = -2031830160;
        he.emjc[435] = 374487286;
        he.emjc[436] = -798742944;
        he.emjc[437] = 1859649813;
        he.emjc[438] = -175379848;
        he.emjc[439] = 734590390;
        he.emjc[440] = 163614267;
        he.emjc[441] = 946153432;
        he.emjc[442] = -1328508898;
        he.emjc[443] = 2037147405;
        he.emjc[444] = 1473014349;
        he.emjc[445] = 1373791596;
        he.emjc[446] = -69004117;
        he.emjc[447] = 2031763888;
        he.emjc[448] = 1107596976;
        he.emjc[449] = 533134131;
        he.emjc[450] = 1626808667;
        he.emjc[451] = 501105659;
        he.emjc[452] = 757314896;
        he.emjc[453] = 960797731;
        he.emjc[454] = 1035498815;
        he.emjc[455] = 31536344;
        he.emjc[456] = -644847150;
        he.emjc[457] = -1726988101;
        he.emjc[458] = 1910911179;
        he.emjc[459] = 692203177;
        he.emjc[460] = 1659815186;
        he.emjc[461] = -1911663491;
        he.emjc[462] = -1866287256;
        he.emjc[463] = 1962552479;
        he.emjc[464] = -1969390776;
        he.emjc[465] = -1380470452;
        he.emjc[466] = -236780693;
        he.emjc[467] = 329940846;
        he.emjc[468] = -913939026;
        he.emjc[469] = -1923377612;
        he.emjc[470] = 440375732;
        he.emjc[471] = -972649217;
        he.emjc[472] = 545946101;
        he.emjc[473] = -1394304311;
        he.emjc[474] = 1983687405;
        he.emjc[475] = -1765150255;
        he.emjc[476] = 1604759257;
        he.emjc[477] = -1413179127;
        he.emjc[478] = -1889852572;
        he.emjc[479] = -477531103;
        he.emjc[480] = 1940053337;
        he.emjc[481] = 397899301;
        he.emjc[482] = 1087944714;
        he.emjc[483] = 1897248619;
        he.emjc[484] = -1227854893;
        he.emjc[485] = -2049057975;
        he.emjc[486] = -857710993;
        he.emjc[487] = -75460906;
        he.emjc[488] = -1221766231;
        he.emjc[489] = 1474499551;
        he.emjc[490] = 1205282417;
        he.emjc[491] = -2008514382;
        he.emjc[492] = 1071952250;
        he.emjc[493] = -958495333;
        he.emjc[494] = -841301143;
        he.emjc[495] = 1419534036;
        he.emjc[496] = -406809612;
        he.emjc[497] = -633016045;
        he.emjc[498] = -1180263136;
        he.emjc[499] = 1891593761;
    }

    private static /* synthetic */ void eofg() {
        he.emjr[100] = -8406009695207970573L;
        he.emjr[101] = 6999670157787752465L;
        he.emjr[102] = -3180378745349529930L;
        he.emjr[103] = -3020658251746728650L;
        he.emjr[104] = 3903631043173771372L;
        he.emjr[105] = 1435538203363220701L;
        he.emjr[106] = -7962198645178144635L;
        he.emjr[107] = -8551562663186193087L;
        he.emjr[108] = -2796197109031513310L;
        he.emjr[109] = -1420807949406959144L;
        he.emjr[110] = -7453641339314089696L;
        he.emjr[111] = -6731164378959519557L;
        he.emjr[112] = 4865770655703273751L;
        he.emjr[113] = 568881882576213357L;
        he.emjr[114] = -7207270889994342853L;
        he.emjr[115] = 3882740213521719019L;
        he.emjr[116] = -122128800140546073L;
        he.emjr[117] = -5683500971329728921L;
        he.emjr[118] = -4497314774496641600L;
        he.emjr[119] = -5402655213598713341L;
        he.emjr[120] = 374334493925569051L;
        he.emjr[121] = 727225981144076251L;
        he.emjr[122] = 3287895591752740507L;
        he.emjr[123] = -1729104226932320482L;
        he.emjr[124] = -5215547234115791261L;
        he.emjr[125] = -569786644589737528L;
        he.emjr[126] = 3287704554982183874L;
        he.emjr[127] = -3609224880566555492L;
        he.emjr[128] = 1968564227207518928L;
        he.emjr[129] = -4018138161195341914L;
        he.emjr[130] = 4919320555998936173L;
        he.emjr[131] = -4863811541492835724L;
        he.emjr[132] = -894121473225968354L;
        he.emjr[133] = -8450386710475459673L;
        he.emjr[134] = 2954005094526008850L;
        he.emjr[135] = 1940888856620760586L;
        he.emjr[136] = -8770318960068056342L;
        he.emjr[137] = 8549196006391803976L;
        he.emjr[138] = 4666884377273241787L;
        he.emjr[139] = -5542010629277080913L;
        he.emjr[140] = 5517935764320451454L;
        he.emjr[141] = -8451567042957173450L;
        he.emjr[142] = -7445238174155811414L;
        he.emjr[143] = 749087114225664449L;
        he.emjr[144] = -1695374994546547169L;
        he.emjr[145] = 4818545715266373702L;
        he.emjr[146] = 6583382566635386211L;
        he.emjr[147] = -8026534572043468171L;
        he.emjr[148] = -6338144319760211518L;
        he.emjr[149] = 6956566515445145239L;
        he.emjr[150] = -7081580384214479620L;
        he.emjr[151] = 6294473955487705355L;
        he.emjr[152] = 4020190272814041422L;
        he.emjr[153] = 7177051100441899448L;
        he.emjr[154] = -4544406521717356029L;
        he.emjr[155] = 3820354231597000377L;
        he.emjr[156] = 7632580077054696197L;
        he.emjr[157] = -5878370347065139553L;
        he.emjr[158] = 5965738043212840356L;
        he.emjr[159] = 1091369846757276188L;
        he.emjr[160] = -1982640518625940996L;
        he.emjr[161] = 5832877735934652558L;
        he.emjr[162] = -8193437453314183379L;
        he.emjr[163] = -975214874263001512L;
        he.emjr[164] = -2714912922761876932L;
        he.emjr[165] = 8733888335166286224L;
        he.emjr[166] = 8206381265314343778L;
        he.emjr[167] = -7136558563840458289L;
        he.emjr[168] = -1133980196617931582L;
        he.emjr[169] = 3309613206577487769L;
        he.emjr[170] = -989355675905821119L;
        he.emjr[171] = -5499841150497295355L;
        he.emjr[172] = 4994958544863251444L;
        he.emjr[173] = 3421649902996303293L;
        he.emjr[174] = 6441156145528395462L;
        he.emjr[175] = -9099369992542367806L;
        he.emjr[176] = 3671968993732396744L;
        he.emjr[177] = -585580044966167306L;
        he.emjr[178] = -2851977983986845075L;
        he.emjr[179] = 2733020350554889839L;
        he.emjr[180] = 8164202092443840436L;
        he.emjr[181] = -5363001232421924498L;
        he.emjr[182] = 888023268983511452L;
        he.emjr[183] = -8025055512822091761L;
        he.emjr[184] = 6377678361995146134L;
        he.emjr[185] = -3101542008042790278L;
        he.emjr[186] = 764531939723454542L;
        he.emjr[187] = -3398919317246788223L;
        he.emjr[188] = -5019437911219131931L;
        he.emjr[189] = 3983077920272075163L;
        he.emjr[190] = -3822773695475585197L;
        he.emjr[191] = 2820823813488019601L;
        he.emjr[192] = 8957587695912314201L;
        he.emjr[193] = -5501968485572140296L;
        he.emjr[194] = -2391030046309551452L;
        he.emjr[195] = -1952166122433981360L;
        he.emjr[196] = 4911047465830246985L;
        he.emjr[197] = 9193039969957220755L;
        he.emjr[198] = 2654686472680043882L;
        he.emjr[199] = 5257598204836665872L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ boolean lambda$canPlace$0(class_1297 var0) {
        v0 /* !! */  = he.la;
        if (true) ** GOTO lbl5
        block15: while (true) {
            v0 /* !! */  = (long)(v1 - he.emjd("eoea", emjp(int ), (int)358));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -976734792: {
                    v1 = he.emjd("eoeb", emjp(int ), (int)359);
                    continue block15;
                }
                case -195102618: {
                    break block15;
                }
                case -105156388: {
                    v1 = he.emjd("eoec", emjp(int ), (int)360);
                    continue block15;
                }
            }
            break;
        }
        var3_1 = he.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = he.la - he.emjd("eoed", emjp(int ), (int)361)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == he.emjd("eoee", emja(int ), (int)630)) break;
            v2 /* !! */  = (long)he.emjd("eoef", emja(int ), (int)631);
        }
        var2_2 /* !! */  = he.b;
        v3 /* !! */  = he.la;
        if (true) ** GOTO lbl26
        block17: while (true) {
            v3 /* !! */  = (long)(he.emjd("eoeh", emjp(int ), (int)363) - he.emjd("eoeg", emjp(int ), (int)362));
lbl26:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -283820863: {
                    continue block17;
                }
                case -195102618: {
                    break block17;
                }
            }
            break;
        }
        var1_3 = he.a;
        if (!var3_1) ** GOTO lbl38
        throw null;
        {
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var2_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return (boolean)he.emjd("eoei", emja(int ), (int)632);
                }
lbl38:
                // 1 sources

                if (var1_3 || var1_3) continue block18;
                return var0 instanceof class_1511;
lbl40:
                // 2 sources

                case 0: {
                    var2_2 /* !! */  = (int)he.emjd("eoej", emja(int ), (int)633);
                    if (!var3_1) break block18;
                    throw null;
                }
                case 1: {
                    var2_2 /* !! */  = (int)he.emjd("eoek", emja(int ), (int)634);
                    if (!var3_1) break block18;
                    throw null;
                }
                case 2: {
                    var2_2 /* !! */  = (int)he.emjd("eoel", emja(int ), (int)635);
                    if (!var3_1) ** GOTO lbl40
                    throw null;
                }
                case 3: 
            }
        }
        do {
            var2_2 /* !! */  = (int)he.emjd("eoem", emja(int ), (int)636);
        } while (!var3_1);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void placeCrystal() {
        v0 /* !! */  = he.la;
        if (true) ** GOTO lbl5
        block104: while (true) {
            v0 /* !! */  = (long)(v1 - he.emjd("eney", emjp(int ), (int)108));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -2039930805: {
                    v1 = he.emjd("enfa", emjp(int ), (int)109);
                    continue block104;
                }
                case -965492469: {
                    v1 = he.emjd("enfb", emjp(int ), (int)110);
                    continue block104;
                }
                case -195102618: {
                    break block104;
                }
                case 1133009647: {
                    v1 = he.emjd("enfc", emjp(int ), (int)111);
                    continue block104;
                }
            }
            break;
        }
        var4_1 = he.c;
        v2 /* !! */  = he.la;
        if (true) ** GOTO lbl22
        block105: while (true) {
            v2 /* !! */  = (long)(v3 - he.emjd("enfd", emjp(int ), (int)112));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1191057099: {
                    v3 = he.emjd("enfe", emjp(int ), (int)113);
                    continue block105;
                }
                case -195102618: {
                    break block105;
                }
                case 1293798081: {
                    v3 = he.emjd("enff", emjp(int ), (int)114);
                    continue block105;
                }
            }
            break;
        }
        var3_2 /* !! */  = he.b;
        v4 /* !! */  = he.la;
        if (true) ** GOTO lbl36
        block106: while (true) {
            v4 /* !! */  = (long)(v5 - he.emjd("enfh", emjp(int ), (int)115));
lbl36:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -195102618: {
                    break block106;
                }
                case -147061723: {
                    v5 = he.emjd("enfl", emjp(int ), (int)116);
                    continue block106;
                }
                case 28128056: {
                    v5 = he.emjd("enfm", emjp(int ), (int)117);
                    continue block106;
                }
                case 271614739: {
                    v5 = he.emjd("enfn", emjp(int ), (int)118);
                    continue block106;
                }
            }
            break;
        }
        var2_3 = he.a;
        if (var4_1) {
            throw null;
lbl51:
            // 12 sources

            return;
        }
        if (var2_3 || var2_3) ** GOTO lbl51
        v6 /* !! */  = he.la;
        if (true) ** GOTO lbl58
        block108: while (true) {
            v6 /* !! */  = (long)(v7 - he.emjd("enfp", emjp(int ), (int)119));
lbl58:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case -195102618: {
                    break block108;
                }
                case 960700748: {
                    v7 = he.emjd("enfr", emjp(int ), (int)120);
                    continue block108;
                }
                case 1048221442: {
                    v7 = he.emjd("enft", emjp(int ), (int)121);
                    continue block108;
                }
            }
            break;
        }
        while (true) {
            if ((v8 /* !! */  = (cfr_temp_0 = he.la - he.emjd("enfu", emjp(int ), (int)122)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v8 /* !! */  == he.emjd("enfv", emja(int ), (int)295)) break;
            v8 /* !! */  = (long)he.emjd("enfw", emja(int ), (int)296);
        }
        v9 = class_243.method_24953((class_2382)this.targetPos);
        v10 = he.emjd("enfx", emsz(int ), (int)123);
        while (true) {
            if ((v11 /* !! */  = (cfr_temp_1 = he.la - he.emjd("enfz", emjp(int ), (int)124)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v11 /* !! */  == he.emjd("engd", emja(int ), (int)297)) break;
            v11 /* !! */  = (long)he.emjd("enge", emja(int ), (int)298);
        }
        var1_4 = v9.method_1031(0.0, (double)v10, 0.0);
        if (var2_3 || var2_3) ** GOTO lbl51
        v12 /* !! */  = he.la;
        if (true) ** GOTO lbl85
        block111: while (true) {
            v12 /* !! */  = (long)(he.emjd("engh", emjp(int ), (int)126) - he.emjd("engg", emjp(int ), (int)125));
lbl85:
            // 2 sources

            switch ((int)v12 /* !! */ ) {
                case -195102618: {
                    break block111;
                }
                case 1060211265: {
                    continue block111;
                }
            }
            break;
        }
        this.rotateTo(var1_4);
        if (var2_3 || var2_3) ** GOTO lbl51
        while (true) {
            if ((v13 /* !! */  = (cfr_temp_2 = he.la - he.emjd("engj", emjp(int ), (int)127)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v13 /* !! */  == he.emjd("engk", emja(int ), (int)299)) break;
            v13 /* !! */  = (long)he.emjd("engm", emja(int ), (int)300);
        }
        v14 = nv.currentSlot();
        while (true) {
            if ((v15 /* !! */  = (cfr_temp_3 = he.la - he.emjd("engn", emjp(int ), (int)128)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v15 /* !! */  == he.emjd("engo", emja(int ), (int)301)) break;
            v15 /* !! */  = (long)he.emjd("engp", emja(int ), (int)302);
        }
        this.oldSlot = v14;
        if (var2_3) ** GOTO lbl51
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_3) ** GOTO lbl51
                v16 /* !! */  = he.la;
                if (true) ** GOTO lbl113
                block114: while (true) {
                    v16 /* !! */  = (long)(v17 - he.emjd("engq", emjp(int ), (int)129));
lbl113:
                    // 2 sources

                    switch ((int)v16 /* !! */ ) {
                        case -339754120: {
                            v17 = he.emjd("engs", emjp(int ), (int)130);
                            continue block114;
                        }
                        case -195102618: {
                            break block114;
                        }
                        case -183505353: {
                            v17 = he.emjd("engu", emjp(int ), (int)131);
                            continue block114;
                        }
                        case 163314220: {
                            v17 = he.emjd("engw", emjp(int ), (int)132);
                            continue block114;
                        }
                    }
                    break;
                }
                v18 /* !! */  = he.la;
                if (true) ** GOTO lbl129
                block115: while (true) {
                    v18 /* !! */  = (long)(v19 - he.emjd("engz", emjp(int ), (int)133));
lbl129:
                    // 2 sources

                    switch ((int)v18 /* !! */ ) {
                        case -195102618: {
                            break block115;
                        }
                        case 498214527: {
                            v19 = he.emjd("enha", emjp(int ), (int)134);
                            continue block115;
                        }
                        case 1195656500: {
                            v19 = he.emjd("enhc", emjp(int ), (int)135);
                            continue block115;
                        }
                    }
                    break;
                }
                nv.selectSlot(this.targetSlot);
                if (var2_3 || var2_3) ** GOTO lbl51
                v20 /* !! */  = he.la;
                if (true) ** GOTO lbl144
                block116: while (true) {
                    v20 /* !! */  = (long)(he.emjd("enhh", emjp(int ), (int)137) - he.emjd("enhe", emjp(int ), (int)136));
lbl144:
                    // 2 sources

                    switch ((int)v20 /* !! */ ) {
                        case -195102618: {
                            break block116;
                        }
                        case 1399584659: {
                            continue block116;
                        }
                    }
                    break;
                }
                nv.updateSlots();
                if (var2_3 || var2_3) ** GOTO lbl51
                v21 /* !! */  = he.la;
                if (true) ** GOTO lbl155
                block117: while (true) {
                    v21 /* !! */  = (long)(v22 - he.emjd("enhi", emjp(int ), (int)138));
lbl155:
                    // 2 sources

                    switch ((int)v21 /* !! */ ) {
                        case -674032003: {
                            v22 = he.emjd("enhk", emjp(int ), (int)139);
                            continue block117;
                        }
                        case -195102618: {
                            break block117;
                        }
                        case 1599182024: {
                            v22 = he.emjd("enhn", emjp(int ), (int)140);
                            continue block117;
                        }
                        case 1838162375: {
                            v22 = he.emjd("enho", emjp(int ), (int)141);
                            continue block117;
                        }
                    }
                    break;
                }
                v23 /* !! */  = he.la;
                if (true) ** GOTO lbl171
                block118: while (true) {
                    v23 /* !! */  = (long)(he.emjd("enhq", emjp(int ), (int)143) - he.emjd("enhp", emjp(int ), (int)142));
lbl171:
                    // 2 sources

                    switch ((int)v23 /* !! */ ) {
                        case -195102618: {
                            break block118;
                        }
                        case 1369948685: {
                            continue block118;
                        }
                    }
                    break;
                }
                v24 = he.mc.field_1761;
                while (true) {
                    if ((v25 /* !! */  = (cfr_temp_4 = he.la - he.emjd("enht", emjp(int ), (int)144)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v25 /* !! */  == he.emjd("enhv", emja(int ), (int)303)) break;
                    v25 /* !! */  = (long)he.emjd("enia", emja(int ), (int)304);
                }
                v26 /* !! */  = he.la;
                if (true) ** GOTO lbl186
                block120: while (true) {
                    v26 /* !! */  = (long)(v27 - he.emjd("enib", emjp(int ), (int)145));
lbl186:
                    // 2 sources

                    switch ((int)v26 /* !! */ ) {
                        case -195102618: {
                            break block120;
                        }
                        case -133612226: {
                            v27 = he.emjd("enic", emjp(int ), (int)146);
                            continue block120;
                        }
                        case 2016677089: {
                            v27 = he.emjd("enid", emjp(int ), (int)147);
                            continue block120;
                        }
                    }
                    break;
                }
                v28 = he.mc.field_1724;
                v29 /* !! */  = he.la;
                if (true) ** GOTO lbl200
                block121: while (true) {
                    v29 /* !! */  = (long)(v30 - he.emjd("enif", emjp(int ), (int)148));
lbl200:
                    // 2 sources

                    switch ((int)v29 /* !! */ ) {
                        case -1923064497: {
                            v30 = he.emjd("enih", emjp(int ), (int)149);
                            continue block121;
                        }
                        case -1057456378: {
                            v30 = he.emjd("enij", emjp(int ), (int)150);
                            continue block121;
                        }
                        case -195102618: {
                            break block121;
                        }
                        case 2026788784: {
                            v30 = he.emjd("enin", emjp(int ), (int)151);
                            continue block121;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v31 /* !! */  = (cfr_temp_5 = he.la - he.emjd("enio", emjp(int ), (int)152)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v31 /* !! */  == he.emjd("enip", emja(int ), (int)305)) break;
                    v31 /* !! */  = (long)he.emjd("enir", emja(int ), (int)306);
                }
                while (true) {
                    if ((v32 /* !! */  = (cfr_temp_6 = he.la - he.emjd("eniu", emjp(int ), (int)153)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v32 /* !! */  == he.emjd("eniw", emja(int ), (int)307)) break;
                    v32 /* !! */  = (long)he.emjd("eniy", emja(int ), (int)308);
                }
                v33 /* !! */  = he.la;
                if (true) ** GOTO lbl226
                block124: while (true) {
                    v33 /* !! */  = (long)(v34 - he.emjd("eniz", emjp(int ), (int)154));
lbl226:
                    // 2 sources

                    switch ((int)v33 /* !! */ ) {
                        case -195102618: {
                            break block124;
                        }
                        case 433089772: {
                            v34 = he.emjd("enjb", emjp(int ), (int)155);
                            continue block124;
                        }
                        case 514650884: {
                            v34 = he.emjd("enjc", emjp(int ), (int)156);
                            continue block124;
                        }
                        case 1900667471: {
                            v34 = he.emjd("enjd", emjp(int ), (int)157);
                            continue block124;
                        }
                    }
                    break;
                }
                v35 = he.emjd("enje", emja(int ), (int)309);
                while (true) {
                    if ((v36 /* !! */  = (cfr_temp_7 = he.la - he.emjd("enjf", emjp(int ), (int)158)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v36 /* !! */  == he.emjd("enjg", emja(int ), (int)310)) break;
                    v36 /* !! */  = (long)he.emjd("enjh", emja(int ), (int)311);
                }
                v37 = new class_3965(var1_4, class_2350.field_11036, this.targetPos, (boolean)v35);
                while (true) {
                    if ((v38 /* !! */  = (cfr_temp_8 = he.la - he.emjd("enji", emjp(int ), (int)159)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v38 /* !! */  == he.emjd("enjj", emja(int ), (int)312)) break;
                    v38 /* !! */  = (long)he.emjd("enjk", emja(int ), (int)313);
                }
                v24.method_2896(v28, class_1268.field_5808, v37);
                if (var2_3 || var2_3) ** GOTO lbl51
                while (true) {
                    if ((v39 /* !! */  = (cfr_temp_9 = he.la - he.emjd("enjl", emjp(int ), (int)160)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                    if (v39 /* !! */  == he.emjd("enjm", emja(int ), (int)314)) break;
                    v39 /* !! */  = (long)he.emjd("enjn", emja(int ), (int)315);
                }
                v40 /* !! */  = he.la;
                if (true) ** GOTO lbl261
                block128: while (true) {
                    v40 /* !! */  = (long)(v41 - he.emjd("enjo", emjp(int ), (int)161));
lbl261:
                    // 2 sources

                    switch ((int)v40 /* !! */ ) {
                        case -1634957501: {
                            v41 = he.emjd("enjp", emjp(int ), (int)162);
                            continue block128;
                        }
                        case -195102618: {
                            break block128;
                        }
                        case -75129258: {
                            v41 = he.emjd("enjq", emjp(int ), (int)163);
                            continue block128;
                        }
                        case 1387862949: {
                            v41 = he.emjd("enjr", emjp(int ), (int)164);
                            continue block128;
                        }
                    }
                    break;
                }
                v42 = he.mc.field_1724;
                v43 /* !! */  = he.la;
                if (true) ** GOTO lbl278
                block129: while (true) {
                    v43 /* !! */  = (long)(he.emjd("enjt", emjp(int ), (int)166) - he.emjd("enjs", emjp(int ), (int)165));
lbl278:
                    // 2 sources

                    switch ((int)v43 /* !! */ ) {
                        case -1142293005: {
                            continue block129;
                        }
                        case -195102618: {
                            break block129;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v44 /* !! */  = (cfr_temp_10 = he.la - he.emjd("enjv", emjp(int ), (int)167)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
                    if (v44 /* !! */  == he.emjd("enjw", emja(int ), (int)316)) break;
                    v44 /* !! */  = (long)he.emjd("enjx", emja(int ), (int)317);
                }
                v42.method_6104(class_1268.field_5808);
                if (var2_3 || var2_3) ** GOTO lbl51
                v45 = he.emjd("enjy", emja(int ), (int)318);
                while (true) {
                    if ((v46 /* !! */  = (cfr_temp_11 = he.la - he.emjd("enjz", emjp(int ), (int)168)) == 0L ? 0 : (cfr_temp_11 < 0L ? -1 : 1)) == false) continue;
                    if (v46 /* !! */  == he.emjd("enka", emja(int ), (int)319)) break;
                    v46 /* !! */  = (long)he.emjd("enkb", emja(int ), (int)320);
                }
                this.needSync = v45;
                if (var2_3 || var2_3) ** GOTO lbl51
                while (true) {
                    if ((v47 /* !! */  = (cfr_temp_12 = he.la - he.emjd("enkc", emjp(int ), (int)169)) == 0L ? 0 : (cfr_temp_12 < 0L ? -1 : 1)) == false) continue;
                    if (v47 /* !! */  == he.emjd("enkd", emja(int ), (int)321)) break;
                    v47 /* !! */  = (long)he.emjd("enke", emja(int ), (int)322);
                }
                this.targetPos = null;
                if (var2_3 || var2_3) ** GOTO lbl51
                v48 = he.emjd("enkf", emjp(int ), (int)170);
                while (true) {
                    if ((v49 /* !! */  = (cfr_temp_13 = he.la - he.emjd("enkg", emjp(int ), (int)171)) == 0L ? 0 : (cfr_temp_13 < 0L ? -1 : 1)) == false) continue;
                    if (v49 /* !! */  == he.emjd("enkh", emja(int ), (int)323)) break;
                    v49 /* !! */  = (long)he.emjd("enki", emja(int ), (int)324);
                }
                this.placeAt = (long)v48;
                if (!var2_3 && !var2_3) ** break;
                ** continue;
                return;
            }
            case 0: {
                var3_2 /* !! */  = (int)he.emjd("enkk", emja(int ), (int)325);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl412
            }
lbl320:
            // 2 sources

            case 1: {
                var3_2 /* !! */  = (int)he.emjd("enkl", emja(int ), (int)326);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl368
            }
            case 2: {
                var3_2 /* !! */  = (int)he.emjd("enkm", emja(int ), (int)327);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl387
            }
lbl330:
            // 2 sources

            case 3: {
                var3_2 /* !! */  = (int)he.emjd("enkn", emja(int ), (int)328);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl368
            }
            case 4: {
                var3_2 /* !! */  = (int)he.emjd("enko", emja(int ), (int)329);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl391
            }
            case 5: {
                var3_2 /* !! */  = (int)he.emjd("enkp", emja(int ), (int)330);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl391
            }
lbl345:
            // 2 sources

            case 6: {
                var3_2 /* !! */  = (int)he.emjd("enkq", emja(int ), (int)331);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl400
            }
lbl350:
            // 2 sources

            case 7: {
                var3_2 /* !! */  = (int)he.emjd("enkr", emja(int ), (int)332);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl391
            }
lbl355:
            // 2 sources

            case 8: {
                var3_2 /* !! */  = (int)he.emjd("enks", emja(int ), (int)333);
                if (!var4_1) ** GOTO lbl320
                throw null;
            }
            case 9: {
                var3_2 /* !! */  = (int)he.emjd("enkt", emja(int ), (int)334);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl368
            }
            case 10: {
                var3_2 /* !! */  = (int)he.emjd("enku", emja(int ), (int)335);
                if (var4_1) {
                    throw null;
                }
            }
lbl368:
            // 6 sources

            case 11: {
                var3_2 /* !! */  = (int)he.emjd("enkv", emja(int ), (int)336);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl395
            }
            case 12: {
                var3_2 /* !! */  = (int)he.emjd("enkw", emja(int ), (int)337);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl400
            }
lbl378:
            // 2 sources

            case 13: {
                var3_2 /* !! */  = (int)he.emjd("enky", emja(int ), (int)338);
                if (!var4_1) ** GOTO lbl330
                throw null;
            }
lbl382:
            // 2 sources

            case 14: {
                do {
                    var3_2 /* !! */  = (int)he.emjd("enkz", emja(int ), (int)339);
                } while (!var4_1);
                throw null;
            }
lbl387:
            // 2 sources

            case 15: {
                var3_2 /* !! */  = (int)he.emjd("enla", emja(int ), (int)340);
                if (!var4_1) ** GOTO lbl378
                throw null;
            }
lbl391:
            // 5 sources

            case 16: {
                var3_2 /* !! */  = (int)he.emjd("enlb", emja(int ), (int)341);
                if (!var4_1) ** GOTO lbl345
                throw null;
            }
lbl395:
            // 3 sources

            case 17: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_2 /* !! */  = (int)he.emjd("enlc", emja(int ), (int)342);
                    if (!var4_1) ** GOTO lbl355
                    throw null;
                }
            }
lbl400:
            // 3 sources

            case 18: {
                var3_2 /* !! */  = (int)he.emjd("enld", emja(int ), (int)343);
                if (var4_1) {
                    throw null;
                }
            }
            case 19: {
                var3_2 /* !! */  = (int)he.emjd("enle", emja(int ), (int)344);
                if (!var4_1) ** GOTO lbl382
                throw null;
            }
            case 20: {
                var3_2 /* !! */  = (int)he.emjd("enlf", emja(int ), (int)345);
                if (!var4_1) ** GOTO lbl395
                throw null;
            }
lbl412:
            // 2 sources

            case 21: {
                var3_2 /* !! */  = (int)he.emjd("enlg", emja(int ), (int)346);
                if (!var4_1) ** GOTO lbl350
                throw null;
            }
            case 22: {
                var3_2 /* !! */  = (int)he.emjd("enlh", emja(int ), (int)347);
                if (!var4_1) ** GOTO lbl391
                throw null;
            }
            case 23: 
        }
        var3_2 /* !! */  = (int)he.emjd("enli", emja(int ), (int)348);
        ** while (!var4_1)
lbl423:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ long emjp(int n2) {
        return emjq[n2] ^ emjr[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onPostTick(cy var1_1) {
        block103: {
            block105: {
                block104: {
                    var7_2 = he.c;
                    var6_3 /* !! */  = he.b;
                    var5_4 = he.a;
                    if (var7_2) {
                        throw null;
lbl6:
                        // 29 sources

                        return;
                    }
                    if (var5_4 || var5_4) ** GOTO lbl6
                    if (this.crystalArea == null) break block104;
                    if (var5_4) ** GOTO lbl6
                    if (he.mc.field_1724 == null) break block104;
                    if (var5_4) ** GOTO lbl6
                    if (he.mc.field_1687 == null) break block104;
                    if (var5_4) ** GOTO lbl6
                    if (he.mc.field_1761 != null) break block105;
                    if (var5_4) ** GOTO lbl6
                }
                if (var5_4 || var5_4) ** GOTO lbl6
                return;
            }
            if (var5_4 || var5_4) ** GOTO lbl6
            var2_5 = he.mc.field_1687.method_18112().iterator();
            if (var5_4) ** GOTO lbl6
            while (true) {
                if (var5_4 || var5_4) ** GOTO lbl6
                if (!var2_5.hasNext()) ** GOTO lbl63
                if (var5_4) ** GOTO lbl6
                var3_6 = (class_1297)var2_5.next();
                if (var5_4 || var5_4) ** GOTO lbl6
                if (!(var3_6 instanceof class_1511)) continue;
                if (var5_4) ** GOTO lbl6
                var4_7 = (class_1511)var3_6;
                if (var5_4 || var5_4) ** GOTO lbl6
                if (this.crystalArea.method_1006(var4_7.method_73189())) break block103;
                if (var5_4 || var5_4) ** GOTO lbl6
                if (var7_2) break;
            }
            throw null;
        }
        if (var5_4 || var5_4) ** GOTO lbl6
        if (!this.isProtected(var4_7.method_5829().method_1014((double)he.emjd("emta", emsz(int ), (int)56)))) ** GOTO lbl50
        if (var5_4 || var5_4) ** GOTO lbl6
        this.clearCrystalAttack();
        if (var5_4) ** GOTO lbl6
        if (var6_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var6_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var5_4) ** GOTO lbl6
                return;
            }
lbl50:
            // 1 sources

            if (var5_4 || var5_4) ** GOTO lbl6
            this.rotateTo(var4_7.method_73189().method_1031(0.0, (double)var4_7.method_17682() * he.emjd("emtc", emsz(int ), (int)57), 0.0));
            if (var5_4 || var5_4) ** GOTO lbl6
            he.mc.field_1761.method_2918((class_1657)he.mc.field_1724, (class_1297)var4_7);
            if (var5_4 || var5_4) ** GOTO lbl6
            he.mc.field_1724.method_6104(class_1268.field_5808);
            if (var5_4 || var5_4) ** GOTO lbl6
            if ((this.crystalAttackTicks -= he.emjd("emtd", emja(int ), (int)178)) > 0) ** GOTO lbl61
            if (var5_4 || var5_4) ** GOTO lbl6
            this.clearCrystalAttack();
            if (var5_4) ** GOTO lbl6
lbl61:
            // 2 sources

            if (var5_4 || var5_4) ** GOTO lbl6
            return;
lbl63:
            // 1 sources

            if (var5_4 || var5_4) ** GOTO lbl6
            if ((this.crystalAttackTicks -= he.emjd("emtg", emja(int ), (int)179)) > 0) ** GOTO lbl68
            if (var5_4 || var5_4) ** GOTO lbl6
            this.clearCrystalAttack();
            if (var5_4) ** GOTO lbl6
lbl68:
            // 2 sources

            if (!var5_4 && !var5_4) ** break;
            ** continue;
            return;
            case 0: {
                var6_3 /* !! */  = (int)he.emjd("emti", emja(int ), (int)180);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl294
            }
lbl76:
            // 2 sources

            case 1: {
                var6_3 /* !! */  = (int)he.emjd("emtk", emja(int ), (int)181);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl164
            }
lbl81:
            // 3 sources

            case 2: {
                var6_3 /* !! */  = (int)he.emjd("emtl", emja(int ), (int)182);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl126
            }
lbl86:
            // 2 sources

            case 3: {
                var6_3 /* !! */  = (int)he.emjd("emtn", emja(int ), (int)183);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl260
            }
            case 4: {
                var6_3 /* !! */  = (int)he.emjd("emtp", emja(int ), (int)184);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl200
            }
lbl96:
            // 4 sources

            case 5: {
                var6_3 /* !! */  = (int)he.emjd("emtq", emja(int ), (int)185);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl294
            }
lbl101:
            // 2 sources

            case 6: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var6_3 /* !! */  = (int)he.emjd("emtr", emja(int ), (int)186);
                    if (var7_2) {
                        throw null;
                    }
                    ** GOTO lbl227
                    break;
                }
            }
            case 7: {
                var6_3 /* !! */  = (int)he.emjd("emts", emja(int ), (int)187);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl164
            }
            case 8: {
                var6_3 /* !! */  = (int)he.emjd("emtt", emja(int ), (int)188);
                if (!var7_2) ** GOTO lbl86
                throw null;
            }
lbl116:
            // 2 sources

            case 9: {
                var6_3 /* !! */  = (int)he.emjd("emtu", emja(int ), (int)189);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl145
            }
lbl121:
            // 2 sources

            case 10: {
                var6_3 /* !! */  = (int)he.emjd("emtv", emja(int ), (int)190);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl274
            }
lbl126:
            // 3 sources

            case 11: {
                var6_3 /* !! */  = (int)he.emjd("emtx", emja(int ), (int)191);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl248
            }
            case 12: {
                var6_3 /* !! */  = (int)he.emjd("emuc", emja(int ), (int)192);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl278
            }
            case 13: {
                var6_3 /* !! */  = (int)he.emjd("emue", emja(int ), (int)193);
                if (!var7_2) ** GOTO lbl96
                throw null;
            }
            case 14: {
                var6_3 /* !! */  = (int)he.emjd("emuf", emja(int ), (int)194);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl223
            }
lbl145:
            // 4 sources

            case 15: {
                var6_3 /* !! */  = (int)he.emjd("emuh", emja(int ), (int)195);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl190
            }
            case 16: {
                var6_3 /* !! */  = (int)he.emjd("emuj", emja(int ), (int)196);
                if (!var7_2) ** GOTO lbl116
                throw null;
            }
lbl154:
            // 2 sources

            case 17: {
                var6_3 /* !! */  = (int)he.emjd("emul", emja(int ), (int)197);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl290
            }
lbl159:
            // 2 sources

            case 18: {
                var6_3 /* !! */  = (int)he.emjd("emun", emja(int ), (int)198);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl274
            }
lbl164:
            // 4 sources

            case 19: {
                var6_3 /* !! */  = (int)he.emjd("emup", emja(int ), (int)199);
                if (!var7_2) ** GOTO lbl159
                throw null;
            }
            case 20: {
                do {
                    var6_3 /* !! */  = (int)he.emjd("emur", emja(int ), (int)200);
                } while (!var7_2);
                throw null;
            }
lbl173:
            // 2 sources

            case 21: {
                var6_3 /* !! */  = (int)he.emjd("emus", emja(int ), (int)201);
                if (!var7_2) ** GOTO lbl121
                throw null;
            }
            case 22: {
                var6_3 /* !! */  = (int)he.emjd("emuu", emja(int ), (int)202);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl214
            }
lbl182:
            // 2 sources

            case 23: {
                var6_3 /* !! */  = (int)he.emjd("emuw", emja(int ), (int)203);
                if (!var7_2) ** GOTO lbl81
                throw null;
            }
            case 24: {
                var6_3 /* !! */  = (int)he.emjd("emuy", emja(int ), (int)204);
                if (!var7_2) ** GOTO lbl182
                throw null;
            }
lbl190:
            // 3 sources

            case 25: {
                var6_3 /* !! */  = (int)he.emjd("emva", emja(int ), (int)205);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl209
            }
            case 26: {
                var6_3 /* !! */  = (int)he.emjd("emvb", emja(int ), (int)206);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl260
            }
lbl200:
            // 2 sources

            case 27: {
                do {
                    var6_3 /* !! */  = (int)he.emjd("emvf", emja(int ), (int)207);
                } while (!var7_2);
                throw null;
            }
            case 28: {
                var6_3 /* !! */  = (int)he.emjd("emvg", emja(int ), (int)208);
                if (!var7_2) ** GOTO lbl145
                throw null;
            }
lbl209:
            // 2 sources

            case 29: {
                var6_3 /* !! */  = (int)he.emjd("emvh", emja(int ), (int)209);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl260
            }
lbl214:
            // 3 sources

            case 30: {
                var6_3 /* !! */  = (int)he.emjd("emvj", emja(int ), (int)210);
                if (!var7_2) ** GOTO lbl96
                throw null;
            }
            case 31: {
                var6_3 /* !! */  = (int)he.emjd("emvk", emja(int ), (int)211);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl244
            }
lbl223:
            // 3 sources

            case 32: {
                var6_3 /* !! */  = (int)he.emjd("emvm", emja(int ), (int)212);
                if (!var7_2) ** GOTO lbl96
                throw null;
            }
lbl227:
            // 3 sources

            case 33: {
                var6_3 /* !! */  = (int)he.emjd("emvn", emja(int ), (int)213);
                if (!var7_2) ** GOTO lbl81
                throw null;
            }
            case 34: {
                var6_3 /* !! */  = (int)he.emjd("emvs", emja(int ), (int)214);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl286
            }
            case 35: {
                var6_3 /* !! */  = (int)he.emjd("emvt", emja(int ), (int)215);
                if (var7_2) {
                    throw null;
                }
            }
            case 36: {
                var6_3 /* !! */  = (int)he.emjd("emvu", emja(int ), (int)216);
                if (!var7_2) ** GOTO lbl173
                throw null;
            }
lbl244:
            // 2 sources

            case 37: {
                var6_3 /* !! */  = (int)he.emjd("emvv", emja(int ), (int)217);
                if (!var7_2) ** GOTO lbl145
                throw null;
            }
lbl248:
            // 2 sources

            case 38: {
                var6_3 /* !! */  = (int)he.emjd("emvw", emja(int ), (int)218);
                if (!var7_2) ** GOTO lbl223
                throw null;
            }
            case 39: {
                var6_3 /* !! */  = (int)he.emjd("emvy", emja(int ), (int)219);
                if (!var7_2) ** GOTO lbl101
                throw null;
            }
            case 40: {
                var6_3 /* !! */  = (int)he.emjd("emwa", emja(int ), (int)220);
                if (!var7_2) ** GOTO lbl190
                throw null;
            }
lbl260:
            // 4 sources

            case 41: {
                do {
                    var6_3 /* !! */  = (int)he.emjd("emwf", emja(int ), (int)221);
                } while (!var7_2);
                throw null;
            }
            case 42: {
                var6_3 /* !! */  = (int)he.emjd("emwh", emja(int ), (int)222);
                if (!var7_2) ** GOTO lbl214
                throw null;
            }
lbl269:
            // 2 sources

            case 43: {
                var6_3 /* !! */  = (int)he.emjd("emwi", emja(int ), (int)223);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl290
            }
lbl274:
            // 3 sources

            case 44: {
                var6_3 /* !! */  = (int)he.emjd("emwj", emja(int ), (int)224);
                if (!var7_2) ** GOTO lbl154
                throw null;
            }
lbl278:
            // 2 sources

            case 45: {
                var6_3 /* !! */  = (int)he.emjd("emwk", emja(int ), (int)225);
                if (!var7_2) ** GOTO lbl164
                throw null;
            }
            case 46: {
                var6_3 /* !! */  = (int)he.emjd("emwl", emja(int ), (int)226);
                if (!var7_2) ** GOTO lbl76
                throw null;
            }
lbl286:
            // 2 sources

            case 47: {
                var6_3 /* !! */  = (int)he.emjd("emwn", emja(int ), (int)227);
                if (!var7_2) ** GOTO lbl126
                throw null;
            }
lbl290:
            // 3 sources

            case 48: {
                var6_3 /* !! */  = (int)he.emjd("emwt", emja(int ), (int)228);
                if (!var7_2) ** GOTO lbl227
                throw null;
            }
lbl294:
            // 3 sources

            case 49: {
                var6_3 /* !! */  = (int)he.emjd("emwv", emja(int ), (int)229);
                if (!var7_2) ** GOTO lbl269
                throw null;
            }
            case 50: 
        }
        var6_3 /* !! */  = (int)he.emjd("emww", emja(int ), (int)230);
        ** while (!var7_2)
lbl301:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void eoep() {
        he.emjb[200] = -1703400134;
        he.emjb[201] = -1145541838;
        he.emjb[202] = -939482729;
        he.emjb[203] = -27149911;
        he.emjb[204] = -743853725;
        he.emjb[205] = 17225327;
        he.emjb[206] = -1134318807;
        he.emjb[207] = 2021917032;
        he.emjb[208] = 680379496;
        he.emjb[209] = -1158200009;
        he.emjb[210] = -1017204838;
        he.emjb[211] = 282041099;
        he.emjb[212] = 1415953840;
        he.emjb[213] = 544297475;
        he.emjb[214] = -1394394021;
        he.emjb[215] = 446167444;
        he.emjb[216] = 104604421;
        he.emjb[217] = 461045357;
        he.emjb[218] = -939155476;
        he.emjb[219] = 1033630998;
        he.emjb[220] = -478292700;
        he.emjb[221] = 165417629;
        he.emjb[222] = 1964745644;
        he.emjb[223] = -1302474968;
        he.emjb[224] = 1801304196;
        he.emjb[225] = 1355616152;
        he.emjb[226] = -1414665243;
        he.emjb[227] = 2042405230;
        he.emjb[228] = -1375192309;
        he.emjb[229] = 1154825486;
        he.emjb[230] = -681968192;
        he.emjb[231] = 1798283458;
        he.emjb[232] = -210081633;
        he.emjb[233] = 1168932170;
        he.emjb[234] = -2008127092;
        he.emjb[235] = 1912930667;
        he.emjb[236] = 353458881;
        he.emjb[237] = -1979909676;
        he.emjb[238] = -762257;
        he.emjb[239] = -1193802756;
        he.emjb[240] = -204248100;
        he.emjb[241] = 1396590126;
        he.emjb[242] = -413856096;
        he.emjb[243] = 921025561;
        he.emjb[244] = 210363020;
        he.emjb[245] = -962730476;
        he.emjb[246] = 394344615;
        he.emjb[247] = 1364319082;
        he.emjb[248] = -579355017;
        he.emjb[249] = 1437379830;
        he.emjb[250] = -868579705;
        he.emjb[251] = -1911391838;
        he.emjb[252] = 912015841;
        he.emjb[253] = -1476306002;
        he.emjb[254] = 83714104;
        he.emjb[255] = 992110695;
        he.emjb[256] = 1816316056;
        he.emjb[257] = -1791864606;
        he.emjb[258] = 1857721664;
        he.emjb[259] = 1316289027;
        he.emjb[260] = -1898176331;
        he.emjb[261] = -809298076;
        he.emjb[262] = 877515140;
        he.emjb[263] = 729356825;
        he.emjb[264] = -1575725078;
        he.emjb[265] = -1138336387;
        he.emjb[266] = -1643483678;
        he.emjb[267] = 1011962111;
        he.emjb[268] = -1574333425;
        he.emjb[269] = -787242518;
        he.emjb[270] = 883698137;
        he.emjb[271] = 1545192202;
        he.emjb[272] = -732155813;
        he.emjb[273] = -244507260;
        he.emjb[274] = -344704784;
        he.emjb[275] = 1076867481;
        he.emjb[276] = 999986141;
        he.emjb[277] = 606418461;
        he.emjb[278] = -231601460;
        he.emjb[279] = -1244247008;
        he.emjb[280] = 1332411677;
        he.emjb[281] = 1853419827;
        he.emjb[282] = -1727227113;
        he.emjb[283] = -1333113379;
        he.emjb[284] = 972989242;
        he.emjb[285] = 104998087;
        he.emjb[286] = 210079704;
        he.emjb[287] = 359613598;
        he.emjb[288] = 91719671;
        he.emjb[289] = -10623291;
        he.emjb[290] = 829904274;
        he.emjb[291] = 553038388;
        he.emjb[292] = 1849536032;
        he.emjb[293] = 677246225;
        he.emjb[294] = -1890136728;
        he.emjb[295] = 2126257731;
        he.emjb[296] = -1819059174;
        he.emjb[297] = 1437933566;
        he.emjb[298] = -1829396358;
        he.emjb[299] = 489076520;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void restoreSlot() {
        block52: {
            block51: {
                while (true) {
                    if ((v0 /* !! */  = (cfr_temp_0 = he.la - he.emjd("enlk", emjp(int ), (int)172)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v0 /* !! */  == he.emjd("enll", emja(int ), (int)349)) break;
                    v0 /* !! */  = (long)he.emjd("enlm", emja(int ), (int)350);
                }
                var3_1 = he.c;
                v1 /* !! */  = he.la;
                if (true) ** GOTO lbl11
                block38: while (true) {
                    v1 /* !! */  = (long)(v2 - he.emjd("enln", emjp(int ), (int)173));
lbl11:
                    // 2 sources

                    switch ((int)v1 /* !! */ ) {
                        case -2038642252: {
                            v2 = he.emjd("enlo", emjp(int ), (int)174);
                            continue block38;
                        }
                        case -195102618: {
                            break block38;
                        }
                        case 177595400: {
                            v2 = he.emjd("enlp", emjp(int ), (int)175);
                            continue block38;
                        }
                        case 1941750003: {
                            v2 = he.emjd("enlq", emjp(int ), (int)176);
                            continue block38;
                        }
                    }
                    break;
                }
                var2_2 = he.b;
                v3 /* !! */  = he.la;
                if (true) ** GOTO lbl28
                block39: while (true) {
                    v3 /* !! */  = (long)(v4 - he.emjd("enlr", emjp(int ), (int)177));
lbl28:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1247534180: {
                            v4 = he.emjd("enls", emjp(int ), (int)178);
                            continue block39;
                        }
                        case -238726052: {
                            v4 = he.emjd("enlt", emjp(int ), (int)179);
                            continue block39;
                        }
                        case -195102618: {
                            break block39;
                        }
                        case -51773137: {
                            v4 = he.emjd("enlu", emjp(int ), (int)180);
                            continue block39;
                        }
                    }
                    break;
                }
                var1_3 = he.a;
                if (var3_1) {
                    throw null;
lbl43:
                    // 10 sources

                    return;
                }
                if (var1_3 || var1_3) ** GOTO lbl43
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = he.la - he.emjd("enlv", emjp(int ), (int)181)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == he.emjd("enlw", emja(int ), (int)351)) break;
                    v5 /* !! */  = (long)he.emjd("enlx", emja(int ), (int)352);
                }
                if (!this.needSync) break block51;
                if (var1_3) ** GOTO lbl43
                v6 /* !! */  = he.la;
                if (true) ** GOTO lbl57
                block42: while (true) {
                    v6 /* !! */  = (long)(v7 - he.emjd("enly", emjp(int ), (int)182));
lbl57:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1556346741: {
                            v7 = he.emjd("enlz", emjp(int ), (int)183);
                            continue block42;
                        }
                        case -594771359: {
                            v7 = he.emjd("enma", emjp(int ), (int)184);
                            continue block42;
                        }
                        case -195102618: {
                            break block42;
                        }
                    }
                    break;
                }
                if (this.oldSlot == he.emjd("enmc", emja(int ), (int)353)) break block51;
                if (var1_3) ** GOTO lbl43
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_2 = he.la - he.emjd("enmd", emjp(int ), (int)185)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == he.emjd("enme", emja(int ), (int)354)) break;
                    v8 /* !! */  = (long)he.emjd("enmf", emja(int ), (int)355);
                }
                v9 /* !! */  = he.la;
                if (true) ** GOTO lbl77
                block44: while (true) {
                    v9 /* !! */  = (long)(v10 - he.emjd("enmg", emjp(int ), (int)186));
lbl77:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -1947158107: {
                            v10 = he.emjd("enmh", emjp(int ), (int)187);
                            continue block44;
                        }
                        case -195102618: {
                            break block44;
                        }
                        case -1222294: {
                            v10 = he.emjd("enmi", emjp(int ), (int)188);
                            continue block44;
                        }
                    }
                    break;
                }
                if (he.mc.field_1724 != null) break block52;
                if (var1_3) ** GOTO lbl43
            }
            if (var1_3 || var1_3) ** GOTO lbl43
            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl43
        v11 /* !! */  = he.la;
        if (true) ** GOTO lbl97
        block45: while (true) {
            v11 /* !! */  = (long)(v12 - he.emjd("enmj", emjp(int ), (int)189));
lbl97:
            // 2 sources

            switch ((int)v11 /* !! */ ) {
                case -1365595336: {
                    v12 = he.emjd("enmk", emjp(int ), (int)190);
                    continue block45;
                }
                case -195102618: {
                    break block45;
                }
                case -102135944: {
                    v12 = he.emjd("enml", emjp(int ), (int)191);
                    continue block45;
                }
                case 184717618: {
                    v12 = he.emjd("enmm", emjp(int ), (int)192);
                    continue block45;
                }
            }
            break;
        }
        while (true) {
            if ((v13 /* !! */  = (cfr_temp_3 = he.la - he.emjd("enmn", emjp(int ), (int)193)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v13 /* !! */  == he.emjd("enmo", emja(int ), (int)356)) break;
            v13 /* !! */  = (long)he.emjd("enmp", emja(int ), (int)357);
        }
        nv.selectSlot(this.oldSlot);
        if (var1_3 || var1_3) ** GOTO lbl43
        v14 /* !! */  = he.la;
        if (true) ** GOTO lbl120
        block47: while (true) {
            v14 /* !! */  = (long)(he.emjd("enms", emjp(int ), (int)195) - he.emjd("enmq", emjp(int ), (int)194));
lbl120:
            // 2 sources

            switch ((int)v14 /* !! */ ) {
                case -195102618: {
                    break block47;
                }
                case -153361376: {
                    continue block47;
                }
            }
            break;
        }
        nv.updateSlots();
        if (var1_3 || var1_3) ** GOTO lbl43
        v15 = he.emjd("enmt", emja(int ), (int)358);
        while (true) {
            if ((v16 /* !! */  = (cfr_temp_4 = he.la - he.emjd("enmv", emjp(int ), (int)196)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v16 /* !! */  == he.emjd("enmw", emja(int ), (int)359)) break;
            v16 /* !! */  = (long)he.emjd("enmx", emja(int ), (int)360);
        }
        this.needSync = v15;
        if (var1_3 || var1_3) ** GOTO lbl43
        v17 = he.emjd("enmy", emja(int ), (int)361);
        v18 /* !! */  = he.la;
        if (true) ** GOTO lbl140
        block49: while (true) {
            v18 /* !! */  = (long)(v19 - he.emjd("enmz", emjp(int ), (int)197));
lbl140:
            // 2 sources

            switch ((int)v18 /* !! */ ) {
                case -195102618: {
                    break block49;
                }
                case -116308954: {
                    v19 = he.emjd("enna", emjp(int ), (int)198);
                    continue block49;
                }
                case 229549742: {
                    v19 = he.emjd("ennb", emjp(int ), (int)199);
                    continue block49;
                }
            }
            break;
        }
        this.oldSlot = (int)v17;
        if (!var1_3 && !var1_3) ** break;
        ** while (true)
    }

    private static /* synthetic */ void eoet() {
        he.emjb[600] = -732537511;
        he.emjb[601] = -55999700;
        he.emjb[602] = 1731951495;
        he.emjb[603] = -516013341;
        he.emjb[604] = 1051761818;
        he.emjb[605] = 1676468470;
        he.emjb[606] = 1209680553;
        he.emjb[607] = -2092672262;
        he.emjb[608] = -2066181990;
        he.emjb[609] = -1165356102;
        he.emjb[610] = 1761018525;
        he.emjb[611] = -1992243165;
        he.emjb[612] = -992015008;
        he.emjb[613] = 473873340;
        he.emjb[614] = 2106778934;
        he.emjb[615] = 1687379555;
        he.emjb[616] = 681133890;
        he.emjb[617] = 1747020007;
        he.emjb[618] = 421685271;
        he.emjb[619] = -1716275459;
        he.emjb[620] = 1531149633;
        he.emjb[621] = -1001273897;
        he.emjb[622] = 1231543608;
        he.emjb[623] = -887165869;
        he.emjb[624] = 1378817352;
        he.emjb[625] = 989882490;
        he.emjb[626] = -1169351836;
        he.emjb[627] = 1091115669;
        he.emjb[628] = 639555910;
        he.emjb[629] = -1159858289;
        he.emjb[630] = 242955165;
        he.emjb[631] = -522432337;
        he.emjb[632] = 396787874;
        he.emjb[633] = 899369766;
        he.emjb[634] = -1511164138;
        he.emjb[635] = -699136537;
        he.emjb[636] = -29555493;
    }

    static {
        emjc = new int[637];
        he.eoen();
        he.eoeo();
        he.eoep();
        he.eoeq();
        he.eoer();
        he.eoes();
        he.eoet();
        he.eoeu();
        he.eoev();
        he.eoew();
        he.eoex();
        he.eoey();
        he.eoez();
        he.eofa();
        emjq = new long[364];
        emjr = new long[364];
        he.eofb();
        he.eofc();
        he.eofd();
        he.eofe();
        he.eoff();
        he.eofg();
        he.eofh();
        he.eofi();
    }

    private static /* synthetic */ void eofd() {
        he.emjq[200] = -6963832782326710222L;
        he.emjq[201] = 7806152991060789004L;
        he.emjq[202] = -1219851756875531876L;
        he.emjq[203] = 2751792857067101720L;
        he.emjq[204] = 7183309990710419612L;
        he.emjq[205] = -1304911454381696790L;
        he.emjq[206] = -7481476027002163268L;
        he.emjq[207] = 2901245617211191135L;
        he.emjq[208] = 1206660362837296106L;
        he.emjq[209] = 1039494890111916602L;
        he.emjq[210] = -8138862642555111352L;
        he.emjq[211] = 4352765957224178224L;
        he.emjq[212] = -2949347159601995679L;
        he.emjq[213] = 1132307261313918742L;
        he.emjq[214] = 397537730647767463L;
        he.emjq[215] = 6671245708178376919L;
        he.emjq[216] = 1504871443270650708L;
        he.emjq[217] = 9001748681916170505L;
        he.emjq[218] = 4200877513763390207L;
        he.emjq[219] = 3254824627911686459L;
        he.emjq[220] = 4601883327881872402L;
        he.emjq[221] = 4572975212213579305L;
        he.emjq[222] = -396401578020892513L;
        he.emjq[223] = -4812154150281091444L;
        he.emjq[224] = 5590901856180847381L;
        he.emjq[225] = 252452174171401993L;
        he.emjq[226] = 4959637228072533959L;
        he.emjq[227] = 6989176598902639608L;
        he.emjq[228] = 70703290732147735L;
        he.emjq[229] = -6108197652134181000L;
        he.emjq[230] = 4906066524563296900L;
        he.emjq[231] = -8399156783916240973L;
        he.emjq[232] = -1443652178990439631L;
        he.emjq[233] = 8178595853211789428L;
        he.emjq[234] = 473275395631982292L;
        he.emjq[235] = 7162043181534777685L;
        he.emjq[236] = -8394552553008106406L;
        he.emjq[237] = 572328413706354225L;
        he.emjq[238] = -4442953515154082945L;
        he.emjq[239] = -7212167393137052598L;
        he.emjq[240] = 7978915776533761398L;
        he.emjq[241] = 249584280399275046L;
        he.emjq[242] = 3313734058944352529L;
        he.emjq[243] = -4152269285213266379L;
        he.emjq[244] = 6463445229222404462L;
        he.emjq[245] = 4864348788288204583L;
        he.emjq[246] = -3858906882028626593L;
        he.emjq[247] = 3652665729669988189L;
        he.emjq[248] = -9073086477860710534L;
        he.emjq[249] = -8800488646233727109L;
        he.emjq[250] = -6744089972411539824L;
        he.emjq[251] = 8465649468515414060L;
        he.emjq[252] = 7153634166197504505L;
        he.emjq[253] = -947409182517758053L;
        he.emjq[254] = -3336773635836968418L;
        he.emjq[255] = -9143270755463501311L;
        he.emjq[256] = -6055313728620091897L;
        he.emjq[257] = -188616894269559221L;
        he.emjq[258] = 3602754216841197196L;
        he.emjq[259] = -3806097499195714970L;
        he.emjq[260] = 8045190248226970966L;
        he.emjq[261] = -7895350676899273489L;
        he.emjq[262] = -3398937616067900066L;
        he.emjq[263] = 8409818815539456876L;
        he.emjq[264] = -7399349458577232331L;
        he.emjq[265] = -4752293441968950680L;
        he.emjq[266] = -1593303748026024995L;
        he.emjq[267] = 8651893610076194648L;
        he.emjq[268] = 1509932189804904703L;
        he.emjq[269] = -3877314311657753292L;
        he.emjq[270] = 8816301810878447900L;
        he.emjq[271] = -6153973449043275481L;
        he.emjq[272] = 3505421393672697255L;
        he.emjq[273] = -5977461679542439749L;
        he.emjq[274] = 3314404401632270057L;
        he.emjq[275] = 6269426047451835467L;
        he.emjq[276] = -7700169609879400783L;
        he.emjq[277] = 8172766594809624586L;
        he.emjq[278] = 2025629600253066784L;
        he.emjq[279] = -7611766456998516984L;
        he.emjq[280] = -378215019712237282L;
        he.emjq[281] = 2416880587218739007L;
        he.emjq[282] = -2623906998041407315L;
        he.emjq[283] = -1672515871308566743L;
        he.emjq[284] = 7024814687655717343L;
        he.emjq[285] = 2757990517879275022L;
        he.emjq[286] = -4641923267012429542L;
        he.emjq[287] = -6147172977344201944L;
        he.emjq[288] = 556334020666793082L;
        he.emjq[289] = 8332761970893981926L;
        he.emjq[290] = 6028505587416644604L;
        he.emjq[291] = 6591966070733420801L;
        he.emjq[292] = 4114207118429459099L;
        he.emjq[293] = -6840349313334846501L;
        he.emjq[294] = -698003451515408988L;
        he.emjq[295] = 3042585489832860690L;
        he.emjq[296] = -3884319395967137639L;
        he.emjq[297] = -1977615577229429138L;
        he.emjq[298] = 1419073139675515420L;
        he.emjq[299] = 158357282379764487L;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    @Override
    public void deactivate() {
        Object object = la;
        boolean bl2 = true;
        block36: while (true) {
            CallSite callSite;
            if (!bl2 || (bl2 = false) || !true) {
                object = callSite - he.emjd("emjs", emjp(int ), (int)0);
            }
            switch ((int)object) {
                case -1354850059: {
                    callSite = he.emjd("emjt", emjp(int ), (int)1);
                    continue block36;
                }
                case -195102618: {
                    break block36;
                }
                case 1675739960: {
                    callSite = he.emjd("emju", emjp(int ), (int)2);
                    continue block36;
                }
            }
            break;
        }
        boolean bl3 = c;
        while (true) {
            long l2;
            Object object2;
            if ((object2 = (l2 = la - he.emjd("emjv", emjp(int ), (int)3)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object2 == he.emjd("emjw", emja(int ), (int)11)) break;
            object2 = he.emjd("emjx", emja(int ), (int)12);
        }
        int n2 = b;
        Object object3 = la;
        block38: while (true) {
            switch ((int)object3) {
                case -765649280: {
                    object3 = he.emjd("emjz", emjp(int ), (int)5) - he.emjd("emjy", emjp(int ), (int)4);
                    continue block38;
                }
                case -195102618: {
                    break block38;
                }
            }
            break;
        }
        boolean bl4 = a;
        if (bl3) {
            throw null;
        }
        if (bl4 || bl4) return;
        Object object4 = la;
        block39: while (true) {
            switch ((int)object4) {
                case -195102618: {
                    break block39;
                }
                case 853601878: {
                    object4 = he.emjd("emkb", emjp(int ), (int)7) - he.emjd("emka", emjp(int ), (int)6);
                    continue block39;
                }
            }
            break;
        }
        this.restoreSlot();
        if (bl4 || bl4) return;
        while (true) {
            long l3;
            Object object5;
            if ((object5 = (l3 = la - he.emjd("emkc", emjp(int ), (int)8)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object5 == he.emjd("emkd", emja(int ), (int)13)) {
                this.targetPos = null;
                if (bl4) return;
                break;
            }
            object5 = he.emjd("emke", emja(int ), (int)14);
        }
        if (bl4) return;
        while (true) {
            long l4;
            Object object6;
            if ((object6 = (l4 = la - he.emjd("emkf", emjp(int ), (int)9)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            if (object6 == he.emjd("emkg", emja(int ), (int)15)) {
                this.waitingObsidian = null;
                if (bl4) return;
                break;
            }
            object6 = he.emjd("emkh", emja(int ), (int)16);
        }
        if (bl4) return;
        CallSite callSite = he.emjd("emki", emja(int ), (int)17);
        while (true) {
            long l5;
            Object object7;
            if ((object7 = (l5 = la - he.emjd("emkj", emjp(int ), (int)10)) == 0L ? 0 : (l5 < 0L ? -1 : 1)) == false) continue;
            if (object7 == he.emjd("emkk", emja(int ), (int)18)) {
                this.targetSlot = (int)callSite;
                if (bl4) return;
                break;
            }
            object7 = he.emjd("emkl", emja(int ), (int)19);
        }
        if (bl4) return;
        CallSite callSite2 = he.emjd("emkm", emja(int ), (int)20);
        while (true) {
            long l6;
            Object object8;
            if ((object8 = (l6 = la - he.emjd("emkn", emjp(int ), (int)11)) == 0L ? 0 : (l6 < 0L ? -1 : 1)) == false) continue;
            if (object8 == he.emjd("emko", emja(int ), (int)21)) {
                this.oldSlot = (int)callSite2;
                if (bl4) return;
                break;
            }
            object8 = he.emjd("emkp", emja(int ), (int)22);
        }
        if (bl4) return;
        CallSite callSite3 = he.emjd("emkq", emja(int ), (int)23);
        Object object9 = la;
        boolean bl5 = true;
        block44: while (true) {
            CallSite callSite4;
            if (!bl5 || (bl5 = false) || !true) {
                object9 = callSite4 - he.emjd("emkr", emjp(int ), (int)12);
            }
            switch ((int)object9) {
                case -203840881: {
                    callSite4 = he.emjd("emks", emjp(int ), (int)13);
                    continue block44;
                }
                case -195102618: {
                    break block44;
                }
                case 38522509: {
                    callSite4 = he.emjd("emkt", emjp(int ), (int)14);
                    continue block44;
                }
            }
            break;
        }
        this.waitingTicks = (int)callSite3;
        if (bl4 || bl4) return;
        CallSite callSite5 = he.emjd("emku", emja(int ), (int)24);
        Object object10 = la;
        boolean bl6 = true;
        block45: while (true) {
            CallSite callSite6;
            if (!bl6 || (bl6 = false) || !true) {
                object10 = callSite6 - he.emjd("emkv", emjp(int ), (int)15);
            }
            switch ((int)object10) {
                case -326185591: {
                    callSite6 = he.emjd("emkw", emjp(int ), (int)16);
                    continue block45;
                }
                case -195102618: {
                    break block45;
                }
                case 1072780956: {
                    callSite6 = he.emjd("emkx", emjp(int ), (int)17);
                    continue block45;
                }
            }
            break;
        }
        this.needSync = callSite5;
        if (bl4 || bl4) return;
        CallSite callSite7 = he.emjd("emky", emjp(int ), (int)18);
        Object object11 = la;
        block46: while (true) {
            switch ((int)object11) {
                case -1779100537: {
                    object11 = he.emjd("emla", emjp(int ), (int)20) - he.emjd("emkz", emjp(int ), (int)19);
                    continue block46;
                }
                case -195102618: {
                    break block46;
                }
            }
            break;
        }
        this.placeAt = (long)callSite7;
        if (bl4 || bl4) return;
        CallSite callSite8 = he.emjd("emlb", emja(int ), (int)25);
        Object object12 = la;
        block47: while (true) {
            switch ((int)object12) {
                case -2011854778: {
                    object12 = he.emjd("emld", emjp(int ), (int)22) - he.emjd("emlc", emjp(int ), (int)21);
                    continue block47;
                }
                case -195102618: {
                    break block47;
                }
            }
            break;
        }
        this.useWasPressed = callSite8;
        if (bl4 || bl4) return;
        Object object13 = la;
        boolean bl7 = true;
        block48: while (true) {
            CallSite callSite9;
            if (!bl7 || (bl7 = false) || !true) {
                object13 = callSite9 - he.emjd("emle", emjp(int ), (int)23);
            }
            switch ((int)object13) {
                case -195102618: {
                    break block48;
                }
                case 3033560: {
                    callSite9 = he.emjd("emlf", emjp(int ), (int)24);
                    continue block48;
                }
                case 1755388238: {
                    callSite9 = he.emjd("emlg", emjp(int ), (int)25);
                    continue block48;
                }
            }
            break;
        }
        this.crystalArea = null;
        if (bl4 || bl4) return;
        CallSite callSite10 = he.emjd("emlh", emja(int ), (int)26);
        while (true) {
            long l7;
            Object object14;
            if ((object14 = (l7 = la - he.emjd("emli", emjp(int ), (int)26)) == 0L ? 0 : (l7 < 0L ? -1 : 1)) == false) continue;
            if (object14 == he.emjd("emlj", emja(int ), (int)27)) {
                this.crystalAttackTicks = (int)callSite10;
                if (bl4) return;
                break;
            }
            object14 = he.emjd("emlk", emja(int ), (int)28);
        }
        if (!bl4) return;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ boolean lambda$hasCrystalAt$1(class_1297 var0) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = he.la - he.emjd("eodm", emjp(int ), (int)353)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == he.emjd("eodn", emja(int ), (int)621)) break;
            v0 /* !! */  = (long)he.emjd("eodo", emja(int ), (int)622);
        }
        var3_1 = he.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = he.la - he.emjd("eodp", emjp(int ), (int)354)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == he.emjd("eodq", emja(int ), (int)623)) break;
            v1 /* !! */  = (long)he.emjd("eodr", emja(int ), (int)624);
        }
        var2_2 /* !! */  = he.b;
        v2 /* !! */  = he.la;
        if (true) ** GOTO lbl19
        block13: while (true) {
            v2 /* !! */  = (long)(v3 - he.emjd("eods", emjp(int ), (int)355));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -195102618: {
                    break block13;
                }
                case 183789316: {
                    v3 = he.emjd("eodt", emjp(int ), (int)356);
                    continue block13;
                }
                case 1411030068: {
                    v3 = he.emjd("eodu", emjp(int ), (int)357);
                    continue block13;
                }
            }
            break;
        }
        var1_3 = he.a;
        if (var3_1) {
            throw null;
            return (boolean)he.emjd("eodv", emja(int ), (int)625);
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** continue;
                return var0 instanceof class_1511;
            }
            case 0: {
                do {
                    var2_2 /* !! */  = (int)he.emjd("eodw", emja(int ), (int)626);
                } while (!var3_1);
                throw null;
            }
            case 1: {
                do {
                    var2_2 /* !! */  = (int)he.emjd("eodx", emja(int ), (int)627);
                } while (!var3_1);
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)he.emjd("eody", emja(int ), (int)628);
                if (!var3_1) break;
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)he.emjd("eodz", emja(int ), (int)629);
        } while (!var3_1);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean isProtected(class_238 var1_1) {
        var7_2 = he.c;
        var6_3 /* !! */  = he.b;
        var5_4 = he.a;
        if (var7_2) {
            throw null;
lbl6:
            // 24 sources

            return (boolean)he.emjd("enzw", emja(int ), (int)527);
        }
        if (var5_4 || var5_4) ** GOTO lbl6
        if (!this.protect.isSelected(this.protect.getList().get((int)he.emjd("enzx", emja(int ), (int)528)))) ** GOTO lbl36
        if (var5_4 || var5_4) ** GOTO lbl6
        var2_5 = he.mc.field_1687.method_18456().iterator();
        if (var5_4) ** GOTO lbl6
        block44: while (true) {
            block84: {
                if (var5_4 || var5_4) ** GOTO lbl6
                if (!var2_5.hasNext()) ** GOTO lbl36
                if (var5_4) ** GOTO lbl6
                var3_6 = (class_742)var2_5.next();
                if (var5_4 || var5_4) ** GOTO lbl6
                if (var3_6 == he.mc.field_1724) break block84;
                if (var5_4) ** GOTO lbl6
                if (!var3_6.method_5805()) break block84;
                if (var5_4) ** GOTO lbl6
                if (!dl.isFriend((class_1297)var3_6)) break block84;
                if (var5_4) ** GOTO lbl6
                if (!var1_1.method_994(var3_6.method_5829())) break block84;
                if (var5_4 || var5_4) ** GOTO lbl6
                return (boolean)he.emjd("enzy", emja(int ), (int)529);
            }
            if (var5_4) ** GOTO lbl6
            if (var6_3 /* !! */  == 0) ** GOTO lbl-1000
            switch (var6_3 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var5_4) ** GOTO lbl6
                    if (!var7_2) continue block44;
                    throw null;
                }
lbl36:
                // 2 sources

                if (var5_4 || var5_4) ** GOTO lbl6
                if (!this.protect.isSelected(this.protect.getList().get((int)he.emjd("enzz", emja(int ), (int)530)))) ** GOTO lbl59
                if (var5_4 || var5_4) ** GOTO lbl6
                var2_5 = he.mc.field_1687.method_18112().iterator();
                if (var5_4) ** GOTO lbl6
                do {
                    if (var5_4 || var5_4) ** GOTO lbl6
                    if (!var2_5.hasNext()) ** GOTO lbl59
                    if (var5_4) ** GOTO lbl6
                    var3_6 = (class_1297)var2_5.next();
                    if (var5_4 || var5_4) ** GOTO lbl6
                    if (!(var3_6 instanceof class_1542)) ** GOTO lbl56
                    if (var5_4) ** GOTO lbl6
                    var4_7 = (class_1542)var3_6;
                    if (var5_4 || var5_4) ** GOTO lbl6
                    if (!var1_1.method_994(var4_7.method_5829())) ** GOTO lbl56
                    if (var5_4) ** GOTO lbl6
                    if (!he.isProtectedResource(var4_7.method_6983())) ** GOTO lbl56
                    if (var5_4 || var5_4) ** GOTO lbl6
                    return (boolean)he.emjd("eoaa", emja(int ), (int)531);
lbl56:
                    // 3 sources

                    if (var5_4 || var5_4) ** GOTO lbl6
                } while (!var7_2);
                throw null;
lbl59:
                // 2 sources

                if (!var5_4 && !var5_4) ** break;
                ** continue;
                return (boolean)he.emjd("eoab", emja(int ), (int)532);
lbl62:
                // 2 sources

                case 0: {
                    var6_3 /* !! */  = (int)he.emjd("eoac", emja(int ), (int)533);
                    if (var7_2) {
                        throw null;
                    }
                    ** GOTO lbl111
                }
lbl67:
                // 2 sources

                case 1: {
                    var6_3 /* !! */  = (int)he.emjd("eoad", emja(int ), (int)534);
                    if (var7_2) {
                        throw null;
                    }
                    ** GOTO lbl188
                }
lbl72:
                // 2 sources

                case 2: {
                    var6_3 /* !! */  = (int)he.emjd("eoae", emja(int ), (int)535);
                    if (var7_2) {
                        throw null;
                    }
                    ** GOTO lbl153
                }
lbl77:
                // 2 sources

                case 3: {
                    var6_3 /* !! */  = (int)he.emjd("eoaf", emja(int ), (int)536);
                    if (var7_2) {
                        throw null;
                    }
                    ** GOTO lbl153
                }
                case 4: {
                    var6_3 /* !! */  = (int)he.emjd("eoag", emja(int ), (int)537);
                    if (var7_2) {
                        throw null;
                    }
                    ** GOTO lbl153
                }
lbl87:
                // 2 sources

                case 5: {
                    var6_3 /* !! */  = (int)he.emjd("eoah", emja(int ), (int)538);
                    if (var7_2) {
                        throw null;
                    }
                    ** GOTO lbl116
                }
                case 6: {
                    var6_3 /* !! */  = (int)he.emjd("eoai", emja(int ), (int)539);
                    if (var7_2) {
                        throw null;
                    }
                    ** GOTO lbl140
                }
                case 7: {
                    var6_3 /* !! */  = (int)he.emjd("eoaj", emja(int ), (int)540);
                    if (var7_2) {
                        throw null;
                    }
                    ** GOTO lbl162
                }
lbl102:
                // 2 sources

                case 8: {
                    var6_3 /* !! */  = (int)he.emjd("eoak", emja(int ), (int)541);
                    if (var7_2) {
                        throw null;
                    }
                    ** GOTO lbl224
                }
lbl107:
                // 3 sources

                case 9: {
                    var6_3 /* !! */  = (int)he.emjd("eoal", emja(int ), (int)542);
                    if (!var7_2) ** GOTO lbl72
                    throw null;
                }
lbl111:
                // 5 sources

                case 10: {
                    var6_3 /* !! */  = (int)he.emjd("eoam", emja(int ), (int)543);
                    if (var7_2) {
                        throw null;
                    }
                    ** GOTO lbl175
                }
lbl116:
                // 2 sources

                case 11: {
                    var6_3 /* !! */  = (int)he.emjd("eoan", emja(int ), (int)544);
                    if (var7_2) {
                        throw null;
                    }
                    ** GOTO lbl171
                }
                case 12: {
                    var6_3 /* !! */  = (int)he.emjd("eoao", emja(int ), (int)545);
                    if (var7_2) {
                        throw null;
                    }
                    ** GOTO lbl167
                }
                case 13: {
                    var6_3 /* !! */  = (int)he.emjd("eoap", emja(int ), (int)546);
                    if (var7_2) {
                        throw null;
                    }
                    ** GOTO lbl206
                }
lbl131:
                // 2 sources

                case 14: {
                    var6_3 /* !! */  = (int)he.emjd("eoaq", emja(int ), (int)547);
                    if (!var7_2) ** GOTO lbl107
                    throw null;
                }
lbl135:
                // 2 sources

                case 15: {
                    var6_3 /* !! */  = (int)he.emjd("eoar", emja(int ), (int)548);
                    if (var7_2) {
                        throw null;
                    }
                    ** GOTO lbl184
                }
lbl140:
                // 3 sources

                case 16: {
                    var6_3 /* !! */  = (int)he.emjd("eoas", emja(int ), (int)549);
                    if (!var7_2) ** GOTO lbl77
                    throw null;
                }
                case 17: {
                    do {
                        var6_3 /* !! */  = (int)he.emjd("eoat", emja(int ), (int)550);
                    } while (!var7_2);
                    throw null;
                }
                case 18: {
                    var6_3 /* !! */  = (int)he.emjd("eoau", emja(int ), (int)551);
                    if (!var7_2) ** GOTO lbl107
                    throw null;
                }
lbl153:
                // 4 sources

                case 19: {
                    var6_3 /* !! */  = (int)he.emjd("eoav", emja(int ), (int)552);
                    if (var7_2) {
                        throw null;
                    }
                    ** GOTO lbl236
                }
lbl158:
                // 2 sources

                case 20: {
                    var6_3 /* !! */  = (int)he.emjd("eoaw", emja(int ), (int)553);
                    if (!var7_2) ** GOTO lbl140
                    throw null;
                }
lbl162:
                // 2 sources

                case 21: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var6_3 /* !! */  = (int)he.emjd("eoax", emja(int ), (int)554);
                        if (!var7_2) ** GOTO lbl131
                        throw null;
                    }
                }
lbl167:
                // 2 sources

                case 22: {
                    var6_3 /* !! */  = (int)he.emjd("eoay", emja(int ), (int)555);
                    if (var7_2) {
                        throw null;
                    }
                }
lbl171:
                // 4 sources

                case 23: {
                    var6_3 /* !! */  = (int)he.emjd("eoaz", emja(int ), (int)556);
                    if (!var7_2) break block44;
                    throw null;
                }
lbl175:
                // 2 sources

                case 24: {
                    do {
                        var6_3 /* !! */  = (int)he.emjd("eoba", emja(int ), (int)557);
                    } while (!var7_2);
                    throw null;
                }
                case 25: {
                    var6_3 /* !! */  = (int)he.emjd("eobb", emja(int ), (int)558);
                    if (!var7_2) ** GOTO lbl111
                    throw null;
                }
lbl184:
                // 2 sources

                case 26: {
                    var6_3 /* !! */  = (int)he.emjd("eobc", emja(int ), (int)559);
                    if (!var7_2) ** GOTO lbl158
                    throw null;
                }
lbl188:
                // 3 sources

                case 27: {
                    var6_3 /* !! */  = (int)he.emjd("eobd", emja(int ), (int)560);
                    if (var7_2) {
                        throw null;
                    }
                    ** GOTO lbl240
                }
                case 28: {
                    var6_3 /* !! */  = (int)he.emjd("eobe", emja(int ), (int)561);
                    if (!var7_2) ** GOTO lbl102
                    throw null;
                }
                case 29: {
                    var6_3 /* !! */  = (int)he.emjd("eobf", emja(int ), (int)562);
                    if (!var7_2) ** GOTO lbl188
                    throw null;
                }
                case 30: {
                    var6_3 /* !! */  = (int)he.emjd("eobg", emja(int ), (int)563);
                    if (var7_2) {
                        throw null;
                    }
                    ** GOTO lbl228
                }
lbl206:
                // 2 sources

                case 31: {
                    var6_3 /* !! */  = (int)he.emjd("eobh", emja(int ), (int)564);
                    if (!var7_2) ** GOTO lbl111
                    throw null;
                }
                case 32: {
                    var6_3 /* !! */  = (int)he.emjd("eobi", emja(int ), (int)565);
                    if (var7_2) {
                        throw null;
                    }
                    ** GOTO lbl224
                }
                case 33: {
                    var6_3 /* !! */  = (int)he.emjd("eobj", emja(int ), (int)566);
                    if (!var7_2) ** GOTO lbl87
                    throw null;
                }
                case 34: {
                    var6_3 /* !! */  = (int)he.emjd("eobk", emja(int ), (int)567);
                    if (var7_2) {
                        throw null;
                    }
                    ** GOTO lbl228
                }
lbl224:
                // 3 sources

                case 35: {
                    var6_3 /* !! */  = (int)he.emjd("eobl", emja(int ), (int)568);
                    if (var7_2) {
                        throw null;
                    }
                }
lbl228:
                // 5 sources

                case 36: {
                    var6_3 /* !! */  = (int)he.emjd("eobm", emja(int ), (int)569);
                    if (!var7_2) ** GOTO lbl67
                    throw null;
                }
                case 37: {
                    var6_3 /* !! */  = (int)he.emjd("eobn", emja(int ), (int)570);
                    if (!var7_2) ** GOTO lbl62
                    throw null;
                }
lbl236:
                // 2 sources

                case 38: {
                    var6_3 /* !! */  = (int)he.emjd("eobo", emja(int ), (int)571);
                    if (!var7_2) ** GOTO lbl111
                    throw null;
                }
lbl240:
                // 2 sources

                case 39: {
                    var6_3 /* !! */  = (int)he.emjd("eobp", emja(int ), (int)572);
                    if (!var7_2) ** GOTO lbl135
                    throw null;
                }
                case 40: 
            }
            break;
        }
        var6_3 /* !! */  = (int)he.emjd("eobq", emja(int ), (int)573);
        ** while (!var7_2)
lbl247:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void eofa() {
        he.emjc[600] = -732537487;
        he.emjc[601] = -55999697;
        he.emjc[602] = 1731951520;
        he.emjc[603] = -516013343;
        he.emjc[604] = 1051761793;
        he.emjc[605] = 1676468435;
        he.emjc[606] = 1209680573;
        he.emjc[607] = -2092672302;
        he.emjc[608] = -2066181958;
        he.emjc[609] = -1165356102;
        he.emjc[610] = 1761018502;
        he.emjc[611] = -1992243147;
        he.emjc[612] = -992015001;
        he.emjc[613] = 473873325;
        he.emjc[614] = 2106778910;
        he.emjc[615] = 1687379552;
        he.emjc[616] = 681133919;
        he.emjc[617] = 1747020021;
        he.emjc[618] = 421685261;
        he.emjc[619] = -1716275457;
        he.emjc[620] = 1531149633;
        he.emjc[621] = 1001273896;
        he.emjc[622] = 1030709249;
        he.emjc[623] = 887165868;
        he.emjc[624] = -1554907229;
        he.emjc[625] = 989882490;
        he.emjc[626] = -1169351836;
        he.emjc[627] = 1091115671;
        he.emjc[628] = 639555910;
        he.emjc[629] = -1159858289;
        he.emjc[630] = -242955166;
        he.emjc[631] = 92458333;
        he.emjc[632] = 396787874;
        he.emjc[633] = 899369765;
        he.emjc[634] = -1511164137;
        he.emjc[635] = -699136538;
        he.emjc[636] = -29555494;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean isProtected(class_2338 var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = he.la - he.emjd("enys", emjp(int ), (int)336)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == he.emjd("enyt", emja(int ), (int)514)) break;
            v0 /* !! */  = (long)he.emjd("enyu", emja(int ), (int)515);
        }
        var4_2 = he.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = he.la - he.emjd("enyv", emjp(int ), (int)337)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == he.emjd("enyw", emja(int ), (int)516)) break;
            v1 /* !! */  = (long)he.emjd("enyx", emja(int ), (int)517);
        }
        var3_3 /* !! */  = he.b;
        v2 /* !! */  = he.la;
        if (true) ** GOTO lbl17
        block28: while (true) {
            v2 /* !! */  = (long)(he.emjd("enyz", emjp(int ), (int)339) - he.emjd("enyy", emjp(int ), (int)338));
lbl17:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1822322134: {
                    continue block28;
                }
                case -195102618: {
                    break block28;
                }
            }
            break;
        }
        var2_4 = he.a;
        if (!var4_2) ** GOTO lbl29
        throw null;
        {
            if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
            switch (var3_3 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return (boolean)he.emjd("enza", emja(int ), (int)518);
                }
lbl29:
                // 1 sources

                if (var2_4 || var2_4) continue block29;
                v3 /* !! */  = he.la;
                if (true) ** GOTO lbl34
                block30: while (true) {
                    v3 /* !! */  = (long)(v4 - he.emjd("enzb", emjp(int ), (int)340));
lbl34:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1360449337: {
                            v4 = he.emjd("enzc", emjp(int ), (int)341);
                            continue block30;
                        }
                        case -195102618: {
                            break block30;
                        }
                        case 646337075: {
                            v4 = he.emjd("enzd", emjp(int ), (int)342);
                            continue block30;
                        }
                    }
                    break;
                }
                v5 /* !! */  = he.la;
                if (true) ** GOTO lbl47
                block31: while (true) {
                    v5 /* !! */  = (long)(v6 - he.emjd("enze", emjp(int ), (int)343));
lbl47:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -195102618: {
                            break block31;
                        }
                        case 712401925: {
                            v6 = he.emjd("enzf", emjp(int ), (int)344);
                            continue block31;
                        }
                        case 861078380: {
                            v6 = he.emjd("enzg", emjp(int ), (int)345);
                            continue block31;
                        }
                    }
                    break;
                }
                v7 = var1_1.method_10084();
                v8 /* !! */  = he.la;
                if (true) ** GOTO lbl61
                block32: while (true) {
                    v8 /* !! */  = (long)(v9 - he.emjd("enzh", emjp(int ), (int)346));
lbl61:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -1536483630: {
                            v9 = he.emjd("enzi", emjp(int ), (int)347);
                            continue block32;
                        }
                        case -402738478: {
                            v9 = he.emjd("enzj", emjp(int ), (int)348);
                            continue block32;
                        }
                        case -195102618: {
                            break block32;
                        }
                        case 1210366530: {
                            v9 = he.emjd("enzk", emjp(int ), (int)349);
                            continue block32;
                        }
                    }
                    break;
                }
                v10 = new class_238(v7);
                v11 = he.emjd("enzl", emsz(int ), (int)350);
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_2 = he.la - he.emjd("enzm", emjp(int ), (int)351)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == he.emjd("enzn", emja(int ), (int)519)) break;
                    v12 /* !! */  = (long)he.emjd("enzo", emja(int ), (int)520);
                }
                v13 = v10.method_1014((double)v11);
                while (true) {
                    if ((v14 /* !! */  = (cfr_temp_3 = he.la - he.emjd("enzp", emjp(int ), (int)352)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v14 /* !! */  == he.emjd("enzq", emja(int ), (int)521)) break;
                    v14 /* !! */  = (long)he.emjd("enzr", emja(int ), (int)522);
                }
                return this.isProtected(v13);
                case 0: {
                    var3_3 /* !! */  = (int)he.emjd("enzs", emja(int ), (int)523);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl97
                }
                case 1: {
                    do {
                        var3_3 /* !! */  = (int)he.emjd("enzt", emja(int ), (int)524);
                    } while (!var4_2);
                    throw null;
                }
lbl97:
                // 2 sources

                case 2: {
                    var3_3 /* !! */  = (int)he.emjd("enzu", emja(int ), (int)525);
                    if (!var4_2) break block29;
                    throw null;
                }
                case 3: 
            }
        }
        do {
            var3_3 /* !! */  = (int)he.emjd("enzv", emja(int ), (int)526);
        } while (!var4_2);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean canPlace(class_2338 var1_1) {
        v0 /* !! */  = he.la;
        if (true) ** GOTO lbl5
        block49: while (true) {
            v0 /* !! */  = (long)(v1 - he.emjd("enpr", emjp(int ), (int)227));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -308123994: {
                    v1 = he.emjd("enps", emjp(int ), (int)228);
                    continue block49;
                }
                case -195102618: {
                    break block49;
                }
                case 506794370: {
                    v1 = he.emjd("enpt", emjp(int ), (int)229);
                    continue block49;
                }
            }
            break;
        }
        var4_2 = he.c;
        v2 /* !! */  = he.la;
        if (true) ** GOTO lbl19
        block50: while (true) {
            v2 /* !! */  = (long)(v3 - he.emjd("enpu", emjp(int ), (int)230));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1069614480: {
                    v3 = he.emjd("enpv", emjp(int ), (int)231);
                    continue block50;
                }
                case -195102618: {
                    break block50;
                }
                case 700867052: {
                    v3 = he.emjd("enpw", emjp(int ), (int)232);
                    continue block50;
                }
                case 1616866351: {
                    v3 = he.emjd("enpy", emjp(int ), (int)233);
                    continue block50;
                }
            }
            break;
        }
        var3_3 /* !! */  = he.b;
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_0 = he.la - he.emjd("enpz", emjp(int ), (int)234)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == he.emjd("enqa", emja(int ), (int)398)) break;
                    v4 /* !! */  = (long)he.emjd("enqb", emja(int ), (int)399);
                }
                var2_4 = he.a;
                if (var4_2) {
                    throw null;
lbl43:
                    // 5 sources

                    return (boolean)he.emjd("enqc", emja(int ), (int)400);
                }
                if (var2_4 || var2_4) ** GOTO lbl43
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = he.la - he.emjd("enqd", emjp(int ), (int)235)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == he.emjd("enqe", emja(int ), (int)401)) break;
                    v5 /* !! */  = (long)he.emjd("enqf", emja(int ), (int)402);
                }
                if (!this.isCrystalBase(var1_1)) ** GOTO lbl175
                if (var2_4) ** GOTO lbl43
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_2 = he.la - he.emjd("enqh", emjp(int ), (int)236)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == he.emjd("enqi", emja(int ), (int)403)) break;
                    v6 /* !! */  = (long)he.emjd("enqj", emja(int ), (int)404);
                }
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_3 = he.la - he.emjd("enqk", emjp(int ), (int)237)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == he.emjd("enql", emja(int ), (int)405)) break;
                    v7 /* !! */  = (long)he.emjd("enqm", emja(int ), (int)406);
                }
                v8 = he.mc.field_1687;
                v9 /* !! */  = he.la;
                if (true) ** GOTO lbl68
                block56: while (true) {
                    v9 /* !! */  = (long)(he.emjd("enqp", emjp(int ), (int)239) - he.emjd("enqo", emjp(int ), (int)238));
lbl68:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -621430593: {
                            continue block56;
                        }
                        case -195102618: {
                            break block56;
                        }
                    }
                    break;
                }
                v10 = var1_1.method_10084();
                v11 /* !! */  = he.la;
                if (true) ** GOTO lbl78
                block57: while (true) {
                    v11 /* !! */  = (long)(v12 - he.emjd("enqq", emjp(int ), (int)240));
lbl78:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -2007679559: {
                            v12 = he.emjd("enqr", emjp(int ), (int)241);
                            continue block57;
                        }
                        case -1067393172: {
                            v12 = he.emjd("enqs", emjp(int ), (int)242);
                            continue block57;
                        }
                        case -912261636: {
                            v12 = he.emjd("enqt", emjp(int ), (int)243);
                            continue block57;
                        }
                        case -195102618: {
                            break block57;
                        }
                    }
                    break;
                }
                v13 = v8.method_8320(v10);
                v14 /* !! */  = he.la;
                if (true) ** GOTO lbl95
                block58: while (true) {
                    v14 /* !! */  = (long)(v15 - he.emjd("enqu", emjp(int ), (int)244));
lbl95:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case -945190742: {
                            v15 = he.emjd("enqv", emjp(int ), (int)245);
                            continue block58;
                        }
                        case -195102618: {
                            break block58;
                        }
                        case -85971577: {
                            v15 = he.emjd("enqw", emjp(int ), (int)246);
                            continue block58;
                        }
                        case 1013533693: {
                            v15 = he.emjd("enqx", emjp(int ), (int)247);
                            continue block58;
                        }
                    }
                    break;
                }
                if (!v13.method_26215()) ** GOTO lbl175
                if (var2_4) ** GOTO lbl43
                v16 /* !! */  = he.la;
                if (true) ** GOTO lbl113
                block59: while (true) {
                    v16 /* !! */  = (long)(he.emjd("enqz", emjp(int ), (int)249) - he.emjd("enqy", emjp(int ), (int)248));
lbl113:
                    // 2 sources

                    switch ((int)v16 /* !! */ ) {
                        case -687040899: {
                            continue block59;
                        }
                        case -195102618: {
                            break block59;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v17 /* !! */  = (cfr_temp_4 = he.la - he.emjd("enra", emjp(int ), (int)250)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v17 /* !! */  == he.emjd("enrb", emja(int ), (int)407)) break;
                    v17 /* !! */  = (long)he.emjd("enrc", emja(int ), (int)408);
                }
                v18 = he.mc.field_1687;
                while (true) {
                    if ((v19 /* !! */  = (cfr_temp_5 = he.la - he.emjd("enrd", emjp(int ), (int)251)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v19 /* !! */  == he.emjd("enre", emja(int ), (int)409)) break;
                    v19 /* !! */  = (long)he.emjd("enrf", emja(int ), (int)410);
                }
                v20 /* !! */  = he.la;
                if (true) ** GOTO lbl133
                block62: while (true) {
                    v20 /* !! */  = (long)(v21 - he.emjd("enrg", emjp(int ), (int)252));
lbl133:
                    // 2 sources

                    switch ((int)v20 /* !! */ ) {
                        case -195102618: {
                            break block62;
                        }
                        case 591873233: {
                            v21 = he.emjd("enrh", emjp(int ), (int)253);
                            continue block62;
                        }
                        case 1365977837: {
                            v21 = he.emjd("enri", emjp(int ), (int)254);
                            continue block62;
                        }
                        case 2114670960: {
                            v21 = he.emjd("enrj", emjp(int ), (int)255);
                            continue block62;
                        }
                    }
                    break;
                }
                v22 = var1_1.method_10084();
                while (true) {
                    if ((v23 /* !! */  = (cfr_temp_6 = he.la - he.emjd("enrk", emjp(int ), (int)256)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v23 /* !! */  == he.emjd("enrm", emja(int ), (int)411)) break;
                    v23 /* !! */  = (long)he.emjd("enrn", emja(int ), (int)412);
                }
                v24 = new class_238(v22);
                while (true) {
                    if ((v25 /* !! */  = (cfr_temp_7 = he.la - he.emjd("enro", emjp(int ), (int)257)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v25 /* !! */  == he.emjd("enrp", emja(int ), (int)413)) break;
                    v25 /* !! */  = (long)he.emjd("enrq", emja(int ), (int)414);
                }
                v26 = (Predicate<class_1297>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$canPlace$0(net.minecraft.class_1297 ), (Lnet/minecraft/class_1297;)Z)();
                while (true) {
                    if ((v27 /* !! */  = (cfr_temp_8 = he.la - he.emjd("enrr", emjp(int ), (int)258)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v27 /* !! */  == he.emjd("enrs", emja(int ), (int)415)) break;
                    v27 /* !! */  = (long)he.emjd("enrt", emja(int ), (int)416);
                }
                v28 = v18.method_8333(null, v24, v26);
                while (true) {
                    if ((v29 /* !! */  = (cfr_temp_9 = he.la - he.emjd("enru", emjp(int ), (int)259)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                    if (v29 /* !! */  == he.emjd("enrv", emja(int ), (int)417)) break;
                    v29 /* !! */  = (long)he.emjd("enrw", emja(int ), (int)418);
                }
                if (!v28.isEmpty()) ** GOTO lbl175
                if (var2_4) ** GOTO lbl43
                v30 = he.emjd("enrx", emja(int ), (int)419);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl178
lbl175:
                // 3 sources

                if (!var2_4 && !var2_4) ** break;
                ** continue;
                v30 = he.emjd("enry", emja(int ), (int)420);
lbl178:
                // 2 sources

                return (boolean)v30;
            }
            case 0: {
                do {
                    var3_3 /* !! */  = (int)he.emjd("enrz", emja(int ), (int)421);
                } while (!var4_2);
                throw null;
            }
            case 1: {
                var3_3 /* !! */  = (int)he.emjd("ensa", emja(int ), (int)422);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl207
            }
lbl189:
            // 3 sources

            case 2: {
                var3_3 /* !! */  = (int)he.emjd("ensb", emja(int ), (int)423);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl203
            }
lbl194:
            // 2 sources

            case 3: {
                do {
                    var3_3 /* !! */  = (int)he.emjd("ensc", emja(int ), (int)424);
                } while (!var4_2);
                throw null;
            }
            case 4: {
                var3_3 /* !! */  = (int)he.emjd("ensd", emja(int ), (int)425);
                if (!var4_2) ** GOTO lbl189
                throw null;
            }
lbl203:
            // 2 sources

            case 5: {
                var3_3 /* !! */  = (int)he.emjd("ense", emja(int ), (int)426);
                if (!var4_2) ** GOTO lbl194
                throw null;
            }
lbl207:
            // 2 sources

            case 6: {
                var3_3 /* !! */  = (int)he.emjd("ensf", emja(int ), (int)427);
                if (var4_2) {
                    throw null;
                }
            }
            case 7: {
                do {
                    var3_3 /* !! */  = (int)he.emjd("ensg", emja(int ), (int)428);
                } while (!var4_2);
                throw null;
            }
            case 8: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)he.emjd("ensh", emja(int ), (int)429);
                    if (!var4_2) ** GOTO lbl189
                    throw null;
                }
            }
            case 9: 
        }
        var3_3 /* !! */  = (int)he.emjd("ensi", emja(int ), (int)430);
        ** while (!var4_2)
lbl224:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ int emja(int n2) {
        return emjb[n2] ^ emjc[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void rotateTo(class_243 var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = he.la - he.emjd("ennx", emjp(int ), (int)200)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == he.emjd("enny", emja(int ), (int)382)) break;
            v0 /* !! */  = (long)he.emjd("ennz", emja(int ), (int)383);
        }
        var4_2 = he.c;
        v1 /* !! */  = he.la;
        if (true) ** GOTO lbl11
        block41: while (true) {
            v1 /* !! */  = (long)(v2 - he.emjd("enoa", emjp(int ), (int)201));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1631256560: {
                    v2 = he.emjd("enob", emjp(int ), (int)202);
                    continue block41;
                }
                case -418170039: {
                    v2 = he.emjd("enod", emjp(int ), (int)203);
                    continue block41;
                }
                case -195102618: {
                    break block41;
                }
                case 672758984: {
                    v2 = he.emjd("enoe", emjp(int ), (int)204);
                    continue block41;
                }
            }
            break;
        }
        var3_3 = he.b;
        v3 /* !! */  = he.la;
        if (true) ** GOTO lbl28
        block42: while (true) {
            v3 /* !! */  = (long)(he.emjd("enog", emjp(int ), (int)206) - he.emjd("enof", emjp(int ), (int)205));
lbl28:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -231233110: {
                    continue block42;
                }
                case -195102618: {
                    break block42;
                }
            }
            break;
        }
        var2_4 = he.a;
        if (var4_2) {
            throw null;
lbl36:
            // 2 sources

            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl36
        v4 /* !! */  = he.la;
        if (true) ** GOTO lbl43
        block44: while (true) {
            v4 /* !! */  = (long)(he.emjd("enoi", emjp(int ), (int)208) - he.emjd("enoh", emjp(int ), (int)207));
lbl43:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -2065738347: {
                    continue block44;
                }
                case -195102618: {
                    break block44;
                }
            }
            break;
        }
        v5 /* !! */  = he.la;
        if (true) ** GOTO lbl52
        block45: while (true) {
            v5 /* !! */  = (long)(he.emjd("enok", emjp(int ), (int)210) - he.emjd("enoj", emjp(int ), (int)209));
lbl52:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -195102618: {
                    break block45;
                }
                case 388231899: {
                    continue block45;
                }
            }
            break;
        }
        v6 = ow.calculateAngle(var1_1);
        v7 = he.emjd("enol", emja(int ), (int)384);
        v8 /* !! */  = he.la;
        if (true) ** GOTO lbl63
        block46: while (true) {
            v8 /* !! */  = (long)(he.emjd("enon", emjp(int ), (int)212) - he.emjd("enom", emjp(int ), (int)211));
lbl63:
            // 2 sources

            switch ((int)v8 /* !! */ ) {
                case -521437290: {
                    continue block46;
                }
                case -195102618: {
                    break block46;
                }
            }
            break;
        }
        v9 /* !! */  = he.la;
        if (true) ** GOTO lbl72
        block47: while (true) {
            v9 /* !! */  = (long)(v10 - he.emjd("enoo", emjp(int ), (int)213));
lbl72:
            // 2 sources

            switch ((int)v9 /* !! */ ) {
                case -1064251493: {
                    v10 = he.emjd("enop", emjp(int ), (int)214);
                    continue block47;
                }
                case -567576100: {
                    v10 = he.emjd("enoq", emjp(int ), (int)215);
                    continue block47;
                }
                case -195102618: {
                    break block47;
                }
                case 598834267: {
                    v10 = he.emjd("enor", emjp(int ), (int)216);
                    continue block47;
                }
            }
            break;
        }
        while (true) {
            if ((v11 /* !! */  = (cfr_temp_1 = he.la - he.emjd("enos", emjp(int ), (int)217)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v11 /* !! */  == he.emjd("enot", emja(int ), (int)385)) break;
            v11 /* !! */  = (long)he.emjd("enou", emja(int ), (int)386);
        }
        v12 = new hy();
        v13 = he.emjd("enov", emja(int ), (int)387);
        v14 = he.emjd("enow", emja(int ), (int)388);
        v15 = he.emjd("enoy", emja(int ), (int)389);
        v16 /* !! */  = he.la;
        if (true) ** GOTO lbl97
        block49: while (true) {
            v16 /* !! */  = (long)(v17 - he.emjd("enoz", emjp(int ), (int)218));
lbl97:
            // 2 sources

            switch ((int)v16 /* !! */ ) {
                case -1150805338: {
                    v17 = he.emjd("enpa", emjp(int ), (int)219);
                    continue block49;
                }
                case -195102618: {
                    break block49;
                }
                case 1657224974: {
                    v17 = he.emjd("enpb", emjp(int ), (int)220);
                    continue block49;
                }
                case 2091994127: {
                    v17 = he.emjd("enpc", emjp(int ), (int)221);
                    continue block49;
                }
            }
            break;
        }
        v18 = new os(v12, (boolean)v13, (boolean)v14, (boolean)v15);
        while (true) {
            if ((v19 /* !! */  = (cfr_temp_2 = he.la - he.emjd("enpd", emjp(int ), (int)222)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v19 /* !! */  == he.emjd("enpe", emja(int ), (int)390)) break;
            v19 /* !! */  = (long)he.emjd("enpf", emja(int ), (int)391);
        }
        v20 /* !! */  = he.la;
        if (true) ** GOTO lbl119
        block51: while (true) {
            v20 /* !! */  = (long)(v21 - he.emjd("enpg", emjp(int ), (int)223));
lbl119:
            // 2 sources

            switch ((int)v20 /* !! */ ) {
                case -195102618: {
                    break block51;
                }
                case 185969813: {
                    v21 = he.emjd("enph", emjp(int ), (int)224);
                    continue block51;
                }
                case 564681755: {
                    v21 = he.emjd("enpi", emjp(int ), (int)225);
                    continue block51;
                }
                case 1923082556: {
                    v21 = he.emjd("enpj", emjp(int ), (int)226);
                    continue block51;
                }
            }
            break;
        }
        ot.INSTANCE.rotateTo(v6, (int)v7, v18, nn.HIGH_IMPORTANCE_1, this);
        ** while (var2_4 || var2_4)
lbl133:
        // 1 sources

    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean isCrystalBase(class_2338 var1_1) {
        v0 /* !! */  = he.la;
        if (true) ** GOTO lbl5
        block43: while (true) {
            v0 /* !! */  = (long)(v1 - he.emjd("ensj", emjp(int ), (int)260));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -784416311: {
                    v1 = he.emjd("ensk", emjp(int ), (int)261);
                    continue block43;
                }
                case -329136345: {
                    v1 = he.emjd("ensl", emjp(int ), (int)262);
                    continue block43;
                }
                case -195102618: {
                    break block43;
                }
                case 173037352: {
                    v1 = he.emjd("ensm", emjp(int ), (int)263);
                    continue block43;
                }
            }
            break;
        }
        var4_2 = he.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = he.la - he.emjd("ensn", emjp(int ), (int)264)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == he.emjd("ensp", emja(int ), (int)431)) break;
            v2 /* !! */  = (long)he.emjd("ensq", emja(int ), (int)432);
        }
        var3_3 /* !! */  = he.b;
        v3 /* !! */  = he.la;
        if (true) ** GOTO lbl28
        block45: while (true) {
            v3 /* !! */  = (long)(he.emjd("enss", emjp(int ), (int)266) - he.emjd("ensr", emjp(int ), (int)265));
lbl28:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -195102618: {
                    break block45;
                }
                case 1161442376: {
                    continue block45;
                }
            }
            break;
        }
        var2_4 = he.a;
        if (var4_2) {
            throw null;
lbl36:
            // 5 sources

            return (boolean)he.emjd("enst", emja(int ), (int)433);
        }
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4 || var2_4) ** GOTO lbl36
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_1 = he.la - he.emjd("ensu", emjp(int ), (int)267)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == he.emjd("ensv", emja(int ), (int)434)) break;
                    v4 /* !! */  = (long)he.emjd("ensw", emja(int ), (int)435);
                }
                v5 /* !! */  = he.la;
                if (true) ** GOTO lbl51
                block48: while (true) {
                    v5 /* !! */  = (long)(v6 - he.emjd("ensx", emjp(int ), (int)268));
lbl51:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1541481885: {
                            v6 = he.emjd("ensy", emjp(int ), (int)269);
                            continue block48;
                        }
                        case -195102618: {
                            break block48;
                        }
                        case 862559968: {
                            v6 = he.emjd("ensz", emjp(int ), (int)270);
                            continue block48;
                        }
                    }
                    break;
                }
                v7 = he.mc.field_1687;
                v8 /* !! */  = he.la;
                if (true) ** GOTO lbl65
                block49: while (true) {
                    v8 /* !! */  = (long)(he.emjd("entb", emjp(int ), (int)272) - he.emjd("enta", emjp(int ), (int)271));
lbl65:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -195102618: {
                            break block49;
                        }
                        case 507182210: {
                            continue block49;
                        }
                    }
                    break;
                }
                v9 = v7.method_8320(var1_1);
                v10 /* !! */  = he.la;
                if (true) ** GOTO lbl75
                block50: while (true) {
                    v10 /* !! */  = (long)(v11 - he.emjd("entc", emjp(int ), (int)273));
lbl75:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -1892907446: {
                            v11 = he.emjd("entd", emjp(int ), (int)274);
                            continue block50;
                        }
                        case -1691713490: {
                            v11 = he.emjd("ente", emjp(int ), (int)275);
                            continue block50;
                        }
                        case -686709031: {
                            v11 = he.emjd("entf", emjp(int ), (int)276);
                            continue block50;
                        }
                        case -195102618: {
                            break block50;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_2 = he.la - he.emjd("entg", emjp(int ), (int)277)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == he.emjd("enth", emja(int ), (int)436)) break;
                    v12 /* !! */  = (long)he.emjd("enti", emja(int ), (int)437);
                }
                if (v9.method_27852(class_2246.field_10540)) ** GOTO lbl131
                if (var2_4) ** GOTO lbl36
                while (true) {
                    if ((v13 /* !! */  = (cfr_temp_3 = he.la - he.emjd("entj", emjp(int ), (int)278)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v13 /* !! */  == he.emjd("entk", emja(int ), (int)438)) break;
                    v13 /* !! */  = (long)he.emjd("entl", emja(int ), (int)439);
                }
                v14 /* !! */  = he.la;
                if (true) ** GOTO lbl103
                block53: while (true) {
                    v14 /* !! */  = (long)(v15 - he.emjd("entn", emjp(int ), (int)279));
lbl103:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case -2047781881: {
                            v15 = he.emjd("ento", emjp(int ), (int)280);
                            continue block53;
                        }
                        case -195102618: {
                            break block53;
                        }
                        case -117501357: {
                            v15 = he.emjd("entp", emjp(int ), (int)281);
                            continue block53;
                        }
                    }
                    break;
                }
                v16 = he.mc.field_1687;
                while (true) {
                    if ((v17 /* !! */  = (cfr_temp_4 = he.la - he.emjd("entq", emjp(int ), (int)282)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v17 /* !! */  == he.emjd("entr", emja(int ), (int)440)) break;
                    v17 /* !! */  = (long)he.emjd("ents", emja(int ), (int)441);
                }
                v18 = v16.method_8320(var1_1);
                while (true) {
                    if ((v19 /* !! */  = (cfr_temp_5 = he.la - he.emjd("entt", emjp(int ), (int)283)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v19 /* !! */  == he.emjd("entu", emja(int ), (int)442)) break;
                    v19 /* !! */  = (long)he.emjd("entv", emja(int ), (int)443);
                }
                while (true) {
                    if ((v20 /* !! */  = (cfr_temp_6 = he.la - he.emjd("entw", emjp(int ), (int)284)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v20 /* !! */  == he.emjd("entx", emja(int ), (int)444)) break;
                    v20 /* !! */  = (long)he.emjd("enty", emja(int ), (int)445);
                }
                if (!v18.method_27852(class_2246.field_9987)) ** GOTO lbl136
                if (var2_4) ** GOTO lbl36
lbl131:
                // 2 sources

                if (var2_4 || var2_4) ** GOTO lbl36
                v21 = he.emjd("entz", emja(int ), (int)446);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl139
lbl136:
                // 1 sources

                if (!var2_4 && !var2_4) ** break;
                ** continue;
                v21 = he.emjd("enub", emja(int ), (int)447);
lbl139:
                // 2 sources

                return (boolean)v21;
            }
lbl140:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)he.emjd("enuc", emja(int ), (int)448);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl180
            }
lbl145:
            // 3 sources

            case 1: {
                do {
                    var3_3 /* !! */  = (int)he.emjd("enud", emja(int ), (int)449);
                } while (!var4_2);
                throw null;
            }
lbl150:
            // 2 sources

            case 2: {
                var3_3 /* !! */  = (int)he.emjd("enue", emja(int ), (int)450);
                if (var4_2) {
                    throw null;
                }
            }
            case 3: {
                do {
                    var3_3 /* !! */  = (int)he.emjd("enuf", emja(int ), (int)451);
                } while (!var4_2);
                throw null;
            }
            case 4: {
                var3_3 /* !! */  = (int)he.emjd("enug", emja(int ), (int)452);
                if (!var4_2) ** GOTO lbl140
                throw null;
            }
            case 5: {
                var3_3 /* !! */  = (int)he.emjd("enuh", emja(int ), (int)453);
                if (!var4_2) break;
                throw null;
            }
            case 6: {
                var3_3 /* !! */  = (int)he.emjd("enui", emja(int ), (int)454);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl180
            }
            case 7: {
                var3_3 /* !! */  = (int)he.emjd("enuj", emja(int ), (int)455);
                if (!var4_2) ** GOTO lbl145
                throw null;
            }
            case 8: {
                var3_3 /* !! */  = (int)he.emjd("enuk", emja(int ), (int)456);
                if (!var4_2) ** GOTO lbl145
                throw null;
            }
lbl180:
            // 3 sources

            case 9: {
                var3_3 /* !! */  = (int)he.emjd("enul", emja(int ), (int)457);
                if (!var4_2) ** GOTO lbl150
                throw null;
            }
            case 10: 
        }
        do {
            var3_3 /* !! */  = (int)he.emjd("enum", emja(int ), (int)458);
        } while (!var4_2);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onWorldRender(dj var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = he.la - he.emjd("emqk", emjp(int ), (int)27)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == he.emjd("emql", emja(int ), (int)158)) break;
            v0 /* !! */  = (long)he.emjd("emqm", emja(int ), (int)159);
        }
        var4_2 = he.c;
        v1 /* !! */  = he.la;
        if (true) ** GOTO lbl12
        block54: while (true) {
            v1 /* !! */  = (long)(v2 - he.emjd("emqn", emjp(int ), (int)28));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -195102618: {
                    break block54;
                }
                case 21767137: {
                    v2 = he.emjd("emqo", emjp(int ), (int)29);
                    continue block54;
                }
                case 2011328318: {
                    v2 = he.emjd("emqp", emjp(int ), (int)30);
                    continue block54;
                }
                case 2104547376: {
                    v2 = he.emjd("emqq", emjp(int ), (int)31);
                    continue block54;
                }
            }
            break;
        }
        var3_3 /* !! */  = he.b;
        v3 /* !! */  = he.la;
        if (true) ** GOTO lbl29
        block55: while (true) {
            v3 /* !! */  = (long)(v4 - he.emjd("emqr", emjp(int ), (int)32));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1711412235: {
                    v4 = he.emjd("emqs", emjp(int ), (int)33);
                    continue block55;
                }
                case -195102618: {
                    break block55;
                }
                case -166765403: {
                    v4 = he.emjd("emqt", emjp(int ), (int)34);
                    continue block55;
                }
                case -127013187: {
                    v4 = he.emjd("emqu", emjp(int ), (int)35);
                    continue block55;
                }
            }
            break;
        }
        var2_4 = he.a;
        if (var4_2) {
            throw null;
lbl44:
            // 8 sources

            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl44
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_1 = he.la - he.emjd("emqv", emjp(int ), (int)36)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v5 /* !! */  == he.emjd("emqw", emja(int ), (int)160)) break;
            v5 /* !! */  = (long)he.emjd("emqx", emja(int ), (int)161);
        }
        v6 /* !! */  = he.la;
        if (true) ** GOTO lbl57
        block58: while (true) {
            v6 /* !! */  = (long)(v7 - he.emjd("emqy", emjp(int ), (int)37));
lbl57:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case -2140226341: {
                    v7 = he.emjd("emqz", emjp(int ), (int)38);
                    continue block58;
                }
                case -1001611950: {
                    v7 = he.emjd("emra", emjp(int ), (int)39);
                    continue block58;
                }
                case -195102618: {
                    break block58;
                }
            }
            break;
        }
        if (he.mc.field_1724 == null) ** GOTO lbl149
        if (var2_4) ** GOTO lbl44
        while (true) {
            if ((v8 /* !! */  = (cfr_temp_2 = he.la - he.emjd("emrb", emjp(int ), (int)40)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v8 /* !! */  == he.emjd("emrc", emja(int ), (int)162)) break;
            v8 /* !! */  = (long)he.emjd("emrd", emja(int ), (int)163);
        }
        v9 /* !! */  = he.la;
        if (true) ** GOTO lbl78
        block60: while (true) {
            v9 /* !! */  = (long)(v10 - he.emjd("emre", emjp(int ), (int)41));
lbl78:
            // 2 sources

            switch ((int)v9 /* !! */ ) {
                case -2137151913: {
                    v10 = he.emjd("emrf", emjp(int ), (int)42);
                    continue block60;
                }
                case -195102618: {
                    break block60;
                }
                case 1357078892: {
                    v10 = he.emjd("emrh", emjp(int ), (int)43);
                    continue block60;
                }
                case 1751582545: {
                    v10 = he.emjd("emri", emjp(int ), (int)44);
                    continue block60;
                }
            }
            break;
        }
        if (he.mc.field_1687 == null) ** GOTO lbl149
        if (var2_4) ** GOTO lbl44
        v11 /* !! */  = he.la;
        if (true) ** GOTO lbl96
        block61: while (true) {
            v11 /* !! */  = (long)(he.emjd("emrl", emjp(int ), (int)46) - he.emjd("emrj", emjp(int ), (int)45));
lbl96:
            // 2 sources

            switch ((int)v11 /* !! */ ) {
                case -195102618: {
                    break block61;
                }
                case 1440306008: {
                    continue block61;
                }
            }
            break;
        }
        while (true) {
            if ((v12 /* !! */  = (cfr_temp_3 = he.la - he.emjd("emrn", emjp(int ), (int)47)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v12 /* !! */  == he.emjd("emro", emja(int ), (int)164)) break;
            v12 /* !! */  = (long)he.emjd("emrp", emja(int ), (int)165);
        }
        if (he.mc.field_1761 == null) ** GOTO lbl149
        if (var2_4) ** GOTO lbl44
        v13 /* !! */  = he.la;
        if (true) ** GOTO lbl113
        block63: while (true) {
            v13 /* !! */  = (long)(v14 - he.emjd("emrs", emjp(int ), (int)48));
lbl113:
            // 2 sources

            switch ((int)v13 /* !! */ ) {
                case -2141111746: {
                    v14 = he.emjd("emrt", emjp(int ), (int)49);
                    continue block63;
                }
                case -1236957681: {
                    v14 = he.emjd("emru", emjp(int ), (int)50);
                    continue block63;
                }
                case -414344818: {
                    v14 = he.emjd("emrv", emjp(int ), (int)51);
                    continue block63;
                }
                case -195102618: {
                    break block63;
                }
            }
            break;
        }
        if (this.needSync) ** GOTO lbl149
        if (var2_4) ** GOTO lbl44
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** GOTO lbl44
                v15 /* !! */  = he.la;
                if (true) ** GOTO lbl135
                block64: while (true) {
                    v15 /* !! */  = (long)(v16 - he.emjd("emrw", emjp(int ), (int)52));
lbl135:
                    // 2 sources

                    switch ((int)v15 /* !! */ ) {
                        case -1961241882: {
                            v16 = he.emjd("emrx", emjp(int ), (int)53);
                            continue block64;
                        }
                        case -761037484: {
                            v16 = he.emjd("emry", emjp(int ), (int)54);
                            continue block64;
                        }
                        case -195102618: {
                            break block64;
                        }
                        case 1315477682: {
                            v16 = he.emjd("emrz", emjp(int ), (int)55);
                            continue block64;
                        }
                    }
                    break;
                }
                this.processScheduledPlacement();
                if (var2_4) ** GOTO lbl44
lbl149:
                // 5 sources

                if (!var2_4 && !var2_4) ** break;
                ** continue;
                return;
            }
            case 0: {
                var3_3 /* !! */  = (int)he.emjd("emsb", emja(int ), (int)166);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl180
            }
lbl157:
            // 2 sources

            case 1: {
                var3_3 /* !! */  = (int)he.emjd("emsd", emja(int ), (int)167);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl176
            }
lbl162:
            // 2 sources

            case 2: {
                var3_3 /* !! */  = (int)he.emjd("emsf", emja(int ), (int)168);
                if (!var4_2) ** GOTO lbl157
                throw null;
            }
lbl166:
            // 2 sources

            case 3: {
                var3_3 /* !! */  = (int)he.emjd("emsg", emja(int ), (int)169);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl190
            }
lbl171:
            // 2 sources

            case 4: {
                var3_3 /* !! */  = (int)he.emjd("emsk", emja(int ), (int)170);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl190
            }
lbl176:
            // 2 sources

            case 5: {
                var3_3 /* !! */  = (int)he.emjd("emsl", emja(int ), (int)171);
                if (!var4_2) ** GOTO lbl171
                throw null;
            }
lbl180:
            // 2 sources

            case 6: {
                var3_3 /* !! */  = (int)he.emjd("emsn", emja(int ), (int)172);
                if (!var4_2) ** GOTO lbl166
                throw null;
            }
            case 7: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)he.emjd("emso", emja(int ), (int)173);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl194
                    break;
                }
            }
lbl190:
            // 3 sources

            case 8: {
                var3_3 /* !! */  = (int)he.emjd("emsp", emja(int ), (int)174);
                if (!var4_2) break;
                throw null;
            }
lbl194:
            // 2 sources

            case 9: {
                var3_3 /* !! */  = (int)he.emjd("emsq", emja(int ), (int)175);
                if (var4_2) {
                    throw null;
                }
            }
            case 10: {
                var3_3 /* !! */  = (int)he.emjd("emsr", emja(int ), (int)176);
                if (!var4_2) ** GOTO lbl162
                throw null;
            }
            case 11: 
        }
        var3_3 /* !! */  = (int)he.emjd("emss", emja(int ), (int)177);
        ** while (!var4_2)
lbl205:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void eoeq() {
        he.emjb[300] = -1307198210;
        he.emjb[301] = -1733968311;
        he.emjb[302] = -1144316484;
        he.emjb[303] = -1650331408;
        he.emjb[304] = -1803466334;
        he.emjb[305] = -1009134254;
        he.emjb[306] = 959045940;
        he.emjb[307] = -70587471;
        he.emjb[308] = -1751734880;
        he.emjb[309] = 779795244;
        he.emjb[310] = 879341136;
        he.emjb[311] = 1811106342;
        he.emjb[312] = 1635487830;
        he.emjb[313] = -1965816352;
        he.emjb[314] = 270617038;
        he.emjb[315] = 2069086995;
        he.emjb[316] = -1460559713;
        he.emjb[317] = 938019832;
        he.emjb[318] = 999518695;
        he.emjb[319] = 1593158943;
        he.emjb[320] = -1845727231;
        he.emjb[321] = 1426385219;
        he.emjb[322] = -34719273;
        he.emjb[323] = 1974848017;
        he.emjb[324] = -958714207;
        he.emjb[325] = -1208656817;
        he.emjb[326] = 1952441988;
        he.emjb[327] = 1634154140;
        he.emjb[328] = -1210662280;
        he.emjb[329] = 326240418;
        he.emjb[330] = 205722590;
        he.emjb[331] = 751851456;
        he.emjb[332] = -1856915050;
        he.emjb[333] = -376994306;
        he.emjb[334] = 504962897;
        he.emjb[335] = 1033429936;
        he.emjb[336] = -1563695000;
        he.emjb[337] = 425633950;
        he.emjb[338] = 499873616;
        he.emjb[339] = 290619421;
        he.emjb[340] = 621108136;
        he.emjb[341] = 2076451474;
        he.emjb[342] = -1318218310;
        he.emjb[343] = 291972133;
        he.emjb[344] = 1644543242;
        he.emjb[345] = 1310688259;
        he.emjb[346] = -1863712810;
        he.emjb[347] = 803792909;
        he.emjb[348] = 915845427;
        he.emjb[349] = -1687299179;
        he.emjb[350] = -1609646365;
        he.emjb[351] = 1350633981;
        he.emjb[352] = 969809024;
        he.emjb[353] = -1731082990;
        he.emjb[354] = -1048300460;
        he.emjb[355] = 2145702867;
        he.emjb[356] = -1261630908;
        he.emjb[357] = -1583230329;
        he.emjb[358] = -569748223;
        he.emjb[359] = -1976094361;
        he.emjb[360] = -572409867;
        he.emjb[361] = 1980309386;
        he.emjb[362] = 1601631817;
        he.emjb[363] = -2048469150;
        he.emjb[364] = -1111711724;
        he.emjb[365] = 439232972;
        he.emjb[366] = -38181545;
        he.emjb[367] = -342570508;
        he.emjb[368] = 579392348;
        he.emjb[369] = 861186136;
        he.emjb[370] = 667934645;
        he.emjb[371] = 1047584815;
        he.emjb[372] = 1562178816;
        he.emjb[373] = -791019047;
        he.emjb[374] = -1725473608;
        he.emjb[375] = -1587710591;
        he.emjb[376] = 783208961;
        he.emjb[377] = -1849502181;
        he.emjb[378] = -1173845427;
        he.emjb[379] = 105265448;
        he.emjb[380] = -2016798061;
        he.emjb[381] = -1687810658;
        he.emjb[382] = 131650489;
        he.emjb[383] = 1909749713;
        he.emjb[384] = -350481288;
        he.emjb[385] = 912513980;
        he.emjb[386] = -652939226;
        he.emjb[387] = -2096123297;
        he.emjb[388] = 117246393;
        he.emjb[389] = 1280694000;
        he.emjb[390] = -1875863833;
        he.emjb[391] = -1757861601;
        he.emjb[392] = 165460157;
        he.emjb[393] = 1858271314;
        he.emjb[394] = 1124793765;
        he.emjb[395] = -1826703550;
        he.emjb[396] = 692988634;
        he.emjb[397] = 2001389194;
        he.emjb[398] = -271694023;
        he.emjb[399] = 2082280109;
    }

    private static /* synthetic */ void eoes() {
        he.emjb[500] = -1916608106;
        he.emjb[501] = -635907550;
        he.emjb[502] = 2113725392;
        he.emjb[503] = -720616487;
        he.emjb[504] = -867967306;
        he.emjb[505] = 423516676;
        he.emjb[506] = -1198456556;
        he.emjb[507] = 1471411276;
        he.emjb[508] = 1756707728;
        he.emjb[509] = 1532752742;
        he.emjb[510] = 78169269;
        he.emjb[511] = 1025491586;
        he.emjb[512] = -843966244;
        he.emjb[513] = 317647254;
        he.emjb[514] = -1629103463;
        he.emjb[515] = 1462708406;
        he.emjb[516] = 1823593137;
        he.emjb[517] = -1264822672;
        he.emjb[518] = -1786842975;
        he.emjb[519] = -282786786;
        he.emjb[520] = -1846762875;
        he.emjb[521] = 1044006049;
        he.emjb[522] = -154563525;
        he.emjb[523] = 83307441;
        he.emjb[524] = -1186630254;
        he.emjb[525] = -1604805193;
        he.emjb[526] = 936710245;
        he.emjb[527] = 146820284;
        he.emjb[528] = -1876565361;
        he.emjb[529] = -71881643;
        he.emjb[530] = 2012353288;
        he.emjb[531] = 1533094613;
        he.emjb[532] = 1961388183;
        he.emjb[533] = 1367784433;
        he.emjb[534] = 1069316325;
        he.emjb[535] = -437005808;
        he.emjb[536] = -860094517;
        he.emjb[537] = 1981192479;
        he.emjb[538] = -1761928643;
        he.emjb[539] = -986676765;
        he.emjb[540] = -1433228192;
        he.emjb[541] = -2104374146;
        he.emjb[542] = 1149539546;
        he.emjb[543] = -117533761;
        he.emjb[544] = 501209621;
        he.emjb[545] = 938781069;
        he.emjb[546] = -1419379621;
        he.emjb[547] = -700170239;
        he.emjb[548] = 669150036;
        he.emjb[549] = 2054135189;
        he.emjb[550] = 73464235;
        he.emjb[551] = 2046677976;
        he.emjb[552] = 1394180871;
        he.emjb[553] = -1786515187;
        he.emjb[554] = -568197803;
        he.emjb[555] = 203041401;
        he.emjb[556] = 1424967265;
        he.emjb[557] = 1690202276;
        he.emjb[558] = -2123012447;
        he.emjb[559] = -1440513287;
        he.emjb[560] = -2137709663;
        he.emjb[561] = -1027657314;
        he.emjb[562] = 701285803;
        he.emjb[563] = 1654194283;
        he.emjb[564] = 1203853526;
        he.emjb[565] = -1350769493;
        he.emjb[566] = 1406377162;
        he.emjb[567] = 1666084224;
        he.emjb[568] = -1162492162;
        he.emjb[569] = 447049039;
        he.emjb[570] = -1243266555;
        he.emjb[571] = -731048995;
        he.emjb[572] = 1492405593;
        he.emjb[573] = -1092309004;
        he.emjb[574] = -1356085054;
        he.emjb[575] = 1477033001;
        he.emjb[576] = 2139437108;
        he.emjb[577] = -906638802;
        he.emjb[578] = 608834679;
        he.emjb[579] = -1460588932;
        he.emjb[580] = 217612880;
        he.emjb[581] = 1794255860;
        he.emjb[582] = 1240562250;
        he.emjb[583] = -879902737;
        he.emjb[584] = 647163538;
        he.emjb[585] = -1080736927;
        he.emjb[586] = -656042850;
        he.emjb[587] = -153237226;
        he.emjb[588] = 1638153885;
        he.emjb[589] = -513626444;
        he.emjb[590] = -1980289798;
        he.emjb[591] = 580653715;
        he.emjb[592] = 1880361329;
        he.emjb[593] = 537406498;
        he.emjb[594] = -1649844166;
        he.emjb[595] = -1338469912;
        he.emjb[596] = 336000471;
        he.emjb[597] = 1446229470;
        he.emjb[598] = 415391951;
        he.emjb[599] = 793838720;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public he() {
        var2_1 /* !! */  = he.b;
        super("AutoExplosion", "\u0410\u0432\u0442\u043e\u043c\u0430\u0442\u0438\u0447\u0435\u0441\u043a\u0438 \u0441\u0442\u0430\u0432\u0438\u0442 \u0438 \u0432\u0437\u0440\u044b\u0432\u0430\u0435\u0442 \u043a\u0440\u0438\u0441\u0442\u0430\u043b\u043b", du.RAGE);
        this.placeOnRightClick = new kb("\u0421\u0442\u0430\u0432\u0438\u0442\u044c \u043f\u043e \u041f\u041a\u041c", "\u0410\u0432\u0442\u043e\u043c\u0430\u0442\u0438\u0447\u0435\u0441\u043a\u0438 \u0441\u0442\u0430\u0432\u0438\u0442\u044c \u043a\u0440\u0438\u0441\u0442\u0430\u043b\u043b").setValue((boolean)he.emjd("emje", emja(int ), (int)0));
        this.protect = new ke("\u041d\u0435 \u0432\u0437\u0440\u044b\u0432\u0430\u0442\u044c", "\u0417\u0430\u0449\u0438\u0442\u0430 \u043e\u043a\u0440\u0443\u0436\u0435\u043d\u0438\u044f").value(new String[]{"\u0420\u0435\u0441\u0443\u0440\u0441\u044b", "\u0414\u0440\u0443\u0437\u0435\u0439"}).selected(new String[]{"\u0414\u0440\u0443\u0437\u0435\u0439"});
        this.targetSlot = (int)he.emjd("emjf", emja(int ), (int)1);
        this.oldSlot = (int)he.emjd("emjg", emja(int ), (int)2);
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.settings(new jx[]{this.placeOnRightClick, this.protect});
                return;
            }
lbl12:
            // 2 sources

            case 0: {
                var2_1 /* !! */  = (int)he.emjd("emjh", emja(int ), (int)3);
                break;
            }
            case 1: {
                var2_1 /* !! */  = (int)he.emjd("emji", emja(int ), (int)4);
                ** GOTO lbl12
            }
            case 2: {
                var2_1 /* !! */  = (int)he.emjd("emjj", emja(int ), (int)5);
                break;
            }
lbl21:
            // 2 sources

            case 3: {
                var2_1 /* !! */  = (int)he.emjd("emjk", emja(int ), (int)6);
                ** GOTO lbl28
            }
            case 4: {
                while (true) {
                    var2_1 /* !! */  = (int)he.emjd("emjl", emja(int ), (int)7);
                }
            }
lbl28:
            // 2 sources

            case 5: {
                var2_1 /* !! */  = (int)he.emjd("emjm", emja(int ), (int)8);
            }
            case 6: {
                var2_1 /* !! */  = (int)he.emjd("emjn", emja(int ), (int)9);
                ** GOTO lbl21
            }
            case 7: 
        }
        while (true) {
            var2_1 /* !! */  = (int)he.emjd("emjo", emja(int ), (int)10);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onTick(df var1_1) {
        block201: {
            block200: {
                block199: {
                    block198: {
                        block197: {
                            block196: {
                                var8_2 = he.c;
                                var7_3 /* !! */  = he.b;
                                var6_4 = he.a;
                                if (var8_2) {
                                    throw null;
lbl6:
                                    // 55 sources

                                    return;
                                }
                                if (var6_4 || var6_4) ** GOTO lbl6
                                if (he.mc.field_1724 == null) break block196;
                                if (var6_4) ** GOTO lbl6
                                if (he.mc.field_1687 == null) break block196;
                                if (var6_4) ** GOTO lbl6
                                if (he.mc.field_1761 != null) break block197;
                                if (var6_4) ** GOTO lbl6
                            }
                            if (var6_4 || var6_4) ** GOTO lbl6
                            return;
                        }
                        if (var6_4 || var6_4) ** GOTO lbl6
                        var2_5 = he.mc.field_1690.field_1904.method_1434();
                        if (var6_4 || var6_4) ** GOTO lbl6
                        if (!var2_5) break block198;
                        if (var6_4) ** GOTO lbl6
                        if (this.useWasPressed) break block198;
                        if (var6_4) ** GOTO lbl6
                        v0 = he.emjd("emml", emja(int ), (int)55);
                        if (var8_2) {
                            throw null;
                        }
                        break block199;
                    }
                    if (var6_4 || var6_4) ** GOTO lbl6
                    v0 = var3_6 = he.emjd("emmm", emja(int ), (int)56);
                }
                if (var6_4 || var6_4) ** GOTO lbl6
                this.useWasPressed = var2_5;
                if (var6_4 || var6_4) ** GOTO lbl6
                if (!this.needSync) break block200;
                if (var6_4 || var6_4) ** GOTO lbl6
                this.restoreSlot();
                if (var6_4 || var6_4) ** GOTO lbl6
                return;
            }
            if (var6_4 || var6_4) ** GOTO lbl6
            if (this.targetPos == null) break block201;
            if (var6_4 || var6_4) ** GOTO lbl6
            this.processScheduledPlacement();
            if (var6_4 || var6_4) ** GOTO lbl6
            return;
        }
        if (var6_4 || var6_4) ** GOTO lbl6
        if (this.waitingObsidian == null) ** GOTO lbl72
        if (var6_4 || var6_4) ** GOTO lbl6
        if ((this.waitingTicks += he.emjd("emmn", emja(int ), (int)57)) <= he.emjd("emmo", emja(int ), (int)58)) ** GOTO lbl63
        if (var6_4 || var6_4) ** GOTO lbl6
        this.waitingObsidian = null;
        if (var7_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var7_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var6_4) ** GOTO lbl6
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl70
            }
lbl63:
            // 1 sources

            if (var6_4 || var6_4) ** GOTO lbl6
            if (!this.canPlace(this.waitingObsidian)) ** GOTO lbl70
            if (var6_4 || var6_4) ** GOTO lbl6
            this.scheduleCrystal(this.waitingObsidian);
            if (var6_4 || var6_4) ** GOTO lbl6
            this.waitingObsidian = null;
            if (var6_4) ** GOTO lbl6
lbl70:
            // 3 sources

            if (var6_4 || var6_4) ** GOTO lbl6
            return;
lbl72:
            // 1 sources

            if (var6_4 || var6_4) ** GOTO lbl6
            if (!this.placeOnRightClick.isValue()) ** GOTO lbl85
            if (var6_4) ** GOTO lbl6
            if (var3_6 == false) ** GOTO lbl85
            if (var6_4 || var6_4) ** GOTO lbl6
            var5_7 = he.mc.field_1765;
            if (var6_4) ** GOTO lbl6
            if (!(var5_7 instanceof class_3965)) ** GOTO lbl85
            if (var6_4) ** GOTO lbl6
            var4_8 = (class_3965)var5_7;
            if (var6_4 || var6_4) ** GOTO lbl6
            if (var4_8.method_17783() == class_239.class_240.field_1332) ** GOTO lbl87
            if (var6_4) ** GOTO lbl6
lbl85:
            // 4 sources

            if (var6_4 || var6_4) ** GOTO lbl6
            return;
lbl87:
            // 1 sources

            if (var6_4 || var6_4) ** GOTO lbl6
            var5_7 = var4_8.method_17777();
            if (var6_4 || var6_4) ** GOTO lbl6
            if (!this.isCrystalBase((class_2338)var5_7)) ** GOTO lbl97
            if (var6_4) ** GOTO lbl6
            if (!this.hasCrystalAt((class_2338)var5_7)) ** GOTO lbl97
            if (var6_4 || var6_4) ** GOTO lbl6
            this.armCrystalAttack((class_2338)var5_7);
            if (var6_4 || var6_4) ** GOTO lbl6
            return;
lbl97:
            // 2 sources

            if (var6_4 || var6_4) ** GOTO lbl6
            if (!this.canPlace((class_2338)var5_7)) ** GOTO lbl105
            if (var6_4 || var6_4) ** GOTO lbl6
            this.scheduleCrystal((class_2338)var5_7);
            if (var6_4) ** GOTO lbl6
            if (var8_2) {
                throw null;
            }
            ** GOTO lbl128
lbl105:
            // 1 sources

            if (var6_4 || var6_4) ** GOTO lbl6
            if (he.mc.field_1724.method_6047().method_31574(class_1802.field_8281)) ** GOTO lbl110
            if (var6_4) ** GOTO lbl6
            if (!he.mc.field_1724.method_6079().method_31574(class_1802.field_8281)) ** GOTO lbl118
            if (var6_4) ** GOTO lbl6
lbl110:
            // 2 sources

            if (var6_4 || var6_4) ** GOTO lbl6
            this.waitingObsidian = var5_7.method_10093(var4_8.method_17780());
            if (var6_4 || var6_4) ** GOTO lbl6
            this.waitingTicks = (int)he.emjd("emmp", emja(int ), (int)59);
            if (var6_4) ** GOTO lbl6
            if (var8_2) {
                throw null;
            }
            ** GOTO lbl128
lbl118:
            // 1 sources

            if (var6_4 || var6_4) ** GOTO lbl6
            if (he.mc.field_1687.method_8320((class_2338)var5_7).method_27852(class_2246.field_10540)) ** GOTO lbl123
            if (var6_4) ** GOTO lbl6
            if (!he.mc.field_1687.method_8320((class_2338)var5_7).method_27852(class_2246.field_9987)) ** GOTO lbl128
            if (var6_4) ** GOTO lbl6
lbl123:
            // 2 sources

            if (var6_4 || var6_4) ** GOTO lbl6
            if (this.isProtected((class_2338)var5_7)) ** GOTO lbl128
            if (var6_4 || var6_4) ** GOTO lbl6
            this.armCrystalAttack((class_2338)var5_7);
            if (var6_4) ** GOTO lbl6
lbl128:
            // 5 sources

            if (!var6_4 && !var6_4) ** break;
            ** continue;
            return;
lbl131:
            // 2 sources

            case 0: {
                var7_3 /* !! */  = (int)he.emjd("emmq", emja(int ), (int)60);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl181
            }
            case 1: {
                var7_3 /* !! */  = (int)he.emjd("emmr", emja(int ), (int)61);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl272
            }
            case 2: {
                var7_3 /* !! */  = (int)he.emjd("emms", emja(int ), (int)62);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl248
            }
            case 3: {
                var7_3 /* !! */  = (int)he.emjd("emmt", emja(int ), (int)63);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl485
            }
lbl151:
            // 2 sources

            case 4: {
                var7_3 /* !! */  = (int)he.emjd("emmu", emja(int ), (int)64);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl248
            }
lbl156:
            // 2 sources

            case 5: {
                var7_3 /* !! */  = (int)he.emjd("emmv", emja(int ), (int)65);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl244
            }
            case 6: {
                var7_3 /* !! */  = (int)he.emjd("emmw", emja(int ), (int)66);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl341
            }
            case 7: {
                var7_3 /* !! */  = (int)he.emjd("emmx", emja(int ), (int)67);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl263
            }
lbl171:
            // 2 sources

            case 8: {
                var7_3 /* !! */  = (int)he.emjd("emmy", emja(int ), (int)68);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl281
            }
lbl176:
            // 3 sources

            case 9: {
                var7_3 /* !! */  = (int)he.emjd("emmz", emja(int ), (int)69);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl253
            }
lbl181:
            // 3 sources

            case 10: {
                var7_3 /* !! */  = (int)he.emjd("emna", emja(int ), (int)70);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl309
            }
lbl186:
            // 3 sources

            case 11: {
                var7_3 /* !! */  = (int)he.emjd("emnb", emja(int ), (int)71);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl204
            }
lbl191:
            // 3 sources

            case 12: {
                var7_3 /* !! */  = (int)he.emjd("emnc", emja(int ), (int)72);
                if (!var8_2) ** GOTO lbl131
                throw null;
            }
lbl195:
            // 2 sources

            case 13: {
                var7_3 /* !! */  = (int)he.emjd("emnd", emja(int ), (int)73);
                if (!var8_2) ** GOTO lbl186
                throw null;
            }
            case 14: {
                var7_3 /* !! */  = (int)he.emjd("emne", emja(int ), (int)74);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl446
            }
lbl204:
            // 3 sources

            case 15: {
                var7_3 /* !! */  = (int)he.emjd("emnf", emja(int ), (int)75);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl377
            }
lbl209:
            // 4 sources

            case 16: {
                var7_3 /* !! */  = (int)he.emjd("emng", emja(int ), (int)76);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl341
            }
lbl214:
            // 3 sources

            case 17: {
                var7_3 /* !! */  = (int)he.emjd("emnh", emja(int ), (int)77);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl355
            }
            case 18: {
                var7_3 /* !! */  = (int)he.emjd("emni", emja(int ), (int)78);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl300
            }
lbl224:
            // 2 sources

            case 19: {
                var7_3 /* !! */  = (int)he.emjd("emnj", emja(int ), (int)79);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl258
            }
lbl229:
            // 2 sources

            case 20: {
                var7_3 /* !! */  = (int)he.emjd("emnk", emja(int ), (int)80);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl360
            }
            case 21: {
                var7_3 /* !! */  = (int)he.emjd("emnl", emja(int ), (int)81);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl446
            }
lbl239:
            // 2 sources

            case 22: {
                var7_3 /* !! */  = (int)he.emjd("emnm", emja(int ), (int)82);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl263
            }
lbl244:
            // 3 sources

            case 23: {
                var7_3 /* !! */  = (int)he.emjd("emnn", emja(int ), (int)83);
                if (!var8_2) ** GOTO lbl171
                throw null;
            }
lbl248:
            // 4 sources

            case 24: {
                var7_3 /* !! */  = (int)he.emjd("emno", emja(int ), (int)84);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl537
            }
lbl253:
            // 2 sources

            case 25: {
                var7_3 /* !! */  = (int)he.emjd("emnp", emja(int ), (int)85);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl327
            }
lbl258:
            // 4 sources

            case 26: {
                var7_3 /* !! */  = (int)he.emjd("emnq", emja(int ), (int)86);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl533
            }
lbl263:
            // 4 sources

            case 27: {
                var7_3 /* !! */  = (int)he.emjd("emnr", emja(int ), (int)87);
                if (!var8_2) ** GOTO lbl195
                throw null;
            }
lbl267:
            // 2 sources

            case 28: {
                var7_3 /* !! */  = (int)he.emjd("emns", emja(int ), (int)88);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl331
            }
lbl272:
            // 2 sources

            case 29: {
                var7_3 /* !! */  = (int)he.emjd("emnt", emja(int ), (int)89);
                if (!var8_2) ** GOTO lbl209
                throw null;
            }
lbl276:
            // 2 sources

            case 30: {
                var7_3 /* !! */  = (int)he.emjd("emnu", emja(int ), (int)90);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl309
            }
lbl281:
            // 2 sources

            case 31: {
                var7_3 /* !! */  = (int)he.emjd("emnv", emja(int ), (int)91);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl365
            }
lbl286:
            // 2 sources

            case 32: {
                var7_3 /* !! */  = (int)he.emjd("emnw", emja(int ), (int)92);
                if (!var8_2) ** GOTO lbl263
                throw null;
            }
lbl290:
            // 2 sources

            case 33: {
                var7_3 /* !! */  = (int)he.emjd("emnx", emja(int ), (int)93);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl493
            }
            case 34: {
                var7_3 /* !! */  = (int)he.emjd("emny", emja(int ), (int)94);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl392
            }
lbl300:
            // 2 sources

            case 35: {
                var7_3 /* !! */  = (int)he.emjd("emnz", emja(int ), (int)95);
                if (!var8_2) ** GOTO lbl258
                throw null;
            }
            case 36: {
                var7_3 /* !! */  = (int)he.emjd("emoa", emja(int ), (int)96);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl360
            }
lbl309:
            // 3 sources

            case 37: {
                var7_3 /* !! */  = (int)he.emjd("emob", emja(int ), (int)97);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl450
            }
lbl314:
            // 3 sources

            case 38: {
                var7_3 /* !! */  = (int)he.emjd("emoc", emja(int ), (int)98);
                if (!var8_2) ** GOTO lbl248
                throw null;
            }
lbl318:
            // 2 sources

            case 39: {
                var7_3 /* !! */  = (int)he.emjd("emod", emja(int ), (int)99);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl475
            }
            case 40: {
                var7_3 /* !! */  = (int)he.emjd("emoe", emja(int ), (int)100);
                if (!var8_2) ** GOTO lbl209
                throw null;
            }
lbl327:
            // 2 sources

            case 41: {
                var7_3 /* !! */  = (int)he.emjd("emof", emja(int ), (int)101);
                if (!var8_2) ** GOTO lbl176
                throw null;
            }
lbl331:
            // 3 sources

            case 42: {
                var7_3 /* !! */  = (int)he.emjd("emog", emja(int ), (int)102);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl455
            }
            case 43: {
                var7_3 /* !! */  = (int)he.emjd("emoh", emja(int ), (int)103);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl426
            }
lbl341:
            // 3 sources

            case 44: {
                var7_3 /* !! */  = (int)he.emjd("emoi", emja(int ), (int)104);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl400
            }
            case 45: {
                var7_3 /* !! */  = (int)he.emjd("emoj", emja(int ), (int)105);
                if (!var8_2) ** GOTO lbl214
                throw null;
            }
            case 46: {
                var7_3 /* !! */  = (int)he.emjd("emok", emja(int ), (int)106);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl471
            }
lbl355:
            // 2 sources

            case 47: {
                var7_3 /* !! */  = (int)he.emjd("emol", emja(int ), (int)107);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl558
            }
lbl360:
            // 3 sources

            case 48: {
                var7_3 /* !! */  = (int)he.emjd("emom", emja(int ), (int)108);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl553
            }
lbl365:
            // 3 sources

            case 49: {
                var7_3 /* !! */  = (int)he.emjd("emon", emja(int ), (int)109);
                if (var8_2) {
                    throw null;
                }
            }
lbl369:
            // 4 sources

            case 50: {
                var7_3 /* !! */  = (int)he.emjd("emoo", emja(int ), (int)110);
                if (!var8_2) ** GOTO lbl209
                throw null;
            }
            case 51: {
                var7_3 /* !! */  = (int)he.emjd("emop", emja(int ), (int)111);
                if (!var8_2) ** GOTO lbl258
                throw null;
            }
lbl377:
            // 3 sources

            case 52: {
                var7_3 /* !! */  = (int)he.emjd("emoq", emja(int ), (int)112);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl463
            }
            case 53: {
                var7_3 /* !! */  = (int)he.emjd("emor", emja(int ), (int)113);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl517
            }
lbl387:
            // 2 sources

            case 54: {
                do {
                    var7_3 /* !! */  = (int)he.emjd("emos", emja(int ), (int)114);
                } while (!var8_2);
                throw null;
            }
lbl392:
            // 3 sources

            case 55: {
                var7_3 /* !! */  = (int)he.emjd("emot", emja(int ), (int)115);
                if (!var8_2) ** GOTO lbl204
                throw null;
            }
lbl396:
            // 2 sources

            case 56: {
                var7_3 /* !! */  = (int)he.emjd("emou", emja(int ), (int)116);
                if (!var8_2) ** GOTO lbl214
                throw null;
            }
lbl400:
            // 3 sources

            case 57: {
                var7_3 /* !! */  = (int)he.emjd("emov", emja(int ), (int)117);
                if (!var8_2) ** GOTO lbl191
                throw null;
            }
lbl404:
            // 2 sources

            case 58: {
                var7_3 /* !! */  = (int)he.emjd("emow", emja(int ), (int)118);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl426
            }
            case 59: {
                var7_3 /* !! */  = (int)he.emjd("emox", emja(int ), (int)119);
                if (!var8_2) ** GOTO lbl224
                throw null;
            }
            case 60: {
                var7_3 /* !! */  = (int)he.emjd("emoy", emja(int ), (int)120);
                if (!var8_2) ** GOTO lbl396
                throw null;
            }
            case 61: {
                var7_3 /* !! */  = (int)he.emjd("emoz", emja(int ), (int)121);
                if (!var8_2) ** GOTO lbl286
                throw null;
            }
lbl421:
            // 2 sources

            case 62: {
                var7_3 /* !! */  = (int)he.emjd("empa", emja(int ), (int)122);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl509
            }
lbl426:
            // 3 sources

            case 63: {
                var7_3 /* !! */  = (int)he.emjd("empb", emja(int ), (int)123);
                if (!var8_2) ** GOTO lbl369
                throw null;
            }
            case 64: {
                var7_3 /* !! */  = (int)he.emjd("empc", emja(int ), (int)124);
                if (!var8_2) ** GOTO lbl176
                throw null;
            }
            case 65: {
                var7_3 /* !! */  = (int)he.emjd("empd", emja(int ), (int)125);
                if (!var8_2) ** GOTO lbl156
                throw null;
            }
lbl438:
            // 2 sources

            case 66: {
                var7_3 /* !! */  = (int)he.emjd("empe", emja(int ), (int)126);
                if (!var8_2) ** GOTO lbl314
                throw null;
            }
lbl442:
            // 2 sources

            case 67: {
                var7_3 /* !! */  = (int)he.emjd("empf", emja(int ), (int)127);
                if (!var8_2) ** GOTO lbl186
                throw null;
            }
lbl446:
            // 3 sources

            case 68: {
                var7_3 /* !! */  = (int)he.emjd("empg", emja(int ), (int)128);
                if (!var8_2) ** GOTO lbl229
                throw null;
            }
lbl450:
            // 2 sources

            case 69: {
                var7_3 /* !! */  = (int)he.emjd("emph", emja(int ), (int)129);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl505
            }
lbl455:
            // 2 sources

            case 70: {
                var7_3 /* !! */  = (int)he.emjd("empi", emja(int ), (int)130);
                if (!var8_2) ** GOTO lbl267
                throw null;
            }
            case 71: {
                var7_3 /* !! */  = (int)he.emjd("empj", emja(int ), (int)131);
                if (!var8_2) ** GOTO lbl438
                throw null;
            }
lbl463:
            // 2 sources

            case 72: {
                var7_3 /* !! */  = (int)he.emjd("empk", emja(int ), (int)132);
                if (!var8_2) ** GOTO lbl181
                throw null;
            }
            case 73: {
                var7_3 /* !! */  = (int)he.emjd("empl", emja(int ), (int)133);
                if (!var8_2) ** GOTO lbl151
                throw null;
            }
lbl471:
            // 3 sources

            case 74: {
                var7_3 /* !! */  = (int)he.emjd("empm", emja(int ), (int)134);
                if (!var8_2) ** GOTO lbl400
                throw null;
            }
lbl475:
            // 2 sources

            case 75: {
                var7_3 /* !! */  = (int)he.emjd("empn", emja(int ), (int)135);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl537
            }
lbl480:
            // 2 sources

            case 76: {
                var7_3 /* !! */  = (int)he.emjd("empo", emja(int ), (int)136);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl505
            }
lbl485:
            // 2 sources

            case 77: {
                var7_3 /* !! */  = (int)he.emjd("empp", emja(int ), (int)137);
                if (!var8_2) ** GOTO lbl471
                throw null;
            }
            case 78: {
                var7_3 /* !! */  = (int)he.emjd("empq", emja(int ), (int)138);
                if (!var8_2) ** GOTO lbl239
                throw null;
            }
lbl493:
            // 2 sources

            case 79: {
                var7_3 /* !! */  = (int)he.emjd("empr", emja(int ), (int)139);
                if (!var8_2) ** GOTO lbl377
                throw null;
            }
            case 80: {
                var7_3 /* !! */  = (int)he.emjd("emps", emja(int ), (int)140);
                if (!var8_2) ** GOTO lbl442
                throw null;
            }
lbl501:
            // 2 sources

            case 81: {
                var7_3 /* !! */  = (int)he.emjd("empt", emja(int ), (int)141);
                if (!var8_2) ** GOTO lbl244
                throw null;
            }
lbl505:
            // 3 sources

            case 82: {
                var7_3 /* !! */  = (int)he.emjd("empu", emja(int ), (int)142);
                if (!var8_2) ** GOTO lbl290
                throw null;
            }
lbl509:
            // 2 sources

            case 83: {
                var7_3 /* !! */  = (int)he.emjd("empv", emja(int ), (int)143);
                if (!var8_2) ** GOTO lbl191
                throw null;
            }
            case 84: {
                var7_3 /* !! */  = (int)he.emjd("empw", emja(int ), (int)144);
                if (!var8_2) ** GOTO lbl404
                throw null;
            }
lbl517:
            // 2 sources

            case 85: {
                var7_3 /* !! */  = (int)he.emjd("empx", emja(int ), (int)145);
                if (!var8_2) ** GOTO lbl276
                throw null;
            }
            case 86: {
                var7_3 /* !! */  = (int)he.emjd("empy", emja(int ), (int)146);
                if (!var8_2) ** GOTO lbl365
                throw null;
            }
            case 87: {
                var7_3 /* !! */  = (int)he.emjd("empz", emja(int ), (int)147);
                if (!var8_2) ** GOTO lbl314
                throw null;
            }
lbl529:
            // 2 sources

            case 88: {
                var7_3 /* !! */  = (int)he.emjd("emqa", emja(int ), (int)148);
                if (!var8_2) ** GOTO lbl331
                throw null;
            }
lbl533:
            // 2 sources

            case 89: {
                var7_3 /* !! */  = (int)he.emjd("emqb", emja(int ), (int)149);
                if (!var8_2) ** GOTO lbl318
                throw null;
            }
lbl537:
            // 3 sources

            case 90: {
                var7_3 /* !! */  = (int)he.emjd("emqc", emja(int ), (int)150);
                if (!var8_2) ** GOTO lbl421
                throw null;
            }
            case 91: {
                var7_3 /* !! */  = (int)he.emjd("emqd", emja(int ), (int)151);
                if (!var8_2) ** GOTO lbl480
                throw null;
            }
            case 92: {
                var7_3 /* !! */  = (int)he.emjd("emqe", emja(int ), (int)152);
                if (var8_2) {
                    throw null;
                }
            }
            case 93: {
                var7_3 /* !! */  = (int)he.emjd("emqf", emja(int ), (int)153);
                if (!var8_2) ** GOTO lbl501
                throw null;
            }
lbl553:
            // 2 sources

            case 94: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var7_3 /* !! */  = (int)he.emjd("emqg", emja(int ), (int)154);
                    if (!var8_2) ** GOTO lbl392
                    throw null;
                }
            }
lbl558:
            // 2 sources

            case 95: {
                var7_3 /* !! */  = (int)he.emjd("emqh", emja(int ), (int)155);
                if (!var8_2) ** GOTO lbl387
                throw null;
            }
            case 96: {
                var7_3 /* !! */  = (int)he.emjd("emqi", emja(int ), (int)156);
                if (!var8_2) ** GOTO lbl529
                throw null;
            }
            case 97: 
        }
        var7_3 /* !! */  = (int)he.emjd("emqj", emja(int ), (int)157);
        ** while (!var8_2)
lbl569:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void eofi() {
        he.emjr[300] = 3627877115462123815L;
        he.emjr[301] = 3909831775344773169L;
        he.emjr[302] = -8735800622517137811L;
        he.emjr[303] = 1247254904492000941L;
        he.emjr[304] = 6730000131467076645L;
        he.emjr[305] = 7357841254533884229L;
        he.emjr[306] = 7782205267960066681L;
        he.emjr[307] = -2590913893176464001L;
        he.emjr[308] = -7103631016523182788L;
        he.emjr[309] = 5680047053932181990L;
        he.emjr[310] = -8092282062852213441L;
        he.emjr[311] = -3691213599258352435L;
        he.emjr[312] = -4202062589218195778L;
        he.emjr[313] = -4709134710112969847L;
        he.emjr[314] = -7780320670175306635L;
        he.emjr[315] = -6554941841227123242L;
        he.emjr[316] = 78226553729101126L;
        he.emjr[317] = 8632310573357383854L;
        he.emjr[318] = 4252688477360838315L;
        he.emjr[319] = -2418510101904252898L;
        he.emjr[320] = 6074721999949080819L;
        he.emjr[321] = 3995503986259893820L;
        he.emjr[322] = -3115077525146846010L;
        he.emjr[323] = -7533000252335403189L;
        he.emjr[324] = 2536627033904289741L;
        he.emjr[325] = 684893858347068580L;
        he.emjr[326] = -2890687843138501068L;
        he.emjr[327] = 953760140253828711L;
        he.emjr[328] = -6472015724925707982L;
        he.emjr[329] = -5033532961777607438L;
        he.emjr[330] = 1806915666674524251L;
        he.emjr[331] = 3166582314857830087L;
        he.emjr[332] = -8775628602546440934L;
        he.emjr[333] = -9071229092335221364L;
        he.emjr[334] = 950929142146952530L;
        he.emjr[335] = 6621785368275985715L;
        he.emjr[336] = -4196675992818045373L;
        he.emjr[337] = -8180817612146629078L;
        he.emjr[338] = 4569901476477640413L;
        he.emjr[339] = -2749597569320685203L;
        he.emjr[340] = 1789661831156754941L;
        he.emjr[341] = -2841412455385465155L;
        he.emjr[342] = 6841772913528473400L;
        he.emjr[343] = 4337019949248620734L;
        he.emjr[344] = 8561660686631873347L;
        he.emjr[345] = -7661833664826863748L;
        he.emjr[346] = -4992546814963963380L;
        he.emjr[347] = 6242841682930728104L;
        he.emjr[348] = 8546264728751158363L;
        he.emjr[349] = -3998231712227021739L;
        he.emjr[350] = -8315589283939342610L;
        he.emjr[351] = -6214911347008197958L;
        he.emjr[352] = 4382161937202530870L;
        he.emjr[353] = -8016309114272020449L;
        he.emjr[354] = 4339939770789349260L;
        he.emjr[355] = 780739223529615961L;
        he.emjr[356] = 8143257643989680199L;
        he.emjr[357] = -7221896284418358019L;
        he.emjr[358] = -5759768193069525935L;
        he.emjr[359] = -3015866401481413635L;
        he.emjr[360] = -3350837420560951977L;
        he.emjr[361] = -9163319152140596234L;
        he.emjr[362] = -5152672336568027234L;
        he.emjr[363] = -2209748218932337104L;
    }

    private static /* synthetic */ void eoex() {
        he.emjc[300] = -221727698;
        he.emjc[301] = 1733968310;
        he.emjc[302] = -1818240326;
        he.emjc[303] = 1650331407;
        he.emjc[304] = -17492318;
        he.emjc[305] = 1009134253;
        he.emjc[306] = 1600371149;
        he.emjc[307] = -70587472;
        he.emjc[308] = -414290989;
        he.emjc[309] = 779795244;
        he.emjc[310] = 879341137;
        he.emjc[311] = -2020887224;
        he.emjc[312] = -1635487831;
        he.emjc[313] = 2139262687;
        he.emjc[314] = -270617039;
        he.emjc[315] = -606765121;
        he.emjc[316] = 1460559712;
        he.emjc[317] = -653375673;
        he.emjc[318] = 999518694;
        he.emjc[319] = -1593158944;
        he.emjc[320] = -1139406606;
        he.emjc[321] = -1426385220;
        he.emjc[322] = -1468145701;
        he.emjc[323] = -1974848018;
        he.emjc[324] = 982650600;
        he.emjc[325] = -1208656822;
        he.emjc[326] = 1952442000;
        he.emjc[327] = 1634154123;
        he.emjc[328] = -1210662286;
        he.emjc[329] = 326240419;
        he.emjc[330] = 205722589;
        he.emjc[331] = 751851463;
        he.emjc[332] = -1856915043;
        he.emjc[333] = -376994314;
        he.emjc[334] = 504962896;
        he.emjc[335] = 1033429922;
        he.emjc[336] = -1563695002;
        he.emjc[337] = 425633936;
        he.emjc[338] = 499873623;
        he.emjc[339] = 290619422;
        he.emjc[340] = 621108138;
        he.emjc[341] = 2076451477;
        he.emjc[342] = -1318218325;
        he.emjc[343] = 291972149;
        he.emjc[344] = 1644543247;
        he.emjc[345] = 1310688275;
        he.emjc[346] = -1863712811;
        he.emjc[347] = 803792909;
        he.emjc[348] = 915845412;
        he.emjc[349] = 1687299178;
        he.emjc[350] = -24939578;
        he.emjc[351] = -1350633982;
        he.emjc[352] = -1155425379;
        he.emjc[353] = 1731082989;
        he.emjc[354] = 1048300459;
        he.emjc[355] = -2140976321;
        he.emjc[356] = 1261630907;
        he.emjc[357] = 1340240635;
        he.emjc[358] = -569748223;
        he.emjc[359] = 1976094360;
        he.emjc[360] = 1608443900;
        he.emjc[361] = -1980309387;
        he.emjc[362] = 1601631810;
        he.emjc[363] = -2048469135;
        he.emjc[364] = -1111711727;
        he.emjc[365] = 439232963;
        he.emjc[366] = -38181538;
        he.emjc[367] = -342570499;
        he.emjc[368] = 579392350;
        he.emjc[369] = 861186140;
        he.emjc[370] = 667934643;
        he.emjc[371] = 1047584828;
        he.emjc[372] = 1562178819;
        he.emjc[373] = -791019052;
        he.emjc[374] = -1725473604;
        he.emjc[375] = -1587710580;
        he.emjc[376] = 783208962;
        he.emjc[377] = -1849502199;
        he.emjc[378] = -1173845412;
        he.emjc[379] = 105265452;
        he.emjc[380] = -2016798049;
        he.emjc[381] = -1687810676;
        he.emjc[382] = -131650490;
        he.emjc[383] = 125020090;
        he.emjc[384] = -350481287;
        he.emjc[385] = -912513981;
        he.emjc[386] = 1749894997;
        he.emjc[387] = -2096123298;
        he.emjc[388] = 117246392;
        he.emjc[389] = 1280694000;
        he.emjc[390] = 1875863832;
        he.emjc[391] = 2113488994;
        he.emjc[392] = 165460152;
        he.emjc[393] = 1858271312;
        he.emjc[394] = 1124793767;
        he.emjc[395] = -1826703550;
        he.emjc[396] = 692988635;
        he.emjc[397] = 2001389195;
        he.emjc[398] = 271694022;
        he.emjc[399] = 498926405;
    }

    private static /* synthetic */ void eofh() {
        he.emjr[200] = -8813857683894058698L;
        he.emjr[201] = -3259369392573720372L;
        he.emjr[202] = -9220533465314634231L;
        he.emjr[203] = -4106250332375089775L;
        he.emjr[204] = 3191707641640384675L;
        he.emjr[205] = 7105117388482461787L;
        he.emjr[206] = 890922788411691064L;
        he.emjr[207] = -5691766700177883866L;
        he.emjr[208] = 4664001535425018128L;
        he.emjr[209] = 6604925670688104011L;
        he.emjr[210] = 4781328406587769695L;
        he.emjr[211] = -6098473199501131758L;
        he.emjr[212] = 1309910718872738499L;
        he.emjr[213] = -1130050830578020929L;
        he.emjr[214] = 7005770970540778311L;
        he.emjr[215] = -2790075761712162163L;
        he.emjr[216] = -3961590997445544490L;
        he.emjr[217] = 7675638016792709780L;
        he.emjr[218] = 4201382099743607143L;
        he.emjr[219] = 1141893757197170347L;
        he.emjr[220] = -4317783835333501250L;
        he.emjr[221] = -3312826273146853033L;
        he.emjr[222] = -7182892088772669211L;
        he.emjr[223] = 8759604975859509198L;
        he.emjr[224] = 674589362473370716L;
        he.emjr[225] = 2835098247162180750L;
        he.emjr[226] = -4756174318206456371L;
        he.emjr[227] = 7468556873810691241L;
        he.emjr[228] = 9146371401093731959L;
        he.emjr[229] = -2838111278135747618L;
        he.emjr[230] = -7771018924977293380L;
        he.emjr[231] = -5048847018847581563L;
        he.emjr[232] = 4269699472882458220L;
        he.emjr[233] = 8855526043534365978L;
        he.emjr[234] = -7914812591700723149L;
        he.emjr[235] = -6634210387710397524L;
        he.emjr[236] = 6736245634060839779L;
        he.emjr[237] = 3702338402541765147L;
        he.emjr[238] = 4460463868609630641L;
        he.emjr[239] = -5001999850737160614L;
        he.emjr[240] = -8656304940594277364L;
        he.emjr[241] = -955182763557507711L;
        he.emjr[242] = -6945812302631244343L;
        he.emjr[243] = 5136862443128040790L;
        he.emjr[244] = 5770342412954386202L;
        he.emjr[245] = 7687833956878030138L;
        he.emjr[246] = -7339793870839193877L;
        he.emjr[247] = -8238286098910935699L;
        he.emjr[248] = 2007970553397486662L;
        he.emjr[249] = -3092269779049670371L;
        he.emjr[250] = 3727310771816784375L;
        he.emjr[251] = -4752870922080733070L;
        he.emjr[252] = -1721477418354302475L;
        he.emjr[253] = -7167547415406228050L;
        he.emjr[254] = 5532315004702399721L;
        he.emjr[255] = -4670556904480916054L;
        he.emjr[256] = 2682840139873523853L;
        he.emjr[257] = -8795887767288805419L;
        he.emjr[258] = 5599449380149411471L;
        he.emjr[259] = -300085532666331960L;
        he.emjr[260] = -2092690454275630861L;
        he.emjr[261] = 4461241489954883770L;
        he.emjr[262] = -4587230650948504905L;
        he.emjr[263] = 5980015628429022259L;
        he.emjr[264] = -4099618641985624385L;
        he.emjr[265] = 7977950700949233340L;
        he.emjr[266] = -763682015789009837L;
        he.emjr[267] = 2289707379221391171L;
        he.emjr[268] = -6504734104501960502L;
        he.emjr[269] = -2849809799163621180L;
        he.emjr[270] = -5848222188851299125L;
        he.emjr[271] = 1716907678573794982L;
        he.emjr[272] = 580442147055509533L;
        he.emjr[273] = 6403473663158898939L;
        he.emjr[274] = -3359850588510996476L;
        he.emjr[275] = 8066403752150640916L;
        he.emjr[276] = -2087789725247510518L;
        he.emjr[277] = -2527300778542489814L;
        he.emjr[278] = -1329179791192241774L;
        he.emjr[279] = -6402809270823627985L;
        he.emjr[280] = 1786811563593220030L;
        he.emjr[281] = 6389837739645005095L;
        he.emjr[282] = 394523587741879063L;
        he.emjr[283] = -631620953496241712L;
        he.emjr[284] = -5830211026381269639L;
        he.emjr[285] = 8571878492995652928L;
        he.emjr[286] = 748664433434310671L;
        he.emjr[287] = -3342152484075509667L;
        he.emjr[288] = 3827294944013933443L;
        he.emjr[289] = 2911443532485915505L;
        he.emjr[290] = -6926156173230375654L;
        he.emjr[291] = 264312862660941195L;
        he.emjr[292] = -5474470710251175485L;
        he.emjr[293] = -618570492344084190L;
        he.emjr[294] = 8431132009477730183L;
        he.emjr[295] = 8138323032887836552L;
        he.emjr[296] = 7681070301146476224L;
        he.emjr[297] = -2650508543317479436L;
        he.emjr[298] = 3381837933566789153L;
        he.emjr[299] = -4879933038311554879L;
    }

    private static /* synthetic */ void eoev() {
        he.emjc[100] = -1881567738;
        he.emjc[101] = 115669342;
        he.emjc[102] = -1464137781;
        he.emjc[103] = -1954929787;
        he.emjc[104] = 1321865338;
        he.emjc[105] = 468154723;
        he.emjc[106] = -1447404904;
        he.emjc[107] = -1219093755;
        he.emjc[108] = -1419430050;
        he.emjc[109] = 1094315292;
        he.emjc[110] = 276731237;
        he.emjc[111] = -1579461757;
        he.emjc[112] = -1155509514;
        he.emjc[113] = 1967782378;
        he.emjc[114] = 853660685;
        he.emjc[115] = -1881941073;
        he.emjc[116] = 578612368;
        he.emjc[117] = -1793984721;
        he.emjc[118] = -1122768561;
        he.emjc[119] = -1762990579;
        he.emjc[120] = -232692027;
        he.emjc[121] = 1447183174;
        he.emjc[122] = 1081524912;
        he.emjc[123] = 1098000650;
        he.emjc[124] = -1599808002;
        he.emjc[125] = 1081504691;
        he.emjc[126] = -1602050401;
        he.emjc[127] = 2090118224;
        he.emjc[128] = 1008340281;
        he.emjc[129] = 1804653723;
        he.emjc[130] = 1798156505;
        he.emjc[131] = -1705470118;
        he.emjc[132] = -1394787571;
        he.emjc[133] = -334894218;
        he.emjc[134] = -64737009;
        he.emjc[135] = 1826018634;
        he.emjc[136] = 686125803;
        he.emjc[137] = -1465323262;
        he.emjc[138] = 1054199749;
        he.emjc[139] = 1864933882;
        he.emjc[140] = 1947831974;
        he.emjc[141] = 1660253818;
        he.emjc[142] = -986342020;
        he.emjc[143] = 804803664;
        he.emjc[144] = -1288842188;
        he.emjc[145] = 67217927;
        he.emjc[146] = -431394797;
        he.emjc[147] = -224134698;
        he.emjc[148] = -476632138;
        he.emjc[149] = 1966075511;
        he.emjc[150] = -2105068951;
        he.emjc[151] = -1011509367;
        he.emjc[152] = 946680245;
        he.emjc[153] = 395164204;
        he.emjc[154] = -1698362809;
        he.emjc[155] = 626926576;
        he.emjc[156] = -370890322;
        he.emjc[157] = 663286102;
        he.emjc[158] = 2006979792;
        he.emjc[159] = 1432629092;
        he.emjc[160] = 885280174;
        he.emjc[161] = 395631100;
        he.emjc[162] = 1330647086;
        he.emjc[163] = 201228036;
        he.emjc[164] = -219007712;
        he.emjc[165] = -1386158702;
        he.emjc[166] = 1405998710;
        he.emjc[167] = -318641636;
        he.emjc[168] = 565583401;
        he.emjc[169] = -1481136630;
        he.emjc[170] = 1628655324;
        he.emjc[171] = 793583447;
        he.emjc[172] = -1393873651;
        he.emjc[173] = -29140001;
        he.emjc[174] = -747299778;
        he.emjc[175] = -1551726519;
        he.emjc[176] = -31816399;
        he.emjc[177] = 8989341;
        he.emjc[178] = 2024813979;
        he.emjc[179] = 1656584964;
        he.emjc[180] = -1591153770;
        he.emjc[181] = 1425131688;
        he.emjc[182] = -1923016392;
        he.emjc[183] = -2057417121;
        he.emjc[184] = -1649640191;
        he.emjc[185] = -2120975752;
        he.emjc[186] = 2115900765;
        he.emjc[187] = 53984062;
        he.emjc[188] = -71630966;
        he.emjc[189] = 804323613;
        he.emjc[190] = -626489158;
        he.emjc[191] = -1664073778;
        he.emjc[192] = 314095915;
        he.emjc[193] = 832725290;
        he.emjc[194] = -405123817;
        he.emjc[195] = 1926886235;
        he.emjc[196] = -629459545;
        he.emjc[197] = -489118335;
        he.emjc[198] = 1477766223;
        he.emjc[199] = -824332027;
    }
}

