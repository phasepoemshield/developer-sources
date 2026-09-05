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
public @interface FloatField {
    public float min() default -3.4028235E38f;

    public float max() default 3.4028235E38f;

    public String format() default "%.1f";
}

