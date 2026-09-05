/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.quiltmc.config.api.ReflectiveConfig$Section
 *  org.quiltmc.config.api.annotations.Comment
 *  org.quiltmc.config.api.annotations.IntegerRange
 *  org.quiltmc.config.api.values.TrackedValue
 */
package page.langeweile.ok_zoomer.config;

import org.quiltmc.config.api.ReflectiveConfig;
import org.quiltmc.config.api.annotations.Comment;
import org.quiltmc.config.api.annotations.IntegerRange;
import org.quiltmc.config.api.values.TrackedValue;
import page.langeweile.ok_zoomer.config.ConfigEnums$ZoomTransitionModes;
import page.langeweile.ok_zoomer.config.metadata.RangeSubset;
import page.langeweile.ok_zoomer.config.metadata.WidgetSize;
import page.langeweile.ok_zoomer.config.metadata.WidgetSize$Size;

public final class OkZoomerConfig$ZoomScrollingConfig
extends ReflectiveConfig.Section {
    @WidgetSize(value=WidgetSize$Size.HALF)
    @Comment(value={"Allows to increase or decrease the zoom by scrolling with the mouse wheel."})
    public final TrackedValue<Boolean> zoomScrolling = this.value(true);
    @WidgetSize(value=WidgetSize$Size.HALF)
    @Comment(value={"Allows for resetting the zoom with the middle mouse button."})
    public final TrackedValue<Boolean> resetZoomWithMouse = this.value(true);
    @WidgetSize(value=WidgetSize$Size.HALF)
    @Comment(value={"Adds sound effects on zoom scrolling."})
    public final TrackedValue<Boolean> scrollSounds = this.value(false);
    @WidgetSize(value=WidgetSize$Size.HALF)
    @Comment(value={"If enabled, the current scroll step is forgotten once zooming is finished."})
    public final TrackedValue<Boolean> forgetScrollStep = this.value(true);
    @WidgetSize(value=WidgetSize$Size.HALF)
    @Comment(value={"\"INSTANT\": The zoom will abruptly transition between each increment.\n\"LINEAR\": The zoom will linearly transition between each increment.\n\"SMOOTH\": The zoom will smoothly transition between each increment using the game's smooth curve.\n\"SINE\": The zoom will smoothly transition between each increment using a sine curve.\n\"BALANCED\": The zoom will smoothly transition between each increment using cubic interpolation, balancing between linearity and smoothness.\n\"SPRING\": The zoom will bouncily transition between each increment. Avoid using it too often!\n"})
    public final TrackedValue<ConfigEnums$ZoomTransitionModes> transition = this.value(ConfigEnums$ZoomTransitionModes.SMOOTH);
    @WidgetSize(value=WidgetSize$Size.HALF)
    @Comment(value={"Controls how long should the transition last for. 20 ticks is equal to 1 second."})
    @IntegerRange(min=0L, max=0x7FFFFFFFL)
    @RangeSubset(min=0, max=100)
    public final TrackedValue<Integer> transitionTicks = this.value(8);
    @WidgetSize(value=WidgetSize$Size.HALF)
    @Comment(value={"Determines the number to be used on the exponential curve. If unsure, keep this value at 2."})
    @IntegerRange(min=2L, max=0x7FFFFFFFL)
    @RangeSubset(min=2, max=10)
    public final TrackedValue<Integer> scrollBase = this.value(2);
    @WidgetSize(value=WidgetSize$Size.HALF)
    @Comment(value={"Determines the resolution of zoom scrolling. This will effectively multiply the amount of scroll steps."})
    @IntegerRange(min=1L, max=0x7FFFFFFFL)
    @RangeSubset(min=1, max=20)
    public final TrackedValue<Integer> scrollResolution = this.value(5);
    @WidgetSize(value=WidgetSize$Size.HALF)
    @Comment(value={"The default scroll step to use on zooming in."})
    @IntegerRange(min=0L, max=0x7FFFFFFFL)
    @RangeSubset(min=0, max=100)
    public final TrackedValue<Integer> defaultScrollStep = this.value(10);
    @WidgetSize(value=WidgetSize$Size.HALF)
    @Comment(value={"The maximum amount of scroll steps that the zoom may reach."})
    @IntegerRange(min=0L, max=0x7FFFFFFFL)
    @RangeSubset(min=0, max=100)
    public final TrackedValue<Integer> scrollStepLimit = this.value(30);
}

