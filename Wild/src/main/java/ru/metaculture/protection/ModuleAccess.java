package ru.metaculture.protection;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import ru.metaculture.profile.Role;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface ModuleAccess {
   Role O00000000() default Role.DEFAULT;

   Role[] O000000000() default {};

   String[] O0000000000() default {};

   int[] O00000000000() default {};
}
