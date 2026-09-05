/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMultimap
 *  com.google.common.collect.Multimap
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.properties.Property
 *  com.mojang.authlib.properties.PropertyMap
 *  net.minecraft.class_1799
 *  net.minecraft.class_1802
 *  net.minecraft.class_2487
 *  net.minecraft.class_2499
 *  net.minecraft.class_9279
 *  net.minecraft.class_9296
 *  net.minecraft.class_9334
 */
package ruhack.phobia;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import com.mojang.authlib.properties.PropertyMap;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2487;
import net.minecraft.class_2499;
import net.minecraft.class_9279;
import net.minecraft.class_9296;
import net.minecraft.class_9334;
import ruhack.phobia.nk$LegacyTexture;

public final class nk {
    public static final int b;
    static final long oh = 4857636765063247932L;
    public static final boolean c;
    private static long[] hfkm;
    private static long[] hfkn;
    private static int[] hfio;
    private static final Map<String, class_9296> CACHE;
    public static final boolean a;
    private static int[] hfin;

    static {
        hfin = new int[250];
        hfio = new int[250];
        nk.hgjp();
        nk.hgkh();
        nk.hgkw();
        nk.hgky();
        nk.hgls();
        nk.hgmk();
        hfkm = new long[116];
        hfkn = new long[116];
        nk.hgmw();
        nk.hgnn();
        nk.hgno();
        nk.hgob();
        CACHE = new ConcurrentHashMap<String, class_9296>();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static nk$LegacyTexture textureFromList(class_2499 var0) {
        block38: {
            block39: {
                v0 /* !! */  = nk.oh;
                if (true) ** GOTO lbl5
                block26: while (true) {
                    v0 /* !! */  = (long)(nk.hfip("hgbj", hfkl(int ), (int)71) - nk.hfip("hgaz", hfkl(int ), (int)70));
lbl5:
                    // 2 sources

                    switch ((int)v0 /* !! */ ) {
                        case -1518798788: {
                            break block26;
                        }
                        case -72728630: {
                            continue block26;
                        }
                    }
                    break;
                }
                var5_1 = nk.c;
                v1 /* !! */  = nk.oh;
                if (true) ** GOTO lbl15
                block27: while (true) {
                    v1 /* !! */  = (long)(v2 - nk.hfip("hgbl", hfkl(int ), (int)72));
lbl15:
                    // 2 sources

                    switch ((int)v1 /* !! */ ) {
                        case -1518798788: {
                            break block27;
                        }
                        case -454799021: {
                            v2 = nk.hfip("hgbm", hfkl(int ), (int)73);
                            continue block27;
                        }
                        case 562545290: {
                            v2 = nk.hfip("hgbo", hfkl(int ), (int)74);
                            continue block27;
                        }
                        case 1969195443: {
                            v2 = nk.hfip("hgbp", hfkl(int ), (int)75);
                            continue block27;
                        }
                    }
                    break;
                }
                var4_2 = nk.b;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_0 = nk.oh - nk.hfip("hgbr", hfkl(int ), (int)76)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == nk.hfip("hgbw", hfim(int ), (int)193)) break;
                    v3 /* !! */  = (long)nk.hfip("hgbx", hfim(int ), (int)194);
                }
                var3_3 = nk.a;
                if (var5_1) {
                    throw null;
lbl37:
                    // 11 sources

                    return null;
                }
                if (var3_3 || var3_3) ** GOTO lbl37
                if (var0 != null) break block39;
                if (var3_3) ** GOTO lbl37
                return null;
            }
            if (var3_3 || var3_3) ** GOTO lbl37
            var1_4 = nk.hfip("hgca", hfim(int ), (int)195);
            if (var3_3) ** GOTO lbl37
            do {
                block40: {
                    if (var3_3 || var3_3) ** GOTO lbl37
                    v4 /* !! */  = nk.oh;
                    if (true) ** GOTO lbl53
                    block31: while (true) {
                        v4 /* !! */  = (long)(v5 - nk.hfip("hgcd", hfkl(int ), (int)77));
lbl53:
                        // 2 sources

                        switch ((int)v4 /* !! */ ) {
                            case -1518798788: {
                                break block31;
                            }
                            case -930328615: {
                                v5 = nk.hfip("hgce", hfkl(int ), (int)78);
                                continue block31;
                            }
                            case 1815319802: {
                                v5 = nk.hfip("hgcf", hfkl(int ), (int)79);
                                continue block31;
                            }
                        }
                        break;
                    }
                    if (var1_4 >= var0.size()) break block38;
                    if (var3_3 || var3_3) ** GOTO lbl37
                    v6 /* !! */  = nk.oh;
                    if (true) ** GOTO lbl68
                    block32: while (true) {
                        v6 /* !! */  = (long)(v7 - nk.hfip("hgcg", hfkl(int ), (int)80));
lbl68:
                        // 2 sources

                        switch ((int)v6 /* !! */ ) {
                            case -1518798788: {
                                break block32;
                            }
                            case 12471641: {
                                v7 = nk.hfip("hgcq", hfkl(int ), (int)81);
                                continue block32;
                            }
                            case 1960984252: {
                                v7 = nk.hfip("hgct", hfkl(int ), (int)82);
                                continue block32;
                            }
                        }
                        break;
                    }
                    v8 = var0.method_10602((int)var1_4);
                    while (true) {
                        if ((v9 /* !! */  = (cfr_temp_1 = nk.oh - nk.hfip("hgcw", hfkl(int ), (int)83)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                            continue;
                        }
                        if (v9 /* !! */  == nk.hfip("hgcx", hfim(int ), (int)196)) break;
                        v9 /* !! */  = (long)nk.hfip("hgcy", hfim(int ), (int)197);
                    }
                    v10 = v8.orElse(null);
                    v11 /* !! */  = nk.oh;
                    if (true) ** GOTO lbl89
                    block34: while (true) {
                        v11 /* !! */  = (long)(v12 - nk.hfip("hgdf", hfkl(int ), (int)84));
lbl89:
                        // 2 sources

                        switch ((int)v11 /* !! */ ) {
                            case -1518798788: {
                                break block34;
                            }
                            case -1029769939: {
                                v12 = nk.hfip("hgdg", hfkl(int ), (int)85);
                                continue block34;
                            }
                            case -947684591: {
                                v12 = nk.hfip("hgdi", hfkl(int ), (int)86);
                                continue block34;
                            }
                            case -941267882: {
                                v12 = nk.hfip("hgdk", hfkl(int ), (int)87);
                                continue block34;
                            }
                        }
                        break;
                    }
                    var2_5 = nk.textureFromCompound(v10);
                    if (var3_3 || var3_3) ** GOTO lbl37
                    if (var2_5 == null) break block40;
                    if (var3_3) ** GOTO lbl37
                    return var2_5;
                }
                if (var3_3 || var3_3) ** GOTO lbl37
                ++var1_4;
                if (var3_3) ** GOTO lbl37
            } while (!var5_1);
            throw null;
        }
        if (!var3_3 && !var3_3) ** break;
        ** while (true)
        return null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static class_9296 get(class_1799 var0) {
        block99: {
            block98: {
                block97: {
                    block96: {
                        block95: {
                            var10_1 = nk.c;
                            var9_2 /* !! */  = nk.b;
                            var8_3 = nk.a;
                            if (var10_1) {
                                throw null;
lbl6:
                                // 27 sources

                                return null;
                            }
                            if (var8_3 || var8_3) ** GOTO lbl6
                            if (var0 == null) break block95;
                            if (var8_3) ** GOTO lbl6
                            if (var0.method_31574(class_1802.field_8575)) break block96;
                            if (var8_3) ** GOTO lbl6
                        }
                        if (var8_3 || var8_3) ** GOTO lbl6
                        return null;
                    }
                    if (var8_3 || var8_3) ** GOTO lbl6
                    var1_4 = (class_9279)var0.method_58694(class_9334.field_49628);
                    if (var8_3 || var8_3) ** GOTO lbl6
                    if (var1_4 != null) break block97;
                    if (var8_3) ** GOTO lbl6
                    return null;
                }
                if (var8_3 || var8_3) ** GOTO lbl6
                var2_5 = var1_4.method_57461();
                if (var8_3 || var8_3) ** GOTO lbl6
                var3_6 = nk.firstCompound(var2_5, new String[]{"SkullOwner", "skull_owner", "Owner", "owner", "minecraft:profile", "profile"});
                if (var8_3 || var8_3) ** GOTO lbl6
                if (var3_6 != null) break block98;
                if (var8_3) ** GOTO lbl6
                var3_6 = var2_5;
                if (var8_3) ** GOTO lbl6
            }
            if (var8_3 || var8_3) ** GOTO lbl6
            var4_7 = nk.findTexture(var3_6);
            if (var8_3 || var8_3) ** GOTO lbl6
            if (var4_7 != null) break block99;
            if (var8_3) ** GOTO lbl6
            if (var3_6 == var2_5) break block99;
            if (var8_3) ** GOTO lbl6
            var4_7 = nk.findTexture(var2_5);
            if (var8_3) ** GOTO lbl6
        }
        if (var8_3) ** GOTO lbl6
        if (var9_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var9_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var8_3) ** GOTO lbl6
                if (var4_7 == null) ** GOTO lbl53
                if (var8_3) ** GOTO lbl6
                if (!var4_7.value().isBlank()) ** GOTO lbl55
                if (var8_3) ** GOTO lbl6
lbl53:
                // 2 sources

                if (var8_3 || var8_3) ** GOTO lbl6
                return null;
lbl55:
                // 1 sources

                if (var8_3 || var8_3) ** GOTO lbl6
                var5_8 = var4_7;
                if (var8_3 || var8_3) ** GOTO lbl6
                v0 = var5_8.value();
                if (var5_8.signature() == null) {
                    v1 = "";
                    if (var10_1) {
                        throw null;
                    }
                } else {
                    v1 = var5_8.signature();
                }
                var6_9 = v0 + "\u0000" + v1;
                if (var8_3) ** GOTO lbl6
                try {
                    if (var8_3) ** GOTO lbl6
                    return nk.CACHE.computeIfAbsent(var6_9, (Function<String, class_9296>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$get$0(ruhack.phobia.nk$LegacyTexture java.lang.String ), (Ljava/lang/String;)Lnet/minecraft/class_9296;)((nk$LegacyTexture)var5_8));
                }
                catch (RuntimeException var7_10) {
                    if (!var8_3 && !var8_3) ** break;
                    ** continue;
                    return null;
                }
            }
            case 0: {
                var9_2 /* !! */  = (int)nk.hfip("hfit", hfim(int ), (int)3);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl94
            }
lbl79:
            // 2 sources

            case 1: {
                var9_2 /* !! */  = (int)nk.hfip("hfiu", hfim(int ), (int)4);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl186
            }
lbl84:
            // 2 sources

            case 2: {
                var9_2 /* !! */  = (int)nk.hfip("hfiv", hfim(int ), (int)5);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl172
            }
lbl89:
            // 2 sources

            case 3: {
                var9_2 /* !! */  = (int)nk.hfip("hfiw", hfim(int ), (int)6);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl131
            }
lbl94:
            // 4 sources

            case 4: {
                var9_2 /* !! */  = (int)nk.hfip("hfix", hfim(int ), (int)7);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl148
            }
lbl99:
            // 2 sources

            case 5: {
                var9_2 /* !! */  = (int)nk.hfip("hfiy", hfim(int ), (int)8);
                if (var10_1) {
                    throw null;
                }
            }
lbl103:
            // 4 sources

            case 6: {
                do {
                    var9_2 /* !! */  = (int)nk.hfip("hfiz", hfim(int ), (int)9);
                } while (!var10_1);
                throw null;
            }
lbl108:
            // 2 sources

            case 7: {
                var9_2 /* !! */  = (int)nk.hfip("hfja", hfim(int ), (int)10);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl131
            }
            case 8: {
                var9_2 /* !! */  = (int)nk.hfip("hfjb", hfim(int ), (int)11);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl242
            }
            case 9: {
                var9_2 /* !! */  = (int)nk.hfip("hfjc", hfim(int ), (int)12);
                if (!var10_1) ** GOTO lbl94
                throw null;
            }
            case 10: {
                var9_2 /* !! */  = (int)nk.hfip("hfjd", hfim(int ), (int)13);
                if (!var10_1) ** GOTO lbl99
                throw null;
            }
            case 11: {
                var9_2 /* !! */  = (int)nk.hfip("hfje", hfim(int ), (int)14);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl212
            }
lbl131:
            // 4 sources

            case 12: {
                var9_2 /* !! */  = (int)nk.hfip("hfjf", hfim(int ), (int)15);
                if (var10_1) {
                    throw null;
                }
            }
            case 13: {
                var9_2 /* !! */  = (int)nk.hfip("hfjg", hfim(int ), (int)16);
                if (!var10_1) ** GOTO lbl108
                throw null;
            }
lbl139:
            // 2 sources

            case 14: {
                var9_2 /* !! */  = (int)nk.hfip("hfjh", hfim(int ), (int)17);
                if (!var10_1) ** GOTO lbl94
                throw null;
            }
            case 15: {
                var9_2 /* !! */  = (int)nk.hfip("hfji", hfim(int ), (int)18);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl186
            }
lbl148:
            // 3 sources

            case 16: {
                var9_2 /* !! */  = (int)nk.hfip("hfjj", hfim(int ), (int)19);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl208
            }
            case 17: {
                var9_2 /* !! */  = (int)nk.hfip("hfjk", hfim(int ), (int)20);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl190
            }
            case 18: {
                var9_2 /* !! */  = (int)nk.hfip("hfjl", hfim(int ), (int)21);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl190
            }
lbl163:
            // 2 sources

            case 19: {
                var9_2 /* !! */  = (int)nk.hfip("hfjm", hfim(int ), (int)22);
                if (!var10_1) ** GOTO lbl131
                throw null;
            }
lbl167:
            // 2 sources

            case 20: {
                var9_2 /* !! */  = (int)nk.hfip("hfjn", hfim(int ), (int)23);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl230
            }
lbl172:
            // 2 sources

            case 21: {
                var9_2 /* !! */  = (int)nk.hfip("hfjo", hfim(int ), (int)24);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl262
            }
lbl177:
            // 2 sources

            case 22: {
                do {
                    var9_2 /* !! */  = (int)nk.hfip("hfjp", hfim(int ), (int)25);
                } while (!var10_1);
                throw null;
            }
lbl182:
            // 2 sources

            case 23: {
                var9_2 /* !! */  = (int)nk.hfip("hfjq", hfim(int ), (int)26);
                if (!var10_1) ** GOTO lbl84
                throw null;
            }
lbl186:
            // 4 sources

            case 24: {
                var9_2 /* !! */  = (int)nk.hfip("hfjr", hfim(int ), (int)27);
                if (!var10_1) ** GOTO lbl148
                throw null;
            }
lbl190:
            // 5 sources

            case 25: {
                var9_2 /* !! */  = (int)nk.hfip("hfjs", hfim(int ), (int)28);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl250
            }
            case 26: {
                var9_2 /* !! */  = (int)nk.hfip("hfjt", hfim(int ), (int)29);
                if (!var10_1) ** GOTO lbl163
                throw null;
            }
            case 27: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var9_2 /* !! */  = (int)nk.hfip("hfju", hfim(int ), (int)30);
                    if (!var10_1) ** GOTO lbl182
                    throw null;
                }
            }
lbl204:
            // 2 sources

