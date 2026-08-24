/*
 * Decompiled with CFR 0.152.
 */
package org.intellij.lang.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.intellij.lang.annotations.Language;

@Target(value={ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.ANNOTATION_TYPE})
@Retention(value=RetentionPolicy.CLASS)
@Language(value="RegExp")
public @interface RegExp {
    public String suffix() default "";

    public String prefix() default "";
}

