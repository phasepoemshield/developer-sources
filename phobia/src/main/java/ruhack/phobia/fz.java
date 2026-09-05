/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import ruhack.phobia.aw;
import ruhack.phobia.cr;
import ruhack.phobia.ds;
import ruhack.phobia.du;
import ruhack.phobia.jx;
import ruhack.phobia.kf;
import ruhack.phobia.nq;

public class fz
extends ds {
    private final kf mode;
    private static long[] jfmh;
    public static final int b;
    private static int[] jfly;
    private static long[] jfmg;
    private static int[] jflx;
    public static final boolean a;
    protected static final long rh = -3707896424854700117L;
    public static final boolean c;

    private static /* synthetic */ long jfmf(int n2) {
        return jfmg[n2] ^ jfmh[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public fz() {
        var2_1 /* !! */  = fz.b;
        super("NoFallDamage", "\u0423\u0431\u0438\u0440\u0430\u0435\u0442 \u043f\u043e\u043b\u0443\u0447\u0435\u043d\u0438\u0435 \u0443\u0440\u043e\u043d\u0430 \u0441 \u0432\u044b\u0441\u043e\u0442\u044b", du.MOVEMENT);
        this.mode = new kf("\u0420\u0435\u0436\u0438\u043c", "\u0412\u044b\u0431\u0435\u0440\u0438\u0442\u0435 \u0442\u0438\u043f", "Flag", new String[]{"Flag"});
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.settings(new jx[]{this.mode});
                return;
            }
            case 0: {
                var2_1 /* !! */  = (int)fz.jflz("jfma", jflw(int ), (int)0);
            }
            case 1: {
                var2_1 /* !! */  = (int)fz.jflz("jfmb", jflw(int ), (int)1);
            }
lbl13:
            // 3 sources

            case 2: {
                var2_1 /* !! */  = (int)fz.jflz("jfmc", jflw(int ), (int)2);
            }
            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)fz.jflz("jfmd", jflw(int ), (int)3);
                    ** GOTO lbl13
                    break;
                }
            }
            case 4: 
        }
        var2_1 /* !! */  = (int)fz.jflz("jfme", jflw(int ), (int)4);
        ** while (true)
    }

    public static /* synthetic */ CallSite jflz(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    static {
        jflx = new int[38];
        jfly = new int[38];
        fz.jfpg();
        fz.jfph();
        jfmg = new long[42];
        jfmh = new long[42];
        fz.jfpi();
        fz.jfpj();
    }

    private static /* synthetic */ void jfpi() {
        fz.jfmg[0] = 1720622833368695622L;
        fz.jfmg[1] = 4995513881735726602L;
        fz.jfmg[2] = 2948133222650975928L;
        fz.jfmg[3] = -1943972007808514627L;
        fz.jfmg[4] = -4726713814989501418L;
        fz.jfmg[5] = -6039690140544969367L;
        fz.jfmg[6] = -5017640906863627708L;
        fz.jfmg[7] = -5732215837767029013L;
        fz.jfmg[8] = 4308287042538242506L;
        fz.jfmg[9] = -3823675494470377663L;
        fz.jfmg[10] = 9032715706852406206L;
        fz.jfmg[11] = 4866873278607548876L;
        fz.jfmg[12] = -7686691912169222147L;
        fz.jfmg[13] = -8152355420171843035L;
        fz.jfmg[14] = -5279039209533704176L;
        fz.jfmg[15] = 5594245880625309091L;
        fz.jfmg[16] = 1434337313028116968L;
        fz.jfmg[17] = -3667418302749343980L;
        fz.jfmg[18] = -5292698434345685480L;
        fz.jfmg[19] = -3147194299334766944L;
        fz.jfmg[20] = -2873903433767629678L;
        fz.jfmg[21] = 3149057785211095632L;
        fz.jfmg[22] = -4626386335613655347L;
        fz.jfmg[23] = -8173540165175140846L;
        fz.jfmg[24] = 253549970498503993L;
        fz.jfmg[25] = 4948383591746356533L;
        fz.jfmg[26] = -526816931741499368L;
        fz.jfmg[27] = 3465867522786723557L;
        fz.jfmg[28] = 4686614932009554855L;
        fz.jfmg[29] = -7688727479236250819L;
        fz.jfmg[30] = 3580965844376995167L;
        fz.jfmg[31] = -893687649812690812L;
        fz.jfmg[32] = -4246116339639970575L;
        fz.jfmg[33] = -8904205281835143857L;
        fz.jfmg[34] = 2453692792491165741L;
        fz.jfmg[35] = 1736496032011565224L;
        fz.jfmg[36] = 1800348697643144510L;
        fz.jfmg[37] = 5000349413302613054L;
        fz.jfmg[38] = 5658944995604497841L;
        fz.jfmg[39] = 7991020343084482214L;
        fz.jfmg[40] = 6177988892984698325L;
        fz.jfmg[41] = 6679306774407296820L;
    }

    private static /* synthetic */ void jfpj() {
        fz.jfmh[0] = -6932003869944341847L;
        fz.jfmh[1] = -8156929481583471422L;
        fz.jfmh[2] = -8778117219885018225L;
        fz.jfmh[3] = 8837148956481942462L;
        fz.jfmh[4] = -8606422906435580746L;
        fz.jfmh[5] = -4259520447683248343L;
        fz.jfmh[6] = -162234647933771179L;
        fz.jfmh[7] = -2277000746123123223L;
        fz.jfmh[8] = -5503586181703238423L;
        fz.jfmh[9] = 8570881089464825031L;
        fz.jfmh[10] = -6231331175435308243L;
        fz.jfmh[11] = -7167782253982714754L;
        fz.jfmh[12] = 5036231372197552248L;
        fz.jfmh[13] = 5140294867705644421L;
        fz.jfmh[14] = 8027216481581738421L;
        fz.jfmh[15] = -4504053744604908361L;
        fz.jfmh[16] = -3824306583431596371L;
        fz.jfmh[17] = 2539450818340880088L;
        fz.jfmh[18] = -5371578438359623465L;
        fz.jfmh[19] = -7100761119139402050L;
        fz.jfmh[20] = -6193189087794009138L;
        fz.jfmh[21] = 5692537273555473634L;
        fz.jfmh[22] = -10196717558896947L;
        fz.jfmh[23] = -9035356697835112397L;
        fz.jfmh[24] = 7817499094360599466L;
        fz.jfmh[25] = -996963218656116696L;
        fz.jfmh[26] = -4877670400621457149L;
        fz.jfmh[27] = -3841882915435434989L;
        fz.jfmh[28] = -3316117910961071178L;
        fz.jfmh[29] = 6970665901527657405L;
        fz.jfmh[30] = -9127565814635422826L;
        fz.jfmh[31] = -7008937527391728628L;
        fz.jfmh[32] = 7743011373716539375L;
        fz.jfmh[33] = -7216765101091263121L;
        fz.jfmh[34] = -3156372717121741182L;
        fz.jfmh[35] = 6378480133959650982L;
        fz.jfmh[36] = 4686610842530413748L;
        fz.jfmh[37] = 8577757624075295258L;
        fz.jfmh[38] = 3523664869805861928L;
        fz.jfmh[39] = 3234618155782711378L;
        fz.jfmh[40] = 4867329512547924633L;
        fz.jfmh[41] = 2163634112379641205L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onPacket(cr var1_1) {
        v0 /* !! */  = fz.rh;
        if (true) ** GOTO lbl5
        block62: while (true) {
            v0 /* !! */  = (long)(v1 - fz.jflz("jfmi", jfmf(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -862437461: {
                    break block62;
                }
                case 726150929: {
                    v1 = fz.jflz("jfmj", jfmf(int ), (int)1);
                    continue block62;
                }
                case 1785276920: {
                    v1 = fz.jflz("jfmk", jfmf(int ), (int)2);
                    continue block62;
                }
            }
            break;
        }
        var4_2 = fz.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = fz.rh - fz.jflz("jfml", jfmf(int ), (int)3)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == fz.jflz("jfmm", jflw(int ), (int)5)) break;
            v2 /* !! */  = (long)fz.jflz("jfmn", jflw(int ), (int)6);
        }
        var3_3 /* !! */  = fz.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = fz.rh - fz.jflz("jfmo", jfmf(int ), (int)4)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == fz.jflz("jfmp", jflw(int ), (int)7)) break;
            v3 /* !! */  = (long)fz.jflz("jfmq", jflw(int ), (int)8);
        }
        var2_4 = fz.a;
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_2) {
                    throw null;
lbl34:
                    // 9 sources

                    return;
                }
                if (var2_4 || var2_4) ** GOTO lbl34
                v4 /* !! */  = fz.rh;
                if (true) ** GOTO lbl41
                block66: while (true) {
                    v4 /* !! */  = (long)(v5 - fz.jflz("jfmr", jfmf(int ), (int)5));
lbl41:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1718708292: {
                            v5 = fz.jflz("jfms", jfmf(int ), (int)6);
                            continue block66;
                        }
                        case -862437461: {
                            break block66;
                        }
                        case 528829277: {
                            v5 = fz.jflz("jfmt", jfmf(int ), (int)7);
                            continue block66;
                        }
                    }
                    break;
                }
                v6 /* !! */  = fz.rh;
                if (true) ** GOTO lbl54
                block67: while (true) {
                    v6 /* !! */  = (long)(fz.jflz("jfmv", jfmf(int ), (int)9) - fz.jflz("jfmu", jfmf(int ), (int)8));
lbl54:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -862437461: {
                            break block67;
                        }
                        case -161676137: {
                            continue block67;
                        }
                    }
                    break;
                }
                if (fz.mc.field_1724 == null) ** GOTO lbl75
                if (var2_4) ** GOTO lbl34
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_2 = fz.rh - fz.jflz("jfmw", jfmf(int ), (int)10)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v7 /* !! */  == fz.jflz("jfmx", jflw(int ), (int)9)) break;
                    v7 /* !! */  = (long)fz.jflz("jfmy", jflw(int ), (int)10);
                }
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_3 = fz.rh - fz.jflz("jfmz", jfmf(int ), (int)11)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v8 /* !! */  == fz.jflz("jfna", jflw(int ), (int)11)) break;
                    v8 /* !! */  = (long)fz.jflz("jfnb", jflw(int ), (int)12);
                }
                if (fz.mc.field_1687 != null) ** GOTO lbl77
                if (var2_4) ** GOTO lbl34
