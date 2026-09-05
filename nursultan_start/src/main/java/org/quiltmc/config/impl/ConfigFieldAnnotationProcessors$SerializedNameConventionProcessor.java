/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.quiltmc.config.api.annotations.ConfigFieldAnnotationProcessor
 *  org.quiltmc.config.api.annotations.SerializedNameConvention
 *  org.quiltmc.config.api.exceptions.ConfigFieldException
 *  org.quiltmc.config.api.metadata.MetadataContainerBuilder
 *  org.quiltmc.config.api.metadata.MetadataType
 */
package org.quiltmc.config.impl;

import org.quiltmc.config.api.annotations.ConfigFieldAnnotationProcessor;
import org.quiltmc.config.api.annotations.SerializedNameConvention;
import org.quiltmc.config.api.exceptions.ConfigFieldException;
import org.quiltmc.config.api.metadata.MetadataContainerBuilder;
import org.quiltmc.config.api.metadata.MetadataType;
import org.quiltmc.config.impl.ConfigFieldAnnotationProcessors$1;
import org.quiltmc.config.impl.util.NamingSchemeHelper;

final class ConfigFieldAnnotationProcessors$SerializedNameConventionProcessor
implements ConfigFieldAnnotationProcessor {
    private final NamingSchemeHelper namingSchemeHelper;

    /* synthetic */ ConfigFieldAnnotationProcessors$SerializedNameConventionProcessor(ConfigFieldAnnotationProcessors$1 configFieldAnnotationProcessors$1) {
        this();
    }

    private ConfigFieldAnnotationProcessors$SerializedNameConventionProcessor() {
        NamingSchemeHelper namingSchemeHelper;
        NamingSchemeHelper namingSchemeHelper2 = namingSchemeHelper;
        namingSchemeHelper = new NamingSchemeHelper();
        v1.namingSchemeHelper = namingSchemeHelper2;
    }

    public void process(SerializedNameConvention serializedNameConvention, MetadataContainerBuilder metadataContainerBuilder) {
        ConfigFieldAnnotationProcessors$SerializedNameConventionProcessor configFieldAnnotationProcessors$SerializedNameConventionProcessor = configFieldAnnotationProcessors$SerializedNameConventionProcessor2;
        ConfigFieldAnnotationProcessors$SerializedNameConventionProcessor configFieldAnnotationProcessors$SerializedNameConventionProcessor2 = SerializedNameConvention.TYPE;
        metadataContainerBuilder.metadata((MetadataType)configFieldAnnotationProcessors$SerializedNameConventionProcessor2, builder -> builder.set(this.namingSchemeHelper.getNamingScheme(serializedNameConvention, ConfigFieldException::new)));
    }
}

