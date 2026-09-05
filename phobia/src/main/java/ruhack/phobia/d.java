/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.ClientModInitializer
 *  net.fabricmc.fabric.api.resource.IdentifiableResourceReloadListener
 *  net.fabricmc.fabric.api.resource.ResourceManagerHelper
 *  net.minecraft.class_3264
 */
package ruhack.phobia;

import com.adl.nativeprotect.NativeLoader;
import com.adl.nativeprotect.Phobia;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.resource.IdentifiableResourceReloadListener;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.minecraft.class_3264;
import ruhack.phobia.d$1;
import ruhack.phobia.e;
import ruhack.phobia.oz;

public class d
implements ClientModInitializer {
    private static int[] bqeb;
    private oz discordManager;
    public static final int b;
    private static d instance;
    public static final boolean c;
    public static final long dt = -746372555665326822L;
    private static long[] bqds;
    private e manager;
    private static long[] bqdr;
    public static final boolean a;
    private static int[] bqea;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void onInitializeClient() {
        Phobia.open();
        v0 /* !! */  = d.dt;
        if (true) ** GOTO lbl6
        block21: while (true) {
            v0 /* !! */  = (long)(d.bqdt("bqdv", bqdq(int ), (int)1) - d.bqdt("bqdu", bqdq(int ), (int)0));
lbl6:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1169625892: {
                    continue block21;
                }
                case 1970781466: {
                    break block21;
                }
            }
            break;
        }
        var3_1 = d.c;
        v1 /* !! */  = d.dt;
        if (true) ** GOTO lbl16
        block22: while (true) {
            v1 /* !! */  = (long)(d.bqdt("bqdx", bqdq(int ), (int)3) - d.bqdt("bqdw", bqdq(int ), (int)2));
lbl16:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 480417150: {
                    continue block22;
                }
                case 1970781466: {
                    break block22;
                }
            }
            break;
        }
        var2_2 /* !! */  = d.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = d.dt - d.bqdt("bqdy", bqdq(int ), (int)4)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == d.bqdt("bqec", bqdz(int ), (int)0)) break;
            v2 /* !! */  = (long)d.bqdt("bqed", bqdz(int ), (int)1);
        }
        var1_3 = d.a;
        if (var3_1) {
            throw null;
lbl31:
            // 3 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl31
        v3 /* !! */  = d.dt;
        if (true) ** GOTO lbl38
        block25: while (true) {
            v3 /* !! */  = (long)(v4 - d.bqdt("bqee", bqdq(int ), (int)5));
lbl38:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1837655481: {
                    v4 = d.bqdt("bqef", bqdq(int ), (int)6);
                    continue block25;
                }
                case -1095044966: {
                    v4 = d.bqdt("bqeg", bqdq(int ), (int)7);
                    continue block25;
                }
                case 1970781466: {
                    break block25;
                }
            }
            break;
        }
        this.init();
        if (var1_3) ** GOTO lbl31
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var1_3) ** break;
                ** continue;
                return;
            }
            case 0: {
                do {
                    var2_2 /* !! */  = (int)d.bqdt("bqeh", bqdz(int ), (int)2);
                } while (!var3_1);
                throw null;
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)d.bqdt("bqei", bqdz(int ), (int)3);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl70
                    break;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)d.bqdt("bqej", bqdz(int ), (int)4);
                if (var3_1) {
                    throw null;
                }
            }
lbl70:
            // 4 sources

            case 3: {
                var2_2 /* !! */  = (int)d.bqdt("bqek", bqdz(int ), (int)5);
                if (var3_1) {
                    throw null;
                }
            }
            case 4: {
                var2_2 /* !! */  = (int)d.bqdt("bqel", bqdz(int ), (int)6);
                if (!var3_1) break;
                throw null;
            }
            case 5: 
        }
        var2_2 /* !! */  = (int)d.bqdt("bqem", bqdz(int ), (int)7);
        ** while (!var3_1)
