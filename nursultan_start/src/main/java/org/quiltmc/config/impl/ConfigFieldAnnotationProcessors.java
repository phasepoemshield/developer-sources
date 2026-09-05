/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.quiltmc.config.api.annotations.ConfigFieldAnnotationProcessor
 *  org.quiltmc.config.api.metadata.MetadataContainerBuilder
 */
package org.quiltmc.config.impl;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.quiltmc.config.api.annotations.ConfigFieldAnnotationProcessor;
import org.quiltmc.config.api.metadata.MetadataContainerBuilder;

public final class ConfigFieldAnnotationProcessors {
    private static final Map PROCESSORS = new HashMap();

    public static void register(Class clazz2, ConfigFieldAnnotationProcessor configFieldAnnotationProcessor) {
        ((List)PROCESSORS.computeIfAbsent(clazz2, clazz -> new ArrayList())).add(configFieldAnnotationProcessor);
    }

    private static void process(ConfigFieldAnnotationProcessor configFieldAnnotationProcessor, Annotation annotation, MetadataContainerBuilder metadataContainerBuilder) {
        configFieldAnnotationProcessor.process(annotation, metadataContainerBuilder);
    }

    public static void applyAnnotationProcessors(Annotation annotation, MetadataContainerBuilder metadataContainerBuilder) {
        Iterator iterator = PROCESSORS.getOrDefault(annotation.annotationType(), Collections.emptyList()).iterator();
        while (iterator.hasNext()) {
            ConfigFieldAnnotationProcessors.process((ConfigFieldAnnotationProcessor)iterator.next(), annotation, metadataContainerBuilder);
        }
    }
}

