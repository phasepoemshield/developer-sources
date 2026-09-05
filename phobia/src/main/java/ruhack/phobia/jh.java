/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1799
 *  net.minecraft.class_1802
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.Arrays;
import java.util.Set;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import ruhack.phobia.ds;
import ruhack.phobia.du;
import ruhack.phobia.jx;
import ruhack.phobia.kb;
import ruhack.phobia.kf;

public final class jh
extends ds {
    private static int[] aehj = new int[119];
    private static long[] aehx;
    public static final boolean c;
    public final kf maceModel;
    public final kb selfOnly;
    private static jh instance;
    public static final boolean a;
    protected static final long bq = -2764677199210924509L;
    private static final String[] MACE_WEAPONS;
    public final kf swordModel;
    private static final String[] ALL_WEAPONS;
    public static final int b;
    private static long[] aehw;
    private static final Set<String> MACE_WEAPON_SET;
    private static int[] aehk;
    private static final Set<String> OTHER_WEAPON_SET;
    private static final String[] SWORD_WEAPONS;

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public jh() {
        var2_1 /* !! */  = jh.b;
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block10: while (true) {
            block12: {
                switch (cfr_temp_0 == -2147483648 ? var2_1 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        super("Item Replacer", "\u0417\u0430\u043c\u0435\u043d\u044f\u0435\u0442 \u043c\u043e\u0434\u0435\u043b\u044c \u0432\u0430\u043d\u0438\u043b\u044c\u043d\u043e\u0433\u043e \u043c\u0435\u0447\u0430 \u0438\u043b\u0438 \u0431\u0443\u043b\u0430\u0432\u044b", du.RENDER);
                        this.selfOnly = new kb("\u0422\u043e\u043b\u044c\u043a\u043e \u0434\u043b\u044f \u0441\u0435\u0431\u044f", "\u0417\u0430\u043c\u0435\u043d\u044f\u0442\u044c \u043c\u043e\u0434\u0435\u043b\u044c \u043e\u0440\u0443\u0436\u0438\u044f \u0442\u043e\u043b\u044c\u043a\u043e \u0443 \u0441\u0432\u043e\u0435\u0433\u043e \u0438\u0433\u0440\u043e\u043a\u0430").setValue((boolean)jh.aehl("aehm", aehi(int ), (int)0));
                        this.swordModel = new kf("\u041c\u0435\u0447", "\u041c\u043e\u0434\u0435\u043b\u044c, \u0437\u0430\u043c\u0435\u043d\u044f\u044e\u0449\u0430\u044f \u0432\u0441\u0435 \u0432\u0430\u043d\u0438\u043b\u044c\u043d\u044b\u0435 \u043c\u0435\u0447\u0438", jh.SWORD_WEAPONS[0], jh.SWORD_WEAPONS);
                        this.maceModel = new kf("\u0411\u0443\u043b\u0430\u0432\u0430", "\u041c\u043e\u0434\u0435\u043b\u044c, \u0437\u0430\u043c\u0435\u043d\u044f\u044e\u0449\u0430\u044f \u0432\u0430\u043d\u0438\u043b\u044c\u043d\u0443\u044e \u0431\u0443\u043b\u0430\u0432\u0443", jh.MACE_WEAPONS[0], jh.MACE_WEAPONS);
                        jh.instance = this;
                        this.settings(new jx[]{this.selfOnly, this.swordModel, this.maceModel});
                        return;
                    }
                    case 1: {
                        var2_1 /* !! */  = (int)jh.aehl("aeho", aehi(int ), (int)2);
                    }
                    case 0: {
                        var2_1 /* !! */  = (int)jh.aehl("aehn", aehi(int ), (int)1);
                        cfr_temp_0 = 4;
                        break block12;
                    }
                    case 2: {
                        var2_1 /* !! */  = (int)jh.aehl("aehp", aehi(int ), (int)3);
                        cfr_temp_0 = 5;
                        break block12;
                    }
                    case 3: {
                        var2_1 /* !! */  = (int)jh.aehl("aehq", aehi(int ), (int)4);
                        cfr_temp_0 = 4;
                        break block12;
                    }
                    case 6: {
                        var2_1 /* !! */  = (int)jh.aehl("aeht", aehi(int ), (int)7);
                        ** GOTO lbl-1000
                    }
                    case 7: lbl-1000:
                    // 2 sources

                    {
                        var2_1 /* !! */  = (int)jh.aehl("aehu", aehi(int ), (int)8);
                        ** GOTO lbl-1000
                    }
                    case 4: lbl-1000:
                    // 2 sources

                    {
                        var2_1 /* !! */  = (int)jh.aehl("aehr", aehi(int ), (int)5);
                    }
                    case 5: 
                }
                ** GOTO lbl42
            }
            while (true) {
                if (true) continue block10;
lbl42:
                // 2 sources

                var2_1 /* !! */  = (int)jh.aehl("aehs", aehi(int ), (int)6);
                cfr_temp_0 = 4;
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ String[] lambda$static$1(int var0) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = jh.bq - jh.aehl("aeoh", aehv(int ), (int)79)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == jh.aehl("aeoi", aehi(int ), (int)95)) break;
            v0 /* !! */  = (long)jh.aehl("aeoj", aehi(int ), (int)96);
        }
        var3_1 = jh.c;
        v1 /* !! */  = jh.bq;
        if (true) ** GOTO lbl12
        block15: while (true) {
            v1 /* !! */  = (long)(jh.aehl("aeol", aehv(int ), (int)81) - jh.aehl("aeok", aehv(int ), (int)80));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1553289808: {
                    continue block15;
                }
                case 912864803: {
                    break block15;
                }
            }
            break;
        }
        var2_2 /* !! */  = jh.b;
        v2 /* !! */  = jh.bq;
        if (true) ** GOTO lbl22
        block16: while (true) {
            v2 /* !! */  = (long)(jh.aehl("aeon", aehv(int ), (int)83) - jh.aehl("aeom", aehv(int ), (int)82));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -785635544: {
                    continue block16;
                }
                case 912864803: {
                    break block16;
                }
            }
            break;
        }
        var1_3 = jh.a;
        if (var3_1) {
            throw null;
            return null;
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block8 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** continue;
                return new String[var0];
            }
lbl37:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)jh.aehl("aeoo", aehi(int ), (int)97);
                    if (!var3_1) break block8;
                    throw null;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)jh.aehl("aeop", aehi(int ), (int)98);
                if (!var3_1) break;
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)jh.aehl("aeoq", aehi(int ), (int)99);
                if (!var3_1) ** GOTO lbl37
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)jh.aehl("aeor", aehi(int ), (int)100);
        ** while (!var3_1)
