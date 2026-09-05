/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.function.Supplier;
import ruhack.phobia.jx;

public class kc
extends jx {
    private String buttonName;
    private static int[] ljvb = new int[55];
    public static final int b;
    public static final boolean a;
    static final long ua = -4225679470804211527L;
    public static final boolean c;
    private static int[] ljvc;
    private static long[] ljvj;
    private Runnable runnable;
    private static long[] ljvi;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public kc setRunnable(Runnable var1_1) {
        v0 /* !! */  = kc.ua;
        if (true) ** GOTO lbl5
        block23: while (true) {
            v0 /* !! */  = (long)(v1 - kc.ljvd("ljxh", ljvh(int ), (int)17));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1104301547: {
                    v1 = kc.ljvd("ljxi", ljvh(int ), (int)18);
                    continue block23;
                }
                case -428505130: {
                    v1 = kc.ljvd("ljxj", ljvh(int ), (int)19);
                    continue block23;
                }
                case -267523911: {
                    break block23;
                }
                case 1172972650: {
                    v1 = kc.ljvd("ljxk", ljvh(int ), (int)20);
                    continue block23;
                }
            }
            break;
        }
        var4_2 = kc.c;
        v2 /* !! */  = kc.ua;
        if (true) ** GOTO lbl22
        block24: while (true) {
            v2 /* !! */  = (long)(kc.ljvd("ljxm", ljvh(int ), (int)22) - kc.ljvd("ljxl", ljvh(int ), (int)21));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -267523911: {
                    break block24;
                }
                case 2098879683: {
                    continue block24;
                }
            }
            break;
        }
        var3_3 /* !! */  = kc.b;
        v3 /* !! */  = kc.ua;
        if (true) ** GOTO lbl32
        block25: while (true) {
            v3 /* !! */  = (long)(v4 - kc.ljvd("ljxn", ljvh(int ), (int)23));
lbl32:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1586997097: {
                    v4 = kc.ljvd("ljxo", ljvh(int ), (int)24);
                    continue block25;
                }
                case -1084003225: {
                    v4 = kc.ljvd("ljxp", ljvh(int ), (int)25);
                    continue block25;
                }
                case -267523911: {
                    break block25;
                }
                case 195336652: {
                    v4 = kc.ljvd("ljxq", ljvh(int ), (int)26);
                    continue block25;
                }
            }
            break;
        }
        var2_4 = kc.a;
        if (var4_2) {
            throw null;
lbl47:
            // 2 sources

            return null;
        }
        if (var2_4 || var2_4) ** GOTO lbl47
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_0 = kc.ua - kc.ljvd("ljxr", ljvh(int ), (int)27)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == kc.ljvd("ljxs", ljva(int ), (int)35)) break;
            v5 /* !! */  = (long)kc.ljvd("ljxt", ljva(int ), (int)36);
        }
        this.runnable = var1_1;
        if (!var2_4) ** break;
        ** while (true)
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                return this;
            }
lbl62:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)kc.ljvd("ljxu", ljva(int ), (int)37);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl72
                    break;
                }
            }
            case 1: {
                var3_3 /* !! */  = (int)kc.ljvd("ljxv", ljva(int ), (int)38);
                if (!var4_2) ** GOTO lbl62
                throw null;
            }
lbl72:
            // 2 sources

            case 2: {
                var3_3 /* !! */  = (int)kc.ljvd("ljxw", ljva(int ), (int)39);
                if (var4_2) {
                    throw null;
                }
            }
            case 3: {
                do {
                    var3_3 /* !! */  = (int)kc.ljvd("ljxx", ljva(int ), (int)40);
                } while (!var4_2);
                throw null;
            }
            case 4: 
        }
        var3_3 /* !! */  = (int)kc.ljvd("ljxy", ljva(int ), (int)41);
        ** while (!var4_2)