            case 28: {
                var9_2 /* !! */  = (int)nk.hfip("hfjv", hfim(int ), (int)31);
                if (!var10_1) ** GOTO lbl190
                throw null;
            }
lbl208:
            // 3 sources

            case 29: {
                var9_2 /* !! */  = (int)nk.hfip("hfjw", hfim(int ), (int)32);
                if (!var10_1) ** GOTO lbl139
                throw null;
            }
lbl212:
            // 2 sources

            case 30: {
                var9_2 /* !! */  = (int)nk.hfip("hfjx", hfim(int ), (int)33);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl221
            }
            case 31: {
                var9_2 /* !! */  = (int)nk.hfip("hfjy", hfim(int ), (int)34);
                if (!var10_1) ** GOTO lbl89
                throw null;
            }
lbl221:
            // 2 sources

            case 32: {
                var9_2 /* !! */  = (int)nk.hfip("hfjz", hfim(int ), (int)35);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl246
            }
            case 33: {
                var9_2 /* !! */  = (int)nk.hfip("hfka", hfim(int ), (int)36);
                if (!var10_1) ** GOTO lbl186
                throw null;
            }
lbl230:
            // 3 sources

            case 34: {
                var9_2 /* !! */  = (int)nk.hfip("hfkb", hfim(int ), (int)37);
                if (!var10_1) ** GOTO lbl177
                throw null;
            }
            case 35: {
                var9_2 /* !! */  = (int)nk.hfip("hfkc", hfim(int ), (int)38);
                if (!var10_1) ** GOTO lbl167
                throw null;
            }
            case 36: {
                var9_2 /* !! */  = (int)nk.hfip("hfkd", hfim(int ), (int)39);
                if (!var10_1) ** GOTO lbl204
                throw null;
            }
lbl242:
            // 2 sources

            case 37: {
                var9_2 /* !! */  = (int)nk.hfip("hfke", hfim(int ), (int)40);
                if (!var10_1) ** GOTO lbl79
                throw null;
            }
lbl246:
            // 2 sources

            case 38: {
                var9_2 /* !! */  = (int)nk.hfip("hfkf", hfim(int ), (int)41);
                if (!var10_1) ** GOTO lbl208
                throw null;
            }
lbl250:
            // 3 sources

            case 39: {
                var9_2 /* !! */  = (int)nk.hfip("hfkg", hfim(int ), (int)42);
                if (!var10_1) ** GOTO lbl190
                throw null;
            }
            case 40: {
                var9_2 /* !! */  = (int)nk.hfip("hfkh", hfim(int ), (int)43);
                if (!var10_1) ** GOTO lbl103
                throw null;
            }
            case 41: {
                var9_2 /* !! */  = (int)nk.hfip("hfki", hfim(int ), (int)44);
                if (!var10_1) ** GOTO lbl250
                throw null;
            }
lbl262:
            // 2 sources

            case 42: {
                var9_2 /* !! */  = (int)nk.hfip("hfkj", hfim(int ), (int)45);
                if (!var10_1) ** GOTO lbl230
                throw null;
            }
            case 43: 
        }
        var9_2 /* !! */  = (int)nk.hfip("hfkk", hfim(int ), (int)46);
        ** while (!var10_1)