lbl53:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static jh getInstance() {
        v0 /* !! */  = jh.bq;
        if (true) ** GOTO lbl5
        block15: while (true) {
            v0 /* !! */  = (long)(jh.aehl("aehz", aehv(int ), (int)1) - jh.aehl("aehy", aehv(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 571866575: {
                    continue block15;
                }
                case 912864803: {
                    break block15;
                }
            }
            break;
        }
        var2 = jh.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = jh.bq - jh.aehl("aeia", aehv(int ), (int)2)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == jh.aehl("aeib", aehi(int ), (int)9)) break;
            v1 /* !! */  = (long)jh.aehl("aeic", aehi(int ), (int)10);
        }
        var1_1 /* !! */  = jh.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = jh.bq - jh.aehl("aeid", aehv(int ), (int)3)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == jh.aehl("aeie", aehi(int ), (int)11)) break;
            v2 /* !! */  = (long)jh.aehl("aeif", aehi(int ), (int)12);
        }
        var0_2 = jh.a;
        if (var2) {
            throw null;
lbl27:
            // 2 sources

            return null;
        }
        if (var0_2) ** GOTO lbl27
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var0_2) ** continue;
                v3 /* !! */  = jh.bq;
                if (true) ** GOTO lbl38
                block19: while (true) {
                    v3 /* !! */  = (long)(v4 - jh.aehl("aeig", aehv(int ), (int)4));
lbl38:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1643679819: {
                            v4 = jh.aehl("aeih", aehv(int ), (int)5);
                            continue block19;
                        }
                        case 912864803: {
                            break block19;
                        }
                        case 1902748520: {
                            v4 = jh.aehl("aeii", aehv(int ), (int)6);
                            continue block19;
                        }
                    }
                    break;
                }
                return jh.instance;
            }
            case 0: {
                var1_1 /* !! */  = (int)jh.aehl("aeij", aehi(int ), (int)13);
                if (!var2) break;
                throw null;
            }
            case 1: {
                var1_1 /* !! */  = (int)jh.aehl("aeik", aehi(int ), (int)14);
                if (!var2) break;
                throw null;
            }
            case 2: {
                var1_1 /* !! */  = (int)jh.aehl("aeil", aehi(int ), (int)15);
                if (!var2) break;
                throw null;
            }
            case 3: 
        }
        do {
            var1_1 /* !! */  = (int)jh.aehl("aeim", aehi(int ), (int)16);
        } while (!var2);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static boolean isSword(class_1799 var0) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = jh.bq - jh.aehl("aekx", aehv(int ), (int)39)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == jh.aehl("aeky", aehi(int ), (int)47)) break;
            v0 /* !! */  = (long)jh.aehl("aekz", aehi(int ), (int)48);
        }
        var3_1 = jh.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = jh.bq - jh.aehl("aela", aehv(int ), (int)40)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == jh.aehl("aelb", aehi(int ), (int)49)) break;
            v1 /* !! */  = (long)jh.aehl("aelc", aehi(int ), (int)50);
        }
        var2_2 /* !! */  = jh.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = jh.bq - jh.aehl("aeld", aehv(int ), (int)41)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == jh.aehl("aele", aehi(int ), (int)51)) break;
            v2 /* !! */  = (long)jh.aehl("aelf", aehi(int ), (int)52);
        }
        var1_3 = jh.a;
        if (var3_1) {
            throw null;
lbl24:
            // 11 sources

            return (boolean)jh.aehl("aelg", aehi(int ), (int)53);
        }
        if (var1_3) ** GOTO lbl24
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl24
                v3 /* !! */  = jh.bq;
                if (true) ** GOTO lbl35
                block49: while (true) {
                    v3 /* !! */  = (long)(v4 - jh.aehl("aelh", aehv(int ), (int)42));
lbl35:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1794343880: {
                            v4 = jh.aehl("aeli", aehv(int ), (int)43);
                            continue block49;
                        }
                        case 46741029: {
                            v4 = jh.aehl("aelj", aehv(int ), (int)44);
                            continue block49;
                        }
                        case 912864803: {
                            break block49;
                        }
                        case 1091389659: {
                            v4 = jh.aehl("aelk", aehv(int ), (int)45);
                            continue block49;
                        }
                    }
                    break;
                }
                v5 /* !! */  = jh.bq;
                if (true) ** GOTO lbl51
                block50: while (true) {
                    v5 /* !! */  = (long)(jh.aehl("aelm", aehv(int ), (int)47) - jh.aehl("aell", aehv(int ), (int)46));
lbl51:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case 912864803: {
                            break block50;
                        }
                        case 1136578712: {
                            continue block50;
                        }
                    }
                    break;
                }
                if (var0.method_31574(class_1802.field_8091)) ** GOTO lbl158
                if (var1_3) ** GOTO lbl24
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_3 = jh.bq - jh.aehl("aeln", aehv(int ), (int)48)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v6 /* !! */  == jh.aehl("aelo", aehi(int ), (int)54)) break;
                    v6 /* !! */  = (long)jh.aehl("aelp", aehi(int ), (int)55);
                }
                v7 /* !! */  = jh.bq;
                if (true) ** GOTO lbl68
                block52: while (true) {
                    v7 /* !! */  = (long)(jh.aehl("aelr", aehv(int ), (int)50) - jh.aehl("aelq", aehv(int ), (int)49));
lbl68:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case 912864803: {
                            break block52;
                        }
                        case 1924259394: {
                            continue block52;
                        }
                    }
                    break;
                }
                if (var0.method_31574(class_1802.field_8528)) ** GOTO lbl158
                if (var1_3) ** GOTO lbl24
                v8 /* !! */  = jh.bq;
                if (true) ** GOTO lbl79
                block53: while (true) {
                    v8 /* !! */  = (long)(jh.aehl("aelt", aehv(int ), (int)52) - jh.aehl("aels", aehv(int ), (int)51));
lbl79:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -1637657371: {
                            continue block53;
                        }
                        case 912864803: {
                            break block53;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_4 = jh.bq - jh.aehl("aelu", aehv(int ), (int)53)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v9 /* !! */  == jh.aehl("aelv", aehi(int ), (int)56)) break;
                    v9 /* !! */  = (long)jh.aehl("aelw", aehi(int ), (int)57);
                }
                if (var0.method_31574(class_1802.field_61338)) ** GOTO lbl158
                if (var1_3) ** GOTO lbl24
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_5 = jh.bq - jh.aehl("aelx", aehv(int ), (int)54)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v10 /* !! */  == jh.aehl("aely", aehi(int ), (int)58)) break;
                    v10 /* !! */  = (long)jh.aehl("aelz", aehi(int ), (int)59);
                }
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_6 = jh.bq - jh.aehl("aema", aehv(int ), (int)55)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v11 /* !! */  == jh.aehl("aemb", aehi(int ), (int)60)) break;
                    v11 /* !! */  = (long)jh.aehl("aemc", aehi(int ), (int)61);
                }
                if (var0.method_31574(class_1802.field_8371)) ** GOTO lbl158
                if (var1_3) ** GOTO lbl24
                v12 /* !! */  = jh.bq;
                if (true) ** GOTO lbl110
                block57: while (true) {
                    v12 /* !! */  = (long)(jh.aehl("aeme", aehv(int ), (int)57) - jh.aehl("aemd", aehv(int ), (int)56));
lbl110:
                    // 2 sources

                    switch ((int)v12 /* !! */ ) {
                        case -1083540316: {
                            continue block57;
                        }
                        case 912864803: {
                            break block57;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v13 /* !! */  = (cfr_temp_7 = jh.bq - jh.aehl("aemf", aehv(int ), (int)58)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v13 /* !! */  == jh.aehl("aemg", aehi(int ), (int)62)) break;
                    v13 /* !! */  = (long)jh.aehl("aemh", aehi(int ), (int)63);
                }
                if (var0.method_31574(class_1802.field_8845)) ** GOTO lbl158
                if (var1_3) ** GOTO lbl24
                while (true) {
                    if ((v14 /* !! */  = (cfr_temp_8 = jh.bq - jh.aehl("aemi", aehv(int ), (int)59)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v14 /* !! */  == jh.aehl("aemj", aehi(int ), (int)64)) break;
                    v14 /* !! */  = (long)jh.aehl("aemk", aehi(int ), (int)65);
                }
                while (true) {
                    if ((v15 /* !! */  = (cfr_temp_9 = jh.bq - jh.aehl("aeml", aehv(int ), (int)60)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v15 /* !! */  == jh.aehl("aemm", aehi(int ), (int)66)) break;
                    v15 /* !! */  = (long)jh.aehl("aemn", aehi(int ), (int)67);
                }
                if (var0.method_31574(class_1802.field_8802)) ** GOTO lbl158
                if (var1_3) ** GOTO lbl24
                v16 /* !! */  = jh.bq;
                if (true) ** GOTO lbl141
                block61: while (true) {
                    v16 /* !! */  = (long)(v17 - jh.aehl("aemo", aehv(int ), (int)61));
lbl141:
                    // 2 sources

                    switch ((int)v16 /* !! */ ) {
                        case -634852388: {
                            v17 = jh.aehl("aemp", aehv(int ), (int)62);
                            continue block61;
                        }
                        case 536066170: {
                            v17 = jh.aehl("aemq", aehv(int ), (int)63);
                            continue block61;
                        }
                        case 912864803: {
                            break block61;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v18 /* !! */  = (cfr_temp_10 = jh.bq - jh.aehl("aemr", aehv(int ), (int)64)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v18 /* !! */  == jh.aehl("aems", aehi(int ), (int)68)) break;
                    v18 /* !! */  = (long)jh.aehl("aemt", aehi(int ), (int)69);
                }
                if (!var0.method_31574(class_1802.field_22022)) ** GOTO lbl163
                if (var1_3) ** GOTO lbl24
lbl158:
                // 7 sources

                if (var1_3 || var1_3) ** GOTO lbl24
                v19 = jh.aehl("aemu", aehi(int ), (int)70);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl166
lbl163:
                // 1 sources

                if (!var1_3 && !var1_3) ** break;
                ** continue;
                v19 = jh.aehl("aemv", aehi(int ), (int)71);
lbl166:
                // 2 sources

                return (boolean)v19;
            }
            case 0: {
                var2_2 /* !! */  = (int)jh.aehl("aemw", aehi(int ), (int)72);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl204
            }
lbl172:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)jh.aehl("aemx", aehi(int ), (int)73);
                if (var3_1) {
                    throw null;
                }
            }
lbl176:
            // 4 sources

            case 2: {
                var2_2 /* !! */  = (int)jh.aehl("aemy", aehi(int ), (int)74);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl226
            }
lbl181:
            // 2 sources

            case 3: {
                var2_2 /* !! */  = (int)jh.aehl("aemz", aehi(int ), (int)75);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl195
            }
            case 4: {
                var2_2 /* !! */  = (int)jh.aehl("aena", aehi(int ), (int)76);
                if (!var3_1) ** GOTO lbl172
                throw null;
            }
lbl190:
            // 2 sources

            case 5: {
                var2_2 /* !! */  = (int)jh.aehl("aenb", aehi(int ), (int)77);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl214
            }
lbl195:
            // 3 sources

            case 6: {
                var2_2 /* !! */  = (int)jh.aehl("aenc", aehi(int ), (int)78);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl226
            }
lbl200:
            // 2 sources

            case 7: {
                var2_2 /* !! */  = (int)jh.aehl("aend", aehi(int ), (int)79);
                if (!var3_1) ** GOTO lbl176
                throw null;
            }
lbl204:
            // 2 sources

            case 8: {
                var2_2 /* !! */  = (int)jh.aehl("aene", aehi(int ), (int)80);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl218
            }
            case 9: {
                var2_2 /* !! */  = (int)jh.aehl("aenf", aehi(int ), (int)81);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl226
            }
lbl214:
            // 3 sources

            case 10: {
                var2_2 /* !! */  = (int)jh.aehl("aeng", aehi(int ), (int)82);
                if (!var3_1) ** GOTO lbl195
                throw null;
            }
lbl218:
            // 2 sources

            case 11: {
                var2_2 /* !! */  = (int)jh.aehl("aenh", aehi(int ), (int)83);
                if (!var3_1) ** GOTO lbl214
                throw null;
            }
            case 12: {
                var2_2 /* !! */  = (int)jh.aehl("aeni", aehi(int ), (int)84);
                if (!var3_1) ** GOTO lbl190
                throw null;
            }
lbl226:
            // 4 sources

            case 13: {
                var2_2 /* !! */  = (int)jh.aehl("aenj", aehi(int ), (int)85);
                if (!var3_1) ** GOTO lbl200
                throw null;
            }
            case 14: {
                var2_2 /* !! */  = (int)jh.aehl("aenk", aehi(int ), (int)86);
                if (!var3_1) ** GOTO lbl181
                throw null;
            }
            case 15: 
        }
        do {
            var2_2 /* !! */  = (int)jh.aehl("aenl", aehi(int ), (int)87);
        } while (!var3_1);
        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ boolean lambda$static$0(String var0) {
        v0 /* !! */  = jh.bq;
        if (true) ** GOTO lbl5
        block30: while (true) {
            v0 /* !! */  = (long)(v1 - jh.aehl("aeos", aehv(int ), (int)84));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1628787201: {
                    v1 = jh.aehl("aeot", aehv(int ), (int)85);
                    continue block30;
                }
                case -817712863: {
                    v1 = jh.aehl("aeou", aehv(int ), (int)86);
                    continue block30;
                }
                case 912864803: {
                    break block30;
                }
            }
            break;
        }
        var3_1 = jh.c;
        while (true) {
            block60: {
                if ((v2 /* !! */  = (cfr_temp_1 = jh.bq - jh.aehl("aeov", aehv(int ), (int)87)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v2 /* !! */  != jh.aehl("aeow", aehi(int ), (int)101)) break block60;
                var2_2 /* !! */  = jh.b;
                if (var2_2 /* !! */  != 0) {
                    break;
                }
                ** GOTO lbl-1000
            }
            v2 /* !! */  = (long)jh.aehl("aeox", aehi(int ), (int)102);
        }
        cfr_temp_0 = -2147483648;
        block32: while (true) {
            block61: {
                switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        while (true) {
                            if ((v3 /* !! */  = (cfr_temp_2 = jh.bq - jh.aehl("aeoy", aehv(int ), (int)88)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                                continue;
                            }
                            if (v3 /* !! */  == jh.aehl("aeoz", aehi(int ), (int)103)) {
                                var1_3 = jh.a;
                                if (var3_1) {
                                    throw null;
                                }
                                break;
                            }
                            v3 /* !! */  = (long)jh.aehl("aepa", aehi(int ), (int)104);
                        }
                        if (var1_3 || var1_3) return (boolean)jh.aehl("aepb", aehi(int ), (int)105);
                        v4 /* !! */  = jh.bq;
                        block34: while (true) {
                            switch ((int)v4 /* !! */ ) {
                                case -2147115018: {
                                    v4 /* !! */  = (long)(jh.aehl("aepd", aehv(int ), (int)90) - jh.aehl("aepc", aehv(int ), (int)89));
                                    continue block34;
                                }
                                case 912864803: {
                                    break block34;
                                }
                            }
                            break;
                        }
                        while (true) {
                            if ((v5 /* !! */  = (cfr_temp_3 = jh.bq - jh.aehl("aepe", aehv(int ), (int)91)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                                continue;
                            }
                            if (v5 /* !! */  != jh.aehl("aepf", aehi(int ), (int)106)) ** GOTO lbl56
                            if (!jh.MACE_WEAPON_SET.contains(var0)) {
                                break;
                            }
                            ** GOTO lbl87
lbl56:
                            // 1 sources

                            v5 /* !! */  = (long)jh.aehl("aepg", aehi(int ), (int)107);
                        }
                        if (var1_3) return (boolean)jh.aehl("aepb", aehi(int ), (int)105);
                        v6 /* !! */  = jh.bq;
                        block36: while (true) {
                            switch ((int)v6 /* !! */ ) {
                                case -1067885501: {
                                    v7 = jh.aehl("aepi", aehv(int ), (int)93);
                                    ** GOTO lbl70
                                }
                                case -985379781: {
                                    v7 = jh.aehl("aepj", aehv(int ), (int)94);
                                    ** GOTO lbl70
                                }
                                case 488404686: {
                                    v7 = jh.aehl("aepk", aehv(int ), (int)95);
lbl70:
                                    // 3 sources

                                    v6 /* !! */  = (long)(v7 - jh.aehl("aeph", aehv(int ), (int)92));
                                    continue block36;
                                }
                                case 912864803: {
                                    break block36;
                                }
                            }
                            break;
                        }
                        v8 /* !! */  = jh.bq;
                        block37: while (true) {
                            switch ((int)v8 /* !! */ ) {
                                case 912864803: {
                                    break block37;
                                }
                                case 2117506530: {
                                    v8 /* !! */  = (long)(jh.aehl("aepm", aehv(int ), (int)97) - jh.aehl("aepl", aehv(int ), (int)96));
                                    continue block37;
                                }
                            }
                            break;
                        }
                        if (!jh.OTHER_WEAPON_SET.contains(var0)) {
                            if (var1_3) return (boolean)jh.aehl("aepb", aehi(int ), (int)105);
                            v9 = jh.aehl("aepn", aehi(int ), (int)108);
                            if (!var3_1) return (boolean)v9;
                            throw null;
                        }
lbl87:
                        // 3 sources

                        if (var1_3 || var1_3) {
                            return (boolean)jh.aehl("aepb", aehi(int ), (int)105);
                        }
                        v9 = jh.aehl("aepo", aehi(int ), (int)109);
                        return (boolean)v9;
                    }
                    case 0: {
                        ** GOTO lbl117
                    }
                    case 4: {
                        var2_2 /* !! */  = (int)jh.aehl("aept", aehi(int ), (int)114);
                        if (var3_1) {
                            throw null;
                        }
                        ** GOTO lbl-1000
                    }
                    case 5: {
                        do {
                            var2_2 /* !! */  = (int)jh.aehl("aepu", aehi(int ), (int)115);
                        } while (!var3_1);
                        throw null;
                    }
                    case 7: {
                        var2_2 /* !! */  = (int)jh.aehl("aepw", aehi(int ), (int)117);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 6: {
                        var2_2 /* !! */  = (int)jh.aehl("aepv", aehi(int ), (int)116);
                        cfr_temp_0 = 3;
                        if (var3_1) {
                            throw null;
                        }
                        break block61;
                    }
                    case 8: lbl-1000:
                    // 2 sources

                    {
                        var2_2 /* !! */  = (int)jh.aehl("aepx", aehi(int ), (int)118);
                        if (var3_1) {
                            throw null;
                        }
lbl117:
                        // 3 sources

                        var2_2 /* !! */  = (int)jh.aehl("aepp", aehi(int ), (int)110);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 1: {
                        var2_2 /* !! */  = (int)jh.aehl("aepq", aehi(int ), (int)111);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 2: {
                        var2_2 /* !! */  = (int)jh.aehl("aepr", aehi(int ), (int)112);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 3: 
                }
                ** GOTO lbl133
            }
            do {
                if (true) continue block32;
lbl133:
                // 2 sources

                var2_2 /* !! */  = (int)jh.aehl("aeps", aehi(int ), (int)113);
                cfr_temp_0 = 2;
            } while (!var3_1);
            break;
        }
        throw null;
    }

    private static /* synthetic */ void aepz() {
        jh.aehj[100] = -1566791089;
        jh.aehj[101] = -680378409;
        jh.aehj[102] = 1878316769;
        jh.aehj[103] = 368427909;
        jh.aehj[104] = -1104282091;
        jh.aehj[105] = -1529914601;
        jh.aehj[106] = 1411218916;
        jh.aehj[107] = -281357713;
        jh.aehj[108] = -1748113333;
        jh.aehj[109] = 465720212;
        jh.aehj[110] = 1219111997;
        jh.aehj[111] = -1348025838;
        jh.aehj[112] = -1971804643;
        jh.aehj[113] = -2099253397;
        jh.aehj[114] = -931101927;
        jh.aehj[115] = -1345150039;
        jh.aehj[116] = 1783875176;
        jh.aehj[117] = 252677122;
        jh.aehj[118] = 716169943;
    }

    private static /* synthetic */ void aeqa() {
        jh.aehk[0] = -2003102021;
        jh.aehk[1] = 353752923;
        jh.aehk[2] = 1490885348;
        jh.aehk[3] = 1156959509;
        jh.aehk[4] = 1430612058;
        jh.aehk[5] = 1181134564;
        jh.aehk[6] = -1145136076;
        jh.aehk[7] = -100668928;
        jh.aehk[8] = -1516391948;
        jh.aehk[9] = -2047078985;
        jh.aehk[10] = 1322767828;
        jh.aehk[11] = 1869555017;
        jh.aehk[12] = -683728996;
        jh.aehk[13] = 1464676663;
        jh.aehk[14] = -134622151;
        jh.aehk[15] = -891291735;
        jh.aehk[16] = -577125259;
        jh.aehk[17] = 1015978297;
        jh.aehk[18] = -567247209;
        jh.aehk[19] = 1526540671;
        jh.aehk[20] = -1569345844;
        jh.aehk[21] = -1926692166;
        jh.aehk[22] = 1273111070;
        jh.aehk[23] = -970891337;
        jh.aehk[24] = -706483418;
        jh.aehk[25] = 421733132;
        jh.aehk[26] = -1973084252;
        jh.aehk[27] = -1912008421;
        jh.aehk[28] = 1500074905;
        jh.aehk[29] = 1623483906;
        jh.aehk[30] = -952672038;
        jh.aehk[31] = 2069570966;
        jh.aehk[32] = 236386396;
        jh.aehk[33] = -944540776;
        jh.aehk[34] = -604867504;
        jh.aehk[35] = 168509329;
        jh.aehk[36] = 578957795;
        jh.aehk[37] = 1857479928;
        jh.aehk[38] = -183403379;
        jh.aehk[39] = 264446942;
        jh.aehk[40] = 666952332;
        jh.aehk[41] = -1619098551;
        jh.aehk[42] = 1334103316;
        jh.aehk[43] = 1284045775;
        jh.aehk[44] = -2006738722;
        jh.aehk[45] = 1998164699;
        jh.aehk[46] = 1437545905;
        jh.aehk[47] = 1308054042;
        jh.aehk[48] = -707684710;
        jh.aehk[49] = 1970647773;
        jh.aehk[50] = 651818432;
        jh.aehk[51] = -1545094710;
        jh.aehk[52] = 696128871;
        jh.aehk[53] = -123356510;
        jh.aehk[54] = 531168979;
        jh.aehk[55] = 2078628936;
        jh.aehk[56] = -327922684;
        jh.aehk[57] = -660146461;
        jh.aehk[58] = 1748373523;
        jh.aehk[59] = -1640297157;
        jh.aehk[60] = -701347984;
        jh.aehk[61] = -2021849420;
        jh.aehk[62] = -1585592273;
        jh.aehk[63] = -2008328453;
        jh.aehk[64] = 338229542;
        jh.aehk[65] = -1852700108;
        jh.aehk[66] = 775007483;
        jh.aehk[67] = 2103653800;
        jh.aehk[68] = -1511614045;
        jh.aehk[69] = -218148086;
        jh.aehk[70] = 460677961;
        jh.aehk[71] = -1124978645;
        jh.aehk[72] = 1111607122;
        jh.aehk[73] = -1814908132;
        jh.aehk[74] = 951436470;
        jh.aehk[75] = -150906812;
        jh.aehk[76] = 453689236;
        jh.aehk[77] = -853302450;
        jh.aehk[78] = -1585334790;
        jh.aehk[79] = 2029334998;
        jh.aehk[80] = -1678993409;
        jh.aehk[81] = 1472149323;
        jh.aehk[82] = 1656778681;
        jh.aehk[83] = -74643483;
        jh.aehk[84] = -1404867366;
        jh.aehk[85] = 98750175;
        jh.aehk[86] = -370163465;
        jh.aehk[87] = -639071141;
        jh.aehk[88] = -545388110;
        jh.aehk[89] = 618908744;
        jh.aehk[90] = 105975862;
        jh.aehk[91] = 1672834437;
        jh.aehk[92] = -1350892393;
        jh.aehk[93] = -588711199;
        jh.aehk[94] = -1345220531;
        jh.aehk[95] = 1011299225;
        jh.aehk[96] = -733100306;
        jh.aehk[97] = 480579121;
        jh.aehk[98] = -1982538318;
        jh.aehk[99] = 853530038;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public String selectedWeapon(class_1799 var1_1) {
        v0 /* !! */  = jh.bq;
        if (true) ** GOTO lbl5
        block42: while (true) {
            v0 /* !! */  = (long)(v1 - jh.aehl("aein", aehv(int ), (int)7));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -408183560: {
                    v1 = jh.aehl("aeio", aehv(int ), (int)8);
                    continue block42;
                }
                case -408047680: {
                    v1 = jh.aehl("aeip", aehv(int ), (int)9);
                    continue block42;
                }
                case 912864803: {
                    break block42;
                }
                case 1525621999: {
                    v1 = jh.aehl("aeiq", aehv(int ), (int)10);
                    continue block42;
                }
            }
            break;
        }
        var4_2 = jh.c;
        v2 /* !! */  = jh.bq;
        if (true) ** GOTO lbl22
        block43: while (true) {
            v2 /* !! */  = (long)(v3 - jh.aehl("aeir", aehv(int ), (int)11));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 46906514: {
                    v3 = jh.aehl("aeis", aehv(int ), (int)12);
                    continue block43;
                }
                case 912864803: {
                    break block43;
                }
                case 922874684: {
                    v3 = jh.aehl("aeit", aehv(int ), (int)13);
                    continue block43;
                }
            }
            break;
        }
        var3_3 /* !! */  = jh.b;
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_0 = jh.bq - jh.aehl("aeiu", aehv(int ), (int)14)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v4 /* !! */  == jh.aehl("aeiv", aehi(int ), (int)17)) break;
            v4 /* !! */  = (long)jh.aehl("aeiw", aehi(int ), (int)18);
        }
        var2_4 = jh.a;
        if (var4_2) {
            throw null;
lbl41:
            // 3 sources

            return null;
        }
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4 || var2_4) ** GOTO lbl41
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = jh.bq - jh.aehl("aeix", aehv(int ), (int)15)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == jh.aehl("aeiy", aehi(int ), (int)19)) break;
                    v5 /* !! */  = (long)jh.aehl("aeiz", aehi(int ), (int)20);
                }
                if (!jh.isMace(var1_1)) ** GOTO lbl88
                if (var2_4) ** GOTO lbl41
                v6 /* !! */  = jh.bq;
                if (true) ** GOTO lbl59
                block47: while (true) {
                    v6 /* !! */  = (long)(v7 - jh.aehl("aeja", aehv(int ), (int)16));
lbl59:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -925336677: {
                            v7 = jh.aehl("aejb", aehv(int ), (int)17);
                            continue block47;
                        }
                        case 912864803: {
                            break block47;
                        }
                        case 1020588912: {
                            v7 = jh.aehl("aejc", aehv(int ), (int)18);
                            continue block47;
                        }
                    }
                    break;
                }
                v8 /* !! */  = jh.bq;
                if (true) ** GOTO lbl72
                block48: while (true) {
                    v8 /* !! */  = (long)(v9 - jh.aehl("aejd", aehv(int ), (int)19));
lbl72:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -1766382711: {
                            v9 = jh.aehl("aeje", aehv(int ), (int)20);
                            continue block48;
                        }
                        case 912864803: {
                            break block48;
                        }
                        case 1070949973: {
                            v9 = jh.aehl("aejf", aehv(int ), (int)21);
                            continue block48;
                        }
                        case 2145664973: {
                            v9 = jh.aehl("aejg", aehv(int ), (int)22);
                            continue block48;
                        }
                    }
                    break;
                }
                v10 = this.maceModel.getValue();
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl116
lbl88:
                // 1 sources

                if (!var2_4 && !var2_4) ** break;
                ** continue;
                v11 /* !! */  = jh.bq;
                if (true) ** GOTO lbl94
                block49: while (true) {
                    v11 /* !! */  = (long)(jh.aehl("aeji", aehv(int ), (int)24) - jh.aehl("aejh", aehv(int ), (int)23));
lbl94:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -1497689227: {
                            continue block49;
                        }
                        case 912864803: {
                            break block49;
                        }
                    }
                    break;
                }
                v12 /* !! */  = jh.bq;
                if (true) ** GOTO lbl103
                block50: while (true) {
                    v12 /* !! */  = (long)(v13 - jh.aehl("aejj", aehv(int ), (int)25));
lbl103:
                    // 2 sources

                    switch ((int)v12 /* !! */ ) {
                        case -590293593: {
                            v13 = jh.aehl("aejk", aehv(int ), (int)26);
                            continue block50;
                        }
                        case 912864803: {
                            break block50;
                        }
                        case 1165024699: {
                            v13 = jh.aehl("aejl", aehv(int ), (int)27);
                            continue block50;
                        }
                        case 1701303777: {
                            v13 = jh.aehl("aejm", aehv(int ), (int)28);
                            continue block50;
                        }
                    }
                    break;
                }
                v10 = this.swordModel.getValue();
lbl116:
                // 2 sources

                return v10;
            }
lbl117:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)jh.aehl("aejn", aehi(int ), (int)21);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl126
            }
            case 1: {
                var3_3 /* !! */  = (int)jh.aehl("aejo", aehi(int ), (int)22);
                if (var4_2) {
                    throw null;
                }
            }
