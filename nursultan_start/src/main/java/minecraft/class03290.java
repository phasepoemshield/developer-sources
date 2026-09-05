/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.OpticFinder
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.OptionalDynamic
 *  minecraft.class06962
 *  minecraft.class07536
 *  org.apache.commons.lang3.mutable.MutableBoolean
 */
package minecraft;

import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.OptionalDynamic;
import java.util.Map;
import java.util.stream.Stream;
import minecraft.class06962;
import minecraft.class07536;
import org.apache.commons.lang3.mutable.MutableBoolean;

public class class03290
extends DataFix {
    private static final String y = "WorldGenSettingsHeightAndBiomeFix";
    public static final String N = "has_increased_height_already";

    public class03290(Schema schema) {
        super(schema, true);
    }

    private static Dynamic<?> N(Dynamic<?> dynamic) {
        Dynamic dynamic2 = dynamic.createMap((Map)ImmutableMap.of((Object)dynamic.createString("height"), (Object)dynamic.createInt(64), (Object)dynamic.createString("block"), (Object)dynamic.createString("minecraft:air")));
        return dynamic.createList(Stream.concat(Stream.of(dynamic2), dynamic.asStream()));
    }

    protected TypeRewriteRule makeRule() {
        Type type = this.getInputSchema().getType(class06962.A);
        OpticFinder opticFinder = type.findField("dimensions");
        Type type2 = this.getOutputSchema().getType(class06962.A);
        Type type3 = type2.findFieldType("dimensions");
        return this.fixTypeEverywhereTyped(y, type, type2, typed2 -> {
            OptionalDynamic optionalDynamic = ((Dynamic)typed2.get(DSL.remainderFinder())).get(N);
            boolean bl = optionalDynamic.result().isEmpty();
            boolean bl2 = optionalDynamic.asBoolean(true);
            return typed2.update(DSL.remainderFinder(), dynamic -> dynamic.remove(N)).updateTyped(opticFinder, type3, typed -> class07536.N((Typed)typed, (Type)type3, dynamic2 -> dynamic2.update("minecraft:overworld", dynamic -> dynamic.update("generator", dynamic2 -> {
                String string = dynamic2.get("type").asString("");
                if ("minecraft:noise".equals(string)) {
                    MutableBoolean mutableBoolean = new MutableBoolean();
                    dynamic2 = dynamic2.update("biome_source", dynamic -> {
                        String string = dynamic.get("type").asString("");
                        if ("minecraft:vanilla_layered".equals(string) || bl && "minecraft:multi_noise".equals(string)) {
                            if (dynamic.get("large_biomes").asBoolean(false)) {
                                mutableBoolean.setTrue();
                            }
                            return dynamic.createMap((Map)ImmutableMap.of((Object)dynamic.createString("preset"), (Object)dynamic.createString("minecraft:overworld"), (Object)dynamic.createString("type"), (Object)dynamic.createString("minecraft:multi_noise")));
                        }
                        return dynamic;
                    });
                    if (mutableBoolean.booleanValue()) {
                        return dynamic2.update("settings", dynamic -> {
                            if ("minecraft:overworld".equals(dynamic.asString(""))) {
                                return dynamic.createString("minecraft:large_biomes");
                            }
                            return dynamic;
                        });
                    }
                    return dynamic2;
                }
                if ("minecraft:flat".equals(string)) {
                    if (bl2) {
                        return dynamic2;
                    }
                    return dynamic2.update("settings", dynamic -> dynamic.update("layers", class03290::N));
                }
                return dynamic2;
            }))));
        });
    }
}