lbl75:
                // 2 sources

                if (var2_4 || var2_4) ** GOTO lbl34
                return;
lbl77:
                // 1 sources

                if (var2_4 || var2_4) ** GOTO lbl34
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_4 = fz.rh - fz.jflz("jfnc", jfmf(int ), (int)12)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v9 /* !! */  == fz.jflz("jfnd", jflw(int ), (int)13)) break;
                    v9 /* !! */  = (long)fz.jflz("jfne", jflw(int ), (int)14);
                }
                v10 /* !! */  = fz.rh;
                if (true) ** GOTO lbl88
                block71: while (true) {
                    v10 /* !! */  = (long)(v11 - fz.jflz("jfnf", jfmf(int ), (int)13));
lbl88:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -884788263: {
                            v11 = fz.jflz("jfng", jfmf(int ), (int)14);
                            continue block71;
                        }
                        case -862437461: {
                            break block71;
                        }
                        case 718530074: {
                            v11 = fz.jflz("jfnh", jfmf(int ), (int)15);
                            continue block71;
                        }
                    }
                    break;
                }
                v12 = fz.mc.field_1724;
                v13 /* !! */  = fz.rh;
                if (true) ** GOTO lbl102
                block72: while (true) {
                    v13 /* !! */  = (long)(v14 - fz.jflz("jfni", jfmf(int ), (int)16));
lbl102:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case -1977533943: {
                            v14 = fz.jflz("jfnj", jfmf(int ), (int)17);
                            continue block72;
                        }
                        case -1211552133: {
                            v14 = fz.jflz("jfnk", jfmf(int ), (int)18);
                            continue block72;
                        }
                        case -862437461: {
                            break block72;
                        }
                        case -857792799: {
                            v14 = fz.jflz("jfnl", jfmf(int ), (int)19);
                            continue block72;
                        }
                    }
                    break;
                }
                if (!(v12.field_6017 > 0.0)) ** GOTO lbl165
                if (var2_4) ** GOTO lbl34
                v15 /* !! */  = fz.rh;
                if (true) ** GOTO lbl120
                block73: while (true) {
                    v15 /* !! */  = (long)(fz.jflz("jfnn", jfmf(int ), (int)21) - fz.jflz("jfnm", jfmf(int ), (int)20));
lbl120:
                    // 2 sources

                    switch ((int)v15 /* !! */ ) {
                        case -1552848786: {
                            continue block73;
                        }
                        case -862437461: {
                            break block73;
                        }
                    }
                    break;
                }
                if (!(nq.getDistanceToGround() > fz.jflz("jfnp", jfno(int ), (int)22))) ** GOTO lbl165
                if (var2_4 || var2_4) ** GOTO lbl34
                v16 /* !! */  = fz.rh;
                if (true) ** GOTO lbl131
                block74: while (true) {
                    v16 /* !! */  = (long)(v17 - fz.jflz("jfnq", jfmf(int ), (int)23));
lbl131:
                    // 2 sources

                    switch ((int)v16 /* !! */ ) {
                        case -862437461: {
                            break block74;
                        }
                        case 22281348: {
                            v17 = fz.jflz("jfnr", jfmf(int ), (int)24);
                            continue block74;
                        }
                        case 1968475200: {
                            v17 = fz.jflz("jfns", jfmf(int ), (int)25);
                            continue block74;
                        }
                    }
                    break;
                }
                v18 /* !! */  = fz.rh;
                if (true) ** GOTO lbl144
                block75: while (true) {
                    v18 /* !! */  = (long)(v19 - fz.jflz("jfnt", jfmf(int ), (int)26));
lbl144:
                    // 2 sources

                    switch ((int)v18 /* !! */ ) {
                        case -862437461: {
                            break block75;
                        }
                        case 1452125605: {
                            v19 = fz.jflz("jfnu", jfmf(int ), (int)27);
                            continue block75;
                        }
                        case 1537059327: {
                            v19 = fz.jflz("jfnv", jfmf(int ), (int)28);
                            continue block75;
                        }
                    }
                    break;
                }
                v20 = fz.mc.field_1724;
                v21 /* !! */  = fz.rh;
                if (true) ** GOTO lbl158
                block76: while (true) {
                    v21 /* !! */  = (long)(fz.jflz("jfnx", jfmf(int ), (int)30) - fz.jflz("jfnw", jfmf(int ), (int)29));
lbl158:
                    // 2 sources

                    switch ((int)v21 /* !! */ ) {
                        case -1528141554: {
                            continue block76;
                        }
                        case -862437461: {
                            break block76;
                        }
                    }
                    break;
                }
                v20.method_18800(0.0, 0.0, 0.0);
                if (var2_4) ** GOTO lbl34
