/*
 * Decompiled with CFR 0.152.
 */
package dev.isxander.yacl3.config.v2.api.autogen;

import dev.isxander.yacl3.config.v2.api.autogen.ListGroup$ControllerFactory;
import dev.isxander.yacl3.config.v2.api.autogen.ListGroup$ValueFactory;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(value=RetentionPolicy.RUNTIME)
@Target(value={ElementType.FIELD})
public @interface ListGroup {
    public int maxEntries() default 0;

    public int minEntries() default 0;

    public boolean addEntriesToBottom() default false;

    public Class<? extends ListGroup$ValueFactory<?>> valueFactory();

    public Class<? extends ListGroup$ControllerFactory<?>> controllerFactory();
}

