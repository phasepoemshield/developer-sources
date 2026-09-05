/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.serialization.Dynamic
 */
package minecraft;

import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.function.UnaryOperator;
import minecraft.class08347;

public class class08379
extends class08347 {
    private final String N;
    private final String y;
    private final String L;
    private final UnaryOperator<String> u;

    public class08379(Schema schema, String string, String string2, String string3, String string4, UnaryOperator<String> unaryOperator) {
        super(schema, string);
        this.N = string2;
        this.y = string3;
        this.L = string4;
        this.u = unaryOperator;
    }

    @Override
    protected <T> Dynamic<T> N(String string, Dynamic<T> dynamic2) {
        return dynamic2.renameAndFixField(this.y, this.L, dynamic -> dynamic.createString((String)this.u.apply(dynamic.asString(""))));
    }

    @Override
    protected boolean N(String string) {
        return string.equals(this.N);
    }
}