lbl165:
                // 3 sources

                if (!var2_4 && !var2_4) ** break;
                ** continue;
                return;
            }
lbl168:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)fz.jflz("jfny", jflw(int ), (int)15);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl218
            }
            case 1: {
                var3_3 /* !! */  = (int)fz.jflz("jfnz", jflw(int ), (int)16);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl205
            }
lbl178:
            // 2 sources

            case 2: {
                var3_3 /* !! */  = (int)fz.jflz("jfoa", jflw(int ), (int)17);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl210
            }
            case 3: {
                var3_3 /* !! */  = (int)fz.jflz("jfob", jflw(int ), (int)18);
                if (!var4_2) ** GOTO lbl178
                throw null;
            }
lbl187:
            // 3 sources

            case 4: {
                var3_3 /* !! */  = (int)fz.jflz("jfoc", jflw(int ), (int)19);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl226
            }
lbl192:
            // 2 sources

            case 5: {
                var3_3 /* !! */  = (int)fz.jflz("jfod", jflw(int ), (int)20);
                if (!var4_2) ** GOTO lbl187
                throw null;
            }
lbl196:
            // 2 sources

            case 6: {
                var3_3 /* !! */  = (int)fz.jflz("jfoe", jflw(int ), (int)21);
                if (!var4_2) ** GOTO lbl168
                throw null;
            }