lbl81:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ int bqdz(int n2) {
        return bqea[n2] ^ bqeb[n2];
    }

    static {
        NativeLoader.ensureNativeClassInitialized("nativo4ka", "ruhack/phobia/d", d.class);
        bqea = new int[30];
        bqeb = new int[30];
        d.bqgi();
        d.bqgj();
        bqdr = new long[33];
        bqds = new long[33];
        d.bqgk();
        d.bqgl();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static d getInstance() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = d.dt - d.bqdt("bqen", bqdq(int ), (int)8)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == d.bqdt("bqeo", bqdz(int ), (int)8)) break;
            v0 /* !! */  = (long)d.bqdt("bqep", bqdz(int ), (int)9);
        }
        var2 = d.c;
        v1 /* !! */  = d.dt;
        if (true) ** GOTO lbl12
        block16: while (true) {
            v1 /* !! */  = (long)(v2 - d.bqdt("bqeq", bqdq(int ), (int)9));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 683755661: {
                    v2 = d.bqdt("bqer", bqdq(int ), (int)10);
                    continue block16;
                }
                case 1970781466: {
                    break block16;
                }
                case 2058358922: {
                    v2 = d.bqdt("bqes", bqdq(int ), (int)11);
                    continue block16;
                }
            }
            break;
        }
        var1_1 /* !! */  = d.b;
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v3 /* !! */  = d.dt;
                if (true) ** GOTO lbl29
                block17: while (true) {
                    v3 /* !! */  = (long)(d.bqdt("bqeu", bqdq(int ), (int)13) - d.bqdt("bqet", bqdq(int ), (int)12));
lbl29:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case 730961905: {
                            continue block17;
                        }
                        case 1970781466: {
                            break block17;
                        }
                    }
                    break;
                }
                var0_2 = d.a;
                if (var2) {
                    throw null;
                    return null;
                }
                if (var0_2 || var0_2) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_1 = d.dt - d.bqdt("bqev", bqdq(int ), (int)14)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == d.bqdt("bqew", bqdz(int ), (int)10)) break;
                    v4 /* !! */  = (long)d.bqdt("bqex", bqdz(int ), (int)11);
                }
                return d.instance;
            }
