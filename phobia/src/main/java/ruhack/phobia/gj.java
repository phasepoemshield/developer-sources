/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import ruhack.phobia.ds;
import ruhack.phobia.du;
import ruhack.phobia.jx;
import ruhack.phobia.kf;
import ruhack.phobia.nj;

public final class gj
extends ds {
    public final kf guiType;
    public static final boolean c;
    public static final int b;
    private static long[] edlu;
    private static int[] edla;
    public static final boolean a;
    private static int[] edkz;
    public static final String NEW = "New";
    private static long[] edlr;
    private static final long kj = -3742207653396900047L;

    public static /* synthetic */ CallSite edlb(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ long edlq(int n2) {
        return edlr[n2] ^ edlu[n2];
    }

    static {
        edkz = new int[36];
        edla = new int[36];
        gj.edqg();
        gj.edqj();
        edlr = new long[35];
        edlu = new long[35];
        gj.edqq();
        gj.edqv();
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    @Override
    public void setState(boolean bl2) {
        Object object = kj;
        boolean bl3 = true;
        block24: while (true) {
            CallSite callSite;
            if (!bl3 || (bl3 = false) || !true) {
                object = callSite - gj.edlb("edow", edlq(int ), (int)24);
            }
            switch ((int)object) {
                case -327378045: {
                    callSite = gj.edlb("edox", edlq(int ), (int)25);
                    continue block24;
                }
                case -89015356: {
                    callSite = gj.edlb("edoy", edlq(int ), (int)26);
                    continue block24;
                }
                case 1602721585: {
                    break block24;
                }
                case 1815011832: {
                    callSite = gj.edlb("edpa", edlq(int ), (int)27);
                    continue block24;
                }
            }
            break;
        }
        boolean bl4 = c;
        Object object2 = kj;
        block25: while (true) {
            switch ((int)object2) {
                case -1945903595: {
                    object2 = gj.edlb("edpd", edlq(int ), (int)29) - gj.edlb("edpc", edlq(int ), (int)28);
                    continue block25;
                }
                case 1602721585: {
                    break block25;
                }
            }
            break;
        }
        int n2 = b;
        Object object3 = kj;
        boolean bl5 = true;
        block26: while (true) {
            CallSite callSite;
            if (!bl5 || (bl5 = false) || !true) {
                object3 = callSite - gj.edlb("edpf", edlq(int ), (int)30);
            }
            switch ((int)object3) {
                case -852352736: {
                    callSite = gj.edlb("edph", edlq(int ), (int)31);
                    continue block26;
                }
                case 1452804852: {
                    callSite = gj.edlb("edpi", edlq(int ), (int)32);
                    continue block26;
                }
                case 1602721585: {
                    break block26;
                }
                case 2111381477: {
                    callSite = gj.edlb("edpj", edlq(int ), (int)33);
                    continue block26;
                }
            }
            break;
        }
        boolean bl6 = a;
        if (bl4) {
            throw null;
        }
        if (bl6 || bl6) return;
        CallSite callSite = gj.edlb("edpn", edks(int ), (int)27);
        while (true) {
            long l2;
            Object object4;
            if ((object4 = (l2 = kj - gj.edlb("edpo", edlq(int ), (int)34)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (object4 == gj.edlb("edpq", edks(int ), (int)28)) {
                this.state = callSite;
                if (bl6) return;
                break;
            }
            object4 = gj.edlb("edpr", edks(int ), (int)29);
        }
        if (bl6) {
            return;
        }
        if (n2 == 0) return;
        switch (n2) {
            default: {
                return;
            }
            case 2: {
                break;
            }
            case 4: {
                CallSite callSite2 = gj.edlb("edqa", edks(int ), (int)34);
                if (bl4) {
                    throw null;
                }
            }
            case 0: {
                CallSite callSite3 = gj.edlb("edpv", edks(int ), (int)30);
                if (bl4) {
                    throw null;
                }
            }
            case 1: {
                CallSite callSite4 = gj.edlb("edpw", edks(int ), (int)31);
                if (bl4) {
                    throw null;
                }
            }
            case 3: {
                do {
                    CallSite callSite5 = gj.edlb("edpy", edks(int ), (int)33);
                } while (!bl4);
                throw null;
            }
            case 5: {
                CallSite callSite6 = gj.edlb("edqc", edks(int ), (int)35);
                if (!bl4) break;
                throw null;
            }
        }
        do {
            CallSite callSite7 = gj.edlb("edpx", edks(int ), (int)32);
        } while (!bl4);
        throw null;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public boolean isBindable() {
        Object object = kj;
        block8: while (true) {
            switch ((int)object) {
                case -86763539: {
                    object = gj.edlb("edob", edlq(int ), (int)20) - gj.edlb("edoa", edlq(int ), (int)19);
                    continue block8;
                }
                case 1602721585: {
                    break block8;
                }
            }
            break;
        }
        boolean bl2 = c;
        while (true) {
            long l2;
            Object object2;
            if ((object2 = (l2 = kj - gj.edlb("edoe", edlq(int ), (int)21)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object2 == gj.edlb("edog", edks(int ), (int)19)) break;
            object2 = gj.edlb("edoh", edks(int ), (int)20);
        }
        int n2 = b;
        Object object3 = kj;
        block10: while (true) {
            switch ((int)object3) {
                case 1364989328: {
                    object3 = gj.edlb("edok", edlq(int ), (int)23) - gj.edlb("edoj", edlq(int ), (int)22);
                    continue block10;
                }
                case 1602721585: {
                    break block10;
                }
            }
            break;
        }
        boolean bl3 = a;
        if (bl2) {
            throw null;
        }
        if (bl3 || bl3) {
            return (boolean)gj.edlb("edol", edks(int ), (int)21);
        }
        return (boolean)gj.edlb("edon", edks(int ), (int)22);
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    @Override
    public boolean isToggleable() {
        Object object = kj;
        boolean bl2 = true;
        block13: while (true) {
            CallSite callSite;
            if (!bl2 || (bl2 = false) || !true) {
                object = callSite - gj.edlb("edng", edlq(int ), (int)12);
            }
            switch ((int)object) {
                case -1296610291: {
                    callSite = gj.edlb("ednh", edlq(int ), (int)13);
                    continue block13;
                }
                case 1195242020: {
                    callSite = gj.edlb("ednl", edlq(int ), (int)14);
                    continue block13;
                }
                case 1602721585: {
                    break block13;
                }
            }
            break;
        }
        boolean bl3 = c;
        Object object2 = kj;
        block14: while (true) {
            switch ((int)object2) {
                case -422881120: {
                    object2 = gj.edlb("ednp", edlq(int ), (int)16) - gj.edlb("ednn", edlq(int ), (int)15);
                    continue block14;
                }
                case 1602721585: {
                    break block14;
                }
            }
            break;
        }
        int n2 = b;
        Object object3 = kj;
        block15: while (true) {
            switch ((int)object3) {
                case 1602721585: {
                    break block15;
                }
                case 1871788314: {
                    object3 = gj.edlb("ednr", edlq(int ), (int)18) - gj.edlb("ednq", edlq(int ), (int)17);
                    continue block15;
                }
            }
            break;
        }
        boolean bl4 = a;
        if (bl3) {
            throw null;
        }
        if (bl4 || bl4) {
            return (boolean)gj.edlb("ednt", edks(int ), (int)13);
        }
        return (boolean)gj.edlb("ednv", edks(int ), (int)14);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public gj() {
        var2_1 /* !! */  = gj.b;
        super("ClickGui", "\u041d\u043e\u0432\u044b\u0439 \u0438\u043d\u0442\u0435\u0440\u0444\u0435\u0439\u0441 \u043c\u0435\u043d\u044e \u043a\u043b\u0438\u0435\u043d\u0442\u0430", du.MISC);
        this.guiType = new kf("\u0422\u0438\u043f GUI", "\u0415\u0434\u0438\u043d\u0441\u0442\u0432\u0435\u043d\u043d\u044b\u0439 \u043d\u043e\u0432\u044b\u0439 \u0438\u043d\u0442\u0435\u0440\u0444\u0435\u0439\u0441 \u043a\u043b\u0438\u0435\u043d\u0442\u0430", "New", new String[]{"New"});
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.settings(new jx[]{this.guiType});
                this.state = gj.edlb("edlc", edks(int ), (int)0);
                return;
            }
            case 0: {
                var2_1 /* !! */  = (int)gj.edlb("edld", edks(int ), (int)1);
                ** GOTO lbl18
            }
            case 1: {
                var2_1 /* !! */  = (int)gj.edlb("edle", edks(int ), (int)2);
                ** GOTO lbl18
            }
            case 2: {
                var2_1 /* !! */  = (int)gj.edlb("edlf", edks(int ), (int)3);
            }
lbl18:
            // 4 sources

            case 3: {
                while (true) {
                    var2_1 /* !! */  = (int)gj.edlb("edln", edks(int ), (int)4);
                }
            }
            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)gj.edlb("edlo", edks(int ), (int)5);
                    break;
                }
            }
            case 5: 
        }
        var2_1 /* !! */  = (int)gj.edlb("edlp", edks(int ), (int)6);
        ** while (true)
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static gj getInstance() {
        v0 /* !! */  = gj.kj;
        if (true) ** GOTO lbl5
        block23: while (true) {
            v0 /* !! */  = (long)(v1 - gj.edlb("edma", edlq(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -220593639: {
                    v1 = gj.edlb("edmb", edlq(int ), (int)1);
                    continue block23;
                }
                case -46944731: {
                    v1 = gj.edlb("edmc", edlq(int ), (int)2);
                    continue block23;
                }
                case 98616637: {
                    v1 = gj.edlb("edmd", edlq(int ), (int)3);
                    continue block23;
                }
                case 1602721585: {
                    break block23;
                }
            }
            break;
        }
        var2 = gj.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = gj.kj - gj.edlb("edme", edlq(int ), (int)4)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == gj.edlb("edmf", edks(int ), (int)7)) break;
            v2 /* !! */  = (long)gj.edlb("edmg", edks(int ), (int)8);
        }
        var1_1 /* !! */  = gj.b;
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v3 /* !! */  = gj.kj;
                if (true) ** GOTO lbl32
                block25: while (true) {
                    v3 /* !! */  = (long)(v4 - gj.edlb("edmn", edlq(int ), (int)5));
lbl32:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1917823656: {
                            v4 = gj.edlb("edmp", edlq(int ), (int)6);
                            continue block25;
                        }
                        case -242306876: {
                            v4 = gj.edlb("edmq", edlq(int ), (int)7);
                            continue block25;
                        }
                        case 1602721585: {
                            break block25;
                        }
                    }
                    break;
                }
                var0_2 = gj.a;
                if (var2) {
                    throw null;
                    return null;
                }
                if (var0_2 || var0_2) ** continue;
                v5 /* !! */  = gj.kj;
                if (true) ** GOTO lbl51
                block27: while (true) {
                    v5 /* !! */  = (long)(v6 - gj.edlb("edmr", edlq(int ), (int)8));
lbl51:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1441105247: {
                            v6 = gj.edlb("edms", edlq(int ), (int)9);
                            continue block27;
                        }
                        case 392555923: {
                            v6 = gj.edlb("edmt", edlq(int ), (int)10);
                            continue block27;
                        }
                        case 603790270: {
                            v6 = gj.edlb("edmu", edlq(int ), (int)11);
                            continue block27;
                        }
                        case 1602721585: {
                            break block27;
                        }
                    }
                    break;
                }
                return nj.get(gj.class);
            }
lbl64:
            // 2 sources

            case 0: {
                var1_1 /* !! */  = (int)gj.edlb("edmz", edks(int ), (int)9);
                if (var2) {
                    throw null;
                }
            }
            case 1: {
                var1_1 /* !! */  = (int)gj.edlb("ednb", edks(int ), (int)10);
                if (!var2) ** GOTO lbl64
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var1_1 /* !! */  = (int)gj.edlb("ednd", edks(int ), (int)11);
                    if (!var2) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 3: 
        }
        var1_1 /* !! */  = (int)gj.edlb("ednf", edks(int ), (int)12);
        ** while (!var2)
lbl80:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void edqj() {
        gj.edla[0] = -1686453676;
        gj.edla[1] = -1422280676;
        gj.edla[2] = -807085950;
        gj.edla[3] = -135140165;
        gj.edla[4] = -93147325;
        gj.edla[5] = -850826065;
        gj.edla[6] = -356888048;
        gj.edla[7] = -256044664;
        gj.edla[8] = 883843207;
        gj.edla[9] = -1228580231;
        gj.edla[10] = 943364750;
        gj.edla[11] = -26616565;
        gj.edla[12] = 37603097;
        gj.edla[13] = 1120899858;
        gj.edla[14] = -1521112277;
        gj.edla[15] = 201325880;
        gj.edla[16] = -2045554848;
        gj.edla[17] = 353837703;
        gj.edla[18] = 1062311870;
        gj.edla[19] = -239498547;
        gj.edla[20] = -862296397;
        gj.edla[21] = -793176529;
        gj.edla[22] = 619341331;
        gj.edla[23] = 1835402357;
        gj.edla[24] = -993915066;
        gj.edla[25] = 390849995;
        gj.edla[26] = -1253856458;
        gj.edla[27] = -477642720;
        gj.edla[28] = -733870893;
        gj.edla[29] = 1929775936;
        gj.edla[30] = -2107299741;
        gj.edla[31] = 1948416521;
        gj.edla[32] = 1365245893;
        gj.edla[33] = -710083108;
        gj.edla[34] = -2134255391;
        gj.edla[35] = -1765339569;
    }

    private static /* synthetic */ void edqg() {
        gj.edkz[0] = -1686453675;
        gj.edkz[1] = -1422280674;
        gj.edkz[2] = -807085946;
        gj.edkz[3] = -135140162;
        gj.edkz[4] = -93147322;
        gj.edkz[5] = -850826066;
        gj.edkz[6] = -356888043;
        gj.edkz[7] = -256044663;
        gj.edkz[8] = 811838583;
        gj.edkz[9] = -1228580232;
        gj.edkz[10] = 943364750;
        gj.edkz[11] = -26616565;
        gj.edkz[12] = 37603099;
        gj.edkz[13] = 1120899858;
        gj.edkz[14] = -1521112278;
        gj.edkz[15] = 201325881;
        gj.edkz[16] = -2045554848;
        gj.edkz[17] = 353837701;
        gj.edkz[18] = 1062311868;
        gj.edkz[19] = 239498546;
        gj.edkz[20] = -1590344297;
        gj.edkz[21] = -793176529;
        gj.edkz[22] = 619341331;
        gj.edkz[23] = 1835402358;
        gj.edkz[24] = -993915066;
        gj.edkz[25] = 390849993;
        gj.edkz[26] = -1253856458;
        gj.edkz[27] = -477642719;
        gj.edkz[28] = 733870892;
        gj.edkz[29] = -889964595;
        gj.edkz[30] = -2107299741;
        gj.edkz[31] = 1948416523;
        gj.edkz[32] = 1365245888;
        gj.edkz[33] = -710083108;
        gj.edkz[34] = -2134255388;
        gj.edkz[35] = -1765339574;
    }

    private static /* synthetic */ int edks(int n2) {
        return edkz[n2] ^ edla[n2];
    }

    private static /* synthetic */ void edqq() {
        gj.edlr[0] = -2228873096162236744L;
        gj.edlr[1] = -5575312882515826610L;
        gj.edlr[2] = 8762251045552177392L;
        gj.edlr[3] = -7336184106332698969L;
        gj.edlr[4] = -473931421854045665L;
        gj.edlr[5] = -6033711448651783266L;
        gj.edlr[6] = 9167335094663545909L;
        gj.edlr[7] = -4109692981691644915L;
        gj.edlr[8] = 1003142010848146440L;
        gj.edlr[9] = -7674865614105523975L;
        gj.edlr[10] = 6553802214404595970L;
        gj.edlr[11] = 3107683909268820891L;
        gj.edlr[12] = -8057199959957472488L;
        gj.edlr[13] = -7100589684791320476L;
        gj.edlr[14] = 8428746033648710677L;
        gj.edlr[15] = -5340603274183846567L;
        gj.edlr[16] = 3791503361089843705L;
        gj.edlr[17] = 8864260510338208576L;
        gj.edlr[18] = 4901880508952244421L;
        gj.edlr[19] = -3012858297653592336L;
        gj.edlr[20] = -4193502427137418927L;
        gj.edlr[21] = -35102563360853522L;
        gj.edlr[22] = -7392070096370175990L;
        gj.edlr[23] = 2386518507632474055L;
        gj.edlr[24] = 3316651875752234663L;
        gj.edlr[25] = -737139122228538100L;
        gj.edlr[26] = 1497612400182571329L;
        gj.edlr[27] = -7094543995697046389L;
        gj.edlr[28] = -2038888308166334302L;
        gj.edlr[29] = 1214324265740993121L;
        gj.edlr[30] = -8411954140716902195L;
        gj.edlr[31] = 7193192878005353676L;
        gj.edlr[32] = 5881604759167490648L;
        gj.edlr[33] = 5763760469296509436L;
        gj.edlr[34] = 5491130622583585062L;
    }

    private static /* synthetic */ void edqv() {
        gj.edlu[0] = 465994962093089175L;
        gj.edlu[1] = 3629807709107587235L;
        gj.edlu[2] = -4110227653837642105L;
        gj.edlu[3] = 942023625988901055L;
        gj.edlu[4] = 7052675135730518444L;
        gj.edlu[5] = 7217987357161680650L;
        gj.edlu[6] = 4417435147852837727L;
        gj.edlu[7] = 1303478398923245904L;
        gj.edlu[8] = -1815959779789675565L;
        gj.edlu[9] = 538924484017221727L;
        gj.edlu[10] = -7861361549271746634L;
        gj.edlu[11] = -3443738424472445944L;
        gj.edlu[12] = -1878777170712829393L;
        gj.edlu[13] = 3972529966948990618L;
        gj.edlu[14] = 1695229083123268005L;
        gj.edlu[15] = -2170657181332479660L;
        gj.edlu[16] = -5398813530522511785L;
        gj.edlu[17] = 1876410473071924114L;
        gj.edlu[18] = -6064927708959057048L;
        gj.edlu[19] = -8811084909842085877L;
        gj.edlu[20] = 2567426532056386367L;
        gj.edlu[21] = 493491635499708577L;
        gj.edlu[22] = 937848208087928358L;
        gj.edlu[23] = -5367816227646247113L;
        gj.edlu[24] = -2746819812709324742L;
        gj.edlu[25] = 5039190371261486294L;
        gj.edlu[26] = 5667478943620593683L;
        gj.edlu[27] = -4692956190797724646L;
        gj.edlu[28] = -2753713607617685642L;
        gj.edlu[29] = -3009729152870491222L;
        gj.edlu[30] = 8774781246223569913L;
        gj.edlu[31] = -1332320055979872874L;
        gj.edlu[32] = -7073111877793109347L;
        gj.edlu[33] = -2418107154693528713L;
        gj.edlu[34] = 7954454918633251656L;
    }
}

