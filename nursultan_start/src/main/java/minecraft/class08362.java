/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.serialization.Dynamic
 *  minecraft.class06962
 */
package minecraft;

import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import minecraft.class06962;

public class class08362
extends DataFix {
    public class08362(Schema schema) {
        super(schema, false);
    }

    private static <T> Dynamic<T> N(Dynamic<T> dynamic) {
        Optional optional = dynamic.asString().result();
        if (optional.isPresent()) {
            return dynamic.createBoolean(Boolean.parseBoolean((String)optional.get()));
        }
        return dynamic;
    }

    protected TypeRewriteRule makeRule() {
        Type type = this.getInputSchema().getType(class06962.O);
        return this.fixTypeEverywhere("TextComponentStringyFlagsFix", type, dynamicOps -> pair -> pair.mapSecond(either -> either.mapRight(pair -> pair.mapSecond(pair2 -> pair2.mapSecond(pair -> pair.mapSecond(dynamic -> dynamic.update("bold", class08362::N).update("italic", class08362::N).update("underlined", class08362::N).update("strikethrough", class08362::N).update("obfuscated", class08362::N)))))));
    }
}

