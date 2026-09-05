/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  minecraft.class06962
 */
package minecraft;

import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import java.util.HashMap;
import java.util.Map;
import minecraft.class06962;

public class class08408
extends DataFix {
    private static final Map<Integer, String> N = Map.of(100, "feet", 101, "legs", 102, "chest", 103, "head", -106, "offhand");

    public class08408(Schema schema) {
        super(schema, true);
    }

    protected TypeRewriteRule makeRule() {
        Type var1 = this.getInputSchema().getTypeRaw(class06962.L);
        Type var2 = this.getOutputSchema().getTypeRaw(class06962.L);
        return this.writeFixAndRead("Player Equipment Fix", var1, var2, dynamic2 -> {
            HashMap hashMap = new HashMap();
            dynamic2 = dynamic2.update("Inventory", dynamic -> dynamic.createList(dynamic.asStream().filter(dynamic2 -> {
                int n = dynamic2.get("Slot").asInt(-1);
                String string = N.get(n);
                if (string != null) {
                    hashMap.put(dynamic.createString(string), dynamic2.remove("Slot"));
                }
                return string == null;
            })));
            dynamic2 = dynamic2.set("equipment", dynamic2.createMap(hashMap));
            return dynamic2;
        });
    }
}

