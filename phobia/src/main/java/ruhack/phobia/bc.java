/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import ruhack.phobia.ay;
import ruhack.phobia.az;

public abstract class bc
implements ay,
az {
    private static int[] dxjv;
    public static final boolean c;
    public static final boolean a;
    private static long[] dxkj;
    private boolean cancelled;
    private static long[] dxkh;
    public static final long jo = 1019201778016309314L;
    public static final int b;
    private static int[] dxjs;

    private static /* synthetic */ void dxpt() {
        bc.dxkj[0] = 1236808887292247926L;
        bc.dxkj[1] = 4584660891583495207L;
        bc.dxkj[2] = -3823669637064344349L;
        bc.dxkj[3] = -3224081535864172115L;
        bc.dxkj[4] = -4176589747293706822L;
        bc.dxkj[5] = 4424895065186890139L;
        bc.dxkj[6] = -3780145292444960522L;
        bc.dxkj[7] = 4672195460444113937L;
        bc.dxkj[8] = -5072496000478260318L;
        bc.dxkj[9] = 584577556088490701L;
        bc.dxkj[10] = 750775288931401996L;
        bc.dxkj[11] = 1388676905402993121L;
        bc.dxkj[12] = -6079157153043338477L;
        bc.dxkj[13] = -1584974072185145223L;
        bc.dxkj[14] = -9001294780261429098L;
        bc.dxkj[15] = 7654478187077572470L;
        bc.dxkj[16] = 1223558177536434876L;
        bc.dxkj[17] = -6193533209209923302L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void setCancelled(boolean var1_1) {
        v0 /* !! */  = bc.jo;
        if (true) ** GOTO lbl5
        block11: while (true) {
            v0 /* !! */  = (long)(bc.dxjx("dxnr", dxkg(int ), (int)14) - bc.dxjx("dxnp", dxkg(int ), (int)13));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -48508862: {
                    break block11;
                }
                case 1339291982: {
                    continue block11;
                }
            }
            break;
        }
        var4_2 = bc.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = bc.jo - bc.dxjx("dxnu", dxkg(int ), (int)15)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == bc.dxjx("dxnv", dxjr(int ), (int)25)) break;
            v1 /* !! */  = (long)bc.dxjx("dxnw", dxjr(int ), (int)26);
        }
        var3_3 /* !! */  = bc.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = bc.jo - bc.dxjx("dxny", dxkg(int ), (int)16)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == bc.dxjx("dxoa", dxjr(int ), (int)27)) break;
            v2 /* !! */  = (long)bc.dxjx("dxob", dxjr(int ), (int)28);
        }
        var2_4 = bc.a;
        if (var4_2) {
            throw null;
lbl25:
            // 3 sources

            return;
        }
        if (var2_4) ** GOTO lbl25
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        block4 : switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** GOTO lbl25
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = bc.jo - bc.dxjx("dxod", dxkg(int ), (int)17)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == bc.dxjx("dxof", dxjr(int ), (int)29)) break;
                    v3 /* !! */  = (long)bc.dxjx("dxog", dxjr(int ), (int)30);
                }
                this.cancelled = var1_1;
                if (var2_4) ** continue;
                return;
            }
            case 0: {
                var3_3 /* !! */  = (int)bc.dxjx("dxoh", dxjr(int ), (int)31);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl54
            }
            case 1: {
                var3_3 /* !! */  = (int)bc.dxjx("dxoi", dxjr(int ), (int)32);
                if (!var4_2) break;
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)bc.dxjx("dxoj", dxjr(int ), (int)33);
                    if (!var4_2) break block4;
                    throw null;
                }
            }
lbl54:
            // 2 sources

            case 3: {
                do {
                    var3_3 /* !! */  = (int)bc.dxjx("dxok", dxjr(int ), (int)34);
                } while (!var4_2);
                throw null;
            }
            case 4: 
        }
        var3_3 /* !! */  = (int)bc.dxjx("dxoq", dxjr(int ), (int)35);
        ** while (!var4_2)
