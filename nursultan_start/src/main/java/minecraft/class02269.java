/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DataFixUtils
 *  com.mojang.datafixers.OpticFinder
 *  com.mojang.datafixers.RewriteResult
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.View
 *  com.mojang.datafixers.functions.PointFreeRule
 *  com.mojang.datafixers.types.Type
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicOps
 *  minecraft.class07001
 *  minecraft.class07536
 *  minecraft.class07713
 */
package minecraft;

import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.RewriteResult;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.View;
import com.mojang.datafixers.functions.PointFreeRule;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.BitSet;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import minecraft.class07001;
import minecraft.class07536;
import minecraft.class07713;

public class class02269 {
    public static <T> Typed<?> N(Typed<?> typed, OpticFinder<T> opticFinder, Dynamic<?> dynamic) {
        return typed.set(opticFinder, class07536.N((Type)opticFinder.type(), dynamic, (boolean)true));
    }

    public static String N(int n) {
        return switch (n) {
            default -> "white";
            case 1 -> "orange";
            case 2 -> "magenta";
            case 3 -> "light_blue";
            case 4 -> "yellow";
            case 5 -> "lime";
            case 6 -> "pink";
            case 7 -> "gray";
            case 8 -> "light_gray";
            case 9 -> "cyan";
            case 10 -> "purple";
            case 11 -> "blue";
            case 12 -> "brown";
            case 13 -> "green";
            case 14 -> "red";
            case 15 -> "black";
        };
    }

    public static Dynamic<?> N(Dynamic<?> dynamic, String string, UnaryOperator<String> unaryOperator) {
        return dynamic.update(string, dynamic2 -> (Dynamic)DataFixUtils.orElse((Optional)dynamic2.asString().map((Function)unaryOperator).map(arg_0 -> ((Dynamic)dynamic).createString(arg_0)).result(), (Object)dynamic2));
    }

    public static Dynamic<?> N(String string) {
        return class02269.N(string, Map.of());
    }

    public static <T> Typed<T> N(Type<T> type, Object object, DynamicOps<?> dynamicOps) {
        return new Typed(type, dynamicOps, object);
    }

    public static <T, R> Typed<R> N(Type<R> type, Typed<T> typed) {
        return new Typed(type, typed.getOps(), typed.getValue());
    }

    public static Dynamic<?> N(Dynamic<?> dynamic, int n, int n2, int n3) {
        return dynamic.createIntList(IntStream.of(n, n2, n3));
    }

    public static Dynamic<?> N(Dynamic<?> dynamic, String string, String string2, String string3, String string4) {
        Optional var5 = dynamic.get(string).asNumber().result();
        Optional var6 = dynamic.get(string2).asNumber().result();
        Optional var7 = dynamic.get(string3).asNumber().result();
        if (var5.isEmpty() || var6.isEmpty() || var7.isEmpty()) {
            return dynamic;
        }
        return dynamic.remove(string).remove(string2).remove(string3).set(string4, class02269.N(dynamic, ((Number)var5.get()).intValue(), ((Number)var6.get()).intValue(), ((Number)var7.get()).intValue()));
    }

    public static Dynamic<?> N(Dynamic<?> dynamic) {
        Optional var1 = dynamic.get("X").asNumber().result();
        Optional var2 = dynamic.get("Y").asNumber().result();
        Optional var3 = dynamic.get("Z").asNumber().result();
        if (var1.isEmpty() || var2.isEmpty() || var3.isEmpty()) {
            return dynamic;
        }
        return class02269.N(dynamic, ((Number)var1.get()).intValue(), ((Number)var2.get()).intValue(), ((Number)var3.get()).intValue());
    }

    public static Dynamic<?> N(String string, Map<String, String> map) {
        Dynamic dynamic = new Dynamic((DynamicOps)class07713.N, (Object)new class07001());
        Dynamic dynamic2 = dynamic.set("Name", dynamic.createString(string));
        if (!map.isEmpty()) {
            dynamic2 = dynamic2.set("Properties", dynamic.createMap(map.entrySet().stream().collect(Collectors.toMap(entry -> dynamic.createString((String)entry.getKey()), entry -> dynamic.createString((String)entry.getValue())))));
        }
        return dynamic2;
    }

    @SafeVarargs
    public static <T> Function<Typed<?>, Typed<?>> N(Function<Typed<?>, Typed<?>> ... functionArray) {
        return typed -> {
            Function[] functionArray2 = functionArray;
            int n = functionArray2.length;
            for (int i = 0; i < n; ++i) {
                typed = (Typed)functionArray2[i].apply(typed);
            }
            return typed;
        };
    }

    private static <A, B> TypeRewriteRule N(Type<A> type, Type<B> type2) {
        RewriteResult rewriteResult = RewriteResult.create((View)View.create((String)"Patcher", type, type2, dynamicOps -> object -> {
            throw new UnsupportedOperationException();
        }), (BitSet)new BitSet());
        return TypeRewriteRule.everywhere((TypeRewriteRule)TypeRewriteRule.ifSame(type, (RewriteResult)rewriteResult), (PointFreeRule)PointFreeRule.nop(), (boolean)true, (boolean)true);
    }

    public static Type<?> N(Type<?> type, Type<?> type2, Type<?> type3) {
        return type.all(class02269.N(type2, type3), true, false).view().newType();
    }
}

