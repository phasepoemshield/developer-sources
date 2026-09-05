/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Dynamic
 *  minecraft.class08158
 */
package minecraft;

import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import minecraft.class08158;

public class class06115
extends class08158 {
    public class06115(Schema schema, boolean bl) {
        super("EntityCatSplitFix", schema, bl);
    }

    protected Pair<String, Dynamic<?>> N(String string, Dynamic<?> dynamic) {
        if (Objects.equals("minecraft:ocelot", string)) {
            int n = dynamic.get("CatType").asInt(0);
            if (n == 0) {
                String string2 = dynamic.get("Owner").asString("");
                String string3 = dynamic.get("OwnerUUID").asString("");
                if (!string2.isEmpty() || !string3.isEmpty()) {
                    dynamic.set("Trusting", dynamic.createBoolean(true));
                }
            } else if (n > 0 && n < 4) {
                dynamic = dynamic.set("CatType", dynamic.createInt(n));
                dynamic = dynamic.set("OwnerUUID", dynamic.createString(dynamic.get("OwnerUUID").asString("")));
                return Pair.of((Object)"minecraft:cat", (Object)dynamic);
            }
        }
        return Pair.of((Object)string, dynamic);
    }
}

