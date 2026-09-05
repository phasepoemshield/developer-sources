/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_124
 *  net.minecraft.class_2561
 *  net.minecraft.class_5250
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;
import net.minecraft.class_124;
import net.minecraft.class_2561;
import net.minecraft.class_5250;
import ruhack.phobia.g;
import ruhack.phobia.pp;

public abstract class f {
    private final String description;
    private static long[] bitd;
    private final String name;
    public static final int b;
    private static long[] bitg;
    private final List<String> aliases;
    public static final boolean a;
    private static int[] bisg;
    private static final long dj = -7971824267116542054L;
    private static int[] bisj;
    public static final boolean c;

    public abstract void execute(String var1, String[] var2);

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public f(String var1_1, String var2_2, String ... var3_3) {
        var5_4 /* !! */  = f.b;
        super();
        this.name = var1_1;
        this.description = var2_2;
        if (var5_4 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block8: while (true) {
            block11: {
                switch (cfr_temp_0 == -2147483648 ? var5_4 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        this.aliases = Arrays.asList(var3_3);
                        return;
                    }
                    case 0: {
                        while (true) {
                            var5_4 /* !! */  = (int)f.bisl("bisp", bisf(int ), (int)0);
                        }
                    }
                    case 4: {
                        var5_4 /* !! */  = (int)f.bisl("bisw", bisf(int ), (int)4);
                        cfr_temp_0 = 1;
                        break block11;
                    }
                    case 5: {
                        var5_4 /* !! */  = (int)f.bisl("bisy", bisf(int ), (int)5);
                        ** GOTO lbl-1000
                    }
                    case 1: lbl-1000:
                    // 2 sources

                    {
                        var5_4 /* !! */  = (int)f.bisl("bisr", bisf(int ), (int)1);
                    }
                    case 2: {
                        var5_4 /* !! */  = (int)f.bisl("bist", bisf(int ), (int)2);
                    }
                    case 3: 
                }
                ** GOTO lbl32
            }
            while (true) {
                if (true) continue block8;
lbl32:
                // 2 sources

                var5_4 /* !! */  = (int)f.bisl("bisu", bisf(int ), (int)3);
                cfr_temp_0 = 1;
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean matches(String var1_1) {
        v0 /* !! */  = f.dj;
        if (true) ** GOTO lbl5
        block30: while (true) {
            v0 /* !! */  = (long)(v1 - f.bisl("bjcd", bitc(int ), (int)69));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1371292397: {
                    v1 = f.bisl("bjce", bitc(int ), (int)70);
                    continue block30;
                }
                case -894564454: {
                    break block30;
                }
                case -838687015: {
                    v1 = f.bisl("bjcf", bitc(int ), (int)71);
                    continue block30;
                }
                case 1304827623: {
                    v1 = f.bisl("bjcg", bitc(int ), (int)72);
                    continue block30;
                }
            }
            break;
        }
        var4_2 = f.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = f.dj - f.bisl("bjch", bitc(int ), (int)73)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == f.bisl("bjci", bisf(int ), (int)100)) break;
            v2 /* !! */  = (long)f.bisl("bjcj", bisf(int ), (int)101);
        }
        var3_3 /* !! */  = f.b;
        v3 /* !! */  = f.dj;
        if (true) ** GOTO lbl28
        block32: while (true) {
            v3 /* !! */  = (long)(v4 - f.bisl("bjck", bitc(int ), (int)74));
lbl28:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -894564454: {
                    break block32;
                }
                case -323585019: {
                    v4 = f.bisl("bjcl", bitc(int ), (int)75);
                    continue block32;
                }
                case 1996890148: {
                    v4 = f.bisl("bjcm", bitc(int ), (int)76);
                    continue block32;
                }
            }
            break;
        }
        var2_4 = f.a;
        if (var4_2) {
            throw null;
lbl40:
            // 5 sources

            return (boolean)f.bisl("bjcn", bisf(int ), (int)102);
        }
        if (var2_4 || var2_4) ** GOTO lbl40
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_1 = f.dj - f.bisl("bjco", bitc(int ), (int)77)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == f.bisl("bjcp", bisf(int ), (int)103)) break;
            v5 /* !! */  = (long)f.bisl("bjcq", bisf(int ), (int)104);
        }
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_2 = f.dj - f.bisl("bjcr", bitc(int ), (int)78)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v6 /* !! */  == f.bisl("bjcs", bisf(int ), (int)105)) break;
            v6 /* !! */  = (long)f.bisl("bjct", bisf(int ), (int)106);
        }
        if (this.name.equalsIgnoreCase(var1_1)) ** GOTO lbl-1000
        if (var2_4) ** GOTO lbl40
        v7 /* !! */  = f.dj;
        if (true) ** GOTO lbl59
        block36: while (true) {
            v7 /* !! */  = (long)(v8 - f.bisl("bjcu", bitc(int ), (int)79));
lbl59:
            // 2 sources

            switch ((int)v7 /* !! */ ) {
                case -1686413541: {
                    v8 = f.bisl("bjcv", bitc(int ), (int)80);
                    continue block36;
                }
                case -894564454: {
                    break block36;
                }
                case -579407364: {
                    v8 = f.bisl("bjcw", bitc(int ), (int)81);
                    continue block36;
                }
                case 1251019355: {
                    v8 = f.bisl("bjcx", bitc(int ), (int)82);
                    continue block36;
                }
            }
            break;
        }
        while (true) {
            if ((v9 /* !! */  = (cfr_temp_3 = f.dj - f.bisl("bjcy", bitc(int ), (int)83)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v9 /* !! */  == f.bisl("bjcz", bisf(int ), (int)107)) break;
            v9 /* !! */  = (long)f.bisl("bjda", bisf(int ), (int)108);
        }
        v10 = this.aliases.stream();
        while (true) {
            if ((v11 /* !! */  = (cfr_temp_4 = f.dj - f.bisl("bjdb", bitc(int ), (int)84)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v11 /* !! */  == f.bisl("bjdc", bisf(int ), (int)109)) break;
            v11 /* !! */  = (long)f.bisl("bjdd", bisf(int ), (int)110);
        }
        v12 = (Predicate<String>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$matches$0(java.lang.String java.lang.String ), (Ljava/lang/String;)Z)((String)var1_1);
        while (true) {
            if ((v13 /* !! */  = (cfr_temp_5 = f.dj - f.bisl("bjde", bitc(int ), (int)85)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v13 /* !! */  == f.bisl("bjdf", bisf(int ), (int)111)) break;
            v13 /* !! */  = (long)f.bisl("bjdg", bisf(int ), (int)112);
        }
        if (!v10.anyMatch(v12)) ** GOTO lbl98
        if (var2_4) ** GOTO lbl40
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 3 sources

            {
                if (var2_4 || var2_4) ** GOTO lbl40
                v14 = f.bisl("bjdh", bisf(int ), (int)113);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl101
            }
lbl98:
            // 1 sources

            if (!var2_4 && !var2_4) ** break;
            ** continue;
            v14 = f.bisl("bjdi", bisf(int ), (int)114);
lbl101:
            // 2 sources

            return (boolean)v14;
lbl102:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)f.bisl("bjdj", bisf(int ), (int)115);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl134
            }
lbl107:
            // 2 sources

            case 1: {
                var3_3 /* !! */  = (int)f.bisl("bjdk", bisf(int ), (int)116);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl125
            }
lbl112:
            // 2 sources

            case 2: {
                var3_3 /* !! */  = (int)f.bisl("bjdl", bisf(int ), (int)117);
                if (!var4_2) ** GOTO lbl107
                throw null;
            }
            case 3: {
                var3_3 /* !! */  = (int)f.bisl("bjdm", bisf(int ), (int)118);
                if (!var4_2) ** GOTO lbl102
                throw null;
            }
lbl120:
            // 3 sources

            case 4: {
                var3_3 /* !! */  = (int)f.bisl("bjdn", bisf(int ), (int)119);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl134
            }
lbl125:
            // 2 sources

            case 5: {
                var3_3 /* !! */  = (int)f.bisl("bjdo", bisf(int ), (int)120);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl134
            }
            case 6: {
                var3_3 /* !! */  = (int)f.bisl("bjdp", bisf(int ), (int)121);
                if (!var4_2) ** GOTO lbl120
                throw null;
            }
lbl134:
            // 4 sources

            case 7: {
                var3_3 /* !! */  = (int)f.bisl("bjdq", bisf(int ), (int)122);
                if (!var4_2) ** GOTO lbl120
                throw null;
            }
            case 8: {
                var3_3 /* !! */  = (int)f.bisl("bjdr", bisf(int ), (int)123);
                if (!var4_2) ** GOTO lbl112
                throw null;
            }
            case 9: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var3_3 /* !! */  = (int)f.bisl("bjds", bisf(int ), (int)124);
                    if (!var4_2) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 10: 
        }
        var3_3 /* !! */  = (int)f.bisl("bjdt", bisf(int ), (int)125);
        ** while (!var4_2)
lbl150:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public List<String> getAllNames() {
        v0 /* !! */  = f.dj;
        if (true) ** GOTO lbl5
        block35: while (true) {
            v0 /* !! */  = (long)(v1 - f.bisl("bjap", bitc(int ), (int)49));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -894564454: {
                    break block35;
                }
                case -444841325: {
                    v1 = f.bisl("bjaq", bitc(int ), (int)50);
                    continue block35;
                }
                case 1987796521: {
                    v1 = f.bisl("bjar", bitc(int ), (int)51);
                    continue block35;
                }
            }
            break;
        }
        var4_1 = f.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = f.dj - f.bisl("bjas", bitc(int ), (int)52)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == f.bisl("bjat", bisf(int ), (int)80)) break;
            v2 /* !! */  = (long)f.bisl("bjau", bisf(int ), (int)81);
        }
        var3_2 /* !! */  = f.b;
        v3 /* !! */  = f.dj;
        if (true) ** GOTO lbl25
        block37: while (true) {
            v3 /* !! */  = (long)(v4 - f.bisl("bjav", bitc(int ), (int)53));
lbl25:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1593582067: {
                    v4 = f.bisl("bjaw", bitc(int ), (int)54);
                    continue block37;
                }
                case -894564454: {
                    break block37;
                }
                case 957127648: {
                    v4 = f.bisl("bjax", bitc(int ), (int)55);
                    continue block37;
                }
                case 1514298785: {
                    v4 = f.bisl("bjay", bitc(int ), (int)56);
                    continue block37;
                }
            }
            break;
        }
        var2_3 = f.a;
        if (var4_1) {
            throw null;
lbl40:
            // 4 sources

            return null;
        }
        if (var2_3 || var2_3) ** GOTO lbl40
        v5 /* !! */  = f.dj;
        if (true) ** GOTO lbl47
        block39: while (true) {
            v5 /* !! */  = (long)(v6 - f.bisl("bjaz", bitc(int ), (int)57));
lbl47:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -1503233397: {
                    v6 = f.bisl("bjba", bitc(int ), (int)58);
                    continue block39;
                }
                case -894564454: {
                    break block39;
                }
                case 974598710: {
                    v6 = f.bisl("bjbb", bitc(int ), (int)59);
                    continue block39;
                }
                case 1162013357: {
                    v6 = f.bisl("bjbc", bitc(int ), (int)60);
                    continue block39;
                }
            }
            break;
        }
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_1 = f.dj - f.bisl("bjbd", bitc(int ), (int)61)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v7 /* !! */  == f.bisl("bjbe", bisf(int ), (int)82)) break;
            v7 /* !! */  = (long)f.bisl("bjbf", bisf(int ), (int)83);
        }
        var1_4 = new ArrayList<String>();
        if (var2_3 || var2_3) ** GOTO lbl40
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_2 = f.dj - f.bisl("bjbg", bitc(int ), (int)62)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == f.bisl("bjbh", bisf(int ), (int)84)) break;
                    v8 /* !! */  = (long)f.bisl("bjbi", bisf(int ), (int)85);
                }
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_3 = f.dj - f.bisl("bjbj", bitc(int ), (int)63)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == f.bisl("bjbk", bisf(int ), (int)86)) break;
                    v9 /* !! */  = (long)f.bisl("bjbl", bisf(int ), (int)87);
                }
                var1_4.add(this.name);
                if (var2_3 || var2_3) ** GOTO lbl40
                v10 /* !! */  = f.dj;
                if (true) ** GOTO lbl85
                block43: while (true) {
                    v10 /* !! */  = (long)(v11 - f.bisl("bjbm", bitc(int ), (int)64));
lbl85:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -894564454: {
                            break block43;
                        }
                        case -340281732: {
                            v11 = f.bisl("bjbn", bitc(int ), (int)65);
                            continue block43;
                        }
                        case 632044523: {
                            v11 = f.bisl("bjbo", bitc(int ), (int)66);
                            continue block43;
                        }
                        case 1729138654: {
                            v11 = f.bisl("bjbp", bitc(int ), (int)67);
                            continue block43;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_4 = f.dj - f.bisl("bjbq", bitc(int ), (int)68)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == f.bisl("bjbr", bisf(int ), (int)88)) break;
                    v12 /* !! */  = (long)f.bisl("bjbs", bisf(int ), (int)89);
                }
                var1_4.addAll(this.aliases);
                if (var2_3 || var2_3) ** continue;
                return var1_4;
            }
            case 0: {
                var3_2 /* !! */  = (int)f.bisl("bjbt", bisf(int ), (int)90);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl140
            }
