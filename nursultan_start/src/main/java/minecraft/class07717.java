/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Splitter
 *  com.google.common.base.Strings
 *  com.google.common.collect.Comparators
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Lists
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.Dynamic
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 *  java.lang.MatchException
 *  java.lang.runtime.SwitchBootstraps
 *  minecraft.class00392
 *  minecraft.class00500
 *  minecraft.class00507
 *  minecraft.class00522
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class02055
 *  minecraft.class03556
 *  minecraft.class04206
 *  minecraft.class04227
 *  minecraft.class04688
 *  minecraft.class04824
 *  minecraft.class04825
 *  minecraft.class05946
 *  minecraft.class06995
 *  minecraft.class06997
 *  minecraft.class07001
 *  minecraft.class07029
 *  minecraft.class07529
 *  minecraft.class08092
 *  minecraft.class08329
 *  minecraft.class08884
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.google.common.base.Splitter;
import com.google.common.base.Strings;
import com.google.common.collect.Comparators;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.lang.runtime.SwitchBootstraps;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import minecraft.class00392;
import minecraft.class00500;
import minecraft.class00507;
import minecraft.class00522;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class02055;
import minecraft.class03556;
import minecraft.class04206;
import minecraft.class04227;
import minecraft.class04688;
import minecraft.class04824;
import minecraft.class04825;
import minecraft.class05946;
import minecraft.class06995;
import minecraft.class06997;
import minecraft.class07001;
import minecraft.class07029;
import minecraft.class07529;
import minecraft.class07707;
import minecraft.class07709;
import minecraft.class07741;
import minecraft.class07755;
import minecraft.class07757;
import minecraft.class08092;
import minecraft.class08329;
import minecraft.class08884;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public final class class07717 {
    private static final Comparator<class07741> y = Comparator.comparingInt(class077412 -> class077412.N(1, 0)).thenComparingInt(class077412 -> class077412.N(0, 0)).thenComparingInt(class077412 -> class077412.N(2, 0));
    private static final Comparator<class07741> L = Comparator.comparingDouble(class077412 -> class077412.N(1, 0.0)).thenComparingDouble(class077412 -> class077412.N(0, 0.0)).thenComparingDouble(class077412 -> class077412.N(2, 0.0));
    private static final Codec<class05946<class00891>> u = class05946.N((class05946)class04227.Z);
    public static final String N = "data";
    private static final char i = '{';
    private static final char R = '}';
    private static final String M = ",";
    private static final char B = ':';
    private static final Splitter Z = Splitter.on((String)",");
    private static final Splitter z = Splitter.on((char)':').limit(2);
    private static final Logger U = LogUtils.getLogger();
    private static final int E = 2;
    private static final int W = -1;

    static class07001 L(class07001 class070013) {
        class07741 class077412 = class070013.s("palette");
        Map map = (Map)class077412.stream().flatMap(class077092 -> class077092.ah_().stream()).collect(ImmutableMap.toImmutableMap(Function.identity(), class07717::y));
        Optional var3 = class070013.P("palettes");
        if (var3.isPresent()) {
            class070013.N("palettes", (class07709)((Object)((class07741)var3.get()).z().map(class070012 -> map.keySet().stream().map(string -> (String)class070012.Z(string).orElseThrow()).map(class07717::y).collect(Collectors.toCollection(class07741::new))).collect(Collectors.toCollection(class07741::new))));
            class070013.b("palette");
        } else {
            class070013.N("palette", (class07709)((Object)map.values().stream().collect(Collectors.toCollection(class07741::new))));
        }
        Optional var4 = class070013.P(N);
        if (var4.isPresent()) {
            Object2IntOpenHashMap object2IntOpenHashMap = new Object2IntOpenHashMap();
            object2IntOpenHashMap.defaultReturnValue(-1);
            for (int i = 0; i < class077412.size(); ++i) {
                object2IntOpenHashMap.put((Object)class077412.W(i).orElseThrow(), i);
            }
            class07741 class077413 = (class07741)var4.get();
            for (int i = 0; i < class077413.size(); ++i) {
                class07001 class070014 = class077413.N(i).orElseThrow();
                String string = (String)class070014.Z("state").orElseThrow();
                int n = object2IntOpenHashMap.getInt((Object)string);
                if (n == -1) {
                    throw new IllegalStateException("Entry " + string + " missing from palette");
                }
                class070014.N("state", n);
            }
            class070013.N("blocks", (class07709)((Object)class077413));
            class070013.b(N);
        }
        return class070013;
    }

    private class07717() {
    }

    public static class07001 i(class07001 class070012) {
        int n = class07529.y().comp_4026().y();
        return class07717.N(class070012, n);
    }

    static String u(class07001 class070013) {
        StringBuilder stringBuilder = new StringBuilder((String)class070013.Z("Name").orElseThrow());
        class070013.W("Properties").ifPresent(class070012 -> {
            String string = class070012.M().stream().sorted(Map.Entry.comparingByKey()).map(entry -> (String)entry.getKey() + ":" + ((class07709)entry.getValue()).ah_().orElseThrow()).collect(Collectors.joining(M));
            stringBuilder.append('{').append(string).append('}');
        });
        return stringBuilder.toString();
    }

    static class07001 y(class07001 class070013) {
        class07741 class077412;
        Optional var4;
        Optional var2 = class070013.P("palettes");
        class07741 class077413 = var2.isPresent() ? ((class07741)var2.get()).R(0) : class070013.s("palette");
        class07741 class077415 = class077413.z().map(class07717::u).map(class07707::N).collect(Collectors.toCollection(class07741::new));
        class070013.N("palette", (class07709)((Object)class077415));
        if (var2.isPresent()) {
            class07741 class077416 = new class07741();
            ((class07741)var2.get()).stream().flatMap(class077092 -> class077092.al_().stream()).forEach(class077414 -> {
                class07001 class070012 = new class07001();
                for (int i = 0; i < class077414.size(); ++i) {
                    class070012.N_67(class077415.W(i).orElseThrow(), class07717.u(class077414.N(i).orElseThrow()));
                }
                class077416.add(class070012);
            });
            class070013.N("palettes", (class07709)((Object)class077416));
        }
        if ((var4 = class070013.P("entities")).isPresent()) {
            class077412 = ((class07741)var4.get()).z().sorted(Comparator.comparing(class070012 -> class070012.P("pos"), Comparators.emptiesLast(L))).collect(Collectors.toCollection(class07741::new));
            class070013.N("entities", (class07709)((Object)class077412));
        }
        class077412 = class070013.P("blocks").stream().flatMap(class07741::z).sorted(Comparator.comparing(class070012 -> class070012.P("pos"), Comparators.emptiesLast(y))).peek(class070012 -> class070012.N_67("state", class077415.W(class070012.y("state", 0)).orElseThrow())).collect(Collectors.toCollection(class07741::new));
        class070013.N(N, (class07709)((Object)class077412));
        class070013.b("blocks");
        return class070013;
    }

    static class07001 y(String string) {
        String string3;
        class07001 class070012 = new class07001();
        int n = string.indexOf(123);
        if (n >= 0) {
            string3 = string.substring(0, n);
            class07001 class070013 = new class07001();
            if (n + 2 <= string.length()) {
                String string4 = string.substring(n + 1, string.indexOf(125, n));
                Z.split((CharSequence)string4).forEach(string2 -> {
                    List var3 = z.splitToList((CharSequence)string2);
                    if (var3.size() == 2) {
                        class070013.N_67((String)var3.get(0), (String)var3.get(1));
                    } else {
                        U.error("Something went wrong parsing: '{}' -- incorrect gamedata!", (Object)string);
                    }
                });
                class070012.N("Properties", (class07709)class070013);
            }
        } else {
            string3 = string;
        }
        class070012.N_67("Name", string3);
        return class070012;
    }

    public static int y(Dynamic<?> dynamic, int n) {
        return dynamic.get("DataVersion").asInt(n);
    }

    public static class00392 y(class07709 class077092) {
        return new class04824("").N(class077092);
    }

    public static int y(class07001 class070012, int n) {
        return class070012.y("DataVersion", n);
    }

    private static <S extends class00522<?, S>, T extends Comparable<T>> S N(S s, class08092<T> class080922, String string, class07001 class070012, class07001 class070013) {
        Optional optional = class070012.Z(string).flatMap(arg_0 -> class080922.y(arg_0));
        if (optional.isPresent()) {
            return (S)((class00522)s.y(class080922, (Comparable)optional.get()));
        }
        U.warn("Unable to read property: {} with value: {} for blockstate: {}", new Object[]{string, class070012.N(string), class070013});
        return s;
    }

    public static boolean N(@Nullable class07709 class077092, @Nullable class07709 class077093, boolean bl) {
        if (class077092 == class077093) {
            return true;
        }
        if (class077092 == null) {
            return true;
        }
        if (class077093 == null) {
            return false;
        }
        if (!class077092.getClass().equals(class077093.getClass())) {
            return false;
        }
        if (class077092 instanceof class07001) {
            class07001 class070012 = (class07001)class077092;
            class07001 class070013 = (class07001)class077093;
            if (class070013.Z() < class070012.Z()) {
                return false;
            }
            for (Map.Entry entry : class070012.M()) {
                class07709 class077094 = (class07709)entry.getValue();
                if (class07717.N(class077094, class070013.N((String)entry.getKey()), bl)) continue;
                return false;
            }
            return true;
        }
        if (class077092 instanceof class07741) {
            class07741 class077412 = (class07741)((Object)class077092);
            if (bl) {
                class07741 class077413 = (class07741)((Object)class077093);
                if (class077412.isEmpty()) {
                    return class077413.isEmpty();
                }
                if (class077413.size() < class077412.size()) {
                    return false;
                }
                for (class07709 class077095 : class077412) {
                    boolean bl2 = false;
                    for (class07709 class077096 : class077413) {
                        if (!class07717.N(class077095, class077096, bl)) continue;
                        bl2 = true;
                        break;
                    }
                    if (bl2) continue;
                    return false;
                }
                return true;
            }
        }
        return class077092.equals(class077093);
    }

    public static void N(class08329 class083292) {
        int n = class07529.y().comp_4026().y();
        class07717.N(class083292, n);
    }

    public static class00500 N(class02055<class00891> class020552, class07001 class070012) {
        Optional optional = class070012.N_15("Name", u).flatMap(arg_0 -> class020552.N(arg_0));
        if (optional.isEmpty()) {
            return class00869.N.W();
        }
        class00891 class008912 = (class00891)((class03556)optional.get()).N();
        class00500 class005002 = class008912.W();
        Optional var5 = class070012.W("Properties");
        if (var5.isPresent()) {
            class00507 var6 = class008912.E();
            for (String string : ((class07001)var5.get()).i()) {
                class08092 var9 = var6.N(string);
                if (var9 == null) continue;
                class005002 = class07717.N(class005002, var9, string, (class07001)var5.get(), class070012);
            }
        }
        return class005002;
    }

    public static String N(class07001 class070012) {
        return new class04825().N((class07709)class07717.y(class070012));
    }

    public static class07001 N(String string) throws CommandSyntaxException {
        return class07717.L(class07755.N(string));
    }

    public static class07001 N(class04688 class046882) {
        class07001 class070012 = new class07001();
        class070012.N_67("Name", class04206.L.y((Object)class046882.N()).toString());
        Map var2 = class046882.L();
        if (!var2.isEmpty()) {
            class07001 class070013 = new class07001();
            for (Map.Entry entry : var2.entrySet()) {
                class08092 var6 = (class08092)entry.getKey();
                class070013.N_67(var6.R(), class07717.N(var6, (Comparable)entry.getValue()));
            }
            class070012.N("Properties", (class07709)class070013);
        }
        return class070012;
    }

    public static class07001 N(class07001 class070012, int n) {
        class070012.N("DataVersion", n);
        return class070012;
    }

    public static String N(class07709 class077092) {
        return class07717.N(class077092, false);
    }

    public static String N(class07709 class077092, boolean bl) {
        return class07717.N(new StringBuilder(), class077092, 0, bl).toString();
    }

    public static StringBuilder N(StringBuilder stringBuilder, class07709 class077092, int n, boolean bl) {
        class07709 class077093 = class077092;
        Objects.requireNonNull(class077093);
        class07709 class077094 = class077093;
        int n2 = 0;
        return switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{class08884.class, class06997.class, class07029.class, class07741.class, class06995.class, class07001.class, class07757.class}, (Object)class077094, (int)n2)) {
            default -> throw new MatchException(null, null);
            case 0 -> {
                class08884 var6_6 = (class08884)class077094;
                yield stringBuilder.append(var6_6);
            }
            case 1 -> {
                class06997 var7_7 = (class06997)class077094;
                yield stringBuilder;
            }
            case 2 -> {
                byte[] var9_8 = ((class07029)class077094).i();
                int var10_10 = var9_8.length;
                class07717.N(n, stringBuilder).append("byte[").append(var10_10).append("] {\n");
                if (bl) {
                    class07717.N(n + 1, stringBuilder);
                    for (int var11_13 = 0; var11_13 < var9_8.length; ++var11_13) {
                        if (var11_13 != 0) {
                            stringBuilder.append(',');
                        }
                        if (var11_13 % 16 == 0 && var11_13 / 16 > 0) {
                            stringBuilder.append('\n');
                            if (var11_13 < var9_8.length) {
                                class07717.N(n + 1, stringBuilder);
                            }
                        } else if (var11_13 != 0) {
                            stringBuilder.append(' ');
                        }
                        stringBuilder.append(String.format(Locale.ROOT, "0x%02X", var9_8[var11_13] & 0xFF));
                    }
                } else {
                    class07717.N(n + 1, stringBuilder).append(" // Skipped, supply withBinaryBlobs true");
                }
                stringBuilder.append('\n');
                class07717.N(n, stringBuilder).append('}');
                yield stringBuilder;
            }
            case 3 -> {
                class07741 var9_9 = (class07741)((Object)class077094);
                int var10_11 = var9_9.size();
                class07717.N(n, stringBuilder).append("list").append("[").append(var10_11).append("] [");
                if (var10_11 != 0) {
                    stringBuilder.append('\n');
                }
                for (int var11_14 = 0; var11_14 < var10_11; ++var11_14) {
                    if (var11_14 != 0) {
                        stringBuilder.append(",\n");
                    }
                    class07717.N(n + 1, stringBuilder);
                    class07717.N(stringBuilder, var9_9.get(var11_14), n + 1, bl);
                }
                if (var10_11 != 0) {
                    stringBuilder.append('\n');
                }
                class07717.N(n, stringBuilder).append(']');
                yield stringBuilder;
            }
            case 4 -> {
                class06995 var10_12 = (class06995)class077094;
                int[] var11_15 = var10_12.M();
                int var12_17 = 0;
                int[] var13_20 = var11_15;
                int var14_24 = var13_20.length;
                for (int var15_27 = 0; var15_27 < var14_24; ++var15_27) {
                    int var16_29 = var13_20[var15_27];
                    var12_17 = Math.max(var12_17, String.format(Locale.ROOT, "%X", var16_29).length());
                }
                int var13_21 = var11_15.length;
                class07717.N(n, stringBuilder).append("int[").append(var13_21).append("] {\n");
                if (bl) {
                    class07717.N(n + 1, stringBuilder);
                    for (var14_24 = 0; var14_24 < var11_15.length; ++var14_24) {
                        if (var14_24 != 0) {
                            stringBuilder.append(',');
                        }
                        if (var14_24 % 16 == 0 && var14_24 / 16 > 0) {
                            stringBuilder.append('\n');
                            if (var14_24 < var11_15.length) {
                                class07717.N(n + 1, stringBuilder);
                            }
                        } else if (var14_24 != 0) {
                            stringBuilder.append(' ');
                        }
                        stringBuilder.append(String.format(Locale.ROOT, "0x%0" + var12_17 + "X", var11_15[var14_24]));
                    }
                } else {
                    class07717.N(n + 1, stringBuilder).append(" // Skipped, supply withBinaryBlobs true");
                }
                stringBuilder.append('\n');
                class07717.N(n, stringBuilder).append('}');
                yield stringBuilder;
            }
            case 5 -> {
                class07001 var11_16 = (class07001)class077094;
                ArrayList var12_18 = Lists.newArrayList((Iterable)var11_16.i());
                Collections.sort(var12_18);
                class07717.N(n, stringBuilder).append('{');
                if (stringBuilder.length() - stringBuilder.lastIndexOf("\n") > 2 * (n + 1)) {
                    stringBuilder.append('\n');
                    class07717.N(n + 1, stringBuilder);
                }
                int var13_22 = var12_18.stream().mapToInt(String::length).max().orElse(0);
                String var14_25 = Strings.repeat((String)" ", (int)var13_22);
                for (int var15_28 = 0; var15_28 < var12_18.size(); ++var15_28) {
                    if (var15_28 != 0) {
                        stringBuilder.append(",\n");
                    }
                    String var16_30 = (String)var12_18.get(var15_28);
                    class07717.N(n + 1, stringBuilder).append('\"').append(var16_30).append('\"').append(var14_25, 0, var14_25.length() - var16_30.length()).append(": ");
                    class07717.N(stringBuilder, var11_16.N(var16_30), n + 1, bl);
                }
                if (!var12_18.isEmpty()) {
                    stringBuilder.append('\n');
                }
                class07717.N(n, stringBuilder).append('}');
                yield stringBuilder;
            }
            case 6 -> {
                int var18_34;
                class07757 var12_19 = (class07757)((Object)class077094);
                long[] var13_23 = var12_19.M();
                long var14_26 = 0L;
                long[] var16_31 = var13_23;
                int var17_33 = var16_31.length;
                for (var18_34 = 0; var18_34 < var17_33; ++var18_34) {
                    long var19_35 = var16_31[var18_34];
                    var14_26 = Math.max(var14_26, (long)String.format(Locale.ROOT, "%X", var19_35).length());
                }
                long var16_32 = var13_23.length;
                class07717.N(n, stringBuilder).append("long[").append(var16_32).append("] {\n");
                if (bl) {
                    class07717.N(n + 1, stringBuilder);
                    for (var18_34 = 0; var18_34 < var13_23.length; ++var18_34) {
                        if (var18_34 != 0) {
                            stringBuilder.append(',');
                        }
                        if (var18_34 % 16 == 0 && var18_34 / 16 > 0) {
                            stringBuilder.append('\n');
                            if (var18_34 < var13_23.length) {
                                class07717.N(n + 1, stringBuilder);
                            }
                        } else if (var18_34 != 0) {
                            stringBuilder.append(' ');
                        }
                        stringBuilder.append(String.format(Locale.ROOT, "0x%0" + var14_26 + "X", var13_23[var18_34]));
                    }
                } else {
                    class07717.N(n + 1, stringBuilder).append(" // Skipped, supply withBinaryBlobs true");
                }
                stringBuilder.append('\n');
                class07717.N(n, stringBuilder).append('}');
                yield stringBuilder;
            }
        };
    }

    private static StringBuilder N(int n, StringBuilder stringBuilder) {
        int n2 = stringBuilder.lastIndexOf("\n") + 1;
        int n3 = stringBuilder.length() - n2;
        for (int i = 0; i < 2 * n - n3; ++i) {
            stringBuilder.append(' ');
        }
        return stringBuilder;
    }

    private static <T extends Comparable<T>> String N(class08092<T> class080922, Comparable<?> comparable) {
        return class080922.y(comparable);
    }

    public static void N(class08329 class083292, int n) {
        class083292.N("DataVersion", n);
    }

    public static Dynamic<class07709> N(Dynamic<class07709> dynamic) {
        int n = class07529.y().comp_4026().y();
        return class07717.N(dynamic, n);
    }

    public static Dynamic<class07709> N(Dynamic<class07709> dynamic, int n) {
        return dynamic.set("DataVersion", dynamic.createInt(n));
    }

    public static class07001 N(class00500 class005002) {
        class07001 class070012 = new class07001();
        class070012.N_67("Name", class04206.i.y((Object)class005002.i()).toString());
        Map var2 = class005002.L();
        if (!var2.isEmpty()) {
            class07001 class070013 = new class07001();
            for (Map.Entry entry : var2.entrySet()) {
                class08092 var6 = (class08092)entry.getKey();
                class070013.N_67(var6.R(), class07717.N(var6, (Comparable)entry.getValue()));
            }
            class070012.N("Properties", (class07709)class070013);
        }
        return class070012;
    }

    public static int R(class07001 class070012) {
        return class07717.y(class070012, -1);
    }
}

