/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2558
 *  net.minecraft.class_2558$class_10609
 *  net.minecraft.class_2561
 *  net.minecraft.class_2568
 *  net.minecraft.class_2568$class_10613
 *  net.minecraft.class_5250
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.List;
import java.util.function.Function;
import net.minecraft.class_2558;
import net.minecraft.class_2561;
import net.minecraft.class_2568;
import net.minecraft.class_5250;
import ruhack.phobia.g;
import ruhack.phobia.o;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class h<T> {
    private static long[] bmtl;
    private static int[] bmsx;
    private final int itemsPerPage;
    private static long[] bmtm;
    public static final int b;
    static final long do = -6541246828470340485L;
    private static int[] bmsw;
    public static final boolean a;
    private final List<T> items;
    private int currentPage;
    public static final boolean c;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void setPage(int var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = h.do - h.bmsy("bmwj", bmtk(int ), (int)39)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == h.bmsy("bmwk", bmsv(int ), (int)46)) break;
            v0 /* !! */  = (long)h.bmsy("bmwl", bmsv(int ), (int)47);
        }
        var4_2 = h.c;
        v1 /* !! */  = h.do;
        if (true) ** GOTO lbl11
        block24: while (true) {
            v1 /* !! */  = (long)(v2 - h.bmsy("bmwm", bmtk(int ), (int)40));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1595935621: {
                    break block24;
                }
                case -1317270719: {
                    v2 = h.bmsy("bmwn", bmtk(int ), (int)41);
                    continue block24;
                }
                case 114183591: {
                    v2 = h.bmsy("bmwo", bmtk(int ), (int)42);
                    continue block24;
                }
                case 1741549409: {
                    v2 = h.bmsy("bmwp", bmtk(int ), (int)43);
                    continue block24;
                }
            }
            break;
        }
        var3_3 /* !! */  = h.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = h.do - h.bmsy("bmwq", bmtk(int ), (int)44)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == h.bmsy("bmwr", bmsv(int ), (int)48)) break;
            v3 /* !! */  = (long)h.bmsy("bmws", bmsv(int ), (int)49);
        }
        var2_4 = h.a;
        if (var4_2) {
            throw null;
lbl32:
            // 2 sources

            return;
        }
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4 || var2_4) ** GOTO lbl32
                v4 = h.bmsy("bmwt", bmsv(int ), (int)50);
                v5 /* !! */  = h.do;
                if (true) ** GOTO lbl43
                block27: while (true) {
                    v5 /* !! */  = (long)(h.bmsy("bmwv", bmtk(int ), (int)46) - h.bmsy("bmwu", bmtk(int ), (int)45));
lbl43:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1595935621: {
                            break block27;
                        }
                        case 1089639862: {
                            continue block27;
                        }
                    }
                    break;
                }
                v6 = this.getTotalPages();
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_2 = h.do - h.bmsy("bmww", bmtk(int ), (int)47)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == h.bmsy("bmwx", bmsv(int ), (int)51)) break;
                    v7 /* !! */  = (long)h.bmsy("bmwy", bmsv(int ), (int)52);
                }
                v8 = Math.min(var1_1, v6);
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_3 = h.do - h.bmsy("bmwz", bmtk(int ), (int)48)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == h.bmsy("bmxa", bmsv(int ), (int)53)) break;
                    v9 /* !! */  = (long)h.bmsy("bmxb", bmsv(int ), (int)54);
                }
                v10 = Math.max((int)v4, v8);
                v11 /* !! */  = h.do;
                if (true) ** GOTO lbl65
                block30: while (true) {
                    v11 /* !! */  = (long)(v12 - h.bmsy("bmxc", bmtk(int ), (int)49));
lbl65:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -1595935621: {
                            break block30;
                        }
                        case -1365878049: {
                            v12 = h.bmsy("bmxd", bmtk(int ), (int)50);
                            continue block30;
                        }
                        case -552694172: {
                            v12 = h.bmsy("bmxe", bmtk(int ), (int)51);
                            continue block30;
                        }
                    }
                    break;
                }
                this.currentPage = v10;
                if (var2_4 || var2_4) ** continue;
                return;
            }
            case 0: {
                var3_3 /* !! */  = (int)h.bmsy("bmxf", bmsv(int ), (int)55);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl95
            }
lbl82:
            // 3 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var3_3 /* !! */  = (int)h.bmsy("bmxg", bmsv(int ), (int)56);
                    if (!var4_2) ** GOTO lbl-1000
                    throw null;
                }
            }
lbl87:
            // 2 sources

            case 2: {
                var3_3 /* !! */  = (int)h.bmsy("bmxh", bmsv(int ), (int)57);
                if (!var4_2) ** GOTO lbl82
                throw null;
            }
            case 3: {
                var3_3 /* !! */  = (int)h.bmsy("bmxi", bmsv(int ), (int)58);
                if (!var4_2) ** GOTO lbl87
                throw null;
            }
lbl95:
            // 2 sources

            case 4: {
                var3_3 /* !! */  = (int)h.bmsy("bmxj", bmsv(int ), (int)59);
                if (!var4_2) ** GOTO lbl82
                throw null;
            }
            case 5: 
        }
        var3_3 /* !! */  = (int)h.bmsy("bmxk", bmsv(int ), (int)60);
        ** while (!var4_2)
lbl102:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void displayNavigation(g var1_1, String var2_2) {
        var8_3 = h.c;
        var7_4 /* !! */  = h.b;
        var6_5 = h.a;
        if (var8_3) {
            throw null;
lbl6:
            // 22 sources

            return;
        }
        if (var6_5 || var6_5) ** GOTO lbl6
        var1_1.sendRaw((class_2561)class_2561.method_43470((String)o.getLine()));
        if (var6_5 || var6_5) ** GOTO lbl6
        var3_6 = class_2561.method_43470((String)"");
        if (var6_5 || var6_5) ** GOTO lbl6
        if (this.currentPage <= h.bmsy("bmys", bmsv(int ), (int)94)) ** GOTO lbl32
        if (var6_5) ** GOTO lbl6
        if (var7_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var7_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var6_5) ** GOTO lbl6
                var4_7 = class_2561.method_43470((String)"\u00a78[\u00a7b\u25c4 \u041d\u0430\u0437\u0430\u0434\u00a78]");
                if (var6_5 || var6_5) ** GOTO lbl6
                var5_8 = var2_2 + " " + (this.currentPage - h.bmsy("bmyt", bmsv(int ), (int)95));
                if (var6_5 || var6_5) ** GOTO lbl6
                var4_7.method_10862(var4_7.method_10866().method_10949((class_2568)new class_2568.class_10613((class_2561)class_2561.method_43470((String)("\u00a77\u0421\u0442\u0440\u0430\u043d\u0438\u0446\u0430 " + (this.currentPage - h.bmsy("bmyu", bmsv(int ), (int)96)))))).method_10958((class_2558)new class_2558.class_10609(var5_8)));
                if (var6_5 || var6_5) ** GOTO lbl6
                var3_6.method_10852((class_2561)var4_7);
                if (var6_5 || var6_5) ** GOTO lbl6
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl36
            }
lbl32:
            // 1 sources

            if (var6_5 || var6_5) ** GOTO lbl6
            var3_6.method_10852((class_2561)class_2561.method_43470((String)"\u00a78[\u00a77\u25c4 \u041d\u0430\u0437\u0430\u0434\u00a78]"));
            if (var6_5) ** GOTO lbl6
lbl36:
            // 2 sources

            if (var6_5 || var6_5) ** GOTO lbl6
            var3_6.method_10852((class_2561)class_2561.method_43470((String)(" \u00a77\u0421\u0442\u0440\u0430\u043d\u0438\u0446\u0430 \u00a7b" + this.currentPage + "\u00a77/\u00a7b" + this.getTotalPages() + " ")));
            if (var6_5 || var6_5) ** GOTO lbl6
            if (this.currentPage >= this.getTotalPages()) ** GOTO lbl55
            if (var6_5 || var6_5) ** GOTO lbl6
            var4_7 = class_2561.method_43470((String)"\u00a78[\u00a7b\u0412\u043f\u0435\u0440\u0451\u0434 \u25ba\u00a78]");
            if (var6_5 || var6_5) ** GOTO lbl6
            var5_8 = var2_2 + " " + (this.currentPage + h.bmsy("bmyv", bmsv(int ), (int)97));
            if (var6_5 || var6_5) ** GOTO lbl6
            var4_7.method_10862(var4_7.method_10866().method_10949((class_2568)new class_2568.class_10613((class_2561)class_2561.method_43470((String)("\u00a77\u0421\u0442\u0440\u0430\u043d\u0438\u0446\u0430 " + (this.currentPage + h.bmsy("bmyw", bmsv(int ), (int)98)))))).method_10958((class_2558)new class_2558.class_10609(var5_8)));
            if (var6_5 || var6_5) ** GOTO lbl6
            var3_6.method_10852((class_2561)var4_7);
            if (var6_5 || var6_5) ** GOTO lbl6
            if (var8_3) {
                throw null;
            }
            ** GOTO lbl59