lbl110:
            // 3 sources

            case 1: {
                var3_2 /* !! */  = (int)f.bisl("bjbu", bisf(int ), (int)91);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl123
            }
            case 2: {
                var3_2 /* !! */  = (int)f.bisl("bjbv", bisf(int ), (int)92);
                if (!var4_1) ** GOTO lbl110
                throw null;
            }
lbl119:
            // 2 sources

            case 3: {
                var3_2 /* !! */  = (int)f.bisl("bjbw", bisf(int ), (int)93);
                if (!var4_1) break;
                throw null;
            }
lbl123:
            // 2 sources

            case 4: {
                var3_2 /* !! */  = (int)f.bisl("bjbx", bisf(int ), (int)94);
                if (!var4_1) break;
                throw null;
            }
            case 5: {
                var3_2 /* !! */  = (int)f.bisl("bjby", bisf(int ), (int)95);
                if (!var4_1) break;
                throw null;
            }
            case 6: {
                var3_2 /* !! */  = (int)f.bisl("bjbz", bisf(int ), (int)96);
                if (!var4_1) ** GOTO lbl119
                throw null;
            }
            case 7: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_2 /* !! */  = (int)f.bisl("bjca", bisf(int ), (int)97);
                    if (!var4_1) ** GOTO lbl110
                    throw null;
                }
            }
lbl140:
            // 2 sources

            case 8: {
                var3_2 /* !! */  = (int)f.bisl("bjcb", bisf(int ), (int)98);
                if (!var4_1) break;
                throw null;
            }
            case 9: 
        }
        var3_2 /* !! */  = (int)f.bisl("bjcc", bisf(int ), (int)99);
        ** while (!var4_1)
lbl147:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    protected void logDirectRaw(class_5250 var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = f.dj - f.bisl("bjip", bitc(int ), (int)137)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == f.bisl("bjiq", bisf(int ), (int)200)) break;
            v0 /* !! */  = (long)f.bisl("bjir", bisf(int ), (int)201);
        }
        var4_2 = f.c;
        v1 /* !! */  = f.dj;
        if (true) ** GOTO lbl12
        block24: while (true) {
            v1 /* !! */  = (long)(f.bisl("bjit", bitc(int ), (int)139) - f.bisl("bjis", bitc(int ), (int)138));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1378731659: {
                    continue block24;
                }
                case -894564454: {
                    break block24;
                }
            }
            break;
        }
        var3_3 /* !! */  = f.b;
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        block4 : switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v2 /* !! */  = (cfr_temp_1 = f.dj - f.bisl("bjiu", bitc(int ), (int)140)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v2 /* !! */  == f.bisl("bjiv", bisf(int ), (int)202)) break;
                    v2 /* !! */  = (long)f.bisl("bjiw", bisf(int ), (int)203);
                }
                var2_4 = f.a;
                if (var4_2) {
                    throw null;
lbl30:
                    // 2 sources

                    return;
                }
                if (var2_4 || var2_4) ** GOTO lbl30
                v3 /* !! */  = f.dj;
                if (true) ** GOTO lbl37
                block27: while (true) {
                    v3 /* !! */  = (long)(v4 - f.bisl("bjix", bitc(int ), (int)141));
lbl37:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1375353903: {
                            v4 = f.bisl("bjiy", bitc(int ), (int)142);
                            continue block27;
                        }
                        case -1370191739: {
                            v4 = f.bisl("bjiz", bitc(int ), (int)143);
                            continue block27;
                        }
                        case -894564454: {
                            break block27;
                        }
                    }
                    break;
                }
                v5 = g.getInstance();
                v6 /* !! */  = f.dj;
                if (true) ** GOTO lbl51
                block28: while (true) {
                    v6 /* !! */  = (long)(v7 - f.bisl("bjja", bitc(int ), (int)144));
lbl51:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1572675630: {
                            v7 = f.bisl("bjjb", bitc(int ), (int)145);
                            continue block28;
                        }
                        case -894564454: {
                            break block28;
                        }
                        case -69907637: {
                            v7 = f.bisl("bjjc", bitc(int ), (int)146);
                            continue block28;
                        }
                        case 1503829547: {
                            v7 = f.bisl("bjjd", bitc(int ), (int)147);
                            continue block28;
                        }
                    }
                    break;
                }
                v5.sendRaw((class_2561)var1_1);
                if (var2_4 || var2_4) ** continue;
                return;
            }
            case 0: {
                var3_3 /* !! */  = (int)f.bisl("bjje", bisf(int ), (int)204);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl75
            }
            case 1: {
                var3_3 /* !! */  = (int)f.bisl("bjjf", bisf(int ), (int)205);
                if (!var4_2) break;
                throw null;
            }
lbl75:
            // 3 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)f.bisl("bjjg", bisf(int ), (int)206);
                    if (!var4_2) break block4;
                    throw null;
                }
            }
lbl80:
            // 2 sources

            case 3: {
                var3_3 /* !! */  = (int)f.bisl("bjjh", bisf(int ), (int)207);
                if (!var4_2) ** GOTO lbl75
                throw null;
            }
            case 4: {
                var3_3 /* !! */  = (int)f.bisl("bjji", bisf(int ), (int)208);
                if (!var4_2) ** GOTO lbl80
                throw null;
            }
            case 5: 
        }
        var3_3 /* !! */  = (int)f.bisl("bjjj", bisf(int ), (int)209);
        ** while (!var4_2)
