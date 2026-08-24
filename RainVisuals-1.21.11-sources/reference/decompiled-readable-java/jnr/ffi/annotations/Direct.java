/*
 * Decompiled with CFR 0.152.
 */
package jnr.ffi.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value={ElementType.PARAMETER, ElementType.ANNOTATION_TYPE})
@Retention(value=RetentionPolicy.RUNTIME)
public @interface Direct {
}