lbl269:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void hgjp() {
        nk.hfin[0] = -1953469415;
        nk.hfin[1] = 1620097986;
        nk.hfin[2] = 2043960657;
        nk.hfin[3] = -308487595;
        nk.hfin[4] = -1010507208;
        nk.hfin[5] = 2010745634;
        nk.hfin[6] = -776305601;
        nk.hfin[7] = 328735699;
        nk.hfin[8] = -473446729;
        nk.hfin[9] = 279351748;
        nk.hfin[10] = 1043913149;
        nk.hfin[11] = 1500848059;
        nk.hfin[12] = 1215006447;
        nk.hfin[13] = 1509346714;
        nk.hfin[14] = -160184269;
        nk.hfin[15] = -722556881;
        nk.hfin[16] = -1999814926;
        nk.hfin[17] = 520641132;
        nk.hfin[18] = 1348026276;
        nk.hfin[19] = 1297190690;
        nk.hfin[20] = 319459649;
        nk.hfin[21] = 1512428414;
        nk.hfin[22] = 2133313043;
        nk.hfin[23] = 1190274845;
        nk.hfin[24] = -239444602;
        nk.hfin[25] = -1726361074;
        nk.hfin[26] = -24040100;
        nk.hfin[27] = 17940507;
        nk.hfin[28] = -1982859067;
        nk.hfin[29] = 1795253433;
        nk.hfin[30] = -492620126;
        nk.hfin[31] = -112508060;
        nk.hfin[32] = -2132358044;
        nk.hfin[33] = -1854960159;
        nk.hfin[34] = 645965415;
        nk.hfin[35] = 765008702;
        nk.hfin[36] = 1668186005;
        nk.hfin[37] = -1822351363;
        nk.hfin[38] = 1268353984;
        nk.hfin[39] = -1737107380;
        nk.hfin[40] = -552727011;
        nk.hfin[41] = -392066286;
        nk.hfin[42] = 1085915341;
        nk.hfin[43] = 347884703;
        nk.hfin[44] = -367627476;
        nk.hfin[45] = 1698066449;
        nk.hfin[46] = -131013088;
        nk.hfin[47] = 259067054;
        nk.hfin[48] = -1474335132;
        nk.hfin[49] = -1381903350;
        nk.hfin[50] = -1127804646;
        nk.hfin[51] = 995871308;
        nk.hfin[52] = -2051864818;
        nk.hfin[53] = -759035801;
        nk.hfin[54] = -307631293;
        nk.hfin[55] = 1201863937;
        nk.hfin[56] = -1225969542;
        nk.hfin[57] = -1706515182;
        nk.hfin[58] = 1745007265;
        nk.hfin[59] = -511787315;
        nk.hfin[60] = 1232618497;
        nk.hfin[61] = 1504828360;
        nk.hfin[62] = -1964236678;
        nk.hfin[63] = -2055760400;
        nk.hfin[64] = 2120522443;
        nk.hfin[65] = 1192820680;
        nk.hfin[66] = -2125902027;
        nk.hfin[67] = 1558667415;
        nk.hfin[68] = 1300150800;
        nk.hfin[69] = 91186057;
        nk.hfin[70] = -261974794;
        nk.hfin[71] = -107421435;
        nk.hfin[72] = 849576281;
        nk.hfin[73] = 1444063400;
        nk.hfin[74] = 777815587;
        nk.hfin[75] = 906550430;
        nk.hfin[76] = 186573639;
        nk.hfin[77] = -1111874809;
        nk.hfin[78] = 1455875741;
        nk.hfin[79] = -1568368560;
        nk.hfin[80] = -663989654;
        nk.hfin[81] = 678583981;
        nk.hfin[82] = 1395498877;
        nk.hfin[83] = -1904516780;
        nk.hfin[84] = -849106367;
        nk.hfin[85] = 854050717;
        nk.hfin[86] = 1190537281;
        nk.hfin[87] = -1831530165;
        nk.hfin[88] = 1633669684;
        nk.hfin[89] = 327086479;
        nk.hfin[90] = -1633280077;
        nk.hfin[91] = 588290634;
        nk.hfin[92] = -582716481;
        nk.hfin[93] = 549561611;
        nk.hfin[94] = 1167571380;
        nk.hfin[95] = -759525224;
        nk.hfin[96] = 329839826;
        nk.hfin[97] = -1284521544;
        nk.hfin[98] = 2061335509;
        nk.hfin[99] = 329993970;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static nk$LegacyTexture textureFromCompound(class_2487 var0) {
        block39: {
            block38: {
                block37: {
                    while (true) {
                        if ((v0 /* !! */  = (cfr_temp_0 = nk.oh - nk.hfip("hgfk", hfkl(int ), (int)88)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                        if (v0 /* !! */  == nk.hfip("hgfm", hfim(int ), (int)220)) break;
                        v0 /* !! */  = (long)nk.hfip("hgfo", hfim(int ), (int)221);
                    }
                    var4_1 = nk.c;
                    v1 /* !! */  = nk.oh;
                    if (true) ** GOTO lbl11
                    block28: while (true) {
                        v1 /* !! */  = (long)(v2 - nk.hfip("hgfq", hfkl(int ), (int)89));
lbl11:
                        // 2 sources

                        switch ((int)v1 /* !! */ ) {
                            case -1518798788: {
                                break block28;
                            }
                            case -577947595: {
                                v2 = nk.hfip("hgfr", hfkl(int ), (int)90);
                                continue block28;
                            }
                            case 1572651312: {
                                v2 = nk.hfip("hgfs", hfkl(int ), (int)91);
                                continue block28;
                            }
                            case 1643908483: {
                                v2 = nk.hfip("hgfu", hfkl(int ), (int)92);
                                continue block28;
                            }
                        }
                        break;
                    }
                    var3_2 = nk.b;
                    v3 /* !! */  = nk.oh;
                    if (true) ** GOTO lbl28
                    block29: while (true) {
                        v3 /* !! */  = (long)(v4 - nk.hfip("hgfz", hfkl(int ), (int)93));
lbl28:
                        // 2 sources

                        switch ((int)v3 /* !! */ ) {
                            case -1862070807: {
                                v4 = nk.hfip("hgga", hfkl(int ), (int)94);
                                continue block29;
                            }
                            case -1518798788: {
                                break block29;
                            }
                            case -412580690: {
                                v4 = nk.hfip("hggb", hfkl(int ), (int)95);
                                continue block29;
                            }
                        }
                        break;
                    }
                    var2_3 = nk.a;
                    if (var4_1) {
                        throw null;
lbl40:
                        // 8 sources

                        return null;
                    }
                    if (var2_3 || var2_3) ** GOTO lbl40
                    if (var0 != null) break block37;
                    if (var2_3) ** GOTO lbl40
                    return null;
                }
                if (var2_3 || var2_3) ** GOTO lbl40
                v5 = new String[]{"Value", "value"};
                v6 /* !! */  = nk.oh;
                if (true) ** GOTO lbl53
                block31: while (true) {
                    v6 /* !! */  = (long)(v7 - nk.hfip("hggd", hfkl(int ), (int)96));
lbl53:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1518798788: {
                            break block31;
                        }
                        case -1371536125: {
                            v7 = nk.hfip("hgge", hfkl(int ), (int)97);
                            continue block31;
                        }
                        case 154061824: {
                            v7 = nk.hfip("hggi", hfkl(int ), (int)98);
                            continue block31;
                        }
                        case 811778281: {
                            v7 = nk.hfip("hggj", hfkl(int ), (int)99);
                            continue block31;
                        }
                    }
                    break;
                }
                var1_4 = nk.firstString(var0, v5);
                if (var2_3 || var2_3) ** GOTO lbl40
                if (var1_4 == null) break block38;
                if (var2_3) ** GOTO lbl40
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_1 = nk.oh - nk.hfip("hggl", hfkl(int ), (int)100)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == nk.hfip("hggm", hfim(int ), (int)222)) break;
                    v8 /* !! */  = (long)nk.hfip("hggo", hfim(int ), (int)223);
                }
                if (!var1_4.isBlank()) break block39;
                if (var2_3) ** GOTO lbl40
            }
            if (var2_3 || var2_3) ** GOTO lbl40
            return null;
        }
        if (!var2_3 && !var2_3) ** break;
        ** while (true)
        v9 /* !! */  = nk.oh;
        if (true) ** GOTO lbl86
        block33: while (true) {
            v9 /* !! */  = (long)(v10 - nk.hfip("hggp", hfkl(int ), (int)101));
lbl86:
            // 2 sources

            switch ((int)v9 /* !! */ ) {
                case -1555434591: {
                    v10 = nk.hfip("hggr", hfkl(int ), (int)102);
                    continue block33;
                }
                case -1518798788: {
                    break block33;
                }
                case -1311450287: {
                    v10 = nk.hfip("hggs", hfkl(int ), (int)103);
                    continue block33;
                }
            }
            break;
        }
        v11 = new String[]{"Signature", "signature"};
        while (true) {
            if ((v12 /* !! */  = (cfr_temp_2 = nk.oh - nk.hfip("hggt", hfkl(int ), (int)104)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v12 /* !! */  == nk.hfip("hggu", hfim(int ), (int)224)) break;
            v12 /* !! */  = (long)nk.hfip("hggv", hfim(int ), (int)225);
        }
        v13 = nk.firstString(var0, v11);
        v14 /* !! */  = nk.oh;
        if (true) ** GOTO lbl106
        block35: while (true) {
            v14 /* !! */  = (long)(v15 - nk.hfip("hggw", hfkl(int ), (int)105));
lbl106:
            // 2 sources

            switch ((int)v14 /* !! */ ) {
                case -1518798788: {
                    break block35;
                }
                case -364076993: {
                    v15 = nk.hfip("hggx", hfkl(int ), (int)106);
                    continue block35;
                }
                case 1290963468: {
                    v15 = nk.hfip("hggy", hfkl(int ), (int)107);
                    continue block35;
                }
            }
            break;
        }
        return new nk$LegacyTexture(var1_4, v13);
    }

    private static /* synthetic */ void hgls() {
        nk.hfio[100] = 2109498150;
        nk.hfio[101] = 930475341;
        nk.hfio[102] = -775198870;
        nk.hfio[103] = 1584064257;
        nk.hfio[104] = -617547463;
        nk.hfio[105] = 531724525;
        nk.hfio[106] = -206219069;
        nk.hfio[107] = -1607567336;
        nk.hfio[108] = 992809281;
        nk.hfio[109] = -1118881470;
        nk.hfio[110] = 259224708;
        nk.hfio[111] = 1748645549;
        nk.hfio[112] = -680087278;
        nk.hfio[113] = 1812515740;
        nk.hfio[114] = 2061891509;
        nk.hfio[115] = -2139866018;
        nk.hfio[116] = -565005384;
        nk.hfio[117] = 1856656098;
        nk.hfio[118] = -509693665;
        nk.hfio[119] = 218852130;
        nk.hfio[120] = 1755594394;
        nk.hfio[121] = -851209964;
        nk.hfio[122] = 1344631566;
        nk.hfio[123] = 216998932;
        nk.hfio[124] = -879082739;
        nk.hfio[125] = -593496185;
        nk.hfio[126] = -61135071;
        nk.hfio[127] = -531506921;
        nk.hfio[128] = -388319539;
        nk.hfio[129] = 942704884;
        nk.hfio[130] = 1048908628;
        nk.hfio[131] = -1875517001;
        nk.hfio[132] = -733808663;
        nk.hfio[133] = 223361424;
        nk.hfio[134] = 1987650728;
        nk.hfio[135] = 1029177610;
        nk.hfio[136] = 301260794;
        nk.hfio[137] = 575501799;
        nk.hfio[138] = -279505322;
        nk.hfio[139] = 768587751;
        nk.hfio[140] = -1711413626;
        nk.hfio[141] = -1143998857;
        nk.hfio[142] = 1919269070;
        nk.hfio[143] = 314841496;
        nk.hfio[144] = 727673256;
        nk.hfio[145] = -1747778173;
        nk.hfio[146] = 902767868;
        nk.hfio[147] = -11749426;
        nk.hfio[148] = -1698669328;
        nk.hfio[149] = 77450790;
        nk.hfio[150] = -103391284;
        nk.hfio[151] = 1054923220;
        nk.hfio[152] = 122716807;
        nk.hfio[153] = 1879640234;
        nk.hfio[154] = 1472541168;
        nk.hfio[155] = -2128186617;
        nk.hfio[156] = 1044615831;
        nk.hfio[157] = 1887606810;
        nk.hfio[158] = 1954101216;
        nk.hfio[159] = -669676410;
        nk.hfio[160] = 1254946025;
        nk.hfio[161] = -1758139115;
        nk.hfio[162] = -782012894;
        nk.hfio[163] = -1820584411;
        nk.hfio[164] = -1813319474;
        nk.hfio[165] = -1967046172;
        nk.hfio[166] = -1170358837;
        nk.hfio[167] = 356078246;
        nk.hfio[168] = 1960474435;
        nk.hfio[169] = -1990655025;
        nk.hfio[170] = 1877888324;
        nk.hfio[171] = -1152953558;
        nk.hfio[172] = -822416561;
        nk.hfio[173] = -1594622549;
        nk.hfio[174] = 1514707281;
        nk.hfio[175] = 320615908;
        nk.hfio[176] = 779848880;
        nk.hfio[177] = -1574561865;
        nk.hfio[178] = 651729487;
        nk.hfio[179] = -866903024;
        nk.hfio[180] = 614623414;
        nk.hfio[181] = 384876713;
        nk.hfio[182] = 988051901;
        nk.hfio[183] = -1708127453;
        nk.hfio[184] = -48827027;
        nk.hfio[185] = -1206299645;
        nk.hfio[186] = 1989516285;
        nk.hfio[187] = 595930436;
        nk.hfio[188] = -577193215;
        nk.hfio[189] = -363916886;
        nk.hfio[190] = 788660826;
        nk.hfio[191] = -1166334726;
        nk.hfio[192] = 1127001950;
        nk.hfio[193] = 2130429003;
        nk.hfio[194] = 1290941845;
        nk.hfio[195] = 23722147;
        nk.hfio[196] = -1057398219;
        nk.hfio[197] = -2144718523;
        nk.hfio[198] = -1609717548;
        nk.hfio[199] = -566356562;
    }

    private static /* synthetic */ long hfkl(int n2) {
        return hfkm[n2] ^ hfkn[n2];
    }

    private static /* synthetic */ void hgky() {
        nk.hfio[0] = -1953469413;
        nk.hfio[1] = 1620097984;
        nk.hfio[2] = 2043960657;
        nk.hfio[3] = -308487567;
        nk.hfio[4] = -1010507212;
        nk.hfio[5] = 2010745602;
        nk.hfio[6] = -776305628;
        nk.hfio[7] = 328735733;
        nk.hfio[8] = -473446768;
        nk.hfio[9] = 279351760;
        nk.hfio[10] = 1043913145;
        nk.hfio[11] = 1500848053;
        nk.hfio[12] = 1215006407;
        nk.hfio[13] = 1509346690;
        nk.hfio[14] = -160184300;
        nk.hfio[15] = -722556883;
        nk.hfio[16] = -1999814951;
        nk.hfio[17] = 520641141;
        nk.hfio[18] = 1348026280;
        nk.hfio[19] = 1297190690;
        nk.hfio[20] = 319459663;
        nk.hfio[21] = 1512428390;
        nk.hfio[22] = 2133313052;
        nk.hfio[23] = 1190274845;
        nk.hfio[24] = -239444577;
        nk.hfio[25] = -1726361085;
        nk.hfio[26] = -24040110;
        nk.hfio[27] = 17940503;
        nk.hfio[28] = -1982859052;
        nk.hfio[29] = 1795253439;
        nk.hfio[30] = -492620124;
        nk.hfio[31] = -112508048;
        nk.hfio[32] = -2132358034;
        nk.hfio[33] = -1854960155;
        nk.hfio[34] = 645965424;
        nk.hfio[35] = 765008678;
        nk.hfio[36] = 1668185990;
        nk.hfio[37] = -1822351376;
        nk.hfio[38] = 1268354006;
        nk.hfio[39] = -1737107390;
        nk.hfio[40] = -552726986;
        nk.hfio[41] = -392066279;
        nk.hfio[42] = 1085915328;
        nk.hfio[43] = 347884693;
        nk.hfio[44] = -367627465;
        nk.hfio[45] = 1698066480;
        nk.hfio[46] = -131013086;
        nk.hfio[47] = 259067055;
        nk.hfio[48] = 784818306;
        nk.hfio[49] = -1381903349;
        nk.hfio[50] = 1315444922;
        nk.hfio[51] = 995871309;
        nk.hfio[52] = -1214315268;
        nk.hfio[53] = -759035802;
        nk.hfio[54] = 286743666;
        nk.hfio[55] = 1201863936;
        nk.hfio[56] = 1888199465;
        nk.hfio[57] = 1706515181;
        nk.hfio[58] = 2124055270;
        nk.hfio[59] = -511787316;
        nk.hfio[60] = 1788576832;
        nk.hfio[61] = 1504828361;
        nk.hfio[62] = 1444385797;
        nk.hfio[63] = -2055760399;
        nk.hfio[64] = 505544196;
        nk.hfio[65] = 1192820681;
        nk.hfio[66] = 1846095202;
        nk.hfio[67] = -1558667416;
        nk.hfio[68] = 1894467091;
        nk.hfio[69] = 91186056;
        nk.hfio[70] = 1476067583;
        nk.hfio[71] = -107421436;
        nk.hfio[72] = 1245324041;
        nk.hfio[73] = 1444063401;
        nk.hfio[74] = 785838266;
        nk.hfio[75] = 906550431;
        nk.hfio[76] = -801447350;
        nk.hfio[77] = -1111874806;
        nk.hfio[78] = 1455875730;
        nk.hfio[79] = -1568368546;
        nk.hfio[80] = -663989662;
        nk.hfio[81] = 678583983;
        nk.hfio[82] = 1395498871;
        nk.hfio[83] = -1904516769;
        nk.hfio[84] = -849106365;
        nk.hfio[85] = 854050704;
        nk.hfio[86] = 1190537281;
        nk.hfio[87] = -1831530162;
        nk.hfio[88] = 1633669688;
        nk.hfio[89] = 327086479;
        nk.hfio[90] = -1633280066;
        nk.hfio[91] = 588290628;
        nk.hfio[92] = -582716493;
        nk.hfio[93] = 549561610;
        nk.hfio[94] = 1167571381;
        nk.hfio[95] = -1603034766;
        nk.hfio[96] = 329839826;
        nk.hfio[97] = -1284521543;
        nk.hfio[98] = -1057547339;
        nk.hfio[99] = 329993971;
    }

    private static /* synthetic */ int hfim(int n2) {
        return hfin[n2] ^ hfio[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private nk() {
        var2_1 /* !! */  = nk.b;
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                super();
                return;
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)nk.hfip("hfiq", hfim(int ), (int)0);
                    continue;
                    break;
                }
            }
            case 1: {
                var2_1 /* !! */  = (int)nk.hfip("hfir", hfim(int ), (int)1);
            }
            case 2: 
        }
        var2_1 /* !! */  = (int)nk.hfip("hfis", hfim(int ), (int)2);
        ** while (true)
    }

    private static /* synthetic */ void hgnn() {
        nk.hfkm[100] = 3918430510475941075L;
        nk.hfkm[101] = -1211887076117320667L;
        nk.hfkm[102] = 8977610206512177699L;
        nk.hfkm[103] = 3011147457205311282L;
        nk.hfkm[104] = 2305068242732887036L;
        nk.hfkm[105] = 8319352769365332232L;
        nk.hfkm[106] = 859638434160703536L;
        nk.hfkm[107] = 3649063578579969284L;
        nk.hfkm[108] = 3910965189815666465L;
        nk.hfkm[109] = -3346369247386462317L;
        nk.hfkm[110] = 2597529623939906749L;
        nk.hfkm[111] = -504908298412281074L;
        nk.hfkm[112] = 172951064105215000L;
        nk.hfkm[113] = -268462942351336966L;
        nk.hfkm[114] = 8924451880199047865L;
        nk.hfkm[115] = -4626362059805559334L;
    }

    private static /* synthetic */ void hgmk() {
        nk.hfio[200] = 1335978200;
        nk.hfio[201] = 1744201680;
        nk.hfio[202] = 1865646845;
        nk.hfio[203] = -1895078414;
        nk.hfio[204] = 1748628063;
        nk.hfio[205] = 403984812;
        nk.hfio[206] = 1076675774;
        nk.hfio[207] = -492492815;
        nk.hfio[208] = 460946237;
        nk.hfio[209] = 181396217;
        nk.hfio[210] = -1279691848;
        nk.hfio[211] = -2077789067;
        nk.hfio[212] = -1172558784;
        nk.hfio[213] = -2146784083;
        nk.hfio[214] = 1744563892;
        nk.hfio[215] = 982510135;
        nk.hfio[216] = 1145579672;
        nk.hfio[217] = 1763280738;
        nk.hfio[218] = 967701407;
        nk.hfio[219] = 1399379348;
        nk.hfio[220] = 714179029;
        nk.hfio[221] = -1160601729;
        nk.hfio[222] = -1144508203;
        nk.hfio[223] = 237760858;
        nk.hfio[224] = 418557097;
        nk.hfio[225] = -1339737596;
        nk.hfio[226] = -2130550427;
        nk.hfio[227] = -1560941656;
        nk.hfio[228] = 1721701317;
        nk.hfio[229] = 1831417274;
        nk.hfio[230] = 244386669;
        nk.hfio[231] = -1930496850;
        nk.hfio[232] = -1138841954;
        nk.hfio[233] = -495538250;
        nk.hfio[234] = -1511578184;
        nk.hfio[235] = 1638140182;
        nk.hfio[236] = -1303574702;
        nk.hfio[237] = 1409540440;
        nk.hfio[238] = -1358230157;
        nk.hfio[239] = -253497299;
        nk.hfio[240] = -1253861358;
        nk.hfio[241] = -1006301201;
        nk.hfio[242] = 834518531;
        nk.hfio[243] = 2096653301;
        nk.hfio[244] = 1125632113;
        nk.hfio[245] = -1876740210;
        nk.hfio[246] = -1880055024;
        nk.hfio[247] = 148954370;
        nk.hfio[248] = 755624053;
        nk.hfio[249] = 371753537;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static class_2487 firstCompound(class_2487 var0, String ... var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = nk.oh - nk.hfip("hfqu", hfkl(int ), (int)44)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == nk.hfip("hfqx", hfim(int ), (int)94)) break;
            v0 /* !! */  = (long)nk.hfip("hfqy", hfim(int ), (int)95);
        }
        var9_2 = nk.c;
        v1 /* !! */  = nk.oh;
        if (true) ** GOTO lbl12
        block41: while (true) {
            v1 /* !! */  = (long)(nk.hfip("hfra", hfkl(int ), (int)46) - nk.hfip("hfqz", hfkl(int ), (int)45));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1518798788: {
                    break block41;
                }
                case 792422062: {
                    continue block41;
                }
            }
            break;
        }
        var8_3 /* !! */  = nk.b;
        v2 /* !! */  = nk.oh;
        if (true) ** GOTO lbl22
        block42: while (true) {
            v2 /* !! */  = (long)(nk.hfip("hfrc", hfkl(int ), (int)48) - nk.hfip("hfrb", hfkl(int ), (int)47));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1518798788: {
                    break block42;
                }
                case -221014179: {
                    continue block42;
                }
            }
            break;
        }
        var7_4 = nk.a;
        if (var8_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var8_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var9_2) {
                    throw null;
lbl33:
                    // 13 sources

                    return null;
                }
                if (var7_4 || var7_4) ** GOTO lbl33
                var2_5 = var1_1;
                if (var7_4) ** GOTO lbl33
                var3_6 = var2_5.length;
                if (var7_4) ** GOTO lbl33
                var4_7 = nk.hfip("hfrg", hfim(int ), (int)96);
                if (var7_4) ** GOTO lbl33
                do {
                    if (var7_4 || var7_4) ** GOTO lbl33
                    if (var4_7 >= var3_6) ** GOTO lbl85
                    if (var7_4) ** GOTO lbl33
                    var5_8 = var2_5[var4_7];
                    if (var7_4 || var7_4) ** GOTO lbl33
                    v3 /* !! */  = nk.oh;
                    if (true) ** GOTO lbl52
                    block45: while (true) {
                        v3 /* !! */  = (long)(nk.hfip("hfrn", hfkl(int ), (int)50) - nk.hfip("hfrk", hfkl(int ), (int)49));
lbl52:
                        // 2 sources

                        switch ((int)v3 /* !! */ ) {
                            case -1518798788: {
                                break block45;
                            }
                            case -77628442: {
                                continue block45;
                            }
                        }
                        break;
                    }
                    v4 = var0.method_10562(var5_8);
                    while (true) {
                        if ((v5 /* !! */  = (cfr_temp_1 = nk.oh - nk.hfip("hfro", hfkl(int ), (int)51)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                            continue;
                        }
                        if (v5 /* !! */  == nk.hfip("hfrp", hfim(int ), (int)97)) break;
                        v5 /* !! */  = (long)nk.hfip("hfrt", hfim(int ), (int)98);
                    }
                    var6_9 = v4.orElse(null);
                    if (var7_4 || var7_4) ** GOTO lbl33
                    if (var6_9 == null) ** GOTO lbl80
                    if (var7_4) ** GOTO lbl33
                    v6 /* !! */  = nk.oh;
                    if (true) ** GOTO lbl72
                    block47: while (true) {
                        v6 /* !! */  = (long)(nk.hfip("hfrw", hfkl(int ), (int)53) - nk.hfip("hfrv", hfkl(int ), (int)52));
lbl72:
                        // 2 sources

                        switch ((int)v6 /* !! */ ) {
                            case -1518798788: {
                                break block47;
                            }
                            case 1764772537: {
                                continue block47;
                            }
                        }
                        break;
                    }
                    if (var6_9.method_33133()) ** GOTO lbl80
                    if (var7_4) ** GOTO lbl33
                    return var6_9;
lbl80:
                    // 2 sources

                    if (var7_4 || var7_4) ** GOTO lbl33
                    ++var4_7;
                    if (var7_4) ** GOTO lbl33
                } while (!var9_2);
                throw null;
lbl85:
                // 1 sources

                if (!var7_4 && !var7_4) ** break;
                ** continue;
                return null;
            }
lbl88:
            // 2 sources

            case 0: {
                var8_3 /* !! */  = (int)nk.hfip("hfrz", hfim(int ), (int)99);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl163
            }
lbl93:
            // 2 sources

            case 1: {
                var8_3 /* !! */  = (int)nk.hfip("hfsa", hfim(int ), (int)100);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl126
            }
            case 2: {
                var8_3 /* !! */  = (int)nk.hfip("hfsb", hfim(int ), (int)101);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl147
            }
lbl103:
            // 2 sources

            case 3: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var8_3 /* !! */  = (int)nk.hfip("hfsc", hfim(int ), (int)102);
                    if (!var9_2) ** GOTO lbl-1000
                    throw null;
                }
            }
