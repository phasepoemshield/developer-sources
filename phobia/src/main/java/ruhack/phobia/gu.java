/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1268
 *  net.minecraft.class_1657
 *  net.minecraft.class_1703
 *  net.minecraft.class_1713
 *  net.minecraft.class_1735
 *  net.minecraft.class_1802
 *  net.minecraft.class_2678
 *  net.minecraft.class_465
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.Locale;
import net.minecraft.class_1268;
import net.minecraft.class_1657;
import net.minecraft.class_1703;
import net.minecraft.class_1713;
import net.minecraft.class_1735;
import net.minecraft.class_1802;
import net.minecraft.class_2678;
import net.minecraft.class_465;
import ruhack.phobia.aw;
import ruhack.phobia.cn;
import ruhack.phobia.cr;
import ruhack.phobia.cr$Type;
import ruhack.phobia.df;
import ruhack.phobia.ds;
import ruhack.phobia.du;
import ruhack.phobia.ka;
import ruhack.phobia.kb;
import ruhack.phobia.kf;
import ruhack.phobia.kg;
import ruhack.phobia.nv;
import ruhack.phobia.pr;

public final class gu
extends ds {
    private final ka disable;
    private static final String SERVER_MENU_TITLE = "\u0412\u044b\u0431\u043e\u0440 \u0441\u0435\u0440\u0432\u0435\u0440\u0430";
    private final kf serverMode;
    public static final int b;
    private final pr clickTimer;
    private int compassRestoreSlot;
    private final kg grief;
    private final pr compassTimer;
    private int requestedGrief;
    private long compassActionAt;
    private static long[] cvxp;
    private int pageSwitches;
    private boolean joining;
    public static final boolean c;
    public static final boolean a;
    private int targetGrief;
    private static int[] cvvv;
    private int lockedTargetSlot;
    private static int[] cvvy;
    private long targetClickedAt;
    private int compassStage;
    private static final String GRIEF_SURVIVAL_TITLE = "\u0413\u0440\u0438\u0444\u0435\u0440\u0441\u043a\u043e\u0435 \u0432\u044b\u0436\u0438\u0432\u0430\u043d\u0438\u0435 (1.16.5-1.20.4)";
    private static final String WORLD_MENU_TITLE = "\u0412\u044b\u0431\u043e\u0440 \u043c\u0438\u0440\u0430 \u0433\u0440\u0438\u0444\u0430";
    private final kb keepEnabled;
    private static final long MIN_CLICK_DELAY_MS = 30L;
    private boolean keepEnabledAfterJoin;
    private static final int NEXT_PAGE_SLOT = 44;
    public static final long go = 4084027379925408184L;
    private static final int MAX_PAGE_SWITCHES = 5;
    private final kg speed;
    private static long[] cvxr;

    private static /* synthetic */ long cvxo(int n2) {
        return cvxp[n2] ^ cvxr[n2];
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public boolean isJoining() {
        Object object = go;
        boolean bl2 = true;
        block15: while (true) {
            CallSite callSite;
            if (!bl2 || (bl2 = false) || !true) {
                object = callSite - gu.cvwa("cwpo", cvxo(int ), (int)144);
            }
            switch ((int)object) {
                case -1855170120: {
                    break block15;
                }
                case -1418552000: {
                    callSite = gu.cvwa("cwpp", cvxo(int ), (int)145);
                    continue block15;
                }
                case -1066069529: {
                    callSite = gu.cvwa("cwpq", cvxo(int ), (int)146);
                    continue block15;
                }
                case -830609765: {
                    callSite = gu.cvwa("cwpr", cvxo(int ), (int)147);
                    continue block15;
                }
            }
            break;
        }
        boolean bl3 = c;
        Object object2 = go;
        boolean bl4 = true;
        block16: while (true) {
            CallSite callSite;
            if (!bl4 || (bl4 = false) || !true) {
                object2 = callSite - gu.cvwa("cwps", cvxo(int ), (int)148);
            }
            switch ((int)object2) {
                case -1855170120: {
                    break block16;
                }
                case -1502938590: {
                    callSite = gu.cvwa("cwpt", cvxo(int ), (int)149);
                    continue block16;
                }
                case 1592169477: {
                    callSite = gu.cvwa("cwpu", cvxo(int ), (int)150);
                    continue block16;
                }
            }
            break;
        }
        int n2 = b;
        Object object3 = go;
        block17: while (true) {
            switch ((int)object3) {
                case -1855170120: {
                    break block17;
                }
                case -169215821: {
                    object3 = gu.cvwa("cwpw", cvxo(int ), (int)152) - gu.cvwa("cwpv", cvxo(int ), (int)151);
                    continue block17;
                }
            }
            break;
        }
        boolean bl5 = a;
        if (bl3) {
            throw null;
        }
        if (bl5) return (boolean)gu.cvwa("cwpx", cvvt(int ), (int)262);
        if (bl5) return (boolean)gu.cvwa("cwpx", cvvt(int ), (int)262);
        while (true) {
            long l2;
            Object object4;
            if ((object4 = (l2 = go - gu.cvwa("cwpy", cvxo(int ), (int)153)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (object4 == gu.cvwa("cwpz", cvvt(int ), (int)263)) {
                return this.joining;
            }
            object4 = gu.cvwa("cwqa", cvvt(int ), (int)264);
        }
    }

    private static /* synthetic */ void cxsa() {
        gu.cvvv[200] = 299048725;
        gu.cvvv[201] = 1865722006;
        gu.cvvv[202] = -482308686;
        gu.cvvv[203] = 1092246418;
        gu.cvvv[204] = -1306642936;
        gu.cvvv[205] = -997766977;
        gu.cvvv[206] = -921927442;
        gu.cvvv[207] = 289701599;
        gu.cvvv[208] = -1047536902;
        gu.cvvv[209] = -2072285890;
        gu.cvvv[210] = 513147005;
        gu.cvvv[211] = 1395278521;
        gu.cvvv[212] = -1293522670;
        gu.cvvv[213] = 1450483448;
        gu.cvvv[214] = -1902659651;
        gu.cvvv[215] = 1228937913;
        gu.cvvv[216] = 1588046075;
        gu.cvvv[217] = 582012786;
        gu.cvvv[218] = -606890367;
        gu.cvvv[219] = -836673176;
        gu.cvvv[220] = 1296650723;
        gu.cvvv[221] = 1953810441;
        gu.cvvv[222] = 1423622840;
        gu.cvvv[223] = -2079915761;
        gu.cvvv[224] = 1114934335;
        gu.cvvv[225] = 1824171995;
        gu.cvvv[226] = -1020423230;
        gu.cvvv[227] = 505175537;
        gu.cvvv[228] = 618046885;
        gu.cvvv[229] = 1783508838;
        gu.cvvv[230] = 951693606;
        gu.cvvv[231] = -1695705142;
        gu.cvvv[232] = -45263831;
        gu.cvvv[233] = -1924718114;
        gu.cvvv[234] = -1668142209;
        gu.cvvv[235] = 138317697;
        gu.cvvv[236] = 885387104;
        gu.cvvv[237] = 1528404185;
        gu.cvvv[238] = -782683033;
        gu.cvvv[239] = -888398441;
        gu.cvvv[240] = 1240605373;
        gu.cvvv[241] = -928089138;
        gu.cvvv[242] = -811593450;
        gu.cvvv[243] = 1165887747;
        gu.cvvv[244] = -883081032;
        gu.cvvv[245] = 1778418202;
        gu.cvvv[246] = 1622042826;
        gu.cvvv[247] = 1265044800;
        gu.cvvv[248] = -1164787817;
        gu.cvvv[249] = 1017287604;
        gu.cvvv[250] = 624801613;
        gu.cvvv[251] = 699021943;
        gu.cvvv[252] = -1351581272;
        gu.cvvv[253] = -788102993;
        gu.cvvv[254] = 1157934629;
        gu.cvvv[255] = 121695963;
        gu.cvvv[256] = -1350654478;
        gu.cvvv[257] = -148308198;
        gu.cvvv[258] = -1486439046;
        gu.cvvv[259] = 1361902096;
        gu.cvvv[260] = 1288361707;
        gu.cvvv[261] = -138314754;
        gu.cvvv[262] = -1844756198;
        gu.cvvv[263] = -1892649061;
        gu.cvvv[264] = 600625828;
        gu.cvvv[265] = 1078465762;
        gu.cvvv[266] = -653649667;
        gu.cvvv[267] = -1917206225;
        gu.cvvv[268] = 1984560900;
        gu.cvvv[269] = -1480799896;
        gu.cvvv[270] = 472984570;
        gu.cvvv[271] = -462378805;
        gu.cvvv[272] = -743045157;
        gu.cvvv[273] = -926380793;
        gu.cvvv[274] = 1061537819;
        gu.cvvv[275] = 101424846;
        gu.cvvv[276] = -235078866;
        gu.cvvv[277] = 1049637305;
        gu.cvvv[278] = 181539405;
        gu.cvvv[279] = -1658431604;
        gu.cvvv[280] = 2108939315;
        gu.cvvv[281] = 1657771563;
        gu.cvvv[282] = 990296817;
        gu.cvvv[283] = 929868367;
        gu.cvvv[284] = 1408375761;
        gu.cvvv[285] = -1921829250;
        gu.cvvv[286] = -1950079822;
        gu.cvvv[287] = 1711226745;
        gu.cvvv[288] = -1393630497;
        gu.cvvv[289] = -808085057;
        gu.cvvv[290] = -360099163;
        gu.cvvv[291] = 1246991188;
        gu.cvvv[292] = 1476587287;
        gu.cvvv[293] = -1758167605;
        gu.cvvv[294] = 1214318905;
        gu.cvvv[295] = -1463049431;
        gu.cvvv[296] = -128232023;
        gu.cvvv[297] = 1310348835;
        gu.cvvv[298] = -1026107493;
        gu.cvvv[299] = 945151986;
    }

    private static /* synthetic */ void cxsq() {
        gu.cvxp[200] = 7707885942011244993L;
        gu.cvxp[201] = -3278689776193694104L;
        gu.cvxp[202] = 5997896306883621814L;
        gu.cvxp[203] = -1325267788443633295L;
        gu.cvxp[204] = -6508739363997685462L;
        gu.cvxp[205] = 6796482931748658209L;
        gu.cvxp[206] = -227908531681409341L;
        gu.cvxp[207] = 7167493650619437153L;
        gu.cvxp[208] = -6155053236708124480L;
        gu.cvxp[209] = -349003772241514690L;
        gu.cvxp[210] = 2764068350304127872L;
        gu.cvxp[211] = 8995758918949924921L;
        gu.cvxp[212] = 335422402971494186L;
        gu.cvxp[213] = 6659542399155467073L;
        gu.cvxp[214] = 4205837573280057882L;
        gu.cvxp[215] = 9072640492760784015L;
        gu.cvxp[216] = 997389624841949476L;
        gu.cvxp[217] = 5720778781549275817L;
        gu.cvxp[218] = 4081078462082755180L;
        gu.cvxp[219] = 4036776383840697201L;
        gu.cvxp[220] = -3774639484204889859L;
        gu.cvxp[221] = -2718910634577992757L;
        gu.cvxp[222] = -3374305225505930780L;
        gu.cvxp[223] = 6420791728097520276L;
        gu.cvxp[224] = -310516001103741797L;
        gu.cvxp[225] = 5547687136228836290L;
        gu.cvxp[226] = -8875485416688927359L;
        gu.cvxp[227] = -4595900247358619699L;
        gu.cvxp[228] = 79995610913288857L;
        gu.cvxp[229] = -8572806296634742143L;
        gu.cvxp[230] = 9029327407414222648L;
        gu.cvxp[231] = 3062901008627662664L;
        gu.cvxp[232] = 6075445460553211507L;
        gu.cvxp[233] = 2716001673193654112L;
        gu.cvxp[234] = -5531243237584682541L;
        gu.cvxp[235] = -4371548158418480996L;
        gu.cvxp[236] = 3970848058074020397L;
        gu.cvxp[237] = 8003717984233565822L;
        gu.cvxp[238] = 5596436812498309459L;
        gu.cvxp[239] = -7379258547081351872L;
        gu.cvxp[240] = 367325800814164998L;
        gu.cvxp[241] = 1490582676740265462L;
        gu.cvxp[242] = -67786982572143803L;
        gu.cvxp[243] = 6158501473063489911L;
        gu.cvxp[244] = 996237219683968851L;
        gu.cvxp[245] = -4439735976385662874L;
        gu.cvxp[246] = 4425925418855142181L;
        gu.cvxp[247] = 8537757719415813583L;
        gu.cvxp[248] = -7102187310571254277L;
        gu.cvxp[249] = -5506665415334178438L;
        gu.cvxp[250] = -8737935177759152984L;
        gu.cvxp[251] = -303005256917812552L;
        gu.cvxp[252] = 3493342413486220546L;
        gu.cvxp[253] = -3931766447292256528L;
        gu.cvxp[254] = 3422446931688791251L;
        gu.cvxp[255] = 1711144664542211852L;
        gu.cvxp[256] = -8165441709759312551L;
        gu.cvxp[257] = 4689764181912736863L;
        gu.cvxp[258] = -6342663353483060336L;
        gu.cvxp[259] = -4192010605561680694L;
        gu.cvxp[260] = -5322718531577814808L;
        gu.cvxp[261] = -7839143627596020922L;
        gu.cvxp[262] = -4744741360301297010L;
        gu.cvxp[263] = 9033852538440362209L;
        gu.cvxp[264] = -2748377634913338352L;
        gu.cvxp[265] = 3931606684389245938L;
        gu.cvxp[266] = 8265226696012864193L;
        gu.cvxp[267] = -2738332178925553503L;
        gu.cvxp[268] = 1359298966956089596L;
        gu.cvxp[269] = 4696967600413193965L;
        gu.cvxp[270] = -6612706922001539555L;
        gu.cvxp[271] = -1965876756227587119L;
        gu.cvxp[272] = -5050037767262840037L;
        gu.cvxp[273] = 4724837344715982357L;
        gu.cvxp[274] = -4346017632679256829L;
        gu.cvxp[275] = -6739075255426484344L;
        gu.cvxp[276] = -6273838592894215789L;
        gu.cvxp[277] = 7231636824305741136L;
        gu.cvxp[278] = -6774377079477501737L;
        gu.cvxp[279] = -6861760518957889252L;
        gu.cvxp[280] = -4390755032287899583L;
        gu.cvxp[281] = -1100013595462823023L;
        gu.cvxp[282] = -2430302003488156053L;
        gu.cvxp[283] = 3021942615195730665L;
        gu.cvxp[284] = 7376389924912033578L;
        gu.cvxp[285] = -5091909407138644063L;
        gu.cvxp[286] = 3199300710148049963L;
        gu.cvxp[287] = 1948958991908774839L;
        gu.cvxp[288] = 1321449168400986210L;
        gu.cvxp[289] = -5994632062406828523L;
        gu.cvxp[290] = 6770766470514243686L;
        gu.cvxp[291] = -1812696619848478255L;
        gu.cvxp[292] = -7506013837419190946L;
        gu.cvxp[293] = 1386044093865085721L;
        gu.cvxp[294] = -735372497148934771L;
        gu.cvxp[295] = -9031414338970808627L;
        gu.cvxp[296] = 4603825021086526918L;
        gu.cvxp[297] = 5535217740934946644L;
        gu.cvxp[298] = -101125135812914343L;
        gu.cvxp[299] = 8314918183746865706L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private int findTargetGriefSlot(class_1703 var1_1) {
        v0 /* !! */  = gu.go;
        if (true) ** GOTO lbl5
        block70: while (true) {
            v0 /* !! */  = (long)(v1 - gu.cvwa("cxgc", cvxo(int ), (int)255));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1855170120: {
                    break block70;
                }
                case -482567021: {
                    v1 = gu.cvwa("cxgd", cvxo(int ), (int)256);
                    continue block70;
                }
                case 2025243348: {
                    v1 = gu.cvwa("cxge", cvxo(int ), (int)257);
                    continue block70;
                }
            }
            break;
        }
        var7_2 = gu.c;
        v2 /* !! */  = gu.go;
        if (true) ** GOTO lbl19
        block71: while (true) {
            v2 /* !! */  = (long)(v3 - gu.cvwa("cxgf", cvxo(int ), (int)258));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1855170120: {
                    break block71;
                }
                case 1405872019: {
                    v3 = gu.cvwa("cxgg", cvxo(int ), (int)259);
                    continue block71;
                }
                case 1877462276: {
                    v3 = gu.cvwa("cxgh", cvxo(int ), (int)260);
                    continue block71;
                }
            }
            break;
        }
        var6_3 /* !! */  = gu.b;
        v4 /* !! */  = gu.go;
        if (true) ** GOTO lbl33
        block72: while (true) {
            v4 /* !! */  = (long)(gu.cvwa("cxgj", cvxo(int ), (int)262) - gu.cvwa("cxgi", cvxo(int ), (int)261));
lbl33:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1855170120: {
                    break block72;
                }
                case 1824591775: {
                    continue block72;
                }
            }
            break;
        }
        var5_4 = gu.a;
        if (var7_2) {
            throw null;
lbl41:
            // 12 sources

            return (int)gu.cvwa("cxgk", cvvt(int ), (int)580);
        }
        if (var5_4 || var5_4) ** GOTO lbl41
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_0 = gu.go - gu.cvwa("cxgl", cvxo(int ), (int)263)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == gu.cvwa("cxgm", cvvt(int ), (int)581)) break;
            v5 /* !! */  = (long)gu.cvwa("cxgn", cvvt(int ), (int)582);
        }
        v6 /* !! */  = gu.go;
        if (true) ** GOTO lbl53
        block75: while (true) {
            v6 /* !! */  = (long)(gu.cvwa("cxgp", cvxo(int ), (int)265) - gu.cvwa("cxgo", cvxo(int ), (int)264));
lbl53:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case -1855170120: {
                    break block75;
                }
                case -1499184823: {
                    continue block75;
                }
            }
            break;
        }
        v7 = "\u0413\u0420\u0418\u0424 #" + this.targetGrief;
        while (true) {
            if ((v8 /* !! */  = (cfr_temp_1 = gu.go - gu.cvwa("cxgq", cvxo(int ), (int)266)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v8 /* !! */  == gu.cvwa("cxgr", cvvt(int ), (int)583)) break;
            v8 /* !! */  = (long)gu.cvwa("cxgs", cvvt(int ), (int)584);
        }
        while (true) {
            if ((v9 /* !! */  = (cfr_temp_2 = gu.go - gu.cvwa("cxgt", cvxo(int ), (int)267)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v9 /* !! */  == gu.cvwa("cxgu", cvvt(int ), (int)585)) break;
            v9 /* !! */  = (long)gu.cvwa("cxgv", cvvt(int ), (int)586);
        }
        var2_5 = v7.toUpperCase(Locale.ROOT);
        if (var5_4 || var5_4) ** GOTO lbl41
        var3_6 = gu.cvwa("cxgw", cvvt(int ), (int)587);
        if (var5_4) ** GOTO lbl41
        block78: while (true) {
            if (var5_4 || var5_4) ** GOTO lbl41
            v10 /* !! */  = gu.go;
            if (true) ** GOTO lbl79
            block79: while (true) {
                v10 /* !! */  = (long)(v11 - gu.cvwa("cxgx", cvxo(int ), (int)268));
lbl79:
                // 2 sources

                switch ((int)v10 /* !! */ ) {
                    case -1855170120: {
                        break block79;
                    }
                    case 1176876935: {
                        v11 = gu.cvwa("cxgy", cvxo(int ), (int)269);
                        continue block79;
                    }
                    case 1899425595: {
                        v11 = gu.cvwa("cxgz", cvxo(int ), (int)270);
                        continue block79;
                    }
                }
                break;
            }
            v12 = var1_1.field_7761;
            while (true) {
                if ((v13 /* !! */  = (cfr_temp_3 = gu.go - gu.cvwa("cxha", cvxo(int ), (int)271)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v13 /* !! */  == gu.cvwa("cxhb", cvvt(int ), (int)588)) break;
                v13 /* !! */  = (long)gu.cvwa("cxhc", cvvt(int ), (int)589);
            }
            if (var3_6 >= v12.size()) ** GOTO lbl199
            if (var5_4 || var5_4) ** GOTO lbl41
            while (true) {
                if ((v14 /* !! */  = (cfr_temp_4 = gu.go - gu.cvwa("cxhd", cvxo(int ), (int)272)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                if (v14 /* !! */  == gu.cvwa("cxhe", cvvt(int ), (int)590)) break;
                v14 /* !! */  = (long)gu.cvwa("cxhf", cvvt(int ), (int)591);
            }
            v15 = var1_1.field_7761;
            v16 /* !! */  = gu.go;
            if (true) ** GOTO lbl106
            block82: while (true) {
                v16 /* !! */  = (long)(gu.cvwa("cxhh", cvxo(int ), (int)274) - gu.cvwa("cxhg", cvxo(int ), (int)273));
lbl106:
                // 2 sources

                switch ((int)v16 /* !! */ ) {
                    case -1855170120: {
                        break block82;
                    }
                    case -1410093815: {
                        continue block82;
                    }
                }
                break;
            }
            var4_7 = (class_1735)v15.get((int)var3_6);
            if (var5_4 || var5_4) ** GOTO lbl41
            while (true) {
                if ((v17 /* !! */  = (cfr_temp_5 = gu.go - gu.cvwa("cxhi", cvxo(int ), (int)275)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                if (v17 /* !! */  == gu.cvwa("cxhj", cvvt(int ), (int)592)) break;
                v17 /* !! */  = (long)gu.cvwa("cxhk", cvvt(int ), (int)593);
            }
            v18 = var4_7.method_7677();
            v19 /* !! */  = gu.go;
            if (true) ** GOTO lbl123
            block84: while (true) {
                v19 /* !! */  = (long)(v20 - gu.cvwa("cxhl", cvxo(int ), (int)276));
lbl123:
                // 2 sources

                switch ((int)v19 /* !! */ ) {
                    case -1855170120: {
                        break block84;
                    }
                    case -1673590900: {
                        v20 = gu.cvwa("cxhm", cvxo(int ), (int)277);
                        continue block84;
                    }
                    case -817138038: {
                        v20 = gu.cvwa("cxhn", cvxo(int ), (int)278);
                        continue block84;
                    }
                }
                break;
            }
            if (v18.method_7960()) ** GOTO lbl194
            if (var5_4) ** GOTO lbl41
            v21 /* !! */  = gu.go;
            if (true) ** GOTO lbl138
            block85: while (true) {
                v21 /* !! */  = (long)(gu.cvwa("cxhp", cvxo(int ), (int)280) - gu.cvwa("cxho", cvxo(int ), (int)279));
lbl138:
                // 2 sources

                switch ((int)v21 /* !! */ ) {
                    case -1855170120: {
                        break block85;
                    }
                    case 864867302: {
                        continue block85;
                    }
                }
                break;
            }
            v22 = var4_7.method_7677();
            v23 /* !! */  = gu.go;
            if (true) ** GOTO lbl148
            block86: while (true) {
                v23 /* !! */  = (long)(gu.cvwa("cxhr", cvxo(int ), (int)282) - gu.cvwa("cxhq", cvxo(int ), (int)281));
lbl148:
                // 2 sources

                switch ((int)v23 /* !! */ ) {
                    case -1855170120: {
                        break block86;
                    }
                    case -1138633920: {
                        continue block86;
                    }
                }
                break;
            }
            v24 = v22.method_7964();
            while (true) {
                if ((v25 /* !! */  = (cfr_temp_6 = gu.go - gu.cvwa("cxhs", cvxo(int ), (int)283)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                if (v25 /* !! */  == gu.cvwa("cxht", cvvt(int ), (int)594)) break;
                v25 /* !! */  = (long)gu.cvwa("cxhu", cvvt(int ), (int)595);
            }
            v26 = v24.getString();
            while (true) {
                if ((v27 /* !! */  = (cfr_temp_7 = gu.go - gu.cvwa("cxhv", cvxo(int ), (int)284)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                if (v27 /* !! */  == gu.cvwa("cxhw", cvvt(int ), (int)596)) break;
                v27 /* !! */  = (long)gu.cvwa("cxhx", cvvt(int ), (int)597);
            }
            while (true) {
                if ((v28 /* !! */  = (cfr_temp_8 = gu.go - gu.cvwa("cxhy", cvxo(int ), (int)285)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                if (v28 /* !! */  == gu.cvwa("cxhz", cvvt(int ), (int)598)) break;
                v28 /* !! */  = (long)gu.cvwa("cxia", cvvt(int ), (int)599);
            }
            v29 = v26.toUpperCase(Locale.ROOT);
            v30 /* !! */  = gu.go;
            if (true) ** GOTO lbl175
            block90: while (true) {
                v30 /* !! */  = (long)(v31 - gu.cvwa("cxib", cvxo(int ), (int)286));
lbl175:
                // 2 sources

                switch ((int)v30 /* !! */ ) {
                    case -1855170120: {
                        break block90;
                    }
                    case 1162364480: {
                        v31 = gu.cvwa("cxic", cvxo(int ), (int)287);
                        continue block90;
                    }
                    case 1415028127: {
                        v31 = gu.cvwa("cxid", cvxo(int ), (int)288);
                        continue block90;
                    }
                    case 2106226718: {
                        v31 = gu.cvwa("cxie", cvxo(int ), (int)289);
                        continue block90;
                    }
                }
                break;
            }
            if (!v29.contains(var2_5)) ** GOTO lbl194
            if (var5_4) ** GOTO lbl41
            if (var6_3 /* !! */  == 0) ** GOTO lbl-1000
            switch (var6_3 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var5_4) ** GOTO lbl41
                    return (int)var3_6;
                }
lbl194:
                // 2 sources

                if (var5_4 || var5_4) ** GOTO lbl41
                ++var3_6;
                if (var5_4) ** GOTO lbl41
                if (!var7_2) continue block78;
                throw null;
lbl199:
                // 1 sources

                if (!var5_4 && !var5_4) ** break;
                ** continue;
                return (int)gu.cvwa("cxif", cvvt(int ), (int)600);
lbl202:
                // 5 sources

                case 0: {
                    var6_3 /* !! */  = (int)gu.cvwa("cxig", cvvt(int ), (int)601);
                    if (var7_2) {
                        throw null;
                    }
                    ** GOTO lbl252
                }
                case 1: {
                    var6_3 /* !! */  = (int)gu.cvwa("cxih", cvvt(int ), (int)602);
                    if (!var7_2) ** GOTO lbl202
                    throw null;
                }
lbl211:
                // 3 sources

                case 2: {
                    do {
                        var6_3 /* !! */  = (int)gu.cvwa("cxii", cvvt(int ), (int)603);
                    } while (!var7_2);
                    throw null;
                }
                case 3: {
                    var6_3 /* !! */  = (int)gu.cvwa("cxij", cvvt(int ), (int)604);
                    if (var7_2) {
                        throw null;
                    }
                    ** GOTO lbl287
                }
lbl221:
                // 2 sources

                case 4: {
                    var6_3 /* !! */  = (int)gu.cvwa("cxik", cvvt(int ), (int)605);
                    if (!var7_2) ** GOTO lbl211
                    throw null;
                }
lbl225:
                // 2 sources

                case 5: {
                    var6_3 /* !! */  = (int)gu.cvwa("cxil", cvvt(int ), (int)606);
                    if (!var7_2) ** GOTO lbl202
                    throw null;
                }
lbl229:
                // 2 sources

                case 6: {
                    var6_3 /* !! */  = (int)gu.cvwa("cxim", cvvt(int ), (int)607);
                    if (var7_2) {
                        throw null;
                    }
                    ** GOTO lbl248
                }
                case 7: {
                    var6_3 /* !! */  = (int)gu.cvwa("cxin", cvvt(int ), (int)608);
                    if (var7_2) {
                        throw null;
                    }
                    ** GOTO lbl291
                }
                case 8: {
                    var6_3 /* !! */  = (int)gu.cvwa("cxio", cvvt(int ), (int)609);
                    if (var7_2) {
                        throw null;
                    }
                    ** GOTO lbl248
                }
                case 9: {
                    var6_3 /* !! */  = (int)gu.cvwa("cxip", cvvt(int ), (int)610);
                    if (!var7_2) ** GOTO lbl225
                    throw null;
                }
lbl248:
                // 3 sources

                case 10: {
                    var6_3 /* !! */  = (int)gu.cvwa("cxiq", cvvt(int ), (int)611);
                    if (!var7_2) break block78;
                    throw null;
                }
lbl252:
                // 3 sources

                case 11: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var6_3 /* !! */  = (int)gu.cvwa("cxir", cvvt(int ), (int)612);
                        if (var7_2) {
                            throw null;
                        }
                        ** GOTO lbl267
                        break;
                    }
                }
                case 12: {
                    var6_3 /* !! */  = (int)gu.cvwa("cxis", cvvt(int ), (int)613);
                    if (var7_2) {
                        throw null;
                    }
                    ** GOTO lbl271
                }
                case 13: {
                    var6_3 /* !! */  = (int)gu.cvwa("cxit", cvvt(int ), (int)614);
                    if (!var7_2) ** GOTO lbl229
                    throw null;
                }
lbl267:
                // 2 sources

                case 14: {
                    var6_3 /* !! */  = (int)gu.cvwa("cxiu", cvvt(int ), (int)615);
                    if (!var7_2) ** GOTO lbl252
                    throw null;
                }
lbl271:
                // 3 sources

                case 15: {
                    var6_3 /* !! */  = (int)gu.cvwa("cxiv", cvvt(int ), (int)616);
                    if (var7_2) {
                        throw null;
                    }
                }
                case 16: {
                    var6_3 /* !! */  = (int)gu.cvwa("cxiw", cvvt(int ), (int)617);
                    if (!var7_2) ** GOTO lbl202
                    throw null;
                }
                case 17: {
                    var6_3 /* !! */  = (int)gu.cvwa("cxix", cvvt(int ), (int)618);
                    if (!var7_2) ** GOTO lbl211
                    throw null;
                }
                case 18: {
                    var6_3 /* !! */  = (int)gu.cvwa("cxiy", cvvt(int ), (int)619);
                    if (!var7_2) ** GOTO lbl221
                    throw null;
                }
lbl287:
                // 2 sources

                case 19: {
                    var6_3 /* !! */  = (int)gu.cvwa("cxiz", cvvt(int ), (int)620);
                    if (!var7_2) ** GOTO lbl271
                    throw null;
                }
lbl291:
                // 2 sources

                case 20: {
                    var6_3 /* !! */  = (int)gu.cvwa("cxja", cvvt(int ), (int)621);
                    if (!var7_2) ** GOTO lbl202
                    throw null;
                }
                case 21: 
            }
            break;
        }
        var6_3 /* !! */  = (int)gu.cvwa("cxjb", cvvt(int ), (int)622);
        ** while (!var7_2)
lbl298:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void cxsm() {
        gu.cvvy[600] = 1093599911;
        gu.cvvy[601] = -1244799391;
        gu.cvvy[602] = -1558810207;
        gu.cvvy[603] = -228317046;
        gu.cvvy[604] = 1967857622;
        gu.cvvy[605] = -324561660;
        gu.cvvy[606] = -1777369424;
        gu.cvvy[607] = -1886383321;
        gu.cvvy[608] = -708127002;
        gu.cvvy[609] = 1558916645;
        gu.cvvy[610] = -128885605;
        gu.cvvy[611] = 1221288387;
        gu.cvvy[612] = 1565100073;
        gu.cvvy[613] = 1570577086;
        gu.cvvy[614] = -1121887269;
        gu.cvvy[615] = 1480833403;
        gu.cvvy[616] = 338521131;
        gu.cvvy[617] = 569815543;
        gu.cvvy[618] = -245264576;
        gu.cvvy[619] = -932257262;
        gu.cvvy[620] = -579348035;
        gu.cvvy[621] = -8781913;
        gu.cvvy[622] = 926568996;
        gu.cvvy[623] = 1234532122;
        gu.cvvy[624] = 572095971;
        gu.cvvy[625] = 2089389588;
        gu.cvvy[626] = 594215562;
        gu.cvvy[627] = -1309484044;
        gu.cvvy[628] = -1579312748;
        gu.cvvy[629] = -341423646;
        gu.cvvy[630] = -200429482;
        gu.cvvy[631] = 1161757875;
        gu.cvvy[632] = 915789624;
        gu.cvvy[633] = -1012089153;
        gu.cvvy[634] = -401382091;
        gu.cvvy[635] = 928212246;
        gu.cvvy[636] = 1627523980;
        gu.cvvy[637] = -1382508607;
        gu.cvvy[638] = 1596944896;
        gu.cvvy[639] = 287503491;
        gu.cvvy[640] = -1888956025;
        gu.cvvy[641] = -1986944215;
        gu.cvvy[642] = 1198498074;
        gu.cvvy[643] = 192932907;
        gu.cvvy[644] = 33702098;
        gu.cvvy[645] = -433056928;
        gu.cvvy[646] = 2030645947;
        gu.cvvy[647] = -615195749;
        gu.cvvy[648] = 21761874;
        gu.cvvy[649] = 1282955080;
        gu.cvvy[650] = 1067605190;
        gu.cvvy[651] = -1572230216;
        gu.cvvy[652] = 1018216872;
        gu.cvvy[653] = -276870901;
        gu.cvvy[654] = 1655263920;
        gu.cvvy[655] = 495644383;
        gu.cvvy[656] = -952011592;
        gu.cvvy[657] = 1320826394;
        gu.cvvy[658] = 1687591032;
        gu.cvvy[659] = -319233165;
        gu.cvvy[660] = 515815369;
        gu.cvvy[661] = -512087953;
        gu.cvvy[662] = 380196800;
        gu.cvvy[663] = 807760383;
        gu.cvvy[664] = -1182583440;
        gu.cvvy[665] = 1292194319;
        gu.cvvy[666] = 224599891;
        gu.cvvy[667] = -582394102;
        gu.cvvy[668] = 404831524;
        gu.cvvy[669] = -1323900611;
        gu.cvvy[670] = -785455588;
        gu.cvvy[671] = 378408661;
        gu.cvvy[672] = -1614833346;
        gu.cvvy[673] = -2008526613;
        gu.cvvy[674] = -1004982373;
        gu.cvvy[675] = -1792563958;
        gu.cvvy[676] = -516644026;
        gu.cvvy[677] = -1464814816;
        gu.cvvy[678] = -1013078997;
        gu.cvvy[679] = 316547804;
        gu.cvvy[680] = 606025685;
        gu.cvvy[681] = 726595008;
        gu.cvvy[682] = -216856946;
        gu.cvvy[683] = -1486757195;
        gu.cvvy[684] = 315696314;
        gu.cvvy[685] = -663120887;
        gu.cvvy[686] = -1378801974;
        gu.cvvy[687] = -1558414045;
        gu.cvvy[688] = 1072194995;
        gu.cvvy[689] = -505933543;
        gu.cvvy[690] = 1356467508;
        gu.cvvy[691] = -171286841;
        gu.cvvy[692] = -1012753040;
        gu.cvvy[693] = 2145932145;
        gu.cvvy[694] = -1906516277;
        gu.cvvy[695] = 543192587;
        gu.cvvy[696] = -592121336;
        gu.cvvy[697] = 1782694070;
        gu.cvvy[698] = -553552301;
        gu.cvvy[699] = 373972561;
    }

    private static /* synthetic */ void cxsd() {
        gu.cvvv[500] = -1964390542;
        gu.cvvv[501] = -2028358446;
        gu.cvvv[502] = -2001262976;
        gu.cvvv[503] = -601561696;
        gu.cvvv[504] = -166071003;
        gu.cvvv[505] = 614398943;
        gu.cvvv[506] = -1521249923;
        gu.cvvv[507] = 191522919;
        gu.cvvv[508] = 713473252;
        gu.cvvv[509] = -354963807;
        gu.cvvv[510] = -185010856;
        gu.cvvv[511] = -2020929491;
        gu.cvvv[512] = -1183178411;
        gu.cvvv[513] = 1784312954;
        gu.cvvv[514] = 1491024539;
        gu.cvvv[515] = 169460106;
        gu.cvvv[516] = -551960812;
        gu.cvvv[517] = -841633736;
        gu.cvvv[518] = 423522845;
        gu.cvvv[519] = 1086921936;
        gu.cvvv[520] = -1729071011;
        gu.cvvv[521] = -887858922;
        gu.cvvv[522] = 895695240;
        gu.cvvv[523] = -1347585986;
        gu.cvvv[524] = 1656108251;
        gu.cvvv[525] = 128266907;
        gu.cvvv[526] = -714564790;
        gu.cvvv[527] = 389243511;
        gu.cvvv[528] = -1752203495;
        gu.cvvv[529] = 1961453973;
        gu.cvvv[530] = -1603172764;
        gu.cvvv[531] = -1151780248;
        gu.cvvv[532] = 749712348;
        gu.cvvv[533] = -649539577;
        gu.cvvv[534] = -906207630;
        gu.cvvv[535] = -2092917907;
        gu.cvvv[536] = -672493281;
        gu.cvvv[537] = 760391937;
        gu.cvvv[538] = -929571302;
        gu.cvvv[539] = 784080117;
        gu.cvvv[540] = 443295626;
        gu.cvvv[541] = 1239263989;
        gu.cvvv[542] = 1245521710;
        gu.cvvv[543] = -1425610735;
        gu.cvvv[544] = 700351619;
        gu.cvvv[545] = 1487888968;
        gu.cvvv[546] = -674804759;
        gu.cvvv[547] = -1832564717;
        gu.cvvv[548] = 179792182;
        gu.cvvv[549] = 1706793119;
        gu.cvvv[550] = -1455253410;
        gu.cvvv[551] = -1818544520;
        gu.cvvv[552] = -1579003945;
        gu.cvvv[553] = -813769727;
        gu.cvvv[554] = -660772381;
        gu.cvvv[555] = 1138138803;
        gu.cvvv[556] = -198505582;
        gu.cvvv[557] = 542710187;
        gu.cvvv[558] = 697503326;
        gu.cvvv[559] = 1639504632;
        gu.cvvv[560] = -7265584;
        gu.cvvv[561] = -1928567510;
        gu.cvvv[562] = 1418836789;
        gu.cvvv[563] = 247828530;
        gu.cvvv[564] = 842267148;
        gu.cvvv[565] = -598895776;
        gu.cvvv[566] = -329772701;
        gu.cvvv[567] = 62773638;
        gu.cvvv[568] = -796873046;
        gu.cvvv[569] = 1293830029;
        gu.cvvv[570] = 217229695;
        gu.cvvv[571] = 236635005;
        gu.cvvv[572] = -963109839;
        gu.cvvv[573] = 859439747;
        gu.cvvv[574] = -498646867;
        gu.cvvv[575] = -1304694349;
        gu.cvvv[576] = 1797338474;
        gu.cvvv[577] = 187276695;
        gu.cvvv[578] = 213144651;
        gu.cvvv[579] = 1870943355;
        gu.cvvv[580] = 1740215065;
        gu.cvvv[581] = -2026039885;
        gu.cvvv[582] = -1628061682;
        gu.cvvv[583] = -211034225;
        gu.cvvv[584] = -1883244074;
        gu.cvvv[585] = -1377651227;
        gu.cvvv[586] = -1497778920;
        gu.cvvv[587] = -1317316889;
        gu.cvvv[588] = 1031961337;
        gu.cvvv[589] = -1679965759;
        gu.cvvv[590] = 1828045918;
        gu.cvvv[591] = 1198063174;
        gu.cvvv[592] = 789554158;
        gu.cvvv[593] = 1216287017;
        gu.cvvv[594] = 1228733821;
        gu.cvvv[595] = 1024689937;
        gu.cvvv[596] = -1831422947;
        gu.cvvv[597] = -1189872002;
        gu.cvvv[598] = -10058052;
        gu.cvvv[599] = -843938897;
    }

    private static /* synthetic */ void cxsi() {
        gu.cvvy[200] = 299048725;
        gu.cvvy[201] = 1865722012;
        gu.cvvy[202] = -482308673;
        gu.cvvy[203] = 1092246417;
        gu.cvvy[204] = -1306642936;
        gu.cvvy[205] = -997766990;
        gu.cvvy[206] = -921927449;
        gu.cvvy[207] = 289701590;
        gu.cvvy[208] = -1047536906;
        gu.cvvy[209] = -2072285899;
        gu.cvvy[210] = 513147000;
        gu.cvvy[211] = 1395278526;
        gu.cvvy[212] = -1293522664;
        gu.cvvy[213] = 1450483443;
        gu.cvvy[214] = -1902659652;
        gu.cvvy[215] = 121367807;
        gu.cvvy[216] = 1588046074;
        gu.cvvy[217] = -1620874708;
        gu.cvvy[218] = -606890368;
        gu.cvvy[219] = 1366647329;
        gu.cvvy[220] = 1296650723;
        gu.cvvy[221] = 1953810440;
        gu.cvvy[222] = -1360846687;
        gu.cvvy[223] = -2079915761;
        gu.cvvy[224] = 1114934334;
        gu.cvvy[225] = 914719769;
        gu.cvvy[226] = -1020423230;
        gu.cvvy[227] = 505175537;
        gu.cvvy[228] = -618046886;
        gu.cvvy[229] = 1783508839;
        gu.cvvy[230] = -1499309294;
        gu.cvvy[231] = 1695705141;
        gu.cvvy[232] = -359930220;
        gu.cvvy[233] = -1924718113;
        gu.cvvy[234] = 1414040538;
        gu.cvvy[235] = 138317712;
        gu.cvvy[236] = 885387124;
        gu.cvvy[237] = 1528404180;
        gu.cvvy[238] = -782683035;
        gu.cvvy[239] = -888398457;
        gu.cvvy[240] = 1240605364;
        gu.cvvy[241] = -928089142;
        gu.cvvy[242] = -811593455;
        gu.cvvy[243] = 1165887765;
        gu.cvvy[244] = -883081043;
        gu.cvvy[245] = 1778418188;
        gu.cvvy[246] = 1622042819;
        gu.cvvy[247] = 1265044812;
        gu.cvvy[248] = -1164787809;
        gu.cvvy[249] = 1017287590;
        gu.cvvy[250] = 624801621;
        gu.cvvy[251] = 699021934;
        gu.cvvy[252] = -1351581265;
        gu.cvvy[253] = -788102978;
        gu.cvvy[254] = 1157934635;
        gu.cvvy[255] = 121695959;
        gu.cvvy[256] = -1350654469;
        gu.cvvy[257] = -148308199;
        gu.cvvy[258] = -1486439069;
        gu.cvvy[259] = 1361902107;
        gu.cvvy[260] = 1288361709;
        gu.cvvy[261] = -138314780;
        gu.cvvy[262] = -1844756198;
        gu.cvvy[263] = -1892649062;
        gu.cvvy[264] = 735093251;
        gu.cvvy[265] = 1078465761;
        gu.cvvy[266] = -653649665;
        gu.cvvy[267] = -1917206226;
        gu.cvvy[268] = 1984560902;
        gu.cvvy[269] = -1480799895;
        gu.cvvy[270] = 467371638;
        gu.cvvy[271] = -462378805;
        gu.cvvy[272] = -743045158;
        gu.cvvy[273] = -926380794;
        gu.cvvy[274] = 277490038;
        gu.cvvy[275] = 101424846;
        gu.cvvy[276] = -235078865;
        gu.cvvy[277] = -1550661592;
        gu.cvvy[278] = -181539406;
        gu.cvvy[279] = -1658431603;
        gu.cvvy[280] = -1029678222;
        gu.cvvy[281] = 1657771562;
        gu.cvvy[282] = 236349284;
        gu.cvvy[283] = 929868366;
        gu.cvvy[284] = 1948885828;
        gu.cvvy[285] = -1921829249;
        gu.cvvy[286] = -1055759459;
        gu.cvvy[287] = 1711226744;
        gu.cvvy[288] = -2100995219;
        gu.cvvy[289] = -808085077;
        gu.cvvy[290] = -360099147;
        gu.cvvy[291] = 1246991197;
        gu.cvvy[292] = 1476587287;
        gu.cvvy[293] = -1758167588;
        gu.cvvy[294] = 1214318901;
        gu.cvvy[295] = -1463049431;
        gu.cvvy[296] = -128232003;
        gu.cvvy[297] = 1310348838;
        gu.cvvy[298] = -1026107502;
        gu.cvvy[299] = 945151992;
    }

    private static /* synthetic */ void cxso() {
        gu.cvxp[0] = 503801409270982883L;
        gu.cvxp[1] = -3621575501879141785L;
        gu.cvxp[2] = 840751670163597055L;
        gu.cvxp[3] = 7257492339573132683L;
        gu.cvxp[4] = -7058424051411720849L;
        gu.cvxp[5] = 5012317529485676833L;
        gu.cvxp[6] = -8591726805863240841L;
        gu.cvxp[7] = 8617339582710345527L;
        gu.cvxp[8] = -8697905778583746506L;
        gu.cvxp[9] = 2400096266959296881L;
        gu.cvxp[10] = 7811025893061886273L;
        gu.cvxp[11] = -5601202428532341136L;
        gu.cvxp[12] = -1394184474099631840L;
        gu.cvxp[13] = 7061006217704813109L;
        gu.cvxp[14] = 1800447997034488526L;
        gu.cvxp[15] = -6775802286770952748L;
        gu.cvxp[16] = -1267326551534791732L;
        gu.cvxp[17] = 4706307098810894161L;
        gu.cvxp[18] = -4176595185045942278L;
        gu.cvxp[19] = 5984241594228868968L;
        gu.cvxp[20] = -1220578275420874605L;
        gu.cvxp[21] = 1334167046879882760L;
        gu.cvxp[22] = -3896926841929285616L;
        gu.cvxp[23] = 6234588071338149040L;
        gu.cvxp[24] = 1864066681262949644L;
        gu.cvxp[25] = -361583880737414163L;
        gu.cvxp[26] = 4941692669831074414L;
        gu.cvxp[27] = 583850079311734865L;
        gu.cvxp[28] = 4582789513809280707L;
        gu.cvxp[29] = -2720794278089869506L;
        gu.cvxp[30] = -775132079894837118L;
        gu.cvxp[31] = -2008203049822536748L;
        gu.cvxp[32] = 7026328802218752240L;
        gu.cvxp[33] = -6336697664965968178L;
        gu.cvxp[34] = 8207816747517197312L;
        gu.cvxp[35] = -7803044451839095513L;
        gu.cvxp[36] = 4637374033838339919L;
        gu.cvxp[37] = 6234767866309329037L;
        gu.cvxp[38] = -3697567704516880246L;
        gu.cvxp[39] = 5430674124307033291L;
        gu.cvxp[40] = 4148312217174440403L;
        gu.cvxp[41] = -8375072163196091979L;
        gu.cvxp[42] = 4872828631387526445L;
        gu.cvxp[43] = -2139986958119235769L;
        gu.cvxp[44] = -4618265252358538880L;
        gu.cvxp[45] = -8440285768178543828L;
        gu.cvxp[46] = -784109948025452376L;
        gu.cvxp[47] = -1020674078581773823L;
        gu.cvxp[48] = 1385979007402557851L;
        gu.cvxp[49] = 2206998075409967375L;
        gu.cvxp[50] = 7296257523362315754L;
        gu.cvxp[51] = 8013193209520618376L;
        gu.cvxp[52] = -1063930510232330959L;
        gu.cvxp[53] = -5361636060780165786L;
        gu.cvxp[54] = -9034252016851502643L;
        gu.cvxp[55] = 8532633141970019790L;
        gu.cvxp[56] = 1076843753150079L;
        gu.cvxp[57] = 2123070073979926291L;
        gu.cvxp[58] = 874096248928827760L;
        gu.cvxp[59] = 7636904375010497753L;
        gu.cvxp[60] = -946927347196020258L;
        gu.cvxp[61] = -7818337766094545168L;
        gu.cvxp[62] = 8066814212542976273L;
        gu.cvxp[63] = -7519893817117875170L;
        gu.cvxp[64] = 6810145796794549644L;
        gu.cvxp[65] = -7788621010784246833L;
        gu.cvxp[66] = -6412076663522679756L;
        gu.cvxp[67] = -2882016782975782086L;
        gu.cvxp[68] = -6943642941931905482L;
        gu.cvxp[69] = 6877276281548164567L;
        gu.cvxp[70] = 1010350580174025783L;
        gu.cvxp[71] = -3616934152834412426L;
        gu.cvxp[72] = 1069027102958393566L;
        gu.cvxp[73] = -5413955186785065487L;
        gu.cvxp[74] = 4455099850237012738L;
        gu.cvxp[75] = 3420944175563544156L;
        gu.cvxp[76] = -4085284994312076637L;
        gu.cvxp[77] = 5428825692258032673L;
        gu.cvxp[78] = -7365692482129392836L;
        gu.cvxp[79] = -1871800278736887829L;
        gu.cvxp[80] = -4605361564950404436L;
        gu.cvxp[81] = 3435651391943299884L;
        gu.cvxp[82] = 6601974335944387427L;
        gu.cvxp[83] = -5772553479752291059L;
        gu.cvxp[84] = -115740226493317178L;
        gu.cvxp[85] = 2914957717697447325L;
        gu.cvxp[86] = 5843048601772182934L;
        gu.cvxp[87] = 5253496430900879312L;
        gu.cvxp[88] = 2580758016569225617L;
        gu.cvxp[89] = 2392642247175204421L;
        gu.cvxp[90] = 8495099400929946918L;
        gu.cvxp[91] = -5668082611539386445L;
        gu.cvxp[92] = -2338475934532305029L;
        gu.cvxp[93] = -231817275729030716L;
        gu.cvxp[94] = 2279949464662601603L;
        gu.cvxp[95] = 6459715872967354806L;
        gu.cvxp[96] = 8508777947714339608L;
        gu.cvxp[97] = -5172116014368464912L;
        gu.cvxp[98] = 2806936281527776712L;
        gu.cvxp[99] = -2149740093697525402L;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private void reset() {
        v0 /* !! */  = gu.go;
        block56: while (true) {
            switch ((int)v0 /* !! */ ) {
                case -1855170120: {
                    break block56;
                }
                case -615220608: {
                    v0 /* !! */  = (long)(gu.cvwa("cxpk", cvxo(int ), (int)365) - gu.cvwa("cxpj", cvxo(int ), (int)364));
                    continue block56;
                }
            }
            break;
        }
        var3_1 = gu.c;
        while (true) {
            block114: {
                if ((v1 /* !! */  = (cfr_temp_1 = gu.go - gu.cvwa("cxpl", cvxo(int ), (int)366)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v1 /* !! */  != gu.cvwa("cxpm", cvvt(int ), (int)712)) break block114;
                var2_2 /* !! */  = gu.b;
                v2 /* !! */  = gu.go;
                if (true) ** GOTO lbl22
            }
            v1 /* !! */  = (long)gu.cvwa("cxpn", cvvt(int ), (int)713);
        }
        block58: while (true) {
            v2 /* !! */  = (long)(v3 - gu.cvwa("cxpo", cvxo(int ), (int)367));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1855170120: {
                    break block58;
                }
                case -1197743832: {
                    v3 = gu.cvwa("cxpp", cvxo(int ), (int)368);
                    continue block58;
                }
                case 1770550328: {
                    v3 = gu.cvwa("cxpq", cvxo(int ), (int)369);
                    continue block58;
                }
            }
            break;
        }
        var1_3 = gu.a;
        if (var3_1) {
            throw null;
        }
        if (var1_3 || var1_3) return;
        v4 /* !! */  = gu.go;
        block59: while (true) {
            switch ((int)v4 /* !! */ ) {
                case -1855170120: {
                    break block59;
                }
                case -1097852823: {
                    v4 /* !! */  = (long)(gu.cvwa("cxps", cvxo(int ), (int)371) - gu.cvwa("cxpr", cvxo(int ), (int)370));
                    continue block59;
                }
            }
            break;
        }
        this.restoreCompassSlot();
        if (var1_3 || var1_3) return;
        v5 = gu.cvwa("cxpt", cvvt(int ), (int)714);
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_2 = gu.go - gu.cvwa("cxpu", cvxo(int ), (int)372)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v6 /* !! */  == gu.cvwa("cxpv", cvvt(int ), (int)715)) {
                this.compassStage = (int)v5;
                if (var1_3) return;
                break;
            }
            v6 /* !! */  = (long)gu.cvwa("cxpw", cvvt(int ), (int)716);
        }
        if (var1_3) return;
        v7 = gu.cvwa("cxpx", cvvt(int ), (int)717);
        while (true) {
            if ((v8 /* !! */  = (cfr_temp_3 = gu.go - gu.cvwa("cxpy", cvxo(int ), (int)373)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v8 /* !! */  == gu.cvwa("cxpz", cvvt(int ), (int)718)) {
                this.joining = v7;
                if (var1_3) return;
                break;
            }
            v8 /* !! */  = (long)gu.cvwa("cxqa", cvvt(int ), (int)719);
        }
        if (var1_3) return;
        v9 = gu.cvwa("cxqb", cvvt(int ), (int)720);
        while (true) {
            if ((v10 /* !! */  = (cfr_temp_4 = gu.go - gu.cvwa("cxqc", cvxo(int ), (int)374)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v10 /* !! */  == gu.cvwa("cxqd", cvvt(int ), (int)721)) {
                this.pageSwitches = (int)v9;
                if (var1_3) return;
                break;
            }
            v10 /* !! */  = (long)gu.cvwa("cxqe", cvvt(int ), (int)722);
        }
        if (var1_3) return;
        v11 = gu.cvwa("cxqf", cvvt(int ), (int)723);
        while (true) {
            if ((v12 /* !! */  = (cfr_temp_5 = gu.go - gu.cvwa("cxqg", cvxo(int ), (int)375)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v12 /* !! */  == gu.cvwa("cxqh", cvvt(int ), (int)724)) {
                this.lockedTargetSlot = (int)v11;
                if (var1_3) return;
                break;
            }
            v12 /* !! */  = (long)gu.cvwa("cxqi", cvvt(int ), (int)725);
        }
        if (var1_3) return;
        v13 = gu.cvwa("cxqj", cvxo(int ), (int)376);
        v14 /* !! */  = gu.go;
        if (true) ** GOTO lbl94
        block64: while (true) {
            v14 /* !! */  = (long)(v15 - gu.cvwa("cxqk", cvxo(int ), (int)377));
lbl94:
            // 2 sources

            switch ((int)v14 /* !! */ ) {
                case -1855170120: {
                    break block64;
                }
                case -1650378301: {
                    v15 = gu.cvwa("cxql", cvxo(int ), (int)378);
                    continue block64;
                }
                case -473056016: {
                    v15 = gu.cvwa("cxqm", cvxo(int ), (int)379);
                    continue block64;
                }
                case -15307934: {
                    v15 = gu.cvwa("cxqn", cvxo(int ), (int)380);
                    continue block64;
                }
            }
            break;
        }
        this.targetClickedAt = (long)v13;
        if (var1_3 || var1_3) return;
        v16 = gu.cvwa("cxqo", cvvt(int ), (int)726);
        v17 /* !! */  = gu.go;
        if (true) ** GOTO lbl113
        block65: while (true) {
            v17 /* !! */  = (long)(v18 - gu.cvwa("cxqp", cvxo(int ), (int)381));
lbl113:
            // 2 sources

            switch ((int)v17 /* !! */ ) {
                case -1855170120: {
                    break block65;
                }
                case -50254796: {
                    v18 = gu.cvwa("cxqq", cvxo(int ), (int)382);
                    continue block65;
                }
                case 288165514: {
                    v18 = gu.cvwa("cxqr", cvxo(int ), (int)383);
                    continue block65;
                }
            }
            break;
        }
        this.keepEnabledAfterJoin = v16;
        if (var1_3 || var1_3) return;
        v19 /* !! */  = gu.go;
        block66: while (true) {
            switch ((int)v19 /* !! */ ) {
                case -1855170120: {
                    break block66;
                }
                case 1382990980: {
                    v19 /* !! */  = (long)(gu.cvwa("cxqt", cvxo(int ), (int)385) - gu.cvwa("cxqs", cvxo(int ), (int)384));
                    continue block66;
                }
            }
            break;
        }
        while (true) {
            if ((v20 /* !! */  = (cfr_temp_6 = gu.go - gu.cvwa("cxqu", cvxo(int ), (int)386)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v20 /* !! */  == gu.cvwa("cxqv", cvvt(int ), (int)727)) {
                this.clickTimer.reset();
                if (var1_3) return;
                break;
            }
            v20 /* !! */  = (long)gu.cvwa("cxqw", cvvt(int ), (int)728);
        }
        if (var1_3) return;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block68: while (true) {
            block115: {
                switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        while (true) {
                            if ((v21 /* !! */  = (cfr_temp_7 = gu.go - gu.cvwa("cxqx", cvxo(int ), (int)387)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) {
                                continue;
                            }
                            if (v21 /* !! */  == gu.cvwa("cxqy", cvvt(int ), (int)729)) {
                                v22 /* !! */  = gu.go;
                                ** break;
                            }
                            v21 /* !! */  = (long)gu.cvwa("cxqz", cvvt(int ), (int)730);
                        }
                    }
                    case 0: {
                        var2_2 /* !! */  = (int)gu.cvwa("cxrc", cvvt(int ), (int)731);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 2: {
                        var2_2 /* !! */  = (int)gu.cvwa("cxre", cvvt(int ), (int)733);
                        cfr_temp_0 = 15;
                        if (var3_1) {
                            throw null;
                        }
                        break block115;
                    }
                    case 4: {
                        var2_2 /* !! */  = (int)gu.cvwa("cxrg", cvvt(int ), (int)735);
                        cfr_temp_0 = 17;
                        if (var3_1) {
                            throw null;
                        }
                        break block115;
                    }
                    case 6: {
                        var2_2 /* !! */  = (int)gu.cvwa("cxri", cvvt(int ), (int)737);
                        cfr_temp_0 = 16;
                        if (var3_1) {
                            throw null;
                        }
                        break block115;
                    }
                    case 7: {
                        var2_2 /* !! */  = (int)gu.cvwa("cxrj", cvvt(int ), (int)738);
                        cfr_temp_0 = 1;
                        if (var3_1) {
                            throw null;
                        }
                        break block115;
                    }
                    case 9: {
                        var2_2 /* !! */  = (int)gu.cvwa("cxrl", cvvt(int ), (int)740);
                        cfr_temp_0 = 20;
                        if (var3_1) {
                            throw null;
                        }
                        break block115;
                    }
                    case 10: {
                        var2_2 /* !! */  = (int)gu.cvwa("cxrm", cvvt(int ), (int)741);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 11: {
                        var2_2 /* !! */  = (int)gu.cvwa("cxrn", cvvt(int ), (int)742);
                        cfr_temp_0 = 17;
                        if (var3_1) {
                            throw null;
                        }
                        break block115;
                    }
                    case 12: {
                        var2_2 /* !! */  = (int)gu.cvwa("cxro", cvvt(int ), (int)743);
                        cfr_temp_0 = 1;
                        if (var3_1) {
                            throw null;
                        }
                        break block115;
                    }
                    case 13: {
                        var2_2 /* !! */  = (int)gu.cvwa("cxrp", cvvt(int ), (int)744);
                        cfr_temp_0 = 16;
                        if (var3_1) {
                            throw null;
                        }
                        break block115;
                    }
                    case 14: {
                        ** GOTO lbl248
                    }
                    case 18: {
                        var2_2 /* !! */  = (int)gu.cvwa("cxru", cvvt(int ), (int)749);
                        cfr_temp_0 = 20;
                        if (var3_1) {
                            throw null;
                        }
                        break block115;
                    }
                    case 19: {
                        var2_2 /* !! */  = (int)gu.cvwa("cxrv", cvvt(int ), (int)750);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 17: {
                        var2_2 /* !! */  = (int)gu.cvwa("cxrt", cvvt(int ), (int)748);
                        cfr_temp_0 = 15;
                        if (var3_1) {
                            throw null;
                        }
                        break block115;
                    }
                    case 21: {
                        ** GOTO lbl245
                    }
lbl231:
                    // 1 sources

                    block70: while (true) {
                        switch ((int)v22 /* !! */ ) {
                            case -1855170120: {
                                break block70;
                            }
                            case 1219762721: {
                                v22 /* !! */  = (long)(gu.cvwa("cxrb", cvxo(int ), (int)389) - gu.cvwa("cxra", cvxo(int ), (int)388));
                                continue block70;
                            }
                        }
                        break;
                    }
                    this.compassTimer.reset();
                    if (!var1_3 && !var1_3) return;
                    return;
                    case 1: {
                        var2_2 /* !! */  = (int)gu.cvwa("cxrd", cvvt(int ), (int)732);
                        if (!var3_1) ** break;
                        throw null;
lbl245:
                        // 2 sources

                        var2_2 /* !! */  = (int)gu.cvwa("cxrx", cvvt(int ), (int)752);
                        if (var3_1) {
                            throw null;
                        }
lbl248:
                        // 3 sources

                        var2_2 /* !! */  = (int)gu.cvwa("cxrq", cvvt(int ), (int)745);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 15: {
                        var2_2 /* !! */  = (int)gu.cvwa("cxrr", cvvt(int ), (int)746);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 5: {
                        var2_2 /* !! */  = (int)gu.cvwa("cxrh", cvvt(int ), (int)736);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 16: {
                        var2_2 /* !! */  = (int)gu.cvwa("cxrs", cvvt(int ), (int)747);
                        cfr_temp_0 = 1;
                        if (var3_1) {
                            throw null;
                        }
                        break block115;
                    }
                    case 3: {
                        var2_2 /* !! */  = (int)gu.cvwa("cxrf", cvvt(int ), (int)734);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 8: {
                        var2_2 /* !! */  = (int)gu.cvwa("cxrk", cvvt(int ), (int)739);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 20: 
                }
                ** GOTO lbl278
            }
            do {
                if (true) continue block68;
lbl278:
                // 2 sources

                var2_2 /* !! */  = (int)gu.cvwa("cxrw", cvvt(int ), (int)751);
                cfr_temp_0 = 3;
            } while (!var3_1);
            break;
        }
        throw null;
    }

    private static /* synthetic */ void cxsf() {
        gu.cvvv[700] = -2085362191;
        gu.cvvv[701] = 855908548;
        gu.cvvv[702] = 2064598105;
        gu.cvvv[703] = -768131463;
        gu.cvvv[704] = -843521263;
        gu.cvvv[705] = 1871186053;
        gu.cvvv[706] = -2085106980;
        gu.cvvv[707] = -541719094;
        gu.cvvv[708] = 1477914825;
        gu.cvvv[709] = 963149474;
        gu.cvvv[710] = -724714395;
        gu.cvvv[711] = 281549244;
        gu.cvvv[712] = -434947096;
        gu.cvvv[713] = -1500922993;
        gu.cvvv[714] = -1641376551;
        gu.cvvv[715] = -1374968902;
        gu.cvvv[716] = 391802949;
        gu.cvvv[717] = 1965736702;
        gu.cvvv[718] = 1116838265;
        gu.cvvv[719] = 973603734;
        gu.cvvv[720] = 1682025858;
        gu.cvvv[721] = 966119278;
        gu.cvvv[722] = -1360362886;
        gu.cvvv[723] = -319153502;
        gu.cvvv[724] = 1679683172;
        gu.cvvv[725] = -566400647;
        gu.cvvv[726] = 1160471923;
        gu.cvvv[727] = 1116927005;
        gu.cvvv[728] = -1712849248;
        gu.cvvv[729] = -1731473384;
        gu.cvvv[730] = 512882157;
        gu.cvvv[731] = -466497125;
        gu.cvvv[732] = -440524009;
        gu.cvvv[733] = -1472227842;
        gu.cvvv[734] = -213579655;
        gu.cvvv[735] = -1042715602;
        gu.cvvv[736] = -1744687334;
        gu.cvvv[737] = 925341063;
        gu.cvvv[738] = 228535238;
        gu.cvvv[739] = 207428421;
        gu.cvvv[740] = -389726879;
        gu.cvvv[741] = -1035754909;
        gu.cvvv[742] = -1133823141;
        gu.cvvv[743] = -1327785830;
        gu.cvvv[744] = 1064219337;
        gu.cvvv[745] = 271126724;
        gu.cvvv[746] = -2119167951;
        gu.cvvv[747] = -442994785;
        gu.cvvv[748] = 373660278;
        gu.cvvv[749] = -971517285;
        gu.cvvv[750] = 1697133740;
        gu.cvvv[751] = -1861021883;
        gu.cvvv[752] = 661001147;
    }

    private static /* synthetic */ void cxsn() {
        gu.cvvy[700] = -2085362182;
        gu.cvvy[701] = 855908550;
        gu.cvvy[702] = 2064598096;
        gu.cvvy[703] = -768131458;
        gu.cvvy[704] = -843521262;
        gu.cvvy[705] = 1871186061;
        gu.cvvy[706] = -2085106984;
        gu.cvvy[707] = -541719101;
        gu.cvvy[708] = 1477914829;
        gu.cvvy[709] = 963149481;
        gu.cvvy[710] = -724714395;
        gu.cvvy[711] = 281549233;
        gu.cvvy[712] = 434947095;
        gu.cvvy[713] = 1394869977;
        gu.cvvy[714] = -1641376551;
        gu.cvvy[715] = 1374968901;
        gu.cvvy[716] = -516554934;
        gu.cvvy[717] = 1965736702;
        gu.cvvy[718] = 1116838264;
        gu.cvvy[719] = -1444535462;
        gu.cvvy[720] = 1682025858;
        gu.cvvy[721] = 966119279;
        gu.cvvy[722] = -297618470;
        gu.cvvy[723] = 319153501;
        gu.cvvy[724] = 1679683173;
        gu.cvvy[725] = -1143105920;
        gu.cvvy[726] = 1160471923;
        gu.cvvy[727] = 1116927004;
        gu.cvvy[728] = 812798202;
        gu.cvvy[729] = -1731473383;
        gu.cvvy[730] = -1220096781;
        gu.cvvy[731] = -466497132;
        gu.cvvy[732] = -440524015;
        gu.cvvy[733] = -1472227856;
        gu.cvvy[734] = -213579656;
        gu.cvvy[735] = -1042715611;
        gu.cvvy[736] = -1744687341;
        gu.cvvy[737] = 925341076;
        gu.cvvy[738] = 228535253;
        gu.cvvy[739] = 207428438;
        gu.cvvy[740] = -389726865;
        gu.cvvy[741] = -1035754893;
        gu.cvvy[742] = -1133823148;
        gu.cvvy[743] = -1327785847;
        gu.cvvy[744] = 1064219352;
        gu.cvvy[745] = 271126732;
        gu.cvvy[746] = -2119167948;
        gu.cvvy[747] = -442994804;
        gu.cvvy[748] = 373660277;
        gu.cvvy[749] = -971517288;
        gu.cvvy[750] = 1697133733;
        gu.cvvy[751] = -1861021888;
        gu.cvvy[752] = 661001135;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void clickSlot(int var1_1) {
        block79: {
            v0 /* !! */  = gu.go;
            if (true) ** GOTO lbl5
            block47: while (true) {
                v0 /* !! */  = (long)(v1 - gu.cvwa("cxmz", cvxo(int ), (int)337));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -1904822416: {
                        v1 = gu.cvwa("cxna", cvxo(int ), (int)338);
                        continue block47;
                    }
                    case -1855170120: {
                        break block47;
                    }
                    case 389428238: {
                        v1 = gu.cvwa("cxnb", cvxo(int ), (int)339);
                        continue block47;
                    }
                }
                break;
            }
            var4_2 = gu.c;
            v2 /* !! */  = gu.go;
            if (true) ** GOTO lbl19
            block48: while (true) {
                v2 /* !! */  = (long)(v3 - gu.cvwa("cxnc", cvxo(int ), (int)340));
lbl19:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case -1855170120: {
                        break block48;
                    }
                    case 162951735: {
                        v3 = gu.cvwa("cxnd", cvxo(int ), (int)341);
                        continue block48;
                    }
                    case 679589028: {
                        v3 = gu.cvwa("cxne", cvxo(int ), (int)342);
                        continue block48;
                    }
                }
                break;
            }
            var3_3 /* !! */  = gu.b;
            v4 /* !! */  = gu.go;
            if (true) ** GOTO lbl33
            block49: while (true) {
                v4 /* !! */  = (long)(v5 - gu.cvwa("cxnf", cvxo(int ), (int)343));
lbl33:
                // 2 sources

                switch ((int)v4 /* !! */ ) {
                    case -1855170120: {
                        break block49;
                    }
                    case -1129370403: {
                        v5 = gu.cvwa("cxng", cvxo(int ), (int)344);
                        continue block49;
                    }
                    case -481574419: {
                        v5 = gu.cvwa("cxnh", cvxo(int ), (int)345);
                        continue block49;
                    }
                }
                break;
            }
            var2_4 = gu.a;
            if (var4_2) {
                throw null;
lbl45:
                // 8 sources

                return;
            }
            if (var2_4 || var2_4) ** GOTO lbl45
            if (var1_1 < 0) break block79;
            if (var2_4) ** GOTO lbl45
            v6 /* !! */  = gu.go;
            if (true) ** GOTO lbl54
            block51: while (true) {
                v6 /* !! */  = (long)(gu.cvwa("cxnj", cvxo(int ), (int)347) - gu.cvwa("cxni", cvxo(int ), (int)346));
lbl54:
                // 2 sources

                switch ((int)v6 /* !! */ ) {
                    case -1855170120: {
                        break block51;
                    }
                    case -98083501: {
                        continue block51;
                    }
                }
                break;
            }
            while (true) {
                if ((v7 /* !! */  = (cfr_temp_0 = gu.go - gu.cvwa("cxnk", cvxo(int ), (int)348)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v7 /* !! */  == gu.cvwa("cxnl", cvvt(int ), (int)677)) break;
                v7 /* !! */  = (long)gu.cvwa("cxnm", cvvt(int ), (int)678);
            }
            if (gu.mc.field_1724 == null) break block79;
            if (var2_4) ** GOTO lbl45
            while (true) {
                if ((v8 /* !! */  = (cfr_temp_1 = gu.go - gu.cvwa("cxnn", cvxo(int ), (int)349)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v8 /* !! */  == gu.cvwa("cxno", cvvt(int ), (int)679)) break;
                v8 /* !! */  = (long)gu.cvwa("cxnp", cvvt(int ), (int)680);
            }
            while (true) {
                if ((v9 /* !! */  = (cfr_temp_2 = gu.go - gu.cvwa("cxnq", cvxo(int ), (int)350)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v9 /* !! */  == gu.cvwa("cxnr", cvvt(int ), (int)681)) break;
                v9 /* !! */  = (long)gu.cvwa("cxns", cvvt(int ), (int)682);
            }
            if (gu.mc.field_1761 != null) ** GOTO lbl85
            if (var2_4) ** GOTO lbl45
        }
        if (var2_4) ** GOTO lbl45
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        block19 : switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** GOTO lbl45
                return;
            }
lbl85:
            // 1 sources

            if (var2_4 || var2_4) ** GOTO lbl45
            while (true) {
                if ((v10 /* !! */  = (cfr_temp_3 = gu.go - gu.cvwa("cxnt", cvxo(int ), (int)351)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v10 /* !! */  == gu.cvwa("cxnu", cvvt(int ), (int)683)) break;
                v10 /* !! */  = (long)gu.cvwa("cxnv", cvvt(int ), (int)684);
            }
            while (true) {
                if ((v11 /* !! */  = (cfr_temp_4 = gu.go - gu.cvwa("cxnw", cvxo(int ), (int)352)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                if (v11 /* !! */  == gu.cvwa("cxnx", cvvt(int ), (int)685)) break;
                v11 /* !! */  = (long)gu.cvwa("cxny", cvvt(int ), (int)686);
            }
            v12 = gu.mc.field_1761;
            v13 /* !! */  = gu.go;
            if (true) ** GOTO lbl101
            block57: while (true) {
                v13 /* !! */  = (long)(gu.cvwa("cxoa", cvxo(int ), (int)354) - gu.cvwa("cxnz", cvxo(int ), (int)353));
lbl101:
                // 2 sources

                switch ((int)v13 /* !! */ ) {
                    case -1855170120: {
                        break block57;
                    }
                    case -637351517: {
                        continue block57;
                    }
                }
                break;
            }
            while (true) {
                if ((v14 /* !! */  = (cfr_temp_5 = gu.go - gu.cvwa("cxob", cvxo(int ), (int)355)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                if (v14 /* !! */  == gu.cvwa("cxoc", cvvt(int ), (int)687)) break;
                v14 /* !! */  = (long)gu.cvwa("cxod", cvvt(int ), (int)688);
            }
            v15 = gu.mc.field_1724;
            v16 /* !! */  = gu.go;
            if (true) ** GOTO lbl116
            block59: while (true) {
                v16 /* !! */  = (long)(gu.cvwa("cxof", cvxo(int ), (int)357) - gu.cvwa("cxoe", cvxo(int ), (int)356));
lbl116:
                // 2 sources

                switch ((int)v16 /* !! */ ) {
                    case -1855170120: {
                        break block59;
                    }
                    case 1985116241: {
                        continue block59;
                    }
                }
                break;
            }
            v17 = v15.field_7512;
            while (true) {
                if ((v18 /* !! */  = (cfr_temp_6 = gu.go - gu.cvwa("cxog", cvxo(int ), (int)358)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                if (v18 /* !! */  == gu.cvwa("cxoh", cvvt(int ), (int)689)) break;
                v18 /* !! */  = (long)gu.cvwa("cxoi", cvvt(int ), (int)690);
            }
            v19 = v17.field_7763;
            v20 = gu.cvwa("cxoj", cvvt(int ), (int)691);
            while (true) {
                if ((v21 /* !! */  = (cfr_temp_7 = gu.go - gu.cvwa("cxok", cvxo(int ), (int)359)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                if (v21 /* !! */  == gu.cvwa("cxol", cvvt(int ), (int)692)) break;
                v21 /* !! */  = (long)gu.cvwa("cxom", cvvt(int ), (int)693);
            }
            while (true) {
                if ((v22 /* !! */  = (cfr_temp_8 = gu.go - gu.cvwa("cxon", cvxo(int ), (int)360)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                if (v22 /* !! */  == gu.cvwa("cxoo", cvvt(int ), (int)694)) break;
                v22 /* !! */  = (long)gu.cvwa("cxop", cvvt(int ), (int)695);
            }
            v23 /* !! */  = gu.go;
            if (true) ** GOTO lbl143
            block63: while (true) {
                v23 /* !! */  = (long)(gu.cvwa("cxor", cvxo(int ), (int)362) - gu.cvwa("cxoq", cvxo(int ), (int)361));
lbl143:
                // 2 sources

                switch ((int)v23 /* !! */ ) {
                    case -1855170120: {
                        break block63;
                    }
                    case -346288620: {
                        continue block63;
                    }
                }
                break;
            }
            v24 = gu.mc.field_1724;
            while (true) {
                if ((v25 /* !! */  = (cfr_temp_9 = gu.go - gu.cvwa("cxos", cvxo(int ), (int)363)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                if (v25 /* !! */  == gu.cvwa("cxot", cvvt(int ), (int)696)) break;
                v25 /* !! */  = (long)gu.cvwa("cxou", cvvt(int ), (int)697);
            }
            v12.method_2906(v19, var1_1, (int)v20, class_1713.field_7790, (class_1657)v24);
            if (!var2_4 && !var2_4) ** break;
            ** continue;
            return;
            case 0: {
                var3_3 /* !! */  = (int)gu.cvwa("cxov", cvvt(int ), (int)698);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl202
            }
            case 1: {
                var3_3 /* !! */  = (int)gu.cvwa("cxow", cvvt(int ), (int)699);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl193
            }
lbl168:
            // 2 sources

            case 2: {
                var3_3 /* !! */  = (int)gu.cvwa("cxox", cvvt(int ), (int)700);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl202
            }
            case 3: {
                var3_3 /* !! */  = (int)gu.cvwa("cxoy", cvvt(int ), (int)701);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl188
            }
lbl178:
            // 2 sources

            case 4: {
                var3_3 /* !! */  = (int)gu.cvwa("cxoz", cvvt(int ), (int)702);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl206
            }
            case 5: {
                var3_3 /* !! */  = (int)gu.cvwa("cxpa", cvvt(int ), (int)703);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl198
            }
lbl188:
            // 3 sources

            case 6: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)gu.cvwa("cxpb", cvvt(int ), (int)704);
                    if (!var4_2) break block19;
                    throw null;
                }
            }
lbl193:
            // 3 sources

            case 7: {
                var3_3 /* !! */  = (int)gu.cvwa("cxpc", cvvt(int ), (int)705);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl202
            }
lbl198:
            // 2 sources

            case 8: {
                var3_3 /* !! */  = (int)gu.cvwa("cxpd", cvvt(int ), (int)706);
                if (!var4_2) ** GOTO lbl193
                throw null;
            }
lbl202:
            // 4 sources

            case 9: {
                var3_3 /* !! */  = (int)gu.cvwa("cxpe", cvvt(int ), (int)707);
                if (!var4_2) ** GOTO lbl178
                throw null;
            }
lbl206:
            // 2 sources

            case 10: {
                var3_3 /* !! */  = (int)gu.cvwa("cxpf", cvvt(int ), (int)708);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl215
            }
            case 11: {
                var3_3 /* !! */  = (int)gu.cvwa("cxpg", cvvt(int ), (int)709);
                if (!var4_2) ** GOTO lbl188
                throw null;
            }
lbl215:
            // 2 sources

            case 12: {
                var3_3 /* !! */  = (int)gu.cvwa("cxph", cvvt(int ), (int)710);
                if (!var4_2) ** GOTO lbl168
                throw null;
            }
            case 13: 
        }
        var3_3 /* !! */  = (int)gu.cvwa("cxpi", cvvt(int ), (int)711);
        ** while (!var4_2)
lbl222:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ double cwxe(int n2) {
        return Double.longBitsToDouble(cvxp[n2] ^ cvxr[n2]);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void startJoining(int var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = gu.go - gu.cvwa("cwhy", cvxo(int ), (int)67)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == gu.cvwa("cwhz", cvvt(int ), (int)141)) break;
            v0 /* !! */  = (long)gu.cvwa("cwia", cvvt(int ), (int)142);
        }
        var4_2 = gu.c;
        v1 /* !! */  = gu.go;
        if (true) ** GOTO lbl11
        block36: while (true) {
            v1 /* !! */  = (long)(gu.cvwa("cwic", cvxo(int ), (int)69) - gu.cvwa("cwib", cvxo(int ), (int)68));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1855170120: {
                    break block36;
                }
                case 993997736: {
                    continue block36;
                }
            }
            break;
        }
        var3_3 /* !! */  = gu.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = gu.go - gu.cvwa("cwid", cvxo(int ), (int)70)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == gu.cvwa("cwie", cvvt(int ), (int)143)) break;
            v2 /* !! */  = (long)gu.cvwa("cwif", cvvt(int ), (int)144);
        }
        var2_4 = gu.a;
        if (var4_2) {
            throw null;
lbl25:
            // 5 sources

            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl25
        v3 /* !! */  = gu.go;
        if (true) ** GOTO lbl32
        block39: while (true) {
            v3 /* !! */  = (long)(gu.cvwa("cwih", cvxo(int ), (int)72) - gu.cvwa("cwig", cvxo(int ), (int)71));
lbl32:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1855170120: {
                    break block39;
                }
                case 1088456853: {
                    continue block39;
                }
            }
            break;
        }
        v4 /* !! */  = gu.go;
        if (true) ** GOTO lbl41
        block40: while (true) {
            v4 /* !! */  = (long)(v5 - gu.cvwa("cwii", cvxo(int ), (int)73));
lbl41:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -2084639159: {
                    v5 = gu.cvwa("cwij", cvxo(int ), (int)74);
                    continue block40;
                }
                case -1855170120: {
                    break block40;
                }
                case -990158872: {
                    v5 = gu.cvwa("cwik", cvxo(int ), (int)75);
                    continue block40;
                }
                case 1009298975: {
                    v5 = gu.cvwa("cwil", cvxo(int ), (int)76);
                    continue block40;
                }
            }
            break;
        }
        v6 = this.keepEnabled.isValue();
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_2 = gu.go - gu.cvwa("cwim", cvxo(int ), (int)77)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v7 /* !! */  == gu.cvwa("cwin", cvvt(int ), (int)145)) break;
            v7 /* !! */  = (long)gu.cvwa("cwio", cvvt(int ), (int)146);
        }
        this.keepEnabledAfterJoin = v6;
        if (var2_4) ** GOTO lbl25
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** GOTO lbl25
                v8 = gu.cvwa("cwip", cvvt(int ), (int)147);
                v9 = gu.cvwa("cwiq", cvvt(int ), (int)148);
                v10 /* !! */  = gu.go;
                if (true) ** GOTO lbl71
                block42: while (true) {
                    v10 /* !! */  = (long)(gu.cvwa("cwis", cvxo(int ), (int)79) - gu.cvwa("cwir", cvxo(int ), (int)78));
lbl71:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -1855170120: {
                            break block42;
                        }
                        case 371111693: {
                            continue block42;
                        }
                    }
                    break;
                }
                v11 = Math.min((int)v9, var1_1);
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_3 = gu.go - gu.cvwa("cwit", cvxo(int ), (int)80)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == gu.cvwa("cwiu", cvvt(int ), (int)149)) break;
                    v12 /* !! */  = (long)gu.cvwa("cwiv", cvvt(int ), (int)150);
                }
                v13 = Math.max((int)v8, v11);
                while (true) {
                    if ((v14 /* !! */  = (cfr_temp_4 = gu.go - gu.cvwa("cwiw", cvxo(int ), (int)81)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v14 /* !! */  == gu.cvwa("cwix", cvvt(int ), (int)151)) break;
                    v14 /* !! */  = (long)gu.cvwa("cwiy", cvvt(int ), (int)152);
                }
                this.requestedGrief = v13;
                if (var2_4 || var2_4) ** GOTO lbl25
                v15 /* !! */  = gu.go;
                if (true) ** GOTO lbl94
                block45: while (true) {
                    v15 /* !! */  = (long)(v16 - gu.cvwa("cwiz", cvxo(int ), (int)82));
lbl94:
                    // 2 sources

                    switch ((int)v15 /* !! */ ) {
                        case -1855170120: {
                            break block45;
                        }
                        case -347905600: {
                            v16 = gu.cvwa("cwja", cvxo(int ), (int)83);
                            continue block45;
                        }
                        case 1336757258: {
                            v16 = gu.cvwa("cwjb", cvxo(int ), (int)84);
                            continue block45;
                        }
                    }
                    break;
                }
                this.startRequestedJoining();
                if (!var2_4 && !var2_4) ** break;
                ** continue;
                return;
            }
lbl107:
            // 2 sources

            case 0: {
                do {
                    var3_3 /* !! */  = (int)gu.cvwa("cwjc", cvvt(int ), (int)153);
                } while (!var4_2);
                throw null;
            }
            case 1: {
                var3_3 /* !! */  = (int)gu.cvwa("cwjd", cvvt(int ), (int)154);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl121
            }
lbl117:
            // 2 sources

            case 2: {
                var3_3 /* !! */  = (int)gu.cvwa("cwje", cvvt(int ), (int)155);
                if (!var4_2) break;
                throw null;
            }
lbl121:
            // 3 sources

            case 3: {
                var3_3 /* !! */  = (int)gu.cvwa("cwjf", cvvt(int ), (int)156);
                if (!var4_2) ** GOTO lbl117
                throw null;
            }
            case 4: {
                do {
                    var3_3 /* !! */  = (int)gu.cvwa("cwjg", cvvt(int ), (int)157);
                } while (!var4_2);
                throw null;
            }
            case 5: {
                var3_3 /* !! */  = (int)gu.cvwa("cwjh", cvvt(int ), (int)158);
                if (!var4_2) ** GOTO lbl107
                throw null;
            }
            case 6: {
                do {
                    var3_3 /* !! */  = (int)gu.cvwa("cwji", cvvt(int ), (int)159);
                } while (!var4_2);
                throw null;
            }
            case 7: {
                var3_3 /* !! */  = (int)gu.cvwa("cwjj", cvvt(int ), (int)160);
                if (!var4_2) ** GOTO lbl121
                throw null;
            }
            case 8: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var3_3 /* !! */  = (int)gu.cvwa("cwjk", cvvt(int ), (int)161);
                    if (!var4_2) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 9: 
        }
        var3_3 /* !! */  = (int)gu.cvwa("cwjl", cvvt(int ), (int)162);
        ** while (!var4_2)
lbl151:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onPacket(cr var1_1) {
        v0 /* !! */  = gu.go;
        if (true) ** GOTO lbl5
        block35: while (true) {
            v0 /* !! */  = (long)(v1 - gu.cvwa("cwgj", cvxo(int ), (int)48));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1855170120: {
                    break block35;
                }
                case 1783467331: {
                    v1 = gu.cvwa("cwgk", cvxo(int ), (int)49);
                    continue block35;
                }
                case 2143232251: {
                    v1 = gu.cvwa("cwgl", cvxo(int ), (int)50);
                    continue block35;
                }
                case 2145007088: {
                    v1 = gu.cvwa("cwgm", cvxo(int ), (int)51);
                    continue block35;
                }
            }
            break;
        }
        var4_2 = gu.c;
        v2 /* !! */  = gu.go;
        if (true) ** GOTO lbl22
        block36: while (true) {
            v2 /* !! */  = (long)(v3 - gu.cvwa("cwgn", cvxo(int ), (int)52));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1996437733: {
                    v3 = gu.cvwa("cwgo", cvxo(int ), (int)53);
                    continue block36;
                }
                case -1855170120: {
                    break block36;
                }
                case -1433233668: {
                    v3 = gu.cvwa("cwgp", cvxo(int ), (int)54);
                    continue block36;
                }
                case -721029416: {
                    v3 = gu.cvwa("cwgq", cvxo(int ), (int)55);
                    continue block36;
                }
            }
            break;
        }
        var3_3 /* !! */  = gu.b;
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_0 = gu.go - gu.cvwa("cwgr", cvxo(int ), (int)56)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == gu.cvwa("cwgs", cvvt(int ), (int)119)) break;
            v4 /* !! */  = (long)gu.cvwa("cwgt", cvvt(int ), (int)120);
        }
        var2_4 = gu.a;
        if (var4_2) {
            throw null;
lbl43:
            // 8 sources

            return;
        }
        if (var2_4) ** GOTO lbl43
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        block12 : switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** GOTO lbl43
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = gu.go - gu.cvwa("cwgu", cvxo(int ), (int)57)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == gu.cvwa("cwgv", cvvt(int ), (int)121)) break;
                    v5 /* !! */  = (long)gu.cvwa("cwgw", cvvt(int ), (int)122);
                }
                if (!this.joining) ** GOTO lbl103
                if (var2_4) ** GOTO lbl43
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_2 = gu.go - gu.cvwa("cwgx", cvxo(int ), (int)58)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == gu.cvwa("cwgy", cvvt(int ), (int)123)) break;
                    v6 /* !! */  = (long)gu.cvwa("cwgz", cvvt(int ), (int)124);
                }
                if (this.targetClickedAt == gu.cvwa("cwha", cvxo(int ), (int)59)) ** GOTO lbl103
                if (var2_4) ** GOTO lbl43
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_3 = gu.go - gu.cvwa("cwhb", cvxo(int ), (int)60)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == gu.cvwa("cwhc", cvvt(int ), (int)125)) break;
                    v7 /* !! */  = (long)gu.cvwa("cwhd", cvvt(int ), (int)126);
                }
                v8 = var1_1.getType();
                v9 /* !! */  = gu.go;
                if (true) ** GOTO lbl74
                block42: while (true) {
                    v9 /* !! */  = (long)(gu.cvwa("cwhf", cvxo(int ), (int)62) - gu.cvwa("cwhe", cvxo(int ), (int)61));
lbl74:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -1855170120: {
                            break block42;
                        }
                        case 1578861544: {
                            continue block42;
                        }
                    }
                    break;
                }
                if (v8 != cr$Type.RECEIVE) ** GOTO lbl103
                if (var2_4) ** GOTO lbl43
                v10 /* !! */  = gu.go;
                if (true) ** GOTO lbl85
                block43: while (true) {
                    v10 /* !! */  = (long)(v11 - gu.cvwa("cwhg", cvxo(int ), (int)63));
lbl85:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -1855170120: {
                            break block43;
                        }
                        case -1027775869: {
                            v11 = gu.cvwa("cwhh", cvxo(int ), (int)64);
                            continue block43;
                        }
                        case 1619377463: {
                            v11 = gu.cvwa("cwhi", cvxo(int ), (int)65);
                            continue block43;
                        }
                    }
                    break;
                }
                if (!(var1_1.getPacket() instanceof class_2678)) ** GOTO lbl103
                if (var2_4 || var2_4) ** GOTO lbl43
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_4 = gu.go - gu.cvwa("cwhj", cvxo(int ), (int)66)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == gu.cvwa("cwhk", cvvt(int ), (int)127)) break;
                    v12 /* !! */  = (long)gu.cvwa("cwhl", cvvt(int ), (int)128);
                }
                this.completeJoining();
                if (var2_4) ** GOTO lbl43
lbl103:
                // 5 sources

                if (!var2_4 && !var2_4) ** break;
                ** continue;
                return;
            }
            case 0: {
                var3_3 /* !! */  = (int)gu.cvwa("cwhm", cvvt(int ), (int)129);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl131
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)gu.cvwa("cwhn", cvvt(int ), (int)130);
                    if (!var4_2) break block12;
                    throw null;
                }
            }
            case 2: {
                var3_3 /* !! */  = (int)gu.cvwa("cwho", cvvt(int ), (int)131);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl152
            }
            case 3: {
                var3_3 /* !! */  = (int)gu.cvwa("cwhp", cvvt(int ), (int)132);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl152
            }
lbl126:
            // 3 sources

            case 4: {
                var3_3 /* !! */  = (int)gu.cvwa("cwhq", cvvt(int ), (int)133);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl144
            }
lbl131:
            // 3 sources

            case 5: {
                var3_3 /* !! */  = (int)gu.cvwa("cwhr", cvvt(int ), (int)134);
                if (!var4_2) ** GOTO lbl126
                throw null;
            }
            case 6: {
                var3_3 /* !! */  = (int)gu.cvwa("cwhs", cvvt(int ), (int)135);
                if (var4_2) {
                    throw null;
                }
            }
lbl139:
            // 4 sources

            case 7: {
                do {
                    var3_3 /* !! */  = (int)gu.cvwa("cwht", cvvt(int ), (int)136);
                } while (!var4_2);
                throw null;
            }
lbl144:
            // 2 sources

            case 8: {
                var3_3 /* !! */  = (int)gu.cvwa("cwhu", cvvt(int ), (int)137);
                if (!var4_2) ** GOTO lbl139
                throw null;
            }
            case 9: {
                var3_3 /* !! */  = (int)gu.cvwa("cwhv", cvvt(int ), (int)138);
                if (!var4_2) ** GOTO lbl131
                throw null;
            }
lbl152:
            // 3 sources

            case 10: {
                var3_3 /* !! */  = (int)gu.cvwa("cwhw", cvvt(int ), (int)139);
                if (!var4_2) ** GOTO lbl126
                throw null;
            }
            case 11: 
        }
        var3_3 /* !! */  = (int)gu.cvwa("cwhx", cvvt(int ), (int)140);
        ** while (!var4_2)
lbl159:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ int cvvt(int n2) {
        return cvvv[n2] ^ cvvy[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onKey(cn var1_1) {
        block43: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = gu.go - gu.cvwa("cwcw", cvxo(int ), (int)33)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v0 /* !! */  == gu.cvwa("cwcx", cvvt(int ), (int)62)) break;
                v0 /* !! */  = (long)gu.cvwa("cwcz", cvvt(int ), (int)63);
            }
            var4_2 = gu.c;
            v1 /* !! */  = gu.go;
            if (true) ** GOTO lbl12
            block28: while (true) {
                v1 /* !! */  = (long)(v2 - gu.cvwa("cwdd", cvxo(int ), (int)34));
lbl12:
                // 2 sources

                switch ((int)v1 /* !! */ ) {
                    case -1855170120: {
                        break block28;
                    }
                    case -1184420228: {
                        v2 = gu.cvwa("cwde", cvxo(int ), (int)35);
                        continue block28;
                    }
                    case 557975288: {
                        v2 = gu.cvwa("cwdg", cvxo(int ), (int)36);
                        continue block28;
                    }
                    case 1791142695: {
                        v2 = gu.cvwa("cwdh", cvxo(int ), (int)37);
                        continue block28;
                    }
                }
                break;
            }
            var3_3 /* !! */  = gu.b;
            while (true) {
                if ((v3 /* !! */  = (cfr_temp_1 = gu.go - gu.cvwa("cwdj", cvxo(int ), (int)38)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v3 /* !! */  == gu.cvwa("cwdk", cvvt(int ), (int)64)) break;
                v3 /* !! */  = (long)gu.cvwa("cwdm", cvvt(int ), (int)65);
            }
            var2_4 = gu.a;
            if (var4_2) {
                throw null;
lbl34:
                // 5 sources

                return;
            }
            if (var2_4 || var2_4) ** GOTO lbl34
            v4 /* !! */  = gu.go;
            if (true) ** GOTO lbl41
            block31: while (true) {
                v4 /* !! */  = (long)(v5 - gu.cvwa("cwdn", cvxo(int ), (int)39));
lbl41:
                // 2 sources

                switch ((int)v4 /* !! */ ) {
                    case -2110963479: {
                        v5 = gu.cvwa("cwdo", cvxo(int ), (int)40);
                        continue block31;
                    }
                    case -1855170120: {
                        break block31;
                    }
                    case -911385292: {
                        v5 = gu.cvwa("cwdp", cvxo(int ), (int)41);
                        continue block31;
                    }
                    case -471599479: {
                        v5 = gu.cvwa("cwdq", cvxo(int ), (int)42);
                        continue block31;
                    }
                }
                break;
            }
            while (true) {
                if ((v6 /* !! */  = (cfr_temp_2 = gu.go - gu.cvwa("cwdt", cvxo(int ), (int)43)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v6 /* !! */  == gu.cvwa("cwdu", cvvt(int ), (int)66)) break;
                v6 /* !! */  = (long)gu.cvwa("cwdy", cvvt(int ), (int)67);
            }
            if (!var1_1.isBindDown(this.disable)) break block43;
            if (var2_4 || var2_4) ** GOTO lbl34
            v7 = gu.cvwa("cwdz", cvvt(int ), (int)68);
            v8 /* !! */  = gu.go;
            if (true) ** GOTO lbl66
            block33: while (true) {
                v8 /* !! */  = (long)(gu.cvwa("cweb", cvxo(int ), (int)45) - gu.cvwa("cwea", cvxo(int ), (int)44));
lbl66:
                // 2 sources

                switch ((int)v8 /* !! */ ) {
                    case -1855170120: {
                        break block33;
                    }
                    case -1492413685: {
                        continue block33;
                    }
                }
                break;
            }
            this.setState((boolean)v7);
            if (var2_4) ** GOTO lbl34
        }
        if (var2_4) ** GOTO lbl34
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        block16 : switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var2_4) ** break;
                ** continue;
                return;
            }
lbl81:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)gu.cvwa("cwec", cvvt(int ), (int)69);
                    if (!var4_2) break block16;
                    throw null;
                }
            }
lbl86:
            // 4 sources

            case 1: {
                var3_3 /* !! */  = (int)gu.cvwa("cwee", cvvt(int ), (int)70);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl104
            }
            case 2: {
                var3_3 /* !! */  = (int)gu.cvwa("cweg", cvvt(int ), (int)71);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl104
            }
            case 3: {
                var3_3 /* !! */  = (int)gu.cvwa("cwej", cvvt(int ), (int)72);
                if (!var4_2) break;
                throw null;
            }
            case 4: {
                var3_3 /* !! */  = (int)gu.cvwa("cwek", cvvt(int ), (int)73);
                if (!var4_2) ** GOTO lbl86
                throw null;
            }
lbl104:
            // 3 sources

            case 5: {
                var3_3 /* !! */  = (int)gu.cvwa("cwel", cvvt(int ), (int)74);
                if (!var4_2) ** GOTO lbl81
                throw null;
            }
            case 6: {
                var3_3 /* !! */  = (int)gu.cvwa("cwem", cvvt(int ), (int)75);
                if (!var4_2) ** GOTO lbl86
                throw null;
            }
            case 7: {
                var3_3 /* !! */  = (int)gu.cvwa("cwen", cvvt(int ), (int)76);
                if (!var4_2) ** GOTO lbl86
                throw null;
            }
            case 8: 
        }
        var3_3 /* !! */  = (int)gu.cvwa("cweo", cvvt(int ), (int)77);
        ** while (!var4_2)
lbl119:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void startJoining(boolean var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = gu.go - gu.cvwa("cwjm", cvxo(int ), (int)85)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == gu.cvwa("cwjn", cvvt(int ), (int)163)) break;
            v0 /* !! */  = (long)gu.cvwa("cwjo", cvvt(int ), (int)164);
        }
        var4_2 = gu.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = gu.go - gu.cvwa("cwjp", cvxo(int ), (int)86)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == gu.cvwa("cwjq", cvvt(int ), (int)165)) break;
            v1 /* !! */  = (long)gu.cvwa("cwjr", cvvt(int ), (int)166);
        }
        var3_3 /* !! */  = gu.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = gu.go - gu.cvwa("cwjs", cvxo(int ), (int)87)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == gu.cvwa("cwjt", cvvt(int ), (int)167)) break;
            v2 /* !! */  = (long)gu.cvwa("cwju", cvvt(int ), (int)168);
        }
        var2_4 = gu.a;
        if (var4_2) {
            throw null;
lbl21:
            // 5 sources

            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl21
        if (var1_1) ** GOTO lbl-1000
        v3 /* !! */  = gu.go;
        if (true) ** GOTO lbl29
        block30: while (true) {
            v3 /* !! */  = (long)(gu.cvwa("cwjw", cvxo(int ), (int)89) - gu.cvwa("cwjv", cvxo(int ), (int)88));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1855170120: {
                    break block30;
                }
                case -264909142: {
                    continue block30;
                }
            }
            break;
        }
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_3 = gu.go - gu.cvwa("cwjx", cvxo(int ), (int)90)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == gu.cvwa("cwjy", cvvt(int ), (int)169)) break;
            v4 /* !! */  = (long)gu.cvwa("cwjz", cvvt(int ), (int)170);
        }
        if (this.keepEnabled.isValue()) lbl-1000:
        // 2 sources

        {
            v5 = gu.cvwa("cwka", cvvt(int ), (int)171);
            if (var4_2) {
                throw null;
            }
        } else {
            v5 = gu.cvwa("cwkb", cvvt(int ), (int)172);
        }
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_4 = gu.go - gu.cvwa("cwkc", cvxo(int ), (int)91)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v6 /* !! */  == gu.cvwa("cwkd", cvvt(int ), (int)173)) break;
            v6 /* !! */  = (long)gu.cvwa("cwke", cvvt(int ), (int)174);
        }
        this.keepEnabledAfterJoin = v5;
        if (var2_4 || var2_4) ** GOTO lbl21
        v7 /* !! */  = gu.go;
        if (true) ** GOTO lbl56
        block33: while (true) {
            v7 /* !! */  = (long)(v8 - gu.cvwa("cwkf", cvxo(int ), (int)92));
lbl56:
            // 2 sources

            switch ((int)v7 /* !! */ ) {
                case -1855170120: {
                    break block33;
                }
                case -270974897: {
                    v8 = gu.cvwa("cwkg", cvxo(int ), (int)93);
                    continue block33;
                }
                case 934738353: {
                    v8 = gu.cvwa("cwkh", cvxo(int ), (int)94);
                    continue block33;
                }
                case 1399614059: {
                    v8 = gu.cvwa("cwki", cvxo(int ), (int)95);
                    continue block33;
                }
            }
            break;
        }
        v9 /* !! */  = gu.go;
        if (true) ** GOTO lbl72
        block34: while (true) {
            v9 /* !! */  = (long)(gu.cvwa("cwkk", cvxo(int ), (int)97) - gu.cvwa("cwkj", cvxo(int ), (int)96));
lbl72:
            // 2 sources

            switch ((int)v9 /* !! */ ) {
                case -1855170120: {
                    break block34;
                }
                case 956772143: {
                    continue block34;
                }
            }
            break;
        }
        v10 = this.grief.getInt();
        while (true) {
            if ((v11 /* !! */  = (cfr_temp_5 = gu.go - gu.cvwa("cwkl", cvxo(int ), (int)98)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v11 /* !! */  == gu.cvwa("cwkm", cvvt(int ), (int)175)) break;
            v11 /* !! */  = (long)gu.cvwa("cwkn", cvvt(int ), (int)176);
        }
        this.requestedGrief = v10;
        if (var2_4) ** GOTO lbl21
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** GOTO lbl21
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_6 = gu.go - gu.cvwa("cwko", cvxo(int ), (int)99)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == gu.cvwa("cwkp", cvvt(int ), (int)177)) break;
                    v12 /* !! */  = (long)gu.cvwa("cwkq", cvvt(int ), (int)178);
                }
                this.startRequestedJoining();
                if (!var2_4 && !var2_4) ** break;
                ** continue;
                return;
            }
            case 0: {
                var3_3 /* !! */  = (int)gu.cvwa("cwkr", cvvt(int ), (int)179);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl116
            }
lbl103:
            // 2 sources

            case 1: {
                var3_3 /* !! */  = (int)gu.cvwa("cwks", cvvt(int ), (int)180);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl135
            }
lbl108:
            // 2 sources

            case 2: {
                var3_3 /* !! */  = (int)gu.cvwa("cwkt", cvvt(int ), (int)181);
                if (!var4_2) ** GOTO lbl103
                throw null;
            }
            case 3: {
                var3_3 /* !! */  = (int)gu.cvwa("cwku", cvvt(int ), (int)182);
                if (var4_2) {
                    throw null;
                }
            }
lbl116:
            // 5 sources

            case 4: {
                var3_3 /* !! */  = (int)gu.cvwa("cwkv", cvvt(int ), (int)183);
                if (!var4_2) ** GOTO lbl108
                throw null;
            }
            case 5: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)gu.cvwa("cwkw", cvvt(int ), (int)184);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl130
                    break;
                }
            }
            case 6: {
                var3_3 /* !! */  = (int)gu.cvwa("cwkx", cvvt(int ), (int)185);
                if (!var4_2) ** GOTO lbl116
                throw null;
            }
lbl130:
            // 2 sources

            case 7: {
                do {
                    var3_3 /* !! */  = (int)gu.cvwa("cwky", cvvt(int ), (int)186);
                } while (!var4_2);
                throw null;
            }
lbl135:
            // 2 sources

            case 8: {
                var3_3 /* !! */  = (int)gu.cvwa("cwkz", cvvt(int ), (int)187);
                if (!var4_2) break;
                throw null;
            }
            case 9: 
        }
        var3_3 /* !! */  = (int)gu.cvwa("cwla", cvvt(int ), (int)188);
        ** while (!var4_2)
lbl142:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void handleMenu(class_465<?> var1_1) {
        block168: {
            block169: {
                var8_2 = gu.c;
                var7_3 /* !! */  = gu.b;
                var6_4 = gu.a;
                if (var8_2) {
                    throw null;
lbl6:
                    // 46 sources

                    return;
                }
                if (var6_4 || var6_4) ** GOTO lbl6
                var2_5 = var1_1.method_25440().getString();
                if (var6_4 || var6_4) ** GOTO lbl6
                var3_6 = Math.max((long)gu.cvwa("cwtf", cvxo(int ), (int)188), (long)this.speed.getInt() * gu.cvwa("cwtg", cvxo(int ), (int)189));
                if (var6_4 || var6_4) ** GOTO lbl6
                if (!var2_5.contains("\u0412\u044b\u0431\u043e\u0440 \u0441\u0435\u0440\u0432\u0435\u0440\u0430")) break block168;
                if (var6_4 || var6_4) ** GOTO lbl6
                if (this.clickTimer.finished(var3_6)) break block169;
                if (var6_4) ** GOTO lbl6
                return;
            }
            if (var6_4 || var6_4) ** GOTO lbl6
            var5_7 = this.findSlotByName(var1_1.method_17577(), "\u0413\u0440\u0438\u0444\u0435\u0440\u0441\u043a\u043e\u0435 \u0432\u044b\u0436\u0438\u0432\u0430\u043d\u0438\u0435 (1.16.5-1.20.4)");
            if (var6_4 || var6_4) ** GOTO lbl6
            if (var5_7 != gu.cvwa("cwth", cvvt(int ), (int)313)) {
                v0 /* !! */  = var5_7;
                if (var8_2) {
                    throw null;
                }
            } else {
                v0 /* !! */  = (int)gu.cvwa("cwti", cvvt(int ), (int)314);
            }
            this.clickSlot(v0 /* !! */ );
            if (var6_4 || var6_4) ** GOTO lbl6
            this.clickTimer.reset();
            if (var6_4 || var6_4) ** GOTO lbl6
            return;
        }
        if (var6_4 || var6_4) ** GOTO lbl6
        if (!var2_5.contains("\u0413\u0440\u0438\u0444\u0435\u0440\u0441\u043a\u043e\u0435 \u0432\u044b\u0436\u0438\u0432\u0430\u043d\u0438\u0435 (1.16.5-1.20.4)")) ** GOTO lbl58
        if (var6_4 || var6_4) ** GOTO lbl6
        if (this.clickTimer.finished(var3_6)) ** GOTO lbl43
        if (var7_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var7_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var6_4) ** GOTO lbl6
                return;
            }
lbl43:
            // 1 sources

            if (var6_4 || var6_4) ** GOTO lbl6
            var5_8 = this.findTargetGriefSlot(var1_1.method_17577());
            if (var6_4 || var6_4) ** GOTO lbl6
            if (var5_8 == gu.cvwa("cwtj", cvvt(int ), (int)315)) ** GOTO lbl56
            if (var6_4 || var6_4) ** GOTO lbl6
            this.lockedTargetSlot = var5_8;
            if (var6_4 || var6_4) ** GOTO lbl6
            this.clickSlot(var5_8);
            if (var6_4 || var6_4) ** GOTO lbl6
            this.targetClickedAt = System.currentTimeMillis();
            if (var6_4 || var6_4) ** GOTO lbl6
            this.clickTimer.reset();
            if (var6_4) ** GOTO lbl6
lbl56:
            // 2 sources

            if (var6_4 || var6_4) ** GOTO lbl6
            return;
lbl58:
            // 1 sources

            if (var6_4 || var6_4) ** GOTO lbl6
            if (!var2_5.contains("\u0412\u044b\u0431\u043e\u0440 \u043c\u0438\u0440\u0430 \u0433\u0440\u0438\u0444\u0430")) ** GOTO lbl63
            if (var6_4) ** GOTO lbl6
            if (this.clickTimer.finished(var3_6)) ** GOTO lbl65
            if (var6_4) ** GOTO lbl6
lbl63:
            // 2 sources

            if (var6_4 || var6_4) ** GOTO lbl6
            return;
lbl65:
            // 1 sources

            if (var6_4 || var6_4) ** GOTO lbl6
            if (this.lockedTargetSlot == gu.cvwa("cwtk", cvvt(int ), (int)316)) ** GOTO lbl77
            if (var6_4) ** GOTO lbl6
            if (!this.isValidSlot(var1_1.method_17577(), this.lockedTargetSlot)) ** GOTO lbl77
            if (var6_4 || var6_4) ** GOTO lbl6
            this.clickSlot(this.lockedTargetSlot);
            if (var6_4 || var6_4) ** GOTO lbl6
            this.targetClickedAt = System.currentTimeMillis();
            if (var6_4 || var6_4) ** GOTO lbl6
            this.clickTimer.reset();
            if (var6_4 || var6_4) ** GOTO lbl6
            return;
lbl77:
            // 2 sources

            if (var6_4 || var6_4) ** GOTO lbl6
            this.lockedTargetSlot = (int)gu.cvwa("cwtl", cvvt(int ), (int)317);
            if (var6_4 || var6_4) ** GOTO lbl6
            var5_9 = this.findTargetGriefSlot(var1_1.method_17577());
            if (var6_4 || var6_4) ** GOTO lbl6
            if (var5_9 == gu.cvwa("cwtm", cvvt(int ), (int)318)) ** GOTO lbl95
            if (var6_4 || var6_4) ** GOTO lbl6
            this.lockedTargetSlot = var5_9;
            if (var6_4 || var6_4) ** GOTO lbl6
            this.pageSwitches = (int)gu.cvwa("cwtn", cvvt(int ), (int)319);
            if (var6_4 || var6_4) ** GOTO lbl6
            this.clickSlot(var5_9);
            if (var6_4 || var6_4) ** GOTO lbl6
            this.targetClickedAt = System.currentTimeMillis();
            if (var6_4 || var6_4) ** GOTO lbl6
            this.clickTimer.reset();
            if (var6_4 || var6_4) ** GOTO lbl6
            return;
lbl95:
            // 1 sources

            if (var6_4 || var6_4) ** GOTO lbl6
            if (this.pageSwitches >= gu.cvwa("cwto", cvvt(int ), (int)320)) ** GOTO lbl106
            if (var6_4) ** GOTO lbl6
            if (!this.isValidSlot(var1_1.method_17577(), (int)gu.cvwa("cwtp", cvvt(int ), (int)321))) ** GOTO lbl106
            if (var6_4 || var6_4) ** GOTO lbl6
            this.clickSlot((int)gu.cvwa("cwtq", cvvt(int ), (int)322));
            if (var6_4 || var6_4) ** GOTO lbl6
            this.pageSwitches += gu.cvwa("cwtr", cvvt(int ), (int)323);
            if (var6_4 || var6_4) ** GOTO lbl6
            this.clickTimer.reset();
            if (var6_4) ** GOTO lbl6
lbl106:
            // 3 sources

            if (!var6_4 && !var6_4) ** break;
            ** continue;
            return;
lbl109:
            // 2 sources

            case 0: {
                var7_3 /* !! */  = (int)gu.cvwa("cwts", cvvt(int ), (int)324);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl181
            }
            case 1: {
                var7_3 /* !! */  = (int)gu.cvwa("cwtt", cvvt(int ), (int)325);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl304
            }
            case 2: {
                var7_3 /* !! */  = (int)gu.cvwa("cwtu", cvvt(int ), (int)326);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl325
            }
lbl124:
            // 2 sources

            case 3: {
                var7_3 /* !! */  = (int)gu.cvwa("cwtv", cvvt(int ), (int)327);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl285
            }
            case 4: {
                var7_3 /* !! */  = (int)gu.cvwa("cwtw", cvvt(int ), (int)328);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl139
            }
            case 5: {
                var7_3 /* !! */  = (int)gu.cvwa("cwtx", cvvt(int ), (int)329);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl261
            }
lbl139:
            // 2 sources

            case 6: {
                var7_3 /* !! */  = (int)gu.cvwa("cwty", cvvt(int ), (int)330);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl502
            }
            case 7: {
                var7_3 /* !! */  = (int)gu.cvwa("cwtz", cvvt(int ), (int)331);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl386
            }
lbl149:
            // 3 sources

            case 8: {
                var7_3 /* !! */  = (int)gu.cvwa("cwua", cvvt(int ), (int)332);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl316
            }
lbl154:
            // 4 sources

            case 9: {
                var7_3 /* !! */  = (int)gu.cvwa("cwub", cvvt(int ), (int)333);
                if (!var8_2) break;
                throw null;
            }
lbl158:
            // 3 sources

            case 10: {
                var7_3 /* !! */  = (int)gu.cvwa("cwuc", cvvt(int ), (int)334);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl191
            }
            case 11: {
                var7_3 /* !! */  = (int)gu.cvwa("cwud", cvvt(int ), (int)335);
                if (!var8_2) ** GOTO lbl154
                throw null;
            }
            case 12: {
                var7_3 /* !! */  = (int)gu.cvwa("cwue", cvvt(int ), (int)336);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl321
            }
lbl172:
            // 4 sources

            case 13: {
                var7_3 /* !! */  = (int)gu.cvwa("cwuf", cvvt(int ), (int)337);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl377
            }
            case 14: {
                var7_3 /* !! */  = (int)gu.cvwa("cwug", cvvt(int ), (int)338);
                if (!var8_2) ** GOTO lbl109
                throw null;
            }
lbl181:
            // 2 sources

            case 15: {
                var7_3 /* !! */  = (int)gu.cvwa("cwuh", cvvt(int ), (int)339);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl247
            }
            case 16: {
                var7_3 /* !! */  = (int)gu.cvwa("cwui", cvvt(int ), (int)340);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl398
            }
lbl191:
            // 4 sources

            case 17: {
                do {
                    var7_3 /* !! */  = (int)gu.cvwa("cwuj", cvvt(int ), (int)341);
                } while (!var8_2);
                throw null;
            }
            case 18: {
                var7_3 /* !! */  = (int)gu.cvwa("cwuk", cvvt(int ), (int)342);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl349
            }
            case 19: {
                var7_3 /* !! */  = (int)gu.cvwa("cwul", cvvt(int ), (int)343);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl349
            }
lbl206:
            // 3 sources

            case 20: {
                var7_3 /* !! */  = (int)gu.cvwa("cwum", cvvt(int ), (int)344);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl276
            }
lbl211:
            // 4 sources

            case 21: {
                var7_3 /* !! */  = (int)gu.cvwa("cwun", cvvt(int ), (int)345);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl428
            }
            case 22: {
                var7_3 /* !! */  = (int)gu.cvwa("cwuo", cvvt(int ), (int)346);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl478
            }
lbl221:
            // 2 sources

            case 23: {
                var7_3 /* !! */  = (int)gu.cvwa("cwup", cvvt(int ), (int)347);
                if (!var8_2) ** GOTO lbl172
                throw null;
            }
lbl225:
            // 3 sources

            case 24: {
                var7_3 /* !! */  = (int)gu.cvwa("cwuq", cvvt(int ), (int)348);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl411
            }
            case 25: {
                var7_3 /* !! */  = (int)gu.cvwa("cwur", cvvt(int ), (int)349);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl281
            }
lbl235:
            // 2 sources

            case 26: {
                var7_3 /* !! */  = (int)gu.cvwa("cwus", cvvt(int ), (int)350);
                if (!var8_2) ** GOTO lbl211
                throw null;
            }
            case 27: {
                var7_3 /* !! */  = (int)gu.cvwa("cwut", cvvt(int ), (int)351);
                if (!var8_2) ** GOTO lbl149
                throw null;
            }
            case 28: {
                var7_3 /* !! */  = (int)gu.cvwa("cwuu", cvvt(int ), (int)352);
                if (!var8_2) ** GOTO lbl206
                throw null;
            }
lbl247:
            // 2 sources

            case 29: {
                var7_3 /* !! */  = (int)gu.cvwa("cwuv", cvvt(int ), (int)353);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl465
            }
            case 30: {
                var7_3 /* !! */  = (int)gu.cvwa("cwuw", cvvt(int ), (int)354);
                if (!var8_2) ** GOTO lbl225
                throw null;
            }
            case 31: {
                var7_3 /* !! */  = (int)gu.cvwa("cwux", cvvt(int ), (int)355);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl271
            }
lbl261:
            // 3 sources

            case 32: {
                var7_3 /* !! */  = (int)gu.cvwa("cwuy", cvvt(int ), (int)356);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl441
            }
lbl266:
            // 3 sources

            case 33: {
                var7_3 /* !! */  = (int)gu.cvwa("cwuz", cvvt(int ), (int)357);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl329
            }
lbl271:
            // 4 sources

            case 34: {
                var7_3 /* !! */  = (int)gu.cvwa("cwva", cvvt(int ), (int)358);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl407
            }
lbl276:
            // 3 sources

            case 35: {
                var7_3 /* !! */  = (int)gu.cvwa("cwvb", cvvt(int ), (int)359);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl354
            }
lbl281:
            // 4 sources

            case 36: {
                var7_3 /* !! */  = (int)gu.cvwa("cwvc", cvvt(int ), (int)360);
                if (!var8_2) ** GOTO lbl149
                throw null;
            }
lbl285:
            // 2 sources

            case 37: {
                var7_3 /* !! */  = (int)gu.cvwa("cwvd", cvvt(int ), (int)361);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl398
            }
lbl290:
            // 4 sources

            case 38: {
                var7_3 /* !! */  = (int)gu.cvwa("cwve", cvvt(int ), (int)362);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl344
            }
            case 39: {
                var7_3 /* !! */  = (int)gu.cvwa("cwvf", cvvt(int ), (int)363);
                if (!var8_2) ** GOTO lbl266
                throw null;
            }
            case 40: {
                var7_3 /* !! */  = (int)gu.cvwa("cwvg", cvvt(int ), (int)364);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl402
            }
lbl304:
            // 2 sources

            case 41: {
                var7_3 /* !! */  = (int)gu.cvwa("cwvh", cvvt(int ), (int)365);
                if (!var8_2) ** GOTO lbl211
                throw null;
            }
            case 42: {
                var7_3 /* !! */  = (int)gu.cvwa("cwvi", cvvt(int ), (int)366);
                if (!var8_2) ** GOTO lbl211
                throw null;
            }
lbl312:
            // 3 sources

            case 43: {
                var7_3 /* !! */  = (int)gu.cvwa("cwvj", cvvt(int ), (int)367);
                if (!var8_2) ** GOTO lbl266
                throw null;
            }
lbl316:
            // 2 sources

            case 44: {
                var7_3 /* !! */  = (int)gu.cvwa("cwvk", cvvt(int ), (int)368);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl424
            }
lbl321:
            // 2 sources

            case 45: {
                var7_3 /* !! */  = (int)gu.cvwa("cwvl", cvvt(int ), (int)369);
                if (!var8_2) ** GOTO lbl281
                throw null;
            }
lbl325:
            // 2 sources

            case 46: {
                var7_3 /* !! */  = (int)gu.cvwa("cwvm", cvvt(int ), (int)370);
                if (!var8_2) ** GOTO lbl206
                throw null;
            }
lbl329:
            // 2 sources

            case 47: {
                var7_3 /* !! */  = (int)gu.cvwa("cwvn", cvvt(int ), (int)371);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl498
            }
            case 48: {
                var7_3 /* !! */  = (int)gu.cvwa("cwvo", cvvt(int ), (int)372);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl415
            }
lbl339:
            // 3 sources

            case 49: {
                var7_3 /* !! */  = (int)gu.cvwa("cwvp", cvvt(int ), (int)373);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl449
            }
lbl344:
            // 2 sources

            case 50: {
                var7_3 /* !! */  = (int)gu.cvwa("cwvq", cvvt(int ), (int)374);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl478
            }
lbl349:
            // 3 sources

            case 51: {
                var7_3 /* !! */  = (int)gu.cvwa("cwvr", cvvt(int ), (int)375);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl407
            }
lbl354:
            // 3 sources

            case 52: {
                var7_3 /* !! */  = (int)gu.cvwa("cwvs", cvvt(int ), (int)376);
                if (!var8_2) ** GOTO lbl235
                throw null;
            }
lbl358:
            // 2 sources

            case 53: {
                var7_3 /* !! */  = (int)gu.cvwa("cwvt", cvvt(int ), (int)377);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl432
            }
            case 54: {
                var7_3 /* !! */  = (int)gu.cvwa("cwvu", cvvt(int ), (int)378);
                if (!var8_2) ** GOTO lbl354
                throw null;
            }
            case 55: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var7_3 /* !! */  = (int)gu.cvwa("cwvv", cvvt(int ), (int)379);
                    if (!var8_2) ** GOTO lbl312
                    throw null;
                }
            }
            case 56: {
                var7_3 /* !! */  = (int)gu.cvwa("cwvw", cvvt(int ), (int)380);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl386
            }
lbl377:
            // 2 sources

            case 57: {
                var7_3 /* !! */  = (int)gu.cvwa("cwvx", cvvt(int ), (int)381);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl394
            }
lbl382:
            // 2 sources

            case 58: {
                var7_3 /* !! */  = (int)gu.cvwa("cwvy", cvvt(int ), (int)382);
                if (!var8_2) ** GOTO lbl261
                throw null;
            }
lbl386:
            // 3 sources

            case 59: {
                var7_3 /* !! */  = (int)gu.cvwa("cwvz", cvvt(int ), (int)383);
                if (!var8_2) ** GOTO lbl191
                throw null;
            }
            case 60: {
                var7_3 /* !! */  = (int)gu.cvwa("cwwa", cvvt(int ), (int)384);
                if (!var8_2) ** GOTO lbl172
                throw null;
            }
lbl394:
            // 2 sources

            case 61: {
                var7_3 /* !! */  = (int)gu.cvwa("cwwb", cvvt(int ), (int)385);
                if (!var8_2) ** GOTO lbl191
                throw null;
            }
lbl398:
            // 3 sources

            case 62: {
                var7_3 /* !! */  = (int)gu.cvwa("cwwc", cvvt(int ), (int)386);
                if (!var8_2) ** GOTO lbl290
                throw null;
            }
lbl402:
            // 2 sources

            case 63: {
                var7_3 /* !! */  = (int)gu.cvwa("cwwd", cvvt(int ), (int)387);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl436
            }
lbl407:
            // 3 sources

            case 64: {
                var7_3 /* !! */  = (int)gu.cvwa("cwwe", cvvt(int ), (int)388);
                if (!var8_2) ** GOTO lbl154
                throw null;
            }
lbl411:
            // 3 sources

            case 65: {
                var7_3 /* !! */  = (int)gu.cvwa("cwwf", cvvt(int ), (int)389);
                if (!var8_2) ** GOTO lbl271
                throw null;
            }
lbl415:
            // 2 sources

            case 66: {
                var7_3 /* !! */  = (int)gu.cvwa("cwwg", cvvt(int ), (int)390);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl461
            }
            case 67: {
                var7_3 /* !! */  = (int)gu.cvwa("cwwh", cvvt(int ), (int)391);
                if (!var8_2) ** GOTO lbl221
                throw null;
            }
lbl424:
            // 2 sources

            case 68: {
                var7_3 /* !! */  = (int)gu.cvwa("cwwi", cvvt(int ), (int)392);
                if (!var8_2) ** GOTO lbl411
                throw null;
            }
lbl428:
            // 2 sources

            case 69: {
                var7_3 /* !! */  = (int)gu.cvwa("cwwj", cvvt(int ), (int)393);
                if (!var8_2) ** GOTO lbl158
                throw null;
            }
lbl432:
            // 2 sources

            case 70: {
                var7_3 /* !! */  = (int)gu.cvwa("cwwk", cvvt(int ), (int)394);
                if (!var8_2) ** GOTO lbl358
                throw null;
            }
lbl436:
            // 3 sources

            case 71: {
                var7_3 /* !! */  = (int)gu.cvwa("cwwl", cvvt(int ), (int)395);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl502
            }
lbl441:
            // 2 sources

            case 72: {
                var7_3 /* !! */  = (int)gu.cvwa("cwwm", cvvt(int ), (int)396);
                if (!var8_2) ** GOTO lbl154
                throw null;
            }
lbl445:
            // 2 sources

            case 73: {
                var7_3 /* !! */  = (int)gu.cvwa("cwwn", cvvt(int ), (int)397);
                if (!var8_2) ** GOTO lbl172
                throw null;
            }
lbl449:
            // 2 sources

            case 74: {
                var7_3 /* !! */  = (int)gu.cvwa("cwwo", cvvt(int ), (int)398);
                if (!var8_2) ** GOTO lbl339
                throw null;
            }
            case 75: {
                var7_3 /* !! */  = (int)gu.cvwa("cwwp", cvvt(int ), (int)399);
                if (!var8_2) ** GOTO lbl436
                throw null;
            }
            case 76: {
                var7_3 /* !! */  = (int)gu.cvwa("cwwq", cvvt(int ), (int)400);
                if (!var8_2) ** GOTO lbl382
                throw null;
            }
lbl461:
            // 2 sources

            case 77: {
                var7_3 /* !! */  = (int)gu.cvwa("cwwr", cvvt(int ), (int)401);
                if (!var8_2) ** GOTO lbl290
                throw null;
            }
lbl465:
            // 2 sources

            case 78: {
                var7_3 /* !! */  = (int)gu.cvwa("cwws", cvvt(int ), (int)402);
                if (!var8_2) ** GOTO lbl312
                throw null;
            }
            case 79: {
                var7_3 /* !! */  = (int)gu.cvwa("cwwt", cvvt(int ), (int)403);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl498
            }
            case 80: {
                var7_3 /* !! */  = (int)gu.cvwa("cwwu", cvvt(int ), (int)404);
                if (!var8_2) ** GOTO lbl124
                throw null;
            }
lbl478:
            // 3 sources

            case 81: {
                var7_3 /* !! */  = (int)gu.cvwa("cwwv", cvvt(int ), (int)405);
                if (!var8_2) ** GOTO lbl225
                throw null;
            }
            case 82: {
                var7_3 /* !! */  = (int)gu.cvwa("cwww", cvvt(int ), (int)406);
                if (!var8_2) ** GOTO lbl276
                throw null;
            }
            case 83: {
                var7_3 /* !! */  = (int)gu.cvwa("cwwx", cvvt(int ), (int)407);
                if (!var8_2) ** GOTO lbl339
                throw null;
            }
            case 84: {
                var7_3 /* !! */  = (int)gu.cvwa("cwwy", cvvt(int ), (int)408);
                if (!var8_2) ** GOTO lbl445
                throw null;
            }
            case 85: {
                var7_3 /* !! */  = (int)gu.cvwa("cwwz", cvvt(int ), (int)409);
                if (!var8_2) ** GOTO lbl271
                throw null;
            }
lbl498:
            // 3 sources

            case 86: {
                var7_3 /* !! */  = (int)gu.cvwa("cwxa", cvvt(int ), (int)410);
                if (!var8_2) ** GOTO lbl290
                throw null;
            }
lbl502:
            // 3 sources

            case 87: {
                var7_3 /* !! */  = (int)gu.cvwa("cwxb", cvvt(int ), (int)411);
                if (!var8_2) ** GOTO lbl158
                throw null;
            }
            case 88: {
                var7_3 /* !! */  = (int)gu.cvwa("cwxc", cvvt(int ), (int)412);
                if (!var8_2) ** GOTO lbl281
                throw null;
            }
            case 89: 
        }
        var7_3 /* !! */  = (int)gu.cvwa("cwxd", cvvt(int ), (int)413);
        ** while (!var8_2)
lbl513:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void cxss() {
        gu.cvxr[0] = 5610562240046865269L;
        gu.cvxr[1] = -6596510246026297604L;
        gu.cvxr[2] = 87602446785618222L;
        gu.cvxr[3] = 8838769480633506893L;
        gu.cvxr[4] = -1063792870531061360L;
        gu.cvxr[5] = -1091165199257419168L;
        gu.cvxr[6] = -4047289433427930929L;
        gu.cvxr[7] = -7288518602342870689L;
        gu.cvxr[8] = -2904521596716419967L;
        gu.cvxr[9] = -3569656041429243309L;
        gu.cvxr[10] = 5080356937248671276L;
        gu.cvxr[11] = -8916366559358161244L;
        gu.cvxr[12] = 5546295440606958598L;
        gu.cvxr[13] = 8555711452272808456L;
        gu.cvxr[14] = 7083061302090415606L;
        gu.cvxr[15] = -4505866547589758542L;
        gu.cvxr[16] = 3875101396485155690L;
        gu.cvxr[17] = 1171389437054184411L;
        gu.cvxr[18] = -5402737040755905019L;
        gu.cvxr[19] = -1926173236119596324L;
        gu.cvxr[20] = 1566792808932184167L;
        gu.cvxr[21] = -237812409688010285L;
        gu.cvxr[22] = 7303896739106469099L;
        gu.cvxr[23] = -8095259435088602892L;
        gu.cvxr[24] = 4297823780517170227L;
        gu.cvxr[25] = 3600300591660835368L;
        gu.cvxr[26] = 5417698957587738456L;
        gu.cvxr[27] = 4077077855177654074L;
        gu.cvxr[28] = 2349143660628141221L;
        gu.cvxr[29] = -2593069556701924279L;
        gu.cvxr[30] = 5903037389403882445L;
        gu.cvxr[31] = 1641546094268454200L;
        gu.cvxr[32] = 8687852872132097299L;
        gu.cvxr[33] = 1723031107858384209L;
        gu.cvxr[34] = 2097895696212760519L;
        gu.cvxr[35] = -7244334812548178417L;
        gu.cvxr[36] = -1294221400830608703L;
        gu.cvxr[37] = 7713088370515429280L;
        gu.cvxr[38] = -6551973412311556301L;
        gu.cvxr[39] = 6154988798135040419L;
        gu.cvxr[40] = -1623442196140583323L;
        gu.cvxr[41] = 6636718569454469867L;
        gu.cvxr[42] = -6865889405251088259L;
        gu.cvxr[43] = 9047840442762412349L;
        gu.cvxr[44] = 2164504533821147033L;
        gu.cvxr[45] = -3233439020865972493L;
        gu.cvxr[46] = -784109948025452376L;
        gu.cvxr[47] = -1020674078581772323L;
        gu.cvxr[48] = 3400928267028194946L;
        gu.cvxr[49] = 8243310766367141331L;
        gu.cvxr[50] = -2091481059012742938L;
        gu.cvxr[51] = -1776293654528435827L;
        gu.cvxr[52] = -8882295875565357810L;
        gu.cvxr[53] = 2983663077030711768L;
        gu.cvxr[54] = -4499283276504992224L;
        gu.cvxr[55] = -2968990389217580261L;
        gu.cvxr[56] = -5362814764794629658L;
        gu.cvxr[57] = 1232476834615533981L;
        gu.cvxr[58] = 5187083567580361741L;
        gu.cvxr[59] = 7636904375010497753L;
        gu.cvxr[60] = -8939906144086037191L;
        gu.cvxr[61] = 9207344559105900406L;
        gu.cvxr[62] = 712419467512711459L;
        gu.cvxr[63] = -7197964002438476890L;
        gu.cvxr[64] = 798373478136786864L;
        gu.cvxr[65] = 832717012832572012L;
        gu.cvxr[66] = 2381621981861279263L;
        gu.cvxr[67] = -9192710799055853729L;
        gu.cvxr[68] = -2356310808075398121L;
        gu.cvxr[69] = 512453159140305259L;
        gu.cvxr[70] = -9218562654017434353L;
        gu.cvxr[71] = -6635911737468567402L;
        gu.cvxr[72] = 2430160608634295739L;
        gu.cvxr[73] = 1929443117837642567L;
        gu.cvxr[74] = -6207055295428071036L;
        gu.cvxr[75] = -3732456239462701154L;
        gu.cvxr[76] = 7478997072445883801L;
        gu.cvxr[77] = -5469671864047656241L;
        gu.cvxr[78] = 1542543393046262926L;
        gu.cvxr[79] = -4107726779562489406L;
        gu.cvxr[80] = 2943068768900591989L;
        gu.cvxr[81] = 3234771202524481754L;
        gu.cvxr[82] = 8634673194002572379L;
        gu.cvxr[83] = 1158841759452797863L;
        gu.cvxr[84] = -4971223022568933905L;
        gu.cvxr[85] = -4503896863813792143L;
        gu.cvxr[86] = -6911943599476922045L;
        gu.cvxr[87] = 5938156770267458806L;
        gu.cvxr[88] = -4400186835587404053L;
        gu.cvxr[89] = 6814533509991285137L;
        gu.cvxr[90] = 7775953154467466823L;
        gu.cvxr[91] = 2111407991694537390L;
        gu.cvxr[92] = -2320912476300653972L;
        gu.cvxr[93] = -323783489366242556L;
        gu.cvxr[94] = 6154211452782675241L;
        gu.cvxr[95] = 1605273666415650164L;
        gu.cvxr[96] = 1241548061152617493L;
        gu.cvxr[97] = 5223328159696937879L;
        gu.cvxr[98] = -3720250356720278596L;
        gu.cvxr[99] = -4686661584609456996L;
    }

    private static /* synthetic */ void cxsr() {
        gu.cvxp[300] = -4616371826199487351L;
        gu.cvxp[301] = -8582826773968026369L;
        gu.cvxp[302] = -4914138485500748575L;
        gu.cvxp[303] = 5566225896051306689L;
        gu.cvxp[304] = 1601371567494042928L;
        gu.cvxp[305] = 8358513127794282838L;
        gu.cvxp[306] = 3367909757204849708L;
        gu.cvxp[307] = -5917657302853165915L;
        gu.cvxp[308] = 6105258253058942807L;
        gu.cvxp[309] = -3154503035716104420L;
        gu.cvxp[310] = 1422093217313498246L;
        gu.cvxp[311] = 7304844904336713671L;
        gu.cvxp[312] = 2540669915244717131L;
        gu.cvxp[313] = -6214317721823046700L;
        gu.cvxp[314] = 4754047177284702912L;
        gu.cvxp[315] = 1262912692088600838L;
        gu.cvxp[316] = 124889052628207347L;
        gu.cvxp[317] = 3938981050083425783L;
        gu.cvxp[318] = -2402799316114706751L;
        gu.cvxp[319] = -4529081417767654306L;
        gu.cvxp[320] = 7182740228915943128L;
        gu.cvxp[321] = 5645787342139348843L;
        gu.cvxp[322] = 6448251524835344770L;
        gu.cvxp[323] = 6706608990627155092L;
        gu.cvxp[324] = -5666685091026743248L;
        gu.cvxp[325] = -6813333325344179569L;
        gu.cvxp[326] = 809032743724398074L;
        gu.cvxp[327] = -2017580111801452583L;
        gu.cvxp[328] = 4842748460043349041L;
        gu.cvxp[329] = 752906717103360979L;
        gu.cvxp[330] = 2102320268271137544L;
        gu.cvxp[331] = -5683093020203336218L;
        gu.cvxp[332] = 1376469739546406187L;
        gu.cvxp[333] = -2038467933625033740L;
        gu.cvxp[334] = -3681261643394053825L;
        gu.cvxp[335] = -3099283805140761267L;
        gu.cvxp[336] = -9191046088293747531L;
        gu.cvxp[337] = 8641458790366336920L;
        gu.cvxp[338] = 5594128488230916262L;
        gu.cvxp[339] = -8210284229588993546L;
        gu.cvxp[340] = -2548851754696240537L;
        gu.cvxp[341] = 1112056577015325593L;
        gu.cvxp[342] = -2249608218780953386L;
        gu.cvxp[343] = 5064902609557015433L;
        gu.cvxp[344] = -7900101208075319718L;
        gu.cvxp[345] = 7190316865590993590L;
        gu.cvxp[346] = 3508852451499045111L;
        gu.cvxp[347] = -8248481521189738098L;
        gu.cvxp[348] = -6945544343131598273L;
        gu.cvxp[349] = -8115898050099442102L;
        gu.cvxp[350] = 246972145374014859L;
        gu.cvxp[351] = 8208378983992569147L;
        gu.cvxp[352] = -8362521516944670255L;
        gu.cvxp[353] = -2546872087678023108L;
        gu.cvxp[354] = 4030040187240953879L;
        gu.cvxp[355] = -3457616735640319775L;
        gu.cvxp[356] = 6785653952266379428L;
        gu.cvxp[357] = 7006883351995350770L;
        gu.cvxp[358] = 2657637062484568872L;
        gu.cvxp[359] = -8181689965322930028L;
        gu.cvxp[360] = 2729928276043508856L;
        gu.cvxp[361] = -2658715465853748740L;
        gu.cvxp[362] = -952162124917197271L;
        gu.cvxp[363] = 8848260822908711572L;
        gu.cvxp[364] = 4160580458976550220L;
        gu.cvxp[365] = -2621262045934161400L;
        gu.cvxp[366] = 1391230337787434894L;
        gu.cvxp[367] = -6027919617206867311L;
        gu.cvxp[368] = 8301374940042883558L;
        gu.cvxp[369] = -7455450438042365666L;
        gu.cvxp[370] = -2835331748650705305L;
        gu.cvxp[371] = -5996419311321724640L;
        gu.cvxp[372] = 5467108490766990199L;
        gu.cvxp[373] = 8921117933770968355L;
        gu.cvxp[374] = -5332296570679881932L;
        gu.cvxp[375] = -3491999602418201637L;
        gu.cvxp[376] = -6064033821294573122L;
        gu.cvxp[377] = -3404964949924994160L;
        gu.cvxp[378] = -4677406575676302518L;
        gu.cvxp[379] = 7831645264765569511L;
        gu.cvxp[380] = -5449238273186171447L;
        gu.cvxp[381] = -7965659876012280436L;
        gu.cvxp[382] = -370727378805951039L;
        gu.cvxp[383] = -1500167766833656578L;
        gu.cvxp[384] = 3696183563322289270L;
        gu.cvxp[385] = 8818686839300042526L;
        gu.cvxp[386] = -1609010489422852322L;
        gu.cvxp[387] = -6802552589656761605L;
        gu.cvxp[388] = -4741543164001817536L;
        gu.cvxp[389] = -6836811366584030357L;
    }

    private static /* synthetic */ void cxsk() {
        gu.cvvy[400] = 827612982;
        gu.cvvy[401] = 812776795;
        gu.cvvy[402] = -2070312972;
        gu.cvvy[403] = -602409599;
        gu.cvvy[404] = -1810244953;
        gu.cvvy[405] = 1350973432;
        gu.cvvy[406] = -1205933883;
        gu.cvvy[407] = -358126894;
        gu.cvvy[408] = 663789838;
        gu.cvvy[409] = -1447207460;
        gu.cvvy[410] = -2080923743;
        gu.cvvy[411] = -962807827;
        gu.cvvy[412] = -1952657541;
        gu.cvvy[413] = 1929919905;
        gu.cvvy[414] = 497454051;
        gu.cvvy[415] = 1969514236;
        gu.cvvy[416] = -1383872852;
        gu.cvvy[417] = 1790455268;
        gu.cvvy[418] = -1471240652;
        gu.cvvy[419] = -85149628;
        gu.cvvy[420] = -1867125250;
        gu.cvvy[421] = 1033566670;
        gu.cvvy[422] = 295941800;
        gu.cvvy[423] = -2111389643;
        gu.cvvy[424] = -1533908156;
        gu.cvvy[425] = -1841506266;
        gu.cvvy[426] = -447066787;
        gu.cvvy[427] = 1193146352;
        gu.cvvy[428] = -426706946;
        gu.cvvy[429] = 134174321;
        gu.cvvy[430] = 1436550949;
        gu.cvvy[431] = 1298798918;
        gu.cvvy[432] = -1958307705;
        gu.cvvy[433] = -286702760;
        gu.cvvy[434] = -1102406757;
        gu.cvvy[435] = -733080267;
        gu.cvvy[436] = -88135105;
        gu.cvvy[437] = 1601893074;
        gu.cvvy[438] = -2002700170;
        gu.cvvy[439] = 1156673202;
        gu.cvvy[440] = 1797595402;
        gu.cvvy[441] = 121643138;
        gu.cvvy[442] = -1022378463;
        gu.cvvy[443] = 42859944;
        gu.cvvy[444] = -517789698;
        gu.cvvy[445] = 1186141277;
        gu.cvvy[446] = -319245942;
        gu.cvvy[447] = -1719116224;
        gu.cvvy[448] = -1141728937;
        gu.cvvy[449] = 1764751;
        gu.cvvy[450] = -2066483398;
        gu.cvvy[451] = -1391882141;
        gu.cvvy[452] = 1791295918;
        gu.cvvy[453] = -1387710561;
        gu.cvvy[454] = 1393929125;
        gu.cvvy[455] = -2028696708;
        gu.cvvy[456] = 1499865706;
        gu.cvvy[457] = 763021954;
        gu.cvvy[458] = 500639606;
        gu.cvvy[459] = 164974794;
        gu.cvvy[460] = -8715212;
        gu.cvvy[461] = -1924255110;
        gu.cvvy[462] = 584894125;
        gu.cvvy[463] = 1160119207;
        gu.cvvy[464] = -847828047;
        gu.cvvy[465] = 1941412917;
        gu.cvvy[466] = 740113058;
        gu.cvvy[467] = -467135235;
        gu.cvvy[468] = -731178983;
        gu.cvvy[469] = 374305571;
        gu.cvvy[470] = 1261526400;
        gu.cvvy[471] = 225524342;
        gu.cvvy[472] = 2127844716;
        gu.cvvy[473] = -366739750;
        gu.cvvy[474] = -545056721;
        gu.cvvy[475] = 1255554476;
        gu.cvvy[476] = -1633942671;
        gu.cvvy[477] = 1493530185;
        gu.cvvy[478] = 1796847827;
        gu.cvvy[479] = -2107084518;
        gu.cvvy[480] = -1801059605;
        gu.cvvy[481] = 587479;
        gu.cvvy[482] = -409500390;
        gu.cvvy[483] = -1252756003;
        gu.cvvy[484] = 67715594;
        gu.cvvy[485] = -1507767861;
        gu.cvvy[486] = -1228038699;
        gu.cvvy[487] = 1908480446;
        gu.cvvy[488] = -1390683100;
        gu.cvvy[489] = -1229710355;
        gu.cvvy[490] = 1735526346;
        gu.cvvy[491] = 464490864;
        gu.cvvy[492] = -1745551196;
        gu.cvvy[493] = -1856468114;
        gu.cvvy[494] = 1659694535;
        gu.cvvy[495] = -1725000939;
        gu.cvvy[496] = 967955778;
        gu.cvvy[497] = -346673148;
        gu.cvvy[498] = 1257205754;
        gu.cvvy[499] = -1555688186;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void restoreCompassSlot() {
        block72: {
            block71: {
                while (true) {
                    if ((v0 /* !! */  = (cfr_temp_0 = gu.go - gu.cvwa("cxea", cvxo(int ), (int)232)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v0 /* !! */  == gu.cvwa("cxeb", cvvt(int ), (int)549)) break;
                    v0 /* !! */  = (long)gu.cvwa("cxec", cvvt(int ), (int)550);
                }
                var3_1 = gu.c;
                while (true) {
                    if ((v1 /* !! */  = (cfr_temp_1 = gu.go - gu.cvwa("cxed", cvxo(int ), (int)233)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v1 /* !! */  == gu.cvwa("cxee", cvvt(int ), (int)551)) break;
                    v1 /* !! */  = (long)gu.cvwa("cxef", cvvt(int ), (int)552);
                }
                var2_2 /* !! */  = gu.b;
                v2 /* !! */  = gu.go;
                if (true) ** GOTO lbl17
                block48: while (true) {
                    v2 /* !! */  = (long)(v3 - gu.cvwa("cxeg", cvxo(int ), (int)234));
lbl17:
                    // 2 sources

                    switch ((int)v2 /* !! */ ) {
                        case -1855170120: {
                            break block48;
                        }
                        case -1495947324: {
                            v3 = gu.cvwa("cxeh", cvxo(int ), (int)235);
                            continue block48;
                        }
                        case -618287254: {
                            v3 = gu.cvwa("cxei", cvxo(int ), (int)236);
                            continue block48;
                        }
                        case 1397485036: {
                            v3 = gu.cvwa("cxej", cvxo(int ), (int)237);
                            continue block48;
                        }
                    }
                    break;
                }
                var1_3 = gu.a;
                if (var3_1) {
                    throw null;
lbl32:
                    // 9 sources

                    return;
                }
                if (var1_3 || var1_3) ** GOTO lbl32
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = gu.go - gu.cvwa("cxek", cvxo(int ), (int)238)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == gu.cvwa("cxel", cvvt(int ), (int)553)) break;
                    v4 /* !! */  = (long)gu.cvwa("cxem", cvvt(int ), (int)554);
                }
                if (this.compassRestoreSlot == gu.cvwa("cxen", cvvt(int ), (int)555)) break block71;
                if (var1_3) ** GOTO lbl32
                v5 /* !! */  = gu.go;
                if (true) ** GOTO lbl46
                block51: while (true) {
                    v5 /* !! */  = (long)(v6 - gu.cvwa("cxeo", cvxo(int ), (int)239));
lbl46:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1855170120: {
                            break block51;
                        }
                        case -1572898310: {
                            v6 = gu.cvwa("cxep", cvxo(int ), (int)240);
                            continue block51;
                        }
                        case -756946720: {
                            v6 = gu.cvwa("cxeq", cvxo(int ), (int)241);
                            continue block51;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_3 = gu.go - gu.cvwa("cxer", cvxo(int ), (int)242)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == gu.cvwa("cxes", cvvt(int ), (int)556)) break;
                    v7 /* !! */  = (long)gu.cvwa("cxet", cvvt(int ), (int)557);
                }
                if (gu.mc.field_1724 != null) break block72;
                if (var1_3) ** GOTO lbl32
            }
            if (var1_3 || var1_3) ** GOTO lbl32
            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl32
        v8 /* !! */  = gu.go;
        if (true) ** GOTO lbl71
        block53: while (true) {
            v8 /* !! */  = (long)(v9 - gu.cvwa("cxeu", cvxo(int ), (int)243));
lbl71:
            // 2 sources

            switch ((int)v8 /* !! */ ) {
                case -1956253375: {
                    v9 = gu.cvwa("cxev", cvxo(int ), (int)244);
                    continue block53;
                }
                case -1855170120: {
                    break block53;
                }
                case -1336291106: {
                    v9 = gu.cvwa("cxew", cvxo(int ), (int)245);
                    continue block53;
                }
                case 1465804010: {
                    v9 = gu.cvwa("cxex", cvxo(int ), (int)246);
                    continue block53;
                }
            }
            break;
        }
        v10 /* !! */  = gu.go;
        if (true) ** GOTO lbl87
        block54: while (true) {
            v10 /* !! */  = (long)(v11 - gu.cvwa("cxey", cvxo(int ), (int)247));
lbl87:
            // 2 sources

            switch ((int)v10 /* !! */ ) {
                case -2146348524: {
                    v11 = gu.cvwa("cxez", cvxo(int ), (int)248);
                    continue block54;
                }
                case -1855170120: {
                    break block54;
                }
                case -1070168521: {
                    v11 = gu.cvwa("cxfa", cvxo(int ), (int)249);
                    continue block54;
                }
                case 649240041: {
                    v11 = gu.cvwa("cxfb", cvxo(int ), (int)250);
                    continue block54;
                }
            }
            break;
        }
        nv.selectSlot(this.compassRestoreSlot);
        if (var1_3 || var1_3) ** GOTO lbl32
        v12 /* !! */  = gu.go;
        if (true) ** GOTO lbl105
        block55: while (true) {
            v12 /* !! */  = (long)(gu.cvwa("cxfd", cvxo(int ), (int)252) - gu.cvwa("cxfc", cvxo(int ), (int)251));
lbl105:
            // 2 sources

            switch ((int)v12 /* !! */ ) {
                case -1855170120: {
                    break block55;
                }
                case 1438009190: {
                    continue block55;
                }
            }
            break;
        }
        while (true) {
            if ((v13 /* !! */  = (cfr_temp_4 = gu.go - gu.cvwa("cxfe", cvxo(int ), (int)253)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v13 /* !! */  == gu.cvwa("cxff", cvvt(int ), (int)558)) break;
            v13 /* !! */  = (long)gu.cvwa("cxfg", cvvt(int ), (int)559);
        }
        nv.selectSlotSilent(this.compassRestoreSlot);
        if (var1_3) ** GOTO lbl32
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl32
                v14 = gu.cvwa("cxfh", cvvt(int ), (int)560);
                while (true) {
                    if ((v15 /* !! */  = (cfr_temp_5 = gu.go - gu.cvwa("cxfi", cvxo(int ), (int)254)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v15 /* !! */  == gu.cvwa("cxfj", cvvt(int ), (int)561)) break;
                    v15 /* !! */  = (long)gu.cvwa("cxfk", cvvt(int ), (int)562);
                }
                this.compassRestoreSlot = (int)v14;
                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
            case 0: {
                var2_2 /* !! */  = (int)gu.cvwa("cxfl", cvvt(int ), (int)563);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl169
            }
            case 1: {
                var2_2 /* !! */  = (int)gu.cvwa("cxfm", cvvt(int ), (int)564);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl169
            }
lbl141:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)gu.cvwa("cxfn", cvvt(int ), (int)565);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl178
            }
lbl146:
            // 3 sources

            case 3: {
                var2_2 /* !! */  = (int)gu.cvwa("cxfo", cvvt(int ), (int)566);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl178
            }
            case 4: {
                var2_2 /* !! */  = (int)gu.cvwa("cxfp", cvvt(int ), (int)567);
                if (!var3_1) break;
                throw null;
            }
lbl155:
            // 4 sources

            case 5: {
                var2_2 /* !! */  = (int)gu.cvwa("cxfq", cvvt(int ), (int)568);
                if (!var3_1) ** GOTO lbl141
                throw null;
            }
            case 6: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)gu.cvwa("cxfr", cvvt(int ), (int)569);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl187
                    break;
                }
            }
lbl165:
            // 3 sources

            case 7: {
                var2_2 /* !! */  = (int)gu.cvwa("cxfs", cvvt(int ), (int)570);
                if (!var3_1) ** GOTO lbl146
                throw null;
            }
lbl169:
            // 3 sources

            case 8: {
                var2_2 /* !! */  = (int)gu.cvwa("cxft", cvvt(int ), (int)571);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl191
            }
            case 9: {
                var2_2 /* !! */  = (int)gu.cvwa("cxfu", cvvt(int ), (int)572);
                if (!var3_1) ** GOTO lbl165
                throw null;
            }
lbl178:
            // 3 sources

            case 10: {
                var2_2 /* !! */  = (int)gu.cvwa("cxfv", cvvt(int ), (int)573);
                if (!var3_1) ** GOTO lbl155
                throw null;
            }
            case 11: {
                var2_2 /* !! */  = (int)gu.cvwa("cxfw", cvvt(int ), (int)574);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl199
            }
lbl187:
            // 2 sources

            case 12: {
                var2_2 /* !! */  = (int)gu.cvwa("cxfx", cvvt(int ), (int)575);
                if (!var3_1) ** GOTO lbl155
                throw null;
            }
lbl191:
            // 2 sources

            case 13: {
                var2_2 /* !! */  = (int)gu.cvwa("cxfy", cvvt(int ), (int)576);
                if (!var3_1) ** GOTO lbl165
                throw null;
            }
            case 14: {
                var2_2 /* !! */  = (int)gu.cvwa("cxfz", cvvt(int ), (int)577);
                if (!var3_1) ** GOTO lbl155
                throw null;
            }
lbl199:
            // 2 sources

            case 15: {
                var2_2 /* !! */  = (int)gu.cvwa("cxga", cvvt(int ), (int)578);
                if (!var3_1) ** GOTO lbl146
                throw null;
            }
            case 16: 
        }
        var2_2 /* !! */  = (int)gu.cvwa("cxgb", cvvt(int ), (int)579);
        ** while (!var3_1)
lbl206:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void activate() {
        block79: {
            block78: {
                block77: {
                    v0 /* !! */  = gu.go;
                    if (true) ** GOTO lbl5
                    block50: while (true) {
                        v0 /* !! */  = (long)(v1 - gu.cvwa("cvxs", cvxo(int ), (int)0));
lbl5:
                        // 2 sources

                        switch ((int)v0 /* !! */ ) {
                            case -2064932314: {
                                v1 = gu.cvwa("cvxu", cvxo(int ), (int)1);
                                continue block50;
                            }
                            case -2010556788: {
                                v1 = gu.cvwa("cvxx", cvxo(int ), (int)2);
                                continue block50;
                            }
                            case -1855170120: {
                                break block50;
                            }
                        }
                        break;
                    }
                    var3_1 = gu.c;
                    while (true) {
                        if ((v2 /* !! */  = (cfr_temp_0 = gu.go - gu.cvwa("cvya", cvxo(int ), (int)3)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                        if (v2 /* !! */  == gu.cvwa("cvyb", cvvt(int ), (int)22)) break;
                        v2 /* !! */  = (long)gu.cvwa("cvyc", cvvt(int ), (int)23);
                    }
                    var2_2 /* !! */  = gu.b;
                    v3 /* !! */  = gu.go;
                    if (true) ** GOTO lbl25
                    block52: while (true) {
                        v3 /* !! */  = (long)(v4 - gu.cvwa("cvyd", cvxo(int ), (int)4));
lbl25:
                        // 2 sources

                        switch ((int)v3 /* !! */ ) {
                            case -1855170120: {
                                break block52;
                            }
                            case 276823625: {
                                v4 = gu.cvwa("cvye", cvxo(int ), (int)5);
                                continue block52;
                            }
                            case 540613884: {
                                v4 = gu.cvwa("cvyg", cvxo(int ), (int)6);
                                continue block52;
                            }
                        }
                        break;
                    }
                    var1_3 = gu.a;
                    if (var3_1) {
                        throw null;
lbl37:
                        // 6 sources

                        return;
                    }
                    if (var1_3 || var1_3) ** GOTO lbl37
                    while (true) {
                        if ((v5 /* !! */  = (cfr_temp_1 = gu.go - gu.cvwa("cvyj", cvxo(int ), (int)7)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                        if (v5 /* !! */  == gu.cvwa("cvyl", cvvt(int ), (int)24)) break;
                        v5 /* !! */  = (long)gu.cvwa("cvym", cvvt(int ), (int)25);
                    }
                    if (this.requestedGrief != gu.cvwa("cvyq", cvvt(int ), (int)26)) break block77;
                    if (var1_3 || var1_3) ** GOTO lbl37
                    v6 /* !! */  = gu.go;
                    if (true) ** GOTO lbl51
                    block55: while (true) {
                        v6 /* !! */  = (long)(v7 - gu.cvwa("cvyr", cvxo(int ), (int)8));
lbl51:
                        // 2 sources

                        switch ((int)v6 /* !! */ ) {
                            case -1889121589: {
                                v7 = gu.cvwa("cvys", cvxo(int ), (int)9);
                                continue block55;
                            }
                            case -1855170120: {
                                break block55;
                            }
                            case 16392315: {
                                v7 = gu.cvwa("cvyt", cvxo(int ), (int)10);
                                continue block55;
                            }
                            case 338684645: {
                                v7 = gu.cvwa("cvyu", cvxo(int ), (int)11);
                                continue block55;
                            }
                        }
                        break;
                    }
                    while (true) {
                        if ((v8 /* !! */  = (cfr_temp_2 = gu.go - gu.cvwa("cvyv", cvxo(int ), (int)12)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                        if (v8 /* !! */  == gu.cvwa("cvyx", cvvt(int ), (int)27)) break;
                        v8 /* !! */  = (long)gu.cvwa("cvzd", cvvt(int ), (int)28);
                    }
                    v9 = this.keepEnabled.isValue();
                    v10 /* !! */  = gu.go;
                    if (true) ** GOTO lbl73
                    block57: while (true) {
                        v10 /* !! */  = (long)(v11 - gu.cvwa("cvzf", cvxo(int ), (int)13));
lbl73:
                        // 2 sources

                        switch ((int)v10 /* !! */ ) {
                            case -1918355153: {
                                v11 = gu.cvwa("cvzg", cvxo(int ), (int)14);
                                continue block57;
                            }
                            case -1855170120: {
                                break block57;
                            }
                            case -556546632: {
                                v11 = gu.cvwa("cvzh", cvxo(int ), (int)15);
                                continue block57;
                            }
                        }
                        break;
                    }
                    this.keepEnabledAfterJoin = v9;
                    if (var1_3) ** GOTO lbl37
                }
                if (var1_3 || var1_3) ** GOTO lbl37
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_3 = gu.go - gu.cvwa("cvzi", cvxo(int ), (int)16)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == gu.cvwa("cvzj", cvvt(int ), (int)29)) break;
                    v12 /* !! */  = (long)gu.cvwa("cvzk", cvvt(int ), (int)30);
                }
                if (this.requestedGrief == gu.cvwa("cvzl", cvvt(int ), (int)31)) break block78;
                v13 /* !! */  = gu.go;
                if (true) ** GOTO lbl96
                block59: while (true) {
                    v13 /* !! */  = (long)(v14 - gu.cvwa("cvzo", cvxo(int ), (int)17));
lbl96:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case -1855170120: {
                            break block59;
                        }
                        case -1148124652: {
                            v14 = gu.cvwa("cvzq", cvxo(int ), (int)18);
                            continue block59;
                        }
                        case -241285017: {
                            v14 = gu.cvwa("cvzs", cvxo(int ), (int)19);
                            continue block59;
                        }
                    }
                    break;
                }
                v15 = this.requestedGrief;
                if (var3_1) {
                    throw null;
                }
                break block79;
            }
            v16 /* !! */  = gu.go;
            if (true) ** GOTO lbl114
            block60: while (true) {
                v16 /* !! */  = (long)(gu.cvwa("cvzu", cvxo(int ), (int)21) - gu.cvwa("cvzt", cvxo(int ), (int)20));
lbl114:
                // 2 sources

                switch ((int)v16 /* !! */ ) {
                    case -1855170120: {
                        break block60;
                    }
                    case 893135427: {
                        continue block60;
                    }
                }
                break;
            }
            while (true) {
                if ((v17 /* !! */  = (cfr_temp_4 = gu.go - gu.cvwa("cvzv", cvxo(int ), (int)22)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                if (v17 /* !! */  == gu.cvwa("cvzz", cvvt(int ), (int)32)) {
                    v15 = this.grief.getInt();
                    break;
                }
                v17 /* !! */  = (long)gu.cvwa("cwab", cvvt(int ), (int)33);
            }
        }
        while (true) {
            if ((v18 /* !! */  = (cfr_temp_5 = gu.go - gu.cvwa("cwad", cvxo(int ), (int)23)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v18 /* !! */  == gu.cvwa("cwae", cvvt(int ), (int)34)) break;
            v18 /* !! */  = (long)gu.cvwa("cwag", cvvt(int ), (int)35);
        }
        this.beginJoining(v15);
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** GOTO lbl37
                v19 = gu.cvwa("cwah", cvvt(int ), (int)36);
                v20 /* !! */  = gu.go;
                if (true) ** GOTO lbl142
                block63: while (true) {
                    v20 /* !! */  = (long)(v21 - gu.cvwa("cwai", cvxo(int ), (int)24));
lbl142:
                    // 2 sources

                    switch ((int)v20 /* !! */ ) {
                        case -1855170120: {
                            break block63;
                        }
                        case -138352356: {
                            v21 = gu.cvwa("cwal", cvxo(int ), (int)25);
                            continue block63;
                        }
                        case 1768510098: {
                            v21 = gu.cvwa("cwan", cvxo(int ), (int)26);
                            continue block63;
                        }
                    }
                    break;
                }
                this.requestedGrief = (int)v19;
                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
lbl155:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)gu.cvwa("cwaq", cvvt(int ), (int)37);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl169
            }
lbl160:
            // 3 sources

            case 1: {
                var2_2 /* !! */  = (int)gu.cvwa("cwat", cvvt(int ), (int)38);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl201
            }
lbl165:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)gu.cvwa("cwau", cvvt(int ), (int)39);
                if (!var3_1) break;
                throw null;
            }
lbl169:
            // 2 sources

            case 3: {
                var2_2 /* !! */  = (int)gu.cvwa("cwav", cvvt(int ), (int)40);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl178
            }
            case 4: {
                var2_2 /* !! */  = (int)gu.cvwa("cwax", cvvt(int ), (int)41);
                if (!var3_1) ** GOTO lbl160
                throw null;
            }
lbl178:
            // 3 sources

            case 5: {
                var2_2 /* !! */  = (int)gu.cvwa("cwaz", cvvt(int ), (int)42);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl196
            }
            case 6: {
                var2_2 /* !! */  = (int)gu.cvwa("cwbb", cvvt(int ), (int)43);
                if (!var3_1) ** GOTO lbl165
                throw null;
            }
            case 7: {
                do {
                    var2_2 /* !! */  = (int)gu.cvwa("cwbe", cvvt(int ), (int)44);
                } while (!var3_1);
                throw null;
            }
            case 8: {
                var2_2 /* !! */  = (int)gu.cvwa("cwbf", cvvt(int ), (int)45);
                if (!var3_1) ** GOTO lbl155
                throw null;
            }
lbl196:
            // 2 sources

            case 9: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)gu.cvwa("cwbg", cvvt(int ), (int)46);
                    if (!var3_1) ** GOTO lbl178
                    throw null;
                }
            }
lbl201:
            // 2 sources

            case 10: {
                var2_2 /* !! */  = (int)gu.cvwa("cwbi", cvvt(int ), (int)47);
                if (!var3_1) break;
                throw null;
            }
            case 11: {
                var2_2 /* !! */  = (int)gu.cvwa("cwbl", cvvt(int ), (int)48);
                if (!var3_1) ** GOTO lbl160
                throw null;
            }
            case 12: 
        }
        var2_2 /* !! */  = (int)gu.cvwa("cwbo", cvvt(int ), (int)49);
        ** while (!var3_1)
lbl212:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void cxsg() {
        gu.cvvy[0] = -1689146918;
        gu.cvvy[1] = -1923823236;
        gu.cvvy[2] = -4739785;
        gu.cvvy[3] = -1820218748;
        gu.cvvy[4] = -127155089;
        gu.cvvy[5] = -463017556;
        gu.cvvy[6] = 1687345744;
        gu.cvvy[7] = -780455444;
        gu.cvvy[8] = -1910964547;
        gu.cvvy[9] = -1283305030;
        gu.cvvy[10] = -164973930;
        gu.cvvy[11] = 330301484;
        gu.cvvy[12] = -675784278;
        gu.cvvy[13] = -528868140;
        gu.cvvy[14] = -595647644;
        gu.cvvy[15] = 1636794239;
        gu.cvvy[16] = -816620472;
        gu.cvvy[17] = 667718968;
        gu.cvvy[18] = 758562182;
        gu.cvvy[19] = -1850865082;
        gu.cvvy[20] = 468108582;
        gu.cvvy[21] = 1918381304;
        gu.cvvy[22] = 556716611;
        gu.cvvy[23] = -188361302;
        gu.cvvy[24] = 294614717;
        gu.cvvy[25] = 1828735871;
        gu.cvvy[26] = -900593260;
        gu.cvvy[27] = 2122424091;
        gu.cvvy[28] = 172961656;
        gu.cvvy[29] = 1098625880;
        gu.cvvy[30] = -563479269;
        gu.cvvy[31] = 1656187316;
        gu.cvvy[32] = 613807261;
        gu.cvvy[33] = -1604411268;
        gu.cvvy[34] = 124652538;
        gu.cvvy[35] = -1033946370;
        gu.cvvy[36] = 1036153834;
        gu.cvvy[37] = -1551878440;
        gu.cvvy[38] = -1594469216;
        gu.cvvy[39] = -392299142;
        gu.cvvy[40] = 2018481216;
        gu.cvvy[41] = 988876116;
        gu.cvvy[42] = -333801723;
        gu.cvvy[43] = -1205684302;
        gu.cvvy[44] = 1234729918;
        gu.cvvy[45] = 2043657725;
        gu.cvvy[46] = -1489259113;
        gu.cvvy[47] = -1474002027;
        gu.cvvy[48] = 342189330;
        gu.cvvy[49] = 932967913;
        gu.cvvy[50] = -1590379102;
        gu.cvvy[51] = 425767600;
        gu.cvvy[52] = 67049450;
        gu.cvvy[53] = 1064083538;
        gu.cvvy[54] = -1772347985;
        gu.cvvy[55] = 1486352728;
        gu.cvvy[56] = 660124484;
        gu.cvvy[57] = -939790083;
        gu.cvvy[58] = -1199905740;
        gu.cvvy[59] = -37906059;
        gu.cvvy[60] = -1896145811;
        gu.cvvy[61] = -1460306393;
        gu.cvvy[62] = 1179150067;
        gu.cvvy[63] = 187167695;
        gu.cvvy[64] = 1409228257;
        gu.cvvy[65] = -2076812861;
        gu.cvvy[66] = -1147821342;
        gu.cvvy[67] = 1434666680;
        gu.cvvy[68] = -394669610;
        gu.cvvy[69] = 938330201;
        gu.cvvy[70] = -90311613;
        gu.cvvy[71] = 1034873945;
        gu.cvvy[72] = -1225699333;
        gu.cvvy[73] = -421219101;
        gu.cvvy[74] = -2044176203;
        gu.cvvy[75] = 1382126293;
        gu.cvvy[76] = 871920131;
        gu.cvvy[77] = 1541433794;
        gu.cvvy[78] = -1442888661;
        gu.cvvy[79] = 550501719;
        gu.cvvy[80] = -1620000635;
        gu.cvvy[81] = 1164796106;
        gu.cvvy[82] = -1417592102;
        gu.cvvy[83] = 910973741;
        gu.cvvy[84] = 63680962;
        gu.cvvy[85] = -710747753;
        gu.cvvy[86] = -1612274608;
        gu.cvvy[87] = -1792900697;
        gu.cvvy[88] = 190618989;
        gu.cvvy[89] = -1971431993;
        gu.cvvy[90] = 2142866265;
        gu.cvvy[91] = 656540177;
        gu.cvvy[92] = 1004229359;
        gu.cvvy[93] = -96668006;
        gu.cvvy[94] = -451441300;
        gu.cvvy[95] = 378765936;
        gu.cvvy[96] = -1163120441;
        gu.cvvy[97] = -789808494;
        gu.cvvy[98] = 267644376;
        gu.cvvy[99] = -879973726;
    }

    private static /* synthetic */ void cxst() {
        gu.cvxr[100] = -6569025757411335516L;
        gu.cvxr[101] = 2310229925425871091L;
        gu.cvxr[102] = -6742439279935734686L;
        gu.cvxr[103] = -7653860114290617623L;
        gu.cvxr[104] = 8225678399991349171L;
        gu.cvxr[105] = 2701126013340024868L;
        gu.cvxr[106] = 3539098580607126096L;
        gu.cvxr[107] = 8223310519386335660L;
        gu.cvxr[108] = -2632180672682505331L;
        gu.cvxr[109] = 4379500970425172254L;
        gu.cvxr[110] = -7163373847272683978L;
        gu.cvxr[111] = -5301001091235030930L;
        gu.cvxr[112] = -1593448119710355622L;
        gu.cvxr[113] = 3894616259730983911L;
        gu.cvxr[114] = 3697086163880260589L;
        gu.cvxr[115] = -705162036672827166L;
        gu.cvxr[116] = -6548205039773522085L;
        gu.cvxr[117] = -324049427847823460L;
        gu.cvxr[118] = 3921855314696415340L;
        gu.cvxr[119] = -6778678239593177938L;
        gu.cvxr[120] = 7877169048797419608L;
        gu.cvxr[121] = -2746972532712993890L;
        gu.cvxr[122] = 4340296440539842882L;
        gu.cvxr[123] = -6811394987433063984L;
        gu.cvxr[124] = 7574649975663135627L;
        gu.cvxr[125] = -7568257458006302347L;
        gu.cvxr[126] = -7887478335882642273L;
        gu.cvxr[127] = -5661697160128273802L;
        gu.cvxr[128] = -5705306422239656638L;
        gu.cvxr[129] = -5095536947039727276L;
        gu.cvxr[130] = 3201553866553118496L;
        gu.cvxr[131] = -7366567922640568482L;
        gu.cvxr[132] = -3591774194401727172L;
        gu.cvxr[133] = -6017927019106319290L;
        gu.cvxr[134] = 1179814651400180708L;
        gu.cvxr[135] = -5280323551579335011L;
        gu.cvxr[136] = 1160519404731815093L;
        gu.cvxr[137] = 4185505922087526705L;
        gu.cvxr[138] = 1683452635432488369L;
        gu.cvxr[139] = 4955816914811900381L;
        gu.cvxr[140] = -829741196701235622L;
        gu.cvxr[141] = 3562836064026800611L;
        gu.cvxr[142] = -5672557861870635841L;
        gu.cvxr[143] = 1417767446697045622L;
        gu.cvxr[144] = -7208437498324234645L;
        gu.cvxr[145] = -7567830969597114959L;
        gu.cvxr[146] = 5751559695722472508L;
        gu.cvxr[147] = -3938991955385134401L;
        gu.cvxr[148] = -6191156733699050455L;
        gu.cvxr[149] = -1959427251764713602L;
        gu.cvxr[150] = -4967865743316096232L;
        gu.cvxr[151] = 4202791463162716497L;
        gu.cvxr[152] = 6827242245590072476L;
        gu.cvxr[153] = -989198084402004942L;
        gu.cvxr[154] = -117600949621534123L;
        gu.cvxr[155] = 7077998139223793352L;
        gu.cvxr[156] = -8305534386779646134L;
        gu.cvxr[157] = 9150769842023234670L;
        gu.cvxr[158] = -3145703824407090053L;
        gu.cvxr[159] = 468200010161584376L;
        gu.cvxr[160] = -9082432418686241083L;
        gu.cvxr[161] = 4016074141637602944L;
        gu.cvxr[162] = -2594717427001829381L;
        gu.cvxr[163] = -2838741332879556371L;
        gu.cvxr[164] = -6511121249482306546L;
        gu.cvxr[165] = -5838699169219960591L;
        gu.cvxr[166] = 7177444873529521901L;
        gu.cvxr[167] = 7918715735973468243L;
        gu.cvxr[168] = -6444165747422302114L;
        gu.cvxr[169] = -790641691491241302L;
        gu.cvxr[170] = 4189088636863350148L;
        gu.cvxr[171] = 1895047711596474144L;
        gu.cvxr[172] = 4269360863581229828L;
        gu.cvxr[173] = 702301578672111441L;
        gu.cvxr[174] = -5824124339229714366L;
        gu.cvxr[175] = 4101523407986920122L;
        gu.cvxr[176] = 4196105845574377807L;
        gu.cvxr[177] = -7680594318330135332L;
        gu.cvxr[178] = 3264351957713817855L;
        gu.cvxr[179] = 3979352160451814541L;
        gu.cvxr[180] = 7746867512346935764L;
        gu.cvxr[181] = 7641025023173725783L;
        gu.cvxr[182] = 2975939716693506371L;
        gu.cvxr[183] = 5690243388584820630L;
        gu.cvxr[184] = -2376620290235870733L;
        gu.cvxr[185] = 5925840005825053435L;
        gu.cvxr[186] = -3652586956712650421L;
        gu.cvxr[187] = 5953344704920759811L;
        gu.cvxr[188] = -3180625796049822057L;
        gu.cvxr[189] = -183841810430921887L;
        gu.cvxr[190] = -4630347266301878747L;
        gu.cvxr[191] = -8522730447233766205L;
        gu.cvxr[192] = -791040486172322763L;
        gu.cvxr[193] = -8121677496952843136L;
        gu.cvxr[194] = 6757861954868096315L;
        gu.cvxr[195] = 5628385211530540194L;
        gu.cvxr[196] = -3085877683987101976L;
        gu.cvxr[197] = 6993364760434455515L;
        gu.cvxr[198] = 87629418464736623L;
        gu.cvxr[199] = 2232506884908002274L;
    }

    private static /* synthetic */ void cxsu() {
        gu.cvxr[200] = 8196475795908425791L;
        gu.cvxr[201] = -8987294249350268228L;
        gu.cvxr[202] = 940890382243452745L;
        gu.cvxr[203] = -8982723133927590122L;
        gu.cvxr[204] = -5431369997578501973L;
        gu.cvxr[205] = -8458360392831782520L;
        gu.cvxr[206] = -4616571918433592122L;
        gu.cvxr[207] = -6819239196683923939L;
        gu.cvxr[208] = 5815080127871955208L;
        gu.cvxr[209] = -7467512029049186445L;
        gu.cvxr[210] = -2444606819258268402L;
        gu.cvxr[211] = 746344790942104921L;
        gu.cvxr[212] = 3150555736028256432L;
        gu.cvxr[213] = -7696318788102786070L;
        gu.cvxr[214] = -4260327814731329299L;
        gu.cvxr[215] = 3055370949831387146L;
        gu.cvxr[216] = -2476634759764375693L;
        gu.cvxr[217] = 483184440838523554L;
        gu.cvxr[218] = 6719169449198582107L;
        gu.cvxr[219] = -1641443246092615612L;
        gu.cvxr[220] = -4733217076865477199L;
        gu.cvxr[221] = 2847382066836735005L;
        gu.cvxr[222] = 4624242593330531494L;
        gu.cvxr[223] = -2713364388394238148L;
        gu.cvxr[224] = 8148709761087357550L;
        gu.cvxr[225] = -3681492248335754514L;
        gu.cvxr[226] = -26414478161403065L;
        gu.cvxr[227] = 3938491329597480544L;
        gu.cvxr[228] = -6635313210188794950L;
        gu.cvxr[229] = 6973026123456864544L;
        gu.cvxr[230] = 2733368612345765958L;
        gu.cvxr[231] = -5340139834515892633L;
        gu.cvxr[232] = -5199203214962145024L;
        gu.cvxr[233] = -5868857173434260989L;
        gu.cvxr[234] = 7645487063476213096L;
        gu.cvxr[235] = -2802551394195216853L;
        gu.cvxr[236] = 790328947672161218L;
        gu.cvxr[237] = -7958451975927953496L;
        gu.cvxr[238] = -6257571213966236107L;
        gu.cvxr[239] = -8702414462961936251L;
        gu.cvxr[240] = -4752520757287612187L;
        gu.cvxr[241] = 4075889839744892448L;
        gu.cvxr[242] = -7005665402235875477L;
        gu.cvxr[243] = -5697096941501889231L;
        gu.cvxr[244] = -7195954290123029582L;
        gu.cvxr[245] = -1958903470146508960L;
        gu.cvxr[246] = -8943042182648245953L;
        gu.cvxr[247] = 1944635481839191358L;
        gu.cvxr[248] = 3686777809289039508L;
        gu.cvxr[249] = 5882564506772334003L;
        gu.cvxr[250] = 3170876691538694502L;
        gu.cvxr[251] = -7251821832751515383L;
        gu.cvxr[252] = -4458969966966778874L;
        gu.cvxr[253] = 5749515881597756147L;
        gu.cvxr[254] = 2021941204842684416L;
        gu.cvxr[255] = -6567844763227656365L;
        gu.cvxr[256] = 1978019863470624001L;
        gu.cvxr[257] = -8513619972771471596L;
        gu.cvxr[258] = -2543680109270677315L;
        gu.cvxr[259] = -1631657773828060529L;
        gu.cvxr[260] = -6339564304833406464L;
        gu.cvxr[261] = -4826029059143278143L;
        gu.cvxr[262] = -1311716917478322070L;
        gu.cvxr[263] = -5950560159650863012L;
        gu.cvxr[264] = -7206549190971828411L;
        gu.cvxr[265] = 6682869770783415386L;
        gu.cvxr[266] = 4536295038141637084L;
        gu.cvxr[267] = -4712882999743539435L;
        gu.cvxr[268] = -460217712599571885L;
        gu.cvxr[269] = 2244629645790002355L;
        gu.cvxr[270] = -8794413482200288910L;
        gu.cvxr[271] = -1049198106340442849L;
        gu.cvxr[272] = 8357254062107925609L;
        gu.cvxr[273] = 1443580725533239643L;
        gu.cvxr[274] = -5472289475349881396L;
        gu.cvxr[275] = -8627221396632374356L;
        gu.cvxr[276] = 7654874720356287653L;
        gu.cvxr[277] = 3891088885296789228L;
        gu.cvxr[278] = 8708937049311280647L;
        gu.cvxr[279] = 4535359726001027162L;
        gu.cvxr[280] = -2125563348197358805L;
        gu.cvxr[281] = 5262905203864354631L;
        gu.cvxr[282] = 5408643021361451115L;
        gu.cvxr[283] = 159667205248729051L;
        gu.cvxr[284] = -4731174411843823285L;
        gu.cvxr[285] = -8233334924835761570L;
        gu.cvxr[286] = -2932997956543096276L;
        gu.cvxr[287] = 6427649798170764035L;
        gu.cvxr[288] = -1056891932444143319L;
        gu.cvxr[289] = -3883971670231810670L;
        gu.cvxr[290] = 4160096886281951569L;
        gu.cvxr[291] = 3977163621614426505L;
        gu.cvxr[292] = -5175589121804166903L;
        gu.cvxr[293] = -3756419810524277043L;
        gu.cvxr[294] = 2943341909378298686L;
        gu.cvxr[295] = -3513021884500849476L;
        gu.cvxr[296] = -5753528550725253250L;
        gu.cvxr[297] = -5571818173828758999L;
        gu.cvxr[298] = 3335011558754297104L;
        gu.cvxr[299] = 6978284771899814239L;
    }

    public static /* synthetic */ CallSite cvwa(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ float cvwf(int n2) {
        return Float.intBitsToFloat(cvvv[n2] ^ cvvy[n2]);
    }

    private static /* synthetic */ void cxsc() {
        gu.cvvv[400] = 827612951;
        gu.cvvv[401] = 812776725;
        gu.cvvv[402] = -2070313034;
        gu.cvvv[403] = -602409564;
        gu.cvvv[404] = -1810244866;
        gu.cvvv[405] = 1350973388;
        gu.cvvv[406] = -1205933872;
        gu.cvvv[407] = -358126953;
        gu.cvvv[408] = 663789846;
        gu.cvvv[409] = -1447207469;
        gu.cvvv[410] = -2080923749;
        gu.cvvv[411] = -962807818;
        gu.cvvv[412] = -1952657563;
        gu.cvvv[413] = 1929919884;
        gu.cvvv[414] = -497454052;
        gu.cvvv[415] = 1969514237;
        gu.cvvv[416] = -1383872852;
        gu.cvvv[417] = 1790455273;
        gu.cvvv[418] = -1471240669;
        gu.cvvv[419] = -85149614;
        gu.cvvv[420] = -1867125263;
        gu.cvvv[421] = 1033566678;
        gu.cvvv[422] = 295941808;
        gu.cvvv[423] = -2111389642;
        gu.cvvv[424] = -1533908129;
        gu.cvvv[425] = -1841506260;
        gu.cvvv[426] = -447066810;
        gu.cvvv[427] = 1193146337;
        gu.cvvv[428] = -426706945;
        gu.cvvv[429] = 134174293;
        gu.cvvv[430] = 1436550917;
        gu.cvvv[431] = 1298798928;
        gu.cvvv[432] = -1958307681;
        gu.cvvv[433] = -286702759;
        gu.cvvv[434] = -1102406754;
        gu.cvvv[435] = -733080257;
        gu.cvvv[436] = -88135135;
        gu.cvvv[437] = 1601893058;
        gu.cvvv[438] = -2002700185;
        gu.cvvv[439] = 1156673209;
        gu.cvvv[440] = 1797595416;
        gu.cvvv[441] = 121643157;
        gu.cvvv[442] = -1022378443;
        gu.cvvv[443] = 42859961;
        gu.cvvv[444] = -517789706;
        gu.cvvv[445] = 1186141267;
        gu.cvvv[446] = -319245944;
        gu.cvvv[447] = -1719116200;
        gu.cvvv[448] = -1141728946;
        gu.cvvv[449] = 1764760;
        gu.cvvv[450] = -2066483404;
        gu.cvvv[451] = -1391882125;
        gu.cvvv[452] = 1791295909;
        gu.cvvv[453] = -1387710566;
        gu.cvvv[454] = 1393929124;
        gu.cvvv[455] = -2028696708;
        gu.cvvv[456] = 1499865707;
        gu.cvvv[457] = 763021955;
        gu.cvvv[458] = 500639604;
        gu.cvvv[459] = 164974795;
        gu.cvvv[460] = -8715211;
        gu.cvvv[461] = -1924255110;
        gu.cvvv[462] = 584894125;
        gu.cvvv[463] = 1160119175;
        gu.cvvv[464] = -847828054;
        gu.cvvv[465] = 1941412914;
        gu.cvvv[466] = 740113086;
        gu.cvvv[467] = -467135239;
        gu.cvvv[468] = -731178978;
        gu.cvvv[469] = 374305599;
        gu.cvvv[470] = 1261526402;
        gu.cvvv[471] = 225524307;
        gu.cvvv[472] = 2127844717;
        gu.cvvv[473] = -366739770;
        gu.cvvv[474] = -545056721;
        gu.cvvv[475] = 1255554484;
        gu.cvvv[476] = -1633942679;
        gu.cvvv[477] = 1493530187;
        gu.cvvv[478] = 1796847818;
        gu.cvvv[479] = -2107084537;
        gu.cvvv[480] = -1801059594;
        gu.cvvv[481] = 587462;
        gu.cvvv[482] = -409500387;
        gu.cvvv[483] = -1252756003;
        gu.cvvv[484] = 67715627;
        gu.cvvv[485] = -1507767853;
        gu.cvvv[486] = -1228038704;
        gu.cvvv[487] = 1908480413;
        gu.cvvv[488] = -1390683084;
        gu.cvvv[489] = -1229710350;
        gu.cvvv[490] = 1735526356;
        gu.cvvv[491] = 464490853;
        gu.cvvv[492] = -1745551169;
        gu.cvvv[493] = -1856468110;
        gu.cvvv[494] = 1659694532;
        gu.cvvv[495] = -1725000942;
        gu.cvvv[496] = 967955782;
        gu.cvvv[497] = -346673131;
        gu.cvvv[498] = 1257205737;
        gu.cvvv[499] = -1555688177;
    }

    private static /* synthetic */ void cxse() {
        gu.cvvv[600] = -1093599912;
        gu.cvvv[601] = -1244799390;
        gu.cvvv[602] = -1558810202;
        gu.cvvv[603] = -228317054;
        gu.cvvv[604] = 1967857629;
        gu.cvvv[605] = -324561648;
        gu.cvvv[606] = -1777369423;
        gu.cvvv[607] = -1886383307;
        gu.cvvv[608] = -708126985;
        gu.cvvv[609] = 1558916643;
        gu.cvvv[610] = -128885612;
        gu.cvvv[611] = 1221288384;
        gu.cvvv[612] = 1565100074;
        gu.cvvv[613] = 1570577075;
        gu.cvvv[614] = -1121887287;
        gu.cvvv[615] = 1480833391;
        gu.cvvv[616] = 338521145;
        gu.cvvv[617] = 569815538;
        gu.cvvv[618] = -245264575;
        gu.cvvv[619] = -932257274;
        gu.cvvv[620] = -579348041;
        gu.cvvv[621] = -8781915;
        gu.cvvv[622] = 926568995;
        gu.cvvv[623] = -1234532123;
        gu.cvvv[624] = 2124628824;
        gu.cvvv[625] = 2089389589;
        gu.cvvv[626] = 1114069257;
        gu.cvvv[627] = -581338661;
        gu.cvvv[628] = -1579312748;
        gu.cvvv[629] = -341423645;
        gu.cvvv[630] = 834310683;
        gu.cvvv[631] = 1161757874;
        gu.cvvv[632] = 791927005;
        gu.cvvv[633] = 1012089152;
        gu.cvvv[634] = -826977663;
        gu.cvvv[635] = 928212247;
        gu.cvvv[636] = -1332949821;
        gu.cvvv[637] = 1382508606;
        gu.cvvv[638] = 1596944898;
        gu.cvvv[639] = 287503503;
        gu.cvvv[640] = -1888956028;
        gu.cvvv[641] = -1986944219;
        gu.cvvv[642] = 1198498072;
        gu.cvvv[643] = 192932905;
        gu.cvvv[644] = 33702109;
        gu.cvvv[645] = -433056923;
        gu.cvvv[646] = 2030645948;
        gu.cvvv[647] = -615195766;
        gu.cvvv[648] = 21761880;
        gu.cvvv[649] = 1282955073;
        gu.cvvv[650] = 1067605194;
        gu.cvvv[651] = -1572230222;
        gu.cvvv[652] = 1018216868;
        gu.cvvv[653] = -276870900;
        gu.cvvv[654] = 1655263933;
        gu.cvvv[655] = 495644379;
        gu.cvvv[656] = -952011599;
        gu.cvvv[657] = 1320826397;
        gu.cvvv[658] = 1687591033;
        gu.cvvv[659] = 245760326;
        gu.cvvv[660] = 515815369;
        gu.cvvv[661] = 512087952;
        gu.cvvv[662] = -779800655;
        gu.cvvv[663] = -807760384;
        gu.cvvv[664] = 33144296;
        gu.cvvv[665] = 1292194318;
        gu.cvvv[666] = 224599891;
        gu.cvvv[667] = -582394103;
        gu.cvvv[668] = 404831533;
        gu.cvvv[669] = -1323900616;
        gu.cvvv[670] = -785455588;
        gu.cvvv[671] = 378408660;
        gu.cvvv[672] = -1614833347;
        gu.cvvv[673] = -2008526622;
        gu.cvvv[674] = -1004982382;
        gu.cvvv[675] = -1792563966;
        gu.cvvv[676] = -516644032;
        gu.cvvv[677] = -1464814815;
        gu.cvvv[678] = -790973531;
        gu.cvvv[679] = 316547805;
        gu.cvvv[680] = 1854486583;
        gu.cvvv[681] = 726595009;
        gu.cvvv[682] = 329432533;
        gu.cvvv[683] = 1486757194;
        gu.cvvv[684] = -1392707341;
        gu.cvvv[685] = -663120888;
        gu.cvvv[686] = -389613966;
        gu.cvvv[687] = -1558414046;
        gu.cvvv[688] = -102282357;
        gu.cvvv[689] = 505933542;
        gu.cvvv[690] = 2070270646;
        gu.cvvv[691] = -171286841;
        gu.cvvv[692] = -1012753039;
        gu.cvvv[693] = -171903190;
        gu.cvvv[694] = 1906516276;
        gu.cvvv[695] = -828465159;
        gu.cvvv[696] = -592121335;
        gu.cvvv[697] = 1332359210;
        gu.cvvv[698] = -553552295;
        gu.cvvv[699] = 373972571;
    }

    private static /* synthetic */ void cxsh() {
        gu.cvvy[100] = 1708815585;
        gu.cvvy[101] = 1016785201;
        gu.cvvy[102] = 459659324;
        gu.cvvy[103] = 1639137219;
        gu.cvvy[104] = 989249070;
        gu.cvvy[105] = 1861138182;
        gu.cvvy[106] = -2021962181;
        gu.cvvy[107] = 311169491;
        gu.cvvy[108] = -815557776;
        gu.cvvy[109] = -1169250838;
        gu.cvvy[110] = 761314416;
        gu.cvvy[111] = -1558667371;
        gu.cvvy[112] = 1810039637;
        gu.cvvy[113] = 1970333063;
        gu.cvvy[114] = 741894816;
        gu.cvvy[115] = 1381012665;
        gu.cvvy[116] = 1054192071;
        gu.cvvy[117] = 664614937;
        gu.cvvy[118] = 184302382;
        gu.cvvy[119] = 959811926;
        gu.cvvy[120] = -642313627;
        gu.cvvy[121] = 1532843172;
        gu.cvvy[122] = -695817128;
        gu.cvvy[123] = 618776480;
        gu.cvvy[124] = 1175236453;
        gu.cvvy[125] = 545497031;
        gu.cvvy[126] = -1474587368;
        gu.cvvy[127] = 1674257539;
        gu.cvvy[128] = 354778619;
        gu.cvvy[129] = 133506107;
        gu.cvvy[130] = -196563436;
        gu.cvvy[131] = 1876831096;
        gu.cvvy[132] = 1381753804;
        gu.cvvy[133] = -1415241556;
        gu.cvvy[134] = -604665787;
        gu.cvvy[135] = 969921362;
        gu.cvvy[136] = -85971573;
        gu.cvvy[137] = -1749703119;
        gu.cvvy[138] = -1442322284;
        gu.cvvy[139] = -746468641;
        gu.cvvy[140] = 1623465297;
        gu.cvvy[141] = -327310912;
        gu.cvvy[142] = 1572725016;
        gu.cvvy[143] = -1888681341;
        gu.cvvy[144] = -1152813219;
        gu.cvvy[145] = 1298136380;
        gu.cvvy[146] = -1510847056;
        gu.cvvy[147] = 1259382687;
        gu.cvvy[148] = 1734855378;
        gu.cvvy[149] = 370019290;
        gu.cvvy[150] = -1018469785;
        gu.cvvy[151] = 246553659;
        gu.cvvy[152] = -1436007919;
        gu.cvvy[153] = 1657308643;
        gu.cvvy[154] = 1370464254;
        gu.cvvy[155] = -1025143810;
        gu.cvvy[156] = 501291614;
        gu.cvvy[157] = -1626032204;
        gu.cvvy[158] = -254990482;
        gu.cvvy[159] = 443055703;
        gu.cvvy[160] = -1555206412;
        gu.cvvy[161] = 1737204844;
        gu.cvvy[162] = 13377699;
        gu.cvvy[163] = -106176041;
        gu.cvvy[164] = -1513973584;
        gu.cvvy[165] = -1381524691;
        gu.cvvy[166] = -605179799;
        gu.cvvy[167] = 403920242;
        gu.cvvy[168] = -1749216527;
        gu.cvvy[169] = -1714761726;
        gu.cvvy[170] = 1720404171;
        gu.cvvy[171] = 1087551462;
        gu.cvvy[172] = 1570767150;
        gu.cvvy[173] = 421713535;
        gu.cvvy[174] = -229244623;
        gu.cvvy[175] = 1638414343;
        gu.cvvy[176] = 1271666244;
        gu.cvvy[177] = 917873807;
        gu.cvvy[178] = 713482437;
        gu.cvvy[179] = -339958319;
        gu.cvvy[180] = 1197373688;
        gu.cvvy[181] = 600206285;
        gu.cvvy[182] = 31565003;
        gu.cvvy[183] = 1615893161;
        gu.cvvy[184] = -1479220245;
        gu.cvvy[185] = -579493203;
        gu.cvvy[186] = 87194017;
        gu.cvvy[187] = -459294000;
        gu.cvvy[188] = 144807359;
        gu.cvvy[189] = -235575696;
        gu.cvvy[190] = 832225663;
        gu.cvvy[191] = 2139458898;
        gu.cvvy[192] = 1904748490;
        gu.cvvy[193] = 1011817333;
        gu.cvvy[194] = 1290478599;
        gu.cvvy[195] = 279345554;
        gu.cvvy[196] = 712710033;
        gu.cvvy[197] = -1396379921;
        gu.cvvy[198] = 523817359;
        gu.cvvy[199] = 720809616;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private int findCompassSlot() {
        block72: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = gu.go - gu.cvwa("cxar", cvxo(int ), (int)193)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  == gu.cvwa("cxas", cvvt(int ), (int)501)) break;
                v0 /* !! */  = (long)gu.cvwa("cxat", cvvt(int ), (int)502);
            }
            var6_1 = gu.c;
            v1 /* !! */  = gu.go;
            if (true) ** GOTO lbl11
            block53: while (true) {
                v1 /* !! */  = (long)(v2 - gu.cvwa("cxau", cvxo(int ), (int)194));
lbl11:
                // 2 sources

                switch ((int)v1 /* !! */ ) {
                    case -1855170120: {
                        break block53;
                    }
                    case -777397920: {
                        v2 = gu.cvwa("cxav", cvxo(int ), (int)195);
                        continue block53;
                    }
                    case -290073186: {
                        v2 = gu.cvwa("cxaw", cvxo(int ), (int)196);
                        continue block53;
                    }
                    case 78375546: {
                        v2 = gu.cvwa("cxax", cvxo(int ), (int)197);
                        continue block53;
                    }
                }
                break;
            }
            var5_2 = gu.b;
            while (true) {
                if ((v3 /* !! */  = (cfr_temp_1 = gu.go - gu.cvwa("cxay", cvxo(int ), (int)198)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v3 /* !! */  == gu.cvwa("cxaz", cvvt(int ), (int)503)) break;
                v3 /* !! */  = (long)gu.cvwa("cxba", cvvt(int ), (int)504);
            }
            var4_3 = gu.a;
            if (var6_1) {
                throw null;
lbl32:
                // 16 sources

                return (int)gu.cvwa("cxbb", cvvt(int ), (int)505);
            }
            if (var4_3 || var4_3) ** GOTO lbl32
            var1_4 = gu.cvwa("cxbc", cvvt(int ), (int)506);
            if (var4_3) ** GOTO lbl32
            do {
                block76: {
                    block75: {
                        block74: {
                            block73: {
                                if (var4_3 || var4_3) ** GOTO lbl32
                                if (var1_4 >= gu.cvwa("cxbd", cvvt(int ), (int)507)) break block72;
                                if (var4_3 || var4_3) ** GOTO lbl32
                                v4 /* !! */  = gu.go;
                                if (true) ** GOTO lbl45
                                block57: while (true) {
                                    v4 /* !! */  = (long)(v5 - gu.cvwa("cxbe", cvxo(int ), (int)199));
lbl45:
                                    // 2 sources

                                    switch ((int)v4 /* !! */ ) {
                                        case -1855170120: {
                                            break block57;
                                        }
                                        case 803674112: {
                                            v5 = gu.cvwa("cxbf", cvxo(int ), (int)200);
                                            continue block57;
                                        }
                                        case 817362730: {
                                            v5 = gu.cvwa("cxbg", cvxo(int ), (int)201);
                                            continue block57;
                                        }
                                    }
                                    break;
                                }
                                while (true) {
                                    if ((v6 /* !! */  = (cfr_temp_2 = gu.go - gu.cvwa("cxbh", cvxo(int ), (int)202)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                                    if (v6 /* !! */  == gu.cvwa("cxbi", cvvt(int ), (int)508)) break;
                                    v6 /* !! */  = (long)gu.cvwa("cxbj", cvvt(int ), (int)509);
                                }
                                v7 = gu.mc.field_1724;
                                v8 /* !! */  = gu.go;
                                if (true) ** GOTO lbl64
                                block59: while (true) {
                                    v8 /* !! */  = (long)(v9 - gu.cvwa("cxbk", cvxo(int ), (int)203));
lbl64:
                                    // 2 sources

                                    switch ((int)v8 /* !! */ ) {
                                        case -1855170120: {
                                            break block59;
                                        }
                                        case -1182160276: {
                                            v9 = gu.cvwa("cxbl", cvxo(int ), (int)204);
                                            continue block59;
                                        }
                                        case 1652045274: {
                                            v9 = gu.cvwa("cxbm", cvxo(int ), (int)205);
                                            continue block59;
                                        }
                                    }
                                    break;
                                }
                                v10 = v7.method_31548();
                                v11 /* !! */  = gu.go;
                                if (true) ** GOTO lbl78
                                block60: while (true) {
                                    v11 /* !! */  = (long)(v12 - gu.cvwa("cxbn", cvxo(int ), (int)206));
lbl78:
                                    // 2 sources

                                    switch ((int)v11 /* !! */ ) {
                                        case -1855170120: {
                                            break block60;
                                        }
                                        case -1558629797: {
                                            v12 = gu.cvwa("cxbo", cvxo(int ), (int)207);
                                            continue block60;
                                        }
                                        case -487166807: {
                                            v12 = gu.cvwa("cxbp", cvxo(int ), (int)208);
                                            continue block60;
                                        }
                                    }
                                    break;
                                }
                                var2_5 = v10.method_5438((int)var1_4);
                                if (var4_3 || var4_3) ** GOTO lbl32
                                while (true) {
                                    if ((v13 /* !! */  = (cfr_temp_3 = gu.go - gu.cvwa("cxbq", cvxo(int ), (int)209)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                                    if (v13 /* !! */  == gu.cvwa("cxbr", cvvt(int ), (int)510)) break;
                                    v13 /* !! */  = (long)gu.cvwa("cxbs", cvvt(int ), (int)511);
                                }
                                while (true) {
                                    if ((v14 /* !! */  = (cfr_temp_4 = gu.go - gu.cvwa("cxbt", cvxo(int ), (int)210)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                                    if (v14 /* !! */  == gu.cvwa("cxbu", cvvt(int ), (int)512)) break;
                                    v14 /* !! */  = (long)gu.cvwa("cxbv", cvvt(int ), (int)513);
                                }
                                if (var2_5.method_31574(class_1802.field_8251)) break block73;
                                if (var4_3) ** GOTO lbl32
                                v15 /* !! */  = gu.go;
                                if (true) ** GOTO lbl105
                                block63: while (true) {
                                    v15 /* !! */  = (long)(v16 - gu.cvwa("cxbw", cvxo(int ), (int)211));
lbl105:
                                    // 2 sources

                                    switch ((int)v15 /* !! */ ) {
                                        case -1855170120: {
                                            break block63;
                                        }
                                        case -491548782: {
                                            v16 = gu.cvwa("cxbx", cvxo(int ), (int)212);
                                            continue block63;
                                        }
                                        case 775808433: {
                                            v16 = gu.cvwa("cxby", cvxo(int ), (int)213);
                                            continue block63;
                                        }
                                        case 870228320: {
                                            v16 = gu.cvwa("cxbz", cvxo(int ), (int)214);
                                            continue block63;
                                        }
                                    }
                                    break;
                                }
                                while (true) {
                                    if ((v17 /* !! */  = (cfr_temp_5 = gu.go - gu.cvwa("cxca", cvxo(int ), (int)215)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                                    if (v17 /* !! */  == gu.cvwa("cxcb", cvvt(int ), (int)514)) break;
                                    v17 /* !! */  = (long)gu.cvwa("cxcc", cvvt(int ), (int)515);
                                }
                                if (!var2_5.method_31574(class_1802.field_38747)) break block74;
                                if (var4_3) ** GOTO lbl32
                            }
                            if (var4_3 || var4_3) ** GOTO lbl32
                            return (int)var1_4;
                        }
                        if (var4_3 || var4_3) ** GOTO lbl32
                        v18 /* !! */  = gu.go;
                        if (true) ** GOTO lbl133
                        block65: while (true) {
                            v18 /* !! */  = (long)(gu.cvwa("cxce", cvxo(int ), (int)217) - gu.cvwa("cxcd", cvxo(int ), (int)216));
lbl133:
                            // 2 sources

                            switch ((int)v18 /* !! */ ) {
                                case -1855170120: {
                                    break block65;
                                }
                                case -1356469078: {
                                    continue block65;
                                }
                            }
                            break;
                        }
                        v19 = var2_5.method_7964();
                        v20 /* !! */  = gu.go;
                        if (true) ** GOTO lbl143
                        block66: while (true) {
                            v20 /* !! */  = (long)(v21 - gu.cvwa("cxcf", cvxo(int ), (int)218));
lbl143:
                            // 2 sources

                            switch ((int)v20 /* !! */ ) {
                                case -1855170120: {
                                    break block66;
                                }
                                case 517714234: {
                                    v21 = gu.cvwa("cxcg", cvxo(int ), (int)219);
                                    continue block66;
                                }
                                case 577867455: {
                                    v21 = gu.cvwa("cxch", cvxo(int ), (int)220);
                                    continue block66;
                                }
                            }
                            break;
                        }
                        v22 = v19.getString();
                        v23 /* !! */  = gu.go;
                        if (true) ** GOTO lbl157
                        block67: while (true) {
                            v23 /* !! */  = (long)(v24 - gu.cvwa("cxci", cvxo(int ), (int)221));
lbl157:
                            // 2 sources

                            switch ((int)v23 /* !! */ ) {
                                case -1855170120: {
                                    break block67;
                                }
                                case -1027679503: {
                                    v24 = gu.cvwa("cxcj", cvxo(int ), (int)222);
                                    continue block67;
                                }
                                case 1872663691: {
                                    v24 = gu.cvwa("cxck", cvxo(int ), (int)223);
                                    continue block67;
                                }
                            }
                            break;
                        }
                        v25 /* !! */  = gu.go;
                        if (true) ** GOTO lbl170
                        block68: while (true) {
                            v25 /* !! */  = (long)(v26 - gu.cvwa("cxcl", cvxo(int ), (int)224));
lbl170:
                            // 2 sources

                            switch ((int)v25 /* !! */ ) {
                                case -1898154879: {
                                    v26 = gu.cvwa("cxcm", cvxo(int ), (int)225);
                                    continue block68;
                                }
                                case -1855170120: {
                                    break block68;
                                }
                                case -823974992: {
                                    v26 = gu.cvwa("cxcn", cvxo(int ), (int)226);
                                    continue block68;
                                }
                                case 1720221812: {
                                    v26 = gu.cvwa("cxco", cvxo(int ), (int)227);
                                    continue block68;
                                }
                            }
                            break;
                        }
                        var3_6 = v22.toLowerCase(Locale.ROOT);
                        if (var4_3 || var4_3) ** GOTO lbl32
                        while (true) {
                            if ((v27 /* !! */  = (cfr_temp_6 = gu.go - gu.cvwa("cxcp", cvxo(int ), (int)228)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                            if (v27 /* !! */  == gu.cvwa("cxcq", cvvt(int ), (int)516)) break;
                            v27 /* !! */  = (long)gu.cvwa("cxcr", cvvt(int ), (int)517);
                        }
                        if (var3_6.contains("\u043a\u043e\u043c\u043f\u0430\u0441")) break block75;
                        if (var4_3) ** GOTO lbl32
                        v28 /* !! */  = gu.go;
                        if (true) ** GOTO lbl195
                        block70: while (true) {
                            v28 /* !! */  = (long)(v29 - gu.cvwa("cxcs", cvxo(int ), (int)229));
lbl195:
                            // 2 sources

                            switch ((int)v28 /* !! */ ) {
                                case -2100219220: {
                                    v29 = gu.cvwa("cxct", cvxo(int ), (int)230);
                                    continue block70;
                                }
                                case -1855170120: {
                                    break block70;
                                }
                                case -1657877734: {
                                    v29 = gu.cvwa("cxcu", cvxo(int ), (int)231);
                                    continue block70;
                                }
                            }
                            break;
                        }
                        if (!var3_6.contains("\u0432\u044b\u0431\u043e\u0440 \u0441\u0435\u0440\u0432\u0435\u0440\u0430")) break block76;
                        if (var4_3) ** GOTO lbl32
                    }
                    if (var4_3 || var4_3) ** GOTO lbl32
                    return (int)var1_4;
                }
                if (var4_3 || var4_3) ** GOTO lbl32
                ++var1_4;
                if (var4_3) ** GOTO lbl32
            } while (!var6_1);
            throw null;
        }
        if (!var4_3 && !var4_3) ** break;
        ** while (true)
        return (int)gu.cvwa("cxcv", cvvt(int ), (int)518);
    }

    private static /* synthetic */ void cxsv() {
        gu.cvxr[300] = -1273619149969044744L;
        gu.cvxr[301] = 3882669700295698275L;
        gu.cvxr[302] = 8552147205401429089L;
        gu.cvxr[303] = -341740456405835813L;
        gu.cvxr[304] = 2783950134151918663L;
        gu.cvxr[305] = 2325503545714542525L;
        gu.cvxr[306] = 4033836913631312202L;
        gu.cvxr[307] = -2813947865214617783L;
        gu.cvxr[308] = 7288476540085467845L;
        gu.cvxr[309] = -6120235327201971425L;
        gu.cvxr[310] = 3707042437170367328L;
        gu.cvxr[311] = 8573022302272445447L;
        gu.cvxr[312] = 1058031189505687585L;
        gu.cvxr[313] = -3627708438515243238L;
        gu.cvxr[314] = 9106170425285631650L;
        gu.cvxr[315] = -3998257642464845955L;
        gu.cvxr[316] = 309419258715918997L;
        gu.cvxr[317] = 1183695928840947554L;
        gu.cvxr[318] = -5656235213483339230L;
        gu.cvxr[319] = 8040759359302222585L;
        gu.cvxr[320] = 5597894128719841289L;
        gu.cvxr[321] = 2664260680361066652L;
        gu.cvxr[322] = 7557000799474737378L;
        gu.cvxr[323] = -5745920506046848761L;
        gu.cvxr[324] = -7266650884348912436L;
        gu.cvxr[325] = -7428862505866774751L;
        gu.cvxr[326] = -6084478106208245232L;
        gu.cvxr[327] = -4506255080978279846L;
        gu.cvxr[328] = -8776611453385296429L;
        gu.cvxr[329] = -2091409612467095443L;
        gu.cvxr[330] = -8789875582887643084L;
        gu.cvxr[331] = -5619194885181196852L;
        gu.cvxr[332] = -6973760942874624467L;
        gu.cvxr[333] = -8480232322837214285L;
        gu.cvxr[334] = -660378838025065606L;
        gu.cvxr[335] = 8712567216405336874L;
        gu.cvxr[336] = 2704846000929761522L;
        gu.cvxr[337] = -5624727115426373785L;
        gu.cvxr[338] = -5107431908273875511L;
        gu.cvxr[339] = 3930735073427809130L;
        gu.cvxr[340] = 785459010007841991L;
        gu.cvxr[341] = -6573190934968927237L;
        gu.cvxr[342] = -7526029059168219666L;
        gu.cvxr[343] = -3175309533254192853L;
        gu.cvxr[344] = -3438966795895042037L;
        gu.cvxr[345] = 6833127644608219486L;
        gu.cvxr[346] = -7240206440275540547L;
        gu.cvxr[347] = -3717381585246956259L;
        gu.cvxr[348] = 1176898791683624811L;
        gu.cvxr[349] = 2165540233023371383L;
        gu.cvxr[350] = 2328492176671155123L;
        gu.cvxr[351] = 618389433277532947L;
        gu.cvxr[352] = -7465100064845265244L;
        gu.cvxr[353] = -2176947320620249411L;
        gu.cvxr[354] = 63560114916593800L;
        gu.cvxr[355] = 7659206888010509683L;
        gu.cvxr[356] = 7590003704057926481L;
        gu.cvxr[357] = -1112900341050986546L;
        gu.cvxr[358] = 8632663073053213512L;
        gu.cvxr[359] = 6494412644825915837L;
        gu.cvxr[360] = 4953875755644803420L;
        gu.cvxr[361] = 4063081650820523011L;
        gu.cvxr[362] = -3129912522388881061L;
        gu.cvxr[363] = -1757453425019334335L;
        gu.cvxr[364] = 7556566426617994969L;
        gu.cvxr[365] = 583360932647111829L;
        gu.cvxr[366] = 9072403397367473087L;
        gu.cvxr[367] = 9216525400761174247L;
        gu.cvxr[368] = -1231754932903189846L;
        gu.cvxr[369] = -2043908476016375544L;
        gu.cvxr[370] = -2295473760947151397L;
        gu.cvxr[371] = -1941799528815952760L;
        gu.cvxr[372] = 3370950951763550695L;
        gu.cvxr[373] = -2829368455684658030L;
        gu.cvxr[374] = -9186405910640668056L;
        gu.cvxr[375] = -3157357614624520596L;
        gu.cvxr[376] = -6064033821294573122L;
        gu.cvxr[377] = 8649526077585455430L;
        gu.cvxr[378] = 1124409820844989107L;
        gu.cvxr[379] = -1073707289322198696L;
        gu.cvxr[380] = 1578525262339272287L;
        gu.cvxr[381] = -3198543995832226186L;
        gu.cvxr[382] = 8889889898579937466L;
        gu.cvxr[383] = -7961806850467529464L;
        gu.cvxr[384] = 5336985641610629258L;
        gu.cvxr[385] = -4297466499193233318L;
        gu.cvxr[386] = 5154815995886325590L;
        gu.cvxr[387] = -5264117681760006843L;
        gu.cvxr[388] = 9064996508739986065L;
        gu.cvxr[389] = -4083606000112243650L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onTick(df var1_1) {
        block81: {
            block80: {
                var6_2 = gu.c;
                var5_3 /* !! */  = gu.b;
                var4_4 = gu.a;
                if (var6_2) {
                    throw null;
lbl6:
                    // 23 sources

                    return;
                }
                if (var4_4 || var4_4) ** GOTO lbl6
                if (!this.joining) break block80;
                if (var4_4) ** GOTO lbl6
                if (gu.mc.field_1724 == null) break block80;
                if (var4_4) ** GOTO lbl6
                if (gu.mc.field_1687 == null) break block80;
                if (var4_4) ** GOTO lbl6
                if (gu.mc.field_1761 != null) break block81;
                if (var4_4) ** GOTO lbl6
            }
            if (var4_4 || var4_4) ** GOTO lbl6
            return;
        }
        if (var4_4 || var4_4) ** GOTO lbl6
        if (!this.updateCompassAction()) ** GOTO lbl29
        if (var4_4) ** GOTO lbl6
        if (var5_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_4) ** GOTO lbl6
                return;
            }
lbl29:
            // 1 sources

            if (var4_4 || var4_4) ** GOTO lbl6
            if (this.targetClickedAt == gu.cvwa("cwep", cvxo(int ), (int)46)) ** GOTO lbl40
            if (var4_4) ** GOTO lbl6
            if (gu.mc.field_1755 instanceof class_465) ** GOTO lbl40
            if (var4_4 || var4_4) ** GOTO lbl6
            if (System.currentTimeMillis() - this.targetClickedAt < gu.cvwa("cweq", cvxo(int ), (int)47)) ** GOTO lbl38
            if (var4_4 || var4_4) ** GOTO lbl6
            this.completeJoining();
            if (var4_4) ** GOTO lbl6
lbl38:
            // 2 sources

            if (var4_4 || var4_4) ** GOTO lbl6
            return;
lbl40:
            // 2 sources

            if (var4_4 || var4_4) ** GOTO lbl6
            var3_5 = gu.mc.field_1755;
            if (var4_4) ** GOTO lbl6
            if (!(var3_5 instanceof class_465)) ** GOTO lbl50
            if (var4_4) ** GOTO lbl6
            var2_6 = (class_465)var3_5;
            if (var4_4 || var4_4) ** GOTO lbl6
            if (var6_2) {
                throw null;
            }
            ** GOTO lbl54
lbl50:
            // 1 sources

            if (var4_4 || var4_4) ** GOTO lbl6
            this.useCompass();
            if (var4_4 || var4_4) ** GOTO lbl6
            return;
lbl54:
            // 1 sources

            if (var4_4 || var4_4) ** GOTO lbl6
            this.handleMenu(var2_6);
            if (!var4_4 && !var4_4) ** break;
            ** continue;
            return;
lbl59:
            // 2 sources

            case 0: {
                var5_3 /* !! */  = (int)gu.cvwa("cwes", cvvt(int ), (int)78);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl218
            }
lbl64:
            // 4 sources

            case 1: {
                var5_3 /* !! */  = (int)gu.cvwa("cwet", cvvt(int ), (int)79);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl79
            }
            case 2: {
                var5_3 /* !! */  = (int)gu.cvwa("cweu", cvvt(int ), (int)80);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl162
            }
lbl74:
            // 3 sources

            case 3: {
                var5_3 /* !! */  = (int)gu.cvwa("cwev", cvvt(int ), (int)81);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl158
            }
lbl79:
            // 2 sources

            case 4: {
                var5_3 /* !! */  = (int)gu.cvwa("cwew", cvvt(int ), (int)82);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl127
            }
            case 5: {
                var5_3 /* !! */  = (int)gu.cvwa("cwex", cvvt(int ), (int)83);
                if (!var6_2) ** GOTO lbl64
                throw null;
            }
            case 6: {
                var5_3 /* !! */  = (int)gu.cvwa("cwey", cvvt(int ), (int)84);
                if (!var6_2) ** GOTO lbl64
                throw null;
            }
lbl92:
            // 2 sources

            case 7: {
                var5_3 /* !! */  = (int)gu.cvwa("cwez", cvvt(int ), (int)85);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl162
            }
            case 8: {
                do {
                    var5_3 /* !! */  = (int)gu.cvwa("cwfa", cvvt(int ), (int)86);
                } while (!var6_2);
                throw null;
            }
lbl102:
            // 2 sources

            case 9: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_3 /* !! */  = (int)gu.cvwa("cwfb", cvvt(int ), (int)87);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl140
                    break;
                }
            }
lbl108:
            // 3 sources

            case 10: {
                var5_3 /* !! */  = (int)gu.cvwa("cwfc", cvvt(int ), (int)88);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl189
            }
lbl113:
            // 2 sources

            case 11: {
                var5_3 /* !! */  = (int)gu.cvwa("cwfd", cvvt(int ), (int)89);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl222
            }
            case 12: {
                var5_3 /* !! */  = (int)gu.cvwa("cwfe", cvvt(int ), (int)90);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl154
            }
lbl123:
            // 2 sources

            case 13: {
                var5_3 /* !! */  = (int)gu.cvwa("cwff", cvvt(int ), (int)91);
                if (!var6_2) ** GOTO lbl108
                throw null;
            }
lbl127:
            // 3 sources

            case 14: {
                var5_3 /* !! */  = (int)gu.cvwa("cwfg", cvvt(int ), (int)92);
                if (!var6_2) ** GOTO lbl74
                throw null;
            }
lbl131:
            // 2 sources

            case 15: {
                var5_3 /* !! */  = (int)gu.cvwa("cwfh", cvvt(int ), (int)93);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl149
            }
lbl136:
            // 3 sources

            case 16: {
                var5_3 /* !! */  = (int)gu.cvwa("cwfi", cvvt(int ), (int)94);
                if (!var6_2) ** GOTO lbl131
                throw null;
            }
lbl140:
            // 4 sources

            case 17: {
                var5_3 /* !! */  = (int)gu.cvwa("cwfk", cvvt(int ), (int)95);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl205
            }
            case 18: {
                var5_3 /* !! */  = (int)gu.cvwa("cwfl", cvvt(int ), (int)96);
                if (!var6_2) ** GOTO lbl92
                throw null;
            }
lbl149:
            // 3 sources

            case 19: {
                var5_3 /* !! */  = (int)gu.cvwa("cwfm", cvvt(int ), (int)97);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl222
            }
lbl154:
            // 3 sources

            case 20: {
                var5_3 /* !! */  = (int)gu.cvwa("cwfn", cvvt(int ), (int)98);
                if (!var6_2) ** GOTO lbl136
                throw null;
            }
lbl158:
            // 2 sources

            case 21: {
                var5_3 /* !! */  = (int)gu.cvwa("cwfo", cvvt(int ), (int)99);
                if (!var6_2) ** GOTO lbl136
                throw null;
            }
lbl162:
            // 3 sources

            case 22: {
                var5_3 /* !! */  = (int)gu.cvwa("cwfp", cvvt(int ), (int)100);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl189
            }
            case 23: {
                var5_3 /* !! */  = (int)gu.cvwa("cwfq", cvvt(int ), (int)101);
                if (var6_2) {
                    throw null;
                }
            }
            case 24: {
                var5_3 /* !! */  = (int)gu.cvwa("cwfr", cvvt(int ), (int)102);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl222
            }
            case 25: {
                var5_3 /* !! */  = (int)gu.cvwa("cwfs", cvvt(int ), (int)103);
                if (!var6_2) ** GOTO lbl140
                throw null;
            }
            case 26: {
                var5_3 /* !! */  = (int)gu.cvwa("cwfu", cvvt(int ), (int)104);
                if (!var6_2) ** GOTO lbl123
                throw null;
            }
            case 27: {
                var5_3 /* !! */  = (int)gu.cvwa("cwfv", cvvt(int ), (int)105);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl234
            }
lbl189:
            // 3 sources

            case 28: {
                var5_3 /* !! */  = (int)gu.cvwa("cwfw", cvvt(int ), (int)106);
                if (!var6_2) ** GOTO lbl127
                throw null;
            }
            case 29: {
                var5_3 /* !! */  = (int)gu.cvwa("cwfx", cvvt(int ), (int)107);
                if (!var6_2) ** GOTO lbl140
                throw null;
            }
            case 30: {
                var5_3 /* !! */  = (int)gu.cvwa("cwfy", cvvt(int ), (int)108);
                if (!var6_2) ** GOTO lbl113
                throw null;
            }
            case 31: {
                var5_3 /* !! */  = (int)gu.cvwa("cwfz", cvvt(int ), (int)109);
                if (!var6_2) ** GOTO lbl154
                throw null;
            }
lbl205:
            // 2 sources

            case 32: {
                var5_3 /* !! */  = (int)gu.cvwa("cwga", cvvt(int ), (int)110);
                if (!var6_2) ** GOTO lbl64
                throw null;
            }
            case 33: {
                var5_3 /* !! */  = (int)gu.cvwa("cwgb", cvvt(int ), (int)111);
                if (!var6_2) ** GOTO lbl74
                throw null;
            }
            case 34: {
                var5_3 /* !! */  = (int)gu.cvwa("cwgc", cvvt(int ), (int)112);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl230
            }
lbl218:
            // 2 sources

            case 35: {
                var5_3 /* !! */  = (int)gu.cvwa("cwgd", cvvt(int ), (int)113);
                if (!var6_2) ** GOTO lbl149
                throw null;
            }
lbl222:
            // 4 sources

            case 36: {
                var5_3 /* !! */  = (int)gu.cvwa("cwge", cvvt(int ), (int)114);
                if (!var6_2) ** GOTO lbl108
                throw null;
            }
            case 37: {
                var5_3 /* !! */  = (int)gu.cvwa("cwgf", cvvt(int ), (int)115);
                if (!var6_2) ** GOTO lbl59
                throw null;
            }
lbl230:
            // 2 sources

            case 38: {
                var5_3 /* !! */  = (int)gu.cvwa("cwgg", cvvt(int ), (int)116);
                if (!var6_2) break;
                throw null;
            }
lbl234:
            // 2 sources

            case 39: {
                var5_3 /* !! */  = (int)gu.cvwa("cwgh", cvvt(int ), (int)117);
                if (!var6_2) ** GOTO lbl102
                throw null;
            }
            case 40: 
        }
        var5_3 /* !! */  = (int)gu.cvwa("cwgi", cvvt(int ), (int)118);
        ** while (!var6_2)
lbl241:
        // 1 sources

        throw null;
    }

    static {
        cvvv = new int[753];
        cvvy = new int[753];
        gu.cxry();
        gu.cxrz();
        gu.cxsa();
        gu.cxsb();
        gu.cxsc();
        gu.cxsd();
        gu.cxse();
        gu.cxsf();
        gu.cxsg();
        gu.cxsh();
        gu.cxsi();
        gu.cxsj();
        gu.cxsk();
        gu.cxsl();
        gu.cxsm();
        gu.cxsn();
        cvxp = new long[390];
        cvxr = new long[390];
        gu.cxso();
        gu.cxsp();
        gu.cxsq();
        gu.cxsr();
        gu.cxss();
        gu.cxst();
        gu.cxsu();
        gu.cxsv();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void useCompass() {
        block75: {
            block74: {
                block73: {
                    var5_1 = gu.c;
                    var4_2 /* !! */  = gu.b;
                    var3_3 = gu.a;
                    if (var5_1) {
                        throw null;
lbl6:
                        // 20 sources

                        return;
                    }
                    if (var3_3 || var3_3) ** GOTO lbl6
                    if (this.compassStage != 0) break block73;
                    if (var3_3) ** GOTO lbl6
                    if (!this.compassTimer.finished((double)gu.cvwa("cwxf", cwxe(int ), (int)190))) break block73;
                    if (var3_3) ** GOTO lbl6
                    if (gu.mc.field_1724 != null) break block74;
                    if (var3_3) ** GOTO lbl6
                }
                if (var3_3 || var3_3) ** GOTO lbl6
                return;
            }
            if (var3_3 || var3_3) ** GOTO lbl6
            var1_4 = this.findCompassSlot();
            if (var3_3 || var3_3) ** GOTO lbl6
            if (var1_4 != gu.cvwa("cwxg", cvvt(int ), (int)414)) break block75;
            if (var3_3 || var3_3) ** GOTO lbl6
            return;
        }
        if (var3_3 || var3_3) ** GOTO lbl6
        var2_5 = gu.mc.field_1724.method_31548().method_67532();
        if (var3_3) ** GOTO lbl6
        if (var4_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_3) ** GOTO lbl6
                nv.selectSlot(var1_4);
                if (var3_3 || var3_3) ** GOTO lbl6
                nv.selectSlotSilent(var1_4);
                if (var3_3 || var3_3) ** GOTO lbl6
                if (var2_5 == var1_4) ** GOTO lbl41
                if (var3_3 || var3_3) ** GOTO lbl6
                this.compassRestoreSlot = var2_5;
                if (var3_3) ** GOTO lbl6
lbl41:
                // 2 sources

                if (var3_3 || var3_3) ** GOTO lbl6
                this.compassStage = (int)gu.cvwa("cwxh", cvvt(int ), (int)415);
                if (var3_3 || var3_3) ** GOTO lbl6
                this.compassActionAt = System.currentTimeMillis();
                if (var3_3 || var3_3) ** GOTO lbl6
                this.pageSwitches = (int)gu.cvwa("cwxi", cvvt(int ), (int)416);
                if (var3_3 || var3_3) ** GOTO lbl6
                this.compassTimer.reset();
                if (!var3_3 && !var3_3) ** break;
                ** continue;
                return;
            }
lbl52:
            // 3 sources

            case 0: {
                var4_2 /* !! */  = (int)gu.cvwa("cwxj", cvvt(int ), (int)417);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl76
            }
lbl57:
            // 2 sources

            case 1: {
                var4_2 /* !! */  = (int)gu.cvwa("cwxk", cvvt(int ), (int)418);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl145
            }
lbl62:
            // 2 sources

            case 2: {
                var4_2 /* !! */  = (int)gu.cvwa("cwxl", cvvt(int ), (int)419);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl140
            }
lbl67:
            // 3 sources

            case 3: {
                var4_2 /* !! */  = (int)gu.cvwa("cwxm", cvvt(int ), (int)420);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl128
            }
lbl72:
            // 4 sources

            case 4: {
                var4_2 /* !! */  = (int)gu.cvwa("cwxn", cvvt(int ), (int)421);
                if (!var5_1) ** GOTO lbl62
                throw null;
            }
lbl76:
            // 3 sources

            case 5: {
                var4_2 /* !! */  = (int)gu.cvwa("cwxo", cvvt(int ), (int)422);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl185
            }
            case 6: {
                var4_2 /* !! */  = (int)gu.cvwa("cwxp", cvvt(int ), (int)423);
                if (!var5_1) ** GOTO lbl67
                throw null;
            }
lbl85:
            // 3 sources

            case 7: {
                var4_2 /* !! */  = (int)gu.cvwa("cwxq", cvvt(int ), (int)424);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl202
            }
            case 8: {
                var4_2 /* !! */  = (int)gu.cvwa("cwxr", cvvt(int ), (int)425);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl149
            }
lbl95:
            // 2 sources

            case 9: {
                var4_2 /* !! */  = (int)gu.cvwa("cwxs", cvvt(int ), (int)426);
                if (!var5_1) ** GOTO lbl76
                throw null;
            }
lbl99:
            // 2 sources

            case 10: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_2 /* !! */  = (int)gu.cvwa("cwxt", cvvt(int ), (int)427);
                    if (var5_1) {
                        throw null;
                    }
                    ** GOTO lbl206
                    break;
                }
            }
            case 11: {
                var4_2 /* !! */  = (int)gu.cvwa("cwxu", cvvt(int ), (int)428);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl158
            }
            case 12: {
                var4_2 /* !! */  = (int)gu.cvwa("cwxv", cvvt(int ), (int)429);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl140
            }
lbl115:
            // 2 sources

            case 13: {
                var4_2 /* !! */  = (int)gu.cvwa("cwxw", cvvt(int ), (int)430);
                if (!var5_1) ** GOTO lbl72
                throw null;
            }
lbl119:
            // 2 sources

            case 14: {
                var4_2 /* !! */  = (int)gu.cvwa("cwxx", cvvt(int ), (int)431);
                if (!var5_1) ** GOTO lbl85
                throw null;
            }
lbl123:
            // 2 sources

            case 15: {
                var4_2 /* !! */  = (int)gu.cvwa("cwxy", cvvt(int ), (int)432);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl189
            }
lbl128:
            // 2 sources

            case 16: {
                var4_2 /* !! */  = (int)gu.cvwa("cwxz", cvvt(int ), (int)433);
                if (!var5_1) ** GOTO lbl52
                throw null;
            }
            case 17: {
                var4_2 /* !! */  = (int)gu.cvwa("cwya", cvvt(int ), (int)434);
                if (!var5_1) ** GOTO lbl72
                throw null;
            }
            case 18: {
                var4_2 /* !! */  = (int)gu.cvwa("cwyb", cvvt(int ), (int)435);
                if (!var5_1) ** GOTO lbl115
                throw null;
            }
lbl140:
            // 3 sources

            case 19: {
                var4_2 /* !! */  = (int)gu.cvwa("cwyc", cvvt(int ), (int)436);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl149
            }
lbl145:
            // 2 sources

            case 20: {
                var4_2 /* !! */  = (int)gu.cvwa("cwyd", cvvt(int ), (int)437);
                if (!var5_1) ** GOTO lbl85
                throw null;
            }
lbl149:
            // 3 sources

            case 21: {
                var4_2 /* !! */  = (int)gu.cvwa("cwye", cvvt(int ), (int)438);
                if (!var5_1) ** GOTO lbl95
                throw null;
            }
            case 22: {
                var4_2 /* !! */  = (int)gu.cvwa("cwyf", cvvt(int ), (int)439);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl185
            }
lbl158:
            // 2 sources

            case 23: {
                var4_2 /* !! */  = (int)gu.cvwa("cwyg", cvvt(int ), (int)440);
                if (!var5_1) ** GOTO lbl123
                throw null;
            }
            case 24: {
                var4_2 /* !! */  = (int)gu.cvwa("cwyh", cvvt(int ), (int)441);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl189
            }
            case 25: {
                var4_2 /* !! */  = (int)gu.cvwa("cwyi", cvvt(int ), (int)442);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl206
            }
            case 26: {
                var4_2 /* !! */  = (int)gu.cvwa("cwyj", cvvt(int ), (int)443);
                if (!var5_1) ** GOTO lbl99
                throw null;
            }
lbl176:
            // 2 sources

            case 27: {
                var4_2 /* !! */  = (int)gu.cvwa("cwyk", cvvt(int ), (int)444);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl189
            }
            case 28: {
                var4_2 /* !! */  = (int)gu.cvwa("cwyl", cvvt(int ), (int)445);
                if (!var5_1) ** GOTO lbl67
                throw null;
            }
lbl185:
            // 3 sources

            case 29: {
                var4_2 /* !! */  = (int)gu.cvwa("cwym", cvvt(int ), (int)446);
                if (!var5_1) ** GOTO lbl52
                throw null;
            }
lbl189:
            // 4 sources

            case 30: {
                do {
                    var4_2 /* !! */  = (int)gu.cvwa("cwyn", cvvt(int ), (int)447);
                } while (!var5_1);
                throw null;
            }
            case 31: {
                var4_2 /* !! */  = (int)gu.cvwa("cwyo", cvvt(int ), (int)448);
                if (!var5_1) ** GOTO lbl119
                throw null;
            }
lbl198:
            // 2 sources

            case 32: {
                var4_2 /* !! */  = (int)gu.cvwa("cwyp", cvvt(int ), (int)449);
                if (!var5_1) ** GOTO lbl57
                throw null;
            }
lbl202:
            // 2 sources

            case 33: {
                var4_2 /* !! */  = (int)gu.cvwa("cwyq", cvvt(int ), (int)450);
                if (!var5_1) ** GOTO lbl176
                throw null;
            }
lbl206:
            // 3 sources

            case 34: {
                var4_2 /* !! */  = (int)gu.cvwa("cwyr", cvvt(int ), (int)451);
                if (!var5_1) ** GOTO lbl72
                throw null;
            }
            case 35: {
                var4_2 /* !! */  = (int)gu.cvwa("cwys", cvvt(int ), (int)452);
                if (!var5_1) ** GOTO lbl198
                throw null;
            }
            case 36: 
        }
        var4_2 /* !! */  = (int)gu.cvwa("cwyt", cvvt(int ), (int)453);
        ** while (!var5_1)
lbl217:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void cxsj() {
        gu.cvvy[300] = -1357423800;
        gu.cvvy[301] = -1166567300;
        gu.cvvy[302] = -1056325056;
        gu.cvvy[303] = -100162044;
        gu.cvvy[304] = -1078465938;
        gu.cvvy[305] = 1205788856;
        gu.cvvy[306] = 2009897754;
        gu.cvvy[307] = -1207242678;
        gu.cvvy[308] = -1598354408;
        gu.cvvy[309] = -949780766;
        gu.cvvy[310] = -1377194930;
        gu.cvvy[311] = -1829414292;
        gu.cvvy[312] = -880112263;
        gu.cvvy[313] = -1815904943;
        gu.cvvy[314] = -524939599;
        gu.cvvy[315] = -526538966;
        gu.cvvy[316] = 1949486803;
        gu.cvvy[317] = 1162387046;
        gu.cvvy[318] = 333678090;
        gu.cvvy[319] = -1525760817;
        gu.cvvy[320] = -998914348;
        gu.cvvy[321] = -1447184048;
        gu.cvvy[322] = -675951947;
        gu.cvvy[323] = 524892138;
        gu.cvvy[324] = -716444795;
        gu.cvvy[325] = -1816957520;
        gu.cvvy[326] = -1315128669;
        gu.cvvy[327] = -1948494214;
        gu.cvvy[328] = 1592141428;
        gu.cvvy[329] = -487352789;
        gu.cvvy[330] = -1965611500;
        gu.cvvy[331] = -290015812;
        gu.cvvy[332] = -1249518546;
        gu.cvvy[333] = 1937149037;
        gu.cvvy[334] = -173253302;
        gu.cvvy[335] = -68722739;
        gu.cvvy[336] = 555815704;
        gu.cvvy[337] = -1936053903;
        gu.cvvy[338] = 683959680;
        gu.cvvy[339] = -995127405;
        gu.cvvy[340] = -769543298;
        gu.cvvy[341] = 1418855934;
        gu.cvvy[342] = -241563366;
        gu.cvvy[343] = 1955745502;
        gu.cvvy[344] = 1783641324;
        gu.cvvy[345] = -1786986636;
        gu.cvvy[346] = 385955612;
        gu.cvvy[347] = -1791143223;
        gu.cvvy[348] = 19614908;
        gu.cvvy[349] = -1509800760;
        gu.cvvy[350] = 359622112;
        gu.cvvy[351] = 1475918438;
        gu.cvvy[352] = -990678544;
        gu.cvvy[353] = -1290047540;
        gu.cvvy[354] = 526052611;
        gu.cvvy[355] = -301886567;
        gu.cvvy[356] = 650791489;
        gu.cvvy[357] = -1411158349;
        gu.cvvy[358] = 1742834336;
        gu.cvvy[359] = -787658172;
        gu.cvvy[360] = 2108904568;
        gu.cvvy[361] = 525844948;
        gu.cvvy[362] = -197818432;
        gu.cvvy[363] = 812803492;
        gu.cvvy[364] = 1799644155;
        gu.cvvy[365] = -286010962;
        gu.cvvy[366] = 877932560;
        gu.cvvy[367] = 1481979898;
        gu.cvvy[368] = 313115050;
        gu.cvvy[369] = -1939775188;
        gu.cvvy[370] = 478122196;
        gu.cvvy[371] = -1929550739;
        gu.cvvy[372] = 2022376939;
        gu.cvvy[373] = -867737559;
        gu.cvvy[374] = 1109439260;
        gu.cvvy[375] = 1466130222;
        gu.cvvy[376] = -1785004029;
        gu.cvvy[377] = 819257909;
        gu.cvvy[378] = -413743820;
        gu.cvvy[379] = -548189219;
        gu.cvvy[380] = -949076313;
        gu.cvvy[381] = -197247591;
        gu.cvvy[382] = -339024032;
        gu.cvvy[383] = -1921720789;
        gu.cvvy[384] = 819531218;
        gu.cvvy[385] = 1514051224;
        gu.cvvy[386] = 1051168712;
        gu.cvvy[387] = -1839324993;
        gu.cvvy[388] = 768540121;
        gu.cvvy[389] = -1206887689;
        gu.cvvy[390] = -670189135;
        gu.cvvy[391] = 30492253;
        gu.cvvy[392] = 2076919740;
        gu.cvvy[393] = -931958337;
        gu.cvvy[394] = 256988141;
        gu.cvvy[395] = 1084483909;
        gu.cvvy[396] = -261446978;
        gu.cvvy[397] = -578804927;
        gu.cvvy[398] = -1444306283;
        gu.cvvy[399] = -2100273959;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void startRequestedJoining() {
        block36: {
            block35: {
                while (true) {
                    if ((v0 /* !! */  = (cfr_temp_0 = gu.go - gu.cvwa("cwlb", cvxo(int ), (int)100)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v0 /* !! */  == gu.cvwa("cwlc", cvvt(int ), (int)189)) break;
                    v0 /* !! */  = (long)gu.cvwa("cwld", cvvt(int ), (int)190);
                }
                var3_1 = gu.c;
                while (true) {
                    if ((v1 /* !! */  = (cfr_temp_1 = gu.go - gu.cvwa("cwle", cvxo(int ), (int)101)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v1 /* !! */  == gu.cvwa("cwlf", cvvt(int ), (int)191)) break;
                    v1 /* !! */  = (long)gu.cvwa("cwlg", cvvt(int ), (int)192);
                }
                var2_2 = gu.b;
                v2 /* !! */  = gu.go;
                if (true) ** GOTO lbl19
                block22: while (true) {
                    v2 /* !! */  = (long)(v3 - gu.cvwa("cwlh", cvxo(int ), (int)102));
lbl19:
                    // 2 sources

                    switch ((int)v2 /* !! */ ) {
                        case -1855170120: {
                            break block22;
                        }
                        case 1281824479: {
                            v3 = gu.cvwa("cwli", cvxo(int ), (int)103);
                            continue block22;
                        }
                        case 1844383359: {
                            v3 = gu.cvwa("cwlj", cvxo(int ), (int)104);
                            continue block22;
                        }
                    }
                    break;
                }
                var1_3 = gu.a;
                if (var3_1) {
                    throw null;
lbl31:
                    // 7 sources

                    return;
                }
                if (var1_3 || var1_3) ** GOTO lbl31
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = gu.go - gu.cvwa("cwlk", cvxo(int ), (int)105)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == gu.cvwa("cwll", cvvt(int ), (int)193)) break;
                    v4 /* !! */  = (long)gu.cvwa("cwlm", cvvt(int ), (int)194);
                }
                if (!this.isState()) break block35;
                if (var1_3 || var1_3) ** GOTO lbl31
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_3 = gu.go - gu.cvwa("cwln", cvxo(int ), (int)106)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == gu.cvwa("cwlo", cvvt(int ), (int)195)) break;
                    v5 /* !! */  = (long)gu.cvwa("cwlp", cvvt(int ), (int)196);
                }
                v6 /* !! */  = gu.go;
                if (true) ** GOTO lbl52
                block26: while (true) {
                    v6 /* !! */  = (long)(gu.cvwa("cwlr", cvxo(int ), (int)108) - gu.cvwa("cwlq", cvxo(int ), (int)107));
lbl52:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1855170120: {
                            break block26;
                        }
                        case 1012808673: {
                            continue block26;
                        }
                    }
                    break;
                }
                this.beginJoining(this.requestedGrief);
                if (var1_3 || var1_3) ** GOTO lbl31
                v7 = gu.cvwa("cwls", cvvt(int ), (int)197);
                v8 /* !! */  = gu.go;
                if (true) ** GOTO lbl64
                block27: while (true) {
                    v8 /* !! */  = (long)(v9 - gu.cvwa("cwlt", cvxo(int ), (int)109));
lbl64:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -1855170120: {
                            break block27;
                        }
                        case -1043071475: {
                            v9 = gu.cvwa("cwlu", cvxo(int ), (int)110);
                            continue block27;
                        }
                        case -552289388: {
                            v9 = gu.cvwa("cwlv", cvxo(int ), (int)111);
                            continue block27;
                        }
                        case 155294600: {
                            v9 = gu.cvwa("cwlw", cvxo(int ), (int)112);
                            continue block27;
                        }
                    }
                    break;
                }
                this.requestedGrief = (int)v7;
                if (var1_3) ** GOTO lbl31
                if (var3_1) {
                    throw null;
                }
                break block36;
            }
            if (var1_3 || var1_3) ** GOTO lbl31
            v10 = gu.cvwa("cwlx", cvvt(int ), (int)198);
            v11 /* !! */  = gu.go;
            if (true) ** GOTO lbl88
            block28: while (true) {
                v11 /* !! */  = (long)(v12 - gu.cvwa("cwly", cvxo(int ), (int)113));
lbl88:
                // 2 sources

                switch ((int)v11 /* !! */ ) {
                    case -1855170120: {
                        break block28;
                    }
                    case -1386638421: {
                        v12 = gu.cvwa("cwlz", cvxo(int ), (int)114);
                        continue block28;
                    }
                    case -324161248: {
                        v12 = gu.cvwa("cwma", cvxo(int ), (int)115);
                        continue block28;
                    }
                }
                break;
            }
            this.setState((boolean)v10);
            if (var1_3) ** GOTO lbl31
        }
        if (!var1_3 && !var1_3) ** break;
        ** while (true)
    }

    private static /* synthetic */ void cxsp() {
        gu.cvxp[100] = 5702767691630245259L;
        gu.cvxp[101] = -161906713545256950L;
        gu.cvxp[102] = 5534390393496667634L;
        gu.cvxp[103] = 2963441450113028725L;
        gu.cvxp[104] = 6116585478428010208L;
        gu.cvxp[105] = -218318596118016701L;
        gu.cvxp[106] = -2760483129783970516L;
        gu.cvxp[107] = -2185850507302746834L;
        gu.cvxp[108] = 3756233493330811487L;
        gu.cvxp[109] = -1196584358488451276L;
        gu.cvxp[110] = 8022906288575134863L;
        gu.cvxp[111] = 4629887605731936869L;
        gu.cvxp[112] = 8074318424355642438L;
        gu.cvxp[113] = -8084285372488944190L;
        gu.cvxp[114] = -4422639633393801138L;
        gu.cvxp[115] = -237394171075221632L;
        gu.cvxp[116] = -8019559876070434680L;
        gu.cvxp[117] = 5911349718920065596L;
        gu.cvxp[118] = 802882558677762592L;
        gu.cvxp[119] = -1155661345432627008L;
        gu.cvxp[120] = 5831543483214056793L;
        gu.cvxp[121] = -2179962294494873124L;
        gu.cvxp[122] = 4490277210111161189L;
        gu.cvxp[123] = -1026499063917090754L;
        gu.cvxp[124] = -5189743329341827646L;
        gu.cvxp[125] = -8664794865162622790L;
        gu.cvxp[126] = 4921114550091845898L;
        gu.cvxp[127] = 1103939254218763970L;
        gu.cvxp[128] = 7048238998040397201L;
        gu.cvxp[129] = -7245310525362962521L;
        gu.cvxp[130] = 8430278410237705099L;
        gu.cvxp[131] = 1230686085445893472L;
        gu.cvxp[132] = 7809336008631263895L;
        gu.cvxp[133] = -6017927019106319290L;
        gu.cvxp[134] = 1969114804853885297L;
        gu.cvxp[135] = -4739281098108004985L;
        gu.cvxp[136] = -5248697527940574097L;
        gu.cvxp[137] = 7991099435945617105L;
        gu.cvxp[138] = 7400412849379621993L;
        gu.cvxp[139] = 3323240978138056325L;
        gu.cvxp[140] = -5727771917150551302L;
        gu.cvxp[141] = -3892624387239511603L;
        gu.cvxp[142] = -4630364904038464969L;
        gu.cvxp[143] = -2210755390961900421L;
        gu.cvxp[144] = 6798753167909788131L;
        gu.cvxp[145] = 3770717404779405170L;
        gu.cvxp[146] = -6957053132381519114L;
        gu.cvxp[147] = 4554095533954271386L;
        gu.cvxp[148] = 2401857432337052184L;
        gu.cvxp[149] = 5557635155520188091L;
        gu.cvxp[150] = -5760867564294331058L;
        gu.cvxp[151] = -3675700686827807574L;
        gu.cvxp[152] = -2909797945668784016L;
        gu.cvxp[153] = 6618353991418078830L;
        gu.cvxp[154] = 8389263677113220623L;
        gu.cvxp[155] = -8331812176463759353L;
        gu.cvxp[156] = -9051024692223592430L;
        gu.cvxp[157] = 1106826369334654890L;
        gu.cvxp[158] = -530675127869250824L;
        gu.cvxp[159] = -8995444152153959842L;
        gu.cvxp[160] = 4404327120166272412L;
        gu.cvxp[161] = 9139476236525131923L;
        gu.cvxp[162] = 3315169555927049297L;
        gu.cvxp[163] = 7621820223089103440L;
        gu.cvxp[164] = 1119312040698228197L;
        gu.cvxp[165] = -6414005823370473701L;
        gu.cvxp[166] = -5874633213471438183L;
        gu.cvxp[167] = -3346362649482952869L;
        gu.cvxp[168] = 6076960749419254857L;
        gu.cvxp[169] = -3514173958817739007L;
        gu.cvxp[170] = -6278885119790442875L;
        gu.cvxp[171] = -2798602744352272068L;
        gu.cvxp[172] = 1020792292907541786L;
        gu.cvxp[173] = 702301578672111441L;
        gu.cvxp[174] = 2587161220693201637L;
        gu.cvxp[175] = 8292730979301936719L;
        gu.cvxp[176] = 7311202440673050840L;
        gu.cvxp[177] = 5792007109704399338L;
        gu.cvxp[178] = -1212540807746182409L;
        gu.cvxp[179] = -8467114605806619807L;
        gu.cvxp[180] = -7094154946349256779L;
        gu.cvxp[181] = -8893375268002880716L;
        gu.cvxp[182] = 4882610004416375967L;
        gu.cvxp[183] = 4682243110757230336L;
        gu.cvxp[184] = 5640355083907662434L;
        gu.cvxp[185] = 2663878880401943293L;
        gu.cvxp[186] = 1583123036457045625L;
        gu.cvxp[187] = -5075859764784506787L;
        gu.cvxp[188] = -3180625796049822071L;
        gu.cvxp[189] = -183841810430921979L;
        gu.cvxp[190] = -34986796523708891L;
        gu.cvxp[191] = -8522730447233766264L;
        gu.cvxp[192] = -791040486172322690L;
        gu.cvxp[193] = 4601753584003371745L;
        gu.cvxp[194] = -2861950923703068782L;
        gu.cvxp[195] = -6867134357652189325L;
        gu.cvxp[196] = -2134700405614087940L;
        gu.cvxp[197] = -4915445578238144923L;
        gu.cvxp[198] = -341593434324629085L;
        gu.cvxp[199] = -6520958527916626228L;
    }

    private static /* synthetic */ void cxsb() {
        gu.cvvv[300] = -1357423794;
        gu.cvvv[301] = -1166567307;
        gu.cvvv[302] = -1056325047;
        gu.cvvv[303] = -100162035;
        gu.cvvv[304] = -1078465928;
        gu.cvvv[305] = 1205788846;
        gu.cvvv[306] = 2009897744;
        gu.cvvv[307] = -1207242684;
        gu.cvvv[308] = -1598354406;
        gu.cvvv[309] = -949780753;
        gu.cvvv[310] = -1377194940;
        gu.cvvv[311] = -1829414300;
        gu.cvvv[312] = -880112277;
        gu.cvvv[313] = 1815904942;
        gu.cvvv[314] = -524939612;
        gu.cvvv[315] = 526538965;
        gu.cvvv[316] = -1949486804;
        gu.cvvv[317] = -1162387047;
        gu.cvvv[318] = -333678091;
        gu.cvvv[319] = -1525760817;
        gu.cvvv[320] = -998914351;
        gu.cvvv[321] = -1447184004;
        gu.cvvv[322] = -675951975;
        gu.cvvv[323] = 524892139;
        gu.cvvv[324] = -716444763;
        gu.cvvv[325] = -1816957538;
        gu.cvvv[326] = -1315128652;
        gu.cvvv[327] = -1948494228;
        gu.cvvv[328] = 1592141397;
        gu.cvvv[329] = -487352784;
        gu.cvvv[330] = -1965611458;
        gu.cvvv[331] = -290015863;
        gu.cvvv[332] = -1249518468;
        gu.cvvv[333] = 1937149036;
        gu.cvvv[334] = -173253277;
        gu.cvvv[335] = -68722712;
        gu.cvvv[336] = 555815770;
        gu.cvvv[337] = -1936053962;
        gu.cvvv[338] = 683959700;
        gu.cvvv[339] = -995127421;
        gu.cvvv[340] = -769543332;
        gu.cvvv[341] = 1418855883;
        gu.cvvv[342] = -241563386;
        gu.cvvv[343] = 1955745534;
        gu.cvvv[344] = 1783641332;
        gu.cvvv[345] = -1786986655;
        gu.cvvv[346] = 385955677;
        gu.cvvv[347] = -1791143223;
        gu.cvvv[348] = 19614860;
        gu.cvvv[349] = -1509800724;
        gu.cvvv[350] = 359622063;
        gu.cvvv[351] = 1475918421;
        gu.cvvv[352] = -990678619;
        gu.cvvv[353] = -1290047492;
        gu.cvvv[354] = 526052684;
        gu.cvvv[355] = -301886582;
        gu.cvvv[356] = 650791551;
        gu.cvvv[357] = -1411158389;
        gu.cvvv[358] = 1742834362;
        gu.cvvv[359] = -787658231;
        gu.cvvv[360] = 2108904499;
        gu.cvvv[361] = 525844883;
        gu.cvvv[362] = -197818393;
        gu.cvvv[363] = 812803462;
        gu.cvvv[364] = 1799644102;
        gu.cvvv[365] = -286010952;
        gu.cvvv[366] = 877932585;
        gu.cvvv[367] = 1481979855;
        gu.cvvv[368] = 313115029;
        gu.cvvv[369] = -1939775122;
        gu.cvvv[370] = 478122180;
        gu.cvvv[371] = -1929550725;
        gu.cvvv[372] = 2022376917;
        gu.cvvv[373] = -867737537;
        gu.cvvv[374] = 1109439289;
        gu.cvvv[375] = 1466130286;
        gu.cvvv[376] = -1785003954;
        gu.cvvv[377] = 819257972;
        gu.cvvv[378] = -413743846;
        gu.cvvv[379] = -548189225;
        gu.cvvv[380] = -949076324;
        gu.cvvv[381] = -197247536;
        gu.cvvv[382] = -339024052;
        gu.cvvv[383] = -1921720729;
        gu.cvvv[384] = 819531239;
        gu.cvvv[385] = 1514051212;
        gu.cvvv[386] = 1051168761;
        gu.cvvv[387] = -1839325036;
        gu.cvvv[388] = 768540136;
        gu.cvvv[389] = -1206887754;
        gu.cvvv[390] = -670189088;
        gu.cvvv[391] = 30492255;
        gu.cvvv[392] = 2076919780;
        gu.cvvv[393] = -931958279;
        gu.cvvv[394] = 256988074;
        gu.cvvv[395] = 1084483853;
        gu.cvvv[396] = -261447002;
        gu.cvvv[397] = -578804911;
        gu.cvvv[398] = -1444306271;
        gu.cvvv[399] = -2100274040;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private int findSlotByName(class_1703 var1_1, String var2_2) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = gu.go - gu.cvwa("cxjc", cvxo(int ), (int)290)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == gu.cvwa("cxjd", cvvt(int ), (int)623)) break;
            v0 /* !! */  = (long)gu.cvwa("cxje", cvvt(int ), (int)624);
        }
        var7_3 = gu.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = gu.go - gu.cvwa("cxjf", cvxo(int ), (int)291)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == gu.cvwa("cxjg", cvvt(int ), (int)625)) break;
            v1 /* !! */  = (long)gu.cvwa("cxjh", cvvt(int ), (int)626);
        }
        var6_4 /* !! */  = gu.b;
        v2 /* !! */  = gu.go;
        if (true) ** GOTO lbl17
        block58: while (true) {
            v2 /* !! */  = (long)(gu.cvwa("cxjj", cvxo(int ), (int)293) - gu.cvwa("cxji", cvxo(int ), (int)292));
lbl17:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1855170120: {
                    break block58;
                }
                case 1282257665: {
                    continue block58;
                }
            }
            break;
        }
        var5_5 = gu.a;
        if (var7_3) {
            throw null;
lbl25:
            // 10 sources

            return (int)gu.cvwa("cxjk", cvvt(int ), (int)627);
        }
        if (var5_5 || var5_5) ** GOTO lbl25
        var3_6 = gu.cvwa("cxjl", cvvt(int ), (int)628);
        if (var5_5) ** GOTO lbl25
        block60: while (true) {
            if (var5_5 || var5_5) ** GOTO lbl25
            while (true) {
                if ((v3 /* !! */  = (cfr_temp_2 = gu.go - gu.cvwa("cxjm", cvxo(int ), (int)294)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v3 /* !! */  == gu.cvwa("cxjn", cvvt(int ), (int)629)) break;
                v3 /* !! */  = (long)gu.cvwa("cxjo", cvvt(int ), (int)630);
            }
            v4 = var1_1.field_7761;
            v5 /* !! */  = gu.go;
            if (true) ** GOTO lbl42
            block62: while (true) {
                v5 /* !! */  = (long)(v6 - gu.cvwa("cxjp", cvxo(int ), (int)295));
lbl42:
                // 2 sources

                switch ((int)v5 /* !! */ ) {
                    case -1855170120: {
                        break block62;
                    }
                    case -1167501707: {
                        v6 = gu.cvwa("cxjq", cvxo(int ), (int)296);
                        continue block62;
                    }
                    case 27557030: {
                        v6 = gu.cvwa("cxjr", cvxo(int ), (int)297);
                        continue block62;
                    }
                }
                break;
            }
            if (var3_6 >= v4.size()) ** GOTO lbl151
            if (var5_5 || var5_5) ** GOTO lbl25
            v7 /* !! */  = gu.go;
            if (true) ** GOTO lbl57
            block63: while (true) {
                v7 /* !! */  = (long)(v8 - gu.cvwa("cxjs", cvxo(int ), (int)298));
lbl57:
                // 2 sources

                switch ((int)v7 /* !! */ ) {
                    case -2007872390: {
                        v8 = gu.cvwa("cxjt", cvxo(int ), (int)299);
                        continue block63;
                    }
                    case -1855170120: {
                        break block63;
                    }
                    case -163963222: {
                        v8 = gu.cvwa("cxju", cvxo(int ), (int)300);
                        continue block63;
                    }
                    case 1611457453: {
                        v8 = gu.cvwa("cxjv", cvxo(int ), (int)301);
                        continue block63;
                    }
                }
                break;
            }
            v9 = var1_1.field_7761;
            v10 /* !! */  = gu.go;
            if (true) ** GOTO lbl74
            block64: while (true) {
                v10 /* !! */  = (long)(gu.cvwa("cxjx", cvxo(int ), (int)303) - gu.cvwa("cxjw", cvxo(int ), (int)302));
lbl74:
                // 2 sources

                switch ((int)v10 /* !! */ ) {
                    case -1855170120: {
                        break block64;
                    }
                    case 127154353: {
                        continue block64;
                    }
                }
                break;
            }
            var4_7 = (class_1735)v9.get((int)var3_6);
            if (var5_5 || var5_5) ** GOTO lbl25
            v11 /* !! */  = gu.go;
            if (true) ** GOTO lbl85
            block65: while (true) {
                v11 /* !! */  = (long)(v12 - gu.cvwa("cxjy", cvxo(int ), (int)304));
lbl85:
                // 2 sources

                switch ((int)v11 /* !! */ ) {
                    case -1855170120: {
                        break block65;
                    }
                    case -281829812: {
                        v12 = gu.cvwa("cxjz", cvxo(int ), (int)305);
                        continue block65;
                    }
                    case 473323499: {
                        v12 = gu.cvwa("cxka", cvxo(int ), (int)306);
                        continue block65;
                    }
                    case 1261960679: {
                        v12 = gu.cvwa("cxkb", cvxo(int ), (int)307);
                        continue block65;
                    }
                }
                break;
            }
            v13 = var4_7.method_7677();
            while (true) {
                if ((v14 /* !! */  = (cfr_temp_3 = gu.go - gu.cvwa("cxkc", cvxo(int ), (int)308)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v14 /* !! */  == gu.cvwa("cxkd", cvvt(int ), (int)631)) break;
                v14 /* !! */  = (long)gu.cvwa("cxke", cvvt(int ), (int)632);
            }
            if (v13.method_7960()) ** GOTO lbl146
            if (var5_5) ** GOTO lbl25
            while (true) {
                if ((v15 /* !! */  = (cfr_temp_4 = gu.go - gu.cvwa("cxkf", cvxo(int ), (int)309)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                if (v15 /* !! */  == gu.cvwa("cxkg", cvvt(int ), (int)633)) break;
                v15 /* !! */  = (long)gu.cvwa("cxkh", cvvt(int ), (int)634);
            }
            v16 = var4_7.method_7677();
            while (true) {
                if ((v17 /* !! */  = (cfr_temp_5 = gu.go - gu.cvwa("cxki", cvxo(int ), (int)310)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                if (v17 /* !! */  == gu.cvwa("cxkj", cvvt(int ), (int)635)) break;
                v17 /* !! */  = (long)gu.cvwa("cxkk", cvvt(int ), (int)636);
            }
            v18 = v16.method_7964();
            v19 /* !! */  = gu.go;
            if (true) ** GOTO lbl121
            block69: while (true) {
                v19 /* !! */  = (long)(gu.cvwa("cxkm", cvxo(int ), (int)312) - gu.cvwa("cxkl", cvxo(int ), (int)311));
lbl121:
                // 2 sources

                switch ((int)v19 /* !! */ ) {
                    case -1855170120: {
                        break block69;
                    }
                    case 547278428: {
                        continue block69;
                    }
                }
                break;
            }
            v20 = v18.getString();
            v21 /* !! */  = gu.go;
            if (true) ** GOTO lbl131
            block70: while (true) {
                v21 /* !! */  = (long)(v22 - gu.cvwa("cxkn", cvxo(int ), (int)313));
lbl131:
                // 2 sources

                switch ((int)v21 /* !! */ ) {
                    case -1855170120: {
                        break block70;
                    }
                    case -979416549: {
                        v22 = gu.cvwa("cxko", cvxo(int ), (int)314);
                        continue block70;
                    }
                    case -814772848: {
                        v22 = gu.cvwa("cxkp", cvxo(int ), (int)315);
                        continue block70;
                    }
                }
                break;
            }
            if (!v20.contains(var2_2)) ** GOTO lbl146
            if (var5_5 || var5_5) ** GOTO lbl25
            if (var6_4 /* !! */  == 0) ** GOTO lbl-1000
            switch (var6_4 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return (int)var3_6;
                }
lbl146:
                // 2 sources

                if (var5_5 || var5_5) ** GOTO lbl25
                ++var3_6;
                if (var5_5) ** GOTO lbl25
                if (!var7_3) continue block60;
                throw null;
lbl151:
                // 1 sources

                if (!var5_5 && !var5_5) ** break;
                ** continue;
                return (int)gu.cvwa("cxkq", cvvt(int ), (int)637);
                case 0: {
                    var6_4 /* !! */  = (int)gu.cvwa("cxkr", cvvt(int ), (int)638);
                    if (var7_3) {
                        throw null;
                    }
                    ** GOTO lbl233
                }
lbl159:
                // 3 sources

                case 1: {
                    var6_4 /* !! */  = (int)gu.cvwa("cxks", cvvt(int ), (int)639);
                    if (var7_3) {
                        throw null;
                    }
                    ** GOTO lbl220
                }
lbl164:
                // 2 sources

                case 2: {
                    var6_4 /* !! */  = (int)gu.cvwa("cxkt", cvvt(int ), (int)640);
                    if (!var7_3) ** GOTO lbl159
                    throw null;
                }
lbl168:
                // 2 sources

                case 3: {
                    var6_4 /* !! */  = (int)gu.cvwa("cxku", cvvt(int ), (int)641);
                    if (var7_3) {
                        throw null;
                    }
                    ** GOTO lbl186
                }
lbl173:
                // 4 sources

                case 4: {
                    var6_4 /* !! */  = (int)gu.cvwa("cxkv", cvvt(int ), (int)642);
                    if (var7_3) {
                        throw null;
                    }
                    ** GOTO lbl212
                }
                case 5: {
                    var6_4 /* !! */  = (int)gu.cvwa("cxkw", cvvt(int ), (int)643);
                    if (!var7_3) ** GOTO lbl168
                    throw null;
                }
                case 6: {
                    var6_4 /* !! */  = (int)gu.cvwa("cxkx", cvvt(int ), (int)644);
                    if (!var7_3) ** GOTO lbl173
                    throw null;
                }
lbl186:
                // 3 sources

                case 7: {
                    var6_4 /* !! */  = (int)gu.cvwa("cxky", cvvt(int ), (int)645);
                    if (!var7_3) ** GOTO lbl173
                    throw null;
                }
lbl190:
                // 2 sources

                case 8: {
                    var6_4 /* !! */  = (int)gu.cvwa("cxkz", cvvt(int ), (int)646);
                    if (var7_3) {
                        throw null;
                    }
                    ** GOTO lbl220
                }
lbl195:
                // 3 sources

                case 9: {
                    var6_4 /* !! */  = (int)gu.cvwa("cxla", cvvt(int ), (int)647);
                    if (var7_3) {
                        throw null;
                    }
                    ** GOTO lbl212
                }
                case 10: {
                    var6_4 /* !! */  = (int)gu.cvwa("cxlb", cvvt(int ), (int)648);
                    if (!var7_3) ** GOTO lbl186
                    throw null;
                }
                case 11: {
                    var6_4 /* !! */  = (int)gu.cvwa("cxlc", cvvt(int ), (int)649);
                    if (!var7_3) ** GOTO lbl195
                    throw null;
                }
                case 12: {
                    var6_4 /* !! */  = (int)gu.cvwa("cxld", cvvt(int ), (int)650);
                    if (!var7_3) ** GOTO lbl190
                    throw null;
                }
lbl212:
                // 3 sources

                case 13: {
                    var6_4 /* !! */  = (int)gu.cvwa("cxle", cvvt(int ), (int)651);
                    if (!var7_3) ** GOTO lbl159
                    throw null;
                }
                case 14: {
                    var6_4 /* !! */  = (int)gu.cvwa("cxlf", cvvt(int ), (int)652);
                    if (!var7_3) ** GOTO lbl164
                    throw null;
                }
lbl220:
                // 3 sources

                case 15: {
                    var6_4 /* !! */  = (int)gu.cvwa("cxlg", cvvt(int ), (int)653);
                    if (!var7_3) ** GOTO lbl173
                    throw null;
                }
                case 16: {
                    do {
                        var6_4 /* !! */  = (int)gu.cvwa("cxlh", cvvt(int ), (int)654);
                    } while (!var7_3);
                    throw null;
                }
                case 17: {
                    var6_4 /* !! */  = (int)gu.cvwa("cxli", cvvt(int ), (int)655);
                    if (!var7_3) break block60;
                    throw null;
                }
lbl233:
                // 2 sources

                case 18: {
                    var6_4 /* !! */  = (int)gu.cvwa("cxlj", cvvt(int ), (int)656);
                    if (!var7_3) ** GOTO lbl195
                    throw null;
                }
                case 19: 
            }
            break;
        }
        do {
            var6_4 /* !! */  = (int)gu.cvwa("cxlk", cvvt(int ), (int)657);
        } while (!var7_3);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void beginJoining(int var1_1) {
        v0 /* !! */  = gu.go;
        if (true) ** GOTO lbl5
        block65: while (true) {
            v0 /* !! */  = (long)(v1 - gu.cvwa("cwqf", cvxo(int ), (int)154));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1855170120: {
                    break block65;
                }
                case -1426461673: {
                    v1 = gu.cvwa("cwqg", cvxo(int ), (int)155);
                    continue block65;
                }
                case 672615260: {
                    v1 = gu.cvwa("cwqh", cvxo(int ), (int)156);
                    continue block65;
                }
                case 1524071389: {
                    v1 = gu.cvwa("cwqi", cvxo(int ), (int)157);
                    continue block65;
                }
            }
            break;
        }
        var4_2 = gu.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = gu.go - gu.cvwa("cwqj", cvxo(int ), (int)158)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == gu.cvwa("cwqk", cvvt(int ), (int)269)) break;
            v2 /* !! */  = (long)gu.cvwa("cwql", cvvt(int ), (int)270);
        }
        var3_3 /* !! */  = gu.b;
        v3 /* !! */  = gu.go;
        if (true) ** GOTO lbl28
        block67: while (true) {
            v3 /* !! */  = (long)(v4 - gu.cvwa("cwqm", cvxo(int ), (int)159));
lbl28:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1855170120: {
                    break block67;
                }
                case -436439474: {
                    v4 = gu.cvwa("cwqn", cvxo(int ), (int)160);
                    continue block67;
                }
                case 1000358326: {
                    v4 = gu.cvwa("cwqo", cvxo(int ), (int)161);
                    continue block67;
                }
            }
            break;
        }
        var2_4 = gu.a;
        if (var4_2) {
            throw null;
lbl40:
            // 11 sources

            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl40
        v5 /* !! */  = gu.go;
        if (true) ** GOTO lbl47
        block69: while (true) {
            v5 /* !! */  = (long)(v6 - gu.cvwa("cwqp", cvxo(int ), (int)162));
lbl47:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -1855170120: {
                    break block69;
                }
                case -378315372: {
                    v6 = gu.cvwa("cwqq", cvxo(int ), (int)163);
                    continue block69;
                }
                case 871625240: {
                    v6 = gu.cvwa("cwqr", cvxo(int ), (int)164);
                    continue block69;
                }
                case 1661798850: {
                    v6 = gu.cvwa("cwqs", cvxo(int ), (int)165);
                    continue block69;
                }
            }
            break;
        }
        this.restoreCompassSlot();
        if (var2_4 || var2_4) ** GOTO lbl40
        v7 = gu.cvwa("cwqt", cvvt(int ), (int)271);
        v8 /* !! */  = gu.go;
        if (true) ** GOTO lbl66
        block70: while (true) {
            v8 /* !! */  = (long)(v9 - gu.cvwa("cwqu", cvxo(int ), (int)166));
lbl66:
            // 2 sources

            switch ((int)v8 /* !! */ ) {
                case -1855170120: {
                    break block70;
                }
                case 101776498: {
                    v9 = gu.cvwa("cwqv", cvxo(int ), (int)167);
                    continue block70;
                }
                case 105525850: {
                    v9 = gu.cvwa("cwqw", cvxo(int ), (int)168);
                    continue block70;
                }
                case 568852689: {
                    v9 = gu.cvwa("cwqx", cvxo(int ), (int)169);
                    continue block70;
                }
            }
            break;
        }
        this.compassStage = (int)v7;
        if (var2_4 || var2_4) ** GOTO lbl40
        v10 = gu.cvwa("cwqy", cvvt(int ), (int)272);
        while (true) {
            if ((v11 /* !! */  = (cfr_temp_1 = gu.go - gu.cvwa("cwqz", cvxo(int ), (int)170)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v11 /* !! */  == gu.cvwa("cwra", cvvt(int ), (int)273)) break;
            v11 /* !! */  = (long)gu.cvwa("cwrb", cvvt(int ), (int)274);
        }
        this.joining = v10;
        if (var2_4 || var2_4) ** GOTO lbl40
        v12 = gu.cvwa("cwrc", cvvt(int ), (int)275);
        while (true) {
            if ((v13 /* !! */  = (cfr_temp_2 = gu.go - gu.cvwa("cwrd", cvxo(int ), (int)171)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v13 /* !! */  == gu.cvwa("cwre", cvvt(int ), (int)276)) break;
            v13 /* !! */  = (long)gu.cvwa("cwrf", cvvt(int ), (int)277);
        }
        this.pageSwitches = (int)v12;
        if (var2_4 || var2_4) ** GOTO lbl40
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v14 = gu.cvwa("cwrg", cvvt(int ), (int)278);
                while (true) {
                    if ((v15 /* !! */  = (cfr_temp_3 = gu.go - gu.cvwa("cwrh", cvxo(int ), (int)172)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v15 /* !! */  == gu.cvwa("cwri", cvvt(int ), (int)279)) break;
                    v15 /* !! */  = (long)gu.cvwa("cwrj", cvvt(int ), (int)280);
                }
                this.lockedTargetSlot = (int)v14;
                if (var2_4 || var2_4) ** GOTO lbl40
                v16 = gu.cvwa("cwrk", cvxo(int ), (int)173);
                while (true) {
                    if ((v17 /* !! */  = (cfr_temp_4 = gu.go - gu.cvwa("cwrl", cvxo(int ), (int)174)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v17 /* !! */  == gu.cvwa("cwrm", cvvt(int ), (int)281)) break;
                    v17 /* !! */  = (long)gu.cvwa("cwrn", cvvt(int ), (int)282);
                }
                this.targetClickedAt = (long)v16;
                if (var2_4 || var2_4) ** GOTO lbl40
                v18 /* !! */  = gu.go;
                if (true) ** GOTO lbl119
                block75: while (true) {
                    v18 /* !! */  = (long)(v19 - gu.cvwa("cwro", cvxo(int ), (int)175));
lbl119:
                    // 2 sources

                    switch ((int)v18 /* !! */ ) {
                        case -1855170120: {
                            break block75;
                        }
                        case -1568757834: {
                            v19 = gu.cvwa("cwrp", cvxo(int ), (int)176);
                            continue block75;
                        }
                        case -764553886: {
                            v19 = gu.cvwa("cwrq", cvxo(int ), (int)177);
                            continue block75;
                        }
                    }
                    break;
                }
                this.targetGrief = var1_1;
                if (var2_4 || var2_4) ** GOTO lbl40
                while (true) {
                    if ((v20 /* !! */  = (cfr_temp_5 = gu.go - gu.cvwa("cwrr", cvxo(int ), (int)178)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v20 /* !! */  == gu.cvwa("cwrs", cvvt(int ), (int)283)) break;
                    v20 /* !! */  = (long)gu.cvwa("cwrt", cvvt(int ), (int)284);
                }
                while (true) {
                    if ((v21 /* !! */  = (cfr_temp_6 = gu.go - gu.cvwa("cwru", cvxo(int ), (int)179)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v21 /* !! */  == gu.cvwa("cwrv", cvvt(int ), (int)285)) break;
                    v21 /* !! */  = (long)gu.cvwa("cwrw", cvvt(int ), (int)286);
                }
                this.clickTimer.reset();
                if (var2_4 || var2_4) ** GOTO lbl40
                v22 /* !! */  = gu.go;
                if (true) ** GOTO lbl146
                block78: while (true) {
                    v22 /* !! */  = (long)(v23 - gu.cvwa("cwrx", cvxo(int ), (int)180));
lbl146:
                    // 2 sources

                    switch ((int)v22 /* !! */ ) {
                        case -1855170120: {
                            break block78;
                        }
                        case -417242569: {
                            v23 = gu.cvwa("cwry", cvxo(int ), (int)181);
                            continue block78;
                        }
                        case 521311066: {
                            v23 = gu.cvwa("cwrz", cvxo(int ), (int)182);
                            continue block78;
                        }
                        case 1483501415: {
                            v23 = gu.cvwa("cwsa", cvxo(int ), (int)183);
                            continue block78;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v24 /* !! */  = (cfr_temp_7 = gu.go - gu.cvwa("cwsb", cvxo(int ), (int)184)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v24 /* !! */  == gu.cvwa("cwsc", cvvt(int ), (int)287)) break;
                    v24 /* !! */  = (long)gu.cvwa("cwsd", cvvt(int ), (int)288);
                }
                this.compassTimer.reset();
                if (var2_4 || var2_4) ** GOTO lbl40
                v25 /* !! */  = gu.go;
                if (true) ** GOTO lbl169
                block80: while (true) {
                    v25 /* !! */  = (long)(v26 - gu.cvwa("cwse", cvxo(int ), (int)185));
lbl169:
                    // 2 sources

                    switch ((int)v25 /* !! */ ) {
                        case -1855170120: {
                            break block80;
                        }
                        case -1454151008: {
                            v26 = gu.cvwa("cwsf", cvxo(int ), (int)186);
                            continue block80;
                        }
                        case 603839751: {
                            v26 = gu.cvwa("cwsg", cvxo(int ), (int)187);
                            continue block80;
                        }
                    }
                    break;
                }
                this.useCompass();
                if (var2_4 || var2_4) ** continue;
                return;
            }
            case 0: {
                var3_3 /* !! */  = (int)gu.cvwa("cwsh", cvvt(int ), (int)289);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl206
            }
lbl186:
            // 2 sources

            case 1: {
                var3_3 /* !! */  = (int)gu.cvwa("cwsi", cvvt(int ), (int)290);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl264
            }
lbl191:
            // 2 sources

            case 2: {
                var3_3 /* !! */  = (int)gu.cvwa("cwsj", cvvt(int ), (int)291);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl219
            }
lbl196:
            // 3 sources

            case 3: {
                var3_3 /* !! */  = (int)gu.cvwa("cwsk", cvvt(int ), (int)292);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl241
            }
            case 4: {
                var3_3 /* !! */  = (int)gu.cvwa("cwsl", cvvt(int ), (int)293);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl241
            }
lbl206:
            // 3 sources

            case 5: {
                var3_3 /* !! */  = (int)gu.cvwa("cwsm", cvvt(int ), (int)294);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl268
            }
            case 6: {
                var3_3 /* !! */  = (int)gu.cvwa("cwsn", cvvt(int ), (int)295);
                if (!var4_2) ** GOTO lbl206
                throw null;
            }
            case 7: {
                var3_3 /* !! */  = (int)gu.cvwa("cwso", cvvt(int ), (int)296);
                if (!var4_2) ** GOTO lbl191
                throw null;
            }
lbl219:
            // 2 sources

            case 8: {
                var3_3 /* !! */  = (int)gu.cvwa("cwsp", cvvt(int ), (int)297);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl264
            }
            case 9: {
                var3_3 /* !! */  = (int)gu.cvwa("cwsq", cvvt(int ), (int)298);
                if (!var4_2) ** GOTO lbl186
                throw null;
            }
            case 10: {
                var3_3 /* !! */  = (int)gu.cvwa("cwsr", cvvt(int ), (int)299);
                if (!var4_2) break;
                throw null;
            }
lbl232:
            // 4 sources

            case 11: {
                var3_3 /* !! */  = (int)gu.cvwa("cwss", cvvt(int ), (int)300);
                if (var4_2) {
                    throw null;
                }
            }
            case 12: {
                var3_3 /* !! */  = (int)gu.cvwa("cwst", cvvt(int ), (int)301);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl276
            }
lbl241:
            // 3 sources

            case 13: {
                do {
                    var3_3 /* !! */  = (int)gu.cvwa("cwsu", cvvt(int ), (int)302);
                } while (!var4_2);
                throw null;
            }
            case 14: {
                var3_3 /* !! */  = (int)gu.cvwa("cwsv", cvvt(int ), (int)303);
                if (var4_2) {
                    throw null;
                }
            }
            case 15: {
                var3_3 /* !! */  = (int)gu.cvwa("cwsw", cvvt(int ), (int)304);
                if (!var4_2) ** GOTO lbl196
                throw null;
            }
            case 16: {
                var3_3 /* !! */  = (int)gu.cvwa("cwsx", cvvt(int ), (int)305);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl272
            }
            case 17: {
                do {
                    var3_3 /* !! */  = (int)gu.cvwa("cwsy", cvvt(int ), (int)306);
                } while (!var4_2);
                throw null;
            }
lbl264:
            // 3 sources

            case 18: {
                var3_3 /* !! */  = (int)gu.cvwa("cwsz", cvvt(int ), (int)307);
                if (!var4_2) ** GOTO lbl232
                throw null;
            }
lbl268:
            // 2 sources

            case 19: {
                var3_3 /* !! */  = (int)gu.cvwa("cwta", cvvt(int ), (int)308);
                if (!var4_2) ** GOTO lbl232
                throw null;
            }
lbl272:
            // 2 sources

            case 20: {
                var3_3 /* !! */  = (int)gu.cvwa("cwtb", cvvt(int ), (int)309);
                if (!var4_2) ** GOTO lbl196
                throw null;
            }
lbl276:
            // 2 sources

            case 21: {
                var3_3 /* !! */  = (int)gu.cvwa("cwtc", cvvt(int ), (int)310);
                if (var4_2) {
                    throw null;
                }
            }
            case 22: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)gu.cvwa("cwtd", cvvt(int ), (int)311);
                    if (!var4_2) ** GOTO lbl232
                    throw null;
                }
            }
            case 23: 
        }
        var3_3 /* !! */  = (int)gu.cvwa("cwte", cvvt(int ), (int)312);
        ** while (!var4_2)
lbl288:
        // 1 sources

        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public gu() {
        int n2 = b;
        super("RwJoiner", "\u0410\u0432\u0442\u043e\u043c\u0430\u0442\u0438\u0447\u0435\u0441\u043a\u0438 \u0437\u0430\u0445\u043e\u0434\u0438\u0442 \u043d\u0430 \u0432\u044b\u0431\u0440\u0430\u043d\u043d\u044b\u0439 \u0433\u0440\u0438\u0444 ReallyWorld", du.PLAYER);
        this.serverMode = new kf("\u0420\u0435\u0436\u0438\u043c", "\u0421\u0435\u0440\u0432\u0435\u0440 \u0434\u043b\u044f \u0430\u0432\u0442\u043e\u0432\u0445\u043e\u0434\u0430", "ReallyWorld", "ReallyWorld");
        this.grief = new kg("\u0413\u0440\u0438\u0444\u0435\u0440\u0441\u043a\u0438\u0439 \u043c\u0438\u0440", "\u041d\u043e\u043c\u0435\u0440 \u0433\u0440\u0438\u0444\u0430", 1.0f).range((int)gu.cvwa("cvwd", cvvt(int ), (int)0), (int)gu.cvwa("cvwe", cvvt(int ), (int)1));
        this.speed = new kg("\u0421\u043a\u043e\u0440\u043e\u0441\u0442\u044c", "\u0417\u0430\u0434\u0435\u0440\u0436\u043a\u0430 \u043c\u0435\u0436\u0434\u0443 \u043a\u043b\u0438\u043a\u0430\u043c\u0438", (float)gu.cvwa("cvwg", cvwf(int ), (int)2)).range((int)gu.cvwa("cvwh", cvvt(int ), (int)3), (int)gu.cvwa("cvwi", cvvt(int ), (int)4));
        this.disable = new ka("\u041a\u043d\u043e\u043f\u043a\u0430 \u043e\u0442\u043a\u043b\u044e\u0447\u0435\u043d\u0438\u044f", "\u041e\u0441\u0442\u0430\u043d\u043e\u0432\u0438\u0442\u044c \u0430\u0432\u0442\u043e\u0432\u0445\u043e\u0434");
        this.keepEnabled = new kb("\u041d\u0435 \u0432\u044b\u043a\u043b\u044e\u0447\u0430\u0442\u044c \u043f\u043e\u0441\u043b\u0435 \u0437\u0430\u0445\u043e\u0434\u0430", "\u041e\u0441\u0442\u0430\u0432\u043b\u044f\u0442\u044c RwJoiner \u0432\u043a\u043b\u044e\u0447\u0451\u043d\u043d\u044b\u043c \u043f\u043e\u0441\u043b\u0435 \u0432\u044b\u0431\u043e\u0440\u0430 \u0433\u0440\u0438\u0444\u0430");
        this.clickTimer = new pr();
        this.compassTimer = new pr();
        this.lockedTargetSlot = (int)gu.cvwa("cvwq", cvvt(int ), (int)5);
        this.requestedGrief = (int)gu.cvwa("cvwr", cvvt(int ), (int)6);
        this.compassRestoreSlot = (int)gu.cvwa("cvws", cvvt(int ), (int)7);
        this.settings(this.serverMode, this.grief, this.speed, this.disable, this.keepEnabled);
        if (n2 == 0) return;
        int n3 = Integer.MIN_VALUE;
        block16: do {
            switch (n3 == Integer.MIN_VALUE ? n2 : n3) {
                default: {
                    return;
                }
                case 0: {
                    CallSite callSite = gu.cvwa("cvwt", cvvt(int ), (int)8);
                    n3 = 2;
                    continue block16;
                }
                case 1: {
                    CallSite callSite = gu.cvwa("cvwu", cvvt(int ), (int)9);
                    n3 = 3;
                    continue block16;
                }
                case 5: {
                    CallSite callSite = gu.cvwa("cvwy", cvvt(int ), (int)13);
                    n3 = 4;
                    continue block16;
                }
                case 7: {
                    CallSite callSite = gu.cvwa("cvxb", cvvt(int ), (int)15);
                    n3 = 6;
                    continue block16;
                }
                case 8: {
                    CallSite callSite = gu.cvwa("cvxd", cvvt(int ), (int)16);
                    n3 = 4;
                    continue block16;
                }
                case 9: {
                    CallSite callSite = gu.cvwa("cvxf", cvvt(int ), (int)17);
                }
                case 2: {
                    CallSite callSite = gu.cvwa("cvwv", cvvt(int ), (int)10);
                    n3 = 4;
                    continue block16;
                }
                case 10: {
                    CallSite callSite = gu.cvwa("cvxh", cvvt(int ), (int)18);
                    n3 = 4;
                    continue block16;
                }
                case 11: {
                    CallSite callSite = gu.cvwa("cvxj", cvvt(int ), (int)19);
                    break;
                }
                case 12: {
                    CallSite callSite = gu.cvwa("cvxm", cvvt(int ), (int)20);
                }
                case 3: {
                    CallSite callSite = gu.cvwa("cvww", cvvt(int ), (int)11);
                }
                case 6: {
                    CallSite callSite = gu.cvwa("cvwz", cvvt(int ), (int)14);
                }
                case 4: {
                    CallSite callSite = gu.cvwa("cvwx", cvvt(int ), (int)12);
                    break;
                }
                case 13: 
            }
            break;
        } while (true);
        while (true) {
            CallSite callSite = gu.cvwa("cvxn", cvvt(int ), (int)21);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void deactivate() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = gu.go - gu.cvwa("cwbr", cvxo(int ), (int)27)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == gu.cvwa("cwbs", cvvt(int ), (int)50)) break;
            v0 /* !! */  = (long)gu.cvwa("cwbt", cvvt(int ), (int)51);
        }
        var3_1 = gu.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = gu.go - gu.cvwa("cwbv", cvxo(int ), (int)28)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == gu.cvwa("cwbx", cvvt(int ), (int)52)) break;
            v1 /* !! */  = (long)gu.cvwa("cwbz", cvvt(int ), (int)53);
        }
        var2_2 /* !! */  = gu.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = gu.go - gu.cvwa("cwcb", cvxo(int ), (int)29)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == gu.cvwa("cwcd", cvvt(int ), (int)54)) break;
            v2 /* !! */  = (long)gu.cvwa("cwcf", cvvt(int ), (int)55);
        }
        var1_3 = gu.a;
        if (var3_1) {
            throw null;
lbl24:
            // 3 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl24
        v3 /* !! */  = gu.go;
        if (true) ** GOTO lbl31
        block17: while (true) {
            v3 /* !! */  = (long)(v4 - gu.cvwa("cwcg", cvxo(int ), (int)30));
lbl31:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1855170120: {
                    break block17;
                }
                case -1810532425: {
                    v4 = gu.cvwa("cwch", cvxo(int ), (int)31);
                    continue block17;
                }
                case -526881571: {
                    v4 = gu.cvwa("cwci", cvxo(int ), (int)32);
                    continue block17;
                }
            }
            break;
        }
        this.reset();
        if (var1_3) ** GOTO lbl24
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var1_3) ** break;
                ** continue;
                return;
            }
lbl48:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)gu.cvwa("cwck", cvvt(int ), (int)56);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl57
            }
lbl53:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)gu.cvwa("cwcm", cvvt(int ), (int)57);
                if (!var3_1) ** GOTO lbl48
                throw null;
            }
lbl57:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)gu.cvwa("cwco", cvvt(int ), (int)58);
                if (!var3_1) break;
                throw null;
            }
            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)gu.cvwa("cwcs", cvvt(int ), (int)59);
                    if (!var3_1) ** GOTO lbl53
                    throw null;
                }
            }
            case 4: {
                do {
                    var2_2 /* !! */  = (int)gu.cvwa("cwcu", cvvt(int ), (int)60);
                } while (!var3_1);
                throw null;
            }
            case 5: 
        }
        var2_2 /* !! */  = (int)gu.cvwa("cwcv", cvvt(int ), (int)61);
        ** while (!var3_1)
lbl74:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void completeJoining() {
        block103: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = gu.go - gu.cvwa("cwmq", cvxo(int ), (int)116)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  == gu.cvwa("cwmr", cvvt(int ), (int)214)) break;
                v0 /* !! */  = (long)gu.cvwa("cwms", cvvt(int ), (int)215);
            }
            var3_1 = gu.c;
            v1 /* !! */  = gu.go;
            if (true) ** GOTO lbl11
            block63: while (true) {
                v1 /* !! */  = (long)(v2 - gu.cvwa("cwmt", cvxo(int ), (int)117));
lbl11:
                // 2 sources

                switch ((int)v1 /* !! */ ) {
                    case -1855170120: {
                        break block63;
                    }
                    case -1728120987: {
                        v2 = gu.cvwa("cwmu", cvxo(int ), (int)118);
                        continue block63;
                    }
                    case -1207786932: {
                        v2 = gu.cvwa("cwmv", cvxo(int ), (int)119);
                        continue block63;
                    }
                    case -955331097: {
                        v2 = gu.cvwa("cwmw", cvxo(int ), (int)120);
                        continue block63;
                    }
                }
                break;
            }
            var2_2 /* !! */  = gu.b;
            while (true) {
                if ((v3 /* !! */  = (cfr_temp_1 = gu.go - gu.cvwa("cwmx", cvxo(int ), (int)121)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v3 /* !! */  == gu.cvwa("cwmy", cvvt(int ), (int)216)) break;
                v3 /* !! */  = (long)gu.cvwa("cwmz", cvvt(int ), (int)217);
            }
            var1_3 = gu.a;
            if (var3_1) {
                throw null;
lbl32:
                // 12 sources

                return;
            }
            if (var1_3 || var1_3) ** GOTO lbl32
            while (true) {
                if ((v4 /* !! */  = (cfr_temp_2 = gu.go - gu.cvwa("cwna", cvxo(int ), (int)122)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v4 /* !! */  == gu.cvwa("cwnb", cvvt(int ), (int)218)) break;
                v4 /* !! */  = (long)gu.cvwa("cwnc", cvvt(int ), (int)219);
            }
            if (this.keepEnabledAfterJoin) break block103;
            if (var1_3 || var1_3) ** GOTO lbl32
            v5 = gu.cvwa("cwnd", cvvt(int ), (int)220);
            v6 /* !! */  = gu.go;
            if (true) ** GOTO lbl47
            block67: while (true) {
                v6 /* !! */  = (long)(v7 - gu.cvwa("cwne", cvxo(int ), (int)123));
lbl47:
                // 2 sources

                switch ((int)v6 /* !! */ ) {
                    case -1855170120: {
                        break block67;
                    }
                    case 209831475: {
                        v7 = gu.cvwa("cwnf", cvxo(int ), (int)124);
                        continue block67;
                    }
                    case 1784399379: {
                        v7 = gu.cvwa("cwng", cvxo(int ), (int)125);
                        continue block67;
                    }
                }
                break;
            }
            this.setState((boolean)v5);
            if (var1_3 || var1_3) ** GOTO lbl32
            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl32
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_3 = gu.go - gu.cvwa("cwnh", cvxo(int ), (int)126)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == gu.cvwa("cwni", cvvt(int ), (int)221)) break;
                    v8 /* !! */  = (long)gu.cvwa("cwnj", cvvt(int ), (int)222);
                }
                this.restoreCompassSlot();
                if (var1_3 || var1_3) ** GOTO lbl32
                v9 = gu.cvwa("cwnk", cvvt(int ), (int)223);
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_4 = gu.go - gu.cvwa("cwnl", cvxo(int ), (int)127)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == gu.cvwa("cwnm", cvvt(int ), (int)224)) break;
                    v10 /* !! */  = (long)gu.cvwa("cwnn", cvvt(int ), (int)225);
                }
                this.compassStage = (int)v9;
                if (var1_3 || var1_3) ** GOTO lbl32
                v11 = gu.cvwa("cwno", cvvt(int ), (int)226);
                v12 /* !! */  = gu.go;
                if (true) ** GOTO lbl84
                block70: while (true) {
                    v12 /* !! */  = (long)(gu.cvwa("cwnq", cvxo(int ), (int)129) - gu.cvwa("cwnp", cvxo(int ), (int)128));
lbl84:
                    // 2 sources

                    switch ((int)v12 /* !! */ ) {
                        case -1855170120: {
                            break block70;
                        }
                        case -1634823972: {
                            continue block70;
                        }
                    }
                    break;
                }
                this.joining = v11;
                if (var1_3 || var1_3) ** GOTO lbl32
                v13 = gu.cvwa("cwnr", cvvt(int ), (int)227);
                v14 /* !! */  = gu.go;
                if (true) ** GOTO lbl96
                block71: while (true) {
                    v14 /* !! */  = (long)(gu.cvwa("cwnt", cvxo(int ), (int)131) - gu.cvwa("cwns", cvxo(int ), (int)130));
lbl96:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case -1855170120: {
                            break block71;
                        }
                        case -423078112: {
                            continue block71;
                        }
                    }
                    break;
                }
                this.pageSwitches = (int)v13;
                if (var1_3 || var1_3) ** GOTO lbl32
                v15 = gu.cvwa("cwnu", cvvt(int ), (int)228);
                while (true) {
                    if ((v16 /* !! */  = (cfr_temp_5 = gu.go - gu.cvwa("cwnv", cvxo(int ), (int)132)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v16 /* !! */  == gu.cvwa("cwnw", cvvt(int ), (int)229)) break;
                    v16 /* !! */  = (long)gu.cvwa("cwnx", cvvt(int ), (int)230);
                }
                this.lockedTargetSlot = (int)v15;
                if (var1_3 || var1_3) ** GOTO lbl32
                v17 = gu.cvwa("cwny", cvxo(int ), (int)133);
                v18 /* !! */  = gu.go;
                if (true) ** GOTO lbl116
                block73: while (true) {
                    v18 /* !! */  = (long)(gu.cvwa("cwoa", cvxo(int ), (int)135) - gu.cvwa("cwnz", cvxo(int ), (int)134));
lbl116:
                    // 2 sources

                    switch ((int)v18 /* !! */ ) {
                        case -1855170120: {
                            break block73;
                        }
                        case 1317054476: {
                            continue block73;
                        }
                    }
                    break;
                }
                this.targetClickedAt = (long)v17;
                if (var1_3 || var1_3) ** GOTO lbl32
                v19 /* !! */  = gu.go;
                if (true) ** GOTO lbl127
                block74: while (true) {
                    v19 /* !! */  = (long)(v20 - gu.cvwa("cwob", cvxo(int ), (int)136));
lbl127:
                    // 2 sources

                    switch ((int)v19 /* !! */ ) {
                        case -1855170120: {
                            break block74;
                        }
                        case -1845173337: {
                            v20 = gu.cvwa("cwoc", cvxo(int ), (int)137);
                            continue block74;
                        }
                        case -1716252941: {
                            v20 = gu.cvwa("cwod", cvxo(int ), (int)138);
                            continue block74;
                        }
                        case -1669888692: {
                            v20 = gu.cvwa("cwoe", cvxo(int ), (int)139);
                            continue block74;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v21 /* !! */  = (cfr_temp_6 = gu.go - gu.cvwa("cwof", cvxo(int ), (int)140)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v21 /* !! */  == gu.cvwa("cwog", cvvt(int ), (int)231)) break;
                    v21 /* !! */  = (long)gu.cvwa("cwoh", cvvt(int ), (int)232);
                }
                this.clickTimer.reset();
                if (var1_3 || var1_3) ** GOTO lbl32
                while (true) {
                    if ((v22 /* !! */  = (cfr_temp_7 = gu.go - gu.cvwa("cwoi", cvxo(int ), (int)141)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v22 /* !! */  == gu.cvwa("cwoj", cvvt(int ), (int)233)) break;
                    v22 /* !! */  = (long)gu.cvwa("cwok", cvvt(int ), (int)234);
                }
                v23 /* !! */  = gu.go;
                if (true) ** GOTO lbl155
                block77: while (true) {
                    v23 /* !! */  = (long)(gu.cvwa("cwom", cvxo(int ), (int)143) - gu.cvwa("cwol", cvxo(int ), (int)142));
lbl155:
                    // 2 sources

                    switch ((int)v23 /* !! */ ) {
                        case -1855170120: {
                            break block77;
                        }
                        case 2053459750: {
                            continue block77;
                        }
                    }
                    break;
                }
                this.compassTimer.reset();
                if (var1_3 || var1_3) ** continue;
                return;
            }
            case 0: {
                var2_2 /* !! */  = (int)gu.cvwa("cwon", cvvt(int ), (int)235);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl223
            }
lbl168:
            // 2 sources

            case 1: {
                do {
                    var2_2 /* !! */  = (int)gu.cvwa("cwoo", cvvt(int ), (int)236);
                } while (!var3_1);
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)gu.cvwa("cwop", cvvt(int ), (int)237);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl237
            }
            case 3: {
                var2_2 /* !! */  = (int)gu.cvwa("cwoq", cvvt(int ), (int)238);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl257
            }
            case 4: {
                var2_2 /* !! */  = (int)gu.cvwa("cwor", cvvt(int ), (int)239);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl237
            }
lbl188:
            // 3 sources

            case 5: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)gu.cvwa("cwos", cvvt(int ), (int)240);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl241
                    break;
                }
            }
lbl194:
            // 2 sources

            case 6: {
                var2_2 /* !! */  = (int)gu.cvwa("cwot", cvvt(int ), (int)241);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl249
            }
            case 7: {
                var2_2 /* !! */  = (int)gu.cvwa("cwou", cvvt(int ), (int)242);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl261
            }
lbl204:
            // 2 sources

            case 8: {
                var2_2 /* !! */  = (int)gu.cvwa("cwov", cvvt(int ), (int)243);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl257
            }
            case 9: {
                var2_2 /* !! */  = (int)gu.cvwa("cwow", cvvt(int ), (int)244);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl257
            }
lbl214:
            // 4 sources

            case 10: {
                var2_2 /* !! */  = (int)gu.cvwa("cwox", cvvt(int ), (int)245);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl237
            }
            case 11: {
                var2_2 /* !! */  = (int)gu.cvwa("cwoy", cvvt(int ), (int)246);
                if (!var3_1) ** GOTO lbl194
                throw null;
            }
lbl223:
            // 2 sources

            case 12: {
                var2_2 /* !! */  = (int)gu.cvwa("cwoz", cvvt(int ), (int)247);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl241
            }
            case 13: {
                var2_2 /* !! */  = (int)gu.cvwa("cwpa", cvvt(int ), (int)248);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl241
            }
lbl233:
            // 2 sources

            case 14: {
                var2_2 /* !! */  = (int)gu.cvwa("cwpb", cvvt(int ), (int)249);
                if (!var3_1) ** GOTO lbl204
                throw null;
            }
lbl237:
            // 5 sources

            case 15: {
                var2_2 /* !! */  = (int)gu.cvwa("cwpc", cvvt(int ), (int)250);
                if (var3_1) {
                    throw null;
                }
            }
lbl241:
            // 6 sources

            case 16: {
                var2_2 /* !! */  = (int)gu.cvwa("cwpd", cvvt(int ), (int)251);
                if (!var3_1) ** GOTO lbl168
                throw null;
            }
            case 17: {
                var2_2 /* !! */  = (int)gu.cvwa("cwpe", cvvt(int ), (int)252);
                if (!var3_1) ** GOTO lbl214
                throw null;
            }
lbl249:
            // 2 sources

            case 18: {
                var2_2 /* !! */  = (int)gu.cvwa("cwpf", cvvt(int ), (int)253);
                if (!var3_1) ** GOTO lbl214
                throw null;
            }
lbl253:
            // 2 sources

            case 19: {
                var2_2 /* !! */  = (int)gu.cvwa("cwpg", cvvt(int ), (int)254);
                if (!var3_1) ** GOTO lbl233
                throw null;
            }
lbl257:
            // 4 sources

            case 20: {
                var2_2 /* !! */  = (int)gu.cvwa("cwph", cvvt(int ), (int)255);
                if (!var3_1) ** GOTO lbl237
                throw null;
            }
lbl261:
            // 2 sources

            case 21: {
                var2_2 /* !! */  = (int)gu.cvwa("cwpi", cvvt(int ), (int)256);
                if (!var3_1) ** GOTO lbl188
                throw null;
            }
            case 22: {
                do {
                    var2_2 /* !! */  = (int)gu.cvwa("cwpj", cvvt(int ), (int)257);
                } while (!var3_1);
                throw null;
            }
            case 23: {
                var2_2 /* !! */  = (int)gu.cvwa("cwpk", cvvt(int ), (int)258);
                if (!var3_1) ** GOTO lbl214
                throw null;
            }
            case 24: {
                var2_2 /* !! */  = (int)gu.cvwa("cwpl", cvvt(int ), (int)259);
                if (!var3_1) ** GOTO lbl188
                throw null;
            }
            case 25: {
                var2_2 /* !! */  = (int)gu.cvwa("cwpm", cvvt(int ), (int)260);
                if (!var3_1) ** GOTO lbl253
                throw null;
            }
            case 26: 
        }
        var2_2 /* !! */  = (int)gu.cvwa("cwpn", cvvt(int ), (int)261);
        ** while (!var3_1)
lbl285:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void cxsl() {
        gu.cvvy[500] = -1964390540;
        gu.cvvy[501] = -2028358445;
        gu.cvvy[502] = -1684930269;
        gu.cvvy[503] = -601561695;
        gu.cvvy[504] = -1403910454;
        gu.cvvy[505] = 1393291166;
        gu.cvvy[506] = -1521249923;
        gu.cvvy[507] = 191522926;
        gu.cvvy[508] = -713473253;
        gu.cvvy[509] = 1657838407;
        gu.cvvy[510] = 185010855;
        gu.cvvy[511] = -951875170;
        gu.cvvy[512] = -1183178412;
        gu.cvvy[513] = -476035374;
        gu.cvvy[514] = -1491024540;
        gu.cvvy[515] = -92016892;
        gu.cvvy[516] = -551960811;
        gu.cvvy[517] = -1450360183;
        gu.cvvy[518] = -423522846;
        gu.cvvy[519] = 1086921926;
        gu.cvvy[520] = -1729071016;
        gu.cvvy[521] = -887858922;
        gu.cvvy[522] = 895695253;
        gu.cvvy[523] = -1347586009;
        gu.cvvy[524] = 1656108243;
        gu.cvvy[525] = 128266893;
        gu.cvvy[526] = -714564788;
        gu.cvvy[527] = 389243489;
        gu.cvvy[528] = -1752203495;
        gu.cvvy[529] = 1961453969;
        gu.cvvy[530] = -1603172750;
        gu.cvvy[531] = -1151780253;
        gu.cvvy[532] = 749712321;
        gu.cvvy[533] = -649539576;
        gu.cvvy[534] = -906207647;
        gu.cvvy[535] = -2092917893;
        gu.cvvy[536] = -672493308;
        gu.cvvy[537] = 760391936;
        gu.cvvy[538] = -929571308;
        gu.cvvy[539] = 784080122;
        gu.cvvy[540] = 443295630;
        gu.cvvy[541] = 1239263989;
        gu.cvvy[542] = 1245521697;
        gu.cvvy[543] = -1425610729;
        gu.cvvy[544] = 700351640;
        gu.cvvy[545] = 1487888979;
        gu.cvvy[546] = -674804763;
        gu.cvvy[547] = -1832564717;
        gu.cvvy[548] = 179792182;
        gu.cvvy[549] = 1706793118;
        gu.cvvy[550] = 549036781;
        gu.cvvy[551] = -1818544519;
        gu.cvvy[552] = -161818232;
        gu.cvvy[553] = -813769728;
        gu.cvvy[554] = 702056465;
        gu.cvvy[555] = -1138138804;
        gu.cvvy[556] = 198505581;
        gu.cvvy[557] = 1273963380;
        gu.cvvy[558] = 697503327;
        gu.cvvy[559] = 855128329;
        gu.cvvy[560] = 7265583;
        gu.cvvy[561] = -1928567509;
        gu.cvvy[562] = 1514883005;
        gu.cvvy[563] = 247828528;
        gu.cvvy[564] = 842267142;
        gu.cvvy[565] = -598895760;
        gu.cvvy[566] = -329772690;
        gu.cvvy[567] = 62773654;
        gu.cvvy[568] = -796873053;
        gu.cvvy[569] = 1293830028;
        gu.cvvy[570] = 217229692;
        gu.cvvy[571] = 236635007;
        gu.cvvy[572] = -963109826;
        gu.cvvy[573] = 859439748;
        gu.cvvy[574] = -498646875;
        gu.cvvy[575] = -1304694365;
        gu.cvvy[576] = 1797338468;
        gu.cvvy[577] = 187276692;
        gu.cvvy[578] = 213144641;
        gu.cvvy[579] = 1870943354;
        gu.cvvy[580] = 1352380629;
        gu.cvvy[581] = -2026039886;
        gu.cvvy[582] = 243122808;
        gu.cvvy[583] = 211034224;
        gu.cvvy[584] = -428532076;
        gu.cvvy[585] = 1377651226;
        gu.cvvy[586] = 76881719;
        gu.cvvy[587] = -1317316889;
        gu.cvvy[588] = 1031961336;
        gu.cvvy[589] = 1016070075;
        gu.cvvy[590] = 1828045919;
        gu.cvvy[591] = -1658765343;
        gu.cvvy[592] = 789554159;
        gu.cvvy[593] = 296596892;
        gu.cvvy[594] = 1228733820;
        gu.cvvy[595] = 1493050560;
        gu.cvvy[596] = -1831422948;
        gu.cvvy[597] = 626155948;
        gu.cvvy[598] = -10058051;
        gu.cvvy[599] = -60963494;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean updateCompassAction() {
        block77: {
            block78: {
                block76: {
                    block75: {
                        var5_1 = gu.c;
                        var4_2 /* !! */  = gu.b;
                        var3_3 = gu.a;
                        if (var5_1) {
                            throw null;
lbl6:
                            // 18 sources

                            return (boolean)gu.cvwa("cwyu", cvvt(int ), (int)454);
                        }
                        if (var3_3 || var3_3) ** GOTO lbl6
                        if (this.compassStage == 0) break block75;
                        if (var3_3) ** GOTO lbl6
                        if (gu.mc.field_1724 != null) break block76;
                        if (var3_3) ** GOTO lbl6
                    }
                    if (var3_3 || var3_3) ** GOTO lbl6
                    return (boolean)gu.cvwa("cwyv", cvvt(int ), (int)455);
                }
                if (var3_3 || var3_3) ** GOTO lbl6
                var1_4 = System.currentTimeMillis();
                if (var3_3 || var3_3) ** GOTO lbl6
                if (this.compassStage != gu.cvwa("cwyw", cvvt(int ), (int)456)) break block77;
                if (var3_3 || var3_3) ** GOTO lbl6
                if (var1_4 - this.compassActionAt >= gu.cvwa("cwyx", cvxo(int ), (int)191)) break block78;
                if (var3_3 || var3_3) ** GOTO lbl6
                return (boolean)gu.cvwa("cwyy", cvvt(int ), (int)457);
            }
            if (var3_3 || var3_3) ** GOTO lbl6
            nv.use(class_1268.field_5808);
            if (var3_3 || var3_3) ** GOTO lbl6
            gu.mc.field_1724.method_6104(class_1268.field_5808);
            if (var3_3 || var3_3) ** GOTO lbl6
            this.compassStage = (int)gu.cvwa("cwyz", cvvt(int ), (int)458);
            if (var3_3 || var3_3) ** GOTO lbl6
            this.compassActionAt = var1_4;
            if (var3_3 || var3_3) ** GOTO lbl6
            return (boolean)gu.cvwa("cwza", cvvt(int ), (int)459);
        }
        if (var3_3 || var3_3) ** GOTO lbl6
        if (var1_4 - this.compassActionAt >= gu.cvwa("cwzb", cvxo(int ), (int)192)) ** GOTO lbl44
        if (var4_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_3 || var3_3) ** GOTO lbl6
                return (boolean)gu.cvwa("cwzc", cvvt(int ), (int)460);
            }
lbl44:
            // 1 sources

            if (var3_3 || var3_3) ** GOTO lbl6
            this.restoreCompassSlot();
            if (var3_3 || var3_3) ** GOTO lbl6
            this.compassStage = (int)gu.cvwa("cwzd", cvvt(int ), (int)461);
            if (!var3_3 && !var3_3) ** break;
            ** continue;
            return (boolean)gu.cvwa("cwze", cvvt(int ), (int)462);
lbl51:
            // 2 sources

            case 0: {
                var4_2 /* !! */  = (int)gu.cvwa("cwzf", cvvt(int ), (int)463);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl203
            }
lbl56:
            // 3 sources

            case 1: {
                var4_2 /* !! */  = (int)gu.cvwa("cwzg", cvvt(int ), (int)464);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl125
            }
lbl61:
            // 2 sources

            case 2: {
                var4_2 /* !! */  = (int)gu.cvwa("cwzh", cvvt(int ), (int)465);
                if (!var5_1) ** GOTO lbl56
                throw null;
            }
lbl65:
            // 3 sources

            case 3: {
                var4_2 /* !! */  = (int)gu.cvwa("cwzi", cvvt(int ), (int)466);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl102
            }
lbl70:
            // 4 sources

            case 4: {
                var4_2 /* !! */  = (int)gu.cvwa("cwzj", cvvt(int ), (int)467);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl203
            }
lbl75:
            // 2 sources

            case 5: {
                var4_2 /* !! */  = (int)gu.cvwa("cwzk", cvvt(int ), (int)468);
                if (!var5_1) ** GOTO lbl70
                throw null;
            }
            case 6: {
                var4_2 /* !! */  = (int)gu.cvwa("cwzl", cvvt(int ), (int)469);
                if (!var5_1) ** GOTO lbl75
                throw null;
            }
            case 7: {
                var4_2 /* !! */  = (int)gu.cvwa("cwzm", cvvt(int ), (int)470);
                if (!var5_1) ** GOTO lbl56
                throw null;
            }
lbl87:
            // 2 sources

            case 8: {
                var4_2 /* !! */  = (int)gu.cvwa("cwzn", cvvt(int ), (int)471);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl164
            }
lbl92:
            // 2 sources

            case 9: {
                var4_2 /* !! */  = (int)gu.cvwa("cwzo", cvvt(int ), (int)472);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl143
            }
lbl97:
            // 2 sources

            case 10: {
                var4_2 /* !! */  = (int)gu.cvwa("cwzp", cvvt(int ), (int)473);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl178
            }
lbl102:
            // 2 sources

            case 11: {
                var4_2 /* !! */  = (int)gu.cvwa("cwzq", cvvt(int ), (int)474);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl211
            }
            case 12: {
                var4_2 /* !! */  = (int)gu.cvwa("cwzr", cvvt(int ), (int)475);
                if (!var5_1) ** GOTO lbl92
                throw null;
            }
lbl111:
            // 3 sources

            case 13: {
                var4_2 /* !! */  = (int)gu.cvwa("cwzs", cvvt(int ), (int)476);
                if (!var5_1) ** GOTO lbl70
                throw null;
            }
            case 14: {
                var4_2 /* !! */  = (int)gu.cvwa("cwzt", cvvt(int ), (int)477);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl155
            }
lbl120:
            // 2 sources

            case 15: {
                var4_2 /* !! */  = (int)gu.cvwa("cwzu", cvvt(int ), (int)478);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl143
            }
lbl125:
            // 2 sources

            case 16: {
                var4_2 /* !! */  = (int)gu.cvwa("cwzv", cvvt(int ), (int)479);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl187
            }
lbl130:
            // 2 sources

            case 17: {
                var4_2 /* !! */  = (int)gu.cvwa("cwzw", cvvt(int ), (int)480);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl170
            }
            case 18: {
                var4_2 /* !! */  = (int)gu.cvwa("cwzx", cvvt(int ), (int)481);
                if (!var5_1) ** GOTO lbl111
                throw null;
            }
            case 19: {
                var4_2 /* !! */  = (int)gu.cvwa("cwzy", cvvt(int ), (int)482);
                if (!var5_1) ** GOTO lbl97
                throw null;
            }
lbl143:
            // 4 sources

            case 20: {
                var4_2 /* !! */  = (int)gu.cvwa("cwzz", cvvt(int ), (int)483);
                if (!var5_1) ** GOTO lbl120
                throw null;
            }
            case 21: {
                var4_2 /* !! */  = (int)gu.cvwa("cxaa", cvvt(int ), (int)484);
                if (!var5_1) ** GOTO lbl61
                throw null;
            }
lbl151:
            // 2 sources

            case 22: {
                var4_2 /* !! */  = (int)gu.cvwa("cxab", cvvt(int ), (int)485);
                if (!var5_1) ** GOTO lbl70
                throw null;
            }
lbl155:
            // 2 sources

            case 23: {
                var4_2 /* !! */  = (int)gu.cvwa("cxac", cvvt(int ), (int)486);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl203
            }
            case 24: {
                var4_2 /* !! */  = (int)gu.cvwa("cxad", cvvt(int ), (int)487);
                if (!var5_1) ** GOTO lbl111
                throw null;
            }
lbl164:
            // 2 sources

            case 25: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_2 /* !! */  = (int)gu.cvwa("cxae", cvvt(int ), (int)488);
                    if (var5_1) {
                        throw null;
                    }
                    ** GOTO lbl178
                    break;
                }
            }
lbl170:
            // 2 sources

            case 26: {
                var4_2 /* !! */  = (int)gu.cvwa("cxaf", cvvt(int ), (int)489);
                if (!var5_1) ** GOTO lbl87
                throw null;
            }
lbl174:
            // 2 sources

            case 27: {
                var4_2 /* !! */  = (int)gu.cvwa("cxag", cvvt(int ), (int)490);
                if (!var5_1) ** GOTO lbl65
                throw null;
            }
lbl178:
            // 3 sources

            case 28: {
                var4_2 /* !! */  = (int)gu.cvwa("cxah", cvvt(int ), (int)491);
                if (!var5_1) ** GOTO lbl65
                throw null;
            }
            case 29: {
                var4_2 /* !! */  = (int)gu.cvwa("cxai", cvvt(int ), (int)492);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl207
            }
lbl187:
            // 2 sources

            case 30: {
                var4_2 /* !! */  = (int)gu.cvwa("cxaj", cvvt(int ), (int)493);
                if (!var5_1) ** GOTO lbl174
                throw null;
            }
lbl191:
            // 2 sources

            case 31: {
                var4_2 /* !! */  = (int)gu.cvwa("cxak", cvvt(int ), (int)494);
                if (!var5_1) ** GOTO lbl143
                throw null;
            }
            case 32: {
                var4_2 /* !! */  = (int)gu.cvwa("cxal", cvvt(int ), (int)495);
                if (!var5_1) ** GOTO lbl191
                throw null;
            }
            case 33: {
                var4_2 /* !! */  = (int)gu.cvwa("cxam", cvvt(int ), (int)496);
                if (!var5_1) ** GOTO lbl51
                throw null;
            }
lbl203:
            // 5 sources

            case 34: {
                var4_2 /* !! */  = (int)gu.cvwa("cxan", cvvt(int ), (int)497);
                if (!var5_1) ** GOTO lbl151
                throw null;
            }
lbl207:
            // 2 sources

            case 35: {
                var4_2 /* !! */  = (int)gu.cvwa("cxao", cvvt(int ), (int)498);
                if (!var5_1) ** GOTO lbl203
                throw null;
            }
lbl211:
            // 2 sources

            case 36: {
                var4_2 /* !! */  = (int)gu.cvwa("cxap", cvvt(int ), (int)499);
                if (!var5_1) ** GOTO lbl130
                throw null;
            }
            case 37: 
        }
        var4_2 /* !! */  = (int)gu.cvwa("cxaq", cvvt(int ), (int)500);
        ** while (!var5_1)
lbl218:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void cxry() {
        gu.cvvv[0] = -1689146917;
        gu.cvvv[1] = -1923823336;
        gu.cvvv[2] = -1074287305;
        gu.cvvv[3] = -1820218747;
        gu.cvvv[4] = -127155077;
        gu.cvvv[5] = 463017555;
        gu.cvvv[6] = -1687345745;
        gu.cvvv[7] = 780455443;
        gu.cvvv[8] = -1910964556;
        gu.cvvv[9] = -1283305037;
        gu.cvvv[10] = -164973932;
        gu.cvvv[11] = 330301480;
        gu.cvvv[12] = -675784282;
        gu.cvvv[13] = -528868129;
        gu.cvvv[14] = -595647633;
        gu.cvvv[15] = 1636794227;
        gu.cvvv[16] = -816620471;
        gu.cvvv[17] = 667718964;
        gu.cvvv[18] = 758562189;
        gu.cvvv[19] = -1850865083;
        gu.cvvv[20] = 468108586;
        gu.cvvv[21] = 1918381305;
        gu.cvvv[22] = 556716610;
        gu.cvvv[23] = 393894837;
        gu.cvvv[24] = 294614716;
        gu.cvvv[25] = 1637023728;
        gu.cvvv[26] = 900593259;
        gu.cvvv[27] = 2122424090;
        gu.cvvv[28] = -1894428606;
        gu.cvvv[29] = 1098625881;
        gu.cvvv[30] = -837925039;
        gu.cvvv[31] = -1656187317;
        gu.cvvv[32] = 613807260;
        gu.cvvv[33] = -398317060;
        gu.cvvv[34] = 124652539;
        gu.cvvv[35] = -2142298307;
        gu.cvvv[36] = -1036153835;
        gu.cvvv[37] = -1551878435;
        gu.cvvv[38] = -1594469211;
        gu.cvvv[39] = -392299142;
        gu.cvvv[40] = 2018481226;
        gu.cvvv[41] = 988876114;
        gu.cvvv[42] = -333801727;
        gu.cvvv[43] = -1205684290;
        gu.cvvv[44] = 1234729913;
        gu.cvvv[45] = 2043657716;
        gu.cvvv[46] = -1489259114;
        gu.cvvv[47] = -1474002032;
        gu.cvvv[48] = 342189335;
        gu.cvvv[49] = 932967916;
        gu.cvvv[50] = -1590379101;
        gu.cvvv[51] = 1105051573;
        gu.cvvv[52] = 67049451;
        gu.cvvv[53] = -1418948083;
        gu.cvvv[54] = -1772347986;
        gu.cvvv[55] = 1669454636;
        gu.cvvv[56] = 660124481;
        gu.cvvv[57] = -939790087;
        gu.cvvv[58] = -1199905737;
        gu.cvvv[59] = -37906060;
        gu.cvvv[60] = -1896145811;
        gu.cvvv[61] = -1460306398;
        gu.cvvv[62] = 1179150066;
        gu.cvvv[63] = -1710553193;
        gu.cvvv[64] = -1409228258;
        gu.cvvv[65] = 1369150860;
        gu.cvvv[66] = -1147821341;
        gu.cvvv[67] = -718751155;
        gu.cvvv[68] = -394669610;
        gu.cvvv[69] = 938330202;
        gu.cvvv[70] = -90311611;
        gu.cvvv[71] = 1034873948;
        gu.cvvv[72] = -1225699341;
        gu.cvvv[73] = -421219101;
        gu.cvvv[74] = -2044176204;
        gu.cvvv[75] = 1382126295;
        gu.cvvv[76] = 871920128;
        gu.cvvv[77] = 1541433794;
        gu.cvvv[78] = -1442888668;
        gu.cvvv[79] = 550501701;
        gu.cvvv[80] = -1620000602;
        gu.cvvv[81] = 1164796116;
        gu.cvvv[82] = -1417592113;
        gu.cvvv[83] = 910973758;
        gu.cvvv[84] = 63680985;
        gu.cvvv[85] = -710747776;
        gu.cvvv[86] = -1612274605;
        gu.cvvv[87] = -1792900680;
        gu.cvvv[88] = 190618949;
        gu.cvvv[89] = -1971431990;
        gu.cvvv[90] = 2142866256;
        gu.cvvv[91] = 656540171;
        gu.cvvv[92] = 1004229358;
        gu.cvvv[93] = -96668031;
        gu.cvvv[94] = -451441300;
        gu.cvvv[95] = 378765930;
        gu.cvvv[96] = -1163120419;
        gu.cvvv[97] = -789808459;
        gu.cvvv[98] = 267644409;
        gu.cvvv[99] = -879973728;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean isValidSlot(class_1703 var1_1, int var2_2) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = gu.go - gu.cvwa("cxll", cvxo(int ), (int)316)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == gu.cvwa("cxlm", cvvt(int ), (int)658)) break;
            v0 /* !! */  = (long)gu.cvwa("cxln", cvvt(int ), (int)659);
        }
        var5_3 = gu.c;
        v1 /* !! */  = gu.go;
        if (true) ** GOTO lbl11
        block43: while (true) {
            v1 /* !! */  = (long)(v2 - gu.cvwa("cxlo", cvxo(int ), (int)317));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1855170120: {
                    break block43;
                }
                case -707660847: {
                    v2 = gu.cvwa("cxlp", cvxo(int ), (int)318);
                    continue block43;
                }
                case -58760937: {
                    v2 = gu.cvwa("cxlq", cvxo(int ), (int)319);
                    continue block43;
                }
                case 754746712: {
                    v2 = gu.cvwa("cxlr", cvxo(int ), (int)320);
                    continue block43;
                }
            }
            break;
        }
        var4_4 /* !! */  = gu.b;
        v3 /* !! */  = gu.go;
        if (true) ** GOTO lbl28
        block44: while (true) {
            v3 /* !! */  = (long)(gu.cvwa("cxlt", cvxo(int ), (int)322) - gu.cvwa("cxls", cvxo(int ), (int)321));
lbl28:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1855170120: {
                    break block44;
                }
                case 839705401: {
                    continue block44;
                }
            }
            break;
        }
        var3_5 = gu.a;
        if (var5_3) {
            throw null;
lbl36:
            // 6 sources

            return (boolean)gu.cvwa("cxlu", cvvt(int ), (int)660);
        }
        if (var3_5) ** GOTO lbl36
        if (var4_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_5) ** GOTO lbl36
                if (var2_2 < 0) ** GOTO lbl118
                if (var3_5) ** GOTO lbl36
                v4 /* !! */  = gu.go;
                if (true) ** GOTO lbl49
                block46: while (true) {
                    v4 /* !! */  = (long)(v5 - gu.cvwa("cxlv", cvxo(int ), (int)323));
lbl49:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1855170120: {
                            break block46;
                        }
                        case -1113567036: {
                            v5 = gu.cvwa("cxlw", cvxo(int ), (int)324);
                            continue block46;
                        }
                        case -677830864: {
                            v5 = gu.cvwa("cxlx", cvxo(int ), (int)325);
                            continue block46;
                        }
                    }
                    break;
                }
                v6 = var1_1.field_7761;
                v7 /* !! */  = gu.go;
                if (true) ** GOTO lbl63
                block47: while (true) {
                    v7 /* !! */  = (long)(v8 - gu.cvwa("cxly", cvxo(int ), (int)326));
lbl63:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -1855170120: {
                            break block47;
                        }
                        case -1722005213: {
                            v8 = gu.cvwa("cxlz", cvxo(int ), (int)327);
                            continue block47;
                        }
                        case -1069884914: {
                            v8 = gu.cvwa("cxma", cvxo(int ), (int)328);
                            continue block47;
                        }
                        case 1107756878: {
                            v8 = gu.cvwa("cxmb", cvxo(int ), (int)329);
                            continue block47;
                        }
                    }
                    break;
                }
                if (var2_2 >= v6.size()) ** GOTO lbl118
                if (var3_5) ** GOTO lbl36
                v9 /* !! */  = gu.go;
                if (true) ** GOTO lbl81
                block48: while (true) {
                    v9 /* !! */  = (long)(v10 - gu.cvwa("cxmc", cvxo(int ), (int)330));
lbl81:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -1855170120: {
                            break block48;
                        }
                        case 349134659: {
                            v10 = gu.cvwa("cxmd", cvxo(int ), (int)331);
                            continue block48;
                        }
                        case 361008816: {
                            v10 = gu.cvwa("cxme", cvxo(int ), (int)332);
                            continue block48;
                        }
                    }
                    break;
                }
                v11 = var1_1.field_7761;
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_1 = gu.go - gu.cvwa("cxmf", cvxo(int ), (int)333)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == gu.cvwa("cxmg", cvvt(int ), (int)661)) break;
                    v12 /* !! */  = (long)gu.cvwa("cxmh", cvvt(int ), (int)662);
                }
                v13 = (class_1735)v11.get(var2_2);
                while (true) {
                    if ((v14 /* !! */  = (cfr_temp_2 = gu.go - gu.cvwa("cxmi", cvxo(int ), (int)334)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v14 /* !! */  == gu.cvwa("cxmj", cvvt(int ), (int)663)) break;
                    v14 /* !! */  = (long)gu.cvwa("cxmk", cvvt(int ), (int)664);
                }
                v15 = v13.method_7677();
                v16 /* !! */  = gu.go;
                if (true) ** GOTO lbl107
                block51: while (true) {
                    v16 /* !! */  = (long)(gu.cvwa("cxmm", cvxo(int ), (int)336) - gu.cvwa("cxml", cvxo(int ), (int)335));
lbl107:
                    // 2 sources

                    switch ((int)v16 /* !! */ ) {
                        case -1945873569: {
                            continue block51;
                        }
                        case -1855170120: {
                            break block51;
                        }
                    }
                    break;
                }
                if (v15.method_7960()) ** GOTO lbl118
                if (var3_5) ** GOTO lbl36
                v17 = gu.cvwa("cxmn", cvvt(int ), (int)665);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl121
lbl118:
                // 3 sources

                if (!var3_5 && !var3_5) ** break;
                ** continue;
                v17 = gu.cvwa("cxmo", cvvt(int ), (int)666);
lbl121:
                // 2 sources

                return (boolean)v17;
            }
lbl122:
            // 3 sources

            case 0: {
                var4_4 /* !! */  = (int)gu.cvwa("cxmp", cvvt(int ), (int)667);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl150
            }
lbl127:
            // 2 sources

            case 1: {
                var4_4 /* !! */  = (int)gu.cvwa("cxmq", cvvt(int ), (int)668);
                if (var5_3) {
                    throw null;
                }
            }
lbl131:
            // 4 sources

            case 2: {
                do {
                    var4_4 /* !! */  = (int)gu.cvwa("cxmr", cvvt(int ), (int)669);
                } while (!var5_3);
                throw null;
            }
            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_4 /* !! */  = (int)gu.cvwa("cxms", cvvt(int ), (int)670);
                    if (var5_3) {
                        throw null;
                    }
                    ** GOTO lbl154
                    break;
                }
            }
            case 4: {
                var4_4 /* !! */  = (int)gu.cvwa("cxmt", cvvt(int ), (int)671);
                if (!var5_3) ** GOTO lbl122
                throw null;
            }
lbl146:
            // 2 sources

            case 5: {
                var4_4 /* !! */  = (int)gu.cvwa("cxmu", cvvt(int ), (int)672);
                if (!var5_3) ** GOTO lbl122
                throw null;
            }
lbl150:
            // 2 sources

            case 6: {
                var4_4 /* !! */  = (int)gu.cvwa("cxmv", cvvt(int ), (int)673);
                if (!var5_3) ** GOTO lbl146
                throw null;
            }
lbl154:
            // 2 sources

            case 7: {
                var4_4 /* !! */  = (int)gu.cvwa("cxmw", cvvt(int ), (int)674);
                if (!var5_3) ** GOTO lbl127
                throw null;
            }
            case 8: {
                var4_4 /* !! */  = (int)gu.cvwa("cxmx", cvvt(int ), (int)675);
                if (!var5_3) ** GOTO lbl131
                throw null;
            }
            case 9: 
        }
        var4_4 /* !! */  = (int)gu.cvwa("cxmy", cvvt(int ), (int)676);
        ** while (!var5_3)
lbl165:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void cxrz() {
        gu.cvvv[100] = 1708815561;
        gu.cvvv[101] = 1016785212;
        gu.cvvv[102] = 459659300;
        gu.cvvv[103] = 1639137228;
        gu.cvvv[104] = 989249036;
        gu.cvvv[105] = 1861138204;
        gu.cvvv[106] = -2021962178;
        gu.cvvv[107] = 311169524;
        gu.cvvv[108] = -815557763;
        gu.cvvv[109] = -1169250838;
        gu.cvvv[110] = 761314425;
        gu.cvvv[111] = -1558667388;
        gu.cvvv[112] = 1810039626;
        gu.cvvv[113] = 1970333074;
        gu.cvvv[114] = 741894787;
        gu.cvvv[115] = 1381012634;
        gu.cvvv[116] = 1054192099;
        gu.cvvv[117] = 664614915;
        gu.cvvv[118] = 184302378;
        gu.cvvv[119] = 959811927;
        gu.cvvv[120] = 932614688;
        gu.cvvv[121] = 1532843173;
        gu.cvvv[122] = 1654898600;
        gu.cvvv[123] = -618776481;
        gu.cvvv[124] = -1181015635;
        gu.cvvv[125] = -545497032;
        gu.cvvv[126] = 719601533;
        gu.cvvv[127] = 1674257538;
        gu.cvvv[128] = 21807499;
        gu.cvvv[129] = 133506096;
        gu.cvvv[130] = -196563433;
        gu.cvvv[131] = 1876831101;
        gu.cvvv[132] = 1381753805;
        gu.cvvv[133] = -1415241557;
        gu.cvvv[134] = -604665790;
        gu.cvvv[135] = 969921365;
        gu.cvvv[136] = -85971571;
        gu.cvvv[137] = -1749703114;
        gu.cvvv[138] = -1442322283;
        gu.cvvv[139] = -746468650;
        gu.cvvv[140] = 1623465297;
        gu.cvvv[141] = 327310911;
        gu.cvvv[142] = 63646449;
        gu.cvvv[143] = -1888681342;
        gu.cvvv[144] = 648201790;
        gu.cvvv[145] = 1298136381;
        gu.cvvv[146] = -172145121;
        gu.cvvv[147] = 1259382686;
        gu.cvvv[148] = 1734855350;
        gu.cvvv[149] = 370019291;
        gu.cvvv[150] = 213799934;
        gu.cvvv[151] = 246553658;
        gu.cvvv[152] = -2121921472;
        gu.cvvv[153] = 1657308640;
        gu.cvvv[154] = 1370464250;
        gu.cvvv[155] = -1025143816;
        gu.cvvv[156] = 501291613;
        gu.cvvv[157] = -1626032208;
        gu.cvvv[158] = -254990482;
        gu.cvvv[159] = 443055697;
        gu.cvvv[160] = -1555206404;
        gu.cvvv[161] = 1737204837;
        gu.cvvv[162] = 13377706;
        gu.cvvv[163] = -106176042;
        gu.cvvv[164] = -1968978784;
        gu.cvvv[165] = -1381524692;
        gu.cvvv[166] = 1700390112;
        gu.cvvv[167] = 403920243;
        gu.cvvv[168] = 1949580570;
        gu.cvvv[169] = -1714761725;
        gu.cvvv[170] = -1651431208;
        gu.cvvv[171] = 1087551463;
        gu.cvvv[172] = 1570767150;
        gu.cvvv[173] = 421713534;
        gu.cvvv[174] = 1765853643;
        gu.cvvv[175] = 1638414342;
        gu.cvvv[176] = -1158540538;
        gu.cvvv[177] = -917873808;
        gu.cvvv[178] = -832137428;
        gu.cvvv[179] = -339958318;
        gu.cvvv[180] = 1197373680;
        gu.cvvv[181] = 600206276;
        gu.cvvv[182] = 31564994;
        gu.cvvv[183] = 1615893165;
        gu.cvvv[184] = -1479220243;
        gu.cvvv[185] = -579493212;
        gu.cvvv[186] = 87194022;
        gu.cvvv[187] = -459293999;
        gu.cvvv[188] = 144807357;
        gu.cvvv[189] = -235575695;
        gu.cvvv[190] = -1595529676;
        gu.cvvv[191] = 2139458899;
        gu.cvvv[192] = 851180440;
        gu.cvvv[193] = 1011817332;
        gu.cvvv[194] = 970751261;
        gu.cvvv[195] = 279345555;
        gu.cvvv[196] = -1615243004;
        gu.cvvv[197] = 1396379920;
        gu.cvvv[198] = 523817358;
        gu.cvvv[199] = 720809616;
    }
}

