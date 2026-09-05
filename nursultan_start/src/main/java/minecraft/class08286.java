/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.serialization.Dynamic
 *  minecraft.class06962
 */
package minecraft;

import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import java.util.stream.Stream;
import minecraft.class06962;

public class class08286
extends DataFix {
    public class08286(Schema schema) {
        super(schema, true);
    }

    protected TypeRewriteRule makeRule() {
        return this.writeFixAndRead("Food to consumable fix", this.getInputSchema().getType(class06962.k), this.getOutputSchema().getType(class06962.k), dynamic2 -> {
            Optional optional = dynamic2.get("minecraft:food").result();
            if (optional.isPresent()) {
                float f = ((Dynamic)optional.get()).get("eat_seconds").asFloat(1.6f);
                Stream<Dynamic> stream = ((Dynamic)optional.get()).get("effects").asStream().map(dynamic -> dynamic.emptyMap().set("type", dynamic.createString("minecraft:apply_effects")).set("effects", dynamic.createList(dynamic.get("effect").result().stream())).set("probability", dynamic.createFloat(dynamic.get("probability").asFloat(1.0f))));
                Dynamic var0 = Dynamic.copyField((Dynamic)((Dynamic)optional.get()), (String)"using_converts_to", (Dynamic)dynamic2, (String)"minecraft:use_remainder");
                dynamic2 = var0.set("minecraft:food", ((Dynamic)optional.get()).remove("eat_seconds").remove("effects").remove("using_converts_to"));
                dynamic2 = dynamic2.set("minecraft:consumable", dynamic2.emptyMap().set("consume_seconds", dynamic2.createFloat(f)).set("on_consume_effects", dynamic2.createList(stream)));
                return dynamic2;
            }
            return dynamic2;
        });
    }
}

