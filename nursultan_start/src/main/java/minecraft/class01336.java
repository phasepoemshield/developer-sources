/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.serialization.Dynamic
 *  minecraft.class01350
 *  minecraft.class06962
 */
package minecraft;

import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import minecraft.class01350;
import minecraft.class06962;

public class class01336
extends class01350 {
    private Dynamic<?> L(Dynamic<?> dynamic) {
        return class01336.y(dynamic, (String)"target_uuid", (String)"Target").orElse(dynamic);
    }

    public class01336(Schema schema) {
        super(schema, class06962.G);
    }

    private Dynamic<?> y(Dynamic<?> dynamic3) {
        return dynamic3.get("Owner").get().map(dynamic -> class01336.N((Dynamic)dynamic, (String)"Id", (String)"Id").orElse(dynamic)).map(dynamic2 -> dynamic3.remove("Owner").set("SkullOwner", dynamic2)).result().orElse(dynamic3);
    }

    protected TypeRewriteRule makeRule() {
        return this.fixTypeEverywhereTyped("BlockEntityUUIDFix", this.getInputSchema().getType(this.N), typed -> {
            typed = this.N((Typed)typed, "minecraft:conduit", this::L);
            typed = this.N((Typed)typed, "minecraft:skull", this::y);
            return typed;
        });
    }
}

