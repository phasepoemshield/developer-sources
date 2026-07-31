package org.wild.module.api;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import ru.metaculture.protection.Category;
import ru.metaculture.protection.O0000000OO0OOO;

@Retention(RetentionPolicy.RUNTIME)
public @interface ModuleRegister {
   String O00000000();

   String O000000000();

   Category O0000000000();

   O0000000OO0OOO[] O00000000000() default {};
}
