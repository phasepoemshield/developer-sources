/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value={ElementType.TYPE, ElementType.FIELD})
@Retention(value=RetentionPolicy.RUNTIME)
public @interface JsonAdapter {
    public boolean nullSafe() default true;

    public Class<?> value();
}

