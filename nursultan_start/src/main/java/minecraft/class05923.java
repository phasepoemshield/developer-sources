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
 *  minecraft.class06962
 */
package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import minecraft.class06962;

public class class05923
extends DataFix {
    public class05923(Schema schema, boolean bl) {
        super(schema, bl);
    }

    private static <T> Dynamic<T> N(Dynamic<T> dynamic2) {
        return dynamic2.update("Sections", dynamic -> dynamic.updateMapValues(pair -> pair.mapSecond(dynamic -> dynamic.remove("Valid"))));
    }

    protected TypeRewriteRule makeRule() {
        Type type = DSL.named((String)class06962.v.typeName(), (Type)DSL.remainderType());
        if (!Objects.equals(type, this.getInputSchema().getType(class06962.v))) {
            throw new IllegalStateException("Poi type is not what was expected.");
        }
        return this.fixTypeEverywhere("POI rebuild", type, dynamicOps -> pair -> pair.mapSecond(class05923::N));
    }
}