lbl55:
            // 1 sources

            if (var6_5 || var6_5) ** GOTO lbl6
            var3_6.method_10852((class_2561)class_2561.method_43470((String)"\u00a78[\u00a77\u0412\u043f\u0435\u0440\u0451\u0434 \u25ba\u00a78]"));
            if (var6_5) ** GOTO lbl6
lbl59:
            // 2 sources

            if (var6_5 || var6_5) ** GOTO lbl6
            var1_1.sendRaw((class_2561)var3_6);
            if (!var6_5 && !var6_5) ** break;
            ** continue;
            return;
lbl64:
            // 2 sources

            case 0: {
                var7_4 /* !! */  = (int)h.bmsy("bmyx", bmsv(int ), (int)99);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl204
            }
lbl69:
            // 2 sources

            case 1: {
                var7_4 /* !! */  = (int)h.bmsy("bmyy", bmsv(int ), (int)100);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl192
            }
lbl74:
            // 3 sources

            case 2: {
                var7_4 /* !! */  = (int)h.bmsy("bmyz", bmsv(int ), (int)101);
                if (!var8_3) ** GOTO lbl69
                throw null;
            }
lbl78:
            // 2 sources

            case 3: {
                var7_4 /* !! */  = (int)h.bmsy("bmza", bmsv(int ), (int)102);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl244
            }
            case 4: {
                var7_4 /* !! */  = (int)h.bmsy("bmzb", bmsv(int ), (int)103);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl228
            }
lbl88:
            // 2 sources

            case 5: {
                var7_4 /* !! */  = (int)h.bmsy("bmzc", bmsv(int ), (int)104);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl103
            }
lbl93:
            // 2 sources

            case 6: {
                var7_4 /* !! */  = (int)h.bmsy("bmzd", bmsv(int ), (int)105);
                if (!var8_3) ** GOTO lbl64
                throw null;
            }
lbl97:
            // 2 sources

            case 7: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var7_4 /* !! */  = (int)h.bmsy("bmze", bmsv(int ), (int)106);
                    if (var8_3) {
                        throw null;
                    }
                    ** GOTO lbl135
                    break;
                }
            }
lbl103:
            // 2 sources

            case 8: {
                var7_4 /* !! */  = (int)h.bmsy("bmzf", bmsv(int ), (int)107);
                if (!var8_3) ** GOTO lbl97
                throw null;
            }
lbl107:
            // 3 sources

            case 9: {
                var7_4 /* !! */  = (int)h.bmsy("bmzg", bmsv(int ), (int)108);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl204
            }
            case 10: {
                var7_4 /* !! */  = (int)h.bmsy("bmzh", bmsv(int ), (int)109);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl220
            }
            case 11: {
                var7_4 /* !! */  = (int)h.bmsy("bmzi", bmsv(int ), (int)110);
                if (var8_3) {
                    throw null;
                }
            }
lbl121:
            // 5 sources

            case 12: {
                var7_4 /* !! */  = (int)h.bmsy("bmzj", bmsv(int ), (int)111);
                if (!var8_3) ** GOTO lbl78
                throw null;
            }
            case 13: {
                var7_4 /* !! */  = (int)h.bmsy("bmzk", bmsv(int ), (int)112);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl166
            }
lbl130:
            // 2 sources

            case 14: {
                var7_4 /* !! */  = (int)h.bmsy("bmzl", bmsv(int ), (int)113);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl187
            }
lbl135:
            // 3 sources

            case 15: {
                var7_4 /* !! */  = (int)h.bmsy("bmzm", bmsv(int ), (int)114);
                if (!var8_3) ** GOTO lbl93
                throw null;
            }
            case 16: {
                do {
                    var7_4 /* !! */  = (int)h.bmsy("bmzn", bmsv(int ), (int)115);
                } while (!var8_3);
                throw null;
            }
            case 17: {
                var7_4 /* !! */  = (int)h.bmsy("bmzo", bmsv(int ), (int)116);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl236
            }
lbl149:
            // 2 sources

            case 18: {
                var7_4 /* !! */  = (int)h.bmsy("bmzp", bmsv(int ), (int)117);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl175
            }
            case 19: {
                var7_4 /* !! */  = (int)h.bmsy("bmzq", bmsv(int ), (int)118);
                if (var8_3) {
                    throw null;
                }
            }
            case 20: {
                var7_4 /* !! */  = (int)h.bmsy("bmzr", bmsv(int ), (int)119);
                if (!var8_3) ** GOTO lbl107
                throw null;
            }
lbl162:
            // 2 sources

            case 21: {
                var7_4 /* !! */  = (int)h.bmsy("bmzs", bmsv(int ), (int)120);
                if (!var8_3) ** GOTO lbl74
                throw null;
            }
lbl166:
            // 2 sources

            case 22: {
                var7_4 /* !! */  = (int)h.bmsy("bmzt", bmsv(int ), (int)121);
                if (!var8_3) ** GOTO lbl135
                throw null;
            }
lbl170:
            // 4 sources

            case 23: {
                var7_4 /* !! */  = (int)h.bmsy("bmzu", bmsv(int ), (int)122);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl240
            }
lbl175:
            // 3 sources

            case 24: {
                var7_4 /* !! */  = (int)h.bmsy("bmzv", bmsv(int ), (int)123);
                if (!var8_3) ** GOTO lbl149
                throw null;
            }
lbl179:
            // 3 sources

            case 25: {
                var7_4 /* !! */  = (int)h.bmsy("bmzw", bmsv(int ), (int)124);
                if (!var8_3) ** GOTO lbl107
                throw null;
            }
lbl183:
            // 2 sources

            case 26: {
                var7_4 /* !! */  = (int)h.bmsy("bmzx", bmsv(int ), (int)125);
                if (!var8_3) ** GOTO lbl175
                throw null;
            }
lbl187:
            // 2 sources

            case 27: {
                var7_4 /* !! */  = (int)h.bmsy("bmzy", bmsv(int ), (int)126);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl220
            }
lbl192:
            // 2 sources

            case 28: {
                var7_4 /* !! */  = (int)h.bmsy("bmzz", bmsv(int ), (int)127);
                if (!var8_3) ** GOTO lbl74
                throw null;
            }
            case 29: {
                var7_4 /* !! */  = (int)h.bmsy("bnaa", bmsv(int ), (int)128);
                if (!var8_3) ** GOTO lbl121
                throw null;
            }
            case 30: {
                var7_4 /* !! */  = (int)h.bmsy("bnab", bmsv(int ), (int)129);
                if (var8_3) {
                    throw null;
                }
            }
lbl204:
            // 5 sources

            case 31: {
                var7_4 /* !! */  = (int)h.bmsy("bnac", bmsv(int ), (int)130);
                if (!var8_3) ** GOTO lbl88
                throw null;
            }
            case 32: {
                var7_4 /* !! */  = (int)h.bmsy("bnad", bmsv(int ), (int)131);
                if (!var8_3) ** GOTO lbl183
                throw null;
            }
            case 33: {
                var7_4 /* !! */  = (int)h.bmsy("bnae", bmsv(int ), (int)132);
                if (!var8_3) ** GOTO lbl121
                throw null;
            }
lbl216:
            // 2 sources

            case 34: {
                var7_4 /* !! */  = (int)h.bmsy("bnaf", bmsv(int ), (int)133);
                if (!var8_3) ** GOTO lbl179
                throw null;
            }
lbl220:
            // 3 sources

            case 35: {
                var7_4 /* !! */  = (int)h.bmsy("bnag", bmsv(int ), (int)134);
                if (!var8_3) ** GOTO lbl216
                throw null;
            }
            case 36: {
                var7_4 /* !! */  = (int)h.bmsy("bnah", bmsv(int ), (int)135);
                if (!var8_3) ** GOTO lbl179
                throw null;
            }
lbl228:
            // 2 sources

            case 37: {
                var7_4 /* !! */  = (int)h.bmsy("bnai", bmsv(int ), (int)136);
                if (!var8_3) ** GOTO lbl170
                throw null;
            }
            case 38: {
                var7_4 /* !! */  = (int)h.bmsy("bnaj", bmsv(int ), (int)137);
                if (!var8_3) ** GOTO lbl170
                throw null;
            }
