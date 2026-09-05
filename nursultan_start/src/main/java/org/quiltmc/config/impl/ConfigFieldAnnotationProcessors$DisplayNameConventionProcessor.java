/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.quiltmc.config.api.annotations.ConfigFieldAnnotationProcessor
 *  org.quiltmc.config.api.annotations.DisplayNameConvention
 *  org.quiltmc.config.api.exceptions.ConfigFieldException
 *  org.quiltmc.config.api.metadata.MetadataContainerBuilder
 *  org.quiltmc.config.api.metadata.MetadataType
 */
package org.quiltmc.config.impl;

import org.quiltmc.config.api.annotations.ConfigFieldAnnotationProcessor;
import org.quiltmc.config.api.annotations.DisplayNameConvention;
import org.quiltmc.config.api.exceptions.ConfigFieldException;
import org.quiltmc.config.api.metadata.MetadataContainerBuilder;
import org.quiltmc.config.api.metadata.MetadataType;
import org.quiltmc.config.impl.ConfigFieldAnnotationProcessors$1;
import org.quiltmc.config.impl.util.NamingSchemeHelper;

final class ConfigFieldAnnotationProcessors$DisplayNameConventionProcessor
implements ConfigFieldAnnotationProcessor {
    private final NamingSchemeHelper namingSchemeHelper;

    /* synthetic */ ConfigFieldAnnotationProcessors$DisplayNameConventionProcessor(ConfigFieldAnnotationProcessors$1 configFieldAnnotationProcessors$1) {
        this();
    }

    private ConfigFieldAnnotationProcessors$DisplayNameConventionProcessor() {
        NamingSchemeHelper namingSchemeHelper;
        NamingSchemeHelper namingSchemeHelper2 = namingSchemeHelper;
        namingSchemeHelper = new NamingSchemeHelper();
        v1.namingSchemeHelper = namingSchemeHelper2;
    }

    public void process(DisplayNameConvention displayNameConvention, MetadataContainerBuilder metadataContainerBuilder) {
        ConfigFieldAnnotationProcessors$DisplayNameConventionProcessor configFieldAnnotationProcessors$DisplayNameConventionProcessor = configFieldAnnotationProcessors$DisplayNameConventionProcessor2;
        ConfigFieldAnnotationProcessors$DisplayNameConventionProcessor configFieldAnnotationProcessors$DisplayNameConventionProcessor2 = DisplayNameConvention.TYPE;
        metadataContainerBuilder.metadata((MetadataType)configFieldAnnotationProcessors$DisplayNameConventionProcessor2, builder -> builder.set(this.namingSchemeHelper.getNamingScheme(displayNameConvention, ConfigFieldException::new)));
    }
}

