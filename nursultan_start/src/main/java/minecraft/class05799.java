/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10538
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.DataFixUtils
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.serialization.Dynamic
 *  minecraft.class00622
 *  minecraft.class06962
 */
package minecraft;

import Nursultan.class10538;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import minecraft.class00622;
import minecraft.class06962;

public abstract class class05799
extends DataFix {
    private final String N;

    public class05799(Schema schema, String string) {
        super(schema, false);
        this.N = string;
    }

    private String y(String string) {
        int n = string.indexOf(91);
        int n2 = string.indexOf(123);
        int n3 = string.length();
        if (n > 0) {
            n3 = n;
        }
        if (n2 > 0) {
            n3 = Math.min(n3, n2);
        }
        String string2 = string.substring(0, n3);
        return this.N(string2) + string.substring(n3);
    }

    private Dynamic<?> N(Dynamic<?> dynamic) {
        Optional var2 = dynamic.get("Name").asString().result();
        if (var2.isPresent()) {
            return dynamic.set("Name", dynamic.createString(this.N((String)var2.get())));
        }
        return dynamic;
    }

    protected abstract String N(String var1);

    public static DataFix N(Schema schema, String string, Function<String, String> function) {
        return new class10538(schema, string, function);
    }

    public TypeRewriteRule makeRule() {
        Type var2;
        Type var1 = this.getInputSchema().getType(class06962.q);
        if (!Objects.equals(var1, var2 = DSL.named((String)class06962.q.typeName(), (Type)class00622.N()))) {
            throw new IllegalStateException("block type is not what was expected.");
        }
        TypeRewriteRule typeRewriteRule = this.fixTypeEverywhere(this.N + " for block", var2, dynamicOps -> pair -> pair.mapSecond(this::N));
        TypeRewriteRule typeRewriteRule2 = this.fixTypeEverywhereTyped(this.N + " for block_state", this.getInputSchema().getType(class06962.d), typed -> typed.update(DSL.remainderFinder(), this::N));
        TypeRewriteRule typeRewriteRule3 = this.fixTypeEverywhereTyped(this.N + " for flat_block_state", this.getInputSchema().getType(class06962.w), typed -> typed.update(DSL.remainderFinder(), dynamic -> (Dynamic)DataFixUtils.orElse(dynamic.asString().result().map(this::y).map(arg_0 -> ((Dynamic)dynamic).createString(arg_0)), (Object)dynamic)));
        return TypeRewriteRule.seq((TypeRewriteRule)typeRewriteRule, (TypeRewriteRule[])new TypeRewriteRule[]{typeRewriteRule2, typeRewriteRule3});
    }
}

