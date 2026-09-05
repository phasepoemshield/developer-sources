/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.ModInitializer
 *  net.fabricmc.fabric.api.attachment.v1.AttachmentTarget
 *  net.fabricmc.fabric.api.entity.event.v1.ServerEntityWorldChangeEvents
 *  net.fabricmc.fabric.api.entity.event.v1.ServerLivingEntityEvents
 *  net.fabricmc.fabric.api.entity.event.v1.ServerPlayerEvents
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package net.fabricmc.fabric.impl.attachment;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.attachment.v1.AttachmentTarget;
import net.fabricmc.fabric.api.entity.event.v1.ServerEntityWorldChangeEvents;
import net.fabricmc.fabric.api.entity.event.v1.ServerLivingEntityEvents;
import net.fabricmc.fabric.api.entity.event.v1.ServerPlayerEvents;
import net.fabricmc.fabric.impl.attachment.AttachmentTargetImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AttachmentEntrypoint
implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger((String)"fabric-data-attachment-api-v1");

    public void onInitialize() {
        ServerPlayerEvents.AFTER_RESPAWN.register((class047702, class047703, bl) -> AttachmentTargetImpl.transfer((AttachmentTarget)class047702, (AttachmentTarget)class047703, !bl));
        ServerEntityWorldChangeEvents.AFTER_ENTITY_CHANGE_WORLD.register((class070492, class070493, class047822, class047823) -> AttachmentTargetImpl.transfer((AttachmentTarget)class070492, (AttachmentTarget)class070493, false));
        ServerLivingEntityEvents.MOB_CONVERSION.register((class070792, class070793, class082342) -> AttachmentTargetImpl.transfer((AttachmentTarget)class070792, (AttachmentTarget)class070793, true));
    }
}

