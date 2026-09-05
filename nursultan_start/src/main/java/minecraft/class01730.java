/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.serialization.Dynamic
 *  minecraft.class06962
 */
package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.Optional;
import minecraft.class06962;

public class class01730
extends DataFix {
    private static final String N = "WorldGenSettings";
    private static final List<String> y = List.of("RandomSeed", "generatorName", "generatorOptions", "generatorVersion", "legacy_custom_options", "MapFeatures", "BonusChest");

    public class01730(Schema schema) {
        super(schema, false);
    }

    protected TypeRewriteRule makeRule() {
        return this.fixTypeEverywhereTyped("LevelLegacyWorldGenSettingsFix", this.getInputSchema().getType(class06962.N), typed -> typed.update(DSL.remainderFinder(), dynamic -> {
            Dynamic dynamic2 = dynamic.get(N).orElseEmptyMap();
            for (String string : y) {
                Optional optional = dynamic.get(string).result();
                if (!optional.isPresent()) continue;
                dynamic = dynamic.remove(string);
                dynamic2 = dynamic2.set(string, (Dynamic)optional.get());
            }
            return dynamic.set(N, dynamic2);
        }));
    }
}

