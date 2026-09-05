/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.ExclusionStrategy
 *  com.google.gson.FieldAttributes
 */
package dev.isxander.yacl3.config;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import dev.isxander.yacl3.config.ConfigEntry;

class GsonConfigInstance$ConfigExclusionStrategy
implements ExclusionStrategy {
    GsonConfigInstance$ConfigExclusionStrategy() {
    }

    public boolean shouldSkipClass(Class<?> clazz) {
        return false;
    }

    public boolean shouldSkipField(FieldAttributes fieldAttributes) {
        return fieldAttributes.getAnnotation(ConfigEntry.class) == null;
    }
}

