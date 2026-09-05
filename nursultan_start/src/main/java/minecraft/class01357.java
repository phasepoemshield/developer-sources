/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.logging.LogUtils
 *  minecraft.class06962
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.logging.LogUtils;
import minecraft.class01350;
import minecraft.class06962;
import org.slf4j.Logger;

public class class01357
extends class01350 {
    private static final Logger y = LogUtils.getLogger();

    public class01357(Schema schema) {
        super(schema, class06962.W);
    }

    protected TypeRewriteRule makeRule() {
        return this.fixTypeEverywhereTyped("SavedDataUUIDFix", this.getInputSchema().getType(this.N), typed -> typed.update(DSL.remainderFinder(), dynamic2 -> dynamic2.update("data", dynamic -> dynamic.update("Raids", dynamic2 -> dynamic2.createList(dynamic2.asStream().map(dynamic -> dynamic.update("HeroesOfTheVillage", dynamic2 -> dynamic2.createList(dynamic2.asStream().map(dynamic -> class01357.u(dynamic, "UUIDMost", "UUIDLeast").orElseGet(() -> {
            y.warn("HeroesOfTheVillage contained invalid UUIDs.");
            return dynamic;
        }))))))))));
    }
}

