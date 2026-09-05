/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import ruhack.phobia.bc;

public class cp
extends bc {
    private static final long hw = 3753066900224926832L;
    public static final boolean a;
    private static int[] dlaq;
    float cursorDeltaX;
    float cursorDeltaY;
    public static final boolean c;
    private static int[] dlar;
    public static final int b;
    private static long[] dlae;
    private static long[] dlaf;

    private static /* synthetic */ void dldg() {
        cp.dlar[0] = 1921740274;
        cp.dlar[1] = 344047066;
        cp.dlar[2] = -1584945009;
        cp.dlar[3] = -957457661;
        cp.dlar[4] = 296362298;
        cp.dlar[5] = 487090784;
        cp.dlar[6] = 1585856501;
        cp.dlar[7] = -1368199472;
        cp.dlar[8] = -983452286;
        cp.dlar[9] = 1132272738;
        cp.dlar[10] = -1808357575;
        cp.dlar[11] = -622153492;
        cp.dlar[12] = 1633417129;
        cp.dlar[13] = 1831646941;
        cp.dlar[14] = 1840864734;
        cp.dlar[15] = -524778640;
        cp.dlar[16] = -72216274;
        cp.dlar[17] = -191917982;
        cp.dlar[18] = 2064264090;
        cp.dlar[19] = -249863303;
        cp.dlar[20] = -1367647369;
        cp.dlar[21] = 624629105;
        cp.dlar[22] = -399804938;
        cp.dlar[23] = 671858201;
        cp.dlar[24] = 2045923070;
        cp.dlar[25] = -1263278898;
        cp.dlar[26] = 1137137708;
        cp.dlar[27] = -1241919703;
        cp.dlar[28] = -109392245;
        cp.dlar[29] = -2142756630;
        cp.dlar[30] = 136767809;
        cp.dlar[31] = -2025868810;
        cp.dlar[32] = 1747395872;
        cp.dlar[33] = -1596210414;
        cp.dlar[34] = 2028723230;
        cp.dlar[35] = -1776430226;
        cp.dlar[36] = -2009203587;
        cp.dlar[37] = -1579511245;
    }

    private static /* synthetic */ int dlau(int n2) {
        return dlaq[n2] ^ dlar[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public cp(float var1_1, float var2_2) {
        var4_3 /* !! */  = cp.b;
        var3_4 = cp.a;
        super();
        this.cursorDeltaX = var1_1;
        this.cursorDeltaY = var2_2;
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                return;
            }
lbl10:
            // 2 sources

            case 0: {
                var4_3 /* !! */  = (int)cp.dlag("dldb", dlau(int ), (int)34);
            }
lbl12:
            // 3 sources

            case 1: {
                var4_3 /* !! */  = (int)cp.dlag("dldc", dlau(int ), (int)35);
                ** GOTO lbl10
            }
            case 2: {
                var4_3 /* !! */  = (int)cp.dlag("dldd", dlau(int ), (int)36);
                ** GOTO lbl12
            }
            case 3: 
        }
        while (true) {
            var4_3 /* !! */  = (int)cp.dlag("dlde", dlau(int ), (int)37);
        }
    }

    private static /* synthetic */ void dldh() {
        cp.dlae[0] = -6898452876045217863L;
        cp.dlae[1] = -4711571833766368745L;
        cp.dlae[2] = 3488946344765669345L;
        cp.dlae[3] = -4132242546268238554L;
        cp.dlae[4] = 1326775602666240898L;
        cp.dlae[5] = 8152130935830542058L;
        cp.dlae[6] = -2763131798773234586L;
        cp.dlae[7] = -2121802805179943489L;
        cp.dlae[8] = 698256283335902341L;
        cp.dlae[9] = -974350033720634190L;
        cp.dlae[10] = 5711249391620751715L;
        cp.dlae[11] = 4058868261327853368L;
        cp.dlae[12] = 7092726531044544580L;
        cp.dlae[13] = -4232190010311065994L;
        cp.dlae[14] = 5969193093429418808L;
        cp.dlae[15] = 8616167262119732014L;
        cp.dlae[16] = -713245820795881948L;
        cp.dlae[17] = -4998555804588251497L;
        cp.dlae[18] = 7523939385893827679L;
        cp.dlae[19] = 7827046355427404339L;
        cp.dlae[20] = -5978452627144444453L;
        cp.dlae[21] = 5604745630972322303L;
        cp.dlae[22] = -1722302208557932373L;
        cp.dlae[23] = 2714345302923185662L;
        cp.dlae[24] = 5973876944482325381L;
        cp.dlae[25] = 2307649056377780243L;
        cp.dlae[26] = 7088972726036215145L;
        cp.dlae[27] = -5658747260047556933L;
        cp.dlae[28] = -2140672043267142035L;
        cp.dlae[29] = -8752456555921914494L;
        cp.dlae[30] = -125201677773534522L;
        cp.dlae[31] = -2783687662157433127L;
        cp.dlae[32] = 4026750604387538670L;
        cp.dlae[33] = -6105346653758638306L;
    }

    public static /* synthetic */ CallSite dlag(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    static {
        dlaq = new int[38];
        dlar = new int[38];
        cp.dldf();
        cp.dldg();
        dlae = new long[34];
        dlaf = new long[34];
        cp.dldh();
        cp.dldi();
    }

    private static /* synthetic */ float dlap(int n2) {
        return Float.intBitsToFloat(dlaq[n2] ^ dlar[n2]);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void setCursorDeltaX(float var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = cp.hw - cp.dlag("dlbt", dlad(int ), (int)18)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == cp.dlag("dlbu", dlau(int ), (int)16)) break;
            v0 /* !! */  = (long)cp.dlag("dlbv", dlau(int ), (int)17);
        }
        var4_2 = cp.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = cp.hw - cp.dlag("dlbw", dlad(int ), (int)19)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == cp.dlag("dlbx", dlau(int ), (int)18)) break;
            v1 /* !! */  = (long)cp.dlag("dlby", dlau(int ), (int)19);
        }
        var3_3 = cp.b;
        v2 /* !! */  = cp.hw;
        if (true) ** GOTO lbl19
        block12: while (true) {
            v2 /* !! */  = (long)(v3 - cp.dlag("dlbz", dlad(int ), (int)20));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1282475310: {
                    v3 = cp.dlag("dlca", dlad(int ), (int)21);
                    continue block12;
                }
                case -768950879: {
                    v3 = cp.dlag("dlcb", dlad(int ), (int)22);
                    continue block12;
                }
                case 237954160: {
                    break block12;
                }
                case 392441674: {
                    v3 = cp.dlag("dlcc", dlad(int ), (int)23);
                    continue block12;
                }
            }
            break;
        }
        var2_4 = cp.a;
        if (var4_2) {
            throw null;
lbl34:
            // 2 sources

            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl34
        v4 /* !! */  = cp.hw;
        if (true) ** GOTO lbl41
        block14: while (true) {
            v4 /* !! */  = (long)(cp.dlag("dlce", dlad(int ), (int)25) - cp.dlag("dlcd", dlad(int ), (int)24));
lbl41:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1279065656: {
                    continue block14;
                }
                case 237954160: {
                    break block14;
                }
            }
            break;
        }
        this.cursorDeltaX = var1_1;
        if (!var2_4) ** break;
        ** while (true)
    }

    private static /* synthetic */ long dlad(int n2) {
        return dlae[n2] ^ dlaf[n2];
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public float getCursorDeltaY() {
        while (true) {
            block29: {
                if ((v0 /* !! */  = (cfr_temp_0 = cp.hw - cp.dlag("dlbb", dlad(int ), (int)9)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v0 /* !! */  != cp.dlag("dlbc", dlau(int ), (int)7)) break block29;
                var3_1 = cp.c;
                v1 /* !! */  = cp.hw;
                if (true) ** GOTO lbl13
            }
            v0 /* !! */  = (long)cp.dlag("dlbd", dlau(int ), (int)8);
        }
        block18: while (true) {
            v1 /* !! */  = (long)(v2 - cp.dlag("dlbe", dlad(int ), (int)10));
lbl13:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -355535536: {
                    v2 = cp.dlag("dlbf", dlad(int ), (int)11);
                    continue block18;
                }
                case -309521915: {
                    v2 = cp.dlag("dlbg", dlad(int ), (int)12);
                    continue block18;
                }
                case 100640411: {
                    v2 = cp.dlag("dlbh", dlad(int ), (int)13);
                    continue block18;
                }
                case 237954160: {
                    break block18;
                }
            }
            break;
        }
        var2_2 /* !! */  = cp.b;
        v3 /* !! */  = cp.hw;
        if (true) ** GOTO lbl30
        block19: while (true) {
            v3 /* !! */  = (long)(v4 - cp.dlag("dlbi", dlad(int ), (int)14));
lbl30:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case 237954160: {
                    break block19;
                }
                case 564568887: {
                    v4 = cp.dlag("dlbj", dlad(int ), (int)15);
                    continue block19;
                }
                case 1647385996: {
                    v4 = cp.dlag("dlbk", dlad(int ), (int)16);
                    continue block19;
                }
            }
            break;
        }
        var1_3 = cp.a;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_1) {
                    throw null;
                }
                if (var1_3 != false) return (float)cp.dlag("dlbl", dlap(int ), (int)9);
                if (var1_3 != false) return (float)cp.dlag("dlbl", dlap(int ), (int)9);
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = cp.hw - cp.dlag("dlbm", dlad(int ), (int)17)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == cp.dlag("dlbn", dlau(int ), (int)10)) {
                        return this.cursorDeltaY;
                    }
                    v5 /* !! */  = (long)cp.dlag("dlbo", dlau(int ), (int)11);
                }
            }
            case 0: {
                var2_2 /* !! */  = (int)cp.dlag("dlbp", dlau(int ), (int)12);
                if (var3_1) {
                    throw null;
                }
            }
            case 1: {
                ** GOTO lbl64
            }
            case 3: {
                var2_2 /* !! */  = (int)cp.dlag("dlbs", dlau(int ), (int)15);
                if (var3_1) {
                    throw null;
                }
lbl64:
                // 3 sources

                var2_2 /* !! */  = (int)cp.dlag("dlbq", dlau(int ), (int)13);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: 
        }
        do {
            var2_2 /* !! */  = (int)cp.dlag("dlbr", dlau(int ), (int)14);
        } while (!var3_1);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public float getCursorDeltaX() {
        v0 /* !! */  = cp.hw;
        if (true) ** GOTO lbl5
        block20: while (true) {
            v0 /* !! */  = (long)(cp.dlag("dlai", dlad(int ), (int)1) - cp.dlag("dlah", dlad(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -709257845: {
                    continue block20;
                }
                case 237954160: {
                    break block20;
                }
            }
            break;
        }
        var3_1 = cp.c;
        v1 /* !! */  = cp.hw;
        if (true) ** GOTO lbl15
        block21: while (true) {
            v1 /* !! */  = (long)(v2 - cp.dlag("dlaj", dlad(int ), (int)2));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 237954160: {
                    break block21;
                }
                case 1360218696: {
                    v2 = cp.dlag("dlak", dlad(int ), (int)3);
                    continue block21;
                }
                case 1625561793: {
                    v2 = cp.dlag("dlal", dlad(int ), (int)4);
                    continue block21;
                }
                case 2035387725: {
                    v2 = cp.dlag("dlam", dlad(int ), (int)5);
                    continue block21;
                }
            }
            break;
        }
        var2_2 /* !! */  = cp.b;
        v3 /* !! */  = cp.hw;
        if (true) ** GOTO lbl32
        block22: while (true) {
            v3 /* !! */  = (long)(cp.dlag("dlao", dlad(int ), (int)7) - cp.dlag("dlan", dlad(int ), (int)6));
lbl32:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case 237954160: {
                    break block22;
                }
                case 1216320648: {
                    continue block22;
                }
            }
            break;
        }
        var1_3 = cp.a;
        if (var3_1) {
            throw null;
lbl40:
            // 2 sources

            return (float)cp.dlag("dlas", dlap(int ), (int)0);
        }
        if (var1_3) ** GOTO lbl40
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_0 = cp.hw - cp.dlag("dlat", dlad(int ), (int)8)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == cp.dlag("dlav", dlau(int ), (int)1)) break;
                    v4 /* !! */  = (long)cp.dlag("dlaw", dlau(int ), (int)2);
                }
                return this.cursorDeltaX;
            }
            case 0: {
                var2_2 /* !! */  = (int)cp.dlag("dlax", dlau(int ), (int)3);
                if (!var3_1) break;
                throw null;
            }
            case 1: {
                var2_2 /* !! */  = (int)cp.dlag("dlay", dlau(int ), (int)4);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: {
                do {
                    var2_2 /* !! */  = (int)cp.dlag("dlaz", dlau(int ), (int)5);
                } while (!var3_1);
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)cp.dlag("dlba", dlau(int ), (int)6);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ void dldi() {
        cp.dlaf[0] = -7464696235881181737L;
        cp.dlaf[1] = -8650881761419359359L;
        cp.dlaf[2] = 7344883398539901985L;
        cp.dlaf[3] = -4751315179156521406L;
        cp.dlaf[4] = -7898562845635088904L;
        cp.dlaf[5] = 7742741002991967229L;
        cp.dlaf[6] = 5794878990643167996L;
        cp.dlaf[7] = 2754923707051910641L;
        cp.dlaf[8] = -1571981087234838495L;
        cp.dlaf[9] = -2684335089294359954L;
        cp.dlaf[10] = -7406391286989395256L;
        cp.dlaf[11] = -8347657146930320002L;
        cp.dlaf[12] = 9141980419976118339L;
        cp.dlaf[13] = -4667575536038342854L;
        cp.dlaf[14] = -9034422592431599985L;
        cp.dlaf[15] = 2934472210285626230L;
        cp.dlaf[16] = 3647644119552542229L;
        cp.dlaf[17] = -83187935373910836L;
        cp.dlaf[18] = -7015137855020253996L;
        cp.dlaf[19] = -6809898631964935019L;
        cp.dlaf[20] = 7277256390322890518L;
        cp.dlaf[21] = 1588186410478469282L;
        cp.dlaf[22] = 7688349776208585850L;
        cp.dlaf[23] = 6032336176622921783L;
        cp.dlaf[24] = -8772561551834311331L;
        cp.dlaf[25] = -805407110621582736L;
        cp.dlaf[26] = 6007400893154962438L;
        cp.dlaf[27] = -2833733363471180322L;
        cp.dlaf[28] = 4918161087903903012L;
        cp.dlaf[29] = 1844774638429431260L;
        cp.dlaf[30] = 1954157672565283417L;
        cp.dlaf[31] = -3880128078148511646L;
        cp.dlaf[32] = 3369450667267201018L;
        cp.dlaf[33] = 3711595779883637684L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void setCursorDeltaY(float var1_1) {
        v0 /* !! */  = cp.hw;
        if (true) ** GOTO lbl5
        block17: while (true) {
            v0 /* !! */  = (long)(v1 - cp.dlag("dlck", dlad(int ), (int)26));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 237954160: {
                    break block17;
                }
                case 778495782: {
                    v1 = cp.dlag("dlcl", dlad(int ), (int)27);
                    continue block17;
                }
                case 1669114724: {
                    v1 = cp.dlag("dlcm", dlad(int ), (int)28);
                    continue block17;
                }
            }
            break;
        }
        var4_2 = cp.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = cp.hw - cp.dlag("dlcn", dlad(int ), (int)29)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == cp.dlag("dlco", dlau(int ), (int)25)) break;
            v2 /* !! */  = (long)cp.dlag("dlcp", dlau(int ), (int)26);
        }
        var3_3 /* !! */  = cp.b;
        v3 /* !! */  = cp.hw;
        if (true) ** GOTO lbl25
        block19: while (true) {
            v3 /* !! */  = (long)(v4 - cp.dlag("dlcq", dlad(int ), (int)30));
lbl25:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -843579786: {
                    v4 = cp.dlag("dlcr", dlad(int ), (int)31);
                    continue block19;
                }
                case 237954160: {
                    break block19;
                }
                case 372093153: {
                    v4 = cp.dlag("dlcs", dlad(int ), (int)32);
                    continue block19;
                }
            }
            break;
        }
        var2_4 = cp.a;
        if (var4_2) {
            throw null;
lbl37:
            // 3 sources

            return;
        }
        if (var2_4) ** GOTO lbl37
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** GOTO lbl37
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = cp.hw - cp.dlag("dlct", dlad(int ), (int)33)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == cp.dlag("dlcu", dlau(int ), (int)27)) break;
                    v5 /* !! */  = (long)cp.dlag("dlcv", dlau(int ), (int)28);
                }
                this.cursorDeltaY = var1_1;
                if (var2_4) ** continue;
                return;
            }
