/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.quiltmc.config.api.annotations.ChangeWarning
 *  org.quiltmc.config.api.annotations.ConfigFieldAnnotationProcessor
 *  org.quiltmc.config.api.metadata.MetadataContainerBuilder
 *  org.quiltmc.config.api.metadata.MetadataType
 */
package org.quiltmc.config.impl;

import org.quiltmc.config.api.annotations.ChangeWarning;
import org.quiltmc.config.api.annotations.ConfigFieldAnnotationProcessor;
import org.quiltmc.config.api.metadata.MetadataContainerBuilder;
import org.quiltmc.config.api.metadata.MetadataType;
import org.quiltmc.config.impl.ConfigFieldAnnotationProcessors$1;

final class ConfigFieldAnnotationProcessors$ChangeWarningProcessor
implements ConfigFieldAnnotationProcessor {
    /* synthetic */ ConfigFieldAnnotationProcessors$ChangeWarningProcessor(ConfigFieldAnnotationProcessors$1 configFieldAnnotationProcessors$1) {
        this();
    }

    private ConfigFieldAnnotationProcessors$ChangeWarningProcessor() {
    }

    public void process(ChangeWarning changeWarning, MetadataContainerBuilder metadataContainerBuilder) {
        ConfigFieldAnnotationProcessors$ChangeWarningProcessor configFieldAnnotationProcessors$ChangeWarningProcessor = ChangeWarning.TYPE;
        metadataContainerBuilder.metadata((MetadataType)configFieldAnnotationProcessors$ChangeWarningProcessor, builder -> {
            builder.setMessage(changeWarning.customMessage());
            builder.setType(changeWarning.value());
        });
    }
}