lbl47:
            // 2 sources

            case 0: {
                var1_1 /* !! */  = (int)d.bqdt("bqey", bqdz(int ), (int)12);
                if (var2) {
                    throw null;
                }
            }
            case 1: {
                do {
                    var1_1 /* !! */  = (int)d.bqdt("bqez", bqdz(int ), (int)13);
                } while (!var2);
                throw null;
            }
            case 2: {
                var1_1 /* !! */  = (int)d.bqdt("bqfa", bqdz(int ), (int)14);
                if (!var2) ** GOTO lbl47
                throw null;
            }
            case 3: 
        }
        do {
            var1_1 /* !! */  = (int)d.bqdt("bqfb", bqdz(int ), (int)15);
        } while (!var2);
        throw null;
    }

    private static /* synthetic */ void bqgl() {
        d.bqds[0] = 7289530777256686415L;
        d.bqds[1] = 6016784806920114589L;
        d.bqds[2] = 7289835113277883095L;
        d.bqds[3] = -378387738896482168L;
        d.bqds[4] = 3955665698255704351L;
        d.bqds[5] = 1229754512763820523L;
        d.bqds[6] = -225174415050289357L;
        d.bqds[7] = 3999126434613757080L;
        d.bqds[8] = 2122627807462771827L;
        d.bqds[9] = 8136110623495036240L;
        d.bqds[10] = 1036625409212504478L;
        d.bqds[11] = 7159938744651716529L;
        d.bqds[12] = -5526276556926336803L;
        d.bqds[13] = 3384803313913999551L;
        d.bqds[14] = -3887547387952165051L;
        d.bqds[15] = -7660067928468574576L;
        d.bqds[16] = 6855783000671195299L;
        d.bqds[17] = -4736709567669344284L;
        d.bqds[18] = 5525966088457094078L;
        d.bqds[19] = -6222884656978344406L;
        d.bqds[20] = -7680788502886024459L;
        d.bqds[21] = 6257653341112552965L;
        d.bqds[22] = -8576747828237643540L;
        d.bqds[23] = -8716044176362149961L;
        d.bqds[24] = -3897088315833417976L;
        d.bqds[25] = -8677488490335148421L;
        d.bqds[26] = 6539543570146879238L;
        d.bqds[27] = 1256025511845873415L;
        d.bqds[28] = 9099958239048711635L;
        d.bqds[29] = -721024048123266697L;
        d.bqds[30] = 8918641813189235984L;
        d.bqds[31] = 1165139852208556210L;
        d.bqds[32] = -5664275325412931685L;
    }

    public static /* synthetic */ CallSite bqdt(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    public void init() {
        instance = this;
        ResourceManagerHelper.get((class_3264)class_3264.field_14188).registerReloadListener((IdentifiableResourceReloadListener)new d$1(this));
        this.manager = new e();
        this.manager.init();
        this.discordManager = new oz();
    }

    private static /* synthetic */ void bqgj() {
        d.bqeb[0] = -1825821950;
        d.bqeb[1] = -1169994372;
        d.bqeb[2] = -1158536002;
        d.bqeb[3] = -1209214464;
        d.bqeb[4] = -584376838;
        d.bqeb[5] = 1602476452;
        d.bqeb[6] = -1641577851;
        d.bqeb[7] = 1206803183;
        d.bqeb[8] = -29004920;
        d.bqeb[9] = 836813098;
        d.bqeb[10] = 1722816123;
        d.bqeb[11] = 1670515220;
        d.bqeb[12] = 247993658;
        d.bqeb[13] = 431334242;
        d.bqeb[14] = -868421387;
        d.bqeb[15] = 626711749;
        d.bqeb[16] = -1583466065;
        d.bqeb[17] = 1842350413;
        d.bqeb[18] = 2083659227;
        d.bqeb[19] = 1404098847;
        d.bqeb[20] = 693254454;
        d.bqeb[21] = 709698804;
        d.bqeb[22] = 1255031375;
        d.bqeb[23] = 1327404151;
        d.bqeb[24] = -22429653;
        d.bqeb[25] = -398596943;
        d.bqeb[26] = -950021527;
        d.bqeb[27] = -893710843;
        d.bqeb[28] = 1204676763;
        d.bqeb[29] = -529859419;
    }

    private static /* synthetic */ void bqgk() {
        d.bqdr[0] = -5556549834575381482L;
        d.bqdr[1] = 7033817641198410673L;
        d.bqdr[2] = 6232787863182643340L;
        d.bqdr[3] = 7237988810923365452L;
        d.bqdr[4] = -4860874628358304254L;
        d.bqdr[5] = 8359932879894422473L;
        d.bqdr[6] = -1964567644296355698L;
        d.bqdr[7] = -4061179323836238419L;
        d.bqdr[8] = 4271040477770628717L;
        d.bqdr[9] = -7163378759117747120L;
        d.bqdr[10] = -7464438397963787083L;
        d.bqdr[11] = 2912273546092750655L;
        d.bqdr[12] = -6428479738251709883L;
        d.bqdr[13] = 4916993890007744719L;
        d.bqdr[14] = -5602547199211952778L;
        d.bqdr[15] = 5910283673418972323L;
        d.bqdr[16] = -185976008109739869L;
        d.bqdr[17] = -1019537049713378574L;
        d.bqdr[18] = 649041393089566950L;
        d.bqdr[19] = 541320135143879477L;
        d.bqdr[20] = 8799753618330163368L;
        d.bqdr[21] = 5416747709925340676L;
        d.bqdr[22] = 8878277529885032985L;
        d.bqdr[23] = -2661314532937440956L;
        d.bqdr[24] = 6562079021946177382L;
        d.bqdr[25] = -5410392941258284514L;
        d.bqdr[26] = -3523936285905899754L;
        d.bqdr[27] = 113246735632577733L;
        d.bqdr[28] = 2424699381462181358L;
        d.bqdr[29] = 5917143376733328147L;
        d.bqdr[30] = -5841958068200140039L;
        d.bqdr[31] = 4219921015277283771L;
        d.bqdr[32] = 7960973037751384779L;
    }

    private static /* synthetic */ long bqdq(int n2) {
        return bqdr[n2] ^ bqds[n2];
    }

    public d() {
    }

    private static /* synthetic */ void bqgi() {
        d.bqea[0] = -1825821949;
        d.bqea[1] = -1063159381;
        d.bqea[2] = -1158536001;
        d.bqea[3] = -1209214460;
        d.bqea[4] = -584376839;
        d.bqea[5] = 1602476449;
        d.bqea[6] = -1641577855;
        d.bqea[7] = 1206803178;
        d.bqea[8] = 29004919;
        d.bqea[9] = 1041653039;
        d.bqea[10] = -1722816124;
        d.bqea[11] = -1370782955;
        d.bqea[12] = 247993659;
        d.bqea[13] = 431334243;
        d.bqea[14] = -868421386;
        d.bqea[15] = 626711750;
        d.bqea[16] = 1583466064;
        d.bqea[17] = -1075627855;
        d.bqea[18] = 2083659225;
        d.bqea[19] = 1404098847;
        d.bqea[20] = 693254455;
        d.bqea[21] = 709698806;
        d.bqea[22] = 1255031374;
        d.bqea[23] = 1684767438;
        d.bqea[24] = -22429654;
        d.bqea[25] = 1098487990;
        d.bqea[26] = -950021526;
        d.bqea[27] = -893710843;
        d.bqea[28] = 1204676760;
        d.bqea[29] = -529859417;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public e getManager() {
        v0 /* !! */  = d.dt;
        if (true) ** GOTO lbl5
        block23: while (true) {
            v0 /* !! */  = (long)(v1 - d.bqdt("bqfc", bqdq(int ), (int)15));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1742541793: {
                    v1 = d.bqdt("bqfd", bqdq(int ), (int)16);
                    continue block23;
                }
                case -1401207887: {
                    v1 = d.bqdt("bqfe", bqdq(int ), (int)17);
                    continue block23;
                }
                case 1970781466: {
                    break block23;
                }
            }
            break;
        }
        var3_1 = d.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = d.dt - d.bqdt("bqff", bqdq(int ), (int)18)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == d.bqdt("bqfg", bqdz(int ), (int)16)) break;
            v2 /* !! */  = (long)d.bqdt("bqfh", bqdz(int ), (int)17);
        }
        var2_2 /* !! */  = d.b;
        v3 /* !! */  = d.dt;
        if (true) ** GOTO lbl26
        block25: while (true) {
            v3 /* !! */  = (long)(v4 - d.bqdt("bqfi", bqdq(int ), (int)19));
lbl26:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -991278927: {
                    v4 = d.bqdt("bqfj", bqdq(int ), (int)20);
                    continue block25;
                }
                case 1299069573: {
                    v4 = d.bqdt("bqfk", bqdq(int ), (int)21);
                    continue block25;
                }
                case 1970781466: {
                    break block25;
                }
                case 1995956001: {
                    v4 = d.bqdt("bqfl", bqdq(int ), (int)22);
                    continue block25;
                }
            }
            break;
        }
        var1_3 = d.a;
        if (!var3_1) ** GOTO lbl45
        throw null;
        {
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var2_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return null;
                }
