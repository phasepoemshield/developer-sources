/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.quiltmc.config.api.Constraint
 *  org.quiltmc.config.api.annotations.ConfigFieldAnnotationProcessor
 *  org.quiltmc.config.api.annotations.Matches
 *  org.quiltmc.config.api.metadata.MetadataContainerBuilder
 *  org.quiltmc.config.api.values.CompoundConfigValue
 *  org.quiltmc.config.api.values.TrackedValue$Builder
 */
package org.quiltmc.config.impl;

import org.quiltmc.config.api.Constraint;
import org.quiltmc.config.api.annotations.ConfigFieldAnnotationProcessor;
import org.quiltmc.config.api.annotations.Matches;
import org.quiltmc.config.api.metadata.MetadataContainerBuilder;
import org.quiltmc.config.api.values.CompoundConfigValue;
import org.quiltmc.config.api.values.TrackedValue;
import org.quiltmc.config.impl.ConfigFieldAnnotationProcessors$1;

final class ConfigFieldAnnotationProcessors$MatchesProcessor
implements ConfigFieldAnnotationProcessor {
    private ConfigFieldAnnotationProcessors$MatchesProcessor() {
    }

    /* synthetic */ ConfigFieldAnnotationProcessors$MatchesProcessor(ConfigFieldAnnotationProcessors$1 configFieldAnnotationProcessors$1) {
        this();
    }

    public void process(Matches matches, MetadataContainerBuilder object) {
        if (object instanceof TrackedValue.Builder) {
            ConfigFieldAnnotationProcessors$MatchesProcessor configFieldAnnotationProcessors$MatchesProcessor = (TrackedValue.Builder)object;
            if ((object = configFieldAnnotationProcessors$MatchesProcessor.getDefaultValue()) instanceof String) {
                configFieldAnnotationProcessors$MatchesProcessor.constraint(Constraint.matching((String)matches.value()));
            } else if (object instanceof CompoundConfigValue && ((CompoundConfigValue)object).getType().equals(String.class)) {
                configFieldAnnotationProcessors$MatchesProcessor.constraint(Constraint.all((Constraint)Constraint.matching((String)matches.value())));
            }
        }
    }
}

