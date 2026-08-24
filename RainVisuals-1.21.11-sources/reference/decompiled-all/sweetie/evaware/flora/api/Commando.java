package sweetie.evaware.flora.api;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// $VF: Compiled from Commando.java
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Commando {
   DispatchMode mode() default DispatchMode.SYNC;

   byte priority() default 1;
}
