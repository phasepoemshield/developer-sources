/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.serialization.Dynamic
 *  minecraft.class00955
 *  minecraft.class06962
 */
package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Map;
import minecraft.class00955;
import minecraft.class06962;

public class class00314
extends class00955 {
    private final Map<String, String> L;

    public class00314(Schema schema, String string, String string2, Map<String, String> map) {
        super(schema, false, string, class06962.o, string2);
        this.L = map;
    }

    public Dynamic<?> N(Dynamic<?> dynamic) {
        for (Map.Entry<String, String> entry : this.L.entrySet()) {
            dynamic = dynamic.renameField(entry.getKey(), entry.getValue());
        }
        return dynamic;
    }

    protected Typed<?> N(Typed<?> typed) {
        return typed.update(DSL.remainderFinder(), this::N);
    }
}