lbl45:
                // 1 sources

                if (var1_3 || var1_3) continue block26;
                v5 /* !! */  = d.dt;
                if (true) ** GOTO lbl50
                block27: while (true) {
                    v5 /* !! */  = (long)(v6 - d.bqdt("bqfm", bqdq(int ), (int)23));
lbl50:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1540005051: {
                            v6 = d.bqdt("bqfn", bqdq(int ), (int)24);
                            continue block27;
                        }
                        case -1466205537: {
                            v6 = d.bqdt("bqfo", bqdq(int ), (int)25);
                            continue block27;
                        }
                        case -1090568342: {
                            v6 = d.bqdt("bqfp", bqdq(int ), (int)26);
                            continue block27;
                        }
                        case 1970781466: {
                            break block27;
                        }
                    }
                    break;
                }
                return this.manager;
lbl63:
                // 3 sources

                case 0: {
                    do {
                        var2_2 /* !! */  = (int)d.bqdt("bqfq", bqdz(int ), (int)18);
                    } while (!var3_1);
                    throw null;
                }
                case 1: {
                    var2_2 /* !! */  = (int)d.bqdt("bqfr", bqdz(int ), (int)19);
                    if (!var3_1) ** GOTO lbl63
                    throw null;
                }
                case 2: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var2_2 /* !! */  = (int)d.bqdt("bqfs", bqdz(int ), (int)20);
                        if (!var3_1) ** GOTO lbl63
                        throw null;
                    }
                }
                case 3: 
            }
        }
        var2_2 /* !! */  = (int)d.bqdt("bqft", bqdz(int ), (int)21);
        ** while (!var3_1)
