/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.floats.FloatUnaryOperator
 *  java.lang.MatchException
 *  minecraft.class01894
 *  minecraft.class04995
 *  minecraft.class08173
 */
package page.langeweile.ok_zoomer.config;

import it.unimi.dsi.fastutil.floats.FloatUnaryOperator;
import minecraft.class01894;
import minecraft.class04995;
import minecraft.class08173;
import page.langeweile.ok_zoomer.config.ConfigEnums$ZoomOverlays;
import page.langeweile.ok_zoomer.config.ConfigEnums$ZoomTransitionModes;
import page.langeweile.ok_zoomer.config.OkZoomerConfig;
import page.langeweile.ok_zoomer.utils.ModUtils;
import page.langeweile.ok_zoomer.zoom.Zoom;
import page.langeweile.ok_zoomer.zoom.modifiers.CinematicCameraMouseModifier;
import page.langeweile.ok_zoomer.zoom.modifiers.ContainingMouseModifier;
import page.langeweile.ok_zoomer.zoom.modifiers.ZoomDivisorMouseModifier;
import page.langeweile.ok_zoomer.zoom.overlays.SpyglassZoomOverlay;
import page.langeweile.ok_zoomer.zoom.overlays.ZoomerZoomOverlay;
import page.langeweile.ok_zoomer.zoom.transitions.EasedTransitionMode;
import page.langeweile.wrench_wrapper.api.WrenchWrapper;

public class OkZoomerConfigManager {
    public static final OkZoomerConfig CONFIG = WrenchWrapper.create("ok_zoomer", "config", OkZoomerConfig.class);

    public static void init() {
        OkZoomerConfigManager.configureZoomInstance();
        CONFIG.registerCallback(config -> OkZoomerConfigManager.configureZoomInstance());
    }

    public static FloatUnaryOperator getZoomTransitionOperator(ConfigEnums$ZoomTransitionModes configEnums$ZoomTransitionModes) {
        return switch (configEnums$ZoomTransitionModes) {
            default -> throw new MatchException(null, null);
            case ConfigEnums$ZoomTransitionModes.INSTANT -> f -> 1.0f;
            case ConfigEnums$ZoomTransitionModes.LINEAR -> f -> f;
            case ConfigEnums$ZoomTransitionModes.SMOOTH -> class08173::T;
            case ConfigEnums$ZoomTransitionModes.SINE -> class08173::v;
            case ConfigEnums$ZoomTransitionModes.BALANCED -> class08173::l;
            case ConfigEnums$ZoomTransitionModes.SPRING -> f -> (float)(Math.pow(2.0, -10.0f * f) * (double)class04995.m((double)((f * 10.0f - 0.75f) * 1.5f)) + 1.0);
        };
    }

    public static int getEndTransitionTicks() {
        return OkZoomerConfigManager.CONFIG.zoomTransition.endTransition.value() != ConfigEnums$ZoomTransitionModes.INSTANT ? (Integer)OkZoomerConfigManager.CONFIG.zoomTransition.endTransitionTicks.value() : 0;
    }

    public static int getScrollTransitionTicks() {
        return OkZoomerConfigManager.CONFIG.zoomScrolling.transition.value() != ConfigEnums$ZoomTransitionModes.INSTANT ? (Integer)OkZoomerConfigManager.CONFIG.zoomScrolling.transitionTicks.value() : 0;
    }

    public static int getStartTransitionTicks() {
        return OkZoomerConfigManager.CONFIG.zoomTransition.startTransition.value() != ConfigEnums$ZoomTransitionModes.INSTANT ? (Integer)OkZoomerConfigManager.CONFIG.zoomTransition.startTransitionTicks.value() : 0;
    }

    public static void configureZoomInstance() {
        Zoom.setTransitionMode(new EasedTransitionMode(OkZoomerConfigManager.getZoomTransitionOperator((ConfigEnums$ZoomTransitionModes)OkZoomerConfigManager.CONFIG.zoomTransition.startTransition.value()), OkZoomerConfigManager.getZoomTransitionOperator((ConfigEnums$ZoomTransitionModes)OkZoomerConfigManager.CONFIG.zoomTransition.endTransition.value()), OkZoomerConfigManager.getZoomTransitionOperator((ConfigEnums$ZoomTransitionModes)OkZoomerConfigManager.CONFIG.zoomScrolling.transition.value()), OkZoomerConfigManager.getStartTransitionTicks(), OkZoomerConfigManager.getEndTransitionTicks(), OkZoomerConfigManager.getScrollTransitionTicks(), (Boolean)OkZoomerConfigManager.CONFIG.zoomTransition.invertStartTransition.value(), (Boolean)OkZoomerConfigManager.CONFIG.zoomTransition.invertEndTransition.value()));
        OkZoomerConfigManager.configureZoomModifier();
        class01894 class018942 = OkZoomerConfigManager.CONFIG.appearance.zoomOverlay.value() == ConfigEnums$ZoomOverlays.SPYGLASS ? class01894.y((String)"textures/misc/spyglass_scope.png") : ModUtils.id("textures/misc/zoom_overlay.png");
        Zoom.setZoomOverlay(switch ((ConfigEnums$ZoomOverlays)OkZoomerConfigManager.CONFIG.appearance.zoomOverlay.value()) {
            case ConfigEnums$ZoomOverlays.VIGNETTE -> new ZoomerZoomOverlay(class018942);
            case ConfigEnums$ZoomOverlays.SPYGLASS -> new SpyglassZoomOverlay(class018942);
            default -> null;
        });
    }

    public static void configureZoomModifier() {
        boolean bl = (Boolean)OkZoomerConfigManager.CONFIG.controls.cinematicCamera.value();
        boolean bl2 = (Boolean)OkZoomerConfigManager.CONFIG.controls.reduceSensitivity.value();
        if (bl) {
            CinematicCameraMouseModifier cinematicCameraMouseModifier = new CinematicCameraMouseModifier(((Float)OkZoomerConfigManager.CONFIG.controls.cinematicCameraSpeed.value()).floatValue());
            Zoom.setMouseModifier(bl2 ? new ContainingMouseModifier(cinematicCameraMouseModifier, new ZoomDivisorMouseModifier()) : cinematicCameraMouseModifier);
        } else {
            Zoom.setMouseModifier(bl2 ? new ZoomDivisorMouseModifier() : null);
        }
    }
}

