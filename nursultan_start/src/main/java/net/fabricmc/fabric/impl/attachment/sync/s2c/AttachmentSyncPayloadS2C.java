/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00667
 *  minecraft.class01659
 *  minecraft.class01666
 *  minecraft.class01894
 *  minecraft.class02362
 *  minecraft.class02389
 */
package net.fabricmc.fabric.impl.attachment.sync.s2c;

import java.util.List;
import minecraft.class00667;
import minecraft.class01659;
import minecraft.class01666;
import minecraft.class01894;
import minecraft.class02362;
import minecraft.class02389;
import net.fabricmc.fabric.impl.attachment.sync.AttachmentChange;

public record AttachmentSyncPayloadS2C(List<AttachmentChange> attachments) implements class01659
{
    public static final class02362<class00667, AttachmentSyncPayloadS2C> CODEC = class02362.N((class02362)AttachmentChange.PACKET_CODEC.N_33(class02389.N()), AttachmentSyncPayloadS2C::attachments, AttachmentSyncPayloadS2C::new);
    public static final class01894 PACKET_ID = class01894.N((String)"fabric", (String)"attachment_sync_v1");
    public static final class01666<AttachmentSyncPayloadS2C> ID = new class01666(PACKET_ID);

    public class01666<? extends class01659> method_56479() {
        return ID;
    }
}