lbl84:
        // 1 sources

        throw null;
    }

    static {
        ljvc = new int[55];
        kc.ljyq();
        kc.ljyr();
        ljvi = new long[32];
        ljvj = new long[32];
        kc.ljys();
        kc.ljyt();
    }

    private static /* synthetic */ long ljvh(int n2) {
        return ljvi[n2] ^ ljvj[n2];
    }

    private static /* synthetic */ void ljyt() {
        kc.ljvj[0] = 5574847082292298518L;
        kc.ljvj[1] = 4286656739380913592L;
        kc.ljvj[2] = 8173528013331360709L;
        kc.ljvj[3] = -6254162741638093417L;
        kc.ljvj[4] = 2705593773845870185L;
        kc.ljvj[5] = -5653481609189481485L;
        kc.ljvj[6] = 1570328861944910882L;
        kc.ljvj[7] = 7635641383729764814L;
        kc.ljvj[8] = -1228588161481193591L;
        kc.ljvj[9] = -2987200535189909936L;
        kc.ljvj[10] = 2225516608333967565L;
        kc.ljvj[11] = 4919874862344764127L;
        kc.ljvj[12] = -185853052062832396L;
        kc.ljvj[13] = 4272278994213361362L;
        kc.ljvj[14] = 4997863793771270577L;
        kc.ljvj[15] = -9073069336288615652L;
        kc.ljvj[16] = -6937960595126213708L;
        kc.ljvj[17] = -4927579947031793758L;
        kc.ljvj[18] = -7871081416858010151L;
        kc.ljvj[19] = 223541639698617698L;
        kc.ljvj[20] = -3510791052288161039L;
        kc.ljvj[21] = 5696009869689798248L;
        kc.ljvj[22] = -4121196483553322653L;
        kc.ljvj[23] = -1192230248501399175L;
        kc.ljvj[24] = -5418893850653133564L;
        kc.ljvj[25] = -3246421166941644170L;
        kc.ljvj[26] = 5416651547237686660L;
        kc.ljvj[27] = -6262523267207333204L;
        kc.ljvj[28] = 4682793441613305516L;
        kc.ljvj[29] = -7796594114457581653L;
        kc.ljvj[30] = -8420967025061612579L;
        kc.ljvj[31] = -2833695042977029382L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public Runnable getRunnable() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = kc.ua - kc.ljvd("ljwc", ljvh(int ), (int)4)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == kc.ljvd("ljwd", ljva(int ), (int)17)) break;
            v0 /* !! */  = (long)kc.ljvd("ljwe", ljva(int ), (int)18);
        }
        var3_1 = kc.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = kc.ua - kc.ljvd("ljwf", ljvh(int ), (int)5)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == kc.ljvd("ljwg", ljva(int ), (int)19)) break;
            v1 /* !! */  = (long)kc.ljvd("ljwh", ljva(int ), (int)20);
        }
        var2_2 /* !! */  = kc.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = kc.ua - kc.ljvd("ljwi", ljvh(int ), (int)6)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == kc.ljvd("ljwj", ljva(int ), (int)21)) break;
            v2 /* !! */  = (long)kc.ljvd("ljwk", ljva(int ), (int)22);
        }
        var1_3 = kc.a;
        if (var3_1) {
            throw null;
lbl24:
            // 1 sources

            return null;
        }
        ** while (var1_3 || var1_3)
lbl27:
        // 1 sources

        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_3 = kc.ua - kc.ljvd("ljwl", ljvh(int ), (int)7)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == kc.ljvd("ljwm", ljva(int ), (int)23)) break;
                    v3 /* !! */  = (long)kc.ljvd("ljwn", ljva(int ), (int)24);
                }
                return this.runnable;
            }
lbl37:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)kc.ljvd("ljwo", ljva(int ), (int)25);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl46
            }
            case 1: {
                var2_2 /* !! */  = (int)kc.ljvd("ljwp", ljva(int ), (int)26);
                if (!var3_1) ** GOTO lbl37
                throw null;
            }
lbl46:
            // 2 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)kc.ljvd("ljwq", ljva(int ), (int)27);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)kc.ljvd("ljwr", ljva(int ), (int)28);
        ** while (!var3_1)