lbl62:
        // 1 sources

        throw null;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    @Override
    public boolean isCancelled() {
        boolean bl2;
        Object object = jo;
        block10: while (true) {
            switch ((int)object) {
                case -48508862: {
                    break block10;
                }
                case 1272592874: {
                    object = bc.dxjx("dxkn", dxkg(int ), (int)1) - bc.dxjx("dxkl", dxkg(int ), (int)0);
                    continue block10;
                }
            }
            break;
        }
        boolean bl3 = c;
        Object object2 = jo;
        boolean bl4 = true;
        block11: while (true) {
            CallSite callSite;
            if (!bl4 || (bl4 = false) || !true) {
                object2 = callSite - bc.dxjx("dxkp", dxkg(int ), (int)2);
            }
            switch ((int)object2) {
                case -1420919129: {
                    callSite = bc.dxjx("dxkr", dxkg(int ), (int)3);
                    continue block11;
                }
                case -719988700: {
                    callSite = bc.dxjx("dxkv", dxkg(int ), (int)4);
                    continue block11;
                }
                case -48508862: {
                    break block11;
                }
                case 853487544: {
                    callSite = bc.dxjx("dxky", dxkg(int ), (int)5);
                    continue block11;
                }
            }
            break;
        }
        int n2 = b;
        while (true) {
            long l2;
            Object object3;
            if ((object3 = (l2 = jo - bc.dxjx("dxla", dxkg(int ), (int)6)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (object3 == bc.dxjx("dxlc", dxjr(int ), (int)3)) {
                bl2 = a;
                if (bl3) {
                    throw null;
                }
                break;
            }
            object3 = bc.dxjx("dxld", dxjr(int ), (int)4);
        }
        if (bl2) return (boolean)bc.dxjx("dxle", dxjr(int ), (int)5);
        if (bl2) return (boolean)bc.dxjx("dxle", dxjr(int ), (int)5);
        while (true) {
            long l3;
            Object object4;
            if ((object4 = (l3 = jo - bc.dxjx("dxlf", dxkg(int ), (int)7)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (object4 == bc.dxjx("dxlg", dxjr(int ), (int)6)) {
                return this.cancelled;
            }
            object4 = bc.dxjx("dxlk", dxjr(int ), (int)7);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void cancel() {
        v0 /* !! */  = bc.jo;
        if (true) ** GOTO lbl5
        block12: while (true) {
            v0 /* !! */  = (long)(bc.dxjx("dxlz", dxkg(int ), (int)9) - bc.dxjx("dxlr", dxkg(int ), (int)8));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -281391011: {
                    continue block12;
                }
                case -48508862: {
                    break block12;
                }
            }
            break;
        }
        var3_1 = bc.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = bc.jo - bc.dxjx("dxma", dxkg(int ), (int)10)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == bc.dxjx("dxmd", dxjr(int ), (int)12)) break;
            v1 /* !! */  = (long)bc.dxjx("dxmf", dxjr(int ), (int)13);
        }
        var2_2 /* !! */  = bc.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = bc.jo - bc.dxjx("dxmh", dxkg(int ), (int)11)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == bc.dxjx("dxmj", dxjr(int ), (int)14)) break;
            v2 /* !! */  = (long)bc.dxjx("dxml", dxjr(int ), (int)15);
        }
        var1_3 = bc.a;
        if (var3_1) {
            throw null;
lbl25:
            // 2 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl25
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block4 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v3 = bc.dxjx("dxmt", dxjr(int ), (int)16);
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = bc.jo - bc.dxjx("dxmv", dxkg(int ), (int)12)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == bc.dxjx("dxmw", dxjr(int ), (int)17)) break;
                    v4 /* !! */  = (long)bc.dxjx("dxmx", dxjr(int ), (int)18);
                }
                this.cancelled = v3;
                if (var1_3 || var1_3) ** continue;
                return;
            }
lbl40:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)bc.dxjx("dxmy", dxjr(int ), (int)19);
                if (var3_1) {
                    throw null;
                }
            }
            case 1: {
                do {
                    var2_2 /* !! */  = (int)bc.dxjx("dxmz", dxjr(int ), (int)20);
                } while (!var3_1);
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)bc.dxjx("dxnb", dxjr(int ), (int)21);
                if (!var3_1) ** GOTO lbl40
                throw null;
            }
            case 3: {
                var2_2 /* !! */  = (int)bc.dxjx("dxni", dxjr(int ), (int)22);
                if (var3_1) {
                    throw null;
                }
            }
            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)bc.dxjx("dxnj", dxjr(int ), (int)23);
                    if (!var3_1) break block4;
                    throw null;
                }
            }
            case 5: 
        }
        var2_2 /* !! */  = (int)bc.dxjx("dxnm", dxjr(int ), (int)24);
        ** while (!var3_1)
