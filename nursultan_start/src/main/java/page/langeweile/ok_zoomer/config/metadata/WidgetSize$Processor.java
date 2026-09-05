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
import page.langeweile.ok_zoomer.config.metadata.WidgetSize;

public final class WidgetSize$Processor
implements ConfigFieldAnnotationProcessor<WidgetSize> {
    public void process(WidgetSize widgetSize, MetadataContainerBuilder<?> metadataContainerBuilder) {
        metadataContainerBuilder.metadata(WidgetSize.TYPE, widgetSize$Builder -> widgetSize$Builder.set(widgetSize.value()));
    }
}