lbl54:
        // 1 sources

        throw null;
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public kc(String string, String string2) {
        int n2 = b;
        super(string, string2);
        if (n2 == 0) return;
        switch (n2) {
            default: {
                return;
            }
            case 0: {
                while (true) {
                    CallSite callSite = kc.ljvd("ljve", ljva(int ), (int)0);
                }
            }
            case 1: {
                break;
            }
            case 2: {
                CallSite callSite = kc.ljvd("ljvg", ljva(int ), (int)2);
            }
        }
        while (true) {
            CallSite callSite = kc.ljvd("ljvf", ljva(int ), (int)1);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public kc setButtonName(String var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = kc.ua - kc.ljvd("ljxz", ljvh(int ), (int)28)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == kc.ljvd("ljya", ljva(int ), (int)42)) break;
            v0 /* !! */  = (long)kc.ljvd("ljyb", ljva(int ), (int)43);
        }
        var4_2 = kc.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = kc.ua - kc.ljvd("ljyc", ljvh(int ), (int)29)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == kc.ljvd("ljyd", ljva(int ), (int)44)) break;
            v1 /* !! */  = (long)kc.ljvd("ljye", ljva(int ), (int)45);
        }
        var3_3 /* !! */  = kc.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = kc.ua - kc.ljvd("ljyf", ljvh(int ), (int)30)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == kc.ljvd("ljyg", ljva(int ), (int)46)) break;
            v2 /* !! */  = (long)kc.ljvd("ljyh", ljva(int ), (int)47);
        }
        var2_4 = kc.a;
        if (var4_2) {
            throw null;
lbl21:
            // 2 sources

            return null;
        }
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4 || var2_4) ** GOTO lbl21
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_3 = kc.ua - kc.ljvd("ljyi", ljvh(int ), (int)31)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == kc.ljvd("ljyj", ljva(int ), (int)48)) break;
                    v3 /* !! */  = (long)kc.ljvd("ljyk", ljva(int ), (int)49);
                }
                this.buttonName = var1_1;
                if (!var2_4) ** break;
                ** continue;
                return this;
            }
lbl36:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)kc.ljvd("ljyl", ljva(int ), (int)50);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl50
                    break;
                }
            }
            case 1: {
                var3_3 /* !! */  = (int)kc.ljvd("ljym", ljva(int ), (int)51);
                if (!var4_2) ** GOTO lbl36
                throw null;
            }
lbl46:
            // 2 sources

            case 2: {
                var3_3 /* !! */  = (int)kc.ljvd("ljyn", ljva(int ), (int)52);
                if (!var4_2) break;
                throw null;
            }
lbl50:
            // 2 sources

            case 3: {
                var3_3 /* !! */  = (int)kc.ljvd("ljyo", ljva(int ), (int)53);
                if (!var4_2) ** GOTO lbl46
                throw null;
            }
            case 4: 
        }
        var3_3 /* !! */  = (int)kc.ljvd("ljyp", ljva(int ), (int)54);
        ** while (!var4_2)
