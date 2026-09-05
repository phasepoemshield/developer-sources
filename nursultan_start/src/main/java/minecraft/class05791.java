/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Dynamic
 *  minecraft.class08158
 */
package minecraft;

import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import minecraft.class08158;

public class class05791
extends class08158 {
    public class05791(Schema schema, boolean bl) {
        super("EntityElderGuardianSplitFix", schema, bl);
    }

    protected Pair<String, Dynamic<?>> N(String string, Dynamic<?> dynamic) {
        return Pair.of((Object)(Objects.equals(string, "Guardian") && dynamic.get("Elder").asBoolean(false) ? "ElderGuardian" : string), dynamic);
    }
}

