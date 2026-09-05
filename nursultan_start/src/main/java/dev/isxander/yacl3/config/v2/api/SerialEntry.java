/*
 * Decompiled with CFR 0.152.
 */
package dev.isxander.yacl3.config.v2.api;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(value=RetentionPolicy.RUNTIME)
@Target(value={ElementType.FIELD, ElementType.TYPE})
public @interface SerialEntry {
    public boolean required() default true;

    public String value() default "";

    public String comment() default "";

    public boolean nullable() default false;
}