lbl91:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void bjki() {
        f.bitd[0] = 4258826184889658035L;
        f.bitd[1] = 8583823688359338666L;
        f.bitd[2] = -3295874108447165278L;
        f.bitd[3] = 8386383646534541770L;
        f.bitd[4] = 435795630445997120L;
        f.bitd[5] = -7065779044921621107L;
        f.bitd[6] = -52166308998939225L;
        f.bitd[7] = 7976863394028333048L;
        f.bitd[8] = 634658879675378316L;
        f.bitd[9] = 8149014133099669957L;
        f.bitd[10] = -6823886831421751845L;
        f.bitd[11] = 2856826185605783162L;
        f.bitd[12] = -2885678265501951191L;
        f.bitd[13] = -5908388994641057793L;
        f.bitd[14] = -6930396797711834176L;
        f.bitd[15] = -2036711318879753313L;
        f.bitd[16] = 7870184991049853561L;
        f.bitd[17] = 6420272150121347965L;
        f.bitd[18] = 6287832757306061304L;
        f.bitd[19] = -6505182949175691618L;
        f.bitd[20] = -1408026151313403351L;
        f.bitd[21] = -8412459442360006222L;
        f.bitd[22] = 6195742378758849463L;
        f.bitd[23] = -4742688290305017715L;
        f.bitd[24] = -5877723276568946582L;
        f.bitd[25] = -4570140155176803830L;
        f.bitd[26] = 2664908239039686420L;
        f.bitd[27] = -9172425245550121267L;
        f.bitd[28] = -7983473863675908213L;
        f.bitd[29] = 6783079632135250634L;
        f.bitd[30] = 5137286243717626238L;
        f.bitd[31] = -5507349904596742066L;
        f.bitd[32] = 2489779081916745769L;
        f.bitd[33] = -995139745751133006L;
        f.bitd[34] = 4770922493172134459L;
        f.bitd[35] = -4807993622299301230L;
        f.bitd[36] = -1423794750981285063L;
        f.bitd[37] = 4950464382595365504L;
        f.bitd[38] = 6758186399628090221L;
        f.bitd[39] = -3356945038848038620L;
        f.bitd[40] = 1511225958220711121L;
        f.bitd[41] = -6280249507693937826L;
        f.bitd[42] = 8114768974735087083L;
        f.bitd[43] = -3866073112685662413L;
        f.bitd[44] = -63689383979255579L;
        f.bitd[45] = 3761913294043817823L;
        f.bitd[46] = 222947115707977749L;
        f.bitd[47] = 252948530191520699L;
        f.bitd[48] = -1196309798576809470L;
        f.bitd[49] = -8513077832467297209L;
        f.bitd[50] = -3354127714889395845L;
        f.bitd[51] = 86554309031824757L;
        f.bitd[52] = 6017827039242117102L;
        f.bitd[53] = 3312804809474820507L;
        f.bitd[54] = -7197652026663850596L;
        f.bitd[55] = 7280633851651513128L;
        f.bitd[56] = 5698447183107889264L;
        f.bitd[57] = 2259240289016328141L;
        f.bitd[58] = -4672572964180452440L;
        f.bitd[59] = -879098477383706564L;
        f.bitd[60] = -3288001401804504582L;
        f.bitd[61] = 1150726154406347135L;
        f.bitd[62] = -3690485827709312278L;
        f.bitd[63] = -939603444172323729L;
        f.bitd[64] = -3529473967425459154L;
        f.bitd[65] = -3270671861874022410L;
        f.bitd[66] = -4002913960175141501L;
        f.bitd[67] = -4086681977583868460L;
        f.bitd[68] = -7027697355204444593L;
        f.bitd[69] = 6252042633424245289L;
        f.bitd[70] = 1063670109300318201L;
        f.bitd[71] = -2492251851854585798L;
        f.bitd[72] = 3760003517271988516L;
        f.bitd[73] = 489456702215185639L;
        f.bitd[74] = 8339422702707862240L;
        f.bitd[75] = 7056066470357309403L;
        f.bitd[76] = 8191078421496891636L;
        f.bitd[77] = 324261968074342448L;
        f.bitd[78] = -5713073287235889522L;
        f.bitd[79] = 4967910060288395840L;
        f.bitd[80] = -8208127319955285550L;
        f.bitd[81] = 222734776080386901L;
        f.bitd[82] = 2410722701249442589L;
        f.bitd[83] = -282320865885685879L;
        f.bitd[84] = -2374722972695684370L;
        f.bitd[85] = 8561962136604514931L;
        f.bitd[86] = 4761635756707050824L;
        f.bitd[87] = 8982072710061552026L;
        f.bitd[88] = -6214771187226544096L;
        f.bitd[89] = 2565521781980062195L;
        f.bitd[90] = -1678621089480943841L;
        f.bitd[91] = 3270067605267435028L;
        f.bitd[92] = -7016071949038555565L;
        f.bitd[93] = 6259037560285829123L;
        f.bitd[94] = -7624008816558038192L;
        f.bitd[95] = 3788741146075976397L;
        f.bitd[96] = -742372187276656247L;
        f.bitd[97] = 7208815144909281249L;
        f.bitd[98] = -7498368725063400057L;
        f.bitd[99] = -3599051212265801862L;
    }

    private static /* synthetic */ void bjke() {
        f.bisg[200] = 1886371748;
        f.bisg[201] = -697586384;
        f.bisg[202] = 1336785195;
        f.bisg[203] = 38600182;
        f.bisg[204] = -1128832134;
        f.bisg[205] = 1261610096;
        f.bisg[206] = -62185723;
        f.bisg[207] = 595602547;
        f.bisg[208] = -294369020;
        f.bisg[209] = 2085197019;
        f.bisg[210] = -573981647;
        f.bisg[211] = -234252561;
        f.bisg[212] = -1132539019;
        f.bisg[213] = 1737269695;
        f.bisg[214] = -194293876;
        f.bisg[215] = 931834408;
        f.bisg[216] = -1833838661;
        f.bisg[217] = 2126001507;
        f.bisg[218] = -940400094;
    }

    private static /* synthetic */ int bisf(int n2) {
        return bisg[n2] ^ bisj[n2];
    }

    private static /* synthetic */ void bjkj() {
        f.bitd[100] = 980859737994143345L;
        f.bitd[101] = -9102471784078171613L;
        f.bitd[102] = 5656652071897601347L;
        f.bitd[103] = -6846624017869195640L;
        f.bitd[104] = 6210843822040004453L;
        f.bitd[105] = 5184868939525037668L;
        f.bitd[106] = 7276255437485720184L;
        f.bitd[107] = 5118394805970919840L;
        f.bitd[108] = -7358397737330620853L;
        f.bitd[109] = 9045882942676733777L;
        f.bitd[110] = 8396860483746247794L;
        f.bitd[111] = 1545943659383049421L;
        f.bitd[112] = -5037060195034196499L;
        f.bitd[113] = -7618040290239972722L;
        f.bitd[114] = -4348160213970499907L;
        f.bitd[115] = -3630137801355669440L;
        f.bitd[116] = 2851343309508484283L;
        f.bitd[117] = -219588686164228755L;
        f.bitd[118] = 6719816662758765191L;
        f.bitd[119] = -4566197076100818147L;
        f.bitd[120] = 6078754113555008612L;
        f.bitd[121] = 7987356299406112381L;
        f.bitd[122] = 666885445687908522L;
        f.bitd[123] = 1147249027837570407L;
        f.bitd[124] = -6340257783707868893L;
        f.bitd[125] = 3632400291739014619L;
        f.bitd[126] = 3797622388967849762L;
        f.bitd[127] = 8236600505326473233L;
        f.bitd[128] = -5044122861970990188L;
        f.bitd[129] = -2025664083529673566L;
        f.bitd[130] = 6371481801797448841L;
        f.bitd[131] = -755517066908243320L;
        f.bitd[132] = 5752911709783630921L;
        f.bitd[133] = 4171779906928721746L;
        f.bitd[134] = 5338250868965404433L;
        f.bitd[135] = 4863725310831876772L;
        f.bitd[136] = -518741704150138688L;
        f.bitd[137] = 6373558455194830740L;
        f.bitd[138] = 8861972035214731577L;
        f.bitd[139] = -364535653993344291L;
        f.bitd[140] = 9199496765662045886L;
        f.bitd[141] = 7491282079677242965L;
        f.bitd[142] = 9069345381290240212L;
        f.bitd[143] = -8233238015200329142L;
        f.bitd[144] = -6559336187230216616L;
        f.bitd[145] = -9093092838792992874L;
        f.bitd[146] = 6835633941195185773L;
        f.bitd[147] = -7211541764459195518L;
        f.bitd[148] = 1454992572763701644L;
        f.bitd[149] = 7834259406867937109L;
        f.bitd[150] = -1091832487576166619L;
        f.bitd[151] = -8388523115782088930L;
        f.bitd[152] = 2648116264087401722L;
        f.bitd[153] = -6726573176898445118L;
        f.bitd[154] = 3722240114333938206L;
        f.bitd[155] = 2488191992164832187L;
        f.bitd[156] = -6660791876757420461L;
    }

    static {
        bisg = new int[219];
        bisj = new int[219];
        f.bjkc();
        f.bjkd();
        f.bjke();
        f.bjkf();
        f.bjkg();
        f.bjkh();
        bitd = new long[157];
        bitg = new long[157];
        f.bjki();
        f.bjkj();
        f.bjkk();
        f.bjkl();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    protected void logDirect(class_2561 var1_1) {
        v0 /* !! */  = f.dj;
        if (true) ** GOTO lbl5
        block18: while (true) {
            v0 /* !! */  = (long)(v1 - f.bisl("bjgj", bitc(int ), (int)111));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1560234355: {
                    v1 = f.bisl("bjgk", bitc(int ), (int)112);
                    continue block18;
                }
                case -1442133421: {
                    v1 = f.bisl("bjgl", bitc(int ), (int)113);
                    continue block18;
                }
                case -894564454: {
                    break block18;
                }
                case 78670780: {
                    v1 = f.bisl("bjgm", bitc(int ), (int)114);
                    continue block18;
                }
            }
            break;
        }
        var4_2 = f.c;
        v2 /* !! */  = f.dj;
        if (true) ** GOTO lbl22
        block19: while (true) {
            v2 /* !! */  = (long)(f.bisl("bjgo", bitc(int ), (int)116) - f.bisl("bjgn", bitc(int ), (int)115));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -894564454: {
                    break block19;
                }
                case 2017181256: {
                    continue block19;
                }
            }
            break;
        }
        var3_3 /* !! */  = f.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_0 = f.dj - f.bisl("bjgp", bitc(int ), (int)117)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == f.bisl("bjgq", bisf(int ), (int)168)) break;
            v3 /* !! */  = (long)f.bisl("bjgr", bisf(int ), (int)169);
        }
        var2_4 = f.a;
        if (var4_2) {
            throw null;
lbl36:
            // 3 sources

            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl36
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_1 = f.dj - f.bisl("bjgs", bitc(int ), (int)118)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == f.bisl("bjgt", bisf(int ), (int)170)) break;
            v4 /* !! */  = (long)f.bisl("bjgu", bisf(int ), (int)171);
        }
        pp.brandmessage(var1_1);
        if (var2_4) ** GOTO lbl36
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var2_4) ** break;
                ** continue;
                return;
            }
            case 0: {
                var3_3 /* !! */  = (int)f.bisl("bjgv", bisf(int ), (int)172);
                if (!var4_2) break;
                throw null;
            }
lbl56:
            // 2 sources

            case 1: {
                var3_3 /* !! */  = (int)f.bisl("bjgw", bisf(int ), (int)173);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl70
            }
            case 2: {
                var3_3 /* !! */  = (int)f.bisl("bjgx", bisf(int ), (int)174);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl70
            }
            case 3: {
                var3_3 /* !! */  = (int)f.bisl("bjgy", bisf(int ), (int)175);
                if (!var4_2) break;
                throw null;
            }
lbl70:
            // 3 sources

            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)f.bisl("bjgz", bisf(int ), (int)176);
                    if (!var4_2) ** GOTO lbl56
                    throw null;
                }
            }
            case 5: 
        }
        var3_3 /* !! */  = (int)f.bisl("bjha", bisf(int ), (int)177);
        ** while (!var4_2)
lbl78:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ boolean lambda$matches$0(String var0, String var1_1) {
        v0 /* !! */  = f.dj;
        if (true) ** GOTO lbl5
        block11: while (true) {
            v0 /* !! */  = (long)(v1 - f.bisl("bjjk", bitc(int ), (int)148));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1357420307: {
                    v1 = f.bisl("bjjl", bitc(int ), (int)149);
                    continue block11;
                }
                case -894564454: {
                    break block11;
                }
                case 365931954: {
                    v1 = f.bisl("bjjm", bitc(int ), (int)150);
                    continue block11;
                }
            }
            break;
        }
        var4_2 = f.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = f.dj - f.bisl("bjjn", bitc(int ), (int)151)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == f.bisl("bjjo", bisf(int ), (int)210)) break;
            v2 /* !! */  = (long)f.bisl("bjjp", bisf(int ), (int)211);
        }
        var3_3 = f.b;
        v3 /* !! */  = f.dj;
        if (true) ** GOTO lbl26
        block13: while (true) {
            v3 /* !! */  = (long)(v4 - f.bisl("bjjq", bitc(int ), (int)152));
lbl26:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -894564454: {
                    break block13;
                }
                case 348524374: {
                    v4 = f.bisl("bjjr", bitc(int ), (int)153);
                    continue block13;
                }
                case 1166291736: {
                    v4 = f.bisl("bjjs", bitc(int ), (int)154);
                    continue block13;
                }
                case 1184304925: {
                    v4 = f.bisl("bjjt", bitc(int ), (int)155);
                    continue block13;
                }
            }
            break;
        }
        var2_4 = f.a;
        if (var4_2) {
            throw null;
lbl41:
            // 1 sources

            return (boolean)f.bisl("bjju", bisf(int ), (int)212);
        }
        ** while (var2_4 || var2_4)
lbl44:
        // 1 sources

        while (true) {
            if ((v5 /* !! */  = (cfr_temp_1 = f.dj - f.bisl("bjjv", bitc(int ), (int)156)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v5 /* !! */  == f.bisl("bjjw", bisf(int ), (int)213)) break;
            v5 /* !! */  = (long)f.bisl("bjjx", bisf(int ), (int)214);
        }
        return var1_1.equalsIgnoreCase(var0);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public List<String> getAliases() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = f.dj - f.bisl("bizy", bitc(int ), (int)40)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == f.bisl("bizz", bisf(int ), (int)72)) break;
            v0 /* !! */  = (long)f.bisl("bjaa", bisf(int ), (int)73);
        }
        var3_1 = f.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = f.dj - f.bisl("bjab", bitc(int ), (int)41)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == f.bisl("bjac", bisf(int ), (int)74)) break;
            v1 /* !! */  = (long)f.bisl("bjad", bisf(int ), (int)75);
        }
        var2_2 /* !! */  = f.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v2 /* !! */  = f.dj;
                if (true) ** GOTO lbl22
                block19: while (true) {
                    v2 /* !! */  = (long)(v3 - f.bisl("bjae", bitc(int ), (int)42));
lbl22:
                    // 2 sources

                    switch ((int)v2 /* !! */ ) {
                        case -1126428980: {
                            v3 = f.bisl("bjaf", bitc(int ), (int)43);
                            continue block19;
                        }
                        case -941456683: {
                            v3 = f.bisl("bjag", bitc(int ), (int)44);
                            continue block19;
                        }
                        case -894564454: {
                            break block19;
                        }
                        case 1724491521: {
                            v3 = f.bisl("bjah", bitc(int ), (int)45);
                            continue block19;
                        }
                    }
                    break;
                }
                var1_3 = f.a;
                if (var3_1) {
                    throw null;
                    return null;
                }
                if (var1_3 || var1_3) ** continue;
                v4 /* !! */  = f.dj;
                if (true) ** GOTO lbl44
                block21: while (true) {
                    v4 /* !! */  = (long)(v5 - f.bisl("bjai", bitc(int ), (int)46));
lbl44:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -894564454: {
                            break block21;
                        }
                        case -128518384: {
                            v5 = f.bisl("bjaj", bitc(int ), (int)47);
                            continue block21;
                        }
                        case 2104492348: {
                            v5 = f.bisl("bjak", bitc(int ), (int)48);
                            continue block21;
                        }
                    }
                    break;
                }
                return this.aliases;
            }