lbl126:
            // 4 sources

            case 2: {
                var3_3 /* !! */  = (int)jh.aehl("aejp", aehi(int ), (int)23);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl145
            }
            case 3: {
                var3_3 /* !! */  = (int)jh.aehl("aejq", aehi(int ), (int)24);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl145
            }
lbl136:
            // 2 sources

            case 4: {
                do {
                    var3_3 /* !! */  = (int)jh.aehl("aejr", aehi(int ), (int)25);
                } while (!var4_2);
                throw null;
            }
            case 5: {
                var3_3 /* !! */  = (int)jh.aehl("aejs", aehi(int ), (int)26);
                if (!var4_2) ** GOTO lbl117
                throw null;
            }
lbl145:
            // 3 sources

            case 6: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)jh.aehl("aejt", aehi(int ), (int)27);
                    if (!var4_2) ** GOTO lbl136
                    throw null;
                }
            }
            case 7: 
        }
        var3_3 /* !! */  = (int)jh.aehl("aeju", aehi(int ), (int)28);
        ** while (!var4_2)
lbl153:
        // 1 sources

        throw null;
    }

    static {
        aehk = new int[119];
        jh.aepy();
        jh.aepz();
        jh.aeqa();
        jh.aeqb();
        aehw = new long[98];
        aehx = new long[98];
        jh.aeqc();
        jh.aeqd();
        ALL_WEAPONS = new String[]{"Abominable Blade", "Abominable Great Saber", "Abominable Scythe", "Acidic Cleaver", "Amethyst Shuriken", "Ancient Royal Great Sword", "Aquatic Sacred Blade", "Arcanethyst", "Ashura's Blade", "Awakened Lichblade", "Blood Edge", "Bloody Death", "Bramblethorn", "Brimstone Claymore", "Carian Knight's Sword", "Chrono Blade", "Corrupted Mythic Blade", "Creation Splitter", "Crescent Rose", "Cyber Katana", "Cyber Mantis Blade", "Cyber Sword", "Cybernetic Chainsaw Blade", "Cybernetic Katana", "Cybernetic Knife", "Dainsleif", "Dark Blade", "Dark Cleaver", "Death Knight's Dagger", "Death Knight's Sword", "Demigod's Unholy Blade", "Demigod's Unholy Halberd", "Demon Lord's Great Axe", "Demon Lord's Sword", "Demonic Blade", "Demonic Cleaver", "Divine Axe Rhitta", "Divine Justice", "Divine Punisher", "Divine Reaper", "Dragon Slaying blade", "Edge Of The Astral Plane", "Emberblade", "Enigma", "Epic Sword", "Estoc", "Fallen God's Spear", "Fallen God's Sword", "Floral Longsword", "Floral Sabre", "Forest Guardian's Glaive", "Frost Axe", "Frost Blade", "Frost Scythe", "Hearthflame", "Hero Sword", "Holy Moonlight Sword", "Hornet's Needle", "Icewhisper", "Jade Halberd", "Katana", "Legendary Sword", "Longsword", "Magi Scythe", "Masamune", "Mjolnir", "Molten Blade", "Molten Sword", "Muramasa", "Mystical Spellblade", "Mythic Blade", "Ocean's Rage", "Partisan", "Pharaoh's Treasure", "Pheonix Grace", "Plague Longsword", "Power Fuse Hammer", "Power Fuse Sword", "Requiem of the Ninth Abyss", "Ribbon Cleaver", "Righteous Relic", "Rivers Of Blood", "Royal Chakram", "Royal Rapier", "Sabre", "Scissor Blade", "Sculk Cleaver", "Sculk Scythe", "Sculk Sword", "Sentinel's Will", "Silverine Blade", "Soul Claws", "Soul Collector", "Soul Devourer", "Soul Edge", "Soul Harvester", "Soul Stealer", "Soulrender", "Star's Edge", "Steel Sword", "Stop Sign", "Storm Bringer", "Storm's Edge", "Sunbreak", "Tengen's Blade", "Terra Blade", "Thousand Demon Daggers", "Thunder Bringer", "Thunderbrand", "True Excalibur", "Vampiric Needle", "Wakizashi", "Watcher Claymore", "Watching Warglaive", "Waxweaver", "Whisperwind", "Wickpiercer", "Wraith Scythe", "Yoru"};
        MACE_WEAPONS = new String[]{"Abominable Scythe", "Demon Lord's Great Axe", "Divine Axe Rhitta", "Frost Axe", "Frost Scythe", "Magi Scythe", "Mjolnir", "Power Fuse Hammer", "Sculk Scythe", "Wraith Scythe"};
        MACE_WEAPON_SET = Set.of(MACE_WEAPONS);
        OTHER_WEAPON_SET = Set.of("Acidic Cleaver", "Amethyst Shuriken", "Cybernetic Chainsaw Blade", "Dark Cleaver", "Demigod's Unholy Halberd", "Demonic Cleaver", "Divine Punisher", "Divine Reaper", "Fallen God's Spear", "Forest Guardian's Glaive", "Jade Halberd", "Ocean's Rage", "Partisan", "Pharaoh's Treasure", "Royal Chakram", "Sculk Cleaver", "Soul Claws", "Soul Collector", "Soul Harvester", "Stop Sign");
        SWORD_WEAPONS = (String[])Arrays.stream(ALL_WEAPONS).filter(jh::lambda$static$0).toArray(jh::lambda$static$1);
    }

    private static /* synthetic */ void aeqc() {
        jh.aehw[0] = -3657247427546758239L;
        jh.aehw[1] = 8101146696705656509L;
        jh.aehw[2] = 6518990439117134720L;
        jh.aehw[3] = 2206177027100113577L;
        jh.aehw[4] = -7720177434758773055L;
        jh.aehw[5] = 658798786129377399L;
        jh.aehw[6] = 1703957493500562819L;
        jh.aehw[7] = -3713204910016292117L;
        jh.aehw[8] = -2166318885525081919L;
        jh.aehw[9] = -6984387646123259195L;
        jh.aehw[10] = -741321139535998171L;
        jh.aehw[11] = 7112439248713764310L;
        jh.aehw[12] = -3745162891395221145L;
        jh.aehw[13] = -5974874989484872702L;
        jh.aehw[14] = -8168265604750021138L;
        jh.aehw[15] = 4360154489503842184L;
        jh.aehw[16] = -2967752525869568382L;
        jh.aehw[17] = -4021732616183903886L;
        jh.aehw[18] = -6610917246647193287L;
        jh.aehw[19] = 8333502015008267986L;
        jh.aehw[20] = -768760846089429894L;
        jh.aehw[21] = -384405835682760694L;
        jh.aehw[22] = 601035350938558542L;
        jh.aehw[23] = -1435680190406539393L;
        jh.aehw[24] = -3932232326613976519L;
        jh.aehw[25] = 6768531537453999257L;
        jh.aehw[26] = 8390879537270156943L;
        jh.aehw[27] = -4110117052324560957L;
        jh.aehw[28] = -3168806243799595051L;
        jh.aehw[29] = 1133956483753297735L;
        jh.aehw[30] = -6724348649634117342L;
        jh.aehw[31] = -1231411731661539382L;
        jh.aehw[32] = -1435404459128717989L;
        jh.aehw[33] = 69554284345342801L;
        jh.aehw[34] = 640689150988559555L;
        jh.aehw[35] = 8289348556225285115L;
        jh.aehw[36] = -5387523295214362856L;
        jh.aehw[37] = 120118969845220947L;
        jh.aehw[38] = -3410588365326009522L;
        jh.aehw[39] = -7795185576061876139L;
        jh.aehw[40] = -2216278655371674723L;
        jh.aehw[41] = 6062835589444061953L;
        jh.aehw[42] = -3504449437356943456L;
        jh.aehw[43] = -8824475589428048940L;
        jh.aehw[44] = 6156778149031665096L;
        jh.aehw[45] = -1874685891158174284L;
        jh.aehw[46] = -2991597933487529713L;
        jh.aehw[47] = -5767034407679601234L;
        jh.aehw[48] = 1166400714256449233L;
        jh.aehw[49] = -6789674152017783982L;
        jh.aehw[50] = -1144582506155753708L;
        jh.aehw[51] = 6134725003493334005L;
        jh.aehw[52] = -6784724465587489755L;
        jh.aehw[53] = 8824954775611261107L;
        jh.aehw[54] = 6044198548271099132L;
        jh.aehw[55] = -8829792375716606849L;
        jh.aehw[56] = -4764444881965367597L;
        jh.aehw[57] = -2456905989926482440L;
        jh.aehw[58] = 6482445522862032646L;
        jh.aehw[59] = 3414101308369319594L;
        jh.aehw[60] = 2007024267379185967L;
        jh.aehw[61] = 7570673518318053149L;
        jh.aehw[62] = -3734278902532460179L;
        jh.aehw[63] = -7187215917305294530L;
        jh.aehw[64] = 4065001531789510628L;
        jh.aehw[65] = 7455654505274029966L;
        jh.aehw[66] = -9021399182011414583L;
        jh.aehw[67] = 6730279849607530165L;
        jh.aehw[68] = -4023929069435875387L;
        jh.aehw[69] = -7657009126774873712L;
        jh.aehw[70] = 1751488732967269707L;
        jh.aehw[71] = -5857269957581034527L;
        jh.aehw[72] = -7733633800803944822L;
        jh.aehw[73] = 2760481525601930597L;
        jh.aehw[74] = 5040700430249009283L;
        jh.aehw[75] = -3604699179274160452L;
        jh.aehw[76] = -6466035128108140675L;
        jh.aehw[77] = 244896491542039598L;
        jh.aehw[78] = 2085275529286331388L;
        jh.aehw[79] = -7217620449690723632L;
        jh.aehw[80] = 521441531011334388L;
        jh.aehw[81] = 7895122127931698908L;
        jh.aehw[82] = -6221738290969987778L;
        jh.aehw[83] = 5982325353064623574L;
        jh.aehw[84] = -9185057098346018673L;
        jh.aehw[85] = -5850499255063801588L;
        jh.aehw[86] = 5612858651745871733L;
        jh.aehw[87] = 8868516006985670275L;
        jh.aehw[88] = -6584216929062966896L;
        jh.aehw[89] = -1426400174086109815L;
        jh.aehw[90] = -620723388136935739L;
        jh.aehw[91] = 978189467148934806L;
        jh.aehw[92] = -8476594213115362121L;
        jh.aehw[93] = 4455904049562799836L;
        jh.aehw[94] = 7965733849901982779L;
        jh.aehw[95] = -8651657648797682599L;
        jh.aehw[96] = 1796780416483061183L;
        jh.aehw[97] = 6577128413729800078L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static boolean isMace(class_1799 var0) {
        v0 /* !! */  = jh.bq;
        if (true) ** GOTO lbl5
        block27: while (true) {
            v0 /* !! */  = (long)(v1 - jh.aehl("aenm", aehv(int ), (int)65));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1250865693: {
                    v1 = jh.aehl("aenn", aehv(int ), (int)66);
                    continue block27;
                }
                case 570643865: {
                    v1 = jh.aehl("aeno", aehv(int ), (int)67);
                    continue block27;
                }
                case 912864803: {
                    break block27;
                }
                case 1627289129: {
                    v1 = jh.aehl("aenp", aehv(int ), (int)68);
                    continue block27;
                }
            }
            break;
        }
        var3_1 = jh.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = jh.bq - jh.aehl("aenq", aehv(int ), (int)69)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == jh.aehl("aenr", aehi(int ), (int)88)) break;
            v2 /* !! */  = (long)jh.aehl("aens", aehi(int ), (int)89);
        }
        var2_2 /* !! */  = jh.b;
        v3 /* !! */  = jh.bq;
        if (true) ** GOTO lbl29
        block29: while (true) {
            v3 /* !! */  = (long)(v4 - jh.aehl("aent", aehv(int ), (int)70));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1610596743: {
                    v4 = jh.aehl("aenu", aehv(int ), (int)71);
                    continue block29;
                }
                case -1393511410: {
                    v4 = jh.aehl("aenv", aehv(int ), (int)72);
                    continue block29;
                }
                case -978293076: {
                    v4 = jh.aehl("aenw", aehv(int ), (int)73);
                    continue block29;
                }
                case 912864803: {
                    break block29;
                }
            }
            break;
        }
        var1_3 = jh.a;
        if (var3_1) {
            throw null;
            return (boolean)jh.aehl("aenx", aehi(int ), (int)90);
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** continue;
                v5 /* !! */  = jh.bq;
                if (true) ** GOTO lbl54
                block31: while (true) {
                    v5 /* !! */  = (long)(v6 - jh.aehl("aeny", aehv(int ), (int)74));
lbl54:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case 912864803: {
                            break block31;
                        }
                        case 1116748383: {
                            v6 = jh.aehl("aenz", aehv(int ), (int)75);
                            continue block31;
                        }
                        case 1965022181: {
                            v6 = jh.aehl("aeoa", aehv(int ), (int)76);
                            continue block31;
                        }
                    }
                    break;
                }
                v7 /* !! */  = jh.bq;
                if (true) ** GOTO lbl67
                block32: while (true) {
                    v7 /* !! */  = (long)(jh.aehl("aeoc", aehv(int ), (int)78) - jh.aehl("aeob", aehv(int ), (int)77));
lbl67:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -1215668043: {
                            continue block32;
                        }
                        case 912864803: {
                            break block32;
                        }
                    }
                    break;
                }
                return var0.method_31574(class_1802.field_49814);
            }
            case 0: {
                var2_2 /* !! */  = (int)jh.aehl("aeod", aehi(int ), (int)91);
                if (!var3_1) break;
                throw null;
            }
            case 1: {
                var2_2 /* !! */  = (int)jh.aehl("aeoe", aehi(int ), (int)92);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: {
                do {
                    var2_2 /* !! */  = (int)jh.aehl("aeof", aehi(int ), (int)93);
                } while (!var3_1);
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)jh.aehl("aeog", aehi(int ), (int)94);
        } while (!var3_1);
        throw null;
    }

    public static /* synthetic */ CallSite aehl(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean shouldReplace(class_1799 var1_1) {
        block48: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = jh.bq - jh.aehl("aejv", aehv(int ), (int)29)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v0 /* !! */  == jh.aehl("aejw", aehi(int ), (int)29)) break;
                v0 /* !! */  = (long)jh.aehl("aejx", aehi(int ), (int)30);
            }
            var4_2 = jh.c;
            v1 /* !! */  = jh.bq;
            if (true) ** GOTO lbl12
            block28: while (true) {
                v1 /* !! */  = (long)(v2 - jh.aehl("aejy", aehv(int ), (int)30));
lbl12:
                // 2 sources

                switch ((int)v1 /* !! */ ) {
                    case -334623175: {
                        v2 = jh.aehl("aejz", aehv(int ), (int)31);
                        continue block28;
                    }
                    case 426254885: {
                        v2 = jh.aehl("aeka", aehv(int ), (int)32);
                        continue block28;
                    }
                    case 912864803: {
                        break block28;
                    }
                }
                break;
            }
            var3_3 /* !! */  = jh.b;
            v3 /* !! */  = jh.bq;
            if (true) ** GOTO lbl26
            block29: while (true) {
                v3 /* !! */  = (long)(jh.aehl("aekc", aehv(int ), (int)34) - jh.aehl("aekb", aehv(int ), (int)33));
lbl26:
                // 2 sources

                switch ((int)v3 /* !! */ ) {
                    case 912864803: {
                        break block29;
                    }
                    case 1580696130: {
                        continue block29;
                    }
                }
                break;
            }
            var2_4 = jh.a;
            if (var4_2) {
                throw null;
lbl34:
                // 5 sources

                return (boolean)jh.aehl("aekd", aehi(int ), (int)31);
            }
            if (var2_4 || var2_4) ** GOTO lbl34
            while (true) {
                if ((v4 /* !! */  = (cfr_temp_1 = jh.bq - jh.aehl("aeke", aehv(int ), (int)35)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v4 /* !! */  == jh.aehl("aekf", aehi(int ), (int)32)) break;
                v4 /* !! */  = (long)jh.aehl("aekg", aehi(int ), (int)33);
            }
            if (jh.isSword(var1_1)) break block48;
            if (var2_4) ** GOTO lbl34
            v5 /* !! */  = jh.bq;
            if (true) ** GOTO lbl49
            block32: while (true) {
                v5 /* !! */  = (long)(v6 - jh.aehl("aekh", aehv(int ), (int)36));
lbl49:
                // 2 sources

                switch ((int)v5 /* !! */ ) {
                    case 33566115: {
                        v6 = jh.aehl("aeki", aehv(int ), (int)37);
                        continue block32;
                    }
                    case 912864803: {
                        break block32;
                    }
                    case 970812657: {
                        v6 = jh.aehl("aekj", aehv(int ), (int)38);
                        continue block32;
                    }
                }
                break;
            }
            if (!jh.isMace(var1_1)) ** GOTO lbl69
            if (var2_4) ** GOTO lbl34
        }
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4 || var2_4) ** GOTO lbl34
                v7 = jh.aehl("aekk", aehi(int ), (int)34);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl72
            }
