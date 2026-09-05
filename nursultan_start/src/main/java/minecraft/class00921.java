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
import java.util.Optional;
import java.util.UUID;
import minecraft.class06962;

public class class00921
extends DataFix {
    public class00921(Schema schema, boolean bl) {
        super(schema, bl);
    }

    public TypeRewriteRule makeRule() {
        return this.fixTypeEverywhereTyped("EntityStringUuidFix", this.getInputSchema().getType(class06962.o), typed -> typed.update(DSL.remainderFinder(), dynamic -> {
            Optional optional = dynamic.get("UUID").asString().result();
            if (optional.isPresent()) {
                UUID uUID = UUID.fromString((String)optional.get());
                return dynamic.remove("UUID").set("UUIDMost", dynamic.createLong(uUID.getMostSignificantBits())).set("UUIDLeast", dynamic.createLong(uUID.getLeastSignificantBits()));
            }
            return dynamic;
        }));
    }
}

