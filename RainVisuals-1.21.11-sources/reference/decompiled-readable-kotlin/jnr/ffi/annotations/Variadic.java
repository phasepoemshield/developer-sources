package jnr.ffi.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// $VF: Compiled from Variadic.java
@Retention(RetentionPolicy.RUNTIME)
public @interface Variadic {
   int fixedCount();
}
