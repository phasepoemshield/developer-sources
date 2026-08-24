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

@Retention(value=RetentionPolicy.RUNTIME)
@TypeDefinition(alias=TypeAlias.int8_t)
@Target(value={ElementType.PARAMETER, ElementType.METHOD})
public @interface int8_t {
}

