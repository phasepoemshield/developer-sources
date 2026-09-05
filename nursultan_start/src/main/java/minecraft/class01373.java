/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.OpticFinder
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Dynamic
 *  minecraft.class06962
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import minecraft.class01350;
import minecraft.class06962;
import org.slf4j.Logger;

public class class01373
extends class01350 {
    private static final Logger y = LogUtils.getLogger();

    private Dynamic<?> L(Dynamic<?> dynamic2) {
        return dynamic2.update("DimensionData", dynamic -> dynamic.updateMapValues(pair -> pair.mapSecond(dynamic2 -> dynamic2.update("DragonFight", dynamic -> class01373.L(dynamic, "DragonUUID", "Dragon").orElse((Dynamic<?>)dynamic)))));
    }

    public class01373(Schema schema) {
        super(schema, class06962.N);
    }

    private Dynamic<?> u(Dynamic<?> dynamic) {
        return dynamic.update("Players", dynamic3 -> dynamic.createList(dynamic3.asStream().map(dynamic -> class01373.N(dynamic).orElseGet(() -> {
            y.warn("CustomBossEvents contains invalid UUIDs.");
            return dynamic;
        }))));
    }

    private Dynamic<?> y(Dynamic<?> dynamic) {
        return class01373.N(dynamic, "WanderingTraderId", "WanderingTraderId").orElse(dynamic);
    }

    protected TypeRewriteRule makeRule() {
        Type type = this.getInputSchema().getType(this.N);
        OpticFinder opticFinder = type.findField("CustomBossEvents");
        OpticFinder opticFinder2 = DSL.typeFinder((Type)DSL.and((Type)DSL.optional((Type)DSL.field((String)"Name", (Type)this.getInputSchema().getTypeRaw(class06962.O))), (Type)DSL.remainderType()));
        return this.fixTypeEverywhereTyped("LevelUUIDFix", type, typed -> typed.update(DSL.remainderFinder(), dynamic -> {
            dynamic = this.L((Dynamic<?>)dynamic);
            dynamic = this.y((Dynamic<?>)dynamic);
            return dynamic;
        }).updateTyped(opticFinder, typed2 -> typed2.updateTyped(opticFinder2, typed -> typed.update(DSL.remainderFinder(), this::u))));
    }
}

