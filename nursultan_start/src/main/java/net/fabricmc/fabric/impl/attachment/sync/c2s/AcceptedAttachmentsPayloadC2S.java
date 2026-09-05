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
package net.fabricmc.fabric.impl.attachment.sync.c2s;

import java.util.HashSet;
import java.util.Set;
import minecraft.class00667;
import minecraft.class01659;
import minecraft.class01666;
import minecraft.class01894;
import minecraft.class02362;
import minecraft.class02389;

public record AcceptedAttachmentsPayloadC2S(Set<class01894> acceptedAttachments) implements class01659
{
    public static final class02362<class00667, AcceptedAttachmentsPayloadC2S> CODEC = class02362.N((class02362)class02389.N(HashSet::new, (class02362)class01894.y), AcceptedAttachmentsPayloadC2S::acceptedAttachments, AcceptedAttachmentsPayloadC2S::new);
    public static final class01894 PACKET_ID = class01894.N((String)"fabric", (String)"accepted_attachments_v1");
    public static final class01666<AcceptedAttachmentsPayloadC2S> ID = new class01666(PACKET_ID);

    public class01666<? extends class01659> method_56479() {
        return ID;
    }
}

