/*
 * Decompiled with CFR 0.152.
 */
package jnr.ffi.types;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import jnr.ffi.TypeAlias;
import jnr.ffi.annotations.TypeDefinition;

@Target(value={ElementType.PARAMETER, ElementType.METHOD})
@Retention(value=RetentionPolicy.RUNTIME)
@TypeDefinition(alias=TypeAlias.int16_t)
public @interface int16_t {
}

