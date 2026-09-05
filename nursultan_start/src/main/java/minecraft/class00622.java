/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL$TypeReference
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.datafixers.types.templates.Const$PrimitiveType
 *  com.mojang.serialization.codecs.PrimitiveCodec
 *  minecraft.class01894
 */
package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.Const;
import com.mojang.serialization.codecs.PrimitiveCodec;
import minecraft.class00595;
import minecraft.class01894;

public class class00622
extends Schema {
    public static final PrimitiveCodec<String> N = new class00595();
    private static final Type<String> y = new Const.PrimitiveType(N);

    public class00622(int n, Schema schema) {
        super(n, schema);
    }

    public static String N(String string) {
        class01894 class018942 = class01894.L((String)string);
        if (class018942 != null) {
            return class018942.toString();
        }
        return string;
    }

    public static Type<String> N() {
        return y;
    }

    public Type<?> getChoiceType(DSL.TypeReference typeReference, String string) {
        return super.getChoiceType(typeReference, class00622.N(string));
    }
}

