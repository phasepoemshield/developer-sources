/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.schemas.Schema
 *  minecraft.class05799
 */
package Nursultan;

import com.mojang.datafixers.schemas.Schema;
import java.util.function.Function;
import minecraft.class05799;

public class class10538
extends class05799 {
    final /* synthetic */ Function N;

    public class10538(Schema schema, String string, Function function) {
        this.N = function;
        super(schema, string);
    }

    protected String N(String string) {
        return (String)this.N.apply(string);
    }
}