lbl108:
            // 3 sources

            case 4: {
                var8_3 /* !! */  = (int)nk.hfip("hfsi", hfim(int ), (int)103);
                if (!var9_2) ** GOTO lbl88
                throw null;
            }
            case 5: {
                var8_3 /* !! */  = (int)nk.hfip("hfsj", hfim(int ), (int)104);
                if (!var9_2) ** GOTO lbl93
                throw null;
            }
            case 6: {
                var8_3 /* !! */  = (int)nk.hfip("hfsk", hfim(int ), (int)105);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl134
            }
lbl121:
            // 3 sources

            case 7: {
                var8_3 /* !! */  = (int)nk.hfip("hfsl", hfim(int ), (int)106);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl176
            }
lbl126:
            // 2 sources

            case 8: {
                var8_3 /* !! */  = (int)nk.hfip("hfsm", hfim(int ), (int)107);
                if (!var9_2) ** GOTO lbl121
                throw null;
            }
            case 9: {
                var8_3 /* !! */  = (int)nk.hfip("hfss", hfim(int ), (int)108);
                if (!var9_2) break;
                throw null;
            }
lbl134:
            // 2 sources

            case 10: {
                var8_3 /* !! */  = (int)nk.hfip("hfsu", hfim(int ), (int)109);
                if (var9_2) {
                    throw null;
                }
            }
lbl138:
            // 5 sources

            case 11: {
                var8_3 /* !! */  = (int)nk.hfip("hfsw", hfim(int ), (int)110);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl163
            }
            case 12: {
                var8_3 /* !! */  = (int)nk.hfip("hfsx", hfim(int ), (int)111);
                if (!var9_2) ** GOTO lbl138
                throw null;
            }
lbl147:
            // 2 sources

            case 13: {
                var8_3 /* !! */  = (int)nk.hfip("hfsy", hfim(int ), (int)112);
                if (!var9_2) ** GOTO lbl108
                throw null;
            }
lbl151:
            // 2 sources

            case 14: {
                var8_3 /* !! */  = (int)nk.hfip("hfsz", hfim(int ), (int)113);
                if (!var9_2) ** GOTO lbl103
                throw null;
            }
            case 15: {
                var8_3 /* !! */  = (int)nk.hfip("hfta", hfim(int ), (int)114);
                if (!var9_2) ** GOTO lbl138
                throw null;
            }
            case 16: {
                var8_3 /* !! */  = (int)nk.hfip("hfth", hfim(int ), (int)115);
                if (!var9_2) ** GOTO lbl151
                throw null;
            }
lbl163:
            // 3 sources

            case 17: {
                var8_3 /* !! */  = (int)nk.hfip("hftj", hfim(int ), (int)116);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl176
            }
            case 18: {
                var8_3 /* !! */  = (int)nk.hfip("hftk", hfim(int ), (int)117);
                if (!var9_2) ** GOTO lbl121
                throw null;
            }
            case 19: {
                var8_3 /* !! */  = (int)nk.hfip("hftl", hfim(int ), (int)118);
                if (!var9_2) ** GOTO lbl108
                throw null;
            }
lbl176:
            // 3 sources

            case 20: {
                do {
                    var8_3 /* !! */  = (int)nk.hfip("hftm", hfim(int ), (int)119);
                } while (!var9_2);
                throw null;
            }
            case 21: 
        }
        var8_3 /* !! */  = (int)nk.hfip("hftn", hfim(int ), (int)120);
        ** while (!var9_2)
