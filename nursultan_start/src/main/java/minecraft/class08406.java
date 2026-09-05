/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.OpticFinder
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.serialization.Dynamic
 *  minecraft.class02269
 *  minecraft.class06962
 */
package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;
import minecraft.class02269;
import minecraft.class06962;

public class class08406
extends DataFix {
    private Dynamic<?> L(Dynamic<?> dynamic) {
        return class02269.N((Dynamic)dynamic.renameField("LifeTicks", "life_ticks"), (String)"BoundX", (String)"BoundY", (String)"BoundZ", (String)"bound_pos");
    }

    public class08406(Schema schema) {
        super(schema, false);
    }

    private Dynamic<?> i(Dynamic<?> dynamic) {
        dynamic = dynamic.remove("TravelPosX").remove("TravelPosY").remove("TravelPosZ");
        dynamic = class02269.N((Dynamic)dynamic, (String)"HomePosX", (String)"HomePosY", (String)"HomePosZ", (String)"home_pos");
        return dynamic.renameField("HasEgg", "has_egg");
    }

    private Dynamic<?> u(Dynamic<?> dynamic) {
        return class02269.N((Dynamic)dynamic.renameField("Size", "size"), (String)"AX", (String)"AY", (String)"AZ", (String)"anchor_pos");
    }

    private Dynamic<?> y(Dynamic<?> dynamic) {
        return class02269.N(dynamic, (String)"SleepingX", (String)"SleepingY", (String)"SleepingZ", (String)"sleeping_pos");
    }

    private OpticFinder<?> N(String string) {
        return DSL.namedChoice((String)string, (Type)this.getInputSchema().getChoiceType(class06962.o, string));
    }

    private Dynamic<?> N(Dynamic<?> dynamic) {
        Optional optional;
        dynamic = this.y(dynamic);
        Optional optional2 = dynamic.get("SpawnX").asNumber().result();
        Optional optional3 = dynamic.get("SpawnY").asNumber().result();
        Optional optional4 = dynamic.get("SpawnZ").asNumber().result();
        if (optional2.isPresent() && optional3.isPresent() && optional4.isPresent()) {
            optional = dynamic.createMap(Map.of(dynamic.createString("pos"), class02269.N(dynamic, (int)((Number)optional2.get()).intValue(), (int)((Number)optional3.get()).intValue(), (int)((Number)optional4.get()).intValue())));
            optional = Dynamic.copyField(dynamic, (String)"SpawnAngle", (Dynamic)optional, (String)"angle");
            optional = Dynamic.copyField(dynamic, (String)"SpawnDimension", (Dynamic)optional, (String)"dimension");
            optional = Dynamic.copyField(dynamic, (String)"SpawnForced", (Dynamic)optional, (String)"forced");
            dynamic = dynamic.remove("SpawnX").remove("SpawnY").remove("SpawnZ").remove("SpawnAngle").remove("SpawnDimension").remove("SpawnForced");
            dynamic = dynamic.set("respawn", (Dynamic)optional);
        }
        if ((optional = dynamic.get("enteredNetherPosition").result()).isPresent()) {
            dynamic = dynamic.remove("enteredNetherPosition").set("entered_nether_pos", dynamic.createList(Stream.of(dynamic.createDouble(((Dynamic)optional.get()).get("x").asDouble(0.0)), dynamic.createDouble(((Dynamic)optional.get()).get("y").asDouble(0.0)), dynamic.createDouble(((Dynamic)optional.get()).get("z").asDouble(0.0)))));
        }
        return dynamic;
    }

    private Dynamic<?> R(Dynamic<?> dynamic) {
        return class02269.N(dynamic, (String)"TileX", (String)"TileY", (String)"TileZ", (String)"block_pos");
    }

    public TypeRewriteRule makeRule() {
        OpticFinder<?> opticFinder = this.N("minecraft:vex");
        OpticFinder<?> opticFinder2 = this.N("minecraft:phantom");
        OpticFinder<?> opticFinder3 = this.N("minecraft:turtle");
        List<OpticFinder<?>> list = List.of(this.N("minecraft:item_frame"), this.N("minecraft:glow_item_frame"), this.N("minecraft:painting"), this.N("minecraft:leash_knot"));
        return TypeRewriteRule.seq((TypeRewriteRule)this.fixTypeEverywhereTyped("InlineBlockPosFormatFix - player", this.getInputSchema().getType(class06962.L), typed -> typed.update(DSL.remainderFinder(), this::N)), (TypeRewriteRule)this.fixTypeEverywhereTyped("InlineBlockPosFormatFix - entity", this.getInputSchema().getType(class06962.o), typed2 -> {
            typed2 = typed2.update(DSL.remainderFinder(), this::y).updateTyped(opticFinder, typed -> typed.update(DSL.remainderFinder(), this::L)).updateTyped(opticFinder2, typed -> typed.update(DSL.remainderFinder(), this::u)).updateTyped(opticFinder3, typed -> typed.update(DSL.remainderFinder(), this::i));
            for (OpticFinder opticFinder4 : list) {
                typed2 = typed2.updateTyped(opticFinder4, typed -> typed.update(DSL.remainderFinder(), this::R));
            }
            return typed2;
        }));
    }
}

