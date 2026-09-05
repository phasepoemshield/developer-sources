/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

import Nursultan.class11777;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value={ElementType.METHOD})
@Retention(value=RetentionPolicy.RUNTIME)
public @interface class11782 {
    public Class<?>[] L() default {};

    public boolean u() default false;

    public class11777 y() default class11777.NOW;

    public Class<?>[] N() default {};
}