lbl57:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ljyr() {
        kc.ljvc[0] = -2014644488;
        kc.ljvc[1] = 658551834;
        kc.ljvc[2] = 1861677985;
        kc.ljvc[3] = 388904002;
        kc.ljvc[4] = 866631569;
        kc.ljvc[5] = -821899939;
        kc.ljvc[6] = 1004858870;
        kc.ljvc[7] = 1080818112;
        kc.ljvc[8] = -809612835;
        kc.ljvc[9] = 1255569238;
        kc.ljvc[10] = -1497642728;
        kc.ljvc[11] = -993825811;
        kc.ljvc[12] = -2115624209;
        kc.ljvc[13] = -363280769;
        kc.ljvc[14] = 1105619795;
        kc.ljvc[15] = 446570003;
        kc.ljvc[16] = 1673558569;
        kc.ljvc[17] = 1002063249;
        kc.ljvc[18] = 195317424;
        kc.ljvc[19] = 936589873;
        kc.ljvc[20] = -805549389;
        kc.ljvc[21] = -749332281;
        kc.ljvc[22] = 884473880;
        kc.ljvc[23] = 444112825;
        kc.ljvc[24] = -673815375;
        kc.ljvc[25] = 275533833;
        kc.ljvc[26] = -798739506;
        kc.ljvc[27] = -465383487;
        kc.ljvc[28] = 262102445;
        kc.ljvc[29] = 1029897207;
        kc.ljvc[30] = 1226104294;
        kc.ljvc[31] = 1174953744;
        kc.ljvc[32] = 608606310;
        kc.ljvc[33] = 517089608;
        kc.ljvc[34] = -1377845523;
        kc.ljvc[35] = 721063529;
        kc.ljvc[36] = -735256350;
        kc.ljvc[37] = 605124161;
        kc.ljvc[38] = -921826710;
        kc.ljvc[39] = 907359940;
        kc.ljvc[40] = 552347938;
        kc.ljvc[41] = -1766382599;
        kc.ljvc[42] = -422645443;
        kc.ljvc[43] = -326601966;
        kc.ljvc[44] = -1274112679;
        kc.ljvc[45] = 1981742107;
        kc.ljvc[46] = 557642298;
        kc.ljvc[47] = 1537289969;
        kc.ljvc[48] = 816220151;
        kc.ljvc[49] = 2057884005;
        kc.ljvc[50] = -1639983997;
        kc.ljvc[51] = 734221203;
        kc.ljvc[52] = -1314417680;
        kc.ljvc[53] = -1413463013;
        kc.ljvc[54] = -901611008;
    }

    private static /* synthetic */ int ljva(int n2) {
        return ljvb[n2] ^ ljvc[n2];
    }

    public static /* synthetic */ CallSite ljvd(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public kc visible(Supplier<Boolean> var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = kc.ua - kc.ljvd("ljvk", ljvh(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == kc.ljvd("ljvl", ljva(int ), (int)3)) break;
            v0 /* !! */  = (long)kc.ljvd("ljvm", ljva(int ), (int)4);
        }
        var4_2 = kc.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = kc.ua - kc.ljvd("ljvn", ljvh(int ), (int)1)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == kc.ljvd("ljvo", ljva(int ), (int)5)) break;
            v1 /* !! */  = (long)kc.ljvd("ljvp", ljva(int ), (int)6);
        }
        var3_3 /* !! */  = kc.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = kc.ua - kc.ljvd("ljvq", ljvh(int ), (int)2)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == kc.ljvd("ljvr", ljva(int ), (int)7)) break;
            v2 /* !! */  = (long)kc.ljvd("ljvs", ljva(int ), (int)8);
        }
        var2_4 = kc.a;
        if (var4_2) {
            throw null;
lbl21:
            // 3 sources

            return null;
        }
        if (var2_4 || var2_4) ** GOTO lbl21
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_3 = kc.ua - kc.ljvd("ljvt", ljvh(int ), (int)3)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == kc.ljvd("ljvu", ljva(int ), (int)9)) break;
            v3 /* !! */  = (long)kc.ljvd("ljvv", ljva(int ), (int)10);
        }
        this.setVisible(var1_1);
        if (var2_4) ** GOTO lbl21
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var2_4) ** break;
                ** continue;
                return this;
            }
            case 0: {
                var3_3 /* !! */  = (int)kc.ljvd("ljvw", ljva(int ), (int)11);
                if (!var4_2) break;
                throw null;
            }
lbl41:
            // 2 sources

            case 1: {
                var3_3 /* !! */  = (int)kc.ljvd("ljvx", ljva(int ), (int)12);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl56
            }
            case 2: {
                do {
                    var3_3 /* !! */  = (int)kc.ljvd("ljvy", ljva(int ), (int)13);
                } while (!var4_2);
                throw null;
            }
            case 3: {
                do {
                    var3_3 /* !! */  = (int)kc.ljvd("ljvz", ljva(int ), (int)14);
                } while (!var4_2);
                throw null;
            }
