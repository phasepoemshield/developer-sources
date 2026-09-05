/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00667
 *  minecraft.class01666
 *  minecraft.class01894
 */
package de.maxhenkel.voicechat.net;

import de.maxhenkel.voicechat.net.Packet;
import minecraft.class00667;
import minecraft.class01666;
import minecraft.class01894;

public class RemoveCategoryPacket
implements Packet<RemoveCategoryPacket> {
    public static final class01666<RemoveCategoryPacket> REMOVE_CATEGORY = new class01666(class01894.N((String)"voicechat", (String)"remove_category"));
    private String categoryId;

    public RemoveCategoryPacket() {
    }

    public RemoveCategoryPacket(String string) {
        this.categoryId = string;
    }

    @Override
    public void toBytes(class00667 class006672) {
        class006672.N(this.categoryId, 16);
    }

    @Override
    public class01666<RemoveCategoryPacket> method_56479() {
        return REMOVE_CATEGORY;
    }

    @Override
    public RemoveCategoryPacket fromBytes(class00667 class006672) {
        this.categoryId = class006672.u(16);
        return this;
    }

    public String getCategoryId() {
        return this.categoryId;
    }
}

