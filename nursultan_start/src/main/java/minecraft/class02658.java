/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.serialization.Dynamic
 *  minecraft.class00622
 *  minecraft.class06962
 */
package minecraft;

import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import minecraft.class00622;
import minecraft.class06962;

public class class02658
extends DataFix {
    public class02658(Schema schema) {
        super(schema, false);
    }

    public TypeRewriteRule makeRule() {
        Type type = this.getInputSchema().getType(class06962.Y);
        return this.writeFixAndRead("EmptyItemInVillagerTradeFix", type, type, dynamic -> {
            Dynamic dynamic2 = dynamic.get("buyB").orElseEmptyMap();
            String string = class00622.N((String)dynamic2.get("id").asString("minecraft:air"));
            int n = dynamic2.get("count").asInt(0);
            if (string.equals("minecraft:air") || n == 0) {
                return dynamic.remove("buyB");
            }
            return dynamic;
        });
    }
}

