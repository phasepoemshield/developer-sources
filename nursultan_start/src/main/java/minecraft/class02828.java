/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFixUtils
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.serialization.Dynamic
 *  minecraft.class00955
 *  minecraft.class02269
 *  minecraft.class06962
 */
package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Map;
import java.util.Optional;
import minecraft.class00955;
import minecraft.class02269;
import minecraft.class06962;

public class class02828
extends class00955 {
    private static final Map<String, String> L = Map.ofEntries(Map.entry("b", "minecraft:base"), Map.entry("bl", "minecraft:square_bottom_left"), Map.entry("br", "minecraft:square_bottom_right"), Map.entry("tl", "minecraft:square_top_left"), Map.entry("tr", "minecraft:square_top_right"), Map.entry("bs", "minecraft:stripe_bottom"), Map.entry("ts", "minecraft:stripe_top"), Map.entry("ls", "minecraft:stripe_left"), Map.entry("rs", "minecraft:stripe_right"), Map.entry("cs", "minecraft:stripe_center"), Map.entry("ms", "minecraft:stripe_middle"), Map.entry("drs", "minecraft:stripe_downright"), Map.entry("dls", "minecraft:stripe_downleft"), Map.entry("ss", "minecraft:small_stripes"), Map.entry("cr", "minecraft:cross"), Map.entry("sc", "minecraft:straight_cross"), Map.entry("bt", "minecraft:triangle_bottom"), Map.entry("tt", "minecraft:triangle_top"), Map.entry("bts", "minecraft:triangles_bottom"), Map.entry("tts", "minecraft:triangles_top"), Map.entry("ld", "minecraft:diagonal_left"), Map.entry("rd", "minecraft:diagonal_up_right"), Map.entry("lud", "minecraft:diagonal_up_left"), Map.entry("rud", "minecraft:diagonal_right"), Map.entry("mc", "minecraft:circle"), Map.entry("mr", "minecraft:rhombus"), Map.entry("vh", "minecraft:half_vertical"), Map.entry("hh", "minecraft:half_horizontal"), Map.entry("vhr", "minecraft:half_vertical_right"), Map.entry("hhb", "minecraft:half_horizontal_bottom"), Map.entry("bo", "minecraft:border"), Map.entry("cbo", "minecraft:curly_border"), Map.entry("gra", "minecraft:gradient"), Map.entry("gru", "minecraft:gradient_up"), Map.entry("bri", "minecraft:bricks"), Map.entry("glb", "minecraft:globe"), Map.entry("cre", "minecraft:creeper"), Map.entry("sku", "minecraft:skull"), Map.entry("flo", "minecraft:flower"), Map.entry("moj", "minecraft:mojang"), Map.entry("pig", "minecraft:piglin"));

    public class02828(Schema schema) {
        super(schema, false, "BannerPatternFormatFix", class06962.G, "minecraft:banner");
    }

    private static Dynamic<?> y(Dynamic<?> dynamic2) {
        dynamic2 = dynamic2.renameAndFixField("Pattern", "pattern", dynamic -> (Dynamic)DataFixUtils.orElse((Optional)dynamic.asString().map(string -> L.getOrDefault(string, (String)string)).map(arg_0 -> ((Dynamic)dynamic).createString(arg_0)).result(), (Object)dynamic));
        dynamic2 = dynamic2.set("color", dynamic2.createString(class02269.N((int)dynamic2.get("Color").asInt(0))));
        dynamic2 = dynamic2.remove("Color");
        return dynamic2;
    }

    private static Dynamic<?> N(Dynamic<?> dynamic2) {
        return dynamic2.renameAndFixField("Patterns", "patterns", dynamic -> dynamic.createList(dynamic.asStream().map(class02828::y)));
    }

    protected Typed<?> N(Typed<?> typed) {
        return typed.update(DSL.remainderFinder(), class02828::N);
    }
}