lbl80:
        // 1 sources

        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public oz getDiscordManager() {
        v0 /* !! */  = d.dt;
        block14: while (true) {
            switch ((int)v0 /* !! */ ) {
                case 810849735: {
                    v0 /* !! */  = (long)(d.bqdt("bqfv", bqdq(int ), (int)28) - d.bqdt("bqfu", bqdq(int ), (int)27));
                    continue block14;
                }
                case 1970781466: {
                    break block14;
                }
            }
            break;
        }
        var3_1 = d.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = d.dt - d.bqdt("bqfw", bqdq(int ), (int)29)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == d.bqdt("bqfx", bqdz(int ), (int)22)) break;
            v1 /* !! */  = (long)d.bqdt("bqfy", bqdz(int ), (int)23);
        }
        var2_2 /* !! */  = d.b;
        v2 /* !! */  = d.dt;
        block16: while (true) {
            switch ((int)v2 /* !! */ ) {
                case 1192586808: {
                    v2 /* !! */  = (long)(d.bqdt("bqga", bqdq(int ), (int)31) - d.bqdt("bqfz", bqdq(int ), (int)30));
                    continue block16;
                }
                case 1970781466: {
                    break block16;
                }
            }
            break;
        }
        var1_3 = d.a;
        if (var3_1) {
            throw null;
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block17: while (true) {
            block25: {
                switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var1_3 != false) return null;
                        if (var1_3 != false) return null;
                        while (true) {
                            if ((v3 /* !! */  = (cfr_temp_2 = d.dt - d.bqdt("bqgb", bqdq(int ), (int)32)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                            if (v3 /* !! */  == d.bqdt("bqgc", bqdz(int ), (int)24)) {
                                return this.discordManager;
                            }
                            v3 /* !! */  = (long)d.bqdt("bqgd", bqdz(int ), (int)25);
                        }
                    }
                    case 2: {
                        var2_2 /* !! */  = (int)d.bqdt("bqgg", bqdz(int ), (int)28);
                        cfr_temp_0 = 1;
                        if (var3_1) {
                            throw null;
                        }
                        break block25;
                    }
                    case 3: {
                        var2_2 /* !! */  = (int)d.bqdt("bqgh", bqdz(int ), (int)29);
                        if (var3_1) {
                            throw null;
                        }
                        ** GOTO lbl-1000
                    }
                    case 0: lbl-1000:
                    // 2 sources

                    {
                        var2_2 /* !! */  = (int)d.bqdt("bqge", bqdz(int ), (int)26);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 1: 
                }
                ** GOTO lbl60
            }
            do {
                if (true) continue block17;
lbl60:
                // 2 sources

                var2_2 /* !! */  = (int)d.bqdt("bqgf", bqdz(int ), (int)27);
                cfr_temp_0 = 0;
            } while (!var3_1);
            break;
        }
        throw null;
    }

    private static int __adl_guard_2505df37eaad9d80() {
        return 415313736;
    }
}

