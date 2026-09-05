/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.ClientModInitializer
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package dev.caoimhe.compactchat;

import dev.caoimhe.compactchat.config.Configuration;
import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CompactChatMod
implements ClientModInitializer {
    public static Logger LOGGER = LoggerFactory.getLogger((String)"dev.caoimhe.compactchat.CompactChatMod");

    public void onInitializeClient() {
        Configuration.initialize();
    }
}

