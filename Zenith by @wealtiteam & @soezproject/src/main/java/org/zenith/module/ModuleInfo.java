package org.zenith.module;

import org.zenith.module.Interface;


import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface ModuleInfo {
   String name();

   Category category();

   String description();

   boolean long120() default false;
}
