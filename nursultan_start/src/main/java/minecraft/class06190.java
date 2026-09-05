/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.arguments.BoolArgumentType
 *  com.mojang.brigadier.arguments.FloatArgumentType
 *  com.mojang.brigadier.arguments.IntegerArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType
 *  com.mojang.brigadier.exceptions.Dynamic4CommandExceptionType
 *  minecraft.class00392
 *  minecraft.class00502
 *  minecraft.class00887
 *  minecraft.class04782
 *  minecraft.class04995
 *  minecraft.class06069
 *  minecraft.class07049
 *  minecraft.class07109
 *  minecraft.class07290
 *  minecraft.class07680
 *  minecraft.class07686
 *  minecraft.class07701
 *  minecraft.class08036
 *  minecraft.class08164
 */
package minecraft;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.Dynamic4CommandExceptionType;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.function.Predicate;
import minecraft.class00392;
import minecraft.class00502;
import minecraft.class00887;
import minecraft.class04782;
import minecraft.class04995;
import minecraft.class06069;
import minecraft.class06186;
import minecraft.class07049;
import minecraft.class07109;
import minecraft.class07290;
import minecraft.class07680;
import minecraft.class07686;
import minecraft.class07701;
import minecraft.class08036;
import minecraft.class08164;

public class class06190 {
    private static final int N = 10000;
    private static final Dynamic4CommandExceptionType y = new Dynamic4CommandExceptionType((object, object2, object3, object4) -> class00392.y((String)"commands.spreadplayers.failed.teams", (Object[])new Object[]{object, object2, object3, object4}));
    private static final Dynamic4CommandExceptionType L = new Dynamic4CommandExceptionType((object, object2, object3, object4) -> class00392.y((String)"commands.spreadplayers.failed.entities", (Object[])new Object[]{object, object2, object3, object4}));
    private static final Dynamic2CommandExceptionType u = new Dynamic2CommandExceptionType((object, object2) -> class00392.y((String)"commands.spreadplayers.failed.invalid.height", (Object[])new Object[]{object, object2}));

    private static int N(class07701 class077012, class07109 class071092, float f, float f2, int n, boolean bl, Collection<? extends class07049> collection) throws CommandSyntaxException {
        class04782 class047822 = class077012.R();
        int n2 = class047822.method_31607();
        if (n < n2) {
            throw u.create((Object)n, (Object)n2);
        }
        class06069 class060692 = class06069.u();
        double d = class071092.z - f2;
        double d2 = class071092.U - f2;
        double d3 = class071092.z + f2;
        double d4 = class071092.U + f2;
        class06186[] class06186Array = class06190.N(class060692, bl ? class06190.N(collection) : collection.size(), d, d2, d3, d4);
        class06190.N(class071092, f, class047822, class060692, d, d2, d3, d4, n, class06186Array, bl);
        double d5 = class06190.N(collection, class047822, class06186Array, n, bl);
        class077012.N(() -> class00392.N((String)("commands.spreadplayers.success." + (bl ? "teams" : "entities")), (Object[])new Object[]{class06186Array.length, Float.valueOf(class071092.z), Float.valueOf(class071092.U), String.format(Locale.ROOT, "%.2f", d5)}), true);
        return class06186Array.length;
    }

    private static int N(Collection<? extends class07049> collection) {
        HashSet hashSet = Sets.newHashSet();
        for (class07049 class070492 : collection) {
            if (class070492 instanceof class08036) {
                hashSet.add(class070492.method_5781());
                continue;
            }
            hashSet.add(null);
        }
        return hashSet.size();
    }

    private static void N(class07109 class071092, double d, class04782 class047822, class06069 class060692, double d2, double d3, double d4, double d5, int n, class06186[] class06186Array, boolean bl) throws CommandSyntaxException {
        int n2;
        boolean bl2 = true;
        double d6 = 3.4028234663852886E38;
        for (n2 = 0; n2 < 10000 && bl2; ++n2) {
            bl2 = false;
            d6 = 3.4028234663852886E38;
            for (int i = 0; i < class06186Array.length; ++i) {
                class06186 class061862 = class06186Array[i];
                int n3 = 0;
                class06186 class061863 = new class06186();
                for (int j = 0; j < class06186Array.length; ++j) {
                    if (i == j) continue;
                    class06186 class061864 = class06186Array[j];
                    double d7 = class061862.N(class061864);
                    d6 = Math.min(d7, d6);
                    if (!(d7 < d)) continue;
                    ++n3;
                    class061863.N += class061864.N - class061862.N;
                    class061863.y += class061864.y - class061862.y;
                }
                if (n3 > 0) {
                    class061863.N /= (double)n3;
                    class061863.y /= (double)n3;
                    double d8 = class061863.y();
                    if (d8 > 0.0) {
                        class061863.N();
                        class061862.y(class061863);
                    } else {
                        class061862.N(class060692, d2, d3, d4, d5);
                    }
                    bl2 = true;
                }
                if (!class061862.N(d2, d3, d4, d5)) continue;
                bl2 = true;
            }
            if (bl2) continue;
            for (class06186 class061863 : class06186Array) {
                if (class061863.y((class07290)class047822, n)) continue;
                class061863.N(class060692, d2, d3, d4, d5);
                bl2 = true;
            }
        }
        if (d6 == 3.4028234663852886E38) {
            d6 = 0.0;
        }
        if (n2 >= 10000) {
            if (bl) {
                throw y.create((Object)class06186Array.length, (Object)Float.valueOf(class071092.z), (Object)Float.valueOf(class071092.U), (Object)String.format(Locale.ROOT, "%.2f", d6));
            }
            throw L.create((Object)class06186Array.length, (Object)Float.valueOf(class071092.z), (Object)Float.valueOf(class071092.U), (Object)String.format(Locale.ROOT, "%.2f", d6));
        }
    }

