/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.quiltmc.config.api.annotations.ConfigFieldAnnotationProcessor
 *  org.quiltmc.config.api.annotations.SerializedName
 *  org.quiltmc.config.api.metadata.MetadataContainerBuilder
 *  org.quiltmc.config.api.metadata.MetadataType
 */
package org.quiltmc.config.impl;

import org.quiltmc.config.api.annotations.ConfigFieldAnnotationProcessor;
import org.quiltmc.config.api.annotations.SerializedName;
import org.quiltmc.config.api.metadata.MetadataContainerBuilder;
import org.quiltmc.config.api.metadata.MetadataType;
import org.quiltmc.config.impl.ConfigFieldAnnotationProcessors$1;

final class ConfigFieldAnnotationProcessors$SerialNameProcessor
implements ConfigFieldAnnotationProcessor {
    /* synthetic */ ConfigFieldAnnotationProcessors$SerialNameProcessor(ConfigFieldAnnotationProcessors$1 configFieldAnnotationProcessors$1) {
        this();
    }

    private ConfigFieldAnnotationProcessors$SerialNameProcessor() {
    }

    public void process(SerializedName serializedName, MetadataContainerBuilder metadataContainerBuilder) {
        ConfigFieldAnnotationProcessors$SerialNameProcessor configFieldAnnotationProcessors$SerialNameProcessor = SerializedName.TYPE;
        metadataContainerBuilder.metadata((MetadataType)configFieldAnnotationProcessors$SerialNameProcessor, builder -> builder.withName(serializedName.value()));
    }
}

