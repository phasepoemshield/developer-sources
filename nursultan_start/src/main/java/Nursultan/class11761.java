/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11616
 */
package Nursultan;

import Nursultan.class11616;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value={ElementType.TYPE})
@Retention(value=RetentionPolicy.RUNTIME)
public @interface class11761 {
    public boolean L() default false;

    public float i();

    public String u();

    public class11616 y() default class11616.FULL;

    public float N();
}

