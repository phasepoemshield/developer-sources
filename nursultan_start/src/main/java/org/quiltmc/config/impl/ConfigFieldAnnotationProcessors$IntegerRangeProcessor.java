/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.quiltmc.config.api.Constraint
 *  org.quiltmc.config.api.annotations.ConfigFieldAnnotationProcessor
 *  org.quiltmc.config.api.annotations.IntegerRange
 *  org.quiltmc.config.api.exceptions.ConfigFieldException
 *  org.quiltmc.config.api.metadata.MetadataContainerBuilder
 *  org.quiltmc.config.api.values.CompoundConfigValue
 *  org.quiltmc.config.api.values.TrackedValue$Builder
 */
package org.quiltmc.config.impl;

import org.quiltmc.config.api.Constraint;
import org.quiltmc.config.api.annotations.ConfigFieldAnnotationProcessor;
import org.quiltmc.config.api.annotations.IntegerRange;
import org.quiltmc.config.api.exceptions.ConfigFieldException;
import org.quiltmc.config.api.metadata.MetadataContainerBuilder;
import org.quiltmc.config.api.values.CompoundConfigValue;
import org.quiltmc.config.api.values.TrackedValue;
import org.quiltmc.config.impl.ConfigFieldAnnotationProcessors$1;

final class ConfigFieldAnnotationProcessors$IntegerRangeProcessor
implements ConfigFieldAnnotationProcessor {
    private ConfigFieldAnnotationProcessors$IntegerRangeProcessor() {
    }

    /* synthetic */ ConfigFieldAnnotationProcessors$IntegerRangeProcessor(ConfigFieldAnnotationProcessors$1 configFieldAnnotationProcessors$1) {
        this();
    }

    public void process(IntegerRange integerRange, MetadataContainerBuilder object) {
        if (object instanceof TrackedValue.Builder) {
            ConfigFieldAnnotationProcessors$IntegerRangeProcessor configFieldAnnotationProcessors$IntegerRangeProcessor = (TrackedValue.Builder)object;
            if ((object = configFieldAnnotationProcessors$IntegerRangeProcessor.getDefaultValue()) instanceof Integer) {
                configFieldAnnotationProcessors$IntegerRangeProcessor.constraint(Constraint.range((int)((int)integerRange.min()), (int)((int)integerRange.max())));
            } else if (object instanceof Long) {
                configFieldAnnotationProcessors$IntegerRangeProcessor.constraint(Constraint.range((long)integerRange.min(), (long)integerRange.max()));
            } else {
                boolean bl = object instanceof CompoundConfigValue;
                if (bl && Integer.class.isAssignableFrom(((CompoundConfigValue)object).getType())) {
                    configFieldAnnotationProcessors$IntegerRangeProcessor.constraint(Constraint.all((Constraint)Constraint.range((int)((int)integerRange.min()), (int)((int)integerRange.max()))));
                } else if (bl && Long.class.isAssignableFrom(((CompoundConfigValue)object).getType())) {
                    configFieldAnnotationProcessors$IntegerRangeProcessor.constraint(Constraint.all((Constraint)Constraint.range((long)integerRange.min(), (long)integerRange.max())));
                } else {
                    throw new ConfigFieldException("Constraint LongRange not applicable for type '" + object.getClass() + "'");
                }
            }
        }
    }
}

