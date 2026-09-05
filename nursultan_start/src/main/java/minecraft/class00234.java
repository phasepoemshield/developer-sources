/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL$TypeReference
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  minecraft.class00955
 *  minecraft.class02269
 */
package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import minecraft.class00955;
import minecraft.class02269;

public class class00234
extends class00955 {
    public class00234(Schema schema, String string, DSL.TypeReference typeReference, String string2) {
        super(schema, true, string, typeReference, string2);
    }

    protected Typed<?> N(Typed<?> typed) {
        return class02269.N((Type)this.getOutputSchema().getChoiceType(this.y, this.N), typed);
    }
}

