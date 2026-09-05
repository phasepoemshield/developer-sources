/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  dev.isxander.yacl3.impl.OptionGroupImpl$BuilderImpl
 *  minecraft.class00392
 */
package dev.isxander.yacl3.api;

import com.google.common.collect.ImmutableList;
import dev.isxander.yacl3.api.Option;
import dev.isxander.yacl3.api.OptionDescription;
import dev.isxander.yacl3.api.OptionGroup$Builder;
import dev.isxander.yacl3.impl.OptionGroupImpl;
import minecraft.class00392;

public interface OptionGroup {
    public OptionDescription description();

    public ImmutableList<? extends Option<?>> options();

    public class00392 name();

    @Deprecated
    public class00392 tooltip();

    public static OptionGroup$Builder createBuilder() {
        return new OptionGroupImpl.BuilderImpl();
    }

    public boolean isRoot();

    public boolean collapsed();
}

