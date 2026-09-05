/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.DataFixUtils
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.serialization.Dynamic
 *  minecraft.class06962
 */
package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import minecraft.class06962;

public class class08184
extends DataFix {
    private final String N;
    private final String y;
    private final String L;
    private final String u;

    public class08184(Schema schema, String string, String string2, String string3, String string4) {
        super(schema, true);
        this.N = string;
        this.y = string2;
        this.L = string3;
        this.u = string4;
    }

    private String N(String string) {
        return switch (string) {
            case "2" -> this.u;
            case "0" -> this.y;
            default -> this.L;
        };
    }

    public TypeRewriteRule makeRule() {
        return this.fixTypeEverywhereTyped("graphicsMode split to " + this.N, this.getInputSchema().getType(class06962.R), typed -> typed.update(DSL.remainderFinder(), dynamic -> (Dynamic)DataFixUtils.orElseGet((Optional)dynamic.get("graphicsMode").asString().map(string -> dynamic.set(this.N, dynamic.createString(this.N((String)string)))).result(), () -> dynamic.set(this.N, dynamic.createString(this.L)))));
    }
}

