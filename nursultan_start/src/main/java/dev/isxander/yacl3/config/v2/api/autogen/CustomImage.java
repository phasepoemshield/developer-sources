/*
 * Decompiled with CFR 0.152.
 */
package dev.isxander.yacl3.config.v2.api.autogen;

import dev.isxander.yacl3.config.v2.api.autogen.CustomImage$CustomImageFactory;
import dev.isxander.yacl3.config.v2.impl.autogen.EmptyCustomImageFactory;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(value=RetentionPolicy.RUNTIME)
@Target(value={ElementType.FIELD})
public @interface CustomImage {
    public int width() default 0;

    public String value() default "";

    public Class<? extends CustomImage$CustomImageFactory<?>> factory() default EmptyCustomImageFactory.class;

    public int height() default 0;
}

