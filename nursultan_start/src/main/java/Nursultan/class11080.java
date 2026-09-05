/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

import Nursultan.class11072;
import Nursultan.class11101;
import Nursultan.class11106;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value={ElementType.TYPE})
@Retention(value=RetentionPolicy.RUNTIME)
public @interface class11080 {
    public String L();

    public class11101 u() default class11101.DEFAULT;

    public class11072 y();

    public class11106 N();
}

