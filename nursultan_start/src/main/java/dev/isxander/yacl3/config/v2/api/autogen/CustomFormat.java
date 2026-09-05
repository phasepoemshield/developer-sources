/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.api.controller.ValueFormatter
 */
package dev.isxander.yacl3.config.v2.api.autogen;

import dev.isxander.yacl3.api.controller.ValueFormatter;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(value=RetentionPolicy.RUNTIME)
@Target(value={ElementType.FIELD})
public @interface CustomFormat {
    public Class<? extends ValueFormatter<?>> value();
}