lbl200:
            // 3 sources

            case 7: {
                var3_3 /* !! */  = (int)fz.jflz("jfof", jflw(int ), (int)22);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl231
            }
lbl205:
            // 3 sources

            case 8: {
                var3_3 /* !! */  = (int)fz.jflz("jfog", jflw(int ), (int)23);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl214
            }
lbl210:
            // 2 sources

            case 9: {
                var3_3 /* !! */  = (int)fz.jflz("jfoh", jflw(int ), (int)24);
                if (!var4_2) ** GOTO lbl200
                throw null;
            }
lbl214:
            // 3 sources

            case 10: {
                var3_3 /* !! */  = (int)fz.jflz("jfoi", jflw(int ), (int)25);
                if (!var4_2) ** GOTO lbl192
                throw null;
            }
lbl218:
            // 2 sources

            case 11: {
                var3_3 /* !! */  = (int)fz.jflz("jfoj", jflw(int ), (int)26);
                if (!var4_2) ** GOTO lbl214
                throw null;
            }
            case 12: {
                var3_3 /* !! */  = (int)fz.jflz("jfok", jflw(int ), (int)27);
                if (!var4_2) ** GOTO lbl200
                throw null;
            }
lbl226:
            // 2 sources

            case 13: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)fz.jflz("jfol", jflw(int ), (int)28);
                    if (!var4_2) ** GOTO lbl205
                    throw null;
                }
            }
