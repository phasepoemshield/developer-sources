/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.datafixers.util.Either
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JavaOps
 *  com.mojang.serialization.JsonOps
 *  minecraft.class05001
 *  minecraft.class06962
 *  minecraft.class07536
 */
package minecraft;

import com.google.gson.JsonElement;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JavaOps;
import com.mojang.serialization.JsonOps;
import java.util.Map;
import java.util.Optional;
import minecraft.class05001;
import minecraft.class06962;
import minecraft.class07536;

public class class08369
extends DataFix {
    public class08369(Schema schema) {
        super(schema, false);
    }

    private static <H> H y(Type<H> type, Dynamic<?> dynamic) {
        JsonElement jsonElement = (JsonElement)dynamic.convert((DynamicOps)JsonOps.INSTANCE).getValue();
        Dynamic dynamic2 = new Dynamic((DynamicOps)JavaOps.INSTANCE, Map.of("action", "show_text", "contents", Map.of("text", "Legacy hoverEvent: " + class05001.i((JsonElement)jsonElement))));
        return (H)class07536.N(type, (Dynamic)dynamic2).getValue();
    }

    private <C, H extends Pair<String, ?>> TypeRewriteRule N(Type<C> type, Type<H> type2) {
        Type type3 = DSL.named((String)class06962.O.typeName(), (Type)DSL.or((Type)DSL.or((Type)DSL.string(), (Type)DSL.list(type)), (Type)DSL.and((Type)DSL.optional((Type)DSL.field((String)"extra", (Type)DSL.list(type))), (Type)DSL.optional((Type)DSL.field((String)"separator", type)), (Type)DSL.optional((Type)DSL.field((String)"hoverEvent", type2)), (Type)DSL.remainderType())));
        if (!type3.equals((Object)this.getInputSchema().getType(class06962.O))) {
            throw new IllegalStateException("Text component type did not match, expected " + String.valueOf(type3) + " but got " + String.valueOf(this.getInputSchema().getType(class06962.O)));
        }
        return this.fixTypeEverywhere("LegacyHoverEventFix", type3, dynamicOps -> pair -> pair.mapSecond(either -> either.mapRight(pair -> pair.mapSecond(pair2 -> pair2.mapSecond(pair -> {
            Optional optional = ((Dynamic)pair.getSecond()).get("hoverEvent").result();
            if (optional.isEmpty()) {
                return pair;
            }
            if (((Dynamic)optional.get()).get("value").result().isEmpty()) {
                return pair;
            }
            String string = (String)((Either)pair.getFirst()).left().map(Pair::getFirst).orElse("");
            Pair pair2 = (Pair)this.N(type2, string, (Dynamic)optional.get());
            return pair.mapFirst(either -> Either.left((Object)pair2));
        })))));
    }

    private <H> H N(Type<H> type, String string, Dynamic<?> dynamic) {
        if ("show_text".equals(string)) {
            return class08369.N(type, dynamic);
        }
        return class08369.y(type, dynamic);
    }

    private static <H> H N(Type<H> type, Dynamic<?> dynamic) {
        Dynamic dynamic2 = dynamic.renameField("value", "contents");
        return (H)class07536.N(type, (Dynamic)dynamic2).getValue();
    }

    protected TypeRewriteRule makeRule() {
        Type var1 = this.getInputSchema().getType(class06962.O).findFieldType("hoverEvent");
        return this.N(this.getInputSchema().getTypeRaw(class06962.O), var1);
    }
}

