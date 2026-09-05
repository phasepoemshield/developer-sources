/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.quiltmc.config.api.ReflectiveConfig
 *  org.quiltmc.config.api.annotations.Comment
 *  org.quiltmc.config.api.annotations.SerializedNameConvention
 *  org.quiltmc.config.api.metadata.NamingSchemes
 */
package page.langeweile.ok_zoomer.config;

import org.quiltmc.config.api.ReflectiveConfig;
import org.quiltmc.config.api.annotations.Comment;
import org.quiltmc.config.api.annotations.SerializedNameConvention;
import org.quiltmc.config.api.metadata.NamingSchemes;
import page.langeweile.ok_zoomer.config.OkZoomerConfig$AppearanceConfig;
import page.langeweile.ok_zoomer.config.OkZoomerConfig$ControlsConfig;
import page.langeweile.ok_zoomer.config.OkZoomerConfig$TweaksConfig;
import page.langeweile.ok_zoomer.config.OkZoomerConfig$ZoomScrollingConfig;
import page.langeweile.ok_zoomer.config.OkZoomerConfig$ZoomTransitionConfig;

@SerializedNameConvention(value=NamingSchemes.SNAKE_CASE)
public class OkZoomerConfig
extends ReflectiveConfig {
    @Comment(value={"Options affecting the transitions between zooming in and zooming out."})
    public final OkZoomerConfig$ZoomTransitionConfig zoomTransition = new OkZoomerConfig$ZoomTransitionConfig();
    @Comment(value={"Options affecting the visual aspects of zooming."})
    public final OkZoomerConfig$AppearanceConfig appearance = new OkZoomerConfig$AppearanceConfig();
    @Comment(value={"Options affecting the way zooming is controlled."})
    public final OkZoomerConfig$ControlsConfig controls = new OkZoomerConfig$ControlsConfig();
    @Comment(value={"Options affecting the Zoom Scrolling feature."})
    public final OkZoomerConfig$ZoomScrollingConfig zoomScrolling = new OkZoomerConfig$ZoomScrollingConfig();
    @Comment(value={"Technical options that don't fit elsewhere."})
    public final OkZoomerConfig$TweaksConfig tweaks = new OkZoomerConfig$TweaksConfig();
}