lbl236:
            // 2 sources

            case 39: {
                var7_4 /* !! */  = (int)h.bmsy("bnak", bmsv(int ), (int)138);
                if (!var8_3) ** GOTO lbl170
                throw null;
            }
lbl240:
            // 2 sources

            case 40: {
                var7_4 /* !! */  = (int)h.bmsy("bnal", bmsv(int ), (int)139);
                if (!var8_3) ** GOTO lbl130
                throw null;
            }
lbl244:
            // 2 sources

            case 41: {
                var7_4 /* !! */  = (int)h.bmsy("bnam", bmsv(int ), (int)140);
                if (!var8_3) ** GOTO lbl162
                throw null;
            }
            case 42: 
        }
        var7_4 /* !! */  = (int)h.bmsy("bnan", bmsv(int ), (int)141);
        ** while (!var8_3)
lbl251:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public int getTotalPages() {
        v0 /* !! */  = h.do;
        if (true) ** GOTO lbl5
        block32: while (true) {
            v0 /* !! */  = (long)(v1 - h.bmsy("bmtn", bmtk(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1595935621: {
                    break block32;
                }
                case -1397853670: {
                    v1 = h.bmsy("bmto", bmtk(int ), (int)1);
                    continue block32;
                }
                case 324669797: {
                    v1 = h.bmsy("bmtp", bmtk(int ), (int)2);
                    continue block32;
                }
            }
            break;
        }
        var3_1 = h.c;
        v2 /* !! */  = h.do;
        if (true) ** GOTO lbl19
        block33: while (true) {
            v2 /* !! */  = (long)(h.bmsy("bmtr", bmtk(int ), (int)4) - h.bmsy("bmtq", bmtk(int ), (int)3));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1595935621: {
                    break block33;
                }
                case 1403179319: {
                    continue block33;
                }
            }
            break;
        }
        var2_2 /* !! */  = h.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_0 = h.do - h.bmsy("bmts", bmtk(int ), (int)5)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == h.bmsy("bmtt", bmsv(int ), (int)11)) break;
            v3 /* !! */  = (long)h.bmsy("bmtu", bmsv(int ), (int)12);
        }
        var1_3 = h.a;
        if (var3_1) {
            throw null;
            return (int)h.bmsy("bmtv", bmsv(int ), (int)13);
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block9 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** continue;
                v4 = h.bmsy("bmtw", bmsv(int ), (int)14);
                v5 /* !! */  = h.do;
                if (true) ** GOTO lbl45
                block36: while (true) {
                    v5 /* !! */  = (long)(v6 - h.bmsy("bmtx", bmtk(int ), (int)6));
lbl45:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1896669201: {
                            v6 = h.bmsy("bmty", bmtk(int ), (int)7);
                            continue block36;
                        }
                        case -1595935621: {
                            break block36;
                        }
                        case -1124677134: {
                            v6 = h.bmsy("bmtz", bmtk(int ), (int)8);
                            continue block36;
                        }
                        case 1222594356: {
                            v6 = h.bmsy("bmua", bmtk(int ), (int)9);
                            continue block36;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_1 = h.do - h.bmsy("bmub", bmtk(int ), (int)10)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v7 /* !! */  == h.bmsy("bmuc", bmsv(int ), (int)15)) break;
                    v7 /* !! */  = (long)h.bmsy("bmud", bmsv(int ), (int)16);
                }
                v8 = this.items.size();
                v9 /* !! */  = h.do;
                if (true) ** GOTO lbl68
                block38: while (true) {
                    v9 /* !! */  = (long)(v10 - h.bmsy("bmue", bmtk(int ), (int)11));
lbl68:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -1595935621: {
                            break block38;
                        }
                        case -638322411: {
                            v10 = h.bmsy("bmuf", bmtk(int ), (int)12);
                            continue block38;
                        }
                        case 628500321: {
                            v10 = h.bmsy("bmug", bmtk(int ), (int)13);
                            continue block38;
                        }
                        case 785843314: {
                            v10 = h.bmsy("bmuh", bmtk(int ), (int)14);
                            continue block38;
                        }
                    }
                    break;
                }
                v11 = v8 / (double)this.itemsPerPage;
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_2 = h.do - h.bmsy("bmui", bmtk(int ), (int)15)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v12 /* !! */  == h.bmsy("bmuj", bmsv(int ), (int)17)) break;
                    v12 /* !! */  = (long)h.bmsy("bmuk", bmsv(int ), (int)18);
                }
                v13 = (int)Math.ceil(v11);
                v14 /* !! */  = h.do;
                if (true) ** GOTO lbl92
                block40: while (true) {
                    v14 /* !! */  = (long)(v15 - h.bmsy("bmul", bmtk(int ), (int)16));
lbl92:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case -1595935621: {
                            break block40;
                        }
                        case -414591258: {
                            v15 = h.bmsy("bmum", bmtk(int ), (int)17);
                            continue block40;
                        }
                        case 156692063: {
                            v15 = h.bmsy("bmun", bmtk(int ), (int)18);
                            continue block40;
                        }
                    }
                    break;
                }
                return Math.max((int)v4, v13);
            }
            case 0: {
                var2_2 /* !! */  = (int)h.bmsy("bmuo", bmsv(int ), (int)19);
                if (!var3_1) break;
                throw null;
            }
            case 1: {
                do {
                    var2_2 /* !! */  = (int)h.bmsy("bmup", bmsv(int ), (int)20);
                } while (!var3_1);
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)h.bmsy("bmuq", bmsv(int ), (int)21);
                    if (!var3_1) break block9;
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)h.bmsy("bmur", bmsv(int ), (int)22);
        ** while (!var3_1)