lbl52:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)cp.dlag("dlcw", dlau(int ), (int)29);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl66
            }
            case 1: {
                do {
                    var3_3 /* !! */  = (int)cp.dlag("dlcx", dlau(int ), (int)30);
                } while (!var4_2);
                throw null;
            }
            case 2: {
                var3_3 /* !! */  = (int)cp.dlag("dlcy", dlau(int ), (int)31);
                if (!var4_2) ** GOTO lbl52
                throw null;
            }
lbl66:
            // 2 sources

            case 3: {
                do {
                    var3_3 /* !! */  = (int)cp.dlag("dlcz", dlau(int ), (int)32);
                } while (!var4_2);
                throw null;
            }
            case 4: 
        }
        do {
            var3_3 /* !! */  = (int)cp.dlag("dlda", dlau(int ), (int)33);
        } while (!var4_2);
        throw null;
    }

    private static /* synthetic */ void dldf() {
        cp.dlaq[0] = 1337540706;
        cp.dlaq[1] = 344047067;
        cp.dlaq[2] = 1786654768;
        cp.dlaq[3] = -957457661;
        cp.dlaq[4] = 296362299;
        cp.dlaq[5] = 487090787;
        cp.dlaq[6] = 1585856502;
        cp.dlaq[7] = -1368199471;
        cp.dlaq[8] = -1040861160;
        cp.dlaq[9] = 2084565300;
        cp.dlaq[10] = 1808357574;
        cp.dlaq[11] = -1482358198;
        cp.dlaq[12] = 1633417131;
        cp.dlaq[13] = 1831646942;
        cp.dlaq[14] = 1840864733;
        cp.dlaq[15] = -524778639;
        cp.dlaq[16] = -72216273;
        cp.dlaq[17] = 653761871;
        cp.dlaq[18] = 2064264091;
        cp.dlaq[19] = -1240784670;
        cp.dlaq[20] = -1367647373;
        cp.dlaq[21] = 624629106;
        cp.dlaq[22] = -399804939;
        cp.dlaq[23] = 671858201;
        cp.dlaq[24] = 2045923066;
        cp.dlaq[25] = -1263278897;
        cp.dlaq[26] = 932185634;
        cp.dlaq[27] = -1241919704;
        cp.dlaq[28] = 233470373;
        cp.dlaq[29] = -2142756630;
        cp.dlaq[30] = 136767809;
        cp.dlaq[31] = -2025868810;
        cp.dlaq[32] = 1747395873;
        cp.dlaq[33] = -1596210414;
        cp.dlaq[34] = 2028723231;
        cp.dlaq[35] = -1776430225;
        cp.dlaq[36] = -2009203587;
        cp.dlaq[37] = -1579511248;
    }
}