    private static double N(Collection<? extends class07049> collection, class04782 class047822, class06186[] class06186Array, int n, boolean bl) {
        double d = 0.0;
        int n2 = 0;
        HashMap hashMap = Maps.newHashMap();
        for (class07049 class070492 : collection) {
            class06186 class061862;
            if (bl) {
                class00502 class005022;
                class00502 class005023 = class005022 = class070492 instanceof class08036 ? class070492.method_5781() : null;
                if (!hashMap.containsKey(class005022)) {
                    hashMap.put(class005022, class06186Array[n2++]);
                }
                class061862 = (class06186)hashMap.get(class005022);
            } else {
                class061862 = class06186Array[n2++];
            }
            class070492.method_48105(class047822, (double)class04995.N((double)class061862.N) + 0.5, (double)class061862.N((class07290)class047822, n), (double)class04995.N((double)class061862.y) + 0.5, Set.of(), class070492.method_36454(), class070492.method_36455(), true);
            double d2 = Double.MAX_VALUE;
            for (class06186 class061863 : class06186Array) {
                if (class061862 == class061863) continue;
                d2 = Math.min(class061862.N(class061863), d2);
            }
            d += d2;
        }
        if (collection.size() < 2) {
            return 0.0;
        }
        return d /= (double)collection.size();
    }

    private static class06186[] N(class06069 class060692, int n, double d, double d2, double d3, double d4) {
        class06186[] class06186Array = new class06186[n];
        for (int i = 0; i < class06186Array.length; ++i) {
            class06186 class061862 = new class06186();
            class061862.N(class060692, d, d2, d3, d4);
            class06186Array[i] = class061862;
        }
        return class06186Array;
    }

    public static void N(CommandDispatcher<class07701> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y((String)"spreadplayers").requires((Predicate)class07686.N((class08164)class07686.u))).then(class07686.N((String)"center", (ArgumentType)class00887.N()).then(class07686.N((String)"spreadDistance", (ArgumentType)FloatArgumentType.floatArg((float)0.0f)).then(((RequiredArgumentBuilder)class07686.N((String)"maxRange", (ArgumentType)FloatArgumentType.floatArg((float)1.0f)).then(class07686.N((String)"respectTeams", (ArgumentType)BoolArgumentType.bool()).then(class07686.N((String)"targets", (ArgumentType)class07680.y()).executes(commandContext -> class06190.N((class07701)commandContext.getSource(), class00887.N((CommandContext)commandContext, (String)"center"), FloatArgumentType.getFloat((CommandContext)commandContext, (String)"spreadDistance"), FloatArgumentType.getFloat((CommandContext)commandContext, (String)"maxRange"), ((class07701)commandContext.getSource()).R().method_31600() + 1, BoolArgumentType.getBool((CommandContext)commandContext, (String)"respectTeams"), class07680.y((CommandContext)commandContext, (String)"targets")))))).then(class07686.y((String)"under").then(class07686.N((String)"maxHeight", (ArgumentType)IntegerArgumentType.integer()).then(class07686.N((String)"respectTeams", (ArgumentType)BoolArgumentType.bool()).then(class07686.N((String)"targets", (ArgumentType)class07680.y()).executes(commandContext -> class06190.N((class07701)commandContext.getSource(), class00887.N((CommandContext)commandContext, (String)"center"), FloatArgumentType.getFloat((CommandContext)commandContext, (String)"spreadDistance"), FloatArgumentType.getFloat((CommandContext)commandContext, (String)"maxRange"), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"maxHeight"), BoolArgumentType.getBool((CommandContext)commandContext, (String)"respectTeams"), class07680.y((CommandContext)commandContext, (String)"targets")))))))))));
    }
}

