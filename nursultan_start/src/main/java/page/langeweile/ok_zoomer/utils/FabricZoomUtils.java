/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06584
 *  net.fabricmc.fabric.api.tag.client.v1.ClientTags
 *  net.fabricmc.loader.api.FabricLoader
 */
package page.langeweile.ok_zoomer.utils;

import java.util.function.Predicate;
import minecraft.class06584;
import net.fabricmc.fabric.api.tag.client.v1.ClientTags;
import net.fabricmc.loader.api.FabricLoader;
import page.langeweile.ok_zoomer.utils.ZoomUtils;

public class FabricZoomUtils {
    public static final Predicate<class06584> IS_VALID_SPYGLASS = class065842 -> ClientTags.isInWithLocalFallback(ZoomUtils.ZOOM_DEPENDENCIES_TAG, (Object)class065842.B());
    private static boolean openCommandScreen = false;

    public static void setOpenCommandScreen(boolean bl) {
        openCommandScreen = bl;
    }

    public static boolean shouldOpenCommandScreen() {
        return openCommandScreen;
    }

    public static void addInitialPredicates() {
        ZoomUtils.addSpyglassProvider(class044532 -> class044532.method_31548().y(IS_VALID_SPYGLASS));
    }

    public static void defineSafeSmartOcclusion() {
        if (FabricLoader.getInstance().isModLoaded("sodium")) {
            ZoomUtils.enableSafeSmartOcclusion();
        }
    }
}

