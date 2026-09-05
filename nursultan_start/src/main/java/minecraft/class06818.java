/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.templates.TypeTemplate
 */
package minecraft;

import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class class06818
extends Schema {
    public class06818(int n, Schema schema) {
        super(n, schema);
    }

    public Map<String, Supplier<TypeTemplate>> registerEntities(Schema schema) {
        Map var2 = super.registerEntities(schema);
        var2.remove("TippedArrow");
        return var2;
    }
}