lbl119:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public List<T> getCurrentPageItems() {
        v0 /* !! */  = h.do;
        if (true) ** GOTO lbl5
        block31: while (true) {
            v0 /* !! */  = (long)(v1 - h.bmsy("bmus", bmtk(int ), (int)19));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1595935621: {
                    break block31;
                }
                case -1187108496: {
                    v1 = h.bmsy("bmut", bmtk(int ), (int)20);
                    continue block31;
                }
                case 862969580: {
                    v1 = h.bmsy("bmuu", bmtk(int ), (int)21);
                    continue block31;
                }
            }
            break;
        }
        var5_1 = h.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = h.do - h.bmsy("bmuv", bmtk(int ), (int)22)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == h.bmsy("bmuw", bmsv(int ), (int)23)) break;
            v2 /* !! */  = (long)h.bmsy("bmux", bmsv(int ), (int)24);
        }
        var4_2 /* !! */  = h.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = h.do - h.bmsy("bmuy", bmtk(int ), (int)23)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == h.bmsy("bmuz", bmsv(int ), (int)25)) break;
            v3 /* !! */  = (long)h.bmsy("bmva", bmsv(int ), (int)26);
        }
        var3_3 = h.a;
        if (var5_1) {
            throw null;
lbl29:
            // 4 sources

            return null;
        }
        if (var3_3) ** GOTO lbl29
        if (var4_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_3) ** GOTO lbl29
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = h.do - h.bmsy("bmvb", bmtk(int ), (int)24)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == h.bmsy("bmvc", bmsv(int ), (int)27)) break;
                    v4 /* !! */  = (long)h.bmsy("bmvd", bmsv(int ), (int)28);
                }
                v5 = this.currentPage - h.bmsy("bmve", bmsv(int ), (int)29);
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_3 = h.do - h.bmsy("bmvf", bmtk(int ), (int)25)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == h.bmsy("bmvg", bmsv(int ), (int)30)) break;
                    v6 /* !! */  = (long)h.bmsy("bmvh", bmsv(int ), (int)31);
                }
                var1_4 = v5 * this.itemsPerPage;
                if (var3_3 || var3_3) ** GOTO lbl29
                v7 /* !! */  = h.do;
                if (true) ** GOTO lbl53
                block37: while (true) {
                    v7 /* !! */  = (long)(v8 - h.bmsy("bmvi", bmtk(int ), (int)26));
lbl53:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -2023204410: {
                            v8 = h.bmsy("bmvj", bmtk(int ), (int)27);
                            continue block37;
                        }
                        case -1595935621: {
                            break block37;
                        }
                        case 662958840: {
                            v8 = h.bmsy("bmvk", bmtk(int ), (int)28);
                            continue block37;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_4 = h.do - h.bmsy("bmvl", bmtk(int ), (int)29)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == h.bmsy("bmvm", bmsv(int ), (int)32)) break;
                    v9 /* !! */  = (long)h.bmsy("bmvn", bmsv(int ), (int)33);
                }
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_5 = h.do - h.bmsy("bmvo", bmtk(int ), (int)30)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == h.bmsy("bmvp", bmsv(int ), (int)34)) break;
                    v10 /* !! */  = (long)h.bmsy("bmvq", bmsv(int ), (int)35);
                }
                v11 = this.items.size();
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_6 = h.do - h.bmsy("bmvr", bmtk(int ), (int)31)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == h.bmsy("bmvs", bmsv(int ), (int)36)) break;
                    v12 /* !! */  = (long)h.bmsy("bmvt", bmsv(int ), (int)37);
                }
                var2_5 = Math.min(var1_4 + this.itemsPerPage, v11);
                if (!var3_3 && !var3_3) ** break;
                ** continue;
                v13 /* !! */  = h.do;
                if (true) ** GOTO lbl85
                block41: while (true) {
                    v13 /* !! */  = (long)(v14 - h.bmsy("bmvu", bmtk(int ), (int)32));
lbl85:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case -1595935621: {
                            break block41;
                        }
                        case -82307015: {
                            v14 = h.bmsy("bmvv", bmtk(int ), (int)33);
                            continue block41;
                        }
                        case 1374516062: {
                            v14 = h.bmsy("bmvw", bmtk(int ), (int)34);
                            continue block41;
                        }
                    }
                    break;
                }
                v15 /* !! */  = h.do;
                if (true) ** GOTO lbl98
                block42: while (true) {
                    v15 /* !! */  = (long)(v16 - h.bmsy("bmvx", bmtk(int ), (int)35));
lbl98:
                    // 2 sources

                    switch ((int)v15 /* !! */ ) {
                        case -1595935621: {
                            break block42;
                        }
                        case -1335782226: {
                            v16 = h.bmsy("bmvy", bmtk(int ), (int)36);
                            continue block42;
                        }
                        case -152851456: {
                            v16 = h.bmsy("bmvz", bmtk(int ), (int)37);
                            continue block42;
                        }
                        case 1969730530: {
                            v16 = h.bmsy("bmwa", bmtk(int ), (int)38);
                            continue block42;
                        }
                    }
                    break;
                }
                return this.items.subList(var1_4, var2_5);
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var4_2 /* !! */  = (int)h.bmsy("bmwb", bmsv(int ), (int)38);
                    if (!var5_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 1: {
                var4_2 /* !! */  = (int)h.bmsy("bmwc", bmsv(int ), (int)39);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl134
            }
lbl121:
            // 2 sources

            case 2: {
                var4_2 /* !! */  = (int)h.bmsy("bmwd", bmsv(int ), (int)40);
                if (!var5_1) break;
                throw null;
            }
            case 3: {
                var4_2 /* !! */  = (int)h.bmsy("bmwe", bmsv(int ), (int)41);
                if (!var5_1) ** GOTO lbl121
                throw null;
            }
lbl129:
            // 2 sources

            case 4: {
                var4_2 /* !! */  = (int)h.bmsy("bmwf", bmsv(int ), (int)42);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl138
            }
lbl134:
            // 2 sources

            case 5: {
                var4_2 /* !! */  = (int)h.bmsy("bmwg", bmsv(int ), (int)43);
                if (!var5_1) ** GOTO lbl129
                throw null;
            }
lbl138:
            // 2 sources

            case 6: {
                do {
                    var4_2 /* !! */  = (int)h.bmsy("bmwh", bmsv(int ), (int)44);
                } while (!var5_1);
                throw null;
            }
            case 7: 
        }
        var4_2 /* !! */  = (int)h.bmsy("bmwi", bmsv(int ), (int)45);
        ** while (!var5_1)
lbl146:
        // 1 sources

        throw null;
    }

    static {
        bmsw = new int[165];
        bmsx = new int[165];
        h.bnbu();
        h.bnbv();
        h.bngj();
        h.bngk();
        bmtl = new long[61];
        bmtm = new long[61];
        h.bngl();
        h.bngm();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public h(List<T> var1_1, int var2_2) {
        var4_3 /* !! */  = h.b;
        super();
        this.items = var1_1;
        this.itemsPerPage = var2_2;
        this.currentPage = (int)h.bmsy("bmtd", bmsv(int ), (int)4);
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        block0 : switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                return;
            }
            case 0: {
                var4_3 /* !! */  = (int)h.bmsy("bmte", bmsv(int ), (int)5);
                ** GOTO lbl17
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_3 /* !! */  = (int)h.bmsy("bmtf", bmsv(int ), (int)6);
                    break block0;
                    break;
                }
            }
lbl17:
            // 2 sources

            case 2: {
                var4_3 /* !! */  = (int)h.bmsy("bmtg", bmsv(int ), (int)7);
                break;
            }
            case 3: {
                var4_3 /* !! */  = (int)h.bmsy("bmth", bmsv(int ), (int)8);
                break;
            }
            case 4: {
                var4_3 /* !! */  = (int)h.bmsy("bmti", bmsv(int ), (int)9);
            }
            case 5: 
        }
        var4_3 /* !! */  = (int)h.bmsy("bmtj", bmsv(int ), (int)10);
        ** while (true)
    }

    private static /* synthetic */ void bngl() {
        h.bmtl[0] = -4900209772201733870L;
        h.bmtl[1] = 85752257819534712L;
        h.bmtl[2] = -306598532627931429L;
        h.bmtl[3] = 5949832997050714613L;
        h.bmtl[4] = -7040217707819663792L;
        h.bmtl[5] = 2196052086972345514L;
        h.bmtl[6] = 4526807662224318942L;
        h.bmtl[7] = -94484074389577363L;
        h.bmtl[8] = -6295431643400046043L;
        h.bmtl[9] = -7002461114780274942L;
        h.bmtl[10] = 3928218220348026599L;
        h.bmtl[11] = 3541235036957054818L;
        h.bmtl[12] = 4160199247158954313L;
        h.bmtl[13] = -5816403711571341719L;
        h.bmtl[14] = -216397451535664292L;
        h.bmtl[15] = 7690787599226130171L;
        h.bmtl[16] = 7321517596907396958L;
        h.bmtl[17] = -2568383330919451368L;
        h.bmtl[18] = -3249017083204558046L;
        h.bmtl[19] = 8464677116056737497L;
        h.bmtl[20] = -6602940009521137874L;
        h.bmtl[21] = 4409768731252914377L;
        h.bmtl[22] = 9068252390194759562L;
        h.bmtl[23] = 4930492653315850595L;
        h.bmtl[24] = 6641591576993096126L;
        h.bmtl[25] = -831636833426092624L;
        h.bmtl[26] = -7047056465501461063L;
        h.bmtl[27] = -8836049529520077328L;
        h.bmtl[28] = -1356444513861440856L;
        h.bmtl[29] = 6484686685349099979L;
        h.bmtl[30] = 3424845440540920412L;
        h.bmtl[31] = 2761447590038793896L;
        h.bmtl[32] = -6452478292418500230L;
        h.bmtl[33] = 5428456724416630875L;
        h.bmtl[34] = -4821554419845923974L;
        h.bmtl[35] = 2782296695196486567L;
        h.bmtl[36] = -7040283316134765312L;
        h.bmtl[37] = 1667065915098332880L;
        h.bmtl[38] = 1786178325823114581L;
        h.bmtl[39] = -8782546298742936497L;
        h.bmtl[40] = 7494106990443946783L;
        h.bmtl[41] = 5368810807097741228L;
        h.bmtl[42] = -7947558619843725062L;
        h.bmtl[43] = -5389588084993870621L;
        h.bmtl[44] = -8832809487545771445L;
        h.bmtl[45] = 98528534367022692L;
        h.bmtl[46] = -2655484757364023463L;
        h.bmtl[47] = -9137544838903468055L;
        h.bmtl[48] = -974606721498200166L;
        h.bmtl[49] = 6236228954940862906L;
        h.bmtl[50] = -2378525912619657261L;
        h.bmtl[51] = 2344716516440099415L;
        h.bmtl[52] = 184592891563300707L;
        h.bmtl[53] = -7260219500149152735L;
        h.bmtl[54] = -4660791324070174002L;
        h.bmtl[55] = -2725397667830259418L;
        h.bmtl[56] = -6029847610374168049L;
        h.bmtl[57] = -4730985776071682148L;
        h.bmtl[58] = 693038069443440906L;
        h.bmtl[59] = -1212245684301010278L;
        h.bmtl[60] = -5847067121829419664L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static <T> void paginate(String[] var0, h<T> var1_1, Runnable var2_2, Function<T, class_5250> var3_3, String var4_4) {
        block49: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = h.do - h.bmsy("bnao", bmtk(int ), (int)52)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  == h.bmsy("bnap", bmsv(int ), (int)142)) break;
                v0 /* !! */  = (long)h.bmsy("bnaq", bmsv(int ), (int)143);
            }
            var8_5 = h.c;
            while (true) {
                if ((v1 /* !! */  = (cfr_temp_1 = h.do - h.bmsy("bnar", bmtk(int ), (int)53)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v1 /* !! */  == h.bmsy("bnas", bmsv(int ), (int)144)) break;
                v1 /* !! */  = (long)h.bmsy("bnat", bmsv(int ), (int)145);
            }
            var7_6 /* !! */  = h.b;
            v2 /* !! */  = h.do;
            if (true) ** GOTO lbl17
            block30: while (true) {
                v2 /* !! */  = (long)(v3 - h.bmsy("bnau", bmtk(int ), (int)54));
lbl17:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case -1809064741: {
                        v3 = h.bmsy("bnav", bmtk(int ), (int)55);
                        continue block30;
                    }
                    case -1595935621: {
                        break block30;
                    }
                    case -310340953: {
                        v3 = h.bmsy("bnaw", bmtk(int ), (int)56);
                        continue block30;
                    }
                }
                break;
            }
            var6_7 = h.a;
            if (var8_5) {
                throw null;
lbl29:
                // 9 sources

                return;
            }
            if (var6_7 || var6_7) ** GOTO lbl29
            if (var0.length <= 0) break block49;
            if (var6_7) ** GOTO lbl29
            try {
                if (var6_7) ** GOTO lbl29
                v4 = var0[0];
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_2 = h.do - h.bmsy("bnax", bmtk(int ), (int)57)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == h.bmsy("bnay", bmsv(int ), (int)146)) break;
                    v5 /* !! */  = (long)h.bmsy("bnaz", bmsv(int ), (int)147);
                }
                var5_8 = Integer.parseInt(v4);
                if (var6_7 || var6_7) ** GOTO lbl29
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_3 = h.do - h.bmsy("bnba", bmtk(int ), (int)58)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == h.bmsy("bnbb", bmsv(int ), (int)148)) break;
                    v6 /* !! */  = (long)h.bmsy("bnbc", bmsv(int ), (int)149);
                }
                var1_1.setPage(var5_8);
                if (var6_7 || var6_7) ** GOTO lbl29
                ** if (!var8_5) goto lbl-1000
            }
            catch (NumberFormatException var5_9) {
                if (var6_7) ** GOTO lbl29
            }
