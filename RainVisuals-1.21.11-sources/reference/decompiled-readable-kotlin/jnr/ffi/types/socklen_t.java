package jnr.ffi.types;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import jnr.ffi.TypeAlias;
import jnr.ffi.annotations.TypeDefinition;

// $VF: Compiled from socklen_t.java
@Target({ElementType.PARAMETER, ElementType.METHOD})
@TypeDefinition(alias = TypeAlias.socklen_t)
@Retention(RetentionPolicy.RUNTIME)
public @interface socklen_t {
}
