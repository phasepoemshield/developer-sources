/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL$TypeReference
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.serialization.Dynamic
 *  minecraft.class01733
 *  minecraft.class05832
 */
package Nursultan;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import minecraft.class01733;
import minecraft.class05832;

public class class10482
extends class01733 {
    public class10482(Schema schema, boolean bl, String string, DSL.TypeReference typeReference, String string2) {
        super(schema, bl, string, typeReference, string2);
    }

    protected <T> Dynamic<T> N(Dynamic<T> dynamic) {
        return class05832.N(dynamic);
    }
}

