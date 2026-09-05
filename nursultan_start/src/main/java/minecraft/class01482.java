/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.DataFixUtils
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.serialization.Dynamic
 *  minecraft.class06962
 */
package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.stream.Stream;
import minecraft.class06962;

public abstract class class01482
extends DataFix {
    private final String N;

    private <T> Dynamic<T> L(Dynamic<T> dynamic) {
        return (Dynamic)DataFixUtils.orElse(dynamic.asStreamOpt().result().map(stream -> dynamic.createList(this.N((Stream)stream))), dynamic);
    }

    public class01482(Schema schema, String string) {
        super(schema, false);
        this.N = string;
    }

    private Dynamic<?> y(Dynamic<?> dynamic) {
        return dynamic.update("Records", this::L);
    }

    protected abstract <T> Stream<Dynamic<T>> N(Stream<Dynamic<T>> var1);

    private <T> Dynamic<T> N(Dynamic<T> dynamic2) {
        return dynamic2.update("Sections", dynamic -> dynamic.updateMapValues(pair -> pair.mapSecond(this::y)));
    }

    protected TypeRewriteRule makeRule() {
        Type type = DSL.named((String)class06962.v.typeName(), (Type)DSL.remainderType());
        if (!Objects.equals(type, this.getInputSchema().getType(class06962.v))) {
            throw new IllegalStateException("Poi type is not what was expected.");
        }
        return this.fixTypeEverywhere(this.N, type, dynamicOps -> pair -> pair.mapSecond(this::N));
    }
}

