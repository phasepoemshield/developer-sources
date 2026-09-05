/*
 * Decompiled with CFR 0.152.
 */
package dev.isxander.yacl3.config.v2.api.autogen;

import dev.isxander.yacl3.config.v2.api.autogen.Boolean$Formatter;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(value=RetentionPolicy.RUNTIME)
@Target(value={ElementType.FIELD})
public @interface Boolean {
    public Boolean$Formatter formatter() default Boolean$Formatter.TRUE_FALSE;

    public boolean colored() default false;
}

