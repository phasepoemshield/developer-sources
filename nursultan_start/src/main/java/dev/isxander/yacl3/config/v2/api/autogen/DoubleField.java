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
public @interface DoubleField {
    public double min() default -1.7976931348623157E308;

    public double max() default 1.7976931348623157E308;

    public String format() default "%.2f";
}

