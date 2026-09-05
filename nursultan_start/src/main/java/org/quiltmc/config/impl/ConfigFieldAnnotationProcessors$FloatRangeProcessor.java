/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.quiltmc.config.api.Constraint
 *  org.quiltmc.config.api.annotations.ConfigFieldAnnotationProcessor
 *  org.quiltmc.config.api.annotations.FloatRange
 *  org.quiltmc.config.api.exceptions.ConfigFieldException
 *  org.quiltmc.config.api.metadata.MetadataContainerBuilder
 *  org.quiltmc.config.api.values.CompoundConfigValue
 *  org.quiltmc.config.api.values.TrackedValue$Builder
 */
package org.quiltmc.config.impl;

import org.quiltmc.config.api.Constraint;
import org.quiltmc.config.api.annotations.ConfigFieldAnnotationProcessor;
import org.quiltmc.config.api.annotations.FloatRange;
import org.quiltmc.config.api.exceptions.ConfigFieldException;
import org.quiltmc.config.api.metadata.MetadataContainerBuilder;
import org.quiltmc.config.api.values.CompoundConfigValue;
import org.quiltmc.config.api.values.TrackedValue;
import org.quiltmc.config.impl.ConfigFieldAnnotationProcessors$1;

final class ConfigFieldAnnotationProcessors$FloatRangeProcessor
implements ConfigFieldAnnotationProcessor {
    private ConfigFieldAnnotationProcessors$FloatRangeProcessor() {
    }

    /* synthetic */ ConfigFieldAnnotationProcessors$FloatRangeProcessor(ConfigFieldAnnotationProcessors$1 configFieldAnnotationProcessors$1) {
        this();
    }

    public void process(FloatRange floatRange, MetadataContainerBuilder object) {
        if (object instanceof TrackedValue.Builder) {
            ConfigFieldAnnotationProcessors$FloatRangeProcessor configFieldAnnotationProcessors$FloatRangeProcessor = (TrackedValue.Builder)object;
            if ((object = configFieldAnnotationProcessors$FloatRangeProcessor.getDefaultValue()) instanceof Float) {
                configFieldAnnotationProcessors$FloatRangeProcessor.constraint(Constraint.range((float)((float)floatRange.min()), (float)((float)floatRange.max())));
            } else if (object instanceof Double) {
                configFieldAnnotationProcessors$FloatRangeProcessor.constraint(Constraint.range((double)floatRange.min(), (double)floatRange.max()));
            } else {
                boolean bl = object instanceof CompoundConfigValue;
                if (bl && Float.class.isAssignableFrom(((CompoundConfigValue)object).getType())) {
                    configFieldAnnotationProcessors$FloatRangeProcessor.constraint(Constraint.all((Constraint)Constraint.range((float)((float)floatRange.min()), (float)((float)floatRange.max()))));
                } else if (bl && Double.class.isAssignableFrom(((CompoundConfigValue)object).getType())) {
                    configFieldAnnotationProcessors$FloatRangeProcessor.constraint(Constraint.all((Constraint)Constraint.range((double)floatRange.min(), (double)floatRange.max())));
                } else {
                    throw new ConfigFieldException("Constraint FloatRange not applicable for type '" + object.getClass() + "'");
                }
            }
        }
    }
}

