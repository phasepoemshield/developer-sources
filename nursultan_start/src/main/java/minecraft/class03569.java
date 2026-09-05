/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Streams
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicOps
 *  minecraft.class01733
 *  minecraft.class03731
 *  minecraft.class06962
 */
package minecraft;

import com.google.common.collect.Streams;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import minecraft.class01733;
import minecraft.class03731;
import minecraft.class06962;

public class class03569
extends class01733 {
    public static final List<String> N = List.of("Text1", "Text2", "Text3", "Text4", "FilteredText1", "FilteredText2", "FilteredText3", "FilteredText4", "Color", "GlowingText");
    public static final String y = "_filtered_correct";
    private static final String L = "black";

    private static <T> Dynamic<T> L(Dynamic<T> dynamic) {
        return dynamic.emptyMap().set("messages", class03569.u(dynamic)).set("color", dynamic.createString(L)).set("has_glowing_text", dynamic.createBoolean(false));
    }

    public class03569(Schema schema, String string, String string2) {
        super(schema, true, string, class06962.G, string2);
    }

    private static <T> Dynamic<T> u(Dynamic<T> dynamic) {
        Dynamic dynamic2 = class03731.N((DynamicOps)dynamic.getOps());
        return dynamic.createList(Stream.of(dynamic2, dynamic2, dynamic2, dynamic2));
    }

    private static <T> Dynamic<T> y(Dynamic<T> dynamic) {
        Dynamic dynamic2 = class03731.N((DynamicOps)dynamic.getOps());
        List list = class03569.N(dynamic, "Text").map(optional -> optional.orElse(dynamic2)).toList();
        Dynamic dynamic3 = dynamic.emptyMap().set("messages", dynamic.createList(list.stream())).set("color", dynamic.get("Color").result().orElse(dynamic.createString(L))).set("has_glowing_text", dynamic.get("GlowingText").result().orElse(dynamic.createBoolean(false)));
        List list2 = class03569.N(dynamic, "FilteredText").toList();
        if (list2.stream().anyMatch(Optional::isPresent)) {
            dynamic3 = dynamic3.set("filtered_messages", dynamic.createList(Streams.mapWithIndex(list2.stream(), (optional, l) -> {
                Dynamic dynamic = (Dynamic)list.get((int)l);
                return optional.orElse(dynamic);
            })));
        }
        return dynamic3;
    }

    protected <T> Dynamic<T> N(Dynamic<T> dynamic) {
        dynamic = dynamic.set("front_text", class03569.y(dynamic)).set("back_text", class03569.L(dynamic)).set("is_waxed", dynamic.createBoolean(false)).set(y, dynamic.createBoolean(true));
        for (String string : N) {
            dynamic = dynamic.remove(string);
        }
        return dynamic;
    }

    private static <T> Stream<Optional<Dynamic<T>>> N(Dynamic<T> dynamic, String string) {
        return Stream.of(dynamic.get(string + "1").result(), dynamic.get(string + "2").result(), dynamic.get(string + "3").result(), dynamic.get(string + "4").result());
    }
}