lbl184:
        // 1 sources

        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ class_9296 lambda$get$0(nk$LegacyTexture var0, String var1_1) {
        v0 /* !! */  = nk.oh;
        if (true) ** GOTO lbl5
        block16: while (true) {
            v0 /* !! */  = (long)(v1 - nk.hfip("hgig", hfkl(int ), (int)108));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1518798788: {
                    break block16;
                }
                case 1176539334: {
                    v1 = nk.hfip("hgih", hfkl(int ), (int)109);
                    continue block16;
                }
                case 1176964205: {
                    v1 = nk.hfip("hgii", hfkl(int ), (int)110);
                    continue block16;
                }
            }
            break;
        }
        var4_2 = nk.c;
        v2 /* !! */  = nk.oh;
        if (true) ** GOTO lbl19
        block17: while (true) {
            v2 /* !! */  = (long)(v3 - nk.hfip("hgij", hfkl(int ), (int)111));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1518798788: {
                    break block17;
                }
                case -623822539: {
                    v3 = nk.hfip("hgio", hfkl(int ), (int)112);
                    continue block17;
                }
                case 306413398: {
                    v3 = nk.hfip("hgip", hfkl(int ), (int)113);
                    continue block17;
                }
            }
            break;
        }
        var3_3 /* !! */  = nk.b;
        while (true) {
            block30: {
                if ((v4 /* !! */  = (cfr_temp_1 = nk.oh - nk.hfip("hgiq", hfkl(int ), (int)114)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v4 /* !! */  != nk.hfip("hgir", hfim(int ), (int)242)) break block30;
                var2_4 = nk.a;
                if (var3_3 /* !! */  != 0) {
                    break;
                }
                ** GOTO lbl-1000
            }
            v4 /* !! */  = (long)nk.hfip("hgiw", hfim(int ), (int)243);
        }
        cfr_temp_0 = -2147483648;
        while (true) {
            switch (cfr_temp_0 == -2147483648 ? var3_3 /* !! */  : cfr_temp_0) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var4_2) {
                        throw null;
                    }
                    if (var2_4 != false) return null;
                    if (var2_4 != false) return null;
                    while (true) {
                        if ((v5 /* !! */  = (cfr_temp_2 = nk.oh - nk.hfip("hgja", hfkl(int ), (int)115)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                            continue;
                        }
                        if (v5 /* !! */  == nk.hfip("hgjc", hfim(int ), (int)244)) {
                            return nk.create(var0);
                        }
                        v5 /* !! */  = (long)nk.hfip("hgje", hfim(int ), (int)245);
                    }
                }
                case 2: {
                    var3_3 /* !! */  = (int)nk.hfip("hgjj", hfim(int ), (int)248);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl-1000
                }
                case 3: lbl-1000:
                // 2 sources

                {
                    var3_3 /* !! */  = (int)nk.hfip("hgjl", hfim(int ), (int)249);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl-1000
                }
                case 0: lbl-1000:
                // 2 sources

                {
                    var3_3 /* !! */  = (int)nk.hfip("hgjg", hfim(int ), (int)246);
                    if (var4_2) {
                        throw null;
                    }
                }
                case 1: 
            }
            if (true) ** GOTO lbl73
            break;
        }
        do {
            if (true) ** continue;
lbl73:
            // 2 sources

            var3_3 /* !! */  = (int)nk.hfip("hgjh", hfim(int ), (int)247);
            cfr_temp_0 = 0;
        } while (!var4_2);
        throw null;
    }

    private static /* synthetic */ void hgmw() {
        nk.hfkm[0] = 1888838767623459165L;
        nk.hfkm[1] = 965351081342716472L;
        nk.hfkm[2] = -4547186578126252951L;
        nk.hfkm[3] = -2115348833854896645L;
        nk.hfkm[4] = 1803099845090299971L;
        nk.hfkm[5] = -4874933577545545692L;
        nk.hfkm[6] = 2798972043096567452L;
        nk.hfkm[7] = -2902482323576596157L;
        nk.hfkm[8] = 1325381154359114206L;
        nk.hfkm[9] = -7638372643103931703L;
        nk.hfkm[10] = -495912265415407883L;
        nk.hfkm[11] = 7375467125922070104L;
        nk.hfkm[12] = -4350675193868514206L;
        nk.hfkm[13] = -8971630838584045550L;
        nk.hfkm[14] = 629647983097852593L;
        nk.hfkm[15] = 1522704164948500429L;
        nk.hfkm[16] = -8752714805310033886L;
        nk.hfkm[17] = 3867619157170871779L;
        nk.hfkm[18] = 817516532900278178L;
        nk.hfkm[19] = -7959185583745807389L;
        nk.hfkm[20] = 2137133069591298688L;
        nk.hfkm[21] = -5205171933886785339L;
        nk.hfkm[22] = 307759554252757242L;
        nk.hfkm[23] = 441208191434187806L;
        nk.hfkm[24] = 5080206220272029901L;
        nk.hfkm[25] = -2839591523668650449L;
        nk.hfkm[26] = 6778862261497783088L;
        nk.hfkm[27] = 7592612986935771513L;
        nk.hfkm[28] = -8220072798511074102L;
        nk.hfkm[29] = 7610865911437363462L;
        nk.hfkm[30] = 269187552466080566L;
        nk.hfkm[31] = 521489357589567807L;
        nk.hfkm[32] = 7918090075126657739L;
        nk.hfkm[33] = 6506355726205274280L;
        nk.hfkm[34] = -2548468357128951291L;
        nk.hfkm[35] = -324708351336970740L;
        nk.hfkm[36] = 6408343375028147470L;
        nk.hfkm[37] = -8381622234519861551L;
        nk.hfkm[38] = 7032181618469495355L;
        nk.hfkm[39] = -419809245590259307L;
        nk.hfkm[40] = -1482359984347616438L;
        nk.hfkm[41] = -8250081903438173505L;
        nk.hfkm[42] = 4042242977591207134L;
        nk.hfkm[43] = 3817194279370883821L;
        nk.hfkm[44] = -6904283868531802179L;
        nk.hfkm[45] = 5168481722412182393L;
        nk.hfkm[46] = -6681524889913134399L;
        nk.hfkm[47] = 7704443428068178749L;
        nk.hfkm[48] = 233664851589947288L;
        nk.hfkm[49] = -6319226108448947633L;
        nk.hfkm[50] = -2613471020018822535L;
        nk.hfkm[51] = 3061590912657297307L;
        nk.hfkm[52] = -2216664031660272206L;
        nk.hfkm[53] = 9140424850152258496L;
        nk.hfkm[54] = -4938263797112145915L;
        nk.hfkm[55] = -8225881302747689916L;
        nk.hfkm[56] = -8205406204681893875L;
        nk.hfkm[57] = -1188490270620301436L;
        nk.hfkm[58] = -5427999694740739796L;
        nk.hfkm[59] = 3348576934825895199L;
        nk.hfkm[60] = 7568364575512923666L;
        nk.hfkm[61] = -4498791656480792662L;
        nk.hfkm[62] = -5496037164741388595L;
        nk.hfkm[63] = 5615008367371379300L;
        nk.hfkm[64] = -1997969043648735877L;
        nk.hfkm[65] = 627408813866633472L;
        nk.hfkm[66] = -8648728019343033676L;
        nk.hfkm[67] = -7947744826405894394L;
        nk.hfkm[68] = -1231159995677167152L;
        nk.hfkm[69] = 4880264769100809890L;
        nk.hfkm[70] = -643327294983974031L;
        nk.hfkm[71] = -6087736685090035937L;
        nk.hfkm[72] = 2450501409155356073L;
        nk.hfkm[73] = 2354050678289380909L;
        nk.hfkm[74] = 1988993755197326596L;
        nk.hfkm[75] = -1022651282405930071L;
        nk.hfkm[76] = -8808287953261017425L;
        nk.hfkm[77] = 7580536567966408546L;
        nk.hfkm[78] = 8335300653018178895L;
        nk.hfkm[79] = 7058671717916466053L;
        nk.hfkm[80] = 4002166234022947493L;
        nk.hfkm[81] = 1347477619987654476L;
        nk.hfkm[82] = -9072672916156979797L;
        nk.hfkm[83] = 2375974189396515396L;
        nk.hfkm[84] = 2528384263510288444L;
        nk.hfkm[85] = 6915532274434974827L;
        nk.hfkm[86] = 5232424514415912873L;
        nk.hfkm[87] = -2506685083110590078L;
        nk.hfkm[88] = -2041583106210516336L;
        nk.hfkm[89] = -5219320556867216192L;
        nk.hfkm[90] = -7656662109972817826L;
        nk.hfkm[91] = -235623620662570167L;
        nk.hfkm[92] = 7227625183736821146L;
        nk.hfkm[93] = -8203773046549924292L;
        nk.hfkm[94] = 8886113781897762690L;
        nk.hfkm[95] = -8844071403988212751L;
        nk.hfkm[96] = -8756933624138321996L;
        nk.hfkm[97] = -7041767229940312400L;
        nk.hfkm[98] = -7151060451641891062L;
        nk.hfkm[99] = 6027902819666520685L;
    }

    public static /* synthetic */ CallSite hfip(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void hgno() {
        nk.hfkn[0] = -4610828793097762870L;
        nk.hfkn[1] = 971236968154660316L;
        nk.hfkn[2] = 8652603567061375076L;
        nk.hfkn[3] = 4912465350467192335L;
        nk.hfkn[4] = 1079302470922452503L;
        nk.hfkn[5] = 2186686855273087519L;
        nk.hfkn[6] = -3461457568662051592L;
        nk.hfkn[7] = -1615738977127456880L;
        nk.hfkn[8] = 8797828704346825340L;
        nk.hfkn[9] = -1105521428494574783L;
        nk.hfkn[10] = -4687555367176893505L;
        nk.hfkn[11] = 5097812133449800268L;
        nk.hfkn[12] = 7067361048674171614L;
        nk.hfkn[13] = -3992195548866328028L;
        nk.hfkn[14] = -6175924984943998706L;
        nk.hfkn[15] = 1165814689294771462L;
        nk.hfkn[16] = -896459127595779864L;
        nk.hfkn[17] = 7026977138578086601L;
        nk.hfkn[18] = 495940695124733879L;
        nk.hfkn[19] = 6602982947491156657L;
        nk.hfkn[20] = -6465043662031862439L;
        nk.hfkn[21] = 3516000274363805418L;
        nk.hfkn[22] = -8682235510865744790L;
        nk.hfkn[23] = 7886101717309977561L;
        nk.hfkn[24] = -2313824145349481316L;
        nk.hfkn[25] = 2723579705852871526L;
        nk.hfkn[26] = 4741794061399051056L;
        nk.hfkn[27] = -8458801948776811288L;
        nk.hfkn[28] = 2133678528342183204L;
        nk.hfkn[29] = 4379364559669705271L;
        nk.hfkn[30] = -5959270395197128858L;
        nk.hfkn[31] = 754345308669172669L;
        nk.hfkn[32] = -7735065901916710934L;
        nk.hfkn[33] = -4598437403875977848L;
        nk.hfkn[34] = 8062314138877248266L;
        nk.hfkn[35] = 6146068791662205397L;
        nk.hfkn[36] = 4423109295739721022L;
        nk.hfkn[37] = 6860163774771533197L;
        nk.hfkn[38] = -654861602143471096L;
        nk.hfkn[39] = -5918758108128057810L;
        nk.hfkn[40] = 5314415729949570391L;
        nk.hfkn[41] = 3969679291331931026L;
        nk.hfkn[42] = -7263585270579798769L;
        nk.hfkn[43] = -5638168174777813291L;
        nk.hfkn[44] = 2646433843140385339L;
        nk.hfkn[45] = -8305469843790122562L;
        nk.hfkn[46] = -8723134432185649894L;
        nk.hfkn[47] = 5701118635957473760L;
        nk.hfkn[48] = -4638218102287466927L;
        nk.hfkn[49] = 6723018198539998082L;
        nk.hfkn[50] = -7669513951049870937L;
        nk.hfkn[51] = -7678503882855025542L;
        nk.hfkn[52] = 4906540591873389442L;
        nk.hfkn[53] = -3102870629585095253L;
        nk.hfkn[54] = 3667530885480805645L;
        nk.hfkn[55] = -3617287971294944037L;
        nk.hfkn[56] = -1247379409849185962L;
        nk.hfkn[57] = -267903124934812413L;
        nk.hfkn[58] = -2405446745218789991L;
        nk.hfkn[59] = 485242192715508958L;
        nk.hfkn[60] = -7966141328506903606L;
        nk.hfkn[61] = 6542271439453482916L;
        nk.hfkn[62] = -6667899284530183911L;
        nk.hfkn[63] = 9186246307725210444L;
        nk.hfkn[64] = -8702874079485459906L;
        nk.hfkn[65] = 6218594183894658204L;
        nk.hfkn[66] = 2315679108635796426L;
        nk.hfkn[67] = -1226480168576599674L;
        nk.hfkn[68] = 477163327621696481L;
        nk.hfkn[69] = -6710756414544210919L;
        nk.hfkn[70] = 9079391779351644492L;
        nk.hfkn[71] = 4625029851048454167L;
        nk.hfkn[72] = 1903095818548201211L;
        nk.hfkn[73] = -1207292138417912184L;
        nk.hfkn[74] = -7827701236974055935L;
        nk.hfkn[75] = -2695970031437807043L;
        nk.hfkn[76] = -6128739586069014412L;
        nk.hfkn[77] = -3056924755609163719L;
        nk.hfkn[78] = 5132221906551624951L;
        nk.hfkn[79] = -2706556594711295498L;
        nk.hfkn[80] = 2892179931970736268L;
        nk.hfkn[81] = 1791411732643264369L;
        nk.hfkn[82] = -4180176267057251041L;
        nk.hfkn[83] = -6583469533756184164L;
        nk.hfkn[84] = -2770043508688901791L;
        nk.hfkn[85] = 4167749715346487419L;
        nk.hfkn[86] = -7441323172864208938L;
        nk.hfkn[87] = 1582173934613049467L;
        nk.hfkn[88] = 5478960403482731557L;
        nk.hfkn[89] = -8362049890792188275L;
        nk.hfkn[90] = 1339570894435039161L;
        nk.hfkn[91] = -3462980988110689265L;
        nk.hfkn[92] = 6973597539607932480L;
        nk.hfkn[93] = -8324129139890117488L;
        nk.hfkn[94] = 5590279631235411972L;
        nk.hfkn[95] = 3283393610069024828L;
        nk.hfkn[96] = 5051596672642505440L;
        nk.hfkn[97] = -8613922576834898283L;
        nk.hfkn[98] = -2942658892762768185L;
        nk.hfkn[99] = -2575599129021388082L;
    }

    private static /* synthetic */ void hgkw() {
        nk.hfin[200] = 1335978184;
        nk.hfin[201] = 1744201694;
        nk.hfin[202] = 1865646832;
        nk.hfin[203] = -1895078407;
        nk.hfin[204] = 1748628045;
        nk.hfin[205] = 403984829;
        nk.hfin[206] = 1076675761;
        nk.hfin[207] = -492492812;
        nk.hfin[208] = 460946227;
        nk.hfin[209] = 181396222;
        nk.hfin[210] = -1279691852;
        nk.hfin[211] = -2077789064;
        nk.hfin[212] = -1172558774;
        nk.hfin[213] = -2146784095;
        nk.hfin[214] = 1744563894;
        nk.hfin[215] = 982510118;
        nk.hfin[216] = 0x44482888;
        nk.hfin[217] = 1763280736;
        nk.hfin[218] = 967701391;
        nk.hfin[219] = 1399379355;
        nk.hfin[220] = 714179028;
        nk.hfin[221] = 2081628381;
        nk.hfin[222] = -1144508204;
        nk.hfin[223] = -1030756790;
        nk.hfin[224] = 418557096;
        nk.hfin[225] = 545178666;
        nk.hfin[226] = -2130550427;
        nk.hfin[227] = -1560941651;
        nk.hfin[228] = 1721701314;
        nk.hfin[229] = 1831417275;
        nk.hfin[230] = 244386664;
        nk.hfin[231] = -1930496859;
        nk.hfin[232] = -1138841966;
        nk.hfin[233] = -495538243;
        nk.hfin[234] = -1511578180;
        nk.hfin[235] = 1638140181;
        nk.hfin[236] = -1303574693;
        nk.hfin[237] = 1409540442;
        nk.hfin[238] = -1358230152;
        nk.hfin[239] = -253497300;
        nk.hfin[240] = -1253861359;
        nk.hfin[241] = -1006301209;
        nk.hfin[242] = -834518532;
        nk.hfin[243] = 1043637840;
        nk.hfin[244] = 1125632112;
        nk.hfin[245] = 1180680432;
        nk.hfin[246] = -1880055021;
        nk.hfin[247] = 148954369;
        nk.hfin[248] = 755624054;
        nk.hfin[249] = 371753537;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static class_9296 create(nk$LegacyTexture var0) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = nk.oh - nk.hfip("hfko", hfkl(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == nk.hfip("hfkp", hfim(int ), (int)47)) break;
            v0 /* !! */  = (long)nk.hfip("hfkq", hfim(int ), (int)48);
        }
        var6_1 = nk.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = nk.oh - nk.hfip("hfkr", hfkl(int ), (int)1)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == nk.hfip("hfkt", hfim(int ), (int)49)) break;
            v1 /* !! */  = (long)nk.hfip("hfku", hfim(int ), (int)50);
        }
        var5_2 /* !! */  = nk.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = nk.oh - nk.hfip("hfkv", hfkl(int ), (int)2)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == nk.hfip("hfkx", hfim(int ), (int)51)) break;
            v2 /* !! */  = (long)nk.hfip("hfkz", hfim(int ), (int)52);
        }
        var4_3 = nk.a;
        if (!var6_1) ** GOTO lbl25
        throw null;
        {
            if (var5_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var5_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return null;
                }
lbl25:
                // 1 sources

                if (var4_3 || var4_3) continue block69;
                v3 /* !! */  = nk.oh;
                if (true) ** GOTO lbl30
                block70: while (true) {
                    v3 /* !! */  = (long)(nk.hfip("hfle", hfkl(int ), (int)4) - nk.hfip("hflc", hfkl(int ), (int)3));
lbl30:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1518798788: {
                            break block70;
                        }
                        case 1078591810: {
                            continue block70;
                        }
                    }
                    break;
                }
                v4 = var0.value();
                v5 /* !! */  = nk.oh;
                if (true) ** GOTO lbl40
                block71: while (true) {
                    v5 /* !! */  = (long)(nk.hfip("hfli", hfkl(int ), (int)6) - nk.hfip("hflh", hfkl(int ), (int)5));
lbl40:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1518798788: {
                            break block71;
                        }
                        case 236899120: {
                            continue block71;
                        }
                    }
                    break;
                }
                v6 = "phobia:legacy-head:" + v4;
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_3 = nk.oh - nk.hfip("hflj", hfkl(int ), (int)7)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == nk.hfip("hfll", hfim(int ), (int)53)) break;
                    v7 /* !! */  = (long)nk.hfip("hflm", hfim(int ), (int)54);
                }
                v8 /* !! */  = nk.oh;
                if (true) ** GOTO lbl55
                block73: while (true) {
                    v8 /* !! */  = (long)(v9 - nk.hfip("hflo", hfkl(int ), (int)8));
lbl55:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -1748611288: {
                            v9 = nk.hfip("hflq", hfkl(int ), (int)9);
                            continue block73;
                        }
                        case -1518798788: {
                            break block73;
                        }
                        case -573487171: {
                            v9 = nk.hfip("hfls", hfkl(int ), (int)10);
                            continue block73;
                        }
                        case 347720008: {
                            v9 = nk.hfip("hflu", hfkl(int ), (int)11);
                            continue block73;
                        }
                    }
                    break;
                }
                v10 = v6.getBytes(StandardCharsets.UTF_8);
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_4 = nk.oh - nk.hfip("hflw", hfkl(int ), (int)12)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v11 /* !! */  == nk.hfip("hflx", hfim(int ), (int)55)) break;
                    v11 /* !! */  = (long)nk.hfip("hfly", hfim(int ), (int)56);
                }
                var1_4 = UUID.nameUUIDFromBytes(v10);
                if (var4_3 || var4_3) continue block69;
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_5 = nk.oh - nk.hfip("hfma", hfkl(int ), (int)13)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == nk.hfip("hfmb", hfim(int ), (int)57)) break;
                    v12 /* !! */  = (long)nk.hfip("hfmc", hfim(int ), (int)58);
                }
                if (var0.signature() == null) ** GOTO lbl112
                if (var4_3) continue block69;
                v13 /* !! */  = nk.oh;
                if (true) ** GOTO lbl86
                block76: while (true) {
                    v13 /* !! */  = (long)(v14 - nk.hfip("hfmd", hfkl(int ), (int)14));
lbl86:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case -1518798788: {
                            break block76;
                        }
                        case 1102434888: {
                            v14 = nk.hfip("hfme", hfkl(int ), (int)15);
                            continue block76;
                        }
                        case 1363304338: {
                            v14 = nk.hfip("hfmg", hfkl(int ), (int)16);
                            continue block76;
                        }
                    }
                    break;
                }
                v15 = var0.signature();
                v16 /* !! */  = nk.oh;
                if (true) ** GOTO lbl100
                block77: while (true) {
                    v16 /* !! */  = (long)(v17 - nk.hfip("hfmh", hfkl(int ), (int)17));
lbl100:
                    // 2 sources

                    switch ((int)v16 /* !! */ ) {
                        case -1518798788: {
                            break block77;
                        }
                        case 354302682: {
                            v17 = nk.hfip("hfmi", hfkl(int ), (int)18);
                            continue block77;
                        }
                        case 577648751: {
                            v17 = nk.hfip("hfmj", hfkl(int ), (int)19);
                            continue block77;
                        }
                    }
                    break;
                }
                if (v15.isBlank()) {
                    if (var4_3) continue block69;
                }
                ** GOTO lbl145
