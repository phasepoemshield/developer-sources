/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.api.ConfigCategory$Builder
 *  dev.isxander.yacl3.api.OptionAddable
 *  dev.isxander.yacl3.api.OptionGroup$Builder
 */
package dev.isxander.yacl3.config.v2.impl;

import dev.isxander.yacl3.api.ConfigCategory;
import dev.isxander.yacl3.api.OptionAddable;
import dev.isxander.yacl3.api.OptionGroup;
import java.util.Map;

record ConfigClassHandlerImpl$CategoryAndGroups(ConfigCategory.Builder category, Map<String, OptionAddable> groups) {
    private void finaliseGroups() {
        this.groups.forEach((string, optionAddable) -> {
            if (optionAddable instanceof OptionGroup.Builder) {
                OptionGroup.Builder builder = (OptionGroup.Builder)optionAddable;
                this.category.group(builder.build());
            }
        });
    }
}