lbl65:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ long dxkg(int n2) {
        return dxkh[n2] ^ dxkj[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    protected bc() {
        var2_1 /* !! */  = bc.b;
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                super();
                return;
            }
            case 0: {
                var2_1 /* !! */  = (int)bc.dxjx("dxjz", dxjr(int ), (int)0);
            }
            case 1: {
                var2_1 /* !! */  = (int)bc.dxjx("dxkb", dxjr(int ), (int)1);
            }
            case 2: 
        }
        while (true) {
            var2_1 /* !! */  = (int)bc.dxjx("dxkc", dxjr(int ), (int)2);
        }
    }

    private static /* synthetic */ int dxjr(int n2) {
        return dxjs[n2] ^ dxjv[n2];
    }

    private static /* synthetic */ void dxot() {
        bc.dxjs[0] = -1721081079;
        bc.dxjs[1] = -507883944;
        bc.dxjs[2] = 305291963;
        bc.dxjs[3] = 650418814;
        bc.dxjs[4] = -1207123098;
        bc.dxjs[5] = 1680360750;
        bc.dxjs[6] = 1931374046;
        bc.dxjs[7] = 1695676071;
        bc.dxjs[8] = -510245648;
        bc.dxjs[9] = -1520166405;
        bc.dxjs[10] = 490162577;
        bc.dxjs[11] = -1262362105;
        bc.dxjs[12] = -273548319;
        bc.dxjs[13] = 640120986;
        bc.dxjs[14] = 982380974;
        bc.dxjs[15] = -1583914324;
        bc.dxjs[16] = -2064646646;
        bc.dxjs[17] = 979154863;
        bc.dxjs[18] = 722215012;
        bc.dxjs[19] = 537240561;
        bc.dxjs[20] = -774372096;
        bc.dxjs[21] = -402617205;
        bc.dxjs[22] = -1691942210;
        bc.dxjs[23] = -130920184;
        bc.dxjs[24] = 389922916;
        bc.dxjs[25] = 1351415300;
        bc.dxjs[26] = -59467275;
        bc.dxjs[27] = 2033461738;
        bc.dxjs[28] = 1309512292;
        bc.dxjs[29] = -929422653;
        bc.dxjs[30] = 1680055409;
        bc.dxjs[31] = 633470884;
        bc.dxjs[32] = 258426625;
        bc.dxjs[33] = 40538576;
        bc.dxjs[34] = 1615912969;
        bc.dxjs[35] = -847631531;
    }

    static {
        dxjs = new int[36];
        dxjv = new int[36];
        bc.dxot();
        bc.dxpg();
        dxkh = new long[18];
        dxkj = new long[18];
        bc.dxpo();
        bc.dxpt();
    }

    public static /* synthetic */ CallSite dxjx(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void dxpo() {
        bc.dxkh[0] = -7782121720220835182L;
        bc.dxkh[1] = 396907710616490224L;
        bc.dxkh[2] = -7777697433280780685L;
        bc.dxkh[3] = -8006046681002040381L;
        bc.dxkh[4] = -8252367258646837770L;
        bc.dxkh[5] = 4189691672636444775L;
        bc.dxkh[6] = -8085884365611663473L;
        bc.dxkh[7] = -6597675063329776853L;
        bc.dxkh[8] = -7102983060274435740L;
        bc.dxkh[9] = -6984863238870352496L;
        bc.dxkh[10] = 1633499161625675660L;
        bc.dxkh[11] = 7613721514020950407L;
        bc.dxkh[12] = 8780697993669974373L;
        bc.dxkh[13] = 3145563815294750052L;
        bc.dxkh[14] = -3585960525593128207L;
        bc.dxkh[15] = 7747557449294367530L;
        bc.dxkh[16] = 5277759607981209685L;
        bc.dxkh[17] = 9210584174080653857L;
    }

    private static /* synthetic */ void dxpg() {
        bc.dxjv[0] = -1721081077;
        bc.dxjv[1] = -507883943;
        bc.dxjv[2] = 305291961;
        bc.dxjv[3] = -650418815;
        bc.dxjv[4] = -726912835;
        bc.dxjv[5] = 1680360750;
        bc.dxjv[6] = 1931374047;
        bc.dxjv[7] = 1260155729;
        bc.dxjv[8] = -510245648;
        bc.dxjv[9] = -1520166407;
        bc.dxjv[10] = 490162579;
        bc.dxjv[11] = -1262362106;
        bc.dxjv[12] = 273548318;
        bc.dxjv[13] = -802753574;
        bc.dxjv[14] = -982380975;
        bc.dxjv[15] = 1916468304;
        bc.dxjv[16] = -2064646645;
        bc.dxjv[17] = 979154862;
        bc.dxjv[18] = -1679314093;
        bc.dxjv[19] = 537240565;
        bc.dxjv[20] = -774372091;
        bc.dxjv[21] = -402617207;
        bc.dxjv[22] = -1691942212;
        bc.dxjv[23] = -130920183;
        bc.dxjv[24] = 389922919;
        bc.dxjv[25] = 1351415301;
        bc.dxjv[26] = 511844822;
        bc.dxjv[27] = -2033461739;
        bc.dxjv[28] = -1105110190;
        bc.dxjv[29] = -929422654;
        bc.dxjv[30] = -1963639456;
        bc.dxjv[31] = 633470886;
        bc.dxjv[32] = 258426625;
        bc.dxjv[33] = 40538576;
        bc.dxjv[34] = 1615912968;
        bc.dxjv[35] = -847631529;
    }
}