lbl112:
                // 2 sources

                if (var4_3 || var4_3) continue block69;
                while (true) {
                    if ((v18 /* !! */  = (cfr_temp_6 = nk.oh - nk.hfip("hfmk", hfkl(int ), (int)20)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v18 /* !! */  == nk.hfip("hfmm", hfim(int ), (int)59)) break;
                    v18 /* !! */  = (long)nk.hfip("hfmo", hfim(int ), (int)60);
                }
                v19 = v20;
                while (true) {
                    if ((v21 /* !! */  = (cfr_temp_7 = nk.oh - nk.hfip("hfmq", hfkl(int ), (int)21)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v21 /* !! */  == nk.hfip("hfmr", hfim(int ), (int)61)) break;
                    v21 /* !! */  = (long)nk.hfip("hfms", hfim(int ), (int)62);
                }
                v22 = var0.value();
                v23 /* !! */  = nk.oh;
                if (true) ** GOTO lbl129
                block80: while (true) {
                    v23 /* !! */  = (long)(v24 - nk.hfip("hfmt", hfkl(int ), (int)22));
lbl129:
                    // 2 sources

                    switch ((int)v23 /* !! */ ) {
                        case -1801226440: {
                            v24 = nk.hfip("hfmu", hfkl(int ), (int)23);
                            continue block80;
                        }
                        case -1518798788: {
                            break block80;
                        }
                        case 328559079: {
                            v24 = nk.hfip("hfna", hfkl(int ), (int)24);
                            continue block80;
                        }
                        case 828883890: {
                            v24 = nk.hfip("hfnb", hfkl(int ), (int)25);
                            continue block80;
                        }
                    }
                    break;
                }
                v20 = new Property("textures", v22);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl191
lbl145:
                // 1 sources

                if (var4_3 || var4_3) continue block69;
                v25 /* !! */  = nk.oh;
                if (true) ** GOTO lbl150
                block81: while (true) {
                    v25 /* !! */  = (long)(v26 - nk.hfip("hfnc", hfkl(int ), (int)26));
lbl150:
                    // 2 sources

                    switch ((int)v25 /* !! */ ) {
                        case -1518798788: {
                            break block81;
                        }
                        case -1337475679: {
                            v26 = nk.hfip("hfnd", hfkl(int ), (int)27);
                            continue block81;
                        }
                        case -1270809421: {
                            v26 = nk.hfip("hfne", hfkl(int ), (int)28);
                            continue block81;
                        }
                        case 1173725336: {
                            v26 = nk.hfip("hfng", hfkl(int ), (int)29);
                            continue block81;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v27 /* !! */  = (cfr_temp_8 = nk.oh - nk.hfip("hfni", hfkl(int ), (int)30)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v27 /* !! */  == nk.hfip("hfnn", hfim(int ), (int)63)) break;
                    v27 /* !! */  = (long)nk.hfip("hfno", hfim(int ), (int)64);
                }
                v28 = var0.value();
                while (true) {
                    if ((v29 /* !! */  = (cfr_temp_9 = nk.oh - nk.hfip("hfnp", hfkl(int ), (int)31)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                    if (v29 /* !! */  == nk.hfip("hfnq", hfim(int ), (int)65)) break;
                    v29 /* !! */  = (long)nk.hfip("hfnr", hfim(int ), (int)66);
                }
                v30 = var0.signature();
                v31 /* !! */  = nk.oh;
                if (true) ** GOTO lbl178
                block84: while (true) {
                    v31 /* !! */  = (long)(v32 - nk.hfip("hfns", hfkl(int ), (int)32));
lbl178:
                    // 2 sources

                    switch ((int)v31 /* !! */ ) {
                        case -2136979326: {
                            v32 = nk.hfip("hfnu", hfkl(int ), (int)33);
                            continue block84;
                        }
                        case -1518798788: {
                            break block84;
                        }
                        case -1173534919: {
                            v32 = nk.hfip("hfoa", hfkl(int ), (int)34);
                            continue block84;
                        }
                        case 567343100: {
                            v32 = nk.hfip("hfoc", hfkl(int ), (int)35);
                            continue block84;
                        }
                    }
                    break;
                }
                v19 = var2_5 = new Property("textures", v28, v30);
lbl191:
                // 2 sources

                if (var4_3 || var4_3) continue block69;
                while (true) {
                    if ((v33 /* !! */  = (cfr_temp_10 = nk.oh - nk.hfip("hfod", hfkl(int ), (int)36)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
                    if (v33 /* !! */  == nk.hfip("hfoe", hfim(int ), (int)67)) break;
                    v33 /* !! */  = (long)nk.hfip("hfof", hfim(int ), (int)68);
                }
                while (true) {
                    if ((v34 /* !! */  = (cfr_temp_11 = nk.oh - nk.hfip("hfoh", hfkl(int ), (int)37)) == 0L ? 0 : (cfr_temp_11 < 0L ? -1 : 1)) == false) continue;
                    if (v34 /* !! */  == nk.hfip("hfon", hfim(int ), (int)69)) break;
                    v34 /* !! */  = (long)nk.hfip("hfoo", hfim(int ), (int)70);
                }
                v35 = ImmutableMultimap.of((Object)"textures", (Object)var2_5);
                while (true) {
                    if ((v36 /* !! */  = (cfr_temp_12 = nk.oh - nk.hfip("hfoq", hfkl(int ), (int)38)) == 0L ? 0 : (cfr_temp_12 < 0L ? -1 : 1)) == false) continue;
                    if (v36 /* !! */  == nk.hfip("hfor", hfim(int ), (int)71)) break;
                    v36 /* !! */  = (long)nk.hfip("hfos", hfim(int ), (int)72);
                }
                var3_6 = new PropertyMap((Multimap)v35);
                if (!var4_3 && !var4_3) ** break;
                continue block69;
                v37 /* !! */  = nk.oh;
                if (true) ** GOTO lbl215
                block88: while (true) {
                    v37 /* !! */  = (long)(v38 - nk.hfip("hfot", hfkl(int ), (int)39));
lbl215:
                    // 2 sources

                    switch ((int)v37 /* !! */ ) {
                        case -1518798788: {
                            break block88;
                        }
                        case -1069093853: {
                            v38 = nk.hfip("hfoz", hfkl(int ), (int)40);
                            continue block88;
                        }
                        case 1958622271: {
                            v38 = nk.hfip("hfpa", hfkl(int ), (int)41);
                            continue block88;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v39 /* !! */  = (cfr_temp_13 = nk.oh - nk.hfip("hfpd", hfkl(int ), (int)42)) == 0L ? 0 : (cfr_temp_13 < 0L ? -1 : 1)) == false) continue;
                    if (v39 /* !! */  == nk.hfip("hfpe", hfim(int ), (int)73)) break;
                    v39 /* !! */  = (long)nk.hfip("hfpf", hfim(int ), (int)74);
                }
                v40 = new GameProfile(var1_4, "LegacyHead", var3_6);
                while (true) {
                    if ((v41 /* !! */  = (cfr_temp_14 = nk.oh - nk.hfip("hfpg", hfkl(int ), (int)43)) == 0L ? 0 : (cfr_temp_14 < 0L ? -1 : 1)) == false) continue;
                    if (v41 /* !! */  == nk.hfip("hfph", hfim(int ), (int)75)) break;
                    v41 /* !! */  = (long)nk.hfip("hfpl", hfim(int ), (int)76);
                }
                return class_9296.method_73307((GameProfile)v40);
lbl236:
                // 2 sources

                case 0: {
                    var5_2 /* !! */  = (int)nk.hfip("hfpn", hfim(int ), (int)77);
                    if (var6_1) {
                        throw null;
                    }
                }
                case 1: {
                    var5_2 /* !! */  = (int)nk.hfip("hfpp", hfim(int ), (int)78);
                    if (var6_1) {
                        throw null;
                    }
                    ** GOTO lbl288
                }
                case 2: {
                    var5_2 /* !! */  = (int)nk.hfip("hfpr", hfim(int ), (int)79);
                    if (var6_1) {
                        throw null;
                    }
                    ** GOTO lbl283
                }
lbl250:
                // 2 sources

                case 3: {
                    do {
                        var5_2 /* !! */  = (int)nk.hfip("hfps", hfim(int ), (int)80);
                    } while (!var6_1);
                    throw null;
                }
                case 4: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var5_2 /* !! */  = (int)nk.hfip("hfpt", hfim(int ), (int)81);
                        if (var6_1) {
                            throw null;
                        }
                        ** GOTO lbl293
                        break;
                    }
                }
                case 5: {
                    var5_2 /* !! */  = (int)nk.hfip("hfpu", hfim(int ), (int)82);
                    if (var6_1) {
                        throw null;
                    }
                    ** GOTO lbl274
                }
                case 6: {
                    var5_2 /* !! */  = (int)nk.hfip("hfpz", hfim(int ), (int)83);
                    if (var6_1) {
                        throw null;
                    }
                }
                case 7: {
                    var5_2 /* !! */  = (int)nk.hfip("hfqb", hfim(int ), (int)84);
                    if (var6_1) {
                        throw null;
                    }
                }
lbl274:
                // 4 sources

                case 8: {
                    var5_2 /* !! */  = (int)nk.hfip("hfqd", hfim(int ), (int)85);
                    if (var6_1) {
                        throw null;
                    }
                    ** GOTO lbl305
                }
lbl279:
                // 3 sources

                case 9: {
                    var5_2 /* !! */  = (int)nk.hfip("hfqf", hfim(int ), (int)86);
                    if (!var6_1) ** GOTO lbl236
                    throw null;
                }
lbl283:
                // 3 sources

                case 10: {
                    var5_2 /* !! */  = (int)nk.hfip("hfqg", hfim(int ), (int)87);
                    if (var6_1) {
                        throw null;
                    }
                    ** GOTO lbl297
                }
lbl288:
                // 2 sources

                case 11: {
                    var5_2 /* !! */  = (int)nk.hfip("hfqh", hfim(int ), (int)88);
                    if (var6_1) {
                        throw null;
                    }
                    ** GOTO lbl305
                }
lbl293:
                // 2 sources

                case 12: {
                    var5_2 /* !! */  = (int)nk.hfip("hfqi", hfim(int ), (int)89);
                    if (!var6_1) ** GOTO lbl279
                    throw null;
                }
lbl297:
                // 2 sources

                case 13: {
                    var5_2 /* !! */  = (int)nk.hfip("hfqm", hfim(int ), (int)90);
                    if (!var6_1) ** GOTO lbl283
                    throw null;
                }
                case 14: {
                    var5_2 /* !! */  = (int)nk.hfip("hfqo", hfim(int ), (int)91);
                    if (!var6_1) ** GOTO lbl250
                    throw null;
                }
lbl305:
                // 3 sources

                case 15: {
                    var5_2 /* !! */  = (int)nk.hfip("hfqq", hfim(int ), (int)92);
                    if (!var6_1) ** GOTO lbl279
                    throw null;
                }
                case 16: 
            }
        }
        var5_2 /* !! */  = (int)nk.hfip("hfqs", hfim(int ), (int)93);
        ** while (!var6_1)
lbl312:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static nk$LegacyTexture findTexture(class_2487 var0) {
        var9_1 = nk.c;
        var8_2 /* !! */  = nk.b;
        var7_3 = nk.a;
        if (!var9_1) ** GOTO lbl10
        throw null;
        {
            if (var8_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var8_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return null;
                }
lbl10:
                // 1 sources

                if (var7_3 || var7_3) continue block50;
                var1_4 = nk.firstCompound(var0, new String[]{"Properties", "properties"});
                if (var7_3 || var7_3) continue block50;
                if (var1_4 != null) {
                    if (var7_3 || var7_3) continue block50;
                    var2_5 /* !! */  = nk.textureFromList(var1_4.method_10554("textures").orElse(null));
                    if (var7_3 || var7_3) continue block50;
                    if (var2_5 /* !! */  != null) {
                        if (var7_3) continue block50;
                        return var2_5 /* !! */ ;
                    }
                    if (var7_3 || var7_3) continue block50;
                    var2_5 /* !! */  = nk.textureFromList(var1_4.method_10554("Textures").orElse(null));
                    if (var7_3 || var7_3) continue block50;
                    if (var2_5 /* !! */  != null) {
                        if (var7_3) continue block50;
                        return var2_5 /* !! */ ;
                    }
                }
                if (var7_3 || var7_3) continue block50;
                var2_5 /* !! */  = var0.method_10554("properties").orElse(null);
                if (var7_3 || var7_3) continue block50;
                if (var2_5 /* !! */  == null) ** GOTO lbl61
                if (var7_3 || var7_3) continue block50;
                var3_6 = nk.hfip("hfws", hfim(int ), (int)144);
                if (var7_3) continue block50;
                do {
                    if (var7_3 || var7_3) continue block50;
                    if (var3_6 >= var2_5 /* !! */ .size()) ** GOTO lbl61
                    if (var7_3 || var7_3) continue block50;
                    var4_7 = var2_5 /* !! */ .method_10602((int)var3_6).orElse(null);
                    if (var7_3 || var7_3) continue block50;
                    if (var4_7 == null) {
                        if (var7_3) continue block50;
                        if (var9_1) {
                            throw null;
                        }
                    } else {
                        if (var7_3 || var7_3) continue block50;
                        var5_8 = nk.firstString(var4_7, new String[]{"name", "Name"});
                        if (var7_3 || var7_3) continue block50;
                        if (var5_8 != null) {
                            if (var7_3) continue block50;
                            if (var5_8.equalsIgnoreCase("textures")) {
                                if (var7_3 || var7_3) continue block50;
                                var6_9 = nk.textureFromCompound(var4_7);
                                if (var7_3 || var7_3) continue block50;
                                if (var6_9 != null) {
                                    if (var7_3) continue block50;
                                    return var6_9;
                                }
                            }
                        }
                    }
                    if (var7_3 || var7_3) continue block50;
                    ++var3_6;
                    if (var7_3) continue block50;
                } while (!var9_1);
                throw null;
lbl61:
                // 2 sources

                if (!var7_3 && !var7_3) ** break;
                continue block50;
                return null;
lbl64:
                // 2 sources

                case 0: {
                    var8_2 /* !! */  = (int)nk.hfip("hfwz", hfim(int ), (int)145);
                    if (var9_1) {
                        throw null;
                    }
                    ** GOTO lbl238
                }
lbl69:
                // 3 sources

                case 1: {
                    var8_2 /* !! */  = (int)nk.hfip("hfxa", hfim(int ), (int)146);
                    if (var9_1) {
                        throw null;
                    }
                    ** GOTO lbl173
                }
                case 2: {
                    do {
                        var8_2 /* !! */  = (int)nk.hfip("hfxf", hfim(int ), (int)147);
                    } while (!var9_1);
                    throw null;
                }
lbl79:
                // 4 sources

                case 3: {
                    var8_2 /* !! */  = (int)nk.hfip("hfxh", hfim(int ), (int)148);
                    if (var9_1) {
                        throw null;
                    }
                    ** GOTO lbl254
                }
lbl84:
                // 2 sources

                case 4: {
                    var8_2 /* !! */  = (int)nk.hfip("hfxj", hfim(int ), (int)149);
                    if (var9_1) {
                        throw null;
                    }
                    ** GOTO lbl266
                }
lbl89:
                // 2 sources

                case 5: {
                    var8_2 /* !! */  = (int)nk.hfip("hfxk", hfim(int ), (int)150);
                    if (var9_1) {
                        throw null;
                    }
                    ** GOTO lbl128
                }
                case 6: {
                    var8_2 /* !! */  = (int)nk.hfip("hfxl", hfim(int ), (int)151);
                    if (var9_1) {
                        throw null;
                    }
                    ** GOTO lbl150
                }
lbl99:
                // 2 sources

                case 7: {
                    var8_2 /* !! */  = (int)nk.hfip("hfxm", hfim(int ), (int)152);
                    if (var9_1) {
                        throw null;
                    }
                    ** GOTO lbl266
                }
                case 8: {
                    var8_2 /* !! */  = (int)nk.hfip("hfxn", hfim(int ), (int)153);
                    if (!var9_1) ** GOTO lbl79
                    throw null;
                }
                case 9: {
                    var8_2 /* !! */  = (int)nk.hfip("hfxs", hfim(int ), (int)154);
                    if (var9_1) {
                        throw null;
                    }
                    ** GOTO lbl195
                }
                case 10: {
                    var8_2 /* !! */  = (int)nk.hfip("hfxv", hfim(int ), (int)155);
                    if (var9_1) {
                        throw null;
                    }
                    ** GOTO lbl128
                }
                case 11: {
                    var8_2 /* !! */  = (int)nk.hfip("hfxw", hfim(int ), (int)156);
                    if (var9_1) {
                        throw null;
                    }
                    ** GOTO lbl230
                }
lbl123:
                // 2 sources

                case 12: {
                    var8_2 /* !! */  = (int)nk.hfip("hfxx", hfim(int ), (int)157);
                    if (var9_1) {
                        throw null;
                    }
                    ** GOTO lbl163
                }
lbl128:
                // 3 sources

                case 13: {
                    var8_2 /* !! */  = (int)nk.hfip("hfxy", hfim(int ), (int)158);
                    if (!var9_1) ** GOTO lbl79
                    throw null;
                }
lbl132:
                // 3 sources

                case 14: {
                    var8_2 /* !! */  = (int)nk.hfip("hfxz", hfim(int ), (int)159);
                    if (!var9_1) ** GOTO lbl69
                    throw null;
                }
                case 15: {
                    var8_2 /* !! */  = (int)nk.hfip("hfya", hfim(int ), (int)160);
                    if (!var9_1) ** GOTO lbl64
                    throw null;
                }
                case 16: {
                    var8_2 /* !! */  = (int)nk.hfip("hfyg", hfim(int ), (int)161);
                    if (var9_1) {
                        throw null;
                    }
                    ** GOTO lbl155
                }
                case 17: {
                    var8_2 /* !! */  = (int)nk.hfip("hfyh", hfim(int ), (int)162);
                    if (var9_1) {
                        throw null;
                    }
                    ** GOTO lbl221
                }
lbl150:
                // 2 sources

                case 18: {
                    var8_2 /* !! */  = (int)nk.hfip("hfyi", hfim(int ), (int)163);
                    if (var9_1) {
                        throw null;
                    }
                    ** GOTO lbl173
                }
lbl155:
                // 3 sources

                case 19: {
                    var8_2 /* !! */  = (int)nk.hfip("hfyj", hfim(int ), (int)164);
                    if (!var9_1) ** GOTO lbl79
                    throw null;
                }
                case 20: {
                    var8_2 /* !! */  = (int)nk.hfip("hfyp", hfim(int ), (int)165);
                    if (!var9_1) ** GOTO lbl89
                    throw null;
                }
lbl163:
                // 3 sources

                case 21: {
                    var8_2 /* !! */  = (int)nk.hfip("hfyr", hfim(int ), (int)166);
                    if (var9_1) {
                        throw null;
                    }
                    ** GOTO lbl242
                }
lbl168:
                // 2 sources

                case 22: {
                    var8_2 /* !! */  = (int)nk.hfip("hfyt", hfim(int ), (int)167);
                    if (var9_1) {
                        throw null;
                    }
                    ** GOTO lbl230
                }
lbl173:
                // 3 sources

                case 23: {
                    var8_2 /* !! */  = (int)nk.hfip("hfyu", hfim(int ), (int)168);
                    if (!var9_1) ** GOTO lbl168
                    throw null;
                }
lbl177:
                // 2 sources

                case 24: {
                    var8_2 /* !! */  = (int)nk.hfip("hfyv", hfim(int ), (int)169);
                    if (!var9_1) ** GOTO lbl132
                    throw null;
                }
lbl181:
                // 2 sources

                case 25: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var8_2 /* !! */  = (int)nk.hfip("hfyw", hfim(int ), (int)170);
                        if (!var9_1) ** GOTO lbl155
                        throw null;
                    }
                }
                case 26: {
                    var8_2 /* !! */  = (int)nk.hfip("hfyx", hfim(int ), (int)171);
                    if (var9_1) {
                        throw null;
                    }
                    ** GOTO lbl250
                }
lbl191:
                // 2 sources

                case 27: {
                    var8_2 /* !! */  = (int)nk.hfip("hfzd", hfim(int ), (int)172);
                    if (!var9_1) ** GOTO lbl132
                    throw null;
                }
lbl195:
                // 2 sources

                case 28: {
                    var8_2 /* !! */  = (int)nk.hfip("hfzf", hfim(int ), (int)173);
                    if (!var9_1) break block50;
                    throw null;
                }
                case 29: {
                    var8_2 /* !! */  = (int)nk.hfip("hfzh", hfim(int ), (int)174);
                    if (var9_1) {
                        throw null;
                    }
                    ** GOTO lbl271
                }
                case 30: {
                    var8_2 /* !! */  = (int)nk.hfip("hfzi", hfim(int ), (int)175);
                    if (var9_1) {
                        throw null;
                    }
                    ** GOTO lbl234
                }
lbl209:
                // 2 sources

                case 31: {
                    var8_2 /* !! */  = (int)nk.hfip("hfzj", hfim(int ), (int)176);
                    if (!var9_1) ** GOTO lbl181
                    throw null;
                }
                case 32: {
                    var8_2 /* !! */  = (int)nk.hfip("hfzk", hfim(int ), (int)177);
                    if (!var9_1) ** GOTO lbl69
                    throw null;
                }
                case 33: {
                    var8_2 /* !! */  = (int)nk.hfip("hfzl", hfim(int ), (int)178);
                    if (!var9_1) ** GOTO lbl209
                    throw null;
                }
lbl221:
                // 3 sources

                case 34: {
                    var8_2 /* !! */  = (int)nk.hfip("hfzr", hfim(int ), (int)179);
                    if (!var9_1) ** GOTO lbl99
                    throw null;
                }
lbl225:
                // 2 sources

                case 35: {
                    var8_2 /* !! */  = (int)nk.hfip("hfzt", hfim(int ), (int)180);
                    if (var9_1) {
                        throw null;
                    }
                    ** GOTO lbl238
                }
lbl230:
                // 3 sources

                case 36: {
                    var8_2 /* !! */  = (int)nk.hfip("hfzu", hfim(int ), (int)181);
                    if (!var9_1) ** GOTO lbl123
                    throw null;
                }
lbl234:
                // 3 sources

                case 37: {
                    var8_2 /* !! */  = (int)nk.hfip("hfzv", hfim(int ), (int)182);
                    if (!var9_1) break block50;
                    throw null;
                }
lbl238:
                // 3 sources

                case 38: {
                    var8_2 /* !! */  = (int)nk.hfip("hfzw", hfim(int ), (int)183);
                    if (!var9_1) ** GOTO lbl234
                    throw null;
                }
lbl242:
                // 2 sources

                case 39: {
                    var8_2 /* !! */  = (int)nk.hfip("hfzx", hfim(int ), (int)184);
                    if (!var9_1) ** GOTO lbl84
                    throw null;
                }
lbl246:
                // 2 sources

                case 40: {
                    var8_2 /* !! */  = (int)nk.hfip("hfzy", hfim(int ), (int)185);
                    if (!var9_1) ** GOTO lbl191
                    throw null;
                }
lbl250:
                // 2 sources

                case 41: {
                    var8_2 /* !! */  = (int)nk.hfip("hgaf", hfim(int ), (int)186);
                    if (!var9_1) ** GOTO lbl163
                    throw null;
                }
lbl254:
                // 2 sources

                case 42: {
                    var8_2 /* !! */  = (int)nk.hfip("hgag", hfim(int ), (int)187);
                    if (!var9_1) ** GOTO lbl225
                    throw null;
                }
                case 43: {
                    var8_2 /* !! */  = (int)nk.hfip("hgah", hfim(int ), (int)188);
                    if (!var9_1) ** GOTO lbl177
                    throw null;
                }
                case 44: {
                    var8_2 /* !! */  = (int)nk.hfip("hgai", hfim(int ), (int)189);
                    if (!var9_1) ** GOTO lbl246
                    throw null;
                }
lbl266:
                // 3 sources

                case 45: {
                    do {
                        var8_2 /* !! */  = (int)nk.hfip("hgaj", hfim(int ), (int)190);
                    } while (!var9_1);
                    throw null;
                }
lbl271:
                // 2 sources

                case 46: {
                    var8_2 /* !! */  = (int)nk.hfip("hgam", hfim(int ), (int)191);
                    if (!var9_1) ** GOTO lbl221
                    throw null;
                }
                case 47: 
            }
        }
        var8_2 /* !! */  = (int)nk.hfip("hgas", hfim(int ), (int)192);
        ** while (!var9_1)
lbl278:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void hgkh() {
        nk.hfin[100] = 2109498156;
        nk.hfin[101] = 930475359;
        nk.hfin[102] = -775198855;
        nk.hfin[103] = 1584064263;
        nk.hfin[104] = -617547460;
        nk.hfin[105] = 531724542;
        nk.hfin[106] = -206219068;
        nk.hfin[107] = -1607567348;
        nk.hfin[108] = 992809284;
        nk.hfin[109] = -1118881456;
        nk.hfin[110] = 259224719;
        nk.hfin[111] = 1748645564;
        nk.hfin[112] = -680087294;
        nk.hfin[113] = 1812515731;
        nk.hfin[114] = 2061891514;
        nk.hfin[115] = -2139866034;
        nk.hfin[116] = -565005379;
        nk.hfin[117] = 1856656107;
        nk.hfin[118] = -509693667;
        nk.hfin[119] = 218852136;
        nk.hfin[120] = 1755594376;
        nk.hfin[121] = -851209964;
        nk.hfin[122] = 1344631560;
        nk.hfin[123] = 216998938;
        nk.hfin[124] = -879082724;
        nk.hfin[125] = -593496192;
        nk.hfin[126] = -61135064;
        nk.hfin[127] = -531506922;
        nk.hfin[128] = -388319549;
        nk.hfin[129] = 942704893;
        nk.hfin[130] = 1048908613;
        nk.hfin[131] = -1875516999;
        nk.hfin[132] = -733808647;
        nk.hfin[133] = 223361432;
        nk.hfin[134] = 1987650744;
        nk.hfin[135] = 1029177625;
        nk.hfin[136] = 301260793;
        nk.hfin[137] = 575501796;
        nk.hfin[138] = -279505337;
        nk.hfin[139] = 768587763;
        nk.hfin[140] = -1711413611;
        nk.hfin[141] = -1143998851;
        nk.hfin[142] = 1919269082;
        nk.hfin[143] = 314841494;
        nk.hfin[144] = 727673256;
        nk.hfin[145] = -1747778160;
        nk.hfin[146] = 902767835;
        nk.hfin[147] = -11749393;
        nk.hfin[148] = -1698669333;
        nk.hfin[149] = 77450765;
        nk.hfin[150] = -103391279;
        nk.hfin[151] = 1054923230;
        nk.hfin[152] = 122716803;
        nk.hfin[153] = 1879640227;
        nk.hfin[154] = 1472541154;
        nk.hfin[155] = -2128186581;
        nk.hfin[156] = 1044615867;
        nk.hfin[157] = 1887606833;
        nk.hfin[158] = 1954101227;
        nk.hfin[159] = -669676381;
        nk.hfin[160] = 1254946026;
        nk.hfin[161] = -1758139082;
        nk.hfin[162] = -782012867;
        nk.hfin[163] = -1820584446;
        nk.hfin[164] = -1813319485;
        nk.hfin[165] = -1967046169;
        nk.hfin[166] = -1170358843;
        nk.hfin[167] = 356078261;
        nk.hfin[168] = 1960474456;
        nk.hfin[169] = -1990655027;
        nk.hfin[170] = 1877888324;
        nk.hfin[171] = -1152953539;
        nk.hfin[172] = -822416548;
        nk.hfin[173] = -1594622590;
        nk.hfin[174] = 1514707271;
        nk.hfin[175] = 320615874;
        nk.hfin[176] = 779848871;
        nk.hfin[177] = -1574561896;
        nk.hfin[178] = 651729509;
        nk.hfin[179] = -866903024;
        nk.hfin[180] = 614623388;
        nk.hfin[181] = 384876718;
        nk.hfin[182] = 988051894;
        nk.hfin[183] = -1708127425;
        nk.hfin[184] = -48827033;
        nk.hfin[185] = -1206299616;
        nk.hfin[186] = 1989516284;
        nk.hfin[187] = 595930449;
        nk.hfin[188] = -577193176;
        nk.hfin[189] = -363916882;
        nk.hfin[190] = 788660826;
        nk.hfin[191] = -1166334742;
        nk.hfin[192] = 1127001922;
        nk.hfin[193] = 2130429002;
        nk.hfin[194] = -459652826;
        nk.hfin[195] = 23722147;
        nk.hfin[196] = -1057398220;
        nk.hfin[197] = 1052340786;
        nk.hfin[198] = -1609717562;
        nk.hfin[199] = -566356569;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static String firstString(class_2487 var0, String ... var1_1) {
        v0 /* !! */  = nk.oh;
        if (true) ** GOTO lbl5
        block52: while (true) {
            v0 /* !! */  = (long)(v1 - nk.hfip("hftu", hfkl(int ), (int)54));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1518798788: {
                    break block52;
                }
                case -1097070988: {
                    v1 = nk.hfip("hftv", hfkl(int ), (int)55);
                    continue block52;
                }
                case 599017588: {
                    v1 = nk.hfip("hftw", hfkl(int ), (int)56);
                    continue block52;
                }
            }
            break;
        }
        var9_2 = nk.c;
        v2 /* !! */  = nk.oh;
        if (true) ** GOTO lbl19
        block53: while (true) {
            v2 /* !! */  = (long)(nk.hfip("hfua", hfkl(int ), (int)58) - nk.hfip("hftx", hfkl(int ), (int)57));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1518798788: {
                    break block53;
                }
                case -768156093: {
                    continue block53;
                }
            }
            break;
        }
        var8_3 /* !! */  = nk.b;
        v3 /* !! */  = nk.oh;
        if (true) ** GOTO lbl29
        block54: while (true) {
            v3 /* !! */  = (long)(v4 - nk.hfip("hfuc", hfkl(int ), (int)59));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1518798788: {
                    break block54;
                }
                case -48082001: {
                    v4 = nk.hfip("hfue", hfkl(int ), (int)60);
                    continue block54;
                }
                case 490744249: {
                    v4 = nk.hfip("hfug", hfkl(int ), (int)61);
                    continue block54;
                }
            }
            break;
        }
        var7_4 = nk.a;
        if (var9_2) {
            throw null;
lbl41:
            // 13 sources

            return null;
        }
        if (var8_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var8_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var7_4 || var7_4) ** GOTO lbl41
                var2_5 = var1_1;
                if (var7_4) ** GOTO lbl41
                var3_6 = var2_5.length;
                if (var7_4) ** GOTO lbl41
                var4_7 = nk.hfip("hfuj", hfim(int ), (int)121);
                if (var7_4) ** GOTO lbl41
                do {
                    if (var7_4 || var7_4) ** GOTO lbl41
                    if (var4_7 >= var3_6) ** GOTO lbl106
                    if (var7_4) ** GOTO lbl41
                    var5_8 = var2_5[var4_7];
                    if (var7_4 || var7_4) ** GOTO lbl41
                    v5 /* !! */  = nk.oh;
                    if (true) ** GOTO lbl63
                    block57: while (true) {
                        v5 /* !! */  = (long)(v6 - nk.hfip("hfuk", hfkl(int ), (int)62));
lbl63:
                        // 2 sources

                        switch ((int)v5 /* !! */ ) {
                            case -2101054797: {
                                v6 = nk.hfip("hful", hfkl(int ), (int)63);
                                continue block57;
                            }
                            case -1518798788: {
                                break block57;
                            }
                            case 104757097: {
                                v6 = nk.hfip("hfup", hfkl(int ), (int)64);
                                continue block57;
                            }
                            case 221927452: {
                                v6 = nk.hfip("hfur", hfkl(int ), (int)65);
                                continue block57;
                            }
                        }
                        break;
                    }
                    v7 = var0.method_10558(var5_8);
                    v8 /* !! */  = nk.oh;
                    if (true) ** GOTO lbl80
                    block58: while (true) {
                        v8 /* !! */  = (long)(nk.hfip("hfuu", hfkl(int ), (int)67) - nk.hfip("hfut", hfkl(int ), (int)66));
lbl80:
                        // 2 sources

                        switch ((int)v8 /* !! */ ) {
                            case -1518798788: {
                                break block58;
                            }
                            case 1768291374: {
                                continue block58;
                            }
                        }
                        break;
                    }
                    var6_9 = v7.orElse(null);
                    if (var7_4 || var7_4) ** GOTO lbl41
                    if (var6_9 == null) ** GOTO lbl101
                    if (var7_4) ** GOTO lbl41
                    v9 /* !! */  = nk.oh;
                    if (true) ** GOTO lbl93
                    block59: while (true) {
                        v9 /* !! */  = (long)(nk.hfip("hfuy", hfkl(int ), (int)69) - nk.hfip("hfux", hfkl(int ), (int)68));
lbl93:
                        // 2 sources

                        switch ((int)v9 /* !! */ ) {
                            case -1518798788: {
                                break block59;
                            }
                            case 151564689: {
                                continue block59;
                            }
                        }
                        break;
                    }
                    if (var6_9.isBlank()) ** GOTO lbl101
                    if (var7_4) ** GOTO lbl41
                    return var6_9;
lbl101:
                    // 2 sources

                    if (var7_4 || var7_4) ** GOTO lbl41
                    ++var4_7;
                    if (var7_4) ** GOTO lbl41
                } while (!var9_2);
                throw null;
lbl106:
                // 1 sources

                if (!var7_4 && !var7_4) ** break;
                ** continue;
                return null;
            }
            case 0: {
                var8_3 /* !! */  = (int)nk.hfip("hfuz", hfim(int ), (int)122);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl183
            }
lbl114:
            // 2 sources

            case 1: {
                var8_3 /* !! */  = (int)nk.hfip("hfve", hfim(int ), (int)123);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl183
            }
lbl119:
            // 3 sources

            case 2: {
                var8_3 /* !! */  = (int)nk.hfip("hfvf", hfim(int ), (int)124);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl175
            }
lbl124:
            // 2 sources

            case 3: {
                var8_3 /* !! */  = (int)nk.hfip("hfvh", hfim(int ), (int)125);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl143
            }
lbl129:
            // 2 sources

            case 4: {
                var8_3 /* !! */  = (int)nk.hfip("hfvj", hfim(int ), (int)126);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl183
            }
            case 5: {
                var8_3 /* !! */  = (int)nk.hfip("hfvk", hfim(int ), (int)127);
                if (!var9_2) break;
                throw null;
            }
lbl138:
            // 3 sources

            case 6: {
                var8_3 /* !! */  = (int)nk.hfip("hfvl", hfim(int ), (int)128);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl199
            }
lbl143:
            // 2 sources

            case 7: {
                var8_3 /* !! */  = (int)nk.hfip("hfvm", hfim(int ), (int)129);
                if (!var9_2) ** GOTO lbl129
                throw null;
            }
lbl147:
            // 2 sources

            case 8: {
                var8_3 /* !! */  = (int)nk.hfip("hfvo", hfim(int ), (int)130);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl183
            }
            case 9: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var8_3 /* !! */  = (int)nk.hfip("hfvq", hfim(int ), (int)131);
                    if (!var9_2) ** GOTO lbl124
                    throw null;
                }
            }
            case 10: {
                var8_3 /* !! */  = (int)nk.hfip("hfvr", hfim(int ), (int)132);
                if (!var9_2) ** GOTO lbl138
                throw null;
            }
            case 11: {
                do {
                    var8_3 /* !! */  = (int)nk.hfip("hfvt", hfim(int ), (int)133);
                } while (!var9_2);
                throw null;
            }
            case 12: {
                var8_3 /* !! */  = (int)nk.hfip("hfvv", hfim(int ), (int)134);
                if (!var9_2) ** GOTO lbl119
                throw null;
            }
lbl170:
            // 3 sources

            case 13: {
                var8_3 /* !! */  = (int)nk.hfip("hfvx", hfim(int ), (int)135);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl199
            }
lbl175:
            // 3 sources

            case 14: {
                var8_3 /* !! */  = (int)nk.hfip("hfvy", hfim(int ), (int)136);
                if (!var9_2) ** GOTO lbl147
                throw null;
            }
            case 15: {
                var8_3 /* !! */  = (int)nk.hfip("hfwb", hfim(int ), (int)137);
                if (!var9_2) ** GOTO lbl119
                throw null;
            }
lbl183:
            // 5 sources

            case 16: {
                var8_3 /* !! */  = (int)nk.hfip("hfwc", hfim(int ), (int)138);
                if (!var9_2) ** GOTO lbl114
                throw null;
            }
            case 17: {
                var8_3 /* !! */  = (int)nk.hfip("hfwe", hfim(int ), (int)139);
                if (!var9_2) ** GOTO lbl175
                throw null;
            }
            case 18: {
                var8_3 /* !! */  = (int)nk.hfip("hfwg", hfim(int ), (int)140);
                if (!var9_2) ** GOTO lbl170
                throw null;
            }
            case 19: {
                var8_3 /* !! */  = (int)nk.hfip("hfwh", hfim(int ), (int)141);
                if (!var9_2) ** GOTO lbl138
                throw null;
            }
lbl199:
            // 3 sources

            case 20: {
                var8_3 /* !! */  = (int)nk.hfip("hfwi", hfim(int ), (int)142);
                if (!var9_2) ** GOTO lbl170
                throw null;
            }
            case 21: 
        }
        var8_3 /* !! */  = (int)nk.hfip("hfwj", hfim(int ), (int)143);
        ** while (!var9_2)
lbl206:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void hgob() {
        nk.hfkn[100] = -8348125672584244675L;
        nk.hfkn[101] = -6274433498743039991L;
        nk.hfkn[102] = 660574658727852735L;
        nk.hfkn[103] = 4276741527395632168L;
        nk.hfkn[104] = -5799574681274091601L;
        nk.hfkn[105] = -360628216211928488L;
        nk.hfkn[106] = 2017192459405905382L;
        nk.hfkn[107] = -5606120400030721798L;
        nk.hfkn[108] = 4571577137795666981L;
        nk.hfkn[109] = 8595050976549777531L;
        nk.hfkn[110] = -2687409631097420540L;
        nk.hfkn[111] = 5260463507234137543L;
        nk.hfkn[112] = -4469484131237873952L;
        nk.hfkn[113] = -1442924227561796675L;
        nk.hfkn[114] = 3780970488290701129L;
        nk.hfkn[115] = 1329198318252234245L;
    }
}

