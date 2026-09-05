/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.loader.api.entrypoint.PreLaunchEntrypoint
 *  org.quiltmc.config.api.annotations.ConfigFieldAnnotationProcessor
 */
package page.langeweile.ok_zoomer;

import net.fabricmc.loader.api.entrypoint.PreLaunchEntrypoint;
import org.quiltmc.config.api.annotations.ConfigFieldAnnotationProcessor;
import page.langeweile.ok_zoomer.config.metadata.RangeSubset;
import page.langeweile.ok_zoomer.config.metadata.RangeSubset$Processor;
import page.langeweile.ok_zoomer.config.metadata.WidgetSize;
import page.langeweile.ok_zoomer.config.metadata.WidgetSize$Processor;

public class OkZoomerPreLaunchMod
implements PreLaunchEntrypoint {
    public void onPreLaunch() {
        ConfigFieldAnnotationProcessor.register(WidgetSize.class, (ConfigFieldAnnotationProcessor)new WidgetSize$Processor());
        ConfigFieldAnnotationProcessor.register(RangeSubset.class, (ConfigFieldAnnotationProcessor)new RangeSubset$Processor());
    }
}

