/*
 * Decompiled with CFR 0.152.
 */
package dev.isxander.yacl3.config.v2.api.autogen;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(value=RetentionPolicy.RUNTIME)
@Target(value={ElementType.FIELD})
public @interface LongField {
    public long min() default -9223372036854775808L;

    public long max() default 0x7FFFFFFFFFFFFFFFL;

    public String format() default "%.0f";
}

