/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10858
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  minecraft.class00622
 *  minecraft.class06962
 */
package minecraft;

import Nursultan.class10858;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import java.util.Objects;
import java.util.function.Function;
import minecraft.class00622;
import minecraft.class06962;

public abstract class class07906
extends DataFix {
    private final String N;

    public class07906(Schema schema, String string) {
        super(schema, false);
        this.N = string;
    }

    public static DataFix N(Schema schema, String string, Function<String, String> function) {
        return new class10858(schema, string, function);
    }

    protected abstract String N(String var1);

    public TypeRewriteRule makeRule() {
        Type type = DSL.named((String)class06962.K.typeName(), (Type)class00622.N());
        if (!Objects.equals(this.getInputSchema().getType(class06962.K), type)) {
            throw new IllegalStateException("item name type is not what was expected.");
        }
        return this.fixTypeEverywhere(this.N, type, dynamicOps -> pair -> pair.mapSecond(this::N));
    }
}

