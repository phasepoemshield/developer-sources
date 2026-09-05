/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.quiltmc.config.api.annotations.ConfigFieldAnnotationProcessor
 *  org.quiltmc.config.api.annotations.DisplayName
 *  org.quiltmc.config.api.metadata.MetadataContainerBuilder
 *  org.quiltmc.config.api.metadata.MetadataType
 */
package org.quiltmc.config.impl;

import org.quiltmc.config.api.annotations.ConfigFieldAnnotationProcessor;
import org.quiltmc.config.api.annotations.DisplayName;
import org.quiltmc.config.api.metadata.MetadataContainerBuilder;
import org.quiltmc.config.api.metadata.MetadataType;
import org.quiltmc.config.impl.ConfigFieldAnnotationProcessors$1;

final class ConfigFieldAnnotationProcessors$DisplayNameProcessor
implements ConfigFieldAnnotationProcessor {
    /* synthetic */ ConfigFieldAnnotationProcessors$DisplayNameProcessor(ConfigFieldAnnotationProcessors$1 configFieldAnnotationProcessors$1) {
        this();
    }

    private ConfigFieldAnnotationProcessors$DisplayNameProcessor() {
    }

    public void process(DisplayName displayName, MetadataContainerBuilder metadataContainerBuilder) {
        ConfigFieldAnnotationProcessors$DisplayNameProcessor configFieldAnnotationProcessors$DisplayNameProcessor = DisplayName.TYPE;
        metadataContainerBuilder.metadata((MetadataType)configFieldAnnotationProcessors$DisplayNameProcessor, builder -> {
            builder.setName(displayName.value());
            builder.setTranslatable(displayName.translatable());
        });
    }
}

