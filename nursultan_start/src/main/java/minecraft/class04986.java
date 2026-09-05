/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09108
 *  com.google.gson.ExclusionStrategy
 *  com.google.gson.FieldAttributes
 */
package minecraft;

import Nursultan.class09108;
import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import minecraft.class04968;

class class04986
implements ExclusionStrategy {
    class04986(class04968 class049682) {
    }

    public boolean shouldSkipClass(Class<?> clazz) {
        return false;
    }

    public boolean shouldSkipField(FieldAttributes fieldAttributes) {
        return fieldAttributes.getAnnotation(class09108.class) != null;
    }
}

