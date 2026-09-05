/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.quiltmc.config.api.annotations.ConfigFieldAnnotationProcessor
 *  org.quiltmc.config.api.metadata.MetadataContainerBuilder
 */
package page.langeweile.ok_zoomer.config.metadata;

import org.quiltmc.config.api.annotations.ConfigFieldAnnotationProcessor;
import org.quiltmc.config.api.metadata.MetadataContainerBuilder;
import page.langeweile.ok_zoomer.config.metadata.RangeSubset;

public final class RangeSubset$Processor
implements ConfigFieldAnnotationProcessor<RangeSubset> {
    public void process(RangeSubset rangeSubset, MetadataContainerBuilder<?> metadataContainerBuilder) {
        metadataContainerBuilder.metadata(RangeSubset.TYPE, rangeSubset$Builder -> rangeSubset$Builder.set(rangeSubset.min(), rangeSubset.max()));
    }
}

