/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00667
 *  minecraft.class01659
 *  minecraft.class01666
 *  minecraft.class01894
 *  minecraft.class02362
 */
package net.fabricmc.fabric.impl.attachment.sync.s2c;

import minecraft.class00667;
import minecraft.class01659;
import minecraft.class01666;
import minecraft.class01894;
import minecraft.class02362;

public class RequestAcceptedAttachmentsPayloadS2C
implements class01659 {
    public static final RequestAcceptedAttachmentsPayloadS2C INSTANCE = new RequestAcceptedAttachmentsPayloadS2C();
    public static final class01894 PACKET_ID = class01894.N((String)"fabric", (String)"accepted_attachments_v1");
    public static final class01666<RequestAcceptedAttachmentsPayloadS2C> ID = new class01666(PACKET_ID);
    public static final class02362<class00667, RequestAcceptedAttachmentsPayloadS2C> CODEC = class02362.N((Object)INSTANCE);

    private RequestAcceptedAttachmentsPayloadS2C() {
    }

    public class01666<? extends class01659> method_56479() {
        return ID;
    }
}