lbl231:
            // 2 sources

            case 14: {
                var3_3 /* !! */  = (int)fz.jflz("jfom", jflw(int ), (int)29);
                if (!var4_2) ** GOTO lbl196
                throw null;
            }
            case 15: {
                var3_3 /* !! */  = (int)fz.jflz("jfon", jflw(int ), (int)30);
                if (!var4_2) ** GOTO lbl187
                throw null;
            }
            case 16: 
        }
        var3_3 /* !! */  = (int)fz.jflz("jfoo", jflw(int ), (int)31);
        ** while (!var4_2)
lbl242:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ int jflw(int n2) {
        return jflx[n2] ^ jfly[n2];
    }

    private static /* synthetic */ double jfno(int n2) {
        return Double.longBitsToDouble(jfmg[n2] ^ jfmh[n2]);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public kf getMode() {
        v0 /* !! */  = fz.rh;
        block22: while (true) {
            switch ((int)v0 /* !! */ ) {
                case -862437461: {
                    break block22;
                }
                case 370534014: {
                    v0 /* !! */  = (long)(fz.jflz("jfoq", jfmf(int ), (int)32) - fz.jflz("jfop", jfmf(int ), (int)31));
                    continue block22;
                }
            }
            break;
        }
        var3_1 = fz.c;
        v1 /* !! */  = fz.rh;
        if (true) ** GOTO lbl14
        block23: while (true) {
            v1 /* !! */  = (long)(v2 - fz.jflz("jfor", jfmf(int ), (int)33));
lbl14:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -862437461: {
                    break block23;
                }
                case 232567534: {
                    v2 = fz.jflz("jfos", jfmf(int ), (int)34);
                    continue block23;
                }
                case 338708152: {
                    v2 = fz.jflz("jfot", jfmf(int ), (int)35);
                    continue block23;
                }
                case 1465515839: {
                    v2 = fz.jflz("jfou", jfmf(int ), (int)36);
                    continue block23;
                }
            }
            break;
        }
        var2_2 /* !! */  = fz.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v3 /* !! */  = fz.rh;
                block24: while (true) {
                    switch ((int)v3 /* !! */ ) {
                        case -1191535520: {
                            v4 = fz.jflz("jfow", jfmf(int ), (int)38);
                            ** GOTO lbl43
                        }
                        case -862437461: {
                            break block24;
                        }
                        case -474854511: {
                            v4 = fz.jflz("jfox", jfmf(int ), (int)39);
                            ** GOTO lbl43
                        }
                        case 1790084188: {
                            v4 = fz.jflz("jfoy", jfmf(int ), (int)40);
lbl43:
                            // 3 sources

                            v3 /* !! */  = (long)(v4 - fz.jflz("jfov", jfmf(int ), (int)37));
                            continue block24;
                        }
                    }
                    break;
                }
                var1_3 = fz.a;
                if (var3_1) {
                    throw null;
                }
                if (var1_3 != false) return null;
                if (var1_3 != false) return null;
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_0 = fz.rh - fz.jflz("jfoz", jfmf(int ), (int)41)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == fz.jflz("jfpa", jflw(int ), (int)32)) {
                        return this.mode;
                    }
                    v5 /* !! */  = (long)fz.jflz("jfpb", jflw(int ), (int)33);
                }
            }
            case 0: {
                do {
                    var2_2 /* !! */  = (int)fz.jflz("jfpc", jflw(int ), (int)34);
                } while (!var3_1);
                throw null;
            }
            case 1: {
                ** GOTO lbl68
            }
            case 3: {
                var2_2 /* !! */  = (int)fz.jflz("jfpf", jflw(int ), (int)37);
                if (var3_1) {
                    throw null;
                }
lbl68:
                // 3 sources

                var2_2 /* !! */  = (int)fz.jflz("jfpd", jflw(int ), (int)35);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: 
        }
        do {
            var2_2 /* !! */  = (int)fz.jflz("jfpe", jflw(int ), (int)36);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ void jfph() {
        fz.jfly[0] = -1668370478;
        fz.jfly[1] = 104519102;
        fz.jfly[2] = -672166532;
        fz.jfly[3] = 1361890784;
        fz.jfly[4] = 748757278;
        fz.jfly[5] = 1561560719;
        fz.jfly[6] = 1245655367;
        fz.jfly[7] = 904343459;
        fz.jfly[8] = 1725015807;
        fz.jfly[9] = -625695827;
        fz.jfly[10] = -212075123;
        fz.jfly[11] = -1577896784;
        fz.jfly[12] = -1972760528;
        fz.jfly[13] = -881368535;
        fz.jfly[14] = 173664838;
        fz.jfly[15] = 132649688;
        fz.jfly[16] = -869077714;
        fz.jfly[17] = 90690164;
        fz.jfly[18] = -1304289446;
        fz.jfly[19] = 398140726;
        fz.jfly[20] = 811267019;
        fz.jfly[21] = 1996205445;
        fz.jfly[22] = 1140552664;
        fz.jfly[23] = -1080390686;
        fz.jfly[24] = -1183609690;
        fz.jfly[25] = 1542324812;
        fz.jfly[26] = -583589260;
        fz.jfly[27] = 795316333;
        fz.jfly[28] = 777319441;
        fz.jfly[29] = -1057283862;
        fz.jfly[30] = -1375165742;
        fz.jfly[31] = -1095640439;
        fz.jfly[32] = -1743727018;
        fz.jfly[33] = 1679195385;
        fz.jfly[34] = -1089351049;
        fz.jfly[35] = 764746508;
        fz.jfly[36] = 1152535170;
        fz.jfly[37] = 399859933;
    }

    private static /* synthetic */ void jfpg() {
        fz.jflx[0] = -1668370480;
        fz.jflx[1] = 104519101;
        fz.jflx[2] = -672166536;
        fz.jflx[3] = 1361890787;
        fz.jflx[4] = 748757277;
        fz.jflx[5] = 1561560718;
        fz.jflx[6] = 1526011698;
        fz.jflx[7] = -904343460;
        fz.jflx[8] = 144702889;
        fz.jflx[9] = 625695826;
        fz.jflx[10] = -1380208161;
        fz.jflx[11] = 1577896783;
        fz.jflx[12] = -1759434001;
        fz.jflx[13] = 881368534;
        fz.jflx[14] = -305111313;
        fz.jflx[15] = 132649685;
        fz.jflx[16] = -869077728;
        fz.jflx[17] = 90690164;
        fz.jflx[18] = -1304289455;
        fz.jflx[19] = 398140732;
        fz.jflx[20] = 811267021;
        fz.jflx[21] = 1996205461;
        fz.jflx[22] = 1140552667;
        fz.jflx[23] = -1080390680;
        fz.jflx[24] = -1183609687;
        fz.jflx[25] = 1542324811;
        fz.jflx[26] = -583589276;
        fz.jflx[27] = 795316328;
        fz.jflx[28] = 777319455;
        fz.jflx[29] = -1057283858;
        fz.jflx[30] = -1375165733;
        fz.jflx[31] = -1095640438;
        fz.jflx[32] = 1743727017;
        fz.jflx[33] = 539935439;
        fz.jflx[34] = -1089351052;
        fz.jflx[35] = 764746510;
        fz.jflx[36] = 1152535169;
        fz.jflx[37] = 399859933;
    }
}

