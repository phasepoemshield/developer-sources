/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.minecraft.item.data.StatePropertyMatcher$RangedMatcher
 *  com.viaversion.viaversion.util.Either
 */
package com.viaversion.viaversion.api.minecraft.item.data;

import com.viaversion.viaversion.api.minecraft.item.data.StatePropertyMatcher;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.types.ArrayType;
import com.viaversion.viaversion.util.Either;

public record StatePropertyMatcher(String name, Either<String, RangedMatcher> matcher) {
    public static final Type<StatePropertyMatcher> TYPE = new /* Unavailable Anonymous Inner Class!! */;
    public static final Type<StatePropertyMatcher[]> ARRAY_TYPE = new ArrayType<StatePropertyMatcher>(TYPE);
}

