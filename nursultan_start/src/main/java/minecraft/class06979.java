/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 */
package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import java.util.Locale;
import java.util.Optional;
import minecraft.class06962;

public class class06979
extends DataFix {
    public class06979(Schema schema, boolean bl) {
        super(schema, bl);
    }

    public TypeRewriteRule makeRule() {
        return this.fixTypeEverywhereTyped("OptionsLowerCaseLanguageFix", this.getInputSchema().getType(class06962.R), typed -> typed.update(DSL.remainderFinder(), dynamic -> {
            Optional optional = dynamic.get("lang").asString().result();
            if (optional.isPresent()) {
                return dynamic.set("lang", dynamic.createString(((String)optional.get()).toLowerCase(Locale.ROOT)));
            }
            return dynamic;
        }));
    }
}

