/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.schemas.Schema
 *  minecraft.class07906
 */
package Nursultan;

import com.mojang.datafixers.schemas.Schema;
import java.util.function.Function;
import minecraft.class07906;

public class class10858
extends class07906 {
    final /* synthetic */ Function N;

    public class10858(Schema schema, String string, Function function) {
        this.N = function;
        super(schema, string);
    }

    protected String N(String string) {
        return (String)this.N.apply(string);
    }
}

