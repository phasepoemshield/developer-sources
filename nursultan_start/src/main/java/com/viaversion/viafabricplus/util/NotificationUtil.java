/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.ViaFabricPlusImpl
 *  org.apache.logging.log4j.Logger
 */
package com.viaversion.viafabricplus.util;

import com.viaversion.viafabricplus.ViaFabricPlusImpl;
import org.apache.logging.log4j.Logger;

public final class NotificationUtil {
    public static void warnIncompatibilityPacket(String string, String string2, String string3, String string4) {
        Logger logger = ViaFabricPlusImpl.INSTANCE.getLogger();
        logger.error("===========================================");
        logger.error("The {} packet (>= {}) could not be remapped without breaking content!", (Object)string2, (Object)string);
        logger.error("Try disabling mods one by one or using a binary search method to identify the problematic mod.");
        if (string3 != null && string4 != null) {
            logger.error("Mods authors should use {} (Yarn) or {} (Mojmap) instead of sending packets directly.", (Object)string3, (Object)string4);
        } else {
            logger.error("Mod authors should not send this packet directly.");
        }
        logger.error("Need help? Join our Discord: https://discord.gg/viaversion");
        logger.error("===========================================");
    }
}

