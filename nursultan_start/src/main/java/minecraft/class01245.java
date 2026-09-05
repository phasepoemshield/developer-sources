/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  minecraft.class06962
 */
package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import minecraft.class06962;

public class class01245
extends DataFix {
    private final String N;
    private final String y;
    private final String L;

    public class01245(Schema schema, boolean bl, String string, String string2, String string3) {
        super(schema, bl);
        this.N = string;
        this.y = string2;
        this.L = string3;
    }

    public TypeRewriteRule makeRule() {
        return this.fixTypeEverywhereTyped(this.N, this.getInputSchema().getType(class06962.R), typed -> typed.update(DSL.remainderFinder(), dynamic -> dynamic.renameField(this.y, this.L)));
    }
}

