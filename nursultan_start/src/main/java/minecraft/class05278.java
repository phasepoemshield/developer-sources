/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.OpticFinder
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.serialization.Dynamic
 *  minecraft.class06962
 */
package minecraft;

import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import java.util.Map;
import java.util.Objects;
import minecraft.class06962;

public class class05278
extends DataFix {
    private static final Map<String, String> N = ImmutableMap.builder().put((Object)"structure_references", (Object)"empty").put((Object)"biomes", (Object)"empty").put((Object)"base", (Object)"surface").put((Object)"carved", (Object)"carvers").put((Object)"liquid_carved", (Object)"liquid_carvers").put((Object)"decorated", (Object)"features").put((Object)"lighted", (Object)"light").put((Object)"mobs_spawned", (Object)"spawn").put((Object)"finalized", (Object)"heightmaps").put((Object)"fullchunk", (Object)"full").build();

    public class05278(Schema schema, boolean bl) {
        super(schema, bl);
    }

    protected TypeRewriteRule makeRule() {
        Type var1 = this.getInputSchema().getType(class06962.u);
        Type var2 = var1.findFieldType("Level");
        OpticFinder opticFinder = DSL.fieldFinder((String)"Level", (Type)var2);
        return this.fixTypeEverywhereTyped("ChunkStatusFix2", var1, this.getOutputSchema().getType(class06962.u), typed2 -> typed2.updateTyped(opticFinder, typed -> {
            String string;
            Dynamic var1 = (Dynamic)typed.get(DSL.remainderFinder());
            String string2 = var1.get("Status").asString("empty");
            if (Objects.equals(string2, string = N.getOrDefault(string2, "empty"))) {
                return typed;
            }
            return typed.set(DSL.remainderFinder(), (Object)var1.set("Status", var1.createString(string)));
        }));
    }
}

