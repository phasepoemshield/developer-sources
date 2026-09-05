/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.OptionalDynamic
 *  minecraft.class00622
 *  minecraft.class01296
 *  minecraft.class06962
 */
package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.OptionalDynamic;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import minecraft.class00622;
import minecraft.class01296;
import minecraft.class06962;

public class class04431
extends DataFix {
    private final String N;
    private static final Set<String> y = Set.of("minecraft:empty", "minecraft:structure_starts", "minecraft:structure_references", "minecraft:biomes");

    public class04431(Schema schema) {
        super(schema, false);
        this.N = "Blending Data Fix v" + schema.getVersionKey();
    }

    private static Dynamic<?> N(Dynamic<?> dynamic, int n, int n2) {
        return dynamic.set("blending_data", dynamic.createMap(Map.of(dynamic.createString("min_section"), dynamic.createInt(class01296.N((int)n2)), dynamic.createString("max_section"), dynamic.createInt(class01296.N((int)(n2 + n))))));
    }

    private static Dynamic<?> N(Dynamic<?> dynamic, OptionalDynamic<?> optionalDynamic) {
        Dynamic<?> var0;
        dynamic = dynamic.remove("blending_data");
        boolean bl = "minecraft:overworld".equals(optionalDynamic.get("dimension").asString().result().orElse(""));
        Optional optional = dynamic.get("Status").result();
        if (bl && optional.isPresent()) {
            String string;
            String string2 = class00622.N((String)((Dynamic)optional.get()).asString("empty"));
            Optional optional2 = dynamic.get("below_zero_retrogen").result();
            if (!y.contains(string2)) {
                var0 = class04431.N(dynamic, 384, -64);
            } else if (optional2.isPresent() && !y.contains(string = class00622.N((String)((Dynamic)optional2.get()).get("target_status").asString("empty")))) {
                var0 = class04431.N(var0, 256, 0);
            }
        }
        return var0;
    }

    protected TypeRewriteRule makeRule() {
        Type var1 = this.getOutputSchema().getType(class06962.u);
        return this.fixTypeEverywhereTyped(this.N, var1, typed -> typed.update(DSL.remainderFinder(), dynamic -> class04431.N(dynamic, dynamic.get("__context"))));
    }
}

