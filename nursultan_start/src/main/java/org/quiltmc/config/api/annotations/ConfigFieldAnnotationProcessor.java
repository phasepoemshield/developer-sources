/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.quiltmc.config.impl.ConfigFieldAnnotationProcessors
 */
package org.quiltmc.config.api.annotations;

import java.lang.annotation.Annotation;
import org.quiltmc.config.api.metadata.MetadataContainerBuilder;
import org.quiltmc.config.impl.ConfigFieldAnnotationProcessors;

public interface ConfigFieldAnnotationProcessor {
    public static void register(Class clazz, ConfigFieldAnnotationProcessor configFieldAnnotationProcessor) {
        ConfigFieldAnnotationProcessors.register((Class)clazz, (ConfigFieldAnnotationProcessor)configFieldAnnotationProcessor);
    }

    public void process(Annotation var1, MetadataContainerBuilder var2);

    public static void applyAnnotationProcessors(Annotation annotation, MetadataContainerBuilder metadataContainerBuilder) {
        ConfigFieldAnnotationProcessors.applyAnnotationProcessors((Annotation)annotation, (MetadataContainerBuilder)metadataContainerBuilder);
    }
}