lbl56:
            // 2 sources

            case 4: {
                var3_3 /* !! */  = (int)kc.ljvd("ljwa", ljva(int ), (int)15);
                if (!var4_2) ** GOTO lbl41
                throw null;
            }
            case 5: 
        }
        do {
            var3_3 /* !! */  = (int)kc.ljvd("ljwb", ljva(int ), (int)16);
        } while (!var4_2);
        throw null;
    }

    private static /* synthetic */ void ljys() {
        kc.ljvi[0] = 2201916458039215642L;
        kc.ljvi[1] = 4457078046500461664L;
        kc.ljvi[2] = 5333897907917719548L;
        kc.ljvi[3] = -2341772254497631520L;
        kc.ljvi[4] = 290992150443563823L;
        kc.ljvi[5] = -6044031601823354315L;
        kc.ljvi[6] = -6147334251580994328L;
        kc.ljvi[7] = 8282956636268592549L;
        kc.ljvi[8] = -7172087100618260213L;
        kc.ljvi[9] = -5644057286013294105L;
        kc.ljvi[10] = -7405135984518019113L;
        kc.ljvi[11] = 6687151136942912081L;
        kc.ljvi[12] = 8967941255700326481L;
        kc.ljvi[13] = -2185565520436638934L;
        kc.ljvi[14] = -7449777788718439217L;
        kc.ljvi[15] = -945824364066496573L;
        kc.ljvi[16] = 9015677454743301890L;
        kc.ljvi[17] = 5805401124281442260L;
        kc.ljvi[18] = -6216571296778381844L;
        kc.ljvi[19] = 345159244585323579L;
        kc.ljvi[20] = 1463286352363276123L;
        kc.ljvi[21] = -4161046819341580956L;
        kc.ljvi[22] = -7582556593416265773L;
        kc.ljvi[23] = 256630922104651026L;
        kc.ljvi[24] = -4496586080876846396L;
        kc.ljvi[25] = -9071841729173467754L;
        kc.ljvi[26] = -2724444146294255008L;
        kc.ljvi[27] = -1976650576294451348L;
        kc.ljvi[28] = 884679731097793547L;
        kc.ljvi[29] = 1093137791438867151L;
        kc.ljvi[30] = 2926705124480599166L;
        kc.ljvi[31] = -4898960627988645351L;
    }

    private static /* synthetic */ void ljyq() {
        kc.ljvb[0] = -2014644487;
        kc.ljvb[1] = 658551832;
        kc.ljvb[2] = 1861677987;
        kc.ljvb[3] = -388904003;
        kc.ljvb[4] = 2102210607;
        kc.ljvb[5] = 821899938;
        kc.ljvb[6] = 1480715486;
        kc.ljvb[7] = -1080818113;
        kc.ljvb[8] = 1784949427;
        kc.ljvb[9] = -1255569239;
        kc.ljvb[10] = 414180593;
        kc.ljvb[11] = -993825816;
        kc.ljvb[12] = -2115624211;
        kc.ljvb[13] = -363280774;
        kc.ljvb[14] = 1105619795;
        kc.ljvb[15] = 446570000;
        kc.ljvb[16] = 1673558571;
        kc.ljvb[17] = -1002063250;
        kc.ljvb[18] = 1341963686;
        kc.ljvb[19] = -936589874;
        kc.ljvb[20] = 1395876248;
        kc.ljvb[21] = -749332282;
        kc.ljvb[22] = 334194501;
        kc.ljvb[23] = -444112826;
        kc.ljvb[24] = -2113099184;
        kc.ljvb[25] = 275533835;
        kc.ljvb[26] = -798739506;
        kc.ljvb[27] = -465383488;
        kc.ljvb[28] = 262102445;
        kc.ljvb[29] = 1029897206;
        kc.ljvb[30] = -1896152428;
        kc.ljvb[31] = 1174953744;
        kc.ljvb[32] = 608606310;
        kc.ljvb[33] = 517089611;
        kc.ljvb[34] = -1377845521;
        kc.ljvb[35] = -721063530;
        kc.ljvb[36] = -1855658979;
        kc.ljvb[37] = 605124165;
        kc.ljvb[38] = -921826711;
        kc.ljvb[39] = 907359942;
        kc.ljvb[40] = 552347936;
        kc.ljvb[41] = -1766382597;
        kc.ljvb[42] = 422645442;
        kc.ljvb[43] = -1513437533;
        kc.ljvb[44] = -1274112680;
        kc.ljvb[45] = 869545422;
        kc.ljvb[46] = 557642299;
        kc.ljvb[47] = 71980025;
        kc.ljvb[48] = -816220152;
        kc.ljvb[49] = -706860890;
        kc.ljvb[50] = -1639983999;
        kc.ljvb[51] = 734221207;
        kc.ljvb[52] = -1314417677;
        kc.ljvb[53] = -1413463014;
        kc.ljvb[54] = -901611004;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public String getButtonName() {
        v0 /* !! */  = kc.ua;
        if (true) ** GOTO lbl5
        block20: while (true) {
            v0 /* !! */  = (long)(kc.ljvd("ljwt", ljvh(int ), (int)9) - kc.ljvd("ljws", ljvh(int ), (int)8));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -267523911: {
                    break block20;
                }
                case 1883461980: {
                    continue block20;
                }
            }
            break;
        }
        var3_1 = kc.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = kc.ua - kc.ljvd("ljwu", ljvh(int ), (int)10)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == kc.ljvd("ljwv", ljva(int ), (int)29)) break;
            v1 /* !! */  = (long)kc.ljvd("ljww", ljva(int ), (int)30);
        }
        var2_2 /* !! */  = kc.b;
        v2 /* !! */  = kc.ua;
        if (true) ** GOTO lbl22
        block22: while (true) {
            v2 /* !! */  = (long)(kc.ljvd("ljwy", ljvh(int ), (int)12) - kc.ljvd("ljwx", ljvh(int ), (int)11));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1285640383: {
                    continue block22;
                }
                case -267523911: {
                    break block22;
                }
            }
            break;
        }
        var1_3 = kc.a;
        if (!var3_1) ** GOTO lbl34
        throw null;
        {
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var2_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return null;
                }