lbl-1000:
            // 1 sources

            {
                throw null;
            }
lbl-1000:
            // 1 sources

            {
            }
        }
        if (var6_7) ** GOTO lbl29
        if (var7_6 /* !! */  == 0) ** GOTO lbl-1000
        switch (var7_6 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var6_7) ** GOTO lbl29
                v7 /* !! */  = h.do;
                if (true) ** GOTO lbl66
                block34: while (true) {
                    v7 /* !! */  = (long)(h.bmsy("bnbe", bmtk(int ), (int)60) - h.bmsy("bnbd", bmtk(int ), (int)59));
lbl66:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -1595935621: {
                            break block34;
                        }
                        case 1124139665: {
                            continue block34;
                        }
                    }
                    break;
                }
                var1_1.display(var2_2, var3_3, var4_4);
                if (!var6_7 && !var6_7) ** break;
                ** continue;
                return;
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var7_6 /* !! */  = (int)h.bmsy("bnbf", bmsv(int ), (int)150);
                    if (var8_5) {
                        throw null;
                    }
                    ** GOTO lbl122
                    break;
                }
            }
            case 1: {
                var7_6 /* !! */  = (int)h.bmsy("bnbg", bmsv(int ), (int)151);
                if (var8_5) {
                    throw null;
                }
            }
            case 2: {
                var7_6 /* !! */  = (int)h.bmsy("bnbh", bmsv(int ), (int)152);
                if (var8_5) {
                    throw null;
                }
                ** GOTO lbl130
            }
            case 3: {
                var7_6 /* !! */  = (int)h.bmsy("bnbi", bmsv(int ), (int)153);
                if (var8_5) {
                    throw null;
                }
                ** GOTO lbl122
            }
lbl95:
            // 2 sources

            case 4: {
                var7_6 /* !! */  = (int)h.bmsy("bnbj", bmsv(int ), (int)154);
                if (!var8_5) break;
                throw null;
            }
            case 5: {
                do {
                    var7_6 /* !! */  = (int)h.bmsy("bnbk", bmsv(int ), (int)155);
                } while (!var8_5);
                throw null;
            }
lbl104:
            // 2 sources

            case 6: {
                var7_6 /* !! */  = (int)h.bmsy("bnbl", bmsv(int ), (int)156);
                if (var8_5) {
                    throw null;
                }
                ** GOTO lbl130
            }
            case 7: {
                var7_6 /* !! */  = (int)h.bmsy("bnbm", bmsv(int ), (int)157);
                if (!var8_5) break;
                throw null;
            }
lbl113:
            // 2 sources

            case 8: {
                var7_6 /* !! */  = (int)h.bmsy("bnbn", bmsv(int ), (int)158);
                if (var8_5) {
                    throw null;
                }
                ** GOTO lbl134
            }
            case 9: {
                var7_6 /* !! */  = (int)h.bmsy("bnbo", bmsv(int ), (int)159);
                if (!var8_5) ** GOTO lbl95
                throw null;
            }
lbl122:
            // 4 sources

            case 10: {
                var7_6 /* !! */  = (int)h.bmsy("bnbp", bmsv(int ), (int)160);
                if (!var8_5) ** GOTO lbl113
                throw null;
            }
            case 11: {
                var7_6 /* !! */  = (int)h.bmsy("bnbq", bmsv(int ), (int)161);
                if (!var8_5) break;
                throw null;
            }
lbl130:
            // 3 sources

            case 12: {
                var7_6 /* !! */  = (int)h.bmsy("bnbr", bmsv(int ), (int)162);
                if (!var8_5) ** GOTO lbl122
                throw null;
            }
lbl134:
            // 2 sources

            case 13: {
                var7_6 /* !! */  = (int)h.bmsy("bnbs", bmsv(int ), (int)163);
                if (!var8_5) ** GOTO lbl104
                throw null;
            }
            case 14: 
        }
        var7_6 /* !! */  = (int)h.bmsy("bnbt", bmsv(int ), (int)164);
        ** while (!var8_5)
