/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  minecraft.class06962
 */
package minecraft;

import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import minecraft.class06962;

public class class06814
extends DataFix {
    public class06814(Schema schema) {
        super(schema, false);
    }

    protected TypeRewriteRule makeRule() {
        return this.writeFixAndRead("WorldBorderWarningTimeFix", this.getInputSchema().getType(class06962.b), this.getOutputSchema().getType(class06962.b), dynamic2 -> dynamic2.update("data", dynamic -> dynamic.update("warning_time", dynamic2 -> dynamic.createInt(dynamic2.asInt(15) * 20))));
    }
}

