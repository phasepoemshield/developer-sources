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
import de.maxhenkel.voicechat.plugins.impl.VolumeCategoryImpl;
import minecraft.class00667;
import minecraft.class01666;
import minecraft.class01894;

public class AddCategoryPacket
implements Packet<AddCategoryPacket> {
    public static final class01666<AddCategoryPacket> ADD_CATEGORY = new class01666(class01894.N((String)"voicechat", (String)"add_category"));
    private VolumeCategoryImpl category;

    public VolumeCategoryImpl getCategory() {
        return this.category;
    }

    public AddCategoryPacket() {
    }

    public AddCategoryPacket(VolumeCategoryImpl volumeCategoryImpl) {
        this.category = volumeCategoryImpl;
    }

    @Override
    public void toBytes(class00667 class006672) {
        this.category.toBytes(class006672);
    }

    @Override
    public class01666<AddCategoryPacket> method_56479() {
        return ADD_CATEGORY;
    }

    @Override
    public AddCategoryPacket fromBytes(class00667 class006672) {
        this.category = VolumeCategoryImpl.fromBytes(class006672);
        return this;
    }
}