lbl54:
            // 3 sources

            case 0: {
                var2_2 /* !! */  = (int)f.bisl("bjal", bisf(int ), (int)76);
                if (var3_1) {
                    throw null;
                }
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)f.bisl("bjam", bisf(int ), (int)77);
                    if (!var3_1) ** GOTO lbl54
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)f.bisl("bjan", bisf(int ), (int)78);
                if (!var3_1) ** GOTO lbl54
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)f.bisl("bjao", bisf(int ), (int)79);
        ** while (!var3_1)
lbl70:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void bjkl() {
        f.bitg[100] = -3110213805208695414L;
        f.bitg[101] = -3475478320282783738L;
        f.bitg[102] = 2655302511098418791L;
        f.bitg[103] = 3961213194714251266L;
        f.bitg[104] = -8807839975651202034L;
        f.bitg[105] = -6449054844284424441L;
        f.bitg[106] = -8694524236575541285L;
        f.bitg[107] = -4541737163634991868L;
        f.bitg[108] = -443574991206906053L;
        f.bitg[109] = -6284771894953846185L;
        f.bitg[110] = -395879640867531257L;
        f.bitg[111] = -6732715760897364808L;
        f.bitg[112] = -9003609408313304796L;
        f.bitg[113] = -1580939603774609114L;
        f.bitg[114] = -7556457997882621389L;
        f.bitg[115] = 4117288254134075758L;
        f.bitg[116] = 2314063679865056182L;
        f.bitg[117] = -5450176757427934338L;
        f.bitg[118] = 9106532447436328506L;
        f.bitg[119] = -1153171077211204480L;
        f.bitg[120] = 5050175815576508101L;
        f.bitg[121] = 8190348895844733167L;
        f.bitg[122] = 7214717568309914363L;
        f.bitg[123] = 4341507621631027958L;
        f.bitg[124] = 5985995159968883628L;
        f.bitg[125] = 9143828532913808495L;
        f.bitg[126] = -4533969018781918111L;
        f.bitg[127] = 3800917183542633629L;
        f.bitg[128] = -1929041734666372174L;
        f.bitg[129] = 4305629948030787968L;
        f.bitg[130] = -6815141787139674474L;
        f.bitg[131] = -7586085607756616680L;
        f.bitg[132] = 2750198163780180251L;
        f.bitg[133] = 3277079276189817775L;
        f.bitg[134] = -4320102060878060753L;
        f.bitg[135] = 3008329855556085946L;
        f.bitg[136] = 1907603254817650021L;
        f.bitg[137] = 3798779844830859666L;
        f.bitg[138] = 4355944695479539205L;
        f.bitg[139] = 3213881668082989113L;
        f.bitg[140] = 4806711167267196508L;
        f.bitg[141] = -2851450484640483753L;
        f.bitg[142] = 7154360504910348882L;
        f.bitg[143] = -2173508391431455105L;
        f.bitg[144] = 5158819177859038787L;
        f.bitg[145] = -31287150823085974L;
        f.bitg[146] = -5578346194484181728L;
        f.bitg[147] = -5565178002347400388L;
        f.bitg[148] = 3171170065368545498L;
        f.bitg[149] = 8400138345633707166L;
        f.bitg[150] = 6922096131674237413L;
        f.bitg[151] = 404305190157338784L;
        f.bitg[152] = -3977699236686895236L;
        f.bitg[153] = 6057801620858360832L;
        f.bitg[154] = -4902744510710893843L;
        f.bitg[155] = 3084172828180433373L;
        f.bitg[156] = 4410857406571788722L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public List<String> getLongDesc() {
        v0 /* !! */  = f.dj;
        if (true) ** GOTO lbl5
        block17: while (true) {
            v0 /* !! */  = (long)(v1 - f.bisl("bivu", bitc(int ), (int)9));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1150286465: {
                    v1 = f.bisl("bivv", bitc(int ), (int)10);
                    continue block17;
                }
                case -894564454: {
                    break block17;
                }
                case -310349119: {
                    v1 = f.bisl("bivw", bitc(int ), (int)11);
                    continue block17;
                }
            }
            break;
        }
        var3_1 = f.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = f.dj - f.bisl("bivx", bitc(int ), (int)12)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == f.bisl("bivy", bisf(int ), (int)28)) break;
            v2 /* !! */  = (long)f.bisl("biwa", bisf(int ), (int)29);
        }
        var2_2 /* !! */  = f.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = f.dj - f.bisl("biwg", bitc(int ), (int)13)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == f.bisl("biwh", bisf(int ), (int)30)) break;
            v3 /* !! */  = (long)f.bisl("biwi", bisf(int ), (int)31);
        }
        var1_3 = f.a;
        if (var3_1) {
            throw null;
lbl31:
            // 2 sources

            return null;
        }
        if (var1_3) ** GOTO lbl31
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                v4 = new String[4];
                v5 = f.bisl("biwj", bisf(int ), (int)32);
                while (true) {
                    if ((v6 = (cfr_temp_2 = f.dj - f.bisl("biwl", bitc(int ), (int)14)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v6 == f.bisl("biwn", bisf(int ), (int)33)) break;
                    v6 = -1871541897;
                }
                v4[v5] = this.description;
                v4[1] = "";
                v4[2] = "\u0418\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u043d\u0438\u0435:";
                v7 = f.bisl("biwq", bisf(int ), (int)34);
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_3 = f.dj - f.bisl("biwu", bitc(int ), (int)15)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v8 /* !! */  == f.bisl("biwv", bisf(int ), (int)35)) break;
                    v8 /* !! */  = (long)f.bisl("biww", bisf(int ), (int)36);
                }
                v9 /* !! */  = f.dj;
                if (true) ** GOTO lbl60
                block23: while (true) {
                    v9 /* !! */  = (long)(v10 - f.bisl("biwx", bitc(int ), (int)16));
lbl60:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -894564454: {
                            break block23;
                        }
                        case 402278679: {
                            v10 = f.bisl("biwz", bitc(int ), (int)17);
                            continue block23;
                        }
                        case 896533929: {
                            v10 = f.bisl("bixb", bitc(int ), (int)18);
                            continue block23;
                        }
                        case 1947907652: {
                            v10 = f.bisl("bixg", bitc(int ), (int)19);
                            continue block23;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v11 = (cfr_temp_4 = f.dj - f.bisl("bixi", bitc(int ), (int)20)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v11 == f.bisl("bixk", bisf(int ), (int)37)) break;
                    v11 = -2076734808;
                }
                v4[v7] = "> " + this.name + " - " + this.description;
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_5 = f.dj - f.bisl("bixm", bitc(int ), (int)21)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v12 /* !! */  == f.bisl("bixn", bisf(int ), (int)38)) break;
                    v12 /* !! */  = (long)f.bisl("bixp", bisf(int ), (int)39);
                }
                return Arrays.asList(v4);
            }
lbl86:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)f.bisl("bixr", bisf(int ), (int)40);
                if (var3_1) {
                    throw null;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)f.bisl("bixu", bisf(int ), (int)41);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)f.bisl("bixv", bisf(int ), (int)42);
                    if (!var3_1) ** GOTO lbl86
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)f.bisl("bixw", bisf(int ), (int)43);
        ** while (!var3_1)
lbl102:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean hiddenFromHelp() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = f.dj - f.bisl("biya", bitc(int ), (int)22)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == f.bisl("biyb", bisf(int ), (int)44)) break;
            v0 /* !! */  = (long)f.bisl("biyc", bisf(int ), (int)45);
        }
        var3_1 = f.c;
        v1 /* !! */  = f.dj;
        if (true) ** GOTO lbl12
        block7: while (true) {
            v1 /* !! */  = (long)(v2 - f.bisl("biyd", bitc(int ), (int)23));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1247896097: {
                    v2 = f.bisl("biyf", bitc(int ), (int)24);
                    continue block7;
                }
                case -894564454: {
                    break block7;
                }
                case 1069876778: {
                    v2 = f.bisl("biyg", bitc(int ), (int)25);
                    continue block7;
                }
                case 1733788277: {
                    v2 = f.bisl("biyh", bitc(int ), (int)26);
                    continue block7;
                }
            }
            break;
        }
        var2_2 = f.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = f.dj - f.bisl("biyi", bitc(int ), (int)27)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == f.bisl("biyj", bisf(int ), (int)46)) break;
            v3 /* !! */  = (long)f.bisl("biyl", bisf(int ), (int)47);
        }
        var1_3 = f.a;
        if (var3_1) {
            throw null;
lbl34:
            // 1 sources

            return (boolean)f.bisl("biym", bisf(int ), (int)48);
        }
        ** while (var1_3 || var1_3)