lbl34:
                // 1 sources

                if (var1_3 || var1_3) continue block23;
                v3 /* !! */  = kc.ua;
                if (true) ** GOTO lbl39
                block24: while (true) {
                    v3 /* !! */  = (long)(v4 - kc.ljvd("ljwz", ljvh(int ), (int)13));
lbl39:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1596369643: {
                            v4 = kc.ljvd("ljxa", ljvh(int ), (int)14);
                            continue block24;
                        }
                        case -1222678378: {
                            v4 = kc.ljvd("ljxb", ljvh(int ), (int)15);
                            continue block24;
                        }
                        case -267523911: {
                            break block24;
                        }
                        case 528051888: {
                            v4 = kc.ljvd("ljxc", ljvh(int ), (int)16);
                            continue block24;
                        }
                    }
                    break;
                }
                return this.buttonName;
                case 0: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var2_2 /* !! */  = (int)kc.ljvd("ljxd", ljva(int ), (int)31);
                        if (!var3_1) break block23;
                        throw null;
                    }
                }
lbl57:
                // 2 sources

                case 1: {
                    var2_2 /* !! */  = (int)kc.ljvd("ljxe", ljva(int ), (int)32);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 2: {
                    var2_2 /* !! */  = (int)kc.ljvd("ljxf", ljva(int ), (int)33);
                    if (!var3_1) ** GOTO lbl57
                    throw null;
                }
                case 3: 
            }
        }
        var2_2 /* !! */  = (int)kc.ljvd("ljxg", ljva(int ), (int)34);
        ** while (!var3_1)
lbl68:
        // 1 sources

        throw null;
    }
}