lbl141:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void bngj() {
        h.bmsx[0] = 1695687148;
        h.bmsx[1] = -517561905;
        h.bmsx[2] = 18675132;
        h.bmsx[3] = -2034043669;
        h.bmsx[4] = -1389969789;
        h.bmsx[5] = 1992041904;
        h.bmsx[6] = 466466578;
        h.bmsx[7] = 1586742258;
        h.bmsx[8] = -1308764322;
        h.bmsx[9] = 1379669257;
        h.bmsx[10] = 1144556575;
        h.bmsx[11] = 1917427696;
        h.bmsx[12] = -1267490322;
        h.bmsx[13] = 1307690506;
        h.bmsx[14] = -316845156;
        h.bmsx[15] = -1475195466;
        h.bmsx[16] = 1043922827;
        h.bmsx[17] = -1862532449;
        h.bmsx[18] = -190044190;
        h.bmsx[19] = -1859052023;
        h.bmsx[20] = 305063955;
        h.bmsx[21] = 1959033212;
        h.bmsx[22] = -350529547;
        h.bmsx[23] = 1500204936;
        h.bmsx[24] = 2139560518;
        h.bmsx[25] = 385413496;
        h.bmsx[26] = -1076163176;
        h.bmsx[27] = 1398211185;
        h.bmsx[28] = -316573340;
        h.bmsx[29] = -353318824;
        h.bmsx[30] = -1022849036;
        h.bmsx[31] = 1102948461;
        h.bmsx[32] = 942608125;
        h.bmsx[33] = 430971415;
        h.bmsx[34] = -2033632716;
        h.bmsx[35] = -206619198;
        h.bmsx[36] = 1051246694;
        h.bmsx[37] = -876424593;
        h.bmsx[38] = 958145093;
        h.bmsx[39] = 211381032;
        h.bmsx[40] = -1150159245;
        h.bmsx[41] = -1780316042;
        h.bmsx[42] = -896454499;
        h.bmsx[43] = 960561520;
        h.bmsx[44] = 1707573957;
        h.bmsx[45] = 695837441;
        h.bmsx[46] = 73299733;
        h.bmsx[47] = -1087627112;
        h.bmsx[48] = -1627112912;
        h.bmsx[49] = -1735033017;
        h.bmsx[50] = 1832278458;
        h.bmsx[51] = -430115574;
        h.bmsx[52] = 1267271336;
        h.bmsx[53] = -2049915846;
        h.bmsx[54] = 314574819;
        h.bmsx[55] = -1558354877;
        h.bmsx[56] = 344938281;
        h.bmsx[57] = -1114175383;
        h.bmsx[58] = -1891712956;
        h.bmsx[59] = -1649628842;
        h.bmsx[60] = -727741562;
        h.bmsx[61] = 1645235351;
        h.bmsx[62] = 19610776;
        h.bmsx[63] = 539499597;
        h.bmsx[64] = -1232142493;
        h.bmsx[65] = -263675497;
        h.bmsx[66] = -1773520500;
        h.bmsx[67] = 1188739816;
        h.bmsx[68] = -2018334854;
        h.bmsx[69] = -35057098;
        h.bmsx[70] = 552787667;
        h.bmsx[71] = 1233091890;
        h.bmsx[72] = 982669655;
        h.bmsx[73] = -1549311525;
        h.bmsx[74] = 563787382;
        h.bmsx[75] = -447282131;
        h.bmsx[76] = -1002733783;
        h.bmsx[77] = -1501751866;
        h.bmsx[78] = 1212659396;
        h.bmsx[79] = -1265168723;
        h.bmsx[80] = -202722083;
        h.bmsx[81] = -730902884;
        h.bmsx[82] = -2134607993;
        h.bmsx[83] = 1818351748;
        h.bmsx[84] = 34185832;
        h.bmsx[85] = 373044770;
        h.bmsx[86] = 1925580408;
        h.bmsx[87] = -592328737;
        h.bmsx[88] = -713054364;
        h.bmsx[89] = -246741687;
        h.bmsx[90] = 2117471987;
        h.bmsx[91] = -1383592721;
        h.bmsx[92] = -685167650;
        h.bmsx[93] = 529000042;
        h.bmsx[94] = 2144028910;
        h.bmsx[95] = -395110453;
        h.bmsx[96] = -1271747987;
        h.bmsx[97] = -1113245743;
        h.bmsx[98] = -297442521;
        h.bmsx[99] = 1064044692;
    }

    private static /* synthetic */ void bngk() {
        h.bmsx[100] = 374458247;
        h.bmsx[101] = 1607463551;
        h.bmsx[102] = 1950407836;
        h.bmsx[103] = -262636071;
        h.bmsx[104] = 497551887;
        h.bmsx[105] = 696072491;
        h.bmsx[106] = 283803968;
        h.bmsx[107] = 24143165;
        h.bmsx[108] = 549456177;
        h.bmsx[109] = 450057098;
        h.bmsx[110] = -98468373;
        h.bmsx[111] = 614314583;
        h.bmsx[112] = -858840206;
        h.bmsx[113] = -175072816;
        h.bmsx[114] = 538066833;
        h.bmsx[115] = -1058660391;
        h.bmsx[116] = 1886589698;
        h.bmsx[117] = -126413707;
        h.bmsx[118] = -331116106;
        h.bmsx[119] = -1085448461;
        h.bmsx[120] = -691801260;
        h.bmsx[121] = -747908036;
        h.bmsx[122] = -139284447;
        h.bmsx[123] = -1231005447;
        h.bmsx[124] = 1158188016;
        h.bmsx[125] = 2078623344;
        h.bmsx[126] = 1144143823;
        h.bmsx[127] = -981440702;
        h.bmsx[128] = -1545341817;
        h.bmsx[129] = 1362364784;
        h.bmsx[130] = -2146737366;
        h.bmsx[131] = -837835437;
        h.bmsx[132] = -1431247289;
        h.bmsx[133] = 1860568430;
        h.bmsx[134] = -283157125;
        h.bmsx[135] = 957202749;
        h.bmsx[136] = -1439674767;
        h.bmsx[137] = 1228655987;
        h.bmsx[138] = 1706785180;
        h.bmsx[139] = -381227453;
        h.bmsx[140] = -940181977;
        h.bmsx[141] = 681872549;
        h.bmsx[142] = -1487449206;
        h.bmsx[143] = -1112210484;
        h.bmsx[144] = 2085476356;
        h.bmsx[145] = -1957537006;
        h.bmsx[146] = 1187696355;
        h.bmsx[147] = 463530813;
        h.bmsx[148] = 1375934910;
        h.bmsx[149] = 1859580462;
        h.bmsx[150] = -1176681117;
        h.bmsx[151] = 1767815033;
        h.bmsx[152] = 374430897;
        h.bmsx[153] = 1686378822;
        h.bmsx[154] = 1879665524;
        h.bmsx[155] = -1237836191;
        h.bmsx[156] = -1524818819;
        h.bmsx[157] = -1523670163;
        h.bmsx[158] = -1003267826;
        h.bmsx[159] = 1939306074;
        h.bmsx[160] = 1146325442;
        h.bmsx[161] = -1558261039;
        h.bmsx[162] = 210656214;
        h.bmsx[163] = 72927297;
        h.bmsx[164] = 756511382;
    }

    private static /* synthetic */ void bngm() {
        h.bmtm[0] = 6040009456278265236L;
        h.bmtm[1] = -1305653918322013403L;
        h.bmtm[2] = 5431989190258903793L;
        h.bmtm[3] = 6932293723815266201L;
        h.bmtm[4] = -684372151992421439L;
        h.bmtm[5] = -4109690487864710631L;
        h.bmtm[6] = -6509099882638422707L;
        h.bmtm[7] = 7887367570956206058L;
        h.bmtm[8] = 6207699613451322676L;
        h.bmtm[9] = -7430361012724130993L;
        h.bmtm[10] = 2667954811723898703L;
        h.bmtm[11] = 709061314383740851L;
        h.bmtm[12] = 8059062900325125132L;
        h.bmtm[13] = -6472532092499816909L;
        h.bmtm[14] = -6804057298447413922L;
        h.bmtm[15] = -7455564790269596430L;
        h.bmtm[16] = 172529743032435769L;
        h.bmtm[17] = -7685407567948629571L;
        h.bmtm[18] = -1242845228718639221L;
        h.bmtm[19] = -5398481024190805131L;
        h.bmtm[20] = 283901541793540009L;
        h.bmtm[21] = -4075803383298330729L;
        h.bmtm[22] = -8173614519741463859L;
        h.bmtm[23] = 8830917188680417680L;
        h.bmtm[24] = -5043470791819843713L;
        h.bmtm[25] = -3638569760827339292L;
        h.bmtm[26] = -7511678069093132356L;
        h.bmtm[27] = -9213817312694373160L;
        h.bmtm[28] = 3544991659328454632L;
        h.bmtm[29] = 3643664704859210434L;
        h.bmtm[30] = 2236122565501275477L;
        h.bmtm[31] = 2165406501304414042L;
        h.bmtm[32] = 5298749855982162723L;
        h.bmtm[33] = -6778829083786994638L;
        h.bmtm[34] = 6126281891919117482L;
        h.bmtm[35] = -5846791766972609417L;
        h.bmtm[36] = -2548538354216365574L;
        h.bmtm[37] = 1450751999163210495L;
        h.bmtm[38] = -191340347881814579L;
        h.bmtm[39] = -2495072473187840709L;
        h.bmtm[40] = 3993146664750713556L;
        h.bmtm[41] = 7694071116084111911L;
        h.bmtm[42] = 8116897756336996785L;
        h.bmtm[43] = 2399680984677054531L;
        h.bmtm[44] = 4307760663210648314L;
        h.bmtm[45] = -900706403557958281L;
        h.bmtm[46] = 8526081278987252064L;
        h.bmtm[47] = -7867592039560638442L;
        h.bmtm[48] = 2272270603830714068L;
        h.bmtm[49] = -3754669027801880240L;
        h.bmtm[50] = 3499153140172746703L;
        h.bmtm[51] = -4662978434006520710L;
        h.bmtm[52] = -1857690932360716865L;
        h.bmtm[53] = -5289610156331769275L;
        h.bmtm[54] = 7342783693318824200L;
        h.bmtm[55] = -3891303725220639734L;
        h.bmtm[56] = 3272224623522280828L;
        h.bmtm[57] = -2399249666708707341L;
        h.bmtm[58] = -3230022562328707524L;
        h.bmtm[59] = 1784415166433486667L;
        h.bmtm[60] = 5364380987925508325L;
    }

    private static /* synthetic */ long bmtk(int n2) {
        return bmtl[n2] ^ bmtm[n2];
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public h(List<T> list) {
        block6: {
            int n2 = b;
            this(list, (int)h.bmsy("bmsz", bmsv(int ), (int)0));
            if (n2 == 0) return;
            switch (n2) {
                default: {
                    return;
                }
                case 0: {
                    break block6;
                }
                case 1: {
                    CallSite callSite = h.bmsy("bmtb", bmsv(int ), (int)2);
                    break;
                }
                case 2: 
            }
            CallSite callSite = h.bmsy("bmtc", bmsv(int ), (int)3);
        }
        while (true) {
            CallSite callSite = h.bmsy("bmta", bmsv(int ), (int)1);
        }
    }

    public static /* synthetic */ CallSite bmsy(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void bnbv() {
        h.bmsw[100] = 374458242;
        h.bmsw[101] = 1607463514;
        h.bmsw[102] = 1950407832;
        h.bmsw[103] = -262636092;
        h.bmsw[104] = 497551910;
        h.bmsw[105] = 696072504;
        h.bmsw[106] = 283803973;
        h.bmsw[107] = 24143149;
        h.bmsw[108] = 549456172;
        h.bmsw[109] = 450057088;
        h.bmsw[110] = -98468384;
        h.bmsw[111] = 614314574;
        h.bmsw[112] = -858840215;
        h.bmsw[113] = -175072827;
        h.bmsw[114] = 538066870;
        h.bmsw[115] = -1058660407;
        h.bmsw[116] = 1886589739;
        h.bmsw[117] = -126413721;
        h.bmsw[118] = -331116108;
        h.bmsw[119] = -1085448495;
        h.bmsw[120] = -691801218;
        h.bmsw[121] = -747908061;
        h.bmsw[122] = -139284436;
        h.bmsw[123] = -1231005468;
        h.bmsw[124] = 1158187994;
        h.bmsw[125] = 2078623352;
        h.bmsw[126] = 1144143831;
        h.bmsw[127] = -981440690;
        h.bmsw[128] = -1545341800;
        h.bmsw[129] = 1362364799;
        h.bmsw[130] = -2146737408;
        h.bmsw[131] = -837835438;
        h.bmsw[132] = -1431247273;
        h.bmsw[133] = 1860568440;
        h.bmsw[134] = -283157133;
        h.bmsw[135] = 957202747;
        h.bmsw[136] = -1439674762;
        h.bmsw[137] = 1228655988;
        h.bmsw[138] = 1706785173;
        h.bmsw[139] = -381227426;
        h.bmsw[140] = -940181966;
        h.bmsw[141] = 681872550;
        h.bmsw[142] = 1487449205;
        h.bmsw[143] = 261114542;
        h.bmsw[144] = -2085476357;
        h.bmsw[145] = 1503287439;
        h.bmsw[146] = -1187696356;
        h.bmsw[147] = -1967281545;
        h.bmsw[148] = -1375934911;
        h.bmsw[149] = -1311289254;
        h.bmsw[150] = -1176681118;
        h.bmsw[151] = 1767815032;
        h.bmsw[152] = 374430903;
        h.bmsw[153] = 1686378820;
        h.bmsw[154] = 1879665523;
        h.bmsw[155] = -1237836190;
        h.bmsw[156] = -1524818826;
        h.bmsw[157] = -1523670161;
        h.bmsw[158] = -1003267826;
        h.bmsw[159] = 1939306067;
        h.bmsw[160] = 1146325444;
        h.bmsw[161] = -1558261028;
        h.bmsw[162] = 210656221;
        h.bmsw[163] = 72927303;
        h.bmsw[164] = 756511383;
    }

    private static /* synthetic */ int bmsv(int n2) {
        return bmsw[n2] ^ bmsx[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void display(Runnable var1_1, Function<T, class_5250> var2_2, String var3_3) {
        var10_4 = h.c;
        var9_5 /* !! */  = h.b;
        var8_6 = h.a;
        if (var10_4) {
            throw null;
lbl6:
            // 17 sources

            return;
        }
        if (var8_6 || var8_6) ** GOTO lbl6
        if (var9_5 /* !! */  == 0) ** GOTO lbl-1000
        switch (var9_5 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                var4_7 = g.getInstance();
                if (var8_6 || var8_6) ** GOTO lbl6
                if (var1_1 == null) ** GOTO lbl18
                if (var8_6 || var8_6) ** GOTO lbl6
                var1_1.run();
                if (var8_6) ** GOTO lbl6
lbl18:
                // 2 sources

                if (var8_6 || var8_6) ** GOTO lbl6
                var5_8 = this.getCurrentPageItems().iterator();
                if (var8_6) ** GOTO lbl6
                do {
                    if (var8_6 || var8_6) ** GOTO lbl6
                    if (!var5_8.hasNext()) ** GOTO lbl33
                    if (var8_6) ** GOTO lbl6
                    var6_9 = var5_8.next();
                    if (var8_6 || var8_6) ** GOTO lbl6
                    var7_10 = var2_2.apply(var6_9);
                    if (var8_6 || var8_6) ** GOTO lbl6
                    var4_7.sendRaw((class_2561)var7_10);
                    if (var8_6 || var8_6) ** GOTO lbl6
                } while (!var10_4);
                throw null;
lbl33:
                // 1 sources

                if (var8_6 || var8_6) ** GOTO lbl6
                if (this.getTotalPages() <= h.bmsy("bmxl", bmsv(int ), (int)61)) ** GOTO lbl41
                if (var8_6 || var8_6) ** GOTO lbl6
                this.displayNavigation(var4_7, var3_3);
                if (var8_6) ** GOTO lbl6
                if (var10_4) {
                    throw null;
                }
                ** GOTO lbl44
lbl41:
                // 1 sources

                if (var8_6 || var8_6) ** GOTO lbl6
                var4_7.sendRaw((class_2561)class_2561.method_43470((String)o.getLine()));
                if (var8_6) ** GOTO lbl6
lbl44:
                // 2 sources

                if (!var8_6 && !var8_6) ** break;
                ** continue;
                return;
            }
lbl47:
            // 2 sources

            case 0: {
                var9_5 /* !! */  = (int)h.bmsy("bmxm", bmsv(int ), (int)62);
                if (var10_4) {
                    throw null;
                }
                ** GOTO lbl143
            }
lbl52:
            // 2 sources

            case 1: {
                var9_5 /* !! */  = (int)h.bmsy("bmxn", bmsv(int ), (int)63);
                if (var10_4) {
                    throw null;
                }
                ** GOTO lbl91
            }
            case 2: {
                var9_5 /* !! */  = (int)h.bmsy("bmxo", bmsv(int ), (int)64);
                if (var10_4) {
                    throw null;
                }
                ** GOTO lbl111
            }
lbl62:
            // 2 sources

            case 3: {
                var9_5 /* !! */  = (int)h.bmsy("bmxp", bmsv(int ), (int)65);
                if (var10_4) {
                    throw null;
                }
                ** GOTO lbl91
            }
lbl67:
            // 2 sources

            case 4: {
                var9_5 /* !! */  = (int)h.bmsy("bmxq", bmsv(int ), (int)66);
                if (var10_4) {
                    throw null;
                }
                ** GOTO lbl120
            }
lbl72:
            // 2 sources

            case 5: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var9_5 /* !! */  = (int)h.bmsy("bmxr", bmsv(int ), (int)67);
                    if (!var10_4) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 6: {
                var9_5 /* !! */  = (int)h.bmsy("bmxs", bmsv(int ), (int)68);
                if (var10_4) {
                    throw null;
                }
                ** GOTO lbl111
            }
            case 7: {
                var9_5 /* !! */  = (int)h.bmsy("bmxt", bmsv(int ), (int)69);
                if (var10_4) {
                    throw null;
                }
                ** GOTO lbl167
            }
lbl87:
            // 2 sources

            case 8: {
                var9_5 /* !! */  = (int)h.bmsy("bmxu", bmsv(int ), (int)70);
                if (!var10_4) ** GOTO lbl47
                throw null;
            }
lbl91:
            // 3 sources

            case 9: {
                var9_5 /* !! */  = (int)h.bmsy("bmxv", bmsv(int ), (int)71);
                if (var10_4) {
                    throw null;
                }
                ** GOTO lbl143
            }
            case 10: {
                var9_5 /* !! */  = (int)h.bmsy("bmxw", bmsv(int ), (int)72);
                if (var10_4) {
                    throw null;
                }
                ** GOTO lbl134
            }
lbl101:
            // 2 sources

            case 11: {
                var9_5 /* !! */  = (int)h.bmsy("bmxx", bmsv(int ), (int)73);
                if (var10_4) {
                    throw null;
                }
                ** GOTO lbl129
            }
lbl106:
            // 5 sources

            case 12: {
                var9_5 /* !! */  = (int)h.bmsy("bmxy", bmsv(int ), (int)74);
                if (var10_4) {
                    throw null;
                }
                ** GOTO lbl120
            }
lbl111:
            // 3 sources

            case 13: {
                var9_5 /* !! */  = (int)h.bmsy("bmxz", bmsv(int ), (int)75);
                if (var10_4) {
                    throw null;
                }
                ** GOTO lbl183
            }
lbl116:
            // 2 sources

            case 14: {
                var9_5 /* !! */  = (int)h.bmsy("bmya", bmsv(int ), (int)76);
                if (!var10_4) ** GOTO lbl87
                throw null;
            }
lbl120:
            // 4 sources

            case 15: {
                var9_5 /* !! */  = (int)h.bmsy("bmyb", bmsv(int ), (int)77);
                if (!var10_4) ** GOTO lbl106
                throw null;
            }
            case 16: {
                var9_5 /* !! */  = (int)h.bmsy("bmyc", bmsv(int ), (int)78);
                if (var10_4) {
                    throw null;
                }
                ** GOTO lbl151
            }
lbl129:
            // 2 sources

            case 17: {
                var9_5 /* !! */  = (int)h.bmsy("bmyd", bmsv(int ), (int)79);
                if (var10_4) {
                    throw null;
                }
                ** GOTO lbl155
            }
lbl134:
            // 3 sources

            case 18: {
                var9_5 /* !! */  = (int)h.bmsy("bmye", bmsv(int ), (int)80);
                if (!var10_4) ** GOTO lbl120
                throw null;
            }
            case 19: {
                var9_5 /* !! */  = (int)h.bmsy("bmyf", bmsv(int ), (int)81);
                if (var10_4) {
                    throw null;
                }
                ** GOTO lbl175
            }
lbl143:
            // 4 sources

            case 20: {
                var9_5 /* !! */  = (int)h.bmsy("bmyg", bmsv(int ), (int)82);
                if (!var10_4) ** GOTO lbl52
                throw null;
            }
            case 21: {
                var9_5 /* !! */  = (int)h.bmsy("bmyh", bmsv(int ), (int)83);
                if (!var10_4) ** GOTO lbl106
                throw null;
            }
lbl151:
            // 2 sources

            case 22: {
                var9_5 /* !! */  = (int)h.bmsy("bmyi", bmsv(int ), (int)84);
                if (!var10_4) ** GOTO lbl143
                throw null;
            }
lbl155:
            // 2 sources

            case 23: {
                var9_5 /* !! */  = (int)h.bmsy("bmyj", bmsv(int ), (int)85);
                if (!var10_4) ** GOTO lbl106
                throw null;
            }
            case 24: {
                var9_5 /* !! */  = (int)h.bmsy("bmyk", bmsv(int ), (int)86);
                if (!var10_4) ** GOTO lbl62
                throw null;
            }
            case 25: {
                var9_5 /* !! */  = (int)h.bmsy("bmyl", bmsv(int ), (int)87);
                if (!var10_4) ** GOTO lbl116
                throw null;
            }
lbl167:
            // 2 sources

            case 26: {
                var9_5 /* !! */  = (int)h.bmsy("bmym", bmsv(int ), (int)88);
                if (!var10_4) ** GOTO lbl67
                throw null;
            }
            case 27: {
                var9_5 /* !! */  = (int)h.bmsy("bmyn", bmsv(int ), (int)89);
                if (!var10_4) ** GOTO lbl101
                throw null;
            }
lbl175:
            // 2 sources

            case 28: {
                var9_5 /* !! */  = (int)h.bmsy("bmyo", bmsv(int ), (int)90);
                if (!var10_4) ** GOTO lbl134
                throw null;
            }
            case 29: {
                var9_5 /* !! */  = (int)h.bmsy("bmyp", bmsv(int ), (int)91);
                if (!var10_4) ** GOTO lbl72
                throw null;
            }
lbl183:
            // 2 sources

            case 30: {
                var9_5 /* !! */  = (int)h.bmsy("bmyq", bmsv(int ), (int)92);
                if (!var10_4) ** GOTO lbl106
                throw null;
            }
            case 31: 
        }
        var9_5 /* !! */  = (int)h.bmsy("bmyr", bmsv(int ), (int)93);
        ** while (!var10_4)
lbl190:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void bnbu() {
        h.bmsw[0] = 1695687140;
        h.bmsw[1] = -517561907;
        h.bmsw[2] = 18675132;
        h.bmsw[3] = -2034043669;
        h.bmsw[4] = -1389969790;
        h.bmsw[5] = 1992041905;
        h.bmsw[6] = 466466582;
        h.bmsw[7] = 1586742258;
        h.bmsw[8] = -1308764326;
        h.bmsw[9] = 1379669256;
        h.bmsw[10] = 1144556572;
        h.bmsw[11] = -1917427697;
        h.bmsw[12] = 260816004;
        h.bmsw[13] = 527406382;
        h.bmsw[14] = -316845155;
        h.bmsw[15] = 1475195465;
        h.bmsw[16] = 1002203848;
        h.bmsw[17] = 1862532448;
        h.bmsw[18] = 1557014559;
        h.bmsw[19] = -1859052023;
        h.bmsw[20] = 305063953;
        h.bmsw[21] = 1959033213;
        h.bmsw[22] = -350529548;
        h.bmsw[23] = -1500204937;
        h.bmsw[24] = 480437257;
        h.bmsw[25] = -385413497;
        h.bmsw[26] = 1636881569;
        h.bmsw[27] = -1398211186;
        h.bmsw[28] = 637093313;
        h.bmsw[29] = -353318823;
        h.bmsw[30] = 1022849035;
        h.bmsw[31] = -173019824;
        h.bmsw[32] = -942608126;
        h.bmsw[33] = -248244564;
        h.bmsw[34] = 2033632715;
        h.bmsw[35] = -1109416049;
        h.bmsw[36] = -1051246695;
        h.bmsw[37] = -1763498290;
        h.bmsw[38] = 958145089;
        h.bmsw[39] = 211381036;
        h.bmsw[40] = -1150159241;
        h.bmsw[41] = -1780316043;
        h.bmsw[42] = -896454503;
        h.bmsw[43] = 960561523;
        h.bmsw[44] = 1707573957;
        h.bmsw[45] = 695837441;
        h.bmsw[46] = -73299734;
        h.bmsw[47] = 1190089108;
        h.bmsw[48] = 1627112911;
        h.bmsw[49] = -866237199;
        h.bmsw[50] = 1832278459;
        h.bmsw[51] = 430115573;
        h.bmsw[52] = 1585995866;
        h.bmsw[53] = 2049915845;
        h.bmsw[54] = 1815470480;
        h.bmsw[55] = -1558354874;
        h.bmsw[56] = 344938284;
        h.bmsw[57] = -1114175379;
        h.bmsw[58] = -1891712956;
        h.bmsw[59] = -1649628842;
        h.bmsw[60] = -727741565;
        h.bmsw[61] = 1645235350;
        h.bmsw[62] = 19610775;
        h.bmsw[63] = 539499588;
        h.bmsw[64] = -1232142484;
        h.bmsw[65] = -263675510;
        h.bmsw[66] = -1773520488;
        h.bmsw[67] = 1188739812;
        h.bmsw[68] = -2018334860;
        h.bmsw[69] = -35057095;
        h.bmsw[70] = 552787678;
        h.bmsw[71] = 1233091890;
        h.bmsw[72] = 982669648;
        h.bmsw[73] = -1549311536;
        h.bmsw[74] = 563787361;
        h.bmsw[75] = -447282123;
        h.bmsw[76] = -1002733769;
        h.bmsw[77] = -1501751853;
        h.bmsw[78] = 1212659400;
        h.bmsw[79] = -1265168729;
        h.bmsw[80] = -202722091;
        h.bmsw[81] = -730902886;
        h.bmsw[82] = -2134607971;
        h.bmsw[83] = 1818351745;
        h.bmsw[84] = 34185850;
        h.bmsw[85] = 373044776;
        h.bmsw[86] = 1925580399;
        h.bmsw[87] = -592328752;
        h.bmsw[88] = -713054354;
        h.bmsw[89] = -246741665;
        h.bmsw[90] = 2117471997;
        h.bmsw[91] = -1383592735;
        h.bmsw[92] = -685167672;
        h.bmsw[93] = 529000058;
        h.bmsw[94] = 2144028911;
        h.bmsw[95] = -395110454;
        h.bmsw[96] = -1271747988;
        h.bmsw[97] = -1113245744;
        h.bmsw[98] = -297442522;
        h.bmsw[99] = 1064044688;
    }
}