lbl37:
        // 1 sources

        return (boolean)f.bisl("biyn", bisf(int ), (int)49);
    }

    public static /* synthetic */ CallSite bisl(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void bjkg() {
        f.bisj[100] = -1001795103;
        f.bisj[101] = -1092310932;
        f.bisj[102] = 252347878;
        f.bisj[103] = 974528184;
        f.bisj[104] = 718733725;
        f.bisj[105] = -261431663;
        f.bisj[106] = -772790504;
        f.bisj[107] = -1480294164;
        f.bisj[108] = -1954693783;
        f.bisj[109] = 1481015020;
        f.bisj[110] = 1662416380;
        f.bisj[111] = -388266384;
        f.bisj[112] = 729151025;
        f.bisj[113] = 1117383403;
        f.bisj[114] = 456158784;
        f.bisj[115] = -2138875448;
        f.bisj[116] = 1494009675;
        f.bisj[117] = 768628349;
        f.bisj[118] = 311592043;
        f.bisj[119] = -1061332603;
        f.bisj[120] = 193629547;
        f.bisj[121] = 1123155852;
        f.bisj[122] = -218460208;
        f.bisj[123] = -1710800836;
        f.bisj[124] = 1966477826;
        f.bisj[125] = 544455875;
        f.bisj[126] = 462881152;
        f.bisj[127] = 2078210225;
        f.bisj[128] = 1729187921;
        f.bisj[129] = -1935743573;
        f.bisj[130] = -1667400951;
        f.bisj[131] = 823299055;
        f.bisj[132] = 130553309;
        f.bisj[133] = 1110382092;
        f.bisj[134] = -1065923030;
        f.bisj[135] = 898930917;
        f.bisj[136] = 785801045;
        f.bisj[137] = -120586367;
        f.bisj[138] = 608661797;
        f.bisj[139] = 583825935;
        f.bisj[140] = 519405065;
        f.bisj[141] = -1538529909;
        f.bisj[142] = 1102165325;
        f.bisj[143] = 1919087520;
        f.bisj[144] = -1054140663;
        f.bisj[145] = -2136263747;
        f.bisj[146] = -2130093246;
        f.bisj[147] = 53912723;
        f.bisj[148] = 945774697;
        f.bisj[149] = 201157598;
        f.bisj[150] = -1690011856;
        f.bisj[151] = 514345539;
        f.bisj[152] = 1216172354;
        f.bisj[153] = -806221750;
        f.bisj[154] = -373815412;
        f.bisj[155] = 816743551;
        f.bisj[156] = -1329741428;
        f.bisj[157] = -558139099;
        f.bisj[158] = -939409918;
        f.bisj[159] = 190861951;
        f.bisj[160] = 1718551275;
        f.bisj[161] = 1607993366;
        f.bisj[162] = -447674509;
        f.bisj[163] = -694949858;
        f.bisj[164] = 116464638;
        f.bisj[165] = 774831204;
        f.bisj[166] = -1348319361;
        f.bisj[167] = 858767983;
        f.bisj[168] = -485867001;
        f.bisj[169] = -1257025518;
        f.bisj[170] = -1460708693;
        f.bisj[171] = 2017151067;
        f.bisj[172] = 679004834;
        f.bisj[173] = -497519488;
        f.bisj[174] = -795706917;
        f.bisj[175] = 668721399;
        f.bisj[176] = 173869211;
        f.bisj[177] = 1533340774;
        f.bisj[178] = -1159702267;
        f.bisj[179] = 976909035;
        f.bisj[180] = 539697916;
        f.bisj[181] = -1282014392;
        f.bisj[182] = -1385909582;
        f.bisj[183] = 310834195;
        f.bisj[184] = 787958166;
        f.bisj[185] = -1064037115;
        f.bisj[186] = -202796472;
        f.bisj[187] = 537681249;
        f.bisj[188] = 261205039;
        f.bisj[189] = 708096004;
        f.bisj[190] = 833176470;
        f.bisj[191] = 342882676;
        f.bisj[192] = 21570723;
        f.bisj[193] = -1637913384;
        f.bisj[194] = -1011624443;
        f.bisj[195] = -494583261;
        f.bisj[196] = -1813087366;
        f.bisj[197] = 1490573830;
        f.bisj[198] = 510828224;
        f.bisj[199] = 1740238081;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    protected void logDirect(String var1_1, class_124 var2_2) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = f.dj - f.bisl("bjem", bitc(int ), (int)90)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == f.bisl("bjen", bisf(int ), (int)140)) break;
            v0 /* !! */  = (long)f.bisl("bjeo", bisf(int ), (int)141);
        }
        var6_3 = f.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = f.dj - f.bisl("bjep", bitc(int ), (int)91)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == f.bisl("bjeq", bisf(int ), (int)142)) break;
            v1 /* !! */  = (long)f.bisl("bjer", bisf(int ), (int)143);
        }
        var5_4 /* !! */  = f.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = f.dj - f.bisl("bjes", bitc(int ), (int)92)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == f.bisl("bjet", bisf(int ), (int)144)) break;
            v2 /* !! */  = (long)f.bisl("bjeu", bisf(int ), (int)145);
        }
        var4_5 = f.a;
        if (var6_3) {
            throw null;
lbl24:
            // 10 sources

            return;
        }
        if (var4_5 || var4_5) ** GOTO lbl24
        v3 /* !! */  = f.dj;
        if (true) ** GOTO lbl31
        block53: while (true) {
            v3 /* !! */  = (long)(v4 - f.bisl("bjev", bitc(int ), (int)93));
lbl31:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1152071768: {
                    v4 = f.bisl("bjew", bitc(int ), (int)94);
                    continue block53;
                }
                case -894564454: {
                    break block53;
                }
                case -480535332: {
                    v4 = f.bisl("bjex", bitc(int ), (int)95);
                    continue block53;
                }
                case 1960422246: {
                    v4 = f.bisl("bjey", bitc(int ), (int)96);
                    continue block53;
                }
            }
            break;
        }
        var3_6 = g.getInstance();
        if (var5_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_5 || var4_5) ** GOTO lbl24
                v5 /* !! */  = f.dj;
                if (true) ** GOTO lbl52
                block54: while (true) {
                    v5 /* !! */  = (long)(v6 - f.bisl("bjez", bitc(int ), (int)97));
lbl52:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1227213776: {
                            v6 = f.bisl("bjfa", bitc(int ), (int)98);
                            continue block54;
                        }
                        case -1204046071: {
                            v6 = f.bisl("bjfb", bitc(int ), (int)99);
                            continue block54;
                        }
                        case -894564454: {
                            break block54;
                        }
                        case 1384345014: {
                            v6 = f.bisl("bjfc", bitc(int ), (int)100);
                            continue block54;
                        }
                    }
                    break;
                }
                if (var2_2 != class_124.field_1061) ** GOTO lbl80
                if (var4_5 || var4_5) ** GOTO lbl24
                v7 /* !! */  = f.dj;
                if (true) ** GOTO lbl70
                block55: while (true) {
                    v7 /* !! */  = (long)(f.bisl("bjfe", bitc(int ), (int)102) - f.bisl("bjfd", bitc(int ), (int)101));
lbl70:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -1312163939: {
                            continue block55;
                        }
                        case -894564454: {
                            break block55;
                        }
                    }
                    break;
                }
                var3_6.sendError(var1_1);
                if (var4_5) ** GOTO lbl24
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl126
lbl80:
                // 1 sources

                if (var4_5 || var4_5) ** GOTO lbl24
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_3 = f.dj - f.bisl("bjff", bitc(int ), (int)103)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v8 /* !! */  == f.bisl("bjfg", bisf(int ), (int)146)) break;
                    v8 /* !! */  = (long)f.bisl("bjfh", bisf(int ), (int)147);
                }
                if (var2_2 != class_124.field_1060) ** GOTO lbl107
                if (var4_5 || var4_5) ** GOTO lbl24
                v9 /* !! */  = f.dj;
                if (true) ** GOTO lbl93
                block57: while (true) {
                    v9 /* !! */  = (long)(v10 - f.bisl("bjfi", bitc(int ), (int)104));
lbl93:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -2137515962: {
                            v10 = f.bisl("bjfj", bitc(int ), (int)105);
                            continue block57;
                        }
                        case -894564454: {
                            break block57;
                        }
                        case 1481353253: {
                            v10 = f.bisl("bjfk", bitc(int ), (int)106);
                            continue block57;
                        }
                    }
                    break;
                }
                var3_6.sendSuccess(var1_1);
                if (var4_5) ** GOTO lbl24
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl126
lbl107:
                // 1 sources

                if (var4_5 || var4_5) ** GOTO lbl24
                v11 /* !! */  = f.dj;
                if (true) ** GOTO lbl112
                block58: while (true) {
                    v11 /* !! */  = (long)(v12 - f.bisl("bjfl", bitc(int ), (int)107));
lbl112:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -1714150914: {
                            v12 = f.bisl("bjfm", bitc(int ), (int)108);
                            continue block58;
                        }
                        case -894564454: {
                            break block58;
                        }
                        case 1220990753: {
                            v12 = f.bisl("bjfn", bitc(int ), (int)109);
                            continue block58;
                        }
                        case 1880114701: {
                            v12 = f.bisl("bjfo", bitc(int ), (int)110);
                            continue block58;
                        }
                    }
                    break;
                }
                var3_6.sendMessage(var1_1);
                if (var4_5) ** GOTO lbl24
lbl126:
                // 3 sources

                if (!var4_5 && !var4_5) ** break;
                ** continue;
                return;
            }
lbl129:
            // 2 sources

            case 0: {
                var5_4 /* !! */  = (int)f.bisl("bjfp", bisf(int ), (int)148);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl191
            }
lbl134:
            // 3 sources

            case 1: {
                var5_4 /* !! */  = (int)f.bisl("bjfq", bisf(int ), (int)149);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl167
            }
lbl139:
            // 3 sources

            case 2: {
                var5_4 /* !! */  = (int)f.bisl("bjfr", bisf(int ), (int)150);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl199
            }
            case 3: {
                var5_4 /* !! */  = (int)f.bisl("bjfs", bisf(int ), (int)151);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl195
            }
            case 4: {
                var5_4 /* !! */  = (int)f.bisl("bjft", bisf(int ), (int)152);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl163
            }
            case 5: {
                var5_4 /* !! */  = (int)f.bisl("bjfu", bisf(int ), (int)153);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl176
            }
            case 6: {
                var5_4 /* !! */  = (int)f.bisl("bjfv", bisf(int ), (int)154);
                if (!var6_3) ** GOTO lbl134
                throw null;
            }
lbl163:
            // 3 sources

            case 7: {
                var5_4 /* !! */  = (int)f.bisl("bjfw", bisf(int ), (int)155);
                if (!var6_3) ** GOTO lbl134
                throw null;
            }
lbl167:
            // 3 sources

            case 8: {
                var5_4 /* !! */  = (int)f.bisl("bjfx", bisf(int ), (int)156);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl203
            }
lbl172:
            // 2 sources

            case 9: {
                var5_4 /* !! */  = (int)f.bisl("bjfy", bisf(int ), (int)157);
                if (!var6_3) ** GOTO lbl139
                throw null;
            }
lbl176:
            // 2 sources

            case 10: {
                var5_4 /* !! */  = (int)f.bisl("bjfz", bisf(int ), (int)158);
                if (!var6_3) break;
                throw null;
            }
            case 11: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_4 /* !! */  = (int)f.bisl("bjga", bisf(int ), (int)159);
                    if (var6_3) {
                        throw null;
                    }
                    ** GOTO lbl199
                    break;
                }
            }
            case 12: {
                do {
                    var5_4 /* !! */  = (int)f.bisl("bjgb", bisf(int ), (int)160);
                } while (!var6_3);
                throw null;
            }
lbl191:
            // 2 sources

            case 13: {
                var5_4 /* !! */  = (int)f.bisl("bjgc", bisf(int ), (int)161);
                if (!var6_3) ** GOTO lbl129
                throw null;
            }
lbl195:
            // 2 sources

            case 14: {
                var5_4 /* !! */  = (int)f.bisl("bjgd", bisf(int ), (int)162);
                if (var6_3) {
                    throw null;
                }
            }
lbl199:
            // 5 sources

            case 15: {
                var5_4 /* !! */  = (int)f.bisl("bjge", bisf(int ), (int)163);
                if (!var6_3) ** GOTO lbl172
                throw null;
            }
lbl203:
            // 2 sources

            case 16: {
                var5_4 /* !! */  = (int)f.bisl("bjgf", bisf(int ), (int)164);
                if (!var6_3) ** GOTO lbl163
                throw null;
            }
            case 17: {
                var5_4 /* !! */  = (int)f.bisl("bjgg", bisf(int ), (int)165);
                if (!var6_3) ** GOTO lbl139
                throw null;
            }
            case 18: {
                var5_4 /* !! */  = (int)f.bisl("bjgh", bisf(int ), (int)166);
                if (!var6_3) ** GOTO lbl167
                throw null;
            }
            case 19: 
        }
        var5_4 /* !! */  = (int)f.bisl("bjgi", bisf(int ), (int)167);
        ** while (!var6_3)
