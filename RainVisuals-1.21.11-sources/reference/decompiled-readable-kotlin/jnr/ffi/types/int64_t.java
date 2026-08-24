package jnr.ffi.types;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import jnr.ffi.TypeAlias;
import jnr.ffi.annotations.TypeDefinition;

// $VF: Compiled from int64_t.java
@Retention(RetentionPolicy.RUNTIME)
@TypeDefinition(alias = TypeAlias.int64_t)
@Target({ElementType.PARAMETER, ElementType.METHOD})
public @interface int64_t {
}
