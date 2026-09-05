/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  minecraft.class00392
 *  minecraft.class01894
 *  minecraft.class03530
 *  minecraft.class04227
 *  minecraft.class04453
 *  minecraft.class04891
 *  minecraft.class04995
 *  minecraft.class05946
 *  minecraft.class06202
 *  minecraft.class06581
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package page.langeweile.ok_zoomer.utils;

import java.util.function.Predicate;
import minecraft.class00392;
import minecraft.class01894;
import minecraft.class03530;
import minecraft.class04227;
import minecraft.class04453;
import minecraft.class04891;
import minecraft.class04995;
import minecraft.class05946;
import minecraft.class06202;
import minecraft.class06581;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import page.langeweile.ok_zoomer.config.ConfigEnums$SeeDistantEntitiesModes;
import page.langeweile.ok_zoomer.config.OkZoomerConfigManager;
import page.langeweile.ok_zoomer.utils.ModUtils;
import page.langeweile.ok_zoomer.zoom.Zoom;

public class ZoomUtils {
    public static Logger LOGGER = LoggerFactory.getLogger((String)"Ok Zoomer");
    public static final class03530<class06581> ZOOM_DEPENDENCIES_TAG = class03530.N((class05946)class04227.F, (class01894)ModUtils.id("zoom_dependencies"));
    public static final class04891 ZOOM_IN_SOUND = class04891.N((class01894)ModUtils.id("zoom.zoom_in"));
    public static final class04891 ZOOM_OUT_SOUND = class04891.N((class01894)ModUtils.id("zoom.zoom_out"));
    public static final class04891 SCROLL_SOUND = class04891.N((class01894)ModUtils.id("zoom.scroll"));
    public static int zoomStep = 0;
    private static Predicate<class04453> hasSpyglass = class044532 -> class044532.method_68878();
    private static boolean safeSmartOcclusion = false;
    private static Float fadeModifier = null;

    public static void enableSafeSmartOcclusion() {
        safeSmartOcclusion = true;
    }

    public static void keepZoomStepsWithinBounds() {
        zoomStep = class04995.N((int)zoomStep, (int)0, (int)((Integer)OkZoomerConfigManager.CONFIG.zoomScrolling.scrollStepLimit.value()));
    }

    public static void addSpyglassProvider(Predicate<class04453> predicate) {
        hasSpyglass = hasSpyglass.or(predicate);
    }

    public static boolean canSeeDistantEntities() {
        return switch ((ConfigEnums$SeeDistantEntitiesModes)OkZoomerConfigManager.CONFIG.appearance.seeDistantEntities.value()) {
            default -> throw new MatchException(null, null);
            case ConfigEnums$SeeDistantEntitiesModes.SAFE -> safeSmartOcclusion;
            case ConfigEnums$SeeDistantEntitiesModes.ON -> true;
            case ConfigEnums$SeeDistantEntitiesModes.OFF -> false;
        };
    }

    public static Float getFadeModifier() {
        return fadeModifier;
    }

    public static void setFadeModifier(Float f) {
        fadeModifier = f;
    }

    public static boolean hasSpyglass(class04453 class044532) {
        return hasSpyglass.test(class044532);
    }

    public static void resetZoomDivisor(boolean bl) {
        if (!bl && !((Boolean)OkZoomerConfigManager.CONFIG.zoomScrolling.forgetScrollStep.value()).booleanValue()) {
            return;
        }
        int n = (Integer)OkZoomerConfigManager.CONFIG.zoomScrolling.scrollBase.value();
        int n2 = (Integer)OkZoomerConfigManager.CONFIG.zoomScrolling.scrollResolution.value();
        zoomStep = (Integer)OkZoomerConfigManager.CONFIG.zoomScrolling.defaultScrollStep.value();
        Zoom.setZoomDivisor(Math.pow(n, (double)zoomStep / (double)n2));
    }

    public static void changeZoomDivisor(boolean bl) {
        class06202 class062022 = class06202.Nq();
        int n = (Integer)OkZoomerConfigManager.CONFIG.zoomScrolling.scrollBase.value();
        int n2 = (Integer)OkZoomerConfigManager.CONFIG.zoomScrolling.scrollResolution.value();
        int n3 = (Integer)OkZoomerConfigManager.CONFIG.zoomScrolling.scrollStepLimit.value();
        int n4 = 0;
        int n5 = zoomStep;
        zoomStep = bl ? Math.min(zoomStep + 1, n3) : Math.max(zoomStep - 1, -n4);
        double d = 1.0;
        if (zoomStep != 0) {
            d = Math.pow(n, (double)zoomStep / (double)n2);
            Zoom.setZoomDivisor(d);
        } else {
            Zoom.setZoomDivisor(1.0);
        }
        if (n5 != zoomStep && ((Boolean)OkZoomerConfigManager.CONFIG.zoomScrolling.scrollSounds.value()).booleanValue()) {
            ((class04453)class062022.T_4).method_5783(SCROLL_SOUND, 1.0f, 1.0f);
        }
        if (((Boolean)OkZoomerConfigManager.CONFIG.tweaks.debugScrolling.value()).booleanValue()) {
            ((class04453)class062022.T_4).method_7353((class00392)class00392.y((String)(zoomStep + " - " + d)), true);
        }
    }

    public static boolean hasSmartOcclusion() {
        return (Boolean)OkZoomerConfigManager.CONFIG.appearance.smartOcclusion.value() != false && safeSmartOcclusion;
    }
}