lbl218:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void bjkf() {
        f.bisj[0] = 1694917650;
        f.bisj[1] = 1793407247;
        f.bisj[2] = 1475050406;
        f.bisj[3] = 552339091;
        f.bisj[4] = -786119537;
        f.bisj[5] = -351422691;
        f.bisj[6] = 1871320717;
        f.bisj[7] = 771544830;
        f.bisj[8] = -1985310525;
        f.bisj[9] = 95799055;
        f.bisj[10] = -1611182014;
        f.bisj[11] = 650849363;
        f.bisj[12] = -1729749339;
        f.bisj[13] = -89047401;
        f.bisj[14] = -302727710;
        f.bisj[15] = 125256305;
        f.bisj[16] = -858234;
        f.bisj[17] = -1580006698;
        f.bisj[18] = -1200214879;
        f.bisj[19] = 756042034;
        f.bisj[20] = -51859296;
        f.bisj[21] = -538502094;
        f.bisj[22] = -1604275120;
        f.bisj[23] = -168146055;
        f.bisj[24] = -147273868;
        f.bisj[25] = -328689193;
        f.bisj[26] = 1505418451;
        f.bisj[27] = 1605321862;
        f.bisj[28] = -2136147516;
        f.bisj[29] = 792249759;
        f.bisj[30] = 1351757398;
        f.bisj[31] = -1579337537;
        f.bisj[32] = 893202600;
        f.bisj[33] = -1392278026;
        f.bisj[34] = 1294600574;
        f.bisj[35] = -811336746;
        f.bisj[36] = -772344548;
        f.bisj[37] = -575173221;
        f.bisj[38] = 2133178054;
        f.bisj[39] = 990720616;
        f.bisj[40] = 633277479;
        f.bisj[41] = -270575342;
        f.bisj[42] = 941438642;
        f.bisj[43] = 2130545387;
        f.bisj[44] = -863733624;
        f.bisj[45] = -930770485;
        f.bisj[46] = -1512857562;
        f.bisj[47] = 2128669771;
        f.bisj[48] = 1756954759;
        f.bisj[49] = 1063969032;
        f.bisj[50] = 816295570;
        f.bisj[51] = -144072415;
        f.bisj[52] = -417003429;
        f.bisj[53] = -1162215945;
        f.bisj[54] = -999137066;
        f.bisj[55] = 1903967825;
        f.bisj[56] = -1182368254;
        f.bisj[57] = 498540194;
        f.bisj[58] = -1062571323;
        f.bisj[59] = 1009599061;
        f.bisj[60] = -694848071;
        f.bisj[61] = -1850292195;
        f.bisj[62] = 1019427882;
        f.bisj[63] = 86579083;
        f.bisj[64] = -1584078824;
        f.bisj[65] = -980014453;
        f.bisj[66] = -340791356;
        f.bisj[67] = 100369323;
        f.bisj[68] = -954496440;
        f.bisj[69] = -2125456676;
        f.bisj[70] = 1150957907;
        f.bisj[71] = 1790673150;
        f.bisj[72] = -1342671088;
        f.bisj[73] = -293339440;
        f.bisj[74] = -1588738615;
        f.bisj[75] = -1702001749;
        f.bisj[76] = 410411593;
        f.bisj[77] = 369664549;
        f.bisj[78] = -345737421;
        f.bisj[79] = 1742933519;
        f.bisj[80] = 1060683061;
        f.bisj[81] = -591460262;
        f.bisj[82] = -2113722069;
        f.bisj[83] = 518081931;
        f.bisj[84] = -595860674;
        f.bisj[85] = -144063551;
        f.bisj[86] = -2081416955;
        f.bisj[87] = -724298007;
        f.bisj[88] = 907386978;
        f.bisj[89] = 1217124187;
        f.bisj[90] = -1840680622;
        f.bisj[91] = -655154392;
        f.bisj[92] = -1775300810;
        f.bisj[93] = 32529497;
        f.bisj[94] = -2116183520;
        f.bisj[95] = 733547885;
        f.bisj[96] = -305293203;
        f.bisj[97] = 917895482;
        f.bisj[98] = -108465806;
        f.bisj[99] = 804177869;
    }

    /*
     * Enabled aggressive block sorting
     */
    protected void logDirect(String string) {
        boolean bl2;
        while (true) {
            long l2;
            Object object;
            if ((object = (l2 = dj - f.bisl("bjdu", bitc(int ), (int)86)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object == f.bisl("bjdv", bisf(int ), (int)126)) break;
            object = f.bisl("bjdw", bisf(int ), (int)127);
        }
        boolean bl3 = c;
        while (true) {
            long l3;
            Object object;
            if ((object = (l3 = dj - f.bisl("bjdx", bitc(int ), (int)87)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object == f.bisl("bjdy", bisf(int ), (int)128)) break;
            object = f.bisl("bjdz", bisf(int ), (int)129);
        }
        int n2 = b;
        while (true) {
            long l4;
            Object object;
            if ((object = (l4 = dj - f.bisl("bjea", bitc(int ), (int)88)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            if (object == f.bisl("bjeb", bisf(int ), (int)130)) {
                bl2 = a;
                if (bl3) {
                    throw null;
                }
                break;
            }
            object = f.bisl("bjec", bisf(int ), (int)131);
        }
        if (bl2 || bl2) return;
        while (true) {
            long l5;
            Object object;
            if ((object = (l5 = dj - f.bisl("bjed", bitc(int ), (int)89)) == 0L ? 0 : (l5 < 0L ? -1 : 1)) == false) continue;
            if (object == f.bisl("bjee", bisf(int ), (int)132)) {
                pp.brandmessage(string);
                if (bl2) return;
                break;
            }
            object = f.bisl("bjef", bisf(int ), (int)133);
        }
        if (!bl2) return;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    protected void logDirect(class_5250 var1_1) {
        v0 /* !! */  = f.dj;
        if (true) ** GOTO lbl5
        block14: while (true) {
            v0 /* !! */  = (long)(v1 - f.bisl("bjhb", bitc(int ), (int)119));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1138194632: {
                    v1 = f.bisl("bjhc", bitc(int ), (int)120);
                    continue block14;
                }
                case -894564454: {
                    break block14;
                }
                case 97466249: {
                    v1 = f.bisl("bjhd", bitc(int ), (int)121);
                    continue block14;
                }
                case 2017743613: {
                    v1 = f.bisl("bjhe", bitc(int ), (int)122);
                    continue block14;
                }
            }
            break;
        }
        var4_2 = f.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = f.dj - f.bisl("bjhf", bitc(int ), (int)123)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == f.bisl("bjhg", bisf(int ), (int)178)) break;
            v2 /* !! */  = (long)f.bisl("bjhh", bisf(int ), (int)179);
        }
        var3_3 /* !! */  = f.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = f.dj - f.bisl("bjhi", bitc(int ), (int)124)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == f.bisl("bjhj", bisf(int ), (int)180)) break;
            v3 /* !! */  = (long)f.bisl("bjhk", bisf(int ), (int)181);
        }
        var2_4 = f.a;
        if (var4_2) {
            throw null;
lbl32:
            // 3 sources

            return;
        }
        if (var2_4) ** GOTO lbl32
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** GOTO lbl32
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = f.dj - f.bisl("bjhl", bitc(int ), (int)125)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == f.bisl("bjhm", bisf(int ), (int)182)) break;
                    v4 /* !! */  = (long)f.bisl("bjhn", bisf(int ), (int)183);
                }
                pp.brandmessage((class_2561)var1_1);
                if (!var2_4 && !var2_4) ** break;
                ** continue;
                return;
            }
lbl48:
            // 4 sources

            case 0: {
                var3_3 /* !! */  = (int)f.bisl("bjho", bisf(int ), (int)184);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl65
            }
            case 1: {
                var3_3 /* !! */  = (int)f.bisl("bjhp", bisf(int ), (int)185);
                if (!var4_2) ** GOTO lbl48
                throw null;
            }
            case 2: {
                var3_3 /* !! */  = (int)f.bisl("bjhq", bisf(int ), (int)186);
                if (!var4_2) ** GOTO lbl48
                throw null;
            }
            case 3: {
                var3_3 /* !! */  = (int)f.bisl("bjhr", bisf(int ), (int)187);
                if (var4_2) {
                    throw null;
                }
            }
lbl65:
            // 4 sources

            case 4: {
                var3_3 /* !! */  = (int)f.bisl("bjhs", bisf(int ), (int)188);
                if (!var4_2) ** GOTO lbl48
                throw null;
            }
            case 5: 
        }
        do {
            var3_3 /* !! */  = (int)f.bisl("bjht", bisf(int ), (int)189);
        } while (!var4_2);
        throw null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public String getShortDesc() {
        boolean bl2;
        Object object = dj;
        block4: while (true) {
            switch ((int)object) {
                case -2117607005: {
                    object = f.bisl("biuo", bitc(int ), (int)5) - f.bisl("biun", bitc(int ), (int)4);
                    continue block4;
                }
                case -894564454: {
                    break block4;
                }
            }
            break;
        }
        boolean bl3 = c;
        while (true) {
            long l2;
            Object object2;
            if ((object2 = (l2 = dj - f.bisl("biup", bitc(int ), (int)6)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object2 == f.bisl("bius", bisf(int ), (int)18)) break;
            object2 = f.bisl("biut", bisf(int ), (int)19);
        }
        int n2 = b;
        while (true) {
            long l3;
            Object object3;
            if ((object3 = (l3 = dj - f.bisl("biuv", bitc(int ), (int)7)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object3 == f.bisl("biux", bisf(int ), (int)20)) {
                bl2 = a;
                if (bl3) {
                    throw null;
                }
                break;
            }
            object3 = f.bisl("biuz", bisf(int ), (int)21);
        }
        if (bl2) return null;
        if (bl2) return null;
        while (true) {
            long l4;
            Object object4;
            if ((object4 = (l4 = dj - f.bisl("bivb", bitc(int ), (int)8)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            if (object4 == f.bisl("bivc", bisf(int ), (int)22)) {
                return this.description;
            }
            object4 = f.bisl("bivj", bisf(int ), (int)23);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public Stream<String> tabComplete(String var1_1, String[] var2_2) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = f.dj - f.bisl("bith", bitc(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == f.bisl("biti", bisf(int ), (int)6)) break;
            v0 /* !! */  = (long)f.bisl("bitk", bisf(int ), (int)7);
        }
        var5_3 = f.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = f.dj - f.bisl("bitm", bitc(int ), (int)1)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == f.bisl("bito", bisf(int ), (int)8)) break;
            v1 /* !! */  = (long)f.bisl("bitp", bisf(int ), (int)9);
        }
        var4_4 /* !! */  = f.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = f.dj - f.bisl("bits", bitc(int ), (int)2)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == f.bisl("bitu", bisf(int ), (int)10)) break;
            v2 /* !! */  = (long)f.bisl("bitw", bisf(int ), (int)11);
        }
        var3_5 = f.a;
        if (var4_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var5_3) {
                    throw null;
                    return null;
                }
                if (var3_5 || var3_5) ** continue;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_3 = f.dj - f.bisl("biua", bitc(int ), (int)3)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == f.bisl("biub", bisf(int ), (int)12)) break;
                    v3 /* !! */  = (long)f.bisl("biuc", bisf(int ), (int)13);
                }
                return Stream.empty();
            }
            case 0: {
                var4_4 /* !! */  = (int)f.bisl("biud", bisf(int ), (int)14);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl47
            }
lbl42:
            // 2 sources

            case 1: {
                do {
                    var4_4 /* !! */  = (int)f.bisl("biug", bisf(int ), (int)15);
                } while (!var5_3);
                throw null;
            }
lbl47:
            // 2 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_4 /* !! */  = (int)f.bisl("biui", bisf(int ), (int)16);
                    if (!var5_3) ** GOTO lbl42
                    throw null;
                }
            }
            case 3: 
        }
        var4_4 /* !! */  = (int)f.bisl("biuk", bisf(int ), (int)17);
        ** while (!var5_3)
