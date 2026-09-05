/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JsonOps
 *  minecraft.class06962
 *  minecraft.class07536
 *  org.slf4j.Logger
 */
package minecraft;

import com.google.gson.JsonElement;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import minecraft.class06962;
import minecraft.class07536;
import minecraft.class08314;
import org.slf4j.Logger;

public class class08365
extends DataFix {
    private static final Logger N = LogUtils.getLogger();

    public class08365(Schema schema) {
        super(schema, true);
    }

    private static <T> Dynamic<T> N(DynamicOps<T> dynamicOps, String string) {
        try {
            JsonElement jsonElement = class08314.N(string);
            if (!jsonElement.isJsonNull()) {
                return new Dynamic(dynamicOps, JsonOps.INSTANCE.convertTo(dynamicOps, jsonElement));
            }
        }
        catch (Exception exception) {
            N.error("Failed to unflatten text component json: {}", (Object)string, (Object)exception);
        }
        return new Dynamic(dynamicOps, dynamicOps.createString(string));
    }

    private <T> TypeRewriteRule N(Type<Pair<String, String>> type, Type<T> type2) {
        return this.fixTypeEverywhere("UnflattenTextComponentFix", type, type2, dynamicOps -> pair -> class07536.N((Type)type2, class08365.N(dynamicOps, (String)pair.getSecond()), (boolean)true).getValue());
    }

    protected TypeRewriteRule makeRule() {
        Type type = this.getInputSchema().getType(class06962.O);
        Type type2 = this.getOutputSchema().getType(class06962.O);
        return this.N((Type<Pair<String, String>>)type, type2);
    }
}

