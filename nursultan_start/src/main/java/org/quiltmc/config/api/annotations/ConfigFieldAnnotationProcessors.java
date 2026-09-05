/*
 * Decompiled with CFR 0.152.
 */
package org.quiltmc.config.api.annotations;

import java.lang.annotation.Annotation;
import org.quiltmc.config.api.annotations.ConfigFieldAnnotationProcessor;
import org.quiltmc.config.api.metadata.MetadataContainerBuilder;

public final class ConfigFieldAnnotationProcessors {
    public static void register(Class clazz, ConfigFieldAnnotationProcessor configFieldAnnotationProcessor) {
        ConfigFieldAnnotationProcessor.register(clazz, configFieldAnnotationProcessor);
    }

    public static void applyAnnotationProcessors(Annotation annotation, MetadataContainerBuilder metadataContainerBuilder) {
        ConfigFieldAnnotationProcessor.applyAnnotationProcessors(annotation, metadataContainerBuilder);
    }
}