lbl55:
        // 1 sources

        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    protected void logDirectRaw(class_2561 var1_1) {
        block41: {
            while (true) {
                block42: {
                    if ((v0 /* !! */  = (cfr_temp_1 = f.dj - f.bisl("bjhu", bitc(int ), (int)126)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v0 /* !! */  != f.bisl("bjhv", bisf(int ), (int)190)) break block42;
                    var4_2 = f.c;
                    v1 /* !! */  = f.dj;
                    if (true) ** GOTO lbl13
                }
                v0 /* !! */  = (long)f.bisl("bjhw", bisf(int ), (int)191);
            }
            block24: while (true) {
                v1 /* !! */  = (long)(v2 - f.bisl("bjhx", bitc(int ), (int)127));
lbl13:
                // 2 sources

                switch ((int)v1 /* !! */ ) {
                    case -1732566036: {
                        v2 = f.bisl("bjhy", bitc(int ), (int)128);
                        continue block24;
                    }
                    case -894564454: {
                        break block24;
                    }
                    case 810236824: {
                        v2 = f.bisl("bjhz", bitc(int ), (int)129);
                        continue block24;
                    }
                    case 1430640720: {
                        v2 = f.bisl("bjia", bitc(int ), (int)130);
                        continue block24;
                    }
                }
                break;
            }
            var3_3 /* !! */  = f.b;
            while (true) {
                if ((v3 /* !! */  = (cfr_temp_2 = f.dj - f.bisl("bjib", bitc(int ), (int)131)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v3 /* !! */  == f.bisl("bjic", bisf(int ), (int)192)) {
                    var2_4 = f.a;
                    if (var4_2) {
                        throw null;
                    }
                    break;
                }
                v3 /* !! */  = (long)f.bisl("bjid", bisf(int ), (int)193);
            }
            if (var2_4 || var2_4) return;
            v4 /* !! */  = f.dj;
            if (true) ** GOTO lbl41
            block26: while (true) {
                v4 /* !! */  = (long)(v5 - f.bisl("bjie", bitc(int ), (int)132));
lbl41:
                // 2 sources

                switch ((int)v4 /* !! */ ) {
                    case -894564454: {
                        break block26;
                    }
                    case 95562521: {
                        v5 = f.bisl("bjif", bitc(int ), (int)133);
                        continue block26;
                    }
                    case 759185280: {
                        v5 = f.bisl("bjig", bitc(int ), (int)134);
                        continue block26;
                    }
                }
                break;
            }
            v6 = g.getInstance();
            v7 /* !! */  = f.dj;
            block27: while (true) {
                switch ((int)v7 /* !! */ ) {
                    case -1821447229: {
                        v7 /* !! */  = (long)(f.bisl("bjii", bitc(int ), (int)136) - f.bisl("bjih", bitc(int ), (int)135));
                        continue block27;
                    }
                    case -894564454: {
                        break block27;
                    }
                }
                break;
            }
            v6.sendRaw(var1_1);
            if (var2_4 || var2_4) {
                return;
            }
            if (var3_3 /* !! */  == 0) return;
            cfr_temp_0 = -2147483648;
            block28: do {
                switch (cfr_temp_0 == -2147483648 ? var3_3 /* !! */  : cfr_temp_0) {
                    default: {
                        return;
                    }
                    case 0: {
                        var3_3 /* !! */  = (int)f.bisl("bjij", bisf(int ), (int)194);
                        cfr_temp_0 = 3;
                        if (!var4_2) continue block28;
                        throw null;
                    }
                    case 4: {
                        var3_3 /* !! */  = (int)f.bisl("bjin", bisf(int ), (int)198);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 1: {
                        var3_3 /* !! */  = (int)f.bisl("bjik", bisf(int ), (int)195);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 2: {
                        ** break;
                    }
                    case 5: {
                        break block41;
                    }
lbl85:
                    // 2 sources

                    while (true) {
                        var3_3 /* !! */  = (int)f.bisl("bjil", bisf(int ), (int)196);
                        cfr_temp_0 = 3;
                        if (!var4_2) continue block28;
                        throw null;
                    }
                    case 3: 
                }
                break;
            } while (true);
            var3_3 /* !! */  = (int)f.bisl("bjim", bisf(int ), (int)197);
            if (var4_2) {
                throw null;
            }
        }
        var3_3 /* !! */  = (int)f.bisl("bjio", bisf(int ), (int)199);
        ** while (!var4_2)
lbl99:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void bjkc() {
        f.bisg[0] = 1694917654;
        f.bisg[1] = 1793407244;
        f.bisg[2] = 1475050402;
        f.bisg[3] = 552339090;
        f.bisg[4] = -786119537;
        f.bisg[5] = -351422691;
        f.bisg[6] = -1871320718;
        f.bisg[7] = -1646447268;
        f.bisg[8] = 1985310524;
        f.bisg[9] = 440375660;
        f.bisg[10] = 1611182013;
        f.bisg[11] = -1552908171;
        f.bisg[12] = 1729749338;
        f.bisg[13] = 902210239;
        f.bisg[14] = -302727709;
        f.bisg[15] = 125256307;
        f.bisg[16] = -858233;
        f.bisg[17] = -1580006700;
        f.bisg[18] = 1200214878;
        f.bisg[19] = 1862902785;
        f.bisg[20] = -51859295;
        f.bisg[21] = -1093030061;
        f.bisg[22] = 1604275119;
        f.bisg[23] = 744917679;
        f.bisg[24] = -147273867;
        f.bisg[25] = -328689195;
        f.bisg[26] = 1505418448;
        f.bisg[27] = 1605321861;
        f.bisg[28] = 2136147515;
        f.bisg[29] = -399813182;
        f.bisg[30] = -1351757399;
        f.bisg[31] = 1608968437;
        f.bisg[32] = 893202600;
        f.bisg[33] = 1392278025;
        f.bisg[34] = 1294600573;
        f.bisg[35] = 811336745;
        f.bisg[36] = 875446099;
        f.bisg[37] = 575173220;
        f.bisg[38] = -2133178055;
        f.bisg[39] = 1711209633;
        f.bisg[40] = 633277477;
        f.bisg[41] = -270575342;
        f.bisg[42] = 941438642;
        f.bisg[43] = 2130545386;
        f.bisg[44] = 863733623;
        f.bisg[45] = 719102320;
        f.bisg[46] = 1512857561;
        f.bisg[47] = -307974101;
        f.bisg[48] = 1756954758;
        f.bisg[49] = 1063969032;
        f.bisg[50] = 816295571;
        f.bisg[51] = -144072415;
        f.bisg[52] = -417003432;
        f.bisg[53] = -1162215946;
        f.bisg[54] = 999137065;
        f.bisg[55] = -1406218876;
        f.bisg[56] = 1182368253;
        f.bisg[57] = -406644601;
        f.bisg[58] = -1062571324;
        f.bisg[59] = 1009599062;
        f.bisg[60] = -694848070;
        f.bisg[61] = -1850292193;
        f.bisg[62] = -1019427883;
        f.bisg[63] = 898219545;
        f.bisg[64] = 1584078823;
        f.bisg[65] = -1215010162;
        f.bisg[66] = 340791355;
        f.bisg[67] = 1707548198;
        f.bisg[68] = -954496439;
        f.bisg[69] = -2125456675;
        f.bisg[70] = 1150957906;
        f.bisg[71] = 1790673149;
        f.bisg[72] = 1342671087;
        f.bisg[73] = -1187103636;
        f.bisg[74] = 1588738614;
        f.bisg[75] = -1828684320;
        f.bisg[76] = 410411594;
        f.bisg[77] = 369664551;
        f.bisg[78] = -345737421;
        f.bisg[79] = 1742933516;
        f.bisg[80] = -1060683062;
        f.bisg[81] = -2091836518;
        f.bisg[82] = 2113722068;
        f.bisg[83] = 667764045;
        f.bisg[84] = 595860673;
        f.bisg[85] = 1865055936;
        f.bisg[86] = 2081416954;
        f.bisg[87] = -1917227947;
        f.bisg[88] = -907386979;
        f.bisg[89] = 1379057967;
        f.bisg[90] = -1840680617;
        f.bisg[91] = -655154385;
        f.bisg[92] = -1775300812;
        f.bisg[93] = 32529498;
        f.bisg[94] = -2116183517;
        f.bisg[95] = 733547887;
        f.bisg[96] = -305293201;
        f.bisg[97] = 917895486;
        f.bisg[98] = -108465803;
        f.bisg[99] = 804177864;
    }

    private static /* synthetic */ void bjkk() {
        f.bitg[0] = -6028990117098388057L;
        f.bitg[1] = -7152071702160475097L;
        f.bitg[2] = -5203154900709700485L;
        f.bitg[3] = -5437083875852779077L;
        f.bitg[4] = -1978971781359195230L;
        f.bitg[5] = -2648519880523495458L;
        f.bitg[6] = -1983214173943195633L;
        f.bitg[7] = -2028717055844378696L;
        f.bitg[8] = -554176744656725087L;
        f.bitg[9] = 5988652419719523765L;
        f.bitg[10] = -1258489726484841571L;
        f.bitg[11] = -8079367628522031005L;
        f.bitg[12] = 548541842595539439L;
        f.bitg[13] = 5932827993373133304L;
        f.bitg[14] = 8743938960782569098L;
        f.bitg[15] = 323852100017260025L;
        f.bitg[16] = -4135214790976334005L;
        f.bitg[17] = 7345055522165289835L;
        f.bitg[18] = -532271777080969271L;
        f.bitg[19] = -9089272766618626824L;
        f.bitg[20] = -3616636629708607441L;
        f.bitg[21] = -5097342610736924646L;
        f.bitg[22] = -1073746885155628018L;
        f.bitg[23] = 8112862300302123040L;
        f.bitg[24] = 767160198848771501L;
        f.bitg[25] = -875710081887489714L;
        f.bitg[26] = 1945893373446780085L;
        f.bitg[27] = -7902757226020341317L;
        f.bitg[28] = 2808028670863901557L;
        f.bitg[29] = -3286258386342481005L;
        f.bitg[30] = 8710488962261068042L;
        f.bitg[31] = 6908804486761138845L;
        f.bitg[32] = -8021173567388406898L;
        f.bitg[33] = -1020504881795843123L;
        f.bitg[34] = 6144699258706255996L;
        f.bitg[35] = -3094109318922097601L;
        f.bitg[36] = 7844844266027371820L;
        f.bitg[37] = 4814595084764673099L;
        f.bitg[38] = 2184309745226032642L;
        f.bitg[39] = 7348841836773330635L;
        f.bitg[40] = -5492599777057121479L;
        f.bitg[41] = 3565609158295118648L;
        f.bitg[42] = 8845521011512947555L;
        f.bitg[43] = 2312668665336381398L;
        f.bitg[44] = 2625825798666907298L;
        f.bitg[45] = -4705217360837410530L;
        f.bitg[46] = 7738445720200150425L;
        f.bitg[47] = -2576315012950778152L;
        f.bitg[48] = -2795924498395003825L;
        f.bitg[49] = 9024135844888325751L;
        f.bitg[50] = -7805441321793907821L;
        f.bitg[51] = -456249126818648492L;
        f.bitg[52] = 8082965550284914526L;
        f.bitg[53] = 7197580892349568104L;
        f.bitg[54] = -7495933007450251134L;
        f.bitg[55] = -7438243269665006848L;
        f.bitg[56] = -5860843208913933912L;
        f.bitg[57] = -495833145199036434L;
        f.bitg[58] = -7269606630678394038L;
        f.bitg[59] = 6106747440780349911L;
        f.bitg[60] = -8568961691814535281L;
        f.bitg[61] = -2080546998220052251L;
        f.bitg[62] = -3685987446310959962L;
        f.bitg[63] = 4084318772379655220L;
        f.bitg[64] = -3350455051186217834L;
        f.bitg[65] = 3572351198252189938L;
        f.bitg[66] = 6787213287056077158L;
        f.bitg[67] = 2411256935520091209L;
        f.bitg[68] = 5363358794283479987L;
        f.bitg[69] = -4508230596806257659L;
        f.bitg[70] = 3259219215633981208L;
        f.bitg[71] = -1569367928177486000L;
        f.bitg[72] = 2140375171079889354L;
        f.bitg[73] = -1622943721934961917L;
        f.bitg[74] = 7625185486193771873L;
        f.bitg[75] = 4052129498533314618L;
        f.bitg[76] = -1018093376264986551L;
        f.bitg[77] = -1298976211708837247L;
        f.bitg[78] = 283286259899181035L;
        f.bitg[79] = -7114605612547778279L;
        f.bitg[80] = 8508059045186456674L;
        f.bitg[81] = 8291330385484691111L;
        f.bitg[82] = -3777076582558248231L;
        f.bitg[83] = -6867938939841515402L;
        f.bitg[84] = -9118041732111898360L;
        f.bitg[85] = -627974635136402929L;
        f.bitg[86] = -8742883626638289271L;
        f.bitg[87] = -5721357064993021098L;
        f.bitg[88] = -3414487193120547747L;
        f.bitg[89] = 433023606452591338L;
        f.bitg[90] = -4713920539468953180L;
        f.bitg[91] = -418919538425849147L;
        f.bitg[92] = -1961964688462615661L;
        f.bitg[93] = -4510834467525187907L;
        f.bitg[94] = 6561520132940762813L;
        f.bitg[95] = -7915409863460004132L;
        f.bitg[96] = 8247699143411140971L;
        f.bitg[97] = -3809248241358766449L;
        f.bitg[98] = -2111628999167956153L;
        f.bitg[99] = -3901097863193782553L;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public String getDescription() {
        block20: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_1 = f.dj - f.bisl("bizj", bitc(int ), (int)35)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  == f.bisl("bizk", bisf(int ), (int)62)) break;
                v0 /* !! */  = (long)f.bisl("bizl", bisf(int ), (int)63);
            }
            var3_1 = f.c;
            v1 /* !! */  = f.dj;
            block11: while (true) {
                switch ((int)v1 /* !! */ ) {
                    case -1510901355: {
                        v1 /* !! */  = (long)(f.bisl("bizn", bitc(int ), (int)37) - f.bisl("bizm", bitc(int ), (int)36));
                        continue block11;
                    }
                    case -894564454: {
                        break block11;
                    }
                }
                break;
            }
            var2_2 /* !! */  = f.b;
            while (true) {
                if ((v2 /* !! */  = (cfr_temp_2 = f.dj - f.bisl("bizo", bitc(int ), (int)38)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v2 /* !! */  == f.bisl("bizp", bisf(int ), (int)64)) {
                    var1_3 = f.a;
                    if (var3_1) {
                        throw null;
                    }
                    break;
                }
                v2 /* !! */  = (long)f.bisl("bizq", bisf(int ), (int)65);
            }
            if (var1_3 != false) return null;
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            cfr_temp_0 = -2147483648;
            block13: do {
                switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var1_3 != false) return null;
                        while (true) {
                            if ((v3 /* !! */  = (cfr_temp_3 = f.dj - f.bisl("bizr", bitc(int ), (int)39)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                            if (v3 /* !! */  == f.bisl("bizs", bisf(int ), (int)66)) {
                                return this.description;
                            }
                            v3 /* !! */  = (long)f.bisl("bizt", bisf(int ), (int)67);
                        }
                    }
                    case 0: {
                        ** break;
                    }
                    case 2: {
                        var2_2 /* !! */  = (int)f.bisl("bizw", bisf(int ), (int)70);
                        cfr_temp_0 = 1;
                        if (!var3_1) continue block13;
                        throw null;
                    }
                    case 3: {
                        break block20;
                    }
lbl47:
                    // 2 sources

                    while (true) {
                        var2_2 /* !! */  = (int)f.bisl("bizu", bisf(int ), (int)68);
                        cfr_temp_0 = 1;
                        if (!var3_1) continue block13;
                        throw null;
                    }
                    case 1: 
                }
                break;
            } while (true);
            var2_2 /* !! */  = (int)f.bisl("bizv", bisf(int ), (int)69);
            if (var3_1) {
                throw null;
            }
        }
        var2_2 /* !! */  = (int)f.bisl("bizx", bisf(int ), (int)71);
        ** while (!var3_1)
lbl61:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void bjkh() {
        f.bisj[200] = -1886371749;
        f.bisj[201] = 1391484414;
        f.bisj[202] = -1336785196;
        f.bisj[203] = 1224627821;
        f.bisj[204] = -1128832133;
        f.bisj[205] = 1261610101;
        f.bisj[206] = -62185728;
        f.bisj[207] = 595602545;
        f.bisj[208] = -294369019;
        f.bisj[209] = 2085197019;
        f.bisj[210] = -573981648;
        f.bisj[211] = 447370017;
        f.bisj[212] = -1132539019;
        f.bisj[213] = -1737269696;
        f.bisj[214] = -547429340;
        f.bisj[215] = 931834409;
        f.bisj[216] = -1833838661;
        f.bisj[217] = 2126001505;
        f.bisj[218] = -940400094;
    }

    private static /* synthetic */ void bjkd() {
        f.bisg[100] = 1001795102;
        f.bisg[101] = 67593169;
        f.bisg[102] = 252347879;
        f.bisg[103] = -974528185;
        f.bisg[104] = -758095013;
        f.bisg[105] = 261431662;
        f.bisg[106] = -1507045492;
        f.bisg[107] = 1480294163;
        f.bisg[108] = -1502527708;
        f.bisg[109] = -1481015021;
        f.bisg[110] = -94829908;
        f.bisg[111] = -388266383;
        f.bisg[112] = -1004617003;
        f.bisg[113] = 1117383402;
        f.bisg[114] = 456158784;
        f.bisg[115] = -2138875441;
        f.bisg[116] = 1494009672;
        f.bisg[117] = 768628346;
        f.bisg[118] = 311592041;
        f.bisg[119] = -1061332606;
        f.bisg[120] = 193629538;
        f.bisg[121] = 1123155849;
        f.bisg[122] = -218460204;
        f.bisg[123] = -1710800844;
        f.bisg[124] = 1966477825;
        f.bisg[125] = 544455875;
        f.bisg[126] = -462881153;
        f.bisg[127] = 104809897;
        f.bisg[128] = -1729187922;
        f.bisg[129] = 414115567;
        f.bisg[130] = 1667400950;
        f.bisg[131] = 893514283;
        f.bisg[132] = -130553310;
        f.bisg[133] = -2061202812;
        f.bisg[134] = -1065923031;
        f.bisg[135] = 898930919;
        f.bisg[136] = 785801047;
        f.bisg[137] = -120586367;
        f.bisg[138] = 608661799;
        f.bisg[139] = 583825932;
        f.bisg[140] = -519405066;
        f.bisg[141] = -1435744562;
        f.bisg[142] = -1102165326;
        f.bisg[143] = 1350866612;
        f.bisg[144] = 1054140662;
        f.bisg[145] = -1262792903;
        f.bisg[146] = 2130093245;
        f.bisg[147] = 411872801;
        f.bisg[148] = 945774690;
        f.bisg[149] = 201157592;
        f.bisg[150] = -1690011855;
        f.bisg[151] = 514345550;
        f.bisg[152] = 1216172366;
        f.bisg[153] = -806221753;
        f.bisg[154] = -373815422;
        f.bisg[155] = 816743551;
        f.bisg[156] = -1329741439;
        f.bisg[157] = -558139093;
        f.bisg[158] = -939409901;
        f.bisg[159] = 190861951;
        f.bisg[160] = 1718551289;
        f.bisg[161] = 1607993370;
        f.bisg[162] = -447674503;
        f.bisg[163] = -694949865;
        f.bisg[164] = 116464626;
        f.bisg[165] = 774831222;
        f.bisg[166] = -1348319365;
        f.bisg[167] = 858767971;
        f.bisg[168] = 485867000;
        f.bisg[169] = -1009204261;
        f.bisg[170] = 1460708692;
        f.bisg[171] = -252039435;
        f.bisg[172] = 679004832;
        f.bisg[173] = -497519484;
        f.bisg[174] = -795706920;
        f.bisg[175] = 668721397;
        f.bisg[176] = 173869209;
        f.bisg[177] = 1533340773;
        f.bisg[178] = 1159702266;
        f.bisg[179] = -1697609292;
        f.bisg[180] = -539697917;
        f.bisg[181] = 542277971;
        f.bisg[182] = 1385909581;
        f.bisg[183] = -1131340829;
        f.bisg[184] = 787958166;
        f.bisg[185] = -1064037115;
        f.bisg[186] = -202796467;
        f.bisg[187] = 537681252;
        f.bisg[188] = 261205035;
        f.bisg[189] = 708096001;
        f.bisg[190] = -833176471;
        f.bisg[191] = -1396181449;
        f.bisg[192] = -21570724;
        f.bisg[193] = 746719216;
        f.bisg[194] = -1011624443;
        f.bisg[195] = -494583262;
        f.bisg[196] = -1813087368;
        f.bisg[197] = 1490573826;
        f.bisg[198] = 510828226;
        f.bisg[199] = 1740238083;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public String getName() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = f.dj - f.bisl("biyt", bitc(int ), (int)28)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == f.bisl("biyv", bisf(int ), (int)54)) break;
            v0 /* !! */  = (long)f.bisl("biyw", bisf(int ), (int)55);
        }
        var3_1 = f.c;
        v1 /* !! */  = f.dj;
        if (true) ** GOTO lbl12
        block16: while (true) {
            v1 /* !! */  = (long)(f.bisl("biyy", bitc(int ), (int)30) - f.bisl("biyx", bitc(int ), (int)29));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -894564454: {
                    break block16;
                }
                case 1508616312: {
                    continue block16;
                }
            }
            break;
        }
        var2_2 /* !! */  = f.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v2 /* !! */  = (cfr_temp_1 = f.dj - f.bisl("biyz", bitc(int ), (int)31)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v2 /* !! */  == f.bisl("biza", bisf(int ), (int)56)) break;
                    v2 /* !! */  = (long)f.bisl("bizb", bisf(int ), (int)57);
                }
                var1_3 = f.a;
                if (var3_1) {
                    throw null;
                    return null;
                }
                if (var1_3 || var1_3) ** continue;
                v3 /* !! */  = f.dj;
                if (true) ** GOTO lbl37
                block19: while (true) {
                    v3 /* !! */  = (long)(v4 - f.bisl("bizc", bitc(int ), (int)32));
lbl37:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -894564454: {
                            break block19;
                        }
                        case -102581418: {
                            v4 = f.bisl("bizd", bitc(int ), (int)33);
                            continue block19;
                        }
                        case 681540937: {
                            v4 = f.bisl("bize", bitc(int ), (int)34);
                            continue block19;
                        }
                    }
                    break;
                }
                return this.name;
            }
lbl47:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)f.bisl("bizf", bisf(int ), (int)58);
                if (!var3_1) break;
                throw null;
            }
            case 1: {
                var2_2 /* !! */  = (int)f.bisl("bizg", bisf(int ), (int)59);
                if (!var3_1) break;
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)f.bisl("bizh", bisf(int ), (int)60);
                if (!var3_1) ** GOTO lbl47
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)f.bisl("bizi", bisf(int ), (int)61);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ long bitc(int n2) {
        return bitd[n2] ^ bitg[n2];
    }
}