lbl69:
            // 1 sources

            if (!var2_4 && !var2_4) ** break;
            ** continue;
            v7 = jh.aehl("aekl", aehi(int ), (int)35);
lbl72:
            // 2 sources

            return (boolean)v7;
            case 0: {
                var3_3 /* !! */  = (int)jh.aehl("aekm", aehi(int ), (int)36);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl83
            }
            case 1: {
                var3_3 /* !! */  = (int)jh.aehl("aekn", aehi(int ), (int)37);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl110
            }
lbl83:
            // 3 sources

            case 2: {
                do {
                    var3_3 /* !! */  = (int)jh.aehl("aeko", aehi(int ), (int)38);
                } while (!var4_2);
                throw null;
            }
            case 3: {
                var3_3 /* !! */  = (int)jh.aehl("aekp", aehi(int ), (int)39);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl97
            }
            case 4: {
                var3_3 /* !! */  = (int)jh.aehl("aekq", aehi(int ), (int)40);
                if (var4_2) {
                    throw null;
                }
            }
lbl97:
            // 5 sources

            case 5: {
                var3_3 /* !! */  = (int)jh.aehl("aekr", aehi(int ), (int)41);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl114
            }
            case 6: {
                var3_3 /* !! */  = (int)jh.aehl("aeks", aehi(int ), (int)42);
                if (var4_2) {
                    throw null;
                }
            }
