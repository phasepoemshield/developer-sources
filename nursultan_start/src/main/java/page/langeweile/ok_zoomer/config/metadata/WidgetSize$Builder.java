/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.quiltmc.config.api.metadata.MetadataType$Builder
 */
package page.langeweile.ok_zoomer.config.metadata;

import org.quiltmc.config.api.metadata.MetadataType;
import page.langeweile.ok_zoomer.config.metadata.WidgetSize$Size;

public final class WidgetSize$Builder
implements MetadataType.Builder<WidgetSize$Size> {
    private WidgetSize$Size size = WidgetSize$Size.FULL;

    public void set(WidgetSize$Size widgetSize$Size) {
        this.size = widgetSize$Size;
    }

    public WidgetSize$Size build() {
        return this.size;
    }
}

