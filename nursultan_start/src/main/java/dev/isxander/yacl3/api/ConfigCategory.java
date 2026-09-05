/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  dev.isxander.yacl3.impl.ConfigCategoryImpl$BuilderImpl
 *  minecraft.class00392
 */
package dev.isxander.yacl3.api;

import com.google.common.collect.ImmutableList;
import dev.isxander.yacl3.api.ConfigCategory$Builder;
import dev.isxander.yacl3.api.OptionGroup;
import dev.isxander.yacl3.impl.ConfigCategoryImpl;
import minecraft.class00392;

public interface ConfigCategory {
    public class00392 name();

    public ImmutableList<OptionGroup> groups();

    public class00392 tooltip();

    public static ConfigCategory$Builder createBuilder() {
        return new ConfigCategoryImpl.BuilderImpl();
    }
}