lbl106:
            // 4 sources

            case 7: {
                var3_3 /* !! */  = (int)jh.aehl("aekt", aehi(int ), (int)43);
                if (!var4_2) ** GOTO lbl97
                throw null;
            }
lbl110:
            // 2 sources

            case 8: {
                var3_3 /* !! */  = (int)jh.aehl("aeku", aehi(int ), (int)44);
                if (!var4_2) ** GOTO lbl83
                throw null;
            }
lbl114:
            // 2 sources

            case 9: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)jh.aehl("aekv", aehi(int ), (int)45);
                    if (!var4_2) ** GOTO lbl106
                    throw null;
                }
            }
            case 10: 
        }
        var3_3 /* !! */  = (int)jh.aehl("aekw", aehi(int ), (int)46);
        ** while (!var4_2)
lbl122:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ int aehi(int n2) {
        return aehj[n2] ^ aehk[n2];
    }

    private static /* synthetic */ long aehv(int n2) {
        return aehw[n2] ^ aehx[n2];
    }

    private static /* synthetic */ void aepy() {
        jh.aehj[0] = -2003102022;
        jh.aehj[1] = 353752920;
        jh.aehj[2] = 1490885344;
        jh.aehj[3] = 1156959508;
        jh.aehj[4] = 1430612061;
        jh.aehj[5] = 1181134561;
        jh.aehj[6] = -1145136075;
        jh.aehj[7] = -100668924;
        jh.aehj[8] = -1516391948;
        jh.aehj[9] = -2047078986;
        jh.aehj[10] = -1758783659;
        jh.aehj[11] = 1869555016;
        jh.aehj[12] = -323337262;
        jh.aehj[13] = 1464676663;
        jh.aehj[14] = -134622149;
        jh.aehj[15] = -891291733;
        jh.aehj[16] = -577125259;
        jh.aehj[17] = -1015978298;
        jh.aehj[18] = -2086047388;
        jh.aehj[19] = -1526540672;
        jh.aehj[20] = -888261994;
        jh.aehj[21] = -1926692162;
        jh.aehj[22] = 1273111064;
        jh.aehj[23] = -970891339;
        jh.aehj[24] = -706483417;
        jh.aehj[25] = 421733128;
        jh.aehj[26] = -1973084250;
        jh.aehj[27] = -1912008420;
        jh.aehj[28] = 1500074908;
        jh.aehj[29] = -1623483907;
        jh.aehj[30] = 1781355320;
        jh.aehj[31] = 2069570966;
        jh.aehj[32] = -236386397;
        jh.aehj[33] = -1834535279;
        jh.aehj[34] = -604867503;
        jh.aehj[35] = 168509329;
        jh.aehj[36] = 578957792;
        jh.aehj[37] = 1857479928;
        jh.aehj[38] = -183403387;
        jh.aehj[39] = 264446941;
        jh.aehj[40] = 666952335;
        jh.aehj[41] = -1619098548;
        jh.aehj[42] = 1334103319;
        jh.aehj[43] = 1284045765;
        jh.aehj[44] = -2006738721;
        jh.aehj[45] = 1998164689;
        jh.aehj[46] = 1437545907;
        jh.aehj[47] = -1308054043;
        jh.aehj[48] = 511598923;
        jh.aehj[49] = -1970647774;
        jh.aehj[50] = 235793882;
        jh.aehj[51] = 1545094709;
        jh.aehj[52] = -1580995372;
        jh.aehj[53] = -123356510;
        jh.aehj[54] = 531168978;
        jh.aehj[55] = 1054969978;
        jh.aehj[56] = -327922683;
        jh.aehj[57] = 1506214900;
        jh.aehj[58] = 1748373522;
        jh.aehj[59] = 1844606221;
        jh.aehj[60] = 701347983;
        jh.aehj[61] = 1010677029;
        jh.aehj[62] = 1585592272;
        jh.aehj[63] = 288275441;
        jh.aehj[64] = -338229543;
        jh.aehj[65] = 2091676664;
        jh.aehj[66] = -775007484;
        jh.aehj[67] = 2144434768;
        jh.aehj[68] = -1511614046;
        jh.aehj[69] = -710755662;
        jh.aehj[70] = 460677960;
        jh.aehj[71] = -1124978645;
        jh.aehj[72] = 1111607128;
        jh.aehj[73] = -1814908136;
        jh.aehj[74] = 951436469;
        jh.aehj[75] = -150906816;
        jh.aehj[76] = 453689232;
        jh.aehj[77] = -853302452;
        jh.aehj[78] = -1585334796;
        jh.aehj[79] = 2029335001;
        jh.aehj[80] = -1678993421;
        jh.aehj[81] = 1472149317;
        jh.aehj[82] = 1656778687;
        jh.aehj[83] = -74643474;
        jh.aehj[84] = -1404867372;
        jh.aehj[85] = 98750170;
        jh.aehj[86] = -370163470;
        jh.aehj[87] = -639071151;
        jh.aehj[88] = -545388109;
        jh.aehj[89] = -1242139396;
        jh.aehj[90] = 105975862;
        jh.aehj[91] = 1672834436;
        jh.aehj[92] = -1350892395;
        jh.aehj[93] = -588711200;
        jh.aehj[94] = -1345220529;
        jh.aehj[95] = 1011299224;
        jh.aehj[96] = -1702911218;
        jh.aehj[97] = 480579121;
        jh.aehj[98] = -1982538318;
        jh.aehj[99] = 853530037;
    }

    private static /* synthetic */ void aeqd() {
        jh.aehx[0] = -1245403613555583587L;
        jh.aehx[1] = 8195648708286737417L;
        jh.aehx[2] = -2667793393049338818L;
        jh.aehx[3] = -6340592539950873680L;
        jh.aehx[4] = -2128569017049005442L;
        jh.aehx[5] = 6697301834908526153L;
        jh.aehx[6] = 4276628852228499924L;
        jh.aehx[7] = -7269089103948317868L;
        jh.aehx[8] = 7427973180789354738L;
        jh.aehx[9] = -8256111307555947427L;
        jh.aehx[10] = 2629862631358303000L;
        jh.aehx[11] = 487903816841383819L;
        jh.aehx[12] = 3774870878168332458L;
        jh.aehx[13] = -4124171954487180712L;
        jh.aehx[14] = -3797336223650427569L;
        jh.aehx[15] = 6540221366009592269L;
        jh.aehx[16] = -4089293572008494473L;
        jh.aehx[17] = 3918142696562529207L;
        jh.aehx[18] = -599510813410969372L;
        jh.aehx[19] = -6852009470528446670L;
        jh.aehx[20] = 151559790805259489L;
        jh.aehx[21] = -5216329001278511044L;
        jh.aehx[22] = -5608212110318942040L;
        jh.aehx[23] = 5673613324670848084L;
        jh.aehx[24] = 6176656399821970513L;
        jh.aehx[25] = -4029900484250709493L;
        jh.aehx[26] = -3855794499242664824L;
        jh.aehx[27] = 1836006344269963476L;
        jh.aehx[28] = 2450676399450048639L;
        jh.aehx[29] = 9146253128577053443L;
        jh.aehx[30] = -3921460015518803316L;
        jh.aehx[31] = -3178525684618750785L;
        jh.aehx[32] = 3255356631084549979L;
        jh.aehx[33] = 3095906737705624109L;
        jh.aehx[34] = -2721785655254730584L;
        jh.aehx[35] = 3129063331583102541L;
        jh.aehx[36] = -6009668464007917345L;
        jh.aehx[37] = -3101347475000866701L;
        jh.aehx[38] = 9051519975136525505L;
        jh.aehx[39] = 5251146199293953465L;
        jh.aehx[40] = 4331684331859259819L;
        jh.aehx[41] = 5129294712373249120L;
        jh.aehx[42] = 8733552084591527417L;
        jh.aehx[43] = -1850873929587058213L;
        jh.aehx[44] = -4763313225239224873L;
        jh.aehx[45] = -1939013950441933308L;
        jh.aehx[46] = -1106517531480529332L;
        jh.aehx[47] = 5592384342871819196L;
        jh.aehx[48] = -5004713079678638048L;
        jh.aehx[49] = -1235802592002324582L;
        jh.aehx[50] = -2576142512813197347L;
        jh.aehx[51] = 9048889940411322985L;
        jh.aehx[52] = 7962619091865192478L;
        jh.aehx[53] = -3080075909120735288L;
        jh.aehx[54] = -7518358776801509668L;
        jh.aehx[55] = 8313491655817629536L;
        jh.aehx[56] = 2565019169018011779L;
        jh.aehx[57] = 7948950468775367897L;
        jh.aehx[58] = -5416655904489094640L;
        jh.aehx[59] = 6215803683162223567L;
        jh.aehx[60] = 650939124054114091L;
        jh.aehx[61] = 3349699126618933012L;
        jh.aehx[62] = -946212128247441650L;
        jh.aehx[63] = 5252823538228163110L;
        jh.aehx[64] = -8880298172726455442L;
        jh.aehx[65] = 8684862903724216725L;
        jh.aehx[66] = -4768595195150633392L;
        jh.aehx[67] = -2145019823146106719L;
        jh.aehx[68] = -9022473524964867957L;
        jh.aehx[69] = 1840909579553129216L;
        jh.aehx[70] = 6344927956422496221L;
        jh.aehx[71] = 5337361422822403131L;
        jh.aehx[72] = -4090406864843416778L;
        jh.aehx[73] = 6447445140583947220L;
        jh.aehx[74] = -3539221558183765527L;
        jh.aehx[75] = -4483361172702574117L;
        jh.aehx[76] = -1315850411194092301L;
        jh.aehx[77] = 75088674690642336L;
        jh.aehx[78] = -6021025906249371858L;
        jh.aehx[79] = 37411000779780554L;
        jh.aehx[80] = -7190594541254198673L;
        jh.aehx[81] = -7140756975068469781L;
        jh.aehx[82] = -7514553158428040870L;
        jh.aehx[83] = 3013175181643080431L;
        jh.aehx[84] = 1207565777550345447L;
        jh.aehx[85] = -826384835396412404L;
        jh.aehx[86] = -191806041981476893L;
        jh.aehx[87] = -5831565270811703739L;
        jh.aehx[88] = 5571662199509135537L;
        jh.aehx[89] = -812392321961410222L;
        jh.aehx[90] = 3682410816977975427L;
        jh.aehx[91] = 3078882565047817804L;
        jh.aehx[92] = -6611349192857151483L;
        jh.aehx[93] = -8914684956649988719L;
        jh.aehx[94] = 4176500625858127575L;
        jh.aehx[95] = 6963435482636129443L;
        jh.aehx[96] = 627330123825709589L;
        jh.aehx[97] = 2142830853082642869L;
    }

    private static /* synthetic */ void aeqb() {
        jh.aehk[100] = -1566791092;
        jh.aehk[101] = -680378410;
        jh.aehk[102] = 985653119;
        jh.aehk[103] = -368427910;
        jh.aehk[104] = 721855544;
        jh.aehk[105] = -1529914602;
        jh.aehk[106] = -1411218917;
        jh.aehk[107] = 662261831;
        jh.aehk[108] = -1748113334;
        jh.aehk[109] = 465720212;
        jh.aehk[110] = 1219111998;
        jh.aehk[111] = -1348025830;
        jh.aehk[112] = -1971804648;
        jh.aehk[113] = -2099253394;
        jh.aehk[114] = -931101922;
        jh.aehk[115] = -1345150047;
        jh.aehk[116] = 1783875178;
        jh.aehk[117] = 252677122;
        jh.aehk[118] = 716169942;
    }
}

