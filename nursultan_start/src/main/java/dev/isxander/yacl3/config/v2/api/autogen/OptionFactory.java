/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.api.Option
 */
package dev.isxander.yacl3.config.v2.api.autogen;

import dev.isxander.yacl3.api.Option;
import dev.isxander.yacl3.config.v2.api.ConfigField;
import dev.isxander.yacl3.config.v2.api.autogen.OptionAccess;
import dev.isxander.yacl3.config.v2.impl.autogen.OptionFactoryRegistry;
import java.lang.annotation.Annotation;

public interface OptionFactory<A extends Annotation, T> {
    public static <A extends Annotation, T> void register(Class<A> clazz, OptionFactory<A, T> optionFactory) {
        OptionFactoryRegistry.registerOptionFactory(clazz, optionFactory);
    }

    public Option<T> createOption(A var1, ConfigField<T> var2, OptionAccess var3);
}

