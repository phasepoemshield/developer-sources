/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.quiltmc.config.api.ReflectiveConfig$Section
 *  org.quiltmc.config.api.annotations.Comment
 *  org.quiltmc.config.api.values.TrackedValue
 */
package page.langeweile.ok_zoomer.config;

import org.quiltmc.config.api.ReflectiveConfig;
import org.quiltmc.config.api.annotations.Comment;
import org.quiltmc.config.api.values.TrackedValue;
import page.langeweile.ok_zoomer.config.metadata.WidgetSize;
import page.langeweile.ok_zoomer.config.metadata.WidgetSize$Size;

public final class OkZoomerConfig$TweaksConfig
extends ReflectiveConfig.Section {
    @WidgetSize(value=WidgetSize$Size.HALF)
    @Comment(value={"a"})
    public final TrackedValue<Boolean> numericSliders = this.value(true);
    @WidgetSize(value=WidgetSize$Size.HALF)
    @Comment(value={"Adds a button to open Ok Zoomer settings next to the zoom key bind."})
    public final TrackedValue<Boolean> showSettingsOnKey = this.value(true);
    @WidgetSize(value=WidgetSize$Size.HALF)
    @Comment(value={"Displays debug information for exponential zoom scrolling. Currently it may help with configuring the zoom scrolling."})
    public final TrackedValue<Boolean> debugScrolling = this.value(false);
    @WidgetSize(value=WidgetSize$Size.HALF)
    @Comment(value={"Prints a random owo in the console when the game starts."})
    public final TrackedValue<Boolean> printOwoOnStart = this.value(true);
}

