/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.Voicechat
 *  me.drex.vanish.api.VanishAPI
 *  me.drex.vanish.api.VanishEvents
 *  minecraft.class04770
 */
package de.maxhenkel.voicechat.integration.vanish;

import de.maxhenkel.voicechat.Voicechat;
import de.maxhenkel.voicechat.intercompatibility.CommonCompatibilityManager;
import java.util.function.BiConsumer;
import me.drex.vanish.api.VanishAPI;
import me.drex.vanish.api.VanishEvents;
import minecraft.class04770;

public class VanishIntegration {
    private static Boolean loaded;

    public static void init() {
        if (!VanishIntegration.isLoaded()) {
            return;
        }
        try {
            VanishEvents.VANISH_EVENT.register((class047702, bl) -> {
                for (class04770 class047703 : class047702.method_51469().method_8503().Nm().v()) {
                    if (bl) {
                        if (CommonCompatibilityManager.INSTANCE.canSee(class047703, class047702)) continue;
                        ((BiConsumer)de.maxhenkel.voicechat.events.VanishEvents.ON_VANISH.invoker()).accept(class047702, class047703);
                        continue;
                    }
                    if (!CommonCompatibilityManager.INSTANCE.canSee(class047703, class047702)) continue;
                    ((BiConsumer)de.maxhenkel.voicechat.events.VanishEvents.ON_UNVANISH.invoker()).accept(class047702, class047703);
                }
            });
        }
        catch (Throwable throwable) {
            Voicechat.LOGGER.warn("Failed to use vanish compatibility", new Object[]{throwable});
            loaded = false;
        }
    }

    public static boolean isLoaded() {
        if (loaded == null) {
            loaded = VanishIntegration.checkLoaded();
        }
        return loaded;
    }

    private static boolean checkLoaded() {
        if (CommonCompatibilityManager.INSTANCE.isModLoaded("melius-vanish") || CommonCompatibilityManager.INSTANCE.isModLoaded("vanish")) {
            try {
                Class.forName("me.drex.vanish.api.VanishAPI");
                Voicechat.LOGGER.info("Enabling vanish compatibility", new Object[0]);
                return true;
            }
            catch (Throwable throwable) {
                Voicechat.LOGGER.warn("Failed to load vanish compatibility", new Object[]{throwable});
            }
        }
        return false;
    }

    public static boolean canSee(class04770 class047702, class04770 class047703) {
        if (VanishIntegration.isLoaded()) {
            try {
                return VanishAPI.canSeePlayer((class04770)class047703, (class04770)class047702);
            }
            catch (Throwable throwable) {
                Voicechat.LOGGER.warn("Failed to use vanish compatibility", new Object[]{throwable});
                loaded = false;
            }
        }
        return true;
    }
}

